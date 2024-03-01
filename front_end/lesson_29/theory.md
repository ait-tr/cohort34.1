Русский текст смотри ниже

# useEffect

```
useEffect(didUpdate);
```
Takes a function that contains imperative code, possibly with effects.

An effect hook gives you the ability to perform side effects in a functional component.

Side effects in React components can be: loading data, subscribing, and manually changing the DOM. Whether you call these operations "side effects" (or just "effects") or not, chances are you've used them in your components before.

There are two common types of side effects in React components: components that require and those that do not require reset.

## Effects without reset

Sometimes we want to execute additional code after React has updated the DOM. Network requests, manual DOM changes, logging are all examples of effects that do not require a reset. Once we have launched them, we can immediately forget about them, because no further additional actions are required.

What does useEffect do? Using this hook, you tell React to do something after rendering. React will remember the function (i.e. the “effect”) you passed in and call it after it has made all the changes to the DOM.

Does useEffect run after every render? Of course! By default it will run after every render and update, React ensures that it only fires the effect after the DOM has already been updated.

## Effects with reset

Previously we looked at side effects that do not require a reset. However, there are cases when a reset is still necessary. For example, we may need to set up a subscription to some external data source. In this case, it is very important to perform a reset to avoid memory leaks!

If your effect returns a function, React will only execute it when it's time to reset the effect.

Why did we return a function from our effect? This is an optional effect reset mechanism. Each effect can return a function that will reset it. This gives us the opportunity to combine the subscription and cancellation logic together. They are, after all, part of the same effect!

When exactly will React reset the effect? React will reset the effect before the component is unmounted. However, as we already know, effects are executed not once, but with each render. This is why React also resets the effect from the previous render before running the next one.

# CSS Modules Stylesheet

Vite supports CSS Modules alongside regular stylesheets using the [name].module.css file naming convention. CSS Modules allows the scoping of CSS by automatically creating a unique classname of the format [filename]\_[classname]\_\_[hash].

CSS Modules let you use the same CSS class name in different files without worrying about naming clashes. 

<br/><hr/><br/>

# useEffect

```
useEffect(didUpdate);
```
Принимает функцию, которая содержит императивный код, возможно, с эффектами.

Хук эффекта даёт вам возможность выполнять побочные эффекты в функциональном компоненте.

Побочными эффектами в React-компонентах могут быть: загрузка данных, оформление подписки и изменение DOM вручную. Неважно, называете ли вы эти операции «побочными эффектами» (или просто «эффектами») или нет, скорее всего вам доводилось ранее использовать их в своих компонентах.

Существует два распространённых вида побочных эффектов в компонентах React: компоненты, которые требуют и не требуют сброса.

## Эффекты без сброса

Иногда мы хотим выполнить дополнительный код после того, как React обновил DOM. Сетевые запросы, изменения DOM вручную, логирование — всё это примеры эффектов, которые не требуют сброса. После того, как мы запустили их, можно сразу забыть о них, ведь больше никаких дополнительных действий не требуется. 

Что же делает useEffect? Используя этот хук, вы говорите React сделать что-то после рендера. React запомнит функцию (то есть «эффект»), которую вы передали и вызовет её после того, как внесёт все изменения в DOM. 

Выполняется ли useEffect после каждого рендера? Разумеется! По умолчанию он будет выполняться после каждого рендера и обновления, React гарантирует, что он запустит эффект только после того, как DOM уже обновился.

## Эффекты со сбросом

Ранее мы рассмотрели побочные эффекты, которые не требуют сброса. Однако, есть случаи, когда сброс всё же необходим. Например, нам может потребоваться установить подписку на какой-нибудь внешний источник данных. В этом случае очень важно выполнять сброс, чтобы не случилось утечек памяти! 

Если ваш эффект возвращает функцию, React выполнит её только тогда, когда наступит время сбросить эффект.

Зачем мы вернули функцию из нашего эффекта? Это необязательный механизм сброса эффектов. Каждый эффект может возвратить функцию, которая сбросит его. Это даёт нам возможность объединить вместе логику оформления и отмены подписки. Они, всё-таки, часть одного и того же эффекта!

Когда именно React будет сбрасывать эффект? React будет сбрасывать эффект перед тем, как компонент размонтируется. Однако, как мы уже знаем, эффекты выполняются не один раз, а при каждом рендере. Вот почему React также сбрасывает эффект из предыдущего рендера, перед тем, как запустить следующий.

# Таблица стилей CSS-модулей

Vite поддерживает модули CSS наряду с обычными таблицами стилей, используя соглашение об именовании файлов [name].module.css. Модули CSS позволяют определять область действия CSS, автоматически создавая уникальное имя класса в формате [имя файла]\_[имя класса]\_\_[хеш].

Модули CSS позволяют использовать одно и то же имя класса CSS в разных файлах, не беспокоясь о конфликтах имен.

<a href="https://sw-info-api.herokuapp.com/swagger-ui.html" target="_blank">Star Wars Info</a>

<a href="https://react.dev/" target="_blank">Официальная страница React</a>