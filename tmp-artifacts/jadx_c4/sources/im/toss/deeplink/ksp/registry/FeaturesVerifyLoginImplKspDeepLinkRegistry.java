package im.toss.deeplink.ksp.registry;

import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.verify.login.impl.screen.CreatePasskeyActivity;
import im.toss.features.verify.login.impl.screen.CreatePasskeyFullPageActivity;
import im.toss.features.verify.login.impl.screen.OnboardingTossploreDevActivity;
import im.toss.features.verify.login.impl.screen.OnboardingTossploreSchemeActivity;
import im.toss.features.verify.login.impl.screen.PasskeySettingActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesVerifyLoginImplKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static int IAuthTabCallback;
    private static int asInterface;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static byte[] onNavigationEvent;
    private static short[] onWarmupCompleted;
    private static final byte[] $$a = {87, -2, 11, -41};
    private static final int $$b = 113;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, short s) {
        int i2;
        int i3 = (s * 2) + 4;
        int i4 = 1 - (i * 2);
        byte[] bArr = $$a;
        int i5 = 115 - (b * 3);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i5 += i6;
            i3++;
            bArr2[i2] = (byte) i5;
            i2++;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i3];
            i5 += i6;
            i3++;
            bArr2[i2] = (byte) i5;
            i2++;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i2++;
            if (i2 == i4) {
            }
        }
    }

    /* renamed from: $r8$lambda$FOxji5JmK_Cgh-mFoO4jFpRKPqM, reason: not valid java name */
    public static /* synthetic */ Class m251$r8$lambda$FOxji5JmK_CghmFoO4jFpRKPqM() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$0();
        }
        _init_$lambda$0();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$OZH8WBNX_mRfcmVgpwyjQr841Xs() {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$4 = _init_$lambda$4();
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return cls_init_$lambda$4;
    }

    public static /* synthetic */ Class $r8$lambda$gCBWON3M6iiwG0h0lBpB9Es8PR4() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$2();
        }
        _init_$lambda$2();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$hIVznacOI5MUSDm40aFhACGhmJU() {
        Class cls_init_$lambda$3;
        int i = 2 % 2;
        int i2 = asBinder + 39;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            cls_init_$lambda$3 = _init_$lambda$3();
            int i3 = 17 / 0;
        } else {
            cls_init_$lambda$3 = _init_$lambda$3();
        }
        int i4 = IAuthTabCallbackStub + 81;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$3;
    }

    /* renamed from: $r8$lambda$sM3IXpFmY55Zf2-JUA1MXRMY9SI, reason: not valid java name */
    public static /* synthetic */ Class m252$r8$lambda$sM3IXpFmY55Zf2JUA1MXRMY9SI() {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i4 = IAuthTabCallbackStub + 33;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$1;
    }

    static {
        asInterface = 1;
        onWarmupCompleted();
        int i = onTransact + 63;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public FeaturesVerifyLoginImplKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesVerifyLoginImplKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 15;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class clsM251$r8$lambda$FOxji5JmK_CghmFoO4jFpRKPqM = FeaturesVerifyLoginImplKspDeepLinkRegistry.m251$r8$lambda$FOxji5JmK_CghmFoO4jFpRKPqM();
                int i4 = onWarmupCompleted + 19;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 98 / 0;
                }
                return clsM251$r8$lambda$FOxji5JmK_CghmFoO4jFpRKPqM;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a((short) ((Process.getThreadPriority(0) + 20) >> 6), (byte) ((-38) - TextUtils.getCapsMode("", 0, 0)), (-1660453186) - TextUtils.lastIndexOf("", '0', 0, 0), (-1011054662) + TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.indexOf((CharSequence) "", '0') - 39, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a((short) (ViewConfiguration.getEdgeSlop() >> 16), (byte) ((-53) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (-1660453160) - TextUtils.indexOf("", "", 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 1011054663, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 32, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesVerifyLoginImplKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 83;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM252$r8$lambda$sM3IXpFmY55Zf2JUA1MXRMY9SI = FeaturesVerifyLoginImplKspDeepLinkRegistry.m252$r8$lambda$sM3IXpFmY55Zf2JUA1MXRMY9SI();
                int i4 = onExtraCallbackWithResult + 85;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return clsM252$r8$lambda$sM3IXpFmY55Zf2JUA1MXRMY9SI;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a((short) (AndroidCharacter.getMirror('0') - '0'), (byte) ((-117) - View.resolveSizeAndState(0, 0, 0)), (-1660453126) - (ViewConfiguration.getEdgeSlop() >> 16), View.getDefaultSize(0, 0) - 1011054663, View.getDefaultSize(0, 0) - 30, objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesVerifyLoginImplKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 113;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesVerifyLoginImplKspDeepLinkRegistry.$r8$lambda$gCBWON3M6iiwG0h0lBpB9Es8PR4();
                }
                FeaturesVerifyLoginImplKspDeepLinkRegistry.$r8$lambda$gCBWON3M6iiwG0h0lBpB9Es8PR4();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a((short) ExpandableListView.getPackedPositionType(0L), (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) - 53), (-1660453092) - ((byte) KeyEvent.getModifierMetaStateMask()), (-1011054663) - ((Process.getThreadPriority(0) + 20) >> 6), AndroidCharacter.getMirror('0') - ']', objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesVerifyLoginImplKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 83;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$hIVznacOI5MUSDm40aFhACGhmJU = FeaturesVerifyLoginImplKspDeepLinkRegistry.$r8$lambda$hIVznacOI5MUSDm40aFhACGhmJU();
                int i4 = onExtraCallbackWithResult + 99;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$hIVznacOI5MUSDm40aFhACGhmJU;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr5 = new Object[1];
        a((short) KeyEvent.keyCodeFromString(""), (byte) (Gravity.getAbsoluteGravity(0, 0) - 82), (-1660453071) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-1011054663) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (-39) - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr5);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesVerifyLoginImplKspDeepLinkRegistry$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    FeaturesVerifyLoginImplKspDeepLinkRegistry.$r8$lambda$OZH8WBNX_mRfcmVgpwyjQr841Xs();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Class cls$r8$lambda$OZH8WBNX_mRfcmVgpwyjQr841Xs = FeaturesVerifyLoginImplKspDeepLinkRegistry.$r8$lambda$OZH8WBNX_mRfcmVgpwyjQr841Xs();
                int i3 = onNavigationEvent + 89;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$OZH8WBNX_mRfcmVgpwyjQr841Xs;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 105;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 5;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return CreatePasskeyActivity.class;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return CreatePasskeyFullPageActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 97;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 87;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return OnboardingTossploreDevActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return OnboardingTossploreSchemeActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$4() {
        Class<PasskeySettingActivity> cls;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 45;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            cls = PasskeySettingActivity.class;
            int i4 = 60 / 0;
        } else {
            cls = PasskeySettingActivity.class;
        }
        int i5 = i2 + 19;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return cls;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 43424), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 42, 22438 - TextUtils.lastIndexOf("", '0'), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 29;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 == 0) {
                j = -4629411779493505016L;
            } else {
                byte[] bArr2 = onNavigationEvent;
                if (bArr2 != null) {
                    int i9 = $10 + 121;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i5])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.indexOf("", "", 0, 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 55, 2167 - (ViewConfiguration.getJumpTapTimeout() >> 16), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr[i5] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i5++;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    int i10 = $10 + 37;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    byte[] bArr3 = onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - MotionEvent.axisFromString("")), 42 - View.MeasureSpec.getSize(0), 22439 - (ViewConfiguration.getTapTimeout() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                    int i12 = $11 + 47;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ j)) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 86 - TextUtils.getCapsMode("", 0, 0), TextUtils.getCapsMode("", 0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onNavigationEvent;
                if (bArr4 != null) {
                    int i14 = $11 + 17;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        int i17 = $10 + 79;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                        bArr5[i16] = (byte) (bArr4[i16] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i19 = $10 + 97;
                    $11 = i19 % 128;
                    boolean z = i19 % 2 != 0;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (!z) {
                            short[] sArr = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            int i20 = $11 + 97;
                            $10 = i20 % 128;
                            if (i20 % 2 != 0) {
                                byte[] bArr6 = onNavigationEvent;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback << (((byte) (((byte) (bArr6[r7] | (-4629411779493505016L))) + s)) ^ b));
                            } else {
                                byte[] bArr7 = onNavigationEvent;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                                sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                            }
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onWarmupCompleted() {
        onExtraCallback = -960538295;
        IAuthTabCallback = -1538795446;
        onExtraCallbackWithResult = -1744527182;
        onNavigationEvent = new byte[]{35, -63, 46, 33, -35, -26, 100, -58, 40, 42, -46, -64, 35, -109, -46, 39, 21, -46, -42, 41, -48, -33, 39, 41, -48, 60, -60, 51, -58, -62, 53, -51, -5, 10, 51, -47, 62, 49, -51, -10, 116, -42, 56, 58, -62, -48, 51, -125, -62, 55, 5, -62, -58, 57, -64, -49, 55, 57, -64, -110, -126, -76, 75, 112, Byte.MIN_VALUE, Byte.MIN_VALUE, Byte.MAX_VALUE, 126, -125, -121, 120, -58, 75, 122, -122, -122, 113, -110, 113, -114, 119, 124, -61, -125, 118, 68, -125, -121, 120, -127, -114, 118, 120, -127, 48, -64, -64, 63, 62, -61, -57, 56, -122, -61, 54, 4, -61, -57, 56, -63, -50, 54, 56, -63, 95, -93, 83, -90, -87, 84, -30, 16, -78, 92, 94, -90, -76, 87, -25, -90, 83, AbstractSmartcard.BYTE_READ_MORE, -90, -94, 93, -92, -85, 83, 93, -92, 8, 8, 8, 8, 8};
    }
}
