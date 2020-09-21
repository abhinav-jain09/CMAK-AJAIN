
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
/*5.2*/import kafka.manager.model.ActorModel.BrokerIdentity

object brokerListContent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,kafka.manager.BrokerListExtended,play.api.i18n.Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String, brokerListExtended: kafka.manager.BrokerListExtended)(implicit messages: play.api.i18n.Messages, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.1*/("""
            """),format.raw/*8.13*/("""<table class="table">
                <thead>
                <tr>
                    <td>Id</td>
                    <td>Host</td>
                    <td>Port</td>
                    <td>JMX Port</td>
                    <td>Bytes In</td>
                    <td>Bytes Out</td>
                    """),_display_(/*17.22*/if(brokerListExtended.clusterContext.config.jmxEnabled && brokerListExtended.clusterContext.config.displaySizeEnabled)/*17.140*/ {_display_(Seq[Any](format.raw/*17.142*/("""
                    """),format.raw/*18.21*/("""<td>Size</td>
                    """)))}),format.raw/*19.22*/("""
                """),format.raw/*20.17*/("""</tr>
                </thead>
                <tbody>
                """),_display_(/*23.18*/for(broker <- brokerListExtended.list) yield /*23.56*/ {_display_(Seq[Any](format.raw/*23.58*/("""
                """),format.raw/*24.17*/("""<tr>
                    <td><a href=""""),_display_(/*25.35*/routes/*25.41*/.Cluster.broker(cluster,broker.id.toInt).relative),format.raw/*25.90*/("""">"""),_display_(/*25.93*/broker/*25.99*/.id),format.raw/*25.102*/("""</a></td>
                    <td>"""),_display_(/*26.26*/broker/*26.32*/.host),format.raw/*26.37*/("""</td>
                    <td>"""),_display_(/*27.26*/broker/*27.32*/.endpointsString),format.raw/*27.48*/("""</td>
                    <td>"""),_display_(/*28.26*/broker/*28.32*/.jmxPort),format.raw/*28.40*/("""</td>
                    <td>
                        <span class="badge">
                            """),_display_(/*31.30*/brokerListExtended/*31.48*/.metrics.get(broker.id).map(_.bytesInPerSec.formatOneMinuteRate)),format.raw/*31.112*/("""
                        """),format.raw/*32.25*/("""</span>
                    </td>
                    <td>
                        <span class="badge">
                            """),_display_(/*36.30*/brokerListExtended/*36.48*/.metrics.get(broker.id).map(_.bytesOutPerSec.formatOneMinuteRate)),format.raw/*36.113*/("""
                        """),format.raw/*37.25*/("""</span>
                    </td>
                    """),_display_(/*39.22*/if(brokerListExtended.clusterContext.config.jmxEnabled && brokerListExtended.clusterContext.config.displaySizeEnabled)/*39.140*/ {_display_(Seq[Any](format.raw/*39.142*/("""
                    """),format.raw/*40.21*/("""<td>
                        <span class="badge">
                            """),_display_(/*42.30*/brokerListExtended/*42.48*/.metrics.get(broker.id).map(_.size.formatSize)),format.raw/*42.94*/("""
                        """),format.raw/*43.25*/("""</span>
                    </td>
                    """)))}),format.raw/*45.22*/("""
                """),format.raw/*46.17*/("""</tr>
                """)))}),format.raw/*47.18*/("""
                """),format.raw/*48.17*/("""</tbody>
            </table>

"""))
      }
    }
  }

  def render(cluster:String,brokerListExtended:kafka.manager.BrokerListExtended,messages:play.api.i18n.Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,brokerListExtended)(messages,request)

  def f:((String,kafka.manager.BrokerListExtended) => (play.api.i18n.Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,brokerListExtended) => (messages,request) => apply(cluster,brokerListExtended)(messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/broker/brokerListContent.scala.html
                  HASH: 7fda30ae92a569d814644db7688be547083fcb79
                  MATRIX: 439->115|878->169|1108->306|1148->319|1478->622|1606->740|1647->742|1696->763|1762->798|1807->815|1906->887|1960->925|2000->927|2045->944|2111->983|2126->989|2196->1038|2226->1041|2241->1047|2266->1050|2328->1085|2343->1091|2369->1096|2427->1127|2442->1133|2479->1149|2537->1180|2552->1186|2581->1194|2713->1299|2740->1317|2826->1381|2879->1406|3039->1539|3066->1557|3153->1622|3206->1647|3288->1702|3416->1820|3457->1822|3506->1843|3612->1922|3639->1940|3706->1986|3759->2011|3845->2066|3890->2083|3944->2106|3989->2123
                  LINES: 17->5|22->6|27->7|28->8|37->17|37->17|37->17|38->18|39->19|40->20|43->23|43->23|43->23|44->24|45->25|45->25|45->25|45->25|45->25|45->25|46->26|46->26|46->26|47->27|47->27|47->27|48->28|48->28|48->28|51->31|51->31|51->31|52->32|56->36|56->36|56->36|57->37|59->39|59->39|59->39|60->40|62->42|62->42|62->42|63->43|65->45|66->46|67->47|68->48
                  -- GENERATED --
              */
          