Русский текст смотри ниже

# Lambda expression

Functional programming is a programming paradigm in which the computation process is treated
as the calculation of the values of functions in the mathematical understanding of the latter (as opposed to functions as subroutines
in procedural programming).
 
If, when using a functional interface, the lambda expression consists of a single method call,
then you can use the method reference syntax.

Method reference syntax for static methods: Class::method, for object methods: object::method,
for constructors: Class::new.

#Streams
Functional Streams can be created for any iterable object. Stream is a sequence of operations
over the elements of the iterable object.

Streams consist of intermediate and terminal operations. There may be several intermediate operations and they
They always return the stream. There can only be one terminal operation, and it is placed at the end of the stream. Terminal
the operation returns the result of the entire stream.

Stream "lazy". That is, the stream will start working only when a terminal operation is added to it.

For details about the stream's operation scheme and basic operations, see the presentation.

<br/>

# Лямбда-выражение

Функциональное программирование — парадигма программирования, в которой процесс вычисления трактуется 
как вычисление значений функций в математическом понимании последних (в отличие от функций как подпрограмм 
в процедурном программировании).
 
Если при использовании функционального интерфейса, лямбда выражение состоит из вызова одного метода, 
то можно использовать синтаксис method reference.

Синтаксис method reference для статических методов: Class::method, для методов объектов: object::method, 
для конструкторов: Class::new.

# Streams
Functional Streams можно создать для любого итерируемого объекта. Стрим это последовательность операций 
над элементами итерируемого объекта.

Стримы состоят из промежуточных и терминальных операций. Промежуточных операций может быть несколько и они 
всегда возвращают стрим. Терминальная операция может быть только одна, и она помещается в конец стрима. Терминальная 
операция возвращает результат работы всего стрима.

Стрим "ленивый". Т. е. стрим начнет работать, только когда к нему будет добавлена терминальная операция.

Подробно о схеме работы стрима и основных операциях, смотрите в презентации.

[Functional Programming in Java](https://github.com/ait-tr/cohort34.1/blob/main/basic_programming/lesson_54/FP.pdf)