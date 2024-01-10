Русский текст смотри ниже

### Positioning in CSS:

There are several types of element positioning in CSS that allow you to control their placement on a web page. Let's look at the main types of positioning and their meanings.

1. **Static:**
    - The element is in the normal document flow.
    - The `top`, `right`, `bottom`, `left` and `z-index` properties are not applied.
    - This is the default value.

```css
.element {
   position: static;
}
```

2. **Relative:**
    - The element is displaced relative to its normal position in the flow.
    - Properties `top`, `right`, `bottom`, `left` set the offset relative to its normal position.

```css
.element {
   position: relative;
   top: 10px;
   left: 20px;
}
```

3. **Absolute:**
    - The element breaks away from the normal flow of the document.
    - Positioned relative to the nearest positioned ancestor (if any), otherwise relative to the original container.
    - Properties `top`, `right`, `bottom`, `left` set the offset from the edges of its containing block.

```css
.element {
   position: absolute;
   top: 30px;
   left: 40px;
}
```

4. **Fixed:**
    - The element breaks away from the normal flow of the document.
    - Positioned relative to the original container, which is the visible area of the browser (viewport).
    - Stays in place when scrolling the page.

```css
.element {
   position: fixed;
   top: 10px;
   right: 10px;
}
```

5. **Sticky:**
    - The element behaves as relatively positioned until it reaches the specified threshold on scroll, then becomes fixed.
    - Relative to the nearest scrolling ancestor.
    - Creates a new overlay context.

```css
.element {
   position: sticky;
   top: 20px;
}
```

Information about CSS Positioning: <a href="https://www.w3schools.com/css/css_positioning.asp" target="_blank">CSS. Positioning</a>

<br/><hr/><br/>

### Позиционирование в CSS:

В CSS существует несколько типов позиционирования элементов, которые позволяют управлять их размещением на веб-странице. Рассмотрим основные типы позиционирования и их значения.

1. **Static (Статическое позиционирование):**
   - Элемент находится в обычном потоке документа.
   - Свойства `top`, `right`, `bottom`, `left` и `z-index` не применяются.
   - Это значение по умолчанию.

```css
.element {
  position: static;
}
```

2. **Relative (Относительное позиционирование):**
   - Элемент смещается относительно своего нормального положения в потоке.
   - Свойства `top`, `right`, `bottom`, `left` задают смещение относительно его нормального положения.

```css
.element {
  position: relative;
  top: 10px;
  left: 20px;
}
```

3. **Absolute (Абсолютное позиционирование):**
   - Элемент вырывается из обычного потока документа.
   - Позиционируется относительно ближайшего позиционированного предка (если есть), иначе относительно исходного контейнера.
   - Свойства `top`, `right`, `bottom`, `left` задают смещение от краёв его содержащего блока.

```css
.element {
  position: absolute;
  top: 30px;
  left: 40px;
}
```

4. **Fixed (Фиксированное позиционирование):**
   - Элемент вырывается из обычного потока документа.
   - Позиционируется относительно исходного контейнера, который является видимой областью браузера (viewport).
   - Остаётся на месте при прокрутке страницы.

```css
.element {
  position: fixed;
  top: 10px;
  right: 10px;
}
```

5. **Sticky (Липкое позиционирование):**
   - Элемент ведет себя как относительно позиционированный до тех пор, пока не достигнет указанного порога при прокрутке, затем становится фиксированным.
   - Относительно ближайшего прокручивающего предка.
   - Создаёт новый контекст наложения.

```css
.element {
  position: sticky;
  top: 20px;
}
```


Иноформация о позиционировании в CSS: <a href="https://www.w3schools.com/css/css_positioning.asp" target="_blank">CSS. Positioning</a>

