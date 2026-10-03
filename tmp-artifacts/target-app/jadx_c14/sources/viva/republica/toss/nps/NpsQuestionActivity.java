package viva.republica.toss.nps;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import im.toss.base.BaseActivity;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import im.toss.network.model.BaseApiResponse;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CERT_SetCertVerifyEnvExternal;
import o.ConvertFloatArrayToByteArray;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.MapConverter;
import o.NetConverter3;
import o.SetDetectableSize;
import o.TombstoneProtosMemoryMappingBuilder;
import o.clearTid;
import o.deserializeUriNullableCollection;
import o.getParamImp;
import o.initMiniApp;
import o.onExitFullscreen;
import o.onPageExit;
import o.setMessageBytes;
import o.writeRaw;
import viva.republica.toss.network.model.user.NpsSurvey;
import viva.republica.toss.nps.NpsQuestionActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NpsQuestionActivity extends BaseActivity {
    private static short[] IAuthTabCallback_Parcel;
    private String IAuthTabCallbackStub;
    private static final byte[] $$a = {87, -2, 11, -41};
    private static final int $$b = 122;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 0;
    private static int ICustomTabsCallback = 1;
    private static int onTransact = 2034642332;
    private static int access000 = -1538795432;
    private static int getInterfaceDescriptor = -442611686;
    private static byte[] IAuthTabCallbackStubProxy = {-14, 96, -3, -14, 100, -2, 96, 8};
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallbackDefault = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.nps.NpsQuestionActivity$$ExternalSyntheticLambda6
        public final Object invoke(Object obj) {
            return NpsQuestionActivity.onExtraCallbackWithResult(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });
    private final Lazy asInterface = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallback(this));
    private long asBinder = -1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, int r8, short r9) {
        /*
            int r7 = r7 * 2
            int r7 = 1 - r7
            int r9 = r9 * 4
            int r9 = r9 + 4
            byte[] r0 = viva.republica.toss.nps.NpsQuestionActivity.$$a
            int r8 = r8 * 3
            int r8 = 115 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r4 = r2
            goto L2c
        L16:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L1a:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2c:
            int r9 = r9 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.nps.NpsQuestionActivity.$$c(int, int, short):java.lang.String");
    }

    public static /* synthetic */ Unit IAuthTabCallback(NpsQuestionActivity npsQuestionActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 55;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(npsQuestionActivity, deserializeurinullablecollection);
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = i2 | i7;
        int i9 = ~i4;
        int i10 = ~((~i2) | i7);
        int i11 = i6 + i4 + i + (1977613057 * i3) + (454551927 * i5);
        int i12 = i11 * i11;
        int i13 = (1378041352 * i6) + 473956352 + (953991674 * i4) + (212024839 * i8) + (i9 * (-212024839)) + ((-212024839) * i10) + (1166016512 * i) + ((-981467136) * i3) + ((-830472192) * i5) + ((-499122176) * i12);
        int i14 = (i6 * (-1131120504)) + 246467939 + (i4 * (-1131119078)) + (i8 * (-713)) + (i9 * 713) + (i10 * 713) + (i * (-1131119791)) + (i3 * (-1039407535)) + (i5 * 1820920743) + (i12 * 1447034880);
        int i15 = i13 + (i14 * i14 * 1170210816);
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? onExtraCallback(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(NpsQuestionActivity npsQuestionActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 37;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(npsQuestionActivity, th);
        int i4 = ICustomTabsCallback + 43;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(NpsQuestionActivity npsQuestionActivity, NpsSurvey npsSurvey) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 93;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            return (Unit) onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1091424472, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{npsQuestionActivity, npsSurvey}, -1091424469);
        }
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NpsQuestionActivity npsQuestionActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 73;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(npsQuestionActivity, iEngagementSignalsCallbackDefault);
        }
        IAuthTabCallback(npsQuestionActivity, iEngagementSignalsCallbackDefault);
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(NpsQuestionActivity npsQuestionActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 107;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(npsQuestionActivity);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(NpsQuestionActivity npsQuestionActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 49;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -496495995, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{npsQuestionActivity, dialogInterface}, 496495996);
        int i4 = ICustomTabsCallback + 55;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NpsQuestionActivity npsQuestionActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 19;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(npsQuestionActivity, setDetectableSize);
        }
        onExtraCallbackWithResult(npsQuestionActivity, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(TextView textView, NpsQuestionActivity npsQuestionActivity, NpsSurvey npsSurvey, View view) {
        int i = 2 % 2;
        int i2 = access100 + 3;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(textView, npsQuestionActivity, npsSurvey, view);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 55;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 79;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 63;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return 1000288L;
    }

    public static final class onExtraCallback implements Function0<CERT_SetCertVerifyEnvExternal> {
        final /* synthetic */ Activity onExtraCallbackWithResult;

        public onExtraCallback(Activity activity) {
            this.onExtraCallbackWithResult = activity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final CERT_SetCertVerifyEnvExternal invoke() {
            LayoutInflater layoutInflater = this.onExtraCallbackWithResult.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_SetCertVerifyEnvExternal.IAuthTabCallback(layoutInflater);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(viva.republica.toss.nps.NpsQuestionActivity r4, o.IEngagementSignalsCallbackDefault r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.nps.NpsQuestionActivity.ICustomTabsCallback
            int r1 = r1 + 77
            int r2 = r1 % 128
            viva.republica.toss.nps.NpsQuestionActivity.access100 = r2
            int r1 = r1 % r0
            r2 = -1
            java.lang.String r3 = ""
            if (r1 == 0) goto L1e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            int r5 = r5.onNavigationEvent()
            r1 = 1
            int r1 = r1 / 0
            if (r5 != r2) goto L38
            goto L27
        L1e:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            int r5 = r5.onNavigationEvent()
            if (r5 != r2) goto L38
        L27:
            r4.finish()
            int r4 = viva.republica.toss.nps.NpsQuestionActivity.ICustomTabsCallback
            int r4 = r4 + 19
            int r5 = r4 % 128
            viva.republica.toss.nps.NpsQuestionActivity.access100 = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L38
            r4 = 3
            int r4 = r4 % 4
        L38:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.nps.NpsQuestionActivity.IAuthTabCallback(viva.republica.toss.nps.NpsQuestionActivity, o.IEngagementSignalsCallbackDefault):kotlin.Unit");
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        NpsQuestionActivity npsQuestionActivity = (NpsQuestionActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 99;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        CERT_SetCertVerifyEnvExternal cERT_SetCertVerifyEnvExternal = (CERT_SetCertVerifyEnvExternal) npsQuestionActivity.asInterface.getValue();
        int i4 = access100 + 93;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return cERT_SetCertVerifyEnvExternal;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 9;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 69;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return "toss__nps_score";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("survey_id", Long.valueOf(this.asBinder));
        Object[] objArr = new Object[1];
        a((short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 50), (byte) ((-61) - TextUtils.indexOf((CharSequence) "", '0')), 587074156 - (Process.myPid() >> 22), (-1104777120) - KeyEvent.keyCodeFromString(""), TextUtils.getOffsetBefore("", 0) - 72, objArr);
        linkedHashMap.put(((String) objArr[0]).intern(), this.IAuthTabCallbackStub);
        int i2 = access100 + 19;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085 A[PHI: r15
      0x0085: PHI (r15v21 android.os.Bundle) = (r15v20 android.os.Bundle), (r15v123 android.os.Bundle) binds: [B:21:0x0083, B:18:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.app.Activity, androidx.appcompat.app.AppCompatActivity, im.toss.base.BaseActivity, java.lang.Object, viva.republica.toss.nps.NpsQuestionActivity] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v36, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v44, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r8v45, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v46, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r8v47, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r8v48, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r8v49, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r8v50, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v55, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v56, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.nps.NpsQuestionActivity.onCreate(android.os.Bundle):void");
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 61;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(NpsQuestionActivity npsQuestionActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = access100 + 91;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity.IAuthTabCallback(npsQuestionActivity, (String) null, false, 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 7;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return unit;
    }

    private static final void onWarmupCompleted(NpsQuestionActivity npsQuestionActivity) {
        int i = 2 % 2;
        int i2 = access100 + 23;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        npsQuestionActivity.bo_();
        int i4 = access100 + 7;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        NpsQuestionActivity npsQuestionActivity = (NpsQuestionActivity) objArr[0];
        NpsSurvey npsSurvey = (NpsSurvey) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 57;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(npsSurvey);
            npsQuestionActivity.onWarmupCompleted(npsSurvey);
            Unit unit = Unit.INSTANCE;
            int i3 = ICustomTabsCallback + 75;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 62 / 0;
            }
            return unit;
        }
        Intrinsics.checkNotNull(npsSurvey);
        npsQuestionActivity.onWarmupCompleted(npsSurvey);
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        NpsQuestionActivity npsQuestionActivity = (NpsQuestionActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 9;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            npsQuestionActivity.finish();
            Unit unit = Unit.INSTANCE;
            int i3 = access100 + 125;
            ICustomTabsCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 41 / 0;
            }
            return unit;
        }
        npsQuestionActivity.finish();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(NpsQuestionActivity npsQuestionActivity, Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        getParamImp.onWarmupCompleted(th, npsQuestionActivity, false, (initMiniApp) null, (Function0) null, new NpsQuestionActivity$.ExternalSyntheticLambda8(npsQuestionActivity), 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = access100 + 55;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 85 / 0;
        }
        return unit;
    }

    private final void onWarmupCompleted(long j) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 11;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0 ? j >= 0 : j >= 1) {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - ((Process.getThreadPriority(0) + 20) >> 6)), Color.alpha(0) + 22, (ViewConfiguration.getFadingEdgeLength() >> 16) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj2 = ((Field) objOnExtraCallback).get(null);
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 22 - Drawable.resolveOpacity(0, 0), 24734 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
                }
                writeRaw<BaseApiResponse<NpsSurvey>> writerawOnExtraCallbackWithResult = ((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj2, null)).onExtraCallbackWithResult(j);
                MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
                Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
                writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(new IAuthTabCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onExtraCallback(new NpsQuestionActivity$.ExternalSyntheticLambda1(new NpsQuestionActivity$.ExternalSyntheticLambda0(this))).onWarmupCompleted(new NpsQuestionActivity$.ExternalSyntheticLambda2(this));
                Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
                setMessageBytes.onExtraCallbackWithResult(writerawOnWarmupCompleted, new NpsQuestionActivity$.ExternalSyntheticLambda3(this), new NpsQuestionActivity$.ExternalSyntheticLambda4(this));
                return;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        finish();
        int i3 = ICustomTabsCallback + 57;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(TextView textView, NpsQuestionActivity npsQuestionActivity, NpsSurvey npsSurvey, View view) {
        int i = 2 % 2;
        Integer intOrNull = StringsKt.toIntOrNull(textView.getText().toString());
        if (intOrNull != null) {
            int i2 = access100 + 113;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {npsQuestionActivity, npsSurvey, Integer.valueOf(intOrNull.intValue())};
            onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019651).substring(0, 13).codePointAt(3) + 1658763758, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -488007779, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(12) + 291051593, objArr, 488007779);
        }
        int i4 = ICustomTabsCallback + 9;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallbackWithResult(NpsQuestionActivity npsQuestionActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 55;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().put("action_type", "click");
        setDetectableSize.onExtraCallback().put("screen_name", npsQuestionActivity.getScreenName());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 9;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, viva.republica.toss.nps.NpsQuestionActivity] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ?? r0 = (NpsQuestionActivity) objArr[0];
        NpsSurvey npsSurvey = (NpsSurvey) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "click__nps_" + iIntValue, false, (String) null, (List) null, (Map) null, new NpsQuestionActivity$.ExternalSyntheticLambda5((NpsQuestionActivity) r0), 30, (Object) null);
        ((NpsQuestionActivity) r0).IAuthTabCallbackDefault.onNavigationEvent(NpsAnswerActivity.Companion.onExtraCallback((Context) r0, npsSurvey, iIntValue, ((NpsQuestionActivity) r0).IAuthTabCallbackStub));
        int i2 = ICustomTabsCallback + 109;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private final TextView[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        TextView textView = ((CERT_SetCertVerifyEnvExternal) onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 895958405, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, -895958403)).onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        TextView textView2 = ((CERT_SetCertVerifyEnvExternal) onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 895958405, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, -895958403)).asInterface;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        TextView textView3 = ((CERT_SetCertVerifyEnvExternal) onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 895958405, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, -895958403)).IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        TextView textView4 = ((CERT_SetCertVerifyEnvExternal) onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 895958405, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, -895958403)).onTransact;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        TextView textView5 = ((CERT_SetCertVerifyEnvExternal) onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 895958405, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, -895958403)).IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        TextView textView6 = ((CERT_SetCertVerifyEnvExternal) onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 895958405, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, -895958403)).access000;
        Intrinsics.checkNotNullExpressionValue(textView6, "");
        TextView textView7 = ((CERT_SetCertVerifyEnvExternal) onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 895958405, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, -895958403)).access100;
        Intrinsics.checkNotNullExpressionValue(textView7, "");
        TextView textView8 = ((CERT_SetCertVerifyEnvExternal) onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 895958405, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, -895958403)).IAuthTabCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(textView8, "");
        TextView textView9 = ((CERT_SetCertVerifyEnvExternal) onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 895958405, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, -895958403)).IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullExpressionValue(textView9, "");
        TextView textView10 = ((CERT_SetCertVerifyEnvExternal) onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 895958405, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, -895958403)).getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(textView10, "");
        TextView textView11 = ((CERT_SetCertVerifyEnvExternal) onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 895958405, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, -895958403)).asBinder;
        Intrinsics.checkNotNullExpressionValue(textView11, "");
        TextView[] textViewArr = {textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11};
        int i4 = access100 + 11;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return textViewArr;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01ff A[PHI: r1
      0x01ff: PHI (r1v8 int) = (r1v7 int), (r1v54 int) binds: [B:47:0x01fd, B:44:0x01eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0201 A[PHI: r1
      0x0201: PHI (r1v51 int) = (r1v7 int), (r1v54 int) binds: [B:47:0x01fd, B:44:0x01eb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r24, byte r25, int r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.nps.NpsQuestionActivity.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    private final void onWarmupCompleted(NpsSurvey npsSurvey) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 65;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        ((CERT_SetCertVerifyEnvExternal) onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 895958405, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, -895958403)).writeTypedObject.setText(npsSurvey.onTransact());
        ((CERT_SetCertVerifyEnvExternal) onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 895958405, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, -895958403)).onExtraCallbackWithResult.setText(npsSurvey.asInterface());
        TextView[] textViewArrIAuthTabCallback = IAuthTabCallback();
        int length = textViewArrIAuthTabCallback.length;
        int i4 = 0;
        while (i4 < length) {
            TextView textView = textViewArrIAuthTabCallback[i4];
            textView.setOnClickListener(new NpsQuestionActivity$.ExternalSyntheticLambda7(textView, this, npsSurvey));
            i4++;
            int i5 = access100 + 33;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 % 3;
            }
        }
        Group group = ((CERT_SetCertVerifyEnvExternal) onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 895958405, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, -895958403)).extraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(0);
    }

    private final CERT_SetCertVerifyEnvExternal onNavigationEvent() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (CERT_SetCertVerifyEnvExternal) onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 895958405, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, -895958403);
    }

    private static final Unit onNavigationEvent(NpsQuestionActivity npsQuestionActivity, DialogInterface dialogInterface) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -496495995, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{npsQuestionActivity, dialogInterface}, 496495996);
    }

    private static final Unit onWarmupCompleted(NpsQuestionActivity npsQuestionActivity, NpsSurvey npsSurvey) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1091424472, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{npsQuestionActivity, npsSurvey}, -1091424469);
    }

    private final void onExtraCallbackWithResult(NpsSurvey npsSurvey, int i) {
        Object[] objArr = {this, npsSurvey, Integer.valueOf(i)};
        onExtraCallback(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019651).substring(0, 13).codePointAt(3) + 1658763758, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -488007779, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(12) + 291051593, objArr, 488007779);
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = access100 + 15;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = access100 + 71;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = access100 + 99;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = ICustomTabsCallback + 93;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 109;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        int i5 = ICustomTabsCallback + 77;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
    }
}
