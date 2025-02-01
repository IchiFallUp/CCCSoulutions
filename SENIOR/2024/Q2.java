import java.util.ArrayList;

public class Main{

  public static char HL(String str, char char1){
    int count = 0;
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == char1){
        count++;
      }
    }
    if(count > 1){
      return'H';
    }
    return 'L';
  }

  public static char TF(String str){
    for(int i = 0; i < str.length(); i+=2){
      if(!(HL(str, str.charAt(0)) == HL(str, str.charAt(i)))){
        return 'F';
      }
    }
    for(int i = 1; i < str.length(); i+=2){
      if(!(HL(str, str.charAt(1)) == HL(str, str.charAt(i)))){
        return 'F';
      }
    }
    if(HL(str, str.charAt(0)) == HL(str, str.charAt(1))){
      return 'F';
    }
    return  'T';
  }

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int numStr = input.nextInt();
    int lenStr = input.nextInt();
    for(int i = 0; i < numStr; i++){
      String strTemp = input.next();
      System.out.println(TF(strTemp));
    }
  }
}
