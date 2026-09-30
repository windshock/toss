package im.toss.deeplink.ksp.registry;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.tosspoint.global.GlobalMyPointActivity;
import im.toss.features.tosspoint.global.GlobalPointAmountActivity;
import im.toss.features.tosspoint.kr.PointAmountActivity;
import im.toss.features.tosspoint.kr.PointResetTransparentActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesTosspointKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static char onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Class $r8$lambda$0S3wnbRKEwz69EBGOXKmjcdGXxI() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$3();
        }
        _init_$lambda$3();
        throw null;
    }

    /* renamed from: $r8$lambda$39PJVg0vGn5HKGLya3waJ9uDj-0, reason: not valid java name */
    public static /* synthetic */ Class m244$r8$lambda$39PJVg0vGn5HKGLya3waJ9uDj0() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i4 = IAuthTabCallback + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return cls_init_$lambda$2;
    }

    public static /* synthetic */ Class $r8$lambda$Ce3dUG0hlCdABc8kQjoe9N0HDpI() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = onWarmupCompleted + 75;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$0;
    }

    public static /* synthetic */ Class $r8$lambda$v6ZXgqRJWcmJIbjk0Wkh8Oc2j48() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            _init_$lambda$1();
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i3 = IAuthTabCallback + 1;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return cls_init_$lambda$1;
        }
        throw null;
    }

    static {
        onWarmupCompleted();
        int i = IAuthTabCallbackStub + 35;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public FeaturesTosspointKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosspointKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return FeaturesTosspointKspDeepLinkRegistry.$r8$lambda$Ce3dUG0hlCdABc8kQjoe9N0HDpI();
                }
                FeaturesTosspointKspDeepLinkRegistry.$r8$lambda$Ce3dUG0hlCdABc8kQjoe9N0HDpI();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        TargetRegion targetRegion = TargetRegion.GLOBAL;
        Object[] objArr = new Object[1];
        a(new char[]{21, 11, 24, '\t', 22, 7, 16, 21, 19, 11, 13782, 13782, 0, 18, '\r', 6, 5, 20, 18, '\r', 0, 2, 3, 24, 17, 3, '\f', 0, 3, 5, 14, 23, '\r', 11, 16, 14, 16, 3, 13839}, (byte) ((Process.myTid() >> 22) + 33), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 40, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new char[]{21, 11, 24, '\t', 22, 7, 16, 21, 19, 11, 13862, 13862, 0, 18, '\r', 6, 5, 20, 14, 18, '\r', 16, 2, 3, '\f', 18, 3, 24, 11, 6, 13935}, (byte) (113 - KeyEvent.getDeadChar(0, 0)), 31 - ExpandableListView.getPackedPositionType(0L), objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosspointKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 125;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$v6ZXgqRJWcmJIbjk0Wkh8Oc2j48 = FeaturesTosspointKspDeepLinkRegistry.$r8$lambda$v6ZXgqRJWcmJIbjk0Wkh8Oc2j48();
                int i4 = onNavigationEvent + 31;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$v6ZXgqRJWcmJIbjk0Wkh8Oc2j48;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Function0 function02 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosspointKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                Class clsM244$r8$lambda$39PJVg0vGn5HKGLya3waJ9uDj0;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 13;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    clsM244$r8$lambda$39PJVg0vGn5HKGLya3waJ9uDj0 = FeaturesTosspointKspDeepLinkRegistry.m244$r8$lambda$39PJVg0vGn5HKGLya3waJ9uDj0();
                    int i3 = 85 / 0;
                } else {
                    clsM244$r8$lambda$39PJVg0vGn5HKGLya3waJ9uDj0 = FeaturesTosspointKspDeepLinkRegistry.m244$r8$lambda$39PJVg0vGn5HKGLya3waJ9uDj0();
                }
                int i4 = onWarmupCompleted + 107;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return clsM244$r8$lambda$39PJVg0vGn5HKGLya3waJ9uDj0;
            }
        };
        TargetRegion targetRegion2 = TargetRegion.KR;
        Object[] objArr3 = new Object[1];
        a(new char[]{21, 11, 24, '\t', 22, 7, 16, 21, 19, 11, 13843, 13843, 16, 14, 16, 3, 3, '\f', 19, 2, 21, '\b', 6, 1}, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 95), View.combineMeasuredStates(0, 0) + 24, objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(function02, CollectionsKt.listOf(targetRegion2)));
        Object[] objArr4 = new Object[1];
        a(new char[]{21, 11, 24, '\t', 22, 7, 16, 21, 19, 11, 13803, 13803, 16, 14, 16, 3, 3, '\f', 19, 2, 19, 1, 13860}, (byte) (54 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), ((Process.getThreadPriority(0) + 20) >> 6) + 23, objArr4);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosspointKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 109;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$0S3wnbRKEwz69EBGOXKmjcdGXxI = FeaturesTosspointKspDeepLinkRegistry.$r8$lambda$0S3wnbRKEwz69EBGOXKmjcdGXxI();
                int i4 = onNavigationEvent + 69;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$0S3wnbRKEwz69EBGOXKmjcdGXxI;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion2)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 45;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 99;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return GlobalMyPointActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return GlobalPointAmountActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return PointAmountActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 36 / 0;
        }
        return PointResetTransparentActivity.class;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        char c;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = onExtraCallbackWithResult;
        Object obj2 = null;
        if (cArr3 != null) {
            int i5 = $11 + 17;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 23139 - View.MeasureSpec.makeMeasureSpec(0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        char c2 = '0';
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), AndroidCharacter.getMirror('0') - 22, 23139 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
            int i6 = $10 + 41;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    c = c2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 24824), 74 - TextUtils.indexOf("", ""), 8089 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            c = '0';
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 30, TextUtils.lastIndexOf("", '0', 0, 0) + 19489, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c = '0';
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i8 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i8];
                    } else {
                        obj = null;
                        c = '0';
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i9 = $10 + 77;
                            $11 = i9 % 128;
                            int i10 = i9 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i11];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i12];
                        } else {
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i13];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i14];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
                c2 = c;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new char[]{64978, 64989, 64967, 64980, 64982, 65065, 64966, 65069, 64977, 65066, 64926, 64988, 64970, 64924, 64905, 64991, 64960, 64961, 64986, 64963, 65064, 64983, 65067, 64981, 64990};
        onNavigationEvent = (char) 51244;
    }
}
