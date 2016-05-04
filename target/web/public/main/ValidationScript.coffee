class Coffeecup

 validate: ()->

   alert 'hi'
   x = undefined
   x = document.forms['addForm']['by'].value
   console.log x


cup = new Coffeecup
cup.validate()
