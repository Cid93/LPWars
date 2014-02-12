
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
object plateau extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Carte,Integer,Integer,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String, carte: Carte, i: Integer, j: Integer):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.57*/("""

"""),_display_(Seq[Any](/*3.2*/main(message, "Bienvenue sur LPWars")/*3.39*/ {_display_(Seq[Any](format.raw/*3.41*/("""

   <table id="plateau">
      """),_display_(Seq[Any](/*6.8*/for(ligne <- carte.getCarte()) yield /*6.38*/ {_display_(Seq[Any](format.raw/*6.40*/("""
         <tr>
            """),_display_(Seq[Any](/*8.14*/for(cellule <- ligne) yield /*8.35*/{_display_(Seq[Any](format.raw/*8.36*/("""
               """),_display_(Seq[Any](/*9.17*/if(cellule.estVide())/*9.38*/{_display_(Seq[Any](format.raw/*9.39*/("""
                  <td></td>
               """)))}/*11.18*/else/*11.23*/{_display_(Seq[Any](format.raw/*11.24*/("""
                  <td class=""""),_display_(Seq[Any](/*12.31*/cellule/*12.38*/.getGc().getEquipe())),format.raw/*12.58*/("""">
                  <a href=""""),_display_(Seq[Any](/*13.29*/routes/*13.35*/.Application.info(cellule.getGc().geti(),cellule.getGc().getj()))),format.raw/*13.99*/("""">
                        <span>"""),_display_(Seq[Any](/*14.32*/cellule/*14.39*/.getGc().getPv())),format.raw/*14.55*/("""</span>
                     </a>
                  </td>
               """)))})),format.raw/*17.17*/("""
            """)))})),format.raw/*18.14*/("""
         </tr>
      """)))})),format.raw/*20.8*/("""
   </table>
   """),_display_(Seq[Any](/*22.5*/if(i != null && j != null)/*22.31*/{_display_(Seq[Any](format.raw/*22.32*/("""
      <div id="info" class=""""),_display_(Seq[Any](/*23.30*/carte/*23.35*/.getCase(i, j).getGc().getEquipe())),format.raw/*23.69*/("""">
         <label>PV</label> """),_display_(Seq[Any](/*24.29*/carte/*24.34*/.getCase(i, j).getGc().getPv())),format.raw/*24.64*/("""<br/>
         <label>PA</label> """),_display_(Seq[Any](/*25.29*/carte/*25.34*/.getCase(i, j).getGc().getPa())),format.raw/*25.64*/("""<br/>
         <label>PM</label> """),_display_(Seq[Any](/*26.29*/carte/*26.34*/.getCase(i, j).getGc().getPm())),format.raw/*26.64*/("""
         """),_display_(Seq[Any](/*27.11*/if(carte.getEquipeActuelle() ==
               carte.getCase(i, j).getGc().getEquipe())/*28.56*/{_display_(Seq[Any](format.raw/*28.57*/("""
               <div id="action">
                  <a href=""""),_display_(Seq[Any](/*30.29*/routes/*30.35*/.Application.sedeplacer())),format.raw/*30.60*/("""">
                     Se d&eacute;placer</a>
                  <a href=""""),_display_(Seq[Any](/*32.29*/routes/*32.35*/.Application.attaquer())),format.raw/*32.58*/("""">
                     Attaquer
                  </a>
               </div>
         """)))})),format.raw/*36.11*/("""
      </div>
   """)))})),format.raw/*38.5*/("""
""")))})))}
    }
    
    def render(message:String,carte:Carte,i:Integer,j:Integer): play.api.templates.HtmlFormat.Appendable = apply(message,carte,i,j)
    
    def f:((String,Carte,Integer,Integer) => play.api.templates.HtmlFormat.Appendable) = (message,carte,i,j) => apply(message,carte,i,j)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Feb 12 23:37:06 CET 2014
                    SOURCE: /home/cid/LPWars/app/views/plateau.scala.html
                    HASH: 910b410257c521a845bdaa74dde5752e4e2ab814
                    MATRIX: 798->1|947->56|984->59|1029->96|1068->98|1135->131|1180->161|1219->163|1282->191|1318->212|1356->213|1408->230|1437->251|1475->252|1539->298|1552->303|1591->304|1658->335|1674->342|1716->362|1783->393|1798->399|1884->463|1954->497|1970->504|2008->520|2114->594|2160->608|2214->631|2266->648|2301->674|2340->675|2406->705|2420->710|2476->744|2543->775|2557->780|2609->810|2679->844|2693->849|2745->879|2815->913|2829->918|2881->948|2928->959|3024->1046|3063->1047|3161->1109|3176->1115|3223->1140|3334->1215|3349->1221|3394->1244|3514->1332|3563->1350
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|45->17|46->18|48->20|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|56->28|56->28|58->30|58->30|58->30|60->32|60->32|60->32|64->36|66->38
                    -- GENERATED --
                */
            