package com.swmansion.rnscreens.gamma.stack.screen;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.RNSStackScreenManagerDelegate;
import com.facebook.react.viewmanagers.RNSStackScreenManagerInterface;
import com.swmansion.rnscreens.gamma.stack.screen.StackScreen;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(IAuthTabCallback = StackScreenViewManager.REACT_CLASS)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class StackScreenViewManager extends ViewGroupManager<StackScreen> implements RNSStackScreenManagerInterface<StackScreen> {
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    public static final String REACT_CLASS = "RNSStackScreen";
    private static int onExtraCallback;
    private final r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<StackScreen> delegate;
    private static final byte[] $$a = {48, -42, 66, -37};
    private static final int $$b = 19;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 0;

    private static String $$c(short s, byte b, short s2) {
        int i = 105 - (b * 4);
        int i2 = s2 * 3;
        int i3 = s + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i = i3 + (-i2);
            i3 = i3;
        }
        while (true) {
            i4++;
            int i5 = i3 + 1;
            bArr2[i4] = (byte) i;
            if (i4 == i2) {
                return new String(bArr2, 0);
            }
            i += -bArr[i5];
            i3 = i5;
        }
    }

    static {
        onExtraCallback = 1;
        onWarmupCompleted();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = onWarmupCompleted + 83;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 84 / 0;
        }
    }

    public StackScreenViewManager() {
        super((ReactApplicationContext) null, 1, (DefaultConstructorMarker) null);
        this.delegate = new RNSStackScreenManagerDelegate(this);
    }

    public /* bridge */ /* synthetic */ void addEventEmitters(CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2, View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        addEventEmitters(credentialProviderGetSignInIntentControllerhandleResponse2, (StackScreen) view);
        int i4 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ View createViewInstance(CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        StackScreen stackScreenM17createViewInstance = m17createViewInstance(credentialProviderGetSignInIntentControllerhandleResponse2);
        int i4 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return stackScreenM17createViewInstance;
    }

    public /* bridge */ /* synthetic */ void setActivityMode(View view, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        setActivityMode((StackScreen) view, str);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void setScreenKey(View view, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setScreenKey((StackScreen) view, str);
        if (i3 != 0) {
            throw null;
        }
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return REACT_CLASS;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<StackScreen> getDelegate() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.delegate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: createViewInstance, reason: collision with other method in class */
    protected StackScreen m17createViewInstance(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        StackScreen stackScreen = new StackScreen(credentialProviderGetSignInIntentControllerhandleResponse2);
        int i2 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return stackScreen;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void addEventEmitters(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2, @NotNull StackScreen stackScreen) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        Intrinsics.checkNotNullParameter(stackScreen, "");
        super/*com.facebook.react.uimanager.BaseViewManager*/.addEventEmitters(credentialProviderGetSignInIntentControllerhandleResponse2, stackScreen);
        stackScreen.onViewManagerAddEventEmitters$react_native_screens_release();
        int i4 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.react.bridge.JSApplicationIllegalArgumentException */
    public void setActivityMode(@NotNull StackScreen stackScreen, @Nullable String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(stackScreen, "");
        if (Intrinsics.areEqual(str, "attached")) {
            stackScreen.setActivityMode(StackScreen.ActivityMode.ATTACHED);
            return;
        }
        Object[] objArr = new Object[1];
        b(6 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 8 - View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{14, 65531, 65533, 2, 65535, 65534, 65534, 65535}, 147 - TextUtils.indexOf("", "", 0), false, objArr);
        if (!Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
            throw new JSApplicationIllegalArgumentException("[RNScreens] Invalid activity mode: " + str + ".");
        }
        int i4 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            stackScreen.setActivityMode(StackScreen.ActivityMode.DETACHED);
            return;
        }
        stackScreen.setActivityMode(StackScreen.ActivityMode.DETACHED);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setScreenKey(@NotNull StackScreen stackScreen, @Nullable String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(stackScreen, "");
        if (str == null) {
            throw new IllegalArgumentException("[RNScreens] screenKey must not be null.");
        }
        int i2 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            stackScreen.setScreenKey(str);
            throw null;
        }
        stackScreen.setScreenKey(str);
        int i3 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 30 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        Throwable cause;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = -1;
            i5 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16812341), (Process.myPid() >> 22) + 23, KeyEvent.normalizeMetaState(0) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12842), (ViewConfiguration.getLongPressTimeout() >> 16) + 55, View.MeasureSpec.makeMeasureSpec(0, 0) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i8 = $11 + 49;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i10 = $10 + 79;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) i4;
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 12843), 54 - TextUtils.lastIndexOf("", '0', 0), 2167 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i12 = $10 + 69;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                i4 = -1;
                i5 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = 478308868;
    }
}
