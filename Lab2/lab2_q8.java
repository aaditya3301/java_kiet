// WAP to create a Room class, the attributes of this class are roomno, roomtype, roomarea and ACmachine. In this class the member functions are setData and displayData. Use member function to set data and display that data using displayData() method.

class Room {
    int roomNo;
    String roomType;
    double roomArea;
    boolean acMachine;

    void setData(int roomNo, String roomType, double roomArea, boolean acMachine) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.acMachine = acMachine;
    }
    
    void displayData() {
        System.out.println("Room Number: " + roomNo);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Area: " + roomArea);
        System.out.println("AC Machine: " + (acMachine ? "Yes" : "No"));
    }
}

class lab2_q8 {
    public static void main(String[] args) {
        Room room = new Room();
        room.setData(101, "Deluxe", 450.5, true);
        room.displayData();
    }
}
