/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */
package layout

import _root_.scala.collection.JavaConversions._
import _root_.org.fusesource.scalate.support.TemplateConversions._
import _root_.org.fusesource.scalate.util.Measurements._

object $_scalate_$form_jade {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    import _root_.org.fusesource.scalate.support.RenderHelper.{sanitize=>$_scalate_$_sanitize, preserve=>$_scalate_$_preserve, indent=>$_scalate_$_indent, smart_sanitize=>$_scalate_$_smart_sanitize, attributes=>$_scalate_$_attributes}
    ;{
      val context: _root_.org.fusesource.scalate.RenderContext = $_scalate_$_context.attribute("context")
      import context._
      
      
      $_scalate_$_context << ( "<html>\n  <head>\n    <title>my jade template</title>\n  </head>\n  <body>\n    <form id=\"searchForm\" method=\"DELETE\" action=\"/delete\">\n      <input type=\"submit\" value=\"Delete\"/>\n    </form>\n  </body>\n</html>\n" );
    }
  }
}


class $_scalate_$form_jade extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$form_jade.$_scalate_$render(context)
}
