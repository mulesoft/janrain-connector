/**
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 **/

/**
 * This file was automatically generated by the Mule Development Kit
 */

package org.mule.modules.janrain.engage;

import java.util.List;

public class Contacts extends ApiResponse {
    
    private Response response;
    
    public class Response {
        
        private String startIndex;
        private String itemsPerPage;
        private String totalResults;
        private List<Entry> entry;
        
        public class Entry {
            
            private String displayName;
            private List<Email> emails;
            
            public class Email {
                
                private String type;
                private String value;
                
                public String getType() {
                    return type;
                }
                public void setType(String type) {
                    this.type = type;
                }
                public String getValue() {
                    return value;
                }
                public void setValue(String value) {
                    this.value = value;
                }
                
            }

            public String getDisplayName() {
                return displayName;
            }

            public void setDisplayName(String displayName) {
                this.displayName = displayName;
            }

            public List<Email> getEmails() {
                return emails;
            }

            public void setEmails(List<Email> emails) {
                this.emails = emails;
            }
            
        }

        public String getStartIndex() {
            return startIndex;
        }

        public void setStartIndex(String startIndex) {
            this.startIndex = startIndex;
        }

        public String getItemsPerPage() {
            return itemsPerPage;
        }

        public void setItemsPerPage(String itemsPerPage) {
            this.itemsPerPage = itemsPerPage;
        }

        public String getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(String totalResults) {
            this.totalResults = totalResults;
        }

        public List<Entry> getEntries() {
            return entry;
        }

        public void setEntries(List<Entry> entries) {
            this.entry = entries;
        }
        
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

}