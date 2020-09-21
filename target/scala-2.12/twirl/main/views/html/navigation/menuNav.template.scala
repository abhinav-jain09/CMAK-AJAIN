
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

object menuNav extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,IndexedSeq[models.navigation.Menu],play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(menuTitle: String, menuItem: String, menuList: IndexedSeq[models.navigation.Menu]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*7.2*/import scala.Int; var i = 0;


Seq[Any](format.raw/*6.1*/("""
"""),format.raw/*8.1*/("""
        """),format.raw/*9.9*/("""<div class="navbar-collapse collapse">
            <ul class="navbar-nav mr-auto">
                """),_display_(/*11.18*/menuList/*11.26*/.map/*11.30*/ { m =>_display_(Seq[Any](format.raw/*11.37*/("""
                    """),_display_(/*12.22*/{i = i + 1}),format.raw/*12.33*/("""
                    """),_display_(/*13.22*/if(m.items.isEmpty)/*13.41*/ {_display_(Seq[Any](format.raw/*13.43*/("""
                        """),_display_(/*14.26*/if(m.title == menuTitle)/*14.50*/ {_display_(Seq[Any](format.raw/*14.52*/("""
                            """),format.raw/*15.29*/("""<li class="nav-item active"><a class="nav-link" href=""""),_display_(/*15.84*/m/*15.85*/.route.map(_.toString).getOrElse("#")),format.raw/*15.122*/("""">"""),_display_(/*15.125*/m/*15.126*/.title),format.raw/*15.132*/("""</a></li>
                        """)))}/*16.27*/else/*16.32*/{_display_(Seq[Any](format.raw/*16.33*/("""
                            """),format.raw/*17.29*/("""<li class="nav-item"><a class="nav-link"  href=""""),_display_(/*17.78*/m/*17.79*/.route.map(_.toString).getOrElse("#")),format.raw/*17.116*/("""">"""),_display_(/*17.119*/m/*17.120*/.title),format.raw/*17.126*/("""</a></li>
                        """)))}),format.raw/*18.26*/("""
                    """)))}/*19.23*/else/*19.28*/{_display_(Seq[Any](format.raw/*19.29*/("""
                        """),format.raw/*20.25*/("""<li class="nav-item dropdown">
                            <a href="#" class="nav-link dropdown-toggle" href="#" id=""""),_display_(/*21.88*/i),format.raw/*21.89*/("""" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" >"""),_display_(/*21.159*/m/*21.160*/.title),format.raw/*21.166*/("""<span class="caret"></span></a>
                            <div class="dropdown-menu" aria-labelledby=""""),_display_(/*22.74*/i),format.raw/*22.75*/("""">
                            """),_display_(/*23.30*/m/*23.31*/.items.map/*23.41*/ { case (item,route) =>_display_(Seq[Any](format.raw/*23.64*/("""
                                """),_display_(/*24.34*/if(m.title == menuTitle && item == menuItem)/*24.78*/ {_display_(Seq[Any](format.raw/*24.80*/("""
                                    """),format.raw/*25.37*/("""<a class="dropdown-item active" href=""""),_display_(/*25.76*/route/*25.81*/.toString),format.raw/*25.90*/("""">"""),_display_(/*25.93*/item),format.raw/*25.97*/("""</a>
                                """)))}/*26.35*/else/*26.40*/{_display_(Seq[Any](format.raw/*26.41*/("""
                                    """),format.raw/*27.37*/("""<a class="dropdown-item" href=""""),_display_(/*27.69*/route/*27.74*/.toString),format.raw/*27.83*/("""">"""),_display_(/*27.86*/item),format.raw/*27.90*/("""</a>
                                """)))}),format.raw/*28.34*/("""
                            """)))}),format.raw/*29.30*/("""
                            """),format.raw/*30.29*/("""</div>
                        </li>
                    """)))}),format.raw/*32.22*/("""
                """)))}),format.raw/*33.18*/("""
            """),format.raw/*34.13*/("""</ul>
        </div>
"""))
      }
    }
  }

  def render(menuTitle:String,menuItem:String,menuList:IndexedSeq[models.navigation.Menu]): play.twirl.api.HtmlFormat.Appendable = apply(menuTitle,menuItem,menuList)

  def f:((String,String,IndexedSeq[models.navigation.Menu]) => play.twirl.api.HtmlFormat.Appendable) = (menuTitle,menuItem,menuList) => apply(menuTitle,menuItem,menuList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:50 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/navigation/menuNav.scala.html
                  HASH: d500b5060995d8deeda06cce089c3ef322bd3140
                  MATRIX: 893->115|1049->201|1106->199|1133->230|1168->239|1295->339|1312->347|1325->351|1370->358|1419->380|1451->391|1500->413|1528->432|1568->434|1621->460|1654->484|1694->486|1751->515|1833->570|1843->571|1902->608|1933->611|1944->612|1972->618|2026->654|2039->659|2078->660|2135->689|2211->738|2221->739|2280->776|2311->779|2322->780|2350->786|2416->821|2457->844|2470->849|2509->850|2562->875|2707->993|2729->994|2827->1064|2838->1065|2866->1071|2998->1176|3020->1177|3079->1209|3089->1210|3108->1220|3169->1243|3230->1277|3283->1321|3323->1323|3388->1360|3454->1399|3468->1404|3498->1413|3528->1416|3553->1420|3610->1459|3623->1464|3662->1465|3727->1502|3786->1534|3800->1539|3830->1548|3860->1551|3885->1555|3954->1593|4015->1623|4072->1652|4161->1710|4210->1728|4251->1741
                  LINES: 24->5|27->7|30->6|31->8|32->9|34->11|34->11|34->11|34->11|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|38->15|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|40->17|40->17|40->17|40->17|41->18|42->19|42->19|42->19|43->20|44->21|44->21|44->21|44->21|44->21|45->22|45->22|46->23|46->23|46->23|46->23|47->24|47->24|47->24|48->25|48->25|48->25|48->25|48->25|48->25|49->26|49->26|49->26|50->27|50->27|50->27|50->27|50->27|50->27|51->28|52->29|53->30|55->32|56->33|57->34
                  -- GENERATED --
              */
          