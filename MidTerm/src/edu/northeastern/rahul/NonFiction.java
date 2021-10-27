package edu.northeastern.rahul;

public class NonFiction extends Book implements iBorrowable {
    int startDay, endDay;

     NonFiction(String title, double price, String publishYear){
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return  " all events are true and based on real facts";
    }

    @Override
    public void setBorrowDate(int day) {
        this.startDay = day;
    }

    @Override
    public void setReturnDate(int day) {
        this.endDay = day;
    }

    @Override
    public boolean isAvailable(int day) {
        if (day <= endDay && day >= startDay) {
            return false;
        } else
            return true;
    }
}
