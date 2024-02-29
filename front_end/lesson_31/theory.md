Русский текст смотри ниже


# TypeScript

## Type definitions



The TypeScript compiler uses declaration files to parse errors and provide tooltips. They contain all the information about the types that are used in a particular library. In turn, this allows us to use JavaScript libraries in a project together with TypeScript.

There are two main ways to obtain ad files:

**Bundled** - The library is installed along with its own declaration file. This is a great option for us, since all we need is to install the desired package. To check if a library has a declaration file, look for index.d.ts in its source files. In some libraries, the presence and location of this file is indicated in package.json in the typings or types sections.

**DefinitelyTyped** is an impressive repository of ad files. For example, React installs without its own declaration file—instead, we install it separately:

```
npm i --save-dev @types/react
```

## vite template for React TypeScript:

```
npm create vite@latest my-vue-app -- --template react-ts
```


<br/><hr/><br/>

# TypeScript

## Определения типов 



Для анализа ошибок и выдачи всплывающих подсказок компилятор TypeScript использует файлы объявлений. Они содержат в себе всю информацию о типах, которые используются в конкретной библиотеке. В свою очередь это позволяет нам использовать JavaScript-библиотеки в проекте совместно с TypeScript.

Существует два основных способа получения файлов объявлений:

**Bundled** — библиотека устанавливается вместе с собственным файлом объявлений. Это прекрасный вариант для нас, так как всё, что нам нужно — установить нужный пакет. Чтобы проверить, есть ли у библиотеки файл объявлений, поищите index.d.ts в её исходных файлах. В некоторых библиотеках наличие и расположение этого файла указываются в package.json в секциях typings или types.

**DefinitelyTyped** — это внушительный репозиторий файлов объявлений. Например, React устанавливается без собственного файла объявления — вместо этого мы устанавливаем его отдельно: 

```
npm i --save-dev @types/react
```

## vite template для React TypeScript:

```
npm create vite@latest my-vue-app -- --template react-ts
```
   
  


<a href="https://react.dev/" target="_blank">Официальная страница React</a>