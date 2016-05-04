(function() {
  var SearchFeedback;

  window.searchFeedback = SearchFeedback = (function() {
    var _this;

    function SearchFeedback() {}

    _this = SearchFeedback({
      constructor: function() {
        return this.searchResult = {
          "nothing yet": "nothing yet"
        };
      }
    });

    $(document).on('click', '#searchButton', function() {
      console.log("this");
      return SearchFeedback.search();
    });

    $(document).on('click', '#backButton', function() {
      return SearchFeedback.backToMainPage();
    });

    SearchFeedback.search = function() {
      return jQuery.ajax({
        type: "POST",
        url: "/search",
        data: SearchFeedback.createSearchRequestData(),
        success: SearchFeedback.successCallback,
        contentType: "application/json",
        dataType: "json"
      });
    };

    SearchFeedback.createSearchRequestData = function() {
      var data;
      console.log("in data");
      data = {};
      data['searchBy'] = document.forms['searchForm']['mydropdown'].value;
      data['searchValue'] = document.forms['searchForm']['input'].value;
      return JSON.stringify(data);
    };

    SearchFeedback.successCallback = function(responseData) {
      var searchResult;
      console.log("response data : ");
      console.log(responseData);
      searchResult = responseData;
      console.log("search result : ", searchResult);
      return $("#response").text(searchResult.result[0]);
    };

    SearchFeedback.backToMainPage = function() {
      return location.href = '/';
    };

    SearchFeedback.renderAddFeedbackPage = function() {
      return location.href = '/renderAddFeedback';
    };

    return SearchFeedback;

  })();

}).call(this);

//# sourceMappingURL=searchFeedback.js.map
