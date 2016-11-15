
package femr.ui.views.html.partials.triage

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object inputDate_Scope0 {
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

class inputDate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Date,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, forInput: String, value: Date):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*2.6*/inputBlock/*2.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.20*/("""
        """),format.raw/*3.9*/("""<div class="generalInfoInput">
            <label for=""""),_display_(/*4.26*/forInput),format.raw/*4.34*/("""">"""),_display_(/*4.37*/name),format.raw/*4.41*/("""</label>

            """),_display_(/*6.14*/if(value == null)/*6.31*/ {_display_(Seq[Any](format.raw/*6.33*/("""
                """),format.raw/*7.17*/("""<input type="date" class="fInput" id=""""),_display_(/*7.56*/forInput),format.raw/*7.64*/("""" name=""""),_display_(/*7.73*/forInput),format.raw/*7.81*/("""" placeholder="yyyy-mm-dd">
            """)))}/*8.15*/else/*8.20*/{_display_(Seq[Any](format.raw/*8.21*/("""
                """),format.raw/*9.17*/("""<input type="date" class="fInput" id="readOnlyBirthDate" name=""""),_display_(/*9.81*/forInput),format.raw/*9.89*/("""" value=""""),_display_(/*9.99*/value/*9.104*/.format("yyyy-MM-dd")),format.raw/*9.125*/("""" readonly/>
            """)))}),format.raw/*10.14*/("""
        """),format.raw/*11.9*/("""</div>
    """)))};
Seq[Any](format.raw/*1.47*/("""
    """),format.raw/*12.6*/("""
"""),_display_(/*13.2*/inputBlock),format.raw/*13.12*/("""
"""))
      }
    }
  }

  def render(name:String,forInput:String,value:Date): play.twirl.api.HtmlFormat.Appendable = apply(name,forInput,value)

  def f:((String,String,Date) => play.twirl.api.HtmlFormat.Appendable) = (name,forInput,value) => apply(name,forInput,value)

  def ref: this.type = this

}


}

/**/
object inputDate extends inputDate_Scope0.inputDate
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/triage/inputDate.scala.html
                  HASH: 8a0b54adb56cefad9e1aee3e181ea25e83d88fc3
                  MATRIX: 789->1|912->53|930->63|1010->67|1046->77|1129->134|1157->142|1186->145|1210->149|1261->174|1286->191|1325->193|1370->211|1435->250|1463->258|1498->267|1526->275|1586->318|1598->323|1636->324|1681->342|1771->406|1799->414|1835->424|1849->429|1891->450|1949->477|1986->487|2038->46|2071->500|2100->503|2131->513
                  LINES: 27->1|31->2|31->2|33->2|34->3|35->4|35->4|35->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|40->9|40->9|40->9|41->10|42->11|44->1|45->12|46->13|46->13
                  -- GENERATED --
              */
          