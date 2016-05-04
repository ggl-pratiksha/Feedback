package controllers

import controllers.Application._
import play.api.mvc.{Controller, Action}
import services.UpdateService
import views.templating.JadeRenderer

/**
  * Created by pgn3317 on 5/1/16.
  */
object UpdateController extends Controller {

  def updateRenderer = Action {
    val jadeRenderer : JadeRenderer = JadeRenderer("layout/null.jade")
    Ok(jadeRenderer.render("layout/updateRenderer"))
  }

  def update = Action {
    request => {
      println("Updating...")
      val keyElement: Seq[String] = request.body.asFormUrlEncoded.get("mydropdown")
      val oldValue = request.body.asFormUrlEncoded.get("oldValue")
      val newValue = request.body.asFormUrlEncoded.get("newValue")
      println("keyElement : ", keyElement)
      new UpdateService().updateFeedback(keyElement.toList.head, oldValue.toList.head, newValue.toList.head)
      val jadeRenderer: JadeRenderer = JadeRenderer("layout/null.jade")
      Ok(jadeRenderer.render("layout/updateRenderer"))
    }
  }
}
