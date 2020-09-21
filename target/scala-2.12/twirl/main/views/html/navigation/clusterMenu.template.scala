
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

object clusterMenu extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,String,String,IndexedSeq[models.navigation.Menu],play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(cluster: String, menuTitle: String, menuItem: String, menuList: IndexedSeq[models.navigation.Menu]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.1*/("""
"""),format.raw/*7.1*/("""<header class="navbar navbar-expand navbar-light">
    <nav class="navbar navbar-expand-lg">
        <div class="navbar-header">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <img src=""""),_display_(/*13.24*/routes/*13.30*/.Assets.at("images/favicon.png")),format.raw/*13.62*/("""">
            <a class="navbar-brand un-float-me" href=""""),_display_(/*14.56*/routes/*14.62*/.Application.index()),format.raw/*14.82*/("""">
                CMAK</a><span class="badge badge-primary">"""),_display_(/*15.60*/cluster),format.raw/*15.67*/("""</span>
        </div>
        """),_display_(/*17.10*/menuNav(menuTitle,menuItem,menuList)),format.raw/*17.46*/("""
    """),format.raw/*18.5*/("""</nav>
</header>
"""))
      }
    }
  }

  def render(cluster:String,menuTitle:String,menuItem:String,menuList:IndexedSeq[models.navigation.Menu]): play.twirl.api.HtmlFormat.Appendable = apply(cluster,menuTitle,menuItem,menuList)

  def f:((String,String,String,IndexedSeq[models.navigation.Menu]) => play.twirl.api.HtmlFormat.Appendable) = (cluster,menuTitle,menuItem,menuList) => apply(cluster,menuTitle,menuItem,menuList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/navigation/clusterMenu.scala.html
                  HASH: e221add2c9ebb6f1fc05571a070337549714e371
                  MATRIX: 904->115|1098->216|1125->217|1571->636|1586->642|1639->674|1724->732|1739->738|1780->758|1869->820|1897->827|1956->859|2013->895|2045->900
                  LINES: 24->5|29->6|30->7|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|40->17|40->17|41->18
                  -- GENERATED --
              */
          