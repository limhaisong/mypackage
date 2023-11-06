package day01;

public class myShop {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        myJavaLib myLib = new myJavaLib();
        boolean chk = myLib.isNumeric_chk("100");
        System.out.println(chk);
    }
}


