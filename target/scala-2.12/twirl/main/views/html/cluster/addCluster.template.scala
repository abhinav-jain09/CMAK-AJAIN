
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

object addCluster extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[kafka.manager.model.ClusterConfig],play.api.i18n.Messages,models.navigation.Menus,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(addClusterForm: Form[kafka.manager.model.ClusterConfig])(implicit messages: play.api.i18n.Messages, menus: models.navigation.Menus, request:RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*7.2*/import controllers.routes

def /*9.2*/theMenu/*9.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.13*/("""
    """),_display_(/*10.6*/views/*10.11*/.html.navigation.defaultMenu(views.html.navigation.menuNav("Cluster","Add Cluster",menus.indexMenu))),format.raw/*10.111*/("""
""")))};def /*13.2*/checkboxWithLink/*13.18*/(field: play.api.data.Field)(implicit fc: b4.B4FieldConstructor, msgsProv: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.114*/("""
"""),_display_(/*14.2*/b4/*14.4*/.inputFormGroup(field, withLabelFor = false, views.html.bs.Args.withDefault(Seq(), 'disabled -> false))/*14.107*/ { fieldInfo =>_display_(Seq[Any](format.raw/*14.122*/("""
"""),format.raw/*15.1*/("""<div class="checkbox">
    <label for=""""),_display_(/*16.18*/fieldInfo/*16.27*/.id),format.raw/*16.30*/("""">
        <input type="checkbox" id=""""),_display_(/*17.37*/fieldInfo/*17.46*/.id),format.raw/*17.49*/("""" name=""""),_display_(/*17.58*/fieldInfo/*17.67*/.name),format.raw/*17.72*/("""" value="true" """),_display_(/*17.88*/if(fieldInfo.value == Some("true"))/*17.123*/{_display_(Seq[Any](format.raw/*17.124*/("""checked""")))}),format.raw/*17.132*/(""" """),_display_(/*17.134*/toHtmlArgs(fieldInfo.innerArgsMap)),format.raw/*17.168*/(""">
        Display Broker and Topic Size (only works after applying <a href="https://issues.apache.org/jira/browse/KAFKA-1614">this patch</a>)
    </label>
</div>
""")))}),format.raw/*21.2*/("""
""")))};def /*24.2*/drawForm/*24.10*/(form : Form[kafka.manager.model.ClusterConfig]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*24.62*/("""
    """),_display_(/*25.6*/b4/*25.8*/.vertical.form(routes.Cluster.handleAddCluster.copy(url = routes.Cluster.handleAddCluster.relative))/*25.108*/ { implicit fc =>_display_(Seq[Any](format.raw/*25.125*/("""
    """),format.raw/*26.5*/("""<fieldset>
        """),_display_(/*27.10*/b4/*27.12*/.text(form("name"), '_label -> "Cluster Name", 'placeholder -> "", 'autofocus -> true )),format.raw/*27.99*/("""
        """),_display_(/*28.10*/b4/*28.12*/.text(form("zkHosts"), '_label -> "Cluster Zookeeper Hosts", 'placeholder -> "zk1:2181,zk2:2181,zk3:2181/NAMESPACE")),format.raw/*28.128*/("""
        """),_display_(/*29.10*/b4/*29.12*/.select( form("kafkaVersion"), options = kafka.manager.model.KafkaVersion.formSelectList, '_label -> "Kafka Version" )),format.raw/*29.130*/("""
        """),_display_(/*30.10*/b4/*30.12*/.checkbox(form("jmxEnabled"), '_text -> "Enable JMX Polling (Set JMX_PORT env variable before starting kafka server)")),format.raw/*30.130*/("""
        """),_display_(/*31.10*/b4/*31.12*/.text(form("jmxUser"), '_label -> "JMX Auth Username")),format.raw/*31.66*/("""
        """),_display_(/*32.10*/b4/*32.12*/.text(form("jmxPass"), '_label -> "JMX Auth Password")),format.raw/*32.66*/("""
        """),_display_(/*33.10*/b4/*33.12*/.checkbox(form("jmxSsl"), '_text -> "JMX with SSL")),format.raw/*33.63*/("""
        """),_display_(/*34.10*/b4/*34.12*/.checkbox(form("logkafkaEnabled"), '_text -> "Enable Logkafka")),format.raw/*34.75*/("""
        """),_display_(/*35.10*/b4/*35.12*/.checkbox(form("pollConsumers"), '_text -> "Poll consumer information (Not recommended for large # of consumers if ZK is used for offsets tracking on older Kafka versions)")),format.raw/*35.185*/("""
        """),_display_(/*36.10*/b4/*36.12*/.checkbox(form("filterConsumers"), '_text -> "Filter out inactive consumers")),format.raw/*36.89*/("""
        """),_display_(/*37.10*/b4/*37.12*/.checkbox(form("activeOffsetCacheEnabled"), '_text -> "Enable Active OffsetCache (Not recommended for large # of consumers)")),format.raw/*37.137*/("""
        """),_display_(/*38.10*/checkboxWithLink(form("displaySizeEnabled"))),format.raw/*38.54*/("""
        """),_display_(/*39.10*/b4/*39.12*/.number(form("tuning.brokerViewUpdatePeriodSeconds"), '_label -> "brokerViewUpdatePeriodSeconds")),format.raw/*39.109*/("""
        """),_display_(/*40.10*/b4/*40.12*/.number(form("tuning.clusterManagerThreadPoolSize"), '_label -> "clusterManagerThreadPoolSize")),format.raw/*40.107*/("""
        """),_display_(/*41.10*/b4/*41.12*/.number(form("tuning.clusterManagerThreadPoolQueueSize"), '_label -> "clusterManagerThreadPoolQueueSize")),format.raw/*41.117*/("""
        """),_display_(/*42.10*/b4/*42.12*/.number(form("tuning.kafkaCommandThreadPoolSize"), '_label -> "kafkaCommandThreadPoolSize")),format.raw/*42.103*/("""
        """),_display_(/*43.10*/b4/*43.12*/.number(form("tuning.kafkaCommandThreadPoolQueueSize"), '_label -> "kafkaCommandThreadPoolQueueSize")),format.raw/*43.113*/("""
        """),_display_(/*44.10*/b4/*44.12*/.number(form("tuning.logkafkaCommandThreadPoolSize"), '_label -> "logkafkaCommandThreadPoolSize")),format.raw/*44.109*/("""
        """),_display_(/*45.10*/b4/*45.12*/.number(form("tuning.logkafkaCommandThreadPoolQueueSize"), '_label -> "logkafkaCommandThreadPoolQueueSize")),format.raw/*45.119*/("""
        """),_display_(/*46.10*/b4/*46.12*/.number(form("tuning.logkafkaUpdatePeriodSeconds"), '_label -> "logkafkaUpdatePeriodSeconds")),format.raw/*46.105*/("""
        """),_display_(/*47.10*/b4/*47.12*/.number(form("tuning.partitionOffsetCacheTimeoutSecs"), '_label -> "partitionOffsetCacheTimeoutSecs")),format.raw/*47.113*/("""
        """),_display_(/*48.10*/b4/*48.12*/.number(form("tuning.brokerViewThreadPoolSize"), '_label -> "brokerViewThreadPoolSize")),format.raw/*48.99*/("""
        """),_display_(/*49.10*/b4/*49.12*/.number(form("tuning.brokerViewThreadPoolQueueSize"), '_label -> "brokerViewThreadPoolQueueSize")),format.raw/*49.109*/("""
        """),_display_(/*50.10*/b4/*50.12*/.number(form("tuning.offsetCacheThreadPoolSize"), '_label -> "offsetCacheThreadPoolSize")),format.raw/*50.101*/("""
        """),_display_(/*51.10*/b4/*51.12*/.number(form("tuning.offsetCacheThreadPoolQueueSize"), '_label -> "offsetCacheThreadPoolQueueSize")),format.raw/*51.111*/("""
        """),_display_(/*52.10*/b4/*52.12*/.number(form("tuning.kafkaAdminClientThreadPoolSize"), '_label -> "kafkaAdminClientThreadPoolSize")),format.raw/*52.111*/("""
        """),_display_(/*53.10*/b4/*53.12*/.number(form("tuning.kafkaAdminClientThreadPoolQueueSize"), '_label -> "kafkaAdminClientThreadPoolQueueSize")),format.raw/*53.121*/("""
        """),_display_(/*54.10*/b4/*54.12*/.number(form("tuning.kafkaManagedOffsetMetadataCheckMillis"), '_label -> "kafkaManagedOffsetMetadataCheckMillis")),format.raw/*54.125*/("""
        """),_display_(/*55.10*/b4/*55.12*/.number(form("tuning.kafkaManagedOffsetGroupCacheSize"), '_label -> "kafkaManagedOffsetGroupCacheSize")),format.raw/*55.115*/("""
        """),_display_(/*56.10*/b4/*56.12*/.number(form("tuning.kafkaManagedOffsetGroupExpireDays"), '_label -> "kafkaManagedOffsetGroupExpireDays")),format.raw/*56.117*/("""
        """),_display_(/*57.10*/b4/*57.12*/.select(form("securityProtocol"), options = kafka.manager.model.SecurityProtocol.formSelectList, '_label -> "Security Protocol" )),format.raw/*57.141*/("""
        """),_display_(/*58.10*/b4/*58.12*/.select(form("saslMechanism"), options = kafka.manager.model.SASLmechanism.formSelectList, '_label -> "SASL Mechanism (only applies to SASL based security)" )),format.raw/*58.170*/("""
        """),_display_(/*59.10*/b4/*59.12*/.text(form("jaasConfig"), '_label -> "SASL JAAS Config (only applies to SASL based security)")),format.raw/*59.106*/("""
        """),_display_(/*60.10*/b4/*60.12*/.submit('class -> "submit-button btn btn-primary")/*60.62*/{_display_(Seq[Any](format.raw/*60.63*/(""" """),format.raw/*60.64*/("""Save """)))}),format.raw/*60.70*/("""
        """),format.raw/*61.9*/("""<a href=""""),_display_(/*61.19*/routes/*61.25*/.Application.index()),format.raw/*61.45*/("""" class="cancel-button btn btn-secondary" role="button">Cancel</a>
    </fieldset>
    """)))}),format.raw/*63.6*/("""
""")))};
Seq[Any](format.raw/*6.1*/("""
"""),format.raw/*8.1*/("""
"""),format.raw/*11.2*/("""

"""),format.raw/*22.2*/("""

"""),format.raw/*64.2*/("""

"""),_display_(/*66.2*/main("Add Cluster", menu = theMenu, breadcrumbs = views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withView("Add Cluster")))/*66.141*/ {_display_(Seq[Any](format.raw/*66.143*/("""
    """),format.raw/*67.5*/("""<div class="col-md-6 un-pad-me">
        <div class="card">
            <div class="card-header"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="octicon octicon-arrow-left" aria-hidden="true"></span></button>Add Cluster</h3></div>
            <div class="card-body">
                """),_display_(/*71.18*/drawForm(addClusterForm)),format.raw/*71.42*/("""
            """),format.raw/*72.13*/("""</div>
        </div>
        """),_display_(/*74.10*/configReferences()),format.raw/*74.28*/("""
    """),format.raw/*75.5*/("""</div>
""")))}),format.raw/*76.2*/("""

"""))
      }
    }
  }

  def render(addClusterForm:Form[kafka.manager.model.ClusterConfig],messages:play.api.i18n.Messages,menus:models.navigation.Menus,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(addClusterForm)(messages,menus,request)

  def f:((Form[kafka.manager.model.ClusterConfig]) => (play.api.i18n.Messages,models.navigation.Menus,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (addClusterForm) => (messages,menus,request) => apply(addClusterForm)(messages,menus,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/cluster/addCluster.scala.html
                  HASH: 6b4d887f6b7c33bf7a1beb80d847fab275f9e857
                  MATRIX: 945->115|1173->273|1211->301|1225->308|1305->312|1337->318|1351->323|1473->423|1498->428|1523->444|1697->540|1725->542|1735->544|1848->647|1902->662|1930->663|1997->703|2015->712|2039->715|2105->754|2123->763|2147->766|2183->775|2201->784|2227->789|2270->805|2315->840|2355->841|2395->849|2425->851|2481->885|2674->1048|2699->1053|2716->1061|2845->1113|2877->1119|2887->1121|2997->1221|3053->1238|3085->1243|3132->1263|3143->1265|3251->1352|3288->1362|3299->1364|3437->1480|3474->1490|3485->1492|3625->1610|3662->1620|3673->1622|3813->1740|3850->1750|3861->1752|3936->1806|3973->1816|3984->1818|4059->1872|4096->1882|4107->1884|4179->1935|4216->1945|4227->1947|4311->2010|4348->2020|4359->2022|4554->2195|4591->2205|4602->2207|4700->2284|4737->2294|4748->2296|4895->2421|4932->2431|4997->2475|5034->2485|5045->2487|5164->2584|5201->2594|5212->2596|5329->2691|5366->2701|5377->2703|5504->2808|5541->2818|5552->2820|5665->2911|5702->2921|5713->2923|5836->3024|5873->3034|5884->3036|6003->3133|6040->3143|6051->3145|6180->3252|6217->3262|6228->3264|6343->3357|6380->3367|6391->3369|6514->3470|6551->3480|6562->3482|6670->3569|6707->3579|6718->3581|6837->3678|6874->3688|6885->3690|6996->3779|7033->3789|7044->3791|7165->3890|7202->3900|7213->3902|7334->4001|7371->4011|7382->4013|7513->4122|7550->4132|7561->4134|7696->4247|7733->4257|7744->4259|7869->4362|7906->4372|7917->4374|8044->4479|8081->4489|8092->4491|8243->4620|8280->4630|8291->4632|8471->4790|8508->4800|8519->4802|8635->4896|8672->4906|8683->4908|8742->4958|8781->4959|8810->4960|8847->4966|8883->4975|8920->4985|8935->4991|8976->5011|9094->5099|9134->271|9161->299|9189->425|9218->1050|9247->5101|9276->5104|9425->5243|9466->5245|9498->5250|9840->5565|9885->5589|9926->5602|9984->5633|10023->5651|10055->5656|10093->5664
                  LINES: 24->5|27->7|29->9|29->9|31->9|32->10|32->10|32->10|33->13|33->13|35->13|36->14|36->14|36->14|36->14|37->15|38->16|38->16|38->16|39->17|39->17|39->17|39->17|39->17|39->17|39->17|39->17|39->17|39->17|39->17|39->17|43->21|44->24|44->24|46->24|47->25|47->25|47->25|47->25|48->26|49->27|49->27|49->27|50->28|50->28|50->28|51->29|51->29|51->29|52->30|52->30|52->30|53->31|53->31|53->31|54->32|54->32|54->32|55->33|55->33|55->33|56->34|56->34|56->34|57->35|57->35|57->35|58->36|58->36|58->36|59->37|59->37|59->37|60->38|60->38|61->39|61->39|61->39|62->40|62->40|62->40|63->41|63->41|63->41|64->42|64->42|64->42|65->43|65->43|65->43|66->44|66->44|66->44|67->45|67->45|67->45|68->46|68->46|68->46|69->47|69->47|69->47|70->48|70->48|70->48|71->49|71->49|71->49|72->50|72->50|72->50|73->51|73->51|73->51|74->52|74->52|74->52|75->53|75->53|75->53|76->54|76->54|76->54|77->55|77->55|77->55|78->56|78->56|78->56|79->57|79->57|79->57|80->58|80->58|80->58|81->59|81->59|81->59|82->60|82->60|82->60|82->60|82->60|82->60|83->61|83->61|83->61|83->61|85->63|87->6|88->8|89->11|91->22|93->64|95->66|95->66|95->66|96->67|100->71|100->71|101->72|103->74|103->74|104->75|105->76
                  -- GENERATED --
              */
          