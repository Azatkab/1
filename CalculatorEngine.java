import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class CalculatorEngine implements ActionListener{
	Calculator parent; //������ �� ���� ������������
	
	char selectedAction=' ' ; // +-/*
	double currentResult=0;
	
	//����������� ��������� ������ �� ���� ������������
	//� ���������� ��������� ������
	
	CalculatorEngine( Calculator parent){
		this.parent = parent;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		//�������� �������� ��������
		JButton clickedButton= (JButton) e.getSource();
		String dispFieldText=parent.displayField.getText();
		double displayValue=0;
		
		//�������� ����� �� ������� �������������
		//���� �� �� �������
		//��������������� ����-��� ���� ���������
		
		if(!"".equals(dispFieldText)) {
			displayValue=Double.parseDouble(dispFieldText);
			
		}
		
		Object src=e.getSource();
		//��� ������ ������ ��������������� ��������
		//��������� ���/*-+ ���������� ������� �����
		//� ���������� �������������, � �������� �������
		//��� ����� ������ �����
		
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
			//��������� �������������� �������� � �����������
			//�� selectedAction, �������� ���������� �������������
			//� �������� ��������� �� �������
			if(selectedAction=='+') {
				currentResult+=displayValue;
				
				//��������������� ��������� � ������,�������� ���
				//� ������ ������ � �������� ���
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
			//��� ���� �������� ������ ������������ ������� ��
			//������ � ������� � �������
			
			String clickedButtonLabel=clickedButton.getText();
			parent.displayField.setText(dispFieldText +
					   clickedButtonLabel);
		}
		
	}
}