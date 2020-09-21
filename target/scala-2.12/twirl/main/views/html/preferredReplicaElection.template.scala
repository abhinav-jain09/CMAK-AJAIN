
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

object preferredReplicaElection extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[String,$bslash$div[kafka.manager.ApiError, Option[kafka.manager.model.ActorModel.PreferredReplicaElection]],Form[models.form.PreferredReplicaElectionOperation],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String,
errorOrStatus: kafka.manager.ApiError \/ Option[kafka.manager.model.ActorModel.PreferredReplicaElection],
operationForm: Form[models.form.PreferredReplicaElectionOperation]
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*11.2*/theMenu/*11.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*11.13*/("""
"""),_display_(/*12.2*/views/*12.7*/.html.navigation.clusterMenu(cluster,"Preferred Replica Election","",menus.clusterMenus(cluster)(
    errorOrStatus.toOption.flatten.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*13.133*/("""
""")))};def /*16.2*/renderView/*16.12*/(c: String, viewOption: Option[kafka.manager.model.ActorModel.PreferredReplicaElection]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.104*/("""
"""),_display_(/*17.2*/viewOption/*17.12*/.fold/*17.17*/ {_display_(Seq[Any](format.raw/*17.19*/("""
"""),format.raw/*18.1*/("""<div class="row">
    <div class="alert alert-warning" role="alert">
        No data found for any recent preferred replica election command.
    </div>
</div>
""")))}/*23.2*/ { pre =>_display_(Seq[Any](format.raw/*23.11*/("""
"""),format.raw/*24.1*/("""<div class="row">
    <div class="card">
        <div class="card-header"><h4>Last Request Info</h4></div>
        <div class="card-body">
        <table class="table">
            <tbody>
            <tr>
                <td>Submitted:</td>
                <td>"""),_display_(/*32.22*/pre/*32.25*/.startTime),format.raw/*32.35*/("""</td>
            <tr>
                <td>Completed:</td>
                <td>"""),_display_(/*35.22*/pre/*35.25*/.endTime.map(_.toString()).getOrElse("pending")),format.raw/*35.72*/("""</td>
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
            <tr><th>Topic</th><th>Partition</th></tr>
            </thead>
            <tbody>
            """),_display_(/*51.14*/for((topic,partNum) <- pre.sortedTopicPartitionList) yield /*51.66*/ {_display_(Seq[Any](format.raw/*51.68*/("""
            """),format.raw/*52.13*/("""<tr>
                <td><a href=""""),_display_(/*53.31*/routes/*53.37*/.Topic.topic(cluster,topic)),format.raw/*53.64*/("""">"""),_display_(/*53.67*/topic),format.raw/*53.72*/("""</a></td>
                <td>"""),_display_(/*54.22*/partNum),format.raw/*54.29*/("""</td>
            </tr>
            """)))}),format.raw/*56.14*/("""
            """),format.raw/*57.13*/("""</tbody>
        </table>
        </div>
    </div>
</div>
""")))}),format.raw/*62.2*/("""
""")))};
Seq[Any](format.raw/*10.1*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*63.2*/("""

"""),_display_(/*65.2*/main(
    "Preferred Replica Election",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Preferred Replica Election",cluster)))/*68.139*/ {_display_(Seq[Any](format.raw/*68.141*/("""
"""),format.raw/*69.1*/("""<div class="col-md-6 un-pad-me">
    <div class="card">
        <div class="card-header"><h3>Preferred Replica Election</h3></div>
        <div class="col-md-12">
            """),_display_(/*73.14*/features/*73.22*/.app(features.KMPreferredReplicaElectionFeature)/*73.70*/ {_display_(Seq[Any](format.raw/*73.72*/("""
                """),format.raw/*74.17*/("""<div class="row">
                    """),_display_(/*75.22*/b4/*75.24*/.vertical.form(routes.PreferredReplicaElection.handleRunElection(cluster))/*75.98*/ { implicit fc =>_display_(Seq[Any](format.raw/*75.115*/("""
                    """),format.raw/*76.21*/("""<fieldset>
                        <input type="hidden" name="operation" value="run">
                        """),_display_(/*78.26*/b4/*78.28*/.submit('class -> "btn btn-primary")/*78.64*/{_display_(Seq[Any](format.raw/*78.65*/(""" """),format.raw/*78.66*/("""Run Preferred Replica Election """)))}),format.raw/*78.98*/("""
                    """),format.raw/*79.21*/("""</fieldset>
                    """)))}),format.raw/*80.22*/("""
                """),format.raw/*81.17*/("""</div>
            """)))}),format.raw/*82.14*/("""

            """),_display_(/*84.14*/errorOrStatus/*84.27*/.fold[Html](views.html.errors.onApiError(_), renderView(cluster, _))),format.raw/*84.95*/("""
        """),format.raw/*85.9*/("""</div>
    </div>
</div>

    """)))}),format.raw/*89.6*/("""
"""))
      }
    }
  }

  def render(cluster:String,errorOrStatus:$bslash$div[kafka.manager.ApiError, Option[kafka.manager.model.ActorModel.PreferredReplicaElection]],operationForm:Form[models.form.PreferredReplicaElectionOperation],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrStatus,operationForm)(af,messages,menus,request)

  def f:((String,$bslash$div[kafka.manager.ApiError, Option[kafka.manager.model.ActorModel.PreferredReplicaElection]],Form[models.form.PreferredReplicaElectionOperation]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrStatus,operationForm) => (af,messages,menus,request) => apply(cluster,errorOrStatus,operationForm)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:51 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/preferredReplicaElection.scala.html
                  HASH: df125e5165c70805eedc8b83a8e93c377a2c9196
                  MATRIX: 432->115|1017->135|1419->461|1434->468|1515->472|1543->474|1556->479|1808->709|1833->714|1852->724|2022->816|2050->818|2069->828|2083->833|2123->835|2151->836|2330->997|2377->1006|2405->1007|2695->1270|2707->1273|2738->1283|2845->1363|2857->1366|2925->1413|3339->1800|3407->1852|3447->1854|3488->1867|3550->1902|3565->1908|3613->1935|3643->1938|3669->1943|3727->1974|3755->1981|3823->2018|3864->2031|3954->2091|3995->459|4023->711|4052->2093|4081->2096|4289->2294|4330->2296|4358->2297|4561->2473|4578->2481|4635->2529|4675->2531|4720->2548|4786->2587|4797->2589|4880->2663|4936->2680|4985->2701|5123->2812|5134->2814|5179->2850|5218->2851|5247->2852|5310->2884|5359->2905|5423->2938|5468->2955|5519->2975|5561->2990|5583->3003|5672->3071|5708->3080|5769->3111
                  LINES: 17->5|22->6|29->11|29->11|31->11|32->12|32->12|33->13|34->16|34->16|36->16|37->17|37->17|37->17|37->17|38->18|43->23|43->23|44->24|52->32|52->32|52->32|55->35|55->35|55->35|71->51|71->51|71->51|72->52|73->53|73->53|73->53|73->53|73->53|74->54|74->54|76->56|77->57|82->62|84->10|85->14|87->63|89->65|92->68|92->68|93->69|97->73|97->73|97->73|97->73|98->74|99->75|99->75|99->75|99->75|100->76|102->78|102->78|102->78|102->78|102->78|102->78|103->79|104->80|105->81|106->82|108->84|108->84|108->84|109->85|113->89
                  -- GENERATED --
              */
          