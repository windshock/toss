package viva.republica.toss.cardrecommend.issuev2.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ExpandableListView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.sdk.openadsdk.wwx.lt;
import im.toss.uikit.widget.textView.top.TdsTopV1T03View;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.FbValidationUtils;
import o.ManagedRetainedValuesStoreKtExternalSyntheticLambda0;
import o.NISTObjectIdentifiers;
import o.NetConverter3;
import o.PKCS12_MakePFX_ENCPKCS8;
import o.PKCSObjectIdentifiers;
import o.PageContext;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.RippleNode;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.addAllCommandLine;
import o.deserializeFloat;
import o.deserializeUriNullableCollection;
import o.getByteBuffer;
import o.getDigestAlgorithms;
import o.getParamImp;
import o.initMiniApp;
import o.preFillDefault;
import o.setMessageBytes;
import o.unregisterActivityCallbacks;
import o.varyMatches;
import o.wasLastName;
import o.zzck;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueLoadingFragment extends CardIssueBaseFragment<PKCSObjectIdentifiers> {
    private static int IAuthTabCallback;
    private static short[] IAuthTabCallbackDefault;
    private static int asBinder;
    private static byte[] asInterface;
    private static int getInterfaceDescriptor;
    public static final int onNavigationEvent;
    private static int onTransact;
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted;
    private final PageContext onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private static final byte[] $$a = {87, -2, 11, -41};
    private static final int $$b = 78;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, byte r6, int r7) {
        /*
            int r7 = r7 * 3
            int r0 = r7 + 1
            int r5 = r5 * 2
            int r5 = 115 - r5
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r1 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueLoadingFragment.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r6]
        L26:
            int r4 = -r4
            int r5 = r5 + r4
            int r6 = r6 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueLoadingFragment.$$c(int, byte, int):java.lang.String");
    }

    static {
        getInterfaceDescriptor = 0;
        onWarmupCompleted();
        onWarmupCompleted = new addAllCommandLine[]{new PropertyReference1Impl<>(CardIssueLoadingFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCardIssueLoadingLayoutBinding;", 0)};
        onNavigationEvent = 8;
        int i = IAuthTabCallback_Parcel + 57;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CardIssueLoadingFragment cardIssueLoadingFragment = (CardIssueLoadingFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(cardIssueLoadingFragment);
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 113;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardIssueLoadingFragment cardIssueLoadingFragment, Long l) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cardIssueLoadingFragment, l);
        int i4 = IAuthTabCallbackStubProxy + 29;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~(i5 | i4);
        int i11 = i9 | i10 | (~(i5 | i6));
        int i12 = i8 | i5;
        int i13 = (~((~i6) | i5)) | i10;
        int i14 = i5 + i4 + i2 + (111814883 * i) + (1975835455 * i3);
        int i15 = i14 * i14;
        int i16 = (((-1960851331) * i5) - 1583611904) + (47848387 * i4) + (i11 * (-2101222338)) + ((-92522620) * i12) + ((-2101222338) * i13) + ((-2053373952) * i2) + ((-648806400) * i) + (1432616960 * i3) + (442957824 * i15);
        int i17 = ((i5 * 961080817) - 60187382) + (i4 * 961079119) + (i11 * 566) + (i12 * (-1132)) + (i13 * 566) + (i2 * 961079685) + (i * 1618335983) + (i3 * 193609403) + (i15 * 1988296704);
        int i18 = i16 + (i17 * i17 * 176226304);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 97;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallback(CardIssueLoadingFragment cardIssueLoadingFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(cardIssueLoadingFragment);
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        int i5 = IAuthTabCallbackStub + 53;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CardIssueLoadingFragment cardIssueLoadingFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(cardIssueLoadingFragment, th);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cardIssueLoadingFragment, th);
        int i3 = IAuthTabCallbackStubProxy + 55;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ AnimationSet onNavigationEvent(CardIssueLoadingFragment cardIssueLoadingFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        AnimationSet animationSetIAuthTabCallbackDefault = IAuthTabCallbackDefault(cardIssueLoadingFragment);
        int i4 = IAuthTabCallbackStubProxy + 85;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return animationSetIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueLoadingFragment cardIssueLoadingFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(cardIssueLoadingFragment, th);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(cardIssueLoadingFragment, th);
        int i3 = IAuthTabCallbackStub + 3;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 78 / 0;
        }
        return unitIAuthTabCallback;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 101;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 49;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public CardIssueLoadingFragment() {
        super(R.layout.fragment_card_issue_loading_layout);
        this.onExtraCallback = preFillDefault.onExtraCallbackWithResult(this, onExtraCallback.onExtraCallback);
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueLoadingFragment$$ExternalSyntheticLambda4
            public final Object invoke() {
                return CardIssueLoadingFragment.onNavigationEvent(this.f$0);
            }
        });
    }

    public static final /* synthetic */ TdsTopV1T03View IAuthTabCallback(CardIssueLoadingFragment cardIssueLoadingFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return cardIssueLoadingFragment.onExtraCallbackWithResult();
        }
        cardIssueLoadingFragment.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CardIssueLoadingFragment cardIssueLoadingFragment = (CardIssueLoadingFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        TdsTopV1T03View tdsTopV1T03View = (TdsTopV1T03View) onExtraCallback(lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, lt.40.onExtraCallbackWithResult(), 525970872, -525970871, new Object[]{cardIssueLoadingFragment}, iOnExtraCallbackWithResult);
        int i4 = IAuthTabCallbackStubProxy + 45;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return tdsTopV1T03View;
        }
        throw null;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, PKCS12_MakePFX_ENCPKCS8> {
        public static final onExtraCallback onExtraCallback = new onExtraCallback();

        onExtraCallback() {
            super(1, PKCS12_MakePFX_ENCPKCS8.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCardIssueLoadingLayoutBinding;", 0);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final PKCS12_MakePFX_ENCPKCS8 invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return PKCS12_MakePFX_ENCPKCS8.onExtraCallback(view);
        }
    }

    private final PKCS12_MakePFX_ENCPKCS8 onExtraCallback() {
        PageContext pageContext;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            pageContext = this.onExtraCallback;
            addallcommandline = onWarmupCompleted[0];
        } else {
            pageContext = this.onExtraCallback;
            addallcommandline = onWarmupCompleted[0];
        }
        PKCS12_MakePFX_ENCPKCS8 pKCS12_MakePFX_ENCPKCS8 = (PKCS12_MakePFX_ENCPKCS8) pageContext.onExtraCallbackWithResult(this, addallcommandline);
        int i3 = IAuthTabCallbackStub + 75;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return pKCS12_MakePFX_ENCPKCS8;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final LottieAnimationView onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        LottieAnimationView lottieAnimationView = onExtraCallback().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        int i4 = IAuthTabCallbackStub + 119;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return lottieAnimationView;
    }

    private final TdsTopV1T03View onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TdsTopV1T03View tdsTopV1T03View = onExtraCallback().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsTopV1T03View, "");
        int i4 = IAuthTabCallbackStub + 53;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return tdsTopV1T03View;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CardIssueLoadingFragment cardIssueLoadingFragment = (CardIssueLoadingFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TdsTopV1T03View tdsTopV1T03View = cardIssueLoadingFragment.onExtraCallback().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsTopV1T03View, "");
        int i4 = IAuthTabCallbackStub + 111;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return tdsTopV1T03View;
        }
        throw null;
    }

    private final AnimationSet IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AnimationSet animationSet = (AnimationSet) this.onExtraCallbackWithResult.getValue();
        int i3 = IAuthTabCallbackStub + 125;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return animationSet;
    }

    private static final AnimationSet IAuthTabCallbackDefault(CardIssueLoadingFragment cardIssueLoadingFragment) {
        int i = 2 % 2;
        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        animationSet.addAnimation(alphaAnimation);
        Intrinsics.checkNotNullExpressionValue(cardIssueLoadingFragment.getResources().getDisplayMetrics(), "");
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, varyMatches.onNavigationEvent(Float.valueOf(20.0f), r7), 0.0f);
        translateAnimation.setDuration(500L);
        animationSet.addAnimation(translateAnimation);
        int i2 = IAuthTabCallbackStub + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return animationSet;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
    }

    public static final class onExtraCallbackWithResult implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        onExtraCallbackWithResult() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Object[] objArr = {CardIssueLoadingFragment.this};
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            ((TdsTopV1T03View) CardIssueLoadingFragment.onExtraCallback(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), 1869048960, -1869048960, objArr, iOnExtraCallbackWithResult)).setVisibility(4);
        }
    }

    public static final class IAuthTabCallback implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        IAuthTabCallback() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            CardIssueLoadingFragment.IAuthTabCallback(CardIssueLoadingFragment.this).setVisibility(4);
        }
    }

    private static final Unit onExtraCallbackWithResult(CardIssueLoadingFragment cardIssueLoadingFragment, Long l) {
        int i;
        int i2 = 2 % 2;
        Float fValueOf = Float.valueOf(20.0f);
        if (cardIssueLoadingFragment.onExtraCallbackWithResult().getVisibility() == 4) {
            cardIssueLoadingFragment.onExtraCallbackWithResult().setVisibility(0);
            cardIssueLoadingFragment.onExtraCallbackWithResult().startAnimation(cardIssueLoadingFragment.IAuthTabCallback());
            TdsTopV1T03View tdsTopV1T03ViewOnExtraCallbackWithResult = cardIssueLoadingFragment.onExtraCallbackWithResult();
            String str = (String) CollectionsKt.getOrNull(cardIssueLoadingFragment.readTypedObject().onExtraCallbackWithResult(), (int) (l.longValue() % cardIssueLoadingFragment.readTypedObject().onExtraCallbackWithResult().size()));
            if (str != null) {
                int i3 = IAuthTabCallbackStubProxy + 9;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
            } else {
                str = "";
            }
            tdsTopV1T03ViewOnExtraCallbackWithResult.setText(str);
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            TdsTopV1T03View tdsTopV1T03View = (TdsTopV1T03View) onExtraCallback(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), 525970872, -525970871, new Object[]{cardIssueLoadingFragment}, iOnExtraCallbackWithResult);
            AnimationSet animationSet = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(500L);
            animationSet.addAnimation(alphaAnimation);
            Intrinsics.checkNotNullExpressionValue(cardIssueLoadingFragment.getResources().getDisplayMetrics(), "");
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -varyMatches.onNavigationEvent(fValueOf, r5));
            translateAnimation.setDuration(500L);
            animationSet.addAnimation(translateAnimation);
            animationSet.setAnimationListener(cardIssueLoadingFragment.new onExtraCallbackWithResult());
            tdsTopV1T03View.startAnimation(animationSet);
            i = IAuthTabCallbackStubProxy + 111;
        } else {
            int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
            ((TdsTopV1T03View) onExtraCallback(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), 525970872, -525970871, new Object[]{cardIssueLoadingFragment}, iOnExtraCallbackWithResult2)).setVisibility(0);
            int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
            ((TdsTopV1T03View) onExtraCallback(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), 525970872, -525970871, new Object[]{cardIssueLoadingFragment}, iOnExtraCallbackWithResult3)).startAnimation(cardIssueLoadingFragment.IAuthTabCallback());
            int iOnExtraCallbackWithResult4 = lt.40.onExtraCallbackWithResult();
            TdsTopV1T03View tdsTopV1T03View2 = (TdsTopV1T03View) onExtraCallback(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), 525970872, -525970871, new Object[]{cardIssueLoadingFragment}, iOnExtraCallbackWithResult4);
            String str2 = (String) CollectionsKt.getOrNull(cardIssueLoadingFragment.readTypedObject().onExtraCallbackWithResult(), (int) (l.longValue() % cardIssueLoadingFragment.readTypedObject().onExtraCallbackWithResult().size()));
            if (str2 != null) {
                int i5 = IAuthTabCallbackStubProxy + 45;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
            } else {
                str2 = "";
            }
            tdsTopV1T03View2.setText(str2);
            TdsTopV1T03View tdsTopV1T03ViewOnExtraCallbackWithResult2 = cardIssueLoadingFragment.onExtraCallbackWithResult();
            AnimationSet animationSet2 = new AnimationSet(true);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(500L);
            animationSet2.addAnimation(alphaAnimation2);
            Intrinsics.checkNotNullExpressionValue(cardIssueLoadingFragment.getResources().getDisplayMetrics(), "");
            TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, -varyMatches.onNavigationEvent(fValueOf, r5));
            translateAnimation2.setDuration(500L);
            animationSet2.addAnimation(translateAnimation2);
            animationSet2.setAnimationListener(cardIssueLoadingFragment.new IAuthTabCallback());
            tdsTopV1T03ViewOnExtraCallbackWithResult2.startAnimation(animationSet2);
            i = IAuthTabCallbackStubProxy + 105;
        }
        IAuthTabCallbackStub = i % 128;
        int i7 = i % 2;
        return Unit.INSTANCE;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        LottieAnimationView lottieAnimationViewOnNavigationEvent = onNavigationEvent();
        Object[] objArr = new Object[1];
        a((short) ((-8) - (Process.myPid() >> 22)), (byte) ExpandableListView.getPackedPositionGroup(0L), TextUtils.getOffsetBefore("", 0) - 1606217980, (-267095624) + TextUtils.indexOf((CharSequence) "", '0', 0), (-49) - TextUtils.lastIndexOf("", '0', 0), objArr);
        zzck.onExtraCallback(lottieAnimationViewOnNavigationEvent, ((String) objArr[0]).intern(), (ManagedRetainedValuesStoreKtExternalSyntheticLambda0) null, 2, (Object) null);
        lottieAnimationViewOnNavigationEvent.setRepeatMode(1);
        lottieAnimationViewOnNavigationEvent.setRepeatCount(-1);
        lottieAnimationViewOnNavigationEvent.playAnimation();
        onExtraCallbackWithResult(readTypedObject().onWarmupCompleted());
        getByteBuffer getbytebufferOnNavigationEvent = getByteBuffer.onNavigationEvent(0L, 5L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnNavigationEvent, "");
        getByteBuffer getbytebufferOnExtraCallback = getbytebufferOnNavigationEvent.onExtraCallback(RxUtils.onWarmupCompleted((Object) null));
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueLoadingFragment$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return CardIssueLoadingFragment.IAuthTabCallback(this.f$0, (Long) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = getbytebufferOnExtraCallback.IAuthTabCallback(new deserializeFloat() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueLoadingFragment$$ExternalSyntheticLambda6
            public final void accept(Object obj) {
                Object[] objArr2 = {function1, obj};
                int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
                CardIssueLoadingFragment.onExtraCallback(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), -812556476, 812556479, objArr2, iOnExtraCallbackWithResult);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        autoDisposable(deserializeurinullablecollectionIAuthTabCallback);
        int i2 = IAuthTabCallbackStubProxy + 43;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 49 / 0;
        }
    }

    private static final Unit IAuthTabCallbackStub(CardIssueLoadingFragment cardIssueLoadingFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getDigestAlgorithms.onExtraCallback(cardIssueLoadingFragment.writeTypedObject(), RippleNode.onNavigationEvent(cardIssueLoadingFragment), cardIssueLoadingFragment.extraCallback(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, (String) null, (String) null, (Map) null, 32, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 61;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(CardIssueLoadingFragment cardIssueLoadingFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            getParamImp.onWarmupCompleted(th, cardIssueLoadingFragment.requireBaseActivity(), true, (initMiniApp) null, (Function0) null, (Function1) null, 9, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            getParamImp.onWarmupCompleted(th, cardIssueLoadingFragment.requireBaseActivity(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(CardIssueLoadingFragment cardIssueLoadingFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            getDigestAlgorithms.onExtraCallback(cardIssueLoadingFragment.writeTypedObject(), RippleNode.onNavigationEvent(cardIssueLoadingFragment), cardIssueLoadingFragment.extraCallback(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, (String) null, (String) null, (Map) null, 70, (Object) null);
        } else {
            getDigestAlgorithms.onExtraCallback(cardIssueLoadingFragment.writeTypedObject(), RippleNode.onNavigationEvent(cardIssueLoadingFragment), cardIssueLoadingFragment.extraCallback(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, (String) null, (String) null, (Map) null, 32, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 99;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(CardIssueLoadingFragment cardIssueLoadingFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        getParamImp.onWarmupCompleted(th, cardIssueLoadingFragment.requireBaseActivity(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 7;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onExtraCallbackWithResult(FbValidationUtils fbValidationUtils) {
        int i = 2 % 2;
        Object obj = null;
        if (!(fbValidationUtils instanceof unregisterActivityCallbacks)) {
            wasLastName waslastnameOnNavigationEvent = NISTObjectIdentifiers.onExtraCallback(fbValidationUtils).onNavigationEvent(NetConverter3.onExtraCallback()).onNavigationEvent();
            Intrinsics.checkNotNullExpressionValue(waslastnameOnNavigationEvent, "");
            autoDisposable(setMessageBytes.onNavigationEvent(waslastnameOnNavigationEvent, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueLoadingFragment$$ExternalSyntheticLambda2
                public final Object invoke(Object obj2) {
                    return CardIssueLoadingFragment.onExtraCallback(this.f$0, (Throwable) obj2);
                }
            }, new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueLoadingFragment$$ExternalSyntheticLambda3
                public final Object invoke() {
                    return CardIssueLoadingFragment.onExtraCallback(this.f$0);
                }
            }));
            int i2 = IAuthTabCallbackStub + 31;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i3 = IAuthTabCallbackStub + 27;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            wasLastName waslastnameOnExtraCallback = extraCallback().asBinder().get(((unregisterActivityCallbacks) fbValidationUtils).IAuthTabCallback());
            if (waslastnameOnExtraCallback == null) {
                waslastnameOnExtraCallback = NISTObjectIdentifiers.onExtraCallback(fbValidationUtils);
            }
            wasLastName waslastnameOnNavigationEvent2 = waslastnameOnExtraCallback.onExtraCallback(readTypedObject().onWarmupCompleted().onWarmupCompleted(), TimeUnit.SECONDS).onNavigationEvent().onNavigationEvent(NetConverter3.onExtraCallback());
            Intrinsics.checkNotNullExpressionValue(waslastnameOnNavigationEvent2, "");
            autoDisposable(setMessageBytes.onNavigationEvent(waslastnameOnNavigationEvent2, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueLoadingFragment$$ExternalSyntheticLambda0
                public final Object invoke(Object obj2) {
                    return CardIssueLoadingFragment.onWarmupCompleted(this.f$0, (Throwable) obj2);
                }
            }, new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueLoadingFragment$$ExternalSyntheticLambda1
                public final Object invoke() {
                    Object[] objArr = {this.f$0};
                    int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
                    return (Unit) CardIssueLoadingFragment.onExtraCallback(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), -2107906713, 2107906715, objArr, iOnExtraCallbackWithResult);
                }
            }));
            return;
        }
        extraCallback().asBinder().get(((unregisterActivityCallbacks) fbValidationUtils).IAuthTabCallback());
        obj.hashCode();
        throw null;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        boolean z2;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(asBinder)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            long j = 0;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 43424), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 41, 22439 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $11 + 33;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i9 = $10;
                int i10 = i9 + 35;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                byte[] bArr2 = asInterface;
                if (bArr2 != null) {
                    int i11 = i9 + 59;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i13 = 0;
                    while (i13 < length2) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i13])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 12842), 55 - TextUtils.indexOf("", ""), 2166 - Process.getGidForName(""), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr3[i13] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i13++;
                        j = 0;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = asInterface;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16733792) - Color.rgb(0, 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 43, 22439 - KeyEvent.keyCodeFromString(""), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (asBinder ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallbackDefault[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (asBinder ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i14 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                if (z) {
                    int i15 = $10 + 105;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i14 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onTransact), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), 86 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 9567 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = asInterface;
                if (bArr5 != null) {
                    int i17 = $10 + 57;
                    $11 = i17 % 128;
                    if (i17 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        int i18 = $10 + 35;
                        $11 = i18 % 128;
                        int i19 = i18 % 2;
                        bArr[i5] = (byte) (bArr5[i5] ^ (-4629411779493505016L));
                        i5++;
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    int i20 = $10 + 89;
                    $11 = i20 % 128;
                    int i21 = i20 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = asInterface;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallbackDefault;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        onExtraCallback(lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, lt.40.onExtraCallbackWithResult(), -812556476, 812556479, new Object[]{function1, obj}, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueLoadingFragment cardIssueLoadingFragment) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, lt.40.onExtraCallbackWithResult(), -2107906713, 2107906715, new Object[]{cardIssueLoadingFragment}, iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ TdsTopV1T03View onExtraCallbackWithResult(CardIssueLoadingFragment cardIssueLoadingFragment) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        return (TdsTopV1T03View) onExtraCallback(lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, lt.40.onExtraCallbackWithResult(), 1869048960, -1869048960, new Object[]{cardIssueLoadingFragment}, iOnExtraCallbackWithResult);
    }

    private final TdsTopV1T03View IAuthTabCallbackDefault() {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        return (TdsTopV1T03View) onExtraCallback(lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, lt.40.onExtraCallbackWithResult(), 525970872, -525970871, new Object[]{this}, iOnExtraCallbackWithResult);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = -67426060;
        asBinder = -1538795418;
        onTransact = -1414768967;
        asInterface = new byte[]{15, 12, 25, 76, -50, 1, 0, 3, 29, -4, 5, 5, 10, 28, 4, 8, 9, 5, 5, 3, -14, 3, 77, -40, 9, 5, 5, 3, -14, 3, 77, -52, 30, 12, -11, 0, 5, 3, 77, -62, 4, 75, -53, 0, 4, 11, 70, -37, 10, -11, 19, -3, 1, 68, 0, -11, -57, 3, 12, 0, 28, 8};
    }
}
