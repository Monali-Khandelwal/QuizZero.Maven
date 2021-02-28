import static java.lang.System.exit;

public class QuizZero {

    public static void main(String[] args) {
        QuizZero qz = new QuizZero();

        int score = qz.test();
        exit(score);
    }

    public int test() {
        int runningTotal;
        return 15 - 15;
    }


    // return zero
    public static  int Qzero (int a, int b) {
        return 0;
    }

    // return the sum of a and b
    public static  int Qone(int a, int b) {
        return a + b;
    }

    //return the product
    public static  int Qtwo(int a, int b) {  return a * b; }
    //return the difference of a and b
    public static  int Qthree(int a, int b) { return b-a; }
    //return the nagation of a
    public static  int Qfour(int a) { return -a; }
    // write code to pass the test
    public static  int Qfive(int a, int b) {return 0;}
    // write code to pass the test
    public static  int Qsix(int a) { return a*a*a; }
    // write code to pass the test
    public static  int Qseven(int a, int b) { return (a-(b*2)); }
    //return the sum of a and b divded by c
    public static  int Qeight(int a, int b, int c) { return (a + b)/c; }
    // write code to pass the test
    public static  int Qnine(int a, int b) { return ((a * b) + 5); }
    // write code to pass the test
    public static  boolean Qaay(boolean a, boolean b) {
        boolean result;
        if (a == true && b == true)
            result = true;
        else
            result = false;
        return result;
    }
    // write code to pass the test
    public static  boolean Qbee(boolean a, boolean b) {
        boolean result;
        if (a == false && b == false)
            result = false;
        else
            result = true;
        return result;

    }
    // write code to pass the test
    public static  int Qcee(boolean a, boolean b) {
        int value = 0;
        if (a == b)
            value = -2;
        else
            value = 1;
        return value;
    }
    //return x dvided by b squared
    public static  float Qdee(float x, int b) { return x / (b*b); }
    // if x-y is less than 1/10,000 return zero otherwise return 1
    public static  int Qeee(double x, double y) {
        if ((x - y) < 0.00001)
            return 0;
        else
            return 1;
    }

    //if a is zero return zero, if a is even return a random number times zero, if not even return 5 - 5
    public static  int Qeff(int a) {
    int value=0;
    if (a==0)
        value=0;
        else if(a%2==0) {
        value = (int) Math.random()*0;
        }
        else
            {
        value = 5-5;
        }
    return value;
}

}
