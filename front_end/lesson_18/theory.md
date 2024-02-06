Русский текст смотри ниже

### The appearance of classes
With the release of ECMAScript 6, a whole set of keywords appeared that implement classes. They may seem familiar to people who have studied class-based languages, but there are significant differences. JavaScript was and remains a prototype-oriented language. New keywords: "class", "constructor", "static", "extends" and "super".

Classes in JavaScript are templates for creating objects. They provide a convenient way to define objects with common properties and methods.

```javascript
class Wizard {
  constructor(name, house) {
    this.name = name;
    this.house = house;
  }

  introduce() {
    console.log(`I am ${this.name} from ${this.house} house.`);
  }
}

// Create an instance of the class
const harry = new Wizard('Harry Potter', 'Gryffindor');
harry.introduce(); // "I am Harry Potter from Gryffindor house."
```

### Class methods in JavaScript:

Class methods are functions defined within a class and used to perform specific actions.

```javascript
class Wizard {
  constructor(name, house) {
    this.name = name;
    this.house = house;
  }

  introduce() {
    console.log(`I am ${this.name} from ${this.house} house.`);
  }

  castSpell(spell) {
    console.log(`${this.name} casts ${spell}!`);
  }
}

const hermione = new Wizard('Hermione Granger', 'Gryffindor');
hermione.castSpell('Lumos'); // "Hermione Granger casts Lumos!"
```

### Inheritance in JavaScript:

Inheritance allows you to create new classes using the properties and methods of an existing class.

```javascript
class DarkWizard extends Wizard {
  constructor(name, house, darkPower) {
    super(name, house);
    this.darkPower = darkPower;
  }

  useDarkPower() {
    console.log(`${this.name} uses dark power: ${this.darkPower}`);
  }
}

const voldemort = new DarkWizard('Lord Voldemort', 'Slytherin', 'Avada Kedavra');
voldemort.introduce(); // "I am Lord Voldemort from Slytherin house."
voldemort.useDarkPower(); // "Lord Voldemort uses dark power: Avada Kedavra"
```

### Getters and Setters in JavaScript:

Getters are used to get the value of a property, and setters are used to set its value.

```javascript
class Wizard {
  constructor(name, house) {
    this.#name = name; // Private field
    this.house = house;
  }

  get name() {
    return this.#name;
  }

  set name(newName) {
    this.#name = newName;
  }
}

const ron = new Wizard('Ron Weasley', 'Gryffindor');
console.log(ron.name); // "Ron Weasley"
ron.name = 'Ronald Weasley';
console.log(ron.name); // "Ronald Weasley"
```

### Private Fields and Methods in JavaScript:

Private fields and methods can be created using the suggested `#` syntax.

```javascript
class Wizard {
  #privateField;

  constructor(name, house) {
    this.name = name;
    this.house = house;
    this.#privateField = 'Secret';
  }

  #privateMethod() {
    console.log('This is a private method.');
  }

  revealSecret() {
    console.log(`My secret is ${this.#privateField}.`);
    this.#privateMethod();
  }
}

const ginny = new Wizard('Ginny Weasley', 'Gryffindor');
ginny.revealSecret(); // "My secret is Secret." / "This is a private method."
```

### Static Fields and Methods in JavaScript:

Static fields and methods belong to the class itself, not to its instances.

```javascript
class Hogwarts {
  static schoolMotto = 'Draco Dormiens Nunquam Titillandus';

  static displayMotto() {
    console.log(`Hogwarts School Motto: ${Hogwarts.schoolMotto}`);
  }
}

Hogwarts.displayMotto(); // "Hogwarts School Motto: Draco Dormiens Nunquam Titillandus"
```

<br/><hr/><br/>

### Появление классов
С выходом ECMAScript 6 появился целый набор ключевых слов, реализующих классы. Они могут показаться знакомыми людям, изучавшим языки, основанные на классах, но есть существенные отличия. JavaScript был и остаётся прототипно-ориентированным языком. Новые ключевые слова: "class", "constructor", "static", "extends" и "super".

Классы в JavaScript представляют собой шаблоны для создания объектов. Они предоставляют удобный способ определения объектов с общими свойствами и методами.

```javascript
class Wizard {
 constructor(name, house) {
   this.name = name;
   this.house = house;
 }

 introduce() {
   console.log(`I am ${this.name} from ${this.house} house.`);
 }
}

// Создание экземпляра класса
const harry = new Wizard('Harry Potter', 'Gryffindor');
harry.introduce(); // "I am Harry Potter from Gryffindor house."
```

### Методы класса в JavaScript:

Методы класса - это функции, определенные внутри класса и используемые для выполнения определенных действий.

```javascript
class Wizard {
 constructor(name, house) {
   this.name = name;
   this.house = house;
 }

 introduce() {
   console.log(`I am ${this.name} from ${this.house} house.`);
 }

 castSpell(spell) {
   console.log(`${this.name} casts ${spell}!`);
 }
}

const hermione = new Wizard('Hermione Granger', 'Gryffindor');
hermione.castSpell('Lumos'); // "Hermione Granger casts Lumos!"
```

### Наследование в JavaScript:

Наследование позволяет создавать новые классы, используя свойства и методы существующего класса.

```javascript
class DarkWizard extends Wizard {
 constructor(name, house, darkPower) {
   super(name, house);
   this.darkPower = darkPower;
 }

 useDarkPower() {
   console.log(`${this.name} uses dark power: ${this.darkPower}`);
 }
}

const voldemort = new DarkWizard('Lord Voldemort', 'Slytherin', 'Avada Kedavra');
voldemort.introduce(); // "I am Lord Voldemort from Slytherin house."
voldemort.useDarkPower(); // "Lord Voldemort uses dark power: Avada Kedavra"
```

### Геттеры и Сеттеры в JavaScript:

Геттеры используются для получения значения свойства, а сеттеры - для установки его значения.

```javascript
class Wizard {
 constructor(name, house) {
   this.#name = name; // Приватное поле
   this.house = house;
 }

 get name() {
   return this.#name;
 }

 set name(newName) {
   this.#name = newName;
 }
}

const ron = new Wizard('Ron Weasley', 'Gryffindor');
console.log(ron.name); // "Ron Weasley"
ron.name = 'Ronald Weasley';
console.log(ron.name); // "Ronald Weasley"
```

### Приватные Поля и Методы в JavaScript:

Приватные поля и методы могут быть созданы с использованием предлагаемого синтаксиса `#`.

```javascript
class Wizard {
 #privateField;

 constructor(name, house) {
   this.name = name;
   this.house = house;
   this.#privateField = 'Secret';
 }

 #privateMethod() {
   console.log('This is a private method.');
 }

 revealSecret() {
   console.log(`My secret is ${this.#privateField}.`);
   this.#privateMethod();
 }
}

const ginny = new Wizard('Ginny Weasley', 'Gryffindor');
ginny.revealSecret(); // "My secret is Secret." / "This is a private method."
```

### Статические Поля и Методы в JavaScript:

Статические поля и методы принадлежат самому классу, а не его экземплярам.

```javascript
class Hogwarts {
 static schoolMotto = 'Draco Dormiens Nunquam Titillandus';

 static displayMotto() {
   console.log(`Hogwarts School Motto: ${Hogwarts.schoolMotto}`);
 }
}

Hogwarts.displayMotto(); // "Hogwarts School Motto: Draco Dormiens Nunquam Titillandus"
```


<a href="https://learn.javascript.ru/" target="_blank">Современный учебник JavaScript</a>

