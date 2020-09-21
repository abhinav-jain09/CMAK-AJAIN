
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

object createTopic extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.CreateTopic], kafka.manager.model.ClusterContext]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster: String, errorOrForm: kafka.manager.ApiError \/ (Form[models.form.CreateTopic], kafka.manager.model.ClusterContext)
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*9.2*/import helper._
/*10.2*/import controllers.routes

def /*12.2*/theMenu/*12.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.13*/("""
    """),_display_(/*13.6*/views/*13.11*/.html.navigation.clusterMenu(cluster,"Topic","Create",menus.clusterMenus(cluster)(
        errorOrForm.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*14.115*/("""
""")))};def /*17.2*/renderForm/*17.12*/(createTopicForm: Form[models.form.CreateTopic]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.64*/("""
"""),format.raw/*18.1*/("""<div class="container">
    """),_display_(/*19.6*/b4/*19.8*/.vertical.form(routes.Topic.handleCreateTopic(cluster))/*19.63*/ { implicit fc =>_display_(Seq[Any](format.raw/*19.80*/("""
    """),format.raw/*20.5*/("""<table class="table">
        <tbody>
        <tr>
            <td>
                """),_display_(/*24.18*/b4/*24.20*/.text(createTopicForm("topic"), '_label -> "Topic", 'placeholder -> "", 'autofocus -> true )),format.raw/*24.112*/("""
                """),_display_(/*25.18*/b4/*25.20*/.text(createTopicForm("partitions"), '_label -> "Partitions", 'placeholder -> "8")),format.raw/*25.102*/("""
                """),_display_(/*26.18*/b4/*26.20*/.text(createTopicForm("replication"), '_label -> "Replication Factor", 'placeholder -> "3")),format.raw/*26.111*/("""
                """),_display_(/*27.18*/b4/*27.20*/.submit('class -> "submit-button btn btn-primary")/*27.70*/{_display_(Seq[Any](format.raw/*27.71*/(""" """),format.raw/*27.72*/("""Create """)))}),format.raw/*27.80*/("""
                """),format.raw/*28.17*/("""<a href=""""),_display_(/*28.27*/routes/*28.33*/.Topic.topics(cluster)),format.raw/*28.55*/("""" class="cancel-button btn btn-secondary" role="button">Cancel</a>
            </td>
        </tr>
        <tr>
            <td>
                """),_display_(/*33.18*/helper/*33.24*/.repeat(createTopicForm("configs"), min = 1)/*33.68*/ { configsForm =>_display_(Seq[Any](format.raw/*33.85*/("""
                    """),_display_(/*34.22*/b4/*34.24*/.hidden(configsForm("name").name, configsForm("name").value.getOrElse(""))),format.raw/*34.98*/("""
                    """),_display_(/*35.22*/b4/*35.24*/.hidden(configsForm("help").name, configsForm("help").value.getOrElse(""))),format.raw/*35.98*/("""
                    """),_display_(/*36.22*/b4/*36.24*/.text(configsForm("value"), '_label -> configsForm("name").value.getOrElse(""), '_help -> configsForm("help").value.getOrElse(""))),format.raw/*36.154*/("""
                """)))}),format.raw/*37.18*/("""
            """),format.raw/*38.13*/("""</td>
        </tr>
        </tbody>
    </table>
    """)))}),format.raw/*42.6*/("""
"""),format.raw/*43.1*/("""</div>
""")))};
Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*11.1*/("""
"""),format.raw/*15.2*/("""
        
"""),format.raw/*44.2*/("""

"""),_display_(/*46.2*/main(
    "Create Topic",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Create Topic",cluster)))/*49.125*/ {_display_(Seq[Any](format.raw/*49.127*/("""
    """),format.raw/*50.5*/("""<div class="col-md-6 un-pad-me">
        <div class="card">
            <div class="card-body"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="octicon octicon-arrow-left" aria-hidden="true"></span></button>Create Topic</h3>
            """),_display_(/*53.14*/errorOrForm/*53.25*/.fold( views.html.errors.onApiError(_), t => renderForm(t._1))),format.raw/*53.87*/("""
            """),format.raw/*54.13*/("""</div>
        </div>
    </div>
""")))}),format.raw/*57.2*/("""

"""))
      }
    }
  }

  def render(cluster:String,errorOrForm:$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.CreateTopic], kafka.manager.model.ClusterContext]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrForm)(af,messages,menus,request)

  def f:((String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.CreateTopic], kafka.manager.model.ClusterContext]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrForm) => (af,messages,menus,request) => apply(cluster,errorOrForm)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/topic/createTopic.scala.html
                  HASH: 0b6ad50169581bcc39f573aae84cd3bc9efc710c
                  MATRIX: 438->115|974->135|1305->396|1329->413|1368->441|1383->448|1464->452|1496->458|1510->463|1729->660|1754->673|1773->683|1902->735|1930->736|1985->765|1995->767|2059->822|2114->839|2146->844|2258->929|2269->931|2383->1023|2428->1041|2439->1043|2543->1125|2588->1143|2599->1145|2712->1236|2757->1254|2768->1256|2827->1306|2866->1307|2895->1308|2934->1316|2979->1333|3016->1343|3031->1349|3074->1371|3247->1517|3262->1523|3315->1567|3370->1584|3419->1606|3430->1608|3525->1682|3574->1704|3585->1706|3680->1780|3729->1802|3740->1804|3892->1934|3941->1952|3982->1965|4067->2020|4095->2021|4141->394|4169->439|4197->662|4234->2029|4263->2032|4443->2202|4484->2204|4516->2209|4811->2477|4831->2488|4914->2550|4955->2563|5019->2597
                  LINES: 17->5|22->6|26->9|27->10|29->12|29->12|31->12|32->13|32->13|33->14|34->17|34->17|36->17|37->18|38->19|38->19|38->19|38->19|39->20|43->24|43->24|43->24|44->25|44->25|44->25|45->26|45->26|45->26|46->27|46->27|46->27|46->27|46->27|46->27|47->28|47->28|47->28|47->28|52->33|52->33|52->33|52->33|53->34|53->34|53->34|54->35|54->35|54->35|55->36|55->36|55->36|56->37|57->38|61->42|62->43|64->8|65->11|66->15|68->44|70->46|73->49|73->49|74->50|77->53|77->53|77->53|78->54|81->57
                  -- GENERATED --
              */
          