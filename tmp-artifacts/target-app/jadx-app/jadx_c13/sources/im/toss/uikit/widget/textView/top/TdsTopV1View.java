package im.toss.uikit.widget.textView.top;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SizeF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography1;
import im.toss.tds.view.component.atom.text.Typography2;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.atom.text.Typography4;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.uikit.R;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ICrashFilter;
import o.IOOMCallback;
import o.access15300;
import o.enableThreadsBoost;
import o.getAdService;
import o.getDid;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.initMiniApp;
import o.initSDK;
import o.onInstallReferrerServiceDisconnected;
import o.readIntokhttp;
import o.registerCrashCallback;
import o.reportCustomErr;
import o.response;
import o.setCustomDataCallback;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsTopV1View extends ConstraintLayout implements registerCrashCallback {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private onNavigationEvent onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private onExtraCallbackWithResult onWarmupCompleted;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[onExtraCallbackWithResult.values().length];
            try {
                iArr[onExtraCallbackWithResult.TOP1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onExtraCallbackWithResult.TOP2.ordinal()] = 2;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onExtraCallbackWithResult.TOP3.ordinal()] = 3;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[onExtraCallbackWithResult.TOP4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[onExtraCallbackWithResult.TOP5.ordinal()] = 5;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[onExtraCallbackWithResult.TOP6.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[onNavigationEvent.values().length];
            try {
                iArr2[onNavigationEvent.TOP1.ordinal()] = 1;
                int i4 = IAuthTabCallback + 57;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[onNavigationEvent.TOP2.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[onNavigationEvent.TOP3.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[onNavigationEvent.TOP4.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[onNavigationEvent.TOP5.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[onNavigationEvent.TOP6.ordinal()] = 6;
                int i7 = onWarmupCompleted + 115;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 2;
                }
            } catch (NoSuchFieldError unused12) {
            }
            onExtraCallbackWithResult = iArr2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTopV1View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTopV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TdsTopV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onNavigationEvent = reportCustomErr.onNavigationEvent(this, IOOMCallback.Top, false, (Function0) null, (Function1) null, 14, (Object) null);
        this.onWarmupCompleted = onExtraCallbackWithResult.NONE;
        this.onExtraCallbackWithResult = onNavigationEvent.NONE;
        if (getId() == -1) {
            setId(R.id.top);
            int i2 = onExtraCallback + 115;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        if (getLayoutParams() == null) {
            setLayoutParams(new ConstraintLayout.onExtraCallbackWithResult(-1, -2));
        }
        LayoutInflater.from(context).inflate(R.layout.top, (ViewGroup) this, true);
        if (attributeSet != null) {
            int i4 = IAuthTabCallback + 107;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsTopV1, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i6 = 2 % 2;
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == R.styleable.TdsTopV1_upperType) {
                    setUpperType(onExtraCallbackWithResult.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0)));
                    int i8 = R.styleable.TdsTopV1_upperText;
                    if (typedArrayObtainStyledAttributes.hasValue(i8)) {
                        setUpperText(typedArrayObtainStyledAttributes.getString(i8));
                    }
                    int i9 = R.styleable.TdsTopV1_upperTextColor;
                    if (typedArrayObtainStyledAttributes.hasValue(i9)) {
                        setUpperTextColor(typedArrayObtainStyledAttributes.getColorStateList(i9));
                        int i10 = IAuthTabCallback + 79;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                    }
                } else if (index == R.styleable.TdsTopV1_lowerType) {
                    setLowerType(onNavigationEvent.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0)));
                    int i12 = R.styleable.TdsTopV1_lowerText;
                    if (typedArrayObtainStyledAttributes.hasValue(i12)) {
                        int i13 = onExtraCallback + 81;
                        IAuthTabCallback = i13 % 128;
                        int i14 = i13 % 2;
                        setLowerText(typedArrayObtainStyledAttributes.getString(i12));
                    }
                    int i15 = R.styleable.TdsTopV1_lowerTextColor;
                    if (typedArrayObtainStyledAttributes.hasValue(i15)) {
                        int i16 = onExtraCallback + 55;
                        IAuthTabCallback = i16 % 128;
                        if (i16 % 2 != 0) {
                            setLowerTextColor(typedArrayObtainStyledAttributes.getColorStateList(i15));
                            int i17 = 69 / 0;
                        } else {
                            setLowerTextColor(typedArrayObtainStyledAttributes.getColorStateList(i15));
                        }
                        int i18 = IAuthTabCallback + 97;
                        onExtraCallback = i18 % 128;
                        int i19 = i18 % 2;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsTopV1View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallback + 87;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 81 / 0;
            }
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallback + 9;
            onExtraCallback = i6 % 128;
            i = i6 % 2 == 0 ? 1 : 0;
        }
        this(context, attributeSet, i);
    }

    public /* bridge */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        }
        super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        throw null;
    }

    public /* synthetic */ initSDK IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback setcustomdatacallbackICustomTabsCallback = ICustomTabsCallback();
        int i4 = onExtraCallback + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return setcustomdatacallbackICustomTabsCallback;
        }
        throw null;
    }

    public /* bridge */ Set<String> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Set<String> setIAuthTabCallbackStub = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        int i4 = IAuthTabCallback + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return setIAuthTabCallbackStub;
    }

    public /* bridge */ initSDK IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
        }
        super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
        throw null;
    }

    public /* bridge */ boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIAuthTabCallback_Parcel = super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        int i3 = IAuthTabCallback + 101;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return zIAuthTabCallback_Parcel;
    }

    public /* bridge */ enableThreadsBoost.onNavigationEvent access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.setDeviceId*/.access000();
        }
        super/*o.setDeviceId*/.access000();
        throw null;
    }

    public /* bridge */ boolean access100() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess100 = super/*o.initSDK*/.access100();
        int i4 = IAuthTabCallback + 103;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zAccess100;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Function1<ICrashFilter, Boolean> asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Function1<ICrashFilter, Boolean> function1AsBinder = super/*o.MonitorCrashConfig*/.asBinder();
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return function1AsBinder;
    }

    public /* bridge */ boolean extraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallback = super/*o.MonitorCrashConfig*/.extraCallback();
        int i4 = IAuthTabCallback + 125;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zExtraCallback;
    }

    public /* bridge */ initSDK.onNavigationEvent getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        initSDK.onNavigationEvent interfaceDescriptor = super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
        int i4 = onExtraCallback + 79;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return interfaceDescriptor;
        }
        throw null;
    }

    public /* bridge */ initSDK.onNavigationEvent onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        initSDK.onNavigationEvent onnavigationeventOnExtraCallback = super/*o.MonitorCrashConfig*/.onExtraCallback();
        int i4 = onExtraCallback + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationeventOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ initMiniApp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp initminiappOnExtraCallbackWithResult = super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        return initminiappOnExtraCallbackWithResult;
    }

    public /* bridge */ enableThreadsBoost onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        enableThreadsBoost enablethreadsboostOnNavigationEvent = super/*o.MonitorCrashConfig*/.onNavigationEvent();
        int i4 = IAuthTabCallback + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return enablethreadsboostOnNavigationEvent;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(map);
        int i4 = IAuthTabCallback + 101;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull ICrashFilter iCrashFilter) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(iCrashFilter);
        int i4 = IAuthTabCallback + 125;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* bridge */ getDid onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.onTransact();
        }
        super/*o.MonitorCrashConfig*/.onTransact();
        throw null;
    }

    public /* bridge */ Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        }
        super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        throw null;
    }

    public /* bridge */ void setAsCtaButton() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.initSDK*/.setAsCtaButton();
        int i4 = onExtraCallback + 69;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ void setComponentKey(@Nullable enableThreadsBoost enablethreadsboost) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setComponentKey(enablethreadsboost);
        int i4 = onExtraCallback + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setCustomParam(@NotNull String str, @NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParam(str, function1);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
    }

    public /* bridge */ void setCustomParams(@NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParams(function1);
        int i4 = onExtraCallback + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
    }

    public /* bridge */ void setEventLoggableChecker(@Nullable Function1<? super ICrashFilter, Boolean> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setEventLoggableChecker(function1);
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        int i5 = onExtraCallback + 99;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ void setMaskingWords(@NotNull Set<String> set) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMaskingWords(set);
        int i4 = onExtraCallback + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setMetadata(@NotNull getDid getdid) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMetadata(getdid);
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        int i5 = onExtraCallback + 97;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
    }

    public /* bridge */ void setTrackable(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super/*o.MonitorCrashConfig*/.setTrackable(z);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public setCustomDataCallback ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback setcustomdatacallback = (setCustomDataCallback) this.onNavigationEvent.getValue();
        if (i3 == 0) {
            return setcustomdatacallback;
        }
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        public static final onExtraCallbackWithResult TOP1 = new onExtraCallbackWithResult("TOP1", 0);
        public static final onExtraCallbackWithResult TOP2 = new onExtraCallbackWithResult("TOP2", 1);
        public static final onExtraCallbackWithResult TOP3 = new onExtraCallbackWithResult("TOP3", 2);
        public static final onExtraCallbackWithResult TOP4 = new onExtraCallbackWithResult("TOP4", 3);
        public static final onExtraCallbackWithResult TOP5 = new onExtraCallbackWithResult("TOP5", 4);
        public static final onExtraCallbackWithResult TOP6 = new onExtraCallbackWithResult("TOP6", 5);
        public static final onExtraCallbackWithResult NONE = new onExtraCallbackWithResult("NONE", 6);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {TOP1, TOP2, TOP3, TOP4, TOP5, TOP6, NONE};
            int i5 = i3 + 111;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return onextracallbackwithresultArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i4 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return enumEntries;
            }
            throw null;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            int i4 = onExtraCallbackWithResult + 109;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 94 / 0;
            }
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            onExtraCallbackWithResult[] onextracallbackwithresultArr;
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
                int i3 = 8 / 0;
            } else {
                onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            }
            int i4 = onExtraCallback + 45;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresultArr;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onWarmupCompleted + 33;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted = 1;
        public static final onNavigationEvent TOP1 = new onNavigationEvent("TOP1", 0);
        public static final onNavigationEvent TOP2 = new onNavigationEvent("TOP2", 1);
        public static final onNavigationEvent TOP3 = new onNavigationEvent("TOP3", 2);
        public static final onNavigationEvent TOP4 = new onNavigationEvent("TOP4", 3);
        public static final onNavigationEvent TOP5 = new onNavigationEvent("TOP5", 4);
        public static final onNavigationEvent TOP6 = new onNavigationEvent("TOP6", 5);
        public static final onNavigationEvent NONE = new onNavigationEvent("NONE", 6);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 87;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent[] onnavigationeventArr = {TOP1, TOP2, TOP3, TOP4, TOP5, TOP6, NONE};
            int i5 = i2 + 87;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            EnumEntries<onNavigationEvent> enumEntries;
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 61;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                enumEntries = $ENTRIES;
                int i4 = 82 / 0;
            } else {
                enumEntries = $ENTRIES;
            }
            int i5 = i2 + 99;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            throw null;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = onExtraCallback + 61;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = $VALUES;
            if (i3 != 0) {
                return (onNavigationEvent[]) onnavigationeventArr.clone();
            }
            int i4 = 23 / 0;
            return (onNavigationEvent[]) onnavigationeventArr.clone();
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                int i2 = onWarmupCompleted + 119;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onWarmupCompleted + 57;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 16 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallbackWithResult + 53;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 == 0) {
                int i6 = 18 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class IAuthTabCallbackStubProxy implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackStubProxy(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onNavigationEvent + 47;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            throw null;
        }
    }

    public static final class IAuthTabCallback_Parcel implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallback_Parcel(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = IAuthTabCallback + 125;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i4 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            obj.hashCode();
            throw null;
        }
    }

    public static final class access000 implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onWarmupCompleted;

        public access000(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onNavigationEvent + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onExtraCallback + 77;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    public static final class access100 implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public access100(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 6 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            int i4 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i5 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asBinder implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onWarmupCompleted;

        public asBinder(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i4 = onNavigationEvent + 29;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i6 = IAuthTabCallback + 1;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i7 != 0) {
                int i8 = 29 / 0;
            }
            return getspecialfeatureoptinstatus2;
        }
    }

    public static final class asInterface implements getAdService {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onWarmupCompleted;

        public asInterface(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallbackWithResult + 5;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class getInterfaceDescriptor implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public getInterfaceDescriptor(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult))) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onNavigationEvent + 107;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            if ((r2 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            r0 = 46 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onNavigationEvent) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.onNavigationEvent)) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.uikit.widget.textView.top.TdsTopV1View.onExtraCallback.onWarmupCompleted + 81;
            im.toss.uikit.widget.textView.top.TdsTopV1View.onExtraCallback.onExtraCallbackWithResult = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 36 / 0;
            }
        }
    }

    public static final class onTransact implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onTransact(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onNavigationEvent + 83;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.onExtraCallback))) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onNavigationEvent + 69;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 29 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setUpperType(@NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (this.onWarmupCompleted != onextracallbackwithresult) {
            int i2 = onExtraCallback + 89;
            IAuthTabCallback = i2 % 128;
            Typography7 typography1 = null;
            if (i2 % 2 != 0) {
                readTypedObject();
                typography1.hashCode();
                throw null;
            }
            BaseTextView typedObject = readTypedObject();
            if (typedObject != null) {
                removeView(typedObject);
            }
            this.onWarmupCompleted = onextracallbackwithresult;
            ViewGroup.LayoutParams onextracallbackwithresult2 = new ConstraintLayout.onExtraCallbackWithResult(0, -2);
            ((ConstraintLayout.onExtraCallbackWithResult) onextracallbackwithresult2).ITrustedWebActivityCallbackDefault = R.id.spaceTop;
            ((ConstraintLayout.onExtraCallbackWithResult) onextracallbackwithresult2).receiveFile = R.id.spaceLeft;
            ((ConstraintLayout.onExtraCallbackWithResult) onextracallbackwithresult2).IPostMessageService = R.id.spaceRight;
            switch (IAuthTabCallback.onNavigationEvent[onextracallbackwithresult.ordinal()]) {
                case 1:
                    typography1 = new Typography1(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    typography1.onNavigationEvent(response.Bold);
                    Context context = typography1.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    Configuration configuration = context.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration, "");
                    typography1.setTextColor(new getUrlokhttp(new asBinder(configuration)).onUnminimized());
                    break;
                case 2:
                    typography1 = new Typography2(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    typography1.onNavigationEvent(response.Bold);
                    Context context2 = typography1.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    Configuration configuration2 = context2.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration2, "");
                    typography1.setTextColor(new getUrlokhttp(new getInterfaceDescriptor(configuration2)).onUnminimized());
                    break;
                case 3:
                    typography1 = new Typography3(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    typography1.onNavigationEvent(response.Bold);
                    Context context3 = typography1.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    Configuration configuration3 = context3.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration3, "");
                    typography1.setTextColor(new getUrlokhttp(new IAuthTabCallback_Parcel(configuration3)).onUnminimized());
                    break;
                case 4:
                    typography1 = new Typography4(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    typography1.onNavigationEvent(response.Bold);
                    Context context4 = typography1.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    Configuration configuration4 = context4.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration4, "");
                    typography1.setTextColor(new getUrlokhttp(new access100(configuration4)).onUnminimized());
                    break;
                case 5:
                    typography1 = new Typography5(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    typography1.onNavigationEvent(response.Regular);
                    Context context5 = typography1.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "");
                    Configuration configuration5 = context5.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration5, "");
                    typography1.setTextColor(new getUrlokhttp(new IAuthTabCallbackStubProxy(configuration5)).ICustomTabsCallbackStubProxy());
                    break;
                case 6:
                    typography1 = new Typography7(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    typography1.onNavigationEvent(response.Regular);
                    Context context6 = typography1.getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "");
                    Configuration configuration6 = context6.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration6, "");
                    typography1.setTextColor(new getUrlokhttp(new access000(configuration6)).ICustomTabsCallbackStubProxy());
                    break;
            }
            if (typography1 != null) {
                typography1.setId(R.id.top_upper_text);
                typography1.setLayoutParams(onextracallbackwithresult2);
                addView(typography1);
            }
        }
        int i3 = IAuthTabCallback + 89;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setUpperText(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 93 / 0;
            if (charSequence != null) {
                if (charSequence.length() != 0) {
                    BaseTextView typedObject = readTypedObject();
                    if (typedObject != null) {
                        int i4 = onExtraCallback + 23;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        typedObject.setText(charSequence);
                    }
                    BaseTextView typedObject2 = readTypedObject();
                    if (typedObject2 != null) {
                        int i6 = IAuthTabCallback + 103;
                        onExtraCallback = i6 % 128;
                        if (i6 % 2 == 0) {
                            typedObject2.setVisibility(1);
                            return;
                        } else {
                            typedObject2.setVisibility(0);
                            return;
                        }
                    }
                    return;
                }
            }
        } else if (charSequence != null) {
        }
        BaseTextView typedObject3 = readTypedObject();
        if (typedObject3 != null) {
            typedObject3.setVisibility(8);
            int i7 = IAuthTabCallback + 25;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public final void setUpperTextColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            int i4 = 41 / 0;
            if (colorStateList == null) {
                return;
            }
        } else if (colorStateList == null) {
            return;
        }
        int i5 = i3 + 93;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            readTypedObject();
            throw null;
        }
        BaseTextView typedObject = readTypedObject();
        if (typedObject != null) {
            typedObject.setTextColor(colorStateList);
        }
    }

    public final void setUpperTextColor(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 79;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            readTypedObject();
            obj.hashCode();
            throw null;
        }
        BaseTextView typedObject = readTypedObject();
        if (typedObject != null) {
            typedObject.setTextColor(i);
        }
        int i4 = onExtraCallback + 71;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setLowerType(@NotNull onNavigationEvent onnavigationevent) {
        TextView typography1;
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        if (this.onExtraCallbackWithResult != onnavigationevent) {
            int i4 = IAuthTabCallback + 81;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            BaseTextView baseTextViewAsInterface = asInterface();
            if (baseTextViewAsInterface != null) {
                int i6 = onExtraCallback + 67;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    removeView(baseTextViewAsInterface);
                    int i7 = 67 / 0;
                } else {
                    removeView(baseTextViewAsInterface);
                }
            }
            this.onExtraCallbackWithResult = onnavigationevent;
            ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = new ConstraintLayout.onExtraCallbackWithResult(0, -2);
            onextracallbackwithresult.ITrustedWebActivityCallbackDefault = R.id.top_upper_text;
            onextracallbackwithresult.receiveFile = R.id.spaceLeft;
            onextracallbackwithresult.IPostMessageService = R.id.spaceRight;
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).topMargin = varyMatches.onNavigationEvent(Float.valueOf(8.0f), displayMetrics);
            switch (IAuthTabCallback.onExtraCallbackWithResult[onnavigationevent.ordinal()]) {
                case 1:
                    typography1 = new Typography1(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    typography1.onNavigationEvent(response.Bold);
                    Context context = typography1.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    Configuration configuration = context.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration, "");
                    typography1.setTextColor(new getUrlokhttp(new onExtraCallback(configuration)).onUnminimized());
                    break;
                case 2:
                    typography1 = new Typography2(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    typography1.onNavigationEvent(response.Bold);
                    Context context2 = typography1.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    Configuration configuration2 = context2.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration2, "");
                    typography1.setTextColor(new getUrlokhttp(new onWarmupCompleted(configuration2)).onUnminimized());
                    break;
                case 3:
                    typography1 = new Typography3(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    typography1.onNavigationEvent(response.Bold);
                    Context context3 = typography1.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    Configuration configuration3 = context3.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration3, "");
                    typography1.setTextColor(new getUrlokhttp(new asInterface(configuration3)).onUnminimized());
                    break;
                case 4:
                    typography1 = new Typography4(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    typography1.onNavigationEvent(response.Bold);
                    Context context4 = typography1.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    Configuration configuration4 = context4.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration4, "");
                    typography1.setTextColor(new getUrlokhttp(new onTransact(configuration4)).onUnminimized());
                    break;
                case 5:
                    typography1 = new Typography5(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    typography1.onNavigationEvent(response.Regular);
                    Context context5 = typography1.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "");
                    Configuration configuration5 = context5.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration5, "");
                    typography1.setTextColor(new getUrlokhttp(new IAuthTabCallbackStub(configuration5)).ICustomTabsCallbackStubProxy());
                    break;
                case 6:
                    typography1 = new Typography7(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    typography1.onNavigationEvent(response.Regular);
                    Context context6 = typography1.getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "");
                    Configuration configuration6 = context6.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration6, "");
                    typography1.setTextColor(new getUrlokhttp(new IAuthTabCallbackDefault(configuration6)).ICustomTabsCallbackStubProxy());
                    break;
                default:
                    typography1 = null;
                    break;
            }
            if (typography1 != null) {
                typography1.setId(R.id.top_lower_text);
                typography1.setLayoutParams(onextracallbackwithresult);
                addView(typography1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r6.length() != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r1 = im.toss.uikit.widget.textView.top.TdsTopV1View.IAuthTabCallback + 65;
        im.toss.uikit.widget.textView.top.TdsTopV1View.onExtraCallback = r1 % 128;
        r1 = r1 % 2;
        r1 = asInterface();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        r3 = im.toss.uikit.widget.textView.top.TdsTopV1View.IAuthTabCallback + 103;
        im.toss.uikit.widget.textView.top.TdsTopV1View.onExtraCallback = r3 % 128;
        r3 = r3 % 2;
        r1.setText(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        r6 = asInterface();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r6 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        r6.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r6.length() != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setLowerText(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        if (charSequence != null) {
            int i2 = onExtraCallback + 55;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 67 / 0;
            }
        }
        BaseTextView baseTextViewAsInterface = asInterface();
        if (baseTextViewAsInterface != null) {
            baseTextViewAsInterface.setVisibility(8);
        }
    }

    public final void setLowerTextColor(@Nullable ColorStateList colorStateList) {
        BaseTextView baseTextViewAsInterface;
        int i = 2 % 2;
        if (colorStateList != null) {
            int i2 = IAuthTabCallback + 75;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                baseTextViewAsInterface = asInterface();
                int i3 = 15 / 0;
                if (baseTextViewAsInterface == null) {
                    return;
                }
            } else {
                baseTextViewAsInterface = asInterface();
                if (baseTextViewAsInterface == null) {
                    return;
                }
            }
            baseTextViewAsInterface.setTextColor(colorStateList);
            int i4 = onExtraCallback + 11;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void setLowerTextColor(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        BaseTextView baseTextViewAsInterface = asInterface();
        if (baseTextViewAsInterface != null) {
            int i5 = IAuthTabCallback + 123;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            baseTextViewAsInterface.setTextColor(i);
            if (i6 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BaseTextView readTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextViewFindViewById = findViewById(R.id.top_upper_text);
        int i4 = onExtraCallback + 67;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return baseTextViewFindViewById;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BaseTextView asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            findViewById(R.id.top_lower_text);
            obj.hashCode();
            throw null;
        }
        BaseTextView baseTextViewFindViewById = findViewById(R.id.top_lower_text);
        int i3 = IAuthTabCallback + 65;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return baseTextViewFindViewById;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Space extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            View viewFindViewById = findViewById(R.id.spaceTop);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            return (Space) viewFindViewById;
        }
        View viewFindViewById2 = findViewById(R.id.spaceTop);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        int i3 = 68 / 0;
        return (Space) viewFindViewById2;
    }

    public void dispatchDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.dispatchDraw(canvas);
        onInstallReferrerServiceDisconnected.onExtraCallbackWithResult(onInstallReferrerServiceDisconnected.onExtraCallback, this, canvas, (SizeF) null, 4, (Object) null);
        int i4 = onExtraCallback + 87;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
