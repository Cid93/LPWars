
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
def /*2.2*/titre/*2.7*/():play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.13*/(""" 
	Bienvenue sur LPWars
""")))};
Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*4.2*/("""

"""),_display_(Seq[Any](/*6.2*/main(message, titre())/*6.24*/ {_display_(Seq[Any](format.raw/*6.26*/("""

   <a href=""""),_display_(Seq[Any](/*8.14*/routes/*8.20*/.Application.plateau())),format.raw/*8.42*/("""">Jouer</a>

""")))})),format.raw/*10.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 13 11:34:34 CET 2014
                    SOURCE: /home/cid/LPWars/app/views/index.scala.html
                    HASH: f4f161d9586bd64a5ec4df2e507f6788f01d4412
                    MATRIX: 774->1|868->20|880->25|966->31|1030->18|1057->56|1094->59|1124->81|1163->83|1213->98|1227->104|1270->126|1315->140
                    LINES: 26->1|28->2|28->2|30->2|33->1|34->4|36->6|36->6|36->6|38->8|38->8|38->8|40->10
                    -- GENERATED --
                */
            