import java.util.*;
public class GenStack<E>  {
private LinkedList<E> list = new LinkedList<E>(); 
public void push(E item)  {
        list.addFirst(item);
    }
public E pop() {
        return list.poll();
    }
public E peek()  {
        return list.peek();
    }
public boolean hasItems() {
        return !list.isEmpty();
    }
public int size() {
        return list.size();
    }
}
