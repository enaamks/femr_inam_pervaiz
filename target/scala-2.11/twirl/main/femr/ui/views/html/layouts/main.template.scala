
package femr.ui.views.html.layouts

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[String,femr.common.dtos.CurrentUser,Html,Html,Html,Html,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, currentUser: femr.common.dtos.CurrentUser = null,
        styles: Html = Html(""), scripts: Html = Html(""),
        outsideContainerTop: Html = Html(""), outsideContainerBottom: Html = Html(""), search: Html = Html(""))(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.partials.footer
import femr.ui.views.html.partials.header

Seq[Any](format.raw/*3.127*/("""

"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!DOCTYPE html>
<html class="no-js" xmlns="http://www.w3.org/1999/html">
    <head>
        <title>"""),_display_(/*11.17*/title),format.raw/*11.22*/(""" """),format.raw/*11.23*/("""| fEMR - The free EMR</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("img/favicon.png")),format.raw/*15.101*/("""">
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("css/libraries/bootstrap.min.css")),format.raw/*16.97*/("""">
        <link rel="stylesheet" href=""""),_display_(/*17.39*/routes/*17.45*/.Assets.versioned("css/femr.css")),format.raw/*17.78*/(""""/>
        """),_display_(/*18.10*/styles),format.raw/*18.16*/("""
        """),format.raw/*19.9*/("""<script type="text/javascript" src=""""),_display_(/*19.46*/routes/*19.52*/.Assets.versioned("js/libraries/modernizr-2.6.2.min.js")),format.raw/*19.108*/(""""></script>
    </head>
    <body>
        """),_display_(/*22.10*/header(currentUser)),format.raw/*22.29*/("""

        """),_display_(/*24.10*/outsideContainerTop),format.raw/*24.29*/("""

        """),format.raw/*26.9*/("""<div class="container">
            """),_display_(/*27.14*/search),format.raw/*27.20*/("""

            """),_display_(/*29.14*/content),format.raw/*29.21*/("""

            """),_display_(/*31.14*/footer()),format.raw/*31.22*/("""
        """),format.raw/*32.9*/("""</div>

        """),_display_(/*34.10*/outsideContainerBottom),format.raw/*34.32*/("""

        """),format.raw/*36.9*/("""<script type="text/javascript" src=""""),_display_(/*36.46*/routes/*36.52*/.Assets.versioned("js/libraries/jquery-2.0.3.min.js")),format.raw/*36.105*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*37.46*/routes/*37.52*/.Assets.versioned("js/libraries/bootstrap.min.js")),format.raw/*37.102*/(""""></script>
        <script type = "text/javascript" src=""""),_display_(/*38.48*/routes/*38.54*/.Assets.versioned("js/shared/femr.js")),format.raw/*38.92*/(""""></script>
        """),_display_(/*39.10*/scripts),format.raw/*39.17*/("""
    """),format.raw/*40.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,currentUser:femr.common.dtos.CurrentUser,styles:Html,scripts:Html,outsideContainerTop:Html,outsideContainerBottom:Html,search:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,currentUser,styles,scripts,outsideContainerTop,outsideContainerBottom,search)(content)

  def f:((String,femr.common.dtos.CurrentUser,Html,Html,Html,Html,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,currentUser,styles,scripts,outsideContainerTop,outsideContainerBottom,search) => (content) => apply(title,currentUser,styles,scripts,outsideContainerTop,outsideContainerBottom,search)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:20 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/layouts/main.scala.html
                  HASH: ac114712ee05f893658a79ba907c9622579b98d3
                  MATRIX: 818->1|1250->254|1280->346|1308->348|1438->451|1464->456|1493->457|1767->704|1782->710|1840->746|1909->788|1924->794|1997->846|2066->888|2081->894|2135->927|2176->941|2203->947|2240->957|2304->994|2319->1000|2397->1056|2471->1103|2511->1122|2551->1135|2591->1154|2630->1166|2695->1204|2722->1210|2766->1227|2794->1234|2838->1251|2867->1259|2904->1269|2950->1288|2993->1310|3032->1322|3096->1359|3111->1365|3186->1418|3271->1476|3286->1482|3358->1532|3445->1592|3460->1598|3519->1636|3568->1658|3596->1665|3629->1671
                  LINES: 27->1|35->3|37->7|38->8|41->11|41->11|41->11|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|49->19|49->19|49->19|49->19|52->22|52->22|54->24|54->24|56->26|57->27|57->27|59->29|59->29|61->31|61->31|62->32|64->34|64->34|66->36|66->36|66->36|66->36|67->37|67->37|67->37|68->38|68->38|68->38|69->39|69->39|70->40
                  -- GENERATED --
              */
          