public class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top;
    
    public Stack(int s) {
      maxSize = s;
      stackArray = new long[maxSize];
      top = -1;
   }
  
    public void push(long j) {
      stackArray[++top] = j;
   }
    
    public long pop() {
      return stackArray[top--];
   }
    
    public long peek() {
      return stackArray[top];
   }
        public boolean isEmpty() {
      return (top == -1);
   }
    
    public boolean isFull() {
      return (top == maxSize - 1);
   }
    
    
    public static void main(String[] args) {
      Stack theStack = new Stack(7); 
      theStack.push(5);
      theStack.push(10);
      theStack.push(15);
      theStack.push(20);
      theStack.push(25);
      theStack.push(30);
      theStack.push(35);
      while (!theStack.isEmpty()) {
         long value = theStack.pop();
         System.out.print(value);
         System.out.print(" ");
      }
      System.out.println("");
   }
}