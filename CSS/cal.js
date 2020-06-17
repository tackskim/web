var myinput = "";

function result(){
  myinput = eval(myinput);
  document.getElementById("textfield").value = myinput;
  myinput = "";
}
function reset(){
  document.getElementById("textfield").value = "0";
  myinput = "";
}
function calculator(data){
  switch (data) {
    case 'sin':
      myinput = Math.sin(myinput);
      break;
    case 'cos':
      myinput = Math.cos(myinput);
      break;
    case 'tan':
      myinput = Math.tan(myinput);
      break;
    case 'trans':
      myinput = (myinput*-1);
      break;
    default:
      myinput += data;
  }
  document.getElementById("textfield").value = myinput;
}
