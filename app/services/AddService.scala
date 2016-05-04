package services

import java.net.{URI}

import com.marklogic.xcc._
import play.api.libs.json.JsValue

/**
  * Created by pgn3317 on 4/26/16.
  */
class AddService {

  def addFeedback(params : JsValue): Boolean = {
    val uri : URI = new URI("xcc://admin:admin@localhost:8050/FeedbackDB")
    val contentSource: ContentSource = ContentSourceFactory.newContentSource(uri)
    val session : Session = contentSource.newSession()
    session.setTransactionMode(Session.TransactionMode.UPDATE)
    val request = session.newAdhocQuery("xdmp:node-insert-child(doc(\"/docs/Reebok.xml\")//root, <node><by>"+params.\("by").as[String] + "</by><email>"+params.\("email").as[String] + "</email><topic>" + params.\("topic").as[String] +"</topic><comment>"+params.\("comment").as[String] +"</comment><rating>" + params.\("rating").as[String] + "</rating></node>)")
    println("Insert query : ", request.getQuery.toString)
    session.submitRequest(request)
    session.commit()
    session.close()
    return true
  }

}

//for ((key, value) <- paramVal) queryParam = queryParam + "<" + key + ">" + value.mkString + "</" + key + ">"
//println("by : ", params.\("by").as[String])
//val adhocQueryString : String = String.format("xdmp:document-insert('/docs/Reebok.xml', <Reebok><shoes><id>1001<feedback><by><ABC></by><comment>Good</comment></feedback></id></shoes>)")
//val request = session.newAdhocQuery("xdmp:node-insert-child(doc(\"/docs/Reebok.xml\")//root, <node>" + queryParam + "</node>)")