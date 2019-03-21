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
    for(int i = 0; i < data.length; i++){
      output += data[i] + " ";
    }
    return output;
  }

  public void addFirst(E element){
    if(start - 1 > 0){//if not past the beginning of data array
      data[start - 1] = element;
    } else{

    }
  }

  public void addLast(E element){
    if(end + 1 < data.length - 1){//if not past the end of data array
      data[end + 1] = element;
    } else{

    }

  }

  // public E removeFirst(){
  //
  // }
  //
  // public E removeLast(){
  //
  // }

  public E getFirst(){
    return data[start];
  }

  public E getLast(){
    return data[end];
  }


}
