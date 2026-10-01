package im.toss.features.leave.domain.entity;

import im.toss.features.leave.domain.entity.LeaveTodoTaskStatus$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.updateRenderInfoForVideo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LeaveTodoTaskStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LeaveTodoTaskStatus[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final LeaveTodoTaskStatus REMAINING = new LeaveTodoTaskStatus("REMAINING", 0);
    public static final LeaveTodoTaskStatus DONE = new LeaveTodoTaskStatus("DONE", 1);

    public static /* synthetic */ KSerializer $r8$lambda$XaIfbkJH2aXl8_xWUPwdhq2mV9k() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$_anonymous_();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        int i3 = onWarmupCompleted + 89;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 95 / 0;
        }
        return kSerializer_init_$_anonymous_;
    }

    private static final /* synthetic */ LeaveTodoTaskStatus[] $values() {
        LeaveTodoTaskStatus[] leaveTodoTaskStatusArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            LeaveTodoTaskStatus leaveTodoTaskStatus = REMAINING;
            LeaveTodoTaskStatus leaveTodoTaskStatus2 = DONE;
            leaveTodoTaskStatusArr = new LeaveTodoTaskStatus[4];
            leaveTodoTaskStatusArr[0] = leaveTodoTaskStatus;
            leaveTodoTaskStatusArr[1] = leaveTodoTaskStatus2;
        } else {
            leaveTodoTaskStatusArr = new LeaveTodoTaskStatus[]{REMAINING, DONE};
        }
        int i4 = i3 + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return leaveTodoTaskStatusArr;
    }

    public static EnumEntries<LeaveTodoTaskStatus> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LeaveTodoTaskStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        LeaveTodoTaskStatus leaveTodoTaskStatus = (LeaveTodoTaskStatus) Enum.valueOf(LeaveTodoTaskStatus.class, str);
        int i4 = onExtraCallback + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return leaveTodoTaskStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LeaveTodoTaskStatus[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        LeaveTodoTaskStatus[] leaveTodoTaskStatusArr = $VALUES;
        if (i3 == 0) {
            return (LeaveTodoTaskStatus[]) leaveTodoTaskStatusArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private LeaveTodoTaskStatus(String str, int i) {
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.features.leave.domain.entity.LeaveTodoTaskStatus", values());
        int i4 = onExtraCallback + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 53;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        int i5 = i2 + 23;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return lazy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        LeaveTodoTaskStatus[] leaveTodoTaskStatusArr$values = $values();
        $VALUES = leaveTodoTaskStatusArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(leaveTodoTaskStatusArr$values);
        Companion = new Companion((DefaultConstructorMarker) null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new LeaveTodoTaskStatus$.ExternalSyntheticLambda0());
        int i = onExtraCallbackWithResult + 49;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
