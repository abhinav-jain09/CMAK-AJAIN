
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
/*5.2*/import kafka.manager.model.ActorModel.ConsumerType
/*6.2*/import models.form.ReassignPartitionOperation
/*7.2*/import models.form.ReassignPartitionOperation.ForceRunAssignment
/*8.2*/import kafka.manager.utils.LongFormatted

object topicViewContent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[String,String,kafka.manager.model.ActorModel.TopicIdentity,Iterable[scala.Tuple2[String, ConsumerType]],ReassignPartitionOperation,features.ApplicationFeatures,play.api.i18n.Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(cluster:String
, topic: String
, topicIdentity: kafka.manager.model.ActorModel.TopicIdentity
, consumerList: Iterable[(String, ConsumerType)]
, reassignPartitionOperation: ReassignPartitionOperation
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*16.2*/getUnderReplicatedLevel/*16.25*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.46*/("""
    """),_display_(/*17.6*/percentage/*17.16*/ match/*17.22*/ {/*18.9*/case i if i > 50 =>/*18.28*/ {_display_(Seq[Any](format.raw/*18.30*/("""table-danger""")))}/*19.9*/case i if i > 0 =>/*19.27*/ {_display_(Seq[Any](format.raw/*19.29*/("""table-warning""")))}/*20.9*/case i =>/*20.18*/ {}}),format.raw/*21.6*/("""
""")))};def /*24.2*/getPreferredReplicasLevel/*24.27*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*24.48*/("""
    """),_display_(/*25.6*/percentage/*25.16*/ match/*25.22*/ {/*26.9*/case i if i > 50 && i<=75 =>/*26.37*/ {_display_(Seq[Any](format.raw/*26.39*/("""table-warning""")))}/*27.9*/case i if i <=  50 =>/*27.30*/ {_display_(Seq[Any](format.raw/*27.32*/("""table-danger""")))}/*28.9*/case i =>/*28.18*/ {}}),format.raw/*29.6*/("""
""")))};def /*32.2*/getBrokersSkewedLevel/*32.23*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.44*/("""
    """),_display_(/*33.6*/percentage/*33.16*/ match/*33.22*/ {/*34.9*/case i if i > 0 && i <= 33 =>/*34.38*/ {_display_(Seq[Any](format.raw/*34.40*/("""table-warning""")))}/*35.9*/case i if i >= 34 =>/*35.29*/ {_display_(Seq[Any](format.raw/*35.31*/("""table-danger""")))}/*36.9*/case i =>/*36.18*/ {}}),format.raw/*37.6*/("""
""")))};def /*40.2*/getBrokersLeaderSkewedLevel/*40.29*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*40.50*/("""
    """),_display_(/*41.6*/percentage/*41.16*/ match/*41.22*/ {/*42.9*/case i if i > 0 && i <= 33 =>/*42.38*/ {_display_(Seq[Any](format.raw/*42.40*/("""table-warning""")))}/*43.9*/case i if i >= 34 =>/*43.29*/ {_display_(Seq[Any](format.raw/*43.31*/("""table-danger""")))}/*44.9*/case i =>/*44.18*/ {}}),format.raw/*45.6*/("""
""")))};def /*48.2*/getBrokersSpreadLevel/*48.23*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*48.44*/("""
    """),_display_(/*49.6*/percentage/*49.16*/ match/*49.22*/ {/*50.9*/case i if i > 50 && i<=75 =>/*50.37*/ {_display_(Seq[Any](format.raw/*50.39*/("""table-warning""")))}/*51.9*/case i if i <=  50 =>/*51.30*/ {_display_(Seq[Any](format.raw/*51.32*/("""table-danger""")))}/*52.9*/case i =>/*52.18*/ {}}),format.raw/*53.6*/("""
""")))};def /*56.2*/getPartitionLeaderLevel/*56.25*/(leader: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*56.42*/("""
    """),_display_(/*57.6*/leader/*57.12*/ match/*57.18*/ {/*58.9*/case i if i < 0 =>/*58.27*/ {_display_(Seq[Any](format.raw/*58.29*/("""table-danger""")))}/*59.9*/case i =>/*59.18*/ {}}),format.raw/*60.6*/("""
""")))};def /*63.2*/getIsUnderReplicatedLevel/*63.27*/(underReplicated: Boolean):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*63.57*/("""
    """),_display_(/*64.6*/underReplicated/*64.21*/ match/*64.27*/ {/*65.9*/case true =>/*65.21*/ {_display_(Seq[Any](format.raw/*65.23*/("""table-warning""")))}/*66.9*/case false =>/*66.22*/ {}}),format.raw/*67.6*/("""
""")))};def /*70.2*/getIsPreferredLeaderLevel/*70.27*/(preferredReplica: Boolean):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*70.58*/("""
    """),_display_(/*71.6*/preferredReplica/*71.22*/ match/*71.28*/ {/*72.9*/case false =>/*72.22*/ {_display_(Seq[Any](format.raw/*72.24*/("""table-warning""")))}/*73.9*/case true =>/*73.21*/ {}}),format.raw/*74.6*/("""
""")))};def /*77.2*/getBrokerIsSkewedLevel/*77.24*/(isSkewed: Boolean):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*77.47*/("""
    """),_display_(/*78.6*/isSkewed/*78.14*/ match/*78.20*/ {/*79.9*/case true =>/*79.21*/ {_display_(Seq[Any](format.raw/*79.23*/("""table-warning""")))}/*80.9*/case false =>/*80.22*/ {}}),format.raw/*81.6*/("""
""")))};def /*84.2*/renderTopicMetrics/*84.20*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*84.24*/("""
    """),_display_(/*85.6*/if(topicIdentity.clusterContext.clusterFeatures.features(kafka.manager.features.KMJMXMetricsFeature))/*85.107*/ {_display_(Seq[Any](format.raw/*85.109*/("""
        """),_display_(/*86.10*/views/*86.15*/.html.common.brokerMetrics(topicIdentity.metrics)),format.raw/*86.64*/("""
    """)))}/*87.7*/else/*87.12*/{_display_(Seq[Any](format.raw/*87.13*/("""
        """),format.raw/*88.9*/("""<div class="alert alert-info" role="alert">
            Please enable JMX polling <a href=""""),_display_(/*89.49*/routes/*89.55*/.Cluster.updateCluster(cluster)),format.raw/*89.86*/("""" class="alert-link">here</a>.
        </div>
    """)))}),format.raw/*91.6*/("""
""")))};def /*94.2*/renderConsumerList/*94.20*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*94.24*/("""
    """),_display_(/*95.6*/if(topicIdentity.clusterContext.config.pollConsumers)/*95.59*/{_display_(Seq[Any](format.raw/*95.60*/("""
        """),format.raw/*96.9*/("""<table class="table">
            <tbody>
            """),_display_(/*98.14*/for((c:String, ct: ConsumerType) <- consumerList) yield /*98.63*/ {_display_(Seq[Any](format.raw/*98.65*/("""
                """),format.raw/*99.17*/("""<tr>
                    <td><a href=""""),_display_(/*100.35*/routes/*100.41*/.Consumer.consumerAndTopic(cluster,c,topic, ct.toString)),format.raw/*100.97*/("""">"""),_display_(/*100.100*/c),format.raw/*100.101*/("""</a></td>
                    <td>"""),_display_(/*101.26*/ct/*101.28*/.toString),format.raw/*101.37*/("""</td>
                </tr>
            """)))}),format.raw/*103.14*/("""
            """),format.raw/*104.13*/("""</tbody>
        </table>
    """)))}/*106.7*/else/*106.12*/{_display_(Seq[Any](format.raw/*106.13*/("""
        """),format.raw/*107.9*/("""<div class="alert alert-info" role="alert">
            Please enable consumer polling <a href=""""),_display_(/*108.54*/routes/*108.60*/.Cluster.updateCluster(cluster)),format.raw/*108.91*/("""" class="alert-link">here</a>.
        </div>
    """)))}),format.raw/*110.6*/("""
""")))};
Seq[Any](format.raw/*15.1*/("""
"""),format.raw/*22.2*/("""

"""),format.raw/*30.2*/("""

"""),format.raw/*38.2*/("""

"""),format.raw/*46.2*/("""

"""),format.raw/*54.2*/("""

"""),format.raw/*61.2*/("""

"""),format.raw/*68.2*/("""

"""),format.raw/*75.2*/("""

"""),format.raw/*82.2*/("""

"""),format.raw/*92.2*/("""

"""),format.raw/*111.2*/("""


"""),format.raw/*114.1*/("""<div class="row">
    <div class="col-md-5">
        <div class="card">
            <div class="card-header"><h4>Topic Summary</h4></div>
            <div class="card-body">
            <table class="table">
                <tbody>
                <tr>
                    <td>Replication</td>
                    <td>"""),_display_(/*123.26*/topicIdentity/*123.39*/.replicationFactor),format.raw/*123.57*/("""</td>
                <tr>
                    <td>Number of Partitions</td>
                    <td>"""),_display_(/*126.26*/topicIdentity/*126.39*/.partitions),format.raw/*126.50*/("""</td>
                </tr>
                <tr>
                    <td><span title="Represents the theoretical size of the topic">Sum of partition offsets</span></td>
                    <td>"""),_display_(/*130.26*/topicIdentity/*130.39*/.summedTopicOffsets.formattedAsDecimal),format.raw/*130.77*/("""</td>
                </tr>
                <tr>
                    <td>Total number of Brokers</td>
                    <td>"""),_display_(/*134.26*/topicIdentity/*134.39*/.numBrokers),format.raw/*134.50*/("""</td>
                </tr>
                <tr>
                    <td>Number of Brokers for Topic</td>
                    <td>"""),_display_(/*138.26*/topicIdentity/*138.39*/.topicBrokers),format.raw/*138.52*/("""</td>
                </tr>
                <tr>
                    <td><span title="Percentage of replicas leader being preferred (first in the list of replicas)">Preferred Replicas %</span></td>
                    <td class=""""),_display_(/*142.33*/getPreferredReplicasLevel(topicIdentity.preferredReplicasPercentage)),format.raw/*142.101*/("""">
                        """),_display_(/*143.26*/topicIdentity/*143.39*/.preferredReplicasPercentage),format.raw/*143.67*/("""
                    """),format.raw/*144.21*/("""</td>
                </tr>
                <tr>
                    <td><span title="Percentage of brokers having more partitions than the average">Brokers Skewed %</span></td>
                    <td class=""""),_display_(/*148.33*/getBrokersSkewedLevel(topicIdentity.brokersSkewPercentage)),format.raw/*148.91*/("""">
                        """),_display_(/*149.26*/topicIdentity/*149.39*/.brokersSkewPercentage),format.raw/*149.61*/("""
                    """),format.raw/*150.21*/("""</td>
                </tr>
                <tr>
                    <td><span title="Percentage of brokers having more partitions as leader than the average">Brokers Leader Skewed %</span></td>
                    <td class=""""),_display_(/*154.33*/getBrokersLeaderSkewedLevel(topicIdentity.brokersLeaderSkewPercentage)),format.raw/*154.103*/("""">
                        """),_display_(/*155.26*/topicIdentity/*155.39*/.brokersLeaderSkewPercentage),format.raw/*155.67*/("""
                    """),format.raw/*156.21*/("""</td>
                </tr>
                <tr>
                    <td><span title="Percentage of cluster brokers having partitions from the topic">Brokers Spread %</span></td>
                    <td class=""""),_display_(/*160.33*/getBrokersSpreadLevel(topicIdentity.brokersSpreadPercentage)),format.raw/*160.93*/("""">
                        """),_display_(/*161.26*/topicIdentity/*161.39*/.brokersSpreadPercentage),format.raw/*161.63*/("""
                    """),format.raw/*162.21*/("""</td>
                </tr>
                <tr>
                    <td><span title="Percentage of partitions having a missing replica">Under-replicated %</span></td>
                    <td class=""""),_display_(/*166.33*/getUnderReplicatedLevel(topicIdentity.underReplicatedPercentage)),format.raw/*166.97*/("""">
                        """),_display_(/*167.26*/topicIdentity/*167.39*/.underReplicatedPercentage),format.raw/*167.65*/("""
                    """),format.raw/*168.21*/("""</td>
                </tr>
                """),_display_(/*170.18*/if(topicIdentity.clusterContext.config.jmxEnabled && topicIdentity.clusterContext.config.displaySizeEnabled)/*170.126*/{_display_(Seq[Any](format.raw/*170.127*/("""
                """),format.raw/*171.17*/("""<tr>
                    <td>Leader Size</td>
                    <td>"""),_display_(/*173.26*/topicIdentity/*173.39*/.size),format.raw/*173.44*/("""</td>
                </tr>
                """)))}),format.raw/*175.18*/("""
                """),format.raw/*176.17*/("""</tbody>
            </table>
            """),_display_(/*178.14*/if(!topicIdentity.config.isEmpty)/*178.47*/ {_display_(Seq[Any](format.raw/*178.49*/("""
            """),format.raw/*179.13*/("""<table class="table">
                <thead>
                <th>Config</th><th>Value</th>
                </thead>
                <tbody>
                """),_display_(/*184.18*/for( (k,v) <- topicIdentity.config) yield /*184.53*/ {_display_(Seq[Any](format.raw/*184.55*/("""
                """),format.raw/*185.17*/("""<tr>
                    <td>"""),_display_(/*186.26*/k),format.raw/*186.27*/("""</td>
                    <td>"""),_display_(/*187.26*/v),format.raw/*187.27*/("""</td>
                </tr>
                """)))}),format.raw/*189.18*/("""
                """),format.raw/*190.17*/("""</tbody>
            </table>
            """)))}),format.raw/*192.14*/("""
            """),format.raw/*193.13*/("""</div>
        </div>
        <div class="card">
            <div class="card-header"><h4>Metrics</h4></div>
            <div class="card-body">
            """),_display_(/*198.14*/renderTopicMetrics),format.raw/*198.32*/("""
            """),format.raw/*199.13*/("""</div>
        </div>
    </div>
    <div class="col-md-7">
        """),_display_(/*203.10*/features/*203.18*/.app(features.KMTopicManagerFeature)/*203.54*/ {_display_(Seq[Any](format.raw/*203.56*/("""
        """),format.raw/*204.9*/("""<div class="card">
            <div class="card-header"><h4>Operations</h4></div>
            <div class="card-body">
            <table class="table">
                <tbody>
                <tr>
                    """),_display_(/*210.22*/if(topicIdentity.clusterContext.clusterFeatures.features(kafka.manager.features.KMDeleteTopicFeature))/*210.124*/ {_display_(Seq[Any](format.raw/*210.126*/("""
                    """),format.raw/*211.21*/("""<td>
                        <a href=""""),_display_(/*212.35*/routes/*212.41*/.Topic.confirmDeleteTopic(cluster,topic)),format.raw/*212.81*/("""" class='btn btn-primary btn-block'>Delete Topic</a>
                    </td>
                    """)))}),format.raw/*214.22*/("""
                    """),_display_(/*215.22*/features/*215.30*/.app(features.KMReassignPartitionsFeature)/*215.72*/ {_display_(Seq[Any](format.raw/*215.74*/("""
                    """),format.raw/*216.21*/("""<td>
                        """),_display_(/*217.26*/b4/*217.28*/.vertical.form(routes.ReassignPartitions.handleOperation(cluster,topic))/*217.100*/ { implicit fc =>_display_(Seq[Any](format.raw/*217.117*/("""
                            """),_display_(/*218.30*/reassignPartitionOperation/*218.56*/ match/*218.62*/ {/*219.33*/case ForceRunAssignment =>/*219.59*/ {_display_(Seq[Any](format.raw/*219.61*/("""
                                    """),format.raw/*220.37*/("""<fieldset>
                                        <input type="hidden" name="operation" value="force">
                                        <input type="hidden" name="brokers" value=""""),_display_(/*222.85*/Seq()),format.raw/*222.90*/("""">
                                        """),_display_(/*223.42*/b4/*223.44*/.submit('class -> "btn btn-primary btn-block")/*223.90*/{_display_(Seq[Any](format.raw/*223.91*/(""" """),format.raw/*223.92*/("""Force Reassign Partitions """)))}),format.raw/*223.119*/("""
                                    """),format.raw/*224.37*/("""</fieldset>
                                """)))}/*226.33*/case _ =>/*226.42*/ {_display_(Seq[Any](format.raw/*226.44*/("""
                                    """),format.raw/*227.37*/("""<fieldset>
                                        <input type="hidden" name="operation" value="run">
                                        <input type="hidden" name="brokers" value=""""),_display_(/*229.85*/Seq()),format.raw/*229.90*/("""">
                                        """),_display_(/*230.42*/b4/*230.44*/.submit('class -> "btn btn-primary btn-block")/*230.90*/{_display_(Seq[Any](format.raw/*230.91*/(""" """),format.raw/*230.92*/("""Reassign Partitions """)))}),format.raw/*230.113*/("""
                                    """),format.raw/*231.37*/("""</fieldset>
                                """)))}}),format.raw/*233.30*/("""
                        """)))}),format.raw/*234.26*/("""
                    """),format.raw/*235.21*/("""</td>
                    <td>
                        <a href=""""),_display_(/*237.35*/routes/*237.41*/.ReassignPartitions.confirmAssignment(cluster,topic)),format.raw/*237.93*/("""" class="submit-button btn btn-primary" role="button">Generate Partition Assignments</a>
                    </td>
                    """)))}),format.raw/*239.22*/("""
                """),format.raw/*240.17*/("""</tr>
                <tr>
                    <td>
                        <a href=""""),_display_(/*243.35*/routes/*243.41*/.Topic.addPartitions(cluster,topic)),format.raw/*243.76*/("""" class="submit-button btn btn-primary" role="button">Add Partitions</a>
                    </td>
                    <td>
                        <a href=""""),_display_(/*246.35*/routes/*246.41*/.Topic.updateConfig(cluster,topic)),format.raw/*246.75*/("""" class="submit-button btn btn-primary" role="button">Update Config</a>
                    </td>
                    """),_display_(/*248.22*/features/*248.30*/.app(features.KMReassignPartitionsFeature)/*248.72*/ {_display_(Seq[Any](format.raw/*248.74*/("""
                    """),format.raw/*249.21*/("""<td>
                        <a href=""""),_display_(/*250.35*/routes/*250.41*/.ReassignPartitions.manualAssignments(cluster, topic)),format.raw/*250.94*/("""" class="submit-button btn btn-primary" role="button">Manual Partition Assignments</a>
                    </td>
                    """)))}),format.raw/*252.22*/("""
                """),format.raw/*253.17*/("""</tr>
                </tbody>
            </table>
            </div>
        </div>
        """)))}),format.raw/*258.10*/("""
        """),format.raw/*259.9*/("""<div class="card">
            <div class="card-header"><h4>Partitions by Broker</h4></div>
            <div class="card-body">
            <table class="table" style="table-layout: fixed; width: 100%">
                <thead>
                <tr><th>Broker</th><th># of Partitions</th><th># as Leader</th><th>Partitions</th><th><span title="Broker has more partitions than the average">Skewed?</span></th><th><span title="Broker has more partitions as leaders than the average">Leader Skewed?</span></th></tr>
                </thead>
                <tbody>
                """),_display_(/*267.18*/for(btp <- topicIdentity.partitionsByBroker) yield /*267.62*/ {_display_(Seq[Any](format.raw/*267.64*/("""
                """),format.raw/*268.17*/("""<tr>
                    <td><a href=""""),_display_(/*269.35*/routes/*269.41*/.Cluster.broker(cluster,btp.id)),format.raw/*269.72*/("""">"""),_display_(/*269.75*/btp/*269.78*/.id),format.raw/*269.81*/("""</a></td>
                    <td>"""),_display_(/*270.26*/btp/*270.29*/.partitions.size),format.raw/*270.45*/("""</td>
                    <td>"""),_display_(/*271.26*/btp/*271.29*/.leaders.size),format.raw/*271.42*/("""</td>
                    <td style="word-wrap: break-word">"""),_display_(/*272.56*/btp/*272.59*/.partitions.mkString("(",",",")")),format.raw/*272.92*/("""</td>
                    <td class=""""),_display_(/*273.33*/getBrokerIsSkewedLevel(btp.isSkewed)),format.raw/*273.69*/("""">
                        """),_display_(/*274.26*/btp/*274.29*/.isSkewed),format.raw/*274.38*/("""
                    """),format.raw/*275.21*/("""</td>
                    <td class=""""),_display_(/*276.33*/getBrokerIsSkewedLevel(btp.isLeaderSkewed)),format.raw/*276.75*/("""">
                        """),_display_(/*277.26*/btp/*277.29*/.isLeaderSkewed),format.raw/*277.44*/("""
                    """),format.raw/*278.21*/("""</td>
                </tr>
                """)))}),format.raw/*280.18*/("""
                """),format.raw/*281.17*/("""</tbody>
            </table>
            </div>
        </div>
        <div class="card">
            <div class="card-header"><h4>Consumers consuming from this topic</h4></div>
            <div class="card-body">
            """),_display_(/*288.14*/renderConsumerList),format.raw/*288.32*/("""
            """),format.raw/*289.13*/("""</div>
        </div>
    </div>
</div>
<div class="row">
    <div class="col-md-12">
        <div class="card">
            <div class="card-header"><h4>Partition Information</h4></div>
            <div class="card-body">
            <table class="table">
                <thead>
                <tr>
                    <th scope="col">Partition</th>
                    <th scope="col">Latest Offset</th>
                    <th scope="col">Leader</th>
                    <th scope="col">Replicas</th>
                    <th scope="col">In Sync Replicas</th>
                    <th scope="col">Preferred Leader?</th>
                    <th scope="col">Under Replicated?</th>
                    """),_display_(/*308.22*/if(topicIdentity.clusterContext.config.jmxEnabled && topicIdentity.clusterContext.config.displaySizeEnabled)/*308.130*/{_display_(Seq[Any](format.raw/*308.131*/("""
                    """),format.raw/*309.21*/("""<th scope="col">Leader Size</th>
                    """)))}),format.raw/*310.22*/("""
                """),format.raw/*311.17*/("""</tr>
                </thead>
                <tbody>
                """),_display_(/*314.18*/for((_,tpi) <- topicIdentity.partitionsIdentity.toIndexedSeq.sortBy(_._2.partNum)) yield /*314.100*/ {_display_(Seq[Any](format.raw/*314.102*/("""
                """),format.raw/*315.17*/("""<tr>
                    <th scope="row">"""),_display_(/*316.38*/tpi/*316.41*/.partNum),format.raw/*316.49*/("""</th>
                    <td>"""),_display_(/*317.26*/tpi/*317.29*/.latestOffset.map(_.formattedAsDecimal).getOrElse(" ")),format.raw/*317.83*/("""</td>
                    <td class=""""),_display_(/*318.33*/getPartitionLeaderLevel(tpi.leader)),format.raw/*318.68*/("""">
                        <a href=""""),_display_(/*319.35*/routes/*319.41*/.Cluster.broker(cluster,tpi.leader)),format.raw/*319.76*/("""">"""),_display_(/*319.79*/tpi/*319.82*/.leader),format.raw/*319.89*/("""</a>
                    </td>
                    <td style="word-wrap: break-word">"""),_display_(/*321.56*/tpi/*321.59*/.replicas.mkString("(", ",", ")")),format.raw/*321.92*/("""</td>
                    <td style="word-wrap: break-word">"""),_display_(/*322.56*/tpi/*322.59*/.isr.mkString("(", ",", ")")),format.raw/*322.87*/("""</td>
                    <td class=""""),_display_(/*323.33*/getIsPreferredLeaderLevel(tpi.isPreferredLeader)),format.raw/*323.81*/("""">
                        """),_display_(/*324.26*/tpi/*324.29*/.isPreferredLeader),format.raw/*324.47*/("""
                    """),format.raw/*325.21*/("""</td>
                    <td class=""""),_display_(/*326.33*/getIsUnderReplicatedLevel(tpi.isUnderReplicated)),format.raw/*326.81*/("""">
                        """),_display_(/*327.26*/tpi/*327.29*/.isUnderReplicated),format.raw/*327.47*/("""
                    """),format.raw/*328.21*/("""</td>
                    """),_display_(/*329.22*/if(topicIdentity.clusterContext.config.jmxEnabled && topicIdentity.clusterContext.config.displaySizeEnabled)/*329.130*/{_display_(Seq[Any](format.raw/*329.131*/("""
                    """),format.raw/*330.21*/("""<td>"""),_display_(/*330.26*/tpi/*330.29*/.size),format.raw/*330.34*/("""</td>
                    """)))}),format.raw/*331.22*/("""
                """),format.raw/*332.17*/("""</tr>
                """)))}),format.raw/*333.18*/("""
                """),format.raw/*334.17*/("""</tbody>
            </table>
            </div>
        </div>
    </div>
</div>
"""))
      }
    }
  }

  def render(cluster:String,topic:String,topicIdentity:kafka.manager.model.ActorModel.TopicIdentity,consumerList:Iterable[scala.Tuple2[String, ConsumerType]],reassignPartitionOperation:ReassignPartitionOperation,af:features.ApplicationFeatures,messages:play.api.i18n.Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,topic,topicIdentity,consumerList,reassignPartitionOperation)(af,messages,request)

  def f:((String,String,kafka.manager.model.ActorModel.TopicIdentity,Iterable[scala.Tuple2[String, ConsumerType]],ReassignPartitionOperation) => (features.ApplicationFeatures,play.api.i18n.Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,topic,topicIdentity,consumerList,reassignPartitionOperation) => (af,messages,request) => apply(cluster,topic,topicIdentity,consumerList,reassignPartitionOperation)(af,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/topic/topicViewContent.scala.html
                  HASH: 66ff2a6ca35379ce48d739892730085e0fcb1ef4
                  MATRIX: 438->115|496->167|549->214|621->280|1167->322|1547->626|1579->649|1677->670|1709->676|1728->686|1743->692|1753->703|1781->722|1821->724|1852->746|1879->764|1919->766|1951->789|1969->798|1993->807|2018->812|2052->837|2150->858|2182->864|2201->874|2216->880|2226->891|2263->919|2303->921|2335->944|2365->965|2405->967|2436->989|2454->998|2478->1007|2503->1012|2533->1033|2631->1054|2663->1060|2682->1070|2697->1076|2707->1087|2745->1116|2785->1118|2817->1141|2846->1161|2886->1163|2917->1185|2935->1194|2959->1203|2984->1208|3020->1235|3118->1256|3150->1262|3169->1272|3184->1278|3194->1289|3232->1318|3272->1320|3304->1343|3333->1363|3373->1365|3404->1387|3422->1396|3446->1405|3471->1410|3501->1431|3599->1452|3631->1458|3650->1468|3665->1474|3675->1485|3712->1513|3752->1515|3784->1538|3814->1559|3854->1561|3885->1583|3903->1592|3927->1601|3952->1606|3984->1629|4078->1646|4110->1652|4125->1658|4140->1664|4150->1675|4177->1693|4217->1695|4248->1717|4266->1726|4290->1735|4315->1740|4349->1765|4456->1795|4488->1801|4512->1816|4527->1822|4537->1833|4558->1845|4598->1847|4630->1870|4652->1883|4676->1892|4701->1897|4735->1922|4843->1953|4875->1959|4900->1975|4915->1981|4925->1992|4947->2005|4987->2007|5019->2030|5040->2042|5064->2051|5089->2056|5120->2078|5220->2101|5252->2107|5269->2115|5284->2121|5294->2132|5315->2144|5355->2146|5387->2169|5409->2182|5433->2191|5458->2196|5485->2214|5566->2218|5598->2224|5709->2325|5750->2327|5787->2337|5801->2342|5871->2391|5895->2398|5908->2403|5947->2404|5983->2413|6102->2505|6117->2511|6169->2542|6250->2593|6275->2598|6302->2616|6383->2620|6415->2626|6477->2679|6516->2680|6552->2689|6634->2744|6699->2793|6739->2795|6784->2812|6851->2851|6867->2857|6945->2913|6977->2916|7001->2917|7064->2952|7076->2954|7107->2963|7180->3004|7222->3017|7272->3049|7286->3054|7326->3055|7363->3064|7488->3161|7504->3167|7557->3198|7639->3249|7680->624|7708->809|7737->1009|7766->1205|7795->1407|7824->1603|7853->1737|7882->1894|7911->2053|7940->2193|7969->2595|7999->3251|8030->3254|8377->3573|8400->3586|8440->3604|8570->3706|8593->3719|8626->3730|8848->3924|8871->3937|8931->3975|9086->4102|9109->4115|9142->4126|9301->4257|9324->4270|9359->4283|9617->4513|9708->4581|9764->4609|9787->4622|9837->4650|9887->4671|10125->4881|10205->4939|10261->4967|10284->4980|10328->5002|10378->5023|10633->5250|10726->5320|10782->5348|10805->5361|10855->5389|10905->5410|11144->5621|11226->5681|11282->5709|11305->5722|11351->5746|11401->5767|11629->5967|11715->6031|11771->6059|11794->6072|11842->6098|11892->6119|11965->6164|12084->6272|12125->6273|12171->6290|12270->6361|12293->6374|12320->6379|12397->6424|12443->6441|12514->6484|12557->6517|12598->6519|12640->6532|12826->6690|12878->6725|12919->6727|12965->6744|13023->6774|13046->6775|13105->6806|13128->6807|13205->6852|13251->6869|13326->6912|13368->6925|13554->7083|13594->7101|13636->7114|13733->7183|13751->7191|13797->7227|13838->7229|13875->7238|14121->7456|14234->7558|14276->7560|14326->7581|14393->7620|14409->7626|14471->7666|14603->7766|14653->7788|14671->7796|14723->7838|14764->7840|14814->7861|14872->7891|14884->7893|14967->7965|15024->7982|15082->8012|15118->8038|15134->8044|15146->8079|15182->8105|15223->8107|15289->8144|15505->8332|15532->8337|15604->8381|15616->8383|15672->8429|15712->8430|15742->8431|15802->8458|15868->8495|15933->8573|15952->8582|15993->8584|16059->8621|16273->8807|16300->8812|16372->8856|16384->8858|16440->8904|16480->8905|16510->8906|16564->8927|16630->8964|16708->9039|16766->9065|16816->9086|16909->9151|16925->9157|16999->9209|17167->9345|17213->9362|17327->9448|17343->9454|17400->9489|17586->9647|17602->9653|17658->9687|17805->9806|17823->9814|17875->9856|17916->9858|17966->9879|18033->9918|18049->9924|18124->9977|18290->10111|18336->10128|18463->10223|18500->10232|19105->10809|19166->10853|19207->10855|19253->10872|19320->10911|19336->10917|19389->10948|19420->10951|19433->10954|19458->10957|19521->10992|19534->10995|19572->11011|19631->11042|19644->11045|19679->11058|19768->11119|19781->11122|19836->11155|19902->11193|19960->11229|20016->11257|20029->11260|20060->11269|20110->11290|20176->11328|20240->11370|20296->11398|20309->11401|20346->11416|20396->11437|20473->11482|20519->11499|20775->11727|20815->11745|20857->11758|21588->12461|21707->12569|21748->12570|21798->12591|21884->12645|21930->12662|22030->12734|22130->12816|22172->12818|22218->12835|22288->12877|22301->12880|22331->12888|22390->12919|22403->12922|22479->12976|22545->13014|22602->13049|22667->13086|22683->13092|22740->13127|22771->13130|22784->13133|22813->13140|22927->13226|22940->13229|22995->13262|23084->13323|23097->13326|23147->13354|23213->13392|23283->13440|23339->13468|23352->13471|23392->13489|23442->13510|23508->13548|23578->13596|23634->13624|23647->13627|23687->13645|23737->13666|23792->13693|23911->13801|23952->13802|24002->13823|24035->13828|24048->13831|24075->13836|24134->13863|24180->13880|24235->13903|24281->13920
                  LINES: 17->5|18->6|19->7|20->8|25->9|34->16|34->16|36->16|37->17|37->17|37->17|37->18|37->18|37->18|37->19|37->19|37->19|37->20|37->20|37->21|38->24|38->24|40->24|41->25|41->25|41->25|41->26|41->26|41->26|41->27|41->27|41->27|41->28|41->28|41->29|42->32|42->32|44->32|45->33|45->33|45->33|45->34|45->34|45->34|45->35|45->35|45->35|45->36|45->36|45->37|46->40|46->40|48->40|49->41|49->41|49->41|49->42|49->42|49->42|49->43|49->43|49->43|49->44|49->44|49->45|50->48|50->48|52->48|53->49|53->49|53->49|53->50|53->50|53->50|53->51|53->51|53->51|53->52|53->52|53->53|54->56|54->56|56->56|57->57|57->57|57->57|57->58|57->58|57->58|57->59|57->59|57->60|58->63|58->63|60->63|61->64|61->64|61->64|61->65|61->65|61->65|61->66|61->66|61->67|62->70|62->70|64->70|65->71|65->71|65->71|65->72|65->72|65->72|65->73|65->73|65->74|66->77|66->77|68->77|69->78|69->78|69->78|69->79|69->79|69->79|69->80|69->80|69->81|70->84|70->84|72->84|73->85|73->85|73->85|74->86|74->86|74->86|75->87|75->87|75->87|76->88|77->89|77->89|77->89|79->91|80->94|80->94|82->94|83->95|83->95|83->95|84->96|86->98|86->98|86->98|87->99|88->100|88->100|88->100|88->100|88->100|89->101|89->101|89->101|91->103|92->104|94->106|94->106|94->106|95->107|96->108|96->108|96->108|98->110|100->15|101->22|103->30|105->38|107->46|109->54|111->61|113->68|115->75|117->82|119->92|121->111|124->114|133->123|133->123|133->123|136->126|136->126|136->126|140->130|140->130|140->130|144->134|144->134|144->134|148->138|148->138|148->138|152->142|152->142|153->143|153->143|153->143|154->144|158->148|158->148|159->149|159->149|159->149|160->150|164->154|164->154|165->155|165->155|165->155|166->156|170->160|170->160|171->161|171->161|171->161|172->162|176->166|176->166|177->167|177->167|177->167|178->168|180->170|180->170|180->170|181->171|183->173|183->173|183->173|185->175|186->176|188->178|188->178|188->178|189->179|194->184|194->184|194->184|195->185|196->186|196->186|197->187|197->187|199->189|200->190|202->192|203->193|208->198|208->198|209->199|213->203|213->203|213->203|213->203|214->204|220->210|220->210|220->210|221->211|222->212|222->212|222->212|224->214|225->215|225->215|225->215|225->215|226->216|227->217|227->217|227->217|227->217|228->218|228->218|228->218|228->219|228->219|228->219|229->220|231->222|231->222|232->223|232->223|232->223|232->223|232->223|232->223|233->224|234->226|234->226|234->226|235->227|237->229|237->229|238->230|238->230|238->230|238->230|238->230|238->230|239->231|240->233|241->234|242->235|244->237|244->237|244->237|246->239|247->240|250->243|250->243|250->243|253->246|253->246|253->246|255->248|255->248|255->248|255->248|256->249|257->250|257->250|257->250|259->252|260->253|265->258|266->259|274->267|274->267|274->267|275->268|276->269|276->269|276->269|276->269|276->269|276->269|277->270|277->270|277->270|278->271|278->271|278->271|279->272|279->272|279->272|280->273|280->273|281->274|281->274|281->274|282->275|283->276|283->276|284->277|284->277|284->277|285->278|287->280|288->281|295->288|295->288|296->289|315->308|315->308|315->308|316->309|317->310|318->311|321->314|321->314|321->314|322->315|323->316|323->316|323->316|324->317|324->317|324->317|325->318|325->318|326->319|326->319|326->319|326->319|326->319|326->319|328->321|328->321|328->321|329->322|329->322|329->322|330->323|330->323|331->324|331->324|331->324|332->325|333->326|333->326|334->327|334->327|334->327|335->328|336->329|336->329|336->329|337->330|337->330|337->330|337->330|338->331|339->332|340->333|341->334
                  -- GENERATED --
              */
          