class Main{

	public static void main(String[] args){

		Team a1 = new Team("Vitality", 1, "ZywOo");
		Team a2 = new Team("ENCE", 2, "Snappi");
		Team a3 = new Team("G2", 3, "Niko");
		Team a4 = new Team("Heroic", 4, "stavn");
		Team a5 = new Team("Astralis", 5, "blameF");

	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println(a4);
	System.out.println(a5);

	}

	public static class Team{
		private String teamName;
		private int rank;
		private String nameOfPlayer;


	public Team(String teamName, int rank, String nameOfPlayer){
		this.teamName = teamName;
		this.rank = rank;
		this.nameOfPlayer = nameOfPlayer;

	}


	public void setRank(int rank){

		this.rank = rank;
	}

	public String toString(){

		String s = "Team: " + this.teamName + ", Rank: " + this.rank + ", Player: " + this.nameOfPlayer;

		return s;
	}



	}
	

}