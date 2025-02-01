import java.util.Scanner;

public class Q1{
  public static Boolean[] strBoolArr(String str, int len){
  Boolean arr[] = new Boolean[len];
  for (int i = 0, j = 0; i < str.length() && j < len; i++, j = j){
    if(str.substring(i , i + 1) != " "){
      arr[j] = Boolean.parseBoolean(str.substring(i , i + 1));
      j++;
    }
  }
  return arr;
}
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    int intLen = input.nextInt();
    String strArr1 = input.next();
    String strArr2 = input.next();
    Boolean arr1[] = strBoolArr(strArr1, intLen);
  }
}
