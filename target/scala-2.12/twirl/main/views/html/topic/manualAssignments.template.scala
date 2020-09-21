
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
/*6.2*/import scalaz.{\/}
/*7.2*/import kafka.manager.model.ActorModel._
/*8.2*/import kafka.manager.{BrokerListExtended}
/*9.2*/import kafka.manager.utils._
/*10.2*/import helper._
/*11.2*/import models.form._

object manualAssignments extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template11[String,String,List[scala.Tuple2[String, List[scala.Tuple2[Int, List[Int]]]]],BrokerListExtended,Map[Int, BVView],Seq[FormError],features.ApplicationFeatures,kafka.manager.features.ClusterFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*13.2*/(cluster: String,
  topic: String,
  assignForm: List[(String, List[(Int,List[Int])])],
  brokers: BrokerListExtended,
  brokersViews: Map[Int, BVView],
  formErrors: Seq[FormError]
)(implicit af: features.ApplicationFeatures, 
cf: kafka.manager.features.ClusterFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*23.2*/theMenu/*23.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*23.13*/("""
"""),_display_(/*24.2*/views/*24.7*/.html.navigation.clusterMenu(cluster,"Topic","Manual Partition Assignments",menus.clusterMenus(cluster))),format.raw/*24.111*/("""
""")))};def /*29.2*/toColor/*29.9*/(brokerId: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*29.28*/("""
  """),format.raw/*30.3*/("""#"""),_display_(/*30.5*/color(brokerId)),format.raw/*30.20*/("""
""")))};def /*32.2*/reverseColor/*32.14*/(originalColor: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.41*/("""
  """),format.raw/*33.3*/("""#"""),_display_(/*33.5*/originalColor/*33.18*/.map({x => if(x == '#') x else "%X".format(0xf - Integer.parseInt(x.toString,16)).head})),format.raw/*33.106*/("""
""")))};def /*35.2*/replicaSelection/*35.18*/(topicIdx: Int, assignIdx: Int, brokerIndex: Int, brokerId: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*35.86*/("""
    """),_display_(/*36.6*/if(brokers.list.filter({broker => broker.id == brokerId}).size > 0)/*36.73*/ {_display_(Seq[Any](format.raw/*36.75*/("""
    """),format.raw/*37.5*/("""<span style="background-color: """),_display_(/*37.37*/toColor(brokerId)),format.raw/*37.54*/(""" """),format.raw/*37.55*/(""";">
      <select onchange="this.parentNode.setAttribute('style', 
        this.options[this.selectedIndex].getAttribute('style'))"
        name="topics["""),_display_(/*40.23*/topicIdx),format.raw/*40.31*/("""].assignments["""),_display_(/*40.46*/assignIdx),format.raw/*40.55*/("""].brokers["""),_display_(/*40.66*/brokerIndex),format.raw/*40.77*/("""]">
        """),_display_(/*41.10*/brokers/*41.17*/.list.map/*41.26*/ { case broker =>_display_(Seq[Any](format.raw/*41.43*/("""
        """),format.raw/*42.9*/("""<option style="background-color: """),_display_(/*42.43*/toColor(broker.id)),format.raw/*42.61*/("""; color: """),_display_(/*42.71*/reverseColor(color(broker.id))),format.raw/*42.101*/(""";"
        value=""""),_display_(/*43.17*/broker/*43.23*/.id),format.raw/*43.26*/("""" """),_display_(/*43.29*/if(broker.id == brokerId)/*43.54*/{_display_(Seq[Any](format.raw/*43.55*/("""selected""")))}),format.raw/*43.64*/(""">Broker """),_display_(/*43.73*/broker/*43.79*/.id),format.raw/*43.82*/("""</option>
        """)))}),format.raw/*44.10*/("""
      """),format.raw/*45.7*/("""</select>
      &nbsp;&nbsp;&nbsp;</span>
    """)))}/*47.7*/else/*47.12*/{_display_(Seq[Any](format.raw/*47.13*/("""
        """),format.raw/*48.9*/("""<small style="color:red">Broker Down!</small>
        <script>window.onload = function() """),format.raw/*49.44*/("""{"""),format.raw/*49.45*/("""disableSubmission()"""),format.raw/*49.64*/("""}"""),format.raw/*49.65*/("""</script>
    """)))}),format.raw/*50.6*/("""
""")))};def /*53.2*/topHeading/*53.12*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*53.16*/("""
"""),format.raw/*54.1*/("""<div class="card-header">
    <div class="row">
        <button type="button" class="btn btn-link" onclick="goBack()">
            <span class="octicon octicon-arrow-left" aria-hidden="true"></span>
        </button>
        <h4>Manual Partition Assignments</h4>
            <div class="container">
            <div class="btn-group" role="group" aria-label="...">
                <button class="btn btn-primary " type="submit">
                    <span class="octicon octicon-file"></span>
                    Save Partition Assignment
                </button>
            </div>
            </div>
    </div>
</div>
""")))};def /*72.2*/middleHeading/*72.15*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*72.19*/("""
"""),format.raw/*73.1*/("""<div class="btn-group-xs sub-heading">
    <input type="text" placeholder="Type to filter topics"
           id="cell-selector" onkeyup="selectBySubname('#cell-selector', 'assignment-cell', 'block')"/>
</div>
""")))};def /*79.2*/mainBody/*79.10*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*79.14*/("""
"""),format.raw/*80.1*/("""<div class="assignment-pane">
    """),_display_(/*81.6*/assignForm/*81.16*/.zipWithIndex.map/*81.33*/ { case (partitionAssignment, topicIdx) =>_display_(Seq[Any](format.raw/*81.75*/("""
    """),format.raw/*82.5*/("""<div class="assignment-cell" name=""""),_display_(/*82.41*/partitionAssignment/*82.60*/._1),format.raw/*82.63*/("""">
        <h4>
            <input type="text" class="borderless" style="display:none"
                   name='topics["""),_display_(/*85.34*/topicIdx),format.raw/*85.42*/("""].topic'
                   value='"""),_display_(/*86.28*/partitionAssignment/*86.47*/._1),format.raw/*86.50*/("""' readonly/>
            """),_display_(/*87.14*/partitionAssignment/*87.33*/._1),format.raw/*87.36*/("""
        """),format.raw/*88.9*/("""</h4>
        """),_display_(/*89.10*/partitionAssignment/*89.29*/._2.zipWithIndex.map/*89.49*/ { case (assignment, assgnIndex) =>_display_(Seq[Any](format.raw/*89.84*/("""
            """),format.raw/*90.13*/("""<div class="partition-cell">
                <table>
                    """),_display_(/*92.22*/assignment/*92.32*/._2.zipWithIndex.map/*92.52*/ { case (broker, brokerIndex) =>_display_(Seq[Any](format.raw/*92.84*/("""
                        """),_display_(/*93.26*/if(brokerIndex == 0)/*93.46*/ {_display_(Seq[Any](format.raw/*93.48*/("""
                        """),format.raw/*94.25*/("""<tr>
                            <th>Partition
                                <input type="number" class="borderless"
                                       name='topics["""),_display_(/*97.54*/topicIdx),format.raw/*97.62*/("""].assignments["""),_display_(/*97.77*/assgnIndex),format.raw/*97.87*/("""].partition'
                                       value='"""),_display_(/*98.48*/assignment/*98.58*/._1),format.raw/*98.61*/("""'
                                       readonly>
                            </th>
                        </tr>
                        """)))}),format.raw/*102.26*/("""
                        """),format.raw/*103.25*/("""<tr><td>
                            Replica """),_display_(/*104.38*/brokerIndex),format.raw/*104.49*/(""": """),_display_(/*104.52*/replicaSelection(topicIdx, assgnIndex, brokerIndex, broker)),format.raw/*104.111*/("""
                        """),format.raw/*105.25*/("""</td></tr>
                    """)))}),format.raw/*106.22*/("""
                """),format.raw/*107.17*/("""</table>
            </div>
        """)))}),format.raw/*109.10*/("""
    """),format.raw/*110.5*/("""</div>
    """)))}),format.raw/*111.6*/("""
"""),format.raw/*112.1*/("""</div>

""")))};def /*116.2*/partitionsAssignmentsPane/*116.27*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*116.31*/("""
"""),format.raw/*117.1*/("""<div class="card">
    """),_display_(/*118.6*/topHeading),format.raw/*118.16*/("""
    """),format.raw/*119.5*/("""<div class="card-body">
    """),_display_(/*120.6*/middleHeading),format.raw/*120.19*/("""
    """),_display_(/*121.6*/mainBody),format.raw/*121.14*/("""
    """),format.raw/*122.5*/("""</div>
</div>
""")))};def /*126.2*/brokersInfoPane/*126.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*126.21*/("""
    """),format.raw/*127.5*/("""<input type="text" placeholder="Type to filter metrics"
           id="selectMetrics" onkeyup="selectBySubname('#selectMetrics', 'metric-row', '')"/>
    """),_display_(/*129.6*/brokersViews/*129.18*/.map/*129.22*/ { case (idx, bv) =>_display_(Seq[Any](format.raw/*129.42*/("""
        """),format.raw/*130.9*/("""<div class="card">
            <div class="card-header">
                <h4>Broker """),_display_(/*132.29*/idx),format.raw/*132.32*/("""</h4>
            </div>
            """),_display_(/*134.14*/views/*134.19*/.html.common.expandedBrokerMetrics(bv.metrics)),format.raw/*134.65*/("""
        """),format.raw/*135.9*/("""</div>
    """)))}),format.raw/*136.6*/("""
""")))};implicit def /*22.2*/implicitFieldConstructor/*22.26*/ = {{ b4.vertical.fieldConstructor() }};def /*26.2*/color/*26.7*/(brokerId: Int) = {{
  java.security.MessageDigest.getInstance("MD5").digest("" + brokerId).map("%02X".format(_)).mkString.substring(0,6)
}};
Seq[Any](format.raw/*21.1*/("""
"""),format.raw/*22.64*/("""
"""),format.raw/*25.2*/("""
"""),format.raw/*28.2*/("""
"""),format.raw/*31.2*/("""
"""),format.raw/*34.2*/("""
"""),format.raw/*51.2*/("""

"""),format.raw/*70.2*/("""

"""),format.raw/*77.2*/("""

"""),format.raw/*114.2*/("""

"""),format.raw/*124.2*/("""

"""),format.raw/*137.2*/("""

"""),_display_(/*139.2*/main(
  "Manual Multiple Assignment",
  menu = theMenu,
  breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Topics",cluster)))/*142.117*/ {_display_(Seq[Any](format.raw/*142.119*/("""
"""),format.raw/*143.1*/("""<div class="row">
    <div class="col-md-8">
        """),_display_(/*145.10*/if(true)/*145.18*/ {_display_(Seq[Any](format.raw/*145.20*/("""
            """),_display_(/*146.14*/helper/*146.20*/.form(action = routes.ReassignPartitions.handleManualAssignment(cluster, topic))/*146.100*/ {_display_(Seq[Any](format.raw/*146.102*/("""
                """),_display_(/*147.18*/partitionsAssignmentsPane),format.raw/*147.43*/("""
            """)))}),format.raw/*148.14*/("""
        """)))}/*149.11*/else/*149.16*/{_display_(Seq[Any](format.raw/*149.17*/("""
            """),_display_(/*150.14*/assignForm/*150.24*/.toString),format.raw/*150.33*/("""
            """),format.raw/*151.13*/("""<br/><br/><br/><br/><br/>
            """),_display_(/*152.14*/formErrors/*152.24*/.toString),format.raw/*152.33*/("""
        """)))}),format.raw/*153.10*/("""
    """),format.raw/*154.5*/("""</div>
    <div class="col-md-4">
        """),_display_(/*156.10*/if(brokers != null)/*156.29*/ {_display_(Seq[Any](format.raw/*156.31*/("""
            """),_display_(/*157.14*/brokersInfoPane),format.raw/*157.29*/("""
        """)))}),format.raw/*158.10*/("""
    """),format.raw/*159.5*/("""</div>
</div>
""")))}),format.raw/*161.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,topic:String,assignForm:List[scala.Tuple2[String, List[scala.Tuple2[Int, List[Int]]]]],brokers:BrokerListExtended,brokersViews:Map[Int, BVView],formErrors:Seq[FormError],af:features.ApplicationFeatures,cf:kafka.manager.features.ClusterFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,topic,assignForm,brokers,brokersViews,formErrors)(af,cf,messages,menus,request)

  def f:((String,String,List[scala.Tuple2[String, List[scala.Tuple2[Int, List[Int]]]]],BrokerListExtended,Map[Int, BVView],Seq[FormError]) => (features.ApplicationFeatures,kafka.manager.features.ClusterFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,topic,assignForm,brokers,brokersViews,formErrors) => (af,cf,messages,menus,request) => apply(cluster,topic,assignForm,brokers,brokersViews,formErrors)(af,cf,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/topic/manualAssignments.scala.html
                  HASH: 5698654438fc697bfa240d08af0f0966a0dba656
                  MATRIX: 438->116|464->136|511->177|560->220|597->250|621->267|1210->290|1649->717|1664->724|1745->728|1773->730|1786->735|1912->839|1937->989|1952->996|2048->1015|2078->1018|2106->1020|2142->1035|2167->1039|2188->1051|2292->1078|2322->1081|2350->1083|2372->1096|2482->1184|2507->1188|2532->1204|2677->1272|2709->1278|2785->1345|2825->1347|2857->1352|2916->1384|2954->1401|2983->1402|3164->1556|3193->1564|3235->1579|3265->1588|3303->1599|3335->1610|3375->1623|3391->1630|3409->1639|3464->1656|3500->1665|3561->1699|3600->1717|3637->1727|3689->1757|3735->1776|3750->1782|3774->1785|3804->1788|3838->1813|3877->1814|3917->1823|3953->1832|3968->1838|3992->1841|4042->1860|4076->1867|4141->1915|4154->1920|4193->1921|4229->1930|4346->2019|4375->2020|4422->2039|4451->2040|4496->2055|4521->2060|4540->2070|4621->2074|4649->2075|5293->2699|5315->2712|5396->2716|5424->2717|5657->2930|5674->2938|5755->2942|5783->2943|5844->2978|5863->2988|5889->3005|5969->3047|6001->3052|6064->3088|6092->3107|6116->3110|6263->3230|6292->3238|6355->3274|6383->3293|6407->3296|6460->3322|6488->3341|6512->3344|6548->3353|6590->3368|6618->3387|6647->3407|6720->3442|6761->3455|6862->3529|6881->3539|6910->3559|6980->3591|7033->3617|7062->3637|7102->3639|7155->3664|7354->3836|7383->3844|7425->3859|7456->3869|7543->3929|7562->3939|7586->3942|7758->4082|7812->4107|7886->4153|7919->4164|7950->4167|8032->4226|8086->4251|8150->4283|8196->4300|8265->4337|8298->4342|8341->4354|8370->4355|8403->4367|8438->4392|8520->4396|8549->4397|8600->4421|8632->4431|8665->4436|8721->4465|8756->4478|8789->4484|8819->4492|8852->4497|8891->4515|8916->4530|8998->4534|9031->4539|9213->4694|9235->4706|9249->4710|9308->4730|9345->4739|9458->4824|9483->4827|9549->4865|9564->4870|9632->4916|9669->4925|9712->4937|9746->653|9779->677|9831->843|9844->848|10013->651|10042->715|10070->841|10098->987|10126->1037|10154->1186|10182->2057|10211->2696|10240->2927|10270->4364|10300->4512|10330->4939|10360->4942|10543->5114|10585->5116|10614->5117|10696->5171|10714->5179|10755->5181|10797->5195|10813->5201|10904->5281|10946->5283|10992->5301|11039->5326|11085->5340|11115->5351|11129->5356|11169->5357|11211->5371|11231->5381|11262->5390|11304->5403|11371->5442|11391->5452|11422->5461|11464->5471|11497->5476|11568->5519|11597->5538|11638->5540|11680->5554|11717->5569|11759->5579|11792->5584|11838->5599
                  LINES: 17->6|18->7|19->8|20->9|21->10|22->11|27->13|38->23|38->23|40->23|41->24|41->24|41->24|42->29|42->29|44->29|45->30|45->30|45->30|46->32|46->32|48->32|49->33|49->33|49->33|49->33|50->35|50->35|52->35|53->36|53->36|53->36|54->37|54->37|54->37|54->37|57->40|57->40|57->40|57->40|57->40|57->40|58->41|58->41|58->41|58->41|59->42|59->42|59->42|59->42|59->42|60->43|60->43|60->43|60->43|60->43|60->43|60->43|60->43|60->43|60->43|61->44|62->45|64->47|64->47|64->47|65->48|66->49|66->49|66->49|66->49|67->50|68->53|68->53|70->53|71->54|87->72|87->72|89->72|90->73|94->79|94->79|96->79|97->80|98->81|98->81|98->81|98->81|99->82|99->82|99->82|99->82|102->85|102->85|103->86|103->86|103->86|104->87|104->87|104->87|105->88|106->89|106->89|106->89|106->89|107->90|109->92|109->92|109->92|109->92|110->93|110->93|110->93|111->94|114->97|114->97|114->97|114->97|115->98|115->98|115->98|119->102|120->103|121->104|121->104|121->104|121->104|122->105|123->106|124->107|126->109|127->110|128->111|129->112|131->116|131->116|133->116|134->117|135->118|135->118|136->119|137->120|137->120|138->121|138->121|139->122|141->126|141->126|143->126|144->127|146->129|146->129|146->129|146->129|147->130|149->132|149->132|151->134|151->134|151->134|152->135|153->136|154->22|154->22|154->26|154->26|157->21|158->22|159->25|160->28|161->31|162->34|163->51|165->70|167->77|169->114|171->124|173->137|175->139|178->142|178->142|179->143|181->145|181->145|181->145|182->146|182->146|182->146|182->146|183->147|183->147|184->148|185->149|185->149|185->149|186->150|186->150|186->150|187->151|188->152|188->152|188->152|189->153|190->154|192->156|192->156|192->156|193->157|193->157|194->158|195->159|197->161
                  -- GENERATED --
              */
          