Русский текст смотри ниже

##DOM
DOM (Document Object Model) in JavaScript is a document structure in the form of a tree of objects, where each node represents a part of the document (for example, an element, an attribute, text, etc.). JavaScript can interact with the DOM by modifying it, updating it, adding or removing elements. One of the main methods for accessing DOM elements is `getElementById`.

Example of using `getElementById`:

```html
<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>DOM Example</title>
   <style>
     .highlight {
       color:red;
       font-weight: bold;
     }
   </style>
</head>
<body>

   <h1 id="mainTitle">Hello, DOM!</h1>
   <p>This is a simple example of the Document Object Model (DOM).</p>

   <script>
     // Getting an element by its identifier (id)
     let titleElement = document.getElementById('mainTitle');

     // Change element content
     titleElement.innerHTML = 'New Title';

     // Change element style
     titleElement.style.color = 'blue';

     // Add a class to the element
     titleElement.classList.add('highlight');
   </script>

</body>
</html>
```

In this example:

- `<h1 id="mainTitle">Hello, DOM!</h1>` - we have an element `<h1>` that has a unique identifier (`id`) "mainTitle".
- `var titleElement = document.getElementById('mainTitle');` - we use `getElementById` to get a reference to this element by its ID.
- `titleElement.innerHTML = 'New Title';` - we change the content of the element.
- `titleElement.style.color = 'blue';` - we change the style of the element.
- `titleElement.classList.add('highlight');` - we add the "highlight" class to the element.

So using `getElementById` allows us to access elements by their unique ID and interact with them using JavaScript.


### The HTML DOM is also the HTML object model. It defines:

- HTML elements as objects
- Properties for all HTML elements.
- Methods for all HTML elements.
- Events for all HTML elements


### HTML DOM is an API (programming interface, that is, a certain common set of working methods) for JavaScript:

- JavaScript can add/modify/remove HTML elements.
- JavaScript can add/change/remove HTML attributes.
- JavaScript can add/change/remove CSS styles.
- JavaScript can respond to HTML events.
- JavaScript can add/modify/remove HTML events.

When a web page loads, the browser creates a document object model of the page.

The HTML DOM is built as a tree of objects.

### Finding HTML elements
If you want to access HTML elements using JavaScript, you need to find those elements first.

There are several ways to do this:

- Search HTML elements by ID
- Search for HTML elements by tag name.
- Search for HTML elements by class name.
- Finding HTML elements using CSS selectors.
- Search HTML elements across collections of HTML objects.

### Finding an HTML element by ID
The easiest way to find an HTML element in the DOM is to use the element's ID.

This example searches for an element with id="intro":

```
let myElement = document.getElementById("intro");
```

<br/><hr/><br/>

## DOM
DOM (Document Object Model) в JavaScript представляет собой структуру документа в виде дерева объектов, где каждый узел представляет собой часть документа (например, элемент, атрибут, текст и т.д.). JavaScript может взаимодействовать с DOM, изменяя его, обновляя, добавляя или удаляя элементы. Одним из основных методов доступа к элементам DOM является `getElementById`.

Пример использования `getElementById`:

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>DOM Example</title>
  <style>
    .highlight {
      color: red;
      font-weight: bold;
    }
  </style>
</head>
<body>

  <h1 id="mainTitle">Hello, DOM!</h1>
  <p>This is a simple example of the Document Object Model (DOM).</p>

  <script>
    // Получение элемента по его идентификатору (id)
    let titleElement = document.getElementById('mainTitle');

    // Изменение содержимого элемента
    titleElement.innerHTML = 'New Title';

    // Изменение стиля элемента
    titleElement.style.color = 'blue';

    // Добавление класса к элементу
    titleElement.classList.add('highlight');
  </script>

</body>
</html>
```

В этом примере:

- `<h1 id="mainTitle">Hello, DOM!</h1>` - у нас есть элемент `<h1>`, который имеет уникальный идентификатор (`id`) "mainTitle".
- `var titleElement = document.getElementById('mainTitle');` - мы используем `getElementById` для получения ссылки на этот элемент по его идентификатору.
- `titleElement.innerHTML = 'New Title';` - мы изменяем содержимое элемента.
- `titleElement.style.color = 'blue';` - мы изменяем стиль элемента.
- `titleElement.classList.add('highlight');` - мы добавляем класс "highlight" к элементу.

Таким образом, использование `getElementById` позволяет нам получать доступ к элементам по их уникальному идентификатору и взаимодействовать с ними с помощью JavaScript.


### HTML DOM — это также и объектная модель HTML. Он определяет:

- HTML-элементы как объекты
- Свойства для всех элементов HTML.
- Методы для всех элементов HTML.
- События для всех элементов HTML


### HTML DOM — это API (интерфейс программирования, то есть определенный общий набор методов работы) для JavaScript:

- JavaScript может добавлять/изменять/удалять элементы HTML.
- JavaScript может добавлять/изменять/удалять атрибуты HTML.
- JavaScript может добавлять/изменять/удалять стили CSS.
- JavaScript может реагировать на события HTML.
- JavaScript может добавлять/изменять/удалять события HTML.

Когда веб-страница загружается, браузер создает объектную модель документа страницы.

Модель HTML DOM построена как дерево объектов.

### Поиск HTML-элементов
Если вы хотите получить доступ к HTML-элементам с помощью JavaScript, вам нужно сначала найти эти элементы.

Есть несколько способов сделать это:

- Поиск HTML-элементов по идентификатору
- Поиск HTML-элементов по имени тега.
- Поиск HTML-элементов по имени класса.
- Поиск элементов HTML с помощью селекторов CSS.
- Поиск элементов HTML по коллекциям объектов HTML.

### Поиск HTML-элемента по идентификатору 
Самый простой способ найти элемент HTML в DOM — использовать идентификатор элемента.

В этом примере выполняется поиск элемента с id="intro":

```
let myElement = document.getElementById("intro");
```

<img src="https://github.com/ait-tr/cohort34.1/blob/main/front_end/lesson_13/dom-links-elements.png?raw=true" alt="dom"/>
<br/>
<a href="https://learn.javascript.ru/" target="_blank">Современный учебник JavaScript</a>

