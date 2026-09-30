package im.toss.uikit.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ICrashFilter;
import o.MiniAppModule_postMessage;
import o.TossModule_domainLog;
import o.TossModule_eventLog;
import o.enableThreadsBoost;
import o.getDid;
import o.initMiniApp;
import o.initSDK;
import o.onInstallReferrerServiceDisconnected;
import o.onInstallReferrerSetupFinished;
import o.onJavaCrashFilter;
import o.registerCrashCallback;
import o.setCustomDataCallback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AutoLogConstraintLayout extends ConstraintLayout implements registerCrashCallback, TossModule_domainLog {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final /* synthetic */ TossModule_eventLog onNavigationEvent;
    private final Lazy onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoLogConstraintLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoLogConstraintLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void IAuthTabCallback(AutoLogConstraintLayout autoLogConstraintLayout, View.OnClickListener onClickListener, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(autoLogConstraintLayout, onClickListener, view);
        int i4 = onExtraCallback + 67;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.TossModule_domainLog
    public onJavaCrashFilter asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.onNavigationEvent.asInterface();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onJavaCrashFilter onjavacrashfilterAsInterface = this.onNavigationEvent.asInterface();
        int i3 = onExtraCallback + 43;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return onjavacrashfilterAsInterface;
    }

    public void setCustomType(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        TossModule_eventLog tossModule_eventLog = this.onNavigationEvent;
        if (i3 != 0) {
            tossModule_eventLog.onNavigationEvent(str);
        } else {
            tossModule_eventLog.onNavigationEvent(str);
            int i4 = 46 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AutoLogConstraintLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onNavigationEvent = new TossModule_eventLog(context, attributeSet);
        this.onWarmupCompleted = MiniAppModule_postMessage.onWarmupCompleted(this, this, false, (Function1) null, 6, (Object) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AutoLogConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallback + 33;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = onExtraCallback;
            int i5 = i4 + 79;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 27;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public /* bridge */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        int i4 = IAuthTabCallback + 97;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }

    public /* synthetic */ initSDK IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCallbackWithResult();
        }
        extraCallbackWithResult();
        throw null;
    }

    public /* bridge */ Set<String> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
            obj.hashCode();
            throw null;
        }
        Set<String> setIAuthTabCallbackStub = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        int i3 = IAuthTabCallback + 39;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return setIAuthTabCallbackStub;
        }
        throw null;
    }

    public /* bridge */ initSDK IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
        }
        super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
        throw null;
    }

    public /* bridge */ boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback_Parcel = super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        int i4 = onExtraCallback + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zIAuthTabCallback_Parcel;
        }
        throw null;
    }

    public /* bridge */ enableThreadsBoost.onNavigationEvent access000() {
        enableThreadsBoost.onNavigationEvent onnavigationeventAccess000;
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onnavigationeventAccess000 = super/*o.setDeviceId*/.access000();
            int i3 = 52 / 0;
        } else {
            onnavigationeventAccess000 = super/*o.setDeviceId*/.access000();
        }
        int i4 = onExtraCallback + 45;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationeventAccess000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess100 = super/*o.initSDK*/.access100();
        int i4 = IAuthTabCallback + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zAccess100;
    }

    public /* bridge */ Function1<ICrashFilter, Boolean> asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.asBinder();
            throw null;
        }
        Function1<ICrashFilter, Boolean> function1AsBinder = super/*o.MonitorCrashConfig*/.asBinder();
        int i3 = onExtraCallback + 37;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return function1AsBinder;
    }

    public /* bridge */ boolean extraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallback = super/*o.MonitorCrashConfig*/.extraCallback();
        int i4 = onExtraCallback + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zExtraCallback;
    }

    public /* bridge */ initSDK.onNavigationEvent getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        initSDK.onNavigationEvent interfaceDescriptor = super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
        int i3 = IAuthTabCallback + 93;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 40 / 0;
        }
        return interfaceDescriptor;
    }

    public /* bridge */ initSDK.onNavigationEvent onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.onExtraCallback();
        }
        super/*o.MonitorCrashConfig*/.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ initMiniApp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
        }
        super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
        throw null;
    }

    public /* bridge */ enableThreadsBoost onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.onNavigationEvent();
        }
        super/*o.MonitorCrashConfig*/.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.setDeviceId*/.onNavigationEvent(map);
        }
        super/*o.setDeviceId*/.onNavigationEvent(map);
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull ICrashFilter iCrashFilter) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.setDeviceId*/.onNavigationEvent(iCrashFilter);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(iCrashFilter);
        int i3 = onExtraCallback + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ getDid onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getDid getdidOnTransact = super/*o.MonitorCrashConfig*/.onTransact();
        int i4 = onExtraCallback + 3;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return getdidOnTransact;
    }

    public /* bridge */ Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapOnWarmupCompleted = super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        return mapOnWarmupCompleted;
    }

    public /* bridge */ void setAsCtaButton() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.initSDK*/.setAsCtaButton();
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 39;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setComponentKey(@Nullable enableThreadsBoost enablethreadsboost) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setComponentKey(enablethreadsboost);
        int i4 = IAuthTabCallback + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setCustomParam(@NotNull String str, @NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParam(str, function1);
        int i4 = onExtraCallback + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setCustomParams(@NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParams(function1);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 25;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setEventLoggableChecker(@Nullable Function1<? super ICrashFilter, Boolean> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setEventLoggableChecker(function1);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ void setMaskingWords(@NotNull Set<String> set) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMaskingWords(set);
        int i4 = IAuthTabCallback + 23;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setMetadata(@NotNull getDid getdid) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMetadata(getdid);
        int i4 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setTrackable(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setTrackable(z);
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
    }

    public setCustomDataCallback extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback setcustomdatacallback = (setCustomDataCallback) this.onWarmupCompleted.getValue();
        int i4 = IAuthTabCallback + 119;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return setcustomdatacallback;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnClickListener(@Nullable final View.OnClickListener onClickListener) {
        int i = 2 % 2;
        if (onClickListener != null) {
            super/*android.view.View*/.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.AutoLogConstraintLayout$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 11;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    AutoLogConstraintLayout.IAuthTabCallback(this.f$0, onClickListener, view);
                    int i5 = onExtraCallbackWithResult + 125;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                }
            });
            int i2 = onExtraCallback + 73;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 14 / 0;
                return;
            }
            return;
        }
        int i4 = IAuthTabCallback + 19;
        onExtraCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            super/*android.view.View*/.setOnClickListener(null);
        } else {
            super/*android.view.View*/.setOnClickListener(null);
            obj.hashCode();
            throw null;
        }
    }

    private static final void onExtraCallback(AutoLogConstraintLayout autoLogConstraintLayout, View.OnClickListener onClickListener, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, autoLogConstraintLayout, (initMiniApp) null, 5, (Object) null);
        } else {
            onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, autoLogConstraintLayout, (initMiniApp) null, 2, (Object) null);
        }
        onClickListener.onClick(view);
        int i3 = onExtraCallback + 49;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        int i = 2 % 2;
        if (onInstallReferrerServiceDisconnected.onExtraCallback.onExtraCallback(this, motionEvent)) {
            int i2 = IAuthTabCallback + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        boolean zOnTouchEvent = super/*android.view.View*/.onTouchEvent(motionEvent);
        int i4 = IAuthTabCallback + 87;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnTouchEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void dispatchDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.dispatchDraw(canvas);
        onInstallReferrerServiceDisconnected.onExtraCallbackWithResult(onInstallReferrerServiceDisconnected.onExtraCallback, this, canvas, (SizeF) null, 4, (Object) null);
        int i4 = IAuthTabCallback + 25;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
