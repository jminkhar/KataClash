package kata.clash.units;

public class Miner extends Unit{
	public Miner() {
		super(800,1200,5);
		super.messageBeforeDieying = "we return in the ground";
	}
}
