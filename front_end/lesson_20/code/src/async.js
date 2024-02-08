console.log('One');
setTimeout(() => console.log('Two'), 100);
setTimeout(() => {
    console.log('Two 1/2');   
    setTimeout(() => console.log('O-o-ops'), 1);
    console.log('Seven');
}, 1);
console.log('Three');