package o;

import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import im.toss.securities.core.router.spec.TossSecRoute;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import o.getPrivacyPolicyUri;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getPrivacyPolicyUri implements getDebugUserGeography {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int access100 = 1;
    private static char[] asInterface = {64978, 64963, 64981, 64980};
    private static char asBinder = 51243;
    private final Map<String, String> onExtraCallback = new LinkedHashMap();
    private final LinkedList<onExtraCallbackWithResult> onWarmupCompleted = new LinkedList<>();
    private final Set<String> IAuthTabCallback = new LinkedHashSet();
    private volatile Map<String, String> IAuthTabCallbackDefault = access8100.onNavigationEvent();
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.core.router.spec.LandingArguments$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            Map mapOnExtraCallback;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                mapOnExtraCallback = getPrivacyPolicyUri.onExtraCallback();
                int i3 = 9 / 0;
            } else {
                mapOnExtraCallback = getPrivacyPolicyUri.onExtraCallback();
            }
            int i4 = onExtraCallbackWithResult + 11;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return mapOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });
    private final HashSet<String> onNavigationEvent = new HashSet<>();
    private final HashSet<String> onExtraCallbackWithResult = new HashSet<>();

    public static final /* synthetic */ class onExtraCallback {
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[IAuthTabCallback.values().length];
            try {
                iArr[IAuthTabCallback.Url.ordinal()] = 1;
                int i = onNavigationEvent + 121;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IAuthTabCallback.Scheme.ordinal()] = 2;
                int i4 = onNavigationEvent + 29;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 / 2;
                } else {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    public static /* synthetic */ Map onExtraCallback() {
        Map mapAccess000;
        int i = 2 % 2;
        int i2 = access100 + 105;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            mapAccess000 = access000();
            int i3 = 89 / 0;
        } else {
            mapAccess000 = access000();
        }
        int i4 = access100 + 5;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return mapAccess000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = ~((~i3) | i8);
        int i10 = i3 | i8;
        int i11 = i2 + i4 + i5 + ((-189913888) * i6) + ((-1809372279) * i);
        int i12 = i11 * i11;
        int i13 = (((-554582804) * i2) - 1671495680) + (10634006 * i4) + (i7 * 282608405) + (282608405 * i9) + ((-282608405) * i10) + ((-271974400) * i5) + (952107008 * i6) + (1092222976 * i) + ((-70844416) * i12);
        int i14 = (i2 * 986545540) + 223666697 + (i4 * 986543778) + (i7 * (-881)) + (i9 * (-881)) + (i10 * 881) + (i5 * 986544659) + (i6 * 1843362976) + (i * (-1872984789)) + (i12 * (-2050686976));
        int i15 = i13 + (i14 * i14 * 1179713536);
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    @Inject
    public getPrivacyPolicyUri() {
    }

    @Override // o.getDebugUserGeography
    public Map<String, String> onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> map = this.IAuthTabCallbackDefault;
        int i4 = access100 + 119;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return map;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 53;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback.get("nextLandingUrl");
        }
        this.onExtraCallback.get("nextLandingUrl");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = access100 + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.put("nextLandingUrl", str);
        int i4 = access100 + 15;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 33;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onExtraCallback.get("nextLandingScheme");
        int i4 = IAuthTabCallbackStub + 71;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private final void onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = access100 + 111;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.onExtraCallback.put("nextLandingScheme", str);
            obj.hashCode();
            throw null;
        }
        this.onExtraCallback.put("nextLandingScheme", str);
        int i3 = IAuthTabCallbackStub + 93;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 83;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onExtraCallback.get("prevEvent");
        int i4 = access100 + 79;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return str;
    }

    private final void onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.put("prevEvent", str);
        int i4 = IAuthTabCallbackStub + 15;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onExtraCallback.get("prevEventPlatform");
        int i4 = IAuthTabCallbackStub + 13;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private final void onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallback.put("prevEventPlatform", str);
        } else {
            this.onExtraCallback.put("prevEventPlatform", str);
            int i3 = 96 / 0;
        }
    }

    @Override // o.getDebugUserGeography
    public Map<String, String> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("prevEvent", onNavigationEvent()), getWrite.IAuthTabCallback("prevEventPlatform", asInterface())});
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapOnWarmupCompleted.entrySet()) {
            int i2 = IAuthTabCallbackStub + 5;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Pair pairIAuthTabCallback = null;
            if (str2 != null) {
                int i4 = IAuthTabCallbackStub + 9;
                access100 = i4 % 128;
                if (i4 % 2 == 0) {
                    getWrite.IAuthTabCallback(str, str2);
                    throw null;
                }
                pairIAuthTabCallback = getWrite.IAuthTabCallback(str, str2);
            }
            if (pairIAuthTabCallback != null) {
                arrayList.add(pairIAuthTabCallback);
            }
        }
        return access8100.onExtraCallbackWithResult(arrayList);
    }

    private final Map<KClass<TossSecRoute.Main>, String> IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = access100 + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Map<KClass<TossSecRoute.Main>, String> map = (Map) this.onTransact.getValue();
        int i4 = access100 + 31;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return map;
        }
        throw null;
    }

    private static final Map access000() {
        int i = 2 % 2;
        int i2 = access100 + 21;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Map mapOnNavigationEvent = access8100.onNavigationEvent(getWrite.IAuthTabCallback(Reflection.getOrCreateKotlinClass(TossSecRoute.Main.class), TossSecRoute.Main.PATH));
        int i4 = IAuthTabCallbackStub + 9;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return mapOnNavigationEvent;
    }

    public final void IAuthTabCallback(@NotNull TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0) {
        Set<String> setOnExtraCallback;
        String string;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        Bundle bundleOnNavigationEvent = twoLineExternalSyntheticLambda0.onNavigationEvent();
        Uri uriIAuthTabCallback = setDebugUserGeography.IAuthTabCallback(bundleOnNavigationEvent);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (uriIAuthTabCallback != null) {
            int i2 = IAuthTabCallbackStub + 69;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            Set<String> queryParameterNames = uriIAuthTabCallback.getQueryParameterNames();
            if (queryParameterNames != null) {
                for (String str : queryParameterNames) {
                    int i4 = access100 + 63;
                    IAuthTabCallbackStub = i4 % 128;
                    int i5 = i4 % 2;
                    String queryParameter = uriIAuthTabCallback.getQueryParameter(str);
                    if (queryParameter != null) {
                        int i6 = access100 + 35;
                        IAuthTabCallbackStub = i6 % 128;
                        if (i6 % 2 != 0) {
                            linkedHashMap.put(str, queryParameter);
                            int i7 = 0 / 0;
                        } else {
                            linkedHashMap.put(str, queryParameter);
                        }
                    }
                }
            }
        }
        if (bundleOnNavigationEvent == null || (setOnExtraCallback = bundleOnNavigationEvent.keySet()) == null) {
            setOnExtraCallback = clearFaultAdjacentMetadata.onExtraCallback();
        }
        for (String str2 : clearFaultAdjacentMetadata.IAuthTabCallback(setOnExtraCallback, clearFaultAdjacentMetadata.onExtraCallback("android-support-nav:controller:deepLinkIntent"))) {
            int i8 = IAuthTabCallbackStub + 3;
            access100 = i8 % 128;
            int i9 = i8 % 2;
            if (bundleOnNavigationEvent != null && (string = bundleOnNavigationEvent.getString(str2)) != null) {
                linkedHashMap.put(str2, string);
            }
        }
        onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1398677202, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1398677199, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, new onExtraCallbackWithResult(twoLineExternalSyntheticLambda0.onExtraCallbackWithResult(), twoLineExternalSyntheticLambda0.onWarmupCompleted().getInterfaceDescriptor(), linkedHashMap, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2.Companion.onWarmupCompleted(twoLineExternalSyntheticLambda0.onWarmupCompleted(), Reflection.getOrCreateKotlinClass(TossSecRoute.Main.class)))});
        int i10 = access100 + 105;
        IAuthTabCallbackStub = i10 % 128;
        int i11 = i10 % 2;
    }

    public final String onExtraCallbackWithResult(@NotNull IAuthTabCallback iAuthTabCallback) {
        String strIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        onExtraCallbackWithResult onextracallbackwithresultPeek = this.onWarmupCompleted.peek();
        if (onextracallbackwithresultPeek != null) {
            int i2 = IAuthTabCallbackStub + 113;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            strIAuthTabCallback = onextracallbackwithresultPeek.IAuthTabCallback();
        } else {
            strIAuthTabCallback = null;
        }
        if (strIAuthTabCallback != null) {
            return IAuthTabCallback(strIAuthTabCallback, iAuthTabCallback);
        }
        int i4 = access100 + 21;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final void onExtraCallbackWithResult(getPrivacyPolicyUri getprivacypolicyuri) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            getprivacypolicyuri.IAuthTabCallback((String) null);
            getprivacypolicyuri.onExtraCallback((String) null);
            int i3 = IAuthTabCallbackStub + 61;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        getprivacypolicyuri.IAuthTabCallback((String) null);
        getprivacypolicyuri.onExtraCallback((String) null);
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final String IAuthTabCallback(@NotNull String str, @NotNull IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (this.onNavigationEvent.contains(str)) {
            onExtraCallbackWithResult(this);
            return null;
        }
        int i2 = onExtraCallback.onExtraCallbackWithResult[iAuthTabCallback.ordinal()];
        if (i2 != 1) {
            int i3 = IAuthTabCallbackStub + 65;
            access100 = i3 % 128;
            if (i3 % 2 != 0 ? i2 != 2 : i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strOnExtraCallbackWithResult = IAuthTabCallback();
        } else {
            strOnExtraCallbackWithResult = onExtraCallbackWithResult();
        }
        if (strOnExtraCallbackWithResult != null && this.onExtraCallbackWithResult.contains(strOnExtraCallbackWithResult)) {
            int i4 = access100 + 91;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            onExtraCallbackWithResult(this);
            return null;
        }
        if (strOnExtraCallbackWithResult == null) {
            return null;
        }
        onExtraCallbackWithResult(this);
        this.onNavigationEvent.add(str);
        this.onExtraCallbackWithResult.add(strOnExtraCallbackWithResult);
        int i6 = access100 + 93;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return strOnExtraCallbackWithResult;
    }

    public final void asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.clear();
        int i4 = IAuthTabCallbackStub + 121;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
    }

    static final class onNavigationEvent {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final boolean IAuthTabCallback;
        private final onExtraCallbackWithResult onExtraCallback;
        private final List<onExtraCallbackWithResult> onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 41;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return true;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i3 = onWarmupCompleted + 35;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (this.IAuthTabCallback != onnavigationevent.IAuthTabCallback) {
                int i5 = onWarmupCompleted + 37;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, onnavigationevent.onExtraCallbackWithResult)) {
                return true;
            }
            int i7 = onWarmupCompleted + 15;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 11;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = Boolean.hashCode(this.IAuthTabCallback);
            onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallback;
            if (onextracallbackwithresult == null) {
                int i5 = onNavigationEvent + 69;
                onWarmupCompleted = i5 % 128;
                i = i5 % 2 == 0 ? 1 : 0;
            } else {
                int iHashCode2 = onextracallbackwithresult.hashCode();
                int i6 = onNavigationEvent + 7;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                i = iHashCode2;
            }
            return (((iHashCode * 31) + i) * 31) + this.onExtraCallbackWithResult.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "UpdateResult(revisited=" + this.IAuthTabCallback + ", prevEntry=" + this.onExtraCallback + ", newStack=" + this.onExtraCallbackWithResult + ")";
            int i2 = onNavigationEvent + 99;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onNavigationEvent(boolean z, @Nullable onExtraCallbackWithResult onextracallbackwithresult, @NotNull List<onExtraCallbackWithResult> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.IAuthTabCallback = z;
            this.onExtraCallback = onextracallbackwithresult;
            this.onExtraCallbackWithResult = list;
        }

        public final boolean onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 41;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            boolean z = this.IAuthTabCallback;
            int i4 = i2 + 21;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        public final onExtraCallbackWithResult onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallback;
            if (i3 != 0) {
                int i4 = 86 / 0;
            }
            return onextracallbackwithresult;
        }

        public final List<onExtraCallbackWithResult> IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            List<onExtraCallbackWithResult> list = this.onExtraCallbackWithResult;
            int i5 = i3 + 117;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        getPrivacyPolicyUri getprivacypolicyuri = (getPrivacyPolicyUri) objArr[0];
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {getprivacypolicyuri, onextracallbackwithresult, getprivacypolicyuri.onWarmupCompleted.poll(), getprivacypolicyuri.onWarmupCompleted.poll()};
        onNavigationEvent onnavigationevent = (onNavigationEvent) onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1314362037, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1314362036, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), objArr2);
        getprivacypolicyuri.onExtraCallback(onextracallbackwithresult, onnavigationevent.onExtraCallback());
        getprivacypolicyuri.onExtraCallback(onnavigationevent.onNavigationEvent());
        List listFilterNotNull = CollectionsKt.filterNotNull(onnavigationevent.IAuthTabCallback());
        LinkedList<onExtraCallbackWithResult> linkedList = getprivacypolicyuri.onWarmupCompleted;
        Iterator it = listFilterNotNull.iterator();
        while (it.hasNext()) {
            int i4 = access100 + 65;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            linkedList.push((onExtraCallbackWithResult) it.next());
        }
        int i6 = IAuthTabCallbackStub + 115;
        access100 = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String strIAuthTabCallback;
        getPrivacyPolicyUri getprivacypolicyuri = (getPrivacyPolicyUri) objArr[0];
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[1];
        onExtraCallbackWithResult onextracallbackwithresult2 = (onExtraCallbackWithResult) objArr[2];
        onExtraCallbackWithResult onextracallbackwithresult3 = (onExtraCallbackWithResult) objArr[3];
        int i = 2 % 2;
        if (onextracallbackwithresult2 != null) {
            int i2 = access100 + 35;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            strIAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
        } else {
            strIAuthTabCallback = null;
        }
        if (Intrinsics.areEqual(strIAuthTabCallback, onextracallbackwithresult.IAuthTabCallback())) {
            int i4 = IAuthTabCallbackStub + 105;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                getprivacypolicyuri.onWarmupCompleted.isEmpty();
                str.hashCode();
                throw null;
            }
            if (getprivacypolicyuri.onWarmupCompleted.isEmpty()) {
                onNavigationEvent onnavigationevent = new onNavigationEvent(true, onextracallbackwithresult2, CollectionsKt.listOf(new onExtraCallbackWithResult[]{onextracallbackwithresult2, onextracallbackwithresult}));
                int i5 = IAuthTabCallbackStub + 1;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationevent;
            }
        }
        if (onextracallbackwithresult.onNavigationEvent() && getprivacypolicyuri.IAuthTabCallback(onextracallbackwithresult.IAuthTabCallback(), onextracallbackwithresult2, onextracallbackwithresult3)) {
            getprivacypolicyuri.onWarmupCompleted.clear();
            return new onNavigationEvent(false, null, CollectionsKt.listOf(onextracallbackwithresult));
        }
        if (Intrinsics.areEqual(onextracallbackwithresult2 != null ? onextracallbackwithresult2.IAuthTabCallback() : null, onextracallbackwithresult.IAuthTabCallback())) {
            return new onNavigationEvent(true, onextracallbackwithresult2, CollectionsKt.listOf(new onExtraCallbackWithResult[]{onextracallbackwithresult3, onextracallbackwithresult}));
        }
        return Intrinsics.areEqual(onextracallbackwithresult3 != null ? onextracallbackwithresult3.IAuthTabCallback() : null, onextracallbackwithresult.IAuthTabCallback()) ? new onNavigationEvent(true, getprivacypolicyuri.onWarmupCompleted.peek(), CollectionsKt.listOf(onextracallbackwithresult)) : new onNavigationEvent(false, onextracallbackwithresult2, CollectionsKt.listOf(new onExtraCallbackWithResult[]{onextracallbackwithresult3, onextracallbackwithresult2, onextracallbackwithresult}));
    }

    private final boolean IAuthTabCallback(String str, onExtraCallbackWithResult onextracallbackwithresult, onExtraCallbackWithResult onextracallbackwithresult2) {
        String strIAuthTabCallback;
        int i = 2 % 2;
        List listPlus = CollectionsKt.plus(this.onWarmupCompleted, CollectionsKt.listOf(new onExtraCallbackWithResult[]{onextracallbackwithresult, onextracallbackwithresult2}));
        if ((listPlus instanceof Collection) && listPlus.isEmpty()) {
            return false;
        }
        Iterator it = listPlus.iterator();
        int i2 = IAuthTabCallbackStub + 77;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        while (!(!it.hasNext())) {
            onExtraCallbackWithResult onextracallbackwithresult3 = (onExtraCallbackWithResult) it.next();
            if (onextracallbackwithresult3 != null) {
                int i4 = IAuthTabCallbackStub + 49;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                strIAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
            } else {
                strIAuthTabCallback = null;
            }
            if (!Intrinsics.areEqual(strIAuthTabCallback, str) && onextracallbackwithresult3 != null && onextracallbackwithresult3.onNavigationEvent()) {
                return true;
            }
        }
        return false;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getPrivacyPolicyUri getprivacypolicyuri = (getPrivacyPolicyUri) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) CollectionsKt.getOrNull(getprivacypolicyuri.onWarmupCompleted, 1);
        if (onextracallbackwithresult != null) {
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1398677202, iOnNavigationEvent, -1398677199, iOnNavigationEvent2, iOnNavigationEvent3, new Object[]{getprivacypolicyuri, onextracallbackwithresult});
        }
        int i4 = access100 + 119;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getPrivacyPolicyUri getprivacypolicyuri = (getPrivacyPolicyUri) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        getprivacypolicyuri.onWarmupCompleted.clear();
        int i4 = access100 + 117;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        int i = 2 % 2;
        if (onextracallbackwithresult != null) {
            int i2 = IAuthTabCallbackStub + 5;
            access100 = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                String strOnExtraCallback = onextracallbackwithresult.onExtraCallback();
                if (strOnExtraCallback != null) {
                    Iterator<T> it = IAuthTabCallbackStubProxy().entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        int i3 = access100 + 67;
                        IAuthTabCallbackStub = i3 % 128;
                        int i4 = i3 % 2;
                        Object next = it.next();
                        String simpleName = clearRegisters.onNavigationEvent((KClass) ((Map.Entry) next).getKey()).getSimpleName();
                        Intrinsics.checkNotNullExpressionValue(simpleName, "");
                        if (StringsKt.contains$default(strOnExtraCallback, simpleName, false, 2, (Object) null)) {
                            obj = next;
                            break;
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry != null) {
                        String str = (String) entry.getValue();
                        Object[] objArr = new Object[1];
                        a(new char[]{1, 0, 13813}, (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 11), KeyEvent.keyCodeFromString("") + 3, objArr);
                        onNavigationEvent(((String) objArr[0]).intern());
                        onExtraCallbackWithResult(str);
                    }
                }
            } else {
                onextracallbackwithresult.onExtraCallback();
                throw null;
            }
        }
        int i5 = IAuthTabCallbackStub + 109;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
    }

    private final void onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, boolean z) {
        boolean zRemove;
        Map<String, String> mapIAuthTabCallback;
        int i = 2 % 2;
        this.onExtraCallback.clear();
        Iterator<Map.Entry<String, String>> it = onextracallbackwithresult.onWarmupCompleted().entrySet().iterator();
        while (it.hasNext()) {
            int i2 = access100 + 19;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                Map.Entry<String, String> next = it.next();
                next.getKey();
                next.getValue();
                throw null;
            }
            Map.Entry<String, String> next2 = it.next();
            String key = next2.getKey();
            String value = next2.getValue();
            if (value != null) {
                onExtraCallbackWithResult(key, value);
            }
        }
        if (z) {
            int i3 = IAuthTabCallbackStub + 99;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            zRemove = this.IAuthTabCallback.remove(onextracallbackwithresult.IAuthTabCallback());
        } else {
            zRemove = false;
        }
        if (!z || zRemove) {
            mapIAuthTabCallback = access8100.IAuthTabCallback(this.onExtraCallback);
        } else {
            int i5 = IAuthTabCallbackStub + 15;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            mapIAuthTabCallback = access8100.onNavigationEvent();
            int i7 = access100 + 119;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
        }
        this.IAuthTabCallbackDefault = mapIAuthTabCallback;
        if (z) {
            return;
        }
        if (onExtraCallbackWithResult() == null && IAuthTabCallback() == null) {
            return;
        }
        this.IAuthTabCallback.add(onextracallbackwithresult.IAuthTabCallback());
    }

    private final void onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        if (Intrinsics.areEqual(str2, "{" + str + "}")) {
            int i2 = IAuthTabCallbackStub + 33;
            access100 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            this.onExtraCallback.put(str, str2);
            int i4 = access100 + 111;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 78 / 0;
            }
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int asInterface = 1;
        private static int onExtraCallbackWithResult;
        private final String IAuthTabCallback;
        private final String onExtraCallback;
        private final boolean onNavigationEvent;
        private final Map<String, String> onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback)) {
                return Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback) && Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted) && this.onNavigationEvent == onextracallbackwithresult.onNavigationEvent;
            }
            int i3 = asInterface + 77;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = asInterface + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.IAuthTabCallback.hashCode();
            String str = this.onExtraCallback;
            if (str == null) {
                int i4 = asInterface + 119;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            int iHashCode3 = (((((iHashCode2 * 31) + iHashCode) * 31) + this.onWarmupCompleted.hashCode()) * 31) + Boolean.hashCode(this.onNavigationEvent);
            int i6 = asInterface + 25;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 11 / 0;
            }
            return iHashCode3;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Entry(id=" + this.IAuthTabCallback + ", route=" + this.onExtraCallback + ", params=" + this.onWarmupCompleted + ", isHome=" + this.onNavigationEvent + ")";
            int i2 = asInterface + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallbackWithResult(@NotNull String str, @Nullable String str2, @NotNull Map<String, String> map, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.IAuthTabCallback = str;
            this.onExtraCallback = str2;
            this.onWarmupCompleted = map;
            this.onNavigationEvent = z;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 77;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i3 + 27;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 27;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.onExtraCallback;
            int i4 = i3 + 7;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 83 / 0;
            }
            return str;
        }

        public final Map<String, String> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onWarmupCompleted;
            }
            throw null;
        }

        public final boolean onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asInterface + 1;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onNavigationEvent;
            }
            throw null;
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = asInterface;
        float f = 0.0f;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 26, 23139 - TextUtils.getOffsetAfter("", 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(asBinder)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 'J' - AndroidCharacter.getMirror('0'), (ViewConfiguration.getJumpTapTimeout() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i5 = $11 + 113;
            int i6 = i5 % 128;
            $10 = i6;
            int i7 = i5 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
            int i8 = i6 + 101;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            int i10 = $10 + 125;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 24823), 74 - (ViewConfiguration.getTapTimeout() >> 16), (Process.myTid() >> 22) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i12 = $11 + 23;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), KeyEvent.normalizeMetaState(0) + 30, ((Process.getThreadPriority(0) + 20) >> 6) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                        int i15 = $10 + 93;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                        } else {
                            int i19 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i20 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i19];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i20];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        int i21 = 0;
        while (i21 < i) {
            int i22 = $10 + 13;
            $11 = i22 % 128;
            if (i22 % 2 == 0) {
                cArr4[i21] = (char) (cArr4[i21] ^ 13312);
                i21 += 10;
            } else {
                cArr4[i21] = (char) (cArr4[i21] ^ 13722);
                i21++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final IAuthTabCallback Url = new IAuthTabCallback("Url", 0);
        public static final IAuthTabCallback Scheme = new IAuthTabCallback("Scheme", 1);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {Url, Scheme};
            int i5 = i3 + 79;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return iAuthTabCallbackArr;
            }
            throw null;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            if (i3 == 0) {
                int i4 = 98 / 0;
            }
            return enumEntries;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            int i4 = onExtraCallback + 105;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i3 = onNavigationEvent + 117;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return iAuthTabCallbackArr;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }
    }

    private final onNavigationEvent onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, onExtraCallbackWithResult onextracallbackwithresult2, onExtraCallbackWithResult onextracallbackwithresult3) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (onNavigationEvent) onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1314362037, iOnNavigationEvent, -1314362036, iOnNavigationEvent2, iOnNavigationEvent3, new Object[]{this, onextracallbackwithresult, onextracallbackwithresult2, onextracallbackwithresult3});
    }

    private final void onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1398677202, iOnNavigationEvent, -1398677199, iOnNavigationEvent2, iOnNavigationEvent3, new Object[]{this, onextracallbackwithresult});
    }

    public final void onWarmupCompleted() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1181798525, iOnNavigationEvent, 1181798525, iOnNavigationEvent2, iOnNavigationEvent3, new Object[]{this});
    }

    public final void IAuthTabCallbackStub() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 975652200, iOnNavigationEvent, -975652198, iOnNavigationEvent2, iOnNavigationEvent3, new Object[]{this});
    }
}
