
package femr.ui.views.html.home

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[femr.common.dtos.CurrentUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.layouts.main
def /*5.6*/additionalScripts/*5.23*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.27*/("""
        """),format.raw/*6.9*/("""<script type="text/javascript" src=""""),_display_(/*6.46*/routes/*6.52*/.Assets.versioned("js/libraries/handlebars.min.js")),format.raw/*6.103*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*7.46*/routes/*7.52*/.Assets.versioned("js/libraries/typeahead.bundle.min.js")),format.raw/*7.109*/(""""></script>
    """)))};def /*11.4*/top/*11.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*11.11*/("""
    """),format.raw/*12.5*/("""<div class="jumbotron">
      <div class="container">
        <h2>Welcome to fEMR 2.3.0-alpha, """),_display_(/*14.43*/currentUser/*14.54*/.getFirstName),format.raw/*14.67*/("""!</h2>
        """),format.raw/*15.120*/("""
        """),format.raw/*16.9*/("""<p>Please select a tab at the top to get started!</p>

        <p>or</p>
        <p>Search Below:</p>
        <div id="patientSearchContainer">
            <input type="text" class="patientSearch fInput typeahead loading" id="patientSearch" name="patientSearch" placeholder="Loading&hellip;" disabled="disabled"/>
        </div>
      </div>
    </div>
  """)))};
Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*4.1*/("""
    """),format.raw/*8.6*/("""


  """),format.raw/*25.4*/("""

"""),_display_(/*27.2*/main("Home", currentUser, outsideContainerTop = top, scripts = additionalScripts)/*27.83*/ {_display_(Seq[Any](format.raw/*27.85*/("""
  """),format.raw/*32.11*/("""
""")))}))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser): play.twirl.api.HtmlFormat.Appendable = apply(currentUser)

  def f:((femr.common.dtos.CurrentUser) => play.twirl.api.HtmlFormat.Appendable) = (currentUser) => apply(currentUser)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:18 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/home/index.scala.html
                  HASH: c8bad05f3dbdaeca0b42876139dbf320b8dc90c0
                  MATRIX: 780->1|939->96|964->113|1044->117|1080->127|1143->164|1157->170|1229->221|1313->279|1327->285|1405->342|1446->369|1457->372|1538->376|1571->382|1696->480|1716->491|1750->504|1795->631|1832->641|2236->44|2266->89|2298->360|2333->1006|2364->1011|2454->1092|2494->1094|2526->1189
                  LINES: 27->1|31->5|31->5|33->5|34->6|34->6|34->6|34->6|35->7|35->7|35->7|36->11|36->11|38->11|39->12|41->14|41->14|41->14|42->15|43->16|53->1|55->4|56->8|59->25|61->27|61->27|61->27|62->32
                  -- GENERATED --
              */
          