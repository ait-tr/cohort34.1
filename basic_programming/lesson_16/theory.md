Русский текст смотри ниже



1. Java projects consist of a huge number of classes. To organize the structure of projects, classes are divided into packages.
    Packages are named using a dot. For example: ``ait.company.model``. The fully qualified class name includes the package name. For example:
    ``ait.company.model.Person``.
2. The ``static`` modifier makes it possible to access, for example, a class method using the class name. For example
    ``Math.random()``. Methods with the ``public`` access modifier can be called from other classes. Methods with modifier
    ``private`` access can only be called within the class itself. They serve as "utility" methods.
3. ``char`` is a primitive type for storing a two-byte positive integer. Typically used to store the numeric value of a character from an ASCII table. To write a value, you can use the character itself enclosed in single quotes. For example: ``char c = 'A';``
4. ``String`` is a special data type for storing objects consisting of many characters (text strings). Data of type ``String`` are written in double quotes. For example: ``String str = "Hello!";``. Several strings can be combined into one using the concatenation operator (+). For example: ``String str = "Hello" + " " + "world";``
5. A string can be used as a "switch" in a ``switch-case`` statement.
6. Three features of object-oriented programming: encapsulation, inheritance, polymorphism.
7. Encapsulation - combining in an object various data characterizing the state of the object (field), and the functionality responsible for its behavior (methods).

<br/><br/>

1. Java проекты состоят из огромного числа классов. Для организации структуры проектов, классы разносят по пакетам.
   Имена пакетам дают через точку. Например: ``ait.company.model``. Полное имя класса включает название пакета. Например:
   ``ait.company.model.Person``. 
2. Модификатор ``static`` дает возможность обратиться, например, к методу класса, используя имя класса. Например 
   ``Math.random()``. Методы с модификатором доступа ``public`` можно вызывать из других классов. Методы с модификатором 
   доступа ``private`` можно вызывать только внутри самого класса. Они выполняют роль "служебных" методов.
3. ``char`` - это примитивный тип для хранения двубайтового положительного целого числа. Как правило используется для хранения числового значения символа из таблицы ASCII. Для записи значения можно использовать и сам символ заключенный в одинарные кавычки. Например: ``char c = 'A';``
4. ``String`` специальный тип данных, для хранения объектов состоящих из множества символов (текстовых строк). Данные типа ``String``  записываются в двойных кавычках. Например: ``String str = "Hello!";``. Несколько стрингов можно объеденить в один, используя операцию конкатенации (+). Например: ``String str = "Hello" + " " + "world";``
5. Стринги можно использовать в качестве "переключателя" в операторе ``switch-case``.
6. Три признака Объектно-ориентированного программирования: инкапсуляция, наследование, полиморфизм.
7. Инкапсуляция - объеденение в объекте разнообразных данных характеризующих состояние объекта (поля), и функциональность отвечающую за его поведение (методы).