package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public enum NativeConfigurationOuterClass$ShowCompletionState implements Internal.EnumLite {
    SHOW_COMPLETION_STATE_UNSPECIFIED(0),
    SHOW_COMPLETION_STATE_SKIPPED(1),
    SHOW_COMPLETION_STATE_COMPLETED(2),
    UNRECOGNIZED(-1);

    public static final int SHOW_COMPLETION_STATE_COMPLETED_VALUE = 2;
    public static final int SHOW_COMPLETION_STATE_SKIPPED_VALUE = 1;
    public static final int SHOW_COMPLETION_STATE_UNSPECIFIED_VALUE = 0;
    private static final Internal.EnumLiteMap<NativeConfigurationOuterClass$ShowCompletionState> internalValueMap = new Internal.EnumLiteMap<NativeConfigurationOuterClass$ShowCompletionState>() { // from class: gatewayprotocol.v1.NativeConfigurationOuterClass$ShowCompletionState.2
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public NativeConfigurationOuterClass$ShowCompletionState findValueByNumber(int i) {
            return NativeConfigurationOuterClass$ShowCompletionState.forNumber(i);
        }
    };
    private final int value;

    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static NativeConfigurationOuterClass$ShowCompletionState valueOf(int i) {
        return forNumber(i);
    }

    public static NativeConfigurationOuterClass$ShowCompletionState forNumber(int i) {
        if (i == 0) {
            return SHOW_COMPLETION_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return SHOW_COMPLETION_STATE_SKIPPED;
        }
        if (i != 2) {
            return null;
        }
        return SHOW_COMPLETION_STATE_COMPLETED;
    }

    public static Internal.EnumLiteMap<NativeConfigurationOuterClass$ShowCompletionState> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return onExtraCallbackWithResult.onWarmupCompleted;
    }

    NativeConfigurationOuterClass$ShowCompletionState(int i) {
        this.value = i;
    }
}
