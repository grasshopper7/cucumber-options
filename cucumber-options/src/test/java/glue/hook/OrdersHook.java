package glue.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class OrdersHook {

	@Before
	public void before() {
		System.out.println("You enter the cafeteria");
	}
	
	@After
	public void after() {
		System.out.println("You exit the cafeteria");
	}
}
