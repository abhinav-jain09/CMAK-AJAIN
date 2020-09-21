
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

object addPartitions extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[String,String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.AddTopicPartitions], kafka.manager.model.ClusterContext]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster: String, topic: String, errorOrForm: kafka.manager.ApiError \/ (Form[models.form.AddTopicPartitions], kafka.manager.model.ClusterContext)
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*9.2*/import helper._
/*10.2*/import controllers.routes

def /*12.2*/theMenu/*12.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.13*/("""
    """),_display_(/*13.6*/views/*13.11*/.html.navigation.clusterMenu(cluster,"Topic","Add Partitions",menus.clusterMenus(cluster)(
        errorOrForm.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*14.115*/("""
""")))};def /*17.2*/renderForm/*17.12*/(addTopicPartitionsForm: Form[models.form.AddTopicPartitions]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.78*/("""
    """),_display_(/*18.6*/b4/*18.8*/.vertical.form(routes.Topic.handleAddPartitions(cluster, topic))/*18.72*/ { implicit fc =>_display_(Seq[Any](format.raw/*18.89*/("""
        """),format.raw/*19.9*/("""<table class="table">
            <thead>
            <tr><th>Add Partitions</th><th>Brokers</th></tr>
            </thead>
            <tbody>
                <tr>
                <td>
                """),_display_(/*26.18*/b4/*26.20*/.text(addTopicPartitionsForm("topic"), '_label -> "Topic", 'placeholder -> "", 'autofocus -> true )),format.raw/*26.119*/("""
                """),_display_(/*27.18*/b4/*27.20*/.text(addTopicPartitionsForm("partitions"), '_label -> "Partitions", 'placeholder -> "8")),format.raw/*27.109*/("""
                """),_display_(/*28.18*/b4/*28.20*/.hidden(addTopicPartitionsForm("readVersion").name,addTopicPartitionsForm("readVersion").value.getOrElse(-1))),format.raw/*28.129*/("""
                """),format.raw/*29.17*/("""</td>
                <td>
                    <button type="button" class="btn btn-secondary" onClick="checkBoxSelect('brokers',true);">
                        <b>Select All</b>
                    </button>
                    <button type="button" class="btn btn-secondary" onClick="checkBoxSelect('brokers',false);">
                        <b>Select None</b>
                    </button>
                    """),_display_(/*37.22*/helper/*37.28*/.repeat(addTopicPartitionsForm("brokers"), min = 1)/*37.79*/ { brokerSelectForm =>_display_(Seq[Any](format.raw/*37.101*/("""
                        """),_display_(/*38.26*/b4/*38.28*/.hidden(brokerSelectForm("id").name,brokerSelectForm("id").value.getOrElse(-1))),format.raw/*38.107*/("""
                        """),_display_(/*39.26*/b4/*39.28*/.hidden(brokerSelectForm("host").name,brokerSelectForm("host").value.getOrElse(""))),format.raw/*39.111*/("""
                        """),_display_(/*40.26*/b4/*40.28*/.checkbox(brokerSelectForm("selected"), '_text -> s"${brokerSelectForm("id").value.getOrElse(-1)} - ${brokerSelectForm("host").value.getOrElse("")}")),format.raw/*40.177*/("""
                    """)))}),format.raw/*41.22*/("""
                """),format.raw/*42.17*/("""</td>
            </tr>
            </tbody>
        </table>
        """),_display_(/*46.10*/b4/*46.12*/.submit('class -> "submit-button btn btn-primary")/*46.62*/{_display_(Seq[Any](format.raw/*46.63*/(""" """),format.raw/*46.64*/("""Add Partitions """)))}),format.raw/*46.80*/("""
        """),format.raw/*47.9*/("""<a href=""""),_display_(/*47.19*/routes/*47.25*/.Topic.topic(cluster,topic)),format.raw/*47.52*/("""" class="cancel-button btn btn-secondary" role="button">Cancel</a>
    """)))}),format.raw/*48.6*/("""
""")))};
Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*11.1*/("""
"""),format.raw/*15.2*/("""
        
"""),format.raw/*49.2*/("""

"""),_display_(/*51.2*/main(
    "Add Partitions",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withNamedViewAndClusterAndTopic("Topic View",cluster,topic,"Add Partitions")))/*54.159*/ {_display_(Seq[Any](format.raw/*54.161*/("""
    """),format.raw/*55.5*/("""<div class="col-md-6 un-pad-me">
        <div class="card">
            <div class="card-header"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="octicon octicon-arrow-left" aria-hidden="true"></span></button>Add Partitions</h3></div>
            <div class="card-body">
                """),_display_(/*59.18*/errorOrForm/*59.29*/.fold( views.html.errors.onApiError(_), t => renderForm(t._1))),format.raw/*59.91*/("""
            """),format.raw/*60.13*/("""</div>
        </div>
    </div>
""")))}),format.raw/*63.2*/("""

"""))
      }
    }
  }

  def render(cluster:String,topic:String,errorOrForm:$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.AddTopicPartitions], kafka.manager.model.ClusterContext]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,topic,errorOrForm)(af,messages,menus,request)

  def f:((String,String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.AddTopicPartitions], kafka.manager.model.ClusterContext]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,topic,errorOrForm) => (af,messages,menus,request) => apply(cluster,topic,errorOrForm)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/topic/addPartitions.scala.html
                  HASH: d2ef69681abe097c4483d704ab7b8095e05db881
                  MATRIX: 438->115|990->135|1343->418|1367->435|1406->463|1421->470|1502->474|1534->480|1548->485|1775->690|1800->703|1819->713|1962->779|1994->785|2004->787|2077->851|2132->868|2168->877|2398->1080|2409->1082|2530->1181|2575->1199|2586->1201|2697->1290|2742->1308|2753->1310|2884->1419|2929->1436|3372->1852|3387->1858|3447->1909|3508->1931|3561->1957|3572->1959|3673->2038|3726->2064|3737->2066|3842->2149|3895->2175|3906->2177|4077->2326|4130->2348|4175->2365|4273->2436|4284->2438|4343->2488|4382->2489|4411->2490|4458->2506|4494->2515|4531->2525|4546->2531|4594->2558|4696->2630|4736->416|4764->461|4792->692|4829->2632|4858->2635|5074->2841|5115->2843|5147->2848|5492->3166|5512->3177|5595->3239|5636->3252|5700->3286
                  LINES: 17->5|22->6|26->9|27->10|29->12|29->12|31->12|32->13|32->13|33->14|34->17|34->17|36->17|37->18|37->18|37->18|37->18|38->19|45->26|45->26|45->26|46->27|46->27|46->27|47->28|47->28|47->28|48->29|56->37|56->37|56->37|56->37|57->38|57->38|57->38|58->39|58->39|58->39|59->40|59->40|59->40|60->41|61->42|65->46|65->46|65->46|65->46|65->46|65->46|66->47|66->47|66->47|66->47|67->48|69->8|70->11|71->15|73->49|75->51|78->54|78->54|79->55|83->59|83->59|83->59|84->60|87->63
                  -- GENERATED --
              */
          