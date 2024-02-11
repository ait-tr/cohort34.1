Русский текст смотри ниже

# JSON format:

JSON (JavaScript Object Notation) is a lightweight data interchange format based on a subset of JavaScript syntax. JSON is a text format consisting of key-value pairs and ordered lists of values.

### JSON format:

Example JSON data

```
{
   "name": "Count Dracula",
   "age": 539,
   "title": "Count",
   "isVampire": true,
   "residence": {
     "location": "Castle Dracula",
     "country": "Transylvania"
   },
   "victims": ["Jonathan Harker", "Mina Harker", "Lucy Westenra"]
}
```

### JSON.parse():

An example of using JSON.parse() to convert a JSON string into a JavaScript object:

```
const jsonString = '{"name": "Count Dracula", "age": 539, "title": "Count", "isVampire": true, "residence": {"location": "Castle Dracula", "country" ": "Transylvania"}, "victims": ["Jonathan Harker", "Mina Harker", "Lucy Westenra"]}';
```

// Convert JSON string to object

```
const dracula = JSON.parse(jsonString);

console.log(dracula.name); // "Count Dracula"
console.log(dracula.age); // 539
console.log(dracula.residence.location); // "Castle Dracula"
```

### JSON.stringify():

An example of using JSON.stringify() to convert a JavaScript object to a JSON string:

```
const dracula = {
   name: "Count Dracula",
   age: 539,
   title: "Count",
   isVampire: true,
   residence: {
     location: "Castle Dracula",
     country: "Transylvania"
   },
   victims: ["Jonathan Harker", "Mina Harker", "Lucy Westenra"]
};
```

// Convert object to JSON string

```
const jsonString = JSON.stringify(dracula, null, 2);

console.log(jsonString);
/*
{
   "name": "Count Dracula",
   "age": 539,
   "title": "Count",
   "isVampire": true,
   "residence": {
     "location": "Castle Dracula",
     "country": "Transylvania"
   },
   "victims": ["Jonathan Harker", "Mina Harker", "Lucy Westenra"]
}
*/
```

These examples use Count Dracula data to demonstrate the use of JSON.parse() and JSON.stringify() in JavaScript.

### Fetch:

The `fetch` method is used for asynchronous requests to the server. Returns a Promise that resolves to a Response object representing the response to the request.

```javascript
fetch('https://api.example.com/data')
  .then(response => {
    if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    return response.json();
  })
  .then(data => console.log(data))
  .catch(error => console.error('Error:', error));
```

`fetch` can also take a second argument - an object with request parameters such as method (GET, POST, etc.), headers, request body and other options.


<br/><hr/><br/>


# Формат JSON:

JSON (JavaScript Object Notation) - это легковесный формат обмена данными, основанный на подмножестве синтаксиса JavaScript. JSON представляет собой текстовый формат, состоящий из пар "ключ-значение" и упорядоченных списков значений.

### Формат JSON:

Пример JSON-данных

```
{
  "name": "Count Dracula",
  "age": 539,
  "title": "Count",
  "isVampire": true,
  "residence": {
    "location": "Castle Dracula",
    "country": "Transylvania"
  },
  "victims": ["Jonathan Harker", "Mina Harker", "Lucy Westenra"]
}
```

### JSON.parse():

Пример использования JSON.parse() для преобразования строки JSON в объект JavaScript:

```
const jsonString = '{"name": "Count Dracula", "age": 539, "title": "Count", "isVampire": true, "residence": {"location": "Castle Dracula", "country": "Transylvania"}, "victims": ["Jonathan Harker", "Mina Harker", "Lucy Westenra"]}';
```

// Преобразование строки JSON в объект

```
const dracula = JSON.parse(jsonString);

console.log(dracula.name); // "Count Dracula"
console.log(dracula.age); // 539
console.log(dracula.residence.location); // "Castle Dracula"
```

### JSON.stringify():

Пример использования JSON.stringify() для преобразования объекта JavaScript в строку JSON:

```
const dracula = {
  name: "Count Dracula",
  age: 539,
  title: "Count",
  isVampire: true,
  residence: {
    location: "Castle Dracula",
    country: "Transylvania"
  },
  victims: ["Jonathan Harker", "Mina Harker", "Lucy Westenra"]
};
```

// Преобразование объекта в строку JSON

```
const jsonString = JSON.stringify(dracula, null, 2);

console.log(jsonString);
/*
{
  "name": "Count Dracula",
  "age": 539,
  "title": "Count",
  "isVampire": true,
  "residence": {
    "location": "Castle Dracula",
    "country": "Transylvania"
  },
  "victims": ["Jonathan Harker", "Mina Harker", "Lucy Westenra"]
}
*/
```

В этих примерах используются данные о Графе Дракуле для демонстрации использования JSON.parse() и JSON.stringify() в JavaScript.

### Fetch:

Метод `fetch` используется для асинхронных запросов к серверу. Возвращает Promise, который разрешается в объект Response, представляющий ответ на запрос.

```javascript
fetch('https://api.example.com/data')
 .then(response => {
   if (!response.ok) {
     throw new Error('Network response was not ok');
   }
   return response.json();
 })
 .then(data => console.log(data))
 .catch(error => console.error('Error:', error));
```

`fetch` также может принимать второй аргумент - объект с параметрами запроса, такими как метод (GET, POST и т. д.), заголовки, тело запроса и другие опции.



<a href="https://learn.javascript.ru/" target="_blank">Современный учебник JavaScript</a>

