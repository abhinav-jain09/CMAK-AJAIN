
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

object clusterViewContent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,kafka.manager.model.ActorModel.CMView,features.ApplicationFeatures,play.api.i18n.Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(cluster: String, clusterView: kafka.manager.model.ActorModel.CMView
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<div class="card">
    <div class="card-header"><h3>Cluster Information</h3></div>
    <div class="card-body">
    <table class="table">
        <tbody>
        """),_display_(/*13.10*/features/*13.18*/.app(features.KMClusterManagerFeature)/*13.56*/ {_display_(Seq[Any](format.raw/*13.58*/("""
        """),format.raw/*14.9*/("""<tr>
            <td><b>Zookeepers</b></td><td>"""),_display_(/*15.44*/clusterView/*15.55*/.clusterContext.config.curatorConfig.zkConnect.replace(","," ")),format.raw/*15.118*/("""</td>
        </tr>
        """)))}),format.raw/*17.10*/("""
        """),format.raw/*18.9*/("""<tr>
            <td><b>Version</b></td><td>"""),_display_(/*19.41*/clusterView/*19.52*/.clusterContext.config.version.toString),format.raw/*19.91*/("""</td>
        </tr>
        </tbody>
    </table>
    </div>
</div>
<div class="card">
    <div class="card-header"><h3>Cluster Summary</h3></div>
    <div class="card-body">
    <table class="table">
        <tbody>
        <tr>
            <td><b>Topics</b></td><td><a href=""""),_display_(/*31.49*/routes/*31.55*/.Topic.topics(cluster)),format.raw/*31.77*/("""">"""),_display_(/*31.80*/clusterView/*31.91*/.topicsCount),format.raw/*31.103*/("""</a></td>
            <td><b>Brokers</b></td><td><a href=""""),_display_(/*32.50*/routes/*32.56*/.Cluster.brokers(cluster)),format.raw/*32.81*/("""">"""),_display_(/*32.84*/clusterView/*32.95*/.brokersCount),format.raw/*32.108*/("""</a></td>
        </tr>
        </tbody>
    </table>
    </div>
</div>
"""))
      }
    }
  }

  def render(cluster:String,clusterView:kafka.manager.model.ActorModel.CMView,af:features.ApplicationFeatures,messages:play.api.i18n.Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,clusterView)(af,messages,request)

  def f:((String,kafka.manager.model.ActorModel.CMView) => (features.ApplicationFeatures,play.api.i18n.Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,clusterView) => (af,messages,request) => apply(cluster,clusterView)(af,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/cluster/clusterViewContent.scala.html
                  HASH: 789d753e73b69893adebc6a23dbd6e1d895f17ba
                  MATRIX: 963->115|1227->286|1254->287|1443->449|1460->457|1507->495|1547->497|1583->506|1658->554|1678->565|1763->628|1823->657|1859->666|1931->711|1951->722|2011->761|2316->1039|2331->1045|2374->1067|2404->1070|2424->1081|2458->1093|2544->1152|2559->1158|2605->1183|2635->1186|2655->1197|2690->1210
                  LINES: 24->5|30->7|31->8|36->13|36->13|36->13|36->13|37->14|38->15|38->15|38->15|40->17|41->18|42->19|42->19|42->19|54->31|54->31|54->31|54->31|54->31|54->31|55->32|55->32|55->32|55->32|55->32|55->32
                  -- GENERATED --
              */
          