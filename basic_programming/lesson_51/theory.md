Русский текст смотри ниже

<ol>
<li> If the application is tasked with storing unique data, then first of all you need to study the issue of using sets.
</li>
<li> If you decide to store objects of some type in a HashSet, then it is advisable to take care that the fields
those involved in the hashCode calculation were unchanged. Changing the relevant fields may result in
"leakage" of data from the set.
</li>
<li> TreeSet Java is implemented as <a href="https://habrahabr.ru/post/330644/">red-black tree</a>.
Here is <a href="https://www.cs.usfca.edu/~galles/visualization/RedBlack.html">RedBlack Tree Visualization</a>.
</li>
<li> In a TreeSet, to determine the uniqueness of the stored data, it must be either Comparable or in a TreeSet
Comparator must be passed during creation.
</li>
</ol>

<br/>

<ol>
<li> Если в аппликации стоит задача хранить уникальные данные, то в первую очередь надо изучить вопрос использования сетов.
</li> 
<li> Если объекты какого-то типа решили хранить в HashSet, то желательно позаботиться, чтобы поля 
учавствующие в расчете hashCode были неизменными. Изменение соответствующих полей, может привести к 
"утечке" данных из сета.
</li>
<li> TreeSet Java реализован как <a href="https://habrahabr.ru/post/330644/">красно-черное дерево</a>. 
Вот <a href="https://www.cs.usfca.edu/~galles/visualization/RedBlack.html">Визуализация красно-черного дерева</a>.
</li>
<li> В TreeSet для определения уникальности хранимых данных, они должны быть или Comparable, или в TreeSet 
при создании должен быть передан Comparator.
</li>
</ol>

[Java Collections Framework](https://github.com/ait-tr/cohort34.1/blob/main/basic_programming/lesson_44/JCF.pdf)