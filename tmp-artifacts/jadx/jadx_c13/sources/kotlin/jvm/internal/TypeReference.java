package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlin.reflect.KTypeProjection;
import o.access5200;
import o.access5900;
import o.addAllOpenFds;
import o.clearRegisters;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TypeReference implements access5900 {
    public static final Companion Companion = new Companion(null);
    public static final int IS_MARKED_NULLABLE = 1;
    public static final int IS_MUTABLE_COLLECTION_TYPE = 2;
    public static final int IS_NOTHING_TYPE = 4;
    private final List<KTypeProjection> arguments;
    private final access5200 classifier;
    private final int flags;
    private final access5900 platformTypeUpperBound;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[addAllOpenFds.values().length];
            try {
                iArr[addAllOpenFds.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[addAllOpenFds.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[addAllOpenFds.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getFlags$kotlin_stdlib$annotations() {
    }

    public static /* synthetic */ void getPlatformTypeUpperBound$kotlin_stdlib$annotations() {
    }

    public TypeReference(@NotNull access5200 access5200Var, @NotNull List<KTypeProjection> list, @Nullable access5900 access5900Var, int i) {
        Intrinsics.checkNotNullParameter(access5200Var, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.classifier = access5200Var;
        this.arguments = list;
        this.platformTypeUpperBound = access5900Var;
        this.flags = i;
    }

    @Override // o.access5900
    public access5200 getClassifier() {
        return this.classifier;
    }

    @Override // o.access5900
    public List<KTypeProjection> getArguments() {
        return this.arguments;
    }

    public final access5900 getPlatformTypeUpperBound$kotlin_stdlib() {
        return this.platformTypeUpperBound;
    }

    public final int getFlags$kotlin_stdlib() {
        return this.flags;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeReference(@NotNull access5200 access5200Var, @NotNull List<KTypeProjection> list, boolean z) {
        this(access5200Var, list, null, z ? 1 : 0);
        Intrinsics.checkNotNullParameter(access5200Var, "");
        Intrinsics.checkNotNullParameter(list, "");
    }

    @Override // o.access4600
    public List<Annotation> getAnnotations() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // o.access5900
    public boolean isMarkedNullable() {
        return (this.flags & 1) != 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof TypeReference)) {
            return false;
        }
        TypeReference typeReference = (TypeReference) obj;
        return Intrinsics.areEqual(getClassifier(), typeReference.getClassifier()) && Intrinsics.areEqual(getArguments(), typeReference.getArguments()) && Intrinsics.areEqual(this.platformTypeUpperBound, typeReference.platformTypeUpperBound) && this.flags == typeReference.flags;
    }

    public int hashCode() {
        return (((getClassifier().hashCode() * 31) + getArguments().hashCode()) * 31) + Integer.hashCode(this.flags);
    }

    public String toString() {
        return asString(false) + " (Kotlin reflection is not available)";
    }

    private final String asString(boolean z) {
        String name;
        access5200 classifier = getClassifier();
        KClass kClass = classifier instanceof KClass ? (KClass) classifier : null;
        Class<?> clsOnNavigationEvent = kClass != null ? clearRegisters.onNavigationEvent(kClass) : null;
        if (clsOnNavigationEvent == null) {
            name = getClassifier().toString();
        } else if ((this.flags & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsOnNavigationEvent.isArray()) {
            name = getArrayClassName(clsOnNavigationEvent);
        } else {
            name = (z && clsOnNavigationEvent.isPrimitive()) ? clearRegisters.onExtraCallback((KClass) getClassifier()).getName() : clsOnNavigationEvent.getName();
        }
        boolean zIsEmpty = getArguments().isEmpty();
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        String strJoinToString$default = zIsEmpty ? _UrlKt.FRAGMENT_ENCODE_SET : CollectionsKt___CollectionsKt.joinToString$default(getArguments(), ", ", "<", ">", 0, null, new Function1() { // from class: kotlin.jvm.internal.TypeReference$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TypeReference.asString$lambda$0(this.f$0, (KTypeProjection) obj);
            }
        }, 24, null);
        if (isMarkedNullable()) {
            str = "?";
        }
        String str2 = name + strJoinToString$default + str;
        access5900 access5900Var = this.platformTypeUpperBound;
        if (!(access5900Var instanceof TypeReference)) {
            return str2;
        }
        String strAsString = ((TypeReference) access5900Var).asString(true);
        if (Intrinsics.areEqual(strAsString, str2)) {
            return str2;
        }
        if (Intrinsics.areEqual(strAsString, str2 + '?')) {
            return str2 + '!';
        }
        return '(' + str2 + ".." + strAsString + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence asString$lambda$0(TypeReference typeReference, KTypeProjection kTypeProjection) {
        Intrinsics.checkNotNullParameter(kTypeProjection, "");
        return typeReference.asString(kTypeProjection);
    }

    private final String getArrayClassName(Class<?> cls) {
        return Intrinsics.areEqual(cls, boolean[].class) ? "kotlin.BooleanArray" : Intrinsics.areEqual(cls, char[].class) ? "kotlin.CharArray" : Intrinsics.areEqual(cls, byte[].class) ? "kotlin.ByteArray" : Intrinsics.areEqual(cls, short[].class) ? "kotlin.ShortArray" : Intrinsics.areEqual(cls, int[].class) ? "kotlin.IntArray" : Intrinsics.areEqual(cls, float[].class) ? "kotlin.FloatArray" : Intrinsics.areEqual(cls, long[].class) ? "kotlin.LongArray" : Intrinsics.areEqual(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    private final String asString(KTypeProjection kTypeProjection) {
        String strValueOf;
        if (kTypeProjection.IAuthTabCallback() == null) {
            return "*";
        }
        access5900 access5900VarOnExtraCallback = kTypeProjection.onExtraCallback();
        TypeReference typeReference = access5900VarOnExtraCallback instanceof TypeReference ? (TypeReference) access5900VarOnExtraCallback : null;
        if (typeReference == null || (strValueOf = typeReference.asString(true)) == null) {
            strValueOf = String.valueOf(kTypeProjection.onExtraCallback());
        }
        int i = WhenMappings.$EnumSwitchMapping$0[kTypeProjection.IAuthTabCallback().ordinal()];
        if (i == 1) {
            return strValueOf;
        }
        if (i == 2) {
            return "in " + strValueOf;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + strValueOf;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
