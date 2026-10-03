package viva.republica.toss.cardrecommend.issuev2.ui;

import android.media.AudioTrack;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.fragment.app.Fragment;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.ApiServerError;
import im.toss.utils.RxUtils;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AdSettingsIntegrationErrorMode;
import o.CatalystInstance;
import o.ConvertByteArrayToFloatArray;
import o.FlowRowOverflowCompanionExternalSyntheticLambda4;
import o.PhotoBrowseView;
import o.PlayerErrorCode;
import o.RippleNode;
import o.SetDetectableSize;
import o.TypographyKtExternalSyntheticLambda0;
import o.createRewardedVideoAd;
import o.deserializeUriNullableCollection;
import o.equalsMethodParams;
import o.getCertificationRequestInfo;
import o.getDigestAlgorithms;
import o.getSignForPKCS7V2;
import o.isBridgeless;
import o.onRenderReady;
import o.r8lambdaB8sg4u3acBcQ1pHLgIU_Ys5BFko;
import o.setMessageBytes;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.common.ArsVerificationFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueArsVerifyFragment extends CardIssueBaseFragment<getCertificationRequestInfo> implements ArsVerificationFragment.onExtraCallback {
    private ArsVerificationFragment IAuthTabCallback;
    private int onExtraCallback;
    private String onExtraCallbackWithResult;
    private String onNavigationEvent;
    private Long onTransact;
    private final int onWarmupCompleted;
    private static final byte[] $$a = {34, -66, 77, 18};
    private static final int $$b = 83;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallbackDefault = 478308980;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[PhotoBrowseView.values().length];
            try {
                iArr[PhotoBrowseView.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhotoBrowseView.WAITING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PhotoBrowseView.IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 105
            byte[] r0 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment.$$a
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r6 = r6 * 4
            int r6 = r6 + 1
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment.$$c(int, int, byte):java.lang.String");
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws Throwable {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | (~(i7 | i3)) | (~(i8 | i3));
        int i10 = ~(i4 | i7);
        int i11 = i3 | i10 | (~(i8 | i6));
        int i12 = i3 + i6 + i2 + (1997535707 * i) + (1930545336 * i5);
        int i13 = i12 * i12;
        int i14 = ((-1352905585) * i3) + 1468203008 + ((-417352845) * i6) + (i9 * 1679707278) + (1679707278 * i10) + ((-1679707278) * i11) + (1262354432 * i2) + ((-1408630784) * i) + ((-2070937600) * i5) + (392888320 * i13);
        int i15 = (i3 * (-2054695253)) + 138751921 + (i6 * (-2054693473)) + (i9 * (-890)) + (i10 * (-890)) + (i11 * 890) + (i2 * (-2054694363)) + (i * 1502648999) + (i5 * 931574424) + (i13 * (-2139684864));
        int i16 = i14 + (i15 * i15 * (-174260224));
        if (i16 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i16 == 2) {
            return onExtraCallback(objArr);
        }
        if (i16 == 3) {
            return onNavigationEvent(objArr);
        }
        if (i16 == 4) {
            return IAuthTabCallback(objArr);
        }
        if (i16 != 5) {
            return onExtraCallbackWithResult(objArr);
        }
        CardIssueArsVerifyFragment cardIssueArsVerifyFragment = (CardIssueArsVerifyFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i17 = 2 % 2;
        int i18 = asBinder + 25;
        asInterface = i18 % 128;
        int i19 = i18 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", cardIssueArsVerifyFragment.extraCallback().IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("funnel_id", cardIssueArsVerifyFragment.extraCallback().getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("session_id", cardIssueArsVerifyFragment.extraCallback().ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("screen_type", cardIssueArsVerifyFragment.readTypedObject().onExtraCallback());
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getTouchSlop() >> 8) + 5, 4 - TextUtils.getCapsMode("", 0, 0), new char[]{65532, 7, 65535, 65528, 7}, false, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 201, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), cardIssueArsVerifyFragment.getString(R.string.ars_restart_button_text));
        Unit unit = Unit.INSTANCE;
        int i20 = asBinder + 91;
        asInterface = i20 % 128;
        int i21 = i20 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CardIssueArsVerifyFragment cardIssueArsVerifyFragment = (CardIssueArsVerifyFragment) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(cardIssueArsVerifyFragment, th);
        int i4 = asBinder + 5;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, BaseApiResponse baseApiResponse) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cardIssueArsVerifyFragment, baseApiResponse);
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {cardIssueArsVerifyFragment, setDetectableSize};
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(iOnNavigationEvent3, iOnNavigationEvent2, 285295502, iOnNavigationEvent, iOnNavigationEvent4, -285295497, objArr);
        int i4 = asBinder + 3;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(cardIssueArsVerifyFragment, setDetectableSize);
        int i4 = asInterface + 11;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = asBinder + 113;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, BaseApiResponse baseApiResponse) {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(cardIssueArsVerifyFragment, baseApiResponse);
        int i4 = asInterface + 107;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, Long l) {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(cardIssueArsVerifyFragment, l);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(cardIssueArsVerifyFragment, l);
        int i3 = asBinder + 103;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 94 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(cardIssueArsVerifyFragment, th);
        }
        onNavigationEvent(cardIssueArsVerifyFragment, th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cardIssueArsVerifyFragment, setDetectableSize);
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CardIssueArsVerifyFragment cardIssueArsVerifyFragment = (CardIssueArsVerifyFragment) objArr[0];
        BaseApiResponse baseApiResponse = (BaseApiResponse) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 125;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            return (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, 1904524064, iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1904524062, new Object[]{cardIssueArsVerifyFragment, baseApiResponse});
        }
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent4, 1904524064, iOnNavigationEvent3, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1904524062, new Object[]{cardIssueArsVerifyFragment, baseApiResponse});
        int i3 = 88 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, 1844495753, iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1844495752, new Object[]{cardIssueArsVerifyFragment, deserializeurinullablecollection});
        int i4 = asInterface + 45;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cardIssueArsVerifyFragment, th);
        int i4 = asBinder + 9;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(cardIssueArsVerifyFragment, setDetectableSize);
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        int i4 = asInterface + 79;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public CardIssueArsVerifyFragment() {
        super(R.layout.fragment_nested_fragment);
        this.onWarmupCompleted = 10;
        this.onNavigationEvent = "";
    }

    @Override // viva.republica.toss.common.ArsVerificationFragment.onExtraCallback
    public /* bridge */ long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        long jIAuthTabCallback = super.IAuthTabCallback();
        int i4 = asBinder + 63;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return jIAuthTabCallback;
    }

    @Override // viva.republica.toss.common.ArsVerificationFragment.onExtraCallback
    public /* bridge */ Map<String, Object> onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapOnExtraCallback = super.onExtraCallback();
        int i4 = asBinder + 47;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return mapOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.common.ArsVerificationFragment.onExtraCallback
    public /* bridge */ String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = super.onNavigationEvent();
        int i4 = asBinder + 95;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        this.IAuthTabCallback = ArsVerificationFragment.Companion.onNavigationEvent(null, (126 & 2) != 0 ? null : readTypedObject().access000(), (126 & 4) != 0 ? null : null, (126 & 8) != 0 ? null : readTypedObject().IAuthTabCallbackStub(), (126 & 16) != 0 ? null : readTypedObject().onTransact(), (126 & 32) != 0 ? null : readTypedObject().onWarmupCompleted(), (126 & 64) == 0 ? readTypedObject().onExtraCallbackWithResult() : null);
        FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult = getChildFragmentManager().onExtraCallbackWithResult();
        int i2 = R.id.fragment_container;
        Fragment fragment = this.IAuthTabCallback;
        if (fragment == null) {
            int i3 = asInterface + 31;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragment = null;
        }
        flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onWarmupCompleted(i2, fragment).onExtraCallbackWithResult();
        onTransact();
        int i4 = asInterface + 39;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.common.ArsVerificationFragment.onExtraCallback
    public void asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        ArsVerificationFragment arsVerificationFragment = this.IAuthTabCallback;
        if (arsVerificationFragment == null) {
            int i5 = i3 + 67;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            arsVerificationFragment = null;
        }
        arsVerificationFragment.onExtraCallback();
        onTransact();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0058 A[PHI: r2
      0x0058: PHI (r2v15 o.isViewAllVisible) = (r2v14 o.isViewAllVisible), (r2v19 o.isViewAllVisible) binds: [B:10:0x0056, B:7:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment r11, im.toss.network.model.BaseApiResponse r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment.onExtraCallback(viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment, im.toss.network.model.BaseApiResponse):kotlin.Unit");
    }

    private static final Unit onNavigationEvent(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1624660039, iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1624660039, new Object[]{cardIssueArsVerifyFragment});
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(th, "");
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent4, -1624660039, iOnNavigationEvent3, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1624660039, new Object[]{cardIssueArsVerifyFragment});
        int i3 = 21 / 0;
        return Unit.INSTANCE;
    }

    private final void onTransact() {
        int i = 2 % 2;
        createRewardedVideoAd createrewardedvideoadAsInterface = readTypedObject().asInterface();
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        String str = (String) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1756374204, iOnNavigationEvent2, iOnNavigationEvent, 1756374207, new Object[0], LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
        String strAsBinder = getSignForPKCS7V2.onWarmupCompleted.asBinder(createrewardedvideoadAsInterface.onNavigationEvent());
        String strSubstring = createrewardedvideoadAsInterface.onExtraCallback().substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        CatalystInstance catalystInstance = new CatalystInstance(3L, str, new isBridgeless(strSubstring, strAsBinder));
        catalystInstance.onExtraCallbackWithResult("SV-AFC", Long.parseLong(PlayerErrorCode.onMinimized()));
        writeRaw writerawIAuthTabCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.newSessionWithExtras().IAuthTabCallback(catalystInstance).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        autoDisposable(setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda13
            public final Object invoke(Object obj) {
                return CardIssueArsVerifyFragment.onExtraCallbackWithResult(this.f$0, (Throwable) obj);
            }
        }, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda14
            public final Object invoke(Object obj) {
                return CardIssueArsVerifyFragment.IAuthTabCallback(this.f$0, (BaseApiResponse) obj);
            }
        }));
        int i2 = asBinder + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onTransact(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", cardIssueArsVerifyFragment.extraCallback().IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("session_id", cardIssueArsVerifyFragment.extraCallback().ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("funnel_id", cardIssueArsVerifyFragment.extraCallback().getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("screen_type", cardIssueArsVerifyFragment.readTypedObject().onExtraCallback());
        String strOnWarmupCompleted = cardIssueArsVerifyFragment.readTypedObject().onWarmupCompleted();
        if (strOnWarmupCompleted == null || strOnWarmupCompleted.length() == 0) {
            strOnWarmupCompleted = cardIssueArsVerifyFragment.getString(R.string.ars_call_button_text);
            Intrinsics.checkNotNullExpressionValue(strOnWarmupCompleted, "");
            int i4 = asBinder + 39;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 % 3;
            }
        }
        Object[] objArr = new Object[1];
        a(5 - TextUtils.getOffsetBefore("", 0), 4 - TextUtils.getTrimmedLength(""), new char[]{65532, 7, 65535, 65528, 7}, false, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 202, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), strOnWarmupCompleted);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CardIssueArsVerifyFragment cardIssueArsVerifyFragment = (CardIssueArsVerifyFragment) objArr[0];
        BaseApiResponse baseApiResponse = (BaseApiResponse) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseApiResponse, "");
        ArsVerificationFragment arsVerificationFragment = null;
        if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()) {
            ArsVerificationFragment arsVerificationFragment2 = cardIssueArsVerifyFragment.IAuthTabCallback;
            if (arsVerificationFragment2 == null) {
                int i4 = asBinder + 29;
                asInterface = i4 % 128;
                if (i4 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                arsVerificationFragment = arsVerificationFragment2;
            }
            arsVerificationFragment.onWarmupCompleted();
        } else {
            ApiServerError apiServerErrorAsInterface = baseApiResponse.asInterface();
            if (apiServerErrorAsInterface != null) {
                ArsVerificationFragment arsVerificationFragment3 = cardIssueArsVerifyFragment.IAuthTabCallback;
                if (arsVerificationFragment3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    arsVerificationFragment3 = null;
                }
                arsVerificationFragment3.onWarmupCompleted(apiServerErrorAsInterface.IAuthTabCallbackDefault());
            }
            ArsVerificationFragment arsVerificationFragment4 = cardIssueArsVerifyFragment.IAuthTabCallback;
            if (arsVerificationFragment4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                arsVerificationFragment = arsVerificationFragment4;
            }
            arsVerificationFragment.onExtraCallback();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = asInterface + 83;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1624660039, iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1624660039, new Object[]{cardIssueArsVerifyFragment});
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 39;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // viva.republica.toss.common.ArsVerificationFragment.onExtraCallback
    public void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1385604L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return CardIssueArsVerifyFragment.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        Long l = this.onTransact;
        ArsVerificationFragment arsVerificationFragment = null;
        if (l != null) {
            if (l != null) {
                writeRaw writerawIAuthTabCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.newSessionWithExtras().onWarmupCompleted(new r8lambdaB8sg4u3acBcQ1pHLgIU_Ys5BFko(l.longValue())).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                autoDisposable(setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda4
                    public final Object invoke(Object obj) {
                        return CardIssueArsVerifyFragment.onWarmupCompleted(this.f$0, (Throwable) obj);
                    }
                }, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda5
                    public final Object invoke(Object obj) {
                        Object[] objArr = {this.f$0, (BaseApiResponse) obj};
                        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
                        return (Unit) CardIssueArsVerifyFragment.IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 595753373, iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -595753370, objArr);
                    }
                }));
            }
            int i2 = asInterface + 121;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 89 / 0;
                return;
            }
            return;
        }
        int i4 = asBinder + 15;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            onRenderReady.onWarmupCompleted(this, R.string.error_retry_message);
            ArsVerificationFragment arsVerificationFragment2 = this.IAuthTabCallback;
            if (arsVerificationFragment2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                arsVerificationFragment = arsVerificationFragment2;
            }
            arsVerificationFragment.onExtraCallback();
            onTransact();
            return;
        }
        onRenderReady.onWarmupCompleted(this, R.string.error_retry_message);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r22, int r23, char[] r24, boolean r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CardIssueArsVerifyFragment cardIssueArsVerifyFragment = (CardIssueArsVerifyFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 91;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            cardIssueArsVerifyFragment.onTransact = null;
            ArsVerificationFragment arsVerificationFragment = cardIssueArsVerifyFragment.IAuthTabCallback;
            if (arsVerificationFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                arsVerificationFragment = null;
            }
            String string = cardIssueArsVerifyFragment.getString(R.string.ars_certification_server_error);
            Intrinsics.checkNotNullExpressionValue(string, "");
            arsVerificationFragment.onWarmupCompleted(string);
            ArsVerificationFragment arsVerificationFragment2 = cardIssueArsVerifyFragment.IAuthTabCallback;
            if (arsVerificationFragment2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                arsVerificationFragment2 = null;
            }
            arsVerificationFragment2.onExtraCallback();
            int i3 = asBinder + 71;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 61 / 0;
            }
            return null;
        }
        cardIssueArsVerifyFragment.onTransact = null;
        ArsVerificationFragment arsVerificationFragment3 = cardIssueArsVerifyFragment.IAuthTabCallback;
        throw null;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asInterface + 95;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CardIssueArsVerifyFragment cardIssueArsVerifyFragment = (CardIssueArsVerifyFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String string = cardIssueArsVerifyFragment.getString(R.string.ars_verification_progress);
        Intrinsics.checkNotNullExpressionValue(string, "");
        cardIssueArsVerifyFragment.showProgressDialog(string, false);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 109;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asInterface + 5;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
    }

    private static final Unit onWarmupCompleted(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, Long l) {
        int i = 2 % 2;
        int i2 = cardIssueArsVerifyFragment.onExtraCallback;
        if (i2 < cardIssueArsVerifyFragment.onWarmupCompleted) {
            cardIssueArsVerifyFragment.onExtraCallback = i2 + 1;
            cardIssueArsVerifyFragment.onExtraCallback(false);
        } else {
            ArsVerificationFragment arsVerificationFragment = cardIssueArsVerifyFragment.IAuthTabCallback;
            if (arsVerificationFragment == null) {
                int i3 = asInterface + 93;
                asBinder = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                arsVerificationFragment = null;
            }
            String string = cardIssueArsVerifyFragment.getString(R.string.ars_certification_server_error);
            Intrinsics.checkNotNullExpressionValue(string, "");
            arsVerificationFragment.onWarmupCompleted(string);
            int i4 = asBinder + 99;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallbackStub(final viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment r9, im.toss.network.model.BaseApiResponse r10) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment.IAuthTabCallbackStub(viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment, im.toss.network.model.BaseApiResponse):kotlin.Unit");
    }

    private static final Unit IAuthTabCallbackDefault(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        asInterface = i2 % 128;
        ArsVerificationFragment arsVerificationFragment = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            cardIssueArsVerifyFragment.onTransact = null;
            ArsVerificationFragment arsVerificationFragment2 = cardIssueArsVerifyFragment.IAuthTabCallback;
            arsVerificationFragment.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        cardIssueArsVerifyFragment.onTransact = null;
        ArsVerificationFragment arsVerificationFragment3 = cardIssueArsVerifyFragment.IAuthTabCallback;
        if (arsVerificationFragment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = asBinder + 91;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = asBinder + 35;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            arsVerificationFragment = arsVerificationFragment3;
        }
        String string = cardIssueArsVerifyFragment.getString(R.string.ars_certification_server_error);
        Intrinsics.checkNotNullExpressionValue(string, "");
        arsVerificationFragment.onWarmupCompleted(string);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r0 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment.asInterface + 89;
        viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment.asBinder = r0 % 128;
        r0 = r0 % 2;
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r1 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment.asInterface + 67;
        viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment.asBinder = r1 % 128;
        r1 = r1 % 2;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r2.onExtraCallback();
        onTransact();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r6 = o.AdSettingsIntegrationErrorMode.onNavigationEvent.newSessionWithExtras();
        r3 = r5.onTransact;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r3 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        r6 = r6.IAuthTabCallback(new o.r8lambdaB8sg4u3acBcQ1pHLgIU_Ys5BFko(r3.longValue())).IAuthTabCallback(im.toss.utils.RxUtils.onExtraCallbackWithResult((java.lang.Object) null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, "");
        r2 = new viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda6(r5);
        r6 = r6.onExtraCallback(new viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda7(r2)).onWarmupCompleted(new viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda8(r5));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, "");
        autoDisposable(o.setMessageBytes.onExtraCallbackWithResult(r6, new viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda9(r5), new viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda10(r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r5.onTransact == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r5.onTransact == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        o.onRenderReady.onWarmupCompleted(r5, viva.republica.toss.R.string.error_retry_message);
        r0 = r5.IAuthTabCallback;
     */
    @Override // viva.republica.toss.common.ArsVerificationFragment.onExtraCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallback(boolean r6) {
        /*
            r5 = this;
            r6 = 2
            int r0 = r6 % r6
            int r0 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment.asBinder
            int r0 = r0 + 73
            int r1 = r0 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment.asInterface = r1
            int r0 = r0 % r6
            java.lang.String r1 = ""
            r2 = 0
            if (r0 != 0) goto L19
            java.lang.Long r0 = r5.onTransact
            r3 = 5
            int r3 = r3 / 0
            if (r0 != 0) goto L44
            goto L1d
        L19:
            java.lang.Long r0 = r5.onTransact
            if (r0 != 0) goto L44
        L1d:
            int r0 = viva.republica.toss.R.string.error_retry_message
            o.onRenderReady.onWarmupCompleted(r5, r0)
            viva.republica.toss.common.ArsVerificationFragment r0 = r5.IAuthTabCallback
            if (r0 != 0) goto L33
            int r0 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment.asInterface
            int r0 = r0 + 89
            int r3 = r0 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment.asBinder = r3
            int r0 = r0 % r6
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            goto L3d
        L33:
            int r1 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment.asInterface
            int r1 = r1 + 67
            int r2 = r1 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment.asBinder = r2
            int r1 = r1 % r6
            r2 = r0
        L3d:
            r2.onExtraCallback()
            r5.onTransact()
            return
        L44:
            o.AdSettingsIntegrationErrorMode r6 = o.AdSettingsIntegrationErrorMode.onNavigationEvent
            o.shouldAutoplay r6 = r6.newSessionWithExtras()
            o.r8lambdaB8sg4u3acBcQ1pHLgIU_Ys5BFko r0 = new o.r8lambdaB8sg4u3acBcQ1pHLgIU_Ys5BFko
            java.lang.Long r3 = r5.onTransact
            if (r3 == 0) goto L91
            long r3 = r3.longValue()
            r0.<init>(r3)
            o.writeRaw r6 = r6.IAuthTabCallback(r0)
            o.deserializeUri r0 = im.toss.utils.RxUtils.onExtraCallbackWithResult(r2)
            o.writeRaw r6 = r6.IAuthTabCallback(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda7 r0 = new viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda7
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda6 r2 = new viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda6
            r2.<init>()
            r0.<init>()
            o.writeRaw r6 = r6.onExtraCallback(r0)
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda8 r0 = new viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda8
            r0.<init>()
            o.writeRaw r6 = r6.onWarmupCompleted(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda9 r0 = new viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda9
            r0.<init>()
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda10 r1 = new viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda10
            r1.<init>()
            o.deserializeUriNullableCollection r6 = o.setMessageBytes.onExtraCallbackWithResult(r6, r0, r1)
            r5.autoDisposable(r6)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment.onExtraCallback(boolean):void");
    }

    @Override // viva.republica.toss.common.ArsVerificationFragment.onExtraCallback
    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1385612L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return CardIssueArsVerifyFragment.onExtraCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = asBinder + 125;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallbackDefault(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", cardIssueArsVerifyFragment.extraCallback().IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("funnel_id", cardIssueArsVerifyFragment.extraCallback().getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("session_id", cardIssueArsVerifyFragment.extraCallback().ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("screen_type", cardIssueArsVerifyFragment.readTypedObject().onExtraCallback());
        Object[] objArr = new Object[1];
        a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4, 5 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{65532, 7, 65535, 65528, 7}, false, TextUtils.indexOf("", "", 0, 0) + 202, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), cardIssueArsVerifyFragment.getString(R.string.ars_help_not_received_call_button_text));
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 83;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // viva.republica.toss.common.ArsVerificationFragment.onExtraCallback
    public void onWarmupCompleted() {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1385612L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CardIssueArsVerifyFragment.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = asBinder + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onNavigationEvent(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", cardIssueArsVerifyFragment.extraCallback().IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("funnel_id", cardIssueArsVerifyFragment.extraCallback().getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("session_id", cardIssueArsVerifyFragment.extraCallback().ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("screen_type", cardIssueArsVerifyFragment.readTypedObject().onExtraCallback());
        Object[] objArr = new Object[1];
        a(4 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 5 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{65532, 7, 65535, 65528, 7}, false, 202 - TextUtils.getOffsetAfter("", 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), cardIssueArsVerifyFragment.getString(R.string.ars_help_sound_disabled_button_text));
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 51;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // viva.republica.toss.common.ArsVerificationFragment.onExtraCallback
    public void IAuthTabCallbackStub() {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1385612L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return CardIssueArsVerifyFragment.IAuthTabCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = asInterface + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getDigestAlgorithms<getCertificationRequestInfo> getdigestalgorithmsWriteTypedObject = writeTypedObject();
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(this);
        CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = extraCallback();
        String str2 = this.onExtraCallbackWithResult;
        if (str2 == null) {
            int i4 = asBinder + 27;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 30 / 0;
            }
            str2 = "";
        }
        getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnNavigationEvent, cardIssueOverviewViewModelExtraCallback, new equalsMethodParams(str2, this.onNavigationEvent), (String) null, str, (Map) null, 40, (Object) null);
        int i6 = asInterface + 113;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, Throwable th) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, 1429801690, iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1429801686, new Object[]{cardIssueArsVerifyFragment, th});
    }

    public static /* synthetic */ Unit onNavigationEvent(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, BaseApiResponse baseApiResponse) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, 595753373, iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -595753370, new Object[]{cardIssueArsVerifyFragment, baseApiResponse});
    }

    private final void asBinder() throws Throwable {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1624660039, iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1624660039, new Object[]{this});
    }

    private static final Unit asBinder(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, 285295502, iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -285295497, new Object[]{cardIssueArsVerifyFragment, setDetectableSize});
    }

    private static final Unit onWarmupCompleted(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, BaseApiResponse baseApiResponse) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, 1904524064, iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1904524062, new Object[]{cardIssueArsVerifyFragment, baseApiResponse});
    }

    private static final Unit onWarmupCompleted(CardIssueArsVerifyFragment cardIssueArsVerifyFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, 1844495753, iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1844495752, new Object[]{cardIssueArsVerifyFragment, deserializeurinullablecollection});
    }
}
