/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package OpenIGTLink.swig;

public class IGTLtransform implements IGTLtransformConstants {
  public static void igtl_transform_convert_byte_order(SWIGTYPE_p_float transform) {
    IGTLtransformJNI.igtl_transform_convert_byte_order(SWIGTYPE_p_float.getCPtr(transform));
  }

  public static java.math.BigInteger igtl_transform_get_crc(SWIGTYPE_p_float transform) {
    return IGTLtransformJNI.igtl_transform_get_crc(SWIGTYPE_p_float.getCPtr(transform));
  }

}
