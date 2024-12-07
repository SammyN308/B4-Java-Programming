package day05_Variables;

public class TypeCasting {
 public static void main(String[] args) {

  byte b = 40;
  int i = b;  // the byte value is CONVERTED AUTOMATICALLY into int because byte is SMALLER than int

  int i2 = 100;
  //byte b2 = i2; //the int value cannot be AUTOMATICALLY CONVERTED into byte
  byte bb2 = 100;
  byte b2 = (byte) i2; //Since we cannot AUTOMATICALLY CONVERT int into byte, we can use CASTING
  System.out.println(i2);
  System.out.println(b2);

  System.out.println();

  int i3 = 150;
  byte b3 = (byte)i3; // byte range is from -128 to 127 ----> when you try to cast something outside of the range the data type can hold then DATA LOSS happens. (150 turned into -106)
  System.out.println(i3);
  System.out.println(b3);

  System.out.println();
  double d1 = 34.6;
  int i4 = (int) d1; //After CASTING, (int), it will keep the WHOLE portion and lose the decimal part. -----> NARROWING CONVERSION (bigger to small data type) NARROWING CONVERSION HAPPENS MANUALLY, we have to put the casting (int)
  System.out.println(d1);
  System.out.println(i4);

  System.out.println();

  int i5 = 46;
  double d5 = i5; // CONVERSION STILL HAPPENS AUTOMATICALLY ----> WIDENING CONVERSION (smaller to bigger data type) WIDENING CONVERSION HAPPENS AUTOMATICALLY
  System.out.println(i5);
  System.out.println(d5);




 }
}
