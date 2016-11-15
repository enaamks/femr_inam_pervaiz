
package femr.ui.views.html.sessions

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editPassword_Scope0 {
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

class editPassword extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[java.lang.String,java.lang.String,play.data.Form[femr.ui.models.sessions.CreateViewModel],java.util.List[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: java.lang.String
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(firstName: java.lang.String, lastName: java.lang.String, form: play.data.Form[femr.ui.models.sessions.CreateViewModel], messages: java.util.List[_ <: java.lang.String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.layouts.main
import femr.ui.controllers.routes.SessionsController
def /*5.2*/styles/*5.8*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.12*/("""
    """),format.raw/*6.5*/("""<link rel="stylesheet" href=""""),_display_(/*6.35*/routes/*6.41*/.Assets.versioned("css/login.css")),format.raw/*6.75*/("""">
""")))};def /*8.2*/additionalScripts/*8.19*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.23*/("""
    """),format.raw/*9.5*/("""<script type="text/javascript" src=""""),_display_(/*9.42*/routes/*9.48*/.Assets.versioned("js/admin/users.js")),format.raw/*9.86*/(""""></script>
""")))};def /*11.2*/additionalMessages/*11.20*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*11.24*/("""
"""),_display_(/*12.2*/for(message <- messages) yield /*12.26*/ {_display_(Seq[Any](format.raw/*12.28*/("""
    """),_display_(/*13.6*/if(!messages.isEmpty())/*13.29*/ {_display_(Seq[Any](format.raw/*13.31*/("""
        """),format.raw/*14.9*/("""<p class="adminMessage">"""),_display_(/*14.34*/message),format.raw/*14.41*/("""</p>
    """)))}),format.raw/*15.6*/("""
""")))}),format.raw/*16.2*/("""
""")))};
Seq[Any](format.raw/*1.171*/("""

"""),format.raw/*7.2*/("""
"""),format.raw/*10.2*/("""
"""),format.raw/*17.2*/("""

"""),_display_(/*19.2*/main("Login", styles = styles)/*19.32*/ {_display_(Seq[Any](format.raw/*19.34*/("""
    """),format.raw/*20.5*/("""<div class="container">
    """),_display_(/*21.6*/helper/*21.12*/.form(action = SessionsController.editPasswordPost(), 'class -> "form-horizontal", 'name -> "createForm")/*21.117*/ {_display_(Seq[Any](format.raw/*21.119*/("""
        """),format.raw/*22.9*/("""<h1>Hello, """),_display_(/*22.21*/firstName),format.raw/*22.30*/(""" """),_display_(/*22.32*/lastName),format.raw/*22.40*/(""", your password is older than 60 days.</h1>
        <h4>Please choose a new password:</h4>
        """),format.raw/*24.47*/("""
        """),_display_(/*25.10*/additionalMessages),format.raw/*25.28*/("""
        """),format.raw/*26.9*/("""<div id="passwordsWrap">
            <div>
                <label class="labelChangePassword" for="password1">Enter password:</label>
                <input type="password" class="fInput fInputChangePassword" name="newPassword"/>
            </div>
            <div>
                <label class="labelChangePassword" for="password2">Re-Enter password:</label>
                <input type="password" class="fInput fInputChangePassword" name="newPasswordVerify"/>
            </div>

            <button type="submit" class="fButton pull-right">Submit</button>
        </div>
    """)))}),format.raw/*38.6*/("""
    """),format.raw/*39.5*/("""</div>
""")))}),format.raw/*40.2*/("""
"""))
      }
    }
  }

  def render(firstName:java.lang.String,lastName:java.lang.String,form:play.data.Form[femr.ui.models.sessions.CreateViewModel],messages:java.util.List[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: java.lang.String
}): play.twirl.api.HtmlFormat.Appendable = apply(firstName,lastName,form,messages)

  def f:((java.lang.String,java.lang.String,play.data.Form[femr.ui.models.sessions.CreateViewModel],java.util.List[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: java.lang.String
}) => play.twirl.api.HtmlFormat.Appendable) = (firstName,lastName,form,messages) => apply(firstName,lastName,form,messages)

  def ref: this.type = this

}


}

/**/
object editPassword extends editPassword_Scope0.editPassword
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/sessions/editPassword.scala.html
                  HASH: ed2e650f606f194406e7cf6d2b0b2ad4083a9fc0
                  MATRIX: 950->1|1288->271|1301->277|1381->281|1413->287|1469->317|1483->323|1537->357|1564->365|1589->382|1669->386|1701->392|1764->429|1778->435|1836->473|1873->490|1900->508|1981->512|2010->515|2050->539|2090->541|2123->548|2155->571|2195->573|2232->583|2284->608|2312->615|2353->626|2386->629|2429->170|2459->362|2488->487|2517->632|2548->637|2587->667|2627->669|2660->675|2716->705|2731->711|2846->816|2887->818|2924->828|2963->840|2993->849|3022->851|3051->859|3180->998|3218->1009|3257->1027|3294->1037|3916->1629|3949->1635|3988->1644
                  LINES: 29->1|34->5|34->5|36->5|37->6|37->6|37->6|37->6|38->8|38->8|40->8|41->9|41->9|41->9|41->9|42->11|42->11|44->11|45->12|45->12|45->12|46->13|46->13|46->13|47->14|47->14|47->14|48->15|49->16|51->1|53->7|54->10|55->17|57->19|57->19|57->19|58->20|59->21|59->21|59->21|59->21|60->22|60->22|60->22|60->22|60->22|62->24|63->25|63->25|64->26|76->38|77->39|78->40
                  -- GENERATED --
              */
          