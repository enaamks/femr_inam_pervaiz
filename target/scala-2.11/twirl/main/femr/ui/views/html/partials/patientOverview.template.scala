
package femr.ui.views.html.partials

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object patientOverview_Scope0 {
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

class patientOverview extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[femr.common.models.PatientItem,femr.common.models.PatientEncounterItem,femr.common.models.SettingItem,java.lang.String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(patient: femr.common.models.PatientItem, patientEncounter: femr.common.models.PatientEncounterItem,
        settings: femr.common.models.SettingItem, pageName: java.lang.String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.partials.helpers.outputHeightOrNA
import femr.ui.views.html.partials.helpers.outputWeightOrNA
import femr.ui.views.html.partials.helpers.outputIntOrNA

Seq[Any](format.raw/*2.78*/("""

"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<div id="patientOverviewWrap" class="backgroundForWrap">

    <h3>Patient Overview - """),_display_(/*10.29*/pageName),format.raw/*10.37*/("""</h3>

    """),_display_(/*12.6*/if(patient.getPathToPhoto != null && !patient.getPathToPhoto.isEmpty)/*12.75*/ {_display_(Seq[Any](format.raw/*12.77*/("""
        """),format.raw/*13.9*/("""<img src=""""),_display_(/*13.20*/patient/*13.27*/.getPathToPhoto),format.raw/*13.42*/("""" height="90" width="90">
        <div id= "patientOverViewInfoPhoto">
    """)))}/*15.7*/else/*15.12*/{_display_(Seq[Any](format.raw/*15.13*/("""
        """),format.raw/*16.9*/("""<div id= "patientOverViewInfo">
    """)))}),format.raw/*17.6*/("""

    """),format.raw/*19.5*/("""<label>Name: </label><span>"""),_display_(/*19.33*/patient/*19.40*/.getFirstName),format.raw/*19.53*/(""" """),_display_(/*19.55*/patient/*19.62*/.getLastName),format.raw/*19.74*/("""</span>
    <label for="">Age: </label><span>"""),_display_(/*20.39*/patient/*20.46*/.getAge),format.raw/*20.53*/("""</span>
    <label for="">Sex: </label><span>"""),_display_(/*21.39*/patient/*21.46*/.getSex),format.raw/*21.53*/("""</span>
    <label for="">City: </label><span>"""),_display_(/*22.40*/patient/*22.47*/.getCity),format.raw/*22.55*/("""</span>
    """),_display_(/*23.6*/if(pageName == "Medical")/*23.31*/ {_display_(Seq[Any](format.raw/*23.33*/("""
        """),format.raw/*24.9*/("""<label for="">BMI: </label> <span id="bmi"></span>
    """)))}/*25.7*/else/*25.12*/{_display_(Seq[Any](format.raw/*25.13*/("""
           """),format.raw/*26.12*/("""<label>Height: </label> <span>"""),_display_(/*26.43*/outputHeightOrNA(String.valueOf(patient.getHeightFeet), String.valueOf(patient.getHeightInches), settings.isMetric)),format.raw/*26.158*/(""" """),format.raw/*26.159*/("""/ """),_display_(/*26.162*/outputHeightOrNA(String.valueOf(patient.getHeightFeetDual), String.valueOf(patient.getHeightInchesDual), !settings.isMetric)),format.raw/*26.286*/("""</span>
            <label>Weight: </label> <span>"""),_display_(/*27.44*/outputWeightOrNA(String.valueOf(patient.getWeight), settings.isMetric)),format.raw/*27.114*/(""" """),format.raw/*27.115*/("""/ """),_display_(/*27.118*/outputWeightOrNA(String.valueOf(patient.getWeightDual), !settings.isMetric)),format.raw/*27.193*/("""</span>

    """)))}),format.raw/*29.6*/("""

    """),format.raw/*31.25*/("""

    """),format.raw/*33.5*/("""<label>Weeks Pregnant: </label> <span>"""),_display_(/*33.44*/outputIntOrNA(patient.getWeeksPregnant)),format.raw/*33.83*/("""</span>

    """),format.raw/*35.25*/("""
    """),_display_(/*36.6*/if(patientEncounter.getChiefComplaints != null && patientEncounter.getChiefComplaints.size > 0 && patientEncounter.getChiefComplaints.get(0) != null && !patientEncounter.getChiefComplaints.get(0).isEmpty)/*36.210*/ {_display_(Seq[Any](format.raw/*36.212*/("""
        """),format.raw/*37.9*/("""<label>Complaint: </label> <span>"""),_display_(/*37.43*/for(x <- 1 to patientEncounter.getChiefComplaints.size) yield /*37.98*/ {_display_(Seq[Any](format.raw/*37.100*/("""
            """),_display_(/*38.14*/patientEncounter/*38.30*/.getChiefComplaints.get(x - 1)),format.raw/*38.60*/(""" """),_display_(/*38.62*/if(x < patientEncounter.getChiefComplaints.size)/*38.110*/ {_display_(Seq[Any](format.raw/*38.112*/(""" """),format.raw/*38.113*/("""| """)))}),format.raw/*38.116*/("""
        """)))}),format.raw/*39.10*/("""</span>
    """)))}/*40.7*/else/*40.12*/{_display_(Seq[Any](format.raw/*40.13*/("""
        """),format.raw/*41.9*/("""<label>Complaint: </label> <span>N/A</span>
    """)))}),format.raw/*42.6*/("""
"""),format.raw/*43.1*/("""</div>
</div>

"""))
      }
    }
  }

  def render(patient:femr.common.models.PatientItem,patientEncounter:femr.common.models.PatientEncounterItem,settings:femr.common.models.SettingItem,pageName:java.lang.String): play.twirl.api.HtmlFormat.Appendable = apply(patient,patientEncounter,settings,pageName)

  def f:((femr.common.models.PatientItem,femr.common.models.PatientEncounterItem,femr.common.models.SettingItem,java.lang.String) => play.twirl.api.HtmlFormat.Appendable) = (patient,patientEncounter,settings,pageName) => apply(patient,patientEncounter,settings,pageName)

  def ref: this.type = this

}


}

/**/
object patientOverview extends patientOverview_Scope0.patientOverview
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:18 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/patientOverview.scala.html
                  HASH: 2178ac890c91fa0e6b00625505fbbaee862f5ac4
                  MATRIX: 894->1|1344->180|1374->367|1402->369|1517->457|1546->465|1586->479|1664->548|1704->550|1741->560|1779->571|1795->578|1831->593|1927->672|1940->677|1979->678|2016->688|2084->726|2119->734|2174->762|2190->769|2224->782|2253->784|2269->791|2302->803|2376->850|2392->857|2420->864|2494->911|2510->918|2538->925|2613->973|2629->980|2658->988|2698->1002|2732->1027|2772->1029|2809->1039|2884->1097|2897->1102|2936->1103|2977->1116|3035->1147|3172->1262|3202->1263|3233->1266|3379->1390|3458->1442|3550->1512|3580->1513|3611->1516|3708->1591|3754->1607|3790->1635|3825->1643|3891->1682|3951->1721|3994->1756|4027->1763|4241->1967|4282->1969|4319->1979|4380->2013|4451->2068|4492->2070|4534->2085|4559->2101|4610->2131|4639->2133|4697->2181|4738->2183|4768->2184|4803->2187|4845->2198|4877->2213|4890->2218|4929->2219|4966->2229|5046->2279|5075->2281
                  LINES: 27->1|35->2|37->7|38->8|40->10|40->10|42->12|42->12|42->12|43->13|43->13|43->13|43->13|45->15|45->15|45->15|46->16|47->17|49->19|49->19|49->19|49->19|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|52->22|52->22|53->23|53->23|53->23|54->24|55->25|55->25|55->25|56->26|56->26|56->26|56->26|56->26|56->26|57->27|57->27|57->27|57->27|57->27|59->29|61->31|63->33|63->33|63->33|65->35|66->36|66->36|66->36|67->37|67->37|67->37|67->37|68->38|68->38|68->38|68->38|68->38|68->38|68->38|68->38|69->39|70->40|70->40|70->40|71->41|72->42|73->43
                  -- GENERATED --
              */
          