package viva.republica.toss.cardrecommend.issuev2.ui.id.manual;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseFragment;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.textField.TextFieldLine;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import net.sf.scuba.smartcards.BuildConfig;
import o.AccessDescription;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.GetTSAPolicyOid;
import o.M_;
import o.PageContext;
import o.PlayerErrorCode;
import o.RippleNode;
import o.SearchBarKtExternalSyntheticLambda5;
import o.TypographyKtExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15400;
import o.access8100;
import o.addAllCommandLine;
import o.findResAndMsg;
import o.getDataGroupHashValue;
import o.getDigestAlgorithms;
import o.getMinWebSocketMessageToCompressokhttp;
import o.getParamImp;
import o.getPolicies;
import o.getSalt;
import o.getWrite;
import o.initMiniApp;
import o.maybeUpdateAnimatable;
import o.onRenderReady;
import o.preFillDefault;
import o.setBodyokhttp;
import o.setRandomHost;
import o.transparentBackground;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment;
import viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CardIssueDriverSerialIdFragment;
import viva.republica.toss.network.model.cardsales.funnel.formvalue.IdVerificationFormValue;
import viva.republica.toss.network.model.cardsales.verify.VerifyIdCardDetail;
import viva.republica.toss.network.model.cardsales.verify.VerifyIdCardResponse;

@EmbeddingAdapterExternalSyntheticLambda1
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CardIssueDriverSerialIdFragment extends CardIssueBaseFragment<getSalt> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static char[] IAuthTabCallbackStub = null;
    private static int asBinder = 0;
    private static char asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent;
    private static int onTransact;
    private final onWarmupCompleted onExtraCallback;
    private final PageContext onExtraCallbackWithResult;
    private final boolean onWarmupCompleted;

    static {
        IAuthTabCallback();
        onNavigationEvent = new addAllCommandLine[]{new PropertyReference1Impl<>(CardIssueDriverSerialIdFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCardIssueDriverSerialIdBinding;", 0)};
        IAuthTabCallback = 8;
        int i = getInterfaceDescriptor + 41;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(CardIssueDriverSerialIdFragment cardIssueDriverSerialIdFragment, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(cardIssueDriverSerialIdFragment, view);
        int i4 = IAuthTabCallbackDefault + 75;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CardIssueDriverSerialIdFragment cardIssueDriverSerialIdFragment = (CardIssueDriverSerialIdFragment) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cardIssueDriverSerialIdFragment, commonModule_setLeftEdgeTouchEnabled);
        int i4 = asBinder + 47;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = (~((~i5) | i3)) | (~(i5 | i4));
        int i8 = ~i3;
        int i9 = (~(i8 | i4)) | i5;
        int i10 = (~(i4 | i3)) | (~(i8 | (~i4))) | i5;
        int i11 = i3 + i5 + i + ((-737137436) * i6) + ((-1840598144) * i2);
        int i12 = i11 * i11;
        int i13 = (((-699670985) * i3) - 818937856) + (24099949 * i5) + (723770934 * i7) + ((-1447541868) * i9) + ((-723770934) * i10) + ((-1423441920) * i) + (1335885824 * i6) + ((-1946157056) * i2) + ((-1593638912) * i12);
        int i14 = (i3 * 1252406331) + 1981669868 + (i5 * 1252405337) + (i7 * (-994)) + (i9 * 1988) + (i10 * 994) + (i * 1252407325) + (i6 * (-1820396076)) + (i2 * 1320834432) + (i12 * (-447283200));
        int i15 = i13 + (i14 * i14 * 1511325696);
        return i15 != 1 ? i15 != 2 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CardIssueDriverSerialIdFragment cardIssueDriverSerialIdFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(cardIssueDriverSerialIdFragment, view);
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 115;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        IAuthTabCallbackDefault = i2 % 128;
        return i2 % 2 != 0;
    }

    public static final /* synthetic */ TextFieldLine onExtraCallback(CardIssueDriverSerialIdFragment cardIssueDriverSerialIdFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            cardIssueDriverSerialIdFragment.onTransact();
            throw null;
        }
        TextFieldLine textFieldLineOnTransact = cardIssueDriverSerialIdFragment.onTransact();
        int i3 = asBinder + 93;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return textFieldLineOnTransact;
    }

    public static final /* synthetic */ KeyboardBottomCta onExtraCallbackWithResult(CardIssueDriverSerialIdFragment cardIssueDriverSerialIdFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KeyboardBottomCta keyboardBottomCtaOnNavigationEvent = cardIssueDriverSerialIdFragment.onNavigationEvent();
        int i4 = IAuthTabCallbackDefault + 55;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return keyboardBottomCtaOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onNavigationEvent(CardIssueDriverSerialIdFragment cardIssueDriverSerialIdFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        String str = (String) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{cardIssueDriverSerialIdFragment}, -2048351443, iOnExtraCallbackWithResult, 2048351444, iOnExtraCallbackWithResult3);
        int i4 = IAuthTabCallbackDefault + 57;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onWarmupCompleted(CardIssueDriverSerialIdFragment cardIssueDriverSerialIdFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            cardIssueDriverSerialIdFragment.IAuthTabCallbackStub();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strIAuthTabCallbackStub = cardIssueDriverSerialIdFragment.IAuthTabCallbackStub();
        int i3 = IAuthTabCallbackDefault + 55;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 62 / 0;
        }
        return strIAuthTabCallbackStub;
    }

    public CardIssueDriverSerialIdFragment() {
        super(R.layout.fragment_card_issue_driver_serial_id);
        this.onExtraCallbackWithResult = preFillDefault.onExtraCallbackWithResult(this, onExtraCallbackWithResult.onExtraCallbackWithResult);
        this.onExtraCallback = new onWarmupCompleted();
    }

    public boolean ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CardIssueDriverSerialIdFragment cardIssueDriverSerialIdFragment = (CardIssueDriverSerialIdFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 45;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String string = cardIssueDriverSerialIdFragment.requireArguments().getString("licenseNo", BuildConfig.FLAVOR);
        if (i3 != 0) {
            Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
            return string;
        }
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        throw null;
    }

    private final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(requireArguments().getString("licenseIssuer", BuildConfig.FLAVOR), BuildConfig.FLAVOR);
            throw null;
        }
        String string = requireArguments().getString("licenseIssuer", BuildConfig.FLAVOR);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        return string;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, GetTSAPolicyOid> {
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(1, GetTSAPolicyOid.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCardIssueDriverSerialIdBinding;", 0);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final GetTSAPolicyOid invoke(View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            return GetTSAPolicyOid.onWarmupCompleted(view);
        }
    }

    private final GetTSAPolicyOid onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult(this, onNavigationEvent[0]);
        Intrinsics.checkNotNullExpressionValue(searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult, BuildConfig.FLAVOR);
        GetTSAPolicyOid getTSAPolicyOid = (GetTSAPolicyOid) searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        int i4 = IAuthTabCallbackDefault + 93;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return getTSAPolicyOid;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CardIssueDriverSerialIdFragment cardIssueDriverSerialIdFragment = (CardIssueDriverSerialIdFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        TdsTopV2View tdsTopV2View = cardIssueDriverSerialIdFragment.onWarmupCompleted().IAuthTabCallbackStub;
        if (i3 == 0) {
            Intrinsics.checkNotNullExpressionValue(tdsTopV2View, BuildConfig.FLAVOR);
            return tdsTopV2View;
        }
        Intrinsics.checkNotNullExpressionValue(tdsTopV2View, BuildConfig.FLAVOR);
        throw null;
    }

    private final TextFieldLine onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            TextFieldLine textFieldLine = onWarmupCompleted().onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(textFieldLine, BuildConfig.FLAVOR);
            return textFieldLine;
        }
        Intrinsics.checkNotNullExpressionValue(onWarmupCompleted().onWarmupCompleted, BuildConfig.FLAVOR);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final KeyboardBottomCta onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(onWarmupCompleted().IAuthTabCallback, BuildConfig.FLAVOR);
            throw null;
        }
        KeyboardBottomCta keyboardBottomCta = onWarmupCompleted().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, BuildConfig.FLAVOR);
        return keyboardBottomCta;
    }

    private final TdsImageView onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageView = onWarmupCompleted().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, BuildConfig.FLAVOR);
        int i4 = asBinder + 3;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return tdsImageView;
        }
        throw null;
    }

    private final TdsTextButtonV0View onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            TdsTextButtonV0View tdsTextButtonV0View = onWarmupCompleted().onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(tdsTextButtonV0View, BuildConfig.FLAVOR);
            return tdsTextButtonV0View;
        }
        TdsTextButtonV0View tdsTextButtonV0View2 = onWarmupCompleted().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsTextButtonV0View2, BuildConfig.FLAVOR);
        int i3 = 9 / 0;
        return tdsTextButtonV0View2;
    }

    public static final class onWarmupCompleted extends DigitsKeyListener {
        @Override // android.text.method.DigitsKeyListener, android.text.method.KeyListener
        public int getInputType() {
            return 33;
        }

        onWarmupCompleted() {
            super(false, false);
        }

        @Override // android.text.method.DigitsKeyListener, android.text.method.NumberKeyListener
        protected char[] getAcceptedChars() {
            char[] charArray = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, BuildConfig.FLAVOR);
            return charArray;
        }
    }

    public static final class onExtraCallback implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public onExtraCallback() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable != null && editable.length() == 6) {
                transparentBackground.onWarmupCompleted(CardIssueDriverSerialIdFragment.onExtraCallbackWithResult(CardIssueDriverSerialIdFragment.this).onWarmupCompleted());
            } else {
                transparentBackground.onExtraCallback(CardIssueDriverSerialIdFragment.onExtraCallbackWithResult(CardIssueDriverSerialIdFragment.this).onWarmupCompleted());
            }
        }
    }

    private static final void onExtraCallback(final CardIssueDriverSerialIdFragment cardIssueDriverSerialIdFragment, View view) {
        int i = 2 % 2;
        CommonModule_setScreenAwakeMode.onNavigationEvent(cardIssueDriverSerialIdFragment, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CardIssueDriverSerialIdFragment$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj};
                int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
                return (Unit) CardIssueDriverSerialIdFragment.onExtraCallbackWithResult(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), objArr, 728347241, iOnExtraCallbackWithResult, -728347239, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
            }
        });
        int i2 = IAuthTabCallbackDefault + 81;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(CardIssueDriverSerialIdFragment cardIssueDriverSerialIdFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, BuildConfig.FLAVOR);
            commonModule_setLeftEdgeTouchEnabled.onExtraCallback(cardIssueDriverSerialIdFragment.getString(R.string.app_card_issue_driver_serial_id_help_dialog_title));
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(cardIssueDriverSerialIdFragment.getString(R.string.app_card_issue_driver_serial_id_help_dialog_message));
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        } else {
            Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, BuildConfig.FLAVOR);
            commonModule_setLeftEdgeTouchEnabled.onExtraCallback(cardIssueDriverSerialIdFragment.getString(R.string.app_card_issue_driver_serial_id_help_dialog_title));
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(cardIssueDriverSerialIdFragment.getString(R.string.app_card_issue_driver_serial_id_help_dialog_message));
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        }
        return Unit.INSTANCE;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ String $serialNo;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(String str, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$serialNo = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CardIssueDriverSerialIdFragment.this.new onNavigationEvent(this.$serialNo, access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01b1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Throwable th;
            int i;
            Object objIAuthTabCallback;
            onNavigationEvent onnavigationevent;
            int i2;
            CardIssueDriverSerialIdFragment cardIssueDriverSerialIdFragment;
            VerifyIdCardResponse verifyIdCardResponse;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                i = 0;
                BaseFragment.showProgressDialog$default(CardIssueDriverSerialIdFragment.this, (String) null, false, 3, (Object) null);
                CardIssueDriverSerialIdFragment cardIssueDriverSerialIdFragment2 = CardIssueDriverSerialIdFragment.this;
                String str = this.$serialNo;
                Result.Companion companion3 = Result.Companion;
                AccessDescription accessDescriptionIAuthTabCallback_Parcel = cardIssueDriverSerialIdFragment2.extraCallback().IAuthTabCallback_Parcel();
                String strOnPostMessage = PlayerErrorCode.onPostMessage();
                String strExtraCallback = PlayerErrorCode.extraCallback();
                String strOnWarmupCompleted = CardIssueDriverSerialIdFragment.onWarmupCompleted(cardIssueDriverSerialIdFragment2);
                String strOnNavigationEvent = CardIssueDriverSerialIdFragment.onNavigationEvent(cardIssueDriverSerialIdFragment2);
                this.L$0 = cardIssueDriverSerialIdFragment2;
                this.L$1 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                objIAuthTabCallback = accessDescriptionIAuthTabCallback_Parcel.IAuthTabCallback(strOnPostMessage, strExtraCallback, strOnNavigationEvent, str, strOnWarmupCompleted, this);
                if (objIAuthTabCallback != objOnWarmupCompleted) {
                    onnavigationevent = this;
                    i2 = 0;
                    cardIssueDriverSerialIdFragment = cardIssueDriverSerialIdFragment2;
                }
                return objOnWarmupCompleted;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                verifyIdCardResponse = (VerifyIdCardResponse) this.L$1;
                ResultKt.onNavigationEvent(obj);
                obj2 = Result.constructor-impl(verifyIdCardResponse);
                CardIssueDriverSerialIdFragment cardIssueDriverSerialIdFragment3 = CardIssueDriverSerialIdFragment.this;
                if (Result.onNavigationEvent(obj2)) {
                    VerifyIdCardResponse verifyIdCardResponse2 = (VerifyIdCardResponse) obj2;
                    if (verifyIdCardResponse2.onExtraCallbackWithResult()) {
                        getDigestAlgorithms getdigestalgorithmsWriteTypedObject = cardIssueDriverSerialIdFragment3.writeTypedObject();
                        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(cardIssueDriverSerialIdFragment3);
                        CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = cardIssueDriverSerialIdFragment3.extraCallback();
                        IdVerificationFormValue.IdType idType = IdVerificationFormValue.IdType.DRIVER;
                        String strOnNavigationEvent2 = CardIssueDriverSerialIdFragment.onNavigationEvent(cardIssueDriverSerialIdFragment3);
                        String strOnWarmupCompleted2 = CardIssueDriverSerialIdFragment.onWarmupCompleted(cardIssueDriverSerialIdFragment3);
                        EditText editText = CardIssueDriverSerialIdFragment.onExtraCallback(cardIssueDriverSerialIdFragment3).getEditText();
                        getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnNavigationEvent, cardIssueOverviewViewModelExtraCallback, new IdVerificationFormValue(idType, strOnNavigationEvent2, strOnWarmupCompleted2, String.valueOf(editText != null ? editText.getText() : null), (String) null, false, (String) null, 80, (DefaultConstructorMarker) null), (String) null, CardIssueDriverSerialIdFragment.onExtraCallbackWithResult(cardIssueDriverSerialIdFragment3).onWarmupCompleted().getText().toString(), access8100.onNavigationEvent(getWrite.IAuthTabCallback("id_type", idType.getLogName())), 8, (Object) null);
                    } else {
                        getDigestAlgorithms getdigestalgorithmsWriteTypedObject2 = cardIssueDriverSerialIdFragment3.writeTypedObject();
                        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent2 = RippleNode.onNavigationEvent(cardIssueDriverSerialIdFragment3);
                        CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback2 = cardIssueDriverSerialIdFragment3.extraCallback();
                        IdVerificationFormValue.IdType idType2 = IdVerificationFormValue.IdType.DRIVER;
                        String strOnNavigationEvent3 = CardIssueDriverSerialIdFragment.onNavigationEvent(cardIssueDriverSerialIdFragment3);
                        String strOnWarmupCompleted3 = CardIssueDriverSerialIdFragment.onWarmupCompleted(cardIssueDriverSerialIdFragment3);
                        EditText editText2 = CardIssueDriverSerialIdFragment.onExtraCallback(cardIssueDriverSerialIdFragment3).getEditText();
                        String strValueOf = String.valueOf(editText2 != null ? editText2.getText() : null);
                        VerifyIdCardDetail verifyIdCardDetailOnExtraCallback = verifyIdCardResponse2.onExtraCallback();
                        getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject2, typographyKtExternalSyntheticLambda0OnNavigationEvent2, cardIssueOverviewViewModelExtraCallback2, new IdVerificationFormValue(idType2, strOnNavigationEvent3, strOnWarmupCompleted3, strValueOf, (String) null, true, verifyIdCardDetailOnExtraCallback != null ? verifyIdCardDetailOnExtraCallback.onWarmupCompleted() : null, 16, (DefaultConstructorMarker) null), (String) null, CardIssueDriverSerialIdFragment.onExtraCallbackWithResult(cardIssueDriverSerialIdFragment3).onWarmupCompleted().getText().toString(), access8100.onNavigationEvent(getWrite.IAuthTabCallback("id_type", idType2.getLogName())), 8, (Object) null);
                    }
                }
                final CardIssueDriverSerialIdFragment cardIssueDriverSerialIdFragment4 = CardIssueDriverSerialIdFragment.this;
                th = Result.exceptionOrNull-impl(obj2);
                if (th != null) {
                    if (th instanceof getDataGroupHashValue) {
                        Context context = cardIssueDriverSerialIdFragment4.getContext();
                        if (context != null) {
                            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CardIssueDriverSerialIdFragment$onViewCreated$5$1$$ExternalSyntheticLambda0
                                public final Object invoke(Object obj3) {
                                    return CardIssueDriverSerialIdFragment.onNavigationEvent.onExtraCallbackWithResult(cardIssueDriverSerialIdFragment4, (CommonModule_setLeftEdgeTouchEnabled) obj3);
                                }
                            });
                        }
                    } else if ((th instanceof AccessDescription.IAuthTabCallback) || (th instanceof AccessDescription.onNavigationEvent) || (th instanceof AccessDescription.onExtraCallbackWithResult)) {
                        Context context2 = cardIssueDriverSerialIdFragment4.getContext();
                        if (context2 != null) {
                            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context2, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CardIssueDriverSerialIdFragment$onViewCreated$5$1$$ExternalSyntheticLambda1
                                public final Object invoke(Object obj3) {
                                    return CardIssueDriverSerialIdFragment.onNavigationEvent.onWarmupCompleted((CommonModule_setLeftEdgeTouchEnabled) obj3);
                                }
                            });
                        }
                    } else {
                        getParamImp.onWarmupCompleted(th, cardIssueDriverSerialIdFragment4.getContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
                    }
                }
                CardIssueDriverSerialIdFragment.this.dismissProgressDialog();
                return Unit.INSTANCE;
            }
            int i4 = this.I$1;
            i2 = this.I$0;
            onnavigationevent = (access13800) this.L$1;
            cardIssueDriverSerialIdFragment = (CardIssueDriverSerialIdFragment) this.L$0;
            ResultKt.onNavigationEvent(obj);
            i = i4;
            objIAuthTabCallback = obj;
            VerifyIdCardResponse verifyIdCardResponse3 = (VerifyIdCardResponse) objIAuthTabCallback;
            if (verifyIdCardResponse3.onExtraCallbackWithResult()) {
                cardIssueDriverSerialIdFragment.extraCallback().IAuthTabCallback();
            } else {
                CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback3 = cardIssueDriverSerialIdFragment.extraCallback();
                boolean z = cardIssueDriverSerialIdFragment.requireArguments().getBoolean("pendingOcrImageRequired");
                this.L$0 = access15400.onNavigationEvent(onnavigationevent);
                this.L$1 = verifyIdCardResponse3;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 2;
                if (getPolicies.onExtraCallback(cardIssueOverviewViewModelExtraCallback3, z, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            verifyIdCardResponse = verifyIdCardResponse3;
            obj2 = Result.constructor-impl(verifyIdCardResponse);
            CardIssueDriverSerialIdFragment cardIssueDriverSerialIdFragment32 = CardIssueDriverSerialIdFragment.this;
            if (Result.onNavigationEvent(obj2)) {
            }
            final CardIssueDriverSerialIdFragment cardIssueDriverSerialIdFragment42 = CardIssueDriverSerialIdFragment.this;
            th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
            }
            CardIssueDriverSerialIdFragment.this.dismissProgressDialog();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onExtraCallbackWithResult(CardIssueDriverSerialIdFragment cardIssueDriverSerialIdFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(cardIssueDriverSerialIdFragment.getString(R.string.app_card_issue_ocr_verify_default_error_message));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onWarmupCompleted(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
            commonModule_setLeftEdgeTouchEnabled.onExtraCallback(Integer.valueOf(R.string.input_serial_number_error_title));
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(Integer.valueOf(R.string.input_serial_number_error_message));
            return Unit.INSTANCE;
        }
    }

    private static final void onNavigationEvent(CardIssueDriverSerialIdFragment cardIssueDriverSerialIdFragment, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        cardIssueDriverSerialIdFragment.hideSoftKeyboard();
        EditText editText = cardIssueDriverSerialIdFragment.onTransact().getEditText();
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        if (!cardIssueDriverSerialIdFragment.extraCallback().writeTypedObject()) {
            cardIssueDriverSerialIdFragment.extraCallback().IAuthTabCallback();
            getDigestAlgorithms getdigestalgorithmsWriteTypedObject = cardIssueDriverSerialIdFragment.writeTypedObject();
            TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(cardIssueDriverSerialIdFragment);
            CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = cardIssueDriverSerialIdFragment.extraCallback();
            IdVerificationFormValue.IdType idType = IdVerificationFormValue.IdType.DRIVER;
            int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            String str = (String) onExtraCallbackWithResult(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{cardIssueDriverSerialIdFragment}, -2048351443, iOnExtraCallbackWithResult, 2048351444, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
            String strIAuthTabCallbackStub = cardIssueDriverSerialIdFragment.IAuthTabCallbackStub();
            EditText editText2 = cardIssueDriverSerialIdFragment.onTransact().getEditText();
            getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnNavigationEvent, cardIssueOverviewViewModelExtraCallback, new IdVerificationFormValue(idType, str, strIAuthTabCallbackStub, String.valueOf(editText2 != null ? editText2.getText() : null), (String) null, true, "safeDriving", 16, (DefaultConstructorMarker) null), (String) null, cardIssueDriverSerialIdFragment.onNavigationEvent().onWarmupCompleted().getText().toString(), access8100.onNavigationEvent(getWrite.IAuthTabCallback("id_type", idType.getLogName())), 8, (Object) null);
            return;
        }
        maybeUpdateAnimatable.onNavigationEvent(onRenderReady.onExtraCallback(cardIssueDriverSerialIdFragment), (CoroutineContext) null, (setRandomHost) null, cardIssueDriverSerialIdFragment.new onNavigationEvent(strValueOf, null), 3, (Object) null);
        int i4 = IAuthTabCallbackDefault + 83;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        Editable text;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        super.onViewCreated(view, bundle);
        ((TdsTopV2View) onExtraCallbackWithResult(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{this}, 551084858, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -551084858, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult())).setLowerGap(0);
        ((TdsTopV2View) onExtraCallbackWithResult(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{this}, 551084858, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -551084858, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult())).setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        ((TdsTopV2View) onExtraCallbackWithResult(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{this}, 551084858, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -551084858, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult())).setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel = ((TdsTopV2View) onExtraCallbackWithResult(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{this}, 551084858, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -551084858, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult())).IAuthTabCallback_Parcel();
        if (getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel != null) {
            getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel.onNavigationEvent(requireContext().getString(R.string.input_serial_number));
            getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel.onNavigationEvent(Integer.valueOf(setBodyokhttp.onExtraCallback(this).onUnminimized()));
        }
        EditText editText = onTransact().getEditText();
        if (editText != null) {
            editText.setImeOptions(6);
            editText.setKeyListener(this.onExtraCallback);
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6), new InputFilter.AllCaps()});
        }
        TdsImageView tdsImageViewOnExtraCallbackWithResult = onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(new char[]{1, 21, 17, 21, 22, 17, 13804, 13804, 18, 17, 6, 21, 15, 16, 21, 15, 7, 15, 15, 22, 15, 19, 4, 17, 13869, 13869, '\f', 18, 17, 18, 4, 17, 7, 18, 1, '\r', '\r', 3, 17, '\t', 20, 24, '\n', 1, 15, 16, 21, '\t', 19, 22, '\n', 16, 11, 18, 21, 23, 5, 11}, (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 54), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 58, objArr);
        TdsImageView.setImage$default(tdsImageViewOnExtraCallbackWithResult, ((String) objArr[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        EditText editText2 = onTransact().getEditText();
        if (editText2 != null) {
            editText2.addTextChangedListener(new onExtraCallback());
            int i2 = asBinder + 41;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 % 5;
            }
        }
        EditText editText3 = onTransact().getEditText();
        if (editText3 != null && (text = editText3.getText()) != null && text.length() == 0) {
            int i4 = asBinder + 29;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                M_.onNavigationEvent(1312897292, new Object[]{M_.onExtraCallback, onTransact()}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1312897289, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
                throw null;
            }
            M_.onNavigationEvent(1312897292, new Object[]{M_.onExtraCallback, onTransact()}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1312897289, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
        }
        onExtraCallback().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CardIssueDriverSerialIdFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CardIssueDriverSerialIdFragment.IAuthTabCallback(this.f$0, view2);
            }
        });
        onWarmupCompleted().IAuthTabCallback.onNavigationEvent().setVisibility(8);
        KeyboardBottomCta keyboardBottomCtaOnNavigationEvent = onNavigationEvent();
        String string = getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        KeyboardBottomCta.setCta$default(keyboardBottomCtaOnNavigationEvent, string, new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CardIssueDriverSerialIdFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CardIssueDriverSerialIdFragment.onExtraCallbackWithResult(this.f$0, view2);
            }
        }, (TdsButtonV1View.asInterface) null, 4, (Object) null);
        transparentBackground.onExtraCallback(onNavigationEvent().onWarmupCompleted());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallbackStub;
        float f = 0.0f;
        if (cArr2 != null) {
            int i4 = $11 + 1;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), 27 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $11 + 7;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(asInterface)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 26, (Process.myTid() >> 22) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i9 = $11 + 115;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i10 = $10 + 85;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 24824), 74 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.rgb(0, 0, 0) + 16785304, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 30, (Process.myPid() >> 22) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                        } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i13 = $10 + 53;
                            $11 = i13 % 128;
                            int i14 = i13 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                        } else {
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                        }
                    }
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardIssueDriverSerialIdFragment cardIssueDriverSerialIdFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{cardIssueDriverSerialIdFragment, commonModule_setLeftEdgeTouchEnabled}, 728347241, iOnExtraCallbackWithResult, -728347239, iOnExtraCallbackWithResult3);
    }

    private final String IAuthTabCallbackDefault() {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (String) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{this}, -2048351443, iOnExtraCallbackWithResult, 2048351444, iOnExtraCallbackWithResult3);
    }

    private final TdsTopV2View asBinder() {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (TdsTopV2View) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{this}, 551084858, iOnExtraCallbackWithResult, -551084858, iOnExtraCallbackWithResult3);
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackStub = new char[]{64991, 64978, 64924, 64897, 64981, 64988, 64989, 64965, 64983, 64977, 64980, 64926, 64905, 64966, 64979, 64976, 64967, 64960, 64990, 64986, 64925, 64987, 64963, 64961, 64982};
        asInterface = (char) 51244;
    }
}
