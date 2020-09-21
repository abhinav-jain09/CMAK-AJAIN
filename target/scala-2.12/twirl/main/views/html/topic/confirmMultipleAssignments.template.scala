
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

object confirmMultipleAssignments extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.GenerateMultipleAssignments], kafka.manager.model.ClusterContext]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster: String,
  errorOrForm: kafka.manager.ApiError \/ (Form[models.form.GenerateMultipleAssignments], kafka.manager.model.ClusterContext)
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*10.2*/theMenu/*10.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.13*/("""
    """),_display_(/*11.6*/views/*11.11*/.html.navigation.clusterMenu(cluster,"Topic","Confirm Assignments",menus.clusterMenus(cluster)(
        errorOrForm.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*12.115*/("""
""")))};def /*15.2*/checkboxWithLink/*15.18*/(field: play.api.data.Field, topic: String)(implicit fc: b4.B4FieldConstructor, msgsProv: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*15.129*/("""
    """),_display_(/*16.6*/b4/*16.8*/.inputFormGroup(field, withLabelFor = false, views.html.bs.Args.withDefault(Seq(), 'disabled -> false))/*16.111*/ { fieldInfo =>_display_(Seq[Any](format.raw/*16.126*/("""
    """),format.raw/*17.5*/("""<div class="checkbox">
        <label for=""""),_display_(/*18.22*/fieldInfo/*18.31*/.id),format.raw/*18.34*/("""">
            <input type="checkbox" id=""""),_display_(/*19.41*/fieldInfo/*19.50*/.id),format.raw/*19.53*/("""" name=""""),_display_(/*19.62*/fieldInfo/*19.71*/.name),format.raw/*19.76*/("""" value="true" """),_display_(/*19.92*/if(fieldInfo.value == Some("true"))/*19.127*/{_display_(Seq[Any](format.raw/*19.128*/("""checked""")))}),format.raw/*19.136*/(""" """),_display_(/*19.138*/toHtmlArgs(fieldInfo.innerArgsMap)),format.raw/*19.172*/(""">
            <a href=""""),_display_(/*20.23*/routes/*20.29*/.Topic.topic(cluster,topic)),format.raw/*20.56*/("""">"""),_display_(/*20.59*/topic),format.raw/*20.64*/("""</a>
        </label>
    </div>
    """)))}),format.raw/*23.6*/("""
""")))};def /*26.2*/renderForm/*26.12*/(confirmForm: Form[models.form.GenerateMultipleAssignments]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*26.76*/("""
    """),format.raw/*27.5*/("""<h4>Choose topics and brokers for reassignments:</h4>
    """),_display_(/*28.6*/b4/*28.8*/.vertical.form(routes.ReassignPartitions.handleGenerateMultipleAssignments(cluster))/*28.92*/ { implicit fc =>_display_(Seq[Any](format.raw/*28.109*/("""
        """),format.raw/*29.9*/("""<table class="table">
            <thead>
            <tr><th scope="col">Topics</th><th scope="col">Brokers</th></tr>
            </thead>
            <tbody>
            <tr>
                <td>
                    <button type="button" class="btn btn-outline-secondary" onClick="checkBoxSelect('topics',true);">
                        <b>Select All</b>
                    </button>
                    <button type="button" class="btn btn-outline-secondary" onClick="checkBoxSelect('topics',false);">
                        <b>Select None</b>
                    </button>
                    """),_display_(/*42.22*/helper/*42.28*/.repeat(confirmForm("topics"), min = 1)/*42.67*/ { topicSelectForm =>_display_(Seq[Any](format.raw/*42.88*/("""
                        """),_display_(/*43.26*/b4/*43.28*/.hidden(topicSelectForm("name").name,topicSelectForm("name").value.getOrElse(""))),format.raw/*43.109*/("""
                        """),_display_(/*44.26*/checkboxWithLink(topicSelectForm("selected"),topicSelectForm("name").value.getOrElse(""))),format.raw/*44.115*/("""
                    """)))}),format.raw/*45.22*/("""
                """),format.raw/*46.17*/("""</td>
                <td>
                    <button type="button" class="btn btn-outline-secondary" onClick="checkBoxSelect('brokers',true);">
                        <b>Select All</b>
                    </button>
                    <button type="button" class="btn btn-outline-secondary" onClick="checkBoxSelect('brokers',false);">
                        <b>Select None</b>
                    </button>
                    """),_display_(/*54.22*/helper/*54.28*/.repeat(confirmForm("brokers"), min = 1)/*54.68*/ { brokerSelectForm =>_display_(Seq[Any](format.raw/*54.90*/("""
                        """),_display_(/*55.26*/b4/*55.28*/.hidden(brokerSelectForm("id").name,brokerSelectForm("id").value.getOrElse(-1))),format.raw/*55.107*/("""
                        """),_display_(/*56.26*/b4/*56.28*/.hidden(brokerSelectForm("host").name,brokerSelectForm("host").value.getOrElse(""))),format.raw/*56.111*/("""
                        """),_display_(/*57.26*/b4/*57.28*/.checkbox(brokerSelectForm("selected"), '_text -> s"${brokerSelectForm("id").value.getOrElse(-1)} - ${brokerSelectForm("host").value.getOrElse("")}")),format.raw/*57.177*/("""
                    """)))}),format.raw/*58.22*/("""
                """),format.raw/*59.17*/("""</td>
            </tr>
            </tbody>
        </table>
        <a href=""""),_display_(/*63.19*/routes/*63.25*/.Topic.topics(cluster)),format.raw/*63.47*/("""" class="cancel-button btn btn-secondary" role="button">Cancel</a>
        """),_display_(/*64.10*/b4/*64.12*/.submit('class -> "btn btn-primary")/*64.48*/{_display_(Seq[Any](format.raw/*64.49*/(""" """),format.raw/*64.50*/("""Generate Partition Assignments """)))}),format.raw/*64.82*/("""
    """)))}),format.raw/*65.6*/("""
""")))};
Seq[Any](format.raw/*9.1*/("""
"""),format.raw/*13.2*/("""

"""),format.raw/*24.2*/("""

"""),format.raw/*66.2*/("""

"""),_display_(/*68.2*/main(
  "Confirm Multiple Assignment",
  menu = theMenu,
  breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Topics",cluster)))/*71.117*/ {_display_(Seq[Any](format.raw/*71.119*/("""
"""),format.raw/*72.1*/("""<div class="col-md-12 un-pad-me">
    <div class="card">
        <div class="card-header"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="octicon octicon-arrow-left" aria-hidden="true"></span></button>Confirm Assignments</h3></div>
        <div class="card-body">
            """),_display_(/*76.14*/errorOrForm/*76.25*/.fold( views.html.errors.onApiError(_), t => renderForm(t._1))),format.raw/*76.87*/("""
        """),format.raw/*77.9*/("""</div>
    </div>
</div>
""")))}),format.raw/*80.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,errorOrForm:$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.GenerateMultipleAssignments], kafka.manager.model.ClusterContext]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrForm)(af,messages,menus,request)

  def f:((String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.GenerateMultipleAssignments], kafka.manager.model.ClusterContext]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrForm) => (af,messages,menus,request) => apply(cluster,errorOrForm)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/topic/confirmMultipleAssignments.scala.html
                  HASH: b5f0674673241de1633ddb28656e3f8ecb419b93
                  MATRIX: 438->115|1005->135|1360->414|1375->421|1456->425|1488->431|1502->436|1734->646|1759->651|1784->667|1973->778|2005->784|2015->786|2128->889|2182->904|2214->909|2285->953|2303->962|2327->965|2397->1008|2415->1017|2439->1020|2475->1029|2493->1038|2519->1043|2562->1059|2607->1094|2647->1095|2687->1103|2717->1105|2773->1139|2824->1163|2839->1169|2887->1196|2917->1199|2943->1204|3011->1242|3036->1247|3055->1257|3196->1321|3228->1326|3313->1385|3323->1387|3416->1471|3472->1488|3508->1497|4136->2098|4151->2104|4199->2143|4258->2164|4311->2190|4322->2192|4425->2273|4478->2299|4589->2388|4642->2410|4687->2427|5146->2859|5161->2865|5210->2905|5270->2927|5323->2953|5334->2955|5435->3034|5488->3060|5499->3062|5604->3145|5657->3171|5668->3173|5839->3322|5892->3344|5937->3361|6044->3441|6059->3447|6102->3469|6205->3545|6216->3547|6261->3583|6300->3584|6329->3585|6392->3617|6428->3623|6468->412|6496->648|6525->1244|6554->3625|6583->3628|6766->3801|6807->3803|6835->3804|7170->4112|7190->4123|7273->4185|7309->4194|7365->4220
                  LINES: 17->5|22->6|28->10|28->10|30->10|31->11|31->11|32->12|33->15|33->15|35->15|36->16|36->16|36->16|36->16|37->17|38->18|38->18|38->18|39->19|39->19|39->19|39->19|39->19|39->19|39->19|39->19|39->19|39->19|39->19|39->19|40->20|40->20|40->20|40->20|40->20|43->23|44->26|44->26|46->26|47->27|48->28|48->28|48->28|48->28|49->29|62->42|62->42|62->42|62->42|63->43|63->43|63->43|64->44|64->44|65->45|66->46|74->54|74->54|74->54|74->54|75->55|75->55|75->55|76->56|76->56|76->56|77->57|77->57|77->57|78->58|79->59|83->63|83->63|83->63|84->64|84->64|84->64|84->64|84->64|84->64|85->65|87->9|88->13|90->24|92->66|94->68|97->71|97->71|98->72|102->76|102->76|102->76|103->77|106->80
                  -- GENERATED --
              */
          