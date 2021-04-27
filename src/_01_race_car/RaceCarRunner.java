package _01_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


	
public class RaceCarRunner {

	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		RaceCar raceCar = new RaceCar("nissan", 5);
		
		// 1. Create a RaceCar and place it in 5th position

		// 2. Print the RaceCar's position in the race
		System.out.println(raceCar.getPositionInRace());
		// 3. Crash the RaceCar
		raceCar.crash();
		
		boolean damaged = raceCar.isDamaged();
		// 4. If the car is damaged. Bring it in for a pit stop.
		if(damaged == true) {
			raceCar.pit();
		}
			
		// 5. Help the car move into first place.
		while(raceCar.getPositionInRace() >1) {
		raceCar.overtake();
		}
	}
}
