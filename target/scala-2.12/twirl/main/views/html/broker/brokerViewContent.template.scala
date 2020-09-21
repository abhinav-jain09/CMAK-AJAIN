
package views.html.broker

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

object brokerViewContent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,Int,kafka.manager.model.ActorModel.BVView,play.api.i18n.Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(cluster: String, brokerId: Int, brokerView :kafka.manager.model.ActorModel.BVView)(implicit messages: play.api.i18n.Messages, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*7.2*/renderBrokerMetrics/*7.21*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.25*/("""
    """),_display_(/*8.6*/if(brokerView.clusterContext.clusterFeatures.features(kafka.manager.features.KMJMXMetricsFeature))/*8.104*/ {_display_(Seq[Any](format.raw/*8.106*/("""
        """),_display_(/*9.10*/views/*9.15*/.html.common.brokerMetrics(brokerView.metrics)),format.raw/*9.61*/("""
    """)))}/*10.7*/else/*10.12*/{_display_(Seq[Any](format.raw/*10.13*/("""
        """),format.raw/*11.9*/("""<div class="alert alert-info" role="alert">
            Please enable JMX polling <a href=""""),_display_(/*12.49*/routes/*12.55*/.Cluster.updateCluster(cluster).relative),format.raw/*12.95*/("""" class="alert-link">here</a>.
        </div>
    """)))}),format.raw/*14.6*/("""
""")))};
Seq[Any](format.raw/*6.1*/("""
"""),format.raw/*15.2*/("""

        """),format.raw/*17.9*/("""<div class="row">
            <div class="col-md-7">
                <div class="card">
                    <div class="card-header"><h4>Summary</h4></div>
                    <div class="card-body">
                    <table class="table">
                        <tbody>
                        <tr><td># of Topics</td><td>"""),_display_(/*24.54*/brokerView/*24.64*/.numTopics),format.raw/*24.74*/("""</td></tr>
                        <tr><td># of Partitions</td><td>"""),_display_(/*25.58*/brokerView/*25.68*/.numPartitions),format.raw/*25.82*/("""</td></tr>
                        <tr><td># of Partitions as Leader</td><td>"""),_display_(/*26.68*/brokerView/*26.78*/.numPartitionsAsLeader),format.raw/*26.100*/("""</td></tr>
                        """),_display_(/*27.26*/if(brokerView.clusterContext.clusterFeatures.features(kafka.manager.features.KMJMXMetricsFeature))/*27.124*/ {_display_(Seq[Any](format.raw/*27.126*/("""
                        """),format.raw/*28.25*/("""<tr><td>% of Messages</td><td>"""),_display_(/*28.56*/brokerView/*28.66*/.stats.map(_.perMessages)),format.raw/*28.91*/("""</td></tr>
                        <tr><td>% of Incoming</td><td>"""),_display_(/*29.56*/brokerView/*29.66*/.stats.map(_.perIncoming)),format.raw/*29.91*/("""</td></tr>
                        <tr><td>% of Outgoing</td><td>"""),_display_(/*30.56*/brokerView/*30.66*/.stats.map(_.perOutgoing)),format.raw/*30.91*/("""</td></tr>
                        """)))}),format.raw/*31.26*/("""
                        """),format.raw/*32.25*/("""</tbody>
                    </table>
                    </div>
                </div>
            </div>
            <div class="col-md-5">
                <div class="card">
                    <div class="card-header"><h4>Metrics</h4></div>
                    <div class="card-body">
                    """),_display_(/*41.22*/renderBrokerMetrics),format.raw/*41.41*/("""
                    """),format.raw/*42.21*/("""</div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-header"><h4>Messages count</h4></div>
                    <div class="card-body">
                    <div class="ct-chart"></div>
                    <script>
                        var options = """),format.raw/*53.39*/("""{"""),format.raw/*53.40*/("""
                            """),format.raw/*54.29*/("""axisY: """),format.raw/*54.36*/("""{"""),format.raw/*54.37*/("""
                                """),format.raw/*55.33*/("""type: Chartist.AutoScaleAxis,
                                low: """),_display_(/*56.39*/brokerView/*56.49*/.messagesPerSecCountHistory.map(v => v.head.count - 1).getOrElse(0)),format.raw/*56.116*/(""",
                                high: """),_display_(/*57.40*/brokerView/*57.50*/.messagesPerSecCountHistory.map(v => v.last.count + 1).getOrElse(0)),format.raw/*57.117*/(""",
                                onlyInteger: true
                            """),format.raw/*59.29*/("""}"""),format.raw/*59.30*/("""
                        """),format.raw/*60.25*/("""}"""),format.raw/*60.26*/(""";
                        var data = """),format.raw/*61.36*/("""{"""),format.raw/*61.37*/("""
                          """),format.raw/*62.27*/("""labels: ["""),_display_(/*62.37*/Html(brokerView.messagesPerSecCountHistory.map(_.map(v => s"'${v.date.toString("HH:mm:ss")}'").mkString(",")).getOrElse(""))),format.raw/*62.161*/("""],
                          series: [
                            ["""),_display_(/*64.31*/brokerView/*64.41*/.messagesPerSecCountHistory.map(_.map(_.count).mkString(","))),format.raw/*64.102*/("""]
                          ]
                        """),format.raw/*66.25*/("""}"""),format.raw/*66.26*/(""";
                        new Chartist.Line('.ct-chart', data, options);
                    </script>
                    </div>
                </div>
            </div>
        </div>
        <div class="card">
            <div class="card-header"><h4>Per Topic Detail</h4></div>
            <div class="card-body">
            <table class="table" id="broker-table" style="table-layout: fixed; width: 100%">
                <thead>
                <tr>
                    <th>Topic</th>
                    <th>Replication</th>
                    <th>Total Partitions</th>
                    <th>Partitions on Broker</th>
                    <th>Partitions</th>
                    <th><span title="Broker has more partitions than the average">Skewed?</span></th>
                    <th># Partitions as Leader</th>
                </tr>
                </thead>
                <tbody>
                """),_display_(/*89.18*/for((ti,bp) <- brokerView.topicPartitions) yield /*89.60*/ {_display_(Seq[Any](format.raw/*89.62*/("""
                """),format.raw/*90.17*/("""<tr>
                    <td><a href=""""),_display_(/*91.35*/routes/*91.41*/.Topic.topic(cluster,ti.topic)),format.raw/*91.71*/("""">"""),_display_(/*91.74*/ti/*91.76*/.topic),format.raw/*91.82*/("""</a></td>
                    <td>"""),_display_(/*92.26*/ti/*92.28*/.replicationFactor),format.raw/*92.46*/("""</td>
                    <td>"""),_display_(/*93.26*/ti/*93.28*/.partitions),format.raw/*93.39*/("""</td>
                    <td>"""),_display_(/*94.26*/bp/*94.28*/.partitions.size),format.raw/*94.44*/("""</td>
                    <td style="word-wrap: break-word">"""),_display_(/*95.56*/bp/*95.58*/.partitions.mkString("(",",",")")),format.raw/*95.91*/("""</td>
                    <td>"""),_display_(/*96.26*/ti/*96.28*/.partitionsByBroker.find(_.id == brokerId).map(_.isSkewed).getOrElse("Unknown")),format.raw/*96.107*/("""</td>
                    <td>"""),_display_(/*97.26*/bp/*97.28*/.partitionsAsLeader.size),format.raw/*97.52*/("""</td>
                </tr>
                """)))}),format.raw/*99.18*/("""
                """),format.raw/*100.17*/("""</tbody>
            </table>
            </div>
        </div>

"""))
      }
    }
  }

  def render(cluster:String,brokerId:Int,brokerView:kafka.manager.model.ActorModel.BVView,messages:play.api.i18n.Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,brokerId,brokerView)(messages,request)

  def f:((String,Int,kafka.manager.model.ActorModel.BVView) => (play.api.i18n.Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,brokerId,brokerView) => (messages,request) => apply(cluster,brokerId,brokerView)(messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/broker/brokerViewContent.scala.html
                  HASH: 6368879d6f0a99b312950ee9aae75c49c5d84441
                  MATRIX: 936->115|1163->267|1190->286|1270->290|1301->296|1408->394|1448->396|1484->406|1497->411|1563->457|1587->464|1600->469|1639->470|1675->479|1794->571|1809->577|1870->617|1951->668|1991->265|2019->670|2056->680|2410->1007|2429->1017|2460->1027|2555->1095|2574->1105|2609->1119|2714->1197|2733->1207|2777->1229|2840->1265|2948->1363|2989->1365|3042->1390|3100->1421|3119->1431|3165->1456|3258->1522|3277->1532|3323->1557|3416->1623|3435->1633|3481->1658|3548->1694|3601->1719|3938->2029|3978->2048|4027->2069|4451->2465|4480->2466|4537->2495|4572->2502|4601->2503|4662->2536|4757->2604|4776->2614|4865->2681|4933->2722|4952->2732|5041->2799|5149->2879|5178->2880|5231->2905|5260->2906|5325->2943|5354->2944|5409->2971|5446->2981|5592->3105|5688->3174|5707->3184|5790->3245|5872->3299|5901->3300|6839->4211|6897->4253|6937->4255|6982->4272|7048->4311|7063->4317|7114->4347|7144->4350|7155->4352|7182->4358|7244->4393|7255->4395|7294->4413|7352->4444|7363->4446|7395->4457|7453->4488|7464->4490|7501->4506|7589->4567|7600->4569|7654->4602|7712->4633|7723->4635|7824->4714|7882->4745|7893->4747|7938->4771|8014->4816|8060->4833
                  LINES: 24->5|28->7|28->7|30->7|31->8|31->8|31->8|32->9|32->9|32->9|33->10|33->10|33->10|34->11|35->12|35->12|35->12|37->14|39->6|40->15|42->17|49->24|49->24|49->24|50->25|50->25|50->25|51->26|51->26|51->26|52->27|52->27|52->27|53->28|53->28|53->28|53->28|54->29|54->29|54->29|55->30|55->30|55->30|56->31|57->32|66->41|66->41|67->42|78->53|78->53|79->54|79->54|79->54|80->55|81->56|81->56|81->56|82->57|82->57|82->57|84->59|84->59|85->60|85->60|86->61|86->61|87->62|87->62|87->62|89->64|89->64|89->64|91->66|91->66|114->89|114->89|114->89|115->90|116->91|116->91|116->91|116->91|116->91|116->91|117->92|117->92|117->92|118->93|118->93|118->93|119->94|119->94|119->94|120->95|120->95|120->95|121->96|121->96|121->96|122->97|122->97|122->97|124->99|125->100
                  -- GENERATED --
              */
          