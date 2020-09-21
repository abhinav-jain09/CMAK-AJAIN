
package views.html.consumer

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

object consumerView extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[String,String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.ConsumerIdentity],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String,
  consumer: String,
  errorOrConsumerIdentity: kafka.manager.ApiError \/ kafka.manager.model.ActorModel.ConsumerIdentity
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*11.2*/theMenu/*11.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*11.13*/("""
    """),_display_(/*12.6*/views/*12.11*/.html.navigation.clusterMenu(cluster,"Consumer","",menus.clusterMenus(cluster)(
        errorOrConsumerIdentity.toOption.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*13.139*/("""
""")))};
Seq[Any](format.raw/*10.1*/("""
"""),format.raw/*14.2*/("""

"""),_display_(/*16.2*/main(
    "Consumer View",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withNamedViewAndCluster("Consumer View",cluster,consumer)))/*19.140*/ {_display_(Seq[Any](format.raw/*19.142*/("""
"""),format.raw/*20.1*/("""<div class="col-md-12 un-pad-me">
    <div class="card">
        <div class="card-header">
            <h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="octicon octicon-arrow-left" aria-hidden="true"></span></button>"""),_display_(/*23.156*/consumer),format.raw/*23.164*/("""</h3></div>
        <div class="card-body">
        """),_display_(/*25.10*/errorOrConsumerIdentity/*25.33*/.fold(views.html.errors.onApiError(_),views.html.consumer.consumerViewContent(cluster,consumer,_))),format.raw/*25.131*/("""
        """),format.raw/*26.9*/("""</div>
    </div>
</div>
""")))}),format.raw/*29.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,consumer:String,errorOrConsumerIdentity:$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.ConsumerIdentity],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,consumer,errorOrConsumerIdentity)(af,messages,menus,request)

  def f:((String,String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.ConsumerIdentity]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,consumer,errorOrConsumerIdentity) => (af,messages,menus,request) => apply(cluster,consumer,errorOrConsumerIdentity)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:51 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/consumer/consumerView.scala.html
                  HASH: 119ec2a3f3e0316c9f49ba3ea7d9ba62ef1cb8b8
                  MATRIX: 441->115|953->135|1303->409|1318->416|1399->420|1431->426|1445->431|1685->649|1726->407|1754->651|1783->654|1979->840|2020->842|2048->843|2322->1089|2352->1097|2432->1150|2464->1173|2584->1271|2620->1280|2676->1306
                  LINES: 17->5|22->6|29->11|29->11|31->11|32->12|32->12|33->13|35->10|36->14|38->16|41->19|41->19|42->20|45->23|45->23|47->25|47->25|47->25|48->26|51->29
                  -- GENERATED --
              */
          