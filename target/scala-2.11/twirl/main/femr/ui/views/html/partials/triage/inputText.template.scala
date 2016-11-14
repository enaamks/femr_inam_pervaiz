
package femr.ui.views.html.partials.triage

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object inputText_Scope0 {
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

class inputText extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,String,Boolean,Object,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, forInput: String, required: Boolean, value: Object, tipe: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*2.6*/inputBlock/*2.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.20*/("""

        """),format.raw/*4.9*/("""<div class="generalInfoInput">
            """),_display_(/*5.14*/if(required == true)/*5.34*/ {_display_(Seq[Any](format.raw/*5.36*/("""
                """),format.raw/*6.17*/("""<label for=""""),_display_(/*6.30*/forInput),format.raw/*6.38*/("""">"""),_display_(/*6.41*/name),format.raw/*6.45*/(""" """),format.raw/*6.46*/("""<span class="red bold">*</span></label>
            """)))}/*7.15*/else/*7.20*/{_display_(Seq[Any](format.raw/*7.21*/("""
                """),format.raw/*8.17*/("""<label for=""""),_display_(/*8.30*/forInput),format.raw/*8.38*/("""">"""),_display_(/*8.41*/name),format.raw/*8.45*/("""</label>
            """)))}),format.raw/*9.14*/("""

            """),_display_(/*11.14*/if(value == null)/*11.31*/ {_display_(Seq[Any](format.raw/*11.33*/("""
                """),format.raw/*12.17*/("""<input type=""""),_display_(/*12.31*/tipe),format.raw/*12.35*/("""" class="fInput" id=""""),_display_(/*12.57*/forInput),format.raw/*12.65*/("""" name=""""),_display_(/*12.74*/forInput),format.raw/*12.82*/("""" placeholder=""""),_display_(/*12.98*/name),format.raw/*12.102*/("""">
            """)))}/*13.15*/else/*13.20*/{_display_(Seq[Any](format.raw/*13.21*/("""
                """),format.raw/*14.17*/("""<input type=""""),_display_(/*14.31*/tipe),format.raw/*14.35*/("""" class="fInput" id=""""),_display_(/*14.57*/forInput),format.raw/*14.65*/("""" name=""""),_display_(/*14.74*/forInput),format.raw/*14.82*/("""" value=""""),_display_(/*14.92*/value),format.raw/*14.97*/("""" readonly/>
            """)))}),format.raw/*15.14*/("""
        """),format.raw/*16.9*/("""</div>
    """)))};
Seq[Any](format.raw/*1.82*/("""
    """),format.raw/*17.6*/("""
"""),_display_(/*18.2*/inputBlock),format.raw/*18.12*/("""
"""))
      }
    }
  }

  def render(name:String,forInput:String,required:Boolean,value:Object,tipe:String): play.twirl.api.HtmlFormat.Appendable = apply(name,forInput,required,value,tipe)

  def f:((String,String,Boolean,Object,String) => play.twirl.api.HtmlFormat.Appendable) = (name,forInput,required,value,tipe) => apply(name,forInput,required,value,tipe)

  def ref: this.type = this

}


}

/**/
object inputText extends inputText_Scope0.inputText
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:21 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/triage/inputText.scala.html
                  HASH: 9bf3a54ba021d4e6ea5e326f650607db2f813680
                  MATRIX: 806->1|964->88|982->98|1062->102|1100->114|1171->159|1199->179|1238->181|1283->199|1322->212|1350->220|1379->223|1403->227|1431->228|1503->283|1515->288|1553->289|1598->307|1637->320|1665->328|1694->331|1718->335|1771->358|1815->375|1841->392|1881->394|1927->412|1968->426|1993->430|2042->452|2071->460|2107->469|2136->477|2179->493|2205->497|2241->515|2254->520|2293->521|2339->539|2380->553|2405->557|2454->579|2483->587|2519->596|2548->604|2585->614|2611->619|2669->646|2706->656|2758->81|2791->669|2820->672|2851->682
                  LINES: 27->1|31->2|31->2|33->2|35->4|36->5|36->5|36->5|37->6|37->6|37->6|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|39->8|39->8|40->9|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|45->14|45->14|45->14|46->15|47->16|49->1|50->17|51->18|51->18
                  -- GENERATED --
              */
          