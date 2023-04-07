package Seminar02;

public class NumberTest2 implements Test{
    int start;
    int val;
    int prev;

    public NumberTest2() {
        start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public int GetNext() {
        prev = val;
        val+=10;
        return val;

    }

    @Override
    public void reset() {
        start=0;
        val=0;
        prev = -2;

    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;

    }

    private int getPrev() {
        return prev;
    }

}
