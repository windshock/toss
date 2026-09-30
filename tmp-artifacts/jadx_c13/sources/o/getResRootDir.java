package o;

import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getResRootDir {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean onNavigationEvent(@NotNull pauseMyRequest<T> pausemyrequest, @NotNull Object obj) {
        Throwable thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(obj);
        return thM32exceptionOrNullimpl == null ? pausemyrequest.IAuthTabCallback((pauseMyRequest<T>) obj) : pausemyrequest.onExtraCallback(thM32exceptionOrNullimpl);
    }

    public static /* synthetic */ pauseMyRequest onExtraCallback(getPackageType getpackagetype, int i, Object obj) {
        if ((i & 1) != 0) {
            getpackagetype = null;
        }
        return IAuthTabCallback(getpackagetype);
    }

    public static final <T> pauseMyRequest<T> IAuthTabCallback(@Nullable getPackageType getpackagetype) {
        return new getChannelVersion(getpackagetype);
    }

    public static final <T> pauseMyRequest<T> IAuthTabCallback(T t) {
        getChannelVersion getchannelversion = new getChannelVersion(null);
        getchannelversion.IAuthTabCallback((getChannelVersion) t);
        return getchannelversion;
    }
}
