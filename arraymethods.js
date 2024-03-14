let arr = [1, 2, 3, 4];
arr.push(5);
arr.push(6);//add value in an array at last index
arr.push(7); 
arr.pop()

arr.unshift(0);
arr.shift()
console.log(arr);

let arr2 = arr.map(function(val,indx,arr){
    console.log("Index: " + indx + "value: " + val);
    console.log(arr);
    return val ** 4;
})
let arr3 = arr.filter(function(val,indx,arr){
    if(val % 2 == 0) return val;
})
console.log(arr3);

let x = arr.reduce(function(accum,val)  {
    return accum * val
})