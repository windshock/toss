package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.jakewharton.rxbinding3.view.RxView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.core.cache.RxSharedApiCall;
import im.toss.define.MobileCarrier;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.unifiedsession.api.model.UnifiedSessionType;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import im.toss.uikit.widget.textView.top.TdsTopV1T03View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Pair;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.AdSettingsIntegrationErrorMode;
import o.BaseRoundCornerProgressBar1;
import o.ColorUtils;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ComputeExpression;
import o.DigestInfo;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.ExtraHints;
import o.GriverPhotoSelectActivity7;
import o.GriverPhotoSelectActivity8;
import o.IEngagementSignalsCallback_Parcel;
import o.M_;
import o.NativeAdViewTypeApi;
import o.PageContext;
import o.PlayerErrorCode;
import o.RippleNode;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TitleView;
import o.TransitionTransitionNotificationExternalSyntheticLambda1;
import o.TypographyKtExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15400;
import o.addAllCommandLine;
import o.addExtra;
import o.clearPid;
import o.deserializeLong;
import o.enableAccessibilityOrder;
import o.enableIOSViewClipToPaddingBox;
import o.findResAndMsg;
import o.generateLink;
import o.getByteBuffer;
import o.getDigestAlgorithms;
import o.getIterations;
import o.getParamImp;
import o.getWrite;
import o.initMiniApp;
import o.isRootCA;
import o.isVisibleAnimation;
import o.maybeUpdateAnimatable;
import o.preFillDefault;
import o.response;
import o.setApTextSize;
import o.setMessageBytes;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProtocolsokhttp;
import o.setRandomHost;
import o.transparentBackground;
import o.varyMatches;
import o.zzad;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.common.securekey.SecureKeyboardView;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29;
import viva.republica.toss.network.model.checkcard.RecommendedEnglishName;
import viva.republica.toss.network.model.checkcard.RecommendedEnglishNameResponse;

@EmbeddingAdapterExternalSyntheticLambda1
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CreditCardIssueRrnInputFragment extends Hilt_CreditCardIssueRrnInputFragment<getIterations> {
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallback;

    @Inject
    public zzad environments;
    private final PageContext onNavigationEvent;

    @Inject
    public ColorUtils profileIntent;

    @Inject
    public GriverPhotoSelectActivity8 unifiedSessionProvider;
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted = {new PropertyReference1Impl<>(CreditCardIssueRrnInputFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCreditCardIssueRrnInputBinding;", 0)};
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onExtraCallbackWithResult = 8;

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[DigestInfo.values().length];
            try {
                iArr[DigestInfo.KEY_DELETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DigestInfo.KEY_RESET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
        }
    }

    public static final class onWarmupCompleted<T1, T2, T3, R> implements deserializeLong<T1, T2, T3, R> {
        /* JADX WARN: Multi-variable type inference failed */
        public final R apply(@NotNull T1 t1, @NotNull T2 t2, @NotNull T3 t3) {
            Intrinsics.checkParameterIsNotNull(t1, "");
            Intrinsics.checkParameterIsNotNull(t2, "");
            Intrinsics.checkParameterIsNotNull(t3, "");
            return (R) Boolean.valueOf(((enableAccessibilityOrder.onExtraCallbackWithResult) t1).isOpen() && (((Boolean) t2).booleanValue() || ((Boolean) t3).booleanValue()));
        }
    }

    public CreditCardIssueRrnInputFragment() {
        super(R.layout.fragment_credit_card_issue_rrn_input);
        this.onNavigationEvent = preFillDefault.onExtraCallbackWithResult(this, onExtraCallbackWithResult.onNavigationEvent);
        this.IAuthTabCallback = TitleView.IAuthTabCallback(this, new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueRrnInputFragment$$ExternalSyntheticLambda7
            public final Object invoke() {
                return CreditCardIssueRrnInputFragment.readTypedObject(this.f$0);
            }
        }, (Function0) null, 2, (Object) null);
    }

    public static final class IAuthTabCallbackStub implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public IAuthTabCallbackStub() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            CreditCardIssueRrnInputFragment.this.newAuthTabSession();
        }
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, isRootCA> {
        public static final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(1, isRootCA.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCreditCardIssueRrnInputBinding;", 0);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final isRootCA invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return isRootCA.onWarmupCompleted(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final isRootCA IAuthTabCallbackStub() {
        return (isRootCA) this.onNavigationEvent.onExtraCallbackWithResult(this, onWarmupCompleted[0]);
    }

    private final TdsTopV1T03View onRelationshipValidationResult() {
        TdsTopV1T03View tdsTopV1T03View = IAuthTabCallbackStub().readTypedObject;
        Intrinsics.checkNotNullExpressionValue(tdsTopV1T03View, "");
        return tdsTopV1T03View;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextInputEditText onMinimized() {
        TextInputEditText textInputEditText = IAuthTabCallbackStub().access100;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        return textInputEditText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextInputEditText onUnminimized() {
        TextInputEditText textInputEditText = IAuthTabCallbackStub().extraCallback;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        return textInputEditText;
    }

    private final TextInputEditText access100() {
        TextInputEditText textInputEditText = IAuthTabCallbackStub().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        return textInputEditText;
    }

    private final TextInputEditText IAuthTabCallbackStubProxy() {
        TextInputEditText textInputEditText = IAuthTabCallbackStub().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        return textInputEditText;
    }

    private final TextInputEditText access000() {
        TextInputEditText textInputEditText = IAuthTabCallbackStub().IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        return textInputEditText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TdsButtonV1View asBinder() {
        TdsButtonV1View tdsButtonV1View = IAuthTabCallbackStub().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
        return tdsButtonV1View;
    }

    private final SecureKeyboardView IAuthTabCallback_Parcel() {
        SecureKeyboardView secureKeyboardView = IAuthTabCallbackStub().asInterface;
        Intrinsics.checkNotNullExpressionValue(secureKeyboardView, "");
        return secureKeyboardView;
    }

    private final ConstraintLayout getInterfaceDescriptor() {
        ConstraintLayout constraintLayout = IAuthTabCallbackStub().getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        return constraintLayout;
    }

    private final HorizontalScrollView onActivityResized() {
        HorizontalScrollView horizontalScrollView = IAuthTabCallbackStub().access000;
        Intrinsics.checkNotNullExpressionValue(horizontalScrollView, "");
        return horizontalScrollView;
    }

    private final LinearLayout onMessageChannelReady() {
        LinearLayout linearLayout = IAuthTabCallbackStub().IAuthTabCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    public final ColorUtils onExtraCallback() {
        ColorUtils colorUtils = this.profileIntent;
        if (colorUtils != null) {
            return colorUtils;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final GriverPhotoSelectActivity8 onExtraCallbackWithResult() {
        GriverPhotoSelectActivity8 griverPhotoSelectActivity8 = this.unifiedSessionProvider;
        if (griverPhotoSelectActivity8 != null) {
            return griverPhotoSelectActivity8;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final zzad onWarmupCompleted() {
        zzad zzadVar = this.environments;
        if (zzadVar != null) {
            return zzadVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readTypedObject(final CreditCardIssueRrnInputFragment creditCardIssueRrnInputFragment) {
        if (!creditCardIssueRrnInputFragment.isAdded() || creditCardIssueRrnInputFragment.getView() == null) {
            return Unit.INSTANCE;
        }
        creditCardIssueRrnInputFragment.ICustomTabsService();
        if (creditCardIssueRrnInputFragment.getInterfaceDescriptor().getVisibility() == 0) {
            creditCardIssueRrnInputFragment.access000().postDelayed(new Runnable() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueRrnInputFragment$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CreditCardIssueRrnInputFragment.ICustomTabsCallback(this.f$0);
                }
            }, 1000L);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ICustomTabsCallback(CreditCardIssueRrnInputFragment creditCardIssueRrnInputFragment) {
        Object[] objArr = {M_.onExtraCallback, creditCardIssueRrnInputFragment.access000()};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        M_.onNavigationEvent(1312897292, objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1312897289, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
        creditCardIssueRrnInputFragment.access000().setSelection(0, creditCardIssueRrnInputFragment.access000().length());
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ICustomTabsCallback_Parcel();
        ICustomTabsCallbackDefault();
    }

    private final void ICustomTabsCallback_Parcel() {
        ICustomTabsService();
        Iterator it = CollectionsKt.listOf(new TextInputEditText[]{onMinimized(), onUnminimized(), IAuthTabCallbackStubProxy(), access000()}).iterator();
        while (it.hasNext()) {
            ((TextInputEditText) it.next()).addTextChangedListener(new IAuthTabCallbackStub());
        }
        TextInputEditText textInputEditTextOnUnminimized = onUnminimized();
        textInputEditTextOnUnminimized.setFocusable(true);
        textInputEditTextOnUnminimized.setFocusableInTouchMode(true);
        textInputEditTextOnUnminimized.setShowSoftInputOnFocus(false);
        textInputEditTextOnUnminimized.setTransformationMethod(new TransitionTransitionNotificationExternalSyntheticLambda1());
        ICustomTabsCallbackStubProxy();
        isEngagementSignalsApiAvailable();
        SecureKeyboardView secureKeyboardViewIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        secureKeyboardViewIAuthTabCallback_Parcel.setDarkMode(((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{contextRequireContext}, 194147643, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue());
        IAuthTabCallback_Parcel().setOnSecureKeyListener(new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueRrnInputFragment$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return CreditCardIssueRrnInputFragment.onWarmupCompleted(this.f$0, (DigestInfo) obj);
            }
        });
        ICustomTabsCallbackStub();
        InputFilter inputFilter = new InputFilter() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueRrnInputFragment$$ExternalSyntheticLambda4
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return CreditCardIssueRrnInputFragment.onExtraCallbackWithResult(charSequence, i, i2, spanned, i3, i4);
            }
        };
        IAuthTabCallbackStubProxy().setFilters(new InputFilter[]{new InputFilter.AllCaps(), inputFilter});
        access000().setFilters(new InputFilter[]{new InputFilter.AllCaps(), inputFilter});
        onUnminimized().requestFocus();
        newAuthTabSession();
        asBinder().setText(getString(R.string.next));
        asBinder().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueRrnInputFragment$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreditCardIssueRrnInputFragment.onExtraCallbackWithResult(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(CreditCardIssueRrnInputFragment creditCardIssueRrnInputFragment, DigestInfo digestInfo) {
        Editable text;
        Intrinsics.checkNotNullParameter(digestInfo, "");
        int i = onExtraCallback.onNavigationEvent[digestInfo.ordinal()];
        if (i == 1) {
            Editable text2 = creditCardIssueRrnInputFragment.onUnminimized().getText();
            if (text2 != null && text2.length() != 0 && (text = creditCardIssueRrnInputFragment.onUnminimized().getText()) != null) {
                text.delete(text.length() - 1, text.length());
            }
        } else if (i == 2) {
            Editable text3 = creditCardIssueRrnInputFragment.onUnminimized().getText();
            if (text3 != null) {
                text3.clear();
            }
        } else {
            Editable text4 = creditCardIssueRrnInputFragment.onUnminimized().getText();
            if (text4 != null) {
                text4.append((CharSequence) digestInfo.getTitle());
            }
        }
        creditCardIssueRrnInputFragment.asInterface();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence onExtraCallbackWithResult(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return (charSequence == null || !StringsKt.contains$default(charSequence, " ", false, 2, (Object) null)) ? charSequence : StringsKt.replace$default(charSequence.toString(), " ", "", false, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(CreditCardIssueRrnInputFragment creditCardIssueRrnInputFragment, View view) {
        if (creditCardIssueRrnInputFragment.getInterfaceDescriptor().getVisibility() == 0) {
            TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = creditCardIssueRrnInputFragment.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, creditCardIssueRrnInputFragment.new onNavigationEvent(null), 3, (Object) null);
            return;
        }
        creditCardIssueRrnInputFragment.getInterfaceDescriptor().setVisibility(0);
        creditCardIssueRrnInputFragment.newAuthTabSession();
        Object[] objArr = {M_.onExtraCallback, creditCardIssueRrnInputFragment.onUnminimized()};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        M_.onNavigationEvent(1483765845, objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1483765843, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
        creditCardIssueRrnInputFragment.prefetch();
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CreditCardIssueRrnInputFragment.this.new onNavigationEvent(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            Object obj2;
            Object objOnWarmupCompleted;
            BaseApiResponse baseApiResponse;
            Boolean bool;
            Object objOnTransact;
            Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object[] objArr = {PlayerErrorCode.onWarmupCompleted};
                    if (((MobileCarrier) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1620982563, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1620982568, objArr, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent())) == MobileCarrier.NONE) {
                        IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_Parcel = CreditCardIssueRrnInputFragment.this.IAuthTabCallback;
                        GriverPhotoSelectActivity8 griverPhotoSelectActivity8OnExtraCallbackWithResult = CreditCardIssueRrnInputFragment.this.onExtraCallbackWithResult();
                        Context contextRequireContext = CreditCardIssueRrnInputFragment.this.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                        iEngagementSignalsCallback_Parcel.onNavigationEvent(griverPhotoSelectActivity8OnExtraCallbackWithResult.onExtraCallback(contextRequireContext, new GriverPhotoSelectActivity7(UnifiedSessionType.onExtraCallback("card-issue"), "card_issue", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1020, (DefaultConstructorMarker) null)));
                        return Unit.INSTANCE;
                    }
                    if (CreditCardIssueRrnInputFragment.this.postMessage()) {
                        CreditCardIssueRrnInputFragment.this.newSessionWithExtras();
                        return Unit.INSTANCE;
                    }
                    if (CreditCardIssueRrnInputFragment.this.mayLaunchUrl()) {
                        ConstraintLayout root = CreditCardIssueRrnInputFragment.this.IAuthTabCallbackStub().getRoot();
                        Intrinsics.checkNotNullExpressionValue(root, "");
                        String string = CreditCardIssueRrnInputFragment.this.getString(R.string.app_credit_card_issue_name_include_blank_error_title);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        new TdsToastV1.onNavigationEvent(root, string).onNavigationEvent();
                        return Unit.INSTANCE;
                    }
                    if (!CreditCardIssueRrnInputFragment.this.extraCommand()) {
                        ConstraintLayout root2 = CreditCardIssueRrnInputFragment.this.IAuthTabCallbackStub().getRoot();
                        Intrinsics.checkNotNullExpressionValue(root2, "");
                        String string2 = CreditCardIssueRrnInputFragment.this.getString(R.string.app_credit_card_issue_name_english_error_title);
                        Intrinsics.checkNotNullExpressionValue(string2, "");
                        new TdsToastV1.onNavigationEvent(root2, string2).onNavigationEvent();
                        return Unit.INSTANCE;
                    }
                    String strOnPostMessage = PlayerErrorCode.onPostMessage();
                    Editable text = CreditCardIssueRrnInputFragment.this.onMinimized().getText();
                    Editable text2 = CreditCardIssueRrnInputFragment.this.onUnminimized().getText();
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) text);
                    sb.append((Object) text2);
                    String string3 = sb.toString();
                    String interfaceDescriptor = CreditCardIssueRrnInputFragment.this.extraCallback().getInterfaceDescriptor();
                    String strICustomTabsCallbackStubProxy = CreditCardIssueRrnInputFragment.this.extraCallback().ICustomTabsCallbackStubProxy();
                    NativeAdViewTypeApi nativeAdViewTypeApi = new NativeAdViewTypeApi(strOnPostMessage, string3, interfaceDescriptor, strICustomTabsCallbackStubProxy != null ? strICustomTabsCallbackStubProxy : "");
                    CreditCardIssueRrnInputFragment.this.asBinder().setLoading(true);
                    Result.Companion companion = Result.Companion;
                    ExtraHints extraHintsOnExtraCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.onExtraCallback();
                    this.L$0 = access15400.onNavigationEvent(nativeAdViewTypeApi);
                    this.L$1 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    objOnWarmupCompleted = extraHintsOnExtraCallback.onWarmupCompleted(nativeAdViewTypeApi, (access13800<? super BaseApiResponse<Boolean>>) this);
                    if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                        return objOnWarmupCompleted2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnWarmupCompleted = obj;
                }
                baseApiResponse = (BaseApiResponse) objOnWarmupCompleted;
            } catch (WebResourceResponseModel e) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()) {
                try {
                    objOnTransact = baseApiResponse.onTransact();
                } catch (NullPointerException e4) {
                    if (!Intrinsics.areEqual(Boolean.class, Object.class) && !Intrinsics.areEqual(Boolean.class, Unit.class)) {
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e4);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                    bool = Unit.INSTANCE;
                }
                if (objOnTransact == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                bool = (Boolean) objOnTransact;
                obj2 = Result.constructor-impl(bool);
                CreditCardIssueRrnInputFragment creditCardIssueRrnInputFragment = CreditCardIssueRrnInputFragment.this;
                if (Result.onNavigationEvent(obj2)) {
                    creditCardIssueRrnInputFragment.newSession();
                }
                CreditCardIssueRrnInputFragment creditCardIssueRrnInputFragment2 = CreditCardIssueRrnInputFragment.this;
                Throwable th = Result.exceptionOrNull-impl(obj2);
                if (th != null) {
                    getParamImp.onWarmupCompleted(th, creditCardIssueRrnInputFragment2.getContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
                }
                CreditCardIssueRrnInputFragment.this.asBinder().setLoading(false);
                return Unit.INSTANCE;
            }
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult == null) {
                throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
            }
            throw apiErrorExtraCallbackWithResult;
        }
    }

    private final void ICustomTabsService() {
        onRelationshipValidationResult().setText(StringsKt.trimIndent("\n            " + PlayerErrorCode.onPostMessage() + "님의 정보를\n            입력해주세요\n        "));
        access100().setText(PlayerErrorCode.onPostMessage());
        access100().setImportantForAccessibility(2);
    }

    private final void prefetch() {
        M_ m_ = M_.onExtraCallback;
        if (m_.onNavigationEvent() / getResources().getDisplayMetrics().density >= 680.0f) {
            TextInputEditText textInputEditTextAccess000 = access000();
            Editable text = textInputEditTextAccess000.getText();
            if (text != null && !StringsKt.isBlank(text)) {
                textInputEditTextAccess000 = null;
            }
            if (textInputEditTextAccess000 == null) {
                textInputEditTextAccess000 = IAuthTabCallbackStubProxy();
            }
            M_.onNavigationEvent(1312897292, new Object[]{m_, textInputEditTextAccess000}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1312897289, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsCallbackDefault() {
        RecommendedEnglishName recommendedEnglishName;
        RecommendedEnglishNameResponse recommendedEnglishNameResponse = (RecommendedEnglishNameResponse) RxSharedApiCall.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -144346571, 144346571, new Object[]{extraCallback().onMinimized()}, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        if (recommendedEnglishNameResponse != null && (recommendedEnglishName = (RecommendedEnglishName) CollectionsKt.firstOrNull(recommendedEnglishNameResponse.onWarmupCompleted())) != null) {
            String upperCase = recommendedEnglishName.IAuthTabCallback().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            List listSplit$default = StringsKt.split$default(upperCase, new String[]{" "}, false, 0, 6, (Object) null);
            TextInputEditText textInputEditTextIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
            String strOnWarmupCompleted = ((getIterations) readTypedObject()).onWarmupCompleted();
            if (strOnWarmupCompleted == null) {
                strOnWarmupCompleted = (String) CollectionsKt.getOrNull(listSplit$default, 1);
            }
            textInputEditTextIAuthTabCallbackStubProxy.setText(strOnWarmupCompleted);
            IAuthTabCallbackStubProxy().setSelection(IAuthTabCallbackStubProxy().length());
            TextInputEditText textInputEditTextAccess000 = access000();
            String strOnExtraCallbackWithResult = ((getIterations) readTypedObject()).onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult == null) {
                strOnExtraCallbackWithResult = (String) CollectionsKt.getOrNull(listSplit$default, 0);
            }
            textInputEditTextAccess000.setText(strOnExtraCallbackWithResult);
            access000().setSelection(access000().length());
            newAuthTabSession();
        }
        String strICustomTabsCallback = addExtra.ICustomTabsCallback(PlayerErrorCode.onWarmupCompleted);
        if (strICustomTabsCallback != null) {
            onMinimized().setText(strICustomTabsCallback);
            if (!onWarmupCompleted().onActivityLayout() && !onWarmupCompleted().RemoteActionCompatParcelizer()) {
                enableIOSViewClipToPaddingBox.IAuthTabCallback.onWarmupCompleted(new EditText[]{onMinimized()});
            }
        }
        clearPid clearpid = clearPid.onWarmupCompleted;
        getByteBuffer getbytebufferExtraCallback = enableAccessibilityOrder.onExtraCallbackWithResult.IAuthTabCallback(requireBaseActivity()).extraCallback();
        Intrinsics.checkNotNullExpressionValue(getbytebufferExtraCallback, "");
        getByteBuffer getbytebufferOnWarmupCompleted = getByteBuffer.onWarmupCompleted(getbytebufferExtraCallback, RxView.onExtraCallback(access000()), RxView.onExtraCallback(IAuthTabCallbackStubProxy()), new onWarmupCompleted());
        Intrinsics.checkExpressionValueIsNotNull(getbytebufferOnWarmupCompleted, "");
        autoDisposable(setMessageBytes.onExtraCallbackWithResult(getbytebufferOnWarmupCompleted, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueRrnInputFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return CreditCardIssueRrnInputFragment.IAuthTabCallback((Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueRrnInputFragment$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return CreditCardIssueRrnInputFragment.onExtraCallbackWithResult(this.f$0, ((Boolean) obj).booleanValue());
            }
        }, 2, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(CreditCardIssueRrnInputFragment creditCardIssueRrnInputFragment, boolean z) {
        if (z) {
            creditCardIssueRrnInputFragment.onTransact();
        }
        creditCardIssueRrnInputFragment.onActivityResized().setVisibility(z ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void newAuthTabSession() {
        boolean z = onMinimized().length() == 6 && onUnminimized().length() == 7;
        boolean z2 = getInterfaceDescriptor().getVisibility() != 0 || (access000().length() > 0 && IAuthTabCallbackStubProxy().length() > 0);
        if (getInterfaceDescriptor().getVisibility() == 8) {
            asBinder().setEnabled(z);
        } else {
            asBinder().setEnabled(z && z2);
        }
    }

    private final void onTransact() {
        List<RecommendedEnglishName> listOnWarmupCompleted;
        final View view;
        RecommendedEnglishNameResponse recommendedEnglishNameResponse = (RecommendedEnglishNameResponse) RxSharedApiCall.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -144346571, 144346571, new Object[]{extraCallback().onMinimized()}, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        if (recommendedEnglishNameResponse == null || (listOnWarmupCompleted = recommendedEnglishNameResponse.onWarmupCompleted()) == null) {
            return;
        }
        List<RecommendedEnglishName> list = listOnWarmupCompleted;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String upperCase = ((RecommendedEnglishName) it.next()).IAuthTabCallback().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            arrayList.add(upperCase);
        }
        onMessageChannelReady().removeAllViews();
        int i = 0;
        View[] viewArr = {access000(), IAuthTabCallbackStubProxy()};
        while (true) {
            if (i >= 2) {
                view = null;
                break;
            }
            view = viewArr[i];
            if (view.hasFocus()) {
                break;
            } else {
                i++;
            }
        }
        if (view != null) {
            boolean zAreEqual = Intrinsics.areEqual(view, access000());
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) StringsKt.split$default((String) it2.next(), new String[]{" "}, false, 0, 6, (Object) null).get(!zAreEqual ? 1 : 0));
            }
            HashSet hashSet = new HashSet();
            ArrayList<String> arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (hashSet.add((String) obj)) {
                    arrayList3.add(obj);
                }
            }
            for (final String str : arrayList3) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                Typography5 typography5 = new Typography5(contextRequireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(typography5, -2, -1);
                typography5.setGravity(17);
                DisplayMetrics displayMetrics = typography5.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                int iOnNavigationEvent = varyMatches.onNavigationEvent(16, displayMetrics);
                typography5.setPadding(iOnNavigationEvent, iOnNavigationEvent, iOnNavigationEvent, iOnNavigationEvent);
                typography5.onNavigationEvent(response.Medium);
                M_ m_ = M_.onExtraCallback;
                Context context = typography5.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                typography5.setBackgroundResource(m_.onWarmupCompleted(context));
                typography5.setText(str);
                setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, new Object[]{typography5, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueRrnInputFragment$$ExternalSyntheticLambda15
                    public final Object invoke(Object obj2) {
                        return CreditCardIssueRrnInputFragment.onWarmupCompleted(view, str, (View) obj2);
                    }
                }}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
                onMessageChannelReady().addView(typography5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(TextInputEditText textInputEditText, String str, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        textInputEditText.setText(str);
        Editable text = textInputEditText.getText();
        textInputEditText.setSelection(text != null ? text.length() : 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void newSession() {
        CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = extraCallback();
        Editable text = onMinimized().getText();
        Editable text2 = onUnminimized().getText();
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        sb.append((Object) text2);
        cardIssueOverviewViewModelExtraCallback.onExtraCallback(new BaseRoundCornerProgressBar1(sb.toString()));
        extraCallback().onWarmupCompleted(new BaseRoundCornerProgressBar1(String.valueOf(onUnminimized().getText())));
        getDigestAlgorithms<L> getdigestalgorithmsWriteTypedObject = writeTypedObject();
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(this);
        CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback2 = extraCallback();
        Editable text3 = onMinimized().getText();
        Editable text4 = onUnminimized().getText();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text3);
        sb2.append((Object) text4);
        getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnNavigationEvent, cardIssueOverviewViewModelExtraCallback2, new isVisibleAnimation(sb2.toString(), String.valueOf(IAuthTabCallbackStubProxy().getText()), String.valueOf(access000().getText())), (String) null, asBinder().getText().toString(), (Map) null, 40, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean postMessage() {
        Editable text = IAuthTabCallbackStubProxy().getText();
        CharSequence charSequenceTrim = text != null ? StringsKt.trim(text) : null;
        Editable text2 = access000().getText();
        CharSequence charSequenceTrim2 = text2 != null ? StringsKt.trim(text2) : null;
        StringBuilder sb = new StringBuilder();
        sb.append((Object) charSequenceTrim);
        sb.append((Object) charSequenceTrim2);
        return sb.toString().length() > 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean mayLaunchUrl() {
        String string;
        String string2;
        Editable text = IAuthTabCallbackStubProxy().getText();
        String string3 = (text == null || (string2 = text.toString()) == null) ? null : StringsKt.trim(string2).toString();
        if (string3 == null) {
            string3 = "";
        }
        Editable text2 = access000().getText();
        String string4 = (text2 == null || (string = text2.toString()) == null) ? null : StringsKt.trim(string).toString();
        return StringsKt.contains$default(string3, " ", false, 2, (Object) null) || StringsKt.contains$default(string4 != null ? string4 : "", " ", false, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean extraCommand() {
        String string;
        String string2;
        Editable text = IAuthTabCallbackStubProxy().getText();
        String string3 = null;
        String string4 = (text == null || (string2 = text.toString()) == null) ? null : StringsKt.trim(string2).toString();
        if (string4 == null) {
            string4 = "";
        }
        Editable text2 = access000().getText();
        if (text2 != null && (string = text2.toString()) != null) {
            string3 = StringsKt.trim(string).toString();
        }
        String str = string3 != null ? string3 : "";
        Regex regex = new Regex("^[A-Z]+$");
        return regex.onExtraCallbackWithResult(string4) && regex.onExtraCallbackWithResult(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void newSessionWithExtras() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueRrnInputFragment$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return CreditCardIssueRrnInputFragment.onNavigationEvent(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(final CreditCardIssueRrnInputFragment creditCardIssueRrnInputFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(creditCardIssueRrnInputFragment.getString(R.string.app_credit_card_issue_name_length_error_title));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(creditCardIssueRrnInputFragment.getString(R.string.app_credit_card_issue_name_length_error_message));
        String string = creditCardIssueRrnInputFragment.getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, (Function1) null, 14, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.asBinder(new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueRrnInputFragment$$ExternalSyntheticLambda16
            public final Object invoke(Object obj) {
                return CreditCardIssueRrnInputFragment.onNavigationEvent(this.f$0, (DialogInterface) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(CreditCardIssueRrnInputFragment creditCardIssueRrnInputFragment, DialogInterface dialogInterface) {
        Object[] objArr = {M_.onExtraCallback, creditCardIssueRrnInputFragment.IAuthTabCallbackStubProxy()};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        M_.onNavigationEvent(1312897292, objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1312897289, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
        transparentBackground.onExtraCallback(creditCardIssueRrnInputFragment.IAuthTabCallbackStubProxy());
        return Unit.INSTANCE;
    }

    private final void ICustomTabsCallbackStubProxy() {
        final TextInputEditText textInputEditTextOnUnminimized = onUnminimized();
        setProtocolsokhttp.IAuthTabCallback(textInputEditTextOnUnminimized, new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueRrnInputFragment$$ExternalSyntheticLambda12
            public final Object invoke(Object obj, Object obj2) {
                return CreditCardIssueRrnInputFragment.onWarmupCompleted(textInputEditTextOnUnminimized, (View) obj, (SuspendAnimationKtExternalSyntheticLambda4) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(TextInputEditText textInputEditText, View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
        if (suspendAnimationKtExternalSyntheticLambda4 != null) {
            suspendAnimationKtExternalSyntheticLambda4.onWarmupCompleted(textInputEditText.getContext().getString(R.string.app_credit_card_issue_rrn_input_2_hint));
        }
        if (suspendAnimationKtExternalSyntheticLambda4 != null) {
            boolean z = false;
            if (view != null && view.isFocused()) {
                z = true;
            }
            suspendAnimationKtExternalSyntheticLambda4.readTypedObject(z);
        }
        return Unit.INSTANCE;
    }

    private final void isEngagementSignalsApiAvailable() {
        final TextInputEditText textInputEditTextOnUnminimized = onUnminimized();
        autoDisposable(setMessageBytes.onExtraCallbackWithResult(RxView.onExtraCallback(textInputEditTextOnUnminimized).onExtraCallbackWithResult(), (Function1) null, (Function0) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueRrnInputFragment$$ExternalSyntheticLambda10
            public final Object invoke(Object obj) {
                return CreditCardIssueRrnInputFragment.onWarmupCompleted(textInputEditTextOnUnminimized, this, ((Boolean) obj).booleanValue());
            }
        }, 3, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(TextInputEditText textInputEditText, final CreditCardIssueRrnInputFragment creditCardIssueRrnInputFragment, boolean z) {
        textInputEditText.sendAccessibilityEvent(4);
        if (z) {
            creditCardIssueRrnInputFragment.hideSoftKeyboard();
            creditCardIssueRrnInputFragment.IAuthTabCallback_Parcel().onWarmupCompleted();
            creditCardIssueRrnInputFragment.IAuthTabCallback_Parcel().postDelayed(new Runnable() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueRrnInputFragment$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    CreditCardIssueRrnInputFragment.IAuthTabCallbackStubProxy(this.f$0);
                }
            }, 200L);
        } else {
            creditCardIssueRrnInputFragment.IAuthTabCallback_Parcel().onNavigationEvent();
            creditCardIssueRrnInputFragment.IAuthTabCallback_Parcel().setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStubProxy(CreditCardIssueRrnInputFragment creditCardIssueRrnInputFragment) {
        if (creditCardIssueRrnInputFragment.getView() != null) {
            creditCardIssueRrnInputFragment.IAuthTabCallback_Parcel().setVisibility(0);
        }
    }

    private final void ICustomTabsCallbackStub() {
        isRootCA isrootcaIAuthTabCallbackStub = IAuthTabCallbackStub();
        Editable text = isrootcaIAuthTabCallbackStub.onExtraCallback.getText();
        isrootcaIAuthTabCallbackStub.onTransact.setContentDescription(((Object) text) + ", " + getString(R.string.app_credit_card_issue_rrn_input_change_name_dialog_cta_title));
        View view = isrootcaIAuthTabCallbackStub.onTransact;
        Intrinsics.checkNotNullExpressionValue(view, "");
        setProtocolsokhttp.IAuthTabCallback(view, new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueRrnInputFragment$$ExternalSyntheticLambda13
            public final Object invoke(Object obj, Object obj2) {
                return CreditCardIssueRrnInputFragment.onNavigationEvent((View) obj, (SuspendAnimationKtExternalSyntheticLambda4) obj2);
            }
        });
        isrootcaIAuthTabCallbackStub.onTransact.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueRrnInputFragment$$ExternalSyntheticLambda14
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CreditCardIssueRrnInputFragment.onExtraCallback(this.f$0, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
        if (suspendAnimationKtExternalSyntheticLambda4 != null) {
            suspendAnimationKtExternalSyntheticLambda4.onExtraCallback("android.widget.Button");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(final CreditCardIssueRrnInputFragment creditCardIssueRrnInputFragment, View view) {
        Context contextRequireContext = creditCardIssueRrnInputFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueRrnInputFragment$$ExternalSyntheticLambda9
            public final Object invoke(Object obj) {
                return CreditCardIssueRrnInputFragment.IAuthTabCallback(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(final CreditCardIssueRrnInputFragment creditCardIssueRrnInputFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(creditCardIssueRrnInputFragment.getString(R.string.app_credit_card_issue_rrn_input_change_name_dialog_title));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, R.string.close, (TdsButtonV1View.asInterface) null, false, (Function1) null, 14, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string = creditCardIssueRrnInputFragment.getString(R.string.app_credit_card_issue_rrn_input_change_name_dialog_cta_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueRrnInputFragment$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return CreditCardIssueRrnInputFragment.onExtraCallbackWithResult(this.f$0, (DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(CreditCardIssueRrnInputFragment creditCardIssueRrnInputFragment, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = creditCardIssueRrnInputFragment.IAuthTabCallback;
        ColorUtils colorUtilsOnExtraCallback = creditCardIssueRrnInputFragment.onExtraCallback();
        Context contextRequireContext = creditCardIssueRrnInputFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        iEngagementSignalsCallback_Parcel.onNavigationEvent(colorUtilsOnExtraCallback.onNavigationEvent(contextRequireContext));
        return Unit.INSTANCE;
    }

    private final void asInterface() {
        String string;
        Editable text = onUnminimized().getText();
        int length = text != null ? text.length() : 0;
        if (length == 0) {
            string = getString(R.string.app_credit_card_issue_rrn_input_status_empty);
        } else if (length == 7) {
            string = getString(R.string.app_credit_card_issue_rrn_input_status_complete);
        } else {
            ComputeExpression computeExpression = ComputeExpression.IAuthTabCallback;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            string = computeExpression.onNavigationEvent(contextRequireContext, R.string.app_credit_card_issue_rrn_input_status_format, new Pair[]{getWrite.IAuthTabCallback("length", Integer.valueOf(length))});
        }
        Intrinsics.checkNotNull(string);
        onUnminimized().announceForAccessibility(string);
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
