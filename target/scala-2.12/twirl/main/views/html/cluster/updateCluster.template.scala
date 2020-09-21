
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
/*5.2*/import scalaz.{\/}

object updateCluster extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,$bslash$div[kafka.manager.ApiError, Form[models.form.ClusterOperation]],RequestHeader,play.api.i18n.Messages,models.navigation.Menus,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(clusterName: String, errorOrForm: kafka.manager.ApiError \/ Form[models.form.ClusterOperation]
)(implicit request: RequestHeader, messages: play.api.i18n.Messages, menus: models.navigation.Menus):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*9.2*/import controllers.routes

def /*11.2*/theMenu/*11.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*11.13*/("""
    """),_display_(/*12.6*/views/*12.11*/.html.navigation.defaultMenu(views.html.navigation.menuNav("Cluster","Update Cluster",menus.indexMenu))),format.raw/*12.114*/("""
""")))};def /*15.2*/checkboxWithLink/*15.18*/(field: play.api.data.Field)(implicit fc: b4.B4FieldConstructor, msgsProv: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*15.114*/("""
"""),_display_(/*16.2*/b4/*16.4*/.inputFormGroup(field, withLabelFor = false, views.html.bs.Args.withDefault(Seq(), 'disabled -> false))/*16.107*/ { fieldInfo =>_display_(Seq[Any](format.raw/*16.122*/("""
"""),format.raw/*17.1*/("""<div class="checkbox">
    <label for=""""),_display_(/*18.18*/fieldInfo/*18.27*/.id),format.raw/*18.30*/("""">
        <input type="checkbox" id=""""),_display_(/*19.37*/fieldInfo/*19.46*/.id),format.raw/*19.49*/("""" name=""""),_display_(/*19.58*/fieldInfo/*19.67*/.name),format.raw/*19.72*/("""" value="true" """),_display_(/*19.88*/if(fieldInfo.value == Some("true"))/*19.123*/{_display_(Seq[Any](format.raw/*19.124*/("""checked""")))}),format.raw/*19.132*/(""" """),_display_(/*19.134*/toHtmlArgs(fieldInfo.innerArgsMap)),format.raw/*19.168*/(""">
        Display Broker and Topic Size (only works after applying <a href="https://issues.apache.org/jira/browse/KAFKA-1614">this patch</a>)
    </label>
</div>
""")))}),format.raw/*23.2*/("""
""")))};def /*26.2*/drawForm/*26.10*/(form : Form[models.form.ClusterOperation]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*26.57*/("""
    """),_display_(/*27.6*/b4/*27.8*/.vertical.form(routes.Cluster.handleUpdateCluster(clusterName))/*27.71*/ { implicit fc =>_display_(Seq[Any](format.raw/*27.88*/("""
    """),format.raw/*28.5*/("""<fieldset>
        <input type="hidden" name="operation" value="Update">
        <input type="hidden" name="name" value=""""),_display_(/*30.50*/clusterName),format.raw/*30.61*/("""">
        """),_display_(/*31.10*/b4/*31.12*/.text(form("zkHosts"), '_label -> "Cluster Zookeeper Hosts", 'placeholder -> "zk1:2181,zk2:2181,zk3:2181/NAMESPACE", 'autoFocus -> true)),format.raw/*31.148*/("""
        """),_display_(/*32.10*/b4/*32.12*/.select( form("kafkaVersion"), options = kafka.manager.model.KafkaVersion.formSelectList, '_label -> "Kafka Version" )),format.raw/*32.130*/("""
        """),_display_(/*33.10*/b4/*33.12*/.checkbox(form("jmxEnabled"), '_text -> "Enable JMX Polling (Set JMX_PORT env variable before starting kafka server)")),format.raw/*33.130*/("""
        """),_display_(/*34.10*/b4/*34.12*/.text(form("jmxUser"), '_label -> "JMX Auth Username")),format.raw/*34.66*/("""
        """),_display_(/*35.10*/b4/*35.12*/.text(form("jmxPass"), '_label -> "JMX Auth Password")),format.raw/*35.66*/("""
        """),_display_(/*36.10*/b4/*36.12*/.checkbox(form("jmxSsl"), '_text -> "JMX with SSL")),format.raw/*36.63*/("""
        """),_display_(/*37.10*/b4/*37.12*/.checkbox(form("pollConsumers"), '_text -> "Poll consumer information (Not recommended for large # of consumers if ZK is used for offsets tracking on older Kafka versions)")),format.raw/*37.185*/("""
        """),_display_(/*38.10*/b4/*38.12*/.checkbox(form("filterConsumers"), '_text -> "Filter out inactive consumers")),format.raw/*38.89*/("""
        """),_display_(/*39.10*/b4/*39.12*/.checkbox(form("logkafkaEnabled"), '_text -> "Enable Logkafka")),format.raw/*39.75*/("""
        """),_display_(/*40.10*/b4/*40.12*/.checkbox(form("activeOffsetCacheEnabled"), '_text -> "Enable Active OffsetCache (Not recommended for large # of consumers)")),format.raw/*40.137*/("""
        """),_display_(/*41.10*/checkboxWithLink(form("displaySizeEnabled"))),format.raw/*41.54*/("""
        """),_display_(/*42.10*/b4/*42.12*/.number(form("tuning.brokerViewUpdatePeriodSeconds"), '_label -> "brokerViewUpdatePeriodSeconds")),format.raw/*42.109*/("""
        """),_display_(/*43.10*/b4/*43.12*/.number(form("tuning.clusterManagerThreadPoolSize"), '_label -> "clusterManagerThreadPoolSize")),format.raw/*43.107*/("""
        """),_display_(/*44.10*/b4/*44.12*/.number(form("tuning.clusterManagerThreadPoolQueueSize"), '_label -> "clusterManagerThreadPoolQueueSize")),format.raw/*44.117*/("""
        """),_display_(/*45.10*/b4/*45.12*/.number(form("tuning.kafkaCommandThreadPoolSize"), '_label -> "kafkaCommandThreadPoolSize")),format.raw/*45.103*/("""
        """),_display_(/*46.10*/b4/*46.12*/.number(form("tuning.kafkaCommandThreadPoolQueueSize"), '_label -> "kafkaCommandThreadPoolQueueSize")),format.raw/*46.113*/("""
        """),_display_(/*47.10*/b4/*47.12*/.number(form("tuning.logkafkaCommandThreadPoolSize"), '_label -> "logkafkaCommandThreadPoolSize")),format.raw/*47.109*/("""
        """),_display_(/*48.10*/b4/*48.12*/.number(form("tuning.logkafkaCommandThreadPoolQueueSize"), '_label -> "logkafkaCommandThreadPoolQueueSize")),format.raw/*48.119*/("""
        """),_display_(/*49.10*/b4/*49.12*/.number(form("tuning.logkafkaUpdatePeriodSeconds"), '_label -> "logkafkaUpdatePeriodSeconds")),format.raw/*49.105*/("""
        """),_display_(/*50.10*/b4/*50.12*/.number(form("tuning.partitionOffsetCacheTimeoutSecs"), '_label -> "partitionOffsetCacheTimeoutSecs")),format.raw/*50.113*/("""
        """),_display_(/*51.10*/b4/*51.12*/.number(form("tuning.brokerViewThreadPoolSize"), '_label -> "brokerViewThreadPoolSize")),format.raw/*51.99*/("""
        """),_display_(/*52.10*/b4/*52.12*/.number(form("tuning.brokerViewThreadPoolQueueSize"), '_label -> "brokerViewThreadPoolQueueSize")),format.raw/*52.109*/("""
        """),_display_(/*53.10*/b4/*53.12*/.number(form("tuning.offsetCacheThreadPoolSize"), '_label -> "offsetCacheThreadPoolSize")),format.raw/*53.101*/("""
        """),_display_(/*54.10*/b4/*54.12*/.number(form("tuning.offsetCacheThreadPoolQueueSize"), '_label -> "offsetCacheThreadPoolQueueSize")),format.raw/*54.111*/("""
        """),_display_(/*55.10*/b4/*55.12*/.number(form("tuning.kafkaAdminClientThreadPoolSize"), '_label -> "kafkaAdminClientThreadPoolSize")),format.raw/*55.111*/("""
        """),_display_(/*56.10*/b4/*56.12*/.number(form("tuning.kafkaAdminClientThreadPoolQueueSize"), '_label -> "kafkaAdminClientThreadPoolQueueSize")),format.raw/*56.121*/("""
        """),_display_(/*57.10*/b4/*57.12*/.number(form("tuning.kafkaManagedOffsetMetadataCheckMillis"), '_label -> "kafkaManagedOffsetMetadataCheckMillis")),format.raw/*57.125*/("""
        """),_display_(/*58.10*/b4/*58.12*/.number(form("tuning.kafkaManagedOffsetGroupCacheSize"), '_label -> "kafkaManagedOffsetGroupCacheSize")),format.raw/*58.115*/("""
        """),_display_(/*59.10*/b4/*59.12*/.number(form("tuning.kafkaManagedOffsetGroupExpireDays"), '_label -> "kafkaManagedOffsetGroupExpireDays")),format.raw/*59.117*/("""
        """),_display_(/*60.10*/b4/*60.12*/.select(form("securityProtocol"), options = kafka.manager.model.SecurityProtocol.formSelectList, '_label -> "Security Protocol" )),format.raw/*60.141*/("""
        """),_display_(/*61.10*/b4/*61.12*/.select(form("saslMechanism"), options = kafka.manager.model.SASLmechanism.formSelectList, '_label -> "SASL Mechanism (only applies to SASL based security)" )),format.raw/*61.170*/("""
        """),_display_(/*62.10*/b4/*62.12*/.text(form("jaasConfig"), '_label -> "SASL JAAS Config (only applies to SASL based security)")),format.raw/*62.106*/("""
        """),_display_(/*63.10*/b4/*63.12*/.submit('class -> "submit-button btn btn-primary btn")/*63.66*/{_display_(Seq[Any](format.raw/*63.67*/(""" """),format.raw/*63.68*/("""Save """)))}),format.raw/*63.74*/("""
        """),format.raw/*64.9*/("""<a href=""""),_display_(/*64.19*/routes/*64.25*/.Application.index()),format.raw/*64.45*/("""" class="cancel-button btn btn-secondary" role="button">Cancel</a>
    </fieldset>
    """)))}),format.raw/*66.6*/("""
""")))};
Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*10.1*/("""
"""),format.raw/*13.2*/("""

"""),format.raw/*24.2*/("""

"""),format.raw/*67.2*/("""

"""),_display_(/*69.2*/main(
    "Update Cluster",
    menu = theMenu,
    breadcrumbs=views.html.navigation.breadCrumbs(models.navigation.BreadCrumbs.withViewAndCluster("Update Cluster",clusterName)))/*72.131*/ {_display_(Seq[Any](format.raw/*72.133*/("""

"""),format.raw/*74.1*/("""<div class="col-md-6 un-pad-me">
    <div class="card">
        <div class="card-header"><h3><button type="button" class="btn btn-link" onclick="goBack()"><span class="octicon octicon-arrow-left" aria-hidden="true"></span></button>Update Cluster</h3></div>
        <div class="card-body">
            """),_display_(/*78.14*/errorOrForm/*78.25*/.fold(views.html.errors.onApiError(_), drawForm(_))),format.raw/*78.76*/("""
        """),format.raw/*79.9*/("""</div>
    </div>
    """),_display_(/*81.6*/configReferences()),format.raw/*81.24*/("""
"""),format.raw/*82.1*/("""</div>

""")))}),format.raw/*84.2*/("""
"""))
      }
    }
  }

  def render(clusterName:String,errorOrForm:$bslash$div[kafka.manager.ApiError, Form[models.form.ClusterOperation]],request:RequestHeader,messages:play.api.i18n.Messages,menus:models.navigation.Menus): play.twirl.api.HtmlFormat.Appendable = apply(clusterName,errorOrForm)(request,messages,menus)

  def f:((String,$bslash$div[kafka.manager.ApiError, Form[models.form.ClusterOperation]]) => (RequestHeader,play.api.i18n.Messages,models.navigation.Menus) => play.twirl.api.HtmlFormat.Appendable) = (clusterName,errorOrForm) => (request,messages,menus) => apply(clusterName,errorOrForm)(request,messages,menus)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/cluster/updateCluster.scala.html
                  HASH: 73cf5739a62dfd4b45cbb932f3f2773caeb523f3
                  MATRIX: 440->115|904->135|1173->334|1212->362|1227->369|1308->373|1340->379|1354->384|1479->487|1504->492|1529->508|1703->604|1731->606|1741->608|1854->711|1908->726|1936->727|2003->767|2021->776|2045->779|2111->818|2129->827|2153->830|2189->839|2207->848|2233->853|2276->869|2321->904|2361->905|2401->913|2431->915|2487->949|2680->1112|2705->1117|2722->1125|2846->1172|2878->1178|2888->1180|2960->1243|3015->1260|3047->1265|3196->1387|3228->1398|3267->1410|3278->1412|3436->1548|3473->1558|3484->1560|3624->1678|3661->1688|3672->1690|3812->1808|3849->1818|3860->1820|3935->1874|3972->1884|3983->1886|4058->1940|4095->1950|4106->1952|4178->2003|4215->2013|4226->2015|4421->2188|4458->2198|4469->2200|4567->2277|4604->2287|4615->2289|4699->2352|4736->2362|4747->2364|4894->2489|4931->2499|4996->2543|5033->2553|5044->2555|5163->2652|5200->2662|5211->2664|5328->2759|5365->2769|5376->2771|5503->2876|5540->2886|5551->2888|5664->2979|5701->2989|5712->2991|5835->3092|5872->3102|5883->3104|6002->3201|6039->3211|6050->3213|6179->3320|6216->3330|6227->3332|6342->3425|6379->3435|6390->3437|6513->3538|6550->3548|6561->3550|6669->3637|6706->3647|6717->3649|6836->3746|6873->3756|6884->3758|6995->3847|7032->3857|7043->3859|7164->3958|7201->3968|7212->3970|7333->4069|7370->4079|7381->4081|7512->4190|7549->4200|7560->4202|7695->4315|7732->4325|7743->4327|7868->4430|7905->4440|7916->4442|8043->4547|8080->4557|8091->4559|8242->4688|8279->4698|8290->4700|8470->4858|8507->4868|8518->4870|8634->4964|8671->4974|8682->4976|8745->5030|8784->5031|8813->5032|8850->5038|8886->5047|8923->5057|8938->5063|8979->5083|9097->5171|9137->332|9165->360|9193->489|9222->1114|9251->5173|9280->5176|9468->5354|9509->5356|9538->5358|9867->5660|9887->5671|9959->5722|9995->5731|10044->5754|10083->5772|10111->5773|10150->5782
                  LINES: 17->5|22->6|26->9|28->11|28->11|30->11|31->12|31->12|31->12|32->15|32->15|34->15|35->16|35->16|35->16|35->16|36->17|37->18|37->18|37->18|38->19|38->19|38->19|38->19|38->19|38->19|38->19|38->19|38->19|38->19|38->19|38->19|42->23|43->26|43->26|45->26|46->27|46->27|46->27|46->27|47->28|49->30|49->30|50->31|50->31|50->31|51->32|51->32|51->32|52->33|52->33|52->33|53->34|53->34|53->34|54->35|54->35|54->35|55->36|55->36|55->36|56->37|56->37|56->37|57->38|57->38|57->38|58->39|58->39|58->39|59->40|59->40|59->40|60->41|60->41|61->42|61->42|61->42|62->43|62->43|62->43|63->44|63->44|63->44|64->45|64->45|64->45|65->46|65->46|65->46|66->47|66->47|66->47|67->48|67->48|67->48|68->49|68->49|68->49|69->50|69->50|69->50|70->51|70->51|70->51|71->52|71->52|71->52|72->53|72->53|72->53|73->54|73->54|73->54|74->55|74->55|74->55|75->56|75->56|75->56|76->57|76->57|76->57|77->58|77->58|77->58|78->59|78->59|78->59|79->60|79->60|79->60|80->61|80->61|80->61|81->62|81->62|81->62|82->63|82->63|82->63|82->63|82->63|82->63|83->64|83->64|83->64|83->64|85->66|87->8|88->10|89->13|91->24|93->67|95->69|98->72|98->72|100->74|104->78|104->78|104->78|105->79|107->81|107->81|108->82|110->84
                  -- GENERATED --
              */
          