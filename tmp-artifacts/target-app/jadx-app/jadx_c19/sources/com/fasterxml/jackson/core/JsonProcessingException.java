package com.fasterxml.jackson.core;

import o.getSharedElementTargetNames;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class JsonProcessingException extends JacksonException {
    private static final long serialVersionUID = 123;
    public getSharedElementTargetNames _location;

    @Override // com.fasterxml.jackson.core.JacksonException
    public Object IAuthTabCallback() {
        return null;
    }

    protected String onWarmupCompleted() {
        return null;
    }

    public JsonProcessingException(String str, getSharedElementTargetNames getsharedelementtargetnames, Throwable th) {
        super(str, th);
        this._location = getsharedelementtargetnames;
    }

    public JsonProcessingException(String str) {
        super(str);
    }

    public JsonProcessingException(String str, getSharedElementTargetNames getsharedelementtargetnames) {
        this(str, getsharedelementtargetnames, null);
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public getSharedElementTargetNames onExtraCallback() {
        return this._location;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public String onNavigationEvent() {
        return super.getMessage();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        getSharedElementTargetNames getsharedelementtargetnamesOnExtraCallback = onExtraCallback();
        String strOnWarmupCompleted = onWarmupCompleted();
        if (getsharedelementtargetnamesOnExtraCallback == null && strOnWarmupCompleted == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (strOnWarmupCompleted != null) {
            sb.append(strOnWarmupCompleted);
        }
        if (getsharedelementtargetnamesOnExtraCallback != null) {
            sb.append('\n');
            sb.append(" at ");
            sb.append(getsharedelementtargetnamesOnExtraCallback.toString());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
