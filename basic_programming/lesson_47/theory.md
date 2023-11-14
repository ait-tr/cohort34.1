Русский текст смотри ниже

<ol>
<li> You cannot change an iterable in a for-each loop. Therefore, to remove all elements from the sheet that meet a given condition, use the remove method of the iterator. In Java 8, the sheet has a special removeIf method that accepts a predicate to implement such functionality.
</li>
<li> Due to the fact that the get method by index in LinkedList has linear complexity, it is not practical to use a regular loop to get elements by index. The most common way to iterate sheets is to use a for-each loop.
</li>
<li> To work with collections, an analogue of the Arrays class for an array is the Collections class.
The Collections class contains sorting and binary search methods for working with sheets.
</li>
</ol>

<br/>

<ol>
<li> Изменять итерируемый объект в цикле for-each нельзя. Поэтому для удаления всех элементов из листа соответствующих заданному условию, используют метод remove у итератора. В Java 8 у листа появился специальный метод removeIf принимающий предикат, для реализации такой функциональности.
</li>
<li> В связи с тем, что метод get по индексу в LinkedList имеет линейную сложность, использовать обычный цикл с получением элементов по индексу нецелесообразно. Чаще всего для итерирования листов используют цикл  for-each.
</li>
<li> Для работы с коллекциями, аналогом класса Arrays для массива, является класс Collections.
Класс Collections содержит методы сортировки и бинарного поиска для работы с листами.
</li>
</ol>