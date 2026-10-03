package viva.republica.toss.account.register.openbanking;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.TimelineExternalSyntheticLambda1;
import o.UST_CMP_IssueCertificate_SendConf;
import o.bindApp;
import o.checkNavigationBarBySystemProperties;
import o.getIssuerAndSerialNumber;
import o.onPageExit;
import o.send;
import o.sendBroadcastWithAdObject;
import o.zzaj;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.register.openbanking.InputAccountActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class OpenBankingAccountRegisterActivity extends Hilt_OpenBankingAccountRegisterActivity {
    public static final IAuthTabCallback Companion;
    public static final int IAuthTabCallbackDefault;
    private static long IAuthTabCallback_Parcel;
    private static int extraCallback;
    private static char[] getInterfaceDescriptor;
    private Long onTransact;
    private static final byte[] $$a = {79, 23, 89, 11};
    private static final int $$b = 211;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int extraCallbackWithResult = 1;
    private static int access100 = 0;
    private static int ICustomTabsCallback = 1;
    private checkNavigationBarBySystemProperties IAuthTabCallbackStub = checkNavigationBarBySystemProperties.Companion.IAuthTabCallback();
    private String asInterface = "";
    private final Lazy IAuthTabCallbackStubProxy = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingAccountRegisterActivity$$ExternalSyntheticLambda0
        public final Object invoke() {
            return Boolean.valueOf(OpenBankingAccountRegisterActivity.onExtraCallback(this.f$0));
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> asBinder = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingAccountRegisterActivity$$ExternalSyntheticLambda1
        public final Object invoke(Object obj) {
            return OpenBankingAccountRegisterActivity.onExtraCallback(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> access000 = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.account.register.openbanking.OpenBankingAccountRegisterActivity$$ExternalSyntheticLambda2
        public final Object invoke(Object obj) {
            Object[] objArr = {this.f$0, (IEngagementSignalsCallbackDefault) obj};
            return (Unit) OpenBankingAccountRegisterActivity.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1935079351, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1935079351, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), objArr);
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, short r8) {
        /*
            byte[] r0 = viva.republica.toss.account.register.openbanking.OpenBankingAccountRegisterActivity.$$a
            int r8 = r8 * 2
            int r1 = r8 + 1
            int r6 = r6 * 2
            int r6 = r6 + 97
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r6 = r6 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.OpenBankingAccountRegisterActivity.$$c(int, byte, short):java.lang.String");
    }

    static {
        extraCallback = 0;
        IAuthTabCallback();
        Companion = new IAuthTabCallback(null);
        IAuthTabCallbackDefault = 8;
        int i = extraCallbackWithResult + 3;
        extraCallback = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        OpenBankingAccountRegisterActivity openBankingAccountRegisterActivity = (OpenBankingAccountRegisterActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 101;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            return (Unit) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1880863865, iOnExtraCallback, iOnExtraCallback2, -1880863864, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{openBankingAccountRegisterActivity, iEngagementSignalsCallbackDefault});
        }
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback4 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        Unit unit = (Unit) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1880863865, iOnExtraCallback3, iOnExtraCallback4, -1880863864, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{openBankingAccountRegisterActivity, iEngagementSignalsCallbackDefault});
        int i3 = 81 / 0;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(OpenBankingAccountRegisterActivity openBankingAccountRegisterActivity, int i, Intent intent) {
        int i2 = 2 % 2;
        int i3 = access100 + 63;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(openBankingAccountRegisterActivity, i, intent);
        int i5 = ICustomTabsCallback + 7;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(OpenBankingAccountRegisterActivity openBankingAccountRegisterActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = access100 + 79;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(openBankingAccountRegisterActivity, iEngagementSignalsCallbackDefault);
        int i4 = access100 + 83;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(OpenBankingAccountRegisterActivity openBankingAccountRegisterActivity) {
        int i = 2 % 2;
        int i2 = access100 + 41;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(openBankingAccountRegisterActivity);
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        int i5 = access100 + 95;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return zIAuthTabCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~((~i3) | i2 | i5);
        int i8 = i3 | i2 | i5;
        int i9 = (~((~i2) | (~i5))) | i7;
        int i10 = i2 + i5 + i4 + (1512347918 * i) + (2033855975 * i6);
        int i11 = i10 * i10;
        int i12 = ((i2 * 1295388527) - 26148864) + (1295388527 * i5) + (2139102940 * i7) + (i8 * 1077932178) + (1077932178 * i9) + ((-1921646592) * i4) + (1114898432 * i) + (1668939776 * i6) + (346619904 * i11);
        int i13 = ((i2 * 1848112433) - 751391395) + (i5 * 1848112433) + (i7 * (-92)) + (i8 * 46) + (i9 * 46) + (i4 * 1848112479) + (i * (-818859470)) + (i6 * (-357164103)) + (i11 * 1740046336);
        int i14 = i12 + (i13 * i13 * 1721171968);
        return i14 != 1 ? i14 != 2 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 57;
        int i3 = i2 % 128;
        access100 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 93;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return 1000870L;
        }
        throw null;
    }

    private final boolean updateVisuals() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 43;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            ((Boolean) this.IAuthTabCallbackStubProxy.getValue()).booleanValue();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) this.IAuthTabCallbackStubProxy.getValue()).booleanValue();
        int i3 = access100 + 83;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String setEngagementSignalsCallback() throws Throwable {
        Intent intent;
        Object obj;
        int i = 2 % 2;
        int i2 = access100 + 125;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            intent = getIntent();
            Object[] objArr = new Object[1];
            a(TextUtils.indexOf((CharSequence) "", (char) 0, 1), 103 - TextUtils.indexOf("", "", 0), (char) (View.MeasureSpec.makeMeasureSpec(0, 1) + 29687), objArr);
            obj = objArr[0];
        } else {
            intent = getIntent();
            Object[] objArr2 = new Object[1];
            a(TextUtils.indexOf((CharSequence) "", '0', 0) + 1, 8 - TextUtils.indexOf("", "", 0), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 6618), objArr2);
            obj = objArr2[0];
        }
        return intent.getStringExtra(((String) obj).intern());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String validateRelationship() {
        int i = 2 % 2;
        int i2 = access100 + 57;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = getIntent().getStringExtra("serviceReferrer");
        int i4 = access100 + 21;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:202:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05a2  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v26, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v30, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v34, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v38, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v43, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v47, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r12v48, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r12v49, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v50, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r12v51, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r12v52, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v57, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r18v0, types: [android.app.Activity, im.toss.base.BaseActivity, viva.republica.toss.account.register.openbanking.OpenBankingAccountRegisterActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(viva.republica.toss.account.register.openbanking.OpenBankingAccountRegisterActivity r18, o.IEngagementSignalsCallbackDefault r19) {
        /*
            Method dump skipped, instructions count: 1542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.OpenBankingAccountRegisterActivity.IAuthTabCallback(viva.republica.toss.account.register.openbanking.OpenBankingAccountRegisterActivity, o.IEngagementSignalsCallbackDefault):kotlin.Unit");
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        OpenBankingAccountRegisterActivity openBankingAccountRegisterActivity = (OpenBankingAccountRegisterActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 43;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            openBankingAccountRegisterActivity.onWarmupCompleted(iEngagementSignalsCallbackDefault.onNavigationEvent(), iEngagementSignalsCallbackDefault.onExtraCallbackWithResult());
        } else {
            openBankingAccountRegisterActivity.finish();
            int i4 = access100 + 77;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i6 = ICustomTabsCallback + 19;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.account.register.openbanking.Hilt_OpenBankingAccountRegisterActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        send sendVarOnWarmupCompleted = send.Companion.onWarmupCompleted();
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("bankCode") : null;
        String str = "";
        if (stringExtra == null) {
            int i2 = access100 + 97;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            stringExtra = "";
        }
        this.IAuthTabCallbackStub = bindApp.onExtraCallbackWithResult(sendVarOnWarmupCompleted, stringExtra);
        Intent intent2 = getIntent();
        String stringExtra2 = intent2 != null ? intent2.getStringExtra("accountNo") : null;
        if (stringExtra2 == null) {
            int i4 = access100 + 93;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = stringExtra2;
        }
        this.asInterface = str;
        if (!(!this.IAuthTabCallbackStub.onActivityLayout())) {
            finish();
            return;
        }
        onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -63602625, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 63602627, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{this});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.content.Context, viva.republica.toss.account.register.openbanking.OpenBankingAccountRegisterActivity] */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        ?? r6 = (OpenBankingAccountRegisterActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 49;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = ((OpenBankingAccountRegisterActivity) r6).asBinder;
        InputAccountActivity.onWarmupCompleted onwarmupcompleted = InputAccountActivity.Companion;
        int iIAuthTabCallbackStub = ((OpenBankingAccountRegisterActivity) r6).IAuthTabCallbackStub.IAuthTabCallbackStub();
        iEngagementSignalsCallback_Parcel.onNavigationEvent(onwarmupcompleted.onWarmupCompleted(r6, String.valueOf(iIAuthTabCallbackStub), r6.setEngagementSignalsCallback(), r6.validateRelationship()));
        int i4 = access100 + 29;
        ICustomTabsCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(getInterfaceDescriptor[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 59697), 17 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getTouchSlop() >> 8) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(IAuthTabCallback_Parcel), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - View.MeasureSpec.getMode(0)), Drawable.resolveOpacity(0, 0) + 31, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 49123), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i5 = $10 + 33;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 49123), 44 - View.getDefaultSize(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i7 = $11 + 35;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr);
    }

    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static char onExtraCallback = 39989;
        private static char onExtraCallbackWithResult = 50313;
        private static char onNavigationEvent = 29564;
        private static int onTransact = 1;
        private static char onWarmupCompleted = 30840;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i4 = $10 + 123;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    int i8 = $10 + 37;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                    int i11 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallback);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 11;
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12434;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, iIndexOf, maximumFlingVelocity, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 10 - View.getDefaultSize(0, 0), Color.rgb(0, 0, 0) + 16789650, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7++;
                        cArr3 = cArr4;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 16014), (Process.myPid() >> 22) + 14, 19901 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        private IAuthTabCallback() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @Nullable String str4, @Nullable String str5) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) OpenBankingAccountRegisterActivity.class).putExtra("bankCode", str).putExtra("accountId", str2).putExtra("accountNo", str3).putExtra("showSmsGuide", z);
            Object[] objArr = new Object[1];
            a(new char[]{4111, 28932, 50295, 21706, 32058, 41765, 22794, 17258}, 8 - Color.red(0), objArr);
            Intent intentPutExtra2 = intentPutExtra.putExtra(((String) objArr[0]).intern(), str4).putExtra("serviceReferrer", str5);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra2, "");
            int i2 = onTransact + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return intentPutExtra2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 19;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        this.access000.onNavigationEvent(InputEmailActivity.Companion.onNavigationEvent(this, str, str2, this.onTransact, setEngagementSignalsCallback(), validateRelationship()));
        int i4 = ICustomTabsCallback + 117;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onWarmupCompleted(final int r11, final android.content.Intent r12) throws java.lang.Throwable {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            if (r12 == 0) goto L15
            int r1 = viva.republica.toss.account.register.openbanking.OpenBankingAccountRegisterActivity.access100
            int r1 = r1 + 63
            int r2 = r1 % 128
            viva.republica.toss.account.register.openbanking.OpenBankingAccountRegisterActivity.ICustomTabsCallback = r2
            int r1 = r1 % r0
            java.lang.String r1 = "EXTRA_KEY_REGISTERED_BANK_ACCOUNTS"
            java.util.ArrayList r1 = r12.getParcelableArrayListExtra(r1)
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L1c
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L1c:
            r4 = r1
            r1 = 0
            if (r12 == 0) goto L27
            java.lang.String r2 = "withdrawAgreementCompleted"
            boolean r2 = r12.getBooleanExtra(r2, r1)
            goto L28
        L27:
            r2 = r1
        L28:
            o.ASN1Set r3 = o.ASN1Set.onNavigationEvent
            boolean r5 = r10.updateVisuals()
            if (r5 == 0) goto L45
            int r5 = viva.republica.toss.account.register.openbanking.OpenBankingAccountRegisterActivity.ICustomTabsCallback
            int r5 = r5 + 65
            int r6 = r5 % 128
            viva.republica.toss.account.register.openbanking.OpenBankingAccountRegisterActivity.access100 = r6
            int r5 = r5 % r0
            if (r2 == 0) goto L45
            int r6 = r6 + 113
            int r1 = r6 % 128
            viva.republica.toss.account.register.openbanking.OpenBankingAccountRegisterActivity.ICustomTabsCallback = r1
            int r6 = r6 % r0
            r0 = 1
            r5 = r0
            goto L46
        L45:
            r5 = r1
        L46:
            o.getSignedData r7 = o.getSignedData.DEFAULT
            r6 = 0
            r8 = 1
            viva.republica.toss.account.register.openbanking.OpenBankingAccountRegisterActivity$$ExternalSyntheticLambda3 r9 = new viva.republica.toss.account.register.openbanking.OpenBankingAccountRegisterActivity$$ExternalSyntheticLambda3
            r9.<init>()
            r2 = r3
            r3 = r10
            r2.onExtraCallbackWithResult(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.register.openbanking.OpenBankingAccountRegisterActivity.onWarmupCompleted(int, android.content.Intent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(OpenBankingAccountRegisterActivity openBankingAccountRegisterActivity, int i, Intent intent) {
        int i2 = 2 % 2;
        int i3 = access100 + 111;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        openBankingAccountRegisterActivity.setResult(i, intent);
        openBankingAccountRegisterActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i5 = access100 + 121;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = access100 + 27;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 15;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return "account_register__connect_next_accnt";
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", "screen");
        linkedHashMap.putAll(onNavigationEvent());
        int i2 = ICustomTabsCallback + 87;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return linkedHashMap;
    }

    private final Map<String, Object> onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        sendBroadcastWithAdObject sendbroadcastwithadobject = sendBroadcastWithAdObject.ACCOUNT_REGISTER;
        linkedHashMap.put("category", sendbroadcastwithadobject.getValue());
        linkedHashMap.put("service", sendbroadcastwithadobject.getValue());
        linkedHashMap.put("bank_code", Integer.valueOf(this.IAuthTabCallbackStub.IAuthTabCallbackStub()));
        linkedHashMap.put("count", 1);
        linkedHashMap.put("execution_id", getIssuerAndSerialNumber.onNavigationEvent.onWarmupCompleted(UST_CMP_IssueCertificate_SendConf.BANK));
        String engagementSignalsCallback = setEngagementSignalsCallback();
        if (engagementSignalsCallback != null) {
            Object[] objArr = new Object[1];
            a(TextUtils.getTrimmedLength(""), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7, (char) (6618 - (KeyEvent.getMaxKeyCode() >> 16)), objArr);
            linkedHashMap.put(((String) objArr[0]).intern(), engagementSignalsCallback);
        }
        String strValidateRelationship = validateRelationship();
        if (strValidateRelationship != null) {
            int i2 = ICustomTabsCallback + 119;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            linkedHashMap.put("service_referrer", strValidateRelationship);
        }
        int i4 = access100 + 43;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.app.Activity, viva.republica.toss.account.register.openbanking.OpenBankingAccountRegisterActivity] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v40, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v49, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v50, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r6v51, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r6v52, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r6v53, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r6v54, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    private static final boolean IAuthTabCallback(OpenBankingAccountRegisterActivity openBankingAccountRegisterActivity) {
        Bundle extras;
        Object next;
        Object next2;
        int i = 2 % 2;
        Intent intent = openBankingAccountRegisterActivity.getIntent();
        ?? r1 = Boolean.TRUE;
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("showSmsGuide")) {
            int i2 = access100 + 7;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            if (zzbq.onNavigationEvent(intent)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    ?? string = extras2.getString("showSmsGuide");
                    if (string == 0) {
                        int i4 = ICustomTabsCallback + 51;
                        access100 = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        if (Intrinsics.areEqual(Boolean.class, Integer.class)) {
                            int i6 = ICustomTabsCallback + 13;
                            access100 = i6 % 128;
                            int i7 = i6 % 2;
                            string = StringsKt.toIntOrNull((String) string);
                        } else if (Intrinsics.areEqual(Boolean.class, Long.class)) {
                            string = StringsKt.toLongOrNull((String) string);
                        } else if (Intrinsics.areEqual(Boolean.class, Float.class)) {
                            int i8 = ICustomTabsCallback + 47;
                            access100 = i8 % 128;
                            int i9 = i8 % 2;
                            string = StringsKt.toFloatOrNull((String) string);
                        } else if (Intrinsics.areEqual(Boolean.class, Double.class)) {
                            int i10 = access100 + 11;
                            ICustomTabsCallback = i10 % 128;
                            if (i10 % 2 == 0) {
                                StringsKt.toDoubleOrNull((String) string);
                                throw null;
                            }
                            string = StringsKt.toDoubleOrNull((String) string);
                        } else if (Intrinsics.areEqual(Boolean.class, Short.class)) {
                            string = StringsKt.toShortOrNull((String) string);
                        } else if (Intrinsics.areEqual(Boolean.class, Byte.class)) {
                            string = StringsKt.toByteOrNull((String) string);
                        } else if (Intrinsics.areEqual(Boolean.class, Boolean.class)) {
                            string = Boolean.valueOf(Boolean.parseBoolean(string));
                        } else {
                            if (Intrinsics.areEqual(Boolean.class, Character.class)) {
                                string = Character.valueOf(string.charAt(0));
                            } else if (!Intrinsics.areEqual(Boolean.class, String.class)) {
                                if (Intrinsics.areEqual(Boolean.class, Integer[].class)) {
                                    List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = listSplit$default.iterator();
                                    while (it.hasNext()) {
                                        int i11 = access100 + 55;
                                        ICustomTabsCallback = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            ((String) it.next()).length();
                                            throw null;
                                        }
                                        Object next3 = it.next();
                                        if (((String) next3).length() > 0) {
                                            arrayList.add(next3);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it2.next()).toString())));
                                    }
                                    string = arrayList2.toArray(new Integer[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Long[].class)) {
                                    List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj : listSplit$default2) {
                                        if (((String) obj).length() > 0) {
                                            arrayList3.add(obj);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                                    Iterator it3 = arrayList3.iterator();
                                    while (!(!it3.hasNext())) {
                                        arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it3.next()).toString())));
                                    }
                                    string = arrayList4.toArray(new Long[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Float[].class)) {
                                    List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj2 : listSplit$default3) {
                                        if (((String) obj2).length() > 0) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                                    Iterator it4 = arrayList5.iterator();
                                    while (it4.hasNext()) {
                                        arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it4.next()).toString())));
                                    }
                                    string = arrayList6.toArray(new Float[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Double[].class)) {
                                    List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList7 = new ArrayList();
                                    for (Object obj3 : listSplit$default4) {
                                        if (((String) obj3).length() > 0) {
                                            arrayList7.add(obj3);
                                        }
                                    }
                                    ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                                    Iterator it5 = arrayList7.iterator();
                                    while (it5.hasNext()) {
                                        arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it5.next()).toString())));
                                    }
                                    string = arrayList8.toArray(new Double[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Short[].class)) {
                                    List listSplit$default5 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList9 = new ArrayList();
                                    Iterator it6 = listSplit$default5.iterator();
                                    while (it6.hasNext()) {
                                        int i12 = access100 + 9;
                                        ICustomTabsCallback = i12 % 128;
                                        if (i12 % 2 == 0) {
                                            next2 = it6.next();
                                            int i13 = 34 / 0;
                                            if (((String) next2).length() > 0) {
                                                arrayList9.add(next2);
                                            }
                                        } else {
                                            next2 = it6.next();
                                            if (((String) next2).length() > 0) {
                                                arrayList9.add(next2);
                                            }
                                        }
                                    }
                                    ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                                    Iterator it7 = arrayList9.iterator();
                                    while (it7.hasNext()) {
                                        arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it7.next()).toString())));
                                    }
                                    string = arrayList10.toArray(new Short[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Byte[].class)) {
                                    List listSplit$default6 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList11 = new ArrayList();
                                    for (Object obj4 : listSplit$default6) {
                                        if (((String) obj4).length() > 0) {
                                            arrayList11.add(obj4);
                                        }
                                    }
                                    ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                                    Iterator it8 = arrayList11.iterator();
                                    int i14 = access100 + 53;
                                    ICustomTabsCallback = i14 % 128;
                                    int i15 = i14 % 2;
                                    while (it8.hasNext()) {
                                        int i16 = access100 + 89;
                                        ICustomTabsCallback = i16 % 128;
                                        int i17 = i16 % 2;
                                        arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it8.next()).toString())));
                                    }
                                    string = arrayList12.toArray(new Byte[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Boolean[].class)) {
                                    List listSplit$default7 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList13 = new ArrayList();
                                    for (Object obj5 : listSplit$default7) {
                                        if (((String) obj5).length() > 0) {
                                            arrayList13.add(obj5);
                                        }
                                    }
                                    ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                                    Iterator it9 = arrayList13.iterator();
                                    while (it9.hasNext()) {
                                        arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it9.next()).toString())));
                                    }
                                    string = arrayList14.toArray(new Boolean[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, Character[].class)) {
                                    List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList15 = new ArrayList();
                                    Iterator it10 = listSplit$default8.iterator();
                                    while (it10.hasNext()) {
                                        int i18 = access100 + 87;
                                        ICustomTabsCallback = i18 % 128;
                                        if (i18 % 2 == 0) {
                                            ((String) it10.next()).length();
                                            throw null;
                                        }
                                        Object next4 = it10.next();
                                        if (((String) next4).length() > 0) {
                                            arrayList15.add(next4);
                                        }
                                    }
                                    ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                                    Iterator it11 = arrayList15.iterator();
                                    while (it11.hasNext()) {
                                        arrayList16.add(Character.valueOf(StringsKt.trim((String) it11.next()).toString().charAt(0)));
                                    }
                                    string = arrayList16.toArray(new Character[0]);
                                } else if (Intrinsics.areEqual(Boolean.class, String[].class)) {
                                    List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList17 = new ArrayList();
                                    for (Object obj6 : listSplit$default9) {
                                        if (((String) obj6).length() > 0) {
                                            arrayList17.add(obj6);
                                        }
                                    }
                                    string = arrayList17.toArray(new String[0]);
                                } else {
                                    Object[] enumConstants = Boolean.class.getEnumConstants();
                                    if (enumConstants != null) {
                                        ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                        for (Object obj7 : enumConstants) {
                                            Intrinsics.checkNotNull(obj7, "");
                                            arrayList18.add((Enum) obj7);
                                        }
                                        Iterator it12 = arrayList18.iterator();
                                        while (true) {
                                            if (!it12.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it12.next();
                                            if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                                break;
                                            }
                                        }
                                        string = (Enum) next;
                                    } else {
                                        string = 0;
                                    }
                                    if (string == 0) {
                                        if (zzaj.onNavigationEvent().onActivityLayout()) {
                                            throw new IllegalArgumentException(Boolean.class.getSimpleName() + " is not supported");
                                        }
                                        string = 0;
                                    }
                                }
                            }
                        }
                        obj = (Boolean) (string instanceof Boolean ? string : null);
                    }
                }
            } else {
                Bundle extras3 = intent.getExtras();
                Object obj8 = extras3 != null ? extras3.get("showSmsGuide") : null;
                obj = (Boolean) (obj8 instanceof Boolean ? obj8 : null);
            }
        }
        if (obj != null) {
            r1 = obj;
        }
        return r1.booleanValue();
    }

    public static /* synthetic */ Unit onWarmupCompleted(OpenBankingAccountRegisterActivity openBankingAccountRegisterActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1935079351, iOnExtraCallback, iOnExtraCallback2, -1935079351, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{openBankingAccountRegisterActivity, iEngagementSignalsCallbackDefault});
    }

    private static final Unit onExtraCallbackWithResult(OpenBankingAccountRegisterActivity openBankingAccountRegisterActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1880863865, iOnExtraCallback, iOnExtraCallback2, -1880863864, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{openBankingAccountRegisterActivity, iEngagementSignalsCallbackDefault});
    }

    private final void ICustomTabsServiceStub() {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -63602625, iOnExtraCallback, iOnExtraCallback2, 63602627, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{this});
    }

    @Override // viva.republica.toss.account.register.openbanking.Hilt_OpenBankingAccountRegisterActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access100 + 79;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = access100 + 13;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.account.register.openbanking.Hilt_OpenBankingAccountRegisterActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access100 + 53;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = ICustomTabsCallback + 11;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.account.register.openbanking.Hilt_OpenBankingAccountRegisterActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access100 + 59;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.account.register.openbanking.Hilt_OpenBankingAccountRegisterActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access100 + 63;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = access100 + 35;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void IAuthTabCallback() {
        getInterfaceDescriptor = new char[]{62588, 65066, 57578, 60072, 56696, 51001, 51693, 46011};
        IAuthTabCallback_Parcel = -3686886577591162987L;
    }
}
