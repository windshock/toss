package o;

import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0[] $VALUES;
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String errorCode;
    public static final WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0 CatalogNotFoundError = new WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0("CatalogNotFoundError", 0, "CATALOG_NOT_FOUND");
    public static final WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0 UnableToHandleError = new WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0("UnableToHandleError", 1, "UNABLE_TO_HANDLE");

    private static final /* synthetic */ WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0[] $values() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 97;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return new WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0[]{CatalogNotFoundError, UnableToHandleError};
        }
        WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0 = CatalogNotFoundError;
        WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda02 = UnableToHandleError;
        WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0[] windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0Arr = new WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0[2];
        windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0Arr[1] = windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0;
        windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0Arr[1] = windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda02;
        return windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0Arr;
    }

    public static EnumEntries<WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0> getEntries() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0> enumEntries = $ENTRIES;
        if (i4 == 0) {
            int i5 = 32 / 0;
        }
        return enumEntries;
    }

    public static WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0 valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 91;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0 = (WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0) Enum.valueOf(WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0.class, str);
        int i5 = IAuthTabCallback + 35;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0;
    }

    public static WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0[] values() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 49;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0[] windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0Arr = (WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0[]) $VALUES.clone();
        int i5 = onExtraCallback + 69;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0(String str, int i2, String str2) {
        this.errorCode = str2;
    }

    public final String getErrorCode() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 67;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        String str = this.errorCode;
        int i6 = i4 + 111;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    static {
        WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0[] windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0Arr$values = $values();
        $VALUES = windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0Arr$values);
        Companion = new onNavigationEvent(null);
        int i2 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 65 / 0;
        }
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0 onExtraCallbackWithResult(@NotNull String str) {
            Object next;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator it = WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0) next).getErrorCode(), str)) {
                    int i3 = onWarmupCompleted;
                    int i4 = i3 + 121;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = i3 + 63;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    break;
                }
            }
            return (WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda0) next;
        }
    }
}
