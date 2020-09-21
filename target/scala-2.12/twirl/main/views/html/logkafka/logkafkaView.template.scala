
package views.html.logkafka

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

object logkafkaView extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[String,String,String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[kafka.manager.model.ActorModel.LogkafkaIdentity, kafka.manager.model.ClusterContext]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String,
  logkafka_id: String,
  log_path: String,
  errorOrLogkafkaIdentity: kafka.manager.ApiError \/ (kafka.manager.model.ActorModel.LogkafkaIdentity, kafka.manager.model.ClusterContext)
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*12.2*/theMenu/*12.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.13*/("""
    """),_display_(/*13.6*/views/*13.11*/.html.navigation.clusterMenu(cluster,"Logkafka","",menus.clusterMenus(cluster)(
        errorOrLogkafkaIdentity.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*14.127*/("""
""")))};
Seq[Any](format.raw/*11.1*/("""
"""),format.raw/*15.2*/("""

"""),_display_(/*17.2*/main(
    "Logkafka View",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withNamedViewAndCluster("Logkafka View",cluster,logkafka_id)))/*20.143*/ {_display_(Seq[Any](format.raw/*20.145*/("""
"""),format.raw/*21.1*/("""<div class="col-md-12 un-pad-me">
    <div class="card">
        <div class="card-header">
            <h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="octicon octicon-arrow-left" aria-hidden="true"></span></button>"""),_display_(/*24.156*/logkafka_id),format.raw/*24.167*/("""<br/>"""),_display_(/*24.173*/log_path),format.raw/*24.181*/("""</h3></div>
        """),_display_(/*25.10*/errorOrLogkafkaIdentity/*25.33*/.fold(views.html.errors.onApiError(_), t => views.html.logkafka.logkafkaViewContent(cluster,logkafka_id,log_path,t._1))),format.raw/*25.152*/("""
    """),format.raw/*26.5*/("""</div>
</div>
""")))}),format.raw/*28.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,logkafka_id:String,log_path:String,errorOrLogkafkaIdentity:$bslash$div[kafka.manager.ApiError, scala.Tuple2[kafka.manager.model.ActorModel.LogkafkaIdentity, kafka.manager.model.ClusterContext]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,logkafka_id,log_path,errorOrLogkafkaIdentity)(af,messages,menus,request)

  def f:((String,String,String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[kafka.manager.model.ActorModel.LogkafkaIdentity, kafka.manager.model.ClusterContext]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,logkafka_id,log_path,errorOrLogkafkaIdentity) => (af,messages,menus,request) => apply(cluster,logkafka_id,log_path,errorOrLogkafkaIdentity)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/logkafka/logkafkaView.scala.html
                  HASH: 77e69c55ea39cce74c520084d73509e9931c375b
                  MATRIX: 441->115|1010->135|1421->470|1436->477|1517->481|1549->487|1563->492|1791->698|1832->468|1860->700|1889->703|2088->892|2129->894|2157->895|2431->1141|2464->1152|2498->1158|2528->1166|2576->1187|2608->1210|2749->1329|2781->1334|2826->1349
                  LINES: 17->5|22->6|30->12|30->12|32->12|33->13|33->13|34->14|36->11|37->15|39->17|42->20|42->20|43->21|46->24|46->24|46->24|46->24|47->25|47->25|47->25|48->26|50->28
                  -- GENERATED --
              */
          