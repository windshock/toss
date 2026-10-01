package o;

import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import im.toss.securities.core.exposure.ScreenTracker$;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.pExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class pExternalSyntheticLambda1 {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int access000 = 1;
    private static int extraCallback = 1;
    private static int extraCallbackWithResult;
    private static int getInterfaceDescriptor;
    private final getBorderRadius<Unit> IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final AppSetIdAndScope1 IAuthTabCallbackStub;
    private volatile onWarmupCompleted IAuthTabCallbackStubProxy;
    private final getTileModeX<readBomAsCharset> IAuthTabCallback_Parcel;
    private final getTileModeX<Unit> access100;
    private volatile IAuthTabCallback asBinder;
    private final Function0<Unit> asInterface;
    private final getBorderRadius<readBomAsCharset> onExtraCallback;
    private final ConcurrentHashMap.KeySetView<readBomAsCharset, Boolean> onExtraCallbackWithResult;
    private final ConcurrentHashMap<String, Set<String>> onNavigationEvent;
    private final GeckoHubImp onTransact;
    private boolean onWarmupCompleted;

    static {
        int i = extraCallback + 49;
        extraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | i3;
        int i10 = i8 | i3;
        int i11 = (~((~i3) | i5)) | (~i10);
        int i12 = (~(i2 | i7 | i3)) | (~(i10 | i5));
        int i13 = i3 + i5 + i6 + (528639218 * i) + ((-532493036) * i4);
        int i14 = i13 * i13;
        int i15 = ((i3 * 873666089) - 1460666368) + (873666089 * i5) + ((-875965520) * i9) + (437982760 * i11) + ((-437982760) * i12) + (435683328 * i6) + (1819279360 * i) + ((-1621098496) * i4) + (586088448 * i14);
        int i16 = (i3 * (-1573143961)) + 2078511484 + (i5 * (-1573143961)) + (i9 * 1872) + (i11 * (-936)) + (i12 * 936) + (i6 * (-1573143025)) + (i * 123045422) + (i4 * (-1548035028)) + (i14 * 1845559296);
        int i17 = i15 + (i16 * i16 * 1848705024);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access000 + 11;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return asBinder();
        }
        asBinder();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Set onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 37;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Set setOnExtraCallback = onExtraCallback(str);
        int i4 = getInterfaceDescriptor + 21;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return setOnExtraCallback;
    }

    public static /* synthetic */ Set onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 97;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Set setOnExtraCallback = onExtraCallback(function1, obj);
        int i3 = access000 + 49;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return setOnExtraCallback;
    }

    public pExternalSyntheticLambda1(@NotNull String str, @NotNull IAuthTabCallback iAuthTabCallback, @NotNull onWarmupCompleted onwarmupcompleted, @NotNull Function0<Unit> function0, @NotNull GeckoHubImp geckoHubImp) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(geckoHubImp, "");
        this.IAuthTabCallbackDefault = str;
        this.asBinder = iAuthTabCallback;
        this.IAuthTabCallbackStubProxy = onwarmupcompleted;
        this.asInterface = function0;
        this.onTransact = geckoHubImp;
        this.onExtraCallbackWithResult = ConcurrentHashMap.newKeySet();
        this.onNavigationEvent = new ConcurrentHashMap<>();
        getBorderRadius<Unit> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 1, (CloseableUtils) null, 5, (Object) null);
        this.IAuthTabCallback = getborderradiusOnWarmupCompleted;
        this.access100 = getborderradiusOnWarmupCompleted;
        getBorderRadius<readBomAsCharset> getborderradiusOnWarmupCompleted2 = getShine.onWarmupCompleted(0, 1, (CloseableUtils) null, 5, (Object) null);
        this.onExtraCallback = getborderradiusOnWarmupCompleted2;
        this.IAuthTabCallback_Parcel = getborderradiusOnWarmupCompleted2;
        this.IAuthTabCallbackStub = ea10.onExtraCallbackWithResult("ScreenTracker");
    }

    public /* synthetic */ pExternalSyntheticLambda1(String str, IAuthTabCallback iAuthTabCallback, onWarmupCompleted onwarmupcompleted, Function0 function0, GeckoHubImp geckoHubImp, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            iAuthTabCallback = new IAuthTabCallback();
            int i2 = access000 + 123;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
        onWarmupCompleted onwarmupcompleted2 = (i & 4) != 0 ? new onWarmupCompleted() : onwarmupcompleted;
        if ((i & 8) != 0) {
            function0 = new Function0() { // from class: im.toss.securities.core.exposure.ScreenTracker$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 25;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitIAuthTabCallback = pExternalSyntheticLambda1.IAuthTabCallback();
                    if (i6 != 0) {
                        int i7 = 36 / 0;
                    }
                    return unitIAuthTabCallback;
                }
            };
            int i4 = access000 + 13;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        Function0 function02 = function0;
        if ((i & 16) != 0) {
            int i6 = access000 + 65;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 != 0) {
                putChannelInfo.onWarmupCompleted();
                throw null;
            }
            geckoHubImp = putChannelInfo.onWarmupCompleted();
        }
        this(str, iAuthTabCallback2, onwarmupcompleted2, function02, geckoHubImp);
    }

    private static final Unit asBinder() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 13;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        pExternalSyntheticLambda1 pexternalsyntheticlambda1 = (pExternalSyntheticLambda1) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 83;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        GeckoHubImp geckoHubImp = pexternalsyntheticlambda1.onTransact;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 1;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return geckoHubImp;
    }

    public final ConcurrentHashMap.KeySetView<readBomAsCharset, Boolean> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 71;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        ConcurrentHashMap.KeySetView<readBomAsCharset, Boolean> keySetView = this.onExtraCallbackWithResult;
        int i5 = i2 + 65;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return keySetView;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        pExternalSyntheticLambda1 pexternalsyntheticlambda1 = (pExternalSyntheticLambda1) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 53;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        getTileModeX<Unit> gettilemodex = pexternalsyntheticlambda1.access100;
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        return gettilemodex;
    }

    public final getTileModeX<readBomAsCharset> onTransact() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 41;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        getTileModeX<readBomAsCharset> gettilemodex = this.IAuthTabCallback_Parcel;
        int i5 = i2 + 51;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return gettilemodex;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        pExternalSyntheticLambda1 pexternalsyntheticlambda1 = (pExternalSyntheticLambda1) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        pexternalsyntheticlambda1.onWarmupCompleted = zBooleanValue;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 45;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000 + 43;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.onWarmupCompleted;
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallback(pExternalSyntheticLambda1 pexternalsyntheticlambda1, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor;
        int i4 = i3 + 31;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 47;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            map = access8100.onNavigationEvent();
        }
        pexternalsyntheticlambda1.onExtraCallback((Map<String, ? extends Object>) map);
    }

    public final void onExtraCallback(@NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = access000 + 107;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Map<String, Object> mapOnExtraCallback = this.IAuthTabCallbackStubProxy.onExtraCallback(r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY.View, null);
        mapOnExtraCallback.get("tab");
        String str = this.IAuthTabCallbackDefault;
        Map mapOnExtraCallback2 = access8100.onExtraCallback();
        mapOnExtraCallback2.putAll(mapOnExtraCallback);
        mapOnExtraCallback2.putAll(map);
        AFd1mSDK.onWarmupCompleted("view", str, str, access8100.onExtraCallbackWithResult(mapOnExtraCallback2), false, "", false, (Function1) null, 208, (Object) null);
        int i4 = getInterfaceDescriptor + 51;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean onExtraCallback(pExternalSyntheticLambda1 pexternalsyntheticlambda1, readBomAsCharset readbomascharset, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 45;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 2) != 0) {
            map = access8100.onNavigationEvent();
        }
        boolean zOnNavigationEvent = pexternalsyntheticlambda1.onNavigationEvent(readbomascharset, (Map<String, ? extends Object>) map);
        int i5 = access000 + 77;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return zOnNavigationEvent;
    }

    public final boolean onNavigationEvent(@NotNull readBomAsCharset readbomascharset, @NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = access000 + 55;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(readbomascharset, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.onExtraCallbackWithResult.add(this.asBinder.IAuthTabCallback(readbomascharset));
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(readbomascharset, "");
        Intrinsics.checkNotNullParameter(map, "");
        readBomAsCharset readbomascharsetIAuthTabCallback = this.asBinder.IAuthTabCallback(readbomascharset);
        if (!this.onExtraCallbackWithResult.add(readbomascharsetIAuthTabCallback)) {
            int i3 = access000 + 21;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        Map<String, Object> mapOnExtraCallback = this.IAuthTabCallbackStubProxy.onExtraCallback(r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY.Impression, readbomascharsetIAuthTabCallback);
        Map mapOnExtraCallback2 = access8100.onExtraCallback();
        mapOnExtraCallback2.put("sectionName", readbomascharsetIAuthTabCallback.onWarmupCompleted());
        mapOnExtraCallback2.putAll(mapOnExtraCallback);
        mapOnExtraCallback2.putAll(map);
        Map mapOnExtraCallbackWithResult = access8100.onExtraCallbackWithResult(mapOnExtraCallback2);
        new Object[]{readbomascharsetIAuthTabCallback.onWarmupCompleted(), mapOnExtraCallback.get("tab"), mapOnExtraCallbackWithResult};
        String str = this.IAuthTabCallbackDefault;
        AFd1mSDK.onWarmupCompleted("impression", str, str, mapOnExtraCallbackWithResult, false, "", false, (Function1) null, 208, (Object) null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallbackWithResult(pExternalSyntheticLambda1 pexternalsyntheticlambda1, readBomAsCharset readbomascharset, String str, String str2, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = access000;
            int i4 = i3 + 43;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 27 / 0;
            }
            int i6 = i3 + 115;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            str2 = null;
        }
        if ((i & 8) != 0) {
            map = access8100.onNavigationEvent();
        }
        pexternalsyntheticlambda1.onWarmupCompleted(readbomascharset, str, str2, map);
    }

    public final void onWarmupCompleted(@NotNull readBomAsCharset readbomascharset, @NotNull String str, @Nullable String str2, @NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = access000 + 109;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(readbomascharset, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        readBomAsCharset readbomascharsetIAuthTabCallback = this.asBinder.IAuthTabCallback(readbomascharset);
        Map<String, Object> mapOnExtraCallback = this.IAuthTabCallbackStubProxy.onExtraCallback(r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY.Event, readbomascharsetIAuthTabCallback);
        Map mapOnExtraCallback2 = access8100.onExtraCallback();
        mapOnExtraCallback2.put("sectionName", readbomascharsetIAuthTabCallback.onWarmupCompleted());
        if (str2 != null) {
            int i4 = access000 + 73;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            mapOnExtraCallback2.put("content", StringsKt.replace$default(str2, "\n", "", false, 4, (Object) null));
            int i6 = access000 + 1;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
        }
        mapOnExtraCallback2.put("component", str);
        mapOnExtraCallback2.putAll(mapOnExtraCallback);
        mapOnExtraCallback2.putAll(map);
        Map mapOnExtraCallbackWithResult = access8100.onExtraCallbackWithResult(mapOnExtraCallback2);
        new Object[]{readbomascharsetIAuthTabCallback.onWarmupCompleted(), mapOnExtraCallback.get("tab"), mapOnExtraCallbackWithResult};
        String str3 = this.IAuthTabCallbackDefault;
        AFd1mSDK.onWarmupCompleted("event", str3, str3, mapOnExtraCallbackWithResult, false, "", false, (Function1) null, 208, (Object) null);
    }

    public static /* synthetic */ void onNavigationEvent(pExternalSyntheticLambda1 pexternalsyntheticlambda1, readBomAsCharset readbomascharset, String str, String str2, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access000;
        int i4 = i3 + 65;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0 ? (i & 2) != 0 : (i & 4) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            int i5 = i3 + 61;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            str2 = "";
        }
        if ((i & 8) != 0) {
            int i6 = i3 + 101;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            map = access8100.onNavigationEvent();
        }
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{pexternalsyntheticlambda1, readbomascharset, str, str2, map}, 449240050, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -449240050, iOnExtraCallbackWithResult2);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        pExternalSyntheticLambda1 pexternalsyntheticlambda1 = (pExternalSyntheticLambda1) objArr[0];
        readBomAsCharset readbomascharset = (readBomAsCharset) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        Map map = (Map) objArr[4];
        int i = 2 % 2;
        int i2 = access000 + 105;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(readbomascharset, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        readBomAsCharset readbomascharsetIAuthTabCallback = pexternalsyntheticlambda1.asBinder.IAuthTabCallback(readbomascharset);
        Map<String, Object> mapOnExtraCallback = pexternalsyntheticlambda1.IAuthTabCallbackStubProxy.onExtraCallback(r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY.Analytics, readbomascharsetIAuthTabCallback);
        Map mapOnExtraCallback2 = access8100.onExtraCallback();
        mapOnExtraCallback2.put("sectionName", readbomascharsetIAuthTabCallback.onWarmupCompleted());
        mapOnExtraCallback2.put("component", str);
        mapOnExtraCallback2.put("content", StringsKt.replace$default(str2, "\n", "", false, 4, (Object) null));
        mapOnExtraCallback2.putAll(mapOnExtraCallback);
        mapOnExtraCallback2.putAll(map);
        Map mapOnExtraCallbackWithResult = access8100.onExtraCallbackWithResult(mapOnExtraCallback2);
        AppSetIdAndScope1 appSetIdAndScope1 = pexternalsyntheticlambda1.IAuthTabCallbackStub;
        new Object[]{readbomascharsetIAuthTabCallback.onWarmupCompleted(), mapOnExtraCallback.get("tab"), mapOnExtraCallbackWithResult};
        String str3 = pexternalsyntheticlambda1.IAuthTabCallbackDefault;
        AFd1mSDK.onWarmupCompleted("analytics", str3, str3, mapOnExtraCallbackWithResult, false, "", false, (Function1) null, 208, (Object) null);
        int i4 = access000 + 45;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return null;
    }

    private static final Set onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        int i4 = getInterfaceDescriptor + 29;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return keySetViewNewKeySet;
    }

    private static final Set onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Set set = (Set) function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return set;
    }

    public final void onNavigationEvent(@NotNull String str, @NotNull readBomAsCharset readbomascharset) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(readbomascharset, "");
        this.onNavigationEvent.computeIfAbsent(this.asBinder.IAuthTabCallback(readbomascharset).onWarmupCompleted(), new ScreenTracker$.ExternalSyntheticLambda2(new ScreenTracker$.ExternalSyntheticLambda1())).add(str);
        int i2 = getInterfaceDescriptor + 65;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    public final boolean onNavigationEvent(@NotNull readBomAsCharset readbomascharset) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 47;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(readbomascharset, "");
            return this.onExtraCallbackWithResult.contains(this.asBinder.IAuthTabCallback(readbomascharset));
        }
        Intrinsics.checkNotNullParameter(readbomascharset, "");
        int i3 = 81 / 0;
        return this.onExtraCallbackWithResult.contains(this.asBinder.IAuthTabCallback(readbomascharset));
    }

    public final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access000 + 81;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        asInterface();
        this.IAuthTabCallback.onNavigationEvent(Unit.INSTANCE);
        int i4 = getInterfaceDescriptor + 123;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access000 + 107;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        asInterface();
        onExtraCallback(this, null, 1, null);
        this.IAuthTabCallback.onNavigationEvent(Unit.INSTANCE);
    }

    public final void IAuthTabCallback(@NotNull readBomAsCharset readbomascharset) {
        int i = 2 % 2;
        int i2 = access000 + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(readbomascharset, "");
        this.onExtraCallbackWithResult.remove(this.asBinder.IAuthTabCallback(readbomascharset));
        int i4 = access000 + 63;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        pExternalSyntheticLambda1 pexternalsyntheticlambda1 = (pExternalSyntheticLambda1) objArr[0];
        readBomAsCharset readbomascharset = (readBomAsCharset) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 27;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(readbomascharset, "");
            pexternalsyntheticlambda1.onExtraCallbackWithResult.remove(pexternalsyntheticlambda1.asBinder.IAuthTabCallback(readbomascharset));
            pexternalsyntheticlambda1.onExtraCallback.onNavigationEvent(readbomascharset);
            throw null;
        }
        Intrinsics.checkNotNullParameter(readbomascharset, "");
        pexternalsyntheticlambda1.onExtraCallbackWithResult.remove(pexternalsyntheticlambda1.asBinder.IAuthTabCallback(readbomascharset));
        pexternalsyntheticlambda1.onExtraCallback.onNavigationEvent(readbomascharset);
        int i3 = access000 + 3;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final void asInterface() {
        int i = 2 % 2;
        if (!this.onNavigationEvent.isEmpty()) {
            int i2 = getInterfaceDescriptor + 31;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                this.IAuthTabCallbackStubProxy.onExtraCallback(r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY.Analytics, null);
                this.onNavigationEvent.entrySet().iterator();
                throw null;
            }
            Map<String, Object> mapOnExtraCallback = this.IAuthTabCallbackStubProxy.onExtraCallback(r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY.Analytics, null);
            for (Map.Entry<String, Set<String>> entry : this.onNavigationEvent.entrySet()) {
                int i3 = access000 + 3;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
                String key = entry.getKey();
                Set<String> value = entry.getValue();
                String str = this.IAuthTabCallbackDefault;
                Map mapOnExtraCallback2 = access8100.onExtraCallback();
                mapOnExtraCallback2.put("sectionName", key);
                mapOnExtraCallback2.putAll(mapOnExtraCallback);
                mapOnExtraCallback2.put("newsIds", CollectionsKt.toList(value));
                mapOnExtraCallback2.put("analytics_type", "info__news__exposed_newsId");
                AFd1mSDK.onWarmupCompleted("analytics", str, str, access8100.onExtraCallbackWithResult(mapOnExtraCallback2), false, "", false, (Function1) null, 208, (Object) null);
            }
            this.onNavigationEvent.clear();
        }
        this.onExtraCallbackWithResult.clear();
        this.asInterface.invoke();
    }

    public final void onWarmupCompleted(@NotNull onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.IAuthTabCallbackStubProxy = onwarmupcompleted;
        int i4 = getInterfaceDescriptor + 15;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
    }

    public static class IAuthTabCallback implements Function1<readBomAsCharset, readBomAsCharset> {
        private static int IAuthTabCallback = 1;
        public static final int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted;

        public readBomAsCharset IAuthTabCallback(@NotNull readBomAsCharset readbomascharset) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(readbomascharset, "");
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = IAuthTabCallback + 41;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return readbomascharset;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            IAuthTabCallback = i2 % 128;
            readBomAsCharset readbomascharset = (readBomAsCharset) obj;
            if (i2 % 2 == 0) {
                IAuthTabCallback(readbomascharset);
                throw null;
            }
            readBomAsCharset readbomascharsetIAuthTabCallback = IAuthTabCallback(readbomascharset);
            int i3 = onWarmupCompleted + 17;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return readbomascharsetIAuthTabCallback;
            }
            throw null;
        }
    }

    public static class onWarmupCompleted implements Function2<r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY, readBomAsCharset, Map<String, ? extends Object>> {
        private static int onExtraCallback = 1;
        public static final int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted;

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Map<String, Object> mapOnExtraCallback = onExtraCallback((r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY) obj, (readBomAsCharset) obj2);
            int i4 = onExtraCallback + 101;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return mapOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public Map<String, Object> onExtraCallback(@NotNull r8lambdaz5d1_jN6WXTZMymmvyUBNlN2JiY r8lambdaz5d1_jn6wxtzmymmvyubnln2jiy, @Nullable readBomAsCharset readbomascharset) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(r8lambdaz5d1_jn6wxtzmymmvyubnln2jiy, "");
            Map<String, Object> mapOnNavigationEvent = access8100.onNavigationEvent();
            int i4 = onWarmupCompleted + 1;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return mapOnNavigationEvent;
        }
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ boolean IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnExtraCallback = onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6);
            int i4 = onNavigationEvent + 63;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 52 / 0;
            }
            return zOnExtraCallback;
        }

        private onNavigationEvent() {
        }

        private static final boolean onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Boolean bool = (Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
            if (i3 != 0) {
                return bool.booleanValue();
            }
            bool.booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements getBacktraceNote<Boolean, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback, access13800<? super Boolean>, Object> {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            /* synthetic */ Object L$0;
            /* synthetic */ boolean Z$0;
            int label;

            onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(3, access13800Var);
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 39;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (i3 != 0) {
                    return onNavigationEvent(zBooleanValue, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) obj2, (access13800) obj3);
                }
                Object objOnNavigationEvent = onNavigationEvent(zBooleanValue, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) obj2, (access13800) obj3);
                int i4 = 80 / 0;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(boolean z, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback, access13800<? super Boolean> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
                onextracallbackwithresult.Z$0 = z;
                onextracallbackwithresult.L$0 = onextracallback;
                Object objInvokeSuspend = onextracallbackwithresult.invokeSuspend(Unit.INSTANCE);
                int i2 = onWarmupCompleted + 125;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 84 / 0;
                }
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                boolean z = this.Z$0;
                TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) this.L$0;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i2 = onNavigationEvent + 91;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                ResultKt.onNavigationEvent(obj);
                boolean z2 = true;
                if (z && !(!onextracallback.isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED))) {
                    int i4 = onNavigationEvent + 25;
                    int i5 = i4 % 128;
                    onWarmupCompleted = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 19;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 2 / 4;
                    }
                } else {
                    int i9 = onNavigationEvent + 121;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    z2 = false;
                }
                return access14000.onNavigationEvent(z2);
            }
        }

        public final IAnimation<Boolean> onExtraCallback(@NotNull final CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6, @NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda6, "");
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            IAnimation<Boolean> iAnimationOnNavigationEvent = ycxycx.onNavigationEvent(ycxycx.onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.securities.core.exposure.ScreenTracker$Companion$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 123;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Boolean boolValueOf = Boolean.valueOf(pExternalSyntheticLambda1.onNavigationEvent.IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6));
                    int i5 = onWarmupCompleted + 121;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 24 / 0;
                    }
                    return boolValueOf;
                }
            }), textFieldScrollKtExternalSyntheticLambda0.getLifecycle().onWarmupCompleted(), new onExtraCallbackWithResult(null)));
            int i2 = IAuthTabCallback + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iAnimationOnNavigationEvent;
        }
    }

    public final GeckoHubImp onWarmupCompleted() {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (GeckoHubImp) IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{this}, -1636102543, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1636102544, iOnExtraCallbackWithResult2);
    }

    public final getTileModeX<Unit> onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (getTileModeX) IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{this}, 2046480637, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -2046480635, iOnExtraCallbackWithResult2);
    }

    public final void onExtraCallbackWithResult(@NotNull readBomAsCharset readbomascharset) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{this, readbomascharset}, 57450182, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -57450178, iOnExtraCallbackWithResult2);
    }

    public final void onExtraCallbackWithResult(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), objArr, 2092920312, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -2092920309, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
    }

    public final void onNavigationEvent(@NotNull readBomAsCharset readbomascharset, @NotNull String str, @NotNull String str2, @NotNull Map<String, ? extends Object> map) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{this, readbomascharset, str, str2, map}, 449240050, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -449240050, iOnExtraCallbackWithResult2);
    }
}
