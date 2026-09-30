package im.toss.features.credit.ui.plus.component;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import im.toss.features.credit.ui.plus.R;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AudioMatcher2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.checkType;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.readIntokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusIntroComponentSection extends FrameLayout implements checkType {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private final AudioMatcher2 onExtraCallback;
    private static char[] IAuthTabCallback = {32628, 32608, 32620, 32609, 32602, 32557, 32627, 32619, 32625, 32558, 32621, 32623, 32622, 32629, 32544, 32612, 32559, 32610, 32631, 32624, 32615, 32613};
    private static int onExtraCallbackWithResult = -1184334052;
    private static boolean onNavigationEvent = true;
    private static boolean onWarmupCompleted = true;

    /* JADX WARN: Illegal instructions before constructor call */
    public CreditPlusIntroComponentSection(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditPlusIntroComponentSection(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        AudioMatcher2 audioMatcher2OnWarmupCompleted = AudioMatcher2.onWarmupCompleted(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(audioMatcher2OnWarmupCompleted, "");
        this.onExtraCallback = audioMatcher2OnWarmupCompleted;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreditPlusIntroComponentSection(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = asInterface + 71;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 31 / 0;
            }
            int i4 = 2 % 2;
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    @Override // o.checkType
    public void IAuthTabCallback(boolean z, @NotNull Function0<Unit> function0) throws Throwable {
        String string;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        this.onExtraCallback.onWarmupCompleted.setVisibility(8);
        this.onExtraCallback.onExtraCallbackWithResult.setVisibility(0);
        TdsListRowV1View tdsListRowV1View = this.onExtraCallback.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        String string2 = getContext().getString(R.string.credit_ui_plus_intro_section2_list_row_1_center_1);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(new getUrlokhttp(new onNavigationEvent(configuration)).onRelationshipValidationResult());
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getContext().getString(R.string.credit_ui_plus_intro_section2_list_row_1_under_score_center_2_1));
        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) " ");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(new getUrlokhttp(new onWarmupCompleted(configuration2)).asBinder());
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) (z ? getContext().getString(R.string.credit_ui_plus_intro_section2_list_row_1_under_score_center_2_2) : getContext().getString(R.string.credit_ui_plus_free_trial_renewal_section_list_row_up_score)));
        spannableStringBuilder.setSpan(foregroundColorSpan2, length3, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        Unit unit = Unit.INSTANCE;
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-114, -115, -125, -118, -117, -115, -117, -116, -111, -125, -107, -111, -109, -108, -121, -110, -114, -111, -126, -120, -108, -109, -110, -119, -111, -115, -117, -119, -120, -122, -112, -113, -122, -114, -115, -125, -122, -124, -115, -117, -119, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 127 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        onExtraCallback(tdsListRowV1View, ((String) objArr[0]).intern(), string2, spannedString);
        TdsListRowV1View tdsListRowV1View2 = this.onExtraCallback.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View2, "");
        String string3 = getContext().getString(R.string.credit_ui_plus_free_trial_renewal_section_list_row_3_center_1);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        StyleSpan styleSpan2 = new StyleSpan(1);
        int length4 = spannableStringBuilder2.length();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration3 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(new getUrlokhttp(new onExtraCallback(configuration3)).onRelationshipValidationResult());
        int length5 = spannableStringBuilder2.length();
        spannableStringBuilder2.append((CharSequence) getContext().getString(R.string.credit_ui_plus_intro_section2_list_row_3_under_score_center_2_1));
        spannableStringBuilder2.setSpan(foregroundColorSpan3, length5, spannableStringBuilder2.length(), 17);
        spannableStringBuilder2.append((CharSequence) " ");
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        Configuration configuration4 = context4.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration4, "");
        ForegroundColorSpan foregroundColorSpan4 = new ForegroundColorSpan(new getUrlokhttp(new onExtraCallbackWithResult(configuration4)).asBinder());
        int length6 = spannableStringBuilder2.length();
        spannableStringBuilder2.append((CharSequence) (z ? getContext().getString(R.string.credit_ui_plus_intro_section2_list_row_3_under_score_center_2_2) : getContext().getString(R.string.credit_ui_plus_free_trial_renewal_section_list_row_up_score)));
        spannableStringBuilder2.setSpan(foregroundColorSpan4, length6, spannableStringBuilder2.length(), 17);
        spannableStringBuilder2.setSpan(styleSpan2, length4, spannableStringBuilder2.length(), 17);
        SpannedString spannedString2 = new SpannedString(spannableStringBuilder2);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-114, -115, -125, -118, -117, -115, -117, -116, -111, -125, -107, -111, -109, -108, -121, -110, -114, -111, -126, -120, -108, -109, -110, -119, -111, -115, -117, -119, -120, -122, -112, -113, -122, -114, -115, -125, -122, -124, -115, -117, -119, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
        onExtraCallback(tdsListRowV1View2, ((String) objArr2[0]).intern(), string3, spannedString2);
        TdsListRowV1View tdsListRowV1View3 = this.onExtraCallback.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View3, "");
        String string4 = getContext().getString(R.string.credit_ui_plus_intro_section2_list_row_2_center_1);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        StyleSpan styleSpan3 = new StyleSpan(1);
        int length7 = spannableStringBuilder3.length();
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        Configuration configuration5 = context5.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration5, "");
        ForegroundColorSpan foregroundColorSpan5 = new ForegroundColorSpan(new getUrlokhttp(new IAuthTabCallback(configuration5)).onRelationshipValidationResult());
        int length8 = spannableStringBuilder3.length();
        spannableStringBuilder3.append((CharSequence) getContext().getString(R.string.credit_ui_plus_intro_section2_list_row_2_center_2_1));
        spannableStringBuilder3.setSpan(foregroundColorSpan5, length8, spannableStringBuilder3.length(), 17);
        spannableStringBuilder3.append((CharSequence) " ");
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        Configuration configuration6 = context6.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration6, "");
        ForegroundColorSpan foregroundColorSpan6 = new ForegroundColorSpan(new getUrlokhttp(new IAuthTabCallbackDefault(configuration6)).ICustomTabsServiceStubProxy());
        int length9 = spannableStringBuilder3.length();
        if (!z) {
            string = getContext().getString(R.string.credit_ui_plus_free_trial_renewal_section_list_row_2_center_2_2);
        } else {
            int i2 = asInterface + 43;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            string = getContext().getString(R.string.credit_ui_plus_intro_section2_list_row_2_center_2_2);
            int i4 = asInterface + 105;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 5;
            }
        }
        spannableStringBuilder3.append((CharSequence) string);
        spannableStringBuilder3.setSpan(foregroundColorSpan6, length9, spannableStringBuilder3.length(), 17);
        spannableStringBuilder3.setSpan(styleSpan3, length7, spannableStringBuilder3.length(), 17);
        SpannedString spannedString3 = new SpannedString(spannableStringBuilder3);
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-114, -115, -125, -118, -117, -115, -117, -116, -111, -115, -106, -117, -108, -111, -109, -108, -121, -110, -114, -111, -126, -120, -108, -109, -110, -119, -111, -115, -117, -119, -120, -122, -112, -113, -122, -114, -115, -125, -122, -124, -115, -117, -119, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 127 - View.resolveSizeAndState(0, 0, 0), objArr3);
        onExtraCallback(tdsListRowV1View3, ((String) objArr3[0]).intern(), string4, spannedString3);
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = onWarmupCompleted + 85;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            throw null;
        }
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
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
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallbackWithResult) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallbackWithResult) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = im.toss.features.credit.ui.plus.component.CreditPlusIntroComponentSection.IAuthTabCallbackDefault.IAuthTabCallback + 23;
            im.toss.features.credit.ui.plus.component.CreditPlusIntroComponentSection.IAuthTabCallbackDefault.onWarmupCompleted = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 44 / 0;
            }
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i4 % 128;
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

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onNavigationEvent(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = onWarmupCompleted + 95;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            readIntokhttp.onExtraCallback(this.onNavigationEvent);
            throw null;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onWarmupCompleted(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onExtraCallback + 31;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onWarmupCompleted + 97;
            onExtraCallback = i4 % 128;
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

    private final void onExtraCallback(TdsListRowV1View tdsListRowV1View, String str, String str2, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        tdsListRowV1View.setLeftImage(str);
        tdsListRowV1View.setLeftImageSize(varyMatches.IAuthTabCallback(tdsListRowV1View, 24), varyMatches.IAuthTabCallback(tdsListRowV1View, 24));
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2D);
        tdsListRowV1View.setCenterText1(str2);
        tdsListRowV1View.setCenterText2(charSequence);
        tdsListRowV1View.setRightArrow(false);
        int i4 = asBinder + 73;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallback;
        char c = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 77, TextUtils.lastIndexOf("", c, 0, 0) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 75 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-16761179) - Color.rgb(0, 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i5 = 1052772399;
        if (onWarmupCompleted) {
            int i6 = $11 + 85;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getTapTimeout() >> 16) + 63, 12213 - TextUtils.lastIndexOf("", '0', 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i5 = 1052772399;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (onNavigationEvent) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (Process.myPid() >> 22) + 63, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i8 = $10 + 63;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] << iIntValue);
                i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted - 1;
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
            }
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
        }
        objArr[0] = new String(cArr6);
    }
}
