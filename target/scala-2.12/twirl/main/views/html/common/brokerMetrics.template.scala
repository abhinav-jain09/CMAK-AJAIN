
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

object brokerMetrics extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Option[kafka.manager.model.ActorModel.BrokerMetrics],play.api.i18n.Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(brokerMetrics: Option[kafka.manager.model.ActorModel.BrokerMetrics])(implicit messages: play.api.i18n.Messages, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<table class="table">
  <thead>
    <tr>
      <th>Rate</th>
      <th>Mean</th>
      <th>1&nbsp;min</th>
      <th>5&nbsp;min</th>
      <th>15&nbsp;min</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Messages in /sec</td>
      <td>
        <span class="badge">"""),_display_(/*16.30*/brokerMetrics/*16.43*/.map(_.messagesInPerSec.formatMeanRate)),format.raw/*16.82*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*19.30*/brokerMetrics/*19.43*/.map(_.messagesInPerSec.formatOneMinuteRate)),format.raw/*19.87*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*22.30*/brokerMetrics/*22.43*/.map(_.messagesInPerSec.formatFiveMinuteRate)),format.raw/*22.88*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*25.30*/brokerMetrics/*25.43*/.map(_.messagesInPerSec.formatFifteenMinuteRate)),format.raw/*25.91*/("""</span>
      </td>
    <tr>
    <tr>
      <td>Bytes in /sec</td>
      <td>
        <span class="badge">"""),_display_(/*31.30*/brokerMetrics/*31.43*/.map(_.bytesInPerSec.formatMeanRate)),format.raw/*31.79*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*34.30*/brokerMetrics/*34.43*/.map(_.bytesInPerSec.formatOneMinuteRate)),format.raw/*34.84*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*37.30*/brokerMetrics/*37.43*/.map(_.bytesInPerSec.formatFiveMinuteRate)),format.raw/*37.85*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*40.30*/brokerMetrics/*40.43*/.map(_.bytesInPerSec.formatFifteenMinuteRate)),format.raw/*40.88*/("""</span>
      </td>
    <tr>
    <tr>
      <td>Bytes out /sec</td>
      <td>
        <span class="badge">"""),_display_(/*46.30*/brokerMetrics/*46.43*/.map(_.bytesOutPerSec.formatMeanRate)),format.raw/*46.80*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*49.30*/brokerMetrics/*49.43*/.map(_.bytesOutPerSec.formatOneMinuteRate)),format.raw/*49.85*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*52.30*/brokerMetrics/*52.43*/.map(_.bytesOutPerSec.formatFiveMinuteRate)),format.raw/*52.86*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*55.30*/brokerMetrics/*55.43*/.map(_.bytesOutPerSec.formatFifteenMinuteRate)),format.raw/*55.89*/("""</span>
      </td>
    <tr>
    <tr>
      <td>Bytes rejected /sec</td>
      <td>
        <span class="badge">"""),_display_(/*61.30*/brokerMetrics/*61.43*/.map(_.bytesRejectedPerSec.formatMeanRate)),format.raw/*61.85*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*64.30*/brokerMetrics/*64.43*/.map(_.bytesRejectedPerSec.formatOneMinuteRate)),format.raw/*64.90*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*67.30*/brokerMetrics/*67.43*/.map(_.bytesRejectedPerSec.formatFiveMinuteRate)),format.raw/*67.91*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*70.30*/brokerMetrics/*70.43*/.map(_.bytesRejectedPerSec.formatFifteenMinuteRate)),format.raw/*70.94*/("""</span>
      </td>
    <tr>
    <tr>
      <td>Failed fetch request /sec</td>
      <td>
        <span class="badge">"""),_display_(/*76.30*/brokerMetrics/*76.43*/.map(_.failedFetchRequestsPerSec.formatMeanRate)),format.raw/*76.91*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*79.30*/brokerMetrics/*79.43*/.map(_.failedFetchRequestsPerSec.formatOneMinuteRate)),format.raw/*79.96*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*82.30*/brokerMetrics/*82.43*/.map(_.failedFetchRequestsPerSec.formatFiveMinuteRate)),format.raw/*82.97*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*85.30*/brokerMetrics/*85.43*/.map(_.failedFetchRequestsPerSec.formatFifteenMinuteRate)),format.raw/*85.100*/("""</span>
      </td>
    <tr>
    <tr>
      <td>Failed produce request /sec</td>
      <td>
        <span class="badge">"""),_display_(/*91.30*/brokerMetrics/*91.43*/.map(_.failedProduceRequestsPerSec.formatMeanRate)),format.raw/*91.93*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*94.30*/brokerMetrics/*94.43*/.map(_.failedProduceRequestsPerSec.formatOneMinuteRate)),format.raw/*94.98*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*97.30*/brokerMetrics/*97.43*/.map(_.failedProduceRequestsPerSec.formatFiveMinuteRate)),format.raw/*97.99*/("""</span>
      </td>
      <td>
        <span class="badge">"""),_display_(/*100.30*/brokerMetrics/*100.43*/.map(_.failedProduceRequestsPerSec.formatFifteenMinuteRate)),format.raw/*100.102*/("""</span>
      </td>
    <tr>
  </tbody>
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
                  SOURCE: /Users/abhinav/development/CMAK/app/views/common/brokerMetrics.scala.html
                  HASH: 16a67a2eb0ec5e68573d3e425eff4c4fa62d32db
                  MATRIX: 827->1|1056->137|1355->409|1377->422|1437->461|1524->521|1546->534|1611->578|1698->638|1720->651|1786->696|1873->756|1895->769|1964->817|2098->924|2120->937|2177->973|2264->1033|2286->1046|2348->1087|2435->1147|2457->1160|2520->1202|2607->1262|2629->1275|2695->1320|2830->1428|2852->1441|2910->1478|2997->1538|3019->1551|3082->1593|3169->1653|3191->1666|3255->1709|3342->1769|3364->1782|3431->1828|3571->1941|3593->1954|3656->1996|3743->2056|3765->2069|3833->2116|3920->2176|3942->2189|4011->2237|4098->2297|4120->2310|4192->2361|4338->2480|4360->2493|4429->2541|4516->2601|4538->2614|4612->2667|4699->2727|4721->2740|4796->2794|4883->2854|4905->2867|4984->2924|5132->3045|5154->3058|5225->3108|5312->3168|5334->3181|5410->3236|5497->3296|5519->3309|5596->3365|5684->3425|5707->3438|5789->3497
                  LINES: 21->1|26->2|40->16|40->16|40->16|43->19|43->19|43->19|46->22|46->22|46->22|49->25|49->25|49->25|55->31|55->31|55->31|58->34|58->34|58->34|61->37|61->37|61->37|64->40|64->40|64->40|70->46|70->46|70->46|73->49|73->49|73->49|76->52|76->52|76->52|79->55|79->55|79->55|85->61|85->61|85->61|88->64|88->64|88->64|91->67|91->67|91->67|94->70|94->70|94->70|100->76|100->76|100->76|103->79|103->79|103->79|106->82|106->82|106->82|109->85|109->85|109->85|115->91|115->91|115->91|118->94|118->94|118->94|121->97|121->97|121->97|124->100|124->100|124->100
                  -- GENERATED --
              */
          