
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
                        && carte.getCase(i, j).getGc().getPm() != 0 
                        && carte.getEquipeActuelle() ==
                           carte.getCase(i, j).getGc().getEquipe()
                        && (
                           Math.abs((cellule.geti() + cellule.getj()) - 
                           (carte.getCase(i, j)
                              .getGc()
                              .geti()
                              + carte.getCase(i, j).getGc().getj()
                           )) <= carte.getCase(i, j).getGc.getPm()))/*24.69*/ {_display_(Seq[Any](format.raw/*24.71*/("""
                     <td>
                        <a class="move" href=""""),_display_(Seq[Any](/*26.48*/routes/*26.54*/.Application.sedeplacer(i, j, cellule.geti(), cellule.getj()))),format.raw/*26.115*/(""""></a>
                     </td>
                  """)))}/*28.21*/else/*28.26*/{_display_(Seq[Any](format.raw/*28.27*/("""
                     <td></td>
                  """)))})),format.raw/*30.20*/("""
               """)))}/*31.18*/else/*31.23*/{_display_(Seq[Any](format.raw/*31.24*/("""
               """),_display_(Seq[Any](/*32.17*/if(i == cellule.getGc().geti() && j == cellule.getGc().getj())/*32.79*/ {_display_(Seq[Any](format.raw/*32.81*/("""
                  <td class=""""),_display_(Seq[Any](/*33.31*/cellule/*33.38*/.getGc().getEquipe())),format.raw/*33.58*/("""">
                     <a href=""""),_display_(Seq[Any](/*34.32*/routes/*34.38*/.Application.info(cellule.getGc().geti(),cellule.getGc().getj()))),format.raw/*34.102*/("""" class=" selected">
                        <span>"""),_display_(Seq[Any](/*35.32*/cellule/*35.39*/.getGc().getPv())),format.raw/*35.55*/("""</span>
                     </a>
                  </td>
               """)))}/*38.18*/else/*38.23*/{_display_(Seq[Any](format.raw/*38.24*/("""
                  <td class=""""),_display_(Seq[Any](/*39.31*/cellule/*39.38*/.getGc().getEquipe())),format.raw/*39.58*/("""">
                     <a href=""""),_display_(Seq[Any](/*40.32*/routes/*40.38*/.Application.info(cellule.getGc().geti(),cellule.getGc().getj()))),format.raw/*40.102*/("""">
                        <span>"""),_display_(Seq[Any](/*41.32*/cellule/*41.39*/.getGc().getPv())),format.raw/*41.55*/("""</span>
                     </a>
                  </td>
                  """)))})),format.raw/*44.20*/("""
               """)))})),format.raw/*45.17*/("""
            """)))})),format.raw/*46.14*/("""
         </tr>
      """)))})),format.raw/*48.8*/("""
   </table>
   """),_display_(Seq[Any](/*50.5*/if(i != null && j != null)/*50.31*/{_display_(Seq[Any](format.raw/*50.32*/("""
      <div id="info" class=""""),_display_(Seq[Any](/*51.30*/carte/*51.35*/.getCase(i, j).getGc().getEquipe())),format.raw/*51.69*/(""" col-lg-offset-1 col-lg-6">
         <label>PV :</label> """),_display_(Seq[Any](/*52.31*/carte/*52.36*/.getCase(i, j).getGc().getPv())),format.raw/*52.66*/("""<br/>
         <label>PA :</label> """),_display_(Seq[Any](/*53.31*/carte/*53.36*/.getCase(i, j).getGc().getPa())),format.raw/*53.66*/("""<br/>
         <label>PM :</label> """),_display_(Seq[Any](/*54.31*/carte/*54.36*/.getCase(i, j).getGc().getPm())),format.raw/*54.66*/("""<br/><br/>
         """),_display_(Seq[Any](/*55.11*/if(carte.getEquipeActuelle() ==
               carte.getCase(i, j).getGc().getEquipe())/*56.56*/{_display_(Seq[Any](format.raw/*56.57*/("""
               <div id="action">
                  <a class="btn btn-default" href=""""),_display_(Seq[Any](/*58.53*/routes/*58.59*/.Application.fin())),format.raw/*58.77*/("""">
                     Fin de tour</a>
                  <a class="btn btn-default" href="">
                     Attaquer
                  </a>
               </div>
         """)))})),format.raw/*64.11*/("""
      </div>
   """)))})),format.raw/*66.5*/("""
""")))})))}
    }
    
    def render(message:String,carte:Carte,i:Integer,j:Integer): play.api.templates.HtmlFormat.Appendable = apply(message,carte,i,j)
    
    def f:((String,Carte,Integer,Integer) => play.api.templates.HtmlFormat.Appendable) = (message,carte,i,j) => apply(message,carte,i,j)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 13 13:09:41 CET 2014
                    SOURCE: /home/jonathan/LPWars/app/views/plateau.scala.html
                    HASH: ebef9c0b0a2fb05794979d8b2f5b57756d6f1625
                    MATRIX: 798->1|930->58|942->63|1061->102|1134->140|1161->146|1199->149|1226->155|1300->194|1325->198|1373->56|1400->207|1437->210|1513->278|1552->280|1636->330|1681->360|1720->362|1784->390|1821->411|1860->412|1913->429|1943->450|1982->451|2038->471|2654->1078|2694->1080|2804->1154|2819->1160|2903->1221|2975->1275|2988->1280|3027->1281|3110->1332|3146->1350|3159->1355|3198->1356|3251->1373|3322->1435|3362->1437|3429->1468|3445->1475|3487->1495|3557->1529|3572->1535|3659->1599|3747->1651|3763->1658|3801->1674|3894->1749|3907->1754|3946->1755|4013->1786|4029->1793|4071->1813|4141->1847|4156->1853|4243->1917|4313->1951|4329->1958|4367->1974|4476->2051|4525->2068|4571->2082|4625->2105|4677->2122|4712->2148|4751->2149|4817->2179|4831->2184|4887->2218|4981->2276|4995->2281|5047->2311|5119->2347|5133->2352|5185->2382|5257->2418|5271->2423|5323->2453|5380->2474|5476->2561|5515->2562|5637->2648|5652->2654|5692->2672|5903->2851|5952->2869
                    LINES: 26->1|28->2|28->2|30->2|31->3|31->3|31->3|31->3|31->3|31->3|33->1|34->4|36->6|36->6|36->6|39->9|39->9|39->9|41->11|41->11|41->11|42->12|42->12|42->12|43->13|54->24|54->24|56->26|56->26|56->26|58->28|58->28|58->28|60->30|61->31|61->31|61->31|62->32|62->32|62->32|63->33|63->33|63->33|64->34|64->34|64->34|65->35|65->35|65->35|68->38|68->38|68->38|69->39|69->39|69->39|70->40|70->40|70->40|71->41|71->41|71->41|74->44|75->45|76->46|78->48|80->50|80->50|80->50|81->51|81->51|81->51|82->52|82->52|82->52|83->53|83->53|83->53|84->54|84->54|84->54|85->55|86->56|86->56|88->58|88->58|88->58|94->64|96->66
                    -- GENERATED --
                */
            