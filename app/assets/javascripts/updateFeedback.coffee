window.updateFeedback = class UpdateFeedback

	_this = this

	$(document).on 'click', '#updateButton', =>
		console.log ("this")
		@update()

	$(document).on 'click', '#backButton', =>
		@backToMainPage()

	@update:=>
		jQuery.ajax({
			type:"POST",
			url:"/update",
			data: @createUpdateRequestData()
			success: @successCallback,
			contentType: "application/json",
			dataType: "json"
	})

	@createUpdateRequestData: ->
		console.log "in data"
		data = {}
		data['oldValue'] = document.forms['updateForm']['oldValue'].value
		data['newValue'] = document.forms['updateForm']['newValue'].value
		data['keyElement'] = document.forms['updateForm']['mydropdown'].value
		JSON.stringify(data)

	@successCallback: (responseData) =>
		console.log("response data : ", responseData)
		$("#response").text(responseData.message)

	@backToMainPage: =>
		location.href = '/'