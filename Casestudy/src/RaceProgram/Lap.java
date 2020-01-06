package RaceProgram;

public class Lap {
	public Lap(byte lapNo, byte throwsMade, String fastestPlayer, float fastestTime) {
		super();
		this.lapNo = lapNo;
		this.throwsMade = throwsMade;
		this.fastestPlayer = fastestPlayer;
		this.fastestTime = fastestTime;
		}
		byte lapNo ;
		byte throwsMade;
		String fastestPlayer;
		float fastestTime;
		public byte getLapNo() {
			return lapNo;
		}
		public void setLapNo(byte lapNo) {
			this.lapNo = lapNo;
		}
		public byte getThrowsMade() {
			return throwsMade;
		}
		public void setThrowsMade(byte throwsMade) {
			this.throwsMade = throwsMade;
		}
		public String getFastestPlayer() {
			return fastestPlayer;
		}
		public void setFastestPlayer(String fastestPlayer) {
			this.fastestPlayer = fastestPlayer;
		}
		public float getFastestTime() {
			return fastestTime;
		}
		public void setFastestTime(float fastestTime) {
			this.fastestTime = fastestTime;
		}
		
		
}
