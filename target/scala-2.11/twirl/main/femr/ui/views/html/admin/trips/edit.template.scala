
package femr.ui.views.html.admin.trips

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object edit_Scope0 {
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

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[femr.common.dtos.CurrentUser,femr.ui.models.admin.trips.EditViewModelGet,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser, viewModel: femr.ui.models.admin.trips.EditViewModelGet):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.layouts.admin
import femr.ui.controllers.admin.routes.TripController
def /*6.2*/additionalStyles/*6.18*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.22*/("""

    """),format.raw/*8.5*/("""<link rel="stylesheet" href=""""),_display_(/*8.35*/routes/*8.41*/.Assets.versioned("css/libraries/select2.min.css")),format.raw/*8.91*/("""">
    <link rel="stylesheet" href=""""),_display_(/*9.35*/routes/*9.41*/.Assets.versioned("css/superuser/superuser.css")),format.raw/*9.89*/("""">
""")))};def /*12.2*/additionalScripts/*12.19*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.23*/("""

    """),format.raw/*14.5*/("""<script type="text/javascript" src=""""),_display_(/*14.42*/routes/*14.48*/.Assets.versioned("js/libraries/select2.min.js")),format.raw/*14.96*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*15.42*/routes/*15.48*/.Assets.versioned("js/superuser/superuser.js")),format.raw/*15.94*/(""""></script>
""")))};
Seq[Any](format.raw/*1.101*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*10.2*/("""

"""),format.raw/*16.2*/("""

"""),_display_(/*18.2*/admin("Trips - Manage Trips - Edit Trip", currentUser, styles = additionalStyles, scripts = additionalScripts)/*18.112*/ {_display_(Seq[Any](format.raw/*18.114*/("""

    """),_display_(/*20.6*/defining(viewModel.getTrip)/*20.33*/ { trip =>_display_(Seq[Any](format.raw/*20.43*/("""
        """),format.raw/*21.9*/("""<p>Id: """),_display_(/*21.17*/trip/*21.21*/.getId),format.raw/*21.27*/("""</p>
        <p>Team name: """),_display_(/*22.24*/trip/*22.28*/.getTeamName),format.raw/*22.40*/("""</p>
        <p>City: """),_display_(/*23.19*/trip/*23.23*/.getTripCity),format.raw/*23.35*/("""</p>
        <p>Country: """),_display_(/*24.22*/trip/*24.26*/.getTripCountry),format.raw/*24.41*/("""</p>
        <p>Start Date: """),_display_(/*25.25*/trip/*25.29*/.getFriendlyTripStartDate),format.raw/*25.54*/("""</p>
        <p>End Date: """),_display_(/*26.23*/trip/*26.27*/.getFriendlyTripEndDate),format.raw/*26.50*/("""</p>
    """)))}),format.raw/*27.6*/("""


    """),_display_(/*30.6*/helper/*30.12*/.form(action = TripController.editPost(viewModel.getTripId))/*30.72*/ {_display_(Seq[Any](format.raw/*30.74*/("""
        """),format.raw/*31.9*/("""<h4>Add users to this trip: </h4>
        <select id="addUsersSelect2" multiple="multiple" name="newUsersForTrip[]">
        """),_display_(/*33.10*/defining(viewModel.getAllUsers)/*33.41*/ { allUsers =>_display_(Seq[Any](format.raw/*33.55*/("""
            """),_display_(/*34.14*/for(i <- 1 to allUsers.size) yield /*34.42*/ {_display_(Seq[Any](format.raw/*34.44*/("""
                """),format.raw/*35.17*/("""<option value=""""),_display_(/*35.33*/allUsers/*35.41*/.get(i - 1).getId),format.raw/*35.58*/("""">"""),_display_(/*35.61*/allUsers/*35.69*/.get(i - 1).getFirstName),format.raw/*35.93*/(""" """),_display_(/*35.95*/allUsers/*35.103*/.get(i - 1).getLastName),format.raw/*35.126*/("""</option>
            """)))}),format.raw/*36.14*/("""
        """)))}),format.raw/*37.10*/("""
        """),format.raw/*38.9*/("""</select>

        <button type="submit">Add</button>

        <h4>Remove users from this trip:</h4>

        <select id="removeUsersSelect2" multiple="multiple" name="removeUsersForTrip[]">
            """),_display_(/*45.14*/defining(viewModel.getUsers)/*45.42*/ { users =>_display_(Seq[Any](format.raw/*45.53*/("""
                """),_display_(/*46.18*/for(i <- 1 to users.size) yield /*46.43*/ {_display_(Seq[Any](format.raw/*46.45*/("""
                    """),format.raw/*47.21*/("""<option value=""""),_display_(/*47.37*/users/*47.42*/.get(i - 1).getId),format.raw/*47.59*/("""">"""),_display_(/*47.62*/users/*47.67*/.get(i - 1).getFirstName),format.raw/*47.91*/(""" """),_display_(/*47.93*/users/*47.98*/.get(i - 1).getLastName),format.raw/*47.121*/("""</option>
                """)))}),format.raw/*48.18*/("""
            """)))}),format.raw/*49.14*/("""
        """),format.raw/*50.9*/("""</select>
        <button type="submit">Remove</button>
    """)))}),format.raw/*52.6*/("""


    """),format.raw/*55.5*/("""<table id="usersTripTable">
        <thead>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>About</th>
            </tr>
        </thead>
        <tbody>
        """),_display_(/*65.10*/defining(viewModel.getUsers)/*65.38*/ { users =>_display_(Seq[Any](format.raw/*65.49*/("""
            """),_display_(/*66.14*/for(i <- 1 to users.size()) yield /*66.41*/ {_display_(Seq[Any](format.raw/*66.43*/("""
                """),format.raw/*67.17*/("""<tr>
                    <td>"""),_display_(/*68.26*/users/*68.31*/.get(i - 1).getFirstName),format.raw/*68.55*/("""</td>
                    <td>"""),_display_(/*69.26*/users/*69.31*/.get(i - 1).getLastName),format.raw/*69.54*/("""</td>
                    <td>"""),_display_(/*70.26*/users/*70.31*/.get(i - 1).getEmail),format.raw/*70.51*/("""</td>
                    <td>"""),_display_(/*71.26*/users/*71.31*/.get(i - 1).getNotes),format.raw/*71.51*/("""</td>
                </tr>
            """)))}),format.raw/*73.14*/("""
        """)))}),format.raw/*74.10*/("""
        """),format.raw/*75.9*/("""</tbody>
    </table>


""")))}),format.raw/*79.2*/("""

"""))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,viewModel:femr.ui.models.admin.trips.EditViewModelGet): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,viewModel)

  def f:((femr.common.dtos.CurrentUser,femr.ui.models.admin.trips.EditViewModelGet) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,viewModel) => apply(currentUser,viewModel)

  def ref: this.type = this

}


}

/**/
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:17 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/admin/trips/edit.scala.html
                  HASH: d23533a1fb1246257f9894995b9805841f05d63f
                  MATRIX: 829->1|1100->206|1124->222|1204->226|1238->234|1294->264|1308->270|1378->320|1442->358|1456->364|1524->412|1552->422|1578->439|1659->443|1694->451|1758->488|1773->494|1842->542|1923->596|1938->602|2005->648|2059->100|2089->203|2118->417|2149->662|2180->667|2300->777|2341->779|2376->788|2412->815|2460->825|2497->835|2532->843|2545->847|2572->853|2628->882|2641->886|2674->898|2725->922|2738->926|2771->938|2825->965|2838->969|2874->984|2931->1014|2944->1018|2990->1043|3045->1071|3058->1075|3102->1098|3143->1109|3180->1120|3195->1126|3264->1186|3304->1188|3341->1198|3496->1326|3536->1357|3588->1371|3630->1386|3674->1414|3714->1416|3760->1434|3803->1450|3820->1458|3858->1475|3888->1478|3905->1486|3950->1510|3979->1512|3997->1520|4042->1543|4097->1567|4139->1578|4176->1588|4414->1799|4451->1827|4500->1838|4546->1857|4587->1882|4627->1884|4677->1906|4720->1922|4734->1927|4772->1944|4802->1947|4816->1952|4861->1976|4890->1978|4904->1983|4949->2006|5008->2034|5054->2049|5091->2059|5184->2122|5221->2132|5512->2396|5549->2424|5598->2435|5640->2450|5683->2477|5723->2479|5769->2497|5827->2528|5841->2533|5886->2557|5945->2589|5959->2594|6003->2617|6062->2649|6076->2654|6117->2674|6176->2706|6190->2711|6231->2731|6305->2774|6347->2785|6384->2795|6443->2824
                  LINES: 27->1|32->6|32->6|34->6|36->8|36->8|36->8|36->8|37->9|37->9|37->9|38->12|38->12|40->12|42->14|42->14|42->14|42->14|43->15|43->15|43->15|45->1|47->5|48->10|50->16|52->18|52->18|52->18|54->20|54->20|54->20|55->21|55->21|55->21|55->21|56->22|56->22|56->22|57->23|57->23|57->23|58->24|58->24|58->24|59->25|59->25|59->25|60->26|60->26|60->26|61->27|64->30|64->30|64->30|64->30|65->31|67->33|67->33|67->33|68->34|68->34|68->34|69->35|69->35|69->35|69->35|69->35|69->35|69->35|69->35|69->35|69->35|70->36|71->37|72->38|79->45|79->45|79->45|80->46|80->46|80->46|81->47|81->47|81->47|81->47|81->47|81->47|81->47|81->47|81->47|81->47|82->48|83->49|84->50|86->52|89->55|99->65|99->65|99->65|100->66|100->66|100->66|101->67|102->68|102->68|102->68|103->69|103->69|103->69|104->70|104->70|104->70|105->71|105->71|105->71|107->73|108->74|109->75|113->79
                  -- GENERATED --
              */
          