
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

object createLogkafka extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.CreateLogkafka], kafka.manager.model.ClusterContext]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster: String, errorOrForm: kafka.manager.ApiError \/ (Form[models.form.CreateLogkafka], kafka.manager.model.ClusterContext)
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*9.2*/import helper._
/*10.2*/import controllers.routes

def /*12.2*/theMenu/*12.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.13*/("""
    """),_display_(/*13.6*/views/*13.11*/.html.navigation.clusterMenu(cluster,"Logkafka","Create",menus.clusterMenus(cluster)(
        errorOrForm.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*14.115*/("""
""")))};def /*17.2*/renderForm/*17.12*/(createLogkafkaForm: Form[models.form.CreateLogkafka]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.70*/("""
"""),format.raw/*18.1*/("""<div class="card-body">
    """),_display_(/*19.6*/b4/*19.8*/.vertical.form(routes.Logkafka.handleCreateLogkafka(cluster))/*19.69*/ { implicit fc =>_display_(Seq[Any](format.raw/*19.86*/("""
    """),format.raw/*20.5*/("""<table class="table">
        <tbody>
        <tr>
            <td>
                """),_display_(/*24.18*/b4/*24.20*/.text(createLogkafkaForm("logkafka_id"), '_label -> "Logkafka Id", 'placeholder -> "test.logkafka.net", 'autofocus -> true )),format.raw/*24.144*/("""
                """),_display_(/*25.18*/b4/*25.20*/.text(createLogkafkaForm("log_path"), '_label -> "Log Path", 'placeholder -> "/usr/local/apache2/logs/access_log.%Y%m%d")),format.raw/*25.141*/("""
                """),_display_(/*26.18*/b4/*26.20*/.submit('class -> "submit-button btn btn-primary")/*26.70*/{_display_(Seq[Any](format.raw/*26.71*/(""" """),format.raw/*26.72*/("""Create """)))}),format.raw/*26.80*/("""
                """),format.raw/*27.17*/("""<a href=""""),_display_(/*27.27*/routes/*27.33*/.Logkafka.logkafkas(cluster)),format.raw/*27.61*/("""" class="cancel-button btn btn-secondary" role="button">Cancel</a>
            </td>
            <td>
                """),_display_(/*30.18*/helper/*30.24*/.repeat(createLogkafkaForm("configs"), min = 1)/*30.71*/ { configsForm =>_display_(Seq[Any](format.raw/*30.88*/("""
                    """),_display_(/*31.22*/b4/*31.24*/.hidden(configsForm("name").name, configsForm("name").value.getOrElse(""))),format.raw/*31.98*/("""
                    """),_display_(/*32.22*/b4/*32.24*/.text(configsForm("value"), '_label -> configsForm("name").value.getOrElse(""))),format.raw/*32.103*/("""
                """)))}),format.raw/*33.18*/("""
            """),format.raw/*34.13*/("""</td>
        </tr>
        </tbody>
    </table>
    """)))}),format.raw/*38.6*/("""
"""),format.raw/*39.1*/("""</div>
""")))};
Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*11.1*/("""
"""),format.raw/*15.2*/("""
        
"""),format.raw/*40.2*/("""

"""),_display_(/*42.2*/main(
    "Create Logkafka",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Create Logkafka",cluster)))/*45.128*/ {_display_(Seq[Any](format.raw/*45.130*/("""
    """),format.raw/*46.5*/("""<div class="col-md-12 un-pad-me">
        <div class="card">
            <div class="card-header"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="octicon octicon-arrow-left" aria-hidden="true"></span></button>Create Logkafka</h3></div>
            """),_display_(/*49.14*/errorOrForm/*49.25*/.fold( views.html.errors.onApiError(_), t => renderForm(t._1))),format.raw/*49.87*/("""
        """),format.raw/*50.9*/("""</div>
    </div>
""")))}),format.raw/*52.2*/("""

"""))
      }
    }
  }

  def render(cluster:String,errorOrForm:$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.CreateLogkafka], kafka.manager.model.ClusterContext]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrForm)(af,messages,menus,request)

  def f:((String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.CreateLogkafka], kafka.manager.model.ClusterContext]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrForm) => (af,messages,menus,request) => apply(cluster,errorOrForm)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/logkafka/createLogkafka.scala.html
                  HASH: 74428b351dbcfff0bd5f19ed2d45b9f5e730b85b
                  MATRIX: 441->115|983->135|1317->399|1341->416|1380->444|1395->451|1476->455|1508->461|1522->466|1744->666|1769->679|1788->689|1923->747|1951->748|2006->777|2016->779|2086->840|2141->857|2173->862|2285->947|2296->949|2442->1073|2487->1091|2498->1093|2641->1214|2686->1232|2697->1234|2756->1284|2795->1285|2824->1286|2863->1294|2908->1311|2945->1321|2960->1327|3009->1355|3155->1474|3170->1480|3226->1527|3281->1544|3330->1566|3341->1568|3436->1642|3485->1664|3496->1666|3597->1745|3646->1763|3687->1776|3772->1831|3800->1832|3846->397|3874->442|3902->668|3939->1840|3968->1843|4154->2019|4195->2021|4227->2026|4534->2306|4554->2317|4637->2379|4673->2388|4722->2407
                  LINES: 17->5|22->6|26->9|27->10|29->12|29->12|31->12|32->13|32->13|33->14|34->17|34->17|36->17|37->18|38->19|38->19|38->19|38->19|39->20|43->24|43->24|43->24|44->25|44->25|44->25|45->26|45->26|45->26|45->26|45->26|45->26|46->27|46->27|46->27|46->27|49->30|49->30|49->30|49->30|50->31|50->31|50->31|51->32|51->32|51->32|52->33|53->34|57->38|58->39|60->8|61->11|62->15|64->40|66->42|69->45|69->45|70->46|73->49|73->49|73->49|74->50|76->52
                  -- GENERATED --
              */
          