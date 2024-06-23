package com.example.onlinevoting;

public class YourDataModel {
    private String columnValue;
    private int columnCount;

    public YourDataModel(String columnValue, int columnCount) {
        this.columnValue = columnValue;
        this.columnCount = columnCount;
    }

    public String getColumnValue() {
        return columnValue;
    }

    public int getColumnCount() {
        return columnCount;
    }
}

