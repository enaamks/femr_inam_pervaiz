
package femr.ui.views.html.partials.medical.tabs

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object prescriptionRow_Scope0 {
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

class prescriptionRow extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[femr.common.models.MedicationAdministrationItem],Integer,femr.common.models.PrescriptionItem,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( medicationAdministrationItems: List[femr.common.models.MedicationAdministrationItem],
   index: Integer,
   script: femr.common.models.PrescriptionItem
):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.partials.helpers.outputStringOrNA

Seq[Any](format.raw/*4.2*/("""

"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/if( script == null )/*8.22*/ {_display_(Seq[Any](format.raw/*8.24*/("""
"""),format.raw/*9.95*/("""
"""),format.raw/*10.103*/("""

    """),format.raw/*12.5*/("""<div class="prescription-grid prescriptionRow prescriptionInput">

        <input class='medicationID' name='prescriptions["""),_display_(/*14.58*/index),format.raw/*14.63*/("""].medicationID' type='hidden' />

        <span class="prescription-field prescriptionName">
            <input type='text' name="prescriptions["""),_display_(/*17.53*/index),format.raw/*17.58*/("""].medicationName" class='medicationName form-control input-sm'/>
        </span>
        <span class="prescription-field prescriptionAdministration">
            """),format.raw/*20.86*/("""
            """),format.raw/*21.13*/("""<select class="administrationName form-control" name="prescriptions["""),_display_(/*21.82*/index),format.raw/*21.87*/("""].administrationID">
                <option value="-1">- Select -</option>
                """),_display_(/*23.18*/for(item <- medicationAdministrationItems) yield /*23.60*/ {_display_(Seq[Any](format.raw/*23.62*/("""
                    """),format.raw/*24.21*/("""<option value=""""),_display_(/*24.37*/item/*24.41*/.getId),format.raw/*24.47*/("""" data-modifier=""""),_display_(/*24.65*/item/*24.69*/.getDailyModifier),format.raw/*24.86*/("""">"""),_display_(/*24.89*/item/*24.93*/.getName),format.raw/*24.101*/("""</option>
                """)))}),format.raw/*25.18*/("""
            """),format.raw/*26.13*/("""</select>
        </span>
        <span class="prescription-field prescriptionAdministrationDays">
            <input type="number" class="form-control input-sm" />
        </span>
        <span class="prescription-field prescriptionAmount">
            <input name="prescriptions["""),_display_(/*32.41*/index),format.raw/*32.46*/("""].amount" type="number" class="form-control input-sm"/>
        </span>
    </div>

""")))}/*36.2*/else/*36.6*/{_display_(Seq[Any](format.raw/*36.7*/("""
"""),format.raw/*37.111*/("""
    """),format.raw/*38.5*/("""<div class="prescription-grid prescriptionRow prescriptionInput">

        <input class='medicationID' value='"""),_display_(/*40.45*/script/*40.51*/.getMedicationID),format.raw/*40.67*/("""' type='hidden' />

        <span class="prescription-field prescriptionName">
            <input type='text' class='medicationName form-control input-sm' value=""""),_display_(/*43.85*/script/*43.91*/.getName),format.raw/*43.99*/(""" """),format.raw/*43.100*/("""("""),_display_(/*43.102*/outputStringOrNA(script.getMedicationForm)/*43.144*/.toString().trim()),format.raw/*43.162*/(""")" readonly />
        </span>
        <span class="prescription-field prescriptionAdministration">

            <select class="administrationName form-control" readonly disabled>
                <option value="-1">- Select -</option>
                """),_display_(/*49.18*/for(item <- medicationAdministrationItems) yield /*49.60*/ {_display_(Seq[Any](format.raw/*49.62*/("""
                    """),format.raw/*50.21*/("""<option value=""""),_display_(/*50.37*/item/*50.41*/.getId),format.raw/*50.47*/("""" data-modifier=""""),_display_(/*50.65*/item/*50.69*/.getDailyModifier),format.raw/*50.86*/("""" """),_display_(/*50.89*/if( item.getId == script.getAdministrationID )/*50.135*/{_display_(Seq[Any](format.raw/*50.136*/(""" """),format.raw/*50.137*/("""selected="selected" """)))}),format.raw/*50.158*/(""">"""),_display_(/*50.160*/item/*50.164*/.getName),format.raw/*50.172*/("""</option>
                """)))}),format.raw/*51.18*/("""
            """),format.raw/*52.13*/("""</select>
        </span>
        <span class="prescription-field prescriptionAdministrationDays">
            <input type="number" class="form-control input-sm" readonly />
        </span>
        <span class="prescription-field prescriptionAmount">
            <input type="number" class="form-control input-sm" value='"""),_display_(/*58.72*/script/*58.78*/.getAmount),format.raw/*58.88*/("""' readonly />
        </span>
    </div>
""")))}))
      }
    }
  }

  def render(medicationAdministrationItems:List[femr.common.models.MedicationAdministrationItem],index:Integer,script:femr.common.models.PrescriptionItem): play.twirl.api.HtmlFormat.Appendable = apply(medicationAdministrationItems,index,script)

  def f:((List[femr.common.models.MedicationAdministrationItem],Integer,femr.common.models.PrescriptionItem) => play.twirl.api.HtmlFormat.Appendable) = (medicationAdministrationItems,index,script) => apply(medicationAdministrationItems,index,script)

  def ref: this.type = this

}


}

/**/
object prescriptionRow extends prescriptionRow_Scope0.prescriptionRow
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:21 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/medical/tabs/prescriptionRow.scala.html
                  HASH: c398334201f150155dddcfd282376993c009845f
                  MATRIX: 886->1|1197->159|1227->225|1255->228|1283->248|1322->250|1351->346|1382->450|1417->458|1570->584|1596->589|1771->737|1797->742|1990->980|2032->994|2128->1063|2154->1068|2276->1163|2334->1205|2374->1207|2424->1229|2467->1245|2480->1249|2507->1255|2552->1273|2565->1277|2603->1294|2633->1297|2646->1301|2676->1309|2735->1337|2777->1351|3092->1639|3118->1644|3225->1733|3237->1737|3275->1738|3306->1850|3339->1856|3479->1969|3494->1975|3531->1991|3724->2157|3739->2163|3768->2171|3798->2172|3828->2174|3880->2216|3920->2234|4205->2492|4263->2534|4303->2536|4353->2558|4396->2574|4409->2578|4436->2584|4481->2602|4494->2606|4532->2623|4562->2626|4618->2672|4658->2673|4688->2674|4741->2695|4771->2697|4785->2701|4815->2709|4874->2737|4916->2751|5271->3079|5286->3085|5317->3095
                  LINES: 27->1|35->4|37->7|38->8|38->8|38->8|39->9|40->10|42->12|44->14|44->14|47->17|47->17|50->20|51->21|51->21|51->21|53->23|53->23|53->23|54->24|54->24|54->24|54->24|54->24|54->24|54->24|54->24|54->24|54->24|55->25|56->26|62->32|62->32|66->36|66->36|66->36|67->37|68->38|70->40|70->40|70->40|73->43|73->43|73->43|73->43|73->43|73->43|73->43|79->49|79->49|79->49|80->50|80->50|80->50|80->50|80->50|80->50|80->50|80->50|80->50|80->50|80->50|80->50|80->50|80->50|80->50|81->51|82->52|88->58|88->58|88->58
                  -- GENERATED --
              */
          