function add(val) {
    if (typeof val == 'undefined') return 0;

    function newAdd(newVal) {
        if (typeof newVal == 'undefined') return val;
        val += newVal;
        return newAdd
    }
    return newAdd;
}

console.log(add());
console.log(add(1)());
console.log(add(1)(2)());
console.log(add(1)(2)(3)());
console.log(add(1)(2)(3)(4)());
console.log(add(1)(2)(3)(4)(5)());
console.log(add(1)(2)(3)(4)(5)(6)());
