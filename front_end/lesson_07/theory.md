Русский текст смотри ниже

## Links

[ HTML Specification ]( https://developer.mozilla.org/en-US/docs/Web/HTML/ )

## What is form?

If you need to obtain information from the user, then you cannot do without
forms.

HTML-form is a part of a document that contains various fields,
such as text fields, password fields, checkboxes, radio buttons,
submit button, menu, etc.

HTML forms can be used where we want to collect some data
from a site visitor. For example, if you register a user, you
would like to collect information such as name, email address,
phone number, etc.

The form will accept input and then submit that data to
server where they will be processed and stored in a database.

Various form elements are available such as text fields, fields
text area, drop-down menus, radio buttons, checkboxes, etc.

## Simplified HTTP

* HTML - Hyper Text Markup Language
* HTTP - Hyper Text Transfer Protocol

* HTTP is a protocol that describes the interaction between client and server. Needed for HTML transmission as well.

* DNS table is a table on the Internet, accessible to all providers. It lists domain names and their corresponding servers.
* Server - a dedicated computer that has a public IP address and can be contacted by
* Client - any application (mobile application, browser, desktop application) can send requests to the server.
* HTTP is a protocol that allows a client to send a request to a server and receive a response from the server.

### HTTP request structure

* URL - the address we want to contact.
* Request method is a verb that allows the server to understand the "semantics" of the request. Those. its purpose.
 * ` GET ` - receiving information from the server
 * ` POST ` - sending data to the server (for example, when registering - this type of request is used)

### HTTP response structure

* Response status
 * ` 404 ` - not found, does not exist, Not found
 * ` 200 ` - everything is fine
 * ` 500 ` - an error occurred on the server
 * ` 401 ` - Not authorized
 * ` 403 ` - Prohibited
 * ` 405 ` - Method not supported by the server (Method not allowed)
* Response body
 * HTML page
 * Video file
 * Picture
 * etc.

![ image ]( https://raw.githubusercontent.com/ait-tr/cohort25/main/front_end/lesson_04/img/1.png )

### Example request-response

` GET https://www.google.com/search?q=java ` - search query in GOOGLE

* URL - ` https://www.google.com/search `
* Method - ` GET`
* Query parameter - ` q ` , parameter value ` java `
* Request body (POST only)

Answer:
* Status - ` 200 `
* Response body - HTML page with search results

# Forms

* ` <form> ` tag - allows you to send requests to the server from your HTML page

```
<form action="https://google.com/search">
<label for="search-input">You can find everything!</label>
<input type="text" id="search-input" name="q" placeholder="Enter query..."/>
<input type="submit" value="Search"/>
</form>
```

* ` action ` - URL of the page to which we send the request. If you do not specify ` action ` the request goes to the same URL under which the page is opened
* ` method ` - request method (get, post), default - ` get `
* ` <label> ` - the label for your input (the text that will be displayed next to it)
 * ` for ` - which input the label should be attached to
* ` <input> ` - an element for entering some data.
 * ` type ` - input type, default - plain text (text)
 * ` id ` - input identifier
 * ` name ` - the name of the input, used as the name of the request parameter
 * ` placeholder ` - text that will be displayed in the input by default
* ` <input type="submit"> ` - input type, which represents a button for submitting a request
 * ` value ` - text that is displayed on the button
* ` <input type="password"> ` - input type that hides user input values
* ` <input type="email"> ` - input type that checks whether you entered a valid email (doesn't check very well)
* ` <input type="radio"> ` - an input type that allows you to select one option from several. The group of such options is determined by the ` name` parameter . For inputs of the same group, they must have the same name.
* ` <input type="checkbox" ` - an input type that allows you to select several options from several.
* ` <select> ` - is a list for selecting one option
* ` <span> ` - allows you to assign any attributes to an HTML fragment, for example, assign a css class to a part of the text
* ` <input type="color" ` - input type for color selection
* ` <input type="range" ` - input type for selecting a range
* ` <input type="date" ` - input type for selecting a date

## Difference between GET and POST

* When using GET requests, all parameters are placed in the URL request
* This is convenient when working, for example, with search. Because then you can simply see in your browser history what search requests you made and go through them again.
* This is very inconvenient if you want to “hide” some data and not show it in history, URL, etc.
* The solution is to use the POST method for such requests, which sends all data in the BODY of the request.


<br/><hr/><br/>

﻿## Ссылки


[Спецификация HTML](https://developer.mozilla.org/en-US/docs/Web/HTML/)


## Что такое form?


Если требуется получить информацию от пользователя, то не обойтись без
формы.


HTML-form --- это часть документа, который содержит различные поля,
такие как текстовые поля, поля ввода пароля, флажки, переключатели,
кнопку отправки, меню и т. д.


HTML-формы можно использовать там, где мы хотим собрать некоторые данные
от посетителя сайта. Например, в случае регистрации пользователя вы
хотели бы собрать такую ​​информацию, как имя, адрес электронной почты,
номер телефона и т. д.


Форма будет принимать входные данные, а затем отправлять эти данные на
сервер, где они будут обработаны и сохранены в базе данных.


Доступны различные элементы формы, такие как текстовые поля, поля
текстовой области, раскрывающиеся меню, переключатели, флажки и т. д.


## Упрощенно HTTP


* HTML - Hyper Text Markup Language
* HTTP - Hyper Text Transfer Protocol


* HTTP - протокол, который описывает взаимодействие между клиентом и сервером. Нужен для передачи HTML в том числе.


* DNS-таблица - таблица в сети интернет, доступная всем провайдерам. В ней перечислены доменные имена и соответствующие им сервера.
* Сервер - выделенный компьютер, у которого есть публичный IP-адрес и по нему можно обратиться
* Клиент - какое-либо приложение (мобильное приложение, браузер, desktop-приложение), может отправлять запросы серверу.
* HTTP - протокол, который позволяет клиенту отправлять запрос серверу и получать ответ от сервера.


### Структура HTTP-запроса


* URL - адрес, по которому мы хотим обратиться.
* Метод запроса - глагол, который позволяет серверу понять "семантику" запроса. Т.е. его назначение.
 * `GET` - получение информации от сервера
 * `POST` - отправка данных на сервер (например при регистрации - используется этот тип запроса)


### Структура HTTP-ответа


* Статус ответа
 * `404` - не найдено, не существует, Not found
 * `200` - все хорошо
 * `500` - произошла ошибка на сервере
 * `401` - Не авторизован
 * `403` - Запрещено
 * `405` - Метод не поддерживается сервером (Method not allowed)
* Тело ответа
 * HTML-страница
 * Видео-файл
 * Картинка
 * т.д.


![image](https://raw.githubusercontent.com/ait-tr/cohort25/main/front_end/lesson_04/img/1.png)


### Пример запроса-ответа


`GET https://www.google.com/search?q=java` - поисковый запрос в GOOGLE


* URL - `https://www.google.com/search`
* Method - `GET`
* Параметр запроса - `q`, значение параметра `java`
* Тело запроса (только у POST)


Ответ:
* Статус - `200`
* Тело ответа - HTML-страница с результатами поиска


# Forms


* Тег `<form>` - позволяет отправлять запросы на сервер из вашей HTML-страницы


```
<form action="https://google.com/search">
   <label for="search-input">Можно найти все!</label>
   <input type="text" id="search-input" name="q" placeholder="Enter query..."/>
   <input type="submit" value="Search"/>
</form>
```


* `action` - URL-страницы, на которую отправляем запрос. Если не указывать `action` запрос уходит на тот же URL, под которым открыта страница
* `method` - метод запроса (get, post), по умолчанию - `get`
* `<label>` - метка для вашего input (текст, который будет отображаться рядом)
 * `for` - к какому input следует привязать метку
* `<input>` - элемент для ввода каких-либо данных.
 * `type` - тип input, по умолчанию - обычный текст (text)
 * `id` - идентификатор input
 * `name` - название input, используется в качестве названия параметра запроса
 * `placeholder` - текст, который будет отображаться в input по умолчанию
* `<input type="submit">` - тип input, который представляет собой кнопку для отправки запроса
 * `value` - текст, который отображается на кнопке
* `<input type="password">` - тип input, который скрывает значения, вводимые пользователем
* `<input type="email">` - тип input, который проверяет, ввели ли вы корректный email (не очень хорошо проверяет)
* `<input type="radio">` - тип input, который позволяет выбрать один вариант из нескольких. Группа таких вариантов определяется параметром `name`. У инпутов одной группы они должны иметь одно название.
* `<input type="checkbox"` - тип input, который позволяет выбрать несколько вариантов из нескольких.
* `<select>` - представляет собой список для выбора одного варианта
* `<span>` - позволяет назначить какие-либо атрибуты фрагменту HTML, например назначить css-класс части текста
* `<input type="color"` - тип input для выбора цвета
* `<input type="range"` - тип input для выбора диапазона
* `<input type="date"` - тип input для выбора даты


## Разница между GET и POST


* При использовании GET-запросов все параметры размещаются в URL-запросе
* Это удобно при работе, например, с поиском. Потому что потом можно в истории браузера просто посмотреть, какие вы запросы на поиск делали и по ним перейти еще раз.
* Это очень не удобно, если вы хотите какие-то данные "скрыть", а не светить их в истории, URL и т.д.
* Решение - использовать для таких запросов метод POST, который все данные отправляет в ТЕЛЕ запроса.