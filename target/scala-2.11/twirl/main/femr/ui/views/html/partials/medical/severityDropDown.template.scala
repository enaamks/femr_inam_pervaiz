
package femr.ui.views.html.partials.medical

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object severityDropDown_Scope0 {
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

class severityDropDown extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,femr.common.models.TabFieldItem,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(chiefComplaint: String, severity: femr.common.models.TabFieldItem):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""

"""),format.raw/*3.1*/("""<label for="severity">Severity</label>
<input name="tabFieldItems["""),_display_(/*4.29*/severity/*4.37*/.getIndex),format.raw/*4.46*/("""].name" type="text" class="hidden" value="severity"/>
<input name="tabFieldItems["""),_display_(/*5.29*/severity/*5.37*/.getIndex),format.raw/*5.46*/("""].chiefComplaint" type="text" class="hidden" value=""""),_display_(/*5.99*/chiefComplaint),format.raw/*5.113*/(""""/>
<select name="tabFieldItems["""),_display_(/*6.30*/severity/*6.38*/.getIndex),format.raw/*6.47*/("""].value" id="severityDropDown">
    <option></option>
    """),_display_(/*8.6*/for(x <- 1 to 10) yield /*8.23*/ {_display_(Seq[Any](format.raw/*8.25*/("""
        """),_display_(/*9.10*/if(severity.getValue != null && !severity.getValue.isEmpty)/*9.69*/ {_display_(Seq[Any](format.raw/*9.71*/("""
            """),_display_(/*10.14*/if(severity.getValue.equals(x.toString))/*10.54*/ {_display_(Seq[Any](format.raw/*10.56*/("""
                """),format.raw/*11.17*/("""<option value=""""),_display_(/*11.33*/x),format.raw/*11.34*/("""" selected="selected">"""),_display_(/*11.57*/x),format.raw/*11.58*/("""</option>
            """)))}/*12.15*/else/*12.20*/{_display_(Seq[Any](format.raw/*12.21*/("""
                """),format.raw/*13.17*/("""<option value=""""),_display_(/*13.33*/x),format.raw/*13.34*/("""">"""),_display_(/*13.37*/x),format.raw/*13.38*/("""</option>
            """)))}),format.raw/*14.14*/("""

        """)))}/*16.11*/else/*16.16*/{_display_(Seq[Any](format.raw/*16.17*/("""
            """),format.raw/*17.13*/("""<option value=""""),_display_(/*17.29*/x),format.raw/*17.30*/("""">"""),_display_(/*17.33*/x),format.raw/*17.34*/("""</option>
        """)))}),format.raw/*18.10*/("""
    """)))}),format.raw/*19.6*/("""
"""),format.raw/*20.1*/("""</select>

"""))
      }
    }
  }

  def render(chiefComplaint:String,severity:femr.common.models.TabFieldItem): play.twirl.api.HtmlFormat.Appendable = apply(chiefComplaint,severity)

  def f:((String,femr.common.models.TabFieldItem) => play.twirl.api.HtmlFormat.Appendable) = (chiefComplaint,severity) => apply(chiefComplaint,severity)

  def ref: this.type = this

}


}

/**/
object severityDropDown extends severityDropDown_Scope0.severityDropDown
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/medical/severityDropDown.scala.html
                  HASH: 92e43cdff59452d99a7db583b91875dba89544d4
                  MATRIX: 824->1|986->68|1016->72|1110->140|1126->148|1155->157|1264->240|1280->248|1309->257|1388->310|1423->324|1483->358|1499->366|1528->375|1614->436|1646->453|1685->455|1722->466|1789->525|1828->527|1870->542|1919->582|1959->584|2005->602|2048->618|2070->619|2120->642|2142->643|2185->668|2198->673|2237->674|2283->692|2326->708|2348->709|2378->712|2400->713|2455->737|2487->751|2500->756|2539->757|2581->771|2624->787|2646->788|2676->791|2698->792|2749->812|2786->819|2815->821
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|37->6|37->6|37->6|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|45->14|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|49->18|50->19|51->20
                  -- GENERATED --
              */
          