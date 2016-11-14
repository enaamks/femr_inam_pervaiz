
package femr.ui.views.html.partials

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object search_Scope0 {
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

class search extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(page: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.controllers.routes.SearchController

Seq[Any](format.raw/*1.16*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<div id="searchContainer">

    """),_display_(/*7.6*/page/*7.10*/.toLowerCase/*7.22*/ match/*7.28*/ {/*8.9*/case "triage" =>/*8.25*/ {_display_(Seq[Any](format.raw/*8.27*/("""
            """),_display_(/*9.14*/helper/*9.20*/.form(action = SearchController.handleSearch("triage"))/*9.75*/ {_display_(Seq[Any](format.raw/*9.77*/("""
                """),format.raw/*10.17*/("""<input type="text" class="fInput" id = "nameOrIdSearchForm" placeholder="Patient ID or Name" name="patientSearchQuery"/>
                <button type="submit" id="searchBtn" class="fButton fRedButton fGlobalSearchButton">Search</button>
            """)))}),format.raw/*12.14*/("""
        """)))}/*14.9*/case "history" =>/*14.26*/ {_display_(Seq[Any](format.raw/*14.28*/("""
            """),_display_(/*15.14*/helper/*15.20*/.form(action = SearchController.handleSearch("history"))/*15.76*/ {_display_(Seq[Any](format.raw/*15.78*/("""
                """),format.raw/*16.17*/("""<input type="text" class="fInput" id = "nameOrIdSearchForm" placeholder="Patient ID or Name" name="patientSearchQuery"/>
                <button type="submit" id="searchBtn" class="fButton fRedButton fGlobalSearchButton">Search</button>
            """)))}),format.raw/*18.14*/("""
        """)))}/*20.9*/case "medical" =>/*20.26*/ {_display_(Seq[Any](format.raw/*20.28*/("""
            """),_display_(/*21.14*/helper/*21.20*/.form(action = SearchController.handleSearch("medical"))/*21.76*/ {_display_(Seq[Any](format.raw/*21.78*/("""
                """),format.raw/*22.17*/("""<input type="text" class="fInput" id = "nameOrIdSearchForm" placeholder="Patient ID or Name" name="patientSearchQuery"/>
                <button type="submit" id="searchBtn" class="fButton fRedButton fGlobalSearchButton">Search</button>
            """)))}),format.raw/*24.14*/("""
        """)))}/*26.9*/case "pharmacy" =>/*26.27*/ {_display_(Seq[Any](format.raw/*26.29*/("""
            """),_display_(/*27.14*/helper/*27.20*/.form(action = SearchController.handleSearch("pharmacy"))/*27.77*/ {_display_(Seq[Any](format.raw/*27.79*/("""
                """),format.raw/*28.17*/("""<input type="text" class="fInput" id = "nameOrIdSearchForm" placeholder="Patient ID or Name" name="patientSearchQuery"/>
                <button type="submit" id="searchBtn" class="fButton fRedButton fGlobalSearchButton">Search</button>
            """)))}),format.raw/*30.14*/("""
        """)))}/*32.9*/case _ =>/*32.18*/ {_display_(Seq[Any](format.raw/*32.20*/("""

        """)))}}),format.raw/*35.6*/("""
    """),format.raw/*37.54*/("""


"""),format.raw/*40.1*/("""</div>"""))
      }
    }
  }

  def render(page:String): play.twirl.api.HtmlFormat.Appendable = apply(page)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (page) => apply(page)

  def ref: this.type = this

}


}

/**/
object search extends search_Scope0.search
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:21 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/search.scala.html
                  HASH: 4f03a829f263ed1f12f114b097448e241d64e0f1
                  MATRIX: 764->1|923->15|953->72|981->74|1041->109|1053->113|1073->125|1087->131|1096->143|1120->159|1159->161|1200->176|1214->182|1277->237|1316->239|1362->257|1645->509|1674->530|1700->547|1740->549|1782->564|1797->570|1862->626|1902->628|1948->646|2231->898|2260->919|2286->936|2326->938|2368->953|2383->959|2448->1015|2488->1017|2534->1035|2817->1287|2846->1308|2873->1326|2913->1328|2955->1343|2970->1349|3036->1406|3076->1408|3122->1426|3405->1678|3434->1699|3452->1708|3492->1710|3536->1730|3570->1878|3603->1884
                  LINES: 27->1|32->1|34->4|35->5|37->7|37->7|37->7|37->7|37->8|37->8|37->8|38->9|38->9|38->9|38->9|39->10|41->12|42->14|42->14|42->14|43->15|43->15|43->15|43->15|44->16|46->18|47->20|47->20|47->20|48->21|48->21|48->21|48->21|49->22|51->24|52->26|52->26|52->26|53->27|53->27|53->27|53->27|54->28|56->30|57->32|57->32|57->32|59->35|60->37|63->40
                  -- GENERATED --
              */
          