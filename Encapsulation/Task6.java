package Encapsulation;
import java.time.LocalDate;

public class Task6 {
    public static void main(String[] args) {
   
        ErrorLog myLog = new ErrorLog();
        
        System.out.println("--- Coding Session Started ---");
        myLog.logNewError();
        myLog.logNewError();
        myLog.logNewError(); 
        
        System.out.println("\n--- Resolving Errors ---");
        myLog.markErrorResolved();
        myLog.markErrorResolved(); 
        
        System.out.println("\nDaily Report");
        System.out.println("Current Resolution Rate: " + myLog.getResolutionRate() + "%");
        
        System.out.println("\nTesting Security (Hacker Mode)");

        myLog.markErrorResolved(); 
        myLog.markErrorResolved(); 
    }
}

class ErrorLog {
    private LocalDate logDate;
    private int totalErrorsLogged;
    private int resolvedErrors;


    public ErrorLog() {
        this.logDate = LocalDate.now(); 
        this.totalErrorsLogged = 0;
        this.resolvedErrors = 0;
    }

    public void logNewError() {
        this.totalErrorsLogged++;
        System.out.println("[+] New error logged. Total Errors: " + this.totalErrorsLogged);
    }

    public void markErrorResolved() {
        if (this.resolvedErrors < this.totalErrorsLogged) {
            this.resolvedErrors++;
            System.out.println("[+] Error resolved! Total Resolved: " + this.resolvedErrors);
        } else {
            System.out.println("[-] Integrity Error: Cannot resolve more errors than logged!");
        }
    }

    
    public double getResolutionRate() {
        
        if (this.totalErrorsLogged == 0) {
            return 0.0;
        }
        
        return ((double) this.resolvedErrors / this.totalErrorsLogged) * 100.0;
    }
}