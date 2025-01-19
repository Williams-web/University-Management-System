public class Hostel {
    public String hostelName;
    public String hostelLocation;
    public int numberOfRooms;

    public void setHostelDetails(String name, String location, int rooms) {
        hostelName = name;
        hostelLocation = location;
        numberOfRooms = rooms;
    }

    public String printHostelDetails(){
        return "Hostel Name: " + hostelName + "\nHostel Location: " + hostelLocation + "\nNumber of Rooms: " + numberOfRooms;
    }


}
