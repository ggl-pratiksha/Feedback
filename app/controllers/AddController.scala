package controllers

import play.api.libs.json.{Json, JsValue}
import play.api.mvc.{Controller, Action}
import services.AddService
import views.templating.JadeRenderer

/**
  * Created by pgn3317 on 5/1/16.
  */
object AddController extends Controller {

  def renderAddFeedback = Action {
    val jadeRenderer: JadeRenderer = JadeRenderer("/layout/null.jade")
    Ok(jadeRenderer.render("/layout/addFeedback"))
  }

  def addFeedback = Action(parse.tolerantJson) {
    request => {
      println("Add")
      val params: JsValue = request.body
      new AddService().addFeedback(params)
      val rawJson = """{"message": "Record got added successfully"}"""
      val jsonResult : JsValue = Json.parse(rawJson)
      println("jsonresult : ", jsonResult)
      Ok(jsonResult)
    }
  }

}
