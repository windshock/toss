package viva.republica.toss.cardrecommend.issuev2.ui.id.manual;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Map;
import javax.inject.Inject;
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
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import o.ACPayResult;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BaseRoundCornerProgressBar1;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.ConvertByteArrayToFloatArray;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.EncryptedContentInfoParser;
import o.IDEACBCPar;
import o.JsonReaderUnknownNumberParsing;
import o.M_;
import o.PageContext;
import o.RippleNode;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.TypographyKtExternalSyntheticLambda0;
import o.access13800;
import o.access8100;
import o.addAllCommandLine;
import o.addLibraryPath;
import o.extraCommand;
import o.findResAndMsg;
import o.getDigestAlgorithms;
import o.getIconPaddingLeft;
import o.getParamImp;
import o.getSalt;
import o.getWrite;
import o.initMiniApp;
import o.isLimitAdTracking;
import o.maybeUpdateAnimatable;
import o.onRenderReady;
import o.preFillDefault;
import o.setMessageBytes;
import o.setRandomHost;
import o.zzaz;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$;
import viva.republica.toss.common.web.message.handlers.cardissue.ResidentIdCardScrapedEvent;
import viva.republica.toss.network.model.cardsales.funnel.formvalue.IdVerificationFormValue;

@EmbeddingAdapterExternalSyntheticLambda1
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CreditCardIssueIdFragment extends Hilt_CreditCardIssueIdFragment<getSalt> {
    public static final onExtraCallbackWithResult Companion;
    private static long IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static int getInterfaceDescriptor;
    public static final int onExtraCallback;
    private static final String onExtraCallbackWithResult;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent;
    private static char onTransact;
    private final PageContext IAuthTabCallback;
    private boolean asInterface;
    private ViewTreeObserver.OnGlobalLayoutListener onWarmupCompleted;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {77, -67, -125, 9};
    private static final int $$b = 149;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int asBinder = 0;
    private static int access000 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, byte r8) {
        /*
            int r8 = 110 - r8
            byte[] r0 = viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.$$a
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2b:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.$$c(short, byte, byte):java.lang.String");
    }

    static {
        getInterfaceDescriptor = 0;
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a((char) (21051 - Color.alpha(0)), 1340598908 + (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{54158, 21873, 14872, 6160, 19367, 52020, 64444, 16005, 46127, 568, 34395, 59545, 52166, 6946, 28158, 5286, 28848, 65041, 54121, 41441, 6048, 10426, 40842, 33966, 46372, 11373, 40791, 51933, 44709, 60075, 5741, 27132, 39644, 61594, 46664, 43342, 60303, 17472, 28206, 59424, 42414, 27594, 8609}, new char[]{0, 0, 0, 0}, new char[]{31863, 59370, 15183, 36946}, objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        onNavigationEvent = new addAllCommandLine[]{new PropertyReference1Impl<>(CreditCardIssueIdFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCreditCardIssueIdBinding;", 0)};
        Companion = new onExtraCallbackWithResult(null);
        onExtraCallback = 8;
        int i = IAuthTabCallbackStubProxy + 89;
        getInterfaceDescriptor = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditCardIssueIdFragment creditCardIssueIdFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 121;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(creditCardIssueIdFragment, setDetectableSize);
        int i4 = asBinder + 23;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return unitAsBinder;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        CreditCardIssueIdFragment creditCardIssueIdFragment = (CreditCardIssueIdFragment) objArr[0];
        String str = (String) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = access000 + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditCardIssueIdFragment, str, setDetectableSize);
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        CreditCardIssueIdFragment creditCardIssueIdFragment = (CreditCardIssueIdFragment) objArr[0];
        TextView textView = (TextView) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        KeyEvent keyEvent = (KeyEvent) objArr[3];
        int i = 2 % 2;
        int i2 = access000 + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(creditCardIssueIdFragment, textView, iIntValue, keyEvent);
        int i4 = access000 + 17;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zOnExtraCallback);
    }

    public static /* synthetic */ Unit onExtraCallback(CreditCardIssueIdFragment creditCardIssueIdFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 71;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub(creditCardIssueIdFragment, setDetectableSize);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(creditCardIssueIdFragment, setDetectableSize);
        int i3 = asBinder + 119;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(CreditCardIssueIdFragment creditCardIssueIdFragment, View view) {
        int i = 2 % 2;
        int i2 = access000 + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(creditCardIssueIdFragment, view);
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CreditCardIssueIdFragment creditCardIssueIdFragment = (CreditCardIssueIdFragment) objArr[0];
        Ref.ObjectRef objectRef = (Ref.ObjectRef) objArr[1];
        View view = (View) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int iIntValue3 = ((Number) objArr[5]).intValue();
        int iIntValue4 = ((Number) objArr[6]).intValue();
        int iIntValue5 = ((Number) objArr[7]).intValue();
        int iIntValue6 = ((Number) objArr[8]).intValue();
        int iIntValue7 = ((Number) objArr[9]).intValue();
        int iIntValue8 = ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 61;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        IAuthTabCallback(creditCardIssueIdFragment, objectRef, view, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, iIntValue8);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = asBinder + 81;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditCardIssueIdFragment creditCardIssueIdFragment, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditCardIssueIdFragment, th);
        int i4 = access000 + 83;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditCardIssueIdFragment creditCardIssueIdFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 29;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            asInterface(creditCardIssueIdFragment, setDetectableSize);
            throw null;
        }
        Unit unitAsInterface = asInterface(creditCardIssueIdFragment, setDetectableSize);
        int i3 = asBinder + 45;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditCardIssueIdFragment creditCardIssueIdFragment, ResidentIdCardScrapedEvent residentIdCardScrapedEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(creditCardIssueIdFragment, residentIdCardScrapedEvent);
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        int i5 = access000 + 95;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(ResidentIdCardScrapedEvent residentIdCardScrapedEvent, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = access000 + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(residentIdCardScrapedEvent, commonModule_setLeftEdgeTouchEnabled);
        int i4 = access000 + 109;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onNavigationEvent(CreditCardIssueIdFragment creditCardIssueIdFragment, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onTransact(creditCardIssueIdFragment, view);
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | i2;
        int i10 = i8 | i2;
        int i11 = (~((~i2) | i)) | (~i10);
        int i12 = (~(i3 | i7 | i2)) | (~(i10 | i));
        int i13 = i2 + i + i6 + (528639218 * i5) + ((-532493036) * i4);
        int i14 = i13 * i13;
        int i15 = ((i2 * 873666089) - 1460666368) + (873666089 * i) + ((-875965520) * i9) + (437982760 * i11) + ((-437982760) * i12) + (435683328 * i6) + (1819279360 * i5) + ((-1621098496) * i4) + (586088448 * i14);
        int i16 = (i2 * (-1573143961)) + 2078511484 + (i * (-1573143961)) + (i9 * 1872) + (i11 * (-936)) + (i12 * 936) + (i6 * (-1573143025)) + (i5 * 123045422) + (i4 * (-1548035028)) + (i14 * 1845559296);
        switch (i15 + (i16 * i16 * 1848705024)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                CreditCardIssueIdFragment creditCardIssueIdFragment = (CreditCardIssueIdFragment) objArr[0];
                Ref.ObjectRef objectRef = (Ref.ObjectRef) objArr[1];
                View view = (View) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int iIntValue2 = ((Number) objArr[4]).intValue();
                int iIntValue3 = ((Number) objArr[5]).intValue();
                int iIntValue4 = ((Number) objArr[6]).intValue();
                int i17 = 2 % 2;
                int i18 = asBinder + 41;
                access000 = i18 % 128;
                int i19 = i18 % 2;
                onExtraCallbackWithResult(creditCardIssueIdFragment, objectRef, view, iIntValue, iIntValue2, iIntValue3, iIntValue4);
                int i20 = access000 + 63;
                asBinder = i20 % 128;
                int i21 = i20 % 2;
                return null;
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return onTransact(objArr);
            case 12:
                return access000(objArr);
            default:
                CreditCardIssueIdFragment creditCardIssueIdFragment2 = (CreditCardIssueIdFragment) objArr[0];
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
                int i22 = 2 % 2;
                int i23 = asBinder + 77;
                access000 = i23 % 128;
                int i24 = i23 % 2;
                Unit unitOnTransact = onTransact(creditCardIssueIdFragment2, setDetectableSize);
                int i25 = access000 + 113;
                asBinder = i25 % 128;
                int i26 = i25 % 2;
                return unitOnTransact;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditCardIssueIdFragment creditCardIssueIdFragment = (CreditCardIssueIdFragment) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 23;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        asBinder(creditCardIssueIdFragment, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = asBinder + 41;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditCardIssueIdFragment creditCardIssueIdFragment, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditCardIssueIdFragment, onBackPressedCallback);
        int i4 = access000 + 51;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditCardIssueIdFragment creditCardIssueIdFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault(creditCardIssueIdFragment, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(creditCardIssueIdFragment, setDetectableSize);
        int i3 = asBinder + 1;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ void onWarmupCompleted(CreditCardIssueIdFragment creditCardIssueIdFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(creditCardIssueIdFragment);
        int i4 = asBinder + 69;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(CreditCardIssueIdFragment creditCardIssueIdFragment, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallbackWithResult(creditCardIssueIdFragment, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = access000 + 5;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(CreditCardIssueIdFragment creditCardIssueIdFragment, EditText editText) {
        int i = 2 % 2;
        int i2 = access000 + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(creditCardIssueIdFragment, editText);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(CreditCardIssueIdFragment creditCardIssueIdFragment, ConstraintLayout constraintLayout) {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(creditCardIssueIdFragment, constraintLayout);
        int i4 = asBinder + 93;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        CreditCardIssueIdFragment creditCardIssueIdFragment = (CreditCardIssueIdFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 109;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        TextInputLayout interfaceDescriptor = creditCardIssueIdFragment.getInterfaceDescriptor();
        int i4 = asBinder + 25;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CreditCardIssueIdFragment creditCardIssueIdFragment = (CreditCardIssueIdFragment) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        creditCardIssueIdFragment.ICustomTabsCallbackDefault();
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        CreditCardIssueIdFragment creditCardIssueIdFragment = (CreditCardIssueIdFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 65;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String strOnActivityResized = creditCardIssueIdFragment.onActivityResized();
        int i4 = access000 + 67;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return strOnActivityResized;
    }

    public static final /* synthetic */ String onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = access000 + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        int i4 = asBinder + 13;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CreditCardIssueIdFragment() {
        super(R.layout.fragment_credit_card_issue_id);
        this.IAuthTabCallback = preFillDefault.onExtraCallbackWithResult(this, IAuthTabCallback.onWarmupCompleted);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.access000 + 73;
        viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.asBinder = r1 % 128;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.SessionTrackerb onExtraCallbackWithResult() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.access000
            int r1 = r1 + 5
            int r2 = r1 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.asBinder = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            o.SessionTrackerb r1 = r3.tossRouter
            r2 = 23
            int r2 = r2 / 0
            if (r1 == 0) goto L1c
            goto L1b
        L17:
            o.SessionTrackerb r1 = r3.tossRouter
            if (r1 == 0) goto L1c
        L1b:
            return r1
        L1c:
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            int r1 = viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.access000
            int r1 = r1 + 73
            int r2 = r1 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.asBinder = r2
            int r1 = r1 % r0
            r0 = 0
            if (r1 != 0) goto L2e
            return r0
        L2e:
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.onExtraCallbackWithResult():o.SessionTrackerb");
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function1<View, addLibraryPath> {
        public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

        IAuthTabCallback() {
            super(1, addLibraryPath.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCreditCardIssueIdBinding;", 0);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final addLibraryPath invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return addLibraryPath.onExtraCallbackWithResult(view);
        }
    }

    private final addLibraryPath asBinder() {
        int i = 2 % 2;
        int i2 = access000 + 37;
        asBinder = i2 % 128;
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = i2 % 2 != 0 ? this.IAuthTabCallback.onExtraCallbackWithResult(this, onNavigationEvent[1]) : this.IAuthTabCallback.onExtraCallbackWithResult(this, onNavigationEvent[0]);
        Intrinsics.checkNotNullExpressionValue(searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult, "");
        addLibraryPath addlibrarypath = (addLibraryPath) searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        int i3 = asBinder + 61;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 44 / 0;
        }
        return addlibrarypath;
    }

    private final TdsTopV2View onMinimized() {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            TdsTopV2View tdsTopV2View = asBinder().getInterfaceDescriptor;
            Intrinsics.checkNotNullExpressionValue(tdsTopV2View, "");
            return tdsTopV2View;
        }
        Intrinsics.checkNotNullExpressionValue(asBinder().getInterfaceDescriptor, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final TextInputLayout getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        TextInputLayout textInputLayout = asBinder().IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        int i4 = access000 + 73;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return textInputLayout;
        }
        throw null;
    }

    private final TdsTextButtonV0View access000() {
        int i = 2 % 2;
        int i2 = access000 + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        TdsTextButtonV0View tdsTextButtonV0View = asBinder().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsTextButtonV0View, "");
        int i4 = access000 + 27;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return tdsTextButtonV0View;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final KeyboardBottomCta asInterface() {
        int i = 2 % 2;
        int i2 = access000 + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KeyboardBottomCta keyboardBottomCta = asBinder().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(keyboardBottomCta, "");
        int i4 = asBinder + 11;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return keyboardBottomCta;
    }

    private final TdsImageView IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageView = asBinder().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        int i4 = access000 + 93;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return tdsImageView;
    }

    private final TdsButtonV1View access100() {
        int i = 2 % 2;
        int i2 = access000 + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        TdsButtonV1View tdsButtonV1View = asBinder().asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
        int i4 = asBinder + 17;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return tdsButtonV1View;
    }

    private final TdsButtonV1View IAuthTabCallbackStubProxy() {
        TdsButtonV1View tdsButtonV1View;
        int i = 2 % 2;
        int i2 = asBinder + 15;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            tdsButtonV1View = asBinder().asBinder;
            Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
            int i3 = 89 / 0;
        } else {
            tdsButtonV1View = asBinder().asBinder;
            Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
        }
        int i4 = asBinder + 23;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return tdsButtonV1View;
    }

    private final View onTransact() {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            View view = asBinder().IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(view, "");
            return view;
        }
        View view2 = asBinder().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        int i3 = 45 / 0;
        return view2;
    }

    private static final Unit onExtraCallbackWithResult(CreditCardIssueIdFragment creditCardIssueIdFragment, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = access000 + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        creditCardIssueIdFragment.extraCallback().IAuthTabCallback();
        creditCardIssueIdFragment.onPostMessage();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 49;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final String onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String strTake = StringsKt.take(StringsKt.replace$default(str, ".", "", false, 4, (Object) null), 8);
        if (strTake.length() > 6) {
            String strSubstring = strTake.substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String strSubstring2 = strTake.substring(4, 6);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            String strSubstring3 = strTake.substring(6);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
            return strSubstring + "." + strSubstring2 + "." + strSubstring3;
        }
        if (strTake.length() <= 4) {
            return strTake;
        }
        String strSubstring4 = strTake.substring(0, 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
        String strSubstring5 = strTake.substring(4);
        Intrinsics.checkNotNullExpressionValue(strSubstring5, "");
        String str2 = strSubstring4 + "." + strSubstring5;
        int i4 = access000 + 119;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }

    public static final class onNavigationEvent implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        onNavigationEvent() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Object[] objArr = {CreditCardIssueIdFragment.this};
            int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
            int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
            EditText editText = ((TextInputLayout) CreditCardIssueIdFragment.onWarmupCompleted(-1269596538, 1269596544, iOnWarmupCompleted, ACPayResult.onWarmupCompleted(), objArr, ACPayResult.onWarmupCompleted(), iOnWarmupCompleted2)).getEditText();
            if (editText != null) {
                String strValueOf = String.valueOf(editable);
                String strOnWarmupCompleted = CreditCardIssueIdFragment.onWarmupCompleted(strValueOf);
                if (!Intrinsics.areEqual(strValueOf, strOnWarmupCompleted)) {
                    editText.removeTextChangedListener(this);
                    editText.setText(strOnWarmupCompleted);
                    editText.setSelection(strOnWarmupCompleted.length());
                    editText.addTextChangedListener(this);
                }
            }
            Object[] objArr2 = {CreditCardIssueIdFragment.this};
            int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
            int iOnWarmupCompleted4 = ACPayResult.onWarmupCompleted();
            CreditCardIssueIdFragment.onWarmupCompleted(-95191399, 95191401, iOnWarmupCompleted3, ACPayResult.onWarmupCompleted(), objArr2, ACPayResult.onWarmupCompleted(), iOnWarmupCompleted4);
        }
    }

    private static final boolean onExtraCallback(CreditCardIssueIdFragment creditCardIssueIdFragment, TextView textView, int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 27;
        int i5 = i4 % 128;
        access000 = i5;
        if (i4 % 2 != 0 ? i != 6 : i != 40) {
            int i6 = i5 + 95;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = i3 + 11;
        access000 = i8 % 128;
        if (i8 % 2 == 0) {
            int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
            int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
            int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
            onWarmupCompleted(-1377977038, 1377977042, iOnWarmupCompleted, ACPayResult.onWarmupCompleted(), new Object[]{creditCardIssueIdFragment, "keyboard_done"}, iOnWarmupCompleted3, iOnWarmupCompleted2);
            return false;
        }
        int iOnWarmupCompleted4 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted5 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted6 = ACPayResult.onWarmupCompleted();
        onWarmupCompleted(-1377977038, 1377977042, iOnWarmupCompleted4, ACPayResult.onWarmupCompleted(), new Object[]{creditCardIssueIdFragment, "keyboard_done"}, iOnWarmupCompleted6, iOnWarmupCompleted5);
        return true;
    }

    private static final void onExtraCallbackWithResult(CreditCardIssueIdFragment creditCardIssueIdFragment, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {creditCardIssueIdFragment, creditCardIssueIdFragment.asInterface().onWarmupCompleted().getText().toString()};
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        onWarmupCompleted(-1377977038, 1377977042, iOnWarmupCompleted, ACPayResult.onWarmupCompleted(), objArr, ACPayResult.onWarmupCompleted(), iOnWarmupCompleted2);
        int i4 = access000 + 125;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $11 + 107;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 44 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), Process.getGidForName("") + 1452, 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 49124), TextUtils.getCapsMode("", 0, 0) + 44, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1494, 1533236389, false, $$c(b3, b4, (byte) (-b4)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - View.MeasureSpec.getSize(0)), 50 - View.resolveSize(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 45848), Color.alpha(0) + 29, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12576, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallbackDefault ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackStub ^ 7798559133331975163L))) ^ ((char) (onTransact ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i6 = $10 + 67;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackStub(CreditCardIssueIdFragment creditCardIssueIdFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", creditCardIssueIdFragment.extraCallback().IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("session_id", creditCardIssueIdFragment.extraCallback().ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("funnel_id", creditCardIssueIdFragment.extraCallback().getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("screen_type", ((getSalt) creditCardIssueIdFragment.readTypedObject()).onExtraCallback());
        Object[] objArr = new Object[1];
        a((char) (24379 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 1662530996 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{45564, 2310, 24396, 59753, 43251}, new char[]{0, 0, 0, 0}, new char[]{46273, 6197, 15203, 46431}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditCardIssueIdFragment.access000().getText());
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 67;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return unit;
    }

    private static final void IAuthTabCallbackDefault(final CreditCardIssueIdFragment creditCardIssueIdFragment, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1385612L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda19
            public final Object invoke(Object obj) {
                return CreditCardIssueIdFragment.onExtraCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        IDEACBCPar.onExtraCallback(RippleNode.onNavigationEvent(creditCardIssueIdFragment), R.id.driverLicenseAction, creditCardIssueIdFragment.requireArguments(), null, null, 12, null);
        int i2 = access000 + 31;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 71 / 0;
        }
    }

    private static final Unit onExtraCallback(ResidentIdCardScrapedEvent residentIdCardScrapedEvent, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(residentIdCardScrapedEvent.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 91;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[PHI: r8
      0x0035: PHI (r8v5 android.widget.EditText) = (r8v4 android.widget.EditText), (r8v7 android.widget.EditText) binds: [B:10:0x0033, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment r8, final viva.republica.toss.common.web.message.handlers.cardissue.ResidentIdCardScrapedEvent r9) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = r9.onNavigationEvent()
            boolean r1 = kotlin.text.StringsKt.isBlank(r1)
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L51
            int r1 = viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.access000
            int r1 = r1 + 55
            int r4 = r1 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.asBinder = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L28
            r8.onNavigationEvent(r2)
            com.google.android.material.textfield.TextInputLayout r8 = r8.getInterfaceDescriptor()
            android.widget.EditText r8 = r8.getEditText()
            if (r8 == 0) goto L65
            goto L35
        L28:
            r8.onNavigationEvent(r3)
            com.google.android.material.textfield.TextInputLayout r8 = r8.getInterfaceDescriptor()
            android.widget.EditText r8 = r8.getEditText()
            if (r8 == 0) goto L65
        L35:
            int r1 = viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.access000
            int r1 = r1 + 125
            int r2 = r1 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.asBinder = r2
            int r1 = r1 % r0
            java.lang.String r2 = r9.onNavigationEvent()
            java.lang.String r3 = "-"
            java.lang.String r4 = ""
            r5 = 0
            r6 = 4
            r7 = 0
            java.lang.String r9 = kotlin.text.StringsKt.replace$default(r2, r3, r4, r5, r6, r7)
            r8.setText(r9)
            goto L65
        L51:
            r8.onNavigationEvent(r2)
            android.content.Context r8 = r8.requireContext()
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda4 r0 = new viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda4
            r0.<init>()
            o.CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(r8, r0)
        L65:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.onExtraCallback(viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment, viva.republica.toss.common.web.message.handlers.cardissue.ResidentIdCardScrapedEvent):kotlin.Unit");
    }

    private static final Unit onNavigationEvent(CreditCardIssueIdFragment creditCardIssueIdFragment, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        creditCardIssueIdFragment.onNavigationEvent(false);
        getParamImp.onWarmupCompleted(th, creditCardIssueIdFragment.requireContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 65;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        extraCommand.IAuthTabCallback(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda13
            public final Object invoke(Object obj) {
                return CreditCardIssueIdFragment.onWarmupCompleted(this.f$0, (OnBackPressedCallback) obj);
            }
        }, 2, (Object) null);
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        EditText editText = getInterfaceDescriptor().getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new onNavigationEvent());
        }
        EditText editText2 = getInterfaceDescriptor().getEditText();
        Intrinsics.checkNotNull(editText2);
        editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda14
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                Object[] objArr = {this.f$0, textView, Integer.valueOf(i2), keyEvent};
                int iOnWarmupCompleted4 = ACPayResult.onWarmupCompleted();
                int iOnWarmupCompleted5 = ACPayResult.onWarmupCompleted();
                return ((Boolean) CreditCardIssueIdFragment.onWarmupCompleted(315064461, -315064449, iOnWarmupCompleted4, ACPayResult.onWarmupCompleted(), objArr, ACPayResult.onWarmupCompleted(), iOnWarmupCompleted5)).booleanValue();
            }
        });
        asInterface().onNavigationEvent().setVisibility(8);
        asInterface().onWarmupCompleted().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CreditCardIssueIdFragment.onWarmupCompleted(this.f$0, view2);
            }
        });
        TdsImageView tdsImageViewIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        Object[] objArr = new Object[1];
        a((char) (KeyEvent.keyCodeFromString("") + 21051), 1340598909 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{54158, 21873, 14872, 6160, 19367, 52020, 64444, 16005, 46127, 568, 34395, 59545, 52166, 6946, 28158, 5286, 28848, 65041, 54121, 41441, 6048, 10426, 40842, 33966, 46372, 11373, 40791, 51933, 44709, 60075, 5741, 27132, 39644, 61594, 46664, 43342, 60303, 17472, 28206, 59424, 42414, 27594, 8609}, new char[]{0, 0, 0, 0}, new char[]{31863, 59370, 15183, 36946}, objArr);
        TdsImageView.setImage$default(tdsImageViewIAuthTabCallback_Parcel, ((String) objArr[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        access000().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CreditCardIssueIdFragment.onExtraCallback(this.f$0, view2);
            }
        });
        ICustomTabsCallbackDefault();
        onRelationshipValidationResult();
        int iOnWarmupCompleted4 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted5 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted6 = ACPayResult.onWarmupCompleted();
        onWarmupCompleted(1413520340, -1413520337, iOnWarmupCompleted4, ACPayResult.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted6, iOnWarmupCompleted5);
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback = getIconPaddingLeft.IAuthTabCallback.onWarmupCompleted().onExtraCallback(ResidentIdCardScrapedEvent.class);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallback, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingOnExtraCallback.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        autoDisposable(setMessageBytes.onNavigationEvent(jsonReaderUnknownNumberParsingOnWarmupCompleted, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda17
            public final Object invoke(Object obj) {
                return CreditCardIssueIdFragment.onExtraCallbackWithResult(this.f$0, (Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda18
            public final Object invoke(Object obj) {
                return CreditCardIssueIdFragment.onNavigationEvent(this.f$0, (ResidentIdCardScrapedEvent) obj);
            }
        }, 2, (Object) null));
        int i2 = asBinder + 87;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        this.asInterface = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0084, code lost:
    
        if (r2 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0095, code lost:
    
        if (r2 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0097, code lost:
    
        r11 = o.setBodyokhttp.onExtraCallback(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a1, code lost:
    
        if (r11.ITrustedWebActivityCallbackDefault() != o.getSpecialFeatureOptInStatus.Dark) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        r11 = r11.getInterfaceDescriptor().ICustomTabsCallbackStubProxy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ac, code lost:
    
        r11 = r11.requestPostMessageChannel().onMinimized();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b4, code lost:
    
        r2.onNavigationEvent(java.lang.Integer.valueOf(r11));
        r2.onNavigationEvent(r3);
        r11 = kotlin.Unit.INSTANCE;
        r0 = viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.access000 + 59;
        viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.asBinder = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c9, code lost:
    
        if ((r0 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cb, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cc, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object asBinder(java.lang.Object[] r11) {
        /*
            r0 = 0
            r11 = r11[r0]
            viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment r11 = (viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment) r11
            r1 = 2
            int r2 = r1 % r1
            im.toss.tds.view.compat.component.compound.top.TdsTopV2View r2 = r11.onMinimized()
            r2.setLowerGap(r0)
            im.toss.tds.view.compat.component.compound.top.TdsTopV2View$IAuthTabCallbackStub r3 = im.toss.tds.view.compat.component.compound.top.TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH
            r2.setTitleType(r3)
            im.toss.tds.view.compat.component.compound.top.TdsTopV2View$onExtraCallback r3 = im.toss.tds.view.compat.component.compound.top.TdsTopV2View.onExtraCallback.SIZE_22
            r2.setTitleTextSize(r3)
            o.getMinWebSocketMessageToCompressokhttp r3 = r2.IAuthTabCallback_Parcel()
            if (r3 == 0) goto L3b
            o.getUrlokhttp r4 = o.setBodyokhttp.onExtraCallback(r11)
            int r4 = r4.onUnminimized()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.onNavigationEvent(r4)
            android.content.Context r4 = r11.requireContext()
            int r5 = viva.republica.toss.R.string.input_register_date
            java.lang.String r4 = r4.getString(r5)
            r3.onNavigationEvent(r4)
        L3b:
            o.getEncryptedData r3 = r11.readTypedObject()
            o.getSalt r3 = (o.getSalt) r3
            o.AdvertisingId r3 = r3.onExtraCallbackWithResult()
            java.lang.Object[] r9 = new java.lang.Object[]{r3}
            int r6 = im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback()
            int r7 = im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback()
            int r5 = im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback()
            int r4 = im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback()
            r10 = 359673907(0x15703033, float:4.8505636E-26)
            r8 = -359673906(0xffffffffea8fcfce, float:-8.692886E25)
            java.lang.Object r3 = o.AdvertisingId.onExtraCallback(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            if (r3 == 0) goto Lcd
            int r5 = viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.asBinder
            int r5 = r5 + 61
            int r6 = r5 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.access000 = r6
            int r5 = r5 % r1
            if (r5 != 0) goto L87
            im.toss.tds.view.compat.component.compound.top.TdsTopV2View$onExtraCallbackWithResult r5 = im.toss.tds.view.compat.component.compound.top.TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH
            r2.setSubtitle2Type(r5)
            im.toss.tds.view.compat.component.compound.top.TdsTopV2View$onWarmupCompleted r5 = im.toss.tds.view.compat.component.compound.top.TdsTopV2View.onWarmupCompleted.SIZE_15
            r2.setSubtitle2TextSize(r5)
            o.getMinWebSocketMessageToCompressokhttp r2 = r2.onTransact()
            r5 = 86
            int r5 = r5 / r0
            if (r2 == 0) goto Lcd
            goto L97
        L87:
            im.toss.tds.view.compat.component.compound.top.TdsTopV2View$onExtraCallbackWithResult r0 = im.toss.tds.view.compat.component.compound.top.TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH
            r2.setSubtitle2Type(r0)
            im.toss.tds.view.compat.component.compound.top.TdsTopV2View$onWarmupCompleted r0 = im.toss.tds.view.compat.component.compound.top.TdsTopV2View.onWarmupCompleted.SIZE_15
            r2.setSubtitle2TextSize(r0)
            o.getMinWebSocketMessageToCompressokhttp r2 = r2.onTransact()
            if (r2 == 0) goto Lcd
        L97:
            o.getUrlokhttp r11 = o.setBodyokhttp.onExtraCallback(r11)
            o.getSpecialFeatureOptInStatus r0 = r11.ITrustedWebActivityCallbackDefault()
            o.getSpecialFeatureOptInStatus r5 = o.getSpecialFeatureOptInStatus.Dark
            if (r0 != r5) goto Lac
            o.setHeadersokhttp r11 = r11.getInterfaceDescriptor()
            int r11 = r11.ICustomTabsCallbackStubProxy()
            goto Lb4
        Lac:
            o.setHeadersokhttp r11 = r11.requestPostMessageChannel()
            int r11 = r11.onMinimized()
        Lb4:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r2.onNavigationEvent(r11)
            r2.onNavigationEvent(r3)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            int r0 = viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.access000
            int r0 = r0 + 59
            int r2 = r0 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.asBinder = r2
            int r0 = r0 % r1
            if (r0 != 0) goto Lcc
            return r11
        Lcc:
            throw r4
        Lcd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.asBinder(java.lang.Object[]):java.lang.Object");
    }

    private final void onNavigationEvent(boolean z) throws Throwable {
        final String string;
        String strIntern;
        Object obj;
        int i = 2 % 2;
        if (z) {
            int i2 = access000 + 81;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            string = getString(R.string.app_fragment_credit_card_issue_scraped_success);
        } else {
            string = getString(R.string.app_fragment_credit_card_issue_scraped_failed);
        }
        Intrinsics.checkNotNull(string);
        ConstraintLayout root = asBinder().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        TdsToastV1.onNavigationEvent onnavigationevent = new TdsToastV1.onNavigationEvent(root, string);
        if (!z) {
            Object[] objArr = new Object[1];
            a((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (-1025742227) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{40574, 64543, 12023, 40635, 15662, 14369, 13118, 28476, 37861, 58769, 36925, 4842, 64044, 59021, 15589, 3503, 58630, 18698, 20905, 63679, 1402, 26037, 29238, 9498, 30737, 5326, 13693, 47832, 18879, 10704, 6721, 42974, 18050, 9021, 57797, 50492, 10753, 2177, 36243, 51477, 13125, 50298, 18343, 41300, 51580, 18880, 20311, 8624, 24919, 54351, 25735, 22948, 50147, 52477, 60135, 8808, 10453, 59870, 41515}, new char[]{0, 0, 0, 0}, new char[]{28047, 56426, 14786, 61514}, objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            int i4 = access000 + 23;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                a((char) ((byte) KeyEvent.getModifierMetaStateMask()), KeyEvent.getDeadChar(1, 1) * 134766363, new char[]{47076, 6338, 24518, 3415, 40373, 12367, 18364, 55428, 53708, 25400, 9892, 49377, 17817, 40109, 39961, 60697, 55986, 17097, 34574, 63570, 65088, 15887, 50046, 53475, 36322, 63511, 10547, 62336, 2454, 53199, 49428, 16613, 11175, 19213, 26876, 15905, 49810, 41220, 21454, 29890, 24095, 44421, 55514, 52166, 4621, 37309, 152, 26805, 57113, 62082, 60776, 4084, 53230, 60760, 33419, 9941, 31767, 42501, 37768, 43213, 14908, 29549, 64840}, new char[]{0, 0, 0, 0}, new char[]{7015, 2143, 16648, 47146}, objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                a((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 134766363 - KeyEvent.getDeadChar(0, 0), new char[]{47076, 6338, 24518, 3415, 40373, 12367, 18364, 55428, 53708, 25400, 9892, 49377, 17817, 40109, 39961, 60697, 55986, 17097, 34574, 63570, 65088, 15887, 50046, 53475, 36322, 63511, 10547, 62336, 2454, 53199, 49428, 16613, 11175, 19213, 26876, 15905, 49810, 41220, 21454, 29890, 24095, 44421, 55514, 52166, 4621, 37309, 152, 26805, 57113, 62082, 60776, 4084, 53230, 60760, 33419, 9941, 31767, 42501, 37768, 43213, 14908, 29549, 64840}, new char[]{0, 0, 0, 0}, new char[]{7015, 2143, 16648, 47146}, objArr3);
                obj = objArr3[0];
            }
            strIntern = ((String) obj).intern();
        }
        TdsToastV1.onNavigationEvent.onExtraCallback(onnavigationevent, strIntern, 0, 2, (Object) null).onExtraCallback();
        ConvertByteArrayToFloatArray.onExtraCallback(1490247L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda2
            public final Object invoke(Object obj2) {
                Object[] objArr4 = {this.f$0, string, (SetDetectableSize) obj2};
                int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
                int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
                return (Unit) CreditCardIssueIdFragment.onWarmupCompleted(1543178291, -1543178281, iOnWarmupCompleted, ACPayResult.onWarmupCompleted(), objArr4, ACPayResult.onWarmupCompleted(), iOnWarmupCompleted2);
            }
        }, 14, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(CreditCardIssueIdFragment creditCardIssueIdFragment, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", creditCardIssueIdFragment.extraCallback().IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("session_id", creditCardIssueIdFragment.extraCallback().ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("funnel_id", creditCardIssueIdFragment.extraCallback().getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("screen_type", ((getSalt) creditCardIssueIdFragment.readTypedObject()).onExtraCallback());
        Object[] objArr = new Object[1];
        a((char) (MotionEvent.axisFromString("") + 24380), 1662530996 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{45564, 2310, 24396, 59753, 43251}, new char[]{0, 0, 0, 0}, new char[]{46273, 6197, 15203, 46431}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 117;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void onExtraCallback(CreditCardIssueIdFragment creditCardIssueIdFragment, EditText editText) {
        int i = 2 % 2;
        int i2 = access000 + 87;
        asBinder = i2 % 128;
        creditCardIssueIdFragment.asBinder().IAuthTabCallbackDefault.smoothScrollTo(i2 % 2 != 0 ? 1 : 0, editText.getBottom());
        int i3 = access000 + 99;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFirstGlobalLayout() {
        int i = 2 % 2;
        int i2 = access000 + 101;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            super.onFirstGlobalLayout();
            final EditText editText = getInterfaceDescriptor().getEditText();
            Intrinsics.checkNotNull(editText);
            editText.requestFocus();
            if (canShowSoftInput(editText)) {
                Object[] objArr = {M_.onExtraCallback, editText};
                int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                M_.onNavigationEvent(1312897292, objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1312897289, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
                asBinder().IAuthTabCallbackDefault.post(new Runnable() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() {
                        CreditCardIssueIdFragment.onWarmupCompleted(this.f$0, editText);
                    }
                });
            }
            isLimitAdTracking islimitadtrackingAsInterface = ((getSalt) readTypedObject()).asInterface();
            if (islimitadtrackingAsInterface != null) {
                int i3 = asBinder + 75;
                access000 = i3 % 128;
                int i4 = i3 % 2;
                if (islimitadtrackingAsInterface.onExtraCallback()) {
                    IAuthTabCallbackStub();
                }
            }
            int i5 = asBinder + 99;
            access000 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 72 / 0;
                return;
            }
            return;
        }
        super.onFirstGlobalLayout();
        EditText editText2 = getInterfaceDescriptor().getEditText();
        Intrinsics.checkNotNull(editText2);
        editText2.requestFocus();
        canShowSoftInput(editText2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(CreditCardIssueIdFragment creditCardIssueIdFragment, Ref.ObjectRef<View.OnLayoutChangeListener> objectRef) {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        creditCardIssueIdFragment.onTransact().removeOnLayoutChangeListener((View.OnLayoutChangeListener) objectRef.element);
        creditCardIssueIdFragment.asBinder().IAuthTabCallbackDefault.setOnScrollChangeListener(null);
        int i4 = access000 + 71;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        CreditCardIssueIdFragment creditCardIssueIdFragment = (CreditCardIssueIdFragment) objArr[0];
        Ref.ObjectRef objectRef = (Ref.ObjectRef) objArr[1];
        int i = 2 % 2;
        if (creditCardIssueIdFragment.asInterface) {
            int i2 = access000 + 105;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(creditCardIssueIdFragment, (Ref.ObjectRef<View.OnLayoutChangeListener>) objectRef);
            return null;
        }
        if (creditCardIssueIdFragment.ICustomTabsCallbackStubProxy()) {
            int i4 = access000 + 47;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            creditCardIssueIdFragment.ICustomTabsCallbackStub();
            IAuthTabCallback(creditCardIssueIdFragment, (Ref.ObjectRef<View.OnLayoutChangeListener>) objectRef);
        }
        return null;
    }

    private static final void IAuthTabCallback(CreditCardIssueIdFragment creditCardIssueIdFragment, Ref.ObjectRef objectRef, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = asBinder + 81;
        access000 = i10 % 128;
        int i11 = i10 % 2;
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        onWarmupCompleted(420656333, -420656325, iOnWarmupCompleted, ACPayResult.onWarmupCompleted(), new Object[]{creditCardIssueIdFragment, objectRef}, iOnWarmupCompleted3, iOnWarmupCompleted2);
        int i12 = asBinder + 69;
        access000 = i12 % 128;
        int i13 = i12 % 2;
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        onWarmupCompleted(420656333, -420656325, iOnWarmupCompleted, ACPayResult.onWarmupCompleted(), new Object[]{this, objectRef}, iOnWarmupCompleted3, iOnWarmupCompleted2);
        objectRef.element = new View.OnLayoutChangeListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda11
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                Object[] objArr = {this.f$0, objectRef, view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)};
                int iOnWarmupCompleted4 = ACPayResult.onWarmupCompleted();
                int iOnWarmupCompleted5 = ACPayResult.onWarmupCompleted();
                CreditCardIssueIdFragment.onWarmupCompleted(-2120591516, 2120591517, iOnWarmupCompleted4, ACPayResult.onWarmupCompleted(), objArr, ACPayResult.onWarmupCompleted(), iOnWarmupCompleted5);
            }
        };
        onTransact().addOnLayoutChangeListener((View.OnLayoutChangeListener) objectRef.element);
        asBinder().IAuthTabCallbackDefault.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda12
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i2, int i3, int i4, int i5) {
                Object[] objArr = {this.f$0, objectRef, view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                int iOnWarmupCompleted4 = ACPayResult.onWarmupCompleted();
                int iOnWarmupCompleted5 = ACPayResult.onWarmupCompleted();
                CreditCardIssueIdFragment.onWarmupCompleted(-1797638232, 1797638241, iOnWarmupCompleted4, ACPayResult.onWarmupCompleted(), objArr, ACPayResult.onWarmupCompleted(), iOnWarmupCompleted5);
            }
        });
        int i2 = asBinder + 111;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
    }

    private static final void onExtraCallbackWithResult(CreditCardIssueIdFragment creditCardIssueIdFragment, Ref.ObjectRef objectRef, View view, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = asBinder + 39;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr = {creditCardIssueIdFragment, objectRef};
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted4 = ACPayResult.onWarmupCompleted();
        if (i7 != 0) {
            onWarmupCompleted(420656333, -420656325, iOnWarmupCompleted, iOnWarmupCompleted4, objArr, iOnWarmupCompleted3, iOnWarmupCompleted2);
        } else {
            onWarmupCompleted(420656333, -420656325, iOnWarmupCompleted, iOnWarmupCompleted4, objArr, iOnWarmupCompleted3, iOnWarmupCompleted2);
            int i8 = 72 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean ICustomTabsCallbackStubProxy() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            im.toss.tds.view.component.atom.button.TdsButtonV1View r1 = r5.access100()
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L1b
            int r1 = viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.access000
            int r1 = r1 + 95
            int r2 = r1 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.asBinder = r2
            int r1 = r1 % r0
            im.toss.tds.view.component.atom.button.TdsButtonV1View r1 = r5.access100()
            goto L29
        L1b:
            im.toss.tds.view.component.atom.button.TdsButtonV1View r1 = r5.IAuthTabCallbackStubProxy()
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L3f
            im.toss.tds.view.component.atom.button.TdsButtonV1View r1 = r5.IAuthTabCallbackStubProxy()
        L29:
            int[] r2 = new int[r0]
            r1.getLocationOnScreen(r2)
            r1 = 1
            r2 = r2[r1]
            int[] r3 = new int[r0]
            android.view.View r4 = r5.onTransact()
            r4.getLocationOnScreen(r3)
            r3 = r3[r1]
            if (r2 >= r3) goto L3f
            return r1
        L3f:
            int r1 = viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.asBinder
            int r1 = r1 + 119
            int r2 = r1 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.access000 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L4c
            r0 = 0
            return r0
        L4c:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.ICustomTabsCallbackStubProxy():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asBinder(CreditCardIssueIdFragment creditCardIssueIdFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", creditCardIssueIdFragment.extraCallback().IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("session_id", creditCardIssueIdFragment.extraCallback().ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("funnel_id", creditCardIssueIdFragment.extraCallback().getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("screen_type", ((getSalt) creditCardIssueIdFragment.readTypedObject()).onExtraCallback());
        Object[] objArr = new Object[1];
        a((char) ((Process.myPid() >> 22) + 24379), 1662530997 + ExpandableListView.getPackedPositionChild(0L), new char[]{45564, 2310, 24396, 59753, 43251}, new char[]{0, 0, 0, 0}, new char[]{46273, 6197, 15203, 46431}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditCardIssueIdFragment.access100().getText());
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 107;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 65 / 0;
            if (this.asInterface) {
                return;
            }
        } else if (this.asInterface) {
            return;
        }
        ConvertByteArrayToFloatArray.onExtraCallback(1498787L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return CreditCardIssueIdFragment.IAuthTabCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        this.asInterface = true;
        int i4 = asBinder + 87;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackDefault(CreditCardIssueIdFragment creditCardIssueIdFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", creditCardIssueIdFragment.extraCallback().IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("session_id", creditCardIssueIdFragment.extraCallback().ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("funnel_id", creditCardIssueIdFragment.extraCallback().getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("screen_type", ((getSalt) creditCardIssueIdFragment.readTypedObject()).onExtraCallback());
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 24379), TextUtils.indexOf((CharSequence) "", '0') + 1662530997, new char[]{45564, 2310, 24396, 59753, 43251}, new char[]{0, 0, 0, 0}, new char[]{46273, 6197, 15203, 46431}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditCardIssueIdFragment.access100().getText());
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 77;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void asBinder(final CreditCardIssueIdFragment creditCardIssueIdFragment, View view) {
        String strOnNavigationEvent;
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1385604L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return CreditCardIssueIdFragment.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        SessionTrackerb sessionTrackerbOnExtraCallbackWithResult = creditCardIssueIdFragment.onExtraCallbackWithResult();
        Context contextRequireContext = creditCardIssueIdFragment.requireContext();
        isLimitAdTracking islimitadtrackingAsInterface = ((getSalt) creditCardIssueIdFragment.readTypedObject()).asInterface();
        if (islimitadtrackingAsInterface != null) {
            strOnNavigationEvent = islimitadtrackingAsInterface.onNavigationEvent();
            int i2 = asBinder + 49;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 5;
            }
        } else {
            strOnNavigationEvent = null;
        }
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerbOnExtraCallbackWithResult, contextRequireContext, strOnNavigationEvent, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i4 = asBinder + 69;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asInterface(CreditCardIssueIdFragment creditCardIssueIdFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", creditCardIssueIdFragment.extraCallback().IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("session_id", creditCardIssueIdFragment.extraCallback().ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("funnel_id", creditCardIssueIdFragment.extraCallback().getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("screen_type", ((getSalt) creditCardIssueIdFragment.readTypedObject()).onExtraCallback());
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 24379), 1662530996 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{45564, 2310, 24396, 59753, 43251}, new char[]{0, 0, 0, 0}, new char[]{46273, 6197, 15203, 46431}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditCardIssueIdFragment.access100().getText());
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 5;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onTransact(final CreditCardIssueIdFragment creditCardIssueIdFragment, View view) {
        String strOnNavigationEvent;
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1385604L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CreditCardIssueIdFragment.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        SessionTrackerb sessionTrackerbOnExtraCallbackWithResult = creditCardIssueIdFragment.onExtraCallbackWithResult();
        Context contextRequireContext = creditCardIssueIdFragment.requireContext();
        isLimitAdTracking islimitadtrackingAsInterface = ((getSalt) creditCardIssueIdFragment.readTypedObject()).asInterface();
        if (islimitadtrackingAsInterface != null) {
            int i2 = asBinder + 31;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            strOnNavigationEvent = islimitadtrackingAsInterface.onNavigationEvent();
        } else {
            strOnNavigationEvent = null;
        }
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerbOnExtraCallbackWithResult, contextRequireContext, strOnNavigationEvent, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i4 = asBinder + 103;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onRelationshipValidationResult() {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.asBinder
            int r1 = r1 + 115
            int r2 = r1 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.access000 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto Lbd
            o.getEncryptedData r1 = r10.readTypedObject()
            o.getSalt r1 = (o.getSalt) r1
            o.isLimitAdTracking r1 = r1.asInterface()
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L52
            boolean r1 = r1.onExtraCallback()
            if (r1 != r3) goto L52
            int r1 = viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.asBinder
            int r1 = r1 + 67
            int r5 = r1 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.access000 = r5
            int r1 = r1 % r0
            o.getEncryptedData r1 = r10.readTypedObject()
            o.getSalt r1 = (o.getSalt) r1
            o.isLimitAdTracking r1 = r1.asInterface()
            if (r1 == 0) goto L45
            int r2 = viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.access000
            int r2 = r2 + 7
            int r5 = r2 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.asBinder = r5
            int r2 = r2 % r0
            java.lang.String r2 = r1.onNavigationEvent()
        L45:
            if (r2 == 0) goto L52
            int r1 = viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.asBinder
            int r1 = r1 + 111
            int r2 = r1 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.access000 = r2
            int r1 = r1 % r0
            r0 = r3
            goto L53
        L52:
            r0 = r4
        L53:
            android.content.Context r1 = r10.getContext()
            r2 = 8
            if (r1 == 0) goto L81
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            java.lang.String r5 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            boolean r1 = o.readIntokhttp.onWarmupCompleted(r1)
            if (r1 != r3) goto L81
            im.toss.tds.view.component.atom.button.TdsButtonV1View r1 = r10.IAuthTabCallbackStubProxy()
            if (r0 == 0) goto L75
            goto L76
        L75:
            r4 = r2
        L76:
            r1.setVisibility(r4)
            im.toss.tds.view.component.atom.button.TdsButtonV1View r0 = r10.access100()
            r0.setVisibility(r2)
            goto L93
        L81:
            im.toss.tds.view.component.atom.button.TdsButtonV1View r1 = r10.access100()
            if (r0 == 0) goto L88
            goto L89
        L88:
            r4 = r2
        L89:
            r1.setVisibility(r4)
            im.toss.tds.view.component.atom.button.TdsButtonV1View r0 = r10.IAuthTabCallbackStubProxy()
            r0.setVisibility(r2)
        L93:
            im.toss.tds.view.component.atom.button.TdsButtonV1View r0 = r10.access100()
            viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda7 r1 = new viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda7
            r1.<init>()
            r0.setOnClickListener(r1)
            im.toss.tds.view.component.atom.button.TdsButtonV1View r0 = r10.IAuthTabCallbackStubProxy()
            viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda8 r1 = new viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda8
            r1.<init>()
            r0.setOnClickListener(r1)
            r2 = 1473797(0x167d05, double:7.281525E-318)
            r4 = 0
            r5 = 0
            r6 = 0
            viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda9 r7 = new viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda9
            r7.<init>()
            r8 = 14
            r9 = 0
            o.ConvertByteArrayToFloatArray.onExtraCallback(r2, r4, r5, r6, r7, r8, r9)
            return
        Lbd:
            o.getEncryptedData r0 = r10.readTypedObject()
            o.getSalt r0 = (o.getSalt) r0
            r0.asInterface()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.onRelationshipValidationResult():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onTransact(CreditCardIssueIdFragment creditCardIssueIdFragment, SetDetectableSize setDetectableSize) {
        boolean z;
        int i = 2 % 2;
        int i2 = asBinder + 67;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", creditCardIssueIdFragment.extraCallback().IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("session_id", creditCardIssueIdFragment.extraCallback().ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("funnel_id", creditCardIssueIdFragment.extraCallback().getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("screen_type", ((getSalt) creditCardIssueIdFragment.readTypedObject()).onExtraCallback());
        if (creditCardIssueIdFragment.access100().getVisibility() == 0) {
            int i4 = asBinder + 63;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = asBinder + 5;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        setDetectableSize.onExtraCallback("button_visible_yn", zzaz.onExtraCallbackWithResult(z));
        return Unit.INSTANCE;
    }

    private final void ICustomTabsCallbackDefault() {
        boolean z;
        int i = 2 % 2;
        EditText editText = getInterfaceDescriptor().getEditText();
        Intrinsics.checkNotNull(editText);
        boolean z2 = true;
        if (editText.length() > 0) {
            int i2 = asBinder + 121;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            int i4 = asBinder + 49;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        TdsButtonV1View tdsButtonV1ViewOnWarmupCompleted = asInterface().onWarmupCompleted();
        if (z && onActivityResized().length() == 8) {
            int i6 = asBinder + 17;
            access000 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            z2 = false;
        }
        tdsButtonV1ViewOnWarmupCompleted.setEnabled(z2);
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ String $buttonText;
        final /* synthetic */ Calendar $cal;
        final /* synthetic */ BaseRoundCornerProgressBar1 $rrn;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(BaseRoundCornerProgressBar1 baseRoundCornerProgressBar1, Calendar calendar, String str, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$rrn = baseRoundCornerProgressBar1;
            this.$cal = calendar;
            this.$buttonText = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CreditCardIssueIdFragment.this.new onExtraCallback(this.$rrn, this.$cal, this.$buttonText, access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x01a0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) throws im.toss.network.throwable.TossApiCallException.ApiError {
            /*
                Method dump skipped, instructions count: 514
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment.onExtraCallback.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onNavigationEvent(CreditCardIssueIdFragment creditCardIssueIdFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(creditCardIssueIdFragment.getString(R.string.app_card_issue_ocr_verify_default_error_message));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit IAuthTabCallback(Throwable th, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(th.getMessage());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit IAuthTabCallback(CreditCardIssueIdFragment creditCardIssueIdFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(creditCardIssueIdFragment.getString(R.string.app_card_issue_ocr_verify_default_error_message));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit IAuthTabCallbackStub(CreditCardIssueIdFragment creditCardIssueIdFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(creditCardIssueIdFragment.getString(R.string.app_card_issue_ocr_verify_default_error_message_for_test));
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int iIntValue;
        int iIntValue2;
        CreditCardIssueIdFragment creditCardIssueIdFragment = (CreditCardIssueIdFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (creditCardIssueIdFragment.asInterface().onWarmupCompleted().isEnabled()) {
            creditCardIssueIdFragment.hideSoftKeyboard();
            BaseRoundCornerProgressBar1 baseRoundCornerProgressBar1OnRelationshipValidationResult = creditCardIssueIdFragment.extraCallback().onRelationshipValidationResult();
            if (baseRoundCornerProgressBar1OnRelationshipValidationResult != null) {
                String strOnActivityResized = creditCardIssueIdFragment.onActivityResized();
                String strSubstring = strOnActivityResized.substring(0, 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                Integer intOrNull = StringsKt.toIntOrNull(strSubstring);
                if (intOrNull != null) {
                    int i4 = access000 + 87;
                    asBinder = i4 % 128;
                    if (i4 % 2 != 0) {
                        intOrNull.intValue();
                        obj.hashCode();
                        throw null;
                    }
                    iIntValue = intOrNull.intValue();
                } else {
                    iIntValue = 0;
                }
                String strSubstring2 = strOnActivityResized.substring(4, 6);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                Integer intOrNull2 = StringsKt.toIntOrNull(strSubstring2);
                if (intOrNull2 != null) {
                    int i5 = asBinder + 87;
                    access000 = i5 % 128;
                    int i6 = i5 % 2;
                    iIntValue2 = intOrNull2.intValue();
                } else {
                    int i7 = access000 + 69;
                    asBinder = i7 % 128;
                    int i8 = i7 % 2;
                    iIntValue2 = 0;
                }
                String strSubstring3 = strOnActivityResized.substring(6, 8);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                Integer intOrNull3 = StringsKt.toIntOrNull(strSubstring3);
                int iIntValue3 = intOrNull3 != null ? intOrNull3.intValue() : 0;
                Calendar calendar = Calendar.getInstance();
                calendar.set(1, iIntValue);
                calendar.set(2, iIntValue2 - 1);
                calendar.set(5, iIntValue3);
                if (!creditCardIssueIdFragment.extraCallback().writeTypedObject()) {
                    creditCardIssueIdFragment.extraCallback().IAuthTabCallback();
                    getDigestAlgorithms<L> getdigestalgorithmsWriteTypedObject = creditCardIssueIdFragment.writeTypedObject();
                    TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(creditCardIssueIdFragment);
                    CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = creditCardIssueIdFragment.extraCallback();
                    IdVerificationFormValue.IdType idType = IdVerificationFormValue.IdType.RESIDENT;
                    getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnNavigationEvent, cardIssueOverviewViewModelExtraCallback, new IdVerificationFormValue(idType, null, null, null, creditCardIssueIdFragment.onActivityResized(), true, "gov24", 14, null), (String) null, str, access8100.onNavigationEvent(getWrite.IAuthTabCallback("id_type", idType.getLogName())), 8, (Object) null);
                    return null;
                }
                maybeUpdateAnimatable.onNavigationEvent(onRenderReady.onExtraCallback(creditCardIssueIdFragment), (CoroutineContext) null, (setRandomHost) null, creditCardIssueIdFragment.new onExtraCallback(baseRoundCornerProgressBar1OnRelationshipValidationResult, calendar, str, null), 3, (Object) null);
            }
        }
        return null;
    }

    private final String onActivityResized() {
        Editable text;
        String strReplace$default;
        int i = 2 % 2;
        int i2 = access000 + 33;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getInterfaceDescriptor().getEditText();
            obj.hashCode();
            throw null;
        }
        EditText editText = getInterfaceDescriptor().getEditText();
        if (editText == null || (text = editText.getText()) == null) {
            return "";
        }
        int i3 = access000 + 13;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String string = text.toString();
        if (string == null || (strReplace$default = StringsKt.replace$default(string, ".", "", false, 4, (Object) null)) == null) {
            return "";
        }
        int i5 = access000 + 25;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return strReplace$default;
        }
        throw null;
    }

    private static final void onNavigationEvent(CreditCardIssueIdFragment creditCardIssueIdFragment, ConstraintLayout constraintLayout) {
        EditText editText;
        int i = 2 % 2;
        int i2 = access000 + 75;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            if (!creditCardIssueIdFragment.isAdded() || creditCardIssueIdFragment.getView() == null) {
                return;
            }
            constraintLayout.getWindowVisibleDisplayFrame(new Rect());
            if (r8 - r1.bottom > creditCardIssueIdFragment.getResources().getDisplayMetrics().heightPixels * 0.25d) {
                int i3 = access000 + 65;
                asBinder = i3 % 128;
                if (i3 % 2 != 0) {
                    editText = creditCardIssueIdFragment.getInterfaceDescriptor().getEditText();
                    int i4 = 91 / 0;
                    if (editText == null) {
                        return;
                    }
                } else {
                    editText = creditCardIssueIdFragment.getInterfaceDescriptor().getEditText();
                    if (editText == null) {
                        return;
                    }
                }
                editText.getBottom();
                EditText editText2 = creditCardIssueIdFragment.getInterfaceDescriptor().getEditText();
                if (editText2 != null) {
                    editText2.post(new CreditCardIssueIdFragment$.ExternalSyntheticLambda1(creditCardIssueIdFragment));
                    return;
                }
                return;
            }
            return;
        }
        creditCardIssueIdFragment.isAdded();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(CreditCardIssueIdFragment creditCardIssueIdFragment) {
        int i = 2 % 2;
        if (!creditCardIssueIdFragment.isAdded()) {
            return;
        }
        int i2 = asBinder + 59;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (creditCardIssueIdFragment.getView() != null) {
            int i4 = access000 + 87;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            creditCardIssueIdFragment.asBinder().IAuthTabCallbackDefault.smoothScrollTo(0, creditCardIssueIdFragment.asBinder().IAuthTabCallbackDefault.getBottom());
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        final CreditCardIssueIdFragment creditCardIssueIdFragment = (CreditCardIssueIdFragment) objArr[0];
        int i = 2 % 2;
        final ConstraintLayout root = creditCardIssueIdFragment.asBinder().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        creditCardIssueIdFragment.onWarmupCompleted = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.id.manual.CreditCardIssueIdFragment$$ExternalSyntheticLambda3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                CreditCardIssueIdFragment.onWarmupCompleted(this.f$0, root);
            }
        };
        root.getViewTreeObserver().addOnGlobalLayoutListener(creditCardIssueIdFragment.onWarmupCompleted);
        int i2 = access000 + 9;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 75 / 0;
        }
        return null;
    }

    public void onDestroyView() {
        int i = 2 % 2;
        super.onDestroyView();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.onWarmupCompleted;
        if (onGlobalLayoutListener != null) {
            int i2 = asBinder + 49;
            access000 = i2 % 128;
            if (i2 % 2 != 0) {
                asBinder().getRoot().getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            } else {
                asBinder().getRoot().getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
                throw null;
            }
        }
        this.onWarmupCompleted = null;
        int i3 = access000 + 105;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditCardIssueIdFragment creditCardIssueIdFragment, String str, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        return (Unit) onWarmupCompleted(1543178291, -1543178281, iOnWarmupCompleted, ACPayResult.onWarmupCompleted(), new Object[]{creditCardIssueIdFragment, str, setDetectableSize}, iOnWarmupCompleted3, iOnWarmupCompleted2);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditCardIssueIdFragment creditCardIssueIdFragment, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        return (Unit) onWarmupCompleted(-44234643, 44234643, iOnWarmupCompleted, ACPayResult.onWarmupCompleted(), new Object[]{creditCardIssueIdFragment, setDetectableSize}, iOnWarmupCompleted3, iOnWarmupCompleted2);
    }

    public static /* synthetic */ void IAuthTabCallback(CreditCardIssueIdFragment creditCardIssueIdFragment, Ref.ObjectRef objectRef, View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {creditCardIssueIdFragment, objectRef, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        onWarmupCompleted(-1797638232, 1797638241, iOnWarmupCompleted, ACPayResult.onWarmupCompleted(), objArr, ACPayResult.onWarmupCompleted(), iOnWarmupCompleted2);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CreditCardIssueIdFragment creditCardIssueIdFragment, Ref.ObjectRef objectRef, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Object[] objArr = {creditCardIssueIdFragment, objectRef, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        onWarmupCompleted(-2120591516, 2120591517, iOnWarmupCompleted, ACPayResult.onWarmupCompleted(), objArr, ACPayResult.onWarmupCompleted(), iOnWarmupCompleted2);
    }

    public static /* synthetic */ boolean IAuthTabCallback(CreditCardIssueIdFragment creditCardIssueIdFragment, TextView textView, int i, KeyEvent keyEvent) {
        Object[] objArr = {creditCardIssueIdFragment, textView, Integer.valueOf(i), keyEvent};
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        return ((Boolean) onWarmupCompleted(315064461, -315064449, iOnWarmupCompleted, ACPayResult.onWarmupCompleted(), objArr, ACPayResult.onWarmupCompleted(), iOnWarmupCompleted2)).booleanValue();
    }

    public static /* synthetic */ void IAuthTabCallback(CreditCardIssueIdFragment creditCardIssueIdFragment, View view) {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        onWarmupCompleted(1424236070, -1424236065, iOnWarmupCompleted, ACPayResult.onWarmupCompleted(), new Object[]{creditCardIssueIdFragment, view}, iOnWarmupCompleted3, iOnWarmupCompleted2);
    }

    public static final /* synthetic */ TextInputLayout onExtraCallbackWithResult(CreditCardIssueIdFragment creditCardIssueIdFragment) {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        return (TextInputLayout) onWarmupCompleted(-1269596538, 1269596544, iOnWarmupCompleted, ACPayResult.onWarmupCompleted(), new Object[]{creditCardIssueIdFragment}, iOnWarmupCompleted3, iOnWarmupCompleted2);
    }

    public static final /* synthetic */ String onExtraCallback(CreditCardIssueIdFragment creditCardIssueIdFragment) {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        return (String) onWarmupCompleted(-402259925, 402259936, iOnWarmupCompleted, ACPayResult.onWarmupCompleted(), new Object[]{creditCardIssueIdFragment}, iOnWarmupCompleted3, iOnWarmupCompleted2);
    }

    public static final /* synthetic */ void IAuthTabCallback(CreditCardIssueIdFragment creditCardIssueIdFragment) {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        onWarmupCompleted(-95191399, 95191401, iOnWarmupCompleted, ACPayResult.onWarmupCompleted(), new Object[]{creditCardIssueIdFragment}, iOnWarmupCompleted3, iOnWarmupCompleted2);
    }

    private final void IAuthTabCallbackDefault() {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        onWarmupCompleted(1413520340, -1413520337, iOnWarmupCompleted, ACPayResult.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted3, iOnWarmupCompleted2);
    }

    private static final void onExtraCallback(CreditCardIssueIdFragment creditCardIssueIdFragment, Ref.ObjectRef<View.OnLayoutChangeListener> objectRef) {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        onWarmupCompleted(420656333, -420656325, iOnWarmupCompleted, ACPayResult.onWarmupCompleted(), new Object[]{creditCardIssueIdFragment, objectRef}, iOnWarmupCompleted3, iOnWarmupCompleted2);
    }

    private final Unit onMessageChannelReady() {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        return (Unit) onWarmupCompleted(-90239392, 90239399, iOnWarmupCompleted, ACPayResult.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted3, iOnWarmupCompleted2);
    }

    private final void IAuthTabCallback(String str) {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        onWarmupCompleted(-1377977038, 1377977042, iOnWarmupCompleted, ACPayResult.onWarmupCompleted(), new Object[]{this, str}, iOnWarmupCompleted3, iOnWarmupCompleted2);
    }

    static void onNavigationEvent() {
        IAuthTabCallbackDefault = 7798559133331975163L;
        IAuthTabCallbackStub = -1776194565;
        onTransact = (char) 20188;
    }
}
