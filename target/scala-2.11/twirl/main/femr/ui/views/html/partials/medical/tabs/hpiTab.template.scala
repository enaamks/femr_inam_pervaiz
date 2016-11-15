
package femr.ui.views.html.partials.medical.tabs

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object hpiTab_Scope0 {
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

class hpiTab extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[femr.common.models.TabItem,java.lang.Boolean,List[java.lang.String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(hpiTab: femr.common.models.TabItem, isConsolidated: java.lang.Boolean, chiefComplaints: List[java.lang.String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.partials.medical.tabs.hpi_fields

Seq[Any](format.raw/*1.114*/("""

"""),format.raw/*4.1*/("""

"""),format.raw/*6.1*/("""<div class="controlWrap" id="hpiControl">

    """),_display_(/*8.6*/if(chiefComplaints.size() > 1)/*8.36*/ {_display_(Seq[Any](format.raw/*8.38*/("""
        """),format.raw/*9.90*/("""
        """),format.raw/*10.9*/("""<div id="chiefComplaintSliderWrap">
            """),format.raw/*11.29*/("""
            """),format.raw/*12.13*/("""<div id="chiefComplaintLeftArrow">
                <span> < </span>
            </div>

            """),format.raw/*16.33*/("""
            """),_display_(/*17.14*/for(chiefComplaint <- chiefComplaints) yield /*17.52*/ {_display_(Seq[Any](format.raw/*17.54*/("""
                """),format.raw/*18.17*/("""<div class="chiefComplaintText hidden">
                    <span>"""),_display_(/*19.28*/chiefComplaint),format.raw/*19.42*/("""</span>
                </div>
            """)))}),format.raw/*21.14*/("""

            """),format.raw/*23.30*/("""
            """),format.raw/*24.13*/("""<div id="chiefComplaintRightArrow">
                <span> > </span>
            </div>
        </div>
    """)))}),format.raw/*28.6*/("""
    """),format.raw/*29.52*/("""
    """),_display_(/*30.6*/if(chiefComplaints.size() == 0)/*30.37*/ {_display_(Seq[Any](format.raw/*30.39*/("""
        """),_display_(/*31.10*/hpi_fields(hpiTab, isConsolidated, null)),format.raw/*31.50*/("""
    """)))}/*32.7*/else/*32.12*/{_display_(Seq[Any](format.raw/*32.13*/("""
        """),_display_(/*33.10*/for(chiefComplaint <- chiefComplaints) yield /*33.48*/ {_display_(Seq[Any](format.raw/*33.50*/("""
            """),_display_(/*34.14*/hpi_fields(hpiTab, isConsolidated, chiefComplaint)),format.raw/*34.64*/("""
        """)))}),format.raw/*35.10*/("""
    """)))}),format.raw/*36.6*/("""


"""),format.raw/*39.1*/("""</div>
"""))
      }
    }
  }

  def render(hpiTab:femr.common.models.TabItem,isConsolidated:java.lang.Boolean,chiefComplaints:List[java.lang.String]): play.twirl.api.HtmlFormat.Appendable = apply(hpiTab,isConsolidated,chiefComplaints)

  def f:((femr.common.models.TabItem,java.lang.Boolean,List[java.lang.String]) => play.twirl.api.HtmlFormat.Appendable) = (hpiTab,isConsolidated,chiefComplaints) => apply(hpiTab,isConsolidated,chiefComplaints)

  def ref: this.type = this

}


}

/**/
object hpiTab extends hpiTab_Scope0.hpiTab
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/medical/tabs/hpiTab.scala.html
                  HASH: efa7db2d51057519e0c4079a8b06a312f8ac789a
                  MATRIX: 838->1|1104->113|1134->178|1164->182|1239->232|1277->262|1316->264|1353->355|1390->365|1467->430|1509->444|1641->568|1683->583|1737->621|1777->623|1823->641|1918->709|1953->723|2030->769|2074->802|2116->816|2258->928|2292->981|2325->988|2365->1019|2405->1021|2443->1032|2504->1072|2529->1080|2542->1085|2581->1086|2619->1097|2673->1135|2713->1137|2755->1152|2826->1202|2868->1213|2905->1220|2938->1226
                  LINES: 27->1|32->1|34->4|36->6|38->8|38->8|38->8|39->9|40->10|41->11|42->12|46->16|47->17|47->17|47->17|48->18|49->19|49->19|51->21|53->23|54->24|58->28|59->29|60->30|60->30|60->30|61->31|61->31|62->32|62->32|62->32|63->33|63->33|63->33|64->34|64->34|65->35|66->36|69->39
                  -- GENERATED --
              */
          