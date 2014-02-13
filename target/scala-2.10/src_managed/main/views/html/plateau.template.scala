
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
def /*2.2*/titre/*2.7*/(equipe: Gc.Couleur, jour: Integer):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.46*/(""" 
  Au tour de l'équipe <span class=""""),_display_(Seq[Any](/*3.37*/equipe)),format.raw/*3.43*/("""">"""),_display_(Seq[Any](/*3.46*/equipe)),format.raw/*3.52*/("""</span> <span class="pull-right">Jour """),_display_(Seq[Any](/*3.91*/jour)),format.raw/*3.95*/("""</span>
""")))};
Seq[Any](format.raw/*1.57*/("""
"""),format.raw/*4.2*/("""

"""),_display_(Seq[Any](/*6.2*/main(message, titre(carte.getEquipeActuelle(), carte.getCompteur()))/*6.70*/ {_display_(Seq[Any](format.raw/*6.72*/("""

   <table id="plateau" class="col-lg-5">
      """),_display_(Seq[Any](/*9.8*/for(ligne <- carte.getCarte()) yield /*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""
         <tr>
            """),_display_(Seq[Any](/*11.14*/for(cellule <- ligne) yield /*11.35*/{_display_(Seq[Any](format.raw/*11.36*/("""
               """),_display_(Seq[Any](/*12.17*/if(cellule.estVide())/*12.38*/{_display_(Seq[Any](format.raw/*12.39*/("""
                  """),_display_(Seq[Any](/*13.20*/if( i != null 
                        && j != null 
                        && carte.getEquipeActuelle() ==
                           carte.getCase(i, j).getGc().getEquipe()
                        && (
                           Math.abs((cellule.geti() + cellule.getj()) - 
                           (carte.getCase(i, j)
                              .getGc()
                              .geti()
                              + carte.getCase(i, j).getGc().getj()
                           )) <= carte.getCase(i, j).getGc.getPm()))/*23.69*/ {_display_(Seq[Any](format.raw/*23.71*/("""
                     <td>
                        <a href=""""),_display_(Seq[Any](/*25.35*/routes/*25.41*/.Application.sedeplacer(i, j, cellule.geti(), cellule.getj()))),format.raw/*25.102*/(""""></a>
                     </td>
                  """)))}/*27.21*/else/*27.26*/{_display_(Seq[Any](format.raw/*27.27*/("""
                     <td></td>
                  """)))})),format.raw/*29.20*/("""
               """)))}/*30.18*/else/*30.23*/{_display_(Seq[Any](format.raw/*30.24*/("""
               """),_display_(Seq[Any](/*31.17*/if(i == cellule.getGc().geti() && j == cellule.getGc().getj())/*31.79*/ {_display_(Seq[Any](format.raw/*31.81*/("""
                  <td class=""""),_display_(Seq[Any](/*32.31*/cellule/*32.38*/.getGc().getEquipe())),format.raw/*32.58*/("""">
                     <a href=""""),_display_(Seq[Any](/*33.32*/routes/*33.38*/.Application.info(cellule.getGc().geti(),cellule.getGc().getj()))),format.raw/*33.102*/("""" class=" selected">
                        <span>"""),_display_(Seq[Any](/*34.32*/cellule/*34.39*/.getGc().getPv())),format.raw/*34.55*/("""</span>
                     </a>
                  </td>
               """)))}/*37.18*/else/*37.23*/{_display_(Seq[Any](format.raw/*37.24*/("""
                  <td class=""""),_display_(Seq[Any](/*38.31*/cellule/*38.38*/.getGc().getEquipe())),format.raw/*38.58*/("""">
                     <a href=""""),_display_(Seq[Any](/*39.32*/routes/*39.38*/.Application.info(cellule.getGc().geti(),cellule.getGc().getj()))),format.raw/*39.102*/("""">
                        <span>"""),_display_(Seq[Any](/*40.32*/cellule/*40.39*/.getGc().getPv())),format.raw/*40.55*/("""</span>
                     </a>
                  </td>
                  """)))})),format.raw/*43.20*/("""
               """)))})),format.raw/*44.17*/("""
            """)))})),format.raw/*45.14*/("""
         </tr>
      """)))})),format.raw/*47.8*/("""
   </table>
   """),_display_(Seq[Any](/*49.5*/if(i != null && j != null)/*49.31*/{_display_(Seq[Any](format.raw/*49.32*/("""
      <div id="info" class=""""),_display_(Seq[Any](/*50.30*/carte/*50.35*/.getCase(i, j).getGc().getEquipe())),format.raw/*50.69*/(""" col-lg-offset-1 col-lg-6">
         <label>PV :</label> """),_display_(Seq[Any](/*51.31*/carte/*51.36*/.getCase(i, j).getGc().getPv())),format.raw/*51.66*/("""<br/>
         <label>PA :</label> """),_display_(Seq[Any](/*52.31*/carte/*52.36*/.getCase(i, j).getGc().getPa())),format.raw/*52.66*/("""<br/>
         <label>PM :</label> """),_display_(Seq[Any](/*53.31*/carte/*53.36*/.getCase(i, j).getGc().getPm())),format.raw/*53.66*/("""<br/><br/>
         """),_display_(Seq[Any](/*54.11*/if(carte.getEquipeActuelle() ==
               carte.getCase(i, j).getGc().getEquipe())/*55.56*/{_display_(Seq[Any](format.raw/*55.57*/("""
               <div id="action">
                  <a class="btn btn-default" href="">
                     Se d&eacute;placer</a>
                  <a class="btn btn-default" href="">
                     Attaquer
                  </a>
               </div>
         """)))})),format.raw/*63.11*/("""
      </div>
   """)))})),format.raw/*65.5*/("""
""")))})))}
    }
    
    def render(message:String,carte:Carte,i:Integer,j:Integer): play.api.templates.HtmlFormat.Appendable = apply(message,carte,i,j)
    
    def f:((String,Carte,Integer,Integer) => play.api.templates.HtmlFormat.Appendable) = (message,carte,i,j) => apply(message,carte,i,j)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 13 12:14:05 CET 2014
                    SOURCE: /home/cid/LPWars/app/views/plateau.scala.html
                    HASH: fe4dfbe7ea31dcae97737072a14e965463d6d265
                    MATRIX: 798->1|930->58|942->63|1061->102|1134->140|1161->146|1199->149|1226->155|1300->194|1325->198|1373->56|1400->207|1437->210|1513->278|1552->280|1636->330|1681->360|1720->362|1784->390|1821->411|1860->412|1913->429|1943->450|1982->451|2038->471|2585->1009|2625->1011|2722->1072|2737->1078|2821->1139|2893->1193|2906->1198|2945->1199|3028->1250|3064->1268|3077->1273|3116->1274|3169->1291|3240->1353|3280->1355|3347->1386|3363->1393|3405->1413|3475->1447|3490->1453|3577->1517|3665->1569|3681->1576|3719->1592|3812->1667|3825->1672|3864->1673|3931->1704|3947->1711|3989->1731|4059->1765|4074->1771|4161->1835|4231->1869|4247->1876|4285->1892|4394->1969|4443->1986|4489->2000|4543->2023|4595->2040|4630->2066|4669->2067|4735->2097|4749->2102|4805->2136|4899->2194|4913->2199|4965->2229|5037->2265|5051->2270|5103->2300|5175->2336|5189->2341|5241->2371|5298->2392|5394->2479|5433->2480|5736->2751|5785->2769
                    LINES: 26->1|28->2|28->2|30->2|31->3|31->3|31->3|31->3|31->3|31->3|33->1|34->4|36->6|36->6|36->6|39->9|39->9|39->9|41->11|41->11|41->11|42->12|42->12|42->12|43->13|53->23|53->23|55->25|55->25|55->25|57->27|57->27|57->27|59->29|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|62->32|63->33|63->33|63->33|64->34|64->34|64->34|67->37|67->37|67->37|68->38|68->38|68->38|69->39|69->39|69->39|70->40|70->40|70->40|73->43|74->44|75->45|77->47|79->49|79->49|79->49|80->50|80->50|80->50|81->51|81->51|81->51|82->52|82->52|82->52|83->53|83->53|83->53|84->54|85->55|85->55|93->63|95->65
                    -- GENERATED --
                */
            