// @SOURCE:/Users/pgn3317/codebase/act/conf/routes
// @HASH:58551d148d29d3f86f5cf03004237d0f38f311bf
// @DATE:Tue May 03 13:39:33 IST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:27
// @LINE:25
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {


// @LINE:9
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:21
// @LINE:19
class ReverseDeleteController {


// @LINE:19
def delete(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "delete")
}
                        

// @LINE:21
def deleteRenderer(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "deleteRenderer")
}
                        

}
                          

// @LINE:13
// @LINE:11
class ReverseAddController {


// @LINE:11
def renderAddFeedback(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "renderAddFeedback")
}
                        

// @LINE:13
def addFeedback(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "add")
}
                        

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          

// @LINE:27
// @LINE:17
// @LINE:15
class ReverseSearchController {


// @LINE:27
def viewDB(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "viewDB")
}
                        

// @LINE:17
def search(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "search")
}
                        

// @LINE:15
def searchRenderer(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "searchRenderer")
}
                        

}
                          

// @LINE:25
// @LINE:23
class ReverseUpdateController {


// @LINE:25
def update(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "update")
}
                        

// @LINE:23
def updateRenderer(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "updateRenderer")
}
                        

}
                          
}
                  


// @LINE:27
// @LINE:25
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:9
class ReverseAssets {


// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:21
// @LINE:19
class ReverseDeleteController {


// @LINE:19
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DeleteController.delete",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete"})
      }
   """
)
                        

// @LINE:21
def deleteRenderer : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DeleteController.deleteRenderer",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteRenderer"})
      }
   """
)
                        

}
              

// @LINE:13
// @LINE:11
class ReverseAddController {


// @LINE:11
def renderAddFeedback : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AddController.renderAddFeedback",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "renderAddFeedback"})
      }
   """
)
                        

// @LINE:13
def addFeedback : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AddController.addFeedback",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add"})
      }
   """
)
                        

}
              

// @LINE:6
class ReverseApplication {


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
              

// @LINE:27
// @LINE:17
// @LINE:15
class ReverseSearchController {


// @LINE:27
def viewDB : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SearchController.viewDB",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewDB"})
      }
   """
)
                        

// @LINE:17
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SearchController.search",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        

// @LINE:15
def searchRenderer : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SearchController.searchRenderer",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchRenderer"})
      }
   """
)
                        

}
              

// @LINE:25
// @LINE:23
class ReverseUpdateController {


// @LINE:25
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UpdateController.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "update"})
      }
   """
)
                        

// @LINE:23
def updateRenderer : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UpdateController.updateRenderer",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateRenderer"})
      }
   """
)
                        

}
              
}
        


// @LINE:27
// @LINE:25
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {


// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:21
// @LINE:19
class ReverseDeleteController {


// @LINE:19
def delete(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DeleteController.delete(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DeleteController", "delete", Seq(), "POST", """""", _prefix + """delete""")
)
                      

// @LINE:21
def deleteRenderer(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DeleteController.deleteRenderer(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DeleteController", "deleteRenderer", Seq(), "GET", """""", _prefix + """deleteRenderer""")
)
                      

}
                          

// @LINE:13
// @LINE:11
class ReverseAddController {


// @LINE:11
def renderAddFeedback(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AddController.renderAddFeedback(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AddController", "renderAddFeedback", Seq(), "GET", """""", _prefix + """renderAddFeedback""")
)
                      

// @LINE:13
def addFeedback(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AddController.addFeedback(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AddController", "addFeedback", Seq(), "POST", """""", _prefix + """add""")
)
                      

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:27
// @LINE:17
// @LINE:15
class ReverseSearchController {


// @LINE:27
def viewDB(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SearchController.viewDB(), HandlerDef(this.getClass.getClassLoader, "", "controllers.SearchController", "viewDB", Seq(), "GET", """""", _prefix + """viewDB""")
)
                      

// @LINE:17
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SearchController.search(), HandlerDef(this.getClass.getClassLoader, "", "controllers.SearchController", "search", Seq(), "POST", """""", _prefix + """search""")
)
                      

// @LINE:15
def searchRenderer(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SearchController.searchRenderer(), HandlerDef(this.getClass.getClassLoader, "", "controllers.SearchController", "searchRenderer", Seq(), "GET", """""", _prefix + """searchRenderer""")
)
                      

}
                          

// @LINE:25
// @LINE:23
class ReverseUpdateController {


// @LINE:25
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UpdateController.update(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UpdateController", "update", Seq(), "POST", """""", _prefix + """update""")
)
                      

// @LINE:23
def updateRenderer(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UpdateController.updateRenderer(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UpdateController", "updateRenderer", Seq(), "GET", """""", _prefix + """updateRenderer""")
)
                      

}
                          
}
        
    