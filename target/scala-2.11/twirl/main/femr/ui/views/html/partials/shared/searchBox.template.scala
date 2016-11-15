
package femr.ui.views.html.partials.shared

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object searchBox_Scope0 {
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

class searchBox extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[java.lang.String,java.lang.Integer,java.lang.String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(page: java.lang.String, patientId: java.lang.Integer, message: java.lang.String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.83*/("""

"""),format.raw/*3.1*/("""<div class="searchWrap">
    <h2>"""),_display_(/*4.10*/page),format.raw/*4.14*/(""" """),format.raw/*4.15*/("""Search</h2>
    """),_display_(/*5.6*/if(patientId > 0)/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""

        """),format.raw/*7.9*/("""<label for="id" class="hidden">Patient ID</label>
        <input type="number" class="fButtonSearch" id="id" name="id" value=""""),_display_(/*8.78*/patientId),format.raw/*8.87*/("""" readonly/>


        <p>"""),_display_(/*11.13*/message),format.raw/*11.20*/("""</p>

            <a href="/medical/edit/"""),_display_(/*13.37*/patientId),format.raw/*13.46*/("""" class="fButton fOtherButton fYesButton">Yes</a>
            <a href="/medical" class="fButton fOtherButton fNoButton">No</a>


    """)))}/*17.7*/else/*17.12*/{_display_(Seq[Any](format.raw/*17.13*/("""

        """),format.raw/*19.9*/("""<label for="id" class="hidden">Patient ID</label>
        <input type="number" class="fButtonSearch" id="id" name="id" placeholder="Patient ID">

        <p>"""),_display_(/*22.13*/message),format.raw/*22.20*/("""</p>
        """),format.raw/*23.52*/("""
        """),format.raw/*24.9*/("""<button type="submit" class="idSearch fButton fRedButton fLandingSearchButton">Search</button>
    """)))}),format.raw/*25.6*/("""
"""),format.raw/*26.1*/("""</div>
"""))
      }
    }
  }

  def render(page:java.lang.String,patientId:java.lang.Integer,message:java.lang.String): play.twirl.api.HtmlFormat.Appendable = apply(page,patientId,message)

  def f:((java.lang.String,java.lang.Integer,java.lang.String) => play.twirl.api.HtmlFormat.Appendable) = (page,patientId,message) => apply(page,patientId,message)

  def ref: this.type = this

}


}

/**/
object searchBox extends searchBox_Scope0.searchBox
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/shared/searchBox.scala.html
                  HASH: ad90283fc4cb877cd33dee067c6f42e6d8ee91b9
                  MATRIX: 822->1|998->82|1028->86|1089->121|1113->125|1141->126|1184->144|1209->161|1248->163|1286->175|1440->303|1469->312|1526->342|1554->349|1625->393|1655->402|1811->541|1824->546|1863->547|1902->559|2090->720|2118->727|2160->784|2197->794|2328->895|2357->897
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4|36->5|36->5|36->5|38->7|39->8|39->8|42->11|42->11|44->13|44->13|48->17|48->17|48->17|50->19|53->22|53->22|54->23|55->24|56->25|57->26
                  -- GENERATED --
              */
          