# Encapsulation Tasks

## Easy: MultiMart Pricing System

**Scenario:** An e-commerce application manages product listings. Prices should not be incorrectly updated.

**Task:**
- Create a `Product` class with private variables:
  - `productName` (String)
  - `price` (double)
  - `discountPercentage` (double)

- Create a constructor to initialize `productName` and `price`.

- Provide a getter for `productName`.

- **Validation 1:** Write a setter for `price`.  
  - Price should not be negative.  
  - If negative, print: `"Invalid Price"` and do not update.

- **Validation 2:** Write a setter for `discountPercentage`.  
  - Value must be between 0 and 100.

- **Derived Getter:** Write a method:
  `public double getFinalPrice()`
  - Calculate and return price after applying discount  
  - Do NOT store final price in a separate variable  

---

## Medium: J-Tasker Process Manager

**Scenario:** A virtual process management engine where improper state changes can crash the system.

**Task:**
- Create a `TaskProcess` class with private variables:
  - `processId` (String)
  - `memoryUsed` (int)
  - `status` (String: "PENDING", "RUNNING", "STOPPED")

- **Immutability:** - `processId` should be set only via constructor  
  - No setter allowed  

- Default `status` should always be `"PENDING"` when object is created.

- **State Machine Rules:**
  - Do NOT create a generic setter for status  

  - Create:
    `public void startProcess()`
    - Changes status to `"RUNNING"`  
    - If already `"STOPPED"`, print:  
      `"Cannot restart a stopped process"`

  - Create:
    `public void stopProcess()`
    - Changes status to `"STOPPED"`

- Create:
  `public void allocateMemory(int mb)`
  - Increase `memoryUsed` ONLY if status is `"RUNNING"`  

---

## Hard: Social Health Ecosystem Tracker

**Scenario:** A lifestyle health app tracks user activity and health metrics. Data integrity is critical.

**Task:**
- Create a `HealthProfile` class with private variables:
  - `userId` (String)
  - `dailySteps` (int)
  - `weight` (double)
  - `lastUpdatedDate` (String)

- **Append-Only Logic:**
  `public void addSteps(int steps)`
  - Steps cannot be negative  
  - Add steps to existing `dailySteps`

- **Data Integrity:**
  `public void updateWeight(double newWeight)`
  - If weight change is greater than 5kg, reject update  
  - Print: `"Suspicious weight change detected. Update failed."`

- **System Action:**
  `public void resetDailyMetrics(String newDate)`
  - Reset `dailySteps` to 0  
  - Update `lastUpdatedDate`

- **Hidden Calculation:**
  `public double getEstimatedCaloriesBurned()`
  - Formula: `1 step = 0.04 calories`  
  - Calculate dynamically (no extra variable)

---

## Easy: The Train Travel Wallet

**Scenario:** A digital wallet manages travel fare. The balance should never be manipulated directly or go into the negative.

**Task:**
- Create a `TravelWallet` class with private variables:
  - `walletId` (String)
  - `balance` (double)

- **Constructor:** Initialize `walletId` and set `balance` to 0.0.

- Provide getters for `walletId` and `balance`.

- **Encapsulated Methods:**
  - `public void addMoney(double amount)`: 
    - Check if the amount is greater than 0 before adding. 
    - If negative/zero, print: `"Invalid deposit amount"`.
  - `public void deductFare(double fare)`: 
    - Check if `balance >= fare`. If yes, deduct it. 
    - If no, print: `"Insufficient funds for this journey"`.

- **Strict Rule:** Do NOT write a generic `setBalance()` method.

---

## Medium: Packet-Crafter Server Config

**Scenario:** A server configuration system where changing the port number while the server is actively running is a critical security flaw.

**Task:**
- Create a `ServerConfig` class with private variables:
  - `portNumber` (int)
  - `isServerRunning` (boolean)

- **Constructor:** Set `portNumber` to 8080 by default, and `isServerRunning` to false.

- **State Machine Logic:**
  - `public void startServer()`: Sets `isServerRunning` to true.
  - `public void stopServer()`: Sets `isServerRunning` to false.

- **The Gatekeeper:**
  - `public void changePort(int newPort)`: 
    - You can **only** update the `portNumber` if `isServerRunning` is `false`. 
    - If true, reject it and print: `"Access Denied: Cannot change port while server is active."`

---

## Hard: Strict Error Log Book System

**Scenario:** A daily log book for coding errors. Data integrity must be flawless—you mathematically cannot resolve an error that you haven't logged yet!

**Task:**
- Create an `ErrorLog` class with private variables:
  - `logDate` (LocalDate)
  - `totalErrorsLogged` (int)
  - `resolvedErrors` (int)

- **Constructor:** Initialize `logDate` with today's date (`LocalDate.now()`). The integer variables should start at 0.

- **Append-Only Logic:**
  - `public void logNewError()`: Increases `totalErrorsLogged` by 1.

- **Strict Validation:**
  - `public void markErrorResolved()`: Increases `resolvedErrors` by 1. 
  - *Rule:* `resolvedErrors` can **never** be greater than `totalErrorsLogged`. If attempted, print: `"Integrity Error: Cannot resolve more errors than logged."`

- **Hidden Calculation:**
  - `public double getResolutionRate()`: Calculate and return the percentage of solved errors `(resolvedErrors / totalErrorsLogged) * 100.0`. 
  - *Edge Case:* Handle division by zero. If `totalErrorsLogged` is 0, return 0.0.