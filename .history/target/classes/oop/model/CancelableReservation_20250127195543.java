package oop.model;
import java.time.LocalDate;

public class cancelableReservation extends Reservation{
    private boolean isCancelable;
    private String cancelationReason;
    private Double cancelationFee; 

    public CanceLableReservation(Room room,Customer customer, LocalDate reservationStartDate, LocalDate reservationEndDate, boolean isCancelable) {
        super(room,customer, reservationStartDate, reservationEndDate);
        this.isCancelable = isCancelable;
    }

    public boolean getIsCancelable(){
        return isCancelable;
    }

    public void setIsCancelable(boolean isCancelable){
        this.isCancelable = isCancelable;
    }
}