Русский текст смотри ниже

<br/>

**Task 1**

Write Printer thread class that prints a determined amount of its number (e.g. 100) by the portions.
Each portion shall contain a determined amount of the numbers (e.g. 10).
During printing one portion none from other threads shall  print
Output shall look like as follows

111111111111

22222222222

33333333333

111111111111

22222222222

……………….

Implementation note: Apply sleep/interrupt synchronization

Write PrinterAppl class with method main that configures and launches a determined number (e.g. 4) of the Printer threads. 

Implementation hints;
1. After launching all threads will sleep
2. Main thread interrupts the first thread
3. First thread prints a portion and interrupts second thread (it has the reference to the second thread)
4. Second interrupts third and so on. The last thread interrupts the first one. Thus there will be the chain of threads that should be set by the PrinterAppl
5. Threads finish after printing out all portions

<br/>


**Задание 1**

Напишите класс Printer thread, который печатает определенное количество его номера (например, 100) порциями.
Каждая порция должна содержать определенное количество цифр (например, 10).
Во время печати одной порции никто из других потоков не печатает
Вывод должен выглядеть следующим образом

111111111111

22222222222

33333333333

111111111111

22222222222

……………….

Примечание по реализации: применить синхронизацию sleep/interrupt.

Напишите класс PrinterAppl с методом main, который настраивает и запускает определенное количество (например, 4) потоков Printer.

Рекомендации по реализации;
1. После запуска все потоки будут спать
2. Основной поток прерывает первый поток.
3. Первый поток печатает gjhwb. и прерывает второй поток (он должен иметь ссылку на второй поток).
4. Второй прерывает третий и так далее. Последний поток прерывает первый. Таким образом, появится цепочка потоков, которую должен задать PrinterAppl.
5. Потоки завершаются после распечатки всех порций.