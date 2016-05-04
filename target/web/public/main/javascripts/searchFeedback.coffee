window.searchFeedback = class SearchFeedback

	_this = this
 	
 	constructor: ->
        @searchResult = {"nothing yet"}

	$(document).on 'click', '#searchButton', =>
		console.log ("this")
		@search()

	$(document).on 'click', '#backButton', =>
		@backToMainPage()

	@search:=>
		jQuery.ajax({
			type:"POST",
			url:"/search",
			data: @createSearchRequestData()
			success: @successCallback,
			contentType: "application/json",
			dataType: "json"
		})

	@createSearchRequestData: ->
		console.log "in data"
		data = {}
		data['searchBy'] = document.forms['searchForm']['mydropdown'].value
		data['searchValue'] = document.forms['searchForm']['input'].value
		JSON.stringify(data)

	@successCallback: (responseData) =>
			console.log("response data : ")
			console.log(responseData)
			searchResult = responseData
			console.log("search result : ", searchResult)
			$("#response").text(searchResult.result[0])

	@backToMainPage: =>
			location.href = '/'

	@renderAddFeedbackPage: =>
			location.href = '/renderAddFeedback'


