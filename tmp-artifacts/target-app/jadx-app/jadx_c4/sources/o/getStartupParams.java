package o;

import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.ranges.RangesKt;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getStartupParams {
    private static final float[] IAuthTabCallback;
    private static int onExtraCallback = 0;
    private static final Map<Pair<Integer, Integer>, flowLog> onExtraCallbackWithResult;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        flowLog flowlog;
        Pair pair = (Pair) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = ((i2 & 110) + (i2 | 110)) - 1;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            flowlog = (flowLog) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1267460124, -1267460121, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{pair}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
            int i4 = 88 / 0;
        } else {
            flowlog = (flowLog) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1267460124, -1267460121, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{pair}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        }
        int i5 = onExtraCallback;
        int i6 = i5 & 7;
        int i7 = -(-(i5 | 7));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        onTransact = i8 % 128;
        if (i8 % 2 != 0) {
            return flowlog;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i);
        int i9 = ~i;
        int i10 = i8 | (~(i9 | i2));
        int i11 = ~(i9 | i3);
        int i12 = i10 | i11;
        int i13 = ~i2;
        int i14 = i11 | (~(i13 | i3));
        int i15 = (~(i | i7 | i13)) | (~(i13 | i9 | i3));
        int i16 = i2 + i3 + i5 + ((-1369571145) * i4) + ((-720088171) * i6);
        int i17 = i16 * i16;
        int i18 = (((-954023988) * i2) - 252706816) + ((-260227018) * i3) + ((-346898485) * i12) + (i14 * 346898485) + (346898485 * i15) + ((-607125504) * i5) + (565182464 * i4) + (1611661312 * i6) + ((-409206784) * i17);
        int i19 = ((i2 * (-1931095572)) - 2087550970) + (i3 * (-1931094842)) + (i12 * (-365)) + (i14 * 365) + (i15 * 365) + (i5 * (-1931095207)) + (i4 * (-789048161)) + (i6 * 356376013) + (i17 * 423362560);
        int i20 = i18 + (i19 * i19 * (-1901854720));
        return i20 != 1 ? i20 != 2 ? i20 != 3 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 85;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        float[] fArr = IAuthTabCallback;
        int i5 = (i2 ^ 105) + ((i2 & 105) << 1);
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return fArr;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = (i2 & 59) + (i2 | 59);
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        Map<Pair<Integer, Integer>, flowLog> map = onExtraCallbackWithResult;
        int i6 = i4 ^ 47;
        int i7 = ((i4 & 47) | i6) << 1;
        int i8 = -i6;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        onTransact = i9 % 128;
        if (i9 % 2 != 0) {
            return map;
        }
        throw null;
    }

    static {
        Pair pairIAuthTabCallback;
        Pair pairIAuthTabCallback2;
        int i;
        int iIntValue;
        int i2 = onNavigationEvent;
        int i3 = i2 & 63;
        int i4 = -(-(i2 | 63));
        int i5 = (i3 & i4) + (i4 | i3);
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        float[] fArr = new float[2048];
        int i7 = onNavigationEvent;
        int i8 = i7 & 45;
        int i9 = (i7 | 45) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = (i9 & i10) + (i9 | i10);
        onWarmupCompleted = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 2 % 5;
        } else {
            int i13 = 2 % 2;
        }
        int i14 = 0;
        while (i14 < 2048) {
            int i15 = onWarmupCompleted;
            int i16 = i15 & 33;
            int i17 = (i16 - (~((i15 ^ 33) | i16))) - 1;
            onNavigationEvent = i17 % 128;
            int i18 = i17 % 2;
            int i19 = (i15 & 71) + (i15 | 71);
            onNavigationEvent = i19 % 128;
            int i20 = i19 % 2;
            fArr[i14] = 1.0f / (((float) Math.exp(-((((i14 & (-1024)) - (~(-(-(i14 | (-1024)))))) - 1) * 0.01f))) + 1.0f);
            int i21 = ((i14 ^ 14) + ((i14 & 14) << 1)) - 1;
            int i22 = i21 & (-12);
            i14 = (i22 << 1) + ((i21 | (-12)) & (~i22));
            int i23 = onWarmupCompleted + 23;
            onNavigationEvent = i23 % 128;
            if (i23 % 2 == 0) {
                int i24 = 2 % 2;
            }
        }
        IAuthTabCallback = fArr;
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(32, 32);
        int i25 = onWarmupCompleted;
        int i26 = (i25 ^ 69) + ((i25 & 69) << 1);
        onNavigationEvent = i26 % 128;
        if (i26 % 2 != 0) {
            pairIAuthTabCallback = getWrite.IAuthTabCallback(16, 16);
            pairIAuthTabCallback2 = getWrite.IAuthTabCallback(8, 8);
            i = 4;
        } else {
            pairIAuthTabCallback = getWrite.IAuthTabCallback(16, 16);
            pairIAuthTabCallback2 = getWrite.IAuthTabCallback(8, 8);
            i = 3;
        }
        Pair[] pairArr = new Pair[i];
        pairArr[0] = pairIAuthTabCallback3;
        pairArr[1] = pairIAuthTabCallback;
        pairArr[2] = pairIAuthTabCallback2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(3), 16));
        int i27 = onWarmupCompleted;
        int i28 = i27 & 101;
        int i29 = i28 + ((i27 ^ 101) | i28);
        int i30 = i29 % 128;
        onNavigationEvent = i30;
        int i31 = i29 % 2 != 0 ? 1 : 0;
        int i32 = i30 ^ 75;
        int i33 = ((i30 & 75) | i32) << 1;
        int i34 = -i32;
        int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
        onWarmupCompleted = i35 % 128;
        int i36 = i35 % 2;
        int i37 = 2 % 2;
        while (i31 < 3) {
            int i38 = onNavigationEvent;
            int i39 = i38 & 19;
            int i40 = i39 + ((i38 ^ 19) | i39);
            onWarmupCompleted = i40 % 128;
            int i41 = i40 % 2;
            Pair pair = pairArr[i31];
            int iIntValue2 = ((Number) pair.onExtraCallbackWithResult()).intValue();
            int i42 = onNavigationEvent + 85;
            onWarmupCompleted = i42 % 128;
            int i43 = i42 % 2;
            Integer numValueOf = Integer.valueOf(iIntValue2);
            if (i43 == 0) {
                iIntValue = ((Number) pair.IAuthTabCallback()).intValue();
                int i44 = 63 / 0;
            } else {
                iIntValue = ((Number) pair.IAuthTabCallback()).intValue();
            }
            flowLog flowlog = (flowLog) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1267460124, -1267460121, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{getWrite.IAuthTabCallback(numValueOf, Integer.valueOf(iIntValue))}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
            int i45 = onWarmupCompleted + 119;
            onNavigationEvent = i45 % 128;
            int i46 = i45 % 2;
            linkedHashMap.put(pair, flowlog);
            i31++;
            int i47 = onWarmupCompleted;
            int i48 = i47 & 57;
            int i49 = (((i47 ^ 57) | i48) << 1) - ((i47 | 57) & (~i48));
            onNavigationEvent = i49 % 128;
            int i50 = i49 % 2;
        }
        onExtraCallbackWithResult = linkedHashMap;
        int i51 = onNavigationEvent;
        int i52 = (((i51 | 4) << 1) - (i51 ^ 4)) - 1;
        onWarmupCompleted = i52 % 128;
        int i53 = i52 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Pair pair = (Pair) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 & 55;
        int i4 = (i2 ^ 55) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        int iIntValue = ((Number) pair.onExtraCallbackWithResult()).intValue();
        Object objIAuthTabCallback = pair.IAuthTabCallback();
        int i7 = onExtraCallback;
        int i8 = i7 ^ 3;
        int i9 = -(-((i7 & 3) << 1));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        onTransact = i10 % 128;
        int i11 = i10 % 2;
        int iIntValue2 = ((Number) objIAuthTabCallback).intValue();
        int i12 = iIntValue * iIntValue2;
        int i13 = onExtraCallback;
        int i14 = i13 & 111;
        int i15 = ((i13 | 111) & (~i14)) + (i14 << 1);
        int i16 = i15 % 128;
        onTransact = i16;
        int i17 = i15 % 2;
        float[] fArr = new float[i12];
        float[] fArr2 = new float[i12];
        int i18 = i16 + 71;
        onExtraCallback = i18 % 128;
        int i19 = i18 % 2;
        int i20 = 0;
        int i21 = 0;
        while (i20 < iIntValue) {
            int i22 = onTransact;
            int i23 = i22 ^ 81;
            int i24 = ((i22 & 81) | i23) << 1;
            int i25 = -i23;
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            int i27 = i26 % 128;
            onExtraCallback = i27;
            int i28 = i26 % 2;
            float f = i20;
            int i29 = (((i27 ^ 121) | (i27 & 121)) << 1) - (((~i27) & 121) | (i27 & (-122)));
            onTransact = i29 % 128;
            int i30 = i29 % 2;
            int i31 = 0;
            while (i31 < iIntValue2) {
                int i32 = onTransact + 119;
                int i33 = i32 % 128;
                onExtraCallback = i33;
                int i34 = i32 % 2;
                fArr2[i21] = f;
                fArr[i21] = i31;
                i21 = ((i21 & 53) + (i21 | 53)) - 52;
                int i35 = i33 + 75;
                onTransact = i35 % 128;
                int i36 = i35 % 2;
                i31 = (((i31 & (-2)) | ((~i31) & 1)) - (~((i31 & 1) << 1))) - 1;
                int i37 = i33 & 51;
                int i38 = -(-((i33 ^ 51) | i37));
                int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
                onTransact = i39 % 128;
                int i40 = i39 % 2;
            }
            int i41 = (i20 ^ (-115)) + ((i20 & (-115)) << 1);
            i20 = (i41 ^ 116) + ((i41 & 116) << 1);
            int i42 = onExtraCallback;
            int i43 = ((i42 ^ 109) | (i42 & 109)) << 1;
            int i44 = -(((~i42) & 109) | (i42 & (-110)));
            int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
            onTransact = i45 % 128;
            int i46 = i45 % 2;
        }
        flowLog flowlog = new flowLog(fArr, fArr2);
        int i47 = onTransact;
        int i48 = i47 & 5;
        int i49 = -(-((i47 ^ 5) | i48));
        int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
        onExtraCallback = i50 % 128;
        int i51 = i50 % 2;
        return flowlog;
    }

    public static final /* synthetic */ flowLog onWarmupCompleted(Pair pair) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (flowLog) onNavigationEvent(iOnExtraCallbackWithResult, -221950282, 221950282, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{pair}, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ Map IAuthTabCallback() {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Map) onNavigationEvent(iOnExtraCallbackWithResult, 1966299112, -1966299111, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[0], iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ float[] onExtraCallback() {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (float[]) onNavigationEvent(iOnExtraCallbackWithResult, 1186940992, -1186940990, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[0], iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    private static final flowLog onExtraCallbackWithResult(Pair<Integer, Integer> pair) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (flowLog) onNavigationEvent(iOnExtraCallbackWithResult, 1267460124, -1267460121, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{pair}, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }
}
