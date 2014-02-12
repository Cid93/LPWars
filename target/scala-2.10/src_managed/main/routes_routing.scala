// @SOURCE:/home/jonathan/LPWars/conf/routes
// @HASH:e231bc1581c7fb779c3c79e94f964417b7560e22
// @DATE:Wed Feb 12 20:57:36 CET 2014


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
        

// @LINE:12
private[this] lazy val controllers_Assets_at3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jouer""","""controllers.Application.plateau()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jouer/informations""","""controllers.Application.info(i:Integer, j:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:12
case controllers_Assets_at3(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     