
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/conf/routes
// @DATE:Mon Nov 14 20:26:16 CST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:12
package femr.ui.controllers.admin {

  // @LINE:33
  class ReverseAdminController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin")
    }
  
  }

  // @LINE:18
  class ReverseInventoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def manageGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/inventory")
    }
  
    // @LINE:20
    def ajaxDelete(id:Integer, tripId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/inventory/delete/" + implicitly[PathBindable[Integer]].unbind("id", id) + "/" + implicitly[PathBindable[Integer]].unbind("tripId", tripId))
    }
  
    // @LINE:22
    def ajaxEditTotal(id:Integer, tripId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/inventory/editTotal/" + implicitly[PathBindable[Integer]].unbind("id", id) + "/" + implicitly[PathBindable[Integer]].unbind("tripId", tripId))
    }
  
    // @LINE:19
    def managePost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/inventory")
    }
  
    // @LINE:21
    def ajaxEditCurrent(id:Integer, tripId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/inventory/editCurrent/" + implicitly[PathBindable[Integer]].unbind("id", id) + "/" + implicitly[PathBindable[Integer]].unbind("tripId", tripId))
    }
  
  }

  // @LINE:12
  class ReverseUsersController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def manageGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/users")
    }
  
    // @LINE:13
    def createGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/users/create")
    }
  
    // @LINE:15
    def editGet(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/users/edit/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:14
    def editPost(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/users/edit" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("id", id)))))
    }
  
    // @LINE:16
    def toggleUser(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/users/toggle/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:12
    def createPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/users/create")
    }
  
  }

  // @LINE:23
  class ReverseConfigureController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def manageGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/configure")
    }
  
    // @LINE:24
    def managePost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/configure")
    }
  
  }

  // @LINE:25
  class ReverseTripController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def manageGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/trips")
    }
  
    // @LINE:32
    def citiesPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/trips/cities")
    }
  
    // @LINE:31
    def citiesGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/trips/cities")
    }
  
    // @LINE:30
    def teamsPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/trips/teams")
    }
  
    // @LINE:27
    def editGet(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/trips/edit/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:28
    def editPost(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/trips/edit/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:29
    def teamsGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/trips/teams")
    }
  
    // @LINE:26
    def managePost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin/trips")
    }
  
  }


}