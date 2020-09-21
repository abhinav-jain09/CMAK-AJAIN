
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

object runMultipleAssignments extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.RunMultipleAssignments], kafka.manager.model.ClusterContext]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster: String,
  errorOrForm: kafka.manager.ApiError \/ (Form[models.form.RunMultipleAssignments], kafka.manager.model.ClusterContext)
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*10.2*/theMenu/*10.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.13*/("""
    """),_display_(/*11.6*/views/*11.11*/.html.navigation.clusterMenu(cluster,"Topic","Confirm Assignments",menus.clusterMenus(cluster)(
        errorOrForm.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*12.115*/("""
""")))};def /*15.2*/checkboxWithLink/*15.18*/(field: play.api.data.Field, topic: String)(implicit fc: b4.B4FieldConstructor, msgsProv: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*15.129*/("""
"""),_display_(/*16.2*/b4/*16.4*/.inputFormGroup(field, withLabelFor = false, views.html.bs.Args.withDefault(Seq(), 'disabled -> false))/*16.107*/ { fieldInfo =>_display_(Seq[Any](format.raw/*16.122*/("""
"""),format.raw/*17.1*/("""<div class="checkbox">
    <label for=""""),_display_(/*18.18*/fieldInfo/*18.27*/.id),format.raw/*18.30*/("""">
        <input type="checkbox" id=""""),_display_(/*19.37*/fieldInfo/*19.46*/.id),format.raw/*19.49*/("""" name=""""),_display_(/*19.58*/fieldInfo/*19.67*/.name),format.raw/*19.72*/("""" value="true" """),_display_(/*19.88*/if(fieldInfo.value == Some("true"))/*19.123*/{_display_(Seq[Any](format.raw/*19.124*/("""checked""")))}),format.raw/*19.132*/(""" """),_display_(/*19.134*/toHtmlArgs(fieldInfo.innerArgsMap)),format.raw/*19.168*/(""">
        <a href=""""),_display_(/*20.19*/routes/*20.25*/.Topic.topic(cluster,topic)),format.raw/*20.52*/("""">"""),_display_(/*20.55*/topic),format.raw/*20.60*/("""</a>
    </label>
</div>
""")))}),format.raw/*23.2*/("""
""")))};def /*26.2*/renderForm/*26.12*/(confirmForm: Form[models.form.RunMultipleAssignments]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*26.71*/("""
    """),format.raw/*27.5*/("""<h4>Choose topics to reassign:</h4>
    """),_display_(/*28.6*/b4/*28.8*/.vertical.form(routes.ReassignPartitions.handleRunMultipleAssignments(cluster))/*28.87*/ { implicit fc =>_display_(Seq[Any](format.raw/*28.104*/("""
        """),format.raw/*29.9*/("""<table class="table">
            <thead>
            <tr><th>Topics</th></tr>
            </thead>
            <tbody>
            <tr>
                <td>
                    <button type="button" class="btn btn-secondary" onClick="checkBoxSelect('topics',true);">
                        <b>Select All</b>
                    </button>
                    <button type="button" class="btn btn-secondary" onClick="checkBoxSelect('topics',false);">
                        <b>Select None</b>
                    </button>
                    """),_display_(/*42.22*/helper/*42.28*/.repeat(confirmForm("topics"), min = 1)/*42.67*/ { topicSelectForm =>_display_(Seq[Any](format.raw/*42.88*/("""
                        """),_display_(/*43.26*/b4/*43.28*/.hidden(topicSelectForm("name").name,topicSelectForm("name").value.getOrElse(""))),format.raw/*43.109*/("""
                        """),_display_(/*44.26*/checkboxWithLink(topicSelectForm("selected"),topicSelectForm("name").value.getOrElse(""))),format.raw/*44.115*/("""
                    """)))}),format.raw/*45.22*/("""
                """),format.raw/*46.17*/("""</td>
            </tr>
            </tbody>
        </table>
        """),_display_(/*50.10*/b4/*50.12*/.submit('class -> "btn btn-primary btn-block")/*50.58*/{_display_(Seq[Any](format.raw/*50.59*/(""" """),format.raw/*50.60*/("""Run Partition Assignments """)))}),format.raw/*50.87*/("""
        """),format.raw/*51.9*/("""<a href=""""),_display_(/*51.19*/routes/*51.25*/.Topic.topics(cluster)),format.raw/*51.47*/("""" class="cancel-button btn btn-secondary" role="button">Cancel</a>
    """)))}),format.raw/*52.6*/("""
""")))};
Seq[Any](format.raw/*9.1*/("""
"""),format.raw/*13.2*/("""

"""),format.raw/*24.2*/("""

"""),format.raw/*53.2*/("""

"""),_display_(/*55.2*/main(
  "Run Assignment",
  menu = theMenu,
  breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Topics",cluster)))/*58.117*/ {_display_(Seq[Any](format.raw/*58.119*/("""
"""),format.raw/*59.1*/("""<div class="col-md-6 un-pad-me">
    <div class="card">
        <div class="card-header"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="octicon octicon-arrow-left" aria-hidden="true"></span></button>Run Assignments</h3></div>
        <div class="card-body">
            """),_display_(/*63.14*/errorOrForm/*63.25*/.fold( views.html.errors.onApiError(_), t => renderForm(t._1))),format.raw/*63.87*/("""
        """),format.raw/*64.9*/("""</div>
    </div>
</div>
""")))}),format.raw/*67.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,errorOrForm:$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.RunMultipleAssignments], kafka.manager.model.ClusterContext]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrForm)(af,messages,menus,request)

  def f:((String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.RunMultipleAssignments], kafka.manager.model.ClusterContext]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrForm) => (af,messages,menus,request) => apply(cluster,errorOrForm)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/topic/runMultipleAssignments.scala.html
                  HASH: 97035f337f82cdc77920793fe3183cd1600e7556
                  MATRIX: 438->115|996->135|1346->409|1361->416|1442->420|1474->426|1488->431|1720->641|1745->646|1770->662|1959->773|1987->775|1997->777|2110->880|2164->895|2192->896|2259->936|2277->945|2301->948|2367->987|2385->996|2409->999|2445->1008|2463->1017|2489->1022|2532->1038|2577->1073|2617->1074|2657->1082|2687->1084|2743->1118|2790->1138|2805->1144|2853->1171|2883->1174|2909->1179|2965->1205|2990->1210|3009->1220|3145->1279|3177->1284|3244->1325|3254->1327|3342->1406|3398->1423|3434->1432|4006->1977|4021->1983|4069->2022|4128->2043|4181->2069|4192->2071|4295->2152|4348->2178|4459->2267|4512->2289|4557->2306|4655->2377|4666->2379|4721->2425|4760->2426|4789->2427|4847->2454|4883->2463|4920->2473|4935->2479|4978->2501|5080->2573|5120->407|5148->643|5177->1207|5206->2575|5235->2578|5405->2738|5446->2740|5474->2741|5804->3044|5824->3055|5907->3117|5943->3126|5999->3152
                  LINES: 17->5|22->6|28->10|28->10|30->10|31->11|31->11|32->12|33->15|33->15|35->15|36->16|36->16|36->16|36->16|37->17|38->18|38->18|38->18|39->19|39->19|39->19|39->19|39->19|39->19|39->19|39->19|39->19|39->19|39->19|39->19|40->20|40->20|40->20|40->20|40->20|43->23|44->26|44->26|46->26|47->27|48->28|48->28|48->28|48->28|49->29|62->42|62->42|62->42|62->42|63->43|63->43|63->43|64->44|64->44|65->45|66->46|70->50|70->50|70->50|70->50|70->50|70->50|71->51|71->51|71->51|71->51|72->52|74->9|75->13|77->24|79->53|81->55|84->58|84->58|85->59|89->63|89->63|89->63|90->64|93->67
                  -- GENERATED --
              */
          