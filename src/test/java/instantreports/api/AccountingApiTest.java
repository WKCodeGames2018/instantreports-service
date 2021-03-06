/**
 * CPM API
 * Public API for CPM
 *
 * OpenAPI spec version: V1.0
 * Contact: info@addison.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package instantreports.api;

import instantreports.ApiException;
import instantreports.model.Einstellungen;
import instantreports.model.Kontostamm;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountingApi
 */
public class AccountingApiTest {

    private final AccountingApi api = new AccountingApi();

    
    /**
     * get: accounting/einstellungen
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountingEinstellungenGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String where = null;
        String order = null;
        String skip = null;
        String take = null;
        // Einstellungen response = api.accountingEinstellungenGet(authorization, organization, where, order, skip, take);

        // TODO: test validations
    }
    
    /**
     * get: accounting/einstellungen/id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountingEinstellungenResourceIdGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String resourceId = null;
        // Einstellungen response = api.accountingEinstellungenResourceIdGet(authorization, organization, resourceId);

        // TODO: test validations
    }
    
    /**
     * get: accounting/kontostammdaten
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountingKontostammGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String where = null;
        String order = null;
        String skip = null;
        String take = null;
        // Kontostamm response = api.accountingKontostammGet(authorization, organization, where, order, skip, take);

        // TODO: test validations
    }
    
    /**
     * get: accounting/kontostammdaten/id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountingKontostammResourceIdGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String resourceId = null;
        // Kontostamm response = api.accountingKontostammResourceIdGet(authorization, organization, resourceId);

        // TODO: test validations
    }
    
}
