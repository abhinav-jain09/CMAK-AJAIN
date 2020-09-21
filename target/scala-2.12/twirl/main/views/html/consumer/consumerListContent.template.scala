
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
/*5.2*/import kafka.manager.model.ActorModel.ConsumerType
/*6.2*/import kafka.manager.model.ActorModel.ConsumerIdentity
/*7.2*/import kafka.manager.model.ClusterContext

object consumerListContent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,IndexedSeq[scala.Tuple2[scala.Tuple2[String, ConsumerType], Option[ConsumerIdentity]]],ClusterContext,play.api.i18n.Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(cluster: String, consumers: IndexedSeq[((String, ConsumerType), Option[ConsumerIdentity])],
        clusterContext: ClusterContext)(implicit messages: play.api.i18n.Messages, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*11.2*/getConsumedTopicSummary/*11.25*/(state: kafka.manager.model.ActorModel.ConsumedTopicState):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*11.87*/("""
    """),_display_(/*12.6*/state/*12.11*/.percentageCovered/*12.29*/ match/*12.35*/ {/*13.9*/case i if i <=  99 =>/*13.30*/ {_display_(Seq[Any](format.raw/*13.32*/("""
            """),format.raw/*14.13*/("""<span style="background-color: #F2DEDE">
                ("""),_display_(/*15.19*/state/*15.24*/.percentageCovered),format.raw/*15.42*/("""% coverage, """),_display_(/*15.55*/state/*15.60*/.totalLag.getOrElse("Lag unavailable")),format.raw/*15.98*/(""" """),format.raw/*15.99*/("""lag)
            </span>
        """)))}/*18.9*/case i =>/*18.18*/ {_display_(Seq[Any](format.raw/*18.20*/("""("""),_display_(/*18.22*/state/*18.27*/.percentageCovered),format.raw/*18.45*/("""% coverage, """),_display_(/*18.58*/state/*18.63*/.totalLag.getOrElse("Lag unavailable")),format.raw/*18.101*/(""" """),format.raw/*18.102*/("""lag)""")))}}),format.raw/*19.6*/("""
""")))};
Seq[Any](format.raw/*10.1*/("""
"""),format.raw/*20.2*/("""
    """),format.raw/*21.5*/("""<table class="table" id="consumer-table">
        <thead>
        <tr><th>Consumer</th>
            <th>Type</th>
            """),_display_(/*25.14*/if(clusterContext.config.pollConsumers)/*25.53*/ {_display_(Seq[Any](format.raw/*25.55*/("""
            """),format.raw/*26.13*/("""<th>Topics it consumes from</th>
            """)))}),format.raw/*27.14*/("""
        """),format.raw/*28.9*/("""</tr>
        </thead>
        <tbody>
        """),_display_(/*31.10*/for( ((consumer, consumerType), consumerIdentityOpt) <- consumers) yield /*31.76*/ {_display_(Seq[Any](format.raw/*31.78*/("""
            """),format.raw/*32.13*/("""<tr>
                <td><a href=""""),_display_(/*33.31*/routes/*33.37*/.Consumer.consumer(cluster,consumer,consumerType.toString)),format.raw/*33.95*/("""">"""),_display_(/*33.98*/consumer),format.raw/*33.106*/("""</a></td>
                <td>"""),_display_(/*34.22*/consumerType/*34.34*/.toString),format.raw/*34.43*/("""</td>
                """),_display_(/*35.18*/if(clusterContext.config.pollConsumers)/*35.57*/ {_display_(Seq[Any](format.raw/*35.59*/("""
                """),format.raw/*36.17*/("""<td>
                    """),_display_(/*37.22*/consumerIdentityOpt/*37.41*/.fold/*37.46*/{_display_(Seq[Any](format.raw/*37.47*/("""
                        """),format.raw/*38.25*/("""No details available for this consumer at this time
                    """)))}/*39.22*/{ a:kafka.manager.model.ActorModel.ConsumerIdentity =>_display_(Seq[Any](format.raw/*39.76*/("""
                        """),_display_(/*40.26*/for((topic: String, state: kafka.manager.model.ActorModel.ConsumedTopicState) <- a.topicMap) yield /*40.118*/ {_display_(Seq[Any](format.raw/*40.120*/("""
                            """),format.raw/*41.29*/("""<a href=""""),_display_(/*41.39*/routes/*41.45*/.Consumer.consumerAndTopic(cluster,consumer,topic,consumerType.toString)),format.raw/*41.117*/("""">"""),_display_(/*41.120*/topic),format.raw/*41.125*/("""</a>:
                            """),_display_(/*42.30*/getConsumedTopicSummary(state)),format.raw/*42.60*/(""" """),format.raw/*42.61*/("""<br>
                        """)))}),format.raw/*43.26*/("""
                    """)))}),format.raw/*44.22*/("""
                """),format.raw/*45.17*/("""</td>
                """)))}),format.raw/*46.18*/("""
            """),format.raw/*47.13*/("""</tr>
        """)))}),format.raw/*48.10*/("""
        """),format.raw/*49.9*/("""</tbody>
    </table>
"""))
      }
    }
  }

  def render(cluster:String,consumers:IndexedSeq[scala.Tuple2[scala.Tuple2[String, ConsumerType], Option[ConsumerIdentity]]],clusterContext:ClusterContext,messages:play.api.i18n.Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,consumers,clusterContext)(messages,request)

  def f:((String,IndexedSeq[scala.Tuple2[scala.Tuple2[String, ConsumerType], Option[ConsumerIdentity]]],ClusterContext) => (play.api.i18n.Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,consumers,clusterContext) => (messages,request) => apply(cluster,consumers,clusterContext)(messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:51 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/consumer/consumerListContent.scala.html
                  HASH: 0682ed0d6c32bea8b210802df36ebfd4bce32301
                  MATRIX: 441->115|499->167|561->223|1060->266|1337->467|1369->490|1508->552|1540->558|1554->563|1581->581|1596->587|1606->598|1636->619|1676->621|1717->634|1803->693|1817->698|1856->716|1896->729|1910->734|1969->772|1998->773|2050->816|2068->825|2108->827|2137->829|2151->834|2190->852|2230->865|2244->870|2304->908|2334->909|2370->920|2411->465|2439->922|2471->927|2625->1054|2673->1093|2713->1095|2754->1108|2831->1154|2867->1163|2942->1211|3024->1277|3064->1279|3105->1292|3167->1327|3182->1333|3261->1391|3291->1394|3321->1402|3379->1433|3400->1445|3430->1454|3480->1477|3528->1516|3568->1518|3613->1535|3666->1561|3694->1580|3708->1585|3747->1586|3800->1611|3892->1684|3984->1738|4037->1764|4146->1856|4187->1858|4244->1887|4281->1897|4296->1903|4390->1975|4421->1978|4448->1983|4510->2018|4561->2048|4590->2049|4651->2079|4704->2101|4749->2118|4803->2141|4844->2154|4890->2169|4926->2178
                  LINES: 17->5|18->6|19->7|24->8|29->11|29->11|31->11|32->12|32->12|32->12|32->12|32->13|32->13|32->13|33->14|34->15|34->15|34->15|34->15|34->15|34->15|34->15|36->18|36->18|36->18|36->18|36->18|36->18|36->18|36->18|36->18|36->18|36->19|38->10|39->20|40->21|44->25|44->25|44->25|45->26|46->27|47->28|50->31|50->31|50->31|51->32|52->33|52->33|52->33|52->33|52->33|53->34|53->34|53->34|54->35|54->35|54->35|55->36|56->37|56->37|56->37|56->37|57->38|58->39|58->39|59->40|59->40|59->40|60->41|60->41|60->41|60->41|60->41|60->41|61->42|61->42|61->42|62->43|63->44|64->45|65->46|66->47|67->48|68->49
                  -- GENERATED --
              */
          