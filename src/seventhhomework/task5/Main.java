package seventhhomework.task5;

public class Main {
    public static void main(String[] args) {

        VoidForTaskFive voidForTaskFive = new VoidForTaskFive();
        try {
            voidForTaskFive.throwsException(0);
        } catch (FirstEx|SecondEx|ThirdEx e) {
            System.out.println("Caught some "+e+" exception");
        } finally {
            System.out.println("Finally block is done");
        }
    }
}

class VoidForTaskFive {
    public void throwsException (int integer) throws FirstEx, SecondEx, ThirdEx {
        if (integer != 0) {
            throw new FirstEx();
        } else {
            throw new SecondEx();
        }
    }
}

class FirstEx extends Exception {

}

class SecondEx extends Exception{

}

class ThirdEx extends Exception{

}