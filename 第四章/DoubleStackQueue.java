package ������;

public class DoubleStackQueue<E> implements Queue<E> {
    private ArrayStack<E>front;
    private ArrayStack<E>back;
    
    public DoubleStackQueue(){
    	front=new ArrayStack<E>();
    	back=new ArrayStack<E>();
    }
    /**�������Ԫ��*/
    public void add(E target) {
    	back.push(target);
    }
    /**�����Ƴ�Ԫ��*/
    public E remove() {
    	if (front.isEmpty()&&back.isEmpty()) {
    	     throw new EmptyStructureException();
    	}
    	if(front.isEmpty()) {
    	while (!back.isEmpty()) {
    		front.push(back.pop());
    	}
    	return front.pop();
    	}
    	return front.pop();
    }
    
    public boolean isEmpty() {
    	if(front.isEmpty()&&back.isEmpty()) {
    		return true;
    	}
    	return false;
    }
//������࣬ArrayList���Ѿ������ж��Ƿ�Ϊ�յķ���    
//    /**�����ж�back�Ƿ�Ϊ��*/
//    public boolean bIsNull(){
//    	if(back.peek()==null) {
//    		return true;
//    	}
//    	return false;
//    }
//    /**�����ж�front�Ƿ�Ϊ��*/
//    public boolean fIsNull() {
//    	if(front.peek()==null) {
//    		return true;
//    	}
//    	return false;
//    }
    public static void main(String args []) {
    	DoubleStackQueue a=new DoubleStackQueue();
    	a.remove();
    }
}
