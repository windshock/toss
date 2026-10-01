package im.toss.uikit.widget.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.uikit.R;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ICrashFilter;
import o.IOOMCallback;
import o.enableThreadsBoost;
import o.getDid;
import o.initMiniApp;
import o.initSDK;
import o.onInstallReferrerServiceDisconnected;
import o.registerCrashCallback;
import o.reportCustomErr;
import o.response;
import o.setCustomDataCallback;
import o.setDone;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BottomSheetHeader extends FrameLayout implements registerCrashCallback {
    private static int IAuthTabCallbackDefault = 1;
    private static int onNavigationEvent;
    private TdsImageView IAuthTabCallback;
    private final Lazy onExtraCallback;
    private TextView onExtraCallbackWithResult;
    private TextView onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomSheetHeader(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomSheetHeader(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, view);
        int i4 = onNavigationEvent + 15;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetHeader(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = reportCustomErr.onNavigationEvent(this, IOOMCallback.Top, false, (Function0) null, (Function1) null, 14, (Object) null);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.bottomsheet_header, (ViewGroup) this, true);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        onNavigationEvent(viewInflate);
        if (attributeSet != null) {
            int i3 = 0;
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.BottomSheetHeader, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            while (i3 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == R.styleable.BottomSheetHeader_title) {
                    int i4 = IAuthTabCallbackDefault + 45;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    setTitle(typedArrayObtainStyledAttributes.getString(index));
                    i2 = IAuthTabCallbackDefault + 111;
                } else if (index == R.styleable.BottomSheetHeader_description) {
                    setDescription(typedArrayObtainStyledAttributes.getString(index));
                    i2 = IAuthTabCallbackDefault + 63;
                } else {
                    if (index == R.styleable.BottomSheetHeader_showCloseIcon) {
                        setShowCloseIcon(typedArrayObtainStyledAttributes.getBoolean(index, true));
                    }
                    i3++;
                    int i6 = 2 % 2;
                }
                onNavigationEvent = i2 % 128;
                int i7 = i2 % 2;
                int i8 = 2 % 2;
                i3++;
                int i62 = 2 % 2;
            }
        }
        setCloseClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.dialog.BottomSheetHeader$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i9 = 2 % 2;
                int i10 = onExtraCallbackWithResult + 79;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                BottomSheetHeader.IAuthTabCallback(view);
                if (i11 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BottomSheetHeader(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        if ((i2 & 4) != 0) {
            int i3 = onNavigationEvent;
            int i4 = i3 + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 41;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public /* bridge */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        int i4 = onNavigationEvent + 75;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return strIAuthTabCallback;
        }
        throw null;
    }

    public /* synthetic */ initSDK IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            writeTypedObject();
            obj.hashCode();
            throw null;
        }
        setCustomDataCallback setcustomdatacallbackWriteTypedObject = writeTypedObject();
        int i3 = IAuthTabCallbackDefault + 25;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return setcustomdatacallbackWriteTypedObject;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Set<String> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Set<String> setIAuthTabCallbackStub = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        int i4 = IAuthTabCallbackDefault + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return setIAuthTabCallbackStub;
        }
        throw null;
    }

    public /* bridge */ initSDK IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        initSDK initsdkIAuthTabCallbackStubProxy = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
        int i4 = IAuthTabCallbackDefault + 61;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return initsdkIAuthTabCallbackStubProxy;
    }

    public /* bridge */ boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        }
        super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        throw null;
    }

    public /* bridge */ enableThreadsBoost.onNavigationEvent access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        enableThreadsBoost.onNavigationEvent onnavigationeventAccess000 = super/*o.setDeviceId*/.access000();
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        return onnavigationeventAccess000;
    }

    public /* bridge */ boolean access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.initSDK*/.access100();
        }
        super/*o.initSDK*/.access100();
        throw null;
    }

    public /* bridge */ Function1<ICrashFilter, Boolean> asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Function1<ICrashFilter, Boolean> function1AsBinder = super/*o.MonitorCrashConfig*/.asBinder();
        int i4 = onNavigationEvent + 89;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return function1AsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean extraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallback = super/*o.MonitorCrashConfig*/.extraCallback();
        int i4 = onNavigationEvent + 1;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zExtraCallback;
    }

    public /* bridge */ initSDK.onNavigationEvent getInterfaceDescriptor() {
        initSDK.onNavigationEvent interfaceDescriptor;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            interfaceDescriptor = super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
            int i3 = 95 / 0;
        } else {
            interfaceDescriptor = super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
        }
        int i4 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public /* bridge */ initSDK.onNavigationEvent onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        initSDK.onNavigationEvent onnavigationeventOnExtraCallback = super/*o.MonitorCrashConfig*/.onExtraCallback();
        int i4 = IAuthTabCallbackDefault + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnExtraCallback;
    }

    public /* bridge */ initMiniApp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp initminiappOnExtraCallbackWithResult = super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 27;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return initminiappOnExtraCallbackWithResult;
    }

    public /* bridge */ enableThreadsBoost onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        enableThreadsBoost enablethreadsboostOnNavigationEvent = super/*o.MonitorCrashConfig*/.onNavigationEvent();
        int i4 = onNavigationEvent + 35;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return enablethreadsboostOnNavigationEvent;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(map);
        int i4 = IAuthTabCallbackDefault + 77;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull ICrashFilter iCrashFilter) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.setDeviceId*/.onNavigationEvent(iCrashFilter);
            throw null;
        }
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(iCrashFilter);
        int i3 = onNavigationEvent + 97;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ getDid onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getDid getdidOnTransact = super/*o.MonitorCrashConfig*/.onTransact();
        int i4 = IAuthTabCallbackDefault + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return getdidOnTransact;
        }
        throw null;
    }

    public /* bridge */ Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGBA_YVYU;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.onWarmupCompleted();
            throw null;
        }
        Map<String, Object> mapOnWarmupCompleted = super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        int i3 = IAuthTabCallbackDefault + 29;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return mapOnWarmupCompleted;
    }

    public /* bridge */ void setAsCtaButton() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.initSDK*/.setAsCtaButton();
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 55;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ void setComponentKey(@Nullable enableThreadsBoost enablethreadsboost) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setComponentKey(enablethreadsboost);
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        int i5 = onNavigationEvent + 109;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
    }

    public /* bridge */ void setCustomParam(@NotNull String str, @NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParam(str, function1);
        int i4 = onNavigationEvent + 97;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setCustomParams(@NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParams(function1);
        int i4 = onNavigationEvent + 7;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setEventLoggableChecker(@Nullable Function1<? super ICrashFilter, Boolean> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setEventLoggableChecker(function1);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setMaskingWords(@NotNull Set<String> set) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMaskingWords(set);
        int i4 = IAuthTabCallbackDefault + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setMetadata(@NotNull getDid getdid) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMetadata(getdid);
        int i4 = onNavigationEvent + 113;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setTrackable(boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setTrackable(z);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 3;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public setCustomDataCallback writeTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        setCustomDataCallback setcustomdatacallback = (setCustomDataCallback) this.onExtraCallback.getValue();
        int i3 = IAuthTabCallbackDefault + 115;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return setcustomdatacallback;
        }
        throw null;
    }

    private final void onNavigationEvent(View view) {
        int i = 2 % 2;
        View viewFindViewById = view.findViewById(R.id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        TextView textView = (TextView) viewFindViewById;
        this.onExtraCallbackWithResult = textView;
        if (textView == null) {
            int i2 = onNavigationEvent + 17;
            IAuthTabCallbackDefault = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i3 = IAuthTabCallbackDefault + 1;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            textView = null;
        }
        ViewCompat.IAuthTabCallback(textView, true);
        View viewFindViewById2 = view.findViewById(R.id.description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.onWarmupCompleted = (TextView) viewFindViewById2;
        TdsImageView tdsImageViewFindViewById = view.findViewById(R.id.close);
        Intrinsics.checkNotNullExpressionValue(tdsImageViewFindViewById, "");
        this.IAuthTabCallback = tdsImageViewFindViewById;
    }

    public final void setTitle(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 43;
        IAuthTabCallbackDefault = i3 % 128;
        TextView textView = null;
        if (i3 % 2 != 0) {
            TextView textView2 = this.onExtraCallbackWithResult;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i4 = IAuthTabCallbackDefault + 17;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            } else {
                textView = textView2;
            }
            textView.setText(i);
            onNavigationEvent(getResources().getString(i));
            return;
        }
        textView.hashCode();
        throw null;
    }

    public final void setTitle(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        IAuthTabCallbackDefault = i2 % 128;
        TextView textView = null;
        if (i2 % 2 != 0) {
            TextView textView2 = this.onExtraCallbackWithResult;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i3 = onNavigationEvent + 87;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
            } else {
                textView = textView2;
            }
            textView.setText(charSequence);
            onNavigationEvent(charSequence);
            int i5 = IAuthTabCallbackDefault + 21;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 78 / 0;
                return;
            }
            return;
        }
        textView.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setDescription(int i) {
        int i2;
        int i3 = 2 % 2;
        TextView textView = this.onWarmupCompleted;
        TextView textView2 = null;
        if (textView == null) {
            int i4 = onNavigationEvent + 87;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                textView2.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            textView = null;
        }
        textView.setText(i);
        TextView textView3 = this.onWarmupCompleted;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            textView3 = null;
        }
        TextView textView4 = this.onWarmupCompleted;
        if (textView4 == null) {
            int i5 = IAuthTabCallbackDefault + 111;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            textView2 = textView4;
        }
        CharSequence text = textView2.getText();
        if (text != null) {
            int i7 = onNavigationEvent + 3;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            if (text.length() != 0) {
                int i9 = onNavigationEvent + 23;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
                i2 = 0;
            } else {
                i2 = 8;
            }
        }
        textView3.setVisibility(i2);
    }

    public final void setDescription(@Nullable CharSequence charSequence) {
        int i;
        int i2 = 2 % 2;
        TextView textView = this.onWarmupCompleted;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i3 = onNavigationEvent + 57;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            textView = null;
        }
        if (charSequence == null || charSequence.length() == 0) {
            i = 8;
        } else {
            int i5 = onNavigationEvent + 31;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        }
        textView.setVisibility(i);
        TextView textView3 = this.onWarmupCompleted;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            textView2 = textView3;
        }
        textView2.setText(charSequence);
    }

    public final void setDescriptionColor(int i) {
        int i2 = 2 % 2;
        TextView textView = this.onWarmupCompleted;
        if (textView == null) {
            int i3 = IAuthTabCallbackDefault + 107;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i5 = onNavigationEvent + 3;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            textView = null;
        }
        textView.setTextColor(i);
        int i7 = IAuthTabCallbackDefault + 35;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void setDescriptionFont(@NotNull response responseVar) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(responseVar, "");
        TextView textView = this.onWarmupCompleted;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            textView = null;
        }
        textView.setTypeface(response.toTypeface$default(responseVar, getContext(), (setDone) null, 2, (Object) null));
        int i4 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setShowCloseIcon(boolean z) {
        int i;
        int i2 = 2 % 2;
        View view = this.IAuthTabCallback;
        if (view == null) {
            int i3 = onNavigationEvent + 23;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            view = null;
        }
        if (z) {
            int i5 = IAuthTabCallbackDefault + 119;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        } else {
            int i7 = onNavigationEvent + 39;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            i = 8;
        }
        view.setVisibility(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setCloseClickListener(@NotNull View.OnClickListener onClickListener) {
        TdsImageView tdsImageView;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onClickListener, "");
            tdsImageView = this.IAuthTabCallback;
            int i3 = 76 / 0;
            if (tdsImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i4 = onNavigationEvent + 105;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                tdsImageView = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(onClickListener, "");
            tdsImageView = this.IAuthTabCallback;
            if (tdsImageView == null) {
            }
        }
        tdsImageView.setOnClickListener(onClickListener);
        int i6 = IAuthTabCallbackDefault + 17;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(view);
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        int i5 = onNavigationEvent + 11;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setCloseClickListener(@NotNull final Function1<? super View, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        View view = this.IAuthTabCallback;
        if (view == null) {
            int i2 = onNavigationEvent + 1;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i4 = onNavigationEvent + 113;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            view = null;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.dialog.BottomSheetHeader$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 31;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                BottomSheetHeader.onWarmupCompleted(function1, view2);
                int i9 = onExtraCallbackWithResult + 47;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
    }

    private final void onNavigationEvent(CharSequence charSequence) {
        String str;
        int i = 2 % 2;
        View view = this.IAuthTabCallback;
        if (view == null) {
            int i2 = IAuthTabCallbackDefault + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i4 = IAuthTabCallbackDefault + 7;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            view = null;
        }
        if (charSequence == null || StringsKt__StringsKt.isBlank(charSequence)) {
            str = "닫기";
        } else {
            str = ((Object) charSequence) + " 닫기";
            int i6 = onNavigationEvent + 97;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
        }
        view.setContentDescription(str);
    }

    public final TextView readTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TextView textView = this.onExtraCallbackWithResult;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            textView = null;
        }
        int i4 = onNavigationEvent + 103;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return textView;
        }
        throw null;
    }

    public final TextView asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        TextView textView = this.onWarmupCompleted;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        int i4 = IAuthTabCallbackDefault + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(canvas, "");
            super.dispatchDraw(canvas);
            onInstallReferrerServiceDisconnected.onExtraCallbackWithResult(onInstallReferrerServiceDisconnected.onExtraCallback, this, canvas, (SizeF) null, 2, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(canvas, "");
            super.dispatchDraw(canvas);
            onInstallReferrerServiceDisconnected.onExtraCallbackWithResult(onInstallReferrerServiceDisconnected.onExtraCallback, this, canvas, (SizeF) null, 4, (Object) null);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            onInstallReferrerServiceDisconnected.onExtraCallback.onExtraCallback(this, motionEvent);
            throw null;
        }
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (!onInstallReferrerServiceDisconnected.onExtraCallback.onExtraCallback(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        int i3 = IAuthTabCallbackDefault + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
