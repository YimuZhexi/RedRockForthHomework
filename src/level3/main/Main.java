package level3.main;

import level3.method.Start;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("简易计算机（支持四则运算）");
        System.out.println("输入格式：");
        System.out.println("①：num1 空格 num2 空格 运算符");
        System.out.println("②：num1 回车 num2 回车 运算符 回车");
        System.out.println("示例：①：5 3 + \n ②：5\n\t3\n\t+\n");
        while (true) {
            Start start = new Start();
            start.start();
            //对重复使用的判断
            System.out.println("是否继续使用：1.是\t2.否");
            String s = sc.next();
            if(s.equals("2")||s.equals("否")){
                System.out.println("感谢使用！！！");
                break;
            }
        }
    }
}
