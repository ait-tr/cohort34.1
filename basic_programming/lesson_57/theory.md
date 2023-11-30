Русский текст смотри ниже

<ol>
<li> A stream is a sequence of data.
</li>
<li> An I/O stream represents the source of input or the destination of output.
A stream can represent many different kinds of sources and
directions, including disk files, devices, other programs and
memory arrays...
</li>
<li> Streams support many different types of data, including simple ones
bytes, primitive data types and objects.
</li>
<li> Input Stream - reads data from source, one element at a time.
Output Stream - writes data to destination, one element at a time.
</li>
<li> The abstract class OutputStream contains the abstract method abstract void write(int b), designed to write one byte to the stream. The FileOutputStream class extends the OutputStream class, and implements the write method to write a byte to a file.
</li>
<li> Abstract class InpuStream, contains an abstract method abstract int read(), designed to read one byte from a stream. The FileInputStream class extends the InputStream class, and implements the read method to read a byte from a file. If the read method returns -1, it means that all data from the stream has been read.
</li>
</ol>

<br/>

<ol>
<li> Поток - это последовательность данных.
</li> 
<li> Поток ввода/вывода представляет источник ввода или пункт назначения вывода.
Поток может представлять множество различных видов источников и
направления, включая файлы дисков, устройства, другие программы и
массивы памяти..
</li>
<li> Потоки поддерживают множество различных видов данных, в том числе простые
байты, примитивные типы данных и объекты.
</li>
<li> Input Stream - читает данные из source, один элемент за один раз.
Output Stream - записывает данные в destination, один элемент за один раз.
</li>
<li> Абстрактный класс OutputStream, содержит абстрактный метод abstract void write(int b), предназначенный для записи одного байта в поток. Класс FileOutputStream расширяет класс OutputStream, и имплементирует метод write для записи байта в файл.
</li>
<li> Абстрактный класс InpuStream, содержит абстрактный метод abstract int read(), предназначенный для чтения одного байта из потока. Класс FileInputStream расширяет класс InputStream, и имплементирует метод read для чтения байта из файла. Если метод read возвращает -1, это означает, что все данные из потока считаны.
</li>
</ol>