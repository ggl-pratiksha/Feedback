package controllers

import java.net.URI

import com.marklogic.xcc.{ResultItem, ResultSequence, ContentSourceFactory, ContentSource, Session, Request}

import play.api.mvc._
import services.{UpdateService, DeleteService, AddService, SearchService}
import views.templating.JadeRenderer

object Application extends Controller {

  val jadeRenderer: JadeRenderer = JadeRenderer("/layout/null.jade")
  def index = Action {
    //Ok(views.html.main())
    Ok(jadeRenderer.render("/layout/welcome"))
  }

}

