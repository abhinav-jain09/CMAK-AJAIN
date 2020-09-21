// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/abhinav/development/CMAK/conf/routes
// @DATE:Mon Sep 21 08:02:49 CEST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:59
package controllers.api.javascript {

  // @LINE:59
  class ReverseKafkaStateCheck(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:61
    def topics: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.KafkaStateCheck.topics",
      """
        function(c0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/topics"})
        }
      """
    )
  
    // @LINE:65
    def unavailablePartitions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.KafkaStateCheck.unavailablePartitions",
      """
        function(c0,t1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("t", t1)) + "/unavailablePartitions"})
        }
      """
    )
  
    // @LINE:62
    def topicIdentities: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.KafkaStateCheck.topicIdentities",
      """
        function(c0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/topicIdentities"})
        }
      """
    )
  
    // @LINE:59
    def brokers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.KafkaStateCheck.brokers",
      """
        function(c0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/brokers"})
        }
      """
    )
  
    // @LINE:68
    def consumersSummaryAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.KafkaStateCheck.consumersSummaryAction",
      """
        function(cluster0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("cluster", cluster0)) + "/consumersSummary"})
        }
      """
    )
  
    // @LINE:64
    def underReplicatedPartitions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.KafkaStateCheck.underReplicatedPartitions",
      """
        function(c0,t1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("t", t1)) + "/underReplicatedPartitions"})
        }
      """
    )
  
    // @LINE:60
    def brokersExtended: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.KafkaStateCheck.brokersExtended",
      """
        function(c0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/brokers/extended"})
        }
      """
    )
  
    // @LINE:66
    def topicSummaryAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.KafkaStateCheck.topicSummaryAction",
      """
        function(cluster0,consumer1,topic2,consumerType3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("cluster", cluster0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("consumer", consumer1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("topic", topic2)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("consumerType", consumerType3)) + "/topicSummary"})
        }
      """
    )
  
    // @LINE:67
    def groupSummaryAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.KafkaStateCheck.groupSummaryAction",
      """
        function(cluster0,consumer1,consumerType2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("cluster", cluster0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("consumer", consumer1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("consumerType", consumerType2)) + "/groupSummary"})
        }
      """
    )
  
    // @LINE:63
    def clusters: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.KafkaStateCheck.clusters",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/status/clusters"})
        }
      """
    )
  
  }


}
