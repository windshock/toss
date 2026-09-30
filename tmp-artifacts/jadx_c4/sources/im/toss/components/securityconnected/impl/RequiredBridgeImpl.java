package im.toss.components.securityconnected.impl;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgc;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.PausedInDebuggerOverlayDialogManagerExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.core.AppStateManager;
import viva.republica.toss.tossjni.RequiredBridge;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RequiredBridgeImpl implements RequiredBridge {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    @Inject
    public RequiredBridgeImpl() {
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AppStateManager appStateManager = AppStateManager.onExtraCallbackWithResult;
        if (i3 == 0) {
            return appStateManager.onPostMessage();
        }
        appStateManager.onPostMessage();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull String str, @Nullable String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, str, str2, null, null, true, null, 32, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        int i4 = onWarmupCompleted + 107;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onNavigationEvent(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        IAuthTabCallback = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-833316231);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (27431 - Color.alpha(0)), 4 - TextUtils.getOffsetAfter("", 0), 19462 - TextUtils.getOffsetAfter("", 0), -15440663, false, "onNavigationEvent", (Class[]) null);
                }
                Object obj = ((Field) objOnExtraCallback).get(null);
                Object[] objArr = {str};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(523154521);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 27431), (KeyEvent.getMaxKeyCode() >> 16) + 4, Color.blue(0) + 19462, 778980041, false, "onExtraCallback", new Class[]{String.class});
                }
                ((Method) objOnExtraCallback2).invoke(obj, objArr);
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-833316231);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27431), 4 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getJumpTapTimeout() >> 16) + 19462, -15440663, false, "onNavigationEvent", (Class[]) null);
            }
            Object obj2 = ((Field) objOnExtraCallback3).get(null);
            Object[] objArr2 = {str};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(523154521);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (27431 - TextUtils.getOffsetBefore("", 0)), 4 - Color.green(0), MotionEvent.axisFromString("") + 19463, 778980041, false, "onExtraCallback", new Class[]{String.class});
            }
            ((Method) objOnExtraCallback4).invoke(obj2, objArr2);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public void onNavigationEvent(@NotNull String str, @NotNull String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-833316231);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16804647), TextUtils.indexOf((CharSequence) "", '0') + 5, ExpandableListView.getPackedPositionChild(0L) + 19463, -15440663, false, "onNavigationEvent", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object[] objArr = {str, str2};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1762408591);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16749785) - Color.rgb(0, 0, 0)), 3 - TextUtils.lastIndexOf("", '0', 0), KeyEvent.getDeadChar(0, 0) + 19462, -1481426463, false, "onWarmupCompleted", new Class[]{String.class, String.class});
            }
            ((Method) objOnExtraCallback2).invoke(obj, objArr);
            int i4 = IAuthTabCallback + 77;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 77 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            PausedInDebuggerOverlayDialogManagerExternalSyntheticLambda1.IAuthTabCallback.onWarmupCompleted(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        PausedInDebuggerOverlayDialogManagerExternalSyntheticLambda1.IAuthTabCallback.onWarmupCompleted(str);
        int i3 = onWarmupCompleted + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }
}
