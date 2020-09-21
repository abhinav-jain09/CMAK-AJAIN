
package views.html

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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.KMClusterList],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(errorOrClusters: kafka.manager.ApiError \/ kafka.manager.model.ActorModel.KMClusterList
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),_display_(/*9.2*/main(
    "CMAK",
    views.html.navigation.defaultMenu(views.html.navigation.menuNav("Cluster","List",menus.indexMenu)),
    views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withView("Clusters")))/*12.91*/ {_display_(Seq[Any](format.raw/*12.93*/("""
"""),format.raw/*13.1*/("""<div class="col-md-6 un-pad-me">
    <div class="card">
        <div class="card-header"><h3>Clusters</h3></div>
        <div class="card-body">
        """),_display_(/*17.10*/errorOrClusters/*17.25*/.fold(views.html.errors.onApiError(_), cl => {
            views.html.cluster.clusterList(cl.active)
        })),format.raw/*19.11*/("""
        """),_display_(/*20.10*/errorOrClusters/*20.25*/.fold( _ => Html(""), cl => {
            views.html.cluster.pendingClusterList(cl.pending)
        })),format.raw/*22.11*/("""
        """),format.raw/*23.9*/("""</div>
    </div>
</div>
""")))}),format.raw/*26.2*/("""
"""))
      }
    }
  }

  def render(errorOrClusters:$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.KMClusterList],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(errorOrClusters)(af,messages,menus,request)

  def f:(($bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.KMClusterList]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (errorOrClusters) => (af,messages,menus,request) => apply(errorOrClusters)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:51 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/index.scala.html
                  HASH: 438c74aeed71b9a5b4b15d8727ed592d6324ed8b
                  MATRIX: 432->115|920->135|1236->358|1263->360|1484->572|1524->574|1552->575|1733->729|1757->744|1889->855|1926->865|1950->880|2073->982|2109->991|2165->1017
                  LINES: 17->5|22->6|28->8|29->9|32->12|32->12|33->13|37->17|37->17|39->19|40->20|40->20|42->22|43->23|46->26
                  -- GENERATED --
              */
          