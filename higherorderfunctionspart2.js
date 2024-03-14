function fun(){
    console.log("inside function generator");

    function newfunction(){
        console.log("inside new function generator");
    }

    function anotherfunction(){
        console.log("inside another function generator");
        return newfunction()
}
return anotherfunction
}
let y=fun();
y();
//wellfound.com(job)//
