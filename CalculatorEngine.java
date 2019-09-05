import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class CalculatorEngine implements ActionListener{
	Calculator parent; //ссыдка на окно калькул€тора
	
	char selectedAction=' ' ; // +-/*
	double currentResult=0;
	
	//конструктор сохран€ет ссылку на окно калькул€тора
	//в переменной экземпл€р класса
	
	CalculatorEngine( Calculator parent){
		this.parent = parent;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		//получить источник действи€
		JButton clickedButton= (JButton) e.getSource();
		String dispFieldText=parent.displayField.getText();
		double displayValue=0;
		
		//получить число из диспле€ калькул€тораб
		//если он не пустойб
		//восклицательный знак-это знак отрицани€
		
		if(!"".equals(dispFieldText)) {
			displayValue=Double.parseDouble(dispFieldText);
			
		}
		
		Object src=e.getSource();
		//дл€ каждой кнопки арифметического действи€
		//запомнить его/*-+ бсохранить текущее число
		//в переменной сгккуте уыгде, и очистить дисплей
		//дл€ ввода нового числа
		
		if (src==parent.buttonplus) {
			
			selectedAction='+';
			currentResult=displayValue;
			parent.displayField.setText("");
			
		}
		else if (src==parent.buttonminus) {
			selectedAction='-';
			currentResult=displayValue;
			parent.displayField.setText("");
			
		}else if(src==parent.buttondelit) {
			selectedAction='/';
			currentResult=displayValue;
			parent.displayField.setText("");
			
		}else if(src==parent.buttonymnog) {
			selectedAction='*';
			currentResult=displayValue;
			parent.displayField.setText("");
			
		}else if(src==parent.buttonEqual) {
			//совершать фрифметические действи€ в зависимости
			//от selectedAction, обновить переменную сгккуте уыгде
			//и показать результат на дисплее
			if(selectedAction=='+') {
				currentResult+=displayValue;
				
				//сконвертировать результат в строку,добвал€€ его
				//к пустой строке и покахать его
				parent.displayField.setText(""+currentResult);
			}else if(selectedAction=='-') {
				currentResult -=displayValue;
				parent.displayField.setText(""+currentResult);
			}
			else if(selectedAction=='/') {
				
				currentResult /=displayValue;
				parent.displayField.setText(""+currentResult);
				
			}else if(selectedAction=='*') {
				
				currentResult*=displayValue;
				parent.displayField.setText(""+currentResult);
				
			}
		}else {
			//дл€ всех уифровых кнопок присоединить надпись на
			//кнопке к надписи в дисплее
			
			String clickedButtonLabel=clickedButton.getText();
			parent.displayField.setText(dispFieldText +
					   clickedButtonLabel);
		}
		
	}
}