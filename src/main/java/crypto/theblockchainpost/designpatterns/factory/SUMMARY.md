# Factory Pattern

---

### Chapter 1

The factory pattern is used ...

> - Factories handle the details of object creation.  
> - This is the only place in the code that refers to **new** instances of the object the factory is returning.



**Design principle**:
> ...
> 


#### Simple Factory
A simple factory is an object that can be injected into different components and just identify which 
concrete implementation should be instantiated depending on the parameters sent.

The create method of the factory is *often* declared statically. 

> The "simple factory" is not actually a design pattern but more of a programming idiom.


> A factory method handles object creation and encapsulates it in a subclass. This decouples
> the client code in the super class from the object creation code in the subclass.

