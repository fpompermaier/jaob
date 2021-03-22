package com.yoshtec.owl.annotations.oprop;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface OwlEquivalentObjectProperties {
  /**
   * The equivalent object properties.
   */
  String[] objectProperties();
}
