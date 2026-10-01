package o;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setImageLottieTosPath {
    private static final SerialDescriptor[] IAuthTabCallback = new SerialDescriptor[0];

    public static final Set<String> IAuthTabCallback(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (serialDescriptor instanceof getDynamicClickListener) {
            return ((getDynamicClickListener) serialDescriptor).asBinder();
        }
        HashSet hashSet = new HashSet(serialDescriptor.onExtraCallback());
        int iOnExtraCallback = serialDescriptor.onExtraCallback();
        for (int i = 0; i < iOnExtraCallback; i++) {
            hashSet.add(serialDescriptor.onWarmupCompleted(i));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] IAuthTabCallback(@Nullable List<? extends SerialDescriptor> list) {
        SerialDescriptor[] serialDescriptorArr;
        List<? extends SerialDescriptor> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? IAuthTabCallback : serialDescriptorArr;
    }

    public static final Void onWarmupCompleted(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        throw new qn(onExtraCallback(kClass));
    }

    public static final String onExtraCallback(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        return onExtraCallback(simpleName);
    }

    public static final String onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "Serializer for class '" + str + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final KClass<Object> onNavigationEvent(@NotNull access5900 access5900Var) {
        Intrinsics.checkNotNullParameter(access5900Var, "");
        access5200 classifier = access5900Var.getClassifier();
        if (classifier instanceof KClass) {
            return (KClass) classifier;
        }
        if (classifier instanceof addCauses) {
            throw new IllegalArgumentException("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported because " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier + '.');
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + classifier);
    }

    public static final access5900 onWarmupCompleted(@NotNull KTypeProjection kTypeProjection) {
        Intrinsics.checkNotNullParameter(kTypeProjection, "");
        access5900 access5900VarOnExtraCallback = kTypeProjection.onExtraCallback();
        if (access5900VarOnExtraCallback != null) {
            return access5900VarOnExtraCallback;
        }
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kTypeProjection.onExtraCallback()).toString());
    }
}
