Русский текст смотри ниже

### `this` and Context:

The `this` keyword in JavaScript is used to refer to the current object. The context of `this` depends on how the function is called.

```javascript
const person = {
   name: 'John',
   introduce: function() {
     console.log(`Hello, my name is ${this.name}.`);
   }
};

person.introduce(); // "Hello, my name is John."
```

### Global Object, Current Object:

- **Global object:** In the browser this is the `window` object, in Node.js it is `global`. Contains global variables and functions.
- **Current object:** This is the object that the current execution context refers to. In global scope, this is a global object.

### `call`, `apply`, `bind`:

- **`call` and `apply`:** Methods are used to call a function, specifying a specific object as `this`. The difference between them is in passing arguments - `call` passes arguments one at a time, `apply` passes an array of arguments.
   ```javascript
   function greet(message) {
     console.log(`${message}, ${this.name}.`);
   }

   const person = { name: 'John' };
   greet.call(person, 'Hello'); // "Hello, John."
   greet.apply(person, ['Hi']); // "Hi, John."
   ```

- **`bind`:** The method creates a new function by binding the specified object to `this` inside the function.
   ```javascript
   const greetPerson = greet.bind(person);
   greetPerson('Hola'); // "Hola, John."
   ```
  
### Closure
There is a common term in programming: “closure” that every developer should know.

A closure is a function that remembers its external variables and can access them. In some languages this is not possible, or the function must be written in a special way to make a closure. In JavaScript, all functions are inherently closures.

That is, they automatically remember where they were created using a hidden property `[[Environment]]`, and they can all access external variables.

<br/><hr/><br/>

### `this` и Контекст:

Ключевое слово `this` в JavaScript используется для обращения к текущему объекту. Контекст `this` зависит от того, как вызывается функция.

```javascript
const person = {
  name: 'John',
  introduce: function() {
    console.log(`Hello, my name is ${this.name}.`);
  }
};

person.introduce(); // "Hello, my name is John."
```

### Глобальный Объект, Текущий Объект:

- **Глобальный объект:** В браузере это объект `window`, в Node.js - `global`. Содержит глобальные переменные и функции.
- **Текущий объект:** Это объект, к которому относится текущий контекст выполнения. В глобальной области видимости это глобальный объект.

### `call`, `apply`, `bind`:

- **`call` и `apply`:** Методы используются для вызова функции с указанием конкретного объекта в качестве `this`. Разница между ними в передаче аргументов - `call` передает аргументы по одному, `apply` передает массив аргументов.
  ```javascript
  function greet(message) {
    console.log(`${message}, ${this.name}.`);
  }

  const person = { name: 'John' };
  greet.call(person, 'Hello'); // "Hello, John."
  greet.apply(person, ['Hi']); // "Hi, John."
  ```

- **`bind`:** Метод создает новую функцию, привязывая указанный объект к `this` внутри функции.
  ```javascript
  const greetPerson = greet.bind(person);
  greetPerson('Hola'); // "Hola, John."
  ```
  
###  Замыкание
В программировании есть общий термин: «замыкание», – который должен знать каждый разработчик.

Замыкание – это функция, которая запоминает свои внешние переменные и может получить к ним доступ. В некоторых языках это невозможно, или функция должна быть написана специальным образом, чтобы получилось замыкание. В JavaScript, все функции изначально являются замыканиями.

То есть они автоматически запоминают, где были созданы, с помощью скрытого свойства `[[Environment]]`, и все они могут получить доступ к внешним переменным.


<a href="https://learn.javascript.ru/" target="_blank">Современный учебник JavaScript</a>

