package viva.republica.toss.network.model.electronicdocument.wallet;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.updateRenderInfoForVideo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EDocStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EDocStatus[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final EDocStatus ISSUE_SUCCESS = new EDocStatus("ISSUE_SUCCESS", 0);
    public static final EDocStatus APPLY_AWAIT = new EDocStatus("APPLY_AWAIT", 1);
    public static final EDocStatus ISSUE_FAILURE = new EDocStatus("ISSUE_FAILURE", 2);

    public static /* synthetic */ KSerializer $r8$lambda$qgG1scuNaugC6wuRObIuaChGW5I() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$_anonymous_();
            throw null;
        }
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        int i3 = onExtraCallback + 21;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializer_init_$_anonymous_;
        }
        throw null;
    }

    private static final /* synthetic */ EDocStatus[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        EDocStatus[] eDocStatusArr = {ISSUE_SUCCESS, APPLY_AWAIT, ISSUE_FAILURE};
        int i5 = i3 + 7;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return eDocStatusArr;
        }
        throw null;
    }

    public static EnumEntries<EDocStatus> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<EDocStatus> enumEntries = $ENTRIES;
        int i4 = i3 + 87;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static EDocStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        EDocStatus eDocStatus = (EDocStatus) Enum.valueOf(EDocStatus.class, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return eDocStatus;
    }

    public static EDocStatus[] values() {
        EDocStatus[] eDocStatusArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            eDocStatusArr = (EDocStatus[]) $VALUES.clone();
            int i3 = 53 / 0;
        } else {
            eDocStatusArr = (EDocStatus[]) $VALUES.clone();
        }
        int i4 = IAuthTabCallback + 31;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return eDocStatusArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) EDocStatus.access$get$cachedSerializer$delegate$cp().getValue();
            int i4 = onWarmupCompleted + 41;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializer;
        }

        public final KSerializer<EDocStatus> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<EDocStatus> kSerializerOnNavigationEvent = onNavigationEvent();
            if (i3 == 0) {
                int i4 = 61 / 0;
            }
            return kSerializerOnNavigationEvent;
        }
    }

    private EDocStatus(String str, int i) {
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.electronicdocument.wallet.EDocStatus", values());
        int i4 = onExtraCallback + 105;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        int i5 = i3 + 73;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazy;
    }

    static {
        EDocStatus[] eDocStatusArr$values = $values();
        $VALUES = eDocStatusArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(eDocStatusArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.wallet.EDocStatus$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 77;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer$r8$lambda$qgG1scuNaugC6wuRObIuaChGW5I = EDocStatus.$r8$lambda$qgG1scuNaugC6wuRObIuaChGW5I();
                int i4 = onExtraCallback + 21;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializer$r8$lambda$qgG1scuNaugC6wuRObIuaChGW5I;
            }
        });
        int i = onNavigationEvent + 109;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 19 / 0;
        }
    }
}
