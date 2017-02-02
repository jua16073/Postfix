import java.util.ArrayList;

public class StackVector<E>implements iPila<E>{
	protected ArrayList<E> data;

	public StackVector(){
	// post: constructs a new, empty stack
	
		data = new ArrayList<E>();
		
	}
	

	@Override
	public void push(E algo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return data.size()==0;
	}
	
	
}