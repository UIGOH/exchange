package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int p;
        System.out.println("请输入两个数值并分别回车等待交换完毕");
        Scanner reader=new Scanner(System.in);
        int a=reader.nextInt();
        int b=reader.nextInt();
        p=a;
        a=b;
        b=p;
        System.out.println("交换后为"+a+"和"+b);
    }
}
