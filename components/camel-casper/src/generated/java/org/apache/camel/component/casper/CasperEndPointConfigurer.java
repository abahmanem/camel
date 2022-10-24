/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.casper;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CasperEndPointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CasperEndPoint target = (CasperEndPoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "blockhash":
        case "blockHash": target.getConfiguration().setBlockHash(property(camelContext, java.lang.String.class, value)); return true;
        case "blockheight":
        case "blockHeight": target.getConfiguration().setBlockHeight(property(camelContext, java.lang.Long.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "casperservice":
        case "casperService": target.getConfiguration().setCasperService(property(camelContext, com.syntifi.casper.sdk.service.CasperService.class, value)); return true;
        case "deployhash":
        case "deployHash": target.getConfiguration().setDeployHash(property(camelContext, java.lang.String.class, value)); return true;
        case "dictionaryitemkey":
        case "dictionaryItemKey": target.getConfiguration().setDictionaryItemKey(property(camelContext, java.lang.String.class, value)); return true;
        case "event": target.getConfiguration().setEvent(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "key": target.getConfiguration().setKey(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "path": target.getConfiguration().setPath(property(camelContext, java.lang.String.class, value)); return true;
        case "publickey":
        case "publicKey": target.getConfiguration().setPublicKey(property(camelContext, java.lang.String.class, value)); return true;
        case "purseuref":
        case "purseUref": target.getConfiguration().setPurseUref(property(camelContext, java.lang.String.class, value)); return true;
        case "seeduref":
        case "seedUref": target.getConfiguration().setSeedUref(property(camelContext, java.lang.String.class, value)); return true;
        case "stateroothash":
        case "stateRootHash": target.getConfiguration().setStateRootHash(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "blockhash":
        case "blockHash": return java.lang.String.class;
        case "blockheight":
        case "blockHeight": return java.lang.Long.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "casperservice":
        case "casperService": return com.syntifi.casper.sdk.service.CasperService.class;
        case "deployhash":
        case "deployHash": return java.lang.String.class;
        case "dictionaryitemkey":
        case "dictionaryItemKey": return java.lang.String.class;
        case "event": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "key": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "operation": return java.lang.String.class;
        case "path": return java.lang.String.class;
        case "publickey":
        case "publicKey": return java.lang.String.class;
        case "purseuref":
        case "purseUref": return java.lang.String.class;
        case "seeduref":
        case "seedUref": return java.lang.String.class;
        case "stateroothash":
        case "stateRootHash": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        CasperEndPoint target = (CasperEndPoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "blockhash":
        case "blockHash": return target.getConfiguration().getBlockHash();
        case "blockheight":
        case "blockHeight": return target.getConfiguration().getBlockHeight();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "casperservice":
        case "casperService": return target.getConfiguration().getCasperService();
        case "deployhash":
        case "deployHash": return target.getConfiguration().getDeployHash();
        case "dictionaryitemkey":
        case "dictionaryItemKey": return target.getConfiguration().getDictionaryItemKey();
        case "event": return target.getConfiguration().getEvent();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "key": return target.getConfiguration().getKey();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operation": return target.getConfiguration().getOperation();
        case "path": return target.getConfiguration().getPath();
        case "publickey":
        case "publicKey": return target.getConfiguration().getPublicKey();
        case "purseuref":
        case "purseUref": return target.getConfiguration().getPurseUref();
        case "seeduref":
        case "seedUref": return target.getConfiguration().getSeedUref();
        case "stateroothash":
        case "stateRootHash": return target.getConfiguration().getStateRootHash();
        default: return null;
        }
    }
}

