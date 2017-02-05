import java.util.Vector;

public class StackVector<E>implements iPila<E>{
	protected Vector<E> data;

	public StackVector(){
	// post: constructs a new, empty stack
	
		data = new Vector<E>();
	}
	

	@Override
	public void push(E algo) {
		// TODO Auto-generated method stub
		data.add(algo);
		
	}
	@Override
	public E pop() {
		// TODO Auto-generated method stub
		
		return data.remove(data.size()-1);
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return data.size()==0;
	}
	
	
}