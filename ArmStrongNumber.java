public class ArmStrongNumber {

  static int countDigits(int num){
    int digits = 0;
    while(num != 0){
      digits += 1;
      num /= 10;
    }
    return digits;
  }
  public static void main(String[] args) {
    int num = 1633;
    int copy = num;
    int ans = 0;
    int digits = countDigits(num);

    while(num != 0 ){
      int remainder =  num % 10;
      ans +=  (int)Math.pow(remainder , digits);
      num /= 10;
    }

    if(ans == copy){
      System.out.println("It is Armstrong Number");
    }else{
      System.out.println(" It is Not ArmStrong Number");
    }



  }
  
}
