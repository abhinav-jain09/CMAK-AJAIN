// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/abhinav/development/CMAK/conf/routes
// @DATE:Mon Sep 21 08:02:49 CEST 2020

package controllers.api;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.api.ReverseKafkaStateCheck KafkaStateCheck = new controllers.api.ReverseKafkaStateCheck(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.api.javascript.ReverseKafkaStateCheck KafkaStateCheck = new controllers.api.javascript.ReverseKafkaStateCheck(RoutesPrefix.byNamePrefix());
  }

}
