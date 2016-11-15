
package femr.ui.views.html.research

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[femr.common.dtos.CurrentUser,femr.ui.models.research.FilterViewModel,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser, viewModel:femr.ui.models.research.FilterViewModel):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.layouts.main
import femr.ui.controllers.routes.ResearchController
import scala.collection.JavaConversions._
import helper._
def /*10.6*/additionalStyles/*10.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.26*/("""
        """),format.raw/*11.9*/("""<link rel="stylesheet" href=""""),_display_(/*11.39*/routes/*11.45*/.Assets.versioned("css/research.css")),format.raw/*11.82*/("""">
    """)))};def /*13.6*/additionalScripts/*13.23*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.27*/("""
        """),format.raw/*14.9*/("""<script type="text/javascript" src=""""),_display_(/*14.46*/routes/*14.52*/.Assets.versioned("js/research/d3.min.js")),format.raw/*14.94*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*15.46*/routes/*15.52*/.Assets.versioned("js/research/d3.tip.js")),format.raw/*15.94*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*16.46*/routes/*16.52*/.Assets.versioned("js/research/saveSvgAsPng.js")),format.raw/*16.100*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*17.46*/routes/*17.52*/.Assets.versioned("js/research/filter-menu.js")),format.raw/*17.99*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*18.46*/routes/*18.52*/.Assets.versioned("js/research/bar-graph.js")),format.raw/*18.97*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*19.46*/routes/*19.52*/.Assets.versioned("js/research/pie-graph.js")),format.raw/*19.97*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*20.46*/routes/*20.52*/.Assets.versioned("js/research/line-graph.js")),format.raw/*20.98*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*21.46*/routes/*21.52*/.Assets.versioned("js/research/scatter-plot.js")),format.raw/*21.100*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*22.46*/routes/*22.52*/.Assets.versioned("js/research/stacked-bar.js")),format.raw/*22.99*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*23.46*/routes/*23.52*/.Assets.versioned("js/research/grouped-bar.js")),format.raw/*23.99*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*24.46*/routes/*24.52*/.Assets.versioned("js/research/table-chart.js")),format.raw/*24.99*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*25.46*/routes/*25.52*/.Assets.versioned("js/libraries/typeahead.bundle.min.js")),format.raw/*25.109*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*26.46*/routes/*26.52*/.Assets.versioned("js/research/research.js")),format.raw/*26.96*/(""""></script>
    """)))};
Seq[Any](format.raw/*1.96*/("""

"""),format.raw/*7.1*/("""


    """),format.raw/*12.6*/("""
    """),format.raw/*27.6*/("""

"""),_display_(/*29.2*/main("Research", currentUser, styles = additionalStyles, scripts = additionalScripts)/*29.87*/ {_display_(Seq[Any](format.raw/*29.89*/("""

        """),format.raw/*31.9*/("""<div class="row dropdown">
            <div class="col-sm-3 col-md-2 sidebar">
                """),_display_(/*33.18*/helper/*33.24*/.form(action = ResearchController.exportPost, 'id -> "graph-options")/*33.93*/ {_display_(Seq[Any](format.raw/*33.95*/("""
                    """),format.raw/*34.21*/("""<div id="filter-errors">

                    </div>
                    <ul class="nav nav-sidebar">
                        <li id="gdata1-menu" class="menu-item">
                            <a class="opt-link">Primary Dataset</a>
                            <span class="val"></span>
                            <span class="glyphicon glyphicon-chevron-right"></span>
                            <ul class="submenu">
                                <li class="title">Demographics</li>
                                <li><a data-dname1="age" href="#">Age</a></li>
                                <li><a data-dname1="gender" href="#">Gender</a></li>
                                <li><a data-dname1="height" href="#">Height</a></li>
                                <li><a data-dname1="weight" href="#">Weight</a></li>
                                <li><a data-dname1="pregnancyStatus" href="#">Pregnancy Status</a></li>
                                <li><a data-dname1="pregnancyTime" href="#">Weeks Pregnant</a></li>
                               <li class="title">Medication</li>
                                <li><a data-dname1="prescribedMeds" href="#">Prescribed Medications</a></li>
                                <li><a data-dname1="dispensedMeds" href="#">Dispensed Medications</a></li>
                                <li class="title">Vitals</li>
                                <li><a data-dname1="temperature" href="#">Temperature</a></li>
                                <li><a data-dname1="bloodPressureSystolic" href="#">Blood Pressure Systolic</a></li>
                                <li><a data-dname1="bloodPressureDiastolic" href="#">Blood Pressure Diastolic</a></li>
                                <li><a data-dname1="heartRate" href="#">Heart Rate</a></li>
                                <li><a data-dname1="respiratoryRate" href="#">Respirations</a></li>
                                <li><a data-dname1="oxygenSaturation" href="#">Oxygen Saturation</a></li>
                                <li><a data-dname1="glucose" href="#">Glucose</a></li>
                                """),format.raw/*63.35*/("""
                            """),format.raw/*64.29*/("""</ul>
                        </li>
                        <li id="gdata2-menu" class="menu-item">
                            <a class="opt-link">Secondary Dataset</a>
                            <span class="val"></span>
                            <span class="glyphicon glyphicon-chevron-right"></span>
                            <ul class="submenu">
                                <li><a class="clear" data-dname2="clear" href="#">None</a></li>
                                <li><a data-dname2="age" href="#">Age</a></li>
                                <li><a data-dname2="gender" href="#">Gender</a></li>
                                <li><a data-dname2="pregnancyStatus" href="#">Pregnancy Status</a></li>

                            </ul>
                            """),format.raw/*101.31*/("""
                        """),format.raw/*102.25*/("""</li>
                        <li id="gtype-menu" class="menu-item">
                            <a class="opt-link">Graph Type</a>
                            <span class="val"></span>
                            <span class="glyphicon glyphicon-chevron-right"></span>
                            <ul class="submenu">
                                <li><a data-gtype="bar" href="#">Bar Graph</a></li>
                                <li><a data-gtype="pie" href="#">Pie Graph</a></li>
                                <li><a data-gtype="line" href="#">Line Graph</a></li>
                                <li><a data-gtype="scatter" href="#">Scatterplot</a></li>
                                <li><a data-gtype="stacked-bar" href="#">Stacked Bar Graph</a></li>
                                <li><a data-gtype="grouped-bar" href="#">Grouped Bar Graph</a></li>
                                <li><a data-gtype="table" href="#">Table</a></li>
                            </ul>
                        </li>

                        <li id="gfilter-menu" class="menu-item">
                            <a class="opt-link">Filter Date</a>
                            <span class="val">
                                <span class="date">
                                   <span class="start">"""),_display_(/*122.57*/viewModel/*122.66*/.getStartDate()),format.raw/*122.81*/("""</span> - <span class="end">"""),_display_(/*122.110*/viewModel/*122.119*/.getEndDate()),format.raw/*122.132*/("""</span>
                                </span>
                            </span>
                            <span class="glyphicon glyphicon-chevron-right"></span>
                            <ul class="submenu">
                                <li>Start Date <input type="date" id="startDate" name="startDate" value=""""),_display_(/*127.107*/viewModel/*127.116*/.getStartDate()),format.raw/*127.131*/("""" max=""""),_display_(/*127.139*/viewModel/*127.148*/.getEndDate()),format.raw/*127.161*/("""" /></li>
                                <li>End Date <input type="date" id="endDate" name="endDate" value=""""),_display_(/*128.101*/viewModel/*128.110*/.getEndDate()),format.raw/*128.123*/("""" max=""""),_display_(/*128.131*/viewModel/*128.140*/.getEndDate()),format.raw/*128.153*/("""" /></li>
                            </ul>
                        </li>


                        <li class="controls">

                            <input type="hidden" id="primaryDataset" name="primaryDataset" value="" />
                            <input type="hidden" id="secondaryDataset" name="secondaryDataset" value="" />
                            <input type="hidden" id="graphType" name="graphType" value="" />


                            """),format.raw/*146.35*/("""
                                """),format.raw/*147.33*/("""<span class="medication">
                                <label>Filter Trip</label>
                                    <select id="MissionTripId" name="MissionTripId" class="medication">
                                        <option selected id="default" value="-1">-- Select Trip --</option> """),format.raw/*150.131*/("""
                                        """),_display_(/*151.42*/for(i <- 1 to viewModel.getMissionTrips.size) yield /*151.87*/ {_display_(Seq[Any](format.raw/*151.89*/("""
                                            """),_display_(/*152.46*/defining(viewModel.getMissionTrips.get(i - 1))/*152.92*/ { missionItem =>_display_(Seq[Any](format.raw/*152.109*/("""
                                                """),_display_(/*153.50*/for(tripIndex <- 1 to missionItem.getMissionTrips.size) yield /*153.105*/ {_display_(Seq[Any](format.raw/*153.107*/("""
                                                    """),_display_(/*154.54*/defining(missionItem.getMissionTrips.get(tripIndex - 1))/*154.110*/ { missionTrip =>_display_(Seq[Any](format.raw/*154.127*/("""
                                                        """),format.raw/*155.57*/("""<option value = """"),_display_(/*155.75*/missionTrip/*155.86*/.getId()),format.raw/*155.94*/(""""> """),_display_(/*155.98*/missionItem/*155.109*/.getMissionTrips.get(tripIndex - 1).getFriendlyTripTitle),format.raw/*155.165*/(""" """),format.raw/*155.166*/("""</option>
                                                    """)))}),format.raw/*156.54*/("""
                                                """)))}),format.raw/*157.50*/("""
                                            """)))}),format.raw/*158.46*/("""
                                        """)))}),format.raw/*159.42*/("""
                                    """),format.raw/*160.37*/("""</select>
                                </span>

                            <span class="filter">
                                <label>Filter Primary Dataset</label>
                                <input type="text" id="filterRangeStart" name="filterRangeStart" placeholder="Start" value="" /> &ndash;
                                <input type="text" id="filterRangeEnd" name="filterRangeEnd" placeholder="End" value="" />
                                <span id="filter-primary-clear" class="glyphicon glyphicon-remove"></span>
                            </span>



                            <span class="group">
                                <label for="groupPrimary"><input type="checkbox" id="groupPrimary" name="groupPrimary" value="1" />Group Primary</label>
                                <input type="text" name="groupFactor" id="groupFactor" value="10" />
                            </span>
                        </li>
                        <li class="submit">
                            <input id="clear-button" class="clear fButton pull-left" type="button" value="Clear" />
                            <input id="submit-button" class="submit fButton pull-right" type="submit" value="Apply" />
                        </li>
                        <li class="export">
                            <input id="export-button" class="export fButton" type="button" value="Export Data"/>
                        </li>
                    </ul>
                """)))}),format.raw/*185.18*/("""

            """),format.raw/*187.13*/("""</div>
            <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

                <h1 class="page-header">Research</h1>

                <div class="chart-container">

                    <div class="graph-instructions">

                        <p>To view a graph, from the sidebar on the left:</p>
                        <ol>
                            <li>Choose Dataset(s)</li>
                            <li>Choose a Graph Type</li>
                            <li>Choose Filters</li>
                            <li>Click Apply</li>
                        </ol>

                        <p>To export data, click the "Export Data" button. The exported data will be de-identified and it will have all selected Datasets and Filters applied to it.</p>
                    </div>
                    <div class="graph-area">
                        <div class="graph-header">
                            <p id="average" class="stat"><strong>Average:</strong> <span class="val"></span></p>
                            <p id="range" class="stat"><strong>Range:</strong> <span class="val"></span></p>
                            <p id="totalPatients" class="stat"><strong>Total Patients:</strong> <span class="val"></span></p>
                            <p id="totalEncounters" class="stat"><strong>Total Encounters:</strong> <span class="val"></span></p>

                            <div class="save-image-cont">
                                <a id="save-button" class="fButton" href="#">Save As Image</a>
                                <div class="options">
                                    <div class="close"><span class="glyphicon glyphicon-remove"></span></div>
                                    <p>Choose Image Size</p>
                                    <a href="#" class="image-size-selection" data-imagesize="small">Small<br />700 x 350</a>
                                    <a href="#" class="image-size-selection" data-imagesize="medium">Medium<br />1000 x 500</a>
                                    <a href="#" class="image-size-selection" data-imagesize="large">Large<br />1200 x 600</a>
                                </div>
                            </div>
                        </div>
                        <svg id="legend"></svg>
                        <svg id="graph" class="chart">

                        </svg>
                        <img class="loading" src=""""),_display_(/*228.52*/routes/*228.58*/.Assets.versioned("img/graph-loader.gif")),format.raw/*228.99*/("""" alt="loading&hellip;" />
                    </div>
                </div>
                <div id="table-container" class="table-responsive">

                </div>

            </div>

        </div>

""")))}),format.raw/*239.2*/("""
"""))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,viewModel:femr.ui.models.research.FilterViewModel): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,viewModel)

  def f:((femr.common.dtos.CurrentUser,femr.ui.models.research.FilterViewModel) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,viewModel) => apply(currentUser,viewModel)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/research/index.scala.html
                  HASH: ca86fb04991b7b5466d71b49e081c8e7ab292a40
                  MATRIX: 824->1|1146->268|1171->284|1252->288|1289->298|1346->328|1361->334|1419->371|1451->387|1477->404|1558->408|1595->418|1659->455|1674->461|1737->503|1822->561|1837->567|1900->609|1985->667|2000->673|2070->721|2155->779|2170->785|2238->832|2323->890|2338->896|2404->941|2489->999|2504->1005|2570->1050|2655->1108|2670->1114|2737->1160|2822->1218|2837->1224|2907->1272|2992->1330|3007->1336|3075->1383|3160->1441|3175->1447|3243->1494|3328->1552|3343->1558|3411->1605|3496->1663|3511->1669|3590->1726|3675->1784|3690->1790|3755->1834|3812->95|3842->257|3879->380|3912->1852|3943->1857|4037->1942|4077->1944|4116->1956|4241->2054|4256->2060|4334->2129|4374->2131|4424->2153|6597->4483|6655->4513|7481->7350|7536->7376|8878->8690|8897->8699|8934->8714|8992->8743|9012->8752|9048->8765|9405->9093|9425->9102|9463->9117|9500->9125|9520->9134|9556->9147|9696->9258|9716->9267|9752->9280|9789->9288|9809->9297|9845->9310|10342->10102|10405->10136|10735->10458|10806->10501|10868->10546|10909->10548|10984->10595|11040->10641|11097->10658|11176->10709|11249->10764|11291->10766|11374->10821|11441->10877|11498->10894|11585->10952|11631->10970|11652->10981|11682->10989|11714->10993|11736->11004|11815->11060|11846->11061|11942->11125|12025->11176|12104->11223|12179->11266|12246->11304|13788->12814|13833->12830|16334->15303|16350->15309|16413->15350|16662->15568
                  LINES: 27->1|34->10|34->10|36->10|37->11|37->11|37->11|37->11|38->13|38->13|40->13|41->14|41->14|41->14|41->14|42->15|42->15|42->15|43->16|43->16|43->16|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|48->21|48->21|48->21|49->22|49->22|49->22|50->23|50->23|50->23|51->24|51->24|51->24|52->25|52->25|52->25|53->26|53->26|53->26|55->1|57->7|60->12|61->27|63->29|63->29|63->29|65->31|67->33|67->33|67->33|67->33|68->34|95->63|96->64|109->101|110->102|130->122|130->122|130->122|130->122|130->122|130->122|135->127|135->127|135->127|135->127|135->127|135->127|136->128|136->128|136->128|136->128|136->128|136->128|148->146|149->147|152->150|153->151|153->151|153->151|154->152|154->152|154->152|155->153|155->153|155->153|156->154|156->154|156->154|157->155|157->155|157->155|157->155|157->155|157->155|157->155|157->155|158->156|159->157|160->158|161->159|162->160|187->185|189->187|230->228|230->228|230->228|241->239
                  -- GENERATED --
              */
          