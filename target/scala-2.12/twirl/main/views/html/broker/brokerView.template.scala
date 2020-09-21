
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
/*5.2*/import scalaz.{\/}

object brokerView extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[String,Int,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.BVView],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String, brokerId: Int, errorOrBrokerView: kafka.manager.ApiError \/ kafka.manager.model.ActorModel.BVView
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/theMenu/*9.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.13*/("""
    """),_display_(/*10.6*/views/*10.11*/.html.navigation.clusterMenu(cluster,"Brokers","",menus.clusterMenus(cluster)(
        errorOrBrokerView.toOption.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*11.133*/("""
""")))};def /*14.2*/brokerScripts/*14.15*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.19*/("""
    """),format.raw/*15.5*/("""<script ype="text/javascript">
        $(document).ready(function() """),format.raw/*16.38*/("""{"""),format.raw/*16.39*/("""
            """),format.raw/*17.13*/("""$('#broker-table').DataTable(
                    """),format.raw/*18.21*/("""{"""),format.raw/*18.22*/("""
                        """),format.raw/*19.25*/(""""lengthMenu": [[-1, 50, 25, 10], ["All", 50, 25, 10]]
                    """),format.raw/*20.21*/("""}"""),format.raw/*20.22*/("""
            """),format.raw/*21.13*/(""");
        """),format.raw/*22.9*/("""}"""),format.raw/*22.10*/(""" """),format.raw/*22.11*/(""");
    </script>
""")))};
Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*12.2*/("""

"""),format.raw/*24.2*/("""

"""),_display_(/*26.2*/main(
    "Broker View",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withNamedViewAndCluster("Broker View",cluster,brokerId.toString)),
    scripts=brokerScripts)/*30.27*/ {_display_(Seq[Any](format.raw/*30.29*/("""
"""),format.raw/*31.1*/("""<div class="col-md-12 un-pad-me">
    <div class="card">
        <div class="card-header">
            <h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="octicon octicon-arrow-left" aria-hidden="true"></span></button>Broker Id """),_display_(/*34.166*/brokerId),format.raw/*34.174*/("""</h3>
       </div>
        <div class="card-body">
    """),_display_(/*37.6*/errorOrBrokerView/*37.23*/.fold[Html](views.html.errors.onApiError(_), views.html.broker.brokerViewContent(cluster, brokerId, _))),format.raw/*37.126*/("""
       """),format.raw/*38.8*/("""</div>
    </div>
</div>
""")))}),format.raw/*41.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,brokerId:Int,errorOrBrokerView:$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.BVView],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,brokerId,errorOrBrokerView)(af,messages,menus,request)

  def f:((String,Int,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.BVView]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,brokerId,errorOrBrokerView) => (af,messages,menus,request) => apply(cluster,brokerId,errorOrBrokerView)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/broker/brokerView.scala.html
                  HASH: 8346c545ef75e9405b9e9425829cd07a9fd649bb
                  MATRIX: 439->115|936->135|1262->386|1276->393|1356->397|1388->403|1402->408|1635->619|1660->624|1682->637|1763->641|1795->646|1891->714|1920->715|1961->728|2039->778|2068->779|2121->804|2223->878|2252->879|2293->892|2331->903|2360->904|2389->905|2445->384|2473->621|2502->923|2531->926|2758->1144|2798->1146|2826->1147|3110->1403|3140->1411|3223->1468|3249->1485|3374->1588|3409->1596|3465->1622
                  LINES: 17->5|22->6|27->9|27->9|29->9|30->10|30->10|31->11|32->14|32->14|34->14|35->15|36->16|36->16|37->17|38->18|38->18|39->19|40->20|40->20|41->21|42->22|42->22|42->22|45->8|46->12|48->24|50->26|54->30|54->30|55->31|58->34|58->34|61->37|61->37|61->37|62->38|65->41
                  -- GENERATED --
              */
          