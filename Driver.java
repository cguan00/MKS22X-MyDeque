public class Driver{
  public static void main(String[] args){
    MyDeque<Integer> deque1 = new MyDeque<>();
    System.out.println(deque1);
    deque1.addFirst(5);
    System.out.println(deque1);
  }
}
