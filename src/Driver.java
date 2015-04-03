import howard.edu.sycs363.spring15.lab3.IntegerArrayList;

//the Driver class as mentioned in the deliverables.
public class Driver {

	/**
	 * @param args
	 */
	//the main function
		public static void main(String[] args) {
			
			//testing some functions
			IntegerArrayList NewArList = new IntegerArrayList();
			
			NewArList.add(0, 10);
			NewArList.add(1, 11);
			NewArList.add(2, 12);
			NewArList.add(3, 13);
			NewArList.add(4, 14);
			NewArList.add(5, 17);
			NewArList.add(6, 19);
			NewArList.add();
			
			System.out.println(NewArList.get(0));
			System.out.println(NewArList.remove(3));
			System.out.println(NewArList.remove(9));
			System.out.println(NewArList.isEmpty());
			System.out.println(NewArList.indexOf(19));
			
			System.out.println("Value of 0th element = " + NewArList.get(0));
		} 
		
}

	