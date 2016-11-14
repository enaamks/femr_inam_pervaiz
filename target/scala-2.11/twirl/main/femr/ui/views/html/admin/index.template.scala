
package femr.ui.views.html.admin

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
import femr.ui.views.html.layouts.admin

Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/admin("Admin Panel", currentUser)/*6.35*/ {_display_(Seq[Any](format.raw/*6.37*/("""
    """),format.raw/*7.5*/("""<h3>Welcome, Administrator. Choose an option to get started.</h3>
""")))}),format.raw/*8.2*/("""
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:18 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/admin/index.scala.html
                  HASH: 66293755d38a1b73f8faa955c4f11df8824c34d5
                  MATRIX: 781->1|958->44|988->90|1018->95|1059->128|1098->130|1130->136|1227->204
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|37->7|38->8
                  -- GENERATED --
              */
          