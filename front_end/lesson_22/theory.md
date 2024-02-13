Русский текст смотри ниже

# Fetch

When we call the fetch function with only the first required argument (url), a GET request with default settings is sent to the specified address. As a second argument, the fetch function can take an object that can be used to manage request options.

The following list is all the possible options for fetch with their respective default values (alternative values are provided in the comments):

```
let promise = fetch(url, {
   method: "GET", // POST, PUT, DELETE, etc.
   headers: {
     // the value of this header is usually set automatically,
     // depending on the request body
     "Content-Type": "text/plain;charset=UTF-8"
   },
   body: undefined, // string, FormData, Blob, BufferSource or URLSearchParams
   referrer: "about:client", // or "" in order not to send the Referer header,
   // or URL from the current source
   referrerPolicy: "strict-origin-when-cross-origin", // no-referrer-when-downgrade, no-referrer, origin, same-origin...
   mode: "cors", // same-origin, no-cors
   credentials: "same-origin", // omit, include
   cache: "default", // no-store, reload, no-cache, force-cache or only-if-cached
   redirect: "follow", // manual, error
   integrity: "", // checksum, for example "sha256-abcdef1234567890"
   keepalive: false, // true
   signal: undefined, // AbortController to abort the request
   window: window // null
});
```


<br/><hr/><br/>

# Fetch

Когда мы вызываем функцию fetch только с первым обязательным аргументом (url), то по заданному адресу отправляется GET запрос с дефолтными настройками. В качестве второго аргумента функция fetch может принимать объект при помощи которого можно управлять опциями запроса.

Нижеследующий список – это все возможные опции для fetch с соответствующими значениями по умолчанию (в комментариях указаны альтернативные значения):

```
let promise = fetch(url, {
  method: "GET", // POST, PUT, DELETE, etc.
  headers: {
    // значение этого заголовка обычно ставится автоматически,
    // в зависимости от тела запроса
    "Content-Type": "text/plain;charset=UTF-8"
  },
  body: undefined, // string, FormData, Blob, BufferSource или URLSearchParams
  referrer: "about:client", // или "" для того, чтобы не послать заголовок Referer,
  // или URL с текущего источника
  referrerPolicy: "strict-origin-when-cross-origin", // no-referrer-when-downgrade, no-referrer, origin, same-origin...
  mode: "cors", // same-origin, no-cors
  credentials: "same-origin", // omit, include
  cache: "default", // no-store, reload, no-cache, force-cache или only-if-cached
  redirect: "follow", // manual, error
  integrity: "", // контрольная сумма, например "sha256-abcdef1234567890"
  keepalive: false, // true
  signal: undefined, // AbortController, чтобы прервать запрос
  window: window // null
});
```

<a href="https://learn.javascript.ru/" target="_blank">Современный учебник JavaScript</a>

