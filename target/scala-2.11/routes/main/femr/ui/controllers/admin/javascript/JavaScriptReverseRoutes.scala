
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/conf/routes
// @DATE:Wed Nov 09 11:47:19 CST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:12
package femr.ui.controllers.admin.javascript {
  import ReverseRouteContext.empty

  // @LINE:33
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.AdminController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseInventoryController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def manageGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.InventoryController.manageGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/inventory"})
        }
      """
    )
  
    // @LINE:20
    def ajaxDelete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.InventoryController.ajaxDelete",
      """
        function(id,tripId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/inventory/delete/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("tripId", tripId)})
        }
      """
    )
  
    // @LINE:22
    def ajaxEditTotal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.InventoryController.ajaxEditTotal",
      """
        function(id,tripId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/inventory/editTotal/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("tripId", tripId)})
        }
      """
    )
  
    // @LINE:19
    def managePost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.InventoryController.managePost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/inventory"})
        }
      """
    )
  
    // @LINE:21
    def ajaxEditCurrent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.InventoryController.ajaxEditCurrent",
      """
        function(id,tripId) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/inventory/editCurrent/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("tripId", tripId)})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseUsersController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def manageGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.UsersController.manageGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/users"})
        }
      """
    )
  
    // @LINE:13
    def createGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.UsersController.createGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/users/create"})
        }
      """
    )
  
    // @LINE:15
    def editGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.UsersController.editGet",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/users/edit/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:14
    def editPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.UsersController.editPost",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/users/edit" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("id", id)])})
        }
      """
    )
  
    // @LINE:16
    def toggleUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.UsersController.toggleUser",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/users/toggle/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:12
    def createPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.UsersController.createPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/users/create"})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseConfigureController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def manageGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.ConfigureController.manageGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/configure"})
        }
      """
    )
  
    // @LINE:24
    def managePost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.ConfigureController.managePost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/configure"})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseTripController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def manageGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.TripController.manageGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/trips"})
        }
      """
    )
  
    // @LINE:32
    def citiesPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.TripController.citiesPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/trips/cities"})
        }
      """
    )
  
    // @LINE:31
    def citiesGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.TripController.citiesGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/trips/cities"})
        }
      """
    )
  
    // @LINE:30
    def teamsPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.TripController.teamsPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/trips/teams"})
        }
      """
    )
  
    // @LINE:27
    def editGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.TripController.editGet",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/trips/edit/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:28
    def editPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.TripController.editPost",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/trips/edit/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:29
    def teamsGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.TripController.teamsGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/trips/teams"})
        }
      """
    )
  
    // @LINE:26
    def managePost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.admin.TripController.managePost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/trips"})
        }
      """
    )
  
  }


}