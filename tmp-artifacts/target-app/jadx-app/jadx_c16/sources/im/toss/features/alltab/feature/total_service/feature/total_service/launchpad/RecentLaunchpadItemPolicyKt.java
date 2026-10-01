package im.toss.features.alltab.feature.total_service.feature.total_service.launchpad;

import im.toss.features.alltab.feature.total_service.feature.common.random_miniapp.RandomMiniAppRecommendationState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.NavigationBarCapsuleTheme;
import o.TabBarModel;
import o.generateTabBarColorModel;
import o.getUrl;
import o.setName;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RecentLaunchpadItemPolicyKt {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:107:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138 A[PHI: r13 r14
      0x0138: PHI (r13v10 java.lang.Object) = (r13v9 java.lang.Object), (r13v12 java.lang.Object) binds: [B:56:0x0136, B:53:0x012a] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r14v5 o.NavigationBarCapsuleTheme) = (r14v4 o.NavigationBarCapsuleTheme), (r14v7 o.NavigationBarCapsuleTheme) binds: [B:56:0x0136, B:53:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015c A[PHI: r13
      0x015c: PHI (r13v11 java.lang.Object) = (r13v9 java.lang.Object), (r13v10 java.lang.Object), (r13v10 java.lang.Object), (r13v12 java.lang.Object) binds: [B:56:0x0136, B:58:0x013a, B:63:0x0158, B:53:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final TabBarModel onExtraCallbackWithResult(@NotNull TabBarModel tabBarModel, @NotNull NavigationBarCapsuleTheme.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult, @NotNull Set<Integer> set) {
        Object objPrevious;
        Iterator it;
        Object next;
        NavigationBarCapsuleTheme navigationBarCapsuleTheme;
        NavigationBarCapsuleTheme.onExtraCallback onextracallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tabBarModel, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(set, "");
        List listOnWarmupCompleted = tabBarModel.onWarmupCompleted();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnWarmupCompleted, 10));
        Iterator it2 = listOnWarmupCompleted.iterator();
        int i2 = 0;
        boolean z = false;
        while (!(!it2.hasNext())) {
            generateTabBarColorModel.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = (generateTabBarColorModel) it2.next();
            if (onextracallbackwithresultOnExtraCallback instanceof generateTabBarColorModel.onExtraCallbackWithResult) {
                generateTabBarColorModel.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresultOnExtraCallback;
                if (onextracallbackwithresult2.onNavigationEvent()) {
                    List listIAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = listIAuthTabCallback.iterator();
                    while (it3.hasNext()) {
                        int i3 = onWarmupCompleted + 65;
                        IAuthTabCallback = i3 % 128;
                        if (i3 % 2 != 0) {
                            boolean z2 = it3.next() instanceof NavigationBarCapsuleTheme.onExtraCallback;
                            throw null;
                        }
                        Object next2 = it3.next();
                        if (next2 instanceof NavigationBarCapsuleTheme.onExtraCallback) {
                            arrayList2.add(next2);
                        }
                    }
                    ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        int i4 = onWarmupCompleted + 7;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        objPrevious = listIterator.previous();
                        if (!(((NavigationBarCapsuleTheme.onExtraCallback) objPrevious) instanceof NavigationBarCapsuleTheme.onExtraCallback.asInterface)) {
                            break;
                        }
                    }
                    NavigationBarCapsuleTheme navigationBarCapsuleTheme2 = (NavigationBarCapsuleTheme.onExtraCallback) objPrevious;
                    if (navigationBarCapsuleTheme2 == null || !set.contains(Integer.valueOf(arrayList2.size()))) {
                        navigationBarCapsuleTheme2 = null;
                        List listIAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                        ArrayList arrayList3 = new ArrayList();
                        it = listIAuthTabCallback2.iterator();
                        while (it.hasNext()) {
                            int i6 = IAuthTabCallback + 49;
                            onWarmupCompleted = i6 % 128;
                            if (i6 % 2 == 0) {
                                next = it.next();
                                navigationBarCapsuleTheme = (NavigationBarCapsuleTheme) next;
                                int i7 = 59 / 0;
                                if (navigationBarCapsuleTheme instanceof NavigationBarCapsuleTheme.onExtraCallback) {
                                    if (navigationBarCapsuleTheme instanceof NavigationBarCapsuleTheme.onExtraCallback.asInterface) {
                                        arrayList3.add(next);
                                    } else if (Intrinsics.areEqual(((NavigationBarCapsuleTheme.onExtraCallback) navigationBarCapsuleTheme).onExtraCallbackWithResult(), onextracallbackwithresult.onExtraCallbackWithResult())) {
                                        continue;
                                    } else {
                                        int i8 = IAuthTabCallback + 63;
                                        onWarmupCompleted = i8 % 128;
                                        if (i8 % 2 == 0) {
                                            throw null;
                                        }
                                        if (navigationBarCapsuleTheme != navigationBarCapsuleTheme2) {
                                        }
                                    }
                                }
                            } else {
                                next = it.next();
                                navigationBarCapsuleTheme = (NavigationBarCapsuleTheme) next;
                                if (navigationBarCapsuleTheme instanceof NavigationBarCapsuleTheme.onExtraCallback) {
                                }
                            }
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : arrayList3) {
                            if (obj instanceof NavigationBarCapsuleTheme.onExtraCallback.asInterface) {
                                int i9 = onWarmupCompleted + 21;
                                IAuthTabCallback = i9 % 128;
                                if (i9 % 2 != 0) {
                                    arrayList4.add(obj);
                                    throw null;
                                }
                                arrayList4.add(obj);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj2 : arrayList3) {
                            if (!(((NavigationBarCapsuleTheme) obj2) instanceof NavigationBarCapsuleTheme.onExtraCallback.asInterface)) {
                                arrayList5.add(obj2);
                            }
                        }
                        onextracallbackwithresultOnExtraCallback = generateTabBarColorModel.onExtraCallbackWithResult.onExtraCallback(onextracallbackwithresult2, (String) null, (getUrl) null, CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.listOf(onextracallbackwithresult), arrayList5), arrayList4), false, 11, (Object) null);
                        z = true;
                    } else {
                        if (!arrayList2.isEmpty()) {
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                int i10 = IAuthTabCallback + 15;
                                onWarmupCompleted = i10 % 128;
                                if (i10 % 2 == 0) {
                                    onextracallback = (NavigationBarCapsuleTheme.onExtraCallback) it4.next();
                                    int i11 = 74 / i2;
                                    if (!(onextracallback instanceof NavigationBarCapsuleTheme.onExtraCallback.asInterface)) {
                                        if (!Intrinsics.areEqual(onextracallback.onExtraCallbackWithResult(), onextracallbackwithresult.onExtraCallbackWithResult())) {
                                            int i12 = onWarmupCompleted + 59;
                                            IAuthTabCallback = i12 % 128;
                                            int i13 = i12 % 2;
                                            navigationBarCapsuleTheme2 = null;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    onextracallback = (NavigationBarCapsuleTheme.onExtraCallback) it4.next();
                                    if (onextracallback instanceof NavigationBarCapsuleTheme.onExtraCallback.asInterface) {
                                        continue;
                                    } else if (!Intrinsics.areEqual(onextracallback.onExtraCallbackWithResult(), onextracallbackwithresult.onExtraCallbackWithResult())) {
                                    }
                                }
                            }
                        }
                        List listIAuthTabCallback22 = onextracallbackwithresult2.IAuthTabCallback();
                        ArrayList arrayList32 = new ArrayList();
                        it = listIAuthTabCallback22.iterator();
                        while (it.hasNext()) {
                        }
                        ArrayList arrayList42 = new ArrayList();
                        while (r7.hasNext()) {
                        }
                        ArrayList arrayList52 = new ArrayList();
                        while (r8.hasNext()) {
                        }
                        onextracallbackwithresultOnExtraCallback = generateTabBarColorModel.onExtraCallbackWithResult.onExtraCallback(onextracallbackwithresult2, (String) null, (getUrl) null, CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.listOf(onextracallbackwithresult), arrayList52), arrayList42), false, 11, (Object) null);
                        z = true;
                    }
                } else {
                    continue;
                }
            }
            arrayList.add(onextracallbackwithresultOnExtraCallback);
            i2 = 0;
        }
        return z ? TabBarModel.onNavigationEvent(tabBarModel, false, (String) null, arrayList, 0L, (setName) null, (RandomMiniAppRecommendationState) null, 59, (Object) null) : tabBarModel;
    }
}
