# [Methods](https://login.codingdojo.com/m/315/9299/62845)

## Learning Objectives:
- Be able to declare and define methods in Java
- Understand __method signatures__
- Introduce __overloading__ methods (using the same method name for different purposes)


## Questions

- What is the difference between a __method__ and a __function__?
- What is a __method signature__?
- What is a __method overloading__?

```python
class Pet:

    @classmethod
    def say_breed(cls):
        print("mut")

    def feed(self):
        print("yum")

Pet.make_noise()
fido = Pet()
fido.feed()
```

```java
public class Pet {

    public static Pet[] allPets;

    public static void say_breed(){
        System.out.println("Tyler made this Pet class");
    }

    public void feed(){
        System.out.println("yum");
    }
}

Pet pet = new Pet();
Integer num = 42;
pet.feed()
Pet.say_breed()

```