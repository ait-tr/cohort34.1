Русский текст смотри ниже

<ol>
<li> There are simple operations like test-and-set that can be implemented in one action. The java.util.concurrent.atomic package contains classes like AtomicXXX, whose objects allow you to perform such simple operations atomically without using locks.
</li>
<li>The volatile keyword in Java is used to indicate that the value of a variable can be changed by multiple threads at the same time. This ensures that the variable is always read and written to main memory and not from thread-specific caches, providing cross-thread visibility.
</li>
<li> Deadlock (deadlock) is a problem caused by an error in the design of synchronization of multi-threaded applications. The essence of the problem is when one of the competing threads has captured the monitor, and in order to release it, it must go to the synchronized block, the monitor of which is captured by the second thread. In this case, the second thread cannot release the monitor, because to do this it needs to go to the synchronized block, the monitor of which is captured by the first thread.
</li>
<li> The java.util.concurrent package contains the Lock interface and its implementation ReentrantLock. An object of this class has a "direct" connection with the mutex. Methods lock, unlock, allow you to lock and unlock the critical section. The standard pattern for using objects of the Lock type is to call the lock() method before the try block, and call unlock() in the finally block.
</li>
<li> The ReadWriteLock interface and its implementation ReentrantReadWriteLock allow you to implement the read-write lock pattern in Java. The essence of the pattern is that reading operations (which do not change the shared object) from the critical section take place in parallel mode, and write operations (which change the shared object) in exclusive mode. To implement this pattern, you need to create a ReentrantReadWriteLock object and use its readLock() and writeLock() methods to obtain references to the corresponding Lock.
</li>
<li> See the presentation for more details.
</li>
</ol>

<br/>

<ol>
<li> Существуют простейшие операции типа test-and-set, которые можно реализовать за одно действие. В пакете java.util.concurrent.atomic есть классы вида AtomicXXX, объекты которых позволяют производить такие простейшие операции атомарно не используя блокировки.
</li>
<li> Ключевое слово volatile в Java используется для указания того, что значение переменной может быть изменено несколькими потоками одновременно. Это гарантирует, что переменная всегда считывается и записывается в основную память, а не из кэшей, специфичных для потока, обеспечивая видимость между потоками.
</li>
<li> Deadlock (взаимная блокировка), это проблема вызванная ошибкой в проектировании синхронизации многопоточных аппликаций. Суть проблемы, когда один из конкурирующий потоков захватил монитор, и чтобы его освободить, он должен пройти в synchronized блок, монитор которого захвачен вторым потоком. При этом второй поток, не может освободить монитор, т. к. для этого ему надо пройти в synchronized блок, монитор которого захвачен первым потоком.
</li>
<li> В пакете java.util.concurrent есть интерфейс Lock и его имплементация ReentrantLock. Объект этого класса имеет "прямую" связь с mutex. Методы lock, unlock, позволяю блокировать и разблокировать критическую секцию. Стандартный паттерн использования объектов типа Lock, это перед блоком try вызвать метод lock(), а в блоке finally вызвать unlock().
</li>
<li> Интерфейс ReadWriteLock и его имплементация ReentrantReadWriteLock, позволяют реализовать паттерн read-write lock, в Java. Суть патерна, чтобы операции чтения (не меняющие общий объект) из критической секции проходили в параллелном режиме, а операции записи (меняющие общий объект) в эксклюзивном режиме. Для реализации этого патерна надо создать объект ReentrantReadWriteLock и при помощи его методов readLock() и writeLock() ролучить ссылки на соответсвующие Lock.
</li>
<li> Подробнее смотрите в презентации.
</li>
</ol>


[Multithreading. Synchronizing](https://github.com/ait-tr/cohort34.1/blob/main/basic_programming/lesson_62/Threads_2_Synchronization_new.pdf)