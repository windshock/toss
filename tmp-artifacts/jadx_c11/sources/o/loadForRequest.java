package o;

import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import im.toss.tds.graphics.gl.blur.RenderCommand;
import im.toss.tds.graphics.gl.framebuffer.FramebufferPool$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class loadForRequest {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final Map<CookieJar, dateCharacterOffset<parseokhttp>> IAuthTabCallback = new LinkedHashMap();

    public static /* synthetic */ Unit IAuthTabCallback(parseokhttp parseokhttpVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(parseokhttpVar);
        int i4 = onWarmupCompleted + 107;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(parseokhttp parseokhttpVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(parseokhttpVar);
        int i4 = onExtraCallback + 103;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return unitOnExtraCallback;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        Iterator<T> it = this.IAuthTabCallback.values().iterator();
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = onWarmupCompleted + 87;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                ((dateCharacterOffset) it.next()).onExtraCallbackWithResult();
                int i5 = 56 / 0;
            } else {
                ((dateCharacterOffset) it.next()).onExtraCallbackWithResult();
            }
        }
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Iterator<T> it = this.IAuthTabCallback.values().iterator();
            while (it.hasNext()) {
                ((dateCharacterOffset) it.next()).onWarmupCompleted(new FramebufferPool$.ExternalSyntheticLambda1());
                int i3 = onWarmupCompleted + 3;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 4 % 3;
                }
            }
            return;
        }
        this.IAuthTabCallback.values().iterator();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(parseokhttp parseokhttpVar) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(parseokhttpVar, "");
        parseokhttp.onWarmupCompleted(parseokhttpVar, null, false, 1, null);
        Object[] objArr = {RenderCommand.IAuthTabCallback, setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault())};
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        RenderCommand.IAuthTabCallback(PushInfo.Companion.onExtraCallback(), -1914265135, PushInfo.Companion.onExtraCallback(), 1914265135, PushInfo.Companion.onExtraCallback(), iOnExtraCallback, objArr);
        parseokhttpVar.asBinder();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(parseokhttp parseokhttpVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(parseokhttpVar, "");
        parseokhttpVar.onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 5;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Iterator<T> it = this.IAuthTabCallback.values().iterator();
            while (it.hasNext()) {
                ((dateCharacterOffset) it.next()).onWarmupCompleted(new FramebufferPool$.ExternalSyntheticLambda0());
                int i3 = onWarmupCompleted + 53;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            this.IAuthTabCallback.clear();
            int i5 = onWarmupCompleted + 117;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 70 / 0;
                return;
            }
            return;
        }
        this.IAuthTabCallback.values().iterator();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final parseokhttp onExtraCallback(@NotNull CookieJar cookieJar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(cookieJar, "");
        Map<CookieJar, dateCharacterOffset<parseokhttp>> map = this.IAuthTabCallback;
        dateCharacterOffset<parseokhttp> datecharacteroffset = map.get(cookieJar);
        if (datecharacteroffset == null) {
            datecharacteroffset = new dateCharacterOffset<>();
            map.put(cookieJar, datecharacteroffset);
            int i4 = onWarmupCompleted + 77;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        dateCharacterOffset<parseokhttp> datecharacteroffset2 = datecharacteroffset;
        if (datecharacteroffset2.onWarmupCompleted() >= datecharacteroffset2.onNavigationEvent().size()) {
            datecharacteroffset2.onNavigationEvent().add(parseokhttp.Companion.onExtraCallbackWithResult(cookieJar));
        }
        ArrayList<parseokhttp> arrayListOnNavigationEvent = datecharacteroffset2.onNavigationEvent();
        int iOnWarmupCompleted = datecharacteroffset2.onWarmupCompleted();
        datecharacteroffset2.onExtraCallbackWithResult(iOnWarmupCompleted + 1);
        return arrayListOnNavigationEvent.get(iOnWarmupCompleted);
    }
}
