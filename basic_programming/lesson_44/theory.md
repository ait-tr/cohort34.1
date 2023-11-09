Русский текст смотри ниже

<ol>
<li> The concept of Complexity (computational complexity) allows you to evaluate the effectiveness of algorithmic solutions. In simple terms, we can say that computational complexity says in proportion to which function the number of actions when processing a set of elements increases, if the number of elements of this set increases.
</li>
<li> To describe computational complexity, the so-called "Big O notation". For example, the notation O(n) indicates the linear complexity of the algorithm. And O(log(n)) characterizes the logarithmic complexity.
</li>
<li> Java Collection Framework (JCF) - a set of classes and interfaces that implement the most commonly used data structures. JCF consists of two large subsections: Map and Collection. We begin our study with collections.
</li>
<li> The Collection interface extends the Iterable interface, meaning all collections are iterable. The Collection interface defines a basic set of methods for working with collections of data. For example, adding, deleting, searching, getting the number of elements in a collection, etc.
</li>
<li> There are many interfaces that extend the Collection interface. We'll look at the Set and List interfaces. Let's start with the List interface. The List interface defines collections whose elements have indexes, i.e., a kind of array analogue, but without a size limit. Accordingly, in the List interface, in addition to the methods inherited from Iterable and Collection, methods that work with indexes are defined. For example, inserting by index, deleting by index, getting an element by index, searching for the index of a given argument, etc.
</li>
<li> One of the implementations of the List interface is the ArrayList class. To implement the functionality of the List interface, an ArrayList encapsulates an array of some initial size. When this array is completely filled, its elements are copied into a new array, but of a larger size. And now we wait for the new array to be filled. Etc.
That is, in simple terms, ArrayList is a “rubber array”.
</li>

</ol>

<br/>

<ol>
<li> Понятие Complexity (вычислительная сложность), позволяет оценить эффективность алгоритмических решений. Простым языком можно сказать, что вычислительная сложность говорит, пропорционально какой функции растет колличество действий при обработки множества элементов, если увеличивать колличество элементов этого множества.
</li>
<li> Для описания вычислительной сложности используется т. н. "Big O notation". Например запись O(n), говорит о линейной сложности алгоритма. А O(log(n)), характеризует логарифмическую сложность.
</li> 
<li> Java Collection Framework (JCF) - множество классов и интерфейсов которые реализуют наиболее часто используемые структуры данных. JCF состоит из двух больших подразделов: Map и Collection. Мы начинаем наше изучение с коллекций.
</li>
<li> Интерфейс Collection расширяет интерфейс Iterable, т. е. все коллекции итерируемые. Интерфейс Collection определяет некоторый основной набор методов для работы с коллекциями данных. Например добавление, удаление, поиск, получение колличества элементов в коллекции и т. д.
</li>
<li> Есть множество интерфейсов расширяющих интерфейс Collection. Мы рассмотрим интерфейсы Set и List. И начнем с интерфейса List. Интерфейс List определяет коллекции элементы которых имеют индексы, т. е. некий аналог массива, но не имеющий ограничения по размеру. Соответственно в интерфейсе List, помимо методов унаследованных от Iterable и Collection, определены методы работающие с индексами. Например вставка по индексу, удаление по индексу, получение элемента по индексу, поиск индекса заданного аргумента и т. п.
</li> 
<li> Одной из имплементаций интерфейса List является класс ArrayList. Для реализации функциональности интерфейса List,  ArrayList инкапсулирует в себе массив некоторого начального размера. Когда этот массив полностью заполняется, то его элементы копируются в новый массив, но уже большего размера. И теперь ждем когда заполнится новый массив. И т. д.
Т. е. простым языком ArrayList представляет из себя "резиновый массив".
</li>

</ol>

[Java Collection Framework](https://github.com/ait-tr/cohort34.1/blob/main/basic_programming/lesson_44/JCF.pdf)