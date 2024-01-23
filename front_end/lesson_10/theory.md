Русский текст смотри ниже

## Strong / loose typing

Also called strong/weak typing. With strict typing, types are assigned “once and for all”; with non-strict typing, they can change during program execution.
Strongly typed languages prohibit changes to a variable's data type and only allow explicit data type conversions. Strong typing is distinguished by the fact that the language does not allow mixing different types in expressions and does not perform automatic implicit conversions, for example, you cannot subtract a number from a string. Weakly typed languages perform many implicit conversions automatically, even though loss of precision may occur or the conversion is ambiguous.

## Primitive types

1. **Number:** Represents both integers and real numbers. Example: `let x = 5;`

2. **String:** Represents text. Strings are enclosed in single or double quotes. Example: `let str = "Hello";`

3. **Boolean:** Represents the Boolean values `true` (true) or `false` (false). Example: `let isTrue = true;`

4. **Undefined:** Represents a value that has not been assigned. If a variable is declared but not assigned a value, its type will be `undefined`. Example: `let x;`

5. **Null:** Represents no value or nothing. Example: `let y = null;`

6. **Symbol:** Introduced in ECMAScript 6 (ES6). Each symbol is unique and is used, for example, to create unique properties of objects. Example: `let sym = Symbol('description');`

7. **BigInt:** Introduced in ECMAScript 2020 (ES11). Represents integers of arbitrary length. Enclosed in a numeric literal with the suffix `n`. Example: `let bigIntValue = 123n;`

Thus, there are seven primitive data types in JavaScript: Number, String, Boolean, Undefined, Null, Symbol, and BigInt. Each of them has its own special characteristics and is used to represent different types of data.

Primitive types are immutable, which means that the values of these types cannot be changed directly. All operations on primitives return a new value rather than changing an existing one.


## Operators:

### Arithmetic operators:
- `+`: Addition.
- `-`: Subtraction.
- `*`: Multiplication.
- `/`: Division.
- `**`: Exponentiation.

Example:

```javascript
let result = 10 + 5; // 15
let product = 3 * 4; // 12
let power = 2 ** 3; // 8
```

### `typeof` operator:
The `typeof` operator is used to determine the type of a value.

```javascript
typeof 42; // "number"
typeof "Hello"; // "string"
typeof true; // "boolean"
typeof undefined; // "undefined"
```

## Comparison Operators:

### Standard comparison operators:
- `==`: Not strict equality (performs type casting).
- `===`: Strict equality (no type casting).
- `!=`: Not strict inequality.
- `!==`: Strict inequality.

### Other comparison operators:
- `<`: Less.
- `>`: More.
- `<=`: Less than or equal to.
- `>=`: Greater than or equal to.

Examples:

```javascript
let x = 5;
let y = "5";

x == y; // true (type casting will occur)
x === y; // false (strict comparison without type casting)
x !== y; // true (strict inequality)
```

## Coercion:

Type casting occurs when JavaScript automatically changes the type of a value in a specific context.

```javascript
let num = 42;
let str = "The answer is " + num; // Cast num to string
```

## Conditional statements (If-Else):

```javascript
let condition = true;

if (condition) {
   // Code block is executed if the condition is true
} else {
   // Code block executed if condition is false
}
```

## Switch Case statement:

```javascript
let day = "Monday";

switch (day) {
   case "Monday":
     console.log("It's Monday!");
     break;
   case "Tuesday":
     console.log("It's Tuesday!");
     break;
   // ...
   default:
     console.log("It's another day!");
}
```

The `switch` statement is used to select one of many blocks of code to execute based on the value of a variable.

These concepts introduce the basic elements of operators, comparisons, and conditions in JavaScript.

<br/><hr/><br/>

﻿## Строгая / нестрогая типизация

Также называется сильная / слабая типизация. При строгой типизации типы назначаются «раз и навсегда», при нестрогой могут изменяться в процессе выполнения программы.
В языках со строгой типизацией запрещены изменения типа данных переменной и разрешены только явные преобразования типов данных. Строгая типизация выделяется тем, что язык не позволяет смешивать в выражениях различные типы и не выполняет автоматические неявные преобразования, например нельзя вычесть из строки число. Языки со слабой типизацией выполняют множество неявных преобразований автоматически, даже если может произойти потеря точности или преобразование неоднозначно.

## Примитивные типы

1. **Number (Число):** Представляет как целые, так и вещественные числа. Пример: `let x = 5;`

2. **String (Строка):** Представляет текст. Строки заключаются в одинарные или двойные кавычки. Пример: `let str = "Hello";`

3. **Boolean (Логический):** Представляет логические значения `true` (истина) или `false` (ложь). Пример: `let isTrue = true;`

4. **Undefined (Неопределенный):** Представляет значение, которое не было присвоено. Если переменная объявлена, но ей не присвоено значение, то её тип будет `undefined`. Пример: `let x;`

5. **Null (Пусто):** Представляет отсутствие значения или ничего. Пример: `let y = null;`

6. **Symbol (Символ):** Введен в ECMAScript 6 (ES6). Каждый символ уникален и используется, например, для создания уникальных свойств объектов. Пример: `let sym = Symbol('description');`

7. **BigInt (Большое Число):** Введен в ECMAScript 2020 (ES11). Представляет целые числа произвольной длины. Заключается в числовом литерале с суффиксом `n`. Пример: `let bigIntValue = 123n;`

Таким образом, в JavaScript есть семь примитивных типов данных: Number, String, Boolean, Undefined, Null, Symbol и BigInt. Каждый из них обладает своими особыми характеристиками и используется для представления различных видов данных.

Примитивные типы являются неизменяемыми, что означает, что значения этих типов не могут быть изменены напрямую. Все операции с примитивами возвращают новое значение, а не изменяют существующее.


## Операторы (Operators):

### Арифметические операторы:
- `+`: Сложение.
- `-`: Вычитание.
- `*`: Умножение.
- `/`: Деление.
- `**`: Возведение в степень.

Пример:

```javascript
let result = 10 + 5; // 15
let product = 3 * 4; // 12
let power = 2 ** 3; // 8
```

### Оператор `typeof`:
Оператор `typeof` используется для определения типа значения.

```javascript
typeof 42;         // "number"
typeof "Hello";    // "string"
typeof true;       // "boolean"
typeof undefined;  // "undefined"
```

## Операторы сравнения (Comparison Operators):

### Стандартные операторы сравнения:
- `==`: Не строгое равенство (производит приведение типов).
- `===`: Строгое равенство (без приведения типов).
- `!=`: Не строгое неравенство.
- `!==`: Строгое неравенство.

### Другие операторы сравнения:
- `<`: Меньше.
- `>`: Больше.
- `<=`: Меньше или равно.
- `>=`: Больше или равно.

Примеры:

```javascript
let x = 5;
let y = "5";

x == y;  // true (произойдет приведение типов)
x === y; // false (строгое сравнение без приведения типов)
x !== y; // true (строгое неравенство)
```

## Приведение типов (Coercion):

Приведение типов происходит, когда JavaScript автоматически изменяет тип значения в определенном контексте.

```javascript
let num = 42;
let str = "The answer is " + num; // Приведение num к строке
```

## Условные операторы (If-Else):

```javascript
let condition = true;

if (condition) {
  // Блок кода выполняется, если условие истинно
} else {
  // Блок кода выполняется, если условие ложно
}
```

## Оператор Switch Case:

```javascript
let day = "Monday";

switch (day) {
  case "Monday":
    console.log("It's Monday!");
    break;
  case "Tuesday":
    console.log("It's Tuesday!");
    break;
  // ...
  default:
    console.log("It's another day!");
}
```

Оператор `switch` используется для выбора одного из множества блоков кода для выполнения, основываясь на значении переменной.

Эти концепции представляют основные элементы операторов, сравнения и условий в JavaScript.

<a href="https://learn.javascript.ru/" target="_blank">Современный учебник JavaScript</a>