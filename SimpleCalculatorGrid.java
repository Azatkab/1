import javax.swing.*;
import java.awt.GridLayout;


public class SimpleCalculatorGrid {

	public static void main(String[] args) {
		//создаем панель
		JPanel windowContent =new JPanel();
		
		
		//задаем менеджер расположения для этой панели
		
		GridLayout gl = new GridLayout (4,2);
		windowContent.setLayout(gl);
		
		//создаем компоненты в памяти
		
		JLabel label1=new JLabel("Number1:");
		JTextField field1=new JTextField(10);
		JLabel label2=new JLabel("Number2:");
		JTextField field2=new JTextField(10);
		JLabel label3=new JLabel("Sum:");
		JTextField result=new JTextField(10);
		JButton go=new JButton("Add");
		
		//Добавляем компоненты в панель
		
		windowContent.add(label1);
		windowContent.add(field1);
		windowContent.add(label2);
		windowContent.add(field2);
		windowContent.add(label3);
		windowContent.add(result);
		windowContent.add(go);
		
		
		//создаем фрейм и задаем панель для него
		
		JFrame frame=new JFrame("My First Calculator");
		
		frame.setContentPane(windowContent);
		
		//задаем размер и отображаем окно
		
		frame.setSize(400,100);
		frame.setVisible(true);

	}

}
