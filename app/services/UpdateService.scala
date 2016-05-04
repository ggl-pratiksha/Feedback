package services

import java.net.URI

import com.marklogic.xcc.{ResultSequence, Session, ContentSourceFactory, ContentSource}

/**
  * Created by pgn3317 on 4/29/16.
  */
class UpdateService {

  def updateFeedback(keyElement: String, oldValue: String, newValue : String): Unit = {
    val uri : URI = new URI("xcc://admin:admin@localhost:8050/FeedbackDB")
    val contentSource: ContentSource = ContentSourceFactory.newContentSource(uri)
    val session : Session = contentSource.newSession()
    session.setTransactionMode(Session.TransactionMode.UPDATE)
    var queryParam : String = ""
    val request = session.newAdhocQuery("for $doc in doc() let $result := for $record in $doc//node where $record//" + keyElement + " = \"" + oldValue + "\" return $record//" + keyElement + " let $node := xdmp:node-replace($doc/$result, <" + keyElement + ">" + newValue +"</" + keyElement + ">) return $node")
    println("Request : ", request.getQuery().toString)
    val result: ResultSequence = session.submitRequest(request)
    println("Update query result ", result.asString())
    session.commit()
    session.close()
  }


}