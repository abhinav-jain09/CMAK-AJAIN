
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
/*1.2*/import kafka.manager.model.ActorModel.{TopicIdentity, BVView}

object shortBrokerMetrics extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Seq[BVView],play.api.i18n.Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(brokersViews: Seq[BVView])(implicit messages: play.api.i18n.Messages, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<table class="table">
    <tr>
      <th>Broker </th>
      <th>Messages in /sec</th>
      <th>Bytes in /sec</th>
      <th>Bytes out /sec</th>
    </tr>
  """),_display_(/*12.4*/brokersViews/*12.16*/.zipWithIndex.map/*12.33*/ { case (brokerView, idx) =>_display_(Seq[Any](format.raw/*12.61*/("""
    """),_display_(/*13.6*/if(brokerView.clusterContext.clusterFeatures.features(kafka.manager.features.KMJMXMetricsFeature))/*13.104*/ {_display_(Seq[Any](format.raw/*13.106*/("""
      """),format.raw/*14.7*/("""<tr>
        <td>"""),_display_(/*15.14*/idx),format.raw/*15.17*/("""</td>
        <td>
          <span class="badge">"""),_display_(/*17.32*/brokerView/*17.42*/.metrics.map(_.messagesInPerSec.formatMeanRate)),format.raw/*17.89*/("""</span>
        </td>
        <td>
          <span class="badge">"""),_display_(/*20.32*/brokerView/*20.42*/.metrics.map(_.bytesInPerSec.formatMeanRate)),format.raw/*20.86*/("""</span>
        </td>
        <td>
          <span class="badge">"""),_display_(/*23.32*/brokerView/*23.42*/.metrics.map(_.bytesOutPerSec.formatMeanRate)),format.raw/*23.87*/("""</span>
        </td>
      </tr>
    """)))}/*26.7*/else/*26.12*/{_display_(Seq[Any](format.raw/*26.13*/("""
      """),format.raw/*27.7*/("""<tr>
        <td>"""),_display_(/*28.14*/idx),format.raw/*28.17*/("""</td>
        <td>
          <span class="badge">NA</span>
        </td>
        <td>
          <span class="badge">NA</span>
        </td>
        <td>
          <span class="badge">NA</span>
        </td>
      </tr>
    """)))}),format.raw/*39.6*/("""
  """)))}),format.raw/*40.4*/("""
"""),format.raw/*41.1*/("""</table>

<table class="table">
  <tr>
    <th>Broker </th>
    <th>Bytes rejected /sec</th>
    <th>Failed fetch request /sec</th>
    <th>Failed produce request /sec</th>
  </tr>
  """),_display_(/*50.4*/brokersViews/*50.16*/.zipWithIndex.map/*50.33*/ { case (brokerView, idx) =>_display_(Seq[Any](format.raw/*50.61*/("""
  """),_display_(/*51.4*/if(brokerView.clusterContext.clusterFeatures.features(kafka.manager.features.KMJMXMetricsFeature))/*51.102*/ {_display_(Seq[Any](format.raw/*51.104*/("""
  """),format.raw/*52.3*/("""<tr>
    <td>"""),_display_(/*53.10*/idx),format.raw/*53.13*/("""</td>
    <td>
      <span class="badge">"""),_display_(/*55.28*/brokerView/*55.38*/.metrics.map(_.bytesRejectedPerSec.formatMeanRate)),format.raw/*55.88*/("""</span>
    </td>
    <td>
      <span class="badge">"""),_display_(/*58.28*/brokerView/*58.38*/.metrics.map(_.failedFetchRequestsPerSec.formatMeanRate)),format.raw/*58.94*/("""</span>
    </td>
    <td>
      <span class="badge">"""),_display_(/*61.28*/brokerView/*61.38*/.metrics.map(_.failedProduceRequestsPerSec.formatMeanRate)),format.raw/*61.96*/("""</span>
    </td>
  </tr>
  """)))}/*64.5*/else/*64.10*/{_display_(Seq[Any](format.raw/*64.11*/("""
  """),format.raw/*65.3*/("""<tr>
    <td>"""),_display_(/*66.10*/idx),format.raw/*66.13*/("""</td>
    <td>
      <span class="badge">NA</span>
    </td>
    <td>
      <span class="badge">NA</span>
    </td>
    <td>
      <span class="badge">NA</span>
    </td>
  </tr>
  """)))}),format.raw/*77.4*/("""
  """)))}),format.raw/*78.4*/("""
"""),format.raw/*79.1*/("""</table>
"""))
      }
    }
  }

  def render(brokersViews:Seq[BVView],messages:play.api.i18n.Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(brokersViews)(messages,request)

  def f:((Seq[BVView]) => (play.api.i18n.Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (brokersViews) => (messages,request) => apply(brokersViews)(messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:51 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/common/shortBrokerMetrics.scala.html
                  HASH: af5241f962bfcf01c30b649fdd2a6ba07759ac88
                  MATRIX: 439->1|860->65|1047->159|1074->160|1258->318|1279->330|1305->347|1371->375|1403->381|1511->479|1552->481|1586->488|1631->506|1655->509|1732->559|1751->569|1819->616|1912->682|1931->692|1996->736|2089->802|2108->812|2174->857|2231->897|2244->902|2283->903|2317->910|2362->928|2386->931|2640->1155|2674->1159|2702->1160|2912->1344|2933->1356|2959->1373|3025->1401|3055->1405|3163->1503|3204->1505|3234->1508|3275->1522|3299->1525|3368->1567|3387->1577|3458->1627|3539->1681|3558->1691|3635->1747|3716->1801|3735->1811|3814->1869|3861->1899|3874->1904|3913->1905|3943->1908|3984->1922|4008->1925|4220->2107|4254->2111|4282->2112
                  LINES: 17->1|22->3|27->4|28->5|35->12|35->12|35->12|35->12|36->13|36->13|36->13|37->14|38->15|38->15|40->17|40->17|40->17|43->20|43->20|43->20|46->23|46->23|46->23|49->26|49->26|49->26|50->27|51->28|51->28|62->39|63->40|64->41|73->50|73->50|73->50|73->50|74->51|74->51|74->51|75->52|76->53|76->53|78->55|78->55|78->55|81->58|81->58|81->58|84->61|84->61|84->61|87->64|87->64|87->64|88->65|89->66|89->66|100->77|101->78|102->79
                  -- GENERATED --
              */
          