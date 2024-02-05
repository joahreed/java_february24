# [Constructors and Method Overloading](https://login.codingdojo.com/m/315/9380/63309)

## Learning Objectives:
- Introduction to __constructors__
- __Overloading__ constructors


>A constructor method is a special function that gets called when an instance of an object is created. 

```python
class User:

    def __init__(self, data):
        self.id = data['id']
        self.first_name = data['first_name']
        self.last_name = data['last_name']
        self.password = data['password']
```

- in Java:

```java

public class User {

    Long id;
    String firstName;
    String lastName;
    String password;

    public User(Long id, String firstName, String lastName, String password){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }
}




