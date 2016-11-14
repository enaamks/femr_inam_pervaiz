
package femr.ui.views.html.admin.users

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

class manage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[femr.common.dtos.CurrentUser,femr.ui.models.admin.users.ManageViewModelGet,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser, viewModelGet: femr.ui.models.admin.users.ManageViewModelGet):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.controllers.admin.routes.UsersController
import femr.ui.views.html.layouts.admin
import femr.ui.views.html.partials.admin.toggleButton
def /*7.6*/additionalStyles/*7.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.26*/("""
        """),format.raw/*8.9*/("""<link rel="stylesheet" href=""""),_display_(/*8.39*/routes/*8.45*/.Assets.versioned("css/admin/users.css")),format.raw/*8.85*/("""">
    """)))};def /*11.6*/additionalScripts/*11.23*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*11.27*/("""
        """),format.raw/*12.9*/("""<script type="text/javascript" src=""""),_display_(/*12.46*/routes/*12.52*/.Assets.versioned("js/admin/users.js")),format.raw/*12.90*/(""""></script>
    """)))};
Seq[Any](format.raw/*1.106*/("""

"""),format.raw/*6.1*/("""
    """),format.raw/*9.6*/("""

    """),format.raw/*13.6*/("""

"""),_display_(/*15.2*/admin("Users", currentUser, styles = additionalStyles, scripts = additionalScripts)/*15.85*/ {_display_(Seq[Any](format.raw/*15.87*/("""

    """),format.raw/*17.5*/("""<a href=""""),_display_(/*17.15*/UsersController/*17.30*/.createGet()),format.raw/*17.42*/("""" class="fButton fOtherButton fAdminButton userBtns"><span class="glyphicon glyphicon-plus-sign"></span>
        Add User</a>

    <table id="userTable">
        <thead>
            <tr>
                <th>Edit</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>About</th>
                <th>Role</th>
                <th>Last Login</th>
                <th>Toggle</th>
            </tr>
        </thead>
        <tbody>
        """),_display_(/*34.10*/for(y <- 1 to viewModelGet.getUsers.size) yield /*34.51*/ {_display_(Seq[Any](format.raw/*34.53*/("""
            """),format.raw/*35.13*/("""<tr>
                <td>
                """),_display_(/*37.18*/helper/*37.24*/.form(action = UsersController.editGet(viewModelGet.getUser(y - 1).getId))/*37.98*/ {_display_(Seq[Any](format.raw/*37.100*/("""
                    """),_display_(/*38.22*/if(viewModelGet.getUser(y - 1).getEmail != "admin")/*38.73*/ {_display_(Seq[Any](format.raw/*38.75*/("""
                        """),format.raw/*39.25*/("""<button type="submit" class="btn btn-default editBtn">"""),_display_(/*39.80*/y),format.raw/*39.81*/("""</button>
                    """)))}),format.raw/*40.22*/("""
                """)))}),format.raw/*41.18*/("""

                """),format.raw/*43.17*/("""</td>
                <td>"""),_display_(/*44.22*/viewModelGet/*44.34*/.getUser(y - 1).getFirstName),format.raw/*44.62*/("""</td>
                <td>"""),_display_(/*45.22*/viewModelGet/*45.34*/.getUser(y - 1).getLastName),format.raw/*45.61*/("""</td>
                <td>"""),_display_(/*46.22*/viewModelGet/*46.34*/.getUser(y - 1).getEmail),format.raw/*46.58*/("""</td>
                <td>"""),_display_(/*47.22*/viewModelGet/*47.34*/.getUser(y - 1).getNotes),format.raw/*47.58*/("""</td>
                <td>
                """),_display_(/*49.18*/for(role <- 0 to viewModelGet.getUser(y - 1).getRoles.size - 1) yield /*49.81*/ {_display_(Seq[Any](format.raw/*49.83*/("""
                    """),format.raw/*50.21*/("""<ul>
                        <li>"""),_display_(/*51.30*/viewModelGet/*51.42*/.getUser(y - 1).getRoles.get(role)),format.raw/*51.76*/("""</li>
                    </ul>
                """)))}),format.raw/*53.18*/("""
                """),format.raw/*54.17*/("""</td>
                <td>"""),_display_(/*55.22*/viewModelGet/*55.34*/.getUser(y - 1).getLastLoginDate),format.raw/*55.66*/("""</td>
                <td class="text-center">
                """),_display_(/*57.18*/defining(viewModelGet.getUser(y - 1))/*57.55*/ { user =>_display_(Seq[Any](format.raw/*57.65*/("""
                    """),_display_(/*58.22*/if(user.getEmail != "admin")/*58.50*/ {_display_(Seq[Any](format.raw/*58.52*/("""
                        """),_display_(/*59.26*/toggleButton(!user.isDeleted, user.getId)),format.raw/*59.67*/("""
                    """)))}),format.raw/*60.22*/("""

                """)))}),format.raw/*62.18*/("""

                """),format.raw/*64.17*/("""</td>
            </tr>
        """)))}),format.raw/*66.10*/("""
        """),format.raw/*67.9*/("""</tbody>
    </table>
    <div id="editDialog" title="Edit User">
        <div id="editPartial">
            """),format.raw/*71.66*/("""
        """),format.raw/*72.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,viewModelGet:femr.ui.models.admin.users.ManageViewModelGet): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,viewModelGet)

  def f:((femr.common.dtos.CurrentUser,femr.ui.models.admin.users.ManageViewModelGet) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,viewModelGet) => apply(currentUser,viewModelGet)

  def ref: this.type = this

}


}

/**/
object manage extends manage_Scope0.manage
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/admin/users/manage.scala.html
                  HASH: 10c3ec6a79a8a8427067aaeb2b6377db09a7886b
                  MATRIX: 835->1|1166->272|1190->288|1270->292|1306->302|1362->332|1376->338|1436->378|1468->396|1494->413|1575->417|1612->427|1676->464|1691->470|1750->508|1808->105|1838->265|1870->387|1905->526|1936->531|2028->614|2068->616|2103->624|2140->634|2164->649|2197->661|2749->1186|2806->1227|2846->1229|2888->1243|2960->1288|2975->1294|3058->1368|3099->1370|3149->1393|3209->1444|3249->1446|3303->1472|3385->1527|3407->1528|3470->1560|3520->1579|3568->1599|3623->1627|3644->1639|3693->1667|3748->1695|3769->1707|3817->1734|3872->1762|3893->1774|3938->1798|3993->1826|4014->1838|4059->1862|4132->1908|4211->1971|4251->1973|4301->1995|4363->2030|4384->2042|4439->2076|4521->2127|4567->2145|4622->2173|4643->2185|4696->2217|4789->2283|4835->2320|4883->2330|4933->2353|4970->2381|5010->2383|5064->2410|5126->2451|5180->2474|5232->2495|5280->2515|5346->2550|5383->2560|5524->2726|5561->2736
                  LINES: 27->1|33->7|33->7|35->7|36->8|36->8|36->8|36->8|37->11|37->11|39->11|40->12|40->12|40->12|40->12|42->1|44->6|45->9|47->13|49->15|49->15|49->15|51->17|51->17|51->17|51->17|68->34|68->34|68->34|69->35|71->37|71->37|71->37|71->37|72->38|72->38|72->38|73->39|73->39|73->39|74->40|75->41|77->43|78->44|78->44|78->44|79->45|79->45|79->45|80->46|80->46|80->46|81->47|81->47|81->47|83->49|83->49|83->49|84->50|85->51|85->51|85->51|87->53|88->54|89->55|89->55|89->55|91->57|91->57|91->57|92->58|92->58|92->58|93->59|93->59|94->60|96->62|98->64|100->66|101->67|105->71|106->72
                  -- GENERATED --
              */
          