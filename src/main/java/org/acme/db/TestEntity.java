package org.acme.db;

import io.quarkus.mongodb.panache.PanacheMongoEntity;

public class TestEntity extends PanacheMongoEntity {
  public String name;
}
