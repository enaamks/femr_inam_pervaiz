
package femr.ui.views.html.admin.configure

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

class manage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[femr.common.dtos.CurrentUser,femr.ui.models.admin.configure.IndexViewModelGet,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser, viewModel: femr.ui.models.admin.configure.IndexViewModelGet):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.controllers.admin.routes.ConfigureController
import femr.ui.views.html.layouts.admin
def /*6.6*/additionalStyles/*6.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.26*/("""
        """),format.raw/*7.9*/("""<link rel="stylesheet" href=""""),_display_(/*7.39*/routes/*7.45*/.Assets.versioned("css/admin/configure.css")),format.raw/*7.89*/("""">
    """)))};
Seq[Any](format.raw/*1.106*/("""

"""),format.raw/*5.1*/("""
    """),format.raw/*8.6*/("""

"""),_display_(/*10.2*/admin("Configure", currentUser, styles = additionalStyles)/*10.60*/ {_display_(Seq[Any](format.raw/*10.62*/("""
    """),_display_(/*11.6*/helper/*11.12*/.form(action = ConfigureController.managePost())/*11.60*/ {_display_(Seq[Any](format.raw/*11.62*/("""
        """),format.raw/*12.9*/("""<table id="configurationTable">
            <tr>
                <th>Feature</th>
                <th>Toggle</th>
            </tr>

            """),_display_(/*18.14*/for((key, valyew) <- viewModel.getSettings) yield /*18.57*/ {_display_(Seq[Any](format.raw/*18.59*/("""
                """),format.raw/*19.17*/("""<tr>
                    <td class="name">"""),_display_(/*20.39*/key),format.raw/*20.42*/("""</td>
                    <td class="isActive">
                        <input type="checkbox" name="settings[]" value=""""),_display_(/*22.74*/key),format.raw/*22.77*/("""" """),_display_(/*22.80*/if(valyew)/*22.90*/ {_display_(Seq[Any](format.raw/*22.92*/(""" """),format.raw/*22.93*/("""checked="checked"""")))}),format.raw/*22.111*/(""" """),format.raw/*22.112*/("""/>
                    </td>
                </tr>
            """)))}),format.raw/*25.14*/("""

        """),format.raw/*27.9*/("""</table>

        <input type="submit" class="fButton" value="Save"/>
    """)))}),format.raw/*30.6*/("""

""")))}))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,viewModel:femr.ui.models.admin.configure.IndexViewModelGet): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,viewModel)

  def f:((femr.common.dtos.CurrentUser,femr.ui.models.admin.configure.IndexViewModelGet) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,viewModel) => apply(currentUser,viewModel)

  def ref: this.type = this

}


}

/**/
object manage extends manage_Scope0.manage
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/admin/configure/manage.scala.html
                  HASH: 7a2cf2bcb773d47fd93c185c3a8d01bad2896707
                  MATRIX: 842->1|1123->220|1147->236|1227->240|1263->250|1319->280|1333->286|1397->330|1446->105|1476->213|1508->339|1539->344|1606->402|1646->404|1679->411|1694->417|1751->465|1791->467|1828->477|2007->629|2066->672|2106->674|2152->692|2223->736|2247->739|2397->862|2421->865|2451->868|2470->878|2510->880|2539->881|2589->899|2619->900|2717->967|2756->979|2864->1057
                  LINES: 27->1|32->6|32->6|34->6|35->7|35->7|35->7|35->7|37->1|39->5|40->8|42->10|42->10|42->10|43->11|43->11|43->11|43->11|44->12|50->18|50->18|50->18|51->19|52->20|52->20|54->22|54->22|54->22|54->22|54->22|54->22|54->22|54->22|57->25|59->27|62->30
                  -- GENERATED --
              */
          