package edu.northeastern.rahul;

public class Fiction  extends Book implements iBorrowable {
    int startDay, endDay;

     Fiction (String title, double price, String publishYear){
        super(title, price, publishYear);
    }


    @Override
    public String description() {
        return  "all events are imaginary and not based on real facts";
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
