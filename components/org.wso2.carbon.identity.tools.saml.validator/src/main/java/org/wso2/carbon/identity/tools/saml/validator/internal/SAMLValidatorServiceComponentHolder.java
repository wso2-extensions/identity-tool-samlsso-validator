/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.tools.saml.validator.internal;

import org.wso2.carbon.identity.core.SAMLSSOServiceProviderManager;

/**
 * Service component holder class for the SAML Validator.
 */
public class SAMLValidatorServiceComponentHolder {

    private static SAMLValidatorServiceComponentHolder instance = new SAMLValidatorServiceComponentHolder();

    private SAMLSSOServiceProviderManager samlSSOServiceProviderManager = null;

    private SAMLValidatorServiceComponentHolder() {
    }

    public static SAMLValidatorServiceComponentHolder getInstance() {

        return instance;
    }

    /**
     * This method is used to get SAMLSSOServiceProviderManager instance.
     *
     * @return SAMLSSOServiceProviderManager instance.
     */
    public SAMLSSOServiceProviderManager getSAMLSSOServiceProviderManager() {

        return samlSSOServiceProviderManager;
    }

    /**
     * This method is used to set SAMLSSOServiceProviderManager instance.
     *
     * @param samlSSOServiceProviderManager SAMLSSOServiceProviderManager instance.
     */
    public void setSAMLSSOServiceProviderManager(SAMLSSOServiceProviderManager samlSSOServiceProviderManager) {

        this.samlSSOServiceProviderManager = samlSSOServiceProviderManager;
    }

}
