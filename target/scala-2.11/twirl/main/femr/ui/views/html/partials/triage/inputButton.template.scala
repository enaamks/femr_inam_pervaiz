
package femr.ui.views.html.partials.triage

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object inputButton_Scope0 {
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

class inputButton extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,String,String,Boolean,Boolean,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, forInput: String, id: String, emptyModel: Boolean, active: Boolean, value: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.4*/inputBlock/*3.14*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.18*/("""
  """),_display_(/*4.4*/if(Boolean2boolean(emptyModel))/*4.35*/ {_display_(Seq[Any](format.raw/*4.37*/("""
    """),format.raw/*5.5*/("""<label class="btn btn-default width-50">
      <input type="radio" name=""""),_display_(/*6.34*/forInput),format.raw/*6.42*/("""" id=""""),_display_(/*6.49*/id),format.raw/*6.51*/("""" value=""""),_display_(/*6.61*/value),format.raw/*6.66*/("""">
      """),_display_(/*7.8*/name),format.raw/*7.12*/("""
    """),format.raw/*8.5*/("""</label>
  """)))}/*9.5*/else/*9.10*/{_display_(Seq[Any](format.raw/*9.11*/("""
    """),_display_(/*10.6*/if(Boolean2boolean(active))/*10.33*/ {_display_(Seq[Any](format.raw/*10.35*/("""
      """),format.raw/*11.7*/("""<label class="btn btn-primary active disabled  width-50">
        <input type="radio" name=""""),_display_(/*12.36*/forInput),format.raw/*12.44*/("""" id=""""),_display_(/*12.51*/id),format.raw/*12.53*/("""" value=""""),_display_(/*12.63*/value),format.raw/*12.68*/("""">
        """),_display_(/*13.10*/name),format.raw/*13.14*/("""
      """),format.raw/*14.7*/("""</label>
    """)))}/*15.7*/else/*15.12*/{_display_(Seq[Any](format.raw/*15.13*/("""
      """),format.raw/*16.7*/("""<label class="btn btn-default disabled  width-50">
        <input type="radio" name=""""),_display_(/*17.36*/forInput),format.raw/*17.44*/("""" id=""""),_display_(/*17.51*/id),format.raw/*17.53*/("""" value=""""),_display_(/*17.63*/value),format.raw/*17.68*/("""">
        """),_display_(/*18.10*/name),format.raw/*18.14*/("""
      """),format.raw/*19.7*/("""</label>
    """)))}),format.raw/*20.6*/("""
  """)))}),format.raw/*21.4*/("""
  """)))};
Seq[Any](format.raw/*1.99*/("""

  """),format.raw/*22.4*/("""
"""),_display_(/*23.2*/inputBlock),format.raw/*23.12*/("""
"""))
      }
    }
  }

  def render(name:String,forInput:String,id:String,emptyModel:Boolean,active:Boolean,value:String): play.twirl.api.HtmlFormat.Appendable = apply(name,forInput,id,emptyModel,active,value)

  def f:((String,String,String,Boolean,Boolean,String) => play.twirl.api.HtmlFormat.Appendable) = (name,forInput,id,emptyModel,active,value) => apply(name,forInput,id,emptyModel,active,value)

  def ref: this.type = this

}


}

/**/
object inputButton extends inputButton_Scope0.inputButton
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/triage/inputButton.scala.html
                  HASH: c3bbeebd926d35446030eee942e35397c7e0b3ba
                  MATRIX: 818->1|993->105|1011->115|1091->119|1121->124|1160->155|1199->157|1231->163|1332->238|1360->246|1393->253|1415->255|1451->265|1476->270|1512->281|1536->285|1568->291|1598->305|1610->310|1648->311|1681->318|1717->345|1757->347|1792->355|1913->449|1942->457|1976->464|1999->466|2036->476|2062->481|2102->494|2127->498|2162->506|2195->522|2208->527|2247->528|2282->536|2396->623|2425->631|2459->638|2482->640|2519->650|2545->655|2585->668|2610->672|2645->680|2690->695|2725->700|2769->98|2802->705|2831->708|2862->718
                  LINES: 27->1|31->3|31->3|33->3|34->4|34->4|34->4|35->5|36->6|36->6|36->6|36->6|36->6|36->6|37->7|37->7|38->8|39->9|39->9|39->9|40->10|40->10|40->10|41->11|42->12|42->12|42->12|42->12|42->12|42->12|43->13|43->13|44->14|45->15|45->15|45->15|46->16|47->17|47->17|47->17|47->17|47->17|47->17|48->18|48->18|49->19|50->20|51->21|53->1|55->22|56->23|56->23
                  -- GENERATED --
              */
          