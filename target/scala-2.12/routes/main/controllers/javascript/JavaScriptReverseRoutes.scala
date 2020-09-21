// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/abhinav/development/CMAK/conf/routes
// @DATE:Mon Sep 21 08:02:49 CEST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers.javascript {

  // @LINE:75
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:78
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
    // @LINE:75
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vassets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:22
  class ReversePreferredReplicaElection(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def handleScheduleRunElectionAPI: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PreferredReplicaElection.handleScheduleRunElectionAPI",
      """
        function(c0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/leader/schedule"})
        }
      """
    )
  
    // @LINE:22
    def preferredReplicaElection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PreferredReplicaElection.preferredReplicaElection",
      """
        function(c0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/leader"})
        }
      """
    )
  
    // @LINE:25
    def handleScheduleRunElection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PreferredReplicaElection.handleScheduleRunElection",
      """
        function(c0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/leader/schedule"})
        }
      """
    )
  
    // @LINE:70
    def handleScheduledIntervalAPI: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PreferredReplicaElection.handleScheduledIntervalAPI",
      """
        function(c0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/leader/scheduledInterval"})
        }
      """
    )
  
    // @LINE:27
    def cancelScheduleRunElection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PreferredReplicaElection.cancelScheduleRunElection",
      """
        function(c0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/leader/schedule/cancel"})
        }
      """
    )
  
    // @LINE:23
    def handleRunElection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PreferredReplicaElection.handleRunElection",
      """
        function(c0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/leader"})
        }
      """
    )
  
    // @LINE:72
    def cancelScheduleRunElectionAPI: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PreferredReplicaElection.cancelScheduleRunElectionAPI",
      """
        function(c0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/leader/schedule/cancel"})
        }
      """
    )
  
    // @LINE:24
    def scheduleRunElection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PreferredReplicaElection.scheduleRunElection",
      """
        function(c0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/leader/schedule"})
          }
        
        }
      """
    )
  
  }

  // @LINE:81
  class ReverseApiHealth(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:81
    def ping: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiHealth.ping",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/health"})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseReassignPartitions(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def confirmMultipleAssignments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReassignPartitions.confirmMultipleAssignments",
      """
        function(c0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/assignments/confirm"})
        }
      """
    )
  
    // @LINE:33
    def handleGenerateMultipleAssignments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReassignPartitions.handleGenerateMultipleAssignments",
      """
        function(c0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/assignments/generate"})
        }
      """
    )
  
    // @LINE:31
    def handleGenerateAssignment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReassignPartitions.handleGenerateAssignment",
      """
        function(c0,t1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/assignment/generate" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("t", t1)])})
        }
      """
    )
  
    // @LINE:36
    def runMultipleAssignments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReassignPartitions.runMultipleAssignments",
      """
        function(c0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/assignments/run"})
        }
      """
    )
  
    // @LINE:29
    def handleOperation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReassignPartitions.handleOperation",
      """
        function(c0,t1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/assignment" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("t", t1)])})
        }
      """
    )
  
    // @LINE:28
    def reassignPartitions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReassignPartitions.reassignPartitions",
      """
        function(c0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/assignment"})
        }
      """
    )
  
    // @LINE:37
    def handleRunMultipleAssignments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReassignPartitions.handleRunMultipleAssignments",
      """
        function(c0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/assignments/run"})
        }
      """
    )
  
    // @LINE:51
    def handleManualAssignment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReassignPartitions.handleManualAssignment",
      """
        function(c0,t1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/topics/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("t", t1)) + "/assignments/manual"})
        }
      """
    )
  
    // @LINE:50
    def manualAssignments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReassignPartitions.manualAssignments",
      """
        function(c0,t1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/topics/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("t", t1)) + "/assignments/manual"})
        }
      """
    )
  
    // @LINE:30
    def confirmAssignment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReassignPartitions.confirmAssignment",
      """
        function(c0,t1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/assignment/confirm" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("t", t1)])})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseTopic(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def topics: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.topics",
      """
        function(c0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/topics"})
        }
      """
    )
  
    // @LINE:14
    def topic: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.topic",
      """
        function(c0,t1,force2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/topics/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("t", t1)) + _qS([(force2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Boolean]].javascriptUnbind + """)("force", force2))])})
        }
      """
    )
  
    // @LINE:42
    def createTopic: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.createTopic",
      """
        function(c0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/createTopic"})
        }
      """
    )
  
    // @LINE:47
    def handleAddPartitions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.handleAddPartitions",
      """
        function(c0,t1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/topics/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("t", t1)) + "/addPartitions"})
        }
      """
    )
  
    // @LINE:45
    def handleDeleteTopic: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.handleDeleteTopic",
      """
        function(c0,t1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/topics/delete" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("t", t1)])})
        }
      """
    )
  
    // @LINE:48
    def updateConfig: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.updateConfig",
      """
        function(c0,t1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/topics/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("t", t1)) + "/updateConfig"})
        }
      """
    )
  
    // @LINE:46
    def addPartitions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.addPartitions",
      """
        function(c0,t1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/topics/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("t", t1)) + "/addPartitions"})
        }
      """
    )
  
    // @LINE:12
    def addPartitionsToMultipleTopics: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.addPartitionsToMultipleTopics",
      """
        function(c0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/topics/addPartitions"})
        }
      """
    )
  
    // @LINE:13
    def handleAddPartitionsToMultipleTopics: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.handleAddPartitionsToMultipleTopics",
      """
        function(c0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/topics/addPartitions"})
        }
      """
    )
  
    // @LINE:43
    def handleCreateTopic: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.handleCreateTopic",
      """
        function(c0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/topics/create"})
        }
      """
    )
  
    // @LINE:49
    def handleUpdateConfig: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.handleUpdateConfig",
      """
        function(c0,t1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/topics/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("t", t1)) + "/updateConfig"})
        }
      """
    )
  
    // @LINE:44
    def confirmDeleteTopic: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Topic.confirmDeleteTopic",
      """
        function(c0,t1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/topics/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("t", t1)) + "/confirm_delete"})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseConsumer(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def consumers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Consumer.consumers",
      """
        function(c0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/consumers"})
        }
      """
    )
  
    // @LINE:20
    def consumer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Consumer.consumer",
      """
        function(c0,g1,ct2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/consumers/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("g", g1)) + "/type/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("ct", ct2))})
        }
      """
    )
  
    // @LINE:21
    def consumerAndTopic: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Consumer.consumerAndTopic",
      """
        function(c0,g1,t2,ct3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/consumers/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("g", g1)) + "/topic/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("t", t2)) + "/type/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("ct", ct3))})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseLogkafka(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def handleCreateLogkafka: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Logkafka.handleCreateLogkafka",
      """
        function(c0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/logkafkas/create"})
        }
      """
    )
  
    // @LINE:57
    def handleDisableConfig: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Logkafka.handleDisableConfig",
      """
        function(c0,h1,l2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/logkafkas/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("h", h1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("l", l2)) + "/disableConfig"})
        }
      """
    )
  
    // @LINE:58
    def handleEnableConfig: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Logkafka.handleEnableConfig",
      """
        function(c0,h1,l2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/logkafkas/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("h", h1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("l", l2)) + "/enableConfig"})
        }
      """
    )
  
    // @LINE:52
    def createLogkafka: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Logkafka.createLogkafka",
      """
        function(c0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/createLogkafka"})
        }
      """
    )
  
    // @LINE:15
    def logkafkas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Logkafka.logkafkas",
      """
        function(c0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/logkafkas"})
        }
      """
    )
  
    // @LINE:55
    def updateConfig: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Logkafka.updateConfig",
      """
        function(c0,h1,l2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/logkafkas/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("h", h1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("l", l2)) + "/updateConfig"})
        }
      """
    )
  
    // @LINE:54
    def handleDeleteLogkafka: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Logkafka.handleDeleteLogkafka",
      """
        function(c0,h1,l2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/logkafkas/delete" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("h", h1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("l", l2)])})
        }
      """
    )
  
    // @LINE:56
    def handleUpdateConfig: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Logkafka.handleUpdateConfig",
      """
        function(c0,h1,l2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/logkafkas/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("h", h1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("l", l2)) + "/updateConfig"})
        }
      """
    )
  
    // @LINE:16
    def logkafka: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Logkafka.logkafka",
      """
        function(c0,h1,l2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/logkafkas/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("h", h1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("l", l2))})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseCluster(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def addCluster: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Cluster.addCluster",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addCluster"})
        }
      """
    )
  
    // @LINE:17
    def brokers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Cluster.brokers",
      """
        function(c0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/brokers"})
        }
      """
    )
  
    // @LINE:40
    def handleAddCluster: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Cluster.handleAddCluster",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters"})
        }
      """
    )
  
    // @LINE:41
    def handleUpdateCluster: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Cluster.handleUpdateCluster",
      """
        function(c0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0))})
        }
      """
    )
  
    // @LINE:18
    def broker: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Cluster.broker",
      """
        function(c0,b1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0)) + "/brokers/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("b", b1))})
        }
      """
    )
  
    // @LINE:10
    def cluster: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Cluster.cluster",
      """
        function(c0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clusters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0))})
        }
      """
    )
  
    // @LINE:39
    def updateCluster: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Cluster.updateCluster",
      """
        function(c0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateCluster" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("c", c0)])})
        }
      """
    )
  
  }


}
