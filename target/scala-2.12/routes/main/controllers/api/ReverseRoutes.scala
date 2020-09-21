// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/abhinav/development/CMAK/conf/routes
// @DATE:Mon Sep 21 08:02:49 CEST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:59
package controllers.api {

  // @LINE:59
  class ReverseKafkaStateCheck(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:61
    def topics(c:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/status/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/topics")
    }
  
    // @LINE:65
    def unavailablePartitions(c:String, t:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/status/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("t", t)) + "/unavailablePartitions")
    }
  
    // @LINE:62
    def topicIdentities(c:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/status/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/topicIdentities")
    }
  
    // @LINE:59
    def brokers(c:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/status/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/brokers")
    }
  
    // @LINE:68
    def consumersSummaryAction(cluster:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/status/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("cluster", cluster)) + "/consumersSummary")
    }
  
    // @LINE:64
    def underReplicatedPartitions(c:String, t:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/status/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("t", t)) + "/underReplicatedPartitions")
    }
  
    // @LINE:60
    def brokersExtended(c:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/status/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/brokers/extended")
    }
  
    // @LINE:66
    def topicSummaryAction(cluster:String, consumer:String, topic:String, consumerType:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/status/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("cluster", cluster)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("consumer", consumer)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("topic", topic)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("consumerType", consumerType)) + "/topicSummary")
    }
  
    // @LINE:67
    def groupSummaryAction(cluster:String, consumer:String, consumerType:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/status/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("cluster", cluster)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("consumer", consumer)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("consumerType", consumerType)) + "/groupSummary")
    }
  
    // @LINE:63
    def clusters(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/status/clusters")
    }
  
  }


}
