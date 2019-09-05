import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {
	// ќбъ€вл€ем и инициализируем компоненты окна


	  JButton button0=new JButton("0");
	  JButton button1=new JButton("1");
	  JButton button2=new JButton("2");
	  JButton button3=new JButton("3");
	  JButton button4=new JButton("4");
	  JButton button5=new JButton("5");
	  JButton button6=new JButton("6");
	  JButton button7=new JButton("7");
	  JButton button8=new JButton("8");
	  JButton button9=new JButton("9"); 
	  
	  JButton buttonPoint=new JButton(".");
	  JButton buttonEqual=new JButton("=");
	  
	  JButton buttonplus=new JButton("+");
	  JButton buttonminus=new JButton("-");
	  JButton buttondelit=new JButton("/");
	  JButton buttonymnog=new JButton("*");
	  
	  JPanel windowContent = new JPanel();
	  JTextField displayField = new JTextField(30);
	  //конструктор
	  
	  Calculator(){
		  
	 //установить менеджер расположени€ дл€ панели
		  BorderLayout bl=new BorderLayout();
		  windowContent.setLayout(bl);
		  
		  //добавл€ем дисплей в верхней части окна
		  windowContent.add("North", displayField);
	  
	  //создаем панель GridLayout
	  //котора€ содержит 12 кнопок -10 кнопок с чилами
	  //и кнопки с точкой  знаком равно
	  
	  JPanel p1=new JPanel();
	  GridLayout g1=new GridLayout(4,3);
	  p1.setLayout(g1);
	  
	  //дoбавл€ем кнопки на панель p1
	  
	
	
	  p1.add(button1);
	  p1.add(button2);
	  p1.add(button3);
	  p1.add(button4);
	  p1.add(button5);
	  p1.add(button6);
	  p1.add(button7);
	  p1.add(button8);
	  p1.add(button9);
	  p1.add(button0);
	  
	  p1.add(buttonPoint);
	  p1.add(buttonEqual);
	  
	  //помещаем панель р1 в центральную область окна
	  windowContent.add("Center",p1);
	  
	  //создаем паенель GridLayout
	  //котора€ содедит 4 кнопки /*-+
	  
	  JPanel p2=new JPanel();
	  GridLayout g2=new GridLayout(4,1);
	  p2.setLayout(g2);
	  
	  //добавл€ем кнопки на панель р2
	  p2.add(buttonplus);
	  p2.add(buttonminus);
	  p2.add(buttondelit);
	  p2.add(buttonymnog);
	  
	  //помещаем р2 в восточную часть окна
	  windowContent.add("East", p2);
	  
	  
	  
	  //создаем фрейм и задаем его осноную панель 
	  JFrame frame=new JFrame("Calculator");
	  frame.setContentPane(windowContent);
	  
	  //делаем размер окна достаточным
	  //дл€ того, чтобы вместить все компоненты
	  frame.pack();
	  
	  //отображаем окно
	  frame.setVisible(true);
	  
	  //выводим сообщение при нажатии на кнопкпи 
	  
	  CalculatorEngine calcEngine=new CalculatorEngine(this);
	  button0.addActionListener(calcEngine);
	  button1.addActionListener(calcEngine);
	  button2.addActionListener(calcEngine);
	  button3.addActionListener(calcEngine);
	  button4.addActionListener(calcEngine);
	  button5.addActionListener(calcEngine);
	  button6.addActionListener(calcEngine);
	  button7.addActionListener(calcEngine);
	  button8.addActionListener(calcEngine);
	  button9.addActionListener(calcEngine);
	  buttonPoint.addActionListener(calcEngine);
	  buttonEqual.addActionListener(calcEngine);
	  buttonplus.addActionListener(calcEngine);
	  buttonminus.addActionListener(calcEngine);
	  buttondelit.addActionListener(calcEngine);
	  buttonymnog.addActionListener(calcEngine);
	
}

	public static void main(String[] args) {
		
		Calculator calc=new Calculator();
		
	}
}
	


