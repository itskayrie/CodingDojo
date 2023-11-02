function alertme(){
    alert("loading weathr report")
}
function removelement(){
    document.querySelector(".footer").remove();
}
console.log("clicked");

function convertir(e){
    console.log("clicked");
    for (var i=1;i<5;i++){
        if (e=="F") {
            var x=document.querySelector("#red"+i);
        
            x.innerText=(x.innerText)*9/5+32;
            console.log(x);
            var x=document.querySelector("#blue"+i);
            x.innerText=(x.innerText)*9/5+32;
        }
        else     if (e=="C") {
            var x=document.querySelector("#red"+i);
            x.innerText=((x.innerText)-32)*5/9;
            var x=document.querySelector("#blue"+i);
            x.innerText=Math.floor(((x.innerText)-32)*5/9);
        }
    }
    
}