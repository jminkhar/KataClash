package kata.clash.buildings;

import kata.clash.units.Dragon;
import kata.clash.units.UnitType;

public class BlackTrainingCamp implements TrainingCamp {
	public Dragon ProduceUnit(UnitType unitType)
    {
        if (unitType == UnitType.DRAGON)
        	
            return new Dragon();

        throw new UnsupportedOperationException();
    }
}
