Русский текст смотри ниже


1. In Java, there are structures that can only work with objects, but not with primitives.
To solve this problem, Java has created "wrapper classes" for each primitive type:
Byte, Short, Character, Integer, Long, Float, Double, Boolean.
Each such class encapsulates a corresponding primitive type. For ease of working with wrapper classes,

2. Java implements autoboxing and autounboxing mechanisms.
This means that we can use objects of “wrapper classes” in mathematical operations equally
with primitive types. Java will automatically convert the "wrapper class" object if necessary
into the corresponding primitive type (autounboxing), or vice versa - the primitive type will be packed into an object
class wrapper (autoboxing).

2. Wrapper classes also have useful constants and methods. For example, Integer.MAX_VALUE stores the maximum possible
number is an integer type, and the static methods Double.isNaN(double a) and Double.isInfinite(double a),
can check whether the passed argument stores the special values NaN and Infinite, respectively.

3. Wrapper classes, using parsing methods (starting with the word parse...), can convert thongs
into the primitive type corresponding to this wrapper class. If the string contains text that can be interpreted
as a number, then parsing will be successful. If not, there will be an error.

<br/>

1. В Java существуют структуры, которые могут работать только с объектами, но не с примитивами. 
Для решения этой проблемы в Java созданы "классы обертки", для каждого примитивного типа: 
Byte, Short, Character, Integer, Long, Float, Double, Boolean. 
Каждый такой класс инкапсулирует соответствующий примитивный тип. Для удобства работы с wrapper classes, 

2. в Java реализован механизм автоупаковки (autoboxing) и автораспаковки (autounboxing). 
Это означает, что мы можем использовать в математических действиях объекты "классов оберток" наравне 
с примитивными типами. Java, при необходимости, автоматически преобразует объект "класса обертки" 
в соответствующий ему примитивный тип (autounboxing), или наоборот - примитивный тип упакует в объект 
wrapper класса (autoboxing).

2. Wrapper classes также имеют полезные константы и методы. Например Integer.MAX_VALUE хранит максимально возможное 
число целого типа, а статические методы Double.isNaN(double a) и Double.isInfinite(double a), 
могут проверить хранит ли передаваемый аргумент специальные значения NaN и Infinite соответственно.

3. Wrapper classes при помощи методов парсинга (начинаются со слова parse...), могут преобразовать стринги 
в соответсвующий данному wrapper классу примитивный тип. Если строка содержит текст который можно интерпретировать 
как число, то парсинг пройдет успешно. Если нет, то будет ошибка.