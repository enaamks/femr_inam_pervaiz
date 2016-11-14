
package femr.ui.views.html.medical

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newVitals_Scope0 {
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

class newVitals extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[femr.ui.models.medical.EditViewModelGet,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(viewModel: femr.ui.models.medical.EditViewModelGet):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.54*/("""

"""),format.raw/*3.1*/("""<link rel="stylesheet" href=""""),_display_(/*3.31*/routes/*3.37*/.Assets.versioned("css/medical/newVitals.css")),format.raw/*3.83*/("""" xmlns="http://www.w3.org/1999/xhtml">
<script type="text/javascript" src=""""),_display_(/*4.38*/routes/*4.44*/.Assets.versioned("js/medical/newVitals.js")),format.raw/*4.88*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*5.38*/routes/*5.44*/.Assets.versioned("js/shared/vitalClientValidation.js")),format.raw/*5.99*/(""""></script>
<div id="all">

    <div id="left">
        <label>BP</label>
        <br/>
        <input type="number" class="fInput" id="newSystolic" placeholder="systolic"/>
        <input type="number" class="fInput" id="newDiastolic" placeholder="diastolic"/>
        <br/>
        <label>HR</label>
        <br/>
        <input type="number" class="fInput" id="newHeartRate" placeholder="bpm"/>
        <br/>
        <label>T</label>
        <br/>
        """),_display_(/*20.10*/if(viewModel.getSettings.isMetric)/*20.44*/ {_display_(Seq[Any](format.raw/*20.46*/(""" """),format.raw/*20.47*/("""<!---  Alaa Serhan -->
            <input type="number" class="fInput" id="newTemperature" placeholder="C"/>
        """)))}/*22.11*/else/*22.16*/{_display_(Seq[Any](format.raw/*22.17*/("""
            """),format.raw/*23.13*/("""<input type="number" class="fInput" id="newTemperature" placeholder="F"/>
        """)))}),format.raw/*24.10*/("""
        """),format.raw/*25.9*/("""<br/>
        <label>RR</label>
        <br/>
        <input type="number" class="fInput" id="newRespiratoryRate" placeholder="bpm"/>
        <br/>

    </div>
    <div id="right">
        <label>Gluc</label>
        <br/>
        <input type="number" class="fInput" id="newGlucose" placeholder="mg/dl"/>
        <br/>
        <label>SpO2</label>
        <br/>
        <input type="number" class="fInput" id="newOxygen" placeholder="%"/>
        <br/>
        <label>Ht</label>
        <br/>
        """),_display_(/*43.10*/if(viewModel.getSettings.isMetric)/*43.44*/ {_display_(Seq[Any](format.raw/*43.46*/(""" """),format.raw/*43.47*/("""<!---  Alaa Serhan -->
            <input type="number" class="fInput" id="newHeightFeet" placeholder="m"/>
            <input type="number" class="fInput" id="newHeightInches" placeholder="cm"/>
        """)))}/*46.11*/else/*46.16*/{_display_(Seq[Any](format.raw/*46.17*/("""
            """),format.raw/*47.13*/("""<input type="number" class="fInput" id="newHeightFeet" placeholder="ft"/>
            <input type="number" class="fInput" id="newHeightInches" placeholder="in"/>
        """)))}),format.raw/*49.10*/("""
        """),format.raw/*50.9*/("""<br/>
        <label>Wt</label>
        <br/>
        """),_display_(/*53.10*/if(viewModel.getSettings.isMetric)/*53.44*/ {_display_(Seq[Any](format.raw/*53.46*/(""" """),format.raw/*53.47*/("""<!---  Alaa Serhan -->
            <input type="number" class="fInput" id="newWeight" placeholder="kgs"/>
        """)))}/*55.11*/else/*55.16*/{_display_(Seq[Any](format.raw/*55.17*/("""
            """),format.raw/*56.13*/("""<input type="number" class="fInput" id="newWeight" placeholder="lbs"/>
        """)))}),format.raw/*57.10*/("""
		  """),format.raw/*58.5*/("""<br/>
        <label>WP</label> <!--- Sam Zanni -->
        <br/>
        <input type="number" class="fInput" id="weeksPreg" placeholder="weeks"/>
        <br/>
    </div>
    <div id="theButtons">
        <button type="button" id="saveVitalsBtn" class="fButton">Save</button>
        <button type="button" id="cancelVitalsBtn" class="fButton">Cancel</button>
    </div>

</div>




"""))
      }
    }
  }

  def render(viewModel:femr.ui.models.medical.EditViewModelGet): play.twirl.api.HtmlFormat.Appendable = apply(viewModel)

  def f:((femr.ui.models.medical.EditViewModelGet) => play.twirl.api.HtmlFormat.Appendable) = (viewModel) => apply(viewModel)

  def ref: this.type = this

}


}

/**/
object newVitals extends newVitals_Scope0.newVitals
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:20 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/medical/newVitals.scala.html
                  HASH: 1397e9c0503a8e8d50092fdfa2176037ae2de3d1
                  MATRIX: 802->1|949->53|979->57|1035->87|1049->93|1115->139|1219->217|1233->223|1297->267|1373->317|1387->323|1462->378|1964->853|2007->887|2047->889|2076->890|2215->1011|2228->1016|2267->1017|2309->1031|2424->1115|2461->1125|3007->1644|3050->1678|3090->1680|3119->1681|3346->1890|3359->1895|3398->1896|3440->1910|3644->2083|3681->2093|3766->2151|3809->2185|3849->2187|3878->2188|4014->2306|4027->2311|4066->2312|4108->2326|4220->2407|4253->2413
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|36->5|36->5|51->20|51->20|51->20|51->20|53->22|53->22|53->22|54->23|55->24|56->25|74->43|74->43|74->43|74->43|77->46|77->46|77->46|78->47|80->49|81->50|84->53|84->53|84->53|84->53|86->55|86->55|86->55|87->56|88->57|89->58
                  -- GENERATED --
              */
          