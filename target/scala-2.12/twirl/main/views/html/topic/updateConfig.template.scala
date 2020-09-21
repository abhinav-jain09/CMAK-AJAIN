
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

object updateConfig extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[String,String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.UpdateTopicConfig], kafka.manager.model.ClusterContext]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster: String, topic: String, errorOrForm: kafka.manager.ApiError \/ (Form[models.form.UpdateTopicConfig], kafka.manager.model.ClusterContext)
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*9.2*/import helper._
/*10.2*/import controllers.routes

def /*12.2*/theMenu/*12.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.13*/("""
    """),_display_(/*13.6*/views/*13.11*/.html.navigation.clusterMenu(cluster,"Topic","Update Config",menus.clusterMenus(cluster)(
        errorOrForm.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*14.115*/("""
""")))};def /*17.2*/renderForm/*17.12*/(updateTopicConfigForm: Form[models.form.UpdateTopicConfig]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.76*/("""
    """),_display_(/*18.6*/b4/*18.8*/.vertical.form(routes.Topic.handleUpdateConfig(cluster, topic))/*18.71*/ { implicit fc =>_display_(Seq[Any](format.raw/*18.88*/("""
        """),format.raw/*19.9*/("""<table class="table">
            <thead>
            <tr><th>Update Config</th></tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        """),_display_(/*26.26*/b4/*26.28*/.text(updateTopicConfigForm("topic"), '_label -> "Topic", 'placeholder -> "", 'autofocus -> true )),format.raw/*26.126*/("""
                        """),_display_(/*27.26*/b4/*27.28*/.hidden(updateTopicConfigForm("readVersion").name,updateTopicConfigForm("readVersion").value.getOrElse(-1))),format.raw/*27.135*/("""
                        """),_display_(/*28.26*/helper/*28.32*/.repeat(updateTopicConfigForm("configs"), min = 1)/*28.82*/ { configsForm =>_display_(Seq[Any](format.raw/*28.99*/("""
                            """),_display_(/*29.30*/b4/*29.32*/.hidden(configsForm("name").name, configsForm("name").value.getOrElse(""))),format.raw/*29.106*/("""
                            """),_display_(/*30.30*/b4/*30.32*/.hidden(configsForm("help").name, configsForm("help").value.getOrElse(""))),format.raw/*30.106*/("""
                            """),_display_(/*31.30*/b4/*31.32*/.text(configsForm("value"), '_label -> configsForm("name").value.getOrElse(""), '_help -> configsForm("help").value.getOrElse(""))),format.raw/*31.162*/("""
                        """)))}),format.raw/*32.26*/("""
                    """),format.raw/*33.21*/("""</td>
                </tr>
            </tbody>
        </table>
        """),_display_(/*37.10*/b4/*37.12*/.submit('class -> "submit-button btn btn-primary")/*37.62*/{_display_(Seq[Any](format.raw/*37.63*/(""" """),format.raw/*37.64*/("""Update Config """)))}),format.raw/*37.79*/("""
        """),format.raw/*38.9*/("""<a href=""""),_display_(/*38.19*/routes/*38.25*/.Topic.topic(cluster,topic)),format.raw/*38.52*/("""" class="cancel-button btn btn-secondary" role="button">Cancel</a>
    """)))}),format.raw/*39.6*/("""
""")))};
Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*11.1*/("""
"""),format.raw/*15.2*/("""
        
"""),format.raw/*40.2*/("""

"""),_display_(/*42.2*/main(
    "Update Config",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withNamedViewAndClusterAndTopic("Topic View",cluster,topic,"Update Config")))/*45.158*/ {_display_(Seq[Any](format.raw/*45.160*/("""
    """),format.raw/*46.5*/("""<div class="col-md-6 un-pad-me">
        <div class="card">
            <div class="card-header"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="octicon octicon-arrow-left" aria-hidden="true"></span></button>Update Config</h3></div>
            <div class="card-body">
                """),_display_(/*50.18*/errorOrForm/*50.29*/.fold( views.html.errors.onApiError(_), t => renderForm(t._1))),format.raw/*50.91*/("""
            """),format.raw/*51.13*/("""</div>
        </div>
    </div>
""")))}),format.raw/*54.2*/("""

"""))
      }
    }
  }

  def render(cluster:String,topic:String,errorOrForm:$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.UpdateTopicConfig], kafka.manager.model.ClusterContext]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,topic,errorOrForm)(af,messages,menus,request)

  def f:((String,String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.UpdateTopicConfig], kafka.manager.model.ClusterContext]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,topic,errorOrForm) => (af,messages,menus,request) => apply(cluster,topic,errorOrForm)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/topic/updateConfig.scala.html
                  HASH: 6faa3e3e8b33a908c5124e2bc6f1ef24f69f8da2
                  MATRIX: 438->115|988->135|1340->417|1364->434|1403->462|1418->469|1499->473|1531->479|1545->484|1771->688|1796->701|1815->711|1956->775|1988->781|1998->783|2070->846|2125->863|2161->872|2386->1070|2397->1072|2517->1170|2570->1196|2581->1198|2710->1305|2763->1331|2778->1337|2837->1387|2892->1404|2949->1434|2960->1436|3056->1510|3113->1540|3124->1542|3220->1616|3277->1646|3288->1648|3440->1778|3497->1804|3546->1825|3648->1900|3659->1902|3718->1952|3757->1953|3786->1954|3832->1969|3868->1978|3905->1988|3920->1994|3968->2021|4070->2093|4110->415|4138->460|4166->690|4203->2095|4232->2098|4446->2302|4487->2304|4519->2309|4863->2626|4883->2637|4966->2699|5007->2712|5071->2746
                  LINES: 17->5|22->6|26->9|27->10|29->12|29->12|31->12|32->13|32->13|33->14|34->17|34->17|36->17|37->18|37->18|37->18|37->18|38->19|45->26|45->26|45->26|46->27|46->27|46->27|47->28|47->28|47->28|47->28|48->29|48->29|48->29|49->30|49->30|49->30|50->31|50->31|50->31|51->32|52->33|56->37|56->37|56->37|56->37|56->37|56->37|57->38|57->38|57->38|57->38|58->39|60->8|61->11|62->15|64->40|66->42|69->45|69->45|70->46|74->50|74->50|74->50|75->51|78->54
                  -- GENERATED --
              */
          