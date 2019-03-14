import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
1. enter a number in the text field
either it being the number of money entering or the quantity reset amount
2. Select the product you would like to buy or update
3. select Buy or Set Quantity
4. click Empty register to see how much was collected and empty register
This is the driver or in this case you.
 */
public class driver{


	public static void main(String[] args){
		
		VendingMachine vend=new VendingMachine();
		JFrame frame=new JFrame();
		frame.setLayout(new BorderLayout());
		frame.setSize(800,1000);
		frame.setTitle("Vending Mahcine");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		JPanel panel1=new JPanel();
		
		JRadioButton button1= new JRadioButton("Coke $1.50");
		JRadioButton button2= new JRadioButton("Chips $1");
		JRadioButton button3= new JRadioButton("Pepsi $2");
		JRadioButton button4= new JRadioButton("Cookie $.75");
		JRadioButton button5= new JRadioButton("Water $5");
		
		JPanel sPanel=new JPanel();
		JTextField in=new JTextField(15);


		JLabel top=new JLabel("Enter your money and select a Product");
		sPanel.add(top);
		sPanel.add(in);
		JButton go=new JButton("Buy");
		sPanel.add(go);
		JLabel out=new JLabel();		
		sPanel.add(out);
		frame.add(sPanel, BorderLayout.NORTH);		
		
		JButton set=new JButton("Set Quantity");
		JLabel instruc=new JLabel("1.Select the product to update 	2.enter new quantity in text field 		3.press button");
		JButton empReg=new JButton("Empty Register");
		
		JPanel mPanel=new JPanel();
		mPanel.add(instruc);
		mPanel.add(set);
		mPanel.add(empReg);
		frame.add(mPanel, BorderLayout.SOUTH);

		

		panel1.setLayout(new GridLayout(5,1));
		ButtonGroup group=new ButtonGroup();
		group.add(button1);
		group.add(button2);
		group.add(button3);
		group.add(button4);
		group.add(button5);
		
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		panel1.add(button5);


		class click implements ActionListener
		{
		double pay=0;
			public void actionPerformed(ActionEvent event){

				int position=0;
				if(button1.isSelected()){
					position=0;
					
					
				}
				else if(button2.isSelected()){
					position=1;
				}
				else if(button3.isSelected()){
					position=2;
				}
				else if(button4.isSelected()){
					position=3;
				}
				else if(button5.isSelected()){
					position=4;
				}
				
				Products curr=vend.getProduct(position);

				
						pay=Double.parseDouble(in.getText());
						if(curr.getCost()>pay){
							out.setText("Not enough money. Here's your money: "+pay);
						}
						else if(curr.getQuantity()==0){
							out.setText("Out of "+curr.getName()+". Here's your money: "+pay);
							}
						else if(curr.getCost()<=pay){
						curr.reduceQuantity();
						vend.addMoney(pay);
						out.setText("Here's your product: "+curr.getName());
						}
						else{
							out.setText("Please enter your money and select a product");
						}
		}
		}
		
		click e=new click();
		go.addActionListener(e);

		

		class click2 implements ActionListener
		{
			public void actionPerformed(ActionEvent event){
				int pro;
				int position=0;
				if(button1.isSelected()){
					position=0;
					
					
				}
				else if(button2.isSelected()){
					position=1;
				}
				else if(button3.isSelected()){
					position=2;
				}
				else if(button4.isSelected()){
					position=3;
				}
				else if(button5.isSelected()){
					position=4;
				}
				
				Products curr=vend.getProduct(position);

				
				pro=Integer.parseInt(in.getText());
				
				curr.setQuantity(pro);
				out.setText(curr.getName()+ " has a new quantity of "+ curr.getQuantity());
					
				
			}
		
		}
		click2 w=new click2();
		set.addActionListener(w);
		frame.add(panel1,BorderLayout.EAST);
		frame.setVisible(true);
	
		class click3 implements ActionListener
		{
			public void actionPerformed(ActionEvent event){
				out.setText("A total of "+vend.getMoney()+" has been collected");
				vend.resetReg();
			}
			
}
		click3 q=new click3();
		empReg.addActionListener(q);
	}
	}