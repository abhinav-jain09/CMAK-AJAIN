
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

object logkafkaListContent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,IndexedSeq[scala.Tuple2[scala.Tuple2[String, Option[kafka.manager.model.ActorModel.LogkafkaIdentity]], Boolean]],play.api.i18n.Messages,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(cluster: String, logkafkas: IndexedSeq[((String, Option[kafka.manager.model.ActorModel.LogkafkaIdentity]),Boolean)]
)(implicit messages: play.api.i18n.Messages, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*8.2*/import scala.Int; var row_num = 0;

def /*10.2*/getFilesizeStatus/*10.19*/(filesize: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.38*/("""
    """),_display_(/*11.6*/filesize/*11.14*/ match/*11.20*/ {/*12.9*/case i if i < 0 =>/*12.27*/ {_display_(Seq[Any](format.raw/*12.29*/("""table-warning""")))}/*13.9*/case i =>/*13.18*/ {}}),format.raw/*14.6*/("""
""")))};def /*17.2*/getLogkafkaStatus/*17.19*/(flag: Boolean, s1: String, s2: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.62*/("""
    """),_display_(/*18.6*/if(flag)/*18.14*/ {_display_(_display_(/*18.17*/s1))}/*18.21*/else/*18.26*/{_display_(_display_(/*18.28*/s2))}),format.raw/*18.31*/("""
""")))};def /*21.2*/getTime/*21.9*/(timestamp: Long):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.30*/("""
    """),_display_(/*22.6*/((new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")).format(timestamp*1000))),format.raw/*22.89*/("""
""")))};
Seq[Any](format.raw/*7.1*/("""
"""),format.raw/*9.1*/("""
"""),format.raw/*15.2*/("""

"""),format.raw/*19.2*/("""

"""),format.raw/*23.2*/("""

"""),format.raw/*25.1*/("""<table class="table" id="logkafkas-table">
    <thead>
        <tr><th>row</th><th>Logkafka Id</th><th>Log Path</th><th># Real Path</th><th># Last Rotate Time</th><th># File Inode</th><th># File Pos</th><th># File Size</th><th># Topic</th><th>Operations</th></tr>
    </thead>
    <tbody>
    """),_display_(/*30.6*/for( ((logkafka_id, logkafkaIdentity), deleted) <- logkafkas) yield /*30.67*/ {_display_(Seq[Any](format.raw/*30.69*/("""
        """),_display_(/*31.10*/logkafkaIdentity/*31.26*/.map/*31.30*/{ li =>_display_(Seq[Any](format.raw/*31.37*/("""
            """),_display_(/*32.14*/for( (log_path, im) <- li.identityMap) yield /*32.52*/ {_display_(Seq[Any](format.raw/*32.54*/("""
                """),_display_(/*33.18*/{row_num = row_num + 1}),format.raw/*33.41*/("""
                """),format.raw/*34.17*/("""<tr>
                <td class="""),_display_(/*35.28*/getLogkafkaStatus(li.active, "", "table-danger")),format.raw/*35.76*/(""">
                    <a href=""""),_display_(/*36.31*/routes/*36.37*/.Logkafka.logkafka(cluster, logkafka_id, log_path)),format.raw/*36.87*/("""">"""),_display_(/*36.90*/row_num),format.raw/*36.97*/("""</a>
                </td>

                <td> """),_display_(/*39.23*/logkafka_id),format.raw/*39.34*/(""" """),format.raw/*39.35*/("""</td>

                """),_display_(/*41.18*/im/*41.20*/._1.map/*41.27*/ { c =>_display_(Seq[Any](format.raw/*41.34*/("""
                    """),format.raw/*42.21*/("""<td>"""),_display_(/*42.26*/log_path),format.raw/*42.34*/("""</td>
                """)))}/*43.18*/.getOrElse/*43.28*/{_display_(Seq[Any](format.raw/*43.29*/("""<td> </td>""")))}),format.raw/*43.40*/("""

                """),_display_(/*45.18*/im/*45.20*/._2.map/*45.27*/ { c =>_display_(Seq[Any](format.raw/*45.34*/("""
                    """),_display_(/*46.22*/c/*46.23*/.get("realpath").map/*46.43*/ { d =>_display_(Seq[Any](format.raw/*46.50*/("""
                        """),format.raw/*47.25*/("""<td>"""),_display_(/*47.30*/d),format.raw/*47.31*/("""</td>
                    """)))}/*48.22*/.getOrElse/*48.32*/{_display_(Seq[Any](format.raw/*48.33*/("""<td class = "table-danger"> no corresponding file </td>""")))}),format.raw/*48.89*/("""
                """)))}/*49.18*/.getOrElse/*49.28*/{_display_(Seq[Any](format.raw/*49.29*/("""
                    """),format.raw/*50.21*/("""<td class = """),_display_(/*50.34*/getLogkafkaStatus(li.active, "table-warning", "table-danger")),format.raw/*50.95*/(""">
                        """),_display_(/*51.26*/getLogkafkaStatus(li.active,"scanning for new file", "logkafka is inactive")),format.raw/*51.102*/(""" 
                    """),format.raw/*52.21*/("""</td>
                """)))}),format.raw/*53.18*/("""

                """),_display_(/*55.18*/im/*55.20*/._2.map/*55.27*/ { c =>_display_(Seq[Any](format.raw/*55.34*/("""
                    """),_display_(/*56.22*/c/*56.23*/.get("last_rotate_time_sec").map/*56.55*/ { d =>_display_(Seq[Any](format.raw/*56.62*/("""
                        """),format.raw/*57.25*/("""<td>"""),_display_(/*57.30*/getTime(d.toLong)),format.raw/*57.47*/("""</td>
                    """)))}/*58.22*/.getOrElse/*58.32*/{_display_(Seq[Any](format.raw/*58.33*/("""<td> </td>""")))}),format.raw/*58.44*/("""
                """)))}/*59.18*/.getOrElse/*59.28*/{_display_(Seq[Any](format.raw/*59.29*/("""<td> </td>""")))}),format.raw/*59.40*/("""

                """),_display_(/*61.18*/im/*61.20*/._2.map/*61.27*/ { c =>_display_(Seq[Any](format.raw/*61.34*/("""
                    """),_display_(/*62.22*/c/*62.23*/.get("inode").map/*62.40*/ { d =>_display_(Seq[Any](format.raw/*62.47*/("""
                        """),format.raw/*63.25*/("""<td>"""),_display_(/*63.30*/d),format.raw/*63.31*/("""</td>
                    """)))}/*64.22*/.getOrElse/*64.32*/{_display_(Seq[Any](format.raw/*64.33*/("""<td> </td>""")))}),format.raw/*64.44*/("""
                """)))}/*65.18*/.getOrElse/*65.28*/{_display_(Seq[Any](format.raw/*65.29*/("""<td> </td>""")))}),format.raw/*65.40*/("""

                """),_display_(/*67.18*/im/*67.20*/._2.map/*67.27*/ { c =>_display_(Seq[Any](format.raw/*67.34*/("""
                    """),_display_(/*68.22*/c/*68.23*/.get("filepos").map/*68.42*/ { d =>_display_(Seq[Any](format.raw/*68.49*/("""
                        """),format.raw/*69.25*/("""<td>"""),_display_(/*69.30*/d),format.raw/*69.31*/("""</td>
                    """)))}/*70.22*/.getOrElse/*70.32*/{_display_(Seq[Any](format.raw/*70.33*/("""<td> </td>""")))}),format.raw/*70.44*/("""
                """)))}/*71.18*/.getOrElse/*71.28*/{_display_(Seq[Any](format.raw/*71.29*/("""<td> </td>""")))}),format.raw/*71.40*/("""

                """),_display_(/*73.18*/im/*73.20*/._2.map/*73.27*/ { c =>_display_(Seq[Any](format.raw/*73.34*/("""
                    """),_display_(/*74.22*/c/*74.23*/.get("filesize").map/*74.43*/ { d =>_display_(Seq[Any](format.raw/*74.50*/("""
                        """),format.raw/*75.25*/("""<td class = """"),_display_(/*75.39*/getFilesizeStatus(d.toInt)),format.raw/*75.65*/("""">"""),_display_(/*75.68*/d),format.raw/*75.69*/("""</td>
                    """)))}/*76.22*/.getOrElse/*76.32*/{_display_(Seq[Any](format.raw/*76.33*/("""<td> </td>""")))}),format.raw/*76.44*/("""
                """)))}/*77.18*/.getOrElse/*77.28*/{_display_(Seq[Any](format.raw/*77.29*/("""<td> </td>""")))}),format.raw/*77.40*/("""

                """),_display_(/*79.18*/im/*79.20*/._1.map/*79.27*/ { c =>_display_(Seq[Any](format.raw/*79.34*/("""
                    """),_display_(/*80.22*/c/*80.23*/.get("topic").map/*80.40*/ { d =>_display_(Seq[Any](format.raw/*80.47*/("""
                        """),format.raw/*81.25*/("""<td>"""),_display_(/*81.30*/d),format.raw/*81.31*/("""</td>
                    """)))}/*82.22*/.getOrElse/*82.32*/{_display_(Seq[Any](format.raw/*82.33*/("""<td> </td>""")))}),format.raw/*82.44*/("""
                """)))}/*83.18*/.getOrElse/*83.28*/{_display_(Seq[Any](format.raw/*83.29*/("""<td> </td>""")))}),format.raw/*83.40*/("""

                """),format.raw/*85.17*/("""<td>
                    <div class="btn-group" role="group" aria-label="Operations">
                        """),_display_(/*87.26*/im/*87.28*/._1.map/*87.35*/ { c =>_display_(Seq[Any](format.raw/*87.42*/("""
                            """),_display_(/*88.30*/c/*88.31*/.get("valid").map/*88.48*/ { enabled =>_display_(Seq[Any](format.raw/*88.61*/("""
                                """),_display_(/*89.34*/if(enabled.toBoolean)/*89.55*/ {_display_(Seq[Any](format.raw/*89.57*/("""
                                    """),format.raw/*90.37*/("""<a href=""""),_display_(/*90.47*/routes/*90.53*/.Logkafka.updateConfig(cluster, logkafka_id, log_path)),format.raw/*90.107*/("""" class="btn btn-outline-primary ops-button" role="button">Modify</a>
                                    """),_display_(/*91.38*/b4/*91.40*/.vertical.form(routes.Logkafka.handleDisableConfig(cluster, logkafka_id, log_path))/*91.123*/ { implicit fc =>_display_(Seq[Any](format.raw/*91.140*/("""
                                        """),format.raw/*92.41*/("""<input type="hidden" name="name" value=""""),_display_(/*92.82*/cluster),format.raw/*92.89*/("""">
                                        """),_display_(/*93.42*/b4/*93.44*/.submit('class -> "btn btn-outline-warning ops-button")/*93.99*/{_display_(Seq[Any](format.raw/*93.100*/(""" """),format.raw/*93.101*/("""Disable """)))}),format.raw/*93.110*/("""
                                    """)))}),format.raw/*94.38*/("""
                                """)))}/*95.35*/else/*95.40*/{_display_(Seq[Any](format.raw/*95.41*/("""
                                    """),_display_(/*96.38*/b4/*96.40*/.vertical.form(routes.Logkafka.handleEnableConfig(cluster, logkafka_id, log_path))/*96.122*/ { implicit fc =>_display_(Seq[Any](format.raw/*96.139*/("""
                                        """),format.raw/*97.41*/("""<input type="hidden" name="name" value=""""),_display_(/*97.82*/cluster),format.raw/*97.89*/("""">
                                        """),_display_(/*98.42*/b4/*98.44*/.submit('class -> "btn btn-outline-success ops-button")/*98.99*/{_display_(Seq[Any](format.raw/*98.100*/(""" """),format.raw/*98.101*/("""Enable """)))}),format.raw/*98.109*/("""
                                    """)))}),format.raw/*99.38*/("""
                                    """),_display_(/*100.38*/b4/*100.40*/.vertical.form(routes.Logkafka.handleDeleteLogkafka(cluster, logkafka_id, log_path))/*100.124*/ { implicit fc =>_display_(Seq[Any](format.raw/*100.141*/("""
                                        """),format.raw/*101.41*/("""<input type="hidden" name="name" value=""""),_display_(/*101.82*/cluster),format.raw/*101.89*/("""">
                                        """),_display_(/*102.42*/b4/*102.44*/.submit('class -> "btn btn-outline-danger ops-button")/*102.98*/{_display_(Seq[Any](format.raw/*102.99*/(""" """),format.raw/*102.100*/("""Delete """)))}),format.raw/*102.108*/("""
                                    """)))}),format.raw/*103.38*/("""
                                """)))}),format.raw/*104.34*/("""
                            """)))}/*105.30*/.getOrElse/*105.40*/{_display_(Seq[Any](format.raw/*105.41*/("""<td> </td>""")))}),format.raw/*105.52*/("""
                        """)))}/*106.26*/.getOrElse/*106.36*/{_display_(Seq[Any](format.raw/*106.37*/("""<td> </td>""")))}),format.raw/*106.48*/("""
                    """),format.raw/*107.21*/("""</div>
                </td>

                </tr>
            """)))}),format.raw/*111.14*/("""
        """)))}/*112.10*/.getOrElse/*112.20*/{}),format.raw/*112.22*/("""
    """)))}),format.raw/*113.6*/("""
    """),format.raw/*114.5*/("""</tbody>
</table>
"""))
      }
    }
  }

  def render(cluster:String,logkafkas:IndexedSeq[scala.Tuple2[scala.Tuple2[String, Option[kafka.manager.model.ActorModel.LogkafkaIdentity]], Boolean]],messages:play.api.i18n.Messages,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(cluster,logkafkas)(messages,request)

  def f:((String,IndexedSeq[scala.Tuple2[scala.Tuple2[String, Option[kafka.manager.model.ActorModel.LogkafkaIdentity]], Boolean]]) => (play.api.i18n.Messages,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (cluster,logkafkas) => (messages,request) => apply(cluster,logkafkas)(messages,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/logkafka/logkafkaListContent.scala.html
                  HASH: cb39caaf8173808163f686bba0f0bd2e7dd0f952
                  MATRIX: 1011->115|1268->302|1316->339|1342->356|1438->375|1470->381|1487->389|1502->395|1512->406|1539->424|1579->426|1611->449|1629->458|1653->467|1678->472|1704->489|1824->532|1856->538|1873->546|1904->549|1918->553|1931->558|1961->560|1987->563|2012->568|2027->575|2125->596|2157->602|2261->685|2301->300|2328->337|2356->469|2385->565|2414->687|2443->689|2763->983|2840->1044|2880->1046|2917->1056|2942->1072|2955->1076|3000->1083|3041->1097|3095->1135|3135->1137|3180->1155|3224->1178|3269->1195|3328->1227|3397->1275|3456->1307|3471->1313|3542->1363|3572->1366|3600->1373|3677->1423|3709->1434|3738->1435|3789->1459|3800->1461|3816->1468|3861->1475|3910->1496|3942->1501|3971->1509|4013->1532|4032->1542|4071->1543|4113->1554|4159->1573|4170->1575|4186->1582|4231->1589|4280->1611|4290->1612|4319->1632|4364->1639|4417->1664|4449->1669|4471->1670|4517->1697|4536->1707|4575->1708|4662->1764|4699->1782|4718->1792|4757->1793|4806->1814|4846->1827|4928->1888|4982->1915|5080->1991|5130->2013|5184->2036|5230->2055|5241->2057|5257->2064|5302->2071|5351->2093|5361->2094|5402->2126|5447->2133|5500->2158|5532->2163|5570->2180|5616->2207|5635->2217|5674->2218|5716->2229|5753->2247|5772->2257|5811->2258|5853->2269|5899->2288|5910->2290|5926->2297|5971->2304|6020->2326|6030->2327|6056->2344|6101->2351|6154->2376|6186->2381|6208->2382|6254->2409|6273->2419|6312->2420|6354->2431|6391->2449|6410->2459|6449->2460|6491->2471|6537->2490|6548->2492|6564->2499|6609->2506|6658->2528|6668->2529|6696->2548|6741->2555|6794->2580|6826->2585|6848->2586|6894->2613|6913->2623|6952->2624|6994->2635|7031->2653|7050->2663|7089->2664|7131->2675|7177->2694|7188->2696|7204->2703|7249->2710|7298->2732|7308->2733|7337->2753|7382->2760|7435->2785|7476->2799|7523->2825|7553->2828|7575->2829|7621->2856|7640->2866|7679->2867|7721->2878|7758->2896|7777->2906|7816->2907|7858->2918|7904->2937|7915->2939|7931->2946|7976->2953|8025->2975|8035->2976|8061->2993|8106->3000|8159->3025|8191->3030|8213->3031|8259->3058|8278->3068|8317->3069|8359->3080|8396->3098|8415->3108|8454->3109|8496->3120|8542->3138|8680->3249|8691->3251|8707->3258|8752->3265|8809->3295|8819->3296|8845->3313|8896->3326|8957->3360|8987->3381|9027->3383|9092->3420|9129->3430|9144->3436|9220->3490|9354->3597|9365->3599|9458->3682|9514->3699|9583->3740|9651->3781|9679->3788|9750->3832|9761->3834|9825->3889|9865->3890|9895->3891|9936->3900|10005->3938|10058->3973|10071->3978|10110->3979|10175->4017|10186->4019|10278->4101|10334->4118|10403->4159|10471->4200|10499->4207|10570->4251|10581->4253|10645->4308|10685->4309|10715->4310|10755->4318|10824->4356|10890->4394|10902->4396|10997->4480|11054->4497|11124->4538|11193->4579|11222->4586|11294->4630|11306->4632|11370->4686|11410->4687|11441->4688|11482->4696|11552->4734|11618->4768|11668->4798|11688->4808|11728->4809|11771->4820|11817->4846|11837->4856|11877->4857|11920->4868|11970->4889|12067->4954|12097->4964|12117->4974|12141->4976|12178->4982|12211->4987
                  LINES: 24->5|28->8|30->10|30->10|32->10|33->11|33->11|33->11|33->12|33->12|33->12|33->13|33->13|33->14|34->17|34->17|36->17|37->18|37->18|37->18|37->18|37->18|37->18|37->18|38->21|38->21|40->21|41->22|41->22|43->7|44->9|45->15|47->19|49->23|51->25|56->30|56->30|56->30|57->31|57->31|57->31|57->31|58->32|58->32|58->32|59->33|59->33|60->34|61->35|61->35|62->36|62->36|62->36|62->36|62->36|65->39|65->39|65->39|67->41|67->41|67->41|67->41|68->42|68->42|68->42|69->43|69->43|69->43|69->43|71->45|71->45|71->45|71->45|72->46|72->46|72->46|72->46|73->47|73->47|73->47|74->48|74->48|74->48|74->48|75->49|75->49|75->49|76->50|76->50|76->50|77->51|77->51|78->52|79->53|81->55|81->55|81->55|81->55|82->56|82->56|82->56|82->56|83->57|83->57|83->57|84->58|84->58|84->58|84->58|85->59|85->59|85->59|85->59|87->61|87->61|87->61|87->61|88->62|88->62|88->62|88->62|89->63|89->63|89->63|90->64|90->64|90->64|90->64|91->65|91->65|91->65|91->65|93->67|93->67|93->67|93->67|94->68|94->68|94->68|94->68|95->69|95->69|95->69|96->70|96->70|96->70|96->70|97->71|97->71|97->71|97->71|99->73|99->73|99->73|99->73|100->74|100->74|100->74|100->74|101->75|101->75|101->75|101->75|101->75|102->76|102->76|102->76|102->76|103->77|103->77|103->77|103->77|105->79|105->79|105->79|105->79|106->80|106->80|106->80|106->80|107->81|107->81|107->81|108->82|108->82|108->82|108->82|109->83|109->83|109->83|109->83|111->85|113->87|113->87|113->87|113->87|114->88|114->88|114->88|114->88|115->89|115->89|115->89|116->90|116->90|116->90|116->90|117->91|117->91|117->91|117->91|118->92|118->92|118->92|119->93|119->93|119->93|119->93|119->93|119->93|120->94|121->95|121->95|121->95|122->96|122->96|122->96|122->96|123->97|123->97|123->97|124->98|124->98|124->98|124->98|124->98|124->98|125->99|126->100|126->100|126->100|126->100|127->101|127->101|127->101|128->102|128->102|128->102|128->102|128->102|128->102|129->103|130->104|131->105|131->105|131->105|131->105|132->106|132->106|132->106|132->106|133->107|137->111|138->112|138->112|138->112|139->113|140->114
                  -- GENERATED --
              */
          