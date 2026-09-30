package o;

import com.horcrux.svg.SvgPackage;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Interruptable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface Interruptable$IAuthTabCallback {
    String onWarmupCompleted();

    public static final class onWarmupCompleted implements Interruptable$IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final boolean onExtraCallback;
        private final String onNavigationEvent;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if ((!(r6 instanceof o.Interruptable$IAuthTabCallback.onWarmupCompleted)) == true) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        
            r6 = (o.Interruptable$IAuthTabCallback.onWarmupCompleted) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            if (r5.onExtraCallback == r6.onExtraCallback) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, r6.onNavigationEvent) != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
        
            r2 = r2 + 91;
            o.Interruptable$IAuthTabCallback.onWarmupCompleted.IAuthTabCallback = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        
            if ((r2 % 2) != 0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                int i4 = 25 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (Boolean.hashCode(this.onExtraCallback) * 31) + this.onNavigationEvent.hashCode();
            int i4 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 1 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Header(visible=" + this.onExtraCallback + ", id=" + this.onNavigationEvent + ")";
            int i2 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onWarmupCompleted(boolean z, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallback = z;
            this.onNavigationEvent = str;
        }

        public final boolean onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z = this.onExtraCallback;
            int i4 = i3 + 49;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onWarmupCompleted(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                str = "header_" + z;
                int i2 = IAuthTabCallback + 41;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            }
            this(z, str);
        }

        @Override // o.Interruptable$IAuthTabCallback
        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 27;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onNavigationEvent;
            int i5 = i2 + 43;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent implements Interruptable$IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallback;
        private static int onExtraCallbackWithResult;
        public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();
        private static final String onWarmupCompleted = "divider";

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 53;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (this == obj || (obj instanceof onNavigationEvent)) {
                return true;
            }
            int i5 = i3 + 9;
            IAuthTabCallbackDefault = i5 % 128;
            boolean z = !(i5 % 2 != 0);
            int i6 = i3 + 53;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 != 0) {
                return z;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 33;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 57;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return -999081405;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 13;
            onExtraCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 19;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return "Divider";
            }
            throw null;
        }

        private onNavigationEvent() {
        }

        static {
            int i = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        @Override // o.Interruptable$IAuthTabCallback
        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallback implements Interruptable$IAuthTabCallback {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final String IAuthTabCallback;
        private final boolean onExtraCallbackWithResult;

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            if ((r7 instanceof o.Interruptable$IAuthTabCallback.IAuthTabCallback) != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            r1 = r1 + 39;
            o.Interruptable$IAuthTabCallback.IAuthTabCallback.onWarmupCompleted = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        
            r7 = (o.Interruptable$IAuthTabCallback.IAuthTabCallback) r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        
            if (r6.onExtraCallbackWithResult == r7.onExtraCallbackWithResult) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        
            r3 = r3 + 15;
            o.Interruptable$IAuthTabCallback.IAuthTabCallback.onExtraCallback = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        
            if ((r3 % 2) == 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r6.IAuthTabCallback, r7.IAuthTabCallback) != false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r3 = r3 + 25;
            o.Interruptable$IAuthTabCallback.IAuthTabCallback.onExtraCallback = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 123;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            if (i3 % 2 != 0) {
                int i5 = 35 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Boolean.hashCode(this.onExtraCallbackWithResult);
            return i3 == 0 ? (iHashCode % 98) >> this.IAuthTabCallback.hashCode() : (iHashCode * 31) + this.IAuthTabCallback.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "EmptySection(visible=" + this.onExtraCallbackWithResult + ", id=" + this.IAuthTabCallback + ")";
            int i2 = onWarmupCompleted + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public IAuthTabCallback(boolean z, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult = z;
            this.IAuthTabCallback = str;
        }

        public final boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            boolean z = this.onExtraCallbackWithResult;
            int i4 = i3 + 27;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallback(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                str = "empty_section_" + z;
                int i2 = onExtraCallback + 87;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this(z, str);
        }

        @Override // o.Interruptable$IAuthTabCallback
        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i3 + 81;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 18 / 0;
            }
            return str;
        }
    }

    public static final class onExtraCallbackWithResult implements Interruptable$IAuthTabCallback {
        private static int IAuthTabCallbackStubProxy = 0;
        private static int IAuthTabCallback_Parcel = 1;
        public static final int onExtraCallback = 0;
        private final String IAuthTabCallback;
        private final boolean IAuthTabCallbackDefault;
        private final String IAuthTabCallbackStub;
        private final Interruptable.IAuthTabCallbackDefault access000;
        private final Interruptable.IAuthTabCallbackDefault access100;
        private final boolean asBinder;
        private final boolean asInterface;
        private final IAuthTabCallback getInterfaceDescriptor;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onTransact;
        private final Integer onWarmupCompleted;

        public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
            int i7 = ~i6;
            int i8 = i | i2 | i7;
            int i9 = ~i;
            int i10 = (~i2) | i7;
            int i11 = (~i10) | i9;
            int i12 = (~(i2 | i7 | i9)) | (~(i10 | i));
            int i13 = i6 + i + i5 + (2053704882 * i4) + ((-167119771) * i3);
            int i14 = i13 * i13;
            int i15 = ((i6 * (-1228230693)) - 288632672) + (i * (-1228230521)) + (i8 * (-86)) + (i11 * 86) + (i12 * 86) + ((-1228230607) * i5) + (927583762 * i4) + ((-1784727723) * i3) + (i14 * 1163984896);
            if ((((-385660469) * i6) - 1543503872) + (1501345335 * i) + (1203980746 * i8) + (i11 * (-1203980746)) + ((-1203980746) * i12) + ((-1589641216) * i5) + (511705088 * i4) + ((-1639972864) * i3) + (1278279680 * i14) + (i15 * i15 * 992935936) != 1) {
                return onExtraCallbackWithResult(objArr);
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[1];
            String str = (String) objArr[2];
            Integer num = (Integer) objArr[3];
            String str2 = (String) objArr[4];
            String str3 = (String) objArr[5];
            String str4 = (String) objArr[6];
            Interruptable.IAuthTabCallbackDefault iAuthTabCallbackDefault = (Interruptable.IAuthTabCallbackDefault) objArr[7];
            Interruptable.IAuthTabCallbackDefault iAuthTabCallbackDefault2 = (Interruptable.IAuthTabCallbackDefault) objArr[8];
            boolean zBooleanValue = ((Boolean) objArr[9]).booleanValue();
            boolean zBooleanValue2 = ((Boolean) objArr[10]).booleanValue();
            boolean zBooleanValue3 = ((Boolean) objArr[11]).booleanValue();
            int i16 = 2 % 2;
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault2, "");
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(iAuthTabCallback, str, num, str2, str3, str4, iAuthTabCallbackDefault, iAuthTabCallbackDefault2, zBooleanValue, zBooleanValue2, zBooleanValue3);
            int i17 = IAuthTabCallbackStubProxy + 97;
            IAuthTabCallback_Parcel = i17 % 128;
            int i18 = i17 % 2;
            return onextracallbackwithresult;
        }

        public static /* synthetic */ onExtraCallbackWithResult onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, IAuthTabCallback iAuthTabCallback, String str, Integer num, String str2, String str3, String str4, Interruptable.IAuthTabCallbackDefault iAuthTabCallbackDefault, Interruptable.IAuthTabCallbackDefault iAuthTabCallbackDefault2, boolean z, boolean z2, boolean z3, int i, Object obj) {
            String str5;
            Interruptable.IAuthTabCallbackDefault iAuthTabCallbackDefault3;
            boolean z4;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStubProxy + 69;
            int i4 = i3 % 128;
            IAuthTabCallback_Parcel = i4;
            IAuthTabCallback iAuthTabCallback2 = (i3 % 2 != 0 ? (i & 1) == 0 : (i & 1) == 0) ? iAuthTabCallback : onextracallbackwithresult.getInterfaceDescriptor;
            if ((i & 2) != 0) {
                str5 = onextracallbackwithresult.IAuthTabCallbackStub;
                int i5 = i4 + 33;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
            } else {
                str5 = str;
            }
            Integer num2 = (i & 4) != 0 ? onextracallbackwithresult.onWarmupCompleted : num;
            String str6 = (i & 8) != 0 ? onextracallbackwithresult.onExtraCallbackWithResult : str2;
            String str7 = (i & 16) != 0 ? onextracallbackwithresult.onNavigationEvent : str3;
            String str8 = (i & 32) != 0 ? onextracallbackwithresult.IAuthTabCallback : str4;
            Interruptable.IAuthTabCallbackDefault iAuthTabCallbackDefault4 = (i & 64) != 0 ? onextracallbackwithresult.access100 : iAuthTabCallbackDefault;
            if ((i & 128) != 0) {
                iAuthTabCallbackDefault3 = onextracallbackwithresult.access000;
                int i7 = IAuthTabCallbackStubProxy + 13;
                IAuthTabCallback_Parcel = i7 % 128;
                int i8 = i7 % 2;
            } else {
                iAuthTabCallbackDefault3 = iAuthTabCallbackDefault2;
            }
            boolean z5 = (i & 256) != 0 ? onextracallbackwithresult.IAuthTabCallbackDefault : z;
            if ((i & 512) != 0) {
                z4 = onextracallbackwithresult.asInterface;
                int i9 = IAuthTabCallbackStubProxy + 103;
                IAuthTabCallback_Parcel = i9 % 128;
                int i10 = i9 % 2;
            } else {
                z4 = z2;
            }
            Object[] objArr = {onextracallbackwithresult, iAuthTabCallback2, str5, num2, str6, str7, str8, iAuthTabCallbackDefault4, iAuthTabCallbackDefault3, Boolean.valueOf(z5), Boolean.valueOf(z4), Boolean.valueOf((i & 1024) != 0 ? onextracallbackwithresult.asBinder : z3)};
            return (onExtraCallbackWithResult) onExtraCallback(518579990, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), objArr, -518579989);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (this.getInterfaceDescriptor != onextracallbackwithresult.getInterfaceDescriptor) {
                int i2 = IAuthTabCallback_Parcel + 41;
                IAuthTabCallbackStubProxy = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStub)) {
                int i3 = IAuthTabCallbackStubProxy + 25;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted)) {
                int i5 = IAuthTabCallbackStubProxy + 45;
                IAuthTabCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback)) {
                int i7 = IAuthTabCallback_Parcel + 121;
                IAuthTabCallbackStubProxy = i7 % 128;
                return i7 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.access100, onextracallbackwithresult.access100)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.access000, onextracallbackwithresult.access000)) {
                int i8 = IAuthTabCallbackStubProxy + 97;
                IAuthTabCallback_Parcel = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (this.IAuthTabCallbackDefault != onextracallbackwithresult.IAuthTabCallbackDefault) {
                return false;
            }
            if (this.asInterface != onextracallbackwithresult.asInterface) {
                int i10 = IAuthTabCallbackStubProxy + 75;
                IAuthTabCallback_Parcel = i10 % 128;
                return i10 % 2 == 0;
            }
            if (this.asBinder == onextracallbackwithresult.asBinder) {
                int i11 = IAuthTabCallback_Parcel + 25;
                IAuthTabCallbackStubProxy = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 21 / 0;
                }
                return true;
            }
            int i13 = IAuthTabCallback_Parcel;
            int i14 = i13 + 97;
            IAuthTabCallbackStubProxy = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i13 + 19;
            IAuthTabCallbackStubProxy = i16 % 128;
            if (i16 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 23;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode3 = this.getInterfaceDescriptor.hashCode();
            int iHashCode4 = this.IAuthTabCallbackStub.hashCode();
            Integer num = this.onWarmupCompleted;
            if (num == null) {
                int i4 = IAuthTabCallbackStubProxy + 99;
                IAuthTabCallback_Parcel = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 / 2;
                }
                iHashCode = 0;
            } else {
                iHashCode = num.hashCode();
            }
            int iHashCode5 = this.onExtraCallbackWithResult.hashCode();
            String str = this.onNavigationEvent;
            if (str == null) {
                int i6 = IAuthTabCallbackStubProxy + 47;
                IAuthTabCallback_Parcel = i6 % 128;
                iHashCode2 = i6 % 2 == 0 ? 1 : 0;
            } else {
                iHashCode2 = str.hashCode();
            }
            String str2 = this.IAuthTabCallback;
            return (((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.access100.hashCode()) * 31) + this.access000.hashCode()) * 31) + Boolean.hashCode(this.IAuthTabCallbackDefault)) * 31) + Boolean.hashCode(this.asInterface)) * 31) + Boolean.hashCode(this.asBinder);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Asset(state=" + this.getInterfaceDescriptor + ", referenceId=" + this.IAuthTabCallbackStub + ", bankCode=" + this.onWarmupCompleted + ", iconUrl=" + this.onExtraCallbackWithResult + ", iconDarkUrl=" + this.onNavigationEvent + ", iconAlt=" + this.IAuthTabCallback + ", text1=" + this.access100 + ", text2=" + this.access000 + ", showsExclamationBadge=" + this.IAuthTabCallbackDefault + ", isPrimaryAccount=" + this.asInterface + ", isDragging=" + this.asBinder + ")";
            int i2 = IAuthTabCallbackStubProxy + 79;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public onExtraCallbackWithResult(@NotNull IAuthTabCallback iAuthTabCallback, @NotNull String str, @Nullable Integer num, @NotNull String str2, @Nullable String str3, @Nullable String str4, @NotNull Interruptable.IAuthTabCallbackDefault iAuthTabCallbackDefault, @NotNull Interruptable.IAuthTabCallbackDefault iAuthTabCallbackDefault2, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault2, "");
            this.getInterfaceDescriptor = iAuthTabCallback;
            this.IAuthTabCallbackStub = str;
            this.onWarmupCompleted = num;
            this.onExtraCallbackWithResult = str2;
            this.onNavigationEvent = str3;
            this.IAuthTabCallback = str4;
            this.access100 = iAuthTabCallbackDefault;
            this.access000 = iAuthTabCallbackDefault2;
            this.IAuthTabCallbackDefault = z;
            this.asInterface = z2;
            this.asBinder = z3;
            this.onTransact = str;
        }

        public final IAuthTabCallback asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 1;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = this.getInterfaceDescriptor;
            int i5 = i3 + 21;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 87;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.IAuthTabCallbackStub;
            int i4 = i3 + 43;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 55;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallbackWithResult;
            int i5 = i2 + 35;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 30 / 0;
            }
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 41;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.onNavigationEvent;
            int i4 = i3 + 19;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 31 / 0;
            }
            return str;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 13;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            int i4 = i2 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i3 + 81;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 71 / 0;
            }
            return str;
        }

        public final Interruptable.IAuthTabCallbackDefault IAuthTabCallbackDefault() {
            Interruptable.IAuthTabCallbackDefault iAuthTabCallbackDefault;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 115;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                iAuthTabCallbackDefault = this.access100;
                int i4 = 0 / 0;
            } else {
                iAuthTabCallbackDefault = this.access100;
            }
            int i5 = i2 + 33;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                return iAuthTabCallbackDefault;
            }
            throw null;
        }

        public final Interruptable.IAuthTabCallbackDefault IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 27;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            Interruptable.IAuthTabCallbackDefault iAuthTabCallbackDefault = this.access000;
            int i5 = i3 + 31;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                return iAuthTabCallbackDefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 67;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                return this.asInterface;
            }
            throw null;
        }

        public final boolean asBinder() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 9;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                return this.asBinder;
            }
            throw null;
        }

        @Override // o.Interruptable$IAuthTabCallback
        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 97;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            String str = this.onTransact;
            if (i3 == 0) {
                int i4 = 52 / 0;
            }
            return str;
        }

        public final boolean access000() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 55;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            if (this.getInterfaceDescriptor != IAuthTabCallback.INVISIBLE) {
                int i4 = IAuthTabCallbackStubProxy + 67;
                IAuthTabCallback_Parcel = i4 % 128;
                return i4 % 2 != 0;
            }
            int i5 = IAuthTabCallback_Parcel + 23;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 77 / 0;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if (r4 != o.Interruptable.IAuthTabCallback.onExtraCallbackWithResult.IAuthTabCallback.VISIBLE_NEW) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        
            if (r4 != o.Interruptable.IAuthTabCallback.onExtraCallbackWithResult.IAuthTabCallback.VISIBLE_NEW) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            r4 = o.Interruptable$IAuthTabCallback.onExtraCallbackWithResult.IAuthTabCallbackStubProxy + 89;
            o.Interruptable$IAuthTabCallback.onExtraCallbackWithResult.IAuthTabCallback_Parcel = r4 % 128;
            r4 = r4 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 113;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = onextracallbackwithresult.getInterfaceDescriptor;
            if (i3 != 0) {
                int i4 = 50 / 0;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class IAuthTabCallback {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ IAuthTabCallback[] $VALUES;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            public static final IAuthTabCallback VISIBLE = new IAuthTabCallback("VISIBLE", 0);
            public static final IAuthTabCallback VISIBLE_NEW = new IAuthTabCallback("VISIBLE_NEW", 1);
            public static final IAuthTabCallback INVISIBLE = new IAuthTabCallback("INVISIBLE", 2);

            private static final /* synthetic */ IAuthTabCallback[] $values() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 55;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                IAuthTabCallback[] iAuthTabCallbackArr = {VISIBLE, VISIBLE_NEW, INVISIBLE};
                int i5 = i2 + 91;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return iAuthTabCallbackArr;
            }

            public static EnumEntries<IAuthTabCallback> getEntries() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 39;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
                int i4 = i2 + 43;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return enumEntries;
            }

            public static IAuthTabCallback valueOf(String str) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 95;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
                int i4 = onWarmupCompleted + 59;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return iAuthTabCallback;
            }

            public static IAuthTabCallback[] values() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 51;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
                int i4 = onNavigationEvent + 87;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 24 / 0;
                }
                return iAuthTabCallbackArr;
            }

            private IAuthTabCallback(String str, int i) {
            }

            static {
                IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
                $VALUES = iAuthTabCallbackArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
                int i = onExtraCallbackWithResult + 9;
                onExtraCallback = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public final onExtraCallbackWithResult onNavigationEvent(@NotNull IAuthTabCallback iAuthTabCallback, @NotNull String str, @Nullable Integer num, @NotNull String str2, @Nullable String str3, @Nullable String str4, @NotNull Interruptable.IAuthTabCallbackDefault iAuthTabCallbackDefault, @NotNull Interruptable.IAuthTabCallbackDefault iAuthTabCallbackDefault2, boolean z, boolean z2, boolean z3) {
            Object[] objArr = {this, iAuthTabCallback, str, num, str2, str3, str4, iAuthTabCallbackDefault, iAuthTabCallbackDefault2, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)};
            int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
            return (onExtraCallbackWithResult) onExtraCallback(518579990, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr, -518579989);
        }

        public final boolean onTransact() {
            int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
            return ((Boolean) onExtraCallback(-962656365, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{this}, 962656365)).booleanValue();
        }
    }
}
