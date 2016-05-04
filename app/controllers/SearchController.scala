package controllers

import com.fasterxml.jackson.annotation.JsonFormat
import com.marklogic.xcc.ResultSequence
import controllers.Application._
import play.api.libs.json.{Json, JsObject, JsValue, JsString}
import play.api.mvc.{Controller, Action}
import services.SearchService
import utilities.BuildResponseUtility

import views.templating.JadeRenderer
//import net.liftweb.json._
//import net.liftweb.json.JsonAST._

import scala.xml._

/**
  * Created by pgn3317 on 5/1/16.
  */
object SearchController extends  Controller {

  def searchRenderer = Action {
    request => {
      val jadeRenderer: JadeRenderer = JadeRenderer("/layout/null.jade")
      Ok(jadeRenderer.render("/layout/search", "searchResult" -> ""))
    }
  }

  def viewDB = Action {
    val searchService : SearchService = new SearchService()
    val result : String = searchService.veiwDB
    Ok(jadeRenderer.render("/layout/viewDB", "searchResult" -> result.toString))
  }

  def search = Action (parse.tolerantJson){
    request => {
      println("Searching ...")
      val searchKey = request.body.\("searchBy").as[String]
      val searchValue = request.body.\("searchValue").as[String]
      val searchService : SearchService = new SearchService()
      val result : ResultSequence = searchService.search(searchKey, searchValue)
      val buildResponse : BuildResponseUtility = new BuildResponseUtility
      val jsonResult = buildResponse.addResponse(result)
      val jadeRenderer: JadeRenderer = JadeRenderer("/layout/null.jade")
      Ok(Json.toJson(jsonResult))
    }
  }
}
