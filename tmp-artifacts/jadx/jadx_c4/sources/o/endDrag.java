package o;

import android.content.Context;
import im.toss.ads_sdk.log.NativeAdsTrackingFlushWorker;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import o.pageScrolled;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class endDrag {
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private final Context onExtraCallback;
    private final AtomicBoolean onExtraCallbackWithResult;
    private final AtomicBoolean onNavigationEvent;
    private final pageScrolled onWarmupCompleted;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = endDrag.this.IAuthTabCallback(this);
            int i4 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }
    }

    @Inject
    public endDrag(@NotNull Context context, @NotNull pageScrolled pagescrolled) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(pagescrolled, "");
        this.onExtraCallback = context;
        this.onWarmupCompleted = pagescrolled;
        this.onNavigationEvent = new AtomicBoolean(false);
        this.onExtraCallbackWithResult = new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00eb, code lost:
    
        if (IAuthTabCallback(r1) == r2) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[Catch: all -> 0x005a, PHI: r3
      0x007a: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:27:0x0079, B:43:0x00cb] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x005a, blocks: (B:19:0x0056, B:30:0x008b, B:33:0x009e, B:42:0x00c5, B:28:0x007a, B:39:0x00b6, B:41:0x00be, B:55:0x0102, B:56:0x0108, B:57:0x0109, B:58:0x010e), top: B:62:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b A[Catch: all -> 0x005a, PHI: r3 r9
      0x008b: PHI (r3v3 int) = (r3v2 int), (r3v7 int) binds: [B:29:0x0089, B:19:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x008b: PHI (r9v9 java.lang.Object) = (r9v8 java.lang.Object), (r9v1 java.lang.Object) binds: [B:29:0x0089, B:19:0x0056] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x005a, blocks: (B:19:0x0056, B:30:0x008b, B:33:0x009e, B:42:0x00c5, B:28:0x007a, B:39:0x00b6, B:41:0x00be, B:55:0x0102, B:56:0x0108, B:57:0x0109, B:58:0x010e), top: B:62:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0089 -> B:30:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull access13800<? super Unit> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i;
        boolean andSet;
        int i2 = 2 % 2;
        int i3 = asBinder + 87;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i5 = onextracallbackwithresult.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i5 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object objIAuthTabCallback = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = onextracallbackwithresult.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            if (!this.onNavigationEvent.compareAndSet(false, true)) {
                this.onExtraCallbackWithResult.set(true);
                Unit unit = Unit.INSTANCE;
                int i7 = asBinder + 87;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return unit;
            }
            i = 0;
            this.onExtraCallbackWithResult.set(false);
            pageScrolled pagescrolled = this.onWarmupCompleted;
            onextracallbackwithresult.I$0 = i;
            onextracallbackwithresult.label = 1;
            objIAuthTabCallback = pagescrolled.IAuthTabCallback((access13800<? super pageScrolled.IAuthTabCallback>) onextracallbackwithresult);
            if (objIAuthTabCallback != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i9 = IAuthTabCallback + 33;
            asBinder = i9 % 128;
            if (i9 % 2 == 0) {
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                int i10 = 28 / 0;
            } else {
                ResultKt.onNavigationEvent(objIAuthTabCallback);
            }
            Unit unit2 = Unit.INSTANCE;
            int i11 = asBinder + 123;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 23 / 0;
            }
            return unit2;
        }
        i = onextracallbackwithresult.I$0;
        try {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            pageScrolled.IAuthTabCallback iAuthTabCallback = (pageScrolled.IAuthTabCallback) objIAuthTabCallback;
            if (Intrinsics.areEqual(iAuthTabCallback, pageScrolled.IAuthTabCallback.onNavigationEvent.IAuthTabCallback)) {
                int i13 = IAuthTabCallback + 47;
                asBinder = i13 % 128;
                int i14 = i13 % 2;
                NativeAdsTrackingFlushWorker.Companion.onExtraCallback(this.onExtraCallback);
            } else {
                if (!(iAuthTabCallback instanceof pageScrolled.IAuthTabCallback.onWarmupCompleted)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i15 = IAuthTabCallback + 99;
                asBinder = i15 % 128;
                if (i15 % 2 == 0) {
                    ((pageScrolled.IAuthTabCallback.onWarmupCompleted) iAuthTabCallback).onWarmupCompleted();
                    throw null;
                }
                if (((pageScrolled.IAuthTabCallback.onWarmupCompleted) iAuthTabCallback).onWarmupCompleted()) {
                    NativeAdsTrackingFlushWorker.Companion.onExtraCallback(this.onExtraCallback);
                }
            }
            if (!this.onExtraCallbackWithResult.get()) {
                this.onExtraCallbackWithResult.set(false);
                pageScrolled pagescrolled2 = this.onWarmupCompleted;
                onextracallbackwithresult.I$0 = i;
                onextracallbackwithresult.label = 1;
                objIAuthTabCallback = pagescrolled2.IAuthTabCallback((access13800<? super pageScrolled.IAuthTabCallback>) onextracallbackwithresult);
                if (objIAuthTabCallback != objOnWarmupCompleted) {
                    pageScrolled.IAuthTabCallback iAuthTabCallback2 = (pageScrolled.IAuthTabCallback) objIAuthTabCallback;
                    if (Intrinsics.areEqual(iAuthTabCallback2, pageScrolled.IAuthTabCallback.onNavigationEvent.IAuthTabCallback)) {
                    }
                    if (!this.onExtraCallbackWithResult.get()) {
                    }
                }
            } else {
                if (!andSet) {
                    return Unit.INSTANCE;
                }
                int i16 = IAuthTabCallback + 85;
                asBinder = i16 % 128;
                int i17 = i16 % 2;
                onextracallbackwithresult.Z$0 = andSet;
                onextracallbackwithresult.label = 2;
            }
            return objOnWarmupCompleted;
        } finally {
            this.onNavigationEvent.set(false);
            this.onExtraCallbackWithResult.getAndSet(false);
        }
    }
}
