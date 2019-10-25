let user="asd";
let pass="1234";


/*
function mostrarConsola(){
	var ingresoUser=document.getElementById("user-ing").value;
var ingresoPass=document.getElementById("passW").value;

console.log(ingresoUser);

console.log(ingresoPass);
}
*/

 function check_info() { 
 	var username=document.getElementById("user-ing").value; 
 	var password=document.getElementById("passW").value; 
 	if(username == "user1" && password == "123456") { 
 		alert("Login Successful"); 
 		return false; 
 	} else { 
 		alert("checkpassword"); 
 	} 
}