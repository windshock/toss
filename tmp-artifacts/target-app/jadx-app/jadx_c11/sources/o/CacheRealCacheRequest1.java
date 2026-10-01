package o;

import android.content.Context;
import android.graphics.Typeface;
import android.os.SystemClock;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CacheRealCacheRequest1 {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onExtraCallbackWithResult;
    private static int onTransact;
    private static volatile onExtraCallback onWarmupCompleted;
    public static final CacheRealCacheRequest1 onExtraCallback = new CacheRealCacheRequest1();
    private static final Object IAuthTabCallback = new Object();
    private static final CopyOnWriteArrayList<Function0<Unit>> onNavigationEvent = new CopyOnWriteArrayList<>();

    private CacheRealCacheRequest1() {
    }

    static {
        int i = onTransact + 1;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public final Typeface onNavigationEvent(@NotNull Context context) {
        int i;
        Object obj;
        Typeface typeface;
        onExtraCallback onextracallback;
        Long lOnExtraCallbackWithResult;
        Intrinsics.checkNotNullParameter(context, "");
        onExtraCallback onextracallback2 = onWarmupCompleted;
        if (onextracallback2 != null && ((lOnExtraCallbackWithResult = onextracallback2.onExtraCallbackWithResult()) == null || SystemClock.uptimeMillis() - lOnExtraCallbackWithResult.longValue() < 5000)) {
            return onextracallback2.IAuthTabCallback();
        }
        synchronized (IAuthTabCallback) {
            i = onExtraCallbackWithResult;
        }
        File fileOnExtraCallbackWithResult = getTcfVendorConsentStatus.Companion.access100().onExtraCallbackWithResult(context);
        Long l = null;
        if (fileOnExtraCallbackWithResult != null) {
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(Typeface.createFromFile(fileOnExtraCallbackWithResult));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.onExtraCallback(obj)) {
                obj = null;
            }
            typeface = (Typeface) obj;
        } else {
            typeface = null;
        }
        synchronized (IAuthTabCallback) {
            if (onExtraCallbackWithResult == i) {
                if (fileOnExtraCallbackWithResult != null && typeface == null) {
                    onextracallback = new onExtraCallback(null, Long.valueOf(SystemClock.uptimeMillis()));
                } else {
                    onextracallback = new onExtraCallback(typeface, l, 2, l);
                }
                onWarmupCompleted = onextracallback;
            }
            Unit unit = Unit.INSTANCE;
        }
        return typeface;
    }

    public final void IAuthTabCallback() {
        synchronized (IAuthTabCallback) {
            onExtraCallbackWithResult++;
            onWarmupCompleted = null;
            Unit unit = Unit.INSTANCE;
        }
        Iterator<T> it = onNavigationEvent.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    public final void onWarmupCompleted(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        onNavigationEvent.add(function0);
        int i4 = asInterface + 79;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class onExtraCallback {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final Long IAuthTabCallback;
        private final Typeface onExtraCallback;

        public onExtraCallback(@Nullable Typeface typeface, @Nullable Long l) {
            this.onExtraCallback = typeface;
            this.IAuthTabCallback = l;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallback(Typeface typeface, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = onWarmupCompleted;
                int i3 = i2 + 115;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 7;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                l = null;
            }
            this(typeface, l);
        }

        public final Typeface IAuthTabCallback() {
            Typeface typeface;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                typeface = this.onExtraCallback;
                int i4 = 71 / 0;
            } else {
                typeface = this.onExtraCallback;
            }
            int i5 = i3 + 77;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return typeface;
        }

        public final Long onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 83;
            onWarmupCompleted = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            Long l = this.IAuthTabCallback;
            int i4 = i2 + 1;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return l;
            }
            obj.hashCode();
            throw null;
        }
    }
}
