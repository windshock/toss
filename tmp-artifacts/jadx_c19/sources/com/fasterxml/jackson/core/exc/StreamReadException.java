package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.RequestPayload;
import o.getSharedElementTargetNames;
import o.getViewLifecycleOwner;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class StreamReadException extends JsonProcessingException {
    static final long serialVersionUID = 2;
    public RequestPayload _requestPayload;
    protected transient getViewLifecycleOwner onExtraCallback;

    protected StreamReadException(getViewLifecycleOwner getviewlifecycleowner, String str) {
        this(getviewlifecycleowner, str, onExtraCallbackWithResult(getviewlifecycleowner), null);
    }

    public StreamReadException(getViewLifecycleOwner getviewlifecycleowner, String str, getSharedElementTargetNames getsharedelementtargetnames, Throwable th) {
        super(str, getsharedelementtargetnames, th);
        this.onExtraCallback = getviewlifecycleowner;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    /* renamed from: onExtraCallbackWithResult */
    public getViewLifecycleOwner IAuthTabCallback() {
        return this.onExtraCallback;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this._requestPayload == null) {
            return message;
        }
        return message + "\nRequest payload : " + this._requestPayload.toString();
    }

    public static getSharedElementTargetNames onExtraCallbackWithResult(getViewLifecycleOwner getviewlifecycleowner) {
        if (getviewlifecycleowner == null) {
            return null;
        }
        return getviewlifecycleowner.onWarmupCompleted();
    }
}
