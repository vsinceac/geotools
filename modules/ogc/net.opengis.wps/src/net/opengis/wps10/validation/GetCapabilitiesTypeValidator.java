/**
 *
 * $Id$
 */
package net.opengis.wps10.validation;

import java.util.Map;

import net.opengis.ows11.AcceptVersionsType;

/**
 * A sample validator interface for {@link net.opengis.wps10.GetCapabilitiesType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GetCapabilitiesTypeValidator {
  boolean validate();

  boolean validateAcceptVersions(AcceptVersionsType value);
  boolean validateLanguage(String value);
  boolean validateService(String value);
  boolean validateBaseUrl(String value);
  boolean validateExtendedProperties(Map value);
}