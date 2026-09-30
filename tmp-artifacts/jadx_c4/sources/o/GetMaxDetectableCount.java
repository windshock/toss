package o;

import com.google.android.gms.internal.ads.zzgc;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class GetMaxDetectableCount {
    private static volatile Long IAuthTabCallback = null;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static volatile String onExtraCallback = null;
    private static volatile String onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    public static final GetMaxDetectableCount onWarmupCompleted = new GetMaxDetectableCount();

    static {
        int i = asInterface + 3;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private GetMaxDetectableCount() {
    }

    public final void onExtraCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback;
        }
        throw null;
    }

    public final void onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = onExtraCallbackWithResult;
        int i4 = onTransact + 97;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Long l = IAuthTabCallback;
        int i4 = onTransact + 99;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return l;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@Nullable Long l) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        IAuthTabCallback = l;
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 3;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c A[PHI: r1
      0x001c: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v20 java.lang.String) binds: [B:8:0x001a, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback() throws Throwable {
        String str;
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            str = onExtraCallback;
            int i3 = 97 / 0;
            if (str != null) {
                if (StringsKt.isBlank(str)) {
                    int i4 = IAuthTabCallbackStub + 19;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    z = true;
                } else {
                    int i6 = IAuthTabCallbackStub + 47;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                    z = false;
                }
            }
        } else {
            str = onExtraCallback;
            if (str != null) {
            }
        }
        onExtraCallback = null;
        onExtraCallbackWithResult = null;
        IAuthTabCallback = null;
        if (z) {
            return;
        }
        int i8 = IAuthTabCallbackStub + 17;
        onTransact = i8 % 128;
        if (i8 % 2 == 0) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TnsLogManager", "tns 퍼널 종료 : 이전 앱 로그를 확인하려면 kibana topic을 tns-app-event로 변경해주세요", null, null, true, null, 90, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        } else {
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TnsLogManager", "tns 퍼널 종료 : 이전 앱 로그를 확인하려면 kibana topic을 tns-app-event로 변경해주세요", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        }
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult = null;
            IAuthTabCallback = null;
            int i3 = 99 / 0;
        } else {
            onExtraCallbackWithResult = null;
            IAuthTabCallback = null;
        }
        int i4 = IAuthTabCallbackStub + 91;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }
}
