public class FilterByPrice implements FilterHotels{
    @Override
    public boolean test(Hotel hotel) {
        return hotel.getChargePerNight()<=5000;
    }
}
