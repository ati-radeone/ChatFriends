import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;

public class first_Box extends JFrame
{

	static String username1; // variable for the user1
	
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
					first_Box frame = new first_Box();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	/* the first_box for the user 1 */
	public first_Box()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 491); /* the size of the box */
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setBackground(Color.GREEN); 
		
		display1 = new JTextArea();
		display1.setBounds(12, 55, 503, 306);
		contentPane.add(display1);
		
		text1 = new JTextArea();
		text1.setBounds(12, 373, 360, 47);
		contentPane.add(text1);
		
		send1 = new JButton("SEND");
		send1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String s = text1.getText();
				if(s.equals(""))
				{
					return;
				}
				display1.append(username1 + ":" + s + "\n");
				second_Box.sendText();
				text1.setText("");
			}
		});
		send1.setBounds(384, 374, 131, 46);
		contentPane.add(send1);
		label1 = new JLabel("ChatBox for" + " " + username1);
		label1.setBounds(12, 13, 277, 29);
		contentPane.add(label1);
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				display1.setText("");
			}
		});
		clear.setBounds(318, 13, 97, 29);
		contentPane.add(clear);
	}
	
	public static void sendText()
	{
		String s = second_Box.text2.getText();
		if(s.equals(""))
		{
			return;
		}
		display1.append(second_Box.username2 + ":" + s + "\n");
	}
	
	private javax.swing.JLabel label1;
	private static javax.swing.JTextArea display1;
	private javax.swing.JButton send1;
	public static javax.swing.JTextArea text1;
}
