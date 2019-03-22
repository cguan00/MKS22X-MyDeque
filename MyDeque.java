import java.util.*;

public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    //start = ??
  }

  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
  }

  public int size(){
    return size;
  }

  public String toString(){
    String output = "";
    for(int i = 0; i < data.length; i++){
      // if(data[i] != null){
      //   output += data[i];
      // }
      // output += data[i];
      output += " ";
    }
    return output;
  }

  public void addFirst(E element){
    if(element == null){
      throw new NullPointerException();//throw exception if specified element is null
    }
    if(start - 1 > 0){//if not past the beginning of data array
      data[start - 1] = element;
    } else{
      data[data.length - 1] = element;//loop around to the other end of data array
    }
    size++;//increase size by 1
  }

  public void addLast(E element){
    if(element == null){
      throw new NullPointerException();//throw exception if specified element is null
    }
    if(end + 1 < data.length - 1){//if not past the end of data array
      data[end + 1] = element;
    } else{
      data[0] = element;//loop around to the beginning of data array
    }
    size++;//increase size by 1
  }

  public E removeFirst(){
    // if(size() == 0){//throw exception if deque is empty
    //    throw new NoSuchElementException();
    // }
    data[start] = null;
    if(start < data.length - 1){
      start += 1;
    } else{
      start = 0;//loop around to beginning of array
    }
    size--;//decrease size by 1
    return data[start];
  }

  public E removeLast(){
    // if(size() == 0){//throw exception if deque is empty
    //    throw new NoSuchElementException();
    // }
    data[end] = null;
    if(end > 0){
      end -= 1;
    }else{
      end = data.length - 1;//loop around to the end of data array
    }
    size--;//decrease size by 1
    return data[end];
  }

  public E getFirst(){
    if(size() == 0){//throw exception if deque is empty
       throw new NoSuchElementException();
    }
    return data[start];
  }

  public E getLast(){
    if(size() == 0){//throw exception if deque is empty
       throw new NoSuchElementException();
    }
    return data[end];
  }

  @SuppressWarnings("unchecked")
  public void resize(){
    data = (E[])new Object[size() * 2 + 1];
  }

}
