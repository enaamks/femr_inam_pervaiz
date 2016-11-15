
package femr.ui.views.html.partials.admin.trips

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object tripsMenu_Scope0 {
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

     object tripsMenu_Scope1 {
import femr.ui.controllers.admin.routes.TripController

class tripsMenu extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<div class="tripOptionsWrap">
    <a href=""""),_display_(/*4.15*/TripController/*4.29*/.manageGet()),format.raw/*4.41*/("""" class="fButton fOtherButton fAdminButton userBtns"><span class="glyphicon glyphicon-plus-sign"></span>
        Manage Trips</a>
    <a href=""""),_display_(/*6.15*/TripController/*6.29*/.teamsGet()),format.raw/*6.40*/("""" class="fButton fOtherButton fAdminButton userBtns"><span class="glyphicon glyphicon-plus-sign"></span>
        Manage Teams</a>
    <a href=""""),_display_(/*8.15*/TripController/*8.29*/.citiesGet()),format.raw/*8.41*/("""" class="fButton fOtherButton fAdminButton userBtns"><span class="glyphicon glyphicon-plus-sign"></span>
        Manage Cities</a>
</div>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}
}

/**/
object tripsMenu extends tripsMenu_Scope0.tripsMenu_Scope1.tripsMenu
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:18 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/admin/trips/tripsMenu.scala.html
                  HASH: 30a0e19f1cc9c5233045c82966977b02b037e925
                  MATRIX: 951->59|1022->104|1044->118|1076->130|1248->276|1270->290|1301->301|1473->447|1495->461|1527->473
                  LINES: 35->3|36->4|36->4|36->4|38->6|38->6|38->6|40->8|40->8|40->8
                  -- GENERATED --
              */
          