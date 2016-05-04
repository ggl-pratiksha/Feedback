package services

import java.net.URI

import com.marklogic.xcc._
import play.api.libs.json.Json

import scala.collection.mutable.ArrayBuffer
import scala.xml.{XML, Elem}

class SearchService {

  def search(searchKey: String, searchValue : String): ResultSequence = {
    val uri : URI = new URI("xcc://admin:admin@localhost:8050/FeedbackDB")
    val contentSource: ContentSource = ContentSourceFactory.newContentSource(uri)
    val session : Session = contentSource.newSession()
    var query : String = "-"
    searchKey match {
      case "by" => query = "cts:search(//node, cts:element-value-query(xs:QName(\"" + searchKey + "\"), \"" + searchValue + "\"))"
      case "comment" => query = "cts:search(//node, cts:element-query(xs:QName(\"" + searchKey + "\"), \"" + searchValue + "\"))"
      case "topic" => query = "cts:search(//node, cts:element-query(xs:QName(\"" + searchKey + "\"), \"" + searchValue + "\"))"
      case "fullText" => query = "cts:search(//node,cts:word-query(\"" + searchValue + "\"))"
      case default => query = ""
    }
    val request = session.newAdhocQuery(query)
    println("Request : ", request.getQuery.toString)
    val result: ResultSequence = session.submitRequest(request)
    println("Query result in search service :" , result.asString())

    session.close()
    return result
  }

  def veiwDB : String = {
    val uri : URI = new URI("xcc://admin:admin@localhost:8050/FeedbackDB")
    val contentSource: ContentSource = ContentSourceFactory.newContentSource(uri)
    val session : Session = contentSource.newSession()
    val request = session.newAdhocQuery("doc()")
    val result = session.submitRequest(request)
    return result.asString()
  }

}