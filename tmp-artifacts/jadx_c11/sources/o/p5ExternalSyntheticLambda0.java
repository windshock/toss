package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.p4;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class p5ExternalSyntheticLambda0 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[p4.onNavigationEvent.values().length];
            try {
                iArr[p4.onNavigationEvent.Header.ordinal()] = 1;
                int i = onExtraCallback + 13;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p4.onNavigationEvent.Footer.ordinal()] = 2;
                int i4 = onNavigationEvent + 75;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p4.onNavigationEvent.WholeSection.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
        }
    }

    private static final boolean onNavigationEvent(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult;
        int i7 = i6 + 99;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        if (i4 >= i) {
            int i9 = i6 + 119;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            if (i3 <= i2) {
                int i11 = i6 + 71;
                onExtraCallback = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 6 / 0;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean onExtraCallback(@NotNull List<? extends Camera2CameraControlExternalSyntheticLambda7> list, @NotNull o7d o7dVar, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int size;
        Camera2CameraControlExternalSyntheticLambda7 camera2CameraControlExternalSyntheticLambda7;
        List<? extends Camera2CameraControlExternalSyntheticLambda7> list2 = list;
        int i7 = 2 % 2;
        int i8 = onExtraCallbackWithResult + 63;
        onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(o7dVar, "");
            if (!list.isEmpty()) {
                i6 = 0;
                size = list2.size();
                camera2CameraControlExternalSyntheticLambda7 = null;
                int iMax = Integer.MIN_VALUE;
                int iMin = Integer.MAX_VALUE;
                Camera2CameraControlExternalSyntheticLambda7 camera2CameraControlExternalSyntheticLambda72 = null;
                while (i6 < size) {
                }
                if (camera2CameraControlExternalSyntheticLambda7 != null) {
                }
                return onNavigationEvent(i, i2, iMin, iMax);
            }
            return false;
        }
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(o7dVar, "");
        if (!list.isEmpty()) {
            i6 = 1;
            size = list2.size();
            camera2CameraControlExternalSyntheticLambda7 = null;
            int iMax2 = Integer.MIN_VALUE;
            int iMin2 = Integer.MAX_VALUE;
            Camera2CameraControlExternalSyntheticLambda7 camera2CameraControlExternalSyntheticLambda722 = null;
            while (i6 < size) {
                Camera2CameraControlExternalSyntheticLambda7 camera2CameraControlExternalSyntheticLambda73 = list2.get(i6);
                int iOnWarmupCompleted = i5 + camera2CameraControlExternalSyntheticLambda73.onWarmupCompleted();
                int iOnNavigationEvent = camera2CameraControlExternalSyntheticLambda73.onNavigationEvent() + iOnWarmupCompleted;
                iMin2 = Math.min(iMin2, iOnWarmupCompleted);
                iMax2 = Math.max(iMax2, iOnNavigationEvent);
                Object objIAuthTabCallback = camera2CameraControlExternalSyntheticLambda73.IAuthTabCallback();
                if (objIAuthTabCallback instanceof p4) {
                    int i9 = onExtraCallback + 49;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = onExtraCallbackWithResult.onWarmupCompleted[((p4) objIAuthTabCallback).onExtraCallback().ordinal()];
                    if (i11 != 1) {
                        int i12 = onExtraCallback + 3;
                        int i13 = i12 % 128;
                        onExtraCallbackWithResult = i13;
                        if (i12 % 2 == 0 ? i11 == 2 : i11 == 5) {
                            camera2CameraControlExternalSyntheticLambda722 = camera2CameraControlExternalSyntheticLambda73;
                        } else if (i11 != 3) {
                            int i14 = i13 + 23;
                            onExtraCallback = i14 % 128;
                            int i15 = i14 % 2;
                        } else {
                            camera2CameraControlExternalSyntheticLambda7 = camera2CameraControlExternalSyntheticLambda73;
                            camera2CameraControlExternalSyntheticLambda722 = camera2CameraControlExternalSyntheticLambda7;
                        }
                    } else {
                        camera2CameraControlExternalSyntheticLambda7 = camera2CameraControlExternalSyntheticLambda73;
                    }
                }
                if (onNavigationEvent(i, i2, iOnWarmupCompleted, iOnNavigationEvent)) {
                    int i16 = onExtraCallbackWithResult + 41;
                    onExtraCallback = i16 % 128;
                    return i16 % 2 != 0;
                }
                i6++;
                list2 = list;
            }
            if (camera2CameraControlExternalSyntheticLambda7 != null) {
                int i17 = onExtraCallbackWithResult + 55;
                onExtraCallback = i17 % 128;
                int i18 = i17 % 2;
                if (camera2CameraControlExternalSyntheticLambda722 != null) {
                    int iOnWarmupCompleted2 = i5 + camera2CameraControlExternalSyntheticLambda7.onWarmupCompleted();
                    int iOnWarmupCompleted3 = i5 + camera2CameraControlExternalSyntheticLambda722.onWarmupCompleted() + camera2CameraControlExternalSyntheticLambda722.onNavigationEvent();
                    float f = iOnWarmupCompleted3 - iOnWarmupCompleted2;
                    return onNavigationEvent(i3 + getBacktraceNoteBytes.onExtraCallback(o7dVar.onWarmupCompleted() * f), i4 - getBacktraceNoteBytes.onExtraCallback(f * o7dVar.onWarmupCompleted()), iOnWarmupCompleted2, iOnWarmupCompleted3);
                }
            }
            return onNavigationEvent(i, i2, iMin2, iMax2);
        }
        return false;
    }
}
