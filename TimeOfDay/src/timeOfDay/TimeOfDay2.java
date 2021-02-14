package timeOfDay;
/**
 * Elke instantie van deze klasse stelt een tijdstip voor van een onbepaalde dag.
 * @invar Het aantal minutesAfterMidnight zijn gelijk aan het aantal hours maal 60 plus het aantal minutes van het tijdstip.
 * 		| getMinutesAfterMidnight() == getHours()*60 + getMinutes()
 * 
 */
public class TimeOfDay2 {
	private int minutesAfterMidnight;
	
	public int getMinutesAfterMidnight() {
		return minutesAfterMidnight;
	}
	/**
	 * Stelt het aantal hours van dit tijdstip in.
	 * @throws IllegalArgumentException als het aantal hours niet tussen de 0 en 24 ligt.
	 * 		| (hours < 0 || hours > 23)
	 * @post Het aantal hours moet gelijk zijn aan het gegeven aantal hours.
	 * 		| getHours() == hours
	 * @post Het aantal minutes moet gelijk zijn aan het oude aantal minutes.
	 * 		| getMinutes() == old(getMinutes())
	 */
	public void setHours(int hours) {
		if ((hours < 0) || (hours > 23)) {
			throw new IllegalArgumentException("Aantal hours moet tussen 0(inclusief) en 24(exclusief) zijn.");
		}
		minutesAfterMidnight +=  -minutesAfterMidnight/60 + hours*60;
	}
	
	/**
	 * Stelt het aantal minutes van dit tijdstip in.
	 * @throws IllegalArgumentException als het aantal minutes niet tussen de 0 en 60 ligt.
	 * 		| (minutes < 0 || minutes > 59)
	 * @post Het aantal minutes moet gelijk zijn aan het gegeven aantal minutes.
	 * 		| getMinutes() == minutes
	 * @post Het aantal hours moet gelijk zijn aan het oude aantal hours.
	 * 		| getHours() == old(getHours())
	 */
	public void setMinutes(int minutes) {
		if (minutes < 0 || minutes > 59)
			throw new IllegalArgumentException("Aantal minutes moet tussen 0(inclusief) en 60(exclusief) zijn.");
		minutesAfterMidnight +=  -minutesAfterMidnight%60 + minutes;
	}
	
	public int getHours() {
		return minutesAfterMidnight/60;
	}
	
	public int getMinutes() {
		return minutesAfterMidnight%60;
	}
	
}

