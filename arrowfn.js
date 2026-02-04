//arrow function in javascript
const user={
  username:"sarthak",
  price:34,
  
  welcomeMessage: function(){
    console.log(`${this.username}, welcome to website`); //this included current context
  }
  
}
// 
user.welcomeMessage()
console.log(user)
user.username="sam"
user.welcomeMessage()

console.log(this) //currebt context empty Object
console.log(user)



// function chai(){
//   let username="sarthak"
//   console.log(this.username) //context of the scope in this
// }
// chai()
//function me this ude nhi kr paa rha hai


const chai=()=>{
  let username="sarthak"
  console.log(this)
}
chai()

//arrow function
// const addTwo=(num1,num2) =>{
//   return num1+num2
// }
// console.log(addTwo(4,5))

//implicit return no use of parenthisos  and return keywors
  // const addTwo=(num1,num2)=>num1+num2
  //in react we can use it
 const addTwo=(num1,num2)=>(num1+num2)

console.log(addTwo(4,5))
//object ko return karne ke liye paranthesis me rkhna padega 
