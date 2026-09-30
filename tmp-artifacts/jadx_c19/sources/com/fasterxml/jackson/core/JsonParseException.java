package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.util.RequestPayload;
import o.getSharedElementTargetNames;
import o.getViewLifecycleOwner;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class JsonParseException extends StreamReadException {
    private static final long serialVersionUID = 2;

    public JsonParseException(getViewLifecycleOwner getviewlifecycleowner, String str) {
        this(getviewlifecycleowner, str, StreamReadException.onExtraCallbackWithResult(getviewlifecycleowner), null);
    }

    public JsonParseException(getViewLifecycleOwner getviewlifecycleowner, String str, Throwable th) {
        this(getviewlifecycleowner, str, StreamReadException.onExtraCallbackWithResult(getviewlifecycleowner), th);
    }

    public JsonParseException(getViewLifecycleOwner getviewlifecycleowner, String str, getSharedElementTargetNames getsharedelementtargetnames) {
        this(getviewlifecycleowner, str, getsharedelementtargetnames, null);
    }

    public JsonParseException(getViewLifecycleOwner getviewlifecycleowner, String str, getSharedElementTargetNames getsharedelementtargetnames, Throwable th) {
        super(getviewlifecycleowner, str, getsharedelementtargetnames, th);
    }

    public JsonParseException onExtraCallbackWithResult(RequestPayload requestPayload) {
        this._requestPayload = requestPayload;
        return this;
    }

    @Override // com.fasterxml.jackson.core.exc.StreamReadException, com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public getViewLifecycleOwner IAuthTabCallback() {
        return super.IAuthTabCallback();
    }

    @Override // com.fasterxml.jackson.core.exc.StreamReadException, com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }
}
