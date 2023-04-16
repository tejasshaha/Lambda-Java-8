public class FilterByStar implements FilterHotels{
    @Override
    public boolean test(Hotel hotel) {
        return hotel.getHotelType()==HotelType.FIVE_STAR;
    }
}
