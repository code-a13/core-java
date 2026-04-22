# Inheritance Tasks

**Task: 1**
- Create a parent class `Doctor` with a variable:
  - `hospitalName` (String)

- Create a parameterized constructor in `Doctor` to initialize `hospitalName`.

- Create a child class `Surgeon` that extends `Doctor`.

- **Challenge:** - Write the constructor for `Surgeon` so that it accepts `hospitalName` and explicitly passes it to the parent using `super()`.
  - In `main`, create a `Surgeon` object and print the hospital name to verify the constructor chain worked.

---

**Task: 2**
- Create a parent class `Product` with a method `double calculatePrice(double basePrice)` that simply returns the `basePrice`.

- Create a child class `Electronics` that extends `Product`.

- **Challenge:**
  - Override `calculatePrice(double basePrice)` in the child class. Use the `@Override` annotation.
  - The overridden method should calculate an 18% GST, add it to the base price, and return the new total.
  - In `main`, create an object for `Product` and an object for `Electronics`. Call both methods to prove that the child class calculates the tax correctly while the parent remains unchanged.

---

**Task: 3**
- Create a parent class `NetworkPacket` with a method:
  - `public void send()` that prints: `"Adding IP Headers..."`

- Create a child class `TCPPacket` that extends `NetworkPacket`.

- **Challenge:**
  - Override the `send()` method in the child class.
  - Inside the child's `send()` method, use `super.send()` to execute the parent's print statement FIRST.
  - Right after that, print `"Adding TCP sequence numbers..."`.

---

**Task: 4**
- Create a parent class `User` with:
  - `String role = "Basic";`
  - A method `void getAccess()` that prints: `"Access Restricted"`.

- Create a child class `Admin` that extends `User` with:
  - `String role = "SuperUser";`
  - An overridden method `void getAccess()` that prints: `"Access Granted"`.

- **Challenge:**
  - In your `main` method, write exactly this line:
    `User myUser = new Admin();`
  - Print `myUser.role` and call `myUser.getAccess()`.
  - *Interview Question:* Explain in comments (in Tanglish) why the variable outputs the Parent's value ("Basic"), but the method outputs the Child's logic ("Access Granted")!

---

**Task: 5**
- Create a base class `CoreRouter`.

- **The Gatekeeper Challenge:**
  - Figure out which Java keyword you need to add to the class declaration to completely block inheritance.
  - Apply the keyword to `CoreRouter`.
  - Write a second class: `class HackedRouter extends CoreRouter`.
  - Prove the restriction works by demonstrating that the compiler immediately throws an error (e.g., "cannot inherit from...").