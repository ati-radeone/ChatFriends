import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class server extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name2;
	private JTextField name1;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					server frame = new server();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public server()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		name2 = new JTextField();
		name2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				createRoom();
			}
		});
		name2.setBounds(104, 134, 237, 31);
		contentPane.add(name2);
		name2.setColumns(10);
		
		name1 = new JTextField();
		name1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				createRoom();
			}
		});
		name1.setBounds(104, 50, 237, 31);
		contentPane.add(name1);
		name1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("1st Username");
		lblNewLabel.setBounds(187, 25, 104, 14);
		contentPane.add(lblNewLabel, BorderLayout.EAST);
		
		JLabel lblNewLabel_1 = new JLabel("2nd username");
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(187, 109, 104, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("JOIN CHAT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				createRoom();
			}
		});
		btnNewButton.setBounds(152, 203, 128, 47);
		contentPane.add(btnNewButton);
	}

	
	private void createRoom()
	{
		String p1, p2;
		p1 = name1.getText();
		p2 = name2.getText();
		
		if( p1.contentEquals("") || p2.equals("") )
				{
					JOptionPane.showMessageDialog(null, "Please enter the valid Username+");
					return;
				}
		first_Box.username1 = name1.getText();
		second_Box.username2 = name2.getText();
		ChatHouse.createRoom();
	}
}
