Русский текст смотри ниже


1. Previously, we checked the correct operation of the methods we created by executing several times
application, with different sets of source data, and comparing the result obtained in the console
with the expected. It is very uncomfortable. For example, any code change requires repeating the entire
repeat the above procedure. There are special libraries that make it easier
and automate this process. One of the most popular for Java is JUnit

2. Working with JUnit involves creating a class with tests and setting it up.
In the class, we can specify objects to be tested and the necessary data as fields.
In the method marked with the @BeforeEach annotation, we give initial settings to the object under test.
And in methods marked with the @Test annotation, we write code that checks the object under test.
Checks are carried out using methods starting with the word assert... (which exist
a large number for all cases), and taking the obtained result and the expected one for comparison.
All specified methods and annotations are provided by the JUnit library.
Each method marked with the @Test annotation is essentially a separate “main”.

<br/>

1. Ранее мы проверяли правильность работы созданных нами методов, выполняя несколько раз 
аппликацию, с различными наборами исходных данных, и сравнивая результат полученный в консоли 
с ожидаемым. Это очень не удобно. Например любое изменение кода, требует повторения всей 
вышеописанной процедуры заново. Существуют специальные библиотеки, которые позволяют облегчить 
и автоматизировать этот процесс. Одна из самых популярных для Java, это JUnit

2. Работа с JUnit заключается в создании класса с тестами и настройке его. 
В классе в качестве полей мы можем указать объекты для тестирования и необходимые данные. 
В методе помеченном аннотацией @BeforeEach мы даем начальные настройки тестируемому объекту. 
А в методах помеченных аннотацией @Test мы пишем код проверяющий тестируемый объект. 
Проверки осуществляются при помощи методов начинающихся со слова assert... (которых существует 
большое колличество на все случаи), и принимающих для сравнения полученный результат и ожидаемый.
Все указанные методы и аннотации предоставляются библиотекой JUnit. 
Каждый метод помеченный аннотацией @Test, по сути является отдельным "мейном".