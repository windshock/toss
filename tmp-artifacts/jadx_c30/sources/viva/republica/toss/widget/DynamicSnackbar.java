package viva.republica.toss.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import o.Address;
import o.AppLovinSdkSettings;
import o.ConvertByteArrayToFloatArray;
import o.GetCmpRetunrnInfo;
import o.M_;
import o.deprecated_certificatePinner;
import o.generateLink;
import o.getAdService;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getExtraParameters;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.isFireOS;
import o.isMuted;
import o.pxToDp;
import o.readIntokhttp;
import o.runOnUiThreadDelayed;
import o.varyMatches;
import o.verifySignatureValue_NoAlgorithmInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class DynamicSnackbar extends ConstraintLayout {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private boolean IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private Function0<Unit> IAuthTabCallbackStub;
    private final Rect access100;
    private int asBinder;
    private Function0<Unit> asInterface;
    private final int onExtraCallback;
    private GetCmpRetunrnInfo onExtraCallbackWithResult;
    private Function0<Unit> onNavigationEvent;
    private onExtraCallback onTransact;
    private runOnUiThreadDelayed onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DynamicSnackbar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DynamicSnackbar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
    }

    public static /* synthetic */ Unit onExtraCallback(GetCmpRetunrnInfo getCmpRetunrnInfo, DynamicSnackbar dynamicSnackbar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getCmpRetunrnInfo, dynamicSnackbar);
        int i4 = IAuthTabCallbackStubProxy + 121;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~((~i4) | i5);
        int i11 = i9 | i10 | (~(i5 | i6));
        int i12 = (~(i6 | i4)) | (~(i7 | i4));
        int i13 = i8 | i10;
        int i14 = i4 + i5 + i + (793188503 * i3) + (2090109681 * i2);
        int i15 = i14 * i14;
        int i16 = (837707615 * i4) + 1286602752 + ((-1676358574) * i5) + (i11 * (-838022063)) + (1676044126 * i12) + ((-838022063) * i13) + ((-838336512) * i) + (1186463744 * i3) + (1166540800 * i2) + ((-1956446208) * i15);
        int i17 = ((i4 * 1389925299) - 652765764) + (i5 * 1389927018) + (i11 * 573) + (i12 * (-1146)) + (i13 * 573) + (i * 1389926445) + (i3 * (-1551828341)) + (i2 * (-2047638435)) + (i15 * 1214709760);
        int i18 = i16 + (i17 * i17 * 445972480);
        return i18 != 1 ? i18 != 2 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 32 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(GetCmpRetunrnInfo getCmpRetunrnInfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(getCmpRetunrnInfo);
        }
        onNavigationEvent(getCmpRetunrnInfo);
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(DynamicSnackbar dynamicSnackbar, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 1;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(dynamicSnackbar, view);
        int i4 = IAuthTabCallback_Parcel + 25;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            return (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[0], -1091509735, 1091509735, iOnExtraCallbackWithResult);
        }
        int iOnExtraCallbackWithResult4 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(GetCmpRetunrnInfo getCmpRetunrnInfo, DynamicSnackbar dynamicSnackbar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getCmpRetunrnInfo, dynamicSnackbar);
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onWarmupCompleted(DynamicSnackbar dynamicSnackbar, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 31;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(dynamicSnackbar, view);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DynamicSnackbar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int iIsEngagementSignalsApiAvailable;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        GetCmpRetunrnInfo getCmpRetunrnInfoOnWarmupCompleted = GetCmpRetunrnInfo.onWarmupCompleted(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(getCmpRetunrnInfoOnWarmupCompleted, BuildConfig.FLAVOR);
        this.onExtraCallbackWithResult = getCmpRetunrnInfoOnWarmupCompleted;
        this.access100 = new Rect();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, BuildConfig.FLAVOR);
        if (generateLink.IAuthTabCallback(resources)) {
            iIsEngagementSignalsApiAvailable = Color.parseColor("#80000000");
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, BuildConfig.FLAVOR);
            Configuration configuration = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, BuildConfig.FLAVOR);
            iIsEngagementSignalsApiAvailable = new getUrlokhttp(new IAuthTabCallbackDefault(configuration)).isEngagementSignalsApiAvailable();
            int i2 = IAuthTabCallbackStubProxy + 7;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 % 4;
            } else {
                int i4 = 2 % 2;
            }
        }
        this.onExtraCallback = iIsEngagementSignalsApiAvailable;
        Class cls = Integer.TYPE;
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(onextracallbackwithresult);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).width = -1;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).height = -1;
        setLayoutParams(onextracallbackwithresult);
        setVisibility(0);
        View view = this.onExtraCallbackWithResult.asInterface;
        view.setBackgroundColor(iIsEngagementSignalsApiAvailable);
        view.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.widget.DynamicSnackbar$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i5 = 2 % 2;
                int i6 = onExtraCallback + 125;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                DynamicSnackbar.onNavigationEvent(this.f$0, view2);
                int i8 = onExtraCallback + 37;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 62 / 0;
                }
            }
        });
        this.onExtraCallbackWithResult.onExtraCallbackWithResult.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.widget.DynamicSnackbar$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i5 = 2 % 2;
                int i6 = onWarmupCompleted + 89;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                DynamicSnackbar.onExtraCallbackWithResult(this.f$0, view2);
                int i8 = onExtraCallback + 17;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
            }
        });
        int i5 = IAuthTabCallbackStubProxy + 97;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DynamicSnackbar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallback_Parcel + 121;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallbackStubProxy + 53;
            IAuthTabCallback_Parcel = i6 % 128;
            i = i6 % 2 == 0 ? 1 : 0;
        }
        this(context, attributeSet, i);
    }

    public final void setOnComplete(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackStub = function0;
        int i5 = i3 + 75;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void setOnCanceled(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 75;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        this.onNavigationEvent = function0;
        int i5 = i3 + 25;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
    }

    public final void setOnExpand(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 73;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.asInterface = function0;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 33;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void setExpanded(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback = z;
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                int i2 = onExtraCallback + 77;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onNavigationEvent + 39;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 82 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = IAuthTabCallback + 125;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i5 = onWarmupCompleted + 93;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 46 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                int i2 = onExtraCallbackWithResult + 83;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i3 == 0) {
                    int i4 = 43 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
            int i5 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return getspecialfeatureoptinstatus2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onTransact implements getAdService {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onTransact(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallback + 109;
            onExtraCallbackWithResult = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                obj.hashCode();
                throw null;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i5 = onExtraCallbackWithResult + 83;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return getspecialfeatureoptinstatus2;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onWarmupCompleted(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onExtraCallback + 23;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onExtraCallbackWithResult + 41;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                return getspecialfeatureoptinstatus2;
            }
            throw null;
        }
    }

    public static void onNavigationEvent(DynamicSnackbar dynamicSnackbar, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback_Parcel + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final void IAuthTabCallback(DynamicSnackbar dynamicSnackbar, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        dynamicSnackbar.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
    }

    public final void setContentView(@NotNull onExtraCallback onextracallback, @NotNull View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        GetCmpRetunrnInfo getCmpRetunrnInfo = this.onExtraCallbackWithResult;
        this.onTransact = onextracallback;
        onExtraCallback();
        getCmpRetunrnInfo.IAuthTabCallback.removeAllViews();
        getCmpRetunrnInfo.IAuthTabCallback.addView(view);
        int i4 = IAuthTabCallbackStubProxy + 83;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(1.0f);
        Integer numValueOf = Integer.valueOf(verifySignatureValue_NoAlgorithmInfo.RESULT_TOSS_CARD_AUTO_CHARGE_REMOVED);
        final GetCmpRetunrnInfo getCmpRetunrnInfo = this.onExtraCallbackWithResult;
        this.IAuthTabCallbackDefault = getCmpRetunrnInfo.onExtraCallbackWithResult.getWidth();
        this.asBinder = this.onExtraCallbackWithResult.onExtraCallbackWithResult.getHeight();
        this.IAuthTabCallback = true;
        Function0<Unit> function0 = this.asInterface;
        if (function0 != null) {
            int i4 = IAuthTabCallback_Parcel + 63;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                function0.invoke();
                throw null;
            }
            function0.invoke();
        }
        runOnUiThreadDelayed runonuithreaddelayed = this.onWarmupCompleted;
        if (runonuithreaddelayed != null) {
            int i5 = IAuthTabCallbackStubProxy + 23;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            runonuithreaddelayed.onNavigationEvent();
            int i7 = IAuthTabCallbackStubProxy + 39;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
        }
        ConstraintLayout root = getCmpRetunrnInfo.getRoot();
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        TdsRoundLayout tdsRoundLayout = getCmpRetunrnInfo.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, BuildConfig.FLAVOR);
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        int iAsInterface = M_.onExtraCallback.asInterface();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, BuildConfig.FLAVOR);
        AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1685808947, new Object[]{(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 1115090779, new Object[]{appLovinSdkSettings, null, Integer.valueOf(iAsInterface - varyMatches.onNavigationEvent(20, displayMetrics)), null, 5, null}, -1115090763, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), null, Integer.valueOf(getCmpRetunrnInfo.IAuthTabCallback.getHeight()), null, 5, null}, 1685808950, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, BuildConfig.FLAVOR);
        int iExtraCallback = new getUrlokhttp(new onExtraCallbackWithResult(configuration)).extraCallback();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, BuildConfig.FLAVOR);
        Resources resources = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, BuildConfig.FLAVOR);
        Configuration configuration2 = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, BuildConfig.FLAVOR);
        List listOnNavigationEvent = RallysKt.onNavigationEvent(new AppLovinSdkSettings[]{isMuted.onWarmupCompleted(appLovinSdkSettings2, Integer.valueOf(iExtraCallback), Integer.valueOf(new getDEFAULT_CONNECTION_SPECSokhttp(new IAuthTabCallback(configuration2)).onWarmupCompleted()), (Function1) null, 4, (Object) null)});
        Boolean bool = Boolean.FALSE;
        Rally rallyOnWarmupCompleted = RallysKt.onWarmupCompleted(tdsRoundLayout, listOnNavigationEvent, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 1916, (Object) null);
        TdsRoundLayout tdsRoundLayout2 = getCmpRetunrnInfo.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, BuildConfig.FLAVOR);
        AppLovinSdkSettings appLovinSdkSettings3 = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, BuildConfig.FLAVOR);
        int iOnNavigationEvent = varyMatches.onNavigationEvent(150, displayMetrics2);
        DisplayMetrics displayMetrics3 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, BuildConfig.FLAVOR);
        Rally rallyOnWarmupCompleted2 = RallysKt.onWarmupCompleted(tdsRoundLayout2, RallysKt.onNavigationEvent(new AppLovinSdkSettings[]{isMuted.onExtraCallback(appLovinSdkSettings3, Integer.valueOf(iOnNavigationEvent), Integer.valueOf(varyMatches.onNavigationEvent(10, displayMetrics3)), (Function1) null, 4, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, numValueOf, bool, 0, 0L, false, 1852, (Object) null);
        LinearLayout linearLayout = getCmpRetunrnInfo.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(linearLayout, BuildConfig.FLAVOR);
        AppLovinSdkSettings appLovinSdkSettings4 = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        DisplayMetrics displayMetrics4 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, BuildConfig.FLAVOR);
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(140, displayMetrics4);
        DisplayMetrics displayMetrics5 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics5, BuildConfig.FLAVOR);
        Rally rallyOnWarmupCompleted3 = RallysKt.onWarmupCompleted(linearLayout, RallysKt.onNavigationEvent(new AppLovinSdkSettings[]{isMuted.onExtraCallback(appLovinSdkSettings4, Integer.valueOf(iOnNavigationEvent2), Integer.valueOf(varyMatches.onNavigationEvent(0, displayMetrics5)), (Function1) null, 4, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, numValueOf, bool, 0, 0L, false, 1852, (Object) null);
        View view = getCmpRetunrnInfo.asInterface;
        Intrinsics.checkNotNullExpressionValue(view, BuildConfig.FLAVOR);
        Rally rallyOnWarmupCompleted4 = RallysKt.onWarmupCompleted(view, RallysKt.onNavigationEvent(new AppLovinSdkSettings[]{isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        LinearLayout linearLayout2 = getCmpRetunrnInfo.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, BuildConfig.FLAVOR);
        this.onWarmupCompleted = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted(root, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rallyOnWarmupCompleted, rallyOnWarmupCompleted2, rallyOnWarmupCompleted3, rallyOnWarmupCompleted4, RallysKt.onWarmupCompleted(linearLayout2, RallysKt.onNavigationEvent(new AppLovinSdkSettings[]{isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(0.0f), fValueOf, (Function1) null, 4, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, verifySignatureValue_NoAlgorithmInfo.REQUEST_AUTH_CS, 0L, false, 1660, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 3832, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.widget.DynamicSnackbar$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i9 = 2 % 2;
                int i10 = onNavigationEvent + 23;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                Unit unitOnNavigationEvent = DynamicSnackbar.onNavigationEvent(getCmpRetunrnInfo, this);
                int i12 = IAuthTabCallback + 119;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                return unitOnNavigationEvent;
            }
        }, 1, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.widget.DynamicSnackbar$$ExternalSyntheticLambda5
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i9 = 2 % 2;
                int i10 = onExtraCallback + 5;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 != 0) {
                    return DynamicSnackbar.onNavigationEvent();
                }
                DynamicSnackbar.onNavigationEvent();
                throw null;
            }
        }, 1, (Object) null), false, 1, (Object) null);
    }

    private static final void onExtraCallback(DynamicSnackbar dynamicSnackbar, View view) {
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            objOnExtraCallbackWithResult = onExtraCallbackWithResult(iOnExtraCallbackWithResult2, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{dynamicSnackbar, true, 1, null}, 875673175, -875673173, iOnExtraCallbackWithResult);
        } else {
            int iOnExtraCallbackWithResult4 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            objOnExtraCallbackWithResult = onExtraCallbackWithResult(iOnExtraCallbackWithResult5, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, new Object[]{dynamicSnackbar, false, 1, null}, 875673175, -875673173, iOnExtraCallbackWithResult4);
        }
        int i3 = IAuthTabCallbackStubProxy + 55;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(GetCmpRetunrnInfo getCmpRetunrnInfo, final DynamicSnackbar dynamicSnackbar) {
        int i = 2 % 2;
        TdsRoundLayout tdsRoundLayout = getCmpRetunrnInfo.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(dynamicSnackbar.getResources().getDisplayMetrics(), BuildConfig.FLAVOR);
        tdsRoundLayout.setRadius(varyMatches.onNavigationEvent(28, r2));
        ConstraintLayout constraintLayout = getCmpRetunrnInfo.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, BuildConfig.FLAVOR);
        constraintLayout.setVisibility(8);
        getCmpRetunrnInfo.IAuthTabCallback.setAlpha(0.0f);
        getCmpRetunrnInfo.IAuthTabCallback.setScaleX(1.0f);
        getCmpRetunrnInfo.IAuthTabCallback.setScaleY(1.0f);
        LinearLayout linearLayout = getCmpRetunrnInfo.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(linearLayout, BuildConfig.FLAVOR);
        linearLayout.setVisibility(0);
        getCmpRetunrnInfo.asInterface.setAlpha(0.0f);
        View view = getCmpRetunrnInfo.asInterface;
        Intrinsics.checkNotNullExpressionValue(view, BuildConfig.FLAVOR);
        view.setVisibility(0);
        getCmpRetunrnInfo.asInterface.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.widget.DynamicSnackbar$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 59;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                DynamicSnackbar.onWarmupCompleted(this.f$0, view2);
                int i5 = onNavigationEvent + 17;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            ConvertByteArrayToFloatArray.onExtraCallback(1241333L, true, (String) null, (Map) null, (Function1) null, 21, (Object) null);
        } else {
            ConvertByteArrayToFloatArray.onExtraCallback(1241333L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean z = false;
        DynamicSnackbar dynamicSnackbar = (DynamicSnackbar) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        Object obj = objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 15;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0 ? (1 & iIntValue) == 0 : (1 & iIntValue) == 0) {
            z = zBooleanValue;
        } else {
            int i4 = i2 + 75;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        return dynamicSnackbar.IAuthTabCallback(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(GetCmpRetunrnInfo getCmpRetunrnInfo, DynamicSnackbar dynamicSnackbar) {
        int i = 2 % 2;
        getCmpRetunrnInfo.asInterface.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.widget.DynamicSnackbar$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 93;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
                DynamicSnackbar.onExtraCallbackWithResult(iOnExtraCallbackWithResult2, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{view}, 1365832199, -1365832198, iOnExtraCallbackWithResult);
                int i5 = onWarmupCompleted + 51;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        TdsRoundLayout tdsRoundLayout = getCmpRetunrnInfo.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(dynamicSnackbar.getResources().getDisplayMetrics(), BuildConfig.FLAVOR);
        tdsRoundLayout.setRadius(varyMatches.onNavigationEvent(48, r5));
        ConstraintLayout constraintLayout = getCmpRetunrnInfo.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, BuildConfig.FLAVOR);
        constraintLayout.setVisibility(0);
        getCmpRetunrnInfo.onExtraCallbackWithResult.setAlpha(0.0f);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(GetCmpRetunrnInfo getCmpRetunrnInfo) {
        int i = 2 % 2;
        ConstraintLayout constraintLayout = getCmpRetunrnInfo.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, BuildConfig.FLAVOR);
        isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout, isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, Float.valueOf(1.0f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), false, 1, (Object) null);
        getCmpRetunrnInfo.IAuthTabCallback.setVisibility(4);
        View view = getCmpRetunrnInfo.asInterface;
        Intrinsics.checkNotNullExpressionValue(view, BuildConfig.FLAVOR);
        view.setVisibility(8);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0111 A[PHI: r2 r10 r11
      0x0111: PHI (r2v15 java.lang.Float) = (r2v5 java.lang.Float), (r2v17 java.lang.Float) binds: [B:8:0x004d, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x0111: PHI (r10v3 o.GetCmpRetunrnInfo) = (r10v0 o.GetCmpRetunrnInfo), (r10v4 o.GetCmpRetunrnInfo) binds: [B:8:0x004d, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x0111: PHI (r11v21 java.lang.Integer) = (r11v0 int), (r11v22 int) binds: [B:8:0x004d, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f A[PHI: r2 r8 r9 r10 r11
      0x004f: PHI (r2v6 java.lang.Float) = (r2v5 java.lang.Float), (r2v17 java.lang.Float) binds: [B:8:0x004d, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r8v2 java.lang.Integer) = (r8v1 int), (r8v12 int) binds: [B:8:0x004d, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r9v2 java.lang.Integer) = (r9v1 int), (r9v13 int) binds: [B:8:0x004d, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r10v1 o.GetCmpRetunrnInfo) = (r10v0 o.GetCmpRetunrnInfo), (r10v4 o.GetCmpRetunrnInfo) binds: [B:8:0x004d, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r11v1 java.lang.Integer) = (r11v0 int), (r11v22 int) binds: [B:8:0x004d, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final runOnUiThreadDelayed IAuthTabCallback(boolean z) {
        Float fValueOf;
        int i;
        int i2;
        final GetCmpRetunrnInfo getCmpRetunrnInfo;
        int i3;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStubProxy + 87;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            fValueOf = Float.valueOf(2.0f);
            i = 11;
            i2 = 53;
            getCmpRetunrnInfo = this.onExtraCallbackWithResult;
            i3 = 1;
            this.IAuthTabCallback = false;
            if (z) {
                String string = getCmpRetunrnInfo.IAuthTabCallbackDefault.getText().toString();
                Typography6 typography6 = getCmpRetunrnInfo.IAuthTabCallbackDefault;
                Intrinsics.checkNotNullExpressionValue(typography6, BuildConfig.FLAVOR);
                int iIAuthTabCallback = (int) IAuthTabCallback(string, (BaseTextView) typography6);
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, BuildConfig.FLAVOR);
                this.IAuthTabCallbackDefault = iIAuthTabCallback + varyMatches.onNavigationEvent(40, displayMetrics);
                onExtraCallback onextracallback = this.onTransact;
                if (onextracallback == null) {
                    int i6 = IAuthTabCallbackStubProxy + 55;
                    IAuthTabCallback_Parcel = i6 % 128;
                    int i7 = i6 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
                    onextracallback = null;
                }
                if (onextracallback.IAuthTabCallback() != null) {
                    int i8 = IAuthTabCallback_Parcel + 99;
                    IAuthTabCallbackStubProxy = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = this.IAuthTabCallbackDefault;
                    DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics2, BuildConfig.FLAVOR);
                    int iOnNavigationEvent = varyMatches.onNavigationEvent(i2, displayMetrics2);
                    DisplayMetrics displayMetrics3 = getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics3, BuildConfig.FLAVOR);
                    this.IAuthTabCallbackDefault = i10 + iOnNavigationEvent + varyMatches.onNavigationEvent(i, displayMetrics3);
                }
                onExtraCallback onextracallback2 = this.onTransact;
                if (onextracallback2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
                    onextracallback2 = null;
                }
                if (onextracallback2.onExtraCallback() != null) {
                    int i11 = this.IAuthTabCallbackDefault;
                    DisplayMetrics displayMetrics4 = getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics4, BuildConfig.FLAVOR);
                    int iOnNavigationEvent2 = varyMatches.onNavigationEvent(i2, displayMetrics4);
                    DisplayMetrics displayMetrics5 = getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics5, BuildConfig.FLAVOR);
                    this.IAuthTabCallbackDefault = i11 + iOnNavigationEvent2 + varyMatches.onNavigationEvent(i, displayMetrics5);
                    int i12 = IAuthTabCallbackStubProxy + 55;
                    IAuthTabCallback_Parcel = i12 % 128;
                    int i13 = i12 % 2;
                }
                Function0<Unit> function0 = this.IAuthTabCallbackStub;
                if (function0 != null) {
                    int i14 = IAuthTabCallback_Parcel + 61;
                    IAuthTabCallbackStubProxy = i14 % 128;
                    if (i14 % 2 != 0) {
                        function0.invoke();
                        throw null;
                    }
                    function0.invoke();
                }
            } else {
                Function0<Unit> function02 = this.onNavigationEvent;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        } else {
            fValueOf = Float.valueOf(0.0f);
            i = 8;
            i2 = 20;
            getCmpRetunrnInfo = this.onExtraCallbackWithResult;
            i3 = 0;
            this.IAuthTabCallback = false;
            if (!(!z)) {
            }
        }
        Integer num = i3;
        runOnUiThreadDelayed runonuithreaddelayed = this.onWarmupCompleted;
        if (runonuithreaddelayed != null) {
            int i15 = IAuthTabCallbackStubProxy + 83;
            IAuthTabCallback_Parcel = i15 % 128;
            int i16 = i15 % 2;
            runonuithreaddelayed.onNavigationEvent();
        }
        ConstraintLayout root = getCmpRetunrnInfo.getRoot();
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        TdsRoundLayout tdsRoundLayout = getCmpRetunrnInfo.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, BuildConfig.FLAVOR);
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        DisplayMetrics displayMetrics6 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics6, BuildConfig.FLAVOR);
        AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1685808947, new Object[]{(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 1115090779, new Object[]{isMuted.onExtraCallback(appLovinSdkSettings, (Integer) null, Integer.valueOf(varyMatches.onNavigationEvent(num, displayMetrics6)), (Function1) null, 5, (Object) null), null, Integer.valueOf(this.IAuthTabCallbackDefault), null, 5, null}, -1115090763, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), null, Integer.valueOf(this.asBinder), null, 5, null}, 1685808950, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, BuildConfig.FLAVOR);
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, BuildConfig.FLAVOR);
        int iOnWarmupCompleted = new getDEFAULT_CONNECTION_SPECSokhttp(new onNavigationEvent(configuration)).onWarmupCompleted();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, BuildConfig.FLAVOR);
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, BuildConfig.FLAVOR);
        List listOnNavigationEvent = RallysKt.onNavigationEvent(new AppLovinSdkSettings[]{isMuted.onWarmupCompleted(appLovinSdkSettings2, Integer.valueOf(iOnWarmupCompleted), Integer.valueOf(new getUrlokhttp(new onWarmupCompleted(configuration2)).onRelationshipValidationResult()), (Function1) null, 4, (Object) null)});
        Boolean bool = Boolean.FALSE;
        Rally rallyOnWarmupCompleted = RallysKt.onWarmupCompleted(tdsRoundLayout, listOnNavigationEvent, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 1916, (Object) null);
        TdsRoundLayout tdsRoundLayout2 = getCmpRetunrnInfo.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, BuildConfig.FLAVOR);
        AppLovinSdkSettings appLovinSdkSettings3 = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        DisplayMetrics displayMetrics7 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics7, BuildConfig.FLAVOR);
        Rally rallyOnWarmupCompleted2 = RallysKt.onWarmupCompleted(tdsRoundLayout2, RallysKt.onNavigationEvent(new AppLovinSdkSettings[]{isMuted.onExtraCallback(appLovinSdkSettings3, (Integer) null, Integer.valueOf(varyMatches.onNavigationEvent(num, displayMetrics7)), (Function1) null, 5, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 1916, (Object) null);
        LinearLayout linearLayout = getCmpRetunrnInfo.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(linearLayout, BuildConfig.FLAVOR);
        AppLovinSdkSettings appLovinSdkSettings4 = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        DisplayMetrics displayMetrics8 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics8, BuildConfig.FLAVOR);
        Rally rallyOnWarmupCompleted3 = RallysKt.onWarmupCompleted(linearLayout, RallysKt.onNavigationEvent(new AppLovinSdkSettings[]{isMuted.onExtraCallback(appLovinSdkSettings4, num, Integer.valueOf(varyMatches.onNavigationEvent(150, displayMetrics8)), (Function1) null, 4, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 1916, (Object) null);
        View view = getCmpRetunrnInfo.asInterface;
        Intrinsics.checkNotNullExpressionValue(view, BuildConfig.FLAVOR);
        Float f = fValueOf;
        Rally rallyOnWarmupCompleted4 = RallysKt.onWarmupCompleted(view, RallysKt.onNavigationEvent(new AppLovinSdkSettings[]{isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, f, (Function1) null, 5, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 1916, (Object) null);
        LinearLayout linearLayout2 = getCmpRetunrnInfo.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, BuildConfig.FLAVOR);
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted(root, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rallyOnWarmupCompleted, rallyOnWarmupCompleted2, rallyOnWarmupCompleted3, rallyOnWarmupCompleted4, RallysKt.onWarmupCompleted(linearLayout2, RallysKt.onNavigationEvent(new AppLovinSdkSettings[]{isMuted.asBinder(isMuted.onNavigationEvent(((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{new AppLovinSdkSettings(), 200}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback())).onWarmupCompleted(Address.onNavigationEvent.asBinder()), Float.valueOf(0.2f), f, (Function1) null, 4, (Object) null), Float.valueOf(1.0f), Float.valueOf(0.3f), (Function1) null, 4, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 1916, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 3832, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.widget.DynamicSnackbar$$ExternalSyntheticLambda6
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i17 = 2 % 2;
                int i18 = onWarmupCompleted + 97;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
                Unit unitOnExtraCallback = DynamicSnackbar.onExtraCallback(getCmpRetunrnInfo, this);
                int i20 = onNavigationEvent + 99;
                onWarmupCompleted = i20 % 128;
                int i21 = i20 % 2;
                return unitOnExtraCallback;
            }
        }, 1, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.widget.DynamicSnackbar$$ExternalSyntheticLambda7
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                Unit unitOnExtraCallbackWithResult;
                int i17 = 2 % 2;
                int i18 = onExtraCallback + 81;
                onExtraCallbackWithResult = i18 % 128;
                if (i18 % 2 != 0) {
                    unitOnExtraCallbackWithResult = DynamicSnackbar.onExtraCallbackWithResult(getCmpRetunrnInfo);
                    int i19 = 43 / 0;
                } else {
                    unitOnExtraCallbackWithResult = DynamicSnackbar.onExtraCallbackWithResult(getCmpRetunrnInfo);
                }
                int i20 = onExtraCallbackWithResult + 33;
                onExtraCallback = i20 % 128;
                if (i20 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        }, 1, (Object) null), false, 1, (Object) null);
        int i17 = IAuthTabCallbackStubProxy + 53;
        IAuthTabCallback_Parcel = i17 % 128;
        int i18 = i17 % 2;
        return runonuithreaddelayedOnExtraCallbackWithResult;
    }

    private final float IAuthTabCallback(String str, BaseTextView baseTextView) {
        Float fValueOf;
        int i = 2 % 2;
        baseTextView.getPaint().getTextBounds(str, 0, str.length(), this.access100);
        Iterator it = StringsKt.split$default(str, new String[]{"\n"}, false, 0, 6, (Object) null).iterator();
        if (!it.hasNext()) {
            int i2 = IAuthTabCallback_Parcel + 55;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 71 / 0;
            }
            fValueOf = null;
        } else {
            float fMeasureText = baseTextView.getPaint().measureText((String) it.next());
            while (it.hasNext()) {
                fMeasureText = Math.max(fMeasureText, baseTextView.getPaint().measureText((String) it.next()));
            }
            fValueOf = Float.valueOf(fMeasureText);
        }
        if (fValueOf == null) {
            return 0.0f;
        }
        int i4 = IAuthTabCallbackStubProxy + 85;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return fValueOf.floatValue();
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onWarmupCompleted + 85;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onNavigationEvent(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final CharSequence onWarmupCompleted;

        public onExtraCallback() {
            this(null, null, null, 7, null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (!(!Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult))) {
                return Intrinsics.areEqual(this.onWarmupCompleted, onextracallback.onWarmupCompleted) && Intrinsics.areEqual(this.onNavigationEvent, onextracallback.onNavigationEvent);
            }
            int i3 = IAuthTabCallback + 55;
            onExtraCallback = i3 % 128;
            return i3 % 2 != 0;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 109;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallbackWithResult;
            if (str == null) {
                int i5 = i2 + 71;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            int iHashCode2 = this.onWarmupCompleted.hashCode();
            String str2 = this.onNavigationEvent;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = this.onExtraCallbackWithResult;
            CharSequence charSequence = this.onWarmupCompleted;
            String str2 = "SnackbarInfo(leftImageUrl=" + str + ", centerText=" + ((Object) charSequence) + ", rightImageUrl=" + this.onNavigationEvent + ")";
            int i2 = onExtraCallback + 41;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 21 / 0;
            }
            return str2;
        }

        public onExtraCallback(@Nullable String str, @NotNull CharSequence charSequence, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(charSequence, BuildConfig.FLAVOR);
            this.onExtraCallbackWithResult = str;
            this.onWarmupCompleted = charSequence;
            this.onNavigationEvent = str2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallback(String str, CharSequence charSequence, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Object obj = null;
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback;
                int i3 = i2 + 11;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = i2 + 125;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
                str = null;
            }
            charSequence = (i & 2) != 0 ? BuildConfig.FLAVOR : charSequence;
            if ((i & 4) != 0) {
                int i6 = 2 % 2;
                str2 = null;
            }
            this(str, charSequence, str2);
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.onExtraCallbackWithResult;
            int i5 = i3 + 29;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 85 / 0;
            }
            return str;
        }

        public final CharSequence onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 19;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            CharSequence charSequence = this.onWarmupCompleted;
            int i5 = i2 + 27;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return charSequence;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 91;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onNavigationEvent;
            int i5 = i2 + 77;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 109;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback onextracallback = this.onTransact;
        if (onextracallback == null) {
            int i5 = i2 + 39;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
            onextracallback = null;
        }
        String strIAuthTabCallback = onextracallback.IAuthTabCallback();
        if (strIAuthTabCallback != null) {
            TdsImageView tdsImageView = this.onExtraCallbackWithResult.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, BuildConfig.FLAVOR);
            TdsImageView.setImage$default(tdsImageView, strIAuthTabCallback, (Function1) null, (Function1) null, 6, (Object) null);
            TdsImageView tdsImageView2 = this.onExtraCallbackWithResult.onWarmupCompleted;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, BuildConfig.FLAVOR);
            tdsImageView2.setColorFilter(new getUrlokhttp(new onTransact(configuration)).onMessageChannelReady());
            TdsImageView tdsImageView3 = this.onExtraCallbackWithResult.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(tdsImageView3, BuildConfig.FLAVOR);
            tdsImageView3.setVisibility(0);
        }
        this.onExtraCallbackWithResult.IAuthTabCallbackDefault.setText(onextracallback.onNavigationEvent());
        String strOnExtraCallback = onextracallback.onExtraCallback();
        if (strOnExtraCallback != null) {
            TdsImageView tdsImageView4 = this.onExtraCallbackWithResult.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsImageView4, BuildConfig.FLAVOR);
            TdsImageView.setImage$default(tdsImageView4, strOnExtraCallback, (Function1) null, (Function1) null, 6, (Object) null);
            TdsImageView tdsImageView5 = this.onExtraCallbackWithResult.onWarmupCompleted;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, BuildConfig.FLAVOR);
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, BuildConfig.FLAVOR);
            tdsImageView5.setColorFilter(new getUrlokhttp(new IAuthTabCallbackStub(configuration2)).onMessageChannelReady());
            TdsImageView tdsImageView6 = this.onExtraCallbackWithResult.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsImageView6, BuildConfig.FLAVOR);
            tdsImageView6.setVisibility(0);
            int i7 = IAuthTabCallback_Parcel + 35;
            IAuthTabCallbackStubProxy = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 / 2;
            }
        }
    }

    public static /* synthetic */ void IAuthTabCallback(View view) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onExtraCallbackWithResult(iOnExtraCallbackWithResult2, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{view}, 1365832199, -1365832198, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ runOnUiThreadDelayed onWarmupCompleted(DynamicSnackbar dynamicSnackbar, boolean z, int i, Object obj) {
        Object[] objArr = {dynamicSnackbar, Boolean.valueOf(z), Integer.valueOf(i), obj};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (runOnUiThreadDelayed) onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, 875673175, -875673173, iOnExtraCallbackWithResult);
    }

    private static final Unit IAuthTabCallback() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[0], -1091509735, 1091509735, iOnExtraCallbackWithResult);
    }
}
