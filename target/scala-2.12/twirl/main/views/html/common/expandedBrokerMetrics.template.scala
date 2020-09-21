
package views.html.common

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

object expandedBrokerMetrics extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Option[kafka.manager.model.ActorModel.BrokerMetrics],play.api.i18n.Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(brokerMetrics: Option[kafka.manager.model.ActorModel.BrokerMetrics])(implicit messages: play.api.i18n.Messages, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<table class="table">
    <tr>
        <th>Rate</th>
        <th>Mean</th>
        <th>15&nbsp;min</th>
    </tr>
    <tr class="metric-row" name="messages in sec">
        <td>Messages in /sec</td>
        <td>
            <span class="badge">"""),_display_(/*11.34*/brokerMetrics/*11.47*/.map(_.messagesInPerSec.formatMeanRate)),format.raw/*11.86*/("""</span>
        </td>
        <td>
            <span class="badge">"""),_display_(/*14.34*/brokerMetrics/*14.47*/.map(_.messagesInPerSec.formatFifteenMinuteRate)),format.raw/*14.95*/("""</span>
        </td>
    <tr>
    <tr class="metric-row" name="bytes in sec">
        <td>Bytes in /sec</td>
        <td>
            <span class="badge">"""),_display_(/*20.34*/brokerMetrics/*20.47*/.map(_.bytesInPerSec.formatMeanRate)),format.raw/*20.83*/("""</span>
        </td>
        <td>
            <span class="badge">"""),_display_(/*23.34*/brokerMetrics/*23.47*/.map(_.bytesInPerSec.formatFifteenMinuteRate)),format.raw/*23.92*/("""</span>
        </td>
    <tr>
    <tr class="metric-row" name="bytes out sec">
        <td>Bytes out /sec</td>
        <td>
            <span class="badge">"""),_display_(/*29.34*/brokerMetrics/*29.47*/.map(_.bytesOutPerSec.formatMeanRate)),format.raw/*29.84*/("""</span>
        </td>
        <td>
            <span class="badge">"""),_display_(/*32.34*/brokerMetrics/*32.47*/.map(_.bytesOutPerSec.formatFifteenMinuteRate)),format.raw/*32.93*/("""</span>
        </td>
    <tr>
    <tr class="metric-row" name="bytes rejected sec">
        <td>Bytes rejected /sec</td>
        <td>
            <span class="badge">"""),_display_(/*38.34*/brokerMetrics/*38.47*/.map(_.bytesRejectedPerSec.formatMeanRate)),format.raw/*38.89*/("""</span>
        </td>
        <td>
            <span class="badge">"""),_display_(/*41.34*/brokerMetrics/*41.47*/.map(_.bytesRejectedPerSec.formatFifteenMinuteRate)),format.raw/*41.98*/("""</span>
        </td>
    <tr>
    <tr class="metric-row" name="failed fetch request sec">
        <td>Failed fetch request /sec</td>
        <td>
            <span class="badge">"""),_display_(/*47.34*/brokerMetrics/*47.47*/.map(_.failedFetchRequestsPerSec.formatMeanRate)),format.raw/*47.95*/("""</span>
        </td>
        <td>
            <span class="badge">"""),_display_(/*50.34*/brokerMetrics/*50.47*/.map(_.failedFetchRequestsPerSec.formatFifteenMinuteRate)),format.raw/*50.104*/("""</span>
        </td>
    <tr>
    <tr class="metric-row" name="failed produce request">
        <td>Failed produce request /sec</td>
        <td>
            <span class="badge">"""),_display_(/*56.34*/brokerMetrics/*56.47*/.map(_.failedProduceRequestsPerSec.formatMeanRate)),format.raw/*56.97*/("""</span>
        </td>
        <td>
            <span class="badge">"""),_display_(/*59.34*/brokerMetrics/*59.47*/.map(_.failedProduceRequestsPerSec.formatFifteenMinuteRate)),format.raw/*59.106*/("""</span>
        </td>
    <tr>
    <tr class="metric-row" name="process cpu load">
        <td>Process CPU Load</td>
        <td>
            <span class="badge">"""),_display_(/*65.34*/brokerMetrics/*65.47*/.map(_.oSystemMetrics.formatProcessCpuLoad)),format.raw/*65.90*/("""</span>
        </td>
        <td></td>
    <tr>
    <tr class="metric-row" name="system cpu load">
        <td>System CPU Load</td>
        <td>
            <span class="badge">"""),_display_(/*72.34*/brokerMetrics/*72.47*/.map(_.oSystemMetrics.formatSystemCpuLoad)),format.raw/*72.89*/("""</span>
        </td>
        <td></td>
    <tr>
</table>"""))
      }
    }
  }

  def render(brokerMetrics:Option[kafka.manager.model.ActorModel.BrokerMetrics],messages:play.api.i18n.Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(brokerMetrics)(messages,request)

  def f:((Option[kafka.manager.model.ActorModel.BrokerMetrics]) => (play.api.i18n.Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (brokerMetrics) => (messages,request) => apply(brokerMetrics)(messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:51 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/common/expandedBrokerMetrics.scala.html
                  HASH: 71e201b3a6f83c73f3252e539af8d943bbcd942a
                  MATRIX: 835->1|1064->137|1336->382|1358->395|1418->434|1513->502|1535->515|1604->563|1787->719|1809->732|1866->768|1961->836|1983->849|2049->894|2234->1052|2256->1065|2314->1102|2409->1170|2431->1183|2498->1229|2693->1397|2715->1410|2778->1452|2873->1520|2895->1533|2967->1584|3174->1764|3196->1777|3265->1825|3360->1893|3382->1906|3461->1963|3668->2143|3690->2156|3761->2206|3856->2274|3878->2287|3959->2346|4149->2509|4171->2522|4235->2565|4441->2744|4463->2757|4526->2799
                  LINES: 21->1|26->2|35->11|35->11|35->11|38->14|38->14|38->14|44->20|44->20|44->20|47->23|47->23|47->23|53->29|53->29|53->29|56->32|56->32|56->32|62->38|62->38|62->38|65->41|65->41|65->41|71->47|71->47|71->47|74->50|74->50|74->50|80->56|80->56|80->56|83->59|83->59|83->59|89->65|89->65|89->65|96->72|96->72|96->72
                  -- GENERATED --
              */
          