setTimeout(()=>{
    for(let i=0;i<10;i++){
        const e=2*i;
        console.log("number"+e);
    }

},3000);
console.log("print");

setTimeout(()=>{
    for(let i=0;i<10;i++){
        const e=3*i;
        console.log("number"+e);
    }
},1000);
console.log("print");