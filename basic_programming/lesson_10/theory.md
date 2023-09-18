Русский текст смотри ниже


The for statement provides a compact way to iterate over a range of values. Programmers often refer to it as the "for loop" because of the way in which it repeatedly loops until a particular condition is satisfied. The general form of the for statement can be expressed as follows:

```
for (initialization; termination;
     increment) {
    statement(s)
}
```

When using this version of the for statement, keep in mind that:

The initialization expression initializes the loop; it's executed once, as the loop begins.
When the termination expression evaluates to false, the loop terminates.
The increment expression is invoked after each iteration through the loop; it is perfectly acceptable for this expression to increment or decrement a value.
The following program, ForDemo, uses the general form of the for statement to print the numbers 1 through 10 to standard output:

```
class ForDemo {
    public static void main(String[] args){
         for(int i=1; i<11; i++){
              System.out.println("Count is: " + i);
         }
    }
}
```

The output of this program is:

```
Count is: 1
Count is: 2
Count is: 3
Count is: 4
Count is: 5
Count is: 6
Count is: 7
Count is: 8
Count is: 9
Count is: 10
```

Notice how the code declares a variable within the initialization expression. The scope of this variable extends from its declaration to the end of the block governed by the for statement, so it can be used in the termination and increment expressions as well. If the variable that controls a for statement is not needed outside of the loop, it's best to declare the variable in the initialization expression. The names i, j, and k are often used to control for loops; declaring them within the initialization expression limits their life span and reduces errors.

The three expressions of the for loop are optional; an infinite loop can be created as follows:

// infinite loop

```
for ( ; ; ) {
    
    // your code goes here
}
```



Оператор for обеспечивает компактный способ перебора диапазона значений. Программисты часто называют его «циклом for» из-за того, что он повторяется до тех пор, пока не будет выполнено определенное условие. Общую форму оператора for можно выразить следующим образом:

```
for (initialization; termination;
     increment) {
    statement(s)
}
```

При использовании этой версии оператора for имейте в виду, что:

Выражение инициализации инициализирует цикл; он выполняется один раз в начале цикла.
Когда выражение завершения принимает значение false, цикл завершается.
Выражение приращения вызывается после каждой итерации цикла; для этого выражения вполне приемлемо увеличивать или уменьшать значение.
Следующая программа, ForDemo, использует общую форму оператора for для вывода чисел от 1 до 10 в стандартный вывод:
```
class ForDemo {
    public static void main(String[] args){
         for(int i=1; i<11; i++){
              System.out.println("Count is: " + i);
         }
    }
}
```

Результатом этой программы является:

```
Count is: 1
Count is: 2
Count is: 3
Count is: 4
Count is: 5
Count is: 6
Count is: 7
Count is: 8
Count is: 9
Count is: 10
```

Обратите внимание, как код объявляет переменную в выражении инициализации. Область действия этой переменной простирается от ее объявления до конца блока, управляемого оператором for, поэтому ее также можно использовать в выражениях завершения и приращения. Если переменная, управляющая оператором for, не требуется вне цикла, лучше всего объявить переменную в выражении инициализации. Имена i, j и k часто используются для управления циклами; объявление их в выражении инициализации ограничивает срок их жизни и уменьшает количество ошибок.

Три выражения цикла for являются необязательными; бесконечный цикл можно создать следующим образом:

// infinite loop

```
for ( ; ; ) {
    
    // your code goes here
}
```
