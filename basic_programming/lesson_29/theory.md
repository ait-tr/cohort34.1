Русский текст смотри ниже

<br/>

1. If you need to create a class from which other classes should inherit, but this must be prohibited
creating objects of this parent class, then you can declare the parent class as abstract,
using the abstract keyword before the class name. Objects of an abstract class cannot be created.

2. You can create abstract methods in abstract classes. These are methods whose signature contains
abstract keyword and no method body. Abstract methods must be overridden in child classes.
If a child class does not override an abstract method, then it (the class) must also be declared abstract.

<br/>

1. Если необходимо создать класс от которого должны наследоваться другие классы, но при это надо запретить 
создание объектов этого родительского класса, то можно объявить родительский класс как абстрактный, 
используя ключевое слово abstract перед именем класса. Объекты абстрактного класса создавать нельзя.

2. В абстрактных классах можно создавать абстрактные методы. Это методы у которых в сигнатуре присутствует 
ключевое слово abstract и отсутствует тело метода. Абстрактные методы должны быть переопределены в дочерних классах. 
Если дочерний класс не переопределяет абстрактный метод, то он (класс) тоже должен быть объявлен как абстрактный.
