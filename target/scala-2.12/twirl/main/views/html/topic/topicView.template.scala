
package views.html.topic

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
/*6.2*/import kafka.manager.model.ActorModel.ConsumerType
/*7.2*/import models.form.ReassignPartitionOperation

object topicView extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[String,String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.TopicIdentity],Option[Iterable[scala.Tuple2[String, ConsumerType]]],ReassignPartitionOperation,features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(cluster:String
, topic: String
, errorOrTopicIdentity: kafka.manager.ApiError \/ kafka.manager.model.ActorModel.TopicIdentity
, optConsumerList: Option[Iterable[(String, ConsumerType)]]
, reassignPartitionOperation: ReassignPartitionOperation
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*15.2*/theMenu/*15.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*15.13*/("""
    """),_display_(/*16.6*/views/*16.11*/.html.navigation.clusterMenu(cluster,"Topic","",menus.clusterMenus(cluster)(
        errorOrTopicIdentity.toOption.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*17.136*/("""
""")))};
Seq[Any](format.raw/*14.1*/("""
"""),format.raw/*18.2*/("""

"""),_display_(/*20.2*/main(
    "Topic View",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withNamedViewAndCluster("Topic View",cluster,topic)))/*23.134*/ {_display_(Seq[Any](format.raw/*23.136*/("""
"""),format.raw/*24.1*/("""<div class="col-md-12 un-pad-me">
    <div class="card">
        <div class="card-header">
            <h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="octicon octicon-arrow-left" aria-hidden="true"></span></button>"""),_display_(/*27.156*/topic),format.raw/*27.161*/("""</h3></div>
        <div class="card-body">
        """),_display_(/*29.10*/errorOrTopicIdentity/*29.30*/.fold(views.html.errors.onApiError(_),views.html.topic.topicViewContent(cluster,topic,_,optConsumerList.getOrElse(Iterable.empty[(String, ConsumerType)]), reassignPartitionOperation))),format.raw/*29.213*/("""
        """),format.raw/*30.9*/("""</div>
    </div>
</div>
""")))}),format.raw/*33.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,topic:String,errorOrTopicIdentity:$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.TopicIdentity],optConsumerList:Option[Iterable[scala.Tuple2[String, ConsumerType]]],reassignPartitionOperation:ReassignPartitionOperation,af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,topic,errorOrTopicIdentity,optConsumerList,reassignPartitionOperation)(af,messages,menus,request)

  def f:((String,String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.TopicIdentity],Option[Iterable[scala.Tuple2[String, ConsumerType]]],ReassignPartitionOperation) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,topic,errorOrTopicIdentity,optConsumerList,reassignPartitionOperation) => (af,messages,menus,request) => apply(cluster,topic,errorOrTopicIdentity,optConsumerList,reassignPartitionOperation)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/topic/topicView.scala.html
                  HASH: 11717a1d41baf550e38042b0ebcc7eb46945aa5e
                  MATRIX: 438->115|464->135|522->187|1135->234|1591->614|1606->621|1687->625|1719->631|1733->636|1967->848|2008->612|2036->850|2065->853|2252->1030|2293->1032|2321->1033|2595->1279|2622->1284|2702->1337|2731->1357|2936->1540|2972->1549|3028->1575
                  LINES: 17->5|18->6|19->7|24->8|33->15|33->15|35->15|36->16|36->16|37->17|39->14|40->18|42->20|45->23|45->23|46->24|49->27|49->27|51->29|51->29|51->29|52->30|55->33
                  -- GENERATED --
              */
          