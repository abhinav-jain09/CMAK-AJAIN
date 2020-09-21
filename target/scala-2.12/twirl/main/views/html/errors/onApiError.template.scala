
package views.html.errors

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

object onApiError extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[kafka.manager.ApiError,Option[FollowLink],play.twirl.api.HtmlFormat.Appendable] {

  /*
* Copyright 2015 Yahoo Inc. Licensed under the Apache License, Version 2.0
* See accompanying LICENSE file.
*/
  def apply/*5.2*/(apiError: kafka.manager.ApiError, urlOption: Option[FollowLink] = None):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.1*/("""
"""),format.raw/*7.1*/("""<div class="alert alert-danger" role="alert">
    <strong>Yikes!</strong> """),_display_(/*8.30*/apiError/*8.38*/.msg),format.raw/*8.42*/("""
    """),_display_(/*9.6*/urlOption/*9.15*/.map/*9.19*/ { link =>_display_(Seq[Any](format.raw/*9.29*/("""
    """),format.raw/*10.5*/("""<a href=""""),_display_(/*10.15*/link/*10.19*/.url),format.raw/*10.23*/("""">"""),_display_(/*10.26*/link/*10.30*/.title),format.raw/*10.36*/("""</a>
    """)))}),format.raw/*11.6*/("""
"""),format.raw/*12.1*/("""</div>
"""))
      }
    }
  }

  def render(apiError:kafka.manager.ApiError,urlOption:Option[FollowLink]): play.twirl.api.HtmlFormat.Appendable = apply(apiError,urlOption)

  def f:((kafka.manager.ApiError,Option[FollowLink]) => play.twirl.api.HtmlFormat.Appendable) = (apiError,urlOption) => apply(apiError,urlOption)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 08:02:51 CEST 2020
                  SOURCE: /Users/abhinav/development/CMAK/app/views/errors/onApiError.scala.html
                  HASH: 4e26bc9d8d58a334762930446ba00a08762cf991
                  MATRIX: 885->115|1051->188|1078->189|1179->264|1195->272|1219->276|1250->282|1267->291|1279->295|1326->305|1358->310|1395->320|1408->324|1433->328|1463->331|1476->335|1503->341|1543->351|1571->352
                  LINES: 24->5|29->6|30->7|31->8|31->8|31->8|32->9|32->9|32->9|32->9|33->10|33->10|33->10|33->10|33->10|33->10|33->10|34->11|35->12
                  -- GENERATED --
              */
          