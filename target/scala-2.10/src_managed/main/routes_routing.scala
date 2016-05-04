// @SOURCE:/Users/pgn3317/codebase/act/conf/routes
// @HASH:58551d148d29d3f86f5cf03004237d0f38f311bf
// @DATE:Tue May 03 13:39:33 IST 2016


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

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
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at1_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:11
private[this] lazy val controllers_AddController_renderAddFeedback2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("renderAddFeedback"))))
private[this] lazy val controllers_AddController_renderAddFeedback2_invoker = createInvoker(
controllers.AddController.renderAddFeedback,
HandlerDef(this.getClass.getClassLoader, "", "controllers.AddController", "renderAddFeedback", Nil,"GET", """""", Routes.prefix + """renderAddFeedback"""))
        

// @LINE:13
private[this] lazy val controllers_AddController_addFeedback3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add"))))
private[this] lazy val controllers_AddController_addFeedback3_invoker = createInvoker(
controllers.AddController.addFeedback,
HandlerDef(this.getClass.getClassLoader, "", "controllers.AddController", "addFeedback", Nil,"POST", """""", Routes.prefix + """add"""))
        

// @LINE:15
private[this] lazy val controllers_SearchController_searchRenderer4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchRenderer"))))
private[this] lazy val controllers_SearchController_searchRenderer4_invoker = createInvoker(
controllers.SearchController.searchRenderer,
HandlerDef(this.getClass.getClassLoader, "", "controllers.SearchController", "searchRenderer", Nil,"GET", """""", Routes.prefix + """searchRenderer"""))
        

// @LINE:17
private[this] lazy val controllers_SearchController_search5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
private[this] lazy val controllers_SearchController_search5_invoker = createInvoker(
controllers.SearchController.search,
HandlerDef(this.getClass.getClassLoader, "", "controllers.SearchController", "search", Nil,"POST", """""", Routes.prefix + """search"""))
        

// @LINE:19
private[this] lazy val controllers_DeleteController_delete6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete"))))
private[this] lazy val controllers_DeleteController_delete6_invoker = createInvoker(
controllers.DeleteController.delete,
HandlerDef(this.getClass.getClassLoader, "", "controllers.DeleteController", "delete", Nil,"POST", """""", Routes.prefix + """delete"""))
        

// @LINE:21
private[this] lazy val controllers_DeleteController_deleteRenderer7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteRenderer"))))
private[this] lazy val controllers_DeleteController_deleteRenderer7_invoker = createInvoker(
controllers.DeleteController.deleteRenderer,
HandlerDef(this.getClass.getClassLoader, "", "controllers.DeleteController", "deleteRenderer", Nil,"GET", """""", Routes.prefix + """deleteRenderer"""))
        

// @LINE:23
private[this] lazy val controllers_UpdateController_updateRenderer8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateRenderer"))))
private[this] lazy val controllers_UpdateController_updateRenderer8_invoker = createInvoker(
controllers.UpdateController.updateRenderer,
HandlerDef(this.getClass.getClassLoader, "", "controllers.UpdateController", "updateRenderer", Nil,"GET", """""", Routes.prefix + """updateRenderer"""))
        

// @LINE:25
private[this] lazy val controllers_UpdateController_update9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("update"))))
private[this] lazy val controllers_UpdateController_update9_invoker = createInvoker(
controllers.UpdateController.update,
HandlerDef(this.getClass.getClassLoader, "", "controllers.UpdateController", "update", Nil,"POST", """""", Routes.prefix + """update"""))
        

// @LINE:27
private[this] lazy val controllers_SearchController_viewDB10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("viewDB"))))
private[this] lazy val controllers_SearchController_viewDB10_invoker = createInvoker(
controllers.SearchController.viewDB,
HandlerDef(this.getClass.getClassLoader, "", "controllers.SearchController", "viewDB", Nil,"GET", """""", Routes.prefix + """viewDB"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """renderAddFeedback""","""controllers.AddController.renderAddFeedback"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add""","""controllers.AddController.addFeedback"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchRenderer""","""controllers.SearchController.searchRenderer"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.SearchController.search"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete""","""controllers.DeleteController.delete"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteRenderer""","""controllers.DeleteController.deleteRenderer"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateRenderer""","""controllers.UpdateController.updateRenderer"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """update""","""controllers.UpdateController.update"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """viewDB""","""controllers.SearchController.viewDB""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:9
case controllers_Assets_at1_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at1_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:11
case controllers_AddController_renderAddFeedback2_route(params) => {
   call { 
        controllers_AddController_renderAddFeedback2_invoker.call(controllers.AddController.renderAddFeedback)
   }
}
        

// @LINE:13
case controllers_AddController_addFeedback3_route(params) => {
   call { 
        controllers_AddController_addFeedback3_invoker.call(controllers.AddController.addFeedback)
   }
}
        

// @LINE:15
case controllers_SearchController_searchRenderer4_route(params) => {
   call { 
        controllers_SearchController_searchRenderer4_invoker.call(controllers.SearchController.searchRenderer)
   }
}
        

// @LINE:17
case controllers_SearchController_search5_route(params) => {
   call { 
        controllers_SearchController_search5_invoker.call(controllers.SearchController.search)
   }
}
        

// @LINE:19
case controllers_DeleteController_delete6_route(params) => {
   call { 
        controllers_DeleteController_delete6_invoker.call(controllers.DeleteController.delete)
   }
}
        

// @LINE:21
case controllers_DeleteController_deleteRenderer7_route(params) => {
   call { 
        controllers_DeleteController_deleteRenderer7_invoker.call(controllers.DeleteController.deleteRenderer)
   }
}
        

// @LINE:23
case controllers_UpdateController_updateRenderer8_route(params) => {
   call { 
        controllers_UpdateController_updateRenderer8_invoker.call(controllers.UpdateController.updateRenderer)
   }
}
        

// @LINE:25
case controllers_UpdateController_update9_route(params) => {
   call { 
        controllers_UpdateController_update9_invoker.call(controllers.UpdateController.update)
   }
}
        

// @LINE:27
case controllers_SearchController_viewDB10_route(params) => {
   call { 
        controllers_SearchController_viewDB10_invoker.call(controllers.SearchController.viewDB)
   }
}
        
}

}
     