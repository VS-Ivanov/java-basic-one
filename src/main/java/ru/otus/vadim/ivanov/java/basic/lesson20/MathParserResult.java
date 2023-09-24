package ru.otus.vadim.ivanov.java.basic.lesson20;

public class MathParserResult {
    private Integer operand1;
    private Integer operand2;

    private String operator;

    public MathParserResult(Integer operand1, Integer operand2, String operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    public Integer getOperand1() {
        return operand1;
    }

    public Integer getOperand2() {
        return operand2;
    }

    public String getOperator() {
        return operator;
    }
}
