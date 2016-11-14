
package femr.ui.views.html.partials.helpers

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object outputIntOrNA_Scope0 {
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

class outputIntOrNA extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.lang.Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(number: java.lang.Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""

"""),_display_(/*3.2*/if(number == null)/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""
    """),format.raw/*4.5*/("""N/A
""")))}/*5.2*/else/*5.6*/{_display_(Seq[Any](format.raw/*5.7*/("""
    """),_display_(/*6.6*/number),format.raw/*6.12*/("""
""")))}))
      }
    }
  }

  def render(number:java.lang.Integer): play.twirl.api.HtmlFormat.Appendable = apply(number)

  def f:((java.lang.Integer) => play.twirl.api.HtmlFormat.Appendable) = (number) => apply(number)

  def ref: this.type = this

}


}

/**/
object outputIntOrNA extends outputIntOrNA_Scope0.outputIntOrNA
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:21 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/helpers/outputIntOrNA.scala.html
                  HASH: 5968900c81cf183ff38a10c47654af9c6208969c
                  MATRIX: 797->1|919->28|949->33|975->51|1013->52|1045->58|1068->64|1079->68|1116->69|1148->76|1174->82
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|37->6
                  -- GENERATED --
              */
          