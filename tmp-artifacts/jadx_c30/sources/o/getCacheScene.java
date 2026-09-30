package o;

import kotlin.jvm.internal.Intrinsics;
import kr.go.korail.railpluscardsdk.data.exceptions.RefundCardException;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getCacheScene extends RefundCardException {
    private final String message;
    private final getImgAcceptedWidth resCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCacheScene(getImgAcceptedWidth getimgacceptedwidth, String str) {
        super(getimgacceptedwidth, str, null);
        Intrinsics.checkNotNullParameter(getimgacceptedwidth, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.resCode = getimgacceptedwidth;
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCacheScene)) {
            return false;
        }
        getCacheScene getcachescene = (getCacheScene) obj;
        return this.resCode == getcachescene.resCode && Intrinsics.areEqual(getMessage(), getcachescene.getMessage());
    }

    @Override // kr.go.korail.railpluscardsdk.data.exceptions.RefundCardException, java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return getMessage().hashCode() + (this.resCode.hashCode() * 31);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CreditPsamException(resCode=" + this.resCode + ", message=" + getMessage() + ')';
    }
}
