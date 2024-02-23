Русский текст смотри ниже

# Javascript

## Modules

### What is a module?

A module is just a file. One script is one module.

Modules can load each other and use export and import directives to exchange functionality, call functions of one module from another:

- export marks variables and functions that should be available outside the current module.
- import allows you to import functionality from other modules.

### Main module features

- Modules always use use strict mode. For example, an assignment to an undeclared variable will cause an error.
- Each module has its own scope. In other words, variables and functions declared in a module are not visible in other scripts.
- If the same module is used in several places, then its code will be executed only once, after which the exported functionality is transferred to all importers.
- In the module at the top level, this is not defined (undefined).
- Modules are always executed in deferred mode, just like scripts with the defer attribute

### Export and import

We can mark any declaration as exportable by placing export before it, be it a variable, function or class.

You can also write export separately.

We usually put a list of what we want to import in curly braces

```
import {...}.
```

But if you need to import a lot of things, we can import everything at once as an object using

```
import * as obj.
```

### Default export

Modules provide a special export default syntax.

We put export default before what needs to be exported.

There can be no more than one export default in a file.

<table border="1px solid black">
<tr>
<th>Named export</th>
<th>Default export</th>
</tr>
<tr>
<td> export class User {...} </td><td> export default class User {...} </td>
</tr>
<tr>
<td> import {User} from ... </td><td> import User from ... </td>
</tr>
</table>


#React

## Unidirectional data flow

In a component hierarchy, neither the parent nor the child components know whether the state of another component is set. It also doesn't matter how a particular component was created - using a function or using a class.

State is often called "local", "internal", or encapsulated. It is only available for the component itself and is hidden from others.

A component can pass its state down the tree in the form of props to child components.

This is generally called "top-down" or "unidirectional" data flow. A state always belongs to a specific component, and any derivatives of that state can only affect components “lower” in the component tree.

If you imagine the hierarchy of components as a waterfall of props, then the state of each component is like an additional source that merges with the waterfall at an arbitrary point, but also flows down.

## Managed Components

In HTML, form elements such as

```
 <input>, <textarea> and <select>
 ```
typically manage their own state and update it when the user enters data. In React, mutable state is usually contained in a state.

We can combine both approaches and make the state of a React component the “single source of truth.” Then the React component will render the form and control its behavior in response to user input. The value of the input form element in this case will be controlled by React, and the element itself will be called a “managed bean”.

In a managed component, the value of an input field is always determined by the React state. Although this means you have to write a little more code, you can now pass the value to other UI elements or reset it from other event handlers.

<br/><hr/><br/>

# Javascript

## Модули

### Что такое модуль?

Модуль – это просто файл. Один скрипт – это один модуль.

Модули могут загружать друг друга и использовать директивы export и import, чтобы обмениваться функциональностью, вызывать функции одного модуля из другого:

- export отмечает переменные и функции, которые должны быть доступны вне текущего модуля.
- import позволяет импортировать функциональность из других модулей.

### Основные возможности модулей

- В модулях всегда используется режим use strict. Например, присваивание к необъявленной переменной вызовет ошибку.
- Каждый модуль имеет свою собственную область видимости. Другими словами, переменные и функции, объявленные в модуле, не видны в других скриптах.
- Если один и тот же модуль используется в нескольких местах, то его код выполнится только один раз, после чего экспортируемая функциональность передаётся всем импортёрам.
- В модуле на верхнем уровне this не определён (undefined).
- Модули всегда выполняются в отложенном (deferred) режиме, точно так же, как скрипты с атрибутом defer

### Экспорт и импорт

Мы можем пометить любое объявление как экспортируемое, разместив export перед ним, будь то переменная, функция или класс.

Также можно написать export отдельно.

Обычно мы располагаем список того, что хотим импортировать, в фигурных скобках 

```
import {...}.
```

Но если импортировать нужно много чего, мы можем импортировать всё сразу в виде объекта, используя 

```
import * as obj. 
```

### Экспорт по умолчанию

Модули предоставляют специальный синтаксис export default («экспорт по умолчанию»).

Ставим export default перед тем, что нужно экспортировать.

В файле может быть не более одного export default.

<table border="1px solid black">
<tr>
<th>Именованный экспорт</th>
<th>Экспорт по умолчанию</th>
</tr>
<tr>
<td> export class User {...} </td><td> export default class User {...} </td>
</tr>
<tr>
<td> import {User} from ... </td><td> import User from ... </td>
</tr>
</table>


# React

## Однонаправленный поток данных

В иерархии компонентов ни родительский, ни дочерние компоненты не знают, задано ли состояние другого компонента. Также не важно, как был создан определённый компонент — с помощью функции или с помощью класса.

Состояние часто называют «локальным», «внутренним» или инкапсулированным. Оно доступно только для самого компонента и скрыто от других.

Компонент может передать своё состояние вниз по дереву в виде пропсов дочерних компонентов.

Это, в общем, называется «нисходящим» («top-down») или «однонаправленным» («unidirectional») потоком данных. Состояние всегда принадлежит определённому компоненту, а любые производные этого состояния могут влиять только на компоненты, находящиеся «ниже» в дереве компонентов.

Если представить иерархию компонентов как водопад пропсов, то состояние каждого компонента похоже на дополнительный источник, который сливается с водопадом в произвольной точке, но также течёт вниз.

## Управляемые компоненты

В HTML элементы формы, такие как

```
 <input>, <textarea> и <select>
 ```
 
обычно сами управляют своим состоянием и обновляют его когда пользователь вводит данные. В React мутабельное состояние обычно содержится в состоянии.

Мы можем скомбинировать оба подхода и сделать состояние React-компонента «единственным источником правды». Тогда React-компонент будет рендерить форму и контролировать её поведение в ответ на пользовательский ввод. Значение элемента формы input в этом случае будет контролировать React, а сам элемент будет называться «управляемый компонент».

В управляемом компоненте значение поля ввода всегда определяется состоянием React. Хотя это означает, что вы должны написать немного больше кода, теперь вы сможете передать значение и другим UI-элементам или сбросить его с других обработчиков событий.

<a href="https://react.dev/" target="_blank">Официальная страница React</a>