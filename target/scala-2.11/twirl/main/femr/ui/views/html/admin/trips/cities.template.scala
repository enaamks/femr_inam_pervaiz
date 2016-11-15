
package femr.ui.views.html.admin.trips

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object cities_Scope0 {
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

class cities extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[femr.common.dtos.CurrentUser,femr.ui.models.admin.trips.TripViewModelGet,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser, viewModel: femr.ui.models.admin.trips.TripViewModelGet):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.layouts.admin
import femr.ui.views.html.partials.admin.trips.tripsMenu
import femr.ui.controllers.admin.routes.TripController
def /*7.2*/additionalStyles/*7.18*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.22*/("""
    """),format.raw/*8.5*/("""<link rel="stylesheet" href=""""),_display_(/*8.35*/routes/*8.41*/.Assets.versioned("css/libraries/jquery.dataTables.min.css")),format.raw/*8.101*/("""">
    <link rel="stylesheet" href=""""),_display_(/*9.35*/routes/*9.41*/.Assets.versioned("css/superuser/superuser.css")),format.raw/*9.89*/("""">
""")))};def /*12.2*/additionalScripts/*12.19*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.23*/("""
    """),format.raw/*13.5*/("""<script type = "text/javascript" src=""""),_display_(/*13.44*/routes/*13.50*/.Assets.versioned("js/libraries/jquery.dataTables.min.js")),format.raw/*13.108*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*14.42*/routes/*14.48*/.Assets.versioned("js/superuser/superuser.js")),format.raw/*14.94*/(""""></script>
""")))};
Seq[Any](format.raw/*1.101*/("""

"""),format.raw/*6.1*/("""
"""),format.raw/*10.2*/("""

"""),format.raw/*15.2*/("""

"""),_display_(/*17.2*/admin("Trips - Manage Cities", currentUser, scripts = additionalScripts, styles = additionalStyles)/*17.101*/ {_display_(Seq[Any](format.raw/*17.103*/("""

    """),_display_(/*19.6*/tripsMenu()),format.raw/*19.17*/("""

    """),_display_(/*21.6*/for(messageIndex <- 1 to viewModel.getMessages.size) yield /*21.58*/{_display_(Seq[Any](format.raw/*21.59*/("""
        """),format.raw/*22.9*/("""<p>"""),_display_(/*22.13*/viewModel/*22.22*/.getMessages.get(messageIndex - 1)),format.raw/*22.56*/("""</p>
    """)))}),format.raw/*23.6*/("""

    """),_display_(/*25.6*/helper/*25.12*/.form(action = TripController.citiesPost())/*25.55*/ {_display_(Seq[Any](format.raw/*25.57*/("""
        """),format.raw/*26.9*/("""<div id="addCityWrap">
            <h1>Add City:</h1>
            <div>
                <label>City:<span class="red bold">*</span>
                    <input class="fInput" type="text" name="newCity"/>
                </label>
            </div>

            <div>
                <label>Country:<span class="red bold">*</span>
                    <select class="fSelect" name="newCityCountry">
                        <option selected disabled value=""></option>
                        """),_display_(/*38.26*/for(countryIndex <- 1 to viewModel.getAvailableCountries.size) yield /*38.88*/ {_display_(Seq[Any](format.raw/*38.90*/("""
                            """),format.raw/*39.29*/("""<option>"""),_display_(/*39.38*/viewModel/*39.47*/.getAvailableCountries.get(countryIndex - 1)),format.raw/*39.91*/("""</option>
                        """)))}),format.raw/*40.26*/("""
                    """),format.raw/*41.21*/("""</select>
                </label>
            </div>
        </div>
        <div id="submitWrap">
            <button type="submit" class="fButton">Submit</button>
        </div>
    """)))}),format.raw/*48.6*/("""

    """),format.raw/*50.5*/("""<div id="tableWrap">

        <table id="cityTable">
            <thead>
                <tr>
                    <th>City</th>
                    <th>Country</th>
                </tr>
            </thead>
            <tbody>
            """),_display_(/*60.14*/for(i <- 1 to viewModel.getAvailableCities.size) yield /*60.62*/ {_display_(Seq[Any](format.raw/*60.64*/("""
                """),_display_(/*61.18*/defining(viewModel.getAvailableCities.get(i - 1))/*61.67*/ { city =>_display_(Seq[Any](format.raw/*61.77*/("""

                    """),format.raw/*63.21*/("""<tr>
                        <td>"""),_display_(/*64.30*/city/*64.34*/.getCityName),format.raw/*64.46*/("""</td>
                        <td>"""),_display_(/*65.30*/city/*65.34*/.getCountryName),format.raw/*65.49*/("""</td>
                    </tr>
                """)))}),format.raw/*67.18*/("""
            """)))}),format.raw/*68.14*/("""
            """),format.raw/*69.13*/("""</tbody>
        </table>


    </div>

""")))}))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,viewModel:femr.ui.models.admin.trips.TripViewModelGet): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,viewModel)

  def f:((femr.common.dtos.CurrentUser,femr.ui.models.admin.trips.TripViewModelGet) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,viewModel) => apply(currentUser,viewModel)

  def ref: this.type = this

}


}

/**/
object cities extends cities_Scope0.cities
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:17 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/admin/trips/cities.scala.html
                  HASH: 999aa6ce55cb35817ad43578ce7ae4f580553768
                  MATRIX: 833->1|1161->265|1185->281|1265->285|1297->291|1353->321|1367->327|1448->387|1512->425|1526->431|1594->479|1622->489|1648->506|1729->510|1762->516|1828->555|1843->561|1923->619|2004->673|2019->679|2086->725|2140->100|2170->262|2199->484|2230->739|2261->744|2370->843|2411->845|2446->854|2478->865|2513->874|2581->926|2620->927|2657->937|2688->941|2706->950|2761->984|2802->995|2837->1004|2852->1010|2904->1053|2944->1055|2981->1065|3510->1567|3588->1629|3628->1631|3686->1661|3722->1670|3740->1679|3805->1723|3872->1759|3922->1781|4144->1973|4179->1981|4457->2232|4521->2280|4561->2282|4607->2301|4665->2350|4713->2360|4765->2384|4827->2419|4840->2423|4873->2435|4936->2471|4949->2475|4985->2490|5067->2541|5113->2556|5155->2570
                  LINES: 27->1|33->7|33->7|35->7|36->8|36->8|36->8|36->8|37->9|37->9|37->9|38->12|38->12|40->12|41->13|41->13|41->13|41->13|42->14|42->14|42->14|44->1|46->6|47->10|49->15|51->17|51->17|51->17|53->19|53->19|55->21|55->21|55->21|56->22|56->22|56->22|56->22|57->23|59->25|59->25|59->25|59->25|60->26|72->38|72->38|72->38|73->39|73->39|73->39|73->39|74->40|75->41|82->48|84->50|94->60|94->60|94->60|95->61|95->61|95->61|97->63|98->64|98->64|98->64|99->65|99->65|99->65|101->67|102->68|103->69
                  -- GENERATED --
              */
          