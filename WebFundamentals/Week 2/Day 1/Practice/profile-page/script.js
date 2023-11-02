console.log("page loaded...");
function changename(){
    console.log("clicked");
    document.querySelector("#profilename").innerText="John smith";
}

function removeline(e){
    console.log("clicked");
    if (e==1){
        document.querySelector("#line1").remove();
    }
    else if(e==2){
        document.querySelector("#line2").remove();
    }
    document.querySelector("#x").innerText--;
}

function increase(e){
    removeline(e);
    document.querySelector("#cnx").innerText++;

}