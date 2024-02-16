Русский текст смотри ниже

# React

## Hooks

Hooks are functions that allow you to hook into React state and lifecycle methods from functional components.

### useState

useState is a hook. We call it to give our functional component internal state. React will store this state between renders.

The useState call returns a two-element array containing the current state value and a function to update it. This function can be used anywhere, for example in an event handler.

The only argument to useState is the initial state.

A state hook can be used more than once in a component.

Array destructuring syntax allows us to have different names for the state variables we declare when calling useState. Since the names of these variables are not in the useState API, React assumes that if you call useState multiple times, you do so in the same sequence on every render.

```
//Declare a new state variable "count"
   const [count, setCount] = useState(0);
```

### useRef

useRef returns a mutable ref object whose .current property is initialized by the passed argument (initialValue). The returned object will persist for the lifetime of the component.

A common use case is to access a descendant in an imperative style.

Essentially, useRef is like a “box” that can contain a mutable value in its .current property.

The useRef() hook is useful not only for setting an attribute with a ref. It is useful for storing any mutated value, similar to how you use instance fields in classes.

This is possible because useRef() creates a regular JavaScript object. The only difference between useRef() and just creating the {current: ...} object itself is that the useRef hook will produce the same ref object on every render.



<br/><hr/><br/>

# React

## Хуки

Хуки — это функции, с помощью которых вы можете «подцепиться» к состоянию и методам жизненного цикла React из функциональных компонентов. 

### useState 

useState — это хук. Мы вызываем его, чтобы наделить наш функциональный компонент внутренним состоянием. React будет хранить это состояние между рендерами. 

Вызов useState возвращает массив с двумя элементами, который содержит: текущее значение состояния и функцию для его обновления. Эту функцию можно использовать где угодно, например, в обработчике событий. 

Единственный аргумент useState — это начальное состояние. 

Хук состояния можно использовать в компоненте более одного раза.

Синтаксис деструктуризации массивов позволяет нам по-разному называть переменные состояния, которые мы объявляем при вызове useState. Так как имён этих переменных нет в API useState, React предполагает, что если вы вызываете useState много раз, вы делаете это в одинаковой последовательности при каждом рендере. 

```
// Объявляем новую переменную состояния "count"
  const [count, setCount] = useState(0);
```

### useRef

useRef возвращает изменяемый ref-объект, свойство .current которого инициализируется переданным аргументом (initialValue). Возвращённый объект будет сохраняться в течение всего времени жизни компонента.

Обычный случай использования — это доступ к потомку в императивном стиле.

По сути, useRef похож на «коробку», которая может содержать изменяемое значение в своём свойстве .current.

Хук useRef() полезен не только установкой атрибута с рефом. Он удобен для сохранения любого мутируемого значения, по аналогии с тем, как вы используете поля экземпляра в классах.

Это возможно, поскольку useRef() создаёт обычный JavaScript-объект. Единственная разница между useRef() и просто созданием самого объекта {current: ...} — это то, что хук useRef даст один и тот же объект с рефом при каждом рендере.


<a href="https://react.dev/" target="_blank">Официальная страница React</a>