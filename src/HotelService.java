import java.util.ArrayList;
import java.util.List;

public class HotelService {
    List<Hotel> hotelList = new ArrayList<>();

    public HotelService(){
        hotelList.add(new Hotel("Taj",10000,HotelType.FIVE_STAR));
        hotelList.add(new Hotel("Nisarg",5000,HotelType.THREE_STAR));
        hotelList.add(new Hotel("Durva",3000,HotelType.TWO_STAR));
    }

     /*
        Here we can see almost all code is same except the filter condition.
        So we are duplicating the code and what if there are multiple filter conditions then
        we can't write like this.

        We can improve it using interface.
     */

/*
    private boolean checkPrice(Hotel hotel, int price) {
        return hotel.getChargePerNight()<=price;
    }

    private boolean checkHotelStar(Hotel hotel, HotelType hotelType) {
        return hotel.getHotelType()==hotelType;
    }

    public List<Hotel> getHotelsByPrice(int price){
        List<Hotel> hotelList1 = new ArrayList<>();

        for(Hotel hotel:hotelList){
            if(checkPrice(hotel,price)){
                hotelList1.add(hotel);
            }
        }

        return hotelList1;
    }

    public List<Hotel> getHotelByStar(HotelType hotelType){
        List<Hotel> hotelList1 = new ArrayList<>();
        for(Hotel hotel:hotelList){
            if(checkHotelStar(hotel,hotelType)){
                hotelList1.add(hotel);
            }
        }
        return hotelList1;
    }
*/
   // Improvement using interface. Here we are passing interface instace to the function and
    // that implementation will be called

    //Steps
    /*
        1. Create interface for filter with abstract method test
        2. Create concrete classes and implement that test method (Filter logic)
        3. At run time call filter test method.
     */

    public List<Hotel> filterHotelsByCriteria(FilterHotels filterHotels){
        List<Hotel> hotelList1 = new ArrayList<>();
        for(Hotel hotel:hotelList){
            if(filterHotels.test(hotel)){
                hotelList1.add(hotel);
            }
        }
        return hotelList1;
    }
}
