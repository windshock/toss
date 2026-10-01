package viva.republica.toss.cardrecommend.issuev2.ui.id.manual;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import im.toss.base.BaseFragment;
import im.toss.core.workerservice.WorkerService$Companion$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.ocr.models.driver.DriversLicenseAreaDialog;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.uikit.widget.KeyboardBottomCta;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.AccessDescription;
import o.AdvertisingId;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.IDEACBCPar;
import o.M_;
import o.PageContext;
import o.PlayerErrorCode;
import o.PullRefreshIndicatorKtExternalSyntheticLambda3;
import o.RippleNode;
import o.RotationProvider1;
import o.SearchBarKtExternalSyntheticLambda5;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.TypographyKtExternalSyntheticLambda0;
import o.UTIL_WriteFile;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15300;
import o.access15400;
import o.access8100;
import o.addAllCommandLine;
import o.findResAndMsg;
import o.getAdService;
import o.getAllocateLengthExp;
import o.getDataGroupHashValue;
import o.getDigestAlgorithms;
import o.getMinWebSocketMessageToCompressokhttp;
import o.getParamImp;
import o.getPolicies;
import o.getSalt;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.initMiniApp;
import o.maybeUpdateAnimatable;
import o.mergeParams;
import o.onRenderReady;
import o.preFillDefault;
import o.readIntokhttp;
import o.setBodyokhttp;
import o.setPositionProvider;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment;
import viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueDriverLicenseFragment;
import viva.republica.toss.network.model.cardsales.funnel.formvalue.IdVerificationFormValue;
import viva.republica.toss.network.model.cardsales.verify.VerifyIdCardDetail;
import viva.republica.toss.network.model.cardsales.verify.VerifyIdCardResponse;

@EmbeddingAdapterExternalSyntheticLambda1
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CreditCardIssueDriverLicenseFragment extends CardIssueBaseFragment<getSalt> {
    public static final onExtraCallbackWithResult Companion;
    private static long IAuthTabCallbackDefault;
    private static int IAuthTabCallback_Parcel;
    private static char access000;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback;
    public static final int onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static int onTransact;
    private static final String onWarmupCompleted;
    private final PageContext IAuthTabCallback;
    private onExtraCallback IAuthTabCallbackStub;
    private String asBinder;
    private getAllocateLengthExp asInterface;
    private static final byte[] $$a = {ISO7816.INS_DECREASE_STAMPED, -58, ISOFileInfo.AB, 74};
    private static final int $$b = 73;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 1;
    private static int access100 = 0;
    private static int IAuthTabCallbackStubProxy = 1;

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[onExtraCallback.values().length];
            try {
                iArr[onExtraCallback.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onExtraCallback.OLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallback = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        byte[] bArr = $$a;
        int i3 = b + 109;
        int i4 = i * 2;
        int i5 = 4 - (b2 * 3);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            int i8 = i4;
            i3 = (-i3) + i8;
            i5 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            int i9 = bArr[i5];
            int i10 = i5;
            i8 = i3;
            i3 = i9;
            i7 = i2 + 1;
            i6 = i10;
            i3 = (-i3) + i8;
            i5 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    static {
        IAuthTabCallback_Parcel = 0;
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a((char) (6599 - MotionEvent.axisFromString(BuildConfig.FLAVOR)), KeyEvent.normalizeMetaState(0) + 32023702, new char[]{17898, 42113, 38525, 5954, 21828, 6795, 46748, 13583, 57929, 54689, 9622, 6677, 16078, 37075, 64392, 40374, 2550, 60642, 22718, 34865, 6262, 65072, 11984, 34869, 45382, 42224, 46412, 10090, 27486, 13349, 5004, 6346, 2472, 45870, 26728, 9368, 20205, 58099, 18953, 7993, 15429, 61047, 59477}, new char[]{36206, 14016, 28245, 28273}, new char[]{38527, 59556, 51201, 19225}, objArr);
        onWarmupCompleted = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((char) (View.resolveSize(0, 0) + 49391), (-310652152) - Process.getGidForName(BuildConfig.FLAVOR), new char[]{23492, 17790, 62178, 14906, 13654, 8702, 30512, 36990, 30064, 58338, 41840, 32478, 5271, 29539, 39314, 59610, 51773, 51990, 24399, 51581, 43673, 62863, 64606, 13036, 24549, 14640, 11523, 32184, 1304, 63893, 56481, 36471, 25291, 57882, 7495, 49642, 34011, 5079, 55063, 28386, 64534, 38826, 12429, 56438, 12472, 39983, 17157, 41699, 21796, 34261, 19941, 38017, 58345, 37804, 40419, 57660, 40745}, new char[]{36206, 14016, 28245, 28273}, new char[]{2476, 31699, 61421, 29632}, objArr2);
        onNavigationEvent = ((String) objArr2[0]).intern();
        onExtraCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(CreditCardIssueDriverLicenseFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCreditCardIssueDriverLicenseBinding;", 0)};
        Companion = new onExtraCallbackWithResult(null);
        onExtraCallbackWithResult = 8;
        int i = getInterfaceDescriptor + 5;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment, View view) {
        int i = 2 % 2;
        int i2 = access100 + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(creditCardIssueDriverLicenseFragment, view);
        int i4 = IAuthTabCallbackStubProxy + 77;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment, getAllocateLengthExp getallocatelengthexp) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 17;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(creditCardIssueDriverLicenseFragment, getallocatelengthexp);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(creditCardIssueDriverLicenseFragment, getallocatelengthexp);
        int i3 = IAuthTabCallbackStubProxy + 101;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment, View view) {
        int i = 2 % 2;
        int i2 = access100 + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        asInterface(creditCardIssueDriverLicenseFragment, view);
        int i4 = access100 + 1;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws Throwable {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~(i5 | i3);
        int i11 = i9 | i10;
        int i12 = i9 | (~(i6 | i3)) | i10;
        int i13 = (~(i3 | i6 | i5)) | (~(i8 | (~i5)));
        int i14 = i6 + i5 + i4 + ((-2005657349) * i2) + (1476006321 * i);
        int i15 = i14 * i14;
        int i16 = ((583353605 * i6) - 1319501824) + (407026429 * i5) + ((-176327176) * i11) + (i12 * (-2059320060)) + ((-2059320060) * i13) + ((-1652293632) * i4) + ((-798228480) * i2) + ((-1404829696) * i) + ((-1043726336) * i15);
        int i17 = (i6 * 961754349) + 784684277 + (i5 * 961754277) + (i11 * (-72)) + (i12 * 36) + (i13 * 36) + (i4 * 961754313) + (i2 * (-1264871149)) + (i * 72538105) + (i15 * 798621696);
        int i18 = i16 + (i17 * i17 * (-1437204480));
        if (i18 != 1) {
            return i18 != 2 ? i18 != 3 ? i18 != 4 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
        }
        CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment = (CreditCardIssueDriverLicenseFragment) objArr[0];
        onExtraCallback onextracallback = (onExtraCallback) objArr[1];
        int i19 = 2 % 2;
        int i20 = access100 + 39;
        IAuthTabCallbackStubProxy = i20 % 128;
        int i21 = i20 % 2;
        int i22 = onWarmupCompleted.onExtraCallback[onextracallback.ordinal()];
        if (i22 == 1) {
            TdsImageView tdsImageView = (TdsImageView) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 839229413, -839229409, new Object[]{creditCardIssueDriverLicenseFragment});
            Object[] objArr2 = new Object[1];
            a((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49390), (-310652152) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), new char[]{23492, 17790, 62178, 14906, 13654, 8702, 30512, 36990, 30064, 58338, 41840, 32478, 5271, 29539, 39314, 59610, 51773, 51990, 24399, 51581, 43673, 62863, 64606, 13036, 24549, 14640, 11523, 32184, 1304, 63893, 56481, 36471, 25291, 57882, 7495, 49642, 34011, 5079, 55063, 28386, 64534, 38826, 12429, 56438, 12472, 39983, 17157, 41699, 21796, 34261, 19941, 38017, 58345, 37804, 40419, 57660, 40745}, new char[]{36206, 14016, 28245, 28273}, new char[]{2476, 31699, 61421, 29632}, objArr2);
            TdsImageView.setImage$default(tdsImageView, ((String) objArr2[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
            creditCardIssueDriverLicenseFragment.onNavigationEvent().setText(creditCardIssueDriverLicenseFragment.getString(R.string.app_cardrecommend_driver_license_help_no_area_number));
        } else {
            if (i22 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            TdsImageView tdsImageView2 = (TdsImageView) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 839229413, -839229409, new Object[]{creditCardIssueDriverLicenseFragment});
            Object[] objArr3 = new Object[1];
            a((char) ((ViewConfiguration.getTapTimeout() >> 16) + 6600), 32023703 + (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{17898, 42113, 38525, 5954, 21828, 6795, 46748, 13583, 57929, 54689, 9622, 6677, 16078, 37075, 64392, 40374, 2550, 60642, 22718, 34865, 6262, 65072, 11984, 34869, 45382, 42224, 46412, 10090, 27486, 13349, 5004, 6346, 2472, 45870, 26728, 9368, 20205, 58099, 18953, 7993, 15429, 61047, 59477}, new char[]{36206, 14016, 28245, 28273}, new char[]{38527, 59556, 51201, 19225}, objArr3);
            TdsImageView.setImage$default(tdsImageView2, ((String) objArr3[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
            creditCardIssueDriverLicenseFragment.onNavigationEvent().setText(creditCardIssueDriverLicenseFragment.getString(R.string.app_credit_card_issue_driver_license_no_area_number));
            int i23 = access100 + 101;
            IAuthTabCallbackStubProxy = i23 % 128;
            if (i23 % 2 == 0) {
                int i24 = 3 / 3;
            }
        }
        creditCardIssueDriverLicenseFragment.IAuthTabCallbackStub = onextracallback;
        creditCardIssueDriverLicenseFragment.onExtraCallback(creditCardIssueDriverLicenseFragment.asInterface);
        creditCardIssueDriverLicenseFragment.onTrackView();
        return null;
    }

    public static /* synthetic */ void onWarmupCompleted(CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(creditCardIssueDriverLicenseFragment, view);
        int i4 = IAuthTabCallbackStubProxy + 87;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onWarmupCompleted(CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment, TextView textView, int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = access100 + 119;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(creditCardIssueDriverLicenseFragment, textView, i, keyEvent);
        int i5 = access100 + 17;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }

    public boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 95;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 111;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onNavigationEvent(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final /* synthetic */ TextInputEditText IAuthTabCallback(CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment) {
        int i = 2 % 2;
        int i2 = access100 + 9;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextInputEditText textInputEditTextOnTransact = creditCardIssueDriverLicenseFragment.onTransact();
        int i4 = access100 + 69;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return textInputEditTextOnTransact;
    }

    public static final /* synthetic */ String IAuthTabCallback(CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = access100 + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = creditCardIssueDriverLicenseFragment.IAuthTabCallback(charSequence);
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return strIAuthTabCallback;
    }

    public static final /* synthetic */ void onNavigationEvent(CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment) {
        int i = 2 % 2;
        int i2 = access100 + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        creditCardIssueDriverLicenseFragment.IAuthTabCallback_Parcel();
        if (i3 == 0) {
            throw null;
        }
    }

    public CreditCardIssueDriverLicenseFragment() {
        super(R.layout.fragment_credit_card_issue_driver_license);
        this.IAuthTabCallback = preFillDefault.onExtraCallbackWithResult(this, IAuthTabCallbackStub.onNavigationEvent);
        this.IAuthTabCallbackStub = onExtraCallback.NEW;
        this.asBinder = BuildConfig.FLAVOR;
    }

    static final /* synthetic */ class IAuthTabCallbackStub extends FunctionReferenceImpl implements Function1<View, UTIL_WriteFile> {
        public static final IAuthTabCallbackStub onNavigationEvent = new IAuthTabCallbackStub();

        IAuthTabCallbackStub() {
            super(1, UTIL_WriteFile.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCreditCardIssueDriverLicenseBinding;", 0);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final UTIL_WriteFile invoke(View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            return UTIL_WriteFile.onExtraCallback(view);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment = (CreditCardIssueDriverLicenseFragment) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = i2 % 2 == 0 ? creditCardIssueDriverLicenseFragment.IAuthTabCallback.onExtraCallbackWithResult(creditCardIssueDriverLicenseFragment, onExtraCallback[0]) : creditCardIssueDriverLicenseFragment.IAuthTabCallback.onExtraCallbackWithResult(creditCardIssueDriverLicenseFragment, onExtraCallback[0]);
        Intrinsics.checkNotNullExpressionValue(searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult, BuildConfig.FLAVOR);
        return (UTIL_WriteFile) searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment = (CreditCardIssueDriverLicenseFragment) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {creditCardIssueDriverLicenseFragment};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback4 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        if (i3 == 0) {
            Intrinsics.checkNotNullExpressionValue(((UTIL_WriteFile) onWarmupCompleted(iIAuthTabCallback4, iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, -1305147039, 1305147039, objArr2)).asBinder, BuildConfig.FLAVOR);
            obj.hashCode();
            throw null;
        }
        TdsTopV2View tdsTopV2View = ((UTIL_WriteFile) onWarmupCompleted(iIAuthTabCallback4, iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, -1305147039, 1305147039, objArr2)).asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsTopV2View, BuildConfig.FLAVOR);
        int i4 = IAuthTabCallbackStubProxy + 111;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return tdsTopV2View;
        }
        throw null;
    }

    private final BaseTextView onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        Typography3 typography3 = ((UTIL_WriteFile) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, -1305147039, 1305147039, new Object[]{this})).onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(typography3, BuildConfig.FLAVOR);
        int i4 = access100 + 25;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return typography3;
    }

    private final TextInputEditText onTransact() {
        int i = 2 % 2;
        int i2 = access100 + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback4 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        if (i3 == 0) {
            Intrinsics.checkNotNullExpressionValue(((UTIL_WriteFile) onWarmupCompleted(iIAuthTabCallback4, iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, -1305147039, 1305147039, objArr)).onTransact, BuildConfig.FLAVOR);
            throw null;
        }
        TextInputEditText textInputEditText = ((UTIL_WriteFile) onWarmupCompleted(iIAuthTabCallback4, iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, -1305147039, 1305147039, objArr)).onTransact;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, BuildConfig.FLAVOR);
        return textInputEditText;
    }

    private final TdsTextButtonV0View onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        TdsTextButtonV0View tdsTextButtonV0View = ((UTIL_WriteFile) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, -1305147039, 1305147039, new Object[]{this})).IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsTextButtonV0View, BuildConfig.FLAVOR);
        int i4 = IAuthTabCallbackStubProxy + 49;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return tdsTextButtonV0View;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        KeyboardBottomCta keyboardBottomCta;
        CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment = (CreditCardIssueDriverLicenseFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {creditCardIssueDriverLicenseFragment};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback4 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        if (i3 != 0) {
            keyboardBottomCta = ((UTIL_WriteFile) onWarmupCompleted(iIAuthTabCallback4, iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, -1305147039, 1305147039, objArr2)).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, BuildConfig.FLAVOR);
            int i4 = 40 / 0;
        } else {
            keyboardBottomCta = ((UTIL_WriteFile) onWarmupCompleted(iIAuthTabCallback4, iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, -1305147039, 1305147039, objArr2)).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, BuildConfig.FLAVOR);
        }
        int i5 = access100 + 119;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return keyboardBottomCta;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment = (CreditCardIssueDriverLicenseFragment) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 41;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        TdsImageView tdsImageView = ((UTIL_WriteFile) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, -1305147039, 1305147039, new Object[]{creditCardIssueDriverLicenseFragment})).onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, BuildConfig.FLAVOR);
        int i4 = access100 + 79;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return tdsImageView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        public static final onExtraCallback OLD = new onExtraCallback("OLD", 0);
        public static final onExtraCallback NEW = new onExtraCallback("NEW", 1);

        private static final /* synthetic */ onExtraCallback[] $values() {
            return new onExtraCallback[]{OLD, NEW};
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            return $ENTRIES;
        }

        public static onExtraCallback valueOf(String str) {
            return (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
        }

        public static onExtraCallback[] values() {
            return (onExtraCallback[]) $VALUES.clone();
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
        }
    }

    public static final class asInterface implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public asInterface() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            CreditCardIssueDriverLicenseFragment.onNavigationEvent(CreditCardIssueDriverLicenseFragment.this);
        }
    }

    public static final class onTransact implements TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public onTransact() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String strIAuthTabCallback = CreditCardIssueDriverLicenseFragment.IAuthTabCallback(CreditCardIssueDriverLicenseFragment.this, charSequence);
            if (Intrinsics.areEqual(String.valueOf(charSequence), strIAuthTabCallback)) {
                return;
            }
            CreditCardIssueDriverLicenseFragment.IAuthTabCallback(CreditCardIssueDriverLicenseFragment.this).setText(strIAuthTabCallback);
            CreditCardIssueDriverLicenseFragment.IAuthTabCallback(CreditCardIssueDriverLicenseFragment.this).setSelection(strIAuthTabCallback.length());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[PHI: r2
      0x0036: PHI (r2v6 int) = (r2v5 int), (r2v13 int) binds: [B:10:0x0034, B:7:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(getAllocateLengthExp getallocatelengthexp) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = access100 + 103;
        int i4 = i3 % 128;
        IAuthTabCallbackStubProxy = i4;
        int i5 = i3 % 2;
        this.asInterface = getallocatelengthexp;
        if (getallocatelengthexp != null) {
            int i6 = i4 + 29;
            access100 = i6 % 128;
            if (i6 % 2 != 0) {
                i = onWarmupCompleted.onExtraCallback[this.IAuthTabCallbackStub.ordinal()];
                if (i != 0) {
                    int i7 = access100 + 65;
                    IAuthTabCallbackStubProxy = i7 % 128;
                    int i8 = i7 % 2;
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    BaseTextView baseTextViewOnExtraCallbackWithResult = onExtraCallbackWithResult();
                    baseTextViewOnExtraCallbackWithResult.setSelected(false);
                    baseTextViewOnExtraCallbackWithResult.setText(getallocatelengthexp.getValue());
                    baseTextViewOnExtraCallbackWithResult.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    Context context = baseTextViewOnExtraCallbackWithResult.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
                    Configuration configuration = context.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration, BuildConfig.FLAVOR);
                    baseTextViewOnExtraCallbackWithResult.setTextColor(new getUrlokhttp(new onNavigationEvent(configuration)).onUnminimized());
                } else {
                    BaseTextView baseTextViewOnExtraCallbackWithResult2 = onExtraCallbackWithResult();
                    baseTextViewOnExtraCallbackWithResult2.setSelected(false);
                    baseTextViewOnExtraCallbackWithResult2.setText(getallocatelengthexp.getValue());
                    baseTextViewOnExtraCallbackWithResult2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    Context context2 = baseTextViewOnExtraCallbackWithResult2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, BuildConfig.FLAVOR);
                    Configuration configuration2 = context2.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration2, BuildConfig.FLAVOR);
                    baseTextViewOnExtraCallbackWithResult2.setTextColor(new getUrlokhttp(new IAuthTabCallback(configuration2)).onUnminimized());
                }
            } else {
                i = onWarmupCompleted.onExtraCallback[this.IAuthTabCallbackStub.ordinal()];
                if (i != 1) {
                }
            }
            Editable text = onTransact().getText();
            if (text != null) {
                int i9 = access100 + 79;
                IAuthTabCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
                if (text.length() == 0) {
                    Object[] objArr = {M_.onExtraCallback, onTransact()};
                    int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                    int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                    M_.onNavigationEvent(1312897292, objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1312897289, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
                }
            }
        }
        IAuthTabCallback_Parcel();
    }

    private static final void onNavigationEvent(CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment, View view) {
        int i = 2 % 2;
        int i2 = access100 + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        creditCardIssueDriverLicenseFragment.IAuthTabCallbackDefault();
        int i4 = IAuthTabCallbackStubProxy + 1;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean onExtraCallbackWithResult(CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment, TextView textView, int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy;
        int i4 = i3 + 125;
        access100 = i4 % 128;
        if (i4 % 2 == 0 ? i == 6 : i == 96) {
            creditCardIssueDriverLicenseFragment.onExtraCallbackWithResult("keyboard_done");
            return true;
        }
        int i5 = i3 + 123;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i5 = $10 + 95;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $10 + 107;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iRed = Color.red(0) + 43;
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1451;
                    byte b = (byte) ($$b & 7);
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(doubleTapTimeout, iRed, iCombineMeasuredStates, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 49123), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 45, (ViewConfiguration.getTapTimeout() >> 16) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 23972), Color.rgb(0, 0, 0) + 16777266, Color.alpha(0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    i2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45847 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0)), 29 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.resolveSize(0, 0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallbackDefault ^ 7798559133331975163L)) ^ ((int) (onTransact ^ 7798559133331975163L))) ^ ((char) (access000 ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static final void onExtraCallback(CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback onextracallback = creditCardIssueDriverLicenseFragment.IAuthTabCallbackStub;
        onExtraCallback onextracallback2 = onExtraCallback.NEW;
        if (onextracallback == onextracallback2) {
            int i4 = access100 + 31;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                onExtraCallback onextracallback3 = onExtraCallback.OLD;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onextracallback2 = onExtraCallback.OLD;
        }
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, -1922607725, 1922607726, new Object[]{creditCardIssueDriverLicenseFragment, onextracallback2});
        int i5 = access100 + 67;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void asInterface(CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment, View view) {
        int i = 2 % 2;
        int i2 = access100 + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        creditCardIssueDriverLicenseFragment.onExtraCallbackWithResult(((KeyboardBottomCta) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, 1359281104, -1359281101, new Object[]{creditCardIssueDriverLicenseFragment})).onWarmupCompleted().getText().toString());
        int i4 = access100 + 41;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        super.onViewCreated(view, bundle);
        asInterface();
        onExtraCallbackWithResult().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueDriverLicenseFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CreditCardIssueDriverLicenseFragment.IAuthTabCallback(this.f$0, view2);
            }
        });
        onTransact().setEmojiCompatEnabled(false);
        onTransact().addTextChangedListener(new onTransact());
        onTransact().addTextChangedListener(new asInterface());
        onTransact().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueDriverLicenseFragment$$ExternalSyntheticLambda2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return CreditCardIssueDriverLicenseFragment.onWarmupCompleted(this.f$0, textView, i2, keyEvent);
            }
        });
        Object[] objArr = {this, onExtraCallback.NEW};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -1922607725, 1922607726, objArr);
        onNavigationEvent().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueDriverLicenseFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Throwable {
                CreditCardIssueDriverLicenseFragment.onWarmupCompleted(this.f$0, view2);
            }
        });
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback4 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback5 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        ((KeyboardBottomCta) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback5, iIAuthTabCallback3, iIAuthTabCallback4, 1359281104, -1359281101, new Object[]{this})).onNavigationEvent().setVisibility(8);
        int iIAuthTabCallback6 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback7 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback8 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        ((KeyboardBottomCta) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback8, iIAuthTabCallback6, iIAuthTabCallback7, 1359281104, -1359281101, new Object[]{this})).onWarmupCompleted().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueDriverLicenseFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CreditCardIssueDriverLicenseFragment.onExtraCallbackWithResult(this.f$0, view2);
            }
        });
        IAuthTabCallback_Parcel();
        int i2 = access100 + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Unit asInterface() {
        int i = 2 % 2;
        int i2 = access100 + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        TdsTopV2View tdsTopV2View = (TdsTopV2View) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -1592217961, 1592217963, new Object[]{this});
        tdsTopV2View.setLowerGap(0);
        tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel = tdsTopV2View.IAuthTabCallback_Parcel();
        if (getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel != null) {
            int i4 = IAuthTabCallbackStubProxy + 107;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel.onNavigationEvent(Integer.valueOf(setBodyokhttp.onExtraCallback(this).onUnminimized()));
                getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel.onNavigationEvent(requireContext().getString(R.string.input_drivers_license_info));
                int i5 = 59 / 0;
            } else {
                getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel.onNavigationEvent(Integer.valueOf(setBodyokhttp.onExtraCallback(this).onUnminimized()));
                getminwebsocketmessagetocompressokhttpIAuthTabCallback_Parcel.onNavigationEvent(requireContext().getString(R.string.input_drivers_license_info));
            }
        }
        Object[] objArr = {readTypedObject().onExtraCallbackWithResult()};
        String str = (String) AdvertisingId.onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -359673906, objArr, 359673907);
        if (str == null) {
            return null;
        }
        tdsTopV2View.setSubtitle2Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
        tdsTopV2View.setSubtitle2TextSize(TdsTopV2View.onWarmupCompleted.SIZE_15);
        getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpOnTransact = tdsTopV2View.onTransact();
        if (getminwebsocketmessagetocompressokhttpOnTransact == null) {
            return null;
        }
        getUrlokhttp geturlokhttpOnExtraCallback = setBodyokhttp.onExtraCallback(this);
        getminwebsocketmessagetocompressokhttpOnTransact.onNavigationEvent(Integer.valueOf(geturlokhttpOnExtraCallback.ITrustedWebActivityCallbackDefault() == getSpecialFeatureOptInStatus.Dark ? geturlokhttpOnExtraCallback.getInterfaceDescriptor().ICustomTabsCallbackStubProxy() : geturlokhttpOnExtraCallback.requestPostMessageChannel().onMinimized()));
        getminwebsocketmessagetocompressokhttpOnTransact.onNavigationEvent(str);
        return Unit.INSTANCE;
    }

    private final String IAuthTabCallback(CharSequence charSequence) {
        String strOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (charSequence == null || (strOnNavigationEvent = mergeParams.onNavigationEvent(charSequence)) == null) {
            int i3 = access100 + 117;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            strOnNavigationEvent = BuildConfig.FLAVOR;
        }
        this.asBinder = strOnNavigationEvent;
        if (strOnNavigationEvent.length() <= 2) {
            return this.asBinder;
        }
        StringBuilder sb = new StringBuilder(this.asBinder);
        sb.insert(2, "-");
        if (this.asBinder.length() > 8) {
            int i5 = access100 + 65;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            sb.insert(9, "-");
        }
        String string = sb.toString();
        Intrinsics.checkNotNull(string);
        return string;
    }

    private final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, BuildConfig.FLAVOR);
        new DriversLicenseAreaDialog(contextRequireContext, (DriversLicenseAreaDialog.onWarmupCompleted) null, false, false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueDriverLicenseFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CreditCardIssueDriverLicenseFragment.onExtraCallback(this.f$0, (getAllocateLengthExp) obj);
            }
        }, 14, (DefaultConstructorMarker) null).show();
        int i2 = access100 + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onNavigationEvent(CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment, getAllocateLengthExp getallocatelengthexp) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getallocatelengthexp, BuildConfig.FLAVOR);
            creditCardIssueDriverLicenseFragment.onExtraCallback(getallocatelengthexp);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(getallocatelengthexp, BuildConfig.FLAVOR);
        creditCardIssueDriverLicenseFragment.onExtraCallback(getallocatelengthexp);
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 29;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback_Parcel() {
        boolean z;
        String strOnNavigationEvent;
        int i = 2 % 2;
        Editable text = onTransact().getText();
        boolean z2 = false;
        if (text == null || (strOnNavigationEvent = mergeParams.onNavigationEvent(text)) == null || strOnNavigationEvent.length() != 10) {
            z = false;
        } else {
            int i2 = IAuthTabCallbackStubProxy + 21;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        }
        TdsButtonV1View tdsButtonV1ViewOnWarmupCompleted = ((KeyboardBottomCta) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1359281104, -1359281101, new Object[]{this})).onWarmupCompleted();
        if (z) {
            int i4 = IAuthTabCallbackStubProxy + 95;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 40 / 0;
                if (this.asInterface != null) {
                    z2 = true;
                }
            } else if (this.asInterface != null) {
            }
        }
        tdsButtonV1ViewOnWarmupCompleted.setEnabled(z2);
        int i6 = access100 + 63;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ String $areaCode;
        final /* synthetic */ String $buttonText;
        final /* synthetic */ String $licenseNumberExceptArea;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(String str, String str2, String str3, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
            this.$licenseNumberExceptArea = str;
            this.$areaCode = str2;
            this.$buttonText = str3;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CreditCardIssueDriverLicenseFragment.this.new IAuthTabCallbackDefault(this.$licenseNumberExceptArea, this.$areaCode, this.$buttonText, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x017c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            final Throwable th;
            int i;
            Object objOnNavigationEvent;
            IAuthTabCallbackDefault iAuthTabCallbackDefault;
            int i2;
            CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment;
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
                BaseFragment.showProgressDialog$default(CreditCardIssueDriverLicenseFragment.this, (String) null, false, 3, (Object) null);
                CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment2 = CreditCardIssueDriverLicenseFragment.this;
                String str = this.$licenseNumberExceptArea;
                String str2 = this.$areaCode;
                Result.Companion companion3 = Result.Companion;
                AccessDescription accessDescriptionIAuthTabCallback_Parcel = creditCardIssueDriverLicenseFragment2.extraCallback().IAuthTabCallback_Parcel();
                String strOnPostMessage = PlayerErrorCode.onPostMessage();
                String strExtraCallback = PlayerErrorCode.extraCallback();
                this.L$0 = creditCardIssueDriverLicenseFragment2;
                this.L$1 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                objOnNavigationEvent = AccessDescription.onNavigationEvent(accessDescriptionIAuthTabCallback_Parcel, strOnPostMessage, strExtraCallback, str, (String) null, str2, this, 8, (Object) null);
                if (objOnNavigationEvent != objOnWarmupCompleted) {
                    iAuthTabCallbackDefault = this;
                    i2 = 0;
                    creditCardIssueDriverLicenseFragment = creditCardIssueDriverLicenseFragment2;
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
                CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment3 = CreditCardIssueDriverLicenseFragment.this;
                String str3 = this.$licenseNumberExceptArea;
                String str4 = this.$areaCode;
                String str5 = this.$buttonText;
                if (Result.onNavigationEvent(obj2)) {
                    VerifyIdCardResponse verifyIdCardResponse2 = (VerifyIdCardResponse) obj2;
                    if (verifyIdCardResponse2.onExtraCallbackWithResult()) {
                        getDigestAlgorithms getdigestalgorithmsWriteTypedObject = creditCardIssueDriverLicenseFragment3.writeTypedObject();
                        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(creditCardIssueDriverLicenseFragment3);
                        CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = creditCardIssueDriverLicenseFragment3.extraCallback();
                        IdVerificationFormValue.IdType idType = IdVerificationFormValue.IdType.DRIVER;
                        getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnNavigationEvent, cardIssueOverviewViewModelExtraCallback, new IdVerificationFormValue(idType, str3, str4, (String) null, (String) null, false, (String) null, 88, (DefaultConstructorMarker) null), (String) null, str5, access8100.onNavigationEvent(getWrite.IAuthTabCallback("id_type", idType.getLogName())), 8, (Object) null);
                    } else {
                        getDigestAlgorithms getdigestalgorithmsWriteTypedObject2 = creditCardIssueDriverLicenseFragment3.writeTypedObject();
                        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent2 = RippleNode.onNavigationEvent(creditCardIssueDriverLicenseFragment3);
                        CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback2 = creditCardIssueDriverLicenseFragment3.extraCallback();
                        IdVerificationFormValue.IdType idType2 = IdVerificationFormValue.IdType.DRIVER;
                        VerifyIdCardDetail verifyIdCardDetailOnExtraCallback = verifyIdCardResponse2.onExtraCallback();
                        getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject2, typographyKtExternalSyntheticLambda0OnNavigationEvent2, cardIssueOverviewViewModelExtraCallback2, new IdVerificationFormValue(idType2, str3, str4, (String) null, (String) null, true, verifyIdCardDetailOnExtraCallback != null ? verifyIdCardDetailOnExtraCallback.onWarmupCompleted() : null, 24, (DefaultConstructorMarker) null), (String) null, str5, access8100.onNavigationEvent(getWrite.IAuthTabCallback("id_type", idType2.getLogName())), 8, (Object) null);
                    }
                }
                final CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment4 = CreditCardIssueDriverLicenseFragment.this;
                th = Result.exceptionOrNull-impl(obj2);
                if (th != null) {
                    if (th instanceof getDataGroupHashValue) {
                        Context context = creditCardIssueDriverLicenseFragment4.getContext();
                        if (context != null) {
                            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueDriverLicenseFragment$onDone$1$$ExternalSyntheticLambda0
                                public final Object invoke(Object obj3) {
                                    return CreditCardIssueDriverLicenseFragment.IAuthTabCallbackDefault.onWarmupCompleted(creditCardIssueDriverLicenseFragment4, (CommonModule_setLeftEdgeTouchEnabled) obj3);
                                }
                            });
                        }
                    } else if (th instanceof AccessDescription.IAuthTabCallback) {
                        Context context2 = creditCardIssueDriverLicenseFragment4.getContext();
                        if (context2 != null) {
                            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context2, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueDriverLicenseFragment$onDone$1$$ExternalSyntheticLambda1
                                public final Object invoke(Object obj3) {
                                    return CreditCardIssueDriverLicenseFragment.IAuthTabCallbackDefault.onWarmupCompleted(th, (CommonModule_setLeftEdgeTouchEnabled) obj3);
                                }
                            });
                        }
                    } else if (th instanceof AccessDescription.onNavigationEvent) {
                        Context context3 = creditCardIssueDriverLicenseFragment4.getContext();
                        if (context3 != null) {
                            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context3, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueDriverLicenseFragment$onDone$1$$ExternalSyntheticLambda2
                                public final Object invoke(Object obj3) {
                                    return CreditCardIssueDriverLicenseFragment.IAuthTabCallbackDefault.onExtraCallback(creditCardIssueDriverLicenseFragment4, (CommonModule_setLeftEdgeTouchEnabled) obj3);
                                }
                            });
                        }
                    } else if (th instanceof AccessDescription.onExtraCallbackWithResult) {
                        Context context4 = creditCardIssueDriverLicenseFragment4.getContext();
                        if (context4 != null) {
                            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context4, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueDriverLicenseFragment$onDone$1$$ExternalSyntheticLambda3
                                public final Object invoke(Object obj3) {
                                    return CreditCardIssueDriverLicenseFragment.IAuthTabCallbackDefault.asBinder(creditCardIssueDriverLicenseFragment4, (CommonModule_setLeftEdgeTouchEnabled) obj3);
                                }
                            });
                        }
                    } else {
                        getParamImp.onWarmupCompleted(th, creditCardIssueDriverLicenseFragment4.getContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
                    }
                }
                CreditCardIssueDriverLicenseFragment.this.dismissProgressDialog();
                return Unit.INSTANCE;
            }
            int i4 = this.I$1;
            i2 = this.I$0;
            iAuthTabCallbackDefault = (access13800) this.L$1;
            creditCardIssueDriverLicenseFragment = (CreditCardIssueDriverLicenseFragment) this.L$0;
            ResultKt.onNavigationEvent(obj);
            i = i4;
            objOnNavigationEvent = obj;
            VerifyIdCardResponse verifyIdCardResponse3 = (VerifyIdCardResponse) objOnNavigationEvent;
            if (verifyIdCardResponse3.onExtraCallbackWithResult()) {
                creditCardIssueDriverLicenseFragment.extraCallback().IAuthTabCallback();
            } else {
                CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback3 = creditCardIssueDriverLicenseFragment.extraCallback();
                boolean z = creditCardIssueDriverLicenseFragment.requireArguments().getBoolean("pendingOcrImageRequired");
                this.L$0 = access15400.onNavigationEvent(iAuthTabCallbackDefault);
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
            CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment32 = CreditCardIssueDriverLicenseFragment.this;
            String str32 = this.$licenseNumberExceptArea;
            String str42 = this.$areaCode;
            String str52 = this.$buttonText;
            if (Result.onNavigationEvent(obj2)) {
            }
            final CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment42 = CreditCardIssueDriverLicenseFragment.this;
            th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
            }
            CreditCardIssueDriverLicenseFragment.this.dismissProgressDialog();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onWarmupCompleted(CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(creditCardIssueDriverLicenseFragment.getString(R.string.app_card_issue_ocr_verify_default_error_message));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onWarmupCompleted(Throwable th, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(th.getMessage());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onExtraCallback(CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(creditCardIssueDriverLicenseFragment.getString(R.string.app_card_issue_ocr_verify_default_error_message));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit asBinder(CreditCardIssueDriverLicenseFragment creditCardIssueDriverLicenseFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(creditCardIssueDriverLicenseFragment.getString(R.string.app_card_issue_ocr_verify_default_error_message_for_test));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(String str) {
        String str2;
        String strOnNavigationEvent;
        int i = 2 % 2;
        if (((KeyboardBottomCta) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1359281104, -1359281101, new Object[]{this})).onWarmupCompleted().isEnabled()) {
            hideSoftKeyboard();
            getAllocateLengthExp getallocatelengthexp = this.asInterface;
            if (getallocatelengthexp != null) {
                int i2 = IAuthTabCallbackStubProxy + 99;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                String value = getallocatelengthexp.getValue();
                if (value == null) {
                    int i4 = IAuthTabCallbackStubProxy + 105;
                    access100 = i4 % 128;
                    int i5 = i4 % 2;
                    str2 = BuildConfig.FLAVOR;
                } else {
                    str2 = value;
                }
            }
            Editable text = onTransact().getText();
            String str3 = (text == null || (strOnNavigationEvent = mergeParams.onNavigationEvent(text)) == null) ? BuildConfig.FLAVOR : strOnNavigationEvent;
            requireArguments().putAll(RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback("licenseNo", str3), getWrite.IAuthTabCallback("licenseIssuer", str2)}));
            if (readTypedObject().onWarmupCompleted()) {
                int i6 = access100 + 65;
                IAuthTabCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
                IDEACBCPar.onExtraCallback(RippleNode.onNavigationEvent(this), R.id.serialNumberAction, requireArguments(), (setPositionProvider) null, (PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback) null, 12, (Object) null);
                return;
            }
            if (extraCallback().writeTypedObject()) {
                maybeUpdateAnimatable.onNavigationEvent(onRenderReady.onExtraCallback(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(str3, str2, str, null), 3, (Object) null);
                return;
            }
            extraCallback().IAuthTabCallback();
            getDigestAlgorithms getdigestalgorithmsWriteTypedObject = writeTypedObject();
            TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(this);
            CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = extraCallback();
            IdVerificationFormValue.IdType idType = IdVerificationFormValue.IdType.DRIVER;
            getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnNavigationEvent, cardIssueOverviewViewModelExtraCallback, new IdVerificationFormValue(idType, str3, str2, (String) null, (String) null, true, "safeDriving", 24, (DefaultConstructorMarker) null), (String) null, str, access8100.onNavigationEvent(getWrite.IAuthTabCallback("id_type", idType.getLogName())), 8, (Object) null);
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private final UTIL_WriteFile onExtraCallback() {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (UTIL_WriteFile) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, -1305147039, 1305147039, new Object[]{this});
    }

    private final KeyboardBottomCta onWarmupCompleted() {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (KeyboardBottomCta) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, 1359281104, -1359281101, new Object[]{this});
    }

    private final TdsImageView asBinder() {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (TdsImageView) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, 839229413, -839229409, new Object[]{this});
    }

    private final TdsTopV2View IAuthTabCallbackStub() {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (TdsTopV2View) onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, -1592217961, 1592217963, new Object[]{this});
    }

    private final void onExtraCallback(onExtraCallback onextracallback) throws Throwable {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, -1922607725, 1922607726, new Object[]{this, onextracallback});
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackDefault = 165333991369598613L;
        onTransact = -1776194565;
        access000 = (char) 27643;
    }
}
