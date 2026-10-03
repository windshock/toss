package viva.republica.toss.ads;

import android.content.Context;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.adInfo;
import o.sp;
import o.videoFrameChanged;
import o.wie2;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RedirectionLogStore {
    public static final Companion Companion = new Companion(null);
    public static final int onWarmupCompleted = 8;
    private final wie2 IAuthTabCallback;
    private final Object onExtraCallback;
    private final KSerializer<List<RedirectionLogRecord>> onExtraCallbackWithResult;
    private final File onNavigationEvent;

    @Inject
    public RedirectionLogStore(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.onNavigationEvent = new File(context.getFilesDir(), "redirection_app_landing_logs.json");
        this.onExtraCallback = new Object();
        this.IAuthTabCallback = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: viva.republica.toss.ads.RedirectionLogStore$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return RedirectionLogStore.onWarmupCompleted((adInfo) obj);
            }
        }, 1, (Object) null);
        this.onExtraCallbackWithResult = sp.onExtraCallback(RedirectionLogRecord.Companion.serializer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(adInfo adinfo) {
        Intrinsics.checkNotNullParameter(adinfo, "");
        adinfo.IAuthTabCallback(true);
        return Unit.INSTANCE;
    }

    public final void IAuthTabCallback(@NotNull RedirectionLogRecord redirectionLogRecord) {
        Intrinsics.checkNotNullParameter(redirectionLogRecord, "");
        synchronized (this.onExtraCallback) {
            List<RedirectionLogRecord> mutableList = CollectionsKt.toMutableList(IAuthTabCallback());
            mutableList.add(redirectionLogRecord);
            if (mutableList.size() > 200) {
                mutableList = CollectionsKt.takeLast(mutableList, 200);
            }
            onNavigationEvent(mutableList);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final List<RedirectionLogRecord> onExtraCallbackWithResult() {
        ArrayList arrayList;
        synchronized (this.onExtraCallback) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<RedirectionLogRecord> listIAuthTabCallback = IAuthTabCallback();
            arrayList = new ArrayList();
            for (Object obj : listIAuthTabCallback) {
                if (jCurrentTimeMillis - ((RedirectionLogRecord) obj).onNavigationEvent() < 604800000) {
                    arrayList.add(obj);
                }
            }
            onNavigationEvent(arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0022 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int onWarmupCompleted(@org.jetbrains.annotations.NotNull java.util.Set<java.lang.String> r18, @org.jetbrains.annotations.NotNull java.util.Set<java.lang.String> r19, int r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.lang.Object r3 = r1.onExtraCallback
            monitor-enter(r3)
            java.util.List r4 = r17.IAuthTabCallback()     // Catch: java.lang.Throwable -> L76
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L76
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L76
            r5.<init>()     // Catch: java.lang.Throwable -> L76
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L76
        L22:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L6d
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L76
            r7 = r6
            viva.republica.toss.ads.RedirectionLogRecord r7 = (viva.republica.toss.ads.RedirectionLogRecord) r7     // Catch: java.lang.Throwable -> L76
            java.lang.String r6 = r7.onExtraCallbackWithResult()     // Catch: java.lang.Throwable -> L76
            boolean r6 = r0.contains(r6)     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L3c
            r8 = r20
            goto L63
        L3c:
            java.lang.String r6 = r7.onExtraCallbackWithResult()     // Catch: java.lang.Throwable -> L76
            boolean r6 = r2.contains(r6)     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L65
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            int r6 = r7.asInterface()     // Catch: java.lang.Throwable -> L76
            int r14 = r6 + 1
            r15 = 15
            r16 = 0
            viva.republica.toss.ads.RedirectionLogRecord r7 = viva.republica.toss.ads.RedirectionLogRecord.IAuthTabCallback(r7, r8, r9, r11, r12, r14, r15, r16)     // Catch: java.lang.Throwable -> L76
            int r6 = r7.asInterface()     // Catch: java.lang.Throwable -> L76
            r8 = r20
            if (r6 >= r8) goto L63
            goto L67
        L63:
            r7 = 0
            goto L67
        L65:
            r8 = r20
        L67:
            if (r7 == 0) goto L22
            r5.add(r7)     // Catch: java.lang.Throwable -> L76
            goto L22
        L6d:
            r1.onNavigationEvent(r5)     // Catch: java.lang.Throwable -> L76
            int r0 = r5.size()     // Catch: java.lang.Throwable -> L76
            monitor-exit(r3)
            return r0
        L76:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.ads.RedirectionLogStore.onWarmupCompleted(java.util.Set, java.util.Set, int):int");
    }

    private final List<RedirectionLogRecord> IAuthTabCallback() {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(this.onNavigationEvent.exists() ? (List) this.IAuthTabCallback.onExtraCallback(this.onExtraCallbackWithResult, FilesKt.readText$default(this.onNavigationEvent, (Charset) null, 1, (Object) null)) : CollectionsKt.emptyList());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.onExtraCallback(obj)) {
            obj = listEmptyList;
        }
        return (List) obj;
    }

    private final void onNavigationEvent(List<RedirectionLogRecord> list) {
        try {
            Result.Companion companion = Result.Companion;
            FilesKt.writeText$default(this.onNavigationEvent, this.IAuthTabCallback.onWarmupCompleted(this.onExtraCallbackWithResult, list), (Charset) null, 2, (Object) null);
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
