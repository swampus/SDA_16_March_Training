package sda.training.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlywayConfig {

   // @Value("${cats.clean.database}")
    private String recreateDb;

  //  @Value("${cats.migrate.database}")
    private String updateDb;

  //  @Value("${cats.repair.database}")
    private String repairDb;

/*    @Bean
    public FlywayMigrationStrategy flywayMigrationStrategy() {
        return flyway -> {
           if (needToRecreateDatabase()) {
                flyway.clean();
            }
            if (needToRepair()) {
                flyway.repair();
            }
            if (needToUpdate()) {
                flyway.migrate();
            }
        };
    }*/

    private boolean needToRecreateDatabase() {
        return recreateDb.equals("true");
    }

    private boolean needToUpdate() {
        return updateDb.equals("true");
    }

    private boolean needToRepair() {
        return repairDb.equals("true");
    }

}
