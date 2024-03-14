function fun(params){
    //console.log(params.toString());//
    //console.log(params);//
    console.log("inside function generator " + params());
    //console.log("" + params);//
}

function anotherfunction(){
    console.log("inside another function generator");
}
fun(anotherfunction)
//anotherfunction()//
//due to console.log it will give undefined value//
//first it will call ifg and then iafg//