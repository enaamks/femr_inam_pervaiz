
package femr.ui.views.html.superuser.tabs

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

class manage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[femr.common.dtos.CurrentUser,femr.ui.models.superuser.TabsViewModelGet,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser, viewModel: femr.ui.models.superuser.TabsViewModelGet):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.layouts.admin
import femr.ui.controllers.superuser.routes.TabController
def /*6.2*/additionalStyles/*6.18*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.22*/("""
    """),format.raw/*7.5*/("""<link rel="stylesheet" href=""""),_display_(/*7.35*/routes/*7.41*/.Assets.versioned("css/superuser/superuser.css")),format.raw/*7.89*/("""">
""")))};
Seq[Any](format.raw/*1.99*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(/*10.2*/admin("Tabs", currentUser, styles = additionalStyles)/*10.55*/ {_display_(Seq[Any](format.raw/*10.57*/("""
    """),format.raw/*11.5*/("""<h1>Tabs</h1>
    <p>Do not put spaces in Tab Names.</p>
    <div id="superUserWrap">
        <div class="halfPageTables">
            <h3>Current Custom Medical Tabs:</h3>
            <table>
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Left Size</th>
                        <th>Right Size</th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*25.18*/for(x <- 1 to viewModel.getCurrentTabs.size) yield /*25.62*/ {_display_(Seq[Any](format.raw/*25.64*/("""
                    """),format.raw/*26.21*/("""<tr>

                    """),_display_(/*28.22*/defining(viewModel.getCurrentTabs.get(x - 1))/*28.67*/ { currentTab =>_display_(Seq[Any](format.raw/*28.83*/("""
                        """),format.raw/*29.25*/("""<td><a href="/superuser/tabs/"""),_display_(/*29.55*/currentTab/*29.65*/.getName),format.raw/*29.73*/("""">"""),_display_(/*29.76*/currentTab/*29.86*/.getName),format.raw/*29.94*/("""</a></td>
                        <td>"""),_display_(/*30.30*/currentTab/*30.40*/.getLeftColumnSize),format.raw/*30.58*/("""</td>
                        <td>"""),_display_(/*31.30*/currentTab/*31.40*/.getRightColumnSize),format.raw/*31.59*/("""</td>
                    """)))}),format.raw/*32.22*/("""
                    """),format.raw/*33.21*/("""</tr>
                """)))}),format.raw/*34.18*/("""

                """),format.raw/*36.17*/("""</tbody>
            </table>
        </div>
        <div class="halfPageTables">
            <h3>Deleted Custom Medical Tabs:</h3>
            <table>
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Left Size</th>
                        <th>Right Size</th>
                    </tr>
                </thead>
                <tbody>

                """),_display_(/*51.18*/for(x <- 1 to viewModel.getDeletedTabs.size) yield /*51.62*/ {_display_(Seq[Any](format.raw/*51.64*/("""
                    """),format.raw/*52.21*/("""<tr>

                    """),_display_(/*54.22*/defining(viewModel.getDeletedTabs.get(x - 1))/*54.67*/ { deletedTab =>_display_(Seq[Any](format.raw/*54.83*/("""
                        """),format.raw/*55.25*/("""<td><a href="/superuser/tabs/"""),_display_(/*55.55*/deletedTab/*55.65*/.getName),format.raw/*55.73*/("""">"""),_display_(/*55.76*/deletedTab/*55.86*/.getName),format.raw/*55.94*/("""</a></td>
                        <td>"""),_display_(/*56.30*/deletedTab/*56.40*/.getLeftColumnSize),format.raw/*56.58*/("""</td>
                        <td>"""),_display_(/*57.30*/deletedTab/*57.40*/.getRightColumnSize),format.raw/*57.59*/("""</td>

                    """)))}),format.raw/*59.22*/("""

                    """),format.raw/*61.21*/("""</tr>
                """)))}),format.raw/*62.18*/("""


                """),format.raw/*65.17*/("""</tbody>
            </table>
        </div>

    </div>

    <div id="bottomFields">
    """),_display_(/*72.6*/helper/*72.12*/.form(action = TabController.managePost())/*72.54*/ {_display_(Seq[Any](format.raw/*72.56*/("""
        """),format.raw/*73.9*/("""<div class="halfPageForms">
            <h4>Add Tab:</h4>
            <label for="addTabName">Name</label>
            <input type="text" class="fInput" name="addTabName"/>
            <br/>
            <label for="addTabLeft">Left Tab</label>
            <input type="number" class="fInput" name="addTabLeft"/>
            <br/>
            <label for="addTabRight">Right Tab</label>
            <input type="number" class="fInput" name="addTabRight"/>
        </div>
        <div class="halfPageForms">
            <h4>Toggle Tab:</h4>
            <input type="text" class="fInput" name="deleteTab"/>
            <br/>

        </div>

    </div>
    <button type="submit" class="fButton" id="contentSubmit">Submit</button>


""")))}),format.raw/*95.2*/("""

""")))}),format.raw/*97.2*/("""
"""))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,viewModel:femr.ui.models.superuser.TabsViewModelGet): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,viewModel)

  def f:((femr.common.dtos.CurrentUser,femr.ui.models.superuser.TabsViewModelGet) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,viewModel) => apply(currentUser,viewModel)

  def ref: this.type = this

}


}

/**/
object manage extends manage_Scope0.manage
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:20 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/superuser/tabs/manage.scala.html
                  HASH: f78fee77fa61b043f34a225d5b612fa0d5287b66
                  MATRIX: 834->1|1106->207|1130->223|1210->227|1242->233|1298->263|1312->269|1380->317|1424->98|1454->204|1482->322|1513->327|1575->380|1615->382|1648->388|2148->861|2208->905|2248->907|2298->929|2354->958|2408->1003|2462->1019|2516->1045|2573->1075|2592->1085|2621->1093|2651->1096|2670->1106|2699->1114|2766->1154|2785->1164|2824->1182|2887->1218|2906->1228|2946->1247|3005->1275|3055->1297|3110->1321|3158->1341|3619->1775|3679->1819|3719->1821|3769->1843|3825->1872|3879->1917|3933->1933|3987->1959|4044->1989|4063->1999|4092->2007|4122->2010|4141->2020|4170->2028|4237->2068|4256->2078|4295->2096|4358->2132|4377->2142|4417->2161|4478->2191|4530->2215|4585->2239|4635->2261|4759->2359|4774->2365|4825->2407|4865->2409|4902->2419|5683->3170|5718->3175
                  LINES: 27->1|32->6|32->6|34->6|35->7|35->7|35->7|35->7|37->1|39->5|40->8|42->10|42->10|42->10|43->11|57->25|57->25|57->25|58->26|60->28|60->28|60->28|61->29|61->29|61->29|61->29|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|65->33|66->34|68->36|83->51|83->51|83->51|84->52|86->54|86->54|86->54|87->55|87->55|87->55|87->55|87->55|87->55|87->55|88->56|88->56|88->56|89->57|89->57|89->57|91->59|93->61|94->62|97->65|104->72|104->72|104->72|104->72|105->73|127->95|129->97
                  -- GENERATED --
              */
          