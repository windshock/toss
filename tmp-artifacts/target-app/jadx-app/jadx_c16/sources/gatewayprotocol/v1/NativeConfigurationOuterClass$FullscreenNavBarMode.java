package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public enum NativeConfigurationOuterClass$FullscreenNavBarMode implements Internal.EnumLite {
    FULLSCREEN_NAV_BAR_MODE_UNSPECIFIED(0),
    FULLSCREEN_NAV_BAR_MODE_TRANSPARENT(1),
    FULLSCREEN_NAV_BAR_MODE_HIDDEN(2),
    UNRECOGNIZED(-1);

    public static final int FULLSCREEN_NAV_BAR_MODE_HIDDEN_VALUE = 2;
    public static final int FULLSCREEN_NAV_BAR_MODE_TRANSPARENT_VALUE = 1;
    public static final int FULLSCREEN_NAV_BAR_MODE_UNSPECIFIED_VALUE = 0;
    private static final Internal.EnumLiteMap<NativeConfigurationOuterClass$FullscreenNavBarMode> internalValueMap = new Internal.EnumLiteMap<NativeConfigurationOuterClass$FullscreenNavBarMode>() { // from class: gatewayprotocol.v1.NativeConfigurationOuterClass$FullscreenNavBarMode.5
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public NativeConfigurationOuterClass$FullscreenNavBarMode findValueByNumber(int i) {
            return NativeConfigurationOuterClass$FullscreenNavBarMode.forNumber(i);
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
    public static NativeConfigurationOuterClass$FullscreenNavBarMode valueOf(int i) {
        return forNumber(i);
    }

    public static NativeConfigurationOuterClass$FullscreenNavBarMode forNumber(int i) {
        if (i == 0) {
            return FULLSCREEN_NAV_BAR_MODE_UNSPECIFIED;
        }
        if (i == 1) {
            return FULLSCREEN_NAV_BAR_MODE_TRANSPARENT;
        }
        if (i != 2) {
            return null;
        }
        return FULLSCREEN_NAV_BAR_MODE_HIDDEN;
    }

    public static Internal.EnumLiteMap<NativeConfigurationOuterClass$FullscreenNavBarMode> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return onExtraCallback.onNavigationEvent;
    }

    NativeConfigurationOuterClass$FullscreenNavBarMode(int i) {
        this.value = i;
    }
}
