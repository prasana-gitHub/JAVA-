

// this the types of datatype
/*int
long 
short
boolean
char
double
float
bytes*/




/*public class DataType {
    public static void main(String[]args){
        int a =59;
        long r = 210101121256l;
        short t = 1911;
        boolean myBoolean = false;
        char cr ='a';
        double d = 5.2d;
        float f = 2.1f;
        byte s = 4;

        System.out.println("Integer : " + a);
        System.out.println("long : "+ r);
        System.out.println("Short : " + t);
        System.out.println("boolean : " + myBoolean);
        System.out.println("char : " + cr);
        System.out.println("DOuble : " + d);
        System.out.println("float : " + f);
        System.out.println("Bytes : " + s);
    }
}*/


// PRACTICE QUESTION

/*public class DataType {
    public static void main(String[]args){
        int t;
        System.out.println(t);  // compiler error 
    }
}*/

class DataType
{
    public static void main(String[] args)
    {
        Double object = new Double("2.4");
        int a = object.intValue();
        byte b = object.byteValue();
        float d = object.floatValue();
        double c = object.doubleValue();

        System.out.println(a + b + c + d );

    }
}