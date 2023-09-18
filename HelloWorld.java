
public class HelloWorld 
{
    public static void main(String[] args) 
    {
        System.out.println("hello gang") ;
        int i;
        double f = 2.5;
        boolean flag = true;
        i = 10;
        f += i;
        flag = !flag;
        System.out.println(++i);
        System.out.println(f);
        System.out.println(flag);
        System.out.println("\n\n");
        String string1 = "I am a string";
        String string2 = string1;
        String string3 = "I am also a string";
        boolean stringsEqual = string1.equals(string3);
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(stringsEqual);
        System.out.println("\n\n");
        String[] strArray = {"Alpha","Bravo","Charlie","Delta","Echo"};
        for (int iterate = 0; iterate < strArray.length; iterate++) {
            System.out.println(strArray[iterate]);
        }
        for (String value : strArray) {
            System.out.print(value + " ");
        }
        System.out.println(" ");
        for (int iterate = 0; iterate < strArray.length; iterate++) {
            System.out.print(strArray[iterate]);
            if (iterate < strArray.length - 1) {
                System.out.print("-");
            }
        }
        }
    }

