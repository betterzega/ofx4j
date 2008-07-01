package net.sf.ofx4j.meta;

import java.lang.annotation.*;

/**
 * An OFX element, applied to a javabean property.
 *
 * @author Ryan Heaton
 */
@Target ( ElementType.METHOD )
@Retention ( RetentionPolicy.RUNTIME)
public @interface Header {

  /**
   * The name of the element.
   *
   * @return The name of the element.
   */
  String name();

  /**
   * The versions to which this header is applicable (default "100").
   *
   * @return The versions to which this headeris applicable.
   */
  String[] versions() default {"100"};
}