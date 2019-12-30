package PlayerDetail;

public class Player {

	private String playerName;
	private String playerPosition;
	
	public Player(String playerName , String playerPosition)
	{
		super();
		this.playerName = playerName;
		this.playerPosition = playerPosition;
		System.out.println(playerName+" is the name of player "+playerPosition+"  th position ");
	}
}
