package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.JsonAdapter;
import im.toss.network.serialization.PolymorphicTypeDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonAdapter(PolymorphicTypeDeserializer.class)
@ga(onExtraCallback = {@gb(IAuthTabCallback = "MIN_NUMBER", onExtraCallback = onExtraCallbackWithResult.class), @gb(IAuthTabCallback = "MAX_NUMBER", onExtraCallback = onExtraCallback.class), @gb(IAuthTabCallback = "MIN_LENGTH", onExtraCallback = IAuthTabCallback.class), @gb(IAuthTabCallback = "MAX_LENGTH", onExtraCallback = onNavigationEvent.class), @gb(IAuthTabCallback = "EMAIL", onExtraCallback = onWarmupCompleted.class), @gb(IAuthTabCallback = "MIN_UNIT", onExtraCallback = asBinder.class), @gb(IAuthTabCallback = "REGEX", onExtraCallback = onTransact.class)}, onNavigationEvent = "type")
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface createMediaViewApi extends Parcelable {
    String IAuthTabCallback();

    public static final class onExtraCallbackWithResult implements createMediaViewApi {
        public static final Parcelable.Creator<onExtraCallbackWithResult> CREATOR = new onWarmupCompleted();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String message;
        private final int size;
        private final String type;

        public static final class onWarmupCompleted implements Parcelable.Creator<onExtraCallbackWithResult> {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onExtraCallbackWithResult createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 41;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = onWarmupCompleted(parcel);
                if (i3 != 0) {
                    int i4 = 78 / 0;
                }
                return onextracallbackwithresultOnWarmupCompleted;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onExtraCallbackWithResult[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 55;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                onExtraCallbackWithResult[] onextracallbackwithresultArrOnExtraCallback = onExtraCallback(i);
                if (i4 == 0) {
                    int i5 = 51 / 0;
                }
                return onextracallbackwithresultArrOnExtraCallback;
            }

            public final onExtraCallbackWithResult[] onExtraCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback;
                int i4 = i3 + 49;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                onExtraCallbackWithResult[] onextracallbackwithresultArr = new onExtraCallbackWithResult[i];
                int i6 = i3 + 105;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return onextracallbackwithresultArr;
            }

            public final onExtraCallbackWithResult onWarmupCompleted(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(parcel.readInt(), parcel.readString(), parcel.readString());
                int i2 = onNavigationEvent + 3;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return onextracallbackwithresult;
            }
        }

        static {
            int i = onNavigationEvent + 1;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 69;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 95;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (this.size != onextracallbackwithresult.size) {
                return false;
            }
            if (!Intrinsics.areEqual(this.message, onextracallbackwithresult.message)) {
                int i3 = onExtraCallbackWithResult + 115;
                onExtraCallback = i3 % 128;
                return i3 % 2 == 0;
            }
            if (Intrinsics.areEqual(this.type, onextracallbackwithresult.type)) {
                return true;
            }
            int i4 = onExtraCallbackWithResult + 99;
            onExtraCallback = i4 % 128;
            return i4 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            onExtraCallbackWithResult = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (((Integer.hashCode(this.size) % 124) >> this.message.hashCode()) / 15) - this.type.hashCode() : (((Integer.hashCode(this.size) * 31) + this.message.hashCode()) * 31) + this.type.hashCode();
            int i3 = onExtraCallback + 23;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MinNumber(size=" + this.size + ", message=" + this.message + ", type=" + this.type + ")";
            int i2 = onExtraCallback + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 19;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.size);
            parcel.writeString(this.message);
            parcel.writeString(this.type);
            int i5 = onExtraCallback + 31;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }

        public onExtraCallbackWithResult(int i, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.size = i;
            this.message = str;
            this.type = str2;
        }

        @Override // o.createMediaViewApi
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.message;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.size;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asBinder implements createMediaViewApi {
        public static final Parcelable.Creator<asBinder> CREATOR = new onExtraCallback();
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final String message;
        private final int size;
        private final String type;

        public static final class onExtraCallback implements Parcelable.Creator<asBinder> {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final asBinder IAuthTabCallback(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                asBinder asbinder = new asBinder(parcel.readInt(), parcel.readString(), parcel.readString());
                int i2 = onExtraCallback + 59;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return asbinder;
            }

            public final asBinder[] IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 119;
                onWarmupCompleted = i3 % 128;
                asBinder[] asbinderArr = new asBinder[i];
                if (i3 % 2 == 0) {
                    return asbinderArr;
                }
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ asBinder createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 49;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return IAuthTabCallback(parcel);
                }
                IAuthTabCallback(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ asBinder[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 83;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                asBinder[] asbinderArrIAuthTabCallback = IAuthTabCallback(i);
                int i5 = onExtraCallback + 27;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return asbinderArrIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i = onExtraCallback + 31;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof o.createMediaViewApi.asBinder) != false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        
            r6 = (o.createMediaViewApi.asBinder) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        
            if (r5.size == r6.size) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.message, r6.message) != false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
        
            r6 = o.createMediaViewApi.asBinder.onExtraCallbackWithResult + 99;
            o.createMediaViewApi.asBinder.onNavigationEvent = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        
            if ((r6 % 2) != 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.type, r6.type) != false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
        
            return true;
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
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.createMediaViewApi.asBinder.onExtraCallbackWithResult
                int r1 = r1 + 19
                int r2 = r1 % 128
                o.createMediaViewApi.asBinder.onNavigationEvent = r2
                int r1 = r1 % r0
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L16
                r1 = 60
                int r1 = r1 / r3
                if (r5 != r6) goto L19
                goto L18
            L16:
                if (r5 != r6) goto L19
            L18:
                return r2
            L19:
                boolean r1 = r6 instanceof o.createMediaViewApi.asBinder
                if (r1 != 0) goto L1e
                return r3
            L1e:
                o.createMediaViewApi$asBinder r6 = (o.createMediaViewApi.asBinder) r6
                int r1 = r5.size
                int r4 = r6.size
                if (r1 == r4) goto L27
                return r3
            L27:
                java.lang.String r1 = r5.message
                java.lang.String r4 = r6.message
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
                if (r1 != 0) goto L3e
                int r6 = o.createMediaViewApi.asBinder.onExtraCallbackWithResult
                int r6 = r6 + 99
                int r1 = r6 % 128
                o.createMediaViewApi.asBinder.onNavigationEvent = r1
                int r6 = r6 % r0
                if (r6 != 0) goto L3d
                return r2
            L3d:
                return r3
            L3e:
                java.lang.String r0 = r5.type
                java.lang.String r6 = r6.type
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
                if (r6 != 0) goto L49
                return r3
            L49:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.createMediaViewApi.asBinder.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((Integer.hashCode(this.size) * 31) + this.message.hashCode()) * 31) + this.type.hashCode();
            int i4 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MinUnit(size=" + this.size + ", message=" + this.message + ", type=" + this.type + ")";
            int i2 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.size);
            parcel.writeString(this.message);
            parcel.writeString(this.type);
            if (i4 != 0) {
                int i5 = 38 / 0;
            }
        }

        public asBinder(int i, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.size = i;
            this.message = str;
            this.type = str2;
        }

        @Override // o.createMediaViewApi
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.message;
            int i4 = i3 + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = this.size;
            int i6 = i3 + 13;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }
    }

    public static final class onExtraCallback implements createMediaViewApi {
        public static final Parcelable.Creator<onExtraCallback> CREATOR = new onWarmupCompleted();
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        private final String message;
        private final int size;
        private final String type;

        public static final class onWarmupCompleted implements Parcelable.Creator<onExtraCallback> {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onExtraCallback createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 89;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallback onextracallbackOnWarmupCompleted = onWarmupCompleted(parcel);
                int i4 = onNavigationEvent + 21;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return onextracallbackOnWarmupCompleted;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onExtraCallback[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 73;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return onWarmupCompleted(i);
                }
                onWarmupCompleted(i);
                throw null;
            }

            public final onExtraCallback onWarmupCompleted(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                onExtraCallback onextracallback = new onExtraCallback(parcel.readInt(), parcel.readString(), parcel.readString());
                int i2 = onExtraCallbackWithResult + 121;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 99 / 0;
                }
                return onextracallback;
            }

            public final onExtraCallback[] onWarmupCompleted(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 49;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                int i5 = i3 % 2;
                onExtraCallback[] onextracallbackArr = new onExtraCallback[i];
                int i6 = i4 + 119;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return onextracallbackArr;
            }
        }

        static {
            int i = onExtraCallback + 105;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                int i2 = 24 / 0;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 39;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 25;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return 0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 125;
                onWarmupCompleted = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (this.size != onextracallback.size) {
                int i3 = onWarmupCompleted + 45;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.message, onextracallback.message)) {
                return false;
            }
            if (Intrinsics.areEqual(this.type, onextracallback.type)) {
                return true;
            }
            int i5 = IAuthTabCallback + 7;
            onWarmupCompleted = i5 % 128;
            return i5 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((Integer.hashCode(this.size) * 31) + this.message.hashCode()) * 31) + this.type.hashCode();
            int i4 = IAuthTabCallback + 27;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MaxNumber(size=" + this.size + ", message=" + this.message + ", type=" + this.type + ")";
            int i2 = IAuthTabCallback + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 23;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i4 == 0) {
                parcel.writeInt(this.size);
                parcel.writeString(this.message);
                parcel.writeString(this.type);
                obj.hashCode();
                throw null;
            }
            parcel.writeInt(this.size);
            parcel.writeString(this.message);
            parcel.writeString(this.type);
            int i5 = IAuthTabCallback + 65;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public onExtraCallback(int i, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.size = i;
            this.message = str;
            this.type = str2;
        }

        @Override // o.createMediaViewApi
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return this.message;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = this.size;
            int i5 = i3 + 49;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }
    }

    public static final class IAuthTabCallback implements createMediaViewApi {
        public static final Parcelable.Creator<IAuthTabCallback> CREATOR = new onNavigationEvent();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String message;
        private final int size;
        private final String type;

        public static final class onNavigationEvent implements Parcelable.Creator<IAuthTabCallback> {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ IAuthTabCallback createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 77;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallbackOnNavigationEvent = onNavigationEvent(parcel);
                int i4 = onWarmupCompleted + 117;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return iAuthTabCallbackOnNavigationEvent;
                }
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ IAuthTabCallback[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 23;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                IAuthTabCallback[] iAuthTabCallbackArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                int i5 = onWarmupCompleted + 69;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 / 0;
                }
                return iAuthTabCallbackArrOnExtraCallbackWithResult;
            }

            public final IAuthTabCallback[] onExtraCallbackWithResult(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 31;
                onWarmupCompleted = i3 % 128;
                IAuthTabCallback[] iAuthTabCallbackArr = new IAuthTabCallback[i];
                if (i3 % 2 == 0) {
                    return iAuthTabCallbackArr;
                }
                throw null;
            }

            public final IAuthTabCallback onNavigationEvent(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(parcel.readInt(), parcel.readString(), parcel.readString());
                int i2 = onWarmupCompleted + 9;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return iAuthTabCallback;
                }
                throw null;
            }
        }

        static {
            int i = onExtraCallback + 117;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 65;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2 != 0 ? 1 : 0;
            int i5 = i2 + 99;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return i4;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (this.size != iAuthTabCallback.size) {
                int i2 = onWarmupCompleted + 61;
                onExtraCallbackWithResult = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.message, iAuthTabCallback.message)) {
                int i3 = onExtraCallbackWithResult + 49;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.type, iAuthTabCallback.type)) {
                int i5 = onExtraCallbackWithResult + 5;
                onWarmupCompleted = i5 % 128;
                return i5 % 2 == 0;
            }
            int i6 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (((Integer.hashCode(this.size) >> 17) >>> this.message.hashCode()) % 76) << this.type.hashCode() : (((Integer.hashCode(this.size) * 31) + this.message.hashCode()) * 31) + this.type.hashCode();
            int i3 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MinLength(size=" + this.size + ", message=" + this.message + ", type=" + this.type + ")";
            int i2 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 81 / 0;
            }
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i4 == 0) {
                parcel.writeInt(this.size);
                parcel.writeString(this.message);
                parcel.writeString(this.type);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            parcel.writeInt(this.size);
            parcel.writeString(this.message);
            parcel.writeString(this.type);
            int i5 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }

        public IAuthTabCallback(int i, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.size = i;
            this.message = str;
            this.type = str2;
        }

        @Override // o.createMediaViewApi
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.message;
            int i4 = i3 + 59;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        public final int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = this.size;
            int i6 = i3 + 17;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 97 / 0;
            }
            return i5;
        }
    }

    public static final class onNavigationEvent implements createMediaViewApi {
        public static final Parcelable.Creator<onNavigationEvent> CREATOR = new onExtraCallbackWithResult();
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private final String message;
        private final int size;
        private final String type;

        public static final class onExtraCallbackWithResult implements Parcelable.Creator<onNavigationEvent> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onNavigationEvent createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 49;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                onNavigationEvent onNavigationEvent = onNavigationEvent(parcel);
                if (i3 != 0) {
                    int i4 = 45 / 0;
                }
                return onNavigationEvent;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onNavigationEvent[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 117;
                IAuthTabCallback = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    onExtraCallbackWithResult(i);
                    throw null;
                }
                onNavigationEvent[] onnavigationeventArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                int i4 = onExtraCallback + 77;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return onnavigationeventArrOnExtraCallbackWithResult;
                }
                obj.hashCode();
                throw null;
            }

            public final onNavigationEvent[] onExtraCallbackWithResult(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback;
                int i4 = i3 + 95;
                onExtraCallback = i4 % 128;
                onNavigationEvent[] onnavigationeventArr = new onNavigationEvent[i];
                if (i4 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 3;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventArr;
            }

            public final onNavigationEvent onNavigationEvent(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                onNavigationEvent onnavigationevent = new onNavigationEvent(parcel.readInt(), parcel.readString(), parcel.readString());
                int i2 = IAuthTabCallback + 67;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return onnavigationevent;
            }
        }

        static {
            int i = onExtraCallback + 103;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2 != 0 ? 1 : 0;
            int i5 = i3 + 93;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return i4;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i2 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i2 % 128;
                return i2 % 2 != 0;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (this.size != onnavigationevent.size || !Intrinsics.areEqual(this.message, onnavigationevent.message)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.type, onnavigationevent.type)) {
                int i3 = IAuthTabCallback + 39;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 77 / 0;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((Integer.hashCode(this.size) * 31) + this.message.hashCode()) * 31) + this.type.hashCode();
            int i4 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MaxLength(size=" + this.size + ", message=" + this.message + ", type=" + this.type + ")";
            int i2 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.size);
            parcel.writeString(this.message);
            parcel.writeString(this.type);
            int i5 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onNavigationEvent(int i, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.size = i;
            this.message = str;
            this.type = str2;
        }

        @Override // o.createMediaViewApi
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return this.message;
            }
            throw null;
        }

        public final int onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = this.size;
            int i6 = i3 + 113;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            throw null;
        }
    }

    public static final class onWarmupCompleted implements createMediaViewApi {
        public static final Parcelable.Creator<onWarmupCompleted> CREATOR = new onNavigationEvent();
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final String message;
        private final String type;

        public static final class onNavigationEvent implements Parcelable.Creator<onWarmupCompleted> {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final onWarmupCompleted IAuthTabCallback(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(parcel.readString(), parcel.readString());
                int i2 = onWarmupCompleted + 67;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return onwarmupcompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onWarmupCompleted createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 115;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompletedIAuthTabCallback = IAuthTabCallback(parcel);
                int i4 = onWarmupCompleted + 65;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return onwarmupcompletedIAuthTabCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onWarmupCompleted[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 99;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                onWarmupCompleted[] onwarmupcompletedArrOnNavigationEvent = onNavigationEvent(i);
                int i5 = onWarmupCompleted + 95;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return onwarmupcompletedArrOnNavigationEvent;
                }
                throw null;
            }

            public final onWarmupCompleted[] onNavigationEvent(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent;
                int i4 = i3 + 101;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                onWarmupCompleted[] onwarmupcompletedArr = new onWarmupCompleted[i];
                int i6 = i3 + 7;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return onwarmupcompletedArr;
            }
        }

        static {
            int i = onExtraCallbackWithResult + 33;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i2 = 70 / 0;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 25;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 65;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onExtraCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.message, onwarmupcompleted.message)) {
                int i3 = onExtraCallback + 121;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.type, onwarmupcompleted.type)) {
                return true;
            }
            int i5 = IAuthTabCallback + 29;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.message.hashCode() * 31) + this.type.hashCode();
            int i4 = onExtraCallback + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Email(message=" + this.message + ", type=" + this.type + ")";
            int i2 = onExtraCallback + 85;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 71;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String str = this.message;
            if (i4 != 0) {
                parcel.writeString(str);
                parcel.writeString(this.type);
            } else {
                parcel.writeString(str);
                parcel.writeString(this.type);
                throw null;
            }
        }

        public onWarmupCompleted(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.message = str;
            this.type = str2;
        }

        @Override // o.createMediaViewApi
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.message;
            int i4 = i3 + 71;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    public static final class onTransact implements createMediaViewApi {
        public static final Parcelable.Creator<onTransact> CREATOR = new IAuthTabCallback();
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String message;
        private final String pattern;
        private final String type;

        public static final class IAuthTabCallback implements Parcelable.Creator<onTransact> {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final onTransact IAuthTabCallback(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                onTransact ontransact = new onTransact(parcel.readString(), parcel.readString(), parcel.readString());
                int i2 = onExtraCallback + 107;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return ontransact;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onTransact[] IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 39;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                int i5 = i3 % 2;
                onTransact[] ontransactArr = new onTransact[i];
                int i6 = i4 + 21;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return ontransactArr;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onTransact createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 11;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    IAuthTabCallback(parcel);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                onTransact ontransactIAuthTabCallback = IAuthTabCallback(parcel);
                int i3 = onExtraCallback + 61;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return ontransactIAuthTabCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onTransact[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 29;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                onTransact[] ontransactArrIAuthTabCallback = IAuthTabCallback(i);
                int i5 = onNavigationEvent + 5;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return ontransactArrIAuthTabCallback;
            }
        }

        static {
            int i = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 61;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 67;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 121;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onTransact)) {
                return false;
            }
            onTransact ontransact = (onTransact) obj;
            if (!Intrinsics.areEqual(this.pattern, ontransact.pattern)) {
                int i4 = onNavigationEvent + 123;
                onWarmupCompleted = i4 % 128;
                return i4 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.message, ontransact.message)) {
                return false;
            }
            if (Intrinsics.areEqual(this.type, ontransact.type)) {
                return true;
            }
            int i5 = onWarmupCompleted + 103;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 9;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.pattern;
            if (str == null) {
                int i5 = i2 + 99;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            return (((iHashCode * 31) + this.message.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Regex(pattern=" + this.pattern + ", message=" + this.message + ", type=" + this.type + ")";
            int i2 = onWarmupCompleted + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 95;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.pattern);
            parcel.writeString(this.message);
            parcel.writeString(this.type);
            int i5 = onWarmupCompleted + 87;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }

        public onTransact(@Nullable String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.pattern = str;
            this.message = str2;
            this.type = str3;
        }

        @Override // o.createMediaViewApi
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.message;
            int i4 = i3 + 115;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 39 / 0;
            }
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 109;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.pattern;
            int i5 = i2 + 39;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
