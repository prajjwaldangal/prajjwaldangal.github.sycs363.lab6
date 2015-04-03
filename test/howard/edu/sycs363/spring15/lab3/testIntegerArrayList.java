package howard.edu.sycs363.spring15.lab3;

import howard.edu.sycs363.spring15.lab3.IntegerArrayList;

import static org.junit.Assert.*;
import org.junit.Test;

public class testIntegerArrayList {

	/*
	 * I have tested three add() functions
	 */
	@Test
	public void testAdd() {
		
		IntegerArrayList tester = new IntegerArrayList();
		tester.add(10);
		int length = tester.get_length();
		assertEquals("Should return 10", 10, tester.get(length-1));
	}
	
	@Test
	public void testAddWithNoPara(){
		IntegerArrayList tester = new IntegerArrayList();
		tester.add();
		int length = tester.get_length();
		assertEquals("Should return 52", 52, tester.get(length-1));
	}
	
	@Test
	public void testAddWithTwoPara(){
		IntegerArrayList tester = new IntegerArrayList();
		tester.add(3, 75);
		assertEquals("Should return 75", 75, tester.get(3));
	}
	
	/*
	 * contains the alternate case too
	 */
	@Test
	public void testGet(){
		IntegerArrayList tester = new IntegerArrayList();
		tester.add(0, 20);
		tester.add(1,40);
		assertEquals("Should return 40", 40, tester.get(1));
		assertEquals("Should return -1", -1, tester.get(30));
	}
	
	/*
	 * contains the alternate case too
	 */
	@Test
	public void testindexOf(){
		IntegerArrayList tester = new IntegerArrayList();
		tester.add(3,20);
		assertEquals("Should return 3", 3, tester.indexOf(20));
		assertEquals("Should return -1", -1, tester.indexOf(21));
	}
	
	/*
	 * contains the alternate case too
	 */
	@Test
	public void testisEmpty(){
		IntegerArrayList tester = new IntegerArrayList();
		assertEquals(true, tester.isEmpty());
		tester.add(21);
		assertEquals(false, tester.isEmpty());
	}
	
	/*
	 * contains the alternate test too
	 */
	@Test
	public void testRemove(){
		IntegerArrayList tester = new IntegerArrayList();
		tester.add(2,33);
		assertEquals("Should return 33", 33, tester.remove(2));
		assertEquals("Should return 0", 0, tester.remove(2));
		assertEquals("Should return -1", -1, tester.remove(20));
	}
	

}
