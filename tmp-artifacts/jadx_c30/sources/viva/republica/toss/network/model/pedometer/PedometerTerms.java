package viva.republica.toss.network.model.pedometer;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import net.sf.scuba.smartcards.BuildConfig;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PedometerTerms {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<Term> terms;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.pedometer.PedometerTerms$$ExternalSyntheticLambda0
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = PedometerTerms.onExtraCallbackWithResult();
            int i4 = onWarmupCompleted + 17;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }
    })};

    /* JADX WARN: Illegal instructions before constructor call */
    public PedometerTerms() {
        List list = null;
        this(list, 1, (DefaultConstructorMarker) list);
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = IAuthTabCallback + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(PedometerTerms$Term$$serializer.INSTANCE);
        int i2 = onWarmupCompleted + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 79;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (obj instanceof PedometerTerms) {
            return Intrinsics.areEqual(this.terms, ((PedometerTerms) obj).terms);
        }
        int i3 = IAuthTabCallback + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.terms.hashCode();
        int i4 = IAuthTabCallback + 123;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PedometerTerms(terms=" + this.terms + ")";
        int i2 = IAuthTabCallback + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PedometerTerms> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                PedometerTerms$$serializer pedometerTerms$$serializer = PedometerTerms$$serializer.INSTANCE;
                obj.hashCode();
                throw null;
            }
            PedometerTerms$$serializer pedometerTerms$$serializer2 = PedometerTerms$$serializer.INSTANCE;
            int i3 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return pedometerTerms$$serializer2;
            }
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 47;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ PedometerTerms(int i, List list, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.terms = CollectionsKt.emptyList();
            int i2 = onWarmupCompleted + 97;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.terms = list;
        int i3 = IAuthTabCallback + 33;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public PedometerTerms(@NotNull List<Term> list) {
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        this.terms = list;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(PedometerTerms pedometerTerms, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(pedometerTerms.terms, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), pedometerTerms.terms);
            int i2 = onWarmupCompleted + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = onWarmupCompleted + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 105;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PedometerTerms(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
            int i4 = onWarmupCompleted + 15;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this(list);
    }

    @liq
    public static final class Term {
        public static final Companion Companion = new Companion(null);
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final boolean agreed;
        private final long termsId;

        static {
            int i = onExtraCallback + 45;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                int i2 = 44 / 0;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Term)) {
                return false;
            }
            Term term = (Term) obj;
            if (this.termsId != term.termsId) {
                int i2 = onWarmupCompleted + 29;
                onNavigationEvent = i2 % 128;
                return i2 % 2 != 0;
            }
            if (this.agreed != term.agreed) {
                return false;
            }
            int i3 = onNavigationEvent + 41;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 == 0 ? (Long.hashCode(this.termsId) / 120) - Boolean.hashCode(this.agreed) : (Long.hashCode(this.termsId) * 31) + Boolean.hashCode(this.agreed);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Term(termsId=" + this.termsId + ", agreed=" + this.agreed + ")";
            int i2 = onNavigationEvent + 27;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 21 / 0;
            }
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Term> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 113;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                PedometerTerms$Term$$serializer pedometerTerms$Term$$serializer = PedometerTerms$Term$$serializer.INSTANCE;
                if (i3 == 0) {
                    return pedometerTerms$Term$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public /* synthetic */ Term(int i, long j, boolean z, okycx okycxVar) {
            SerialDescriptor descriptor;
            int i2 = 3;
            if (3 != (i & 3)) {
                int i3 = onWarmupCompleted + 9;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    descriptor = PedometerTerms$Term$$serializer.INSTANCE.getDescriptor();
                    i2 = 4;
                } else {
                    descriptor = PedometerTerms$Term$$serializer.INSTANCE.getDescriptor();
                }
                htf31.onExtraCallbackWithResult(i, i2, descriptor);
                int i4 = 2 % 2;
            }
            this.termsId = j;
            this.agreed = z;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallbackWithResult(Term term, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                vylVar.onExtraCallback(serialDescriptor, 1, term.termsId);
            } else {
                vylVar.onExtraCallback(serialDescriptor, 0, term.termsId);
            }
            vylVar.onNavigationEvent(serialDescriptor, 1, term.agreed);
            int i3 = onNavigationEvent + 55;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }
    }
}
