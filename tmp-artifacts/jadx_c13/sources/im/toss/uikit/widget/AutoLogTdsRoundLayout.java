package im.toss.uikit.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.MotionEvent;
import android.view.View;
import im.toss.tds.view.component.widget.TdsRoundLayout;
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
public final class AutoLogTdsRoundLayout extends TdsRoundLayout implements registerCrashCallback, TossModule_domainLog {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final /* synthetic */ TossModule_eventLog onExtraCallback;
    private final Lazy onNavigationEvent;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoLogTdsRoundLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoLogTdsRoundLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void onWarmupCompleted(AutoLogTdsRoundLayout autoLogTdsRoundLayout, View.OnClickListener onClickListener, View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(autoLogTdsRoundLayout, onClickListener, view);
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // o.TossModule_domainLog
    public onJavaCrashFilter asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallback.asInterface();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onJavaCrashFilter onjavacrashfilterAsInterface = this.onExtraCallback.asInterface();
        int i3 = IAuthTabCallback + 95;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return onjavacrashfilterAsInterface;
    }

    public void setCustomType(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        TossModule_eventLog tossModule_eventLog = this.onExtraCallback;
        if (i3 != 0) {
            tossModule_eventLog.onNavigationEvent(str);
            return;
        }
        tossModule_eventLog.onNavigationEvent(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AutoLogTdsRoundLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = new TossModule_eventLog(context, attributeSet);
        this.onNavigationEvent = MiniAppModule_postMessage.onWarmupCompleted(this, this, false, (Function1) null, 6, (Object) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AutoLogTdsRoundLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onWarmupCompleted + 3;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = IAuthTabCallback + 75;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public /* bridge */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strIAuthTabCallback = super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        int i3 = onWarmupCompleted + 103;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return strIAuthTabCallback;
    }

    public /* synthetic */ initSDK IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsCallbackStub();
        }
        ICustomTabsCallbackStub();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Set<String> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Set<String> setIAuthTabCallbackStub = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        int i4 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return setIAuthTabCallbackStub;
    }

    public /* bridge */ initSDK IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
            throw null;
        }
        initSDK initsdkIAuthTabCallbackStubProxy = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
        int i3 = onWarmupCompleted + 61;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return initsdkIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    public /* bridge */ boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback_Parcel = super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        int i4 = onWarmupCompleted + 107;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback_Parcel;
    }

    public /* bridge */ enableThreadsBoost.onNavigationEvent access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.setDeviceId*/.access000();
        }
        super/*o.setDeviceId*/.access000();
        throw null;
    }

    public /* bridge */ boolean access100() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess100 = super/*o.initSDK*/.access100();
        int i4 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zAccess100;
    }

    public /* bridge */ Function1<ICrashFilter, Boolean> asBinder() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.MonitorCrashConfig*/.asBinder();
            throw null;
        }
        Function1<ICrashFilter, Boolean> function1AsBinder = super/*o.MonitorCrashConfig*/.asBinder();
        int i3 = IAuthTabCallback + 7;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 81 / 0;
        }
        return function1AsBinder;
    }

    public /* bridge */ boolean extraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.extraCallback();
        }
        super/*o.MonitorCrashConfig*/.extraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ initSDK.onNavigationEvent getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        initSDK.onNavigationEvent interfaceDescriptor = super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
        int i4 = onWarmupCompleted + 37;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return interfaceDescriptor;
    }

    public /* bridge */ initSDK.onNavigationEvent onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        initSDK.onNavigationEvent onnavigationeventOnExtraCallback = super/*o.MonitorCrashConfig*/.onExtraCallback();
        int i4 = onWarmupCompleted + 15;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnExtraCallback;
    }

    public /* bridge */ initMiniApp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp initminiappOnExtraCallbackWithResult = super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return initminiappOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ enableThreadsBoost onNavigationEvent() {
        enableThreadsBoost enablethreadsboostOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            enablethreadsboostOnNavigationEvent = super/*o.MonitorCrashConfig*/.onNavigationEvent();
            int i3 = 97 / 0;
        } else {
            enablethreadsboostOnNavigationEvent = super/*o.MonitorCrashConfig*/.onNavigationEvent();
        }
        int i4 = IAuthTabCallback + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return enablethreadsboostOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(map);
        int i4 = onWarmupCompleted + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull ICrashFilter iCrashFilter) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.setDeviceId*/.onNavigationEvent(iCrashFilter);
        }
        super/*o.setDeviceId*/.onNavigationEvent(iCrashFilter);
        throw null;
    }

    public /* bridge */ getDid onTransact() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.MonitorCrashConfig*/.onTransact();
        }
        super/*o.MonitorCrashConfig*/.onTransact();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapOnWarmupCompleted = super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        int i4 = onWarmupCompleted + 5;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return mapOnWarmupCompleted;
        }
        throw null;
    }

    public /* bridge */ void setAsCtaButton() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.initSDK*/.setAsCtaButton();
        int i4 = IAuthTabCallback + 45;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setComponentKey(@Nullable enableThreadsBoost enablethreadsboost) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setComponentKey(enablethreadsboost);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ void setCustomParam(@NotNull String str, @NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParam(str, function1);
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
    }

    public /* bridge */ void setCustomParams(@NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParams(function1);
        int i4 = onWarmupCompleted + 71;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
    }

    public /* bridge */ void setEventLoggableChecker(@Nullable Function1<? super ICrashFilter, Boolean> function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setEventLoggableChecker(function1);
        int i4 = IAuthTabCallback + 71;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
    }

    public /* bridge */ void setMaskingWords(@NotNull Set<String> set) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMaskingWords(set);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setMetadata(@NotNull getDid getdid) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMetadata(getdid);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 43;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setTrackable(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setTrackable(z);
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        int i5 = onWarmupCompleted + 31;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public setCustomDataCallback ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback setcustomdatacallback = (setCustomDataCallback) this.onNavigationEvent.getValue();
        int i4 = IAuthTabCallback + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return setcustomdatacallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnClickListener(@Nullable final View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (onClickListener != null) {
            super/*android.view.View*/.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.AutoLogTdsRoundLayout$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 47;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    AutoLogTdsRoundLayout.onWarmupCompleted(this.f$0, onClickListener, view);
                    int i7 = onWarmupCompleted + 83;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                }
            });
            return;
        }
        super/*android.view.View*/.setOnClickListener(null);
        int i4 = onWarmupCompleted + 25;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onExtraCallbackWithResult(AutoLogTdsRoundLayout autoLogTdsRoundLayout, View.OnClickListener onClickListener, View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, autoLogTdsRoundLayout, (initMiniApp) null, 2, (Object) null);
        onClickListener.onClick(view);
        int i4 = IAuthTabCallback + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        return super/*android.view.View*\/.onTouchEvent(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r5 = im.toss.uikit.widget.AutoLogTdsRoundLayout.onWarmupCompleted + 63;
        im.toss.uikit.widget.AutoLogTdsRoundLayout.IAuthTabCallback = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (o.onInstallReferrerServiceDisconnected.onExtraCallback.onExtraCallback(r4, r5) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (o.onInstallReferrerServiceDisconnected.onExtraCallback.onExtraCallback(r4, r5) != true) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 85 / 0;
        }
    }

    public void dispatchDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(canvas, "");
            super.dispatchDraw(canvas);
            onInstallReferrerServiceDisconnected.onExtraCallbackWithResult(onInstallReferrerServiceDisconnected.onExtraCallback, this, canvas, (SizeF) null, 4, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(canvas, "");
            super.dispatchDraw(canvas);
            onInstallReferrerServiceDisconnected.onExtraCallbackWithResult(onInstallReferrerServiceDisconnected.onExtraCallback, this, canvas, (SizeF) null, 4, (Object) null);
        }
    }
}
