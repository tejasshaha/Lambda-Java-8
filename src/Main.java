import java.util.List;

public class Main {

    public static void main(String[] args){
/*

        // Without interface and lambda

        HotelService hotelService= new HotelService();
        List<Hotel> hotelList=hotelService.getHotelsByPrice(5000);
        System.out.println("List of hotels with price <=5000" + hotelList);
        List<Hotel> hotelList1=hotelService.getHotelByStar(HotelType.FIVE_STAR);
        System.out.println("Five Star Hotels " + hotelList1);
 */

        // Using interface
//        HotelService hotelService= new HotelService();
//        List<Hotel> hotelList=hotelService.filterHotelsByCriteria(new FilterByPrice());
//        System.out.println("List of hotels with price <=5000" + hotelList);
//        List<Hotel> hotelList1=hotelService.filterHotelsByCriteria(new FilterByStar());
//        System.out.println("Five Star Hotels " + hotelList1);

        //Using Lambda's
        /*
            - Here we don't need to create concrete classes
            - We can simply create interface only
            - Syntax of Lambda - (Parameters -> { return business_logic })
            - If single parameter and single line business logic we can ignore type and curly braces.
              Also return and semicolon is not required and it can be treated as expression only.
         */
        HotelService hotelService= new HotelService();
        List<Hotel> hotelList2 = hotelService.filterHotelsByCriteria( (Hotel hotel) -> {
           return hotel.getChargePerNight()<=10000;
        });
        System.out.println(hotelList2);

        // Here single line expression is used.
        List<Hotel> hotelList3 = hotelService.filterHotelsByCriteria(hotel ->
                hotel.getHotelType()==HotelType.FIVE_STAR);
        System.out.println(hotelList3);
    }

}
