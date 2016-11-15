
package femr.ui.views.html.medical

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listVitals_Scope0 {
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

class listVitals extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[femr.util.DataStructure.Mapping.VitalMultiMap,femr.ui.models.medical.EditViewModelGet,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(vitalMap: femr.util.DataStructure.Mapping.VitalMultiMap, viewModel: femr.ui.models.medical.EditViewModelGet):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.partials.helpers.outputHeightOrNA
import femr.ui.views.html.partials.helpers.outputWeightOrNA
import femr.ui.views.html.partials.helpers.outputTemperatureOrNA

Seq[Any](format.raw/*1.111*/("""

"""),format.raw/*6.1*/("""
"""),format.raw/*8.87*/("""

"""),format.raw/*10.1*/("""<link rel="stylesheet" href=""""),_display_(/*10.31*/routes/*10.37*/.Assets.versioned("css/libraries/jquery.tablescroll.css")),format.raw/*10.94*/("""">
<link rel="stylesheet" href=""""),_display_(/*11.31*/routes/*11.37*/.Assets.versioned("css/medical/listVitals.css")),format.raw/*11.84*/("""">

<script>window.jQuery || document.write ( '<script type="text/javascript" src="   """),_display_(/*13.84*/routes/*13.90*/.Assets.versioned("js/libraries/jquery-2.0.3.min.js")),format.raw/*13.143*/(""" """),format.raw/*13.144*/(""""><\/script>')</script>
<script type="text/javascript" src=""""),_display_(/*14.38*/routes/*14.44*/.Assets.versioned("js/libraries/jquery.tablescroll.js")),format.raw/*14.99*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*15.38*/routes/*15.44*/.Assets.versioned("js/medical/listVitals.js")),format.raw/*15.89*/(""""></script>

<table id="vitalTable" cellspacing="0">
    <thead></thead>
    <tbody>
        <tr class="first">
            <th></th>
            """),_display_(/*22.14*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*22.75*/ {_display_(Seq[Any](format.raw/*22.77*/("""
                """),format.raw/*23.17*/("""<td>"""),_display_(/*23.22*/vitalMap/*23.30*/.getFormatedDateTime(dateIndex - 1)),format.raw/*23.65*/("""</td>
            """)))}),format.raw/*24.14*/("""
        """),format.raw/*25.9*/("""</tr>
        <tr id="bloodPressure">
            <th>BP</th>
            """),_display_(/*28.14*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*28.75*/ {_display_(Seq[Any](format.raw/*28.77*/("""
                """),format.raw/*29.17*/("""<td>
                    <span class="systolic">"""),_display_(/*30.45*/vitalMap/*30.53*/.get("bloodPressureSystolic", vitalMap.getDate(dateIndex - 1))),format.raw/*30.115*/("""</span>
                    / <span class="diastolic">"""),_display_(/*31.48*/vitalMap/*31.56*/.get("bloodPressureDiastolic", vitalMap.getDate(dateIndex - 1))),format.raw/*31.119*/("""</span>
                </td>
            """)))}),format.raw/*33.14*/("""
        """),format.raw/*34.9*/("""</tr>
        <tr id="heartRate">
            <th>HR</th>
            """),_display_(/*37.14*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*37.75*/ {_display_(Seq[Any](format.raw/*37.77*/("""
                """),format.raw/*38.17*/("""<td>"""),_display_(/*38.22*/vitalMap/*38.30*/.get("heartRate", vitalMap.getDate(dateIndex - 1))),format.raw/*38.80*/("""</td>
            """)))}),format.raw/*39.14*/("""
        """),format.raw/*40.9*/("""</tr>
        <tr id="temperature">
            <th>T</th>
            """),_display_(/*43.14*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*43.75*/ {_display_(Seq[Any](format.raw/*43.77*/("""
                """),format.raw/*44.17*/("""<td>"""),_display_(/*44.22*/if(viewModel.getSettings.isMetric)/*44.56*/ {_display_(Seq[Any](format.raw/*44.58*/("""
                    """),_display_(/*45.22*/outputTemperatureOrNA(vitalMap.get("temperatureCelsius", vitalMap.getDate(dateIndex - 1)), viewModel.getSettings.isMetric, "")),format.raw/*45.148*/("""
                    """),format.raw/*46.21*/("""/"""),_display_(/*46.23*/outputTemperatureOrNA(vitalMap.get("temperature", vitalMap.getDate(dateIndex - 1)), !viewModel.getSettings.isMetric, "")),format.raw/*46.143*/("""
                """)))}/*47.19*/else/*47.24*/{_display_(Seq[Any](format.raw/*47.25*/("""
                    """),_display_(/*48.22*/outputTemperatureOrNA(vitalMap.get("temperature", vitalMap.getDate(dateIndex - 1)), viewModel.getSettings.isMetric, "")),format.raw/*48.141*/("""
                    """),format.raw/*49.21*/("""/"""),_display_(/*49.23*/outputTemperatureOrNA(vitalMap.get("temperatureCelsius", vitalMap.getDate(dateIndex - 1)), !viewModel.getSettings.isMetric, "")),format.raw/*49.150*/("""
                """)))}),format.raw/*50.18*/("""
                """),format.raw/*51.17*/("""</td>
            """)))}),format.raw/*52.14*/("""
        """),format.raw/*53.9*/("""</tr>
        <tr id="respiratoryRate">
            <th>RR</th>
            """),_display_(/*56.14*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*56.75*/ {_display_(Seq[Any](format.raw/*56.77*/("""
                """),format.raw/*57.17*/("""<td>"""),_display_(/*57.22*/vitalMap/*57.30*/.get("respiratoryRate", vitalMap.getDate(dateIndex - 1))),format.raw/*57.86*/("""</td>
            """)))}),format.raw/*58.14*/("""
        """),format.raw/*59.9*/("""</tr>
        <tr id="glucose">
            <th>Gluc</th>
            """),_display_(/*62.14*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*62.75*/ {_display_(Seq[Any](format.raw/*62.77*/("""
                """),format.raw/*63.17*/("""<td>"""),_display_(/*63.22*/vitalMap/*63.30*/.get("glucose", vitalMap.getDate(dateIndex - 1))),format.raw/*63.78*/("""</td>
            """)))}),format.raw/*64.14*/("""
        """),format.raw/*65.9*/("""</tr>
        <tr id="oxygenSaturation">
            <th>SpO2</th>
            """),_display_(/*68.14*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*68.75*/ {_display_(Seq[Any](format.raw/*68.77*/("""
                """),format.raw/*69.17*/("""<td>"""),_display_(/*69.22*/vitalMap/*69.30*/.get("oxygenSaturation", vitalMap.getDate(dateIndex - 1))),format.raw/*69.87*/("""</td>
			""")))}),format.raw/*70.5*/("""
        """),format.raw/*71.9*/("""</tr>
        <tr>
            <th>WP</th> <!-- Sam Zanni -->
            """),_display_(/*74.14*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*74.75*/ {_display_(Seq[Any](format.raw/*74.77*/("""
                """),format.raw/*75.17*/("""<td>"""),_display_(/*75.22*/vitalMap/*75.30*/.get("weeksPregnant", vitalMap.getDate(dateIndex - 1))),format.raw/*75.84*/("""</td>
            """)))}),format.raw/*76.14*/("""
        """),format.raw/*77.9*/("""</tr>
        <tr id="height">
            <th>Ht</th>
            <!--- Change metric output here --->
            """),_display_(/*81.14*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*81.75*/ {_display_(Seq[Any](format.raw/*81.77*/("""
                """),format.raw/*82.17*/("""<td data-feet=""""),_display_(/*82.33*/vitalMap/*82.41*/.get("heightFeet", vitalMap.getDate(dateIndex - 1))),format.raw/*82.92*/(""""
                    data-inches=""""),_display_(/*83.35*/vitalMap/*83.43*/.get("heightInches", vitalMap.getDate(dateIndex - 1))),format.raw/*83.96*/("""">

                """),_display_(/*85.18*/if(viewModel.getSettings.isMetric)/*85.52*/ {_display_(Seq[Any](format.raw/*85.54*/("""
                    """),format.raw/*86.67*/("""
                    """),_display_(/*87.22*/outputHeightOrNA(
                        vitalMap.get("heightMeters", vitalMap.getDate(dateIndex - 1)),
                        vitalMap.get("heightCm", vitalMap.getDate(dateIndex - 1)),
                        viewModel.getSettings.isMetric,
                        ""
                    )),format.raw/*92.22*/("""
                    """),format.raw/*93.21*/("""/"""),_display_(/*93.23*/outputHeightOrNA(
                        vitalMap.get("heightFeet", vitalMap.getDate(dateIndex - 1)),
                        vitalMap.get("heightInches", vitalMap.getDate(dateIndex - 1)),
                        !viewModel.getSettings.isMetric,
                        ""
                    )),format.raw/*98.22*/("""
                """)))}/*99.19*/else/*99.24*/{_display_(Seq[Any](format.raw/*99.25*/("""
                    """),format.raw/*100.70*/("""
                    """),_display_(/*101.22*/outputHeightOrNA(
                        vitalMap.get("heightFeet", vitalMap.getDate(dateIndex - 1)),
                        vitalMap.get("heightInches", vitalMap.getDate(dateIndex - 1)),
                        viewModel.getSettings.isMetric,
                        ""
                    )),format.raw/*106.22*/(""" """),format.raw/*106.23*/("""/"""),_display_(/*106.25*/outputHeightOrNA(
                        vitalMap.get("heightMeters", vitalMap.getDate(dateIndex - 1)),
                        vitalMap.get("heightCm", vitalMap.getDate(dateIndex - 1)),
                        !viewModel.getSettings.isMetric,
                        ""
                    )),format.raw/*111.22*/("""
                """)))}),format.raw/*112.18*/("""
                """),format.raw/*113.17*/("""</td>
            """)))}),format.raw/*114.14*/("""
        """),format.raw/*115.9*/("""</tr>
        <tr id="weight">
            <th>Wt</th>
            """),_display_(/*118.14*/for(dateIndex <- 1 to vitalMap.getDateListChronological.size) yield /*118.75*/ {_display_(Seq[Any](format.raw/*118.77*/("""
                """),format.raw/*119.17*/("""<td data-weight=""""),_display_(/*119.35*/vitalMap/*119.43*/.get("weight", vitalMap.getDate(dateIndex - 1))),format.raw/*119.90*/("""">
                """),_display_(/*120.18*/if(viewModel.getSettings.isMetric)/*120.52*/ {_display_(Seq[Any](format.raw/*120.54*/("""
                    """),_display_(/*121.22*/outputWeightOrNA(vitalMap.get("weightKgs", vitalMap.getDate(dateIndex - 1)), viewModel.getSettings.isMetric, "")),format.raw/*121.134*/("""
                    """),format.raw/*122.21*/("""/"""),_display_(/*122.23*/outputWeightOrNA(vitalMap.get("weight", vitalMap.getDate(dateIndex - 1)), !viewModel.getSettings.isMetric, "")),format.raw/*122.133*/("""
                """)))}/*123.19*/else/*123.24*/{_display_(Seq[Any](format.raw/*123.25*/("""
                    """),_display_(/*124.22*/outputWeightOrNA(vitalMap.get("weight", vitalMap.getDate(dateIndex - 1)), viewModel.getSettings.isMetric, "")),format.raw/*124.131*/("""
                  """),format.raw/*125.19*/("""/"""),_display_(/*125.21*/outputWeightOrNA(vitalMap.get("weightKgs", vitalMap.getDate(dateIndex - 1)), !viewModel.getSettings.isMetric, "")),format.raw/*125.134*/("""

                """)))}),format.raw/*127.18*/("""
                """),format.raw/*128.17*/("""</td>
            """)))}),format.raw/*129.14*/("""
        """),format.raw/*130.9*/("""</tr>
    </tbody>
</table>"""))
      }
    }
  }

  def render(vitalMap:femr.util.DataStructure.Mapping.VitalMultiMap,viewModel:femr.ui.models.medical.EditViewModelGet): play.twirl.api.HtmlFormat.Appendable = apply(vitalMap,viewModel)

  def f:((femr.util.DataStructure.Mapping.VitalMultiMap,femr.ui.models.medical.EditViewModelGet) => play.twirl.api.HtmlFormat.Appendable) = (vitalMap,viewModel) => apply(vitalMap,viewModel)

  def ref: this.type = this

}


}

/**/
object listVitals extends listVitals_Scope0.listVitals
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:18 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/medical/listVitals.scala.html
                  HASH: 5a008ed73717c87a4065ed8a25be5a321b83737d
                  MATRIX: 850->1|1239->110|1269->305|1298->484|1329->488|1386->518|1401->524|1479->581|1540->615|1555->621|1623->668|1739->757|1754->763|1829->816|1859->817|1948->879|1963->885|2039->940|2116->990|2131->996|2197->1041|2378->1195|2455->1256|2495->1258|2541->1276|2573->1281|2590->1289|2646->1324|2697->1344|2734->1354|2839->1432|2916->1493|2956->1495|3002->1513|3079->1563|3096->1571|3180->1633|3263->1689|3280->1697|3365->1760|3441->1805|3478->1815|3579->1889|3656->1950|3696->1952|3742->1970|3774->1975|3791->1983|3862->2033|3913->2053|3950->2063|4052->2138|4129->2199|4169->2201|4215->2219|4247->2224|4290->2258|4330->2260|4380->2283|4528->2409|4578->2431|4607->2433|4749->2553|4787->2573|4800->2578|4839->2579|4889->2602|5030->2721|5080->2743|5109->2745|5258->2872|5308->2891|5354->2909|5405->2929|5442->2939|5549->3019|5626->3080|5666->3082|5712->3100|5744->3105|5761->3113|5838->3169|5889->3189|5926->3199|6027->3273|6104->3334|6144->3336|6190->3354|6222->3359|6239->3367|6308->3415|6359->3435|6396->3445|6506->3528|6583->3589|6623->3591|6669->3609|6701->3614|6718->3622|6796->3679|6837->3690|6874->3700|6979->3778|7056->3839|7096->3841|7142->3859|7174->3864|7191->3872|7266->3926|7317->3946|7354->3956|7502->4077|7579->4138|7619->4140|7665->4158|7708->4174|7725->4182|7797->4233|7861->4270|7878->4278|7952->4331|8002->4354|8045->4388|8085->4390|8135->4458|8185->4481|8503->4778|8553->4800|8582->4802|8903->5102|8941->5122|8954->5127|8993->5128|9044->5199|9095->5222|9416->5521|9446->5522|9476->5524|9796->5822|9847->5841|9894->5859|9946->5879|9984->5889|10083->5960|10161->6021|10202->6023|10249->6041|10295->6059|10313->6067|10382->6114|10431->6135|10475->6169|10516->6171|10567->6194|10702->6306|10753->6328|10783->6330|10916->6440|10955->6460|10969->6465|11009->6466|11060->6489|11192->6598|11241->6618|11271->6620|11407->6733|11460->6754|11507->6772|11559->6792|11597->6802
                  LINES: 27->1|34->1|36->6|37->8|39->10|39->10|39->10|39->10|40->11|40->11|40->11|42->13|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|51->22|51->22|51->22|52->23|52->23|52->23|52->23|53->24|54->25|57->28|57->28|57->28|58->29|59->30|59->30|59->30|60->31|60->31|60->31|62->33|63->34|66->37|66->37|66->37|67->38|67->38|67->38|67->38|68->39|69->40|72->43|72->43|72->43|73->44|73->44|73->44|73->44|74->45|74->45|75->46|75->46|75->46|76->47|76->47|76->47|77->48|77->48|78->49|78->49|78->49|79->50|80->51|81->52|82->53|85->56|85->56|85->56|86->57|86->57|86->57|86->57|87->58|88->59|91->62|91->62|91->62|92->63|92->63|92->63|92->63|93->64|94->65|97->68|97->68|97->68|98->69|98->69|98->69|98->69|99->70|100->71|103->74|103->74|103->74|104->75|104->75|104->75|104->75|105->76|106->77|110->81|110->81|110->81|111->82|111->82|111->82|111->82|112->83|112->83|112->83|114->85|114->85|114->85|115->86|116->87|121->92|122->93|122->93|127->98|128->99|128->99|128->99|129->100|130->101|135->106|135->106|135->106|140->111|141->112|142->113|143->114|144->115|147->118|147->118|147->118|148->119|148->119|148->119|148->119|149->120|149->120|149->120|150->121|150->121|151->122|151->122|151->122|152->123|152->123|152->123|153->124|153->124|154->125|154->125|154->125|156->127|157->128|158->129|159->130
                  -- GENERATED --
              */
          