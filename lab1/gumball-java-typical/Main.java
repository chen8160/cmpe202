

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine_type_1 = new GumballMachine(3, 25, new int[]{25});
		GumballMachine gumballMachine_type_2 = new GumballMachine(1, 50, new int[]{25});
		GumballMachine gumballMachine_type_3 = new GumballMachine(1, 50, new int[]{1, 5, 10, 25});

		// Gumball Machine Type 1
		System.out.println(gumballMachine_type_1);

		gumballMachine_type_1.insertCoins( 25 );
		gumballMachine_type_1.turnCrank();

		System.out.println(gumballMachine_type_1);

		gumballMachine_type_1.insertCoins( 25 );
		gumballMachine_type_1.insertCoins( 25 );
		gumballMachine_type_1.turnCrank();
		gumballMachine_type_1.turnCrank();

		gumballMachine_type_1.insertCoins(5);
		gumballMachine_type_1.turnCrank();

		System.out.println(gumballMachine_type_1);

		// Gumball Machine Type 2
		System.out.println(gumballMachine_type_2);

		gumballMachine_type_2.insertCoins(5);
		gumballMachine_type_2.insertCoins(10);

		gumballMachine_type_2.insertCoins( 25 );
		gumballMachine_type_2.turnCrank();

		System.out.println(gumballMachine_type_2);

		gumballMachine_type_2.insertCoins( 25 );
		gumballMachine_type_2.insertCoins( 25 );
		gumballMachine_type_2.turnCrank();
		gumballMachine_type_2.turnCrank();

		gumballMachine_type_2.turnCrank();

		System.out.println(gumballMachine_type_1);

		// Gumball Machine Type 3
		System.out.println(gumballMachine_type_3);

		gumballMachine_type_3.insertCoins(1);
		gumballMachine_type_3.insertCoins(2);
		gumballMachine_type_3.insertCoins(5);
		gumballMachine_type_3.insertCoins(5);
		gumballMachine_type_3.insertCoins(10);

		gumballMachine_type_3.insertCoins( 25 );
		gumballMachine_type_3.turnCrank();

		System.out.println(gumballMachine_type_3);

		gumballMachine_type_3.insertCoins( 25 );
		gumballMachine_type_3.insertCoins( 25 );
		gumballMachine_type_3.turnCrank();
		gumballMachine_type_3.turnCrank();

		gumballMachine_type_3.turnCrank();

		System.out.println(gumballMachine_type_1);
	}
}
