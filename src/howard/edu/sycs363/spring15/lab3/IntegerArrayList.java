package howard.edu.sycs363.spring15.lab3;

import java.util.Arrays;

//class definiton
public class IntegerArrayList{

	//these variable are declared private to prevent minimum exposure
	private int[] our_array;
	private int a_size = 0;
	
	//two constructors as mentioned in the specifications: with and without parameters
	public IntegerArrayList(){
		our_array = new int[10];
	}
	
	public IntegerArrayList(int arr_size){
		our_array = new int[arr_size];
	}
	
	public int get_length(){
		return our_array.length;
	}
	
	//two add functions with and without parameters
	public void add(){
        if(our_array.length-a_size <= 5){
            increaseListSize();
        }
        our_array[our_array.length-1] = 52;
        a_size++;
    }
	
	public void add(int value){
		if (our_array.length - a_size <=5){
			increaseListSize();
		}
		
		our_array[our_array.length-1] = value;
		a_size++;
	}
	
	public void add(int index, int value){
		if (our_array.length-a_size <=5){
            increaseListSize();

		}
		our_array[index] = value;
		a_size++;
	}
	
	//linear search to get items
	public int get(int index){
		if (index >= 0 && index <= our_array.length){
			return our_array[index];
		}
		else{
			return -1;
		}
	}
	
	//returns index of a given value, -1 if not found
	public int indexOf(int value){
		int counter = 0;
		while (counter <= our_array.length-1){
			if (our_array[counter] == value){
				return counter;
			}
			else
				counter++;
		}
		return -1;
	}
	
	//checks if the array is empty
	public boolean isEmpty(){
		if (a_size == 0){
			return true;
		}
		else 
			return false;
	}
	
	//delete element in the given index and move
	//everything after that one index down
	
	public int remove(int index){
		final int temp;
		if (index >= 0 && index <= our_array.length){
			temp = our_array[index];
			while (index <= our_array.length-2){
				our_array[index] = our_array[index+1];
				index++;
			}
			our_array[our_array.length-1] = 0;
			return temp;
		}
		else
			return -1;
	}
	
	//helper function to increase size
	public void increaseListSize(){
		our_array = Arrays.copyOf(our_array, our_array.length*2);
	}
}
