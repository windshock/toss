package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setChannelIndex {
    private static final djExternalSyntheticApiModelOutline0 onNavigationEvent = new djExternalSyntheticApiModelOutline0("COMPLETING_ALREADY");
    public static final djExternalSyntheticApiModelOutline0 onExtraCallback = new djExternalSyntheticApiModelOutline0("COMPLETING_WAITING_CHILDREN");
    private static final djExternalSyntheticApiModelOutline0 IAuthTabCallback = new djExternalSyntheticApiModelOutline0("COMPLETING_RETRY");
    private static final djExternalSyntheticApiModelOutline0 onTransact = new djExternalSyntheticApiModelOutline0("TOO_LATE_TO_CANCEL");
    private static final djExternalSyntheticApiModelOutline0 IAuthTabCallbackDefault = new djExternalSyntheticApiModelOutline0("SEALED");
    private static final CheckRequestBodyModelChannel onWarmupCompleted = new CheckRequestBodyModelChannel(false);
    private static final CheckRequestBodyModelChannel onExtraCallbackWithResult = new CheckRequestBodyModelChannel(true);

    public static final Object onNavigationEvent(@Nullable Object obj) {
        return obj instanceof UpdatePackage ? new isInvalidName((UpdatePackage) obj) : obj;
    }

    public static final Object IAuthTabCallback(@Nullable Object obj) {
        UpdatePackage updatePackage;
        isInvalidName isinvalidname = obj instanceof isInvalidName ? (isInvalidName) obj : null;
        return (isinvalidname == null || (updatePackage = isinvalidname.onWarmupCompleted) == null) ? obj : updatePackage;
    }
}
