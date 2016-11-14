
package femr.ui.views.html.partials

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object authenticated_Scope0 {
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

class authenticated extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[femr.common.dtos.CurrentUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.partials.helpers.AuthenticatedPartialHelper
import femr.ui.controllers.routes.HomeController
import femr.ui.controllers.routes.SessionsController
import femr.ui.controllers.routes.TriageController
import femr.ui.controllers.routes.MedicalController
import femr.ui.controllers.routes.PharmaciesController
import femr.ui.controllers.superuser.routes.SuperuserController
import femr.ui.controllers.admin.routes.AdminController
import femr.ui.controllers.routes.ResearchController
import femr.ui.controllers.routes.ReferenceController

Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*13.1*/("""<div class="navigationLogo">
    <a href=""""),_display_(/*14.15*/HomeController/*14.29*/.index()),format.raw/*14.37*/("""">
        <img src=""""),_display_(/*15.20*/routes/*15.26*/.Assets.versioned("img/logo_color_wordless_sm.png")),format.raw/*15.77*/("""" />
    </a>
</div>


<div class="smallNavigationItemsWrap">
        <div class="hamburger">
            <div></div>
            <div></div>
            <div></div>
        </div>
</div>



<div class="navigationItemsWrap">
    <ul class="navigationItems">
        """),_display_(/*32.10*/if(AuthenticatedPartialHelper.showMedicalPersonnelMenu(currentUser.getRoles))/*32.87*/ {_display_(Seq[Any](format.raw/*32.89*/("""
            """),format.raw/*33.13*/("""<li><a href=""""),_display_(/*33.27*/TriageController/*33.43*/.indexGet()),format.raw/*33.54*/("""">Triage</a></li>
            <li><a href=""""),_display_(/*34.27*/MedicalController/*34.44*/.indexGet()),format.raw/*34.55*/("""">Medical</a></li>
            <li><a href=""""),_display_(/*35.27*/PharmaciesController/*35.47*/.indexGet()),format.raw/*35.58*/("""">Pharmacy</a></li>
        """)))}),format.raw/*36.10*/("""
        """),_display_(/*37.10*/if(AuthenticatedPartialHelper.showResearcherMenu(currentUser.getRoles))/*37.81*/ {_display_(Seq[Any](format.raw/*37.83*/("""
            """),format.raw/*38.13*/("""<li><a href=""""),_display_(/*38.27*/ResearchController/*38.45*/.indexGet()),format.raw/*38.56*/("""">Research</a></li>
        """)))}),format.raw/*39.10*/("""
        """),_display_(/*40.10*/if(AuthenticatedPartialHelper.showAdminMenu(currentUser.getRoles) && !AuthenticatedPartialHelper.showSuperUserMenu(currentUser.getRoles))/*40.147*/ {_display_(Seq[Any](format.raw/*40.149*/("""
            """),format.raw/*41.13*/("""<li><a href=""""),_display_(/*41.27*/AdminController/*41.42*/.index()),format.raw/*41.50*/("""">Admin</a></li>
        """)))}),format.raw/*42.10*/("""
        """),_display_(/*43.10*/if(AuthenticatedPartialHelper.showSuperUserMenu(currentUser.getRoles))/*43.80*/ {_display_(Seq[Any](format.raw/*43.82*/("""
            """),format.raw/*44.13*/("""<li><a href=""""),_display_(/*44.27*/SuperuserController/*44.46*/.indexGet()),format.raw/*44.57*/("""">SuperUser</a></li>
        """)))}),format.raw/*45.10*/("""
        """),format.raw/*46.9*/("""<li><a href=""""),_display_(/*46.23*/ReferenceController/*46.42*/.indexGet()),format.raw/*46.53*/("""" class="glyphicon glyphicon-list-alt reference" target="_blank"><span>Reference</span></a></li>
    </ul>
    <p class="userStatus">


        Signed in as """),_display_(/*51.23*/currentUser/*51.34*/.getFirstName),format.raw/*51.47*/(""" """),_display_(/*51.49*/currentUser/*51.60*/.getLastName),format.raw/*51.72*/("""
        """),format.raw/*52.9*/("""<a href=""""),_display_(/*52.19*/SessionsController/*52.37*/.delete()),format.raw/*52.46*/("""">
            <span class="glyphicon glyphicon-log-out"></span>
        </a>
    </p>
</div>
"""))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser): play.twirl.api.HtmlFormat.Appendable = apply(currentUser)

  def f:((femr.common.dtos.CurrentUser) => play.twirl.api.HtmlFormat.Appendable) = (currentUser) => apply(currentUser)

  def ref: this.type = this

}


}

/**/
object authenticated extends authenticated_Scope0.authenticated
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:21 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/authenticated.scala.html
                  HASH: ca4aaac8b81eae1e3ed179b4e5418fec7806f618
                  MATRIX: 800->1|1489->44|1520->620|1591->664|1614->678|1643->686|1693->709|1708->715|1780->766|2091->1050|2177->1127|2217->1129|2259->1143|2300->1157|2325->1173|2357->1184|2429->1229|2455->1246|2487->1257|2560->1303|2589->1323|2621->1334|2682->1364|2720->1375|2800->1446|2840->1448|2882->1462|2923->1476|2950->1494|2982->1505|3043->1535|3081->1546|3228->1683|3269->1685|3311->1699|3352->1713|3376->1728|3405->1736|3463->1763|3501->1774|3580->1844|3620->1846|3662->1860|3703->1874|3731->1893|3763->1904|3825->1935|3862->1945|3903->1959|3931->1978|3963->1989|4153->2152|4173->2163|4207->2176|4236->2178|4256->2189|4289->2201|4326->2211|4363->2221|4390->2239|4420->2248
                  LINES: 27->1|41->1|43->13|44->14|44->14|44->14|45->15|45->15|45->15|62->32|62->32|62->32|63->33|63->33|63->33|63->33|64->34|64->34|64->34|65->35|65->35|65->35|66->36|67->37|67->37|67->37|68->38|68->38|68->38|68->38|69->39|70->40|70->40|70->40|71->41|71->41|71->41|71->41|72->42|73->43|73->43|73->43|74->44|74->44|74->44|74->44|75->45|76->46|76->46|76->46|76->46|81->51|81->51|81->51|81->51|81->51|81->51|82->52|82->52|82->52|82->52
                  -- GENERATED --
              */
          