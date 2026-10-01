package o;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.q4ExternalSyntheticLambda12;
import o.q4ExternalSyntheticLambda2;
import o.r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q4ExternalSyntheticLambda12 {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static final Regex IAuthTabCallback;
    private static int IAuthTabCallbackStub = 0;
    private static int access000 = 0;
    private static int access100 = 1;
    private static int asBinder = 1;
    private static final List<Regex> onNavigationEvent;
    private static long onTransact;
    private final Function0<Long> IAuthTabCallbackDefault;
    private final Map<String, q5ExternalSyntheticLambda0> asInterface;
    private final Set<String> onExtraCallback;
    private final Set<String> onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    public q4ExternalSyntheticLambda12() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[0];
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        int iOnExtraCallback4 = C40Encoder.onExtraCallback();
        if (i3 != 0) {
            return ((Long) onExtraCallbackWithResult(objArr, iOnExtraCallback, iOnExtraCallback2, iOnExtraCallback3, 504150960, -504150960, iOnExtraCallback4)).longValue();
        }
        ((Long) onExtraCallbackWithResult(objArr, iOnExtraCallback, iOnExtraCallback2, iOnExtraCallback3, 504150960, -504150960, iOnExtraCallback4)).longValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | (~(i7 | i5)) | (~(i8 | i5));
        int i10 = ~(i | i7);
        int i11 = i5 | i10 | (~(i8 | i4));
        int i12 = i5 + i4 + i2 + ((-393945980) * i3) + (1728320405 * i6);
        int i13 = i12 * i12;
        int i14 = ((-1552544754) * i5) + 1566572544 + ((-1100352524) * i4) + (i9 * (-226096115)) + ((-226096115) * i10) + (226096115 * i11) + ((-1326448640) * i2) + (2076180480 * i3) + ((-877658112) * i6) + (214302720 * i13);
        int i15 = ((i5 * (-252835662)) - 192251156) + (i4 * (-252834676)) + (i9 * (-493)) + (i10 * (-493)) + (i11 * 493) + (i2 * (-252835169)) + (i3 * 1574575612) + (i6 * 147979147) + (i13 * (-1426456576));
        return i14 + ((i15 * i15) * 2075787264) != 1 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    public q4ExternalSyntheticLambda12(@NotNull Function0<Long> function0, @NotNull String str, @NotNull Set<String> set, @NotNull Set<String> set2, @NotNull Map<String, q5ExternalSyntheticLambda0> map) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(set2, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.IAuthTabCallbackDefault = function0;
        this.onWarmupCompleted = str;
        this.onExtraCallbackWithResult = set;
        this.onExtraCallback = set2;
        this.asInterface = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q4ExternalSyntheticLambda12(Function0 function0, String str, Set set, Set set2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        function0 = (i & 1) != 0 ? new Function0() { // from class: im.toss.securities.libs.performance.tracker.domain.monitoring.MonitoringEventBuilder$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 53;
                onWarmupCompleted = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    Long.valueOf(q4ExternalSyntheticLambda12.onExtraCallbackWithResult());
                    throw null;
                }
                Long lValueOf = Long.valueOf(q4ExternalSyntheticLambda12.onExtraCallbackWithResult());
                int i4 = onWarmupCompleted + 95;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return lValueOf;
                }
                obj.hashCode();
                throw null;
            }
        } : function0;
        if ((i & 2) != 0) {
            int i2 = IAuthTabCallbackStub + 79;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 88 / 0;
            }
            int i4 = 2 % 2;
            str = "2026-05-22.p0";
        }
        String str2 = str;
        if ((i & 4) != 0) {
            set = q4ExternalSyntheticLambda7.onExtraCallback.onExtraCallback();
            int i5 = 2 % 2;
        }
        Set set3 = set;
        Set setOnNavigationEvent = (i & 8) != 0 ? q4ExternalSyntheticLambda7.onExtraCallback.onNavigationEvent() : set2;
        if ((i & 16) != 0) {
            int i6 = IAuthTabCallbackStub + 31;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                q5.onExtraCallback.onExtraCallbackWithResult();
                throw null;
            }
            map = q5.onExtraCallback.onExtraCallbackWithResult();
        }
        this(function0, str2, set3, setOnNavigationEvent, map);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i4 = IAuthTabCallbackStub + 81;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return Long.valueOf(jCurrentTimeMillis);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 77;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 19627 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onTransact ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 58 - ImageFormat.getBitsPerPixel(0), 6382 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 117;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 3;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i8 = $11 + 115;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), TextUtils.getOffsetAfter("", 0) + 59, (KeyEvent.getMaxKeyCode() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    public final q4ExternalSyntheticLambda2 onExtraCallback(@NotNull q4ExternalSyntheticLambda3 q4externalsyntheticlambda3) {
        String strAccess000;
        int i = 2 % 2;
        String strIntern = "";
        Intrinsics.checkNotNullParameter(q4externalsyntheticlambda3, "");
        ArrayList arrayList = new ArrayList();
        onWarmupCompleted("metricName", q4externalsyntheticlambda3.onNavigationEvent(), arrayList);
        if (!this.onExtraCallbackWithResult.contains(q4externalsyntheticlambda3.onNavigationEvent())) {
            arrayList.add(IAuthTabCallback("unsupported_metric_name", "metricName", "Dashboard v1에서 사용하려면 metricName이 먼저 registry에 등록되어 있어야 합니다."));
        }
        onWarmupCompleted("viewName", q4externalsyntheticlambda3.access100(), arrayList);
        onWarmupCompleted("samplePolicyId", q4externalsyntheticlambda3.getInterfaceDescriptor(), arrayList);
        onWarmupCompleted("env", q4externalsyntheticlambda3.IAuthTabCallback(), arrayList);
        onWarmupCompleted("releaseTrack", q4externalsyntheticlambda3.asBinder(), arrayList);
        onWarmupCompleted("runningType", q4externalsyntheticlambda3.IAuthTabCallbackStub(), arrayList);
        onWarmupCompleted("appVersionBucket", q4externalsyntheticlambda3.onExtraCallbackWithResult(), arrayList);
        onWarmupCompleted("metricOwner", q4externalsyntheticlambda3.onTransact(), arrayList);
        onWarmupCompleted("journey", (String) q4ExternalSyntheticLambda3.onExtraCallback(1170439454, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{q4externalsyntheticlambda3}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -1170439454), arrayList);
        q4ExternalSyntheticLambda7 q4externalsyntheticlambda7 = q4ExternalSyntheticLambda7.onExtraCallback;
        if (!q4externalsyntheticlambda7.onWarmupCompleted().contains(q4externalsyntheticlambda3.IAuthTabCallback_Parcel())) {
            arrayList.add(IAuthTabCallback("unsupported_source_type", "sourceType", "sourceType은 " + q4externalsyntheticlambda7.onWarmupCompleted() + " 중 하나여야 합니다."));
        }
        int i2 = 0;
        if (q4externalsyntheticlambda3.IAuthTabCallbackDefault() && ((strAccess000 = q4externalsyntheticlambda3.access000()) == null || StringsKt.isBlank(strAccess000))) {
            arrayList.add(IAuthTabCallback("missing_slo_id", "slo_id", "SLO 모니터링 이벤트에는 비어있지 않은 sloId가 필요합니다."));
        } else {
            String strAccess0002 = q4externalsyntheticlambda3.access000();
            if (strAccess0002 == null || StringsKt.isBlank(strAccess0002)) {
                Object[] objArr = new Object[1];
                a(new char[]{12282, 39548, 17652, 3940}, View.combineMeasuredStates(0, 0) + 46471, objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                strIntern = q4externalsyntheticlambda3.access000();
            }
        }
        if (((List) q4ExternalSyntheticLambda3.onExtraCallback(-260581139, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{q4externalsyntheticlambda3}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 260581140)).isEmpty()) {
            arrayList.add(IAuthTabCallback("missing_metrics", "metrics", "최소 1개 이상의 metric step이 필요합니다."));
        }
        Iterator it = ((List) q4ExternalSyntheticLambda3.onExtraCallback(-260581139, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{q4externalsyntheticlambda3}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 260581140)).iterator();
        int i3 = asBinder + 67;
        while (true) {
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            if (!it.hasNext()) {
                for (Map.Entry<String, Object> entry : q4externalsyntheticlambda3.onWarmupCompleted().entrySet()) {
                    onExtraCallback(entry.getKey(), entry.getValue(), arrayList);
                }
                Iterator it2 = CollectionsKt.intersect(q4externalsyntheticlambda3.onWarmupCompleted().keySet(), q4ExternalSyntheticLambda7.onExtraCallback.IAuthTabCallback()).iterator();
                while (it2.hasNext()) {
                    arrayList.add(IAuthTabCallback("protected_dimension_override", (String) it2.next(), "보호된 monitoring dimension은 MonitoringEvent의 typed field로만 설정해야 합니다."));
                }
                onNavigationEvent(q4externalsyntheticlambda3, arrayList);
                return !arrayList.isEmpty() ? new q4ExternalSyntheticLambda2.onExtraCallbackWithResult(arrayList) : new q4ExternalSyntheticLambda2.onExtraCallback(IAuthTabCallback(q4externalsyntheticlambda3, strIntern));
            }
            int i5 = asBinder + 17;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                it.next();
                throw null;
            }
            Object next = it.next();
            if (i2 < 0) {
                int i6 = asBinder + 117;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                CollectionsKt.throwIndexOverflow();
            }
            onExtraCallbackWithResult(new Object[]{this, Integer.valueOf(i2), (q4ExternalSyntheticLambda6) next, arrayList}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 438005478, -438005477, C40Encoder.onExtraCallback());
            i2++;
            i3 = asBinder + 85;
        }
    }

    private final r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks IAuthTabCallback(q4ExternalSyntheticLambda3 q4externalsyntheticlambda3, String str) {
        int i = 2 % 2;
        long jLongValue = ((Number) this.IAuthTabCallbackDefault.invoke()).longValue();
        String strOnNavigationEvent = q4externalsyntheticlambda3.onNavigationEvent();
        String strAccess100 = q4externalsyntheticlambda3.access100();
        String strIAuthTabCallback_Parcel = q4externalsyntheticlambda3.IAuthTabCallback_Parcel();
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        List list = (List) q4ExternalSyntheticLambda3.onExtraCallback(-260581139, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{q4externalsyntheticlambda3}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent, 260581140);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        int i2 = asBinder + 31;
        IAuthTabCallbackStub = i2 % 128;
        while (true) {
            int i3 = i2 % 2;
            if (!it.hasNext()) {
                return new r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks(jLongValue, strOnNavigationEvent, strAccess100, strIAuthTabCallback_Parcel, arrayList, access8100.onWarmupCompleted(onNavigationEvent(q4externalsyntheticlambda3, str), q4externalsyntheticlambda3.onWarmupCompleted()));
            }
            q4ExternalSyntheticLambda6 q4externalsyntheticlambda6 = (q4ExternalSyntheticLambda6) it.next();
            arrayList.add(new r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks.onExtraCallback(q4externalsyntheticlambda6.onNavigationEvent(), q4externalsyntheticlambda6.onWarmupCompleted(), q4externalsyntheticlambda6.IAuthTabCallback(), q4externalsyntheticlambda6.onExtraCallback()));
            i2 = IAuthTabCallbackStub + 15;
            asBinder = i2 % 128;
        }
    }

    private final Map<String, String> onNavigationEvent(q4ExternalSyntheticLambda3 q4externalsyntheticlambda3, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("schema_version", "se_rum.v1"), getWrite.IAuthTabCallback("privacy_schema_version", "se_privacy.v1"), getWrite.IAuthTabCallback("pii_allowed", "false"), getWrite.IAuthTabCallback("raw_url_allowed", "false"), getWrite.IAuthTabCallback("metric_contract_version", this.onWarmupCompleted), getWrite.IAuthTabCallback("sample_policy_id", q4externalsyntheticlambda3.getInterfaceDescriptor()), getWrite.IAuthTabCallback("release_track", q4externalsyntheticlambda3.asBinder()), getWrite.IAuthTabCallback("running_type", q4externalsyntheticlambda3.IAuthTabCallbackStub()), getWrite.IAuthTabCallback("app_version_bucket", q4externalsyntheticlambda3.onExtraCallbackWithResult()), getWrite.IAuthTabCallback("metric_owner", q4externalsyntheticlambda3.onTransact()), getWrite.IAuthTabCallback("slo_id", str), getWrite.IAuthTabCallback("journey", (String) q4ExternalSyntheticLambda3.onExtraCallback(1170439454, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{q4externalsyntheticlambda3}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -1170439454)), getWrite.IAuthTabCallback("env", q4externalsyntheticlambda3.IAuthTabCallback()), getWrite.IAuthTabCallback("telemetry_source_version", "android_metric_v1"), getWrite.IAuthTabCallback("cardinality_policy_id", "se_dash_v1_low_card")});
        int i4 = asBinder + 79;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return mapOnWarmupCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6 A[PHI: r6
      0x00d6: PHI (r6v16 java.lang.String) = (r6v15 java.lang.String), (r6v20 java.lang.String) binds: [B:28:0x00d4, B:25:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean z;
        boolean z2;
        String strOnExtraCallback;
        q4ExternalSyntheticLambda12 q4externalsyntheticlambda12 = (q4ExternalSyntheticLambda12) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        q4ExternalSyntheticLambda6 q4externalsyntheticlambda6 = (q4ExternalSyntheticLambda6) objArr[2];
        List<q4ExternalSyntheticLambda2.IAuthTabCallback> list = (List) objArr[3];
        int i = 2 % 2;
        String str = "metrics[" + iIntValue + "]";
        q4externalsyntheticlambda12.onWarmupCompleted(str + ".step", q4externalsyntheticlambda6.onNavigationEvent(), list);
        if (!q4externalsyntheticlambda12.onExtraCallback.contains(q4externalsyntheticlambda6.onNavigationEvent())) {
            list.add(q4externalsyntheticlambda12.IAuthTabCallback("unsupported_metric_step", str + ".step", "Dashboard v1에서 사용하려면 metric step이 먼저 registry에 등록되어 있어야 합니다."));
        }
        if (q4externalsyntheticlambda6.onExtraCallback() != null) {
            int i2 = IAuthTabCallbackStub + 61;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 37;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        boolean z3 = q4externalsyntheticlambda6.onWarmupCompleted() != null;
        if (q4externalsyntheticlambda6.IAuthTabCallback() != null) {
            int i7 = IAuthTabCallbackStub + 103;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z3 && !z2) {
            list.add(q4externalsyntheticlambda12.IAuthTabCallback("missing_metric_measurement", str, "Metric에는 숫자 value 또는 startTime/endTime 측정값이 필요합니다."));
        }
        if (z) {
            int i9 = asBinder + 27;
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 != 0) {
                strOnExtraCallback = q4externalsyntheticlambda6.onExtraCallback();
                int i10 = 21 / 0;
                if (strOnExtraCallback != null) {
                    Double doubleOrNull = StringsKt.toDoubleOrNull(strOnExtraCallback);
                    if (doubleOrNull == null || Math.abs(doubleOrNull.doubleValue()) > Double.MAX_VALUE) {
                        list.add(q4externalsyntheticlambda12.IAuthTabCallback("metric_value_not_numeric", str + ".value", "metric_v1은 숫자가 아닌 값을 버리므로 metric.value는 숫자 문자열이어야 합니다."));
                    }
                }
            } else {
                strOnExtraCallback = q4externalsyntheticlambda6.onExtraCallback();
                if (strOnExtraCallback != null) {
                }
            }
        }
        if (z3 != z2) {
            list.add(q4externalsyntheticlambda12.IAuthTabCallback("metric_duration_incomplete", str, "Duration metric은 startTime과 endTime을 함께 제공해야 합니다."));
        }
        Long lOnWarmupCompleted = q4externalsyntheticlambda6.onWarmupCompleted();
        Long lIAuthTabCallback = q4externalsyntheticlambda6.IAuthTabCallback();
        if (lOnWarmupCompleted == null || lIAuthTabCallback == null || lIAuthTabCallback.longValue() >= lOnWarmupCompleted.longValue()) {
            return null;
        }
        int i11 = asBinder + 1;
        IAuthTabCallbackStub = i11 % 128;
        int i12 = i11 % 2;
        list.add(q4externalsyntheticlambda12.IAuthTabCallback("metric_duration_negative", str, "Metric endTime은 startTime보다 크거나 같아야 합니다."));
        return null;
    }

    private final void onNavigationEvent(q4ExternalSyntheticLambda3 q4externalsyntheticlambda3, List<q4ExternalSyntheticLambda2.IAuthTabCallback> list) {
        String str;
        int i = 2 % 2;
        q5ExternalSyntheticLambda0 q5externalsyntheticlambda0 = this.asInterface.get(q4externalsyntheticlambda3.onNavigationEvent());
        if (q5externalsyntheticlambda0 != null) {
            int i2 = IAuthTabCallbackStub + 105;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            for (String str2 : q5externalsyntheticlambda0.onExtraCallbackWithResult()) {
                Object obj = q4externalsyntheticlambda3.onWarmupCompleted().get(str2);
                if (!(obj instanceof String) || StringsKt.isBlank((CharSequence) obj)) {
                    list.add(IAuthTabCallback("missing_metric_required_dimension", str2, "Metric " + q4externalsyntheticlambda3.onNavigationEvent() + "에는 비어있지 않은 '" + str2 + "' dimension이 필요합니다."));
                }
            }
            Iterator it = ((List) q4ExternalSyntheticLambda3.onExtraCallback(-260581139, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), new Object[]{q4externalsyntheticlambda3}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 260581140)).iterator();
            int i4 = 0;
            while (!(!it.hasNext())) {
                Object next = it.next();
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                q4ExternalSyntheticLambda6 q4externalsyntheticlambda6 = (q4ExternalSyntheticLambda6) next;
                if (!q5externalsyntheticlambda0.onNavigationEvent().contains(q4externalsyntheticlambda6.onNavigationEvent())) {
                    list.add(IAuthTabCallback("unsupported_metric_step_for_metric", "metrics[" + i4 + "].step", "Metric " + q4externalsyntheticlambda3.onNavigationEvent() + "에서는 step " + q4externalsyntheticlambda6.onNavigationEvent() + "을 사용할 수 없습니다."));
                }
                i4++;
            }
            Object obj2 = q4externalsyntheticlambda3.onWarmupCompleted().get("sli_signal_type");
            String str3 = !((obj2 instanceof String) ^ true) ? (String) obj2 : null;
            Object obj3 = q4externalsyntheticlambda3.onWarmupCompleted().get("alert_policy");
            if (obj3 instanceof String) {
                int i5 = IAuthTabCallbackStub + 109;
                asBinder = i5 % 128;
                if (i5 % 2 == 0) {
                    str = (String) obj3;
                    int i6 = 81 / 0;
                } else {
                    str = (String) obj3;
                }
            } else {
                str = null;
            }
            if (str3 != null) {
                q5a q5aVar = q5a.onNavigationEvent;
                if (!q5aVar.onNavigationEvent().contains(str3)) {
                    list.add(IAuthTabCallback("unsupported_sli_signal_type", "sli_signal_type", "sli_signal_type은 " + q5aVar.onNavigationEvent() + " 중 하나여야 합니다."));
                }
            }
            if (str != null) {
                int i7 = IAuthTabCallbackStub + 57;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                q5a q5aVar2 = q5a.onNavigationEvent;
                if (!q5aVar2.IAuthTabCallback().contains(str)) {
                    list.add(IAuthTabCallback("unsupported_alert_policy", "alert_policy", "alert_policy는 " + q5aVar2.IAuthTabCallback() + " 중 하나여야 합니다."));
                }
            }
            if (str3 != null && !q5externalsyntheticlambda0.onExtraCallback().contains(str3)) {
                list.add(IAuthTabCallback("unsupported_metric_signal_type", "sli_signal_type", "Metric " + q4externalsyntheticlambda3.onNavigationEvent() + "에서는 sli_signal_type=" + str3 + " 값을 사용할 수 없습니다."));
            }
            if (str != null && !q5externalsyntheticlambda0.IAuthTabCallback().contains(str)) {
                list.add(IAuthTabCallback("unsupported_metric_alert_policy", "alert_policy", "Metric " + q4externalsyntheticlambda3.onNavigationEvent() + "에서는 alert_policy=" + str + " 값을 사용할 수 없습니다."));
            }
            if (str3 != null) {
                int i9 = asBinder + 65;
                IAuthTabCallbackStub = i9 % 128;
                if (i9 % 2 != 0) {
                    throw null;
                }
                if (str == null || q5a.onNavigationEvent.onExtraCallbackWithResult(str3, str)) {
                    return;
                }
                list.add(IAuthTabCallback("unsupported_signal_alert_policy_pair", "alert_policy", "sli_signal_type=" + str3 + " 조합에서는 alert_policy=" + str + " 값을 사용할 수 없습니다."));
            }
        }
    }

    private final void onExtraCallback(String str, Object obj, List<q4ExternalSyntheticLambda2.IAuthTabCallback> list) {
        int i = 2 % 2;
        if (!IAuthTabCallback.onExtraCallbackWithResult(str)) {
            list.add(IAuthTabCallback("invalid_dimension_key", str, "Dimension key는 low-cardinality snake_case key여야 합니다."));
        }
        if (q4ExternalSyntheticLambda7.onExtraCallback.onExtraCallbackWithResult().contains(onWarmupCompleted(str))) {
            list.add(IAuthTabCallback("forbidden_dimension_key", str, "해당 dimension key는 개인정보 보호 모니터링 정책상 사용할 수 없습니다."));
        }
        if (obj instanceof Number) {
            list.add(IAuthTabCallback("numeric_dimension_value", str, "count/gauge 값은 dimension이 아니라 metric step으로 보내야 하며, dimension은 enum 또는 bucket이어야 합니다."));
            return;
        }
        Object obj2 = null;
        if ((obj instanceof String) || !(!(obj instanceof Boolean))) {
            String string = obj.toString();
            if (string.length() > 120) {
                list.add(IAuthTabCallback("dimension_value_too_long", str, "Dimension value가 low-cardinality dashboard label로 사용하기에 너무 깁니다."));
            }
            Iterator<T> it = onNavigationEvent.iterator();
            while (it.hasNext()) {
                int i2 = asBinder + 35;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 == 0) {
                    if (((Regex) it.next()).onExtraCallback(string)) {
                        list.add(IAuthTabCallback("forbidden_dimension_value", str, "Dimension value가 raw URL, encoded URL, token 또는 raw identifier처럼 보입니다."));
                    }
                } else {
                    ((Regex) it.next()).onExtraCallback(string);
                    obj2.hashCode();
                    throw null;
                }
            }
            return;
        }
        int i3 = IAuthTabCallbackStub + 1;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            list.add(IAuthTabCallback("unsupported_dimension_value_type", str, "customDimension cardinality 증가를 막기 위해 dimension value는 String 또는 Boolean이어야 합니다."));
        } else {
            list.add(IAuthTabCallback("unsupported_dimension_value_type", str, "customDimension cardinality 증가를 막기 위해 dimension value는 String 또는 Boolean이어야 합니다."));
            throw null;
        }
    }

    private final void onWarmupCompleted(String str, String str2, List<q4ExternalSyntheticLambda2.IAuthTabCallback> list) {
        int i = 2 % 2;
        if (StringsKt.isBlank(str2)) {
            list.add(IAuthTabCallback("missing_required_field", str, str + " 값은 비어있을 수 없습니다."));
            int i2 = IAuthTabCallbackStub + 45;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = IAuthTabCallbackStub + 5;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
    }

    private final q4ExternalSyntheticLambda2.IAuthTabCallback IAuthTabCallback(String str, String str2, String str3) {
        int i = 2 % 2;
        q4ExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback = new q4ExternalSyntheticLambda2.IAuthTabCallback(str, str2, str3);
        int i2 = IAuthTabCallbackStub + 45;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return iAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String lowerCase = StringsKt.replace$default(str, "_", "", false, 4, (Object) null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        int i4 = asBinder + 27;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return lowerCase;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    static {
        IAuthTabCallback();
        Companion = new onExtraCallback(null);
        IAuthTabCallback = new Regex("^[a-z][a-z0-9_]{1,63}$");
        onNavigationEvent = CollectionsKt.listOf(new Regex[]{new Regex("(?i)^[a-z][a-z0-9+.-]*://"), new Regex("(?i)(https?%3A%2F%2F|nextLandingUrl=|landingUrl=|referrer=)"), new Regex("^[A-Za-z0-9_-]+\\.[A-Za-z0-9_-]+\\.[A-Za-z0-9_-]+$"), new Regex("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$"), new Regex("^[0-9]{4,}$")});
        int i = access000 + 111;
        access100 = i % 128;
        int i2 = i % 2;
    }

    private static final long onExtraCallback() {
        return ((Long) onExtraCallbackWithResult(new Object[0], C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 504150960, -504150960, C40Encoder.onExtraCallback())).longValue();
    }

    private final void onExtraCallbackWithResult(int i, q4ExternalSyntheticLambda6 q4externalsyntheticlambda6, List<q4ExternalSyntheticLambda2.IAuthTabCallback> list) {
        onExtraCallbackWithResult(new Object[]{this, Integer.valueOf(i), q4externalsyntheticlambda6, list}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 438005478, -438005477, C40Encoder.onExtraCallback());
    }

    static void IAuthTabCallback() {
        onTransact = 4375938740539927203L;
    }
}
