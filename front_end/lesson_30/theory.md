Русский текст смотри ниже

# Context API

Context allows you to pass data through the component tree without having to pass props at intermediate levels.

In a typical React application, data is passed top-down (from parent to child component) using props. However, this method of use can be too cumbersome for some types of props (for example, selected language, UI theme) that need to be passed to many components in the application. Context provides a way to share such data between components without having to explicitly pass props through each level of the tree.

## When to use context

A context is designed to convey data that can be called "global" for the entire tree of React components (for example, the currently authenticated user, UI theme, or selected language).

## React.createContext

```
const MyContext = React.createContext(defaultValue);
```

Creates a Context object. When React renders a component that is subscribed to this object, React will get the current context value from the closest matching Provider higher up in the component tree.

The defaultValue argument is only used if there is no matching Provider higher up in the tree for the component. The default value can be useful for testing components in isolation without having to wrap them. Note that if you pass undefined as the Provider value, components using this context will not use defaultValue.

## Context.Provider

```
<MyContext.Provider value={/* some value */}>
```

Each Context object is used in conjunction with a Provider component, which allows child components that use that context to subscribe to its changes.

The Provider component accepts a value prop, which will be passed to all components that use this context and are descendants of this Provider component. One Provider can be associated with multiple components consuming a context. Provider components can also be nested within each other, redefining the context value deeper in the tree.

All consumers that are children of the Provider will be re-rendered as soon as the Provider's value prop changes.

## useContext

```
const value = useContext(MyContext);
```

Takes a context object (the value returned from React.createContext) and returns the current context value for that context. The current context value is determined by the value prop of the closest <MyContext.Provider> above the calling component in the tree.

When the closest <MyContext.Provider> above a component is updated, this hook will cause it to re-render with the last context value passed to that MyContext provider.

Remember, the argument to useContext must be the context object itself.

The component calling useContext will always re-render when the context value changes.


<br/><hr/><br/>


# Context API

Контекст позволяет передавать данные через дерево компонентов без необходимости передавать пропсы на промежуточных уровнях.

В типичном React-приложении данные передаются сверху вниз (от родителя к дочернему компоненту) с помощью пропсов. Однако, подобный способ использования может быть чересчур громоздким для некоторых типов пропсов (например, выбранный язык, UI-тема), которые необходимо передавать во многие компоненты в приложении. Контекст предоставляет способ делиться такими данными между компонентами без необходимости явно передавать пропсы через каждый уровень дерева.

## Когда использовать контекст

Контекст разработан для передачи данных, которые можно назвать «глобальными» для всего дерева React-компонентов (например, текущий аутентифицированный пользователь, UI-тема или выбранный язык). 

## React.createContext

```
const MyContext = React.createContext(defaultValue);
```

Создаёт объект Context. Когда React рендерит компонент, который подписан на этот объект, React получит текущее значение контекста из ближайшего подходящего Provider выше в дереве компонентов.

Аргумент defaultValue используется только в том случае, если для компонента нет подходящего Provider выше в дереве. Значение по умолчанию может быть полезно для тестирования компонентов в изоляции без необходимости оборачивать их. Обратите внимание: если передать undefined как значение Provider, компоненты, использующие этот контекст, не будут использовать defaultValue.

## Context.Provider

```
<MyContext.Provider value={/* некоторое значение */}>
```

Каждый объект Context используется вместе с Provider компонентом, который позволяет дочерним компонентам, использующим этот контекст, подписаться на его изменения.

Компонент Provider принимает проп value, который будет передан во все компоненты, использующие этот контекст и являющиеся потомками этого компонента Provider. Один Provider может быть связан с несколькими компонентами, потребляющими контекст. Так же компоненты Provider могут быть вложены друг в друга, переопределяя значение контекста глубже в дереве.

Все потребители, которые являются потомками Provider, будут повторно рендериться, как только проп value у Provider изменится. 

## useContext

```
const value = useContext(MyContext);
```

Принимает объект контекста (значение, возвращённое из React.createContext) и возвращает текущее значение контекста для этого контекста. Текущее значение контекста определяется пропом value ближайшего <MyContext.Provider> над вызывающим компонентом в дереве.

Когда ближайший <MyContext.Provider> над компонентом обновляется, этот хук вызовет повторный рендер с последним значением контекста, переданным этому провайдеру MyContext.

Запомните, аргументом для useContext должен быть непосредственно сам объект контекста.

Компонент, вызывающий useContext, всегда будет перерендериваться при изменении значения контекста. 



<a href="https://react.dev/" target="_blank">Официальная страница React</a>