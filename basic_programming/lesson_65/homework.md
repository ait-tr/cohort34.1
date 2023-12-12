Русский текст смотри ниже

<br/>

**Task 1**

Implementing Blocking Queue for Producer-Consumer Example 

    • Please download project BlockingQueueHW65.zip  from link below
    • Find class ait.mediation.BlkQueueImpl and write the implementation of all methods marked as //TODO (removing the code currently throwing  exceptions)
    • Run the project and verify that you have Producer-Consumer properly running example


Homework Hints:

    • The BlkQueueImpl class would implement the Blocking Queue, which works like Message Box in class work, where push  post, pop  get and number of messages in queue <= maxSize (instead of 1 in Message Box). The blocking logics is the same like Message Box:
        ◦ It blocks Consumers (readers) pop() operation, while it is empty
        ◦ It blocks Producers (writers) push() operation while it is full (has maxSize elements)  
    • Use LinkedList as internal implementation of queue in BlkQueue class
    • Look into classwork examples MessageBoxB or MessageBoxC to implement the proper synchronization logics.

<br/>

**Задание 1**

Реализация очереди блокировки для примера производитель-потребитель

     • Загрузите проект BlockingQueueHW65.zip по ссылке ниже.
     • Найдите класс ait.mediation.BlkQueueImpl и напишите реализацию всех методов, отмеченных как //TODO (удалив код, вызывающий в данный момент исключения).
     • Запустите проект и убедитесь, что у вас правильно работает пример «Производитель-потребитель».


Советы по домашнему заданию:

     • Класс BlkQueueImpl будет реализовывать блокирующую очередь, которая работает как окно сообщений в работе класса, где push-сообщение, pop-get и количество сообщений в очереди <= maxSize (вместо 1 в Message Box). Логика блокировки такая же, как и в окне сообщений:
         ◦ Блокирует операцию pop() для потребителей (читателей), пока она пуста.
         ◦ Он блокирует операцию push() производителей (писателей), пока он заполнен (имеет элементы maxSize).
     • Используйте LinkedList как внутреннюю реализацию очереди в классе BlkQueue.
     • Изучите примеры классных заданий MessageBoxB или MessageBoxC, чтобы реализовать правильную логику синхронизации.

<br/>

[Multithreading. Blocking Queue](https://github.com/ait-tr/cohort34.1/blob/main/basic_programming/lesson_65/BlockingQueueHW65.zip)