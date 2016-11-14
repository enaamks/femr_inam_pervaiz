
package femr.ui.views.html.history

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object indexEncounter_Scope0 {
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

class indexEncounter extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[femr.common.dtos.CurrentUser,femr.ui.models.history.IndexEncounterViewModel,femr.ui.models.history.IndexEncounterMedicalViewModel,femr.ui.models.history.IndexEncounterPharmacyViewModel,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser, viewModel: femr.ui.models.history.IndexEncounterViewModel, viewModelMedical: femr.ui.models.history.IndexEncounterMedicalViewModel, viewModelPharmacy: femr.ui.models.history.IndexEncounterPharmacyViewModel):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.layouts.main
import femr.ui.views.html.partials.helpers.outputStringOrNA
import femr.ui.views.html.partials.helpers.outputIntOrNA
import femr.ui.views.html.partials.helpers.outputHeightOrNA
import femr.ui.views.html.partials.helpers.outputWeightOrNA
import femr.ui.views.html.partials.helpers.outputBloodPressureOrNA
import femr.ui.views.html.partials.helpers.outputTemperatureOrNA
import femr.ui.views.html.partials.encounter.dynamicTabSpan
import collection.JavaConversions._
import femr.ui.controllers.routes.PDFController
def /*18.6*/additionalScripts/*18.23*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*18.27*/("""
        """),format.raw/*19.9*/("""<script type="text/javascript" src=""""),_display_(/*19.46*/routes/*19.52*/.Assets.versioned("js/libraries/jquery-2.0.3.min.js")),format.raw/*19.105*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*20.46*/routes/*20.52*/.Assets.versioned("js/libraries/jquery.tablescroll.js")),format.raw/*20.107*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*21.46*/routes/*21.52*/.Assets.versioned("js/history/history.js")),format.raw/*21.94*/(""""></script>
    """)))};def /*23.6*/additionalStyles/*23.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*23.26*/("""
        """),format.raw/*24.9*/("""<link rel="stylesheet" href=""""),_display_(/*24.39*/routes/*24.45*/.Assets.versioned("css/libraries/jquery.tablescroll.css")),format.raw/*24.102*/("""">
        <link rel="stylesheet" href=""""),_display_(/*25.39*/routes/*25.45*/.Assets.versioned("css/history.css")),format.raw/*25.81*/("""">
    """)))};def /*29.6*/editClass/*29.15*/ = {{if(viewModel.getPatientEncounterItem.getIsClosed) "editable" else "nonEditable" }};
Seq[Any](format.raw/*1.252*/("""

    """),format.raw/*4.1*/("""    """),format.raw/*5.1*/("""    """),format.raw/*6.1*/("""    """),format.raw/*7.1*/("""    """),format.raw/*8.1*/("""    """),format.raw/*9.1*/("""
    """),format.raw/*11.1*/("""
    """),format.raw/*13.1*/("""
    """),format.raw/*15.1*/("""    """),format.raw/*16.1*/("""

    """),format.raw/*22.6*/("""
    """),format.raw/*26.6*/("""

    """),format.raw/*28.90*/("""
    """),format.raw/*29.101*/("""

    """),_display_(/*31.6*/main("History", currentUser, scripts = additionalScripts, styles = additionalStyles)/*31.90*/ {_display_(Seq[Any](format.raw/*31.92*/("""
        """),format.raw/*32.9*/("""<div class="sectionBackground backgroundForWrap" id="encounterViewWrap">
            <div id="encounterViewHeader">


                <img class="" height="90" width="90" src=""""),_display_(/*36.60*/viewModel/*36.69*/.getPatientItem.getPathToPhoto),format.raw/*36.99*/("""" />
                <p>"""),_display_(/*37.21*/viewModel/*37.30*/.getPatientItem.getFirstName),format.raw/*37.58*/(""" """),_display_(/*37.60*/viewModel/*37.69*/.getPatientItem.getLastName),format.raw/*37.96*/("""
                    """),format.raw/*38.21*/("""("""),_display_(/*38.23*/viewModel/*38.32*/.getPatientItem.getId),format.raw/*38.53*/(""")</p>

                <a href=""""),_display_(/*40.27*/PDFController/*40.40*/.index(viewModel.getPatientEncounterItem.getId)),format.raw/*40.87*/("""" target="_blank" id="historyButton" class="fButton fRedButton pull-right">Generate PDF</a>
            </div>

            <div class="encounterViewBodyHeader">
                <p>Basic Information and Vitals</p>
            </div>
            <div class="encounterViewBody">
                <input type="hidden" id="patientEncounterId" value=""""),_display_(/*47.70*/viewModel/*47.79*/.getPatientEncounterItem.getId),format.raw/*47.109*/("""" />
                <div class="encounterViewBodyLeft">
                """),_display_(/*49.18*/defining(viewModel.getPatientItem)/*49.52*/ { patient =>_display_(Seq[Any](format.raw/*49.65*/("""
                    """),format.raw/*50.21*/("""<div class="encounterViewBodyLeftHalf">
                        <p><span class="infoLabel">First Name:</span> """),_display_(/*51.72*/outputStringOrNA(patient.getFirstName)),format.raw/*51.110*/("""</p>
                        <p><span class="infoLabel">Last Name:</span> """),_display_(/*52.71*/outputStringOrNA(patient.getLastName)),format.raw/*52.108*/("""</p>
                        <p><span class="infoLabel">Address:</span> """),_display_(/*53.69*/outputStringOrNA(patient.getAddress)),format.raw/*53.105*/("""</p>
                        <p><span class="infoLabel">Birthday:</span> """),_display_(/*54.70*/outputStringOrNA(patient.getFriendlyDateOfBirth)),format.raw/*54.118*/("""</p>
                        <p><span class="infoLabel">Age:</span> """),_display_(/*55.65*/outputStringOrNA(patient.getAge)),format.raw/*55.97*/("""</p>
                        <p><span class="infoLabel">Gender:</span> """),_display_(/*56.68*/outputStringOrNA(patient.getSex)),format.raw/*56.100*/("""</p>
                    </div>
                    <div class="encounterViewBodyLeftHalf">
                        <!-- """),format.raw/*59.43*/(""" """),format.raw/*59.44*/("""-->
                        """),_display_(/*60.26*/defining(viewModelMedical.getVitalList)/*60.65*/ { vitalMap =>_display_(Seq[Any](format.raw/*60.79*/("""
                            """),format.raw/*61.29*/("""<p>
                                <span class="infoLabel">Weeks Pregnant:</span>
                                """),_display_(/*63.34*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*63.95*/ {_display_(Seq[Any](format.raw/*63.97*/("""
                                    """),format.raw/*64.37*/("""<span>
                                    """),_display_(/*65.38*/outputStringOrNA(vitalMap.get("weeksPregnant", vitalMap.getDate(dateIndex - 1)))),format.raw/*65.118*/("""
                                    """),format.raw/*66.37*/("""</span>
                                """)))}),format.raw/*67.34*/("""
                            """),format.raw/*68.29*/("""</p>
                        """)))}),format.raw/*69.26*/("""

                        """),format.raw/*71.25*/("""<p><span class="infoLabel">Height:</span> """),_display_(/*71.68*/outputHeightOrNA(
                            String.valueOf(patient.getHeightFeet),
                            String.valueOf(patient.getHeightInches),
                            viewModelMedical.getSettings.isMetric
                        )),format.raw/*75.26*/("""</p>
                        <p><span class="infoLabel">Weight:</span> """),_display_(/*76.68*/outputWeightOrNA(String.valueOf(patient.getWeight), viewModelMedical.getSettings.isMetric)),format.raw/*76.158*/("""</p>
                    </div>
                """)))}),format.raw/*78.18*/("""
                """),format.raw/*79.17*/("""</div>
                <div class="encounterViewBodyMiddle">
                """),_display_(/*81.18*/defining(viewModel.getPatientEncounterItem)/*81.61*/ { encounter =>_display_(Seq[Any](format.raw/*81.76*/("""
                    """),format.raw/*82.108*/("""
                    """),format.raw/*83.101*/("""
                    """),format.raw/*84.29*/("""
                    """),format.raw/*85.110*/("""
                    """),format.raw/*86.109*/("""
                    """),format.raw/*87.29*/("""
                    """),format.raw/*88.112*/("""
                    """),format.raw/*89.111*/("""

                    """),format.raw/*91.21*/("""<p><span class="infoLabel">Triage Visit:</span> """),_display_(/*91.70*/encounter/*91.79*/.getTriageDateOfVisit),format.raw/*91.100*/("""</p>
                    <p><span class="infoLabel">Nurse:</span> """),_display_(/*92.63*/encounter/*92.72*/.getNurseFullName),format.raw/*92.89*/("""</p> """),format.raw/*92.111*/("""
                    """),format.raw/*93.21*/("""<br>
                    <p><span class="infoLabel">Medical Visit:</span> """),_display_(/*94.71*/encounter/*94.80*/.getMedicalDateOfVisit),format.raw/*94.102*/("""</p>
                    <p><span class="infoLabel">Physician:</span> """),_display_(/*95.67*/encounter/*95.76*/.getPhysicianFullName),format.raw/*95.97*/("""</p> """),format.raw/*95.119*/("""
                    """),format.raw/*96.21*/("""<br>
                    <p><span class="infoLabel">Pharmacy Visit:</span> """),_display_(/*97.72*/encounter/*97.81*/.getPharmacyDateOfVisit),format.raw/*97.104*/("""</p>
                    <p><span class="infoLabel">Pharmacist:</span> """),_display_(/*98.68*/encounter/*98.77*/.getPharmacistFullName),format.raw/*98.99*/("""</p> """),format.raw/*98.121*/("""


                """)))}),format.raw/*101.18*/("""
                """),format.raw/*102.17*/("""</div>

                <div class="encounterViewBodyRight">
                """),_display_(/*105.18*/defining(viewModelMedical.getVitalList)/*105.57*/ { vitalMap =>_display_(Seq[Any](format.raw/*105.71*/("""
                    """),format.raw/*106.21*/("""<p>
                        <span class="infoLabel">Temperature:</span>

                        """),_display_(/*109.26*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*109.87*/ {_display_(Seq[Any](format.raw/*109.89*/("""
                            """),format.raw/*110.29*/("""<span>
                            """),_display_(/*111.30*/outputTemperatureOrNA(vitalMap.get("temperature", vitalMap.getDate(dateIndex - 1)), viewModelMedical.getSettings.isMetric)),format.raw/*111.152*/("""
                            """),format.raw/*112.29*/("""</span>
                        """)))}),format.raw/*113.26*/("""
                        """),format.raw/*114.25*/("""</p>

                    <p>
                        <span class="infoLabel">Blood Pressure:</span>
                        """),_display_(/*118.26*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*118.87*/ {_display_(Seq[Any](format.raw/*118.89*/("""
                            """),format.raw/*119.29*/("""<span>
                            """),_display_(/*120.30*/outputBloodPressureOrNA(vitalMap.get("bloodPressureSystolic", vitalMap.getDate(dateIndex - 1)), vitalMap.get("bloodPressureDiastolic", vitalMap.getDate(dateIndex - 1)))),format.raw/*120.198*/("""
                            """),format.raw/*121.29*/("""</span>
                        """)))}),format.raw/*122.26*/("""
                    """),format.raw/*123.21*/("""</p>
                    <p>
                        <span class="infoLabel">Heart Rate:</span>
                        """),_display_(/*126.26*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*126.87*/ {_display_(Seq[Any](format.raw/*126.89*/("""
                            """),format.raw/*127.29*/("""<span>
                             """),_display_(/*128.31*/outputStringOrNA(vitalMap.get("heartRate", vitalMap.getDate(dateIndex - 1)))),format.raw/*128.107*/("""
                            """),format.raw/*129.29*/("""</span>
                        """)))}),format.raw/*130.26*/("""
                    """),format.raw/*131.21*/("""</p>
                    <p>
                        <span class="infoLabel">Respiration Rate:</span>
                        """),_display_(/*134.26*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*134.87*/ {_display_(Seq[Any](format.raw/*134.89*/("""
                            """),format.raw/*135.29*/("""<span>
                            """),_display_(/*136.30*/outputStringOrNA(vitalMap.get("respiratoryRate", vitalMap.getDate(dateIndex - 1)))),format.raw/*136.112*/("""
                            """),format.raw/*137.29*/("""</span>
                        """)))}),format.raw/*138.26*/("""
                    """),format.raw/*139.21*/("""</p>
                    <p>
                        <span class="infoLabel">Oxygen Saturation:</span>
                        """),_display_(/*142.26*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*142.87*/ {_display_(Seq[Any](format.raw/*142.89*/("""
                            """),format.raw/*143.29*/("""<span>
                            """),_display_(/*144.30*/outputStringOrNA(vitalMap.get("oxygenSaturation", vitalMap.getDate(dateIndex - 1)))),format.raw/*144.113*/("""
                            """),format.raw/*145.29*/("""</span>
                        """)))}),format.raw/*146.26*/("""
                    """),format.raw/*147.21*/("""</p>
                    <p>
                        <span class="infoLabel">Glucose:</span>
                        """),_display_(/*150.26*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*150.87*/ {_display_(Seq[Any](format.raw/*150.89*/("""
                            """),format.raw/*151.29*/("""<span>
                            """),_display_(/*152.30*/outputStringOrNA(vitalMap.get("glucose", vitalMap.getDate(dateIndex - 1)))),format.raw/*152.104*/("""
                            """),format.raw/*153.29*/("""</span>
                        """)))}),format.raw/*154.26*/("""
                    """),format.raw/*155.21*/("""</p>
                """)))}),format.raw/*156.18*/("""
                """),format.raw/*157.17*/("""</div>
            </div>


            <div class="encounterViewBodyHeader">
                <p>Assessment</p>
            </div>
            <div class="encounterViewBody">
                <div class="encounterViewBodyLeft">
                    """),format.raw/*166.69*/("""
                    """),_display_(/*167.22*/defining(viewModelMedical.getPmhFields)/*167.61*/ { pmhFieldMap =>_display_(Seq[Any](format.raw/*167.78*/("""
                        """),format.raw/*168.25*/("""<p><a class="infoLabel """),_display_(/*168.49*/editClass),format.raw/*168.58*/(""""> Medical/Surgical History:</a>
                            """),_display_(/*169.30*/dynamicTabSpan(pmhFieldMap.get("medicalSurgicalHistory"))),format.raw/*169.87*/("""
                        """),format.raw/*170.25*/("""</p>
                        <p><a class="infoLabel """),_display_(/*171.49*/editClass),format.raw/*171.58*/(""""> Social History:</a>
                            """),_display_(/*172.30*/dynamicTabSpan(pmhFieldMap.get("socialHistory"))),format.raw/*172.78*/("""
                        """),format.raw/*173.25*/("""<p><a class="infoLabel """),_display_(/*173.49*/editClass),format.raw/*173.58*/("""">Current Medications:</a>
                            """),_display_(/*174.30*/dynamicTabSpan(pmhFieldMap.get("currentMedication"))),format.raw/*174.82*/("""
                        """),format.raw/*175.25*/("""<p><a class="infoLabel """),_display_(/*175.49*/editClass),format.raw/*175.58*/(""""> Family History: </a>
                            """),_display_(/*176.30*/dynamicTabSpan(pmhFieldMap.get("familyHistory"))),format.raw/*176.78*/("""
                    """)))}),format.raw/*177.22*/("""
                    """),_display_(/*178.22*/defining(viewModelMedical.getTreatmentFields)/*178.67*/ { treatmentFieldMap =>_display_(Seq[Any](format.raw/*178.90*/("""
                        """),format.raw/*179.25*/("""<p><a  class="infoLabel """),_display_(/*179.50*/editClass),format.raw/*179.59*/(""""> Assessment: </a>
                            """),_display_(/*180.30*/dynamicTabSpan(treatmentFieldMap.get("assessment"))),format.raw/*180.81*/("""

                        """),format.raw/*182.25*/("""<p><a class="infoLabel """),_display_(/*182.49*/editClass),format.raw/*182.58*/("""">Treatment:</a>
                            """),_display_(/*183.30*/dynamicTabSpan(treatmentFieldMap.get("treatment"))),format.raw/*183.80*/("""
                    """)))}),format.raw/*184.22*/("""
                    """),_display_(/*185.22*/for(problemIterator <- 1 to viewModelPharmacy.getProblems.size) yield /*185.85*/{_display_(Seq[Any](format.raw/*185.86*/("""
                        """),format.raw/*186.25*/("""<p><a class="infoLabel nonEditable">Diagnosis:</a>
                            <span class="value">"""),_display_(/*187.50*/outputStringOrNA(viewModelPharmacy.getProblems.get(problemIterator - 1))),format.raw/*187.122*/("""</span></p>
                    """)))}),format.raw/*188.22*/("""
                    """),_display_(/*189.22*/if(!viewModelPharmacy.getPrescriptions.isEmpty())/*189.71*/{_display_(Seq[Any](format.raw/*189.72*/("""
                            """),format.raw/*190.29*/("""<table id="medTable">
                                <thead>
                                    <tr>
                                        <th>Original Prescription</th>
                                        <th>Replaced</th>
                                    </tr>
                                </thead>
                                <tbody>
                            <p> <span class="infoLabel">Dispensed Medication:</span> </p>
                        """),_display_(/*199.26*/for(x <- 1 to viewModelPharmacy.getPrescriptions.size) yield /*199.80*/ {_display_(Seq[Any](format.raw/*199.82*/("""
                            """),_display_(/*200.30*/defining(viewModelPharmacy.getPrescriptions.get(x - 1))/*200.85*/ { prescription =>_display_(Seq[Any](format.raw/*200.103*/("""
                              """),format.raw/*201.31*/("""<tr>
                                  """),_display_(/*202.36*/if(prescription.getOriginalMedicationName != null)/*202.86*/ {_display_(Seq[Any](format.raw/*202.88*/("""
                                      """),format.raw/*203.39*/("""<th><p><del><span>"""),_display_(/*203.58*/prescription/*203.70*/.getOriginalMedicationName),format.raw/*203.96*/("""</span></del></p></th>
                                      <th> """),_display_(/*204.45*/prescription/*204.57*/.getAmount),format.raw/*204.67*/(""" """),_display_(/*204.69*/outputStringOrNA(prescription.getName)),format.raw/*204.107*/("""
                                          """),format.raw/*205.43*/("""("""),_display_(/*205.45*/outputStringOrNA(prescription.getMedicationForm)/*205.93*/.toString().trim),format.raw/*205.109*/(""")
                                          """),_display_(/*206.44*/for(activeDrug <- prescription.getMedicationActiveDrugs) yield /*206.100*/ {_display_(Seq[Any](format.raw/*206.102*/("""
                                              """),format.raw/*207.47*/("""<span class='activeDrug'> """),_display_(/*207.74*/activeDrug/*207.84*/.getName),format.raw/*207.92*/(""" """),_display_(/*207.94*/activeDrug/*207.104*/.getValue),format.raw/*207.113*/(""" """),_display_(/*207.115*/activeDrug/*207.125*/.getUnit),format.raw/*207.133*/(""" """),format.raw/*207.134*/("""</span>
                                          """)))}),format.raw/*208.44*/("""
                                      """),format.raw/*209.39*/("""</th>
                                  """)))}/*210.37*/else/*210.42*/{_display_(Seq[Any](format.raw/*210.43*/("""
                                      """),format.raw/*211.39*/("""<th> """),_display_(/*211.45*/prescription/*211.57*/.getAmount),format.raw/*211.67*/(""" """),_display_(/*211.69*/outputStringOrNA(prescription.getName)),format.raw/*211.107*/("""
                                          """),format.raw/*212.43*/("""("""),_display_(/*212.45*/outputStringOrNA(prescription.getMedicationForm)/*212.93*/.toString().trim),format.raw/*212.109*/(""")
                                          """),_display_(/*213.44*/for(activeDrug <- prescription.getMedicationActiveDrugs) yield /*213.100*/ {_display_(Seq[Any](format.raw/*213.102*/("""
                                              """),format.raw/*214.47*/("""<span class='activeDrug'> """),_display_(/*214.74*/activeDrug/*214.84*/.getName),format.raw/*214.92*/(""" """),_display_(/*214.94*/activeDrug/*214.104*/.getValue),format.raw/*214.113*/(""" """),_display_(/*214.115*/activeDrug/*214.125*/.getUnit),format.raw/*214.133*/(""" """),format.raw/*214.134*/("""</span>
                                          """)))}),format.raw/*215.44*/("""
                                      """),format.raw/*216.39*/("""</th>
                                      <th></th>
                                  """)))}),format.raw/*218.36*/("""
                              """),format.raw/*219.31*/("""</tr>
                            """)))}),format.raw/*220.30*/("""
                        """)))}),format.raw/*221.26*/("""
                                    """),format.raw/*222.37*/("""</tbody>
                                </table>
                    """)))}),format.raw/*224.22*/("""


                """),format.raw/*227.17*/("""</div>
                <div class="encounterViewBodyMiddle">
                """),_display_(/*229.18*/if(viewModelMedical.isMultipleChiefComplaints)/*229.64*/ {_display_(Seq[Any](format.raw/*229.66*/("""
                    """),_display_(/*230.22*/for((key, value) <- viewModelMedical.getHpiFieldsWithMultipleChiefComplaints) yield /*230.99*/ {_display_(Seq[Any](format.raw/*230.101*/("""
                        """),format.raw/*231.25*/("""<div>
                        <h4 data-complaint=""""),_display_(/*232.46*/key),format.raw/*232.49*/("""">Chief Complaint: """),_display_(/*232.69*/key),format.raw/*232.72*/("""</h4>
                        <p> <a class="infoLabel """),_display_(/*233.50*/editClass),format.raw/*233.59*/("""">Onset:</a>
                            """),_display_(/*234.30*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithMultipleChiefComplaints.get(key).get("onset"))),format.raw/*234.124*/("""
                        """),format.raw/*235.25*/("""</p>
                        <p> <a class="infoLabel """),_display_(/*236.50*/editClass),format.raw/*236.59*/(""""> Quality: </a>
                            """),_display_(/*237.30*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithMultipleChiefComplaints.get(key).get("quality"))),format.raw/*237.126*/("""
                        """),format.raw/*238.25*/("""</p>
                        <p> <a class="infoLabel """),_display_(/*239.50*/editClass),format.raw/*239.59*/("""">Radiation:</a>
                            """),_display_(/*240.30*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithMultipleChiefComplaints.get(key).get("radiation"))),format.raw/*240.128*/("""
                        """),format.raw/*241.25*/("""</p>
                        <p> <a class="infoLabel """),_display_(/*242.50*/editClass),format.raw/*242.59*/("""">Severity:</a>
                            """),_display_(/*243.30*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithMultipleChiefComplaints.get(key).get("severity"))),format.raw/*243.127*/("""
                        """),format.raw/*244.25*/("""</p>
                        <p> <a class="infoLabel """),_display_(/*245.50*/editClass),format.raw/*245.59*/("""">Provokes:</a>
                            """),_display_(/*246.30*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithMultipleChiefComplaints.get(key).get("provokes"))),format.raw/*246.127*/("""
                        """),format.raw/*247.25*/("""</p>
                        <p> <a class="infoLabel """),_display_(/*248.50*/editClass),format.raw/*248.59*/("""">Palliates:</a>
                            """),_display_(/*249.30*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithMultipleChiefComplaints.get(key).get("palliates"))),format.raw/*249.128*/("""
                        """),format.raw/*250.25*/("""</p>

                        <p> <a class="infoLabel """),_display_(/*252.50*/editClass),format.raw/*252.59*/("""">Narrative:</a>
                            """),_display_(/*253.30*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithMultipleChiefComplaints.get(key).get("narrative"))),format.raw/*253.128*/("""
                        """),format.raw/*254.25*/("""</p>
                        <p> <a class="infoLabel """),_display_(/*255.50*/editClass),format.raw/*255.59*/("""">Time Of Day:</a>
                            """),_display_(/*256.30*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithMultipleChiefComplaints.get(key).get("timeOfDay"))),format.raw/*256.128*/("""
                        """),format.raw/*257.25*/("""</p>

                        <p> <a class="infoLabel """),_display_(/*259.50*/editClass),format.raw/*259.59*/("""">Physical Examination:</a>
                            """),_display_(/*260.30*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithMultipleChiefComplaints.get(key).get("physicalExamination"))),format.raw/*260.138*/("""
                        """),format.raw/*261.25*/("""</p>

                        </div>
                        <br>
                    """)))}),format.raw/*265.22*/("""
                """)))}/*266.19*/else/*266.24*/{_display_(Seq[Any](format.raw/*266.25*/("""
                    """),format.raw/*267.21*/("""<div>
                    """),_display_(/*268.22*/if(viewModel.getPatientEncounterItem.getChiefComplaints != null && viewModel.getPatientEncounterItem.getChiefComplaints.size > 0)/*268.151*/{_display_(Seq[Any](format.raw/*268.152*/("""
                        """),format.raw/*269.25*/("""<h4 data-complaint=""""),_display_(/*269.46*/viewModel/*269.55*/.getPatientEncounterItem.getChiefComplaints.get(0)),format.raw/*269.105*/("""">Chief Complaint: """),_display_(/*269.125*/viewModel/*269.134*/.getPatientEncounterItem.getChiefComplaints.get(0)),format.raw/*269.184*/(""" """),format.raw/*269.185*/("""</h4>
                    """)))}),format.raw/*270.22*/("""
                    """),format.raw/*271.21*/("""<p> <a class= "infoLabel """),_display_(/*271.47*/editClass),format.raw/*271.56*/("""">Onset:</a>
                        """),_display_(/*272.26*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithoutMultipleChiefComplaints.get("onset"))),format.raw/*272.114*/("""
                    """),format.raw/*273.21*/("""</p>
                    <p> <a class= "infoLabel """),_display_(/*274.47*/editClass),format.raw/*274.56*/("""">Quality:</a>
                        """),_display_(/*275.26*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithoutMultipleChiefComplaints.get("quality"))),format.raw/*275.116*/("""
                    """),format.raw/*276.21*/("""</p>

                    <p> <a class= "infoLabel """),_display_(/*278.47*/editClass),format.raw/*278.56*/("""">Radiation:</a>
                    """),_display_(/*279.22*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithoutMultipleChiefComplaints.get("radiation"))),format.raw/*279.114*/("""
                    """),format.raw/*280.21*/("""</p>

                    <p> <a class= "infoLabel """),_display_(/*282.47*/editClass),format.raw/*282.56*/("""">Severity:</a>
                        """),_display_(/*283.26*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithoutMultipleChiefComplaints.get("severity"))),format.raw/*283.117*/("""
                    """),format.raw/*284.21*/("""</p>

                    <p> <a class= "infoLabel """),_display_(/*286.47*/editClass),format.raw/*286.56*/("""">Provokes:</a>
                        """),_display_(/*287.26*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithoutMultipleChiefComplaints.get("provokes"))),format.raw/*287.117*/("""
                    """),format.raw/*288.21*/("""</p>

                    <p> <a class= "infoLabel """),_display_(/*290.47*/editClass),format.raw/*290.56*/("""">Palliates:</a>
                        """),_display_(/*291.26*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithoutMultipleChiefComplaints.get("palliates"))),format.raw/*291.118*/("""
                    """),format.raw/*292.21*/("""</p>

                    <p> <a class= "infoLabel """),_display_(/*294.47*/editClass),format.raw/*294.56*/("""">Time Of Day:</a>
                        """),_display_(/*295.26*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithoutMultipleChiefComplaints.get("timeOfDay"))),format.raw/*295.118*/("""
                    """),format.raw/*296.21*/("""</p>
                    <p> <a class= "infoLabel """),_display_(/*297.47*/editClass),format.raw/*297.56*/("""">Narrative:</a>
                        """),_display_(/*298.26*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithoutMultipleChiefComplaints.get("narrative"))),format.raw/*298.118*/("""
                    """),format.raw/*299.21*/("""</p>

                    <p> <a class= "infoLabel """),_display_(/*301.47*/editClass),format.raw/*301.56*/("""">Physical Examination:</a>
                        """),_display_(/*302.26*/dynamicTabSpan(viewModelMedical.getHpiFieldsWithoutMultipleChiefComplaints.get("physicalExamination"))),format.raw/*302.128*/("""
                    """),format.raw/*303.21*/("""</p>
                    </div>

                """)))}),format.raw/*306.18*/("""


                """),format.raw/*309.17*/("""</div>

                <div class="encounterViewBodyRight">
                    """),format.raw/*312.58*/("""
                    """),_display_(/*313.22*/for((key, value) <- viewModelMedical.getCustomFields) yield /*313.75*/ {_display_(Seq[Any](format.raw/*313.77*/("""
                        """),format.raw/*314.25*/("""<p><span class="infoLabel nonEditable">
                            """),_display_(/*315.30*/key),format.raw/*315.33*/(""":
                        </span>
                            """),_display_(/*317.30*/outputStringOrNA(viewModelMedical.getCustomFields.get(key).getValue)),format.raw/*317.98*/("""
                        """),format.raw/*318.25*/("""</p>
                    """)))}),format.raw/*319.22*/("""

                """),format.raw/*321.17*/("""</div>
            </div>

            """),_display_(/*324.14*/if(viewModelMedical.getPhotos.size > 0)/*324.53*/ {_display_(Seq[Any](format.raw/*324.55*/("""
                """),format.raw/*325.17*/("""<div class="encounterViewBodyHeader">
                    <p>Photos</p>
                </div>
                <div class="encounterViewBody">
                """),_display_(/*329.18*/for(x <- 1 to viewModelMedical.getPhotos.size) yield /*329.64*/ {_display_(Seq[Any](format.raw/*329.66*/("""
                    """),format.raw/*330.21*/("""<img src=""""),_display_(/*330.32*/viewModelMedical/*330.48*/.getPhoto(x - 1).getImageUrl),format.raw/*330.76*/("""">
                    <p class="imageDescription">"""),_display_(/*331.50*/viewModelMedical/*331.66*/.getPhoto(x - 1).getImageDesc),format.raw/*331.95*/("""</p>
                """)))}),format.raw/*332.18*/("""

                """),format.raw/*334.17*/("""</div>
            """)))}),format.raw/*335.14*/("""

            """),format.raw/*337.13*/("""<div id="edit-form" >

                <p class="form-label"></p>
                <input type="text" id="editInput" class="form-control input-sm pull-left value" name="edit-value"  value=""/>
                <input  id = "fieldIdInput" class= "fieldId" type="hidden" name="edit-field-name" value="" />

                <button type="button" id="saveEncounterBtn" class="fButton">Save</button>
                <button type="button" id="cancelEncounterBtn" class="fButton">Cancel</button>

                <div  class="form-history">
                    <table id="tabFieldHistory" cellspacing="0">
                    </table>
                </div>
            </div>

        </div>

    """)))}),format.raw/*354.6*/("""

"""))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,viewModel:femr.ui.models.history.IndexEncounterViewModel,viewModelMedical:femr.ui.models.history.IndexEncounterMedicalViewModel,viewModelPharmacy:femr.ui.models.history.IndexEncounterPharmacyViewModel): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,viewModel,viewModelMedical,viewModelPharmacy)

  def f:((femr.common.dtos.CurrentUser,femr.ui.models.history.IndexEncounterViewModel,femr.ui.models.history.IndexEncounterMedicalViewModel,femr.ui.models.history.IndexEncounterPharmacyViewModel) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,viewModel,viewModelMedical,viewModelPharmacy) => apply(currentUser,viewModel,viewModelMedical,viewModelPharmacy)

  def ref: this.type = this

}


}

/**/
object indexEncounter extends indexEncounter_Scope0.indexEncounter
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:20 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/history/indexEncounter.scala.html
                  HASH: a7fdad3df6c1ff82936745b581e18871aabb85ed
                  MATRIX: 957->1|1837->882|1863->899|1944->903|1981->913|2045->950|2060->956|2135->1009|2220->1067|2235->1073|2312->1128|2397->1186|2412->1192|2475->1234|2516->1259|2541->1275|2622->1279|2659->1289|2716->1319|2731->1325|2810->1382|2879->1424|2894->1430|2951->1466|2983->1575|3001->1584|3118->251|3152->300|3182->366|3212->429|3242->495|3272->561|3302->634|3335->707|3368->775|3401->819|3432->873|3467->1252|3500->1475|3536->1568|3571->1670|3606->1679|3699->1763|3739->1765|3776->1775|3984->1956|4002->1965|4053->1995|4106->2021|4124->2030|4173->2058|4202->2060|4220->2069|4268->2096|4318->2118|4347->2120|4365->2129|4407->2150|4469->2185|4491->2198|4559->2245|4939->2598|4957->2607|5009->2637|5112->2713|5155->2747|5206->2760|5256->2782|5395->2894|5455->2932|5558->3008|5617->3045|5718->3119|5776->3155|5878->3230|5948->3278|6045->3348|6098->3380|6198->3453|6252->3485|6404->3622|6433->3623|6490->3653|6538->3692|6590->3706|6648->3736|6793->3854|6870->3915|6910->3917|6976->3955|7048->4000|7150->4080|7216->4118|7289->4160|7347->4190|7409->4221|7465->4249|7535->4292|7805->4541|7905->4614|8017->4704|8099->4755|8145->4773|8252->4853|8304->4896|8357->4911|8408->5020|8459->5122|8509->5152|8560->5263|8611->5373|8661->5403|8712->5516|8763->5628|8815->5652|8891->5701|8909->5710|8952->5731|9047->5799|9065->5808|9103->5825|9137->5847|9187->5869|9290->5945|9308->5954|9352->5976|9451->6048|9469->6057|9511->6078|9545->6100|9595->6122|9699->6199|9717->6208|9762->6231|9862->6304|9880->6313|9923->6335|9957->6357|10012->6380|10059->6398|10168->6479|10217->6518|10270->6532|10321->6554|10450->6655|10528->6716|10569->6718|10628->6748|10693->6785|10838->6907|10897->6937|10963->6971|11018->6997|11176->7127|11254->7188|11295->7190|11354->7220|11419->7257|11610->7425|11669->7455|11735->7489|11786->7511|11938->7635|12016->7696|12057->7698|12116->7728|12182->7766|12281->7842|12340->7872|12406->7906|12457->7928|12615->8058|12693->8119|12734->8121|12793->8151|12858->8188|12963->8270|13022->8300|13088->8334|13139->8356|13298->8487|13376->8548|13417->8550|13476->8580|13541->8617|13647->8700|13706->8730|13772->8764|13823->8786|13972->8907|14050->8968|14091->8970|14150->9000|14215->9037|14312->9111|14371->9141|14437->9175|14488->9197|14543->9220|14590->9238|14875->9542|14926->9565|14975->9604|15031->9621|15086->9647|15138->9671|15169->9680|15260->9743|15339->9800|15394->9826|15476->9880|15507->9889|15588->9942|15658->9990|15713->10016|15765->10040|15796->10049|15881->10106|15955->10158|16010->10184|16062->10208|16093->10217|16175->10271|16245->10319|16300->10342|16351->10365|16406->10410|16468->10433|16523->10459|16576->10484|16607->10493|16685->10543|16758->10594|16815->10622|16867->10646|16898->10655|16973->10702|17045->10752|17100->10775|17151->10798|17231->10861|17271->10862|17326->10888|17455->10989|17550->11061|17616->11095|17667->11118|17726->11167|17766->11168|17825->11198|18332->11677|18403->11731|18444->11733|18503->11764|18568->11819|18626->11837|18687->11869|18756->11910|18816->11960|18857->11962|18926->12002|18973->12021|18995->12033|19043->12059|19139->12127|19161->12139|19193->12149|19223->12151|19284->12189|19357->12233|19387->12235|19445->12283|19484->12299|19558->12345|19632->12401|19674->12403|19751->12451|19806->12478|19826->12488|19856->12496|19886->12498|19907->12508|19939->12517|19970->12519|19991->12529|20022->12537|20053->12538|20137->12590|20206->12630|20268->12673|20282->12678|20322->12679|20391->12719|20425->12725|20447->12737|20479->12747|20509->12749|20570->12787|20643->12831|20673->12833|20731->12881|20770->12897|20844->12943|20918->12999|20960->13001|21037->13049|21092->13076|21112->13086|21142->13094|21172->13096|21193->13106|21225->13115|21256->13117|21277->13127|21308->13135|21339->13136|21423->13188|21492->13228|21615->13319|21676->13351|21744->13387|21803->13414|21870->13452|21975->13525|22026->13547|22134->13627|22190->13673|22231->13675|22282->13698|22376->13775|22418->13777|22473->13803|22553->13855|22578->13858|22626->13878|22651->13881|22735->13937|22766->13946|22837->13989|22954->14083|23009->14109|23092->14164|23123->14173|23198->14220|23317->14316|23372->14342|23455->14397|23486->14406|23561->14453|23682->14551|23737->14577|23820->14632|23851->14641|23925->14687|24045->14784|24100->14810|24183->14865|24214->14874|24288->14920|24408->15017|24463->15043|24546->15098|24577->15107|24652->15154|24773->15252|24828->15278|24913->15335|24944->15344|25019->15391|25140->15489|25195->15515|25278->15570|25309->15579|25386->15628|25507->15726|25562->15752|25647->15809|25678->15818|25764->15876|25895->15984|25950->16010|26073->16101|26112->16121|26126->16126|26166->16127|26217->16149|26273->16177|26413->16306|26454->16307|26509->16333|26558->16354|26577->16363|26650->16413|26699->16433|26719->16442|26792->16492|26823->16493|26883->16521|26934->16543|26988->16569|27019->16578|27086->16617|27197->16705|27248->16727|27328->16779|27359->16788|27428->16829|27541->16919|27592->16941|27674->16995|27705->17004|27772->17043|27887->17135|27938->17157|28020->17211|28051->17220|28121->17262|28235->17353|28286->17375|28368->17429|28399->17438|28469->17480|28583->17571|28634->17593|28716->17647|28747->17656|28818->17699|28933->17791|28984->17813|29066->17867|29097->17876|29170->17921|29285->18013|29336->18035|29416->18087|29447->18096|29518->18139|29633->18231|29684->18253|29766->18307|29797->18316|29879->18370|30004->18472|30055->18494|30140->18547|30191->18569|30304->18690|30355->18713|30425->18766|30466->18768|30521->18794|30619->18864|30644->18867|30737->18932|30827->19000|30882->19026|30941->19053|30990->19073|31061->19116|31110->19155|31151->19157|31198->19175|31390->19339|31453->19385|31494->19387|31545->19409|31584->19420|31610->19436|31660->19464|31741->19517|31767->19533|31818->19562|31873->19585|31922->19605|31975->19626|32020->19642|32758->20349
                  LINES: 27->1|40->18|40->18|42->18|43->19|43->19|43->19|43->19|44->20|44->20|44->20|45->21|45->21|45->21|46->23|46->23|48->23|49->24|49->24|49->24|49->24|50->25|50->25|50->25|51->29|51->29|52->1|54->4|54->5|54->6|54->7|54->8|54->9|55->11|56->13|57->15|57->16|59->22|60->26|62->28|63->29|65->31|65->31|65->31|66->32|70->36|70->36|70->36|71->37|71->37|71->37|71->37|71->37|71->37|72->38|72->38|72->38|72->38|74->40|74->40|74->40|81->47|81->47|81->47|83->49|83->49|83->49|84->50|85->51|85->51|86->52|86->52|87->53|87->53|88->54|88->54|89->55|89->55|90->56|90->56|93->59|93->59|94->60|94->60|94->60|95->61|97->63|97->63|97->63|98->64|99->65|99->65|100->66|101->67|102->68|103->69|105->71|105->71|109->75|110->76|110->76|112->78|113->79|115->81|115->81|115->81|116->82|117->83|118->84|119->85|120->86|121->87|122->88|123->89|125->91|125->91|125->91|125->91|126->92|126->92|126->92|126->92|127->93|128->94|128->94|128->94|129->95|129->95|129->95|129->95|130->96|131->97|131->97|131->97|132->98|132->98|132->98|132->98|135->101|136->102|139->105|139->105|139->105|140->106|143->109|143->109|143->109|144->110|145->111|145->111|146->112|147->113|148->114|152->118|152->118|152->118|153->119|154->120|154->120|155->121|156->122|157->123|160->126|160->126|160->126|161->127|162->128|162->128|163->129|164->130|165->131|168->134|168->134|168->134|169->135|170->136|170->136|171->137|172->138|173->139|176->142|176->142|176->142|177->143|178->144|178->144|179->145|180->146|181->147|184->150|184->150|184->150|185->151|186->152|186->152|187->153|188->154|189->155|190->156|191->157|200->166|201->167|201->167|201->167|202->168|202->168|202->168|203->169|203->169|204->170|205->171|205->171|206->172|206->172|207->173|207->173|207->173|208->174|208->174|209->175|209->175|209->175|210->176|210->176|211->177|212->178|212->178|212->178|213->179|213->179|213->179|214->180|214->180|216->182|216->182|216->182|217->183|217->183|218->184|219->185|219->185|219->185|220->186|221->187|221->187|222->188|223->189|223->189|223->189|224->190|233->199|233->199|233->199|234->200|234->200|234->200|235->201|236->202|236->202|236->202|237->203|237->203|237->203|237->203|238->204|238->204|238->204|238->204|238->204|239->205|239->205|239->205|239->205|240->206|240->206|240->206|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|242->208|243->209|244->210|244->210|244->210|245->211|245->211|245->211|245->211|245->211|245->211|246->212|246->212|246->212|246->212|247->213|247->213|247->213|248->214|248->214|248->214|248->214|248->214|248->214|248->214|248->214|248->214|248->214|248->214|249->215|250->216|252->218|253->219|254->220|255->221|256->222|258->224|261->227|263->229|263->229|263->229|264->230|264->230|264->230|265->231|266->232|266->232|266->232|266->232|267->233|267->233|268->234|268->234|269->235|270->236|270->236|271->237|271->237|272->238|273->239|273->239|274->240|274->240|275->241|276->242|276->242|277->243|277->243|278->244|279->245|279->245|280->246|280->246|281->247|282->248|282->248|283->249|283->249|284->250|286->252|286->252|287->253|287->253|288->254|289->255|289->255|290->256|290->256|291->257|293->259|293->259|294->260|294->260|295->261|299->265|300->266|300->266|300->266|301->267|302->268|302->268|302->268|303->269|303->269|303->269|303->269|303->269|303->269|303->269|303->269|304->270|305->271|305->271|305->271|306->272|306->272|307->273|308->274|308->274|309->275|309->275|310->276|312->278|312->278|313->279|313->279|314->280|316->282|316->282|317->283|317->283|318->284|320->286|320->286|321->287|321->287|322->288|324->290|324->290|325->291|325->291|326->292|328->294|328->294|329->295|329->295|330->296|331->297|331->297|332->298|332->298|333->299|335->301|335->301|336->302|336->302|337->303|340->306|343->309|346->312|347->313|347->313|347->313|348->314|349->315|349->315|351->317|351->317|352->318|353->319|355->321|358->324|358->324|358->324|359->325|363->329|363->329|363->329|364->330|364->330|364->330|364->330|365->331|365->331|365->331|366->332|368->334|369->335|371->337|388->354
                  -- GENERATED --
              */
          