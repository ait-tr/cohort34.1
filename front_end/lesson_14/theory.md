Русский текст смотри ниже

## Events

You can write JavaScript code that executes when an event occurs, such as when a user clicks an HTML element, moves the mouse, or submits a form.
When an event occurs on a target element, a handler function is executed. 
Common HTML events include: 
Corresponding events can be added to HTML elements as attributes. 
For example:

```
 <p onclick="someFunc()">some text</p>
```
Handling Events


Let's display an alert popup when the user clicks a specified button: 

```
<button onclick="show()">Click Me</button>
<script>
function show() {
alert("Hi there");
}
</script>
```

Event handlers can be assigned to elements.
For example: 

```
const x = document.getElementById("demo");
x.onclick = function () {
document.body.innerHTML = Date();
}
```

The onload and onunload events are triggered when the user enters or leaves the page. These can be useful when performing actions after the page is loaded. 

```
<body onload="doSomething()">
```

Similarly, the window.onload event can be used to run code after the whole page is loaded.

```
window.onload = function() {
//some code
}
```

The onchange event is mostly used on textboxes. The event handler gets called when the text inside the textbox changes and focus is lost from the element.
For example:

```
<input type="text" id="name" onchange="change()">
<script>
function change() {
const x = document.getElementById("name");
x.value= x.value.toUpperCase();
}
</script>
```

## Event Listeners


The addEventListener() method attaches an event handler to an element without overwriting existing event handlers. You can add many event handlers to one element.
You can also add many event handlers of the same type to one element, i.e., two "click" events.element.addEventListener(event, function, useCapture);
The first parameter is the event's type (like "click" or "mousedown").
The second parameter is the function we want to call when the event occurs.
The third parameter is a Boolean value specifying whether to use event bubbling or event capturing. This parameter is optional, and will be described in the next lesson.
Note that you don't use the "on" prefix for this event; use "click" instead of "onclick".
Example: element.addEventListener("click", myFunction);
element.addEventListener("mouseover", myFunction);

```
function myFunction() {
alert("Hello World!");
}
```

This adds two event listeners to the element.
We can remove one of the listeners: 

```
element.removeEventListener("mouseover", myFunction);
```

Let's create an event handler that removes itself after being executed: 

```
<button id="demo">Start</button>
```

```
<script>
const btn = document.getElementById("demo");
btn.addEventListener("click", myFunction);

function myFunction() {
alert(Math.random());
btn.removeEventListener("click", myFunction);
}
</script>
```

After clicking the button, an alert with a random number displays and the event listener is removed.


## Event Propagation


There are two ways of event propagation in the HTML DOM: bubbling and capturing.

Event propagation allows for the definition of the element order when an event occurs. If you have a <p> element inside a <div> element, and the user clicks on the <p> element, which element's "click" event should be handled first?

In bubbling, the innermost element's event is handled first and then the outer element's event is handled. The <p> element's click event is handled first, followed by the <div> element's click event.

In capturing, the outermost element's event is handled first and then the inner. The <div> element's click event is handled first, followed by the <p> element's click event.
Capturing goes down the DOM.
Bubbling goes up the DOM.


## Capturing vs. Bubbling


The addEventListener() method allows you to specify the propagation type with the "useCapture" parameter.addEventListener(event, function, useCapture) 
The default value is false, which means the bubbling propagation is used; when the value is set to true, the event uses the capturing propagation. //Capturing propagation
elem1.addEventListener("click", myFunction, true); 

//Bubbling propagation
elem2.addEventListener("click", myFunction, false);
This is particularly useful when you have the same event handled for multiple elements in the DOM hierarchy.

<br/><hr/><br/>

## События

Вы можете написать код JavaScript, который выполняется при возникновении события, например, когда пользователь щелкает элемент HTML, перемещает мышь или отправляет форму.
Когда событие происходит в целевом элементе, выполняется функция-обработчик.
Общие события HTML включают в себя:
Соответствующие события можно добавлять к элементам HTML в качестве атрибутов.
Например:

```
  <p onclick="someFunc()">некоторый текст</p>
```
Обработка событий


Давайте отобразим всплывающее окно с предупреждением, когда пользователь нажимает указанную кнопку:

```
<button onclick="show()">Нажмите на меня</button>
<script>
функция шоу() {
alert("Привет");
}
</script>
```

Обработчики событий могут быть назначены элементам.
Например:

```
const x = document.getElementById("демо");
x.onclick = функция () {
document.body.innerHTML = Дата();
}
```

События onload и onunload запускаются, когда пользователь входит или покидает страницу. Это может быть полезно при выполнении действий после загрузки страницы.

```
<body onload="doSomething()">
```

Аналогично, событие window.onload можно использовать для запуска кода после загрузки всей страницы.

```
window.onload = функция() {
//некоторый код
}
```

Событие onchange в основном используется в текстовых полях. Обработчик событий вызывается, когда текст внутри текстового поля изменяется и фокус элемента теряется.
Например:

```
<input type="text" id="name" onchange="change()">
<script>
изменение функции() {
const x = document.getElementById("имя");
x.value = x.value.toUpperCase();
}
</script>
```

## Прослушиватели событий


Метод addEventListener() присоединяет обработчик событий к элементу, не перезаписывая существующие обработчики событий. Вы можете добавить множество обработчиков событий в один элемент.
Вы также можете добавить в один элемент множество обработчиков событий одного типа, т. е. два «щелчка» event.element.addEventListener(event, function, useCapture);
Первый параметр — это тип события (например, «щелчок» или «нажатие мыши»).
Второй параметр — это функция, которую мы хотим вызвать при возникновении события.
Третий параметр — это логическое значение, указывающее, следует ли использовать всплытие событий или захват событий. Этот параметр является необязательным и будет описан в следующем уроке.
Обратите внимание: для этого события не используется префикс «on»; используйте «click» вместо «onclick».
Пример: element.addEventListener("click", myFunction);
element.addEventListener("наведение мыши", myFunction);

```
функция myFunction() {
alert("Привет, мир!");
}
```

Это добавит к элементу два прослушивателя событий.
Мы можем удалить одного из слушателей:

```
element.removeEventListener("наведение курсора", myFunction);
```

Давайте создадим обработчик событий, который удаляется после выполнения:

```
<button id="demo">Начать</button>
```

```
<сscript>
const btn = document.getElementById("демо");
btn.addEventListener("клик", myFunction);

функция myFunction() {
оповещение(Math.random());
btn.removeEventListener("клик", myFunction);
}
</script>
```

После нажатия кнопки отображается оповещение со случайным числом и прослушиватель событий удаляется.


## Распространение событий


В HTML DOM существует два способа распространения событий: всплытие и захват.

Распространение событий позволяет определить порядок элементов при возникновении события. Если у вас есть элемент <p> внутри элемента <div>, и пользователь щелкает элемент <p>, событие «click» какого элемента должно быть обработано первым?

При всплытии сначала обрабатывается событие самого внутреннего элемента, а затем — событие внешнего элемента. Сначала обрабатывается событие щелчка элемента <p>, а затем событие щелчка элемента <div>.

При захвате сначала обрабатывается событие самого внешнего элемента, а затем внутреннего. Сначала обрабатывается событие щелчка элемента <div>, а затем событие щелчка элемента <p>.
Захват происходит в DOM.
Пузырьки поднимаются вверх по DOM.


## Захват или всплытие


Метод addEventListener() позволяет указать тип распространения с помощью параметра useCapture.addEventListener(event, function, useCapture)
Значение по умолчанию — false, что означает, что используется пузырьковое распространение; если для значения установлено значение true, событие использует распространение при захвате. //Захват распространения
elem1.addEventListener("клик", myFunction, true);

//Пузырьковое распространение
elem2.addEventListener("клик", myFunction, false);
Это особенно полезно, когда одно и то же событие обрабатывается для нескольких элементов в иерархии DOM.

<img src="https://github.com/ait-tr/cohort34.1/blob/main/front_end/lesson_14/Images/Rouen_Cathedral_1.jpg?raw=true" alt="Rouen Cathedral"/>
<img src="https://github.com/ait-tr/cohort34.1/blob/main/front_end/lesson_14/Images/Rouen_Cathedral_2.jpg?raw=true" alt="Rouen Cathedral"/>
<img src="https://github.com/ait-tr/cohort34.1/blob/main/front_end/lesson_14/Images/Rouen_Cathedral_3.jpg?raw=true" alt="Rouen Cathedral"/>
<img src="https://github.com/ait-tr/cohort34.1/blob/main/front_end/lesson_14/Images/Rouen_Cathedral_4.jpg?raw=true" alt="Rouen Cathedral"/>
<img src="https://github.com/ait-tr/cohort34.1/blob/main/front_end/lesson_14/Images/Rouen_Cathedral_5.jpg?raw=true" alt="Rouen Cathedral"/>
<img src="https://github.com/ait-tr/cohort34.1/blob/main/front_end/lesson_14/Images/Rouen_Cathedral_6.jpg?raw=true" alt="Rouen Cathedral"/>
<br/>
<a href="https://learn.javascript.ru/" target="_blank">Современный учебник JavaScript</a>

