package teamdetail;
public class Team {
	private String teamName;
	private String cityRepresented;
	
	public Team(String teamName , String cityRepresented)
	{
		super();
		this.teamName = teamName;
		this.cityRepresented = cityRepresented;
		System.out.println(teamName+" team located at "+cityRepresented+"  City ");
	}

}
