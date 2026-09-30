package viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.PKCS12_MakePFX;
import o.PageRenderReadyListener;
import o.RippleNode;
import o.SetDetectableSize;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.addAllCommandLine;
import o.getP;
import o.getUnauthenticatedAttributes;
import o.preFillDefault;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity;
import viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CardIssueOcrIntroStep3Fragment extends Hilt_CardIssueOcrIntroStep3Fragment {
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    private static int access000;
    private static byte[] asBinder;
    private static int asInterface;
    public static final int onExtraCallbackWithResult;
    private static short[] onTransact;
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted;
    private final PageRenderReadyListener onExtraCallback;
    private final Lazy onNavigationEvent;
    private static final byte[] $$a = {69, -50, 81, 75};
    private static final int $$b = 215;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStubProxy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, int i2) {
        int i3;
        int i4;
        int i5 = 3 - (s * 2);
        int i6 = 115 - (i2 * 2);
        byte[] bArr = $$a;
        int i7 = (i * 2) + 1;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i7;
            int i9 = i5;
            i4 = 0;
            int i10 = (-i5) + i8;
            i3 = i4;
            int i11 = i9;
            i6 = i10;
            i5 = i11;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i12 = i5 + 1;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            int i13 = i6;
            i9 = i12;
            i5 = bArr[i12];
            i8 = i13;
            int i102 = (-i5) + i8;
            i3 = i4;
            int i112 = i9;
            i6 = i102;
            i5 = i112;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i122 = i5 + 1;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i1222 = i5 + 1;
            if (i4 == i7) {
            }
        }
    }

    static {
        access000 = 0;
        IAuthTabCallback();
        onWarmupCompleted = new addAllCommandLine[]{new PropertyReference1Impl<>(CardIssueOcrIntroStep3Fragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCardIssueOcrImplOcrIntroStep3Binding;", 0)};
        onExtraCallbackWithResult = 8;
        int i = getInterfaceDescriptor + 67;
        access000 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i2);
        int i9 = (~(i7 | i)) | i8;
        int i10 = ~i2;
        int i11 = ~(i10 | i6);
        int i12 = i8 | i11 | (~(i10 | i));
        int i13 = (~((~i) | i10)) | i8 | i11;
        int i14 = i6 + i2 + i3 + ((-369695973) * i5) + (1794320298 * i4);
        int i15 = i14 * i14;
        int i16 = ((-1820121865) * i6) + 1478230016 + (776760710 * i2) + ((-1698084721) * i9) + ((-1731255050) * i12) + (865627525 * i13) + ((-88866816) * i3) + (217841664 * i5) + ((-410517504) * i4) + ((-175177728) * i15);
        int i17 = ((i6 * 1872133577) - 2052485254) + (i2 * 1872135674) + (i9 * 2097) + (i12 * (-1398)) + (i13 * 699) + (i3 * 1872134975) + (i5 * (-1328892763)) + (i4 * (-1296121642)) + (i15 * (-1691287552));
        if (i16 + (i17 * i17 * (-1729036288)) != 1) {
            return onNavigationEvent(objArr);
        }
        CardIssueOcrIntroStep3Fragment cardIssueOcrIntroStep3Fragment = (CardIssueOcrIntroStep3Fragment) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        Function0 function02 = (Function0) objArr[2];
        int i18 = 2 % 2;
        PKCS12_MakePFX pKCS12_MakePFXOnWarmupCompleted = cardIssueOcrIntroStep3Fragment.onWarmupCompleted();
        if (pKCS12_MakePFXOnWarmupCompleted != null) {
            int i19 = IAuthTabCallbackStubProxy + 85;
            IAuthTabCallbackDefault = i19 % 128;
            int i20 = i19 % 2;
            pKCS12_MakePFXOnWarmupCompleted.onExtraCallback.setAnimationFromUrl(cardIssueOcrIntroStep3Fragment.asBinder());
            AnimateText animateText = pKCS12_MakePFXOnWarmupCompleted.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(animateText, BuildConfig.FLAVOR);
            getUnauthenticatedAttributes.onWarmupCompleted(animateText, cardIssueOcrIntroStep3Fragment.onTransact());
            AnimateText animateText2 = pKCS12_MakePFXOnWarmupCompleted.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(animateText2, BuildConfig.FLAVOR);
            getUnauthenticatedAttributes.onExtraCallbackWithResult(animateText2, cardIssueOcrIntroStep3Fragment.IAuthTabCallbackStub());
            TdsBottomCtaV1View tdsBottomCtaV1View = pKCS12_MakePFXOnWarmupCompleted.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, BuildConfig.FLAVOR);
            getUnauthenticatedAttributes.onExtraCallbackWithResult(tdsBottomCtaV1View, function0, function02);
            int i21 = IAuthTabCallbackDefault + 69;
            IAuthTabCallbackStubProxy = i21 % 128;
            int i22 = i21 % 2;
        }
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardIssueOcrIntroStep3Fragment cardIssueOcrIntroStep3Fragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {cardIssueOcrIntroStep3Fragment};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(objArr, iOnWarmupCompleted, -381132377, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 381132377);
        int i4 = IAuthTabCallbackDefault + 57;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardIssueOcrIntroStep3Fragment cardIssueOcrIntroStep3Fragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cardIssueOcrIntroStep3Fragment, setDetectableSize);
        int i4 = IAuthTabCallbackStubProxy + 77;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardIssueOcrIntroStep3Fragment cardIssueOcrIntroStep3Fragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(cardIssueOcrIntroStep3Fragment);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(cardIssueOcrIntroStep3Fragment);
        int i3 = IAuthTabCallbackDefault + 113;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueOcrIntroStep3Fragment cardIssueOcrIntroStep3Fragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 21;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cardIssueOcrIntroStep3Fragment, setDetectableSize);
        int i4 = IAuthTabCallbackStubProxy + 123;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 77;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 1;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return 1473797L;
    }

    public CardIssueOcrIntroStep3Fragment() {
        super(R.layout.fragment_card_issue_ocr_impl_ocr_intro_step3);
        this.onExtraCallback = preFillDefault.IAuthTabCallback(this, onExtraCallbackWithResult.onWarmupCompleted);
        this.onNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(CardIssueOcrIntroV2ViewModel.class), new IAuthTabCallback(this), new onExtraCallback(null, this), new onNavigationEvent(this));
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, PKCS12_MakePFX> {
        public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(1, PKCS12_MakePFX.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCardIssueOcrImplOcrIntroStep3Binding;", 0);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final PKCS12_MakePFX invoke(View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            return PKCS12_MakePFX.onExtraCallback(view);
        }
    }

    private final PKCS12_MakePFX onWarmupCompleted() {
        PageRenderReadyListener pageRenderReadyListener;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            pageRenderReadyListener = this.onExtraCallback;
            addallcommandline = onWarmupCompleted[0];
        } else {
            pageRenderReadyListener = this.onExtraCallback;
            addallcommandline = onWarmupCompleted[0];
        }
        return (PKCS12_MakePFX) pageRenderReadyListener.onNavigationEvent(this, addallcommandline);
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        super.onViewCreated(view, bundle);
        IAuthTabCallback(new Object[]{this, new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep3Fragment$$ExternalSyntheticLambda2
            public final Object invoke() {
                return CardIssueOcrIntroStep3Fragment.onNavigationEvent(this.f$0);
            }
        }, new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep3Fragment$$ExternalSyntheticLambda3
            public final Object invoke() {
                return CardIssueOcrIntroStep3Fragment.IAuthTabCallback(this.f$0);
            }
        }}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 646001296, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -646001295);
        int i2 = IAuthTabCallbackDefault + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(CardIssueOcrIntroStep3Fragment cardIssueOcrIntroStep3Fragment, SetDetectableSize setDetectableSize) throws Throwable {
        TdsBottomCtaV1View tdsBottomCtaV1View;
        TdsButtonV1View tdsButtonV1ViewAsInterface;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
        setDetectableSize.onExtraCallback(cardIssueOcrIntroStep3Fragment.getScreenParams());
        PKCS12_MakePFX pKCS12_MakePFXOnWarmupCompleted = cardIssueOcrIntroStep3Fragment.onWarmupCompleted();
        CharSequence text = null;
        if (pKCS12_MakePFXOnWarmupCompleted == null || (tdsBottomCtaV1View = pKCS12_MakePFXOnWarmupCompleted.IAuthTabCallback) == null || (tdsButtonV1ViewAsInterface = tdsBottomCtaV1View.asInterface()) == null) {
            int i4 = IAuthTabCallbackStubProxy + 3;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = IAuthTabCallbackStubProxy + 73;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 != 0) {
                tdsButtonV1ViewAsInterface.getText();
                throw null;
            }
            text = tdsButtonV1ViewAsInterface.getText();
        }
        Object[] objArr = new Object[1];
        a((short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (byte) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), (-130824778) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1957090741 - MotionEvent.axisFromString(BuildConfig.FLAVOR), (-62) - Color.blue(0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), text);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(final CardIssueOcrIntroStep3Fragment cardIssueOcrIntroStep3Fragment) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1385604L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep3Fragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CardIssueOcrIntroStep3Fragment.IAuthTabCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        RippleNode.onNavigationEvent(cardIssueOcrIntroStep3Fragment).onNavigationEvent(R.id.step4_fragment);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 29;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036 A[PHI: r13
      0x0036: PHI (r13v2 o.PKCS12_MakePFX) = (r13v1 o.PKCS12_MakePFX), (r13v22 o.PKCS12_MakePFX) binds: [B:8:0x0034, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(CardIssueOcrIntroStep3Fragment cardIssueOcrIntroStep3Fragment, SetDetectableSize setDetectableSize) throws Throwable {
        PKCS12_MakePFX pKCS12_MakePFXOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        IAuthTabCallbackStubProxy = i2 % 128;
        CharSequence text = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
            setDetectableSize.onExtraCallback(cardIssueOcrIntroStep3Fragment.getScreenParams());
            pKCS12_MakePFXOnWarmupCompleted = cardIssueOcrIntroStep3Fragment.onWarmupCompleted();
            int i3 = 12 / 0;
            if (pKCS12_MakePFXOnWarmupCompleted != null) {
                TdsBottomCtaV1View tdsBottomCtaV1View = pKCS12_MakePFXOnWarmupCompleted.IAuthTabCallback;
                if (tdsBottomCtaV1View != null) {
                    int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                    TdsButtonV1View tdsButtonV1View = (TdsButtonV1View) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, new Object[]{tdsBottomCtaV1View}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
                    if (tdsButtonV1View != null) {
                        int i4 = IAuthTabCallbackStubProxy + 77;
                        IAuthTabCallbackDefault = i4 % 128;
                        if (i4 % 2 != 0) {
                            tdsButtonV1View.getText();
                            text.hashCode();
                            throw null;
                        }
                        text = tdsButtonV1View.getText();
                    } else {
                        int i5 = IAuthTabCallbackDefault + 5;
                        IAuthTabCallbackStubProxy = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
            setDetectableSize.onExtraCallback(cardIssueOcrIntroStep3Fragment.getScreenParams());
            pKCS12_MakePFXOnWarmupCompleted = cardIssueOcrIntroStep3Fragment.onWarmupCompleted();
            if (pKCS12_MakePFXOnWarmupCompleted != null) {
            }
        }
        Object[] objArr = new Object[1];
        a((short) (KeyEvent.getMaxKeyCode() >> 16), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.green(0) - 130824779, 1957090741 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), Gravity.getAbsoluteGravity(0, 0) - 62, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), text);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallbackDefault + 7;
        IAuthTabCallbackStubProxy = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final CardIssueOcrIntroStep3Fragment cardIssueOcrIntroStep3Fragment = (CardIssueOcrIntroStep3Fragment) objArr[0];
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1385604L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueOcrIntroStep3Fragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return CardIssueOcrIntroStep3Fragment.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        RippleNode.onNavigationEvent(cardIssueOcrIntroStep3Fragment).onExtraCallbackWithResult(getP.Companion.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public Map<String, Object> getScreenParams() {
        CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        CardIssueOcrIntroV2Activity activity = getActivity();
        if (!(!(activity instanceof CardIssueOcrIntroV2Activity))) {
            cardIssueOcrIntroV2Activity = activity;
        } else {
            int i4 = IAuthTabCallbackDefault + 21;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            cardIssueOcrIntroV2Activity = null;
        }
        if (cardIssueOcrIntroV2Activity != null) {
            return cardIssueOcrIntroV2Activity.onWarmupCompleted("bring_vaild_idcard");
        }
        return null;
    }

    private final String onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String string = getString(R.string.card_ocr_impl_intro_step3_title);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        int i4 = IAuthTabCallbackDefault + 69;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    private final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 121;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(getString(R.string.card_ocr_impl_intro_step3_description), BuildConfig.FLAVOR);
            throw null;
        }
        String string = getString(R.string.card_ocr_impl_intro_step3_description);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        int i3 = IAuthTabCallbackDefault + 59;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    private final String asBinder() throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            a((short) (ViewConfiguration.getEdgeSlop() / 94), (byte) KeyEvent.normalizeMetaState(1), (-130824836) >>> KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), (ViewConfiguration.getMinimumFlingVelocity() % 10) + 1957090730, 82 >> KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a((short) (ViewConfiguration.getEdgeSlop() >> 16), (byte) KeyEvent.normalizeMetaState(0), (-130824836) - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1957090730, (-9) - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i3 = IAuthTabCallbackDefault + 49;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, BuildConfig.FLAVOR);
            return viewModelStore;
        }
    }

    public static final class onExtraCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, BuildConfig.FLAVOR);
            return defaultViewModelCreationExtras;
        }
    }

    public static final class onNavigationEvent extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, BuildConfig.FLAVOR);
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01b8 A[PHI: r0
      0x01b8: PHI (r0v9 int) = (r0v8 int), (r0v40 int) binds: [B:42:0x01b6, B:39:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ba A[PHI: r0
      0x01ba: PHI (r0v37 int) = (r0v8 int), (r0v40 int) binds: [B:42:0x01b6, B:39:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallbackStub)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            long j = 0;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 41, 22440 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $11 + 41;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = asBinder;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = $10 + 91;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 55, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i10++;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i13 = $11 + 59;
                    $10 = i13 % 128;
                    i6 = 2;
                    int i14 = i13 % 2;
                    bArr = bArr2;
                } else {
                    i6 = 2;
                }
                if (bArr != null) {
                    byte[] bArr3 = asBinder;
                    Object[] objArr4 = new Object[i6];
                    objArr4[1] = Integer.valueOf(IAuthTabCallback);
                    objArr4[0] = Integer.valueOf(i);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)), Color.red(0) + 42, (ViewConfiguration.getFadingEdgeLength() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onTransact[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i15 = $11 + 23;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    i4 = ((i % iIntValue) / 3) / ((int) (IAuthTabCallback & (-4629411779493505016L)));
                    i5 = z ? 1 : 0;
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                    if (z) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(asInterface), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 86 - Drawable.resolveOpacity(0, 0), 9567 - (ViewConfiguration.getTapTimeout() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = asBinder;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i16 = 0;
                    while (i16 < length2) {
                        int i17 = $11 + 53;
                        $10 = i17 % 128;
                        if (i17 % 2 != 0) {
                            bArr5[i16] = (byte) (bArr4[i16] | (-4629411779493505016L));
                            i16 >>= 1;
                        } else {
                            bArr5[i16] = (byte) (bArr4[i16] ^ (-4629411779493505016L));
                            i16++;
                        }
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        int i18 = $11 + 117;
                        $10 = i18 % 128;
                        int i19 = i18 % 2;
                        byte[] bArr6 = asBinder;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onTransact;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private final void onExtraCallbackWithResult(Function0<Unit> function0, Function0<Unit> function02) {
        IAuthTabCallback(new Object[]{this, function0, function02}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 646001296, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -646001295);
    }

    private static final Unit onExtraCallbackWithResult(CardIssueOcrIntroStep3Fragment cardIssueOcrIntroStep3Fragment) {
        return (Unit) IAuthTabCallback(new Object[]{cardIssueOcrIntroStep3Fragment}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -381132377, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 381132377);
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = -1551113588;
        IAuthTabCallbackStub = -1538795445;
        asInterface = 790557366;
        asBinder = new byte[]{-9, -12, 1, ISO7816.INS_DECREASE_STAMPED, -66, 67, ISO7816.INS_READ_BINARY2, ISO7816.INS_ERASE_BINARY, 1, -16, -16, 26, -4, 3, 63, -63, -6, 25, -10, 62, -63, -13, ISO7816.INS_DECREASE_STAMPED, -50, -14, 12, ISO7816.INS_INCREASE, ISO7816.INS_READ_BINARY_STAMPED, 6, -12, -3, 8, 13, 11, 53, ISO7816.INS_GET_DATA, 12, 51, ISO7816.INS_READ_RECORD2, 8, 12, -13, 78, -61, -14, -3, 27, -27, 9, 76, 8, -3, -49, 11, -12, 8, 4, -15, -16, 3, -3, 8, 8};
    }
}
