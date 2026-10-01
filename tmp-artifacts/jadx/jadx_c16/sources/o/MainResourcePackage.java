package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class MainResourcePackage {
    private final String onExtraCallbackWithResult;

    public /* synthetic */ MainResourcePackage(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private MainResourcePackage(String str) {
        this.onExtraCallbackWithResult = str;
    }

    public static final class onExtraCallbackWithResult extends MainResourcePackage {
        private static int asBinder = 1;
        private static int onTransact;
        private final String IAuthTabCallback;
        private final String IAuthTabCallbackStub;
        private final String asInterface;
        private final String onExtraCallback;
        private final boolean onExtraCallbackWithResult;
        private final boolean onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStub)) {
                int i2 = onTransact + 71;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted)) {
                int i4 = asBinder + 119;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback) || !Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback) || !Intrinsics.areEqual(this.asInterface, onextracallbackwithresult.asInterface)) {
                return false;
            }
            if (this.onNavigationEvent == onextracallbackwithresult.onNavigationEvent) {
                return this.onExtraCallbackWithResult == onextracallbackwithresult.onExtraCallbackWithResult;
            }
            int i6 = onTransact + 119;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.IAuthTabCallbackStub.hashCode();
            int iHashCode3 = this.onWarmupCompleted.hashCode();
            String str = this.onExtraCallback;
            int iHashCode4 = 0;
            if (str == null) {
                int i2 = asBinder + 85;
                int i3 = i2 % 128;
                onTransact = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 69;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.IAuthTabCallback;
            if (str2 != null) {
                int i7 = onTransact + 9;
                asBinder = i7 % 128;
                if (i7 % 2 == 0) {
                    str2.hashCode();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                iHashCode4 = str2.hashCode();
            }
            return (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode4) * 31) + this.asInterface.hashCode()) * 31) + Boolean.hashCode(this.onNavigationEvent)) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Row(title=" + this.IAuthTabCallbackStub + ", iconUrl=" + this.onWarmupCompleted + ", description=" + this.onExtraCallback + ", scheme=" + this.IAuthTabCallback + ", type=" + this.asInterface + ", isVisitor=" + this.onNavigationEvent + ", isCompleted=" + this.onExtraCallbackWithResult + ")";
            int i2 = asBinder + 67;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 75;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallbackStub;
            int i5 = i2 + 79;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 25;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i2 + 51;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 90 / 0;
            }
            return str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 115;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i2 + 65;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 9 / 0;
            }
            return str;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = asBinder + 91;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            String str = this.asInterface;
            int i5 = i3 + 13;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onTransact + 93;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            boolean z = this.onNavigationEvent;
            int i5 = i3 + 73;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 27;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onExtraCallbackWithResult;
            int i5 = i2 + 45;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @NotNull String str5, boolean z, boolean z2) {
            super("ROW " + str, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.IAuthTabCallbackStub = str;
            this.onWarmupCompleted = str2;
            this.onExtraCallback = str3;
            this.IAuthTabCallback = str4;
            this.asInterface = str5;
            this.onNavigationEvent = z;
            this.onExtraCallbackWithResult = z2;
        }
    }

    public static final class onNavigationEvent extends MainResourcePackage {
        public static final onNavigationEvent IAuthTabCallback = new onNavigationEvent();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 79;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 43;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                int i6 = i2 + 89;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (!(!(obj instanceof onNavigationEvent))) {
                return true;
            }
            int i8 = i4 + 73;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 119;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 47;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return 195792641;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 69;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return "Divider";
            }
            throw null;
        }

        private onNavigationEvent() {
            super("DIVIDER", null);
        }
    }

    public static final class onWarmupCompleted extends MainResourcePackage {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        private final getMemoryMappingsOrBuilder<String> onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onNavigationEvent, ((onWarmupCompleted) obj).onNavigationEvent)) {
                return true;
            }
            int i3 = onExtraCallback + 123;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getMemoryMappingsOrBuilder<String> getmemorymappingsorbuilder = this.onNavigationEvent;
            if (i3 != 0) {
                return getmemorymappingsorbuilder.hashCode();
            }
            getmemorymappingsorbuilder.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Disclaimers(descriptions=" + this.onNavigationEvent + ")";
            int i2 = IAuthTabCallback + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public final getMemoryMappingsOrBuilder<String> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 43;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            getMemoryMappingsOrBuilder<String> getmemorymappingsorbuilder = this.onNavigationEvent;
            int i5 = i2 + 59;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return getmemorymappingsorbuilder;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull getMemoryMappingsOrBuilder<String> getmemorymappingsorbuilder) {
            super("DISCLAIMERS " + getmemorymappingsorbuilder, null);
            Intrinsics.checkNotNullParameter(getmemorymappingsorbuilder, "");
            this.onNavigationEvent = getmemorymappingsorbuilder;
        }
    }
}
