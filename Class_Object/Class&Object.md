# Classes & Objects

---

## 1. Blueprint Tester

### Task
Create a class `Student` with:
- `name` (String)
- `cgpa` (double)

Add a method:
- `study()` → prints: `[name] is studying. CGPA is [cgpa]`

In `main`:
- Create 2 objects
- Assign different values
- Call `study()` for both

### Concept
Different objects store different data.

---

## 2. State Manipulation

### Task
Create a class `BankAccount` with:
- `accountHolder` (String)
- `balance` (double)

Methods:
- `deposit(amount)` → add to balance
- `withdraw(amount)` → 
  - subtract if enough balance  
  - else print `"Insufficient funds"`

In `main`:
- Deposit 5000  
- Withdraw 6000 (fail)  
- Withdraw 2000 (success)  
- Print final balance  

### Concept
Methods control and protect data.

---

## 3. Object Interaction

### Task
Create a class `Player` with:
- `name` (String)
- `health` (int = 100)

Method:
- `attack(Player enemy)` → reduce enemy health by 20

In `main`:
- Create 2 players: Sub-Zero, Scorpion  
- Attack twice  
- Print both health values  

### Concept
Objects can interact by passing references.

---

## 4. Shopping Cart System

### Task
Create a class `Product` with:
- `id`
- `name`
- `price`
- `stockQuantity`

Create a class `Cart` with:
- `totalAmount` (default = 0)

Method in Cart:
- `addProduct(Product p, int quantity)`

### Logic
- If enough stock:
  - Reduce `stockQuantity` in Product  
  - Increase `totalAmount` in Cart  
- Else:
  - Print `"Out of stock for [Product Name]"`

### In main
- Create 2 products  
- Add them to cart  
- Print:
  - Final cart total  
  - Remaining stock of products  

### Concept
Objects interacting across multiple classes with shared state updates.

---

## 5. Cab Aggregator (Mini Uber)

### Task

Create class `Driver`:
- `name`
- `isAvailable`
- `currentLocation` (1–100)

Create class `Rider`:
- `name`
- `pickupLocation`
- `dropLocation`

Create class `RideApp`:
- Method `bookCab(Rider r, Driver d)`

### Logic
- Calculate distance between driver and rider pickup  
- If driver is available:
  - Calculate fare → `(drop - pickup) * 15`
  - Set `isAvailable = false`
  - Update driver location → rider drop location  

### In main
- Simulate a ride booking  
- Print:
  - Fare  
  - Driver’s new location  

### Concept
Real-world object coordination and state transition (mini system design).