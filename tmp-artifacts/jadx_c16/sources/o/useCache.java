package o;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.ui.compose.dst.personal_activity.ComposableSingletons$PersonalActivityProfileAvatarStackKt$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.setHasWhiteScreen;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class useCache {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean IAuthTabCallback = false;
    private static boolean IAuthTabCallbackDefault = false;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    public static final useCache onExtraCallback;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted;

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 95;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackStub + 5;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onWarmupCompleted;
        int i5 = i3 + 75;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return function2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallback();
        onExtraCallback = new useCache();
        onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-1060228616, false, new ComposableSingletons$PersonalActivityProfileAvatarStackKt$.ExternalSyntheticLambda0());
        int i = asInterface + 107;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 109;
        IAuthTabCallbackStub = i3 % 128;
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 4) != 2, i & 1))) {
            int i4 = onTransact + 113;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1060228616, i, -1, "im.toss.features.home.core.ui.compose.dst.personal_activity.ComposableSingletons$PersonalActivityProfileAvatarStackKt.lambda$-1060228616.<anonymous> (PersonalActivityProfileAvatarStack.kt:110)");
            }
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-112, -113, -125, -116, -119, -122, -118, -114, -115, -116, -121, -117, -125, -118, -119, -120, -121, -122, -122, -123, -124, -125, -126, -126, -127}, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-112, -113, -125, -116, -111, -122, -118, -114, -115, -116, -121, -117, -125, -118, -119, -120, -121, -122, -122, -123, -124, -125, -126, -126, -127}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, objArr2);
            List listListOf = CollectionsKt.listOf(new String[]{strIntern, ((String) objArr2[0]).intern()});
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                arrayList.add(new setHasWhiteScreen.IAuthTabCallback((String) it.next(), (String) null, 1.0f, (String) null, false, 0, 16, (DefaultConstructorMarker) null));
            }
            ExtensionPointProxyGenerator.IAuthTabCallback(arrayList, 3, (QuirksExternalSyntheticBackport0) null, 0.0f, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 48, 28);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onExtraCallbackWithResult;
        if (cArr3 != null) {
            int i5 = $11 + 81;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i6 = $10 + 97;
                $11 = i6 % 128;
                if (i6 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), TextUtils.lastIndexOf("", '0') + 78, 20951 - ExpandableListView.getPackedPositionChild(0L), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr2[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i2])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 77 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i2++;
                }
                i3 = 2;
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 76, 16038 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
            if (IAuthTabCallbackDefault) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 62 - ImageFormat.getBitsPerPixel(0), 12213 - ExpandableListView.getPackedPositionChild(0L), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    int i7 = $11 + 15;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i9 = $11 + 37;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.getDefaultSize(0, 0) + 63, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            String str = new String(cArr6);
            int i11 = $11 + 71;
            $10 = i11 % 128;
            if (i11 % 2 == 0) {
                objArr[0] = str;
            } else {
                int i12 = 63 / 0;
                objArr[0] = str;
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = new char[]{32602, 32598, 32594, 32599, 32520, 32531, 32549, 32586, 32545, 32605, 32606, 32540, 32551, 32595, 32604, 32603, 32544};
        onNavigationEvent = -1184333886;
        IAuthTabCallback = true;
        IAuthTabCallbackDefault = true;
    }
}
