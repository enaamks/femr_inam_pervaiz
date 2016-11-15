
package femr.ui.views.html.partials.helpers

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object outputStringOrNA_Scope0 {
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

class outputStringOrNA extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.lang.String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(text: java.lang.String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.util.stringhelpers.StringUtils

Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/if(StringUtils.isNullOrWhiteSpace(text))/*5.42*/{_display_(Seq[Any](format.raw/*5.43*/("""
    """),format.raw/*6.5*/("""N/A
""")))}/*7.2*/else/*7.6*/{_display_(Seq[Any](format.raw/*7.7*/("""
    """),_display_(/*8.6*/text),format.raw/*8.10*/("""
""")))}),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(text:java.lang.String): play.twirl.api.HtmlFormat.Appendable = apply(text)

  def f:((java.lang.String) => play.twirl.api.HtmlFormat.Appendable) = (text) => apply(text)

  def ref: this.type = this

}


}

/**/
object outputStringOrNA extends outputStringOrNA_Scope0.outputStringOrNA
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/helpers/outputStringOrNA.scala.html
                  HASH: f4eb528b510c95fe6123a70aa465d6b594eabb89
                  MATRIX: 802->1|963->25|993->74|1021->77|1069->117|1107->118|1139->124|1162->130|1173->134|1210->135|1242->142|1266->146|1298->149
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|37->7|37->7|37->7|38->8|38->8|39->9
                  -- GENERATED --
              */
          