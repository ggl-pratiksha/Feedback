(function() {
  var AddFeedback;

  window.addFeedback = AddFeedback = (function() {
    var _this;

    function AddFeedback() {}

    _this = AddFeedback;

    $(document).on('click', '#addButton', function() {
      console.log("this");
      if (AddFeedback.isDataValid() === true) {
        return AddFeedback.test();
      }
    });

    $(document).on('click', '#backButton', function() {
      return AddFeedback.backToMainPage();
    });

    $(document).on('click', '#renderAddButton', function() {
      return AddFeedback.renderAddFeedbackPage();
    });

    AddFeedback.test = function() {
      return jQuery.ajax({
        type: "POST",
        url: "/add",
        data: AddFeedback.createAddRequestData(),
        success: AddFeedback.successCallback,
        contentType: "application/json",
        dataType: "json"
      });
    };

    AddFeedback.createAddRequestData = function() {
      var data;
      console.log("in data");
      data = {};
      data['by'] = document.forms['addForm']['by'].value;
      data['topic'] = document.forms['addForm']['topic'].value;
      data['email'] = document.forms['addForm']['email'].value;
      data['rating'] = document.forms['addForm']['rating'].value;
      data['comment'] = document.forms['addForm']['comment'].value;
      return JSON.stringify(data);
    };

    AddFeedback.successCallback = function(responseData) {
      return $("#response").text(responseData.message);
    };

    AddFeedback.backToMainPage = function() {
      return location.href = '/';
    };

    AddFeedback.renderAddFeedbackPage = function() {
      return location.href = '/renderAddFeedback';
    };

    AddFeedback.isDataValid = function() {
      var data, emailPattern;
      data = {};
      data['by'] = document.forms['addForm']['by'].value;
      data['email'] = document.forms['addForm']['email'].value;
      data['topic'] = document.forms['addForm']['topic'].value;
      data['rating'] = document.forms['addForm']['rating'].value;
      data['comment'] = document.forms['addForm']['comment'].value;
      emailPattern = /^([\w.-]+)@([\w.-]+)\.([a-zA-Z.]{2,6})$/i;
      if (data['by'] === "" | data['email'] === "" | data['topic'] === "" | data['comment'] === "" | data['rating'] === "") {
        alert("Please enter all values");
        return false;
      } else if (!data['email'].match(emailPattern)) {
        alert("invalid email");
        return false;
      } else {
        return true;
      }
    };

    return AddFeedback;

  })();

}).call(this);

//# sourceMappingURL=addFeedback.js.map
