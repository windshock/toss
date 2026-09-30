package im.toss.url.resolver.internal;

import im.toss.url.resolver.ResolverOptions;
import im.toss.url.resolver.internal.RegistrationContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import o.BreadcrumbState;
import o.BreadcrumbType;
import o.Bugsnag;
import o.addFeatureFlag;
import o.addFeatureFlags;
import o.getBreadcrumbIndex;
import o.getFaultAddress;
import o.getObserversbugsnag_android_core_release;
import o.getWrite;
import o.logNull;
import o.matchExitInfo;
import o.trimMetadataStringsTobugsnag_android_core_release;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RoutingKt {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static final String onWarmupCompleted(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Object obj = null;
        if (str.length() == 0) {
            int i2 = onExtraCallbackWithResult + 41;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str2;
            }
            obj.hashCode();
            throw null;
        }
        if (StringsKt__StringsJVMKt.endsWith$default(str, "/", false, 2, null)) {
            int i3 = onExtraCallback + 19;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (StringsKt__StringsJVMKt.startsWith$default(str2, "/", false, 2, null)) {
                String strSubstring = str2.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                String str3 = str + strSubstring;
                int i5 = onExtraCallback + 19;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return str3;
                }
                throw null;
            }
        }
        return str + str2;
    }

    public static final <H> void onNavigationEvent(@NotNull RegistrationContext<H> registrationContext, @NotNull String str, @NotNull String str2, @NotNull Set<String> set, H h) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(registrationContext, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(set, "");
        String strOnWarmupCompleted = onWarmupCompleted(str, str2);
        if (registrationContext.onNavigationEvent().add(strOnWarmupCompleted + "?" + CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.sorted(set), ",", null, null, 0, null, null, 62, null))) {
            registrationContext.onExtraCallback().add(new RegistrationContext.Registration<>(strOnWarmupCompleted, set, h));
            int i2 = onExtraCallbackWithResult + 113;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        throw new IllegalStateException(("Duplicate registration: '" + strOnWarmupCompleted + "' (query=" + set + ")").toString());
    }

    public static final <H> Pair<List<RouteEntry<H>>, ResolverOptions> onExtraCallbackWithResult(@NotNull RegistrationContext<H> registrationContext) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(registrationContext, "");
        ResolverOptions resolverOptions = new ResolverOptions(registrationContext.IAuthTabCallback(), registrationContext.onWarmupCompleted());
        getBreadcrumbIndex getbreadcrumbindex = new getBreadcrumbIndex(resolverOptions.onNavigationEvent());
        List<RegistrationContext.Registration<H>> listOnExtraCallback = registrationContext.onExtraCallback();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOnExtraCallback, 10));
        Iterator<T> it = listOnExtraCallback.iterator();
        while (it.hasNext()) {
            RegistrationContext.Registration registration = (RegistrationContext.Registration) it.next();
            logNull lognullOnWarmupCompleted = getbreadcrumbindex.onWarmupCompleted(resolverOptions.onExtraCallbackWithResult() ? onNavigationEvent(registration.onExtraCallback()) : registration.onExtraCallback());
            Set<String> setOnExtraCallbackWithResult = registration.onExtraCallbackWithResult();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setOnExtraCallbackWithResult, 10));
            Iterator<T> it2 = setOnExtraCallbackWithResult.iterator();
            int i2 = onExtraCallback + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            while (it2.hasNext()) {
                int i4 = onExtraCallback + 13;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                arrayList2.add(addFeatureFlags.onNavigationEvent.IAuthTabCallback((String) it2.next()));
            }
            arrayList.add(new RouteEntry(lognullOnWarmupCompleted, arrayList2, onWarmupCompleted(lognullOnWarmupCompleted, arrayList2), registration.IAuthTabCallback()));
        }
        return getWrite.IAuthTabCallback(CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: im.toss.url.resolver.internal.RoutingKt$compileRegistrations$$inlined$sortedByDescending$1
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 69;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                int iOnExtraCallbackWithResult = getFaultAddress.onExtraCallbackWithResult(Long.valueOf(((RouteEntry) t2).onWarmupCompleted()), Long.valueOf(((RouteEntry) t).onWarmupCompleted()));
                int i9 = onWarmupCompleted + 63;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    return iOnExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), resolverOptions);
    }

    public static final <H> BreadcrumbState<H> onNavigationEvent(@NotNull List<RouteEntry<H>> list, @NotNull ResolverOptions resolverOptions, @NotNull String str) {
        String strOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(resolverOptions, "");
            Intrinsics.checkNotNullParameter(str, "");
            Bugsnag.onNavigationEvent.onNavigationEvent(str);
            resolverOptions.onExtraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(resolverOptions, "");
        Intrinsics.checkNotNullParameter(str, "");
        BreadcrumbType breadcrumbTypeOnNavigationEvent = Bugsnag.onNavigationEvent.onNavigationEvent(str);
        if (!resolverOptions.onExtraCallbackWithResult()) {
            strOnExtraCallback = breadcrumbTypeOnNavigationEvent.IAuthTabCallback();
        } else {
            int i3 = onExtraCallbackWithResult + 41;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            strOnExtraCallback = onExtraCallback(breadcrumbTypeOnNavigationEvent.IAuthTabCallback());
            int i5 = onExtraCallbackWithResult + 75;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        for (RouteEntry<H> routeEntry : list) {
            trimMetadataStringsTobugsnag_android_core_release trimmetadatastringstobugsnag_android_core_releaseOnWarmupCompleted = routeEntry.onExtraCallbackWithResult().onWarmupCompleted(strOnExtraCallback);
            if (trimmetadatastringstobugsnag_android_core_releaseOnWarmupCompleted != null) {
                List<addFeatureFlag> listOnExtraCallback = routeEntry.onExtraCallback();
                if (!(listOnExtraCallback instanceof Collection) || !listOnExtraCallback.isEmpty()) {
                    Iterator<T> it = listOnExtraCallback.iterator();
                    while (it.hasNext()) {
                        int i7 = onExtraCallback + 73;
                        onExtraCallbackWithResult = i7 % 128;
                        if (i7 % 2 == 0) {
                            ((addFeatureFlag) it.next()).onWarmupCompleted(breadcrumbTypeOnNavigationEvent.onNavigationEvent());
                            throw null;
                        }
                        if (!((addFeatureFlag) it.next()).onWarmupCompleted(breadcrumbTypeOnNavigationEvent.onNavigationEvent())) {
                            break;
                        }
                    }
                }
                return new BreadcrumbState<>(routeEntry.onNavigationEvent(), new getObserversbugsnag_android_core_release(str, new matchExitInfo(trimmetadatastringstobugsnag_android_core_releaseOnWarmupCompleted.onExtraCallback()), new matchExitInfo(breadcrumbTypeOnNavigationEvent.onNavigationEvent())));
            }
        }
        return null;
    }

    private static final long onWarmupCompleted(logNull lognull, List<? extends addFeatureFlag> list) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        long jOnWarmupCompleted = (lognull.onWarmupCompleted() * 1000) + list.size();
        if (!lognull.IAuthTabCallback()) {
            return jOnWarmupCompleted;
        }
        long j = jOnWarmupCompleted - 1000000;
        int i4 = onExtraCallbackWithResult + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final String onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0 ? str.length() > 1 : str.length() > 1) {
            if (StringsKt__StringsJVMKt.endsWith$default(str, "/", false, 2, null)) {
                int i3 = onExtraCallback + 3;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, "://", 0, false, 6, (Object) null);
                if (iIndexOf$default < 0 || StringsKt__StringsKt.indexOf$default((CharSequence) str, '/', iIndexOf$default + 3, false, 4, (Object) null) != str.length() - 1) {
                    return StringsKt___StringsKt.dropLast(str, 1);
                }
            } else {
                int i5 = onExtraCallbackWithResult + 7;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        return str;
    }

    private static final String onExtraCallback(String str) {
        int i = 2 % 2;
        if (str.length() <= 1) {
            return str;
        }
        int i2 = onExtraCallbackWithResult + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            if (!StringsKt__StringsJVMKt.endsWith$default(str, "/", true, 3, null)) {
                return str;
            }
        } else if (!StringsKt__StringsJVMKt.endsWith$default(str, "/", false, 2, null)) {
            return str;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, "://", 0, false, 6, (Object) null);
        if (iIndexOf$default >= 0) {
            int i3 = onExtraCallbackWithResult + 115;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (StringsKt__StringsKt.indexOf$default((CharSequence) str, '/', iIndexOf$default + 3, false, 4, (Object) null) < 0) {
                return str;
            }
        }
        return StringsKt___StringsKt.dropLast(str, 1);
    }
}
