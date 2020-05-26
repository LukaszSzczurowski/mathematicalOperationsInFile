public class Equations {
    private int a;
    private int b;
    private String mathChar;
    private int result;

    public Equations(int a, int b, String mathChar, int result) {
        this.a = a;
        this.b = b;
        this.mathChar = mathChar;
        this.result = result;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getMathChar() {
        return mathChar;
    }

    public void setMathChar(String mathChar) {
        this.mathChar = mathChar;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return  a + " " + mathChar + " " + b + " = " +  result;
    }
}
