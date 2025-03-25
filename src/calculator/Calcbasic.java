package calculator;

public class Calcbasic {

    public int fnum;
    public int lnum;
    public String op;

    public int empnum = 0;

    public void add() {
        this.empnum = this.fnum + this.lnum;
    }

    public void subtract() {
        this.empnum = this.fnum - this.lnum;
    }

    public void multiply() {
        this.empnum = this.fnum * this.lnum;
    }

    public void divide() {
        this.empnum = this.fnum / this.lnum;
    }

}
