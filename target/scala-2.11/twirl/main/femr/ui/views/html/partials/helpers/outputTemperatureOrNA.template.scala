
package femr.ui.views.html.partials.helpers

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object outputTemperatureOrNA_Scope0 {
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

class outputTemperatureOrNA extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[java.lang.String,java.lang.Boolean,java.lang.String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(temp: java.lang.String, isMetric: java.lang.Boolean = false, emptyValue: java.lang.String = "N/A"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.101*/("""


"""),_display_(/*4.2*/if(temp == null)/*4.18*/{_display_(Seq[Any](format.raw/*4.19*/("""
    """),_display_(/*5.6*/emptyValue),format.raw/*5.16*/("""
""")))}/*6.2*/else/*6.6*/{_display_(Seq[Any](format.raw/*6.7*/("""
    """),_display_(/*7.6*/if(isMetric)/*7.18*/ {_display_(Seq[Any](format.raw/*7.20*/("""
        """),format.raw/*8.60*/("""
        """),_display_(/*9.10*/temp/*9.14*/.replaceAll("(\\.\\d).*", "$1")),format.raw/*9.45*/("""&deg;C
    """)))}/*10.7*/else/*10.12*/{_display_(Seq[Any](format.raw/*10.13*/("""
        """),format.raw/*11.60*/("""
        """),_display_(/*12.10*/temp/*12.14*/.replaceAll("(\\.\\d).*", "$1")),format.raw/*12.45*/("""&deg;F
    """)))}),format.raw/*13.6*/("""
""")))}))
      }
    }
  }

  def render(temp:java.lang.String,isMetric:java.lang.Boolean,emptyValue:java.lang.String): play.twirl.api.HtmlFormat.Appendable = apply(temp,isMetric,emptyValue)

  def f:((java.lang.String,java.lang.Boolean,java.lang.String) => play.twirl.api.HtmlFormat.Appendable) = (temp,isMetric,emptyValue) => apply(temp,isMetric,emptyValue)

  def ref: this.type = this

}


}

/**/
object outputTemperatureOrNA extends outputTemperatureOrNA_Scope0.outputTemperatureOrNA
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/helpers/outputTemperatureOrNA.scala.html
                  HASH: adcdcec84655c5b4f8d29d492631d0565a8ea1be
                  MATRIX: 847->1|1042->100|1074->107|1098->123|1136->124|1168->131|1198->141|1218->144|1229->148|1266->149|1298->156|1318->168|1357->170|1394->231|1431->242|1443->246|1494->277|1525->291|1538->296|1577->297|1615->358|1653->369|1666->373|1718->404|1761->417
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|43->12|43->12|43->12|44->13
                  -- GENERATED --
              */
          