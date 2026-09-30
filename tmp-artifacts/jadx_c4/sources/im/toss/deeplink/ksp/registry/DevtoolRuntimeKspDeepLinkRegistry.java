package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.devtool.runtime.data.util.DevToolActionActivity;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DevtoolRuntimeKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static char[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static boolean onNavigationEvent = false;
    private static int onTransact = 1;
    private static boolean onWarmupCompleted;

    /* renamed from: $r8$lambda$gNXuWKhk2b-3_jjV5rJ58ffOpx4, reason: not valid java name */
    public static /* synthetic */ Class m105$r8$lambda$gNXuWKhk2b3_jjV5rJ58ffOpx4() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = IAuthTabCallbackDefault + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$0;
    }

    static {
        IAuthTabCallback();
        int i = asBinder + 15;
        onTransact = i % 128;
        if (i % 2 == 0) {
            int i2 = 47 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DevtoolRuntimeKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-116, -121, -121, -122, -117, -124, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, 127 - Color.green(0), objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.DevtoolRuntimeKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 15;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    DevtoolRuntimeKspDeepLinkRegistry.m105$r8$lambda$gNXuWKhk2b3_jjV5rJ58ffOpx4();
                    throw null;
                }
                Class clsM105$r8$lambda$gNXuWKhk2b3_jjV5rJ58ffOpx4 = DevtoolRuntimeKspDeepLinkRegistry.m105$r8$lambda$gNXuWKhk2b3_jjV5rJ58ffOpx4();
                int i3 = onNavigationEvent + 49;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    return clsM105$r8$lambda$gNXuWKhk2b3_jjV5rJ58ffOpx4;
                }
                throw null;
            }
        }, CollectionsKt.listOf(TargetRegion.KR)))));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 101;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return DevToolActionActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallback;
        if (cArr2 != null) {
            int i4 = $11 + 95;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 125;
                $10 = i7 % 128;
                int i8 = i7 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), ImageFormat.getBitsPerPixel(0) + 78, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), ExpandableListView.getPackedPositionType(0L) + 75, TextUtils.indexOf("", "") + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i9 = 1052772399;
        if (onWarmupCompleted) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i9);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 63 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i9 = 1052772399;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onNavigationEvent) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i10 = $11 + 51;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i12 = $10 + 75;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                int i14 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
                cArr6[i13] = (char) (cArr2[cArr[0 - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] / iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 64 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 12214 - Color.green(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), Drawable.resolveOpacity(0, 0) + 63, TextUtils.indexOf("", "") + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            int i15 = $11 + 71;
            $10 = i15 % 128;
            int i16 = i15 % 2;
        }
        objArr[0] = new String(cArr6);
    }

    static void IAuthTabCallback() {
        onExtraCallback = new char[]{32401, 32407, 32412, 32615, 32402, 32400, 32413, 32586, 32605, 32608, 32406, 32408};
        IAuthTabCallback = -1184334068;
        onNavigationEvent = true;
        onWarmupCompleted = true;
    }
}
