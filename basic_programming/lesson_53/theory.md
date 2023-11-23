Русский текст смотри ниже

<ol>
<li> <code>V getOrDefault(Object k, V defaultValue)</code>: Returns the value of the object whose key is k. If there is no such element, the defaultVlue value is returned.
</li>
<li> <code>V putIfAbsent(K k, V v)</code>: Places a new object with key k and value v into the collection if there is no element with a similar key already in the collection.
</li>
<li> <code>V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)</code> takes two parameters. The first parameter is the key and the second parameter is the display function. It is important to know that the mapping function is only called if there is no mapping.
</li>
<li> <code>V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)</code>
If a value for the specified key is present and not null, the method attempts to calculate a new mapping given the key and its current value.
</li>
<li> <code>V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)</code>
The merge method in the Map interface in Java allows you to merge values by key using a given https function. If the specified key is not already associated with a value or the value is null, it associates the key with the given value. Otherwise, it replaces the value with the result of the specified override function. If the result of the override function is null, it removes the result.
</li>
<li> Objects of the Optional<T> class are used as a container for references that can be null. You can put an object into Optional using the static method Optional.ofNullable(...). The optional.get() method returns the contents of optional, but only if it is not null. The optional.isPresent() method returns true, false depending on whether there is something inside optional or null. The optional.ifPresent(Consumer) method executes the passed function, but only if optional does not contain null. The optional.orElse(default) method returns the contents of optional if it is not null, or default otherwise. The optional.orElseGet(Supplier) method returns the contents of optional if it is not null, or the result of the function otherwise. The optional.orElseThrow(Supplier) method returns the contents of optional if it is not null, or throws the exception thrown by the function otherwise.
</li>
</ol>

<br/>

<ol>
<li> <code>V getOrDefault(Object k, V defaultValue)</code>: возвращает значение объекта, ключ которого равен k. Если такого элемента не окажется, то возвращается значение defaultVlue.
</li> 
<li> <code>V putIfAbsent(K k, V v)</code>: помещает в коллекцию новый объект с ключом k и значением v, если в коллекции еще нет элемента с подобным ключом.
</li>
<li> <code>V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)</code> принимает два параметра. Первый параметр — это ключ , а второй параметр — это функция отображения. Важно знать, что функция сопоставления вызывается только в том случае, если сопоставление отсутствует.
</li>
<li> <code>V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)</code>
Если значение для указанного ключа присутствует и не null, метод пытается вычислить новое отображение с учетом ключа и его текущего значения.
</li>
<li> <code>V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)</code>
Метод merge в интерфейсе Map в Java позволяет объединять значения по ключам с помощью заданной функцииhttps. Если указанный ключ еще не связан со значением или значение равно null, он связывает ключ с данным значением. В противном случае он заменяет значение результатом заданной функции переопределения. Если результат функции переопределения равен null, он удаляет результат.
</li>
<li> Объекты класса Optional<T> используются как контейнер для ссылок, которые могут принимать значение null. Положить объект в Optional можно при помощи статического метода Optional.ofNullable(...). Метод optional.get() возвращает содержимое optional, но только если оно не null. Метод optional.isPresent() возвращает true, false в зависимости от того есть что-то внутри optional или там null. Метод optional.ifPresent(Consumer), выполняет переданную функцию, но только если optional не содержит null. Метод optional.orElse(default) возвращает содержимое optional если оно не null, или default в противном случае. Метод optional.orElseGet(Supplier) возвращает содержимое optional если оно не null, или результат работы функции в противном случае. Метод optional.orElseThrow(Supplier) возвращает содержимое optional если оно не null, или бросает исключение созданное функцией в противном случае.
</li>
</ol>

