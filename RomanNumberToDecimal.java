import java.util.*; 
import java.io.*;

class Main {

  public static int value(char r){
    if(r == 'I'){
      return 1;
    }
    if(r == 'V'){
      return 5;
    }
    if(r == 'X'){
      return 10;
    }
    if(r == 'L'){
      return 50;
    }
    if(r == 'C'){
      return 100;
    }
    if(r == 'D'){
      return 500;
    }
    if(r == 'M'){
      return 1000;
    }
    return -1;
  }

  public static String StringChallenge(String str) {
    // code goes here  

    int init = 0;

    int size = str.length();

    for(int i = 0; i < size; i++){
      int s1 = value(str.charAt(i));

      if(i + 1 < size){
        int s2 = value(str.charAt(i+1));

        if(s1 >= s2)
        {
          init += s1;
        }
        else 
        {
          init = init + s2 - s1;
          i++;
        }
      }
      else 
      {
        init += s1;
      }
    }

    String strResult = Integer.toString(init);

    return strResult;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(StringChallenge(s.nextLine())); 
  }

}
