
const books=[
  {
    title:"book1",genre:"history",publish:2004
  },
   {
    title:"book2",genre:"geography",publish:1981
  },
   {
    title:"book3",genre:"civics",publish:1982
  },
   {
    title:"book4",genre:"hisy",publish:1983
  },
  
  {
    title:"book5",genre:"history",publish:2002
  },
  
  ]
  
  // const userbooks=books.filter((bk)=>bk.genre=="history")
  const userbooks=books.filter((bk)=>{return bk.publish>=2000 && bk.genre=="history"})
   //here scope is used so use return statement
  console.log(userbooks)
  
 const myNumber=[1,2,3,4,5,6]
 const newNum=myNumber.map((num)=>num+10)


//chaining
const newNum=
              myNumber
            .map((num)=>num*10)
            .map((num)=>num+2)
            .filter((num)=>num>=40)
  console.log(newNum)
  
  
//reduce method
const n=[1,2,3]
const total=n.reduce(function(acc,curVal){
  console.log(`acc:${acc} and curVal:${curVal}`)
            return acc+curVal
},0)
  
console.log(total)
  
  const shoppingCart=[
    {
      title:"book",
      price:2345
    },
    {
      title:"book2",
      price:1345
    },
    ]
    
const pricepay= shoppingCart.reduce((acc,item)=>
                   acc+item.price,0)
     
  console.log(pricepay)
