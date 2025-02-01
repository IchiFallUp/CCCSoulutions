import java.util.Scanner;

public class Q1{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int intNumOfPeople = input.nextInt();
    int[] circle = new int[intNumOfPeople];
    
    for(int i = 0; i < intNumOfPeople; i++) {
      int intTemp = input.nextInt();
      circle[i] = intTemp;
    }
    
    int half = intNumOfPeople / 2;
    int intCount = 0;
    
    for(int i = 0; i < half; i++){
      if(circle[i] == circle[i + half]){
        intCount+=2;
      }
    }
    
    System.out.println(intCount);
  }
}
