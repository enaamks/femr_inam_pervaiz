
package femr.ui.views.html.admin.users

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

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[femr.common.dtos.CurrentUser,play.data.Form[femr.ui.models.admin.users.EditViewModel],java.util.List[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: java.lang.String
},java.util.List[_$2] forSome { 
   type _$2 >: _root_.scala.Nothing <: java.lang.String
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser, form: play.data.Form[femr.ui.models.admin.users.EditViewModel], availableRoles: java.util.List[_ <: java.lang.String], messages: java.util.List[_ <: java.lang.String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.common.models.MissionTripItem
import views.html.helper.options
import views.html.helper.select
import views.html.helper.FieldConstructor
import femr.ui.views.html.partials.admin.inputFieldConstructor
import femr.ui.views.html.layouts.admin
import femr.ui.controllers.admin.routes.UsersController
def /*14.6*/additionalStyles/*14.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.26*/("""
        """),format.raw/*15.9*/("""<link rel="stylesheet" href=""""),_display_(/*15.39*/routes/*15.45*/.Assets.versioned("css/libraries/jquery.dataTables.min.css")),format.raw/*15.105*/("""">
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("css/admin/users.css")),format.raw/*16.85*/("""">
    """)))};def /*18.6*/additionalScripts/*18.23*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*18.27*/("""
        """),format.raw/*19.9*/("""<script type = "text/javascript" src=""""),_display_(/*19.48*/routes/*19.54*/.Assets.versioned("js/libraries/jquery.dataTables.min.js")),format.raw/*19.112*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*20.46*/routes/*20.52*/.Assets.versioned("js/admin/users.js")),format.raw/*20.90*/(""""></script>
    """)))};def /*22.6*/additionalMessages/*22.24*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.28*/("""
    """),_display_(/*23.6*/for(message <- messages) yield /*23.30*/ {_display_(Seq[Any](format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""<p class="adminMessage">"""),_display_(/*24.34*/message),format.raw/*24.41*/("""</p>
    """)))}),format.raw/*25.6*/("""
    """)))};implicit def /*11.6*/implicitField/*11.19*/ = {{
        FieldConstructor(inputFieldConstructor.f)
    }};
Seq[Any](format.raw/*1.213*/("""

"""),format.raw/*10.1*/("""
    """),format.raw/*13.6*/("""
    """),format.raw/*17.6*/("""
    """),format.raw/*21.6*/("""
    """),format.raw/*26.6*/("""

"""),_display_(/*28.2*/admin("Edit User", currentUser, styles = additionalStyles, scripts = additionalScripts, message = additionalMessages)/*28.119*/ {_display_(Seq[Any](format.raw/*28.121*/("""
    """),format.raw/*29.5*/("""<div class="container">
    """),_display_(/*30.6*/helper/*30.12*/.form(action = UsersController.editPost(Integer.parseInt(form("userId").value())), 'name -> "createForm")/*30.117*/ {_display_(Seq[Any](format.raw/*30.119*/("""
        """),format.raw/*31.9*/("""<input type="hidden" value=""""),_display_(/*31.38*/form("userId")/*31.52*/.value()),format.raw/*31.60*/("""" name="userId"/>


        <div class="editWrapBoth" id="editWrapLeft">

            """),_display_(/*36.14*/helper/*36.20*/.inputText(form("email"),
                'class -> "fInput",
                '_label -> "Email Address",
                'readonly -> "readonly"
            )),format.raw/*40.14*/("""

            """),_display_(/*42.14*/helper/*42.20*/.inputText(form("firstName"),
                'class -> "fInput",
                '_label -> "First Name"
            )),format.raw/*45.14*/("""

            """),_display_(/*47.14*/helper/*47.20*/.inputText(form("lastName"),
                'class -> "fInput",
                '_label -> "Last Name"
            )),format.raw/*50.14*/("""

            """),_display_(/*52.14*/helper/*52.20*/.inputText(form("notes"),
                'class -> "fInput",
                '_label -> "About"
            )),format.raw/*55.14*/("""

            """),format.raw/*57.13*/("""<label>Password Reset?*</label>
            """),_display_(/*58.14*/if(form("passwordReset").value == "true")/*58.55*/ {_display_(Seq[Any](format.raw/*58.57*/("""
                """),format.raw/*59.17*/("""<input type="checkbox" name="passwordReset" checked="checked"/>
            """)))}/*60.15*/else/*60.20*/{_display_(Seq[Any](format.raw/*60.21*/("""
                """),format.raw/*61.17*/("""<input type="checkbox" name="passwordReset"/>
            """)))}),format.raw/*62.14*/("""
            """),format.raw/*63.13*/("""<p>*When checked, the user will be prompted to change their password on next login.</p>

            <label>Change User Password**</label>
            <p>**Changes the user's password when filled out. Proceed with caution.</p>
            """),_display_(/*67.14*/helper/*67.20*/.inputText(form("newPassword"),
                'class -> "fInput",
                'placeholder -> "New Password",
                'type -> "password",
                '_label -> null
            )),format.raw/*72.14*/("""
            """),_display_(/*73.14*/helper/*73.20*/.inputText(form("newPasswordVerify"),
                'class -> "fInput",
                'placeholder -> "Verify New Password",
                'type -> "password",
                '_label -> null
            )),format.raw/*78.14*/("""
            """),format.raw/*79.13*/("""<label>Trips</label>
            <p>Trips that this user has attended. Allows the user to view inventory related to that trip.</p>
            <table id="userTripTable">
                <thead>
                    <tr>
                        <th>Organization</th>
                        <th>Country</th>
                        <th>Date</th>
                    </tr>
                </thead>
                <tbody>
                    """),_display_(/*90.22*/helper/*90.28*/.repeat(form("missionTripItems"), min = 0)/*90.70*/ { trip =>_display_(Seq[Any](format.raw/*90.80*/("""
                        """),format.raw/*91.25*/("""<tr>
                            <td>"""),_display_(/*92.34*/form(trip.name.toString + ".teamName")/*92.72*/.value),format.raw/*92.78*/("""</td>
                            <td>"""),_display_(/*93.34*/form(trip.name.toString + ".tripCountry")/*93.75*/.value),format.raw/*93.81*/("""</td>
                            <td>"""),_display_(/*94.34*/form(trip.name.toString + ".friendlyTripStartDate")/*94.85*/.value),format.raw/*94.91*/("""</td>
                        </tr>

                    """)))}),format.raw/*97.22*/("""
                """),format.raw/*98.17*/("""</tbody>
            </table>

        </div>

        <div class="editWrapBoth" id="editWrapRight">
            <div id="roleWrap">
                <label>Roles</label>
                <span class="errors"></span>


                <div class="btn-group width-100">
                    """),_display_(/*110.22*/for(error <- form("roles").errors) yield /*110.56*/ {_display_(Seq[Any](format.raw/*110.58*/("""
                        """),format.raw/*111.25*/("""<p class="createUserError"> """),_display_(/*111.54*/error/*111.59*/.message),format.raw/*111.67*/("""</p>
                    """)))}),format.raw/*112.22*/("""
                    """),format.raw/*113.21*/("""<button type="button" class="btn btn-default dropdown-toggle width-100" data-toggle="dropdown">
                        Add Role <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu width-100" role="menu">
                    """),_display_(/*117.22*/for(role <- 1 to availableRoles.size()) yield /*117.61*/ {_display_(Seq[Any](format.raw/*117.63*/("""
                        """),format.raw/*118.25*/("""<li class="roleListItem"><a>"""),_display_(/*118.54*/availableRoles/*118.68*/.get(role - 1)),format.raw/*118.82*/("""</a></li>
                    """)))}),format.raw/*119.22*/("""
                    """),format.raw/*120.21*/("""</ul>
                </div>


                <ul class="list-group" id="currentRoles">

                """),_display_(/*126.18*/helper/*126.24*/.repeat(form("roles"), min = 1)/*126.55*/ { role =>_display_(Seq[Any](format.raw/*126.65*/("""
                    """),format.raw/*127.21*/("""<li class="list-group-item" value=""""),_display_(/*127.57*/role/*127.61*/.value),format.raw/*127.67*/("""">
                        <span class="badge roleBadge">X</span>
                        """),_display_(/*129.26*/role/*129.30*/.value),format.raw/*129.36*/("""
                            """),format.raw/*130.29*/("""<!-- stores hidden value for POST -->
                        <input type="text" class="hidden" name="roles[]" value=""""),_display_(/*131.82*/role/*131.86*/.value),format.raw/*131.92*/(""""/>
                    </li>
                """)))}),format.raw/*133.18*/("""


                """),format.raw/*136.17*/("""</ul>
            </div>
        </div>
    </div>
    <div class="btn-group pull-right">
        <button type="submit" class="btn btn-default" id="editUserSubmitBtn">Save</button>
        <a class="btn btn-default" id="cancelBtn" href="/admin/users">Cancel</a>
    </div>

""")))}),format.raw/*145.2*/("""

""")))}))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,form:play.data.Form[femr.ui.models.admin.users.EditViewModel],availableRoles:java.util.List[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: java.lang.String
},messages:java.util.List[_$2] forSome { 
   type _$2 >: _root_.scala.Nothing <: java.lang.String
}): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,form,availableRoles,messages)

  def f:((femr.common.dtos.CurrentUser,play.data.Form[femr.ui.models.admin.users.EditViewModel],java.util.List[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: java.lang.String
},java.util.List[_$2] forSome { 
   type _$2 >: _root_.scala.Nothing <: java.lang.String
}) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,form,availableRoles,messages) => apply(currentUser,form,availableRoles,messages)

  def ref: this.type = this

}


}

/**/
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/admin/users/edit.scala.html
                  HASH: eaae2f33c4b202f30c487c3255c25320db2e39b7
                  MATRIX: 1024->1|1621->628|1646->644|1727->648|1764->658|1821->688|1836->694|1918->754|1987->796|2002->802|2063->842|2095->858|2121->875|2202->879|2239->889|2305->928|2320->934|2400->992|2485->1050|2500->1056|2559->1094|2600->1119|2627->1137|2708->1141|2741->1148|2781->1172|2821->1174|2858->1184|2910->1209|2938->1216|2979->1227|3018->545|3040->558|3134->212|3165->538|3198->621|3231->851|3264->1112|3297->1234|3328->1239|3455->1356|3496->1358|3529->1364|3585->1394|3600->1400|3715->1505|3756->1507|3793->1517|3849->1546|3872->1560|3901->1568|4020->1660|4035->1666|4219->1829|4263->1846|4278->1852|4421->1974|4465->1991|4480->1997|4621->2117|4665->2134|4680->2140|4814->2253|4858->2269|4931->2315|4981->2356|5021->2358|5067->2376|5164->2455|5177->2460|5216->2461|5262->2479|5353->2539|5395->2553|5666->2797|5681->2803|5905->3006|5947->3021|5962->3027|6199->3243|6241->3257|6719->3708|6734->3714|6785->3756|6833->3766|6887->3792|6953->3831|7000->3869|7027->3875|7094->3915|7144->3956|7171->3962|7238->4002|7298->4053|7325->4059|7417->4120|7463->4138|7791->4438|7842->4472|7883->4474|7938->4500|7995->4529|8010->4534|8040->4542|8099->4569|8150->4591|8459->4872|8515->4911|8556->4913|8611->4939|8668->4968|8692->4982|8728->4996|8792->5028|8843->5050|8984->5163|9000->5169|9041->5200|9090->5210|9141->5232|9205->5268|9219->5272|9247->5278|9368->5371|9382->5375|9410->5381|9469->5411|9617->5531|9631->5535|9659->5541|9740->5590|9791->5612|10106->5896
                  LINES: 31->1|41->14|41->14|43->14|44->15|44->15|44->15|44->15|45->16|45->16|45->16|46->18|46->18|48->18|49->19|49->19|49->19|49->19|50->20|50->20|50->20|51->22|51->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|57->11|57->11|60->1|62->10|63->13|64->17|65->21|66->26|68->28|68->28|68->28|69->29|70->30|70->30|70->30|70->30|71->31|71->31|71->31|71->31|76->36|76->36|80->40|82->42|82->42|85->45|87->47|87->47|90->50|92->52|92->52|95->55|97->57|98->58|98->58|98->58|99->59|100->60|100->60|100->60|101->61|102->62|103->63|107->67|107->67|112->72|113->73|113->73|118->78|119->79|130->90|130->90|130->90|130->90|131->91|132->92|132->92|132->92|133->93|133->93|133->93|134->94|134->94|134->94|137->97|138->98|150->110|150->110|150->110|151->111|151->111|151->111|151->111|152->112|153->113|157->117|157->117|157->117|158->118|158->118|158->118|158->118|159->119|160->120|166->126|166->126|166->126|166->126|167->127|167->127|167->127|167->127|169->129|169->129|169->129|170->130|171->131|171->131|171->131|173->133|176->136|185->145
                  -- GENERATED --
              */
          