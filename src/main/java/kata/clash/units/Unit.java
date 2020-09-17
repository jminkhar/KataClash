package kata.clash.units;

public class Unit {
	private int defensiveHitpoints;
	private int offensiveHitpoints;
	private int coveredSpaces;
	protected String messageBeforeDieying;
	public Unit(int defensiveHitpoints, int offensiveHitpoints, int coveredSpaces) {
		this.defensiveHitpoints = defensiveHitpoints;
		this.offensiveHitpoints = offensiveHitpoints;
		this.coveredSpaces = coveredSpaces;
	}
	public int getDefensiveHitpoints() {
		return defensiveHitpoints;
	}
	private void setDefensiveHitpoints(int defensiveHitpoints) {
		this.defensiveHitpoints = defensiveHitpoints;
	}
	public int getOffensiveHitpoints() {
		return offensiveHitpoints;
	}
	private void setOffensiveHitpoints(int offensiveHitpoints) {
		this.offensiveHitpoints = offensiveHitpoints;
	}

	public String ReceiveHit(int attackHitpoints) {
		this.defensiveHitpoints -= attackHitpoints;
		if(this.defensiveHitpoints<=0)
			return messageBeforeDieying;
		return "";
		// throw new UnsupportedOperationException();
	}

    public int Move(int seconds)
    {
    	return this.coveredSpaces*seconds;
    }
}
