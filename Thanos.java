import java.util.*;

public class Thanos {

	public static void main(String[] args) {

		// TODO 1 : Create an empty heroes list
		ArrayList<Hero> heroList = new ArrayList<>();

		// TODO 2 : Add those heroes to the list
		Hero blackWidow = new Hero("Black Widow", 34);
		Hero captainAmerica = new Hero("Captain America", 100);
		Hero vision = new Hero("Vision", 3);
		Hero scarletWitch = new Hero("Scarlet Witch", 29);
		Hero thor = new Hero("Thor", 1500);
		Hero spiderMan = new Hero("Spider-Man", 18);
		Hero hulk = new Hero("Hulk", 49);
		Hero doctorStrange = new Hero("Doctor Strange", 42);

		heroList.add(blackWidow);
		heroList.add(captainAmerica);
		heroList.add(vision);
		heroList.add(scarletWitch);
		heroList.add(thor);
		heroList.add(spiderMan);
		heroList.add(hulk);
		heroList.add(doctorStrange);

		// TODO 3 : It's Thor birthday, now he's 1501
		thor.setAge(1501);

		// TODO 4 : Shuffle the heroes list

		// before shuffle
		System.out.println(heroList);

		// shuffle or randomize
		Collections.shuffle(heroList);
		System.out.println(heroList.toString());

		// shuffle again, different result
		Collections.shuffle(heroList);
		System.out.println(heroList.toString());

		// TODO 5 : Keep only the half of the list
		List<Hero> shortHeros = heroList.subList(0, 4);
		System.out.println(shortHeros.toString());

		// TODO 6 : Loop throught the list and display the name of the remaining heroes
		for (Hero hero : shortHeros) {
			System.out.println(hero.getName().toString());
		}

	}
}