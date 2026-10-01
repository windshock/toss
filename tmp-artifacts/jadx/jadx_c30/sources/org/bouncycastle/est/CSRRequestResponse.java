package org.bouncycastle.est;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class CSRRequestResponse {
    private final CSRAttributesResponse attributesResponse;
    private final Source source;

    public CSRRequestResponse(CSRAttributesResponse cSRAttributesResponse, Source source) {
        this.attributesResponse = cSRAttributesResponse;
        this.source = source;
    }

    public CSRAttributesResponse getAttributesResponse() {
        CSRAttributesResponse cSRAttributesResponse = this.attributesResponse;
        if (cSRAttributesResponse != null) {
            return cSRAttributesResponse;
        }
        throw new IllegalStateException("Response has no CSRAttributesResponse.");
    }

    public Object getSession() {
        return this.source.getSession();
    }

    public Source getSource() {
        return this.source;
    }

    public boolean hasAttributesResponse() {
        return this.attributesResponse != null;
    }
}
