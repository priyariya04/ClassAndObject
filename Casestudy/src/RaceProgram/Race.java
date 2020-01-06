package RaceProgram;

public class Race {
	public Race(byte raceNo, byte noOfLaps, String winningPlayer,LapManager lapManager) {
		super();
		this.raceNo = raceNo;
		this.noOfLaps = noOfLaps;
		this.winningPlayer = winningPlayer;
		this.lapManager = lapManager;
		}
		byte raceNo ;
		byte noOfLaps;
		String winningPlayer;
		LapManager lapManager;
		public byte getRaceNo() {
			return raceNo;
		}
		public void setRaceNo(byte raceNo) {
			this.raceNo = raceNo;
		}
		public byte getNoOfLaps() {
			return noOfLaps;
		}
		public void setNoOfLaps(byte noOfLaps) {
			this.noOfLaps = noOfLaps;
		}
		public String getWinningPlayer() {
			return winningPlayer;
		}
		public void setWinningPlayer(String winningPlayer) {
			this.winningPlayer = winningPlayer;
		}
		public LapManager getLapManager() {
			return lapManager;
		}
		public void setLapManager(LapManager lapManager) {
			this.lapManager = lapManager;
		}
}
