package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.uu;
import o.vbt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class cypher4EncryptWithNoWrapBase64 {
    public static final cypher4Encrypt IAuthTabCallback(@NotNull wie2 wie2Var, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        vbt vbtVarIAuthTabCallback = serialDescriptor.IAuthTabCallback();
        if (vbtVarIAuthTabCallback instanceof ufy) {
            return cypher4Encrypt.POLY_OBJ;
        }
        if (Intrinsics.areEqual(vbtVarIAuthTabCallback, uu.onNavigationEvent.onExtraCallbackWithResult)) {
            return cypher4Encrypt.LIST;
        }
        if (!Intrinsics.areEqual(vbtVarIAuthTabCallback, uu.onWarmupCompleted.onWarmupCompleted)) {
            return cypher4Encrypt.OBJ;
        }
        SerialDescriptor serialDescriptorOnNavigationEvent = onNavigationEvent(serialDescriptor.onNavigationEvent(0), wie2Var.onExtraCallback());
        vbt vbtVarIAuthTabCallback2 = serialDescriptorOnNavigationEvent.IAuthTabCallback();
        if ((vbtVarIAuthTabCallback2 instanceof spv) || Intrinsics.areEqual(vbtVarIAuthTabCallback2, vbt.onExtraCallbackWithResult.onWarmupCompleted)) {
            return cypher4Encrypt.MAP;
        }
        if (wie2Var.IAuthTabCallback().onWarmupCompleted()) {
            return cypher4Encrypt.LIST;
        }
        throw setTouchStateListener.onWarmupCompleted(serialDescriptorOnNavigationEvent);
    }

    public static final SerialDescriptor onNavigationEvent(@NotNull SerialDescriptor serialDescriptor, @NotNull hfycx hfycxVar) {
        SerialDescriptor serialDescriptorOnNavigationEvent;
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(hfycxVar, "");
        if (!Intrinsics.areEqual(serialDescriptor.IAuthTabCallback(), vbt.onNavigationEvent.onExtraCallbackWithResult)) {
            return serialDescriptor.onWarmupCompleted() ? onNavigationEvent(serialDescriptor.onNavigationEvent(0), hfycxVar) : serialDescriptor;
        }
        SerialDescriptor serialDescriptorOnNavigationEvent2 = skm.onNavigationEvent(hfycxVar, serialDescriptor);
        return (serialDescriptorOnNavigationEvent2 == null || (serialDescriptorOnNavigationEvent = onNavigationEvent(serialDescriptorOnNavigationEvent2, hfycxVar)) == null) ? serialDescriptor : serialDescriptorOnNavigationEvent;
    }
}
