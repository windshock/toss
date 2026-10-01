package im.toss.features.credit.ui.plus.intro.component;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.features.credit.ui.plus.R;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ArchiveMatcher5;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.getAdService;
import o.getMinWebSocketMessageToCompressokhttp;
import o.getSpecialFeatureOptInStatus;
import o.getSupportedHighSpeedResolutionsFor;
import o.getUrlokhttp;
import o.isRepeatingEnabled;
import o.readIntokhttp;
import o.response;
import o.updateFileSpaceCache;
import o.varyMatches;
import o.zzck;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusIntroComponentSection1 extends FrameLayout implements updateFileSpaceCache {
    private final ArchiveMatcher5 IAuthTabCallback;
    private static final byte[] $$a = {5, -4, -80, 1};
    private static final int $$b = 210;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onTransact = 1;
    private static long onWarmupCompleted = 7798559133331975163L;
    private static int onExtraCallbackWithResult = -1776194565;
    private static char onNavigationEvent = 60402;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        byte[] bArr = $$a;
        int i3 = s * 2;
        int i4 = b + 109;
        int i5 = i + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i4 = (-i4) + i5;
            i5 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            int i8 = i5 + 1;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i8];
            i5 = i4;
            i4 = b2;
            i7 = i2 + 1;
            i6 = i8;
            i4 = (-i4) + i5;
            i5 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            int i82 = i5 + 1;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            int i822 = i5 + 1;
            if (i2 == i3) {
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CreditPlusIntroComponentSection1(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditPlusIntroComponentSection1(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        ArchiveMatcher5 archiveMatcher5IAuthTabCallback = ArchiveMatcher5.IAuthTabCallback(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(archiveMatcher5IAuthTabCallback, "");
        this.IAuthTabCallback = archiveMatcher5IAuthTabCallback;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreditPlusIntroComponentSection1(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onExtraCallback;
            int i3 = i2 + 59;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 109;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 3;
            } else {
                int i7 = 2 % 2;
            }
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    @Override // o.updateFileSpaceCache
    public /* bridge */ void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onWarmupCompleted();
        int i4 = onExtraCallback + 29;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                int i6 = 11 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onExtraCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                if (!(!readIntokhttp.onExtraCallback(this.onWarmupCompleted))) {
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                    int i3 = onNavigationEvent + 45;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return getspecialfeatureoptinstatus;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
                int i5 = onNavigationEvent + 101;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return getspecialfeatureoptinstatus2;
            }
            readIntokhttp.onExtraCallback(this.onWarmupCompleted);
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onExtraCallback + 61;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.IAuthTabCallback);
            throw null;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallback;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onExtraCallbackWithResult + 17;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                return getspecialfeatureoptinstatus2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.features.credit.ui.plus.intro.component.CreditPlusIntroComponentSection1.onWarmupCompleted.onWarmupCompleted + 83;
            im.toss.features.credit.ui.plus.intro.component.CreditPlusIntroComponentSection1.onWarmupCompleted.onExtraCallbackWithResult = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallback) != false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 11 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // o.updateFileSpaceCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNavigationEvent(int i, int i2, @NotNull Function0<Unit> function0) throws Throwable {
        boolean z;
        int i3 = 2 % 2;
        int i4 = onTransact + 43;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        if (i2 <= 990) {
            int i6 = onTransact + 101;
            onExtraCallback = i6 % 128;
            z = i6 % 2 == 0;
        }
        String string = getContext().getString(z ? R.string.credit_ui_plus_intro_section1_under_score_top_title : R.string.credit_ui_plus_intro_section1_top_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsTopV2View tdsTopV2View = this.IAuthTabCallback.onTransact;
        tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        tdsTopV2View.setTitleText(string);
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        tdsTopV2View.onWarmupCompleted("order", Integer.valueOf(i));
        tdsTopV2View.setSubtitle1Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
        tdsTopV2View.setSubtitle1TextSize(TdsTopV2View.onWarmupCompleted.SIZE_17);
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpOnWarmupCompleted = tdsTopV2View.onWarmupCompleted();
        if (getminwebsocketmessagetocompressokhttpOnWarmupCompleted != null) {
            int i7 = onTransact + 99;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnExtraCallbackWithResult = getminwebsocketmessagetocompressokhttpOnWarmupCompleted.onExtraCallbackWithResult();
            if (getsupportedhighspeedresolutionsforOnExtraCallbackWithResult != null) {
                int i9 = onTransact + 45;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    getsupportedhighspeedresolutionsforOnExtraCallbackWithResult.IAuthTabCallback(isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult());
                    int i10 = 99 / 0;
                } else {
                    getsupportedhighspeedresolutionsforOnExtraCallbackWithResult.IAuthTabCallback(isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult());
                }
            }
        }
        Context context = tdsTopV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsTopV2View.setSubtitle1TextColor(new getUrlokhttp(new IAuthTabCallback(configuration)).asBinder());
        String string2 = tdsTopV2View.getContext().getString(R.string.credit_plus_title);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        tdsTopV2View.setSubtitle1Text(string2);
        LottieAnimationView lottieAnimationView = this.IAuthTabCallback.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        Object[] objArr = new Object[1];
        a((char) View.MeasureSpec.getSize(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, new char[]{62362, 42533, 21267, 64584, 11098, 55242, 4020, 53915, 15155, 4837, 11303, 4246, 20653, 3186, 17284, 63047, 45564, 37998, 59865, 19069, 55620, 43982, 26961, 30800, 29688, 1964, 5921, 55602, 14474, 46403, 32327, 2706, 57952, 11323, 15383, 2628, 28950, 16211, 5135, 44619, 19476, 51146, 29144, 20174, 15207, 10378, 44680, 19858, 51696, 19072}, new char[]{0, 0, 0, 0}, new char[]{3372, 54003, 10856, 57682}, objArr);
        zzck.onWarmupCompleted(-59676451, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 59676451, new Object[]{lottieAnimationView, ((String) objArr[0]).intern(), true, 0L, 1, null, null, 52, null}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
        TdsListRowV1View tdsListRowV1View = this.IAuthTabCallback.onExtraCallback;
        TdsListRowV1View.asInterface asinterface = TdsListRowV1View.asInterface.IMAGE;
        tdsListRowV1View.setLeftType(asinterface);
        Object[] objArr2 = new Object[1];
        a((char) ((-16777216) - Color.rgb(0, 0, 0)), 563104707 + (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{31276, 25798, 49868, 57740, 62288, 38787, 33049, 23728, 7200, 64434, 58575, 17764, 32225, 55259, 8564, 11744, 28157, 19609, 39345, 24260, 47297, 31165, 19740, 6611, 8138, 60672, 50405, 2204, 42312, 37112, 15981, 25864, 4933, 54177, 11430, 57145, 51117, 56715, 50507, 29823, 2125, 50172, 31842, 49734, 26750, 2013, 22582, 7258, 22140}, new char[]{0, 0, 0, 0}, new char[]{50069, 36939, 23329, 38634}, objArr2);
        tdsListRowV1View.setLeftImage(((String) objArr2[0]).intern());
        tdsListRowV1View.setLeftImageSize(varyMatches.IAuthTabCallback(tdsListRowV1View, 24), varyMatches.IAuthTabCallback(tdsListRowV1View, 24));
        TdsListRowV1View.onExtraCallbackWithResult onextracallbackwithresult = TdsListRowV1View.onExtraCallbackWithResult.ROW2D;
        tdsListRowV1View.setCenterType(onextracallbackwithresult);
        tdsListRowV1View.setCenterText1(tdsListRowV1View.getContext().getString(R.string.credit_ui_plus_intro_section1_list_row_1_center_1));
        tdsListRowV1View.setCenterText2(tdsListRowV1View.getContext().getString(R.string.credit_ui_plus_intro_section1_list_row_1_center_2));
        Configuration configuration2 = tdsListRowV1View.getContext().getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        tdsListRowV1View.setCenterText1Color(new getUrlokhttp(new onExtraCallbackWithResult(configuration2)).onPostMessage());
        Configuration configuration3 = tdsListRowV1View.getContext().getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        tdsListRowV1View.setCenterText2Color(new getUrlokhttp(new onExtraCallback(configuration3)).ICustomTabsCallbackStubProxy());
        BaseTextView baseTextViewICustomTabsCallbackStubProxy = tdsListRowV1View.ICustomTabsCallbackStubProxy();
        if (baseTextViewICustomTabsCallbackStubProxy != null) {
            baseTextViewICustomTabsCallbackStubProxy.onNavigationEvent(response.Bold);
            int i11 = onExtraCallback + 39;
            onTransact = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 3 % 2;
            }
        }
        TdsListRowV1View tdsListRowV1View2 = this.IAuthTabCallback.onWarmupCompleted;
        tdsListRowV1View2.setLeftType(asinterface);
        Object[] objArr3 = new Object[1];
        a((char) (TextUtils.getCapsMode("", 0, 0) + 12323), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 982447705, new char[]{52119, 17342, 58848, 5958, 14145, 32719, 8905, 50313, 19564, 55897, 14208, 23186, 13346, 22025, 55224, 151, 63641, 26836, 64970, 50815, 49898, 28323, 23102, 57700, 63263, 29967, 13499, 21457, 48212, 49807, 36011, 10842, 63272, 9349, 47182, 33073, 64293, 23388, 7215, 17987, 7499, 1312, 40239, 56473, 7237, 8884, 18885, 22662, 45681, 17576, 24535, 46442, 56509, 22569, 5049}, new char[]{0, 0, 0, 0}, new char[]{23235, 36598, 9018, 53552}, objArr3);
        tdsListRowV1View2.setLeftImage(((String) objArr3[0]).intern());
        tdsListRowV1View2.setLeftImageSize(varyMatches.IAuthTabCallback(tdsListRowV1View2, 24), varyMatches.IAuthTabCallback(tdsListRowV1View2, 24));
        tdsListRowV1View2.setCenterType(onextracallbackwithresult);
        tdsListRowV1View2.setCenterText1(tdsListRowV1View2.getContext().getString(R.string.credit_ui_plus_intro_section1_list_row_2_center_1));
        tdsListRowV1View2.setCenterText2(tdsListRowV1View2.getContext().getString(R.string.credit_ui_plus_intro_section1_list_row_2_center_2));
        Configuration configuration4 = tdsListRowV1View2.getContext().getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration4, "");
        tdsListRowV1View2.setCenterText1Color(new getUrlokhttp(new onNavigationEvent(configuration4)).onPostMessage());
        Configuration configuration5 = tdsListRowV1View2.getContext().getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration5, "");
        tdsListRowV1View2.setCenterText2Color(new getUrlokhttp(new onWarmupCompleted(configuration5)).ICustomTabsCallbackStubProxy());
        BaseTextView baseTextViewICustomTabsCallbackStubProxy2 = tdsListRowV1View2.ICustomTabsCallbackStubProxy();
        if (baseTextViewICustomTabsCallbackStubProxy2 != null) {
            baseTextViewICustomTabsCallbackStubProxy2.onNavigationEvent(response.Bold);
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 43;
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1451;
                    byte b = $$a[3];
                    byte b2 = (byte) (-b);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, iResolveSizeAndState, maximumDrawingCacheSize, 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char cBlue = (char) (Color.blue(0) + 49123);
                    int i3 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43;
                    int i4 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1493;
                    byte b3 = $$a[3];
                    byte b4 = (byte) (-b3);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cBlue, i3, i4, 1533236389, false, $$c((byte) (b3 - 1), b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23971), 50 - (ViewConfiguration.getLongPressTimeout() >> 16), Color.red(0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 45849), View.combineMeasuredStates(0, 0) + 29, 12578 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i5 = $11 + 99;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i7 = $11 + 9;
        $10 = i7 % 128;
        if (i7 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i8 = 79 / 0;
            objArr[0] = str;
        }
    }
}
