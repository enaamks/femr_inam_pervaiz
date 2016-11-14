
package femr.ui.views.html.partials.medical.tabs

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object photoTab_Scope0 {
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

class photoTab extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[femr.common.models.PhotoItem],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(photos: List[femr.common.models.PhotoItem]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.46*/("""

"""),format.raw/*3.1*/("""<div class="controlWrap hidden" id="photosControl">
    <div class="form-group">
        <label for="btnAddPhoto" class="control-label">Add Photo:</label>
        <div id="photoInputContainer">
            <input type="file" class="form-control" onchange="imageInputChange ( this )" placeholder="Choose Image" />
        </div>
    </div>
    <div id="patientImageList" class="row">
    """),_display_(/*11.6*/for(photoRec <- photos) yield /*11.29*/ {_display_(Seq[Any](format.raw/*11.31*/("""
        """),format.raw/*12.9*/("""<div class="col-xs-12 col-sm-6 col-md-4">
            <div class="thumbnail">
                <img src=""""),_display_(/*14.28*/photoRec/*14.36*/.getImageUrl),format.raw/*14.48*/("""">
                <div class="caption">
                    <div class="form-group">
                        <p name="photoDescription" >"""),_display_(/*17.54*/photoRec/*17.62*/.getImageDesc),format.raw/*17.75*/("""</p>
                        <div class="btn-group">
                            <button id="btnEditText" type="button" onclick="portraitEdit ( this )" class="btn btn-default btn-med">
                                <span class="glyphicon glyphicon-edit"></span> Edit Description
                            </button>
                        </div>
                        <div class="btn-group">
                            <button id="btnDeletePhoto" type="button" onclick="portraitDelete ( this )" class="btn btn-danger btn-med">
                                <span class="glyphicon glyphicon-trash"></span> Delete
                            </button>
                        </div>
                        <p>"""),_display_(/*28.29*/photoRec/*28.37*/.getImageDate),format.raw/*28.50*/("""</p>
                    </div>
                </div>
            </div>
                <!-- Data elements for server-side logic -->
            <div name="dataList" hidden="true">
                    <!-- Signals that user has requested to delete this photo from the database / server -->
                <input hidden="true" type="checkbox" name="deleteRequested" checked="false" value="false" />
                    <!-- Signals that the user has updated a description -->
                <input hidden="true" type="checkbox" name="hasUpdatedDesc" checked="false" value="false" />
                    <!-- Place holder for new images -->
                <input hidden="true" type="file" name="patientPhoto" />
                    <!-- text for POST -->
                <input hidden="true" type="text" name="imageDescText" value=""""),_display_(/*41.79*/photoRec/*41.87*/.getImageDesc),format.raw/*41.100*/("""" />
                    <!-- photo Id -->
                <input hidden="true" type="text" name="photoId" value=""""),_display_(/*43.73*/photoRec/*43.81*/.getId.toString),format.raw/*43.96*/("""" />
            </div>
        </div>
    """)))}),format.raw/*46.6*/("""

    """),format.raw/*48.5*/("""</div>
</div>"""))
      }
    }
  }

  def render(photos:List[femr.common.models.PhotoItem]): play.twirl.api.HtmlFormat.Appendable = apply(photos)

  def f:((List[femr.common.models.PhotoItem]) => play.twirl.api.HtmlFormat.Appendable) = (photos) => apply(photos)

  def ref: this.type = this

}


}

/**/
object photoTab extends photoTab_Scope0.photoTab
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 11:47:21 CST 2016
                  SOURCE: C:/Users/Inam Khan/Documents/GitHub/Assginement/femr_inam_pervaiz/app/femr/ui/views/partials/medical/tabs/photoTab.scala.html
                  HASH: 14b2bb309f7393e7525bc8f80018c67a7be5ff8a
                  MATRIX: 809->1|948->45|978->49|1400->445|1439->468|1479->470|1516->480|1650->587|1667->595|1700->607|1869->749|1886->757|1920->770|2676->1499|2693->1507|2727->1520|3603->2369|3620->2377|3655->2390|3799->2507|3816->2515|3852->2530|3929->2577|3964->2585
                  LINES: 27->1|32->1|34->3|42->11|42->11|42->11|43->12|45->14|45->14|45->14|48->17|48->17|48->17|59->28|59->28|59->28|72->41|72->41|72->41|74->43|74->43|74->43|77->46|79->48
                  -- GENERATED --
              */
          