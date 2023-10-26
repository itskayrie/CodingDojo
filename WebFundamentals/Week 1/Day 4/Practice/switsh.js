var arr1=[5,36,47,8,102];
var arr2=['a','d','f','r','o']

function reverse(genericArray){
    var temp =0
    for  (var i=0;i<=genericArray.lentgh/2;i++){
        temp=genericArray[i]
        genericArray[i]=genericArray[genericArray.length-1-i]
        genericArray[genericArray.length-1-i]=temp;
        
    }
    return genericArray;
}
