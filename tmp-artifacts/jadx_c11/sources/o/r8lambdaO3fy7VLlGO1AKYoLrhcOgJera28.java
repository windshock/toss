package o;

import com.iap.android.mppclient.container.constant.JsParamKeys;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.mExternalSyntheticApiModelOutline1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private onExtraCallback onWarmupCompleted;

    public /* synthetic */ r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28() {
    }

    public final void onExtraCallback(@Nullable onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted = onextracallback;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final onExtraCallback onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback extends r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28 {
        private static int IAuthTabCallbackDefault = 1;
        private static int IAuthTabCallbackStub;
        private final boolean IAuthTabCallback;
        private final hasProvider asInterface;
        private final mExternalSyntheticApiModelOutline1.IAuthTabCallback onExtraCallback;
        private final Long onExtraCallbackWithResult;
        private final int onNavigationEvent;
        private final mExternalSyntheticApiModelOutline1.onTransact onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallbackStub + 65;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 11;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i6 = IAuthTabCallbackDefault + 61;
                IAuthTabCallbackStub = i6 % 128;
                return i6 % 2 != 0;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (!Intrinsics.areEqual(this.asInterface, iAuthTabCallback.asInterface) || !Intrinsics.areEqual(this.onExtraCallback, iAuthTabCallback.onExtraCallback) || !Intrinsics.areEqual(this.onWarmupCompleted, iAuthTabCallback.onWarmupCompleted) || this.onNavigationEvent != iAuthTabCallback.onNavigationEvent || this.IAuthTabCallback != iAuthTabCallback.IAuthTabCallback) {
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, iAuthTabCallback.onExtraCallbackWithResult)) {
                return true;
            }
            int i7 = IAuthTabCallbackDefault + 5;
            IAuthTabCallbackStub = i7 % 128;
            return i7 % 2 != 0;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.asInterface.hashCode();
            int iHashCode3 = this.onExtraCallback.hashCode();
            int iHashCode4 = this.onWarmupCompleted.hashCode();
            int iHashCode5 = Integer.hashCode(this.onNavigationEvent);
            int iHashCode6 = Boolean.hashCode(this.IAuthTabCallback);
            Long l = this.onExtraCallbackWithResult;
            if (l == null) {
                int i2 = IAuthTabCallbackDefault;
                int i3 = i2 + 51;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 89;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = l.hashCode();
            }
            return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "To(text=" + this.asInterface + ", motion=" + this.onExtraCallback + ", sizeStrategy=" + this.onWarmupCompleted + ", initialDelay=" + this.onNavigationEvent + ", isBackward=" + this.IAuthTabCallback + ", skipDurationMillis=" + this.onExtraCallbackWithResult + ")";
            int i2 = IAuthTabCallbackDefault + 77;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull hasProvider hasprovider, @NotNull mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, @NotNull mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z, @Nullable Long l) {
            super(null);
            Intrinsics.checkNotNullParameter(hasprovider, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(ontransact, "");
            this.asInterface = hasprovider;
            this.onExtraCallback = iAuthTabCallback;
            this.onWarmupCompleted = ontransact;
            this.onNavigationEvent = i;
            this.IAuthTabCallback = z;
            this.onExtraCallbackWithResult = l;
        }

        public final hasProvider asBinder() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 107;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            hasProvider hasprovider = this.asInterface;
            int i5 = i2 + 35;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                return hasprovider;
            }
            throw null;
        }

        public final mExternalSyntheticApiModelOutline1.IAuthTabCallback onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 39;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback = this.onExtraCallback;
            int i5 = i2 + 65;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        public final mExternalSyntheticApiModelOutline1.onTransact onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 33;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            mExternalSyntheticApiModelOutline1.onTransact ontransact = this.onWarmupCompleted;
            int i5 = i2 + 103;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return ontransact;
        }

        public final int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 15;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            int i5 = this.onNavigationEvent;
            int i6 = i3 + 59;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            throw null;
        }

        public final boolean IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 57;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z = this.IAuthTabCallback;
            int i4 = i2 + 79;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        public final Long IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 51;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            Long l = this.onExtraCallbackWithResult;
            int i5 = i3 + 97;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 77 / 0;
            }
            return l;
        }
    }

    public static final class onExtraCallbackWithResult extends r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28 {
        private static int access100 = 1;
        private static int asInterface;
        private final int IAuthTabCallback;
        private final List<hasProvider> IAuthTabCallbackDefault;
        private int IAuthTabCallbackStub;
        private final boolean asBinder;
        private final int onExtraCallback;
        private final mExternalSyntheticApiModelOutline1.IAuthTabCallback onExtraCallbackWithResult;
        private final mExternalSyntheticApiModelOutline1.onTransact onNavigationEvent;
        private final boolean onTransact;
        private final int onWarmupCompleted;

        public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = ~i6;
            int i8 = (~(i7 | i3)) | (~(i | i3));
            int i9 = i | i6;
            int i10 = (~(i6 | (~i3))) | (~(i7 | (~i))) | (~i9);
            int i11 = i + i3 + i4 + (1350191703 * i2) + ((-44904237) * i5);
            int i12 = i11 * i11;
            int i13 = ((i * (-560584373)) - 948043776) + ((-560584373) * i3) + ((-826660534) * i8) + (i9 * 826660534) + (826660534 * i10) + (266076160 * i4) + ((-71041024) * i2) + ((-766246912) * i5) + (1339949056 * i12);
            int i14 = (i * 1657715387) + 2046152777 + (i3 * 1657715387) + (i8 * (-918)) + (i9 * 918) + (i10 * 918) + (i4 * 1657716305) + (i2 * 1507858311) + (i5 * 1845144771) + (i12 * 155058176);
            return i13 + ((i14 * i14) * 417464320) != 1 ? onExtraCallback(objArr) : IAuthTabCallback(objArr);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = access100 + 71;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, onextracallbackwithresult.IAuthTabCallbackDefault) || !Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallbackWithResult)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent)) {
                int i3 = access100 + 117;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (this.IAuthTabCallback != onextracallbackwithresult.IAuthTabCallback) {
                int i5 = asInterface + 7;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (this.onExtraCallback != onextracallbackwithresult.onExtraCallback) {
                return false;
            }
            if (this.onWarmupCompleted == onextracallbackwithresult.onWarmupCompleted) {
                return this.asBinder == onextracallbackwithresult.asBinder && this.onTransact == onextracallbackwithresult.onTransact;
            }
            int i7 = access100 + 115;
            asInterface = i7 % 128;
            return i7 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asInterface + 85;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((((((((((this.IAuthTabCallbackDefault.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + Integer.hashCode(this.IAuthTabCallback)) * 31) + Integer.hashCode(this.onExtraCallback)) * 31) + Integer.hashCode(this.onWarmupCompleted)) * 31) + Boolean.hashCode(this.asBinder)) * 31) + Boolean.hashCode(this.onTransact);
            int i4 = access100 + 55;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Ticker(texts=" + this.IAuthTabCallbackDefault + ", motion=" + this.onExtraCallbackWithResult + ", sizeStrategy=" + this.onNavigationEvent + ", initialDelay=" + this.IAuthTabCallback + ", interval=" + this.onExtraCallback + ", playCount=" + this.onWarmupCompleted + ", skipIntroMotion=" + this.asBinder + ", startToStart=" + this.onTransact + ")";
            int i2 = access100 + 37;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(@NotNull List<hasProvider> list, @NotNull mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, @NotNull mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, int i2, int i3, boolean z, boolean z2) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(ontransact, "");
            this.IAuthTabCallbackDefault = list;
            this.onExtraCallbackWithResult = iAuthTabCallback;
            this.onNavigationEvent = ontransact;
            this.IAuthTabCallback = i;
            this.onExtraCallback = i2;
            this.onWarmupCompleted = i3;
            this.asBinder = z;
            this.onTransact = z2;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            int i = 2 % 2;
            int i2 = access100 + 45;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            List<hasProvider> list = onextracallbackwithresult.IAuthTabCallbackDefault;
            if (i3 != 0) {
                int i4 = 50 / 0;
            }
            return list;
        }

        public final mExternalSyntheticApiModelOutline1.IAuthTabCallback onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = access100 + 121;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallbackWithResult;
            }
            throw null;
        }

        public final mExternalSyntheticApiModelOutline1.onTransact onTransact() {
            int i = 2 % 2;
            int i2 = asInterface + 109;
            int i3 = i2 % 128;
            access100 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            mExternalSyntheticApiModelOutline1.onTransact ontransact = this.onNavigationEvent;
            int i4 = i3 + 81;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 10 / 0;
            }
            return ontransact;
        }

        public final int onExtraCallback() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 49;
            access100 = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = this.IAuthTabCallback;
            int i5 = i2 + 83;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                return i4;
            }
            throw null;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            int i = 2 % 2;
            int i2 = access100;
            int i3 = i2 + 1;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            int i5 = onextracallbackwithresult.onExtraCallback;
            int i6 = i2 + 115;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                return Integer.valueOf(i5);
            }
            int i7 = 21 / 0;
            return Integer.valueOf(i5);
        }

        public final int IAuthTabCallbackDefault() {
            int i;
            int i2 = 2 % 2;
            int i3 = asInterface + 27;
            int i4 = i3 % 128;
            access100 = i4;
            if (i3 % 2 == 0) {
                i = this.onWarmupCompleted;
                int i5 = 24 / 0;
            } else {
                i = this.onWarmupCompleted;
            }
            int i6 = i4 + 5;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return i;
        }

        public final boolean asInterface() {
            int i = 2 % 2;
            int i2 = access100 + 123;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                return this.asBinder;
            }
            throw null;
        }

        public final boolean IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = asInterface + 99;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onTransact;
            }
            throw null;
        }

        public final int IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = access100;
            int i3 = i2 + 9;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.IAuthTabCallbackStub;
            int i6 = i2 + 71;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final void onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = access100;
            int i4 = i3 + 7;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            Object obj = null;
            this.IAuthTabCallbackStub = i;
            if (i5 != 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = i3 + 39;
            asInterface = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }

        public final int asBinder() {
            int i = 2 % 2;
            int i2 = access100 + 13;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            int size = this.IAuthTabCallbackStub % this.IAuthTabCallbackDefault.size();
            int i4 = access100 + 113;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return size;
        }

        public final boolean access100() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 95;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            if (this.IAuthTabCallbackStub != 0) {
                return false;
            }
            int i5 = i2 + 43;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public final int onWarmupCompleted() {
            int i = 2 % 2;
            if (this.IAuthTabCallbackDefault.isEmpty()) {
                int i2 = access100 + 15;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                return 0;
            }
            int size = this.IAuthTabCallbackStub / this.IAuthTabCallbackDefault.size();
            int i4 = access100 + 47;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                return size;
            }
            throw null;
        }

        public final int IAuthTabCallback() {
            int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
            return ((Integer) onExtraCallback(1987232077, JsParamKeys.onExtraCallbackWithResult(), -1987232076, new Object[]{this}, iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult)).intValue();
        }

        public final List<hasProvider> IAuthTabCallbackStubProxy() {
            int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
            return (List) onExtraCallback(-582533298, JsParamKeys.onExtraCallbackWithResult(), 582533298, new Object[]{this}, iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        }
    }

    public static final class onNavigationEvent extends r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28 {
        private static int asBinder = 0;
        private static int asInterface = 1;
        private final int IAuthTabCallback;
        private final hasProvider onExtraCallback;
        private final mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub onExtraCallbackWithResult;
        private final mExternalSyntheticApiModelOutline1.onTransact onNavigationEvent;
        private final boolean onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asBinder + 37;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback) || !Intrinsics.areEqual(this.onExtraCallbackWithResult, onnavigationevent.onExtraCallbackWithResult)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent)) {
                int i4 = asBinder + 3;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (this.IAuthTabCallback != onnavigationevent.IAuthTabCallback) {
                return false;
            }
            if (this.onWarmupCompleted == onnavigationevent.onWarmupCompleted) {
                return true;
            }
            int i6 = asInterface + 67;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asBinder + 101;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((((this.onExtraCallback.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + Integer.hashCode(this.IAuthTabCallback)) * 31) + Boolean.hashCode(this.onWarmupCompleted);
            int i4 = asInterface + 33;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Infinite(text=" + this.onExtraCallback + ", motion=" + this.onExtraCallbackWithResult + ", sizeStrategy=" + this.onNavigationEvent + ", initialDelay=" + this.IAuthTabCallback + ", skipIntroMotion=" + this.onWarmupCompleted + ")";
            int i2 = asBinder + 117;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull hasProvider hasprovider, @NotNull mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub, @NotNull mExternalSyntheticApiModelOutline1.onTransact ontransact, int i, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(hasprovider, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
            Intrinsics.checkNotNullParameter(ontransact, "");
            this.onExtraCallback = hasprovider;
            this.onExtraCallbackWithResult = iAuthTabCallbackStub;
            this.onNavigationEvent = ontransact;
            this.IAuthTabCallback = i;
            this.onWarmupCompleted = z;
        }

        public final hasProvider IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 43;
            asInterface = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            hasProvider hasprovider = this.onExtraCallback;
            int i4 = i2 + 107;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return hasprovider;
            }
            obj.hashCode();
            throw null;
        }

        public final mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asBinder + 89;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub = this.onExtraCallbackWithResult;
            int i5 = i3 + 85;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                return iAuthTabCallbackStub;
            }
            throw null;
        }

        public final mExternalSyntheticApiModelOutline1.onTransact onExtraCallback() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 61;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            mExternalSyntheticApiModelOutline1.onTransact ontransact = this.onNavigationEvent;
            int i5 = i2 + 93;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                return ontransact;
            }
            throw null;
        }

        public final int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder + 71;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            int i5 = this.IAuthTabCallback;
            int i6 = i3 + 19;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asBinder + 61;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onWarmupCompleted;
            }
            throw null;
        }
    }

    public static final class onWarmupCompleted extends r8lambdaO3fy7VLlGO1AKYoLrhcOgJera28 {
        private static int IAuthTabCallback = 0;
        public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onNavigationEvent + 115;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 97;
                IAuthTabCallback = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i3 = onExtraCallbackWithResult + 101;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 37;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 1;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return -148489240;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 101;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return "Clear";
        }

        private onWarmupCompleted() {
            super(null);
        }
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        private final int onExtraCallbackWithResult;
        private final int onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i2 = onExtraCallback + 61;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 75;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (this.onExtraCallbackWithResult != onextracallback.onExtraCallbackWithResult) {
                int i7 = onWarmupCompleted + 31;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (this.onNavigationEvent == onextracallback.onNavigationEvent) {
                return true;
            }
            int i9 = onExtraCallback + 27;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onExtraCallback = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (Integer.hashCode(this.onExtraCallbackWithResult) << 54) / Integer.hashCode(this.onNavigationEvent) : (Integer.hashCode(this.onExtraCallbackWithResult) * 31) + Integer.hashCode(this.onNavigationEvent);
            int i3 = onWarmupCompleted + 117;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 19 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ResumeData(timelinePosition=" + this.onExtraCallbackWithResult + ", sizeAnimationDuration=" + this.onNavigationEvent + ")";
            int i2 = onWarmupCompleted + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallback(int i, int i2) {
            this.onExtraCallbackWithResult = i;
            this.onNavigationEvent = i2;
        }

        public final int onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = this.onExtraCallbackWithResult;
            int i5 = i3 + 93;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        public final int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = this.onNavigationEvent;
            int i5 = i3 + 107;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return i4;
            }
            obj.hashCode();
            throw null;
        }
    }
}
