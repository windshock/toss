package o;

import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.uu;
import o.vbt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setWriggleValue implements xkzycx {
    private final boolean onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final boolean onNavigationEvent;

    @Override // o.xkzycx
    public <T> void onExtraCallbackWithResult(@NotNull KClass<T> kClass, @NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> function1) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(function1, "");
    }

    @Override // o.xkzycx
    public <Base> void onNavigationEvent(@NotNull KClass<Base> kClass, @NotNull Function1<? super Base, ? extends py<? super Base>> function1) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(function1, "");
    }

    @Override // o.xkzycx
    public <Base> void onWarmupCompleted(@NotNull KClass<Base> kClass, @NotNull Function1<? super String, ? extends jp<? extends Base>> function1) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(function1, "");
    }

    public setWriggleValue(@NotNull changeVideoState changevideostate) {
        Intrinsics.checkNotNullParameter(changevideostate, "");
        this.onExtraCallbackWithResult = (String) changeVideoState.onExtraCallback(-1254650746, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1254650746, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{changevideostate}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        this.onExtraCallback = changevideostate.writeTypedObject();
        this.onNavigationEvent = changevideostate.IAuthTabCallbackDefault() != wwx2.NONE;
    }

    @Override // o.xkzycx
    public <Base, Sub extends Base> void onExtraCallbackWithResult(@NotNull KClass<Base> kClass, @NotNull KClass<Sub> kClass2, @NotNull KSerializer<Sub> kSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kClass2, "");
        Intrinsics.checkNotNullParameter(kSerializer, "");
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        onNavigationEvent(descriptor, (KClass<?>) kClass2);
        if (this.onExtraCallback || !this.onNavigationEvent) {
            return;
        }
        IAuthTabCallback(descriptor, kClass2);
    }

    private final void onNavigationEvent(SerialDescriptor serialDescriptor, KClass<?> kClass) {
        vbt vbtVarIAuthTabCallback = serialDescriptor.IAuthTabCallback();
        if ((vbtVarIAuthTabCallback instanceof ufy) || Intrinsics.areEqual(vbtVarIAuthTabCallback, vbt.onNavigationEvent.onExtraCallbackWithResult)) {
            throw new IllegalArgumentException("Serializer for " + kClass.getSimpleName() + " can't be registered as a subclass for polymorphic serialization because its kind " + vbtVarIAuthTabCallback + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (this.onExtraCallback || !this.onNavigationEvent) {
            return;
        }
        if (Intrinsics.areEqual(vbtVarIAuthTabCallback, uu.onNavigationEvent.onExtraCallbackWithResult) || Intrinsics.areEqual(vbtVarIAuthTabCallback, uu.onWarmupCompleted.onWarmupCompleted) || (vbtVarIAuthTabCallback instanceof spv) || (vbtVarIAuthTabCallback instanceof vbt.onExtraCallbackWithResult)) {
            throw new IllegalArgumentException("Serializer for " + kClass.getSimpleName() + " of kind " + vbtVarIAuthTabCallback + " cannot be serialized polymorphically with class discriminator.");
        }
    }

    private final void IAuthTabCallback(SerialDescriptor serialDescriptor, KClass<?> kClass) {
        int iOnExtraCallback = serialDescriptor.onExtraCallback();
        for (int i = 0; i < iOnExtraCallback; i++) {
            String strOnWarmupCompleted = serialDescriptor.onWarmupCompleted(i);
            if (Intrinsics.areEqual(strOnWarmupCompleted, this.onExtraCallbackWithResult)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + kClass + " has property '" + strOnWarmupCompleted + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }
}
