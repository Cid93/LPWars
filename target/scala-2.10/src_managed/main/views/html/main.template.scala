
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Html,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, titre: Html)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.45*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*8.103*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/style.css"))),format.raw/*10.95*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*12.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*13.71*/("""" type="text/javascript"></script>
    </head>
    <body>
    <nav class="navbar navbar-default" role="navigation">
    	<h1 class="container">"""),_display_(Seq[Any](/*17.29*/titre)),format.raw/*17.34*/("""</h1>
        </nav>
        <div class="container">
        <div class="row">
        """),_display_(Seq[Any](/*21.10*/content)),format.raw/*21.17*/("""
        </div>
        </div>
    </body>
</html>
"""))}
    }
    
    def render(title:String,titre:Html,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,titre)(content)
    
    def f:((String,Html) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,titre) => (content) => apply(title,titre)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 13 13:39:25 CET 2014
                    SOURCE: /home/cid/LPWars/app/views/main.scala.html
                    HASH: 52adbe7b4540e49cc9c582d0afd7f3e0784ae3b4
                    MATRIX: 783->1|920->44|1008->97|1034->102|1131->164|1145->170|1210->213|1301->269|1315->275|1370->309|1462->365|1477->371|1534->406|1631->467|1646->473|1700->505|1761->530|1776->536|1843->581|1936->638|1951->644|2015->686|2195->830|2222->835|2346->923|2375->930
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|45->17|45->17|49->21|49->21
                    -- GENERATED --
                */
            