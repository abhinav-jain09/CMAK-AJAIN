// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/abhinav/development/CMAK/conf/routes
// @DATE:Mon Sep 21 08:02:49 CEST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePreferredReplicaElection PreferredReplicaElection = new controllers.ReversePreferredReplicaElection(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApiHealth ApiHealth = new controllers.ReverseApiHealth(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseReassignPartitions ReassignPartitions = new controllers.ReverseReassignPartitions(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTopic Topic = new controllers.ReverseTopic(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseConsumer Consumer = new controllers.ReverseConsumer(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLogkafka Logkafka = new controllers.ReverseLogkafka(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCluster Cluster = new controllers.ReverseCluster(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePreferredReplicaElection PreferredReplicaElection = new controllers.javascript.ReversePreferredReplicaElection(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApiHealth ApiHealth = new controllers.javascript.ReverseApiHealth(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseReassignPartitions ReassignPartitions = new controllers.javascript.ReverseReassignPartitions(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTopic Topic = new controllers.javascript.ReverseTopic(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseConsumer Consumer = new controllers.javascript.ReverseConsumer(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLogkafka Logkafka = new controllers.javascript.ReverseLogkafka(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCluster Cluster = new controllers.javascript.ReverseCluster(RoutesPrefix.byNamePrefix());
  }

}
