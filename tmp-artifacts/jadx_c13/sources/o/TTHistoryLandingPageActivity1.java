package o;

import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.TTBaseLandingPageActivity;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTHistoryLandingPageActivity1 {
    private static final TTBaseLandingPageActivity IAuthTabCallback;
    private static final TTBaseLandingPageActivity onExtraCallback;
    private static final TTBaseLandingPageActivity onExtraCallbackWithResult;
    private static final TTBaseLandingPageActivity onNavigationEvent;
    private static final TTBaseLandingPageActivity onWarmupCompleted;

    static {
        TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback = TTBaseLandingPageActivity.Companion;
        onNavigationEvent = iAuthTabCallback.IAuthTabCallback("/");
        onExtraCallbackWithResult = iAuthTabCallback.IAuthTabCallback("\\");
        onExtraCallback = iAuthTabCallback.IAuthTabCallback("/\\");
        IAuthTabCallback = iAuthTabCallback.IAuthTabCallback(".");
        onWarmupCompleted = iAuthTabCallback.IAuthTabCallback("..");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int IAuthTabCallbackDefault(TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        if (tTFullScreenVideoActivity3.onWarmupCompleted().access100() == 0) {
            return -1;
        }
        if (tTFullScreenVideoActivity3.onWarmupCompleted().onExtraCallbackWithResult(0) == 47) {
            return 1;
        }
        if (tTFullScreenVideoActivity3.onWarmupCompleted().onExtraCallbackWithResult(0) == 92) {
            if (tTFullScreenVideoActivity3.onWarmupCompleted().access100() <= 2 || tTFullScreenVideoActivity3.onWarmupCompleted().onExtraCallbackWithResult(1) != 92) {
                return 1;
            }
            int iOnWarmupCompleted = tTFullScreenVideoActivity3.onWarmupCompleted().onWarmupCompleted(onExtraCallbackWithResult, 2);
            return iOnWarmupCompleted == -1 ? tTFullScreenVideoActivity3.onWarmupCompleted().access100() : iOnWarmupCompleted;
        }
        if (tTFullScreenVideoActivity3.onWarmupCompleted().access100() > 2 && tTFullScreenVideoActivity3.onWarmupCompleted().onExtraCallbackWithResult(1) == 58 && tTFullScreenVideoActivity3.onWarmupCompleted().onExtraCallbackWithResult(2) == 92) {
            char cOnExtraCallbackWithResult = (char) tTFullScreenVideoActivity3.onWarmupCompleted().onExtraCallbackWithResult(0);
            if ('a' <= cOnExtraCallbackWithResult && cOnExtraCallbackWithResult < '{') {
                return 3;
            }
            if ('A' <= cOnExtraCallbackWithResult && cOnExtraCallbackWithResult < '[') {
                return 3;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onWarmupCompleted(TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        int iIAuthTabCallback = TTBaseLandingPageActivity.IAuthTabCallback(tTFullScreenVideoActivity3.onWarmupCompleted(), onNavigationEvent, 0, 2, null);
        return iIAuthTabCallback != -1 ? iIAuthTabCallback : TTBaseLandingPageActivity.IAuthTabCallback(tTFullScreenVideoActivity3.onWarmupCompleted(), onExtraCallbackWithResult, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBinder(TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        return ((Boolean) TTBaseLandingPageActivity.IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -1770740459, new Object[]{tTFullScreenVideoActivity3.onWarmupCompleted(), onWarmupCompleted}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 1770740461)).booleanValue() && (tTFullScreenVideoActivity3.onWarmupCompleted().access100() == 2 || tTFullScreenVideoActivity3.onWarmupCompleted().onExtraCallbackWithResult(tTFullScreenVideoActivity3.onWarmupCompleted().access100() + (-3), onNavigationEvent, 0, 1) || tTFullScreenVideoActivity3.onWarmupCompleted().onExtraCallbackWithResult(tTFullScreenVideoActivity3.onWarmupCompleted().access100() + (-3), onExtraCallbackWithResult, 0, 1));
    }

    public static final TTFullScreenVideoActivity3 onExtraCallbackWithResult(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity32, boolean z) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity32, "");
        if (tTFullScreenVideoActivity32.onExtraCallbackWithResult() || tTFullScreenVideoActivity32.IAuthTabCallbackDefault() != null) {
            return tTFullScreenVideoActivity32;
        }
        TTBaseLandingPageActivity tTBaseLandingPageActivityIAuthTabCallbackStub = IAuthTabCallbackStub(tTFullScreenVideoActivity3);
        if (tTBaseLandingPageActivityIAuthTabCallbackStub == null && (tTBaseLandingPageActivityIAuthTabCallbackStub = IAuthTabCallbackStub(tTFullScreenVideoActivity32)) == null) {
            tTBaseLandingPageActivityIAuthTabCallbackStub = onWarmupCompleted(TTFullScreenVideoActivity3.DIRECTORY_SEPARATOR);
        }
        TTBaseActivity tTBaseActivity = new TTBaseActivity();
        tTBaseActivity.onExtraCallback(tTFullScreenVideoActivity3.onWarmupCompleted());
        if (tTBaseActivity.ICustomTabsCallbackDefault() > 0) {
            tTBaseActivity.onExtraCallback(tTBaseLandingPageActivityIAuthTabCallbackStub);
        }
        tTBaseActivity.onExtraCallback(tTFullScreenVideoActivity32.onWarmupCompleted());
        return onExtraCallbackWithResult(tTBaseActivity, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TTBaseLandingPageActivity IAuthTabCallbackStub(TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        TTBaseLandingPageActivity tTBaseLandingPageActivityOnWarmupCompleted = tTFullScreenVideoActivity3.onWarmupCompleted();
        TTBaseLandingPageActivity tTBaseLandingPageActivity = onNavigationEvent;
        if (TTBaseLandingPageActivity.onExtraCallback(tTBaseLandingPageActivityOnWarmupCompleted, tTBaseLandingPageActivity, 0, 2, null) != -1) {
            return tTBaseLandingPageActivity;
        }
        TTBaseLandingPageActivity tTBaseLandingPageActivityOnWarmupCompleted2 = tTFullScreenVideoActivity3.onWarmupCompleted();
        TTBaseLandingPageActivity tTBaseLandingPageActivity2 = onExtraCallbackWithResult;
        if (TTBaseLandingPageActivity.onExtraCallback(tTBaseLandingPageActivityOnWarmupCompleted2, tTBaseLandingPageActivity2, 0, 2, null) != -1) {
            return tTBaseLandingPageActivity2;
        }
        return null;
    }

    public static final TTFullScreenVideoActivity3 onWarmupCompleted(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return onExtraCallbackWithResult(new TTBaseActivity().onExtraCallback(str), z);
    }

    public static final TTFullScreenVideoActivity3 onExtraCallbackWithResult(@NotNull TTBaseActivity tTBaseActivity, boolean z) throws EOFException {
        TTBaseLandingPageActivity tTBaseLandingPageActivity;
        TTBaseLandingPageActivity tTBaseLandingPageActivityOnNavigationEvent;
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        TTBaseActivity tTBaseActivity2 = new TTBaseActivity();
        TTBaseLandingPageActivity tTBaseLandingPageActivityOnExtraCallback = null;
        int i = 0;
        while (true) {
            if (!tTBaseActivity.onNavigationEvent(0L, onNavigationEvent)) {
                tTBaseLandingPageActivity = onExtraCallbackWithResult;
                if (!tTBaseActivity.onNavigationEvent(0L, tTBaseLandingPageActivity)) {
                    break;
                }
            }
            byte bICustomTabsCallback = tTBaseActivity.ICustomTabsCallback();
            if (tTBaseLandingPageActivityOnExtraCallback == null) {
                tTBaseLandingPageActivityOnExtraCallback = onExtraCallback(bICustomTabsCallback);
            }
            i++;
        }
        boolean z2 = i >= 2 && Intrinsics.areEqual(tTBaseLandingPageActivityOnExtraCallback, tTBaseLandingPageActivity);
        if (z2) {
            Intrinsics.checkNotNull(tTBaseLandingPageActivityOnExtraCallback);
            tTBaseActivity2.onExtraCallback(tTBaseLandingPageActivityOnExtraCallback);
            tTBaseActivity2.onExtraCallback(tTBaseLandingPageActivityOnExtraCallback);
        } else if (i > 0) {
            Intrinsics.checkNotNull(tTBaseLandingPageActivityOnExtraCallback);
            tTBaseActivity2.onExtraCallback(tTBaseLandingPageActivityOnExtraCallback);
        } else {
            long jOnExtraCallbackWithResult = tTBaseActivity.onExtraCallbackWithResult(onExtraCallback);
            if (tTBaseLandingPageActivityOnExtraCallback == null) {
                if (jOnExtraCallbackWithResult == -1) {
                    tTBaseLandingPageActivityOnExtraCallback = onWarmupCompleted(TTFullScreenVideoActivity3.DIRECTORY_SEPARATOR);
                } else {
                    tTBaseLandingPageActivityOnExtraCallback = onExtraCallback(tTBaseActivity.onExtraCallbackWithResult(jOnExtraCallbackWithResult));
                }
            }
            if (onExtraCallback(tTBaseActivity, tTBaseLandingPageActivityOnExtraCallback)) {
                if (jOnExtraCallbackWithResult == 2) {
                    tTBaseActivity2.write(tTBaseActivity, 3L);
                } else {
                    tTBaseActivity2.write(tTBaseActivity, 2L);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        boolean z3 = tTBaseActivity2.ICustomTabsCallbackDefault() > 0;
        ArrayList arrayList = new ArrayList();
        while (!tTBaseActivity.IAuthTabCallback_Parcel()) {
            long jOnExtraCallbackWithResult2 = tTBaseActivity.onExtraCallbackWithResult(onExtraCallback);
            if (jOnExtraCallbackWithResult2 == -1) {
                tTBaseLandingPageActivityOnNavigationEvent = tTBaseActivity.writeTypedObject();
            } else {
                tTBaseLandingPageActivityOnNavigationEvent = tTBaseActivity.onNavigationEvent(jOnExtraCallbackWithResult2);
                tTBaseActivity.ICustomTabsCallback();
            }
            TTBaseLandingPageActivity tTBaseLandingPageActivity2 = onWarmupCompleted;
            if (Intrinsics.areEqual(tTBaseLandingPageActivityOnNavigationEvent, tTBaseLandingPageActivity2)) {
                if (!z3 || !arrayList.isEmpty()) {
                    if (!z || (!z3 && (arrayList.isEmpty() || Intrinsics.areEqual(CollectionsKt___CollectionsKt.last((List) arrayList), tTBaseLandingPageActivity2)))) {
                        arrayList.add(tTBaseLandingPageActivityOnNavigationEvent);
                    } else if (!z2 || arrayList.size() != 1) {
                        CollectionsKt__MutableCollectionsKt.removeLastOrNull(arrayList);
                    }
                }
            } else if (!Intrinsics.areEqual(tTBaseLandingPageActivityOnNavigationEvent, IAuthTabCallback) && !Intrinsics.areEqual(tTBaseLandingPageActivityOnNavigationEvent, TTBaseLandingPageActivity.EMPTY)) {
                arrayList.add(tTBaseLandingPageActivityOnNavigationEvent);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                tTBaseActivity2.onExtraCallback(tTBaseLandingPageActivityOnExtraCallback);
            }
            tTBaseActivity2.onExtraCallback((TTBaseLandingPageActivity) arrayList.get(i2));
        }
        if (tTBaseActivity2.ICustomTabsCallbackDefault() == 0) {
            tTBaseActivity2.onExtraCallback(IAuthTabCallback);
        }
        return new TTFullScreenVideoActivity3(tTBaseActivity2.writeTypedObject());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TTBaseLandingPageActivity onWarmupCompleted(String str) {
        if (Intrinsics.areEqual(str, "/")) {
            return onNavigationEvent;
        }
        if (Intrinsics.areEqual(str, "\\")) {
            return onExtraCallbackWithResult;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }

    private static final TTBaseLandingPageActivity onExtraCallback(byte b) {
        if (b == 47) {
            return onNavigationEvent;
        }
        if (b == 92) {
            return onExtraCallbackWithResult;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b));
    }

    private static final boolean onExtraCallback(TTBaseActivity tTBaseActivity, TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        if (!Intrinsics.areEqual(tTBaseLandingPageActivity, onExtraCallbackWithResult) || tTBaseActivity.ICustomTabsCallbackDefault() < 2 || tTBaseActivity.onExtraCallbackWithResult(1L) != 58) {
            return false;
        }
        char cOnExtraCallbackWithResult = (char) tTBaseActivity.onExtraCallbackWithResult(0L);
        if ('a' > cOnExtraCallbackWithResult || cOnExtraCallbackWithResult >= '{') {
            return 'A' <= cOnExtraCallbackWithResult && cOnExtraCallbackWithResult < '[';
        }
        return true;
    }
}
