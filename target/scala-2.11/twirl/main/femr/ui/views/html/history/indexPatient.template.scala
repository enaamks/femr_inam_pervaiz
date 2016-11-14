
package femr.ui.views.html.history

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object indexPatient_Scope0 {
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

     object indexPatient_Scope1 {
import femr.ui.controllers.HistoryController

class indexPatient extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[femr.common.dtos.CurrentUser,java.lang.Boolean,femr.ui.models.history.IndexPatientViewModelGet,List[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: femr.common.models.PatientEncounterItem
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(currentUser: femr.common.dtos.CurrentUser, searchError: java.lang.Boolean, viewModel: femr.ui.models.history.IndexPatientViewModelGet, patientEncounters: List[_ <: femr.common.models.PatientEncounterItem]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.layouts.main
import femr.ui.views.html.partials.search
import femr.ui.controllers.routes.MedicalController
import femr.ui.controllers.routes.PharmaciesController
import femr.ui.controllers.routes.TriageController
import femr.data.models.mysql.Roles
def /*14.2*/additionalStyles/*14.18*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.22*/("""
    """),format.raw/*15.5*/("""<link rel="stylesheet" href=""""),_display_(/*15.35*/routes/*15.41*/.Assets.versioned("css/history.css")),format.raw/*15.77*/("""">
""")))};def /*17.2*/additionalScripts/*17.19*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.23*/("""
    """),format.raw/*18.5*/("""<script type="text/javascript" src=""""),_display_(/*18.42*/routes/*18.48*/.Assets.versioned("js/history/history.js")),format.raw/*18.90*/(""""></script>
""")))};def /*12.2*/roles/*12.7*/ = {{currentUser.getRoles().map(r => r.getId())}};
Seq[Any](format.raw/*2.208*/("""

"""),format.raw/*10.1*/("""
"""),format.raw/*11.60*/("""
"""),format.raw/*12.55*/("""

"""),format.raw/*16.2*/("""
"""),format.raw/*19.2*/("""

"""),_display_(/*21.2*/main("History", currentUser, styles = additionalStyles, scripts = additionalScripts, search = search("history"))/*21.114*/ {_display_(Seq[Any](format.raw/*21.116*/("""
    """),_display_(/*22.6*/if(viewModel.getPatientItems.size > 1)/*22.44*/ {_display_(Seq[Any](format.raw/*22.46*/("""
        """),format.raw/*23.9*/("""<div class="encounterInfoWrap backgroundForWrap">
            <div class="row well well-sm">
                <h4 class="text-center">Duplicate Patient Search Results</h4>
                <div class="panel panel-default">
                    <table class="table vert-align">
                        <tr>
                            <th>Photo</th>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Gender</th>
                            <th>Age</th>
                            <th>City</th>
                            <th>&nbsp;</th>
                        </tr>

                        """),_display_(/*38.26*/for(a <- 1 to viewModel.getPatientItems.size) yield /*38.71*/ {_display_(Seq[Any](format.raw/*38.73*/("""
                            """),_display_(/*39.30*/defining(viewModel.getPatientItems.get(a - 1))/*39.76*/ { patient =>_display_(Seq[Any](format.raw/*39.89*/("""
                                """),format.raw/*40.33*/("""<tr>
                                    <td class="vert-align"><img class="thumbnail searchThumb" src=""""),_display_(/*41.101*/patient/*41.108*/.getPathToPhoto),format.raw/*41.123*/("""" width="90" height="90"/></td>
                                    <td class="vert-align patientId">"""),_display_(/*42.71*/patient/*42.78*/.getId),format.raw/*42.84*/("""</td>
                                    <td class="vert-align">"""),_display_(/*43.61*/patient/*43.68*/.getFirstName),format.raw/*43.81*/(""" """),_display_(/*43.83*/patient/*43.90*/.getLastName),format.raw/*43.102*/("""</td>
                                    <td class="vert-align">"""),_display_(/*44.61*/patient/*44.68*/.getSex),format.raw/*44.75*/("""</td>
                                    <td class="vert-align">"""),_display_(/*45.61*/patient/*45.68*/.getAge),format.raw/*45.75*/("""</td>
                                    <td class="vert-align">"""),_display_(/*46.61*/patient/*46.68*/.getCity),format.raw/*46.76*/("""</td>
                                    <td class="vert-align">
                                        <button type="button" class="selectPageFromRow fButton pull-right">Select</button>
                                    </td>
                                </tr>
                            """)))}),format.raw/*51.30*/("""
                        """)))}),format.raw/*52.26*/("""
                    """),format.raw/*53.21*/("""</table>
                </div>
            </div>
        </div>

    """)))}),format.raw/*58.6*/("""
    """),format.raw/*59.5*/("""<div class="encounterInfoWrap backgroundForWrap">

        <div id="viewPatientHeader">
            <div id="patientPhoto">
            """),_display_(/*63.14*/if(viewModel.getPatientItem.getPathToPhoto != null && !viewModel.getPatientItem.getPathToPhoto.isEmpty)/*63.117*/ {_display_(Seq[Any](format.raw/*63.119*/("""

                """),format.raw/*65.17*/("""<img class="" height="90" width="90" src=""""),_display_(/*65.60*/viewModel/*65.69*/.getPatientItem.getPathToPhoto),format.raw/*65.99*/("""" />

            """)))}),format.raw/*67.14*/("""
            """),format.raw/*68.13*/("""</div>
            <div id="patientInformation">
                <h1 class="bold margin-top-zero">Patient Id: """),_display_(/*70.63*/viewModel/*70.72*/.getPatientItem.getId),format.raw/*70.93*/("""</h1>

                """),_display_(/*72.18*/if(roles.contains(Roles.ADMINISTRATOR) || roles.contains(Roles.SUPERUSER) )/*72.93*/ {_display_(Seq[Any](format.raw/*72.95*/("""
                    """),_display_(/*73.22*/helper/*73.28*/.form(action = TriageController.deletePatientPost(viewModel.getPatientItem.getId))/*73.110*/{_display_(Seq[Any](format.raw/*73.111*/("""
                        """),format.raw/*74.25*/("""<input type="hidden" name="reasonDeleted" id="reasonDeleted" />
                        <button hidden="true" type="submit"  id="deletePatient"></button>
                    """)))}),format.raw/*76.22*/("""
                    """),format.raw/*77.21*/("""<span>
                        <button type="submit" id="deletePatientBtn" class="btn btn-danger pull-right"> Delete this Patient</button>
                    </span>
                """)))}),format.raw/*80.18*/("""

                """),format.raw/*82.17*/("""<a href=""""),_display_(/*82.27*/{MedicalController.editGet(viewModel.getPatientItem.getId).url}),format.raw/*82.90*/("""" class="btn btn-default pull-right">View in Medical</a>
                <a href=""""),_display_(/*83.27*/{PharmaciesController.editGet(viewModel.getPatientItem.getId).url}),format.raw/*83.93*/("""" class="btn btn-default pull-right">View in Pharmacy</a>
                <a href=""""),_display_(/*84.27*/{TriageController.indexPopulatedGet(viewModel.getPatientItem.getId).url}),format.raw/*84.99*/("""" class="btn btn-default pull-right">See This Patient In Triage</a>

                <br/><br/>
            </div>
        </div>


        <div class="row inputRow">
            <div class="col-sm-6 col-xs-12 col-md-6">
                <h3 class="pull-left bold margin-top-zero">General Info</h3>
                <div class="medicalHistoryLineDivide"></div>
                <div class="text-center">
                    <label class="inputLabel">First Name:</label>
                    <input type="text" class="form-control input-sm pull-left" name="firstName" value=""""),_display_(/*97.105*/viewModel/*97.114*/.getPatientItem.getFirstName),format.raw/*97.142*/("""" readonly/>
                    <label class="inputLabel">Last Name:</label>
                    <input type="text" class="form-control input-sm pull-left" name="lastName" value=""""),_display_(/*99.104*/viewModel/*99.113*/.getPatientItem.getLastName),format.raw/*99.140*/("""" readonly/>
                    <label class="inputLabel">Address:</label>
                    <input type="text" class="form-control input-sm pull-left" name="address" value=""""),_display_(/*101.103*/viewModel/*101.112*/.getPatientItem.getAddress),format.raw/*101.138*/("""" readonly/>
                    <label class="inputLabel">City:</label>
                    <input type="text" class="form-control input-sm pull-left" name="city" value=""""),_display_(/*103.100*/viewModel/*103.109*/.getPatientItem.getCity),format.raw/*103.132*/("""" readonly/>
                    <label class="inputLabel">Age:</label>
                    <input type="text" class="form-control input-sm pull-left" name="age" value=""""),_display_(/*105.99*/viewModel/*105.108*/.getPatientItem.getAge),format.raw/*105.130*/("""" readonly/>
                    <label class="inputLabel">Sex:</label>
                    <input type="text" class="form-control input-sm pull-left" name="age" value=""""),_display_(/*107.99*/viewModel/*107.108*/.getPatientItem.getSex),format.raw/*107.130*/("""" readonly/>
                    """),format.raw/*108.43*/("""
                """),format.raw/*109.17*/("""</div>
            </div>
            <div class="col-sm-6 col-xs-12 col-md-6">
                <h3 class="pull-left bold margin-top-zero">Previous Encounters</h3>

                <div class="medicalHistoryLineDivide"></div>
                <ol>
                """),_display_(/*116.18*/for(patientEncounter <- patientEncounters) yield /*116.60*/ {_display_(Seq[Any](format.raw/*116.62*/("""
                    """),format.raw/*117.21*/("""<li>
                        <a href="/history/encounter/"""),_display_(/*118.54*/patientEncounter/*118.70*/.getId),format.raw/*118.76*/("""" class="encbtns btn btn-default btn-xs btn-block" role="button" type="button">
                            <p class="date">"""),_display_(/*119.46*/patientEncounter/*119.62*/.getTriageDateOfVisit),format.raw/*119.83*/("""</p>
                            """),_display_(/*120.30*/if(patientEncounter.getChiefComplaints != null && patientEncounter.getChiefComplaints.size > 0)/*120.125*/{_display_(Seq[Any](format.raw/*120.126*/("""
                                """),format.raw/*121.33*/("""<p class ="chiefComplaint"><strong>Chief complaint: </strong> """),_display_(/*121.96*/for(x <- 1 to patientEncounter.getChiefComplaints.size) yield /*121.151*/ {_display_(Seq[Any](format.raw/*121.153*/(""" """),_display_(/*121.155*/patientEncounter/*121.171*/.getChiefComplaints.get(x-1)),format.raw/*121.199*/(""" """),_display_(/*121.201*/if(x < patientEncounter.getChiefComplaints.size)/*121.249*/{_display_(Seq[Any](format.raw/*121.250*/(""" """),format.raw/*121.251*/("""| """)))})))}),format.raw/*121.255*/("""</p>
                            """)))}/*122.30*/else/*122.34*/{_display_(Seq[Any](format.raw/*122.35*/("""
                                """),format.raw/*123.33*/("""<p class ="chiefComplaint"><strong>Chief complaint: </strong> N/A</p>
                            """)))}),format.raw/*124.30*/("""

                        """),format.raw/*126.25*/("""</a>
                    </li>
                    <div class="medicalHistoryLineDivide"></div>
                """)))}),format.raw/*129.18*/("""
                """),format.raw/*130.17*/("""</ol>
                <div class="alert alert-info" id="encounterAlert">Click an encounter to view past history!</div>
            </div>
        </div>

    </div>
""")))}),format.raw/*136.2*/("""
"""))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,searchError:java.lang.Boolean,viewModel:femr.ui.models.history.IndexPatientViewModelGet,patientEncounters:List[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: femr.common.models.PatientEncounterItem
}): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,searchError,viewModel,patientEncounters)

  def f:((femr.common.dtos.CurrentUser,java.lang.Boolean,femr.ui.models.history.IndexPatientViewModelGet,List[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: femr.common.models.PatientEncounterItem
}) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,searchError,viewModel,patientEncounters) => apply(currentUser,searchError,viewModel,patientEncounters)

  def ref: this.type = this

}


}
}

/**/
object indexPatient extends indexPatient_Scope0.indexPatient_Scope1.indexPatient
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:20 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/history/indexPatient.scala.html
                  HASH: 8bd2397f7d7c271fc2607a4f08497cc0ec805699
                  MATRIX: 1047->48|1606->667|1631->683|1712->687|1745->693|1802->723|1817->729|1874->765|1902->773|1928->790|2009->794|2042->800|2106->837|2121->843|2184->885|2221->609|2234->614|2313->254|2344->545|2374->606|2404->662|2435->770|2464->899|2495->904|2617->1016|2658->1018|2691->1025|2738->1063|2778->1065|2815->1075|3512->1745|3573->1790|3613->1792|3671->1823|3726->1869|3777->1882|3839->1916|3973->2022|3990->2029|4027->2044|4157->2147|4173->2154|4200->2160|4294->2227|4310->2234|4344->2247|4373->2249|4389->2256|4423->2268|4517->2335|4533->2342|4561->2349|4655->2416|4671->2423|4699->2430|4793->2497|4809->2504|4838->2512|5172->2815|5230->2842|5280->2864|5387->2941|5420->2947|5588->3088|5701->3191|5742->3193|5790->3213|5860->3256|5878->3265|5929->3295|5981->3316|6023->3330|6163->3443|6181->3452|6223->3473|6276->3499|6360->3574|6400->3576|6450->3599|6465->3605|6557->3687|6597->3688|6651->3714|6859->3891|6909->3913|7127->4100|7175->4120|7212->4130|7296->4193|7407->4277|7494->4343|7606->4428|7699->4500|8311->5084|8330->5093|8380->5121|8591->5304|8610->5313|8659->5340|8868->5520|8888->5529|8937->5555|9140->5729|9160->5738|9206->5761|9406->5933|9426->5942|9471->5964|9671->6136|9691->6145|9736->6167|9799->6223|9846->6241|10145->6512|10204->6554|10245->6556|10296->6578|10383->6637|10409->6653|10437->6659|10591->6785|10617->6801|10660->6822|10723->6857|10829->6952|10870->6953|10933->6987|11024->7050|11097->7105|11139->7107|11170->7109|11197->7125|11248->7153|11279->7155|11338->7203|11379->7204|11410->7205|11450->7209|11505->7244|11519->7248|11559->7249|11622->7283|11754->7383|11811->7411|11959->7527|12006->7545|12209->7717
                  LINES: 32->2|41->14|41->14|43->14|44->15|44->15|44->15|44->15|45->17|45->17|47->17|48->18|48->18|48->18|48->18|49->12|49->12|50->2|52->10|53->11|54->12|56->16|57->19|59->21|59->21|59->21|60->22|60->22|60->22|61->23|76->38|76->38|76->38|77->39|77->39|77->39|78->40|79->41|79->41|79->41|80->42|80->42|80->42|81->43|81->43|81->43|81->43|81->43|81->43|82->44|82->44|82->44|83->45|83->45|83->45|84->46|84->46|84->46|89->51|90->52|91->53|96->58|97->59|101->63|101->63|101->63|103->65|103->65|103->65|103->65|105->67|106->68|108->70|108->70|108->70|110->72|110->72|110->72|111->73|111->73|111->73|111->73|112->74|114->76|115->77|118->80|120->82|120->82|120->82|121->83|121->83|122->84|122->84|135->97|135->97|135->97|137->99|137->99|137->99|139->101|139->101|139->101|141->103|141->103|141->103|143->105|143->105|143->105|145->107|145->107|145->107|146->108|147->109|154->116|154->116|154->116|155->117|156->118|156->118|156->118|157->119|157->119|157->119|158->120|158->120|158->120|159->121|159->121|159->121|159->121|159->121|159->121|159->121|159->121|159->121|159->121|159->121|159->121|160->122|160->122|160->122|161->123|162->124|164->126|167->129|168->130|174->136
                  -- GENERATED --
              */
          