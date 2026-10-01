package im.toss.rn.toss.core.portal;

import im.toss.rn.toss.core.portal.MonoHermesServiceGate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.adInfo;
import o.checkCanOpenLandingPage;
import o.clearFaultAdjacentMetadata;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.videoFrameChanged;
import o.vyl;
import o.wie2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MonoHermesServiceGate {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private final Set<String> onExtraCallback;
    private final IAuthTabCallback onWarmupCompleted;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final MonoHermesServiceGate onExtraCallbackWithResult = new MonoHermesServiceGate(IAuthTabCallback.OFF, clearFaultAdjacentMetadata.onExtraCallback());
    private static final wie2 onNavigationEvent = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.rn.toss.core.portal.MonoHermesServiceGate$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = MonoHermesServiceGate.onWarmupCompleted((adInfo) obj);
            if (i3 != 0) {
                int i4 = 11 / 0;
            }
            int i5 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return unitOnWarmupCompleted;
        }
    }, 1, (Object) null);

    public static final /* synthetic */ class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[IAuthTabCallback.values().length];
            try {
                iArr[IAuthTabCallback.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IAuthTabCallback.ALLOWLIST.ordinal()] = 2;
                int i = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IAuthTabCallback.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onNavigationEvent = iArr;
            int i4 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(adinfo);
        }
        onExtraCallbackWithResult(adinfo);
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof MonoHermesServiceGate)) {
                return false;
            }
            MonoHermesServiceGate monoHermesServiceGate = (MonoHermesServiceGate) obj;
            return this.onWarmupCompleted == monoHermesServiceGate.onWarmupCompleted && !(Intrinsics.areEqual(this.onExtraCallback, monoHermesServiceGate.onExtraCallback) ^ true);
        }
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 113;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 101;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onWarmupCompleted.hashCode() * 31) + this.onExtraCallback.hashCode();
        int i4 = IAuthTabCallback + 61;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MonoHermesServiceGate(mode=" + this.onWarmupCompleted + ", services=" + this.onExtraCallback + ")";
        int i2 = IAuthTabCallbackStub + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MonoHermesServiceGate(@NotNull IAuthTabCallback iAuthTabCallback, @NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.onWarmupCompleted = iAuthTabCallback;
        this.onExtraCallback = set;
    }

    public static final /* synthetic */ MonoHermesServiceGate onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 35;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        MonoHermesServiceGate monoHermesServiceGate = onExtraCallbackWithResult;
        int i4 = i2 + 99;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return monoHermesServiceGate;
        }
        throw null;
    }

    public static final /* synthetic */ wie2 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        wie2 wie2Var = onNavigationEvent;
        int i5 = i3 + 87;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
        return wie2Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean onExtraCallback() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted.onNavigationEvent[this.onWarmupCompleted.ordinal()];
        if (i2 == 1) {
            return true;
        }
        int i3 = IAuthTabCallback + 67;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0 ? i2 != 2 : i2 != 5) {
            if (i2 == 3) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!this.onExtraCallback.isEmpty()) {
            int i4 = IAuthTabCallback + 41;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = IAuthTabCallback + 19;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean onExtraCallbackWithResult(@NotNull String str) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strOnWarmupCompleted = onNavigationEvent.onWarmupCompleted(Companion, str);
        if (strOnWarmupCompleted.length() == 0) {
            int i2 = IAuthTabCallback + 89;
            IAuthTabCallbackStub = i2 % 128;
            return i2 % 2 == 0;
        }
        int i3 = onWarmupCompleted.onNavigationEvent[this.onWarmupCompleted.ordinal()];
        if (i3 == 1) {
            int i4 = IAuthTabCallback + 69;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = IAuthTabCallback;
        int i6 = i5 + 17;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0 ? i3 == 2 : i3 == 3) {
            return this.onExtraCallback.contains(strOnWarmupCompleted);
        }
        if (i3 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i7 = i5 + 55;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        public static final IAuthTabCallback OFF = new IAuthTabCallback("OFF", 0);
        public static final IAuthTabCallback ALLOWLIST = new IAuthTabCallback("ALLOWLIST", 1);
        public static final IAuthTabCallback ALL = new IAuthTabCallback("ALL", 2);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 13;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {OFF, ALLOWLIST, ALL};
            int i5 = i2 + 107;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 != 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackArr;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onWarmupCompleted + 93;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 50 / 0;
            }
        }
    }

    public static final class onNavigationEvent {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public static final /* synthetic */ String onWarmupCompleted(onNavigationEvent onnavigationevent, String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                onnavigationevent.onNavigationEvent(str);
                throw null;
            }
            String strOnNavigationEvent = onnavigationevent.onNavigationEvent(str);
            int i3 = onExtraCallbackWithResult + 103;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return strOnNavigationEvent;
            }
            obj.hashCode();
            throw null;
        }

        public final MonoHermesServiceGate onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            MonoHermesServiceGate monoHermesServiceGateOnExtraCallbackWithResult = MonoHermesServiceGate.onExtraCallbackWithResult();
            int i4 = onExtraCallback + 35;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return monoHermesServiceGateOnExtraCallbackWithResult;
        }

        public final MonoHermesServiceGate onWarmupCompleted(@NotNull Collection<String> collection) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(collection, "");
            IAuthTabCallback iAuthTabCallback = IAuthTabCallback.ALLOWLIST;
            Collection<String> collection2 = collection;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(onNavigationEvent((String) it.next()));
                int i2 = onExtraCallback + 9;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                int i4 = onExtraCallback + 3;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                if (((String) obj).length() > 0) {
                    int i6 = onExtraCallback + 31;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    arrayList2.add(obj);
                }
            }
            return new MonoHermesServiceGate(iAuthTabCallback, CollectionsKt.toSet(arrayList2));
        }

        public final MonoHermesServiceGate IAuthTabCallback(@NotNull String str) {
            Object obj;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            String strOnExtraCallbackWithResult = onExtraCallbackWithResult(StringsKt.trim(str).toString());
            if (strOnExtraCallbackWithResult.length() == 0) {
                int i2 = onExtraCallback + 67;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return onExtraCallback();
            }
            try {
                Result.Companion companion = Result.Companion;
                wie2 wie2VarOnWarmupCompleted = MonoHermesServiceGate.onWarmupCompleted();
                wie2VarOnWarmupCompleted.onExtraCallback();
                obj = Result.constructor-impl((Payload) wie2VarOnWarmupCompleted.onExtraCallback(Payload.Companion.serializer(), strOnExtraCallbackWithResult));
                int i4 = onExtraCallback + 107;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.onExtraCallback(obj)) {
                obj = null;
            }
            Payload payload = (Payload) obj;
            if (payload == null) {
                return onExtraCallback();
            }
            String strOnWarmupCompleted = payload.onWarmupCompleted();
            String strOnNavigationEvent = onNavigationEvent(strOnWarmupCompleted != null ? strOnWarmupCompleted : "");
            int iHashCode = strOnNavigationEvent.hashCode();
            if (iHashCode != 96673) {
                if (iHashCode != 109935) {
                    if (iHashCode == 372737895 && strOnNavigationEvent.equals("allowlist")) {
                        int i6 = onExtraCallbackWithResult + 17;
                        onExtraCallback = i6 % 128;
                        if (i6 % 2 == 0) {
                            return onWarmupCompleted(payload.onNavigationEvent());
                        }
                        onWarmupCompleted(payload.onNavigationEvent());
                        throw null;
                    }
                } else if (strOnNavigationEvent.equals("off")) {
                    return onExtraCallback();
                }
            } else if (strOnNavigationEvent.equals("all")) {
                return new MonoHermesServiceGate(IAuthTabCallback.ALL, clearFaultAdjacentMetadata.onExtraCallback());
            }
            return onExtraCallback();
        }

        private final String onExtraCallbackWithResult(String str) {
            Object obj;
            int i = 2 % 2;
            if (!StringsKt.startsWith$default(str, "\"", false, 2, (Object) null)) {
                int i2 = onExtraCallback + 107;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }
            try {
                Result.Companion companion = Result.Companion;
                wie2 wie2VarOnWarmupCompleted = MonoHermesServiceGate.onWarmupCompleted();
                wie2VarOnWarmupCompleted.onExtraCallback();
                obj = Result.constructor-impl((String) wie2VarOnWarmupCompleted.onExtraCallback(getWriggleLayout.onNavigationEvent, str));
                int i4 = onExtraCallbackWithResult + 11;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.onExtraCallback(obj)) {
                obj = "";
            }
            String string = StringsKt.trim((String) obj).toString();
            int i6 = onExtraCallbackWithResult + 91;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return string;
        }

        private final String onNavigationEvent(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String string = StringsKt.trim(str).toString();
            if (i3 != 0) {
                Locale locale = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale, "");
                Intrinsics.checkNotNullExpressionValue(string.toLowerCase(locale), "");
                throw null;
            }
            Locale locale2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            String lowerCase = string.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            return lowerCase;
        }
    }

    static {
        int i = onTransact + 79;
        asBinder = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(adinfo, "");
        adinfo.IAuthTabCallback(true);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @liq
    static final class Payload {
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.rn.toss.core.portal.MonoHermesServiceGate$Payload$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 85;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = MonoHermesServiceGate.Payload.onExtraCallback();
                int i4 = onExtraCallbackWithResult + 53;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        })};
        public static final Companion Companion;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String mode;
        private final List<String> services;

        /* JADX WARN: Multi-variable type inference failed */
        public Payload() {
            this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onExtraCallbackWithResult + 89;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 42 / 0;
            }
            return kSerializerOnExtraCallbackWithResult;
        }

        private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
            int i2 = onExtraCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 88 / 0;
            }
            return checkcanopenlandingpage;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 77;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                int i4 = i2 + 55;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            if (!(!(obj instanceof Payload))) {
                Payload payload = (Payload) obj;
                return Intrinsics.areEqual(this.mode, payload.mode) && Intrinsics.areEqual(this.services, payload.services);
            }
            int i6 = i2 + 1;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 99;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.mode;
            if (str == null) {
                int i5 = i2 + 73;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            int iHashCode2 = (iHashCode * 31) + this.services.hashCode();
            int i7 = onExtraCallback + 45;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                return iHashCode2;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Payload(mode=" + this.mode + ", services=" + this.services + ")";
            int i2 = onExtraCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Payload> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 121;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                MonoHermesServiceGate$Payload$$serializer monoHermesServiceGate$Payload$$serializer = MonoHermesServiceGate$Payload$$serializer.INSTANCE;
                int i4 = onNavigationEvent + 35;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return monoHermesServiceGate$Payload$$serializer;
                }
                throw null;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = onNavigationEvent + 105;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public /* synthetic */ Payload(int i, String str, List list, okycx okycxVar) {
            if ((i & 1) == 0) {
                int i2 = 2 % 2;
                str = null;
            }
            this.mode = str;
            if ((i & 2) != 0) {
                this.services = list;
                int i3 = onExtraCallback + 31;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            this.services = CollectionsKt.emptyList();
            int i5 = onExtraCallbackWithResult + 81;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 55 / 0;
            }
        }

        public Payload(@Nullable String str, @NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.mode = str;
            this.services = list;
        }

        @JvmStatic
        public static final /* synthetic */ void IAuthTabCallback(Payload payload, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || payload.mode != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, payload.mode);
                int i4 = onExtraCallback + 47;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(payload.services, CollectionsKt.emptyList())) {
                vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), payload.services);
            }
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallback() {
            Lazy<KSerializer<Object>>[] lazyArr;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                lazyArr = $childSerializers;
                int i4 = 1 / 0;
            } else {
                lazyArr = $childSerializers;
            }
            int i5 = i3 + 75;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return lazyArr;
            }
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Payload(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallbackWithResult + 67;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
                str = null;
            }
            if ((i & 2) != 0) {
                int i4 = onExtraCallback + 15;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                list = CollectionsKt.emptyList();
            }
            this(str, list);
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.mode;
            int i5 = i3 + 95;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final List<String> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            List<String> list = this.services;
            int i5 = i3 + 105;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }
    }
}
