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
import instantreports.model.Firmendaten;
import instantreports.model.Lohnerfassungsschluessel;
import instantreports.model.Mitarbeiter;
import instantreports.model.Personalfragebogen;
import instantreports.model.Sofortmeldung;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PayrollApi
 */
public class PayrollApiTest {

    private final PayrollApi api = new PayrollApi();

    
    /**
     * get: payroll/firmendaten
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void payrollFirmendatenGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String where = null;
        String order = null;
        String skip = null;
        String take = null;
        // Firmendaten response = api.payrollFirmendatenGet(authorization, organization, where, order, skip, take);

        // TODO: test validations
    }
    
    /**
     * get: payroll/firmendaten/id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void payrollFirmendatenResourceIdGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String resourceId = null;
        // Firmendaten response = api.payrollFirmendatenResourceIdGet(authorization, organization, resourceId);

        // TODO: test validations
    }
    
    /**
     * get: payroll/lohnerfassungsschluessel
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void payrollLohnerfassungsschluesselGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String where = null;
        String order = null;
        String skip = null;
        String take = null;
        // Lohnerfassungsschluessel response = api.payrollLohnerfassungsschluesselGet(authorization, organization, where, order, skip, take);

        // TODO: test validations
    }
    
    /**
     * get: payroll/lohnerfassungsschluessel/id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void payrollLohnerfassungsschluesselResourceIdGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String resourceId = null;
        // Lohnerfassungsschluessel response = api.payrollLohnerfassungsschluesselResourceIdGet(authorization, organization, resourceId);

        // TODO: test validations
    }
    
    /**
     * put: payroll/lohnerfassungsschluessel
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void payrollLohnerfassungsschluesselResourceIdPutTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String resourceId = null;
        Lohnerfassungsschluessel body = null;
        // api.payrollLohnerfassungsschluesselResourceIdPut(authorization, organization, resourceId, body);

        // TODO: test validations
    }
    
    /**
     * get: payroll/mitarbeiter
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void payrollMitarbeiterGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String where = null;
        String order = null;
        String skip = null;
        String take = null;
        // Mitarbeiter response = api.payrollMitarbeiterGet(authorization, organization, where, order, skip, take);

        // TODO: test validations
    }
    
    /**
     * get: payroll/mitarbeiter/id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void payrollMitarbeiterResourceIdGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String resourceId = null;
        // Mitarbeiter response = api.payrollMitarbeiterResourceIdGet(authorization, organization, resourceId);

        // TODO: test validations
    }
    
    /**
     * put: payroll/mitarbeiter
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void payrollMitarbeiterResourceIdPutTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String resourceId = null;
        Mitarbeiter body = null;
        // api.payrollMitarbeiterResourceIdPut(authorization, organization, resourceId, body);

        // TODO: test validations
    }
    
    /**
     * get: payroll/personalfragebogen
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void payrollPersonalfragebogenGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String where = null;
        String order = null;
        String skip = null;
        String take = null;
        // Personalfragebogen response = api.payrollPersonalfragebogenGet(authorization, organization, where, order, skip, take);

        // TODO: test validations
    }
    
    /**
     * get: payroll/personalfragebogen/id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void payrollPersonalfragebogenResourceIdGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String resourceId = null;
        // Personalfragebogen response = api.payrollPersonalfragebogenResourceIdGet(authorization, organization, resourceId);

        // TODO: test validations
    }
    
    /**
     * put: payroll/personalfragebogen
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void payrollPersonalfragebogenResourceIdPutTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String resourceId = null;
        Personalfragebogen body = null;
        // api.payrollPersonalfragebogenResourceIdPut(authorization, organization, resourceId, body);

        // TODO: test validations
    }
    
    /**
     * post: payroll/mitarbeiter
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void payrollResourcePostTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String resource = null;
        Mitarbeiter body = null;
        // api.payrollResourcePost(authorization, organization, resource, body);

        // TODO: test validations
    }
    
    /**
     * get: payroll/instantmessage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void payrollSofortmeldungGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String where = null;
        String order = null;
        String skip = null;
        String take = null;
        // Sofortmeldung response = api.payrollSofortmeldungGet(authorization, organization, where, order, skip, take);

        // TODO: test validations
    }
    
    /**
     * get: payroll/instantmessage/id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void payrollSofortmeldungResourceIdGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String resourceId = null;
        // Sofortmeldung response = api.payrollSofortmeldungResourceIdGet(authorization, organization, resourceId);

        // TODO: test validations
    }
    
}
