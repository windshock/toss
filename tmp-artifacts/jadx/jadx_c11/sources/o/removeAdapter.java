package o;

import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.tds.compose.foundation.anim.rally.RallyKeyframes;
import im.toss.tds.compose.foundation.anim.rally.RallyKeyframesKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.MaxNativeAdView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class removeAdapter {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final Map<MaxNativeAdView, r8lambdawISNmAGv0vJBBl_rQ3C6417OY> onNavigationEvent = new LinkedHashMap();

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i3);
        int i9 = ~i3;
        int i10 = i8 | (~(i9 | i | i2));
        int i11 = ~(i7 | i9);
        int i12 = (~i2) | i9;
        int i13 = i11 | (~i12);
        int i14 = ~(i12 | i);
        int i15 = i + i3 + i5 + ((-1261570137) * i6) + (2040842291 * i4);
        int i16 = i15 * i15;
        int i17 = ((i * (-750812765)) - 1471086592) + ((-750812765) * i3) + (1493335646 * i10) + ((-1308296004) * i13) + ((-1493335646) * i14) + (742522880 * i5) + ((-1928462336) * i6) + (1629880320 * i4) + (2096168960 * i16);
        int i18 = ((i * 1408203179) - 1033136887) + (i3 * 1408203179) + (i10 * (-338)) + (i13 * (-676)) + (i14 * 338) + (i5 * 1408202841) + (i6 * (-1046847217)) + (i4 * (-121732677)) + (i16 * 1741225984);
        int i19 = i17 + (i18 * i18 * 838795264);
        if (i19 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i19 != 2) {
            return i19 != 3 ? i19 != 4 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr);
        }
        int i20 = 2 % 2;
        ((removeAdapter) objArr[0]).onNavigationEvent.put(MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.access000()), new getAdvertiserTextView((Integer) objArr[1], (Integer) objArr[2], (setOnQueryTextListener) objArr[3], ((Number) objArr[4]).floatValue(), null));
        int i21 = onExtraCallbackWithResult + 101;
        onExtraCallback = i21 % 128;
        int i22 = i21 % 2;
        return null;
    }

    public static /* synthetic */ void IAuthTabCallback(removeAdapter removeadapter, Integer num, Integer num2, setOnQueryTextListener setonquerytextlistener, float f, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onExtraCallback + 41;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            num = null;
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallback + 9;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            num2 = null;
        }
        if ((i & 4) != 0) {
            int i7 = onExtraCallback + 83;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            setonquerytextlistener = null;
        }
        removeadapter.IAuthTabCallback(num, num2, setonquerytextlistener, f);
    }

    public final void IAuthTabCallback(@Nullable Integer num, @Nullable Integer num2, @Nullable setOnQueryTextListener setonquerytextlistener, float f) {
        int i = 2 % 2;
        this.onNavigationEvent.put(MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.IAuthTabCallback()), new getBodyTextView(num, num2, setonquerytextlistener, f));
        int i2 = onExtraCallbackWithResult + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void onExtraCallback(removeAdapter removeadapter, Integer num, setOnQueryTextListener setonquerytextlistener, Float f, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 23;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 125;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            setonquerytextlistener = null;
        }
        if ((i & 4) != 0) {
            int i7 = onExtraCallbackWithResult + 103;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            f = null;
        }
        removeadapter.onWarmupCompleted(num, setonquerytextlistener, f, (Function1<? super RallyKeyframes<Float>, Unit>) function1);
        int i9 = onExtraCallback + 65;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@Nullable Integer num, @Nullable setOnQueryTextListener setonquerytextlistener, @Nullable Float f, @NotNull Function1<? super RallyKeyframes<Float>, Unit> function1) {
        int iIntValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Map<MaxNativeAdView, r8lambdawISNmAGv0vJBBl_rQ3C6417OY> map = this.onNavigationEvent;
        MaxNativeAdView maxNativeAdViewOnExtraCallback = MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.IAuthTabCallback());
        if (num != null) {
            int i2 = onExtraCallbackWithResult + 19;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                num.intValue();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        map.put(maxNativeAdViewOnExtraCallback, new setMediaContentAspectRatio(num, setonquerytextlistener, f, RallyKeyframesKt.onExtraCallbackWithResult(Integer.valueOf(iIntValue), setonquerytextlistener, f, function1)));
        int i3 = onExtraCallbackWithResult + 63;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 33 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(removeAdapter removeadapter, Integer num, Integer num2, setOnQueryTextListener setonquerytextlistener, float f, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            int i5 = i3 + 107;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            num2 = null;
        }
        if ((i & 4) != 0) {
            int i7 = onExtraCallback;
            int i8 = i7 + 19;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            int i9 = i7 + 115;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            setonquerytextlistener = null;
        }
        removeadapter.onNavigationEvent(num, num2, setonquerytextlistener, f);
    }

    public final void onNavigationEvent(@Nullable Integer num, @Nullable Integer num2, @Nullable setOnQueryTextListener setonquerytextlistener, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault(num, num2, setonquerytextlistener, f);
            IAuthTabCallback(1770923190, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1770923190, new Object[]{this, num, num2, setonquerytextlistener, Float.valueOf(f)}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
            int i3 = onExtraCallback + 119;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        IAuthTabCallbackDefault(num, num2, setonquerytextlistener, f);
        IAuthTabCallback(1770923190, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1770923190, new Object[]{this, num, num2, setonquerytextlistener, Float.valueOf(f)}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(removeAdapter removeadapter, Integer num, setOnQueryTextListener setonquerytextlistener, Float f, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            setonquerytextlistener = null;
        }
        if ((i & 4) != 0) {
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 29;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = i3 + 23;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            f = null;
        }
        removeadapter.onNavigationEvent(num, setonquerytextlistener, f, (Function1<? super RallyKeyframes<Float>, Unit>) function1);
    }

    public final void onNavigationEvent(@Nullable Integer num, @Nullable setOnQueryTextListener setonquerytextlistener, @Nullable Float f, @NotNull Function1<? super RallyKeyframes<Float>, Unit> function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            onExtraCallback(num, setonquerytextlistener, f, function1);
            IAuthTabCallback(num, setonquerytextlistener, f, function1);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            onExtraCallback(num, setonquerytextlistener, f, function1);
            IAuthTabCallback(num, setonquerytextlistener, f, function1);
            int i3 = 8 / 0;
        }
    }

    public final void IAuthTabCallbackDefault(@Nullable Integer num, @Nullable Integer num2, @Nullable setOnQueryTextListener setonquerytextlistener, float f) {
        int i = 2 % 2;
        this.onNavigationEvent.put(MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.IAuthTabCallbackStub()), new getBodyTextView(num, num2, setonquerytextlistener, f));
        int i2 = onExtraCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void onExtraCallback(@Nullable Integer num, @Nullable setOnQueryTextListener setonquerytextlistener, @Nullable Float f, @NotNull Function1<? super RallyKeyframes<Float>, Unit> function1) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Map<MaxNativeAdView, r8lambdawISNmAGv0vJBBl_rQ3C6417OY> map = this.onNavigationEvent;
        MaxNativeAdView maxNativeAdViewOnExtraCallback = MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.IAuthTabCallbackStub());
        if (num != null) {
            int i4 = onExtraCallbackWithResult + 37;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                num.intValue();
                throw null;
            }
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        map.put(maxNativeAdViewOnExtraCallback, new setMediaContentAspectRatio(num, setonquerytextlistener, f, RallyKeyframesKt.onExtraCallbackWithResult(Integer.valueOf(iIntValue), setonquerytextlistener, f, function1)));
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        ((removeAdapter) objArr[0]).onNavigationEvent.put(MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.asBinder()), new getBodyTextView((Integer) objArr[1], (Integer) objArr[2], (setOnQueryTextListener) objArr[3], ((Number) objArr[4]).floatValue()));
        int i2 = onExtraCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final void IAuthTabCallback(@Nullable Integer num, @Nullable setOnQueryTextListener setonquerytextlistener, @Nullable Float f, @NotNull Function1<? super RallyKeyframes<Float>, Unit> function1) {
        int iIntValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Map<MaxNativeAdView, r8lambdawISNmAGv0vJBBl_rQ3C6417OY> map = this.onNavigationEvent;
        MaxNativeAdView maxNativeAdViewOnExtraCallback = MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.asBinder());
        if (num != null) {
            int i2 = onExtraCallback + 75;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                num.intValue();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iIntValue = num.intValue();
        } else {
            int i3 = onExtraCallbackWithResult + 113;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            iIntValue = 0;
        }
        map.put(maxNativeAdViewOnExtraCallback, new setMediaContentAspectRatio(num, setonquerytextlistener, f, RallyKeyframesKt.onExtraCallbackWithResult(Integer.valueOf(iIntValue), setonquerytextlistener, f, function1)));
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(removeAdapter removeadapter, Integer num, Integer num2, setOnQueryTextListener setonquerytextlistener, float f, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = onExtraCallbackWithResult + 15;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            num = null;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 29;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            num2 = null;
        }
        if ((i & 4) != 0) {
            int i6 = onExtraCallback + 45;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 98 / 0;
            }
            setonquerytextlistener = null;
        }
        IAuthTabCallback(2112764145, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -2112764143, new Object[]{removeadapter, num, num2, setonquerytextlistener, Float.valueOf(f)}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        removeAdapter removeadapter = (removeAdapter) objArr[0];
        Integer num = (Integer) objArr[1];
        Integer num2 = (Integer) objArr[2];
        setOnQueryTextListener setonquerytextlistener = (setOnQueryTextListener) objArr[3];
        float fFloatValue = ((Number) objArr[4]).floatValue();
        int iIntValue = ((Number) objArr[5]).intValue();
        Object obj = objArr[6];
        int i = 2 % 2;
        Object obj2 = null;
        if ((iIntValue & 1) != 0) {
            num = null;
        }
        if ((iIntValue & 2) != 0) {
            num2 = null;
        }
        if ((iIntValue & 4) != 0) {
            int i2 = onExtraCallbackWithResult + 89;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            setonquerytextlistener = null;
        }
        removeadapter.IAuthTabCallbackStub(num, num2, setonquerytextlistener, fFloatValue);
        int i3 = onExtraCallbackWithResult + 77;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public final void IAuthTabCallbackStub(@Nullable Integer num, @Nullable Integer num2, @Nullable setOnQueryTextListener setonquerytextlistener, float f) {
        int i = 2 % 2;
        this.onNavigationEvent.put(MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.access100()), new getAdvertiserTextView(num, num2, setonquerytextlistener, f, null));
        int i2 = onExtraCallbackWithResult + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onNavigationEvent(removeAdapter removeadapter, Integer num, Integer num2, setOnQueryTextListener setonquerytextlistener, float f, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onExtraCallback + 57;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            num = null;
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 21;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            num2 = null;
        }
        if ((i & 4) != 0) {
            int i7 = onExtraCallback + 15;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 82 / 0;
            }
            setonquerytextlistener = null;
        }
        removeadapter.onExtraCallback(num, num2, setonquerytextlistener, f);
    }

    public final void onExtraCallback(@Nullable Integer num, @Nullable Integer num2, @Nullable setOnQueryTextListener setonquerytextlistener, float f) {
        int i = 2 % 2;
        this.onNavigationEvent.put(MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.onWarmupCompleted()), new getBodyTextView(num, num2, setonquerytextlistener, f));
        int i2 = onExtraCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(removeAdapter removeadapter, Integer num, Integer num2, setOnQueryTextListener setonquerytextlistener, float f, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onExtraCallback + 117;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            int i5 = onExtraCallback + 67;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            setonquerytextlistener = null;
        }
        IAuthTabCallback(1308007158, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1308007155, new Object[]{removeadapter, num, num2, setonquerytextlistener, Float.valueOf(f)}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        ((removeAdapter) objArr[0]).onNavigationEvent.put(MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.onExtraCallbackWithResult()), new getBodyTextView((Integer) objArr[1], (Integer) objArr[2], (setOnQueryTextListener) objArr[3], ((Number) objArr[4]).floatValue()));
        int i2 = onExtraCallbackWithResult + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    public static /* synthetic */ void onExtraCallback(removeAdapter removeadapter, Integer num, Integer num2, setOnQueryTextListener setonquerytextlistener, float f, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onExtraCallback + 53;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            num = null;
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallback + 113;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            num2 = null;
        }
        if ((i & 4) != 0) {
            int i7 = onExtraCallback + 111;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            setonquerytextlistener = null;
        }
        IAuthTabCallback(-2116501298, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 2116501299, new Object[]{removeadapter, num, num2, setonquerytextlistener, Float.valueOf(f)}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        ((removeAdapter) objArr[0]).onNavigationEvent.put(MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.onNavigationEvent()), new getBodyTextView((Integer) objArr[1], (Integer) objArr[2], (setOnQueryTextListener) objArr[3], ((Number) objArr[4]).floatValue()));
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final void onNavigationEvent(@Nullable Integer num, @Nullable setOnQueryTextListener setonquerytextlistener, @Nullable VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1, @NotNull Function1<? super RallyKeyframes<VirtualCameraControlExternalSyntheticLambda1>, Unit> function1) {
        int iIntValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Map<MaxNativeAdView, r8lambdawISNmAGv0vJBBl_rQ3C6417OY> map = this.onNavigationEvent;
        MaxNativeAdView maxNativeAdViewOnExtraCallback = MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.access100());
        if (num != null) {
            iIntValue = num.intValue();
            int i2 = onExtraCallback + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        } else {
            iIntValue = 0;
        }
        map.put(maxNativeAdViewOnExtraCallback, new setMediaView(num, setonquerytextlistener, virtualCameraControlExternalSyntheticLambda1, RallyKeyframesKt.onExtraCallbackWithResult(Integer.valueOf(iIntValue), setonquerytextlistener, virtualCameraControlExternalSyntheticLambda1, function1), null));
        int i4 = onExtraCallback + 103;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(removeAdapter removeadapter, Integer num, Integer num2, setOnQueryTextListener setonquerytextlistener, long j, int i, Object obj) {
        Integer num3;
        Integer num4;
        setOnQueryTextListener setonquerytextlistener2;
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = onExtraCallbackWithResult + 123;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallbackWithResult + 13;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i & 4) != 0) {
            int i5 = onExtraCallback + 113;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            setonquerytextlistener2 = null;
        } else {
            setonquerytextlistener2 = setonquerytextlistener;
        }
        removeadapter.IAuthTabCallback(num3, num4, setonquerytextlistener2, j);
    }

    public final void IAuthTabCallback(@Nullable Integer num, @Nullable Integer num2, @Nullable setOnQueryTextListener setonquerytextlistener, long j) {
        int i = 2 % 2;
        Map<MaxNativeAdView, r8lambdawISNmAGv0vJBBl_rQ3C6417OY> map = this.onNavigationEvent;
        Object[] objArr = {MaxNativeAdView.Companion};
        map.put(MaxNativeAdView.onExtraCallback((String) MaxNativeAdView.onNavigationEvent.IAuthTabCallback(-594286327, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 594286327, objArr)), new r8lambdaYM0UeAoVGLgO8GZnRGmVS_YL0(num, num2, setonquerytextlistener, j, (DefaultConstructorMarker) null));
        int i2 = onExtraCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public final Map<MaxNativeAdView, r8lambdawISNmAGv0vJBBl_rQ3C6417OY> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 81;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Map<MaxNativeAdView, r8lambdawISNmAGv0vJBBl_rQ3C6417OY> map = this.onNavigationEvent;
        int i5 = i2 + 59;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public static /* synthetic */ void onTransact(removeAdapter removeadapter, Integer num, Integer num2, setOnQueryTextListener setonquerytextlistener, float f, int i, Object obj) {
        Object[] objArr = {removeadapter, num, num2, setonquerytextlistener, Float.valueOf(f), Integer.valueOf(i), obj};
        IAuthTabCallback(1516033057, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1516033053, objArr, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public final void onExtraCallbackWithResult(@Nullable Integer num, @Nullable Integer num2, @Nullable setOnQueryTextListener setonquerytextlistener, float f) {
        Object[] objArr = {this, num, num2, setonquerytextlistener, Float.valueOf(f)};
        IAuthTabCallback(-2116501298, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 2116501299, objArr, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public final void onWarmupCompleted(@Nullable Integer num, @Nullable Integer num2, @Nullable setOnQueryTextListener setonquerytextlistener, float f) {
        Object[] objArr = {this, num, num2, setonquerytextlistener, Float.valueOf(f)};
        IAuthTabCallback(1308007158, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1308007155, objArr, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public final void asInterface(@Nullable Integer num, @Nullable Integer num2, @Nullable setOnQueryTextListener setonquerytextlistener, float f) {
        Object[] objArr = {this, num, num2, setonquerytextlistener, Float.valueOf(f)};
        IAuthTabCallback(1770923190, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1770923190, objArr, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public final void onTransact(@Nullable Integer num, @Nullable Integer num2, @Nullable setOnQueryTextListener setonquerytextlistener, float f) {
        Object[] objArr = {this, num, num2, setonquerytextlistener, Float.valueOf(f)};
        IAuthTabCallback(2112764145, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -2112764143, objArr, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }
}
