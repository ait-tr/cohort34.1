Русский текст смотри ниже

<ol>
<li> The concept of Complexity (computational complexity) allows you to evaluate the effectiveness of algorithmic solutions.
In simple terms, we can say that computational complexity says in proportion to which function the number of
actions when processing a set of elements, if you increase the number of elements of this set.
</li>
<li> To describe computational complexity, the so-called "Big O notation". For example, the entry O(n) speaks of
linear complexity of the algorithm. And O(log(n)) characterizes the logarithmic complexity.
</li>
<li> If an object encapsulates some set of elements within itself, and there is a need to iterate through all the elements
this set, then there may be a problem with this. If you create a getter to pass this set, then returning
link, we are essentially giving unsafe access to a set outside the object. If you return a copy of the set,
then this may affect performance. To solve this problem, there is an Iterator pattern.
The essence of the pattern is to create a third-party object that knows how to “iterate” many elements
encapsulated in the original object. An iterator object must have two functionality:
1) know how to determine whether there is a next element;
2) return the current element and move on to the next one.
</li>
<li> In Java, there is an Iterator<T> interface with two abstract methods: boolean hasNext(),
returning true if there are still elements, and false if we have reached the end of the set, and T next() returning
the current element, and moving the "pointer" to the next element. In the Iterator interface there is also
additional default method void remove(), which has an empty body. But if we need to implement
functionality to correctly remove the current element during iteration, then the remove method must be overridden.
</li>
<li> The class encapsulating the set that needs to be iterated can implement the Iterable<T> interface
of which there is only one abstract method Iterator<T> iterator(), which returns an iterator for objects of this class.
</li>
<li> For Iterable objects, you can use a for-each loop. Its signature is this: for(T e: "set of T"){ do something};
In the body of this loop, the variable "e" takes in turn the value of each element from the iterated set.
In a for-each loop, you cannot modify the iterable set.
</li>
</ol>

<br/>

<ol>
<li> Понятие Complexity (вычислительная сложность), позволяет оценить эффективность алгоритмических решений. 
Простым языком можно сказать, что вычислительная сложность говорит, пропорционально какой функции растет колличество
действий при обработки множества элементов, если увеличивать колличество элементов этого множества.
</li>
<li> Для описания вычислительной сложности используется т. н. "Big O notation". Например запись O(n), говорит о 
линейной сложности алгоритма. А O(log(n)), характеризует логарифмическую сложность.
</li>
<li> Если объект инкапсулирует внутри себя какое-то множество элементов, и есть необходимость перебрать все элементы 
этого множества, то с этим может возникнуть проблема. Если для передачи этого множества создать геттер, то возвращая 
ссылку, мы по сути даем небезопасный доступ к множеству за пределами объекта. Если возвращать копию множества, 
то это может повлиять на производительность. Для решения этой проблемы существует паттерн "Итератор". 
Суть паттерна это создать сторонний объект, который знает как "перебирать" (итерировать) множество элементов 
инкапсулированных в исходном объекте. Объект итератор должен иметь две функциональности: 
1) знать как определить есть ли следующий элемент; 
2) вернуть текущий элемент и перейти к следующему.
</li>
<li> В Java существует интерфейс Iterator<T> с двумя абстрактными методами: boolean hasNext(), 
возвращающий true если еще есть элементы, и false если дошли до конца множества, и T next() возвращающий 
текущий элемент, и переводящий "указатель" к следующему элементу. В интерфейсе Iterator существует еще 
дополнительный дефолтный метод void remove(), который имеет пустое тело. Но если нам надо реализовать 
функциональность корректного удаления текущего элемента в процессе итерирования, то метод remove надо переопределить.
</li>
<li> Класс инкапсулирущий множество, которое надо итерировать, может имплементировать интерфейс Iterable<T> у 
которого только один абстрактный метод Iterator<T> iterator(), возвращающий итератор для объектов данного класса.
</li>
<li> Для Iterable объектов можно использовать цикл for-each. Его сигнатура вот такая: for(T e: "set of T"){ do something}; 
В теле этого цикла переменная "e" принимает поочередно значение каждого элемента из итерируемого множества. 
В цикле for-each нельзя модифицировать итерируемое множество.
</li>

</ol>