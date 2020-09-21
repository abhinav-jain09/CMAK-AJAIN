
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
/*5.2*/import kafka.manager.utils.LongFormatted

object consumedTopicViewContent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,String,String,kafka.manager.model.ActorModel.ConsumedTopicState,play.api.i18n.Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String, consumer: String, topic: String, state: kafka.manager.model.ActorModel.ConsumedTopicState
)(implicit messages: play.api.i18n.Messages, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*11.2*/getTopicCoverage/*11.18*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*11.39*/("""
    """),_display_(/*12.6*/percentage/*12.16*/ match/*12.22*/ {/*13.9*/case i if i <=  99 =>/*13.30*/ {_display_(Seq[Any](format.raw/*13.32*/("""table-danger""")))}/*14.9*/case i =>/*14.18*/ {}}),format.raw/*15.6*/("""
""")))};def /*18.2*/ifPartitionNotOwned/*18.21*/(owner: Option[String]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*18.48*/("""
    """),_display_(/*19.6*/owner/*19.11*/ match/*19.17*/ {/*20.5*/case None =>/*20.17*/ {_display_(Seq[Any](format.raw/*20.19*/("""table-warning""")))}/*21.5*/case Some(a) =>/*21.20*/ {}}),format.raw/*22.6*/("""
""")))};implicit def /*10.2*/implicitFieldConstructor/*10.26*/ = {{ b4.vertical.fieldConstructor() }};
Seq[Any](format.raw/*8.1*/("""

"""),format.raw/*10.64*/("""
"""),format.raw/*16.2*/("""

"""),format.raw/*23.2*/("""

"""),format.raw/*25.1*/("""<div class="row">
    <div class="col-md-6">
        <div class="card">
            <div class="card-header"><h4>Topic Summary</h4></div>
            <div class="card-body">
            <table class="table">
                <tbody>
                <tr>
                    <td>Total Lag</td>
                    <td>"""),_display_(/*34.26*/state/*34.31*/.totalLag.map(_.formattedAsDecimal).getOrElse(" ")),format.raw/*34.81*/("""</td>
                </tr>
                <tr>
                    <td>% of Partitions assigned to a consumer instance</td>
                    <td class=""""),_display_(/*38.33*/getTopicCoverage(state.percentageCovered)),format.raw/*38.74*/("""">"""),_display_(/*38.77*/state/*38.82*/.percentageCovered),format.raw/*38.100*/("""</td>
                </tr>
                </tbody>
            </table>
            </div>
        </div>
    </div>
</div>
<div class="row">
    <div class="col-md-12">
        <div class="card">
            <div class="card-header"><h4><a href=""""),_display_(/*49.52*/routes/*49.58*/.Topic.topic(cluster,topic)),format.raw/*49.85*/("""">"""),_display_(/*49.88*/topic),format.raw/*49.93*/("""</a></h4></div>
            <div class="card-body">
            <table class="table">
                <thead>
                <tr><th>Partition</th><th>LogSize</th><th>Consumer Offset</th><th>Lag</th><th>Consumer Instance Owner</th></tr>
                </thead>
                <tbody>
                """),_display_(/*56.18*/for(tp:Int <- 0 until state.numPartitions) yield /*56.60*/ {_display_(Seq[Any](format.raw/*56.62*/("""
                """),format.raw/*57.17*/("""<tr>
                    <td>"""),_display_(/*58.26*/tp),format.raw/*58.28*/("""</td>
                    <td>"""),_display_(/*59.26*/state/*59.31*/.topicOffsets(tp).map(_.formattedAsDecimal).getOrElse(" ")),format.raw/*59.89*/("""</td>
                    <td>"""),_display_(/*60.26*/state/*60.31*/.partitionOffsets.get(tp).map(_.formattedAsDecimal).getOrElse(" ")),format.raw/*60.97*/("""</td>
                    <td>"""),_display_(/*61.26*/state/*61.31*/.partitionLag(tp).map(_.formattedAsDecimal).getOrElse(" ")),format.raw/*61.89*/("""</td>
                    <td class=""""),_display_(/*62.33*/ifPartitionNotOwned(state.partitionOwners.get(tp))),format.raw/*62.83*/("""">"""),_display_(/*62.86*/state/*62.91*/.partitionOwners.get(tp).getOrElse("None")),format.raw/*62.133*/("""</td>
                </tr>
                """)))}),format.raw/*64.18*/("""
                """),format.raw/*65.17*/("""</tbody>
            </table>
            </div>
        </div>
    </div>
</div>
"""))
      }
    }
  }

  def render(cluster:String,consumer:String,topic:String,state:kafka.manager.model.ActorModel.ConsumedTopicState,messages:play.api.i18n.Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,consumer,topic,state)(messages,request)

  def f:((String,String,String,kafka.manager.model.ActorModel.ConsumedTopicState) => (play.api.i18n.Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,consumer,topic,state) => (messages,request) => apply(cluster,consumer,topic,state)(messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:51 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/consumer/consumedTopicViewContent.scala.html
                  HASH: fb64b3cbdf8815cdf3f3ac182ea06dc159e62e9e
                  MATRIX: 441->115|906->157|1159->399|1184->415|1282->436|1314->442|1333->452|1348->458|1358->469|1388->490|1428->492|1459->514|1477->523|1501->532|1526->537|1554->556|1658->583|1690->589|1704->594|1719->600|1729->607|1750->619|1790->621|1822->640|1846->655|1870->664|1904->335|1937->359|2004->332|2034->397|2062->534|2091->666|2120->668|2464->985|2478->990|2549->1040|2734->1198|2796->1239|2826->1242|2840->1247|2880->1265|3157->1515|3172->1521|3220->1548|3250->1551|3276->1556|3607->1860|3665->1902|3705->1904|3750->1921|3807->1951|3830->1953|3888->1984|3902->1989|3981->2047|4039->2078|4053->2083|4140->2149|4198->2180|4212->2185|4291->2243|4356->2281|4427->2331|4457->2334|4471->2339|4535->2381|4611->2426|4656->2443
                  LINES: 17->5|22->6|27->11|27->11|29->11|30->12|30->12|30->12|30->13|30->13|30->13|30->14|30->14|30->15|31->18|31->18|33->18|34->19|34->19|34->19|34->20|34->20|34->20|34->21|34->21|34->22|35->10|35->10|36->8|38->10|39->16|41->23|43->25|52->34|52->34|52->34|56->38|56->38|56->38|56->38|56->38|67->49|67->49|67->49|67->49|67->49|74->56|74->56|74->56|75->57|76->58|76->58|77->59|77->59|77->59|78->60|78->60|78->60|79->61|79->61|79->61|80->62|80->62|80->62|80->62|80->62|82->64|83->65
                  -- GENERATED --
              */
          