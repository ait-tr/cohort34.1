Русский текст смотри ниже

# Stream. Continue


If the stream, “on the conveyor belt,” contains objects that, in turn, are iterable,
then, using the intermediate flatMap method, you can “shak out” the contents of these objects. In this case
Then the contents of the objects will move along the conveyor.

The terminal collect method can collect the contents of the stream into the structure we need. For this he needs
pass an object implementing the Collector interface. In practice, implement the Collector interface yourself
This is rarely necessary, because the Collectors class has many methods that return various collectors. For example
using Collectors.toList(), you can get a collector that collects stream elements into a list, and using
Collectors.toSet() - to set.

Collectors.groupingBy allows you to group stream elements into a map according to a key that is determined
corresponding function. In this case, elements corresponding to one key are collected by default into a sheet.

Collectors.groupingBy has overloads. For example, instead of the default sheet, as value
you can use the result of the work of some collector.

For details about the stream's operation scheme and basic operations, see the presentation.

<br/>

# Стримы. Продолжение

Если в стриме, "на конвеере", оказываются объекты, которые в свою очередь являются итерируемыми, 
то при помощи промежуточного метода flatMap можно "вытрусить" содержимое этих объектов. В таком случае 
далее "по конвееру" будет двигаться уже содержимое объектов.

Терминальный метод collect может собрать содержимое стрима в нужную нам структуру. Для этого ему надо 
передать объект имплементирующий интерфейс Collector. На практике имплементировать самим интерфейс Collector 
приходится редко, т. к. в классе Collectors есть много методов возвращающих разнообразные коллекторы. Например 
при помощи Collectors.toList(), можно получить коллектор собирающий элементы стрима в лист, а при помощи 
Collectors.toSet() - в сет.

Collectors.groupingBy позволяет сгруппировать элементы стрима в мапу, по ключу, который определяется 
соответствующей функцией. При этом элементы соответствующие одному ключу собираются по умолчанию в лист.

У Collectors.groupingBy есть перегруженные варианты. Например, вместо дефолтного листа, в качестве вэлью 
можно использовать результат работы какого-нибудь коллектора.

Подробно о схеме работы стрима и основных операциях, смотрите в презентации.

[Functional Programming in Java](https://github.com/ait-tr/cohort34.1/blob/main/basic_programming/lesson_54/FP.pdf)