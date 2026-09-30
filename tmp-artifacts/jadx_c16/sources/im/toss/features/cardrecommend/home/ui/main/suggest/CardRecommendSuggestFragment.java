package im.toss.features.cardrecommend.home.ui.main.suggest;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import im.toss.base.BaseActivity;
import im.toss.features.cardrecommend.home.R;
import im.toss.features.cardrecommend.home.model.data.card.RecommendCard;
import im.toss.features.cardrecommend.home.model.suggest.CardSuggestionHeaderModel;
import im.toss.features.cardrecommend.home.model.suggest.CardSuggestionResp;
import im.toss.features.cardrecommend.home.model.suggest.CardSuggestionThemeModel;
import im.toss.features.cardrecommend.home.ui.main.suggest.CardRecommendSuggestFragment$;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.drawable.RotateTransformation;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.NetConverter3;
import o.PageContext;
import o.RecomposerawaitIdle2;
import o.RecomposerrecompositionRunner2;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.WifiManagerBridgeExtension2;
import o.access13800;
import o.access8100;
import o.addAllCommandLine;
import o.auth;
import o.convertAnyToMap;
import o.deserializeUriNullableCollection;
import o.enableCustomFocusSearchOnClippedElementsAndroid;
import o.getAdService;
import o.getBroadcastAddress;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getDispatcherokhttp;
import o.getPackageType;
import o.getRouteDatabase;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.preFillDefault;
import o.r8lambdahqz0zHVAWBDEWSgHKUPH51yVmSs;
import o.readIntokhttp;
import o.sendUdpMessage;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.varyMatches;
import o.zzad;
import o.zzaj;
import o.zzbe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CardRecommendSuggestFragment extends Hilt_CardRecommendSuggestFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int IAuthTabCallback;
    private static char[] IAuthTabCallbackDefault = null;
    private static boolean IAuthTabCallbackStub = false;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static int access100 = 0;
    private static int asBinder = 0;
    private static boolean asInterface = false;
    private static int getInterfaceDescriptor = 1;
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted;

    @Inject
    public getBroadcastAddress cardFeedApis;

    @Inject
    public zzad injectedEnvironments;
    private final Lazy onExtraCallback;
    private CardSuggestionResp onExtraCallbackWithResult;
    private final PageContext onNavigationEvent;
    private final enableCustomFocusSearchOnClippedElementsAndroid onTransact;

    @Inject
    public r8lambdahqz0zHVAWBDEWSgHKUPH51yVmSs specialTermsAgreedUseCase;

    @Inject
    public SessionTrackerb tossRouter;

    static {
        onNavigationEvent();
        onWarmupCompleted = new addAllCommandLine[]{new PropertyReference1Impl<>(CardRecommendSuggestFragment.class, "binding", "getBinding()Lim/toss/features/cardrecommend/home/databinding/CardRecommendHomeFragmentSuggestionBinding;", 0)};
        IAuthTabCallback = 8;
        int i = access000 + 69;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        CardRecommendSuggestFragment cardRecommendSuggestFragment = (CardRecommendSuggestFragment) objArr[0];
        RecommendCard recommendCard = (RecommendCard) objArr[1];
        CardSuggestionThemeModel cardSuggestionThemeModel = (CardSuggestionThemeModel) objArr[2];
        View view = (View) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cardRecommendSuggestFragment, recommendCard, cardSuggestionThemeModel, view);
        int i4 = IAuthTabCallback_Parcel + 29;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ String IAuthTabCallback(CardRecommendSuggestFragment cardRecommendSuggestFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = onWarmupCompleted(cardRecommendSuggestFragment);
        int i4 = IAuthTabCallback_Parcel + 101;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return strOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(th);
        int i4 = access100 + 101;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ boolean IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 113;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(function1, obj);
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return zOnWarmupCompleted;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        CardRecommendSuggestFragment cardRecommendSuggestFragment = (CardRecommendSuggestFragment) objArr[0];
        CardSuggestionThemeModel cardSuggestionThemeModel = (CardSuggestionThemeModel) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 59;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(cardRecommendSuggestFragment, cardSuggestionThemeModel, iIntValue, zBooleanValue);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cardRecommendSuggestFragment, cardSuggestionThemeModel, iIntValue, zBooleanValue);
        int i3 = access100 + 87;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(Boolean bool) {
        int i = 2 % 2;
        int i2 = access100 + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {bool};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        if (i3 == 0) {
            int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            ((Boolean) onExtraCallbackWithResult(-260314964, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr, iOnExtraCallbackWithResult, 260314965)).booleanValue();
            throw null;
        }
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) onExtraCallbackWithResult(-260314964, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, objArr, iOnExtraCallbackWithResult, 260314965)).booleanValue();
        int i4 = access100 + 39;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i;
        int i8 = i6 | i5 | i7;
        int i9 = ~i6;
        int i10 = (~i5) | i7;
        int i11 = (~i10) | i9;
        int i12 = (~(i5 | i7 | i9)) | (~(i10 | i6));
        int i13 = i + i6 + i4 + (2053704882 * i3) + ((-167119771) * i2);
        int i14 = i13 * i13;
        int i15 = (((-385660469) * i) - 1543503872) + (1501345335 * i6) + (1203980746 * i8) + (i11 * (-1203980746)) + ((-1203980746) * i12) + ((-1589641216) * i4) + (511705088 * i3) + ((-1639972864) * i2) + (1278279680 * i14);
        int i16 = ((i * (-1228230693)) - 288632672) + (i6 * (-1228230521)) + (i8 * (-86)) + (i11 * 86) + (i12 * 86) + (i4 * (-1228230607)) + (i3 * 927583762) + (i2 * (-1784727723)) + (i14 * 1163984896);
        switch (i15 + (i16 * i16 * 992935936)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return asBinder(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardRecommendSuggestFragment cardRecommendSuggestFragment, CardSuggestionThemeModel cardSuggestionThemeModel, int i, RecommendCard recommendCard, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 47;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {cardRecommendSuggestFragment, cardSuggestionThemeModel, Integer.valueOf(i), recommendCard, setDetectableSize};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(-281067988, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr, iOnExtraCallbackWithResult, 281067990);
        int i5 = IAuthTabCallback_Parcel + 1;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardRecommendSuggestFragment cardRecommendSuggestFragment, CardSuggestionThemeModel cardSuggestionThemeModel, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cardRecommendSuggestFragment, cardSuggestionThemeModel, view);
        int i4 = access100 + 5;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        asInterface(function1, obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = access100 + 33;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(RecommendCard recommendCard, CardSuggestionThemeModel cardSuggestionThemeModel, CardRecommendSuggestFragment cardRecommendSuggestFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 31;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(recommendCard, cardSuggestionThemeModel, cardRecommendSuggestFragment, setDetectableSize);
        int i4 = IAuthTabCallback_Parcel + 99;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardSuggestionThemeModel cardSuggestionThemeModel, CardRecommendSuggestFragment cardRecommendSuggestFragment, TdsTopV2View tdsTopV2View) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 77;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cardSuggestionThemeModel, cardRecommendSuggestFragment, tdsTopV2View);
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardRecommendSuggestFragment cardRecommendSuggestFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(cardRecommendSuggestFragment, bool);
        }
        onExtraCallbackWithResult(cardRecommendSuggestFragment, bool);
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 85;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, obj);
        int i4 = access100 + 63;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        CardRecommendSuggestFragment cardRecommendSuggestFragment = (CardRecommendSuggestFragment) objArr[0];
        CardSuggestionThemeModel cardSuggestionThemeModel = (CardSuggestionThemeModel) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[3];
        int i = 2 % 2;
        int i2 = access100 + 61;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cardRecommendSuggestFragment, cardSuggestionThemeModel, iIntValue, setDetectableSize);
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardRecommendSuggestFragment cardRecommendSuggestFragment, CardSuggestionThemeModel cardSuggestionThemeModel, int i, RecommendCard recommendCard, boolean z) {
        int i2 = 2 % 2;
        int i3 = access100 + 73;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {cardRecommendSuggestFragment, cardSuggestionThemeModel, Integer.valueOf(i), recommendCard, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(1572364551, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr, iOnExtraCallbackWithResult, -1572364548);
        int i5 = access100 + 9;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static final /* synthetic */ void onWarmupCompleted(CardRecommendSuggestFragment cardRecommendSuggestFragment, CardSuggestionResp cardSuggestionResp) {
        int i = 2 % 2;
        int i2 = access100 + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        cardRecommendSuggestFragment.onWarmupCompleted(cardSuggestionResp);
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        int i5 = access100 + 99;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CardRecommendSuggestFragment() {
        super(R.layout.card_recommend_home_fragment_suggestion);
        this.onNavigationEvent = preFillDefault.onExtraCallbackWithResult(this, onExtraCallbackWithResult.onExtraCallbackWithResult);
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new CardRecommendSuggestFragment$.ExternalSyntheticLambda6(this));
        this.onTransact = new enableCustomFocusSearchOnClippedElementsAndroid();
    }

    public final getBroadcastAddress onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 61;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        getBroadcastAddress getbroadcastaddress = this.cardFeedApis;
        if (getbroadcastaddress == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 75;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return getbroadcastaddress;
    }

    public final zzad onExtraCallbackWithResult() {
        int i = 2 % 2;
        zzad zzadVar = this.injectedEnvironments;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = access100 + 97;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 1 / 0;
            }
            return null;
        }
        int i4 = access100 + 25;
        int i5 = i4 % 128;
        IAuthTabCallback_Parcel = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 5;
        access100 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 30 / 0;
        }
        return zzadVar;
    }

    public static final class onNavigationEvent implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onNavigationEvent(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = IAuthTabCallback + 89;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 34 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onNavigationEvent);
            throw null;
        }
    }

    private final zzad asBinder() {
        int i = 2 % 2;
        int i2 = access100 + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (this.injectedEnvironments != null) {
            return onExtraCallbackWithResult();
        }
        auth.IAuthTabCallback(auth.onNavigationEvent, new IllegalStateException("environments accessed before injection: CardRecommendSuggestFragment"), (Map) null, 2, (Object) null);
        zzad zzadVarOnNavigationEvent = zzaj.onNavigationEvent();
        int i4 = IAuthTabCallback_Parcel + 125;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return zzadVarOnNavigationEvent;
    }

    public final SessionTrackerb IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 107;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        Object obj = null;
        if (sessionTrackerb != null) {
            int i5 = i3 + 97;
            access100 = i5 % 128;
            if (i5 % 2 == 0) {
                return sessionTrackerb;
            }
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i6 = access100 + 63;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, sendUdpMessage> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onNavigationEvent + 89;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        onExtraCallbackWithResult() {
            super(1, sendUdpMessage.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/cardrecommend/home/databinding/CardRecommendHomeFragmentSuggestionBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            sendUdpMessage sendudpmessageOnWarmupCompleted = onWarmupCompleted((View) obj);
            int i4 = onExtraCallback + 59;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 24 / 0;
            }
            return sendudpmessageOnWarmupCompleted;
        }

        public final sendUdpMessage onWarmupCompleted(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            sendUdpMessage sendudpmessageOnExtraCallbackWithResult = sendUdpMessage.onExtraCallbackWithResult(view);
            int i4 = onExtraCallback + 43;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return sendudpmessageOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        PageContext pageContext;
        addAllCommandLine<Object> addallcommandline;
        CardRecommendSuggestFragment cardRecommendSuggestFragment = (CardRecommendSuggestFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 73;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            pageContext = cardRecommendSuggestFragment.onNavigationEvent;
            addallcommandline = onWarmupCompleted[0];
        } else {
            pageContext = cardRecommendSuggestFragment.onNavigationEvent;
            addallcommandline = onWarmupCompleted[0];
        }
        sendUdpMessage sendudpmessageOnExtraCallbackWithResult = pageContext.onExtraCallbackWithResult(cardRecommendSuggestFragment, addallcommandline);
        int i3 = access100 + 85;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return sendudpmessageOnExtraCallbackWithResult;
        }
        throw null;
    }

    private final String access000() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 37;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            str = (String) this.onExtraCallback.getValue();
            int i3 = 2 / 0;
        } else {
            str = (String) this.onExtraCallback.getValue();
        }
        int i4 = access100 + 59;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String onWarmupCompleted(CardRecommendSuggestFragment cardRecommendSuggestFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 15;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Bundle bundleRequireArguments = cardRecommendSuggestFragment.requireArguments();
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-110, -109, -110, -110, -109, -108, -109, -110}, TextUtils.getTrimmedLength("") + 127, objArr);
        String string = bundleRequireArguments.getString(((String) objArr[0]).intern());
        int i4 = IAuthTabCallback_Parcel + 101;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public final r8lambdahqz0zHVAWBDEWSgHKUPH51yVmSs onExtraCallback() {
        int i = 2 % 2;
        r8lambdahqz0zHVAWBDEWSgHKUPH51yVmSs r8lambdahqz0zhvawbdewsghkuph51yvmss = this.specialTermsAgreedUseCase;
        if (r8lambdahqz0zhvawbdewsghkuph51yvmss != null) {
            int i2 = IAuthTabCallback_Parcel + 39;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            return r8lambdahqz0zhvawbdewsghkuph51yvmss;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = IAuthTabCallback_Parcel + 121;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access100 + 107;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        if (this.onExtraCallbackWithResult != null) {
            return 1012101L;
        }
        int i5 = i3 + 105;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return -1L;
        }
        throw null;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        String strIAuthTabCallback;
        Integer numValueOf;
        List<CardSuggestionThemeModel> listOnWarmupCompleted;
        List<CardSuggestionThemeModel> listOnWarmupCompleted2;
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        String strOnNavigationEvent = null;
        a(null, null, new byte[]{-110, -109, -110, -110, -109, -108, -109, -110}, 127 - KeyEvent.keyCodeFromString(""), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), access000());
        CardSuggestionResp cardSuggestionResp = this.onExtraCallbackWithResult;
        if (cardSuggestionResp == null || (listOnWarmupCompleted2 = cardSuggestionResp.onWarmupCompleted()) == null) {
            strIAuthTabCallback = null;
        } else {
            List<CardSuggestionThemeModel> list = listOnWarmupCompleted2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((String) CardSuggestionThemeModel.onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 2010165480, -2010165479, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{(CardSuggestionThemeModel) it.next()}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent()));
            }
            strIAuthTabCallback = WifiManagerBridgeExtension2.IAuthTabCallback(arrayList);
        }
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("card_category_list", strIAuthTabCallback);
        CardSuggestionResp cardSuggestionResp2 = this.onExtraCallbackWithResult;
        if (cardSuggestionResp2 == null || (listOnWarmupCompleted = cardSuggestionResp2.onWarmupCompleted()) == null) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(listOnWarmupCompleted.size());
            int i2 = access100 + 103;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
        }
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("card_category_count", numValueOf);
        CardSuggestionResp cardSuggestionResp3 = this.onExtraCallbackWithResult;
        if (cardSuggestionResp3 != null) {
            int i4 = IAuthTabCallback_Parcel + 17;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            CardSuggestionHeaderModel cardSuggestionHeaderModelOnNavigationEvent = cardSuggestionResp3.onNavigationEvent();
            if (cardSuggestionHeaderModelOnNavigationEvent != null) {
                strOnNavigationEvent = cardSuggestionHeaderModelOnNavigationEvent.onNavigationEvent();
            }
        }
        return access8100.onWarmupCompleted(access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("screen_title", strOnNavigationEvent)}));
    }

    private static final boolean onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 55;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = IAuthTabCallback_Parcel + 121;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Boolean bool = (Boolean) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bool, "");
            return Boolean.valueOf(bool.booleanValue());
        }
        Intrinsics.checkNotNullParameter(bool, "");
        bool.booleanValue();
        throw null;
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback_Parcel + 115;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
    }

    private static final Unit onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback_Parcel + 15;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(CardRecommendSuggestFragment cardRecommendSuggestFragment, Boolean bool) {
        int i = 2 % 2;
        int i2 = access100 + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        enableCustomFocusSearchOnClippedElementsAndroid enablecustomfocussearchonclippedelementsandroid = cardRecommendSuggestFragment.onTransact;
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        ScrollView scrollView = ((sendUdpMessage) onExtraCallbackWithResult(835513660, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{cardRecommendSuggestFragment}, iOnExtraCallbackWithResult, -835513654)).onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(scrollView, "");
        enablecustomfocussearchonclippedelementsandroid.IAuthTabCallback(scrollView);
        cardRecommendSuggestFragment.onTransact.onScrollChanged();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 125;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        this.onTransact.onWarmupCompleted();
        IAuthTabCallbackStubProxy();
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = getVisibleState().onWarmupCompleted(new CardRecommendSuggestFragment$.ExternalSyntheticLambda1(new CardRecommendSuggestFragment$.ExternalSyntheticLambda0())).onExtraCallback(1L).onExtraCallbackWithResult(NetConverter3.onExtraCallback()).onExtraCallbackWithResult(new CardRecommendSuggestFragment$.ExternalSyntheticLambda3(new CardRecommendSuggestFragment$.ExternalSyntheticLambda2(this)), new CardRecommendSuggestFragment$.ExternalSyntheticLambda5(new CardRecommendSuggestFragment$.ExternalSyntheticLambda4()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallbackWithResult, "");
        autoDisposable(deserializeurinullablecollectionOnExtraCallbackWithResult);
        int i2 = IAuthTabCallback_Parcel + 31;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 85 / 0;
        }
    }

    private final getPackageType IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        getPackageType getpackagetypeOnExtraCallback = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner).onExtraCallback(new onExtraCallback(this, (access13800) null));
        int i2 = IAuthTabCallback_Parcel + 65;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return getpackagetypeOnExtraCallback;
    }

    private final void onWarmupCompleted(CardSuggestionResp cardSuggestionResp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult = cardSuggestionResp;
        onTrackView();
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        ((sendUdpMessage) onExtraCallbackWithResult(835513660, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{this}, iOnExtraCallbackWithResult, -835513654)).IAuthTabCallback.removeAllViews();
        int iOnExtraCallbackWithResult4 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        ((sendUdpMessage) onExtraCallbackWithResult(835513660, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult5, new Object[]{this}, iOnExtraCallbackWithResult4, -835513654)).IAuthTabCallback.addView(onExtraCallbackWithResult(cardSuggestionResp));
        int iOnExtraCallbackWithResult7 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult8 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult9 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        ((sendUdpMessage) onExtraCallbackWithResult(835513660, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult9, iOnExtraCallbackWithResult8, new Object[]{this}, iOnExtraCallbackWithResult7, -835513654)).onExtraCallback.onExtraCallbackWithResult();
        int i4 = access100 + 7;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallbackDefault;
        long j = 0;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 77 - (Process.myPid() >> 22), 20952 - ExpandableListView.getPackedPositionGroup(j), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $10 + 67;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(asBinder)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), View.getDefaultSize(0, 0) + 75, 16037 - TextUtils.indexOf("", "", 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i8 = 1052772399;
        if (!asInterface) {
            if (IAuthTabCallbackStub) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 63, 12215 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $11 + 27;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] + iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted % 1;
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            }
            String str = new String(cArr5);
            int i10 = $11 + 29;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            objArr[0] = str;
            return;
        }
        int i12 = $11 + 73;
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            i3 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            i3 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
        }
        char[] cArr6 = new char[i3];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i13 = $11 + 97;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] / iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i8);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), TextUtils.lastIndexOf("", '0', 0, 0) + 64, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(obj, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getJumpTapTimeout() >> 16) + 63, TextUtils.getTrimmedLength("") + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                obj = null;
            }
            i8 = 1052772399;
        }
        String str2 = new String(cArr6);
        int i14 = $11 + 29;
        $10 = i14 % 128;
        if (i14 % 2 == 0) {
            objArr[0] = str2;
        } else {
            int i15 = 86 / 0;
            objArr[0] = str2;
        }
    }

    private static final Unit IAuthTabCallback(CardRecommendSuggestFragment cardRecommendSuggestFragment, CardSuggestionThemeModel cardSuggestionThemeModel, View view) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        LinearLayout linearLayout = ((sendUdpMessage) onExtraCallbackWithResult(835513660, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{cardRecommendSuggestFragment}, iOnExtraCallbackWithResult, -835513654)).IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent3 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        String str = (String) CardSuggestionThemeModel.onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent, -1061503668, 1061503668, iOnNavigationEvent2, new Object[]{cardSuggestionThemeModel}, iOnNavigationEvent3);
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -127, -111, -111, -112, -113, -114, -115, -116, -126, -117, -118, -126, -119, -126, -120, -121, -122, -126, -123, -124, -125, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -126, -127}, 127 - Color.alpha(0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        sb.append("에 걸렸어요\n                                ");
        new TdsToastV1.onNavigationEvent(linearLayout, StringsKt.trimIndent(sb.toString())).onNavigationEvent();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 61;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(CardSuggestionThemeModel cardSuggestionThemeModel, CardRecommendSuggestFragment cardRecommendSuggestFragment, TdsTopV2View tdsTopV2View) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tdsTopV2View, "");
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        layoutParams.width = -1;
        layoutParams.height = -2;
        tdsTopV2View.setLayoutParams(layoutParams);
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        tdsTopV2View.setTitleText(cardSuggestionThemeModel.IAuthTabCallbackStub());
        tdsTopV2View.setSubtitle2Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
        tdsTopV2View.setSubtitle2TextSize(TdsTopV2View.onWarmupCompleted.SIZE_17);
        Context context = tdsTopV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsTopV2View.setSubtitle2TextColor(new getUrlokhttp(new onNavigationEvent(configuration)).ICustomTabsCallbackStubProxy());
        tdsTopV2View.setSubtitle2Text(cardSuggestionThemeModel.asBinder());
        tdsTopV2View.setRightType(TdsTopV2View.IAuthTabCallback.ASSET_V1_CIRCLE_BIG);
        getDispatcherokhttp getdispatcherokhttpOnExtraCallbackWithResult = tdsTopV2View.onExtraCallbackWithResult();
        if (getdispatcherokhttpOnExtraCallbackWithResult != null) {
            getdispatcherokhttpOnExtraCallbackWithResult.onWarmupCompleted(cardSuggestionThemeModel.onNavigationEvent());
            if (cardRecommendSuggestFragment.asBinder().MediaMetadataCompat()) {
                int i2 = IAuthTabCallback_Parcel + 121;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                if (((String) CardSuggestionThemeModel.onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1061503668, 1061503668, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{cardSuggestionThemeModel}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent())).length() > 0) {
                    setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, new Object[]{tdsTopV2View, new CardRecommendSuggestFragment$.ExternalSyntheticLambda9(cardRecommendSuggestFragment, cardSuggestionThemeModel)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
                }
            }
        }
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(tdsTopV2View, 0);
        setMinWebSocketMessageToCompressokhttp.onNavigationEvent(tdsTopV2View, 0);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 11;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00cf A[PHI: r3
      0x00cf: PHI (r3v17 im.toss.features.cardrecommend.home.model.suggest.CardSuggestionHeaderModel) = 
      (r3v16 im.toss.features.cardrecommend.home.model.suggest.CardSuggestionHeaderModel)
      (r3v18 im.toss.features.cardrecommend.home.model.suggest.CardSuggestionHeaderModel)
     binds: [B:14:0x00cd, B:11:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(CardRecommendSuggestFragment cardRecommendSuggestFragment, CardSuggestionThemeModel cardSuggestionThemeModel, int i, SetDetectableSize setDetectableSize) throws Throwable {
        CardSuggestionHeaderModel cardSuggestionHeaderModelOnNavigationEvent;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        String strOnNavigationEvent = null;
        a(null, null, new byte[]{-110, -109, -110, -110, -109, -108, -109, -110}, 127 - KeyEvent.keyCodeFromString(""), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), cardRecommendSuggestFragment.access000());
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent3 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        setDetectableSize.onExtraCallback("card_category", (String) CardSuggestionThemeModel.onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent, 2010165480, -2010165479, iOnNavigationEvent2, new Object[]{cardSuggestionThemeModel}, iOnNavigationEvent3));
        List listIAuthTabCallback = cardSuggestionThemeModel.IAuthTabCallback();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIAuthTabCallback, 10));
        Iterator it = listIAuthTabCallback.iterator();
        int i3 = IAuthTabCallback_Parcel + 61;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = IAuthTabCallback_Parcel + 5;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            arrayList.add(Long.valueOf(((RecommendCard) it.next()).onWarmupCompleted()));
        }
        setDetectableSize.onExtraCallback("card_id_list", WifiManagerBridgeExtension2.IAuthTabCallback(arrayList));
        setDetectableSize.onExtraCallback("section_order", Integer.valueOf(i + 1));
        setDetectableSize.onExtraCallback("section_title", cardSuggestionThemeModel.IAuthTabCallbackStub());
        CardSuggestionResp cardSuggestionResp = cardRecommendSuggestFragment.onExtraCallbackWithResult;
        if (cardSuggestionResp != null) {
            int i7 = IAuthTabCallback_Parcel + 31;
            access100 = i7 % 128;
            if (i7 % 2 != 0) {
                cardSuggestionHeaderModelOnNavigationEvent = cardSuggestionResp.onNavigationEvent();
                int i8 = 28 / 0;
                if (cardSuggestionHeaderModelOnNavigationEvent != null) {
                    int i9 = access100 + 23;
                    IAuthTabCallback_Parcel = i9 % 128;
                    int i10 = i9 % 2;
                    strOnNavigationEvent = cardSuggestionHeaderModelOnNavigationEvent.onNavigationEvent();
                }
            } else {
                cardSuggestionHeaderModelOnNavigationEvent = cardSuggestionResp.onNavigationEvent();
                if (cardSuggestionHeaderModelOnNavigationEvent != null) {
                }
            }
        }
        setDetectableSize.onExtraCallback("screen_title", strOnNavigationEvent);
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = im.toss.features.cardrecommend.home.ui.main.suggest.CardRecommendSuggestFragment.IAuthTabCallback.onExtraCallbackWithResult + 79;
            im.toss.features.cardrecommend.home.ui.main.suggest.CardRecommendSuggestFragment.IAuthTabCallback.onExtraCallback = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onNavigationEvent) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.onNavigationEvent)) != false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 55 / 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        o.ConvertByteArrayToFloatArray.onExtraCallback(1249797, false, (java.lang.String) null, (java.util.Map) null, new im.toss.features.cardrecommend.home.ui.main.suggest.CardRecommendSuggestFragment$.ExternalSyntheticLambda7(r8, r9, r10), 14, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r11 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r11 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r8 = kotlin.Unit.INSTANCE;
        r9 = im.toss.features.cardrecommend.home.ui.main.suggest.CardRecommendSuggestFragment.access100 + 73;
        im.toss.features.cardrecommend.home.ui.main.suggest.CardRecommendSuggestFragment.IAuthTabCallback_Parcel = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if ((r9 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(CardRecommendSuggestFragment cardRecommendSuggestFragment, CardSuggestionThemeModel cardSuggestionThemeModel, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = access100 + 63;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 95 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        CardRecommendSuggestFragment cardRecommendSuggestFragment = (CardRecommendSuggestFragment) objArr[0];
        CardSuggestionThemeModel cardSuggestionThemeModel = (CardSuggestionThemeModel) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        RecommendCard recommendCard = (RecommendCard) objArr[3];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[4];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        String strOnNavigationEvent = null;
        a(null, null, new byte[]{-110, -109, -110, -110, -109, -108, -109, -110}, 127 - Gravity.getAbsoluteGravity(0, 0), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), cardRecommendSuggestFragment.access000());
        List listIAuthTabCallback = cardSuggestionThemeModel.IAuthTabCallback();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIAuthTabCallback, 10));
        Iterator it = listIAuthTabCallback.iterator();
        while (it.hasNext()) {
            int i2 = IAuthTabCallback_Parcel + 51;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                arrayList.add(Long.valueOf(((RecommendCard) it.next()).onWarmupCompleted()));
                throw null;
            }
            arrayList.add(Long.valueOf(((RecommendCard) it.next()).onWarmupCompleted()));
            int i3 = access100 + 15;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        }
        setDetectableSize.onExtraCallback("card_id_list", WifiManagerBridgeExtension2.IAuthTabCallback(arrayList));
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent3 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        setDetectableSize.onExtraCallback("card_category", (String) CardSuggestionThemeModel.onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent, 2010165480, -2010165479, iOnNavigationEvent2, new Object[]{cardSuggestionThemeModel}, iOnNavigationEvent3));
        setDetectableSize.onExtraCallback("section_order", Integer.valueOf(iIntValue + 1));
        setDetectableSize.onExtraCallback("card_id", Long.valueOf(recommendCard.onWarmupCompleted()));
        setDetectableSize.onExtraCallback("card_name", recommendCard.onTransact());
        setDetectableSize.onExtraCallback("card_desc", recommendCard.asInterface());
        setDetectableSize.onExtraCallback("section_title", cardSuggestionThemeModel.IAuthTabCallbackStub());
        CardSuggestionResp cardSuggestionResp = cardRecommendSuggestFragment.onExtraCallbackWithResult;
        if (cardSuggestionResp != null) {
            int i5 = access100 + 5;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 == 0) {
                cardSuggestionResp.onNavigationEvent();
                throw null;
            }
            CardSuggestionHeaderModel cardSuggestionHeaderModelOnNavigationEvent = cardSuggestionResp.onNavigationEvent();
            if (cardSuggestionHeaderModelOnNavigationEvent != null) {
                int i6 = access100 + 105;
                IAuthTabCallback_Parcel = i6 % 128;
                if (i6 % 2 == 0) {
                    strOnNavigationEvent = cardSuggestionHeaderModelOnNavigationEvent.onNavigationEvent();
                    int i7 = 50 / 0;
                } else {
                    strOnNavigationEvent = cardSuggestionHeaderModelOnNavigationEvent.onNavigationEvent();
                }
            } else {
                int i8 = access100 + 105;
                IAuthTabCallback_Parcel = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        setDetectableSize.onExtraCallback("screen_title", strOnNavigationEvent);
        setDetectableSize.onExtraCallback("benefit", recommendCard.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CardRecommendSuggestFragment cardRecommendSuggestFragment = (CardRecommendSuggestFragment) objArr[0];
        CardSuggestionThemeModel cardSuggestionThemeModel = (CardSuggestionThemeModel) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        RecommendCard recommendCard = (RecommendCard) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        int i = 2 % 2;
        int i2 = access100 + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (!zBooleanValue) {
            return Unit.INSTANCE;
        }
        ConvertByteArrayToFloatArray.onExtraCallback(1249799L, false, (String) null, (Map) null, new CardRecommendSuggestFragment$.ExternalSyntheticLambda8(cardRecommendSuggestFragment, cardSuggestionThemeModel, iIntValue, recommendCard), 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i3 = access100 + 79;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(RecommendCard recommendCard, CardSuggestionThemeModel cardSuggestionThemeModel, CardRecommendSuggestFragment cardRecommendSuggestFragment, SetDetectableSize setDetectableSize) throws Throwable {
        CardSuggestionHeaderModel cardSuggestionHeaderModelOnNavigationEvent;
        int i = 2 % 2;
        int i2 = access100 + 95;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", Long.valueOf(recommendCard.onWarmupCompleted()));
        setDetectableSize.onExtraCallback("card_category", (String) CardSuggestionThemeModel.onExtraCallbackWithResult(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 2010165480, -2010165479, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{cardSuggestionThemeModel}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent()));
        setDetectableSize.onExtraCallback("card_name", recommendCard.onTransact());
        setDetectableSize.onExtraCallback("card_desc", recommendCard.asInterface());
        Object[] objArr = new Object[1];
        String strOnNavigationEvent = null;
        a(null, null, new byte[]{-110, -109, -110, -110, -109, -108, -109, -110}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), cardRecommendSuggestFragment.access000());
        CardSuggestionResp cardSuggestionResp = cardRecommendSuggestFragment.onExtraCallbackWithResult;
        if (cardSuggestionResp == null || (cardSuggestionHeaderModelOnNavigationEvent = cardSuggestionResp.onNavigationEvent()) == null) {
            int i4 = IAuthTabCallback_Parcel + 75;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = IAuthTabCallback_Parcel + 5;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            strOnNavigationEvent = cardSuggestionHeaderModelOnNavigationEvent.onNavigationEvent();
            int i8 = access100 + 25;
            IAuthTabCallback_Parcel = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 3 % 5;
            }
        }
        setDetectableSize.onExtraCallback("screen_title", strOnNavigationEvent);
        setDetectableSize.onExtraCallback("benefit", recommendCard.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(CardRecommendSuggestFragment cardRecommendSuggestFragment, RecommendCard recommendCard, CardSuggestionThemeModel cardSuggestionThemeModel, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(view, "");
        SessionTrackerb sessionTrackerbIAuthTabCallback = cardRecommendSuggestFragment.IAuthTabCallback();
        BaseActivity baseActivityRequireBaseActivity = cardRecommendSuggestFragment.requireBaseActivity();
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        String str2 = (String) RecommendCard.onExtraCallbackWithResult(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{recommendCard}, 1482030138, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1482030138);
        String strAccess000 = cardRecommendSuggestFragment.access000();
        if (strAccess000 == null) {
            int i4 = access100 + 29;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = strAccess000;
        }
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-110, -109, -110, -110, -109, -108, -109, -110}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, objArr);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbIAuthTabCallback, baseActivityRequireBaseActivity, convertAnyToMap.IAuthTabCallback(str2, ((String) objArr[0]).intern(), str), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        ConvertByteArrayToFloatArray.onExtraCallback(1012103L, false, (String) null, (Map) null, new CardRecommendSuggestFragment$.ExternalSyntheticLambda14(recommendCard, cardSuggestionThemeModel, cardRecommendSuggestFragment), 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i6 = access100 + 37;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private final View onExtraCallbackWithResult(CardSuggestionResp cardSuggestionResp) {
        int iOnExtraCallbackWithResult;
        int i = 2 % 2;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setOrientation(1);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsTopV1View tdsTopV1View = new TdsTopV1View(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsTopV1View.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP3);
        tdsTopV1View.setUpperText(cardSuggestionResp.onNavigationEvent().onNavigationEvent());
        tdsTopV1View.setLowerType(TdsTopV1View.onNavigationEvent.TOP5);
        tdsTopV1View.setLowerText(cardSuggestionResp.onNavigationEvent().IAuthTabCallback());
        setMinWebSocketMessageToCompressokhttp.onNavigationEvent(tdsTopV1View, varyMatches.IAuthTabCallback(tdsTopV1View, 24));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsTopV1View);
        Iterator<T> it = cardSuggestionResp.onWarmupCompleted().iterator();
        int i2 = access100 + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 4;
        }
        int i4 = 0;
        while (it.hasNext()) {
            int i5 = access100 + 123;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 == 0) {
                it.next();
                throw null;
            }
            Object next = it.next();
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
                int i6 = IAuthTabCallback_Parcel + 45;
                access100 = i6 % 128;
                int i7 = i6 % 2;
            }
            Object[] objArr = {this, (CardSuggestionThemeModel) next, Integer.valueOf(i4)};
            int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            linearLayout.addView((View) onExtraCallbackWithResult(2063848963, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult2, -2063848958));
            View view = new View(linearLayout.getContext());
            Class cls = Integer.TYPE;
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) ViewGroup.MarginLayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
            Intrinsics.checkNotNull(layoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = varyMatches.IAuthTabCallback(view, 16);
            marginLayoutParams.topMargin = varyMatches.IAuthTabCallback(view, 16);
            view.setLayoutParams(layoutParams);
            if (CollectionsKt.getLastIndex(cardSuggestionResp.onWarmupCompleted()) != i4) {
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                Resources resources = context2.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                Configuration configuration = resources.getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                iOnExtraCallbackWithResult = new getDEFAULT_CONNECTION_SPECSokhttp(new IAuthTabCallback(configuration)).onExtraCallbackWithResult();
            } else {
                iOnExtraCallbackWithResult = 0;
            }
            view.setBackgroundColor(iOnExtraCallbackWithResult);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, view);
            i4++;
        }
        return linearLayout;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        CardRecommendSuggestFragment cardRecommendSuggestFragment = (CardRecommendSuggestFragment) objArr[0];
        CardSuggestionThemeModel cardSuggestionThemeModel = (CardSuggestionThemeModel) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Context contextRequireContext = cardRecommendSuggestFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setOrientation(1);
        getRouteDatabase.IAuthTabCallback(linearLayout, new CardRecommendSuggestFragment$.ExternalSyntheticLambda10(cardSuggestionThemeModel, cardRecommendSuggestFragment));
        cardRecommendSuggestFragment.onTransact.onExtraCallbackWithResult(linearLayout, new CardRecommendSuggestFragment$.ExternalSyntheticLambda11(cardRecommendSuggestFragment, cardSuggestionThemeModel, iIntValue));
        int i2 = 0;
        for (Object obj : cardSuggestionThemeModel.IAuthTabCallback()) {
            if (i2 < 0) {
                int i3 = IAuthTabCallback_Parcel + 33;
                access100 = i3 % 128;
                if (i3 % 2 != 0) {
                    CollectionsKt.throwIndexOverflow();
                    int i4 = 43 / 0;
                } else {
                    CollectionsKt.throwIndexOverflow();
                }
            }
            RecommendCard recommendCard = (RecommendCard) obj;
            Context context = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
            tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
            tdsListRowV1View.setLeftImageSize(varyMatches.IAuthTabCallback(tdsListRowV1View, 38), varyMatches.IAuthTabCallback(tdsListRowV1View, 50));
            RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(tdsListRowV1View.getContext()).onExtraCallback(recommendCard.IAuthTabCallbackDefault().onExtraCallbackWithResult());
            int i5 = im.toss.uikit.R.drawable.credit_card_row_icon_placeholder_vertical;
            tdsListRowV1View.setLeftImage(RecomposerrecompositionRunner2.IAuthTabCallback(zzbe.onNavigationEvent(zzbe.onWarmupCompleted(onnavigationeventOnExtraCallback, i5, tdsListRowV1View.getContext()), i5, tdsListRowV1View.getContext()), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new RotateTransformation(recommendCard.IAuthTabCallbackDefault().IAuthTabCallback() ? 90.0f : 0.0f)}));
            linearLayout.setDividerPadding(varyMatches.IAuthTabCallback(tdsListRowV1View, 4));
            tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2F);
            tdsListRowV1View.setCenterText1(recommendCard.onTransact());
            tdsListRowV1View.setCenterText2(recommendCard.asInterface());
            tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.BADGE);
            tdsListRowV1View.setRightBadgeTheme(TdsBadgeV1View.onWarmupCompleted.BLUE, TdsBadgeV1View.onExtraCallback.WEAK_ROUND, TdsBadgeV1View.IAuthTabCallback.SMALL);
            tdsListRowV1View.setRightBadgeText(recommendCard.onExtraCallbackWithResult());
            tdsListRowV1View.setPaddingTop(varyMatches.IAuthTabCallback(tdsListRowV1View, 16));
            tdsListRowV1View.setPaddingBottom(varyMatches.IAuthTabCallback(tdsListRowV1View, 16));
            cardRecommendSuggestFragment.onTransact.onExtraCallbackWithResult(tdsListRowV1View, new CardRecommendSuggestFragment$.ExternalSyntheticLambda12(cardRecommendSuggestFragment, cardSuggestionThemeModel, iIntValue, recommendCard));
            setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, new Object[]{tdsListRowV1View, new CardRecommendSuggestFragment$.ExternalSyntheticLambda13(cardRecommendSuggestFragment, recommendCard, cardSuggestionThemeModel)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View);
            i2++;
        }
        int i6 = IAuthTabCallback_Parcel + 13;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return linearLayout;
    }

    public static /* synthetic */ Unit onExtraCallback(CardRecommendSuggestFragment cardRecommendSuggestFragment, RecommendCard recommendCard, CardSuggestionThemeModel cardSuggestionThemeModel, View view) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(2134961316, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{cardRecommendSuggestFragment, recommendCard, cardSuggestionThemeModel, view}, iOnExtraCallbackWithResult, -2134961312);
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardRecommendSuggestFragment cardRecommendSuggestFragment, CardSuggestionThemeModel cardSuggestionThemeModel, int i, boolean z) {
        Object[] objArr = {cardRecommendSuggestFragment, cardSuggestionThemeModel, Integer.valueOf(i), Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(1751819699, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr, iOnExtraCallbackWithResult, -1751819692);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardRecommendSuggestFragment cardRecommendSuggestFragment, CardSuggestionThemeModel cardSuggestionThemeModel, int i, SetDetectableSize setDetectableSize) {
        Object[] objArr = {cardRecommendSuggestFragment, cardSuggestionThemeModel, Integer.valueOf(i), setDetectableSize};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(-2082334240, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr, iOnExtraCallbackWithResult, 2082334240);
    }

    private final View onNavigationEvent(CardSuggestionThemeModel cardSuggestionThemeModel, int i) {
        Object[] objArr = {this, cardSuggestionThemeModel, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (View) onExtraCallbackWithResult(2063848963, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr, iOnExtraCallbackWithResult, -2063848958);
    }

    private static final Unit IAuthTabCallback(CardRecommendSuggestFragment cardRecommendSuggestFragment, CardSuggestionThemeModel cardSuggestionThemeModel, int i, RecommendCard recommendCard, boolean z) {
        Object[] objArr = {cardRecommendSuggestFragment, cardSuggestionThemeModel, Integer.valueOf(i), recommendCard, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(1572364551, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr, iOnExtraCallbackWithResult, -1572364548);
    }

    private static final Unit onExtraCallback(CardRecommendSuggestFragment cardRecommendSuggestFragment, CardSuggestionThemeModel cardSuggestionThemeModel, int i, RecommendCard recommendCard, SetDetectableSize setDetectableSize) {
        Object[] objArr = {cardRecommendSuggestFragment, cardSuggestionThemeModel, Integer.valueOf(i), recommendCard, setDetectableSize};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(-281067988, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr, iOnExtraCallbackWithResult, 281067990);
    }

    private final sendUdpMessage onTransact() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (sendUdpMessage) onExtraCallbackWithResult(835513660, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{this}, iOnExtraCallbackWithResult, -835513654);
    }

    private static final boolean onExtraCallbackWithResult(Boolean bool) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(-260314964, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{bool}, iOnExtraCallbackWithResult, 260314965)).booleanValue();
    }

    static void onNavigationEvent() {
        IAuthTabCallbackDefault = new char[]{32612, 32398, 44302, 48130, 44142, 46946, 47109, 32389, 47306, 47090, 54006, 45330, 45578, 43478, 52830, 50418, 32440, 32508, 32449, 32448};
        asBinder = -1184333970;
        IAuthTabCallbackStub = true;
        asInterface = true;
    }
}
