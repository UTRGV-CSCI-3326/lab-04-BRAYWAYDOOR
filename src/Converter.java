public class Converter{
    public static void main(String args[]){
        // Convert the string strFloat into a float.
String strFloat = "374.25";
float from_strFloat; // assign here

// Convert the string strInt into an integer.
String strInt = "1250";
int from_strInt; // assign here

// Convert the float floatNum into an integer.
float floatNum = 56.715f;
int from_floatNum; // assign here

// Convert the integer intNum into a float.
int intNum = 1500;
float from_intNum; // assign here

// Convert the double doubleNum into a string.
double doubleNum = 3.14159265;
String from_doubleNum; // assign here

from_strFloat = Float.parseFloat(strFloat);
from_strInt = Integer.parseInt(strInt);
from_floatNum = (int) floatNum;
from_intNum = (float) intNum;
from_doubleNum = "" + doubleNum;
System.out.println("Done");
    }
}
