package o;

import java.io.InputStream;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setNeedNativeVideoPlayBtnVisible {
    private final setVideoAdInteractionListener onExtraCallback;
    private final createPAGLogoViewByMaterial onNavigationEvent;

    public setNeedNativeVideoPlayBtnVisible(setVideoAdInteractionListener setvideoadinteractionlistener) {
        this(setvideoadinteractionlistener, new readPercent(setvideoadinteractionlistener));
    }

    public setNeedNativeVideoPlayBtnVisible(setVideoAdInteractionListener setvideoadinteractionlistener, createPAGLogoViewByMaterial createpaglogoviewbymaterial) {
        Objects.requireNonNull(setvideoadinteractionlistener, "LoadSettings cannot be null");
        Objects.requireNonNull(createpaglogoviewbymaterial, "BaseConstructor cannot be null");
        this.onExtraCallback = setvideoadinteractionlistener;
        this.onNavigationEvent = createpaglogoviewbymaterial;
    }

    private getDisplayDuration onNavigationEvent(lt12 lt12Var) {
        return new getDisplayDuration(this.onExtraCallback, new uh3(this.onExtraCallback, lt12Var));
    }

    protected getDisplayDuration onWarmupCompleted(InputStream inputStream) {
        return onNavigationEvent(new lt12(this.onExtraCallback, new setVideoCacheUrl(inputStream)));
    }

    protected getDisplayDuration onNavigationEvent(String str) {
        return onNavigationEvent(new lt12(this.onExtraCallback, str));
    }

    protected Object onExtraCallback(getDisplayDuration getdisplayduration) {
        return this.onNavigationEvent.onExtraCallback(getdisplayduration.onWarmupCompleted());
    }

    public Object IAuthTabCallback(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "InputStream cannot be null");
        return onExtraCallback(onWarmupCompleted(inputStream));
    }

    public Object IAuthTabCallback(String str) {
        Objects.requireNonNull(str, "String cannot be null");
        return onExtraCallback(onNavigationEvent(str));
    }
}
