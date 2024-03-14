function fungen(){
    let x=0;
    function anotherfungen(){
        x++;
        function newanotherfun(){
            x++;
            return x;
        }
        return newanotherfun()
    }
    return anotherfungen
}
let fun=fungen();
console.log(fun());
console.log(fun());
console.log(fun());