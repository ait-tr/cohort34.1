//Problem -> console 10 times 10
// for (var i = 0; i < 10; i++) {
//     setTimeout(function () {
//         console.log(i);
//     }, 1000);
// }

//Solution 1 -> use let
// for (let i = 0; i < 10; i++) {
//     setTimeout(function () {
//         console.log(i);
//     }, 1000);
// }

//Solution 2 -> use wrapper function
// for (var i = 0; i < 10; i++) {
//     function fn(i) {
//         setTimeout(function () {
//             console.log(i);
//         }, 1000);
//     }
//     fn(i);
// }

//Solution 3 -> use anonymous wrapper function
// for (var i = 0; i < 10; i++) {
//     (function(i) {
//         setTimeout(function () {
//             console.log(i);
//         }, 1000);
//     })(i)   
// }

//Solution 4 -> use setTimeot args
// for (var i = 0; i < 10; i++) {
//     setTimeout(function (i) {
//         console.log(i);
//     }, 1000, i);
// }

//Solution 4.1 -> use setTimeot args
// for (var i = 0; i < 10; i++) {
//     setTimeout(console.log, 1000, i);
// }

//Solution 5 -> use bind
// for (var i = 0; i < 10; i++) {
//     setTimeout(console.log.bind(console, i), 1000);
// }

//Solution 6 -> :)
for (var i = 0; i < 10; i++) {
    setTimeout(function () {
        console.log(i++ % 10);
    }, 1000);
}