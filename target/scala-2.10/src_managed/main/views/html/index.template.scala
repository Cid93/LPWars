
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main(message, "Bienvenue sur LPWars")/*3.39*/ {_display_(Seq[Any](format.raw/*3.41*/("""

   <a href=""""),_display_(Seq[Any](/*5.14*/routes/*5.20*/.Application.plateau())),format.raw/*5.42*/("""">Jouer</a>

""")))})),format.raw/*7.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Feb 12 18:36:04 CET 2014
                    SOURCE: /home/cid/LPWars/app/views/index.scala.html
                    HASH: ce8b130a449c9329ada1161af98307de34652acb
                    MATRIX: 774->1|885->18|922->21|967->58|1006->60|1056->75|1070->81|1113->103|1157->117
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|35->7
                    -- GENERATED --
                */
            