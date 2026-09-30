package im.toss.ads_sdk.remote.api;

import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeLogger;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ApiResponse$$serializer<T> implements aeu2<ApiResponse<T>> {
    public static final int $stable = 8;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 37 % 128;
    private static int onWarmupCompleted;
    private final SerialDescriptor descriptor;
    private final /* synthetic */ KSerializer<?> typeSerial0;

    static {
        if (37 % 2 == 0) {
            throw null;
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = this.descriptor;
        int i4 = i3 + 97;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    private ApiResponse$$serializer() {
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.api.ApiResponse", this, 3);
        setanimationsloop.onWarmupCompleted("resultType", true);
        setanimationsloop.onWarmupCompleted("success", true);
        setanimationsloop.onWarmupCompleted(ApiDowngradeLogger.EXT_KEY_ERROR_CODE, true);
        this.descriptor = setanimationsloop;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ApiResponse$$serializer(@NotNull KSerializer<T> kSerializer) {
        this();
        Intrinsics.checkNotNullParameter(kSerializer, "");
        this.typeSerial0 = kSerializer;
    }

    private final /* synthetic */ KSerializer getTypeSerial0() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        KSerializer<?> kSerializer = this.typeSerial0;
        int i5 = i2 + 53;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return kSerializer;
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(this.typeSerial0), sp.IAuthTabCallback(ApiServerError$$serializer.INSTANCE)};
        int i4 = onExtraCallback + 125;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ApiResponse<T> deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        Object obj;
        ApiServerError apiServerError;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 65;
        IAuthTabCallback = i3 % 128;
        Object objOnExtraCallbackWithResult = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(this.descriptor).extraCallbackWithResult();
            objOnExtraCallbackWithResult.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = this.descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            Object objOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, this.typeSerial0, (Object) null);
            str = strAsInterface;
            apiServerError = (ApiServerError) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ApiServerError$$serializer.INSTANCE, (Object) null);
            obj = objOnExtraCallbackWithResult2;
            i = 7;
        } else {
            int i4 = onExtraCallback + 125;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            String strAsInterface2 = null;
            ApiServerError apiServerError2 = null;
            int i6 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i6 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    objOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, this.typeSerial0, objOnExtraCallbackWithResult);
                    i6 |= 2;
                    int i7 = onExtraCallback + 65;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    apiServerError2 = (ApiServerError) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ApiServerError$$serializer.INSTANCE, apiServerError2);
                    i6 |= 4;
                }
            }
            str = strAsInterface2;
            obj = objOnExtraCallbackWithResult;
            apiServerError = apiServerError2;
            i = i6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        ApiResponse<T> apiResponse = new ApiResponse<>(i, str, obj, apiServerError, (okycx) null);
        int i9 = IAuthTabCallback + 47;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        return apiResponse;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m34deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        ApiResponse<T> apiResponseDeserialize = deserialize(decoder);
        int i3 = onExtraCallback + 75;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 23 / 0;
        }
        return apiResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ApiResponse<T> apiResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(apiResponse, "");
        SerialDescriptor serialDescriptor = this.descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ApiResponse.onNavigationEvent(apiResponse, vylVarOnExtraCallback, serialDescriptor, this.typeSerial0);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ApiResponse) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallback = i2 % 128;
        return i2 % 2 == 0 ? new KSerializer[]{this.typeSerial0} : new KSerializer[]{this.typeSerial0};
    }
}
