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
import instantreports.model.Meldungendata;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MeldecenterApi
 */
public class MeldecenterApiTest {

    private final MeldecenterApi api = new MeldecenterApi();

    
    /**
     * get: meldecenter/meldung
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void meldecenterMeldungendataGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String where = null;
        String order = null;
        String skip = null;
        String take = null;
        // Meldungendata response = api.meldecenterMeldungendataGet(authorization, organization, where, order, skip, take);

        // TODO: test validations
    }
    
    /**
     * get: meldecenter/meldung/id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void meldecenterMeldungendataResourceIdGetTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String resourceId = null;
        // Meldungendata response = api.meldecenterMeldungendataResourceIdGet(authorization, organization, resourceId);

        // TODO: test validations
    }
    
    /**
     * put: meldecenter/meldung
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void meldecenterMeldungendataResourceIdPutTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String resourceId = null;
        Meldungendata body = null;
        // api.meldecenterMeldungendataResourceIdPut(authorization, organization, resourceId, body);

        // TODO: test validations
    }
    
    /**
     * post: meldecenter/meldung
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void meldecenterResourcePostTest() throws ApiException {
        String authorization = null;
        String organization = null;
        String resource = null;
        Meldungendata body = null;
        // api.meldecenterResourcePost(authorization, organization, resource, body);

        // TODO: test validations
    }
    
}
