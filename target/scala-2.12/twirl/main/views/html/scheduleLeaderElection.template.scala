
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

object scheduleLeaderElection extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.TopicList],String,Int,features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster:String, errorOrStatus: kafka.manager.ApiError \/ kafka.manager.model.ActorModel.TopicList, status: String, timePeriod: Int
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/theMenu/*9.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.13*/("""
"""),_display_(/*10.2*/views/*10.7*/.html.navigation.clusterMenu(cluster,"Schedule Leader Election","",menus.clusterMenus(cluster)(
    errorOrStatus.map(_.clusterContext.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*11.116*/("""
""")))};
Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*12.2*/("""

"""),_display_(/*14.2*/main(
    "Schedule Leader Election",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Schedule Leader Election",cluster)))/*17.137*/ {_display_(Seq[Any](format.raw/*17.139*/("""
    """),format.raw/*18.5*/("""<div class="col-md-6 un-pad-me">
        <div class="card">
            <div class="card-header"><h3>Schedule Leader Election</h3></div>
            <div class="col-md-6">
                """),_display_(/*22.18*/features/*22.26*/.app(features.KMScheduleLeaderElectionFeature)/*22.72*/ {_display_(Seq[Any](format.raw/*22.74*/("""
                    """),format.raw/*23.21*/("""<div>
                    """),_display_(/*24.22*/if(timePeriod == 0)/*24.41*/ {_display_(Seq[Any](format.raw/*24.43*/("""
                        """),_display_(/*25.26*/b4/*25.28*/.vertical.form(routes.PreferredReplicaElection.handleScheduleRunElection(cluster))/*25.110*/ { implicit fc =>_display_(Seq[Any](format.raw/*25.127*/("""
                            """),format.raw/*26.29*/("""<input type="number" min="1" name="timePeriod" class="form-control col-md-8" placeholder="Time for scheduling (in min)" required />
                            <fieldset>
                            """),_display_(/*28.30*/b4/*28.32*/.submit('class -> "btn btn-primary")/*28.68*/{_display_(Seq[Any](format.raw/*28.69*/(""" """),format.raw/*28.70*/("""Schedule Preferred Replica Election """)))}),format.raw/*28.107*/("""
                            """),format.raw/*29.29*/("""</fieldset>
                        """)))}),format.raw/*30.26*/("""
                    """)))}/*31.23*/else/*31.28*/{_display_(Seq[Any](format.raw/*31.29*/("""
                        """),_display_(/*32.26*/b4/*32.28*/.vertical.form(routes.PreferredReplicaElection.cancelScheduleRunElection(cluster))/*32.110*/ { implicit fc =>_display_(Seq[Any](format.raw/*32.127*/("""
                            """),format.raw/*33.29*/("""<fieldset>
                            """),_display_(/*34.30*/b4/*34.32*/.submit('class -> "btn btn-primary")/*34.68*/{_display_(Seq[Any](format.raw/*34.69*/(""" """),format.raw/*34.70*/("""Cancel Preferred Replica Election """)))}),format.raw/*34.105*/("""
                            """),format.raw/*35.29*/("""</fieldset>
                        """)))}),format.raw/*36.26*/("""
                    """)))}),format.raw/*37.22*/("""
                    """),format.raw/*38.21*/("""</div>
                """)))}),format.raw/*39.18*/("""

            """),format.raw/*41.13*/("""</div>
        </div>

        <div class="row col-md-12">
            <div class="alert alert-warning" role="alert">
            """),_display_(/*46.14*/if(timePeriod == 0)/*46.33*/ {_display_(Seq[Any](format.raw/*46.35*/("""
                """),_display_(/*47.18*/status),format.raw/*47.24*/("""
            """)))}/*48.15*/else/*48.20*/{_display_(Seq[Any](format.raw/*48.21*/("""
                """),_display_(/*49.18*/status),format.raw/*49.24*/(""" """),format.raw/*49.25*/("""(every """),_display_(/*49.33*/timePeriod),format.raw/*49.43*/(""" """),format.raw/*49.44*/("""minutes)
            """)))}),format.raw/*50.14*/("""
            """),format.raw/*51.13*/("""</div>
        </div>
    </div>
""")))}),format.raw/*54.2*/("""

"""))
      }
    }
  }

  def render(cluster:String,errorOrStatus:$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.TopicList],status:String,timePeriod:Int,af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrStatus,status,timePeriod)(af,messages,menus,request)

  def f:((String,$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.TopicList],String,Int) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrStatus,status,timePeriod) => (af,messages,menus,request) => apply(cluster,errorOrStatus,status,timePeriod)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:51 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/scheduleLeaderElection.scala.html
                  HASH: b952b9e04747bcc440cdda5c9feccd2968f1c3cf
                  MATRIX: 432->115|951->135|1294->403|1308->410|1388->414|1416->416|1429->421|1662->632|1702->401|1730->634|1759->637|1963->831|2004->833|2036->838|2252->1027|2269->1035|2324->1081|2364->1083|2413->1104|2467->1131|2495->1150|2535->1152|2588->1178|2599->1180|2691->1262|2747->1279|2804->1308|3031->1508|3042->1510|3087->1546|3126->1547|3155->1548|3224->1585|3281->1614|3349->1651|3390->1674|3403->1679|3442->1680|3495->1706|3506->1708|3598->1790|3654->1807|3711->1836|3778->1876|3789->1878|3834->1914|3873->1915|3902->1916|3969->1951|4026->1980|4094->2017|4147->2039|4196->2060|4251->2084|4293->2098|4451->2229|4479->2248|4519->2250|4564->2268|4591->2274|4624->2289|4637->2294|4676->2295|4721->2313|4748->2319|4777->2320|4812->2328|4843->2338|4872->2339|4925->2361|4966->2374|5030->2408
                  LINES: 17->5|22->6|27->9|27->9|29->9|30->10|30->10|31->11|33->8|34->12|36->14|39->17|39->17|40->18|44->22|44->22|44->22|44->22|45->23|46->24|46->24|46->24|47->25|47->25|47->25|47->25|48->26|50->28|50->28|50->28|50->28|50->28|50->28|51->29|52->30|53->31|53->31|53->31|54->32|54->32|54->32|54->32|55->33|56->34|56->34|56->34|56->34|56->34|56->34|57->35|58->36|59->37|60->38|61->39|63->41|68->46|68->46|68->46|69->47|69->47|70->48|70->48|70->48|71->49|71->49|71->49|71->49|71->49|71->49|72->50|73->51|76->54
                  -- GENERATED --
              */
          