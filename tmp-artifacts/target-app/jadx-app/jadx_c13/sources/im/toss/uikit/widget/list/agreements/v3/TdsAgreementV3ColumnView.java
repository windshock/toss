package im.toss.uikit.widget.list.agreements.v3;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.tosscert.ui.R;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography4;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.uikit.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinSdkSettings;
import o.M_;
import o.access15300;
import o.deprecated_certificatePinner;
import o.deprecated_dns;
import o.deprecated_minFreshSeconds;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.head;
import o.isMuted;
import o.loadlambda0;
import o.readIntokhttp;
import o.response;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsAgreementV3ColumnView extends ConstraintLayout {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private final View IAuthTabCallback;
    private final head onExtraCallback;
    private loadlambda0 onExtraCallbackWithResult;
    private final LinearLayout onNavigationEvent;
    private onExtraCallbackWithResult onWarmupCompleted;

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[onExtraCallbackWithResult.values().length];
            try {
                iArr[onExtraCallbackWithResult.SMALL.ordinal()] = 1;
                int i = onWarmupCompleted + 31;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onExtraCallbackWithResult.MEDIUM.ordinal()] = 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onExtraCallbackWithResult.BIG.ordinal()] = 3;
                int i5 = onNavigationEvent + 33;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallbackWithResult = iArr;
            int i8 = onNavigationEvent + 101;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAgreementV3ColumnView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAgreementV3ColumnView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = i3 | i7;
        int i9 = ~i2;
        int i10 = ~((~i3) | i7);
        int i11 = i5 + i2 + i4 + (1977613057 * i) + (454551927 * i6);
        int i12 = i11 * i11;
        int i13 = (1378041352 * i5) + 473956352 + (953991674 * i2) + (212024839 * i8) + (i9 * (-212024839)) + ((-212024839) * i10) + (1166016512 * i4) + ((-981467136) * i) + ((-830472192) * i6) + ((-499122176) * i12);
        int i14 = (i5 * (-1131120504)) + 246467939 + (i2 * (-1131119078)) + (i8 * (-713)) + (i9 * 713) + (i10 * 713) + (i4 * (-1131119791)) + (i * (-1039407535)) + (i6 * 1820920743) + (i12 * 1447034880);
        return i13 + ((i14 * i14) * 1170210816) != 1 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted(TdsAgreementV3ColumnView tdsAgreementV3ColumnView, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return (AppLovinSdkSettings) IAuthTabCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 141856814, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -141856813, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{tdsAgreementV3ColumnView, Boolean.valueOf(z)});
        }
        Object[] objArr = {tdsAgreementV3ColumnView, Boolean.valueOf(z)};
        int i3 = 49 / 0;
        return (AppLovinSdkSettings) IAuthTabCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 141856814, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -141856813, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsAgreementV3ColumnView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onTransact + 109;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = IAuthTabCallbackStub;
            int i5 = i4 + 125;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 111;
            onTransact = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final onExtraCallbackWithResult SMALL = new onExtraCallbackWithResult("SMALL", 0);
        public static final onExtraCallbackWithResult MEDIUM = new onExtraCallbackWithResult("MEDIUM", 1);
        public static final onExtraCallbackWithResult BIG = new onExtraCallbackWithResult("BIG", 2);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return new onExtraCallbackWithResult[]{SMALL, MEDIUM, BIG};
            }
            onExtraCallbackWithResult onextracallbackwithresult = SMALL;
            onExtraCallbackWithResult onextracallbackwithresult2 = MEDIUM;
            onExtraCallbackWithResult onextracallbackwithresult3 = BIG;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = new onExtraCallbackWithResult[4];
            onextracallbackwithresultArr[1] = onextracallbackwithresult;
            onextracallbackwithresultArr[1] = onextracallbackwithresult2;
            onextracallbackwithresultArr[2] = onextracallbackwithresult3;
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 != 0) {
                return onextracallbackwithresult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i4 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresultArr;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = IAuthTabCallback + 63;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult) {
        Pair pairIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted = onextracallbackwithresult;
        int i4 = onWarmupCompleted.onExtraCallbackWithResult[onextracallbackwithresult.ordinal()];
        if (i4 == 1) {
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            float fOnNavigationEvent = varyMatches.onNavigationEvent(8, displayMetrics);
            DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(fOnNavigationEvent), Integer.valueOf(varyMatches.onNavigationEvent(0, displayMetrics2)));
            int i5 = IAuthTabCallbackStub + 67;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        } else if (i4 != 2) {
            int i7 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGB_YVYU;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            DisplayMetrics displayMetrics3 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            float fOnNavigationEvent2 = varyMatches.onNavigationEvent(12, displayMetrics3);
            DisplayMetrics displayMetrics4 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(fOnNavigationEvent2), Integer.valueOf(varyMatches.onNavigationEvent(4, displayMetrics4)));
        } else {
            DisplayMetrics displayMetrics5 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
            float fOnNavigationEvent3 = varyMatches.onNavigationEvent(8, displayMetrics5);
            DisplayMetrics displayMetrics6 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(fOnNavigationEvent3), Integer.valueOf(varyMatches.onNavigationEvent(0, displayMetrics6)));
        }
        float fFloatValue = ((Number) pairIAuthTabCallback.onExtraCallbackWithResult()).floatValue();
        int iIntValue = ((Number) pairIAuthTabCallback.IAuthTabCallback()).intValue();
        View view = this.IAuthTabCallback;
        M_ m_ = M_.onExtraCallback;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        view.setBackground((deprecated_minFreshSeconds) M_.onNavigationEvent(-556734050, new Object[]{m_, context, Float.valueOf(fFloatValue)}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 556734051, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent()));
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(this.IAuthTabCallback, iIntValue, iIntValue);
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted();
            throw null;
        }
        TdsCheckBoxV2View tdsCheckBoxV2ViewOnWarmupCompleted = onWarmupCompleted();
        if (tdsCheckBoxV2ViewOnWarmupCompleted != null && tdsCheckBoxV2ViewOnWarmupCompleted.isChecked()) {
            int i3 = onTransact + 109;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = onTransact + 87;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final void setChecked(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TdsCheckBoxV2View tdsCheckBoxV2ViewOnWarmupCompleted = onWarmupCompleted();
        if (tdsCheckBoxV2ViewOnWarmupCompleted != null) {
            int i4 = onTransact + 51;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            tdsCheckBoxV2ViewOnWarmupCompleted.setChecked(z);
            if (i5 != 0) {
                throw null;
            }
        }
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onWarmupCompleted + 71;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = IAuthTabCallback + 63;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            int i3 = onWarmupCompleted + 63;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i4 != 0) {
                int i5 = 3 / 0;
            }
            return getspecialfeatureoptinstatus2;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onNavigationEvent(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072 A[PHI: r14
      0x0072: PHI (r14v4 int) = (r14v3 int), (r14v9 int) binds: [B:15:0x0070, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080 A[PHI: r14
      0x0080: PHI (r14v8 int) = (r14v3 int), (r14v9 int) binds: [B:15:0x0070, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TdsAgreementV3ColumnView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        boolean z;
        int index;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onWarmupCompleted = onExtraCallbackWithResult.SMALL;
        this.onExtraCallbackWithResult = loadlambda0.NONE;
        if (getLayoutParams() == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            int i2 = 2 % 2;
        }
        String string = null;
        if (attributeSet != null) {
            int i3 = onTransact + 91;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsAgreementV3Column, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i5 = 2 % 2;
            z = true;
            for (int i6 = 0; i6 < indexCount; i6++) {
                int i7 = IAuthTabCallbackStub + 59;
                onTransact = i7 % 128;
                if (i7 % 2 == 0) {
                    index = typedArrayObtainStyledAttributes.getIndex(i6);
                    int i8 = 26 / 0;
                    if (index == R.styleable.TdsAgreementV3Column_agreementColumnTitle) {
                        string = typedArrayObtainStyledAttributes.getString(index);
                        int i9 = onTransact + 65;
                        IAuthTabCallbackStub = i9 % 128;
                        int i10 = i9 % 2;
                    } else if (index == R.styleable.TdsAgreementV3Column_agreementColumnCheckable) {
                        int i11 = onTransact + 21;
                        IAuthTabCallbackStub = i11 % 128;
                        if (i11 % 2 != 0) {
                            z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                            int i12 = 75 / 0;
                        } else {
                            z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                        }
                    }
                } else {
                    index = typedArrayObtainStyledAttributes.getIndex(i6);
                    if (index == R.styleable.TdsAgreementV3Column_agreementColumnTitle) {
                    }
                }
            }
        } else {
            z = true;
        }
        View view = new View(getContext());
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = new ConstraintLayout.onExtraCallbackWithResult(0, 0);
        onextracallbackwithresult.IPostMessageServiceStubProxy = 0;
        onextracallbackwithresult.IAuthTabCallback = 0;
        onextracallbackwithresult.setEngagementSignalsCallback = 0;
        onextracallbackwithresult.IEngagementSignalsCallbackStubProxy = 0;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).leftMargin = varyMatches.onNavigationEvent(2, displayMetrics);
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).rightMargin = varyMatches.onNavigationEvent(2, displayMetrics2);
        view.setLayoutParams(onextracallbackwithresult);
        view.setDuplicateParentStateEnabled(true);
        view.setVisibility(8);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, view);
        this.IAuthTabCallback = view;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, linearLayout);
        this.onNavigationEvent = linearLayout;
        if (string != null) {
            int i13 = IAuthTabCallbackStub + 119;
            onTransact = i13 % 128;
            if (i13 % 2 == 0) {
                setTitle(string);
                int i14 = 86 / 0;
            } else {
                setTitle(string);
            }
            int i15 = 2 % 2;
        }
        onExtraCallbackWithResult(onExtraCallbackWithResult.SMALL);
        setCheckable(z);
        this.onExtraCallback = new head(this, (View) null, false, new Function1() { // from class: im.toss.uikit.widget.list.agreements.v3.TdsAgreementV3ColumnView$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i16 = 2 % 2;
                int i17 = IAuthTabCallback + 97;
                onExtraCallback = i17 % 128;
                int i18 = i17 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnWarmupCompleted = TdsAgreementV3ColumnView.onWarmupCompleted(this.f$0, ((Boolean) obj).booleanValue());
                int i19 = IAuthTabCallback + 103;
                onExtraCallback = i19 % 128;
                if (i19 % 2 != 0) {
                    return appLovinSdkSettingsOnWarmupCompleted;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 6, (DefaultConstructorMarker) null);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        deprecated_dns deprecated_dnsVarOnNavigationEvent;
        float f;
        ConstraintLayout constraintLayout = (TdsAgreementV3ColumnView) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        Object obj = null;
        if (zBooleanValue) {
            int i2 = IAuthTabCallbackStub + 99;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                deprecated_certificatepinner.asInterface();
                obj.hashCode();
                throw null;
            }
            deprecated_dnsVarOnNavigationEvent = deprecated_certificatepinner.asInterface();
        } else {
            deprecated_dnsVarOnNavigationEvent = deprecated_certificatepinner.onNavigationEvent();
        }
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_dnsVarOnNavigationEvent}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        float scaleX = constraintLayout.getScaleX();
        if (zBooleanValue) {
            int i3 = IAuthTabCallbackStub + 67;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            f = 0.96f;
        } else {
            f = 1.0f;
        }
        return isMuted.asBinder(appLovinSdkSettings, Float.valueOf(scaleX), Float.valueOf(f), (Function1) null, 4, (Object) null);
    }

    public final void setType(@NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (this.onWarmupCompleted != onextracallbackwithresult) {
            int i2 = onTransact + 17;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(onextracallbackwithresult);
            View viewOnNavigationEvent = onNavigationEvent();
            if (viewOnNavigationEvent != null) {
                int i4 = onTransact + 103;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    CharSequence text = viewOnNavigationEvent.getText();
                    this.onNavigationEvent.removeView(viewOnNavigationEvent);
                    setTitle(text);
                } else {
                    CharSequence text2 = viewOnNavigationEvent.getText();
                    this.onNavigationEvent.removeView(viewOnNavigationEvent);
                    setTitle(text2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        }
    }

    public final void setPrefix(@NotNull loadlambda0 loadlambda0Var) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(loadlambda0Var, "");
        if (this.onExtraCallbackWithResult != loadlambda0Var) {
            int i4 = onTransact + 39;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                this.onExtraCallbackWithResult = loadlambda0Var;
                onNavigationEvent();
                throw null;
            }
            this.onExtraCallbackWithResult = loadlambda0Var;
            BaseTextView baseTextViewOnNavigationEvent = onNavigationEvent();
            if (baseTextViewOnNavigationEvent != null) {
                setTitle(baseTextViewOnNavigationEvent.getText());
            }
        }
    }

    public final void setCheckable(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 5;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (z) {
            int i4 = i2 + 21;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            if (onWarmupCompleted() == null) {
                int i6 = onTransact + 15;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 == 0) {
                    asBinder();
                    return;
                } else {
                    asBinder();
                    obj.hashCode();
                    throw null;
                }
            }
        }
        if (z) {
            return;
        }
        int i7 = onTransact + 45;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            onWarmupCompleted();
            throw null;
        }
        View viewOnWarmupCompleted = onWarmupCompleted();
        if (viewOnWarmupCompleted != null) {
            this.onNavigationEvent.removeView(viewOnWarmupCompleted);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTitle(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        loadlambda0 loadlambda0Var = this.onExtraCallbackWithResult;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        String str = loadlambda0Var.getPrefix(context) + ((Object) charSequence);
        BaseTextView baseTextViewOnNavigationEvent = onNavigationEvent();
        if (baseTextViewOnNavigationEvent == null) {
            IAuthTabCallbackStub().setText(str);
            return;
        }
        int i2 = IAuthTabCallbackStub + 35;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            baseTextViewOnNavigationEvent.setText(str);
            int i3 = 25 / 0;
        } else {
            baseTextViewOnNavigationEvent.setText(str);
        }
        int i4 = onTransact + 85;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TdsAgreementV3ColumnView tdsAgreementV3ColumnView = (TdsAgreementV3ColumnView) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        tdsAgreementV3ColumnView.setChecked(!tdsAgreementV3ColumnView.onExtraCallback());
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final TdsCheckBoxV2View asBinder() {
        int iOnNavigationEvent;
        DisplayMetrics displayMetrics;
        int i;
        DisplayMetrics displayMetrics2;
        int i2;
        DisplayMetrics displayMetrics3;
        int i3;
        int i4 = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        View tdsCheckBoxV2View = new TdsCheckBoxV2View(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsCheckBoxV2View.setId(im.toss.uikit.R.id.tds_agreement_v3_column_check_box);
        float fIAuthTabCallback = IAuthTabCallback();
        DisplayMetrics displayMetrics4 = tdsCheckBoxV2View.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        Object[] objArr = {Float.valueOf(fIAuthTabCallback), displayMetrics4};
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        float fFloatValue = ((Float) varyMatches.onNavigationEvent(1845166571, -1845166568, objArr, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback)).floatValue();
        if (Float.MAX_VALUE <= fFloatValue && fFloatValue <= 41.0f) {
            int i5 = IAuthTabCallbackStub + 43;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                displayMetrics3 = tdsCheckBoxV2View.getContext().getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
                i3 = 82;
            } else {
                displayMetrics3 = tdsCheckBoxV2View.getContext().getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
                i3 = 42;
            }
            iOnNavigationEvent = varyMatches.onNavigationEvent(Integer.valueOf(i3), displayMetrics3);
        } else if (35.0f <= fFloatValue && fFloatValue <= 41.0f) {
            int i6 = onTransact + 45;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                displayMetrics2 = tdsCheckBoxV2View.getContext().getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                i2 = 109;
            } else {
                displayMetrics2 = tdsCheckBoxV2View.getContext().getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                i2 = 38;
            }
            iOnNavigationEvent = varyMatches.onNavigationEvent(Integer.valueOf(i2), displayMetrics2);
        } else if (29.0f <= fFloatValue) {
            int i7 = onTransact + 57;
            int i8 = i7 % 128;
            IAuthTabCallbackStub = i8;
            int i9 = i7 % 2;
            if (fFloatValue <= 35.0f) {
                int i10 = i8 + 55;
                onTransact = i10 % 128;
                if (i10 % 2 == 0) {
                    displayMetrics = tdsCheckBoxV2View.getContext().getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                    i = 113;
                } else {
                    displayMetrics = tdsCheckBoxV2View.getContext().getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                    i = 34;
                }
                iOnNavigationEvent = varyMatches.onNavigationEvent(Integer.valueOf(i), displayMetrics);
            } else if (23.0f <= fFloatValue && fFloatValue <= 29.0f) {
                int i11 = IAuthTabCallbackStub + 93;
                onTransact = i11 % 128;
                int i12 = i11 % 2;
                DisplayMetrics displayMetrics5 = tdsCheckBoxV2View.getContext().getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
                iOnNavigationEvent = varyMatches.onNavigationEvent(32, displayMetrics5);
            } else if (19.0f <= fFloatValue && fFloatValue <= 23.0f) {
                DisplayMetrics displayMetrics6 = tdsCheckBoxV2View.getContext().getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
                iOnNavigationEvent = varyMatches.onNavigationEvent(28, displayMetrics6);
            } else if (16.0f > fFloatValue || fFloatValue > 19.0f) {
                DisplayMetrics displayMetrics7 = tdsCheckBoxV2View.getContext().getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
                iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics7);
            } else {
                DisplayMetrics displayMetrics8 = tdsCheckBoxV2View.getContext().getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics8, "");
                iOnNavigationEvent = varyMatches.onNavigationEvent(26, displayMetrics8);
            }
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(iOnNavigationEvent, iOnNavigationEvent);
        DisplayMetrics displayMetrics9 = tdsCheckBoxV2View.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics9, "");
        marginLayoutParams.setMarginEnd(varyMatches.onNavigationEvent(Float.valueOf(8.0f), displayMetrics9));
        tdsCheckBoxV2View.setLayoutParams(marginLayoutParams);
        tdsCheckBoxV2View.setType(TdsCheckBoxV2View.onNavigationEvent.LINE);
        this.onNavigationEvent.addView(tdsCheckBoxV2View, 0);
        return tdsCheckBoxV2View;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final BaseTextView IAuthTabCallbackStub() {
        Typography4 typography6;
        int i = 2 % 2;
        Float fValueOf = Float.valueOf(16.0f);
        Float fValueOf2 = Float.valueOf(6.0f);
        int i2 = onWarmupCompleted.onExtraCallbackWithResult[this.onWarmupCompleted.ordinal()];
        if (i2 == 1) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Typography4 typography62 = new Typography6(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            Context context2 = typography62.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            typography62.setTextColor(new getUrlokhttp(new onExtraCallback(configuration)).ICustomTabsCallbackStubProxy());
            DisplayMetrics displayMetrics = typography62.getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(fValueOf2, displayMetrics);
            DisplayMetrics displayMetrics2 = typography62.getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            typography62.setPadding(typography62.getPaddingLeft(), iOnNavigationEvent, typography62.getPaddingRight(), varyMatches.onNavigationEvent(fValueOf2, displayMetrics2));
            int i3 = IAuthTabCallbackStub + 109;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            typography6 = typography62;
        } else if (i2 != 2) {
            int i5 = onTransact + 85;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            typography6 = new Typography4(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            typography6.onNavigationEvent(response.Bold);
            Context context4 = typography6.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration2 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            typography6.setTextColor(new getUrlokhttp(new onNavigationEvent(configuration2)).onRelationshipValidationResult());
            DisplayMetrics displayMetrics3 = typography6.getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            int iOnNavigationEvent2 = varyMatches.onNavigationEvent(fValueOf, displayMetrics3);
            DisplayMetrics displayMetrics4 = typography6.getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
            typography6.setPadding(typography6.getPaddingLeft(), iOnNavigationEvent2, typography6.getPaddingRight(), varyMatches.onNavigationEvent(fValueOf, displayMetrics4));
        } else {
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            typography6 = new Typography6(context5, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            typography6.onNavigationEvent(response.Bold);
            Context context6 = typography6.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            Configuration configuration3 = context6.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            typography6.setTextColor(new getUrlokhttp(new IAuthTabCallback(configuration3)).onRelationshipValidationResult());
            DisplayMetrics displayMetrics5 = typography6.getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
            int iOnNavigationEvent3 = varyMatches.onNavigationEvent(fValueOf2, displayMetrics5);
            DisplayMetrics displayMetrics6 = typography6.getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
            typography6.setPadding(typography6.getPaddingLeft(), iOnNavigationEvent3, typography6.getPaddingRight(), varyMatches.onNavigationEvent(fValueOf2, displayMetrics6));
        }
        typography6.setId(im.toss.uikit.R.id.tds_agreement_v3_column_title);
        typography6.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        typography6.setGravity(16);
        this.onNavigationEvent.addView(typography6);
        return typography6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BaseTextView onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextViewFindViewById = findViewById(im.toss.uikit.R.id.tds_agreement_v3_column_title);
        int i4 = onTransact + 77;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return baseTextViewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TdsCheckBoxV2View onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TdsCheckBoxV2View tdsCheckBoxV2ViewFindViewById = findViewById(im.toss.uikit.R.id.tds_agreement_v3_column_check_box);
        int i4 = onTransact + 15;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return tdsCheckBoxV2ViewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float IAuthTabCallback() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 13;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        BaseTextView baseTextViewOnNavigationEvent = onNavigationEvent();
        if (baseTextViewOnNavigationEvent != null) {
            int i5 = onTransact + 101;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                return baseTextViewOnNavigationEvent.getTextSize();
            }
            baseTextViewOnNavigationEvent.getTextSize();
            throw null;
        }
        int i6 = onWarmupCompleted.onExtraCallbackWithResult[this.onWarmupCompleted.ordinal()];
        if (i6 == 1 || i6 == 2) {
            int i7 = IAuthTabCallbackStub + 37;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            i = 15;
        } else {
            if (i6 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i9 = IAuthTabCallbackStub + 37;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
            i = 20;
        }
        return varyMatches.onTransact(this, Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        int i;
        int i2 = 2 % 2;
        super/*android.view.View*/.setOnClickListener(onClickListener);
        View view = this.IAuthTabCallback;
        if (onClickListener != null) {
            int i3 = IAuthTabCallbackStub + 77;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        int i5 = IAuthTabCallbackStub + 35;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        boolean zOnTouchEvent;
        int i = 2 % 2;
        int i2 = onTransact + 53;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            this.onExtraCallback.onNavigationEvent(motionEvent);
            zOnTouchEvent = super/*android.view.View*/.onTouchEvent(motionEvent);
            int i3 = 22 / 0;
        } else {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            this.onExtraCallback.onNavigationEvent(motionEvent);
            zOnTouchEvent = super/*android.view.View*/.onTouchEvent(motionEvent);
        }
        int i4 = onTransact + 37;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return zOnTouchEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPressed(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.setPressed(z);
        this.onExtraCallback.onNavigationEvent(z);
        int i4 = onTransact + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final AppLovinSdkSettings onNavigationEvent(TdsAgreementV3ColumnView tdsAgreementV3ColumnView, boolean z) {
        Object[] objArr = {tdsAgreementV3ColumnView, Boolean.valueOf(z)};
        return (AppLovinSdkSettings) IAuthTabCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 141856814, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -141856813, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr);
    }

    public final void onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        IAuthTabCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1504630141, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -1504630141, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{this});
    }
}
