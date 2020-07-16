import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class second_Box extends JFrame
{

	static String username2; // Variable for the user2
	
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					second_Box frame = new second_Box();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}


	public second_Box() // the second chat panel
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 491); /* the size of the box */
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setBackground(Color.CYAN); 
		
		display2 = new JTextArea();
		display2.setBounds(12, 55, 503, 306);
		contentPane.add(display2);
		
		text2 = new JTextArea();
		text2.setBounds(12, 373, 360, 47);
		contentPane.add(text2);
		send2 = new JButton("SEND");
		
		send2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String s = text2.getText();
				if(s.equals(""))
				{
					return;
				}
				display2.append(username2 + ":" + s + "\n");
				first_Box.sendText();
				text2.setText("");
			}
		});
		send2.setBounds(384, 374, 131, 46);
		contentPane.add(send2);
		
		label2 = new JLabel("ChatBox for:" + " " + username2);
		label2.setBounds(12, 13, 253, 29);
		contentPane.add(label2);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				display2.setText("");
			}
		});
		clear.setBounds(277, 13, 97, 29);
		contentPane.add(clear);
	}

	public static void sendText()
	{
		String s = first_Box.text1.getText();
		if(s.equals(""))
		{
			return;
		}
		display2.append(first_Box.username1 + ":" + s + "\n");
		
	}
	
	
	private javax.swing.JLabel label2;
	private static javax.swing.JTextArea display2;
	private javax.swing.JButton send2;
	public static javax.swing.JTextArea text2;
}
