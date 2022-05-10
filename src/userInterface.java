import java.util.Scanner;

public class userInterface {
    public static void myCli(int l, int w, int h) {
        System.out.println("enter base" +l);
        System.out.println("enter witdh" +w);
        System.out.println("enter height"+h);
        if(l==w && w==h) {
            System.out.println("the triangle is equilateral");
        }
        else if(l==w || w==h ||h==l) {
            System.out.println("it is an isosless triangle");
        }else{
            System.out.println("it is a scalene");
        }
    }
    public  static void main(String[] args) {

        System.out.println("*******************");
        System.out.println(1+" Continue1");
        System.out.println(2 +" Exit");
        System.out.println("");
        Scanner myObj = new Scanner(System.in);
        int userInput = myObj.nextInt();
        if (userInput ==1) {
            System.out.println("");
            System.out.println("input the length of triangle");
            int length = myObj.nextInt();
            System.out.println("input the width of the triangle");
            int width = myObj.nextInt();
            System.out.println("input the height of the triangle");
            int height = myObj.nextInt();
            System.out.println("");
            System.out.println("***************");
            System.out.println("");
            myCli(length,width,height);
        } else if (userInput==2) {
            System.out.println("");
            System.out.println("goood by thanks for visiting us");
        //}else {
          //  System.out.println("unknown value");
        }

    }
}
