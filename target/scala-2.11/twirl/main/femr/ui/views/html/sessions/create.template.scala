
package femr.ui.views.html.sessions

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object create_Scope0 {
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

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[femr.ui.models.sessions.CreateViewModel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(createForm: Form[femr.ui.models.sessions.CreateViewModel]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.layouts.main
import femr.ui.controllers.routes.SessionsController
def /*5.6*/styles/*5.12*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.16*/("""
        """),format.raw/*6.9*/("""<link rel="stylesheet" href=""""),_display_(/*6.39*/routes/*6.45*/.Assets.versioned("css/login.css")),format.raw/*6.79*/("""">
    """)))};
Seq[Any](format.raw/*1.61*/("""

"""),format.raw/*5.1*/("""    """),format.raw/*7.6*/("""
"""),_display_(/*8.2*/main("Login", styles = styles)/*8.32*/ {_display_(Seq[Any](format.raw/*8.34*/("""

    """),_display_(/*10.6*/helper/*10.12*/.form(action = SessionsController.createPost(), 'class -> "form-signin")/*10.84*/ {_display_(Seq[Any](format.raw/*10.86*/("""
        """),format.raw/*11.9*/("""<div id="login">
            <h1>Please sign in</h1>
            <input type="text" name="email" placeholder="Email" />
            <input type="password" name="password" placeholder="Password" />
            <input type="submit" value="Log in" />
            <img src=""""),_display_(/*16.24*/routes/*16.30*/.Assets.versioned("img/logo_color_sm.png")),format.raw/*16.72*/("""" />
        </div>
    """)))}),format.raw/*18.6*/("""
""")))}),format.raw/*19.2*/("""
"""))
      }
    }
  }

  def render(createForm:Form[femr.ui.models.sessions.CreateViewModel]): play.twirl.api.HtmlFormat.Appendable = apply(createForm)

  def f:((Form[femr.ui.models.sessions.CreateViewModel]) => play.twirl.api.HtmlFormat.Appendable) = (createForm) => apply(createForm)

  def ref: this.type = this

}


}

/**/
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:21 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/sessions/create.scala.html
                  HASH: 5009a8cdc19e9b05b99cef72362f3f152cf2d034
                  MATRIX: 803->1|1031->165|1045->171|1125->175|1161->185|1217->215|1231->221|1285->255|1333->60|1363->160|1393->264|1421->267|1459->297|1498->299|1533->308|1548->314|1629->386|1669->388|1706->398|2009->674|2024->680|2087->722|2144->749|2177->752
                  LINES: 27->1|32->5|32->5|34->5|35->6|35->6|35->6|35->6|37->1|39->5|39->7|40->8|40->8|40->8|42->10|42->10|42->10|42->10|43->11|48->16|48->16|48->16|50->18|51->19
                  -- GENERATED --
              */
          