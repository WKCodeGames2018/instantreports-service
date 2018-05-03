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
import instantreports.model.Bankaccount;
import instantreports.model.Bankingprovision;
import instantreports.model.Payment;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BankingApi
 */
public class BankingApiTest {

    private final BankingApi api = new BankingApi();

    
    /**
     * get: banking/bankaccount
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bankingBankaccountGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String where = null;
        String order = null;
        String skip = null;
        String take = null;
        // Bankaccount response = api.bankingBankaccountGet(authorization, organization, where, order, skip, take);

        // TODO: test validations
    }
    
    /**
     * get: banking/bankaccount/id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bankingBankaccountResourceIdGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String resourceId = null;
        // Bankaccount response = api.bankingBankaccountResourceIdGet(authorization, organization, resourceId);

        // TODO: test validations
    }
    
    /**
     * get: banking/bankingprovision
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bankingBankingprovisionGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String where = null;
        String order = null;
        String skip = null;
        String take = null;
        // Bankingprovision response = api.bankingBankingprovisionGet(authorization, organization, where, order, skip, take);

        // TODO: test validations
    }
    
    /**
     * get: banking/bankingprovision/id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bankingBankingprovisionResourceIdGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String resourceId = null;
        // Bankingprovision response = api.bankingBankingprovisionResourceIdGet(authorization, organization, resourceId);

        // TODO: test validations
    }
    
    /**
     * get: banking/payment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bankingPaymentGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String where = null;
        String order = null;
        String skip = null;
        String take = null;
        // Payment response = api.bankingPaymentGet(authorization, organization, where, order, skip, take);

        // TODO: test validations
    }
    
    /**
     * get: banking/payment/id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bankingPaymentResourceIdGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String resourceId = null;
        // Payment response = api.bankingPaymentResourceIdGet(authorization, organization, resourceId);

        // TODO: test validations
    }
    
}