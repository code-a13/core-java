#  Encapsulation Tasks

##  Easy: MultiMart Pricing System

**Scenario:**  
An e-commerce application manages product listings. Prices should not be incorrectly updated.

**Task:**
- Create a `Product` class with private variables:
  - `productName` (String)
  - `price` (double)
  - `discountPercentage` (double)

- Create a constructor to initialize `productName` and `price`.

- Provide a getter for `productName`.

- **Validation 1:**  
  Write a setter for `price`.  
  - Price should not be negative.  
  - If negative, print: `"Invalid Price"` and do not update.

- **Validation 2:**  
  Write a setter for `discountPercentage`.  
  - Value must be between 0 and 100.

- **Derived Getter:**  
  Write a method:
  `public double getFinalPrice()`
  - Calculate and return price after applying discount  
  - Do NOT store final price in a separate variable  

---

##  Medium: J-Tasker Process Manager

**Scenario:**  
A virtual process management engine where improper state changes can crash the system.

**Task:**
- Create a `TaskProcess` class with private variables:
  - `processId` (String)
  - `memoryUsed` (int)
  - `status` (String: "PENDING", "RUNNING", "STOPPED")

- **Immutability:**  
  - `processId` should be set only via constructor  
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

**Scenario:**  
A lifestyle health app tracks user activity and health metrics. Data integrity is critical.

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