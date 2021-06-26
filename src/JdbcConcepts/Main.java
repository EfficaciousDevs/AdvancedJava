package JdbcConcepts;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight(100, "PAT", "BLR", 100, 100.0);
        FlightManagementSystem flightManagementSystem = new FlightManagementSystem();
        boolean isFlightAdded = flightManagementSystem.addFlight(flight);

        if (isFlightAdded) {
            System.out.println("Flight details added successfully");
        } else {
            System.out.println("Addition not done");
        }
    }
}