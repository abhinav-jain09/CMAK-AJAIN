
package views.html.common

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
/*5.2*/import scalaz.{\/}

object resultsOfCommand extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[Html,IndexedSeq[models.navigation.BreadCrumbs.BreadCrumbRendered],$bslash$div[IndexedSeq[kafka.manager.ApiError], Unit],String,models.FollowLink,models.FollowLink,play.api.i18n.Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(theMenu: Html,
  crumbs: IndexedSeq[models.navigation.BreadCrumbs.BreadCrumbRendered],
  errorOrSuccess: IndexedSeq[kafka.manager.ApiError] \/ Unit,
  actionTitle: String,
  successLink: models.FollowLink,
  errorLink: models.FollowLink)(implicit messages: play.api.i18n.Messages, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*13.2*/link/*13.6*/(followLink: FollowLink):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.34*/("""
    """),format.raw/*14.5*/("""<div class="alert alert-success" role="alert">Done!</div>
    <div class="alert alert-info" role="alert">
        <a href=""""),_display_(/*16.19*/followLink/*16.29*/.url),format.raw/*16.33*/("""">"""),_display_(/*16.36*/followLink/*16.46*/.title),format.raw/*16.52*/("""</a>
    </div>
""")))};
Seq[Any](format.raw/*12.1*/("""
"""),format.raw/*18.2*/("""

"""),_display_(/*20.2*/main(actionTitle, menu = theMenu, breadcrumbs = views.html.navigation.breadCrumbs(crumbs))/*20.92*/ {_display_(Seq[Any](format.raw/*20.94*/("""

    """),format.raw/*22.5*/("""<div class="col-md-6 un-pad-me">
        <div class="card">
            <div class="card-header"><h3>"""),_display_(/*24.43*/actionTitle),format.raw/*24.54*/("""</h3></div>
            <div class="card-body">
            """),_display_(/*26.14*/errorOrSuccess/*26.28*/.fold( errs => errs.map(views.html.errors.onApiError(_, Some(errorLink))) , b => link(successLink))),format.raw/*26.127*/("""
            """),format.raw/*27.13*/("""</div>
        </div>
    </div>
""")))}),format.raw/*30.2*/("""
"""))
      }
    }
  }

  def render(theMenu:Html,crumbs:IndexedSeq[models.navigation.BreadCrumbs.BreadCrumbRendered],errorOrSuccess:$bslash$div[IndexedSeq[kafka.manager.ApiError], Unit],actionTitle:String,successLink:models.FollowLink,errorLink:models.FollowLink,messages:play.api.i18n.Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(theMenu,crumbs,errorOrSuccess,actionTitle,successLink,errorLink)(messages,request)

  def f:((Html,IndexedSeq[models.navigation.BreadCrumbs.BreadCrumbRendered],$bslash$div[IndexedSeq[kafka.manager.ApiError], Unit],String,models.FollowLink,models.FollowLink) => (play.api.i18n.Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (theMenu,crumbs,errorOrSuccess,actionTitle,successLink,errorLink) => (messages,request) => apply(theMenu,crumbs,errorOrSuccess,actionTitle,successLink,errorLink)(messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:51 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/common/resultsOfCommand.scala.html
                  HASH: 4b93b123b8f749cdffe2e10c350a2301fa1cd2f4
                  MATRIX: 439->115|966->135|1349->442|1361->446|1466->474|1498->479|1649->603|1668->613|1693->617|1723->620|1742->630|1769->636|1825->440|1853->653|1882->656|1981->746|2021->748|2054->754|2183->856|2215->867|2303->928|2326->942|2447->1041|2488->1054|2552->1088
                  LINES: 17->5|22->6|31->13|31->13|33->13|34->14|36->16|36->16|36->16|36->16|36->16|36->16|39->12|40->18|42->20|42->20|42->20|44->22|46->24|46->24|48->26|48->26|48->26|49->27|52->30
                  -- GENERATED --
              */
          