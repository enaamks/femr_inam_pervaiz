
package femr.ui.views.html.pharmacies

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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[femr.common.dtos.CurrentUser,java.lang.String,java.lang.Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser, message: java.lang.String, patientId: java.lang.Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.controllers.routes.PharmaciesController
import femr.ui.views.html.layouts.main
import femr.ui.views.html.partials.shared._

Seq[Any](format.raw/*1.102*/("""

"""),format.raw/*6.1*/("""

"""),_display_(/*8.2*/main("Pharmacy", currentUser)/*8.31*/ {_display_(Seq[Any](format.raw/*8.33*/("""
    """),format.raw/*9.5*/("""<div class="container">
    """),_display_(/*10.6*/helper/*10.12*/.form(action = PharmaciesController.indexPost())/*10.60*/ {_display_(Seq[Any](format.raw/*10.62*/("""
        """),_display_(/*11.10*/searchBox("Pharmacy", patientId, message)),format.raw/*11.51*/("""
    """)))}),format.raw/*12.6*/("""
    """),format.raw/*13.5*/("""</div>
""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,message:java.lang.String,patientId:java.lang.Integer): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,message,patientId)

  def f:((femr.common.dtos.CurrentUser,java.lang.String,java.lang.Integer) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,message,patientId) => apply(currentUser,message,patientId)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:21 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/pharmacies/index.scala.html
                  HASH: 7a3de7286166c3d110a634e2355f224cbd8364ba
                  MATRIX: 821->1|1154->101|1184->249|1214->254|1251->283|1290->285|1322->291|1378->321|1393->327|1450->375|1490->377|1528->388|1590->429|1627->436|1660->442|1699->451
                  LINES: 27->1|34->1|36->6|38->8|38->8|38->8|39->9|40->10|40->10|40->10|40->10|41->11|41->11|42->12|43->13|44->14
                  -- GENERATED --
              */
          