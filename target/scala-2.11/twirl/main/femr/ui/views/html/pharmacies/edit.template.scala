
package femr.ui.views.html.pharmacies

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

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[femr.common.dtos.CurrentUser,femr.ui.models.pharmacy.EditViewModelGet,java.lang.Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser, viewModel: femr.ui.models.pharmacy.EditViewModelGet, searchError: java.lang.Boolean ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.controllers.routes.HistoryController
import femr.ui.controllers.routes.MedicalController
import femr.ui.controllers.routes.PharmaciesController
import femr.ui.views.html.layouts.main
import femr.ui.views.html.partials.search
import femr.ui.views.html.partials.patientOverview
import femr.ui.views.html.partials.medical.tabs.prescriptionRow
import femr.ui.views.html.partials.helpers.outputStringOrNA
def /*12.6*/additionalScripts/*12.23*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.27*/("""

        """),format.raw/*14.9*/("""<script type = "text/javascript" src=""""),_display_(/*14.48*/routes/*14.54*/.Assets.versioned("js/pharmacy/pharmacy.js")),format.raw/*14.98*/(""""></script>
        <script type = "text/javascript" src=""""),_display_(/*15.48*/routes/*15.54*/.Assets.versioned("js/pharmacy/pharmacyClientValidation.js")),format.raw/*15.114*/(""""></script>
        <script type = "text/javascript" src=""""),_display_(/*16.48*/routes/*16.54*/.Assets.versioned("js/libraries/typeahead.bundle.min.js")),format.raw/*16.111*/(""""></script>
        <script type = "text/javascript"   src=""""),_display_(/*17.50*/routes/*17.56*/.Assets.versioned("js/libraries/handlebars.js")),format.raw/*17.103*/(""""></script>
        <script type = "text/javascript"   src=""""),_display_(/*18.50*/routes/*18.56*/.Assets.versioned("js/libraries/jquery-ui.min.js")),format.raw/*18.106*/(""""></script>
    """)))};def /*20.6*/additionalStyles/*20.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*20.26*/("""

        """),format.raw/*22.9*/("""<link rel="stylesheet" href=""""),_display_(/*22.39*/routes/*22.45*/.Assets.versioned("css/pharmacy.css")),format.raw/*22.82*/("""">
        <link rel="stylesheet" href=""""),_display_(/*23.39*/routes/*23.45*/.Assets.versioned("css/libraries/jquery-ui.min.css")),format.raw/*23.97*/("""">
    """)))};
Seq[Any](format.raw/*1.131*/("""

"""),format.raw/*11.1*/("""
    """),format.raw/*19.6*/("""
    """),format.raw/*24.6*/("""

"""),_display_(/*26.2*/main("Pharmacy", currentUser, scripts = additionalScripts, styles = additionalStyles, search = search("pharmacy"))/*26.116*/ {_display_(Seq[Any](format.raw/*26.118*/("""
    """),format.raw/*27.5*/("""<div id="pharmacyContentWrap">

        """),_display_(/*29.10*/patientOverview(viewModel.getPatient, viewModel.getPatientEncounterItem, viewModel.getSettings, "Pharmacy - " + "Patient ID: " + viewModel.getPatient.getId)),format.raw/*29.166*/("""



        """),format.raw/*33.9*/("""<div id="mainWrap" class="backgroundForWrap">
        """),_display_(/*34.10*/helper/*34.16*/.form(action = PharmaciesController.editPost(viewModel.getPatient.getId))/*34.89*/ {_display_(Seq[Any](format.raw/*34.91*/("""


            """),format.raw/*37.13*/("""<div id="diagnosisWrap">
                <h4>List of Diagnoses</h4>

                <ol class="problems">

                """),_display_(/*42.18*/if(viewModel.getProblems != null)/*42.51*/ {_display_(Seq[Any](format.raw/*42.53*/("""
                    """),_display_(/*43.22*/for(y <- 1 to viewModel.getProblems.size) yield /*43.63*/ {_display_(Seq[Any](format.raw/*43.65*/("""
                        """),_display_(/*44.26*/if(viewModel.getProblems.get(y - 1) != null)/*44.70*/ {_display_(Seq[Any](format.raw/*44.72*/("""
                            """),format.raw/*45.29*/("""<li>"""),_display_(/*45.34*/viewModel/*45.43*/.getProblems.get(y - 1).getName),format.raw/*45.74*/("""</li>

                        """)))}),format.raw/*47.26*/("""
                    """)))}),format.raw/*48.22*/("""
                """)))}),format.raw/*49.18*/("""
                """),format.raw/*50.17*/("""</ol>
            </div>




            <div id="medicationWrap" class="form-group">
                <h4>List of Medications</h4>
                <ol id="medicationList">
                """),_display_(/*59.18*/for(x <- 1 to viewModel.getPrescriptions.size) yield /*59.64*/ {_display_(Seq[Any](format.raw/*59.66*/("""
                    """),_display_(/*60.22*/defining(viewModel.getPrescriptions.get(x - 1))/*60.69*/ { prescription =>_display_(Seq[Any](format.raw/*60.87*/("""
                        """),format.raw/*61.25*/("""<li class="prescription" id="med"""),_display_(/*61.58*/(x-1)),format.raw/*61.63*/("""" data-medID=""""),_display_(/*61.78*/prescription/*61.90*/.getMedicationID),format.raw/*61.106*/("""">
                            <input type="text" class="hidden" name="prescriptions["""),_display_(/*62.84*/(x-1)),format.raw/*62.89*/("""].id" value=""""),_display_(/*62.103*/prescription/*62.115*/.getId),format.raw/*62.121*/(""""/>
                            <button type="button" class="fButton fOtherButton replaceBtn">R</button>
                            <div>
                                <span>"""),_display_(/*65.40*/prescription/*65.52*/.getAmount),format.raw/*65.62*/(""" """),_display_(/*65.64*/prescription/*65.76*/.getName),format.raw/*65.84*/(""" """),format.raw/*65.85*/("""("""),_display_(/*65.87*/outputStringOrNA(prescription.getMedicationForm)/*65.135*/.toString().trim()),format.raw/*65.153*/(""") - """),_display_(/*65.158*/prescription/*65.170*/.getAdministrationName),format.raw/*65.192*/(""" """),format.raw/*65.193*/("""</span>
                            </div>
                            <div>
                                <span id="prescriber">
                                    Prescriber: """),_display_(/*69.50*/prescription/*69.62*/.getPrescriberLastName),format.raw/*69.84*/(""", """),_display_(/*69.87*/prescription/*69.99*/.getPrescriberFirstName),format.raw/*69.122*/("""</span>
                            </div>
                            <div class="medicationRemaining">Current Quantity: """),_display_(/*71.81*/prescription/*71.93*/.getMedicationRemaining),format.raw/*71.116*/("""</div>
                            """),_display_(/*72.30*/if(prescription.getAmount > prescription.getMedicationRemaining)/*72.94*/ {_display_(Seq[Any](format.raw/*72.96*/("""
                                """),format.raw/*73.33*/("""<div class="lowMedication">Not Enough Medication Remaining to Dispense!</div>
                            """)))}),format.raw/*74.30*/("""
                            """),format.raw/*75.29*/("""<div class="replacement hidden">

                                <div class="prescription-grid prescriptionHeader">
                                    <label class="prescription-field prescriptionName" for="prescription">Prescription</label>
                                    <label class="prescription-field prescriptionAdministration">Administration</label>
                                    <label class="prescription-field prescriptionAdministrationDays">Days</label>
                                    <label class="prescription-field prescriptionAmount">Amount</label>
                                </div>

                                """),_display_(/*84.34*/prescriptionRow( viewModel.getMedicationAdministrationItems, x-1, null )),format.raw/*84.106*/("""

                            """),format.raw/*86.29*/("""</div>
                        </li>
                    """)))}),format.raw/*88.22*/("""

                """)))}),format.raw/*90.18*/("""
                """),format.raw/*91.17*/("""</ol>

                <div id="disclaimerWrap">
                    <label for="disclaimer">
                        The patient was counseled on the risks and side effects of the medications dispensed.</label>
                    <input type="checkbox" name="disclaimer" value="1" />
                    <input type="hidden" name="disclaimer" value="0" />
                </div>
                <div id="submitWrap">
                    <button type="submit" id="pharmacySubmitBtn" class="fButton fRedButton fSubmitButton pull-right">
                        Submit</button>

                    <a href=""""),_display_(/*103.31*/{HistoryController.indexPatientGet(
                        Integer.toString(viewModel.getPatient.getId)).url}),format.raw/*104.75*/("""" class="fButton fOtherButton pull-left">Patient History</a>
                    <a href=""""),_display_(/*105.31*/{MedicalController.editGet(viewModel.getPatient.getId).url}),format.raw/*105.90*/("""" class="fButton fOtherButton pull-left">View in Medical</a>
                </div>

            </div>

        </div>


    </div>
""")))}),format.raw/*114.2*/("""
""")))}),format.raw/*115.2*/("""
"""))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,viewModel:femr.ui.models.pharmacy.EditViewModelGet,searchError:java.lang.Boolean): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,viewModel,searchError)

  def f:((femr.common.dtos.CurrentUser,femr.ui.models.pharmacy.EditViewModelGet,java.lang.Boolean) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,viewModel,searchError) => apply(currentUser,viewModel,searchError)

  def ref: this.type = this

}


}

/**/
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/pharmacies/edit.scala.html
                  HASH: 09442ba95d5d91fdf68b66d43c227610bbefee70
                  MATRIX: 843->1|1465->572|1491->589|1572->593|1611->605|1677->644|1692->650|1757->694|1844->754|1859->760|1941->820|2028->880|2043->886|2122->943|2211->1005|2226->1011|2295->1058|2384->1120|2399->1126|2471->1176|2512->1201|2537->1217|2618->1221|2657->1233|2714->1263|2729->1269|2787->1306|2856->1348|2871->1354|2944->1406|2993->130|3024->565|3057->1194|3090->1415|3121->1420|3245->1534|3286->1536|3319->1542|3389->1585|3567->1741|3610->1757|3693->1813|3708->1819|3790->1892|3830->1894|3876->1912|4033->2042|4075->2075|4115->2077|4165->2100|4222->2141|4262->2143|4316->2170|4369->2214|4409->2216|4467->2246|4499->2251|4517->2260|4569->2291|4634->2325|4688->2348|4738->2367|4784->2385|5009->2583|5071->2629|5111->2631|5161->2654|5217->2701|5273->2719|5327->2745|5387->2778|5413->2783|5455->2798|5476->2810|5514->2826|5628->2913|5654->2918|5696->2932|5718->2944|5746->2950|5954->3131|5975->3143|6006->3153|6035->3155|6056->3167|6085->3175|6114->3176|6143->3178|6201->3226|6241->3244|6274->3249|6296->3261|6340->3283|6370->3284|6582->3469|6603->3481|6646->3503|6676->3506|6697->3518|6742->3541|6894->3666|6915->3678|6960->3701|7024->3738|7097->3802|7137->3804|7199->3838|7338->3946|7396->3976|8087->4640|8181->4712|8241->4744|8332->4804|8384->4825|8430->4843|9078->5463|9211->5574|9331->5666|9412->5725|9586->5868|9620->5871
                  LINES: 27->1|38->12|38->12|40->12|42->14|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->20|47->20|49->20|51->22|51->22|51->22|51->22|52->23|52->23|52->23|54->1|56->11|57->19|58->24|60->26|60->26|60->26|61->27|63->29|63->29|67->33|68->34|68->34|68->34|68->34|71->37|76->42|76->42|76->42|77->43|77->43|77->43|78->44|78->44|78->44|79->45|79->45|79->45|79->45|81->47|82->48|83->49|84->50|93->59|93->59|93->59|94->60|94->60|94->60|95->61|95->61|95->61|95->61|95->61|95->61|96->62|96->62|96->62|96->62|96->62|99->65|99->65|99->65|99->65|99->65|99->65|99->65|99->65|99->65|99->65|99->65|99->65|99->65|99->65|103->69|103->69|103->69|103->69|103->69|103->69|105->71|105->71|105->71|106->72|106->72|106->72|107->73|108->74|109->75|118->84|118->84|120->86|122->88|124->90|125->91|137->103|138->104|139->105|139->105|148->114|149->115
                  -- GENERATED --
              */
          