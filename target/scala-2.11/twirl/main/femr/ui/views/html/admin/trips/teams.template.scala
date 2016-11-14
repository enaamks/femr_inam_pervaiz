
package femr.ui.views.html.admin.trips

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object teams_Scope0 {
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

class teams extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[femr.common.dtos.CurrentUser,femr.ui.models.admin.trips.TripViewModelGet,play.twirl.api.HtmlFormat.Appendable] {

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

"""),_display_(/*17.2*/admin("Trips - Manage Teams", currentUser, styles = additionalStyles, scripts = additionalScripts)/*17.100*/ {_display_(Seq[Any](format.raw/*17.102*/("""

    """),_display_(/*19.6*/tripsMenu()),format.raw/*19.17*/("""

    """),_display_(/*21.6*/for(messageIndex <- 1 to viewModel.getMessages.size) yield /*21.58*/{_display_(Seq[Any](format.raw/*21.59*/("""
        """),format.raw/*22.9*/("""<p>"""),_display_(/*22.13*/viewModel/*22.22*/.getMessages.get(messageIndex - 1)),format.raw/*22.56*/("""</p>
    """)))}),format.raw/*23.6*/("""

    """),_display_(/*25.6*/helper/*25.12*/.form(action = TripController.teamsPost())/*25.54*/ {_display_(Seq[Any](format.raw/*25.56*/("""

        """),format.raw/*27.9*/("""<div id="addTeamWrap">
            <h1>Add Team:</h1>
            <div>
                <label>Team Name<span class="red bold">*</span>:
                    <input class="fInput" type="text" name="newTeamName"/>
                </label>
            </div>

            <div>
                <label>Team Location:
                    <input class="fInput" type="text" name="newTeamLocation"/>
                </label>
            </div>

            <div>
                <label>Team Description:
                    <input class="fInput" type="text" name="newTeamDescription"/>
                </label>
            </div>


        </div>


        <div id="submitWrap">
            <button type="submit" class="fButton">Submit</button>
        </div>
    """)))}),format.raw/*54.6*/("""

    """),format.raw/*56.5*/("""<div id="tableWrap">

        <table id="teamTable">
            <thead>
                <tr>
                    <th>Team Name</th>
                    <th>Description</th>
                    <th>Origin</th>
                </tr>
            </thead>
            <tbody>
            """),_display_(/*67.14*/for(teamIndex <- 1 to viewModel.getMissionItems.size()) yield /*67.69*/ {_display_(Seq[Any](format.raw/*67.71*/("""
                """),_display_(/*68.18*/defining(viewModel.getMissionItems.get(teamIndex - 1))/*68.72*/ { item =>_display_(Seq[Any](format.raw/*68.82*/("""

                    """),format.raw/*70.21*/("""<tr>
                        <td>"""),_display_(/*71.30*/item/*71.34*/.getTeamName),format.raw/*71.46*/("""</td>
                        <td>"""),_display_(/*72.30*/item/*72.34*/.getTeamDescription),format.raw/*72.53*/("""</td>
                        <td>"""),_display_(/*73.30*/item/*73.34*/.getTeamLocation),format.raw/*73.50*/("""</td>
                    </tr>
                """)))}),format.raw/*75.18*/("""
            """)))}),format.raw/*76.14*/("""
            """),format.raw/*77.13*/("""</tbody>
        </table>


    </div>

""")))}),format.raw/*83.2*/("""
"""))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,viewModel:femr.ui.models.admin.trips.TripViewModelGet): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,viewModel)

  def f:((femr.common.dtos.CurrentUser,femr.ui.models.admin.trips.TripViewModelGet) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,viewModel) => apply(currentUser,viewModel)

  def ref: this.type = this

}


}

/**/
object teams extends teams_Scope0.teams
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/admin/trips/teams.scala.html
                  HASH: 5f46cf13b6659d087fca1d1f63c91b944b5f2255
                  MATRIX: 831->1|1159->265|1183->281|1263->285|1295->291|1351->321|1365->327|1446->387|1510->425|1524->431|1592->479|1620->489|1646->506|1727->510|1760->516|1826->555|1841->561|1921->619|2002->673|2017->679|2084->725|2138->100|2168->262|2197->484|2228->739|2259->744|2367->842|2408->844|2443->853|2475->864|2510->873|2578->925|2617->926|2654->936|2685->940|2703->949|2758->983|2799->994|2834->1003|2849->1009|2900->1051|2940->1053|2979->1065|3793->1849|3828->1857|4152->2154|4223->2209|4263->2211|4309->2230|4372->2284|4420->2294|4472->2318|4534->2353|4547->2357|4580->2369|4643->2405|4656->2409|4696->2428|4759->2464|4772->2468|4809->2484|4891->2535|4937->2550|4979->2564|5056->2611
                  LINES: 27->1|33->7|33->7|35->7|36->8|36->8|36->8|36->8|37->9|37->9|37->9|38->12|38->12|40->12|41->13|41->13|41->13|41->13|42->14|42->14|42->14|44->1|46->6|47->10|49->15|51->17|51->17|51->17|53->19|53->19|55->21|55->21|55->21|56->22|56->22|56->22|56->22|57->23|59->25|59->25|59->25|59->25|61->27|88->54|90->56|101->67|101->67|101->67|102->68|102->68|102->68|104->70|105->71|105->71|105->71|106->72|106->72|106->72|107->73|107->73|107->73|109->75|110->76|111->77|117->83
                  -- GENERATED --
              */
          