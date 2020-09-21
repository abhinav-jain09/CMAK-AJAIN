
package views.html

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

object reassignPartitions extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,$bslash$div[kafka.manager.ApiError, Option[kafka.manager.model.ActorModel.ReassignPartitions]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String, errorOrStatus: kafka.manager.ApiError \/ Option[kafka.manager.model.ActorModel.ReassignPartitions]
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*10.2*/theMenu/*10.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.13*/("""
"""),_display_(/*11.2*/views/*11.7*/.html.navigation.clusterMenu(cluster,"Reassign Partitions","",menus.clusterMenus(cluster)(
    errorOrStatus.toOption.flatten.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*12.133*/("""
""")))};def /*15.2*/renderView/*15.12*/(c: String, viewOption: Option[kafka.manager.model.ActorModel.ReassignPartitions]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*15.98*/("""
"""),_display_(/*16.2*/viewOption/*16.12*/.fold/*16.17*/ {_display_(Seq[Any](format.raw/*16.19*/("""
"""),format.raw/*17.1*/("""<div class="row">
    <div class="alert alert-warning" role="alert">
        No data found for any recent reassign partitions command.
    </div>
</div>
""")))}/*22.2*/ { repar =>_display_(Seq[Any](format.raw/*22.13*/("""
"""),format.raw/*23.1*/("""<div class="row">
    <div class="card">
        <div class="card-header"><h4>Status</h4></div>
        <div class="card-body">
        <table class="table">
            <tbody>
            <tr>
                <td>Submitted:</td>
                <td>"""),_display_(/*31.22*/repar/*31.27*/.startTime),format.raw/*31.37*/("""</td>
            <tr>
                <td>Completed:</td>
                <td>"""),_display_(/*34.22*/repar/*34.27*/.endTime.map(_.toString()).getOrElse("pending")),format.raw/*34.74*/("""</td>
            </tr>
            </tbody>
        </table>
        </div>
    </div>
</div>
<div class="row">
    <div class="card">
        <div class="card-header"><h4>Request Data</h4></div>
        <div class="card-body">
        <table class="table">
            <thead>
            <tr><th>Topic</th><th>Partition</th><th>Replica Assignment</th></tr>
            </thead>
            <tbody>
            """),_display_(/*50.14*/for(((topic,partNum),assignment) <- repar.sortedTopicPartitionAssignmentList) yield /*50.91*/ {_display_(Seq[Any](format.raw/*50.93*/("""
            """),format.raw/*51.13*/("""<tr>
                <td><a href=""""),_display_(/*52.31*/routes/*52.37*/.Topic.topic(cluster,topic)),format.raw/*52.64*/("""">"""),_display_(/*52.67*/topic),format.raw/*52.72*/("""</a></td>
                <td>"""),_display_(/*53.22*/partNum),format.raw/*53.29*/("""</td>
                <td>"""),_display_(/*54.22*/assignment/*54.32*/.mkString("(",",",")")),format.raw/*54.54*/("""</td>
            </tr>
            """)))}),format.raw/*56.14*/("""
            """),format.raw/*57.13*/("""</tbody>
        </table>
        </div>
    </div>
</div>
""")))}),format.raw/*62.2*/("""
""")))};implicit def /*9.2*/implicitFieldConstructor/*9.26*/ = {{ b4.vertical.fieldConstructor() }};
Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.64*/("""
"""),format.raw/*13.2*/("""

"""),format.raw/*63.2*/("""

"""),_display_(/*65.2*/main(
    "Reassign Partitions",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Reassign Partitions",cluster)))/*68.132*/ {_display_(Seq[Any](format.raw/*68.134*/("""
"""),format.raw/*69.1*/("""<div class="col-md-6 un-pad-me">
    <div class="card">
        <div class="card-header"><h3>Reassign Partitions</h3></div>
        <div class="col-md-12">
            """),_display_(/*73.14*/errorOrStatus/*73.27*/.fold[Html](views.html.errors.onApiError(_), renderView(cluster, _))),format.raw/*73.95*/("""
        """),format.raw/*74.9*/("""</div>
    </div>
</div>
""")))}),format.raw/*77.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,errorOrStatus:$bslash$div[kafka.manager.ApiError, Option[kafka.manager.model.ActorModel.ReassignPartitions]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrStatus)(af,messages,menus,request)

  def f:((String,$bslash$div[kafka.manager.ApiError, Option[kafka.manager.model.ActorModel.ReassignPartitions]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrStatus) => (af,messages,menus,request) => apply(cluster,errorOrStatus)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:51 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/reassignPartitions.scala.html
                  HASH: d412d1ce9a60b3fe592018593ba466b5f5cad552
                  MATRIX: 432->115|953->135|1281->451|1296->458|1377->462|1405->464|1418->469|1663->692|1688->697|1707->707|1870->793|1898->795|1917->805|1931->810|1971->812|1999->813|2171->967|2220->978|2248->979|2527->1231|2541->1236|2572->1246|2679->1326|2693->1331|2761->1378|3202->1792|3295->1869|3335->1871|3376->1884|3438->1919|3453->1925|3501->1952|3531->1955|3557->1960|3615->1991|3643->1998|3697->2025|3716->2035|3759->2057|3827->2094|3868->2107|3958->2167|3991->387|4023->411|4090->385|4118->449|4146->694|4175->2169|4204->2172|4398->2356|4439->2358|4467->2359|4663->2528|4685->2541|4774->2609|4810->2618|4866->2644
                  LINES: 17->5|22->6|27->10|27->10|29->10|30->11|30->11|31->12|32->15|32->15|34->15|35->16|35->16|35->16|35->16|36->17|41->22|41->22|42->23|50->31|50->31|50->31|53->34|53->34|53->34|69->50|69->50|69->50|70->51|71->52|71->52|71->52|71->52|71->52|72->53|72->53|73->54|73->54|73->54|75->56|76->57|81->62|82->9|82->9|83->8|84->9|85->13|87->63|89->65|92->68|92->68|93->69|97->73|97->73|97->73|98->74|101->77
                  -- GENERATED --
              */
          