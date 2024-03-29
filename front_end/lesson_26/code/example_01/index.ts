console.log("hello");

// Время компиляции(compilation time) vs  Время выполнения (runtime)
// Когда лучше обнаружить ошибку?
// - на этапе

// Плюсы использования ts:
// - безопасность типов (обнаружение ошибок на этапе компиляции)
// - удобнее работать в команде
// - транспиляция в любую удобную нам версию js

// Минусы:
//

// Может ли браузер воспроизвести ts?
// нет, не может.
// Поэтому ts код преобразуется в какую-то определенную версию js -
// и только тогда браузер его может прочитать

// Как можно задать тип переменной?
// - явно (эксплицитно)
// - неявно(имплицитно)

let x = 10;
// опеределился ли тип у переменной x
// x = "apple"; // здесь будет ошибка - нельзя присвоить стринг переменной с типом number

// Пример явного определения типа
let y: number = 10; // int y = 10;

// опеределить тип переменной - объявление переменной
let z: string; // в джава выглядело бы так String z;

// Primitive types
let isDrunk: boolean = false;
let fName: string = "John";

// Union type - ЮНИОН ТИП
// либо стринг либо число
let age: string | number;
age = 10;
age = "10";
//   string | number

// Можно указать какой-то определенный стринг
let gender: "male" | "female";

gender = "male";

// Мы можем сохранить юнион тип отдельно:
// создал тип. Типы пишутся с большой буквы!!!
type Gender = "male" | "female";
// Объявил переменную указанного типа Gender - и инициализировал -
let myGender: Gender = "male";
// let katerinasGender: Gender = "cat"; // здесь будет ошибка

// Допустим сделать тип для расширенного пола - "non-binary-person"

type ExtendedGender = Gender | "non-binary-person";

let firstPersonGender: ExtendedGender = "male";
let secondPersonGender: ExtendedGender = "female";
let thirdPersonGender: ExtendedGender = "non-binary-person";
// let fourthPersonGender: ExtendedGender = "cat"; // будет ругаться

// Задание 1 - Union type
// создайте тип NordenFruit
// - северный фрукт - пусть в него входят яблоко, груша, слива - apple, pear, plum

// создайте тип ExoticFruit - mango, papaya, passion fruit

// создайте тип Fruit - включает все эти фрукты

// создайте несколько переменных указанных типов

type NordenFruit = "apple" | "pear" | "plum";
type ExoticFruit = "mango" | "papaya" | "passion fruit" | "orange";
type Fruit = NordenFruit | ExoticFruit;

let myFavFruit: Fruit = "mango";
let bestExoticFruit2024: ExoticFruit = "papaya";

// Как типизировать массив? ARRAY
// массив фруктов
const fruits: Fruit[] = ["apple", "mango", "orange"];

const ages: number[] = [17, 35, 18, 84, 65, 30];

// TUPLE -  картеж - достаточно редко используется
// по сути это массив - у которого на разных позициях разные типы
type Info = [string, number, boolean];
const infoAlisher: Info = ["Alisher", 29, true];

// Как типизировать объекты?
// первый способ - через type - пишем имя свойство: тип - через точку с запятой
type User = { name: string; age: number };

const vitaliy: User = {
  name: "Vitaliy",
  age: 33,
};

// INTERFACE - это еще один способ типизации для объекта
// это предпочтительный способ- через слово interface

interface Product {
  price: number;
  title: string;
}

const iphone: Product = { price: 300, title: "Iphone 13" };

// const nokia: Product = {  title: "Nokia" }; // ошибка
const price = 250;
const iphone2: Product = { price, title: "Iphone 13" };

// интерфейсы можно наследовать один от другого

interface ProductWithDescription extends Product {
  description: string; // указал поле, которым хочу раширить Product
}

const newProduct: ProductWithDescription = {
  description: "wonderful apple pie, just like your grandmas",
  price: 10,
  title: "apple pie",
};

// Задание 2
// Создайте интерфейс Parrot - с полем имя
// создайте интерфейс Pirate - c полями name, parrot и weapon ("saber" или "pistol")
// Создайте интерфейс Captain раширяющий интерефейс Pirate
// + одно поле - название корабля - shipTitle

// Создайте объекты под эти интерфесы

interface Parrot {
  name: string;
}

type Weapon = "saber" | "pistol";

interface Pirate {
  name: string;
  parrot: Parrot;
  weapon: Weapon;
}

interface Captain extends Pirate {
  shipTitle: string;
}

// создадим объекты
const popka: Parrot = {
  name: "Popka",
};

const blackBeard: Pirate = {
  name: "Black Beard",
  parrot: popka,
  weapon: "saber",
};

const capitanSparrow: Captain = {
  name: "Jack Sparrow",
  parrot: popka,
  weapon: "pistol",
  shipTitle: "Black Pearl",
};

// : any - любой - лучше избегать any
//

// Как типизировать функции?
// что принимает? то есть какие параметры
// что возвращает? какой тип возвращаемого значения - если никакой - можно написать void
// пример 1
function sum(a: number, b: number): number {
  return a + b;
}

const res = sum(10, 15);
console.log(res); // 25

// пример 2 - когда функция ничего не возварщеат
function printNumber(a: number): void {
  console.log(a);
}

// Как типизировать стрелочную функцию?
const subtract = (a: number, b: number): number => a - b;

// пример 3 - напишем функцию проверки возраста для алкоголя
// если возраст >= 21 возвращает true
// если нет - то false

const isMature = (age: number): boolean => {
  if (age >= 21) {
    return true;
  }
  return false;
};

const luisaAge = 15;
console.log(isMature(luisaAge));

// enum - только в ts
enum Size {
  SMALL = 150,
  MIDDLE = 200,
  BIG = 350,
}

console.log(Size.SMALL);
console.log(typeof Size.SMALL); // number
console.log(typeof Size); // object
