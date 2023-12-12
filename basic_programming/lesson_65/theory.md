Русский текст смотри ниже

<ol>
<li>
Condition Variable is a synchronization device that allows threads to suspend execution and release
processors until the shared data is changed to have the desired state.
</li>
<li>
Condition Variable is a stateless signaling device. Notification (signal) does not change state
devices. This only affects the thread(s) that are waiting for this Condition Variable at the time of the notification (signal).
</li>
<li>
A Condition Variable must always be associated with a mutex.
</li>
<li>
In Java, Condition Variable is built into the monitor of each object. Communication between threads via Condition Variable is carried out by calling the wait, notify (notifyAll) methods on objects.
</li>
<li>
The java.util.concarrent package has a Condition interface that separates the Condition Variable from the monitor and provides advanced control capabilities for this device.
</li>
<li> See the presentation for more details.
</li>
</ol>

<br/>

<ol>
<li> 
Condition Variable — это устройство синхронизации, которое позволяет потокам приостанавливать выполнение и освобождать
процессоры до тех пор, пока общие данные не будут изменены, чтобы иметь желаемое состояние.
</li>
<li> 
Condition Variable — это сигнальное устройство без сохранения состояния. Уведомление (сигнал) не изменяет состояние
устройства. Это влияет только на поток(и), которые ожидают эту Condition Variable в момент уведомления (сигнала).
</li>
<li> 
Condition Variable всегда должна быть связана с мьютексом.
</li>
<li> 
В Java Condition Variable встроен в монитор каждого объекта. Коммуникация между потоками через Condition Variable осуществляется путем вызова методов wait, notify (notifyAll) у объектов.
</li>
<li> 
В пакете java.util.concarrent есть интерфейс Condition который отделяет Condition Variable от монитора предоставляет расширенные возможности управления этим устройством.
</li>
<li> Подробнее смотрите в презентации.
</li>
</ol>

[Multithreading. Condition Variable](https://github.com/ait-tr/cohort34.1/blob/main/basic_programming/lesson_65/Threads_3_ConditionVariable_new.pdf)