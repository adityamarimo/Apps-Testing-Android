package id.learn.appstestingandroid;

public class CalculateModel {
    private int var_a;
    private int var_b;

    public void setVariable(int varA, int varB){
        this.var_a = varA;
        this.var_b = varB;
    }

    int getResultCalculate(){
        return  var_a + var_b;
    }

    public int getVar_a() {
        return var_a;
    }

    public void setVar_a(int var_a) {
        this.var_a = var_a;
    }

    public int getVar_b() {
        return var_b;
    }

    public void setVar_b(int var_b) {
        this.var_b = var_b;
    }

}
