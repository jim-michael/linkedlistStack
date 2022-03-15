package linklist;

import java.util.EmptyStackException;
import java.util.Stack;

public class MyStack {
	Stack<Integer> s;
	static int max=0;
	
	public MyStack() {
	s = new Stack();
	}
	public void pushIn(Integer c) {
		int x=0;
		if(!s.empty()) {
			 x = s.peek();
		    if(x > max)
		    	max=x;} //if
		s.push(c);
		
	}//pushin
	
	public Integer popOut() throws EmptyStackException {
		Integer cc;
		if(s.size() == 0)
			throw new EmptyStackException();
		else
			 cc = s.pop();
		     return cc;
		
	}//popout
	
	

}
