
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

object logkafkaViewContent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,String,String,kafka.manager.model.ActorModel.LogkafkaIdentity,play.api.i18n.Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(cluster:String, logkafka_id: String, log_path: String, logkafkaIdentity: kafka.manager.model.ActorModel.LogkafkaIdentity
)(implicit messages: play.api.i18n.Messages, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<div class="card-body row">
    <div class="col-md-8">
        <div class="card">
            <div class="card-header"><h4>Logkafka Summary</h4></div>
            <div class="card-body">
            <table class="table">
                <tbody>
                <tr>
                    <td>Logkafka Id</td>
                    <td>"""),_display_(/*17.26*/logkafka_id),format.raw/*17.37*/("""</td>
                <tr>
                    <td>Log Path</td>
                    <td>"""),_display_(/*20.26*/log_path),format.raw/*20.34*/("""</td>
                </tr>
                </tbody>
            </table>
            """),_display_(/*24.14*/if(!logkafkaIdentity.identityMap.isEmpty && !logkafkaIdentity.identityMap.get(log_path).isEmpty)/*24.110*/ {_display_(Seq[Any](format.raw/*24.112*/("""
              """),_display_(/*25.16*/defining(logkafkaIdentity.identityMap.get(log_path).get)/*25.72*/ { identityTuple =>_display_(Seq[Any](format.raw/*25.91*/("""
                """),_display_(/*26.18*/if(identityTuple._1.isDefined)/*26.48*/ {_display_(Seq[Any](format.raw/*26.50*/("""
                """),format.raw/*27.17*/("""<table class="table">
                    <thead>
                    <th>Config</th><th>Value</th>
                    </thead>
                    <tbody>
                    """),_display_(/*32.22*/identityTuple/*32.35*/._1.map/*32.42*/ { config =>_display_(Seq[Any](format.raw/*32.54*/("""
                        """),_display_(/*33.26*/for((k, v) <- config) yield /*33.47*/ {_display_(Seq[Any](format.raw/*33.49*/("""
                            """),format.raw/*34.29*/("""<tr>
                                <td>"""),_display_(/*35.38*/k),format.raw/*35.39*/("""</td>
                                <td>"""),_display_(/*36.38*/v),format.raw/*36.39*/("""</td>
                            </tr>
                        """)))}),format.raw/*38.26*/("""
                    """)))}),format.raw/*39.22*/("""
                    """),format.raw/*40.21*/("""</tbody>
                </table>
                """)))}),format.raw/*42.18*/("""
              """)))}),format.raw/*43.16*/("""
            """)))}),format.raw/*44.14*/("""
            """),format.raw/*45.13*/("""</div>
        </div>
    </div>
    <div class="col-md-4">
        <div class="card">
            <div class="card-header"><h4>Operations</h4></div>
            <div class="card-body">
            <table class="table">
                <tbody>
                <tr>
                    <td>
                        """),_display_(/*56.26*/b4/*56.28*/.vertical.form(routes.Logkafka.handleDeleteLogkafka(cluster, logkafka_id, log_path))/*56.112*/ { implicit fc =>_display_(Seq[Any](format.raw/*56.129*/("""
                        """),format.raw/*57.25*/("""<fieldset>
                            """),_display_(/*58.30*/b4/*58.32*/.hidden("logkafka_id", logkafka_id)),format.raw/*58.67*/("""
                            """),_display_(/*59.30*/b4/*59.32*/.hidden("log_path", log_path)),format.raw/*59.61*/("""
                            """),_display_(/*60.30*/b4/*60.32*/.submit('class -> "submit-button btn btn-primary")/*60.82*/{_display_(Seq[Any](format.raw/*60.83*/(""" """),format.raw/*60.84*/("""Delete Logkafka """)))}),format.raw/*60.101*/("""
                        """),format.raw/*61.25*/("""</fieldset>
                        """)))}),format.raw/*62.26*/("""
                    """),format.raw/*63.21*/("""</td>
                </tr>
                <tr>
                    <td>
                        <a href=""""),_display_(/*67.35*/routes/*67.41*/.Logkafka.updateConfig(cluster,logkafka_id,log_path)),format.raw/*67.93*/("""" class="submit-button btn btn-primary" role="button">Update Config</a>
                    </td>
                </tr>
                </tbody>
            </table>
            </div>
        </div>
    </div>
</div>
"""))
      }
    }
  }

  def render(cluster:String,logkafka_id:String,log_path:String,logkafkaIdentity:kafka.manager.model.ActorModel.LogkafkaIdentity,messages:play.api.i18n.Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,logkafka_id,log_path,logkafkaIdentity)(messages,request)

  def f:((String,String,String,kafka.manager.model.ActorModel.LogkafkaIdentity) => (play.api.i18n.Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,logkafka_id,log_path,logkafkaIdentity) => (messages,request) => apply(cluster,logkafka_id,log_path,logkafkaIdentity)(messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/logkafka/logkafkaViewContent.scala.html
                  HASH: 2f35a758be1defc5dd6f1af66cd82529611a6567
                  MATRIX: 960->115|1243->305|1270->306|1629->638|1661->649|1778->739|1807->747|1921->834|2027->930|2068->932|2111->948|2176->1004|2233->1023|2278->1041|2317->1071|2357->1073|2402->1090|2607->1268|2629->1281|2645->1288|2695->1300|2748->1326|2785->1347|2825->1349|2882->1378|2951->1420|2973->1421|3043->1464|3065->1465|3161->1530|3214->1552|3263->1573|3345->1624|3392->1640|3437->1654|3478->1667|3820->1982|3831->1984|3925->2068|3981->2085|4034->2110|4101->2150|4112->2152|4168->2187|4225->2217|4236->2219|4286->2248|4343->2278|4354->2280|4413->2330|4452->2331|4481->2332|4530->2349|4583->2374|4651->2411|4700->2432|4835->2540|4850->2546|4923->2598
                  LINES: 24->5|30->7|31->8|40->17|40->17|43->20|43->20|47->24|47->24|47->24|48->25|48->25|48->25|49->26|49->26|49->26|50->27|55->32|55->32|55->32|55->32|56->33|56->33|56->33|57->34|58->35|58->35|59->36|59->36|61->38|62->39|63->40|65->42|66->43|67->44|68->45|79->56|79->56|79->56|79->56|80->57|81->58|81->58|81->58|82->59|82->59|82->59|83->60|83->60|83->60|83->60|83->60|83->60|84->61|85->62|86->63|90->67|90->67|90->67
                  -- GENERATED --
              */
          