
package femr.ui.views.html.reference

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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[femr.common.dtos.CurrentUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.layouts.main
import femr.ui.controllers.routes.ReferenceController
def /*6.2*/additionalStyles/*6.18*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.22*/("""
    """),format.raw/*7.5*/("""<link rel="stylesheet" href=""""),_display_(/*7.35*/routes/*7.41*/.Assets.versioned("css/reference.css")),format.raw/*7.79*/("""">
""")))};def /*9.2*/additionalScripts/*9.19*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.23*/("""

""")))};
Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""
"""),format.raw/*11.2*/("""

"""),_display_(/*13.2*/main("Reference", currentUser, styles = additionalStyles, scripts = additionalScripts )/*13.89*/ {_display_(Seq[Any](format.raw/*13.91*/("""


    """),format.raw/*16.5*/("""<div class="referenceContentWrap">

        <img src=""""),_display_(/*18.20*/routes/*18.26*/.Assets.versioned("img/reference/pt-chart-ros.png")),format.raw/*18.77*/(""""  />
        <img src=""""),_display_(/*19.20*/routes/*19.26*/.Assets.versioned("img/reference/cass-physical.png")),format.raw/*19.78*/("""" class="physical" />

    </div>

""")))}))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser): play.twirl.api.HtmlFormat.Appendable = apply(currentUser)

  def f:((femr.common.dtos.CurrentUser) => play.twirl.api.HtmlFormat.Appendable) = (currentUser) => apply(currentUser)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:21 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/reference/index.scala.html
                  HASH: ef10f1150370059db9cdf7b402c691288783aaee
                  MATRIX: 785->1|998->148|1022->164|1102->168|1134->174|1190->204|1204->210|1262->248|1289->256|1314->273|1394->277|1438->44|1468->145|1496->253|1525->282|1556->287|1652->374|1692->376|1729->386|1813->443|1828->449|1900->500|1953->526|1968->532|2041->584
                  LINES: 27->1|32->6|32->6|34->6|35->7|35->7|35->7|35->7|36->9|36->9|38->9|41->1|43->5|44->8|45->11|47->13|47->13|47->13|50->16|52->18|52->18|52->18|53->19|53->19|53->19
                  -- GENERATED --
              */
          