/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;

/**
 *
 * @author xj
 */
public class CounterChild extends Counter {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			CounterChild.incrementStatic();
		}
		
		System.out.println(CounterChild.getStaticCounter());
		System.out.println(Counter.getStaticCounter());
	}
	
}
