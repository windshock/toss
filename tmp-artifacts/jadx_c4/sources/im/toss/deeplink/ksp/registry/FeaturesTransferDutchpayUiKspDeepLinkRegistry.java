package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.FileViewerActivityDividerGridItemDecoration;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesTransferDutchpayUiKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static char onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;

    /* renamed from: $r8$lambda$DADRoJXN-bdBu0lsLIwDT5z-Qpo, reason: not valid java name */
    public static /* synthetic */ Class m245$r8$lambda$DADRoJXNbdBu0lsLIwDT5zQpo() {
        Class cls_init_$lambda$0;
        int i = 2 % 2;
        int i2 = asInterface + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            cls_init_$lambda$0 = _init_$lambda$0();
            int i3 = 20 / 0;
        } else {
            cls_init_$lambda$0 = _init_$lambda$0();
        }
        int i4 = onExtraCallbackWithResult + 15;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$0;
        }
        throw null;
    }

    static {
        onWarmupCompleted();
        int i = IAuthTabCallbackStub + 29;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeaturesTransferDutchpayUiKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{21264, 60538, 28630, 8144, 24404, 59042, 60507, 40744, 36127, 61472, 7881, 57203, 5710, 42185, 52052, 15491, 37517, 14621, 50083, 3045, 54621, 15153, 14994, 38350, 36173, 55707, 10812, 65480, 60990, 8343}, View.MeasureSpec.makeMeasureSpec(0, 0) + 29, objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTransferDutchpayUiKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 33;
                onWarmupCompleted = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    FeaturesTransferDutchpayUiKspDeepLinkRegistry.m245$r8$lambda$DADRoJXNbdBu0lsLIwDT5zQpo();
                    obj.hashCode();
                    throw null;
                }
                Class clsM245$r8$lambda$DADRoJXNbdBu0lsLIwDT5zQpo = FeaturesTransferDutchpayUiKspDeepLinkRegistry.m245$r8$lambda$DADRoJXNbdBu0lsLIwDT5zQpo();
                int i3 = onExtraCallback + 115;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    return clsM245$r8$lambda$DADRoJXNbdBu0lsLIwDT5zQpo;
                }
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(TargetRegion.KR)))));
    }

    private static final Class _init_$lambda$0() {
        Class<FileViewerActivityDividerGridItemDecoration> cls;
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 9;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            cls = FileViewerActivityDividerGridItemDecoration.class;
            int i4 = 63 / 0;
        } else {
            cls = FileViewerActivityDividerGridItemDecoration.class;
        }
        int i5 = i2 + 79;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return cls;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = $10 + 5;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(i3));
                        int pressedStateDuration = 10 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(i3) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(bitsPerPixel, pressedStateDuration, iNormalizeMetaState, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 10 - View.MeasureSpec.getMode(0), Color.green(0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 16013), 14 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i10 = $10 + 37;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = (char) 7063;
        onNavigationEvent = (char) 16845;
        onExtraCallback = (char) 48089;
        onWarmupCompleted = (char) 62184;
    }
}
