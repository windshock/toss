package o;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.security.SecureRandom;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.TTBaseLandingPageActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ConstraintTrackingWorkerExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final ConstraintTrackingWorkerExternalSyntheticLambda1 onWarmupCompleted = new ConstraintTrackingWorkerExternalSyntheticLambda1();

    static {
        int i = onNavigationEvent + 9;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ConstraintTrackingWorkerExternalSyntheticLambda1() {
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = onWarmupCompleted();
        if (strOnWarmupCompleted.length() > 0) {
            return "Bearer " + strOnWarmupCompleted;
        }
        int i4 = onExtraCallback + 39;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return "";
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        RemoteWorkManager remoteWorkManager = RemoteWorkManager.onWarmupCompleted;
        if (!remoteWorkManager.IAuthTabCallback_Parcel()) {
            return "";
        }
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        zzah zzahVarOnExtraCallbackWithResult = zzaj.onExtraCallbackWithResult().onExtraCallbackWithResult();
        byte[] bytes = remoteWorkManager.IAuthTabCallbackStub().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String strCompact = Jwts.builder().claim("iss", remoteWorkManager.getInterfaceDescriptor()).claim("time", Double.valueOf(zzahVarOnExtraCallbackWithResult.onExtraCallbackWithResult())).claim("tsn", TTBaseLandingPageActivity.IAuthTabCallback.onExtraCallback(TTBaseLandingPageActivity.Companion, bArr, 0, 0, 3, (Object) null).asInterface()).signWith(Keys.hmacShaKeyFor(bytes), SignatureAlgorithm.HS256).compact();
        Intrinsics.checkNotNullExpressionValue(strCompact, "");
        int i4 = onExtraCallback + 59;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return strCompact;
    }
}
