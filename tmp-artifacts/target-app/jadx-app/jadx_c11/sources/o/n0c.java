package o;

import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class n0c {
    public /* synthetic */ n0c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract MaxNativeAdImpl onExtraCallbackWithResult();

    private n0c() {
    }

    public static final class onExtraCallbackWithResult extends n0c {
        private static int IAuthTabCallbackStubProxy = 0;
        private static int access100 = 1;
        private final String IAuthTabCallback;
        private final MaxNativeAdImpl IAuthTabCallbackDefault;
        private final Integer IAuthTabCallbackStub;
        private final n0b access000;
        private final Long asBinder;
        private final String asInterface;
        private final Long getInterfaceDescriptor;
        private final String onExtraCallback;
        private final boolean onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onTransact;
        private final String onWarmupCompleted;

        public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i6;
            int i8 = ~(i7 | i);
            int i9 = (~(i7 | i3)) | i8;
            int i10 = ~i;
            int i11 = ~i3;
            int i12 = i9 | (~(i10 | i11 | i6));
            int i13 = ~(i7 | i10 | i11);
            int i14 = i10 | i6;
            int i15 = (~(i3 | i14)) | i13;
            int i16 = (~i14) | i8;
            int i17 = i6 + i + i2 + ((-327997910) * i4) + ((-604038433) * i5);
            int i18 = i17 * i17;
            int i19 = ((i6 * 234895570) - 128974848) + (234895570 * i) + (i12 * 695176798) + (695176798 * i15) + ((-347588399) * i16) + (582483968 * i2) + (36700160 * i4) + ((-297271296) * i5) + (1302134784 * i18);
            int i20 = (i6 * (-238133666)) + 182491156 + (i * (-238133666)) + (i12 * (-1294)) + (i15 * (-1294)) + (i16 * 647) + (i2 * (-238134313)) + (i4 * (-1022231738)) + (i5 * 4118089) + (i18 * (-35979264));
            return i19 + ((i20 * i20) * 1404239872) != 1 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = access100 + 51;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, onextracallbackwithresult.IAuthTabCallbackDefault) || this.access000 != onextracallbackwithresult.access000 || !Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback)) {
                int i4 = access100 + 97;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onTransact, onextracallbackwithresult.onTransact)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent)) {
                int i6 = access100 + 49;
                IAuthTabCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.asInterface, onextracallbackwithresult.asInterface)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.asBinder, onextracallbackwithresult.asBinder)) {
                int i8 = IAuthTabCallbackStubProxy + 115;
                access100 = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.getInterfaceDescriptor, onextracallbackwithresult.getInterfaceDescriptor)) {
                int i10 = access100 + 11;
                IAuthTabCallbackStubProxy = i10 % 128;
                return i10 % 2 != 0;
            }
            if (this.onExtraCallbackWithResult != onextracallbackwithresult.onExtraCallbackWithResult) {
                int i11 = IAuthTabCallbackStubProxy + 43;
                access100 = i11 % 128;
                int i12 = i11 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback)) {
                int i13 = IAuthTabCallbackStubProxy + 39;
                access100 = i13 % 128;
                int i14 = i13 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStub)) {
                int i15 = IAuthTabCallbackStubProxy + 81;
                access100 = i15 % 128;
                int i16 = i15 % 2;
                return false;
            }
            int i17 = IAuthTabCallbackStubProxy + 87;
            access100 = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 20 / 0;
            }
            return true;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 17;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode3 = this.IAuthTabCallbackDefault.hashCode();
            int iHashCode4 = this.access000.hashCode();
            String str = this.onWarmupCompleted;
            if (str == null) {
                int i4 = IAuthTabCallbackStubProxy + 33;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.onExtraCallback;
            int iHashCode5 = str2 == null ? 0 : str2.hashCode();
            int iHashCode6 = this.onTransact.hashCode();
            int iHashCode7 = this.onNavigationEvent.hashCode();
            String str3 = this.asInterface;
            if (str3 == null) {
                int i6 = IAuthTabCallbackStubProxy + 29;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str3.hashCode();
            }
            Long l = this.asBinder;
            int iHashCode8 = l == null ? 0 : l.hashCode();
            Long l2 = this.getInterfaceDescriptor;
            int iHashCode9 = l2 == null ? 0 : l2.hashCode();
            int iHashCode10 = Boolean.hashCode(this.onExtraCallbackWithResult);
            String str4 = this.IAuthTabCallback;
            int iHashCode11 = str4 == null ? 0 : str4.hashCode();
            Integer num = this.IAuthTabCallbackStub;
            return (((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Loaded(request=" + this.IAuthTabCallbackDefault + ", source=" + this.access000 + ", deploymentId=" + this.onWarmupCompleted + ", filePath=" + this.onExtraCallback + ", signature=" + this.onTransact + ", deployedAt=" + this.onNavigationEvent + ", sharedMinDeployedAt=" + this.asInterface + ", savedAt=" + this.asBinder + ", updatedAt=" + this.getInterfaceDescriptor + ", isFromCache=" + this.onExtraCallbackWithResult + ", metroHost=" + this.IAuthTabCallback + ", metroPort=" + this.IAuthTabCallbackStub + ")";
            int i2 = access100 + 33;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(@NotNull MaxNativeAdImpl maxNativeAdImpl, @NotNull n0b n0bVar, @Nullable String str, @Nullable String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable Long l, @Nullable Long l2, boolean z, @Nullable String str6, @Nullable Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(maxNativeAdImpl, "");
            Intrinsics.checkNotNullParameter(n0bVar, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.IAuthTabCallbackDefault = maxNativeAdImpl;
            this.access000 = n0bVar;
            this.onWarmupCompleted = str;
            this.onExtraCallback = str2;
            this.onTransact = str3;
            this.onNavigationEvent = str4;
            this.asInterface = str5;
            this.asBinder = l;
            this.getInterfaceDescriptor = l2;
            this.onExtraCallbackWithResult = z;
            this.IAuthTabCallback = str6;
            this.IAuthTabCallbackStub = num;
        }

        @Override // o.n0c
        public MaxNativeAdImpl onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = access100;
            int i3 = i2 + 1;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            MaxNativeAdImpl maxNativeAdImpl = this.IAuthTabCallbackDefault;
            int i5 = i2 + 7;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return maxNativeAdImpl;
        }

        public final n0b IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = access100;
            int i3 = i2 + 99;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            n0b n0bVar = this.access000;
            int i4 = i2 + 81;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            return n0bVar;
        }

        public final String IAuthTabCallback() {
            String str;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 15;
            int i3 = i2 % 128;
            access100 = i3;
            if (i2 % 2 == 0) {
                str = this.onWarmupCompleted;
                int i4 = 51 / 0;
            } else {
                str = this.onWarmupCompleted;
            }
            int i5 = i3 + 107;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = access100 + 83;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            String str = this.onExtraCallback;
            int i5 = i3 + 39;
            access100 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 11 / 0;
            }
            return str;
        }

        public final String asBinder() {
            String str;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 123;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.onTransact;
                int i4 = 0 / 0;
            } else {
                str = this.onTransact;
            }
            int i5 = i2 + 79;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = access100;
            int i3 = i2 + 97;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onNavigationEvent;
            int i5 = i2 + 37;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            int i = 2 % 2;
            int i2 = access100 + 59;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            String str = onextracallbackwithresult.asInterface;
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 65;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Long IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = access100 + 107;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                return this.asBinder;
            }
            throw null;
        }

        public final Long access100() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 33;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            Long l = this.getInterfaceDescriptor;
            int i5 = i2 + 99;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return l;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 91;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            boolean z = onextracallbackwithresult.onExtraCallbackWithResult;
            int i5 = i2 + 21;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                return Boolean.valueOf(z);
            }
            throw null;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = access100 + 79;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                return this.IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Integer onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 109;
            int i3 = i2 % 128;
            access100 = i3;
            int i4 = i2 % 2;
            Integer num = this.IAuthTabCallbackStub;
            int i5 = i3 + 49;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                return num;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String asInterface() {
            return (String) IAuthTabCallback(-13494833, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 13494834);
        }

        public final boolean getInterfaceDescriptor() {
            return ((Boolean) IAuthTabCallback(-1841722383, new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1841722383)).booleanValue();
        }
    }

    public static final class onWarmupCompleted extends n0c {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        private final Throwable onNavigationEvent;
        private final MaxNativeAdImpl onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 45;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i5 = i2 + 109;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent)) {
                return true;
            }
            int i7 = IAuthTabCallback + 21;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onWarmupCompleted.hashCode() * 31) + this.onNavigationEvent.hashCode();
            int i4 = IAuthTabCallback + 121;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Failed(request=" + this.onWarmupCompleted + ", throwable=" + this.onNavigationEvent + ")";
            int i2 = IAuthTabCallback + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull MaxNativeAdImpl maxNativeAdImpl, @NotNull Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(maxNativeAdImpl, "");
            Intrinsics.checkNotNullParameter(th, "");
            this.onWarmupCompleted = maxNativeAdImpl;
            this.onNavigationEvent = th;
        }

        @Override // o.n0c
        public MaxNativeAdImpl onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            MaxNativeAdImpl maxNativeAdImpl = this.onWarmupCompleted;
            int i5 = i3 + 5;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return maxNativeAdImpl;
        }

        public final Throwable onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Throwable th = this.onNavigationEvent;
            int i5 = i3 + 99;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return th;
        }
    }
}
