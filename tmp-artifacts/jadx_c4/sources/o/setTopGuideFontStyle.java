package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.fromDescriptorbugsnag_android_core_release;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class setTopGuideFontStyle {
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface = 0;
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final String IAuthTabCallback;
    private final String onExtraCallbackWithResult;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final Map<String, String> onNavigationEvent = new LinkedHashMap();

    public static final class IAuthTabCallback extends setTopGuideFontStyle {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallback(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = onNavigationEvent + 3;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 111;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str2 = "TossApp";
            }
            this(str, str2, str3);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            fromDescriptorbugsnag_android_core_release.onExtraCallbackWithResult onextracallbackwithresult = fromDescriptorbugsnag_android_core_release.Companion;
            super(str2, str + " (" + str3 + "; " + onextracallbackwithresult.IAuthTabCallback() + "; " + onextracallbackwithresult.onExtraCallbackWithResult() + ";)");
        }
    }

    public setTopGuideFontStyle(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onExtraCallbackWithResult = str;
        this.IAuthTabCallback = str2;
        onNavigationEvent.put(str, str2);
    }

    public static final /* synthetic */ Map onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 61;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Map<String, String> map = onNavigationEvent;
        int i5 = i2 + 69;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 111;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i2 + 57;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final class onWarmupCompleted extends setTopGuideFontStyle {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull String str) {
            super("TossColorPreference", str);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class onExtraCallbackWithResult extends setTopGuideFontStyle {
        public onExtraCallbackWithResult(int i) {
            super("TossFontScale", String.valueOf(i));
        }
    }

    public static final class IAuthTabCallbackDefault extends setTopGuideFontStyle {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public IAuthTabCallbackDefault() {
            this(0, 0, 0, 0, 15, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallbackDefault(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            i = (i5 & 1) != 0 ? 0 : i;
            if ((i5 & 2) != 0) {
                int i6 = IAuthTabCallback + 53;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
                i2 = 0;
            }
            if ((i5 & 4) != 0) {
                int i8 = onExtraCallback + 61;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                i3 = 0;
            }
            if ((i5 & 8) != 0) {
                int i10 = IAuthTabCallback + 29;
                onExtraCallback = i10 % 128;
                i4 = (i10 % 2 != 0 ? 1 : 0) ^ 1;
                int i11 = 2 % 2;
            }
            this(i, i2, i3, i4);
        }

        public IAuthTabCallbackDefault(int i, int i2, int i3, int i4) {
            super("TossSafeArea", (i + i3) + ",0," + (i2 + i4) + ",0");
        }
    }

    public static final class onTransact extends setTopGuideFontStyle {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        /* JADX WARN: Illegal instructions before constructor call */
        public onTransact() {
            int i = 0;
            this(i, i, 3, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onTransact(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i3 & 1) != 0) {
                int i4 = onNavigationEvent + 73;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                i = 0;
            }
            if ((i3 & 2) != 0) {
                int i7 = onExtraCallbackWithResult + 65;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                i2 = 0;
            }
            this(i, i2);
        }

        public onTransact(int i, int i2) {
            super("TossPureSafeArea", i + ",0," + i2 + ",0");
        }
    }

    public static final class getInterfaceDescriptor extends setTopGuideFontStyle {
        public getInterfaceDescriptor(int i) {
            super("TossTopNavigationTopInset", String.valueOf(i));
        }
    }

    public static final class IAuthTabCallbackStub extends setTopGuideFontStyle {
        public IAuthTabCallbackStub(int i) {
            super("TossTopNavigationHeight", String.valueOf(i));
        }
    }

    public static final class onExtraCallback extends setTopGuideFontStyle {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull String str) {
            super("TossNavbarPreference", str);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class asBinder extends setTopGuideFontStyle {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(@NotNull String str) {
            super("TossSafeAreaBottomTransparency", str);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class access100 extends setTopGuideFontStyle {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public access100(@NotNull String str) {
            super("TossLocale", str);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class IAuthTabCallbackStubProxy extends setTopGuideFontStyle {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStubProxy(@NotNull String str) {
            super("TossTraceId", str);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public String toString() {
        int i = 2 % 2;
        String str = this.onExtraCallbackWithResult + "/" + this.IAuthTabCallback;
        int i2 = IAuthTabCallbackDefault + 43;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class onNavigationEvent {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final Map<String, String> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Map<String, String> mapOnNavigationEvent = setTopGuideFontStyle.onNavigationEvent();
            if (i3 != 0) {
                int i4 = 85 / 0;
            }
            return mapOnNavigationEvent;
        }
    }

    static {
        int i = onWarmupCompleted + 3;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
