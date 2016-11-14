
package femr.ui.views.html.layouts

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object error_Scope0 {
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

class error extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Html,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(styles: Html = Html(""), scripts: Html = Html(""), errorContent: Html = Html("")):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.84*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html class="no-js" xmlns="http://www.w3.org/1999/html">
    <head>
        <title>fEMR - Error</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("img/favicon.png")),format.raw/*10.101*/("""">
        <link rel="stylesheet" href=""""),_display_(/*11.39*/routes/*11.45*/.Assets.versioned("css/femr.css")),format.raw/*11.78*/(""""/>
        """),_display_(/*12.10*/styles),format.raw/*12.16*/("""
        """),format.raw/*13.9*/("""<script type="text/javascript" src=""""),_display_(/*13.46*/routes/*13.52*/.Assets.versioned("js/libraries/modernizr-2.6.2.min.js")),format.raw/*13.108*/(""""></script>
    </head>
    <body>

        """),_display_(/*17.10*/errorContent),format.raw/*17.22*/("""


    """),format.raw/*20.5*/("""<script type="text/javascript" src=""""),_display_(/*20.42*/routes/*20.48*/.Assets.versioned("js/libraries/jquery-2.0.3.min.js")),format.raw/*20.101*/(""""></script>
        """),_display_(/*21.10*/scripts),format.raw/*21.17*/("""
    """),format.raw/*22.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(styles:Html,scripts:Html,errorContent:Html): play.twirl.api.HtmlFormat.Appendable = apply(styles,scripts,errorContent)

  def f:((Html,Html,Html) => play.twirl.api.HtmlFormat.Appendable) = (styles,scripts,errorContent) => apply(styles,scripts,errorContent)

  def ref: this.type = this

}


}

/**/
object error extends error_Scope0.error
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:20 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/layouts/error.scala.html
                  HASH: b36c149640f36127466210a7601e98ba021ad4a2
                  MATRIX: 769->1|946->83|976->87|1343->427|1358->433|1416->469|1485->511|1500->517|1554->550|1595->564|1622->570|1659->580|1723->617|1738->623|1816->679|1892->728|1925->740|1962->750|2026->787|2041->793|2116->846|2165->868|2193->875|2226->881
                  LINES: 27->1|32->1|34->3|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|44->13|44->13|44->13|44->13|48->17|48->17|51->20|51->20|51->20|51->20|52->21|52->21|53->22
                  -- GENERATED --
              */
          