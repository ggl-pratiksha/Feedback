window.addFeedback = class AddFeedback

	_this = this

	$(document).on 'click', '#addButton', =>
		console.log ("this")
		if(@isDataValid() == true)
			@test()

	$(document).on 'click', '#backButton', =>
		@backToMainPage()

	$(document).on 'click', '#renderAddButton', =>
			@renderAddFeedbackPage()

	@test:=>
		jQuery.ajax({
			type:"POST",
			url:"/add",
			data: @createAddRequestData()
			success: @successCallback,
			contentType: "application/json",
			dataType: "json"
		})

	@createAddRequestData: ->
		console.log "in data"
		data = {}
		data['by'] = document.forms['addForm']['by'].value
		data['topic'] = document.forms['addForm']['topic'].value
		data['email'] = document.forms['addForm']['email'].value
		data['rating'] = document.forms['addForm']['rating'].value
		data['comment'] = document.forms['addForm']['comment'].value
		JSON.stringify(data)

	@successCallback: (responseData) =>
			$("#response").text(responseData.message)

	@backToMainPage: =>
			location.href = '/'

	@renderAddFeedbackPage: =>
			location.href = '/renderAddFeedback'

	@isDataValid: =>
		data = {}
		data['by'] = document.forms['addForm']['by'].value
		data['email'] = document.forms['addForm']['email'].value
		data['topic'] = document.forms['addForm']['topic'].value
		data['rating'] = document.forms['addForm']['rating'].value
		data['comment'] = document.forms['addForm']['comment'].value
		emailPattern = /^([\w.-]+)@([\w.-]+)\.([a-zA-Z.]{2,6})$/i;
		if(data['by']=="" | data['email'] == "" | data['topic'] == "" | data['comment'] == "" | data['rating'] == "")
			alert("Please enter all values")
			false
		else if(!data['email'].match(emailPattern))
			alert("invalid email")
			false
		else
			true
