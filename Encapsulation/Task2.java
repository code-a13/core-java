package Encapsulation;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- J-Tasker Initialization ---");
        System.out.print("Enter a new Process ID (e.g., PROC-001): ");
        String pId = sc.nextLine();
        
        TaskProcess process = new TaskProcess(pId);
        System.out.println("\n[+] Process Created! ID: " + process.getProcessId() + " | Current Status: " + process.getStatus());

        System.out.println("\n--- Testing Security (Allocation before Start) ---");
        System.out.print("Enter memory to allocate (in MB): ");
        int mem1 = sc.nextInt();
        process.allocateMemory(mem1);

      
        System.out.println("\n--- Starting Process ---");
        System.out.println("Press 1 to Start the process: ");
        int startChoice = sc.nextInt();
        if(startChoice == 1) {
            process.startProcess();
        }

        System.out.println("\n--- Testing Memory Allocation (While Running) ---");
        System.out.print("Enter memory to allocate (in MB): ");
        int mem2 = sc.nextInt();
        process.allocateMemory(mem2);

        System.out.println("\n--- Stopping Process ---");
        System.out.println("Press 0 to Stop the process: ");
        int stopChoice = sc.nextInt();
        if(stopChoice == 0) {
            process.stopProcess();
        }

        System.out.println("\n--- Testing Security (Restarting Stopped Process) ---");
        System.out.println("Attempting to restart...");
        process.startProcess();

        System.out.println("\n==================================");
        System.out.println("Final Process State:");
        System.out.println("ID: " + process.getProcessId());
        System.out.println("Memory Used: " + process.getMemoryUsed() + " MB");
        System.out.println("Status: " + process.getStatus());
        System.out.println("==================================");

        sc.close();
    }
}

class TaskProcess {
   
    private String processId;
    private int memoryUsed;
    private String status; 

    public TaskProcess(String processId) {
        this.processId = processId;
        this.memoryUsed = 0;
        this.status = "PENDING";
    }

    // Getters
    public String getProcessId() {
        return processId;
    }

    public int getMemoryUsed() {
        return memoryUsed;
    }

    public String getStatus() {
        return status;
    }

    public void startProcess() {
        if (status.equals("STOPPED")) {
            System.out.println("[-] Error: Cannot restart a stopped process. Please spawn a new process.");
        } else if (status.equals("RUNNING")) {
            System.out.println("[-] Process is already running.");
        } else {
            status = "RUNNING";
            System.out.println("[+] Process started successfully.");
        }
    }

    public void stopProcess() {
        if (status.equals("STOPPED")) {
            System.out.println("[-] Process is already stopped.");
        } else {
            status = "STOPPED";
            System.out.println("[+] Process stopped gracefully.");
        }
    }

    public void allocateMemory(int mb) {
        if (status.equals("RUNNING")) {
            if (mb > 0) {
                memoryUsed += mb;
                System.out.println("[+] Allocated " + mb + " MB. Total memory: " + memoryUsed + " MB.");
            } else {
                System.out.println("[-] Invalid memory amount! Must be greater than 0.");
            }
        } else {
            System.out.println("[-] Security Alert: Cannot allocate memory. Process is currently " + status + ".");
        }
    }
}