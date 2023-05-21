package model.products;

import java.time.LocalDate;

public class Discount {
    private String code;
    private int percent=0;
    private LocalDate limitDate;
    private int capacity=0;
    private long counter=-1;

    public Discount(int percent, LocalDate limitDate, int capacity){
        this.capacity=capacity;
        this.limitDate=limitDate;
        this.percent=percent;
        this.counter++;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public void setLimitDate(LocalDate limitDate) {
        this.limitDate = limitDate;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPercent() {
        return this.percent;
    }

    public LocalDate getLimitDate() {
        return this.limitDate;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public long getCounter() {
        return this.counter;
    }

    @Override
    public String toString(){
        return "Code:"+getCode()+"\nPercent: "+getPercent()+"\nCapacity: "+getCapacity()+"\nDate: "+getLimitDate();
    }
}