
package femr.ui.views.html.partials.medical.tabs

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object dynamicTab_Scope0 {
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

class dynamicTab extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[femr.common.models.TabItem,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(genericTab: femr.common.models.TabItem):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.partials.medical.dynamicField

Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.86*/("""
"""),format.raw/*6.1*/("""<div class="customWrap" id=""""),_display_(/*6.30*/genericTab/*6.40*/.getName.toLowerCase()),format.raw/*6.62*/("""DynamicTab">

    <div class="customLeft">
    """),_display_(/*9.6*/for(i <- 1 to genericTab.getFields.get(null).size) yield /*9.56*/ {_display_(Seq[Any](format.raw/*9.58*/("""

        """),_display_(/*11.10*/if(i - 1 < genericTab.getLeftColumnSize)/*11.50*/ {_display_(Seq[Any](format.raw/*11.52*/("""
            """),format.raw/*12.13*/("""<div class="customFieldWrap">
            """),_display_(/*13.14*/defining(genericTab.getFields(null).get(i - 1))/*13.61*/ { field =>_display_(Seq[Any](format.raw/*13.72*/("""
                """),_display_(/*14.18*/dynamicField(field.getValue, field.getName, field.getSize, field.getOrder, field.getType, field.getPlaceholder, false, field.getIndex)),format.raw/*14.152*/("""
            """)))}),format.raw/*15.14*/("""
            """),format.raw/*16.13*/("""</div>
        """)))}),format.raw/*17.10*/("""
    """)))}),format.raw/*18.6*/("""
    """),format.raw/*19.5*/("""</div>

    <div class="customRight">
    """),_display_(/*22.6*/for(i <- 1 to genericTab.getFields.get(null).size) yield /*22.56*/ {_display_(Seq[Any](format.raw/*22.58*/("""

        """),_display_(/*24.10*/if(i - 1 >= genericTab.getLeftColumnSize && i - 1 <= (genericTab.getLeftColumnSize + genericTab.getRightColumnSize))/*24.126*/ {_display_(Seq[Any](format.raw/*24.128*/("""

            """),format.raw/*26.13*/("""<div class="customFieldWrap">
            """),_display_(/*27.14*/defining(genericTab.getFields(null).get(i - 1))/*27.61*/ { field =>_display_(Seq[Any](format.raw/*27.72*/("""
                """),_display_(/*28.18*/dynamicField(field.getValue, field.getName, field.getSize, field.getOrder, field.getType, field.getPlaceholder, false, field.getIndex)),format.raw/*28.152*/("""
            """)))}),format.raw/*29.14*/("""
            """),format.raw/*30.13*/("""</div>
        """)))}),format.raw/*31.10*/("""
    """)))}),format.raw/*32.6*/("""
    """),format.raw/*33.5*/("""</div>

    <div class="customBottom">
    """),_display_(/*36.6*/for(i <- 1 to genericTab.getFields.get(null).size) yield /*36.56*/ {_display_(Seq[Any](format.raw/*36.58*/("""

        """),_display_(/*38.10*/if(i - 1 > (genericTab.getLeftColumnSize + genericTab.getRightColumnSize))/*38.84*/ {_display_(Seq[Any](format.raw/*38.86*/("""

            """),format.raw/*40.13*/("""<div class="customFieldWrap">
            """),_display_(/*41.14*/defining(genericTab.getFields(null).get(i - 1))/*41.61*/ { field =>_display_(Seq[Any](format.raw/*41.72*/("""
                """),_display_(/*42.18*/dynamicField(field.getValue, field.getName, field.getSize, field.getOrder, field.getType, field.getPlaceholder, false, field.getIndex)),format.raw/*42.152*/("""
            """)))}),format.raw/*43.14*/("""
            """),format.raw/*44.13*/("""</div>
        """)))}),format.raw/*45.10*/("""
    """)))}),format.raw/*46.6*/("""
    """),format.raw/*47.5*/("""</div>

</div>



"""))
      }
    }
  }

  def render(genericTab:femr.common.models.TabItem): play.twirl.api.HtmlFormat.Appendable = apply(genericTab)

  def f:((femr.common.models.TabItem) => play.twirl.api.HtmlFormat.Appendable) = (genericTab) => apply(genericTab)

  def ref: this.type = this

}


}

/**/
object dynamicTab extends dynamicTab_Scope0.dynamicTab
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:21 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/medical/tabs/dynamicTab.scala.html
                  HASH: b9c40d200b7a705c55e103697c99de2a350d4c53
                  MATRIX: 805->1|995->41|1025->103|1054->190|1082->192|1137->221|1155->231|1197->253|1273->304|1338->354|1377->356|1417->369|1466->409|1506->411|1548->425|1619->469|1675->516|1724->527|1770->546|1926->680|1972->695|2014->709|2062->726|2099->733|2132->739|2204->785|2270->835|2310->837|2350->850|2476->966|2517->968|2561->984|2632->1028|2688->1075|2737->1086|2783->1105|2939->1239|2985->1254|3027->1268|3075->1285|3112->1292|3145->1298|3218->1345|3284->1395|3324->1397|3364->1410|3447->1484|3487->1486|3531->1502|3602->1546|3658->1593|3707->1604|3753->1623|3909->1757|3955->1772|3997->1786|4045->1803|4082->1810|4115->1816
                  LINES: 27->1|32->1|34->4|35->5|36->6|36->6|36->6|36->6|39->9|39->9|39->9|41->11|41->11|41->11|42->12|43->13|43->13|43->13|44->14|44->14|45->15|46->16|47->17|48->18|49->19|52->22|52->22|52->22|54->24|54->24|54->24|56->26|57->27|57->27|57->27|58->28|58->28|59->29|60->30|61->31|62->32|63->33|66->36|66->36|66->36|68->38|68->38|68->38|70->40|71->41|71->41|71->41|72->42|72->42|73->43|74->44|75->45|76->46|77->47
                  -- GENERATED --
              */
          