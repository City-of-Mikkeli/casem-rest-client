package fi.otavanopisto.casem.client;

import java.util.Map;

public interface ApiClient {
  
  public <T> ApiResponse<T> doGETRequest(String url, ResultType<T> resultType, Map<String, Object> queryParams);
  
}