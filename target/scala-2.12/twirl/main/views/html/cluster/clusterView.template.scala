
package views.html.cluster

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

object clusterView extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.CMView],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster: String, errorOrClusterView: kafka.manager.ApiError \/ kafka.manager.model.ActorModel.CMView
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/theMenu/*9.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.13*/("""
    """),_display_(/*10.6*/views/*10.11*/.html.navigation.clusterMenu(cluster,"Cluster","Summary",menus.clusterMenus(cluster)(
        errorOrClusterView.toOption.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*11.134*/("""
""")))};
Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*12.2*/("""

"""),_display_(/*14.2*/main(
    "CMAK",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Summary",cluster)))/*17.120*/ {_display_(Seq[Any](format.raw/*17.122*/("""
"""),format.raw/*18.1*/("""<div class="col-md-6 un-pad-me">
    """),_display_(/*19.6*/errorOrClusterView/*19.24*/.fold(views.html.errors.onApiError(_),views.html.cluster.clusterViewContent(cluster,_))),format.raw/*19.111*/("""
"""),format.raw/*20.1*/("""</div>
""")))}),format.raw/*21.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,errorOrClusterView:$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.CMView],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrClusterView)(af,messages,menus,request)

  def f:((String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.CMView]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrClusterView) => (af,messages,menus,request) => apply(cluster,errorOrClusterView)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/cluster/clusterView.scala.html
                  HASH: 2221aa892324c615e340f2d2e0facb6e41eec339
                  MATRIX: 440->115|934->135|1247->373|1261->380|1341->384|1373->390|1387->395|1628->614|1668->371|1696->616|1725->619|1892->776|1933->778|1961->779|2025->817|2052->835|2161->922|2189->923|2227->931
                  LINES: 17->5|22->6|27->9|27->9|29->9|30->10|30->10|31->11|33->8|34->12|36->14|39->17|39->17|40->18|41->19|41->19|41->19|42->20|43->21
                  -- GENERATED --
              */
          