
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/conf/routes
// @DATE:Wed Nov 09 11:47:19 CST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package femr.ui.controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:54
  class ReversePhotoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def GetPatientPhoto: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.PhotoController.GetPatientPhoto",
      """
        function(id,showDefault) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "photo/patient/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id) + _qS([(""" + implicitly[QueryStringBindable[Boolean]].javascriptUnbind + """)("showDefault", showDefault)])})
        }
      """
    )
  
    // @LINE:55
    def GetPhoto: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.PhotoController.GetPhoto",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "photo/encounter/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:35
  class ReversePharmaciesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def editGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.PharmaciesController.editGet",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pharmacy/edit/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:37
    def indexGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.PharmaciesController.indexGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pharmacy"})
        }
      """
    )
  
    // @LINE:38
    def indexPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.PharmaciesController.indexPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "pharmacy"})
        }
      """
    )
  
    // @LINE:36
    def editPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.PharmaciesController.editPost",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "pharmacy/edit/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseApplicationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def removeTrailingSlash: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.ApplicationController.removeTrailingSlash",
      """
        function(path) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("path", path) + "/"})
        }
      """
    )
  
  }

  // @LINE:40
  class ReverseHistoryController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def updateEncounterPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.HistoryController.updateEncounterPost",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "history/encounter/updateField/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:42
    def listTabFieldHistoryGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.HistoryController.listTabFieldHistoryGet",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "history/encounter/listTabFieldHistory/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:40
    def indexEncounterGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.HistoryController.indexEncounterGet",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "history/encounter/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:43
    def indexPatientGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.HistoryController.indexPatientGet",
      """
        function(query) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "history/patient/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("query", encodeURIComponent(query))})
        }
      """
    )
  
  }

  // @LINE:83
  class ReverseReferenceController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:83
    def indexGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.ReferenceController.indexGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reference"})
        }
      """
    )
  
  }

  // @LINE:85
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:85
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:63
  class ReverseMedicalController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:69
    def indexPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.MedicalController.indexPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "medical"})
        }
      """
    )
  
    // @LINE:65
    def listVitalsGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.MedicalController.listVitalsGet",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medical/listVitals/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:63
    def updateVitalsPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.MedicalController.updateVitalsPost",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "medical/updateVitals/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:64
    def newVitalsGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.MedicalController.newVitalsGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medical/newVitals"})
        }
      """
    )
  
    // @LINE:66
    def editGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.MedicalController.editGet",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medical/edit/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:70
    def prescriptionRowGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.MedicalController.prescriptionRowGet",
      """
        function(index) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medical/prescriptionRow/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("index", index)})
        }
      """
    )
  
    // @LINE:67
    def editPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.MedicalController.editPost",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "medical/edit/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:68
    def indexGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.MedicalController.indexGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medical"})
        }
      """
    )
  
  }

  // @LINE:45
  class ReverseSearchController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def typeaheadPatientsJSONGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SearchController.typeaheadPatientsJSONGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/typeahead/patients"})
        }
      """
    )
  
    // @LINE:46
    def doesPatientExist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SearchController.doesPatientExist",
      """
        function(query) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/check/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("query", encodeURIComponent(query))})
        }
      """
    )
  
    // @LINE:50
    def typeaheadDiagnosisJSONGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SearchController.typeaheadDiagnosisJSONGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/typeahead/diagnoses"})
        }
      """
    )
  
    // @LINE:51
    def typeaheadMedicationsWithIDJSONGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SearchController.typeaheadMedicationsWithIDJSONGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/typeahead/medicationsWithID"})
        }
      """
    )
  
    // @LINE:49
    def typeaheadCitiesJSONGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SearchController.typeaheadCitiesJSONGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/typeahead/cities"})
        }
      """
    )
  
    // @LINE:45
    def handleSearch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SearchController.handleSearch",
      """
        function(page) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("page", encodeURIComponent(page))})
        }
      """
    )
  
    // @LINE:52
    def typeaheadMedicationAdministrationsJSONGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SearchController.typeaheadMedicationAdministrationsJSONGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/typeahead/medicationAdministrations"})
        }
      """
    )
  
  }

  // @LINE:72
  class ReverseResearchController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:72
    def indexGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.ResearchController.indexGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "research"})
        }
      """
    )
  
    // @LINE:74
    def exportPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.ResearchController.exportPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "research/exportData"})
        }
      """
    )
  
    // @LINE:73
    def indexPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.ResearchController.indexPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "research"})
        }
      """
    )
  
  }

  // @LINE:76
  class ReversePDFController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:76
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.PDFController.index",
      """
        function(encounterId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdf/encounter/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("encounterId", encounterId)})
        }
      """
    )
  
  }

  // @LINE:78
  class ReverseSessionsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:79
    def editPasswordPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SessionsController.editPasswordPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/reset"})
        }
      """
    )
  
    // @LINE:78
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SessionsController.delete",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:80
    def createPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SessionsController.createPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:81
    def createGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SessionsController.createGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:57
  class ReverseTriageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def indexGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.TriageController.indexGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "triage"})
        }
      """
    )
  
    // @LINE:59
    def indexPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.TriageController.indexPost",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "triage" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("id", id)])})
        }
      """
    )
  
    // @LINE:60
    def deletePatientPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.TriageController.deletePatientPost",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "triage/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:57
    def indexPopulatedGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.TriageController.indexPopulatedGet",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "triage/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }


}