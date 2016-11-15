
package femr.ui.views.html.layouts

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object admin_Scope0 {
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

class admin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[String,femr.common.dtos.CurrentUser,Html,Html,Html,Html,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String,
        currentUser: femr.common.dtos.CurrentUser,
        styles: Html = Html(""),
        scripts: Html = Html(""),
        message: Html = Html(""),
        outsideContainerTop: Html = Html(""),
        outsideContainerBottom: Html = Html(""))(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.layouts.main
import femr.ui.controllers.admin.routes.UsersController
import femr.ui.controllers.admin.routes.ConfigureController
import femr.ui.controllers.admin.routes.InventoryController
import femr.ui.controllers.superuser.routes.SuperuserController
import femr.ui.controllers.superuser.routes.TabController
import femr.ui.controllers.admin.routes.TripController
def /*18.6*/adminScripts/*18.18*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*18.22*/("""
        """),format.raw/*19.9*/("""<script type = "text/javascript" src=""""),_display_(/*19.48*/routes/*19.54*/.Assets.versioned("js/admin/admin.js")),format.raw/*19.92*/(""""></script>
        <script type = "text/javascript" src=""""),_display_(/*20.48*/routes/*20.54*/.Assets.versioned("js/libraries/jquery-ui.min.js")),format.raw/*20.104*/(""""></script>
        """),_display_(/*21.10*/scripts),format.raw/*21.17*/("""
    """)))};def /*23.6*/adminStyles/*23.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*23.21*/("""
        """),format.raw/*24.9*/("""<link rel="stylesheet" href=""""),_display_(/*24.39*/routes/*24.45*/.Assets.versioned("css/libraries/jquery-ui.min.css")),format.raw/*24.97*/("""">
        <link rel="stylesheet" href=""""),_display_(/*25.39*/routes/*25.45*/.Assets.versioned("css/admin/admin.css")),format.raw/*25.85*/("""">
        """),_display_(/*26.10*/styles),format.raw/*26.16*/("""
    """)))};
Seq[Any](format.raw/*7.64*/("""

"""),format.raw/*16.1*/("""
        """),format.raw/*17.51*/("""
    """),format.raw/*22.6*/("""
    """),format.raw/*27.6*/("""

"""),_display_(/*29.2*/main(title, currentUser, adminStyles, adminScripts)/*29.53*/ {_display_(Seq[Any](format.raw/*29.55*/("""
    """),format.raw/*30.5*/("""<div id="admin-panels">
        <div id="admin-left-panel">
            <a href=""""),_display_(/*32.23*/ConfigureController/*32.42*/.manageGet()),format.raw/*32.54*/("""" class="fButton fOtherButton fAdminButton userBtns"><span class="glyphicon glyphicon-cog"></span>
                Configure</a>
            <a href=""""),_display_(/*34.23*/InventoryController/*34.42*/.manageGet()),format.raw/*34.54*/("""" class="fButton fOtherButton fAdminButton userBtns"><span class="glyphicon glyphicon-briefcase"></span>
                Inventory</a>
            <a href=""""),_display_(/*36.23*/TripController/*36.37*/.manageGet()),format.raw/*36.49*/("""" class="fButton userBtns fOtherButton fAdminButton"><span class="glyphicon glyphicon-globe"></span>
                Trips</a>
            """),_display_(/*38.14*/if(currentUser.getEmail == "superuser")/*38.53*/{_display_(Seq[Any](format.raw/*38.54*/("""
                """),format.raw/*39.17*/("""<a href=""""),_display_(/*39.27*/TabController/*39.40*/.manageGet()),format.raw/*39.52*/("""" class="fButton userBtns fOtherButton fAdminButton"><span class="glyphicon glyphicon-wrench"></span>
                    Tabs</a>

            """)))}),format.raw/*42.14*/("""
            """),format.raw/*43.13*/("""<a href=""""),_display_(/*43.23*/UsersController/*43.38*/.manageGet()),format.raw/*43.50*/("""" class="fButton fOtherButton fAdminButton userBtns"><span class="glyphicon glyphicon-user"></span>
                Users</a>
        </div>
        <div id="admin-right-panel">
            <div id="title">
                <h2>"""),_display_(/*48.22*/title),format.raw/*48.27*/("""</h2>
            </div>
            """),_display_(/*50.14*/message),format.raw/*50.21*/("""
            """),format.raw/*51.13*/("""<div id="adminContent">
            """),_display_(/*52.14*/content),format.raw/*52.21*/("""
            """),format.raw/*53.13*/("""</div>

        </div>
    </div>

""")))}),format.raw/*58.2*/("""
"""))
      }
    }
  }

  def render(title:String,currentUser:femr.common.dtos.CurrentUser,styles:Html,scripts:Html,message:Html,outsideContainerTop:Html,outsideContainerBottom:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,currentUser,styles,scripts,message,outsideContainerTop,outsideContainerBottom)(content)

  def f:((String,femr.common.dtos.CurrentUser,Html,Html,Html,Html,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,currentUser,styles,scripts,message,outsideContainerTop,outsideContainerBottom) => (content) => apply(title,currentUser,styles,scripts,message,outsideContainerTop,outsideContainerBottom)(content)

  def ref: this.type = this

}


}

/**/
object admin extends admin_Scope0.admin
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:18 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/layouts/admin.scala.html
                  HASH: dad667befe905b6a554088a22ee33d5b37fd4c60
                  MATRIX: 820->1|1573->753|1594->765|1675->769|1712->779|1778->818|1793->824|1852->862|1939->922|1954->928|2026->978|2075->1000|2103->1007|2133->1021|2153->1032|2234->1036|2271->1046|2328->1076|2343->1082|2416->1134|2485->1176|2500->1182|2561->1222|2601->1235|2628->1241|2674->284|2705->694|2743->746|2776->1014|2809->1248|2840->1253|2900->1304|2940->1306|2973->1312|3084->1396|3112->1415|3145->1427|3325->1580|3353->1599|3386->1611|3572->1770|3595->1784|3628->1796|3797->1938|3845->1977|3884->1978|3930->1996|3967->2006|3989->2019|4022->2031|4201->2179|4243->2193|4280->2203|4304->2218|4337->2230|4597->2463|4623->2468|4690->2508|4718->2515|4760->2529|4825->2567|4853->2574|4895->2588|4966->2629
                  LINES: 27->1|43->18|43->18|45->18|46->19|46->19|46->19|46->19|47->20|47->20|47->20|48->21|48->21|49->23|49->23|51->23|52->24|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|56->7|58->16|59->17|60->22|61->27|63->29|63->29|63->29|64->30|66->32|66->32|66->32|68->34|68->34|68->34|70->36|70->36|70->36|72->38|72->38|72->38|73->39|73->39|73->39|73->39|76->42|77->43|77->43|77->43|77->43|82->48|82->48|84->50|84->50|85->51|86->52|86->52|87->53|92->58
                  -- GENERATED --
              */
          