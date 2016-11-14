
package femr.ui.views.html.partials.medical

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object problemField_Scope0 {
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

class problemField extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Integer,femr.common.models.TabFieldItem,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(number: Integer, problemField: femr.common.models.TabFieldItem):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.66*/("""

"""),_display_(/*3.2*/if(number == 0)/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
    """),_display_(/*4.6*/if(problemField != null)/*4.30*/ {_display_(Seq[Any](format.raw/*4.32*/("""

        """),format.raw/*6.9*/("""<div class="problem">
            <input id="problem"""),_display_(/*7.32*/number),format.raw/*7.38*/("""" type="text" class="form-control input-sm" value=""""),_display_(/*7.90*/problemField/*7.102*/.getValue),format.raw/*7.111*/("""" readonly/>
        </div>
    """)))}/*9.7*/else/*9.12*/{_display_(Seq[Any](format.raw/*9.13*/("""

        """),format.raw/*11.9*/("""<div id="problem"""),_display_(/*11.26*/number),format.raw/*11.32*/("""-container" class="problem">
            <input id="problem"""),_display_(/*12.32*/number),format.raw/*12.38*/("""" name="problem"""),_display_(/*12.54*/number),format.raw/*12.60*/("""" type="text" class="form-control input-sm" value=""/>
        </div>
    """)))}),format.raw/*14.6*/("""
""")))}/*15.3*/else/*15.8*/{_display_(Seq[Any](format.raw/*15.9*/("""
    """),_display_(/*16.6*/if(problemField != null)/*16.30*/ {_display_(Seq[Any](format.raw/*16.32*/("""

        """),format.raw/*18.9*/("""<div id="problem"""),_display_(/*18.26*/number),format.raw/*18.32*/("""-container" class="problem">
            <input id="problem"""),_display_(/*19.32*/number),format.raw/*19.38*/("""" type="text" class="form-control input-sm" value=""""),_display_(/*19.90*/problemField/*19.102*/.getValue),format.raw/*19.111*/("""" readonly/>
        </div>
    """)))}/*21.7*/else/*21.12*/{_display_(Seq[Any](format.raw/*21.13*/("""

        """),format.raw/*23.9*/("""<div id="problem"""),_display_(/*23.26*/number),format.raw/*23.32*/("""-container" class="problem hidden">
            <input id="problem"""),_display_(/*24.32*/number),format.raw/*24.38*/("""" name="problem"""),_display_(/*24.54*/number),format.raw/*24.60*/("""" type="text" class="form-control input-sm" value=""/>
        </div>
    """)))}),format.raw/*26.6*/("""
""")))}))
      }
    }
  }

  def render(number:Integer,problemField:femr.common.models.TabFieldItem): play.twirl.api.HtmlFormat.Appendable = apply(number,problemField)

  def f:((Integer,femr.common.models.TabFieldItem) => play.twirl.api.HtmlFormat.Appendable) = (number,problemField) => apply(number,problemField)

  def ref: this.type = this

}


}

/**/
object problemField extends problemField_Scope0.problemField
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:21 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/medical/problemField.scala.html
                  HASH: d487d6f4c47e508954b7da09c1c976219cb3b2f9
                  MATRIX: 817->1|976->65|1006->70|1029->85|1068->87|1100->94|1132->118|1171->120|1209->132|1289->186|1315->192|1393->244|1414->256|1444->265|1496->301|1508->306|1546->307|1585->319|1629->336|1656->342|1744->403|1771->409|1814->425|1841->431|1948->508|1969->512|1981->517|2019->518|2052->525|2085->549|2125->551|2164->563|2208->580|2235->586|2323->647|2350->653|2429->705|2451->717|2482->726|2535->762|2548->767|2587->768|2626->780|2670->797|2697->803|2792->871|2819->877|2862->893|2889->899|2996->976
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|37->6|38->7|38->7|38->7|38->7|38->7|40->9|40->9|40->9|42->11|42->11|42->11|43->12|43->12|43->12|43->12|45->14|46->15|46->15|46->15|47->16|47->16|47->16|49->18|49->18|49->18|50->19|50->19|50->19|50->19|50->19|52->21|52->21|52->21|54->23|54->23|54->23|55->24|55->24|55->24|55->24|57->26
                  -- GENERATED --
              */
          