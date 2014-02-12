
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
         """),_display_(Seq[Any](/*8.11*/for(cellule <- ligne) yield /*8.32*/{_display_(Seq[Any](format.raw/*8.33*/("""
            """),_display_(Seq[Any](/*9.14*/if(cellule.estVide())/*9.35*/{_display_(Seq[Any](format.raw/*9.36*/("""
               <td></td>
            """)))}/*11.15*/else/*11.20*/{_display_(Seq[Any](format.raw/*11.21*/("""
               <td class=""""),_display_(Seq[Any](/*12.28*/cellule/*12.35*/.getGc().getEquipe())),format.raw/*12.55*/("""">"""),_display_(Seq[Any](/*12.58*/cellule/*12.65*/.getGc().getPv())),format.raw/*12.81*/("""</td>
            """)))})),format.raw/*13.14*/("""
         """)))})),format.raw/*14.11*/("""
      </tr>
   """)))})),format.raw/*16.5*/("""
    </table>
""")))})))}
    }
    
    def render(message:String,carte:Carte): play.api.templates.HtmlFormat.Appendable = apply(message,carte)
    
    def f:((String,Carte) => play.api.templates.HtmlFormat.Appendable) = (message,carte) => apply(message,carte)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Feb 12 20:35:22 CET 2014
                    SOURCE: /home/jonathan/LPWars/app/views/plateau.scala.html
                    HASH: 3bc75e5df75e60dd881b683c9e15a24087547fb5
                    MATRIX: 782->1|907->32|944->35|989->72|1028->74|1092->104|1137->134|1176->136|1233->158|1269->179|1307->180|1356->194|1385->215|1423->216|1481->256|1494->261|1533->262|1597->290|1613->297|1655->317|1694->320|1710->327|1748->343|1799->362|1842->373|1890->390
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|39->11|39->11|39->11|40->12|40->12|40->12|40->12|40->12|40->12|41->13|42->14|44->16
                    -- GENERATED --
                */
            