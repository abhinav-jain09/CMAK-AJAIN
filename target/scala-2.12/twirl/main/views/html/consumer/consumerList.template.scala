
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
/*5.2*/import scalaz.{\/}

object consumerList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,$bslash$div[kafka.manager.ApiError, kafka.manager.ConsumerListExtended],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String, errorOrConsumers: kafka.manager.ApiError \/ kafka.manager.ConsumerListExtended
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/theMenu/*9.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.13*/("""
    """),_display_(/*10.6*/views/*10.11*/.html.navigation.clusterMenu(cluster,"Consumer","List",menus.clusterMenus(cluster)(
        errorOrConsumers.toOption.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*11.132*/("""
""")))};def /*14.2*/consumerScripts/*14.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.21*/("""
    """),format.raw/*15.5*/("""<script type="text/javascript">
    $(document).ready(function() """),format.raw/*16.34*/("""{"""),format.raw/*16.35*/("""
        """),format.raw/*17.9*/("""$('#consumer-table').DataTable(
                """),format.raw/*18.17*/("""{"""),format.raw/*18.18*/("""
                    """),format.raw/*19.21*/(""""lengthMenu": [[10, 25, 50, -1], [10, 25, 50, "All"]]
                """),format.raw/*20.17*/("""}"""),format.raw/*20.18*/("""
        """),format.raw/*21.9*/(""");
    """),format.raw/*22.5*/("""}"""),format.raw/*22.6*/(""" """),format.raw/*22.7*/(""");
    </script>
""")))};
Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*12.2*/("""

"""),format.raw/*24.2*/("""

"""),_display_(/*26.2*/main(
    "Consumer List",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Consumers",cluster)),
    scripts=consumerScripts)/*30.29*/ {_display_(Seq[Any](format.raw/*30.31*/("""
    """),format.raw/*31.5*/("""<div class="col-md-12">
        <div class="card">
            <div class="card-header"><h3>Consumers</h3></div>
            <div class="card-body">
            """),_display_(/*35.14*/errorOrConsumers/*35.30*/.fold(
                views.html.errors.onApiError(_),
                cl => views.html.consumer.consumerListContent(cluster,cl.list,cl.clusterContext))),format.raw/*37.98*/("""
            """),format.raw/*38.13*/("""</div>
        </div>
    </div>
""")))}),format.raw/*41.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,errorOrConsumers:$bslash$div[kafka.manager.ApiError, kafka.manager.ConsumerListExtended],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrConsumers)(af,messages,menus,request)

  def f:((String,$bslash$div[kafka.manager.ApiError, kafka.manager.ConsumerListExtended]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrConsumers) => (af,messages,menus,request) => apply(cluster,errorOrConsumers)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:51 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/consumer/consumerList.scala.html
                  HASH: 40bae204a2bb22692d16680842913ac569e218e9
                  MATRIX: 441->115|933->135|1240->367|1254->374|1334->378|1366->384|1380->389|1617->604|1642->609|1666->624|1747->628|1779->633|1872->698|1901->699|1937->708|2013->756|2042->757|2091->778|2189->848|2218->849|2254->858|2288->865|2316->866|2344->867|2400->365|2428->606|2457->885|2486->888|2692->1085|2732->1087|2764->1092|2953->1254|2978->1270|3152->1423|3193->1436|3257->1470
                  LINES: 17->5|22->6|27->9|27->9|29->9|30->10|30->10|31->11|32->14|32->14|34->14|35->15|36->16|36->16|37->17|38->18|38->18|39->19|40->20|40->20|41->21|42->22|42->22|42->22|45->8|46->12|48->24|50->26|54->30|54->30|55->31|59->35|59->35|61->37|62->38|65->41
                  -- GENERATED --
              */
          