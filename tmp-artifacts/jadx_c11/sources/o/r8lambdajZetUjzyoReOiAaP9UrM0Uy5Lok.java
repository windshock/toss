package o;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.compose.ui.geometry.RoundRectKt;
import com.bytedance.sdk.openadsdk.wwx.lt;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.readFully;
import o.removeTimestamp;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdajZetUjzyoReOiAaP9UrM0Uy5Lok {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static final float[] onExtraCallbackWithResult = new float[0];
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        setOrientationDegrees setorientationdegrees = (setOrientationDegrees) objArr[0];
        r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno r8lambdapqixvm4k_wfc1_gg0aalci54lno = (r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(setorientationdegrees, r8lambdapqixvm4k_wfc1_gg0aalci54lno);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 79;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ void onExtraCallback(setOrientationDegrees setorientationdegrees, r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4 r8lambdar55qr61tuz1pubmfypcurugk0r4) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(setorientationdegrees, r8lambdar55qr61tuz1pubmfypcurugk0r4);
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        int i5 = onExtraCallback + 57;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = ~i6;
        int i10 = (~(i7 | i8 | i9)) | (~(i | i3));
        int i11 = ~(i6 | i3);
        int i12 = i10 | i11;
        int i13 = ~(i7 | i3);
        int i14 = i11 | i7 | (~(i8 | i9));
        int i15 = i + i3 + i2 + (1349231875 * i4) + (1735201104 * i5);
        int i16 = i15 * i15;
        int i17 = ((-413510627) * i) + 1558183936 + (237349861 * i3) + (i12 * 325430244) + (325430244 * i13) + ((-325430244) * i14) + ((-88080384) * i2) + ((-1337982976) * i4) + (469762048 * i5) + (1272971264 * i16);
        int i18 = ((i * 236314795) - 374860141) + (i3 * 236313123) + (i12 * (-836)) + (i13 * (-836)) + (i14 * 836) + (i2 * 236313959) + (i4 * (-66979019)) + (i5 * (-1872492752)) + (i16 * (-417333248));
        int i19 = i17 + (i18 * i18 * 639631360);
        return i19 != 1 ? i19 != 2 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    public static final /* synthetic */ r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno onExtraCallbackWithResult(setIso setiso, x2ExternalSyntheticLambda0 x2externalsyntheticlambda0, float[] fArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno r8lambdapqixvm4k_wfc1_gg0aalci54lnoOnWarmupCompleted = onWarmupCompleted(setiso, x2externalsyntheticlambda0, fArr);
        int i4 = onExtraCallback + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdapqixvm4k_wfc1_gg0aalci54lnoOnWarmupCompleted;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        setIso setiso = (setIso) objArr[0];
        r8lambdaR67rFjO_P8h7SpCUFgnHuCLzjx4 r8lambdar67rfjo_p8h7spcufgnhuclzjx4 = (r8lambdaR67rFjO_P8h7SpCUFgnHuCLzjx4) objArr[1];
        float[] fArr = (float[]) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(setiso, r8lambdar67rfjo_p8h7spcufgnhuclzjx4, fArr);
            throw null;
        }
        r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4 r8lambdar55qr61tuz1pubmfypcurugk0r4IAuthTabCallback = IAuthTabCallback(setiso, r8lambdar67rfjo_p8h7spcufgnhuclzjx4, fArr);
        int i3 = onExtraCallback + 97;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return r8lambdar55qr61tuz1pubmfypcurugk0r4IAuthTabCallback;
        }
        throw null;
    }

    public static final /* synthetic */ float[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 13;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        float[] fArr = onExtraCallbackWithResult;
        int i5 = i2 + 23;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return fArr;
    }

    static {
        int i = 1 + 85;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, float f, float f2, r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI r8lambdacvbgljs0ksxut8zctwblscbeixi, r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M r8lambdawxvv9xwdigsnld64xj_ruham57m, float f3, float f4, float f5, float f6, MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1, int i3, Object obj) {
        float f7;
        float f8;
        int i4 = 2 % 2;
        if ((i3 & 64) != 0) {
            int i5 = onExtraCallback + 85;
            onWarmupCompleted = i5 % 128;
            f7 = i5 % 2 == 0 ? 2.0f : 0.0f;
        } else {
            f7 = f3;
        }
        if ((i3 & 128) != 0) {
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
            int i6 = onExtraCallback + 111;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            f8 = fIAuthTabCallback;
        } else {
            f8 = f4;
        }
        return onWarmupCompleted(quirksExternalSyntheticBackport0, i, i2, f, f2, r8lambdacvbgljs0ksxut8zctwblscbeixi, r8lambdawxvv9xwdigsnld64xj_ruham57m, f7, f8, f5, f6, mappingRedirectableLiveDataExternalSyntheticLambda1);
    }

    public static final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, float f, float f2, @NotNull r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI r8lambdacvbgljs0ksxut8zctwblscbeixi, @NotNull r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M r8lambdawxvv9xwdigsnld64xj_ruham57m, float f3, float f4, float f5, float f6, @NotNull MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(r8lambdacvbgljs0ksxut8zctwblscbeixi, "");
        Intrinsics.checkNotNullParameter(r8lambdawxvv9xwdigsnld64xj_ruham57m, "");
        Intrinsics.checkNotNullParameter(mappingRedirectableLiveDataExternalSyntheticLambda1, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(new r8lambdaPuDx6Zf1uRi3X6EXV58bLbqqXWU(i, i2, f, f2, r8lambdacvbgljs0ksxut8zctwblscbeixi, r8lambdawxvv9xwdigsnld64xj_ruham57m, f3, f4, f5, f6, mappingRedirectableLiveDataExternalSyntheticLambda1, null));
        int i4 = onExtraCallback + 45;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return quirksExternalSyntheticBackport0OnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, float f, float f2, r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI r8lambdacvbgljs0ksxut8zctwblscbeixi, r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M r8lambdawxvv9xwdigsnld64xj_ruham57m, float f3, float f4, float f5, float f6, MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1, int i3, Object obj) {
        float f7;
        int i4 = 2 % 2;
        int i5 = onExtraCallback;
        int i6 = i5 + 57;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0 ? (i3 & 64) == 0 : (i3 & 106) == 0) {
            f7 = f3;
        } else {
            int i7 = i5 + 113;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            f7 = 0.0f;
        }
        return onNavigationEvent(quirksExternalSyntheticBackport0, i, i2, f, f2, r8lambdacvbgljs0ksxut8zctwblscbeixi, r8lambdawxvv9xwdigsnld64xj_ruham57m, f7, (i3 & 128) != 0 ? f7 : f4, f5, f6, mappingRedirectableLiveDataExternalSyntheticLambda1);
    }

    public static final QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, float f, float f2, @NotNull r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI r8lambdacvbgljs0ksxut8zctwblscbeixi, @NotNull r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M r8lambdawxvv9xwdigsnld64xj_ruham57m, float f3, float f4, float f5, float f6, @NotNull MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(r8lambdacvbgljs0ksxut8zctwblscbeixi, "");
        Intrinsics.checkNotNullParameter(r8lambdawxvv9xwdigsnld64xj_ruham57m, "");
        Intrinsics.checkNotNullParameter(mappingRedirectableLiveDataExternalSyntheticLambda1, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(new x2ExternalSyntheticLambda10(i, i2, f, f2, r8lambdacvbgljs0ksxut8zctwblscbeixi, r8lambdawxvv9xwdigsnld64xj_ruham57m, f3, f4, f5, f6, mappingRedirectableLiveDataExternalSyntheticLambda1, null));
        int i4 = onExtraCallback + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    private static final r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4 IAuthTabCallback(setIso setiso, r8lambdaR67rFjO_P8h7SpCUFgnHuCLzjx4 r8lambdar67rfjo_p8h7spcufgnhuclzjx4, float[] fArr) {
        float fCoerceAtMost;
        int i = 2 % 2;
        float fOnExtraCallback = setiso.onExtraCallback(((Float) r8lambdaR67rFjO_P8h7SpCUFgnHuCLzjx4.onWarmupCompleted(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 771349418, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{r8lambdar67rfjo_p8h7spcufgnhuclzjx4}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -771349418, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).floatValue());
        float fOnExtraCallback2 = setiso.onExtraCallback(((Float) r8lambdaR67rFjO_P8h7SpCUFgnHuCLzjx4.onWarmupCompleted(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 716184812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{r8lambdar67rfjo_p8h7spcufgnhuclzjx4}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -716184811, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).floatValue());
        float fOnExtraCallback3 = setiso.onExtraCallback(r8lambdar67rfjo_p8h7spcufgnhuclzjx4.asInterface());
        float fOnExtraCallback4 = setiso.onExtraCallback(r8lambdar67rfjo_p8h7spcufgnhuclzjx4.asBinder());
        float fOnExtraCallback5 = setiso.onExtraCallback(r8lambdar67rfjo_p8h7spcufgnhuclzjx4.onWarmupCompleted().asBinder());
        float fOnExtraCallback6 = setiso.onExtraCallback(r8lambdar67rfjo_p8h7spcufgnhuclzjx4.onWarmupCompleted().onTransact());
        float fOnExtraCallback7 = setiso.onExtraCallback(r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onWarmupCompleted(r8lambdar67rfjo_p8h7spcufgnhuclzjx4.onWarmupCompleted().IAuthTabCallbackDefault()));
        float fOnExtraCallback8 = setiso.onExtraCallback(r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onNavigationEvent(r8lambdar67rfjo_p8h7spcufgnhuclzjx4.onWarmupCompleted().IAuthTabCallbackDefault()));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (setiso.onTransact() >> 32)) - fOnExtraCallback4;
        float fOnTransact = r8lambdar67rfjo_p8h7spcufgnhuclzjx4.onTransact() - (fOnExtraCallback / 2.0f);
        long jOnWarmupCompleted = setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(fOnExtraCallback) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat - fOnExtraCallback4) << 32));
        float f = fOnExtraCallback3 / 2.0f;
        if (r8lambdar67rfjo_p8h7spcufgnhuclzjx4.IAuthTabCallback() >= 0) {
            int i2 = onWarmupCompleted + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iCoerceAtMost = RangesKt.coerceAtMost(r8lambdar67rfjo_p8h7spcufgnhuclzjx4.IAuthTabCallback(), fArr.length - 1);
            if (r8lambdar67rfjo_p8h7spcufgnhuclzjx4.IAuthTabCallback() >= r8lambdar67rfjo_p8h7spcufgnhuclzjx4.onExtraCallback() - 1) {
                int i4 = onWarmupCompleted + 73;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                fCoerceAtMost = fIntBitsToFloat;
            } else {
                fCoerceAtMost = RangesKt.coerceAtMost(fArr[iCoerceAtMost] + r8lambdar67rfjo_p8h7spcufgnhuclzjx4.onExtraCallbackWithResult(), fIntBitsToFloat);
            }
        } else {
            fCoerceAtMost = fOnExtraCallback4;
        }
        float f2 = fOnTransact + fOnExtraCallback;
        float f3 = fCoerceAtMost;
        return new r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4(r8lambdar67rfjo_p8h7spcufgnhuclzjx4, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fOnExtraCallback4) << 32) | (Float.floatToRawIntBits(fOnTransact) & 4294967295L)), jOnWarmupCompleted, getAttachedUseCaseConfigs.onExtraCallback((Float.floatToRawIntBits(fOnExtraCallback2) & 4294967295L) | (Float.floatToRawIntBits(fOnExtraCallback2) << 32)), onWarmupCompleted(fOnExtraCallback4, fOnTransact, fIntBitsToFloat, f2, fOnExtraCallback2), f3, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fOnExtraCallback4) << 32) | (Float.floatToRawIntBits(fOnTransact) & 4294967295L)), setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(f3 - fOnExtraCallback4) << 32) | (Float.floatToRawIntBits(fOnExtraCallback) & 4294967295L)), new RectF((fOnExtraCallback4 - fOnExtraCallback6) + fOnExtraCallback7, (fOnTransact - fOnExtraCallback6) + fOnExtraCallback8, f3 + fOnExtraCallback6 + fOnExtraCallback7, f2 + fOnExtraCallback6 + fOnExtraCallback8), onExtraCallback(r8lambdar67rfjo_p8h7spcufgnhuclzjx4.onWarmupCompleted().onExtraCallback(), fOnExtraCallback5), readFully.onExtraCallback.onExtraCallback(readFully.Companion, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(r8lambdar67rfjo_p8h7spcufgnhuclzjx4.onNavigationEvent().onExtraCallbackWithResult()), setByteOrder.onNavigationEvent(r8lambdar67rfjo_p8h7spcufgnhuclzjx4.onNavigationEvent().onWarmupCompleted())}), fOnExtraCallback4, f3, 0, 8, (Object) null), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fOnExtraCallback4 + f) << 32) | (Float.floatToRawIntBits(fOnTransact + f) & 4294967295L)), setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(RangesKt.coerceAtLeast(Float.intBitsToFloat((int) jOnWarmupCompleted) - fOnExtraCallback3, 0.0f)) & 4294967295L) | (Float.floatToRawIntBits(RangesKt.coerceAtLeast(Float.intBitsToFloat((int) (jOnWarmupCompleted >> 32)) - fOnExtraCallback3, 0.0f)) << 32)), fOnExtraCallback3, fOnExtraCallback2, fOnExtraCallback4, null);
    }

    private static final void onExtraCallbackWithResult(setOrientationDegrees setorientationdegrees, r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4 r8lambdar55qr61tuz1pubmfypcurugk0r4) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(setorientationdegrees, r8lambdar55qr61tuz1pubmfypcurugk0r4);
        if (r8lambdar55qr61tuz1pubmfypcurugk0r4.IAuthTabCallbackStub() > r8lambdar55qr61tuz1pubmfypcurugk0r4.access100()) {
            int i4 = onWarmupCompleted + 21;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            removeTimestamp removetimestampIAuthTabCallbackStubProxy = r8lambdar55qr61tuz1pubmfypcurugk0r4.IAuthTabCallbackStubProxy();
            int iOnExtraCallbackWithResult = readUnsignedShort.Companion.onExtraCallbackWithResult();
            setFlashState setflashstateOnExtraCallback = setorientationdegrees.onExtraCallback();
            long jOnExtraCallback = setflashstateOnExtraCallback.onExtraCallback();
            setflashstateOnExtraCallback.onNavigationEvent().onNavigationEvent();
            try {
                setflashstateOnExtraCallback.onTransact().onNavigationEvent(removetimestampIAuthTabCallbackStubProxy, iOnExtraCallbackWithResult);
                RectF rectFAsBinder = r8lambdar55qr61tuz1pubmfypcurugk0r4.asBinder();
                int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
                onExtraCallbackWithResult(1214980472, alertWithArgs.onExtraCallbackWithResult(), new Object[]{setorientationdegrees, rectFAsBinder, Float.valueOf(((Float) r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4.onWarmupCompleted(-1871850479, new Object[]{r8lambdar55qr61tuz1pubmfypcurugk0r4}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), 1871850479, iOnExtraCallback)).floatValue()), r8lambdar55qr61tuz1pubmfypcurugk0r4.asInterface()}, -1214980471, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult());
                setOrientationDegrees.onNavigationEvent(setorientationdegrees, r8lambdar55qr61tuz1pubmfypcurugk0r4.onWarmupCompleted(), r8lambdar55qr61tuz1pubmfypcurugk0r4.onTransact(), r8lambdar55qr61tuz1pubmfypcurugk0r4.access000(), r8lambdar55qr61tuz1pubmfypcurugk0r4.onExtraCallbackWithResult(), 0.0f, (hasMoreElements) null, (seek) null, 0, 240, (Object) null);
            } finally {
                setflashstateOnExtraCallback.onNavigationEvent().IAuthTabCallback();
                setflashstateOnExtraCallback.onExtraCallbackWithResult(jOnExtraCallback);
            }
        }
        long jIAuthTabCallback = r8lambdar55qr61tuz1pubmfypcurugk0r4.IAuthTabCallbackDefault().onNavigationEvent().IAuthTabCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        setOrientationDegrees.onWarmupCompleted(setorientationdegrees, jIAuthTabCallback, ((Long) r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4.onWarmupCompleted(-60704401, new Object[]{r8lambdar55qr61tuz1pubmfypcurugk0r4}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), 60704402, iOnExtraCallback2)).longValue(), r8lambdar55qr61tuz1pubmfypcurugk0r4.IAuthTabCallback(), r8lambdar55qr61tuz1pubmfypcurugk0r4.onExtraCallbackWithResult(), new ExifOutputStream(r8lambdar55qr61tuz1pubmfypcurugk0r4.onExtraCallback(), 0.0f, 0, 0, (fromKilometersPerHour) null, 30, (DefaultConstructorMarker) null), 0.0f, (seek) null, 0, 224, (Object) null);
    }

    private static final void onNavigationEvent(setOrientationDegrees setorientationdegrees, r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4 r8lambdar55qr61tuz1pubmfypcurugk0r4) {
        long jOnExtraCallback;
        long jLongValue;
        long jICustomTabsCallback;
        long jOnExtraCallbackWithResult;
        hasMoreElements hasmoreelements;
        float f;
        seek seekVar;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            jOnExtraCallback = r8lambdar55qr61tuz1pubmfypcurugk0r4.IAuthTabCallbackDefault().onNavigationEvent().onExtraCallback();
            int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
            int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
            jLongValue = ((Long) r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4.onWarmupCompleted(-1140370258, new Object[]{r8lambdar55qr61tuz1pubmfypcurugk0r4}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, 1140370260, iOnExtraCallback)).longValue();
            jICustomTabsCallback = r8lambdar55qr61tuz1pubmfypcurugk0r4.ICustomTabsCallback();
            jOnExtraCallbackWithResult = r8lambdar55qr61tuz1pubmfypcurugk0r4.onExtraCallbackWithResult();
            hasmoreelements = null;
            f = 1.0f;
            seekVar = null;
            i = 0;
            i2 = 18781;
        } else {
            jOnExtraCallback = r8lambdar55qr61tuz1pubmfypcurugk0r4.IAuthTabCallbackDefault().onNavigationEvent().onExtraCallback();
            int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
            int iOnExtraCallback4 = ICustomTabsCallbackStubProxy.onExtraCallback();
            jLongValue = ((Long) r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4.onWarmupCompleted(-1140370258, new Object[]{r8lambdar55qr61tuz1pubmfypcurugk0r4}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback4, 1140370260, iOnExtraCallback3)).longValue();
            jICustomTabsCallback = r8lambdar55qr61tuz1pubmfypcurugk0r4.ICustomTabsCallback();
            jOnExtraCallbackWithResult = r8lambdar55qr61tuz1pubmfypcurugk0r4.onExtraCallbackWithResult();
            hasmoreelements = null;
            f = 0.0f;
            seekVar = null;
            i = 0;
            i2 = 240;
        }
        setOrientationDegrees.onWarmupCompleted(setorientationdegrees, jOnExtraCallback, jLongValue, jICustomTabsCallback, jOnExtraCallbackWithResult, hasmoreelements, f, seekVar, i, i2, (Object) null);
        int i5 = onExtraCallback + 15;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
    }

    private static final r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno onWarmupCompleted(setIso setiso, x2ExternalSyntheticLambda0 x2externalsyntheticlambda0, float[] fArr) {
        float fCoerceAtMost;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        float fOnExtraCallback = setiso.onExtraCallback(x2externalsyntheticlambda0.IAuthTabCallbackStub());
        float fOnExtraCallback2 = setiso.onExtraCallback(x2externalsyntheticlambda0.IAuthTabCallbackDefault());
        float fOnExtraCallback3 = setiso.onExtraCallback(x2externalsyntheticlambda0.onTransact());
        float fOnExtraCallback4 = setiso.onExtraCallback(((MappingRedirectableLiveDataExternalSyntheticLambda1) x2ExternalSyntheticLambda0.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), new Object[]{x2externalsyntheticlambda0}, -1147261274, lt.40.onExtraCallbackWithResult(), 1147261275, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult())).asBinder());
        float fOnExtraCallback5 = setiso.onExtraCallback(((MappingRedirectableLiveDataExternalSyntheticLambda1) x2ExternalSyntheticLambda0.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), new Object[]{x2externalsyntheticlambda0}, -1147261274, lt.40.onExtraCallbackWithResult(), 1147261275, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult())).onTransact());
        float fOnExtraCallback6 = setiso.onExtraCallback(r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onWarmupCompleted(((MappingRedirectableLiveDataExternalSyntheticLambda1) x2ExternalSyntheticLambda0.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), new Object[]{x2externalsyntheticlambda0}, -1147261274, lt.40.onExtraCallbackWithResult(), 1147261275, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult())).IAuthTabCallbackDefault()));
        float fOnExtraCallback7 = setiso.onExtraCallback(r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onNavigationEvent(((MappingRedirectableLiveDataExternalSyntheticLambda1) x2ExternalSyntheticLambda0.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), new Object[]{x2externalsyntheticlambda0}, -1147261274, lt.40.onExtraCallbackWithResult(), 1147261275, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult())).IAuthTabCallbackDefault()));
        float fFirst = ArraysKt.first(fArr);
        float fLast = ArraysKt.last(fArr);
        float fAsBinder = x2externalsyntheticlambda0.asBinder() - (fOnExtraCallback / 2.0f);
        float fFloatValue = fFirst - ((Float) x2ExternalSyntheticLambda0.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), new Object[]{x2externalsyntheticlambda0}, 1412967982, lt.40.onExtraCallbackWithResult(), -1412967982, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult())).floatValue();
        float fFloatValue2 = fLast + ((Float) x2ExternalSyntheticLambda0.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), new Object[]{x2externalsyntheticlambda0}, 1412967982, lt.40.onExtraCallbackWithResult(), -1412967982, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult())).floatValue();
        long jOnWarmupCompleted = setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(fFloatValue2 - fFloatValue) & 4294967295L) | (Float.floatToRawIntBits(fOnExtraCallback) << 32));
        float f = fOnExtraCallback3 / 2.0f;
        if (x2externalsyntheticlambda0.onExtraCallbackWithResult() >= 0) {
            int iCoerceAtMost = RangesKt.coerceAtMost(x2externalsyntheticlambda0.onExtraCallbackWithResult(), fArr.length - 1);
            if (x2externalsyntheticlambda0.onExtraCallbackWithResult() < x2externalsyntheticlambda0.asInterface() - 1) {
                fCoerceAtMost = RangesKt.coerceAtMost(fArr[iCoerceAtMost] + x2externalsyntheticlambda0.onWarmupCompleted(), fFloatValue2);
            } else {
                int i4 = onExtraCallback;
                int i5 = i4 + 1;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 69;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                fCoerceAtMost = fFloatValue2;
            }
        } else {
            fCoerceAtMost = fFloatValue;
        }
        long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fAsBinder) << 32) | (Float.floatToRawIntBits(fFloatValue) & 4294967295L));
        long jOnExtraCallback = getAttachedUseCaseConfigs.onExtraCallback((Float.floatToRawIntBits(fOnExtraCallback2) & 4294967295L) | (Float.floatToRawIntBits(fOnExtraCallback2) << 32));
        float f2 = fAsBinder + fOnExtraCallback;
        removeTimestamp removetimestampOnWarmupCompleted = onWarmupCompleted(fAsBinder, fFloatValue, f2, fFloatValue2, fOnExtraCallback2);
        long jOnWarmupCompleted2 = setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(fCoerceAtMost - fFloatValue) & 4294967295L) | (Float.floatToRawIntBits(fOnExtraCallback) << 32));
        RectF rectF = new RectF((fAsBinder - fOnExtraCallback5) + fOnExtraCallback6, (fFloatValue - fOnExtraCallback5) + fOnExtraCallback7, f2 + fOnExtraCallback5 + fOnExtraCallback6, fOnExtraCallback5 + fCoerceAtMost + fOnExtraCallback7);
        Paint paintOnExtraCallback = onExtraCallback(((MappingRedirectableLiveDataExternalSyntheticLambda1) x2ExternalSyntheticLambda0.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), new Object[]{x2externalsyntheticlambda0}, -1147261274, lt.40.onExtraCallbackWithResult(), 1147261275, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult())).onExtraCallback(), fOnExtraCallback4);
        readFully readfullyOnWarmupCompleted = readFully.onExtraCallback.onWarmupCompleted(readFully.Companion, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(x2externalsyntheticlambda0.onNavigationEvent().onExtraCallbackWithResult()), setByteOrder.onNavigationEvent(x2externalsyntheticlambda0.onNavigationEvent().onWarmupCompleted())}), fFloatValue, fCoerceAtMost, 0, 8, (Object) null);
        long jIAuthTabCallback2 = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fAsBinder + f) << 32) | (Float.floatToRawIntBits(fFloatValue + f) & 4294967295L));
        float fCoerceAtLeast = RangesKt.coerceAtLeast(Float.intBitsToFloat((int) (jOnWarmupCompleted >> 32)) - fOnExtraCallback3, 0.0f);
        return new r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno(x2externalsyntheticlambda0, jIAuthTabCallback, jOnWarmupCompleted, jOnExtraCallback, removetimestampOnWarmupCompleted, fCoerceAtMost, jOnWarmupCompleted2, rectF, paintOnExtraCallback, readfullyOnWarmupCompleted, jIAuthTabCallback2, setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(RangesKt.coerceAtLeast(Float.intBitsToFloat((int) jOnWarmupCompleted) - fOnExtraCallback3, 0.0f)) & 4294967295L) | (Float.floatToRawIntBits(fCoerceAtLeast) << 32)), fOnExtraCallback3, fOnExtraCallback2, fFloatValue, null);
    }

    private static final void IAuthTabCallback(setOrientationDegrees setorientationdegrees, r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno r8lambdapqixvm4k_wfc1_gg0aalci54lno) {
        int i = 2 % 2;
        onExtraCallback(setorientationdegrees, r8lambdapqixvm4k_wfc1_gg0aalci54lno);
        if (r8lambdapqixvm4k_wfc1_gg0aalci54lno.onTransact() > r8lambdapqixvm4k_wfc1_gg0aalci54lno.IAuthTabCallback_Parcel()) {
            int i2 = onWarmupCompleted + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            removeTimestamp removetimestampAccess100 = r8lambdapqixvm4k_wfc1_gg0aalci54lno.access100();
            int iOnExtraCallbackWithResult = readUnsignedShort.Companion.onExtraCallbackWithResult();
            setFlashState setflashstateOnExtraCallback = setorientationdegrees.onExtraCallback();
            long jOnExtraCallback = setflashstateOnExtraCallback.onExtraCallback();
            setflashstateOnExtraCallback.onNavigationEvent().onNavigationEvent();
            try {
                setflashstateOnExtraCallback.onTransact().onNavigationEvent(removetimestampAccess100, iOnExtraCallbackWithResult);
                int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                RectF rectF = (RectF) r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -814806163, iOnExtraCallback, 814806165, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{r8lambdapqixvm4k_wfc1_gg0aalci54lno});
                int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                onExtraCallbackWithResult(1214980472, alertWithArgs.onExtraCallbackWithResult(), new Object[]{setorientationdegrees, rectF, Float.valueOf(((Float) r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1436391294, iOnExtraCallback2, 1436391295, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{r8lambdapqixvm4k_wfc1_gg0aalci54lno})).floatValue()), r8lambdapqixvm4k_wfc1_gg0aalci54lno.IAuthTabCallbackDefault()}, -1214980471, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult());
                setOrientationDegrees.onNavigationEvent(setorientationdegrees, r8lambdapqixvm4k_wfc1_gg0aalci54lno.IAuthTabCallback(), r8lambdapqixvm4k_wfc1_gg0aalci54lno.IAuthTabCallbackStubProxy(), r8lambdapqixvm4k_wfc1_gg0aalci54lno.asBinder(), r8lambdapqixvm4k_wfc1_gg0aalci54lno.onExtraCallback(), 0.0f, (hasMoreElements) null, (seek) null, 0, 240, (Object) null);
            } finally {
                setflashstateOnExtraCallback.onNavigationEvent().IAuthTabCallback();
                setflashstateOnExtraCallback.onExtraCallbackWithResult(jOnExtraCallback);
            }
        }
        setOrientationDegrees.onWarmupCompleted(setorientationdegrees, r8lambdapqixvm4k_wfc1_gg0aalci54lno.asInterface().onNavigationEvent().IAuthTabCallback(), r8lambdapqixvm4k_wfc1_gg0aalci54lno.onWarmupCompleted(), r8lambdapqixvm4k_wfc1_gg0aalci54lno.onExtraCallbackWithResult(), r8lambdapqixvm4k_wfc1_gg0aalci54lno.onExtraCallback(), new ExifOutputStream(r8lambdapqixvm4k_wfc1_gg0aalci54lno.onNavigationEvent(), 0.0f, 0, 0, (fromKilometersPerHour) null, 30, (DefaultConstructorMarker) null), 0.0f, (seek) null, 0, 224, (Object) null);
        int i4 = onWarmupCompleted + 9;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onExtraCallback(setOrientationDegrees setorientationdegrees, r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno r8lambdapqixvm4k_wfc1_gg0aalci54lno) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        long jOnExtraCallback = r8lambdapqixvm4k_wfc1_gg0aalci54lno.asInterface().onNavigationEvent().onExtraCallback();
        long jIAuthTabCallbackStubProxy = r8lambdapqixvm4k_wfc1_gg0aalci54lno.IAuthTabCallbackStubProxy();
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        setOrientationDegrees.onWarmupCompleted(setorientationdegrees, jOnExtraCallback, jIAuthTabCallbackStubProxy, ((Long) r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback2, -2014608152, iOnExtraCallback, 2014608152, iOnExtraCallback3, new Object[]{r8lambdapqixvm4k_wfc1_gg0aalci54lno})).longValue(), r8lambdapqixvm4k_wfc1_gg0aalci54lno.onExtraCallback(), (hasMoreElements) null, 0.0f, (seek) null, 0, 240, (Object) null);
        int i4 = onExtraCallback + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final removeTimestamp onWarmupCompleted(float f, float f2, float f3, float f4, float f5) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        removeTimestamp removetimestampOnWarmupCompleted = getMappingAreaSize.onWarmupCompleted();
        removeTimestamp.onExtraCallback(removetimestampOnWarmupCompleted, RoundRectKt.onExtraCallbackWithResult(f, f2, f3, f4, f5, f5), (removeTimestamp.onNavigationEvent) null, 2, (Object) null);
        int i4 = onExtraCallback + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return removetimestampOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        setOrientationDegrees setorientationdegrees = (setOrientationDegrees) objArr[0];
        RectF rectF = (RectF) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        Paint paint = (Paint) objArr[3];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            ExecutedBy.onExtraCallback(setorientationdegrees.onExtraCallback().onNavigationEvent()).drawRoundRect(rectF, fFloatValue, fFloatValue, paint);
            return null;
        }
        ExecutedBy.onExtraCallback(setorientationdegrees.onExtraCallback().onNavigationEvent()).drawRoundRect(rectF, fFloatValue, fFloatValue, paint);
        throw null;
    }

    private static final Paint onExtraCallback(long j, float f) {
        int i = 2 % 2;
        Paint paint = new Paint(1);
        paint.setColor(ByteOrderedDataOutputStream.onNavigationEvent(j));
        paint.setMaskFilter(new BlurMaskFilter(f, BlurMaskFilter.Blur.OUTER));
        int i2 = onWarmupCompleted + 1;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return paint;
        }
        throw null;
    }

    public static final /* synthetic */ r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4 onExtraCallbackWithResult(setIso setiso, r8lambdaR67rFjO_P8h7SpCUFgnHuCLzjx4 r8lambdar67rfjo_p8h7spcufgnhuclzjx4, float[] fArr) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return (r8lambdaR55qR61tUZ1PUBmFyPCurUgK0R4) onExtraCallbackWithResult(1768021428, alertWithArgs.onExtraCallbackWithResult(), new Object[]{setiso, r8lambdar67rfjo_p8h7spcufgnhuclzjx4, fArr}, -1768021428, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ void onNavigationEvent(setOrientationDegrees setorientationdegrees, r8lambdapQIxvm4K_WFC1_Gg0AAlCi54lno r8lambdapqixvm4k_wfc1_gg0aalci54lno) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        onExtraCallbackWithResult(-1080738064, alertWithArgs.onExtraCallbackWithResult(), new Object[]{setorientationdegrees, r8lambdapqixvm4k_wfc1_gg0aalci54lno}, 1080738066, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final void onExtraCallbackWithResult(setOrientationDegrees setorientationdegrees, RectF rectF, float f, Paint paint) {
        onExtraCallbackWithResult(1214980472, alertWithArgs.onExtraCallbackWithResult(), new Object[]{setorientationdegrees, rectF, Float.valueOf(f), paint}, -1214980471, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult());
    }
}
