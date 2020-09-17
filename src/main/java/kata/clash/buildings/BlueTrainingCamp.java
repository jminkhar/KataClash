package kata.clash.buildings;

import kata.clash.units.Bomber;
import kata.clash.units.Giant;
import kata.clash.units.Miner;
import kata.clash.units.Unit;
import kata.clash.units.UnitType;

public class BlueTrainingCamp implements TrainingCamp{

	public Unit ProduceUnit(UnitType unitType) {
		// TODO Auto-generated method stub
		 if (unitType == UnitType.BOMBER)
	        	
	            return new Bomber();
		 if (unitType == UnitType.GIANT)
	        	
	            return new Giant();
		 if (unitType == UnitType.MINER)
	        	
	            return new Miner();
		 

	        throw new UnsupportedOperationException();
	}

}
