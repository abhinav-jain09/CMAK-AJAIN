
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

object consumerViewContent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,String,kafka.manager.model.ActorModel.ConsumerIdentity,play.api.i18n.Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(cluster:String, consumer: String, consumerIdentity: kafka.manager.model.ActorModel.ConsumerIdentity)(implicit messages: play.api.i18n.Messages, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/getTopicCoverage/*8.18*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.39*/("""
    """),_display_(/*9.6*/percentage/*9.16*/ match/*9.22*/ {/*10.9*/case i if i <=  99 =>/*10.30*/ {_display_(Seq[Any](format.raw/*10.32*/("""table-danger""")))}/*11.9*/case i =>/*11.18*/ {}}),format.raw/*12.6*/("""
""")))};implicit def /*7.2*/implicitFieldConstructor/*7.26*/ = {{ b4.vertical.fieldConstructor() }};
Seq[Any](format.raw/*6.1*/("""
"""),format.raw/*7.64*/("""
"""),format.raw/*13.2*/("""

"""),format.raw/*15.1*/("""<div class="row">
    <div class="col-md-12">
        <div class="card">
            <div class="card-header"><h4>Consumed Topic Information</h4></div>
            <div class="card-body">
            <table class="table">
                <thead>
                <tr><th>Topic</th><th>Partitions Covered %</th><th>Total Lag</th></tr>
                </thead>
                <tbody>
                """),_display_(/*25.18*/for((topic: String, state: kafka.manager.model.ActorModel.ConsumedTopicState) <- consumerIdentity.topicMap) yield /*25.125*/ {_display_(Seq[Any](format.raw/*25.127*/("""
                """),format.raw/*26.17*/("""<tr>
                    <td><a href=""""),_display_(/*27.35*/routes/*27.41*/.Consumer.consumerAndTopic(cluster, consumer, topic, consumerIdentity.consumerType.toString)),format.raw/*27.133*/("""">"""),_display_(/*27.136*/topic),format.raw/*27.141*/("""</a></td>
                    <td class=""""),_display_(/*28.33*/getTopicCoverage(state.percentageCovered)),format.raw/*28.74*/("""">
                        """),_display_(/*29.26*/state/*29.31*/.percentageCovered),format.raw/*29.49*/("""
                    """),format.raw/*30.21*/("""</td>
                    <td>"""),_display_(/*31.26*/state/*31.31*/.totalLag.getOrElse("not available")),format.raw/*31.67*/("""</td>
                </tr>
                """)))}),format.raw/*33.18*/("""
                """),format.raw/*34.17*/("""</tbody>
            </table>
            </div>
        </div>
    </div>
</div>
"""))
      }
    }
  }

  def render(cluster:String,consumer:String,consumerIdentity:kafka.manager.model.ActorModel.ConsumerIdentity,messages:play.api.i18n.Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,consumer,consumerIdentity)(messages,request)

  def f:((String,String,kafka.manager.model.ActorModel.ConsumerIdentity) => (play.api.i18n.Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,consumer,consumerIdentity) => (messages,request) => apply(cluster,consumer,consumerIdentity)(messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:51 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/consumer/consumerViewContent.scala.html
                  HASH: feeff4bd4da3656c0ed242c07d7caa2e57f4823a
                  MATRIX: 953->115|1198->349|1222->365|1319->386|1350->392|1368->402|1382->408|1392->419|1422->440|1462->442|1493->464|1511->473|1535->482|1568->285|1600->309|1667->283|1695->347|1723->484|1752->486|2178->885|2302->992|2343->994|2388->1011|2454->1050|2469->1056|2583->1148|2614->1151|2641->1156|2710->1198|2772->1239|2827->1267|2841->1272|2880->1290|2929->1311|2987->1342|3001->1347|3058->1383|3134->1428|3179->1445
                  LINES: 24->5|28->8|28->8|30->8|31->9|31->9|31->9|31->10|31->10|31->10|31->11|31->11|31->12|32->7|32->7|33->6|34->7|35->13|37->15|47->25|47->25|47->25|48->26|49->27|49->27|49->27|49->27|49->27|50->28|50->28|51->29|51->29|51->29|52->30|53->31|53->31|53->31|55->33|56->34
                  -- GENERATED --
              */
          