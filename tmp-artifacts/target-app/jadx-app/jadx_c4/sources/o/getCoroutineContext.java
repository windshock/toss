package o;

import android.app.Dialog;
import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.uikit.base.UIKitBaseActivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getCoroutineContext implements SidecarCompatExternalSyntheticLambda0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    @Inject
    public getCoroutineContext() {
    }

    @Override // o.SidecarCompatExternalSyntheticLambda0
    public void IAuthTabCallback(@Nullable EventServiceImpl eventServiceImpl) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1374191703);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 14 - KeyEvent.normalizeMetaState(0), ExpandableListView.getPackedPositionType(0L) + 24779, 1621655239, false, "onExtraCallback", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object[] objArr = {eventServiceImpl};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(461170831);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 24780 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 708580895, false, "onNavigationEvent", new Class[]{EventServiceImpl.class});
            }
            ((Method) objOnExtraCallback2).invoke(obj, objArr);
            int i4 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // o.SidecarCompatExternalSyntheticLambda0
    public void onWarmupCompleted(@NotNull UIKitBaseActivity uIKitBaseActivity, boolean z, @Nullable Dialog dialog) throws Throwable {
        DimensionPropConverterCompanion dimensionPropConverterCompanion;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(uIKitBaseActivity, "");
        if (dialog instanceof DimensionPropConverterCompanion) {
            int i2 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            dimensionPropConverterCompanion = (DimensionPropConverterCompanion) dialog;
        } else {
            dimensionPropConverterCompanion = null;
        }
        if (dimensionPropConverterCompanion != null) {
            int i4 = onExtraCallbackWithResult + 53;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1374191703);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 13 - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.getOffsetBefore("", 0) + 24779, 1621655239, false, "onExtraCallback", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object[] objArr = {uIKitBaseActivity, Boolean.valueOf(z), (DimensionPropConverterCompanion) dialog};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-964382341);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 14 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 24779, -138129429, false, "onWarmupCompleted", new Class[]{UIKitBaseActivity.class, Boolean.TYPE, DimensionPropConverterCompanion.class});
                }
                ((Method) objOnExtraCallback2).invoke(obj, objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    @Override // o.SidecarCompatExternalSyntheticLambda0
    public boolean IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1374191703);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), View.resolveSizeAndState(0, 0, 0) + 14, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 24778, 1621655239, false, "onExtraCallback", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1885931576);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), Color.alpha(0) + 14, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24779, -1093269160, false, "onWarmupCompleted", new Class[0]);
            }
            boolean zBooleanValue = ((Boolean) ((Method) objOnExtraCallback2).invoke(obj, null)).booleanValue();
            int i4 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return zBooleanValue;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
