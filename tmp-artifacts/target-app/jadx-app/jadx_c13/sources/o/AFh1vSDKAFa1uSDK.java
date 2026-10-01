package o;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFh1vSDKAFa1uSDK implements Comparator<String> {
    private static int IAuthTabCallback = 1;
    public static final AFh1vSDKAFa1uSDK onExtraCallback = new AFh1vSDKAFa1uSDK();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private AFh1vSDKAFa1uSDK() {
    }

    @Override // java.util.Comparator
    public /* synthetic */ int compare(String str, String str2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = IAuthTabCallback(str, str2);
        int i4 = onWarmupCompleted + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iIAuthTabCallback;
    }

    public int IAuthTabCallback(@Nullable String str, @Nullable String str2) {
        int i = 2 % 2;
        if (str == null) {
            int i2 = onWarmupCompleted + 47;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (str2 == null) {
                int i5 = i3 + 51;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return 0;
            }
        }
        if (str == null) {
            int i7 = onNavigationEvent + 93;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        Character chFirstOrNull = StringsKt___StringsKt.firstOrNull(str);
        Character chFirstOrNull2 = StringsKt___StringsKt.firstOrNull(str2);
        if (chFirstOrNull != null && chFirstOrNull2 != null) {
            int i9 = onNavigationEvent + 35;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            int iOnNavigationEvent = onNavigationEvent(chFirstOrNull.charValue());
            int iOnNavigationEvent2 = onNavigationEvent(chFirstOrNull2.charValue());
            if (iOnNavigationEvent == iOnNavigationEvent2) {
                return str.compareTo(str2);
            }
            int i11 = onNavigationEvent + 63;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 != 0) {
                return Intrinsics.compare(iOnNavigationEvent2, iOnNavigationEvent);
            }
            Intrinsics.compare(iOnNavigationEvent2, iOnNavigationEvent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        return str.compareTo(str2);
    }

    private final int onNavigationEvent(char c) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        FaceDetectCallBack faceDetectCallBack = FaceDetectCallBack.onExtraCallbackWithResult;
        if (faceDetectCallBack.IAuthTabCallback(c)) {
            return 3;
        }
        if (!faceDetectCallBack.onExtraCallback(c)) {
            return faceDetectCallBack.onNavigationEvent(c) ? 1 : 0;
        }
        int i4 = onWarmupCompleted + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return 2;
    }
}
