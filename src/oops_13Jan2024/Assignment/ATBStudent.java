package src.oops_13Jan2024.Assignment;

public class ATBStudent {
    public static void main(String[] args) {
        ATB[] ATBStudents = new ATB[3];
        ATBStudents[0] = new ATB("Shirin", 25, "Physics");
        ATBStudents[1] = new ATB("Raj", 22, "Chemistry");
        ATBStudents[2] = new ATB("Muskan", 29, "Biotech");

        for (int i = 0; i < ATBStudents.length; i++) {
            System.out.println(ATBStudents[i].toString());
        }
    }
}
