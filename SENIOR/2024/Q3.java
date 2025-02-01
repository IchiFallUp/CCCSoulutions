import java.util.Scanner;

public class Q3{
  public static int[] swipeRight(int intX, int intY, int[] intArr){
    int[] tempArr = intArr.clone(); 
    for(int i = intX; i <= intY; i++){
      tempArr[i] = intArr[intX];                                                                                              
    }
    return tempArr;
  }

  public static int[] swipeLeft(int intX, int intY, int[] intArr){
    int[] tempArr = intArr.clone(); 
    for(int i = intX; i <= intY; i++){
      tempArr[i] = intArr[intY];                                                                                              
    }
    return tempArr;
  }

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int intLen = input.nextInt();
    int intArr1[] = new int[intLen];
    int intArr2[] = new int[intLen];
    String strArr1 = input.next();
    String strArr2 = input.next();
    for(int i = 0; i < intLen ; i++){
      intArr1[i] = Integer.valueOf(strArr1.substring(i*2, i * 2 + 1));
    }
    for(int i = 0; i < intLen; i++){
      intArr2[i] = Integer.valueOf(strArr2.substring(i*2, i * 2 + 1));
    }
    for(int i = 0; i < intArr1.length; i++){
      System.out.print(intArr1[i]);
    }
  } 
}
