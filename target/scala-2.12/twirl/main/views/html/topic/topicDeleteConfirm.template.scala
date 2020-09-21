
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

object topicDeleteConfirm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[String,String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.TopicIdentity],Option[Iterable[scala.Tuple2[String, ConsumerType]]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(cluster:String,
  topic: String,
  errorOrTopicIdentity: kafka.manager.ApiError \/ kafka.manager.model.ActorModel.TopicIdentity,
  optConsumerList: Option[Iterable[(String, ConsumerType)]]
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*13.2*/theMenu/*13.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.13*/("""
    """),_display_(/*14.6*/views/*14.11*/.html.navigation.clusterMenu(cluster,"Topic","",menus.clusterMenus(cluster)(
        errorOrTopicIdentity.toOption.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*15.136*/("""
""")))};
Seq[Any](format.raw/*12.1*/("""
"""),format.raw/*16.2*/("""

"""),_display_(/*18.2*/main(
    "Topic Delete Confirm",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withNamedViewAndCluster("Topic Delete Confirm",cluster,topic)))/*21.144*/ {_display_(Seq[Any](format.raw/*21.146*/("""
"""),format.raw/*22.1*/("""<div class="col-md-12 un-pad-me">
    <div class="card">
        <div class="card-header">
            <h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="octicon octicon-arrow-left" aria-hidden="true"></span></button>"""),_display_(/*25.156*/topic),format.raw/*25.161*/("""</h3>
        <h3>Are you sure you want to delete """),_display_(/*26.46*/topic),format.raw/*26.51*/("""?</h3></div></br></br>
        <div class="row">
            <div class="col-md-3"><button type="button" class="btn btn-primary btn-block" onclick="goBack()">No</button></div>
            <div class="col-md-2">
                """),_display_(/*30.18*/b4/*30.20*/.vertical.form(routes.Topic.handleDeleteTopic(cluster, topic))/*30.82*/ { implicit fc =>_display_(Seq[Any](format.raw/*30.99*/("""
                    """),format.raw/*31.21*/("""<fieldset>
                        """),_display_(/*32.26*/b4/*32.28*/.hidden("topic",topic)),format.raw/*32.50*/("""
                        """),_display_(/*33.26*/b4/*33.28*/.submit('class -> "btn btn-primary btn-block")/*33.74*/{_display_(Seq[Any](format.raw/*33.75*/(""" """),format.raw/*33.76*/("""Delete Topic """)))}),format.raw/*33.90*/("""
                    """),format.raw/*34.21*/("""</fieldset>
                """)))}),format.raw/*35.18*/("""
            """),format.raw/*36.13*/("""</div>
        </div>
        </div>
    </div>
</div>
""")))}),format.raw/*41.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,topic:String,errorOrTopicIdentity:$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.TopicIdentity],optConsumerList:Option[Iterable[scala.Tuple2[String, ConsumerType]]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,topic,errorOrTopicIdentity,optConsumerList)(af,messages,menus,request)

  def f:((String,String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.TopicIdentity],Option[Iterable[scala.Tuple2[String, ConsumerType]]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,topic,errorOrTopicIdentity,optConsumerList) => (af,messages,menus,request) => apply(cluster,topic,errorOrTopicIdentity,optConsumerList)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/topic/topicDeleteConfirm.scala.html
                  HASH: be5fef1c8a3edbb30e205d47a120f004beff85b4
                  MATRIX: 438->115|464->135|1064->187|1466->513|1481->520|1562->524|1594->530|1608->535|1842->747|1883->511|1911->749|1940->752|2147->949|2188->951|2216->952|2490->1198|2517->1203|2595->1254|2621->1259|2876->1487|2887->1489|2958->1551|3013->1568|3062->1589|3125->1625|3136->1627|3179->1649|3232->1675|3243->1677|3298->1723|3337->1724|3366->1725|3411->1739|3460->1760|3520->1789|3561->1802|3647->1858
                  LINES: 17->5|18->6|23->7|31->13|31->13|33->13|34->14|34->14|35->15|37->12|38->16|40->18|43->21|43->21|44->22|47->25|47->25|48->26|48->26|52->30|52->30|52->30|52->30|53->31|54->32|54->32|54->32|55->33|55->33|55->33|55->33|55->33|55->33|56->34|57->35|58->36|63->41
                  -- GENERATED --
              */
          