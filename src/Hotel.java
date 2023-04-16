public class Hotel {
    private int chargePerNight;
    private String hotelName;
    private HotelType hotelType;

    @Override
    public String toString() {
        return "Hotel{" +
                "chargePerNight=" + chargePerNight +
                ", hotelName='" + hotelName + '\'' +
                ", hotelType=" + hotelType +
                '}';
    }

    public int getChargePerNight() {
        return chargePerNight;
    }

    public void setChargePerNight(int chargePerNight) {
        this.chargePerNight = chargePerNight;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public HotelType getHotelType() {
        return hotelType;
    }

    public void setHotelType(HotelType hotelType) {
        this.hotelType = hotelType;
    }

    public Hotel(String hotelName, int chargePerNight, HotelType hotelType){
        this.hotelName=hotelName;
        this.chargePerNight=chargePerNight;
        this.hotelType=hotelType;
    }


}
