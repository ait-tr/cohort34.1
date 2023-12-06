Русский текст смотри ниже

<ol>
<li> Daemon threads are usually tasks that run in the background throughout the entire life cycle of the application. They automatically terminate their work, along with the termination of the last non-daemon thread. You can create a thread daemon as follows: thread.setDeamon(true). This must be done before the start of the thread.
</li>
<li> The static sleep method puts the thread into sleep mode for the specified number of milliseconds. During this time, the thread does not participate in the allocation of processor resources.
</li>
<li> The interrupt method called on a thread changes its interrupted flag (field) to true. In accordance with the contract, it is customary to respond to a flag change with the InterruptedException exception.
</li>
<li> See the presentation for more details.
</li>
</ol>

<br/>

<ol>
<li> Демон треды, обычно представляют из себя задачи работающие в фоновом режиме на протяжении всего жизненного цикла аппликации. Они автоматически завершают свою работу, вместе с завершением работы последнего не демон треда. Создать демон тред можно следующим образом: thread.setDeamon(true). Сделать это необходимо до старта треда.
</li>
<li> Статический метод  sleep переводит тред в режим ожидания на заданное колличество миллисекунд. На протяжении этого времени тред не учавствует в распределении ресурсов процессора.
</li>
<li> Метод interrupt вызванный у треда, меняет его флаг(поле) interrupted на true. В соответствии с контрактом принято реагировать на изменение флага эксепшеном InterruptedException.
</li>
<li> Подробнее смотрите в презентации.
</li>
</ol>

[Multithreading. Overview](https://github.com/ait-tr/cohort34.1/blob/main/basic_programming/lesson_60/Threads_1_Overview_new.pdf)