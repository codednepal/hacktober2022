let count = 0;
let savEl = document.getElementById("savel");
let countEl=document.getElementById("cnt");

console.log(countEl);

const incrm = () =>{
    count+=1;
    countEl.textContent =count;
}

const save = () =>{

    let countr = count + ","
    savEl.innerText+=countr; 
     
    console.log(count);
}