package kata.clash;

import org.junit.Assert;
import org.junit.Test;

import kata.clash.buildings.BlackTrainingCamp;
import kata.clash.buildings.BlueTrainingCamp;
import kata.clash.buildings.TrainingCamp;
import kata.clash.units.Bomber;
import kata.clash.units.Dragon;
import kata.clash.units.Giant;
import kata.clash.units.Miner;
import kata.clash.units.UnitType;

public class Ex2 {

	/* Q1 */

	@Test
	public void A_Dragon_Then_It_Should_Have_7500_getOffensiveHitpoints() {
		TrainingCamp blackTrain = new BlackTrainingCamp(); 
		Dragon newlyCreatedDragon = (Dragon) blackTrain.ProduceUnit(UnitType.DRAGON);

		Assert.assertEquals(7500, newlyCreatedDragon.getOffensiveHitpoints());
	}

	@Test
	public void A_Dragon_Then_It_Should_Have_5000_getDefensiveHitpoints() {
		TrainingCamp blackTrain = new BlackTrainingCamp(); 
		Dragon newlyCreatedDragon = (Dragon) blackTrain.ProduceUnit(UnitType.DRAGON);
		Assert.assertEquals(5000, newlyCreatedDragon.getDefensiveHitpoints());
	}

	@Test
	public void A_Bomber_Then_It_Should_Have_800_getOffensiveHitpoints() {
		TrainingCamp blackTrain = new BlueTrainingCamp(); 
		Bomber newlyCreatedBomber = (Bomber) blackTrain.ProduceUnit(UnitType.BOMBER);
		Assert.assertEquals(800, newlyCreatedBomber.getOffensiveHitpoints());
	}

	@Test
	public void A_Bomber_Then_It_Should_Have_350_getDefensiveHitpoints() {
		TrainingCamp blackTrain = new BlueTrainingCamp(); 
		Bomber newlyCreatedBomber = (Bomber) blackTrain.ProduceUnit(UnitType.BOMBER);
		Assert.assertEquals(350, newlyCreatedBomber.getDefensiveHitpoints());
	}

	@Test
	public void A_Giant_Then_It_Should_Have_3000_getOffensiveHitpoints() {
		TrainingCamp blackTrain = new BlueTrainingCamp(); 
		Giant newlyCreatedGiant = (Giant) blackTrain.ProduceUnit(UnitType.GIANT);
		Assert.assertEquals(3000, newlyCreatedGiant.getOffensiveHitpoints());
	}

	@Test
	public void A_Giant_Then_It_Should_Have_4500_getDefensiveHitpoints() {
		TrainingCamp blackTrain = new BlueTrainingCamp(); 
		Giant newlyCreatedGiant = (Giant) blackTrain.ProduceUnit(UnitType.GIANT);
		Assert.assertEquals(4500, newlyCreatedGiant.getDefensiveHitpoints());
	}

	@Test
	public void A_Miner_Then_It_Should_Have_1200_getOffensiveHitpoints() {
		TrainingCamp blackTrain = new BlueTrainingCamp(); 
		Miner newlyCreatedMiner = (Miner) blackTrain.ProduceUnit(UnitType.MINER);
		Assert.assertEquals(1200, newlyCreatedMiner.getOffensiveHitpoints());
	}

	@Test
	public void A_Miner_Then_It_Should_Have_800_getDefensiveHitpoints() {
		TrainingCamp blackTrain = new BlueTrainingCamp(); 
		Miner newlyCreatedMiner = (Miner) blackTrain.ProduceUnit(UnitType.MINER);
		Assert.assertEquals(800, newlyCreatedMiner.getDefensiveHitpoints());
	}

	@Test
	public void With_10000_OffensiveHitpoints_Then_A_Dragon_Dies_And_Shouts_His_Last_Message()
                {
					TrainingCamp blackTrain = new BlackTrainingCamp();
                    Dragon dragonUnit = (Dragon) blackTrain.ProduceUnit(UnitType.DRAGON);

                    String lastMessageBeforeDying = dragonUnit.ReceiveHit(2000);

                    Assert.assertTrue(dragonUnit.getDefensiveHitpoints() > 0);
                    Assert.assertTrue(lastMessageBeforeDying.isEmpty());

                    lastMessageBeforeDying = dragonUnit.ReceiveHit(8000);

                    Assert.assertTrue(dragonUnit.getDefensiveHitpoints() <=0);
                    Assert.assertTrue(lastMessageBeforeDying.equals("I WILL RISE AGAIN FROM THE ASHES"));
                }

	@Test
	public void With_4501_OffensiveHitpoints_Then_A_Giant_Dies_And_Shouts_His_Last_Message()
                {
					TrainingCamp blackTrain = new BlueTrainingCamp();
                    Giant giantUnit = (Giant) blackTrain.ProduceUnit(UnitType.GIANT);
                    String lastMessageBeforeDying = giantUnit.ReceiveHit(4501);

                    Assert.assertTrue(giantUnit.getDefensiveHitpoints() <= 0);
                    Assert.assertTrue(lastMessageBeforeDying.equals("OUR IRON FISTS WILL BE REMEMBERED FOREVER"));
                }

	@Test
	public void With_1300_OffensiveHitpoints_Then_A_Miner_Dies_And_Shouts_His_Last_Message()
                {
					TrainingCamp blackTrain = new BlueTrainingCamp();
					Miner minerUnit = (Miner) blackTrain.ProduceUnit(UnitType.MINER);
                    String lastMessageBeforeDying = minerUnit.ReceiveHit(1300);

                    Assert.assertTrue(minerUnit.getDefensiveHitpoints() <= 0);
                    Assert.assertTrue(lastMessageBeforeDying.toLowerCase().equals("we return in the ground"));
                }

	@Test
	public void With_400_OffensiveHitpoints_Then_A_Bomber_Dies_And_Shouts_His_Last_Message()
                {
					TrainingCamp blackTrain = new BlueTrainingCamp();
					Bomber bomberUnit = (Bomber) blackTrain.ProduceUnit(UnitType.BOMBER);
                    String expectedMessage = "WHEN YOU play with Explosives is dangerous bussiness";
                    String lastMessageBeforeDying = bomberUnit.ReceiveHit(400);

                    Assert.assertTrue(bomberUnit.getDefensiveHitpoints() <= 0);
                    Assert.assertTrue(lastMessageBeforeDying.toLowerCase().equals(expectedMessage.toLowerCase()));
                }
}
