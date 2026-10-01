package o;

import im.toss.websocket.network.model.TossWebSocketMessageDto;
import im.toss.websocket.network.model.TossWebSocketMessageMetaDto;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import o.BugsnagEventMapper;
import o.convertErrorbugsnag_android_core_release;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setUser {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final wie2 onWarmupCompleted = EndMotionInteraction.onExtraCallback();

    public final <T> BugsnagEventMapper<T> onNavigationEvent(@NotNull KSerializer<T> kSerializer, @NotNull convertErrorbugsnag_android_core_release converterrorbugsnag_android_core_release) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(kSerializer, "");
        Intrinsics.checkNotNullParameter(converterrorbugsnag_android_core_release, "");
        if (Intrinsics.areEqual(converterrorbugsnag_android_core_release, convertErrorbugsnag_android_core_release.onExtraCallbackWithResult.IAuthTabCallback)) {
            return new BugsnagEventMapper.onExtraCallback();
        }
        if (converterrorbugsnag_android_core_release instanceof convertErrorbugsnag_android_core_release.onExtraCallback) {
            return new BugsnagEventMapper.onWarmupCompleted(((convertErrorbugsnag_android_core_release.onExtraCallback) converterrorbugsnag_android_core_release).onExtraCallback());
        }
        Object obj = null;
        if (converterrorbugsnag_android_core_release instanceof convertErrorbugsnag_android_core_release.onNavigationEvent) {
            BugsnagEventMapper.onExtraCallbackWithResult onextracallbackwithresult = new BugsnagEventMapper.onExtraCallbackWithResult(((convertErrorbugsnag_android_core_release.onNavigationEvent) converterrorbugsnag_android_core_release).onExtraCallbackWithResult());
            int i4 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }
        if (!(converterrorbugsnag_android_core_release instanceof convertErrorbugsnag_android_core_release.IAuthTabCallback)) {
            throw new NoWhenBranchMatchedException();
        }
        BugsnagEventMapper.onNavigationEvent onnavigationevent = new BugsnagEventMapper.onNavigationEvent(onExtraCallback(kSerializer, ((convertErrorbugsnag_android_core_release.IAuthTabCallback) converterrorbugsnag_android_core_release).onWarmupCompleted()));
        int i5 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return onnavigationevent;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> parseUnsignedLong<T> onExtraCallback(@NotNull KSerializer<T> kSerializer, @NotNull TossWebSocketMessageDto tossWebSocketMessageDto) {
        int i = 2 % 2;
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        Intrinsics.checkNotNullParameter(kSerializer, "");
        Intrinsics.checkNotNullParameter(tossWebSocketMessageDto, "");
        convertBreadcrumbInternalbugsnag_android_core_release convertbreadcrumbinternalbugsnag_android_core_releaseOnNavigationEvent = onNavigationEvent(tossWebSocketMessageDto.onNavigationEvent());
        String strOnExtraCallbackWithResult = tossWebSocketMessageDto.onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult == null) {
            strOnExtraCallbackWithResult = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        String strOnWarmupCompleted = tossWebSocketMessageDto.onWarmupCompleted();
        if (strOnWarmupCompleted != null) {
            int i2 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            str = strOnWarmupCompleted;
        }
        wie2 wie2Var = this.onWarmupCompleted;
        parseUnsignedLong<T> parseunsignedlong = new parseUnsignedLong<>(convertbreadcrumbinternalbugsnag_android_core_releaseOnNavigationEvent, strOnExtraCallbackWithResult, str, wie2Var.onExtraCallback(kSerializer, wie2Var.onWarmupCompleted(sp.IAuthTabCallback(nzi.onNavigationEvent(wie2Var.onExtraCallback(), Reflection.getOrCreateKotlinClass(Object.class))), tossWebSocketMessageDto.IAuthTabCallback())));
        int i4 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return parseunsignedlong;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final convertBreadcrumbInternalbugsnag_android_core_release onNavigationEvent(TossWebSocketMessageMetaDto tossWebSocketMessageMetaDto) {
        String strOnNavigationEvent;
        boolean zBooleanValue;
        String strIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        if (tossWebSocketMessageMetaDto != null) {
            int i5 = i3 + 45;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            strOnNavigationEvent = tossWebSocketMessageMetaDto.onNavigationEvent();
            if (strOnNavigationEvent == null) {
                strOnNavigationEvent = _UrlKt.FRAGMENT_ENCODE_SET;
            }
        }
        if (tossWebSocketMessageMetaDto != null && (strIAuthTabCallback = tossWebSocketMessageMetaDto.IAuthTabCallback()) != null) {
            str = strIAuthTabCallback;
        }
        if (tossWebSocketMessageMetaDto != null) {
            int i7 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            Boolean boolOnExtraCallbackWithResult = tossWebSocketMessageMetaDto.onExtraCallbackWithResult();
            zBooleanValue = boolOnExtraCallbackWithResult != null ? boolOnExtraCallbackWithResult.booleanValue() : false;
        }
        return new convertBreadcrumbInternalbugsnag_android_core_release(strOnNavigationEvent, str, zBooleanValue);
    }
}
