Русский текст смотри ниже

Threads provide a useful paradigm for an application to do many things at once: if you have something to do, create a thread to do it. Using threads can simplify the logic of the application and also take advantage of multiple processors, but creating too many threads can cause overall application performance problems due to contention for resources. The application may end up spending much of its time contending for resources, dealing with mutex locks for example, and less of its time actually doing useful work. Also, creating a thread, though cheaper than creating a process, is still an expense. Creating a thread to do a small amount of work is wasteful.

A thread pool manages a set of anonymous threads that perform work on request. The threads do not terminate right away. When one of the threads completes a task, the thread becomes idle, ready to be dispatched to another task. The overhead of creating and destroying threads is limited to creating and destroying just the number of active worker threads in the pool. The application can have more tasks than there are worker threads, and this is usually the case. Processor utilization and throughput are improved by reducing contention for resources. The submitted tasks are processed in order, usually faster than could be done by creating a thread per task.

Most of the executor implementations in java.util.concurrent use thread pools, which consist of worker threads. This kind of thread exists separately from the Runnable and Callable tasks it executes and is often used to execute multiple tasks.

Using worker threads minimizes the overhead due to thread creation. Thread objects use a significant amount of memory, and in a large-scale application, allocating and deallocating many thread objects creates a significant memory management overhead.

One common type of thread pool is the fixed thread pool. This type of pool always has a specified number of threads running; if a thread is somehow terminated while it is still in use, it is automatically replaced with a new thread. Tasks are submitted to the pool via an internal queue, which holds extra tasks whenever there are more active tasks than threads.

A simple way to create an executor that uses a fixed thread pool is to invoke the newFixedThreadPool factory method in java.util.concurrent.Executors This class also provides the following factory methods:

The newCachedThreadPool method creates an executor with an expandable thread pool. This executor is suitable for applications that launch many short-lived tasks.
The newSingleThreadExecutor method creates an executor that executes a single task at a time.


<br/>

Потоки предоставляют приложению полезную парадигму, позволяющую выполнять множество задач одновременно: если вам нужно что-то сделать, создайте для этого поток. Использование потоков может упростить логику приложения, а также использовать преимущества нескольких процессоров, но создание слишком большого количества потоков может вызвать общие проблемы с производительностью приложения из-за конкуренции за ресурсы. Приложение может в конечном итоге тратить большую часть своего времени на борьбу за ресурсы, например, на блокировку мьютексов, и меньше времени на полезную работу. Кроме того, создание потока, хотя и дешевле, чем создание процесса, все равно требует затрат. Создание потока для выполнения небольшого объема работы — расточительство.

Пул потоков управляет набором анонимных потоков, которые выполняют работу по запросу. Потоки не завершаются сразу. Когда один из потоков завершает задачу, он становится бездействующим и готов к выполнению другой задачи. Накладные расходы на создание и уничтожение потоков ограничиваются созданием и уничтожением только количества активных рабочих потоков в пуле. В приложении может быть больше задач, чем рабочих потоков, и это обычно так. Использование процессора и пропускная способность улучшаются за счет уменьшения конкуренции за ресурсы. Отправленные задачи обрабатываются по порядку, обычно быстрее, чем это можно было бы сделать, создавая поток для каждой задачи.

Большинство реализаций исполнителя в java.util.concurrent используют пулы потоков, которые состоят из рабочих потоков. Этот тип потока существует отдельно от задач Runnable, которые он выполняет, и часто используется для выполнения нескольких задач.

Использование рабочих потоков минимизирует накладные расходы, связанные с созданием потоков. Объекты потока используют значительный объем памяти, а в крупномасштабном приложении выделение и освобождение большого количества объектов потока создает значительные накладные расходы на управление памятью.

Одним из распространенных типов пулов потоков является фиксированный пул потоков. В пуле этого типа всегда выполняется определенное количество запущенных потоков; если поток каким-либо образом завершается, пока он еще используется, он автоматически заменяется новым потоком. Задачи отправляются в пул через внутреннюю очередь, в которой хранятся дополнительные задачи, когда активных задач больше, чем потоков.

Простой способ создать исполнитель, использующий фиксированный пул потоков, — это вызвать фабричный метод newFixedThreadPool в java.util.concurrent.Executors. Этот класс также предоставляет следующие фабричные методы:

Метод newCachedThreadPool создает исполнителя с расширяемым пулом потоков. Этот исполнитель подходит для приложений, запускающих множество кратковременных задач.
Метод newSingleThreadExecutor создает исполнителя, который одновременно выполняет одну задачу.