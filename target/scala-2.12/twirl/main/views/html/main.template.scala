
package views.html

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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,Html,Html,Html,Html,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(title: String, menu: Html, breadcrumbs: Html = Html(""), scripts: Html = Html(""))(content: Html)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.1*/("""
"""),format.raw/*7.1*/("""<!DOCTYPE html>
<html>
<head>
    <title>"""),_display_(/*10.13*/title),format.raw/*10.18*/("""</title>
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*11.55*/routes/*11.61*/.Assets.at("images/favicon.png")),format.raw/*11.93*/("""">
    <link rel='stylesheet' href='"""),_display_(/*12.35*/routes/*12.41*/.Assets.at("lib/bootstrap/css/bootstrap.min.css").relative),format.raw/*12.99*/("""'>
    <script>
    """),_display_(/*14.6*/{
    //@Html(org.webjars.RequireJS.getSetupJavaScript(routes.WebJarAssets.at("").url))
}),format.raw/*16.2*/("""
    """),format.raw/*17.5*/("""</script>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*18.50*/routes/*18.56*/.Assets.at("stylesheets/index.min.css")),format.raw/*18.95*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*19.50*/routes/*19.56*/.Assets.at("dataTables/stylesheets/dataTables.bootstrap4.css")),format.raw/*19.118*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*20.50*/routes/*20.56*/.Assets.at("chartist/stylesheets/chartist.min.css")),format.raw/*20.107*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*21.50*/routes/*21.56*/.Assets.at("lib/octicons/build/font/octicons.min.css")),format.raw/*21.110*/("""">
    <script src=""""),_display_(/*22.19*/routes/*22.25*/.Assets.at("chartist/javascripts/chartist.min.js")),format.raw/*22.75*/(""""></script>
</head>
<body role="document">

"""),_display_(/*26.2*/menu),format.raw/*26.6*/("""

"""),format.raw/*28.1*/("""<div class="container-fluid" role="main">
"""),_display_(/*29.2*/breadcrumbs),format.raw/*29.13*/("""
"""),_display_(/*30.2*/content),format.raw/*30.9*/("""
"""),format.raw/*31.1*/("""</div>

<script src=""""),_display_(/*33.15*/routes/*33.21*/.Assets.at("lib/jquery/jquery.js")),format.raw/*33.55*/(""""></script>
<script src=""""),_display_(/*34.15*/routes/*34.21*/.Assets.at("lib/bootstrap/js/bootstrap.min.js")),format.raw/*34.68*/(""""></script>
<script src=""""),_display_(/*35.15*/routes/*35.21*/.Assets.at("dataTables/javascripts/jquery.dataTables.min.js")),format.raw/*35.82*/(""""></script>
<script src=""""),_display_(/*36.15*/routes/*36.21*/.Assets.at("dataTables/javascripts/dataTables.bootstrap4.js")),format.raw/*36.82*/(""""></script>

<script>
    function goBack() """),format.raw/*39.23*/("""{"""),format.raw/*39.24*/("""
        """),format.raw/*40.9*/("""window.history.back()
    """),format.raw/*41.5*/("""}"""),format.raw/*41.6*/("""

    """),format.raw/*43.5*/("""function checkBoxSelect(idPrefix, booleanValue, display) """),format.raw/*43.62*/("""{"""),format.raw/*43.63*/("""
        """),format.raw/*44.9*/("""$("[id^="+idPrefix+"]").prop("checked",booleanValue);
    """),format.raw/*45.5*/("""}"""),format.raw/*45.6*/("""

    """),format.raw/*47.5*/("""function selectBySubname(selectId, selectClass, display) """),format.raw/*47.62*/("""{"""),format.raw/*47.63*/("""
        """),format.raw/*48.9*/("""var subname = $(selectId).val().toLowerCase();
        $('.' + selectClass).not("[name*='" + subname + "']").css("display", "none");
        $("[class='"+selectClass+"'][name*='"+subname+"']").css("display", display);
        if (subname == "") """),format.raw/*51.28*/("""{"""),format.raw/*51.29*/("""
            """),format.raw/*52.13*/("""$('.' + selectClass).css("display", display);
        """),format.raw/*53.9*/("""}"""),format.raw/*53.10*/("""
    """),format.raw/*54.5*/("""}"""),format.raw/*54.6*/("""

    """),format.raw/*56.5*/("""function disableSubmission() """),format.raw/*56.34*/("""{"""),format.raw/*56.35*/("""
        """),format.raw/*57.9*/("""$('[type=submit]').prop('disabled', true);
        $('[type=submit]').removeAttr('type');
    """),format.raw/*59.5*/("""}"""),format.raw/*59.6*/("""
"""),format.raw/*60.1*/("""</script>
"""),_display_(/*61.2*/scripts),format.raw/*61.9*/("""
"""),format.raw/*62.1*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,menu:Html,breadcrumbs:Html,scripts:Html,content:Html,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(title,menu,breadcrumbs,scripts)(content)(request)

  def f:((String,Html,Html,Html) => (Html) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (title,menu,breadcrumbs,scripts) => (content) => (request) => apply(title,menu,breadcrumbs,scripts)(content)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/main.scala.html
                  HASH: 1b9e5e2df2c95211ac718eeddcf36bbe6e507774
                  MATRIX: 871->115|1096->247|1123->248|1192->290|1218->295|1308->358|1323->364|1376->396|1440->433|1455->439|1534->497|1581->518|1690->607|1722->612|1808->671|1823->677|1883->716|1962->768|1977->774|2061->836|2140->888|2155->894|2228->945|2307->997|2322->1003|2398->1057|2446->1078|2461->1084|2532->1134|2603->1179|2627->1183|2656->1185|2725->1228|2757->1239|2785->1241|2812->1248|2840->1249|2889->1271|2904->1277|2959->1311|3012->1337|3027->1343|3095->1390|3148->1416|3163->1422|3245->1483|3298->1509|3313->1515|3395->1576|3467->1620|3496->1621|3532->1630|3585->1656|3613->1657|3646->1663|3731->1720|3760->1721|3796->1730|3881->1788|3909->1789|3942->1795|4027->1852|4056->1853|4092->1862|4365->2107|4394->2108|4435->2121|4516->2175|4545->2176|4577->2181|4605->2182|4638->2188|4695->2217|4724->2218|4760->2227|4881->2321|4909->2322|4937->2323|4974->2334|5001->2341|5029->2342
                  LINES: 24->5|29->6|30->7|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|37->14|39->16|40->17|41->18|41->18|41->18|42->19|42->19|42->19|43->20|43->20|43->20|44->21|44->21|44->21|45->22|45->22|45->22|49->26|49->26|51->28|52->29|52->29|53->30|53->30|54->31|56->33|56->33|56->33|57->34|57->34|57->34|58->35|58->35|58->35|59->36|59->36|59->36|62->39|62->39|63->40|64->41|64->41|66->43|66->43|66->43|67->44|68->45|68->45|70->47|70->47|70->47|71->48|74->51|74->51|75->52|76->53|76->53|77->54|77->54|79->56|79->56|79->56|80->57|82->59|82->59|83->60|84->61|84->61|85->62
                  -- GENERATED --
              */
          