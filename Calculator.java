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

    // MyDeque<String> stack1 = new MyDeque<>();
    //
    // for(int i = 0; i < data.length; i++){
    //   stack1.addLast(data[i]);
    // }
    // System.out.println(stack1);

    for(int i = 0; i < data.length; i++){
      // if(!data[i].equals("+") && !data[i].equals("-") && !data[i].equals("*") && !data[i].equals("/")){
      //   stack.addLast(Double.valueOf(data[i]));
      // }
      // if(data[i].equals("+")){
      //   Double first = Double.valueOf(data[i - 1]);
      //   Double second = Double.valueOf(data[i - 2]);
      //   // System.out.println(first + second);
      //   stack.addLast(first + second);
      //   // System.out.println(stack);
      // }

      if(data[i].equals("+")){
        Double first = stack.removeLast();
        Double second = stack.removeLast();
        stack.addLast(first + second);
        // System.out.println(first + second);
        System.out.println("add");
        // System.out.println(stack);
      } else if(data[i].equals("-")){
        Double first = stack.removeLast();
        Double second = stack.removeLast();
        stack.addLast(second - first);
      }else if(data[i].equals("*")){
        Double first = stack.removeLast();
        Double second = stack.removeLast();
        stack.addLast(first * second);
      } else if(data[i].equals("-")){
        Double first = stack.removeLast();
        Double second = stack.removeLast();
        stack.addLast(second / first);
      } else{
        stack.addLast(Double.valueOf(data[i]));
      }
    }

    System.out.println(stack);

    return 0.0;
  }



}
