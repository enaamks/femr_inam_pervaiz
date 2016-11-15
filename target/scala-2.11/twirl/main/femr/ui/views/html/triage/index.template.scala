
package femr.ui.views.html.triage

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[femr.common.dtos.CurrentUser,femr.ui.models.triage.IndexViewModelGet,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser, viewModel: femr.ui.models.triage.IndexViewModelGet):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.common.models.CityItem
import femr.ui.views.html.layouts.main
import femr.ui.views.html.partials.search
import femr.ui.controllers.routes.TriageController
import femr.ui.controllers.routes.HistoryController
import femr.ui.views.html.partials.triage._
import femr.ui.controllers.routes.SearchController
import femr.ui.views.html.partials.helpers.outputStringOrNA
def /*13.6*/additionalScripts/*13.23*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.27*/("""
        """),format.raw/*14.9*/("""<script type="text/javascript" src=""""),_display_(/*14.46*/routes/*14.52*/.Assets.versioned("js/libraries/touchit-1.0.0.js")),format.raw/*14.102*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*15.46*/routes/*15.52*/.Assets.versioned("js/libraries/jquery.jWindowCrop.js")),format.raw/*15.107*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*16.46*/routes/*16.52*/.Assets.versioned("js/triage/triage.js")),format.raw/*16.92*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*17.46*/routes/*17.52*/.Assets.versioned("js/shared/femr.js")),format.raw/*17.90*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*18.46*/routes/*18.52*/.Assets.versioned("js/libraries/exif.js")),format.raw/*18.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*19.46*/routes/*19.52*/.Assets.versioned("js/libraries/megapix-image.js")),format.raw/*19.102*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*20.46*/routes/*20.52*/.Assets.versioned("js/triage/triageClientValidation.js")),format.raw/*20.108*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*21.46*/routes/*21.52*/.Assets.versioned("js/shared/vitalClientValidation.js")),format.raw/*21.107*/(""""></script>
            <script type="text/javascript" src=""""),_display_(/*22.50*/routes/*22.56*/.Assets.versioned("js/libraries/handlebars.min.js")),format.raw/*22.107*/(""""></script>
            <script type="text/javascript" src=""""),_display_(/*23.50*/routes/*23.56*/.Assets.versioned("js/libraries/typeahead.bundle.min.js")),format.raw/*23.113*/(""""></script>
    """)))};def /*25.6*/additionalStyles/*25.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*25.26*/("""
        """),format.raw/*26.9*/("""<link rel="stylesheet" href=""""),_display_(/*26.39*/routes/*26.45*/.Assets.versioned("css/triage.css")),format.raw/*26.80*/("""">
        <link rel="stylesheet" href=""""),_display_(/*27.39*/routes/*27.45*/.Assets.versioned("css/libraries/datepicker.css")),format.raw/*27.94*/("""">
    """)))};
Seq[Any](format.raw/*1.97*/("""

"""),format.raw/*11.1*/("""

    """),format.raw/*24.6*/("""
    """),format.raw/*28.6*/("""
"""),_display_(/*29.2*/main("Triage", currentUser, styles = additionalStyles, scripts = additionalScripts, search = search("triage"))/*29.112*/ {_display_(Seq[Any](format.raw/*29.114*/("""

    """),format.raw/*31.5*/("""<div id="triageContentWrap">
        """),_display_(/*32.10*/if(viewModel.isSearchError)/*32.37*/ {_display_(Seq[Any](format.raw/*32.39*/("""
            """),format.raw/*33.13*/("""<p>That patient could not be found.</p>
        """)))}),format.raw/*34.10*/("""
        """),_display_(/*35.10*/if(viewModel.isLinkToMedical())/*35.41*/{_display_(Seq[Any](format.raw/*35.42*/("""

           """),format.raw/*37.12*/("""<p class="newEncounterWrap"> Patient has an open encounter <a class="btn btn-danger" href="/medical/edit/"""),_display_(/*37.118*/viewModel/*37.127*/.getPatient().getId()),format.raw/*37.148*/("""">Go To Medical</a></p>
        """)))}),format.raw/*38.10*/("""
        """),format.raw/*39.9*/("""<h2 class="text-center">Check In - Triage</h2>

        """),_display_(/*41.10*/helper/*41.16*/.form(action = TriageController.indexPost(viewModel.getPatient.getId), 'class -> "form-horizontal", 'enctype -> "multipart/form-data")/*41.150*/ {_display_(Seq[Any](format.raw/*41.152*/("""
            """),format.raw/*42.13*/("""<div id="genInfoWrap" class="sectionBackground backgroundForWrap">

                <h2>General Info</h2>

                """),_display_(/*46.18*/inputText("First Name", "firstName", true, if(viewModel != null) viewModel.getPatient.getFirstName else null, "text")),format.raw/*46.135*/("""
                """),_display_(/*47.18*/inputText("Last Name", "lastName", true, if(viewModel != null) viewModel.getPatient.getLastName else null, "text")),format.raw/*47.132*/("""
                """),_display_(/*48.18*/inputText("Address", "address", false, if(viewModel != null) viewModel.getPatient.getAddress else null, "text")),format.raw/*48.129*/("""
                """),format.raw/*49.17*/("""<div class="generalInfoInput" id="citySearchContainer">
                    <label for="city">City<span class="red bold">*</span></label>
                    """),_display_(/*51.22*/if(viewModel.getPatient.getCity == null)/*51.62*/ {_display_(Seq[Any](format.raw/*51.64*/("""
                        """),format.raw/*52.25*/("""<input type = "text" class="citySearch fInput" name="city" id="city" required>
                    """)))}/*53.23*/else/*53.28*/{_display_(Seq[Any](format.raw/*53.29*/("""
                        """),format.raw/*54.25*/("""<input type = "text" class="citySearch fInput" name="city" id="city" value=""""),_display_(/*54.102*/viewModel/*54.111*/.getPatient.getCity),format.raw/*54.130*/(""""readonly>
                        """)))}),format.raw/*55.26*/("""

                """),format.raw/*57.17*/("""</div>


                <div id="ageClassificationWrap">
                    <label>Age<span class="red bold">*</span></label>
                    """),_display_(/*62.22*/inputAge("Age", "Years", "years", "Months", "months", if(viewModel != null) viewModel.getPatient else null)),format.raw/*62.129*/("""
                    """),format.raw/*63.21*/("""<span class="orSpan">OR</span>
                    """),_display_(/*64.22*/inputDate("Birth Date", "age", if(viewModel != null) viewModel.getPatient.getBirth else null)),format.raw/*64.115*/("""
                    """),format.raw/*65.21*/("""<span class="orSpan">OR</span>
                    <div class="generalInfoInput">
                        <div id="classificationRadioWrap">
                        """),_display_(/*68.26*/for((key, valyew) <- viewModel.getPossibleAgeClassifications) yield /*68.87*/ {_display_(Seq[Any](format.raw/*68.89*/("""
                            """),format.raw/*69.29*/("""<label><input type="radio" name="ageClassification" value=""""),_display_(/*69.89*/key),format.raw/*69.92*/("""" /> """),_display_(/*69.98*/key),format.raw/*69.101*/(""" """),format.raw/*69.102*/("""<span>"""),_display_(/*69.109*/valyew),format.raw/*69.115*/("""</span></label>
                        """)))}),format.raw/*70.26*/("""

                        """),format.raw/*72.25*/("""</div>
                    </div>

                </div>

                """),_display_(/*77.18*/inputGender(viewModel)),format.raw/*77.40*/("""


                """),format.raw/*80.17*/("""<div class="generalInfoInput">


                    <label for="photo">Patient Photo</label>
                    <div id="photoInputFormDiv">
                        <input type="file" class="fInput" id="photoInput" name="patientPhoto" placeholder="Choose Image" />
                        <textarea id="photoInputCropped" class="hidden" name="patientPhotoCropped"></textarea>
                    </div>
                    <div id="patientPhotoDiv" hidden="true">
                        <div class="btn-group" >
                            <img id="patientPhoto" class="crop_me" alt="" src=""""),_display_(/*90.81*/viewModel/*90.90*/.getPatient.getPathToPhoto),format.raw/*90.116*/("""" />

                            <div class="btn-toolbar" role="buttons">
                                <div class="btn-group" id="zoomControls">
                                    <button type="button" id="btnZoomIn" class="btn btn-default btn-lg">
                                        <span class="glyphicon glyphicon-zoom-in"></span>
                                    </button>
                                    <button type="button" id="btnZoomOut" class="btn btn-default btn-lg">
                                        <span class="glyphicon glyphicon-zoom-out"></span>
                                    </button>
                                </div>
                                <div class="btn-group">
                                    <button id="btnDeletePhoto" type="button" class="btn btn-danger btn-lg pull-right">
                                        <span class="glyphicon glyphicon-trash"></span>
                                    </button>
                                </div>
                            </div>
                            <canvas id="patientPhotoCanvas" class="hidden"></canvas>
                        </div>
                    </div>
                    <input class="hidden" type="checkbox" name="deletePhoto" value="true" id="deletePhoto">


                </div>

            </div>

            <div id="vitalsWrap" class="sectionBackground backgroundForWrap">
                <h2>Vitals</h2>

                <div id="vitalContainer">

                    <div id="leftVitalsWrap">
                        <!-- Alaa Serhan - Referenced in triage.js for calculating proper BMI
                            as well as in vitalClientValidation.js for validating height inputs -->
                        """),_display_(/*125.26*/if(viewModel.getSettings.isMetric)/*125.60*/ {_display_(Seq[Any](format.raw/*125.62*/("""
                            """),format.raw/*126.29*/("""<input type="hidden" id="vitalsUnits" value="metric" />
                        """)))}/*127.27*/else/*127.32*/{_display_(Seq[Any](format.raw/*127.33*/("""
                            """),format.raw/*128.29*/("""<input type="hidden" id="vitalUnits" value="imp" />
                        """)))}),format.raw/*129.26*/("""

                        """),format.raw/*131.25*/("""<div class="vitalWrap">
                            <label for="temperature">Temperature</label> <!---  Alaa Serhan -->
                            """),_display_(/*133.30*/if(viewModel.getSettings.isMetric)/*133.64*/ {_display_(Seq[Any](format.raw/*133.66*/("""
                                """),format.raw/*134.33*/("""<input type="number" step="any" min="0" class="fInput fVital" id=""""),_display_(/*134.100*/viewModel/*134.109*/.getVitalNames.get(2).getName),format.raw/*134.138*/("""" name=""""),_display_(/*134.147*/viewModel/*134.156*/.getVitalNames.get(2).getName),format.raw/*134.185*/("""" placeholder="&#176;C"/>
                            """)))}/*135.31*/else/*135.36*/{_display_(Seq[Any](format.raw/*135.37*/("""
                                """),format.raw/*136.33*/("""<input type="number" step="any" min="0" class="fInput fVital" id=""""),_display_(/*136.100*/viewModel/*136.109*/.getVitalNames.get(2).getName),format.raw/*136.138*/("""" name=""""),_display_(/*136.147*/viewModel/*136.156*/.getVitalNames.get(2).getName),format.raw/*136.185*/("""" placeholder="&#176;F"/>
                            """)))}),format.raw/*137.30*/("""

                        """),format.raw/*139.25*/("""</div>

                        <div class="vitalWrap">
                            <label for="bloodPressureSystolic">Blood Pressure</label>
                            <div class="doubleVital">
                                <input type="number" step="number" min="0" class="fInput" id=""""),_display_(/*144.96*/viewModel/*144.105*/.getVitalNames.get(7).getName),format.raw/*144.134*/("""" placeholder="Systolic" name=""""),_display_(/*144.166*/viewModel/*144.175*/.getVitalNames.get(7).getName),format.raw/*144.204*/(""""/>
                                <input type="number" step="number" min="0" class="fInput" id=""""),_display_(/*145.96*/viewModel/*145.105*/.getVitalNames.get(8).getName),format.raw/*145.134*/("""" placeholder="Diastolic" name=""""),_display_(/*145.167*/viewModel/*145.176*/.getVitalNames.get(8).getName),format.raw/*145.205*/(""""/>
                            </div>
                        </div>
                        <div class="vitalWrap">
                            <label for="heartRate">Heart Rate</label>
                            <input type="number" step="number" min="0" class="fInput" id=""""),_display_(/*150.92*/viewModel/*150.101*/.getVitalNames.get(1).getName),format.raw/*150.130*/("""" name=""""),_display_(/*150.139*/viewModel/*150.148*/.getVitalNames.get(1).getName),format.raw/*150.177*/("""" placeholder="bpm"/>
                        </div>

                        <div class="vitalWrap">
                            <label for="respirations">Respirations</label>
                            <input type="number" step="number" min="0" class="fInput" id=""""),_display_(/*155.92*/viewModel/*155.101*/.getVitalNames.get(0).getName),format.raw/*155.130*/("""" name=""""),_display_(/*155.139*/viewModel/*155.148*/.getVitalNames.get(0).getName),format.raw/*155.177*/("""" placeholder="bpm"/>
                        </div>

                        <div class="vitalWrap">
                            <label for="weeksPregnant">Weeks Pregnant</label>


                            """),_display_(/*162.30*/if(viewModel.getPatient.getSex == "Female")/*162.73*/ {_display_(Seq[Any](format.raw/*162.75*/("""
                                """),format.raw/*163.33*/("""<input type="number" step="number" min="0" class="fInput" id="weeksPregnant" name="weeksPregnant" placeholder="Weeks"/>
                            """)))}/*164.31*/else/*164.36*/{_display_(Seq[Any](format.raw/*164.37*/("""
                                """),format.raw/*165.33*/("""<input type="number" step="number" min="0" class="fInput" id="weeksPregnant" name="weeksPregnant" placeholder="Weeks" disabled/>
                            """)))}),format.raw/*166.30*/("""


                        """),format.raw/*169.25*/("""</div>

                    </div>


                    <div id="rightVitalsWrap">
                        """),_display_(/*175.26*/if(viewModel.getSettings.isMetric)/*175.60*/ {_display_(Seq[Any](format.raw/*175.62*/(""" """),format.raw/*175.63*/("""<!-- Alaa Serhan -->
                            <input type="hidden" id="vitalsUnits" value="metric" />
                        """)))}/*177.27*/else/*177.32*/{_display_(Seq[Any](format.raw/*177.33*/("""
                            """),format.raw/*178.29*/("""<input type="hidden" id="vitalUnits" value="imp" />
                        """)))}),format.raw/*179.26*/("""


                        """),format.raw/*182.25*/("""<div class="vitalWrap">
                            <label for="oxygen">Oxygen Saturation</label>

                            <input type="number" step="any" min="0" class="fInput" id=""""),_display_(/*185.89*/viewModel/*185.98*/.getVitalNames.get(3).getName),format.raw/*185.127*/("""" name=""""),_display_(/*185.136*/viewModel/*185.145*/.getVitalNames.get(3).getName),format.raw/*185.174*/("""" placeholder="%"/>
                        </div>
                        <div class="vitalWrap">

                            <label for="heightFeet">Height</label>
                            <div class="doubleVital">
                                """),_display_(/*191.34*/if(viewModel.getSettings.isMetric)/*191.68*/ {_display_(Seq[Any](format.raw/*191.70*/(""" """),format.raw/*191.71*/("""<!---  Alaa Serhan -->
                                    <input type="number" step="number" min="0" class="fInput" id=""""),_display_(/*192.100*/viewModel/*192.109*/.getVitalNames.get(4).getName),format.raw/*192.138*/("""" placeholder="Meters" name=""""),_display_(/*192.168*/viewModel/*192.177*/.getVitalNames.get(4).getName),format.raw/*192.206*/(""""/>
                                    <input type="number" step="number" min="0" max="99" class="fInput" id=""""),_display_(/*193.109*/viewModel/*193.118*/.getVitalNames.get(5).getName),format.raw/*193.147*/("""" placeholder="Centimeters" name=""""),_display_(/*193.182*/viewModel/*193.191*/.getVitalNames.get(5).getName),format.raw/*193.220*/(""""/>
                                """)))}/*194.35*/else/*194.40*/{_display_(Seq[Any](format.raw/*194.41*/("""
                                    """),format.raw/*195.37*/("""<input type="number" step="number" min="0" class="fInput" id=""""),_display_(/*195.100*/viewModel/*195.109*/.getVitalNames.get(4).getName),format.raw/*195.138*/("""" placeholder="Feet" name=""""),_display_(/*195.166*/viewModel/*195.175*/.getVitalNames.get(4).getName),format.raw/*195.204*/(""""/>
                                    <input type="number" step="number" min="0" max="11" class="fInput" id=""""),_display_(/*196.109*/viewModel/*196.118*/.getVitalNames.get(5).getName),format.raw/*196.147*/("""" placeholder="Inches" name=""""),_display_(/*196.177*/viewModel/*196.186*/.getVitalNames.get(5).getName),format.raw/*196.215*/(""""/>
                                """)))}),format.raw/*197.34*/("""
                            """),format.raw/*198.29*/("""</div>
                        </div>
                        <div class="vitalWrap">
                            <label for="weight">Weight</label>
                            """),_display_(/*202.30*/if(viewModel.getSettings.isMetric)/*202.64*/ {_display_(Seq[Any](format.raw/*202.66*/(""" """),format.raw/*202.67*/("""<!---  Alaa Serhan -->
                                <input type="number" step="any" min="0" class="fInput" id=""""),_display_(/*203.93*/viewModel/*203.102*/.getVitalNames.get(6).getName),format.raw/*203.131*/("""" name=""""),_display_(/*203.140*/viewModel/*203.149*/.getVitalNames.get(6).getName),format.raw/*203.178*/("""" placeholder="kgs"/>
                            """)))}/*204.31*/else/*204.36*/{_display_(Seq[Any](format.raw/*204.37*/("""
                                """),format.raw/*205.33*/("""<input type="number" step="any" min="0" class="fInput" id=""""),_display_(/*205.93*/viewModel/*205.102*/.getVitalNames.get(6).getName),format.raw/*205.131*/("""" name=""""),_display_(/*205.140*/viewModel/*205.149*/.getVitalNames.get(6).getName),format.raw/*205.178*/("""" placeholder="lbs"/>
                            """)))}),format.raw/*206.30*/("""

                        """),format.raw/*208.25*/("""</div>
                        <div class="vitalWrap">
                            <label >BMI</label>

                            <input type="text" id="bmi" class="fInput" disabled="true"/>
                        </div>
                        <div class="vitalWrap">
                            <label>Glucose</label>

                            <input type="number" step="number" min="0" class="fInput" id=""""),_display_(/*217.92*/viewModel/*217.101*/.getVitalNames.get(9).getName),format.raw/*217.130*/("""" name=""""),_display_(/*217.139*/viewModel/*217.148*/.getVitalNames.get(9).getName),format.raw/*217.177*/("""" placeholder="mg/dl"/>
                        </div>
                    </div>

                </div>
                <div id="chiefComplaintWrap">

                    <div id="chiefComplaintTitle">
                        <label for="chiefComplaint">
                            """),_display_(/*226.30*/if(viewModel.getSettings.isMultipleChiefComplaint)/*226.80*/ {_display_(Seq[Any](format.raw/*226.82*/("""
                                """),format.raw/*227.33*/("""<span id="addChiefComplaint">+</span>
                            """)))}),format.raw/*228.30*/("""
                            """),format.raw/*229.29*/("""Chief Complaint
                        </label>
                    </div>
                    <input type="text" class="hidden" name="chiefComplaintsJSON"/>

                    <textarea class="fTextArea" id="chiefComplaint" name="chiefComplaint"></textarea>
                    """),_display_(/*235.22*/if(viewModel.getSettings.isMultipleChiefComplaint)/*235.72*/ {_display_(Seq[Any](format.raw/*235.74*/("""
                        """),format.raw/*236.25*/("""<ol id="chiefComplaintList">
                            """),format.raw/*237.120*/("""
                        """),format.raw/*238.25*/("""</ol>
                    """)))}),format.raw/*239.22*/("""

                """),format.raw/*241.17*/("""</div>

                <div class="submitResetWrap hidden">
                    <h3>Did you screen this patient for Diabetes?</h3>
                    <button type="submit" id="noDiabetesScreen" class="fButton fSubmitButton pull-right">
                        No</button>
                    <button type="submit" id="yesDiabetesScreen" class="fButton fSubmitButton pull-left">
                        Yes</button>
                        <!-- Data elements for server-side logic, Diabetes Screen
                             Initial value for isDiabetesScreenPerformed set to empty string, only if
                             prompted will it receive a true/false value -->
                    <input type="hidden" id="isDiabetesScreenSettingEnabled" value=""""),_display_(/*252.86*/viewModel/*252.95*/.getSettings.isDiabetesPrompt),format.raw/*252.124*/(""""/>
                    <input type="hidden" name="isDiabetesScreenPerformed" value="" />
                </div>
                """)))}),format.raw/*255.18*/("""
        """),format.raw/*256.9*/("""<div class="submitResetWrap">
            <button type="submit" id="triageSubmitBtn" class="fButton fRedButton fSubmitButton pull-right">
                Submit Patient</button>
            <button type="button" class="fButton fOtherButton newPatientBtn pull-left">Reset Fields</button>


            """),_display_(/*262.14*/if(viewModel.getPatient.getId != 0)/*262.49*/ {_display_(Seq[Any](format.raw/*262.51*/("""
                """),format.raw/*263.17*/("""<a href=""""),_display_(/*263.27*/HistoryController/*263.44*/.indexPatientGet(viewModel.getPatient.getId.toString)),format.raw/*263.97*/("""" class="fButton fOtherButton pull-left">Patient History</a>
            """)))}),format.raw/*264.14*/("""

        """),format.raw/*266.9*/("""</div>




    </div>


    </div>
""")))}),format.raw/*275.2*/("""
"""))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,viewModel:femr.ui.models.triage.IndexViewModelGet): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,viewModel)

  def f:((femr.common.dtos.CurrentUser,femr.ui.models.triage.IndexViewModelGet) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,viewModel) => apply(currentUser,viewModel)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:20 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/triage/index.scala.html
                  HASH: b9fc93d3680ff4e4361a82db6bc36604997ab529
                  MATRIX: 822->1|1369->499|1395->516|1476->520|1513->530|1577->567|1592->573|1664->623|1749->681|1764->687|1841->742|1926->800|1941->806|2002->846|2087->904|2102->910|2161->948|2246->1006|2261->1012|2323->1053|2408->1111|2423->1117|2495->1167|2580->1225|2595->1231|2673->1287|2758->1345|2773->1351|2850->1406|2939->1468|2954->1474|3027->1525|3116->1587|3131->1593|3210->1650|3251->1675|3276->1691|3357->1695|3394->1705|3451->1735|3466->1741|3522->1776|3591->1818|3606->1824|3676->1873|3724->96|3755->490|3790->1668|3823->1882|3852->1885|3972->1995|4013->1997|4048->2005|4114->2044|4150->2071|4190->2073|4232->2087|4313->2137|4351->2148|4391->2179|4430->2180|4473->2195|4607->2301|4626->2310|4669->2331|4734->2365|4771->2375|4857->2434|4872->2440|5016->2574|5057->2576|5099->2590|5254->2718|5393->2835|5439->2854|5575->2968|5621->2987|5754->3098|5800->3116|5988->3277|6037->3317|6077->3319|6131->3345|6251->3447|6264->3452|6303->3453|6357->3479|6462->3556|6481->3565|6522->3584|6590->3621|6638->3641|6819->3795|6948->3902|6998->3924|7078->3977|7193->4070|7243->4092|7439->4261|7516->4322|7556->4324|7614->4354|7701->4414|7725->4417|7758->4423|7783->4426|7813->4427|7848->4434|7876->4440|7949->4482|8005->4510|8113->4591|8156->4613|8206->4635|8838->5240|8856->5249|8904->5275|10739->7082|10783->7116|10824->7118|10883->7148|10985->7231|10999->7236|11039->7237|11098->7267|11208->7345|11265->7373|11444->7524|11488->7558|11529->7560|11592->7594|11688->7661|11708->7670|11760->7699|11798->7708|11818->7717|11870->7746|11946->7803|11960->7808|12000->7809|12063->7843|12159->7910|12179->7919|12231->7948|12269->7957|12289->7966|12341->7995|12429->8051|12486->8079|12810->8375|12830->8384|12882->8413|12943->8445|12963->8454|13015->8483|13143->8583|13163->8592|13215->8621|13277->8654|13297->8663|13349->8692|13661->8976|13681->8985|13733->9014|13771->9023|13791->9032|13843->9061|14144->9334|14164->9343|14216->9372|14254->9381|14274->9390|14326->9419|14572->9637|14625->9680|14666->9682|14729->9716|14899->9867|14913->9872|14953->9873|15016->9907|15207->10066|15266->10096|15409->10211|15453->10245|15494->10247|15524->10248|15676->10381|15690->10386|15730->10387|15789->10417|15899->10495|15958->10525|16176->10715|16195->10724|16247->10753|16285->10762|16305->10771|16357->10800|16645->11060|16689->11094|16730->11096|16760->11097|16912->11220|16932->11229|16984->11258|17043->11288|17063->11297|17115->11326|17257->11439|17277->11448|17329->11477|17393->11512|17413->11521|17465->11550|17523->11589|17537->11594|17577->11595|17644->11633|17736->11696|17756->11705|17808->11734|17865->11762|17885->11771|17937->11800|18079->11913|18099->11922|18151->11951|18210->11981|18230->11990|18282->12019|18352->12057|18411->12087|18621->12269|18665->12303|18706->12305|18736->12306|18880->12422|18900->12431|18952->12460|18990->12469|19010->12478|19062->12507|19134->12560|19148->12565|19188->12566|19251->12600|19339->12660|19359->12669|19411->12698|19449->12707|19469->12716|19521->12745|19605->12797|19662->12825|20114->13249|20134->13258|20186->13287|20224->13296|20244->13305|20296->13334|20619->13629|20679->13679|20720->13681|20783->13715|20883->13783|20942->13813|21259->14102|21319->14152|21360->14154|21415->14180|21503->14329|21558->14355|21618->14383|21667->14403|22469->15177|22488->15186|22540->15215|22705->15348|22743->15358|23079->15666|23124->15701|23165->15703|23212->15721|23250->15731|23277->15748|23352->15801|23459->15876|23499->15888|23575->15933
                  LINES: 27->1|38->13|38->13|40->13|41->14|41->14|41->14|41->14|42->15|42->15|42->15|43->16|43->16|43->16|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|48->21|48->21|48->21|49->22|49->22|49->22|50->23|50->23|50->23|51->25|51->25|53->25|54->26|54->26|54->26|54->26|55->27|55->27|55->27|57->1|59->11|61->24|62->28|63->29|63->29|63->29|65->31|66->32|66->32|66->32|67->33|68->34|69->35|69->35|69->35|71->37|71->37|71->37|71->37|72->38|73->39|75->41|75->41|75->41|75->41|76->42|80->46|80->46|81->47|81->47|82->48|82->48|83->49|85->51|85->51|85->51|86->52|87->53|87->53|87->53|88->54|88->54|88->54|88->54|89->55|91->57|96->62|96->62|97->63|98->64|98->64|99->65|102->68|102->68|102->68|103->69|103->69|103->69|103->69|103->69|103->69|103->69|103->69|104->70|106->72|111->77|111->77|114->80|124->90|124->90|124->90|159->125|159->125|159->125|160->126|161->127|161->127|161->127|162->128|163->129|165->131|167->133|167->133|167->133|168->134|168->134|168->134|168->134|168->134|168->134|168->134|169->135|169->135|169->135|170->136|170->136|170->136|170->136|170->136|170->136|170->136|171->137|173->139|178->144|178->144|178->144|178->144|178->144|178->144|179->145|179->145|179->145|179->145|179->145|179->145|184->150|184->150|184->150|184->150|184->150|184->150|189->155|189->155|189->155|189->155|189->155|189->155|196->162|196->162|196->162|197->163|198->164|198->164|198->164|199->165|200->166|203->169|209->175|209->175|209->175|209->175|211->177|211->177|211->177|212->178|213->179|216->182|219->185|219->185|219->185|219->185|219->185|219->185|225->191|225->191|225->191|225->191|226->192|226->192|226->192|226->192|226->192|226->192|227->193|227->193|227->193|227->193|227->193|227->193|228->194|228->194|228->194|229->195|229->195|229->195|229->195|229->195|229->195|229->195|230->196|230->196|230->196|230->196|230->196|230->196|231->197|232->198|236->202|236->202|236->202|236->202|237->203|237->203|237->203|237->203|237->203|237->203|238->204|238->204|238->204|239->205|239->205|239->205|239->205|239->205|239->205|239->205|240->206|242->208|251->217|251->217|251->217|251->217|251->217|251->217|260->226|260->226|260->226|261->227|262->228|263->229|269->235|269->235|269->235|270->236|271->237|272->238|273->239|275->241|286->252|286->252|286->252|289->255|290->256|296->262|296->262|296->262|297->263|297->263|297->263|297->263|298->264|300->266|309->275
                  -- GENERATED --
              */
          