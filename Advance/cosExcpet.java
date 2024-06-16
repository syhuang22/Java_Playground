package Advance;

class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

class Division {
    public static int divide(int dividend, int divisor) throws DivideByZeroException {
        if (divisor == 0) {
            throw new DivideByZeroException("除数不能为0!!");
        }
        return dividend / divisor;
    }
}

public class cosExcpet {
    public static void main(String[] args) {
        try {
            int result = Division.divide(10, 0);
            System.out.println("结果是：" + result);
        } catch (DivideByZeroException e) {
            System.out.println("发生错误：" + e.getMessage());
        }
    }
}
