
package femr.ui.views.html.partials.encounter

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object outputPrescriptionOrProblem_Scope0 {
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

class outputPrescriptionOrProblem extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Integer,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(number: Integer, value: String, name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""

"""),format.raw/*3.73*/("""

"""),_display_(/*5.2*/if(number == 1)/*5.17*/ {_display_(Seq[Any](format.raw/*5.19*/("""
    """),_display_(/*6.6*/if(value != null && !value.isEmpty)/*6.41*/ {_display_(Seq[Any](format.raw/*6.43*/("""
        """),format.raw/*7.9*/("""<input id = """"),_display_(/*7.23*/name),_display_(/*7.28*/number),format.raw/*7.34*/("""" type="text" class="form-control input-sm """),_display_(/*7.78*/name),format.raw/*7.82*/("""" value=""""),_display_(/*7.92*/value),format.raw/*7.97*/("""" readonly/>
    """)))}),format.raw/*8.6*/("""
""")))}/*9.3*/else/*9.8*/{_display_(Seq[Any](format.raw/*9.9*/("""
    """),_display_(/*10.6*/if(value != null && !value.isEmpty)/*10.41*/ {_display_(Seq[Any](format.raw/*10.43*/("""
        """),format.raw/*11.9*/("""<input id = """"),_display_(/*11.23*/name),_display_(/*11.28*/number),format.raw/*11.34*/("""" type="text" class="form-control input-sm """),_display_(/*11.78*/name),format.raw/*11.82*/("""" value=""""),_display_(/*11.92*/value),format.raw/*11.97*/("""" readonly/>
    """)))}),format.raw/*12.6*/("""
""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(number:Integer,value:String,name:String): play.twirl.api.HtmlFormat.Appendable = apply(number,value,name)

  def f:((Integer,String,String) => play.twirl.api.HtmlFormat.Appendable) = (number,value,name) => apply(number,value,name)

  def ref: this.type = this

}


}

/**/
object outputPrescriptionOrProblem extends outputPrescriptionOrProblem_Scope0.outputPrescriptionOrProblem
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:21 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/encounter/outputPrescriptionOrProblem.scala.html
                  HASH: 6634f4b8854d1a1c961c2cb85cc4ccd3cdbbed67
                  MATRIX: 831->1|972->47|1003->123|1033->128|1056->143|1095->145|1127->152|1170->187|1209->189|1245->199|1285->213|1309->218|1335->224|1405->268|1429->272|1465->282|1490->287|1538->306|1558->310|1569->315|1606->316|1639->323|1683->358|1723->360|1760->370|1801->384|1826->389|1853->395|1924->439|1949->443|1986->453|2012->458|2061->477|2094->480
                  LINES: 27->1|32->1|34->3|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|42->11|42->11|43->12|44->13
                  -- GENERATED --
              */
          