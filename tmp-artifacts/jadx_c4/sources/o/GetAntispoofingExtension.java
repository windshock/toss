package o;

import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import im.toss.core.tracker.entry.CustomizableLog;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.setApTextSize;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class GetAntispoofingExtension implements getInstallBeginTimestampSeconds {
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final GetAntispoofingExtension onExtraCallback = new GetAntispoofingExtension();
    private static final findResAndMsg IAuthTabCallback = findRes.onWarmupCompleted(putChannelInfo.onWarmupCompleted());
    private static final ConcurrentHashMap<Integer, List<CustomizableLog>> onExtraCallbackWithResult = new ConcurrentHashMap<>();

    private GetAntispoofingExtension() {
    }

    public static final /* synthetic */ ConcurrentHashMap onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 17;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        ConcurrentHashMap<Integer, List<CustomizableLog>> concurrentHashMap = onExtraCallbackWithResult;
        int i5 = i2 + 75;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return concurrentHashMap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(GetAntispoofingExtension getAntispoofingExtension, CustomizableLog customizableLog) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getAntispoofingExtension.onExtraCallbackWithResult(customizableLog);
        int i4 = asInterface + 71;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 71;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 68 / 0;
        }
    }

    public void IAuthTabCallback(@NotNull String str, @NotNull CustomRequestHeader customRequestHeader, @NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(customRequestHeader, "");
            Intrinsics.checkNotNullParameter(map, "");
            onExtraCallbackWithResult(IAuthTabCallback(str, map, customRequestHeader));
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(customRequestHeader, "");
        Intrinsics.checkNotNullParameter(map, "");
        onExtraCallbackWithResult(IAuthTabCallback(str, map, customRequestHeader));
        int i3 = asInterface + 15;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 13 / 0;
        }
    }

    public void IAuthTabCallback(long j, @NotNull CustomRequestHeader customRequestHeader, @NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(customRequestHeader, "");
            Intrinsics.checkNotNullParameter(map, "");
            onExtraCallbackWithResult(onWarmupCompleted(j, map, customRequestHeader));
        } else {
            Intrinsics.checkNotNullParameter(customRequestHeader, "");
            Intrinsics.checkNotNullParameter(map, "");
            onExtraCallbackWithResult(onWarmupCompleted(j, map, customRequestHeader));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(@NotNull initMiniApp initminiapp, @NotNull String str, @NotNull CustomRequestHeader customRequestHeader, @NotNull Map<String, ? extends Object> map) {
        Collection arrayList;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(initminiapp, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(customRequestHeader, "");
        Intrinsics.checkNotNullParameter(map, "");
        CustomizableLog customizableLogIAuthTabCallback = IAuthTabCallback(str, map, customRequestHeader);
        ConcurrentHashMap<Integer, List<CustomizableLog>> concurrentHashMap = onExtraCallbackWithResult;
        List<CustomizableLog> list = concurrentHashMap.get(Integer.valueOf(hasCrash.onExtraCallback(initminiapp)));
        if (list != null) {
            int i4 = asInterface + 29;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                arrayList = CollectionsKt.toMutableList(list);
                int i5 = 19 / 0;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
            } else {
                arrayList = CollectionsKt.toMutableList(list);
                if (arrayList == null) {
                }
            }
        }
        concurrentHashMap.put(Integer.valueOf(hasCrash.onExtraCallback(initminiapp)), CollectionsKt.plus(arrayList, customizableLogIAuthTabCallback));
        int i6 = IAuthTabCallbackStub + 89;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void IAuthTabCallback(@NotNull initMiniApp initminiapp, @NotNull CustomRequestHeader customRequestHeader, @NotNull Map<String, ? extends Object> map) {
        Collection arrayList;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(initminiapp, "");
        Intrinsics.checkNotNullParameter(customRequestHeader, "");
        Intrinsics.checkNotNullParameter(map, "");
        CustomizableLog customizableLogOnWarmupCompleted = onWarmupCompleted(initminiapp.access200(), map, customRequestHeader);
        ConcurrentHashMap<Integer, List<CustomizableLog>> concurrentHashMap = onExtraCallbackWithResult;
        List<CustomizableLog> list = concurrentHashMap.get(Integer.valueOf(hasCrash.onExtraCallback(initminiapp)));
        if (list == null || (arrayList = CollectionsKt.toMutableList(list)) == null) {
            arrayList = new ArrayList();
        }
        concurrentHashMap.put(Integer.valueOf(hasCrash.onExtraCallback(initminiapp)), CollectionsKt.plus(arrayList, customizableLogOnWarmupCompleted));
        int i4 = IAuthTabCallbackStub + 15;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ initMiniApp $screen;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(initMiniApp initminiapp, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$screen = initminiapp;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onwarmupcompletedCreate.invokeSuspend(unit);
            }
            onwarmupcompletedCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$screen, access13800Var);
            int i2 = onNavigationEvent + 95;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 30 / 0;
            }
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 73;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onNavigationEvent + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            List<CustomizableLog> list = (List) GetAntispoofingExtension.onExtraCallbackWithResult().remove(access14000.onNavigationEvent(hasCrash.onExtraCallback(this.$screen)));
            if (list != null) {
                int i4 = IAuthTabCallback + 9;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                Map mapAr_ = this.$screen.ar_();
                for (CustomizableLog customizableLog : list) {
                    int i6 = IAuthTabCallback + 23;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    GetAntispoofingExtension.onWarmupCompleted(GetAntispoofingExtension.onExtraCallback, CustomizableLog.IAuthTabCallback(customizableLog, null, null, null, null, access8100.onWarmupCompleted(access8100.onWarmupCompleted(mapAr_, customizableLog.onNavigationEvent())), null, null, 111, null));
                    int i8 = IAuthTabCallback + 57;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public void onNavigationEvent(@NotNull initMiniApp initminiapp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(initminiapp, "");
        maybeUpdateAnimatable.onNavigationEvent(IAuthTabCallback, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(initminiapp, null), 3, (Object) null);
        int i2 = IAuthTabCallbackStub + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008d A[PHI: r1
      0x008d: PHI (r1v10 o.onInstallReferrerServiceDisconnected) = 
      (r1v7 o.onInstallReferrerServiceDisconnected)
      (r1v8 o.onInstallReferrerServiceDisconnected)
      (r1v14 o.onInstallReferrerServiceDisconnected)
     binds: [B:8:0x0083, B:10:0x008b, B:5:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0085 A[PHI: r1 r5
      0x0085: PHI (r1v8 o.onInstallReferrerServiceDisconnected) = (r1v7 o.onInstallReferrerServiceDisconnected), (r1v14 o.onInstallReferrerServiceDisconnected) binds: [B:8:0x0083, B:5:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r5v2 java.lang.String) = (r5v1 java.lang.String), (r5v6 java.lang.String) binds: [B:8:0x0083, B:5:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(CustomizableLog customizableLog) {
        onInstallReferrerServiceDisconnected oninstallreferrerservicedisconnected;
        String strIAuthTabCallback_Parcel;
        long jLongValue;
        int i = 2 % 2;
        int i2 = asInterface + 35;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            ((Boolean) GetFeatureExtension.onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -77609466, new Object[]{GetFeatureExtension.onWarmupCompleted, customizableLog, false}, 77609475, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
            oninstallreferrerservicedisconnected = onInstallReferrerServiceDisconnected.onExtraCallback;
            strIAuthTabCallback_Parcel = customizableLog.IAuthTabCallback_Parcel();
            if (Intrinsics.areEqual(customizableLog.IAuthTabCallbackStubProxy(), "event")) {
                if (!(!StringsKt.isBlank(strIAuthTabCallback_Parcel))) {
                    strIAuthTabCallback_Parcel = null;
                }
            }
        } else {
            ((Boolean) GetFeatureExtension.onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -77609466, new Object[]{GetFeatureExtension.onWarmupCompleted, customizableLog, false}, 77609475, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
            oninstallreferrerservicedisconnected = onInstallReferrerServiceDisconnected.onExtraCallback;
            strIAuthTabCallback_Parcel = customizableLog.IAuthTabCallback_Parcel();
            if (Intrinsics.areEqual(customizableLog.IAuthTabCallbackStubProxy(), "event")) {
            }
        }
        Long lAccess000 = customizableLog.access000();
        if (lAccess000 != null) {
            int i3 = asInterface + 73;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                jLongValue = lAccess000.longValue();
                int i4 = 19 / 0;
            } else {
                jLongValue = lAccess000.longValue();
            }
        } else {
            jLongValue = -1;
        }
        onInstallReferrerServiceDisconnected.onExtraCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1035535981, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1035535980, new Object[]{oninstallreferrerservicedisconnected, strIAuthTabCallback_Parcel, Intrinsics.areEqual(customizableLog.IAuthTabCallbackStubProxy(), "screen") ? Long.valueOf(jLongValue) : null, (String) CustomizableLog.onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{customizableLog}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1940829915, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1940829916), customizableLog.onNavigationEvent()}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
    }

    private final CustomizableLog IAuthTabCallback(String str, Map<String, ? extends Object> map, CustomRequestHeader customRequestHeader) {
        int i = 2 % 2;
        CustomizableLog customizableLog = new CustomizableLog(str, "event", "common", (Map<String, Object>) access8100.onWarmupCompleted(map), "3", customRequestHeader.getLabel());
        int i2 = IAuthTabCallbackStub + 55;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 8 / 0;
        }
        return customizableLog;
    }

    private final CustomizableLog onWarmupCompleted(long j, Map<String, ? extends Object> map, CustomRequestHeader customRequestHeader) {
        int i = 2 % 2;
        CustomizableLog customizableLog = new CustomizableLog(Long.valueOf(j), (String) null, "screen", "common", access8100.onWarmupCompleted(map), "3", customRequestHeader.getLabel(), 2, (DefaultConstructorMarker) null);
        int i2 = IAuthTabCallbackStub + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return customizableLog;
    }
}
