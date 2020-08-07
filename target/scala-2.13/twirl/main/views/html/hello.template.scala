
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),_display_(/*2.2*/main("Hello")/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
"""),format.raw/*3.1*/("""<section id="content">
    <div class="wrapper doc">
        <article>
            <h1>Hello """),_display_(/*6.24*/name),format.raw/*6.28*/("""!</h1>
        </article>
        <aside>
            """),_display_(/*9.14*/commonSidebar()),format.raw/*9.29*/("""
        """),format.raw/*10.9*/("""</aside>
    </div>
</section>
""")))}))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-08-07T16:27:25.268
                  SOURCE: C:/Users/julieslu/Documents/Nueva carpeta/play-samples-play-scala-hello-world-tutorial/app/views/hello.scala.html
                  HASH: db18cca946a0dc6568b8c2548829d8910bafa3e9
                  MATRIX: 729->1|838->15|866->18|887->31|926->33|954->35|1077->132|1101->136|1185->194|1220->209|1257->219
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|31->6|31->6|34->9|34->9|35->10
                  -- GENERATED --
              */
          