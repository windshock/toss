package o;

import java.io.InputStream;
import java.io.Reader;
import java.util.Iterator;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class sya16 {
    private final setVideoAdInteractionListener onExtraCallbackWithResult;

    public static /* synthetic */ Iterator IAuthTabCallback(sya16 sya16Var, InputStream inputStream) {
        setVideoAdInteractionListener setvideoadinteractionlistener = sya16Var.onExtraCallbackWithResult;
        return new uh3(setvideoadinteractionlistener, new lt12(setvideoadinteractionlistener, new setVideoCacheUrl(inputStream)));
    }

    public static /* synthetic */ Iterator onExtraCallback(sya16 sya16Var, Reader reader) {
        setVideoAdInteractionListener setvideoadinteractionlistener = sya16Var.onExtraCallbackWithResult;
        return new uh3(setvideoadinteractionlistener, new lt12(setvideoadinteractionlistener, reader));
    }
}
