package org.odata4j.consumer.behaviors;

import org.odata4j.consumer.ODataClientRequest;
import org.odata4j.repack.org.apache.commons.codec.binary.Base64;

public class OAuthAuthenticationBehavior implements OClientBehavior {
	
  static final String HEADER_PREFIX = "Bearer ";
  
  private String accessToken;

  public OAuthAuthenticationBehavior(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public ODataClientRequest transform(ODataClientRequest request) {
    return request.header("Authorization", HEADER_PREFIX + accessToken);
  }

}