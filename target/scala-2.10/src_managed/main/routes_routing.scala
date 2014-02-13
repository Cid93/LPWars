// @SOURCE:/home/cid/LPWars/conf/routes
// @HASH:af6f83382b0f375d841cb1624f111304128b0011
// @DATE:Thu Feb 13 13:39:19 CET 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_plateau1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jouer"))))
        

// @LINE:8
private[this] lazy val controllers_Application_info2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jouer/informations"))))
        

// @LINE:9
private[this] lazy val controllers_Application_sedeplacer3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jouer/mouvement"))))
        

// @LINE:10
private[this] lazy val controllers_Application_attaquer4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jouer/attaque"))))
        

// @LINE:11
private[this] lazy val controllers_Application_fin5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jouer/findutour"))))
        

// @LINE:14
private[this] lazy val controllers_Assets_at6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jouer""","""controllers.Application.plateau()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jouer/informations""","""controllers.Application.info(i:Integer, j:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jouer/mouvement""","""controllers.Application.sedeplacer(i:Integer, j:Integer, thei:Integer, thej:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jouer/attaque""","""controllers.Application.attaquer()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jouer/findutour""","""controllers.Application.fin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_plateau1(params) => {
   call { 
        invokeHandler(controllers.Application.plateau(), HandlerDef(this, "controllers.Application", "plateau", Nil,"GET", """""", Routes.prefix + """jouer"""))
   }
}
        

// @LINE:8
case controllers_Application_info2(params) => {
   call(params.fromQuery[Integer]("i", None), params.fromQuery[Integer]("j", None)) { (i, j) =>
        invokeHandler(controllers.Application.info(i, j), HandlerDef(this, "controllers.Application", "info", Seq(classOf[Integer], classOf[Integer]),"GET", """""", Routes.prefix + """jouer/informations"""))
   }
}
        

// @LINE:9
case controllers_Application_sedeplacer3(params) => {
   call(params.fromQuery[Integer]("i", None), params.fromQuery[Integer]("j", None), params.fromQuery[Integer]("thei", None), params.fromQuery[Integer]("thej", None)) { (i, j, thei, thej) =>
        invokeHandler(controllers.Application.sedeplacer(i, j, thei, thej), HandlerDef(this, "controllers.Application", "sedeplacer", Seq(classOf[Integer], classOf[Integer], classOf[Integer], classOf[Integer]),"GET", """""", Routes.prefix + """jouer/mouvement"""))
   }
}
        

// @LINE:10
case controllers_Application_attaquer4(params) => {
   call { 
        invokeHandler(controllers.Application.attaquer(), HandlerDef(this, "controllers.Application", "attaquer", Nil,"GET", """""", Routes.prefix + """jouer/attaque"""))
   }
}
        

// @LINE:11
case controllers_Application_fin5(params) => {
   call { 
        invokeHandler(controllers.Application.fin(), HandlerDef(this, "controllers.Application", "fin", Nil,"GET", """""", Routes.prefix + """jouer/findutour"""))
   }
}
        

// @LINE:14
case controllers_Assets_at6(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     