package o;

import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.securities.core.router.spec.SavedNavEntry;
import im.toss.securities.core.router.spec.TossSecRoute;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import o.adInfo;
import o.qExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class qExternalSyntheticLambda1 {
    private static final wie2 IAuthTabCallback = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.securities.core.router.spec.TossSecNavigationStateSaverKt$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = qExternalSyntheticLambda1.onWarmupCompleted((adInfo) obj);
            int i4 = IAuthTabCallback + 33;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitOnWarmupCompleted;
        }
    }, 1, (Object) null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Unit onWarmupCompleted(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(adinfo);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(adinfo);
        int i3 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = onExtraCallback + 33;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 15 / 0;
        }
    }

    private static final Unit onExtraCallback(adInfo adinfo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(adinfo, "");
        adinfo.IAuthTabCallback(true);
        hfzb hfzbVar = new hfzb();
        Object obj = null;
        HomeWatcherReceiverycx homeWatcherReceiverycx = new HomeWatcherReceiverycx(Reflection.getOrCreateKotlinClass(TossSecRoute.class), (KSerializer) null);
        homeWatcherReceiverycx.IAuthTabCallback(Reflection.getOrCreateKotlinClass(TossSecRoute.EarningCallDetail.class), TossSecRoute.EarningCallDetail.Companion.serializer());
        homeWatcherReceiverycx.onNavigationEvent(hfzbVar);
        adinfo.onNavigationEvent(hfzbVar.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean IAuthTabCallback(@NotNull qExternalSyntheticLambda0 qexternalsyntheticlambda0, @NotNull String str) {
        Iterator it;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(qexternalsyntheticlambda0, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            wie2 wie2Var = IAuthTabCallback;
            wie2Var.onExtraCallback();
            List list = (List) wie2Var.onExtraCallback(new checkCanOpenLandingPage(SavedNavEntry.Companion.serializer()), str);
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                int i3 = onExtraCallbackWithResult + 67;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                while (it2.hasNext()) {
                    int i5 = onNavigationEvent + 51;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 82 / 0;
                        if (!(((SavedNavEntry) it2.next()).IAuthTabCallbackStub() instanceof TossSecRoute.Loading)) {
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            it = list.iterator();
                            i = onNavigationEvent + 27;
                            onExtraCallbackWithResult = i % 128;
                            if (i % 2 != 0) {
                                int i7 = 4 / 5;
                            }
                            while (it.hasNext()) {
                                int i8 = onExtraCallbackWithResult + 59;
                                onNavigationEvent = i8 % 128;
                                if (i8 % 2 == 0) {
                                    SavedNavEntry savedNavEntry = (SavedNavEntry) it.next();
                                    savedNavEntry.IAuthTabCallbackStub();
                                    savedNavEntry.onExtraCallbackWithResult();
                                    savedNavEntry.onWarmupCompleted();
                                    int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
                                    throw null;
                                }
                                SavedNavEntry savedNavEntry2 = (SavedNavEntry) it.next();
                                TossSecRoute tossSecRouteIAuthTabCallbackStub = savedNavEntry2.IAuthTabCallbackStub();
                                String strOnExtraCallbackWithResult = savedNavEntry2.onExtraCallbackWithResult();
                                List<Pair<String, String>> listOnWarmupCompleted = savedNavEntry2.onWarmupCompleted();
                                int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
                                String string = (String) SavedNavEntry.onWarmupCompleted(TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -321329375, iOnExtraCallbackWithResult2, new Object[]{savedNavEntry2}, 321329375, TTVideoLandingPageActivity.onExtraCallbackWithResult());
                                if (string == null) {
                                    string = UUID.randomUUID().toString();
                                    Intrinsics.checkNotNullExpressionValue(string, "");
                                }
                                arrayList.add(new setTermsOfServiceUri(tossSecRouteIAuthTabCallbackStub, strOnExtraCallbackWithResult, listOnWarmupCompleted, string));
                            }
                            qexternalsyntheticlambda0.IAuthTabCallback().clear();
                            qexternalsyntheticlambda0.IAuthTabCallback().addAll(arrayList);
                            return true;
                        }
                    } else if (!(((SavedNavEntry) it2.next()).IAuthTabCallbackStub() instanceof TossSecRoute.Loading)) {
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        it = list.iterator();
                        i = onNavigationEvent + 27;
                        onExtraCallbackWithResult = i % 128;
                        if (i % 2 != 0) {
                        }
                        while (it.hasNext()) {
                        }
                        qexternalsyntheticlambda0.IAuthTabCallback().clear();
                        qexternalsyntheticlambda0.IAuthTabCallback().addAll(arrayList2);
                        return true;
                    }
                }
            }
        } catch (qn | IllegalArgumentException unused) {
        }
        return false;
    }

    public static final String onExtraCallback(@NotNull qExternalSyntheticLambda0 qexternalsyntheticlambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(qexternalsyntheticlambda0, "");
        try {
            LiveDataObservableExternalSyntheticLambda1<setTermsOfServiceUri> liveDataObservableExternalSyntheticLambda1IAuthTabCallback = qexternalsyntheticlambda0.IAuthTabCallback();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(liveDataObservableExternalSyntheticLambda1IAuthTabCallback, 10));
            for (setTermsOfServiceUri settermsofserviceuri : liveDataObservableExternalSyntheticLambda1IAuthTabCallback) {
                arrayList.add(new SavedNavEntry(settermsofserviceuri.IAuthTabCallback(), settermsofserviceuri.onExtraCallback(), settermsofserviceuri.onNavigationEvent(), settermsofserviceuri.onExtraCallbackWithResult()));
            }
            wie2 wie2Var = IAuthTabCallback;
            wie2Var.onExtraCallback();
            String strOnWarmupCompleted = wie2Var.onWarmupCompleted(new checkCanOpenLandingPage(SavedNavEntry.Companion.serializer()), arrayList);
            int i2 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return strOnWarmupCompleted;
        } catch (qn unused) {
            return null;
        }
    }
}
