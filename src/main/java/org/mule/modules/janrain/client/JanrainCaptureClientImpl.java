/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

/**
 * This file was automatically generated by the Mule Development Kit
 */

package org.mule.modules.janrain.client;

import java.util.Map;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.mule.modules.janrain.capture.BulkResponse;
import org.mule.modules.janrain.capture.ClientInfo;
import org.mule.modules.janrain.capture.ClientListInfo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class JanrainCaptureClientImpl extends JanrainClientImpl implements JanrainCaptureClient {
    
    public JanrainCaptureClientImpl(String captureHost, String appId, String apiKey, Client jerseyClient, Gson gson) {
        super(captureHost, appId, apiKey, gson);
        setApiResource(jerseyClient.resource(captureHost));
    }
    
    public ClientInfo addClient(String client_id, String client_secret, String description, String features) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("description", description);
        if (features != null) params.add("features", features);
        String result=execute("clients/add", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
        return getGson().fromJson(result, ClientInfo.class);
    }
    
    public boolean clearWhitelist(String client_id, String client_secret, String for_client_id) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        if (for_client_id != null) params.add("for_client_id", for_client_id);
            
        execute("clients/clear_whitelist", params, MediaType.APPLICATION_JSON_TYPE, "POST");
        
        return true;
    }
    
    public boolean deleteClient(String client_id, String client_secret, String client_id_for_deletion) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("client_id_for_deletion", client_id_for_deletion);
            
        execute("clients/delete", params, MediaType.APPLICATION_JSON_TYPE, "POST");
        
        return true;
    }
    
    public ClientListInfo listClients(String client_id, String client_secret, String has_features) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        if (has_features != null) params.add("has_features", has_features);
        
        return getGson().fromJson(execute("clients/list", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class), ClientListInfo.class);
    }
    
    public boolean setDescription(String client_id, String client_secret, String for_client_id, String description) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("description", description);
        if (for_client_id != null) params.add("for_client_id", for_client_id);
            
        execute("clients/set_description", params, MediaType.APPLICATION_JSON_TYPE, "POST");
        
        return true;
    }
    
    public boolean setFeatures(String client_id, String client_secret, String for_client_id, String features) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("features", features);
        if (for_client_id != null) params.add("for_client_id", for_client_id);
            
        execute("clients/set_features", params, MediaType.APPLICATION_JSON_TYPE, "POST");
        
        return true;
    }
    
    public boolean setWhitelist(String client_id, String client_secret, String for_client_id, String whitelist) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("whitelist", whitelist);
        if (for_client_id != null) params.add("for_client_id", for_client_id);
            
        execute("clients/set_whitelist", params, MediaType.APPLICATION_JSON_TYPE, "POST");
        
        return true;
    }
    
    public String retrieveEntity(String client_secret, String client_id, String access_token, String uuid, String id, String key_attribute, String key_value, String password_attribute, String password_value, String type_name, String attribute_name, String attributes, String created, String last_updated) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("type_name", type_name);
        if (client_secret != null) params.add("client_secret", client_secret);
        if (client_id != null) params.add("client_id", client_id);
        if (access_token != null) params.add("access_token", access_token);
        if (uuid != null) params.add("uuid", uuid);
        if (id != null) params.add("id", id);
        if (key_attribute != null) params.add("key_attribute", key_attribute);
        if (key_value != null) params.add("key_value", key_value);
        if (password_attribute != null) params.add("password_attribute", password_attribute);
        if (password_value != null) params.add("password_value", password_value);
        if (attribute_name != null) params.add("attribute_name", attribute_name);
        if (attributes != null) params.add("attributes", attributes);
        if (created != null) params.add("created", created);
        if (last_updated != null) params.add("last_updated", last_updated);
            
        return execute("entity", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }
    
    public boolean entityAdopt(String client_secret, String client_id, String type_name, String id, String access_token, String attribute_name, String child_id) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("attribute_name", attribute_name);
        params.add("child_id", child_id);
        params.add("type_name", type_name);
        params.add("id", id);
        if (client_secret != null) params.add("client_secret", client_secret);
        if (client_id != null) params.add("client_id", client_id);
        if (access_token != null) params.add("access_token", access_token); 
        
        execute("entity.adopt", params, MediaType.APPLICATION_JSON_TYPE, "POST");
        
        return true;
    }
    
    public BulkResponse entityBulkCreate(String client_id, String client_secret, String type_name, String all_attributes) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("type_name", type_name);
        params.add("all_attributes", all_attributes);
        
        return getGson().fromJson(execute("entity.bulkCreate", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class), BulkResponse.class);        
    }
    
    public String entityCount(String client_id, String client_secret, String type_name, String filter) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("type_name", type_name);
        if (filter != null) params.add("filter", filter);
            
        return execute("entity.count", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }
    
    public Map<String,String> entityCreate(String client_id, String client_secret, String type_name, String attributes, Boolean include_record) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("attributes", attributes);
        if (type_name != null) params.add("type_name", type_name);
        if (include_record != null) params.add("include_record", include_record.toString());
        
        return getGson().fromJson(execute("entity.create", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class), new TypeToken<Map<String, String>>(){}.getType());        
    }

    public boolean entityDelete(String client_secret, String client_id, String access_token, String uuid, String id, String key_attribute, String key_value, String type_name, String attribute_name, String created, String last_updated) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("type_name", type_name);
        if (client_secret != null) params.add("client_secret", client_secret);
        if (client_id != null) params.add("client_id", client_id);
        if (access_token != null) params.add("access_token", access_token);
        if (uuid != null) params.add("uuid", uuid);
        if (id != null) params.add("id", id);
        if (key_attribute != null) params.add("key_attribute", key_attribute);
        if (key_value != null) params.add("key_value", key_value);
        if (attribute_name != null) params.add("attribute_name", attribute_name);
        if (created != null) params.add("created", created);
        if (last_updated != null) params.add("last_updated", last_updated);
            
        execute("entity.delete", params, MediaType.APPLICATION_JSON_TYPE, "POST");
        
        return true;
    }

    public String entityBulkDelete(String client_id, String client_secret, String type_name, String filter, Boolean commit) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("type_name", type_name);
        params.add("filter", filter);
        if (commit != null) params.add("commit", commit.toString());
        
        return execute("entity.bulkDelete", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }
    
    public String entityPurge(String client_id, String client_secret, String type_name, Boolean commit) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("type_name", type_name);
        params.add("commit", commit.toString());
        
        return execute("entity.purge", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }
    
    public boolean entityReplace(String client_secret, String client_id, String access_token, String uuid, String id, String key_attribute, String key_value, String type_name, String value, String attribute_name, String created, String last_updated, Boolean include_record) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("type_name", type_name);
        params.add("value", value);
        if (client_secret != null) params.add("client_secret", client_secret);
        if (client_id != null) params.add("client_id", client_id);
        if (access_token != null) params.add("access_token", access_token);
        if (uuid != null) params.add("uuid", uuid);
        if (id != null) params.add("id", id);
        if (key_attribute != null) params.add("key_attribute", key_attribute);
        if (key_value != null) params.add("key_value", key_value);
        if (attribute_name != null) params.add("attribute_name", attribute_name);
        if (created != null) params.add("created", created);
        if (last_updated != null) params.add("last_updated", last_updated);
        if (include_record != null) params.add("include_record", include_record.toString());
        
        execute("entity.replace", params, MediaType.APPLICATION_JSON_TYPE, "POST");
        
        return true;
    }
    
    public boolean entityUpdate(String client_secret, String client_id, String access_token, String uuid, String id, String key_attribute, String key_value, String type_name, String value, String attribute_name, String created, String last_updated, Boolean include_record) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("type_name", type_name);
        params.add("value", value);
        if (client_secret != null) params.add("client_secret", client_secret);
        if (client_id != null) params.add("client_id", client_id);
        if (access_token != null) params.add("access_token", access_token);
        if (uuid != null) params.add("uuid", uuid);
        if (id != null) params.add("id", id);
        if (key_attribute != null) params.add("key_attribute", key_attribute);
        if (key_value != null) params.add("key_value", key_value);
        if (attribute_name != null) params.add("attribute_name", attribute_name);
        if (created != null) params.add("created", created);
        if (last_updated != null) params.add("last_updated", last_updated);
        if (include_record != null) params.add("include_record", include_record.toString());
        
        execute("entity.update", params, MediaType.APPLICATION_JSON_TYPE, "POST");
        
        return true;
    }
    
    public String entityFind(String client_secret, String client_id, String type_name, String filter, String max_results, String first_result, Boolean show_total_count, String sort_on, String attributes) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_secret", client_secret);
        params.add("client_id", client_id);
        params.add("type_name", type_name);
        if (filter != null) params.add("filter", filter);
        if (max_results != null) params.add("max_results", max_results);
        if (first_result != null) params.add("first_result", first_result);
        if (show_total_count != null) params.add("show_total_count", show_total_count.toString());
        if (sort_on != null) params.add("sort_on", sort_on);
        if (attributes != null) params.add("attributes", attributes);        
        
        return execute("entity.find", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }
    
    public boolean deleteSettings(String client_id, String client_secret, String key, String for_client_id) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("key", key);
        params.add("for_client_id", for_client_id);
        
        execute("settings/delete", params, MediaType.APPLICATION_JSON_TYPE, "POST");
        
        return true;
    }
    
    public boolean deleteDefault(String client_id, String client_secret, String key) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("key", key);
        
        execute("settings/delete_default", params, MediaType.APPLICATION_JSON_TYPE, "POST");
        
        return true;
    }
    
    public String getSettings(String client_id, String client_secret, String key, String for_client_id) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("key", key);
        params.add("for_client_id", for_client_id);
        
        return execute("settings/get", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }
    
    public String getMultisettings(String client_id, String client_secret, String key, String for_client_id) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("key", key);
        params.add("for_client_id", for_client_id);
        
        return execute("settings/get_multi", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }
    
    public String getItems(String client_id, String client_secret, String for_client_id) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("for_client_id", for_client_id);
        
        return execute("settings/items", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }
    
    public String getKeys(String client_id, String client_secret, String for_client_id) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("for_client_id", for_client_id);
        
        return execute("settings/keys", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }
    
    public String setSettings(String client_id, String client_secret, String key, String value, String for_client_id) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("key", key);
        params.add("value", value);
        params.add("for_client_id", for_client_id);
        
        return execute("settings/set", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }
    
    public String getDefault(String client_id, String client_secret, String key) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("key", key);
        
        return execute("settings/get_default", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }
    
    public boolean setDefault(String client_id, String client_secret, String key, String value) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("key", key);
        params.add("value", value);
        
        execute("settings/set_default", params, MediaType.APPLICATION_JSON_TYPE, "POST");
        
        return true;
    }
    
    public String setMultisettings(String client_id, String client_secret, String items, String for_client_id) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("items", items);
        params.add("for_client_id", for_client_id);
        
        return execute("settings/set_multi", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);   
    }
    
    public String entityVersions(String type_name, String id, String timestamp, String client_id, String client_secret) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("timestamp", timestamp);
        params.add("id", id);
        params.add("type_name", type_name);
        
        return execute("versions/entity", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);  
    }
    
    public String getEntityType(String type_name, String timestamp, String client_id, String client_secret) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("timestamp", timestamp);
        params.add("type_name", type_name);
        
        return execute("versions/entityType", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class); 
    }
    
    public String getAccessToken(String uuid, String id, String key_attribute, String key_value, String client_id, String client_secret, String type_name, String for_client_id) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("type_name", type_name);
        if (uuid != null) params.add("uuid", uuid);
        if (id != null) params.add("id", id); 
        if (key_attribute != null) params.add("key_attribute", key_attribute); 
        if (key_value != null) params.add("key_value", key_value); 
        if (for_client_id != null) params.add("for_client_id", for_client_id); 
        
        return execute("access/getAccessToken", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }
    
    public String getAuthorizationCode(String uuid, String id, String key_attribute, String key_value, String client_id, String client_secret, String redirect_uri, String type_name, String transaction_state, String lifetime, String for_client_id) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("type_name", type_name);
        params.add("redirect_uri", redirect_uri);
        if (uuid != null) params.add("uuid", uuid);
        if (id != null) params.add("id", id);
        if (key_attribute != null) params.add("key_attribute", key_attribute);
        if (key_value != null) params.add("key_value", key_value);
        if (for_client_id != null) params.add("transaction_state", transaction_state);
        if (lifetime != null) params.add("lifetime", lifetime);
        if (for_client_id != null) params.add("for_client_id", for_client_id);
        
        return execute("access/getAuthorizationCode", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }
    
    public String getCreationToken(String client_id, String client_secret, String type_name, String lifetime, String for_client_id) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("type_name", type_name);
        params.add("lifetime", lifetime);
        params.add("for_client_id", for_client_id);
        
        return execute("access/getCreationToken", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }
    
    public String getVerificationCode(String uuid, String id, String key_attribute, String key_value, String client_id, String client_secret, String type_name, String attribute_name, String lifetime) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("type_name", type_name);
        params.add("lifetime", lifetime);
        params.add("attribute_name", attribute_name);
        if (uuid != null) params.add("uuid", uuid);
        if (id != null) params.add("id", id);
        if (key_attribute != null) params.add("key_attribute", key_attribute);
        if (key_value != null) params.add("key_value", key_value);
        
        return execute("access/getVerificationCode", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }

    public boolean useVerificationCode(String verification_code) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("verification_code", verification_code);
        
        execute("access/useVerificationCode", params, MediaType.APPLICATION_JSON_TYPE, "POST");
        
        return true;
    }
    
    public String webhooksAdd(String client_id, String client_secret, String attributes, String callback, String event_type, String entity_type) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("callback", callback);
        params.add("event_type", event_type);
        params.add("entity_type", entity_type);
        if (attributes != null) params.add("attributes", attributes);
        
        return execute("webhooks/add", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);   
    }

    public String webhooksDelete(String client_id, String client_secret, String uuid) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("uuid", uuid);
        
        return execute("webhooks/delete", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);    
    }
    
    public String webhooksFind(String client_id, String client_secret, String uuid) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("uuid", uuid);
        
        return execute("webhooks/find", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class); 
    }
    
    public String webhooksList(String client_id, String client_secret) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        
        return execute("webhooks/list", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);   
    }
    
    public String webhooksUpdate(String client_id, String client_secret, String callback, String event_type, String entity_type, String attributes, String uuid) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("uuid", uuid);
        if (callback != null) params.add("callback", callback);
        if (event_type != null) params.add("event_type", event_type);
        if (entity_type != null) params.add("entity_type", entity_type);
        if (attributes != null) params.add("attributes", attributes);
        
        return execute("webhooks/update", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);   
    }
    
    public String authNative(String client_id, String locale, String response_type, String redirect_uri, String token, String thin_registration, String merge_token, String flow_name, String flow_version) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("locale", locale);
        params.add("response_type", response_type);
        params.add("redirect_uri", redirect_uri);
        params.add("token", token);
        if (thin_registration != null) params.add("thin_registration", thin_registration);
        if (merge_token != null) params.add("merge_token", merge_token);
        if (flow_name != null) params.add("flow_name", flow_name);
        if (flow_version != null) params.add("flow_version", flow_version);
        
        return execute("oauth/auth_native", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }
    
    public String authNativeTraditional(String client_id, String locale, String response_type, String redirect_uri, String email, String password, String form, String flow_name, String flow_version) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("locale", locale);
        params.add("response_type", response_type);
        params.add("redirect_uri", redirect_uri);
        params.add("email", email);
        params.add("password", password);
        params.add("form", form);
        if (flow_name != null) params.add("flow_name", flow_name);
        if (flow_version != null) params.add("flow_version", flow_version);
        
        return execute("oauth/auth_native_traditional", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }
    
    public String forgotPasswordNative(String client_id, String locale, String response_type, String redirect_uri, String form, String email, String flow_name, String flow_version) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("locale", locale);
        params.add("response_type", response_type);
        params.add("redirect_uri", redirect_uri);
        params.add("email", email);
        params.add("form", form);
        if (flow_name != null) params.add("flow_name", flow_name);
        if (flow_version != null) params.add("flow_version", flow_version);
        
        return execute("oauth/forgot_password_native", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }
    
    public String linkAccountNative(String client_id, String locale, String response_type, String redirect_uri, String token, String flow_name, String flow_version) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("locale", locale);
        params.add("response_type", response_type);
        params.add("redirect_uri", redirect_uri);
        params.add("token", token);
        if (flow_name != null) params.add("flow_name", flow_name);
        if (flow_version != null) params.add("flow_version", flow_version);
        
        return execute("oauth/link_account_native", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }
    
    public String registerNative(String client_id, String locale, String response_type, String redirect_uri, String token, String flow_name, String flow_version) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("locale", locale);
        params.add("response_type", response_type);
        params.add("redirect_uri", redirect_uri);
        params.add("token", token);
        if (flow_name != null) params.add("flow_name", flow_name);
        if (flow_version != null) params.add("flow_version", flow_version);
        
        return execute("oauth/register_native", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }

    public String verifyEmailNative(String client_id, String locale, String response_type, String redirect_uri, String form, String email, String flow_name, String flow_version) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("locale", locale);
        params.add("response_type", response_type);
        params.add("redirect_uri", redirect_uri);
        params.add("form", form);
        params.add("email", email);
        if (flow_name != null) params.add("flow_name", flow_name);
        if (flow_version != null) params.add("flow_version", flow_version);
        
        return execute("oauth/verify_email_native", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }

    public String getToken(String client_id, String client_secret, String grant_type, String code, String redirect_uri, String refresh_token) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("client_secret", client_secret);
        params.add("grant_type", grant_type);
        params.add("code", code);
        params.add("redirect_uri", redirect_uri);
        if (refresh_token != null) params.add("refresh_token", refresh_token);
        
        return execute("oauth/token", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }

    public String registerNativeTraditional(String client_id, String locale, String response_type, String redirect_uri, String password, String password_confirm, String email, String flow_name, String flow_version) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("client_id", client_id);
        params.add("redirect_uri", redirect_uri);
        params.add("response_type", response_type);
        params.add("email", email);
        params.add("password", password);
        params.add("password_confirm", password_confirm);
        params.add("locale", locale);
        if (flow_name != null) params.add("flow_name", flow_name);
        if (flow_version != null) params.add("flow_version", flow_version);
        
        return execute("oauth/register_native_traditional", params, MediaType.APPLICATION_JSON_TYPE, "POST").getEntity(String.class);
    }



}