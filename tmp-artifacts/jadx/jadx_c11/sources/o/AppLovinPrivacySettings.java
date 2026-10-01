package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import o.hasProvider;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinPrivacySettings {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static final Map<String, Function0<Unit>> onWarmupCompleted = new LinkedHashMap();
    private static final Map<String, getAdditionalConsentStatus> onExtraCallbackWithResult = new LinkedHashMap();

    public static final void IAuthTabCallback(@NotNull hasProvider hasprovider) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        Iterator it = hasprovider.IAuthTabCallback("tds:clickable", 0, hasprovider.length()).iterator();
        while (it.hasNext()) {
            int i4 = IAuthTabCallback + 125;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                hasProvider.onExtraCallbackWithResult onextracallbackwithresult = (hasProvider.onExtraCallbackWithResult) it.next();
                Map<String, Function0<Unit>> map = onWarmupCompleted;
                TypeIntrinsics.asMutableMap(map).remove(onWarmupCompleted((String) onextracallbackwithresult.onExtraCallback()));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            hasProvider.onExtraCallbackWithResult onextracallbackwithresult2 = (hasProvider.onExtraCallbackWithResult) it.next();
            Map<String, Function0<Unit>> map2 = onWarmupCompleted;
            TypeIntrinsics.asMutableMap(map2).remove(onWarmupCompleted((String) onextracallbackwithresult2.onExtraCallback()));
        }
    }

    public static final Function0<Unit> IAuthTabCallback(@NotNull hasProvider.onExtraCallbackWithResult<String> onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Function0<Unit> function0 = onWarmupCompleted.get(onWarmupCompleted((String) onextracallbackwithresult.onExtraCallback()));
        int i4 = IAuthTabCallbackStub + 63;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return function0;
    }

    public static final getAdditionalConsentStatus onWarmupCompleted(@NotNull hasProvider.onExtraCallbackWithResult<String> onextracallbackwithresult) {
        getAdditionalConsentStatus getadditionalconsentstatus;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            getadditionalconsentstatus = onExtraCallbackWithResult.get(onextracallbackwithresult.onExtraCallback());
            int i3 = 13 / 0;
        } else {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            getadditionalconsentstatus = onExtraCallbackWithResult.get(onextracallbackwithresult.onExtraCallback());
        }
        int i4 = IAuthTabCallbackStub + 55;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return getadditionalconsentstatus;
        }
        throw null;
    }

    private static final String onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (StringsKt.contains$default(str, "&t@d;s&", false, 2, (Object) null)) {
            return (String) StringsKt.split$default(str, new String[]{"&t@d;s&"}, false, 0, 6, (Object) null).get(0);
        }
        int i4 = IAuthTabCallback + 95;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = onNavigationEvent + 105;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 8 / 0;
        }
    }

    public static final Map<String, Function0<Unit>> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 63;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Function0<Unit>> map = onWarmupCompleted;
        int i5 = i2 + 45;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public static final Map<String, getAdditionalConsentStatus> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
