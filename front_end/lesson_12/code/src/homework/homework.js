const arr = [9, 2, 4, 1, 5, 2, 9, 1, 2, 0];
console.log(arr);
printArray(arr);
bubbleSort(arr);
printArray(arr);
let index = binarySearch(arr, 5);
console.log(`index = ${index}`);
index = binarySearch(arr, 7);
console.log(`index = ${index}`);
sort(arr, (a,b) => b - a);
printArray(arr);



function printArray(arr) {
    console.log('====================');
    for (let i = 0; i < arr.length; i++) {
        console.log(arr[i]);
    }
    console.log('====================');
}

function bubbleSort(arr) {
    for (let i = 0; i < arr.length - 1; i++) {
        for (let j = 0; j < arr.length - 1 - i; j++) {
            if (arr[j] - arr[j + 1] > 0) {
                let t = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = t;
            }
        }
    }
}

function binarySearch(arr, value) {
    let l = 0;
    let r = arr.length - 1;
    while (l <= r) {
        let mid = Math.round((l + r) / 2);
        if (arr[mid] === value) {
            return mid
        }
        if (value < arr[mid]) {
            r = mid - 1;
        } else {
            l = mid + 1;
        }
    }
    return -l - 1;
}

function sort(arr, comparator) {
    for (let i = 0; i < arr.length - 1; i++) {
        for (let j = 0; j < arr.length - 1 - i; j++) {
            if (comparator(arr[j], arr[j + 1]) > 0) {
                let t = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = t;
            }
        }
    }
}