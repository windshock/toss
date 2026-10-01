package im.toss.core.tuba;

import im.toss.core.tuba.VarsResult$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import o.access8100;
import o.encryptType4;
import o.liq;
import o.okycx;
import o.vyl;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class VarsResult {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private JsonObject vars;

    static {
        int i = onWarmupCompleted + 101;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<VarsResult> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            VarsResult$.serializer serializerVar = VarsResult$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public VarsResult() {
        this.vars = new JsonObject(access8100.onNavigationEvent());
    }

    public /* synthetic */ VarsResult(int i, JsonObject jsonObject, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.vars = new JsonObject(access8100.onNavigationEvent());
            int i2 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.vars = jsonObject;
        int i4 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(VarsResult varsResult, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || (!Intrinsics.areEqual(varsResult.vars, new JsonObject(access8100.onNavigationEvent())))) {
            vylVar.onNavigationEvent(serialDescriptor, 0, encryptType4.IAuthTabCallback, varsResult.vars);
            int i2 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 % 4;
            }
        }
        int i4 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final JsonObject onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        JsonObject jsonObject = this.vars;
        int i4 = i3 + 33;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return jsonObject;
    }
}
