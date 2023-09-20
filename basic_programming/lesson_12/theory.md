Русский текст смотри ниже

1. Unlike primitives, objects are complex structures that combine a variety of
    data characterizing the state of an object, and functionality responsible for its behavior
2. Arrays in Java are objects.
3. Java uses two types of memory: Stack and Heap.
4. The Stack stores data that has a clearly defined size in bytes. For example, primitives.
5. The size of data stored in Heap can change dynamically. All Java objects are stored in Heap.
6. The array is stored in Heap. An array variable stores the address of the array in Heap, i.e. it is a link to
    array. The variable itself with the address is stored in Stack, since the address in memory always has a fixed length of
    bytes
7. When calling a method, the arguments of the primitive type are copied, i.e., their value is passed (pass by value).
    When passing objects (for example, arrays) as arguments, only addresses (links) are copied. Sami
    objects are not copied. They say that object arguments are passed by reference.


1. В отличие от примитивов, объекты представляют из себя сложные структуры объеденияющие в себе разнообразные 
   данные характеризиующие состояние объекта, и функциональность отвечающую за его поведение
2. Массивы в Java являются объектами.
3. Java использует два типа памяти: Stack и Heap. 
4. В Stack хранятся данные имеющие четко заданный размер в байтах. Например примитивы. 
5. Размер данныx хранящихся в Heap, может динамически меняться. Все объекты Java хранит в Heap.
6. Массив хранится в Heap. Переменная типа массив хранит в себе адрес массива в Heap, т. е. является ссылкой на 
   массив. Сама переменная с адресом, хранится в Stack, т. к. адрес в памяти всегда имеет фиксированную длину в 
   байтах.
7. При вызове метода, аргументы примитивного типа копируются, т. е. передается их значение (pass by value). 
   При передаче в качестве аргументов объектов (например массивов), копируются только адреса (ссылки). Сами 
   объекты не копируются. Говорят, что аргументы объекты передаются по ссылке (pass by reference)