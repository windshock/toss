package im.toss.features.cardissue.event.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.TossApplication;
import im.toss.features.cardissue.R;
import im.toss.features.cardissue.event.view.CardIssueFaqView$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography10;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinSdkSettings;
import o.DisplayMetricsCompat;
import o.M_;
import o.deprecated_certificatePinner;
import o.deprecated_minFreshSeconds;
import o.getAdService;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getExtraParameters;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.head;
import o.isFireOS;
import o.isMuted;
import o.isOneShot;
import o.noStore;
import o.pxToDp;
import o.readIntokhttp;
import o.response;
import o.runOnUiThreadDelayed;
import o.setHasUserConsent;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CardIssueFaqView extends LinearLayout {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private runOnUiThreadDelayed IAuthTabCallback;
    private final head IAuthTabCallbackDefault;
    private float asInterface;
    private final DisplayMetricsCompat onExtraCallback;
    private runOnUiThreadDelayed onExtraCallbackWithResult;
    private Function0<Unit> onNavigationEvent;
    private Function1<? super Boolean, Unit> onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardIssueFaqView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardIssueFaqView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CardIssueFaqView cardIssueFaqView = (CardIssueFaqView) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 37;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder(cardIssueFaqView);
        }
        asBinder(cardIssueFaqView);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CardIssueFaqView cardIssueFaqView) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(cardIssueFaqView);
        int i4 = IAuthTabCallbackStub + 35;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueFaqView cardIssueFaqView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cardIssueFaqView);
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueFaqView cardIssueFaqView, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(f);
        if (i3 != 0) {
            int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
            int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
            int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback4 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback5 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback6 = TossApplication.onSessionEnded.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback6, -1880219201, new Object[]{cardIssueFaqView, fValueOf}, iOnExtraCallback4, 1880219204, iOnExtraCallback5);
        int i4 = IAuthTabCallbackStub + 19;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardIssueFaqView cardIssueFaqView, float f) {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cardIssueFaqView, f);
        int i4 = IAuthTabCallbackStub + 121;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onNavigationEvent(CardIssueFaqView cardIssueFaqView, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(cardIssueFaqView, view, motionEvent);
        int i4 = IAuthTabCallbackStub + 89;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = (~(i8 | i4)) | i7;
        int i10 = ~i4;
        int i11 = ~(i8 | i10 | i3);
        int i12 = (~(i4 | i7)) | i8 | (~(i10 | i3));
        int i13 = i3 + i5 + i6 + (325770565 * i2) + ((-1284996642) * i);
        int i14 = i13 * i13;
        int i15 = ((789042555 * i3) - 1205338112) + ((-1364710777) * i5) + (i9 * 1076876666) + (1076876666 * i11) + ((-1076876666) * i12) + ((-287834112) * i6) + ((-667418624) * i2) + ((-145752064) * i) + (1116340224 * i14);
        int i16 = (i3 * (-1991011123)) + 595473426 + (i5 * (-1991009311)) + (i9 * (-906)) + (i11 * (-906)) + (i12 * 906) + (i6 * (-1991010217)) + (i2 * (-1223611789)) + (i * (-291900814)) + (i14 * (-1931083776));
        int i17 = i15 + (i16 * i16 * (-1558839296));
        if (i17 == 1) {
            CardIssueFaqView cardIssueFaqView = (CardIssueFaqView) objArr[0];
            int i18 = 2 % 2;
            int i19 = IAuthTabCallbackStub + 115;
            asBinder = i19 % 128;
            int i20 = i19 % 2;
            Unit unitAsInterface = asInterface(cardIssueFaqView);
            int i21 = asBinder + 31;
            IAuthTabCallbackStub = i21 % 128;
            int i22 = i21 % 2;
            return unitAsInterface;
        }
        if (i17 == 2) {
            return onExtraCallback(objArr);
        }
        if (i17 != 3) {
            return onWarmupCompleted(objArr);
        }
        CardIssueFaqView cardIssueFaqView2 = (CardIssueFaqView) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i23 = 2 % 2;
        Context context = cardIssueFaqView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iOnActivityResized = new getUrlokhttp(new IAuthTabCallbackStub(configuration)).onActivityResized();
        Context context2 = cardIssueFaqView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        cardIssueFaqView2.onExtraCallback.onNavigationEvent.setImageTintList(ColorStateList.valueOf(new setHasUserConsent(iOnActivityResized, new getUrlokhttp(new asBinder(configuration2)).asBinder()).IAuthTabCallback(fFloatValue).intValue()));
        Unit unit = Unit.INSTANCE;
        int i24 = IAuthTabCallbackStub + 121;
        asBinder = i24 % 128;
        int i25 = i24 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CardIssueFaqView cardIssueFaqView = (CardIssueFaqView) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(cardIssueFaqView, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = asBinder + 51;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted(CardIssueFaqView cardIssueFaqView, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(cardIssueFaqView, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = IAuthTabCallback(cardIssueFaqView, z);
        int i3 = IAuthTabCallbackStub + 25;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return appLovinSdkSettingsIAuthTabCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardIssueFaqView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        LayoutInflater.from(context).inflate(R.layout.card_issue_event_faq_view, (ViewGroup) this, true);
        DisplayMetricsCompat displayMetricsCompatOnWarmupCompleted = DisplayMetricsCompat.onWarmupCompleted(this);
        Intrinsics.checkNotNullExpressionValue(displayMetricsCompatOnWarmupCompleted, "");
        this.onExtraCallback = displayMetricsCompatOnWarmupCompleted;
        LinearLayout linearLayout = displayMetricsCompatOnWarmupCompleted.onExtraCallbackWithResult;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Resources resources = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        linearLayout.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new IAuthTabCallbackDefault(configuration)).onExtraCallbackWithResult());
        displayMetricsCompatOnWarmupCompleted.IAuthTabCallback.setOnClickListener(new CardIssueFaqView$.ExternalSyntheticLambda3(this));
        LinearLayout linearLayout2 = displayMetricsCompatOnWarmupCompleted.IAuthTabCallback;
        M_ m_ = M_.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        linearLayout2.setBackground((deprecated_minFreshSeconds) M_.onNavigationEvent(-556734050, new Object[]{m_, context, Float.valueOf(varyMatches.onNavigationEvent(12, r3))}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 556734051, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent()));
        LinearLayout linearLayout3 = displayMetricsCompatOnWarmupCompleted.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
        LinearLayout linearLayout4 = displayMetricsCompatOnWarmupCompleted.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
        this.IAuthTabCallbackDefault = new head(linearLayout3, linearLayout4, true, new CardIssueFaqView$.ExternalSyntheticLambda4(this));
        displayMetricsCompatOnWarmupCompleted.IAuthTabCallback.setOnTouchListener(new CardIssueFaqView$.ExternalSyntheticLambda5(this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CardIssueFaqView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallbackStub + 75;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = asBinder + 103;
            IAuthTabCallbackStub = i5 % 128;
            i = i5 % 2 == 0 ? 1 : 0;
            int i6 = 2 % 2;
        }
        this(context, attributeSet, i);
    }

    private static final void onWarmupCompleted(CardIssueFaqView cardIssueFaqView, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean z = !view.isSelected();
        Function1<? super Boolean, Unit> function1 = cardIssueFaqView.onWarmupCompleted;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        cardIssueFaqView.onNavigationEvent(z);
        int i4 = asBinder + 73;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final AppLovinSdkSettings IAuthTabCallback(CardIssueFaqView cardIssueFaqView, boolean z) {
        float f;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{!z ? deprecated_certificatepinner.onNavigationEvent() : deprecated_certificatepinner.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        float scaleX = cardIssueFaqView.onExtraCallback.IAuthTabCallback.getScaleX();
        if (z) {
            int i4 = IAuthTabCallbackStub + 109;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            f = 0.96f;
        } else {
            f = 1.0f;
        }
        return isMuted.asBinder(appLovinSdkSettings, Float.valueOf(scaleX), Float.valueOf(f), (Function1) null, 4, (Object) null);
    }

    private static final boolean onExtraCallback(CardIssueFaqView cardIssueFaqView, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        head headVar = cardIssueFaqView.IAuthTabCallbackDefault;
        Intrinsics.checkNotNull(motionEvent);
        headVar.onNavigationEvent(motionEvent);
        int i4 = IAuthTabCallbackStub + 123;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                    int i3 = IAuthTabCallback + 55;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return getspecialfeatureoptinstatus;
                }
                int i5 = IAuthTabCallback + 17;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
                if (i6 == 0) {
                    int i7 = 49 / 0;
                }
                return getspecialfeatureoptinstatus2;
            }
            readIntokhttp.onExtraCallback(this.onWarmupCompleted);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onNavigationEvent + 1;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asBinder implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallback;

        public asBinder(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = IAuthTabCallback + 93;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            throw null;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.onExtraCallback)) != true) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallback) != true) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.features.cardissue.event.view.CardIssueFaqView.onExtraCallback.IAuthTabCallback + 23;
            im.toss.features.cardissue.event.view.CardIssueFaqView.onExtraCallback.onExtraCallbackWithResult = r2 % 128;
            r2 = r2 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 38 / 0;
            }
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                int i2 = IAuthTabCallback + 125;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i3 != 0) {
                    int i4 = 84 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
            int i5 = IAuthTabCallback + 87;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onNavigationEvent(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onNavigationEvent + 23;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
        }
    }

    public static final class onTransact implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallback;

        public onTransact(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            if ((r2 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.onExtraCallback)) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallback) != true) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.features.cardissue.event.view.CardIssueFaqView.onTransact.onNavigationEvent + 117;
            im.toss.features.cardissue.event.view.CardIssueFaqView.onTransact.onExtraCallbackWithResult = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 24 / 0;
            }
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.features.cardissue.event.view.CardIssueFaqView.onWarmupCompleted.onNavigationEvent + 119;
            im.toss.features.cardissue.event.view.CardIssueFaqView.onWarmupCompleted.onExtraCallback = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        
            if ((r2 % 2) == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallbackWithResult) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallbackWithResult) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r1 = im.toss.features.cardissue.event.view.CardIssueFaqView.onWarmupCompleted.onExtraCallback + 117;
            im.toss.features.cardissue.event.view.CardIssueFaqView.onWarmupCompleted.onNavigationEvent = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 20 / 0;
            }
        }
    }

    public final void setFaqTitle(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallback.onWarmupCompleted.setText(str);
        int i4 = asBinder + 123;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallbackWithResult(@NotNull View view) {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            this.onExtraCallback.onExtraCallbackWithResult.addView(view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        this.onExtraCallback.onExtraCallbackWithResult.addView(view);
        int i3 = asBinder + 97;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 89 / 0;
        }
    }

    private final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (z && !this.onExtraCallback.IAuthTabCallback.isSelected()) {
            int i4 = asBinder + 23;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            onExtraCallbackWithResult();
            DisplayMetricsCompat displayMetricsCompat = this.onExtraCallback;
            displayMetricsCompat.onExtraCallbackWithResult.measure(displayMetricsCompat.IAuthTabCallback().getWidth() + 1073741824, this.onExtraCallback.IAuthTabCallback().getHeight());
            this.asInterface = this.onExtraCallback.onExtraCallbackWithResult.getMeasuredHeight();
            isOneShot.onExtraCallbackWithResult(this, noStore.Companion.IAuthTabCallbackDefault());
            runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = onWarmupCompleted();
            this.IAuthTabCallback = runonuithreaddelayedOnWarmupCompleted;
            if (runonuithreaddelayedOnWarmupCompleted != null) {
                isFireOS.onExtraCallbackWithResult(runonuithreaddelayedOnWarmupCompleted, false, 1, (Object) null);
                int i6 = asBinder + 25;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            return;
        }
        if (!(!z)) {
            return;
        }
        int i8 = IAuthTabCallbackStub + 107;
        asBinder = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 83 / 0;
            if (!this.onExtraCallback.IAuthTabCallback.isSelected()) {
                return;
            }
        } else if (!this.onExtraCallback.IAuthTabCallback.isSelected()) {
            return;
        }
        onExtraCallbackWithResult();
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallback = IAuthTabCallback();
        this.onExtraCallbackWithResult = runonuithreaddelayedIAuthTabCallback;
        if (runonuithreaddelayedIAuthTabCallback != null) {
            isFireOS.onExtraCallbackWithResult(runonuithreaddelayedIAuthTabCallback, false, 1, (Object) null);
        }
    }

    public final void setOnOpenClickListener(@NotNull Function1<? super Boolean, Unit> function1) {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        this.onWarmupCompleted = function1;
        int i4 = asBinder + 51;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setOnExpandRallyFinishListener(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        this.onNavigationEvent = function0;
        int i4 = asBinder + 7;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = this.IAuthTabCallback;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
        }
        runOnUiThreadDelayed runonuithreaddelayed2 = this.onExtraCallbackWithResult;
        if (runonuithreaddelayed2 != null) {
            int i2 = IAuthTabCallbackStub + 87;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            runonuithreaddelayed2.onNavigationEvent();
            int i4 = asBinder + 7;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit asInterface(CardIssueFaqView cardIssueFaqView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        cardIssueFaqView.onExtraCallback.onExtraCallbackWithResult.setVisibility(0);
        cardIssueFaqView.onExtraCallback.IAuthTabCallback.setSelected(true);
        cardIssueFaqView.onExtraCallback.onWarmupCompleted.onNavigationEvent(response.SemiBold);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 33;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final runOnUiThreadDelayed onWarmupCompleted() {
        int i = 2 % 2;
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        SubTypography10 subTypography10 = this.onExtraCallback.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(subTypography10, "");
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iOnUnminimized = new getUrlokhttp(new IAuthTabCallback(configuration)).onUnminimized();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{subTypography10, isMuted.IAuthTabCallback(appLovinSdkSettings, Integer.valueOf(iOnUnminimized), Integer.valueOf(new getUrlokhttp(new onTransact(configuration2)).asBinder()), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsImageView tdsImageView = this.onExtraCallback.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView, isMuted.onWarmupCompleted((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(90.0f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsImageView tdsImageView2 = this.onExtraCallback.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        Rally rally3 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView2, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(0.0f), Float.valueOf(1.0f), new CardIssueFaqView$.ExternalSyntheticLambda0(this), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        LinearLayout linearLayout = this.onExtraCallback.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        Float fValueOf = Float.valueOf(0.0f);
        Rally rally4 = (Rally) RallysKt.onWarmupCompleted(new Object[]{linearLayout, isMuted.onNavigationEvent(appLovinSdkSettings2, fValueOf, Float.valueOf(1.0f), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        LinearLayout linearLayout2 = this.onExtraCallback.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rally, rally2, rally3, rally4, (Rally) RallysKt.onWarmupCompleted(new Object[]{linearLayout2, isMuted.onExtraCallbackWithResult((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), fValueOf, Float.valueOf(this.asInterface), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null);
        runOnUiThreadDelayed.IAuthTabCallbackDefault(runonuithreaddelayedOnWarmupCompleted, (Object) null, new CardIssueFaqView$.ExternalSyntheticLambda1(this), 1, (Object) null);
        runOnUiThreadDelayed.onWarmupCompleted(runonuithreaddelayedOnWarmupCompleted, (Object) null, new CardIssueFaqView$.ExternalSyntheticLambda2(this), 1, (Object) null);
        int i2 = IAuthTabCallbackStub + 121;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return runonuithreaddelayedOnWarmupCompleted;
    }

    private static final Unit IAuthTabCallbackDefault(CardIssueFaqView cardIssueFaqView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 93;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Function0<Unit> function0 = cardIssueFaqView.onNavigationEvent;
        if (function0 != null) {
            int i5 = i2 + 95;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            function0.invoke();
            int i7 = asBinder + 55;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i9 = asBinder + 35;
        IAuthTabCallbackStub = i9 % 128;
        if (i9 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(CardIssueFaqView cardIssueFaqView, float f) {
        int i = 2 % 2;
        Context context = cardIssueFaqView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iAsBinder = new getUrlokhttp(new onExtraCallback(configuration)).asBinder();
        Context context2 = cardIssueFaqView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        cardIssueFaqView.onExtraCallback.onNavigationEvent.setImageTintList(ColorStateList.valueOf(new setHasUserConsent(iAsBinder, new getUrlokhttp(new onExtraCallbackWithResult(configuration2)).onActivityResized()).IAuthTabCallback(f).intValue()));
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 7;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 54 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(CardIssueFaqView cardIssueFaqView) {
        LinearLayout linearLayout;
        boolean z;
        int i = 2 % 2;
        int i2 = asBinder + 113;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            linearLayout = cardIssueFaqView.onExtraCallback.IAuthTabCallback;
            z = true;
        } else {
            linearLayout = cardIssueFaqView.onExtraCallback.IAuthTabCallback;
            z = false;
        }
        linearLayout.setSelected(z);
        cardIssueFaqView.onExtraCallback.onWarmupCompleted.onNavigationEvent(response.Regular);
        Unit unit = Unit.INSTANCE;
        int i3 = asBinder + 115;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private final runOnUiThreadDelayed IAuthTabCallback() {
        int i = 2 % 2;
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        SubTypography10 subTypography10 = this.onExtraCallback.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(subTypography10, "");
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iAsBinder = new getUrlokhttp(new onNavigationEvent(configuration)).asBinder();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{subTypography10, isMuted.IAuthTabCallback(appLovinSdkSettings, Integer.valueOf(iAsBinder), Integer.valueOf(new getUrlokhttp(new onWarmupCompleted(configuration2)).onUnminimized()), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsImageView tdsImageView = this.onExtraCallback.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        Float fValueOf = Float.valueOf(0.0f);
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView, isMuted.onWarmupCompleted(appLovinSdkSettings2, Float.valueOf(90.0f), fValueOf, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsImageView tdsImageView2 = this.onExtraCallback.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        Rally rally3 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView2, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(0.0f), Float.valueOf(1.0f), new CardIssueFaqView$.ExternalSyntheticLambda6(this), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        LinearLayout linearLayout = this.onExtraCallback.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        Rally rally4 = (Rally) RallysKt.onWarmupCompleted(new Object[]{linearLayout, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(1.0f), fValueOf, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        LinearLayout linearLayout2 = this.onExtraCallback.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rally, rally2, rally3, rally4, (Rally) RallysKt.onWarmupCompleted(new Object[]{linearLayout2, isMuted.onExtraCallbackWithResult((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(this.onExtraCallback.onExtraCallbackWithResult.getHeight()), fValueOf, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null);
        runOnUiThreadDelayed.IAuthTabCallbackDefault(runonuithreaddelayedOnWarmupCompleted, (Object) null, new CardIssueFaqView$.ExternalSyntheticLambda7(this), 1, (Object) null);
        runOnUiThreadDelayed.onWarmupCompleted(runonuithreaddelayedOnWarmupCompleted, (Object) null, new CardIssueFaqView$.ExternalSyntheticLambda8(this), 1, (Object) null);
        int i2 = IAuthTabCallbackStub + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return runonuithreaddelayedOnWarmupCompleted;
    }

    private static final Unit asBinder(CardIssueFaqView cardIssueFaqView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Function0<Unit> function0 = cardIssueFaqView.onNavigationEvent;
            if (function0 != null) {
                function0.invoke();
                int i3 = asBinder + 119;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
            }
            cardIssueFaqView.onExtraCallback.onExtraCallbackWithResult.setVisibility(8);
            return Unit.INSTANCE;
        }
        Function0<Unit> function02 = cardIssueFaqView.onNavigationEvent;
        throw null;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i4 = onExtraCallbackWithResult + 121;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 92 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            int i6 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i7 == 0) {
                int i8 = 21 / 0;
            }
            return getspecialfeatureoptinstatus2;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueFaqView cardIssueFaqView) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        return (Unit) onWarmupCompleted(TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback3, 250331836, new Object[]{cardIssueFaqView}, iOnExtraCallback, -250331834, iOnExtraCallback2);
    }

    public static /* synthetic */ Unit onNavigationEvent(CardIssueFaqView cardIssueFaqView) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        return (Unit) onWarmupCompleted(TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback3, -1799991947, new Object[]{cardIssueFaqView}, iOnExtraCallback, 1799991948, iOnExtraCallback2);
    }

    public static /* synthetic */ void onNavigationEvent(CardIssueFaqView cardIssueFaqView, View view) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        onWarmupCompleted(TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback3, -305589027, new Object[]{cardIssueFaqView, view}, iOnExtraCallback, 305589027, iOnExtraCallback2);
    }

    private static final Unit IAuthTabCallback(CardIssueFaqView cardIssueFaqView, float f) {
        Object[] objArr = {cardIssueFaqView, Float.valueOf(f)};
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        return (Unit) onWarmupCompleted(TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), -1880219201, objArr, iOnExtraCallback, 1880219204, iOnExtraCallback2);
    }
}
