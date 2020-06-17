var arrNum = new Array();

function input(){
  arrNum.push(document.getElementById("textfield").value);
  document.getElementById("textfield").value = "";
  output();
}

function output(){
  document.getElementById("output").innerHTML=arrNum;
}

function shift(){
  arrNum.shift();
  output();
}
function Pop(){
  arrNum.pop();
  output();
}
function Reverse(){
  arrNum.reverse();
  output();
}
function sort(){
  arrNum.sort();
  output();
}
