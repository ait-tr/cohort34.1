Русский текст смотри ниже

1. A special section of the JVM called Classloader contains reflection objects for each data type used in the project.
2. Reflection objects contain all the information about the data type corresponding to this object.
3. For typing Reflection Objects, there is a Class<T> class.
4. You can get a link to a reflection object in three ways. For example, a link to a reflection object of the String class can be obtained either from the class itself: String.class, or from the class object: "hello".getClass(), or from the class name: Class.forName("java.lang.String").
5. In the Java Reflection API, there are types responsible for any elements of objects: fields, methods, constructors, etc.

<br/>

1. В специальном разделе JVM именуемом Classloader находятся объекты рефлексии для каждого типа данных используемого в проекте.
2. Объекты рефлекции содержат в себе всю информацию о соответсвующем этому объекту типу данных.
3. Для типизации Объектов рефлексии существует класс Class<T>.
4. Получить ссылку на объект рефлексии можно тремя способами. Например ссылку на объект рефлексии класса String можно получить или у самого класса: String.class, или у объекта класса: "hello".getClass(), или по имени класса: Class.forName("java.lang.String").
5. В Java Reflection API существуют типы ответственные за любые элементы объектов: поля, методы, конструкторы и т. д.