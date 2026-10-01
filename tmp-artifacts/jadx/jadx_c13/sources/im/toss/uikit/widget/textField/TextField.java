package im.toss.uikit.widget.textField;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.foundation.graphics.drawable.RoundDrawable;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.widget.textField.TextField$setLottieIcon$1$;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import o.AFk1sSDK;
import o.Address;
import o.CertificatePinnerBuilder;
import o.ComposableLambdaImplExternalSyntheticLambda2;
import o.ComposableLambdaImplExternalSyntheticLambda9;
import o.ManagedRetainedValuesStoreKtExternalSyntheticLambda0;
import o.VideoEncoderInfoImplExternalSyntheticLambda0;
import o.access15300;
import o.getAdService;
import o.getCurrentBacktraceOrBuilderList;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.matches;
import o.readIntokhttp;
import o.registerCrashCallback;
import o.response;
import o.setHeadersokhttp;
import o.setVisitUrl;
import o.varyMatches;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class TextField extends RelativeLayout {
    private static int ICustomTabsCallback = 1;
    private static int extraCallbackWithResult;
    private Animator IAuthTabCallback;
    private CharSequence IAuthTabCallbackDefault;
    private ValueAnimator IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private onExtraCallback access000;
    private CharSequence access100;
    private final int asBinder;
    private boolean asInterface;
    private int getInterfaceDescriptor;
    private Animator onExtraCallback;
    protected AFk1sSDK onExtraCallbackWithResult;
    private IAuthTabCallback onNavigationEvent;
    private CharSequence onTransact;
    private boolean onWarmupCompleted;
    private onWarmupCompleted readTypedObject;

    public static final /* synthetic */ class IAuthTabCallbackDefault {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[onWarmupCompleted.values().length];
            try {
                iArr[onWarmupCompleted.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onWarmupCompleted.MEDIUM.ordinal()] = 2;
                int i = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onWarmupCompleted.BIG.ordinal()] = 3;
                int i4 = onExtraCallback + 17;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
        }
    }

    public interface onExtraCallback {
        void onNavigationEvent(@NotNull TextField textField);
    }

    public interface onExtraCallbackWithResult {
        void onWarmupCompleted(@NotNull TextField textField, @NotNull String str, @NotNull Number number);
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        ValueAnimator valueAnimator = (ValueAnimator) objArr[0];
        TextField textField = (TextField) objArr[1];
        ValueAnimator valueAnimator2 = (ValueAnimator) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(valueAnimator, textField, valueAnimator2);
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        int i5 = ICustomTabsCallback + 55;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static /* synthetic */ void onExtraCallback(TextField textField, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 91;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(textField, valueAnimator);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        int i5 = ICustomTabsCallback + 71;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallback(TextField textField, View view) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 43;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 96394912, new Object[]{textField, view}, -96394909, iIAuthTabCallback, iIAuthTabCallback3);
        int i4 = extraCallbackWithResult + 89;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = i7 | i4;
        int i10 = (~(i7 | i8)) | (~i9) | (~(i8 | i4));
        int i11 = (~(i5 | i4)) | (~(i7 | i5));
        int i12 = i9 | i8;
        int i13 = i4 + i3 + i + (988256597 * i6) + ((-695401848) * i2);
        int i14 = i13 * i13;
        int i15 = (((-880163897) * i4) - 1270611968) + ((-1462879173) * i3) + (i10 * 291357638) + (291357638 * i11) + ((-291357638) * i12) + ((-1171521536) * i) + (479985664 * i6) + (1063256064 * i2) + (1273561088 * i14);
        int i16 = (i4 * (-1367684995)) + 376186498 + (i3 * (-1367684423)) + (i10 * (-286)) + (i11 * (-286)) + (i12 * 286) + (i * (-1367684709)) + (i6 * 1512018807) + (i2 * 1127043160) + (i14 * (-418185216));
        switch (i15 + (i16 * i16 * 1903099904)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                boolean z = false;
                TextField textField = (TextField) objArr[0];
                String str = (String) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                Function0<Unit> function0 = (Function0) objArr[3];
                int iIntValue = ((Number) objArr[4]).intValue();
                Object obj = objArr[5];
                int i17 = 2 % 2;
                int i18 = extraCallbackWithResult + 55;
                int i19 = i18 % 128;
                ICustomTabsCallback = i19;
                int i20 = i18 % 2;
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadLottieIcon");
                }
                int i21 = i19 + 61;
                extraCallbackWithResult = i21 % 128;
                int i22 = i21 % 2;
                if ((iIntValue & 2) != 0) {
                    int i23 = i19 + 101;
                    extraCallbackWithResult = i23 % 128;
                    int i24 = i23 % 2;
                } else {
                    z = zBooleanValue;
                }
                if ((iIntValue & 4) != 0) {
                    int i25 = i19 + 7;
                    extraCallbackWithResult = i25 % 128;
                    int i26 = i25 % 2;
                    function0 = null;
                }
                textField.onNavigationEvent(str, z, function0);
                return null;
            case 6:
                return asInterface(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TextField textField, int[] iArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 83;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(textField, iArr);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(textField, iArr);
        int i3 = ICustomTabsCallback + 63;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TextField textField, boolean z, Function0 function0, ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 79;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -349402899, new Object[]{textField, Boolean.valueOf(z), function0, composableLambdaImplExternalSyntheticLambda2}, 349402905, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
            throw null;
        }
        onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -349402899, new Object[]{textField, Boolean.valueOf(z), function0, composableLambdaImplExternalSyntheticLambda2}, 349402905, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        int i3 = extraCallbackWithResult + 35;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(TextField textField, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 113;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        IAuthTabCallback(textField, valueAnimator);
        if (i3 == 0) {
            throw null;
        }
        int i4 = extraCallbackWithResult + 43;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        TextField textField = (TextField) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 115;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        textField.writeTypedObject();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallbackWithResult + 79;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(TextField textField) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 45;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        textField.readTypedObject();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback + 115;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(TextField textField) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 15;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        textField.onMessageChannelReady();
        int i4 = extraCallbackWithResult + 1;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(TextField textField, String str, boolean z, Function0 function0) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 45;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        textField.onNavigationEvent(str, z, (Function0<Unit>) function0);
        if (i3 == 0) {
            throw null;
        }
        int i4 = ICustomTabsCallback + 59;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        public static final onWarmupCompleted NORMAL = new onWarmupCompleted("NORMAL", 0, 0);
        public static final onWarmupCompleted MEDIUM = new onWarmupCompleted("MEDIUM", 1, 1);
        public static final onWarmupCompleted BIG = new onWarmupCompleted("BIG", 2, 2);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 3;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = {NORMAL, MEDIUM, BIG};
            int i5 = i2 + 79;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 97;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 != 0) {
                int i4 = 18 / 0;
            }
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i3 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i, int i2) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onNavigationEvent + 123;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        public static final IAuthTabCallback LEFT = new IAuthTabCallback("LEFT", 0, 0);
        public static final IAuthTabCallback RIGHT = new IAuthTabCallback("RIGHT", 1, 1);
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onWarmupCompleted;

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {LEFT, RIGHT};
            int i5 = i3 + 77;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return iAuthTabCallbackArr;
            }
            throw null;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return $ENTRIES;
            }
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = $VALUES;
            if (i3 == 0) {
                return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback(String str, int i, int i2) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onWarmupCompleted + 23;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                    int i3 = onNavigationEvent + 51;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return getspecialfeatureoptinstatus;
                }
                int i5 = onExtraCallbackWithResult + 69;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
                if (i6 != 0) {
                    return getspecialfeatureoptinstatus2;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.IAuthTabCallback);
            throw null;
        }
    }

    public static final class IAuthTabCallbackStubProxy implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackStubProxy(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.uikit.widget.textField.TextField.IAuthTabCallbackStubProxy.onExtraCallback + 75;
            im.toss.uikit.widget.textField.TextField.IAuthTabCallbackStubProxy.onWarmupCompleted = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            if ((r2 % 2) == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            r0 = 78 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.onExtraCallbackWithResult)) != true) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallbackWithResult) != false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 79 / 0;
            }
        }
    }

    public static final class IAuthTabCallback_Parcel implements getAdService {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallback_Parcel(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onExtraCallback + 97;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            int i3 = onWarmupCompleted + 71;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i4 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            throw null;
        }
    }

    public static final class ICustomTabsCallback implements getAdService {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public ICustomTabsCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                int i2 = onExtraCallbackWithResult + 89;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallback + 27;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 83 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class access000 implements getAdService {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public access000(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onExtraCallbackWithResult + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onExtraCallback + 103;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    public static final class asBinder implements getAdService {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public asBinder(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onExtraCallbackWithResult + 55;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class asInterface implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration IAuthTabCallback;

        public asInterface(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                if (readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onExtraCallbackWithResult + 73;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.IAuthTabCallback);
            throw null;
        }
    }

    public static final class extraCallback implements getAdService {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration IAuthTabCallback;

        public extraCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onNavigationEvent + 69;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 == 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onActivityLayout implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onActivityLayout(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onWarmupCompleted + 81;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.IAuthTabCallback);
            throw null;
        }
    }

    public static final class onMessageChannelReady implements getAdService {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onMessageChannelReady(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            if ((r2 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.uikit.widget.textField.TextField.onMessageChannelReady.onExtraCallbackWithResult + 27;
            im.toss.uikit.widget.textField.TextField.onMessageChannelReady.onExtraCallback = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        
            if ((r2 % 2) != 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
        
            r0 = 98 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.IAuthTabCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.IAuthTabCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = im.toss.uikit.widget.textField.TextField.onMessageChannelReady.onExtraCallback + 83;
            im.toss.uikit.widget.textField.TextField.onMessageChannelReady.onExtraCallbackWithResult = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 31 / 0;
            }
        }
    }

    public static final class onMinimized implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onMinimized(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = IAuthTabCallback + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = IAuthTabCallback + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onPostMessage implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onPostMessage(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onExtraCallback + 69;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 69 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onTransact implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onTransact(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = IAuthTabCallback + 35;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onNavigationEvent);
            obj.hashCode();
            throw null;
        }
    }

    public static final class readTypedObject implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public readTypedObject(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onNavigationEvent + 61;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i6 = onNavigationEvent + 25;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class writeTypedObject implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public writeTypedObject(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallback + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        TextField textField = (TextField) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 45;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        AFk1sSDK aFk1sSDK = textField.onExtraCallbackWithResult;
        if (aFk1sSDK != null) {
            return aFk1sSDK;
        }
        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        int i4 = ICustomTabsCallback + 53;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    protected final void onWarmupCompleted(@NotNull AFk1sSDK aFk1sSDK) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 101;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFk1sSDK, "");
            this.onExtraCallbackWithResult = aFk1sSDK;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(aFk1sSDK, "");
        this.onExtraCallbackWithResult = aFk1sSDK;
        int i3 = extraCallbackWithResult + 95;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void setOnClearListener(@Nullable onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 85;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.access000 = onextracallback;
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextField(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.readTypedObject = onWarmupCompleted.NORMAL;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        this.asBinder = varyMatches.onNavigationEvent(Float.valueOf(40.0f), displayMetrics);
        this.onNavigationEvent = IAuthTabCallback.LEFT;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iOnPostMessage = new getUrlokhttp(new ICustomTabsCallback(configuration)).onPostMessage();
        this.IAuthTabCallback_Parcel = iOnPostMessage;
        this.IAuthTabCallbackStubProxy = iOnPostMessage;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        this.getInterfaceDescriptor = new getUrlokhttp(new extraCallback(configuration2)).requestPostMessageChannel().ICustomTabsService_Parcel();
        IAuthTabCallback(this, null, 1, null);
    }

    public static final class onActivityResized implements Animator.AnimatorListener {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ boolean onExtraCallback;
        final /* synthetic */ TextField onWarmupCompleted;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 88 / 0;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onActivityResized(boolean z, TextField textField) {
            this.onExtraCallback = z;
            this.onWarmupCompleted = textField;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!this.onExtraCallback) {
                return;
            }
            ((AFk1sSDK) TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this.onWarmupCompleted}, 906317768, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).asInterface.setVisibility(4);
            int i4 = IAuthTabCallback + 93;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextField(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.readTypedObject = onWarmupCompleted.NORMAL;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        this.asBinder = varyMatches.onNavigationEvent(Float.valueOf(40.0f), displayMetrics);
        this.onNavigationEvent = IAuthTabCallback.LEFT;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iOnPostMessage = new getUrlokhttp(new onActivityLayout(configuration)).onPostMessage();
        this.IAuthTabCallback_Parcel = iOnPostMessage;
        this.IAuthTabCallbackStubProxy = iOnPostMessage;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        this.getInterfaceDescriptor = new getUrlokhttp(new onMinimized(configuration2)).requestPostMessageChannel().ICustomTabsService_Parcel();
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -377106355, new Object[]{this, attributeSet}, 377106357, iIAuthTabCallback, iIAuthTabCallback3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextField(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.readTypedObject = onWarmupCompleted.NORMAL;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        this.asBinder = varyMatches.onNavigationEvent(Float.valueOf(40.0f), displayMetrics);
        this.onNavigationEvent = IAuthTabCallback.LEFT;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iOnPostMessage = new getUrlokhttp(new onPostMessage(configuration)).onPostMessage();
        this.IAuthTabCallback_Parcel = iOnPostMessage;
        this.IAuthTabCallbackStubProxy = iOnPostMessage;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        this.getInterfaceDescriptor = new getUrlokhttp(new onMessageChannelReady(configuration2)).requestPostMessageChannel().ICustomTabsService_Parcel();
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -377106355, new Object[]{this, attributeSet}, 377106357, iIAuthTabCallback, iIAuthTabCallback3);
    }

    static /* synthetic */ void IAuthTabCallback(TextField textField, AttributeSet attributeSet, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult;
        int i4 = i3 + 7;
        ICustomTabsCallback = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initialize");
        }
        if ((i & 1) != 0) {
            int i5 = i3 + 87;
            int i6 = i5 % 128;
            ICustomTabsCallback = i6;
            if (i5 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            int i7 = i6 + 105;
            extraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 5;
            }
            attributeSet = null;
        }
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -377106355, new Object[]{textField, attributeSet}, 377106357, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    public static final class access100 implements TextWatcher {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = onWarmupCompleted + 3;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = onNavigationEvent + 115;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }

        access100() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            TextField.onExtraCallbackWithResult(TextField.this);
            TextField.onNavigationEvent(TextField.this);
            int i4 = onNavigationEvent + 79;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit onWarmupCompleted(TextField textField, int[] iArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 109;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iArr, "");
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Drawable background = ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).access100.getBackground();
        if (background != null) {
            background.setState(iArr);
            int i4 = extraCallbackWithResult + 75;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i6 = extraCallbackWithResult + 29;
        ICustomTabsCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 73 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TextField textField = (TextField) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 65;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        textField.setText((CharSequence) null);
        onExtraCallback onextracallback = textField.access000;
        if (onextracallback != null) {
            int i4 = extraCallbackWithResult + 77;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            onextracallback.onNavigationEvent(textField);
            int i6 = extraCallbackWithResult + 79;
            ICustomTabsCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Resources.NotFoundException {
        boolean z;
        int i;
        CharSequence charSequence;
        Drawable drawable;
        CharSequence string;
        CharSequence string2;
        int i2;
        CharSequence string3;
        CharSequence string4;
        CharSequence string5;
        Drawable drawableOnExtraCallback;
        int dimensionPixelSize;
        int i3 = 0;
        final TextField textField = (TextField) objArr[0];
        boolean z2 = true;
        AttributeSet attributeSet = (AttributeSet) objArr[1];
        int i4 = 2 % 2;
        AFk1sSDK aFk1sSDKOnWarmupCompleted = AFk1sSDK.onWarmupCompleted(LayoutInflater.from(textField.getContext()), textField, true);
        Intrinsics.checkNotNullExpressionValue(aFk1sSDKOnWarmupCompleted, "");
        textField.onWarmupCompleted(aFk1sSDKOnWarmupCompleted);
        registerCrashCallback registercrashcallback = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult;
        StateListAnimator stateListAnimator = new StateListAnimator();
        textField.IAuthTabCallback(stateListAnimator, -16842910);
        textField.IAuthTabCallback(stateListAnimator, R.attr.state_selected);
        textField.IAuthTabCallback(stateListAnimator, -16842908);
        textField.IAuthTabCallback(stateListAnimator, R.attr.state_focused);
        registercrashcallback.setStateListAnimator(stateListAnimator);
        ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult.addTextChangedListener(textField.new access100());
        ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult.setOnDrawableStateChangedListener(new Function1() { // from class: im.toss.uikit.widget.textField.TextField$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i5 = 2 % 2;
                int i6 = onNavigationEvent + 77;
                onExtraCallback = i6 % 128;
                Object obj2 = null;
                if (i6 % 2 != 0) {
                    TextField.onExtraCallbackWithResult(this.f$0, (int[]) obj);
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = TextField.onExtraCallbackWithResult(this.f$0, (int[]) obj);
                int i7 = onNavigationEvent + 81;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                obj2.hashCode();
                throw null;
            }
        });
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Context context = textField.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iOnActivityResized = new getUrlokhttp(new asBinder(configuration)).onActivityResized();
        Context context2 = textField.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onExtraCallbackWithResult.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{iOnActivityResized, new getUrlokhttp(new onTransact(configuration2)).onRelationshipValidationResult()}));
        ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).IAuthTabCallback.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.textField.TextField$$ExternalSyntheticLambda4
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = 2 % 2;
                int i6 = onNavigationEvent + 99;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                TextField.onExtraCallback(this.f$0, view);
                int i8 = onExtraCallback + 31;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            }
        });
        onWarmupCompleted onwarmupcompleted = onWarmupCompleted.NORMAL;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = textField.getContext().getTheme().obtainStyledAttributes(attributeSet, im.toss.uikit.R.styleable.TextField, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            TypedValue typedValue = new TypedValue();
            TypedValue typedValue2 = new TypedValue();
            TypedValue typedValue3 = new TypedValue();
            TypedValue typedValue4 = new TypedValue();
            TypedValue typedValue5 = new TypedValue();
            TypedValue typedValue6 = new TypedValue();
            onWarmupCompleted onwarmupcompleted2 = onWarmupCompleted.values()[typedArrayObtainStyledAttributes.getInt(im.toss.uikit.R.styleable.TextField_textFieldType, 0)];
            typedArrayObtainStyledAttributes.getValue(im.toss.uikit.R.styleable.TextField_textFieldLabel, typedValue);
            if (typedValue.type == 1) {
                int i5 = extraCallbackWithResult + 79;
                ICustomTabsCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    textField.getResources().getString(typedValue.resourceId);
                    throw null;
                }
                string2 = textField.getResources().getString(typedValue.resourceId);
            } else {
                string2 = typedValue.string;
            }
            boolean z3 = typedArrayObtainStyledAttributes.getBoolean(im.toss.uikit.R.styleable.TextField_textFieldUseMessage, true);
            typedArrayObtainStyledAttributes.getValue(im.toss.uikit.R.styleable.TextField_textFieldMessage, typedValue2);
            if (typedValue2.type == 1) {
                int i6 = ICustomTabsCallback + 7;
                extraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                string = textField.getResources().getString(typedValue2.resourceId);
            } else {
                string = typedValue2.string;
            }
            typedArrayObtainStyledAttributes.getValue(im.toss.uikit.R.styleable.TextField_textFieldHint, typedValue3);
            CharSequence string6 = typedValue3.type == 1 ? textField.getResources().getString(typedValue3.resourceId) : typedValue3.string;
            typedArrayObtainStyledAttributes.getValue(im.toss.uikit.R.styleable.TextField_textFieldText, typedValue4);
            if (typedValue4.type == 1) {
                int i8 = extraCallbackWithResult + 47;
                ICustomTabsCallback = i8 % 128;
                int i9 = i8 % 2;
                string3 = textField.getResources().getString(typedValue4.resourceId);
            } else {
                string3 = typedValue4.string;
            }
            typedArrayObtainStyledAttributes.getValue(im.toss.uikit.R.styleable.TextField_textFieldSuffix, typedValue6);
            if (typedValue6.type == 1) {
                string4 = textField.getResources().getString(typedValue6.resourceId);
                int i10 = ICustomTabsCallback + 59;
                extraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
            } else {
                string4 = typedValue6.string;
            }
            typedArrayObtainStyledAttributes.getValue(im.toss.uikit.R.styleable.TextField_textFieldPrefix, typedValue5);
            string5 = typedValue5.type == 1 ? textField.getResources().getString(typedValue5.resourceId) : typedValue5.string;
            try {
                drawableOnExtraCallback = ResourcesCompat.onExtraCallback(textField.getResources(), typedArrayObtainStyledAttributes.getResourceId(im.toss.uikit.R.styleable.TextField_textFieldIcon, 0), (Resources.Theme) null);
            } catch (Resources.NotFoundException | NullPointerException unused) {
                drawableOnExtraCallback = null;
            }
            int color = typedArrayObtainStyledAttributes.getColor(im.toss.uikit.R.styleable.TextField_textFieldIconColor, 0);
            boolean z4 = typedArrayObtainStyledAttributes.getBoolean(im.toss.uikit.R.styleable.TextField_textFieldClearable, false);
            int i12 = typedArrayObtainStyledAttributes.getInt(im.toss.uikit.R.styleable.TextField_textFieldInputType, 1);
            int i13 = typedArrayObtainStyledAttributes.getInt(im.toss.uikit.R.styleable.TextField_textFieldMaxLength, -1);
            textField.onNavigationEvent = IAuthTabCallback.values()[typedArrayObtainStyledAttributes.getInt(im.toss.uikit.R.styleable.TextField_textFieldChildAlign, 0)];
            textField.onWarmupCompleted = typedArrayObtainStyledAttributes.getBoolean(im.toss.uikit.R.styleable.TextField_textFieldChildAdjustToEditText, false);
            ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult.setInputType(i12);
            if (i13 >= 0) {
                ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i13)});
            }
            int i14 = typedArrayObtainStyledAttributes.getInt(im.toss.uikit.R.styleable.TextField_textFieldGravity, 8388627);
            int i15 = im.toss.uikit.R.styleable.TextField_textFieldMaxHeight;
            if (typedArrayObtainStyledAttributes.hasValue(i15)) {
                int i16 = extraCallbackWithResult + 125;
                ICustomTabsCallback = i16 % 128;
                dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i15, i16 % 2 == 0 ? 116 : -2);
            } else {
                dimensionPixelSize = IntCompanionObject.MAX_VALUE;
            }
            int i17 = im.toss.uikit.R.styleable.TextField_android_enabled;
            if (typedArrayObtainStyledAttributes.hasValue(i17)) {
                int i18 = extraCallbackWithResult + 21;
                ICustomTabsCallback = i18 % 128;
                int i19 = i18 % 2;
                textField.setEnabled(typedArrayObtainStyledAttributes.getBoolean(i17, true));
            }
            typedArrayObtainStyledAttributes.recycle();
            charSequence = string6;
            onwarmupcompleted = onwarmupcompleted2;
            z2 = z3;
            z = z4;
            i = i14;
            i2 = dimensionPixelSize;
            drawable = drawableOnExtraCallback;
            i3 = color;
        } else {
            z = false;
            i = 8388627;
            charSequence = null;
            drawable = null;
            string = null;
            string2 = null;
            i2 = IntCompanionObject.MAX_VALUE;
            string3 = null;
            string4 = null;
            string5 = null;
        }
        textField.setTextFieldType(onwarmupcompleted);
        textField.setTextFieldMaxHeight(i2);
        textField.setLabel(string2);
        textField.setUseMessage(z2);
        textField.setMessage(string);
        textField.setHint(charSequence);
        textField.setText(string3);
        textField.setPrefix(string5);
        textField.setSuffix(string4);
        textField.setIcon(drawable, i3);
        textField.setClearable(z);
        textField.onWarmupCompleted(i);
        return null;
    }

    public final void setFont(@NotNull response responseVar) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 9;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(responseVar, "");
        IAuthTabCallback().setFont(responseVar);
        int i4 = ICustomTabsCallback + 69;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setFont(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 123;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback().setFont(i);
        int i5 = extraCallbackWithResult + 119;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void IAuthTabCallback(StateListAnimator stateListAnimator, int i) {
        int i2 = 2 % 2;
        int[] iArr = {i};
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addListener(new onNavigationEvent(i));
        Unit unit = Unit.INSTANCE;
        stateListAnimator.addState(iArr, valueAnimatorOfFloat);
        int i3 = ICustomTabsCallback + 57;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 33;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            super.setEnabled(z);
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onExtraCallbackWithResult.setEnabled(z);
            return;
        }
        super.setEnabled(z);
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).onExtraCallbackWithResult.setEnabled(z);
        throw null;
    }

    private final void writeTypedObject() {
        int iICustomTabsCallbackStubProxy;
        int i;
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 55;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult.isEnabled();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        boolean zIsSelected = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult.isSelected();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        boolean zIsFocused = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback3, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult.isFocused();
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Typography7 typography7 = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).asInterface;
        if (zIsSelected) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            iICustomTabsCallbackStubProxy = new getUrlokhttp(new access000(configuration)).requestPostMessageChannel().ICustomTabsService_Parcel();
        } else if (zIsFocused) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iICustomTabsCallbackStubProxy = ((Integer) setHeadersokhttp.onExtraCallbackWithResult(494643487, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new IAuthTabCallbackStubProxy(configuration2)).requestPostMessageChannel()}, matches.onExtraCallback(), -494643478, matches.onExtraCallback())).intValue();
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration3 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            iICustomTabsCallbackStubProxy = new getUrlokhttp(new IAuthTabCallback_Parcel(configuration3)).ICustomTabsCallbackStubProxy();
        }
        typography7.setTextColor(iICustomTabsCallbackStubProxy);
        int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Typography7 typography72 = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).IAuthTabCallbackDefault;
        if (!(!zIsSelected)) {
            i = this.getInterfaceDescriptor;
        } else if (!zIsFocused) {
            int i5 = this.IAuthTabCallback_Parcel;
            int i6 = extraCallbackWithResult + 11;
            ICustomTabsCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 2;
            }
            i = i5;
        } else {
            int i8 = ICustomTabsCallback + 67;
            extraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                i = this.IAuthTabCallbackStubProxy;
                int i9 = 30 / 0;
            } else {
                i = this.IAuthTabCallbackStubProxy;
            }
        }
        typography72.setTextColor(i);
        readTypedObject();
    }

    public final void setMessageColor(int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 119;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallback_Parcel = i;
        writeTypedObject();
        int i5 = ICustomTabsCallback + 13;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
    }

    public final void setMessageFocusedColor(int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 31;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackStubProxy = i;
        writeTypedObject();
        int i5 = extraCallbackWithResult + 69;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setMessageErrorColor(int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 9;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            this.getInterfaceDescriptor = i;
            writeTypedObject();
            int i4 = 59 / 0;
        } else {
            this.getInterfaceDescriptor = i;
            writeTypedObject();
        }
        int i5 = ICustomTabsCallback + 57;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
    }

    public final BaseEditText IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 17;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        if (i3 != 0) {
            Intrinsics.checkNotNullExpressionValue(((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, iIAuthTabCallback4, -906317760, objArr, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onExtraCallbackWithResult, "");
            throw null;
        }
        BaseEditText baseEditText = ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, iIAuthTabCallback4, -906317760, objArr, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(baseEditText, "");
        int i4 = ICustomTabsCallback + 49;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return baseEditText;
    }

    public final Typography5 access000() {
        Typography5 typography5;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 23;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        if (i3 != 0) {
            typography5 = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, objArr, 906317768, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).access000;
            Intrinsics.checkNotNullExpressionValue(typography5, "");
            int i4 = 45 / 0;
        } else {
            typography5 = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, objArr, 906317768, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).access000;
            Intrinsics.checkNotNullExpressionValue(typography5, "");
        }
        int i5 = ICustomTabsCallback + 95;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return typography5;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TextField textField = (TextField) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 65;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Typography5 typography5 = ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).asBinder;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        int i4 = ICustomTabsCallback + 37;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return typography5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        if (i3 != 0) {
            return ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, iIAuthTabCallback4, -906317760, objArr, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onExtraCallbackWithResult.length();
        }
        int i4 = 68 / 0;
        return ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, iIAuthTabCallback4, -906317760, objArr, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onExtraCallbackWithResult.length();
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Editable text;
        TextField textField = (TextField) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 31;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {textField};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        if (i3 != 0) {
            text = ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, iIAuthTabCallback4, -906317760, objArr2, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onExtraCallbackWithResult.getText();
            Intrinsics.checkNotNull(text);
            int i4 = 98 / 0;
        } else {
            text = ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, iIAuthTabCallback4, -906317760, objArr2, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onExtraCallbackWithResult.getText();
            Intrinsics.checkNotNull(text);
        }
        int i5 = ICustomTabsCallback + 75;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return text;
        }
        throw null;
    }

    protected final TdsImageView onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 97;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        TdsImageView tdsImageView = ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        int i4 = ICustomTabsCallback + 107;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return tdsImageView;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TextField textField = (TextField) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 25;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            LottieAnimationView lottieAnimationView = ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onTransact;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
            return lottieAnimationView;
        }
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).onTransact, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final TdsImageView onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 11;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        if (i3 != 0) {
            Intrinsics.checkNotNullExpressionValue(((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, objArr, 906317768, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).IAuthTabCallback, "");
            throw null;
        }
        TdsImageView tdsImageView = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, objArr, 906317768, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        int i4 = extraCallbackWithResult + 57;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return tdsImageView;
    }

    private final Drawable IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        float fOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(14.0f), displayMetrics);
        if (!z) {
            RoundDrawable roundDrawable = new RoundDrawable(ResourcesCompat.onExtraCallbackWithResult(getResources(), im.toss.uikit.R.color.text_field_normal_disabled_bg, getContext().getTheme()), fOnNavigationEvent, 0, false, 12, (DefaultConstructorMarker) null);
            int i2 = ICustomTabsCallback + 49;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return roundDrawable;
            }
            throw null;
        }
        ColorDrawable colorDrawable = new ColorDrawable(0);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        Drawable roundDrawable2 = new RoundDrawable(VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(new getUrlokhttp(new IAuthTabCallbackStub(configuration)).requestPostMessageChannel().IAuthTabCallbackDefault(), 12), fOnNavigationEvent, 0, false, 12, (DefaultConstructorMarker) null);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        Drawable roundDrawable3 = new RoundDrawable(VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(new getUrlokhttp(new asInterface(configuration2)).requestPostMessageChannel().writeTypedList(), 12), fOnNavigationEvent, 0, false, 12, (DefaultConstructorMarker) null);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_focused}, roundDrawable2);
        stateListDrawable.addState(new int[]{R.attr.state_selected}, roundDrawable3);
        stateListDrawable.addState(new int[0], colorDrawable);
        int i3 = extraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return stateListDrawable;
    }

    public final void setText(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 107;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onExtraCallbackWithResult.setText(charSequence);
            int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).onExtraCallbackWithResult.setSelection(IAuthTabCallbackStub());
            int i3 = 75 / 0;
            return;
        }
        int iIAuthTabCallback7 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback8 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback9 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback8, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback7, iIAuthTabCallback9)).onExtraCallbackWithResult.setText(charSequence);
        int iIAuthTabCallback10 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback11 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback12 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback11, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback10, iIAuthTabCallback12)).onExtraCallbackWithResult.setSelection(IAuthTabCallbackStub());
    }

    public final void setText(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 7;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            setText(getResources().getString(i));
            int i4 = 23 / 0;
        } else {
            setText(getResources().getString(i));
        }
        int i5 = extraCallbackWithResult + 37;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0070 A[PHI: r5
      0x0070: PHI (r5v4 java.lang.CharSequence) = (r5v3 java.lang.CharSequence), (r5v8 java.lang.CharSequence) binds: [B:12:0x007a, B:7:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setLabel(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        this.IAuthTabCallbackDefault = charSequence;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).asInterface.setText(this.IAuthTabCallbackDefault);
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        registerCrashCallback registercrashcallback = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult;
        CertificatePinnerBuilder.onWarmupCompleted onwarmupcompleted = CertificatePinnerBuilder.Companion;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        CharSequence charSequence2 = this.onTransact;
        CharSequence charSequence3 = null;
        if (charSequence2 == null) {
            charSequence2 = this.IAuthTabCallbackDefault;
            if (charSequence2 != null && extraCallback()) {
                charSequence3 = charSequence2;
                int i2 = ICustomTabsCallback + 115;
                extraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
            }
        } else {
            if (charSequence2.length() <= 0) {
                int i4 = ICustomTabsCallback + 3;
                extraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                charSequence2 = null;
            }
            if (charSequence2 != null) {
            }
        }
        registercrashcallback.setHint(onwarmupcompleted.onNavigationEvent(context, charSequence3));
        onMessageChannelReady();
        onPostMessage();
    }

    public final void setLabel(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 35;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        setLabel(getResources().getString(i));
        int i5 = ICustomTabsCallback + 11;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static final void onNavigationEvent(ValueAnimator valueAnimator, TextField textField, ValueAnimator valueAnimator2) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 41;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator2, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Typography7 typography7 = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).asInterface;
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        typography7.setTranslationY(((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback3, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, iIAuthTabCallback2, iIAuthTabCallback4)).asInterface.getMeasuredHeight() * fFloatValue);
        int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).asInterface.setAlpha(1.0f - fFloatValue);
        int i4 = extraCallbackWithResult + 95;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onMessageChannelReady() {
        Object animatedValue;
        CharSequence charSequence;
        boolean z;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 111;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ValueAnimator valueAnimator = this.IAuthTabCallbackStub;
        if (valueAnimator != null) {
            animatedValue = valueAnimator.getAnimatedValue();
            int i3 = ICustomTabsCallback + 57;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        } else {
            animatedValue = null;
        }
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        ValueAnimator valueAnimator2 = this.IAuthTabCallbackStub;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        CharSequence charSequence2 = this.IAuthTabCallbackDefault;
        if (charSequence2 != null) {
            int i5 = ICustomTabsCallback + 31;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                charSequence2.length();
                throw null;
            }
            if (charSequence2.length() != 0) {
                ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).asInterface.setVisibility(0);
                ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).asInterface.setText(this.IAuthTabCallbackDefault);
                float f2 = 0.0f;
                if (!extraCallback() || ((charSequence = this.onTransact) != null && charSequence.length() != 0)) {
                    ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).asInterface.setTranslationY(0.0f);
                    ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).asInterface.setAlpha(1.0f);
                    return;
                }
                Editable text = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult.getText();
                if (text == null || text.length() == 0) {
                    z = true;
                } else {
                    int i6 = extraCallbackWithResult + 51;
                    ICustomTabsCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        z = false;
                    }
                }
                float fFloatValue = f != null ? f.floatValue() : z ? 0.0f : 1.0f;
                if (z) {
                    f2 = 1.0f;
                } else {
                    int i7 = ICustomTabsCallback + 65;
                    extraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                }
                final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, f2);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.textField.TextField$$ExternalSyntheticLambda5
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int i9 = 2 % 2;
                        int i10 = onNavigationEvent + 91;
                        onExtraCallbackWithResult = i10 % 128;
                        if (i10 % 2 == 0) {
                            Object[] objArr = {valueAnimatorOfFloat, this, valueAnimator3};
                            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                            TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -669585564, objArr, 669585571, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        Object[] objArr2 = {valueAnimatorOfFloat, this, valueAnimator3};
                        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                        TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -669585564, objArr2, 669585571, iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                        int i11 = onNavigationEvent + 65;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                    }
                });
                Intrinsics.checkNotNull(valueAnimatorOfFloat);
                valueAnimatorOfFloat.addListener(new onActivityResized(z, this));
                valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.asBinder());
                valueAnimatorOfFloat.setDuration(150L);
                valueAnimatorOfFloat.start();
                this.IAuthTabCallbackStub = valueAnimatorOfFloat;
                return;
            }
        }
        ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).asInterface.setVisibility(8);
    }

    private final void onPostMessage() {
        int i = 2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        TdsRoundLayout tdsRoundLayout = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallback;
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Typography7 typography7 = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).asInterface;
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        tdsRoundLayout.setContentDescription(typography7 + ", " + ((Object) ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback3, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult.getHint()));
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        TdsImageView tdsImageView = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).IAuthTabCallback;
        int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        tdsImageView.setContentDescription(((Object) ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).asInterface.getText()) + " 삭제");
        int i2 = extraCallbackWithResult + 39;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void setUseMessage(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 95;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (!z) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).IAuthTabCallbackDefault.setVisibility(8);
            return;
        }
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).IAuthTabCallbackDefault.setVisibility(0);
        int i4 = extraCallbackWithResult + 9;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setMessage(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).IAuthTabCallbackDefault.setText(charSequence);
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        this.access100 = ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).IAuthTabCallbackDefault.getText();
        onActivityResized();
        int iIAuthTabCallback7 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback8 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback9 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback8, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback7, iIAuthTabCallback9)).onExtraCallbackWithResult.setSelected(false);
        int i4 = extraCallbackWithResult + 7;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setMessage(int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 21;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        setMessage(getResources().getString(i));
        int i5 = ICustomTabsCallback + 19;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void setError(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        if (!TextUtils.isEmpty(charSequence)) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).IAuthTabCallbackDefault.setText(charSequence);
            int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).onExtraCallbackWithResult.setSelected(true);
        } else {
            int i2 = ICustomTabsCallback + 17;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            setMessage(this.access100);
        }
        onActivityResized();
        int i4 = ICustomTabsCallback + 107;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setError(int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 95;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            setError(getResources().getString(i));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setError(getResources().getString(i));
        int i4 = ICustomTabsCallback + 91;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
    }

    private final void onActivityResized() {
        Typography7 typography7;
        int i;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 75;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        if (((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).IAuthTabCallbackDefault.getVisibility() == 8) {
            return;
        }
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        if (((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).IAuthTabCallbackDefault.length() == 0) {
            int i5 = extraCallbackWithResult + 87;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int iIAuthTabCallback7 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                int iIAuthTabCallback8 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                int iIAuthTabCallback9 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                typography7 = ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback8, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback7, iIAuthTabCallback9)).IAuthTabCallbackDefault;
                i = 3;
            } else {
                int iIAuthTabCallback10 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                int iIAuthTabCallback11 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                int iIAuthTabCallback12 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                typography7 = ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback11, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback10, iIAuthTabCallback12)).IAuthTabCallbackDefault;
                i = 4;
            }
            typography7.setVisibility(i);
            return;
        }
        int iIAuthTabCallback13 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback14 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback15 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback14, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback13, iIAuthTabCallback15)).IAuthTabCallbackDefault.setVisibility(0);
    }

    public final void setPrefix(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 65;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).asBinder.setText(charSequence);
            onMinimized();
            int i3 = 70 / 0;
        } else {
            int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).asBinder.setText(charSequence);
            onMinimized();
        }
        int i4 = extraCallbackWithResult + 7;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
    }

    private final void onMinimized() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 89;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        if (((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).asBinder.length() == 0) {
            int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).asBinder.setVisibility(8);
            return;
        }
        int iIAuthTabCallback7 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback8 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback9 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback8, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback7, iIAuthTabCallback9)).asBinder.setVisibility(0);
        int i4 = extraCallbackWithResult + 19;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setSuffix(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).access000.setText(charSequence);
        ICustomTabsCallbackStubProxy();
        int i4 = ICustomTabsCallback + 109;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSuffix(int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 21;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        setSuffix(getResources().getString(i));
        int i5 = ICustomTabsCallback + 123;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 17;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            if (((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).access000.length() == 0) {
                int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).access000.setVisibility(8);
                return;
            }
            int iIAuthTabCallback7 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback8 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback9 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback8, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback7, iIAuthTabCallback9)).access000.setVisibility(0);
            int i3 = ICustomTabsCallback + 45;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int iIAuthTabCallback10 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback11 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback12 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback11, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback10, iIAuthTabCallback12)).access000.length();
        throw null;
    }

    public static /* synthetic */ void setIcon$default(TextField textField, Drawable drawable, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIcon");
        }
        if ((i2 & 2) != 0) {
            int i4 = extraCallbackWithResult;
            int i5 = i4 + 31;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 27;
            ICustomTabsCallback = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
        }
        textField.setIcon(drawable, i);
    }

    public final void setIcon(@Nullable Drawable drawable, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 111;
        extraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onNavigationEvent.setImageDrawable(drawable);
            if (i == 0) {
                int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).onNavigationEvent.setColorFilter(null);
            } else {
                int iIAuthTabCallback7 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                int iIAuthTabCallback8 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                int iIAuthTabCallback9 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback8, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback7, iIAuthTabCallback9)).onNavigationEvent.setColorFilter(i);
            }
            onActivityLayout();
            int i4 = extraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int iIAuthTabCallback10 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback11 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback12 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback11, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback10, iIAuthTabCallback12)).onNavigationEvent.setImageDrawable(drawable);
        obj.hashCode();
        throw null;
    }

    public final void setIcon(@NotNull String str) {
        TdsImageView tdsImageView;
        Function1 function1;
        Function1 function12;
        int i;
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 111;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            tdsImageView = ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            function1 = null;
            function12 = null;
            i = 53;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            tdsImageView = ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            function1 = null;
            function12 = null;
            i = 6;
        }
        TdsImageView.setImage$default(tdsImageView, str, function1, function12, i, (Object) null);
        onActivityLayout();
    }

    public static /* synthetic */ void setIcon$default(TextField textField, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = extraCallbackWithResult + 65;
        int i6 = i5 % 128;
        ICustomTabsCallback = i6;
        if (i5 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIcon");
        }
        if ((i3 & 2) != 0) {
            int i7 = i6 + 73;
            extraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            i2 = 0;
        }
        textField.setIcon(i, i2);
    }

    public final void setIcon(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = extraCallbackWithResult + 41;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        setIcon(ResourcesCompat.onExtraCallback(getResources(), i, (Resources.Theme) null), i2);
        int i6 = extraCallbackWithResult + 59;
        ICustomTabsCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void setIconSize(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = ICustomTabsCallback + 57;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        TdsImageView tdsImageViewOnNavigationEvent = onNavigationEvent();
        ViewGroup.LayoutParams layoutParams = onNavigationEvent().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        layoutParams.width = i + i3 + i4;
        layoutParams.height = i2;
        tdsImageViewOnNavigationEvent.setLayoutParams(layoutParams);
        onNavigationEvent().setPadding(i3, 0, i4, 0);
        int i8 = ICustomTabsCallback + 1;
        extraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
    }

    public final void setIconVisibility(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 69;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent().setVisibility(i);
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((LottieAnimationView) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1775497156, new Object[]{this}, 1775497157, iIAuthTabCallback, iIAuthTabCallback3)).setVisibility(i);
        int i5 = ICustomTabsCallback + 75;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void setLottieIcon$default(TextField textField, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 87;
        int i4 = i3 % 128;
        extraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLottieIcon");
        }
        int i6 = i4 + 25;
        ICustomTabsCallback = i6 % 128;
        if (i6 % 2 != 0 ? (i & 2) != 0 : (i & 3) != 0) {
            int i7 = i4 + 87;
            ICustomTabsCallback = i7 % 128;
            z = i7 % 2 == 0;
        }
        textField.setLottieIcon(str, z);
    }

    public static final class getInterfaceDescriptor extends AnimatorListenerAdapter {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ String onExtraCallbackWithResult;
        final /* synthetic */ boolean onWarmupCompleted;

        public static /* synthetic */ Unit onExtraCallback(TextField textField) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onNavigationEvent(textField);
            }
            onNavigationEvent(textField);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        getInterfaceDescriptor(String str, boolean z) {
            this.onExtraCallbackWithResult = str;
            this.onWarmupCompleted = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            TextField textField = TextField.this;
            TextField.onWarmupCompleted(textField, this.onExtraCallbackWithResult, this.onWarmupCompleted, (Function0) new TextField$setLottieIcon$1$.ExternalSyntheticLambda0(textField));
            int i2 = onExtraCallback + 115;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 13 / 0;
            }
        }

        private static final Unit onNavigationEvent(TextField textField) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) TextField.onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onTransact.removeAllAnimatorListeners();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 61;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    public final void setLottieIcon(@NotNull String str, boolean z) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 13;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onNavigationEvent.setImageDrawable((Drawable) null);
        if (!IAuthTabCallback_Parcel()) {
            Object[] objArr = {this, str, Boolean.valueOf(z), null, 4, null};
            int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1878551741, objArr, 1878551746, iIAuthTabCallback4, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
            return;
        }
        int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback7 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback6, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback5, iIAuthTabCallback7)).onTransact.removeAllAnimatorListeners();
        int iIAuthTabCallback8 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback9 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback10 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback9, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback8, iIAuthTabCallback10)).onTransact.addAnimatorListener(new getInterfaceDescriptor(str, z));
        int i4 = ICustomTabsCallback + 55;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onNavigationEvent(String str, final boolean z, final Function0<Unit> function0) {
        int i = 2 % 2;
        ComposableLambdaImplExternalSyntheticLambda9.onExtraCallbackWithResult(getContext(), str).onExtraCallbackWithResult(new ManagedRetainedValuesStoreKtExternalSyntheticLambda0() { // from class: im.toss.uikit.widget.textField.TextField$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final void onResult(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 115;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    TextField.onExtraCallbackWithResult(this.f$0, z, function0, (ComposableLambdaImplExternalSyntheticLambda2) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                TextField.onExtraCallbackWithResult(this.f$0, z, function0, (ComposableLambdaImplExternalSyntheticLambda2) obj);
                int i4 = onExtraCallbackWithResult + 45;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = ICustomTabsCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 28 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) {
        TextField textField = (TextField) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Function0 function0 = (Function0) objArr[2];
        ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2 = (ComposableLambdaImplExternalSyntheticLambda2) objArr[3];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 123;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onTransact.setComposition(composableLambdaImplExternalSyntheticLambda2);
            int i3 = 6 / 0;
            if (zBooleanValue) {
                int i4 = ICustomTabsCallback + 67;
                extraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                textField.access100();
                if (function0 != null) {
                    int i6 = ICustomTabsCallback + 23;
                    extraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    function0.invoke();
                    int i8 = ICustomTabsCallback + 39;
                    extraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
        } else {
            int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).onTransact.setComposition(composableLambdaImplExternalSyntheticLambda2);
            if (zBooleanValue) {
            }
        }
        textField.onActivityLayout();
        return null;
    }

    public final void access100() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 101;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            if (((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onTransact.getComposition() == null) {
                int i3 = ICustomTabsCallback + 111;
                extraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 11 / 0;
                    return;
                }
                return;
            }
            int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).onTransact.playAnimation();
            return;
        }
        int iIAuthTabCallback7 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback8 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback9 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback8, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback7, iIAuthTabCallback9)).onTransact.getComposition();
        throw null;
    }

    public final boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 109;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        if (i3 != 0) {
            ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, objArr, 906317768, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onTransact.isAnimating();
            throw null;
        }
        boolean zIsAnimating = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, objArr, 906317768, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onTransact.isAnimating();
        int i4 = extraCallbackWithResult + 61;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return zIsAnimating;
    }

    private final void onActivityLayout() {
        int i = 2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        if (((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onNavigationEvent.getDrawable() == null) {
            int i2 = ICustomTabsCallback + 71;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).onNavigationEvent.setVisibility(8);
            int i4 = extraCallbackWithResult + 81;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int iIAuthTabCallback7 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback8 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback9 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback8, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback7, iIAuthTabCallback9)).onNavigationEvent.setVisibility(0);
            int i6 = extraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
            ICustomTabsCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 3;
            }
        }
        int iIAuthTabCallback10 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback11 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback12 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        if (((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback11, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback10, iIAuthTabCallback12)).onTransact.getComposition() == null) {
            int iIAuthTabCallback13 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback14 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback15 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback14, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback13, iIAuthTabCallback15)).onTransact.setVisibility(8);
            return;
        }
        int iIAuthTabCallback16 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback17 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback18 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback17, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback16, iIAuthTabCallback18)).onTransact.setVisibility(0);
    }

    public final void setClearable(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 23;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            this.asInterface = z;
            readTypedObject();
        } else {
            this.asInterface = z;
            readTypedObject();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void readTypedObject() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 41;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.asInterface) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).IAuthTabCallback.setVisibility(8);
            extraCallbackWithResult();
            return;
        }
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).IAuthTabCallback.setVisibility(0);
        if (IAuthTabCallbackStub() > 0) {
            int i3 = extraCallbackWithResult + 43;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            int iIAuthTabCallback7 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback8 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback9 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            if (((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback8, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback7, iIAuthTabCallback9)).onExtraCallbackWithResult.isFocused()) {
                int i5 = ICustomTabsCallback + 9;
                extraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                ICustomTabsCallback();
                return;
            }
        }
        extraCallbackWithResult();
    }

    private static final void IAuthTabCallback(TextField textField, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 73;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).IAuthTabCallback.getLayoutParams().width = getCurrentBacktraceOrBuilderList.onNavigationEvent(fFloatValue);
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).IAuthTabCallback.getLayoutParams().height = getCurrentBacktraceOrBuilderList.onNavigationEvent(fFloatValue);
        int iIAuthTabCallback7 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback8 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback9 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        TdsImageView tdsImageView = ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback8, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, iIAuthTabCallback7, iIAuthTabCallback9)).IAuthTabCallback;
        int iIAuthTabCallback10 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback11 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback12 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        tdsImageView.setLayoutParams(((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback11, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, iIAuthTabCallback10, iIAuthTabCallback12)).IAuthTabCallback.getLayoutParams());
        int i4 = ICustomTabsCallback + 67;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void ICustomTabsCallback() {
        Animator animator;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 41;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Animator animator2 = this.IAuthTabCallback;
        if (animator2 == null || !animator2.isRunning()) {
            Animator animator3 = this.onExtraCallback;
            if (animator3 != null && animator3.isRunning() && (animator = this.onExtraCallback) != null) {
                int i3 = ICustomTabsCallback + 125;
                extraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    animator.cancel();
                    obj.hashCode();
                    throw null;
                }
                animator.cancel();
                int i4 = extraCallbackWithResult + 5;
                ICustomTabsCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            float f = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).IAuthTabCallback.getLayoutParams().height;
            float f2 = this.asBinder;
            if (f == f2) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.textField.TextField$$ExternalSyntheticLambda1
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallbackWithResult + 9;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    TextField.onWarmupCompleted(this.f$0, valueAnimator);
                    int i9 = onExtraCallbackWithResult + 109;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 25 / 0;
                    }
                }
            });
            valueAnimatorOfFloat.start();
            this.IAuthTabCallback = valueAnimatorOfFloat;
        }
    }

    private static final void onExtraCallbackWithResult(TextField textField, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 11;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).IAuthTabCallback.getLayoutParams().width = getCurrentBacktraceOrBuilderList.onNavigationEvent(fFloatValue);
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).IAuthTabCallback.getLayoutParams().height = getCurrentBacktraceOrBuilderList.onNavigationEvent(fFloatValue);
        int iIAuthTabCallback7 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback8 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback9 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        TdsImageView tdsImageView = ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback8, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, iIAuthTabCallback7, iIAuthTabCallback9)).IAuthTabCallback;
        int iIAuthTabCallback10 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback11 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback12 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        tdsImageView.setLayoutParams(((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback11, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, iIAuthTabCallback10, iIAuthTabCallback12)).IAuthTabCallback.getLayoutParams());
        int i4 = extraCallbackWithResult + 49;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void extraCallbackWithResult() {
        Animator animator;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Animator animator2 = this.onExtraCallback;
        if (animator2 == null || !animator2.isRunning()) {
            Animator animator3 = this.IAuthTabCallback;
            if (animator3 != null && animator3.isRunning() && (animator = this.IAuthTabCallback) != null) {
                animator.cancel();
            }
            float f = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).IAuthTabCallback.getLayoutParams().height;
            if (f == 0.0f) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.textField.TextField$$ExternalSyntheticLambda2
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 31;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        TextField.onExtraCallback(this.f$0, valueAnimator);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    TextField.onExtraCallback(this.f$0, valueAnimator);
                    int i6 = onExtraCallback + 47;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                }
            });
            valueAnimatorOfFloat.start();
            this.onExtraCallback = valueAnimatorOfFloat;
            int i4 = extraCallbackWithResult + 49;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 54 / 0;
            }
        }
    }

    private final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 51;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onExtraCallbackWithResult.setGravity(i);
            return;
        }
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).onExtraCallbackWithResult.setGravity(i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[PHI: r5
      0x0084: PHI (r5v4 java.lang.CharSequence) = (r5v3 java.lang.CharSequence), (r5v9 java.lang.CharSequence) binds: [B:17:0x0081, B:12:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setHint(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 59;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact = charSequence;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        registerCrashCallback registercrashcallback = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult;
        CertificatePinnerBuilder.onWarmupCompleted onwarmupcompleted = CertificatePinnerBuilder.Companion;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        CharSequence charSequence2 = this.onTransact;
        CharSequence charSequence3 = null;
        if (charSequence2 != null) {
            int i4 = extraCallbackWithResult + 21;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 65 / 0;
                if (charSequence2.length() <= 0) {
                    int i6 = ICustomTabsCallback + 105;
                    extraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    charSequence2 = null;
                }
                if (charSequence2 == null) {
                    charSequence3 = charSequence2;
                } else {
                    charSequence2 = this.IAuthTabCallbackDefault;
                    if (charSequence2 != null) {
                        int i8 = ICustomTabsCallback + 109;
                        extraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        if (extraCallback()) {
                        }
                    }
                }
            } else {
                if (charSequence2.length() <= 0) {
                }
                if (charSequence2 == null) {
                }
            }
        }
        registercrashcallback.setHint(onwarmupcompleted.onNavigationEvent(context, charSequence3));
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult.setSelection(IAuthTabCallbackStub());
        onMessageChannelReady();
        onPostMessage();
    }

    public final void setHint(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 65;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        setHint(getResources().getString(i));
        int i5 = ICustomTabsCallback + 49;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void IAuthTabCallback(@NotNull TextWatcher textWatcher) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 17;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(textWatcher, "");
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onExtraCallbackWithResult.addTextChangedListener(textWatcher);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(textWatcher, "");
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).onExtraCallbackWithResult.addTextChangedListener(textWatcher);
        int i3 = ICustomTabsCallback + 113;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void setImeOptions(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 77;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onExtraCallbackWithResult.setImeOptions(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).onExtraCallbackWithResult.setImeOptions(i);
        int i4 = extraCallbackWithResult + 27;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setSelection(int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 43;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onExtraCallbackWithResult.setSelection(i);
        int i5 = ICustomTabsCallback + 71;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
    }

    public final void setSelection(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = extraCallbackWithResult + 109;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onExtraCallbackWithResult.setSelection(i, i2);
        int i6 = extraCallbackWithResult + 53;
        ICustomTabsCallback = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.widget.RelativeLayout
    public void setGravity(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 69;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onExtraCallbackWithResult.setGravity(i);
            int i4 = 32 / 0;
        } else {
            int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).onExtraCallbackWithResult.setGravity(i);
        }
        int i5 = ICustomTabsCallback + 85;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
    }

    public final void setTextFieldMaxHeight(int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 57;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).IAuthTabCallback_Parcel.setMaxHeight(i);
        int i5 = extraCallbackWithResult + 49;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallback() {
        View view;
        Drawable drawableIAuthTabCallback;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 45;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onExtraCallbackWithResult.setTextIsSelectable(false);
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).onExtraCallbackWithResult.setFocusable(false);
        int iIAuthTabCallback7 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback8 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback9 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback8, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback7, iIAuthTabCallback9)).onExtraCallbackWithResult.setFocusableInTouchMode(false);
        int iIAuthTabCallback10 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback11 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback12 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback11, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback10, iIAuthTabCallback12)).onExtraCallbackWithResult.setLongClickable(false);
        if (this.readTypedObject == onWarmupCompleted.NORMAL) {
            int i4 = ICustomTabsCallback + 35;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = {this};
            int iIAuthTabCallback13 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback14 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback15 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            int iIAuthTabCallback16 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            if (i5 != 0) {
                view = ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback14, iIAuthTabCallback16, -906317760, objArr, 906317768, iIAuthTabCallback13, iIAuthTabCallback15)).access100;
                drawableIAuthTabCallback = IAuthTabCallback(true);
            } else {
                view = ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback14, iIAuthTabCallback16, -906317760, objArr, 906317768, iIAuthTabCallback13, iIAuthTabCallback15)).access100;
                drawableIAuthTabCallback = IAuthTabCallback(false);
            }
            view.setBackground(drawableIAuthTabCallback);
        }
        int i6 = ICustomTabsCallback + 13;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.view.ViewGroup
    public void addView(@NotNull View view, int i, @Nullable ViewGroup.LayoutParams layoutParams) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (view.getId() == im.toss.uikit.R.id.root) {
            super.addView(view, i, layoutParams);
            int i3 = extraCallbackWithResult + 95;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = extraCallbackWithResult + 9;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            onExtraCallbackWithResult(view, i, layoutParams);
            return;
        }
        onExtraCallbackWithResult(view, i, layoutParams);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2;
        int i2 = 2 % 2;
        if (!this.onWarmupCompleted) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ViewGroup.LayoutParams layoutParams3 = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).IAuthTabCallbackStubProxy.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams3, "");
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) (layoutParams == null ? new RelativeLayout.LayoutParams(-2, -2) : layoutParams);
            IAuthTabCallback iAuthTabCallback = this.onNavigationEvent;
            if (iAuthTabCallback == IAuthTabCallback.LEFT) {
                int i3 = ICustomTabsCallback + 107;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                layoutParams5.addRule(9);
                layoutParams4.addRule(1, view.getId());
            } else if (iAuthTabCallback == IAuthTabCallback.RIGHT) {
                layoutParams5.addRule(11);
                layoutParams4.addRule(0, view.getId());
            }
            super.addView(view, i, layoutParams5);
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).IAuthTabCallbackStubProxy.setLayoutParams(layoutParams4);
            int i5 = ICustomTabsCallback + 81;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 88 / 0;
                return;
            }
            return;
        }
        if (layoutParams == null) {
            layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            int i7 = extraCallbackWithResult + 39;
            ICustomTabsCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 / 5;
            }
        } else {
            layoutParams2 = layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams2;
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ViewGroup.LayoutParams layoutParams7 = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback3, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallback.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams7, "");
        RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) layoutParams7;
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        layoutParams6.addRule(6, ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallback.getId());
        int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        layoutParams6.addRule(8, ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallback.getId());
        IAuthTabCallback iAuthTabCallback2 = this.onNavigationEvent;
        if (iAuthTabCallback2 == IAuthTabCallback.LEFT) {
            int i9 = ICustomTabsCallback + 105;
            extraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            layoutParams6.addRule(9);
            layoutParams8.addRule(1, view.getId());
        } else if (iAuthTabCallback2 == IAuthTabCallback.RIGHT) {
            layoutParams6.addRule(11);
            layoutParams8.addRule(0, view.getId());
        }
        int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback6, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).IAuthTabCallbackStubProxy.addView(view, layoutParams6);
        int iIAuthTabCallback7 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback7, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallback.setLayoutParams(layoutParams8);
    }

    public static /* synthetic */ void setNumberFormat$default(TextField textField, int i, onExtraCallbackWithResult onextracallbackwithresult, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallback + 61;
        int i5 = i4 % 128;
        extraCallbackWithResult = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNumberFormat");
        }
        if ((i2 & 1) != 0) {
            int i6 = i5 + 63;
            ICustomTabsCallback = i6 % 128;
            int i7 = i6 % 2;
            i = -1;
        }
        if ((i2 & 2) != 0) {
            int i8 = i5 + 99;
            ICustomTabsCallback = i8 % 128;
            int i9 = i8 % 2;
            onextracallbackwithresult = null;
        }
        textField.setNumberFormat(i, onextracallbackwithresult);
        int i10 = extraCallbackWithResult + 79;
        ICustomTabsCallback = i10 % 128;
        int i11 = i10 % 2;
    }

    public static final class extraCallbackWithResult implements TextWatcher {
        private static int IAuthTabCallbackStub = 0;
        private static int asInterface = 1;
        final /* synthetic */ int IAuthTabCallback;
        private int IAuthTabCallbackDefault;
        final /* synthetic */ onExtraCallbackWithResult onExtraCallback;
        private String onExtraCallbackWithResult = _UrlKt.FRAGMENT_ENCODE_SET;
        final /* synthetic */ DecimalFormat onNavigationEvent;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = asInterface + 29;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.checkNotNullParameter(charSequence, "");
            if (i6 != 0) {
                throw null;
            }
            int i7 = IAuthTabCallbackStub + 25;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
        }

        extraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, int i, DecimalFormat decimalFormat) {
            this.onExtraCallback = onextracallbackwithresult;
            this.IAuthTabCallback = i;
            this.onNavigationEvent = decimalFormat;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = asInterface + 103;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(editable, "");
            Object[] objArr = {TextField.this};
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, objArr, 906317768, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult.removeTextChangedListener(this);
            InputFilter[] filters = editable.getFilters();
            editable.setFilters(new InputFilter[0]);
            editable.replace(0, editable.length(), this.onExtraCallbackWithResult);
            editable.setFilters(filters);
            Object[] objArr2 = {TextField.this};
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            registerCrashCallback registercrashcallback = ((AFk1sSDK) TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, objArr2, 906317768, iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult;
            int i4 = this.IAuthTabCallbackDefault;
            Object[] objArr3 = {TextField.this};
            int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            registercrashcallback.setSelection(Math.max(0, Math.min(i4, ((AFk1sSDK) TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, objArr3, 906317768, iIAuthTabCallback3, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult.length())));
            Object[] objArr4 = {TextField.this};
            int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, objArr4, 906317768, iIAuthTabCallback4, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult.addTextChangedListener(this);
            onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallback;
            if (onextracallbackwithresult != null) {
                TextField textField = TextField.this;
                int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                int iIAuthTabCallback7 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                onextracallbackwithresult.onWarmupCompleted(textField, String.valueOf(((AFk1sSDK) TextField.onExtraCallbackWithResult(iIAuthTabCallback6, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{textField}, 906317768, iIAuthTabCallback5, iIAuthTabCallback7)).onExtraCallbackWithResult.getText()), Long.valueOf(TextField.this.onTransact()));
            }
            int i5 = asInterface + 65;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String str;
            long jLongValue;
            int i4 = 2 % 2;
            Intrinsics.checkNotNullParameter(charSequence, "");
            String strReplace = new Regex("[^0-9-]").replace(charSequence, _UrlKt.FRAGMENT_ENCODE_SET);
            if (strReplace.length() == 0) {
                this.onExtraCallbackWithResult = _UrlKt.FRAGMENT_ENCODE_SET;
                this.IAuthTabCallbackDefault = 0;
                return;
            }
            int length = i - new Regex("[^,]").replace(charSequence.subSequence(0, i), _UrlKt.FRAGMENT_ENCODE_SET).length();
            int length2 = new Regex("[^0-9-]").replace(charSequence.subSequence(i, i3 + i).toString(), _UrlKt.FRAGMENT_ENCODE_SET).length();
            if (StringsKt__StringsJVMKt.startsWith$default(strReplace, "-", false, 2, null)) {
                int i5 = IAuthTabCallbackStub + 103;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                str = "-";
            } else {
                str = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            if (this.IAuthTabCallback > 0 && strReplace.length() - str.length() > this.IAuthTabCallback) {
                String strSubstring = strReplace.substring(0, length);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                String strSubstring2 = strReplace.substring(length + length2, strReplace.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                String strSubstring3 = strReplace.substring(length, Math.min(length2, (this.IAuthTabCallback - (strSubstring.length() - str.length())) - strSubstring2.length()) + length);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                strReplace = strSubstring + strSubstring3 + strSubstring2;
                length2 = strSubstring3.length();
            }
            int i7 = length + length2;
            int length3 = strReplace.length() - i7;
            int iMax = Math.max(0, (length3 / 3) - ((i7 - str.length() == 0 && length3 % 3 == 0) ? 1 : 0));
            if (!Intrinsics.areEqual(strReplace, "-")) {
                int i8 = asInterface + 93;
                IAuthTabCallbackStub = i8 % 128;
                if (i8 % 2 != 0) {
                    StringsKt__StringNumberConversionsKt.toLongOrNull(strReplace);
                    throw null;
                }
                DecimalFormat decimalFormat = this.onNavigationEvent;
                Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(strReplace);
                if (longOrNull != null) {
                    jLongValue = longOrNull.longValue();
                } else {
                    int i9 = IAuthTabCallbackStub + 5;
                    asInterface = i9 % 128;
                    int i10 = i9 % 2;
                    jLongValue = 0;
                }
                strReplace = decimalFormat.format(jLongValue);
                Intrinsics.checkNotNullExpressionValue(strReplace, "");
                int i11 = asInterface + 9;
                IAuthTabCallbackStub = i11 % 128;
                int i12 = i11 % 2;
            }
            this.onExtraCallbackWithResult = strReplace;
            this.IAuthTabCallbackDefault = (strReplace.length() - length3) - iMax;
        }
    }

    public final void setNumberFormat(int i, @Nullable onExtraCallbackWithResult onextracallbackwithresult) {
        int i2 = 2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onExtraCallbackWithResult.setText(_UrlKt.FRAGMENT_ENCODE_SET);
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, iIAuthTabCallback6)).onExtraCallbackWithResult.setInputType(4098);
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        decimalFormat.setNegativePrefix("-");
        int iIAuthTabCallback7 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback8 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback9 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback8, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback7, iIAuthTabCallback9)).onExtraCallbackWithResult.addTextChangedListener(new extraCallbackWithResult(onextracallbackwithresult, i, decimalFormat));
        int i3 = ICustomTabsCallback + 21;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    private final boolean extraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 67;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted onwarmupcompleted = onWarmupCompleted.MEDIUM;
            throw null;
        }
        if (this.readTypedObject != onWarmupCompleted.MEDIUM) {
            return false;
        }
        int i3 = ICustomTabsCallback + 85;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(new Regex("[^0-9-]").replace(String.valueOf(((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).onExtraCallbackWithResult.getText()), _UrlKt.FRAGMENT_ENCODE_SET));
        if (longOrNull == null) {
            return 0L;
        }
        int i2 = ICustomTabsCallback + 83;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        long jLongValue = longOrNull.longValue();
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return jLongValue;
    }

    public final Typography7 asBinder() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Typography7 typography7 = ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).asInterface;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        int i4 = ICustomTabsCallback + 93;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return typography7;
        }
        throw null;
    }

    public final Typography7 IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 49;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Typography7 typography7 = ((AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3)).IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        int i4 = extraCallbackWithResult + 65;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return typography7;
        }
        throw null;
    }

    public final class onNavigationEvent implements Animator.AnimatorListener {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final int onNavigationEvent;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            if (i3 == 0) {
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            if (i3 != 0) {
                throw null;
            }
            int i4 = onWarmupCompleted + 75;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 44 / 0;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            if (i3 != 0) {
                int i4 = 73 / 0;
            }
        }

        public onNavigationEvent(int i) {
            this.onNavigationEvent = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(animator, "");
                Object[] objArr = {TextField.this};
                int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1369456404, objArr, -1369456395, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                throw null;
            }
            Intrinsics.checkNotNullParameter(animator, "");
            Object[] objArr2 = {TextField.this};
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1369456404, objArr2, -1369456395, iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
            int i3 = onWarmupCompleted + 27;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public final void setTextFieldType(@NotNull onWarmupCompleted onwarmupcompleted) {
        int iMayLaunchUrl;
        int i;
        int i2 = 2 % 2;
        Float fValueOf = Float.valueOf(8.0f);
        Float fValueOf2 = Float.valueOf(4.0f);
        Float fValueOf3 = Float.valueOf(12.0f);
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.readTypedObject = onwarmupcompleted;
        int i3 = IAuthTabCallbackDefault.onWarmupCompleted[onwarmupcompleted.ordinal()];
        if (i3 == 1) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ConstraintLayout constraintLayout = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onWarmupCompleted;
            int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            constraintLayout.setBackground(IAuthTabCallback(((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult.isFocusable()));
            int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback3, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).access100.setBackground(null);
            int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            TdsRoundLayout tdsRoundLayout = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback4, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallback;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            if (readIntokhttp.onWarmupCompleted(configuration)) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                Configuration configuration2 = context2.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                iMayLaunchUrl = ((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new writeTypedObject(configuration2))}, -1252317281, 1252317293, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue();
            } else {
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                Configuration configuration3 = context3.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration3, "");
                iMayLaunchUrl = new getUrlokhttp(new readTypedObject(configuration3)).mayLaunchUrl();
            }
            tdsRoundLayout.setStrokeColor(iMayLaunchUrl);
            asBinder().setTextSize(2, 13.0f);
            Typography7 typography7AsBinder = asBinder();
            int paddingLeft = asBinder().getPaddingLeft();
            int paddingTop = asBinder().getPaddingTop();
            int paddingRight = asBinder().getPaddingRight();
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            typography7AsBinder.setPadding(paddingLeft, paddingTop, paddingRight, varyMatches.onNavigationEvent(Float.valueOf(6.0f), displayMetrics));
            int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult.setTextSize(2, 17.0f);
            int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            registerCrashCallback registercrashcallback = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback6, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult;
            DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(fValueOf3, displayMetrics2);
            DisplayMetrics displayMetrics3 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            int iOnNavigationEvent2 = varyMatches.onNavigationEvent(fValueOf, displayMetrics3);
            DisplayMetrics displayMetrics4 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
            int iOnNavigationEvent3 = varyMatches.onNavigationEvent(fValueOf3, displayMetrics4);
            DisplayMetrics displayMetrics5 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
            registercrashcallback.setPadding(iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent3, varyMatches.onNavigationEvent(fValueOf, displayMetrics5));
            int iIAuthTabCallback7 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            registerCrashCallback registercrashcallback2 = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback7, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult;
            DisplayMetrics displayMetrics6 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
            registercrashcallback2.setMinimumHeight(varyMatches.onNavigationEvent(Float.valueOf(44.0f), displayMetrics6));
            int iIAuthTabCallback8 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((Typography5) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 178758613, new Object[]{this}, -178758613, iIAuthTabCallback8, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).setTextSize(2, 17.0f);
            int iIAuthTabCallback9 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            Typography5 typography5 = (Typography5) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 178758613, new Object[]{this}, -178758613, iIAuthTabCallback9, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
            response responseVar = response.Regular;
            typography5.onNavigationEvent(responseVar);
            int iIAuthTabCallback10 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            Typography5 typography52 = (Typography5) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 178758613, new Object[]{this}, -178758613, iIAuthTabCallback10, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
            ViewGroup.LayoutParams layoutParams = typography52.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            DisplayMetrics displayMetrics7 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
            marginLayoutParams.setMarginEnd(varyMatches.onNavigationEvent(fValueOf3, displayMetrics7));
            typography52.setLayoutParams(marginLayoutParams);
            access000().setTextSize(2, 17.0f);
            access000().onNavigationEvent(responseVar);
            Typography5 typography5Access000 = access000();
            ViewGroup.LayoutParams layoutParams2 = typography5Access000.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            DisplayMetrics displayMetrics8 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics8, "");
            marginLayoutParams2.setMarginEnd(varyMatches.onNavigationEvent(fValueOf3, displayMetrics8));
            typography5Access000.setLayoutParams(marginLayoutParams2);
            return;
        }
        if (i3 == 2) {
            int iIAuthTabCallback11 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            TdsRoundLayout tdsRoundLayout2 = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback11, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallback;
            tdsRoundLayout2.setStrokeWidth(0.0f);
            tdsRoundLayout2.setRadius(0.0f);
            tdsRoundLayout2.setBackgroundColor(0);
            int iIAuthTabCallback12 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback12, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onWarmupCompleted.setBackground(null);
            int iIAuthTabCallback13 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            View view = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback13, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).access100;
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration4 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration4, "");
            if (readIntokhttp.onWarmupCompleted(configuration4)) {
                int i4 = ICustomTabsCallback + 33;
                extraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                i = im.toss.uikit.R.drawable.text_field_underline_medium_selector_accessibility;
            } else {
                i = im.toss.uikit.R.drawable.text_field_underline_medium_selector;
            }
            view.setBackgroundResource(i);
            asBinder().setTextSize(2, 13.0f);
            asBinder().setPadding(asBinder().getPaddingLeft(), asBinder().getPaddingTop(), asBinder().getPaddingRight(), 0);
            int iIAuthTabCallback14 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback14, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult.setTextSize(2, 22.0f);
            int iIAuthTabCallback15 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback15, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult.setPadding(0, 0, 0, 0);
            int iIAuthTabCallback16 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            registerCrashCallback registercrashcallback3 = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback16, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult;
            DisplayMetrics displayMetrics9 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics9, "");
            registercrashcallback3.setMinimumHeight(varyMatches.onNavigationEvent(Float.valueOf(40.0f), displayMetrics9));
            int iIAuthTabCallback17 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            ((Typography5) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 178758613, new Object[]{this}, -178758613, iIAuthTabCallback17, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).setTextSize(2, 20.0f);
            int iIAuthTabCallback18 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            Typography5 typography53 = (Typography5) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 178758613, new Object[]{this}, -178758613, iIAuthTabCallback18, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
            response responseVar2 = response.Medium;
            typography53.onNavigationEvent(responseVar2);
            int iIAuthTabCallback19 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            Typography5 typography54 = (Typography5) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 178758613, new Object[]{this}, -178758613, iIAuthTabCallback19, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
            ViewGroup.LayoutParams layoutParams3 = typography54.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            int i6 = ICustomTabsCallback + 97;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.setMarginEnd(0);
            typography54.setLayoutParams(marginLayoutParams3);
            access000().setTextSize(2, 20.0f);
            access000().onNavigationEvent(responseVar2);
            Typography5 typography5Access0002 = access000();
            ViewGroup.LayoutParams layoutParams4 = typography5Access0002.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            int i8 = extraCallbackWithResult + 63;
            ICustomTabsCallback = i8 % 128;
            int i9 = i8 % 2;
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
            marginLayoutParams4.setMarginEnd(0);
            typography5Access0002.setLayoutParams(marginLayoutParams4);
            return;
        }
        if (i3 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i10 = ICustomTabsCallback + 9;
        extraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        int iIAuthTabCallback20 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        TdsRoundLayout tdsRoundLayout3 = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback20, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallback;
        tdsRoundLayout3.setStrokeWidth(0.0f);
        tdsRoundLayout3.setRadius(0.0f);
        tdsRoundLayout3.setBackgroundColor(0);
        int iIAuthTabCallback21 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback21, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onWarmupCompleted.setBackground(null);
        int iIAuthTabCallback22 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        View view2 = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback22, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).access100;
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        Configuration configuration5 = context5.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration5, "");
        view2.setBackgroundResource(readIntokhttp.onWarmupCompleted(configuration5) ? im.toss.uikit.R.drawable.text_field_underline_big_selector_accessibility : im.toss.uikit.R.drawable.text_field_underline_big_selector);
        asBinder().setTextSize(2, 16.0f);
        asBinder().setPadding(asBinder().getPaddingLeft(), asBinder().getPaddingTop(), asBinder().getPaddingRight(), 0);
        int iIAuthTabCallback23 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback23, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult.setTextSize(2, 34.0f);
        int iIAuthTabCallback24 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        registerCrashCallback registercrashcallback4 = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback24, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult;
        DisplayMetrics displayMetrics10 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics10, "");
        int iOnNavigationEvent4 = varyMatches.onNavigationEvent(fValueOf2, displayMetrics10);
        DisplayMetrics displayMetrics11 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics11, "");
        registercrashcallback4.setPadding(0, iOnNavigationEvent4, 0, varyMatches.onNavigationEvent(fValueOf2, displayMetrics11));
        int iIAuthTabCallback25 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        registerCrashCallback registercrashcallback5 = ((AFk1sSDK) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback25, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallbackWithResult;
        DisplayMetrics displayMetrics12 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics12, "");
        registercrashcallback5.setMinimumHeight(varyMatches.onNavigationEvent(Float.valueOf(52.0f), displayMetrics12));
        int iIAuthTabCallback26 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((Typography5) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 178758613, new Object[]{this}, -178758613, iIAuthTabCallback26, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).setTextSize(2, 30.0f);
        int iIAuthTabCallback27 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Typography5 typography55 = (Typography5) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 178758613, new Object[]{this}, -178758613, iIAuthTabCallback27, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        response responseVar3 = response.Medium;
        typography55.onNavigationEvent(responseVar3);
        int iIAuthTabCallback28 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Typography5 typography56 = (Typography5) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 178758613, new Object[]{this}, -178758613, iIAuthTabCallback28, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        ViewGroup.LayoutParams layoutParams5 = typography56.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        int i12 = ICustomTabsCallback + 51;
        extraCallbackWithResult = i12 % 128;
        int i13 = i12 % 2;
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
        marginLayoutParams5.setMarginEnd(0);
        typography56.setLayoutParams(marginLayoutParams5);
        access000().setTextSize(2, 30.0f);
        access000().onNavigationEvent(responseVar3);
        Typography5 typography5Access0003 = access000();
        ViewGroup.LayoutParams layoutParams6 = typography5Access0003.getLayoutParams();
        if (layoutParams6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
        marginLayoutParams6.setMarginEnd(0);
        typography5Access0003.setLayoutParams(marginLayoutParams6);
    }

    public static /* synthetic */ void onExtraCallback(ValueAnimator valueAnimator, TextField textField, ValueAnimator valueAnimator2) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -669585564, new Object[]{valueAnimator, textField, valueAnimator2}, 669585571, iIAuthTabCallback, iIAuthTabCallback3);
    }

    public static final /* synthetic */ void onWarmupCompleted(TextField textField) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1369456404, new Object[]{textField}, -1369456395, iIAuthTabCallback, iIAuthTabCallback3);
    }

    private final void onExtraCallbackWithResult(AttributeSet attributeSet) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -377106355, new Object[]{this, attributeSet}, 377106357, iIAuthTabCallback, iIAuthTabCallback3);
    }

    private static final void onWarmupCompleted(TextField textField, View view) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 96394912, new Object[]{textField, view}, -96394909, iIAuthTabCallback, iIAuthTabCallback3);
    }

    static /* synthetic */ void onWarmupCompleted(TextField textField, String str, boolean z, Function0 function0, int i, Object obj) {
        Object[] objArr = {textField, str, Boolean.valueOf(z), function0, Integer.valueOf(i), obj};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1878551741, objArr, 1878551746, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private static final void onWarmupCompleted(TextField textField, boolean z, Function0 function0, ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2) {
        Object[] objArr = {textField, Boolean.valueOf(z), function0, composableLambdaImplExternalSyntheticLambda2};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -349402899, objArr, 349402905, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    protected final AFk1sSDK onWarmupCompleted() {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (AFk1sSDK) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, iIAuthTabCallback3);
    }

    protected final LottieAnimationView asInterface() {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (LottieAnimationView) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1775497156, new Object[]{this}, 1775497157, iIAuthTabCallback, iIAuthTabCallback3);
    }

    public final Typography5 IAuthTabCallbackStubProxy() {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Typography5) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 178758613, new Object[]{this}, -178758613, iIAuthTabCallback, iIAuthTabCallback3);
    }

    public final Editable getInterfaceDescriptor() {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Editable) onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 450491628, new Object[]{this}, -450491624, iIAuthTabCallback, iIAuthTabCallback3);
    }
}
