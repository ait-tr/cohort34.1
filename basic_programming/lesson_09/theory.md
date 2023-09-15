Русский текст смотри ниже

The ``while`` statement continually executes a block of statements while a particular condition is ``true``. Its syntax can be expressed as:

```
while (expression) {
     statement(s)
}
```

The ``while`` statement evaluates expression, which must return a ``boolean`` value. If the expression evaluates to ``true``, the ``while`` statement executes the statement(s) in the ``while`` block. The ``while`` statement continues testing the expression and executing its block until the expression evaluates to ``false``. Using the ``while`` statement to print the values from 1 through 10 can be accomplished as in the following WhileDemo program:

```
class WhileDemo {
    public static void main(String[] args){
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}
```

You can implement an infinite loop using the while statement as follows:

```
while (true){
    // your code goes here
}
```
The Java programming language also provides a ``do-while`` statement, which can be expressed as follows:

```
do {
     statement(s)
} while (expression);
```

The difference between ``do-while`` and ``while`` is that ``do-while`` evaluates its expression at the bottom of the loop instead of the top. Therefore, the statements within the do block are always executed at least once, as shown in the following DoWhileDemo program:

```
class DoWhileDemo {
    public static void main(String[] args){
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}
```



Оператор ``while`` постоянно выполняет блок операторов, пока определенное условие ``true``. Его синтаксис можно выразить так:

```
while (expression) {
     statement(s)
}
```
Оператор ``while`` оценивает выражение, которое должно возвращать логическое значение. Если выражение имеет значение ``true``, оператор ``while`` выполняет оператор(ы) в блоке ``while``. Оператор ``while`` продолжает проверять выражение и выполнять его блок до тех пор, пока выражение не станет ``false``. Использование оператора ``while`` для печати значений от 1 до 10 можно выполнить, как в следующей программе WhileDemo:

```
class WhileDemo {
    public static void main(String[] args){
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}
```

Вы можете реализовать бесконечный цикл, используя оператор while следующим образом:

```
while (true){
    // ваш код находится здесь
}
```

Язык программирования Java также предоставляет оператор ``do- while``, который можно выразить следующим образом:

```
while (expression) {
     statement(s)
}
```

Разница между ``do- while`` и ``while`` заключается в том, что ``do- while`` вычисляет свое выражение в нижней части цикла, а не в верхней. Таким образом, операторы внутри блока do всегда выполняются хотя бы один раз, как показано в следующей программе DoWhileDemo:

```
class DoWhileDemo {
    public static void main(String[] args){
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}
```