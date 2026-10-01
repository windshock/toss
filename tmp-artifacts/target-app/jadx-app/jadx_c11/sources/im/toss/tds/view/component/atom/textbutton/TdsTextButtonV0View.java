package im.toss.tds.view.component.atom.textbutton;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.R;
import im.toss.tds.view.component.atom.text.Typography5;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.AppLovinSdkSettings;
import o.CameraControllerExternalSyntheticLambda9;
import o.ConnectionPool;
import o.ICrashFilter;
import o.VectorConvertersKtExternalSyntheticLambda8;
import o.access15300;
import o.accessgetTlsVersionsAsStringp;
import o.deprecated_certificatePinner;
import o.deprecated_dns;
import o.enableThreadsBoost;
import o.getDid;
import o.getUrlokhttp;
import o.head;
import o.initMiniApp;
import o.initSDK;
import o.isMuted;
import o.matches;
import o.onCrash;
import o.onInstallReferrerServiceDisconnected;
import o.onInstallReferrerSetupFinished;
import o.registerCrashCallback;
import o.reportCustomErr;
import o.setBodyokhttp;
import o.setCustomDataCallback;
import o.setHeadersokhttp;
import o.setTagsokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TdsTextButtonV0View extends Typography5 implements registerCrashCallback {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private Paint asBinder;
    private final head asInterface;
    private boolean onExtraCallback;
    private final float onExtraCallbackWithResult;
    private final Rect onNavigationEvent;
    private IAuthTabCallback onTransact;
    private final Lazy onWarmupCompleted;

    public static final /* synthetic */ class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[IAuthTabCallback.values().length];
            try {
                iArr[IAuthTabCallback.GREY.ordinal()] = 1;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IAuthTabCallback.PRIMARY.ordinal()] = 2;
                int i2 = IAuthTabCallback + 15;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 / 3;
                } else {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IAuthTabCallback.UNDERLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallbackWithResult = iArr;
            int i5 = IAuthTabCallback + 31;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTextButtonV0View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTextButtonV0View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ AppLovinSdkSettings onNavigationEvent(TdsTextButtonV0View tdsTextButtonV0View, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = IAuthTabCallback(tdsTextButtonV0View, z);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return appLovinSdkSettingsIAuthTabCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TdsTextButtonV0View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onWarmupCompleted = reportCustomErr.onNavigationEvent(this, onCrash.TextButton, false, (Function0) null, (Function1) null, 14, (Object) null);
        this.onTransact = IAuthTabCallback.GREY;
        this.onNavigationEvent = new Rect();
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        this.onExtraCallbackWithResult = varyMatches.onNavigationEvent((Number) 4, r11);
        this.asInterface = new head(this, (View) null, false, new Function1() { // from class: im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 115;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = TdsTextButtonV0View.onNavigationEvent(this.f$0, ((Boolean) obj).booleanValue());
                int i5 = onNavigationEvent + 25;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return appLovinSdkSettingsOnNavigationEvent;
            }
        }, 6, (DefaultConstructorMarker) null);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(onExtraCallbackWithResult(paint.getTextSize()));
        this.asBinder = paint;
        setBackgroundResource(R.drawable.text_button_bg);
        setPadding(0, setTagsokhttp.onExtraCallbackWithResult(this, 2), 0, setTagsokhttp.onExtraCallbackWithResult(this, 2));
        setGravity(16);
        setTextColor(onMinimized());
        VectorConvertersKtExternalSyntheticLambda8.IAuthTabCallback(this, im.toss.tds.R.style.TdsFont_Medium);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsTextButtonV0View, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.TdsTextButtonV0View_arrow) {
                    int i3 = IAuthTabCallbackStub + 15;
                    IAuthTabCallbackDefault = i3 % 128;
                    int i4 = i3 % 2;
                    setArrow(typedArrayObtainStyledAttributes.getBoolean(index, false));
                } else {
                    if (index == R.styleable.TdsTextButtonV0View_textButtonType) {
                        int i5 = IAuthTabCallbackStub + 103;
                        IAuthTabCallbackDefault = i5 % 128;
                        if (i5 % 2 != 0) {
                            setType((IAuthTabCallback) IAuthTabCallback.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0)));
                        } else {
                            setType((IAuthTabCallback) IAuthTabCallback.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0)));
                        }
                    } else if (index == R.styleable.TdsTextButtonV0View_ignoreClipPadding) {
                        this.onExtraCallback = typedArrayObtainStyledAttributes.getBoolean(index, false);
                    } else if (index == R.styleable.TdsTextButtonV0View_android_gravity) {
                        setGravity(typedArrayObtainStyledAttributes.getInt(index, 16));
                        int i6 = IAuthTabCallbackDefault + 1;
                        IAuthTabCallbackStub = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 5 / 2;
                        }
                    }
                    int i8 = 2 % 2;
                }
            }
        }
        onExtraCallbackWithResult(ConnectionPool.onWarmupCompleted.onWarmupCompleted());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsTextButtonV0View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallbackDefault + 117;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = IAuthTabCallbackDefault + 99;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 3;
            } else {
                int i6 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public /* bridge */ String IAuthTabCallback() {
        String strIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            strIAuthTabCallback = super/*o.MonitorCrashConfig*/.IAuthTabCallback();
            int i3 = 49 / 0;
        } else {
            strIAuthTabCallback = super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        }
        int i4 = IAuthTabCallbackStub + 91;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }

    public /* synthetic */ initSDK IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback setcustomdatacallbackOnMessageChannelReady = onMessageChannelReady();
        int i4 = IAuthTabCallbackStub + 105;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return setcustomdatacallbackOnMessageChannelReady;
    }

    public /* bridge */ Set<String> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        }
        super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        throw null;
    }

    public /* bridge */ initSDK IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        initSDK initsdkIAuthTabCallbackStubProxy = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
        int i4 = IAuthTabCallbackStub + 61;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return initsdkIAuthTabCallbackStubProxy;
    }

    public /* bridge */ boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback_Parcel = super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        return zIAuthTabCallback_Parcel;
    }

    public /* bridge */ enableThreadsBoost.onNavigationEvent access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        enableThreadsBoost.onNavigationEvent onnavigationeventAccess000 = super/*o.setDeviceId*/.access000();
        int i4 = IAuthTabCallbackDefault + 47;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationeventAccess000;
        }
        throw null;
    }

    public /* bridge */ boolean access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.initSDK*/.access100();
        }
        super/*o.initSDK*/.access100();
        throw null;
    }

    public /* bridge */ Function1<ICrashFilter, Boolean> asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.MonitorCrashConfig*/.asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Function1<ICrashFilter, Boolean> function1AsBinder = super/*o.MonitorCrashConfig*/.asBinder();
        int i3 = IAuthTabCallbackStub + 109;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 46 / 0;
        }
        return function1AsBinder;
    }

    public /* bridge */ boolean extraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallback = super/*o.MonitorCrashConfig*/.extraCallback();
        int i4 = IAuthTabCallbackDefault + 101;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return zExtraCallback;
        }
        throw null;
    }

    public /* bridge */ initSDK.onNavigationEvent getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
        }
        super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
        throw null;
    }

    public /* bridge */ initSDK.onNavigationEvent onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        initSDK.onNavigationEvent onnavigationeventOnExtraCallback = super/*o.MonitorCrashConfig*/.onExtraCallback();
        int i4 = IAuthTabCallbackDefault + 17;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnExtraCallback;
    }

    public /* bridge */ initMiniApp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        initMiniApp initminiappOnExtraCallbackWithResult = super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
        int i3 = IAuthTabCallbackDefault + 113;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 81 / 0;
        }
        return initminiappOnExtraCallbackWithResult;
    }

    public /* bridge */ enableThreadsBoost onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        enableThreadsBoost enablethreadsboostOnNavigationEvent = super/*o.MonitorCrashConfig*/.onNavigationEvent();
        int i4 = IAuthTabCallbackDefault + 41;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return enablethreadsboostOnNavigationEvent;
        }
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(map);
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 61;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 93 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull ICrashFilter iCrashFilter) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.setDeviceId*/.onNavigationEvent(iCrashFilter);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(iCrashFilter);
        int i3 = IAuthTabCallbackStub + 121;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ getDid onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getDid getdidOnTransact = super/*o.MonitorCrashConfig*/.onTransact();
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return getdidOnTransact;
    }

    public /* bridge */ Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.MonitorCrashConfig*/.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, Object> mapOnWarmupCompleted = super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        int i3 = IAuthTabCallbackStub + 69;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return mapOnWarmupCompleted;
    }

    public /* bridge */ void setAsCtaButton() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.initSDK*/.setAsCtaButton();
        int i4 = IAuthTabCallbackDefault + 65;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
    }

    public /* bridge */ void setComponentKey(@Nullable enableThreadsBoost enablethreadsboost) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super/*o.MonitorCrashConfig*/.setComponentKey(enablethreadsboost);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 35;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setCustomParam(@NotNull String str, @NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParam(str, function1);
        int i4 = IAuthTabCallbackStub + 81;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setCustomParams(@NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParams(function1);
        int i4 = IAuthTabCallbackDefault + 1;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setEventLoggableChecker(@Nullable Function1<? super ICrashFilter, Boolean> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setEventLoggableChecker(function1);
        int i4 = IAuthTabCallbackStub + 109;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
    }

    public /* bridge */ void setMaskingWords(@NotNull Set<String> set) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMaskingWords(set);
        int i4 = IAuthTabCallbackStub + 49;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setMetadata(@NotNull getDid getdid) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMetadata(getdid);
        int i4 = IAuthTabCallbackDefault + 105;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setTrackable(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setTrackable(z);
        int i4 = IAuthTabCallbackStub + 115;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public setCustomDataCallback onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback setcustomdatacallback = (setCustomDataCallback) this.onWarmupCompleted.getValue();
        int i4 = IAuthTabCallbackDefault + 41;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return setcustomdatacallback;
        }
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final int index;
        public static final IAuthTabCallback GREY = new IAuthTabCallback("GREY", 0, 0);
        public static final IAuthTabCallback PRIMARY = new IAuthTabCallback("PRIMARY", 1, 1);
        public static final IAuthTabCallback UNDERLINE = new IAuthTabCallback("UNDERLINE", 2, 2);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {GREY, PRIMARY, UNDERLINE};
            int i5 = i3 + 105;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 113;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i5 = i2 + 5;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            IAuthTabCallback[] iAuthTabCallbackArr;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
                int i3 = 41 / 0;
            } else {
                iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            }
            int i4 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iAuthTabCallbackArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback(String str, int i, int i2) {
            this.index = i2;
        }

        public final int getIndex() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 17;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.index;
            int i6 = i2 + 59;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            throw null;
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onNavigationEvent + 1;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final AppLovinSdkSettings IAuthTabCallback(TdsTextButtonV0View tdsTextButtonV0View, boolean z) {
        deprecated_dns deprecated_dnsVarOnNavigationEvent;
        float f;
        int i = 2 % 2;
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        if (z) {
            int i2 = IAuthTabCallbackDefault + 29;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            deprecated_dnsVarOnNavigationEvent = deprecated_certificatepinner.asInterface();
        } else {
            deprecated_dnsVarOnNavigationEvent = deprecated_certificatepinner.onNavigationEvent();
        }
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_dnsVarOnNavigationEvent}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        float scaleX = tdsTextButtonV0View.getScaleX();
        if (!z) {
            f = 1.0f;
        } else {
            int i4 = IAuthTabCallbackStub + 23;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            f = 0.96f;
        }
        AppLovinSdkSettings appLovinSdkSettingsAsBinder = isMuted.asBinder(appLovinSdkSettings, Float.valueOf(scaleX), Float.valueOf(f), null, 4, null);
        int i6 = IAuthTabCallbackStub + 63;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return appLovinSdkSettingsAsBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onAttachedToWindow() {
        int i = 2 % 2;
        super/*android.view.View*/.onAttachedToWindow();
        if (getParent() instanceof ViewGroup) {
            int i2 = IAuthTabCallbackStub + 29;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            if (this.onExtraCallback) {
                return;
            }
            ViewParent parent = getParent();
            Intrinsics.checkNotNull(parent, "");
            ((ViewGroup) parent).setClipChildren(false);
            ViewParent parent2 = getParent();
            Intrinsics.checkNotNull(parent2, "");
            ((ViewGroup) parent2).setClipToPadding(false);
            int i4 = IAuthTabCallbackStub + 115;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean performClick() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, this, (initMiniApp) null, 2, (Object) null);
        boolean zPerformClick = super/*android.view.View*/.performClick();
        int i4 = IAuthTabCallbackDefault + 7;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return zPerformClick;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setArrow(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (z) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getContext().getResources(), im.toss.tds.R.drawable.icon_arrow_right_mono), (int) getTextSize(), (int) getTextSize(), true);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "");
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), bitmapCreateScaledBitmap);
            CameraControllerExternalSyntheticLambda9.IAuthTabCallback(bitmapDrawable, IAuthTabCallback(this.onTransact));
            bitmapDrawable.setColorFilter(new PorterDuffColorFilter(IAuthTabCallback(this.onTransact), PorterDuff.Mode.SRC_IN));
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, bitmapDrawable, (Drawable) null);
            return;
        }
        setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        int i4 = IAuthTabCallbackStub + 55;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setType(@NotNull IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.onTransact = iAuthTabCallback;
        int iIAuthTabCallback = IAuthTabCallback(iAuthTabCallback);
        setTextColor(iIAuthTabCallback);
        setTextSize(2, onNavigationEvent(iAuthTabCallback));
        Drawable drawable = getCompoundDrawables()[2];
        if (drawable != null) {
            CameraControllerExternalSyntheticLambda9.IAuthTabCallback(drawable, iIAuthTabCallback);
            drawable.setColorFilter(new PorterDuffColorFilter(iIAuthTabCallback, PorterDuff.Mode.SRC_IN));
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            int i4 = IAuthTabCallbackDefault + 61;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.tds.view.component.atom.text.BaseTextView, im.toss.tds.view.component.atom.text.LineHeightBasedTextView
    public void setTextSize(int i, float f) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 17;
        IAuthTabCallbackStub = i3 % 128;
        Paint paint = null;
        if (i3 % 2 != 0) {
            super.setTextSize(i, f);
            float textSize = getTextSize();
            Paint paint2 = this.asBinder;
            if (paint2 != null) {
                if (paint2 == null) {
                    int i4 = IAuthTabCallbackDefault + 13;
                    IAuthTabCallbackStub = i4 % 128;
                    if (i4 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    paint = paint2;
                }
                paint.setStrokeWidth(onExtraCallbackWithResult(textSize));
            }
            if (getCompoundDrawables()[2] != null) {
                setArrow(true);
                return;
            }
            return;
        }
        super.setTextSize(i, f);
        getTextSize();
        paint.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextColor(int i) {
        int i2 = 2 % 2;
        super/*android.widget.TextView*/.setTextColor(i);
        Paint paint = this.asBinder;
        if (paint != null) {
            int i3 = IAuthTabCallbackDefault + 109;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            if (paint == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                paint = null;
            }
            paint.setColor(i);
            int i5 = IAuthTabCallbackStub + 113;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 % 4;
            }
        }
        int i7 = IAuthTabCallbackStub + 99;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 31 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setUnderlineColor(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 61;
        IAuthTabCallbackDefault = i3 % 128;
        Paint paint = null;
        if (i3 % 2 == 0) {
            Paint paint2 = this.asBinder;
            if (paint2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = IAuthTabCallbackDefault + 41;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            } else {
                paint = paint2;
            }
            paint.setColor(i);
            invalidate();
            return;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private final int IAuthTabCallback(IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent.onExtraCallbackWithResult[iAuthTabCallback.ordinal()];
        if (i2 == 1) {
            int iOnMinimized = onMinimized();
            int i3 = IAuthTabCallbackDefault + 79;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return iOnMinimized;
        }
        int i5 = IAuthTabCallbackDefault + 9;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0 ? i2 != 2 : i2 != 5) {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return onMinimized();
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iIntValue = ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue();
        int i6 = IAuthTabCallbackStub + 69;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 92 / 0;
        }
        return iIntValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int onMinimized() {
        int i = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iOnPostMessage = new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration)).onPostMessage();
        int i2 = IAuthTabCallbackDefault + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return iOnPostMessage;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final float onNavigationEvent(IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent.onExtraCallbackWithResult[iAuthTabCallback.ordinal()];
        if (i2 != 1) {
            int i3 = IAuthTabCallbackDefault;
            int i4 = i3 + 121;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = i3 + 91;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                return accessgetTlsVersionsAsStringp.SubTypography11.getSize();
            }
        }
        float size = accessgetTlsVersionsAsStringp.Typography5.getSize();
        int i8 = IAuthTabCallbackStub + 113;
        IAuthTabCallbackDefault = i8 % 128;
        int i9 = i8 % 2;
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.tds.view.component.atom.text.LineHeightBasedTextView
    public void onDraw(@NotNull Canvas canvas) {
        int lineCount;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        if (this.onTransact == IAuthTabCallback.UNDERLINE) {
            int i3 = IAuthTabCallbackDefault + 43;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                lineCount = getLineCount();
                i = 1;
            } else {
                lineCount = getLineCount();
                i = 0;
            }
            IntIterator it = RangesKt.until(i, lineCount).iterator();
            while (it.hasNext()) {
                int iNextInt = it.nextInt();
                int lineBounds = getLineBounds(iNextInt, this.onNavigationEvent);
                int lineStart = getLayout().getLineStart(iNextInt);
                int lineEnd = getLayout().getLineEnd(iNextInt);
                float primaryHorizontal = getLayout().getPrimaryHorizontal(lineStart);
                Layout layout = getLayout();
                if (iNextInt != lineCount - 1) {
                    int i4 = IAuthTabCallbackDefault + 37;
                    int i5 = i4 % 128;
                    IAuthTabCallbackStub = i5;
                    int i6 = i4 % 2;
                    lineEnd--;
                    int i7 = i5 + 85;
                    IAuthTabCallbackDefault = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 4 % 3;
                    }
                }
                float primaryHorizontal2 = layout.getPrimaryHorizontal(lineEnd);
                float f = lineBounds + this.onExtraCallbackWithResult;
                Paint paint = this.asBinder;
                if (paint == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    paint = null;
                }
                canvas.drawLine(primaryHorizontal, f, primaryHorizontal2, f, paint);
                int i9 = IAuthTabCallbackStub + 53;
                IAuthTabCallbackDefault = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 3 / 5;
                }
            }
        }
        super.onDraw(canvas);
        onInstallReferrerServiceDisconnected.onExtraCallbackWithResult(onInstallReferrerServiceDisconnected.onExtraCallback, this, canvas, (SizeF) null, 4, (Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        return super/*android.view.View*\/.onTouchEvent(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (o.onInstallReferrerServiceDisconnected.onExtraCallback.onExtraCallback(r3, r4) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (o.onInstallReferrerServiceDisconnected.onExtraCallback.onExtraCallback(r3, r4) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        r4 = im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View.IAuthTabCallbackStub + 13;
        im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View.IAuthTabCallbackDefault = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            this.asInterface.onNavigationEvent(motionEvent);
            int i3 = 67 / 0;
        } else {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            this.asInterface.onNavigationEvent(motionEvent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPressed(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.setPressed(z);
        this.asInterface.onNavigationEvent(z);
        int i4 = IAuthTabCallbackStub + 19;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int onExtraCallbackWithResult(float f) {
        float f2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        float fOnWarmupCompleted = varyMatches.onWarmupCompleted((View) this, (Number) Float.valueOf(f));
        if (fOnWarmupCompleted <= 15.0f) {
            int i4 = IAuthTabCallbackStub + 21;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            f2 = 0.7f;
        } else if (fOnWarmupCompleted <= 18.0f) {
            int i6 = IAuthTabCallbackDefault + 51;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            f2 = 1.0f;
        } else if (fOnWarmupCompleted <= 22.0f) {
            int i8 = IAuthTabCallbackStub + 49;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            f2 = 1.3f;
        } else if (fOnWarmupCompleted <= 28.0f) {
            f2 = 1.5f;
        } else if (fOnWarmupCompleted <= 34.0f) {
            f2 = 1.8f;
        } else if (fOnWarmupCompleted <= 40.0f) {
            int i10 = IAuthTabCallbackStub + 71;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
            f2 = 2.0f;
        } else if (fOnWarmupCompleted <= 49.0f) {
            int i12 = IAuthTabCallbackDefault + 59;
            IAuthTabCallbackStub = i12 % 128;
            int i13 = i12 % 2;
            f2 = 2.3f;
        } else {
            f2 = 2.8f;
        }
        return varyMatches.IAuthTabCallback((View) this, (Number) Float.valueOf(f2));
    }
}
