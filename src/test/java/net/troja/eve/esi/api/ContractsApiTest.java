/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.troja.eve.esi.api;

import java.util.List;
import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.CharacterContractsBidsResponse;
import net.troja.eve.esi.model.CharacterContractsItemsResponse;
import net.troja.eve.esi.model.CharacterContractsResponse;
import net.troja.eve.esi.model.CorporationContractsBidsResponse;
import net.troja.eve.esi.model.CorporationContractsItemsResponse;
import net.troja.eve.esi.model.CorporationContractsResponse;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for ContractsApi
 */
@Ignore
public class ContractsApiTest extends GeneralApiTest {

    private final ContractsApi api = new ContractsApi();

    
    /**
     * Get contracts
     *
     * Returns contracts available to a character, only if the character is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is \&quot;in_progress\&quot;.  ---  This route is cached for up to 300 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdContractsTest() throws ApiException {
        Integer page = null;
        List<CharacterContractsResponse> response = api.getCharactersCharacterIdContracts(characterId, DATASOURCE, null, page, null, null, null);

        assertThat(response.size(), greaterThan(0));
        final CharacterContractsResponse characterContractsResponse = response.get(0);
        assertThat(characterContractsResponse.getPrice(), greaterThan(0.0));
    }
    
    /**
     * Get contract bids
     *
     * Lists bids on a particular auction contract  ---  This route is cached for up to 300 seconds  SSO Scope: esi-contracts.read_character_contracts.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdContractsContractIdBidsTest() throws ApiException {
        Integer page = null;
        List<CharacterContractsResponse> characterContractsResponses = api.getCharactersCharacterIdContracts(characterId, DATASOURCE, null, page, null, null, null);
        assertThat(characterContractsResponses.size(), greaterThan(0));
        Integer contractId = null;
        for (CharacterContractsResponse characterContractsResponse : characterContractsResponses) {
            if (characterContractsResponse.getType() == CharacterContractsResponse.TypeEnum.AUCTION) {
                contractId = characterContractsResponse.getContractId();
            }
        }
        assertThat(contractId, notNullValue());
        List<CharacterContractsBidsResponse> response = api.getCharactersCharacterIdContractsContractIdBids(characterId, contractId, DATASOURCE, null, null, null, null);

        assertThat(response.size(), greaterThan(0));
        final CharacterContractsBidsResponse characterContractsResponse = response.get(0);
        assertThat(characterContractsResponse.getAmount(), greaterThan(0f));
        
    }
    
    /**
     * Get contract items
     *
     * Lists Items and details of a particular contract  ---  This route is cached for up to 3600 seconds  SSO Scope: esi-contracts.read_character_contracts.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdContractsContractIdItemsTest() throws ApiException {
        Integer page = null;
        List<CharacterContractsResponse> characterContractsResponses = api.getCharactersCharacterIdContracts(characterId, DATASOURCE, null, page, null, null, null);
        assertThat(characterContractsResponses.size(), greaterThan(0));
        Integer contractId = null;
        for (CharacterContractsResponse characterContractsResponse : characterContractsResponses) {
            if (characterContractsResponse.getType() == CharacterContractsResponse.TypeEnum.AUCTION
                    || characterContractsResponse.getType() == CharacterContractsResponse.TypeEnum.ITEM_EXCHANGE) {
                contractId = characterContractsResponse.getContractId();
            }
        }
        assertThat(contractId, notNullValue());
        List<CharacterContractsItemsResponse> response = api.getCharactersCharacterIdContractsContractIdItems(characterId, contractId, DATASOURCE, null, null, null, null);
    }

        /**
     * Get coporation contracts
     *
     * Returns contracts available to a coporation, only if the corporation is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is \&quot;in_progress\&quot;.  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdContractsTest() throws ApiException {
        Integer corporationId = null;
        Integer page = null;
        List<CorporationContractsResponse> response = api.getCorporationsCorporationIdContracts(corporationId, DATASOURCE, null, page, null, null, null);

        // TODO: test validations
    }
    
    /**
     * Get corporation contract bids
     *
     * Lists bids on a particular auction contract  ---  This route is cached for up to 3600 seconds  SSO Scope: esi-contracts.read_corporation_contracts.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdContractsContractIdBidsTest() throws ApiException {
        Integer contractId = null;
        Integer corporationId = null;
        Integer page = null;
        List<CorporationContractsBidsResponse> response = api.getCorporationsCorporationIdContractsContractIdBids(contractId, corporationId, DATASOURCE, null, page, null, null, null);

        // TODO: test validations
    }
    
    /**
     * Get corporation contract items
     *
     * Lists items of a particular contract  ---  This route is cached for up to 3600 seconds  SSO Scope: esi-contracts.read_corporation_contracts.v1  SSO Scope: esi-contracts.read_character_contracts.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdContractsContractIdItemsTest() throws ApiException {
        Integer contractId = null;
        Integer corporationId = null;
        List<CorporationContractsItemsResponse> response = api.getCorporationsCorporationIdContractsContractIdItems(contractId, corporationId, DATASOURCE, null, null, null, null);

        // TODO: test validations
    }
}
