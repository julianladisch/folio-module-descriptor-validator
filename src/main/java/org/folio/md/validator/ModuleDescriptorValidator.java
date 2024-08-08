package org.folio.md.validator;

import static org.apache.maven.plugins.annotations.LifecyclePhase.COMPILE;
import static org.apache.maven.plugins.annotations.ResolutionScope.RUNTIME;

import java.io.File;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "validate-module-descriptor", defaultPhase = COMPILE, requiresDependencyResolution = RUNTIME,
  requiresProject = false)
public class ModuleDescriptorValidator extends AbstractMojo {

  private static final String DEFAULT_MODULE_DESCRIPTOR_FILE =
    "${project.basedir}/descriptors/ModuleDescriptor-template.json";

  @Parameter(property = "moduleDescriptorFile", defaultValue = DEFAULT_MODULE_DESCRIPTOR_FILE)
  private File moduleDescriptroFile;

  @Parameter(property = "failOnInvalidJson", defaultValue = "true")
  private boolean failOnInvalidJson;

  @Override
  public void execute() throws MojoExecutionException, MojoFailureException {

  }
}
