
package femr.ui.views.html.partials

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object header_Scope0 {
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

class header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[femr.common.dtos.CurrentUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser = null):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.partials

Seq[Any](format.raw/*1.52*/("""

"""),format.raw/*4.1*/("""<div class="navigation">
    <div class="container">
    """),_display_(/*6.6*/if(currentUser != null)/*6.29*/ {_display_(Seq[Any](format.raw/*6.31*/("""
        """),_display_(/*7.10*/partials/*7.18*/.authenticated(currentUser)),format.raw/*7.45*/("""
    """)))}/*8.7*/else/*8.12*/{_display_(Seq[Any](format.raw/*8.13*/("""
        """),_display_(/*9.10*/partials/*9.18*/.anonymous()),format.raw/*9.30*/("""
    """)))}),format.raw/*10.6*/("""
    """),format.raw/*11.5*/("""</div>
</div>

"""))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser): play.twirl.api.HtmlFormat.Appendable = apply(currentUser)

  def f:((femr.common.dtos.CurrentUser) => play.twirl.api.HtmlFormat.Appendable) = (currentUser) => apply(currentUser)

  def ref: this.type = this

}


}

/**/
object header extends header_Scope0.header
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:18 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/header.scala.html
                  HASH: c79df7c937de064c7e784419efbe7ba0f2f907cb
                  MATRIX: 786->1|965->51|995->92|1080->152|1111->175|1150->177|1187->188|1203->196|1250->223|1274->231|1286->236|1324->237|1361->248|1377->256|1409->268|1446->275|1479->281
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|37->7|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|41->11
                  -- GENERATED --
              */
          