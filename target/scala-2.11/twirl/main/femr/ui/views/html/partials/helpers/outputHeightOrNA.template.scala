
package femr.ui.views.html.partials.helpers

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object outputHeightOrNA_Scope0 {
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

class outputHeightOrNA extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[java.lang.String,java.lang.String,java.lang.Boolean,java.lang.String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(feet: java.lang.String, inches: java.lang.String, isMetric: java.lang.Boolean = false, emptyValue: java.lang.String = "N/A"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.127*/("""


    """),_display_(/*4.6*/if(isMetric)/*4.18*/ {_display_(Seq[Any](format.raw/*4.20*/("""
        """),_display_(/*5.10*/if(feet == null || inches == null || feet.equals("null") || inches.equals("null"))/*5.92*/ {_display_(Seq[Any](format.raw/*5.94*/("""
            """),_display_(/*6.14*/emptyValue),format.raw/*6.24*/("""
        """)))}/*7.11*/else/*7.16*/{_display_(Seq[Any](format.raw/*7.17*/("""
            """),format.raw/*9.66*/("""
            """),_display_(/*10.14*/("%s.%2sm".format(feet, inches).replace(' ', '0'))),format.raw/*10.64*/("""
        """)))}),format.raw/*11.10*/("""
    """)))}/*12.7*/else/*12.12*/{_display_(Seq[Any](format.raw/*12.13*/("""
        """),_display_(/*13.10*/if(feet != null && !feet.equals("null"))/*13.50*/ {_display_(Seq[Any](format.raw/*13.52*/("""
            """),format.raw/*14.67*/("""
            """),_display_(/*15.14*/feet/*15.18*/.replaceAll("\\..*", "")),format.raw/*15.42*/("""'
        """)))}),format.raw/*16.10*/("""
        """),_display_(/*17.10*/if(inches != null && !inches.equals("null"))/*17.54*/ {_display_(Seq[Any](format.raw/*17.56*/("""
            """),format.raw/*18.71*/("""
            """),_display_(/*19.14*/inches/*19.20*/.replaceAll("\\..*", "")),format.raw/*19.44*/(""""
        """)))}),format.raw/*20.10*/("""

        """),format.raw/*22.79*/("""
        """),_display_(/*23.10*/if((inches != null && feet != null) && (inches.equals("null") && feet.equals("null")))/*23.96*/ {_display_(Seq[Any](format.raw/*23.98*/("""
            """),_display_(/*24.14*/emptyValue),format.raw/*24.24*/("""
        """)))}),format.raw/*25.10*/("""
    """)))}),format.raw/*26.6*/("""

"""))
      }
    }
  }

  def render(feet:java.lang.String,inches:java.lang.String,isMetric:java.lang.Boolean,emptyValue:java.lang.String): play.twirl.api.HtmlFormat.Appendable = apply(feet,inches,isMetric,emptyValue)

  def f:((java.lang.String,java.lang.String,java.lang.Boolean,java.lang.String) => play.twirl.api.HtmlFormat.Appendable) = (feet,inches,isMetric,emptyValue) => apply(feet,inches,isMetric,emptyValue)

  def ref: this.type = this

}


}

/**/
object outputHeightOrNA extends outputHeightOrNA_Scope0.outputHeightOrNA
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:18 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/helpers/outputHeightOrNA.scala.html
                  HASH: 055806b8f470e77227e62a1c8cc813751e50c43b
                  MATRIX: 854->1|1075->126|1111->137|1131->149|1170->151|1207->162|1297->244|1336->246|1377->261|1407->271|1436->283|1448->288|1486->289|1527->434|1569->449|1640->499|1682->510|1707->518|1720->523|1759->524|1797->535|1846->575|1886->577|1928->645|1970->660|1983->664|2028->688|2071->700|2109->711|2162->755|2202->757|2244->829|2286->844|2301->850|2346->874|2389->886|2429->968|2467->979|2562->1065|2602->1067|2644->1082|2675->1092|2717->1103|2754->1110
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|38->7|38->7|38->7|39->9|40->10|40->10|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|45->15|45->15|45->15|46->16|47->17|47->17|47->17|48->18|49->19|49->19|49->19|50->20|52->22|53->23|53->23|53->23|54->24|54->24|55->25|56->26
                  -- GENERATED --
              */
          