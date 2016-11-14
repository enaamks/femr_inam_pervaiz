
package femr.ui.views.html.superuser.tabs

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object fields_Scope0 {
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

class fields extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[femr.common.dtos.CurrentUser,femr.ui.models.superuser.ContentViewModelGet,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser, viewModel: femr.ui.models.superuser.ContentViewModelGet):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.layouts.admin
import femr.ui.controllers.superuser.routes.TabController
def /*6.6*/additionalStyles/*6.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.26*/("""
        """),format.raw/*7.9*/("""<link rel="stylesheet" href=""""),_display_(/*7.39*/routes/*7.45*/.Assets.versioned("css/superuser/superuser.css")),format.raw/*7.93*/("""">
    """)))};
Seq[Any](format.raw/*1.102*/("""

"""),format.raw/*5.1*/("""
    """),format.raw/*8.6*/("""

"""),_display_(/*10.2*/admin("Add Fields", currentUser, styles = additionalStyles)/*10.61*/ {_display_(Seq[Any](format.raw/*10.63*/("""
    """),format.raw/*11.5*/("""<h1>Adding content to """),_display_(/*11.28*/viewModel/*11.37*/.getName),format.raw/*11.45*/("""</h1>
    <div id="superUserWrap">
        <div class="halfPageTables">

            <h3>Current Fields</h3>
            <table>
                <thead>
                    <tr>
                        <th>Label</th>
                        <th>Type</th>
                        <th>Size</th>
                        <th>Order</th>
                        <th>Placeholder</th>
                    </tr>
                </thead>
                <tbody>

                """),_display_(/*28.18*/for(f <- 1 to viewModel.getCurrentCustomFieldItemList.size) yield /*28.77*/ {_display_(Seq[Any](format.raw/*28.79*/("""
                    """),_display_(/*29.22*/defining(viewModel.getCurrentCustomFieldItemList.get(f - 1))/*29.82*/ { currentField =>_display_(Seq[Any](format.raw/*29.100*/("""
                        """),format.raw/*30.25*/("""<tr>
                            <td>"""),_display_(/*31.34*/currentField/*31.46*/.getName),format.raw/*31.54*/("""</td>
                            <td>"""),_display_(/*32.34*/currentField/*32.46*/.getType),format.raw/*32.54*/("""</td>
                            <td>"""),_display_(/*33.34*/currentField/*33.46*/.getSize),format.raw/*33.54*/("""</td>
                            <td>"""),_display_(/*34.34*/currentField/*34.46*/.getOrder),format.raw/*34.55*/("""</td>
                            <td>"""),_display_(/*35.34*/currentField/*35.46*/.getPlaceholder),format.raw/*35.61*/("""</td>
                        </tr>
                    """)))}),format.raw/*37.22*/("""

                """)))}),format.raw/*39.18*/("""

                """),format.raw/*41.17*/("""</tbody>
            </table>
        </div>
        <div class="halfPageTables">
            <h3>Deleted Fields</h3>
            <table>
                <thead>
                    <tr>
                        <th>Field Label</th>
                        <th>Field Type</th>
                        <th>Field Size</th>
                    </tr>
                </thead>
                <tbody>

                """),_display_(/*56.18*/for(f <- 1 to viewModel.getRemovedCustomFieldItemList.size) yield /*56.77*/ {_display_(Seq[Any](format.raw/*56.79*/("""
                    """),_display_(/*57.22*/defining(viewModel.getRemovedCustomFieldItemList.get(f - 1))/*57.82*/ { removedField =>_display_(Seq[Any](format.raw/*57.100*/("""
                        """),format.raw/*58.25*/("""<tr>
                            <td>"""),_display_(/*59.34*/removedField/*59.46*/.getName),format.raw/*59.54*/("""</td>
                            <td>"""),_display_(/*60.34*/removedField/*60.46*/.getType),format.raw/*60.54*/("""</td>
                            <td>"""),_display_(/*61.34*/removedField/*61.46*/.getSize),format.raw/*61.54*/("""</td>
                        </tr>
                    """)))}),format.raw/*63.22*/("""
                """)))}),format.raw/*64.18*/("""

                """),format.raw/*66.17*/("""</tbody>
            </table>

        </div>

    </div>

    <div id="bottomFields">
    """),_display_(/*74.6*/helper/*74.12*/.form(action = TabController.fieldsPost(viewModel.getName))/*74.71*/ {_display_(Seq[Any](format.raw/*74.73*/("""
        """),format.raw/*75.9*/("""<div class="halfPageForms">
            <h4>Add/Edit Field</h4>
            <label for="addName">Name:</label>
            <input type="text" class="fInput" name="addName" placeholder="Label"/>
            <br/>
            <label for="addType">Type:</label>
            """),format.raw/*81.86*/("""
            """),format.raw/*82.13*/("""<select name="addType" class="fOption">
            """),_display_(/*83.14*/for(t <- 1 to viewModel.getCustomFieldTypes.size) yield /*83.63*/ {_display_(Seq[Any](format.raw/*83.65*/("""
                """),format.raw/*84.17*/("""<option value=""""),_display_(/*84.33*/viewModel/*84.42*/.getCustomFieldTypes.get(t - 1)),format.raw/*84.73*/("""">"""),_display_(/*84.76*/viewModel/*84.85*/.getCustomFieldTypes.get(t - 1)),format.raw/*84.116*/("""</option>
            """)))}),format.raw/*85.14*/("""
            """),format.raw/*86.13*/("""</select>

            <br/>
            <label for="addSize">Size:</label>
            """),format.raw/*90.86*/("""
            """),format.raw/*91.13*/("""<select name="addSize" class="fOption">
            """),_display_(/*92.14*/for(s <- 1 to viewModel.getCustomFieldSizes.size) yield /*92.63*/ {_display_(Seq[Any](format.raw/*92.65*/("""
                """),format.raw/*93.17*/("""<option value=""""),_display_(/*93.33*/viewModel/*93.42*/.getCustomFieldSizes.get(s - 1)),format.raw/*93.73*/("""">"""),_display_(/*93.76*/viewModel/*93.85*/.getCustomFieldSizes.get(s - 1)),format.raw/*93.116*/("""</option>
            """)))}),format.raw/*94.14*/("""
            """),format.raw/*95.13*/("""</select>
            <br/>
            <label for="addOrder">Order:</label>
            <input type="number" class="fInput" name="addOrder" placeholder="Order"/>
            <br/>
            <label for="addPlaceholder">Placeholder:</label>
            <input type="text" class="fInput" name="addPlaceholder" placeholder="Placeholder"/>
        </div>
        <div class="halfPageForms">
            <h4>Toggle Field</h4>
            <p>Activate or Deactivate a field by name</p>
            <label for="toggleName">Name</label>
            <input type="text" class="fInput" name="toggleName"/>
            <br/>

        </div>

    </div>
    <button type="submit" class="fButton" id="contentSubmit">Submit</button>
""")))}),format.raw/*114.2*/("""

""")))}))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,viewModel:femr.ui.models.superuser.ContentViewModelGet): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,viewModel)

  def f:((femr.common.dtos.CurrentUser,femr.ui.models.superuser.ContentViewModelGet) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,viewModel) => apply(currentUser,viewModel)

  def ref: this.type = this

}


}

/**/
object fields extends fields_Scope0.fields
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:21 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/superuser/tabs/fields.scala.html
                  HASH: 450c10019ee9ddb2e9a7f16eb2c24b666094221a
                  MATRIX: 837->1|1112->214|1136->230|1216->234|1252->244|1308->274|1322->280|1390->328|1439->101|1469->207|1501->337|1532->342|1600->401|1640->403|1673->409|1723->432|1741->441|1770->449|2284->936|2359->995|2399->997|2449->1020|2518->1080|2575->1098|2629->1124|2695->1163|2716->1175|2745->1183|2812->1223|2833->1235|2862->1243|2929->1283|2950->1295|2979->1303|3046->1343|3067->1355|3097->1364|3164->1404|3185->1416|3221->1431|3311->1490|3363->1511|3411->1531|3866->1959|3941->2018|3981->2020|4031->2043|4100->2103|4157->2121|4211->2147|4277->2186|4298->2198|4327->2206|4394->2246|4415->2258|4444->2266|4511->2306|4532->2318|4561->2326|4651->2385|4701->2404|4749->2424|4875->2524|4890->2530|4958->2589|4998->2591|5035->2601|5340->2951|5382->2965|5463->3019|5528->3068|5568->3070|5614->3088|5657->3104|5675->3113|5727->3144|5757->3147|5775->3156|5828->3187|5883->3211|5925->3225|6045->3390|6087->3404|6168->3458|6233->3507|6273->3509|6319->3527|6362->3543|6380->3552|6432->3583|6462->3586|6480->3595|6533->3626|6588->3650|6630->3664|7400->4403
                  LINES: 27->1|32->6|32->6|34->6|35->7|35->7|35->7|35->7|37->1|39->5|40->8|42->10|42->10|42->10|43->11|43->11|43->11|43->11|60->28|60->28|60->28|61->29|61->29|61->29|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|69->37|71->39|73->41|88->56|88->56|88->56|89->57|89->57|89->57|90->58|91->59|91->59|91->59|92->60|92->60|92->60|93->61|93->61|93->61|95->63|96->64|98->66|106->74|106->74|106->74|106->74|107->75|113->81|114->82|115->83|115->83|115->83|116->84|116->84|116->84|116->84|116->84|116->84|116->84|117->85|118->86|122->90|123->91|124->92|124->92|124->92|125->93|125->93|125->93|125->93|125->93|125->93|125->93|126->94|127->95|146->114
                  -- GENERATED --
              */
          