
package femr.ui.views.html.partials.encounter

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object dynamicTabSpan_Scope0 {
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

class dynamicTabSpan extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[femr.common.models.TabFieldItem,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tabFieldItem: femr.common.models.TabFieldItem):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.partials.helpers.outputStringOrNA

Seq[Any](format.raw/*1.49*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/if(tabFieldItem != null)/*5.26*/{_display_(Seq[Any](format.raw/*5.27*/("""
    """),format.raw/*6.5*/("""<span class="value" data-id=""""),_display_(/*6.35*/tabFieldItem/*6.47*/.getName),format.raw/*6.55*/(""""> """),_display_(/*6.59*/outputStringOrNA(tabFieldItem.getValue)),format.raw/*6.98*/("""</span>
""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(tabFieldItem:femr.common.models.TabFieldItem): play.twirl.api.HtmlFormat.Appendable = apply(tabFieldItem)

  def f:((femr.common.models.TabFieldItem) => play.twirl.api.HtmlFormat.Appendable) = (tabFieldItem) => apply(tabFieldItem)

  def ref: this.type = this

}


}

/**/
object dynamicTabSpan extends dynamicTabSpan_Scope0.dynamicTabSpan
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:21 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/encounter/dynamicTabSpan.scala.html
                  HASH: 3c6b94b40dab4f930e509b54cf2af57e420a2afe
                  MATRIX: 815->1|1016->48|1046->114|1074->117|1106->141|1144->142|1176->148|1232->178|1252->190|1280->198|1310->202|1369->241|1408->251
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|36->6|36->6|36->6|36->6|36->6|37->7
                  -- GENERATED --
              */
          