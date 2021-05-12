package id.learn.appstestingandroid;

class CalculateViewModel {
    private final CalculateModel calculateModel;

    public CalculateViewModel(CalculateModel calculateModel) {
        this.calculateModel = calculateModel;
    }

    void setVariable(int varA, int varB){
        calculateModel.setVariable(varA, varB);
    }

    int getResultCalculate(){
        return calculateModel.getResultCalculate();
    }
}
