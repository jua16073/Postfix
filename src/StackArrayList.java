import java.util.ArrayList;

public class StackArrayList<E>
 implements Stack<E>
{
	protected ArrayList<E> data;

	public StackArrayList()public StackArrayList()
	// post: constructs a new, empty stack
	{
		data = new ArrayList<E>();
	}
	
}
