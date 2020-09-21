
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
/*5.2*/import scalaz.{\/}

object topicList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,$bslash$div[kafka.manager.ApiError, kafka.manager.TopicListExtended],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String, errorOrTopics: kafka.manager.ApiError \/ kafka.manager.TopicListExtended
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/theMenu/*9.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.13*/("""
    """),_display_(/*10.6*/views/*10.11*/.html.navigation.clusterMenu(cluster,"Topic","List",menus.clusterMenus(cluster)(
        errorOrTopics.toOption.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*11.129*/("""
""")))};def /*14.2*/topicScripts/*14.14*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.18*/("""
    """),_display_(/*15.6*/if(errorOrTopics.fold(err=>false,tl=>tl.list.headOption.map(opt => opt._2.map(ti => ti.clusterContext.config.displaySizeEnabled).getOrElse(false)).getOrElse(false)))/*15.171*/{_display_(Seq[Any](format.raw/*15.172*/("""
        """),format.raw/*16.9*/("""<script src="https://cdn.datatables.net/plug-ins/1.10.10/sorting/file-size.js"></script>
        <script ype="text/javascript">
        $(document).ready(function() """),format.raw/*18.38*/("""{"""),format.raw/*18.39*/("""
            """),format.raw/*19.13*/("""$('#topics-table').DataTable( """),format.raw/*19.43*/("""{"""),format.raw/*19.44*/("""
                """),format.raw/*20.17*/("""columnDefs: [
                    """),format.raw/*21.21*/("""{"""),format.raw/*21.22*/(""" """),format.raw/*21.23*/("""type: 'file-size', targets: 7 """),format.raw/*21.53*/("""}"""),format.raw/*21.54*/("""
                """),format.raw/*22.17*/("""],
                "lengthMenu": [[10, 25, 50, -1], [10, 25, 50, "All"]]
            """),format.raw/*24.13*/("""}"""),format.raw/*24.14*/(""" """),format.raw/*24.15*/(""");
        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/(""" """),format.raw/*25.11*/(""");
        </script>
    """)))}/*27.7*/else/*27.12*/{_display_(Seq[Any](format.raw/*27.13*/("""
        """),format.raw/*28.9*/("""<script ype="text/javascript">
        $(document).ready(function() """),format.raw/*29.38*/("""{"""),format.raw/*29.39*/("""
            """),format.raw/*30.13*/("""$('#topics-table').DataTable(
                    """),format.raw/*31.21*/("""{"""),format.raw/*31.22*/("""
                        """),format.raw/*32.25*/(""""lengthMenu": [[10, 25, 50, -1], [10, 25, 50, "All"]]
                    """),format.raw/*33.21*/("""}"""),format.raw/*33.22*/("""
            """),format.raw/*34.13*/(""");
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/(""" """),format.raw/*35.11*/(""");
        </script>
    """)))}),format.raw/*37.6*/("""
""")))};
Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*12.2*/("""

"""),format.raw/*38.2*/("""

"""),_display_(/*40.2*/main(
    "Topic List",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Topics",cluster)),
    scripts=topicScripts)/*44.26*/ {_display_(Seq[Any](format.raw/*44.28*/("""
    """),format.raw/*45.5*/("""<div class="col-md-12">
        """),_display_(/*46.10*/features/*46.18*/.app(features.KMTopicManagerFeature)/*46.54*/ {_display_(Seq[Any](format.raw/*46.56*/("""
        """),format.raw/*47.9*/("""<div class="card">
            <div class="card-header"><h4>Operations</h4></div>
            <div class="card-body">
            <div class="col-md-6">
            <table class="table">
                <tr>
                    """),_display_(/*53.22*/features/*53.30*/.app(features.KMReassignPartitionsFeature)/*53.72*/ {_display_(Seq[Any](format.raw/*53.74*/("""
                    """),format.raw/*54.21*/("""<td>
                        <a href=""""),_display_(/*55.35*/routes/*55.41*/.ReassignPartitions.confirmMultipleAssignments(cluster)),format.raw/*55.96*/("""" class="submit-button btn btn-primary" role="button">Generate Partition Assignments</a>
                    </td>
                    <td>
                        <a href=""""),_display_(/*58.35*/routes/*58.41*/.ReassignPartitions.runMultipleAssignments(cluster)),format.raw/*58.92*/("""" class="submit-button btn btn-primary" role="button">Run Partition Assignments</a>
                    </td>
                    """)))}),format.raw/*60.22*/("""
                    """),format.raw/*61.21*/("""<td>
                        <a href=""""),_display_(/*62.35*/routes/*62.41*/.Topic.addPartitionsToMultipleTopics(cluster)),format.raw/*62.86*/("""" class="submit-button btn btn-primary" role="button">Add Partitions</a>
                    </td>
                </tr>
                </tbody>
            </table>
            </div>
            </div>
        </div>
        """)))}),format.raw/*70.10*/("""
    """),format.raw/*71.5*/("""</div>
    <div class="col-md-12">
        <div class="card">
            <div class="card-body"><h3>Topics</h3>
            """),_display_(/*75.14*/errorOrTopics/*75.27*/.fold( 
                views.html.errors.onApiError(_),
                tl => views.html.topic.topicListContent(
                        cluster,tl.list.map(t => (t, tl.deleteSet(t._1))),
                        tl.underReassignments,
                        tl.list.headOption.map(opt => opt._2.map(ti => ti.clusterContext.config.pollConsumers).getOrElse(false)).getOrElse(false),
                        tl.list.headOption.map(opt => opt._2.map(ti => ti.clusterContext.config.displaySizeEnabled).getOrElse(false)).getOrElse(false)))),format.raw/*81.153*/("""
            """),format.raw/*82.13*/("""</div>
        </div>
    </div>
""")))}),format.raw/*85.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,errorOrTopics:$bslash$div[kafka.manager.ApiError, kafka.manager.TopicListExtended],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrTopics)(af,messages,menus,request)

  def f:((String,$bslash$div[kafka.manager.ApiError, kafka.manager.TopicListExtended]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrTopics) => (af,messages,menus,request) => apply(cluster,errorOrTopics)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/topic/topicList.scala.html
                  HASH: 125883aa808bd1ed219b952daadd3711d3a0f585
                  MATRIX: 438->115|924->135|1225->361|1239->368|1319->372|1351->378|1365->383|1596->592|1621->597|1642->609|1723->613|1755->619|1930->784|1970->785|2006->794|2199->959|2228->960|2269->973|2327->1003|2356->1004|2401->1021|2463->1055|2492->1056|2521->1057|2579->1087|2608->1088|2653->1105|2766->1190|2795->1191|2824->1192|2862->1203|2891->1204|2920->1205|2964->1232|2977->1237|3016->1238|3052->1247|3148->1315|3177->1316|3218->1329|3296->1379|3325->1380|3378->1405|3480->1479|3509->1480|3550->1493|3588->1504|3617->1505|3646->1506|3702->1532|3742->359|3770->594|3799->1534|3828->1537|4025->1725|4065->1727|4097->1732|4157->1765|4174->1773|4219->1809|4259->1811|4295->1820|4551->2049|4568->2057|4619->2099|4659->2101|4708->2122|4774->2161|4789->2167|4865->2222|5066->2396|5081->2402|5153->2453|5315->2584|5364->2605|5430->2644|5445->2650|5511->2695|5771->2924|5803->2929|5956->3055|5978->3068|6535->3603|6576->3616|6640->3650
                  LINES: 17->5|22->6|27->9|27->9|29->9|30->10|30->10|31->11|32->14|32->14|34->14|35->15|35->15|35->15|36->16|38->18|38->18|39->19|39->19|39->19|40->20|41->21|41->21|41->21|41->21|41->21|42->22|44->24|44->24|44->24|45->25|45->25|45->25|47->27|47->27|47->27|48->28|49->29|49->29|50->30|51->31|51->31|52->32|53->33|53->33|54->34|55->35|55->35|55->35|57->37|59->8|60->12|62->38|64->40|68->44|68->44|69->45|70->46|70->46|70->46|70->46|71->47|77->53|77->53|77->53|77->53|78->54|79->55|79->55|79->55|82->58|82->58|82->58|84->60|85->61|86->62|86->62|86->62|94->70|95->71|99->75|99->75|105->81|106->82|109->85
                  -- GENERATED --
              */
          