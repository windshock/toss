package o;

import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.JsonEncodingException;
import o.vbt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setRecycled {

    public final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[wwx2.values().length];
            try {
                iArr[wwx2.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wwx2.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wwx2.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onNavigationEvent = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(py<?> pyVar, py<?> pyVar2, String str) {
        if ((pyVar instanceof kt) && getDynamicLayoutBrickValue.onWarmupCompleted(pyVar2.getDescriptor()).contains(str)) {
            String strOnExtraCallbackWithResult = ((kt) pyVar).getDescriptor().onExtraCallbackWithResult();
            throw new IllegalStateException(("Sealed class '" + pyVar2.getDescriptor().onExtraCallbackWithResult() + "' cannot be serialized as base class '" + strOnExtraCallbackWithResult + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }

    public static final void onWarmupCompleted(@NotNull vbt vbtVar) {
        Intrinsics.checkNotNullParameter(vbtVar, "");
        if (vbtVar instanceof vbt.onExtraCallbackWithResult) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (vbtVar instanceof spv) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (vbtVar instanceof ufy) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String IAuthTabCallback(@NotNull SerialDescriptor serialDescriptor, @NotNull wie2 wie2Var) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(wie2Var, "");
        for (Annotation annotation : serialDescriptor.onNavigationEvent()) {
            if (annotation instanceof appInfo) {
                return ((appInfo) annotation).IAuthTabCallback();
            }
        }
        Object[] objArr = {wie2Var.IAuthTabCallback()};
        return (String) changeVideoState.onExtraCallback(-1254650746, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1254650746, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    public static final Void onExtraCallback(@Nullable String str, @NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        throw new JsonEncodingException("Class with serial name " + str + " cannot be serialized polymorphically because it is represented as " + Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName() + ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }
}
