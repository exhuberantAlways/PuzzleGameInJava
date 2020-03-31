import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.plaf.FontUIResource;
class MyGame implements ActionListener
{
	
	JFrame fr;
	JPanel pa;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,reset;
	Icon ic,im,i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
	Icon i21,i22,i23,i24,i25,i26,i27,i28,i29,i20;
	Icon i31,i32,i33,i34,i35,i36,i37,i38,i39,i30;
	JLabel l,l1,l2;
	Font fo,f1;
	

	public MyGame()
	{
		fr=new JFrame();
		fr.setTitle("MyPuzzle");
		fr.setSize(1174,847);
			

		ic=new ImageIcon("");
		im=new ImageIcon("");
		i1=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\oswaldE1.jpg");
		i2=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\oswaldE2.jpg");
		i3=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\oswaldE3.jpg");
		i4=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\oswaldE4.jpg");
		i5=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\oswaldE5.jpg");
		i6=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\oswaldE6.jpg");
		i7=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\oswaldE7.jpg");
		i8=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\oswaldE8.jpg");
		i9=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\oswaldE9.jpg");
		i10=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\oswaldE.jpg");
		
		i21=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\noddyE1.jpg");
		i22=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\noddyE2.jpg");
		i23=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\noddyE3.jpg");
		i24=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\noddyE4.jpg");
		i25=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\noddyE5.jpg");
		i26=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\noddyE6.jpg");
		i27=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\noddyE7.jpg");
		i28=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\noddyE8.jpg");
		i29=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\noddyE9.jpg");
		i20=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\noddyE.jpg");
		
		i31=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\sceneE1.jpg");
		i32=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\sceneE2.jpg");
		i33=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\sceneE3.jpg");
		i34=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\sceneE4.jpg");
		i35=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\sceneE5.jpg");
		i36=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\sceneE6.jpg");
		i37=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\sceneE7.jpg");
		i38=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\sceneE8.jpg");
		i39=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\sceneE9.jpg");
		i30=new ImageIcon("C:\\Users\\hp\\Desktop\\MyJavaPuzzle_game\\Images\\sceneE.jpg");
		


		
		b1=new JButton(i1);
		b2=new JButton(i2);
		b3=new JButton(i3);
		b4=new JButton(i4);
		b5=new JButton(i5);
		b6=new JButton(i6);
		b7=new JButton(i7);
		b8=new JButton(i8);
		b9=new JButton(i9);
		b10=new JButton(i10);
		reset=new JButton("RESET");
		reset.setForeground(Color.red);
		

		fo=new Font("ALGERIAN",Font.ITALIC,26);
		l1=new JLabel("Original Picture");
		l1.setFont(fo);
		l1.setBounds(647,500,247,100);
		l1.setForeground(Color.red);
		
		f1=new Font("ALGERIAN",Font.ITALIC,24);
		l2=new JLabel("Please Click on the Original Picture to move to the next puzzle");
		l2.setFont(f1);
		l2.setBounds(47,647,947,100);
		l2.setForeground(Color.blue);


		b1.setBounds(10,50,170,154);
		b2.setBounds(180,50,170,154);
		b3.setBounds(350,50,170,154);
		b4.setBounds(10,204,170,154);
		b5.setBounds(180,204,170,154);
		b6.setBounds(350,204,170,154);
		b7.setBounds(10,358,170,154);
		b8.setBounds(180,358,170,154);
		b9.setBounds(350,358,170,154);
		b10.setBounds(547,50,510,462);
		reset.setBounds(174,525,147,50);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		reset.addActionListener(this);

		
		pa=new JPanel();
		fr.add(pa);
		pa.setBackground(Color.yellow);

		pa.add(b1);
		pa.add(b2);
		pa.add(b3);
		pa.add(b4);
		pa.add(b5);
		pa.add(b6);
		pa.add(b7);
		pa.add(b8);
		pa.add(b9);
		pa.add(b10);
		pa.add(l1);
		pa.add(l2);		
		pa.add(reset);

		pa.setLayout(null);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(2);

		fr.setLocationRelativeTo(null);
		fr.setResizable(false);

	}
		public void actionPerformed(ActionEvent evt)
		{
			if(evt.getSource()==b1)
			{
				ic=b1.getIcon();
				im=b2.getIcon();
				b2.setIcon(ic);
				b1.setIcon(im);
			}
			if(evt.getSource()==b2)
			{
				ic=b2.getIcon();
				im=b3.getIcon();
				b3.setIcon(ic);
				b2.setIcon(im);
			}
			if(evt.getSource()==b3)
			{
				ic=b3.getIcon();
				im=b4.getIcon();
				b3.setIcon(im);
				b4.setIcon(ic);
			}
			if(evt.getSource()==b4)
			{
				ic=b4.getIcon();
				im=b5.getIcon();
				b4.setIcon(im);
				b5.setIcon(ic);
			}
			if(evt.getSource()==b5)
			{
				ic=b5.getIcon();
				im=b6.getIcon();
				b5.setIcon(im);
				b6.setIcon(ic);
			}
			if(evt.getSource()==b6)
			{
				ic=b6.getIcon();
				im=b7.getIcon();
				b6.setIcon(im);
				b7.setIcon(ic);
			}
			if(evt.getSource()==b7)
			{
				ic=b7.getIcon();
				im=b8.getIcon();
				b7.setIcon(im);
				b8.setIcon(ic);
			}
			if(evt.getSource()==b8)
			{
				ic=b8.getIcon();
				im=b9.getIcon();
				b8.setIcon(im);
				b9.setIcon(ic);
			}
			if(evt.getSource()==b9)
			{
				ic=b9.getIcon();
				im=b1.getIcon();
				b9.setIcon(im);
				b1.setIcon(ic);
			}
			
			if(b1.getIcon()==i1&&b2.getIcon()==i7&&b3.getIcon()==i4&&b4.getIcon()==i2&&b5.getIcon()==i8&&b6.getIcon()==i5&&
			b7.getIcon()==i3&&b8.getIcon()==i9&&b9.getIcon()==i6)
			{
			  l=new JLabel("Congratulations ,You won!!....:-)");
					  UIManager.put("OptionPane.minimumSize",new Dimension(347,147)); 
		        	  l.setFont(new Font("Serif", Font.ITALIC, 32));
		        	  JPanel pane=new JPanel();
		        	  pane.add(l);
		        	  UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("ARIAL",Font.PLAIN,30))); 
		        	  JOptionPane.showMessageDialog(null,pane,"",JOptionPane.PLAIN_MESSAGE);
			}
			
			else if(b1.getIcon()==i21&&b2.getIcon()==i25&&b3.getIcon()==i26&&b4.getIcon()==i24&&b5.getIcon()==i22&&b6.getIcon()==i29&&
			b7.getIcon()==i23&&b8.getIcon()==i27&&b9.getIcon()==i28)
			{	
			  l=new JLabel("Congratulations ,You won!!....:-)");
					  UIManager.put("OptionPane.minimumSize",new Dimension(347,147)); 
		        	  l.setFont(new Font("Serif", Font.ITALIC, 32));
		        	  JPanel pane=new JPanel();
		        	  pane.add(l);
		        	  UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("ARIAL",Font.PLAIN,30))); 
		        	  JOptionPane.showMessageDialog(null,pane,"",JOptionPane.PLAIN_MESSAGE);
			}	  
			
		      else if(b1.getIcon()==i31&&b2.getIcon()==i36&&b3.getIcon()==i38&&b4.getIcon()==i33&&b5.getIcon()==i37&&b6.getIcon()==i34&&
			b7.getIcon()==i35&&b8.getIcon()==i39&&b9.getIcon()==i32)
			{
			  l=new JLabel("Congratulations ,You won!!....:-)");
					  UIManager.put("OptionPane.minimumSize",new Dimension(347,147)); 
		        	  l.setFont(new Font("Serif", Font.ITALIC, 32));
		        	  JPanel pane=new JPanel();
		        	  pane.add(l);
		        	  UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("ARIAL",Font.PLAIN,30))); 
		        	  JOptionPane.showMessageDialog(null,pane,"",JOptionPane.PLAIN_MESSAGE);
			}
		
			             if(evt.getSource()==reset)

			{	if(b10.getIcon()==i10)
				{
				b1.setIcon(i1);
				b2.setIcon(i2);
				b3.setIcon(i3);
				b4.setIcon(i4);
				b5.setIcon(i5);
				b6.setIcon(i6);
				b7.setIcon(i7);
				b8.setIcon(i8);
				b9.setIcon(i9);
				}
			
				if(b10.getIcon()==i20)
				{
				b1.setIcon(i21);
				b2.setIcon(i22);
				b3.setIcon(i23);
				b4.setIcon(i24);
				b5.setIcon(i25);
				b6.setIcon(i26);
				b7.setIcon(i27);
				b8.setIcon(i28);
				b9.setIcon(i29);
				}
				if(b10.getIcon()==i30)
				{
				b1.setIcon(i31);
				b2.setIcon(i32);
				b3.setIcon(i33);
				b4.setIcon(i34);
				b5.setIcon(i35);
				b6.setIcon(i36);
				b7.setIcon(i37);
				b8.setIcon(i38);
				b9.setIcon(i39);
				}
	
			}	

	
		if(evt.getSource()==b10)
		{		
			if(b10.getIcon()==i10)
			{

			b10.setIcon(i20);
			b1.setIcon(i21);
			b2.setIcon(i22);
			b3.setIcon(i23);
			b4.setIcon(i24);
			b5.setIcon(i25);
			b6.setIcon(i26);
			b7.setIcon(i27);
			b8.setIcon(i28);
			b9.setIcon(i29);

			b1.setBounds(30,100,129,88);
			b2.setBounds(159,100,129,88);
			b3.setBounds(288,100,129,88);
			b4.setBounds(30,188,129,88);
			b5.setBounds(159,188,129,88);
			b6.setBounds(288,188,129,88);
			b7.setBounds(30,276,129,88);
			b8.setBounds(159,276,129,88);
			b9.setBounds(288,276,129,88);
			b10.setBounds(547,100,378,268);
					
			l1.setBounds(647,374,247,100);

		     }

		    else if(b10.getIcon()==i20)
			{

			b10.setIcon(i30);
			b1.setIcon(i31);
			b2.setIcon(i32);
			b3.setIcon(i33);
			b4.setIcon(i34);
			b5.setIcon(i35);
			b6.setIcon(i36);
			b7.setIcon(i37);
			b8.setIcon(i38);
			b9.setIcon(i39);

			b1.setBounds(20,50,176,145);
			b2.setBounds(196,50,176,145);
			b3.setBounds(372,50,176,145);
			b4.setBounds(20,195,176,145);
			b5.setBounds(196,195,176,145);
			b6.setBounds(372,195,176,145);
			b7.setBounds(20,340,176,145);
			b8.setBounds(196,340,176,145);
			b9.setBounds(372,340,176,145);
			b10.setBounds(574,50,539,434);
			
			l1.setBounds(647,500,247,100);		

		      }
			else if(b10.getIcon()==i30)
			{
		
			b10.setIcon(i10);
			b1.setIcon(i1);
			b2.setIcon(i2);
			b3.setIcon(i3);
			b4.setIcon(i4);
			b5.setIcon(i5);
			b6.setIcon(i6);
			b7.setIcon(i7);
			b8.setIcon(i8);
			b9.setIcon(i9);

			b1.setBounds(10,50,170,154);
			b2.setBounds(180,50,170,154);
			b3.setBounds(350,50,170,154);
			b4.setBounds(10,204,170,154);
			b5.setBounds(180,204,170,154);
			b6.setBounds(350,204,170,154);
			b7.setBounds(10,358,170,154);
			b8.setBounds(180,358,170,154);
			b9.setBounds(350,358,170,154);
			b10.setBounds(547,50,510,462);
		
			l1.setBounds(647,500,247,100);
		
			
			}
					
	
		}
	}

	public static void main(String aa[])
	{
		new MyGame();
	}
}