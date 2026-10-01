package im.toss.ads_sdk.playable;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.skt.usp.UCPApiConstants;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.features.tosscert.ui.R;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.gradient.TdsRadialGradientView;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppLovinSdkSettings;
import o.GeckoHubImp;
import o.Protocol;
import o.RecomposerawaitIdle2;
import o.RecomposerrecompositionRunner2;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import o.deprecated_certificatePinner;
import o.getAdService;
import o.getExtraParameters;
import o.getSpecialFeatureOptInStatus;
import o.getStrokeWidth;
import o.getTranslateX;
import o.getUrlokhttp;
import o.isFireOS;
import o.isMuted;
import o.patch;
import o.pxToDp;
import o.readIntokhttp;
import o.runOnUiThreadDelayed;
import o.setTagsokhttp;
import o.setVisitUrl;
import o.setX509TrustManagerOrNullokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PlayableEndCardBottomSheet extends ConstraintLayout {
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private final getTranslateX IAuthTabCallback;
    private Function0<Unit> onExtraCallback;
    private runOnUiThreadDelayed onExtraCallbackWithResult;
    private Function0<Unit> onNavigationEvent;
    private final float onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayableEndCardBottomSheet(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayableEndCardBottomSheet(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(PlayableEndCardBottomSheet playableEndCardBottomSheet, Function0 function0) {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(playableEndCardBottomSheet, function0);
        int i4 = asBinder + 79;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function0 function0, PlayableEndCardBottomSheet playableEndCardBottomSheet, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function0, playableEndCardBottomSheet, view);
        int i4 = IAuthTabCallbackStub + 71;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i5 | i4);
        int i8 = i6 | i7;
        int i9 = (~(i4 | (~i6))) | i5;
        int i10 = i5 + i6 + i3 + ((-1932811043) * i) + (1521317780 * i2);
        int i11 = i10 * i10;
        int i12 = ((i5 * (-919556932)) - 154402816) + ((-919556932) * i6) + ((-1121407813) * i7) + (i8 * 1121407813) + (1121407813 * i9) + (201850880 * i3) + ((-2098724864) * i) + ((-1398800384) * i2) + ((-1444151296) * i11);
        int i13 = (i5 * 1794637580) + 2133191799 + (i6 * 1794637580) + (i7 * (-161)) + (i8 * 161) + (i9 * 161) + (i3 * 1794637741) + (i * (-1844343719)) + (i2 * (-1188939004)) + (i11 * (-394526720));
        int i14 = i12 + (i13 * i13 * 821297152);
        return i14 != 1 ? i14 != 2 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, PlayableEndCardBottomSheet playableEndCardBottomSheet, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0, playableEndCardBottomSheet, motionEvent);
        int i4 = asBinder + 115;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onWarmupCompleted(Function0 function0, PlayableEndCardBottomSheet playableEndCardBottomSheet, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function0, playableEndCardBottomSheet, view);
        int i4 = asBinder + 23;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlayableEndCardBottomSheet(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        getTranslateX gettranslatexIAuthTabCallback = getTranslateX.IAuthTabCallback(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(gettranslatexIAuthTabCallback, "");
        this.IAuthTabCallback = gettranslatexIAuthTabCallback;
        this.onWarmupCompleted = 0.2f;
        setClipChildren(false);
        setClipToPadding(false);
        setVisibility(4);
        gettranslatexIAuthTabCallback.IAuthTabCallback_Parcel.onWarmupCompleted(setTagsokhttp.onExtraCallbackWithResult(this, 27));
        gettranslatexIAuthTabCallback.access100.onWarmupCompleted(setTagsokhttp.onExtraCallbackWithResult(this, 22));
        gettranslatexIAuthTabCallback.access000.onWarmupCompleted(setTagsokhttp.onExtraCallbackWithResult(this, 22));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PlayableEndCardBottomSheet(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = asBinder + 1;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = asBinder + 63;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallback + 117;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onNavigationEvent + 39;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onWarmupCompleted + 73;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i5 = 2 / 0;
            } else {
                getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            }
            int i6 = onWarmupCompleted + 13;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onNavigationEvent(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallback + 23;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i6 = onExtraCallback + 5;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    private static final void onExtraCallback(Function0 function0, PlayableEndCardBottomSheet playableEndCardBottomSheet, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        onExtraCallbackWithResult(playableEndCardBottomSheet, null, 1, null);
        int i4 = asBinder + 107;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onNavigationEvent(Function0 function0, PlayableEndCardBottomSheet playableEndCardBottomSheet, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        onExtraCallbackWithResult(playableEndCardBottomSheet, null, 1, null);
        int i4 = asBinder + 25;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0, PlayableEndCardBottomSheet playableEndCardBottomSheet, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        onExtraCallbackWithResult(playableEndCardBottomSheet, null, 1, null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 103;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, im.toss.ads_sdk.playable.PlayableEndCardBottomSheet, java.lang.Object] */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        final ?? r1 = (PlayableEndCardBottomSheet) objArr[0];
        final Function0<Unit> function0 = (Function0) objArr[1];
        final Function0<Unit> function02 = (Function0) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        ((PlayableEndCardBottomSheet) r1).onExtraCallback = function0;
        ((PlayableEndCardBottomSheet) r1).onNavigationEvent = function02;
        ((PlayableEndCardBottomSheet) r1).IAuthTabCallback.onExtraCallback.setAlpha(0.0f);
        ((PlayableEndCardBottomSheet) r1).IAuthTabCallback.onTransact.setAlpha(0.0f);
        ((PlayableEndCardBottomSheet) r1).IAuthTabCallback.asInterface.setAlpha(0.0f);
        ((PlayableEndCardBottomSheet) r1).IAuthTabCallback.IAuthTabCallbackStub.setAlpha(0.0f);
        ((PlayableEndCardBottomSheet) r1).IAuthTabCallback.onWarmupCompleted.setAlpha(0.0f);
        r1.setVisibility(0);
        TdsRoundLayout tdsRoundLayout = ((PlayableEndCardBottomSheet) r1).IAuthTabCallback.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        patch.IAuthTabCallback(tdsRoundLayout, 0.0f, 1, (Object) null);
        TdsRoundLayout tdsRoundLayout2 = ((PlayableEndCardBottomSheet) r1).IAuthTabCallback.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
        patch.IAuthTabCallback(tdsRoundLayout2, 0.0f, 1, (Object) null);
        ((PlayableEndCardBottomSheet) r1).IAuthTabCallback.onWarmupCompleted.setOnClickListener(new View.OnClickListener() { // from class: im.toss.ads_sdk.playable.PlayableEndCardBottomSheet$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 45;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                PlayableEndCardBottomSheet.onWarmupCompleted(function0, r1, view);
                int i5 = onExtraCallback + 81;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 91 / 0;
                }
            }
        });
        ((PlayableEndCardBottomSheet) r1).IAuthTabCallback.asBinder.setOnClickListener(new View.OnClickListener() { // from class: im.toss.ads_sdk.playable.PlayableEndCardBottomSheet$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 59;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                PlayableEndCardBottomSheet.onExtraCallbackWithResult(function0, r1, view);
                int i5 = onNavigationEvent + 73;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        TdsRoundLayout tdsRoundLayout3 = ((PlayableEndCardBottomSheet) r1).IAuthTabCallback.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout3, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsRoundLayout3, false, null, 0, null, null, 0.0f, 0.0f, null, false, 0L, null, null, new Function1() { // from class: im.toss.ads_sdk.playable.PlayableEndCardBottomSheet$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 101;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    PlayableEndCardBottomSheet.onNavigationEvent(function02, r1, (MotionEvent) obj);
                    throw null;
                }
                Unit unitOnNavigationEvent = PlayableEndCardBottomSheet.onNavigationEvent(function02, r1, (MotionEvent) obj);
                int i4 = IAuthTabCallback + 81;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitOnNavigationEvent;
            }
        }, 4095, null);
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        onNavigationEvent(new Object[]{r1}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, 1803218841, -1803218841);
        int i2 = IAuthTabCallbackStub + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    public final void onExtraCallbackWithResult(@NotNull NativeAdsDto.Creative.EndCard endCard) {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(endCard, "");
            onWarmupCompleted(endCard);
            throw null;
        }
        Intrinsics.checkNotNullParameter(endCard, "");
        onWarmupCompleted(endCard);
        int i3 = asBinder + 27;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(PlayableEndCardBottomSheet playableEndCardBottomSheet, Function0 function0, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = asBinder + 35;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            function0 = null;
        }
        onNavigationEvent(new Object[]{playableEndCardBottomSheet, function0}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 71025868, -71025867);
        int i5 = IAuthTabCallbackStub + 71;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [android.view.View, im.toss.ads_sdk.playable.PlayableEndCardBottomSheet] */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        final ?? r13 = (PlayableEndCardBottomSheet) objArr[0];
        final Function0 function0 = (Function0) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        Object obj = null;
        if (r13.getVisibility() != 0) {
            if (function0 != null) {
                function0.invoke();
            }
            return null;
        }
        int i4 = IAuthTabCallbackStub + 87;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            runOnUiThreadDelayed runonuithreaddelayed = ((PlayableEndCardBottomSheet) r13).onExtraCallbackWithResult;
            obj.hashCode();
            throw null;
        }
        runOnUiThreadDelayed runonuithreaddelayed2 = ((PlayableEndCardBottomSheet) r13).onExtraCallbackWithResult;
        if (runonuithreaddelayed2 != null) {
            runonuithreaddelayed2.onNavigationEvent();
        }
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        ConstraintLayout constraintLayout = ((PlayableEndCardBottomSheet) r13).IAuthTabCallback.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        AppLovinSdkSettings interfaceDescriptor = isMuted.getInterfaceDescriptor(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null), (Float) null, Float.valueOf(setTagsokhttp.onExtraCallbackWithResult((View) r13, 100)), (Function1) null, 5, (Object) null);
        Boolean bool = Boolean.FALSE;
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout, interfaceDescriptor, 0, null, 0, null, null, bool, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsRoundLayout tdsRoundLayout = ((PlayableEndCardBottomSheet) r13).IAuthTabCallback.onTransact;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRoundLayout, isMuted.getInterfaceDescriptor(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null), (Float) null, Float.valueOf(setTagsokhttp.onExtraCallbackWithResult((View) r13, 100)), (Function1) null, 5, (Object) null), 0, null, 0, null, null, bool, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsRadialGradientView tdsRadialGradientView = ((PlayableEndCardBottomSheet) r13).IAuthTabCallback.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsRadialGradientView, "");
        Rally rally3 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRadialGradientView, isMuted.getInterfaceDescriptor(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null), (Float) null, Float.valueOf(setTagsokhttp.onExtraCallbackWithResult((View) r13, 100)), (Function1) null, 5, (Object) null), 0, null, 0, null, null, bool, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsRadialGradientView tdsRadialGradientView2 = ((PlayableEndCardBottomSheet) r13).IAuthTabCallback.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(tdsRadialGradientView2, "");
        Rally rally4 = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRadialGradientView2, isMuted.getInterfaceDescriptor(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null), (Float) null, Float.valueOf(setTagsokhttp.onExtraCallbackWithResult((View) r13, 100)), (Function1) null, 5, (Object) null), 0, null, 0, null, null, bool, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        View view = ((PlayableEndCardBottomSheet) r13).IAuthTabCallback.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(view, "");
        ((PlayableEndCardBottomSheet) r13).onExtraCallbackWithResult = isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{rally, rally2, rally3, rally4, (Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, bool, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), (Object) null, new Function0() { // from class: im.toss.ads_sdk.playable.PlayableEndCardBottomSheet$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i5 = 2 % 2;
                int i6 = IAuthTabCallback + 57;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                PlayableEndCardBottomSheet playableEndCardBottomSheet = this.f$0;
                if (i7 == 0) {
                    return PlayableEndCardBottomSheet.IAuthTabCallback(playableEndCardBottomSheet, function0);
                }
                PlayableEndCardBottomSheet.IAuthTabCallback(playableEndCardBottomSheet, function0);
                throw null;
            }
        }, 1, (Object) null), false, 1, (Object) null);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(PlayableEndCardBottomSheet playableEndCardBottomSheet, Function0 function0) {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        playableEndCardBottomSheet.setVisibility(8);
        if (function0 != null) {
            int i4 = asBinder + 111;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            function0.invoke();
            int i6 = IAuthTabCallbackStub + 43;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(NativeAdsDto.Creative.EndCard endCard) {
        boolean z;
        int i;
        Object objValueOf;
        Object objValueOf2;
        int i2 = 2 % 2;
        this.IAuthTabCallback.IAuthTabCallback_Parcel.setText(endCard.IAuthTabCallbackDefault());
        this.IAuthTabCallback.access100.setText((String) NativeAdsDto.Creative.EndCard.IAuthTabCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1229612249, 1229612249, new Object[]{endCard}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent()));
        Typography5 typography5 = this.IAuthTabCallback.access100;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        String str = (String) NativeAdsDto.Creative.EndCard.IAuthTabCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1229612249, 1229612249, new Object[]{endCard}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        Object obj = null;
        boolean z2 = false;
        if (str != null) {
            int i3 = IAuthTabCallbackStub + 85;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                StringsKt.isBlank(str);
                throw null;
            }
            z = StringsKt.isBlank(str);
        }
        if (!z) {
            i = 0;
        } else {
            int i4 = IAuthTabCallbackStub + 35;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            i = 8;
        }
        typography5.setVisibility(i);
        this.IAuthTabCallback.access000.setText((String) NativeAdsDto.Creative.EndCard.IAuthTabCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 379248949, -379248948, new Object[]{endCard}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent()));
        TdsImageView tdsImageView = this.IAuthTabCallback.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        TdsImageView.setImage$default(tdsImageView, endCard.onWarmupCompleted(), (Function1) null, (Function1) null, 6, (Object) null);
        this.IAuthTabCallback.IAuthTabCallbackStubProxy.removeAllViews();
        List<NativeAdsDto.Creative.EndCard.EndCardContent> listOnExtraCallback = endCard.onExtraCallback();
        if (listOnExtraCallback != null) {
            int i6 = IAuthTabCallbackStub + 49;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            Iterator<T> it = listOnExtraCallback.iterator();
            while (it.hasNext()) {
                this.IAuthTabCallback.IAuthTabCallbackStubProxy.addView(onExtraCallback((NativeAdsDto.Creative.EndCard.EndCardContent) it.next()));
            }
        }
        NativeAdsDto.Creative.EndCard.Gradient gradientIAuthTabCallbackStub = endCard.IAuthTabCallbackStub();
        if (gradientIAuthTabCallbackStub == null) {
            onExtraCallback();
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            objValueOf = Result.constructor-impl(Integer.valueOf(Color.parseColor(gradientIAuthTabCallbackStub.onExtraCallback())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objValueOf = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iOnUnminimized = new getUrlokhttp(new onNavigationEvent(configuration)).requestPostMessageChannel().onUnminimized();
        if (Result.onExtraCallback(objValueOf)) {
            int i8 = asBinder + 65;
            IAuthTabCallbackStub = i8 % 128;
            if (i8 % 2 != 0) {
                objValueOf = Integer.valueOf(iOnUnminimized);
                int i9 = 70 / 0;
            } else {
                objValueOf = Integer.valueOf(iOnUnminimized);
            }
        }
        int iIntValue = ((Number) objValueOf).intValue();
        try {
            Result.Companion companion3 = Result.Companion;
            objValueOf2 = Result.constructor-impl(Integer.valueOf(Color.parseColor(gradientIAuthTabCallbackStub.onNavigationEvent())));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            objValueOf2 = Result.constructor-impl(ResultKt.createFailure(th2));
        }
        if (Result.onExtraCallback(objValueOf2)) {
            int i10 = IAuthTabCallbackStub + 53;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            objValueOf2 = Integer.valueOf(iIntValue);
        }
        int iIntValue2 = ((Number) objValueOf2).intValue();
        if (endCard.onExtraCallback() != null && (!r4.isEmpty())) {
            z2 = true;
        }
        onWarmupCompleted(iIntValue, iIntValue2, z2);
        int i12 = asBinder + 11;
        IAuthTabCallbackStub = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View onExtraCallback(NativeAdsDto.Creative.EndCard.EndCardContent endCardContent) {
        int i = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context, (AttributeSet) null, 0, false, 14, (DefaultConstructorMarker) null);
        tdsListRowV1View.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        tdsListRowV1View.setHorizontalPadding(TdsListRowV1View.onNavigationEvent.M);
        tdsListRowV1View.setVerticalPadding(TdsListRowV1View.IAuthTabCallbackDefault.S);
        String strOnExtraCallbackWithResult = endCardContent.onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult == null || StringsKt.isBlank(strOnExtraCallbackWithResult)) {
            tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.NONE);
        } else {
            tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
            tdsListRowV1View.setLeftImageSize(TdsListRowV1View.IAuthTabCallback.onWarmupCompleted.IAuthTabCallback.onWarmupCompleted);
            RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(tdsListRowV1View.getContext()).onExtraCallback(endCardContent.onExtraCallbackWithResult());
            Context context2 = tdsListRowV1View.getContext();
            Context context3 = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsListRowV1View.setLeftImage(RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{Protocol.onWarmupCompleted(new setX509TrustManagerOrNullokhttp(context2, 24.0f, 0.0f, 0.0f, 0.0f, 3.0f, ((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onExtraCallback(configuration))}, 2109422447, -2109422438, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue(), 0, 156, (DefaultConstructorMarker) null))}));
            int i2 = asBinder + 43;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
        }
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
        tdsListRowV1View.setCenterText1(endCardContent.onNavigationEvent());
        BaseTextView baseTextViewICustomTabsCallbackDefault = tdsListRowV1View.ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault != null) {
            Context context4 = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration2 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            baseTextViewICustomTabsCallbackDefault.setTextColor(new getUrlokhttp(new IAuthTabCallback(configuration2)).requestPostMessageChannel().onUnminimized());
        }
        BaseTextView baseTextViewICustomTabsCallbackDefault2 = tdsListRowV1View.ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault2 != null) {
            int i4 = IAuthTabCallbackStub + 27;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            baseTextViewICustomTabsCallbackDefault2.onWarmupCompleted(setTagsokhttp.onExtraCallbackWithResult(tdsListRowV1View, 22));
        }
        tdsListRowV1View.setImportantForAccessibility(2);
        return tdsListRowV1View;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback() {
        int i = 2 % 2;
        this.IAuthTabCallback.IAuthTabCallback_Parcel.getPaint().setShader(null);
        Typography3 typography3 = this.IAuthTabCallback.IAuthTabCallback_Parcel;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        typography3.setTextColor(new getUrlokhttp(new onExtraCallbackWithResult(configuration)).requestPostMessageChannel().onUnminimized());
        this.IAuthTabCallback.IAuthTabCallback_Parcel.invalidate();
        int i2 = IAuthTabCallbackStub + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [android.view.View, im.toss.ads_sdk.playable.PlayableEndCardBottomSheet] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ?? r13 = (PlayableEndCardBottomSheet) objArr[0];
        int i = 2 % 2;
        pxToDp.onNavigationEvent onnavigationevent = new pxToDp.onNavigationEvent(30);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        ConstraintLayout constraintLayout = ((PlayableEndCardBottomSheet) r13).IAuthTabCallback.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        AppLovinSdkSettings interfaceDescriptor = isMuted.getInterfaceDescriptor(isMuted.onNavigationEvent(appLovinSdkSettings, fValueOf, fValueOf2, (Function1) null, 4, (Object) null), Float.valueOf(setTagsokhttp.onExtraCallbackWithResult((View) r13, 100)), fValueOf, (Function1) null, 4, (Object) null);
        Boolean bool = Boolean.FALSE;
        listCreateListBuilder.add((Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout, interfaceDescriptor, 0, null, 0, null, null, bool, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
        TdsRoundLayout tdsRoundLayout = ((PlayableEndCardBottomSheet) r13).IAuthTabCallback.onTransact;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        listCreateListBuilder.add((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRoundLayout, isMuted.getInterfaceDescriptor(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), fValueOf, fValueOf2, (Function1) null, 4, (Object) null), Float.valueOf(setTagsokhttp.onExtraCallbackWithResult((View) r13, 100)), fValueOf, (Function1) null, 4, (Object) null), 0, null, 0, null, null, bool, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
        TdsRadialGradientView tdsRadialGradientView = ((PlayableEndCardBottomSheet) r13).IAuthTabCallback.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsRadialGradientView, "");
        listCreateListBuilder.add((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRadialGradientView, isMuted.getInterfaceDescriptor(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), fValueOf, fValueOf2, (Function1) null, 4, (Object) null), Float.valueOf(setTagsokhttp.onExtraCallbackWithResult((View) r13, 100)), fValueOf, (Function1) null, 4, (Object) null), 0, null, 0, null, null, bool, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
        TdsRadialGradientView tdsRadialGradientView2 = ((PlayableEndCardBottomSheet) r13).IAuthTabCallback.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(tdsRadialGradientView2, "");
        listCreateListBuilder.add((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRadialGradientView2, isMuted.getInterfaceDescriptor(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onExtraCallbackWithResult()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), fValueOf, fValueOf2, (Function1) null, 4, (Object) null), Float.valueOf(setTagsokhttp.onExtraCallbackWithResult((View) r13, 100)), fValueOf, (Function1) null, 4, (Object) null), 0, null, 0, null, null, bool, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
        View view = ((PlayableEndCardBottomSheet) r13).IAuthTabCallback.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(view, "");
        listCreateListBuilder.add((Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(((PlayableEndCardBottomSheet) r13).onWarmupCompleted), (Function1) null, 5, (Object) null), 0, null, 0, null, null, bool, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
        isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, onnavigationevent, CollectionsKt.build(listCreateListBuilder), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 3833, (Object) null), false, 1, (Object) null);
        int i2 = asBinder + 13;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(int i, int i2, boolean z) {
        int i3 = 2 % 2;
        Integer numValueOf = Integer.valueOf(UCPApiConstants.ARAM_TIME_OUT);
        Object obj = null;
        if (i == i2) {
            int i4 = asBinder + 59;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                this.IAuthTabCallback.IAuthTabCallback_Parcel.getPaint().setShader(null);
                this.IAuthTabCallback.IAuthTabCallback_Parcel.setTextColor(i);
                this.IAuthTabCallback.IAuthTabCallback_Parcel.invalidate();
                return;
            } else {
                this.IAuthTabCallback.IAuthTabCallback_Parcel.getPaint().setShader(null);
                this.IAuthTabCallback.IAuthTabCallback_Parcel.setTextColor(i);
                this.IAuthTabCallback.IAuthTabCallback_Parcel.invalidate();
                obj.hashCode();
                throw null;
            }
        }
        if (!z) {
            TdsRoundLayout tdsRoundLayout = this.IAuthTabCallback.onTransact;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
            ViewGroup.LayoutParams layoutParams = tdsRoundLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int i5 = IAuthTabCallbackStub + 103;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            layoutParams.width = setTagsokhttp.onExtraCallbackWithResult(this, 100);
            layoutParams.height = setTagsokhttp.onExtraCallbackWithResult(this, 100);
            tdsRoundLayout.setLayoutParams(layoutParams);
            this.IAuthTabCallback.onTransact.setRadius(setTagsokhttp.onExtraCallbackWithResult(this, 32));
            TdsRadialGradientView tdsRadialGradientView = this.IAuthTabCallback.asInterface;
            Intrinsics.checkNotNullExpressionValue(tdsRadialGradientView, "");
            tdsRadialGradientView.setVisibility(8);
            TdsRadialGradientView tdsRadialGradientView2 = this.IAuthTabCallback.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsRadialGradientView2, "");
            tdsRadialGradientView2.setVisibility(0);
            return;
        }
        int i7 = IAuthTabCallbackStub + 13;
        asBinder = i7 % 128;
        if (i7 % 2 == 0) {
            TdsRoundLayout tdsRoundLayout2 = this.IAuthTabCallback.onTransact;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
            tdsRoundLayout2.getLayoutParams();
            throw null;
        }
        TdsRoundLayout tdsRoundLayout3 = this.IAuthTabCallback.onTransact;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout3, "");
        ViewGroup.LayoutParams layoutParams2 = tdsRoundLayout3.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width = setTagsokhttp.onExtraCallbackWithResult(this, numValueOf);
        layoutParams2.height = setTagsokhttp.onExtraCallbackWithResult(this, numValueOf);
        tdsRoundLayout3.setLayoutParams(layoutParams2);
        this.IAuthTabCallback.onTransact.setRadius(setTagsokhttp.onExtraCallbackWithResult(this, 40));
        TdsRadialGradientView tdsRadialGradientView3 = this.IAuthTabCallback.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsRadialGradientView3, "");
        tdsRadialGradientView3.setVisibility(0);
        TdsRadialGradientView tdsRadialGradientView4 = this.IAuthTabCallback.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(tdsRadialGradientView4, "");
        tdsRadialGradientView4.setVisibility(8);
        Typography5 typography5 = this.IAuthTabCallback.access100;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        typography5.setVisibility(8);
        int i8 = asBinder + 77;
        IAuthTabCallbackStub = i8 % 128;
        int i9 = i8 % 2;
    }

    private final void onNavigationEvent() {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        onNavigationEvent(new Object[]{this}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, 1803218841, -1803218841);
    }

    public final void onNavigationEvent(@Nullable Function0<Unit> function0) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        onNavigationEvent(new Object[]{this, function0}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, 71025868, -71025867);
    }

    public final void onExtraCallbackWithResult(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        onNavigationEvent(new Object[]{this, function0, function02}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, 614432937, -614432935);
    }
}
