import java.util.*;

public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
  }

  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
  }

  public int size(){
    return size;
  }

  public String toString(){
    if(size == 0){
      return "{}";
    }
    String output = "{";
    if(start < end){//if array does not loop around
      for(int i = start; i < end; i++){
        output += data[i] + " ";
      }
    } else if(end < start){//array does loop around
      for(int i = start; i < data.length; i++){
        output += data[i] + " ";
      }
      for(int j = 0; j <= end; j++){
        output += data[j] + " ";
      }
    }
    output += "}";
    return output;
  }

  public void addFirst(E element){
    if(element == null){
      throw new NullPointerException();//throw exception if specified element is null
    }
    if(size() == data.length){//data array full, must resize
      resize();
    }
    if(size() != 0){//if size is not equal to 0
      if(start == 0){
        start = data.length - 1;//loop around to the end of data array
      } else{
        start--;//decrease start by 1
      }
    }
    data[start] = element;//assign the value at index start to the new element
    size++;//increase size by 1
  }

  public void addLast(E element){
    if(element == null){
      throw new NullPointerException();//throw exception if specified element is null
    }
    if(size() == data.length){//data array full, must resize
      resize();
    }
    if(size != 0){
      if(end == data.length - 1){//reached end of data array, must loop around
        end = 0;
      } else{
        end++;//not at the end yet, can add one to end
      }
    }
    data[end] = element;//assign value at index end to the new element
    size++;//increase size by 1
  }

  public E removeFirst(){
    if(size() == 0){//throw exception if deque is empty
       throw new NoSuchElementException();
    }
    E output = data[start];
    data[start] = null;
    if(size() != 1){
      if(start == data.length - 1){//start was at end of data array, loop around to the front of array
        start = 0;
      } else{//else, just increase start by 1
        start++;
      }
    }
    size--;//decrease size by 1
    return output;
  }

  public E removeLast(){
    if(size() == 0){//throw exception if deque is empty
       throw new NoSuchElementException();
    }
    E output = data[end];
    data[end] = null;
    if(size() != 1){
      if(end == 0){//end was at start of data array, loop around to the end of array
        end = data.length - 1;
      } else{//else, just decrease end by 1
        end--;
      }
    }
    size--;//decrease size by 1
    return output;
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
    E[] newArray = (E[])new Object[size() * 2 + 1];
    for(int i = 0; i < data.length; i++){
      newArray[i] = data[(start + i) % data.length];
    }
    start = 0;
    end = size - 1;
    data = newArray;
  }

}
