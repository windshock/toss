package im.toss.tosssecurities.tuba.variable.v2.impl;

import im.toss.components.tuba.variable.v2.spec.VarsResult;
import im.toss.tosssecurities.network.data.SecuritiesBaseApiResponse;
import im.toss.tosssecurities.tuba.variable.v2.impl.TubaVariableService$RequestParams$;
import java.util.Arrays;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.ReferenceArraySerializer;
import o.access13800;
import o.getIv8;
import o.getUserCertList;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.setCollectAndroidID;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface TubaVariableService {
    @getIv8(onExtraCallback = "/api/v1/tuba/members/independent-variables")
    Object IAuthTabCallback(@getUserCertList @NotNull RequestParams requestParams, @NotNull access13800<? super SecuritiesBaseApiResponse<VarsResult>> access13800Var);

    @setCollectAndroidID
    @getIv8(onExtraCallback = "/api/v1/tuba/guests/independent-variables")
    Object onWarmupCompleted(@getUserCertList @NotNull RequestParams requestParams, @NotNull access13800<? super SecuritiesBaseApiResponse<VarsResult>> access13800Var);

    @liq
    public static final class RequestParams {
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onWarmupCompleted;
        private final String[] keys;

        static {
            int i = onExtraCallback + 23;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 97;
                onWarmupCompleted = i2 % 128;
                return i2 % 2 == 0;
            }
            if (obj instanceof RequestParams) {
                return Intrinsics.areEqual(this.keys, ((RequestParams) obj).keys);
            }
            int i3 = onWarmupCompleted + 119;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Arrays.hashCode(this.keys);
            int i4 = IAuthTabCallback + 55;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "RequestParams(keys=" + Arrays.toString(this.keys) + ")";
            int i2 = IAuthTabCallback + 25;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<RequestParams> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 109;
                onExtraCallbackWithResult = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    TubaVariableService$RequestParams$.serializer serializerVar = TubaVariableService$RequestParams$.serializer.INSTANCE;
                    throw null;
                }
                TubaVariableService$RequestParams$.serializer serializerVar2 = TubaVariableService$RequestParams$.serializer.INSTANCE;
                int i3 = onExtraCallback + 97;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return serializerVar2;
                }
                obj.hashCode();
                throw null;
            }
        }

        public /* synthetic */ RequestParams(int i, String[] strArr, okycx okycxVar) {
            if (1 != (i & 1)) {
                int i2 = IAuthTabCallback + 5;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 1, TubaVariableService$RequestParams$.serializer.INSTANCE.getDescriptor());
                int i4 = IAuthTabCallback + 17;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 % 2;
                } else {
                    int i6 = 2 % 2;
                }
            }
            this.keys = strArr;
        }

        public RequestParams(@NotNull String[] strArr) {
            Intrinsics.checkNotNullParameter(strArr, "");
            this.keys = strArr;
        }

        @JvmStatic
        public static final /* synthetic */ void onWarmupCompleted(RequestParams requestParams, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            vylVar.onNavigationEvent(serialDescriptor, 0, new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), getWriggleLayout.onNavigationEvent), requestParams.keys);
            int i2 = onWarmupCompleted + 15;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }
}
