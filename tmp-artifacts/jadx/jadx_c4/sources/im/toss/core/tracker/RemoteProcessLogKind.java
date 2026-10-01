package im.toss.core.tracker;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.nc;
import o.updateRenderInfoForVideo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RemoteProcessLogKind {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RemoteProcessLogKind[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    @nc(IAuthTabCallback = "event")
    public static final RemoteProcessLogKind EVENT = new RemoteProcessLogKind("EVENT", 0);

    @nc(IAuthTabCallback = "app_log")
    public static final RemoteProcessLogKind APP_LOG = new RemoteProcessLogKind("APP_LOG", 1);

    public static /* synthetic */ KSerializer $r8$lambda$gOoPrncg660GDHIx51PQuphKW0g() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = onNavigationEvent + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer_init_$_anonymous_;
    }

    private static final /* synthetic */ RemoteProcessLogKind[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        RemoteProcessLogKind[] remoteProcessLogKindArr = {EVENT, APP_LOG};
        int i5 = i2 + 97;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return remoteProcessLogKindArr;
    }

    public static EnumEntries<RemoteProcessLogKind> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<RemoteProcessLogKind> enumEntries = $ENTRIES;
        int i5 = i2 + 107;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static RemoteProcessLogKind valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RemoteProcessLogKind remoteProcessLogKind = (RemoteProcessLogKind) Enum.valueOf(RemoteProcessLogKind.class, str);
        int i4 = onExtraCallback + 13;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return remoteProcessLogKind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RemoteProcessLogKind[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        RemoteProcessLogKind[] remoteProcessLogKindArr = (RemoteProcessLogKind[]) $VALUES.clone();
        int i4 = onExtraCallback + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return remoteProcessLogKindArr;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) RemoteProcessLogKind.access$get$cachedSerializer$delegate$cp().getValue();
            if (i3 == 0) {
                return kSerializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final KSerializer<RemoteProcessLogKind> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted();
            }
            onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private RemoteProcessLogKind(String str, int i) {
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        KSerializer kSerializerOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            RemoteProcessLogKind[] remoteProcessLogKindArrValues = values();
            String[] strArr = new String[2];
            strArr[0] = "event";
            strArr[0] = "app_log";
            Annotation[][] annotationArr = new Annotation[3][];
            annotationArr[0] = null;
            annotationArr[0] = null;
            kSerializerOnNavigationEvent = updateRenderInfoForVideo.onNavigationEvent("im.toss.core.tracker.RemoteProcessLogKind", remoteProcessLogKindArrValues, strArr, annotationArr, (Annotation[]) null);
        } else {
            kSerializerOnNavigationEvent = updateRenderInfoForVideo.onNavigationEvent("im.toss.core.tracker.RemoteProcessLogKind", values(), new String[]{"event", "app_log"}, new Annotation[][]{null, null}, (Annotation[]) null);
        }
        int i3 = onNavigationEvent + 99;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerOnNavigationEvent;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $cachedSerializer$delegate;
        }
        throw null;
    }

    static {
        RemoteProcessLogKind[] remoteProcessLogKindArr$values = $values();
        $VALUES = remoteProcessLogKindArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(remoteProcessLogKindArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.core.tracker.RemoteProcessLogKind$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 31;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer$r8$lambda$gOoPrncg660GDHIx51PQuphKW0g = RemoteProcessLogKind.$r8$lambda$gOoPrncg660GDHIx51PQuphKW0g();
                int i4 = onWarmupCompleted + 45;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializer$r8$lambda$gOoPrncg660GDHIx51PQuphKW0g;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i = IAuthTabCallback + 75;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
