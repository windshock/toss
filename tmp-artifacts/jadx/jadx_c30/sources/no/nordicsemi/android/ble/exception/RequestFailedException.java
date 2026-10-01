package no.nordicsemi.android.ble.exception;

import no.nordicsemi.android.ble.Request;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RequestFailedException extends Exception {
    private final Request request;
    private final int status;

    public RequestFailedException(Request request, int i) {
        super("Request failed with status " + i);
        this.request = request;
        this.status = i;
    }
}
