
package femr.ui.views.html.errors

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object global_Scope0 {
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

class global extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.layouts.error
def /*4.6*/content/*4.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.17*/("""
        """),format.raw/*5.9*/("""<div id="errorMessage" style="text-align : center ;">
            <p>Oops! This was not supposed to happen.</p>
            <p>Whatever caused this has been logged and will be looked at by a nerd as soon as possible.</p>
            <p>Please click <a href="/">here</a> to return home.</p>
        </div>


    """)))};
Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*4.1*/("""    """),format.raw/*12.6*/("""
"""),_display_(/*13.2*/error(errorContent = content)))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object global extends global_Scope0.global
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/errors/global.scala.html
                  HASH: 9b68c0f00a1f83b89e0477c35c8037a1a3fb8c20
                  MATRIX: 755->1|874->54|889->61|969->65|1005->75|1362->3|1392->49|1423->394|1452->397
                  LINES: 27->1|31->4|31->4|33->4|34->5|42->1|44->4|44->12|45->13
                  -- GENERATED --
              */
          