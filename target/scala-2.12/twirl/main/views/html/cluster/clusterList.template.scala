
package views.html.cluster

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

object clusterList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[IndexedSeq[kafka.manager.model.ClusterConfig],features.ApplicationFeatures,play.api.i18n.Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(clusters: IndexedSeq[kafka.manager.model.ClusterConfig])(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.1*/("""
            """),format.raw/*7.13*/("""<table class="table">
                <thead>
                <tr><th>Active</th><th>Operations</th><th>Version</th></tr>
                </thead>
                <tbody>
                """),_display_(/*12.18*/for(cluster <- clusters) yield /*12.42*/ {_display_(Seq[Any](format.raw/*12.44*/("""
                """),format.raw/*13.17*/("""<tr>
                    <td>
                        """),_display_(/*15.26*/if(cluster.enabled)/*15.45*/ {_display_(Seq[Any](format.raw/*15.47*/("""
                            """),format.raw/*16.29*/("""<a href=""""),_display_(/*16.39*/routes/*16.45*/.Cluster.cluster(cluster.name).relative),format.raw/*16.84*/("""">"""),_display_(/*16.87*/cluster/*16.94*/.name),format.raw/*16.99*/("""</a>
                        """)))}/*17.27*/else/*17.32*/{_display_(Seq[Any](format.raw/*17.33*/("""
                            """),_display_(/*18.30*/cluster/*18.37*/.name),format.raw/*18.42*/("""
                        """)))}),format.raw/*19.26*/("""
                    """),format.raw/*20.21*/("""</td>
                    <td>
                        <div class="form-group" role="group" aria-label="Cluster Operations">
                        """),_display_(/*23.26*/features/*23.34*/.app(features.KMClusterManagerFeature)/*23.72*/ {_display_(Seq[Any](format.raw/*23.74*/("""
                            """),_display_(/*24.30*/if(cluster.enabled)/*24.49*/ {_display_(Seq[Any](format.raw/*24.51*/("""
                                """),format.raw/*25.33*/("""<a href=""""),_display_(/*25.43*/routes/*25.49*/.Cluster.updateCluster(cluster.name).relative),format.raw/*25.94*/("""" class="btn btn-outline-primary" role="button">Modify</a>
                                """),_display_(/*26.34*/b4/*26.36*/.vertical.form(routes.Cluster.handleUpdateCluster(cluster.name).copy(url=routes.Cluster.handleUpdateCluster(cluster.name).relative))/*26.168*/ { implicit fc =>_display_(Seq[Any](format.raw/*26.185*/("""
                                """),format.raw/*27.33*/("""<input type="hidden" name="name" value=""""),_display_(/*27.74*/cluster/*27.81*/.name),format.raw/*27.86*/("""">
                                <input type="hidden" name="kafkaVersion" value=""""),_display_(/*28.82*/cluster/*28.89*/.version.toString),format.raw/*28.106*/("""">
                                <input type="hidden" name="zkHosts" value=""""),_display_(/*29.77*/cluster/*29.84*/.curatorConfig.zkConnect),format.raw/*29.108*/("""">
                                <input type="hidden" name="securityProtocol" value=""""),_display_(/*30.86*/cluster/*30.93*/.securityProtocol.stringId),format.raw/*30.119*/("""">
                                <input type="hidden" name="operation" value="Disable">
                                """),_display_(/*32.34*/b4/*32.36*/.submit('class -> "btn btn-outline-warning")/*32.80*/{_display_(Seq[Any](format.raw/*32.81*/(""" """),format.raw/*32.82*/("""Disable """)))}),format.raw/*32.91*/("""
                                """)))}),format.raw/*33.34*/("""
                            """)))}/*34.31*/else/*34.36*/{_display_(Seq[Any](format.raw/*34.37*/("""
                                """),_display_(/*35.34*/b4/*35.36*/.vertical.form(routes.Cluster.handleUpdateCluster(cluster.name))/*35.100*/ { implicit fc =>_display_(Seq[Any](format.raw/*35.117*/("""
                                """),format.raw/*36.33*/("""<input type="hidden" name="name" value=""""),_display_(/*36.74*/cluster/*36.81*/.name),format.raw/*36.86*/("""">
                                <input type="hidden" name="kafkaVersion" value=""""),_display_(/*37.82*/cluster/*37.89*/.version.toString),format.raw/*37.106*/("""">
                                <input type="hidden" name="zkHosts" value=""""),_display_(/*38.77*/cluster/*38.84*/.curatorConfig.zkConnect),format.raw/*38.108*/("""">
                                <input type="hidden" name="securityProtocol" value=""""),_display_(/*39.86*/cluster/*39.93*/.securityProtocol.stringId),format.raw/*39.119*/("""">
                                <input type="hidden" name="operation" value="Enable">
                                """),_display_(/*41.34*/b4/*41.36*/.submit('class -> "btn btn-outline-success")/*41.80*/{_display_(Seq[Any](format.raw/*41.81*/(""" """),format.raw/*41.82*/("""Enable """)))}),format.raw/*41.90*/("""
                                """)))}),format.raw/*42.34*/("""
                                """),_display_(/*43.34*/b4/*43.36*/.vertical.form(routes.Cluster.handleUpdateCluster(cluster.name))/*43.100*/ { implicit fc =>_display_(Seq[Any](format.raw/*43.117*/("""
                                """),format.raw/*44.33*/("""<input type="hidden" name="name" value=""""),_display_(/*44.74*/cluster/*44.81*/.name),format.raw/*44.86*/("""">
                                <input type="hidden" name="kafkaVersion" value=""""),_display_(/*45.82*/cluster/*45.89*/.version.toString),format.raw/*45.106*/("""">
                                <input type="hidden" name="zkHosts" value=""""),_display_(/*46.77*/cluster/*46.84*/.curatorConfig.zkConnect),format.raw/*46.108*/("""">
                                <input type="hidden" name="securityProtocol" value=""""),_display_(/*47.86*/cluster/*47.93*/.securityProtocol.stringId),format.raw/*47.119*/("""">
                                <input type="hidden" name="operation" value="Delete">
                                """),_display_(/*49.34*/b4/*49.36*/.submit('class -> "btn btn-outline-danger")/*49.79*/{_display_(Seq[Any](format.raw/*49.80*/(""" """),format.raw/*49.81*/("""Delete """)))}),format.raw/*49.89*/("""
                                """)))}),format.raw/*50.34*/("""
                            """)))}),format.raw/*51.30*/("""
                        """)))}),format.raw/*52.26*/("""
                        """),format.raw/*53.25*/("""</div>
                    </td>
                    <td>
                        """),_display_(/*56.26*/cluster/*56.33*/.version.toString),format.raw/*56.50*/("""
                    """),format.raw/*57.21*/("""</td>
                </tr>
                """)))}),format.raw/*59.18*/("""
                """),format.raw/*60.17*/("""</tbody>
            </table>

"""))
      }
    }
  }

  def render(clusters:IndexedSeq[kafka.manager.model.ClusterConfig],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(clusters)(af,messages,request)

  def f:((IndexedSeq[kafka.manager.model.ClusterConfig]) => (features.ApplicationFeatures,play.api.i18n.Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (clusters) => (af,messages,request) => apply(clusters)(af,messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/cluster/clusterList.scala.html
                  HASH: 4bf51fbc4d23eb236b232d108142c39068203be4
                  MATRIX: 957->115|1208->273|1248->286|1463->474|1503->498|1543->500|1588->517|1670->572|1698->591|1738->593|1795->622|1832->632|1847->638|1907->677|1937->680|1953->687|1979->692|2028->723|2041->728|2080->729|2137->759|2153->766|2179->771|2236->797|2285->818|2462->968|2479->976|2526->1014|2566->1016|2623->1046|2651->1065|2691->1067|2752->1100|2789->1110|2804->1116|2870->1161|2989->1253|3000->1255|3142->1387|3198->1404|3259->1437|3327->1478|3343->1485|3369->1490|3480->1574|3496->1581|3535->1598|3641->1677|3657->1684|3703->1708|3818->1796|3834->1803|3882->1829|4032->1952|4043->1954|4096->1998|4135->1999|4164->2000|4204->2009|4269->2043|4318->2074|4331->2079|4370->2080|4431->2114|4442->2116|4516->2180|4572->2197|4633->2230|4701->2271|4717->2278|4743->2283|4854->2367|4870->2374|4909->2391|5015->2470|5031->2477|5077->2501|5192->2589|5208->2596|5256->2622|5405->2744|5416->2746|5469->2790|5508->2791|5537->2792|5576->2800|5641->2834|5702->2868|5713->2870|5787->2934|5843->2951|5904->2984|5972->3025|5988->3032|6014->3037|6125->3121|6141->3128|6180->3145|6286->3224|6302->3231|6348->3255|6463->3343|6479->3350|6527->3376|6676->3498|6687->3500|6739->3543|6778->3544|6807->3545|6846->3553|6911->3587|6972->3617|7029->3643|7082->3668|7192->3751|7208->3758|7246->3775|7295->3796|7371->3841|7416->3858
                  LINES: 24->5|29->6|30->7|35->12|35->12|35->12|36->13|38->15|38->15|38->15|39->16|39->16|39->16|39->16|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|43->20|46->23|46->23|46->23|46->23|47->24|47->24|47->24|48->25|48->25|48->25|48->25|49->26|49->26|49->26|49->26|50->27|50->27|50->27|50->27|51->28|51->28|51->28|52->29|52->29|52->29|53->30|53->30|53->30|55->32|55->32|55->32|55->32|55->32|55->32|56->33|57->34|57->34|57->34|58->35|58->35|58->35|58->35|59->36|59->36|59->36|59->36|60->37|60->37|60->37|61->38|61->38|61->38|62->39|62->39|62->39|64->41|64->41|64->41|64->41|64->41|64->41|65->42|66->43|66->43|66->43|66->43|67->44|67->44|67->44|67->44|68->45|68->45|68->45|69->46|69->46|69->46|70->47|70->47|70->47|72->49|72->49|72->49|72->49|72->49|72->49|73->50|74->51|75->52|76->53|79->56|79->56|79->56|80->57|82->59|83->60
                  -- GENERATED --
              */
          