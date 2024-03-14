//
//setTimeout(() =>{
 //   for(let i=0;i<25;i++){
  //      const e=2*i;
   //     console.log("number"+e);
   // }
//},2000);
//console.log("print");//



//example 2
const task1 = () =>{
    setTimeout(()=>{
        console.log("task 1 is ready");
    },2000)
}

const task2 = () =>{
    console.log("task 2 is ready");
    task1();
    console.log("task 2 is done");
}
task2();