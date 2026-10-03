package o;

import android.content.Context;
import com.google.android.gms.fitness.FitnessLocal;
import com.google.android.gms.fitness.LocalRecordingClient;
import com.google.android.gms.fitness.data.LocalDataType;
import com.google.android.gms.internal.ads.zzgsa;
import com.google.android.gms.tasks.OnFailureListener;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.util.DesugarTimeZone;
import j$.util.TimeZoneRetargetClass;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.JSApplicationIllegalArgumentException;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.pedometer.HalfHourlySyncReq;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class JSApplicationIllegalArgumentException {
    public static final JSApplicationIllegalArgumentException onExtraCallbackWithResult = new JSApplicationIllegalArgumentException();

    static final class IAuthTabCallback extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JSApplicationIllegalArgumentException.this.onExtraCallback((access13800<? super Unit>) this);
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        int I$0;
        int I$1;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JSApplicationIllegalArgumentException.this.onExtraCallback(null, 0L, 0L, this);
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JSApplicationIllegalArgumentException.this.onNavigationEvent(null, this);
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JSApplicationIllegalArgumentException.this.onExtraCallbackWithResult(null, null, this);
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JSApplicationIllegalArgumentException.this.IAuthTabCallback((Context) null, (access13800<? super Integer>) this);
        }
    }

    private JSApplicationIllegalArgumentException() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onNavigationEvent(@org.jetbrains.annotations.NotNull android.content.Context r19, @org.jetbrains.annotations.NotNull o.access13800<? super o.JSInstance> r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof o.JSApplicationIllegalArgumentException.onExtraCallbackWithResult
            if (r3 == 0) goto L19
            r3 = r2
            o.JSApplicationIllegalArgumentException$onExtraCallbackWithResult r3 = (o.JSApplicationIllegalArgumentException.onExtraCallbackWithResult) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 + r5
            r3.label = r4
            goto L1e
        L19:
            o.JSApplicationIllegalArgumentException$onExtraCallbackWithResult r3 = new o.JSApplicationIllegalArgumentException$onExtraCallbackWithResult
            r3.<init>(r2)
        L1e:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = o.access14300.onWarmupCompleted()
            int r5 = r3.label
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L4b
            if (r5 == r7) goto L43
            if (r5 != r6) goto L3b
            java.lang.Object r1 = r3.L$1
            o.JSBundleLoaderCompanioncreateFileLoader1 r1 = (o.JSBundleLoaderCompanioncreateFileLoader1) r1
            java.lang.Object r3 = r3.L$0
            android.content.Context r3 = (android.content.Context) r3
            kotlin.ResultKt.onNavigationEvent(r2)
            goto Lad
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L43:
            java.lang.Object r1 = r3.L$0
            android.content.Context r1 = (android.content.Context) r1
            kotlin.ResultKt.onNavigationEvent(r2)
            goto L93
        L4b:
            kotlin.ResultKt.onNavigationEvent(r2)
            o.GuardedAsyncTask r2 = o.GuardedAsyncTask.IAuthTabCallback
            java.lang.Object[] r13 = new java.lang.Object[]{r2, r1}
            int r8 = com.google.android.gms.internal.ads.zzgsa.onWarmupCompleted()
            int r11 = com.google.android.gms.internal.ads.zzgsa.onWarmupCompleted()
            int r12 = com.google.android.gms.internal.ads.zzgsa.onWarmupCompleted()
            int r10 = com.google.android.gms.internal.ads.zzgsa.onWarmupCompleted()
            r9 = 1333334459(0x4f7911bb, float:4.1786888E9)
            r14 = -1333334458(0xffffffffb086ee46, float:-9.817505E-10)
            java.lang.Object r2 = o.GuardedAsyncTask.onExtraCallback(r8, r9, r10, r11, r12, r13, r14)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L89
            o.ConvertFloatArrayToByteArray r8 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            java.lang.String r9 = "pedometer_debug"
            java.lang.String r10 = "fetchHalfHourlySteps failed"
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 60
            r16 = 0
            o.ConvertFloatArrayToByteArray.onExtraCallback(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = 0
            return r1
        L89:
            r3.L$0 = r1
            r3.label = r7
            java.lang.Object r2 = r0.onExtraCallback(r3)
            if (r2 == r4) goto Lc1
        L93:
            o.JSBundleLoaderCompanioncreateFileLoader1 r2 = r18.IAuthTabCallback()
            java.lang.Object r5 = o.access15400.onNavigationEvent(r1)
            r3.L$0 = r5
            r3.L$1 = r2
            r3.label = r6
            java.lang.Object r1 = r0.onExtraCallbackWithResult(r1, r2, r3)
            if (r1 != r4) goto La8
            goto Lc1
        La8:
            r17 = r2
            r2 = r1
            r1 = r17
        Lad:
            java.util.Map r2 = (java.util.Map) r2
            j$.time.LocalDateTime r1 = r1.onWarmupCompleted()
            java.util.List r1 = r0.onExtraCallback(r2, r1)
            int r2 = r0.IAuthTabCallback(r1)
            o.JSInstance r3 = new o.JSInstance
            r3.<init>(r1, r2)
            return r3
        Lc1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.JSApplicationIllegalArgumentException.onNavigationEvent(android.content.Context, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object IAuthTabCallback(@org.jetbrains.annotations.NotNull android.content.Context r12, @org.jetbrains.annotations.NotNull o.access13800<? super java.lang.Integer> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof o.JSApplicationIllegalArgumentException.onWarmupCompleted
            if (r0 == 0) goto L13
            r0 = r13
            o.JSApplicationIllegalArgumentException$onWarmupCompleted r0 = (o.JSApplicationIllegalArgumentException.onWarmupCompleted) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            o.JSApplicationIllegalArgumentException$onWarmupCompleted r0 = new o.JSApplicationIllegalArgumentException$onWarmupCompleted
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = o.access14300.onWarmupCompleted()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r12 = r0.L$1
            o.JSBundleLoaderCompanioncreateFileLoader1 r12 = (o.JSBundleLoaderCompanioncreateFileLoader1) r12
            java.lang.Object r12 = r0.L$0
            android.content.Context r12 = (android.content.Context) r12
            kotlin.ResultKt.onNavigationEvent(r13)
            goto L83
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            kotlin.ResultKt.onNavigationEvent(r13)
            o.GuardedAsyncTask r13 = o.GuardedAsyncTask.IAuthTabCallback
            java.lang.Object[] r9 = new java.lang.Object[]{r13, r12}
            int r4 = com.google.android.gms.internal.ads.zzgsa.onWarmupCompleted()
            int r7 = com.google.android.gms.internal.ads.zzgsa.onWarmupCompleted()
            int r8 = com.google.android.gms.internal.ads.zzgsa.onWarmupCompleted()
            int r6 = com.google.android.gms.internal.ads.zzgsa.onWarmupCompleted()
            r5 = 1333334459(0x4f7911bb, float:4.1786888E9)
            r10 = -1333334458(0xffffffffb086ee46, float:-9.817505E-10)
            java.lang.Object r13 = o.GuardedAsyncTask.onExtraCallback(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L6a
            r12 = 0
            java.lang.Integer r12 = o.access14000.onNavigationEvent(r12)
            return r12
        L6a:
            o.JSBundleLoaderCompanioncreateFileLoader1 r13 = r11.onWarmupCompleted()
            java.lang.Object r2 = o.access15400.onNavigationEvent(r12)
            r0.L$0 = r2
            java.lang.Object r2 = o.access15400.onNavigationEvent(r13)
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r13 = r11.onExtraCallbackWithResult(r12, r13, r0)
            if (r13 != r1) goto L83
            return r1
        L83:
            java.util.Map r13 = (java.util.Map) r13
            java.util.Collection r12 = r13.values()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            int r12 = kotlin.collections.CollectionsKt.sumOfInt(r12)
            java.lang.Integer r12 = o.access14000.onNavigationEvent(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.JSApplicationIllegalArgumentException.IAuthTabCallback(android.content.Context, o.access13800):java.lang.Object");
    }

    private final JSBundleLoaderCompanioncreateFileLoader1 IAuthTabCallback() {
        LocalDateTime localDateTimeNow = LocalDateTime.now(ZoneId.of("UTC"));
        Intrinsics.checkNotNull(localDateTimeNow);
        ZonedDateTime zonedDateTimeAtZone = onNavigationEvent(localDateTimeNow).atZone(ZoneId.of("UTC"));
        ZonedDateTime zonedDateTimeMinusHours = zonedDateTimeAtZone.minusHours(24L);
        LocalDateTime localDateTimeMinusMinutes = onNavigationEvent(localDateTimeNow).minusMinutes(30L);
        long epochSecond = zonedDateTimeMinusHours.toEpochSecond();
        long epochSecond2 = zonedDateTimeAtZone.toEpochSecond();
        Intrinsics.checkNotNull(localDateTimeMinusMinutes);
        return new JSBundleLoaderCompanioncreateFileLoader1(epochSecond, epochSecond2, localDateTimeMinusMinutes);
    }

    private final JSBundleLoaderCompanioncreateFileLoader1 onWarmupCompleted() {
        JSBundleLoaderCompanioncreateAssetLoader1 jSBundleLoaderCompanioncreateAssetLoader1 = JSBundleLoaderCompanioncreateAssetLoader1.onExtraCallbackWithResult;
        Object objClone = jSBundleLoaderCompanioncreateAssetLoader1.IAuthTabCallbackDefault().clone();
        Intrinsics.checkNotNull(objClone, "");
        Calendar calendar = (Calendar) objClone;
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis() / 1000;
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochSecond(timeInMillis), TimeZoneRetargetClass.toZoneId(jSBundleLoaderCompanioncreateAssetLoader1.IAuthTabCallbackDefault().getTimeZone()));
        calendar.add(6, -1);
        long timeInMillis2 = calendar.getTimeInMillis() / 1000;
        Intrinsics.checkNotNull(localDateTimeOfInstant);
        return new JSBundleLoaderCompanioncreateFileLoader1(timeInMillis2, timeInMillis, localDateTimeOfInstant);
    }

    private final Map<String, Integer> IAuthTabCallback(long j, long j2) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strOnExtraCallbackWithResult = addPolicy.ITrustedWebActivityServiceDefault().onExtraCallbackWithResult("pedometerRecordingRestoredRange", "");
        if (strOnExtraCallbackWithResult.length() > 0) {
            List listSplit$default = StringsKt.split$default(strOnExtraCallbackWithResult, new char[]{'_'}, false, 0, 6, (Object) null);
            if (listSplit$default.size() == 2) {
                Long longOrNull = StringsKt.toLongOrNull((String) listSplit$default.get(0));
                Long longOrNull2 = StringsKt.toLongOrNull((String) listSplit$default.get(1));
                if (longOrNull != null && longOrNull2 != null) {
                    long j3 = j * 1000;
                    if (j3 <= longOrNull2.longValue() && longOrNull.longValue() <= j2 * 1000) {
                        String strOnExtraCallbackWithResult2 = addPolicy.ITrustedWebActivityServiceDefault().onExtraCallbackWithResult("pedometerHalfHourlyStepsJson", "");
                        try {
                            Result.Companion companion = Result.Companion;
                            wie2 wie2VarOnExtraCallback = EndMotionInteraction.onExtraCallback();
                            wie2VarOnExtraCallback.onExtraCallback();
                            obj = Result.constructor-impl(wie2VarOnExtraCallback.onExtraCallback(new checkCanOpenLandingPage(HalfHourlySyncReq.Step.Companion.serializer()), strOnExtraCallbackWithResult2));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            obj = Result.constructor-impl(ResultKt.createFailure(th));
                        }
                        if (Result.onExtraCallback(obj)) {
                            obj = null;
                        }
                        List<HalfHourlySyncReq.Step> list = (List) obj;
                        if (list != null) {
                            for (HalfHourlySyncReq.Step step : list) {
                                linkedHashMap.put(step.IAuthTabCallback(), Integer.valueOf(step.onExtraCallback()));
                            }
                        }
                    } else if (j3 > longOrNull2.longValue()) {
                        addPolicy.ITrustedWebActivityServiceDefault().onNavigationEvent("pedometerRecordingRestoredRange", "");
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onExtraCallback(android.content.Context r19, long r20, long r22, o.access13800<? super java.util.Map<java.lang.String, java.lang.Integer>> r24) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.JSApplicationIllegalArgumentException.onExtraCallback(android.content.Context, long, long, o.access13800):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onExtraCallbackWithResult(android.content.Context r10, o.JSBundleLoaderCompanioncreateFileLoader1 r11, o.access13800<? super java.util.Map<java.lang.String, java.lang.Integer>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof o.JSApplicationIllegalArgumentException.onNavigationEvent
            if (r0 == 0) goto L13
            r0 = r12
            o.JSApplicationIllegalArgumentException$onNavigationEvent r0 = (o.JSApplicationIllegalArgumentException.onNavigationEvent) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            o.JSApplicationIllegalArgumentException$onNavigationEvent r0 = new o.JSApplicationIllegalArgumentException$onNavigationEvent
            r0.<init>(r12)
        L18:
            r7 = r0
            java.lang.Object r12 = r7.result
            java.lang.Object r0 = o.access14300.onWarmupCompleted()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 != r2) goto L36
            java.lang.Object r10 = r7.L$2
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r11 = r7.L$1
            o.JSBundleLoaderCompanioncreateFileLoader1 r11 = (o.JSBundleLoaderCompanioncreateFileLoader1) r11
            java.lang.Object r11 = r7.L$0
            android.content.Context r11 = (android.content.Context) r11
            kotlin.ResultKt.onNavigationEvent(r12)
            goto L71
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            kotlin.ResultKt.onNavigationEvent(r12)
            long r3 = r11.onNavigationEvent()
            long r5 = r11.onExtraCallback()
            java.util.Map r12 = r9.IAuthTabCallback(r3, r5)
            long r3 = r11.onNavigationEvent()
            long r5 = r11.onExtraCallback()
            java.lang.Object r1 = o.access15400.onNavigationEvent(r10)
            r7.L$0 = r1
            java.lang.Object r11 = o.access15400.onNavigationEvent(r11)
            r7.L$1 = r11
            r7.L$2 = r12
            r7.label = r2
            r1 = r9
            r2 = r10
            java.lang.Object r10 = r1.onExtraCallback(r2, r3, r5, r7)
            if (r10 != r0) goto L6e
            return r0
        L6e:
            r8 = r12
            r12 = r10
            r10 = r8
        L71:
            java.util.Map r12 = (java.util.Map) r12
            java.util.Set r11 = r10.keySet()
            java.util.Set r0 = r12.keySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r11 = o.clearFaultAdjacentMetadata.onWarmupCompleted(r11, r0)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r11, r1)
            int r1 = o.access8100.IAuthTabCallback(r1)
            r2 = 16
            int r1 = kotlin.ranges.RangesKt.coerceAtLeast(r1, r2)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L9c:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto Lcd
            java.lang.Object r1 = r11.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r4 = 0
            if (r3 == 0) goto Lb7
            int r3 = r3.intValue()
            goto Lb8
        Lb7:
            r3 = r4
        Lb8:
            java.lang.Object r2 = r12.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto Lc4
            int r4 = r2.intValue()
        Lc4:
            int r3 = r3 + r4
            java.lang.Integer r2 = o.access14000.onNavigationEvent(r3)
            r0.put(r1, r2)
            goto L9c
        Lcd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.JSApplicationIllegalArgumentException.onExtraCallbackWithResult(android.content.Context, o.JSBundleLoaderCompanioncreateFileLoader1, o.access13800):java.lang.Object");
    }

    private final List<HalfHourlySyncReq.Step> onExtraCallback(Map<String, Integer> map, LocalDateTime localDateTime) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        for (int i = 47; i >= 0; i--) {
            try {
                calendar.setTimeInMillis(localDateTime.minusMinutes(i * 30).toEpochSecond(ZoneOffset.UTC) * 1000);
                String str = JSBundleLoaderCompanioncreateAssetLoader1.onExtraCallbackWithResult.asInterface().format(calendar.getTime());
                Integer num = map.get(str);
                int iIntValue = num != null ? num.intValue() : 0;
                Intrinsics.checkNotNull(str);
                arrayList.add(new HalfHourlySyncReq.Step(str, iIntValue));
            } catch (Throwable th) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "pedometer_debug", "Error in timestamp generation loop", th, (Map) null, 8, (Object) null);
            }
        }
        return arrayList;
    }

    private final int IAuthTabCallback(List<HalfHourlySyncReq.Step> list) {
        Object objClone = zzaj.IAuthTabCallback().onExtraCallbackWithResult().clone();
        Intrinsics.checkNotNull(objClone, "");
        Calendar calendar = (Calendar) objClone;
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        int iOnExtraCallback = 0;
        for (HalfHourlySyncReq.Step step : list) {
            Calendar calendar2 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
            calendar2.setTimeInMillis(JSBundleLoaderCompanioncreateAssetLoader1.onExtraCallbackWithResult.asInterface().parse(step.IAuthTabCallback()).getTime());
            iOnExtraCallback += calendar2.getTimeInMillis() >= calendar.getTimeInMillis() ? step.onExtraCallback() : 0;
        }
        return iOnExtraCallback;
    }

    private final LocalDateTime onNavigationEvent(LocalDateTime localDateTime) {
        LocalDateTime localDateTimeWithNano = localDateTime.withSecond(0).withNano(0);
        if (localDateTimeWithNano.getMinute() % 30 == 0) {
            Intrinsics.checkNotNull(localDateTimeWithNano);
            return localDateTimeWithNano;
        }
        LocalDateTime localDateTimePlusMinutes = localDateTimeWithNano.plusMinutes(30 - r0);
        Intrinsics.checkNotNull(localDateTimePlusMinutes);
        return localDateTimePlusMinutes;
    }

    public final void onExtraCallback(@NotNull Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "");
        Object[] objArr = {GuardedAsyncTask.IAuthTabCallback, context};
        if (((Boolean) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), 1333334459, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), objArr, -1333334458)).booleanValue()) {
            try {
                Result.Companion companion = Result.Companion;
                LocalRecordingClient localRecordingClient = FitnessLocal.getLocalRecordingClient(context);
                Intrinsics.checkNotNullExpressionValue(localRecordingClient, "");
                obj = Result.constructor-impl(localRecordingClient.subscribe(LocalDataType.TYPE_STEP_COUNT_DELTA).addOnFailureListener(new OnFailureListener() { // from class: viva.republica.toss.pedometer.PedometerRecordingClientHelper$$ExternalSyntheticLambda0
                    public final void onFailure(Exception exc) {
                        JSApplicationIllegalArgumentException.onExtraCallbackWithResult(exc);
                    }
                }));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "pedometer_debug", "subscribeStepCount", th2, (Map) null, 8, (Object) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "pedometer_debug", "subscribeStepCount", exc, (Map) null, 8, (Object) null);
    }

    public final void onNavigationEvent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
        if (guardedAsyncTask.onTransact(context)) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
            GuardedAsyncTask.onExtraCallback(iOnWarmupCompleted, -667909761, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, new Object[]{guardedAsyncTask}, 667909763);
            LocalRecordingClient localRecordingClient = FitnessLocal.getLocalRecordingClient(context);
            Intrinsics.checkNotNullExpressionValue(localRecordingClient, "");
            localRecordingClient.unsubscribe(LocalDataType.TYPE_STEP_COUNT_DELTA).addOnFailureListener(new OnFailureListener() { // from class: viva.republica.toss.pedometer.PedometerRecordingClientHelper$$ExternalSyntheticLambda1
                public final void onFailure(Exception exc) {
                    JSApplicationIllegalArgumentException.onNavigationEvent(exc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "pedometer_debug", "unsubscribeStepCount", exc, (Map) null, 8, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onExtraCallback(o.access13800<? super kotlin.Unit> r20) throws im.toss.network.throwable.TossApiCallException.ApiError {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.JSApplicationIllegalArgumentException.onExtraCallback(o.access13800):java.lang.Object");
    }
}
