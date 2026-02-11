//loops and iterator in javascript
//high order loops
//for of loops

const arr=[1,2,3,4,5]
// for(const iterator of object){  //kis object pe lagana chahiye
     
// }

for(const num of arr){  
  //kisi pe  bji lag sktaw
  console.log(num)
}

const greetings="hello world"
for(const greet of greetings){
  console.log('each char is ${greet}');
}

const map=new Map()
map.set('usa',"unitedStates")
map.set('france',"fr")

console.log(map)


for(const [key,value] of map){
  console.log(key,value)
}


// const myObj={
//   Game1:'nfs'
//   Game2:'spiderman'
  
// }

// for(const [key,value] of myObj){
//   console.log(key,value)
// }

const myObject={
    js:'javascript',
    cpp:'cpp',
    rb:"ruby",
    swift:"swift by apple"
}


for (const key in myObject){
  console.log(key)
}

const coding=["java","cpp","c","js"]
// coding.forEach(function (item) {
//   console.log(item)
// })

//by using array 
coding.forEach((val)=>{
  console.log(val)
})

function printMe(item){
  console.log(item)
}

coding.forEach(printMe)

coding.forEach((item,index,arr)=>{
  console.log(item,index,arr)
})


//array me object

const myCoding=[
  {
    langauage:"java",
    file:"k"
  },
  
  {
    langauage:"phythoon",
    file:"l"
  }]


myCoding.forEach( (i)=> {
  console.log(i.langauage)
  console.log(i.file)
})


