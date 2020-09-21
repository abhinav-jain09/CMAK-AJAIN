
package views.html.logkafka

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

object logkafkaList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[kafka.manager.LogkafkaListExtended, kafka.manager.model.ClusterContext]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String, errorOrLogkafkas: kafka.manager.ApiError \/ (kafka.manager.LogkafkaListExtended, kafka.manager.model.ClusterContext)
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/theMenu/*9.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.13*/("""
    """),_display_(/*10.6*/views/*10.11*/.html.navigation.clusterMenu(cluster,"Logkafka","List",menus.clusterMenus(cluster)(
        errorOrLogkafkas.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*11.120*/("""
""")))};def /*14.2*/logkafkaScripts/*14.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.21*/("""
    """),format.raw/*15.5*/("""<script ype="text/javascript">
    $(document).ready(function() """),format.raw/*16.34*/("""{"""),format.raw/*16.35*/("""
        """),format.raw/*17.9*/("""$('#logkafkas-table').DataTable(
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
    "Logkafka List",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Logkafkas",cluster)),
    scripts=logkafkaScripts)/*30.29*/ {_display_(Seq[Any](format.raw/*30.31*/("""
    """),format.raw/*31.5*/("""<div class="col-md-12">
        <div class="card">
            <div class="card-header"><h3>Logkafkas</h3></div>
            """),_display_(/*34.14*/errorOrLogkafkas/*34.30*/.fold( 
                views.html.errors.onApiError(_),
                tl => views.html.logkafka.logkafkaListContent(cluster,tl._1.list.map(t => (t, tl._1.deleteSet(t._1)))))),format.raw/*36.120*/("""
        """),format.raw/*37.9*/("""</div>
    </div>
""")))}),format.raw/*39.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,errorOrLogkafkas:$bslash$div[kafka.manager.ApiError, scala.Tuple2[kafka.manager.LogkafkaListExtended, kafka.manager.model.ClusterContext]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrLogkafkas)(af,messages,menus,request)

  def f:((String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[kafka.manager.LogkafkaListExtended, kafka.manager.model.ClusterContext]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrLogkafkas) => (af,messages,menus,request) => apply(cluster,errorOrLogkafkas)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/logkafka/logkafkaList.scala.html
                  HASH: 7fe2b2e17faf5a8aecb67266a97f74b68d94c718
                  MATRIX: 441->115|983->135|1328->405|1342->412|1422->416|1454->422|1468->427|1693->630|1718->635|1742->650|1823->654|1855->659|1947->723|1976->724|2012->733|2089->782|2118->783|2167->804|2265->874|2294->875|2330->884|2364->891|2392->892|2420->893|2476->403|2504->632|2533->911|2562->914|2768->1111|2808->1113|2840->1118|2993->1244|3018->1260|3216->1436|3252->1445|3301->1464
                  LINES: 17->5|22->6|27->9|27->9|29->9|30->10|30->10|31->11|32->14|32->14|34->14|35->15|36->16|36->16|37->17|38->18|38->18|39->19|40->20|40->20|41->21|42->22|42->22|42->22|45->8|46->12|48->24|50->26|54->30|54->30|55->31|58->34|58->34|60->36|61->37|63->39
                  -- GENERATED --
              */
          