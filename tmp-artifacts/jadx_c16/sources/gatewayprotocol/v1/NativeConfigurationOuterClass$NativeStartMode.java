package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public enum NativeConfigurationOuterClass$NativeStartMode implements Internal.EnumLite {
    NATIVE_START_MODE_UNSPECIFIED(0),
    NATIVE_START_MODE_DRY_RUN_ON_SHOW(1),
    NATIVE_START_MODE_DRY_RUN_ON_DISPLAY(2),
    NATIVE_START_MODE_ON_SHOW(3),
    NATIVE_START_MODE_ON_DISPLAY(4),
    UNRECOGNIZED(-1);

    public static final int NATIVE_START_MODE_DRY_RUN_ON_DISPLAY_VALUE = 2;
    public static final int NATIVE_START_MODE_DRY_RUN_ON_SHOW_VALUE = 1;
    public static final int NATIVE_START_MODE_ON_DISPLAY_VALUE = 4;
    public static final int NATIVE_START_MODE_ON_SHOW_VALUE = 3;
    public static final int NATIVE_START_MODE_UNSPECIFIED_VALUE = 0;
    private static final Internal.EnumLiteMap<NativeConfigurationOuterClass$NativeStartMode> internalValueMap = new Internal.EnumLiteMap<NativeConfigurationOuterClass$NativeStartMode>() { // from class: gatewayprotocol.v1.NativeConfigurationOuterClass$NativeStartMode.2
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public NativeConfigurationOuterClass$NativeStartMode findValueByNumber(int i) {
            return NativeConfigurationOuterClass$NativeStartMode.forNumber(i);
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
    public static NativeConfigurationOuterClass$NativeStartMode valueOf(int i) {
        return forNumber(i);
    }

    public static NativeConfigurationOuterClass$NativeStartMode forNumber(int i) {
        if (i == 0) {
            return NATIVE_START_MODE_UNSPECIFIED;
        }
        if (i == 1) {
            return NATIVE_START_MODE_DRY_RUN_ON_SHOW;
        }
        if (i == 2) {
            return NATIVE_START_MODE_DRY_RUN_ON_DISPLAY;
        }
        if (i == 3) {
            return NATIVE_START_MODE_ON_SHOW;
        }
        if (i != 4) {
            return null;
        }
        return NATIVE_START_MODE_ON_DISPLAY;
    }

    public static Internal.EnumLiteMap<NativeConfigurationOuterClass$NativeStartMode> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return onExtraCallbackWithResult.onNavigationEvent;
    }

    NativeConfigurationOuterClass$NativeStartMode(int i) {
        this.value = i;
    }
}
