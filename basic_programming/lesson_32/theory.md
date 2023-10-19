Русский текст смотри ниже

<br/>

1. Starting from Java 8, you can use default methods in interfaces.
This method is marked with the default keyword and has a ready-made implementation.
Default methods do not need to be overridden.

2. The interface fields are constants by default. That is, those marked as public static final.

3. Starting with Java 5, Generics appeared in the language - parameterized types and methods.
The goal of generics is to make it possible to write universal, strongly typed code, in which the solution
about the specific type is postponed “for later”. For example, the type on which the object “specializes”
is determined not at the time of class creation, but at the time of object creation.
The (generic) parameter is indicated in angle brackets - ``<T>``.

4. Starting with Java 8, the Predicate``<T>`` interface appeared.
This interface has a single abstract method: boolean test(T t);
Objects of the Predicate type are used to organize selection by condition (filtering).

5. In Java, you can create objects of anonymous classes. That is, create objects of interfaces, or abstract classes,
at the same time, immediately, on the spot, implementing abstract methods. Since Java 8, for interfaces and abstract classes
Having only one abstract method, you can use the simplified syntax of lambda expressions:
(arguments) -> method body.

6. UML (Unified Modeling Language) is a graphical description language for object modeling in the field of software development, for modeling business processes, system design and displaying organizational structures. UML is a general language, an open standard that uses graphical notation to create an abstract model of a system, called a UML model. UML was created to define, visualize, design, and document primarily software systems. UML is not a programming language, but code generation is possible based on UML models.

7. Class diagram - a static structural diagram that describes the structure of the system, demonstrating the classes of the system, their attributes, methods and dependencies between classes.

<br/>

1. Начиная с Java 8 в интерфейсах можно использовать дефолтные методы. 
Такой метод помечается ключевым словом default и имеет готовую реализацию. 
Дефолтные методы не обязательно переопределять.

2. Полями интерфейса по умолчанию являются константы. Т. е. помеченные как public static final.

3. Начиная с Java 5 в языке появились Generics - параметризованные типы и методы. 
Задача дженериков, сделать возможным писать универсальный строго типизированный код, в котором решение
о конкректном типе откладывается "на потом". Например тип на котором "специализируется" объект 
определяется не в момент создания класса, а в момент создания объекта. 
Параметр (generic) указывается в угловых скобках - ``<T>``.

4. Начиная с Java 8, появился интерфейс Predicate``<T>``. 
В этом интерфейсе есть единственный абстрактный метод: boolean test(T t); 
Объекты типа Predicate используются для организации выборки по условию (фильтрации). 

5. В Java можно создавать объекты анонимных классов. Т. е. создавать объекты интефейсов, или абстрактных классов, 
при этом сразу, на месте, имплементируя абстрактные методы. Начиная с Java 8, для интерфейсов и абстрактных классов 
имеющих только один абстрактный метод, можно использовать упрощенный синтаксис лямбда выражений: 
(arguments) -> method body. 

6. UML (Unified Modeling Language — унифицированный язык моделирования) — язык графического описания для объектного моделирования в области разработки программного обеспечения, для моделирования бизнес-процессов, системного проектирования и отображения организационных структур. UML является языком широкого профиля, это — открытый стандарт, использующий графические обозначения для создания абстрактной модели системы, называемой UML-моделью. UML был создан для определения, визуализации, проектирования и документирования, в основном, программных систем. UML не является языком программирования, но на основании UML-моделей возможна генерация кода. 

7. Диаграмма классов (Class diagram) — статическая структурная диаграмма, описывающая структуру системы, демонстрирующая классы системы, их атрибуты, методы и зависимости между классами. 
