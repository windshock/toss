package com.initech.cpv.exception;

import com.initech.core.exception.INICoreException;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PathValidateException extends INICoreException {
    protected Exception causeException;

    public PathValidateException() {
    }

    public PathValidateException(Exception exc) {
        super(exc.getMessage());
        this.causeException = exc;
    }

    public PathValidateException(String str) {
        super(str);
    }

    public Exception getCauseException() {
        return this.causeException;
    }
}
