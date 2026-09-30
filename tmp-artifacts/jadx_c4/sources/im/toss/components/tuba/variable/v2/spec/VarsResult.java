package im.toss.components.tuba.variable.v2.spec;

import im.toss.components.tuba.variable.v2.spec.VarsResult$;
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
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final JsonObject vars;

    static {
        int i = onExtraCallback + 89;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<VarsResult> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            VarsResult$.serializer serializerVar = VarsResult$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public VarsResult() {
        this.vars = new JsonObject(access8100.onNavigationEvent());
    }

    public /* synthetic */ VarsResult(int i, JsonObject jsonObject, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.vars = new JsonObject(access8100.onNavigationEvent());
            int i2 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.vars = jsonObject;
        int i4 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(VarsResult varsResult, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(varsResult.vars, new JsonObject(access8100.onNavigationEvent()))) {
            vylVar.onNavigationEvent(serialDescriptor, 0, encryptType4.IAuthTabCallback, varsResult.vars);
        }
        int i4 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final JsonObject onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 105;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        JsonObject jsonObject = this.vars;
        int i5 = i2 + 125;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return jsonObject;
        }
        throw null;
    }
}
