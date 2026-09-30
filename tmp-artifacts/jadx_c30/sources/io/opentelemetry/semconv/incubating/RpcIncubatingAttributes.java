package io.opentelemetry.semconv.incubating;

import java.util.List;
import o.getLocationStatus;
import o.readBase64;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RpcIncubatingAttributes {

    @Deprecated
    public static final getLocationStatus<String> IAuthTabCallback = getLocationStatus.IAuthTabCallbackDefault("rpc.connect_rpc.error_code");

    @Deprecated
    public static final readBase64<List<String>> onNavigationEvent = readBase64.onExtraCallbackWithResult("rpc.connect_rpc.request.metadata");

    @Deprecated
    public static final readBase64<List<String>> onExtraCallback = readBase64.onExtraCallbackWithResult("rpc.connect_rpc.response.metadata");

    @Deprecated
    public static final readBase64<List<String>> onExtraCallbackWithResult = readBase64.onExtraCallbackWithResult("rpc.grpc.request.metadata");

    @Deprecated
    public static final readBase64<List<String>> onWarmupCompleted = readBase64.onExtraCallbackWithResult("rpc.grpc.response.metadata");

    @Deprecated
    public static final getLocationStatus<Long> asInterface = getLocationStatus.asInterface("rpc.grpc.status_code");

    @Deprecated
    public static final getLocationStatus<Long> IAuthTabCallbackStub = getLocationStatus.asInterface("rpc.jsonrpc.error_code");

    @Deprecated
    public static final getLocationStatus<String> IAuthTabCallbackDefault = getLocationStatus.IAuthTabCallbackDefault("rpc.jsonrpc.error_message");

    @Deprecated
    public static final getLocationStatus<String> onTransact = getLocationStatus.IAuthTabCallbackDefault("rpc.jsonrpc.request_id");

    @Deprecated
    public static final getLocationStatus<String> asBinder = getLocationStatus.IAuthTabCallbackDefault("rpc.jsonrpc.version");

    @Deprecated
    public static final getLocationStatus<Long> IAuthTabCallback_Parcel = getLocationStatus.asInterface("rpc.message.compressed_size");

    @Deprecated
    public static final getLocationStatus<Long> getInterfaceDescriptor = getLocationStatus.asInterface("rpc.message.id");

    @Deprecated
    public static final getLocationStatus<String> IAuthTabCallbackStubProxy = getLocationStatus.IAuthTabCallbackDefault("rpc.message.type");

    @Deprecated
    public static final getLocationStatus<Long> access000 = getLocationStatus.asInterface("rpc.message.uncompressed_size");
    public static final getLocationStatus<String> access100 = getLocationStatus.IAuthTabCallbackDefault("rpc.method");
    public static final getLocationStatus<String> ICustomTabsCallback = getLocationStatus.IAuthTabCallbackDefault("rpc.method_original");
    public static final readBase64<List<String>> extraCallbackWithResult = readBase64.onExtraCallbackWithResult("rpc.request.metadata");
    public static final readBase64<List<String>> readTypedObject = readBase64.onExtraCallbackWithResult("rpc.response.metadata");
    public static final getLocationStatus<String> extraCallback = getLocationStatus.IAuthTabCallbackDefault("rpc.response.status_code");

    @Deprecated
    public static final getLocationStatus<String> writeTypedObject = getLocationStatus.IAuthTabCallbackDefault("rpc.service");

    @Deprecated
    public static final getLocationStatus<String> onActivityLayout = getLocationStatus.IAuthTabCallbackDefault("rpc.system");
    public static final getLocationStatus<String> onMinimized = getLocationStatus.IAuthTabCallbackDefault("rpc.system.name");

    @Deprecated
    public static final class RpcConnectRpcErrorCodeIncubatingValues {
        private RpcConnectRpcErrorCodeIncubatingValues() {
        }
    }

    @Deprecated
    public static final class RpcGrpcStatusCodeIncubatingValues {
        private RpcGrpcStatusCodeIncubatingValues() {
        }
    }

    @Deprecated
    public static final class RpcMessageTypeIncubatingValues {
        private RpcMessageTypeIncubatingValues() {
        }
    }

    @Deprecated
    public static final class RpcSystemIncubatingValues {
        private RpcSystemIncubatingValues() {
        }
    }

    public static final class RpcSystemNameIncubatingValues {
        private RpcSystemNameIncubatingValues() {
        }
    }

    private RpcIncubatingAttributes() {
    }
}
