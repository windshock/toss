package o;

import o.QuirkSettingsLoader;
import o.r8lambda46ZJUl_sf7wRt5ATtHUSPTmGwk;
import o.w6a;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda3ItRKs506ZA10acMn5vNx6LxE {
    public static final r8lambda3ItRKs506ZA10acMn5vNx6LxE IAuthTabCallback = new r8lambda3ItRKs506ZA10acMn5vNx6LxE();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public interface onExtraCallback {
        int IAuthTabCallback(@NotNull ExtensionsInfoExternalSyntheticLambda1 extensionsInfoExternalSyntheticLambda1, long j, int i, @NotNull ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability);
    }

    public interface onExtraCallbackWithResult {
        int onWarmupCompleted(@NotNull ExtensionsInfoExternalSyntheticLambda1 extensionsInfoExternalSyntheticLambda1, long j, int i);
    }

    static {
        int i = onNavigationEvent + 23;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private r8lambda3ItRKs506ZA10acMn5vNx6LxE() {
    }

    public final onExtraCallback IAuthTabCallbackDefault(int i) {
        int i2 = 2 % 2;
        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
        w6a.onNavigationEvent onnavigationevent = new w6a.onNavigationEvent(onextracallbackwithresult.IAuthTabCallbackStubProxy(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), i);
        int i3 = onExtraCallbackWithResult + 69;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return onnavigationevent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final onExtraCallback onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
        w6a.onNavigationEvent onnavigationevent = new w6a.onNavigationEvent(onextracallbackwithresult.asBinder(), onextracallbackwithresult.asBinder(), i);
        int i3 = onExtraCallback + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return onnavigationevent;
    }

    public final onExtraCallback onExtraCallback(int i) {
        int i2 = 2 % 2;
        r8lambda46ZJUl_sf7wRt5ATtHUSPTmGwk.onExtraCallbackWithResult onextracallbackwithresult = new r8lambda46ZJUl_sf7wRt5ATtHUSPTmGwk.onExtraCallbackWithResult(observe.onExtraCallbackWithResult.onExtraCallback(), i);
        int i3 = onExtraCallbackWithResult + 105;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return onextracallbackwithresult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final onExtraCallback onTransact(int i) {
        int i2 = 2 % 2;
        r8lambda46ZJUl_sf7wRt5ATtHUSPTmGwk.onExtraCallbackWithResult onextracallbackwithresult = new r8lambda46ZJUl_sf7wRt5ATtHUSPTmGwk.onExtraCallbackWithResult(observe.onExtraCallbackWithResult.onExtraCallbackWithResult(), i);
        int i3 = onExtraCallback + 35;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 54 / 0;
        }
        return onextracallbackwithresult;
    }

    public final onExtraCallbackWithResult asInterface(int i) {
        int i2 = 2 % 2;
        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
        w6a.onExtraCallback onextracallback = new w6a.onExtraCallback(onextracallbackwithresult.access000(), onextracallbackwithresult.onExtraCallbackWithResult(), i);
        int i3 = onExtraCallbackWithResult + 69;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 / 0;
        }
        return onextracallback;
    }

    public final onExtraCallbackWithResult IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
        w6a.onExtraCallback onextracallback = new w6a.onExtraCallback(onextracallbackwithresult.onExtraCallbackWithResult(), onextracallbackwithresult.access000(), i);
        int i3 = onExtraCallbackWithResult + 43;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return onextracallback;
    }

    public final onExtraCallbackWithResult onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
        w6a.onExtraCallback onextracallback = new w6a.onExtraCallback(onextracallbackwithresult.IAuthTabCallbackDefault(), onextracallbackwithresult.access000(), i);
        int i3 = onExtraCallbackWithResult + 89;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return onextracallback;
    }

    public final onExtraCallbackWithResult asBinder(int i) {
        int i2 = 2 % 2;
        r8lambda46ZJUl_sf7wRt5ATtHUSPTmGwk.onExtraCallback onextracallback = new r8lambda46ZJUl_sf7wRt5ATtHUSPTmGwk.onExtraCallback(QuirkSettingsLoader.Companion.access000(), i);
        int i3 = onExtraCallback + 5;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return onextracallback;
        }
        throw null;
    }

    public final onExtraCallbackWithResult onNavigationEvent(int i) {
        int i2 = 2 % 2;
        r8lambda46ZJUl_sf7wRt5ATtHUSPTmGwk.onExtraCallback onextracallback = new r8lambda46ZJUl_sf7wRt5ATtHUSPTmGwk.onExtraCallback(QuirkSettingsLoader.Companion.onExtraCallbackWithResult(), i);
        int i3 = onExtraCallbackWithResult + 23;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return onextracallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
