
package femr.ui.views.html.admin.inventory

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

class manage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[femr.common.dtos.CurrentUser,femr.ui.models.admin.inventory.InventoryViewModelGet,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser, viewModel: femr.ui.models.admin.inventory.InventoryViewModelGet):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.controllers.admin.routes.InventoryController
import femr.ui.controllers.admin.routes.TripController
import femr.ui.views.html.layouts.admin
def /*9.6*/additionalStyles/*9.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.26*/("""

        """),format.raw/*11.9*/("""<link rel="stylesheet" href=""""),_display_(/*11.39*/routes/*11.45*/.Assets.versioned("css/libraries/select2.min.css")),format.raw/*11.95*/("""">
        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.versioned("css/libraries/jquery.dataTables.min.css")),format.raw/*12.105*/("""">
        <link rel="stylesheet" href=""""),_display_(/*13.39*/routes/*13.45*/.Assets.versioned("css/admin/inventory.css")),format.raw/*13.89*/("""">
    """)))};def /*15.6*/additionalScripts/*15.23*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*15.27*/("""

        """),format.raw/*17.9*/("""<script type="text/javascript" src=""""),_display_(/*17.46*/routes/*17.52*/.Assets.versioned("js/libraries/select2.min.js")),format.raw/*17.100*/(""""></script>
        <script type = "text/javascript" src=""""),_display_(/*18.48*/routes/*18.54*/.Assets.versioned("js/libraries/jquery.dataTables.min.js")),format.raw/*18.112*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*19.46*/routes/*19.52*/.Assets.versioned("js/libraries/typeahead.bundle.min.js")),format.raw/*19.109*/(""""></script>
        <script type = "text/javascript" src=""""),_display_(/*20.48*/routes/*20.54*/.Assets.versioned("js/admin/inventory.js")),format.raw/*20.96*/(""""></script>
    """)))};
Seq[Any](format.raw/*1.110*/("""

"""),format.raw/*5.1*/("""

"""),format.raw/*8.1*/("""
    """),format.raw/*14.6*/("""
    """),format.raw/*21.6*/("""

"""),_display_(/*23.2*/admin("Inventory", currentUser, styles = additionalStyles, scripts = additionalScripts)/*23.89*/ {_display_(Seq[Any](format.raw/*23.91*/("""

    """),_display_(/*25.6*/if( viewModel.getMissionTripItem == null )/*25.48*/{_display_(Seq[Any](format.raw/*25.49*/("""
        """),format.raw/*26.9*/("""<div class="alert warning">

            <h3>Your account is not assigned to a trip</h3>

            <p>In order to manage your formulary, you must be assigned to a trip. Please assign yourself to a trip before using the inventory feature.</p>

            <a class="fButton" href=""""),_display_(/*32.39*/TripController/*32.53*/.manageGet),format.raw/*32.63*/("""">Manage Trip Users &raquo;</a>
        </div>
    """)))}/*34.7*/else/*34.12*/{_display_(Seq[Any](format.raw/*34.13*/("""
        """),format.raw/*35.9*/("""<span>
        """),_display_(/*36.10*/defining(viewModel.getMissionTripItem)/*36.48*/ { trip =>_display_(Seq[Any](format.raw/*36.58*/("""
            """),format.raw/*37.13*/("""<p>You are viewing the formulary for <b>"""),_display_(/*37.54*/trip/*37.58*/.getTeamName),format.raw/*37.70*/(""", """),_display_(/*37.73*/trip/*37.77*/.getTripCountry),format.raw/*37.92*/(""", """),_display_(/*37.95*/trip/*37.99*/.getFriendlyTripStartDate),format.raw/*37.124*/(""" """),format.raw/*37.125*/("""- """),_display_(/*37.128*/trip/*37.132*/.getFriendlyTripEndDate),format.raw/*37.155*/("""</b></p>
        """)))}),format.raw/*38.10*/("""
        """),format.raw/*39.9*/("""</span>
    """)))}),format.raw/*40.6*/("""

    """),_display_(/*42.6*/helper/*42.12*/.form(action = InventoryController.managePost())/*42.60*/ {_display_(Seq[Any](format.raw/*42.62*/("""

        """),_display_(/*44.10*/if( currentUser.getTripId == null )/*44.45*/{_display_(Seq[Any](format.raw/*44.46*/("""
            """),format.raw/*45.13*/("""<fieldset disabled="disabled">
        """)))}),format.raw/*46.10*/("""
        """),format.raw/*47.9*/("""<h3>Add Existing Medicine To Formulary:</h3>
        <p>-Add medication(s) from the concept dictionary. Adjust current/initial quantity in the Current Formulary section after clicking Submit.</p>
        <select id="addConceptMedicineSelect2" multiple="multiple" name="newConceptMedicationsForInventory[]">
        """),_display_(/*50.10*/defining(viewModel.getConceptMedications)/*50.51*/ { conceptMeds =>_display_(Seq[Any](format.raw/*50.68*/("""
            """),_display_(/*51.14*/for(i <- 1 to conceptMeds.size) yield /*51.45*/ {_display_(Seq[Any](format.raw/*51.47*/("""
                """),format.raw/*52.17*/("""<option value=""""),_display_(/*52.33*/conceptMeds/*52.44*/.get(i - 1).getId),format.raw/*52.61*/("""">"""),_display_(/*52.64*/conceptMeds/*52.75*/.get(i - 1).getFullName),format.raw/*52.98*/("""</option>
            """)))}),format.raw/*53.14*/("""
        """)))}),format.raw/*54.10*/("""
        """),format.raw/*55.9*/("""</select>

        <h3>Add Custom Medicine To Formulary:</h3>
        <p>-Add a new medication that does not exist in the concept dictionary.</p>
        <div class="newMedicationWrap">

            <div class="row">
                <div class="fieldMedication" >
                    <label for="medicationName">Brand</label>
                    <input type="text" class="fInput" id="medicationName" name="medicationName"  placeholder="" />
                </div>

                <div class="fieldMedication">
                    <label for="medicationForm">Form</label>
                    <select name="medicationForm" class="fOption">
                        """),format.raw/*70.77*/("""
                        """),_display_(/*71.26*/for(formIndex <- 1 to viewModel.getAvailableForms.size) yield /*71.81*/ {_display_(Seq[Any](format.raw/*71.83*/("""
                            """),_display_(/*72.30*/defining(viewModel.getAvailableForms.get(formIndex - 1))/*72.86*/ { form =>_display_(Seq[Any](format.raw/*72.96*/("""
                                """),format.raw/*73.33*/("""<option value=""""),_display_(/*73.49*/form),format.raw/*73.53*/("""">"""),_display_(/*73.56*/form),format.raw/*73.60*/("""</option>
                            """)))}),format.raw/*74.30*/("""
                        """)))}),format.raw/*75.26*/("""
                    """),format.raw/*76.21*/("""</select>
                </div>

                <div class="fieldMedication">
                    <label for="medicationQuantity">Quantity</label>
                    <input type="number" class="fInput text" name="medicationQuantity" placeholder="" />
                </div>

            </div>
            <div class="row ingredients">
                <div class="ingredientWrap">

                    <div class="ingredientFields first">

                        <div class="fieldMedication">
                            <label for="medicationIngredient">Generic</label>
                            <input type="text" name="medicationIngredient[]" class="fInput medicationIngredient" placeholder="" />
                        </div>

                        <div class="fieldMedication">
                            <label for="medicationStrength">Strength</label>
                            <input type="number" name="medicationStrength[]" class="fInput medicationsStrength" placeholder="" />
                        </div>

                        <div class="fieldMedication">
                            <label for="medicationUnit">Unit</label>
                            <select name="medicationUnit[]" class="fOption">
                                """),format.raw/*103.76*/("""
                                """),_display_(/*104.34*/for(unitIndex <- 1 to viewModel.getAvailableUnits.size) yield /*104.89*/ {_display_(Seq[Any](format.raw/*104.91*/("""
                                    """),_display_(/*105.38*/defining(viewModel.getAvailableUnits.get(unitIndex - 1))/*105.94*/ { unit =>_display_(Seq[Any](format.raw/*105.104*/("""
                                        """),format.raw/*106.41*/("""<option value=""""),_display_(/*106.57*/unit),format.raw/*106.61*/("""">"""),_display_(/*106.64*/unit),format.raw/*106.68*/("""</option>
                                    """)))}),format.raw/*107.38*/("""
                                """)))}),format.raw/*108.34*/("""
                            """),format.raw/*109.29*/("""</select>
                        </div>

                        <a class="fButton removeIngredient">
                            <span>-</span>
                        </a>

                    </div>

                    <a class="fButton" id="addNewIngredient">
                        <span>+</span>
                    </a>
                </div>
            </div>
            <div class="row">
                <button class="fButton" id="submitMedicationButton">Submit</button>
            </div>

        </div>

        """),_display_(/*129.10*/if( currentUser.getTripId() == null )/*129.47*/{_display_(Seq[Any](format.raw/*129.48*/("""
            """),format.raw/*130.13*/("""</fieldset>
        """)))}),format.raw/*131.10*/("""
    """)))}),format.raw/*132.6*/("""
    
    """),format.raw/*134.5*/("""<div id="currentMedication">
        <h3>Current Formulary:</h3>
        <p>-As medications are dispensed, quantity will be subtracted from the Current Quantity column.</p>
        <div id="currentMedicationsWrap">
            <table id="inventoryTable" class="table">
                <thead>
                    <th>#</th>
                    <th>Medication</th>
                    <th>Current Quantity</th>
                    <th>Initial Quantity</th>
                    <th>Remove</th>
                </thead>
                <tbody>
                """),_display_(/*147.18*/for(m <- 1 to viewModel.getMedications.size) yield /*147.62*/ {_display_(Seq[Any](format.raw/*147.64*/("""
                    """),_display_(/*148.22*/if(viewModel.getMedications.get(m - 1).getIsDeleted == null)/*148.82*/{_display_(Seq[Any](format.raw/*148.83*/("""
                    """),format.raw/*149.21*/("""<tr>
                        <td>"""),_display_(/*150.30*/m),format.raw/*150.31*/("""</td>
                        <td class="name">"""),_display_(/*151.43*/viewModel/*151.52*/.getMedications.get(m - 1).getFullName),format.raw/*151.90*/("""</td>


                        <td class="currentQuantity" value=""""),_display_(/*154.61*/viewModel/*154.70*/.getMedications.get(m-1).getId),format.raw/*154.100*/("""">

                            <span class="editCurrentQuantity" style="display:inline-block;">"""),_display_(/*156.94*/viewModel/*156.103*/.getMedications.get(m - 1).getQuantityCurrent),format.raw/*156.148*/("""</span>
                            <input class="editCurrentInput fInput" style="display:none;" type="number" value=""""),_display_(/*157.112*/viewModel/*157.121*/.getMedications.get(m - 1).getQuantityCurrent),format.raw/*157.166*/("""" />
                            <input type="hidden" class="medication_id" value=""""),_display_(/*158.80*/viewModel/*158.89*/.getMedications.get(m-1).getId),format.raw/*158.119*/("""" />
                            <input type="hidden" class="trip_id" value=""""),_display_(/*159.74*/currentUser/*159.85*/.getTripId),format.raw/*159.95*/("""" />
                            <button type="button" class="btn btn-xs editCurrentQuantityBtn pull-right" style="display:inline-block;" value=""""),_display_(/*160.142*/viewModel/*160.151*/.getMedications.get(m-1).getId),format.raw/*160.181*/(""""><i class="glyphicon glyphicon-edit"></i></button>

                        </td>

                        <td class="totalQuantity" value=""""),_display_(/*164.59*/viewModel/*164.68*/.getMedications.get(m-1).getId),format.raw/*164.98*/("""" >

                            <span class="editTotalQuantity" style="display:inline-block;">"""),_display_(/*166.92*/viewModel/*166.101*/.getMedications.get(m - 1).getQuantityTotal),format.raw/*166.144*/("""</span>
                            <input class="editTotalInput fInput" style="display:none;" type="number" value=""""),_display_(/*167.110*/viewModel/*167.119*/.getMedications.get(m - 1).getQuantityTotal),format.raw/*167.162*/("""" />
                            <input type="hidden" class="medication_id" value=""""),_display_(/*168.80*/viewModel/*168.89*/.getMedications.get(m-1).getId),format.raw/*168.119*/("""" />
                            <input type="hidden" class="trip_id" value=""""),_display_(/*169.74*/currentUser/*169.85*/.getTripId),format.raw/*169.95*/("""" />
                            <button type="button" class="btn btn-xs editTotalQuantityBtn pull-right" style="display:inline-block;" value=""""),_display_(/*170.140*/viewModel/*170.149*/.getMedications.get(m-1).getId),format.raw/*170.179*/(""""><i class="glyphicon glyphicon-edit"></i></button>

                        </td>
                        <td>

                            <button type="button" class="btn btn-danger removeBtn" data-medicationid=""""),_display_(/*175.104*/viewModel/*175.113*/.getMedications.get(m-1).getId),format.raw/*175.143*/("""" data-tripid=""""),_display_(/*175.159*/currentUser/*175.170*/.getTripId),format.raw/*175.180*/("""">Remove</button>

                        </td>
                    </tr>
                    """)))}),format.raw/*179.22*/("""
                """)))}),format.raw/*180.18*/("""
                """),format.raw/*181.17*/("""</tbody>
            </table>
        </div>
    </div>

""")))}))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,viewModel:femr.ui.models.admin.inventory.InventoryViewModelGet): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,viewModel)

  def f:((femr.common.dtos.CurrentUser,femr.ui.models.admin.inventory.InventoryViewModelGet) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,viewModel) => apply(currentUser,viewModel)

  def ref: this.type = this

}


}

/**/
object manage extends manage_Scope0.manage
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:17 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/admin/inventory/manage.scala.html
                  HASH: 396c180b51089835ab1c3a4350618fa673f384a4
                  MATRIX: 846->1|1186->285|1210->301|1290->305|1329->317|1386->347|1401->353|1472->403|1541->445|1556->451|1638->511|1707->553|1722->559|1787->603|1819->619|1845->636|1926->640|1965->652|2029->689|2044->695|2114->743|2201->803|2216->809|2296->867|2381->925|2396->931|2475->988|2562->1048|2577->1054|2640->1096|2698->109|2728->232|2758->278|2791->612|2824->1114|2855->1119|2951->1206|2991->1208|3026->1217|3077->1259|3116->1260|3153->1270|3470->1560|3493->1574|3524->1584|3596->1639|3609->1644|3648->1645|3685->1655|3729->1672|3776->1710|3824->1720|3866->1734|3934->1775|3947->1779|3980->1791|4010->1794|4023->1798|4059->1813|4089->1816|4102->1820|4149->1845|4179->1846|4210->1849|4224->1853|4269->1876|4319->1895|4356->1905|4400->1919|4435->1928|4450->1934|4507->1982|4547->1984|4587->1997|4631->2032|4670->2033|4712->2047|4784->2088|4821->2098|5167->2417|5217->2458|5272->2475|5314->2490|5361->2521|5401->2523|5447->2541|5490->2557|5510->2568|5548->2585|5578->2588|5598->2599|5642->2622|5697->2646|5739->2657|5776->2667|6482->3397|6536->3424|6607->3479|6647->3481|6705->3512|6770->3568|6818->3578|6880->3612|6923->3628|6948->3632|6978->3635|7003->3639|7074->3679|7132->3706|7182->3728|8501->5061|8564->5096|8636->5151|8677->5153|8744->5192|8810->5248|8860->5258|8931->5300|8975->5316|9001->5320|9032->5323|9058->5327|9138->5375|9205->5410|9264->5440|9843->5991|9890->6028|9930->6029|9973->6043|10027->6065|10065->6072|10105->6084|10704->6655|10765->6699|10806->6701|10857->6724|10927->6784|10967->6785|11018->6807|11081->6842|11104->6843|11181->6892|11200->6901|11260->6939|11359->7010|11378->7019|11431->7049|11558->7148|11578->7157|11646->7202|11795->7322|11815->7331|11883->7376|11996->7461|12015->7470|12068->7500|12175->7579|12196->7590|12228->7600|12404->7747|12424->7756|12477->7786|12651->7932|12670->7941|12722->7971|12848->8069|12868->8078|12934->8121|13081->8239|13101->8248|13167->8291|13280->8376|13299->8385|13352->8415|13459->8494|13480->8505|13512->8515|13686->8660|13706->8669|13759->8699|14009->8920|14029->8929|14082->8959|14127->8975|14149->8986|14182->8996|14314->9096|14365->9115|14412->9133
                  LINES: 27->1|33->9|33->9|35->9|37->11|37->11|37->11|37->11|38->12|38->12|38->12|39->13|39->13|39->13|40->15|40->15|42->15|44->17|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|49->1|51->5|53->8|54->14|55->21|57->23|57->23|57->23|59->25|59->25|59->25|60->26|66->32|66->32|66->32|68->34|68->34|68->34|69->35|70->36|70->36|70->36|71->37|71->37|71->37|71->37|71->37|71->37|71->37|71->37|71->37|71->37|71->37|71->37|71->37|71->37|72->38|73->39|74->40|76->42|76->42|76->42|76->42|78->44|78->44|78->44|79->45|80->46|81->47|84->50|84->50|84->50|85->51|85->51|85->51|86->52|86->52|86->52|86->52|86->52|86->52|86->52|87->53|88->54|89->55|104->70|105->71|105->71|105->71|106->72|106->72|106->72|107->73|107->73|107->73|107->73|107->73|108->74|109->75|110->76|137->103|138->104|138->104|138->104|139->105|139->105|139->105|140->106|140->106|140->106|140->106|140->106|141->107|142->108|143->109|163->129|163->129|163->129|164->130|165->131|166->132|168->134|181->147|181->147|181->147|182->148|182->148|182->148|183->149|184->150|184->150|185->151|185->151|185->151|188->154|188->154|188->154|190->156|190->156|190->156|191->157|191->157|191->157|192->158|192->158|192->158|193->159|193->159|193->159|194->160|194->160|194->160|198->164|198->164|198->164|200->166|200->166|200->166|201->167|201->167|201->167|202->168|202->168|202->168|203->169|203->169|203->169|204->170|204->170|204->170|209->175|209->175|209->175|209->175|209->175|209->175|213->179|214->180|215->181
                  -- GENERATED --
              */
          