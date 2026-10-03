package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ComputeExpression;
import o.DHParameter;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.GriverTransActivityLite1;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IdGeneratorExternalSyntheticLambda1;
import o.PageRenderReadyListener;
import o.PlayerErrorCode;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.RippleNode;
import o.SignerIdentifier;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.UTIL_HexStringToBin;
import o.UniformLocalAuthDialogExtensionImplUniformLocalAuthDialog1;
import o.UniformLocalAuthDialogExtensionImplUniformLocalAuthDialog2;
import o.UniformLocalAuthDialogExtensionImplUniformLocalAuthDialogClickNameListener;
import o.UniformLocalAuthDialogExtensionImplUniformLocalAuthDialogExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15400;
import o.addAllCommandLine;
import o.detect;
import o.findResAndMsg;
import o.formatMsgs;
import o.getAdService;
import o.getDigestAlgorithms;
import o.getKeyDerivationFunc;
import o.getModulus;
import o.getPackageType;
import o.getSpecialFeatureOptInStatus;
import o.getTypeID;
import o.getUrlokhttp;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.onPageExit;
import o.preFillDefault;
import o.readIntokhttp;
import o.setApTextSize;
import o.setCommandLine;
import o.setLogBuffers;
import o.setRandomHost;
import o.setRevision;
import o.setRipple;
import o.setRubIn;
import o.setWrite;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFinCertSignActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueCertSignSelectFragment extends CardIssueBaseFragment<DHParameter> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    public static final int IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static char[] IAuthTabCallbackStub = null;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int asBinder;
    private static char asInterface;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback;
    private static final IdGeneratorExternalSyntheticLambda1 onWarmupCompleted;
    private final PageRenderReadyListener onExtraCallbackWithResult;
    private final IEngagementSignalsCallback_Parcel<Intent> onNavigationEvent;
    private final IEngagementSignalsCallback_Parcel<Intent> onTransact;

    static {
        onExtraCallbackWithResult();
        onExtraCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(CardIssueCertSignSelectFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCreditCardIssueCertSignSelectBinding;", 0)};
        Companion = new onWarmupCompleted(null);
        IAuthTabCallback = 8;
        onWarmupCompleted = IdGeneratorExternalSyntheticLambda1.Companion.onExtraCallback("yyyy.MM.dd");
        int i = IAuthTabCallback_Parcel + 65;
        access000 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~(i | i2 | i4);
        int i8 = ~i;
        int i9 = ~i2;
        int i10 = ~(i8 | i9);
        int i11 = ~i4;
        int i12 = (~(i8 | i11)) | i10 | (~(i9 | i11));
        int i13 = i11 | i10;
        int i14 = i + i2 + i3 + (105149790 * i5) + ((-719480883) * i6);
        int i15 = i14 * i14;
        int i16 = (i * (-424837635)) + 281018368 + ((-424837635) * i2) + (1798143484 * i7) + (i12 * (-1798143484)) + ((-1798143484) * i13) + (2071986176 * i3) + ((-654311424) * i5) + (1702887424 * i6) + ((-155189248) * i15);
        int i17 = (i * 910058005) + 1460508013 + (i2 * 910058005) + (i7 * (-484)) + (i12 * 484) + (i13 * 484) + (i3 * 910058489) + (i5 * (-759332242)) + (i6 * (-1121784475)) + (i15 * 1086324736);
        int i18 = i16 + (i17 * i17 * (-1925185536));
        if (i18 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i18 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i18 == 3) {
            return onExtraCallback(objArr);
        }
        if (i18 == 4) {
            return onNavigationEvent(objArr);
        }
        final CardIssueCertSignSelectFragment cardIssueCertSignSelectFragment = (CardIssueCertSignSelectFragment) objArr[0];
        int i19 = 2 % 2;
        CommonModule_setScreenAwakeMode.onNavigationEvent(cardIssueCertSignSelectFragment, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return CardIssueCertSignSelectFragment.onNavigationEvent(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
        int i20 = IAuthTabCallbackDefault + 121;
        asBinder = i20 % 128;
        int i21 = i20 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallback(CardIssueCertSignSelectFragment cardIssueCertSignSelectFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(cardIssueCertSignSelectFragment, iEngagementSignalsCallbackDefault);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cardIssueCertSignSelectFragment, iEngagementSignalsCallbackDefault);
        int i3 = asBinder + 45;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardIssueCertSignSelectFragment cardIssueCertSignSelectFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cardIssueCertSignSelectFragment, view);
        int i4 = asBinder + 5;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardIssueCertSignSelectFragment cardIssueCertSignSelectFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(cardIssueCertSignSelectFragment, commonModule_setLeftEdgeTouchEnabled);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(cardIssueCertSignSelectFragment, commonModule_setLeftEdgeTouchEnabled);
        int i3 = asBinder + 101;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueCertSignSelectFragment cardIssueCertSignSelectFragment, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(cardIssueCertSignSelectFragment, view);
        }
        onExtraCallbackWithResult(cardIssueCertSignSelectFragment, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueCertSignSelectFragment cardIssueCertSignSelectFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(cardIssueCertSignSelectFragment, iEngagementSignalsCallbackDefault);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(cardIssueCertSignSelectFragment, iEngagementSignalsCallbackDefault);
        int i3 = IAuthTabCallbackDefault + 45;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public CardIssueCertSignSelectFragment() {
        super(R.layout.fragment_credit_card_issue_cert_sign_select);
        this.onExtraCallbackWithResult = preFillDefault.IAuthTabCallback(this, onNavigationEvent.onWarmupCompleted);
        this.onNavigationEvent = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CardIssueCertSignSelectFragment.onExtraCallback(this.f$0, (IEngagementSignalsCallbackDefault) obj);
            }
        });
        this.onTransact = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return CardIssueCertSignSelectFragment.onWarmupCompleted(this.f$0, (IEngagementSignalsCallbackDefault) obj);
            }
        });
    }

    public static final /* synthetic */ getPackageType IAuthTabCallback(CardIssueCertSignSelectFragment cardIssueCertSignSelectFragment, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getPackageType getpackagetypeOnExtraCallbackWithResult = cardIssueCertSignSelectFragment.onExtraCallbackWithResult(str);
        int i4 = asBinder + 93;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return getpackagetypeOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static final /* synthetic */ IdGeneratorExternalSyntheticLambda1 onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Unit onNavigationEvent(CardIssueCertSignSelectFragment cardIssueCertSignSelectFragment, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return cardIssueCertSignSelectFragment.IAuthTabCallback(str);
        }
        cardIssueCertSignSelectFragment.IAuthTabCallback(str);
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(CardIssueCertSignSelectFragment cardIssueCertSignSelectFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onExtraCallback(-1895348442, 1895348442, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{cardIssueCertSignSelectFragment}, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        int i4 = IAuthTabCallbackDefault + 23;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function1<View, UTIL_HexStringToBin> {
        public static final onNavigationEvent onWarmupCompleted = new onNavigationEvent();

        onNavigationEvent() {
            super(1, UTIL_HexStringToBin.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCreditCardIssueCertSignSelectBinding;", 0);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final UTIL_HexStringToBin invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return UTIL_HexStringToBin.onExtraCallbackWithResult(view);
        }
    }

    private final UTIL_HexStringToBin onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        UTIL_HexStringToBin uTIL_HexStringToBin = (UTIL_HexStringToBin) this.onExtraCallbackWithResult.onNavigationEvent(this, onExtraCallback[0]);
        int i4 = asBinder + 89;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return uTIL_HexStringToBin;
    }

    private static final Unit onExtraCallbackWithResult(CardIssueCertSignSelectFragment cardIssueCertSignSelectFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        int iOnNavigationEvent = iEngagementSignalsCallbackDefault.onNavigationEvent();
        if (iOnNavigationEvent != -1) {
            int i4 = asBinder + 105;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            if (iOnNavigationEvent == 1) {
                int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                onExtraCallback(-1895348442, 1895348442, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{cardIssueCertSignSelectFragment}, setApTextSize.onNavigationEvent.4.onNavigationEvent());
            }
        } else {
            String string = cardIssueCertSignSelectFragment.getString(R.string.app_credit_card_issue_cert_sign_fin);
            Intrinsics.checkNotNullExpressionValue(string, "");
            cardIssueCertSignSelectFragment.onExtraCallbackWithResult(string);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(CardIssueCertSignSelectFragment cardIssueCertSignSelectFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            onExtraCallback(1685998871, -1685998868, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{cardIssueCertSignSelectFragment}, setApTextSize.onNavigationEvent.4.onNavigationEvent());
            cardIssueCertSignSelectFragment.access100();
            int i4 = IAuthTabCallbackDefault + 21;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            onExtraCallback(-736162137, 736162139, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, setApTextSize.onNavigationEvent.4.onNavigationEvent());
            onExtraCallback(1536431667, -1536431666, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, setApTextSize.onNavigationEvent.4.onNavigationEvent());
            readTypedObject().onWarmupCompleted();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        onExtraCallback(-736162137, 736162139, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        onExtraCallback(1536431667, -1536431666, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        if (!(!readTypedObject().onWarmupCompleted())) {
            onExtraCallback(1685998871, -1685998868, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        }
        int i3 = asBinder + 17;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        int I$1;
        Object L$0;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CardIssueCertSignSelectFragment.this.new onExtraCallback(access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Date notAfter;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Result.Companion companion = Result.Companion;
                    writeRaw writerawOnTransact = getTypeID.IAuthTabCallback.onTransact();
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = RxAwaitKt.onWarmupCompleted(writerawOnTransact, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = Result.constructor-impl(((detect) obj).onNavigationEvent());
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            String str = null;
            if (Result.onExtraCallback(obj2)) {
                obj2 = null;
            }
            X509Certificate x509Certificate = (X509Certificate) obj2;
            if (x509Certificate != null && (notAfter = x509Certificate.getNotAfter()) != null) {
                str = CardIssueCertSignSelectFragment.onExtraCallback().format(notAfter);
            }
            if (str == null) {
                str = "";
            }
            CardIssueCertSignSelectFragment.onNavigationEvent(CardIssueCertSignSelectFragment.this, str);
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CardIssueCertSignSelectFragment cardIssueCertSignSelectFragment = (CardIssueCertSignSelectFragment) objArr[0];
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = cardIssueCertSignSelectFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, cardIssueCertSignSelectFragment.new onExtraCallback(null), 3, (Object) null);
        int i2 = asBinder + 57;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        CardIssueCertSignSelectFragment cardIssueCertSignSelectFragment = (CardIssueCertSignSelectFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 89;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        cardIssueCertSignSelectFragment.onTransact();
        cardIssueCertSignSelectFragment.IAuthTabCallbackDefault();
        cardIssueCertSignSelectFragment.IAuthTabCallbackStub();
        int i4 = asBinder + 113;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final Unit onTransact() {
        TdsTopV2View tdsTopV2View;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted();
            obj.hashCode();
            throw null;
        }
        UTIL_HexStringToBin uTIL_HexStringToBinOnWarmupCompleted = onWarmupCompleted();
        if (uTIL_HexStringToBinOnWarmupCompleted == null || (tdsTopV2View = uTIL_HexStringToBinOnWarmupCompleted.onTransact) == null) {
            int i3 = IAuthTabCallbackDefault + 109;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        int i5 = asBinder + 95;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        tdsTopV2View.setUpperGap(24);
        tdsTopV2View.setLowerGap(24);
        tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        tdsTopV2View.setTitleText(readTypedObject().asInterface());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r1 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment.IAuthTabCallbackDefault + 31;
        viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment.asBinder = r1 % 128;
        r1 = r1 % 2;
        r5 = new java.lang.Object[1];
        a(new char[]{'\b', 20, 24, 23, 11, 21, 13758, 13758, '\b', 21, '\b', 22, '\f', 4, '\r', 20, 16, 5, 5, 11, '\n', 24, 24, 14, 11, '\t', 20, 17, 7, '\b', '\f', 18, 1, 5, 17, 24, '\n', 20, 20, 18, '\t', 16, 7, '\f', 24, 6, 3, 1, 22, 24, '\n', '\f', '\f', 4, '\b', 22, '\n', 19, 15, '\r', 23, 17, 13830}, (byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 63, r5);
        im.toss.tds.view.component.atom.image.TdsImageView.setImage$default(r1, ((java.lang.String) r5[0]).intern(), (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r1 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.Unit IAuthTabCallbackDefault() throws java.lang.Throwable {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment.asBinder
            int r1 = r1 + 123
            int r2 = r1 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment.IAuthTabCallbackDefault = r2
            int r1 = r1 % r0
            o.UTIL_HexStringToBin r1 = r10.onWarmupCompleted()
            if (r1 == 0) goto L63
            int r2 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment.asBinder
            int r2 = r2 + 31
            int r3 = r2 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment.IAuthTabCallbackDefault = r3
            int r2 = r2 % r0
            r3 = 0
            im.toss.tds.view.component.atom.image.TdsImageView r1 = r1.onExtraCallback
            if (r2 != 0) goto L27
            r2 = 56
            int r2 = r2 / r3
            if (r1 == 0) goto L63
        L25:
            r4 = r1
            goto L2a
        L27:
            if (r1 == 0) goto L63
            goto L25
        L2a:
            int r1 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment.IAuthTabCallbackDefault
            int r1 = r1 + 31
            int r2 = r1 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment.asBinder = r2
            int r1 = r1 % r0
            r0 = 63
            char[] r0 = new char[r0]
            r0 = {x006e: FILL_ARRAY_DATA , data: [8, 20, 24, 23, 11, 21, 13758, 13758, 8, 21, 8, 22, 12, 4, 13, 20, 16, 5, 5, 11, 10, 24, 24, 14, 11, 9, 20, 17, 7, 8, 12, 18, 1, 5, 17, 24, 10, 20, 20, 18, 9, 16, 7, 12, 24, 6, 3, 1, 22, 24, 10, 12, 12, 4, 8, 22, 10, 19, 15, 13, 23, 17, 13830} // fill-array
            int r1 = android.view.ViewConfiguration.getMaximumFlingVelocity()
            int r1 = r1 >> 16
            int r1 = r1 + 9
            byte r1 = (byte) r1
            int r2 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r2 = r2 >> 16
            int r2 = r2 + 63
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            a(r0, r1, r2, r5)
            r0 = r5[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = r0.intern()
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            im.toss.tds.view.component.atom.image.TdsImageView.setImage$default(r4, r5, r6, r7, r8, r9)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L63:
            int r1 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment.asBinder
            int r1 = r1 + 113
            int r2 = r1 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment.IAuthTabCallbackDefault = r2
            int r1 = r1 % r0
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment.IAuthTabCallbackDefault():kotlin.Unit");
    }

    private final Unit IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        asBinder = i2 % 128;
        SpannableString spannableString = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted();
            throw null;
        }
        UTIL_HexStringToBin uTIL_HexStringToBinOnWarmupCompleted = onWarmupCompleted();
        if (uTIL_HexStringToBinOnWarmupCompleted == null) {
            return null;
        }
        String string = getString(R.string.app_credit_card_issue_cert_sign_expire_prefix);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str2 = string + " " + str;
        uTIL_HexStringToBinOnWarmupCompleted.asInterface.setText(PlayerErrorCode.onPostMessage());
        Typography6 typography6 = uTIL_HexStringToBinOnWarmupCompleted.IAuthTabCallbackStub;
        if (!StringsKt.isBlank(str)) {
            spannableString = new SpannableString(str2);
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            Configuration configuration = contextRequireContext.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            spannableString.setSpan(new ForegroundColorSpan(new getUrlokhttp(new IAuthTabCallback(configuration)).onTransact()), str2.length() - str.length(), str2.length(), 33);
            int i3 = IAuthTabCallbackDefault + 109;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }
        typography6.setText(spannableString);
        return Unit.INSTANCE;
    }

    private final Unit IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        UTIL_HexStringToBin uTIL_HexStringToBinOnWarmupCompleted = onWarmupCompleted();
        if (uTIL_HexStringToBinOnWarmupCompleted != null) {
            int i4 = IAuthTabCallbackDefault + 83;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            TdsBottomCtaV1View tdsBottomCtaV1View = uTIL_HexStringToBinOnWarmupCompleted.IAuthTabCallback;
            if (i5 != 0) {
                throw null;
            }
            if (tdsBottomCtaV1View != null) {
                TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, R.string.next, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment$$ExternalSyntheticLambda3
                    public final Object invoke(Object obj) {
                        return CardIssueCertSignSelectFragment.onNavigationEvent(this.f$0, (View) obj);
                    }
                }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
                tdsBottomCtaV1View.setBottomButton(R.string.app_credit_card_issue_cert_sign_fin_title, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment$$ExternalSyntheticLambda4
                    public final Object invoke(Object obj) {
                        return CardIssueCertSignSelectFragment.onWarmupCompleted(this.f$0, (View) obj);
                    }
                });
                tdsBottomCtaV1View.setBottomButtonType(TdsTextButtonV0View.IAuthTabCallback.GREY);
                return Unit.INSTANCE;
            }
        }
        return null;
    }

    private static final Unit IAuthTabCallback(CardIssueCertSignSelectFragment cardIssueCertSignSelectFragment, View view) {
        Unit unit;
        int i = 2 % 2;
        int i2 = asBinder + 11;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            onExtraCallback(-327276948, 327276952, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{cardIssueCertSignSelectFragment}, setApTextSize.onNavigationEvent.4.onNavigationEvent());
            unit = Unit.INSTANCE;
            int i3 = 60 / 0;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            onExtraCallback(-327276948, 327276952, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{cardIssueCertSignSelectFragment}, setApTextSize.onNavigationEvent.4.onNavigationEvent());
            unit = Unit.INSTANCE;
        }
        int i4 = asBinder + 111;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(CardIssueCertSignSelectFragment cardIssueCertSignSelectFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            cardIssueCertSignSelectFragment.getInterfaceDescriptor();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(view, "");
        cardIssueCertSignSelectFragment.getInterfaceDescriptor();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CardIssueCertSignSelectFragment.this.new onExtraCallbackWithResult(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
        public final Object invokeSuspend(Object obj) throws setWrite {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                setRubIn<SignerIdentifier> setrubinPrefetchWithMultipleUrls = CardIssueCertSignSelectFragment.this.extraCallback().prefetchWithMultipleUrls();
                final CardIssueCertSignSelectFragment cardIssueCertSignSelectFragment = CardIssueCertSignSelectFragment.this;
                setRipple setripple = new setRipple() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment.onExtraCallbackWithResult.3
                    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                    public final Object emit(SignerIdentifier signerIdentifier, access13800<? super Unit> access13800Var) throws Throwable {
                        if (!cardIssueCertSignSelectFragment.extraCallback().postMessage()) {
                            return Unit.INSTANCE;
                        }
                        if (signerIdentifier instanceof SignerIdentifier.IAuthTabCallback) {
                            cardIssueCertSignSelectFragment.extraCallback().IAuthTabCallback(false);
                            CardIssueCertSignSelectFragment cardIssueCertSignSelectFragment2 = cardIssueCertSignSelectFragment;
                            String string = cardIssueCertSignSelectFragment2.getString(R.string.app_name);
                            Intrinsics.checkNotNullExpressionValue(string, "");
                            CardIssueCertSignSelectFragment.IAuthTabCallback(cardIssueCertSignSelectFragment2, string);
                        } else if (signerIdentifier instanceof SignerIdentifier.onWarmupCompleted) {
                            cardIssueCertSignSelectFragment.extraCallback().IAuthTabCallback(false);
                            CardIssueCertSignSelectFragment.onNavigationEvent(cardIssueCertSignSelectFragment);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (setrubinPrefetchWithMultipleUrls.collect(setripple, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            throw new setWrite();
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CardIssueCertSignSelectFragment cardIssueCertSignSelectFragment = (CardIssueCertSignSelectFragment) objArr[0];
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = cardIssueCertSignSelectFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, cardIssueCertSignSelectFragment.new onExtraCallbackWithResult(null), 3, (Object) null);
        int i2 = IAuthTabCallbackDefault + 83;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 74 / 0;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r5.IAuthTabCallback_Parcel();
        r5 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment.asBinder + 9;
        viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment.IAuthTabCallbackDefault = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if ((r5 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r5 = 45 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r5.readTypedObject().onWarmupCompleted() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r5.readTypedObject().onWarmupCompleted() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        r5.access100();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r5) {
        /*
            r0 = 0
            r5 = r5[r0]
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment r5 = (viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment) r5
            r1 = 2
            int r2 = r1 % r1
            int r2 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment.IAuthTabCallbackDefault
            int r2 = r2 + 29
            int r3 = r2 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment.asBinder = r3
            int r2 = r2 % r1
            r3 = 0
            if (r2 == 0) goto L24
            o.getEncryptedData r2 = r5.readTypedObject()
            o.DHParameter r2 = (o.DHParameter) r2
            boolean r2 = r2.onWarmupCompleted()
            r4 = 95
            int r4 = r4 / r0
            if (r2 == 0) goto L34
            goto L30
        L24:
            o.getEncryptedData r2 = r5.readTypedObject()
            o.DHParameter r2 = (o.DHParameter) r2
            boolean r2 = r2.onWarmupCompleted()
            if (r2 == 0) goto L34
        L30:
            r5.access100()
            return r3
        L34:
            r5.IAuthTabCallback_Parcel()
            int r5 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment.asBinder
            int r5 = r5 + 9
            int r2 = r5 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment.IAuthTabCallbackDefault = r2
            int r5 = r5 % r1
            if (r5 != 0) goto L45
            r5 = 45
            int r5 = r5 / r0
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment.onNavigationEvent(java.lang.Object[]):java.lang.Object");
    }

    private final void access100() {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getModulus getmodulusIAuthTabCallbackStub = readTypedObject().IAuthTabCallbackStub();
        if (getmodulusIAuthTabCallbackStub != null) {
            extraCallback().IAuthTabCallback(true);
            extraCallback().newSession().setValue(new getDigestAlgorithms(getmodulusIAuthTabCallbackStub, writeTypedObject().onExtraCallback(), writeTypedObject().onNavigationEvent(), writeTypedObject().onWarmupCompleted(), false, null, 48, null));
            return;
        }
        int i4 = IAuthTabCallbackDefault + 73;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
    }

    private final void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = this.onTransact;
        UniformLocalAuthDialogExtensionImplUniformLocalAuthDialog1 uniformLocalAuthDialogExtensionImplUniformLocalAuthDialog1OnNavigationEvent = UniformLocalAuthDialogExtensionImplUniformLocalAuthDialogClickNameListener.IAuthTabCallback.onNavigationEvent();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        iEngagementSignalsCallback_Parcel.onNavigationEvent(UniformLocalAuthDialogExtensionImplUniformLocalAuthDialog1.onWarmupCompleted(uniformLocalAuthDialogExtensionImplUniformLocalAuthDialog1OnNavigationEvent, contextRequireContext, 0L, (GriverTransActivityLite1) null, (UniformLocalAuthDialogExtensionImplUniformLocalAuthDialog2) null, (UniformLocalAuthDialogExtensionImplUniformLocalAuthDialogExternalSyntheticLambda0) null, "toss_card_funnel", "toss_card_funnel", (String) null, false, 414, (Object) null));
        int i4 = IAuthTabCallbackDefault + 13;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void getInterfaceDescriptor() {
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        String strICustomTabsCallbackStubProxy = extraCallback().ICustomTabsCallbackStubProxy();
        if (strICustomTabsCallbackStubProxy == null) {
            return;
        }
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = this.onNavigationEvent;
        CardIssueFinCertSignActivity.onExtraCallbackWithResult onextracallbackwithresult = CardIssueFinCertSignActivity.Companion;
        Context contextRequireContext = requireContext();
        String str = "";
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        getKeyDerivationFunc getkeyderivationfuncOnExtraCallbackWithResult = readTypedObject().onExtraCallbackWithResult();
        if (getkeyderivationfuncOnExtraCallbackWithResult != null) {
            int i2 = asBinder + 107;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            strOnExtraCallbackWithResult = getkeyderivationfuncOnExtraCallbackWithResult.onExtraCallbackWithResult();
        } else {
            int i4 = asBinder + 119;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            strOnExtraCallbackWithResult = null;
        }
        if (strOnExtraCallbackWithResult == null) {
            int i6 = IAuthTabCallbackDefault;
            int i7 = i6 + 81;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 19;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
        } else {
            str = strOnExtraCallbackWithResult;
        }
        iEngagementSignalsCallback_Parcel.onNavigationEvent(onextracallbackwithresult.IAuthTabCallback(contextRequireContext, strICustomTabsCallbackStubProxy, str));
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CardIssueCertSignSelectFragment.this.new onTransact(access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
                long jIAuthTabCallback = setCommandLine.IAuthTabCallback(1500L, setRevision.MILLISECONDS);
                this.label = 1;
                if (formatMsgs.IAuthTabCallback(jIAuthTabCallback, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            getDigestAlgorithms.onExtraCallback(CardIssueCertSignSelectFragment.this.writeTypedObject(), RippleNode.onNavigationEvent(CardIssueCertSignSelectFragment.this), CardIssueCertSignSelectFragment.this.extraCallback(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, (String) null, (String) null, (Map) null, 40, (Object) null);
            return Unit.INSTANCE;
        }
    }

    private final getPackageType onExtraCallbackWithResult(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        UTIL_HexStringToBin uTIL_HexStringToBinOnWarmupCompleted = onWarmupCompleted();
        if (uTIL_HexStringToBinOnWarmupCompleted == null) {
            int i4 = asBinder + 51;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        TdsImageView tdsImageView = uTIL_HexStringToBinOnWarmupCompleted.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        Object[] objArr = new Object[1];
        a(new char[]{'\b', 20, 24, 23, 11, 21, 13826, 13826, '\b', 21, '\b', 22, '\f', 4, '\r', 20, 16, 5, 5, 11, '\n', 24, 15, 18, 18, 20, 24, '\r', 1, 5, 16, '\t', '\n', '\r', 23, '\r', '\b', 21, 20, 16, 0, 1, '\t', 23, 13815, 13815, '\t', '\b', 23, 17, '\r', 11, 23, 17, 13898}, (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 77), 54 - MotionEvent.axisFromString(""), objArr);
        TdsImageView.setImage$default(tdsImageView, ((String) objArr[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        Typography3 typography3 = uTIL_HexStringToBinOnWarmupCompleted.asBinder;
        ComputeExpression computeExpression = ComputeExpression.IAuthTabCallback;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        typography3.setText(computeExpression.onNavigationEvent(contextRequireContext, R.string.app_credit_card_issue_cert_sign_done, new Pair[]{getWrite.IAuthTabCallback("method", str)}));
        ConstraintLayout constraintLayout = uTIL_HexStringToBinOnWarmupCompleted.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        ConstraintLayout constraintLayout2 = uTIL_HexStringToBinOnWarmupCompleted.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        constraintLayout2.setVisibility(0);
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        return maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new onTransact(null), 3, (Object) null);
    }

    private static final Unit onWarmupCompleted(CardIssueCertSignSelectFragment cardIssueCertSignSelectFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
            commonModule_setLeftEdgeTouchEnabled.onExtraCallback(cardIssueCertSignSelectFragment.getString(R.string.app_credit_card_issue_cert_sign_fail_title));
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(cardIssueCertSignSelectFragment.getString(R.string.app_credit_card_issue_cert_sign_fail_description));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(cardIssueCertSignSelectFragment.getString(R.string.app_credit_card_issue_cert_sign_fail_title));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(cardIssueCertSignSelectFragment.getString(R.string.app_credit_card_issue_cert_sign_fail_description));
        int i3 = 98 / 0;
        return Unit.INSTANCE;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = IAuthTabCallbackStub;
        Object obj2 = null;
        int i4 = 8;
        if (cArr3 != null) {
            int i5 = $10 + 65;
            int i6 = i5 % 128;
            $11 = i6;
            if (i5 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i7 = i6 + 113;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> i4), 26 - View.resolveSize(0, 0), 23139 - View.MeasureSpec.makeMeasureSpec(0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i9++;
                    i4 = 8;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(asInterface)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 26 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 23139 - TextUtils.indexOf("", "", 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i10 = $11 + 25;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i12 = $10 + 113;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i14 = $11 + 55;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i16 = $10 + 67;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 24825), Color.alpha(0) + 74, TextUtils.getTrimmedLength("") + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 30, 19488 - (KeyEvent.getMaxKeyCode() >> 16), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i18];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i19 = $10 + 113;
                            $11 = i19 % 128;
                            int i20 = i19 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i21 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i22 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i21];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i22];
                        } else {
                            int i23 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i24 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i23];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i24];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i25 = 0; i25 < i; i25++) {
            cArr4[i25] = (char) (cArr4[i25] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private final void onNavigationEvent() {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onExtraCallback(1685998871, -1685998868, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }

    private final void IAuthTabCallback() {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onExtraCallback(-736162137, 736162139, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }

    private final void asBinder() {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onExtraCallback(-327276948, 327276952, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }

    private final void asInterface() {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onExtraCallback(1536431667, -1536431666, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }

    private final void IAuthTabCallbackStubProxy() {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onExtraCallback(-1895348442, 1895348442, setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, setApTextSize.onNavigationEvent.4.onNavigationEvent());
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallbackStub = new char[]{64982, 64899, 64976, 65065, 64984, 64987, 64960, 64978, 64926, 64983, 64925, 64981, 64980, 64977, 64986, 64988, 64905, 64991, 64989, 64924, 64990, 64961, 64963, 64967, 64896};
        asInterface = (char) 51244;
    }
}
