public class JavaClassses {

	public static void main(String[] args) {

		Pet myPet1 = new Pet();
		Pet myPet2 = new Pet("Clovis", 13, "Austin", "cat");
		
		System.out.printf("Name: %s\n", myPet1.getName());
		System.out.printf("Age: %s\n", myPet1.getAge());
		System.out.printf("Location: %s\n", myPet1.getLocation());
		System.out.printf("Type: %s\n\n", myPet1.getType());
		
		myPet1.setName("Bootsie");
		myPet1.setAge(19);
		myPet1.setLocation("Oregon");
		myPet1.setType("cat");

		System.out.printf("Name: %s\n", myPet1.getName());
		System.out.printf("Age: %s\n", myPet1.getAge());
		System.out.printf("Location: %s\n", myPet1.getLocation());
		System.out.printf("Type: %s\n\n", myPet1.getType());

		System.out.printf("Name: %s\n", myPet2.getName());
		System.out.printf("Age: %s\n", myPet2.getAge());
		System.out.printf("Location: %s\n", myPet2.getLocation());
		System.out.printf("Type: %s\n", myPet2.getType());
		
		State myState1 = new State();
		State myState2 = new State("Arizona", "Phoenix");
		State myState3 = new State("Texas", "1845", "Austin", "The Lone Star State");
		
		System.out.println(myState1.getDetails());
		System.out.println(myState2.getDetails());
		System.out.println(myState3.getDetails());
		
		myState1.setName("New Mexico");
		myState1.setFounded("1912");
		myState1.setCapital("Santa Fe");
		myState1.setNickname("Land of Enchantment");

		System.out.println(myState1.getDetails());
		
		myState2.setFounded("1912");
		myState2.setNickname("The Grand Canyon State");
		
		System.out.println(myState2.getDetails());
		
		System.out.println(State.foundedSameYear(myState1, myState2));
		System.out.println(State.foundedSameYear(myState1, myState3));

	}

}
