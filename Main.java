import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    //int to string
    static String intToString(int x){
       return String.valueOf(x);
    }
    //string to int
    static int stringToInt(String str){
        return Integer.parseInt(str);
    }
    //char to int
    static int charToInt(char x){
        return Character.getNumericValue(x);
        // return Integer.parseInt(String.valueOf(x))
    }
    //int to char
    static char intToChar(int x){
        return (char) x;
    }
    //string to boolean
    static Boolean stringToBolean(String str){
        return Boolean.parseBoolean(str);
        // or Boolean.valueOf
    }
    //boolean to string
    static String booleanToString(Boolean bl){
        return String.valueOf(bl);
        //or Boolean to string
    }
    //date to string
    static String dateToString(Date date){
        return String.valueOf(date);
    }
    //string to date
 static Date stringToDate(String str) throws ParseException {
     return new SimpleDateFormat("dd/MM/yyyy").parse(str);
 }
 //date to timestamp
    static Timestamp dateToTimestamp(Date date){
        return new Timestamp( date.getTime());
    }
    //easy way
    static int binaryToDecimal(String binary){
        return Integer.parseInt(binary,2);
    }
    //another way
    static int binaryToDecimal2(int binary){
     int decimal=0;
     int  n=0;
     while (true){
         if (binary==0) {
             break;
         }  else {
          int temp=binary%10;
          decimal+= (int) (temp*Math.pow(2,n));
          binary=binary/10;
          n++;
         }
     }
     return decimal;
    }
    //decimal to binary
   static long decimalToBinary(int decimal){
     int reminder;
     int n=1;
     long binary=0;
     while (true) {
         if (decimal == 0){
             break;
         }else {
             reminder=decimal%2;
             binary+= (long) n *reminder;
             n*=10;
             decimal=decimal/2;

         }
     }
     return binary;
   }
    // better way to convert
    static String decimalToBainery2(String str){
        return Integer.toBinaryString(Integer.parseInt(str));
    }
    public static void main(String[] args) throws ParseException {
    }
}