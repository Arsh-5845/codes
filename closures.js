function fungen(){
    let x=0;
    function anotherfungen(){
        x++;
        return x;

    }
    return anotherfungen
}
let fun=fungen();
console.log(fun());
console.log(fun());
console.log(fun());