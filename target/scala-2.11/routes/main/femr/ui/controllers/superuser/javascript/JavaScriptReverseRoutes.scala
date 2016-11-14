
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/conf/routes
// @DATE:Wed Nov 09 11:47:19 CST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package femr.ui.controllers.superuser.javascript {
  import ReverseRouteContext.empty

  // @LINE:10
  class ReverseSuperuserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def indexGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.superuser.SuperuserController.indexGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "superuser"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseTabController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def fieldsPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.superuser.TabController.fieldsPost",
      """
        function(name) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "superuser/tabs/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
        }
      """
    )
  
    // @LINE:8
    def manageGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.superuser.TabController.manageGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "superuser/tabs"})
        }
      """
    )
  
    // @LINE:6
    def fieldsGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.superuser.TabController.fieldsGet",
      """
        function(name) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "superuser/tabs/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
        }
      """
    )
  
    // @LINE:9
    def managePost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.superuser.TabController.managePost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "superuser/tabs"})
        }
      """
    )
  
  }


}