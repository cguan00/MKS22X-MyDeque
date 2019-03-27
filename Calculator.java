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

    for(int i = 0; i < data.length; i++){
      if(data[i].equals("+")){
        Double first = stack.removeLast();
        Double second = stack.removeLast();
        stack.addLast(first + second);
        // System.out.println(first + second);
        // System.out.println("add");
        // System.out.println(stack);
      }else if(data[i].equals("-")){
        Double first = stack.removeLast();
        Double second = stack.removeLast();
        stack.addLast(second - first);
      }else if(data[i].equals("*")){
        Double first = stack.removeLast();
        Double second = stack.removeLast();
        stack.addLast(first * second);
      }else if(data[i].equals("/")){
        Double first = stack.removeLast();
        Double second = stack.removeLast();
        stack.addLast(second / first);
      } else{
        // System.out.println("a num");
        stack.addLast(Double.valueOf(data[i]));
        // System.out.println("num");
        // System.out.println(stack.size());
        // System.out.println(stack);
      }
    }

    return stack.getFirst();
  }



}
