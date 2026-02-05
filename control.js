const isUserLoggedIn=true
if(2=="2"){
  console.log("executed")
}

if(2==="2"){
  console.log("executed")
}

if(2!=3){
  console.log("true")
}

const temperature=410


if(temperature<50){
  console.log("smaller than 50")
}
else{
console.log("no")
}

//scope ki llahani sb jagah smae hai

const balance=11000
if(balance>500) console.log("desk")  //explicit scope

//nesting
const userLoggedIn=true
const debitCard=true
const loggedInGoogle=false
const loggedIngmail=true

if(userLoggedIn && debitCard){ //all conditons true bhona chahiye 
  console.log("allow all course to buy")
}

if(loggedInGoogle || loggedIngmail){
  console.log("user logged in")
}



//truthy and falsy valurs
// false-is always false
// 0-false
// " "-false, null,undefine-false

// //truthy values\
// true-is always true
// "0"-true,'false'-true written under string," "-true,[],{},function(){}



//nullish coelising operator ??
let val1;
val1=5??11000
console.log(`value is ${val1}`)
val2=null??24
console.log(val2)


//terntiary operator
// condition?ture:false
const tea=23
tea>=23?console.log("true"):console.log("false")
