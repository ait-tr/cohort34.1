Русский текст смотри ниже

# Destructuring

There are two most commonly used data structures in JavaScript: Object and Array.

Objects allow us to create a single entity that stores data items by key.
Arrays allow us to collect data elements into an ordered list.
But when we pass them to a function, it may not need the entire object/array, but the elements separately.

Destructuring assignment is a special syntax that allows us to “unpack” arrays or objects into multiple variables, as they are sometimes more convenient.

### An example of destructuring an array into variables:

```
const date = ['1970', '12', '01']
const [year, month, day] = date
```
### An example of destructuring an object into variables:

```
const note = {
   id: 1,
   title: 'My first note',
   date: '01/01/1970',
}
const { id, title, date } = note
```

# Spread

The extension (...) syntax is another useful addition to JavaScript for working with arrays, objects, and function calls. The extension allows objects and arrays to be unpacked or expanded, which can be used to create shallow copies of data structures to make data manipulation easier.

### Example of array expansion:

```
const tools = ['hammer', 'screwdriver']
const otherTools = ['wrench', 'saw']
const allTools = [...tools, ...otherTools]
```

### Example of object extension:

```
const originalObject = { enabled: true, darkMode: false }
const secondObject = { ...originalObject }
```

<br/><hr/><br/>

# Деструктурирующее присваивание

В JavaScript есть две чаще всего используемые структуры данных – это Object и Array.

Объекты позволяют нам создавать одну сущность, которая хранит элементы данных по ключам.
Массивы позволяют нам собирать элементы данных в упорядоченный список.
Но когда мы передаём их в функцию, то ей может понадобиться не объект/массив целиком, а элементы по отдельности.

Деструктурирующее присваивание – это специальный синтаксис, который позволяет нам «распаковать» массивы или объекты в несколько переменных, так как иногда они более удобны.

### Пример деструктуризации массива на переменные:

```
const date = ['1970', '12', '01']
const [year, month, day] = date
```
### Пример деструктуризации объекта на переменные:

```
const note = {
  id: 1,
  title: 'My first note',
  date: '01/01/1970',
}
const { id, title, date } = note
```

# Оператор расширения

Синтаксис расширения (...) — еще одно полезное дополнение к JavaScript для работы с массивами, объектами и вызовами функций. Расширение позволяет распаковывать или расширять объекты и массивы, что можно использовать для создания неглубоких копий структур данных, чтобы упростить манипулирование данными.

### Пример расширения массива:

```
const tools = ['hammer', 'screwdriver']
const otherTools = ['wrench', 'saw']
const allTools = [...tools, ...otherTools]
```

### Пример расширения объекта:

```
const originalObject = { enabled: true, darkMode: false }
const secondObject = { ...originalObject }
```

<a href="https://learn.javascript.ru/" target="_blank">Современный учебник JavaScript</a>

