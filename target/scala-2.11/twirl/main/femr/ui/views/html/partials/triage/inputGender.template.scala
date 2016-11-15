
package femr.ui.views.html.partials.triage

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object inputGender_Scope0 {
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

class inputGender extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[femr.ui.models.triage.IndexViewModelGet,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(viewModel: femr.ui.models.triage.IndexViewModelGet):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import femr.ui.views.html.partials.triage.inputButton
def /*3.6*/inputBlock/*3.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.20*/("""
        """),format.raw/*4.9*/("""<div class="generalInfoInput">
            <label>Gender</label>
            <div class="btn-group" id="genderBtns" data-toggle="buttons">
                """),_display_(/*7.18*/inputButton("Male", "sex", "maleBtn",
                    if(viewModel != null) viewModel.getPatient.getSex == "" || viewModel.getPatient.getSex == null else true,
                    if(viewModel != null) viewModel.getPatient.getSex == "Male" else false,
                    "Male")),format.raw/*10.28*/("""
                """),_display_(/*11.18*/inputButton("Female", "sex", "femaleBtn",
                    if(viewModel != null) viewModel.getPatient.getSex == "" || viewModel.getPatient.getSex == null else true,
                    if(viewModel != null) viewModel.getPatient.getSex == "Female" else false,
                    "Female")),format.raw/*14.30*/("""
            """),format.raw/*15.13*/("""</div>
        </div>
    """)))};
Seq[Any](format.raw/*1.54*/("""
"""),format.raw/*3.1*/("""    """),format.raw/*17.6*/("""
"""),_display_(/*18.2*/inputBlock),format.raw/*18.12*/("""
"""))
      }
    }
  }

  def render(viewModel:femr.ui.models.triage.IndexViewModelGet): play.twirl.api.HtmlFormat.Appendable = apply(viewModel)

  def f:((femr.ui.models.triage.IndexViewModelGet) => play.twirl.api.HtmlFormat.Appendable) = (viewModel) => apply(viewModel)

  def ref: this.type = this

}


}

/**/
object inputGender extends inputGender_Scope0.inputGender
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 20:26:19 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/triage/inputGender.scala.html
                  HASH: bbfe0da51da0ea99fec882b1f2a423396d81a713
                  MATRIX: 814->1|997->116|1015->126|1095->130|1131->140|1316->299|1623->585|1669->604|1984->898|2026->912|2094->53|2122->111|2153->941|2182->944|2213->954
                  LINES: 27->1|31->3|31->3|33->3|34->4|37->7|40->10|41->11|44->14|45->15|48->1|49->3|49->17|50->18|50->18
                  -- GENERATED --
              */
          