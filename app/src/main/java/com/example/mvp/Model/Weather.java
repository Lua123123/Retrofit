package com.example.mvp.Model;

import java.util.HashMap;
import java.util.Map;

public class Weather {

    private String name;
    private String expression;
    private Integer amount;
    //private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Weather(String name, String expression, Integer amount) {
        this.name = name;
        this.expression = expression;
        this.amount = amount;
        //this.additionalProperties = additionalProperties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }

}