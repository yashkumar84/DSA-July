public class StrongNumber{
  static int factorial(int n){
    int fact = 1;
    for(int i = 1;i<= n;i++){
      fact *= i;
    }
    return fact;
  }
  public static void main(String[] args) {
    int num = 146;
    int copy = num;
    int ans = 0;
    while(num != 0){
      int rem = num % 10;
      ans += factorial(rem);
      num /= 10;
    }
    if(ans == copy){
      System.out.println("This is Strong Number");
    }else{
      System.out.println("This is Not Strong Number");
    }

  }
}