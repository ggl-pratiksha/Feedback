package services

import java.net.URI

import com.marklogic.xcc.{Session, ContentSourceFactory, ContentSource}

/**
  * Created by pgn3317 on 4/29/16.
  */
class DeleteService {
  def deleteFeedback(element: Seq[String], value : Seq[String]): Unit = {
    val uri : URI = new URI("xcc://admin:admin@localhost:8050/FeedbackDB")
    val contentSource: ContentSource = ContentSourceFactory.newContentSource(uri)
    val session : Session = contentSource.newSession()
    val request = session.newAdhocQuery("for $doc in doc() let $result := for $record in $doc//node where $record//" + element.toList.head + " = \"" + value.toList.head + "\" return $record let $node := xdmp:node-delete($doc/$result) return $node")
    println("Request : ", request.getQuery.toString)
    //println("Request : ", request.toString)
    val result = session.submitRequest(request)
    println("---------------------------------------------------------------------------------------------------------")
    println(result.asString())
    println("---------------------------------------------------------------------------------------------------------")
    session.close()
  }

}
