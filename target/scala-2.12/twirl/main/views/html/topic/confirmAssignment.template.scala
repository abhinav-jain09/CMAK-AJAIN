
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

object confirmAssignment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[String,String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.GenerateAssignment], kafka.manager.model.ClusterContext]],$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.GeneratedPartitionAssignments],features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster: String,
  topic: String,
  errorOrForm: kafka.manager.ApiError \/ (Form[models.form.GenerateAssignment], kafka.manager.model.ClusterContext),
  errorOrCurrentAssignments: kafka.manager.ApiError \/ kafka.manager.model.ActorModel.GeneratedPartitionAssignments
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*12.2*/theMenu/*12.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.13*/("""
    """),_display_(/*13.6*/views/*13.11*/.html.navigation.clusterMenu(cluster,"Topic","Confirm Assignment",menus.clusterMenus(cluster)(
        errorOrForm.toOption.map(_._2.clusterFeatures).getOrElse(kafka.manager.features.ClusterFeatures.default)))),format.raw/*14.115*/("""
""")))};def /*17.2*/renderForm/*17.12*/(confirmForm: Form[models.form.GenerateAssignment]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.67*/("""
    """),format.raw/*18.5*/("""<h4>Choose brokers to reassign topic <b>"""),_display_(/*18.46*/topic),format.raw/*18.51*/("""</b> to:</h4>
    """),_display_(/*19.6*/b4/*19.8*/.vertical.form(routes.ReassignPartitions.handleGenerateAssignment(cluster,topic))/*19.89*/ { implicit fc =>_display_(Seq[Any](format.raw/*19.106*/("""
        """),format.raw/*20.9*/("""<table class="table">
            <thead>
            <tr>
                <th scope="col">Brokers</th>
                <th scope="col">Replication</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>
                <button type="button" class="btn btn-outline-secondary" onClick="checkBoxSelect('brokers',true);">
                    <b>Select All</b>
                </button>
                <button type="button" class="btn btn-outline-secondary" onClick="checkBoxSelect('brokers',false);">
                    <b>Select None</b>
                </button>
                <br><br>
                """),_display_(/*37.18*/helper/*37.24*/.repeat(confirmForm("brokers"), min = 1)/*37.64*/ { brokerSelectForm =>_display_(Seq[Any](format.raw/*37.86*/("""
                    """),_display_(/*38.22*/b4/*38.24*/.hidden(brokerSelectForm("id").name,brokerSelectForm("id").value.getOrElse(-1))),format.raw/*38.103*/("""
                    """),_display_(/*39.22*/b4/*39.24*/.hidden(brokerSelectForm("host").name,brokerSelectForm("host").value.getOrElse(""))),format.raw/*39.107*/("""
                    """),_display_(/*40.22*/b4/*40.24*/.checkbox(brokerSelectForm("selected"), '_text -> s"${brokerSelectForm("id").value.getOrElse(-1)} - ${brokerSelectForm("host").value.getOrElse("")}")),format.raw/*40.173*/("""
                """)))}),format.raw/*41.18*/("""
                """),format.raw/*42.17*/("""</td>
                <td>
                    """),_display_(/*44.22*/b4/*44.24*/.number(confirmForm("replicationFactor"), '_label -> "Replication factor (optional)")),format.raw/*44.109*/("""
                """),format.raw/*45.17*/("""</td>
            </tr>
            </tbody>
        </table>
        <a href=""""),_display_(/*49.19*/routes/*49.25*/.Topic.topic(cluster,topic)),format.raw/*49.52*/("""" class="cancel-button btn btn-secondary" role="button">Cancel</a>
        """),_display_(/*50.10*/b4/*50.12*/.submit('class -> "btn btn-primary")/*50.48*/{_display_(Seq[Any](format.raw/*50.49*/(""" """),format.raw/*50.50*/("""Generate Partition Assignments """)))}),format.raw/*50.82*/("""
    """)))}),format.raw/*51.6*/("""
""")))};def /*54.2*/renderAssignments/*54.19*/(gpa: kafka.manager.model.ActorModel.GeneratedPartitionAssignments):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*54.90*/("""
    """),format.raw/*55.5*/("""<h4>Current Assignments</h4>
    <table class="table">
        <thead>
        <tr><th>Partition</th><th>Replicas</th></tr>
        </thead>
        """),_display_(/*60.10*/for((partNum, replicas) <- gpa.assignments.toList.sortBy(_._1) ) yield /*60.74*/ {_display_(Seq[Any](format.raw/*60.76*/("""
        """),format.raw/*61.9*/("""<tr>
            <td>"""),_display_(/*62.18*/partNum),format.raw/*62.25*/("""</td>
            <td style="word-wrap: break-word">"""),_display_(/*63.48*/replicas/*63.56*/.mkString("(", ",", ")")),format.raw/*63.80*/("""</td>
        </tr>
        """)))}),format.raw/*65.10*/("""
    """),format.raw/*66.5*/("""</table>
""")))};
Seq[Any](format.raw/*11.1*/("""
"""),format.raw/*15.2*/("""

"""),format.raw/*52.2*/("""
        
"""),format.raw/*67.2*/("""

"""),_display_(/*69.2*/main(
  "Confirm Assignment",
  menu = theMenu,
  breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withNamedViewAndCluster("Topic View",cluster,topic)))/*72.132*/ {_display_(Seq[Any](format.raw/*72.134*/("""
"""),format.raw/*73.1*/("""<div class="col-md-6 un-pad-me">
    <div class="card">
        <div class="card-header"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="octicon octicon-arrow-left" aria-hidden="true"></span></button>Confirm Assignment</h3></div>
        <div class="card-body">
            """),_display_(/*77.14*/errorOrForm/*77.25*/.fold( views.html.errors.onApiError(_), t => renderForm(t._1))),format.raw/*77.87*/("""
        """),format.raw/*78.9*/("""</div>
    </div>
</div>
<div class="col-md-6 un-pad-me">
    <div class="card">
        <div class="card--body">
            """),_display_(/*84.14*/errorOrCurrentAssignments/*84.39*/.fold( views.html.errors.onApiError(_), t => renderAssignments(t))),format.raw/*84.105*/("""
        """),format.raw/*85.9*/("""</div>
    </div>
</div>
""")))}),format.raw/*88.2*/("""
"""))
      }
    }
  }

  def render(cluster:String,topic:String,errorOrForm:$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.GenerateAssignment], kafka.manager.model.ClusterContext]],errorOrCurrentAssignments:$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.GeneratedPartitionAssignments],af:features.ApplicationFeatures,messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,topic,errorOrForm,errorOrCurrentAssignments)(af,messages,menus,request)

  def f:((String,String,$bslash$div[kafka.manager.ApiError, scala.Tuple2[Form[models.form.GenerateAssignment], kafka.manager.model.ClusterContext]],$bslash$div[kafka.manager.ApiError, kafka.manager.model.ActorModel.GeneratedPartitionAssignments]) => (features.ApplicationFeatures,play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,topic,errorOrForm,errorOrCurrentAssignments) => (af,messages,menus,request) => apply(cluster,topic,errorOrForm,errorOrCurrentAssignments)(af,messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/topic/confirmAssignment.scala.html
                  HASH: a13f1ae487f641dbf9d085fb94bf70c4f36ff1e7
                  MATRIX: 438->115|1092->135|1572->539|1587->546|1668->550|1700->556|1714->561|1945->770|1970->775|1989->785|2121->840|2153->845|2221->886|2247->891|2292->910|2302->912|2392->993|2448->1010|2484->1019|3163->1671|3178->1677|3227->1717|3287->1739|3336->1761|3347->1763|3448->1842|3497->1864|3508->1866|3613->1949|3662->1971|3673->1973|3844->2122|3893->2140|3938->2157|4013->2205|4024->2207|4131->2292|4176->2309|4283->2389|4298->2395|4346->2422|4449->2498|4460->2500|4505->2536|4544->2537|4573->2538|4636->2570|4672->2576|4697->2589|4723->2606|4871->2677|4903->2682|5080->2832|5160->2896|5200->2898|5236->2907|5285->2929|5313->2936|5393->2989|5410->2997|5455->3021|5515->3050|5547->3055|5596->537|5624->772|5653->2578|5690->3065|5719->3068|5908->3247|5949->3249|5977->3250|6310->3556|6330->3567|6413->3629|6449->3638|6603->3765|6637->3790|6725->3856|6761->3865|6817->3891
                  LINES: 17->5|22->6|30->12|30->12|32->12|33->13|33->13|34->14|35->17|35->17|37->17|38->18|38->18|38->18|39->19|39->19|39->19|39->19|40->20|57->37|57->37|57->37|57->37|58->38|58->38|58->38|59->39|59->39|59->39|60->40|60->40|60->40|61->41|62->42|64->44|64->44|64->44|65->45|69->49|69->49|69->49|70->50|70->50|70->50|70->50|70->50|70->50|71->51|72->54|72->54|74->54|75->55|80->60|80->60|80->60|81->61|82->62|82->62|83->63|83->63|83->63|85->65|86->66|88->11|89->15|91->52|93->67|95->69|98->72|98->72|99->73|103->77|103->77|103->77|104->78|110->84|110->84|110->84|111->85|114->88
                  -- GENERATED --
              */
          