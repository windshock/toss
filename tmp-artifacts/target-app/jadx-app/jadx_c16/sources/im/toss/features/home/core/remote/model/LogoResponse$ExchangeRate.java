package im.toss.features.home.core.remote.model;

import im.toss.features.home.core.remote.model.LogoResponse$ExchangeRate$;
import im.toss.features.home.core.remote.model.LogoResponse$ExchangeRate$CtaButtonInfo$;
import im.toss.features.home.core.remote.model.LogoResponse$ExchangeRate$Currency$;
import im.toss.features.home.core.remote.model.dst.eventlog.ImpressionEventLogResponse;
import im.toss.features.home.core.remote.model.dst.eventlog.ImpressionEventLogResponse$;
import im.toss.features.home.core.remote.model.dst.handler.HandlerResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TBPermissionHelper;
import o.TombstoneProtosMemoryMappingBuilder;
import o.WindowBridgeExtension3;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LogoResponse$ExchangeRate extends LogoResponse {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final List<CtaButtonInfo> ctaButtonInfos;
    private final List<Currency> currencies;
    private final HandlerResponse handler;
    private final ImpressionEventLogResponse impressionEventLog;

    /* JADX WARN: Illegal instructions before constructor call */
    public LogoResponse$ExchangeRate() {
        List list = null;
        this(list, list, 3, list);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LogoResponse$ExchangeRate$Currency$.serializer.INSTANCE);
        int i2 = IAuthTabCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnTransact = onTransact();
        int i4 = IAuthTabCallback + 71;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
        return kSerializerOnTransact;
    }

    private static final /* synthetic */ KSerializer onTransact() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LogoResponse$ExchangeRate$CtaButtonInfo$.serializer.INSTANCE);
        int i2 = IAuthTabCallback + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 50 / 0;
        }
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStub();
        }
        IAuthTabCallbackStub();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new LogoResponse$ExchangeRate$.ExternalSyntheticLambda0()), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new LogoResponse$ExchangeRate$.ExternalSyntheticLambda1()), null, null};
        int i = onNavigationEvent + 49;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ LogoResponse$ExchangeRate(int i, List list, List list2, ImpressionEventLogResponse impressionEventLogResponse, HandlerResponse handlerResponse, okycx okycxVar) {
        super((DefaultConstructorMarker) null);
        if ((i & 1) == 0) {
            this.currencies = null;
        } else {
            this.currencies = list;
            int i2 = onWarmupCompleted + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 2) == 0) {
            int i5 = onWarmupCompleted + 31;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            this.ctaButtonInfos = null;
            if (i6 != 0) {
                throw null;
            }
        } else {
            this.ctaButtonInfos = list2;
        }
        if ((i & 4) == 0) {
            this.impressionEventLog = null;
            int i7 = 2 % 2;
        } else {
            this.impressionEventLog = impressionEventLogResponse;
        }
        if ((i & 8) != 0) {
            this.handler = handlerResponse;
            return;
        }
        int i8 = onWarmupCompleted + 87;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        this.handler = null;
        if (i9 != 0) {
            throw null;
        }
    }

    public LogoResponse$ExchangeRate(@Nullable List<Currency> list, @Nullable List<CtaButtonInfo> list2) {
        super((DefaultConstructorMarker) null);
        this.currencies = list;
        this.ctaButtonInfos = list2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 97;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 57;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(LogoResponse$ExchangeRate logoResponse$ExchangeRate, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 0))) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[0].getValue(), logoResponse$ExchangeRate.currencies);
        } else {
            int i2 = onWarmupCompleted + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 14 / 0;
                if (logoResponse$ExchangeRate.currencies != null) {
                }
            } else if (logoResponse$ExchangeRate.currencies != null) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = IAuthTabCallback + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (logoResponse$ExchangeRate.ctaButtonInfos != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr[1].getValue(), logoResponse$ExchangeRate.ctaButtonInfos);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || logoResponse$ExchangeRate.onNavigationEvent() != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, ImpressionEventLogResponse$.serializer.INSTANCE, logoResponse$ExchangeRate.onNavigationEvent());
            int i6 = onWarmupCompleted + 13;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || logoResponse$ExchangeRate.IAuthTabCallback() != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, TBPermissionHelper.onExtraCallbackWithResult, logoResponse$ExchangeRate.IAuthTabCallback());
        }
    }

    public /* synthetic */ Object toDto() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        WindowBridgeExtension3.IAuthTabCallback iAuthTabCallbackAsBinder = asBinder();
        int i4 = onWarmupCompleted + 81;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iAuthTabCallbackAsBinder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LogoResponse$ExchangeRate(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 49;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            list = null;
        }
        if ((i & 2) != 0) {
            int i5 = IAuthTabCallback;
            int i6 = i5 + 69;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 9;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            list2 = null;
        }
        this(list, list2);
    }

    public ImpressionEventLogResponse onNavigationEvent() {
        ImpressionEventLogResponse impressionEventLogResponse;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 107;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            impressionEventLogResponse = this.impressionEventLog;
            int i4 = 7 / 0;
        } else {
            impressionEventLogResponse = this.impressionEventLog;
        }
        int i5 = i2 + 29;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return impressionEventLogResponse;
    }

    public HandlerResponse IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.handler;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public WindowBridgeExtension3.IAuthTabCallback asBinder() {
        List listEmptyList;
        List listEmptyList2;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<Currency> list = this.currencies;
        if (list != null) {
            List<Currency> list2 = list;
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                int i3 = IAuthTabCallback + 119;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    listEmptyList.add(((Currency) it.next()).onExtraCallbackWithResult());
                    int i4 = 8 / 0;
                } else {
                    listEmptyList.add(((Currency) it.next()).onExtraCallbackWithResult());
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<CtaButtonInfo> list3 = this.ctaButtonInfos;
        if (list3 != null) {
            List<CtaButtonInfo> list4 = list3;
            listEmptyList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                listEmptyList2.add(((CtaButtonInfo) it2.next()).onWarmupCompleted());
            }
        } else {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        WindowBridgeExtension3.IAuthTabCallback iAuthTabCallback = new WindowBridgeExtension3.IAuthTabCallback(listEmptyList, listEmptyList2);
        int i5 = onWarmupCompleted + 109;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return iAuthTabCallback;
    }
}
