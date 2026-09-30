package im.toss.features.account_terminator.core.model;

import im.toss.features.account_terminator.core.model.AccountTerminateStateCheckPollingResult$;
import im.toss.features.account_terminator.core.model.AccountTerminateStateCheckPollingResult$LastStep$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AccountTerminateStateCheckPollingResult {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final boolean isFinish;
    private final LastStep lastStep;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new AccountTerminateStateCheckPollingResult$.ExternalSyntheticLambda0())};

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            LastStep.Companion.serializer();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerSerializer = LastStep.Companion.serializer();
        int i3 = IAuthTabCallback + 103;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerSerializer;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i4 = IAuthTabCallback + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return kSerializerOnExtraCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof im.toss.features.account_terminator.core.model.AccountTerminateStateCheckPollingResult) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 19;
        im.toss.features.account_terminator.core.model.AccountTerminateStateCheckPollingResult.IAuthTabCallback = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (im.toss.features.account_terminator.core.model.AccountTerminateStateCheckPollingResult) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r5.isFinish == r6.isFinish) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r5.lastStep == r6.lastStep) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            int i4 = 10 / 0;
        }
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Boolean.hashCode(this.isFinish);
            throw null;
        }
        int iHashCode2 = Boolean.hashCode(this.isFinish);
        LastStep lastStep = this.lastStep;
        if (lastStep == null) {
            int i3 = IAuthTabCallback + 51;
            onWarmupCompleted = i3 % 128;
            iHashCode = i3 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = lastStep.hashCode();
        }
        int i4 = (iHashCode2 * 31) + iHashCode;
        int i5 = IAuthTabCallback + 121;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountTerminateStateCheckPollingResult(isFinish=" + this.isFinish + ", lastStep=" + this.lastStep + ")";
        int i2 = IAuthTabCallback + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
        return str;
    }

    static {
        int i = onExtraCallback + 9;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ AccountTerminateStateCheckPollingResult(int i, boolean z, LastStep lastStep, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = IAuthTabCallback + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, AccountTerminateStateCheckPollingResult$.serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 105;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.isFinish = z;
        if ((i & 2) != 0) {
            this.lastStep = lastStep;
            return;
        }
        this.lastStep = LastStep.START;
        int i6 = IAuthTabCallback + 19;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(AccountTerminateStateCheckPollingResult accountTerminateStateCheckPollingResult, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onNavigationEvent(serialDescriptor, 0, accountTerminateStateCheckPollingResult.isFinish);
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || accountTerminateStateCheckPollingResult.lastStep != LastStep.START) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr[1].getValue(), accountTerminateStateCheckPollingResult.lastStep);
            int i4 = IAuthTabCallback + 71;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 2;
            }
        }
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 57;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 117;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.isFinish;
        int i4 = i3 + 45;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final LastStep IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 41;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        LastStep lastStep = this.lastStep;
        int i5 = i2 + 121;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return lastStep;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @liq
    public static final class LastStep {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LastStep[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Companion Companion;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        public static final LastStep START = new LastStep("START", 0);
        public static final LastStep ELIGIBILITY = new LastStep("ELIGIBILITY", 1);
        public static final LastStep RECIPIENT = new LastStep("RECIPIENT", 2);
        public static final LastStep ESTIMATE = new LastStep("ESTIMATE", 3);
        public static final LastStep TERMINATE = new LastStep("TERMINATE", 4);
        public static final LastStep ERROR = new LastStep("ERROR", 5);

        public static /* synthetic */ KSerializer $r8$lambda$79YNYzEIEif2gh1oSpxNGoT8GeM() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
            int i4 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializer_init_$_anonymous_;
            }
            throw null;
        }

        private static final /* synthetic */ LastStep[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 45;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            LastStep[] lastStepArr = {START, ELIGIBILITY, RECIPIENT, ESTIMATE, TERMINATE, ERROR};
            int i5 = i2 + 107;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return lastStepArr;
        }

        public static EnumEntries<LastStep> getEntries() {
            EnumEntries<LastStep> enumEntries;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 83;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                enumEntries = $ENTRIES;
                int i4 = 61 / 0;
            } else {
                enumEntries = $ENTRIES;
            }
            int i5 = i2 + 109;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static LastStep valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            LastStep lastStep = (LastStep) Enum.valueOf(LastStep.class, str);
            int i4 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return lastStep;
        }

        public static LastStep[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            LastStep[] lastStepArr = (LastStep[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return lastStepArr;
        }

        private LastStep(String str, int i) {
        }

        private static final /* synthetic */ KSerializer _init_$_anonymous_() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.features.account_terminator.core.model.AccountTerminateStateCheckPollingResult.LastStep", values());
            int i4 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerOnExtraCallbackWithResult;
            }
            throw null;
        }

        public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
            Lazy<KSerializer<Object>> lazy;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                lazy = $cachedSerializer$delegate;
                int i4 = 56 / 0;
            } else {
                lazy = $cachedSerializer$delegate;
            }
            int i5 = i3 + 37;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return lazy;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            LastStep[] lastStepArr$values = $values();
            $VALUES = lastStepArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(lastStepArr$values);
            Companion = new Companion((DefaultConstructorMarker) null);
            $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new AccountTerminateStateCheckPollingResult$LastStep$.ExternalSyntheticLambda0());
            int i = onNavigationEvent + 103;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }
    }
}
