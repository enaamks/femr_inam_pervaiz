
package femr.ui.views.html.partials.medical.tabs

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object pmhTab_Scope0 {
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

class pmhTab extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[femr.common.models.TabItem,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pmhTab: femr.common.models.TabItem):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*3.1*/("""<div class="controlWrap hidden" id="pmhControl">
    <div class="form-group">
        <label for="medicalSurgicalHistory">Medical/Surgical History</label>
        """),_display_(/*6.10*/defining(pmhTab.getTabFieldItemByName(null, "medicalSurgicalHistory"))/*6.80*/ { medicalSurgicalHistory =>_display_(Seq[Any](format.raw/*6.108*/("""
            """),format.raw/*7.13*/("""<input type="text" class="hidden" name="tabFieldItems["""),_display_(/*7.68*/medicalSurgicalHistory/*7.90*/.getIndex),format.raw/*7.99*/("""].name" value="medicalSurgicalHistory"/>
            <textarea name="tabFieldItems["""),_display_(/*8.44*/medicalSurgicalHistory/*8.66*/.getIndex),format.raw/*8.75*/("""].value" class="form-control input-sm" >"""),_display_(/*8.116*/medicalSurgicalHistory/*8.138*/.getValue),format.raw/*8.147*/("""</textarea>
        """)))}),format.raw/*9.10*/("""
    """),format.raw/*10.5*/("""</div>

    <div class="form-group">
        <label for="socialHistory">Social History</label>
        """),_display_(/*14.10*/defining(pmhTab.getTabFieldItemByName(null, "socialHistory"))/*14.71*/ { socialHistory =>_display_(Seq[Any](format.raw/*14.90*/("""
            """),format.raw/*15.13*/("""<input type="text" class="hidden" name="tabFieldItems["""),_display_(/*15.68*/socialHistory/*15.81*/.getIndex),format.raw/*15.90*/("""].name" value="socialHistory"/>
            <textarea name="tabFieldItems["""),_display_(/*16.44*/socialHistory/*16.57*/.getIndex),format.raw/*16.66*/("""].value" class="form-control input-sm" >"""),_display_(/*16.107*/socialHistory/*16.120*/.getValue),format.raw/*16.129*/("""</textarea>
        """)))}),format.raw/*17.10*/("""
    """),format.raw/*18.5*/("""</div>

    <div class="form-group">
        <label for="currentMedication">Current Medications</label>
        """),_display_(/*22.10*/defining(pmhTab.getTabFieldItemByName(null, "currentMedication"))/*22.75*/ { currentMedication =>_display_(Seq[Any](format.raw/*22.98*/("""
            """),format.raw/*23.13*/("""<input type="text" class="hidden" name="tabFieldItems["""),_display_(/*23.68*/currentMedication/*23.85*/.getIndex),format.raw/*23.94*/("""].name" value="currentMedication"/>
            <textarea name="tabFieldItems["""),_display_(/*24.44*/currentMedication/*24.61*/.getIndex),format.raw/*24.70*/("""].value" class="form-control input-sm">"""),_display_(/*24.110*/currentMedication/*24.127*/.getValue),format.raw/*24.136*/("""</textarea>
        """)))}),format.raw/*25.10*/("""
    """),format.raw/*26.5*/("""</div>

    <div class="form-group">
        <label for="familyHistory">Family History</label>
        """),_display_(/*30.10*/defining(pmhTab.getTabFieldItemByName(null, "familyHistory"))/*30.71*/ { familyHistory =>_display_(Seq[Any](format.raw/*30.90*/("""
            """),format.raw/*31.13*/("""<input type="text" class="hidden" name="tabFieldItems["""),_display_(/*31.68*/familyHistory/*31.81*/.getIndex),format.raw/*31.90*/("""].name" value="familyHistory"/>
            <textarea name="tabFieldItems["""),_display_(/*32.44*/familyHistory/*32.57*/.getIndex),format.raw/*32.66*/("""].value" class="form-control input-sm">"""),_display_(/*32.106*/familyHistory/*32.119*/.getValue),format.raw/*32.128*/("""</textarea>
        """)))}),format.raw/*33.10*/("""
    """),format.raw/*34.5*/("""</div>
</div>"""))
      }
    }
  }

  def render(pmhTab:femr.common.models.TabItem): play.twirl.api.HtmlFormat.Appendable = apply(pmhTab)

  def f:((femr.common.models.TabItem) => play.twirl.api.HtmlFormat.Appendable) = (pmhTab) => apply(pmhTab)

  def ref: this.type = this

}


}

/**/
object pmhTab extends pmhTab_Scope0.pmhTab
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/medical/tabs/pmhTab.scala.html
                  HASH: f65c4b724c5c392083748c5958686e14e5758cea
                  MATRIX: 797->1|928->37|958->41|1151->208|1229->278|1295->306|1336->320|1417->375|1447->397|1476->406|1587->491|1617->513|1646->522|1714->563|1745->585|1775->594|1827->616|1860->622|1995->730|2065->791|2122->810|2164->824|2246->879|2268->892|2298->901|2401->977|2423->990|2453->999|2522->1040|2545->1053|2576->1062|2629->1084|2662->1090|2806->1207|2880->1272|2941->1295|2983->1309|3065->1364|3091->1381|3121->1390|3228->1470|3254->1487|3284->1496|3352->1536|3379->1553|3410->1562|3463->1584|3496->1590|3631->1698|3701->1759|3758->1778|3800->1792|3882->1847|3904->1860|3934->1869|4037->1945|4059->1958|4089->1967|4157->2007|4180->2020|4211->2029|4264->2051|4297->2057
                  LINES: 27->1|32->1|34->3|37->6|37->6|37->6|38->7|38->7|38->7|38->7|39->8|39->8|39->8|39->8|39->8|39->8|40->9|41->10|45->14|45->14|45->14|46->15|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|47->16|48->17|49->18|53->22|53->22|53->22|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|56->25|57->26|61->30|61->30|61->30|62->31|62->31|62->31|62->31|63->32|63->32|63->32|63->32|63->32|63->32|64->33|65->34
                  -- GENERATED --
              */
          