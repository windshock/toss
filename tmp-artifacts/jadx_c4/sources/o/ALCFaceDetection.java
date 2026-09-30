package o;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCFaceDetection implements ALCFaceLivenessMode {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final ALCFaceAuthInfo onExtraCallbackWithResult;

    static {
        int i = onNavigationEvent + 37;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 68 / 0;
        }
    }

    public ALCFaceDetection(@NotNull ALCFaceAuthInfo aLCFaceAuthInfo) {
        Intrinsics.checkNotNullParameter(aLCFaceAuthInfo, "");
        this.onExtraCallbackWithResult = aLCFaceAuthInfo;
    }

    public final ALCFaceAuthInfo IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        ALCFaceAuthInfo aLCFaceAuthInfo = this.onExtraCallbackWithResult;
        int i5 = i3 + 53;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return aLCFaceAuthInfo;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String string = this.onExtraCallbackWithResult.toString();
        int i4 = onWarmupCompleted + 87;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return string;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof ALCFaceDetection) {
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, ((ALCFaceDetection) obj).onExtraCallbackWithResult);
        }
        int i4 = onWarmupCompleted + 77;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        int i4 = onWarmupCompleted + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            if (4352 <= i) {
                int i3 = IAuthTabCallback + 81;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                if (i < 4608) {
                    return true;
                }
            }
            if (12593 > i) {
                return false;
            }
            int i5 = IAuthTabCallback + 27;
            onNavigationEvent = i5 % 128;
            return i5 % 2 != 0 ? i < 31652 : i < 12703;
        }

        private IAuthTabCallback() {
        }

        public final ALCFaceDetection onExtraCallbackWithResult(char c) {
            Object next;
            int i = 2 % 2;
            Iterator<T> it = getFaceFeatureValue.Companion.onNavigationEvent().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                int i2 = onNavigationEvent + 47;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    next = it.next();
                    int i3 = 29 / 0;
                    if (((ALCFaceAuthInfo) next).IAuthTabCallback() == c) {
                        break;
                    }
                } else {
                    next = it.next();
                    if (((ALCFaceAuthInfo) next).IAuthTabCallback() == c) {
                        break;
                    }
                }
            }
            ALCFaceAuthInfo aLCFaceAuthInfo = (ALCFaceAuthInfo) next;
            if (aLCFaceAuthInfo == null) {
                aLCFaceAuthInfo = new ALCFaceAuthInfo(CollectionsKt.listOf(Character.valueOf(c)), c);
            }
            ALCFaceDetection aLCFaceDetection = new ALCFaceDetection(aLCFaceAuthInfo);
            int i4 = IAuthTabCallback + 109;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return aLCFaceDetection;
        }

        public final ALCFaceDetection onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 69;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                if (onExtraCallbackWithResult(i)) {
                    int i4 = onNavigationEvent + 5;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return onExtraCallbackWithResult((char) i);
                }
                throw new IllegalArgumentException("한글 자음, 모음이 아닙니다.");
            }
            onExtraCallbackWithResult(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
