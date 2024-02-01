Русский текст смотри ниже

### Prototype inheritance

JavaScript's inheritance model may be puzzling to experienced developers of high-level object-oriented languages (such as Java or C++) because it is dynamic and does not include an implementation of the concept of class (although the class keyword, which was a reserved word for many years, has become a practical meaning in the ES2015 standard, however, classes in JavaScript are just "syntactic sugar" on top of the prototype-based inheritance model).

In terms of inheritance, JavaScript only works with one thing: objects. Each object has an internal reference to another object, called its prototype. A prototype object also has its own prototype, and so on, until the chain ends with an object whose prototype property is null. By definition, null has no prototype and is the final link in the prototype chain.

Although the prototypical inheritance model is considered by some to be a shortcoming of JavaScript, it is actually more powerful than the classical inheritance model. For example, you can implement classical inheritance on top of it extremely simply, but attempts to do the opposite will certainly force you to sweat.

```javascript
let animal = {
  eats: true,
  walk() {
    /* this method will not be used in rabbit */
  },
};
let rabbit = {
  __proto__: animal,
};

rabbit.walk = function() {
  console.log("Rabbit! Bounce-bounce!");
};

rabbit.walk(); // Rabbit! Bounce-bounce!
```

### Try, Catch, Finally:

`try`, `catch` and `finally` are used for error handling in JavaScript.

- **`try`:** A block in which potentially error-causing code is executed.
- **`catch`:** Block in which errors that occur in the `try` block are processed.
- **`finally`:** A block that is always executed, regardless of whether there was an error or not.

```javascript
try {
   // Code that may cause an error
   throw new Error('This is an error.');
} catch (error) {
   // Error handling
   console.error('Caught an error:', error.message);
} finally {
   // Block that is always executed
   console.log('This block always runs.');
}
```

In the example above, if the code in the `try` block causes an error, control passes to the `catch` block, where the error is handled. The `finally` block is always executed regardless of errors.

<br/><hr/><br/>

### Прототипное наследование

Модель наследования в JavaScript может озадачить опытных разработчиков на высокоуровневых объектно-ориентированных языках (таких, например, как Java или C++), поскольку она динамическая и не включает в себя реализацию понятия class (хотя ключевое слово class, бывшее долгие годы зарезервированным, и приобрело практическое значение в стандарте ES2015, однако, классы в JavaScript представляют собой лишь "синтаксический сахар" поверх прототипно-ориентированной модели наследования).

В плане наследования JavaScript работает лишь с одной сущностью: объектами. Каждый объект имеет внутреннюю ссылку на другой объект, называемый его прототипом. У объекта-прототипа также есть свой собственный прототип и так далее до тех пор, пока цепочка не завершится объектом, у которого свойство prototype равно null. По определению, null не имеет прототипа и является завершающим звеном в цепочке прототипов.

Хотя прототипную модель наследования некоторые относят к недостаткам JavaScript, на самом деле она мощнее классической. К примеру, поверх неё можно предельно просто реализовать классическое наследование, а вот попытки совершить обратное непременно вынудят вас попотеть.

```javascript
let animal = {
 eats: true,
 walk() {
   /* этот метод не будет использоваться в rabbit */
 },
};
let rabbit = {
 __proto__: animal,
};

rabbit.walk = function () {
 console.log("Rabbit! Bounce-bounce!");
};

rabbit.walk(); // Rabbit! Bounce-bounce!
```

### Try, Catch, Finally:

`try`, `catch` и `finally` используются для обработки ошибок в JavaScript.

- **`try`:** Блок, в котором выполняется потенциально вызывающий ошибку код.
- **`catch`:** Блок, в котором обрабатываются ошибки, возникшие в блоке `try`.
- **`finally`:** Блок, который выполняется всегда, независимо от того, была ошибка или нет.

```javascript
try {
  // Код, который может вызвать ошибку
  throw new Error('This is an error.');
} catch (error) {
  // Обработка ошибки
  console.error('Caught an error:', error.message);
} finally {
  // Блок, который выполняется всегда
  console.log('This block always runs.');
}
```

В приведенном примере, если код в блоке `try` вызывает ошибку, управление переходит в блок `catch`, где происходит обработка ошибки. Блок `finally` всегда выполняется независимо от наличия ошибок.



<a href="https://learn.javascript.ru/" target="_blank">Современный учебник JavaScript</a>

