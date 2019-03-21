public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    size = data.length;
    start = 0;
    end = 1;
  }

  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    size = initialCapacity;
    start = 0;
    end = 1;
  }

  public int size(){
    return size;
  }

  public String toString(){
    String output = "";
    return output;
  }

  public void addFirst(E element){

  }

  public void addLast(E element){

  }

  public E removeFirst(){

  }

  public E removeLast(){

  }

  public E getFirst(){
    return data[start];
  }

  public E getLast(){
    return data[end];
  }

  
}
