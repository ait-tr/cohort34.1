Русский текст смотри ниже

When we insert several tags in a row into a document, we expect them to appear on the page in approximately the same order in which they were written in the code. For example, when creating text, we insert headings, paragraphs, lists, etc., so that we see them appear in the same order on the web page.

But there are two rules in CSS that can change this. We are talking about float and position. When these two rules do not apply to tags, this option is called code in the normal flow.

With float we create so-called floating elements. This rule has three possible values (according to the W3C specification), with the default value being None, i.e. Initially we do not have any floating elements.

The Left and Right values allow you to create a float. In this case, the properties of such a tag will change and it will interact differently with others.

     1. Regardless of what it was before, it becomes block (corresponding to display:block)
     2. Despite the fact that it becomes block-based, its size will be determined by the volume of content enclosed in it (some specifics appear).
     3. A floating element (with float left or right) is not involved in “Margin-colloapse”, i.e. does not share its padding with neighboring elements.
     4. They do not notice adjacent block elements (with display: block), i.e. they don't interact with them.
     5. But inline tags (with display: inline) flow around floating blocks.

The question arises: is it possible to force blocks located in the code below a floating element (with float:left or right) to interact with it (i.e., adjust their position depending on the size of the floating blocks)? It turns out that you can, and CSS has a special Clear rule for this. It has four valid values (none is the default)

When we write the CSS rule Clear for any Html tag, this means that this very element will have to take into account all the blocks floating and standing in front of it in the code:

     1. Left, if clear:left is specified
     2. To the right with right
     3. Everywhere with clear:both (means on both sides)

<br/><hr/><br/>

Когда мы вставляем в документ несколько тегов подряд, то ожидаем их появление на странице примерно в том же порядке, в котором они и были прописаны в коде. Например, при создании текста мы вставляем заголовки, абзацы, списки и т.п., чтобы увидеть их на вебстранице следующими в том же самом порядке. 

Но в CSS имеются два правила, которые могут это изменить. Речь идет о float и position. Когда к тэгам не применяются эти два правила, то такой вариант называется кодом в нормальном потоке.

С помощью float мы создаем так называемые плавающие элементы. У этого правила имеется три возможных значения (по спецификации консорциума W3C), причем по умолчанию используется значение None, т.е. изначально у нас никаких плавающих элементов нет.

Значения Left и Right как раз и позволяют создавать плавание. При этом свойства такого тега поменяются и он иначе будет взаимодействовать с другими. 

    1. В не зависимости от того, каким он был до этого, он становится блочным (соответствует display:block) 
    2. Не смотря на то, что он становится блочным, его размер будет определяться объемом заключенного в него контента (проявляется некоторая специфика). 
    3. Плавающий элемент (с float left или right) в «Margin-colloapse» не участвует, т.е. не делится с соседними элементами своими отступами. 
    4. Они не замечают соседние блочные элементы (с display: block), т.е. они с ними не взаимодействуют. 
    5. А вот строчные тэги (с display: inline) обтекают плавающие блоки.

Возникает вопрос: а можно ли блоки, стоящие в коде ниже плавающего элемента (с float:left или right), заставить с ним взаимодействовать (т.е. выстраивать свое положение в зависимости от размеров плавающих блоков)? Оказывается можно, и для этого в CSS предусмотрено специальное правило Clear. Оно имеет четыре допустимых значения (none используется по умолчанию)

Когда мы для какого-либо Html тега прописываем CSS правило Clear, то это означает, что этот самый элемент должен будет учесть все плавающие и стоящие перед ним в коде блоки:

    1. Слева, если прописан clear:left 
    2. Справа при right 
    3. Везде при clear:both (означает с обеих сторон) 
    
[Information about Star Wars](https://github.com/ait-tr/cohort34.1/blob/main/front_end/lesson_05/starsWars.txt)

<img src="https://github.com/ait-tr/cohort34.1/blob/main/front_end/lesson_05/Images/star-wars-icon-png-8.jpg?raw=true" alt="Star Wars favicon"/>

<img src="https://github.com/ait-tr/cohort34.1/blob/main/front_end/lesson_05/Images/sky.jpg?raw=true" alt="Star Wars background image"/>

<img src="https://github.com/ait-tr/cohort34.1/blob/main/front_end/lesson_05/Images/friend1.jpg?raw=true" alt="Friend"/>

<img src="https://github.com/ait-tr/cohort34.1/blob/main/front_end/lesson_05/Images/friend2.jpg?raw=true" alt="Friend"/>

<img src="https://github.com/ait-tr/cohort34.1/blob/main/front_end/lesson_05/Images/friend3.jpg?raw=true" alt="Friend"/>

<img src="https://github.com/ait-tr/cohort34.1/blob/main/front_end/lesson_05/Images/friend4.jpg?raw=true" alt="Friend"/>

<img src="https://github.com/ait-tr/cohort34.1/blob/main/front_end/lesson_05/Images/friend5.jpg?raw=true" alt="Friend"/>

<img src="https://github.com/ait-tr/cohort34.1/blob/main/front_end/lesson_05/Images/friend6.jpg?raw=true" alt="Friend"/>

<img src="https://github.com/ait-tr/cohort34.1/blob/main/front_end/lesson_05/Images/friend7.jpg?raw=true" alt="Friend"/>

<img src="https://github.com/ait-tr/cohort34.1/blob/main/front_end/lesson_05/Images/friend8.jpg?raw=true" alt="Friend"/>

<img src="https://github.com/ait-tr/cohort34.1/blob/main/front_end/lesson_05/Images/friend9.jpg?raw=true" alt="Friend"/>

<img src="https://github.com/ait-tr/cohort34.1/blob/main/front_end/lesson_05/Images/main.jpg?raw=true" alt="Hero"/>