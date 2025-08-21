public class StackArray<T> implements mystack<T> {
private Object[] stkar;
private int top;
private int cap;
  public StackArray(int i_cap) {
  if (i_cap <= 0) throw new IllegalArgumentException("Initial Capacity must be >
  0");
  cap = i_cap;
  stkar = new Object[cap];
  top = -1;
  }

  @Override
public void push(T item) throws StackOverflowException {
  if (isFull()) {
  throw new StackOverflowException("Cannot push: stack is full.");
  }

  stkar[++top] = item;

}

  @Override
@SuppressWarnings("unchecked")
public T pop() throws StackUnderflowException {
if (isEmpty()) throw new StackUnderflowException("Cannot pop: stack is empty.");
T item = (T) stkar[top];
stkar[top--] = null;
return item;
}
@Override
public void display() {
if (isEmpty()) {
System.out.println("Stack is empty!");
return;
}
System.out.print("Elements in the Stack: [ ");
for (int i = top; i >= 0; i--) {
System.out.print(stkar[i]);
if (i != 0) System.out.print(", ");
}
System.out.println(" ]");
}
@Override
public boolean isEmpty() { return top == -1; }
@Override
public boolean isFull() { return top == cap - 1; }
@Override
public String toString() {
if (isEmpty()) return "Stack is empty.";
StringBuilder sb = new StringBuilder("[ ");
for (int i = top; i >= 0; i--) {
sb.append(stkar[i]);
if (i != 0) sb.append(", ");
}
sb.append(" ]");
return sb.toString();
}
}
