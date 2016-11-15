
package femr.ui.views.html.partials.helpers

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object outputBloodPressureOrNA_Scope0 {
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

class outputBloodPressureOrNA extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[java.lang.String,java.lang.String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(systolic: java.lang.String, diastolic: java.lang.String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""

"""),_display_(/*3.2*/if(systolic == null && diastolic == null)/*3.43*/ {_display_(Seq[Any](format.raw/*3.45*/("""
    """),format.raw/*4.5*/("""N/A
""")))}/*5.3*/else/*5.8*/{_display_(Seq[Any](format.raw/*5.9*/("""
    """),_display_(/*6.6*/systolic),format.raw/*6.14*/(""" """),format.raw/*6.15*/("""/ """),_display_(/*6.18*/diastolic),format.raw/*6.27*/("""

""")))}),format.raw/*8.2*/("""
"""))
      }
    }
  }

  def render(systolic:java.lang.String,diastolic:java.lang.String): play.twirl.api.HtmlFormat.Appendable = apply(systolic,diastolic)

  def f:((java.lang.String,java.lang.String) => play.twirl.api.HtmlFormat.Appendable) = (systolic,diastolic) => apply(systolic,diastolic)

  def ref: this.type = this

}


}

/**/
object outputBloodPressureOrNA extends outputBloodPressureOrNA_Scope0.outputBloodPressureOrNA
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:18 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/helpers/outputBloodPressureOrNA.scala.html
                  HASH: ac65440e1a113828478131732285f99d141a017b
                  MATRIX: 833->1|985->58|1015->63|1064->104|1103->106|1135->112|1158->119|1169->124|1206->125|1238->132|1266->140|1294->141|1323->144|1352->153|1386->158
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|37->6|37->6|37->6|37->6|39->8
                  -- GENERATED --
              */
          