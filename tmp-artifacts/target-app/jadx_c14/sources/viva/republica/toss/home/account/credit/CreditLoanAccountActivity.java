package viva.republica.toss.home.account.credit;

import android.app.Activity;
import android.content.Context;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.material.tabs.TabLayout;
import im.toss.features.password.api.annotation.RequiresAuth;
import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CERT_GetKeyUsage;
import o.ConvertByteArrayToFloatArray;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackGroupExternalSyntheticLambda0;
import o.UTF8Decoder;
import o.setMaxScale;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;
import viva.republica.toss.home.account.credit.CreditLoanAccountActivity$;

@RequiresAuth(onExtraCallbackWithResult = true, onWarmupCompleted = UTF8Decoder.CREDIT_DETAIL)
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CreditLoanAccountActivity extends Hilt_CreditLoanAccountActivity implements CreditLoanAccountOverviewFragment$onExtraCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static char[] IAuthTabCallbackStub = null;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static int access100 = 1;
    public static final int asInterface;
    private static int onTransact;
    private final Lazy IAuthTabCallbackDefault = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallback(this));
    private Function0<Unit> asBinder;

    @Inject
    public setMaxScale loanBrokerageFragmentNavigation;

    @Inject
    public SessionTrackerb tossRouter;

    static {
        updateVisuals();
        Companion = new onExtraCallbackWithResult(null);
        asInterface = 8;
        int i = IAuthTabCallback_Parcel + 119;
        access000 = i % 128;
        if (i % 2 != 0) {
            int i2 = 66 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, CreditLoanAccountActivity creditLoanAccountActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 91;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(i, creditLoanAccountActivity, setDetectableSize);
        int i5 = access100 + 57;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditLoanAccountActivity creditLoanAccountActivity, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 39;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallback(creditLoanAccountActivity, i);
        }
        onExtraCallback(creditLoanAccountActivity, i);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | i3;
        int i10 = i8 | i3;
        int i11 = (~((~i3) | i2)) | (~i10);
        int i12 = (~(i5 | i7 | i3)) | (~(i10 | i2));
        int i13 = i3 + i2 + i4 + (528639218 * i) + ((-532493036) * i6);
        int i14 = i13 * i13;
        int i15 = ((i3 * 873666089) - 1460666368) + (873666089 * i2) + ((-875965520) * i9) + (437982760 * i11) + ((-437982760) * i12) + (435683328 * i4) + (1819279360 * i) + ((-1621098496) * i6) + (586088448 * i14);
        int i16 = (i3 * (-1573143961)) + 2078511484 + (i2 * (-1573143961)) + (i9 * 1872) + (i11 * (-936)) + (i12 * 936) + (i4 * (-1573143025)) + (i * 123045422) + (i6 * (-1548035028)) + (i14 * 1845559296);
        return i15 + ((i16 * i16) * 1848705024) != 1 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CreditLoanAccountActivity creditLoanAccountActivity = (CreditLoanAccountActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = access100 + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(creditLoanAccountActivity, iIntValue, iIntValue2);
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        int iIntValue = ((Number) objArr[0]).intValue();
        CreditLoanAccountActivity creditLoanAccountActivity = (CreditLoanAccountActivity) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = onTransact + 47;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(iIntValue, creditLoanAccountActivity, setDetectableSize);
        int i4 = onTransact + 19;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 57;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 3;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return -1L;
    }

    public static final class IAuthTabCallback implements Function0<CERT_GetKeyUsage> {
        final /* synthetic */ Activity onWarmupCompleted;

        public IAuthTabCallback(Activity activity) {
            this.onWarmupCompleted = activity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final CERT_GetKeyUsage invoke() {
            LayoutInflater layoutInflater = this.onWarmupCompleted.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_GetKeyUsage.IAuthTabCallback(layoutInflater);
        }
    }

    private final CERT_GetKeyUsage validateRelationship() {
        int i = 2 % 2;
        int i2 = access100 + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallbackDefault.getValue();
        if (i3 == 0) {
            return (CERT_GetKeyUsage) value;
        }
        int i4 = 79 / 0;
        return (CERT_GetKeyUsage) value;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = viva.republica.toss.home.account.credit.CreditLoanAccountActivity.onTransact + 1;
        viva.republica.toss.home.account.credit.CreditLoanAccountActivity.access100 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if ((r1 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = r1 + 123;
        viva.republica.toss.home.account.credit.CreditLoanAccountActivity.access100 = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.setMaxScale IAuthTabCallback() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.home.account.credit.CreditLoanAccountActivity.onTransact
            int r2 = r1 + 119
            int r3 = r2 % 128
            viva.republica.toss.home.account.credit.CreditLoanAccountActivity.access100 = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L18
            o.setMaxScale r2 = r5.loanBrokerageFragmentNavigation
            r4 = 21
            int r4 = r4 / 0
            if (r2 == 0) goto L27
            goto L1c
        L18:
            o.setMaxScale r2 = r5.loanBrokerageFragmentNavigation
            if (r2 == 0) goto L27
        L1c:
            int r1 = r1 + 123
            int r4 = r1 % 128
            viva.republica.toss.home.account.credit.CreditLoanAccountActivity.access100 = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L26
            return r2
        L26:
            throw r3
        L27:
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            int r1 = viva.republica.toss.home.account.credit.CreditLoanAccountActivity.onTransact
            int r1 = r1 + 1
            int r2 = r1 % 128
            viva.republica.toss.home.account.credit.CreditLoanAccountActivity.access100 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L38
            return r3
        L38:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.home.account.credit.CreditLoanAccountActivity.IAuthTabCallback():o.setMaxScale");
    }

    public final SessionTrackerb onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = onTransact + 31;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private static final Unit onWarmupCompleted(int i, CreditLoanAccountActivity creditLoanAccountActivity, SetDetectableSize setDetectableSize) throws Throwable {
        String str;
        int i2 = 2 % 2;
        int i3 = onTransact + 99;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        if (i == 0) {
            str = "SWIPE_TO_CREDIT_LOAN";
        } else {
            int i5 = onTransact + 19;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            str = "SWIPE_TO_LOAN_BROKERAGE";
        }
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 0, 4}, true, new byte[]{1, 1, 1, 1}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        TabLayout.Tab tabOnExtraCallback = creditLoanAccountActivity.validateRelationship().onExtraCallbackWithResult.onExtraCallback(i);
        CharSequence text = tabOnExtraCallback != null ? tabOnExtraCallback.getText() : null;
        Object[] objArr2 = new Object[1];
        a(new int[]{4, 5, 0, 5}, true, new byte[]{1, 1, 0, 1, 1}, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), text);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(CreditLoanAccountActivity creditLoanAccountActivity, int i, int i2) {
        int i3 = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1011589L, false, (String) null, (Map) null, new CreditLoanAccountActivity$.ExternalSyntheticLambda3(i2, creditLoanAccountActivity), 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 13;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(int i, CreditLoanAccountActivity creditLoanAccountActivity, SetDetectableSize setDetectableSize) throws Throwable {
        CharSequence text;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        String str = i == 0 ? "TAB_TO_CREDIT_LOAN" : "TAB_TO_LOAN_BROKERAGE";
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 0, 4}, true, new byte[]{1, 1, 1, 1}, objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), str);
        TabLayout.Tab tabOnExtraCallback = creditLoanAccountActivity.validateRelationship().onExtraCallbackWithResult.onExtraCallback(i);
        if (tabOnExtraCallback != null) {
            int i3 = onTransact + 9;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                text = tabOnExtraCallback.getText();
                int i4 = 69 / 0;
            } else {
                text = tabOnExtraCallback.getText();
            }
        } else {
            int i5 = access100 + 47;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            text = null;
        }
        Object[] objArr2 = new Object[1];
        a(new int[]{4, 5, 0, 5}, true, new byte[]{1, 1, 0, 1, 1}, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), text);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(CreditLoanAccountActivity creditLoanAccountActivity, int i) {
        int i2 = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1011589L, false, (String) null, (Map) null, new CreditLoanAccountActivity$.ExternalSyntheticLambda2(i, creditLoanAccountActivity), 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i3 = onTransact + 105;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:198:0x058b  */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.app.Activity, im.toss.base.BaseActivity, viva.republica.toss.home.account.credit.CreditLoanAccountActivity] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v108, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v116, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v117, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v118, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v119, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v120, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v121, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v122, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v123 */
    /* JADX WARN: Type inference failed for: r7v127, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v52, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v63, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v74, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v84, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v94, types: [java.lang.Object[]] */
    @Override // viva.republica.toss.home.account.credit.Hilt_CreditLoanAccountActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 1637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.home.account.credit.CreditLoanAccountActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = access100 + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        if (menuItem.getItemId() == 16908332) {
            int i4 = access100 + 79;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                finish();
                return false;
            }
            finish();
            return false;
        }
        boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
        int i5 = access100 + 41;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return zOnOptionsItemSelected;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean bg_() {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        access100 = i2 % 128;
        if (i2 % 2 != 0 ? validateRelationship().onNavigationEvent.getCurrentItem() != 1 : validateRelationship().onNavigationEvent.getCurrentItem() != 1) {
            return super.bg_();
        }
        Function0<Unit> function0 = this.asBinder;
        if (function0 != null) {
            int i3 = access100 + 117;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                function0.invoke();
                throw null;
            }
            function0.invoke();
        }
        validateRelationship().onNavigationEvent.setCurrentItem(0, true);
        int i4 = access100 + 113;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r1
      0x0023: PHI (r1v5 android.content.Intent) = (r1v4 android.content.Intent), (r1v97 android.content.Intent) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.app.Activity, viva.republica.toss.home.account.credit.CreditLoanAccountActivity] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v30, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v34, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v37, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r9v38, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r9v39, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r9v42, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r9v43, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r9v44, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object[]] */
    @Override // viva.republica.toss.home.account.credit.CreditLoanAccountOverviewFragment$onExtraCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setEngagementSignalsCallback() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.home.account.credit.CreditLoanAccountActivity.setEngagementSignalsCallback():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getBiometricTitle() {
        int i = 2 % 2;
        int i2 = access100 + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String string = getString(R.string.app_home_account_credit___c855d2188a);
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = onTransact + 45;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = IAuthTabCallbackStub;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 119;
                $10 = i9 % 128;
                int i10 = i9 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 35283), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 34, 14240 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 2;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i11 = $10 + 45;
                $11 = i11 % 128;
                if (i11 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 29 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10936 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 64 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 16718 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                try {
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 49467), 69 - TextUtils.lastIndexOf("", '0'), 12486 - (ViewConfiguration.getLongPressTimeout() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i14 = $11 + 113;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i16 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i16, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            int i17 = $11 + 45;
            $10 = i17 % 128;
            i = 2;
            int i18 = i17 % 2;
            cArr3 = cArr6;
        } else {
            i = 2;
        }
        if (i6 > 0) {
            int i19 = $11 + 115;
            $10 = i19 % 128;
            int i20 = i19 % i;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[i]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static /* synthetic */ Unit onExtraCallback(CreditLoanAccountActivity creditLoanAccountActivity, int i, int i2) {
        Object[] objArr = {creditLoanAccountActivity, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 1399322520, -1399322520, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CreditLoanAccountActivity creditLoanAccountActivity, SetDetectableSize setDetectableSize) {
        Object[] objArr = {Integer.valueOf(i), creditLoanAccountActivity, setDetectableSize};
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -40231056, 40231057, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), objArr);
    }

    @Override // viva.republica.toss.home.account.credit.Hilt_CreditLoanAccountActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = access100 + 123;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.home.account.credit.Hilt_CreditLoanAccountActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access100 + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = onTransact + 69;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.home.account.credit.Hilt_CreditLoanAccountActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access100 + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = access100 + 79;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.home.account.credit.Hilt_CreditLoanAccountActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access100 + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = access100 + 99;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
    }

    static void updateVisuals() {
        IAuthTabCallbackStub = new char[]{27260, 27172, 27194, 27192, 27260, 27174, 27198, 27168, 27168, 27328, 27475, 27477, 27485, 27482, 27474, 27476, 27476, 27474, 27313, 27283, 27286, 27320, 27480, 27487, 27486, 27321, 27324, 27484, 27481, 27481, 27487, 27484, 27480, 27481, 27476, 27481, 27313, 27471, 27482, 27456, 27456, 27482, 27477, 27482, 27482, 27470, 27302, 27301, 27298, 27324, 27317, 27316, 27316, 27468, 27316, 27299, 27323, 27325, 27296, 27325, 27304, 27311, 27327, 27316, 27315, 27316, 27321, 27313, 27319, 27300, 27326, 27321, 27324, 27322, 27307, 27323, 27483, 27482, 27475, 27478, 27457, 27459, 27461, 27487, 27482, 27456, 27456, 27482, 27477, 27482, 27482, 27470};
    }
}
