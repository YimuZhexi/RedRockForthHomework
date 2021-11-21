package level3.method;

import level3.warn.NumWarn;

import java.util.Scanner;

//计算机运行及输入正确性判断
public class Start {
    public void start() {
        Scanner sc = new Scanner(System.in);
        Choose choose = new Choose();
        Method method;
        double num1 = 0;
        if (sc.hasNextDouble()) {
            num1 = sc.nextDouble();
        } else {
            try {
                throw new NumWarn("num1输入有误!!!\n" + "默认为1");
            } catch (Exception e) {
                e.printStackTrace();
            }
            num1 = 1;
        }
        double num2 = 0;
        if (sc.hasNextDouble()) {
            num2 = sc.nextDouble();
        } else {
            try {
                throw new NumWarn("num2输入有误!!!\n" + "默认为1");
            } catch (Exception e) {
                e.printStackTrace();
            }
            num2 = 1;
        }
        String operation = sc.next();
        method = choose.choose(operation);
        method.doIt(num1, num2);
    }
}
