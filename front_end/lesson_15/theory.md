Русский текст смотри ниже

# Basic array methods:

## To add/remove elements:

push (...items) – adds elements to the end,
pop() – retrieves an element from the end,
shift() – retrieves the element from the beginning,
unshift(...items) – adds items to the beginning.
splice(pos, deleteCount, ...items) – starting from index pos, deletes deleteCount elements and inserts items.
slice(start, end) – creates a new array, copying elements into it from position start to end (not including end).
concat(...items) – returns a new array: copies all members of the current array and adds items to it. If any of the items is an array, then its elements are taken.

## To search among elements:

indexOf/lastIndexOf(item, pos) – searches for item starting at position pos and returns its index or -1 if nothing is found.
includes(value) – returns true if the array contains a value element, false otherwise.
find/filter(func) – filters elements through a function and returns the first/all values, when passed through the function, true is returned.
let result = arr.find(function(item, index, array) {
// if true - the current element is returned and the search is interrupted
// if all iterations fail, undefined is returned
});
findIndex is similar to find, but returns an index instead of a value.

## To iterate over elements:

forEach(func) – calls func for each element. Returns nothing.
arr.forEach(function(item, index, array) {
// ... do something with item
});

## To convert an array:

map(func) – creates a new array from the results of calling func for each element.
let result = arr.map(function(item, index, array) {
// new value is returned instead of the element
});
sort(func) – sorts the array “in place” and then returns it.
reverse() – “in place” reverses the order of the elements and returns the modified array.
split/join – converts a string to an array and back.
reduce(func, initial) - Computes a single value based on the entire array, calling func on each element and passing the intermediate result between calls.

## Additionally:

Array.isArray(arr) checks whether arr is an array.

**Note that the sort, reverse and splice methods modify the original array.**

<br/><hr/><br/>

# Основные методы массива:

## Для добавления/удаления элементов:

push (...items) – добавляет элементы в конец,
pop() – извлекает элемент с конца,
shift() – извлекает элемент с начала,
unshift(...items) – добавляет элементы в начало.
splice(pos, deleteCount, ...items) – начиная с индекса pos, удаляет deleteCount элементов и вставляет items.
slice(start, end) – создаёт новый массив, копируя в него элементы с позиции start до end (не включая end).
concat(...items) – возвращает новый массив: копирует все члены текущего массива и добавляет к нему items. Если какой-то из items является массивом, тогда берутся его элементы.

## Для поиска среди элементов:

indexOf/lastIndexOf(item, pos) – ищет item, начиная с позиции pos, и возвращает его индекс или -1, если ничего не найдено.
includes(value) – возвращает true, если в массиве имеется элемент value, в противном случае false.
find/filter(func) – фильтрует элементы через функцию и отдаёт первое/все значения, при прохождении которых через функцию возвращается true.
	let result = arr.find(function(item, index, array) {
	  // если true - возвращается текущий элемент и перебор прерывается
	  // если все итерации оказались ложными, возвращается undefined
	});
findIndex похож на find, но возвращает индекс вместо значения.

## Для перебора элементов:

forEach(func) – вызывает func для каждого элемента. Ничего не возвращает.
	arr.forEach(function(item, index, array) {
	  // ... делать что-то с item
	});

## Для преобразования массива:

map(func) – создаёт новый массив из результатов вызова func для каждого элемента.
	let result = arr.map(function(item, index, array) {
	  // возвращается новое значение вместо элемента
	});
sort(func) – сортирует массив «на месте», а потом возвращает его.
reverse() – «на месте» меняет порядок следования элементов на противоположный и возвращает изменённый массив.
split/join – преобразует строку в массив и обратно.
reduce(func, initial) – вычисляет одно значение на основе всего массива, вызывая func для каждого элемента и передавая промежуточный результат между вызовами.

## Дополнительно:

Array.isArray(arr) проверяет, является ли arr массивом.

**Обратите внимание, что методы sort, reverse и splice изменяют исходный массив.**


<a href="https://learn.javascript.ru/" target="_blank">Современный учебник JavaScript</a>

