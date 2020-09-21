
package views.html.cluster

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

object pendingClusterList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[IndexedSeq[kafka.manager.model.ClusterConfig],play.api.i18n.Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(clusters: IndexedSeq[kafka.manager.model.ClusterConfig])(implicit messages: play.api.i18n.Messages, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*7.2*/implicitFieldConstructor/*7.26*/ = {{ b4.vertical.fieldConstructor() }};
Seq[Any](format.raw/*6.1*/("""
"""),format.raw/*7.64*/("""

"""),_display_(/*9.2*/if(clusters.nonEmpty)/*9.23*/ {_display_(Seq[Any](format.raw/*9.25*/("""
            """),format.raw/*10.13*/("""<br>
            <table class="table">
                <thead>
                <tr><th>Pending</th><th>Status</th><th>Version</th></tr>
                </thead>
                <tbody>
                """),_display_(/*16.18*/for(cluster <- clusters) yield /*16.42*/ {_display_(Seq[Any](format.raw/*16.44*/("""
                """),format.raw/*17.17*/("""<tr>
                    <td>"""),_display_(/*18.26*/cluster/*18.33*/.name),format.raw/*18.38*/("""</td>
                    <td>pending changes</td>
                    <td>"""),_display_(/*20.26*/cluster/*20.33*/.version.toString),format.raw/*20.50*/("""</td>
                </tr>
                """)))}),format.raw/*22.18*/("""
                """),format.raw/*23.17*/("""</tbody>
            </table>
""")))}),format.raw/*25.2*/("""
"""))
      }
    }
  }

  def render(clusters:IndexedSeq[kafka.manager.model.ClusterConfig],messages:play.api.i18n.Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(clusters)(messages,request)

  def f:((IndexedSeq[kafka.manager.model.ClusterConfig]) => (play.api.i18n.Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (clusters) => (messages,request) => apply(clusters)(messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/cluster/pendingClusterList.scala.html
                  HASH: e44970f934b9635c4db5999a676fe29c93995164
                  MATRIX: 935->115|1145->241|1177->265|1244->239|1272->303|1300->306|1329->327|1368->329|1409->342|1638->544|1678->568|1718->570|1763->587|1820->617|1836->624|1862->629|1965->705|1981->712|2019->729|2095->774|2140->791|2201->822
                  LINES: 24->5|28->7|28->7|29->6|30->7|32->9|32->9|32->9|33->10|39->16|39->16|39->16|40->17|41->18|41->18|41->18|43->20|43->20|43->20|45->22|46->23|48->25
                  -- GENERATED --
              */
          