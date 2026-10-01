package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonProcessingException;
import o.getView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class StreamWriteException extends JsonProcessingException {
    private static final long serialVersionUID = 2;
    public transient getView onNavigationEvent;

    public StreamWriteException(String str, getView getview) {
        super(str, null);
        this.onNavigationEvent = getview;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    /* renamed from: onExtraCallbackWithResult */
    public getView IAuthTabCallback() {
        return this.onNavigationEvent;
    }
}
