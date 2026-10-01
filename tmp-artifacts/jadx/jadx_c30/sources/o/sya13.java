package o;

import java.io.InputStream;
import java.io.Reader;
import java.util.Iterator;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class sya13 {
    private final setVideoAdInteractionListener onExtraCallbackWithResult;

    public static /* synthetic */ Iterator onExtraCallback(sya13 sya13Var, Reader reader) {
        setVideoAdInteractionListener setvideoadinteractionlistener = sya13Var.onExtraCallbackWithResult;
        return new getDisplayDuration(setvideoadinteractionlistener, new uh3(setvideoadinteractionlistener, new lt12(setvideoadinteractionlistener, reader)));
    }

    public static /* synthetic */ Iterator onExtraCallbackWithResult(sya13 sya13Var, InputStream inputStream) {
        setVideoAdInteractionListener setvideoadinteractionlistener = sya13Var.onExtraCallbackWithResult;
        return new getDisplayDuration(setvideoadinteractionlistener, new uh3(setvideoadinteractionlistener, new lt12(setvideoadinteractionlistener, new setVideoCacheUrl(inputStream))));
    }
}
