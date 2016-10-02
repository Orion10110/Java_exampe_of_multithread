package com.orion10110.training;

public class Producer extends Thread{
	/** Store product */
	Store store;
	/** Number of output product  */
	int product = 5;
	
	/**
	 * Class constructor setting store {@link #store}
	 * @param store  set store product 
	 */
	Producer(Store store){
		this.store = store;
	}
	
	/**
	 * Thread is putting product in store
	 */
	public void run(){
		try{
			while(product>0){
				product=product-store.put();
				System.out.println("производителю осталось произвести )" + product +
						"тоар(ов)");
				sleep(100);
			}
		}catch(InterruptedException e){
			System.out.println("поток производителя прерван");
		}
	}
}
