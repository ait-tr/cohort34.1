Русский текст смотри ниже

### Callback Hell Problem:

Callback Hell (sometimes called the "Pyramid of Doom") is a situation where nested callbacks are called inside each other, creating a deep and complex code structure.

```javascript
getUser(userId, (user) => {
  getOrders(user.id, (orders) => {
    getOrderDetails(orders[0].id, (details) => {
      // ... and so on
    });
  });
});
```
## Promise

A Promise in JavaScript is an object that represents the result of an asynchronous operation. A promise can be in one of three states:

1. **Pending:** Initial state, promise in progress.
2. **Fulfilled:** The promise has been successfully fulfilled. In this case, the result of the operation is available.
3. **Rejected:** The promise was not fulfilled due to an error. In this case, the cause of the error is available.

Promises allow you to work more efficiently with asynchronous code and avoid problems associated with callback hell (deep nesting of callbacks).

### Example of using a promise:

```javascript
const fetchData = () => {
  return new Promise((resolve, reject) => {
    // Asynchronous operation (for example, a request to the server)
    setTimeout(() => {
      const success = true; // Simulate successful execution
      if (success) {
        resolve('Data successfully fetched');
      } else {
        reject('Error fetching data');
      }
    }, 2000); // Delay 2 seconds to simulate asynchrony
  });
};

// Using a promise
fetchData()
  .then(data => {
    console.log(data); // "Data successfully fetched"
  })
  .catch(error => {
    console.error(error); // "Error fetching data"
  });
```

In the example above, `fetchData` returns a new promise. If the operation succeeds, the `resolve` method is called with the data as an argument. If an error occurs, the `reject` method is called with the reason for the error.

The `then` and `catch` methods bind handlers for success and error, respectively. Alternatively, you can use the `finally` method, which will be executed whether the promise succeeds or not.

### Promise Object States:

- **Pending:** Initial state. A promise in progress.
- **Fulfilled:** The promise was successfully fulfilled. The `then` callback is executed.
- **Rejected:** The promise was not fulfilled due to an error. The `catch` callback is executed.

### Methods `then`, `catch`, `finally`:

- **`then`:** Called when the promise is successfully fulfilled.
- **`catch`:** Called when a promise fails due to an error.
- **`finally`:** Called always after the promise has completed, regardless of whether it succeeded or not.

```javascript
fetch('https://api.example.com/data')
  .then(response => response.json())
  .then(data => console.log(data))
  .catch(error => console.error('Error:', error))
  .finally(() => console.log('Request completed.'));
```

### Methods `resolve`, `reject`:

- **`resolve`:** Creates a successfully resolved promise.
- **`reject`:** Creates a promise that failed due to an error.

```javascript
const promise = new Promise((resolve, reject) => {
  const success = true;
  if (success) {
    resolve('Success data');
  } else {
    reject('Error message');
  }
});

promise
  .then(data => console.log(data))
  .catch(error => console.error(error));
```

<br/><hr/><br/>

### Проблема Callback Hell:

Callback Hell (иногда называется "Pyramid of Doom") - это ситуация, когда вложенные колбэки вызываются внутри друг друга, создавая глубокую и сложную структуру кода.

```javascript
getUser(userId, (user) => {
 getOrders(user.id, (orders) => {
   getOrderDetails(orders[0].id, (details) => {
     // ... и так далее
   });
 });
});
```
## Promise

Promise (обещание) в JavaScript - это объект, представляющий результат асинхронной операции. Промис может находиться в одном из трех состояний:

1. **Pending (в ожидании):** Исходное состояние, обещание в процессе выполнения.
2. **Fulfilled (выполнено):** Обещание успешно выполнено. В этом случае, результат операции доступен.
3. **Rejected (отклонено):** Обещание не выполнено из-за ошибки. В этом случае, причина ошибки доступна.

Промисы позволяют более эффективно работать с асинхронным кодом и избежать проблем, связанных с callback hell (глубокой вложенность колбэков).

### Пример использования промиса:

```javascript
const fetchData = () => {
 return new Promise((resolve, reject) => {
   // Асинхронная операция (например, запрос к серверу)
   setTimeout(() => {
     const success = true; // Имитация успешного выполнения
     if (success) {
       resolve('Data successfully fetched');
     } else {
       reject('Error fetching data');
     }
   }, 2000); // Задержка 2 секунды для имитации асинхронности
 });
};

// Использование промиса
fetchData()
 .then(data => {
   console.log(data); // "Data successfully fetched"
 })
 .catch(error => {
   console.error(error); // "Error fetching data"
 });
```

В приведенном примере `fetchData` возвращает новый промис. Если операция завершится успешно, вызывается метод `resolve` с данными в качестве аргумента. Если произойдет ошибка, вызывается метод `reject` с причиной ошибки.

Методы `then` и `catch` привязывают обработчики для успешного выполнения и ошибки соответственно. Кроме того, можно использовать метод `finally`, который будет выполнен независимо от того, успешно выполнено обещание или нет.

### Состояния Объекта Promise:

- **Pending:** Начальное состояние. Обещание в процессе выполнения.
- **Fulfilled:** Обещание успешно выполнено. Выполняется колбэк `then`.
- **Rejected:** Обещание не выполнено из-за ошибки. Выполняется колбэк `catch`.

### Методы `then`, `catch`, `finally`:

- **`then`:** Вызывается, когда обещание успешно выполнено.
- **`catch`:** Вызывается, когда обещание не выполнено из-за ошибки.
- **`finally`:** Вызывается всегда после завершения выполнения обещания, независимо от того, успешно оно выполнено или нет.

```javascript
fetch('https://api.example.com/data')
 .then(response => response.json())
 .then(data => console.log(data))
 .catch(error => console.error('Error:', error))
 .finally(() => console.log('Request completed.'));
```

### Методы `resolve`, `reject`:

- **`resolve`:** Создает успешно выполненное обещание.
- **`reject`:** Создает обещание, не выполненное из-за ошибки.

```javascript
const promise = new Promise((resolve, reject) => {
 const success = true;
 if (success) {
   resolve('Success data');
 } else {
   reject('Error message');
 }
});

promise
 .then(data => console.log(data))
 .catch(error => console.error(error));
```



<a href="https://learn.javascript.ru/" target="_blank">Современный учебник JavaScript</a>

