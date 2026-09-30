package o;

import android.net.Uri;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_retryOnConnectionFailure {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ deprecated_retryOnConnectionFailure[] $VALUES;
    private static final EnumEntries<deprecated_retryOnConnectionFailure> ALL;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    public static final deprecated_retryOnConnectionFailure TEXT = new deprecated_retryOnConnectionFailure("TEXT", 0);
    public static final deprecated_retryOnConnectionFailure LINK = new deprecated_retryOnConnectionFailure("LINK", 1);
    public static final deprecated_retryOnConnectionFailure IMAGE = new deprecated_retryOnConnectionFailure("IMAGE", 2);
    public static final deprecated_retryOnConnectionFailure IMAGE_WITH_TEXT = new deprecated_retryOnConnectionFailure("IMAGE_WITH_TEXT", 3);
    public static final deprecated_retryOnConnectionFailure IMAGE_WITH_LINK = new deprecated_retryOnConnectionFailure("IMAGE_WITH_LINK", 4);

    private static final /* synthetic */ deprecated_retryOnConnectionFailure[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        deprecated_retryOnConnectionFailure[] deprecated_retryonconnectionfailureArr = {TEXT, LINK, IMAGE, IMAGE_WITH_TEXT, IMAGE_WITH_LINK};
        int i5 = i3 + 111;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return deprecated_retryonconnectionfailureArr;
    }

    public static EnumEntries<deprecated_retryOnConnectionFailure> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 95;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<deprecated_retryOnConnectionFailure> enumEntries = $ENTRIES;
        int i5 = i2 + 101;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static deprecated_retryOnConnectionFailure valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        deprecated_retryOnConnectionFailure deprecated_retryonconnectionfailure = (deprecated_retryOnConnectionFailure) Enum.valueOf(deprecated_retryOnConnectionFailure.class, str);
        if (i3 != 0) {
            return deprecated_retryonconnectionfailure;
        }
        throw null;
    }

    public static deprecated_retryOnConnectionFailure[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        deprecated_retryOnConnectionFailure[] deprecated_retryonconnectionfailureArr = (deprecated_retryOnConnectionFailure[]) $VALUES.clone();
        int i3 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return deprecated_retryonconnectionfailureArr;
    }

    private deprecated_retryOnConnectionFailure(String str, int i) {
    }

    public static final /* synthetic */ EnumEntries access$getALL$cp() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<deprecated_retryOnConnectionFailure> enumEntries = ALL;
        int i5 = i3 + 47;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    static {
        deprecated_retryOnConnectionFailure[] deprecated_retryonconnectionfailureArr$values = $values();
        $VALUES = deprecated_retryonconnectionfailureArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(deprecated_retryonconnectionfailureArr$values);
        Companion = new onWarmupCompleted(null);
        ALL = getEntries();
        int i = onExtraCallback + 57;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final EnumEntries<deprecated_retryOnConnectionFailure> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<deprecated_retryOnConnectionFailure> enumEntriesAccess$getALL$cp = deprecated_retryOnConnectionFailure.access$getALL$cp();
            int i4 = IAuthTabCallback + 95;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return enumEntriesAccess$getALL$cp;
            }
            throw null;
        }

        public final deprecated_retryOnConnectionFailure onWarmupCompleted(@Nullable String str, @Nullable Uri uri) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (uri == null) {
                Intrinsics.checkNotNull(str);
                return deprecated_pingIntervalMillis.IAuthTabCallback(str) ? deprecated_retryOnConnectionFailure.LINK : deprecated_retryOnConnectionFailure.TEXT;
            }
            if (str != null) {
                if (!deprecated_pingIntervalMillis.IAuthTabCallback(str)) {
                    return deprecated_retryOnConnectionFailure.IMAGE_WITH_TEXT;
                }
                int i4 = IAuthTabCallback + 67;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return deprecated_retryOnConnectionFailure.IMAGE_WITH_LINK;
            }
            return deprecated_retryOnConnectionFailure.IMAGE;
        }
    }
}
