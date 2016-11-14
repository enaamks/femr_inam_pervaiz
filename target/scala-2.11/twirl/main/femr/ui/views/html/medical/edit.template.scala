
package femr.ui.views.html.medical

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object edit_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[femr.common.dtos.CurrentUser,femr.util.DataStructure.Mapping.VitalMultiMap,femr.ui.models.medical.EditViewModelGet,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser,
        vitals: femr.util.DataStructure.Mapping.VitalMultiMap,
        viewModel: femr.ui.models.medical.EditViewModelGet):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.controllers.routes.HistoryController
import femr.ui.controllers.routes.MedicalController
import femr.ui.controllers.routes.PharmaciesController
import femr.ui.views.html.layouts.main
import femr.ui.views.html.partials.search
import femr.ui.views.html.partials.medical.tabs._
import femr.ui.views.html.partials.patientOverview
import femr.ui.views.html.medical.listVitals
def /*14.6*/additionalStyles/*14.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.26*/("""
        """),format.raw/*15.9*/("""<link rel="stylesheet" href=""""),_display_(/*15.39*/routes/*15.45*/.Assets.versioned("css/medical/medical.css")),format.raw/*15.89*/("""">
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("css/libraries/jquery.tablescroll.css")),format.raw/*16.102*/("""">
        <link rel="stylesheet" href=""""),_display_(/*17.39*/routes/*17.45*/.Assets.versioned("css/libraries/jquery-ui.min.css")),format.raw/*17.97*/("""">
    """)))};def /*19.6*/additionalScripts/*19.23*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*19.27*/("""

        """),format.raw/*21.9*/("""<script type="text/javascript" src=""""),_display_(/*21.46*/routes/*21.52*/.Assets.versioned("js/libraries/handlebars.min.js")),format.raw/*21.103*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*22.46*/routes/*22.52*/.Assets.versioned("js/libraries/typeahead.bundle.min.js")),format.raw/*22.109*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*23.46*/routes/*23.52*/.Assets.versioned("js/medical/medical.js")),format.raw/*23.94*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*24.46*/routes/*24.52*/.Assets.versioned("js/medical/medicalClientValidation.js")),format.raw/*24.110*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*25.46*/routes/*25.52*/.Assets.versioned("js/libraries/jquery.tablescroll.js")),format.raw/*25.107*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*26.46*/routes/*26.52*/.Assets.versioned("js/libraries/jquery-ui.min.js")),format.raw/*26.102*/(""""></script>
    """)))};
Seq[Any](format.raw/*3.60*/("""

"""),format.raw/*13.1*/("""
    """),format.raw/*18.6*/("""
    """),format.raw/*27.6*/("""

"""),_display_(/*29.2*/main("Medical", currentUser, scripts = additionalScripts, styles = additionalStyles, search = search("medical"))/*29.114*/ {_display_(Seq[Any](format.raw/*29.116*/("""
    """),format.raw/*30.5*/("""<input type="hidden" value=""""),_display_(/*30.34*/viewModel/*30.43*/.getPatientItem.getId),format.raw/*30.64*/("""" id="patientId"/>

    <div id="medicalContentWrap">


        """),_display_(/*35.10*/patientOverview(viewModel.getPatientItem, viewModel.getPatientEncounterItem, viewModel.getSettings, "Medical - " + "Patient ID: " + viewModel.getPatientItem.getId)),format.raw/*35.173*/("""


        """),format.raw/*38.9*/("""<div id="mainWrap" class="backgroundForWrap">
            <div id="vitalsWrap">
                <!-- Alaa Serhan - Referenced in vitalClientValidation.js for validationg height inputs -->
                """),_display_(/*41.18*/if(viewModel.getSettings.isMetric)/*41.52*/ {_display_(Seq[Any](format.raw/*41.54*/("""
                    """),format.raw/*42.21*/("""<input type="hidden" id="vitalsUnits" value="metric" />
                """)))}/*43.19*/else/*43.24*/{_display_(Seq[Any](format.raw/*43.25*/("""
                    """),format.raw/*44.21*/("""<input type="hidden" id="vitalUnits" value="imp" />
                """)))}),format.raw/*45.18*/("""
                """),format.raw/*46.17*/("""<div id="vitalsPartial">
                        <!-- Repalaced when user clicks save in record new vitals dialog -->
                    """),_display_(/*48.22*/listVitals(vitals, viewModel)),format.raw/*48.51*/("""
                """),format.raw/*49.17*/("""</div>

                <button type="button" id="newVitalsBtn" class="fButton fOtherButton">Record New Vitals</button>

                <div id="newVitalsDialog" title="Record New Vitals">
                    <div id="newVitalsPartial">
                        """),format.raw/*55.78*/("""
                    """),format.raw/*56.21*/("""</div>
                </div>
            </div>

            <div id="inputWrap">
                """),_display_(/*61.18*/helper/*61.24*/.form(action = MedicalController.editPost(int2Integer(viewModel.getPatientItem.getId)), 'enctype -> "multipart/form-data")/*61.146*/ {_display_(Seq[Any](format.raw/*61.148*/("""
                    """),format.raw/*62.21*/("""<div class="tabWrap">
                        <ul id="medicalTabs" class="tabrow">
                            <li id="hpi">HPI</li>
                            <li id="treatment">Treatment</li>
                            """),_display_(/*66.30*/if(viewModel.getSettings.isPmhTab)/*66.64*/ {_display_(Seq[Any](format.raw/*66.66*/("""
                                """),format.raw/*67.33*/("""<li id="pmh">PMH</li>
                            """)))}),format.raw/*68.30*/("""
                            """),_display_(/*69.30*/if(viewModel.getSettings.isPhotoTab)/*69.66*/ {_display_(Seq[Any](format.raw/*69.68*/("""
                                """),format.raw/*70.33*/("""<li id="photos">Photos</li>
                            """)))}),format.raw/*71.30*/("""
                            """),format.raw/*72.57*/("""
                            """),_display_(/*73.30*/for(tab <- viewModel.getTabItems) yield /*73.63*/ {_display_(Seq[Any](format.raw/*73.65*/("""
                                """),_display_(/*74.34*/if(tab.isCustom)/*74.50*/ {_display_(Seq[Any](format.raw/*74.52*/("""
                                    """),format.raw/*75.37*/("""<li id=""""),_display_(/*75.46*/tab/*75.49*/.getName.toLowerCase),format.raw/*75.69*/("""">"""),_display_(/*75.72*/tab/*75.75*/.getName),format.raw/*75.83*/("""</li>
                                """)))}),format.raw/*76.34*/("""
                            """)))}),format.raw/*77.30*/("""
                        """),format.raw/*78.25*/("""</ul>
                    </div>

                    <div id="tabContentWrap">
                        """),_display_(/*82.26*/hpiTab(viewModel.getTabItemByName("hpi"), viewModel.getSettings.isConsolidateHPI, viewModel.getChiefComplaints)),format.raw/*82.137*/("""

                        """),_display_(/*84.26*/treatmentTab(viewModel.getTabItemByName("treatment"), viewModel.getPrescriptionItems, viewModel.getMedicationAdministrationItems, viewModel.getProblemItems)),format.raw/*84.182*/("""

                        """),_display_(/*86.26*/if(viewModel.getSettings.isPmhTab)/*86.60*/ {_display_(Seq[Any](format.raw/*86.62*/("""
                            """),_display_(/*87.30*/pmhTab(viewModel.getTabItemByName("pmh"))),format.raw/*87.71*/("""
                        """)))}),format.raw/*88.26*/("""

                        """),_display_(/*90.26*/if(viewModel.getSettings.isPhotoTab)/*90.62*/ {_display_(Seq[Any](format.raw/*90.64*/("""
                            """),_display_(/*91.30*/photoTab(viewModel.getPhotos)),format.raw/*91.59*/("""
                        """)))}),format.raw/*92.26*/("""

                        """),_display_(/*94.26*/for(tab <- viewModel.getTabItems) yield /*94.59*/ {_display_(Seq[Any](format.raw/*94.61*/("""
                            """),format.raw/*95.70*/("""
                            """),_display_(/*96.30*/if(tab.isCustom)/*96.46*/{_display_(Seq[Any](format.raw/*96.47*/("""
                                """),format.raw/*97.33*/("""<div class="controlWrap hidden" id=""""),_display_(/*97.70*/tab/*97.73*/.getName.toLowerCase()),format.raw/*97.95*/("""Control">
                                """),_display_(/*98.34*/dynamicTab(tab)),format.raw/*98.49*/("""
                                """),format.raw/*99.33*/("""</div>
                            """)))}),format.raw/*100.30*/("""
                        """)))}),format.raw/*101.26*/("""

                        """),format.raw/*103.25*/("""<div class="historySubmitWrap">
                            <button type="submit" id="medicalSubmitBtn" class="fButton fRedButton fSubmitButton pull-right">
                                Submit Patient</button>
                            """)))}),format.raw/*106.30*/("""

                            """),format.raw/*108.29*/("""<a href=""""),_display_(/*108.39*/{HistoryController.indexPatientGet(
                                Integer.toString(viewModel.getPatientItem.getId)).url}),format.raw/*109.87*/("""" class="fButton fOtherButton pull-left">Patient History</a>
                            <a href=""""),_display_(/*110.39*/{PharmaciesController.editGet(viewModel.getPatientItem.getId).url}),format.raw/*110.105*/("""" class="fButton fOtherButton pull-left">View in Pharmacy</a>
                        </div>

                    </div>

            </div>
        </div>
    </div>

""")))}),format.raw/*119.2*/("""


"""),format.raw/*122.1*/("""<div id="portraitTemplate">
    <div class="col-xs-12 col-sm-6 col-md-4" hidden="true">
        <div class="thumbnail">
            <img src="">
            <div class="caption">
                <div class="form-group">
                    <p name="photoDescription" ></p>
                    <div class="btn-group">
                        <button id="btnEditText" type="button" onclick="portraitEdit ( this )" class="btn btn-default btn-med">
                            <span class="glyphicon glyphicon-edit"></span> Edit Description
                        </button>
                    </div>
                    <div class="btn-group">
                        <button id="btnDeletePhoto" type="button" onclick="portraitDelete ( this )" class="btn btn-danger btn-med">
                            <span class="glyphicon glyphicon-trash"></span> Delete
                        </button>
                    </div>
                </div>
            </div>
        </div>
            <!-- Data elements for server-side logic -->
        <div name="dataList" hidden="true">
                <!-- Signals that user has requested to delete this photo from the database / server -->
            <input hidden="true" type="checkbox" name="deleteRequested" checked="false" value="false" />
                <!-- Signals that the user has updated a description -->
            <input hidden="true" type="checkbox" name="hasUpdatedDesc" checked="false" value="false" />
                <!-- Place holder for new images -->
            <input hidden="true" type="file" name="patientPhoto" />
                <!-- text for POST -->
            <input hidden="true" type="text" name="imageDescText" value="" />
                <!-- photo Id -->
            <input hidden="true" type="text" name="photoId" value="" />
        </div>
    </div>
</div>
<div class="modal fade" id="modalNewImage" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">New photo</h4>
            </div>
            <div class="modal-body">
                <div class="form-group">
                    <div class="thumbnail">
                        <img id="modalImg" src="" />
                    </div>
                    <label for="modalTextEntry" class="control-label">Description:</label>
                    <textarea rows="8" id="modalTextEntry" name="modalTextEntryName" class="form-control input-med" ></textarea>

                </div>
            </div>
            <div class="modal-footer">
                <button type="button" id="modalCancelPortrait" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" id="modalSavePortrait" class="btn btn-primary">Save changes</button>
            </div>
        </div>
    </div>
</div>
"""))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,vitals:femr.util.DataStructure.Mapping.VitalMultiMap,viewModel:femr.ui.models.medical.EditViewModelGet): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,vitals,viewModel)

  def f:((femr.common.dtos.CurrentUser,femr.util.DataStructure.Mapping.VitalMultiMap,femr.ui.models.medical.EditViewModelGet) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,vitals,viewModel) => apply(currentUser,vitals,viewModel)

  def ref: this.type = this

}


}

/**/
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:20 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/medical/edit.scala.html
                  HASH: 7c88f48c4f66569f075d732fac9202e5f03ccec4
                  MATRIX: 867->1|1499->582|1524->598|1605->602|1642->612|1699->642|1714->648|1779->692|1848->734|1863->740|1942->797|2011->839|2026->845|2099->897|2131->913|2157->930|2238->934|2277->946|2341->983|2356->989|2429->1040|2514->1098|2529->1104|2608->1161|2693->1219|2708->1225|2771->1267|2856->1325|2871->1331|2951->1389|3036->1447|3051->1453|3128->1508|3213->1566|3228->1572|3300->1622|3357->169|3388->575|3421->906|3454->1640|3485->1645|3607->1757|3648->1759|3681->1765|3737->1794|3755->1803|3797->1824|3894->1894|4079->2057|4120->2071|4355->2279|4398->2313|4438->2315|4488->2337|4581->2412|4594->2417|4633->2418|4683->2440|4784->2510|4830->2528|4998->2669|5048->2698|5094->2716|5390->3037|5440->3059|5572->3164|5587->3170|5719->3292|5760->3294|5810->3316|6065->3544|6108->3578|6148->3580|6210->3614|6293->3666|6351->3697|6396->3733|6436->3735|6498->3769|6587->3827|6645->3885|6703->3916|6752->3949|6792->3951|6854->3986|6879->4002|6919->4004|6985->4042|7021->4051|7033->4054|7074->4074|7104->4077|7116->4080|7145->4088|7216->4128|7278->4159|7332->4185|7468->4294|7601->4405|7657->4434|7835->4590|7891->4619|7934->4653|7974->4655|8032->4686|8094->4727|8152->4754|8208->4783|8253->4819|8293->4821|8351->4852|8401->4881|8459->4908|8515->4937|8564->4970|8604->4972|8662->5043|8720->5074|8745->5090|8784->5091|8846->5125|8910->5162|8922->5165|8965->5187|9036->5231|9072->5246|9134->5280|9203->5317|9262->5344|9319->5372|9596->5617|9657->5649|9695->5659|9840->5782|9968->5882|10057->5948|10266->6126|10300->6132
                  LINES: 27->1|40->14|40->14|42->14|43->15|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->19|46->19|48->19|50->21|50->21|50->21|50->21|51->22|51->22|51->22|52->23|52->23|52->23|53->24|53->24|53->24|54->25|54->25|54->25|55->26|55->26|55->26|57->3|59->13|60->18|61->27|63->29|63->29|63->29|64->30|64->30|64->30|64->30|69->35|69->35|72->38|75->41|75->41|75->41|76->42|77->43|77->43|77->43|78->44|79->45|80->46|82->48|82->48|83->49|89->55|90->56|95->61|95->61|95->61|95->61|96->62|100->66|100->66|100->66|101->67|102->68|103->69|103->69|103->69|104->70|105->71|106->72|107->73|107->73|107->73|108->74|108->74|108->74|109->75|109->75|109->75|109->75|109->75|109->75|109->75|110->76|111->77|112->78|116->82|116->82|118->84|118->84|120->86|120->86|120->86|121->87|121->87|122->88|124->90|124->90|124->90|125->91|125->91|126->92|128->94|128->94|128->94|129->95|130->96|130->96|130->96|131->97|131->97|131->97|131->97|132->98|132->98|133->99|134->100|135->101|137->103|140->106|142->108|142->108|143->109|144->110|144->110|153->119|156->122
                  -- GENERATED --
              */
          