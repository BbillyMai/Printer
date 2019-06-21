package model;

public class ColorPrinter extends Printer {

    public void print(){
        System.out.println("黑白打印。。");
    }

    public void print(boolean b){
        System.out.println("彩色打印。。。");
    }
}
