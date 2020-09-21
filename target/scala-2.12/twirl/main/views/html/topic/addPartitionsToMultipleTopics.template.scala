
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

object addPartitionsToMultipleTopics extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.AddMultipleTopicsPartitions], kafka.manager.model.ClusterContext]],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster: String, errorOrForm: kafka.manager.ApiError \/ (Form[models.form.AddMultipleTopicsPartitions], kafka.manager.model.ClusterContext)
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*9.2*/import helper._
/*10.2*/import controllers.routes

def /*12.2*/theMenu/*12.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.13*/("""
    """),_display_(/*13.6*/views/*13.11*/.html.navigation.clusterMenu(cluster,"Topics","Add Partitions to Topics",menus.clusterMenus(cluster)(
        errorOrForm.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*14.115*/("""
""")))};def /*17.2*/checkboxWithLink/*17.18*/(field: play.api.data.Field, topic: String)(implicit fc: b4.B4FieldConstructor, msgsProv: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.129*/("""
"""),_display_(/*18.2*/b4/*18.4*/.inputFormGroup(field, withLabelFor = false, views.html.bs.Args.withDefault(Seq(), 'disabled -> false))/*18.107*/ { fieldInfo =>_display_(Seq[Any](format.raw/*18.122*/("""
"""),format.raw/*19.1*/("""<div class="checkbox">
    <label for=""""),_display_(/*20.18*/fieldInfo/*20.27*/.id),format.raw/*20.30*/("""">
        <input type="checkbox" id=""""),_display_(/*21.37*/fieldInfo/*21.46*/.id),format.raw/*21.49*/("""" name=""""),_display_(/*21.58*/fieldInfo/*21.67*/.name),format.raw/*21.72*/("""" value="true" """),_display_(/*21.88*/if(fieldInfo.value == Some("true"))/*21.123*/{_display_(Seq[Any](format.raw/*21.124*/("""checked""")))}),format.raw/*21.132*/(""" """),_display_(/*21.134*/toHtmlArgs(fieldInfo.innerArgsMap)),format.raw/*21.168*/(""">
        <a href=""""),_display_(/*22.19*/routes/*22.25*/.Topic.topic(cluster,topic)),format.raw/*22.52*/("""">"""),_display_(/*22.55*/topic),format.raw/*22.60*/("""</a>
    </label>
</div>
""")))}),format.raw/*25.2*/("""
""")))};def /*28.2*/renderForm/*28.12*/(addMultipleTopicsPartitionsForm: Form[models.form.AddMultipleTopicsPartitions]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*28.96*/("""
"""),_display_(/*29.2*/b4/*29.4*/.vertical.form(routes.Topic.handleAddPartitionsToMultipleTopics(cluster))/*29.77*/ { implicit fc =>_display_(Seq[Any](format.raw/*29.94*/("""
"""),format.raw/*30.1*/("""<table class="table">
    <thead>
    <tr><th>Add Partitions</th><th>Brokers</th></tr>
    </thead>
    <tbody>
    <tr>
        &#9888; Selected topics will have the same number of partitions after the operation.
    </tr>
    <tr>
        <td>
            """),_display_(/*40.14*/b4/*40.16*/.text(addMultipleTopicsPartitionsForm("partitions"), '_label -> "Partitions", 'placeholder -> "8")),format.raw/*40.114*/("""
            """),_display_(/*41.14*/helper/*41.20*/.repeat(addMultipleTopicsPartitionsForm("readVersions"), min = 1)/*41.85*/ { readVersionForm =>_display_(Seq[Any](format.raw/*41.106*/("""
            """),_display_(/*42.14*/b4/*42.16*/.hidden(readVersionForm("topic").name,readVersionForm("topic").value.getOrElse(""))),format.raw/*42.99*/("""
            """),_display_(/*43.14*/b4/*43.16*/.hidden(readVersionForm("version").name,readVersionForm("version").value.getOrElse(-1))),format.raw/*43.103*/("""
            """)))}),format.raw/*44.14*/("""
            """),format.raw/*45.13*/("""<button type="button" class="btn btn-secondary" onClick="checkBoxSelect('topics',true);">
                <b>Select All</b>
            </button>
            <button type="button" class="btn btn-secondary" onClick="checkBoxSelect('topics',false);">
                <b>Select None</b>
            </button>
            """),_display_(/*51.14*/helper/*51.20*/.repeat(addMultipleTopicsPartitionsForm("topics"), min = 1)/*51.79*/ { topicSelectForm =>_display_(Seq[Any](format.raw/*51.100*/("""
            """),_display_(/*52.14*/b4/*52.16*/.hidden(topicSelectForm("name").name,topicSelectForm("name").value.getOrElse(""))),format.raw/*52.97*/("""
            """),_display_(/*53.14*/checkboxWithLink(topicSelectForm("selected"),topicSelectForm("name").value.getOrElse(""))),format.raw/*53.103*/("""
            """)))}),format.raw/*54.14*/("""
        """),format.raw/*55.9*/("""</td>
        <td>
            <button type="button" class="btn btn-secondary" onClick="checkBoxSelect('brokers',true);">
                <b>Select All</b>
            </button>
            <button type="button" class="btn btn-secondary" onClick="checkBoxSelect('brokers',false);">
                <b>Select None</b>
            </button>
            """),_display_(/*63.14*/helper/*63.20*/.repeat(addMultipleTopicsPartitionsForm("brokers"), min = 1)/*63.80*/ { brokerSelectForm =>_display_(Seq[Any](format.raw/*63.102*/("""
            """),_display_(/*64.14*/b4/*64.16*/.hidden(brokerSelectForm("id").name,brokerSelectForm("id").value.getOrElse(-1))),format.raw/*64.95*/("""
            """),_display_(/*65.14*/b4/*65.16*/.hidden(brokerSelectForm("host").name,brokerSelectForm("host").value.getOrElse(""))),format.raw/*65.99*/("""
            """),_display_(/*66.14*/b4/*66.16*/.checkbox(brokerSelectForm("selected"), '_text -> s"${brokerSelectForm("id").value.getOrElse(-1)} - ${brokerSelectForm("host").value.getOrElse("")}")),format.raw/*66.165*/("""
            """)))}),format.raw/*67.14*/("""
        """),format.raw/*68.9*/("""</td>
    </tr>
    </tbody>
</table>
"""),_display_(/*72.2*/b4/*72.4*/.submit('class -> "submit-button btn btn-primary")/*72.54*/{_display_(Seq[Any](format.raw/*72.55*/(""" """),format.raw/*72.56*/("""Add Partitions """)))}),format.raw/*72.72*/("""
"""),format.raw/*73.1*/("""<a href=""""),_display_(/*73.11*/routes/*73.17*/.Topic.topics(cluster)),format.raw/*73.39*/("""" class="cancel-button btn btn-secondary" role="button">Cancel</a>
""")))}),format.raw/*74.2*/("""
""")))};
Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*11.1*/("""
"""),format.raw/*15.2*/("""

"""),format.raw/*26.2*/("""

"""),format.raw/*75.2*/("""

"""),_display_(/*77.2*/main(
"Add Partitions to Multiple Topics",
menu = theMenu,
breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Topics",cluster)))/*80.115*/ {_display_(Seq[Any](format.raw/*80.117*/("""
"""),format.raw/*81.1*/("""<div class="col-md-6 un-pad-me">
    <div class="card">
        <div class="card-header"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="octicon octicon-arrow-left" aria-hidden="true"></span></button>Add Partitions</h3></div>
        <div class="card-body">
            """),_display_(/*85.14*/errorOrForm/*85.25*/.fold( views.html.errors.onApiError(_), t => renderForm(t._1))),format.raw/*85.87*/("""
        """),format.raw/*86.9*/("""</div>
    </div>
</div>
""")))}),format.raw/*89.2*/("""

"""))
      }
    }
  }

  def render(cluster:String,errorOrForm:$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.AddMultipleTopicsPartitions], kafka.manager.model.ClusterContext]],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,errorOrForm)(af,messages,menus,request)

  def f:((String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.AddMultipleTopicsPartitions], kafka.manager.model.ClusterContext]]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,errorOrForm) => (af,messages,menus,request) => apply(cluster,errorOrForm)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/topic/addPartitionsToMultipleTopics.scala.html
                  HASH: f730d4c005c81f4e4854026d05455a7038a0584c
                  MATRIX: 438->115|1008->135|1355->412|1379->429|1418->457|1433->464|1514->468|1546->474|1560->479|1798->695|1823->700|1848->716|2037->827|2065->829|2075->831|2188->934|2242->949|2270->950|2337->990|2355->999|2379->1002|2445->1041|2463->1050|2487->1053|2523->1062|2541->1071|2567->1076|2610->1092|2655->1127|2695->1128|2735->1136|2765->1138|2821->1172|2868->1192|2883->1198|2931->1225|2961->1228|2987->1233|3043->1259|3068->1264|3087->1274|3248->1358|3276->1360|3286->1362|3368->1435|3423->1452|3451->1453|3737->1712|3748->1714|3868->1812|3909->1826|3924->1832|3998->1897|4058->1918|4099->1932|4110->1934|4214->2017|4255->2031|4266->2033|4375->2120|4420->2134|4461->2147|4807->2466|4822->2472|4890->2531|4950->2552|4991->2566|5002->2568|5104->2649|5145->2663|5256->2752|5301->2766|5337->2775|5716->3127|5731->3133|5800->3193|5861->3215|5902->3229|5913->3231|6013->3310|6054->3324|6065->3326|6169->3409|6210->3423|6221->3425|6392->3574|6437->3588|6473->3597|6538->3636|6548->3638|6607->3688|6646->3689|6675->3690|6722->3706|6750->3707|6787->3717|6802->3723|6845->3745|6943->3813|6983->410|7011->455|7039->697|7068->1261|7097->3815|7126->3818|7309->3991|7350->3993|7378->3994|7707->4296|7727->4307|7810->4369|7846->4378|7902->4404
                  LINES: 17->5|22->6|26->9|27->10|29->12|29->12|31->12|32->13|32->13|33->14|34->17|34->17|36->17|37->18|37->18|37->18|37->18|38->19|39->20|39->20|39->20|40->21|40->21|40->21|40->21|40->21|40->21|40->21|40->21|40->21|40->21|40->21|40->21|41->22|41->22|41->22|41->22|41->22|44->25|45->28|45->28|47->28|48->29|48->29|48->29|48->29|49->30|59->40|59->40|59->40|60->41|60->41|60->41|60->41|61->42|61->42|61->42|62->43|62->43|62->43|63->44|64->45|70->51|70->51|70->51|70->51|71->52|71->52|71->52|72->53|72->53|73->54|74->55|82->63|82->63|82->63|82->63|83->64|83->64|83->64|84->65|84->65|84->65|85->66|85->66|85->66|86->67|87->68|91->72|91->72|91->72|91->72|91->72|91->72|92->73|92->73|92->73|92->73|93->74|95->8|96->11|97->15|99->26|101->75|103->77|106->80|106->80|107->81|111->85|111->85|111->85|112->86|115->89
                  -- GENERATED --
              */
          