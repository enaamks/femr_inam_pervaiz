
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/conf/routes
// @DATE:Wed Nov 09 11:47:19 CST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package femr.ui.controllers {

  // @LINE:54
  class ReversePhotoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def GetPatientPhoto(id:Integer, showDefault:Boolean): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "photo/patient/" + implicitly[PathBindable[Integer]].unbind("id", id) + queryString(List(Some(implicitly[QueryStringBindable[Boolean]].unbind("showDefault", showDefault)))))
    }
  
    // @LINE:55
    def GetPhoto(id:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "photo/encounter/" + implicitly[PathBindable[Int]].unbind("id", id))
    }
  
  }

  // @LINE:35
  class ReversePharmaciesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def editGet(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pharmacy/edit/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:37
    def indexGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pharmacy")
    }
  
    // @LINE:38
    def indexPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "pharmacy")
    }
  
    // @LINE:36
    def editPost(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "pharmacy/edit/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
  }

  // @LINE:5
  class ReverseApplicationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def removeTrailingSlash(path:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("path", path) + "/")
    }
  
  }

  // @LINE:40
  class ReverseHistoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def updateEncounterPost(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "history/encounter/updateField/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:42
    def listTabFieldHistoryGet(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "history/encounter/listTabFieldHistory/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:40
    def indexEncounterGet(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "history/encounter/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:43
    def indexPatientGet(query:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "history/patient/" + implicitly[PathBindable[String]].unbind("query", dynamicString(query)))
    }
  
  }

  // @LINE:83
  class ReverseReferenceController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:83
    def indexGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "reference")
    }
  
  }

  // @LINE:85
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:85
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:63
  class ReverseMedicalController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:69
    def indexPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "medical")
    }
  
    // @LINE:65
    def listVitalsGet(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medical/listVitals/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:63
    def updateVitalsPost(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "medical/updateVitals/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:64
    def newVitalsGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medical/newVitals")
    }
  
    // @LINE:66
    def editGet(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medical/edit/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:70
    def prescriptionRowGet(index:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medical/prescriptionRow/" + implicitly[PathBindable[Integer]].unbind("index", index))
    }
  
    // @LINE:67
    def editPost(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "medical/edit/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:68
    def indexGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medical")
    }
  
  }

  // @LINE:45
  class ReverseSearchController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def typeaheadPatientsJSONGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "search/typeahead/patients")
    }
  
    // @LINE:46
    def doesPatientExist(query:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "search/check/" + implicitly[PathBindable[String]].unbind("query", dynamicString(query)))
    }
  
    // @LINE:50
    def typeaheadDiagnosisJSONGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "search/typeahead/diagnoses")
    }
  
    // @LINE:51
    def typeaheadMedicationsWithIDJSONGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "search/typeahead/medicationsWithID")
    }
  
    // @LINE:49
    def typeaheadCitiesJSONGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "search/typeahead/cities")
    }
  
    // @LINE:45
    def handleSearch(page:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "search/" + implicitly[PathBindable[String]].unbind("page", dynamicString(page)))
    }
  
    // @LINE:52
    def typeaheadMedicationAdministrationsJSONGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "search/typeahead/medicationAdministrations")
    }
  
  }

  // @LINE:72
  class ReverseResearchController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:72
    def indexGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "research")
    }
  
    // @LINE:74
    def exportPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "research/exportData")
    }
  
    // @LINE:73
    def indexPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "research")
    }
  
  }

  // @LINE:76
  class ReversePDFController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:76
    def index(encounterId:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdf/encounter/" + implicitly[PathBindable[Integer]].unbind("encounterId", encounterId))
    }
  
  }

  // @LINE:78
  class ReverseSessionsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:79
    def editPasswordPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login/reset")
    }
  
    // @LINE:78
    def delete(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:80
    def createPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:81
    def createGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:57
  class ReverseTriageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def indexGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "triage")
    }
  
    // @LINE:59
    def indexPost(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "triage" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("id", id)))))
    }
  
    // @LINE:60
    def deletePatientPost(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "triage/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:57
    def indexPopulatedGet(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "triage/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
  }


}