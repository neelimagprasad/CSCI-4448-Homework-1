package csci4448.homework1;

public class MyMathFunctions {

    public int factorial(int i) {
        int count = 1;
        if(i ==1) {
            return 1;
        }
        for(int j = 1; j <= i; j++) {
            count = count*j;
        }

        return count;

    }
    public int fibonacci(int i) {
        if (i <= 1)
            return i;

        // Recursive call
        return fibonacci(i - 1) + fibonacci(i - 2);

    }

}
