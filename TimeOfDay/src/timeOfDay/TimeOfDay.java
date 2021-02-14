package timeOfDay;

public class TimeOfDay {
	int hours;
	int minutes;
	
	int getMinutesAfterMidnight() {
		return hours*60 + minutes;
	}
	
	void setHours(int hours) {
		this.hours =  hours;
	}
	
	void setMinutes(int minutes) {
		this.minutes = minutes;
	}	
	
	int getHours() {
		return this.hours;
	}
	
	int getMinutes() {
		return this.minutes;
	}
	
}
