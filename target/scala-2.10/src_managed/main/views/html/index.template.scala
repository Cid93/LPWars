
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

"""),_display_(Seq[Any](/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""

    <table>
   		<tr>
   			<td>x</td>
   			<td>x</td>
   			<td>x</td>
   			<td>x</td>
   			<td>x</td>
   		</tr>
   		<tr>
   			<td>x</td>
   			<td>x</td>
   			<td>x</td>
   			<td>x</td>
   			<td>x</td>
   		</tr>
   		<tr>
   			<td>x</td>
   			<td>x</td>
   			<td>x</td>
   			<td>x</td>
   			<td>x</td>
   		</tr>
   		<tr>
   			<td>x</td>
   			<td>x</td>
   			<td>x</td>
   			<td>x</td>
   			<td>x</td>
   		</tr>
   		<tr>
   			<td>x</td>
   			<td>x</td>
   			<td>x</td>
   			<td>x</td>
   			<td>x</td>
   		</tr>
    </table>

""")))})),format.raw/*43.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 11 18:57:13 CET 2014
                    SOURCE: /home/cid/LPWars/app/views/index.scala.html
                    HASH: dbd504283c10b032b71b3dbb4075dcd159f9a04c
                    MATRIX: 774->1|885->18|922->21|943->34|982->36|1572->595
                    LINES: 26->1|29->1|31->3|31->3|31->3|71->43
                    -- GENERATED --
                */
            