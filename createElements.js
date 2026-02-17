<!DOCTYPE html>
<html>
  <head>
    <title>Hello World!</title>
    <link rel="stylesheet" href="styles.css" />
  </head>
  <body>
  </body>
  <script>
    const div=document.createElement('div')
    console.log(div)
    div.className="main"
    div.id=Math.round(Math.random()*10+1)
    div.setAttribute("title","chai")
    div.style.backgroundColor="yellow"
    const addText=document.createTextNode("code in js")
    div.appendChild(addText) //for webpage
    document.body.appendChild(div)
  </script>
</html>
