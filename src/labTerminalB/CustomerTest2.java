package labTerminalB;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest2 {
	Movie m1 = new Movie("Spancer", 0);
	Movie m2 = new Movie("Speed", 1);
	Movie m3 = new Movie("Avengers",1);
	Movie m4=new Movie("Iron man",2);
	Customer me = new Customer("Nadir");
	
	
	
	Rental r5=new Rental(m1,0);
	Rental r6=new Rental(m2,0);
	
	@Test
	public void testDaysrented() {
		me.addRental(r5);
		me.addRental(r6);
		
		String output2 = "Rental Record for Nadir\r\n" +
		         "		Spancer 2.0\r\n "+
				 "		Speed   0.0";	
		if(output2.equals(me.statement()))
		{
			assert true;
		}

	}
	Rental r1= new Rental(m1,23);
	Rental r2=new Rental(m2,4);
	Rental r3=new Rental(m3,3);
	Rental r4=new Rental(m4,6);
	@Test
	public void testAmountOwed()
	{
		me.addRental(r3);
		me.addRental(r4);
		me.addRental(r1);
		me.addRental(r2);
		String output3 = "Rental Record for Nadir\r\n" +
		             "   Spancer   33.5\r\n "+
				     "   Speed     12.0\r\n"+
		             "   Avengers  9.0\r\n"+
				     "   Iron man  6.0";
		if(output3.equals(me.statement()))
		{
			assert true;
		}  
	}
	

}
