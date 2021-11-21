package level3.method;

import level3.warn.OperationWarn;

class Choose {
    //运算方法判断
    public Method choose(String operator){
        Method method = null;
        switch (operator) {
            case "+" -> method = new Add();
            case "-" -> method = new Subtraction();
            case "*", "x", "X" -> method = new Multiplication();
            case "/" -> method = new Division();
            default -> {
                method = new Add();
                try {
                    throw new OperationWarn("运算符输入有误");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return method;
    }
}
