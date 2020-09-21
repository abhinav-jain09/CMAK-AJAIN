// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/abhinav/development/CMAK/conf/routes
// @DATE:Mon Sep 21 08:02:49 CEST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers {

  // @LINE:75
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:78
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
    // @LINE:75
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "vassets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:22
  class ReversePreferredReplicaElection(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def handleScheduleRunElectionAPI(c:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/leader/schedule")
    }
  
    // @LINE:22
    def preferredReplicaElection(c:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/leader")
    }
  
    // @LINE:25
    def handleScheduleRunElection(c:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/leader/schedule")
    }
  
    // @LINE:70
    def handleScheduledIntervalAPI(c:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/leader/scheduledInterval")
    }
  
    // @LINE:27
    def cancelScheduleRunElection(c:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/leader/schedule/cancel")
    }
  
    // @LINE:23
    def handleRunElection(c:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/leader")
    }
  
    // @LINE:72
    def cancelScheduleRunElectionAPI(c:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/leader/schedule/cancel")
    }
  
    // @LINE:24
    def scheduleRunElection(c:String): Call = {
    
      (c: @unchecked) match {
      
        // @LINE:24
        case (c)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/leader/schedule")
      
      }
    
    }
  
  }

  // @LINE:81
  class ReverseApiHealth(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:81
    def ping(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/health")
    }
  
  }

  // @LINE:28
  class ReverseReassignPartitions(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def confirmMultipleAssignments(c:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/assignments/confirm")
    }
  
    // @LINE:33
    def handleGenerateMultipleAssignments(c:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/assignments/generate")
    }
  
    // @LINE:31
    def handleGenerateAssignment(c:String, t:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/assignment/generate" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("t", t)))))
    }
  
    // @LINE:36
    def runMultipleAssignments(c:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/assignments/run")
    }
  
    // @LINE:29
    def handleOperation(c:String, t:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/assignment" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("t", t)))))
    }
  
    // @LINE:28
    def reassignPartitions(c:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/assignment")
    }
  
    // @LINE:37
    def handleRunMultipleAssignments(c:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/assignments/run")
    }
  
    // @LINE:51
    def handleManualAssignment(c:String, t:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/topics/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("t", t)) + "/assignments/manual")
    }
  
    // @LINE:50
    def manualAssignments(c:String, t:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/topics/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("t", t)) + "/assignments/manual")
    }
  
    // @LINE:30
    def confirmAssignment(c:String, t:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/assignment/confirm" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("t", t)))))
    }
  
  }

  // @LINE:11
  class ReverseTopic(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def topics(c:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/topics")
    }
  
    // @LINE:14
    def topic(c:String, t:String, force:Boolean = false): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/topics/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("t", t)) + play.core.routing.queryString(List(if(force == false) None else Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("force", force)))))
    }
  
    // @LINE:42
    def createTopic(c:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/createTopic")
    }
  
    // @LINE:47
    def handleAddPartitions(c:String, t:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/topics/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("t", t)) + "/addPartitions")
    }
  
    // @LINE:45
    def handleDeleteTopic(c:String, t:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/topics/delete" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("t", t)))))
    }
  
    // @LINE:48
    def updateConfig(c:String, t:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/topics/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("t", t)) + "/updateConfig")
    }
  
    // @LINE:46
    def addPartitions(c:String, t:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/topics/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("t", t)) + "/addPartitions")
    }
  
    // @LINE:12
    def addPartitionsToMultipleTopics(c:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/topics/addPartitions")
    }
  
    // @LINE:13
    def handleAddPartitionsToMultipleTopics(c:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/topics/addPartitions")
    }
  
    // @LINE:43
    def handleCreateTopic(c:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/topics/create")
    }
  
    // @LINE:49
    def handleUpdateConfig(c:String, t:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/topics/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("t", t)) + "/updateConfig")
    }
  
    // @LINE:44
    def confirmDeleteTopic(c:String, t:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/topics/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("t", t)) + "/confirm_delete")
    }
  
  }

  // @LINE:19
  class ReverseConsumer(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def consumers(c:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/consumers")
    }
  
    // @LINE:20
    def consumer(c:String, g:String, ct:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/consumers/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("g", g)) + "/type/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("ct", ct)))
    }
  
    // @LINE:21
    def consumerAndTopic(c:String, g:String, t:String, ct:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/consumers/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("g", g)) + "/topic/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("t", t)) + "/type/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("ct", ct)))
    }
  
  }

  // @LINE:15
  class ReverseLogkafka(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def handleCreateLogkafka(c:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/logkafkas/create")
    }
  
    // @LINE:57
    def handleDisableConfig(c:String, h:String, l:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/logkafkas/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("h", h)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("l", l)) + "/disableConfig")
    }
  
    // @LINE:58
    def handleEnableConfig(c:String, h:String, l:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/logkafkas/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("h", h)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("l", l)) + "/enableConfig")
    }
  
    // @LINE:52
    def createLogkafka(c:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/createLogkafka")
    }
  
    // @LINE:15
    def logkafkas(c:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/logkafkas")
    }
  
    // @LINE:55
    def updateConfig(c:String, h:String, l:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/logkafkas/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("h", h)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("l", l)) + "/updateConfig")
    }
  
    // @LINE:54
    def handleDeleteLogkafka(c:String, h:String, l:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/logkafkas/delete" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("h", h)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("l", l)))))
    }
  
    // @LINE:56
    def handleUpdateConfig(c:String, h:String, l:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/logkafkas/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("h", h)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("l", l)) + "/updateConfig")
    }
  
    // @LINE:16
    def logkafka(c:String, h:String, l:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/logkafkas/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("h", h)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("l", l)))
    }
  
  }

  // @LINE:9
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseCluster(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def addCluster(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addCluster")
    }
  
    // @LINE:17
    def brokers(c:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/brokers")
    }
  
    // @LINE:40
    def handleAddCluster(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clusters")
    }
  
    // @LINE:41
    def handleUpdateCluster(c:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)))
    }
  
    // @LINE:18
    def broker(c:String, b:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)) + "/brokers/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("b", b)))
    }
  
    // @LINE:10
    def cluster(c:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clusters/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)))
    }
  
    // @LINE:39
    def updateCluster(c:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateCluster" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("c", c)))))
    }
  
  }


}
