package o;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class markSpmBehavor {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public AppTypeEnum<Boolean> onExtraCallbackWithResult(@NotNull ActivityAnimBean1 activityAnimBean1) {
        getAnimResId getanimresidIAuthTabCallback;
        List<getAnimResId> listListOf;
        RVPub rVPub;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = (i3 ^ 32) + ((i3 & 32) << 1);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(activityAnimBean1, "");
            getanimresidIAuthTabCallback = activityAnimBean1.IAuthTabCallback();
            int i6 = 61 / 0;
        } else {
            Intrinsics.checkNotNullParameter(activityAnimBean1, "");
            getanimresidIAuthTabCallback = activityAnimBean1.IAuthTabCallback();
        }
        getAnimResId getanimresidOnExtraCallbackWithResult = activityAnimBean1.onExtraCallbackWithResult();
        getAnimResId getanimresidOnNavigationEvent = activityAnimBean1.onNavigationEvent();
        getAnimResId getanimresidOnExtraCallback = activityAnimBean1.onExtraCallback();
        int i7 = onExtraCallback;
        int i8 = (i7 ^ 71) + ((i7 & 71) << 1);
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        getAnimResId getanimresidOnWarmupCompleted = activityAnimBean1.onWarmupCompleted();
        getAnimResId[] getanimresidArr = new getAnimResId[4];
        int i10 = IAuthTabCallback;
        int i11 = i10 ^ 57;
        int i12 = (((i10 & 57) | i11) << 1) - i11;
        int i13 = i12 % 128;
        onExtraCallback = i13;
        if (i12 % 2 == 0) {
            getanimresidArr[1] = getanimresidOnExtraCallbackWithResult;
            getanimresidArr[0] = getanimresidOnNavigationEvent;
        } else {
            getanimresidArr[0] = getanimresidOnExtraCallbackWithResult;
            getanimresidArr[1] = getanimresidOnNavigationEvent;
        }
        int i14 = i13 + 41;
        IAuthTabCallback = i14 % 128;
        if (i14 % 2 != 0) {
            getanimresidArr[3] = getanimresidOnExtraCallback;
            getanimresidArr[5] = getanimresidOnWarmupCompleted;
            listListOf = CollectionsKt.listOf(getanimresidArr);
        } else {
            getanimresidArr[2] = getanimresidOnExtraCallback;
            getanimresidArr[3] = getanimresidOnWarmupCompleted;
            listListOf = CollectionsKt.listOf(getanimresidArr);
        }
        boolean zOnWarmupCompleted = onWarmupCompleted(getanimresidIAuthTabCallback, listListOf);
        if (zOnWarmupCompleted) {
            int i15 = onExtraCallback;
            int i16 = i15 & 105;
            int i17 = i16 + ((i15 ^ 105) | i16);
            IAuthTabCallback = i17 % 128;
            rVPub = null;
            if (i17 % 2 != 0) {
                rVPub.hashCode();
                throw null;
            }
            i = (i15 & 79) + (i15 | 79);
            IAuthTabCallback = i % 128;
        } else {
            rVPub = RVPub.FACE_EULER_ANGLE_FAIL;
            int i18 = IAuthTabCallback;
            i = ((i18 & 62) + (i18 | 62)) - 1;
            onExtraCallback = i % 128;
        }
        int i19 = i % 2;
        AppTypeEnum<Boolean> appTypeEnum = new AppTypeEnum<>(Boolean.valueOf(zOnWarmupCompleted), rVPub);
        int i20 = IAuthTabCallback;
        int i21 = (i20 ^ 125) + ((i20 & 125) << 1);
        onExtraCallback = i21 % 128;
        int i22 = i21 % 2;
        return appTypeEnum;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x018b, code lost:
    
        if (r0 <= r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018e, code lost:
    
        if (r0 <= r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0190, code lost:
    
        r0 = (((r2 ^ 115) | (r2 & 115)) << 1) - (((~r2) & 115) | (r2 & (-116)));
        o.markSpmBehavor.IAuthTabCallback = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01a2, code lost:
    
        if ((r0 % 2) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a5, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onWarmupCompleted(getAnimResId getanimresid, List<getAnimResId> list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 & 47;
        int i4 = ((i2 ^ 47) | i3) << 1;
        int i5 = -((~i3) & (i2 | 47));
        int i6 = (i4 & i5) + (i4 | i5);
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i2 & 47;
        int i9 = (i2 ^ 47) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        int iOnExtraCallbackWithResult = Integer.MIN_VALUE;
        int iOnExtraCallbackWithResult2 = Integer.MAX_VALUE;
        int iOnWarmupCompleted = Integer.MAX_VALUE;
        int i12 = 0;
        int iOnWarmupCompleted2 = Integer.MIN_VALUE;
        while (true) {
            Object obj = null;
            if (i12 >= list.size()) {
                int iOnExtraCallbackWithResult3 = getanimresid.onExtraCallbackWithResult();
                if (iOnExtraCallbackWithResult2 <= iOnExtraCallbackWithResult3) {
                    int i13 = onExtraCallback;
                    int i14 = (i13 & 57) + (i13 | 57);
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
                    if (iOnExtraCallbackWithResult3 <= iOnExtraCallbackWithResult) {
                        int i16 = i13 & 3;
                        int i17 = ((i13 ^ 3) | i16) << 1;
                        int i18 = -((~i16) & (i13 | 3));
                        int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                        IAuthTabCallback = i19 % 128;
                        int i20 = i19 % 2;
                        int iOnWarmupCompleted3 = getanimresid.onWarmupCompleted();
                        if (iOnWarmupCompleted <= iOnWarmupCompleted3) {
                            int i21 = onExtraCallback;
                            int i22 = i21 & 87;
                            int i23 = -(-((i21 ^ 87) | i22));
                            int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
                            IAuthTabCallback = i24 % 128;
                            if (i24 % 2 != 0) {
                                int i25 = 41 / 0;
                            }
                        }
                    }
                }
                int i26 = onExtraCallback;
                int i27 = (((i26 | 85) << 1) - (~(-(i26 ^ 85)))) - 1;
                IAuthTabCallback = i27 % 128;
                if (i27 % 2 == 0) {
                    return false;
                }
                obj.hashCode();
                throw null;
            }
            int i28 = onExtraCallback + 45;
            IAuthTabCallback = i28 % 128;
            if (i28 % 2 != 0) {
                list.get(i12);
                obj.hashCode();
                throw null;
            }
            getAnimResId getanimresid2 = list.get(i12);
            int i29 = onExtraCallback;
            int i30 = (i29 ^ 3) + ((i29 & 3) << 1);
            IAuthTabCallback = i30 % 128;
            int i31 = i30 % 2;
            int iOnExtraCallbackWithResult4 = getanimresid2.onExtraCallbackWithResult();
            int i32 = onExtraCallback;
            int i33 = (i32 & (-48)) | ((~i32) & 47);
            int i34 = (i32 & 47) << 1;
            int i35 = (i33 & i34) + (i34 | i33);
            int i36 = i35 % 128;
            IAuthTabCallback = i36;
            int i37 = i35 % 2;
            if (iOnExtraCallbackWithResult4 < iOnExtraCallbackWithResult2) {
                int i38 = (i36 & 45) + (i36 | 45);
                onExtraCallback = i38 % 128;
                if (i38 % 2 == 0) {
                    getanimresid2.onExtraCallbackWithResult();
                    throw null;
                }
                iOnExtraCallbackWithResult2 = getanimresid2.onExtraCallbackWithResult();
            }
            if (getanimresid2.onExtraCallbackWithResult() > iOnExtraCallbackWithResult) {
                int i39 = onExtraCallback;
                int i40 = (((i39 & (-48)) | ((~i39) & 47)) - (~((i39 & 47) << 1))) - 1;
                IAuthTabCallback = i40 % 128;
                int i41 = i40 % 2;
                iOnExtraCallbackWithResult = getanimresid2.onExtraCallbackWithResult();
                int i42 = onExtraCallback;
                int i43 = ((i42 & 58) + (i42 | 58)) - 1;
                IAuthTabCallback = i43 % 128;
                int i44 = i43 % 2;
            }
            if (getanimresid2.onWarmupCompleted() < iOnWarmupCompleted) {
                int i45 = onExtraCallback + 91;
                IAuthTabCallback = i45 % 128;
                if (i45 % 2 != 0) {
                    getanimresid2.onWarmupCompleted();
                    obj.hashCode();
                    throw null;
                }
                iOnWarmupCompleted = getanimresid2.onWarmupCompleted();
            }
            if (getanimresid2.onWarmupCompleted() > iOnWarmupCompleted2) {
                int i46 = IAuthTabCallback;
                int i47 = ((i46 & 112) + (i46 | 112)) - 1;
                onExtraCallback = i47 % 128;
                int i48 = i47 % 2;
                iOnWarmupCompleted2 = getanimresid2.onWarmupCompleted();
                int i49 = IAuthTabCallback;
                int i50 = ((i49 ^ 117) | (i49 & 117)) << 1;
                int i51 = -(((~i49) & 117) | (i49 & (-118)));
                int i52 = (i50 & i51) + (i51 | i50);
                onExtraCallback = i52 % 128;
                int i53 = i52 % 2;
            }
            int i54 = i12 & (-17);
            int i55 = i12 | (-17);
            int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
            int i57 = i56 & 18;
            i12 = (((i56 ^ 18) | i57) << 1) - ((~i57) & (i56 | 18));
            int i58 = IAuthTabCallback;
            int i59 = ((i58 ^ 112) + ((i58 & 112) << 1)) - 1;
            int i60 = i59 % 128;
            onExtraCallback = i60;
            if (i59 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i61 = (((i60 ^ 101) | (i60 & 101)) << 1) - (((~i60) & 101) | (i60 & (-102)));
            IAuthTabCallback = i61 % 128;
            int i62 = i61 % 2;
        }
    }
}
