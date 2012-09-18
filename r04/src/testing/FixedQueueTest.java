package testing;
import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import queue.FixedQueue;


public class FixedQueueTest {

	public void genArray(double[] arr){
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Math.random();
		}
	}
	
	@Test
	public void test() {
		int size = 100;
		
		FixedQueue q = new FixedQueue(size);
		double[] arr = new double[size+1];
		genArray(arr);
		
		//try to push too many
		for(int i=0;i<arr.length;i++)
		{
			//TODO: add failure handling depending on how your queue treats too many pushes
			//this case expects an exception to be thrown
			try{
			q.push(arr[i]);
			if(i>=size)
				fail("Allows for too many pushes");
			}catch(Exception e){
				
			}
			
		}
		
		//read them all back and make sure they are right
		for(int i=0;i<size;i++){
			Assert.assertTrue("Wrong value in the queue",q.pop() == arr[i]);
			
		}
		
		//regen
		genArray(arr);
		
		//try to push too many
		for(int i=0;i<arr.length;i++)
		{
			//TODO: add failure handling depending on how your queue treats too many pushes
			//this case expects an exception to be thrown
			try{
				q.push(arr[i]);
				if(i>=size)
					fail("Allows for too many pushes");
			}catch(Exception e){

			}

		}
		
		//read them all back and make sure they are right
		for(int i=0;i<size;i++){
			Assert.assertTrue("Wrong value in the queue",q.pop() == arr[i]);

		}

		
	}

}
