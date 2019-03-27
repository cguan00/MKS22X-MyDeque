public class Calculator{
  /*Evaluate a postfix expression stored in s.
   *Assume valid postfix notation, separated by spaces.
   */
  public static double eval(String s){
    String[] data = s.split(" ");//convert string into tokens

    // printing out data array to check if splitting correctly
    // for(int i = 0; i < data.length; i++){
    //   System.out.println(data[i]);
    // }

    MyDeque<Double> stack = new MyDeque<>();

    for(int i = 0; i < data.length; i++){//loop through the tokens in the data array
      if(data[i].equals("+")){//if you want to add
        Double first = stack.removeLast();//number on the right
        Double second = stack.removeLast();//number on the left
        stack.addLast(first + second);//add the two numbers together, order doesn't matter
      }else if(data[i].equals("-")){//if you want to subtract
        Double first = stack.removeLast();//number on the right
        Double second = stack.removeLast();//number on the left
        stack.addLast(second - first);//subtract the number on the right from the one on the left, order does matter
      }else if(data[i].equals("*")){//if you want to multiply
        Double first = stack.removeLast();//number on the right
        Double second = stack.removeLast();//number on the left
        stack.addLast(first * second);//multiply the two numbers together, order doesn't matter
      }else if(data[i].equals("/")){//if you want to divide
        Double first = stack.removeLast();//number on the right
        Double second = stack.removeLast();//number on the left
        stack.addLast(second / first);//divide number on left by number on right, order does matter
      }else if(data[i].equals("%")){//if you want to mod
        Double first = stack.removeLast();//number on the right
        Double second = stack.removeLast();//number on the left
        stack.addLast(second % first);//mod number on left by number on right, order does matter
      }else{
        stack.addLast(Double.valueOf(data[i]));
      }
    }
    return stack.getFirst();
  }

}
