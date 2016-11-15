
package femr.ui.views.html.admin.users

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

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[femr.common.dtos.CurrentUser,play.data.Form[femr.ui.models.admin.users.CreateViewModel],java.util.List[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: java.lang.String
},java.util.List[_$2] forSome { 
   type _$2 >: _root_.scala.Nothing <: java.lang.String
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser, form: play.data.Form[femr.ui.models.admin.users.CreateViewModel], messages: java.util.List[_ <: java.lang.String], availableRoles: java.util.List[_ <: java.lang.String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import views.html.helper.FieldConstructor
import femr.ui.views.html.partials.admin.inputFieldConstructor
import femr.ui.views.html.layouts.admin
import femr.ui.controllers.admin.routes.UsersController
def /*11.6*/additionalStyles/*11.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*11.26*/("""
        """),format.raw/*12.9*/("""<link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.versioned("css/admin/users.css")),format.raw/*12.85*/("""">
    """)))};def /*14.6*/additionalScripts/*14.23*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.27*/("""
        """),format.raw/*15.9*/("""<script type="text/javascript" src=""""),_display_(/*15.46*/routes/*15.52*/.Assets.versioned("js/admin/users.js")),format.raw/*15.90*/(""""></script>
    """)))};def /*17.6*/additionalMessages/*17.24*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.28*/("""
    """),_display_(/*18.6*/for(message <- messages) yield /*18.30*/ {_display_(Seq[Any](format.raw/*18.32*/("""
        """),format.raw/*19.9*/("""<p class="adminMessage">"""),_display_(/*19.34*/message),format.raw/*19.41*/("""</p>
    """)))}),format.raw/*20.6*/("""
    """)))};implicit def /*7.6*/implicitField/*7.19*/ = {{
        FieldConstructor(inputFieldConstructor.f)
    }};
Seq[Any](format.raw/*1.215*/("""

"""),format.raw/*7.1*/("""    """),format.raw/*9.6*/("""

    """),format.raw/*13.6*/("""
    """),format.raw/*16.6*/("""
    """),format.raw/*21.6*/("""

"""),_display_(/*23.2*/admin("Add User", currentUser, styles = additionalStyles, scripts = additionalScripts, message = additionalMessages)/*23.118*/ {_display_(Seq[Any](format.raw/*23.120*/("""
    """),format.raw/*24.5*/("""<div id="createWrap">
    """),_display_(/*25.6*/helper/*25.12*/.form(action = UsersController.createPost(), 'class -> "form-horizontal", 'name -> "createForm")/*25.108*/ {_display_(Seq[Any](format.raw/*25.110*/("""

        """),_display_(/*27.10*/helper/*27.16*/.inputText(form("email"),
            'class -> "fInput",
            'placeholder -> "Email Address",
            '_label -> "Email Address",
            '_isRequired -> true
        )),format.raw/*32.10*/("""

        """),_display_(/*34.10*/helper/*34.16*/.inputPassword(form("password"),
            'class -> "fInput",
            'placeholder -> "Password",
            '_label -> "Password",
            '_isRequired -> true
        )),format.raw/*39.10*/("""
"""),format.raw/*40.1*/("""<!-- added for FEMR-159 added by Vivek-->

        """),_display_(/*42.10*/helper/*42.16*/.inputPassword(form("passwordVerify"),
            'class -> "fInput",
            'placeholder -> "Verify Password",
            '_label -> null,
            'type -> "password"
        )),format.raw/*47.10*/("""

        """),_display_(/*49.10*/helper/*49.16*/.inputText(form("firstName"),
            'class -> "fInput",
            'placeholder -> "First Name",
            '_label -> "First Name",
            '_isRequired -> true
        )),format.raw/*54.10*/("""

        """),_display_(/*56.10*/helper/*56.16*/.inputText(form("lastName"),
            'class -> "fInput",
            'placeholder -> "Last Name",
            '_label -> "Last Name",
            '_isRequired -> false
        )),format.raw/*61.10*/("""

        """),_display_(/*63.10*/helper/*63.16*/.inputText(form("notes"),
            'class -> "fInput",
            'placeholder -> "About User",
            '_label -> "About User",
            '_isRequired -> false
        )),format.raw/*68.10*/("""

        """),format.raw/*70.9*/("""<div id="roleWrap">
            <label for="roles">Roles<span id="roles" class="red bold">*</span></label>
            <span class="errors"></span>
            """),_display_(/*73.14*/for(error <- form("roles").errors) yield /*73.48*/ {_display_(Seq[Any](format.raw/*73.50*/("""
                """),format.raw/*74.17*/("""<p class="createUserError"> """),_display_(/*74.46*/error/*74.51*/.message),format.raw/*74.59*/("""</p>
            """)))}),format.raw/*75.14*/("""

            """),format.raw/*77.13*/("""<br/>
            """),_display_(/*78.14*/for(role <- availableRoles) yield /*78.41*/ {_display_(Seq[Any](format.raw/*78.43*/("""
                """),format.raw/*79.17*/("""<label class="btn btn-default">
                    <input type="checkbox" name="roles[]" value=""""),_display_(/*80.67*/role),format.raw/*80.71*/(""""> """),_display_(/*80.75*/role),format.raw/*80.79*/("""
                """),format.raw/*81.17*/("""</label>
                <br/>
            """)))}),format.raw/*83.14*/("""
        """),format.raw/*84.9*/("""</div>
    </div>
    <button class="fButton fSubmitButton" id="addUserSubmitBtn" type="submit">Submit</button>
""")))}),format.raw/*87.2*/("""
""")))}))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,form:play.data.Form[femr.ui.models.admin.users.CreateViewModel],messages:java.util.List[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: java.lang.String
},availableRoles:java.util.List[_$2] forSome { 
   type _$2 >: _root_.scala.Nothing <: java.lang.String
}): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,form,messages,availableRoles)

  def f:((femr.common.dtos.CurrentUser,play.data.Form[femr.ui.models.admin.users.CreateViewModel],java.util.List[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: java.lang.String
},java.util.List[_$2] forSome { 
   type _$2 >: _root_.scala.Nothing <: java.lang.String
}) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,form,messages,availableRoles) => apply(currentUser,form,messages,availableRoles)

  def ref: this.type = this

}


}

/**/
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:17 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/admin/users/create.scala.html
                  HASH: cf3d9f0660d5bc567ebf2d675d4b7e85f69f2c98
                  MATRIX: 1030->1|1522->517|1547->533|1628->537|1665->547|1722->577|1737->583|1798->623|1830->639|1856->656|1937->660|1974->670|2038->707|2053->713|2112->751|2153->776|2180->794|2261->798|2294->805|2334->829|2374->831|2411->841|2463->866|2491->873|2532->884|2570->432|2591->445|2685->214|2715->427|2745->508|2780->632|2813->769|2846->891|2877->896|3003->1012|3044->1014|3077->1020|3131->1048|3146->1054|3252->1150|3293->1152|3333->1165|3348->1171|3559->1361|3599->1374|3614->1380|3822->1567|3851->1569|3932->1623|3947->1629|4161->1822|4201->1835|4216->1841|4425->2029|4465->2042|4480->2048|4687->2234|4727->2247|4742->2253|4948->2438|4987->2450|5178->2614|5228->2648|5268->2650|5314->2668|5370->2697|5384->2702|5413->2710|5463->2729|5507->2745|5554->2765|5597->2792|5637->2794|5683->2812|5809->2911|5834->2915|5865->2919|5890->2923|5936->2941|6013->2987|6050->2997|6196->3113
                  LINES: 31->1|38->11|38->11|40->11|41->12|41->12|41->12|41->12|42->14|42->14|44->14|45->15|45->15|45->15|45->15|46->17|46->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|52->7|52->7|55->1|57->7|57->9|59->13|60->16|61->21|63->23|63->23|63->23|64->24|65->25|65->25|65->25|65->25|67->27|67->27|72->32|74->34|74->34|79->39|80->40|82->42|82->42|87->47|89->49|89->49|94->54|96->56|96->56|101->61|103->63|103->63|108->68|110->70|113->73|113->73|113->73|114->74|114->74|114->74|114->74|115->75|117->77|118->78|118->78|118->78|119->79|120->80|120->80|120->80|120->80|121->81|123->83|124->84|127->87
                  -- GENERATED --
              */
          