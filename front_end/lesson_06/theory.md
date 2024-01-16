Русский текст смотри ниже

## Flexbox Layout

### What it is?
The Flexbox Layout (Flexible Box) module aims to provide a more efficient way to layout, align, and distribute space between elements in a container, even if their size is unknown and/or changing (hence the word "flexible").

The basic idea of a responsive layout is to give a container the ability to change the width/height (and order) of its elements to best fill the available space (basically to accommodate all types of display devices and screen sizes). A flexible container expands elements to fill available free space or compresses them to prevent overflow.

Most importantly, the flexbox layout is direction-independent, unlike regular layouts (box, which is vertical, and inline, which is horizontal). While they work well for pages, they lack the flexibility (no pun intended) to support large or complex applications (especially when it comes to changing orientation, resizing, stretching, shrinking, etc.).

### Terminology

Because flexbox is an entire module and not a single property, it includes many things, including the entire set of properties. Some are designed to be installed in a container (the parent element, known as a "flex container"), while others are designed to be installed in child elements (known as "flex elements").

While a "regular" layout is based on both block and inline flow directions, a flexible layout is based on "flex flow directions". Please take a look at this drawing from the specification which explains the basic idea of responsive layout.

Elements will be located either along the main axis (from start to end) or along the transverse axis (from start to end).

<img src="https://css-tricks.com/wp-content/uploads/2018/11/00-basic-terminology.svg" alt="isolated" width="700"/>

- main-axis - the main axis of a flexible container is the main axis along which flexible elements are located. Attention, it is not necessarily horizontal; this depends on the flex-direction property (see below).
- main-start | main-end - flex elements are placed inside the container, starting with main-start and ending with main-end.
- cross axis – the axis perpendicular to the main axis is called the transverse axis. Its direction depends on the direction of the main axis.
- cross-start | cross-end - flex lines are filled with elements and placed into the container, starting from the cross-start side of the flex container and moving towards the cross-end.


### Container (parent) properties:

#### *`display`*
This property defines a flex container; it is necessary so that its child elements can be positioned flexibly.
```
.container {
   display: flex;
}
```
#### *`flex-direction`*
<img src="https://css-tricks.com/wp-content/uploads/2018/10/flex-direction.svg" alt="isolated" width="400"/>

This property determines the direction of the main axis: horizontal
```
.container {
   flex-direction: row | row-reverse | column | column-reverse;
}
```
- row (default): row
- row-reverse: row in reverse
- column: column
- column-reverse: column from bottom to top

#### *`flex-wrap`*
<img src="https://css-tricks.com/wp-content/uploads/2018/10/flex-wrap.svg" alt="isolated" width="400"/>

By default, all flex items will try to fit on a line, this can be changed by changing the flex-wrap property to wrap
```
.container {
   flex-wrap: nowrap | wrap | wrap-reverse;
}
```
- nowrap (default): all elements will be on one line
- wrap: elements will be wrapped from one line to the next from top to bottom
- wrap-reverse: elements will be transferred from one line to the next from bottom to top

#### *`flex-flow`*
Shorthand - which combines flex-direction and flex-wrap
The default value is row nowrap.

```
.container {
   flex-flow: column wrap;
}
```

#### *`justify-content`*
<img src="https://css-tricks.com/wp-content/uploads/2018/10/justify-content.svg" alt="isolated" width="300"/>


Determines how elements are positioned relative to the main axis.
```
.container {
   justify-content: flex-start | flex-end | center | space-between | space-around | space-evenly | start | end | left | right;
}
```
- flex-start (default): elements are shifted to the beginning of the flex-direction.
- flex-end: elements are shifted to the end of the flex-direction.
- start: elements are shifted to the beginning of the writing-mode direction.
- end: elements are shifted towards the end of the writing-mode direction.
- center: elements are shifted to the center
- space-between: elements are evenly spaced
- space-around: elements are spaced evenly, added space around the edges
- space-evenly: elements are spaced evenly, the distance between elements and from elements to the edges is equal

#### *`align-content`*
<img src="https://css-tricks.com/wp-content/uploads/2018/10/align-content.svg" alt="isolated" width="400"/>

This property aligns the position of lines within a flex container.
```
.container {
   align-content: flex-start | flex-end | center | space-between | space-around | space-evenly | stretch | start | end | baseline | first baseline | last baseline + ... safe | unsafe;
}
```
- normal (default): elements are in the default position, as if the property had not been set
- flex-start / start: rows of objects are located closer to the beginning of the container (flex-start and start work the same, but flex-start is better supported)
- flex-end / end: rows of objects are located closer to the end of the container
- center: objects are located closer to the center of the container
- space-between: elements are evenly distributed, the first line is at the beginning of the container, the last one is at the end
- space-around: elements are evenly distributed with equal space around each line
- space-evenly: elements are evenly distributed with equal space around each line
- stretch: lines are stretched to fill free space

#### *`gap`*

<img src="https://css-tricks.com/wp-content/uploads/2021/09/gap-1.svg" alt="isolated" width="400"/>

```
.container {
   display: flex;
   ...
   gap: 10px;
   gap: 10px 20px; /* row-gap column gap */
   row-gap: 10px;
   column-gap: 20px;
}
```
The gap property controls the distance between flex elements. Space is added only between the elements themselves, not at the outer edges. It should be perceived as a minimum distance.


- Games to reinforce the material:
   1. https://flexboxfroggy.com/#ru
   2. http://www.flexboxdefense.com/

<br/><hr/><br/>

## Flexbox Layout

### Что это такое?
Модуль Flexbox Layout (Flexible Box) направлен на обеспечение более эффективного способа компоновки, выравнивания и распределения пространства между элементами в контейнере, даже если их размер неизвестен и/или меняется ( отсюда и слово «гибкий»).

Основная идея гибкого макета состоит в том, чтобы дать контейнеру возможность изменять ширину/высоту (и порядок) своих элементов, чтобы наилучшим образом заполнить доступное пространство (в основном, чтобы приспособиться ко всем типам устройств отображения и размерам экрана). Гибкий контейнер расширяет элементы, чтобы заполнить доступное свободное пространство, или сжимает их, чтобы предотвратить переполнение.

Самое главное, макет flexbox не зависит от направления, в отличие от обычных макетов (блок, который расположен по вертикали, и встроенный, который расположен по горизонтали). Хотя они хорошо работают для страниц, им не хватает гибкости (без каламбура) для поддержки больших или сложных приложений (особенно когда речь идет об изменении ориентации, изменении размера, растяжении, сжатии и т. д.).

### Терминология

Поскольку flexbox — это целый модуль, а не отдельное свойство, он включает в себя множество вещей, включая весь набор свойств. Некоторые из них предназначены для установки в контейнере (родительский элемент, известный как «гибкий контейнер»), тогда как другие предназначены для установки в дочерних элементах (так называемые «гибкие элементы»).

Если «обычная» компоновка основана как на блочном, так и на встроенном направлениях потока, то гибкая компоновка основана на «направлениях гибкого потока». Пожалуйста, взгляните на этот рисунок из спецификации, объясняющий основную идею гибкого макета.

Элементы будут располагаться либо по главной оси (от начала до конца), либо по поперечной оси (от начала до конца).

<img src="https://css-tricks.com/wp-content/uploads/2018/11/00-basic-terminology.svg" alt="isolated" width="700"/>

- main-axis — главная ось гибкого контейнера — это основная ось, вдоль которой располагаются гибкие элементы. Внимание, она не обязательно горизонтально расположена; это зависит от свойства flex-direction (см. ниже).
- main-start | main-end — flex-элементы размещаются внутри контейнера, начиная с main-start и заканчивая main-end.
- cross axis – ось, перпендикулярная главной оси, называется поперечной осью. Его направление зависит от направления главной оси.
- cross-start | cross-end — гибкие линии заполняются элементами и помещаются в контейнер, начиная с cross-start стороны флекс-контейнера и двигаясь к cross-end.


### Свойства контейнера(родителя):

#### *`display`*
Это свойство определяет флекс-контейнер, это необходимо, чтобы его дочерние элементы могли гибко располагаться.
```
.container {
  display: flex;
}
```
#### *`flex-direction`*
<img src="https://css-tricks.com/wp-content/uploads/2018/10/flex-direction.svg" alt="isolated" width="400"/>

Это свойство определяет направление главной оси: горизонтально
```
.container {
  flex-direction: row | row-reverse | column | column-reverse;
}
```
- row (default): строка 
- row-reverse: строка в обратном
- column: столбец
- column-reverse: столбец снизу вверх

#### *`flex-wrap`*
<img src="https://css-tricks.com/wp-content/uploads/2018/10/flex-wrap.svg" alt="isolated" width="400"/>

По умолчанию все флекс элементы будут пытаться уместиться на строке, это можно изменить, если поменять значение свойства flex-wrap на wrap
```
.container {
  flex-wrap: nowrap | wrap | wrap-reverse;
}
```
- nowrap (default): все элементы будут на одной строке
- wrap: элементы будут перноситься с однйо строки на следующую сверху-вниз
- wrap-reverse: элементы будут перноситься с однйо строки на следующую снизу-вверх

#### *`flex-flow`*
Сокращенная запись - которая объединяет flex-direction и flex-wrap
Значением по умолчанию является row nowrap.

```
.container {
  flex-flow: column wrap;
}
```

#### *`justify-content`*
<img src="https://css-tricks.com/wp-content/uploads/2018/10/justify-content.svg" alt="isolated" width="300"/>


Определяет то, как располагаются элементы относительно главной оси.
```
.container {
  justify-content: flex-start | flex-end | center | space-between | space-around | space-evenly | start | end | left | right;
}
```
- flex-start (default): элементы сдвинты к началу flex-direction.
- flex-end:  элементы сдвинты к концу flex-direction.
- start: элементы сдвинты к началу writing-mode direction.
- end:  элементы сдвинты к концу writing-mode direction.
- center: элементы сдвинуты в центр
- space-between: элементы равномерно расположены 
- space-around: элементы расположены равномерно, добавлено место по краям
- space-evenly: элементы расположены равномерно, расстояние между элементами и от элементов до краев равно

#### *`align-content`*
<img src="https://css-tricks.com/wp-content/uploads/2018/10/align-content.svg" alt="isolated" width="400"/>

Это свойство выравнивает положение строк внутри гибкого контейнера.
```
.container {
  align-content: flex-start | flex-end | center | space-between | space-around | space-evenly | stretch | start | end | baseline | first baseline | last baseline + ... safe | unsafe;
}
```
- normal (default): элементы находятся в положении по умолчанию, как если бы не было задано свойство
- flex-start / start: строки объектов расположены ближе к началу контейнера (flex-start и start работают одинакого, но flex-start лучше поддерживается)
- flex-end / end: строки объектов расположены ближе к концу контейнера 
- center: объекты расположены ближе к центру контейнера
- space-between: элементы равномерно распределены, первая строка в начале контейнера, последняя - в конце
- space-around: элементы равномерно распределен с равным пространством вокруг каждой строки
- space-evenly: элементы равномерно распределен с равным пространством вокруг каждой строки
- stretch: строки растянуты чтобы заполнить свободно пространство 

#### *`gap`*

<img src="https://css-tricks.com/wp-content/uploads/2021/09/gap-1.svg" alt="isolated" width="400"/>

```
.container {
  display: flex;
  ...
  gap: 10px;
  gap: 10px 20px; /* row-gap column gap */
  row-gap: 10px;
  column-gap: 20px;
}
```
Свойство gap управляет расстоянием между флекс-элементами. Место добавляется только между самими элементами, у внешних краев - не добавляется. Стоит воспринимать - как минимальное расстояние. 


- Игры на закрепление материала:
  1. https://flexboxfroggy.com/#ru
  2. http://www.flexboxdefense.com/