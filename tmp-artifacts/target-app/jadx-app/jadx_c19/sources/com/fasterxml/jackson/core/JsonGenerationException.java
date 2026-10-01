package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import o.getView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class JsonGenerationException extends StreamWriteException {
    private static final long serialVersionUID = 123;

    public JsonGenerationException(String str, getView getview) {
        super(str, getview);
        this.onNavigationEvent = getview;
    }

    @Override // com.fasterxml.jackson.core.exc.StreamWriteException, com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public getView IAuthTabCallback() {
        return this.onNavigationEvent;
    }
}
