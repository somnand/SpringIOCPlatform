package code;

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
		System.out.println("Performing some business task !!");
	}
}
