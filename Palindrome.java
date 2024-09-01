public class Palindrome{
  public static void main(String[] args) {
    int num = 2002;
    int copy = num;
    //reverse -- 2002 
    int reverse = 0;
    while(num != 0){
      int remainder = num % 10;
      reverse = reverse * 10 + remainder;
      num /= 10;
    }
    if(copy == reverse){
      System.out.println("It is Palindrome");
    }else{
      System.out.println("It is Not Palindrome");
    }
    
  }
}