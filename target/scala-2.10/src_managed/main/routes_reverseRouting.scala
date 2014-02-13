// @SOURCE:/home/cid/LPWars/conf/routes
// @HASH:e270d43e78600036e21984b627c52f1f7ef7c522
// @DATE:Thu Feb 13 11:50:05 CET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def sedeplacer(i:Integer, j:Integer, thei:Integer, thej:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "jouer/mouvement" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("i", i)), Some(implicitly[QueryStringBindable[Integer]].unbind("j", j)), Some(implicitly[QueryStringBindable[Integer]].unbind("thei", thei)), Some(implicitly[QueryStringBindable[Integer]].unbind("thej", thej)))))
}
                                                

// @LINE:7
def plateau(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "jouer")
}
                                                

// @LINE:8
def info(i:Integer, j:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "jouer/informations" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("i", i)), Some(implicitly[QueryStringBindable[Integer]].unbind("j", j)))))
}
                                                

// @LINE:10
def attaquer(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "jouer/attaque")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def sedeplacer : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.sedeplacer",
   """
      function(i,j,thei,thej) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jouer/mouvement" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("i", i), (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("j", j), (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("thei", thei), (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("thej", thej)])})
      }
   """
)
                        

// @LINE:7
def plateau : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.plateau",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jouer"})
      }
   """
)
                        

// @LINE:8
def info : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.info",
   """
      function(i,j) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jouer/informations" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("i", i), (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("j", j)])})
      }
   """
)
                        

// @LINE:10
def attaquer : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.attaquer",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jouer/attaque"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def sedeplacer(i:Integer, j:Integer, thei:Integer, thej:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.sedeplacer(i, j, thei, thej), HandlerDef(this, "controllers.Application", "sedeplacer", Seq(classOf[Integer], classOf[Integer], classOf[Integer], classOf[Integer]), "GET", """""", _prefix + """jouer/mouvement""")
)
                      

// @LINE:7
def plateau(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.plateau(), HandlerDef(this, "controllers.Application", "plateau", Seq(), "GET", """""", _prefix + """jouer""")
)
                      

// @LINE:8
def info(i:Integer, j:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.info(i, j), HandlerDef(this, "controllers.Application", "info", Seq(classOf[Integer], classOf[Integer]), "GET", """""", _prefix + """jouer/informations""")
)
                      

// @LINE:10
def attaquer(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.attaquer(), HandlerDef(this, "controllers.Application", "attaquer", Seq(), "GET", """""", _prefix + """jouer/attaque""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    