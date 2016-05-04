
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>

<html>
<head>
    <title>Just Play Scala</title>
</head>
<body>
<h1>Just Play Scala</h1>
</body>
</html>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue May 03 13:22:02 IST 2016
                  SOURCE: /Users/pgn3317/codebase/act/app/views/main.scala.html
                  HASH: 9e4c5794ef31202d6a2b65af7d077d94de8c6b98
                  MATRIX: 579->0
                  LINES: 22->1
                  -- GENERATED --
              */
          