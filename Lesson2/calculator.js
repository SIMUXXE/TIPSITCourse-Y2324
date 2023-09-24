function Calculator(){
    let a = parseFloat(document.getElementById("num1").value);
    let b = parseFloat(document.getElementById("num2").value);
    let result;
    switch(document.getElementById("mathOperation").value){
        case "sum":
            alert(a+b); 
        break;
        case "sub":
            alert(a-b);
        break;
        case "mul":
            alert(a*b);
        break;
        case "div":
            alert(a/b);
        break;
    }
}