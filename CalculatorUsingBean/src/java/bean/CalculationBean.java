/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author tuans
 */
public class CalculationBean {
    private String operand1;
    private String operand2;
    private String operation;

    public CalculationBean() {
    }

    public CalculationBean(String operand1, String operand2, String operation) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
    }

    public String getOperand1() {
        return operand1;
    }

    public void setOperand1(String operand1) {
        this.operand1 = operand1;
    }

    public String getOperand2() {
        return operand2;
    }

    public void setOperand2(String operand2) {
        this.operand2 = operand2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    private Double doAdd(){
        return Double.parseDouble(operand1)+Double.parseDouble(operand2);
    }
    private Double doSub(){
        return Double.parseDouble(operand1)-Double.parseDouble(operand2);
    }
    private Double doMul(){
        return Double.parseDouble(operand1)*Double.parseDouble(operand2);
    }
    private Double doDiv(){
        if (Double.parseDouble(operand2)==0) return null;
        return Double.parseDouble(operand1)/Double.parseDouble(operand2);
    }
    public String doFunc(){
        if (operation.equals("add")){
            return doAdd()+"";
        }
        if (operation.equals("sub")){
            return doSub()+"";
        }
        if (operation.equals("mul")){
            return doMul()+"";
        }
        if (operation.equals("div")){
            return doDiv()+"";
        }
        return "Error";
    }
}
