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