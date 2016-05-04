(function() {
  var Coffeecup, cup;

  Coffeecup = (function() {
    function Coffeecup() {}

    Coffeecup.prototype.validate = function() {
      var x;
      alert('hi');
      x = void 0;
      x = document.forms['addForm']['by'].value;
      return console.log(x);
    };

    return Coffeecup;

  })();

  cup = new Coffeecup;

  cup.validate();

}).call(this);

//# sourceMappingURL=ValidationScript.js.map
