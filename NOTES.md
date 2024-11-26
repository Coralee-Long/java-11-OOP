# OOP - NOTES

## ⭐️ Classes 101

- **Classes** encapsulate data (attributes) & behaviours (methods).
- A **Constructor** is a special method used to initialize objects.
- **Attributes** (also called fields or properties) represent the state of an object.
- **Methods** define the behaviours or actions an object can perform.
- **Getters** & **Setters** are used to access and modify private attributes.

```java
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

