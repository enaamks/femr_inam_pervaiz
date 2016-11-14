
package femr.ui.views.html.partials.helpers

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object outputWeightOrNA_Scope0 {
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

class outputWeightOrNA extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[java.lang.String,java.lang.Boolean,java.lang.String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(weight: java.lang.String, isMetric: java.lang.Boolean = false, emptyValue: java.lang.String = "N/A"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.103*/("""


"""),_display_(/*4.2*/if(weight == null || weight.equals("null"))/*4.45*/{_display_(Seq[Any](format.raw/*4.46*/("""
    """),_display_(/*5.6*/emptyValue),format.raw/*5.16*/("""
""")))}/*6.2*/else/*6.6*/{_display_(Seq[Any](format.raw/*6.7*/("""
    """),_display_(/*7.6*/if(isMetric)/*7.18*/ {_display_(Seq[Any](format.raw/*7.20*/("""
        """),_display_(/*8.10*/weight/*8.16*/.replaceAll("\\..*", "")),format.raw/*8.40*/("""kg
    """)))}/*9.7*/else/*9.12*/{_display_(Seq[Any](format.raw/*9.13*/("""
        """),format.raw/*10.74*/("""
        """),_display_(/*11.10*/weight/*11.16*/.replaceAll("\\..*", "")),format.raw/*11.40*/("""lbs
    """)))}),format.raw/*12.6*/("""
""")))}))
      }
    }
  }

  def render(weight:java.lang.String,isMetric:java.lang.Boolean,emptyValue:java.lang.String): play.twirl.api.HtmlFormat.Appendable = apply(weight,isMetric,emptyValue)

  def f:((java.lang.String,java.lang.Boolean,java.lang.String) => play.twirl.api.HtmlFormat.Appendable) = (weight,isMetric,emptyValue) => apply(weight,isMetric,emptyValue)

  def ref: this.type = this

}


}

/**/
object outputWeightOrNA extends outputWeightOrNA_Scope0.outputWeightOrNA
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:21 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/helpers/outputWeightOrNA.scala.html
                  HASH: d09f3ef1733f36bf9d0b5e30f0d06f50af6d4910
                  MATRIX: 837->1|1034->102|1066->109|1117->152|1155->153|1187->160|1217->170|1237->173|1248->177|1285->178|1317->185|1337->197|1376->199|1413->210|1427->216|1471->240|1497->250|1509->255|1547->256|1585->331|1623->342|1638->348|1683->372|1723->382
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12
                  -- GENERATED --
              */
          