package utilities

import com.marklogic.xcc.ResultSequence
import play.api.libs.json._

import scala.collection.mutable.ListBuffer
import scala.xml.{Elem, XML}

/**
  * Created by pgn3317 on 5/3/16.
  */
class BuildResponseUtility {

  def addResponse(resultSequence: ResultSequence) : JsValue = {
    var list = new ListBuffer[JsObject]()
    var result : Seq[(String, JsString)] = Nil
    while(resultSequence.hasNext) {
      val resultItem = resultSequence.next()
      val resultItemString = resultItem.asString()
      val smlElement: Elem = XML.loadString(resultItemString)
      result = for(n <-smlElement.child) yield (n.label, JsString(n.text))
      println("result : ", result)
      val jsObject : JsObject = JsObject(result)
      println("jsObject : ", jsObject)
      list += jsObject
      println("list : ", list)
    }

    val json : JsValue = Json.obj("result" -> list)
    println("Json : ", json)
    return json
  }
}
