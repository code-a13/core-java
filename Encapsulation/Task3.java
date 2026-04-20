package Encapsulation;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- HealthTech Ecosystem Initialized ---");
        System.out.print("Enter User ID (e.g., ADI-99): ");
        String uId = sc.nextLine();
        
        System.out.print("Enter Current Weight (in kg): ");
        double initialWeight = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Today's Date (YYYY-MM-DD): ");
        String date = sc.nextLine();

        HealthProfile profile = new HealthProfile(uId, initialWeight, date);
        System.out.println("\n[+] Profile created for User: " + profile.getUserId());

        System.out.println("\n--- Syncing Steps ---");
        System.out.print("Enter steps walked this morning: ");
        int morningSteps = sc.nextInt();
        profile.addSteps(morningSteps);

        System.out.print("Enter steps walked this evening: ");
        int eveningSteps = sc.nextInt();
        profile.addSteps(eveningSteps);

        System.out.println("\n--- Testing Security (Negative Steps) ---");
        System.out.println("Hacker tries to reduce steps by passing -500...");
        profile.addSteps(-500);

        System.out.println("\n--- Updating Weight ---");
        System.out.print("Enter new weight (Try a difference > 5kg to test validation): ");
        double newWeight = sc.nextDouble();
        profile.updateWeight(newWeight);

        System.out.println("\n--- Current Metrics ---");
        System.out.println("Total Steps: " + profile.getDailySteps());
        System.out.println("Estimated Calories Burned: " + profile.getEstimatedCaloriesBurned() + " kcal");

        System.out.println("\n--- System Action: Midnight Reset ---");
        sc.nextLine(); 
        System.out.print("Enter new Date (YYYY-MM-DD): ");
        String newDate = sc.nextLine();
        profile.resetDailyMetrics(newDate);

        System.out.println("\n==================================");
        System.out.println("Next Day Profile State:");
        System.out.println("ID: " + profile.getUserId());
        System.out.println("Date: " + profile.getLastUpdatedDate());
        System.out.println("Steps: " + profile.getDailySteps());
        System.out.println("Calories Burned: " + profile.getEstimatedCaloriesBurned());
        System.out.println("Weight: " + profile.getWeight() + " kg");
        System.out.println("==================================");

        sc.close();
    }
}

class HealthProfile {
    private String userId;
    private int dailySteps;
    private double weight;
    private String lastUpdatedDate;

    public HealthProfile(String userId, double weight, String date) {
        this.userId = userId;
        this.weight = weight;
        this.lastUpdatedDate = date;
        this.dailySteps = 0; 
    }

    public String getUserId() {
        return userId;
    }

    public int getDailySteps() {
        return dailySteps;
    }

    public double getWeight() {
        return weight;
    }

    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void addSteps(int steps) {
        if (steps > 0) {
            this.dailySteps += steps;
            System.out.println("[+] Successfully added " + steps + " steps. Total: " + this.dailySteps);
        } else {
            System.out.println("[-] Error: Steps cannot be negative or zero. Data sync rejected.");
        }
    }

    public void updateWeight(double newWeight) {
        double difference = Math.abs(this.weight - newWeight); 
        
        if (difference > 5.0) {
            System.out.println("[-] Suspicious weight change detected (" + difference + " kg). Update failed.");
        } else if (newWeight <= 0) {
            System.out.println("[-] Invalid weight entered.");
        } else {
            this.weight = newWeight;
            System.out.println("[+] Weight successfully updated to " + this.weight + " kg.");
        }
    }

    public void resetDailyMetrics(String newDate) {
        this.dailySteps = 0;
        this.lastUpdatedDate = newDate;
        System.out.println("[System] Metrics reset for new day: " + newDate);
    }

    public double getEstimatedCaloriesBurned() {
        return this.dailySteps * 0.04;
    }
}