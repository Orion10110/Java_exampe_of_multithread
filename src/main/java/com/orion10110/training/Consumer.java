package com.orion10110.training;
/**
 * This class of consumers, class is thread which
 * taking product from store
 * @author  Artur
 * taken from the {@link http://metanit.com/java/tutorial/8.4.php}
 */
public class Consumer extends Thread {
	/** Store product */
	Store store;
	/** Having product */
	int product = 0;
	
	/**
	 * Class constructor setting store {@link #store}
	 * @param store  set store product 
	 */
	Consumer(Store store){
		this.store = store;
	}
	
	/**
	 *Thread is getting product from store
	 */
	public void run(){
		try{
			while(product<5){
				product=product+store.get();
				System.out.println("Потребитель купил " + product + " товар(ов)");
				sleep(100);
			}
		}catch(InterruptedException e){
			System.out.println("поток потребителя прерван");
		}
	}
}
