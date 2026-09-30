package im.toss.tosssecurities.tracker.v2.model;

import im.toss.tosssecurities.tracker.v2.model.SecuritiesLogV2DeviceContext$;
import im.toss.tosssecurities.tracker.v2.model.SecuritiesLogV2Request$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonObject;
import o.encryptType4;
import o.htf31;
import o.liq;
import o.okycx;
import o.setAnimationDuration;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class SecuritiesLogV2Request {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final JsonArray body;
    private final SecuritiesLogV2DeviceContext deviceContext;
    private final JsonObject nativeOption;

    static {
        int i = onExtraCallback + 51;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecuritiesLogV2Request)) {
            return false;
        }
        SecuritiesLogV2Request securitiesLogV2Request = (SecuritiesLogV2Request) obj;
        if (!Intrinsics.areEqual(this.body, securitiesLogV2Request.body)) {
            int i2 = onNavigationEvent + 29;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.deviceContext, securitiesLogV2Request.deviceContext)) {
            if (Intrinsics.areEqual(this.nativeOption, securitiesLogV2Request.nativeOption)) {
                return true;
            }
            int i3 = IAuthTabCallback + 13;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = IAuthTabCallback + 115;
        int i6 = i5 % 128;
        onNavigationEvent = i6;
        boolean z = !(i5 % 2 != 0);
        int i7 = i6 + 33;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        IAuthTabCallback = i2 % 128;
        return i2 % 2 != 0 ? (((this.body.hashCode() - 2) << this.deviceContext.hashCode()) >>> 60) * this.nativeOption.hashCode() : (((this.body.hashCode() * 31) + this.deviceContext.hashCode()) * 31) + this.nativeOption.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SecuritiesLogV2Request(body=" + this.body + ", deviceContext=" + this.deviceContext + ", nativeOption=" + this.nativeOption + ")";
        int i2 = onNavigationEvent + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SecuritiesLogV2Request> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            SecuritiesLogV2Request$.serializer serializerVar = SecuritiesLogV2Request$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ SecuritiesLogV2Request(int i, JsonArray jsonArray, SecuritiesLogV2DeviceContext securitiesLogV2DeviceContext, JsonObject jsonObject, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = onNavigationEvent + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, SecuritiesLogV2Request$.serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallback + 19;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.body = jsonArray;
        this.deviceContext = securitiesLogV2DeviceContext;
        this.nativeOption = jsonObject;
    }

    public SecuritiesLogV2Request(@NotNull JsonArray jsonArray, @NotNull SecuritiesLogV2DeviceContext securitiesLogV2DeviceContext, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonArray, "");
        Intrinsics.checkNotNullParameter(securitiesLogV2DeviceContext, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.body = jsonArray;
        this.deviceContext = securitiesLogV2DeviceContext;
        this.nativeOption = jsonObject;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(SecuritiesLogV2Request securitiesLogV2Request, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            vylVar.onNavigationEvent(serialDescriptor, 0, setAnimationDuration.onExtraCallback, securitiesLogV2Request.body);
            vylVar.onNavigationEvent(serialDescriptor, 1, SecuritiesLogV2DeviceContext$.serializer.INSTANCE, securitiesLogV2Request.deviceContext);
            vylVar.onNavigationEvent(serialDescriptor, 3, encryptType4.IAuthTabCallback, securitiesLogV2Request.nativeOption);
        } else {
            vylVar.onNavigationEvent(serialDescriptor, 0, setAnimationDuration.onExtraCallback, securitiesLogV2Request.body);
            vylVar.onNavigationEvent(serialDescriptor, 1, SecuritiesLogV2DeviceContext$.serializer.INSTANCE, securitiesLogV2Request.deviceContext);
            vylVar.onNavigationEvent(serialDescriptor, 2, encryptType4.IAuthTabCallback, securitiesLogV2Request.nativeOption);
        }
        int i3 = IAuthTabCallback + 7;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 31 / 0;
        }
    }
}
