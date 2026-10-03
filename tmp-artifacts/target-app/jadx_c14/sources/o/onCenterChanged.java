package o;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgc;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.featurescommon.companysearch.model.CompanyInfo;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanFunnelType;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class onCenterChanged {
    public static final onCenterChanged IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static boolean onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    public static final int onNavigationEvent;
    private static long onTransact;
    private static char[] onWarmupCompleted;
    private static final byte[] $$a = {93, 49, 76, -114};
    private static final int $$b = 39;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 0;

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[LoanFunnelType.values().length];
            try {
                iArr[LoanFunnelType.MANUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoanFunnelType.BUSINESS_NTS_SCRAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoanFunnelType.HEALTH_INSURANCE_SCRAPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, int r8) {
        /*
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = o.onCenterChanged.$$a
            int r8 = r8 * 4
            int r8 = 97 - r8
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onCenterChanged.$$c(short, short, int):java.lang.String");
    }

    static {
        IAuthTabCallbackDefault = 1;
        onActivityResized();
        IAuthTabCallback = new onCenterChanged();
        onNavigationEvent = 8;
        int i = asInterface + 109;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 24 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~((~i4) | i7 | i3);
        int i9 = ~i3;
        int i10 = (~(i7 | i4)) | (~(i7 | i9)) | (~(i9 | i4));
        int i11 = (~(i9 | i6)) | i4;
        int i12 = i6 + i4 + i + ((-946781377) * i2) + ((-59450693) * i5);
        int i13 = i12 * i12;
        int i14 = (((-143250568) * i6) - 346488832) + (357422218 * i4) + (i8 * (-1897147255)) + ((-1897147255) * i10) + (1897147255 * i11) + ((-2040397824) * i) + ((-1205993472) * i2) + ((-1651113984) * i5) + ((-884408320) * i13);
        int i15 = ((i6 * 358501064) - 1042343473) + (i4 * 358500518) + (i8 * (-273)) + (i10 * (-273)) + (i11 * 273) + (i * 358500791) + (i2 * (-249165559)) + (i5 * 1905372845) + (i13 * 573505536);
        switch (i14 + (i15 * i15 * (-553189376))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                int i16 = 2 % 2;
                int i17 = IAuthTabCallbackStub + 107;
                asBinder = i17 % 128;
                int i18 = i17 % 2;
                boolean zOnExtraCallback = addPolicy.ITrustedWebActivityCallback_Parcel().onExtraCallback("carMortgageLoan", false);
                int i19 = IAuthTabCallbackStub + 95;
                asBinder = i19 % 128;
                int i20 = i19 % 2;
                return Boolean.valueOf(zOnExtraCallback);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return getInterfaceDescriptor(objArr);
            case 12:
                return IAuthTabCallbackStubProxy(objArr);
            case 13:
                return access000(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    private onCenterChanged() {
    }

    public final void readTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("verifyTs");
            addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("agreeTermsTime");
            addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("authSmsTime");
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, -95608122, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 95608124, new Object[]{this, true});
        } else {
            addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("verifyTs");
            addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("agreeTermsTime");
            addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("authSmsTime");
            int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, -95608122, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 95608124, new Object[]{this, false});
        }
        int i3 = asBinder + 51;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = asBinder + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent("byPreviousData", zBooleanValue);
        int i4 = asBinder + 39;
        IAuthTabCallbackStub = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = addPolicy.ITrustedWebActivityCallback_Parcel().onExtraCallback("byPreviousData", false);
        int i4 = IAuthTabCallbackStub + 25;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (!onNavigationEvent()) {
            return false;
        }
        int i4 = IAuthTabCallbackStub + 87;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            IAuthTabCallback_Parcel().length();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (IAuthTabCallback_Parcel().length() <= 0) {
            return false;
        }
        int i5 = asBinder + 49;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        LoanFunnelType loanFunnelType = (LoanFunnelType) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(loanFunnelType, "");
            addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent("loanComparisonScreenType", loanFunnelType.name());
            int i3 = 25 / 0;
        } else {
            Intrinsics.checkNotNullParameter(loanFunnelType, "");
            addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent("loanComparisonScreenType", loanFunnelType.name());
        }
        int i4 = IAuthTabCallbackStub + 61;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
      0x0021: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v7 java.lang.String) binds: [B:8:0x001f, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.loan.LoanFunnelType access000() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.onCenterChanged.asBinder
            int r1 = r1 + 119
            int r2 = r1 % 128
            o.onCenterChanged.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            java.lang.String r2 = "loanComparisonScreenType"
            if (r1 == 0) goto L1b
            java.lang.String r1 = r4.IAuthTabCallback(r2)
            r2 = 95
            int r2 = r2 / 0
            if (r1 == 0) goto L38
            goto L21
        L1b:
            java.lang.String r1 = r4.IAuthTabCallback(r2)
            if (r1 == 0) goto L38
        L21:
            viva.republica.toss.network.model.loan.LoanFunnelType r1 = viva.republica.toss.network.model.loan.LoanFunnelType.valueOf(r1)
            if (r1 == 0) goto L38
            int r2 = o.onCenterChanged.IAuthTabCallbackStub
            int r2 = r2 + 105
            int r3 = r2 % 128
            o.onCenterChanged.asBinder = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L33
            return r1
        L33:
            r0 = 0
            r0.hashCode()
            throw r0
        L38:
            viva.republica.toss.network.model.loan.LoanFunnelType r0 = viva.republica.toss.network.model.loan.LoanFunnelType.MANUAL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onCenterChanged.access000():viva.republica.toss.network.model.loan.LoanFunnelType");
    }

    public final void onExtraCallback(long j) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent("agreeTermsTime", j);
            throw null;
        }
        addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent("agreeTermsTime", j);
        int i3 = asBinder + 63;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    public final long extraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        long jOnExtraCallback = addPolicy.ITrustedWebActivityCallback_Parcel().onExtraCallback("agreeTermsTime", zzaj.onWarmupCompleted().IAuthTabCallbackDefault());
        int i4 = asBinder + 85;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return jOnExtraCallback;
    }

    public final void onNavigationEvent(long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent("authSmsTime", j);
        int i4 = IAuthTabCallbackStub + 111;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        long jOnExtraCallback = addPolicy.ITrustedWebActivityCallback_Parcel().onExtraCallback("authSmsTime", zzaj.onWarmupCompleted().IAuthTabCallbackDefault());
        int i4 = asBinder + 67;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return Long.valueOf(jOnExtraCallback);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r30, int r31, char r32, java.lang.Object[] r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onCenterChanged.a(int, int, char, java.lang.Object[]):void");
    }

    public final void onTransact(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent("verifyTs", str);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent("verifyTs", str);
            throw null;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 61;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback_Parcel = addPolicy.ITrustedWebActivityCallback_Parcel();
        Object[] objArr2 = new Object[1];
        a(Drawable.resolveOpacity(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 16, (char) ((Process.myTid() >> 22) + 43882), objArr2);
        textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback_Parcel.onNavigationEvent(((String) objArr2[0]).intern(), str);
        int i4 = asBinder + 117;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return null;
    }

    public final String IAuthTabCallback_Parcel() throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback_Parcel = addPolicy.ITrustedWebActivityCallback_Parcel();
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, ((byte) KeyEvent.getModifierMetaStateMask()) + 18, (char) (43882 - TextUtils.getOffsetAfter("", 0)), objArr);
        String strOnExtraCallbackWithResult = textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback_Parcel.onExtraCallbackWithResult(((String) objArr[0]).intern(), "");
        int i4 = IAuthTabCallbackStub + 97;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    public final void IAuthTabCallbackDefault(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onWarmupCompleted("jobType", str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        onWarmupCompleted("jobType", str);
        int i3 = IAuthTabCallbackStub + 17;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = IAuthTabCallback("jobType");
        int i4 = asBinder + 9;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }

    public final void asInterface(boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (z) {
            IAuthTabCallbackDefault(onPreviewReleased.SELF_BUSINESS.getCode());
            int i4 = IAuthTabCallbackStub + 3;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
        addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent("previousRequestIsBusiness", z);
    }

    public final void onExtraCallbackWithResult(@Nullable CompanyInfo companyInfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 27;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (companyInfo != null) {
            onWarmupCompleted("corporateName", companyInfo.asBinder());
            onWarmupCompleted("corporateZipCode", companyInfo.IAuthTabCallbackStubProxy());
            onWarmupCompleted("corporateNumber", companyInfo.onWarmupCompleted());
            onWarmupCompleted("corporateAddress", companyInfo.onNavigationEvent());
            onWarmupCompleted("corporateTelephone", (String) CompanyInfo.onExtraCallback(667353088, new Object[]{companyInfo}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -667353086, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent()));
            return;
        }
        int i5 = i2 + 33;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted("corporateName", "");
        onWarmupCompleted("corporateNumber", "");
        onWarmupCompleted("corporateAddress", "");
        onWarmupCompleted("corporateZipCode", "");
        onWarmupCompleted("corporateTelephone", "");
    }

    public final void IAuthTabCallbackStub(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent("carNumber", str);
        int i4 = asBinder + 33;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = addPolicy.ITrustedWebActivityCallback_Parcel().onExtraCallbackWithResult("carNumber", "");
        if (onExtraCallbackWithResult(strOnExtraCallbackWithResult)) {
            return strOnExtraCallbackWithResult;
        }
        int i4 = asBinder + 85;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = asBinder + 51;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent("carMortgageLoan", zBooleanValue);
            return null;
        }
        addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent("carMortgageLoan", zBooleanValue);
        int i3 = 15 / 0;
        return null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = addPolicy.ITrustedWebActivityCallback_Parcel().onExtraCallbackWithResult("householderType", "");
        int i4 = asBinder + 105;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return strOnExtraCallbackWithResult;
    }

    public final Triple<Integer, Integer, Integer> IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        Triple<Integer, Integer, Integer> triple = (Triple) onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, -256290407, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 256290419, new Object[]{this, "joinDate"});
        int i4 = asBinder + 89;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return triple;
    }

    public final Triple<Integer, Integer, Integer> access100() {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        Triple<Integer, Integer, Integer> triple = (Triple) onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, -256290407, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 256290419, new Object[]{this, "openDate"});
        int i4 = IAuthTabCallbackStub + 125;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return triple;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = IAuthTabCallback(IAuthTabCallbackStubProxy());
        int i4 = asBinder + 5;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return strIAuthTabCallback;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Triple<Integer, Integer, Integer> tripleAccess100 = access100();
        if (i3 == 0) {
            return IAuthTabCallback(tripleAccess100);
        }
        IAuthTabCallback(tripleAccess100);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final long onActivityLayout() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return addPolicy.ITrustedWebActivityCallback_Parcel().onExtraCallback("lastRequestDate", zzaj.onWarmupCompleted().IAuthTabCallbackDefault());
        }
        addPolicy.ITrustedWebActivityCallback_Parcel().onExtraCallback("lastRequestDate", zzaj.onWarmupCompleted().IAuthTabCallbackDefault());
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        long jOnExtraCallback = addPolicy.ITrustedWebActivityCallback_Parcel().onExtraCallback("lastRequestDateRrn", zzaj.onWarmupCompleted().IAuthTabCallbackDefault());
        int i4 = asBinder + 113;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return Long.valueOf(jOnExtraCallback);
        }
        int i5 = 65 / 0;
        return Long.valueOf(jOnExtraCallback);
    }

    public final void onPostMessage() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent("lastRequestDate", zzaj.onWarmupCompleted().IAuthTabCallbackDefault());
        addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent("lastRequestDateRrn", zzaj.onWarmupCompleted().IAuthTabCallbackDefault());
        int i4 = asBinder + 95;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        o.addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent("automobileInfo", r5);
        r5 = o.onCenterChanged.IAuthTabCallbackStub + 31;
        o.onCenterChanged.asBinder = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        o.addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("automobileInfo");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object asInterface(java.lang.Object[] r5) {
        /*
            r0 = 0
            r1 = r5[r0]
            o.onCenterChanged r1 = (o.onCenterChanged) r1
            r1 = 1
            r5 = r5[r1]
            java.lang.String r5 = (java.lang.String) r5
            r1 = 2
            int r2 = r1 % r1
            int r2 = o.onCenterChanged.IAuthTabCallbackStub
            int r2 = r2 + 89
            int r3 = r2 % 128
            o.onCenterChanged.asBinder = r3
            int r2 = r2 % r1
            r3 = 0
            java.lang.String r4 = "automobileInfo"
            if (r2 != 0) goto L21
            r2 = 11
            int r2 = r2 / r0
            if (r5 != 0) goto L2b
            goto L23
        L21:
            if (r5 != 0) goto L2b
        L23:
            o.TextRoundCornerProgressBarSavedState1 r5 = o.addPolicy.ITrustedWebActivityCallback_Parcel()
            r5.onTransact(r4)
            return r3
        L2b:
            o.TextRoundCornerProgressBarSavedState1 r0 = o.addPolicy.ITrustedWebActivityCallback_Parcel()
            r0.onNavigationEvent(r4, r5)
            int r5 = o.onCenterChanged.IAuthTabCallbackStub
            int r5 = r5 + 31
            int r0 = r5 % 128
            o.onCenterChanged.asBinder = r0
            int r5 = r5 % r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onCenterChanged.asInterface(java.lang.Object[]):java.lang.Object");
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = addPolicy.ITrustedWebActivityCallback_Parcel().onExtraCallbackWithResult("automobileInfo", "");
        int i4 = asBinder + 37;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnExtraCallbackWithResult;
        }
        throw null;
    }

    public final SubsamplingScaleImageViewDefaultOnStateChangedListener IAuthTabCallbackDefault() throws Throwable {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback_Parcel;
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback_Parcel = addPolicy.ITrustedWebActivityCallback_Parcel();
            Object[] objArr = new Object[1];
            a(5 % Drawable.resolveOpacity(1, 1), 104 % View.MeasureSpec.makeMeasureSpec(0, 1), (char) (ViewConfiguration.getMinimumFlingVelocity() << 23), objArr);
            obj = objArr[0];
        } else {
            textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback_Parcel = addPolicy.ITrustedWebActivityCallback_Parcel();
            Object[] objArr2 = new Object[1];
            a(17 - Drawable.resolveOpacity(0, 0), 23 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
            obj = objArr2[0];
        }
        SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListener = (SubsamplingScaleImageViewDefaultOnStateChangedListener) textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback_Parcel.onNavigationEvent(((String) obj).intern(), SubsamplingScaleImageViewDefaultOnStateChangedListener.class, (Object) null);
        int i3 = IAuthTabCallbackStub + 111;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 95 / 0;
        }
        return subsamplingScaleImageViewDefaultOnStateChangedListener;
    }

    public static /* synthetic */ void onNavigationEvent(onCenterChanged oncenterchanged, boolean z, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 51;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 41;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        oncenterchanged.onExtraCallback(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r1
      0x003d: PHI (r1v6 java.util.Date) = (r1v5 java.util.Date), (r1v15 java.util.Date) binds: [B:8:0x003b, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onExtraCallback(boolean r23) throws java.lang.Throwable {
        /*
            r22 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.onCenterChanged.asBinder
            int r1 = r1 + 81
            int r2 = r1 % 128
            o.onCenterChanged.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L26
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            o.onCenterChanged r2 = o.onCenterChanged.IAuthTabCallback
            long r2 = r2.onActivityLayout()
            r1.setTimeInMillis(r2)
            r2 = 4
            r1.add(r0, r2)
            java.util.Date r1 = r1.getTime()
            if (r23 != 0) goto L48
            goto L3d
        L26:
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            o.onCenterChanged r2 = o.onCenterChanged.IAuthTabCallback
            long r2 = r2.onActivityLayout()
            r1.setTimeInMillis(r2)
            r2 = 3
            r1.add(r0, r2)
            java.util.Date r1 = r1.getTime()
            if (r23 != 0) goto L48
        L3d:
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            boolean r1 = r1.before(r2)
            if (r1 == 0) goto L91
        L48:
            o.ConvertFloatArrayToByteArray r1 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            java.lang.String r3 = "LoanComparisonPrefs"
            java.lang.String r4 = "Should Remove Comparison Data"
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r11)
            r12 = 60
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r2 = r1
            java.lang.Object[] r16 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            int r19 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult()
            int r14 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult()
            int r17 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult()
            int r18 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult()
            r20 = -154777398(0xfffffffff6c648ca, float:-2.010842E33)
            r21 = 154777398(0x939b736, float:2.235471E-33)
            r13 = r21
            r15 = r20
            o.ConvertFloatArrayToByteArray.IAuthTabCallback(r13, r14, r15, r16, r17, r18, r19)
            boolean r2 = o.onCenterChanged.onExtraCallbackWithResult
            r13 = 0
            if (r2 == 0) goto L96
            int r2 = o.onCenterChanged.IAuthTabCallbackStub
            int r2 = r2 + 83
            int r3 = r2 % 128
            o.onCenterChanged.asBinder = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L92
            if (r23 != 0) goto L96
        L91:
            return
        L92:
            r13.hashCode()
            throw r13
        L96:
            java.lang.String r3 = "LoanComparisonPrefs"
            java.lang.String r4 = "Will Remove Comparison Important Data"
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r2 = r1
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            int r8 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult()
            int r3 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult()
            int r6 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult()
            int r7 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult()
            r2 = r21
            r4 = r20
            o.ConvertFloatArrayToByteArray.IAuthTabCallback(r2, r3, r4, r5, r6, r7, r8)
            r1 = 1
            o.onCenterChanged.onExtraCallbackWithResult = r1
            o.TextRoundCornerProgressBarSavedState1 r1 = o.addPolicy.ITrustedWebActivityCallback_Parcel()
            java.lang.String r2 = "lastRequestDate"
            r1.onTransact(r2)
            r22.onMinimized()
            int r1 = o.onCenterChanged.IAuthTabCallbackStub
            int r1 = r1 + 63
            int r2 = r1 % 128
            o.onCenterChanged.asBinder = r2
            int r1 = r1 % r0
            if (r1 == 0) goto Ldd
            return
        Ldd:
            r13.hashCode()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onCenterChanged.onExtraCallback(boolean):void");
    }

    public static /* synthetic */ void onWarmupCompleted(onCenterChanged oncenterchanged, boolean z, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = IAuthTabCallbackStub + 67;
            int i4 = i3 % 128;
            asBinder = i4;
            z = i3 % 2 == 0;
            int i5 = i4 + 41;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        }
        oncenterchanged.IAuthTabCallback(z);
    }

    public final void IAuthTabCallback(boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Calendar calendar = Calendar.getInstance();
        Object[] objArr = {IAuthTabCallback};
        calendar.setTimeInMillis(((Long) onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -273953583, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 273953593, objArr)).longValue());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(zzaj.onWarmupCompleted().IAuthTabCallbackDefault());
        if (z || calendar.get(6) != calendar2.get(6)) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, "LoanComparisonPrefs", "Should Remove Comparison Important Data", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
            if (!onExtraCallback || z) {
                int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
                ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, "LoanComparisonPrefs", "Will Remove Comparison Important Data", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
                onExtraCallback = true;
                addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("lastRequestDateRrn");
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback_Parcel = addPolicy.ITrustedWebActivityCallback_Parcel();
                Object[] objArr2 = new Object[1];
                a(TextUtils.indexOf("", "", 0, 0), 16 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (43881 - ((byte) KeyEvent.getModifierMetaStateMask())), objArr2);
                textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback_Parcel.onTransact(((String) objArr2[0]).intern());
                addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("loanScrapedData");
                addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("automobileInfo");
                int i4 = IAuthTabCallbackStub + 57;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }
        }
    }

    public final void IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("employeeType");
        Iterator<T> it = asBinder("joinDate").iterator();
        while (it.hasNext()) {
            addPolicy.ITrustedWebActivityCallback_Parcel().onTransact((String) it.next());
        }
        addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("businessType");
        Iterator<T> it2 = asBinder("openDate").iterator();
        while (it2.hasNext()) {
            int i2 = asBinder + 75;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            addPolicy.ITrustedWebActivityCallback_Parcel().onTransact((String) it2.next());
            int i4 = asBinder + 99;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("noIncome");
        addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("salary");
        addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("corporateName");
        addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("corporateNumber");
        addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("jobType");
        addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("carMortgageLoan");
        addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("carNumber");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback_Parcel = addPolicy.ITrustedWebActivityCallback_Parcel();
        Object[] objArr = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0) + 18, 23 - View.resolveSizeAndState(0, 0, 0), (char) ((-1) - Process.getGidForName("")), objArr);
        textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback_Parcel.onTransact(((String) objArr[0]).intern());
        int i6 = asBinder + 47;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    private final void onMinimized() throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback_Parcel = addPolicy.ITrustedWebActivityCallback_Parcel();
        Object[] objArr = new Object[1];
        a(1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 17, (char) (TextUtils.indexOf((CharSequence) "", '0') + 43883), objArr);
        textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback_Parcel.onTransact(((String) objArr[0]).intern());
        addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("corporateAddress");
        addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("corporateTelephone");
        addPolicy.ITrustedWebActivityCallback_Parcel().onTransact("corporateZipCode");
        int i4 = asBinder + 105;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallbackWithResult(@NotNull SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListener) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(subsamplingScaleImageViewDefaultOnStateChangedListener, "");
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback_Parcel = addPolicy.ITrustedWebActivityCallback_Parcel();
            Object[] objArr = new Object[1];
            a(ExpandableListView.getPackedPositionChild(0L) + 18, 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) View.MeasureSpec.getSize(0), objArr);
            textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback_Parcel.IAuthTabCallback(((String) objArr[0]).intern(), subsamplingScaleImageViewDefaultOnStateChangedListener);
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        onCenterChanged oncenterchanged = (onCenterChanged) objArr[0];
        zzag zzagVarOnWarmupCompleted = (zzag) objArr[1];
        String strIAuthTabCallback_Parcel = (String) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        asBinder = i2 % 128;
        if (i2 % 2 != 0 ? (iIntValue & 1) != 0 : (iIntValue & 1) != 0) {
            zzagVarOnWarmupCompleted = zzaj.onWarmupCompleted();
            int i3 = IAuthTabCallbackStub + 115;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((iIntValue & 2) != 0) {
            strIAuthTabCallback_Parcel = oncenterchanged.IAuthTabCallback_Parcel();
        }
        return oncenterchanged.onExtraCallback(zzagVarOnWarmupCompleted, strIAuthTabCallback_Parcel);
    }

    public final ImagePipelineExperimentsBuilderExternalSyntheticLambda10 onExtraCallback(@NotNull zzag zzagVar, @NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(zzagVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        try {
            SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListenerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            if (subsamplingScaleImageViewDefaultOnStateChangedListenerIAuthTabCallbackDefault == null) {
                int i2 = asBinder + 75;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 == 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            if (access000() != LoanFunnelType.HEALTH_INSURANCE_SCRAPE && !(!StringsKt.isBlank(str))) {
                return null;
            }
            ImagePipelineExperimentsBuilderExternalSyntheticLambda10 imagePipelineExperimentsBuilderExternalSyntheticLambda10 = new ImagePipelineExperimentsBuilderExternalSyntheticLambda10(subsamplingScaleImageViewDefaultOnStateChangedListenerIAuthTabCallbackDefault.onExtraCallback((String) SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(897511236, -897511227, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{subsamplingScaleImageViewDefaultOnStateChangedListenerIAuthTabCallbackDefault}), zzagVar, str));
            int i3 = IAuthTabCallbackStub + 119;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                return imagePipelineExperimentsBuilderExternalSyntheticLambda10;
            }
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "createPreScreenDataFromFile", e.getMessage(), (Throwable) null, (Map) null, 12, (Object) null);
            return null;
        }
    }

    public final void onExtraCallback(@NotNull SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListener) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(subsamplingScaleImageViewDefaultOnStateChangedListener, "");
        onCenterChanged oncenterchanged = IAuthTabCallback;
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        oncenterchanged.IAuthTabCallbackDefault((String) SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(897511236, -897511227, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{subsamplingScaleImageViewDefaultOnStateChangedListener}));
        Long lExtraCallback = subsamplingScaleImageViewDefaultOnStateChangedListener.extraCallback();
        if (lExtraCallback != null) {
            oncenterchanged.onNavigationEvent(lExtraCallback.longValue());
            int i4 = asBinder + 13;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 5;
            }
        }
        Long typedObject = subsamplingScaleImageViewDefaultOnStateChangedListener.readTypedObject();
        if (typedObject != null) {
            int i6 = asBinder + 105;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            oncenterchanged.onExtraCallback(typedObject.longValue());
        }
        Object[] objArr = {oncenterchanged, Boolean.valueOf(subsamplingScaleImageViewDefaultOnStateChangedListener.onTransact())};
        onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -240811287, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 240811288, objArr);
        oncenterchanged.onWarmupCompleted("carNumber", subsamplingScaleImageViewDefaultOnStateChangedListener.onExtraCallback());
        oncenterchanged.onWarmupCompleted("healthPayerType", subsamplingScaleImageViewDefaultOnStateChangedListener.IAuthTabCallbackStub());
        oncenterchanged.onWarmupCompleted("householderType", subsamplingScaleImageViewDefaultOnStateChangedListener.IAuthTabCallback_Parcel());
    }

    public final void IAuthTabCallback(@NotNull SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(subsamplingScaleImageViewDefaultOnStateChangedListener, "");
        onCenterChanged oncenterchanged = IAuthTabCallback;
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        oncenterchanged.IAuthTabCallbackDefault((String) SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(897511236, -897511227, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{subsamplingScaleImageViewDefaultOnStateChangedListener}));
        Long lExtraCallback = subsamplingScaleImageViewDefaultOnStateChangedListener.extraCallback();
        if (lExtraCallback != null) {
            int i4 = IAuthTabCallbackStub + 117;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                oncenterchanged.onNavigationEvent(lExtraCallback.longValue());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            oncenterchanged.onNavigationEvent(lExtraCallback.longValue());
        }
        Long typedObject = subsamplingScaleImageViewDefaultOnStateChangedListener.readTypedObject();
        if (typedObject != null) {
            int i5 = asBinder + 29;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            oncenterchanged.onExtraCallback(typedObject.longValue());
        }
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        oncenterchanged.onWarmupCompleted("employeeType", (String) SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(364069555, -364069548, iOnExtraCallbackWithResult3, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, new Object[]{subsamplingScaleImageViewDefaultOnStateChangedListener}));
        oncenterchanged.onWarmupCompleted("businessType", subsamplingScaleImageViewDefaultOnStateChangedListener.onExtraCallbackWithResult());
        oncenterchanged.onWarmupCompleted("ci", subsamplingScaleImageViewDefaultOnStateChangedListener.IAuthTabCallback());
        oncenterchanged.onExtraCallbackWithResult("joinDate", subsamplingScaleImageViewDefaultOnStateChangedListener.access000());
        oncenterchanged.onExtraCallbackWithResult("openDate", subsamplingScaleImageViewDefaultOnStateChangedListener.writeTypedObject());
        oncenterchanged.onWarmupCompleted("salary", subsamplingScaleImageViewDefaultOnStateChangedListener.ICustomTabsCallback());
        oncenterchanged.onWarmupCompleted("corporateName", subsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent());
        oncenterchanged.onWarmupCompleted("corporateNumber", subsamplingScaleImageViewDefaultOnStateChangedListener.IAuthTabCallbackDefault());
        Object[] objArr = {oncenterchanged, Boolean.valueOf(subsamplingScaleImageViewDefaultOnStateChangedListener.onTransact())};
        onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -240811287, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 240811288, objArr);
        oncenterchanged.onWarmupCompleted("carNumber", subsamplingScaleImageViewDefaultOnStateChangedListener.onExtraCallback());
        oncenterchanged.onWarmupCompleted("noIncome", String.valueOf(subsamplingScaleImageViewDefaultOnStateChangedListener.getInterfaceDescriptor()));
        int iOnExtraCallbackWithResult5 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        Object[] objArr2 = {oncenterchanged, (String) SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(2037626876, -2037626871, iOnExtraCallbackWithResult5, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, new Object[]{subsamplingScaleImageViewDefaultOnStateChangedListener})};
        onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -370346253, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 370346258, objArr2);
        oncenterchanged.onWarmupCompleted("healthPayerType", subsamplingScaleImageViewDefaultOnStateChangedListener.IAuthTabCallbackStub());
        oncenterchanged.onWarmupCompleted("householderType", subsamplingScaleImageViewDefaultOnStateChangedListener.IAuthTabCallback_Parcel());
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        onCenterChanged oncenterchanged = (onCenterChanged) objArr[0];
        int i = 2 % 2;
        Date date = new Date(zzaj.onWarmupCompleted().IAuthTabCallbackDefault());
        Date dateOnUnminimized = oncenterchanged.onUnminimized();
        if (dateOnUnminimized == null) {
            int i2 = asBinder + 45;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        boolean z = !dateOnUnminimized.before(zzan.onExtraCallbackWithResult(date, -1));
        int i4 = asBinder + 57;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(z);
    }

    public static /* synthetic */ boolean onExtraCallback(onCenterChanged oncenterchanged, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = IAuthTabCallbackStub + 9;
            int i4 = i3 % 128;
            asBinder = i4;
            z = i3 % 2 != 0;
            int i5 = i4 + 75;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        }
        return oncenterchanged.onExtraCallbackWithResult(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (onWarmupCompleted() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (onWarmupCompleted() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onExtraCallbackWithResult(boolean r14) {
        /*
            r13 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.onCenterChanged.IAuthTabCallbackStub
            int r1 = r1 + 99
            int r2 = r1 % 128
            o.onCenterChanged.asBinder = r2
            int r1 = r1 % r0
            r1 = 1
            r3 = 0
            if (r14 == 0) goto L2a
            int r2 = r2 + 101
            int r14 = r2 % 128
            o.onCenterChanged.IAuthTabCallbackStub = r14
            int r2 = r2 % r0
            if (r2 == 0) goto L23
            boolean r14 = r13.onWarmupCompleted()
            r2 = 73
            int r2 = r2 / r3
            if (r14 == 0) goto L2a
            goto L29
        L23:
            boolean r14 = r13.onWarmupCompleted()
            if (r14 == 0) goto L2a
        L29:
            return r1
        L2a:
            java.util.Date r14 = new java.util.Date
            o.zzag r2 = o.zzaj.onWarmupCompleted()
            long r4 = r2.IAuthTabCallbackDefault()
            r14.<init>(r4)
            java.util.Date r2 = r13.onUnminimized()
            if (r2 != 0) goto L3e
            return r3
        L3e:
            o.SubsamplingScaleImageViewDefaultOnStateChangedListener r4 = r13.IAuthTabCallbackDefault()
            r5 = 0
            if (r4 != 0) goto L55
            int r14 = o.onCenterChanged.IAuthTabCallbackStub
            int r14 = r14 + 79
            int r1 = r14 % 128
            o.onCenterChanged.asBinder = r1
            int r14 = r14 % r0
            if (r14 == 0) goto L51
            return r3
        L51:
            r5.hashCode()
            throw r5
        L55:
            r4 = -1
            java.util.Date r14 = o.zzan.onExtraCallbackWithResult(r14, r4)
            boolean r14 = r2.before(r14)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r12 = new java.lang.Object[]{r13, r5, r5, r2, r5}
            int r8 = im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback()
            int r6 = im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback()
            int r7 = im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback()
            int r10 = im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback()
            r11 = -2055830187(0xffffffff85768555, float:-1.15913536E-35)
            r9 = 2055830191(0x7a897aaf, float:3.569165E35)
            java.lang.Object r2 = onExtraCallbackWithResult(r6, r7, r8, r9, r10, r11, r12)
            o.ImagePipelineExperimentsBuilderExternalSyntheticLambda10 r2 = (o.ImagePipelineExperimentsBuilderExternalSyntheticLambda10) r2
            if (r2 != 0) goto L86
            return r3
        L86:
            o.ImagePipelineExperimentsBuilderExternalSyntheticLambda12 r2 = r2.onExtraCallback()
            if (r14 != 0) goto Lbc
            java.lang.Object[] r10 = new java.lang.Object[]{r13, r2}
            int r6 = im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback()
            int r4 = im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback()
            int r5 = im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback()
            int r8 = im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback()
            r9 = -1653807892(0xffffffff9d6ce4ec, float:-3.135269E-21)
            r7 = 1653807895(0x62931b17, float:1.3568117E21)
            java.lang.Object r14 = onExtraCallbackWithResult(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto Lbc
            int r14 = o.onCenterChanged.asBinder
            int r14 = r14 + 89
            int r2 = r14 % 128
            o.onCenterChanged.IAuthTabCallbackStub = r2
            int r14 = r14 % r0
            return r1
        Lbc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onCenterChanged.onExtraCallbackWithResult(boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a A[PHI: r4
      0x002a: PHI (r4v7 viva.republica.toss.network.model.loan.LoanFunnelType) = 
      (r4v4 viva.republica.toss.network.model.loan.LoanFunnelType)
      (r4v10 viva.republica.toss.network.model.loan.LoanFunnelType)
     binds: [B:8:0x0026, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallback(java.lang.Object[] r6) {
        /*
            r0 = 0
            r1 = r6[r0]
            o.onCenterChanged r1 = (o.onCenterChanged) r1
            r2 = 1
            r6 = r6[r2]
            o.ImagePipelineExperimentsBuilderExternalSyntheticLambda12 r6 = (o.ImagePipelineExperimentsBuilderExternalSyntheticLambda12) r6
            r3 = 2
            int r4 = r3 % r3
            int r4 = o.onCenterChanged.asBinder
            int r4 = r4 + 85
            int r5 = r4 % 128
            o.onCenterChanged.IAuthTabCallbackStub = r5
            int r4 = r4 % r3
            if (r4 == 0) goto L22
            viva.republica.toss.network.model.loan.LoanFunnelType r4 = r6.writeTypedObject()
            r5 = 22
            int r5 = r5 / r0
            if (r4 != 0) goto L2a
            goto L28
        L22:
            viva.republica.toss.network.model.loan.LoanFunnelType r4 = r6.writeTypedObject()
            if (r4 != 0) goto L2a
        L28:
            r4 = -1
            goto L32
        L2a:
            int[] r5 = o.onCenterChanged.onExtraCallback.IAuthTabCallback
            int r4 = r4.ordinal()
            r4 = r5[r4]
        L32:
            if (r4 == r2) goto L56
            int r2 = o.onCenterChanged.IAuthTabCallbackStub
            int r2 = r2 + 105
            int r5 = r2 % 128
            o.onCenterChanged.asBinder = r5
            int r2 = r2 % r3
            if (r2 != 0) goto L43
            r2 = 4
            if (r4 == r2) goto L4d
            goto L45
        L43:
            if (r4 == r3) goto L4d
        L45:
            r2 = 3
            if (r4 == r2) goto L4d
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L4d:
            boolean r6 = r1.IAuthTabCallbackStub(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L56:
            boolean r6 = r1.IAuthTabCallback(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onCenterChanged.IAuthTabCallback(java.lang.Object[]):java.lang.Object");
    }

    private final boolean IAuthTabCallback(ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            if (imagePipelineExperimentsBuilderExternalSyntheticLambda12.IAuthTabCallbackStub() != null && imagePipelineExperimentsBuilderExternalSyntheticLambda12.onTransact() != null) {
                int i3 = IAuthTabCallbackStub + 97;
                asBinder = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 84 / 0;
                    if (onWarmupCompleted(imagePipelineExperimentsBuilderExternalSyntheticLambda12)) {
                        return true;
                    }
                } else if (onWarmupCompleted(imagePipelineExperimentsBuilderExternalSyntheticLambda12)) {
                    return true;
                }
            }
            int i5 = IAuthTabCallbackStub + 41;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        imagePipelineExperimentsBuilderExternalSyntheticLambda12.IAuthTabCallbackStub();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r4.isJsonObject() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if ((!r4.getAsJsonObject().isEmpty()) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r4 = o.onCenterChanged.IAuthTabCallbackStub + 101;
        r1 = r4 % 128;
        o.onCenterChanged.asBinder = r1;
        r4 = r4 % 2;
        r1 = r1 + 125;
        o.onCenterChanged.IAuthTabCallbackStub = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean IAuthTabCallbackStub(o.ImagePipelineExperimentsBuilderExternalSyntheticLambda12 r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.onCenterChanged.asBinder
            int r1 = r1 + 109
            int r2 = r1 % 128
            o.onCenterChanged.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L19
            com.google.gson.JsonObject r4 = r4.access000()
            r1 = 52
            int r1 = r1 / r2
            if (r4 != 0) goto L30
            goto L1f
        L19:
            com.google.gson.JsonObject r4 = r4.access000()
            if (r4 != 0) goto L30
        L1f:
            int r4 = o.onCenterChanged.IAuthTabCallbackStub
            int r4 = r4 + 101
            int r1 = r4 % 128
            o.onCenterChanged.asBinder = r1
            int r4 = r4 % r0
            int r1 = r1 + 125
            int r4 = r1 % 128
            o.onCenterChanged.IAuthTabCallbackStub = r4
            int r1 = r1 % r0
            return r2
        L30:
            boolean r0 = r4.isJsonObject()
            if (r0 == 0) goto L43
            com.google.gson.JsonObject r4 = r4.getAsJsonObject()
            boolean r4 = r4.isEmpty()
            r0 = 1
            r4 = r4 ^ r0
            if (r4 == 0) goto L43
            return r0
        L43:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onCenterChanged.IAuthTabCallbackStub(o.ImagePipelineExperimentsBuilderExternalSyntheticLambda12):boolean");
    }

    private final boolean onWarmupCompleted(ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12) {
        int i = 2 % 2;
        String strIAuthTabCallbackDefault = imagePipelineExperimentsBuilderExternalSyntheticLambda12.IAuthTabCallbackDefault();
        if (!Intrinsics.areEqual(strIAuthTabCallbackDefault, onPreviewReleased.OFFICE_WORKER.getCode())) {
            if (Intrinsics.areEqual(strIAuthTabCallbackDefault, onPreviewReleased.SELF_BUSINESS.getCode())) {
                return asBinder(imagePipelineExperimentsBuilderExternalSyntheticLambda12);
            }
            if (Intrinsics.areEqual(strIAuthTabCallbackDefault, onPreviewReleased.CIVIL_OFFICER.getCode())) {
                return onNavigationEvent(imagePipelineExperimentsBuilderExternalSyntheticLambda12);
            }
            if (Intrinsics.areEqual(strIAuthTabCallbackDefault, onPreviewReleased.UNEMPLOYED.getCode()) || Intrinsics.areEqual(strIAuthTabCallbackDefault, onPreviewReleased.ETC.getCode())) {
                return true;
            }
            int i2 = IAuthTabCallbackStub + 103;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = asBinder + 65;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return onExtraCallback(imagePipelineExperimentsBuilderExternalSyntheticLambda12);
    }

    private final boolean onExtraCallback(ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12) {
        int i = 2 % 2;
        if (imagePipelineExperimentsBuilderExternalSyntheticLambda12.access100() == null || imagePipelineExperimentsBuilderExternalSyntheticLambda12.IAuthTabCallbackStubProxy() == null || imagePipelineExperimentsBuilderExternalSyntheticLambda12.onWarmupCompleted() == null || imagePipelineExperimentsBuilderExternalSyntheticLambda12.asInterface() == null || imagePipelineExperimentsBuilderExternalSyntheticLambda12.asBinder() == null) {
            return false;
        }
        int i2 = IAuthTabCallbackStub + 121;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 27;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean asBinder(o.ImagePipelineExperimentsBuilderExternalSyntheticLambda12 r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = r5.access100()
            r2 = 0
            if (r1 == 0) goto L4b
            int r1 = o.onCenterChanged.asBinder
            int r1 = r1 + 63
            int r3 = r1 % 128
            o.onCenterChanged.IAuthTabCallbackStub = r3
            int r1 = r1 % r0
            java.lang.String r1 = r5.getInterfaceDescriptor()
            if (r1 == 0) goto L4b
            java.lang.String r1 = r5.onWarmupCompleted()
            if (r1 == 0) goto L4b
            int r1 = o.onCenterChanged.asBinder
            int r1 = r1 + 99
            int r3 = r1 % 128
            o.onCenterChanged.IAuthTabCallbackStub = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L34
            java.lang.String r1 = r5.asInterface()
            r3 = 57
            int r3 = r3 / r2
            if (r1 == 0) goto L4b
            goto L3a
        L34:
            java.lang.String r1 = r5.asInterface()
            if (r1 == 0) goto L4b
        L3a:
            java.lang.String r5 = r5.IAuthTabCallback()
            if (r5 == 0) goto L4b
            int r5 = o.onCenterChanged.IAuthTabCallbackStub
            int r5 = r5 + 89
            int r1 = r5 % 128
            o.onCenterChanged.asBinder = r1
            int r5 = r5 % r0
            r5 = 1
            return r5
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onCenterChanged.asBinder(o.ImagePipelineExperimentsBuilderExternalSyntheticLambda12):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean onNavigationEvent(o.ImagePipelineExperimentsBuilderExternalSyntheticLambda12 r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = r6.access100()
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L42
            int r1 = o.onCenterChanged.IAuthTabCallbackStub
            int r1 = r1 + 49
            int r4 = r1 % 128
            o.onCenterChanged.asBinder = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L1f
            java.lang.String r1 = r6.IAuthTabCallbackStubProxy()
            int r4 = r3 / r3
            if (r1 == 0) goto L42
            goto L25
        L1f:
            java.lang.String r1 = r6.IAuthTabCallbackStubProxy()
            if (r1 == 0) goto L42
        L25:
            java.lang.String r1 = r6.onWarmupCompleted()
            if (r1 == 0) goto L42
            int r1 = o.onCenterChanged.IAuthTabCallbackStub
            int r1 = r1 + 79
            int r4 = r1 % 128
            o.onCenterChanged.asBinder = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L3e
            java.lang.String r6 = r6.asInterface()
            if (r6 == 0) goto L42
            r6 = 1
            return r6
        L3e:
            r6.asInterface()
            throw r2
        L42:
            int r6 = o.onCenterChanged.IAuthTabCallbackStub
            int r6 = r6 + 21
            int r1 = r6 % 128
            o.onCenterChanged.asBinder = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L4e
            return r3
        L4e:
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onCenterChanged.onNavigationEvent(o.ImagePipelineExperimentsBuilderExternalSyntheticLambda12):boolean");
    }

    public static /* synthetic */ boolean onWarmupCompleted(onCenterChanged oncenterchanged, LoanFunnelType loanFunnelType, ImagePipelineExperimentsBuilderExternalSyntheticLambda10 imagePipelineExperimentsBuilderExternalSyntheticLambda10, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = asBinder + 5;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        Object obj2 = null;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            int i5 = i4 + 59;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                oncenterchanged.access000();
                obj2.hashCode();
                throw null;
            }
            loanFunnelType = oncenterchanged.access000();
        }
        if ((i & 2) != 0) {
            int i6 = asBinder + 7;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            imagePipelineExperimentsBuilderExternalSyntheticLambda10 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda10) onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 2055830191, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -2055830187, new Object[]{oncenterchanged, null, null, 3, null});
            int i8 = asBinder + 85;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
        }
        return oncenterchanged.onWarmupCompleted(loanFunnelType, imagePipelineExperimentsBuilderExternalSyntheticLambda10);
    }

    public final boolean onWarmupCompleted(@NotNull LoanFunnelType loanFunnelType, @Nullable ImagePipelineExperimentsBuilderExternalSyntheticLambda10 imagePipelineExperimentsBuilderExternalSyntheticLambda10) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(loanFunnelType, "");
        if (imagePipelineExperimentsBuilderExternalSyntheticLambda10 == null) {
            return false;
        }
        if (onExtraCallback.IAuthTabCallback[loanFunnelType.ordinal()] != 1) {
            return onTileLoadError.onWarmupCompleted(imagePipelineExperimentsBuilderExternalSyntheticLambda10.onExtraCallback());
        }
        int i4 = IAuthTabCallbackStub + 51;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return onTileLoadError.onNavigationEvent(imagePipelineExperimentsBuilderExternalSyntheticLambda10.onExtraCallback());
        }
        boolean zOnNavigationEvent = onTileLoadError.onNavigationEvent(imagePipelineExperimentsBuilderExternalSyntheticLambda10.onExtraCallback());
        int i5 = 95 / 0;
        return zOnNavigationEvent;
    }

    public final boolean onExtraCallbackWithResult(@NotNull String str) {
        Object obj;
        int i = 2 % 2;
        int i2 = asBinder + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Companion companion = Result.Companion;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (str.length() == 0) {
            int i4 = asBinder + 73;
            IAuthTabCallbackStub = i4 % 128;
            return i4 % 2 != 0;
        }
        obj = Result.constructor-impl(Boolean.valueOf(Pattern.compile("^[0-9]{2,3}[가-힣]{1}[0-9]{4}$").matcher(str).find()));
        if (Result.exceptionOrNull-impl(obj) != null) {
            int i5 = asBinder + 63;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                Boolean bool = Boolean.FALSE;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            obj = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i6 = asBinder + 49;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 60 / 0;
        }
        return zBooleanValue;
    }

    private final String IAuthTabCallback(Triple<Integer, Integer, Integer> triple) {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (triple != null && ((Number) triple.getFirst()).intValue() >= 0 && ((Number) triple.getSecond()).intValue() >= 0) {
            int i3 = IAuthTabCallbackStub + 79;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            if (((Number) triple.getThird()).intValue() >= 0) {
                Object first = triple.getFirst();
                String str = String.format("%02d", Arrays.copyOf(new Object[]{triple.getSecond()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
                String str2 = String.format("%02d", Arrays.copyOf(new Object[]{triple.getThird()}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "");
                String str3 = first + "-" + str + "-" + str2;
                int i5 = IAuthTabCallbackStub + 81;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                return str3;
            }
        }
        return null;
    }

    public final String IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strOnExtraCallbackWithResult = addPolicy.ITrustedWebActivityCallback_Parcel().onExtraCallbackWithResult(str, "");
        if (strOnExtraCallbackWithResult.length() != 0) {
            return strOnExtraCallbackWithResult;
        }
        int i4 = IAuthTabCallbackStub + 15;
        int i5 = i4 % 128;
        asBinder = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i5 + 15;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public final Pair<String, String> onNavigationEvent(@NotNull String str) {
        Pair<String, String> pairIAuthTabCallbackStubProxy;
        int i = 2 % 2;
        int i2 = asBinder + 113;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            pairIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(str);
            int i3 = 97 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            pairIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(str);
        }
        int i4 = IAuthTabCallbackStub + 21;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return pairIAuthTabCallbackStubProxy;
    }

    private final Pair<String, String> IAuthTabCallbackStubProxy(String str) {
        int i = 2 % 2;
        String str2 = str + "/-0";
        String str3 = str + "/-1";
        if (!addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent(str2)) {
            return null;
        }
        int i2 = IAuthTabCallbackStub + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent(str3)) {
            return null;
        }
        Pair<String, String> pair = new Pair<>(addPolicy.ITrustedWebActivityCallback_Parcel().onExtraCallbackWithResult(str2, ""), addPolicy.ITrustedWebActivityCallback_Parcel().onExtraCallbackWithResult(str3, ""));
        int i4 = asBinder + 121;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return pair;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallbackStubProxy(java.lang.Object[] r6) {
        /*
            r0 = 0
            r1 = r6[r0]
            o.onCenterChanged r1 = (o.onCenterChanged) r1
            r1 = 1
            r6 = r6[r1]
            java.lang.String r6 = (java.lang.String) r6
            r1 = 2
            int r2 = r1 % r1
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r3 = "/-0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r4 = "/-1"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            java.lang.String r6 = "/-2"
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            o.TextRoundCornerProgressBarSavedState1 r4 = o.addPolicy.ITrustedWebActivityCallback_Parcel()
            boolean r4 = r4.onNavigationEvent(r2)
            if (r4 == 0) goto Lb6
            int r4 = o.onCenterChanged.IAuthTabCallbackStub
            int r4 = r4 + 9
            int r5 = r4 % 128
            o.onCenterChanged.asBinder = r5
            int r4 = r4 % r1
            o.TextRoundCornerProgressBarSavedState1 r4 = o.addPolicy.ITrustedWebActivityCallback_Parcel()
            boolean r4 = r4.onNavigationEvent(r3)
            if (r4 == 0) goto Lb6
            int r4 = o.onCenterChanged.asBinder
            int r4 = r4 + 99
            int r5 = r4 % 128
            o.onCenterChanged.IAuthTabCallbackStub = r5
            int r4 = r4 % r1
            if (r4 == 0) goto L7b
            o.TextRoundCornerProgressBarSavedState1 r4 = o.addPolicy.ITrustedWebActivityCallback_Parcel()
            boolean r4 = r4.onNavigationEvent(r6)
            r5 = 81
            int r5 = r5 / r0
            if (r4 == 0) goto Lb6
            goto L85
        L7b:
            o.TextRoundCornerProgressBarSavedState1 r0 = o.addPolicy.ITrustedWebActivityCallback_Parcel()
            boolean r0 = r0.onNavigationEvent(r6)
            if (r0 == 0) goto Lb6
        L85:
            o.TextRoundCornerProgressBarSavedState1 r0 = o.addPolicy.ITrustedWebActivityCallback_Parcel()
            r4 = -1
            int r0 = r0.onWarmupCompleted(r2, r4)
            o.TextRoundCornerProgressBarSavedState1 r2 = o.addPolicy.ITrustedWebActivityCallback_Parcel()
            int r2 = r2.onWarmupCompleted(r3, r4)
            o.TextRoundCornerProgressBarSavedState1 r3 = o.addPolicy.ITrustedWebActivityCallback_Parcel()
            int r6 = r3.onWarmupCompleted(r6, r4)
            if (r0 < 0) goto Lb6
            if (r2 < 0) goto Lb6
            if (r6 < 0) goto Lb6
            kotlin.Triple r1 = new kotlin.Triple
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1.<init>(r0, r2, r6)
            return r1
        Lb6:
            int r6 = o.onCenterChanged.IAuthTabCallbackStub
            int r6 = r6 + 27
            int r0 = r6 % 128
            o.onCenterChanged.asBinder = r0
            int r6 = r6 % r1
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onCenterChanged.IAuthTabCallbackStubProxy(java.lang.Object[]):java.lang.Object");
    }

    public final void onWarmupCompleted(@NotNull String str, @Nullable String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (str2 == null) {
            addPolicy.ITrustedWebActivityCallback_Parcel().onTransact(str);
            int i3 = asBinder + 11;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = asBinder + 5;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent(str, str2);
        if (i6 != 0) {
            int i7 = 6 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallbackWithResult(java.lang.String r6, kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.Integer> r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.onCenterChanged.asBinder
            int r1 = r1 + 119
            int r2 = r1 % 128
            o.onCenterChanged.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L15
            r1 = 66
            int r1 = r1 / 0
            if (r7 == 0) goto L7d
            goto L17
        L15:
            if (r7 == 0) goto L7d
        L17:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r2 = "/-0"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r3 = "/-1"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r6 = "/-2"
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            o.TextRoundCornerProgressBarSavedState1 r3 = o.addPolicy.ITrustedWebActivityCallback_Parcel()
            java.lang.Object r4 = r7.getFirst()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r3.onExtraCallbackWithResult(r1, r4)
            o.TextRoundCornerProgressBarSavedState1 r1 = o.addPolicy.ITrustedWebActivityCallback_Parcel()
            java.lang.Object r3 = r7.getSecond()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r1.onExtraCallbackWithResult(r2, r3)
            o.TextRoundCornerProgressBarSavedState1 r1 = o.addPolicy.ITrustedWebActivityCallback_Parcel()
            java.lang.Object r7 = r7.getThird()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r1.onExtraCallbackWithResult(r6, r7)
        L7d:
            int r6 = o.onCenterChanged.asBinder
            int r6 = r6 + 57
            int r7 = r6 % 128
            o.onCenterChanged.IAuthTabCallbackStub = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L89
            return
        L89:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onCenterChanged.onExtraCallbackWithResult(java.lang.String, kotlin.Triple):void");
    }

    private final List<String> asBinder(String str) {
        int i = 2 % 2;
        List<String> listListOf = CollectionsKt.listOf(new String[]{str + "/-0", str + "/-1", str + "/-2"});
        int i2 = IAuthTabCallbackStub + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return listListOf;
    }

    private final Date onUnminimized() {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(IAuthTabCallback.onActivityLayout());
            Date time = calendar.getTime();
            int i4 = asBinder + 23;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 97 / 0;
            }
            return time;
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = addPolicy.ITrustedWebActivityCallback_Parcel().onExtraCallback("KEY_IS_DEACTIVATED_AUTOMOBILE_BOTTOM_SHEET_SHOWN", false);
        int i4 = asBinder + 9;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    public final void onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent("KEY_IS_DEACTIVATED_AUTOMOBILE_BOTTOM_SHEET_SHOWN", true);
        int i4 = IAuthTabCallbackStub + 23;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (o.zzan.IAuthTabCallback(new java.util.Date(r8.IAuthTabCallbackDefault()), new java.util.Date(r1)) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        r8 = o.onCenterChanged.asBinder + 49;
        o.onCenterChanged.IAuthTabCallbackStub = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if ((r8 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (o.addPolicy.ITrustedWebActivityCallback_Parcel().onWarmupCompleted("KEY_FILTER_HIGHLIGHT_SHOWN_COUNT", 0) < 3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        r8 = o.onCenterChanged.asBinder + 107;
        o.onCenterChanged.IAuthTabCallbackStub = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if ((r8 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r1 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r1 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onNavigationEvent(@org.jetbrains.annotations.NotNull o.zzag r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.onCenterChanged.asBinder
            int r1 = r1 + 79
            int r2 = r1 % 128
            o.onCenterChanged.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            java.lang.String r2 = "KEY_FILTER_HIGHLIGHT_SHOWN_TS"
            java.lang.String r3 = ""
            r4 = 0
            r6 = 0
            if (r1 == 0) goto L25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
            o.TextRoundCornerProgressBarSavedState1 r1 = o.addPolicy.ITrustedWebActivityCallback_Parcel()
            long r1 = r1.onExtraCallback(r2, r4)
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 != 0) goto L35
            goto L34
        L25:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
            o.TextRoundCornerProgressBarSavedState1 r1 = o.addPolicy.ITrustedWebActivityCallback_Parcel()
            long r1 = r1.onExtraCallback(r2, r4)
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 != 0) goto L35
        L34:
            return r6
        L35:
            java.util.Date r3 = new java.util.Date
            long r4 = r8.IAuthTabCallbackDefault()
            r3.<init>(r4)
            java.util.Date r8 = new java.util.Date
            r8.<init>(r1)
            boolean r8 = o.zzan.IAuthTabCallback(r3, r8)
            r1 = 1
            if (r8 != 0) goto L57
            int r8 = o.onCenterChanged.asBinder
            int r8 = r8 + 49
            int r2 = r8 % 128
            o.onCenterChanged.IAuthTabCallbackStub = r2
            int r8 = r8 % r0
            if (r8 == 0) goto L56
            r6 = r1
        L56:
            return r6
        L57:
            o.TextRoundCornerProgressBarSavedState1 r8 = o.addPolicy.ITrustedWebActivityCallback_Parcel()
            java.lang.String r2 = "KEY_FILTER_HIGHLIGHT_SHOWN_COUNT"
            int r8 = r8.onWarmupCompleted(r2, r6)
            r2 = 3
            if (r8 < r2) goto L71
            int r8 = o.onCenterChanged.asBinder
            int r8 = r8 + 107
            int r2 = r8 % 128
            o.onCenterChanged.IAuthTabCallbackStub = r2
            int r8 = r8 % r0
            if (r8 == 0) goto L70
            return r6
        L70:
            return r1
        L71:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onCenterChanged.onNavigationEvent(o.zzag):boolean");
    }

    public final void onExtraCallback(@NotNull zzag zzagVar) {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(zzagVar, "");
        long jIAuthTabCallbackDefault = zzagVar.IAuthTabCallbackDefault();
        long jOnExtraCallback = addPolicy.ITrustedWebActivityCallback_Parcel().onExtraCallback("KEY_FILTER_HIGHLIGHT_SHOWN_TS", 0L);
        int iOnWarmupCompleted = 0;
        if (jOnExtraCallback != 0 && zzan.IAuthTabCallback(new Date(jIAuthTabCallbackDefault), new Date(jOnExtraCallback))) {
            iOnWarmupCompleted = addPolicy.ITrustedWebActivityCallback_Parcel().onWarmupCompleted("KEY_FILTER_HIGHLIGHT_SHOWN_COUNT", 0);
            int i4 = asBinder + 45;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        addPolicy.ITrustedWebActivityCallback_Parcel().onExtraCallbackWithResult("KEY_FILTER_HIGHLIGHT_SHOWN_COUNT", iOnWarmupCompleted + 1);
        addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent("KEY_FILTER_HIGHLIGHT_SHOWN_TS", jIAuthTabCallbackDefault);
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        String str;
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 67;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (!zBooleanValue) {
            str = "KEY_COMPLETED_AUTOMOBILE_INPUT_BANNER_SHOWN_COUNTER";
        } else {
            int i5 = i2 + 43;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            str = "KEY_ALL_REJECTED_AUTOMOBILE_INPUT_PAGE_SHOWN_COUNTER";
        }
        if (addPolicy.ITrustedWebActivityCallback_Parcel().onWarmupCompleted(str, 0) < 3) {
            return false;
        }
        int i7 = IAuthTabCallbackStub + 125;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        onCenterChanged oncenterchanged = (onCenterChanged) objArr[0];
        zzag zzagVar = (zzag) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(zzagVar, "");
        long jAsBinder = oncenterchanged.asBinder(zBooleanValue);
        Date date = new Date(zzagVar.IAuthTabCallbackDefault());
        Date date2 = new Date(jAsBinder);
        if (jAsBinder != 0) {
            int i2 = IAuthTabCallbackStub + 117;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (zzan.IAuthTabCallback(date, date2)) {
                return null;
            }
        }
        oncenterchanged.onExtraCallbackWithResult(zzagVar, zBooleanValue);
        oncenterchanged.IAuthTabCallbackStub(zBooleanValue);
        int i4 = asBinder + 31;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void IAuthTabCallbackStub(boolean z) {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        if (z) {
            int i5 = i3 + 5;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            str = "KEY_ALL_REJECTED_AUTOMOBILE_INPUT_PAGE_SHOWN_COUNTER";
        } else {
            str = "KEY_COMPLETED_AUTOMOBILE_INPUT_BANNER_SHOWN_COUNTER";
        }
        addPolicy.ITrustedWebActivityCallback_Parcel().onExtraCallbackWithResult(str, addPolicy.ITrustedWebActivityCallback_Parcel().onWarmupCompleted(str, 0) + 1);
    }

    private final long asBinder(boolean z) {
        String str;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 57;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (!(!z)) {
            int i4 = i2 + 117;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            str = "KEY_ALL_REJECTED_AUTOMOBILE_INPUT_PAGE_SHOWN_TS";
        } else {
            str = "KEY_COMPLETED_AUTOMOBILE_INPUT_BANNER_SHOWN_TS";
        }
        return addPolicy.ITrustedWebActivityCallback_Parcel().onExtraCallback(str, 0L);
    }

    private final void onExtraCallbackWithResult(zzag zzagVar, boolean z) {
        String str;
        int i = 2 % 2;
        if (!z) {
            int i2 = IAuthTabCallbackStub + 103;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            str = "KEY_COMPLETED_AUTOMOBILE_INPUT_BANNER_SHOWN_TS";
        } else {
            int i4 = asBinder + 5;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            str = "KEY_ALL_REJECTED_AUTOMOBILE_INPUT_PAGE_SHOWN_TS";
        }
        addPolicy.ITrustedWebActivityCallback_Parcel().onNavigationEvent(str, zzagVar.IAuthTabCallbackDefault());
    }

    public static /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda10 onExtraCallbackWithResult(onCenterChanged oncenterchanged, zzag zzagVar, String str, int i, Object obj) {
        Object[] objArr = {oncenterchanged, zzagVar, str, Integer.valueOf(i), obj};
        return (ImagePipelineExperimentsBuilderExternalSyntheticLambda10) onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 2055830191, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -2055830187, objArr);
    }

    private final long ICustomTabsCallbackStubProxy() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return ((Long) onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, -273953583, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 273953593, new Object[]{this})).longValue();
    }

    private final boolean onExtraCallbackWithResult(ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return ((Boolean) onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, 1653807895, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1653807892, new Object[]{this, imagePipelineExperimentsBuilderExternalSyntheticLambda12})).booleanValue();
    }

    public final boolean onExtraCallback() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return ((Boolean) onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, -194589186, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 194589194, new Object[]{this})).booleanValue();
    }

    public final long writeTypedObject() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return ((Long) onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, -693725286, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 693725299, new Object[]{this})).longValue();
    }

    public final void onNavigationEvent(@NotNull zzag zzagVar, boolean z) {
        Object[] objArr = {this, zzagVar, Boolean.valueOf(z)};
        onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1339162331, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1339162320, objArr);
    }

    public final boolean onWarmupCompleted(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        return ((Boolean) onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -416102726, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 416102732, objArr)).booleanValue();
    }

    public final boolean ICustomTabsCallback() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return ((Boolean) onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, -2022395771, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 2022395771, new Object[]{this})).booleanValue();
    }

    public final Triple<Integer, Integer, Integer> onExtraCallback(@NotNull String str) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Triple) onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, -256290407, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 256290419, new Object[]{this, str});
    }

    public final void onWarmupCompleted(@Nullable String str) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, -370346253, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 370346258, new Object[]{this, str});
    }

    public final void onNavigationEvent(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -95608122, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 95608124, objArr);
    }

    public final void IAuthTabCallbackDefault(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -240811287, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 240811288, objArr);
    }

    public final void onExtraCallbackWithResult(@NotNull LoanFunnelType loanFunnelType) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, 77160964, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -77160955, new Object[]{this, loanFunnelType});
    }

    public final void asInterface(@NotNull String str) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, -1757845090, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1757845097, new Object[]{this, str});
    }

    static void onActivityResized() {
        onWarmupCompleted = new char[]{18130, 35906, 54265, 6505, 27825, 45582, 63905, 52427, 4679, 23015, 44905, 62108, 14389, 4007, 21222, 38993, 61408, 60856, 10024, 30867, 45571, 51163, 6500, 21195, 26529, 47405, 62093, 1027, 23030, 37727, 42189, 63895, 13095, 17556, 40546, 54262, 58745, 16073, 29615, 34071};
        onTransact = 5384660007926048583L;
    }
}
