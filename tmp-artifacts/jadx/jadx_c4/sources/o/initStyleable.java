package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class initStyleable implements initLayout {
    private static int asBinder = 1;
    private static int onTransact;
    private final getBillingPeriod IAuthTabCallback;
    private long IAuthTabCallbackDefault;
    private final Object onExtraCallback;
    private final getTileModeX<onViewDraw> onExtraCallbackWithResult;
    private final getBorderRadius<onViewDraw> onNavigationEvent;
    private final Map<onViewDraw, getIconSize> onWarmupCompleted;

    public static final /* synthetic */ class onWarmupCompleted {
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[getIconSize.values().length];
            try {
                iArr[getIconSize.Granted.ordinal()] = 1;
                int i = onWarmupCompleted + 41;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getIconSize.Revoked.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getIconSize.NotDetermined.ordinal()] = 3;
                int i4 = onWarmupCompleted + 29;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallbackWithResult = iArr;
            int i6 = onExtraCallback + 105;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Inject
    public initStyleable(@NotNull getBillingPeriod getbillingperiod) {
        Intrinsics.checkNotNullParameter(getbillingperiod, "");
        this.IAuthTabCallback = getbillingperiod;
        this.onNavigationEvent = getShine.onWarmupCompleted(8, 0, (CloseableUtils) null, 6, (Object) null);
        this.onExtraCallback = new Object();
        EnumEntries<onViewDraw> entries = onViewDraw.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
        int i = 2 % 2;
        for (Object obj : entries) {
            int i2 = onTransact + 81;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            linkedHashMap.put(obj, getIconSize.NotDetermined);
            int i4 = onTransact + 89;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
        this.onWarmupCompleted = access8100.onWarmupCompleted(linkedHashMap);
        this.onExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult(this.onNavigationEvent);
    }

    @Override // o.initLayout
    public getTileModeX<onViewDraw> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 61;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        getTileModeX<onViewDraw> gettilemodex = this.onExtraCallbackWithResult;
        int i5 = i2 + 61;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return gettilemodex;
        }
        throw null;
    }

    @Override // o.initLayout
    public long onWarmupCompleted() {
        long j;
        synchronized (this.onExtraCallback) {
            j = this.IAuthTabCallbackDefault;
        }
        return j;
    }

    @Override // o.initLayout
    public getIconPaddingTop IAuthTabCallback(@NotNull onViewDraw onviewdraw) {
        getIconPaddingTop geticonpaddingtop;
        Intrinsics.checkNotNullParameter(onviewdraw, "");
        if (this.IAuthTabCallback.onExtraCallbackWithResult() != getPricingPhaseList.EU) {
            return getIconPaddingTop.Start;
        }
        synchronized (this.onExtraCallback) {
            int i = onWarmupCompleted.onExtraCallbackWithResult[onExtraCallbackWithResult(onviewdraw).ordinal()];
            if (i == 1) {
                geticonpaddingtop = getIconPaddingTop.Start;
            } else if (i == 2) {
                geticonpaddingtop = getIconPaddingTop.Stop;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                geticonpaddingtop = getIconPaddingTop.Hold;
            }
        }
        return geticonpaddingtop;
    }

    @Override // o.initLayout
    public void onExtraCallbackWithResult(@NotNull onViewDraw onviewdraw, boolean z) {
        boolean z2;
        Intrinsics.checkNotNullParameter(onviewdraw, "");
        synchronized (this.onExtraCallback) {
            if (this.IAuthTabCallback.onExtraCallbackWithResult() == getPricingPhaseList.EU) {
                this.IAuthTabCallbackDefault++;
            }
            getIconSize geticonsize = z ? getIconSize.NotDetermined : getIconSize.Revoked;
            if (this.onWarmupCompleted.get(onviewdraw) == geticonsize) {
                z2 = false;
            } else {
                this.onWarmupCompleted.put(onviewdraw, geticonsize);
                z2 = true;
            }
        }
        if (z2) {
            this.onNavigationEvent.onNavigationEvent(onviewdraw);
        }
    }

    @Override // o.initLayout
    public long IAuthTabCallback() {
        Pair pairIAuthTabCallback;
        if (this.IAuthTabCallback.onExtraCallbackWithResult() != getPricingPhaseList.EU) {
            return onWarmupCompleted();
        }
        synchronized (this.onExtraCallback) {
            long j = this.IAuthTabCallbackDefault + 1;
            this.IAuthTabCallbackDefault = j;
            EnumEntries<onViewDraw> entries = onViewDraw.getEntries();
            ArrayList arrayList = new ArrayList();
            for (Object obj : entries) {
                onViewDraw onviewdraw = (onViewDraw) obj;
                getIconSize geticonsize = this.onWarmupCompleted.get(onviewdraw);
                getIconSize geticonsize2 = getIconSize.NotDetermined;
                if (geticonsize != geticonsize2) {
                    this.onWarmupCompleted.put(onviewdraw, geticonsize2);
                    arrayList.add(obj);
                }
            }
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Long.valueOf(j), arrayList);
        }
        long jLongValue = ((Number) pairIAuthTabCallback.onExtraCallbackWithResult()).longValue();
        List list = (List) pairIAuthTabCallback.IAuthTabCallback();
        getBorderRadius<onViewDraw> getborderradius = this.onNavigationEvent;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            getborderradius.onNavigationEvent((onViewDraw) it.next());
        }
        return jLongValue;
    }

    @Override // o.initLayout
    public boolean onNavigationEvent(@NotNull onViewDraw onviewdraw, boolean z, boolean z2, long j) {
        Intrinsics.checkNotNullParameter(onviewdraw, "");
        synchronized (this.onExtraCallback) {
            if (j != this.IAuthTabCallbackDefault) {
                return false;
            }
            getIconSize geticonsize = (!z || z2) ? getIconSize.Revoked : getIconSize.Granted;
            boolean z3 = this.onWarmupCompleted.get(onviewdraw) != geticonsize;
            if (z3) {
                this.onWarmupCompleted.put(onviewdraw, geticonsize);
            }
            if (z3) {
                this.onNavigationEvent.onNavigationEvent(onviewdraw);
            }
            return true;
        }
    }

    private final getIconSize onExtraCallbackWithResult(onViewDraw onviewdraw) {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getIconSize geticonsize = (getIconSize) access8100.onWarmupCompleted(this.onWarmupCompleted, onviewdraw);
        int i4 = onTransact + 29;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return geticonsize;
    }
}
