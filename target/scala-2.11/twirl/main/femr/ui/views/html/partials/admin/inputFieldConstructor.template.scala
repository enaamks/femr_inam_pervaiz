
package femr.ui.views.html.partials.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object inputFieldConstructor_Scope0 {
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

class inputFieldConstructor extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""


"""),format.raw/*4.1*/("""<div class="fieldWrap """),_display_(/*4.24*/if(elements.hasErrors)/*4.46*/ {_display_(Seq[Any](format.raw/*4.48*/("""error""")))}),format.raw/*4.54*/("""">
    <label for=""""),_display_(/*5.18*/elements/*5.26*/.id),format.raw/*5.29*/("""">"""),_display_(/*5.32*/elements/*5.40*/.label),format.raw/*5.46*/("""
        """),_display_(/*6.10*/if(elements.args.get('_isRequired).contains(true))/*6.60*/ {_display_(Seq[Any](format.raw/*6.62*/("""
            """),format.raw/*7.13*/("""<span class="red bold">*</span>
        """)))}),format.raw/*8.10*/("""

    """),format.raw/*10.5*/("""</label>
    <div class="input">
        """),_display_(/*12.10*/elements/*12.18*/.input),format.raw/*12.24*/("""
        """),format.raw/*13.9*/("""<span class="errors">"""),_display_(/*13.31*/elements/*13.39*/.errors.mkString(", ")),format.raw/*13.61*/("""</span>
        <span class="help">"""),_display_(/*14.29*/elements/*14.37*/.infos.mkString(", ")),format.raw/*14.58*/("""</span>
    </div>
</div>
"""))
      }
    }
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}


}

/**/
object inputFieldConstructor extends inputFieldConstructor_Scope0.inputFieldConstructor
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:21 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/admin/inputFieldConstructor.scala.html
                  HASH: 964a40444f692eabacdfaf9fbe706bf203418038
                  MATRIX: 814->1|941->33|973->39|1022->62|1052->84|1091->86|1127->92|1174->113|1190->121|1213->124|1242->127|1258->135|1284->141|1321->152|1379->202|1418->204|1459->218|1531->260|1566->268|1637->312|1654->320|1681->326|1718->336|1767->358|1784->366|1827->388|1891->425|1908->433|1950->454
                  LINES: 27->1|32->1|35->4|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|39->8|41->10|43->12|43->12|43->12|44->13|44->13|44->13|44->13|45->14|45->14|45->14
                  -- GENERATED --
              */
          