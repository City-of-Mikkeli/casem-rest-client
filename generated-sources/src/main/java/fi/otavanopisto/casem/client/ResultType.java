package fi.otavanopisto.casem.client;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class ResultType<T> {
  
  public Type getType() {
    Type superClass = getClass().getGenericSuperclass();
    return ((ParameterizedType) superClass).getActualTypeArguments()[0];
  }
  
}

