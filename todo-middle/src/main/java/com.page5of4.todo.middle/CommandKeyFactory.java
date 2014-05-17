package com.page5of4.todo.middle;

import com.yammer.tenacity.core.properties.TenacityPropertyKey;
import com.yammer.tenacity.core.properties.TenacityPropertyKeyFactory;

public class CommandKeyFactory implements TenacityPropertyKeyFactory {
   @Override
   public TenacityPropertyKey from(String value) {
      return CommandKeys.valueOf(value.toUpperCase());
   }
}
