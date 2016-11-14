
package femr.ui.views.html.partials.medical

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object dynamicField_Scope0 {
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

class dynamicField extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[java.lang.String,java.lang.String,java.lang.String,java.lang.Integer,java.lang.String,java.lang.String,Boolean,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(value: java.lang.String, name: java.lang.String, size: java.lang.String, order: java.lang.Integer, tipe: java.lang.String, placeholder: java.lang.String, isReadOnly: Boolean, index: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.193*/("""


"""),_display_(/*4.2*/if(size.toLowerCase == "medium")/*4.34*/ {_display_(Seq[Any](format.raw/*4.36*/("""
    """),format.raw/*5.5*/("""<label for=""""),_display_(/*5.18*/name),format.raw/*5.22*/("""">"""),_display_(/*5.25*/name),format.raw/*5.29*/("""</label>
    <input name="tabFieldItems["""),_display_(/*6.33*/index),format.raw/*6.38*/("""].name" class="hidden" type="text" value=""""),_display_(/*6.81*/name),format.raw/*6.85*/(""""/>
    <input name="tabFieldItems["""),_display_(/*7.33*/index),format.raw/*7.38*/("""].value" type="text" placeholder=""""),_display_(/*7.73*/placeholder),format.raw/*7.84*/("""" class="fInput customField" value=""""),_display_(/*7.121*/value),format.raw/*7.126*/("""""""),_display_(/*7.128*/if(isReadOnly)/*7.142*/{_display_(Seq[Any](format.raw/*7.143*/("""readonly""")))}),format.raw/*7.152*/("""/>
    <br/>
""")))}/*9.3*/else/*9.8*/{_display_(Seq[Any](format.raw/*9.9*/("""
    """),_display_(/*10.6*/if(size.toLowerCase == "large")/*10.37*/ {_display_(Seq[Any](format.raw/*10.39*/("""
        """),format.raw/*11.9*/("""<label for=""""),_display_(/*11.22*/name),format.raw/*11.26*/("""">"""),_display_(/*11.29*/name),format.raw/*11.33*/("""</label>
        <input type="text" class="hidden" name="tabFieldItems["""),_display_(/*12.64*/index),format.raw/*12.69*/("""].name" value=""""),_display_(/*12.85*/name),format.raw/*12.89*/(""""/>
        <textarea name="tabFieldItems["""),_display_(/*13.40*/index),format.raw/*13.45*/("""].value" class="fTextArea customField" placeholder=""""),_display_(/*13.98*/placeholder),format.raw/*13.109*/("""""""),_display_(/*13.111*/if(isReadOnly)/*13.125*/{_display_(Seq[Any](format.raw/*13.126*/("""readonly""")))}),format.raw/*13.135*/(""" """),format.raw/*13.136*/(""">"""),_display_(/*13.138*/value),format.raw/*13.143*/("""</textarea>

        <br/>
    """)))}),format.raw/*16.6*/("""
""")))}),format.raw/*17.2*/("""
"""))
      }
    }
  }

  def render(value:java.lang.String,name:java.lang.String,size:java.lang.String,order:java.lang.Integer,tipe:java.lang.String,placeholder:java.lang.String,isReadOnly:Boolean,index:Integer): play.twirl.api.HtmlFormat.Appendable = apply(value,name,size,order,tipe,placeholder,isReadOnly,index)

  def f:((java.lang.String,java.lang.String,java.lang.String,java.lang.Integer,java.lang.String,java.lang.String,Boolean,Integer) => play.twirl.api.HtmlFormat.Appendable) = (value,name,size,order,tipe,placeholder,isReadOnly,index) => apply(value,name,size,order,tipe,placeholder,isReadOnly,index)

  def ref: this.type = this

}


}

/**/
object dynamicField extends dynamicField_Scope0.dynamicField
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:21 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/medical/dynamicField.scala.html
                  HASH: 8e14d1dfb42d0a24c4a3812cc58f1b573d5d3546
                  MATRIX: 896->1|1183->192|1215->199|1255->231|1294->233|1326->239|1365->252|1389->256|1418->259|1442->263|1510->305|1535->310|1604->353|1628->357|1691->394|1716->399|1777->434|1808->445|1872->482|1898->487|1927->489|1950->503|1989->504|2029->513|2062->530|2073->535|2110->536|2143->543|2183->574|2223->576|2260->586|2300->599|2325->603|2355->606|2380->610|2480->683|2506->688|2549->704|2574->708|2645->752|2671->757|2751->810|2784->821|2814->823|2838->837|2878->838|2919->847|2949->848|2979->850|3006->855|3071->890|3104->893
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|38->7|38->7|38->7|38->7|38->7|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|44->13|47->16|48->17
                  -- GENERATED --
              */
          