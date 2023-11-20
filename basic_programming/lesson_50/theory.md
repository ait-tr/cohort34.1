Русский текст смотри ниже

<ol>
<li> Of the many interfaces that extend the Collection interface, we looked at the List interface. Today we will begin to study the Set interface. The Set interface extends the Collection interface, and defines collections that do not contain two identical elements. There are no indexes for set elements!
</li>
<li> If we are talking about the uniqueness of elements in a set, then we must decide how this uniqueness is determined. There are two options. Option one: two objects are the same if the equals method returns true. Option two: two objects are the same if the comparison method (compareTo or compare) returns null.
</li>
<li> Based on option one, an implementation of the Set interface called HashSet is built. Based on option two, an implementation of the Set interface called TreeSet is built.
</li>
</ol>

<br/>

<ol>
<li> Из множества интерфейсов расширяющих интерфейс Collection, мы рассмотрели интерфейс List. Сегодня начнем изучать интерфейс Set. Интерфейс Set расширяет интерфейс Collection, и определяет коллекции которые не содержат двух одинаковый элементов. Индексов у элементов сета нет!
</li> 
<li> Если мы говорим об уникальности элементов в сете, то мы должны решить как эта уникальность определяется. Есть две опции. Опция один: два объекта одинаковые, если метод equals возвращает true. Опция два: два объекта одинаковые, если метод сравнения (compareTo или compare) возвращает ноль.
</li>
<li> На опции один, построена имплементация интерфейса Set называемая HashSet. На опции два, построена имплементация интерфейса Set называемая TreeSet.
</li>
</ol>

[Java Collections Framework](https://github.com/ait-tr/cohort34.1/blob/main/basic_programming/lesson_44/JCF.pdf)