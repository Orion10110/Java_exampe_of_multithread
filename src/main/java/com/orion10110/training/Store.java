package com.orion10110.training;
/**
 * This class is store goods , producer will make product
 * and consumer will take product
 * @author Artur
 * taken from the {@link http://metanit.com/java/tutorial/8.4.php}
 */
public class Store {
	/** stored products */
	int counter = 0;
	/** max number products */
	final int N = 5;
	
	/**
	 * Synchronized method for adding product in counter
	 * incremented counter
	 * @return number added product
	 */
	synchronized int put(){
		if(counter<=N){
			counter++;
			System.out.println("склад имеет " + counter + " товар(ов)");
			return 1;
		}
		return 0;
	}
	
	/**
	 * Sybchronized method for getting product from counter
	 * decremented counter
	 * @return
	 */
	synchronized int get(){
		if(counter>0){
			counter--;
			System.out.println("склад имеет " + counter + " товар(ов)");
			return 1;
		}
		return 0;
	}
	
}
