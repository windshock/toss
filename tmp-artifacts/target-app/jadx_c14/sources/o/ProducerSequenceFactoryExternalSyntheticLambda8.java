package o;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ProducerSequenceFactoryExternalSyntheticLambda8 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda8[] $VALUES;
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final ProducerSequenceFactoryExternalSyntheticLambda8 INTEREST = new ProducerSequenceFactoryExternalSyntheticLambda8("INTEREST", 0);
    public static final ProducerSequenceFactoryExternalSyntheticLambda8 AMOUNT = new ProducerSequenceFactoryExternalSyntheticLambda8("AMOUNT", 1);

    private static final /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda8[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        ProducerSequenceFactoryExternalSyntheticLambda8[] producerSequenceFactoryExternalSyntheticLambda8Arr = {INTEREST, AMOUNT};
        int i5 = i3 + 85;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return producerSequenceFactoryExternalSyntheticLambda8Arr;
    }

    public static EnumEntries<ProducerSequenceFactoryExternalSyntheticLambda8> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 109;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        EnumEntries<ProducerSequenceFactoryExternalSyntheticLambda8> enumEntries = $ENTRIES;
        int i4 = i2 + 101;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return enumEntries;
        }
        obj.hashCode();
        throw null;
    }

    public static ProducerSequenceFactoryExternalSyntheticLambda8 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ProducerSequenceFactoryExternalSyntheticLambda8 producerSequenceFactoryExternalSyntheticLambda8 = (ProducerSequenceFactoryExternalSyntheticLambda8) Enum.valueOf(ProducerSequenceFactoryExternalSyntheticLambda8.class, str);
        int i4 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return producerSequenceFactoryExternalSyntheticLambda8;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ProducerSequenceFactoryExternalSyntheticLambda8[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ProducerSequenceFactoryExternalSyntheticLambda8[] producerSequenceFactoryExternalSyntheticLambda8Arr = (ProducerSequenceFactoryExternalSyntheticLambda8[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return producerSequenceFactoryExternalSyntheticLambda8Arr;
    }

    private ProducerSequenceFactoryExternalSyntheticLambda8(String str, int i) {
    }

    static {
        ProducerSequenceFactoryExternalSyntheticLambda8[] producerSequenceFactoryExternalSyntheticLambda8Arr$values = $values();
        $VALUES = producerSequenceFactoryExternalSyntheticLambda8Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(producerSequenceFactoryExternalSyntheticLambda8Arr$values);
        Companion = new onNavigationEvent(null);
        int i = IAuthTabCallback + 19;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 52 / 0;
        }
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final ProducerSequenceFactoryExternalSyntheticLambda8 onExtraCallbackWithResult(@Nullable String str) {
            Iterator it;
            Object obj;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 1;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (str != null) {
                int i5 = i2 + 25;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    it = ProducerSequenceFactoryExternalSyntheticLambda8.getEntries().iterator();
                    int i6 = 14 / 0;
                } else {
                    it = ProducerSequenceFactoryExternalSyntheticLambda8.getEntries().iterator();
                }
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    int i7 = IAuthTabCallback + 23;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    Object next = it.next();
                    if (StringsKt.contains$default(str, ((ProducerSequenceFactoryExternalSyntheticLambda8) next).name(), false, 2, (Object) null)) {
                        obj = next;
                        break;
                    }
                }
                ProducerSequenceFactoryExternalSyntheticLambda8 producerSequenceFactoryExternalSyntheticLambda8 = (ProducerSequenceFactoryExternalSyntheticLambda8) obj;
                if (producerSequenceFactoryExternalSyntheticLambda8 != null) {
                    return producerSequenceFactoryExternalSyntheticLambda8;
                }
            }
            ProducerSequenceFactoryExternalSyntheticLambda8 producerSequenceFactoryExternalSyntheticLambda82 = ProducerSequenceFactoryExternalSyntheticLambda8.INTEREST;
            int i9 = onExtraCallback + 43;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 88 / 0;
            }
            return producerSequenceFactoryExternalSyntheticLambda82;
        }

        public final ProducerSequenceFactoryExternalSyntheticLambda8 onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            ProducerSequenceFactoryExternalSyntheticLambda8 producerSequenceFactoryExternalSyntheticLambda8 = (ProducerSequenceFactoryExternalSyntheticLambda8) CollectionsKt.getOrNull(ProducerSequenceFactoryExternalSyntheticLambda8.getEntries(), i);
            if (producerSequenceFactoryExternalSyntheticLambda8 != null) {
                return producerSequenceFactoryExternalSyntheticLambda8;
            }
            int i3 = IAuthTabCallback + 99;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            ProducerSequenceFactoryExternalSyntheticLambda8 producerSequenceFactoryExternalSyntheticLambda82 = ProducerSequenceFactoryExternalSyntheticLambda8.INTEREST;
            int i5 = onExtraCallback + 69;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return producerSequenceFactoryExternalSyntheticLambda82;
        }
    }
}
