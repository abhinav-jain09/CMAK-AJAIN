
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
/*6.2*/import scalaz.{\/}

object brokerList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,$bslash$div[kafka.manager.ApiError, kafka.manager.BrokerListExtended],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(cluster:String, errorOrBrokers: kafka.manager.ApiError \/ kafka.manager.BrokerListExtended
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*10.2*/theMenu/*10.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.13*/("""
    """),_display_(/*11.6*/views/*11.11*/.html.navigation.clusterMenu(cluster,"Brokers","",menus.clusterMenus(cluster)(
        errorOrBrokers.toOption.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*12.130*/("""

""")))};def /*16.2*/renderBrokerMetrics/*16.21*/(bl: kafka.manager.BrokerListExtended):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.63*/("""
    """),_display_(/*17.6*/if(bl.clusterContext.clusterFeatures.features(kafka.manager.features.KMJMXMetricsFeature))/*17.96*/ {_display_(Seq[Any](format.raw/*17.98*/("""
        """),_display_(/*18.10*/views/*18.15*/.html.common.brokerMetrics(bl.combinedMetric)),format.raw/*18.60*/("""
    """)))}/*19.7*/else/*19.12*/{_display_(Seq[Any](format.raw/*19.13*/("""
        """),format.raw/*20.9*/("""<div class="alert alert-info" role="alert">
            Please enable JMX polling <a href=""""),_display_(/*21.49*/routes/*21.55*/.Cluster.updateCluster(cluster).relative),format.raw/*21.95*/("""" class="alert-link">here</a>.
        </div>
    """)))}),format.raw/*23.6*/("""
""")))};
Seq[Any](format.raw/*9.1*/("""
"""),format.raw/*14.2*/("""
        
"""),format.raw/*24.2*/("""

"""),_display_(/*26.2*/main(
    "Broker List",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Brokers",cluster)))/*29.120*/ {_display_(Seq[Any](format.raw/*29.122*/("""
    """),format.raw/*30.5*/("""<div class="col-md-7 un-pad-me">
        <div class="card">
            <div class="card-header">
                <h3>
                    <button type="button" class="btn btn-link" onclick="goBack()">
                        <span class="octicon octicon-arrow-left" aria-hidden="true"></span>
                    </button>Brokers
                </h3>
            </div>
            <div class="card-body">
            """),_display_(/*40.14*/errorOrBrokers/*40.28*/.fold( views.html.errors.onApiError(_), views.html.broker.brokerListContent(cluster,_) )),format.raw/*40.116*/("""
            """),format.raw/*41.13*/("""</div>
        </div>
    </div>
    <div class="col-md-5 un-pad-me">
        <div class="card">
            <div class="card-header"><h3>Combined Metrics</h3></div>
            <div class="card-body">
            """),_display_(/*48.14*/errorOrBrokers/*48.28*/.fold( views.html.errors.onApiError(_), bl => renderBrokerMetrics(bl))),format.raw/*48.98*/("""
            """),format.raw/*49.13*/("""</div>
        </div>
    </div>

""")))}),format.raw/*53.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,errorOrBrokers:$bslash$div[kafka.manager.ApiError, kafka.manager.BrokerListExtended],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrBrokers)(af,messages,menus,request)

  def f:((String,$bslash$div[kafka.manager.ApiError, kafka.manager.BrokerListExtended]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrBrokers) => (af,messages,menus,request) => apply(cluster,errorOrBrokers)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/broker/brokerList.scala.html
                  HASH: 3a8041f45566e7df7fd10db7156b4f89fdc17a80
                  MATRIX: 439->115|499->169|987->189|1292->418|1307->425|1388->429|1420->435|1434->440|1664->648|1690->662|1718->681|1837->723|1869->729|1968->819|2008->821|2045->831|2059->836|2125->881|2149->888|2162->893|2201->894|2237->903|2356->995|2371->1001|2432->1041|2513->1092|2553->416|2581->651|2618->1094|2647->1097|2821->1261|2862->1263|2894->1268|3342->1689|3365->1703|3475->1791|3516->1804|3758->2019|3781->2033|3872->2103|3913->2116|3978->2151
                  LINES: 17->5|18->6|23->7|28->10|28->10|30->10|31->11|31->11|32->12|34->16|34->16|36->16|37->17|37->17|37->17|38->18|38->18|38->18|39->19|39->19|39->19|40->20|41->21|41->21|41->21|43->23|45->9|46->14|48->24|50->26|53->29|53->29|54->30|64->40|64->40|64->40|65->41|72->48|72->48|72->48|73->49|77->53
                  -- GENERATED --
              */
          