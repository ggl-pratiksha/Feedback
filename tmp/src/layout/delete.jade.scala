/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */
package layout

import _root_.scala.collection.JavaConversions._
import _root_.org.fusesource.scalate.support.TemplateConversions._
import _root_.org.fusesource.scalate.util.Measurements._

object $_scalate_$delete_jade {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    import _root_.org.fusesource.scalate.support.RenderHelper.{sanitize=>$_scalate_$_sanitize, preserve=>$_scalate_$_preserve, indent=>$_scalate_$_indent, smart_sanitize=>$_scalate_$_smart_sanitize, attributes=>$_scalate_$_attributes}
    ;{
      val context: _root_.org.fusesource.scalate.RenderContext = $_scalate_$_context.attribute("context")
      import context._
      
      
      $_scalate_$_context << ( "<html>\n  <head>\n    <title>my jade template</title>\n  </head>\n  <body>\n    <form id=\"deleteForm\" method=\"POST\" action=\"/delete\">\n      <select name=\"mydropdown\">\n        <option value=\"by\">By</option>\n        <option value=\"comment\">Comment</option>\n        <option value=\"date\">Date before</option>\n        <option value=\"fullText\">Full text search</option>\n      </select>\n      <input type=\"text\" name=\"input\"/>\n      <br/>\n      <br/>\n      <input type=\"submit\" value=\"Delete\" style=\"margin-right:100px\"/>\n    </form>\n    <form id=\"back\" method=\"GET\" action=\"/\">\n      <input type=\"submit\" value=\"Back to main page\"/>\n    </form>\n  </body>\n</html>\n" );
    }
  }
}


class $_scalate_$delete_jade extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$delete_jade.$_scalate_$render(context)
}
