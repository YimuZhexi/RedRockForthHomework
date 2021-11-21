package level3.method;

import level3.warn.NumWarn;

//除法算法
class Division implements Method {
    public void doIt(double num1, double num2) {
        //判断除数是否为0
        if(num2==0){
            try {
                throw new NumWarn("除数不能为0，更改为默认值1.");
            }catch (Exception e){
                e.printStackTrace();
            }
            num2 = 1;
        }
        System.out.println("num1 / num2="+(num1/num2));
    }
}
