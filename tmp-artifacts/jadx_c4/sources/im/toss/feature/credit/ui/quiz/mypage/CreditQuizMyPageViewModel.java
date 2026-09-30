package im.toss.feature.credit.ui.quiz.mypage;

import android.app.Application;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.credit.CreditBaseViewModel;
import im.toss.features.credit.data.response.Avatar;
import im.toss.features.credit.data.response.MyQuizDetailsResponse;
import im.toss.features.credit.data.response.QuizCta;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityOnPausePoint;
import o.AppDestroyPoint;
import o.AppExitPoint;
import o.CloseableUtils;
import o.ImageLoaderBuilderExternalSyntheticLambda6;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.TextLinkScopeExternalSyntheticLambda7;
import o.TextRoundCornerProgressBarSavedState1;
import o.access13800;
import o.access14300;
import o.addPolicy;
import o.enableJSApiPermissionOpt;
import o.enableStartClientBundleToStringOpt;
import o.findResAndMsg;
import o.getAppAlias;
import o.getBorderRadius;
import o.getCornerRadius;
import o.getShine;
import o.getTileModeX;
import o.h5ScreenShotObserverOnChangeOpt;
import o.maybeUpdateAnimatable;
import o.onUnavailable;
import o.r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE;
import o.setRandomHost;
import o.setRubIn;
import o.setShine;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditQuizMyPageViewModel extends CreditBaseViewModel {
    public static final IAuthTabCallback Companion;
    public static final int IAuthTabCallback = 8;
    private static int ICustomTabsCallback = 1;
    private static int extraCallbackWithResult = 0;
    private static int readTypedObject = 1;
    private static int writeTypedObject;
    private final getAppAlias IAuthTabCallbackDefault;
    private final getBorderRadius<Avatar> IAuthTabCallbackStub;
    private final setRubIn<Result<ActivityOnPausePoint>> IAuthTabCallbackStubProxy;
    private final getTileModeX<String> IAuthTabCallback_Parcel;
    private final TextLinkScopeExternalSyntheticLambda7 access000;
    private final getTileModeX<Avatar> access100;
    private final r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE asBinder;
    private final enableJSApiPermissionOpt asInterface;
    private final ImageLoaderBuilderExternalSyntheticLambda6 getInterfaceDescriptor;
    private final getBorderRadius<String> onExtraCallback;
    private final getCornerRadius<onUnavailable> onExtraCallbackWithResult;
    private final getBorderRadius<AppDestroyPoint> onNavigationEvent;
    private boolean onTransact;
    private final getCornerRadius<Result<ActivityOnPausePoint>> onWarmupCompleted;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        int i = readTypedObject + 75;
        writeTypedObject = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i5 | i);
        int i8 = ~i5;
        int i9 = ~i;
        int i10 = i8 | i9;
        int i11 = i7 | (~(i10 | i4));
        int i12 = i9 | i5;
        int i13 = (~i10) | i4;
        int i14 = i4 + i5 + i3 + ((-1587644119) * i6) + (1302866265 * i2);
        int i15 = i14 * i14;
        int i16 = (i4 * (-1579585154)) + 1163788288 + ((-1579585154) * i5) + ((-914001539) * i11) + (i12 * 914001539) + (914001539 * i13) + ((-665583616) * i3) + (1500774400 * i6) + ((-1456209920) * i2) + ((-2144468992) * i15);
        int i17 = ((i4 * (-855313886)) - 1253577507) + (i5 * (-855313886)) + (i11 * (-13)) + (i12 * 13) + (i13 * 13) + (i3 * (-855313873)) + (i6 * (-1467678585)) + (i2 * 593082711) + (i15 * 74579968);
        int i18 = i16 + (i17 * i17 * (-1668153344));
        if (i18 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i18 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i18 == 3) {
            return IAuthTabCallback(objArr);
        }
        final CreditQuizMyPageViewModel creditQuizMyPageViewModel = (CreditQuizMyPageViewModel) objArr[0];
        final QuizCta quizCta = (QuizCta) objArr[1];
        final AppExitPoint appExitPoint = (AppExitPoint) objArr[2];
        final String str = (String) objArr[3];
        int i19 = 2 % 2;
        Intrinsics.checkNotNullParameter(appExitPoint, "");
        Intrinsics.checkNotNullParameter(str, "");
        creditQuizMyPageViewModel.getInterfaceDescriptor.onWarmupCompleted(new Function0() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageViewModel$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i20 = 2 % 2;
                int i21 = onExtraCallback + 55;
                onWarmupCompleted = i21 % 128;
                if (i21 % 2 != 0) {
                    CreditQuizMyPageViewModel.onExtraCallbackWithResult(this.f$0, quizCta, appExitPoint, str);
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = CreditQuizMyPageViewModel.onExtraCallbackWithResult(this.f$0, quizCta, appExitPoint, str);
                int i22 = onWarmupCompleted + 105;
                onExtraCallback = i22 % 128;
                if (i22 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        });
        int i20 = extraCallbackWithResult + 17;
        ICustomTabsCallback = i20 % 128;
        int i21 = i20 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditQuizMyPageViewModel creditQuizMyPageViewModel, QuizCta quizCta, AppExitPoint appExitPoint, String str) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 73;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(creditQuizMyPageViewModel, quizCta, appExitPoint, str);
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        return unitOnExtraCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public CreditQuizMyPageViewModel(@NotNull Application application, @NotNull enableStartClientBundleToStringOpt enablestartclientbundletostringopt, @NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7, @NotNull getAppAlias getappalias, @NotNull r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE r8lambdackpzfvkcnb19lbykxqj6b3xvcwe, @NotNull enableJSApiPermissionOpt enablejsapipermissionopt) {
        super(application, enablestartclientbundletostringopt);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(enablestartclientbundletostringopt, "");
        Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
        Intrinsics.checkNotNullParameter(getappalias, "");
        Intrinsics.checkNotNullParameter(r8lambdackpzfvkcnb19lbykxqj6b3xvcwe, "");
        Intrinsics.checkNotNullParameter(enablejsapipermissionopt, "");
        this.access000 = textLinkScopeExternalSyntheticLambda7;
        this.IAuthTabCallbackDefault = getappalias;
        this.asBinder = r8lambdackpzfvkcnb19lbykxqj6b3xvcwe;
        this.asInterface = enablejsapipermissionopt;
        Result.Companion companion = Result.Companion;
        getCornerRadius<Result<ActivityOnPausePoint>> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(Result.IAuthTabCallback(Result.constructor-impl((Object) null)));
        this.onWarmupCompleted = getcornerradiusOnNavigationEvent;
        this.IAuthTabCallbackStubProxy = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent);
        getBorderRadius<Avatar> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.IAuthTabCallbackStub = getborderradiusOnWarmupCompleted;
        this.access100 = ycxycx.onExtraCallbackWithResult(getborderradiusOnWarmupCompleted);
        getBorderRadius<String> getborderradiusOnWarmupCompleted2 = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.onExtraCallback = getborderradiusOnWarmupCompleted2;
        this.IAuthTabCallback_Parcel = ycxycx.onExtraCallbackWithResult(getborderradiusOnWarmupCompleted2);
        this.onExtraCallbackWithResult = setShine.onNavigationEvent((Object) null);
        this.onNavigationEvent = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.getInterfaceDescriptor = new ImageLoaderBuilderExternalSyntheticLambda6(0L, 1, null);
        this.onTransact = true;
    }

    public static final /* synthetic */ Avatar IAuthTabCallback(CreditQuizMyPageViewModel creditQuizMyPageViewModel, Avatar avatar) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 71;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            creditQuizMyPageViewModel.onExtraCallback(avatar);
            throw null;
        }
        Avatar avatarOnExtraCallback = creditQuizMyPageViewModel.onExtraCallback(avatar);
        int i3 = extraCallbackWithResult + 107;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return avatarOnExtraCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CreditQuizMyPageViewModel creditQuizMyPageViewModel = (CreditQuizMyPageViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 71;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        getBorderRadius<String> getborderradius = creditQuizMyPageViewModel.onExtraCallback;
        if (i3 != 0) {
            return getborderradius;
        }
        throw null;
    }

    public static final /* synthetic */ getBorderRadius IAuthTabCallback(CreditQuizMyPageViewModel creditQuizMyPageViewModel) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 37;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        getBorderRadius<AppDestroyPoint> getborderradius = creditQuizMyPageViewModel.onNavigationEvent;
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        return getborderradius;
    }

    public static final /* synthetic */ getBorderRadius IAuthTabCallbackStub(CreditQuizMyPageViewModel creditQuizMyPageViewModel) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 99;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        getBorderRadius<Avatar> getborderradius = creditQuizMyPageViewModel.IAuthTabCallbackStub;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 41;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return getborderradius;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CreditQuizMyPageViewModel creditQuizMyPageViewModel = (CreditQuizMyPageViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 123;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        enableJSApiPermissionOpt enablejsapipermissionopt = creditQuizMyPageViewModel.asInterface;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 15;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return enablejsapipermissionopt;
    }

    public static final /* synthetic */ AppExitPoint onExtraCallbackWithResult(CreditQuizMyPageViewModel creditQuizMyPageViewModel, MyQuizDetailsResponse myQuizDetailsResponse, boolean z) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 79;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        AppExitPoint appExitPointOnWarmupCompleted = creditQuizMyPageViewModel.onWarmupCompleted(myQuizDetailsResponse, z);
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        int i5 = ICustomTabsCallback + 79;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return appExitPointOnWarmupCompleted;
    }

    public static final /* synthetic */ getAppAlias onExtraCallbackWithResult(CreditQuizMyPageViewModel creditQuizMyPageViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 49;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getAppAlias getappalias = creditQuizMyPageViewModel.IAuthTabCallbackDefault;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 59;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return getappalias;
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(CreditQuizMyPageViewModel creditQuizMyPageViewModel, Avatar avatar, String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 125;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = creditQuizMyPageViewModel.IAuthTabCallback(avatar, str);
        int i4 = extraCallbackWithResult + 91;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return zIAuthTabCallback;
    }

    public static final /* synthetic */ TextLinkScopeExternalSyntheticLambda7 onNavigationEvent(CreditQuizMyPageViewModel creditQuizMyPageViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7 = creditQuizMyPageViewModel.access000;
        int i5 = i3 + 117;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return textLinkScopeExternalSyntheticLambda7;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditQuizMyPageViewModel creditQuizMyPageViewModel = (CreditQuizMyPageViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 67;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<Result<ActivityOnPausePoint>> getcornerradius = creditQuizMyPageViewModel.onWarmupCompleted;
        int i5 = i2 + 3;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return getcornerradius;
        }
        throw null;
    }

    public static final /* synthetic */ r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE onWarmupCompleted(CreditQuizMyPageViewModel creditQuizMyPageViewModel) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 43;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE r8lambdackpzfvkcnb19lbykxqj6b3xvcwe = creditQuizMyPageViewModel.asBinder;
        int i5 = i2 + 97;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return r8lambdackpzfvkcnb19lbykxqj6b3xvcwe;
        }
        throw null;
    }

    public final setRubIn<Result<ActivityOnPausePoint>> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 109;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        setRubIn<Result<ActivityOnPausePoint>> setrubin = this.IAuthTabCallbackStubProxy;
        int i5 = i3 + 67;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return setrubin;
    }

    public final getTileModeX<Avatar> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 117;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getTileModeX<Avatar> gettilemodex = this.access100;
        int i5 = i2 + 87;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return gettilemodex;
    }

    public final getTileModeX<String> onNavigationEvent() {
        getTileModeX<String> gettilemodex;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 29;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            gettilemodex = this.IAuthTabCallback_Parcel;
            int i4 = 22 / 0;
        } else {
            gettilemodex = this.IAuthTabCallback_Parcel;
        }
        int i5 = i3 + 27;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return gettilemodex;
    }

    public final getTileModeX<AppDestroyPoint> onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 63;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        getTileModeX<AppDestroyPoint> gettilemodexOnExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult(this.onNavigationEvent);
        int i4 = extraCallbackWithResult + 73;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return gettilemodexOnExtraCallbackWithResult;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 3;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.onTransact;
        int i4 = i2 + 115;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return z;
    }

    public final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 33;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.onTransact = z;
        int i5 = i2 + 53;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        if (this.onTransact) {
            maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(this, (access13800) null), 3, (Object) null);
            int i2 = ICustomTabsCallback + 109;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = ICustomTabsCallback + 105;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final boolean IAuthTabCallback(Avatar avatar, String str) {
        int i = 2 % 2;
        if (!Intrinsics.areEqual(h5ScreenShotObserverOnChangeOpt.Companion.onExtraCallback(this.access000), "credit_quiz")) {
            return false;
        }
        int i2 = ICustomTabsCallback + 3;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (avatar != null || str.length() <= 0) {
            return false;
        }
        int i3 = extraCallbackWithResult + 55;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    private final AppExitPoint onWarmupCompleted(MyQuizDetailsResponse myQuizDetailsResponse, boolean z) {
        int i = 2 % 2;
        if (myQuizDetailsResponse.IAuthTabCallbackStub() != null) {
            int i2 = ICustomTabsCallback + 37;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!r4.isEmpty()) {
                AppExitPoint appExitPoint = AppExitPoint.AVAILABLE;
                int i4 = extraCallbackWithResult + 113;
                ICustomTabsCallback = i4 % 128;
                int i5 = i4 % 2;
                return appExitPoint;
            }
        }
        if (z) {
            int i6 = extraCallbackWithResult + 33;
            ICustomTabsCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return AppExitPoint.COOLTIME;
            }
            int i7 = 31 / 0;
            return AppExitPoint.COOLTIME;
        }
        AppExitPoint appExitPoint2 = AppExitPoint.REQUIRE_ALARM_TERM;
        int i8 = extraCallbackWithResult + 65;
        ICustomTabsCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return appExitPoint2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ QuizCta $cta;
        final /* synthetic */ AppExitPoint $ctaType;
        final /* synthetic */ String $referrer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(QuizCta quizCta, AppExitPoint appExitPoint, String str, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$cta = quizCta;
            this.$ctaType = appExitPoint;
            this.$referrer = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = CreditQuizMyPageViewModel.this.new onNavigationEvent(this.$cta, this.$ctaType, this.$referrer, access13800Var);
            int i2 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 99 / 0;
            }
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallback(findresandmsg, access13800Var);
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 93;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                getBorderRadius getborderradiusIAuthTabCallback = CreditQuizMyPageViewModel.IAuthTabCallback(CreditQuizMyPageViewModel.this);
                AppDestroyPoint appDestroyPoint = new AppDestroyPoint(this.$cta, this.$ctaType, this.$referrer);
                this.label = 1;
                if (getborderradiusIAuthTabCallback.emit(appDestroyPoint, this) == objOnWarmupCompleted) {
                    int i5 = IAuthTabCallback + 61;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallback(CreditQuizMyPageViewModel creditQuizMyPageViewModel, QuizCta quizCta, AppExitPoint appExitPoint, String str) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(creditQuizMyPageViewModel), (CoroutineContext) null, (setRandomHost) null, creditQuizMyPageViewModel.new onNavigationEvent(quizCta, appExitPoint, str, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = extraCallbackWithResult + 109;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Avatar onExtraCallback(Avatar avatar) {
        int iOnTransact;
        String strOnWarmupCompleted;
        String strOnExtraCallback;
        int iOnTransact2;
        String strOnWarmupCompleted2;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 81;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        String str = "";
        if (i2 % 2 == 0) {
            addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult("KEY_LATEST_LEVEL_IMAGE_URL", "");
            addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult("KEY_LATEST_LEVEL_COLOR", "");
            addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult("KEY_LATEST_LEVEL_TITLE", "");
            throw null;
        }
        String strOnExtraCallbackWithResult = addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult("KEY_LATEST_LEVEL_IMAGE_URL", "");
        String strOnExtraCallbackWithResult2 = addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult("KEY_LATEST_LEVEL_COLOR", "");
        String strOnExtraCallbackWithResult3 = addPolicy.ITrustedWebActivityCallbackDefault().onExtraCallbackWithResult("KEY_LATEST_LEVEL_TITLE", "");
        if (avatar != null) {
            iOnTransact = avatar.onTransact();
            int i3 = extraCallbackWithResult + 111;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
        } else {
            iOnTransact = 1;
        }
        Avatar avatar2 = new Avatar((String) null, strOnExtraCallbackWithResult, (String) null, strOnExtraCallbackWithResult3, (String) null, (String) null, iOnTransact - 1, (Integer) null, strOnExtraCallbackWithResult2, 0, 693, (DefaultConstructorMarker) null);
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityCallbackDefault = addPolicy.ITrustedWebActivityCallbackDefault();
        if (avatar != null) {
            int i5 = extraCallbackWithResult + 53;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 == 0) {
                strOnWarmupCompleted = avatar.onWarmupCompleted();
                int i6 = 51 / 0;
                if (strOnWarmupCompleted == null) {
                    strOnWarmupCompleted = "";
                }
            } else {
                strOnWarmupCompleted = avatar.onWarmupCompleted();
                if (strOnWarmupCompleted == null) {
                }
            }
        }
        textRoundCornerProgressBarSavedState1ITrustedWebActivityCallbackDefault.IAuthTabCallback("KEY_LATEST_LEVEL_IMAGE_URL", strOnWarmupCompleted);
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityCallbackDefault2 = addPolicy.ITrustedWebActivityCallbackDefault();
        if (avatar == null || (strOnExtraCallback = avatar.onExtraCallback()) == null) {
            strOnExtraCallback = "";
        }
        textRoundCornerProgressBarSavedState1ITrustedWebActivityCallbackDefault2.IAuthTabCallback("KEY_LATEST_LEVEL_COLOR", strOnExtraCallback);
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityCallbackDefault3 = addPolicy.ITrustedWebActivityCallbackDefault();
        if (avatar != null) {
            int i7 = ICustomTabsCallback + 37;
            extraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            String strIAuthTabCallbackDefault = avatar.IAuthTabCallbackDefault();
            if (strIAuthTabCallbackDefault != null) {
                str = strIAuthTabCallbackDefault;
            }
        }
        textRoundCornerProgressBarSavedState1ITrustedWebActivityCallbackDefault3.IAuthTabCallback("KEY_LATEST_LEVEL_TITLE", str);
        if (avatar != null) {
            int i9 = extraCallbackWithResult + 35;
            ICustomTabsCallback = i9 % 128;
            if (i9 % 2 == 0) {
                avatar.onTransact();
                obj.hashCode();
                throw null;
            }
            iOnTransact2 = avatar.onTransact();
        } else {
            iOnTransact2 = 0;
        }
        if (iOnTransact2 > 0) {
            if (avatar2.onWarmupCompleted().length() > 0) {
                String strOnWarmupCompleted3 = avatar2.onWarmupCompleted();
                if (avatar != null) {
                    int i10 = ICustomTabsCallback + 113;
                    extraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    strOnWarmupCompleted2 = avatar.onWarmupCompleted();
                } else {
                    strOnWarmupCompleted2 = null;
                }
                if (!Intrinsics.areEqual(strOnWarmupCompleted3, strOnWarmupCompleted2)) {
                    return avatar2;
                }
            }
        }
        return null;
    }

    public static final /* synthetic */ enableJSApiPermissionOpt onExtraCallback(CreditQuizMyPageViewModel creditQuizMyPageViewModel) {
        return (enableJSApiPermissionOpt) onExtraCallbackWithResult(new Object[]{creditQuizMyPageViewModel}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1057696043, 1057696045, JsParamKeys.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ getCornerRadius onTransact(CreditQuizMyPageViewModel creditQuizMyPageViewModel) {
        return (getCornerRadius) onExtraCallbackWithResult(new Object[]{creditQuizMyPageViewModel}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -721820142, 721820143, JsParamKeys.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ getBorderRadius asInterface(CreditQuizMyPageViewModel creditQuizMyPageViewModel) {
        return (getBorderRadius) onExtraCallbackWithResult(new Object[]{creditQuizMyPageViewModel}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1074862069, 1074862072, JsParamKeys.onExtraCallbackWithResult());
    }

    public final void IAuthTabCallback(@Nullable QuizCta quizCta, @NotNull AppExitPoint appExitPoint, @NotNull String str) {
        onExtraCallbackWithResult(new Object[]{this, quizCta, appExitPoint, str}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1285714508, 1285714508, JsParamKeys.onExtraCallbackWithResult());
    }
}
