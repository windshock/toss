package im.toss.uikit.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SizeF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.uikit.R;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ComposableLambdaImplExternalSyntheticLambda2;
import o.ComposableLambdaImplExternalSyntheticLambda9;
import o.ICrashFilter;
import o.IOOMCallback;
import o.ManagedRetainedValuesStoreKtExternalSyntheticLambda0;
import o.RetainKt;
import o.alertWithArgs;
import o.deprecated_cacheControl;
import o.enableThreadsBoost;
import o.getDid;
import o.initMiniApp;
import o.initSDK;
import o.onInstallReferrerServiceDisconnected;
import o.onInstallReferrerSetupFinished;
import o.registerCrashCallback;
import o.reportCustomErr;
import o.setCustomDataCallback;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsResultV0View extends ConstraintLayout implements registerCrashCallback {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final Lazy onExtraCallback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsResultV0View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsResultV0View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallback(function1, view);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | (~(i7 | i3)) | (~(i8 | i3));
        int i10 = ~i3;
        int i11 = (~(i10 | i4)) | (~(i8 | i4));
        int i12 = ~(i8 | i7 | i10);
        int i13 = i3 + i4 + i2 + ((-2109949842) * i6) + (2078889904 * i5);
        int i14 = i13 * i13;
        int i15 = ((-1963971821) * i3) + 932184064 + (61854959 * i4) + (1134570258 * i9) + (i11 * (-1134570258)) + ((-1134570258) * i12) + (1196425216 * i2) + (610271232 * i6) + (922746880 * i5) + (671350784 * i14);
        int i16 = (i3 * (-573803825)) + 196542130 + (i4 * (-573802789)) + (i9 * (-518)) + (i11 * 518) + (i12 * 518) + (i2 * (-573803307)) + (i6 * (-843101306)) + (i5 * (-1524517520)) + (i14 * 458489856);
        int i17 = i15 + (i16 * i16 * 64749568);
        if (i17 == 1) {
            TdsResultV0View tdsResultV0View = (TdsResultV0View) objArr[0];
            ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2 = (ComposableLambdaImplExternalSyntheticLambda2) objArr[1];
            int i18 = 2 % 2;
            int i19 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i19 % 128;
            int i20 = i19 % 2;
            onNavigationEvent(tdsResultV0View, composableLambdaImplExternalSyntheticLambda2);
            int i21 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i21 % 128;
            int i22 = i21 % 2;
            return null;
        }
        if (i17 == 2) {
            return onWarmupCompleted(objArr);
        }
        registerCrashCallback registercrashcallback = (TdsResultV0View) objArr[0];
        int i23 = 2 % 2;
        int i24 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i24 % 128;
        int i25 = i24 % 2;
        BaseTextView baseTextViewFindViewById = registercrashcallback.findViewById(R.id.title);
        Intrinsics.checkNotNull(baseTextViewFindViewById);
        BaseTextView baseTextView = baseTextViewFindViewById;
        int i26 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i26 % 128;
        int i27 = i26 % 2;
        return baseTextView;
    }

    public static /* synthetic */ void onNavigationEvent(TdsResultV0View tdsResultV0View, View.OnClickListener onClickListener, View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {tdsResultV0View, onClickListener, view};
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = alertWithArgs.onExtraCallbackWithResult();
        if (i3 == 0) {
            onExtraCallbackWithResult(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 1688871057, -1688871055, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, objArr);
            throw null;
        }
        onExtraCallbackWithResult(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 1688871057, -1688871055, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, objArr);
        int i4 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TdsResultV0View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = reportCustomErr.onNavigationEvent(this, IOOMCallback.Result, false, (Function0) null, (Function1) null, 14, (Object) null);
        LayoutInflater.from(context).inflate(R.layout.tds_result_v0, (ViewGroup) this, true);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(40.0f), displayMetrics);
        setPadding(iOnNavigationEvent, getPaddingTop(), iOnNavigationEvent, getPaddingBottom());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsResultV0, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int i3 = onNavigationEvent + 79;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.TdsResultV0_image) {
                    setImage(typedArrayObtainStyledAttributes.getDrawable(index));
                } else if (index == R.styleable.TdsResultV0_title) {
                    setTitle(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == R.styleable.TdsResultV0_subtitle) {
                    setSubtitle(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == R.styleable.TdsResultV0_buttonLabel) {
                    setButtonLabel(typedArrayObtainStyledAttributes.getText(index));
                } else {
                    if (index == R.styleable.TdsResultV0_buttonsStyle) {
                        int i5 = onNavigationEvent + 47;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 == 0) {
                            IAuthTabCallback(typedArrayObtainStyledAttributes.getInt(index, 1));
                        } else {
                            IAuthTabCallback(typedArrayObtainStyledAttributes.getInt(index, 0));
                        }
                    } else if (index == R.styleable.TdsResultV0_buttonsSize) {
                        onExtraCallbackWithResult(typedArrayObtainStyledAttributes.getInt(index, 0));
                    } else if (index == R.styleable.TdsResultV0_buttonsDisplay) {
                        int i6 = onExtraCallbackWithResult + 25;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 != 0) {
                            onWarmupCompleted(typedArrayObtainStyledAttributes.getInt(index, 1));
                        } else {
                            onWarmupCompleted(typedArrayObtainStyledAttributes.getInt(index, 0));
                        }
                        int i7 = onExtraCallbackWithResult + 11;
                        onNavigationEvent = i7 % 128;
                        if (i7 % 2 != 0) {
                        }
                    } else if (index == R.styleable.TdsResultV0_buttonsType) {
                        onNavigationEvent(typedArrayObtainStyledAttributes.getInt(index, 0));
                        int i8 = onExtraCallbackWithResult + 99;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                    } else if (index == R.styleable.TdsResultV0_onButtonClick) {
                        setOnButtonClickListener((View.OnClickListener) new deprecated_cacheControl(this, typedArrayObtainStyledAttributes.getText(index).toString()));
                    } else if (index == R.styleable.TdsResultV0_lottieFromAsset) {
                        setLottieImageFromAsset(typedArrayObtainStyledAttributes.getString(index));
                    } else if (index == R.styleable.TdsResultV0_lottieFromUrl) {
                        setLottieImageFromUrl(typedArrayObtainStyledAttributes.getString(index));
                    }
                    int i10 = 2 % 2;
                }
            }
        }
    }

    public /* bridge */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        int i4 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return strIAuthTabCallback;
    }

    public /* synthetic */ initSDK IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback setcustomdatacallbackExtraCallbackWithResult = extraCallbackWithResult();
        int i4 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return setcustomdatacallbackExtraCallbackWithResult;
        }
        throw null;
    }

    public /* bridge */ Set<String> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        }
        super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ initSDK IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        initSDK initsdkIAuthTabCallbackStubProxy = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
        int i4 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return initsdkIAuthTabCallbackStubProxy;
    }

    public /* bridge */ boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback_Parcel = super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        return zIAuthTabCallback_Parcel;
    }

    public /* bridge */ enableThreadsBoost.onNavigationEvent access000() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        enableThreadsBoost.onNavigationEvent onnavigationeventAccess000 = super/*o.setDeviceId*/.access000();
        int i4 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationeventAccess000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean access100() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess100 = super/*o.initSDK*/.access100();
        int i4 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return zAccess100;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Function1<ICrashFilter, Boolean> asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Function1<ICrashFilter, Boolean> function1AsBinder = super/*o.MonitorCrashConfig*/.asBinder();
        int i4 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return function1AsBinder;
    }

    public /* bridge */ boolean extraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.extraCallback();
            throw null;
        }
        boolean zExtraCallback = super/*o.MonitorCrashConfig*/.extraCallback();
        int i3 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 7 / 0;
        }
        return zExtraCallback;
    }

    public /* bridge */ initSDK.onNavigationEvent getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
            obj.hashCode();
            throw null;
        }
        initSDK.onNavigationEvent interfaceDescriptor = super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
        int i3 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return interfaceDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ initSDK.onNavigationEvent onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        initSDK.onNavigationEvent onnavigationeventOnExtraCallback = super/*o.MonitorCrashConfig*/.onExtraCallback();
        int i4 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnExtraCallback;
    }

    public /* bridge */ initMiniApp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
            throw null;
        }
        initMiniApp initminiappOnExtraCallbackWithResult = super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
        int i3 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return initminiappOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ enableThreadsBoost onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        enableThreadsBoost enablethreadsboostOnNavigationEvent = super/*o.MonitorCrashConfig*/.onNavigationEvent();
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return enablethreadsboostOnNavigationEvent;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.setDeviceId*/.onNavigationEvent(map);
        }
        super/*o.setDeviceId*/.onNavigationEvent(map);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull ICrashFilter iCrashFilter) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(iCrashFilter);
        int i4 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* bridge */ getDid onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getDid getdidOnTransact = super/*o.MonitorCrashConfig*/.onTransact();
        int i4 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return getdidOnTransact;
    }

    public /* bridge */ Map<String, Object> onWarmupCompleted() {
        Map<String, Object> mapOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            mapOnWarmupCompleted = super/*o.MonitorCrashConfig*/.onWarmupCompleted();
            int i3 = 67 / 0;
        } else {
            mapOnWarmupCompleted = super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        }
        int i4 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return mapOnWarmupCompleted;
        }
        throw null;
    }

    public /* bridge */ void setAsCtaButton() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*o.initSDK*/.setAsCtaButton();
        int i4 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setComponentKey(@Nullable enableThreadsBoost enablethreadsboost) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setComponentKey(enablethreadsboost);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ void setCustomParam(@NotNull String str, @NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParam(str, function1);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ void setCustomParams(@NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParams(function1);
        int i4 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ void setEventLoggableChecker(@Nullable Function1<? super ICrashFilter, Boolean> function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setEventLoggableChecker(function1);
        int i4 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ void setMaskingWords(@NotNull Set<String> set) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMaskingWords(set);
        int i4 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
    }

    public /* bridge */ void setMetadata(@NotNull getDid getdid) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMetadata(getdid);
        int i4 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ void setTrackable(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setTrackable(z);
        int i4 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsResultV0View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onNavigationEvent + 103;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i5 = i4 + 45;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i8 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public setCustomDataCallback extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback setcustomdatacallback = (setCustomDataCallback) this.onExtraCallback.getValue();
        int i4 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return setcustomdatacallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnClickListener(@Nullable final View.OnClickListener onClickListener) {
        int i = 2 % 2;
        if (onClickListener == null) {
            int i2 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            super/*android.view.View*/.setOnClickListener(onClickListener);
            return;
        }
        super/*android.view.View*/.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.TdsResultV0View$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 15;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                TdsResultV0View tdsResultV0View = this.f$0;
                if (i6 == 0) {
                    TdsResultV0View.onNavigationEvent(tdsResultV0View, onClickListener, view);
                } else {
                    TdsResultV0View.onNavigationEvent(tdsResultV0View, onClickListener, view);
                    throw null;
                }
            }
        });
        int i4 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TdsResultV0View tdsResultV0View = (TdsResultV0View) objArr[0];
        View.OnClickListener onClickListener = (View.OnClickListener) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, tdsResultV0View, (initMiniApp) null, 2, (Object) null);
        onClickListener.onClick(view);
        int i4 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (!onInstallReferrerServiceDisconnected.onExtraCallback.onExtraCallback(this, motionEvent)) {
            return super/*android.view.View*/.onTouchEvent(motionEvent);
        }
        int i4 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public void dispatchDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.dispatchDraw(canvas);
        onInstallReferrerServiceDisconnected.onExtraCallbackWithResult(onInstallReferrerServiceDisconnected.onExtraCallback, this, canvas, (SizeF) null, 4, (Object) null);
        int i4 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
    }

    public final void setImage(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback().setVisibility(0);
        TdsImageView.setImage$default(ICustomTabsCallback(), str, (Function1) null, (Function1) null, 6, (Object) null);
        writeTypedObject().setVisibility(8);
        int i4 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setImage(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            ICustomTabsCallback().setImageResource(i);
            if (i == 0) {
                ICustomTabsCallback().setVisibility(8);
                return;
            }
            ICustomTabsCallback().setVisibility(0);
            writeTypedObject().setVisibility(8);
            int i4 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        ICustomTabsCallback().setImageResource(i);
        obj.hashCode();
        throw null;
    }

    public final void setImage(@Nullable Drawable drawable) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback().setImageDrawable(drawable);
        if (drawable != null) {
            ICustomTabsCallback().setVisibility(0);
            writeTypedObject().setVisibility(8);
        } else {
            int i4 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            ICustomTabsCallback().setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setLottieImageFromUrl(@Nullable String str) {
        int i = 2 % 2;
        if (str != null) {
            RetainKt retainKtIAuthTabCallback = ComposableLambdaImplExternalSyntheticLambda9.IAuthTabCallback(getContext(), str);
            Intrinsics.checkNotNullExpressionValue(retainKtIAuthTabCallback, "");
            onNavigationEvent((RetainKt<ComposableLambdaImplExternalSyntheticLambda2>) retainKtIAuthTabCallback);
        }
        if (str == null || str.length() == 0) {
            writeTypedObject().setVisibility(8);
            int i2 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 6 / 0;
                return;
            }
            return;
        }
        writeTypedObject().setVisibility(0);
        ICustomTabsCallback().setVisibility(8);
        int i4 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setLottieImageFromAsset(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (str != null) {
            RetainKt retainKtOnExtraCallbackWithResult = ComposableLambdaImplExternalSyntheticLambda9.onExtraCallbackWithResult(getContext(), str);
            Intrinsics.checkNotNullExpressionValue(retainKtOnExtraCallbackWithResult, "");
            onNavigationEvent((RetainKt<ComposableLambdaImplExternalSyntheticLambda2>) retainKtOnExtraCallbackWithResult);
        }
        if (str == null || str.length() == 0) {
            writeTypedObject().setVisibility(8);
            return;
        }
        int i4 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        writeTypedObject().setVisibility(0);
        ICustomTabsCallback().setVisibility(8);
    }

    private final void onNavigationEvent(RetainKt<ComposableLambdaImplExternalSyntheticLambda2> retainKt) {
        int i = 2 % 2;
        retainKt.onExtraCallbackWithResult(new ManagedRetainedValuesStoreKtExternalSyntheticLambda0() { // from class: im.toss.uikit.widget.TdsResultV0View$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final void onResult(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 119;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {this.f$0, (ComposableLambdaImplExternalSyntheticLambda2) obj};
                TdsResultV0View.onExtraCallbackWithResult(alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -1197141769, 1197141770, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), objArr);
                int i5 = onExtraCallback + 19;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final void onNavigationEvent(TdsResultV0View tdsResultV0View, ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            tdsResultV0View.writeTypedObject().setComposition(composableLambdaImplExternalSyntheticLambda2);
            tdsResultV0View.writeTypedObject().playAnimation();
        } else {
            tdsResultV0View.writeTypedObject().setComposition(composableLambdaImplExternalSyntheticLambda2);
            tdsResultV0View.writeTypedObject().playAnimation();
            throw null;
        }
    }

    public final void setTitle(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
            ((BaseTextView) onExtraCallbackWithResult(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 2034279471, -2034279471, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{this})).setText(charSequence);
            int iOnExtraCallbackWithResult4 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = alertWithArgs.onExtraCallbackWithResult();
            if (((BaseTextView) onExtraCallbackWithResult(iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult5, 2034279471, -2034279471, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, new Object[]{this})).length() == 0) {
                int iOnExtraCallbackWithResult7 = alertWithArgs.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult8 = alertWithArgs.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult9 = alertWithArgs.onExtraCallbackWithResult();
                ((BaseTextView) onExtraCallbackWithResult(iOnExtraCallbackWithResult7, iOnExtraCallbackWithResult8, 2034279471, -2034279471, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult9, new Object[]{this})).setVisibility(8);
                int i3 = onNavigationEvent + 17;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int iOnExtraCallbackWithResult10 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult11 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult12 = alertWithArgs.onExtraCallbackWithResult();
            ((BaseTextView) onExtraCallbackWithResult(iOnExtraCallbackWithResult10, iOnExtraCallbackWithResult11, 2034279471, -2034279471, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult12, new Object[]{this})).setVisibility(0);
            return;
        }
        int iOnExtraCallbackWithResult13 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult14 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult15 = alertWithArgs.onExtraCallbackWithResult();
        ((BaseTextView) onExtraCallbackWithResult(iOnExtraCallbackWithResult13, iOnExtraCallbackWithResult14, 2034279471, -2034279471, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult15, new Object[]{this})).setText(charSequence);
        int iOnExtraCallbackWithResult16 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult17 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult18 = alertWithArgs.onExtraCallbackWithResult();
        ((BaseTextView) onExtraCallbackWithResult(iOnExtraCallbackWithResult16, iOnExtraCallbackWithResult17, 2034279471, -2034279471, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult18, new Object[]{this})).length();
        throw null;
    }

    public final void setSubtitle(@Nullable CharSequence charSequence) {
        BaseTextView typedObject;
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        readTypedObject().setText(charSequence);
        if (readTypedObject().length() == 0) {
            int i5 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                typedObject = readTypedObject();
                i = 96;
            } else {
                typedObject = readTypedObject();
                i = 8;
            }
            typedObject.setVisibility(i);
            return;
        }
        readTypedObject().setVisibility(0);
    }

    public final void setButtonLabel(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        asInterface().setText(charSequence);
        if (asInterface().length() != 0) {
            asInterface().setVisibility(0);
            return;
        }
        int i2 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        asInterface().setVisibility(8);
        int i4 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        TdsButtonV1View.IAuthTabCallbackDefault[] iAuthTabCallbackDefaultArrValues = TdsButtonV1View.IAuthTabCallbackDefault.values();
        if (i4 == 0) {
            setButtonStyle(iAuthTabCallbackDefaultArrValues[i]);
            return;
        }
        setButtonStyle(iAuthTabCallbackDefaultArrValues[i]);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setButtonStyle(@NotNull TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        TdsButtonV1View tdsButtonV1ViewAsInterface;
        TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub;
        TdsButtonV1View.onWarmupCompleted onwarmupcompleted;
        TdsButtonV1View.IAuthTabCallback iAuthTabCallback;
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
            tdsButtonV1ViewAsInterface = asInterface();
            iAuthTabCallbackStub = null;
            onwarmupcompleted = null;
            iAuthTabCallback = null;
            i = 74;
        } else {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
            tdsButtonV1ViewAsInterface = asInterface();
            iAuthTabCallbackStub = null;
            onwarmupcompleted = null;
            iAuthTabCallback = null;
            i = 13;
        }
        TdsButtonV1View.setTheme$default(tdsButtonV1ViewAsInterface, iAuthTabCallbackStub, iAuthTabCallbackDefault, onwarmupcompleted, iAuthTabCallback, i, (Object) null);
        int i4 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        TdsButtonV1View.IAuthTabCallbackStub[] iAuthTabCallbackStubArrValues = TdsButtonV1View.IAuthTabCallbackStub.values();
        if (i4 != 0) {
            setButtonType(iAuthTabCallbackStubArrValues[i]);
        } else {
            setButtonType(iAuthTabCallbackStubArrValues[i]);
            throw null;
        }
    }

    public final void setButtonType(@NotNull TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        TdsButtonV1View.setTheme$default(asInterface(), iAuthTabCallbackStub, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 14, (Object) null);
        int i4 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
    }

    private final void onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        setButtonSize(TdsButtonV1View.onWarmupCompleted.values()[i]);
        int i5 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
    }

    public final void setButtonSize(@NotNull TdsButtonV1View.onWarmupCompleted onwarmupcompleted) {
        TdsButtonV1View tdsButtonV1ViewAsInterface;
        TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub;
        TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault;
        TdsButtonV1View.IAuthTabCallback iAuthTabCallback;
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            tdsButtonV1ViewAsInterface = asInterface();
            iAuthTabCallbackStub = null;
            iAuthTabCallbackDefault = null;
            iAuthTabCallback = null;
            i = Imgproc.COLOR_YUV2BGR_YVYU;
        } else {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            tdsButtonV1ViewAsInterface = asInterface();
            iAuthTabCallbackStub = null;
            iAuthTabCallbackDefault = null;
            iAuthTabCallback = null;
            i = 11;
        }
        TdsButtonV1View.setTheme$default(tdsButtonV1ViewAsInterface, iAuthTabCallbackStub, iAuthTabCallbackDefault, onwarmupcompleted, iAuthTabCallback, i, (Object) null);
        int i4 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        setButtonDisplay(TdsButtonV1View.IAuthTabCallback.values()[i]);
        int i5 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void setButtonDisplay(@NotNull TdsButtonV1View.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        TdsButtonV1View.setTheme$default(asInterface(), (TdsButtonV1View.IAuthTabCallbackStub) null, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, iAuthTabCallback, 7, (Object) null);
        int i4 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onExtraCallback(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(view);
        int i4 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setOnButtonClickListener(@NotNull final Function1<? super View, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        asInterface().setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.TdsResultV0View$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 63;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                TdsResultV0View.IAuthTabCallback(function1, view);
                int i5 = onNavigationEvent + 65;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setOnButtonClickListener(@NotNull View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onClickListener, "");
        asInterface().setOnClickListener(onClickListener);
        int i4 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject().cancelAnimation();
        super/*android.view.View*/.onDetachedFromWindow();
        int i4 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TdsImageView ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageViewFindViewById = findViewById(R.id.image);
        Intrinsics.checkNotNull(tdsImageViewFindViewById);
        TdsImageView tdsImageView = tdsImageViewFindViewById;
        int i4 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return tdsImageView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BaseTextView readTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextViewFindViewById = findViewById(R.id.subtitle);
        Intrinsics.checkNotNull(baseTextViewFindViewById);
        BaseTextView baseTextView = baseTextViewFindViewById;
        int i4 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return baseTextView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TdsButtonV1View asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TdsButtonV1View tdsButtonV1ViewFindViewById = findViewById(R.id.button);
        if (i3 != 0) {
            Intrinsics.checkNotNull(tdsButtonV1ViewFindViewById);
            return tdsButtonV1ViewFindViewById;
        }
        Intrinsics.checkNotNull(tdsButtonV1ViewFindViewById);
        int i4 = 87 / 0;
        return tdsButtonV1ViewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LottieAnimationView writeTypedObject() {
        LottieAnimationView lottieAnimationViewFindViewById;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            lottieAnimationViewFindViewById = (LottieAnimationView) findViewById(R.id.lottieImage);
            int i3 = 22 / 0;
        } else {
            lottieAnimationViewFindViewById = findViewById(R.id.lottieImage);
        }
        int i4 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return lottieAnimationViewFindViewById;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TdsResultV0View tdsResultV0View, ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1197141769, 1197141770, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{tdsResultV0View, composableLambdaImplExternalSyntheticLambda2});
    }

    private static final void IAuthTabCallback(TdsResultV0View tdsResultV0View, View.OnClickListener onClickListener, View view) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 1688871057, -1688871055, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{tdsResultV0View, onClickListener, view});
    }

    public final BaseTextView onActivityResized() {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
        return (BaseTextView) onExtraCallbackWithResult(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 2034279471, -2034279471, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{this});
    }
}
