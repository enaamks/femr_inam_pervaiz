
package femr.ui.views.html.partials.history

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listTabFieldHistory_Scope0 {
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

class listTabFieldHistory extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[java.lang.String,femr.util.DataStructure.Mapping.TabFieldMultiMap,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tabFieldName:java.lang.String, tabFieldMap:femr.util.DataStructure.Mapping.TabFieldMultiMap):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.95*/("""



"""),format.raw/*5.1*/("""<tbody>
    <tr class="first">r
        <th>Date:</th>
        <th>Value:</th>
        <th>User:</th>
        """),_display_(/*10.10*/for(dateIndex <- 1 to tabFieldMap.getDateListChronological.size) yield /*10.74*/ {_display_(Seq[Any](format.raw/*10.76*/("""
        """),format.raw/*11.9*/("""<tr>
            <td>"""),_display_(/*12.18*/tabFieldMap/*12.29*/.getFormatedDateTime(dateIndex - 1)),format.raw/*12.64*/("""</td>
            <td>"""),_display_(/*13.18*/tabFieldMap/*13.29*/.get(tabFieldName, tabFieldMap.getDate(dateIndex - 1), null).getValue),format.raw/*13.98*/("""</td>
            <td>"""),_display_(/*14.18*/tabFieldMap/*14.29*/.get(tabFieldName, tabFieldMap.getDate(dateIndex - 1), null).getUserName),format.raw/*14.101*/("""</td>
        </tr>
        """)))}),format.raw/*16.10*/("""



"""),format.raw/*20.1*/("""</tbody>
"""))
      }
    }
  }

  def render(tabFieldName:java.lang.String,tabFieldMap:femr.util.DataStructure.Mapping.TabFieldMultiMap): play.twirl.api.HtmlFormat.Appendable = apply(tabFieldName,tabFieldMap)

  def f:((java.lang.String,femr.util.DataStructure.Mapping.TabFieldMultiMap) => play.twirl.api.HtmlFormat.Appendable) = (tabFieldName,tabFieldMap) => apply(tabFieldName,tabFieldMap)

  def ref: this.type = this

}


}

/**/
object listTabFieldHistory extends listTabFieldHistory_Scope0.listTabFieldHistory
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/history/listTabFieldHistory.scala.html
                  HASH: 19512865807f4fbb02c9b315fe75ab8981646c21
                  MATRIX: 857->1|1045->94|1079->102|1222->218|1302->282|1342->284|1379->294|1429->317|1449->328|1505->363|1556->387|1576->398|1666->467|1717->491|1737->502|1831->574|1893->605|1928->613
                  LINES: 27->1|32->1|36->5|41->10|41->10|41->10|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|47->16|51->20
                  -- GENERATED --
              */
          