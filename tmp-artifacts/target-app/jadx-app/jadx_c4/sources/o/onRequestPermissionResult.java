package o;

import dagger.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.onRequestPermissionResult;
import okhttp3.CertificatePinner;
import okhttp3.Dns;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onRequestPermissionResult implements ea {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final zzad IAuthTabCallback;
    private final Lazy<CertificatePinner> onWarmupCompleted;

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[ca.values().length];
            try {
                iArr[ca.COMMON.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 95;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ca.INFRA.ordinal()] = 2;
                int i3 = onWarmupCompleted + 25;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
        }
    }

    public static /* synthetic */ boolean IAuthTabCallback(onRequestPermissionResult onrequestpermissionresult, ca caVar, CertificatePinner certificatePinner, String str) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(onrequestpermissionresult, caVar, certificatePinner, str);
        int i4 = onNavigationEvent + 75;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public onRequestPermissionResult(@NotNull zzad zzadVar, @NotNull Lazy<CertificatePinner> lazy) {
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(lazy, "");
        this.IAuthTabCallback = zzadVar;
        this.onWarmupCompleted = lazy;
    }

    public Dns onNavigationEvent(@NotNull final ca caVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(caVar, "");
        CertificatePinner certificatePinner = this.onWarmupCompleted.get();
        Intrinsics.checkNotNullExpressionValue(certificatePinner, "");
        final CertificatePinner certificatePinner2 = certificatePinner;
        bb bbVar = new bb((Dns) null, (Function1) null, (Function2) null, new Function1() { // from class: im.toss.di.TossDnsFactory$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 79;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    Boolean.valueOf(onRequestPermissionResult.IAuthTabCallback(this.f$0, caVar, certificatePinner2, (String) obj));
                    throw null;
                }
                Boolean boolValueOf = Boolean.valueOf(onRequestPermissionResult.IAuthTabCallback(this.f$0, caVar, certificatePinner2, (String) obj));
                int i4 = onExtraCallbackWithResult + 93;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 85 / 0;
                }
                return boolValueOf;
            }
        }, 7, (DefaultConstructorMarker) null);
        int i2 = onNavigationEvent + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return bbVar;
    }

    private static final boolean onExtraCallback(onRequestPermissionResult onrequestpermissionresult, ca caVar, CertificatePinner certificatePinner, String str) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        boolean zOnExtraCallback = onrequestpermissionresult.onExtraCallback(caVar, certificatePinner, str);
        int i4 = onNavigationEvent + 33;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r6.findMatchingPins(r7).isEmpty() == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onExtraCallback(ca caVar, CertificatePinner certificatePinner, String str) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(caVar);
            throw null;
        }
        if (onExtraCallback(caVar)) {
            if (this.IAuthTabCallback.MediaDescriptionCompat()) {
                if (!this.IAuthTabCallback.ICustomTabsCallbackStubProxy()) {
                    int i3 = onNavigationEvent + 39;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            int i5 = onExtraCallback + 91;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 10 / 0;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final boolean onExtraCallback(ca caVar) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted.IAuthTabCallback[caVar.ordinal()];
        if (i2 == 1) {
            return DERSet.onExtraCallback.ICustomTabsCallbackDefault();
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = onNavigationEvent + 7;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {DERSet.onExtraCallback};
            int iOnExtraCallback = getKekid.onExtraCallback();
            ((Boolean) DERSet.onExtraCallback(-1400091667, objArr, 1400091692, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback)).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {DERSet.onExtraCallback};
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        boolean zBooleanValue = ((Boolean) DERSet.onExtraCallback(-1400091667, objArr2, 1400091692, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback2)).booleanValue();
        int i4 = onNavigationEvent + 13;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }
}
