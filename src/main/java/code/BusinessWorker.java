package code;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
/**
 * This is a Business class which performs some business operation.
 * It requires some validation and other security related stuffs.
 * @author Somsurya Nanda
 */
@Component
public class BusinessWorker
{
	public void work()
	{
		int a[][] = new int[3][6];
		
		a[0][0] = 1;a[0][1] = 1;a[0][2] = 1;a[0][3] = 1; //4 elements
		a[1][0] = 1;a[1][1] = 1; //2 elements
		//Third row is blank
		
		System.out.println("\t0: "+a[0].length);
		System.out.println("\t1: "+a[1].length);
		System.out.println("\t2: "+a[2].length);
		
	}
	
	public void talk()
	{
		System.out.println("Not performing any business task !!");
	}
}
