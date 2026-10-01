package o;

import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.qt;
import o.ujb;
import o.uu;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ujb {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(qt qtVar) {
        Intrinsics.checkNotNullParameter(qtVar, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ SerialDescriptor onNavigationEvent(String str, SerialDescriptor[] serialDescriptorArr, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: kotlinx.serialization.descriptors.SerialDescriptorsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ujb.IAuthTabCallback((qt) obj2);
                }
            };
        }
        return IAuthTabCallback(str, serialDescriptorArr, function1);
    }

    public static final SerialDescriptor IAuthTabCallback(@NotNull String str, @NotNull SerialDescriptor[] serialDescriptorArr, @NotNull Function1<? super qt, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(serialDescriptorArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (StringsKt__StringsKt.isBlank(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        qt qtVar = new qt(str);
        function1.invoke(qtVar);
        return new te(str, uu.onExtraCallbackWithResult.onNavigationEvent, qtVar.onExtraCallback().size(), ArraysKt___ArraysKt.toList(serialDescriptorArr), qtVar);
    }

    public static final SerialDescriptor onExtraCallbackWithResult(@NotNull String str, @NotNull spv spvVar) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(spvVar, "");
        if (StringsKt__StringsKt.isBlank(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return setShakeText.onNavigationEvent(str, spvVar);
    }

    public static final SerialDescriptor IAuthTabCallback(@NotNull String str, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (StringsKt__StringsKt.isBlank(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (Intrinsics.areEqual(str, serialDescriptor.onExtraCallbackWithResult())) {
            throw new IllegalArgumentException(("The name of the wrapped descriptor (" + str + ") cannot be the same as the name of the original descriptor (" + serialDescriptor.onExtraCallbackWithResult() + ')').toString());
        }
        if (serialDescriptor.IAuthTabCallback() instanceof spv) {
            setShakeText.onExtraCallbackWithResult(str);
        }
        return new ur(str, serialDescriptor);
    }

    public static /* synthetic */ SerialDescriptor IAuthTabCallback(String str, vbt vbtVar, SerialDescriptor[] serialDescriptorArr, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: kotlinx.serialization.descriptors.SerialDescriptorsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ujb.onExtraCallback((qt) obj2);
                }
            };
        }
        return onExtraCallback(str, vbtVar, serialDescriptorArr, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(qt qtVar) {
        Intrinsics.checkNotNullParameter(qtVar, "");
        return Unit.INSTANCE;
    }

    public static final SerialDescriptor onExtraCallback(@NotNull String str, @NotNull vbt vbtVar, @NotNull SerialDescriptor[] serialDescriptorArr, @NotNull Function1<? super qt, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(vbtVar, "");
        Intrinsics.checkNotNullParameter(serialDescriptorArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (StringsKt__StringsKt.isBlank(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (Intrinsics.areEqual(vbtVar, uu.onExtraCallbackWithResult.onNavigationEvent)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        qt qtVar = new qt(str);
        function1.invoke(qtVar);
        return new te(str, vbtVar, qtVar.onExtraCallback().size(), ArraysKt___ArraysKt.toList(serialDescriptorArr), qtVar);
    }
}
