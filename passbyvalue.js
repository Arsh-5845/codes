function update(a,b,c){
    c=a+b;
    console.log("inside update function",c);
    return c;
}
let a=10,b=20,c;
c=update(a,b,c);
//console.log(c);

let arr=[1,2,3,4];
console.log(arr == [1,2,3,4]);
let arr1 = arr;
console.log(arr == arr1);

function newUpdate(arr){
    arr[3] = arr[2] + arr[3];
}
newUpdate(arr);
console.log(arr);