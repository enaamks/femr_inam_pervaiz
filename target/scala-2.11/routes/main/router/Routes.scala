
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/conf/routes
// @DATE:Mon Nov 14 20:26:16 CST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$path<.+>/""", """femr.ui.controllers.ApplicationController.removeTrailingSlash(path:String)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """superuser/tabs/$name<[^/]+>""", """@femr.ui.controllers.superuser.TabController@.fieldsGet(name:String)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """superuser/tabs/$name<[^/]+>""", """@femr.ui.controllers.superuser.TabController@.fieldsPost(name:String)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """superuser/tabs""", """@femr.ui.controllers.superuser.TabController@.manageGet()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """superuser/tabs""", """@femr.ui.controllers.superuser.TabController@.managePost()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """superuser""", """@femr.ui.controllers.superuser.SuperuserController@.indexGet()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/users/create""", """@femr.ui.controllers.admin.UsersController@.createPost()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/users/create""", """@femr.ui.controllers.admin.UsersController@.createGet()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/users/edit""", """@femr.ui.controllers.admin.UsersController@.editPost(id:Integer)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/users/edit/$id<[^/]+>""", """@femr.ui.controllers.admin.UsersController@.editGet(id:Integer)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/users/toggle/$id<[^/]+>""", """@femr.ui.controllers.admin.UsersController@.toggleUser(id:Integer)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/users""", """@femr.ui.controllers.admin.UsersController@.manageGet()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/inventory""", """@femr.ui.controllers.admin.InventoryController@.manageGet()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/inventory""", """@femr.ui.controllers.admin.InventoryController@.managePost()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/inventory/delete/$id<[^/]+>/$tripId<[^/]+>""", """@femr.ui.controllers.admin.InventoryController@.ajaxDelete(id:Integer, tripId:Integer)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/inventory/editCurrent/$id<[^/]+>/$tripId<[^/]+>""", """@femr.ui.controllers.admin.InventoryController@.ajaxEditCurrent(id:Integer, tripId:Integer)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/inventory/editTotal/$id<[^/]+>/$tripId<[^/]+>""", """@femr.ui.controllers.admin.InventoryController@.ajaxEditTotal(id:Integer, tripId:Integer)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/configure""", """@femr.ui.controllers.admin.ConfigureController@.manageGet()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/configure""", """@femr.ui.controllers.admin.ConfigureController@.managePost()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/trips""", """@femr.ui.controllers.admin.TripController@.manageGet()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/trips""", """@femr.ui.controllers.admin.TripController@.managePost()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/trips/edit/$id<[^/]+>""", """@femr.ui.controllers.admin.TripController@.editGet(id:Integer)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/trips/edit/$id<[^/]+>""", """@femr.ui.controllers.admin.TripController@.editPost(id:Integer)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/trips/teams""", """@femr.ui.controllers.admin.TripController@.teamsGet()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/trips/teams""", """@femr.ui.controllers.admin.TripController@.teamsPost()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/trips/cities""", """@femr.ui.controllers.admin.TripController@.citiesGet()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/trips/cities""", """@femr.ui.controllers.admin.TripController@.citiesPost()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin""", """@femr.ui.controllers.admin.AdminController@.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pharmacy/edit/$id<[^/]+>""", """@femr.ui.controllers.PharmaciesController@.editGet(id:Integer)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pharmacy/edit/$id<[^/]+>""", """@femr.ui.controllers.PharmaciesController@.editPost(id:Integer)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pharmacy""", """@femr.ui.controllers.PharmaciesController@.indexGet()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pharmacy""", """@femr.ui.controllers.PharmaciesController@.indexPost()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """history/encounter/$id<[^/]+>""", """@femr.ui.controllers.HistoryController@.indexEncounterGet(id:Integer)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """history/encounter/updateField/$id<[^/]+>""", """@femr.ui.controllers.HistoryController@.updateEncounterPost(id:Integer)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """history/encounter/listTabFieldHistory/$id<[^/]+>""", """@femr.ui.controllers.HistoryController@.listTabFieldHistoryGet(id:Integer)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """history/patient/$query<[^/]+>""", """@femr.ui.controllers.HistoryController@.indexPatientGet(query:String)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search/$page<[^/]+>""", """@femr.ui.controllers.SearchController@.handleSearch(page:String)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search/check/$query<[^/]+>""", """@femr.ui.controllers.SearchController@.doesPatientExist(query:String)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search/typeahead/patients""", """@femr.ui.controllers.SearchController@.typeaheadPatientsJSONGet()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search/typeahead/cities""", """@femr.ui.controllers.SearchController@.typeaheadCitiesJSONGet()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search/typeahead/diagnoses""", """@femr.ui.controllers.SearchController@.typeaheadDiagnosisJSONGet()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search/typeahead/medicationsWithID""", """@femr.ui.controllers.SearchController@.typeaheadMedicationsWithIDJSONGet()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search/typeahead/medicationAdministrations""", """@femr.ui.controllers.SearchController@.typeaheadMedicationAdministrationsJSONGet()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """photo/patient/$id<[^/]+>""", """@femr.ui.controllers.PhotoController@.GetPatientPhoto(id:Integer, showDefault:Boolean)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """photo/encounter/$id<[^/]+>""", """@femr.ui.controllers.PhotoController@.GetPhoto(id:Int)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """triage/$id<[^/]+>""", """@femr.ui.controllers.TriageController@.indexPopulatedGet(id:Integer)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """triage""", """@femr.ui.controllers.TriageController@.indexGet()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """triage""", """@femr.ui.controllers.TriageController@.indexPost(id:Integer)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """triage/$id<[^/]+>""", """@femr.ui.controllers.TriageController@.deletePatientPost(id:Integer)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """medical/updateVitals/$id<[^/]+>""", """@femr.ui.controllers.MedicalController@.updateVitalsPost(id:Integer)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """medical/newVitals""", """@femr.ui.controllers.MedicalController@.newVitalsGet()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """medical/listVitals/$id<[^/]+>""", """@femr.ui.controllers.MedicalController@.listVitalsGet(id:Integer)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """medical/edit/$id<[^/]+>""", """@femr.ui.controllers.MedicalController@.editGet(id:Integer)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """medical/edit/$id<[^/]+>""", """@femr.ui.controllers.MedicalController@.editPost(id:Integer)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """medical""", """@femr.ui.controllers.MedicalController@.indexGet()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """medical""", """@femr.ui.controllers.MedicalController@.indexPost()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """medical/prescriptionRow/$index<[^/]+>""", """@femr.ui.controllers.MedicalController@.prescriptionRowGet(index:Integer)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """research""", """@femr.ui.controllers.ResearchController@.indexGet()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """research""", """@femr.ui.controllers.ResearchController@.indexPost()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """research/exportData""", """@femr.ui.controllers.ResearchController@.exportPost()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pdf/encounter/$encounterId<[^/]+>""", """@femr.ui.controllers.PDFController@.index(encounterId:Integer)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""", """@femr.ui.controllers.SessionsController@.delete()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/reset""", """@femr.ui.controllers.SessionsController@.editPasswordPost()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""", """@femr.ui.controllers.SessionsController@.createPost()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""", """@femr.ui.controllers.SessionsController@.createGet()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reference""", """@femr.ui.controllers.ReferenceController@.indexGet()"""),
    ("""GET""", prefix, """@femr.ui.controllers.HomeController@.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val femr_ui_controllers_ApplicationController_removeTrailingSlash0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("path", """.+""",false), StaticPart("/")))
  )
  private[this] lazy val femr_ui_controllers_ApplicationController_removeTrailingSlash0_invoker = createInvoker(
    femr.ui.controllers.ApplicationController.removeTrailingSlash(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.ApplicationController",
      "removeTrailingSlash",
      Seq(classOf[String]),
      "GET",
      """ Routes
 This file defines all application routes (Higher priority routes first)
 ~~~~""",
      this.prefix + """$path<.+>/"""
    )
  )

  // @LINE:6
  private[this] lazy val femr_ui_controllers_superuser_TabController_fieldsGet1_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("superuser/tabs/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_superuser_TabController_fieldsGet1_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.superuser.TabController]).fieldsGet(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.superuser.TabController",
      "fieldsGet",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """superuser/tabs/$name<[^/]+>"""
    )
  )

  // @LINE:7
  private[this] lazy val femr_ui_controllers_superuser_TabController_fieldsPost2_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("superuser/tabs/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_superuser_TabController_fieldsPost2_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.superuser.TabController]).fieldsPost(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.superuser.TabController",
      "fieldsPost",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """superuser/tabs/$name<[^/]+>"""
    )
  )

  // @LINE:8
  private[this] lazy val femr_ui_controllers_superuser_TabController_manageGet3_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("superuser/tabs")))
  )
  private[this] lazy val femr_ui_controllers_superuser_TabController_manageGet3_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.superuser.TabController]).manageGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.superuser.TabController",
      "manageGet",
      Nil,
      "GET",
      """""",
      this.prefix + """superuser/tabs"""
    )
  )

  // @LINE:9
  private[this] lazy val femr_ui_controllers_superuser_TabController_managePost4_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("superuser/tabs")))
  )
  private[this] lazy val femr_ui_controllers_superuser_TabController_managePost4_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.superuser.TabController]).managePost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.superuser.TabController",
      "managePost",
      Nil,
      "POST",
      """""",
      this.prefix + """superuser/tabs"""
    )
  )

  // @LINE:10
  private[this] lazy val femr_ui_controllers_superuser_SuperuserController_indexGet5_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("superuser")))
  )
  private[this] lazy val femr_ui_controllers_superuser_SuperuserController_indexGet5_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.superuser.SuperuserController]).indexGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.superuser.SuperuserController",
      "indexGet",
      Nil,
      "GET",
      """""",
      this.prefix + """superuser"""
    )
  )

  // @LINE:12
  private[this] lazy val femr_ui_controllers_admin_UsersController_createPost6_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/users/create")))
  )
  private[this] lazy val femr_ui_controllers_admin_UsersController_createPost6_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.UsersController]).createPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.UsersController",
      "createPost",
      Nil,
      "POST",
      """Admin""",
      this.prefix + """admin/users/create"""
    )
  )

  // @LINE:13
  private[this] lazy val femr_ui_controllers_admin_UsersController_createGet7_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/users/create")))
  )
  private[this] lazy val femr_ui_controllers_admin_UsersController_createGet7_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.UsersController]).createGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.UsersController",
      "createGet",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/users/create"""
    )
  )

  // @LINE:14
  private[this] lazy val femr_ui_controllers_admin_UsersController_editPost8_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/users/edit")))
  )
  private[this] lazy val femr_ui_controllers_admin_UsersController_editPost8_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.UsersController]).editPost(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.UsersController",
      "editPost",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """admin/users/edit"""
    )
  )

  // @LINE:15
  private[this] lazy val femr_ui_controllers_admin_UsersController_editGet9_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/users/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_admin_UsersController_editGet9_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.UsersController]).editGet(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.UsersController",
      "editGet",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """admin/users/edit/$id<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val femr_ui_controllers_admin_UsersController_toggleUser10_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/users/toggle/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_admin_UsersController_toggleUser10_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.UsersController]).toggleUser(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.UsersController",
      "toggleUser",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """admin/users/toggle/$id<[^/]+>"""
    )
  )

  // @LINE:17
  private[this] lazy val femr_ui_controllers_admin_UsersController_manageGet11_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/users")))
  )
  private[this] lazy val femr_ui_controllers_admin_UsersController_manageGet11_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.UsersController]).manageGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.UsersController",
      "manageGet",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/users"""
    )
  )

  // @LINE:18
  private[this] lazy val femr_ui_controllers_admin_InventoryController_manageGet12_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/inventory")))
  )
  private[this] lazy val femr_ui_controllers_admin_InventoryController_manageGet12_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.InventoryController]).manageGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.InventoryController",
      "manageGet",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/inventory"""
    )
  )

  // @LINE:19
  private[this] lazy val femr_ui_controllers_admin_InventoryController_managePost13_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/inventory")))
  )
  private[this] lazy val femr_ui_controllers_admin_InventoryController_managePost13_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.InventoryController]).managePost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.InventoryController",
      "managePost",
      Nil,
      "POST",
      """""",
      this.prefix + """admin/inventory"""
    )
  )

  // @LINE:20
  private[this] lazy val femr_ui_controllers_admin_InventoryController_ajaxDelete14_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/inventory/delete/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("tripId", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_admin_InventoryController_ajaxDelete14_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.InventoryController]).ajaxDelete(fakeValue[Integer], fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.InventoryController",
      "ajaxDelete",
      Seq(classOf[Integer], classOf[Integer]),
      "POST",
      """""",
      this.prefix + """admin/inventory/delete/$id<[^/]+>/$tripId<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val femr_ui_controllers_admin_InventoryController_ajaxEditCurrent15_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/inventory/editCurrent/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("tripId", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_admin_InventoryController_ajaxEditCurrent15_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.InventoryController]).ajaxEditCurrent(fakeValue[Integer], fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.InventoryController",
      "ajaxEditCurrent",
      Seq(classOf[Integer], classOf[Integer]),
      "POST",
      """""",
      this.prefix + """admin/inventory/editCurrent/$id<[^/]+>/$tripId<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val femr_ui_controllers_admin_InventoryController_ajaxEditTotal16_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/inventory/editTotal/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("tripId", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_admin_InventoryController_ajaxEditTotal16_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.InventoryController]).ajaxEditTotal(fakeValue[Integer], fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.InventoryController",
      "ajaxEditTotal",
      Seq(classOf[Integer], classOf[Integer]),
      "POST",
      """""",
      this.prefix + """admin/inventory/editTotal/$id<[^/]+>/$tripId<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val femr_ui_controllers_admin_ConfigureController_manageGet17_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/configure")))
  )
  private[this] lazy val femr_ui_controllers_admin_ConfigureController_manageGet17_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.ConfigureController]).manageGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.ConfigureController",
      "manageGet",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/configure"""
    )
  )

  // @LINE:24
  private[this] lazy val femr_ui_controllers_admin_ConfigureController_managePost18_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/configure")))
  )
  private[this] lazy val femr_ui_controllers_admin_ConfigureController_managePost18_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.ConfigureController]).managePost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.ConfigureController",
      "managePost",
      Nil,
      "POST",
      """""",
      this.prefix + """admin/configure"""
    )
  )

  // @LINE:25
  private[this] lazy val femr_ui_controllers_admin_TripController_manageGet19_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/trips")))
  )
  private[this] lazy val femr_ui_controllers_admin_TripController_manageGet19_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.TripController]).manageGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.TripController",
      "manageGet",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/trips"""
    )
  )

  // @LINE:26
  private[this] lazy val femr_ui_controllers_admin_TripController_managePost20_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/trips")))
  )
  private[this] lazy val femr_ui_controllers_admin_TripController_managePost20_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.TripController]).managePost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.TripController",
      "managePost",
      Nil,
      "POST",
      """""",
      this.prefix + """admin/trips"""
    )
  )

  // @LINE:27
  private[this] lazy val femr_ui_controllers_admin_TripController_editGet21_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/trips/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_admin_TripController_editGet21_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.TripController]).editGet(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.TripController",
      "editGet",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """admin/trips/edit/$id<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val femr_ui_controllers_admin_TripController_editPost22_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/trips/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_admin_TripController_editPost22_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.TripController]).editPost(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.TripController",
      "editPost",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """admin/trips/edit/$id<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val femr_ui_controllers_admin_TripController_teamsGet23_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/trips/teams")))
  )
  private[this] lazy val femr_ui_controllers_admin_TripController_teamsGet23_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.TripController]).teamsGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.TripController",
      "teamsGet",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/trips/teams"""
    )
  )

  // @LINE:30
  private[this] lazy val femr_ui_controllers_admin_TripController_teamsPost24_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/trips/teams")))
  )
  private[this] lazy val femr_ui_controllers_admin_TripController_teamsPost24_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.TripController]).teamsPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.TripController",
      "teamsPost",
      Nil,
      "POST",
      """""",
      this.prefix + """admin/trips/teams"""
    )
  )

  // @LINE:31
  private[this] lazy val femr_ui_controllers_admin_TripController_citiesGet25_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/trips/cities")))
  )
  private[this] lazy val femr_ui_controllers_admin_TripController_citiesGet25_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.TripController]).citiesGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.TripController",
      "citiesGet",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/trips/cities"""
    )
  )

  // @LINE:32
  private[this] lazy val femr_ui_controllers_admin_TripController_citiesPost26_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/trips/cities")))
  )
  private[this] lazy val femr_ui_controllers_admin_TripController_citiesPost26_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.TripController]).citiesPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.TripController",
      "citiesPost",
      Nil,
      "POST",
      """""",
      this.prefix + """admin/trips/cities"""
    )
  )

  // @LINE:33
  private[this] lazy val femr_ui_controllers_admin_AdminController_index27_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val femr_ui_controllers_admin_AdminController_index27_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.AdminController]).index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.admin.AdminController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """admin"""
    )
  )

  // @LINE:35
  private[this] lazy val femr_ui_controllers_PharmaciesController_editGet28_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pharmacy/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_PharmaciesController_editGet28_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.PharmaciesController]).editGet(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.PharmaciesController",
      "editGet",
      Seq(classOf[Integer]),
      "GET",
      """Pharmacy""",
      this.prefix + """pharmacy/edit/$id<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val femr_ui_controllers_PharmaciesController_editPost29_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pharmacy/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_PharmaciesController_editPost29_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.PharmaciesController]).editPost(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.PharmaciesController",
      "editPost",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """pharmacy/edit/$id<[^/]+>"""
    )
  )

  // @LINE:37
  private[this] lazy val femr_ui_controllers_PharmaciesController_indexGet30_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pharmacy")))
  )
  private[this] lazy val femr_ui_controllers_PharmaciesController_indexGet30_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.PharmaciesController]).indexGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.PharmaciesController",
      "indexGet",
      Nil,
      "GET",
      """""",
      this.prefix + """pharmacy"""
    )
  )

  // @LINE:38
  private[this] lazy val femr_ui_controllers_PharmaciesController_indexPost31_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pharmacy")))
  )
  private[this] lazy val femr_ui_controllers_PharmaciesController_indexPost31_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.PharmaciesController]).indexPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.PharmaciesController",
      "indexPost",
      Nil,
      "POST",
      """""",
      this.prefix + """pharmacy"""
    )
  )

  // @LINE:40
  private[this] lazy val femr_ui_controllers_HistoryController_indexEncounterGet32_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("history/encounter/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_HistoryController_indexEncounterGet32_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.HistoryController]).indexEncounterGet(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.HistoryController",
      "indexEncounterGet",
      Seq(classOf[Integer]),
      "GET",
      """History""",
      this.prefix + """history/encounter/$id<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val femr_ui_controllers_HistoryController_updateEncounterPost33_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("history/encounter/updateField/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_HistoryController_updateEncounterPost33_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.HistoryController]).updateEncounterPost(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.HistoryController",
      "updateEncounterPost",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """history/encounter/updateField/$id<[^/]+>"""
    )
  )

  // @LINE:42
  private[this] lazy val femr_ui_controllers_HistoryController_listTabFieldHistoryGet34_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("history/encounter/listTabFieldHistory/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_HistoryController_listTabFieldHistoryGet34_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.HistoryController]).listTabFieldHistoryGet(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.HistoryController",
      "listTabFieldHistoryGet",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """history/encounter/listTabFieldHistory/$id<[^/]+>"""
    )
  )

  // @LINE:43
  private[this] lazy val femr_ui_controllers_HistoryController_indexPatientGet35_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("history/patient/"), DynamicPart("query", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_HistoryController_indexPatientGet35_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.HistoryController]).indexPatientGet(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.HistoryController",
      "indexPatientGet",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """history/patient/$query<[^/]+>"""
    )
  )

  // @LINE:45
  private[this] lazy val femr_ui_controllers_SearchController_handleSearch36_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search/"), DynamicPart("page", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_SearchController_handleSearch36_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SearchController]).handleSearch(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.SearchController",
      "handleSearch",
      Seq(classOf[String]),
      "GET",
      """Search""",
      this.prefix + """search/$page<[^/]+>"""
    )
  )

  // @LINE:46
  private[this] lazy val femr_ui_controllers_SearchController_doesPatientExist37_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search/check/"), DynamicPart("query", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_SearchController_doesPatientExist37_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SearchController]).doesPatientExist(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.SearchController",
      "doesPatientExist",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """search/check/$query<[^/]+>"""
    )
  )

  // @LINE:47
  private[this] lazy val femr_ui_controllers_SearchController_typeaheadPatientsJSONGet38_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search/typeahead/patients")))
  )
  private[this] lazy val femr_ui_controllers_SearchController_typeaheadPatientsJSONGet38_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SearchController]).typeaheadPatientsJSONGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.SearchController",
      "typeaheadPatientsJSONGet",
      Nil,
      "GET",
      """""",
      this.prefix + """search/typeahead/patients"""
    )
  )

  // @LINE:49
  private[this] lazy val femr_ui_controllers_SearchController_typeaheadCitiesJSONGet39_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search/typeahead/cities")))
  )
  private[this] lazy val femr_ui_controllers_SearchController_typeaheadCitiesJSONGet39_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SearchController]).typeaheadCitiesJSONGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.SearchController",
      "typeaheadCitiesJSONGet",
      Nil,
      "GET",
      """ AJ Saclayan!  Adding in typeahead""",
      this.prefix + """search/typeahead/cities"""
    )
  )

  // @LINE:50
  private[this] lazy val femr_ui_controllers_SearchController_typeaheadDiagnosisJSONGet40_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search/typeahead/diagnoses")))
  )
  private[this] lazy val femr_ui_controllers_SearchController_typeaheadDiagnosisJSONGet40_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SearchController]).typeaheadDiagnosisJSONGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.SearchController",
      "typeaheadDiagnosisJSONGet",
      Nil,
      "GET",
      """""",
      this.prefix + """search/typeahead/diagnoses"""
    )
  )

  // @LINE:51
  private[this] lazy val femr_ui_controllers_SearchController_typeaheadMedicationsWithIDJSONGet41_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search/typeahead/medicationsWithID")))
  )
  private[this] lazy val femr_ui_controllers_SearchController_typeaheadMedicationsWithIDJSONGet41_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SearchController]).typeaheadMedicationsWithIDJSONGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.SearchController",
      "typeaheadMedicationsWithIDJSONGet",
      Nil,
      "GET",
      """""",
      this.prefix + """search/typeahead/medicationsWithID"""
    )
  )

  // @LINE:52
  private[this] lazy val femr_ui_controllers_SearchController_typeaheadMedicationAdministrationsJSONGet42_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search/typeahead/medicationAdministrations")))
  )
  private[this] lazy val femr_ui_controllers_SearchController_typeaheadMedicationAdministrationsJSONGet42_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SearchController]).typeaheadMedicationAdministrationsJSONGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.SearchController",
      "typeaheadMedicationAdministrationsJSONGet",
      Nil,
      "GET",
      """""",
      this.prefix + """search/typeahead/medicationAdministrations"""
    )
  )

  // @LINE:54
  private[this] lazy val femr_ui_controllers_PhotoController_GetPatientPhoto43_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("photo/patient/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_PhotoController_GetPatientPhoto43_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.PhotoController]).GetPatientPhoto(fakeValue[Integer], fakeValue[Boolean]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.PhotoController",
      "GetPatientPhoto",
      Seq(classOf[Integer], classOf[Boolean]),
      "GET",
      """Photo""",
      this.prefix + """photo/patient/$id<[^/]+>"""
    )
  )

  // @LINE:55
  private[this] lazy val femr_ui_controllers_PhotoController_GetPhoto44_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("photo/encounter/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_PhotoController_GetPhoto44_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.PhotoController]).GetPhoto(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.PhotoController",
      "GetPhoto",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """photo/encounter/$id<[^/]+>"""
    )
  )

  // @LINE:57
  private[this] lazy val femr_ui_controllers_TriageController_indexPopulatedGet45_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("triage/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_TriageController_indexPopulatedGet45_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.TriageController]).indexPopulatedGet(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.TriageController",
      "indexPopulatedGet",
      Seq(classOf[Integer]),
      "GET",
      """Triage""",
      this.prefix + """triage/$id<[^/]+>"""
    )
  )

  // @LINE:58
  private[this] lazy val femr_ui_controllers_TriageController_indexGet46_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("triage")))
  )
  private[this] lazy val femr_ui_controllers_TriageController_indexGet46_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.TriageController]).indexGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.TriageController",
      "indexGet",
      Nil,
      "GET",
      """""",
      this.prefix + """triage"""
    )
  )

  // @LINE:59
  private[this] lazy val femr_ui_controllers_TriageController_indexPost47_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("triage")))
  )
  private[this] lazy val femr_ui_controllers_TriageController_indexPost47_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.TriageController]).indexPost(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.TriageController",
      "indexPost",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """triage"""
    )
  )

  // @LINE:60
  private[this] lazy val femr_ui_controllers_TriageController_deletePatientPost48_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("triage/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_TriageController_deletePatientPost48_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.TriageController]).deletePatientPost(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.TriageController",
      "deletePatientPost",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """triage/$id<[^/]+>"""
    )
  )

  // @LINE:63
  private[this] lazy val femr_ui_controllers_MedicalController_updateVitalsPost49_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medical/updateVitals/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_MedicalController_updateVitalsPost49_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.MedicalController]).updateVitalsPost(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.MedicalController",
      "updateVitalsPost",
      Seq(classOf[Integer]),
      "POST",
      """Medical""",
      this.prefix + """medical/updateVitals/$id<[^/]+>"""
    )
  )

  // @LINE:64
  private[this] lazy val femr_ui_controllers_MedicalController_newVitalsGet50_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medical/newVitals")))
  )
  private[this] lazy val femr_ui_controllers_MedicalController_newVitalsGet50_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.MedicalController]).newVitalsGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.MedicalController",
      "newVitalsGet",
      Nil,
      "GET",
      """""",
      this.prefix + """medical/newVitals"""
    )
  )

  // @LINE:65
  private[this] lazy val femr_ui_controllers_MedicalController_listVitalsGet51_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medical/listVitals/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_MedicalController_listVitalsGet51_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.MedicalController]).listVitalsGet(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.MedicalController",
      "listVitalsGet",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """medical/listVitals/$id<[^/]+>"""
    )
  )

  // @LINE:66
  private[this] lazy val femr_ui_controllers_MedicalController_editGet52_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medical/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_MedicalController_editGet52_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.MedicalController]).editGet(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.MedicalController",
      "editGet",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """medical/edit/$id<[^/]+>"""
    )
  )

  // @LINE:67
  private[this] lazy val femr_ui_controllers_MedicalController_editPost53_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medical/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_MedicalController_editPost53_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.MedicalController]).editPost(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.MedicalController",
      "editPost",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """medical/edit/$id<[^/]+>"""
    )
  )

  // @LINE:68
  private[this] lazy val femr_ui_controllers_MedicalController_indexGet54_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medical")))
  )
  private[this] lazy val femr_ui_controllers_MedicalController_indexGet54_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.MedicalController]).indexGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.MedicalController",
      "indexGet",
      Nil,
      "GET",
      """""",
      this.prefix + """medical"""
    )
  )

  // @LINE:69
  private[this] lazy val femr_ui_controllers_MedicalController_indexPost55_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medical")))
  )
  private[this] lazy val femr_ui_controllers_MedicalController_indexPost55_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.MedicalController]).indexPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.MedicalController",
      "indexPost",
      Nil,
      "POST",
      """""",
      this.prefix + """medical"""
    )
  )

  // @LINE:70
  private[this] lazy val femr_ui_controllers_MedicalController_prescriptionRowGet56_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medical/prescriptionRow/"), DynamicPart("index", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_MedicalController_prescriptionRowGet56_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.MedicalController]).prescriptionRowGet(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.MedicalController",
      "prescriptionRowGet",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """medical/prescriptionRow/$index<[^/]+>"""
    )
  )

  // @LINE:72
  private[this] lazy val femr_ui_controllers_ResearchController_indexGet57_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("research")))
  )
  private[this] lazy val femr_ui_controllers_ResearchController_indexGet57_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.ResearchController]).indexGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.ResearchController",
      "indexGet",
      Nil,
      "GET",
      """Research""",
      this.prefix + """research"""
    )
  )

  // @LINE:73
  private[this] lazy val femr_ui_controllers_ResearchController_indexPost58_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("research")))
  )
  private[this] lazy val femr_ui_controllers_ResearchController_indexPost58_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.ResearchController]).indexPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.ResearchController",
      "indexPost",
      Nil,
      "POST",
      """""",
      this.prefix + """research"""
    )
  )

  // @LINE:74
  private[this] lazy val femr_ui_controllers_ResearchController_exportPost59_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("research/exportData")))
  )
  private[this] lazy val femr_ui_controllers_ResearchController_exportPost59_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.ResearchController]).exportPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.ResearchController",
      "exportPost",
      Nil,
      "POST",
      """""",
      this.prefix + """research/exportData"""
    )
  )

  // @LINE:76
  private[this] lazy val femr_ui_controllers_PDFController_index60_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdf/encounter/"), DynamicPart("encounterId", """[^/]+""",true)))
  )
  private[this] lazy val femr_ui_controllers_PDFController_index60_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.PDFController]).index(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.PDFController",
      "index",
      Seq(classOf[Integer]),
      "GET",
      """Pdf""",
      this.prefix + """pdf/encounter/$encounterId<[^/]+>"""
    )
  )

  // @LINE:78
  private[this] lazy val femr_ui_controllers_SessionsController_delete61_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val femr_ui_controllers_SessionsController_delete61_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SessionsController]).delete(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.SessionsController",
      "delete",
      Nil,
      "GET",
      """Sessions""",
      this.prefix + """logout"""
    )
  )

  // @LINE:79
  private[this] lazy val femr_ui_controllers_SessionsController_editPasswordPost62_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/reset")))
  )
  private[this] lazy val femr_ui_controllers_SessionsController_editPasswordPost62_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SessionsController]).editPasswordPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.SessionsController",
      "editPasswordPost",
      Nil,
      "POST",
      """""",
      this.prefix + """login/reset"""
    )
  )

  // @LINE:80
  private[this] lazy val femr_ui_controllers_SessionsController_createPost63_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val femr_ui_controllers_SessionsController_createPost63_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SessionsController]).createPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.SessionsController",
      "createPost",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:81
  private[this] lazy val femr_ui_controllers_SessionsController_createGet64_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val femr_ui_controllers_SessionsController_createGet64_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SessionsController]).createGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.SessionsController",
      "createGet",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:83
  private[this] lazy val femr_ui_controllers_ReferenceController_indexGet65_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reference")))
  )
  private[this] lazy val femr_ui_controllers_ReferenceController_indexGet65_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.ReferenceController]).indexGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.ReferenceController",
      "indexGet",
      Nil,
      "GET",
      """Reference""",
      this.prefix + """reference"""
    )
  )

  // @LINE:85
  private[this] lazy val femr_ui_controllers_HomeController_index66_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val femr_ui_controllers_HomeController_index66_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.HomeController]).index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "femr.ui.controllers.HomeController",
      "index",
      Nil,
      "GET",
      """Home""",
      this.prefix + """"""
    )
  )

  // @LINE:88
  private[this] lazy val controllers_Assets_versioned67_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned67_invoker = createInvoker(
    controllers.Assets.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case femr_ui_controllers_ApplicationController_removeTrailingSlash0_route(params) =>
      call(params.fromPath[String]("path", None)) { (path) =>
        femr_ui_controllers_ApplicationController_removeTrailingSlash0_invoker.call(femr.ui.controllers.ApplicationController.removeTrailingSlash(path))
      }
  
    // @LINE:6
    case femr_ui_controllers_superuser_TabController_fieldsGet1_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        femr_ui_controllers_superuser_TabController_fieldsGet1_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.superuser.TabController]).fieldsGet(name))
      }
  
    // @LINE:7
    case femr_ui_controllers_superuser_TabController_fieldsPost2_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        femr_ui_controllers_superuser_TabController_fieldsPost2_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.superuser.TabController]).fieldsPost(name))
      }
  
    // @LINE:8
    case femr_ui_controllers_superuser_TabController_manageGet3_route(params) =>
      call { 
        femr_ui_controllers_superuser_TabController_manageGet3_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.superuser.TabController]).manageGet())
      }
  
    // @LINE:9
    case femr_ui_controllers_superuser_TabController_managePost4_route(params) =>
      call { 
        femr_ui_controllers_superuser_TabController_managePost4_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.superuser.TabController]).managePost())
      }
  
    // @LINE:10
    case femr_ui_controllers_superuser_SuperuserController_indexGet5_route(params) =>
      call { 
        femr_ui_controllers_superuser_SuperuserController_indexGet5_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.superuser.SuperuserController]).indexGet())
      }
  
    // @LINE:12
    case femr_ui_controllers_admin_UsersController_createPost6_route(params) =>
      call { 
        femr_ui_controllers_admin_UsersController_createPost6_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.UsersController]).createPost())
      }
  
    // @LINE:13
    case femr_ui_controllers_admin_UsersController_createGet7_route(params) =>
      call { 
        femr_ui_controllers_admin_UsersController_createGet7_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.UsersController]).createGet())
      }
  
    // @LINE:14
    case femr_ui_controllers_admin_UsersController_editPost8_route(params) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        femr_ui_controllers_admin_UsersController_editPost8_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.UsersController]).editPost(id))
      }
  
    // @LINE:15
    case femr_ui_controllers_admin_UsersController_editGet9_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        femr_ui_controllers_admin_UsersController_editGet9_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.UsersController]).editGet(id))
      }
  
    // @LINE:16
    case femr_ui_controllers_admin_UsersController_toggleUser10_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        femr_ui_controllers_admin_UsersController_toggleUser10_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.UsersController]).toggleUser(id))
      }
  
    // @LINE:17
    case femr_ui_controllers_admin_UsersController_manageGet11_route(params) =>
      call { 
        femr_ui_controllers_admin_UsersController_manageGet11_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.UsersController]).manageGet())
      }
  
    // @LINE:18
    case femr_ui_controllers_admin_InventoryController_manageGet12_route(params) =>
      call { 
        femr_ui_controllers_admin_InventoryController_manageGet12_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.InventoryController]).manageGet())
      }
  
    // @LINE:19
    case femr_ui_controllers_admin_InventoryController_managePost13_route(params) =>
      call { 
        femr_ui_controllers_admin_InventoryController_managePost13_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.InventoryController]).managePost())
      }
  
    // @LINE:20
    case femr_ui_controllers_admin_InventoryController_ajaxDelete14_route(params) =>
      call(params.fromPath[Integer]("id", None), params.fromPath[Integer]("tripId", None)) { (id, tripId) =>
        femr_ui_controllers_admin_InventoryController_ajaxDelete14_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.InventoryController]).ajaxDelete(id, tripId))
      }
  
    // @LINE:21
    case femr_ui_controllers_admin_InventoryController_ajaxEditCurrent15_route(params) =>
      call(params.fromPath[Integer]("id", None), params.fromPath[Integer]("tripId", None)) { (id, tripId) =>
        femr_ui_controllers_admin_InventoryController_ajaxEditCurrent15_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.InventoryController]).ajaxEditCurrent(id, tripId))
      }
  
    // @LINE:22
    case femr_ui_controllers_admin_InventoryController_ajaxEditTotal16_route(params) =>
      call(params.fromPath[Integer]("id", None), params.fromPath[Integer]("tripId", None)) { (id, tripId) =>
        femr_ui_controllers_admin_InventoryController_ajaxEditTotal16_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.InventoryController]).ajaxEditTotal(id, tripId))
      }
  
    // @LINE:23
    case femr_ui_controllers_admin_ConfigureController_manageGet17_route(params) =>
      call { 
        femr_ui_controllers_admin_ConfigureController_manageGet17_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.ConfigureController]).manageGet())
      }
  
    // @LINE:24
    case femr_ui_controllers_admin_ConfigureController_managePost18_route(params) =>
      call { 
        femr_ui_controllers_admin_ConfigureController_managePost18_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.ConfigureController]).managePost())
      }
  
    // @LINE:25
    case femr_ui_controllers_admin_TripController_manageGet19_route(params) =>
      call { 
        femr_ui_controllers_admin_TripController_manageGet19_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.TripController]).manageGet())
      }
  
    // @LINE:26
    case femr_ui_controllers_admin_TripController_managePost20_route(params) =>
      call { 
        femr_ui_controllers_admin_TripController_managePost20_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.TripController]).managePost())
      }
  
    // @LINE:27
    case femr_ui_controllers_admin_TripController_editGet21_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        femr_ui_controllers_admin_TripController_editGet21_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.TripController]).editGet(id))
      }
  
    // @LINE:28
    case femr_ui_controllers_admin_TripController_editPost22_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        femr_ui_controllers_admin_TripController_editPost22_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.TripController]).editPost(id))
      }
  
    // @LINE:29
    case femr_ui_controllers_admin_TripController_teamsGet23_route(params) =>
      call { 
        femr_ui_controllers_admin_TripController_teamsGet23_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.TripController]).teamsGet())
      }
  
    // @LINE:30
    case femr_ui_controllers_admin_TripController_teamsPost24_route(params) =>
      call { 
        femr_ui_controllers_admin_TripController_teamsPost24_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.TripController]).teamsPost())
      }
  
    // @LINE:31
    case femr_ui_controllers_admin_TripController_citiesGet25_route(params) =>
      call { 
        femr_ui_controllers_admin_TripController_citiesGet25_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.TripController]).citiesGet())
      }
  
    // @LINE:32
    case femr_ui_controllers_admin_TripController_citiesPost26_route(params) =>
      call { 
        femr_ui_controllers_admin_TripController_citiesPost26_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.TripController]).citiesPost())
      }
  
    // @LINE:33
    case femr_ui_controllers_admin_AdminController_index27_route(params) =>
      call { 
        femr_ui_controllers_admin_AdminController_index27_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.admin.AdminController]).index())
      }
  
    // @LINE:35
    case femr_ui_controllers_PharmaciesController_editGet28_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        femr_ui_controllers_PharmaciesController_editGet28_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.PharmaciesController]).editGet(id))
      }
  
    // @LINE:36
    case femr_ui_controllers_PharmaciesController_editPost29_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        femr_ui_controllers_PharmaciesController_editPost29_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.PharmaciesController]).editPost(id))
      }
  
    // @LINE:37
    case femr_ui_controllers_PharmaciesController_indexGet30_route(params) =>
      call { 
        femr_ui_controllers_PharmaciesController_indexGet30_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.PharmaciesController]).indexGet())
      }
  
    // @LINE:38
    case femr_ui_controllers_PharmaciesController_indexPost31_route(params) =>
      call { 
        femr_ui_controllers_PharmaciesController_indexPost31_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.PharmaciesController]).indexPost())
      }
  
    // @LINE:40
    case femr_ui_controllers_HistoryController_indexEncounterGet32_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        femr_ui_controllers_HistoryController_indexEncounterGet32_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.HistoryController]).indexEncounterGet(id))
      }
  
    // @LINE:41
    case femr_ui_controllers_HistoryController_updateEncounterPost33_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        femr_ui_controllers_HistoryController_updateEncounterPost33_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.HistoryController]).updateEncounterPost(id))
      }
  
    // @LINE:42
    case femr_ui_controllers_HistoryController_listTabFieldHistoryGet34_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        femr_ui_controllers_HistoryController_listTabFieldHistoryGet34_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.HistoryController]).listTabFieldHistoryGet(id))
      }
  
    // @LINE:43
    case femr_ui_controllers_HistoryController_indexPatientGet35_route(params) =>
      call(params.fromPath[String]("query", None)) { (query) =>
        femr_ui_controllers_HistoryController_indexPatientGet35_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.HistoryController]).indexPatientGet(query))
      }
  
    // @LINE:45
    case femr_ui_controllers_SearchController_handleSearch36_route(params) =>
      call(params.fromPath[String]("page", None)) { (page) =>
        femr_ui_controllers_SearchController_handleSearch36_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SearchController]).handleSearch(page))
      }
  
    // @LINE:46
    case femr_ui_controllers_SearchController_doesPatientExist37_route(params) =>
      call(params.fromPath[String]("query", None)) { (query) =>
        femr_ui_controllers_SearchController_doesPatientExist37_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SearchController]).doesPatientExist(query))
      }
  
    // @LINE:47
    case femr_ui_controllers_SearchController_typeaheadPatientsJSONGet38_route(params) =>
      call { 
        femr_ui_controllers_SearchController_typeaheadPatientsJSONGet38_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SearchController]).typeaheadPatientsJSONGet())
      }
  
    // @LINE:49
    case femr_ui_controllers_SearchController_typeaheadCitiesJSONGet39_route(params) =>
      call { 
        femr_ui_controllers_SearchController_typeaheadCitiesJSONGet39_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SearchController]).typeaheadCitiesJSONGet())
      }
  
    // @LINE:50
    case femr_ui_controllers_SearchController_typeaheadDiagnosisJSONGet40_route(params) =>
      call { 
        femr_ui_controllers_SearchController_typeaheadDiagnosisJSONGet40_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SearchController]).typeaheadDiagnosisJSONGet())
      }
  
    // @LINE:51
    case femr_ui_controllers_SearchController_typeaheadMedicationsWithIDJSONGet41_route(params) =>
      call { 
        femr_ui_controllers_SearchController_typeaheadMedicationsWithIDJSONGet41_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SearchController]).typeaheadMedicationsWithIDJSONGet())
      }
  
    // @LINE:52
    case femr_ui_controllers_SearchController_typeaheadMedicationAdministrationsJSONGet42_route(params) =>
      call { 
        femr_ui_controllers_SearchController_typeaheadMedicationAdministrationsJSONGet42_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SearchController]).typeaheadMedicationAdministrationsJSONGet())
      }
  
    // @LINE:54
    case femr_ui_controllers_PhotoController_GetPatientPhoto43_route(params) =>
      call(params.fromPath[Integer]("id", None), params.fromQuery[Boolean]("showDefault", None)) { (id, showDefault) =>
        femr_ui_controllers_PhotoController_GetPatientPhoto43_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.PhotoController]).GetPatientPhoto(id, showDefault))
      }
  
    // @LINE:55
    case femr_ui_controllers_PhotoController_GetPhoto44_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        femr_ui_controllers_PhotoController_GetPhoto44_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.PhotoController]).GetPhoto(id))
      }
  
    // @LINE:57
    case femr_ui_controllers_TriageController_indexPopulatedGet45_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        femr_ui_controllers_TriageController_indexPopulatedGet45_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.TriageController]).indexPopulatedGet(id))
      }
  
    // @LINE:58
    case femr_ui_controllers_TriageController_indexGet46_route(params) =>
      call { 
        femr_ui_controllers_TriageController_indexGet46_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.TriageController]).indexGet())
      }
  
    // @LINE:59
    case femr_ui_controllers_TriageController_indexPost47_route(params) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        femr_ui_controllers_TriageController_indexPost47_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.TriageController]).indexPost(id))
      }
  
    // @LINE:60
    case femr_ui_controllers_TriageController_deletePatientPost48_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        femr_ui_controllers_TriageController_deletePatientPost48_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.TriageController]).deletePatientPost(id))
      }
  
    // @LINE:63
    case femr_ui_controllers_MedicalController_updateVitalsPost49_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        femr_ui_controllers_MedicalController_updateVitalsPost49_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.MedicalController]).updateVitalsPost(id))
      }
  
    // @LINE:64
    case femr_ui_controllers_MedicalController_newVitalsGet50_route(params) =>
      call { 
        femr_ui_controllers_MedicalController_newVitalsGet50_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.MedicalController]).newVitalsGet())
      }
  
    // @LINE:65
    case femr_ui_controllers_MedicalController_listVitalsGet51_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        femr_ui_controllers_MedicalController_listVitalsGet51_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.MedicalController]).listVitalsGet(id))
      }
  
    // @LINE:66
    case femr_ui_controllers_MedicalController_editGet52_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        femr_ui_controllers_MedicalController_editGet52_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.MedicalController]).editGet(id))
      }
  
    // @LINE:67
    case femr_ui_controllers_MedicalController_editPost53_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        femr_ui_controllers_MedicalController_editPost53_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.MedicalController]).editPost(id))
      }
  
    // @LINE:68
    case femr_ui_controllers_MedicalController_indexGet54_route(params) =>
      call { 
        femr_ui_controllers_MedicalController_indexGet54_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.MedicalController]).indexGet())
      }
  
    // @LINE:69
    case femr_ui_controllers_MedicalController_indexPost55_route(params) =>
      call { 
        femr_ui_controllers_MedicalController_indexPost55_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.MedicalController]).indexPost())
      }
  
    // @LINE:70
    case femr_ui_controllers_MedicalController_prescriptionRowGet56_route(params) =>
      call(params.fromPath[Integer]("index", None)) { (index) =>
        femr_ui_controllers_MedicalController_prescriptionRowGet56_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.MedicalController]).prescriptionRowGet(index))
      }
  
    // @LINE:72
    case femr_ui_controllers_ResearchController_indexGet57_route(params) =>
      call { 
        femr_ui_controllers_ResearchController_indexGet57_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.ResearchController]).indexGet())
      }
  
    // @LINE:73
    case femr_ui_controllers_ResearchController_indexPost58_route(params) =>
      call { 
        femr_ui_controllers_ResearchController_indexPost58_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.ResearchController]).indexPost())
      }
  
    // @LINE:74
    case femr_ui_controllers_ResearchController_exportPost59_route(params) =>
      call { 
        femr_ui_controllers_ResearchController_exportPost59_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.ResearchController]).exportPost())
      }
  
    // @LINE:76
    case femr_ui_controllers_PDFController_index60_route(params) =>
      call(params.fromPath[Integer]("encounterId", None)) { (encounterId) =>
        femr_ui_controllers_PDFController_index60_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.PDFController]).index(encounterId))
      }
  
    // @LINE:78
    case femr_ui_controllers_SessionsController_delete61_route(params) =>
      call { 
        femr_ui_controllers_SessionsController_delete61_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SessionsController]).delete())
      }
  
    // @LINE:79
    case femr_ui_controllers_SessionsController_editPasswordPost62_route(params) =>
      call { 
        femr_ui_controllers_SessionsController_editPasswordPost62_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SessionsController]).editPasswordPost())
      }
  
    // @LINE:80
    case femr_ui_controllers_SessionsController_createPost63_route(params) =>
      call { 
        femr_ui_controllers_SessionsController_createPost63_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SessionsController]).createPost())
      }
  
    // @LINE:81
    case femr_ui_controllers_SessionsController_createGet64_route(params) =>
      call { 
        femr_ui_controllers_SessionsController_createGet64_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.SessionsController]).createGet())
      }
  
    // @LINE:83
    case femr_ui_controllers_ReferenceController_indexGet65_route(params) =>
      call { 
        femr_ui_controllers_ReferenceController_indexGet65_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.ReferenceController]).indexGet())
      }
  
    // @LINE:85
    case femr_ui_controllers_HomeController_index66_route(params) =>
      call { 
        femr_ui_controllers_HomeController_index66_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[femr.ui.controllers.HomeController]).index())
      }
  
    // @LINE:88
    case controllers_Assets_versioned67_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned67_invoker.call(controllers.Assets.versioned(path, file))
      }
  }
}