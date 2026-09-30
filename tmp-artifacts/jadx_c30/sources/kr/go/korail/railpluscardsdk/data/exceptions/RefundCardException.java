package kr.go.korail.railpluscardsdk.data.exceptions;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getImgAcceptedWidth;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class RefundCardException extends Exception {
    private getImgAcceptedWidth code;
    private final String message;

    private RefundCardException(getImgAcceptedWidth getimgacceptedwidth, String str) {
        super("[" + getimgacceptedwidth + "] " + str);
        this.code = getimgacceptedwidth;
        this.message = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final getImgAcceptedWidth onExtraCallback() {
        return this.code;
    }

    public /* synthetic */ RefundCardException(getImgAcceptedWidth getimgacceptedwidth, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(getimgacceptedwidth, str);
    }
}
