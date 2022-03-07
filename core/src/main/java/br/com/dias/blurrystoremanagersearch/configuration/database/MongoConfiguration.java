package br.com.dias.blurrystoremanagersearch.configuration.database;

import java.util.Collection;
import java.util.Collections;
/*
@Configuration
@Profile("test")
public class MongoConfiguration extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "blurry-store-manager-search";
    }

    @Override
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/blurry-store-manager-search");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();

        return MongoClients.create(mongoClientSettings);
    }

    @Override
    public Collection getMappingBasePackages() {
        return Collections.singleton("br.com.dias");
    }


}*/
public class MongoConfiguration {

}
