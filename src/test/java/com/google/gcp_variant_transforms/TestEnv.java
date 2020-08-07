// Copyright 2020 Google LLC

package com.google.gcp_variant_transforms;

import com.google.gcp_variant_transforms.library.BigQueryRowGenerator;
import com.google.gcp_variant_transforms.library.BigQueryRowGeneratorImpl;
import com.google.gcp_variant_transforms.library.SchemaGenerator;
import com.google.gcp_variant_transforms.library.SchemaGeneratorImpl;
import com.google.gcp_variant_transforms.library.VcfParser;
import com.google.gcp_variant_transforms.library.VcfParserImpl;
import com.google.guiceberry.GuiceBerryModule;
import com.google.inject.AbstractModule;

public class TestEnv extends AbstractModule {

  @Override
  protected void configure() {
    install(new GuiceBerryModule());
    bind(VcfParser.class).to(VcfParserImpl.class);
    bind(BigQueryRowGenerator.class).to(BigQueryRowGeneratorImpl.class);
    bind(SchemaGenerator.class).to(SchemaGeneratorImpl.class);
  }
}
