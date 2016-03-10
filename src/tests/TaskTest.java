package tests;

import static org.junit.Assert.*;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Stack;

import org.junit.Test;
import task.Comment;
import task.Task;

/**
 * This it the TaskTest class.
 * It uses JUnit to test various aspects of the Test class.
 * @author Mike Mekker
 */
public class TaskTest
{
	/**
	 * Creates a task object to test.
	 * Task object is tested by:
	 * 		- Adding a comment
	 */
	@Test
	public void testAddComment()
	{
		//Create new task to test
		Task t = new Task();
		//Add a new comment to that task
		Comment c = t.addComment("Test Author", LocalDateTime.of(2016, Month.MARCH, 07, 10, 18, 0, 0), "Test comment.");
		//Check that the new comment is there
		Stack<Comment> comments = new Stack<Comment>();
		comments.push(c);
		assertEquals(comments,t.getComments());
	}
}