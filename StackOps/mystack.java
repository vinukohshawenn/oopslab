public interface mystack<T> {
  void push(T item) throws StackOverflowException;
  T pop() throws StackUnderflowException;
  void display();
  boolean isEmpty();
  boolean isFull();
}
