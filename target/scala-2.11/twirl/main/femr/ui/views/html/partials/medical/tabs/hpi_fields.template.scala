
package femr.ui.views.html.partials.medical.tabs

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object hpi_fields_Scope0 {
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

class hpi_fields extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[femr.common.models.TabItem,java.lang.Boolean,java.lang.String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(hpiTab: femr.common.models.TabItem, isConsolidated: java.lang.Boolean, chiefComplaint: java.lang.String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.partials.medical.severityDropDown;

Seq[Any](format.raw/*1.107*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.48*/("""
"""),format.raw/*6.1*/("""<div class="hpiWraps hidden">

"""),_display_(/*8.2*/if(!isConsolidated)/*8.21*/ {_display_(Seq[Any](format.raw/*8.23*/("""
    """),format.raw/*9.5*/("""<div class="leftHPI">

        <div class="staticField">
            <label for="onset">Onset</label>
            """),_display_(/*13.14*/defining(hpiTab.getTabFieldItemByName(chiefComplaint, "onset"))/*13.77*/ { onset =>_display_(Seq[Any](format.raw/*13.88*/("""
                """),format.raw/*14.17*/("""<input name="tabFieldItems["""),_display_(/*14.45*/onset/*14.50*/.getIndex),format.raw/*14.59*/("""].name" type="text" class="hidden" value="onset"/>
                <input name="tabFieldItems["""),_display_(/*15.45*/onset/*15.50*/.getIndex),format.raw/*15.59*/("""].chiefComplaint" type="text" class="hidden" value=""""),_display_(/*15.112*/chiefComplaint),format.raw/*15.126*/(""""/>
                <input name="tabFieldItems["""),_display_(/*16.45*/onset/*16.50*/.getIndex),format.raw/*16.59*/("""].value" type="text" class="fInput" value=""""),_display_(/*16.103*/onset/*16.108*/.getValue),format.raw/*16.117*/("""" />
            """)))}),format.raw/*17.14*/("""


        """),format.raw/*20.9*/("""</div>

        <div class="staticField">
            <label for="radiation">Radiation</label>
            """),_display_(/*24.14*/defining(hpiTab.getTabFieldItemByName(chiefComplaint, "radiation"))/*24.81*/ { radiation =>_display_(Seq[Any](format.raw/*24.96*/("""
                """),format.raw/*25.17*/("""<input name="tabFieldItems["""),_display_(/*25.45*/radiation/*25.54*/.getIndex),format.raw/*25.63*/("""].name" type="text" class="hidden" value="radiation"/>
                <input name="tabFieldItems["""),_display_(/*26.45*/radiation/*26.54*/.getIndex),format.raw/*26.63*/("""].chiefComplaint" type="text" class="hidden" value=""""),_display_(/*26.116*/chiefComplaint),format.raw/*26.130*/(""""/>
                <input name="tabFieldItems["""),_display_(/*27.45*/radiation/*27.54*/.getIndex),format.raw/*27.63*/("""].value" type="text" class="fInput" value=""""),_display_(/*27.107*/radiation/*27.116*/.getValue),format.raw/*27.125*/("""" />
            """)))}),format.raw/*28.14*/("""
        """),format.raw/*29.9*/("""</div>

    </div>

    <div class="rightHPI">
        <div class="staticField">
            <label for="quality">Quality</label>
            """),_display_(/*36.14*/defining(hpiTab.getTabFieldItemByName(chiefComplaint, "quality"))/*36.79*/ { quality =>_display_(Seq[Any](format.raw/*36.92*/("""
                """),format.raw/*37.17*/("""<input name="tabFieldItems["""),_display_(/*37.45*/quality/*37.52*/.getIndex),format.raw/*37.61*/("""].name" type="text" class="hidden" value="quality"/>
                <input name="tabFieldItems["""),_display_(/*38.45*/quality/*38.52*/.getIndex),format.raw/*38.61*/("""].chiefComplaint" type="text" class="hidden" value=""""),_display_(/*38.114*/chiefComplaint),format.raw/*38.128*/(""""/>
                <input name="tabFieldItems["""),_display_(/*39.45*/quality/*39.52*/.getIndex),format.raw/*39.61*/("""].value" type="text" class="fInput" value=""""),_display_(/*39.105*/quality/*39.112*/.getValue),format.raw/*39.121*/("""" />
            """)))}),format.raw/*40.14*/("""
        """),format.raw/*41.9*/("""</div>

        """),format.raw/*43.23*/("""
        """),format.raw/*44.9*/("""<div class="staticField">
        """),_display_(/*45.10*/severityDropDown(chiefComplaint, hpiTab.getTabFieldItemByName(chiefComplaint, "severity"))),format.raw/*45.100*/("""
        """),format.raw/*46.9*/("""</div>


    </div>
    <div class="bottomHPI">

        <div class="staticField">
            <label for="provokes">Provokes</label>
            """),_display_(/*54.14*/defining(hpiTab.getTabFieldItemByName(chiefComplaint, "provokes"))/*54.80*/ { provokes =>_display_(Seq[Any](format.raw/*54.94*/("""
                """),format.raw/*55.17*/("""<input name="tabFieldItems["""),_display_(/*55.45*/provokes/*55.53*/.getIndex),format.raw/*55.62*/("""].name" type="text" class="hidden" value="provokes"/>
                <input name="tabFieldItems["""),_display_(/*56.45*/provokes/*56.53*/.getIndex),format.raw/*56.62*/("""].chiefComplaint" type="text" class="hidden" value=""""),_display_(/*56.115*/chiefComplaint),format.raw/*56.129*/(""""/>
                <input name="tabFieldItems["""),_display_(/*57.45*/provokes/*57.53*/.getIndex),format.raw/*57.62*/("""].value" type="text" class="fInput" value=""""),_display_(/*57.106*/provokes/*57.114*/.getValue),format.raw/*57.123*/("""" />
            """)))}),format.raw/*58.14*/("""
        """),format.raw/*59.9*/("""</div>

        <div class="staticField">
            <label for="palliates">Palliates</label>
            """),_display_(/*63.14*/defining(hpiTab.getTabFieldItemByName(chiefComplaint, "palliates"))/*63.81*/ { palliates =>_display_(Seq[Any](format.raw/*63.96*/("""
                """),format.raw/*64.17*/("""<input name="tabFieldItems["""),_display_(/*64.45*/palliates/*64.54*/.getIndex),format.raw/*64.63*/("""].name" type="text" class="hidden" value="palliates"/>
                <input name="tabFieldItems["""),_display_(/*65.45*/palliates/*65.54*/.getIndex),format.raw/*65.63*/("""].chiefComplaint" type="text" class="hidden" value=""""),_display_(/*65.116*/chiefComplaint),format.raw/*65.130*/(""""/>
                <input name="tabFieldItems["""),_display_(/*66.45*/palliates/*66.54*/.getIndex),format.raw/*66.63*/("""].value" type="text" class="fInput" value=""""),_display_(/*66.107*/palliates/*66.116*/.getValue),format.raw/*66.125*/("""" />
            """)))}),format.raw/*67.14*/("""
        """),format.raw/*68.9*/("""</div>

        <div class="staticField">
            <label for="timeOfDay">Time Of Day</label>
            """),_display_(/*72.14*/defining(hpiTab.getTabFieldItemByName(chiefComplaint, "timeOfDay"))/*72.81*/ { timeOfDay =>_display_(Seq[Any](format.raw/*72.96*/("""
                """),format.raw/*73.17*/("""<input name="tabFieldItems["""),_display_(/*73.45*/timeOfDay/*73.54*/.getIndex),format.raw/*73.63*/("""].name" type="text" class="hidden" value="timeOfDay"/>
                <input name="tabFieldItems["""),_display_(/*74.45*/timeOfDay/*74.54*/.getIndex),format.raw/*74.63*/("""].chiefComplaint" type="text" class="hidden" value=""""),_display_(/*74.116*/chiefComplaint),format.raw/*74.130*/(""""/>
                <input name="tabFieldItems["""),_display_(/*75.45*/timeOfDay/*75.54*/.getIndex),format.raw/*75.63*/("""].value" type="text" class="fInput" value=""""),_display_(/*75.107*/timeOfDay/*75.116*/.getValue),format.raw/*75.125*/("""" />
            """)))}),format.raw/*76.14*/("""
        """),format.raw/*77.9*/("""</div>

        <div class="staticField">
            <label for="narrative">Narrative</label>
            """),_display_(/*81.14*/defining(hpiTab.getTabFieldItemByName(chiefComplaint, "narrative"))/*81.81*/ { narrative =>_display_(Seq[Any](format.raw/*81.96*/("""
                """),format.raw/*82.17*/("""<input name="tabFieldItems["""),_display_(/*82.45*/narrative/*82.54*/.getIndex),format.raw/*82.63*/("""].name" type="text" class="hidden" value="narrative"/>
                <input name="tabFieldItems["""),_display_(/*83.45*/narrative/*83.54*/.getIndex),format.raw/*83.63*/("""].chiefComplaint" type="text" class="hidden" value=""""),_display_(/*83.116*/chiefComplaint),format.raw/*83.130*/(""""/>
                <input name="tabFieldItems["""),_display_(/*84.45*/narrative/*84.54*/.getIndex),format.raw/*84.63*/("""].value" type="text" class="fInput" value=""""),_display_(/*84.107*/narrative/*84.116*/.getValue),format.raw/*84.125*/("""" />
            """)))}),format.raw/*85.14*/("""
        """),format.raw/*86.9*/("""</div>

        <div class="staticField">
            """),format.raw/*89.39*/("""
            """),format.raw/*90.13*/("""<label for="physicalExamination">Physical Examination</label>
            """),_display_(/*91.14*/defining(hpiTab.getTabFieldItemByName(chiefComplaint, "physicalExamination"))/*91.91*/ { physicalExamination =>_display_(Seq[Any](format.raw/*91.116*/("""
                """),format.raw/*92.17*/("""<input name="tabFieldItems["""),_display_(/*92.45*/physicalExamination/*92.64*/.getIndex),format.raw/*92.73*/("""].name" type="text" class="hidden" value="physicalExamination"/>
                <input name="tabFieldItems["""),_display_(/*93.45*/physicalExamination/*93.64*/.getIndex),format.raw/*93.73*/("""].chiefComplaint" type="text" class="hidden" value=""""),_display_(/*93.126*/chiefComplaint),format.raw/*93.140*/(""""/>
                <textarea rows="3" name="tabFieldItems["""),_display_(/*94.57*/physicalExamination/*94.76*/.getIndex),format.raw/*94.85*/("""].value" class="form-control input-sm">"""),_display_(/*94.125*/physicalExamination/*94.144*/.getValue),format.raw/*94.153*/("""</textarea>
            """)))}),format.raw/*95.14*/("""
        """),format.raw/*96.9*/("""</div>
    </div>

""")))}/*99.3*/else/*99.8*/{_display_(Seq[Any](format.raw/*99.9*/("""
    """),format.raw/*100.5*/("""<div class="staticField">
        <label for="narrative">Narrative</label>
        """),_display_(/*102.10*/defining(hpiTab.getTabFieldItemByName(chiefComplaint, "narrative"))/*102.77*/ { narrative =>_display_(Seq[Any](format.raw/*102.92*/("""
            """),format.raw/*103.13*/("""<input name="tabFieldItems["""),_display_(/*103.41*/narrative/*103.50*/.getIndex),format.raw/*103.59*/("""].name" type="text" class="hidden" value="narrative"/>
            <input name="tabFieldItems["""),_display_(/*104.41*/narrative/*104.50*/.getIndex),format.raw/*104.59*/("""].chiefComplaint" type="text" class="hidden" value=""""),_display_(/*104.112*/chiefComplaint),format.raw/*104.126*/(""""/>
            <textarea name="tabFieldItems["""),_display_(/*105.44*/narrative/*105.53*/.getIndex),format.raw/*105.62*/("""].value" class="fNarrativeTextArea" >"""),_display_(/*105.100*/narrative/*105.109*/.getValue),format.raw/*105.118*/("""</textarea>
        """)))}),format.raw/*106.10*/("""
    """),format.raw/*107.5*/("""</div>
""")))}),format.raw/*108.2*/("""
"""),format.raw/*109.1*/("""</div>"""))
      }
    }
  }

  def render(hpiTab:femr.common.models.TabItem,isConsolidated:java.lang.Boolean,chiefComplaint:java.lang.String): play.twirl.api.HtmlFormat.Appendable = apply(hpiTab,isConsolidated,chiefComplaint)

  def f:((femr.common.models.TabItem,java.lang.Boolean,java.lang.String) => play.twirl.api.HtmlFormat.Appendable) = (hpiTab,isConsolidated,chiefComplaint) => apply(hpiTab,isConsolidated,chiefComplaint)

  def ref: this.type = this

}


}

/**/
object hpi_fields extends hpi_fields_Scope0.hpi_fields
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/medical/tabs/hpi_fields.scala.html
                  HASH: b4aa592aa5401866771cd0db410dcefd712e8b2d
                  MATRIX: 840->1|1101->106|1131->173|1160->222|1188->224|1247->258|1274->277|1313->279|1345->285|1491->404|1563->467|1612->478|1658->496|1713->524|1727->529|1757->538|1880->634|1894->639|1924->648|2005->701|2041->715|2117->764|2131->769|2161->778|2233->822|2248->827|2279->836|2329->855|2370->869|2509->981|2585->1048|2638->1063|2684->1081|2739->1109|2757->1118|2787->1127|2914->1227|2932->1236|2962->1245|3043->1298|3079->1312|3155->1361|3173->1370|3203->1379|3275->1423|3294->1432|3325->1441|3375->1460|3412->1470|3589->1620|3663->1685|3714->1698|3760->1716|3815->1744|3831->1751|3861->1760|3986->1858|4002->1865|4032->1874|4113->1927|4149->1941|4225->1990|4241->1997|4271->2006|4343->2050|4360->2057|4391->2066|4441->2085|4478->2095|4524->2127|4561->2137|4624->2173|4736->2263|4773->2273|4955->2428|5030->2494|5082->2508|5128->2526|5183->2554|5200->2562|5230->2571|5356->2670|5373->2678|5403->2687|5484->2740|5520->2754|5596->2803|5613->2811|5643->2820|5715->2864|5733->2872|5764->2881|5814->2900|5851->2910|5990->3022|6066->3089|6119->3104|6165->3122|6220->3150|6238->3159|6268->3168|6395->3268|6413->3277|6443->3286|6524->3339|6560->3353|6636->3402|6654->3411|6684->3420|6756->3464|6775->3473|6806->3482|6856->3501|6893->3511|7034->3625|7110->3692|7163->3707|7209->3725|7264->3753|7282->3762|7312->3771|7439->3871|7457->3880|7487->3889|7568->3942|7604->3956|7680->4005|7698->4014|7728->4023|7800->4067|7819->4076|7850->4085|7900->4104|7937->4114|8076->4226|8152->4293|8205->4308|8251->4326|8306->4354|8324->4363|8354->4372|8481->4472|8499->4481|8529->4490|8610->4543|8646->4557|8722->4606|8740->4615|8770->4624|8842->4668|8861->4677|8892->4686|8942->4705|8979->4715|9064->4798|9106->4812|9209->4888|9295->4965|9359->4990|9405->5008|9460->5036|9488->5055|9518->5064|9655->5174|9683->5193|9713->5202|9794->5255|9830->5269|9918->5330|9946->5349|9976->5358|10044->5398|10073->5417|10104->5426|10161->5452|10198->5462|10239->5486|10251->5491|10289->5492|10323->5498|10437->5584|10514->5651|10568->5666|10611->5680|10667->5708|10686->5717|10717->5726|10841->5822|10860->5831|10891->5840|10973->5893|11010->5907|11086->5955|11105->5964|11136->5973|11203->6011|11223->6020|11255->6029|11309->6051|11343->6057|11383->6066|11413->6068
                  LINES: 27->1|32->1|34->4|35->5|36->6|38->8|38->8|38->8|39->9|43->13|43->13|43->13|44->14|44->14|44->14|44->14|45->15|45->15|45->15|45->15|45->15|46->16|46->16|46->16|46->16|46->16|46->16|47->17|50->20|54->24|54->24|54->24|55->25|55->25|55->25|55->25|56->26|56->26|56->26|56->26|56->26|57->27|57->27|57->27|57->27|57->27|57->27|58->28|59->29|66->36|66->36|66->36|67->37|67->37|67->37|67->37|68->38|68->38|68->38|68->38|68->38|69->39|69->39|69->39|69->39|69->39|69->39|70->40|71->41|73->43|74->44|75->45|75->45|76->46|84->54|84->54|84->54|85->55|85->55|85->55|85->55|86->56|86->56|86->56|86->56|86->56|87->57|87->57|87->57|87->57|87->57|87->57|88->58|89->59|93->63|93->63|93->63|94->64|94->64|94->64|94->64|95->65|95->65|95->65|95->65|95->65|96->66|96->66|96->66|96->66|96->66|96->66|97->67|98->68|102->72|102->72|102->72|103->73|103->73|103->73|103->73|104->74|104->74|104->74|104->74|104->74|105->75|105->75|105->75|105->75|105->75|105->75|106->76|107->77|111->81|111->81|111->81|112->82|112->82|112->82|112->82|113->83|113->83|113->83|113->83|113->83|114->84|114->84|114->84|114->84|114->84|114->84|115->85|116->86|119->89|120->90|121->91|121->91|121->91|122->92|122->92|122->92|122->92|123->93|123->93|123->93|123->93|123->93|124->94|124->94|124->94|124->94|124->94|124->94|125->95|126->96|129->99|129->99|129->99|130->100|132->102|132->102|132->102|133->103|133->103|133->103|133->103|134->104|134->104|134->104|134->104|134->104|135->105|135->105|135->105|135->105|135->105|135->105|136->106|137->107|138->108|139->109
                  -- GENERATED --
              */
          