package timeOfDay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {
	
		
	@Test
	void test() {
		TimeOfDay2 time = new TimeOfDay2();
		time.setHours(4);
		time.setMinutes(56);
		int minutesAfterMidnight = time.getMinutesAfterMidnight();
		assertEquals(296, minutesAfterMidnight);
		assertEquals(4, time.getHours());
		assertEquals(56, time.getMinutes());
	}

}
