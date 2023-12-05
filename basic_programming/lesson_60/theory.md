Русский текст смотри ниже

<ol>
<li> Multithreading is one of the options for multitasking. Creating a new thread in the application,
is equivalent to creating a new stack of functions. That is, in a multi-threaded application, several stacks can work simultaneously.
</li>
<li> You can create a new task in Java either by implementing the Runnable interface or by extending the Thread class.
In any case, you need to override the run method in which the new task will be implemented.
</li>
<li> In order for a new thread to start, you need to create an object of type Thread by passing an object of type Runnable to the constructor,
and then call the start method on an object of type Thread.
</li>
<li> If it is necessary for one thread to wait for the completion of another thread, then while the first thread is running,
You need to call the join method on the old thread object.
</li>
<li> See the presentation for more details.
</li>
</ol>

<br/>

<ol>
<li> Multithreading один из вариантов многозадачности. Создание нового треда в аплликации, 
равносильно созданию нового стека функций. Т. е. в многопоточной аппликации могут одновременно работать несколько стеков.
</li>
<li> Создать новую задачу в Java можно или имплементировав интерфейс Runnable, или рсширяя класс Thread. 
В любой случае надо переопределить метод run в котором и будет реализована новая задача.
</li>
<li> Чтобы новый тред стартовал, надо создать объект типа Thread передав в конструктор объект типа Runnable, 
и после этого вызвать у объекта типа Thread метод start.
</li>
<li> Если необходимо, чтобы один тред дождался завершения другого треда, то в процессе работы первого треда, 
надо у объекта сторого треда вызвать метод join.
</li>
<li> Подробнее смотрите в презентации.
</li>
</ol>

[Multithreading. Overview](https://github.com/ait-tr/cohort34.1/blob/main/basic_programming/lesson_60/Threads_1_Overview_new.pdf)