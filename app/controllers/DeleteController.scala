package controllers

import controllers.Application._
import play.api.mvc.{Controller, Action}
import services.DeleteService
import views.templating.JadeRenderer

/**
  * Created by pgn3317 on 5/1/16.
  */
object DeleteController extends Controller {

  def deleteRenderer = Action {
    val jadeRenderer : JadeRenderer = JadeRenderer("layout/null.jade")
    Ok(jadeRenderer.render("/layout/delete"))
  }

  def delete = Action {
    request => {
      println("Searching ...")
      val searchElement: Seq[String] = request.body.asFormUrlEncoded.get("mydropdown")
      val searchValue = request.body.asFormUrlEncoded.get("input")
      println("params : ", searchValue, searchElement)
      new DeleteService().deleteFeedback(searchElement, searchValue)
      val jadeRenderer: JadeRenderer = JadeRenderer("layout/null.jade")
      Ok(jadeRenderer.render("/layout/delete"))
    }
  }

}
