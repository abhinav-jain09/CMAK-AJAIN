
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

object updateConfig extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[String,String,String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.UpdateLogkafkaConfig], kafka.manager.model.ClusterContext]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster: String, logkafka_id: String, log_path: String,
errorOrForm: kafka.manager.ApiError \/ (Form[models.form.UpdateLogkafkaConfig], kafka.manager.model.ClusterContext)
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*10.2*/import helper._
/*11.2*/import controllers.routes

def /*13.2*/theMenu/*13.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.13*/("""
    """),_display_(/*14.6*/views/*14.11*/.html.navigation.clusterMenu(cluster,"Logkafka","Update Config",menus.clusterMenus(cluster)(
        errorOrForm.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*15.115*/("""
""")))};def /*18.2*/renderForm/*18.12*/(updateLogkafkaConfigForm: Form[models.form.UpdateLogkafkaConfig]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*18.82*/("""
    """),_display_(/*19.6*/b4/*19.8*/.vertical.form(routes.Logkafka.handleUpdateConfig(cluster, logkafka_id, log_path))/*19.90*/ { implicit fc =>_display_(Seq[Any](format.raw/*19.107*/("""
        """),format.raw/*20.9*/("""<table class="table">
            <thead>
            <tr><th>Update Config</th></tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        """),_display_(/*27.26*/b4/*27.28*/.text(updateLogkafkaConfigForm("logkafka_id"), '_label -> "Logkafka Id", 'placeholder -> "", 'autofocus -> true )),format.raw/*27.141*/("""
                        """),_display_(/*28.26*/b4/*28.28*/.text(updateLogkafkaConfigForm("log_path"), '_label -> "Log Path", 'placeholder -> "", 'autofocus -> true )),format.raw/*28.135*/("""
                        """),_display_(/*29.26*/helper/*29.32*/.repeat(updateLogkafkaConfigForm("configs"), min = 1)/*29.85*/ { configsForm =>_display_(Seq[Any](format.raw/*29.102*/("""
                            """),_display_(/*30.30*/b4/*30.32*/.hidden(configsForm("name").name, configsForm("name").value.getOrElse(""))),format.raw/*30.106*/("""
                            """),_display_(/*31.30*/b4/*31.32*/.text(configsForm("value"), '_label -> configsForm("name").value.getOrElse(""))),format.raw/*31.111*/("""
                        """)))}),format.raw/*32.26*/("""
                    """),format.raw/*33.21*/("""</td>
                </tr>
            </tbody>
        </table>
        """),_display_(/*37.10*/b4/*37.12*/.submit('class -> "submit-button btn btn-primary")/*37.62*/{_display_(Seq[Any](format.raw/*37.63*/(""" """),format.raw/*37.64*/("""Update Config """)))}),format.raw/*37.79*/("""
        """),format.raw/*38.9*/("""<a href=""""),_display_(/*38.19*/routes/*38.25*/.Logkafka.logkafka(cluster,logkafka_id,log_path)),format.raw/*38.73*/("""" class="cancel-button btn btn-secondary" role="button">Cancel</a>
    """)))}),format.raw/*39.6*/("""
""")))};
Seq[Any](format.raw/*9.1*/("""
"""),format.raw/*12.1*/("""
"""),format.raw/*16.2*/("""
        
"""),format.raw/*40.2*/("""

"""),_display_(/*42.2*/main(
    "Update Config",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withNamedViewAndClusterAndLogkafka("Logkafka View",cluster,logkafka_id,log_path,"Update Config")))/*45.179*/ {_display_(Seq[Any](format.raw/*45.181*/("""
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

  def render(cluster:String,logkafka_id:String,log_path:String,errorOrForm:$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.UpdateLogkafkaConfig], kafka.manager.model.ClusterContext]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,logkafka_id,log_path,errorOrForm)(af,messages,menus,request)

  def f:((String,String,String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.UpdateLogkafkaConfig], kafka.manager.model.ClusterContext]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,logkafka_id,log_path,errorOrForm) => (af,messages,menus,request) => apply(cluster,logkafka_id,log_path,errorOrForm)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/logkafka/updateConfig.scala.html
                  HASH: e246a70a7307562a95a95995c978989ec51b7b5d
                  MATRIX: 441->115|1001->135|1381->444|1405->461|1444->489|1459->496|1540->500|1572->506|1586->511|1815->718|1840->731|1859->741|2006->811|2038->817|2048->819|2139->901|2195->918|2231->927|2456->1125|2467->1127|2602->1240|2655->1266|2666->1268|2795->1375|2848->1401|2863->1407|2925->1460|2981->1477|3038->1507|3049->1509|3145->1583|3202->1613|3213->1615|3314->1694|3371->1720|3420->1741|3522->1816|3533->1818|3592->1868|3631->1869|3660->1870|3706->1885|3742->1894|3779->1904|3794->1910|3863->1958|3965->2030|4005->442|4033->487|4061->720|4098->2032|4127->2035|4362->2260|4403->2262|4435->2267|4779->2584|4799->2595|4882->2657|4923->2670|4987->2704
                  LINES: 17->5|22->6|27->10|28->11|30->13|30->13|32->13|33->14|33->14|34->15|35->18|35->18|37->18|38->19|38->19|38->19|38->19|39->20|46->27|46->27|46->27|47->28|47->28|47->28|48->29|48->29|48->29|48->29|49->30|49->30|49->30|50->31|50->31|50->31|51->32|52->33|56->37|56->37|56->37|56->37|56->37|56->37|57->38|57->38|57->38|57->38|58->39|60->9|61->12|62->16|64->40|66->42|69->45|69->45|70->46|74->50|74->50|74->50|75->51|78->54
                  -- GENERATED --
              */
          