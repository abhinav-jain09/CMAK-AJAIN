
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

object defaultMenu extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(navHtml: Html = Html("")):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.1*/("""<header class="navbar navbar-expand navbar-light">
    <nav class="navbar navbar-expand-lg">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <img src=""""),_display_(/*11.20*/routes/*11.26*/.Assets.at("images/favicon.png")),format.raw/*11.58*/("""">
        <a class="navbar-brand un-float-me" href=""""),_display_(/*12.52*/routes/*12.58*/.Application.index()),format.raw/*12.78*/("""">
            CMAK</a>
        """),_display_(/*14.10*/navHtml),format.raw/*14.17*/("""
    """),format.raw/*15.5*/("""</nav>
</header>
"""))
      }
    }
  }

  def render(navHtml:Html): play.twirl.api.HtmlFormat.Appendable = apply(navHtml)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (navHtml) => apply(navHtml)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/navigation/defaultMenu.scala.html
                  HASH: 6e78cea9ef4fbd91675e9eb5992fbc133b3c6527
                  MATRIX: 853->115|973->142|1367->509|1382->515|1435->547|1516->601|1531->607|1572->627|1632->660|1660->667|1692->672
                  LINES: 24->5|29->6|34->11|34->11|34->11|35->12|35->12|35->12|37->14|37->14|38->15
                  -- GENERATED --
              */
          