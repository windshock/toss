package o;

import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTFullScreenVideoActivity3 implements Comparable<TTFullScreenVideoActivity3> {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final String DIRECTORY_SEPARATOR;
    private final TTBaseLandingPageActivity bytes;

    public TTFullScreenVideoActivity3(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        this.bytes = tTBaseLandingPageActivity;
    }

    public final TTBaseLandingPageActivity onWarmupCompleted() {
        return this.bytes;
    }

    public final TTFullScreenVideoActivity3 IAuthTabCallback(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return TTHistoryLandingPageActivity1.onExtraCallbackWithResult(this, tTFullScreenVideoActivity3, false);
    }

    public static /* synthetic */ TTFullScreenVideoActivity3 onExtraCallback(TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, TTFullScreenVideoActivity3 tTFullScreenVideoActivity32, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return tTFullScreenVideoActivity3.onExtraCallback(tTFullScreenVideoActivity32, z);
    }

    public final TTFullScreenVideoActivity3 onExtraCallback(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return TTHistoryLandingPageActivity1.onExtraCallbackWithResult(this, tTFullScreenVideoActivity3, z);
    }

    public final File asBinder() {
        return new File(toString());
    }

    public final Path sS_() {
        Path path = Paths.get(toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "");
        return path;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public static /* synthetic */ TTFullScreenVideoActivity3 IAuthTabCallback(onExtraCallback onextracallback, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return onextracallback.onNavigationEvent(str, z);
        }

        @JvmStatic
        public final TTFullScreenVideoActivity3 onNavigationEvent(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return TTHistoryLandingPageActivity1.onWarmupCompleted(str, z);
        }

        public static /* synthetic */ TTFullScreenVideoActivity3 onNavigationEvent(onExtraCallback onextracallback, File file, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return onextracallback.onExtraCallbackWithResult(file, z);
        }

        @JvmStatic
        public final TTFullScreenVideoActivity3 onExtraCallbackWithResult(@NotNull File file, boolean z) {
            Intrinsics.checkNotNullParameter(file, "");
            String string = file.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return onNavigationEvent(string, z);
        }

        public static /* synthetic */ TTFullScreenVideoActivity3 sT_(onExtraCallback onextracallback, Path path, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return onextracallback.sU_(path, z);
        }

        @JvmStatic
        public final TTFullScreenVideoActivity3 sU_(@NotNull Path path, boolean z) {
            Intrinsics.checkNotNullParameter(path, "");
            return onNavigationEvent(path.toString(), z);
        }
    }

    static {
        String str = File.separator;
        Intrinsics.checkNotNullExpressionValue(str, "");
        DIRECTORY_SEPARATOR = str;
    }

    public final TTFullScreenVideoActivity3 IAuthTabCallback() {
        int iIAuthTabCallbackDefault = TTHistoryLandingPageActivity1.IAuthTabCallbackDefault(this);
        if (iIAuthTabCallbackDefault == -1) {
            return null;
        }
        return new TTFullScreenVideoActivity3(onWarmupCompleted().onExtraCallbackWithResult(0, iIAuthTabCallbackDefault));
    }

    public final List<TTBaseLandingPageActivity> onExtraCallback() {
        ArrayList arrayList = new ArrayList();
        int iIAuthTabCallbackDefault = TTHistoryLandingPageActivity1.IAuthTabCallbackDefault(this);
        if (iIAuthTabCallbackDefault == -1) {
            iIAuthTabCallbackDefault = 0;
        } else if (iIAuthTabCallbackDefault < onWarmupCompleted().access100() && onWarmupCompleted().onExtraCallbackWithResult(iIAuthTabCallbackDefault) == 92) {
            iIAuthTabCallbackDefault++;
        }
        int iAccess100 = onWarmupCompleted().access100();
        int i = iIAuthTabCallbackDefault;
        while (iIAuthTabCallbackDefault < iAccess100) {
            if (onWarmupCompleted().onExtraCallbackWithResult(iIAuthTabCallbackDefault) == 47 || onWarmupCompleted().onExtraCallbackWithResult(iIAuthTabCallbackDefault) == 92) {
                arrayList.add(onWarmupCompleted().onExtraCallbackWithResult(i, iIAuthTabCallbackDefault));
                i = iIAuthTabCallbackDefault + 1;
            }
            iIAuthTabCallbackDefault++;
        }
        if (i < onWarmupCompleted().access100()) {
            arrayList.add(onWarmupCompleted().onExtraCallbackWithResult(i, onWarmupCompleted().access100()));
        }
        return arrayList;
    }

    public final boolean onExtraCallbackWithResult() {
        return TTHistoryLandingPageActivity1.IAuthTabCallbackDefault(this) != -1;
    }

    public final Character IAuthTabCallbackDefault() {
        if (TTBaseLandingPageActivity.onExtraCallback(onWarmupCompleted(), TTHistoryLandingPageActivity1.onNavigationEvent, 0, 2, null) != -1 || onWarmupCompleted().access100() < 2 || onWarmupCompleted().onExtraCallbackWithResult(1) != 58) {
            return null;
        }
        char cOnExtraCallbackWithResult = (char) onWarmupCompleted().onExtraCallbackWithResult(0);
        if (('a' > cOnExtraCallbackWithResult || cOnExtraCallbackWithResult >= '{') && ('A' > cOnExtraCallbackWithResult || cOnExtraCallbackWithResult >= '[')) {
            return null;
        }
        return Character.valueOf(cOnExtraCallbackWithResult);
    }

    public final TTBaseLandingPageActivity asInterface() {
        int iOnWarmupCompleted = TTHistoryLandingPageActivity1.onWarmupCompleted(this);
        if (iOnWarmupCompleted == -1) {
            return (IAuthTabCallbackDefault() == null || onWarmupCompleted().access100() != 2) ? onWarmupCompleted() : TTBaseLandingPageActivity.EMPTY;
        }
        return (TTBaseLandingPageActivity) TTBaseLandingPageActivity.IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 1563978884, new Object[]{onWarmupCompleted(), Integer.valueOf(iOnWarmupCompleted + 1), 0, 2, null}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -1563978883);
    }

    public final String onNavigationEvent() {
        return asInterface().IAuthTabCallback_Parcel();
    }

    public final TTFullScreenVideoActivity3 IAuthTabCallbackStub() {
        if (Intrinsics.areEqual(onWarmupCompleted(), TTHistoryLandingPageActivity1.IAuthTabCallback) || Intrinsics.areEqual(onWarmupCompleted(), TTHistoryLandingPageActivity1.onNavigationEvent) || Intrinsics.areEqual(onWarmupCompleted(), TTHistoryLandingPageActivity1.onExtraCallbackWithResult) || TTHistoryLandingPageActivity1.asBinder(this)) {
            return null;
        }
        int iOnWarmupCompleted = TTHistoryLandingPageActivity1.onWarmupCompleted(this);
        if (iOnWarmupCompleted != 2 || IAuthTabCallbackDefault() == null) {
            if (iOnWarmupCompleted == 1 && onWarmupCompleted().onNavigationEvent(TTHistoryLandingPageActivity1.onExtraCallbackWithResult)) {
                return null;
            }
            if (iOnWarmupCompleted == -1 && IAuthTabCallbackDefault() != null) {
                if (onWarmupCompleted().access100() == 2) {
                    return null;
                }
                return new TTFullScreenVideoActivity3(TTBaseLandingPageActivity.onExtraCallbackWithResult(onWarmupCompleted(), 0, 2, 1, null));
            }
            if (iOnWarmupCompleted == -1) {
                return new TTFullScreenVideoActivity3(TTHistoryLandingPageActivity1.IAuthTabCallback);
            }
            if (iOnWarmupCompleted == 0) {
                return new TTFullScreenVideoActivity3(TTBaseLandingPageActivity.onExtraCallbackWithResult(onWarmupCompleted(), 0, 1, 1, null));
            }
            return new TTFullScreenVideoActivity3(TTBaseLandingPageActivity.onExtraCallbackWithResult(onWarmupCompleted(), 0, iOnWarmupCompleted, 1, null));
        }
        if (onWarmupCompleted().access100() == 3) {
            return null;
        }
        return new TTFullScreenVideoActivity3(TTBaseLandingPageActivity.onExtraCallbackWithResult(onWarmupCompleted(), 0, 3, 1, null));
    }

    public final TTFullScreenVideoActivity3 onWarmupCompleted(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return TTHistoryLandingPageActivity1.onExtraCallbackWithResult(this, TTHistoryLandingPageActivity1.onExtraCallbackWithResult(new TTBaseActivity().onExtraCallback(str), false), false);
    }

    public final TTFullScreenVideoActivity3 onExtraCallbackWithResult(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        if (!Intrinsics.areEqual(IAuthTabCallback(), tTFullScreenVideoActivity3.IAuthTabCallback())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + tTFullScreenVideoActivity3).toString());
        }
        List<TTBaseLandingPageActivity> listOnExtraCallback = onExtraCallback();
        List<TTBaseLandingPageActivity> listOnExtraCallback2 = tTFullScreenVideoActivity3.onExtraCallback();
        int iMin = Math.min(listOnExtraCallback.size(), listOnExtraCallback2.size());
        int i = 0;
        while (i < iMin && Intrinsics.areEqual(listOnExtraCallback.get(i), listOnExtraCallback2.get(i))) {
            i++;
        }
        if (i != iMin || onWarmupCompleted().access100() != tTFullScreenVideoActivity3.onWarmupCompleted().access100()) {
            if (listOnExtraCallback2.subList(i, listOnExtraCallback2.size()).indexOf(TTHistoryLandingPageActivity1.onWarmupCompleted) == -1) {
                if (Intrinsics.areEqual(tTFullScreenVideoActivity3.onWarmupCompleted(), TTHistoryLandingPageActivity1.IAuthTabCallback)) {
                    return this;
                }
                TTBaseActivity tTBaseActivity = new TTBaseActivity();
                TTBaseLandingPageActivity tTBaseLandingPageActivityIAuthTabCallbackStub = TTHistoryLandingPageActivity1.IAuthTabCallbackStub(tTFullScreenVideoActivity3);
                if (tTBaseLandingPageActivityIAuthTabCallbackStub == null && (tTBaseLandingPageActivityIAuthTabCallbackStub = TTHistoryLandingPageActivity1.IAuthTabCallbackStub(this)) == null) {
                    tTBaseLandingPageActivityIAuthTabCallbackStub = TTHistoryLandingPageActivity1.onWarmupCompleted(DIRECTORY_SEPARATOR);
                }
                int size = listOnExtraCallback2.size();
                for (int i2 = i; i2 < size; i2++) {
                    tTBaseActivity.onExtraCallback(TTHistoryLandingPageActivity1.onWarmupCompleted);
                    tTBaseActivity.onExtraCallback(tTBaseLandingPageActivityIAuthTabCallbackStub);
                }
                int size2 = listOnExtraCallback.size();
                while (i < size2) {
                    tTBaseActivity.onExtraCallback(listOnExtraCallback.get(i));
                    tTBaseActivity.onExtraCallback(tTBaseLandingPageActivityIAuthTabCallbackStub);
                    i++;
                }
                return TTHistoryLandingPageActivity1.onExtraCallbackWithResult(tTBaseActivity, false);
            }
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + tTFullScreenVideoActivity3).toString());
        }
        return onExtraCallback.IAuthTabCallback(Companion, ".", false, 1, null);
    }

    @Override // java.lang.Comparable
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return onWarmupCompleted().onExtraCallbackWithResult(tTFullScreenVideoActivity3.onWarmupCompleted());
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof TTFullScreenVideoActivity3) && Intrinsics.areEqual(((TTFullScreenVideoActivity3) obj).onWarmupCompleted(), onWarmupCompleted());
    }

    public int hashCode() {
        return onWarmupCompleted().hashCode();
    }

    public String toString() {
        return onWarmupCompleted().IAuthTabCallback_Parcel();
    }
}
