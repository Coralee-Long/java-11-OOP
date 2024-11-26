# OOP - NOTES

## ⭐️ Classes 101

- **Classes** encapsulate data (attributes) & behaviours (methods).
- A **Constructor** is a special method used to initialize objects.
- **Attributes** (also called fields or properties) represent the state of an object.
- **Methods** define the behaviours or actions an object can perform.
- **Getters** & **Setters** are used to access and modify private attributes.

### 💡 Basic Example:

```java
// Person.java

public class Person {
    // define attributes
    String name;
    int age;
    char gender;
    boolean married;

    // create constructor
    public Person(String name, int age, char gender, boolean married) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.married = married;
    }

    // create methods:
    public void introduce() {
        String isMarried = married ? "Married" : "Unmarried";
        String myGender = gender == 'm' || gender == 'M'  ? "Male" : "Female";
        System.out.println("Hello, I am " + this.name + " and " + this.age + " years old. My gender is " + myGender + " and I am " + isMarried);
    }
}
```
```java
// Main.java

public class Main {
    public static void main(String[] args) {

Person person = new Person("John Doe", 27, 'M', true);
        person.introduce();
    }
}
```

---

### 💡 Example with Getter & Setter methods:

```java
// Student.java

public class Student {
    
    // 1. Define attributes
    String name;
    int age;
    String address;
    
    // 2. Create a constructor
    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    // 3. Add Methods like getters and setters
        
    // Getter Methods (Read)
    public voic getName(String name) {
        this.name = name;
    }

    public voic getAge(int age) {
        this.age = age;
    }

    public voic getAddress(String address) {
        this.address = address;
    }
        
    // Setter Methods (Write)
    public voic setName(String name) {
        this.name = name;
    }

    public voic setAge(int age) {
        this.age = age;
    }

    public voic setAddress(String address) {
        this.address = address;
    }
}
```

## ⭐️ Important Notes 
### ℹ️ When Writing Methods for Classes:

```java
// Person.java

public class Person {
    // define attributes
    String name;
    int age;

    // Correct way to write the method:
    public void introduce() {
        ("Hello, I am " + this.name + " and " + this.age + " years old.")
    }

    // Incorrect way to do the method:
    public void introduce(String name, int Age) {
        ("Hello, I am " + name + " and " + age + " years old.")
    }
}
```

```java
// Main.java

public class Main {
    public static void main(String[] args) {  
        
    // Correct Way:
    Person person = new Person("John Doe", 27);
    person.introduce();
    
    // Incorrect Way:
    Person person = new Person();
    person.introduce("John Doe", 27);
    }
}
```
---
