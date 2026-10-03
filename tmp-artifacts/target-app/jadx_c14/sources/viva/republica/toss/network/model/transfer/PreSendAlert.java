package viva.republica.toss.network.model.transfer;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access15300;
import o.access8100;
import o.appInfo;
import o.checkCanOpenLandingPage;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.htf31;
import o.kt;
import o.liq;
import o.nc;
import o.okycx;
import o.onHostResume;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.PreSendAlert;
import viva.republica.toss.network.model.transfer.PreSendAlert$IconInfo$Icon$$serializer;

@liq(onNavigationEvent = onHostResume.class)
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class PreSendAlert implements Parcelable {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    static {
        int i = onExtraCallback + 67;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 15 / 0;
        }
    }

    public /* synthetic */ PreSendAlert(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String IAuthTabCallback();

    public abstract ButtonInfo onExtraCallback();

    public abstract FdsDisplayType onExtraCallbackWithResult();

    public abstract String onNavigationEvent();

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PreSendAlert> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onHostResume onhostresume = onHostResume.INSTANCE;
            int i4 = onExtraCallback + 43;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 22 / 0;
            }
            return onhostresume;
        }
    }

    private PreSendAlert() {
    }

    @liq
    public static final class BottomSheet extends PreSendAlert {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final Lazy<KSerializer<Object>>[] $childSerializers;
        public static final Parcelable.Creator<BottomSheet> CREATOR;
        public static final Companion Companion;
        private static char IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 0;
        private static int asBinder = 1;
        private static int asInterface = 1;
        private static char onExtraCallback;
        private static int onExtraCallbackWithResult;
        private static char onNavigationEvent;
        private static char onWarmupCompleted;
        private final List<Attachment> attachments;
        private final ButtonInfo buttonInfo;
        private final FdsDisplayType fdsDisplayType;
        private final Map<String, String> logParams;
        private final String message;
        private final String title;
        private final String type;

        public static final class onNavigationEvent implements Parcelable.Creator<BottomSheet> {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ BottomSheet createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 63;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                BottomSheet bottomSheetOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
                int i4 = onExtraCallbackWithResult + 109;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return bottomSheetOnExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ BottomSheet[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 111;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                BottomSheet[] bottomSheetArrOnWarmupCompleted = onWarmupCompleted(i);
                int i5 = onExtraCallbackWithResult + 31;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return bottomSheetArrOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final BottomSheet onExtraCallbackWithResult(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 71;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                FdsDisplayType fdsDisplayTypeValueOf = null;
                Intrinsics.checkNotNullParameter(parcel, "");
                if (i3 != 0) {
                    parcel.readString();
                    parcel.readString();
                    parcel.readString();
                    parcel.readInt();
                    fdsDisplayTypeValueOf.hashCode();
                    throw null;
                }
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                ButtonInfo buttonInfoCreateFromParcel = parcel.readInt() == 0 ? null : ButtonInfo.CREATOR.createFromParcel(parcel);
                int i4 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                int i6 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    int i8 = onExtraCallbackWithResult + 103;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    arrayList.add(Attachment.CREATOR.createFromParcel(parcel));
                }
                if (parcel.readInt() == 0) {
                    int i10 = onExtraCallbackWithResult + 111;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 != 0) {
                        throw null;
                    }
                } else {
                    fdsDisplayTypeValueOf = FdsDisplayType.valueOf(parcel.readString());
                    int i11 = onExtraCallbackWithResult + 95;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                }
                return new BottomSheet(string, string2, string3, buttonInfoCreateFromParcel, linkedHashMap, arrayList, fdsDisplayTypeValueOf);
            }

            public final BottomSheet[] onWarmupCompleted(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted;
                int i4 = i3 + 123;
                onExtraCallbackWithResult = i4 % 128;
                BottomSheet[] bottomSheetArr = new BottomSheet[i];
                if (i4 % 2 == 0) {
                    throw null;
                }
                int i5 = i3 + 71;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return bottomSheetArr;
            }
        }

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = ~i2;
            int i8 = ~i3;
            int i9 = ~i6;
            int i10 = (~(i8 | i9)) | i7;
            int i11 = ~(i6 | i3);
            int i12 = i10 | i11;
            int i13 = (~(i7 | i3)) | (~(i7 | i9)) | (~(i9 | i3));
            int i14 = i3 + i2 + i4 + (669352129 * i5) + (266941808 * i);
            int i15 = i14 * i14;
            int i16 = (720661947 * i3) + 1572077568 + ((-1243901369) * i2) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i4) + ((-1100480512) * i5) + ((-1249902592) * i) + ((-491520000) * i15);
            int i17 = (i3 * 1617402437) + 56426783 + (i2 * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (i4 * 1617401855) + (i5 * 1244927807) + (i * (-404665712)) + (i15 * (-45350912));
            return i16 + ((i17 * i17) * 1565261824) != 1 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
        }

        private static final /* synthetic */ KSerializer access000() {
            int i = 2 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getwrigglelayout, getwrigglelayout);
            int i2 = onExtraCallbackWithResult + 5;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 26 / 0;
            }
            return getmutilbackgrounddrawable;
        }

        private static final /* synthetic */ KSerializer access100() {
            int i = 2 % 2;
            int i2 = asBinder + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<FdsDisplayType> kSerializerSerializer = FdsDisplayType.Companion.serializer();
            int i4 = asBinder + 15;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerSerializer;
        }

        public static /* synthetic */ KSerializer asInterface() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            KSerializer interfaceDescriptor = getInterfaceDescriptor();
            int i4 = onExtraCallbackWithResult + 73;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return interfaceDescriptor;
        }

        private static final /* synthetic */ KSerializer getInterfaceDescriptor() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(PreSendAlert$Attachment$$serializer.INSTANCE);
            int i2 = onExtraCallbackWithResult + 51;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return checkcanopenlandingpage;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            int i = 2 % 2;
            int i2 = asBinder + 7;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerAccess000 = access000();
            if (i3 != 0) {
                int i4 = 76 / 0;
            }
            return kSerializerAccess000;
        }

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            KSerializer kSerializerAccess100;
            int i = 2 % 2;
            int i2 = asBinder + 39;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializerAccess100 = access100();
                int i3 = 14 / 0;
            } else {
                kSerializerAccess100 = access100();
            }
            int i4 = asBinder + 83;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerAccess100;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = asBinder + 15;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 109;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                return 0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 77;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof BottomSheet)) {
                return false;
            }
            BottomSheet bottomSheet = (BottomSheet) obj;
            if (!Intrinsics.areEqual(this.type, bottomSheet.type)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.title, bottomSheet.title)) {
                int i4 = asBinder + 47;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.message, bottomSheet.message)) {
                int i6 = asBinder + 19;
                onExtraCallbackWithResult = i6 % 128;
                return i6 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.buttonInfo, bottomSheet.buttonInfo)) {
                return false;
            }
            if (Intrinsics.areEqual(this.logParams, bottomSheet.logParams)) {
                return Intrinsics.areEqual(this.attachments, bottomSheet.attachments) && this.fdsDisplayType == bottomSheet.fdsDisplayType;
            }
            int i7 = onExtraCallbackWithResult + 69;
            asBinder = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.type.hashCode();
            int iHashCode3 = this.title.hashCode();
            String str = this.message;
            if (str == null) {
                int i2 = onExtraCallbackWithResult + 31;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
                int i4 = asBinder + 111;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
            ButtonInfo buttonInfo = this.buttonInfo;
            int iHashCode4 = buttonInfo == null ? 0 : buttonInfo.hashCode();
            int iHashCode5 = this.logParams.hashCode();
            int iHashCode6 = this.attachments.hashCode();
            FdsDisplayType fdsDisplayType = this.fdsDisplayType;
            int iHashCode7 = (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (fdsDisplayType != null ? fdsDisplayType.hashCode() : 0);
            int i6 = asBinder + 3;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return iHashCode7;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            String str = this.type;
            String str2 = this.title;
            String str3 = this.message;
            ButtonInfo buttonInfo = this.buttonInfo;
            Map<String, String> map = this.logParams;
            List<Attachment> list = this.attachments;
            FdsDisplayType fdsDisplayType = this.fdsDisplayType;
            StringBuilder sb = new StringBuilder();
            sb.append("BottomSheet(type=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", message=");
            sb.append(str3);
            sb.append(", buttonInfo=");
            sb.append(buttonInfo);
            sb.append(", logParams=");
            sb.append(map);
            sb.append(", attachments=");
            sb.append(list);
            Object[] objArr = new Object[1];
            a(new char[]{986, 40537, 25392, 52417, 18662, 48474, 33862, 53432, 30049, 56278, 64871, 7294, 23268, 64149, 56558, 31696, 50587, 11282}, ((Process.getThreadPriority(0) + 20) >> 6) + 17, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(fdsDisplayType);
            sb.append(")");
            String string = sb.toString();
            int i2 = asBinder + 73;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 8 / 0;
            }
            return string;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0046 A[PHI: r1
          0x0046: PHI (r1v14 viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo) = 
          (r1v7 viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo)
          (r1v18 viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo)
         binds: [B:8:0x0040, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
        @Override // android.os.Parcelable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel r7, int r8) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.PreSendAlert.BottomSheet.onExtraCallbackWithResult
                int r1 = r1 + 73
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.BottomSheet.asBinder = r2
                int r1 = r1 % r0
                r2 = 1
                java.lang.String r3 = ""
                r4 = 0
                if (r1 != 0) goto L2c
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
                java.lang.String r1 = r6.type
                r7.writeString(r1)
                java.lang.String r1 = r6.title
                r7.writeString(r1)
                java.lang.String r1 = r6.message
                r7.writeString(r1)
                viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo r1 = r6.buttonInfo
                r3 = 68
                int r3 = r3 / r4
                if (r1 != 0) goto L46
                goto L42
            L2c:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
                java.lang.String r1 = r6.type
                r7.writeString(r1)
                java.lang.String r1 = r6.title
                r7.writeString(r1)
                java.lang.String r1 = r6.message
                r7.writeString(r1)
                viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo r1 = r6.buttonInfo
                if (r1 != 0) goto L46
            L42:
                r7.writeInt(r4)
                goto L4c
            L46:
                r7.writeInt(r2)
                r1.writeToParcel(r7, r8)
            L4c:
                java.util.Map<java.lang.String, java.lang.String> r1 = r6.logParams
                int r3 = r1.size()
                r7.writeInt(r3)
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L5d:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L7c
                java.lang.Object r3 = r1.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r5 = r3.getKey()
                java.lang.String r5 = (java.lang.String) r5
                r7.writeString(r5)
                java.lang.Object r3 = r3.getValue()
                java.lang.String r3 = (java.lang.String) r3
                r7.writeString(r3)
                goto L5d
            L7c:
                java.util.List<viva.republica.toss.network.model.transfer.PreSendAlert$Attachment> r1 = r6.attachments
                int r3 = r1.size()
                r7.writeInt(r3)
                java.util.Iterator r1 = r1.iterator()
            L89:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto La2
                int r3 = viva.republica.toss.network.model.transfer.PreSendAlert.BottomSheet.onExtraCallbackWithResult
                int r3 = r3 + 39
                int r5 = r3 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.BottomSheet.asBinder = r5
                int r3 = r3 % r0
                java.lang.Object r3 = r1.next()
                viva.republica.toss.network.model.transfer.PreSendAlert$Attachment r3 = (viva.republica.toss.network.model.transfer.PreSendAlert.Attachment) r3
                r3.writeToParcel(r7, r8)
                goto L89
            La2:
                viva.republica.toss.network.model.transfer.PreSendAlert$FdsDisplayType r8 = r6.fdsDisplayType
                if (r8 != 0) goto Lbc
                int r8 = viva.republica.toss.network.model.transfer.PreSendAlert.BottomSheet.asBinder
                int r8 = r8 + 105
                int r1 = r8 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.BottomSheet.onExtraCallbackWithResult = r1
                int r8 = r8 % r0
                r7.writeInt(r4)
                int r7 = viva.republica.toss.network.model.transfer.PreSendAlert.BottomSheet.onExtraCallbackWithResult
                int r7 = r7 + 13
                int r8 = r7 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.BottomSheet.asBinder = r8
                int r7 = r7 % r0
                return
            Lbc:
                r7.writeInt(r2)
                java.lang.String r8 = r8.name()
                r7.writeString(r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PreSendAlert.BottomSheet.writeToParcel(android.os.Parcel, int):void");
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<BottomSheet> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 89;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                PreSendAlert$BottomSheet$$serializer preSendAlert$BottomSheet$$serializer = PreSendAlert$BottomSheet$$serializer.INSTANCE;
                int i4 = onExtraCallback + 99;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return preSendAlert$BottomSheet$$serializer;
            }
        }

        static {
            IAuthTabCallback_Parcel();
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            CREATOR = new onNavigationEvent();
            TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.PreSendAlert$BottomSheet$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 35;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object obj = null;
                    Object[] objArr = new Object[0];
                    int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
                    if (i3 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    KSerializer kSerializer = (KSerializer) PreSendAlert.BottomSheet.IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), 1498083915, -1498083915, objArr, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback);
                    int i4 = IAuthTabCallback + 115;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return kSerializer;
                    }
                    obj.hashCode();
                    throw null;
                }
            }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.PreSendAlert$BottomSheet$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 75;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        PreSendAlert.BottomSheet.asInterface();
                        throw null;
                    }
                    KSerializer kSerializerAsInterface = PreSendAlert.BottomSheet.asInterface();
                    int i3 = onExtraCallback + 55;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 83 / 0;
                    }
                    return kSerializerAsInterface;
                }
            }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.PreSendAlert$BottomSheet$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 79;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        PreSendAlert.BottomSheet.onWarmupCompleted();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    KSerializer kSerializerOnWarmupCompleted = PreSendAlert.BottomSheet.onWarmupCompleted();
                    int i3 = onNavigationEvent + 83;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return kSerializerOnWarmupCompleted;
                }
            })};
            int i = IAuthTabCallbackDefault + 11;
            asInterface = i % 128;
            if (i % 2 != 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ BottomSheet(int i, String str, String str2, String str3, ButtonInfo buttonInfo, Map map, List list, FdsDisplayType fdsDisplayType, okycx okycxVar) {
            if (1 != (i & 1)) {
                int i2 = onExtraCallbackWithResult + 103;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 1, PreSendAlert$BottomSheet$$serializer.INSTANCE.getDescriptor());
                int i4 = 2 % 2;
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            super(defaultConstructorMarker);
            this.type = str;
            if ((i & 2) == 0) {
                this.title = "";
            } else {
                this.title = str2;
                int i5 = 2 % 2;
            }
            if ((i & 4) == 0) {
                int i6 = asBinder + 117;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                this.message = null;
                if (i7 != 0) {
                    defaultConstructorMarker.hashCode();
                    throw null;
                }
                int i8 = 2 % 2;
            } else {
                this.message = str3;
            }
            if ((i & 8) == 0) {
                this.buttonInfo = null;
                int i9 = 2 % 2;
            } else {
                this.buttonInfo = buttonInfo;
            }
            if ((i & 16) == 0) {
                int i10 = asBinder + 43;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                this.logParams = access8100.onNavigationEvent();
            } else {
                this.logParams = map;
            }
            if ((i & 32) == 0) {
                this.attachments = CollectionsKt.emptyList();
                int i12 = onExtraCallbackWithResult + 49;
                asBinder = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 2 / 2;
                } else {
                    int i14 = 2 % 2;
                }
            } else {
                this.attachments = list;
            }
            if ((i & 64) != 0) {
                this.fdsDisplayType = fdsDisplayType;
                return;
            }
            int i15 = onExtraCallbackWithResult + 37;
            asBinder = i15 % 128;
            int i16 = i15 % 2;
            this.fdsDisplayType = null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BottomSheet(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable ButtonInfo buttonInfo, @NotNull Map<String, String> map, @NotNull List<Attachment> list, @Nullable FdsDisplayType fdsDisplayType) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.type = str;
            this.title = str2;
            this.message = str3;
            this.buttonInfo = buttonInfo;
            this.logParams = map;
            this.attachments = list;
            this.fdsDisplayType = fdsDisplayType;
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 89;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i2 + 75;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 79 / 0;
            }
            return lazyArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[PHI: r0
          0x004a: PHI (r0v9 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r0v2 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r0v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r0v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:13:0x0049, B:11:0x0046, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ java.lang.Object onExtraCallbackWithResult(java.lang.Object[] r8) {
            /*
                Method dump skipped, instructions count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PreSendAlert.BottomSheet.onExtraCallbackWithResult(java.lang.Object[]):java.lang.Object");
        }

        public String IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            String str = this.type;
            int i5 = i3 + 63;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // viva.republica.toss.network.model.transfer.PreSendAlert
        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            int i3 = i2 % 128;
            asBinder = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.title;
            int i4 = i3 + 55;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        @Override // viva.republica.toss.network.model.transfer.PreSendAlert
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 121;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return this.message;
            }
            throw null;
        }

        @Override // viva.republica.toss.network.model.transfer.PreSendAlert
        public ButtonInfo onExtraCallback() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 111;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            ButtonInfo buttonInfo = this.buttonInfo;
            int i4 = i2 + 35;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return buttonInfo;
            }
            throw null;
        }

        public Map<String, String> IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return this.logParams;
            }
            throw null;
        }

        public final List<Attachment> asBinder() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            List<Attachment> list = this.attachments;
            int i5 = i3 + 53;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        @Override // viva.republica.toss.network.model.transfer.PreSendAlert
        public FdsDisplayType onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 55;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            FdsDisplayType fdsDisplayType = this.fdsDisplayType;
            int i5 = i2 + 81;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return fdsDisplayType;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i4 = $11 + 125;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    int i8 = $10 + 105;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                    int i11 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onWarmupCompleted);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int i12 = (CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1)) + 10;
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i3) + 12435;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(jumpTapTimeout, i12, iIndexOf, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10, KeyEvent.normalizeMetaState(0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7++;
                        cArr3 = cArr4;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, 19901 - (ViewConfiguration.getTouchSlop() >> 8), -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public static /* synthetic */ KSerializer onTransact() {
            int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
            int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
            int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
            return (KSerializer) IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), 1498083915, -1498083915, new Object[0], iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallbackWithResult(BottomSheet bottomSheet, vyl vylVar, SerialDescriptor serialDescriptor) {
            int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
            int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
            int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
            IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), 17719919, -17719918, new Object[]{bottomSheet, vylVar, serialDescriptor}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
        }

        static void IAuthTabCallback_Parcel() {
            IAuthTabCallback = (char) 54473;
            onExtraCallback = (char) 40044;
            onNavigationEvent = (char) 23203;
            onWarmupCompleted = (char) 32479;
        }
    }

    @liq
    public static final class IconBottomSheet extends PreSendAlert {
        private static final Lazy<KSerializer<Object>>[] $childSerializers;
        public static final Parcelable.Creator<IconBottomSheet> CREATOR;
        public static final Companion Companion;
        private static int IAuthTabCallback;
        private static int asInterface;
        private static int onExtraCallback;
        private static byte[] onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private static short[] onWarmupCompleted;
        private final ButtonInfo buttonInfo;
        private final FdsDisplayType fdsDisplayType;
        private final IconInfo iconInfo;
        private final Map<String, String> logParams;
        private final String message;
        private final String title;
        private final String type;
        private static final byte[] $$a = {73, 121, -48, -56};
        private static final int $$b = 10;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onTransact = 0;
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;

        public static final class onExtraCallback implements Parcelable.Creator<IconBottomSheet> {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ IconBottomSheet createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 45;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    onExtraCallbackWithResult(parcel);
                    throw null;
                }
                IconBottomSheet iconBottomSheetOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
                int i3 = onExtraCallbackWithResult + 65;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return iconBottomSheetOnExtraCallbackWithResult;
                }
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ IconBottomSheet[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 121;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    onWarmupCompleted(i);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                IconBottomSheet[] iconBottomSheetArrOnWarmupCompleted = onWarmupCompleted(i);
                int i4 = onNavigationEvent + 1;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return iconBottomSheetArrOnWarmupCompleted;
            }

            public final IconBottomSheet onExtraCallbackWithResult(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 7;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                FdsDisplayType fdsDisplayTypeValueOf = null;
                Intrinsics.checkNotNullParameter(parcel, "");
                if (i3 == 0) {
                    parcel.readString();
                    parcel.readString();
                    parcel.readString();
                    parcel.readInt();
                    throw null;
                }
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                ButtonInfo buttonInfoCreateFromParcel = parcel.readInt() == 0 ? null : ButtonInfo.CREATOR.createFromParcel(parcel);
                int i4 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i4);
                int i5 = onExtraCallbackWithResult + 27;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                for (int i7 = 0; i7 != i4; i7++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                IconInfo iconInfo = (IconInfo) parcel.readParcelable(IconBottomSheet.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    int i8 = onExtraCallbackWithResult + 25;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    fdsDisplayTypeValueOf = FdsDisplayType.valueOf(parcel.readString());
                }
                return new IconBottomSheet(string, string2, string3, buttonInfoCreateFromParcel, linkedHashMap, iconInfo, fdsDisplayTypeValueOf);
            }

            public final IconBottomSheet[] onWarmupCompleted(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult;
                int i4 = i3 + 13;
                onNavigationEvent = i4 % 128;
                IconBottomSheet[] iconBottomSheetArr = new IconBottomSheet[i];
                if (i4 % 2 == 0) {
                    throw null;
                }
                int i5 = i3 + 55;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return iconBottomSheetArr;
                }
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r6, byte r7, byte r8) {
            /*
                int r8 = r8 + 4
                int r6 = r6 * 3
                int r6 = r6 + 1
                int r7 = r7 * 4
                int r7 = r7 + 115
                byte[] r0 = viva.republica.toss.network.model.transfer.PreSendAlert.IconBottomSheet.$$a
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L15
                r7 = r6
                r3 = r8
                r4 = r2
                goto L2b
            L15:
                r3 = r2
            L16:
                int r8 = r8 + 1
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L25:
                r4 = r0[r8]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2b:
                int r7 = r7 + r8
                r8 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PreSendAlert.IconBottomSheet.$$c(byte, byte, byte):java.lang.String");
        }

        public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i3;
            int i8 = ~i4;
            int i9 = i | i7 | i8;
            int i10 = (~(i7 | i4)) | (~(i8 | i));
            int i11 = (~(i4 | i)) | (~(i7 | (~i) | i8));
            int i12 = i + i3 + i2 + ((-160716491) * i6) + (1883135422 * i5);
            int i13 = i12 * i12;
            int i14 = (((-1835184368) * i) - 666828800) + ((-962678542) * i3) + ((-1711230735) * i9) + (i10 * 1711230735) + (1711230735 * i11) + (748552192 * i2) + ((-1967783936) * i6) + ((-2092695552) * i5) + ((-870252544) * i13);
            int i15 = (i * 1975847376) + 750996803 + (i3 * 1975845642) + (i9 * (-867)) + (i10 * 867) + (i11 * 867) + (i2 * 1975846509) + (i6 * (-526956143)) + (i5 * 972447206) + (i13 * (-1341325312));
            if (i14 + (i15 * i15 * 1929838592) != 1) {
                return onExtraCallbackWithResult(objArr);
            }
            int i16 = 2 % 2;
            int i17 = IAuthTabCallbackStub + 67;
            int i18 = i17 % 128;
            IAuthTabCallbackDefault = i18;
            int i19 = i17 % 2;
            int i20 = i18 + 73;
            IAuthTabCallbackStub = i20 % 128;
            int i21 = i20 % 2;
            return 0;
        }

        private static final /* synthetic */ KSerializer IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getwrigglelayout, getwrigglelayout);
            int i2 = IAuthTabCallbackDefault + 7;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return getmutilbackgrounddrawable;
        }

        private static final /* synthetic */ KSerializer IAuthTabCallback_Parcel() {
            KSerializer<IconInfo> kSerializerSerializer;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 3;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                kSerializerSerializer = IconInfo.Companion.serializer();
                int i3 = 55 / 0;
            } else {
                kSerializerSerializer = IconInfo.Companion.serializer();
            }
            int i4 = IAuthTabCallbackDefault + 107;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerSerializer;
        }

        public static /* synthetic */ KSerializer asBinder() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 11;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return getInterfaceDescriptor();
            }
            getInterfaceDescriptor();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ KSerializer asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 67;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
            int i4 = IAuthTabCallbackDefault + 89;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerIAuthTabCallbackStubProxy;
        }

        private static final /* synthetic */ KSerializer getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 89;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            FdsDisplayType.Companion companion = FdsDisplayType.Companion;
            if (i3 == 0) {
                return companion.serializer();
            }
            companion.serializer();
            throw null;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 85;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return IAuthTabCallback_Parcel();
            }
            IAuthTabCallback_Parcel();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconBottomSheet)) {
                return false;
            }
            IconBottomSheet iconBottomSheet = (IconBottomSheet) obj;
            if ((!Intrinsics.areEqual(this.type, iconBottomSheet.type)) || !Intrinsics.areEqual(this.title, iconBottomSheet.title) || !Intrinsics.areEqual(this.message, iconBottomSheet.message) || !Intrinsics.areEqual(this.buttonInfo, iconBottomSheet.buttonInfo) || (!Intrinsics.areEqual(this.logParams, iconBottomSheet.logParams))) {
                return false;
            }
            if (!Intrinsics.areEqual(this.iconInfo, iconBottomSheet.iconInfo)) {
                int i2 = IAuthTabCallbackDefault + 103;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (this.fdsDisplayType == iconBottomSheet.fdsDisplayType) {
                int i4 = IAuthTabCallbackStub + 73;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            int i6 = IAuthTabCallbackStub + 65;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 71;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode3 = this.type.hashCode();
            int iHashCode4 = this.title.hashCode();
            String str = this.message;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
                int i4 = IAuthTabCallbackDefault + 115;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            }
            ButtonInfo buttonInfo = this.buttonInfo;
            int iHashCode5 = buttonInfo == null ? 0 : buttonInfo.hashCode();
            int iHashCode6 = this.logParams.hashCode();
            IconInfo iconInfo = this.iconInfo;
            if (iconInfo == null) {
                int i6 = IAuthTabCallbackDefault + 79;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = iconInfo.hashCode();
            }
            FdsDisplayType fdsDisplayType = this.fdsDisplayType;
            return (((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + (fdsDisplayType != null ? fdsDisplayType.hashCode() : 0);
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            String str = this.type;
            String str2 = this.title;
            String str3 = this.message;
            ButtonInfo buttonInfo = this.buttonInfo;
            Map<String, String> map = this.logParams;
            IconInfo iconInfo = this.iconInfo;
            FdsDisplayType fdsDisplayType = this.fdsDisplayType;
            StringBuilder sb = new StringBuilder();
            sb.append("IconBottomSheet(type=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", message=");
            sb.append(str3);
            sb.append(", buttonInfo=");
            sb.append(buttonInfo);
            sb.append(", logParams=");
            sb.append(map);
            sb.append(", iconInfo=");
            sb.append(iconInfo);
            Object[] objArr = new Object[1];
            a((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 96), 1318384525 - Gravity.getAbsoluteGravity(0, 0), 591649824 - TextUtils.indexOf("", ""), (-41) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(fdsDisplayType);
            sb.append(")");
            String string = sb.toString();
            int i2 = IAuthTabCallbackDefault + 75;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.type);
            parcel.writeString(this.title);
            parcel.writeString(this.message);
            ButtonInfo buttonInfo = this.buttonInfo;
            if (buttonInfo == null) {
                parcel.writeInt(0);
                int i3 = IAuthTabCallbackDefault + 95;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
            } else {
                parcel.writeInt(1);
                buttonInfo.writeToParcel(parcel, i);
            }
            Map<String, String> map = this.logParams;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
                int i5 = IAuthTabCallbackDefault + 21;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
            }
            parcel.writeParcelable(this.iconInfo, i);
            FdsDisplayType fdsDisplayType = this.fdsDisplayType;
            if (fdsDisplayType != null) {
                parcel.writeInt(1);
                parcel.writeString(fdsDisplayType.name());
            } else {
                int i7 = IAuthTabCallbackStub + 103;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
                parcel.writeInt(0);
            }
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<IconBottomSheet> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 59;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    PreSendAlert$IconBottomSheet$$serializer preSendAlert$IconBottomSheet$$serializer = PreSendAlert$IconBottomSheet$$serializer.INSTANCE;
                    throw null;
                }
                PreSendAlert$IconBottomSheet$$serializer preSendAlert$IconBottomSheet$$serializer2 = PreSendAlert$IconBottomSheet$$serializer.INSTANCE;
                int i3 = onExtraCallback + 41;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return preSendAlert$IconBottomSheet$$serializer2;
                }
                throw null;
            }
        }

        static {
            asInterface = 1;
            access000();
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            CREATOR = new onExtraCallback();
            TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.PreSendAlert$IconBottomSheet$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 39;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerAsInterface = PreSendAlert.IconBottomSheet.asInterface();
                    int i4 = onNavigationEvent + 107;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializerAsInterface;
                }
            }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.PreSendAlert$IconBottomSheet$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 101;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
                    KSerializer kSerializer = (KSerializer) PreSendAlert.IconBottomSheet.IAuthTabCallback(new Object[0], 2021059322, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -2021059322, iIAuthTabCallback, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
                    int i4 = onExtraCallbackWithResult + 17;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializer;
                }
            }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.PreSendAlert$IconBottomSheet$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 57;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        return PreSendAlert.IconBottomSheet.asBinder();
                    }
                    PreSendAlert.IconBottomSheet.asBinder();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            })};
            int i = onTransact + 57;
            asInterface = i % 128;
            if (i % 2 != 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ IconBottomSheet(int i, String str, String str2, String str3, ButtonInfo buttonInfo, Map map, IconInfo iconInfo, FdsDisplayType fdsDisplayType, okycx okycxVar) {
            super(null);
            if (1 != (i & 1)) {
                int i2 = IAuthTabCallbackStub + 101;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 1, PreSendAlert$IconBottomSheet$$serializer.INSTANCE.getDescriptor());
            }
            this.type = str;
            if ((i & 2) == 0) {
                this.title = "";
            } else {
                this.title = str2;
                int i4 = 2 % 2;
            }
            if ((i & 4) == 0) {
                int i5 = IAuthTabCallbackDefault + 35;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                this.message = null;
                if (i6 == 0) {
                    int i7 = 89 / 0;
                }
            } else {
                this.message = str3;
                int i8 = IAuthTabCallbackStub + 1;
                IAuthTabCallbackDefault = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
            }
            if ((i & 8) == 0) {
                this.buttonInfo = null;
            } else {
                this.buttonInfo = buttonInfo;
                int i11 = 2 % 2;
            }
            if ((i & 16) == 0) {
                this.logParams = access8100.onNavigationEvent();
            } else {
                this.logParams = map;
                int i12 = 2 % 2;
            }
            if ((i & 32) == 0) {
                this.iconInfo = null;
            } else {
                this.iconInfo = iconInfo;
                int i13 = IAuthTabCallbackStub + 9;
                IAuthTabCallbackDefault = i13 % 128;
                int i14 = i13 % 2;
                int i15 = 2 % 2;
            }
            if ((i & 64) != 0) {
                this.fdsDisplayType = fdsDisplayType;
                return;
            }
            int i16 = IAuthTabCallbackStub + 115;
            IAuthTabCallbackDefault = i16 % 128;
            int i17 = i16 % 2;
            this.fdsDisplayType = null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconBottomSheet(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable ButtonInfo buttonInfo, @NotNull Map<String, String> map, @Nullable IconInfo iconInfo, @Nullable FdsDisplayType fdsDisplayType) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.type = str;
            this.title = str2;
            this.message = str3;
            this.buttonInfo = buttonInfo;
            this.logParams = map;
            this.iconInfo = iconInfo;
            this.fdsDisplayType = fdsDisplayType;
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 107;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i2 + 109;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return lazyArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[PHI: r1
          0x003b: PHI (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x002d, B:10:0x0039, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r1
          0x002f: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x002d, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.transfer.PreSendAlert.IconBottomSheet r7, o.vyl r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PreSendAlert.IconBottomSheet.onNavigationEvent(viva.republica.toss.network.model.transfer.PreSendAlert$IconBottomSheet, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public String access100() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 9;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            String str = this.type;
            int i5 = i3 + 121;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // viva.republica.toss.network.model.transfer.PreSendAlert
        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 113;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return this.title;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // viva.republica.toss.network.model.transfer.PreSendAlert
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 61;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            String str = this.message;
            int i5 = i2 + 79;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // viva.republica.toss.network.model.transfer.PreSendAlert
        public ButtonInfo onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 57;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            ButtonInfo buttonInfo = this.buttonInfo;
            if (i3 == 0) {
                int i4 = 94 / 0;
            }
            return buttonInfo;
        }

        public Map<String, String> onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 109;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Map<String, String> map = this.logParams;
            if (i3 != 0) {
                int i4 = 32 / 0;
            }
            return map;
        }

        public final IconInfo IAuthTabCallbackStub() {
            IconInfo iconInfo;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 15;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            if (i2 % 2 != 0) {
                iconInfo = this.iconInfo;
                int i4 = 17 / 0;
            } else {
                iconInfo = this.iconInfo;
            }
            int i5 = i3 + 109;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 90 / 0;
            }
            return iconInfo;
        }

        @Override // viva.republica.toss.network.model.transfer.PreSendAlert
        public FdsDisplayType onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 33;
            IAuthTabCallbackStub = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            FdsDisplayType fdsDisplayType = this.fdsDisplayType;
            int i4 = i2 + 81;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                return fdsDisplayType;
            }
            obj.hashCode();
            throw null;
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5;
            int i6 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                char c = '0';
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42, (ViewConfiguration.getLongPressTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i7 = $11 + 51;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i4 != 0) {
                    int i9 = $11 + 51;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        throw null;
                    }
                    byte[] bArr = onExtraCallbackWithResult;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i10 = 0;
                        while (i10 < length) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    char cKeyCodeFromString = (char) (12843 - KeyEvent.keyCodeFromString(""));
                                    int iAlpha = 55 - Color.alpha(0);
                                    int iIndexOf = 2166 - TextUtils.indexOf("", c, 0);
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cKeyCodeFromString, iAlpha, iIndexOf, -299036574, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                i10++;
                                c = '0';
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = onExtraCallbackWithResult;
                        try {
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getTouchSlop() >> 8)), 42 - Drawable.resolveOpacity(0, 0), KeyEvent.keyCodeFromString("") + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ (-4629411779493505016L))) + i4;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.indexOf("", "", 0) + 86, Color.blue(0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onExtraCallbackWithResult;
                    if (bArr4 != null) {
                        int i11 = $11 + 119;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i13 = 0; i13 < length2; i13++) {
                            bArr5[i13] = (byte) (bArr4[i13] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            int i14 = $10 + 3;
                            $11 = i14 % 128;
                            if (i14 % 2 == 0) {
                                byte[] bArr6 = onExtraCallbackWithResult;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent >>> 1;
                                i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback * (((byte) (((byte) (bArr6[r7] - 4629411779493505016L)) * s)) ^ b);
                            } else {
                                byte[] bArr7 = onExtraCallbackWithResult;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b);
                            }
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i5;
                        } else {
                            short[] sArr = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            int i15 = $11 + 93;
                            $10 = i15 % 128;
                            int i16 = i15 % 2;
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
            return (KSerializer) IAuthTabCallback(new Object[0], 2021059322, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -2021059322, iIAuthTabCallback, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
            return ((Integer) IAuthTabCallback(new Object[]{this}, -184061345, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 184061346, iIAuthTabCallback, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback())).intValue();
        }

        static void access000() {
            onNavigationEvent = 355259515;
            IAuthTabCallback = -1538795488;
            onExtraCallback = 2029779972;
            onExtraCallbackWithResult = new byte[]{-31, 112, 93, 95, -115, 115, -80, 93, 84, 85, -94, -115, 121, -89, 86, -18, 92};
        }
    }

    @liq
    public static final class FullPage extends PreSendAlert {
        private static final Lazy<KSerializer<Object>>[] $childSerializers;
        public static final Parcelable.Creator<FullPage> CREATOR;
        public static final Companion Companion;
        private static long IAuthTabCallback;
        private static int IAuthTabCallbackStub;
        private static int onExtraCallback;
        private static char onNavigationEvent;
        private final ButtonInfo buttonInfo;
        private final FdsDisplayType fdsDisplayType;
        private final IconInfo iconInfo;
        private final Map<String, String> logParams;
        private final String message;
        private final String title;
        private final String type;
        private static final byte[] $$a = {52, -58, -85, 74};
        private static final int $$b = 250;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public static final class onWarmupCompleted implements Parcelable.Creator<FullPage> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ FullPage createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 1;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                FullPage fullPageOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
                int i4 = IAuthTabCallback + 123;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return fullPageOnExtraCallbackWithResult;
                }
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ FullPage[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 111;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    onExtraCallbackWithResult(i);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                FullPage[] fullPageArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                int i4 = onExtraCallback + 73;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 33 / 0;
                }
                return fullPageArrOnExtraCallbackWithResult;
            }

            public final FullPage onExtraCallbackWithResult(Parcel parcel) {
                ButtonInfo buttonInfoCreateFromParcel;
                FdsDisplayType fdsDisplayType;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    int i2 = IAuthTabCallback + 73;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    buttonInfoCreateFromParcel = null;
                } else {
                    buttonInfoCreateFromParcel = ButtonInfo.CREATOR.createFromParcel(parcel);
                }
                ButtonInfo buttonInfo = buttonInfoCreateFromParcel;
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                IconInfo iconInfo = (IconInfo) parcel.readParcelable(FullPage.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    int i5 = IAuthTabCallback + 109;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    fdsDisplayType = null;
                } else {
                    FdsDisplayType fdsDisplayTypeValueOf = FdsDisplayType.valueOf(parcel.readString());
                    int i6 = IAuthTabCallback + 63;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    fdsDisplayType = fdsDisplayTypeValueOf;
                }
                FullPage fullPage = new FullPage(string, string2, string3, buttonInfo, linkedHashMap, iconInfo, fdsDisplayType);
                int i8 = IAuthTabCallback + 21;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                return fullPage;
            }

            public final FullPage[] onExtraCallbackWithResult(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 75;
                onExtraCallback = i3 % 128;
                FullPage[] fullPageArr = new FullPage[i];
                if (i3 % 2 == 0) {
                    return fullPageArr;
                }
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r7, short r8, byte r9) {
            /*
                byte[] r0 = viva.republica.toss.network.model.transfer.PreSendAlert.FullPage.$$a
                int r9 = r9 * 4
                int r9 = r9 + 1
                int r7 = r7 + 4
                int r8 = 110 - r8
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L13
                r8 = r7
                r3 = r9
                r4 = r2
                goto L29
            L13:
                r3 = r2
            L14:
                int r7 = r7 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r9) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r6
            L29:
                int r7 = -r7
                int r7 = r7 + r3
                r3 = r4
                r6 = r8
                r8 = r7
                r7 = r6
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PreSendAlert.FullPage.$$c(byte, short, byte):java.lang.String");
        }

        private static final /* synthetic */ KSerializer IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<FdsDisplayType> kSerializerSerializer = FdsDisplayType.Companion.serializer();
            int i4 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerSerializer;
            }
            throw null;
        }

        private static final /* synthetic */ KSerializer access000() {
            int i = 2 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getwrigglelayout, getwrigglelayout);
            int i2 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return getmutilbackgrounddrawable;
        }

        public static /* synthetic */ KSerializer asBinder() {
            KSerializer kSerializerIAuthTabCallbackStubProxy;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializerIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
                int i3 = 87 / 0;
            } else {
                kSerializerIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
            }
            int i4 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerIAuthTabCallbackStubProxy;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                IconInfo.Companion.serializer();
                throw null;
            }
            KSerializer<IconInfo> kSerializerSerializer = IconInfo.Companion.serializer();
            int i3 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerSerializer;
        }

        public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i5;
            int i8 = ~i6;
            int i9 = (~(i8 | i4)) | i7;
            int i10 = (~(i7 | (~i4) | i6)) | (~(i8 | i7 | i4));
            int i11 = (~(i4 | i6)) | (~(i5 | i6));
            int i12 = i5 + i6 + i3 + ((-1520811122) * i) + (1880343047 * i2);
            int i13 = i12 * i12;
            int i14 = (((-88056299) * i5) - 1254686720) + (875799021 * i6) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i3) + ((-206831616) * i) + (408289280 * i2) + ((-683737088) * i13);
            int i15 = ((i5 * (-660833811)) - 1995073173) + (i6 * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + (i3 * (-660833671)) + (i * 644061726) + (i2 * (-2012083377)) + (i13 * (-1027145728));
            return i14 + ((i15 * i15) * 814809088) != 1 ? onNavigationEvent(objArr) : onExtraCallback(objArr);
        }

        public static /* synthetic */ KSerializer onTransact() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[0];
            int iOnExtraCallback = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializer = (KSerializer) onExtraCallbackWithResult(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, -627566889, 627566890);
            int i4 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializer;
        }

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerAccess000 = access000();
            int i4 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerAccess000;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FullPage)) {
                return false;
            }
            FullPage fullPage = (FullPage) obj;
            if (!Intrinsics.areEqual(this.type, fullPage.type)) {
                int i2 = onWarmupCompleted + 29;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 23 / 0;
                }
                return false;
            }
            if (!Intrinsics.areEqual(this.title, fullPage.title)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.message, fullPage.message)) {
                int i4 = onExtraCallbackWithResult + 77;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.buttonInfo, fullPage.buttonInfo) || !Intrinsics.areEqual(this.logParams, fullPage.logParams)) {
                return false;
            }
            if (Intrinsics.areEqual(this.iconInfo, fullPage.iconInfo)) {
                return this.fdsDisplayType == fullPage.fdsDisplayType;
            }
            int i6 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i6 % 128;
            return i6 % 2 != 0;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.type.hashCode();
            int iHashCode3 = this.title.hashCode();
            String str = this.message;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            ButtonInfo buttonInfo = this.buttonInfo;
            if (buttonInfo == null) {
                int i4 = onExtraCallbackWithResult + 107;
                onWarmupCompleted = i4 % 128;
                iHashCode = i4 % 2 == 0 ? 1 : 0;
            } else {
                iHashCode = buttonInfo.hashCode();
            }
            int iHashCode5 = this.logParams.hashCode();
            IconInfo iconInfo = this.iconInfo;
            int iHashCode6 = iconInfo == null ? 0 : iconInfo.hashCode();
            FdsDisplayType fdsDisplayType = this.fdsDisplayType;
            int iHashCode7 = (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (fdsDisplayType != null ? fdsDisplayType.hashCode() : 0);
            int i5 = onWarmupCompleted + 121;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return iHashCode7;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            String str = this.type;
            String str2 = this.title;
            String str3 = this.message;
            ButtonInfo buttonInfo = this.buttonInfo;
            Map<String, String> map = this.logParams;
            IconInfo iconInfo = this.iconInfo;
            FdsDisplayType fdsDisplayType = this.fdsDisplayType;
            StringBuilder sb = new StringBuilder();
            sb.append("FullPage(type=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", message=");
            sb.append(str3);
            sb.append(", buttonInfo=");
            sb.append(buttonInfo);
            sb.append(", logParams=");
            sb.append(map);
            sb.append(", iconInfo=");
            sb.append(iconInfo);
            Object[] objArr = new Object[1];
            a((char) (19426 - Color.green(0)), (-1243449266) - KeyEvent.keyCodeFromString(""), new char[]{33284, 49304, 21312, 51843, 57897, 5531, 48893, 19295, 50341, 45550, 27002, 59787, 59947, 30446, 13073, 17800, 8343}, new char[]{0, 0, 0, 0}, new char[]{20208, 57976, 58037, 5195}, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(fdsDisplayType);
            sb.append(")");
            String string = sb.toString();
            int i2 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 39 / 0;
            }
            return string;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.type);
            parcel.writeString(this.title);
            parcel.writeString(this.message);
            ButtonInfo buttonInfo = this.buttonInfo;
            if (buttonInfo == null) {
                int i3 = onWarmupCompleted + 13;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(0);
                }
            } else {
                parcel.writeInt(1);
                buttonInfo.writeToParcel(parcel, i);
                int i4 = onExtraCallbackWithResult + 1;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
            Map<String, String> map = this.logParams;
            parcel.writeInt(map.size());
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                int i6 = onExtraCallbackWithResult + 95;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    Map.Entry<String, String> next = it.next();
                    parcel.writeString(next.getKey());
                    parcel.writeString(next.getValue());
                    int i7 = 48 / 0;
                } else {
                    Map.Entry<String, String> next2 = it.next();
                    parcel.writeString(next2.getKey());
                    parcel.writeString(next2.getValue());
                }
            }
            parcel.writeParcelable(this.iconInfo, i);
            FdsDisplayType fdsDisplayType = this.fdsDisplayType;
            if (fdsDisplayType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(fdsDisplayType.name());
            }
        }

        public static final class Companion {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<FullPage> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 101;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                PreSendAlert$FullPage$$serializer preSendAlert$FullPage$$serializer = PreSendAlert$FullPage$$serializer.INSTANCE;
                int i4 = onNavigationEvent + 115;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return preSendAlert$FullPage$$serializer;
            }
        }

        static {
            IAuthTabCallbackStub = 0;
            IAuthTabCallback_Parcel();
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            CREATOR = new onWarmupCompleted();
            TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.PreSendAlert$FullPage$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 73;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        PreSendAlert.FullPage.onWarmupCompleted();
                        throw null;
                    }
                    KSerializer kSerializerOnWarmupCompleted = PreSendAlert.FullPage.onWarmupCompleted();
                    int i3 = onNavigationEvent + 43;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return kSerializerOnWarmupCompleted;
                }
            }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.PreSendAlert$FullPage$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 117;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerOnTransact = PreSendAlert.FullPage.onTransact();
                    if (i3 == 0) {
                        int i4 = 78 / 0;
                    }
                    return kSerializerOnTransact;
                }
            }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.PreSendAlert$FullPage$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 63;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerAsBinder = PreSendAlert.FullPage.asBinder();
                    int i4 = IAuthTabCallback + 51;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        return kSerializerAsBinder;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            })};
            int i = IAuthTabCallbackDefault + 43;
            IAuthTabCallbackStub = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FullPage(int i, String str, String str2, String str3, ButtonInfo buttonInfo, Map map, IconInfo iconInfo, FdsDisplayType fdsDisplayType, okycx okycxVar) {
            super(null);
            if (1 != (i & 1)) {
                htf31.onExtraCallbackWithResult(i, 1, PreSendAlert$FullPage$$serializer.INSTANCE.getDescriptor());
                int i2 = 2 % 2;
            }
            this.type = str;
            if ((i & 2) == 0) {
                this.title = "";
            } else {
                this.title = str2;
                int i3 = 2 % 2;
            }
            if ((i & 4) == 0) {
                int i4 = onExtraCallbackWithResult + 119;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                this.message = null;
                if (i5 == 0) {
                    throw null;
                }
            } else {
                this.message = str3;
                int i6 = 2 % 2;
            }
            if ((i & 8) == 0) {
                int i7 = onExtraCallbackWithResult + 69;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                this.buttonInfo = null;
            } else {
                this.buttonInfo = buttonInfo;
                int i9 = onWarmupCompleted + 3;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 2 % 2;
            }
            if ((i & 16) == 0) {
                int i12 = onExtraCallbackWithResult + 23;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                this.logParams = access8100.onNavigationEvent();
            } else {
                this.logParams = map;
            }
            if ((i & 32) == 0) {
                int i14 = onWarmupCompleted + 43;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                this.iconInfo = null;
                if (i15 != 0) {
                    throw null;
                }
            } else {
                this.iconInfo = iconInfo;
            }
            if ((i & 64) != 0) {
                this.fdsDisplayType = fdsDisplayType;
                return;
            }
            int i16 = onWarmupCompleted;
            int i17 = i16 + 97;
            onExtraCallbackWithResult = i17 % 128;
            int i18 = i17 % 2;
            this.fdsDisplayType = null;
            if (i18 != 0) {
                throw null;
            }
            int i19 = i16 + 89;
            onExtraCallbackWithResult = i19 % 128;
            int i20 = i19 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FullPage(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable ButtonInfo buttonInfo, @NotNull Map<String, String> map, @Nullable IconInfo iconInfo, @Nullable FdsDisplayType fdsDisplayType) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.type = str;
            this.title = str2;
            this.message = str3;
            this.buttonInfo = buttonInfo;
            this.logParams = map;
            this.iconInfo = iconInfo;
            this.fdsDisplayType = fdsDisplayType;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i4 = i3 + 75;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return lazyArr;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.transfer.PreSendAlert.FullPage r7, o.vyl r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
            /*
                Method dump skipped, instructions count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PreSendAlert.FullPage.onNavigationEvent(viva.republica.toss.network.model.transfer.PreSendAlert$FullPage, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public String getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 119;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.type;
            int i5 = i2 + 103;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 37 / 0;
            }
            return str;
        }

        @Override // viva.republica.toss.network.model.transfer.PreSendAlert
        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 89;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.title;
            int i5 = i2 + 51;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // viva.republica.toss.network.model.transfer.PreSendAlert
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return this.message;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // viva.republica.toss.network.model.transfer.PreSendAlert
        public ButtonInfo onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.buttonInfo;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Map<String, String> IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Map<String, String> map = this.logParams;
            int i5 = i3 + 29;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return map;
        }

        public final IconInfo IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            IconInfo iconInfo = this.iconInfo;
            int i5 = i3 + 45;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return iconInfo;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // viva.republica.toss.network.model.transfer.PreSendAlert
        public FdsDisplayType onExtraCallbackWithResult() {
            FdsDisplayType fdsDisplayType;
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 5;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                fdsDisplayType = this.fdsDisplayType;
                int i4 = 27 / 0;
            } else {
                fdsDisplayType = this.fdsDisplayType;
            }
            int i5 = i2 + 89;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return fdsDisplayType;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i4 = $10 + 103;
                $11 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 43 - View.resolveSize(0, 0), 1452 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (-b3);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49122), 44 - View.resolveSizeAndState(0, 0, 0), (Process.myPid() >> 22) + 1494, 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - View.MeasureSpec.makeMeasureSpec(0, 0)), Color.blue(0) + 50, 22938 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 29 - View.combineMeasuredStates(0, 0), View.MeasureSpec.getMode(0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArr6);
            int i6 = $10 + 33;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            objArr[0] = str;
        }

        private static final /* synthetic */ KSerializer access100() {
            int iOnExtraCallback = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback2 = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
            return (KSerializer) onExtraCallbackWithResult(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[0], MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, -627566889, 627566890);
        }

        public static final /* synthetic */ Lazy[] asInterface() {
            int iOnExtraCallback = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback2 = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
            return (Lazy[]) onExtraCallbackWithResult(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[0], MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, -1322463959, 1322463959);
        }

        static void IAuthTabCallback_Parcel() {
            IAuthTabCallback = 7798559133331975163L;
            onExtraCallback = -1776194565;
            onNavigationEvent = (char) 38017;
        }
    }

    @liq
    public static final class Dialog extends PreSendAlert {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final Lazy<KSerializer<Object>>[] $childSerializers;
        public static final Parcelable.Creator<Dialog> CREATOR;
        public static final Companion Companion;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int[] onWarmupCompleted;
        private final ButtonInfo buttonInfo;
        private final FdsDisplayType fdsDisplayType;
        private final Map<String, String> logParams;
        private final String message;
        private final String title;
        private final String type;

        public static final class onWarmupCompleted implements Parcelable.Creator<Dialog> {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Dialog createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 121;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Dialog dialogOnWarmupCompleted = onWarmupCompleted(parcel);
                int i4 = onWarmupCompleted + 23;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return dialogOnWarmupCompleted;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Dialog[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 31;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    return onExtraCallback(i);
                }
                onExtraCallback(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Dialog[] onExtraCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 85;
                onExtraCallback = i3 % 128;
                Dialog[] dialogArr = new Dialog[i];
                if (i3 % 2 != 0) {
                    return dialogArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Dialog onWarmupCompleted(Parcel parcel) {
                ButtonInfo buttonInfoCreateFromParcel;
                FdsDisplayType fdsDisplayTypeValueOf;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    int i2 = onExtraCallback;
                    int i3 = i2 + 107;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = i2 + 103;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    buttonInfoCreateFromParcel = null;
                } else {
                    buttonInfoCreateFromParcel = ButtonInfo.CREATOR.createFromParcel(parcel);
                }
                ButtonInfo buttonInfo = buttonInfoCreateFromParcel;
                int i7 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i7);
                int i8 = 0;
                while (i8 != i7) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                    i8++;
                    int i9 = onExtraCallback + 89;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                }
                if (parcel.readInt() == 0) {
                    int i11 = onWarmupCompleted + 51;
                    onExtraCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 47 / 0;
                    }
                    fdsDisplayTypeValueOf = null;
                } else {
                    fdsDisplayTypeValueOf = FdsDisplayType.valueOf(parcel.readString());
                }
                return new Dialog(string, string2, string3, buttonInfo, linkedHashMap, fdsDisplayTypeValueOf);
            }
        }

        public static /* synthetic */ KSerializer IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerAccess100 = access100();
            int i4 = IAuthTabCallback + 69;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerAccess100;
        }

        private static final /* synthetic */ KSerializer access100() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<FdsDisplayType> kSerializerSerializer = FdsDisplayType.Companion.serializer();
            int i4 = onExtraCallback + 125;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerSerializer;
        }

        private static final /* synthetic */ KSerializer getInterfaceDescriptor() {
            int i = 2 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getwrigglelayout, getwrigglelayout);
            int i2 = onExtraCallback + 77;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 96 / 0;
            }
            return getmutilbackgrounddrawable;
        }

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer interfaceDescriptor = getInterfaceDescriptor();
            int i4 = IAuthTabCallback + 63;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return interfaceDescriptor;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 13;
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
            int i2 = IAuthTabCallback + 79;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) obj;
            if (!Intrinsics.areEqual(this.type, dialog.type)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.title, dialog.title)) {
                int i3 = onExtraCallback + 1;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.message, dialog.message)) {
                int i5 = IAuthTabCallback + 13;
                onExtraCallback = i5 % 128;
                return i5 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.buttonInfo, dialog.buttonInfo)) {
                return false;
            }
            if (Intrinsics.areEqual(this.logParams, dialog.logParams)) {
                return this.fdsDisplayType == dialog.fdsDisplayType;
            }
            int i6 = IAuthTabCallback + 113;
            onExtraCallback = i6 % 128;
            return i6 % 2 == 0;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int iHashCode3 = this.type.hashCode();
            int iHashCode4 = this.title.hashCode();
            String str = this.message;
            int iHashCode5 = 0;
            if (str == null) {
                int i2 = IAuthTabCallback + 123;
                onExtraCallback = i2 % 128;
                iHashCode = i2 % 2 == 0 ? 1 : 0;
            } else {
                iHashCode = str.hashCode();
            }
            ButtonInfo buttonInfo = this.buttonInfo;
            if (buttonInfo == null) {
                int i3 = onExtraCallback + 65;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = buttonInfo.hashCode();
            }
            int iHashCode6 = this.logParams.hashCode();
            FdsDisplayType fdsDisplayType = this.fdsDisplayType;
            if (fdsDisplayType != null) {
                int i5 = IAuthTabCallback + 71;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                iHashCode5 = fdsDisplayType.hashCode();
            }
            return (((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + iHashCode5;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            String str = this.type;
            String str2 = this.title;
            String str3 = this.message;
            ButtonInfo buttonInfo = this.buttonInfo;
            Map<String, String> map = this.logParams;
            FdsDisplayType fdsDisplayType = this.fdsDisplayType;
            StringBuilder sb = new StringBuilder();
            sb.append("Dialog(type=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", message=");
            sb.append(str3);
            sb.append(", buttonInfo=");
            sb.append(buttonInfo);
            sb.append(", logParams=");
            sb.append(map);
            Object[] objArr = new Object[1];
            a(new int[]{1584682601, -1699120144, -1258734900, -1838929016, 1211177599, 1925092997, -2137758469, -1282098752, 779967801, 159722429}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 18, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(fdsDisplayType);
            sb.append(")");
            String string = sb.toString();
            int i2 = onExtraCallback + 47;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return string;
            }
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.type);
            parcel.writeString(this.title);
            parcel.writeString(this.message);
            ButtonInfo buttonInfo = this.buttonInfo;
            if (buttonInfo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buttonInfo.writeToParcel(parcel, i);
                int i3 = onExtraCallback + 17;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            Map<String, String> map = this.logParams;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
            FdsDisplayType fdsDisplayType = this.fdsDisplayType;
            if (fdsDisplayType == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeString(fdsDisplayType.name());
            int i5 = onExtraCallback + 65;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Dialog> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 37;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                PreSendAlert$Dialog$$serializer preSendAlert$Dialog$$serializer = PreSendAlert$Dialog$$serializer.INSTANCE;
                int i4 = onNavigationEvent + 25;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return preSendAlert$Dialog$$serializer;
                }
                throw null;
            }
        }

        static {
            asBinder();
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            CREATOR = new onWarmupCompleted();
            TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.PreSendAlert$Dialog$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 65;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerOnWarmupCompleted = PreSendAlert.Dialog.onWarmupCompleted();
                    int i4 = onExtraCallback + 101;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        return kSerializerOnWarmupCompleted;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.PreSendAlert$Dialog$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 31;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        return PreSendAlert.Dialog.IAuthTabCallbackStub();
                    }
                    PreSendAlert.Dialog.IAuthTabCallbackStub();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            })};
            int i = onNavigationEvent + 47;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Dialog(int i, String str, String str2, String str3, ButtonInfo buttonInfo, Map map, FdsDisplayType fdsDisplayType, okycx okycxVar) {
            if (1 != (i & 1)) {
                int i2 = onExtraCallback + 45;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 1, PreSendAlert$Dialog$$serializer.INSTANCE.getDescriptor());
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            super(defaultConstructorMarker);
            this.type = str;
            if ((i & 2) == 0) {
                this.title = "";
            } else {
                this.title = str2;
                int i4 = 2 % 2;
            }
            if ((i & 4) == 0) {
                int i5 = onExtraCallback + 35;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                this.message = null;
                if (i6 != 0) {
                    defaultConstructorMarker.hashCode();
                    throw null;
                }
            } else {
                this.message = str3;
                int i7 = 2 % 2;
            }
            if ((i & 8) == 0) {
                this.buttonInfo = null;
            } else {
                this.buttonInfo = buttonInfo;
            }
            if ((i & 16) == 0) {
                this.logParams = access8100.onNavigationEvent();
            } else {
                this.logParams = map;
                int i8 = onExtraCallback + 51;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
            }
            if ((i & 32) == 0) {
                this.fdsDisplayType = null;
            } else {
                this.fdsDisplayType = fdsDisplayType;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable ButtonInfo buttonInfo, @NotNull Map<String, String> map, @Nullable FdsDisplayType fdsDisplayType) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.type = str;
            this.title = str2;
            this.message = str3;
            this.buttonInfo = buttonInfo;
            this.logParams = map;
            this.fdsDisplayType = fdsDisplayType;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[PHI: r1
          0x003b: PHI (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x002d, B:10:0x0039, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r1
          0x002f: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x002d, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.transfer.PreSendAlert.Dialog r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.PreSendAlert.Dialog.IAuthTabCallback
                int r1 = r1 + 119
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.Dialog.onExtraCallback = r2
                int r1 = r1 % r0
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L20
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.PreSendAlert.Dialog.$childSerializers
                java.lang.String r4 = r5.asInterface()
                r6.onExtraCallback(r7, r2, r4)
                boolean r2 = r6.onWarmupCompleted(r7, r3)
                if (r2 != 0) goto L3b
                goto L2f
            L20:
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.PreSendAlert.Dialog.$childSerializers
                java.lang.String r4 = r5.asInterface()
                r6.onExtraCallback(r7, r2, r4)
                boolean r2 = r6.onWarmupCompleted(r7, r3)
                if (r2 != 0) goto L3b
            L2f:
                java.lang.String r2 = r5.onNavigationEvent()
                java.lang.String r4 = ""
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                if (r2 != 0) goto L42
            L3b:
                java.lang.String r2 = r5.onNavigationEvent()
                r6.onExtraCallback(r7, r3, r2)
            L42:
                boolean r2 = r6.onWarmupCompleted(r7, r0)
                if (r2 != 0) goto L4e
                java.lang.String r2 = r5.IAuthTabCallback()
                if (r2 == 0) goto L57
            L4e:
                o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r3 = r5.IAuthTabCallback()
                r6.onExtraCallbackWithResult(r7, r0, r2, r3)
            L57:
                r2 = 3
                boolean r3 = r6.onWarmupCompleted(r7, r2)
                if (r3 != 0) goto L6d
                int r3 = viva.republica.toss.network.model.transfer.PreSendAlert.Dialog.IAuthTabCallback
                int r3 = r3 + 97
                int r4 = r3 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.Dialog.onExtraCallback = r4
                int r3 = r3 % r0
                viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo r3 = r5.onExtraCallback()
                if (r3 == 0) goto L76
            L6d:
                viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo$$serializer r3 = viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo$$serializer.INSTANCE
                viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo r4 = r5.onExtraCallback()
                r6.onExtraCallbackWithResult(r7, r2, r3, r4)
            L76:
                r2 = 4
                boolean r3 = r6.onWarmupCompleted(r7, r2)
                if (r3 != 0) goto L94
                int r3 = viva.republica.toss.network.model.transfer.PreSendAlert.Dialog.onExtraCallback
                int r3 = r3 + 87
                int r4 = r3 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.Dialog.IAuthTabCallback = r4
                int r3 = r3 % r0
                java.util.Map r0 = r5.IAuthTabCallbackDefault()
                java.util.Map r3 = o.access8100.onNavigationEvent()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r0 != 0) goto La3
            L94:
                r0 = r1[r2]
                java.lang.Object r0 = r0.getValue()
                o.py r0 = (o.py) r0
                java.util.Map r3 = r5.IAuthTabCallbackDefault()
                r6.onNavigationEvent(r7, r2, r0, r3)
            La3:
                r0 = 5
                boolean r2 = r6.onWarmupCompleted(r7, r0)
                if (r2 != 0) goto Lb0
                viva.republica.toss.network.model.transfer.PreSendAlert$FdsDisplayType r2 = r5.onExtraCallbackWithResult()
                if (r2 == 0) goto Lbf
            Lb0:
                r1 = r1[r0]
                java.lang.Object r1 = r1.getValue()
                o.py r1 = (o.py) r1
                viva.republica.toss.network.model.transfer.PreSendAlert$FdsDisplayType r5 = r5.onExtraCallbackWithResult()
                r6.onExtraCallbackWithResult(r7, r0, r1, r5)
            Lbf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PreSendAlert.Dialog.IAuthTabCallback(viva.republica.toss.network.model.transfer.PreSendAlert$Dialog, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public static final /* synthetic */ Lazy[] onTransact() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i3 + 1;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return lazyArr;
        }

        public String asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.type;
            int i5 = i3 + 113;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // viva.republica.toss.network.model.transfer.PreSendAlert
        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.title;
            int i5 = i3 + 87;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // viva.republica.toss.network.model.transfer.PreSendAlert
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 33;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.message;
            int i5 = i2 + 121;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // viva.republica.toss.network.model.transfer.PreSendAlert
        public ButtonInfo onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ButtonInfo buttonInfo = this.buttonInfo;
            if (i3 != 0) {
                int i4 = 9 / 0;
            }
            return buttonInfo;
        }

        public Map<String, String> IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            Map<String, String> map = this.logParams;
            int i4 = i3 + 69;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return map;
            }
            obj.hashCode();
            throw null;
        }

        @Override // viva.republica.toss.network.model.transfer.PreSendAlert
        public FdsDisplayType onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 49;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            FdsDisplayType fdsDisplayType = this.fdsDisplayType;
            int i5 = i2 + 91;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 47 / 0;
            }
            return fdsDisplayType;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onWarmupCompleted;
            int i4 = -1469660336;
            int i5 = 0;
            if (iArr2 != null) {
                int i6 = $10 + 101;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i8 = 0;
                while (i8 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 72 - Color.argb(0, 0, 0, 0), 8848 - (Process.myPid() >> 22), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i8++;
                        i4 = -1469660336;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i9 = $10 + 29;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onWarmupCompleted;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i11 = 0;
                while (i11 < length3) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr5[i11]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), Process.getGidForName("") + 73, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i11++;
                    int i12 = $11 + 83;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 4 % 3;
                    }
                    i5 = 0;
                }
                i2 = i5;
                iArr5 = iArr6;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr5, i2, iArr4, i2, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i14 = $11 + 121;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i16 = 0;
                for (int i17 = 16; i16 < i17; i17 = 16) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i16];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 22253), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 39, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10300, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i16++;
                    int i18 = $10 + 23;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                }
                int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i20;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i22 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4032 - TextUtils.lastIndexOf("", '0', 0, 0)), 78 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        static void asBinder() {
            onWarmupCompleted = new int[]{1488324044, 347184652, 1894580247, -651604579, 112735744, -102875297, 519112615, -48784046, -993899807, -1011534160, -326994964, -323287800, -1008347723, -775706853, -1225554480, -1176180896, 625135170, 39373352};
        }
    }

    @liq
    public static final class ButtonInfo implements Parcelable {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final Button primary;
        private final Button secondary;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<ButtonInfo> CREATOR = new onExtraCallbackWithResult();

        public static final class onExtraCallbackWithResult implements Parcelable.Creator<ButtonInfo> {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ButtonInfo createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 27;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                ButtonInfo buttonInfoOnNavigationEvent = onNavigationEvent(parcel);
                if (i3 == 0) {
                    int i4 = 74 / 0;
                }
                return buttonInfoOnNavigationEvent;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ButtonInfo[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 93;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                ButtonInfo[] buttonInfoArrOnWarmupCompleted = onWarmupCompleted(i);
                int i5 = onExtraCallback + 79;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return buttonInfoArrOnWarmupCompleted;
            }

            public final ButtonInfo onNavigationEvent(Parcel parcel) {
                Button buttonCreateFromParcel;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 113;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Button buttonCreateFromParcel2 = null;
                Intrinsics.checkNotNullParameter(parcel, "");
                if (i3 != 0) {
                    parcel.readInt();
                    buttonCreateFromParcel2.hashCode();
                    throw null;
                }
                if (parcel.readInt() == 0) {
                    int i4 = onExtraCallback + 1;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    buttonCreateFromParcel = null;
                } else {
                    buttonCreateFromParcel = Button.CREATOR.createFromParcel(parcel);
                }
                Button button = buttonCreateFromParcel;
                if (parcel.readInt() == 0) {
                    int i6 = onExtraCallback + 15;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    buttonCreateFromParcel2 = Button.CREATOR.createFromParcel(parcel);
                }
                return new ButtonInfo(button, buttonCreateFromParcel2);
            }

            public final ButtonInfo[] onWarmupCompleted(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 49;
                onExtraCallback = i3 % 128;
                ButtonInfo[] buttonInfoArr = new ButtonInfo[i];
                if (i3 % 2 == 0) {
                    return buttonInfoArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i = onNavigationEvent + 125;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ButtonInfo() {
            Button button = null;
            this(button, button, 3, (DefaultConstructorMarker) button);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 113;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 77;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo) != false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        
            r6 = (viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.primary, r6.primary) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.secondary, r6.secondary) != false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        
            r6 = viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo.onExtraCallbackWithResult + 79;
            viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo.onWarmupCompleted = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
        
            if ((r6 % 2) != 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
        
            r6 = viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo.onWarmupCompleted + 97;
            viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo.onExtraCallbackWithResult = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        
            return false;
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
                int r1 = viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo.onExtraCallbackWithResult
                int r1 = r1 + 11
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo.onWarmupCompleted = r2
                int r1 = r1 % r0
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L16
                r1 = 17
                int r1 = r1 / r3
                if (r5 != r6) goto L19
                goto L18
            L16:
                if (r5 != r6) goto L19
            L18:
                return r2
            L19:
                boolean r1 = r6 instanceof viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo
                if (r1 != 0) goto L1e
                return r3
            L1e:
                viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo r6 = (viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo) r6
                viva.republica.toss.network.model.transfer.PreSendAlert$Button r1 = r5.primary
                viva.republica.toss.network.model.transfer.PreSendAlert$Button r4 = r6.primary
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
                if (r1 == 0) goto L42
                viva.republica.toss.network.model.transfer.PreSendAlert$Button r1 = r5.secondary
                viva.republica.toss.network.model.transfer.PreSendAlert$Button r6 = r6.secondary
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
                if (r6 != 0) goto L41
                int r6 = viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo.onExtraCallbackWithResult
                int r6 = r6 + 79
                int r1 = r6 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo.onWarmupCompleted = r1
                int r6 = r6 % r0
                if (r6 != 0) goto L40
                return r2
            L40:
                return r3
            L41:
                return r2
            L42:
                int r6 = viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo.onWarmupCompleted
                int r6 = r6 + 97
                int r1 = r6 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo.onExtraCallbackWithResult = r1
                int r6 = r6 % r0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Button button = this.primary;
            int iHashCode = 0;
            int iHashCode2 = button == null ? 0 : button.hashCode();
            Button button2 = this.secondary;
            if (button2 != null) {
                int i4 = onWarmupCompleted + 113;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = button2.hashCode();
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ButtonInfo(primary=" + this.primary + ", secondary=" + this.secondary + ")";
            int i2 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Button button = this.primary;
            if (button == null) {
                int i5 = onExtraCallbackWithResult + 101;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                button.writeToParcel(parcel, i);
            }
            Button button2 = this.secondary;
            if (button2 != null) {
                parcel.writeInt(1);
                button2.writeToParcel(parcel, i);
            } else {
                int i7 = onExtraCallbackWithResult + 23;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                parcel.writeInt(0);
            }
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ButtonInfo> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 31;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                PreSendAlert$ButtonInfo$$serializer preSendAlert$ButtonInfo$$serializer = PreSendAlert$ButtonInfo$$serializer.INSTANCE;
                if (i3 == 0) {
                    return preSendAlert$ButtonInfo$$serializer;
                }
                throw null;
            }
        }

        public /* synthetic */ ButtonInfo(int i, Button button, Button button2, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.primary = null;
                int i2 = onWarmupCompleted + 99;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } else {
                this.primary = button;
            }
            if ((i & 2) != 0) {
                this.secondary = button2;
                return;
            }
            int i5 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            this.secondary = null;
            if (i6 == 0) {
                int i7 = 14 / 0;
            }
        }

        public ButtonInfo(@Nullable Button button, @Nullable Button button2) {
            this.primary = button;
            this.secondary = button2;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo.onWarmupCompleted
                int r1 = r1 + 63
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo.onExtraCallbackWithResult = r2
                int r1 = r1 % r0
                r1 = 0
                boolean r2 = r6.onWarmupCompleted(r7, r1)
                if (r2 != 0) goto L17
                viva.republica.toss.network.model.transfer.PreSendAlert$Button r2 = r5.primary
                if (r2 == 0) goto L1e
            L17:
                viva.republica.toss.network.model.transfer.PreSendAlert$Button$$serializer r2 = viva.republica.toss.network.model.transfer.PreSendAlert$Button$$serializer.INSTANCE
                viva.republica.toss.network.model.transfer.PreSendAlert$Button r3 = r5.primary
                r6.onExtraCallbackWithResult(r7, r1, r2, r3)
            L1e:
                r2 = 1
                boolean r3 = r6.onWarmupCompleted(r7, r2)
                if (r3 != 0) goto L3c
                int r3 = viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo.onWarmupCompleted
                int r3 = r3 + 43
                int r4 = r3 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo.onExtraCallbackWithResult = r4
                int r3 = r3 % r0
                if (r3 == 0) goto L38
                viva.republica.toss.network.model.transfer.PreSendAlert$Button r3 = r5.secondary
                r4 = 79
                int r4 = r4 / r1
                if (r3 == 0) goto L43
                goto L3c
            L38:
                viva.republica.toss.network.model.transfer.PreSendAlert$Button r1 = r5.secondary
                if (r1 == 0) goto L43
            L3c:
                viva.republica.toss.network.model.transfer.PreSendAlert$Button$$serializer r1 = viva.republica.toss.network.model.transfer.PreSendAlert$Button$$serializer.INSTANCE
                viva.republica.toss.network.model.transfer.PreSendAlert$Button r5 = r5.secondary
                r6.onExtraCallbackWithResult(r7, r2, r1, r5)
            L43:
                int r5 = viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo.onWarmupCompleted
                int r5 = r5 + 15
                int r6 = r5 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo.onExtraCallbackWithResult = r6
                int r5 = r5 % r0
                if (r5 != 0) goto L4f
                return
            L4f:
                r5 = 0
                r5.hashCode()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo.onExtraCallback(viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ButtonInfo(Button button, Button button2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallbackWithResult + 33;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
                button = null;
            }
            if ((i & 2) != 0) {
                int i5 = onExtraCallbackWithResult + 89;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                button2 = null;
            }
            this(button, button2);
        }

        public final Button onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Button button = this.primary;
            if (i3 == 0) {
                int i4 = 63 / 0;
            }
            return button;
        }

        public final Button onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 69;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            Button button = this.secondary;
            int i4 = i2 + 29;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return button;
            }
            throw null;
        }
    }

    @liq
    public static final class Button implements Parcelable {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final onExtraCallback action;
        private final JsonElement additionalMetaForSend;
        private final String schemeUrl;
        private final String text;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Button> CREATOR = new onNavigationEvent();
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.PreSendAlert$Button$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 99;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = PreSendAlert.Button.onExtraCallback();
                int i4 = onNavigationEvent + 123;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnExtraCallback;
                }
                throw null;
            }
        }), null, null};

        public static final class onNavigationEvent implements Parcelable.Creator<Button> {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Button createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 3;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Button buttonOnWarmupCompleted = onWarmupCompleted(parcel);
                if (i3 == 0) {
                    int i4 = 19 / 0;
                }
                return buttonOnWarmupCompleted;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Button[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 73;
                onNavigationEvent = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    onNavigationEvent(i);
                    obj.hashCode();
                    throw null;
                }
                Button[] buttonArrOnNavigationEvent = onNavigationEvent(i);
                int i4 = onNavigationEvent + 63;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return buttonArrOnNavigationEvent;
                }
                obj.hashCode();
                throw null;
            }

            public final Button[] onNavigationEvent(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 103;
                int i4 = i3 % 128;
                IAuthTabCallback = i4;
                int i5 = i3 % 2;
                Button[] buttonArr = new Button[i];
                int i6 = i4 + 35;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    return buttonArr;
                }
                throw null;
            }

            public final Button onWarmupCompleted(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                Button button = new Button(parcel.readString(), onExtraCallback.valueOf(parcel.readString()), parcel.readString(), (JsonElement) null, 8, (DefaultConstructorMarker) null);
                int i2 = onNavigationEvent + 51;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return button;
                }
                throw null;
            }
        }

        public Button() {
            this((String) null, (onExtraCallback) null, (String) null, (JsonElement) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            KSerializer kSerializer = (KSerializer) onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1767090785, 1767090785, new Object[0], iOnExtraCallback3, iOnExtraCallback2, iOnExtraCallback);
            int i4 = onExtraCallback + 73;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializer;
            }
            throw null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 79;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 93;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 66 / 0;
            }
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            if ((!Intrinsics.areEqual(this.text, button.text)) || this.action != button.action) {
                return false;
            }
            if (!Intrinsics.areEqual(this.schemeUrl, button.schemeUrl)) {
                int i2 = onNavigationEvent + 117;
                onExtraCallback = i2 % 128;
                return i2 % 2 == 0;
            }
            if (Intrinsics.areEqual(this.additionalMetaForSend, button.additionalMetaForSend)) {
                return true;
            }
            int i3 = onExtraCallback + 97;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.text.hashCode();
            int iHashCode3 = this.action.hashCode();
            String str = this.schemeUrl;
            if (str == null) {
                int i2 = onNavigationEvent + 55;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            JsonElement jsonElement = this.additionalMetaForSend;
            int iHashCode4 = (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + (jsonElement != null ? jsonElement.hashCode() : 0);
            int i4 = onNavigationEvent + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode4;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Button(text=" + this.text + ", action=" + this.action + ", schemeUrl=" + this.schemeUrl + ", additionalMetaForSend=" + this.additionalMetaForSend + ")";
            int i2 = onExtraCallback + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 25;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i4 == 0) {
                parcel.writeString(this.text);
                parcel.writeString(this.action.name());
                parcel.writeString(this.schemeUrl);
                int i5 = 24 / 0;
            } else {
                parcel.writeString(this.text);
                parcel.writeString(this.action.name());
                parcel.writeString(this.schemeUrl);
            }
            int i6 = onNavigationEvent + 123;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Button> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 111;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                PreSendAlert$Button$$serializer preSendAlert$Button$$serializer = PreSendAlert$Button$$serializer.INSTANCE;
                int i4 = IAuthTabCallback + 59;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return preSendAlert$Button$$serializer;
            }
        }

        static {
            int i = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 48 / 0;
            }
        }

        public /* synthetic */ Button(int i, String str, onExtraCallback onextracallback, String str2, JsonElement jsonElement, okycx okycxVar) {
            if ((i & 1) == 0) {
                int i2 = 2 % 2;
                str = "";
            }
            this.text = str;
            if ((i & 2) == 0) {
                int i3 = onNavigationEvent + 109;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                this.action = onExtraCallback.CLOSE;
            } else {
                this.action = onextracallback;
            }
            if ((i & 4) == 0) {
                int i5 = onExtraCallback + 71;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                this.schemeUrl = null;
                if (i6 != 0) {
                    throw null;
                }
            } else {
                this.schemeUrl = str2;
                int i7 = onNavigationEvent + 71;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            }
            if ((i & 8) == 0) {
                this.additionalMetaForSend = null;
            } else {
                this.additionalMetaForSend = jsonElement;
            }
        }

        public Button(@NotNull String str, @NotNull onExtraCallback onextracallback, @Nullable String str2, @Nullable JsonElement jsonElement) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.text = str;
            this.action = onextracallback;
            this.schemeUrl = str2;
            this.additionalMetaForSend = jsonElement;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.transfer.PreSendAlert.Button r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.PreSendAlert.Button.onExtraCallback
                int r1 = r1 + 25
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.Button.onNavigationEvent = r2
                int r1 = r1 % r0
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.PreSendAlert.Button.$childSerializers
                r2 = 0
                boolean r3 = r7.onWarmupCompleted(r8, r2)
                r4 = 1
                if (r3 != 0) goto L22
                java.lang.String r3 = r6.text
                java.lang.String r5 = ""
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r5)
                r3 = r3 ^ r4
                if (r3 == r4) goto L22
                goto L27
            L22:
                java.lang.String r3 = r6.text
                r7.onExtraCallback(r8, r2, r3)
            L27:
                boolean r3 = r7.onWarmupCompleted(r8, r4)
                if (r3 != 0) goto L33
                viva.republica.toss.network.model.transfer.PreSendAlert$Button$onExtraCallback r3 = r6.action
                viva.republica.toss.network.model.transfer.PreSendAlert$Button$onExtraCallback r5 = viva.republica.toss.network.model.transfer.PreSendAlert.Button.onExtraCallback.CLOSE
                if (r3 == r5) goto L40
            L33:
                r1 = r1[r4]
                java.lang.Object r1 = r1.getValue()
                o.py r1 = (o.py) r1
                viva.republica.toss.network.model.transfer.PreSendAlert$Button$onExtraCallback r3 = r6.action
                r7.onNavigationEvent(r8, r4, r1, r3)
            L40:
                boolean r1 = r7.onWarmupCompleted(r8, r0)
                if (r1 != 0) goto L5d
                int r1 = viva.republica.toss.network.model.transfer.PreSendAlert.Button.onNavigationEvent
                int r1 = r1 + 81
                int r3 = r1 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.Button.onExtraCallback = r3
                int r1 = r1 % r0
                if (r1 != 0) goto L59
                java.lang.String r1 = r6.schemeUrl
                r3 = 95
                int r3 = r3 / r2
                if (r1 == 0) goto L64
                goto L5d
            L59:
                java.lang.String r1 = r6.schemeUrl
                if (r1 == 0) goto L64
            L5d:
                o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r2 = r6.schemeUrl
                r7.onExtraCallbackWithResult(r8, r0, r1, r2)
            L64:
                r0 = 3
                boolean r1 = r7.onWarmupCompleted(r8, r0)
                if (r1 == r4) goto L6f
                kotlinx.serialization.json.JsonElement r1 = r6.additionalMetaForSend
                if (r1 == 0) goto L76
            L6f:
                o.clickEvent r1 = o.clickEvent.onExtraCallback
                kotlinx.serialization.json.JsonElement r6 = r6.additionalMetaForSend
                r7.onExtraCallbackWithResult(r8, r0, r1, r6)
            L76:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PreSendAlert.Button.IAuthTabCallback(viva.republica.toss.network.model.transfer.PreSendAlert$Button, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i4 = i3 + 77;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return lazyArr;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Button(String str, onExtraCallback onextracallback, String str2, JsonElement jsonElement, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = 2 % 2;
                str = "";
            }
            if ((i & 2) != 0) {
                int i3 = onNavigationEvent + 97;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                onextracallback = onExtraCallback.CLOSE;
                int i5 = onNavigationEvent + 1;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
            }
            if ((i & 4) != 0) {
                int i7 = onExtraCallback + 69;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 22 / 0;
                }
                str2 = null;
            }
            if ((i & 8) != 0) {
                int i9 = onExtraCallback + 7;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                jsonElement = null;
            }
            this(str, onextracallback, str2, jsonElement);
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            Button button = (Button) objArr[0];
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = button.text;
            if (i3 == 0) {
                int i4 = 62 / 0;
            }
            return str;
        }

        public final onExtraCallback onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = this.action;
            if (i3 != 0) {
                int i4 = 51 / 0;
            }
            return onextracallback;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.schemeUrl;
            int i5 = i3 + 55;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final JsonElement IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 73;
            onExtraCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            JsonElement jsonElement = this.additionalMetaForSend;
            int i4 = i2 + 29;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return jsonElement;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class onExtraCallback {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ onExtraCallback[] $VALUES;
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted = 1;
            private final String logName;
            public static final onExtraCallback SEND = new onExtraCallback("SEND", 0, "SEND");
            public static final onExtraCallback RETRY = new onExtraCallback("RETRY", 1, "RETRY");
            public static final onExtraCallback SCHEME = new onExtraCallback("SCHEME", 2, "SCHEME");
            public static final onExtraCallback CLOSE = new onExtraCallback("CLOSE", 3, "CLOSE");
            public static final onExtraCallback CANCEL_SEND = new onExtraCallback("CANCEL_SEND", 4, "CANCEL_SEND");

            private static final /* synthetic */ onExtraCallback[] $values() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 121;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                onExtraCallback[] onextracallbackArr = {SEND, RETRY, SCHEME, CLOSE, CANCEL_SEND};
                int i5 = i3 + 13;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return onextracallbackArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static EnumEntries<onExtraCallback> getEntries() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 83;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
                int i5 = i3 + 105;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return enumEntries;
            }

            public static onExtraCallback valueOf(String str) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 69;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
                int i4 = onNavigationEvent + 71;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return onextracallback;
            }

            public static onExtraCallback[] values() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 109;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
                int i4 = onExtraCallbackWithResult + 95;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return onextracallbackArr;
                }
                throw null;
            }

            private onExtraCallback(String str, int i, String str2) {
                this.logName = str2;
            }

            public final String getLogName() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 15;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                String str = this.logName;
                int i5 = i3 + 27;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            static {
                onExtraCallback[] onextracallbackArr$values = $values();
                $VALUES = onextracallbackArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
                int i = IAuthTabCallback + 55;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = (~(i3 | i6)) | i2;
            int i8 = (~((~i6) | i3)) | i2;
            int i9 = (~i2) | i3;
            int i10 = i2 + i3 + i5 + (440753341 * i4) + ((-634449194) * i);
            int i11 = i10 * i10;
            int i12 = ((-907101825) * i2) + 1075183616 + ((-1421434046) * i3) + (i7 * (-1603099839)) + ((-1603099839) * i8) + (1603099839 * i9) + (181665792 * i5) + (780402688 * i4) + ((-180879360) * i) + (353763328 * i11);
            int i13 = (i2 * 892202253) + 1676176333 + (i3 * 892200102) + (i7 * (-717)) + (i8 * (-717)) + (i9 * 717) + (i5 * 892200819) + (i4 * (-770690073)) + (i * 448958498) + (i11 * 1390542848);
            if (i12 + (i13 * i13 * (-1042677760)) == 1) {
                return onWarmupCompleted(objArr);
            }
            int i14 = 2 % 2;
            int i15 = onExtraCallback + 63;
            onNavigationEvent = i15 % 128;
            int i16 = i15 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.PreSendAlert.Button.Action", onExtraCallback.values());
            int i17 = onExtraCallback + 101;
            onNavigationEvent = i17 % 128;
            int i18 = i17 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }

        private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            return (KSerializer) onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1767090785, 1767090785, new Object[0], iOnExtraCallback3, iOnExtraCallback2, iOnExtraCallback);
        }

        public final String onTransact() {
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            return (String) onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1439505342, -1439505341, new Object[]{this}, iOnExtraCallback3, iOnExtraCallback2, iOnExtraCallback);
        }
    }

    @liq
    public static final class Attachment implements Parcelable {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String name;
        private final String nameTdsColor;
        private final String value;
        private final String valueTdsColor;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Attachment> CREATOR = new onNavigationEvent();

        public static final class onNavigationEvent implements Parcelable.Creator<Attachment> {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Attachment[] IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 21;
                onNavigationEvent = i3 % 128;
                Attachment[] attachmentArr = new Attachment[i];
                if (i3 % 2 != 0) {
                    int i4 = 31 / 0;
                }
                return attachmentArr;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Attachment createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 125;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Attachment attachmentOnExtraCallback = onExtraCallback(parcel);
                int i4 = onNavigationEvent + 41;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return attachmentOnExtraCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Attachment[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 109;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Attachment[] attachmentArrIAuthTabCallback = IAuthTabCallback(i);
                if (i4 != 0) {
                    int i5 = 88 / 0;
                }
                return attachmentArrIAuthTabCallback;
            }

            public final Attachment onExtraCallback(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                Attachment attachment = new Attachment(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                int i2 = onNavigationEvent + 115;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return attachment;
            }
        }

        static {
            int i = onExtraCallback + 123;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public Attachment() {
            this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 25;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 27;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 23;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                int i4 = i2 + 79;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            if (!(obj instanceof Attachment)) {
                return false;
            }
            Attachment attachment = (Attachment) obj;
            if (!Intrinsics.areEqual(this.name, attachment.name)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.nameTdsColor, attachment.nameTdsColor)) {
                int i6 = IAuthTabCallback + 33;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.value, attachment.value)) {
                int i8 = IAuthTabCallback + 15;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.valueTdsColor, attachment.valueTdsColor)) {
                return true;
            }
            int i10 = IAuthTabCallback + 61;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[PHI: r1 r3
          0x0026: PHI (r1v14 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
          0x0026: PHI (r3v3 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
          0x0024: PHI (r1v6 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int hashCode() {
            /*
                r7 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.IAuthTabCallback
                int r1 = r1 + 1
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.onWarmupCompleted = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 != 0) goto L1a
                java.lang.String r1 = r7.name
                int r1 = r1.hashCode()
                java.lang.String r3 = r7.nameTdsColor
                if (r3 != 0) goto L26
                goto L24
            L1a:
                java.lang.String r1 = r7.name
                int r1 = r1.hashCode()
                java.lang.String r3 = r7.nameTdsColor
                if (r3 != 0) goto L26
            L24:
                r3 = r2
                goto L2a
            L26:
                int r3 = r3.hashCode()
            L2a:
                java.lang.String r4 = r7.value
                if (r4 != 0) goto L30
                r4 = r2
                goto L34
            L30:
                int r4 = r4.hashCode()
            L34:
                java.lang.String r5 = r7.valueTdsColor
                if (r5 == 0) goto L45
                int r2 = r5.hashCode()
                int r5 = viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.IAuthTabCallback
                int r5 = r5 + 85
                int r6 = r5 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.onWarmupCompleted = r6
                int r5 = r5 % r0
            L45:
                int r1 = r1 * 31
                int r1 = r1 + r3
                int r1 = r1 * 31
                int r1 = r1 + r4
                int r1 = r1 * 31
                int r1 = r1 + r2
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.hashCode():int");
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Attachment(name=" + this.name + ", nameTdsColor=" + this.nameTdsColor + ", value=" + this.value + ", valueTdsColor=" + this.valueTdsColor + ")";
            int i2 = IAuthTabCallback + 111;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 7;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.name);
            parcel.writeString(this.nameTdsColor);
            parcel.writeString(this.value);
            parcel.writeString(this.valueTdsColor);
            int i5 = onWarmupCompleted + 89;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Attachment> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 83;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                PreSendAlert$Attachment$$serializer preSendAlert$Attachment$$serializer = PreSendAlert$Attachment$$serializer.INSTANCE;
                int i4 = onExtraCallbackWithResult + 17;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return preSendAlert$Attachment$$serializer;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Attachment(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, o.okycx r7) {
            /*
                r1 = this;
                r1.<init>()
                r7 = r2 & 1
                r0 = 2
                if (r7 != 0) goto L18
                int r3 = viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.IAuthTabCallback
                int r3 = r3 + 17
                int r7 = r3 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.onWarmupCompleted = r7
                int r3 = r3 % r0
                if (r3 != 0) goto L14
                goto L16
            L14:
                int r3 = r0 % r0
            L16:
                java.lang.String r3 = ""
            L18:
                r1.name = r3
                r3 = r2 & 2
                r7 = 0
                if (r3 != 0) goto L2d
                r1.nameTdsColor = r7
                int r3 = viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.IAuthTabCallback
                int r3 = r3 + 1
                int r4 = r3 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.onWarmupCompleted = r4
                int r3 = r3 % r0
                if (r3 != 0) goto L38
                goto L3a
            L2d:
                r1.nameTdsColor = r4
                int r3 = viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.IAuthTabCallback
                int r3 = r3 + 45
                int r4 = r3 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.onWarmupCompleted = r4
                int r3 = r3 % r0
            L38:
                int r3 = r0 % r0
            L3a:
                r3 = r2 & 4
                if (r3 != 0) goto L4c
                int r3 = viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.IAuthTabCallback
                int r3 = r3 + 19
                int r4 = r3 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.onWarmupCompleted = r4
                int r3 = r3 % r0
                r1.value = r7
                int r3 = r0 % r0
                goto L4e
            L4c:
                r1.value = r5
            L4e:
                r2 = r2 & 8
                if (r2 != 0) goto L5e
                int r2 = viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.onWarmupCompleted
                int r2 = r2 + 61
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.IAuthTabCallback = r3
                int r2 = r2 % r0
                r1.valueTdsColor = r7
                return
            L5e:
                r1.valueTdsColor = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.okycx):void");
        }

        public Attachment(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
            this.nameTdsColor = str2;
            this.value = str3;
            this.valueTdsColor = str4;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.transfer.PreSendAlert.Attachment r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.onWarmupCompleted
                int r1 = r1 + 15
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.IAuthTabCallback = r2
                int r1 = r1 % r0
                r1 = 0
                boolean r2 = r6.onWarmupCompleted(r7, r1)
                if (r2 != 0) goto L26
                int r2 = viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.IAuthTabCallback
                int r2 = r2 + 25
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.onWarmupCompleted = r3
                int r2 = r2 % r0
                java.lang.String r2 = r5.name
                java.lang.String r3 = ""
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                if (r2 != 0) goto L2b
            L26:
                java.lang.String r2 = r5.name
                r6.onExtraCallback(r7, r1, r2)
            L2b:
                r2 = 1
                boolean r3 = r6.onWarmupCompleted(r7, r2)
                if (r3 != 0) goto L3f
                int r3 = viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.onWarmupCompleted
                int r3 = r3 + 123
                int r4 = r3 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.IAuthTabCallback = r4
                int r3 = r3 % r0
                java.lang.String r3 = r5.nameTdsColor
                if (r3 == 0) goto L46
            L3f:
                o.getWriggleLayout r3 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r4 = r5.nameTdsColor
                r6.onExtraCallbackWithResult(r7, r2, r3, r4)
            L46:
                boolean r3 = r6.onWarmupCompleted(r7, r0)
                if (r3 == r2) goto L50
                java.lang.String r3 = r5.value
                if (r3 == 0) goto L57
            L50:
                o.getWriggleLayout r3 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r4 = r5.value
                r6.onExtraCallbackWithResult(r7, r0, r3, r4)
            L57:
                r3 = 3
                boolean r4 = r6.onWarmupCompleted(r7, r3)
                r4 = r4 ^ r2
                if (r4 == r2) goto L60
                goto L6d
            L60:
                int r2 = viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.onWarmupCompleted
                int r2 = r2 + 69
                int r4 = r2 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.IAuthTabCallback = r4
                int r2 = r2 % r0
                java.lang.String r2 = r5.valueTdsColor
                if (r2 == 0) goto L74
            L6d:
                o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r5 = r5.valueTdsColor
                r6.onExtraCallbackWithResult(r7, r3, r2, r5)
            L74:
                int r5 = viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.IAuthTabCallback
                int r5 = r5 + 109
                int r6 = r5 % 128
                viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.onWarmupCompleted = r6
                int r5 = r5 % r0
                if (r5 != 0) goto L82
                r5 = 84
                int r5 = r5 / r1
            L82:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PreSendAlert.Attachment.onExtraCallback(viva.republica.toss.network.model.transfer.PreSendAlert$Attachment, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Attachment(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = 2 % 2;
                str = "";
            }
            if ((i & 2) != 0) {
                int i3 = IAuthTabCallback;
                int i4 = i3 + 109;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 21 / 0;
                }
                int i6 = i3 + 61;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
                str2 = null;
            }
            if ((i & 4) != 0) {
                int i8 = IAuthTabCallback + 63;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
                str3 = null;
            }
            if ((i & 8) != 0) {
                int i9 = IAuthTabCallback + 109;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                str4 = null;
            }
            this(str, str2, str3, str4);
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 59;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.name;
            int i4 = i2 + 67;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.nameTdsColor;
            int i5 = i3 + 15;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 68 / 0;
            }
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.value;
            int i5 = i3 + 107;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onExtraCallbackWithResult() {
            String str;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                str = this.valueTdsColor;
                int i4 = 74 / 0;
            } else {
                str = this.valueTdsColor;
            }
            int i5 = i3 + 41;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    @appInfo(IAuthTabCallback = "type")
    @liq
    public static abstract class IconInfo implements Parcelable {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Companion Companion;
        private static char IAuthTabCallback = 0;
        private static int asBinder = 1;
        private static char[] onExtraCallback = null;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ IconInfo(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ KSerializer onExtraCallback() throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
            if (i3 == 0) {
                int i4 = 37 / 0;
            }
            return kSerializerOnWarmupCompleted;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            private final /* synthetic */ KSerializer onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 113;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer = (KSerializer) IconInfo.onNavigationEvent().getValue();
                int i4 = onExtraCallback + 101;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 7 / 0;
                }
                return kSerializer;
            }

            public final KSerializer<IconInfo> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 47;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer<IconInfo> kSerializerOnExtraCallback = onExtraCallback();
                int i4 = onExtraCallbackWithResult + 73;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnExtraCallback;
                }
                throw null;
            }
        }

        static {
            IAuthTabCallback();
            Companion = new Companion(null);
            $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.PreSendAlert$IconInfo$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() throws Throwable {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 47;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerOnExtraCallback = PreSendAlert.IconInfo.onExtraCallback();
                    int i4 = onExtraCallback + 87;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializerOnExtraCallback;
                }
            });
            int i = onNavigationEvent + 39;
            asBinder = i % 128;
            if (i % 2 == 0) {
                int i2 = 21 / 0;
            }
        }

        private IconInfo() {
        }

        public /* synthetic */ IconInfo(int i, okycx okycxVar) {
        }

        public static final /* synthetic */ Lazy onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 63;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
            int i4 = i2 + 25;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return lazy;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static final /* synthetic */ KSerializer onWarmupCompleted() throws Throwable {
            int i = 2 % 2;
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IconInfo.class);
            KClass[] kClassArr = {Reflection.getOrCreateKotlinClass(Icon.class), Reflection.getOrCreateKotlinClass(Lottie.class)};
            KSerializer[] kSerializerArr = {PreSendAlert$IconInfo$Icon$$serializer.INSTANCE, PreSendAlert$IconInfo$Lottie$$serializer.INSTANCE};
            Object[] objArr = new Object[1];
            a(new char[]{2, 1, 0, 3}, (byte) (108 - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4, objArr);
            kt ktVar = new kt("viva.republica.toss.network.model.transfer.PreSendAlert.IconInfo", orCreateKotlinClass, kClassArr, kSerializerArr, new Annotation[]{new PreSendAlert$IconInfo$Icon$$serializer.IAuthTabCallback(((String) objArr[0]).intern())});
            int i2 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return ktVar;
        }

        @nc(IAuthTabCallback = "ICON")
        @liq
        public static final class Icon extends IconInfo {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            private final boolean loop;
            private final String tintColor;
            private final String url;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Icon> CREATOR = new onNavigationEvent();

            public static final class onNavigationEvent implements Parcelable.Creator<Icon> {
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Icon IAuthTabCallback(Parcel parcel) {
                    boolean z;
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    String string = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        int i2 = onNavigationEvent + 33;
                        onExtraCallback = i2 % 128;
                        int i3 = i2 % 2;
                        z = false;
                    }
                    Icon icon = new Icon(string, z, parcel.readString());
                    int i4 = onNavigationEvent + 109;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 77 / 0;
                    }
                    return icon;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Icon createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 107;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Icon iconIAuthTabCallback = IAuthTabCallback(parcel);
                    int i4 = onNavigationEvent + 37;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return iconIAuthTabCallback;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Icon[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 87;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Icon[] iconArrOnExtraCallback = onExtraCallback(i);
                    int i5 = onNavigationEvent + 85;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return iconArrOnExtraCallback;
                }

                public final Icon[] onExtraCallback(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 43;
                    int i4 = i3 % 128;
                    onNavigationEvent = i4;
                    int i5 = i3 % 2;
                    Icon[] iconArr = new Icon[i];
                    int i6 = i4 + 27;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return iconArr;
                }
            }

            static {
                int i = onExtraCallbackWithResult + 35;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            public Icon() {
                this((String) null, false, (String) null, 7, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 117;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 17;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 97;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) obj;
                if (!Intrinsics.areEqual(this.url, icon.url)) {
                    return false;
                }
                if (this.loop != icon.loop) {
                    int i4 = onWarmupCompleted + 71;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.tintColor, icon.tintColor)) {
                    return true;
                }
                int i6 = onNavigationEvent + 99;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }

            public int hashCode() {
                int i;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 109;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    this.url.hashCode();
                    Boolean.hashCode(this.loop);
                    throw null;
                }
                int iHashCode = this.url.hashCode();
                int iHashCode2 = Boolean.hashCode(this.loop);
                String str = this.tintColor;
                if (str == null) {
                    i = 0;
                } else {
                    int iHashCode3 = str.hashCode();
                    int i4 = onNavigationEvent + 19;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    i = iHashCode3;
                }
                return (((iHashCode * 31) + iHashCode2) * 31) + i;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Icon(url=" + this.url + ", loop=" + this.loop + ", tintColor=" + this.tintColor + ")";
                int i2 = onNavigationEvent + 97;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 65;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.url);
                parcel.writeInt(this.loop ? 1 : 0);
                parcel.writeString(this.tintColor);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static final class Companion {
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Icon> serializer() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 117;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        PreSendAlert$IconInfo$Icon$$serializer preSendAlert$IconInfo$Icon$$serializer = PreSendAlert$IconInfo$Icon$$serializer.INSTANCE;
                        throw null;
                    }
                    PreSendAlert$IconInfo$Icon$$serializer preSendAlert$IconInfo$Icon$$serializer2 = PreSendAlert$IconInfo$Icon$$serializer.INSTANCE;
                    int i3 = onExtraCallback + 29;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return preSendAlert$IconInfo$Icon$$serializer2;
                }
            }

            public /* synthetic */ Icon(int i, String str, boolean z, String str2, okycx okycxVar) {
                super(i, okycxVar);
                this.url = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.loop = true;
                } else {
                    this.loop = z;
                    int i2 = onWarmupCompleted + 79;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 2 % 2;
                    }
                }
                if ((i & 4) != 0) {
                    this.tintColor = str2;
                    int i4 = onWarmupCompleted + 77;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                int i5 = onNavigationEvent + 103;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                this.tintColor = null;
                if (i6 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Icon(@NotNull String str, boolean z, @Nullable String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.url = str;
                this.loop = z;
                this.tintColor = str2;
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
            @kotlin.jvm.JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.transfer.PreSendAlert.IconInfo.Icon r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
                /*
                    r0 = 2
                    int r1 = r0 % r0
                    r1 = 0
                    boolean r2 = r5.onWarmupCompleted(r6, r1)
                    if (r2 == 0) goto Lb
                    goto L20
                Lb:
                    int r2 = viva.republica.toss.network.model.transfer.PreSendAlert.IconInfo.Icon.onNavigationEvent
                    int r2 = r2 + 77
                    int r3 = r2 % 128
                    viva.republica.toss.network.model.transfer.PreSendAlert.IconInfo.Icon.onWarmupCompleted = r3
                    int r2 = r2 % r0
                    java.lang.String r2 = r4.onTransact()
                    java.lang.String r3 = ""
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                    if (r2 != 0) goto L27
                L20:
                    java.lang.String r2 = r4.onTransact()
                    r5.onExtraCallback(r6, r1, r2)
                L27:
                    r1 = 1
                    boolean r2 = r5.onWarmupCompleted(r6, r1)
                    if (r2 != 0) goto L34
                    boolean r2 = r4.onWarmupCompleted()
                    if (r2 == r1) goto L3b
                L34:
                    boolean r2 = r4.onWarmupCompleted()
                    r5.onNavigationEvent(r6, r1, r2)
                L3b:
                    boolean r2 = r5.onWarmupCompleted(r6, r0)
                    if (r2 == 0) goto L42
                    goto L4f
                L42:
                    int r2 = viva.republica.toss.network.model.transfer.PreSendAlert.IconInfo.Icon.onNavigationEvent
                    int r2 = r2 + 121
                    int r3 = r2 % 128
                    viva.republica.toss.network.model.transfer.PreSendAlert.IconInfo.Icon.onWarmupCompleted = r3
                    int r2 = r2 % r0
                    java.lang.String r2 = r4.tintColor
                    if (r2 == 0) goto L56
                L4f:
                    o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
                    java.lang.String r4 = r4.tintColor
                    r5.onExtraCallbackWithResult(r6, r0, r2, r4)
                L56:
                    int r4 = viva.republica.toss.network.model.transfer.PreSendAlert.IconInfo.Icon.onNavigationEvent
                    int r4 = r4 + r1
                    int r5 = r4 % 128
                    viva.republica.toss.network.model.transfer.PreSendAlert.IconInfo.Icon.onWarmupCompleted = r5
                    int r4 = r4 % r0
                    if (r4 != 0) goto L61
                    return
                L61:
                    r4 = 0
                    r4.hashCode()
                    throw r4
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PreSendAlert.IconInfo.Icon.IAuthTabCallback(viva.republica.toss.network.model.transfer.PreSendAlert$IconInfo$Icon, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Icon(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    str = "";
                    int i2 = onWarmupCompleted + 115;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 2 % 2;
                    }
                }
                if ((i & 2) != 0) {
                    int i4 = onWarmupCompleted + 113;
                    onNavigationEvent = i4 % 128;
                    z = i4 % 2 != 0;
                    int i5 = 2 % 2;
                }
                if ((i & 4) != 0) {
                    int i6 = 2 % 2;
                    str2 = null;
                }
                this(str, z, str2);
            }

            public String onTransact() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 63;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                String str = this.url;
                int i4 = i3 + 13;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            public boolean onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 55;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                Object obj = null;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                boolean z = this.loop;
                int i4 = i3 + 7;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return z;
                }
                obj.hashCode();
                throw null;
            }

            public final String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 47;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.tintColor;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @nc(IAuthTabCallback = "LOTTIE")
        @liq
        public static final class Lottie extends IconInfo {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            private final boolean loop;
            private final String url;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Lottie> CREATOR = new IAuthTabCallback();

            public static final class IAuthTabCallback implements Parcelable.Creator<Lottie> {
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Lottie createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 21;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    Lottie lottieOnWarmupCompleted = onWarmupCompleted(parcel);
                    int i4 = onExtraCallback + 81;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return lottieOnWarmupCompleted;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Lottie[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 115;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Lottie[] lottieArrOnNavigationEvent = onNavigationEvent(i);
                    int i5 = onWarmupCompleted + 9;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        return lottieArrOnNavigationEvent;
                    }
                    throw null;
                }

                public final Lottie[] onNavigationEvent(int i) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted;
                    int i4 = i3 + 49;
                    onExtraCallback = i4 % 128;
                    Lottie[] lottieArr = new Lottie[i];
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                    int i5 = i3 + 33;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return lottieArr;
                }

                public final Lottie onWarmupCompleted(Parcel parcel) {
                    boolean z;
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 31;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    if (i3 != 0) {
                        parcel.readString();
                        parcel.readInt();
                        throw null;
                    }
                    String string = parcel.readString();
                    if (parcel.readInt() != 0) {
                        int i4 = onExtraCallback + 67;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    return new Lottie(string, z);
                }
            }

            static {
                int i = onExtraCallback + 75;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 != 0) {
                    int i2 = 3 / 0;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Lottie() {
                String str = null;
                this(str, false, 3, (DefaultConstructorMarker) str);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 47;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2 != 0 ? 1 : 0;
                int i5 = i2 + 61;
                IAuthTabCallback = i5 % 128;
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
                    int i2 = onWarmupCompleted + 83;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(obj instanceof Lottie)) {
                    return false;
                }
                Lottie lottie = (Lottie) obj;
                if (!(!Intrinsics.areEqual(this.url, lottie.url))) {
                    return this.loop == lottie.loop;
                }
                int i4 = IAuthTabCallback + 121;
                onWarmupCompleted = i4 % 128;
                return i4 % 2 == 0;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 97;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = (this.url.hashCode() * 31) + Boolean.hashCode(this.loop);
                int i4 = onWarmupCompleted + 59;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Lottie(url=" + this.url + ", loop=" + this.loop + ")";
                int i2 = IAuthTabCallback + 11;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 63;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.url);
                parcel.writeInt(this.loop ? 1 : 0);
                int i5 = IAuthTabCallback + 67;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }

            public static final class Companion {
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Lottie> serializer() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 77;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    PreSendAlert$IconInfo$Lottie$$serializer preSendAlert$IconInfo$Lottie$$serializer = PreSendAlert$IconInfo$Lottie$$serializer.INSTANCE;
                    int i4 = onExtraCallback + 121;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return preSendAlert$IconInfo$Lottie$$serializer;
                }
            }

            public /* synthetic */ Lottie(int i, String str, boolean z, okycx okycxVar) {
                super(i, okycxVar);
                if ((i & 1) == 0) {
                    int i2 = IAuthTabCallback + 39;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                    str = "";
                }
                this.url = str;
                if ((i & 2) == 0) {
                    this.loop = true;
                    return;
                }
                this.loop = z;
                int i5 = IAuthTabCallback + 125;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Lottie(@NotNull String str, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.url = str;
                this.loop = z;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
            @kotlin.jvm.JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.transfer.PreSendAlert.IconInfo.Lottie r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
                /*
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = viva.republica.toss.network.model.transfer.PreSendAlert.IconInfo.Lottie.IAuthTabCallback
                    int r1 = r1 + 17
                    int r2 = r1 % 128
                    viva.republica.toss.network.model.transfer.PreSendAlert.IconInfo.Lottie.onWarmupCompleted = r2
                    int r1 = r1 % r0
                    r2 = 0
                    r3 = 1
                    if (r1 != 0) goto L17
                    boolean r1 = r6.onWarmupCompleted(r7, r3)
                    if (r1 != 0) goto L36
                    goto L1f
                L17:
                    boolean r1 = r6.onWarmupCompleted(r7, r2)
                    r1 = r1 ^ r3
                    if (r1 == r3) goto L1f
                    goto L36
                L1f:
                    int r1 = viva.republica.toss.network.model.transfer.PreSendAlert.IconInfo.Lottie.IAuthTabCallback
                    int r1 = r1 + 41
                    int r4 = r1 % 128
                    viva.republica.toss.network.model.transfer.PreSendAlert.IconInfo.Lottie.onWarmupCompleted = r4
                    int r1 = r1 % r0
                    java.lang.String r4 = ""
                    if (r1 == 0) goto L68
                    java.lang.String r1 = r5.onWarmupCompleted()
                    boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
                    if (r1 != 0) goto L46
                L36:
                    java.lang.String r1 = r5.onWarmupCompleted()
                    r6.onExtraCallback(r7, r2, r1)
                    int r1 = viva.republica.toss.network.model.transfer.PreSendAlert.IconInfo.Lottie.onWarmupCompleted
                    int r1 = r1 + 61
                    int r2 = r1 % 128
                    viva.republica.toss.network.model.transfer.PreSendAlert.IconInfo.Lottie.IAuthTabCallback = r2
                    int r1 = r1 % r0
                L46:
                    boolean r1 = r6.onWarmupCompleted(r7, r3)
                    if (r1 != 0) goto L60
                    int r1 = viva.republica.toss.network.model.transfer.PreSendAlert.IconInfo.Lottie.IAuthTabCallback
                    int r1 = r1 + 17
                    int r2 = r1 % 128
                    viva.republica.toss.network.model.transfer.PreSendAlert.IconInfo.Lottie.onWarmupCompleted = r2
                    int r1 = r1 % r0
                    boolean r0 = r5.onExtraCallbackWithResult()
                    if (r1 != 0) goto L5e
                    if (r0 == 0) goto L67
                    goto L60
                L5e:
                    if (r0 == r3) goto L67
                L60:
                    boolean r5 = r5.onExtraCallbackWithResult()
                    r6.onNavigationEvent(r7, r3, r5)
                L67:
                    return
                L68:
                    java.lang.String r5 = r5.onWarmupCompleted()
                    kotlin.jvm.internal.Intrinsics.areEqual(r5, r4)
                    r5 = 0
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PreSendAlert.IconInfo.Lottie.onNavigationEvent(viva.republica.toss.network.model.transfer.PreSendAlert$IconInfo$Lottie, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Lottie(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = IAuthTabCallback;
                    int i3 = i2 + 39;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = i2 + 29;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 2 % 2;
                    }
                    str = "";
                }
                this(str, (i & 2) != 0 ? true : z);
            }

            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 77;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.url;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public boolean onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 89;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.loop;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            long j;
            int length;
            char[] cArr2;
            int i3;
            int i4 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr3 = onExtraCallback;
            long j2 = 0;
            Object obj2 = null;
            if (cArr3 != null) {
                int i5 = $10 + 15;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                    i3 = 1;
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                    i3 = 0;
                }
                while (i3 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), ImageFormat.getBitsPerPixel(0) + 27, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr2[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i3++;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr2;
            }
            Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            char c = '0';
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 'J' - AndroidCharacter.getMirror('0'), (KeyEvent.getMaxKeyCode() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i6 = $10 + 123;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    i2 = i + 76;
                    cArr4[i2] = (char) (cArr[i2] % b);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        j = j2;
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", c, 0) + 24825), TextUtils.getOffsetBefore("", 0) + 74, 8088 - (ViewConfiguration.getPressedStateDuration() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i7 = $11 + 15;
                            $10 = i7 % 128;
                            int i8 = i7 % 2;
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                j = 0;
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 31 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 19487 - MotionEvent.axisFromString(""), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                j = 0;
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i9];
                        } else {
                            obj = null;
                            j = 0;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i10];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i11];
                            } else {
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i12];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i13];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                    j2 = j;
                    c = '0';
                }
            }
            for (int i14 = 0; i14 < i; i14++) {
                cArr4[i14] = (char) (cArr4[i14] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        static void IAuthTabCallback() {
            onExtraCallback = new char[]{64970, 64963, 64982, 64967};
            IAuthTabCallback = (char) 51243;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @liq
    public static final class FdsDisplayType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FdsDisplayType[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Companion Companion;
        public static final FdsDisplayType SIREN = new FdsDisplayType("SIREN", 0);
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        public static /* synthetic */ KSerializer $r8$lambda$pP92hbBcCylUmf26MjQWteojhnc() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
            int i4 = onWarmupCompleted + 43;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializer_init_$_anonymous_;
        }

        private static final /* synthetic */ FdsDisplayType[] $values() {
            FdsDisplayType[] fdsDisplayTypeArr;
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 61;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                fdsDisplayTypeArr = new FdsDisplayType[0];
                fdsDisplayTypeArr[0] = SIREN;
            } else {
                fdsDisplayTypeArr = new FdsDisplayType[]{SIREN};
            }
            int i4 = i2 + 29;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return fdsDisplayTypeArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<FdsDisplayType> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<FdsDisplayType> enumEntries = $ENTRIES;
            int i5 = i3 + 49;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static FdsDisplayType valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            FdsDisplayType fdsDisplayType = (FdsDisplayType) Enum.valueOf(FdsDisplayType.class, str);
            if (i3 != 0) {
                throw null;
            }
            int i4 = onExtraCallback + 39;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return fdsDisplayType;
            }
            throw null;
        }

        public static FdsDisplayType[] values() {
            FdsDisplayType[] fdsDisplayTypeArr;
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                fdsDisplayTypeArr = (FdsDisplayType[]) $VALUES.clone();
                int i3 = 20 / 0;
            } else {
                fdsDisplayTypeArr = (FdsDisplayType[]) $VALUES.clone();
            }
            int i4 = onWarmupCompleted + 21;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 38 / 0;
            }
            return fdsDisplayTypeArr;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            private final /* synthetic */ KSerializer onNavigationEvent() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 75;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer = (KSerializer) FdsDisplayType.access$get$cachedSerializer$delegate$cp().getValue();
                int i4 = IAuthTabCallback + 25;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return kSerializer;
            }

            public final KSerializer<FdsDisplayType> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 59;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer<FdsDisplayType> kSerializerOnNavigationEvent = onNavigationEvent();
                int i4 = onWarmupCompleted + 27;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnNavigationEvent;
                }
                throw null;
            }
        }

        private FdsDisplayType(String str, int i) {
        }

        private static final /* synthetic */ KSerializer _init_$_anonymous_() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.PreSendAlert.FdsDisplayType", values());
            int i4 = onExtraCallback + 59;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }

        public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
            int i5 = i3 + 75;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return lazy;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            FdsDisplayType[] fdsDisplayTypeArr$values = $values();
            $VALUES = fdsDisplayTypeArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(fdsDisplayTypeArr$values);
            Companion = new Companion(null);
            $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.PreSendAlert$FdsDisplayType$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 115;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializer$r8$lambda$pP92hbBcCylUmf26MjQWteojhnc = PreSendAlert.FdsDisplayType.$r8$lambda$pP92hbBcCylUmf26MjQWteojhnc();
                    int i4 = IAuthTabCallback + 39;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 34 / 0;
                    }
                    return kSerializer$r8$lambda$pP92hbBcCylUmf26MjQWteojhnc;
                }
            });
            int i = onExtraCallbackWithResult + 55;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }
}
