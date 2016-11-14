
package femr.ui.views.html.partials

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object anonymous_Scope0 {
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

     object anonymous_Scope1 {
import femr.ui.controllers.routes.HomeController

class anonymous extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<div class="navigationLogo">
  <a href=""""),_display_(/*4.13*/HomeController/*4.27*/.index()),format.raw/*4.35*/("""">
      <img src=""""),_display_(/*5.18*/routes/*5.24*/.Assets.versioned("img/logo_color_wordless_sm.png")),format.raw/*5.75*/("""" />
  </a>

</div>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}
}

/**/
object anonymous extends anonymous_Scope0.anonymous_Scope1.anonymous
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:20 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/anonymous.scala.html
                  HASH: 324348782fcfb0c20474e669e252b84f34c84997
                  MATRIX: 933->53|1001->95|1023->109|1051->117|1098->138|1112->144|1183->195
                  LINES: 35->3|36->4|36->4|36->4|37->5|37->5|37->5
                  -- GENERATED --
              */
          