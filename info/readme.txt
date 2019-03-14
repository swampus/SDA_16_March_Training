Plan:

0. Configure maven ( to be from command line ) [OPTIONAL]
0. Configure GIT ( to be from command line )   [OPTIONAL]
0. Download And Install SonarQube ( https://www.sonarqube.org/ )
1. Explore what there is in GIT
2. Checkout and execute
3. Explore Swagger
4. Explore sonarQube
5. Start implement Services
6. Make pull REQUEST to repository
7. Cache ? We can access to it by key from HIBERNATE
8. Optimistic fields locking check


mvn clean install
mvn spring-boot:run
http://localhost:8080/swagger-ui.html

mvn clean verify sonar:sonar

# In some situation you may want to run sonar:sonar goal as a dedicated step. Be sure to use install as first step for multi-module projects
mvn clean install
mvn sonar:sonar

http://localhost:9000

TODO :
public interface CatOwnerController {
    List<CatOwnerDTO> getAllCatOwners(GetAllEntitiesRequest getAllEntitiesRequest);

    CatOwnerDTO getCatOwnerByCatPassportCode(GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest);

    List<CatOwnerDTO> getCatOwnerWithMaxCatCount(GetAllEntitiesRequest getAllEntitiesRequest);
}

public interface CatsController {

    List<CatDTO> GetAllCats(GetAllEntitiesRequest getAllEntitiesRequest);

    List<CatDTO> GetAllCatsByCatCode(GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest);

    List<CatDTO> GetAllCatsByCatModel(GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest);

    List<CatDTO> GetAllPossibleCatsForMarriageByCatCode(GetPossibleMarriageListRequest
                                                                getPossibleMarriageListRequest);

    OperationResponse addCat(CatDTO catDTO);

    OperationResponse deleteCat(DeleteEntityByIdRequest deleteEntityByIdRequest);

    List<CatDTO> getAllDisabledCats(GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest);

    List<CatDTO> getAllCatsByOwnersPersonalCode(GetAllEntitiesRequest getAllEntitiesRequest);

    /**
     * Different Type, ACTIVE, Same Model, Both Age +/- 2, Not Parent
     */
    List<CatDTO> getAllCatsForPossibleMarriage(GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest);

}

public interface ReportController {

    CatOwnerWithCatsResponse getCatOwnerWithCatsByOwnerPersonCode(
            GetAllEntitiesByKeyRequest getAllEntitiesByKeyRequest);

    List<CatOwnerWithCatsResponse> getAllCatOwnersWithCatsByOwnerPersonCode(
            GetAllEntitiesRequest getAllEntitiesRequest);

}