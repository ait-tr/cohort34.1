Русский текст смотри ниже

### Object Literal:

An object literal in JavaScript is a way of creating an object by defining its properties and their values within curly braces `{}`.

```javascript
// Object literal
const person = {
   name: 'John',
   age: 25,
   city: 'Example City'
};
```

### Object Syntax (Working with keys, bracket syntax):

An object in JavaScript can contain strings, numbers, and characters as keys. Object values can be accessed using dot notation or bracket syntax.

```javascript
// Access value by key (dot notation)
const personName = person.name;

// Access value by key (bracket syntax)
const personAge = person['age'];
```

### Getting Values by Key:

```javascript
const person = {
   name: 'John',
   age: 25,
   city: 'Example City'
};

const name = person.name; // 'John'
const age = person['age']; // 25
```

### Getting Keys/Values:

```javascript
const person = {
   name: 'John',
   age: 25,
   city: 'Example City'
};

const keys = Object.keys(person); // ['name', 'age', 'city']
const values = Object.values(person); // ['John', 25, 'Example City']
```

### Removing Properties from an Object:

```javascript
const person = {
   name: 'John',
   age: 25,
   city: 'Example City'
};

delete person.age; // Remove the 'age' property
```

### Checking Object Properties:

```javascript
const person = {
   name: 'John',
   age: 25,
   city: 'Example City'
};

const hasAge = 'age' in person; // true
const hasGender = 'gender' in person; // false
```

### Searching for Keys:

```javascript
const person = {
   name: 'John',
   age: 25,
   city: 'Example City'
};

// Enumerate keys
for (let key in person) {
   console.log(key); // 'name', 'age', 'city'
}

// Iterate over values
for (let key in person) {
   console.log(person[key]); // 'John', 25, 'Example City'
}
```

These methods help in managing and interacting with objects in JavaScript by providing access to their properties and values.

<br/><hr/><br/>

### Object Literal (Литерал объекта):

Литерал объекта в JavaScript представляет собой способ создания объекта путем определения его свойств и их значений в фигурных скобках `{}`.

```javascript
// Object literal
const person = {
  name: 'John',
  age: 25,
  city: 'Example City'
};
```

### Object Syntax (Работа с ключами, брекет-синтаксис):

Объект в JavaScript может содержать строки, числа и символы в качестве ключей. Доступ к значениям объекта можно получить с использованием точечной нотации или брекет-синтаксиса.

```javascript
// Доступ к значению по ключу (точечная нотация)
const personName = person.name;

// Доступ к значению по ключу (брекет-синтаксис)
const personAge = person['age'];
```

### Получение Значений по Ключу:

```javascript
const person = {
  name: 'John',
  age: 25,
  city: 'Example City'
};

const name = person.name; // 'John'
const age = person['age']; // 25
```

### Получение Ключей/Значений:

```javascript
const person = {
  name: 'John',
  age: 25,
  city: 'Example City'
};

const keys = Object.keys(person); // ['name', 'age', 'city']
const values = Object.values(person); // ['John', 25, 'Example City']
```

### Удаление Свойств из Объекта:

```javascript
const person = {
  name: 'John',
  age: 25,
  city: 'Example City'
};

delete person.age; // Удаление свойства 'age'
```

### Проверка Свойств Объекта:

```javascript
const person = {
  name: 'John',
  age: 25,
  city: 'Example City'
};

const hasAge = 'age' in person; // true
const hasGender = 'gender' in person; // false
```

### Перебор Ключей:

```javascript
const person = {
  name: 'John',
  age: 25,
  city: 'Example City'
};

// Перебор ключей
for (let key in person) {
  console.log(key); // 'name', 'age', 'city'
}

// Перебор значений
for (let key in person) {
  console.log(person[key]); // 'John', 25, 'Example City'
}
```

Эти методы помогают в управлении и взаимодействии с объектами в JavaScript, обеспечивая доступ к их свойствам и значениям.



<a href="https://learn.javascript.ru/" target="_blank">Современный учебник JavaScript</a>

