
package femr.ui.views.html.partials.triage

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object inputAge_Scope0 {
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

class inputAge extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,String,String,String,String,femr.common.models.PatientItem,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(label: String, field1: String, forInput1: String, field2: String, forInput2: String, value: femr.common.models.PatientItem):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*2.6*/inputBlock/*2.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.20*/("""
        """),format.raw/*3.9*/("""<div class="generalInfoInput">
            <label for=""""),_display_(/*4.26*/label),format.raw/*4.31*/("""">Years</label>
            """),_display_(/*5.14*/if(value.getAge == null)/*5.38*/ {_display_(Seq[Any](format.raw/*5.40*/("""
                """),format.raw/*6.17*/("""<input type="text" class="age-input fInput" id=""""),_display_(/*6.66*/forInput1),format.raw/*6.75*/("""" name=""""),_display_(/*6.84*/forInput1),format.raw/*6.93*/("""" placeholder=""""),_display_(/*6.109*/field1),format.raw/*6.115*/("""">
                <input type="text" class="age-input fInput" id=""""),_display_(/*7.66*/forInput2),format.raw/*7.75*/("""" name=""""),_display_(/*7.84*/forInput2),format.raw/*7.93*/("""" placeholder=""""),_display_(/*7.109*/field2),format.raw/*7.115*/("""">
            """)))}/*8.15*/else/*8.20*/{_display_(Seq[Any](format.raw/*8.21*/("""
                """),format.raw/*9.17*/("""<input type="text" class="fInput" id="readOnlyAge" name="readOnlyAge" value=""""),_display_(/*9.95*/value/*9.100*/.getAge),format.raw/*9.107*/("""" readonly/>
                <input type="text" class="hidden" id=""""),_display_(/*10.56*/forInput1),format.raw/*10.65*/("""" value=""""),_display_(/*10.75*/value/*10.80*/.getYearsOld),format.raw/*10.92*/(""""/>
                <input type="text" class="hidden" id=""""),_display_(/*11.56*/forInput2),format.raw/*11.65*/("""" value=""""),_display_(/*11.75*/value/*11.80*/.getMonthsOld),format.raw/*11.93*/(""""/>
            """)))}),format.raw/*12.14*/("""
        """),format.raw/*13.9*/("""</div>
    """)))};
Seq[Any](format.raw/*1.126*/("""
    """),format.raw/*14.6*/("""
"""),_display_(/*15.2*/inputBlock),format.raw/*15.12*/("""
"""))
      }
    }
  }

  def render(label:String,field1:String,forInput1:String,field2:String,forInput2:String,value:femr.common.models.PatientItem): play.twirl.api.HtmlFormat.Appendable = apply(label,field1,forInput1,field2,forInput2,value)

  def f:((String,String,String,String,String,femr.common.models.PatientItem) => play.twirl.api.HtmlFormat.Appendable) = (label,field1,forInput1,field2,forInput2,value) => apply(label,field1,forInput1,field2,forInput2,value)

  def ref: this.type = this

}


}

/**/
object inputAge extends inputAge_Scope0.inputAge
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/triage/inputAge.scala.html
                  HASH: e4ef54951d407e1dceb2522230913377280cd57e
                  MATRIX: 834->1|1036->132|1054->142|1134->146|1170->156|1253->213|1278->218|1334->248|1366->272|1405->274|1450->292|1525->341|1554->350|1589->359|1618->368|1661->384|1688->390|1783->459|1812->468|1847->477|1876->486|1919->502|1946->508|1981->526|1993->531|2031->532|2076->550|2180->628|2194->633|2222->640|2318->709|2348->718|2385->728|2399->733|2432->745|2519->805|2549->814|2586->824|2600->829|2634->842|2683->860|2720->870|2773->125|2806->883|2835->886|2866->896
                  LINES: 27->1|31->2|31->2|33->2|34->3|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|44->13|46->1|47->14|48->15|48->15
                  -- GENERATED --
              */
          