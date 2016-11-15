
package femr.ui.views.html.partials.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object toggleButton_Scope0 {
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

class toggleButton extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[java.lang.Boolean,java.lang.Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(isDeactivate: java.lang.Boolean, id: java.lang.Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),_display_(/*3.2*/if(isDeactivate)/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
    """),format.raw/*4.5*/("""<button type="button" class="btn btn-danger toggleBtn" data-id=""""),_display_(/*4.70*/id),format.raw/*4.72*/("""">Deactivate</button>
""")))}/*5.3*/else/*5.8*/{_display_(Seq[Any](format.raw/*5.9*/("""
    """),format.raw/*6.5*/("""<button type="button" class="btn btn-success toggleBtn" data-id=""""),_display_(/*6.71*/id),format.raw/*6.73*/("""">Activate</button>
""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(isDeactivate:java.lang.Boolean,id:java.lang.Integer): play.twirl.api.HtmlFormat.Appendable = apply(isDeactivate,id)

  def f:((java.lang.Boolean,java.lang.Integer) => play.twirl.api.HtmlFormat.Appendable) = (isDeactivate,id) => apply(isDeactivate,id)

  def ref: this.type = this

}


}

/**/
object toggleButton extends toggleButton_Scope0.toggleButton
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:18 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/admin/toggleButton.scala.html
                  HASH: 5c371b4e27933722b9a7a34fee2c1f8f3bdf67f5
                  MATRIX: 811->1|962->57|992->62|1016->78|1055->80|1087->86|1178->151|1200->153|1241->178|1252->183|1289->184|1321->190|1413->256|1435->258|1486->280
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|38->7
                  -- GENERATED --
              */
          