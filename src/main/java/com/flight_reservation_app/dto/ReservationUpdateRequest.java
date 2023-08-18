package com.flight_reservation_app.dto;

public class ReservationUpdateRequest
{
private Long id;
private int numberOfBags;
private boolean isCheckedIn;
public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
public int getNumberOfBags() {
return numberOfBags;
}
public void setNumberOfBags(int numberOfBags) {
this.numberOfBags = numberOfBags;
}
public boolean isCheckedIn() {
return isCheckedIn;
}
public void setCheckInStatus(boolean isCheckedIn) {
this.isCheckedIn = isCheckedIn;
}
}
