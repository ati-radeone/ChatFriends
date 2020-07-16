

/* class for the chat interface  */
public class ChatHouse {

	
	static first_Box win1;
	static second_Box win2;
	static server server;
	
	
	public ChatHouse()
	{
		server = new server();
		server.setLocationRelativeTo(null);
		server.setVisible(true);
		
	}
	
	/* creating a chat room  */
	public static void createRoom()
	{
		win1 = new first_Box();
		win2 = new second_Box();
		win1.setLocation(500, 200);
		win2.setLocation(900, 200);
		win1.setVisible(true);
		win2.setVisible(true);
		server.setVisible(false);
		
	}
	
	public static void main(String[] args)
	{
		ChatHouse chatHouse = new ChatHouse();
	}
}
