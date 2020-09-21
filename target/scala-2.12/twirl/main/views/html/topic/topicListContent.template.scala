
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
/*5.2*/import kafka.manager.utils.LongFormatted

object topicListContent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[String,IndexedSeq[scala.Tuple2[scala.Tuple2[String, Option[kafka.manager.model.ActorModel.TopicIdentity]], Boolean]],IndexedSeq[String],Boolean,Boolean,play.api.i18n.Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster: String,
  topics: IndexedSeq[((String, Option[kafka.manager.model.ActorModel.TopicIdentity]),Boolean)],
  topicsUnderReassignment: IndexedSeq[String],
  pollConsumers: Boolean,
  displayTopicSize: Boolean
)(implicit messages: play.api.i18n.Messages, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*13.2*/getDeletedLevel/*13.17*/(deleted: Boolean):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.39*/("""
    """),_display_(/*14.6*/deleted/*14.13*/ match/*14.19*/ {/*15.9*/case true =>/*15.21*/ {_display_(Seq[Any](format.raw/*15.23*/("""table-danger""")))}/*16.9*/case i =>/*16.18*/ {}}),format.raw/*17.6*/("""
""")))};def /*20.2*/getBrokersSpreadLevel/*20.23*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*20.44*/("""
    """),_display_(/*21.6*/percentage/*21.16*/ match/*21.22*/ {/*22.9*/case i if i > 50 && i <= 75 =>/*22.39*/ {_display_(Seq[Any](format.raw/*22.41*/("""table-warning""")))}/*23.9*/case i if i <= 50 =>/*23.29*/ {_display_(Seq[Any](format.raw/*23.31*/("""table-danger""")))}/*24.9*/case i =>/*24.18*/ {}}),format.raw/*25.6*/("""
""")))};def /*28.2*/getBrokersSkewLevel/*28.21*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*28.42*/("""
    """),_display_(/*29.6*/percentage/*29.16*/ match/*29.22*/ {/*30.9*/case i if i > 0 && i <= 33 =>/*30.38*/ {_display_(Seq[Any](format.raw/*30.40*/("""table-warning""")))}/*31.9*/case i if i >= 34 =>/*31.29*/ {_display_(Seq[Any](format.raw/*31.31*/("""table-danger""")))}/*32.9*/case i =>/*32.18*/ {}}),format.raw/*33.6*/("""
""")))};def /*36.2*/getBrokersLeaderSkewLevel/*36.27*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*36.48*/("""
    """),_display_(/*37.6*/percentage/*37.16*/ match/*37.22*/ {/*38.9*/case i if i > 0 && i <= 33 =>/*38.38*/ {_display_(Seq[Any](format.raw/*38.40*/("""table-warning""")))}/*39.9*/case i if i >= 34 =>/*39.29*/ {_display_(Seq[Any](format.raw/*39.31*/("""table-danger""")))}/*40.9*/case i =>/*40.18*/ {}}),format.raw/*41.6*/("""
""")))};def /*44.2*/getUnderReplicatedLevel/*44.25*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*44.46*/("""
    """),_display_(/*45.6*/percentage/*45.16*/ match/*45.22*/ {/*46.9*/case i if i > 0 && i <= 33 =>/*46.38*/ {_display_(Seq[Any](format.raw/*46.40*/("""table-warning""")))}/*47.9*/case i if i >= 34 =>/*47.29*/ {_display_(Seq[Any](format.raw/*47.31*/("""table-danger""")))}/*48.9*/case i =>/*48.18*/ {}}),format.raw/*49.6*/("""
""")))};def /*52.2*/getReassignmentStatus/*52.23*/(topic: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*52.42*/("""
    """),_display_(/*53.6*/if(topicsUnderReassignment.contains(topic))/*53.49*/ {_display_(Seq[Any](format.raw/*53.51*/("""glow-red""")))}/*53.61*/else/*53.66*/{}),format.raw/*53.68*/("""
""")))};
Seq[Any](format.raw/*12.1*/("""
"""),format.raw/*18.2*/("""

"""),format.raw/*26.2*/("""

"""),format.raw/*34.2*/("""

"""),format.raw/*42.2*/("""

"""),format.raw/*50.2*/("""

"""),format.raw/*54.2*/("""

"""),format.raw/*56.1*/("""<table class="table" id="topics-table">
    <thead>
    <tr><th>Topic</th>
        <th># Partitions</th>
        <th># Brokers</th>
        <th><span title="Percentage of cluster brokers having partitions from the topic">Brokers Spread %</span></th>
        <th><span title="Percentage of brokers having more partitions than the average">Brokers Skew %</span></th>
        <th><span title="Percentage of brokers having more partitions as leader than the average">Brokers Leader Skew %</span></th>
        <th># Replicas</th>
        <th><span title="Percentage of partitions having a missing replica">Under Replicated %</span></th>
        """),_display_(/*66.10*/if(displayTopicSize)/*66.30*/{_display_(Seq[Any](format.raw/*66.31*/("""
        """),format.raw/*67.9*/("""<th>Leader Size</th>
        """)))}),format.raw/*68.10*/("""
        """),_display_(/*69.10*/if(pollConsumers)/*69.27*/{_display_(Seq[Any](format.raw/*69.28*/("""
        """),format.raw/*70.9*/("""<th>Producer Message/Sec</th>
        <th>Summed Recent Offsets</th>
        """)))}),format.raw/*72.10*/("""
    """),format.raw/*73.5*/("""</tr>
    </thead>
    <tbody>
    """),_display_(/*76.6*/for( ((topic, topicIdentity), deleted) <- topics) yield /*76.55*/ {_display_(Seq[Any](format.raw/*76.57*/("""
      """),format.raw/*77.7*/("""<tr class=""""),_display_(/*77.19*/getReassignmentStatus(topic)),format.raw/*77.47*/("""">
          <td class=""""),_display_(/*78.23*/getDeletedLevel(deleted)),format.raw/*78.47*/(""""><a href=""""),_display_(/*78.59*/routes/*78.65*/.Topic.topic(cluster,topic)),format.raw/*78.92*/("""">"""),_display_(/*78.95*/topic),format.raw/*78.100*/("""</a></td>
          """),_display_(/*79.12*/topicIdentity/*79.25*/.map/*79.29*/{ ti =>_display_(Seq[Any](format.raw/*79.36*/(""" """),format.raw/*79.37*/("""<td>"""),_display_(/*79.42*/ti/*79.44*/.partitions),format.raw/*79.55*/("""</td>""")))}/*79.61*/.getOrElse/*79.71*/{_display_(Seq[Any](format.raw/*79.72*/("""<td> </td>""")))}),format.raw/*79.83*/("""
          """),_display_(/*80.12*/topicIdentity/*80.25*/.map/*80.29*/{ ti =>_display_(Seq[Any](format.raw/*80.36*/(""" """),format.raw/*80.37*/("""<td>"""),_display_(/*80.42*/ti/*80.44*/.topicBrokers),format.raw/*80.57*/("""</td>""")))}/*80.63*/.getOrElse/*80.73*/{_display_(Seq[Any](format.raw/*80.74*/("""<td> </td>""")))}),format.raw/*80.85*/("""
          """),_display_(/*81.12*/topicIdentity/*81.25*/.map/*81.29*/{ ti =>_display_(Seq[Any](format.raw/*81.36*/(""" """),format.raw/*81.37*/("""<td class=""""),_display_(/*81.49*/getBrokersSpreadLevel(ti.brokersSpreadPercentage)),format.raw/*81.98*/("""">"""),_display_(/*81.101*/ti/*81.103*/.brokersSpreadPercentage),format.raw/*81.127*/("""</td>""")))}/*81.133*/.getOrElse/*81.143*/{_display_(Seq[Any](format.raw/*81.144*/("""<td> </td>""")))}),format.raw/*81.155*/("""
          """),_display_(/*82.12*/topicIdentity/*82.25*/.map/*82.29*/{ ti =>_display_(Seq[Any](format.raw/*82.36*/(""" """),format.raw/*82.37*/("""<td class=""""),_display_(/*82.49*/getBrokersSkewLevel(ti.brokersSkewPercentage)),format.raw/*82.94*/("""">"""),_display_(/*82.97*/ti/*82.99*/.brokersSkewPercentage),format.raw/*82.121*/("""</td>""")))}/*82.127*/.getOrElse/*82.137*/{_display_(Seq[Any](format.raw/*82.138*/("""<td> </td>""")))}),format.raw/*82.149*/("""
          """),_display_(/*83.12*/topicIdentity/*83.25*/.map/*83.29*/{ ti =>_display_(Seq[Any](format.raw/*83.36*/(""" """),format.raw/*83.37*/("""<td class=""""),_display_(/*83.49*/getBrokersLeaderSkewLevel(ti.brokersLeaderSkewPercentage)),format.raw/*83.106*/("""">"""),_display_(/*83.109*/ti/*83.111*/.brokersLeaderSkewPercentage),format.raw/*83.139*/("""</td>""")))}/*83.145*/.getOrElse/*83.155*/{_display_(Seq[Any](format.raw/*83.156*/("""<td> </td>""")))}),format.raw/*83.167*/("""
          """),_display_(/*84.12*/topicIdentity/*84.25*/.map/*84.29*/{ ti =>_display_(Seq[Any](format.raw/*84.36*/(""" """),format.raw/*84.37*/("""<td>"""),_display_(/*84.42*/ti/*84.44*/.replicationFactor),format.raw/*84.62*/("""</td>""")))}/*84.68*/.getOrElse/*84.78*/{_display_(Seq[Any](format.raw/*84.79*/("""<td> </td>""")))}),format.raw/*84.90*/("""
          """),_display_(/*85.12*/topicIdentity/*85.25*/.map/*85.29*/{ ti =>_display_(Seq[Any](format.raw/*85.36*/(""" """),format.raw/*85.37*/("""<td class=""""),_display_(/*85.49*/getUnderReplicatedLevel(ti.underReplicatedPercentage)),format.raw/*85.102*/("""">"""),_display_(/*85.105*/ti/*85.107*/.underReplicatedPercentage),format.raw/*85.133*/("""</td>""")))}/*85.139*/.getOrElse/*85.149*/{_display_(Seq[Any](format.raw/*85.150*/("""<td> </td>""")))}),format.raw/*85.161*/("""
          """),_display_(/*86.12*/if(displayTopicSize)/*86.32*/{_display_(Seq[Any](format.raw/*86.33*/("""
          """),_display_(/*87.12*/topicIdentity/*87.25*/.map/*87.29*/{ ti =>_display_(Seq[Any](format.raw/*87.36*/(""" """),format.raw/*87.37*/("""<td>"""),_display_(/*87.42*/ti/*87.44*/.size),format.raw/*87.49*/("""</td>""")))}/*87.55*/.getOrElse/*87.65*/{_display_(Seq[Any](format.raw/*87.66*/("""<td> </td>""")))}),format.raw/*87.77*/("""
          """)))}),format.raw/*88.12*/("""
          """),_display_(/*89.12*/if(pollConsumers)/*89.29*/{_display_(Seq[Any](format.raw/*89.30*/("""
          """),_display_(/*90.12*/topicIdentity/*90.25*/.map/*90.29*/{ ti =>_display_(Seq[Any](format.raw/*90.36*/(""" """),format.raw/*90.37*/("""<td>"""),_display_(/*90.42*/ti/*90.44*/.producerRate),format.raw/*90.57*/("""</td>""")))}/*90.63*/.getOrElse/*90.73*/{_display_(Seq[Any](format.raw/*90.74*/("""<td> </td>""")))}),format.raw/*90.85*/("""
          """),_display_(/*91.12*/topicIdentity/*91.25*/.map/*91.29*/{ ti =>_display_(Seq[Any](format.raw/*91.36*/(""" """),format.raw/*91.37*/("""<td>"""),_display_(/*91.42*/ti/*91.44*/.summedTopicOffsets.formattedAsDecimal),format.raw/*91.82*/("""</td>""")))}/*91.88*/.getOrElse/*91.98*/{_display_(Seq[Any](format.raw/*91.99*/("""<td> </td>""")))}),format.raw/*91.110*/("""
          """)))}),format.raw/*92.12*/("""
      """),format.raw/*93.7*/("""</tr>
    """)))}),format.raw/*94.6*/("""
    """),format.raw/*95.5*/("""</tbody>
</table>
"""))
      }
    }
  }

  def render(cluster:String,topics:IndexedSeq[scala.Tuple2[scala.Tuple2[String, Option[kafka.manager.model.ActorModel.TopicIdentity]], Boolean]],topicsUnderReassignment:IndexedSeq[String],pollConsumers:Boolean,displayTopicSize:Boolean,messages:play.api.i18n.Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,topics,topicsUnderReassignment,pollConsumers,displayTopicSize)(messages,request)

  def f:((String,IndexedSeq[scala.Tuple2[scala.Tuple2[String, Option[kafka.manager.model.ActorModel.TopicIdentity]], Boolean]],IndexedSeq[String],Boolean,Boolean) => (play.api.i18n.Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,topics,topicsUnderReassignment,pollConsumers,displayTopicSize) => (messages,request) => apply(cluster,topics,topicsUnderReassignment,pollConsumers,displayTopicSize)(messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/topic/topicListContent.scala.html
                  HASH: 8a82b844a062961c2f5a06dfa52f9c219f0645d9
                  MATRIX: 438->115|976->157|1337->442|1361->457|1460->479|1492->485|1508->492|1523->498|1533->509|1554->521|1594->523|1625->545|1643->554|1667->563|1692->568|1722->589|1820->610|1852->616|1871->626|1886->632|1896->643|1935->673|1975->675|2007->698|2036->718|2076->720|2107->742|2125->751|2149->760|2174->765|2202->784|2300->805|2332->811|2351->821|2366->827|2376->838|2414->867|2454->869|2486->892|2515->912|2555->914|2586->936|2604->945|2628->954|2653->959|2687->984|2785->1005|2817->1011|2836->1021|2851->1027|2861->1038|2899->1067|2939->1069|2971->1092|3000->1112|3040->1114|3071->1136|3089->1145|3113->1154|3138->1159|3170->1182|3268->1203|3300->1209|3319->1219|3334->1225|3344->1236|3382->1265|3422->1267|3454->1290|3483->1310|3523->1312|3554->1334|3572->1343|3596->1352|3621->1357|3651->1378|3747->1397|3779->1403|3831->1446|3871->1448|3899->1458|3912->1463|3935->1465|3976->440|4004->565|4033->762|4062->956|4091->1156|4120->1354|4149->1467|4178->1469|4846->2110|4875->2130|4914->2131|4950->2140|5011->2170|5048->2180|5074->2197|5113->2198|5149->2207|5258->2285|5290->2290|5352->2326|5417->2375|5457->2377|5491->2384|5530->2396|5579->2424|5631->2449|5676->2473|5715->2485|5730->2491|5778->2518|5808->2521|5835->2526|5883->2547|5905->2560|5918->2564|5963->2571|5992->2572|6024->2577|6035->2579|6067->2590|6092->2596|6111->2606|6150->2607|6192->2618|6231->2630|6253->2643|6266->2647|6311->2654|6340->2655|6372->2660|6383->2662|6417->2675|6442->2681|6461->2691|6500->2692|6542->2703|6581->2715|6603->2728|6616->2732|6661->2739|6690->2740|6729->2752|6799->2801|6830->2804|6842->2806|6888->2830|6914->2836|6934->2846|6974->2847|7017->2858|7056->2870|7078->2883|7091->2887|7136->2894|7165->2895|7204->2907|7270->2952|7300->2955|7311->2957|7355->2979|7381->2985|7401->2995|7441->2996|7484->3007|7523->3019|7545->3032|7558->3036|7603->3043|7632->3044|7671->3056|7750->3113|7781->3116|7793->3118|7843->3146|7869->3152|7889->3162|7929->3163|7972->3174|8011->3186|8033->3199|8046->3203|8091->3210|8120->3211|8152->3216|8163->3218|8202->3236|8227->3242|8246->3252|8285->3253|8327->3264|8366->3276|8388->3289|8401->3293|8446->3300|8475->3301|8514->3313|8589->3366|8620->3369|8632->3371|8680->3397|8706->3403|8726->3413|8766->3414|8809->3425|8848->3437|8877->3457|8916->3458|8955->3470|8977->3483|8990->3487|9035->3494|9064->3495|9096->3500|9107->3502|9133->3507|9158->3513|9177->3523|9216->3524|9258->3535|9301->3547|9340->3559|9366->3576|9405->3577|9444->3589|9466->3602|9479->3606|9524->3613|9553->3614|9585->3619|9596->3621|9630->3634|9655->3640|9674->3650|9713->3651|9755->3662|9794->3674|9816->3687|9829->3691|9874->3698|9903->3699|9935->3704|9946->3706|10005->3744|10030->3750|10049->3760|10088->3761|10131->3772|10174->3784|10208->3791|10249->3802|10281->3807
                  LINES: 17->5|22->6|31->13|31->13|33->13|34->14|34->14|34->14|34->15|34->15|34->15|34->16|34->16|34->17|35->20|35->20|37->20|38->21|38->21|38->21|38->22|38->22|38->22|38->23|38->23|38->23|38->24|38->24|38->25|39->28|39->28|41->28|42->29|42->29|42->29|42->30|42->30|42->30|42->31|42->31|42->31|42->32|42->32|42->33|43->36|43->36|45->36|46->37|46->37|46->37|46->38|46->38|46->38|46->39|46->39|46->39|46->40|46->40|46->41|47->44|47->44|49->44|50->45|50->45|50->45|50->46|50->46|50->46|50->47|50->47|50->47|50->48|50->48|50->49|51->52|51->52|53->52|54->53|54->53|54->53|54->53|54->53|54->53|56->12|57->18|59->26|61->34|63->42|65->50|67->54|69->56|79->66|79->66|79->66|80->67|81->68|82->69|82->69|82->69|83->70|85->72|86->73|89->76|89->76|89->76|90->77|90->77|90->77|91->78|91->78|91->78|91->78|91->78|91->78|91->78|92->79|92->79|92->79|92->79|92->79|92->79|92->79|92->79|92->79|92->79|92->79|92->79|93->80|93->80|93->80|93->80|93->80|93->80|93->80|93->80|93->80|93->80|93->80|93->80|94->81|94->81|94->81|94->81|94->81|94->81|94->81|94->81|94->81|94->81|94->81|94->81|94->81|94->81|95->82|95->82|95->82|95->82|95->82|95->82|95->82|95->82|95->82|95->82|95->82|95->82|95->82|95->82|96->83|96->83|96->83|96->83|96->83|96->83|96->83|96->83|96->83|96->83|96->83|96->83|96->83|96->83|97->84|97->84|97->84|97->84|97->84|97->84|97->84|97->84|97->84|97->84|97->84|97->84|98->85|98->85|98->85|98->85|98->85|98->85|98->85|98->85|98->85|98->85|98->85|98->85|98->85|98->85|99->86|99->86|99->86|100->87|100->87|100->87|100->87|100->87|100->87|100->87|100->87|100->87|100->87|100->87|100->87|101->88|102->89|102->89|102->89|103->90|103->90|103->90|103->90|103->90|103->90|103->90|103->90|103->90|103->90|103->90|103->90|104->91|104->91|104->91|104->91|104->91|104->91|104->91|104->91|104->91|104->91|104->91|104->91|105->92|106->93|107->94|108->95
                  -- GENERATED --
              */
          