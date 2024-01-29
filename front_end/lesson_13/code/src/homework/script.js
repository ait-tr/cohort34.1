const library = [];
//isbn;title;author;year
let inputData = prompt('Enter book data separate by ";"');
while (inputData) {
    //TODO create and add to library only unique book by isbn
    const arr = inputData.split(';');
    if(findBook(library, arr[0] ) === -1){
        const book = new Book(arr[0], arr[1], arr[2], arr[3]);
        library.push(book);
    }

    inputData = prompt('Enter book data separate by ";"');
}

printLibrary(library);

function printLibrary(library) {
    //TODO print all books to console
    for (let i = 0; i < library.length; i++) {
        console.log(library[i].toString());
    }
}

function findBook(library, isbn) {
    //TODO return index if book exists, otherwise return -1
    for (let i = 0; i < library.length; i++) {
        if(library[i].isbn === isbn){
            return i;
        }
    }
    return -1;
}


function Book(isbn, title, author, year) {
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.year = +year;
    this.toString = function () {
        return `ISBN: ${this.isbn}, Title: ${this.title}, Author: ${this.author}, Year of publishing: ${this.year}`; // TODO Complete toString
    }
}