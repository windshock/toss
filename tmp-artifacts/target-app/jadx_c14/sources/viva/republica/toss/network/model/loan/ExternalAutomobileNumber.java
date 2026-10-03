package viva.republica.toss.network.model.loan;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.okycx;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.ExternalAutomobileNumber$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ExternalAutomobileNumber {
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.ExternalAutomobileNumber$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            KSerializer kSerializerIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                kSerializerIAuthTabCallback = ExternalAutomobileNumber.IAuthTabCallback();
                int i3 = 89 / 0;
            } else {
                kSerializerIAuthTabCallback = ExternalAutomobileNumber.IAuthTabCallback();
            }
            int i4 = onNavigationEvent + 7;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    })};
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String automobileNumber;
    private final onExtraCallback deactivatedAutomobileUiType;
    private final Boolean isConfirmNeeded;

    public ExternalAutomobileNumber() {
        this((String) null, (Boolean) null, (onExtraCallback) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        KSerializer kSerializerIAuthTabCallbackStub;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
            int i3 = 34 / 0;
        } else {
            kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
        }
        int i4 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallbackStub;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.loan.ExternalAutomobileNumber.DeactivatedAutomobileUiType", onExtraCallback.values());
        }
        updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.loan.ExternalAutomobileNumber.DeactivatedAutomobileUiType", onExtraCallback.values());
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof ExternalAutomobileNumber)) {
            int i3 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        ExternalAutomobileNumber externalAutomobileNumber = (ExternalAutomobileNumber) obj;
        if (!Intrinsics.areEqual(this.automobileNumber, externalAutomobileNumber.automobileNumber) || !Intrinsics.areEqual(this.isConfirmNeeded, externalAutomobileNumber.isConfirmNeeded) || this.deactivatedAutomobileUiType != externalAutomobileNumber.deactivatedAutomobileUiType) {
            return false;
        }
        int i5 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.automobileNumber;
        int iHashCode2 = 0;
        if (str == null) {
            int i5 = i3 + 91;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        Boolean bool = this.isConfirmNeeded;
        if (bool != null) {
            int i7 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                bool.hashCode();
                throw null;
            }
            iHashCode2 = bool.hashCode();
        }
        int iHashCode3 = (((iHashCode * 31) + iHashCode2) * 31) + this.deactivatedAutomobileUiType.hashCode();
        int i8 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 != 0) {
            return iHashCode3;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ExternalAutomobileNumber(automobileNumber=" + this.automobileNumber + ", isConfirmNeeded=" + this.isConfirmNeeded + ", deactivatedAutomobileUiType=" + this.deactivatedAutomobileUiType + ")";
        int i2 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 3 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ExternalAutomobileNumber> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ExternalAutomobileNumber$.serializer serializerVar = ExternalAutomobileNumber$.serializer.INSTANCE;
            int i4 = onExtraCallback + 83;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onNavigationEvent + 97;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ ExternalAutomobileNumber(int i, String str, Boolean bool, onExtraCallback onextracallback, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            int i2 = 2 % 2;
            str = null;
        }
        this.automobileNumber = str;
        if ((i & 2) == 0) {
            int i3 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                this.isConfirmNeeded = Boolean.FALSE;
                obj.hashCode();
                throw null;
            }
            this.isConfirmNeeded = Boolean.FALSE;
            int i4 = 2 % 2;
        } else {
            this.isConfirmNeeded = bool;
        }
        if ((i & 4) != 0) {
            this.deactivatedAutomobileUiType = onextracallback;
            return;
        }
        int i5 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        this.deactivatedAutomobileUiType = onExtraCallback.CONTROL;
    }

    public ExternalAutomobileNumber(@Nullable String str, @Nullable Boolean bool, @NotNull onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.automobileNumber = str;
        this.isConfirmNeeded = bool;
        this.deactivatedAutomobileUiType = onextracallback;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.loan.ExternalAutomobileNumber r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.ExternalAutomobileNumber.$childSerializers
            r2 = 0
            boolean r3 = r7.onWarmupCompleted(r8, r2)
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == r4) goto Lf
            goto L26
        Lf:
            int r3 = viva.republica.toss.network.model.loan.ExternalAutomobileNumber.onExtraCallbackWithResult
            int r3 = r3 + 121
            int r5 = r3 % 128
            viva.republica.toss.network.model.loan.ExternalAutomobileNumber.IAuthTabCallback = r5
            int r3 = r3 % r0
            if (r3 == 0) goto L22
            java.lang.String r3 = r6.automobileNumber
            r5 = 27
            int r5 = r5 / r2
            if (r3 == 0) goto L36
            goto L26
        L22:
            java.lang.String r3 = r6.automobileNumber
            if (r3 == 0) goto L36
        L26:
            o.getWriggleLayout r3 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r5 = r6.automobileNumber
            r7.onExtraCallbackWithResult(r8, r2, r3, r5)
            int r2 = viva.republica.toss.network.model.loan.ExternalAutomobileNumber.onExtraCallbackWithResult
            int r2 = r2 + 55
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.ExternalAutomobileNumber.IAuthTabCallback = r3
            int r2 = r2 % r0
        L36:
            boolean r2 = r7.onWarmupCompleted(r8, r4)
            if (r2 != 0) goto L4f
            int r2 = viva.republica.toss.network.model.loan.ExternalAutomobileNumber.IAuthTabCallback
            int r2 = r2 + 11
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.ExternalAutomobileNumber.onExtraCallbackWithResult = r3
            int r2 = r2 % r0
            java.lang.Boolean r2 = r6.isConfirmNeeded
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L56
        L4f:
            o.getBgColor r2 = o.getBgColor.IAuthTabCallback
            java.lang.Boolean r3 = r6.isConfirmNeeded
            r7.onExtraCallbackWithResult(r8, r4, r2, r3)
        L56:
            boolean r2 = r7.onWarmupCompleted(r8, r0)
            if (r2 != 0) goto L62
            viva.republica.toss.network.model.loan.ExternalAutomobileNumber$onExtraCallback r2 = r6.deactivatedAutomobileUiType
            viva.republica.toss.network.model.loan.ExternalAutomobileNumber$onExtraCallback r3 = viva.republica.toss.network.model.loan.ExternalAutomobileNumber.onExtraCallback.CONTROL
            if (r2 == r3) goto L6f
        L62:
            r1 = r1[r0]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            viva.republica.toss.network.model.loan.ExternalAutomobileNumber$onExtraCallback r6 = r6.deactivatedAutomobileUiType
            r7.onNavigationEvent(r8, r0, r1, r6)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.ExternalAutomobileNumber.onExtraCallbackWithResult(viva.republica.toss.network.model.loan.ExternalAutomobileNumber, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ExternalAutomobileNumber(String str, Boolean bool, onExtraCallback onextracallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 45;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 121;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str = null;
        }
        if ((i & 2) != 0) {
            int i7 = onExtraCallbackWithResult + 43;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                bool = Boolean.FALSE;
                int i8 = 57 / 0;
            } else {
                bool = Boolean.FALSE;
            }
            int i9 = 2 % 2;
        }
        if ((i & 4) != 0) {
            int i10 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 != 0) {
                onextracallback = onExtraCallback.CONTROL;
                int i11 = 20 / 0;
            } else {
                onextracallback = onExtraCallback.CONTROL;
            }
            int i12 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
        }
        this(str, bool, onextracallback);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.automobileNumber;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final onExtraCallback onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.deactivatedAutomobileUiType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        public static final onExtraCallback CONTROL = new onExtraCallback("CONTROL", 0);
        public static final onExtraCallback CONFIRM_AFTER_FETCH = new onExtraCallback("CONFIRM_AFTER_FETCH", 1);
        public static final onExtraCallback NOTICE_BEFORE_PREFILL = new onExtraCallback("NOTICE_BEFORE_PREFILL", 2);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            onExtraCallback[] onextracallbackArr = {CONTROL, CONFIRM_AFTER_FETCH, NOTICE_BEFORE_PREFILL};
            int i5 = i3 + 11;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i3 + 41;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback[] values() {
            onExtraCallback[] onextracallbackArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
                int i3 = 43 / 0;
            } else {
                onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            }
            int i4 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 1 / 0;
            }
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onWarmupCompleted + 93;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean isControl() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this == CONTROL) {
                return true;
            }
            int i4 = i3 + 93;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public final boolean isConfirmAfterFetch() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 19;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this == CONFIRM_AFTER_FETCH) {
                int i5 = i4 + 31;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            int i7 = i2 + 5;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public final boolean isNoticeBeforePrefill() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (this != NOTICE_BEFORE_PREFILL) {
                return false;
            }
            int i5 = i3 + 109;
            int i6 = i5 % 128;
            onExtraCallbackWithResult = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 109;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.areEqual(this.isConfirmNeeded, Boolean.TRUE);
            throw null;
        }
        boolean zAreEqual = Intrinsics.areEqual(this.isConfirmNeeded, Boolean.TRUE);
        int i3 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return zAreEqual;
        }
        obj.hashCode();
        throw null;
    }
}
