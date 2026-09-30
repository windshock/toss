package viva.republica.toss.cardrecommend.issuev2.ui.addressinfo;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.featurescommon.address.model.AddressDisplayOption;
import im.toss.featurescommon.address.model.AddressType;
import im.toss.featurescommon.address.model.LocalUserAddress;
import im.toss.featurescommon.address.search.RoadAddress;
import im.toss.featurescommon.address.search.Sido;
import im.toss.featurescommon.companysearch.model.CompanyInfo;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.GriverRootView;
import o.NativeAdLayoutApi;
import o.RippleNode;
import o.SignerInfo;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TinyAppBackHomeExtension;
import o.TypographyKtExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15400;
import o.access8100;
import o.checkApFlag;
import o.findResAndMsg;
import o.forceDomainCheck;
import o.getDigestAlgorithms;
import o.getEncryptedData;
import o.getParamImp;
import o.getPxFromResourceId;
import o.getWrite;
import o.initMiniApp;
import o.isDebugBuild;
import o.maybeUpdateAnimatable;
import o.onRenderReady;
import o.onSwitchToCustomTheme;
import o.setMakeTitleMax;
import o.setRandomHost;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.addressinfo.CreditCardIssueAddressSelectFragment$onExtraCallback;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class CreditCardIssueAddressSelectFragment$onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ Bundle $savedInstanceState;
    int label;
    final /* synthetic */ CreditCardIssueAddressSelectFragment this$0;

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[AddressType.values().length];
            try {
                iArr[AddressType.Home.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddressType.Company.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreditCardIssueAddressSelectFragment$onExtraCallback(CreditCardIssueAddressSelectFragment creditCardIssueAddressSelectFragment, Bundle bundle, access13800<? super CreditCardIssueAddressSelectFragment$onExtraCallback> access13800Var) {
        super(2, access13800Var);
        this.this$0 = creditCardIssueAddressSelectFragment;
        this.$savedInstanceState = bundle;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        return new CreditCardIssueAddressSelectFragment$onExtraCallback(this.this$0, this.$savedInstanceState, access13800Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOnExtraCallback;
        boolean z;
        List listListOf;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i = this.label;
        if (i == 0) {
            ResultKt.onNavigationEvent(obj);
            if (!this.this$0.readTypedObject().onTransact()) {
                onSwitchToCustomTheme onswitchtocustomthemeOnWarmupCompleted = this.this$0.onWarmupCompleted();
                this.label = 1;
                objOnExtraCallback = onswitchtocustomthemeOnWarmupCompleted.onExtraCallback(this);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            setMakeTitleMax setmaketitlemaxOnNavigationEvent = this.this$0.onNavigationEvent();
            String string = this.this$0.getString(R.string.app_fragment_credit_card_issue_address___c4e425fa30);
            Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
            String strOnActivityResized = this.this$0.extraCallback().onActivityResized();
            if (!z) {
                listListOf = CollectionsKt.listOf(new AddressType[]{AddressType.Home, AddressType.Company});
            } else {
                listListOf = CollectionsKt.listOf(AddressType.Home);
            }
            TinyAppBackHomeExtension tinyAppBackHomeExtension = new TinyAppBackHomeExtension((AddressDisplayOption) null, "toss_plcc", string, (String) null, (Long) null, (Integer) null, strOnActivityResized, (getPxFromResourceId) null, listListOf, false, this.this$0.readTypedObject().onExtraCallbackWithResult(), false, false, (Sido) null, (String) null, (String) null, false, (String) null, 254137, (DefaultConstructorMarker) null);
            final CreditCardIssueAddressSelectFragment creditCardIssueAddressSelectFragment = this.this$0;
            Function1 function1 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.addressinfo.CreditCardIssueAddressSelectFragment$onViewCreated$1$$ExternalSyntheticLambda0
                public final Object invoke(Object obj2) {
                    return CreditCardIssueAddressSelectFragment$onExtraCallback.onExtraCallback(creditCardIssueAddressSelectFragment, (List) obj2);
                }
            };
            final CreditCardIssueAddressSelectFragment creditCardIssueAddressSelectFragment2 = this.this$0;
            Function2 function2 = new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.addressinfo.CreditCardIssueAddressSelectFragment$onViewCreated$1$$ExternalSyntheticLambda1
                public final Object invoke(Object obj2, Object obj3) {
                    return CreditCardIssueAddressSelectFragment$onExtraCallback.onWarmupCompleted(creditCardIssueAddressSelectFragment2, (AddressType) obj2, (String) obj3);
                }
            };
            final CreditCardIssueAddressSelectFragment creditCardIssueAddressSelectFragment3 = this.this$0;
            Fragment fragmentOnWarmupCompleted = setmaketitlemaxOnNavigationEvent.onWarmupCompleted(tinyAppBackHomeExtension, new GriverRootView(function1, function2, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.addressinfo.CreditCardIssueAddressSelectFragment$onViewCreated$1$$ExternalSyntheticLambda2
                public final Object invoke(Object obj2) {
                    return CreditCardIssueAddressSelectFragment$onExtraCallback.IAuthTabCallback(creditCardIssueAddressSelectFragment3, (String) obj2);
                }
            }));
            if (this.$savedInstanceState == null) {
                this.this$0.getChildFragmentManager().onExtraCallbackWithResult().onWarmupCompleted(R.id.container, fragmentOnWarmupCompleted).onExtraCallbackWithResult();
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(obj);
        objOnExtraCallback = obj;
        CompanyInfo companyInfo = (CompanyInfo) objOnExtraCallback;
        z = companyInfo != null && companyInfo.getInterfaceDescriptor();
        setMakeTitleMax setmaketitlemaxOnNavigationEvent2 = this.this$0.onNavigationEvent();
        String string2 = this.this$0.getString(R.string.app_fragment_credit_card_issue_address___c4e425fa30);
        Intrinsics.checkNotNullExpressionValue(string2, BuildConfig.FLAVOR);
        String strOnActivityResized2 = this.this$0.extraCallback().onActivityResized();
        if (!z) {
        }
        TinyAppBackHomeExtension tinyAppBackHomeExtension2 = new TinyAppBackHomeExtension((AddressDisplayOption) null, "toss_plcc", string2, (String) null, (Long) null, (Integer) null, strOnActivityResized2, (getPxFromResourceId) null, listListOf, false, this.this$0.readTypedObject().onExtraCallbackWithResult(), false, false, (Sido) null, (String) null, (String) null, false, (String) null, 254137, (DefaultConstructorMarker) null);
        final CreditCardIssueAddressSelectFragment creditCardIssueAddressSelectFragment4 = this.this$0;
        Function1 function12 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.addressinfo.CreditCardIssueAddressSelectFragment$onViewCreated$1$$ExternalSyntheticLambda0
            public final Object invoke(Object obj2) {
                return CreditCardIssueAddressSelectFragment$onExtraCallback.onExtraCallback(creditCardIssueAddressSelectFragment4, (List) obj2);
            }
        };
        final CreditCardIssueAddressSelectFragment creditCardIssueAddressSelectFragment22 = this.this$0;
        Function2 function22 = new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.addressinfo.CreditCardIssueAddressSelectFragment$onViewCreated$1$$ExternalSyntheticLambda1
            public final Object invoke(Object obj2, Object obj3) {
                return CreditCardIssueAddressSelectFragment$onExtraCallback.onWarmupCompleted(creditCardIssueAddressSelectFragment22, (AddressType) obj2, (String) obj3);
            }
        };
        final CreditCardIssueAddressSelectFragment creditCardIssueAddressSelectFragment32 = this.this$0;
        Fragment fragmentOnWarmupCompleted2 = setmaketitlemaxOnNavigationEvent2.onWarmupCompleted(tinyAppBackHomeExtension2, new GriverRootView(function12, function22, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.addressinfo.CreditCardIssueAddressSelectFragment$onViewCreated$1$$ExternalSyntheticLambda2
            public final Object invoke(Object obj2) {
                return CreditCardIssueAddressSelectFragment$onExtraCallback.IAuthTabCallback(creditCardIssueAddressSelectFragment32, (String) obj2);
            }
        }));
        if (this.$savedInstanceState == null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit onExtraCallback(CreditCardIssueAddressSelectFragment creditCardIssueAddressSelectFragment, List list) {
        Object next;
        Object next2;
        String str;
        String strOnPostMessage;
        String strOnExtraCallback;
        String strOnExtraCallback2;
        String strOnPostMessage2;
        String strOnExtraCallback3;
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((checkApFlag) next).asBinder().IAuthTabCallbackStub() == AddressType.Home) {
                break;
            }
        }
        checkApFlag checkapflag = (checkApFlag) next;
        if (checkapflag == null) {
            return Unit.INSTANCE;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((checkApFlag) next2).asBinder().IAuthTabCallbackStub() == AddressType.Company) {
                break;
            }
        }
        checkApFlag checkapflag2 = (checkApFlag) next2;
        if (checkapflag2 != null) {
            LocalUserAddress localUserAddressAsBinder = checkapflag2.asBinder();
            String strIAuthTabCallback = localUserAddressAsBinder.IAuthTabCallback();
            String str2 = strIAuthTabCallback == null ? BuildConfig.FLAVOR : strIAuthTabCallback;
            String strOnExtraCallback4 = localUserAddressAsBinder.onExtraCallback();
            String str3 = strOnExtraCallback4 == null ? BuildConfig.FLAVOR : strOnExtraCallback4;
            RoadAddress roadAddressExtraCallbackWithResult = localUserAddressAsBinder.extraCallbackWithResult();
            String str4 = (roadAddressExtraCallbackWithResult == null || (strOnExtraCallback3 = roadAddressExtraCallbackWithResult.onExtraCallback()) == null) ? BuildConfig.FLAVOR : strOnExtraCallback3;
            RoadAddress roadAddressExtraCallbackWithResult2 = localUserAddressAsBinder.extraCallbackWithResult();
            if (roadAddressExtraCallbackWithResult2 != null) {
                String str5 = (String) RoadAddress.onExtraCallback(forceDomainCheck.IAuthTabCallback(), new Object[]{roadAddressExtraCallbackWithResult2}, forceDomainCheck.IAuthTabCallback(), -248721665, forceDomainCheck.IAuthTabCallback(), 248721667, forceDomainCheck.IAuthTabCallback());
                String str6 = str5 == null ? BuildConfig.FLAVOR : str5;
                RoadAddress roadAddressExtraCallbackWithResult3 = localUserAddressAsBinder.extraCallbackWithResult();
                NativeAdLayoutApi nativeAdLayoutApi = new NativeAdLayoutApi(str2, str3, str4, str6, (roadAddressExtraCallbackWithResult3 == null || (strOnPostMessage2 = roadAddressExtraCallbackWithResult3.onPostMessage()) == null) ? BuildConfig.FLAVOR : strOnPostMessage2);
                SignerInfo signerInfoIAuthTabCallbackDefault = creditCardIssueAddressSelectFragment.extraCallback().IAuthTabCallbackDefault();
                creditCardIssueAddressSelectFragment.extraCallback().onExtraCallback(new SignerInfo(localUserAddressAsBinder.IAuthTabCallbackDefault(), nativeAdLayoutApi, localUserAddressAsBinder.onTransact(), signerInfoIAuthTabCallbackDefault != null ? signerInfoIAuthTabCallbackDefault.onExtraCallbackWithResult() : null));
                if (checkapflag2.IAuthTabCallback() && (strOnExtraCallback2 = CreditCardIssueAddressSelectFragment.onExtraCallback(creditCardIssueAddressSelectFragment)) != null && !StringsKt.isBlank(strOnExtraCallback2)) {
                    CreditCardIssueAddressSelectFragment.IAuthTabCallback(creditCardIssueAddressSelectFragment, strOnExtraCallback2);
                    return Unit.INSTANCE;
                }
            }
        }
        String strIAuthTabCallback2 = checkapflag.asBinder().IAuthTabCallback();
        String str7 = strIAuthTabCallback2 == null ? BuildConfig.FLAVOR : strIAuthTabCallback2;
        String strOnExtraCallback5 = checkapflag.asBinder().onExtraCallback();
        String str8 = strOnExtraCallback5 == null ? BuildConfig.FLAVOR : strOnExtraCallback5;
        RoadAddress roadAddressExtraCallbackWithResult4 = checkapflag.asBinder().extraCallbackWithResult();
        String str9 = (roadAddressExtraCallbackWithResult4 == null || (strOnExtraCallback = roadAddressExtraCallbackWithResult4.onExtraCallback()) == null) ? BuildConfig.FLAVOR : strOnExtraCallback;
        RoadAddress roadAddressExtraCallbackWithResult5 = checkapflag.asBinder().extraCallbackWithResult();
        if (roadAddressExtraCallbackWithResult5 != null) {
            String str10 = (String) RoadAddress.onExtraCallback(forceDomainCheck.IAuthTabCallback(), new Object[]{roadAddressExtraCallbackWithResult5}, forceDomainCheck.IAuthTabCallback(), -248721665, forceDomainCheck.IAuthTabCallback(), 248721667, forceDomainCheck.IAuthTabCallback());
            str = str10 == null ? BuildConfig.FLAVOR : str10;
        }
        RoadAddress roadAddressExtraCallbackWithResult6 = checkapflag.asBinder().extraCallbackWithResult();
        NativeAdLayoutApi nativeAdLayoutApi2 = new NativeAdLayoutApi(str7, str8, str9, str, (roadAddressExtraCallbackWithResult6 == null || (strOnPostMessage = roadAddressExtraCallbackWithResult6.onPostMessage()) == null) ? BuildConfig.FLAVOR : strOnPostMessage);
        creditCardIssueAddressSelectFragment.extraCallback().onNavigationEvent(nativeAdLayoutApi2);
        maybeUpdateAnimatable.onNavigationEvent(onRenderReady.onExtraCallback(creditCardIssueAddressSelectFragment), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(creditCardIssueAddressSelectFragment, checkapflag.IAuthTabCallback(), nativeAdLayoutApi2, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int[] IAuthTabCallback = {1313927084, -686045539, -189149405, 393798554, -1718443605, -138452804, -391263684, -317668369, 1992222296, -1217841504, 1634737911, -1637736623, 2010486203, -240761565, 788782450, 897574887, -1062209586, -1538801938};
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ NativeAdLayoutApi $homeAddress;
        final /* synthetic */ boolean $isSelectedHome;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        final /* synthetic */ CreditCardIssueAddressSelectFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(CreditCardIssueAddressSelectFragment creditCardIssueAddressSelectFragment, boolean z, NativeAdLayoutApi nativeAdLayoutApi, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.this$0 = creditCardIssueAddressSelectFragment;
            this.$isSelectedHome = z;
            this.$homeAddress = nativeAdLayoutApi;
        }

        public static /* synthetic */ Unit onNavigationEvent(CreditCardIssueAddressSelectFragment creditCardIssueAddressSelectFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(creditCardIssueAddressSelectFragment, commonModule_setLeftEdgeTouchEnabled);
                throw null;
            }
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditCardIssueAddressSelectFragment, commonModule_setLeftEdgeTouchEnabled);
            int i3 = onExtraCallbackWithResult + 3;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 14 / 0;
            }
            return unitOnExtraCallbackWithResult;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 8 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.this$0, this.$isSelectedHome, this.$homeAddress, access13800Var);
            int i2 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 28 / 0;
            }
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        private static final Unit onExtraCallbackWithResult(CreditCardIssueAddressSelectFragment creditCardIssueAddressSelectFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            commonModule_setLeftEdgeTouchEnabled.onExtraCallback(creditCardIssueAddressSelectFragment.getString(R.string.app_credit_card_issue_address_invalid_address));
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 0;
            }
            return unit;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            Context contextRequireContext;
            boolean z;
            initMiniApp initminiapp;
            Function0 function0;
            Function1 function1;
            int i;
            String strOnExtraCallbackWithResult;
            String strIntern;
            Object obj3;
            Object objIAuthTabCallback;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i5 = this.label;
            try {
                if (i5 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    CreditCardIssueAddressSelectFragment creditCardIssueAddressSelectFragment = this.this$0;
                    boolean z2 = this.$isSelectedHome;
                    Result.Companion companion = Result.Companion;
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    objIAuthTabCallback = CreditCardIssueAddressSelectFragment.IAuthTabCallback(creditCardIssueAddressSelectFragment, z2, this);
                    if (objIAuthTabCallback == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = onWarmupCompleted + 93;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    ResultKt.onNavigationEvent(obj);
                    objIAuthTabCallback = obj;
                }
                obj2 = Result.constructor-impl(objIAuthTabCallback);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            final CreditCardIssueAddressSelectFragment creditCardIssueAddressSelectFragment2 = this.this$0;
            boolean z3 = this.$isSelectedHome;
            NativeAdLayoutApi nativeAdLayoutApi = this.$homeAddress;
            if (Result.onNavigationEvent(obj2)) {
                if (((Boolean) obj2).booleanValue()) {
                    getDigestAlgorithms getdigestalgorithmsWriteTypedObject = creditCardIssueAddressSelectFragment2.writeTypedObject();
                    TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(creditCardIssueAddressSelectFragment2);
                    CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = creditCardIssueAddressSelectFragment2.extraCallback();
                    SignerInfo signerInfoIAuthTabCallbackDefault = creditCardIssueAddressSelectFragment2.extraCallback().IAuthTabCallbackDefault();
                    NativeAdLayoutApi nativeAdLayoutApiIAuthTabCallback = signerInfoIAuthTabCallbackDefault != null ? signerInfoIAuthTabCallbackDefault.IAuthTabCallback() : null;
                    SignerInfo signerInfoIAuthTabCallbackDefault2 = creditCardIssueAddressSelectFragment2.extraCallback().IAuthTabCallbackDefault();
                    String strOnNavigationEvent = signerInfoIAuthTabCallbackDefault2 != null ? signerInfoIAuthTabCallbackDefault2.onNavigationEvent() : null;
                    SignerInfo signerInfoIAuthTabCallbackDefault3 = creditCardIssueAddressSelectFragment2.extraCallback().IAuthTabCallbackDefault();
                    String strOnExtraCallback = signerInfoIAuthTabCallbackDefault3 != null ? signerInfoIAuthTabCallbackDefault3.onExtraCallback() : null;
                    SignerInfo signerInfoIAuthTabCallbackDefault4 = creditCardIssueAddressSelectFragment2.extraCallback().IAuthTabCallbackDefault();
                    if (signerInfoIAuthTabCallbackDefault4 != null) {
                        int i8 = onExtraCallbackWithResult + 89;
                        onWarmupCompleted = i8 % 128;
                        if (i8 % 2 == 0) {
                            signerInfoIAuthTabCallbackDefault4.onExtraCallbackWithResult();
                            throw null;
                        }
                        strOnExtraCallbackWithResult = signerInfoIAuthTabCallbackDefault4.onExtraCallbackWithResult();
                    } else {
                        strOnExtraCallbackWithResult = null;
                    }
                    isDebugBuild isdebugbuild = new isDebugBuild(nativeAdLayoutApi, nativeAdLayoutApiIAuthTabCallback, strOnNavigationEvent, strOnExtraCallback, null, strOnExtraCallbackWithResult, z3 ? "HOME" : "OFFICE", creditCardIssueAddressSelectFragment2.extraCallback().ICustomTabsCallbackDefault());
                    if (z3) {
                        int i9 = onExtraCallbackWithResult + 57;
                        onWarmupCompleted = i9 % 128;
                        if (i9 % 2 == 0) {
                            Object[] objArr = new Object[1];
                            a(new int[]{1045240500, 455497370}, (SystemClock.elapsedRealtime() > 1L ? 1 : (SystemClock.elapsedRealtime() == 1L ? 0 : -1)) + 3, objArr);
                            obj3 = objArr[0];
                        } else {
                            Object[] objArr2 = new Object[1];
                            a(new int[]{1045240500, 455497370}, 5 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
                            obj3 = objArr2[0];
                        }
                        strIntern = ((String) obj3).intern();
                    } else {
                        strIntern = "company";
                    }
                    getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnNavigationEvent, cardIssueOverviewViewModelExtraCallback, isdebugbuild, (String) null, (String) null, access8100.onNavigationEvent(getWrite.IAuthTabCallback("card_address_type", strIntern)), 8, (Object) null);
                } else {
                    Context contextRequireContext2 = creditCardIssueAddressSelectFragment2.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, BuildConfig.FLAVOR);
                    CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext2, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.addressinfo.CreditCardIssueAddressSelectFragment$onViewCreated$1$addressSelectFragment$1$1$$ExternalSyntheticLambda0
                        public final Object invoke(Object obj4) {
                            return CreditCardIssueAddressSelectFragment$onExtraCallback.IAuthTabCallback.onNavigationEvent(creditCardIssueAddressSelectFragment2, (CommonModule_setLeftEdgeTouchEnabled) obj4);
                        }
                    });
                }
            }
            CreditCardIssueAddressSelectFragment creditCardIssueAddressSelectFragment3 = this.this$0;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                int i10 = onExtraCallbackWithResult + 123;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 == 0) {
                    contextRequireContext = creditCardIssueAddressSelectFragment3.requireContext();
                    z = true;
                    initminiapp = null;
                    function0 = null;
                    function1 = null;
                    i = 97;
                } else {
                    contextRequireContext = creditCardIssueAddressSelectFragment3.requireContext();
                    z = false;
                    initminiapp = null;
                    function0 = null;
                    function1 = null;
                    i = 30;
                }
                getParamImp.onWarmupCompleted(th, contextRequireContext, z, initminiapp, function0, function1, i, (Object) null);
            }
            return Unit.INSTANCE;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = IAuthTabCallback;
            int i4 = -1469660336;
            long j = 0;
            if (iArr3 != null) {
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int i5 = 0;
                while (i5 < length2) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 73 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr4[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i5++;
                        i4 = -1469660336;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr3 = iArr4;
            }
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = IAuthTabCallback;
            if (iArr6 != null) {
                int i6 = $10 + 79;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i2 = 1;
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i2 = 0;
                }
                while (i2 < length) {
                    Object[] objArr3 = {Integer.valueOf(iArr6[i2])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 72 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i2++;
                }
                iArr6 = iArr2;
            }
            System.arraycopy(iArr6, 0, iArr5, 0, length3);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                int i7 = 0;
                for (int i8 = 16; i7 < i8; i8 = 16) {
                    int i9 = $10 + 109;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i7];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0)), ExpandableListView.getPackedPositionGroup(0L) + 39, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i7++;
                }
                int i11 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i11;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
                int i12 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 4033), 79 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onWarmupCompleted(CreditCardIssueAddressSelectFragment creditCardIssueAddressSelectFragment, AddressType addressType, String str) {
        if (StringsKt.isBlank(str)) {
            return null;
        }
        int i = onExtraCallback.IAuthTabCallback[addressType.ordinal()];
        if (i == 1) {
            return creditCardIssueAddressSelectFragment.readTypedObject().onNavigationEvent(str);
        }
        if (i != 2) {
            return null;
        }
        return creditCardIssueAddressSelectFragment.readTypedObject().onExtraCallback(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String IAuthTabCallback(CreditCardIssueAddressSelectFragment creditCardIssueAddressSelectFragment, String str) {
        if (StringsKt.isBlank(str)) {
            return null;
        }
        if (((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{creditCardIssueAddressSelectFragment.writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).onExtraCallbackWithResult()) {
            return creditCardIssueAddressSelectFragment.readTypedObject().IAuthTabCallback(str);
        }
        return null;
    }
}
