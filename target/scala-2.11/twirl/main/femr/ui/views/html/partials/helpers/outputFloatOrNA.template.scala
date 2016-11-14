
package femr.ui.views.html.partials.helpers

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object outputFloatOrNA_Scope0 {
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

class outputFloatOrNA extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.lang.Float,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(number: java.lang.Float):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""


"""),_display_(/*4.2*/if(number == null)/*4.20*/{_display_(Seq[Any](format.raw/*4.21*/("""
    """),format.raw/*5.5*/("""N/A
""")))}/*6.2*/else/*6.6*/{_display_(Seq[Any](format.raw/*6.7*/("""
    """),_display_(/*7.6*/number),format.raw/*7.12*/("""
""")))}))
      }
    }
  }

  def render(number:java.lang.Float): play.twirl.api.HtmlFormat.Appendable = apply(number)

  def f:((java.lang.Float) => play.twirl.api.HtmlFormat.Appendable) = (number) => apply(number)

  def ref: this.type = this

}


}

/**/
object outputFloatOrNA extends outputFloatOrNA_Scope0.outputFloatOrNA
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:21 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/helpers/outputFloatOrNA.scala.html
                  HASH: 55f62a20821ba8fead2ea403441b3f5c24e676dc
                  MATRIX: 799->1|919->26|951->33|977->51|1015->52|1047->58|1070->64|1081->68|1118->69|1150->76|1176->82
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|37->6|37->6|37->6|38->7|38->7
                  -- GENERATED --
              */
          