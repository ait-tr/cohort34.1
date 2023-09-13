Русский текст смотри ниже

<ol>
<li>
Logical operations: && - "logical and", || - "logical or", ! - "logical no". Logical operations are applied to data of type boolean, and their result always has type boolean.
</li>
<li> 
<b> `switch`-`case`</b>

A fork for three options in the code can look like this:

```java
if (turn_left) {
  System.out.println(«Коня потеряешь»);
} if (turn_right) {
  System.out.println(“Знания обретёшь”);
} else {
  System.out.println(“Так и будешь стоять?”);
}
```

But if the fork is bigger (for example, there are already 10 options), then sometimes it is more convenient to use a new operator for us.
 `switch`-`case`.

```java
switch (Expression for choice) {
  case  (Vakue1):
    Commands1;
    break;
  case (Value2):
    Commands2;
    break;
  ...
  case (ValueN):
    CommandsN;
    break;
  default:
    Commands by default;
    break;
}
```

The order of execution in the operator is as follows:
1. The `Expression for choice` calculated. Then the `switch` operator compares the obtained expression with the next value (in the order of enumeration).
1. If the `Expression for choice` matches the `value`, hen the code following the colon is executed.
1. If a `break` constract is encountered then control is transferred outside the `switch` command.
1. If no matches are found between the `Expression for choice` and the `value`, then control is transferred to the code written in the `Command by default`.

## Important
- Type of `Expression for choice` for operator switch in Java must be one from the follower:
    - `byte`, `short`, `char`, `int`.
    -  `Byte`, `Short`, `Character`, `Integer`  (will be learn later).
    - `String` (started from Java 7)  (will be learn later).
    - `Enum` (will be learn later).
- The `default` block is optional, then if there are no matches between the `Expression for choice` and the `Values`, no actions will be performed.
- `break` is not mandatory, if it is not there - the **code will continue execution** (**ignoring** further comparisons of values in the `case` blocks) until the first encountered `break` or until the end of the `switch` operator.
- If you need to execute the same code for several options of choice, to avoid duplication, specify several corresponding values in consecutive `case` blocks.
</li>


<ol>
<li>
Логические операции: && - "логическое и", || - "логическое или", ! - "логическое отрицание". Логические операции применяются у данным типа boolean, и их результат всегда имеет тип boolean.
</li>
<li> 
<b> `switch`-`case`</b>

Развилка на три варианта в коде может выглядеть вот так:

```java
if (turn_left) {
  System.out.println(«Коня потеряешь»);
} if (turn_right) {
  System.out.println(“Знания обретёшь”);
} else {
  System.out.println(“Так и будешь стоять?”);
}
```

Но если развилка больше (например, вариантов уже 10), то иногда удобнее использовать новый для нас оператор `switch`-`case`.

```java
switch (ВыражениеДляВыбора) {
  case  (Значение1):
    Команды1;
    break;
  case (Значение2):
    Команды2;
    break;
  ...
  case (ЗначениеN):
    КомандыN;
    break;
  default:
    КомандыПоУмолчанию;
    break;
}
```

Порядок выполнения в операторе следующий:
1. Вычисляется `ВыражениеДляВыбора`. Далее оператор `switch` сравнивает полученное выражение с очередным Значением (в порядке перечисления).
1. Если `ВыражениеДляВыбора` совпало со `Значением`, то выполняется код, идущий после двоеточия.
1. Если встречается конструкция `break` — то управление передается за пределы команды `switch`.
1. Если совпадений `ВыражениеДляВыбора` и `Значений` не выявлено, то управление передаётся коду, записанному в `КомандахПоУмолчанию`.

## Важные моменты
- Тип `ВыраженияДляВыбора` для оператора выбора switch в Java должен быть одним из следующих:
    - `byte`, `short`, `char`, `int`.
    - Их обёртки `Byte`, `Short`, `Character`, `Integer`.
    - `String` (начиная с Java 7).
    - Перечисление (`Enum`) (узнаем позже).
- Блок `default` — необязательный, тогда в случае отсутствия совпадений `ВыраженияДляВыбора` и `Значений` не будет выполнено никаких действий.
- `break` не является обязательным, если его нет – **код продолжит выполнение** (**игнорируя** дальнейшие сравнения значений в блоках `case`) до первого встреченного `break` или до конца оператора `switch`.
- если необходимо выполнять один и тот же код для нескольких вариантов выбора, для исключения дублирования перед ним указываем несколько соответствующих значений в подряд идущих блоках `case`.

</li>

</ol>