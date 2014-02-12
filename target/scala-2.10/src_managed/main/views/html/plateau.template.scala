
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
object plateau extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Carte,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String, carte: Carte):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

"""),_display_(Seq[Any](/*3.2*/main(message, "Bienvenue sur LPWars")/*3.39*/ {_display_(Seq[Any](format.raw/*3.41*/("""

<table id="plateau">
   """),_display_(Seq[Any](/*6.5*/for(ligne <- carte.getCarte()) yield /*6.35*/ {_display_(Seq[Any](format.raw/*6.37*/("""
   <tr>
      """),_display_(Seq[Any](/*8.8*/for(cellule <- ligne) yield /*8.29*/{_display_(Seq[Any](format.raw/*8.30*/("""
      """),_display_(Seq[Any](/*9.8*/if(cellule.estVide())/*9.29*/{_display_(Seq[Any](format.raw/*9.30*/("""
      <td></td>
   """)))}/*11.6*/else/*11.11*/{_display_(Seq[Any](format.raw/*11.12*/("""
   <td class=""""),_display_(Seq[Any](/*12.16*/cellule/*12.23*/.getGc().getEquipe())),format.raw/*12.43*/("""">
   <a href=""""),_display_(Seq[Any](/*13.14*/routes/*13.20*/.Application.info(cellule.getGc().geti(),cellule.getGc().getj()))),format.raw/*13.84*/("""">
         <span>"""),_display_(Seq[Any](/*14.17*/cellule/*14.24*/.getGc().getPv())),format.raw/*14.40*/("""</span>
      </a>
   </td>
""")))})),format.raw/*17.2*/("""
""")))})),format.raw/*18.2*/("""
</tr>
""")))})),format.raw/*20.2*/("""
</table>
""")))})))}
    }
    
    def render(message:String,carte:Carte): play.api.templates.HtmlFormat.Appendable = apply(message,carte)
    
    def f:((String,Carte) => play.api.templates.HtmlFormat.Appendable) = (message,carte) => apply(message,carte)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Feb 12 21:15:46 CET 2014
                    SOURCE: /home/jonathan/LPWars/app/views/plateau.scala.html
                    HASH: 9e935f2243f84543abf104f29d35962159e6dbc5
                    MATRIX: 782->1|907->32|944->35|989->72|1028->74|1089->101|1134->131|1173->133|1223->149|1259->170|1297->171|1339->179|1368->200|1406->201|1445->223|1458->228|1497->229|1549->245|1565->252|1607->272|1659->288|1674->294|1760->358|1815->377|1831->384|1869->400|1929->429|1962->431|2001->439
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|45->17|46->18|48->20
                    -- GENERATED --
                */
            