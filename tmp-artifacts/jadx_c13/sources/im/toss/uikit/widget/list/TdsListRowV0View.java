package im.toss.uikit.widget.list;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.uikit.R;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import o.ICrashFilter;
import o.IOOMCallback;
import o.deprecated_cacheControl;
import o.enableThreadsBoost;
import o.getDid;
import o.initMiniApp;
import o.initSDK;
import o.onInstallReferrerServiceDisconnected;
import o.registerCrashCallback;
import o.reportCustomErr;
import o.setCustomDataCallback;
import o.setProtocolsokhttp;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class TdsListRowV0View extends ListCell implements registerCrashCallback {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final Lazy IAuthTabCallback;
    public View onNavigationEvent;

    protected void onExtraCallback(@NotNull View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onClickListener, "");
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
    }

    protected void onNavigationEvent(@NotNull View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onClickListener, "");
        int i4 = onExtraCallbackWithResult + 45;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void setArrow(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    protected void setBadge(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    protected void setBadgeCustomBackgroundColor(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 61;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    protected void setBadgeCustomTextColor(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 55;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    protected void setBadgeSize(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 13;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    protected void setBadgeStyle(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 49;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    protected void setBadgeTheme(@NotNull TdsBadgeV1View.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void setBadgeType(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 103;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    protected void setDescription(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    protected void setDescriptionColor(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 43;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    protected void setDescriptionColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    protected void setIcon(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 107;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 1 / 0;
        }
    }

    protected void setIcon(@Nullable Drawable drawable) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    protected void setIcon(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    protected void setIconColor(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 23;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void setOpen(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 80 / 0;
        }
    }

    protected void setPrefix(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    protected void setPrefixColor(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 33;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    protected void setPrefixColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    protected void setSubvalue(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    protected void setSubvalueColor(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 9;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    protected void setSubvalueColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void setTitle(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    protected void setTitleColor(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 123;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    protected void setTitleColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    protected void setValue(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
    }

    protected void setValueColor(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 97;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void setValueColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected abstract int writeTypedObject();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TdsListRowV0View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback = reportCustomErr.onNavigationEvent(this, IOOMCallback.ListRow, false, (Function0) null, (Function1) null, 14, (Object) null);
    }

    public /* bridge */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        int i4 = onExtraCallbackWithResult + 69;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return strIAuthTabCallback;
        }
        throw null;
    }

    public /* synthetic */ initSDK IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback typedObject = readTypedObject();
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return typedObject;
    }

    public /* bridge */ Set<String> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Set<String> setIAuthTabCallbackStub = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        int i4 = onExtraCallback + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return setIAuthTabCallbackStub;
    }

    public /* bridge */ initSDK IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        initSDK initsdkIAuthTabCallbackStubProxy = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
        int i4 = onExtraCallbackWithResult + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return initsdkIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    public /* bridge */ boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        }
        super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ enableThreadsBoost.onNavigationEvent access000() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        enableThreadsBoost.onNavigationEvent onnavigationeventAccess000 = super/*o.setDeviceId*/.access000();
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return onnavigationeventAccess000;
    }

    public /* bridge */ boolean access100() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess100 = super/*o.initSDK*/.access100();
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return zAccess100;
    }

    public /* bridge */ Function1<ICrashFilter, Boolean> asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.asBinder();
        }
        super/*o.MonitorCrashConfig*/.asBinder();
        throw null;
    }

    public /* bridge */ boolean extraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallback = super/*o.MonitorCrashConfig*/.extraCallback();
        int i4 = onExtraCallback + 119;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zExtraCallback;
    }

    public /* bridge */ initSDK.onNavigationEvent getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        initSDK.onNavigationEvent interfaceDescriptor = super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
        int i4 = onExtraCallbackWithResult + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public /* bridge */ initSDK.onNavigationEvent onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        initSDK.onNavigationEvent onnavigationeventOnExtraCallback = super/*o.MonitorCrashConfig*/.onExtraCallback();
        int i4 = onExtraCallback + 101;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationeventOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ initMiniApp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp initminiappOnExtraCallbackWithResult = super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 53;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return initminiappOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ enableThreadsBoost onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.onNavigationEvent();
        }
        super/*o.MonitorCrashConfig*/.onNavigationEvent();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(map);
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull ICrashFilter iCrashFilter) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super/*o.setDeviceId*/.onNavigationEvent(iCrashFilter);
            obj.hashCode();
            throw null;
        }
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(iCrashFilter);
        int i3 = onExtraCallback + 51;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ getDid onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.onTransact();
            obj.hashCode();
            throw null;
        }
        getDid getdidOnTransact = super/*o.MonitorCrashConfig*/.onTransact();
        int i3 = onExtraCallback + 55;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return getdidOnTransact;
        }
        throw null;
    }

    public /* bridge */ Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.onWarmupCompleted();
            throw null;
        }
        Map<String, Object> mapOnWarmupCompleted = super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        int i3 = onExtraCallbackWithResult + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return mapOnWarmupCompleted;
    }

    public /* bridge */ void setAsCtaButton() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*o.initSDK*/.setAsCtaButton();
        int i4 = onExtraCallback + 1;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setComponentKey(@Nullable enableThreadsBoost enablethreadsboost) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setComponentKey(enablethreadsboost);
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
    }

    public /* bridge */ void setCustomParam(@NotNull String str, @NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParam(str, function1);
        int i4 = onExtraCallbackWithResult + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
    }

    public /* bridge */ void setCustomParams(@NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParams(function1);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setEventLoggableChecker(@Nullable Function1<? super ICrashFilter, Boolean> function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setEventLoggableChecker(function1);
        int i4 = onExtraCallbackWithResult + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setMaskingWords(@NotNull Set<String> set) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMaskingWords(set);
        int i4 = onExtraCallbackWithResult + 105;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setMetadata(@NotNull getDid getdid) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMetadata(getdid);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 15;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
    }

    public /* bridge */ void setTrackable(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setTrackable(z);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsListRowV0View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallback + 49;
            onExtraCallbackWithResult = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = onExtraCallback + 11;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public setCustomDataCallback readTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallback.getValue();
        if (i3 != 0) {
            return (setCustomDataCallback) value;
        }
        throw null;
    }

    public final void onExtraCallbackWithResult(@NotNull View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        this.onNavigationEvent = view;
        int i4 = onExtraCallback + 91;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final View onMinimized() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 1;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        View view = this.onNavigationEvent;
        Object obj = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i5 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        int i7 = i2 + 71;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return view;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.uikit.widget.list.ListCell
    public void asInterface() {
        int i = 2 % 2;
        super.asInterface();
        View viewInflate = LayoutInflater.from(getContext()).inflate(writeTypedObject(), (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        onExtraCallbackWithResult(viewInflate);
        View viewOnMinimized = onMinimized();
        int i2 = R.id.list_row;
        viewOnMinimized.setId(i2);
        onMinimized().setPadding(getResources().getDimensionPixelSize(onActivityLayout()), onMinimized().getPaddingTop(), getResources().getDimensionPixelSize(onMessageChannelReady()), onMinimized().getPaddingBottom());
        addView(onMinimized(), new ConstraintLayout.onExtraCallbackWithResult(-1, -2));
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(this);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(i2, 3, R.id.topDivider, 4);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(i2, 4, R.id.bottomDivider, 3);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(this);
        int i3 = onExtraCallback + 15;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 36 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0133, code lost:
    
        if (r0 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013a, code lost:
    
        if (r0 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013c, code lost:
    
        r3 = r11;
        r11 = r30;
        r15 = r40;
        r41 = r5;
        r5 = r0;
        r0 = r41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02a7  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, im.toss.uikit.widget.list.TdsListRowV0View] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // im.toss.uikit.widget.list.ListCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallback(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        ?? r1;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        Drawable drawable;
        ColorStateList colorStateList5;
        CharSequence charSequence4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        CharSequence charSequence7;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        int color;
        CharSequence charSequence8;
        CharSequence charSequence9;
        CharSequence text;
        CharSequence text2;
        int i9 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        super.IAuthTabCallback(context, attributeSet);
        CharSequence charSequence10 = isInEditMode() ? "TITLE" : _UrlKt.FRAGMENT_ENCODE_SET;
        isInEditMode();
        if (isInEditMode()) {
            charSequence = "VALUE";
        } else {
            int i10 = onExtraCallbackWithResult + 37;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            charSequence = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        CharSequence charSequence11 = isInEditMode() ? "SUBVALUE" : _UrlKt.FRAGMENT_ENCODE_SET;
        isInEditMode();
        isInEditMode();
        if (isInEditMode()) {
            int i12 = onExtraCallbackWithResult + 47;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            charSequence2 = "DESCRIPTION";
        } else {
            charSequence2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        isInEditMode();
        CharSequence charSequence12 = isInEditMode() ? "INDEX" : _UrlKt.FRAGMENT_ENCODE_SET;
        int index = TdsButtonV1View.IAuthTabCallbackStub.PRIMARY.getIndex();
        int index2 = TdsButtonV1View.IAuthTabCallbackDefault.FILL.getIndex();
        int index3 = TdsButtonV1View.onWarmupCompleted.MEDIUM.getIndex();
        int index4 = TdsButtonV1View.IAuthTabCallback.INLINE.getIndex();
        CharSequence charSequence13 = isInEditMode() ? "BADGE" : _UrlKt.FRAGMENT_ENCODE_SET;
        Object obj = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsListRowV0, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            charSequence4 = _UrlKt.FRAGMENT_ENCODE_SET;
            charSequence5 = charSequence4;
            charSequence6 = charSequence5;
            charSequence7 = charSequence6;
            charSequence3 = charSequence7;
            CharSequence charSequence14 = charSequence11;
            CharSequence charSequence15 = charSequence2;
            CharSequence charSequence16 = charSequence12;
            int i14 = index4;
            CharSequence charSequence17 = charSequence13;
            boolean z4 = false;
            boolean z5 = false;
            int i15 = 0;
            ColorStateList colorStateList6 = null;
            ColorStateList colorStateList7 = null;
            ColorStateList colorStateList8 = null;
            ColorStateList colorStateList9 = null;
            Drawable drawable2 = null;
            ColorStateList colorStateList10 = null;
            CharSequence charSequence18 = charSequence10;
            int color2 = -1;
            int i16 = -1;
            int color3 = -1;
            int i17 = -1;
            int i18 = -1;
            boolean z6 = true;
            CharSequence charSequence19 = charSequence;
            int i19 = index2;
            int i20 = index3;
            boolean z7 = false;
            int i21 = 1;
            int i22 = index;
            z = false;
            int i23 = -1;
            int color4 = -1;
            while (i15 < indexCount) {
                int i24 = indexCount;
                int index5 = typedArrayObtainStyledAttributes.getIndex(i15);
                if (index5 == R.styleable.TdsListRowV0_icon) {
                    Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(index5);
                    if (drawable3 != null) {
                        drawable2 = drawable3;
                        color = i23;
                        z3 = z7;
                        charSequence9 = charSequence16;
                    } else {
                        i7 = color4;
                        i8 = i18;
                        color = i23;
                        z3 = z7;
                        i18 = i8;
                        charSequence9 = charSequence16;
                        color4 = i7;
                    }
                } else {
                    if (index5 == R.styleable.TdsListRowV0_iconUrl) {
                        CharSequence text3 = typedArrayObtainStyledAttributes.getText(index5);
                        if (text3 == null) {
                            int i25 = onExtraCallback + 85;
                            onExtraCallbackWithResult = i25 % 128;
                            int i26 = i25 % 2;
                            text3 = charSequence4;
                        }
                        charSequence4 = text3;
                    } else if (index5 == R.styleable.TdsListRowV0_iconColor) {
                        color4 = typedArrayObtainStyledAttributes.getColor(index5, color4);
                    } else {
                        if (index5 == R.styleable.TdsListRowV0_title) {
                            int i27 = onExtraCallback + 103;
                            i7 = color4;
                            onExtraCallbackWithResult = i27 % 128;
                            if (i27 % 2 == 0) {
                                text2 = typedArrayObtainStyledAttributes.getText(index5);
                                int i28 = 6 / 0;
                            } else {
                                text2 = typedArrayObtainStyledAttributes.getText(index5);
                            }
                            charSequence9 = charSequence16;
                            color4 = i7;
                        } else {
                            i7 = color4;
                            if (index5 == R.styleable.TdsListRowV0_titleColor) {
                                colorStateList7 = typedArrayObtainStyledAttributes.getColorStateList(index5);
                            } else {
                                if (index5 == R.styleable.TdsListRowV0_subtitle) {
                                    typedArrayObtainStyledAttributes.getText(index5);
                                } else if (index5 == R.styleable.TdsListRowV0_subtitleColor) {
                                    typedArrayObtainStyledAttributes.getColorStateList(index5);
                                } else if (index5 == R.styleable.TdsListRowV0_subtitleMaxLine) {
                                    i21 = typedArrayObtainStyledAttributes.getInt(index5, i21);
                                } else {
                                    if (index5 == R.styleable.TdsListRowV0_value) {
                                        int i29 = onExtraCallbackWithResult + 29;
                                        onExtraCallback = i29 % 128;
                                        int i30 = i29 % 2;
                                        CharSequence text4 = typedArrayObtainStyledAttributes.getText(index5);
                                        if (text4 != null) {
                                            charSequence19 = text4;
                                        }
                                    } else if (index5 == R.styleable.TdsListRowV0_valueColor) {
                                        colorStateList9 = typedArrayObtainStyledAttributes.getColorStateList(index5);
                                    } else if (index5 == R.styleable.TdsListRowV0_subvalue) {
                                        CharSequence text5 = typedArrayObtainStyledAttributes.getText(index5);
                                        if (text5 == null) {
                                            text5 = charSequence14;
                                        }
                                        charSequence14 = text5;
                                    } else if (index5 == R.styleable.TdsListRowV0_subvalueColor) {
                                        colorStateList10 = typedArrayObtainStyledAttributes.getColorStateList(index5);
                                    } else if (index5 == R.styleable.TdsListRowV0_valueTitle) {
                                        typedArrayObtainStyledAttributes.getText(index5);
                                    } else if (index5 == R.styleable.TdsListRowV0_valueTitleColor) {
                                        typedArrayObtainStyledAttributes.getColorStateList(index5);
                                    } else if (index5 == R.styleable.TdsListRowV0_subvalueTitle) {
                                        typedArrayObtainStyledAttributes.getText(index5);
                                    } else if (index5 == R.styleable.TdsListRowV0_subvalueTitleColor) {
                                        typedArrayObtainStyledAttributes.getColorStateList(index5);
                                    } else if (index5 == R.styleable.TdsListRowV0_description) {
                                        CharSequence text6 = typedArrayObtainStyledAttributes.getText(index5);
                                        if (text6 == null) {
                                            text6 = charSequence15;
                                        }
                                        charSequence15 = text6;
                                    } else if (index5 == R.styleable.TdsListRowV0_descriptionColor) {
                                        colorStateList8 = typedArrayObtainStyledAttributes.getColorStateList(index5);
                                    } else if (index5 == R.styleable.TdsListRowV0_subdescription) {
                                        typedArrayObtainStyledAttributes.getText(index5);
                                    } else if (index5 == R.styleable.TdsListRowV0_subdescriptionColor) {
                                        int i31 = onExtraCallback + 111;
                                        onExtraCallbackWithResult = i31 % 128;
                                        if (i31 % 2 == 0) {
                                            typedArrayObtainStyledAttributes.getColorStateList(index5);
                                            throw null;
                                        }
                                        typedArrayObtainStyledAttributes.getColorStateList(index5);
                                    } else if (index5 == R.styleable.TdsListRowV0_arrow) {
                                        z = typedArrayObtainStyledAttributes.getBoolean(index5, z);
                                    } else if (index5 == R.styleable.TdsListRowV0_index) {
                                        CharSequence text7 = typedArrayObtainStyledAttributes.getText(index5);
                                        if (text7 != null) {
                                            charSequence16 = text7;
                                        }
                                    } else if (index5 == R.styleable.TdsListRowV0_indexColor) {
                                        colorStateList6 = typedArrayObtainStyledAttributes.getColorStateList(index5);
                                    } else if (index5 == R.styleable.TdsListRowV0_imageButtonSrc) {
                                        typedArrayObtainStyledAttributes.getDrawable(index5);
                                    } else if (index5 == R.styleable.TdsListRowV0_imageButtonColor) {
                                        color2 = typedArrayObtainStyledAttributes.getColor(index5, color2);
                                    } else if (index5 == R.styleable.TdsListRowV0_onImageButtonClick) {
                                        CharSequence text8 = typedArrayObtainStyledAttributes.getText(index5);
                                        charSequence5 = text8 == null ? charSequence5 : text8;
                                        color = i23;
                                        color4 = i7;
                                        charSequence8 = charSequence18;
                                        i15++;
                                        charSequence18 = charSequence8;
                                        indexCount = i24;
                                        i23 = color;
                                    } else if (index5 == R.styleable.TdsListRowV0_buttonLabel) {
                                        CharSequence text9 = typedArrayObtainStyledAttributes.getText(index5);
                                        if (text9 == null) {
                                            int i32 = onExtraCallback + 91;
                                            onExtraCallbackWithResult = i32 % 128;
                                            if (i32 % 2 == 0) {
                                                text9 = charSequence7;
                                                int i33 = 88 / 0;
                                            } else {
                                                text9 = charSequence7;
                                            }
                                        }
                                        charSequence7 = text9;
                                    } else if (index5 == R.styleable.TdsListRowV0_onButtonClick) {
                                        int i34 = onExtraCallbackWithResult + 31;
                                        onExtraCallback = i34 % 128;
                                        if (i34 % 2 != 0) {
                                            text = typedArrayObtainStyledAttributes.getText(index5);
                                            int i35 = 24 / 0;
                                            if (text == null) {
                                                int i36 = onExtraCallback + 27;
                                                onExtraCallbackWithResult = i36 % 128;
                                                if (i36 % 2 == 0) {
                                                    obj.hashCode();
                                                    throw null;
                                                }
                                                text = charSequence6;
                                            }
                                            charSequence6 = text;
                                        } else {
                                            text = typedArrayObtainStyledAttributes.getText(index5);
                                            if (text == null) {
                                            }
                                            charSequence6 = text;
                                        }
                                        i15++;
                                        charSequence18 = charSequence8;
                                        indexCount = i24;
                                        i23 = color;
                                    } else if (index5 == R.styleable.TdsListRowV0_buttonsEnabled) {
                                        int i37 = onExtraCallback + 11;
                                        onExtraCallbackWithResult = i37 % 128;
                                        int i38 = i37 % 2;
                                        z6 = typedArrayObtainStyledAttributes.getBoolean(index5, z6);
                                    } else if (index5 == R.styleable.TdsListRowV0_buttonsType) {
                                        i22 = typedArrayObtainStyledAttributes.getInt(index5, i22);
                                    } else if (index5 == R.styleable.TdsListRowV0_buttonsStyle) {
                                        i19 = typedArrayObtainStyledAttributes.getInt(index5, i19);
                                    } else if (index5 == R.styleable.TdsListRowV0_buttonsSize) {
                                        i20 = typedArrayObtainStyledAttributes.getInt(index5, i20);
                                    } else if (index5 == R.styleable.TdsListRowV0_buttonsDisplay) {
                                        i14 = typedArrayObtainStyledAttributes.getInt(index5, i14);
                                    } else {
                                        int i39 = i14;
                                        if (index5 == R.styleable.TdsListRowV0_switchButton) {
                                            i14 = i39;
                                            z5 = typedArrayObtainStyledAttributes.getBoolean(index5, z5);
                                        } else if (index5 == R.styleable.TdsListRowV0_switchChecked) {
                                            z4 = typedArrayObtainStyledAttributes.getBoolean(index5, z4);
                                            i14 = i39;
                                        } else if (index5 == R.styleable.TdsListRowV0_tdsBadge) {
                                            CharSequence text10 = typedArrayObtainStyledAttributes.getText(index5);
                                            i14 = i39;
                                            if (text10 != null) {
                                                charSequence17 = text10;
                                            }
                                        } else if (index5 == R.styleable.TdsListRowV0_tdsBadgeType) {
                                            i14 = i39;
                                            i18 = typedArrayObtainStyledAttributes.getInt(index5, i18);
                                        } else {
                                            i14 = i39;
                                            i8 = i18;
                                            if (index5 == R.styleable.TdsListRowV0_tdsBadgeStyle) {
                                                i16 = typedArrayObtainStyledAttributes.getInt(index5, i16);
                                            } else if (index5 == R.styleable.TdsListRowV0_tdsBadgeSize) {
                                                i17 = typedArrayObtainStyledAttributes.getInt(index5, i17);
                                            } else if (index5 == R.styleable.TdsListRowV0_tdsBadgeCustomBackgroundColor) {
                                                color3 = typedArrayObtainStyledAttributes.getColor(index5, color3);
                                            } else if (index5 == R.styleable.TdsListRowV0_tdsBadgeCustomTextColor) {
                                                color = typedArrayObtainStyledAttributes.getColor(index5, i23);
                                                charSequence8 = charSequence18;
                                                z3 = z7;
                                                i18 = i8;
                                                charSequence9 = charSequence16;
                                                color4 = i7;
                                            } else if (index5 == R.styleable.TdsListRowV0_open) {
                                                z3 = typedArrayObtainStyledAttributes.getBoolean(index5, z7);
                                                color = i23;
                                            }
                                            color = i23;
                                            z3 = z7;
                                        }
                                    }
                                    charSequence16 = charSequence9;
                                    z7 = z3;
                                    i15++;
                                    charSequence18 = charSequence8;
                                    indexCount = i24;
                                    i23 = color;
                                }
                                i8 = i18;
                                color = i23;
                                z3 = z7;
                            }
                            color = i23;
                            z3 = z7;
                            charSequence9 = charSequence16;
                            color4 = i7;
                        }
                        i18 = i8;
                        charSequence9 = charSequence16;
                        color4 = i7;
                    }
                    color = i23;
                    z3 = z7;
                    charSequence9 = charSequence16;
                }
                charSequence8 = charSequence18;
                charSequence16 = charSequence9;
                z7 = z3;
                i15++;
                charSequence18 = charSequence8;
                indexCount = i24;
                i23 = color;
            }
            r1 = this;
            i3 = i23;
            i = i18;
            charSequence13 = charSequence17;
            charSequence = charSequence19;
            i6 = i16;
            i4 = color3;
            i5 = i17;
            charSequence11 = charSequence14;
            colorStateList3 = colorStateList6;
            charSequence2 = charSequence15;
            colorStateList2 = colorStateList7;
            charSequence12 = charSequence16;
            colorStateList5 = colorStateList8;
            drawable = drawable2;
            colorStateList = colorStateList10;
            i2 = color4;
            charSequence10 = charSequence18;
            z2 = z7;
            colorStateList4 = colorStateList9;
        } else {
            charSequence3 = _UrlKt.FRAGMENT_ENCODE_SET;
            r1 = this;
            colorStateList = null;
            colorStateList2 = null;
            colorStateList3 = null;
            colorStateList4 = null;
            drawable = null;
            colorStateList5 = null;
            charSequence4 = charSequence3;
            charSequence5 = charSequence4;
            charSequence6 = charSequence5;
            charSequence7 = charSequence6;
            i = -1;
            z = false;
            i2 = -1;
            z2 = false;
            i3 = -1;
            i4 = -1;
            i5 = -1;
            i6 = -1;
        }
        r1.setIcon(drawable);
        if (drawable == null && !TextUtils.isEmpty(charSequence4)) {
            r1.setIcon(charSequence4.toString());
        }
        r1.setIconColor(i2);
        r1.setTitle(charSequence10);
        r1.setTitleColor(colorStateList2);
        r1.setValue(charSequence);
        r1.setValueColor(colorStateList4);
        r1.setSubvalue(charSequence11);
        r1.setSubvalueColor(colorStateList);
        r1.setDescription(charSequence2);
        r1.setDescriptionColor(colorStateList5);
        r1.setArrow(z);
        r1.setPrefix(charSequence12);
        r1.setPrefixColor(colorStateList3);
        if (charSequence5.length() != 0) {
            r1.onNavigationEvent(new deprecated_cacheControl((View) r1, charSequence5.toString()));
        }
        if (charSequence6.length() != 0) {
            r1.onExtraCallback(new deprecated_cacheControl((View) r1, charSequence6.toString()));
        }
        r1.setBadge(charSequence13);
        r1.setBadgeType(i);
        r1.setBadgeStyle(i6);
        r1.setBadgeSize(i5);
        r1.setBadgeCustomBackgroundColor(i4);
        r1.setBadgeCustomTextColor(i3);
        r1.setOpen(z2);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(new int[]{R.attr.listRowBackgroundColor});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, charSequence3);
        int color5 = typedArrayObtainStyledAttributes2.getColor(0, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (color5 != 0) {
            r1.setBackgroundColor(color5);
        }
        TdsImageView tdsImageViewICustomTabsCallback = ICustomTabsCallback();
        if (tdsImageViewICustomTabsCallback != null) {
            setProtocolsokhttp.onNavigationEvent(tdsImageViewICustomTabsCallback);
        }
    }

    protected int onActivityLayout() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = im.toss.tds.view.R.dimen.list_row_padding_left_24;
        int i5 = onExtraCallbackWithResult + 71;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    protected int onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = im.toss.tds.view.R.dimen.list_row_padding_right_24;
        if (i3 == 0) {
            return i4;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.setOnClickListener(onClickListener);
        if (onClickListener == null) {
            setClickable(false);
        }
        int i4 = onExtraCallback + 97;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
    }

    public void dispatchDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.dispatchDraw(canvas);
        onInstallReferrerServiceDisconnected.onExtraCallbackWithResult(onInstallReferrerServiceDisconnected.onExtraCallback, this, canvas, (SizeF) null, 4, (Object) null);
        int i4 = onExtraCallback + 61;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseTextView onActivityResized() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextViewFindViewById = findViewById(R.id.title);
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return baseTextViewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TdsImageView ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageViewFindViewById = findViewById(R.id.arrow);
        int i4 = onExtraCallback + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return tdsImageViewFindViewById;
    }
}
