Русский текст смотри ниже

## Function Declarations:

A function declaration in JavaScript is a block of code that can be called when needed.

```javascript
function greet(name) {
   console.log(`Hello, ${name}!`);
}

greet("John"); // Function call
```

## Anonymous Functions:

Unnamed functions are functions without a name, often used as arguments to other functions (callbacks).

```javascript
let add = function(x, y) {
   return x + y;
};

let result = add(3, 5); // result is 8
```

## Arrow Functions:

Arrow functions are a shorthand syntax for declaring functions. They have some special features, such as preserving the `this` context.

```javascript
let multiply = (a, b) => a * b;

let square = x => x * x;

let greet = () => console.log("Hello!");
```
Thus, functions in JavaScript can be declared in a variety of ways, including declaration, unnamed functions, and arrow functions.

## Template Strings:

Template strings provide a convenient way to insert variables and expressions into strings.

```javascript
let name = "Alice";
let greeting = `Hello, ${name}!`;
console.log(greeting); // "Hello, Alice!"
```

Template strings can use expressions enclosed in `${}`, which makes it easier to insert variable values inside the string.

Template strings provide convenient syntax for working with strings, including inserting variable values.

<br/><hr/><br/>

## Function Declarations (Объявление функции):

Объявление функции в JavaScript представляет собой блок кода, который можно вызывать при необходимости.

```javascript
function greet(name) {
  console.log(`Hello, ${name}!`);
}

greet("John"); // Вызов функции
```

## Anonymous Functions (Безымянные функции):

Безымянные функции - это функции без имени, часто используемые как аргументы для других функций (колбэки).

```javascript
let add = function(x, y) {
  return x + y;
};

let result = add(3, 5); // result равен 8
```

## Arrow Functions (Стрелочные функции):

Стрелочные функции представляют собой сокращенный синтаксис для объявления функций. Они обладают некоторыми особенностями, такими как сохранение контекста `this`.

```javascript
let multiply = (a, b) => a * b;

let square = x => x * x;

let greet = () => console.log("Hello!");
```
Таким образом, функции в JavaScript могут быть объявлены различными способами, включая объявление, безымянные функции и стрелочные функции. 

## Шаблонные строки (Template Strings):

Шаблонные строки предоставляют удобный способ вставки переменных и выражений в строки.

```javascript
let name = "Alice";
let greeting = `Hello, ${name}!`;
console.log(greeting); // "Hello, Alice!"
```

В шаблонных строках можно использовать выражения, заключенные в `${}`, что облегчает вставку значений переменных внутрь строки.

Шаблонные строки предоставляют удобный синтаксис для работы со строками, включая вставку значений переменных.


<a href="https://learn.javascript.ru/" target="_blank">Современный учебник JavaScript</a>

