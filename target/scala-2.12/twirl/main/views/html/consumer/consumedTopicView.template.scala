
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

object consumedTopicView extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[String,String,String,String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.ConsumedTopicState],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String,
  consumer: String,
  consumerType: String,
  topic: String,
  errorOrConsumedTopicState: kafka.manager.ApiError \/ kafka.manager.model.ActorModel.ConsumedTopicState
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*13.2*/theMenu/*13.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.13*/("""
    """),_display_(/*14.6*/views/*14.11*/.html.navigation.clusterMenu(cluster,"Topic Consumption","",menus.clusterMenus(cluster)(
        errorOrConsumedTopicState.toOption.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*15.141*/("""
""")))};
Seq[Any](format.raw/*12.1*/("""
"""),format.raw/*16.2*/("""

"""),_display_(/*18.2*/main(
    "Consumed Topic View",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withNamedViewAndClusterAndConsumerWithType("Consumer View",cluster,consumer,consumerType,topic)))/*21.178*/ {_display_(Seq[Any](format.raw/*21.180*/("""
"""),format.raw/*22.1*/("""<div class="col-md-12 un-pad-me">
    <div class="card">
        <div class="card-header">
            <h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="octicon octicon-arrow-left" aria-hidden="true"></span></button>"""),_display_(/*25.156*/consumer),format.raw/*25.164*/(""" """),format.raw/*25.165*/("""/ """),_display_(/*25.168*/topic),format.raw/*25.173*/("""</h3></div>
        <div class="card-body">
        """),_display_(/*27.10*/errorOrConsumedTopicState/*27.35*/.fold(views.html.errors.onApiError(_),views.html.consumer.consumedTopicViewContent(cluster,consumer,topic,_))),format.raw/*27.144*/("""
        """),format.raw/*28.9*/("""</div>
    </div>
</div>
""")))}),format.raw/*31.2*/("""

"""))
      }
    }
  }

  def render(cluster:String,consumer:String,consumerType:String,topic:String,errorOrConsumedTopicState:$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.ConsumedTopicState],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,consumer,consumerType,topic,errorOrConsumedTopicState)(af,messages,menus,request)

  def f:((String,String,String,String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.ConsumedTopicState]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,consumer,consumerType,topic,errorOrConsumedTopicState) => (af,messages,menus,request) => apply(cluster,consumer,consumerType,topic,errorOrConsumedTopicState)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:51 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/consumer/consumedTopicView.scala.html
                  HASH: 6823b1a7c5c306eb6e7e3794c119e0ee9d682255
                  MATRIX: 441->115|974->135|1369->454|1384->461|1465->465|1497->471|1511->476|1762->705|1803->452|1831->707|1860->710|2100->940|2141->942|2169->943|2443->1189|2473->1197|2503->1198|2534->1201|2561->1206|2641->1259|2675->1284|2806->1393|2842->1402|2898->1428
                  LINES: 17->5|22->6|31->13|31->13|33->13|34->14|34->14|35->15|37->12|38->16|40->18|43->21|43->21|44->22|47->25|47->25|47->25|47->25|47->25|49->27|49->27|49->27|50->28|53->31
                  -- GENERATED --
              */
          