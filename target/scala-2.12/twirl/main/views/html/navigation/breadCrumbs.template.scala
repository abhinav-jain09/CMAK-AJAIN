
package views.html.navigation

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

object breadCrumbs extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[IndexedSeq[models.navigation.BreadCrumbs.BreadCrumbRendered],play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(crumbs: IndexedSeq[models.navigation.BreadCrumbs.BreadCrumbRendered]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*7.2*/import models.navigation.BreadCrumbs._

def /*9.2*/renderLink/*9.12*/(name: String, link: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.44*/("""
"""),format.raw/*10.1*/("""<li class="breadcrumb-item"><a href=""""),_display_(/*10.39*/link),format.raw/*10.43*/("""">"""),_display_(/*10.46*/name),format.raw/*10.50*/("""</a></li>
""")))};def /*13.2*/renderText/*13.12*/(name: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.30*/("""
"""),format.raw/*14.1*/("""<li class="breadcrumb-item">"""),_display_(/*14.30*/name),format.raw/*14.34*/("""</li>
""")))};def /*17.2*/renderActive/*17.14*/(name: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.32*/("""
"""),format.raw/*18.1*/("""<li class="breadcrumb-item active" aria-current="page">"""),_display_(/*18.57*/name),format.raw/*18.61*/("""</li>
""")))};
Seq[Any](format.raw/*6.1*/("""
"""),format.raw/*8.1*/("""
"""),format.raw/*11.2*/("""

"""),format.raw/*15.2*/("""

"""),format.raw/*19.2*/("""


"""),format.raw/*22.1*/("""<nav aria-label="breadcrumb">
<ol class="breadcrumb">
    """),_display_(/*24.6*/crumbs/*24.12*/.map/*24.16*/ {/*25.9*/case BCLink(name, link) =>/*25.35*/  {_display_(Seq[Any](format.raw/*25.38*/(""" """),_display_(/*25.40*/renderLink(name,link)),format.raw/*25.61*/(""" """)))}/*26.9*/case BCText(name) =>/*26.29*/ {_display_(Seq[Any](format.raw/*26.31*/(""" """),_display_(/*26.33*/renderText(name)),format.raw/*26.49*/(""" """)))}/*27.9*/case BCActive(name) =>/*27.31*/ {_display_(Seq[Any](format.raw/*27.33*/(""" """),_display_(/*27.35*/renderActive(name)),format.raw/*27.53*/(""" """)))}}),format.raw/*28.6*/("""
"""),format.raw/*29.1*/("""</ol>
</nav>
"""))
      }
    }
  }

  def render(crumbs:IndexedSeq[models.navigation.BreadCrumbs.BreadCrumbRendered]): play.twirl.api.HtmlFormat.Appendable = apply(crumbs)

  def f:((IndexedSeq[models.navigation.BreadCrumbs.BreadCrumbRendered]) => play.twirl.api.HtmlFormat.Appendable) = (crumbs) => apply(crumbs)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/navigation/breadCrumbs.scala.html
                  HASH: a3ed6b0251358f26e5c86d34e9cb77001212fbfc
                  MATRIX: 909->115|1052->188|1103->229|1121->239|1229->271|1257->272|1322->310|1347->314|1377->317|1402->321|1436->335|1455->345|1550->363|1578->364|1634->393|1659->397|1689->407|1710->419|1805->437|1833->438|1916->494|1941->498|1986->186|2013->227|2041->332|2070->404|2099->505|2129->508|2214->567|2229->573|2242->577|2252->588|2287->614|2328->617|2357->619|2399->640|2419->651|2448->671|2488->673|2517->675|2554->691|2574->702|2605->724|2645->726|2674->728|2713->746|2746->754|2774->755
                  LINES: 24->5|27->7|29->9|29->9|31->9|32->10|32->10|32->10|32->10|32->10|33->13|33->13|35->13|36->14|36->14|36->14|37->17|37->17|39->17|40->18|40->18|40->18|42->6|43->8|44->11|46->15|48->19|51->22|53->24|53->24|53->24|53->25|53->25|53->25|53->25|53->25|53->26|53->26|53->26|53->26|53->26|53->27|53->27|53->27|53->27|53->27|53->28|54->29
                  -- GENERATED --
              */
          