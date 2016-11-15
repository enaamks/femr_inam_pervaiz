
package femr.ui.views.html.partials.medical.tabs

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object treatmentTab_Scope0 {
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

class treatmentTab extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[femr.common.models.TabItem,List[femr.common.models.PrescriptionItem],List[femr.common.models.MedicationAdministrationItem],List[femr.common.models.ProblemItem],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(treatmentTab: femr.common.models.TabItem, prescriptions: List[femr.common.models.PrescriptionItem], medicationAdministrationItems: List[femr.common.models.MedicationAdministrationItem], problems: List[femr.common.models.ProblemItem]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.partials.medical.tabs.prescriptionRow

Seq[Any](format.raw/*1.236*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<div class="controlWrap hidden" id="treatmentControl">
    <div class="form-group">
        <label for="assessment">Assessment</label>
        """),_display_(/*8.10*/defining(treatmentTab.getTabFieldItemByName(null, "assessment"))/*8.74*/ { assessment =>_display_(Seq[Any](format.raw/*8.90*/("""
            """),format.raw/*9.13*/("""<input name="tabFieldItems["""),_display_(/*9.41*/assessment/*9.51*/.getIndex),format.raw/*9.60*/("""].name" type="text" class="hidden" value="assessment"/>
            <textarea rows="3" name="tabFieldItems["""),_display_(/*10.53*/assessment/*10.63*/.getIndex),format.raw/*10.72*/("""].value" class="form-control input-sm">"""),_display_(/*10.112*/assessment/*10.122*/.getValue),format.raw/*10.131*/("""</textarea>
        """)))}),format.raw/*11.10*/("""
        """),format.raw/*12.9*/("""</div>

    <div class="form-group">
        <label for="problem">Diagnosis</label>
        <div class="row">
            <div class="col-xs-10 col-sm-10 col-md-10 problemWrap">
                """),_display_(/*18.18*/for(problem <- problems) yield /*18.42*/ {_display_(Seq[Any](format.raw/*18.44*/("""
                    """),format.raw/*19.21*/("""<div class="problem">
                        <input type="text" class="form-control input-sm oldProblems" value=""""),_display_(/*20.94*/problem/*20.101*/.getName),format.raw/*20.109*/("""" readonly/>
                    </div>
                """)))}),format.raw/*22.18*/("""
                """),format.raw/*23.17*/("""<div class="problem">
                    <input name="problems[0].name" type="text" class="form-control input-sm newProblems"/>
                </div>
            </div>
            <div class="col-xs-2 col-sm-2 col-md-2">
                <div class="row">
                    <button id="addProblemButton" class="btn addSubtractBtn" type="button"><span class="glyphicon glyphicon-plus"></span></button>
                </div>
                <div class="row">
                    <button id="subtractProblemButton" class="btn addSubtractBtn" type="button"><span class="glyphicon glyphicon-minus"></span></button>
                </div>
            </div>
        </div>
    </div>
    <div class="form-group">
        <div class="row">
            <div class="col-xs-10 col-sm-10 col-md-10 prescriptionWrap">
                <div class="prescription-grid prescriptionHeader">
                    <label class="prescription-field prescriptionName" for="prescription">Prescriptions</label>
                    <label class="prescription-field prescriptionAdministration">Administration</label>
                    <label class="prescription-field prescriptionAdministrationDays">Days</label>
                    <label class="prescription-field prescriptionAmount">Amount</label>
                </div>

                """),_display_(/*47.18*/for(script <- prescriptions) yield /*47.46*/ {_display_(Seq[Any](format.raw/*47.48*/("""

                    """),_display_(/*49.22*/prescriptionRow( medicationAdministrationItems, 0, script )),format.raw/*49.81*/("""
                """)))}),format.raw/*50.18*/("""

                """),format.raw/*52.17*/("""<div class="newPrescriptionsContainer">
                """),_display_(/*53.18*/prescriptionRow( medicationAdministrationItems, 0, null )),format.raw/*53.75*/("""
                """),format.raw/*54.17*/("""</div>

            </div>
            <div class="col-xs-2 col-sm-2 col-md-2">
                <div class="row">
                    <button id="addPrescriptionButton" class="btn addSubtractBtn" type="button"><span class="glyphicon glyphicon-plus"></span></button>
                </div>
                <div class="row">
                    <button id="subtractPrescriptionButton" class="btn addSubtractBtn" type="button"><span class="glyphicon glyphicon-minus"></span></button>
                </div>
            </div>
        </div>
    </div>
    <div class="form-group">
        <label for="treatment">Treatment Given</label>
        """),_display_(/*69.10*/defining(treatmentTab.getTabFieldItemByName(null, "treatment"))/*69.73*/ { treatment =>_display_(Seq[Any](format.raw/*69.88*/("""
            """),format.raw/*70.13*/("""<input name="tabFieldItems["""),_display_(/*70.41*/treatment/*70.50*/.getIndex),format.raw/*70.59*/("""].name" type="text" class="hidden" value="treatment"/>
            <textarea rows="3" name="tabFieldItems["""),_display_(/*71.53*/treatment/*71.62*/.getIndex),format.raw/*71.71*/("""].value" class="form-control input-sm" placeholder="Ex: Suturing, Ultrasound, Splint, etc...">"""),_display_(/*71.166*/treatment/*71.175*/.getValue),format.raw/*71.184*/("""</textarea>
        """)))}),format.raw/*72.10*/("""
    """),format.raw/*73.5*/("""</div>
</div>"""))
      }
    }
  }

  def render(treatmentTab:femr.common.models.TabItem,prescriptions:List[femr.common.models.PrescriptionItem],medicationAdministrationItems:List[femr.common.models.MedicationAdministrationItem],problems:List[femr.common.models.ProblemItem]): play.twirl.api.HtmlFormat.Appendable = apply(treatmentTab,prescriptions,medicationAdministrationItems,problems)

  def f:((femr.common.models.TabItem,List[femr.common.models.PrescriptionItem],List[femr.common.models.MedicationAdministrationItem],List[femr.common.models.ProblemItem]) => play.twirl.api.HtmlFormat.Appendable) = (treatmentTab,prescriptions,medicationAdministrationItems,problems) => apply(treatmentTab,prescriptions,medicationAdministrationItems,problems)

  def ref: this.type = this

}


}

/**/
object treatmentTab extends treatmentTab_Scope0.treatmentTab
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/medical/tabs/treatmentTab.scala.html
                  HASH: 9143449ae8a2cadc516e1594dc8bf86aa921bcb2
                  MATRIX: 942->1|1335->235|1365->305|1393->307|1566->454|1638->518|1691->534|1732->548|1786->576|1804->586|1833->595|1969->704|1988->714|2018->723|2086->763|2106->773|2137->782|2190->804|2227->814|2455->1015|2495->1039|2535->1041|2585->1063|2728->1179|2745->1186|2775->1194|2865->1253|2911->1271|4283->2616|4327->2644|4367->2646|4419->2671|4499->2730|4549->2749|4597->2769|4682->2827|4760->2884|4806->2902|5490->3559|5562->3622|5615->3637|5657->3651|5712->3679|5730->3688|5760->3697|5895->3805|5913->3814|5943->3823|6066->3918|6085->3927|6116->3936|6169->3958|6202->3964
                  LINES: 27->1|32->1|34->4|35->5|38->8|38->8|38->8|39->9|39->9|39->9|39->9|40->10|40->10|40->10|40->10|40->10|40->10|41->11|42->12|48->18|48->18|48->18|49->19|50->20|50->20|50->20|52->22|53->23|77->47|77->47|77->47|79->49|79->49|80->50|82->52|83->53|83->53|84->54|99->69|99->69|99->69|100->70|100->70|100->70|100->70|101->71|101->71|101->71|101->71|101->71|101->71|102->72|103->73
                  -- GENERATED --
              */
          