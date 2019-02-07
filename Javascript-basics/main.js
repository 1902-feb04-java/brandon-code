/* eslint-disable no-console */
/*
    JAVASCRIPT
*/
"use strict";
console.log("Hello JS!");

let x = {hour:3};
console.log("Value of x: "+ x);
console.log("type of x:" + typeof(x));
// debugger;
x.hour = 5;
console.log("Value of x: "+ x);
console.log("type of x:" + typeof(x));

const obj= {
    age: 18
}

function newCounter() {
    let inc = 0;
    return function(){inc++; return inc;};
}
let counter = newCounter();
console.log(counter());
console.log(counter());

console.log(counter());
