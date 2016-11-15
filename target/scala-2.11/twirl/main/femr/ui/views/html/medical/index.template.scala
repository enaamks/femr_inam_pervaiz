
package femr.ui.views.html.medical

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
import femr.ui.controllers.routes.MedicalController
import femr.ui.views.html.layouts.main
import femr.ui.views.html.partials.shared._

Seq[Any](format.raw/*1.102*/("""

"""),format.raw/*6.1*/("""

"""),_display_(/*8.2*/main("Medical", currentUser)/*8.30*/ {_display_(Seq[Any](format.raw/*8.32*/("""
    """),format.raw/*9.5*/("""<div class="container">
    """),_display_(/*10.6*/helper/*10.12*/.form(action = MedicalController.indexPost())/*10.57*/ {_display_(Seq[Any](format.raw/*10.59*/("""
        """),_display_(/*11.10*/searchBox("Medical", patientId, message)),format.raw/*11.50*/("""
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
                  DATE: Mon Nov 14 20:26:18 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/medical/index.scala.html
                  HASH: 501415a86e4c8d18f580e690768962227644ebfe
                  MATRIX: 818->1|1148->101|1178->246|1208->251|1244->279|1283->281|1315->287|1371->317|1386->323|1440->368|1480->370|1518->381|1579->421|1616->428|1649->434|1688->443
                  LINES: 27->1|34->1|36->6|38->8|38->8|38->8|39->9|40->10|40->10|40->10|40->10|41->11|41->11|42->12|43->13|44->14
                  -- GENERATED --
              */
          