const course={
  courseName:"js",
  price:345,
  courseInstructor:"joki"
}
const{courseInstructor}=course
console.log(courseInstructor)

const{courseName}=course //destructure of the o bject
console.log(courseName)

//functions in javascript
function sayMyName(){
  console.log("hitesh");
  console.log("sarthak");
  console.log("sagar");
}
sayMyName()



// function Add(num1,num2){
//   console.log(num1+num2)
// }
// const result=Add(45,"a")
// console.log(result)


function Add(num1,num2){
  // let result=num1+num2
  // return result; 
  //result ke baad kuch bhi print nhi hoga
  return num1+num2;
}
const result=Add(45,"a")
//console.log(result)

function logInUserMessage(username){
  return `${username} just logged In`
}
// console.log(logInUserMessage("hitesh"))
console.log(logInUserMessage())


function logInUserMessage(username){
  if(username==undefined){
    console.log("enter username")
    return
  }
  return `${username} just logged In`
}
// console.log(logInUserMessage("hitesh"))
console.log(logInUserMessage())



