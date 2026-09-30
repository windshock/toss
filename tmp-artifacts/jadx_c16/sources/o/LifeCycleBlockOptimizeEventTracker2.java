package o;

import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import im.toss.features.credit.data.response.MyQuizDetailsResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class LifeCycleBlockOptimizeEventTracker2 {
    public /* synthetic */ LifeCycleBlockOptimizeEventTracker2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LifeCycleBlockOptimizeEventTracker2() {
    }

    public static final class onExtraCallbackWithResult extends LifeCycleBlockOptimizeEventTracker2 {
        private static int access100 = 1;
        private static int onTransact;
        private final enableNebulaServiceInitOpt IAuthTabCallback;
        private final MyQuizDetailsResponse IAuthTabCallbackDefault;
        private final boolean IAuthTabCallbackStub;
        private final List<onAvailable> asBinder;
        private final enableAudioDjangoExecutorOpt asInterface;
        private final List<onAvailable> onExtraCallback;
        private final int onExtraCallbackWithResult;
        private final onUnavailable onNavigationEvent;
        private final WifiConnectorExternalSyntheticApiModelOutline0 onWarmupCompleted;

        public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i4;
            int i8 = (~(i7 | i6)) | i5;
            int i9 = ~i5;
            int i10 = ~(i7 | i9);
            int i11 = ~i6;
            int i12 = i10 | (~(i9 | i11));
            int i13 = (~(i6 | i9)) | (~(i7 | i11));
            int i14 = i4 + i5 + i3 + (417615942 * i2) + (566850886 * i);
            int i15 = i14 * i14;
            int i16 = ((-370608051) * i4) + 147849216 + ((-2147356519) * i5) + (i8 * 1776748468) + (i12 * 1776748468) + (1776748468 * i13) + (1406140416 * i3) + ((-354418688) * i2) + ((-85983232) * i) + ((-608960512) * i15);
            int i17 = (i4 * (-1357469509)) + 140661806 + (i5 * (-1357469617)) + (i8 * 108) + (i12 * 108) + (i13 * 108) + (i3 * (-1357469401)) + (i2 * 1137340586) + (i * 304092074) + (i15 * 1282146304);
            return i16 + ((i17 * i17) * 1158414336) != 1 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr);
        }

        public static /* synthetic */ onExtraCallbackWithResult onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, int i, WifiConnectorExternalSyntheticApiModelOutline0 wifiConnectorExternalSyntheticApiModelOutline0, List list, List list2, onUnavailable onunavailable, enableAudioDjangoExecutorOpt enableaudiodjangoexecutoropt, MyQuizDetailsResponse myQuizDetailsResponse, boolean z, enableNebulaServiceInitOpt enablenebulaserviceinitopt, int i2, Object obj) {
            enableAudioDjangoExecutorOpt enableaudiodjangoexecutoropt2;
            MyQuizDetailsResponse myQuizDetailsResponse2;
            boolean z2;
            int i3 = 2 % 2;
            int i4 = (i2 & 1) != 0 ? onextracallbackwithresult.onExtraCallbackWithResult : i;
            WifiConnectorExternalSyntheticApiModelOutline0 wifiConnectorExternalSyntheticApiModelOutline02 = (i2 & 2) != 0 ? onextracallbackwithresult.onWarmupCompleted : wifiConnectorExternalSyntheticApiModelOutline0;
            List list3 = (i2 & 4) != 0 ? onextracallbackwithresult.asBinder : list;
            List list4 = (i2 & 8) != 0 ? onextracallbackwithresult.onExtraCallback : list2;
            onUnavailable onunavailable2 = (i2 & 16) != 0 ? onextracallbackwithresult.onNavigationEvent : onunavailable;
            if ((i2 & 32) != 0) {
                int i5 = onTransact + 51;
                access100 = i5 % 128;
                if (i5 % 2 == 0) {
                    enableAudioDjangoExecutorOpt enableaudiodjangoexecutoropt3 = onextracallbackwithresult.asInterface;
                    throw null;
                }
                enableaudiodjangoexecutoropt2 = onextracallbackwithresult.asInterface;
            } else {
                enableaudiodjangoexecutoropt2 = enableaudiodjangoexecutoropt;
            }
            if ((i2 & 64) != 0) {
                int i6 = access100 + 7;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                myQuizDetailsResponse2 = onextracallbackwithresult.IAuthTabCallbackDefault;
            } else {
                myQuizDetailsResponse2 = myQuizDetailsResponse;
            }
            if ((i2 & 128) != 0) {
                z2 = onextracallbackwithresult.IAuthTabCallbackStub;
                int i8 = access100 + 89;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
            } else {
                z2 = z;
            }
            return onextracallbackwithresult.onExtraCallbackWithResult(i4, wifiConnectorExternalSyntheticApiModelOutline02, list3, list4, onunavailable2, enableaudiodjangoexecutoropt2, myQuizDetailsResponse2, z2, (i2 & 256) != 0 ? onextracallbackwithresult.IAuthTabCallback : enablenebulaserviceinitopt);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if ((!(r7 instanceof o.LifeCycleBlockOptimizeEventTracker2.onExtraCallbackWithResult)) == true) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        
            r7 = (o.LifeCycleBlockOptimizeEventTracker2.onExtraCallbackWithResult) r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            if (r6.onExtraCallbackWithResult == r7.onExtraCallbackWithResult) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        
            r2 = r2 + 73;
            o.LifeCycleBlockOptimizeEventTracker2.onExtraCallbackWithResult.onTransact = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r6.onWarmupCompleted, r7.onWarmupCompleted) != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        
            if ((!kotlin.jvm.internal.Intrinsics.areEqual(r6.asBinder, r7.asBinder)) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        
            r7 = o.LifeCycleBlockOptimizeEventTracker2.onExtraCallbackWithResult.access100 + 67;
            o.LifeCycleBlockOptimizeEventTracker2.onExtraCallbackWithResult.onTransact = r7 % 128;
            r7 = r7 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r6.onExtraCallback, r7.onExtraCallback) != false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
        
            r7 = o.LifeCycleBlockOptimizeEventTracker2.onExtraCallbackWithResult.access100 + 83;
            o.LifeCycleBlockOptimizeEventTracker2.onExtraCallbackWithResult.onTransact = r7 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        
            if ((r7 % 2) == 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r6.onNavigationEvent, r7.onNavigationEvent) != false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r6.asInterface, r7.asInterface) != false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r6.IAuthTabCallbackDefault, r7.IAuthTabCallbackDefault) != false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        
            if (r6.IAuthTabCallbackStub == r7.IAuthTabCallbackStub) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
        
            r7 = o.LifeCycleBlockOptimizeEventTracker2.onExtraCallbackWithResult.access100 + 45;
            o.LifeCycleBlockOptimizeEventTracker2.onExtraCallbackWithResult.onTransact = r7 % 128;
            r7 = r7 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
        
            if (r6.IAuthTabCallback == r7.IAuthTabCallback) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onTransact + 75;
            int i3 = i2 % 128;
            access100 = i3;
            if (i2 % 2 == 0) {
                int i4 = 34 / 0;
            }
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int i2 = access100 + 11;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode3 = Integer.hashCode(this.onExtraCallbackWithResult);
            int iHashCode4 = this.onWarmupCompleted.hashCode();
            int iHashCode5 = this.asBinder.hashCode();
            int iHashCode6 = this.onExtraCallback.hashCode();
            onUnavailable onunavailable = this.onNavigationEvent;
            int iHashCode7 = 0;
            if (onunavailable == null) {
                int i4 = access100 + 67;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = onunavailable.hashCode();
            }
            enableAudioDjangoExecutorOpt enableaudiodjangoexecutoropt = this.asInterface;
            if (enableaudiodjangoexecutoropt == null) {
                int i6 = access100 + 91;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = enableaudiodjangoexecutoropt.hashCode();
            }
            MyQuizDetailsResponse myQuizDetailsResponse = this.IAuthTabCallbackDefault;
            if (myQuizDetailsResponse != null) {
                int i8 = onTransact + 31;
                access100 = i8 % 128;
                int i9 = i8 % 2;
                iHashCode7 = myQuizDetailsResponse.hashCode();
            }
            return (((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + Boolean.hashCode(this.IAuthTabCallbackStub)) * 31) + this.IAuthTabCallback.hashCode();
        }

        public final onExtraCallbackWithResult onExtraCallbackWithResult(int i, @NotNull WifiConnectorExternalSyntheticApiModelOutline0 wifiConnectorExternalSyntheticApiModelOutline0, @NotNull List<onAvailable> list, @NotNull List<onAvailable> list2, @Nullable onUnavailable onunavailable, @Nullable enableAudioDjangoExecutorOpt enableaudiodjangoexecutoropt, @Nullable MyQuizDetailsResponse myQuizDetailsResponse, boolean z, @NotNull enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(wifiConnectorExternalSyntheticApiModelOutline0, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(enablenebulaserviceinitopt, "");
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(i, wifiConnectorExternalSyntheticApiModelOutline0, list, list2, onunavailable, enableaudiodjangoexecutoropt, myQuizDetailsResponse, z, enablenebulaserviceinitopt);
            int i3 = access100 + 7;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                return onextracallbackwithresult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ShowCreditHistoryScreen(filterIndex=" + this.onExtraCallbackWithResult + ", creditHistory=" + this.onWarmupCompleted + ", scoreItems=" + this.asBinder + ", inquiryItems=" + this.onExtraCallback + ", adBanner=" + this.onNavigationEvent + ", quizInvitation=" + this.asInterface + ", quizDetails=" + this.IAuthTabCallbackDefault + ", showSafetyBanner=" + this.IAuthTabCallbackStub + ", creditBureauType=" + this.IAuthTabCallback + ")";
            int i2 = onTransact + 9;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(int i, @NotNull WifiConnectorExternalSyntheticApiModelOutline0 wifiConnectorExternalSyntheticApiModelOutline0, @NotNull List<onAvailable> list, @NotNull List<onAvailable> list2, @Nullable onUnavailable onunavailable, @Nullable enableAudioDjangoExecutorOpt enableaudiodjangoexecutoropt, @Nullable MyQuizDetailsResponse myQuizDetailsResponse, boolean z, @NotNull enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
            super(null);
            Intrinsics.checkNotNullParameter(wifiConnectorExternalSyntheticApiModelOutline0, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(enablenebulaserviceinitopt, "");
            this.onExtraCallbackWithResult = i;
            this.onWarmupCompleted = wifiConnectorExternalSyntheticApiModelOutline0;
            this.asBinder = list;
            this.onExtraCallback = list2;
            this.onNavigationEvent = onunavailable;
            this.asInterface = enableaudiodjangoexecutoropt;
            this.IAuthTabCallbackDefault = myQuizDetailsResponse;
            this.IAuthTabCallbackStub = z;
            this.IAuthTabCallback = enablenebulaserviceinitopt;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallbackWithResult(int i, WifiConnectorExternalSyntheticApiModelOutline0 wifiConnectorExternalSyntheticApiModelOutline0, List list, List list2, onUnavailable onunavailable, enableAudioDjangoExecutorOpt enableaudiodjangoexecutoropt, MyQuizDetailsResponse myQuizDetailsResponse, boolean z, enableNebulaServiceInitOpt enablenebulaserviceinitopt, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            enableAudioDjangoExecutorOpt enableaudiodjangoexecutoropt2;
            boolean z2;
            enableNebulaServiceInitOpt enablenebulaserviceinitopt2;
            int i3 = (i2 & 1) != 0 ? 0 : i;
            onUnavailable onunavailable2 = (i2 & 16) != 0 ? null : onunavailable;
            if ((i2 & 32) != 0) {
                int i4 = onTransact + 79;
                access100 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 47 / 0;
                }
                int i6 = 2 % 2;
                enableaudiodjangoexecutoropt2 = null;
            } else {
                enableaudiodjangoexecutoropt2 = enableaudiodjangoexecutoropt;
            }
            MyQuizDetailsResponse myQuizDetailsResponse2 = (i2 & 64) != 0 ? null : myQuizDetailsResponse;
            if ((i2 & 128) != 0) {
                int i7 = access100 + 117;
                int i8 = i7 % 128;
                onTransact = i8;
                boolean z3 = i7 % 2 != 0;
                int i9 = i8 + 55;
                access100 = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 4 / 4;
                } else {
                    int i11 = 2 % 2;
                }
                z2 = z3;
            } else {
                z2 = z;
            }
            if ((i2 & 256) != 0) {
                int i12 = onTransact + 57;
                access100 = i12 % 128;
                int i13 = i12 % 2;
                enablenebulaserviceinitopt2 = enableNebulaServiceInitOpt.KCB;
            } else {
                enablenebulaserviceinitopt2 = enablenebulaserviceinitopt;
            }
            this(i3, wifiConnectorExternalSyntheticApiModelOutline0, list, list2, onunavailable2, enableaudiodjangoexecutoropt2, myQuizDetailsResponse2, z2, enablenebulaserviceinitopt2);
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            int i = 2 % 2;
            int i2 = access100;
            int i3 = i2 + 23;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            WifiConnectorExternalSyntheticApiModelOutline0 wifiConnectorExternalSyntheticApiModelOutline0 = onextracallbackwithresult.onWarmupCompleted;
            int i5 = i2 + 33;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                return wifiConnectorExternalSyntheticApiModelOutline0;
            }
            throw null;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            int i = 2 % 2;
            int i2 = access100 + 41;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            List<onAvailable> list = onextracallbackwithresult.asBinder;
            int i5 = i3 + 45;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                return list;
            }
            throw null;
        }

        public final List<onAvailable> IAuthTabCallback() {
            List<onAvailable> list;
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 61;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                list = this.onExtraCallback;
                int i4 = 96 / 0;
            } else {
                list = this.onExtraCallback;
            }
            int i5 = i2 + 37;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                return list;
            }
            throw null;
        }

        public final onUnavailable onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onTransact + 13;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final enableAudioDjangoExecutorOpt IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 1;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            enableAudioDjangoExecutorOpt enableaudiodjangoexecutoropt = this.asInterface;
            int i5 = i2 + 119;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return enableaudiodjangoexecutoropt;
        }

        public final MyQuizDetailsResponse asBinder() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 89;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            MyQuizDetailsResponse myQuizDetailsResponse = this.IAuthTabCallbackDefault;
            int i5 = i2 + 99;
            access100 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 26 / 0;
            }
            return myQuizDetailsResponse;
        }

        public final boolean onTransact() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 81;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            boolean z = this.IAuthTabCallbackStub;
            int i4 = i2 + 113;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                return z;
            }
            throw null;
        }

        public final enableNebulaServiceInitOpt onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 39;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            enableNebulaServiceInitOpt enablenebulaserviceinitopt = this.IAuthTabCallback;
            int i5 = i2 + 5;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return enablenebulaserviceinitopt;
        }

        public final boolean IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = access100 + 31;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            boolean zAsInterface = this.onWarmupCompleted.asInterface();
            int i4 = onTransact + 67;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return zAsInterface;
        }

        public final String asInterface() {
            int i = 2 % 2;
            int i2 = access100 + 43;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallbackWithResult = zzaz.onExtraCallbackWithResult(!this.asBinder.isEmpty());
            int i4 = access100 + 47;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return strOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = access100 + 15;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallbackWithResult = zzaz.onExtraCallbackWithResult(!this.onExtraCallback.isEmpty());
            int i4 = onTransact + 7;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return strOnExtraCallbackWithResult;
        }

        public final boolean getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = onTransact + 53;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {this.onWarmupCompleted};
            boolean zIsEmpty = ((List) WifiConnectorExternalSyntheticApiModelOutline0.onWarmupCompleted(1872080127, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1872080126, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), objArr)).isEmpty();
            int i4 = access100 + 89;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 54 / 0;
            }
            return zIsEmpty;
        }

        public final WifiConnectorExternalSyntheticApiModelOutline0 onWarmupCompleted() {
            int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            return (WifiConnectorExternalSyntheticApiModelOutline0) IAuthTabCallback(new Object[]{this}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2, 2037031919, -2037031918, iIAuthTabCallback);
        }

        public final List<onAvailable> IAuthTabCallbackStub() {
            int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
            return (List) IAuthTabCallback(new Object[]{this}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2, -1927795815, 1927795815, iIAuthTabCallback);
        }
    }

    public static final class onExtraCallback extends LifeCycleBlockOptimizeEventTracker2 {
        public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onNavigationEvent + 97;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        private onExtraCallback() {
            super(null);
        }
    }

    public static final class IAuthTabCallback extends LifeCycleBlockOptimizeEventTracker2 {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final Throwable onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 77;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(!(obj instanceof IAuthTabCallback))) {
                return !(Intrinsics.areEqual(this.onExtraCallbackWithResult, ((IAuthTabCallback) obj).onExtraCallbackWithResult) ^ true);
            }
            int i5 = i2 + 37;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Throwable th = this.onExtraCallbackWithResult;
            if (i3 != 0) {
                return th.hashCode();
            }
            th.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Error(throwable=" + this.onExtraCallbackWithResult + ")";
            int i2 = onExtraCallback + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.onExtraCallbackWithResult = th;
        }
    }
}
