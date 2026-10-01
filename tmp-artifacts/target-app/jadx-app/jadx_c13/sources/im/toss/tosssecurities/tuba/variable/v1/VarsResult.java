package im.toss.tosssecurities.tuba.variable.v1;

import im.toss.tosssecurities.tuba.variable.v1.VarsResult$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import o.access8000;
import o.encryptType4;
import o.liq;
import o.okycx;
import o.vyl;
import org.opencv.imgproc.Imgproc;

@liq
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class VarsResult {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private JsonObject vars;

    static {
        int i = onExtraCallback + 85;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 32 / 0;
        }
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<VarsResult> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            VarsResult$.serializer serializerVar = VarsResult$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 101;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public VarsResult() {
        this.vars = new JsonObject(access8000.IAuthTabCallback());
    }

    public /* synthetic */ VarsResult(int i, JsonObject jsonObject, okycx okycxVar) {
        if ((i & 1) != 0) {
            this.vars = jsonObject;
            int i2 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 76 / 0;
                return;
            }
            return;
        }
        this.vars = new JsonObject(access8000.IAuthTabCallback());
        int i4 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(VarsResult varsResult, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(varsResult.vars, new JsonObject(access8000.IAuthTabCallback()))) {
            vylVar.onNavigationEvent(serialDescriptor, 0, encryptType4.IAuthTabCallback, varsResult.vars);
            int i4 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 2;
            }
        }
    }

    public final JsonObject onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        JsonObject jsonObject = this.vars;
        int i5 = i3 + 21;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return jsonObject;
        }
        throw null;
    }
}
