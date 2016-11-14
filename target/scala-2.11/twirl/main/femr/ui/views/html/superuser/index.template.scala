
package femr.ui.views.html.superuser

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
"""),_display_(/*5.2*/admin("SuperUser Panel", currentUser)/*5.39*/ {_display_(Seq[Any](format.raw/*5.41*/("""
    """),format.raw/*6.5*/("""<h3>Welcome, SuperUser. Choose an option to get started.</h3>

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
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/superuser/index.scala.html
                  HASH: 6ff542322ab64003d9574d745ec4c83ed5739051
                  MATRIX: 785->1|962->44|992->90|1020->93|1065->130|1104->132|1136->138
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6
                  -- GENERATED --
              */
          