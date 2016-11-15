
package femr.ui.views.html.admin.trips

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object manage_Scope0 {
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

class manage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[femr.common.dtos.CurrentUser,femr.ui.models.admin.trips.TripViewModelGet,play.twirl.api.HtmlFormat.Appendable] {

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

"""),_display_(/*17.2*/admin("Trips - Manage Trips", currentUser, styles = additionalStyles, scripts = additionalScripts)/*17.100*/ {_display_(Seq[Any](format.raw/*17.102*/("""

    """),_display_(/*19.6*/tripsMenu()),format.raw/*19.17*/("""

    """),_display_(/*21.6*/for(messageIndex <- 1 to viewModel.getMessages.size) yield /*21.58*/{_display_(Seq[Any](format.raw/*21.59*/("""
        """),format.raw/*22.9*/("""<p>"""),_display_(/*22.13*/viewModel/*22.22*/.getMessages.get(messageIndex - 1)),format.raw/*22.56*/("""</p>
    """)))}),format.raw/*23.6*/("""

    """),_display_(/*25.6*/helper/*25.12*/.form(action = TripController.managePost())/*25.55*/ {_display_(Seq[Any](format.raw/*25.57*/("""
        """),format.raw/*26.9*/("""<div id="addTripWrap">
            <h1>Add Trip:</h1>
            <div>
                <label>Trip Team:<span class="red bold">*</span>
                    <select class="fSelect" name="newTripTeamName">
                        <option selected value=""></option>
                        """),_display_(/*32.26*/for(teamIndex <- 1 to viewModel.getMissionItems.size) yield /*32.79*/ {_display_(Seq[Any](format.raw/*32.81*/("""
                            """),_display_(/*33.30*/defining(viewModel.getMissionItems.get(teamIndex - 1))/*33.84*/ { item =>_display_(Seq[Any](format.raw/*33.94*/("""
                                """),format.raw/*34.33*/("""<option>"""),_display_(/*34.42*/item/*34.46*/.getTeamName),format.raw/*34.58*/("""</option>
                            """)))}),format.raw/*35.30*/("""
                        """)))}),format.raw/*36.26*/("""
                    """),format.raw/*37.21*/("""</select>
                </label>
            </div>
            <div>
                <label>Trip City:<span class="red bold">*</span>
                    <select class="fSelect" name="newTripCity">
                        <option selected value=""></option>
                        """),_display_(/*44.26*/for(tripIndex <- 1 to viewModel.getAvailableCities.size) yield /*44.82*/ {_display_(Seq[Any](format.raw/*44.84*/("""
                            """),_display_(/*45.30*/defining(viewModel.getAvailableCities.get(tripIndex - 1))/*45.87*/ { city =>_display_(Seq[Any](format.raw/*45.97*/("""
                                """),format.raw/*46.33*/("""<option country-name=""""),_display_(/*46.56*/city/*46.60*/.getCountryName),format.raw/*46.75*/("""">"""),_display_(/*46.78*/city/*46.82*/.getCityName),format.raw/*46.94*/("""</option>
                            """)))}),format.raw/*47.30*/("""
                        """)))}),format.raw/*48.26*/("""
                    """),format.raw/*49.21*/("""</select>
                </label>
            </div>
            <div>
                <label>Trip Country:
                    <input class="fInput" type="text" value="" name="newTripCountry" readonly/>
                </label>
            </div>

            <div>
                <label>Start Date:<span class="red bold">*</span>
                    <input type="date" name="newTripStartDate"/>
                </label>
            </div>
            <div>
                <label>End Date:<span class="red bold">*</span>
                    <input type="date" name="newTripEndDate"/>
                </label>
            </div>
        </div>

        <div id="submitWrap">
            <button type="submit" class="fButton">Submit</button>
        </div>
    """)))}),format.raw/*73.6*/("""

    """),format.raw/*75.5*/("""<div id="tableWrap">

        <table id="tripTable">
            <thead>
                <tr>
                    <th>Edit</th>
                    <th>Team Name</th>
                    <th>Country</th>
                    <th>City</th>
                    <th>Start Date</th>
                    <th>End Date</th>
                </tr>
            </thead>
            <tbody>
            """),_display_(/*89.14*/for(i <- 1 to viewModel.getMissionItems.size) yield /*89.59*/ {_display_(Seq[Any](format.raw/*89.61*/("""
                """),_display_(/*90.18*/defining(viewModel.getMissionItems.get(i - 1))/*90.64*/ { missionItem =>_display_(Seq[Any](format.raw/*90.81*/("""
                    """),_display_(/*91.22*/for(tripIndex <- 1 to missionItem.getMissionTrips.size) yield /*91.77*/ {_display_(Seq[Any](format.raw/*91.79*/("""
                        """),_display_(/*92.26*/defining(missionItem.getMissionTrips.get(tripIndex - 1))/*92.82*/ { missionTrip =>_display_(Seq[Any](format.raw/*92.99*/("""
                            """),format.raw/*93.29*/("""<tr>
                                <td>
                                    """),_display_(/*95.38*/helper/*95.44*/.form(action = TripController.editGet(missionTrip.getId))/*95.101*/ {_display_(Seq[Any](format.raw/*95.103*/("""
                                        """),format.raw/*96.41*/("""<button type="submit" class="btn btn-default editBtn">Edit</button>
                                    """)))}),format.raw/*97.38*/("""
                                """),format.raw/*98.33*/("""</td>
                                <td>"""),_display_(/*99.38*/missionItem/*99.49*/.getTeamName),format.raw/*99.61*/("""</td>
                                <td>"""),_display_(/*100.38*/missionTrip/*100.49*/.getTripCountry),format.raw/*100.64*/("""</td>
                                <td>"""),_display_(/*101.38*/missionTrip/*101.49*/.getTripCity),format.raw/*101.61*/("""</td>
                                <td>"""),_display_(/*102.38*/missionTrip/*102.49*/.getFriendlyTripStartDate),format.raw/*102.74*/("""</td>
                                <td>"""),_display_(/*103.38*/missionTrip/*103.49*/.getFriendlyTripEndDate),format.raw/*103.72*/("""</td>
                            </tr>
                        """)))}),format.raw/*105.26*/("""
                    """)))}),format.raw/*106.22*/("""
                """)))}),format.raw/*107.18*/("""
            """)))}),format.raw/*108.14*/("""
            """),format.raw/*109.13*/("""</tbody>
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
object manage extends manage_Scope0.manage
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:17 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/admin/trips/manage.scala.html
                  HASH: 8e8dc017c029f390f515204d9dd608ad3f8d22be
                  MATRIX: 833->1|1161->265|1185->281|1265->285|1297->291|1353->321|1367->327|1448->387|1512->425|1526->431|1594->479|1622->489|1648->506|1729->510|1762->516|1828->555|1843->561|1923->619|2004->673|2019->679|2086->725|2140->100|2170->262|2199->484|2230->739|2261->744|2369->842|2410->844|2445->853|2477->864|2512->873|2580->925|2619->926|2656->936|2687->940|2705->949|2760->983|2801->994|2836->1003|2851->1009|2903->1052|2943->1054|2980->1064|3303->1360|3372->1413|3412->1415|3470->1446|3533->1500|3581->1510|3643->1544|3679->1553|3692->1557|3725->1569|3796->1609|3854->1636|3904->1658|4224->1951|4296->2007|4336->2009|4394->2040|4460->2097|4508->2107|4570->2141|4620->2164|4633->2168|4669->2183|4699->2186|4712->2190|4745->2202|4816->2242|4874->2269|4924->2291|5742->3079|5777->3087|6210->3493|6271->3538|6311->3540|6357->3559|6412->3605|6467->3622|6517->3645|6588->3700|6628->3702|6682->3729|6747->3785|6802->3802|6860->3832|6968->3913|6983->3919|7050->3976|7091->3978|7161->4020|7298->4126|7360->4160|7431->4204|7451->4215|7484->4227|7556->4271|7577->4282|7614->4297|7686->4341|7707->4352|7741->4364|7813->4408|7834->4419|7881->4444|7953->4488|7974->4499|8019->4522|8118->4589|8173->4612|8224->4631|8271->4646|8314->4660
                  LINES: 27->1|33->7|33->7|35->7|36->8|36->8|36->8|36->8|37->9|37->9|37->9|38->12|38->12|40->12|41->13|41->13|41->13|41->13|42->14|42->14|42->14|44->1|46->6|47->10|49->15|51->17|51->17|51->17|53->19|53->19|55->21|55->21|55->21|56->22|56->22|56->22|56->22|57->23|59->25|59->25|59->25|59->25|60->26|66->32|66->32|66->32|67->33|67->33|67->33|68->34|68->34|68->34|68->34|69->35|70->36|71->37|78->44|78->44|78->44|79->45|79->45|79->45|80->46|80->46|80->46|80->46|80->46|80->46|80->46|81->47|82->48|83->49|107->73|109->75|123->89|123->89|123->89|124->90|124->90|124->90|125->91|125->91|125->91|126->92|126->92|126->92|127->93|129->95|129->95|129->95|129->95|130->96|131->97|132->98|133->99|133->99|133->99|134->100|134->100|134->100|135->101|135->101|135->101|136->102|136->102|136->102|137->103|137->103|137->103|139->105|140->106|141->107|142->108|143->109
                  -- GENERATED --
              */
          