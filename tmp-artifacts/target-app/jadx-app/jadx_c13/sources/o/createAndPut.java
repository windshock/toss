package o;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class createAndPut implements modifyCallback, OpaqueValue {
    private static final modifyCallback onNavigationEvent = new createAndPut();
    private static final component25 IAuthTabCallback = new component25(Logger.getLogger(createAndPut.class.getName()));

    public static modifyCallback IAuthTabCallbackStub() {
        return onNavigationEvent;
    }

    private createAndPut() {
    }

    /* renamed from: o.createAndPut$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[getDataTrimmed.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[getDataTrimmed.COUNTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onNavigationEvent[getDataTrimmed.UP_DOWN_COUNTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onNavigationEvent[getDataTrimmed.OBSERVABLE_COUNTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onNavigationEvent[getDataTrimmed.OBSERVABLE_UP_DOWN_COUNTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onNavigationEvent[getDataTrimmed.HISTOGRAM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onNavigationEvent[getDataTrimmed.OBSERVABLE_GAUGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                onNavigationEvent[getDataTrimmed.GAUGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static modifyCallback onNavigationEvent(tryFindBinder tryfindbinder, boolean z) {
        switch (AnonymousClass2.onNavigationEvent[tryfindbinder.onExtraCallbackWithResult().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return Grisu3CachedPowers.asBinder();
            case 5:
                if (z && tryfindbinder.onExtraCallback().onNavigationEvent() != null) {
                    return tryFindConverter.onNavigationEvent(tryfindbinder.onExtraCallback().onNavigationEvent());
                }
                return tryFindConverter.onTransact();
            case 6:
            case 7:
                return Grisu3.onTransact();
            default:
                IAuthTabCallback.onExtraCallback(Level.WARNING, "Unable to find default aggregation for instrument: " + tryfindbinder);
                return withContext.asBinder();
        }
    }

    @Override // o.OpaqueValue
    public <T extends is32bit, U extends getMainThreadbugsnag_android_core_release> updateUserId<T, U> onExtraCallback(tryFindBinder tryfindbinder, DslJson3 dslJson3, getSpanId getspanid) {
        return ((OpaqueValue) onNavigationEvent(tryfindbinder, true)).onExtraCallback(tryfindbinder, dslJson3, getspanid);
    }

    @Override // o.OpaqueValue
    public boolean onExtraCallbackWithResult(tryFindBinder tryfindbinder) {
        return ((OpaqueValue) onNavigationEvent(tryfindbinder, false)).onExtraCallbackWithResult(tryfindbinder);
    }

    public String toString() {
        return "DefaultAggregation";
    }
}
