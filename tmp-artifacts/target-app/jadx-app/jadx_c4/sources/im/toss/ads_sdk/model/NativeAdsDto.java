package im.toss.ads_sdk.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
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
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import com.skt.usp.UCPApiConstants;
import im.toss.ads_sdk.admob.AdmobAdFormat;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.UtilsKtExternalSyntheticLambda17;
import o.access15300;
import o.access8100;
import o.arrowScroll;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.getWrite;
import o.initRenderFinish;
import o.kt;
import o.liq;
import o.nc;
import o.okycx;
import o.oty1;
import o.py;
import o.qt;
import o.setAnimationType;
import o.setVideoListener;
import o.skipVideo;
import o.ujb;
import o.updateRenderInfoForVideo;
import o.vyl;
import o.wie2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsDto implements arrowScroll, Parcelable {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Parcelable.Creator<NativeAdsDto> CREATOR;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<AdAsset> ads;
    private final String eventContextToken;
    private final ExtraInfo ext;
    private final String requestId;
    private final String specVersion;
    private final String status;

    public static final class onNavigationEvent implements Parcelable.Creator<NativeAdsDto> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeAdsDto createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(parcel);
                obj.hashCode();
                throw null;
            }
            NativeAdsDto nativeAdsDtoOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i3 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return nativeAdsDtoOnExtraCallbackWithResult;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeAdsDto[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 117;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            NativeAdsDto[] nativeAdsDtoArrOnExtraCallback = onExtraCallback(i);
            int i5 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 18 / 0;
            }
            return nativeAdsDtoArrOnExtraCallback;
        }

        public final NativeAdsDto[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 119;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            NativeAdsDto[] nativeAdsDtoArr = new NativeAdsDto[i];
            int i6 = i4 + 1;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return nativeAdsDtoArr;
        }

        public final NativeAdsDto onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            for (int i5 = 0; i5 != i2; i5++) {
                int i6 = onWarmupCompleted + 97;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                arrayList.add(AdAsset.CREATOR.createFromParcel(parcel));
            }
            return new NativeAdsDto(string, string2, string3, string4, arrayList, ExtraInfo.CREATOR.createFromParcel(parcel));
        }
    }

    public NativeAdsDto() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, (ExtraInfo) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        KSerializer kSerializer = (KSerializer) onExtraCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 517500148, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -517500148, new Object[0], iOnWarmupCompleted2, iOnWarmupCompleted);
        int i4 = IAuthTabCallback + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializer;
    }

    public static /* synthetic */ NativeAdsDto onExtraCallbackWithResult(NativeAdsDto nativeAdsDto, String str, String str2, String str3, String str4, List list, ExtraInfo extraInfo, int i, Object obj) {
        String str5;
        List list2;
        ExtraInfo extraInfo2;
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        String str6 = (i & 1) != 0 ? nativeAdsDto.specVersion : str;
        String str7 = (i & 2) != 0 ? nativeAdsDto.requestId : str2;
        String str8 = (i & 4) != 0 ? nativeAdsDto.eventContextToken : str3;
        if ((i & 8) != 0) {
            int i6 = i3 + 93;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            str5 = nativeAdsDto.status;
        } else {
            str5 = str4;
        }
        if ((i & 16) != 0) {
            list2 = nativeAdsDto.ads;
            int i8 = i3 + 91;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        } else {
            list2 = list;
        }
        if ((i & 32) != 0) {
            int i10 = i3 + 53;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            extraInfo2 = nativeAdsDto.ext;
        } else {
            extraInfo2 = extraInfo;
        }
        return nativeAdsDto.onNavigationEvent(str6, str7, str8, str5, list2, extraInfo2);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        NativeAdsDto nativeAdsDto = (NativeAdsDto) objArr[0];
        Parcel parcel = (Parcel) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(nativeAdsDto.specVersion);
        parcel.writeString(nativeAdsDto.requestId);
        parcel.writeString(nativeAdsDto.eventContextToken);
        parcel.writeString(nativeAdsDto.status);
        List<AdAsset> list = nativeAdsDto.ads;
        parcel.writeInt(list.size());
        Iterator<AdAsset> it = list.iterator();
        while (!(!it.hasNext())) {
            it.next().writeToParcel(parcel, iIntValue);
            int i4 = onExtraCallback + 103;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        nativeAdsDto.ext.writeToParcel(parcel, iIntValue);
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 113;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeAdsDto)) {
            int i2 = onExtraCallback + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        NativeAdsDto nativeAdsDto = (NativeAdsDto) obj;
        if (!Intrinsics.areEqual(this.specVersion, nativeAdsDto.specVersion)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.requestId, nativeAdsDto.requestId)) {
            int i4 = onExtraCallback + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.eventContextToken, nativeAdsDto.eventContextToken) || !Intrinsics.areEqual(this.status, nativeAdsDto.status) || !Intrinsics.areEqual(this.ads, nativeAdsDto.ads)) {
            return false;
        }
        if (Intrinsics.areEqual(this.ext, nativeAdsDto.ext)) {
            return true;
        }
        int i6 = IAuthTabCallback + 123;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.specVersion.hashCode();
        int iHashCode2 = this.requestId.hashCode();
        String str = this.eventContextToken;
        if (str == null) {
            int i3 = IAuthTabCallback + 3;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode3 = str.hashCode();
            int i5 = onExtraCallback + 15;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode3;
        }
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + i) * 31) + this.status.hashCode()) * 31) + this.ads.hashCode()) * 31) + this.ext.hashCode();
    }

    public final NativeAdsDto onNavigationEvent(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull List<AdAsset> list, @NotNull ExtraInfo extraInfo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(extraInfo, "");
        NativeAdsDto nativeAdsDto = new NativeAdsDto(str, str2, str3, str4, list, extraInfo);
        int i2 = onExtraCallback + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 84 / 0;
        }
        return nativeAdsDto;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NativeAdsDto(specVersion=" + this.specVersion + ", requestId=" + this.requestId + ", eventContextToken=" + this.eventContextToken + ", status=" + this.status + ", ads=" + this.ads + ", ext=" + this.ext + ")";
        int i2 = IAuthTabCallback + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NativeAdsDto> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsDto$$serializer nativeAdsDto$$serializer = NativeAdsDto$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 109;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return nativeAdsDto$$serializer;
            }
            throw null;
        }
    }

    static {
        access000();
        Companion = new Companion(null);
        CREATOR = new onNavigationEvent();
        $childSerializers = new Lazy[]{null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.model.NativeAdsDto$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 15;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = NativeAdsDto.onExtraCallback();
                int i4 = IAuthTabCallback + 105;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 9 / 0;
                }
                return kSerializerOnExtraCallback;
            }
        }), null};
        int i = onNavigationEvent + 95;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ NativeAdsDto(int i, String str, String str2, String str3, String str4, List list, ExtraInfo extraInfo, okycx okycxVar) {
        List listEmptyList;
        if ((i & 1) == 0) {
            this.specVersion = "";
            int i2 = IAuthTabCallback + 57;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        } else {
            this.specVersion = str;
        }
        int i4 = 2 % 2;
        if ((i & 2) == 0) {
            int i5 = IAuthTabCallback + 75;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            this.requestId = "";
        } else {
            this.requestId = str2;
        }
        if ((i & 4) == 0) {
            this.eventContextToken = null;
        } else {
            this.eventContextToken = str3;
            int i7 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.status = "";
            int i8 = 2 % 2;
        } else {
            this.status = str4;
        }
        if ((i & 16) == 0) {
            int i9 = IAuthTabCallback + 7;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                listEmptyList = CollectionsKt.emptyList();
                int i10 = 28 / 0;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            int i11 = onExtraCallback + 125;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 2 % 2;
            }
        } else {
            listEmptyList = list;
        }
        this.ads = listEmptyList;
        int i13 = onExtraCallback + 11;
        IAuthTabCallback = i13 % 128;
        int i14 = i13 % 2;
        this.ext = (i & 32) == 0 ? new ExtraInfo((String) null, (Double) null, (Reward) null, false, (Double) null, (Mediation) null, (Creative.TutorialOverlay) null, 127, (DefaultConstructorMarker) null) : extraInfo;
    }

    public NativeAdsDto(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull List<AdAsset> list, @NotNull ExtraInfo extraInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(extraInfo, "");
        this.specVersion = str;
        this.requestId = str2;
        this.eventContextToken = str3;
        this.status = str4;
        this.ads = list;
        this.ext = extraInfo;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 35;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(NativeAdsDto nativeAdsDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = IAuthTabCallback + 1;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (!Intrinsics.areEqual(nativeAdsDto.specVersion, "")) {
                vylVar.onExtraCallback(serialDescriptor, 0, nativeAdsDto.specVersion);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i6 = onExtraCallback + 55;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                Intrinsics.areEqual(nativeAdsDto.IAuthTabCallbackStub(), "");
                throw null;
            }
            if (!Intrinsics.areEqual(nativeAdsDto.IAuthTabCallbackStub(), "")) {
                vylVar.onExtraCallback(serialDescriptor, 1, nativeAdsDto.IAuthTabCallbackStub());
                int i7 = onExtraCallback + 65;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || nativeAdsDto.eventContextToken != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, nativeAdsDto.eventContextToken);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(nativeAdsDto.asInterface(), "")) {
            vylVar.onExtraCallback(serialDescriptor, 3, nativeAdsDto.asInterface());
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(nativeAdsDto.ads, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 4, (py) lazyArr[4].getValue(), nativeAdsDto.ads);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || !Intrinsics.areEqual(nativeAdsDto.ext, new ExtraInfo((String) null, (Double) null, (Reward) null, false, (Double) null, (Mediation) null, (Creative.TutorialOverlay) null, 127, (DefaultConstructorMarker) null))) {
            vylVar.onNavigationEvent(serialDescriptor, 5, NativeAdsDto$ExtraInfo$$serializer.INSTANCE, nativeAdsDto.ext);
        }
    }

    public /* synthetic */ NativeAdsDto(String str, String str2, String str3, String str4, List list, ExtraInfo extraInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        String str7;
        List listEmptyList;
        ExtraInfo extraInfo2;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            str5 = "";
        } else {
            str5 = str;
        }
        if ((i & 2) != 0) {
            int i4 = 2 % 2;
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            int i5 = IAuthTabCallback + 49;
            onExtraCallback = i5 % 128;
            str7 = null;
            if (i5 % 2 == 0) {
                throw null;
            }
        } else {
            str7 = str3;
        }
        String str8 = (i & 8) == 0 ? str4 : "";
        if ((i & 16) != 0) {
            listEmptyList = CollectionsKt.emptyList();
            int i6 = IAuthTabCallback + 103;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 4;
            } else {
                int i8 = 2 % 2;
            }
        } else {
            listEmptyList = list;
        }
        if ((i & 32) != 0) {
            extraInfo2 = new ExtraInfo((String) null, (Double) null, (Reward) null, false, (Double) null, (Mediation) null, (Creative.TutorialOverlay) null, 127, (DefaultConstructorMarker) null);
            int i9 = IAuthTabCallback + 75;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
        } else {
            extraInfo2 = extraInfo;
        }
        this(str5, str6, str7, str8, listEmptyList, extraInfo2);
    }

    @Override // o.arrowScroll
    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.requestId;
        int i5 = i3 + 41;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.eventContextToken;
        int i5 = i3 + 57;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
        return str;
    }

    @Override // o.arrowScroll
    public String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 39;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.status;
        int i5 = i2 + 13;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<AdAsset> onExtraCallbackWithResult() {
        List<AdAsset> list;
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            list = this.ads;
            int i4 = 52 / 0;
        } else {
            list = this.ads;
        }
        int i5 = i3 + 125;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
        return list;
    }

    public final ExtraInfo onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        ExtraInfo extraInfo = this.ext;
        int i5 = i3 + 107;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return extraInfo;
    }

    @Override // o.arrowScroll
    public List<AdAsset> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 107;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<AdAsset> list = this.ads;
        int i4 = i2 + 43;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return list;
    }

    @liq
    public static final class ExtraInfo implements Parcelable {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        private final boolean isAdBadgeEnabled;
        private final Mediation mediation;
        private final String mraidJsUrl;
        private final Creative.TutorialOverlay playableTutorialOverlay;
        private final Double refetchSeconds;
        private final Reward reward;
        private final Double skippableOffsetSeconds;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<ExtraInfo> CREATOR = new onExtraCallbackWithResult();

        public static final class onExtraCallbackWithResult implements Parcelable.Creator<ExtraInfo> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final ExtraInfo[] IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult;
                int i4 = i3 + 105;
                IAuthTabCallback = i4 % 128;
                ExtraInfo[] extraInfoArr = new ExtraInfo[i];
                if (i4 % 2 != 0) {
                    int i5 = 21 / 0;
                }
                int i6 = i3 + 19;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 97 / 0;
                }
                return extraInfoArr;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ExtraInfo createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 65;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                ExtraInfo extraInfoOnNavigationEvent = onNavigationEvent(parcel);
                if (i3 == 0) {
                    int i4 = 75 / 0;
                }
                int i5 = IAuthTabCallback + 65;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return extraInfoOnNavigationEvent;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ExtraInfo[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 63;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                ExtraInfo[] extraInfoArrIAuthTabCallback = IAuthTabCallback(i);
                int i5 = onExtraCallbackWithResult + 31;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return extraInfoArrIAuthTabCallback;
            }

            public final ExtraInfo onNavigationEvent(Parcel parcel) {
                Double dValueOf;
                Reward rewardCreateFromParcel;
                boolean z;
                Double dValueOf2;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    int i2 = onExtraCallbackWithResult + 89;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    dValueOf = null;
                } else {
                    dValueOf = Double.valueOf(parcel.readDouble());
                }
                if (parcel.readInt() == 0) {
                    int i3 = IAuthTabCallback + 1;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                    rewardCreateFromParcel = null;
                } else {
                    rewardCreateFromParcel = Reward.CREATOR.createFromParcel(parcel);
                    int i4 = onExtraCallbackWithResult + 91;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                }
                Reward reward = rewardCreateFromParcel;
                if (parcel.readInt() != 0) {
                    int i6 = IAuthTabCallback + 113;
                    onExtraCallbackWithResult = i6 % 128;
                    z = i6 % 2 != 0;
                } else {
                    z = false;
                }
                if (parcel.readInt() == 0) {
                    int i7 = onExtraCallbackWithResult + 113;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        tutorialOverlay.hashCode();
                        throw null;
                    }
                    dValueOf2 = null;
                } else {
                    dValueOf2 = Double.valueOf(parcel.readDouble());
                }
                return new ExtraInfo(string, dValueOf, reward, z, dValueOf2, Mediation.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Creative.TutorialOverlay.CREATOR.createFromParcel(parcel) : null);
            }
        }

        static {
            int i = onExtraCallback + 33;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                int i2 = 30 / 0;
            }
        }

        public ExtraInfo() {
            this((String) null, (Double) null, (Reward) null, false, (Double) null, (Mediation) null, (Creative.TutorialOverlay) null, 127, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i6;
            int i8 = (~(i7 | i3)) | i4;
            int i9 = ~i3;
            int i10 = i7 | i4;
            int i11 = (~(i6 | i9 | i4)) | (~(i10 | i3));
            int i12 = (~i10) | (~(i9 | (~i4)));
            int i13 = i4 + i3 + i5 + (1353909401 * i) + ((-1351514252) * i2);
            int i14 = i13 * i13;
            int i15 = (1883508457 * i4) + 799145984 + ((-1483212659) * i3) + (2050486552 * i8) + (i11 * 1122240372) + (1122240372 * i12) + ((-360972288) * i5) + (337379328 * i) + ((-1540358144) * i2) + (669122560 * i14);
            int i16 = ((i4 * 521834465) - 1171472169) + (i3 * 521833829) + (i8 * (-424)) + (i11 * 212) + (i12 * 212) + (i5 * 521834041) + (i * 1123214353) + (i2 * (-684621612)) + (i14 * 1028784128);
            return i15 + ((i16 * i16) * 1635647488) != 1 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            String str = (String) objArr[1];
            Double d = (Double) objArr[2];
            Reward reward = (Reward) objArr[3];
            boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
            Double d2 = (Double) objArr[5];
            Mediation mediation = (Mediation) objArr[6];
            Creative.TutorialOverlay tutorialOverlay = (Creative.TutorialOverlay) objArr[7];
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(mediation, "");
            ExtraInfo extraInfo = new ExtraInfo(str, d, reward, zBooleanValue, d2, mediation, tutorialOverlay);
            int i2 = IAuthTabCallback + 59;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 77 / 0;
            }
            return extraInfo;
        }

        public static /* synthetic */ ExtraInfo onNavigationEvent(ExtraInfo extraInfo, String str, Double d, Reward reward, boolean z, Double d2, Mediation mediation, Creative.TutorialOverlay tutorialOverlay, int i, Object obj) {
            String str2;
            Double d3;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 75;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0 ? (i & 1) == 0 : (i & 1) == 0) {
                str2 = str;
            } else {
                int i5 = i3 + 117;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                str2 = extraInfo.mraidJsUrl;
            }
            if ((i & 2) != 0) {
                int i7 = IAuthTabCallback + 69;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                d3 = extraInfo.skippableOffsetSeconds;
                if (i8 == 0) {
                    int i9 = 57 / 0;
                }
            } else {
                d3 = d;
            }
            return (ExtraInfo) IAuthTabCallback(new Object[]{extraInfo, str2, d3, (i & 4) != 0 ? extraInfo.reward : reward, Boolean.valueOf((i & 8) != 0 ? extraInfo.isAdBadgeEnabled : z), (i & 16) != 0 ? extraInfo.refetchSeconds : d2, (i & 32) != 0 ? extraInfo.mediation : mediation, (i & 64) != 0 ? extraInfo.playableTutorialOverlay : tutorialOverlay}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -2127951346, 2127951347, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 == 0 ? 1 : 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 37;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 53 / 0;
                }
                return true;
            }
            if (!(obj instanceof ExtraInfo)) {
                int i4 = IAuthTabCallback + 33;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            ExtraInfo extraInfo = (ExtraInfo) obj;
            if (!Intrinsics.areEqual(this.mraidJsUrl, extraInfo.mraidJsUrl)) {
                int i6 = onWarmupCompleted + 17;
                IAuthTabCallback = i6 % 128;
                return i6 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.skippableOffsetSeconds, extraInfo.skippableOffsetSeconds)) {
                int i7 = onWarmupCompleted + 21;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.reward, extraInfo.reward)) {
                return false;
            }
            if (this.isAdBadgeEnabled != extraInfo.isAdBadgeEnabled) {
                int i9 = IAuthTabCallback + 63;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.refetchSeconds, extraInfo.refetchSeconds)) {
                return false;
            }
            if (!(!Intrinsics.areEqual(this.mediation, extraInfo.mediation))) {
                return Intrinsics.areEqual(this.playableTutorialOverlay, extraInfo.playableTutorialOverlay);
            }
            int i11 = IAuthTabCallback + 121;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = this.mraidJsUrl;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            Double d = this.skippableOffsetSeconds;
            int iHashCode4 = d == null ? 0 : d.hashCode();
            Reward reward = this.reward;
            if (reward == null) {
                iHashCode = 0;
            } else {
                iHashCode = reward.hashCode();
                int i4 = onWarmupCompleted + 17;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            int iHashCode5 = Boolean.hashCode(this.isAdBadgeEnabled);
            Double d2 = this.refetchSeconds;
            if (d2 == null) {
                int i6 = onWarmupCompleted + 53;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = d2.hashCode();
            }
            int iHashCode6 = this.mediation.hashCode();
            Creative.TutorialOverlay tutorialOverlay = this.playableTutorialOverlay;
            return (((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + (tutorialOverlay != null ? tutorialOverlay.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ExtraInfo(mraidJsUrl=" + this.mraidJsUrl + ", skippableOffsetSeconds=" + this.skippableOffsetSeconds + ", reward=" + this.reward + ", isAdBadgeEnabled=" + this.isAdBadgeEnabled + ", refetchSeconds=" + this.refetchSeconds + ", mediation=" + this.mediation + ", playableTutorialOverlay=" + this.playableTutorialOverlay + ")";
            int i2 = IAuthTabCallback + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.mraidJsUrl);
            Double d = this.skippableOffsetSeconds;
            if (d == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeDouble(d.doubleValue());
            }
            Reward reward = this.reward;
            if (reward == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                reward.writeToParcel(parcel, i);
            }
            parcel.writeInt(this.isAdBadgeEnabled ? 1 : 0);
            Double d2 = this.refetchSeconds;
            if (d2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeDouble(d2.doubleValue());
            }
            this.mediation.writeToParcel(parcel, i);
            Creative.TutorialOverlay tutorialOverlay = this.playableTutorialOverlay;
            if (tutorialOverlay != null) {
                parcel.writeInt(1);
                tutorialOverlay.writeToParcel(parcel, i);
                return;
            }
            int i3 = IAuthTabCallback + 53;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
            int i4 = IAuthTabCallback + 13;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
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

            public final KSerializer<ExtraInfo> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                NativeAdsDto$ExtraInfo$$serializer nativeAdsDto$ExtraInfo$$serializer = NativeAdsDto$ExtraInfo$$serializer.INSTANCE;
                int i4 = onNavigationEvent + 1;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return nativeAdsDto$ExtraInfo$$serializer;
            }
        }

        public /* synthetic */ ExtraInfo(int i, String str, Double d, Reward reward, boolean z, Double d2, Mediation mediation, Creative.TutorialOverlay tutorialOverlay, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.mraidJsUrl = null;
                int i2 = 2 % 2;
            } else {
                this.mraidJsUrl = str;
            }
            if ((i & 2) == 0) {
                this.skippableOffsetSeconds = null;
            } else {
                this.skippableOffsetSeconds = d;
            }
            if ((i & 4) == 0) {
                int i3 = IAuthTabCallback + 103;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                this.reward = null;
                if (i4 == 0) {
                    int i5 = 30 / 0;
                }
            } else {
                this.reward = reward;
                int i6 = 2 % 2;
            }
            this.isAdBadgeEnabled = (i & 8) != 0 ? z : false;
            if ((i & 16) == 0) {
                int i7 = IAuthTabCallback + 35;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                this.refetchSeconds = null;
                if (i8 == 0) {
                    throw null;
                }
            } else {
                this.refetchSeconds = d2;
            }
            if ((i & 32) == 0) {
                this.mediation = new Mediation((String) null, (List) null, (AdmobInfo) null, (MediationEndPoint) null, (List) null, (List) null, 63, (DefaultConstructorMarker) null);
                int i9 = 2 % 2;
            } else {
                this.mediation = mediation;
            }
            if ((i & 64) == 0) {
                this.playableTutorialOverlay = null;
            } else {
                this.playableTutorialOverlay = tutorialOverlay;
            }
        }

        public ExtraInfo(@Nullable String str, @Nullable Double d, @Nullable Reward reward, boolean z, @Nullable Double d2, @NotNull Mediation mediation, @Nullable Creative.TutorialOverlay tutorialOverlay) {
            Intrinsics.checkNotNullParameter(mediation, "");
            this.mraidJsUrl = str;
            this.skippableOffsetSeconds = d;
            this.reward = reward;
            this.isAdBadgeEnabled = z;
            this.refetchSeconds = d2;
            this.mediation = mediation;
            this.playableTutorialOverlay = tutorialOverlay;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            ExtraInfo extraInfo = (ExtraInfo) objArr[0];
            vyl vylVar = (vyl) objArr[1];
            SerialDescriptor serialDescriptor = (SerialDescriptor) objArr[2];
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i4 = onWarmupCompleted + 47;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 80 / 0;
                    if (extraInfo.mraidJsUrl != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, extraInfo.mraidJsUrl);
                    }
                } else if (extraInfo.mraidJsUrl != null) {
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i6 = onWarmupCompleted + 1;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    Double d = extraInfo.skippableOffsetSeconds;
                    throw null;
                }
                if (extraInfo.skippableOffsetSeconds != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, setVideoListener.onWarmupCompleted, extraInfo.skippableOffsetSeconds);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 2) || extraInfo.reward != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, NativeAdsDto$Reward$$serializer.INSTANCE, extraInfo.reward);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 3) || extraInfo.isAdBadgeEnabled) {
                vylVar.onNavigationEvent(serialDescriptor, 3, extraInfo.isAdBadgeEnabled);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 4) || extraInfo.refetchSeconds != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, setVideoListener.onWarmupCompleted, extraInfo.refetchSeconds);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 5) || !Intrinsics.areEqual(extraInfo.mediation, new Mediation((String) null, (List) null, (AdmobInfo) null, (MediationEndPoint) null, (List) null, (List) null, 63, (DefaultConstructorMarker) null))) {
                vylVar.onNavigationEvent(serialDescriptor, 5, NativeAdsDto$Mediation$$serializer.INSTANCE, extraInfo.mediation);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
                int i7 = IAuthTabCallback + 75;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    Creative.TutorialOverlay tutorialOverlay = extraInfo.playableTutorialOverlay;
                    throw null;
                }
                if (extraInfo.playableTutorialOverlay == null) {
                    return null;
                }
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, NativeAdsDto$Creative$TutorialOverlay$$serializer.INSTANCE, extraInfo.playableTutorialOverlay);
            return null;
        }

        public /* synthetic */ ExtraInfo(String str, Double d, Reward reward, boolean z, Double d2, Mediation mediation, Creative.TutorialOverlay tutorialOverlay, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str2;
            Reward reward2;
            Double d3;
            Mediation mediation2;
            if ((i & 1) != 0) {
                int i2 = 2 % 2;
                str2 = null;
            } else {
                str2 = str;
            }
            Double d4 = (i & 2) != 0 ? null : d;
            if ((i & 4) != 0) {
                int i3 = IAuthTabCallback + 71;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                reward2 = null;
            } else {
                reward2 = reward;
            }
            boolean z2 = (i & 8) != 0 ? false : z;
            if ((i & 16) != 0) {
                int i5 = IAuthTabCallback + 119;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                d3 = null;
            } else {
                d3 = d2;
            }
            if ((i & 32) != 0) {
                mediation2 = new Mediation((String) null, (List) null, (AdmobInfo) null, (MediationEndPoint) null, (List) null, (List) null, 63, (DefaultConstructorMarker) null);
                int i6 = 2 % 2;
            } else {
                mediation2 = mediation;
            }
            this(str2, d4, reward2, z2, d3, mediation2, (i & 64) == 0 ? tutorialOverlay : null);
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return this.mraidJsUrl;
            }
            throw null;
        }

        public final Double IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.skippableOffsetSeconds;
            }
            throw null;
        }

        public final Reward onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 49;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Reward reward = this.reward;
            int i5 = i2 + 39;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return reward;
        }

        public final boolean asBinder() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            boolean z = this.isAdBadgeEnabled;
            int i5 = i3 + 85;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 39 / 0;
            }
            return z;
        }

        public final Double IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            Double d = this.refetchSeconds;
            int i4 = i3 + 5;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return d;
            }
            obj.hashCode();
            throw null;
        }

        public final Mediation onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Mediation mediation = this.mediation;
            int i5 = i3 + 51;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return mediation;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Creative.TutorialOverlay onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Creative.TutorialOverlay tutorialOverlay = this.playableTutorialOverlay;
            int i5 = i3 + 97;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return tutorialOverlay;
        }

        @JvmStatic
        public static final /* synthetic */ void IAuthTabCallback(ExtraInfo extraInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            IAuthTabCallback(new Object[]{extraInfo, vylVar, serialDescriptor}, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1344275129, 1344275129, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted);
        }

        public final ExtraInfo onExtraCallbackWithResult(@Nullable String str, @Nullable Double d, @Nullable Reward reward, boolean z, @Nullable Double d2, @NotNull Mediation mediation, @Nullable Creative.TutorialOverlay tutorialOverlay) {
            Object[] objArr = {this, str, d, reward, Boolean.valueOf(z), d2, mediation, tutorialOverlay};
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            return (ExtraInfo) IAuthTabCallback(objArr, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -2127951346, 2127951347, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted);
        }
    }

    @Override // o.arrowScroll
    public boolean asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.ext.asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zAsBinder = this.ext.asBinder();
        int i3 = IAuthTabCallback + 77;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return zAsBinder;
    }

    @liq
    public static final class Mediation implements Parcelable {
        private static final Lazy<KSerializer<Object>>[] $childSerializers;
        public static final int $stable = 0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final AdmobInfo admob;
        private final List<String> bannedKeywords;
        private final MediationEndPoint endpoint;
        private final String mediationId;
        private final List<String> priority;
        private final List<String> ruleSet;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Mediation> CREATOR = new onExtraCallbackWithResult();

        public static final class onExtraCallbackWithResult implements Parcelable.Creator<Mediation> {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Mediation createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 97;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Mediation mediationOnNavigationEvent = onNavigationEvent(parcel);
                int i4 = onExtraCallback + 99;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return mediationOnNavigationEvent;
                }
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Mediation[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 87;
                onExtraCallback = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    onWarmupCompleted(i);
                    throw null;
                }
                Mediation[] mediationArrOnWarmupCompleted = onWarmupCompleted(i);
                int i4 = onExtraCallback + 121;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return mediationArrOnWarmupCompleted;
                }
                obj.hashCode();
                throw null;
            }

            public final Mediation onNavigationEvent(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 57;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AdmobInfo admobInfoCreateFromParcel = null;
                Intrinsics.checkNotNullParameter(parcel, "");
                if (i3 == 0) {
                    parcel.readString();
                    parcel.createStringArrayList();
                    parcel.readInt();
                    throw null;
                }
                String string = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() != 0) {
                    admobInfoCreateFromParcel = AdmobInfo.CREATOR.createFromParcel(parcel);
                    int i4 = onExtraCallback + 37;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                }
                return new Mediation(string, arrayListCreateStringArrayList, admobInfoCreateFromParcel, MediationEndPoint.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.createStringArrayList());
            }

            public final Mediation[] onWarmupCompleted(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 61;
                onNavigationEvent = i3 % 128;
                Mediation[] mediationArr = new Mediation[i];
                if (i3 % 2 == 0) {
                    return mediationArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public Mediation() {
            this((String) null, (List) null, (AdmobInfo) null, (MediationEndPoint) null, (List) null, (List) null, 63, (DefaultConstructorMarker) null);
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
            int i2 = IAuthTabCallback + 63;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return checkcanopenlandingpage;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ KSerializer access000() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
            int i2 = onExtraCallback + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return checkcanopenlandingpage;
        }

        private static final /* synthetic */ KSerializer access100() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
            int i2 = onExtraCallback + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return checkcanopenlandingpage;
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerAccess100 = access100();
            if (i3 != 0) {
                int i4 = 4 / 0;
            }
            return kSerializerAccess100;
        }

        public static /* synthetic */ Mediation onExtraCallbackWithResult(Mediation mediation, String str, List list, AdmobInfo admobInfo, MediationEndPoint mediationEndPoint, List list2, List list3, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                str = mediation.mediationId;
            }
            String str2 = str;
            if ((i & 2) != 0) {
                list = mediation.priority;
            }
            List list4 = list;
            if ((i & 4) != 0) {
                admobInfo = mediation.admob;
            }
            AdmobInfo admobInfo2 = admobInfo;
            if ((i & 8) != 0) {
                int i3 = onExtraCallback + 81;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    MediationEndPoint mediationEndPoint2 = mediation.endpoint;
                    throw null;
                }
                mediationEndPoint = mediation.endpoint;
            }
            MediationEndPoint mediationEndPoint3 = mediationEndPoint;
            if ((i & 16) != 0) {
                list2 = mediation.ruleSet;
            }
            List list5 = list2;
            if ((i & 32) != 0) {
                int i4 = IAuthTabCallback + 105;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                list3 = mediation.bannedKeywords;
            }
            Object[] objArr = {mediation, str2, list4, admobInfo2, mediationEndPoint3, list5, list3};
            return (Mediation) onExtraCallbackWithResult(33515266, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -33515264, zzmr.onExtraCallbackWithResult(), objArr, zzmr.onExtraCallbackWithResult());
        }

        public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
            int i7 = ~i2;
            int i8 = i | i7;
            int i9 = (~(i4 | i2)) | i;
            int i10 = ~i4;
            int i11 = (~(i2 | i4 | i)) | (~(i7 | i10)) | (~((~i) | i10));
            int i12 = i4 + i + i5 + (1609234610 * i6) + (1307081305 * i3);
            int i13 = i12 * i12;
            int i14 = (((-490261092) * i4) - 1772093440) + (1576585830 * i) + (i8 * 1033423461) + ((-2066846922) * i9) + (1033423461 * i11) + (543162368 * i5) + ((-2101346304) * i6) + (23068672 * i3) + ((-2103967744) * i13);
            int i15 = (i4 * 273352028) + 245730370 + (i * 273352646) + (i8 * 309) + (i9 * (-618)) + (i11 * 309) + (i5 * 273352337) + (i6 * (-770635566)) + (i3 * (-73506199)) + (i13 * (-2011693056));
            int i16 = i14 + (i15 * i15 * 1080557568);
            return i16 != 1 ? i16 != 2 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
        }

        public static /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerAccess000 = access000();
            if (i3 != 0) {
                int i4 = 76 / 0;
            }
            return kSerializerAccess000;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            String str = (String) objArr[1];
            List list = (List) objArr[2];
            AdmobInfo admobInfo = (AdmobInfo) objArr[3];
            MediationEndPoint mediationEndPoint = (MediationEndPoint) objArr[4];
            List list2 = (List) objArr[5];
            List list3 = (List) objArr[6];
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(mediationEndPoint, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            Mediation mediation = new Mediation(str, list, admobInfo, mediationEndPoint, list2, list3);
            int i2 = onExtraCallback + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 82 / 0;
            }
            return mediation;
        }

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
                return (KSerializer) onExtraCallbackWithResult(104623717, iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), -104623717, iOnExtraCallbackWithResult2, new Object[0], iOnExtraCallbackWithResult3);
            }
            int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = zzmr.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 43;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 98 / 0;
            }
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Mediation)) {
                int i2 = IAuthTabCallback + 65;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 11;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            Mediation mediation = (Mediation) obj;
            if (!Intrinsics.areEqual(this.mediationId, mediation.mediationId)) {
                int i6 = IAuthTabCallback + 117;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if ((!Intrinsics.areEqual(this.priority, mediation.priority)) || !Intrinsics.areEqual(this.admob, mediation.admob) || !Intrinsics.areEqual(this.endpoint, mediation.endpoint) || !Intrinsics.areEqual(this.ruleSet, mediation.ruleSet)) {
                return false;
            }
            if (Intrinsics.areEqual(this.bannedKeywords, mediation.bannedKeywords)) {
                return true;
            }
            int i8 = onExtraCallback + 39;
            IAuthTabCallback = i8 % 128;
            return i8 % 2 != 0;
        }

        public int hashCode() {
            int i;
            int i2 = 2 % 2;
            int iHashCode = this.mediationId.hashCode();
            int iHashCode2 = this.priority.hashCode();
            AdmobInfo admobInfo = this.admob;
            if (admobInfo == null) {
                int i3 = onExtraCallback + 11;
                IAuthTabCallback = i3 % 128;
                i = i3 % 2 != 0 ? 1 : 0;
            } else {
                int iHashCode3 = admobInfo.hashCode();
                int i4 = IAuthTabCallback + 15;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                i = iHashCode3;
            }
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + i) * 31) + this.endpoint.hashCode()) * 31) + this.ruleSet.hashCode()) * 31) + this.bannedKeywords.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Mediation(mediationId=" + this.mediationId + ", priority=" + this.priority + ", admob=" + this.admob + ", endpoint=" + this.endpoint + ", ruleSet=" + this.ruleSet + ", bannedKeywords=" + this.bannedKeywords + ")";
            int i2 = onExtraCallback + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 78 / 0;
            }
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 63;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.mediationId);
            parcel.writeStringList(this.priority);
            AdmobInfo admobInfo = this.admob;
            if (admobInfo == null) {
                int i5 = onExtraCallback + 55;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                admobInfo.writeToParcel(parcel, i);
            }
            this.endpoint.writeToParcel(parcel, i);
            parcel.writeStringList(this.ruleSet);
            parcel.writeStringList(this.bannedKeywords);
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Mediation> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 107;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                NativeAdsDto$Mediation$$serializer nativeAdsDto$Mediation$$serializer = NativeAdsDto$Mediation$$serializer.INSTANCE;
                int i4 = onWarmupCompleted + 93;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return nativeAdsDto$Mediation$$serializer;
                }
                throw null;
            }
        }

        static {
            TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.ads_sdk.model.NativeAdsDto$Mediation$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 97;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        return NativeAdsDto.Mediation.onNavigationEvent();
                    }
                    NativeAdsDto.Mediation.onNavigationEvent();
                    throw null;
                }
            }), null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.ads_sdk.model.NativeAdsDto$Mediation$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 11;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerOnWarmupCompleted = NativeAdsDto.Mediation.onWarmupCompleted();
                    int i4 = onWarmupCompleted + 115;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializerOnWarmupCompleted;
                }
            }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.ads_sdk.model.NativeAdsDto$Mediation$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 81;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerOnExtraCallback = NativeAdsDto.Mediation.onExtraCallback();
                    int i4 = IAuthTabCallback + 65;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        return kSerializerOnExtraCallback;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            })};
            int i = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ Mediation(int i, String str, List list, AdmobInfo admobInfo, MediationEndPoint mediationEndPoint, List list2, List list3, okycx okycxVar) {
            this.mediationId = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.priority = CollectionsKt.emptyList();
            } else {
                this.priority = list;
            }
            Object obj = null;
            if ((i & 4) == 0) {
                int i2 = onExtraCallback + 95;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                this.admob = null;
                if (i3 != 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                this.admob = admobInfo;
                int i4 = onExtraCallback + 115;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            if ((i & 8) == 0) {
                this.endpoint = new MediationEndPoint((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
                int i7 = 2 % 2;
            } else {
                this.endpoint = mediationEndPoint;
            }
            if ((i & 16) == 0) {
                int i8 = IAuthTabCallback + 69;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    this.ruleSet = CollectionsKt.emptyList();
                    throw null;
                }
                this.ruleSet = CollectionsKt.emptyList();
            } else {
                this.ruleSet = list2;
            }
            if ((i & 32) == 0) {
                this.bannedKeywords = CollectionsKt.emptyList();
                return;
            }
            this.bannedKeywords = list3;
            int i9 = onExtraCallback + 107;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
        }

        public Mediation(@NotNull String str, @NotNull List<String> list, @Nullable AdmobInfo admobInfo, @NotNull MediationEndPoint mediationEndPoint, @NotNull List<String> list2, @NotNull List<String> list3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(mediationEndPoint, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            this.mediationId = str;
            this.priority = list;
            this.admob = admobInfo;
            this.endpoint = mediationEndPoint;
            this.ruleSet = list2;
            this.bannedKeywords = list3;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void IAuthTabCallback(Mediation mediation, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(mediation.mediationId, "")) {
                vylVar.onExtraCallback(serialDescriptor, 0, mediation.mediationId);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(mediation.priority, CollectionsKt.emptyList())) {
                vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), mediation.priority);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                int i2 = onExtraCallback + 59;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    AdmobInfo admobInfo = mediation.admob;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (mediation.admob != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 2, NativeAdsDto$AdmobInfo$$serializer.INSTANCE, mediation.admob);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(mediation.endpoint, new MediationEndPoint((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
                vylVar.onNavigationEvent(serialDescriptor, 3, NativeAdsDto$MediationEndPoint$$serializer.INSTANCE, mediation.endpoint);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
                int i3 = onExtraCallback + 73;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                if (!Intrinsics.areEqual(mediation.ruleSet, CollectionsKt.emptyList())) {
                    vylVar.onNavigationEvent(serialDescriptor, 4, (py) lazyArr[4].getValue(), mediation.ruleSet);
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
                int i5 = IAuthTabCallback + 85;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                if (Intrinsics.areEqual(mediation.bannedKeywords, CollectionsKt.emptyList())) {
                    return;
                }
            }
            vylVar.onNavigationEvent(serialDescriptor, 5, (py) lazyArr[5].getValue(), mediation.bannedKeywords);
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            Lazy<KSerializer<Object>>[] lazyArr;
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                lazyArr = $childSerializers;
                int i4 = 95 / 0;
            } else {
                lazyArr = $childSerializers;
            }
            int i5 = i3 + 3;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return lazyArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = this.mediationId;
            if (i3 == 0) {
                int i4 = 31 / 0;
            }
            return str;
        }

        public final List<String> IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            List<String> list = this.priority;
            int i5 = i3 + 81;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final AdmobInfo onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            AdmobInfo admobInfo = this.admob;
            int i5 = i3 + 11;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return admobInfo;
        }

        public final MediationEndPoint asInterface() {
            MediationEndPoint mediationEndPoint;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 93;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                mediationEndPoint = this.endpoint;
                int i4 = 4 / 0;
            } else {
                mediationEndPoint = this.endpoint;
            }
            int i5 = i2 + 47;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return mediationEndPoint;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Mediation(String str, List list, AdmobInfo admobInfo, MediationEndPoint mediationEndPoint, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str2;
            List listEmptyList;
            List listEmptyList2;
            List listEmptyList3;
            if ((i & 1) != 0) {
                int i2 = onExtraCallback + 9;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
                str2 = "";
            } else {
                str2 = str;
            }
            if ((i & 2) != 0) {
                int i5 = IAuthTabCallback + 9;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                listEmptyList = CollectionsKt.emptyList();
            } else {
                listEmptyList = list;
            }
            AdmobInfo admobInfo2 = (i & 4) != 0 ? null : admobInfo;
            MediationEndPoint mediationEndPoint2 = (i & 8) != 0 ? new MediationEndPoint((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : mediationEndPoint;
            if ((i & 16) != 0) {
                int i7 = IAuthTabCallback + 81;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    CollectionsKt.emptyList();
                    throw null;
                }
                listEmptyList2 = CollectionsKt.emptyList();
                int i8 = 2 % 2;
            } else {
                listEmptyList2 = list2;
            }
            if ((i & 32) != 0) {
                int i9 = onExtraCallback + 57;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                listEmptyList3 = CollectionsKt.emptyList();
                int i11 = onExtraCallback + 95;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                int i13 = 2 % 2;
            } else {
                listEmptyList3 = list3;
            }
            this(str2, listEmptyList, admobInfo2, mediationEndPoint2, listEmptyList2, listEmptyList3);
        }

        public final List<String> onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            List<String> list = this.ruleSet;
            int i5 = i3 + 17;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 40 / 0;
            }
            return list;
        }

        public final List<String> asBinder() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.bannedKeywords;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ KSerializer getInterfaceDescriptor() {
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
            return (KSerializer) onExtraCallbackWithResult(104623717, iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), -104623717, iOnExtraCallbackWithResult2, new Object[0], iOnExtraCallbackWithResult3);
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallback() {
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
            return (Lazy[]) onExtraCallbackWithResult(-227196375, iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 227196376, iOnExtraCallbackWithResult2, new Object[0], iOnExtraCallbackWithResult3);
        }

        public final Mediation onNavigationEvent(@NotNull String str, @NotNull List<String> list, @Nullable AdmobInfo admobInfo, @NotNull MediationEndPoint mediationEndPoint, @NotNull List<String> list2, @NotNull List<String> list3) {
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
            return (Mediation) onExtraCallbackWithResult(33515266, iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), -33515264, iOnExtraCallbackWithResult2, new Object[]{this, str, list, admobInfo, mediationEndPoint, list2, list3}, iOnExtraCallbackWithResult3);
        }
    }

    @liq
    public static final class MediationEndPoint implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<MediationEndPoint> CREATOR = new onExtraCallbackWithResult();
        public static final Companion Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final String error;
        private final String exposure;
        private final String result;

        public static final class onExtraCallbackWithResult implements Parcelable.Creator<MediationEndPoint> {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MediationEndPoint createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 1;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                MediationEndPoint mediationEndPointOnExtraCallback = onExtraCallback(parcel);
                int i4 = onExtraCallbackWithResult + 35;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 14 / 0;
                }
                return mediationEndPointOnExtraCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ MediationEndPoint[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 77;
                onExtraCallbackWithResult = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    onExtraCallbackWithResult(i);
                    obj.hashCode();
                    throw null;
                }
                MediationEndPoint[] mediationEndPointArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                int i4 = onExtraCallback + 19;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return mediationEndPointArrOnExtraCallbackWithResult;
                }
                throw null;
            }

            public final MediationEndPoint onExtraCallback(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                MediationEndPoint mediationEndPoint = new MediationEndPoint(parcel.readString(), parcel.readString(), parcel.readString());
                int i2 = onExtraCallbackWithResult + 19;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return mediationEndPoint;
                }
                throw null;
            }

            public final MediationEndPoint[] onExtraCallbackWithResult(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 11;
                onExtraCallback = i3 % 128;
                MediationEndPoint[] mediationEndPointArr = new MediationEndPoint[i];
                if (i3 % 2 != 0) {
                    int i4 = 9 / 0;
                }
                return mediationEndPointArr;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = onNavigationEvent + 29;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public MediationEndPoint() {
            this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 39;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 1;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 89 / 0;
            }
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 49;
                onExtraCallbackWithResult = i5 % 128;
                return i5 % 2 == 0;
            }
            if (!(obj instanceof MediationEndPoint)) {
                return false;
            }
            MediationEndPoint mediationEndPoint = (MediationEndPoint) obj;
            return Intrinsics.areEqual(this.result, mediationEndPoint.result) && Intrinsics.areEqual(this.exposure, mediationEndPoint.exposure) && Intrinsics.areEqual(this.error, mediationEndPoint.error);
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            String str = this.result;
            int iHashCode2 = 0;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.exposure;
            if (str2 == null) {
                int i2 = IAuthTabCallback + 101;
                onExtraCallbackWithResult = i2 % 128;
                iHashCode = i2 % 2 != 0 ? 1 : 0;
            } else {
                iHashCode = str2.hashCode();
            }
            String str3 = this.error;
            if (str3 != null) {
                iHashCode2 = str3.hashCode();
                int i3 = onExtraCallbackWithResult + 15;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            int i5 = (((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2;
            int i6 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MediationEndPoint(result=" + this.result + ", exposure=" + this.exposure + ", error=" + this.error + ")";
            int i2 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.result);
            parcel.writeString(this.exposure);
            parcel.writeString(this.error);
            int i5 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MediationEndPoint> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 115;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                NativeAdsDto$MediationEndPoint$$serializer nativeAdsDto$MediationEndPoint$$serializer = NativeAdsDto$MediationEndPoint$$serializer.INSTANCE;
                if (i3 != 0) {
                    int i4 = 78 / 0;
                }
                return nativeAdsDto$MediationEndPoint$$serializer;
            }
        }

        public /* synthetic */ MediationEndPoint(int i, String str, String str2, String str3, okycx okycxVar) {
            Object obj = null;
            if ((i & 1) == 0) {
                this.result = null;
            } else {
                this.result = str;
                int i2 = IAuthTabCallback + 15;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            }
            if ((i & 2) == 0) {
                int i4 = IAuthTabCallback + 21;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                this.exposure = null;
            } else {
                this.exposure = str2;
            }
            if ((i & 4) == 0) {
                this.error = null;
                return;
            }
            this.error = str3;
            int i6 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public MediationEndPoint(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.result = str;
            this.exposure = str2;
            this.error = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallback(MediationEndPoint mediationEndPoint, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i2 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    String str = mediationEndPoint.result;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (mediationEndPoint.result != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, mediationEndPoint.result);
                }
            }
            if (!(!vylVar.onWarmupCompleted(serialDescriptor, 1)) || mediationEndPoint.exposure != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, mediationEndPoint.exposure);
                int i3 = IAuthTabCallback + 109;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                int i5 = IAuthTabCallback + 7;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                if (mediationEndPoint.error == null) {
                    return;
                }
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, mediationEndPoint.error);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ MediationEndPoint(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 35;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
                str = null;
            }
            if ((i & 2) != 0) {
                int i4 = IAuthTabCallback;
                int i5 = i4 + 61;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 19;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
                str2 = null;
            }
            this(str, str2, (i & 4) != 0 ? null : str3);
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 65;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.result;
            int i5 = i2 + 37;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.exposure;
            int i5 = i3 + 33;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String IAuthTabCallback() {
            String str;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 75;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.error;
                int i4 = 49 / 0;
            } else {
                str = this.error;
            }
            int i5 = i2 + 17;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 0;
            }
            return str;
        }
    }

    @liq(onNavigationEvent = onNavigationEvent.class)
    public static final class AdAsset implements Parcelable {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final int $stable = 0;
        public static final Parcelable.Creator<AdAsset> CREATOR;
        public static final Companion Companion;
        private static long IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final Creative creative;
        private final String creativeVersion;
        private final String eventPayload;
        private final List<String> eventTrackingUrls;
        private final List<String> eventTypes;
        private final NativeExtension nativeExtension;
        private final String styleId;

        public static final class onExtraCallbackWithResult implements Parcelable.Creator<AdAsset> {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final AdAsset[] IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent;
                int i4 = i3 + 103;
                onExtraCallbackWithResult = i4 % 128;
                AdAsset[] adAssetArr = new AdAsset[i];
                if (i4 % 2 == 0) {
                    int i5 = 18 / 0;
                }
                int i6 = i3 + 57;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return adAssetArr;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ AdAsset createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 83;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AdAsset adAssetOnExtraCallback = onExtraCallback(parcel);
                if (i3 != 0) {
                    int i4 = 88 / 0;
                }
                return adAssetOnExtraCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ AdAsset[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 63;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                AdAsset[] adAssetArrIAuthTabCallback = IAuthTabCallback(i);
                int i5 = onNavigationEvent + 1;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return adAssetArrIAuthTabCallback;
                }
                throw null;
            }

            public final AdAsset onExtraCallback(Parcel parcel) {
                NativeExtension nativeExtensionCreateFromParcel;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                Creative creative = (Creative) parcel.readParcelable(AdAsset.class.getClassLoader());
                String string2 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                String string3 = parcel.readString();
                Object obj = null;
                if (parcel.readInt() == 0) {
                    int i2 = onExtraCallbackWithResult + 57;
                    int i3 = i2 % 128;
                    onNavigationEvent = i3;
                    if (i2 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i4 = i3 + 5;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    nativeExtensionCreateFromParcel = null;
                } else {
                    nativeExtensionCreateFromParcel = NativeExtension.CREATOR.createFromParcel(parcel);
                }
                AdAsset adAsset = new AdAsset(string, creative, string2, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, string3, nativeExtensionCreateFromParcel);
                int i6 = onNavigationEvent + 5;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    return adAsset;
                }
                obj.hashCode();
                throw null;
            }
        }

        static {
            asInterface();
            Companion = new Companion(null);
            CREATOR = new onExtraCallbackWithResult();
            int i = onNavigationEvent + 87;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public AdAsset() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
            int i7 = ~i5;
            int i8 = ~(i7 | i);
            int i9 = (~(i7 | (~i) | i2)) | (~(i2 | i5 | i));
            int i10 = ~i2;
            int i11 = (~(i | i5)) | (~(i10 | i)) | (~(i10 | i5));
            int i12 = i2 + i5 + i6 + (1698977638 * i4) + (1466394737 * i3);
            int i13 = i12 * i12;
            int i14 = (((-1250291696) * i2) - 490274816) + ((-1116082190) * i5) + (i8 * (-67104753)) + ((-67104753) * i9) + (67104753 * i11) + ((-1183186944) * i6) + (1553727488 * i4) + (1859780608 * i3) + (925827072 * i13);
            int i15 = ((i2 * (-1787956080)) - 1478154965) + (i5 * (-1787955198)) + (i8 * (-441)) + (i9 * (-441)) + (i11 * 441) + (i6 * (-1787955639)) + (i4 * 552005654) + (i3 * (-2013897159)) + (i13 * (-429457408));
            return i14 + ((i15 * i15) * (-402587648)) != 1 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
        }

        public static /* synthetic */ AdAsset onExtraCallbackWithResult(AdAsset adAsset, String str, Creative creative, String str2, List list, List list2, String str3, NativeExtension nativeExtension, int i, Object obj) {
            String str4;
            String str5;
            List list3;
            List list4;
            NativeExtension nativeExtension2;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                str4 = adAsset.styleId;
                int i6 = i3 + 115;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            } else {
                str4 = str;
            }
            Creative creative2 = (i & 2) != 0 ? adAsset.creative : creative;
            Object obj2 = null;
            if ((i & 4) != 0) {
                int i8 = onExtraCallback;
                int i9 = i8 + 59;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 != 0) {
                    String str6 = adAsset.creativeVersion;
                    throw null;
                }
                str5 = adAsset.creativeVersion;
                int i10 = i8 + 45;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 2 % 3;
                }
            } else {
                str5 = str2;
            }
            if ((i & 8) != 0) {
                int i12 = onExtraCallback + 75;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                list3 = adAsset.eventTrackingUrls;
            } else {
                list3 = list;
            }
            if ((i & 16) != 0) {
                int i14 = onExtraCallback + 115;
                onWarmupCompleted = i14 % 128;
                if (i14 % 2 != 0) {
                    List<String> list5 = adAsset.eventTypes;
                    obj2.hashCode();
                    throw null;
                }
                list4 = adAsset.eventTypes;
            } else {
                list4 = list2;
            }
            String str7 = (i & 32) != 0 ? adAsset.eventPayload : str3;
            if ((i & 64) != 0) {
                int i15 = onWarmupCompleted + 43;
                onExtraCallback = i15 % 128;
                if (i15 % 2 == 0) {
                    NativeExtension nativeExtension3 = adAsset.nativeExtension;
                    obj2.hashCode();
                    throw null;
                }
                nativeExtension2 = adAsset.nativeExtension;
            } else {
                nativeExtension2 = nativeExtension;
            }
            return adAsset.onExtraCallback(str4, creative2, str5, list3, list4, str7, nativeExtension2);
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 39;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 55;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return 0;
            }
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdAsset)) {
                int i2 = onWarmupCompleted + 67;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            AdAsset adAsset = (AdAsset) obj;
            if ((!Intrinsics.areEqual(this.styleId, adAsset.styleId)) || (!Intrinsics.areEqual(this.creative, adAsset.creative))) {
                return false;
            }
            if (!Intrinsics.areEqual(this.creativeVersion, adAsset.creativeVersion)) {
                int i4 = onWarmupCompleted + 77;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.eventTrackingUrls, adAsset.eventTrackingUrls)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.eventTypes, adAsset.eventTypes)) {
                int i6 = onWarmupCompleted + 97;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.eventPayload, adAsset.eventPayload) || !Intrinsics.areEqual(this.nativeExtension, adAsset.nativeExtension)) {
                return false;
            }
            int i8 = onWarmupCompleted + 51;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.styleId.hashCode();
            int iHashCode3 = this.creative.hashCode();
            int iHashCode4 = this.creativeVersion.hashCode();
            int iHashCode5 = this.eventTrackingUrls.hashCode();
            int iHashCode6 = this.eventTypes.hashCode();
            int iHashCode7 = this.eventPayload.hashCode();
            NativeExtension nativeExtension = this.nativeExtension;
            if (nativeExtension == null) {
                int i4 = onWarmupCompleted;
                int i5 = i4 + 37;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 29;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                iHashCode = 0;
            } else {
                iHashCode = nativeExtension.hashCode();
            }
            return (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode;
        }

        public final AdAsset onExtraCallback(@NotNull String str, @NotNull Creative creative, @NotNull String str2, @NotNull List<String> list, @NotNull List<String> list2, @NotNull String str3, @Nullable NativeExtension nativeExtension) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(creative, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            AdAsset adAsset = new AdAsset(str, creative, str2, list, list2, str3, nativeExtension);
            int i2 = onExtraCallback + 33;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return adAsset;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "AdAsset(styleId=" + this.styleId + ", creative=" + this.creative + ", creativeVersion=" + this.creativeVersion + ", eventTrackingUrls=" + this.eventTrackingUrls + ", eventTypes=" + this.eventTypes + ", eventPayload=" + this.eventPayload + ", nativeExtension=" + this.nativeExtension + ")";
            int i2 = onWarmupCompleted + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 95;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.styleId);
            parcel.writeParcelable(this.creative, i);
            parcel.writeString(this.creativeVersion);
            parcel.writeStringList(this.eventTrackingUrls);
            parcel.writeStringList(this.eventTypes);
            parcel.writeString(this.eventPayload);
            NativeExtension nativeExtension = this.nativeExtension;
            if (nativeExtension == null) {
                int i5 = onWarmupCompleted + 117;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            nativeExtension.writeToParcel(parcel, i);
            int i7 = onExtraCallback + 97;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $11 + 89;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24, ExpandableListView.getPackedPositionChild(0L) + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), 59 - Color.blue(0), (Process.myPid() >> 22) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i6 = $10 + 31;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 59 - (Process.myPid() >> 22), 6383 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    throw null;
                }
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), KeyEvent.keyCodeFromString("") + 59, 6383 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2);
        }

        public static final class onNavigationEvent implements KSerializer<AdAsset> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static char[] IAuthTabCallback = null;
            private static boolean IAuthTabCallbackDefault = false;
            private static int IAuthTabCallbackStub = 0;
            private static int access000 = 0;
            private static int asBinder = 0;
            private static boolean asInterface = false;
            private static int getInterfaceDescriptor = 1;
            private static final Map<String, Function2<wie2, JsonElement, Creative>> onExtraCallback;
            private static final SerialDescriptor onExtraCallbackWithResult;
            public static final onNavigationEvent onNavigationEvent;
            private static int onTransact = 1;
            public static final int onWarmupCompleted;

            public static /* synthetic */ Creative IAuthTabCallback(wie2 wie2Var, JsonElement jsonElement) {
                int i = 2 % 2;
                int i2 = onTransact + 43;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                Creative creativeIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(wie2Var, jsonElement);
                int i4 = onTransact + 117;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                return creativeIAuthTabCallbackStubProxy;
            }

            public static /* synthetic */ Creative IAuthTabCallbackDefault(wie2 wie2Var, JsonElement jsonElement) {
                int i = 2 % 2;
                int i2 = onTransact + 101;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 != 0) {
                    access100(wie2Var, jsonElement);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Creative creativeAccess100 = access100(wie2Var, jsonElement);
                int i3 = onTransact + 11;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                return creativeAccess100;
            }

            public static /* synthetic */ Creative IAuthTabCallback_Parcel(wie2 wie2Var, JsonElement jsonElement) {
                int i = 2 % 2;
                int i2 = onTransact + 91;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                Creative creativeExtraCallback = extraCallback(wie2Var, jsonElement);
                int i4 = onTransact + 67;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    return creativeExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ Creative access000(wie2 wie2Var, JsonElement jsonElement) {
                int i = 2 % 2;
                int i2 = onTransact + 63;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                Creative creativeOnActivityLayout = onActivityLayout(wie2Var, jsonElement);
                int i4 = IAuthTabCallbackStub + 87;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    return creativeOnActivityLayout;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ Creative asInterface(wie2 wie2Var, JsonElement jsonElement) {
                int i = 2 % 2;
                int i2 = onTransact + 121;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                Creative creative = (Creative) onExtraCallback(new Object[]{wie2Var, jsonElement}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1670291233, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, -1670291230);
                int i4 = IAuthTabCallbackStub + 19;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    return creative;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ Creative onExtraCallback(wie2 wie2Var, JsonElement jsonElement) {
                int i = 2 % 2;
                int i2 = onTransact + 27;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                Creative interfaceDescriptor = getInterfaceDescriptor(wie2Var, jsonElement);
                int i4 = IAuthTabCallbackStub + 63;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    return interfaceDescriptor;
                }
                throw null;
            }

            private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
                wie2 wie2Var = (wie2) objArr[0];
                JsonElement jsonElement = (JsonElement) objArr[1];
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 45;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                Creative creative = (Creative) onExtraCallback(new Object[]{wie2Var, jsonElement}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 62472120, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, -62472120);
                int i4 = onTransact + 53;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                return creative;
            }

            public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
                int i7 = ~((~i5) | i3);
                int i8 = (~((~i3) | (~i6))) | i7;
                int i9 = i3 | i6;
                int i10 = i3 + i6 + i4 + ((-39394691) * i) + ((-2104995841) * i2);
                int i11 = i10 * i10;
                int i12 = (i3 * (-1880913482)) + 198443008 + ((-1880913482) * i6) + ((-1126725195) * i7) + (i8 * 1126725195) + (1126725195 * i9) + ((-754188288) * i4) + ((-1529085952) * i) + ((-319553536) * i2) + ((-289079296) * i11);
                int i13 = ((i3 * 1773844906) - 1404835566) + (i6 * 1773844906) + (i7 * (-613)) + (i8 * 613) + (i9 * 613) + (i4 * 1773845519) + (i * 1055723859) + (i2 * 1996616689) + (i11 * (-1450508288));
                int i14 = i12 + (i13 * i13 * (-778371072));
                return i14 != 1 ? i14 != 2 ? i14 != 3 ? i14 != 4 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr);
            }

            public static /* synthetic */ Unit onExtraCallback(qt qtVar) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 57;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(qtVar);
                if (i3 == 0) {
                    int i4 = 81 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }

            public static /* synthetic */ Creative onExtraCallbackWithResult(wie2 wie2Var, JsonElement jsonElement) {
                int i = 2 % 2;
                int i2 = onTransact + 31;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 != 0) {
                    readTypedObject(wie2Var, jsonElement);
                    throw null;
                }
                Creative typedObject = readTypedObject(wie2Var, jsonElement);
                int i3 = IAuthTabCallbackStub + 73;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                return typedObject;
            }

            public static /* synthetic */ Creative onNavigationEvent(wie2 wie2Var, JsonElement jsonElement) {
                int i = 2 % 2;
                int i2 = onTransact + 125;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                Creative creativeOnPostMessage = onPostMessage(wie2Var, jsonElement);
                int i4 = onTransact + 35;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 46 / 0;
                }
                return creativeOnPostMessage;
            }

            private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
                wie2 wie2Var = (wie2) objArr[0];
                JsonElement jsonElement = (JsonElement) objArr[1];
                int i = 2 % 2;
                int i2 = onTransact + 111;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 != 0) {
                    ICustomTabsCallback(wie2Var, jsonElement);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Creative creativeICustomTabsCallback = ICustomTabsCallback(wie2Var, jsonElement);
                int i3 = IAuthTabCallbackStub + 89;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                return creativeICustomTabsCallback;
            }

            public static /* synthetic */ Creative onWarmupCompleted(wie2 wie2Var, JsonElement jsonElement) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 117;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                Creative creativeWriteTypedObject = writeTypedObject(wie2Var, jsonElement);
                if (i3 == 0) {
                    int i4 = 54 / 0;
                }
                return creativeWriteTypedObject;
            }

            private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
                wie2 wie2Var = (wie2) objArr[0];
                JsonElement jsonElement = (JsonElement) objArr[1];
                int i = 2 % 2;
                int i2 = onTransact + 9;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 == 0) {
                    return onMinimized(wie2Var, jsonElement);
                }
                onMinimized(wie2Var, jsonElement);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
                char[] cArr2 = IAuthTabCallback;
                if (cArr2 != null) {
                    int i3 = $11 + 49;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), Color.green(0) + 77, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                            }
                            cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                Object[] objArr3 = {Integer.valueOf(asBinder)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 74 - TextUtils.indexOf((CharSequence) "", '0'), 16037 - (Process.myTid() >> 22), -807942443, false, "y", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i6 = 1052772399;
                if (IAuthTabCallbackDefault) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    int i7 = $11 + 117;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i9 = $11 + 37;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 63 - TextUtils.getCapsMode("", 0, 0), 12214 - KeyEvent.getDeadChar(0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        i6 = 1052772399;
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (!asInterface) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                    char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i11 = $10 + 91;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                int i13 = $10 + 5;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 63 - Color.red(0), Gravity.getAbsoluteGravity(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr6);
            }

            private onNavigationEvent() {
            }

            public /* synthetic */ Object deserialize(Decoder decoder) throws Throwable {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 63;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    onWarmupCompleted(decoder);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                AdAsset adAssetOnWarmupCompleted = onWarmupCompleted(decoder);
                int i3 = IAuthTabCallbackStub + 37;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                return adAssetOnWarmupCompleted;
            }

            public /* synthetic */ void serialize(Encoder encoder, Object obj) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 93;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult(encoder, (AdAsset) obj);
                if (i3 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            static {
                onNavigationEvent();
                onNavigationEvent = new onNavigationEvent();
                onExtraCallbackWithResult = ujb.IAuthTabCallback("AdAsset", new SerialDescriptor[0], new Function1() { // from class: im.toss.ads_sdk.model.NativeAdsDto$AdAsset$AdAssetSerializer$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj) {
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 33;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        Unit unitOnExtraCallback = NativeAdsDto.AdAsset.onNavigationEvent.onExtraCallback((qt) obj);
                        int i4 = onExtraCallbackWithResult + 73;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 != 0) {
                            return unitOnExtraCallback;
                        }
                        throw null;
                    }
                });
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-127}, Color.alpha(0) + 127, objArr);
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new Function2() { // from class: im.toss.ads_sdk.model.NativeAdsDto$AdAsset$AdAssetSerializer$$ExternalSyntheticLambda4
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = onNavigationEvent + 119;
                        onExtraCallback = i2 % 128;
                        wie2 wie2Var = (wie2) obj;
                        JsonElement jsonElement = (JsonElement) obj2;
                        if (i2 % 2 != 0) {
                            return NativeAdsDto.AdAsset.onNavigationEvent.IAuthTabCallbackDefault(wie2Var, jsonElement);
                        }
                        NativeAdsDto.AdAsset.onNavigationEvent.IAuthTabCallbackDefault(wie2Var, jsonElement);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                });
                Object[] objArr2 = new Object[1];
                a(null, null, new byte[]{-126}, Color.red(0) + 127, objArr2);
                onExtraCallback = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new Function2() { // from class: im.toss.ads_sdk.model.NativeAdsDto$AdAsset$AdAssetSerializer$$ExternalSyntheticLambda5
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = onNavigationEvent + 61;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        NativeAdsDto.Creative creativeIAuthTabCallback = NativeAdsDto.AdAsset.onNavigationEvent.IAuthTabCallback((wie2) obj, (JsonElement) obj2);
                        int i4 = onExtraCallbackWithResult + 103;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        return creativeIAuthTabCallback;
                    }
                }), getWrite.IAuthTabCallback("3", new Function2() { // from class: im.toss.ads_sdk.model.NativeAdsDto$AdAsset$AdAssetSerializer$$ExternalSyntheticLambda6
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 105;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        NativeAdsDto.Creative creativeOnExtraCallbackWithResult = NativeAdsDto.AdAsset.onNavigationEvent.onExtraCallbackWithResult((wie2) obj, (JsonElement) obj2);
                        int i4 = onExtraCallbackWithResult + 109;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 95 / 0;
                        }
                        return creativeOnExtraCallbackWithResult;
                    }
                }), getWrite.IAuthTabCallback("4", new Function2() { // from class: im.toss.ads_sdk.model.NativeAdsDto$AdAsset$AdAssetSerializer$$ExternalSyntheticLambda7
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = onNavigationEvent + 5;
                        onExtraCallback = i2 % 128;
                        wie2 wie2Var = (wie2) obj;
                        JsonElement jsonElement = (JsonElement) obj2;
                        if (i2 % 2 == 0) {
                            NativeAdsDto.AdAsset.onNavigationEvent.IAuthTabCallback_Parcel(wie2Var, jsonElement);
                            throw null;
                        }
                        NativeAdsDto.Creative creativeIAuthTabCallback_Parcel = NativeAdsDto.AdAsset.onNavigationEvent.IAuthTabCallback_Parcel(wie2Var, jsonElement);
                        int i3 = onNavigationEvent + 21;
                        onExtraCallback = i3 % 128;
                        if (i3 % 2 != 0) {
                            return creativeIAuthTabCallback_Parcel;
                        }
                        throw null;
                    }
                }), getWrite.IAuthTabCallback("5", new Function2() { // from class: im.toss.ads_sdk.model.NativeAdsDto$AdAsset$AdAssetSerializer$$ExternalSyntheticLambda8
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = onExtraCallback + 93;
                        IAuthTabCallback = i2 % 128;
                        int i3 = i2 % 2;
                        Object[] objArr3 = {(wie2) obj, (JsonElement) obj2};
                        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                        if (i3 == 0) {
                            return (NativeAdsDto.Creative) NativeAdsDto.AdAsset.onNavigationEvent.onExtraCallback(objArr3, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 311734581, iOnExtraCallback2, iOnExtraCallback, -311734579);
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                }), getWrite.IAuthTabCallback("6", new Function2() { // from class: im.toss.ads_sdk.model.NativeAdsDto$AdAsset$AdAssetSerializer$$ExternalSyntheticLambda9
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = onNavigationEvent + 57;
                        onExtraCallbackWithResult = i2 % 128;
                        wie2 wie2Var = (wie2) obj;
                        JsonElement jsonElement = (JsonElement) obj2;
                        if (i2 % 2 == 0) {
                            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                        NativeAdsDto.Creative creative = (NativeAdsDto.Creative) NativeAdsDto.AdAsset.onNavigationEvent.onExtraCallback(new Object[]{wie2Var, jsonElement}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1978517979, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, 1978517980);
                        int i3 = onExtraCallbackWithResult + 65;
                        onNavigationEvent = i3 % 128;
                        int i4 = i3 % 2;
                        return creative;
                    }
                }), getWrite.IAuthTabCallback("7", new Function2() { // from class: im.toss.ads_sdk.model.NativeAdsDto$AdAsset$AdAssetSerializer$$ExternalSyntheticLambda10
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        NativeAdsDto.Creative creative;
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 39;
                        onExtraCallbackWithResult = i2 % 128;
                        wie2 wie2Var = (wie2) obj;
                        JsonElement jsonElement = (JsonElement) obj2;
                        if (i2 % 2 == 0) {
                            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                            creative = (NativeAdsDto.Creative) NativeAdsDto.AdAsset.onNavigationEvent.onExtraCallback(new Object[]{wie2Var, jsonElement}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 96913238, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, -96913234);
                            int i3 = 1 / 0;
                        } else {
                            int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                            creative = (NativeAdsDto.Creative) NativeAdsDto.AdAsset.onNavigationEvent.onExtraCallback(new Object[]{wie2Var, jsonElement}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 96913238, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, -96913234);
                        }
                        int i4 = IAuthTabCallback + 11;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                        return creative;
                    }
                }), getWrite.IAuthTabCallback(UCPApiConstants.ERR_CARD_DEVICES_RES_FAIL, new Function2() { // from class: im.toss.ads_sdk.model.NativeAdsDto$AdAsset$AdAssetSerializer$$ExternalSyntheticLambda11
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 31;
                        onWarmupCompleted = i2 % 128;
                        int i3 = i2 % 2;
                        NativeAdsDto.Creative creativeAsInterface = NativeAdsDto.AdAsset.onNavigationEvent.asInterface((wie2) obj, (JsonElement) obj2);
                        int i4 = IAuthTabCallback + 45;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        return creativeAsInterface;
                    }
                }), getWrite.IAuthTabCallback("9", new Function2() { // from class: im.toss.ads_sdk.model.NativeAdsDto$AdAsset$AdAssetSerializer$$ExternalSyntheticLambda12
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = onExtraCallbackWithResult + 67;
                        onWarmupCompleted = i2 % 128;
                        Object obj3 = null;
                        wie2 wie2Var = (wie2) obj;
                        JsonElement jsonElement = (JsonElement) obj2;
                        if (i2 % 2 != 0) {
                            NativeAdsDto.AdAsset.onNavigationEvent.onNavigationEvent(wie2Var, jsonElement);
                            obj3.hashCode();
                            throw null;
                        }
                        NativeAdsDto.Creative creativeOnNavigationEvent = NativeAdsDto.AdAsset.onNavigationEvent.onNavigationEvent(wie2Var, jsonElement);
                        int i3 = onExtraCallbackWithResult + 21;
                        onWarmupCompleted = i3 % 128;
                        if (i3 % 2 == 0) {
                            return creativeOnNavigationEvent;
                        }
                        obj3.hashCode();
                        throw null;
                    }
                }), getWrite.IAuthTabCallback("10", new Function2() { // from class: im.toss.ads_sdk.model.NativeAdsDto$AdAsset$AdAssetSerializer$$ExternalSyntheticLambda1
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = onExtraCallback + 51;
                        onWarmupCompleted = i2 % 128;
                        int i3 = i2 % 2;
                        NativeAdsDto.Creative creativeAccess000 = NativeAdsDto.AdAsset.onNavigationEvent.access000((wie2) obj, (JsonElement) obj2);
                        int i4 = onWarmupCompleted + 7;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        return creativeAccess000;
                    }
                }), getWrite.IAuthTabCallback("11", new Function2() { // from class: im.toss.ads_sdk.model.NativeAdsDto$AdAsset$AdAssetSerializer$$ExternalSyntheticLambda2
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = onExtraCallbackWithResult + 91;
                        onWarmupCompleted = i2 % 128;
                        int i3 = i2 % 2;
                        NativeAdsDto.Creative creativeOnExtraCallback = NativeAdsDto.AdAsset.onNavigationEvent.onExtraCallback((wie2) obj, (JsonElement) obj2);
                        int i4 = onWarmupCompleted + 121;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 != 0) {
                            return creativeOnExtraCallback;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                }), getWrite.IAuthTabCallback("12", new Function2() { // from class: im.toss.ads_sdk.model.NativeAdsDto$AdAsset$AdAssetSerializer$$ExternalSyntheticLambda3
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = onExtraCallbackWithResult + 7;
                        onExtraCallback = i2 % 128;
                        int i3 = i2 % 2;
                        NativeAdsDto.Creative creativeOnWarmupCompleted = NativeAdsDto.AdAsset.onNavigationEvent.onWarmupCompleted((wie2) obj, (JsonElement) obj2);
                        if (i3 != 0) {
                            int i4 = 6 / 0;
                        }
                        int i5 = onExtraCallbackWithResult + 83;
                        onExtraCallback = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 85 / 0;
                        }
                        return creativeOnWarmupCompleted;
                    }
                })});
                onWarmupCompleted = 8;
                int i = getInterfaceDescriptor + 65;
                access000 = i % 128;
                if (i % 2 != 0) {
                    int i2 = 95 / 0;
                }
            }

            public SerialDescriptor getDescriptor() {
                SerialDescriptor serialDescriptor;
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 125;
                int i3 = i2 % 128;
                onTransact = i3;
                if (i2 % 2 == 0) {
                    serialDescriptor = onExtraCallbackWithResult;
                    int i4 = 29 / 0;
                } else {
                    serialDescriptor = onExtraCallbackWithResult;
                }
                int i5 = i3 + 59;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return serialDescriptor;
            }

            private static final Unit onExtraCallbackWithResult(qt qtVar) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(qtVar, "");
                List listEmptyList = CollectionsKt.emptyList();
                getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
                qtVar.onExtraCallback("styleId", getwrigglelayout.getDescriptor(), listEmptyList, false);
                qtVar.onExtraCallback("creative", JsonElement.Companion.serializer().getDescriptor(), CollectionsKt.emptyList(), false);
                qtVar.onExtraCallback("creativeVersion", getwrigglelayout.getDescriptor(), CollectionsKt.emptyList(), true);
                qtVar.onExtraCallback("eventTrackingUrls", new checkCanOpenLandingPage(getwrigglelayout).getDescriptor(), CollectionsKt.emptyList(), true);
                qtVar.onExtraCallback("eventTypes", new checkCanOpenLandingPage(getwrigglelayout).getDescriptor(), CollectionsKt.emptyList(), true);
                qtVar.onExtraCallback("eventPayload", getwrigglelayout.getDescriptor(), CollectionsKt.emptyList(), true);
                Unit unit = Unit.INSTANCE;
                int i2 = onTransact + 75;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                return unit;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public AdAsset onWarmupCompleted(@NotNull Decoder decoder) throws Throwable {
                setAnimationType setanimationtype;
                String strOnWarmupCompleted;
                String strIntern;
                List listEmptyList;
                List listEmptyList2;
                JsonObject jsonObject;
                NativeExtension nativeExtension;
                JsonPrimitive jsonPrimitiveOnNavigationEvent;
                String strOnWarmupCompleted2;
                JsonPrimitive jsonPrimitiveOnNavigationEvent2;
                JsonPrimitive jsonPrimitiveOnNavigationEvent3;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(decoder, "");
                if (decoder instanceof setAnimationType) {
                    int i2 = IAuthTabCallbackStub + 61;
                    onTransact = i2 % 128;
                    if (i2 % 2 == 0) {
                        setanimationtype = (setAnimationType) decoder;
                        int i3 = 3 / 0;
                    } else {
                        setanimationtype = (setAnimationType) decoder;
                    }
                } else {
                    setanimationtype = null;
                }
                if (setanimationtype == null) {
                    throw new IllegalStateException("AdAssetSerializer only supports Json");
                }
                wie2 wie2VarAccess000 = setanimationtype.access000();
                JsonObject jsonObjectOnExtraCallbackWithResult = initRenderFinish.onExtraCallbackWithResult(setanimationtype.onWarmupCompleted());
                JsonElement jsonElement = (JsonElement) jsonObjectOnExtraCallbackWithResult.get("styleId");
                String strOnWarmupCompleted3 = (jsonElement == null || (jsonPrimitiveOnNavigationEvent3 = initRenderFinish.onNavigationEvent(jsonElement)) == null) ? null : jsonPrimitiveOnNavigationEvent3.onWarmupCompleted();
                String str = strOnWarmupCompleted3 == null ? "" : strOnWarmupCompleted3;
                JsonObject jsonObject2 = (JsonElement) jsonObjectOnExtraCallbackWithResult.get("creative");
                JsonElement jsonElement2 = (JsonElement) jsonObjectOnExtraCallbackWithResult.get("creativeVersion");
                if (jsonElement2 == null || (jsonPrimitiveOnNavigationEvent2 = initRenderFinish.onNavigationEvent(jsonElement2)) == null) {
                    strOnWarmupCompleted = null;
                } else {
                    int i4 = onTransact + 27;
                    IAuthTabCallbackStub = i4 % 128;
                    if (i4 % 2 != 0) {
                        strOnWarmupCompleted = jsonPrimitiveOnNavigationEvent2.onWarmupCompleted();
                        int i5 = 8 / 0;
                    } else {
                        strOnWarmupCompleted = jsonPrimitiveOnNavigationEvent2.onWarmupCompleted();
                    }
                }
                if (strOnWarmupCompleted == null) {
                    int i6 = IAuthTabCallbackStub + 41;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                    strOnWarmupCompleted = "";
                }
                if (StringsKt.isBlank(strOnWarmupCompleted)) {
                    int i8 = onTransact + 49;
                    IAuthTabCallbackStub = i8 % 128;
                    if (i8 % 2 != 0) {
                        Object[] objArr = new Object[1];
                        a(null, null, new byte[]{-127}, 23 >>> (ViewConfiguration.getKeyRepeatDelay() % 109), objArr);
                        strIntern = ((String) objArr[0]).intern();
                    } else {
                        Object[] objArr2 = new Object[1];
                        a(null, null, new byte[]{-127}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, objArr2);
                        strIntern = ((String) objArr2[0]).intern();
                    }
                } else {
                    strIntern = strOnWarmupCompleted;
                }
                JsonElement jsonElement3 = (JsonElement) jsonObjectOnExtraCallbackWithResult.get("eventTrackingUrls");
                if (jsonElement3 != null) {
                    wie2VarAccess000.onExtraCallback();
                    listEmptyList = (List) wie2VarAccess000.onExtraCallbackWithResult(new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent), jsonElement3);
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                }
                List list = listEmptyList;
                JsonElement jsonElement4 = (JsonElement) jsonObjectOnExtraCallbackWithResult.get("eventTypes");
                if (jsonElement4 != null) {
                    wie2VarAccess000.onExtraCallback();
                    listEmptyList2 = (List) wie2VarAccess000.onExtraCallbackWithResult(new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent), jsonElement4);
                    if (listEmptyList2 == null) {
                        listEmptyList2 = CollectionsKt.emptyList();
                        int i9 = onTransact + 115;
                        IAuthTabCallbackStub = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 3 / 5;
                        }
                    }
                }
                List list2 = listEmptyList2;
                JsonElement jsonElement5 = (JsonElement) jsonObjectOnExtraCallbackWithResult.get("eventPayload");
                String str2 = (jsonElement5 == null || (jsonPrimitiveOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonElement5)) == null || (strOnWarmupCompleted2 = jsonPrimitiveOnNavigationEvent.onWarmupCompleted()) == null) ? "" : strOnWarmupCompleted2;
                Creative creativeOnWarmupCompleted = jsonObject2 != null ? onWarmupCompleted(str, jsonObject2, wie2VarAccess000) : new Creative.None((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
                if (jsonObject2 instanceof JsonObject) {
                    int i11 = IAuthTabCallbackStub + 23;
                    onTransact = i11 % 128;
                    int i12 = i11 % 2;
                    jsonObject = jsonObject2;
                } else {
                    int i13 = IAuthTabCallbackStub + 87;
                    onTransact = i13 % 128;
                    int i14 = i13 % 2;
                    jsonObject = null;
                }
                if (jsonObject != null) {
                    int i15 = onTransact + 61;
                    IAuthTabCallbackStub = i15 % 128;
                    int i16 = i15 % 2;
                    JsonElement jsonElement6 = (JsonElement) jsonObject.get("nativeExtension");
                    if (jsonElement6 != null) {
                        try {
                            Result.Companion companion = Result.Companion;
                            wie2VarAccess000.onExtraCallback();
                            nativeExtension = Result.constructor-impl((NativeExtension) wie2VarAccess000.onExtraCallbackWithResult(NativeExtension.Companion.serializer(), jsonElement6));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            nativeExtension = Result.constructor-impl(ResultKt.createFailure(th));
                        }
                        nativeExtension = Result.onExtraCallback(nativeExtension) ? null : nativeExtension;
                    }
                }
                return new AdAsset(str, creativeOnWarmupCompleted, strIntern, list, list2, str2, nativeExtension);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public void onExtraCallbackWithResult(@NotNull Encoder encoder, @NotNull AdAsset adAsset) throws NoWhenBranchMatchedException {
                skipVideo skipvideo;
                JsonElement jsonElementIAuthTabCallback;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(encoder, "");
                Intrinsics.checkNotNullParameter(adAsset, "");
                Object obj = null;
                if (encoder instanceof skipVideo) {
                    int i2 = onTransact + 25;
                    IAuthTabCallbackStub = i2 % 128;
                    int i3 = i2 % 2;
                    skipvideo = (skipVideo) encoder;
                } else {
                    skipvideo = null;
                }
                if (skipvideo == null) {
                    throw new IllegalStateException("AdAssetSerializer only supports Json");
                }
                wie2 wie2VarOnExtraCallback = skipvideo.onExtraCallback();
                Creative creativeOnExtraCallbackWithResult = adAsset.onExtraCallbackWithResult();
                if (creativeOnExtraCallbackWithResult instanceof Creative.Normal) {
                    wie2VarOnExtraCallback.onExtraCallback();
                    jsonElementIAuthTabCallback = wie2VarOnExtraCallback.IAuthTabCallback(Creative.Normal.Companion.serializer(), creativeOnExtraCallbackWithResult);
                } else if (creativeOnExtraCallbackWithResult instanceof Creative.Feed) {
                    wie2VarOnExtraCallback.onExtraCallback();
                    jsonElementIAuthTabCallback = wie2VarOnExtraCallback.IAuthTabCallback(Creative.Feed.Companion.serializer(), creativeOnExtraCallbackWithResult);
                } else if (creativeOnExtraCallbackWithResult instanceof Creative.FullBanner) {
                    int i4 = IAuthTabCallbackStub + 37;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    wie2VarOnExtraCallback.onExtraCallback();
                    jsonElementIAuthTabCallback = wie2VarOnExtraCallback.IAuthTabCallback(Creative.FullBanner.Companion.serializer(), creativeOnExtraCallbackWithResult);
                } else if (creativeOnExtraCallbackWithResult instanceof Creative.ShortFormVideo) {
                    int i6 = onTransact + 57;
                    IAuthTabCallbackStub = i6 % 128;
                    int i7 = i6 % 2;
                    wie2VarOnExtraCallback.onExtraCallback();
                    jsonElementIAuthTabCallback = wie2VarOnExtraCallback.IAuthTabCallback(Creative.ShortFormVideo.Companion.serializer(), creativeOnExtraCallbackWithResult);
                } else if (creativeOnExtraCallbackWithResult instanceof Creative.FullPage) {
                    int i8 = onTransact + 83;
                    IAuthTabCallbackStub = i8 % 128;
                    int i9 = i8 % 2;
                    wie2VarOnExtraCallback.onExtraCallback();
                    jsonElementIAuthTabCallback = wie2VarOnExtraCallback.IAuthTabCallback(Creative.FullPage.Companion.serializer(), creativeOnExtraCallbackWithResult);
                } else if (creativeOnExtraCallbackWithResult instanceof Creative.ThumbnailBanner) {
                    int i10 = IAuthTabCallbackStub + 27;
                    onTransact = i10 % 128;
                    if (i10 % 2 == 0) {
                        wie2VarOnExtraCallback.onExtraCallback();
                        wie2VarOnExtraCallback.IAuthTabCallback(Creative.ThumbnailBanner.Companion.serializer(), creativeOnExtraCallbackWithResult);
                        obj.hashCode();
                        throw null;
                    }
                    wie2VarOnExtraCallback.onExtraCallback();
                    jsonElementIAuthTabCallback = wie2VarOnExtraCallback.IAuthTabCallback(Creative.ThumbnailBanner.Companion.serializer(), creativeOnExtraCallbackWithResult);
                } else if (creativeOnExtraCallbackWithResult instanceof Creative.ThumbnailVideo) {
                    wie2VarOnExtraCallback.onExtraCallback();
                    jsonElementIAuthTabCallback = wie2VarOnExtraCallback.IAuthTabCallback(Creative.ThumbnailVideo.Companion.serializer(), creativeOnExtraCallbackWithResult);
                } else if (creativeOnExtraCallbackWithResult instanceof Creative.TossstreamLongFormVideo) {
                    int i11 = IAuthTabCallbackStub + 47;
                    onTransact = i11 % 128;
                    if (i11 % 2 == 0) {
                        wie2VarOnExtraCallback.onExtraCallback();
                        wie2VarOnExtraCallback.IAuthTabCallback(Creative.TossstreamLongFormVideo.Companion.serializer(), creativeOnExtraCallbackWithResult);
                        obj.hashCode();
                        throw null;
                    }
                    wie2VarOnExtraCallback.onExtraCallback();
                    jsonElementIAuthTabCallback = wie2VarOnExtraCallback.IAuthTabCallback(Creative.TossstreamLongFormVideo.Companion.serializer(), creativeOnExtraCallbackWithResult);
                } else if (creativeOnExtraCallbackWithResult instanceof Creative.TossstreamShortFormVideo) {
                    wie2VarOnExtraCallback.onExtraCallback();
                    jsonElementIAuthTabCallback = wie2VarOnExtraCallback.IAuthTabCallback(Creative.TossstreamShortFormVideo.Companion.serializer(), creativeOnExtraCallbackWithResult);
                } else if (creativeOnExtraCallbackWithResult instanceof Creative.FeedVideo) {
                    wie2VarOnExtraCallback.onExtraCallback();
                    jsonElementIAuthTabCallback = wie2VarOnExtraCallback.IAuthTabCallback(Creative.FeedVideo.Companion.serializer(), creativeOnExtraCallbackWithResult);
                } else if (!(!(creativeOnExtraCallbackWithResult instanceof Creative.PlayableAd))) {
                    wie2VarOnExtraCallback.onExtraCallback();
                    jsonElementIAuthTabCallback = wie2VarOnExtraCallback.IAuthTabCallback(Creative.PlayableAd.Companion.serializer(), creativeOnExtraCallbackWithResult);
                } else if (creativeOnExtraCallbackWithResult instanceof Creative.RightBanner) {
                    wie2VarOnExtraCallback.onExtraCallback();
                    jsonElementIAuthTabCallback = wie2VarOnExtraCallback.IAuthTabCallback(Creative.RightBanner.Companion.serializer(), creativeOnExtraCallbackWithResult);
                } else {
                    if (!(creativeOnExtraCallbackWithResult instanceof Creative.None)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jsonElementIAuthTabCallback = new JsonObject(access8100.onNavigationEvent());
                }
                NativeExtension nativeExtensionIAuthTabCallbackStub = adAsset.IAuthTabCallbackStub();
                if (nativeExtensionIAuthTabCallbackStub != null && (jsonElementIAuthTabCallback instanceof JsonObject)) {
                    wie2VarOnExtraCallback.onExtraCallback();
                    jsonElementIAuthTabCallback = new JsonObject(access8100.IAuthTabCallback((Map) jsonElementIAuthTabCallback, getWrite.IAuthTabCallback("nativeExtension", wie2VarOnExtraCallback.IAuthTabCallback(NativeExtension.Companion.serializer(), nativeExtensionIAuthTabCallbackStub))));
                }
                Map mapOnExtraCallback = access8100.onExtraCallback();
                wie2.IAuthTabCallback iAuthTabCallback = wie2.Default;
                String strIAuthTabCallbackDefault = adAsset.IAuthTabCallbackDefault();
                iAuthTabCallback.onExtraCallback();
                getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
                mapOnExtraCallback.put("styleId", iAuthTabCallback.IAuthTabCallback(getwrigglelayout, strIAuthTabCallbackDefault));
                mapOnExtraCallback.put("creative", jsonElementIAuthTabCallback);
                String strOnExtraCallback = adAsset.onExtraCallback();
                iAuthTabCallback.onExtraCallback();
                mapOnExtraCallback.put("creativeVersion", iAuthTabCallback.IAuthTabCallback(getwrigglelayout, strOnExtraCallback));
                int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                if (!((List) AdAsset.IAuthTabCallback(iOnExtraCallback, -215433381, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 215433382, iOnExtraCallback2, new Object[]{adAsset})).isEmpty()) {
                    int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                    int iOnExtraCallback4 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
                    List list = (List) AdAsset.IAuthTabCallback(iOnExtraCallback3, -215433381, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 215433382, iOnExtraCallback4, new Object[]{adAsset});
                    wie2VarOnExtraCallback.onExtraCallback();
                    mapOnExtraCallback.put("eventTrackingUrls", wie2VarOnExtraCallback.IAuthTabCallback(new checkCanOpenLandingPage(getwrigglelayout), list));
                }
                if (!adAsset.onWarmupCompleted().isEmpty()) {
                    List<String> listOnWarmupCompleted = adAsset.onWarmupCompleted();
                    wie2VarOnExtraCallback.onExtraCallback();
                    mapOnExtraCallback.put("eventTypes", wie2VarOnExtraCallback.IAuthTabCallback(new checkCanOpenLandingPage(getwrigglelayout), listOnWarmupCompleted));
                }
                if (adAsset.IAuthTabCallback().length() > 0) {
                    int i12 = onTransact + 79;
                    IAuthTabCallbackStub = i12 % 128;
                    int i13 = i12 % 2;
                    String strIAuthTabCallback = adAsset.IAuthTabCallback();
                    iAuthTabCallback.onExtraCallback();
                    mapOnExtraCallback.put("eventPayload", iAuthTabCallback.IAuthTabCallback(getwrigglelayout, strIAuthTabCallback));
                }
                skipvideo.onExtraCallbackWithResult(new JsonObject(access8100.onExtraCallbackWithResult(mapOnExtraCallback)));
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
            
                r10 = im.toss.ads_sdk.model.NativeAdsDto.AdAsset.onNavigationEvent.onTransact + 45;
                im.toss.ads_sdk.model.NativeAdsDto.AdAsset.onNavigationEvent.IAuthTabCallbackStub = r10 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
            
                if ((r10 % 2) != 0) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
            
                return r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
            
                r9 = null;
                r9.hashCode();
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
            
                if (r9 != null) goto L10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
            
                if (r9 != null) goto L10;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private final Creative onWarmupCompleted(String str, JsonElement jsonElement, wie2 wie2Var) {
                int i = 2 % 2;
                Function2<wie2, JsonElement, Creative> function2 = onExtraCallback.get(str);
                if (function2 != null) {
                    int i2 = IAuthTabCallbackStub + 69;
                    onTransact = i2 % 128;
                    int i3 = i2 % 2;
                    Creative creative = (Creative) function2.invoke(wie2Var, jsonElement);
                    if (i3 == 0) {
                        int i4 = 92 / 0;
                    }
                }
                Creative.None none = new Creative.None((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
                int i5 = onTransact + 87;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 9 / 0;
                }
                return none;
            }

            private static final Creative access100(wie2 wie2Var, JsonElement jsonElement) {
                Object none;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(wie2Var, "");
                Intrinsics.checkNotNullParameter(jsonElement, "");
                try {
                    Result.Companion companion = Result.Companion;
                    wie2Var.onExtraCallback();
                    none = Result.constructor-impl((Creative) wie2Var.onExtraCallbackWithResult(Creative.Normal.Companion.serializer(), jsonElement));
                    int i2 = IAuthTabCallbackStub + 63;
                    onTransact = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 2 / 5;
                    }
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    none = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.exceptionOrNull-impl(none) != null) {
                    none = new Creative.None((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
                }
                Creative creative = (Creative) none;
                int i4 = IAuthTabCallbackStub + 107;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    return creative;
                }
                throw null;
            }

            private static final Creative IAuthTabCallbackStubProxy(wie2 wie2Var, JsonElement jsonElement) {
                Object none;
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 53;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(wie2Var, "");
                Intrinsics.checkNotNullParameter(jsonElement, "");
                try {
                    Result.Companion companion = Result.Companion;
                    wie2Var.onExtraCallback();
                    none = Result.constructor-impl((Creative) wie2Var.onExtraCallbackWithResult(Creative.Feed.Companion.serializer(), jsonElement));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    none = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.exceptionOrNull-impl(none) != null) {
                    none = new Creative.None((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
                    int i4 = IAuthTabCallbackStub + 123;
                    onTransact = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 5 % 3;
                    }
                }
                return (Creative) none;
            }

            private static final Creative readTypedObject(wie2 wie2Var, JsonElement jsonElement) {
                Object none;
                int i = 2 % 2;
                int i2 = onTransact + 65;
                IAuthTabCallbackStub = i2 % 128;
                try {
                } catch (Throwable th) {
                    Result.Companion companion = Result.Companion;
                    none = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(wie2Var, "");
                    Intrinsics.checkNotNullParameter(jsonElement, "");
                    Result.Companion companion2 = Result.Companion;
                    wie2Var.onExtraCallback();
                    Result.constructor-impl((Creative) wie2Var.onExtraCallbackWithResult(Creative.FullBanner.Companion.serializer(), jsonElement));
                    throw null;
                }
                Intrinsics.checkNotNullParameter(wie2Var, "");
                Intrinsics.checkNotNullParameter(jsonElement, "");
                Result.Companion companion3 = Result.Companion;
                wie2Var.onExtraCallback();
                none = Result.constructor-impl((Creative) wie2Var.onExtraCallbackWithResult(Creative.FullBanner.Companion.serializer(), jsonElement));
                if (Result.exceptionOrNull-impl(none) != null) {
                    none = new Creative.None((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
                    int i3 = onTransact + 55;
                    IAuthTabCallbackStub = i3 % 128;
                    int i4 = i3 % 2;
                }
                Creative creative = (Creative) none;
                int i5 = IAuthTabCallbackStub + 101;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return creative;
            }

            private static final Creative extraCallback(wie2 wie2Var, JsonElement jsonElement) {
                Object none;
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 73;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(wie2Var, "");
                Intrinsics.checkNotNullParameter(jsonElement, "");
                try {
                    Result.Companion companion = Result.Companion;
                    wie2Var.onExtraCallback();
                    none = Result.constructor-impl((Creative) wie2Var.onExtraCallbackWithResult(Creative.ShortFormVideo.Companion.serializer(), jsonElement));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    none = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.exceptionOrNull-impl(none) != null) {
                    none = new Creative.None((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
                }
                Creative creative = (Creative) none;
                int i4 = onTransact + 15;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    return creative;
                }
                throw null;
            }

            private static final Creative ICustomTabsCallback(wie2 wie2Var, JsonElement jsonElement) {
                Object none;
                int i = 2 % 2;
                int i2 = onTransact + 55;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(wie2Var, "");
                Intrinsics.checkNotNullParameter(jsonElement, "");
                try {
                    Result.Companion companion = Result.Companion;
                    wie2Var.onExtraCallback();
                    none = Result.constructor-impl((Creative) wie2Var.onExtraCallbackWithResult(Creative.FullPage.Companion.serializer(), jsonElement));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    none = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.exceptionOrNull-impl(none) != null) {
                    none = new Creative.None((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
                }
                Creative creative = (Creative) none;
                int i4 = onTransact + 31;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                return creative;
            }

            private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
                Object none;
                wie2 wie2Var = (wie2) objArr[0];
                JsonElement jsonElement = (JsonElement) objArr[1];
                int i = 2 % 2;
                int i2 = onTransact + 57;
                IAuthTabCallbackStub = i2 % 128;
                try {
                    if (i2 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(wie2Var, "");
                        Intrinsics.checkNotNullParameter(jsonElement, "");
                        Result.Companion companion = Result.Companion;
                        wie2Var.onExtraCallback();
                        none = Result.constructor-impl((Creative) wie2Var.onExtraCallbackWithResult(Creative.ThumbnailBanner.Companion.serializer(), jsonElement));
                        int i3 = 99 / 0;
                    } else {
                        Intrinsics.checkNotNullParameter(wie2Var, "");
                        Intrinsics.checkNotNullParameter(jsonElement, "");
                        Result.Companion companion2 = Result.Companion;
                        wie2Var.onExtraCallback();
                        none = Result.constructor-impl((Creative) wie2Var.onExtraCallbackWithResult(Creative.ThumbnailBanner.Companion.serializer(), jsonElement));
                    }
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.Companion;
                    none = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.exceptionOrNull-impl(none) != null) {
                    none = new Creative.None((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
                    int i4 = IAuthTabCallbackStub + 85;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                }
                return (Creative) none;
            }

            private static final Creative onMinimized(wie2 wie2Var, JsonElement jsonElement) {
                Object none;
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 9;
                onTransact = i2 % 128;
                try {
                } catch (Throwable th) {
                    Result.Companion companion = Result.Companion;
                    none = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(wie2Var, "");
                    Intrinsics.checkNotNullParameter(jsonElement, "");
                    Result.Companion companion2 = Result.Companion;
                    wie2Var.onExtraCallback();
                    Result.constructor-impl((Creative) wie2Var.onExtraCallbackWithResult(Creative.ThumbnailVideo.Companion.serializer(), jsonElement));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(wie2Var, "");
                Intrinsics.checkNotNullParameter(jsonElement, "");
                Result.Companion companion3 = Result.Companion;
                wie2Var.onExtraCallback();
                none = Result.constructor-impl((Creative) wie2Var.onExtraCallbackWithResult(Creative.ThumbnailVideo.Companion.serializer(), jsonElement));
                if (Result.exceptionOrNull-impl(none) != null) {
                    none = new Creative.None((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
                }
                Creative creative = (Creative) none;
                int i3 = onTransact + 105;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                return creative;
            }

            private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
                Object none;
                wie2 wie2Var = (wie2) objArr[0];
                JsonElement jsonElement = (JsonElement) objArr[1];
                int i = 2 % 2;
                int i2 = onTransact + 73;
                IAuthTabCallbackStub = i2 % 128;
                try {
                    if (i2 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(wie2Var, "");
                        Intrinsics.checkNotNullParameter(jsonElement, "");
                        Result.Companion companion = Result.Companion;
                        wie2Var.onExtraCallback();
                        none = Result.constructor-impl((Creative) wie2Var.onExtraCallbackWithResult(Creative.TossstreamLongFormVideo.Companion.serializer(), jsonElement));
                        int i3 = 18 / 0;
                    } else {
                        Intrinsics.checkNotNullParameter(wie2Var, "");
                        Intrinsics.checkNotNullParameter(jsonElement, "");
                        Result.Companion companion2 = Result.Companion;
                        wie2Var.onExtraCallback();
                        none = Result.constructor-impl((Creative) wie2Var.onExtraCallbackWithResult(Creative.TossstreamLongFormVideo.Companion.serializer(), jsonElement));
                    }
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.Companion;
                    none = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.exceptionOrNull-impl(none) != null) {
                    none = new Creative.None((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
                    int i4 = IAuthTabCallbackStub + 21;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                }
                return (Creative) none;
            }

            private static final Creative onPostMessage(wie2 wie2Var, JsonElement jsonElement) {
                Object none;
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 105;
                onTransact = i2 % 128;
                try {
                    if (i2 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(wie2Var, "");
                        Intrinsics.checkNotNullParameter(jsonElement, "");
                        Result.Companion companion = Result.Companion;
                        wie2Var.onExtraCallback();
                        none = Result.constructor-impl((Creative) wie2Var.onExtraCallbackWithResult(Creative.TossstreamShortFormVideo.Companion.serializer(), jsonElement));
                        int i3 = 98 / 0;
                    } else {
                        Intrinsics.checkNotNullParameter(wie2Var, "");
                        Intrinsics.checkNotNullParameter(jsonElement, "");
                        Result.Companion companion2 = Result.Companion;
                        wie2Var.onExtraCallback();
                        none = Result.constructor-impl((Creative) wie2Var.onExtraCallbackWithResult(Creative.TossstreamShortFormVideo.Companion.serializer(), jsonElement));
                    }
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.Companion;
                    none = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.exceptionOrNull-impl(none) != null) {
                    none = new Creative.None((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
                    int i4 = IAuthTabCallbackStub + 13;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                }
                return (Creative) none;
            }

            private static final Creative onActivityLayout(wie2 wie2Var, JsonElement jsonElement) {
                Object none;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(wie2Var, "");
                Intrinsics.checkNotNullParameter(jsonElement, "");
                try {
                    Result.Companion companion = Result.Companion;
                    wie2Var.onExtraCallback();
                    none = Result.constructor-impl((Creative) wie2Var.onExtraCallbackWithResult(Creative.FeedVideo.Companion.serializer(), jsonElement));
                    int i2 = onTransact + 85;
                    IAuthTabCallbackStub = i2 % 128;
                    int i3 = i2 % 2;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    none = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.exceptionOrNull-impl(none) != null) {
                    none = new Creative.None((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
                    int i4 = IAuthTabCallbackStub + 125;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                }
                Creative creative = (Creative) none;
                int i6 = IAuthTabCallbackStub + 57;
                onTransact = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 82 / 0;
                }
                return creative;
            }

            private static final Creative getInterfaceDescriptor(wie2 wie2Var, JsonElement jsonElement) {
                Object none;
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 117;
                onTransact = i2 % 128;
                try {
                } catch (Throwable th) {
                    Result.Companion companion = Result.Companion;
                    none = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(wie2Var, "");
                    Intrinsics.checkNotNullParameter(jsonElement, "");
                    Result.Companion companion2 = Result.Companion;
                    wie2Var.onExtraCallback();
                    Result.constructor-impl((Creative) wie2Var.onExtraCallbackWithResult(Creative.PlayableAd.Companion.serializer(), jsonElement));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(wie2Var, "");
                Intrinsics.checkNotNullParameter(jsonElement, "");
                Result.Companion companion3 = Result.Companion;
                wie2Var.onExtraCallback();
                none = Result.constructor-impl((Creative) wie2Var.onExtraCallbackWithResult(Creative.PlayableAd.Companion.serializer(), jsonElement));
                int i3 = onTransact + 25;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                if (Result.exceptionOrNull-impl(none) != null) {
                    none = new Creative.None((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
                }
                return (Creative) none;
            }

            private static final Creative writeTypedObject(wie2 wie2Var, JsonElement jsonElement) {
                Object none;
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 123;
                onTransact = i2 % 128;
                try {
                    if (i2 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(wie2Var, "");
                        Intrinsics.checkNotNullParameter(jsonElement, "");
                        Result.Companion companion = Result.Companion;
                        wie2Var.onExtraCallback();
                        none = Result.constructor-impl((Creative) wie2Var.onExtraCallbackWithResult(Creative.RightBanner.Companion.serializer(), jsonElement));
                        int i3 = 15 / 0;
                    } else {
                        Intrinsics.checkNotNullParameter(wie2Var, "");
                        Intrinsics.checkNotNullParameter(jsonElement, "");
                        Result.Companion companion2 = Result.Companion;
                        wie2Var.onExtraCallback();
                        none = Result.constructor-impl((Creative) wie2Var.onExtraCallbackWithResult(Creative.RightBanner.Companion.serializer(), jsonElement));
                    }
                    int i4 = IAuthTabCallbackStub + 99;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.Companion;
                    none = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.exceptionOrNull-impl(none) != null) {
                    none = new Creative.None((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
                }
                return (Creative) none;
            }

            public static /* synthetic */ Creative IAuthTabCallbackStub(wie2 wie2Var, JsonElement jsonElement) {
                int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                return (Creative) onExtraCallback(new Object[]{wie2Var, jsonElement}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1978517979, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, 1978517980);
            }

            public static /* synthetic */ Creative onTransact(wie2 wie2Var, JsonElement jsonElement) {
                int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                return (Creative) onExtraCallback(new Object[]{wie2Var, jsonElement}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 96913238, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, -96913234);
            }

            public static /* synthetic */ Creative asBinder(wie2 wie2Var, JsonElement jsonElement) {
                int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                return (Creative) onExtraCallback(new Object[]{wie2Var, jsonElement}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 311734581, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, -311734579);
            }

            private static final Creative extraCallbackWithResult(wie2 wie2Var, JsonElement jsonElement) {
                int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                return (Creative) onExtraCallback(new Object[]{wie2Var, jsonElement}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 62472120, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, -62472120);
            }

            private static final Creative onMessageChannelReady(wie2 wie2Var, JsonElement jsonElement) {
                int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                return (Creative) onExtraCallback(new Object[]{wie2Var, jsonElement}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1670291233, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, -1670291230);
            }

            static void onNavigationEvent() {
                IAuthTabCallback = new char[]{32405, 32404};
                asBinder = -1184334010;
                asInterface = true;
                IAuthTabCallbackDefault = true;
            }
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AdAsset> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 21;
                onExtraCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    onNavigationEvent onnavigationevent = onNavigationEvent.onNavigationEvent;
                    obj.hashCode();
                    throw null;
                }
                onNavigationEvent onnavigationevent2 = onNavigationEvent.onNavigationEvent;
                int i3 = onExtraCallback + 43;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    return onnavigationevent2;
                }
                throw null;
            }
        }

        public AdAsset(@NotNull String str, @NotNull Creative creative, @NotNull String str2, @NotNull List<String> list, @NotNull List<String> list2, @NotNull String str3, @Nullable NativeExtension nativeExtension) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(creative, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.styleId = str;
            this.creative = creative;
            this.creativeVersion = str2;
            this.eventTrackingUrls = list;
            this.eventTypes = list2;
            this.eventPayload = str3;
            this.nativeExtension = nativeExtension;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ AdAsset(String str, Creative creative, String str2, List list, List list2, String str3, NativeExtension nativeExtension, int i, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
            String str4;
            String strIntern;
            List listEmptyList;
            List listEmptyList2;
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted + 117;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 / 5;
                } else {
                    int i4 = 2 % 2;
                }
                str4 = "";
            } else {
                str4 = str;
            }
            Creative none = (i & 2) != 0 ? new Creative.None((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : creative;
            if ((i & 4) != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{1280}, 23430 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
                strIntern = ((String) objArr[0]).intern();
                int i5 = 2 % 2;
            } else {
                strIntern = str2;
            }
            if ((i & 8) != 0) {
                int i6 = onWarmupCompleted + 125;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                listEmptyList = CollectionsKt.emptyList();
            } else {
                listEmptyList = list;
            }
            if ((i & 16) != 0) {
                int i8 = onExtraCallback + 67;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    listEmptyList2 = CollectionsKt.emptyList();
                    int i9 = 51 / 0;
                } else {
                    listEmptyList2 = CollectionsKt.emptyList();
                }
            } else {
                listEmptyList2 = list2;
            }
            this(str4, none, strIntern, listEmptyList, listEmptyList2, (i & 32) == 0 ? str3 : "", (i & 64) != 0 ? null : nativeExtension);
        }

        public final String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String str = this.styleId;
            if (i3 != 0) {
                int i4 = 72 / 0;
            }
            return str;
        }

        public final Creative onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 79;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Creative creative = this.creative;
            int i5 = i2 + 87;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return creative;
            }
            throw null;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.creativeVersion;
            int i5 = i3 + 77;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 72 / 0;
            }
            return str;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            AdAsset adAsset = (AdAsset) objArr[0];
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            List<String> list = adAsset.eventTrackingUrls;
            if (i3 == 0) {
                return list;
            }
            throw null;
        }

        public final List<String> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            List<String> list = this.eventTypes;
            int i5 = i3 + 93;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.eventPayload;
            }
            throw null;
        }

        public final NativeExtension IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            NativeExtension nativeExtension = this.nativeExtension;
            int i4 = i3 + 19;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return nativeExtension;
            }
            throw null;
        }

        public final boolean onTransact() throws Throwable {
            String str;
            Object obj;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                str = this.creativeVersion;
                Object[] objArr = new Object[1];
                a(new char[]{1283}, 16821899 >>> Color.rgb(1, 0, 0), objArr);
                obj = objArr[0];
            } else {
                str = this.creativeVersion;
                Object[] objArr2 = new Object[1];
                a(new char[]{1283}, Color.rgb(0, 0, 0) + 16821899, objArr2);
                obj = objArr2[0];
            }
            boolean zAreEqual = Intrinsics.areEqual(str, ((String) obj).intern());
            int i3 = onWarmupCompleted + 87;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return zAreEqual;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            return ((Integer) IAuthTabCallback(iOnExtraCallback, 1479326444, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback3, -1479326444, iOnExtraCallback2, new Object[]{this})).intValue();
        }

        public final List<String> onNavigationEvent() {
            int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            int iOnExtraCallback3 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
            return (List) IAuthTabCallback(iOnExtraCallback, -215433381, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), iOnExtraCallback3, 215433382, iOnExtraCallback2, new Object[]{this});
        }

        static void asInterface() {
            IAuthTabCallback = -5880790196970160122L;
        }
    }

    @liq
    public static final class AdmobInfo implements Parcelable {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String adFormat;
        private final String adUnitId;
        private final Double placementId;
        private final ThumbnailBannerAdMobRatio ratio;
        private final AdmobRequestOptions requestOptions;
        private final double retryCount;
        private final double timeoutMillis;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<AdmobInfo> CREATOR = new onExtraCallback();
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.model.NativeAdsDto$AdmobInfo$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                KSerializer kSerializerOnExtraCallback;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 95;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    kSerializerOnExtraCallback = NativeAdsDto.AdmobInfo.onExtraCallback();
                    int i3 = 86 / 0;
                } else {
                    kSerializerOnExtraCallback = NativeAdsDto.AdmobInfo.onExtraCallback();
                }
                int i4 = onNavigationEvent + 47;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 30 / 0;
                }
                return kSerializerOnExtraCallback;
            }
        }), null};

        public static final class onExtraCallback implements Parcelable.Creator<AdmobInfo> {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[PHI: r1
              0x0030: PHI (r1v10 java.lang.String) = (r1v4 java.lang.String), (r1v11 java.lang.String) binds: [B:8:0x002b, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r1
              0x002d: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v11 java.lang.String) binds: [B:8:0x002b, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final AdmobInfo IAuthTabCallback(Parcel parcel) {
                String string;
                String str;
                Double dValueOf;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 105;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                if (i3 == 0) {
                    string = parcel.readString();
                    int i4 = 28 / 0;
                    if (parcel.readInt() == 0) {
                        str = string;
                        dValueOf = null;
                    } else {
                        str = string;
                        dValueOf = Double.valueOf(parcel.readDouble());
                    }
                } else {
                    string = parcel.readString();
                    if (parcel.readInt() == 0) {
                    }
                }
                AdmobInfo admobInfo = new AdmobInfo(str, dValueOf, parcel.readString(), parcel.readDouble(), parcel.readDouble(), ThumbnailBannerAdMobRatio.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : AdmobRequestOptions.CREATOR.createFromParcel(parcel));
                int i5 = onNavigationEvent + 23;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return admobInfo;
                }
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ AdmobInfo createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 115;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AdmobInfo admobInfoIAuthTabCallback = IAuthTabCallback(parcel);
                int i4 = IAuthTabCallback + 69;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return admobInfoIAuthTabCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ AdmobInfo[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 111;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                AdmobInfo[] admobInfoArrOnExtraCallback = onExtraCallback(i);
                if (i4 != 0) {
                    int i5 = 13 / 0;
                }
                int i6 = onNavigationEvent + 123;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    return admobInfoArrOnExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final AdmobInfo[] onExtraCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent;
                int i4 = i3 + 19;
                IAuthTabCallback = i4 % 128;
                AdmobInfo[] admobInfoArr = new AdmobInfo[i];
                if (i4 % 2 == 0) {
                    throw null;
                }
                int i5 = i3 + 105;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return admobInfoArr;
            }
        }

        public AdmobInfo() {
            this((String) null, (Double) null, (String) null, 0.0d, 0.0d, (ThumbnailBannerAdMobRatio) null, (AdmobRequestOptions) null, 127, (DefaultConstructorMarker) null);
        }

        private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<ThumbnailBannerAdMobRatio> kSerializerSerializer = ThumbnailBannerAdMobRatio.Companion.serializer();
            int i4 = onNavigationEvent + 123;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerSerializer;
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
            int i4 = onWarmupCompleted + 45;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerIAuthTabCallbackStub;
        }

        public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
            int i7 = ~i4;
            int i8 = ~i6;
            int i9 = ~((~i5) | i8);
            int i10 = i5 | i8;
            int i11 = i6 + i4 + i + ((-189913888) * i2) + ((-1809372279) * i3);
            int i12 = i11 * i11;
            int i13 = (((-554582804) * i6) - 1671495680) + (10634006 * i4) + (i7 * 282608405) + (282608405 * i9) + ((-282608405) * i10) + ((-271974400) * i) + (952107008 * i2) + (1092222976 * i3) + ((-70844416) * i12);
            int i14 = (i6 * 986545540) + 223666697 + (i4 * 986543778) + (i7 * (-881)) + (i9 * (-881)) + (i10 * 881) + (i * 986544659) + (i2 * 1843362976) + (i3 * (-1872984789)) + (i12 * (-2050686976));
            if (i13 + (i14 * i14 * 1179713536) != 1) {
                return IAuthTabCallback(objArr);
            }
            int i15 = 2 % 2;
            int i16 = onNavigationEvent + 3;
            onWarmupCompleted = i16 % 128;
            return Integer.valueOf(i16 % 2 == 0 ? 0 : 1);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdmobInfo)) {
                return false;
            }
            AdmobInfo admobInfo = (AdmobInfo) obj;
            if (!Intrinsics.areEqual(this.adUnitId, admobInfo.adUnitId)) {
                int i3 = onWarmupCompleted + 31;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.placementId, admobInfo.placementId)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.adFormat, admobInfo.adFormat)) {
                int i5 = onNavigationEvent + 7;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Double.compare(this.retryCount, admobInfo.retryCount) != 0) {
                return false;
            }
            if (Double.compare(this.timeoutMillis, admobInfo.timeoutMillis) != 0) {
                int i7 = onNavigationEvent + 7;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (this.ratio == admobInfo.ratio) {
                return !(Intrinsics.areEqual(this.requestOptions, admobInfo.requestOptions) ^ true);
            }
            int i9 = onWarmupCompleted + 47;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.adUnitId.hashCode();
            Double d = this.placementId;
            int iHashCode3 = 0;
            if (d == null) {
                int i2 = onWarmupCompleted + 19;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 5 % 4;
                }
                iHashCode = 0;
            } else {
                iHashCode = d.hashCode();
            }
            int iHashCode4 = this.adFormat.hashCode();
            int iHashCode5 = Double.hashCode(this.retryCount);
            int iHashCode6 = Double.hashCode(this.timeoutMillis);
            int iHashCode7 = this.ratio.hashCode();
            AdmobRequestOptions admobRequestOptions = this.requestOptions;
            if (admobRequestOptions != null) {
                int i4 = onNavigationEvent + 81;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                iHashCode3 = admobRequestOptions.hashCode();
            }
            int i6 = (((((((((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode3;
            int i7 = onWarmupCompleted + 49;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "AdmobInfo(adUnitId=" + this.adUnitId + ", placementId=" + this.placementId + ", adFormat=" + this.adFormat + ", retryCount=" + this.retryCount + ", timeoutMillis=" + this.timeoutMillis + ", ratio=" + this.ratio + ", requestOptions=" + this.requestOptions + ")";
            int i2 = onNavigationEvent + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.adUnitId);
            Double d = this.placementId;
            if (d == null) {
                int i3 = onNavigationEvent + 125;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                parcel.writeInt(0);
                int i5 = onNavigationEvent + 61;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 % 4;
                }
            } else {
                parcel.writeInt(1);
                parcel.writeDouble(d.doubleValue());
            }
            parcel.writeString(this.adFormat);
            parcel.writeDouble(this.retryCount);
            parcel.writeDouble(this.timeoutMillis);
            parcel.writeString(this.ratio.name());
            AdmobRequestOptions admobRequestOptions = this.requestOptions;
            if (admobRequestOptions == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            admobRequestOptions.writeToParcel(parcel, i);
            int i7 = onWarmupCompleted + 71;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AdmobInfo> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 47;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    NativeAdsDto$AdmobInfo$$serializer nativeAdsDto$AdmobInfo$$serializer = NativeAdsDto$AdmobInfo$$serializer.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                NativeAdsDto$AdmobInfo$$serializer nativeAdsDto$AdmobInfo$$serializer2 = NativeAdsDto$AdmobInfo$$serializer.INSTANCE;
                int i3 = onExtraCallback + 49;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return nativeAdsDto$AdmobInfo$$serializer2;
            }
        }

        static {
            int i = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public /* synthetic */ AdmobInfo(int i, String str, Double d, String str2, double d2, double d3, ThumbnailBannerAdMobRatio thumbnailBannerAdMobRatio, AdmobRequestOptions admobRequestOptions, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.adUnitId = "";
            } else {
                this.adUnitId = str;
            }
            if ((i & 2) == 0) {
                int i2 = onNavigationEvent + 45;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                this.placementId = null;
            } else {
                this.placementId = d;
            }
            if ((i & 4) == 0) {
                this.adFormat = "";
            } else {
                this.adFormat = str2;
            }
            if ((i & 8) == 0) {
                int i4 = onWarmupCompleted + 25;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                this.retryCount = 0.0d;
            } else {
                this.retryCount = d2;
            }
            int i6 = 2 % 2;
            if ((i & 16) == 0) {
                this.timeoutMillis = 0.0d;
            } else {
                this.timeoutMillis = d3;
                int i7 = onWarmupCompleted + 63;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            }
            if ((i & 32) == 0) {
                int i10 = onWarmupCompleted + 7;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 != 0) {
                    this.ratio = ThumbnailBannerAdMobRatio.UNKNOWN;
                } else {
                    this.ratio = ThumbnailBannerAdMobRatio.UNKNOWN;
                    throw null;
                }
            } else {
                this.ratio = thumbnailBannerAdMobRatio;
            }
            if ((i & 64) == 0) {
                this.requestOptions = null;
            } else {
                this.requestOptions = admobRequestOptions;
            }
        }

        public AdmobInfo(@NotNull String str, @Nullable Double d, @NotNull String str2, double d2, double d3, @NotNull ThumbnailBannerAdMobRatio thumbnailBannerAdMobRatio, @Nullable AdmobRequestOptions admobRequestOptions) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(thumbnailBannerAdMobRatio, "");
            this.adUnitId = str;
            this.placementId = d;
            this.adFormat = str2;
            this.retryCount = d2;
            this.timeoutMillis = d3;
            this.ratio = thumbnailBannerAdMobRatio;
            this.requestOptions = admobRequestOptions;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[PHI: r1
          0x002a: PHI (r1v13 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v14 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x0020, B:10:0x0028, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r1
          0x0022: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v14 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallback(AdmobInfo admobInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
            Lazy<KSerializer<Object>>[] lazyArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                lazyArr = $childSerializers;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                    if (!Intrinsics.areEqual(admobInfo.adUnitId, "")) {
                        vylVar.onExtraCallback(serialDescriptor, 0, admobInfo.adUnitId);
                    }
                }
            } else {
                lazyArr = $childSerializers;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || admobInfo.placementId != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, setVideoListener.onWarmupCompleted, admobInfo.placementId);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(admobInfo.adFormat, "")) {
                vylVar.onExtraCallback(serialDescriptor, 2, admobInfo.adFormat);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                int i3 = onNavigationEvent + 81;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (Double.compare(admobInfo.retryCount, 0.0d) != 0) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 3, admobInfo.retryCount);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 4) || Double.compare(admobInfo.timeoutMillis, 0.0d) != 0) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, admobInfo.timeoutMillis);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 5) || admobInfo.ratio != ThumbnailBannerAdMobRatio.UNKNOWN) {
                vylVar.onNavigationEvent(serialDescriptor, 5, (py) lazyArr[5].getValue(), admobInfo.ratio);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 6) || admobInfo.requestOptions != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 6, AdmobRequestOptions.onExtraCallback.onWarmupCompleted, admobInfo.requestOptions);
            }
        }

        public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i3 + 67;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return lazyArr;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ AdmobInfo(String str, Double d, String str2, double d2, double d3, ThumbnailBannerAdMobRatio thumbnailBannerAdMobRatio, AdmobRequestOptions admobRequestOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str3;
            double d4;
            if ((i & 1) != 0) {
                int i2 = 2 % 2;
                str3 = "";
            } else {
                str3 = str;
            }
            AdmobRequestOptions admobRequestOptions2 = null;
            Double d5 = (i & 2) != 0 ? null : d;
            String str4 = (i & 4) == 0 ? str2 : "";
            double d6 = 1.0d;
            if ((i & 8) != 0) {
                int i3 = onWarmupCompleted + 9;
                onNavigationEvent = i3 % 128;
                d4 = i3 % 2 == 0 ? 1.0d : 0.0d;
            } else {
                d4 = d2;
            }
            if ((i & 16) != 0) {
                int i4 = onNavigationEvent + 55;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    d6 = 0.0d;
                }
            } else {
                d6 = d3;
            }
            ThumbnailBannerAdMobRatio thumbnailBannerAdMobRatio2 = (i & 32) != 0 ? ThumbnailBannerAdMobRatio.UNKNOWN : thumbnailBannerAdMobRatio;
            if ((i & 64) != 0) {
                int i5 = onWarmupCompleted + 67;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            } else {
                admobRequestOptions2 = admobRequestOptions;
            }
            this(str3, d5, str4, d4, d6, thumbnailBannerAdMobRatio2, admobRequestOptions2);
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 111;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.adUnitId;
            int i5 = i2 + 15;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 78 / 0;
            }
            return str;
        }

        public final Double onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Double d = this.placementId;
            int i5 = i3 + 15;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return d;
        }

        public final double asBinder() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            double d = this.retryCount;
            if (i4 == 0) {
                int i5 = 39 / 0;
            }
            int i6 = i3 + 7;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return d;
            }
            throw null;
        }

        public final double asInterface() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 125;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            double d = this.timeoutMillis;
            int i4 = i2 + 61;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return d;
        }

        public final ThumbnailBannerAdMobRatio onTransact() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return this.ratio;
            }
            throw null;
        }

        public final AdmobRequestOptions IAuthTabCallbackDefault() {
            AdmobRequestOptions admobRequestOptions;
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 117;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                admobRequestOptions = this.requestOptions;
                int i4 = 61 / 0;
            } else {
                admobRequestOptions = this.requestOptions;
            }
            int i5 = i2 + 25;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 14 / 0;
            }
            return admobRequestOptions;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            AdmobInfo admobInfo = (AdmobInfo) objArr[0];
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AdmobAdFormat admobAdFormatIAuthTabCallback = AdmobAdFormat.Companion.IAuthTabCallback(admobInfo.adFormat);
            int i4 = onWarmupCompleted + 13;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 26 / 0;
            }
            return admobAdFormatIAuthTabCallback;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            return ((Integer) onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1959583260, new Object[]{this}, iOnExtraCallbackWithResult, -1959583259)).intValue();
        }

        public final AdmobAdFormat IAuthTabCallback() {
            int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            return (AdmobAdFormat) onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1779197038, new Object[]{this}, iOnExtraCallbackWithResult, -1779197038);
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $10 + 9;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 5 / 3;
        }
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $11 + 121;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 25, TextUtils.indexOf("", "", 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() / (onExtraCallbackWithResult % 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 59 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 6382 - ExpandableListView.getPackedPositionChild(0L), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), AndroidCharacter.getMirror('0') - 24, (Process.myTid() >> 22) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 59 - TextUtils.indexOf("", "", 0), 6383 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 59 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 6382 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    @liq(onNavigationEvent = onExtraCallback.class)
    public static final class AdmobRequestOptions implements Parcelable {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final Map<String, List<String>> customTargeting;
        private final Long floorUsdCents;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<AdmobRequestOptions> CREATOR = new onNavigationEvent();

        public static final class onNavigationEvent implements Parcelable.Creator<AdmobRequestOptions> {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ AdmobRequestOptions createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 51;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return onNavigationEvent(parcel);
                }
                onNavigationEvent(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ AdmobRequestOptions[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 99;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                AdmobRequestOptions[] admobRequestOptionsArrOnWarmupCompleted = onWarmupCompleted(i);
                if (i4 != 0) {
                    int i5 = 43 / 0;
                }
                return admobRequestOptionsArrOnWarmupCompleted;
            }

            public final AdmobRequestOptions onNavigationEvent(Parcel parcel) {
                Long lValueOf;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
                int i3 = onNavigationEvent + 27;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                for (int i5 = 0; i5 != i2; i5++) {
                    int i6 = onExtraCallbackWithResult + 33;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    linkedHashMap.put(parcel.readString(), parcel.createStringArrayList());
                }
                if (parcel.readInt() == 0) {
                    int i8 = onExtraCallbackWithResult + 75;
                    onNavigationEvent = i8 % 128;
                    lValueOf = null;
                    if (i8 % 2 != 0) {
                        throw null;
                    }
                } else {
                    lValueOf = Long.valueOf(parcel.readLong());
                }
                return new AdmobRequestOptions(linkedHashMap, lValueOf);
            }

            public final AdmobRequestOptions[] onWarmupCompleted(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 23;
                onExtraCallbackWithResult = i3 % 128;
                AdmobRequestOptions[] admobRequestOptionsArr = new AdmobRequestOptions[i];
                if (i3 % 2 == 0) {
                    int i4 = 36 / 0;
                }
                return admobRequestOptionsArr;
            }
        }

        static {
            int i = onExtraCallback + 55;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AdmobRequestOptions() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 51;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 95;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdmobRequestOptions)) {
                return false;
            }
            AdmobRequestOptions admobRequestOptions = (AdmobRequestOptions) obj;
            if (!Intrinsics.areEqual(this.customTargeting, admobRequestOptions.customTargeting)) {
                int i4 = onExtraCallbackWithResult + 21;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.floorUsdCents, admobRequestOptions.floorUsdCents)) {
                return true;
            }
            int i6 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                this.customTargeting.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode2 = this.customTargeting.hashCode();
            Long l = this.floorUsdCents;
            if (l == null) {
                int i3 = onExtraCallbackWithResult + 115;
                onNavigationEvent = i3 % 128;
                iHashCode = i3 % 2 == 0 ? 1 : 0;
            } else {
                iHashCode = l.hashCode();
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "AdmobRequestOptions(customTargeting=" + this.customTargeting + ", floorUsdCents=" + this.floorUsdCents + ")";
            int i2 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Map<String, List<String>> map = this.customTargeting;
            parcel.writeInt(map.size());
            Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
            while (!(!it.hasNext())) {
                Map.Entry<String, List<String>> next = it.next();
                parcel.writeString(next.getKey());
                parcel.writeStringList(next.getValue());
            }
            Long l = this.floorUsdCents;
            if (l == null) {
                parcel.writeInt(0);
                int i3 = onNavigationEvent + 103;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                return;
            }
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
            int i4 = onExtraCallbackWithResult + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AdmobRequestOptions> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 55;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallback onextracallback = onExtraCallback.onWarmupCompleted;
                int i4 = IAuthTabCallback + 13;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return onextracallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AdmobRequestOptions(@NotNull Map<String, ? extends List<String>> map, @Nullable Long l) {
            Intrinsics.checkNotNullParameter(map, "");
            this.customTargeting = map;
            this.floorUsdCents = l;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ AdmobRequestOptions(Map map, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent + 77;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                map = access8100.onNavigationEvent();
                int i4 = 2 % 2;
            }
            if ((i & 2) != 0) {
                int i5 = onNavigationEvent + 21;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 34 / 0;
                }
                int i7 = 2 % 2;
                l = null;
            }
            this(map, l);
        }

        public final Map<String, List<String>> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            Map<String, List<String>> map = this.customTargeting;
            int i5 = i3 + 39;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 83 / 0;
            }
            return map;
        }

        public final Long IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            Long l = this.floorUsdCents;
            int i4 = i3 + 45;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return l;
        }

        public static final class onExtraCallback implements KSerializer<AdmobRequestOptions> {
            private static int IAuthTabCallbackDefault = 1;
            private static int IAuthTabCallbackStub = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            public static final onExtraCallback onWarmupCompleted = new onExtraCallback();
            private static final SerialDescriptor IAuthTabCallback = ujb.IAuthTabCallback("AdmobRequestOptions", new SerialDescriptor[0], new Function1() { // from class: im.toss.ads_sdk.model.NativeAdsDto$AdmobRequestOptions$Serializer$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 79;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Unit unitOnWarmupCompleted = NativeAdsDto.AdmobRequestOptions.onExtraCallback.onWarmupCompleted((qt) obj);
                    if (i3 == 0) {
                        int i4 = 25 / 0;
                    }
                    int i5 = onExtraCallbackWithResult + 97;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return unitOnWarmupCompleted;
                }
            });
            public static final int onExtraCallback = 8;

            public static /* synthetic */ Unit onWarmupCompleted(qt qtVar) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 61;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return IAuthTabCallback(qtVar);
                }
                IAuthTabCallback(qtVar);
                throw null;
            }

            private onExtraCallback() {
            }

            public /* synthetic */ Object deserialize(Decoder decoder) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 7;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    onExtraCallbackWithResult(decoder);
                    throw null;
                }
                AdmobRequestOptions admobRequestOptionsOnExtraCallbackWithResult = onExtraCallbackWithResult(decoder);
                int i3 = onExtraCallbackWithResult + 107;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return admobRequestOptionsOnExtraCallbackWithResult;
            }

            public /* synthetic */ void serialize(Encoder encoder, Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 67;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onNavigationEvent(encoder, (AdmobRequestOptions) obj);
                int i4 = onExtraCallbackWithResult + 109;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }

            static {
                int i = IAuthTabCallbackStub + 29;
                IAuthTabCallbackDefault = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public SerialDescriptor getDescriptor() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 35;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                SerialDescriptor serialDescriptor = IAuthTabCallback;
                int i4 = i3 + 53;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return serialDescriptor;
            }

            private static final Unit IAuthTabCallback(qt qtVar) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 81;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(qtVar, "");
                qtVar.onExtraCallback("customTargeting", JsonElement.Companion.serializer().getDescriptor(), CollectionsKt.emptyList(), true);
                qtVar.onExtraCallback("floorUsdCents", oty1.onExtraCallback.getDescriptor(), CollectionsKt.emptyList(), true);
                Unit unit = Unit.INSTANCE;
                int i4 = onNavigationEvent + 85;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 25 / 0;
                }
                return unit;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00c7  */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v7, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public AdmobRequestOptions onExtraCallbackWithResult(@NotNull Decoder decoder) {
                setAnimationType setanimationtype;
                ?? OnNavigationEvent;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(decoder, "");
                JsonObject jsonObject = null;
                if (decoder instanceof setAnimationType) {
                    int i2 = onNavigationEvent + 115;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    setanimationtype = (setAnimationType) decoder;
                } else {
                    int i4 = onExtraCallbackWithResult + 49;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    setanimationtype = null;
                }
                if (setanimationtype == null) {
                    throw new IllegalStateException("AdmobRequestOptions.Serializer only supports Json");
                }
                JsonObject jsonObjectOnExtraCallbackWithResult = initRenderFinish.onExtraCallbackWithResult(setanimationtype.onWarmupCompleted());
                JsonObject jsonObject2 = (JsonElement) jsonObjectOnExtraCallbackWithResult.get("customTargeting");
                if (jsonObject2 == null) {
                    OnNavigationEvent = access8100.onNavigationEvent();
                } else {
                    if (jsonObject2 instanceof JsonObject) {
                        int i6 = onExtraCallbackWithResult + 45;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 == 0) {
                            jsonObject = jsonObject2;
                            int i7 = 9 / 0;
                        } else {
                            jsonObject = jsonObject2;
                        }
                    }
                    if (jsonObject != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(jsonObject.size()));
                        for (Map.Entry entry : jsonObject.entrySet()) {
                            linkedHashMap.put(entry.getKey(), onWarmupCompleted.onWarmupCompleted((JsonElement) entry.getValue()));
                        }
                        OnNavigationEvent = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            int i8 = onNavigationEvent + 65;
                            onExtraCallbackWithResult = i8 % 128;
                            int i9 = i8 % 2;
                            if (!((List) entry2.getValue()).isEmpty()) {
                                OnNavigationEvent.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                    }
                }
                return new AdmobRequestOptions(OnNavigationEvent, onNavigationEvent((JsonElement) jsonObjectOnExtraCallbackWithResult.get("floorUsdCents")));
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onNavigationEvent(@NotNull Encoder encoder, @NotNull AdmobRequestOptions admobRequestOptions) {
                skipVideo skipvideo;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 41;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(encoder, "");
                    Intrinsics.checkNotNullParameter(admobRequestOptions, "");
                    int i3 = 98 / 0;
                    skipvideo = !((encoder instanceof skipVideo) ^ true) ? (skipVideo) encoder : null;
                } else {
                    Intrinsics.checkNotNullParameter(encoder, "");
                    Intrinsics.checkNotNullParameter(admobRequestOptions, "");
                    if (encoder instanceof skipVideo) {
                    }
                }
                if (skipvideo == null) {
                    throw new IllegalStateException("AdmobRequestOptions.Serializer only supports Json");
                }
                int i4 = onNavigationEvent + 117;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    access8100.onExtraCallback();
                    admobRequestOptions.onExtraCallback().isEmpty();
                    throw null;
                }
                Map mapOnExtraCallback = access8100.onExtraCallback();
                if (!admobRequestOptions.onExtraCallback().isEmpty()) {
                    Map<String, List<String>> mapOnExtraCallback2 = admobRequestOptions.onExtraCallback();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(mapOnExtraCallback2.size()));
                    Iterator<T> it = mapOnExtraCallback2.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Object key = entry.getKey();
                        List list = (List) entry.getValue();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator it2 = list.iterator();
                        while (!(!it2.hasNext())) {
                            arrayList.add(initRenderFinish.onNavigationEvent((String) it2.next()));
                        }
                        linkedHashMap.put(key, new JsonArray(arrayList));
                    }
                    mapOnExtraCallback.put("customTargeting", new JsonObject(linkedHashMap));
                }
                Long lIAuthTabCallback = admobRequestOptions.IAuthTabCallback();
                if (lIAuthTabCallback != null) {
                    int i5 = onNavigationEvent + 1;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        mapOnExtraCallback.put("floorUsdCents", initRenderFinish.IAuthTabCallback(Long.valueOf(lIAuthTabCallback.longValue())));
                        int i6 = 85 / 0;
                    } else {
                        mapOnExtraCallback.put("floorUsdCents", initRenderFinish.IAuthTabCallback(Long.valueOf(lIAuthTabCallback.longValue())));
                    }
                }
                skipvideo.onExtraCallbackWithResult(new JsonObject(access8100.onExtraCallbackWithResult(mapOnExtraCallback)));
            }

            private final List<String> onWarmupCompleted(JsonElement jsonElement) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 83;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                if (jsonElement instanceof JsonPrimitive) {
                    return CollectionsKt.listOfNotNull(initRenderFinish.onNavigationEvent((JsonPrimitive) jsonElement));
                }
                if (!(jsonElement instanceof JsonArray)) {
                    return CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Iterable) jsonElement).iterator();
                while (!(!it.hasNext())) {
                    JsonPrimitive jsonPrimitive = (JsonElement) it.next();
                    String strOnNavigationEvent = null;
                    JsonPrimitive jsonPrimitive2 = jsonPrimitive instanceof JsonPrimitive ? jsonPrimitive : null;
                    if (jsonPrimitive2 != null) {
                        int i4 = onNavigationEvent + 3;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 != 0) {
                            initRenderFinish.onNavigationEvent(jsonPrimitive2);
                            throw null;
                        }
                        strOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonPrimitive2);
                    }
                    if (strOnNavigationEvent != null) {
                        arrayList.add(strOnNavigationEvent);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private final Long onNavigationEvent(JsonElement jsonElement) {
                JsonPrimitive jsonPrimitive;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 41;
                onNavigationEvent = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    int i4 = 6 / 0;
                    jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
                } else if (!(!(jsonElement instanceof JsonPrimitive))) {
                }
                if (jsonPrimitive == null) {
                    int i5 = i2 + 55;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return null;
                }
                Long lAccess000 = initRenderFinish.access000(jsonPrimitive);
                if (lAccess000 != null) {
                    return lAccess000;
                }
                Double dOnWarmupCompleted = initRenderFinish.onWarmupCompleted(jsonPrimitive);
                if (dOnWarmupCompleted == null) {
                    return null;
                }
                int i7 = onNavigationEvent + 69;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    Long.valueOf((long) dOnWarmupCompleted.doubleValue());
                    obj.hashCode();
                    throw null;
                }
                return Long.valueOf((long) dOnWarmupCompleted.doubleValue());
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @liq
    public static final class ThumbnailBannerAdMobRatio {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ThumbnailBannerAdMobRatio[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
        public static final ThumbnailBannerAdMobRatio ANY;
        public static final Companion Companion;
        private static int IAuthTabCallbackStub;
        public static final ThumbnailBannerAdMobRatio LANDSCAPE;
        public static final ThumbnailBannerAdMobRatio PORTRAIT;
        public static final ThumbnailBannerAdMobRatio SQUARE;
        public static final ThumbnailBannerAdMobRatio UNKNOWN;
        private static char onExtraCallback;
        private static int onNavigationEvent;
        private static long onWarmupCompleted;
        private static final byte[] $$a = {44, 39, 61, 29};
        private static final int $$b = 139;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asBinder = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        private static String $$c(short s, int i, byte b) {
            int i2 = 4 - (b * 2);
            int i3 = i + 109;
            int i4 = s * 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[1 - i4];
            int i5 = 0 - i4;
            int i6 = -1;
            if (bArr == null) {
                i2++;
                i3 = i2 + i5;
            }
            while (true) {
                int i7 = i2;
                int i8 = i3;
                i6++;
                bArr2[i6] = (byte) i8;
                if (i6 == i5) {
                    return new String(bArr2, 0);
                }
                i2 = i7 + 1;
                i3 = i8 + bArr[i7];
            }
        }

        public static /* synthetic */ KSerializer $r8$lambda$4mZ6O2gjiAassweEIcY0Enq0YmQ() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return _init_$_anonymous_();
            }
            _init_$_anonymous_();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ ThumbnailBannerAdMobRatio[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            ThumbnailBannerAdMobRatio[] thumbnailBannerAdMobRatioArr = {UNKNOWN, ANY, LANDSCAPE, PORTRAIT, SQUARE};
            int i5 = i3 + 43;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return thumbnailBannerAdMobRatioArr;
        }

        public static EnumEntries<ThumbnailBannerAdMobRatio> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<ThumbnailBannerAdMobRatio> enumEntries = $ENTRIES;
            int i5 = i3 + 53;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static ThumbnailBannerAdMobRatio valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ThumbnailBannerAdMobRatio thumbnailBannerAdMobRatio = (ThumbnailBannerAdMobRatio) Enum.valueOf(ThumbnailBannerAdMobRatio.class, str);
            if (i3 != 0) {
                int i4 = 78 / 0;
            }
            int i5 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 92 / 0;
            }
            return thumbnailBannerAdMobRatio;
        }

        public static ThumbnailBannerAdMobRatio[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ThumbnailBannerAdMobRatio[] thumbnailBannerAdMobRatioArr = $VALUES;
            if (i3 != 0) {
                return (ThumbnailBannerAdMobRatio[]) thumbnailBannerAdMobRatioArr.clone();
            }
            throw null;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
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
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 42 - MotionEvent.axisFromString(""), (-16775765) - Color.rgb(0, 0, 0), 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 49123), Color.green(0) + 44, 1494 - ((Process.getThreadPriority(0) + 20) >> 6), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 50 - View.MeasureSpec.getSize(0), 22938 - ImageFormat.getBitsPerPixel(0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 29 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    int i3 = $10 + 63;
                    $11 = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 3 % 5;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArr6);
            int i5 = $11 + 95;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            objArr[0] = str;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            private final /* synthetic */ KSerializer onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 121;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer = (KSerializer) ThumbnailBannerAdMobRatio.access$get$cachedSerializer$delegate$cp().getValue();
                int i4 = onExtraCallbackWithResult + 125;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final KSerializer<ThumbnailBannerAdMobRatio> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 115;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                KSerializer<ThumbnailBannerAdMobRatio> kSerializerOnWarmupCompleted = onWarmupCompleted();
                int i4 = onExtraCallbackWithResult + 77;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnWarmupCompleted;
                }
                throw null;
            }
        }

        private ThumbnailBannerAdMobRatio(String str, int i) {
        }

        private static final /* synthetic */ KSerializer _init_$_anonymous_() {
            KSerializer kSerializerOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.ads_sdk.model.NativeAdsDto.ThumbnailBannerAdMobRatio", values());
                int i3 = 26 / 0;
            } else {
                kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.ads_sdk.model.NativeAdsDto.ThumbnailBannerAdMobRatio", values());
            }
            int i4 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }

        public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
            Lazy<KSerializer<Object>> lazy;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 39;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                lazy = $cachedSerializer$delegate;
                int i4 = 41 / 0;
            } else {
                lazy = $cachedSerializer$delegate;
            }
            int i5 = i2 + 99;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 9 / 0;
            }
            return lazy;
        }

        static {
            IAuthTabCallbackStub = 0;
            IAuthTabCallback();
            Object[] objArr = new Object[1];
            a((char) Drawable.resolveOpacity(0, 0), 606558673 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{14095, 55175, 24165, 47222, 44210, 26919, 324}, new char[]{0, 0, 0, 0}, new char[]{53524, 10073, 59428, 20811}, objArr);
            UNKNOWN = new ThumbnailBannerAdMobRatio(((String) objArr[0]).intern(), 0);
            ANY = new ThumbnailBannerAdMobRatio("ANY", 1);
            LANDSCAPE = new ThumbnailBannerAdMobRatio("LANDSCAPE", 2);
            PORTRAIT = new ThumbnailBannerAdMobRatio("PORTRAIT", 3);
            SQUARE = new ThumbnailBannerAdMobRatio("SQUARE", 4);
            ThumbnailBannerAdMobRatio[] thumbnailBannerAdMobRatioArr$values = $values();
            $VALUES = thumbnailBannerAdMobRatioArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(thumbnailBannerAdMobRatioArr$values);
            Companion = new Companion(null);
            $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.model.NativeAdsDto$ThumbnailBannerAdMobRatio$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 73;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializer$r8$lambda$4mZ6O2gjiAassweEIcY0Enq0YmQ = NativeAdsDto.ThumbnailBannerAdMobRatio.$r8$lambda$4mZ6O2gjiAassweEIcY0Enq0YmQ();
                    int i4 = onExtraCallbackWithResult + 105;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializer$r8$lambda$4mZ6O2gjiAassweEIcY0Enq0YmQ;
                }
            });
            int i = asBinder + 17;
            IAuthTabCallbackStub = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        static void IAuthTabCallback() {
            onWarmupCompleted = 7798559133331975163L;
            onNavigationEvent = -1776194565;
            onExtraCallback = (char) 45291;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @liq
    public static final class ThumbnailBannerContentType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ThumbnailBannerContentType[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Companion Companion;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final ThumbnailBannerContentType VIDEO = new ThumbnailBannerContentType("VIDEO", 0);
        public static final ThumbnailBannerContentType IMAGE = new ThumbnailBannerContentType("IMAGE", 1);

        public static /* synthetic */ KSerializer $r8$lambda$zvwgb6z0M2rlkOLUn_HSGeulZQY() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
            if (i3 == 0) {
                int i4 = 35 / 0;
            }
            return kSerializer_init_$_anonymous_;
        }

        private static final /* synthetic */ ThumbnailBannerContentType[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            ThumbnailBannerContentType[] thumbnailBannerContentTypeArr = {VIDEO, IMAGE};
            int i5 = i3 + 19;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return thumbnailBannerContentTypeArr;
        }

        public static EnumEntries<ThumbnailBannerContentType> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 19;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<ThumbnailBannerContentType> enumEntries = $ENTRIES;
            int i5 = i2 + 29;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            throw null;
        }

        public static ThumbnailBannerContentType valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ThumbnailBannerContentType thumbnailBannerContentType = (ThumbnailBannerContentType) Enum.valueOf(ThumbnailBannerContentType.class, str);
            if (i3 == 0) {
                throw null;
            }
            int i4 = IAuthTabCallback + 41;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 85 / 0;
            }
            return thumbnailBannerContentType;
        }

        public static ThumbnailBannerContentType[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ThumbnailBannerContentType[] thumbnailBannerContentTypeArr = (ThumbnailBannerContentType[]) $VALUES.clone();
            int i4 = IAuthTabCallback + 113;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return thumbnailBannerContentTypeArr;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            private final /* synthetic */ KSerializer IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 107;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer = (KSerializer) ThumbnailBannerContentType.access$get$cachedSerializer$delegate$cp().getValue();
                int i4 = onExtraCallbackWithResult + 111;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return kSerializer;
            }

            public final KSerializer<ThumbnailBannerContentType> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 121;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                KSerializer<ThumbnailBannerContentType> kSerializerIAuthTabCallback = IAuthTabCallback();
                int i4 = onNavigationEvent + 5;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerIAuthTabCallback;
            }
        }

        private ThumbnailBannerContentType(String str, int i) {
        }

        private static final /* synthetic */ KSerializer _init_$_anonymous_() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.ads_sdk.model.NativeAdsDto.ThumbnailBannerContentType", values());
            }
            int i3 = 42 / 0;
            return updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.ads_sdk.model.NativeAdsDto.ThumbnailBannerContentType", values());
        }

        public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 65;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
            int i5 = i2 + 23;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return lazy;
            }
            throw null;
        }

        static {
            ThumbnailBannerContentType[] thumbnailBannerContentTypeArr$values = $values();
            $VALUES = thumbnailBannerContentTypeArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(thumbnailBannerContentTypeArr$values);
            Companion = new Companion(null);
            $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.model.NativeAdsDto$ThumbnailBannerContentType$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 97;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        NativeAdsDto.ThumbnailBannerContentType.$r8$lambda$zvwgb6z0M2rlkOLUn_HSGeulZQY();
                        throw null;
                    }
                    KSerializer kSerializer$r8$lambda$zvwgb6z0M2rlkOLUn_HSGeulZQY = NativeAdsDto.ThumbnailBannerContentType.$r8$lambda$zvwgb6z0M2rlkOLUn_HSGeulZQY();
                    int i3 = onExtraCallbackWithResult + 59;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 == 0) {
                        return kSerializer$r8$lambda$zvwgb6z0M2rlkOLUn_HSGeulZQY;
                    }
                    throw null;
                }
            });
            int i = onNavigationEvent + 15;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }

    @liq
    public static final class Reward implements Parcelable {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final double amount;
        private final String type;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Reward> CREATOR = new IAuthTabCallback();

        public static final class IAuthTabCallback implements Parcelable.Creator<Reward> {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Reward createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 107;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    onExtraCallback(parcel);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Reward rewardOnExtraCallback = onExtraCallback(parcel);
                int i3 = onNavigationEvent + 113;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 13 / 0;
                }
                return rewardOnExtraCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Reward[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 13;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Reward[] rewardArrOnNavigationEvent = onNavigationEvent(i);
                int i5 = onNavigationEvent + 27;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return rewardArrOnNavigationEvent;
            }

            public final Reward onExtraCallback(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                Reward reward = new Reward(parcel.readString(), parcel.readDouble());
                int i2 = onNavigationEvent + 77;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 18 / 0;
                }
                return reward;
            }

            public final Reward[] onNavigationEvent(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 63;
                onNavigationEvent = i3 % 128;
                Reward[] rewardArr = new Reward[i];
                if (i3 % 2 != 0) {
                    return rewardArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i = IAuthTabCallback + 61;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public Reward() {
            this((String) null, 0.0d, 3, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 49;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 85;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 77;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 67;
                onExtraCallback = i5 % 128;
                return i5 % 2 != 0;
            }
            if (!(obj instanceof Reward)) {
                return false;
            }
            Reward reward = (Reward) obj;
            if (!Intrinsics.areEqual(this.type, reward.type)) {
                int i6 = onExtraCallback + 73;
                onNavigationEvent = i6 % 128;
                return i6 % 2 != 0;
            }
            if (Double.compare(this.amount, reward.amount) != 0) {
                int i7 = onExtraCallback + 75;
                onNavigationEvent = i7 % 128;
                return i7 % 2 != 0;
            }
            int i8 = onNavigationEvent + 29;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.type.hashCode() * 31) + Double.hashCode(this.amount);
            int i4 = onNavigationEvent + 93;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Reward(type=" + this.type + ", amount=" + this.amount + ")";
            int i2 = onNavigationEvent + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 27;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.type);
            parcel.writeDouble(this.amount);
            int i5 = onExtraCallback + 93;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Reward> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 105;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                NativeAdsDto$Reward$$serializer nativeAdsDto$Reward$$serializer = NativeAdsDto$Reward$$serializer.INSTANCE;
                int i4 = onWarmupCompleted + 43;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return nativeAdsDto$Reward$$serializer;
                }
                throw null;
            }
        }

        public /* synthetic */ Reward(int i, String str, double d, okycx okycxVar) {
            this.type = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.amount = 0.0d;
                int i2 = onNavigationEvent + 79;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            this.amount = d;
            int i4 = onNavigationEvent + 43;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Reward(@NotNull String str, double d) {
            Intrinsics.checkNotNullParameter(str, "");
            this.type = str;
            this.amount = d;
        }

        @JvmStatic
        public static final /* synthetic */ void onNavigationEvent(Reward reward, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(reward.type, "")) {
                vylVar.onExtraCallback(serialDescriptor, 0, reward.type);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i4 = onExtraCallback + 105;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                double d = reward.amount;
                if (i5 != 0) {
                    if (Double.compare(d, 0.0d) == 0) {
                        return;
                    }
                } else if (Double.compare(d, 0.0d) == 0) {
                    return;
                }
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, reward.amount);
            int i6 = onExtraCallback + 19;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 % 5;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Reward(String str, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent + 73;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                str = "";
                int i4 = 2 % 2;
            }
            if ((i & 2) != 0) {
                int i5 = onNavigationEvent + 109;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                d = 0.0d;
            }
            this(str, d);
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.type;
            }
            throw null;
        }

        public final double onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            double d = this.amount;
            int i5 = i3 + 93;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return d;
        }
    }

    @liq
    public static abstract class Creative implements Parcelable {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.model.NativeAdsDto$Creative$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 39;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = NativeAdsDto.Creative.onExtraCallback();
                int i4 = onExtraCallback + 93;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        });

        public /* synthetic */ Creative(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onTransact();
            }
            onTransact();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public abstract String IAuthTabCallback();

        public abstract String IAuthTabCallbackStub();

        public abstract String asInterface();

        public abstract String onWarmupCompleted();

        public static final class Companion {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            private final /* synthetic */ KSerializer onExtraCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 47;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer = (KSerializer) Creative.onExtraCallbackWithResult().getValue();
                int i4 = onNavigationEvent + 83;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 85 / 0;
                }
                return kSerializer;
            }

            public final KSerializer<Creative> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 111;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer<Creative> kSerializerOnExtraCallback = onExtraCallback();
                int i4 = onExtraCallbackWithResult + 51;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        }

        static {
            int i = onExtraCallback + 125;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        private Creative() {
        }

        public /* synthetic */ Creative(int i, okycx okycxVar) {
        }

        public static final /* synthetic */ Lazy onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return $cachedSerializer$delegate;
            }
            throw null;
        }

        private static final /* synthetic */ KSerializer onTransact() {
            int i = 2 % 2;
            kt ktVar = new kt("im.toss.ads_sdk.model.NativeAdsDto.Creative", Reflection.getOrCreateKotlinClass(Creative.class), new KClass[]{Reflection.getOrCreateKotlinClass(Feed.class), Reflection.getOrCreateKotlinClass(FeedVideo.class), Reflection.getOrCreateKotlinClass(FullBanner.class), Reflection.getOrCreateKotlinClass(FullPage.class), Reflection.getOrCreateKotlinClass(None.class), Reflection.getOrCreateKotlinClass(Normal.class), Reflection.getOrCreateKotlinClass(PlayableAd.class), Reflection.getOrCreateKotlinClass(RightBanner.class), Reflection.getOrCreateKotlinClass(ShortFormVideo.class), Reflection.getOrCreateKotlinClass(ThumbnailBanner.class), Reflection.getOrCreateKotlinClass(ThumbnailVideo.class), Reflection.getOrCreateKotlinClass(TossstreamLongFormVideo.class), Reflection.getOrCreateKotlinClass(TossstreamShortFormVideo.class)}, new KSerializer[]{NativeAdsDto$Creative$Feed$$serializer.INSTANCE, NativeAdsDto$Creative$FeedVideo$$serializer.INSTANCE, NativeAdsDto$Creative$FullBanner$$serializer.INSTANCE, NativeAdsDto$Creative$FullPage$$serializer.INSTANCE, NativeAdsDto$Creative$None$$serializer.INSTANCE, NativeAdsDto$Creative$Normal$$serializer.INSTANCE, NativeAdsDto$Creative$PlayableAd$$serializer.INSTANCE, NativeAdsDto$Creative$RightBanner$$serializer.INSTANCE, NativeAdsDto$Creative$ShortFormVideo$$serializer.INSTANCE, NativeAdsDto$Creative$ThumbnailBanner$$serializer.INSTANCE, NativeAdsDto$Creative$ThumbnailVideo$$serializer.INSTANCE, NativeAdsDto$Creative$TossstreamLongFormVideo$$serializer.INSTANCE, NativeAdsDto$Creative$TossstreamShortFormVideo$$serializer.INSTANCE}, new Annotation[0]);
            int i2 = onWarmupCompleted + 79;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return ktVar;
            }
            throw null;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String strIAuthTabCallback = IAuthTabCallback();
            int i4 = IAuthTabCallback + 65;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return strIAuthTabCallback;
        }

        @nc(IAuthTabCallback = "styleId")
        @liq
        public static final class Normal extends Creative {
            public static final int $stable = 0;
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted = 1;
            private final String adClearanceText;
            private final String id;
            private final String imageUrl;
            private final String landingUrl;
            private final String subTitle;
            private final String title;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Normal> CREATOR = new onNavigationEvent();

            public static final class onNavigationEvent implements Parcelable.Creator<Normal> {
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Normal createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 107;
                    onExtraCallbackWithResult = i2 % 128;
                    Object obj = null;
                    if (i2 % 2 != 0) {
                        onNavigationEvent(parcel);
                        obj.hashCode();
                        throw null;
                    }
                    Normal normalOnNavigationEvent = onNavigationEvent(parcel);
                    int i3 = onNavigationEvent + 5;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        return normalOnNavigationEvent;
                    }
                    throw null;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Normal[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 47;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    Normal[] normalArrOnNavigationEvent = onNavigationEvent(i);
                    int i5 = onNavigationEvent + 113;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return normalArrOnNavigationEvent;
                }

                public final Normal onNavigationEvent(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    Normal normal = new Normal(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    int i2 = onExtraCallbackWithResult + 45;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return normal;
                }

                public final Normal[] onNavigationEvent(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 25;
                    int i4 = i3 % 128;
                    onNavigationEvent = i4;
                    int i5 = i3 % 2;
                    Normal[] normalArr = new Normal[i];
                    int i6 = i4 + 65;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        return normalArr;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            static {
                int i = onExtraCallbackWithResult + 41;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            public Normal() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 43;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onExtraCallback + 63;
                    onWarmupCompleted = i2 % 128;
                    return i2 % 2 != 0;
                }
                if (!(obj instanceof Normal)) {
                    int i3 = onWarmupCompleted + 59;
                    onExtraCallback = i3 % 128;
                    return i3 % 2 != 0;
                }
                Normal normal = (Normal) obj;
                if (!Intrinsics.areEqual(this.id, normal.id)) {
                    int i4 = onExtraCallback + 111;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.imageUrl, normal.imageUrl) || !Intrinsics.areEqual(this.title, normal.title) || !Intrinsics.areEqual(this.subTitle, normal.subTitle)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.landingUrl, normal.landingUrl)) {
                    int i6 = onExtraCallback + 91;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.adClearanceText, normal.adClearanceText)) {
                    return true;
                }
                int i8 = onExtraCallback + 69;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }

            public int hashCode() {
                int i;
                int i2 = 2 % 2;
                int iHashCode = this.id.hashCode();
                int iHashCode2 = this.imageUrl.hashCode();
                int iHashCode3 = this.title.hashCode();
                int iHashCode4 = this.subTitle.hashCode();
                int iHashCode5 = this.landingUrl.hashCode();
                String str = this.adClearanceText;
                if (str == null) {
                    int i3 = onWarmupCompleted + 11;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    i = 0;
                } else {
                    int iHashCode6 = str.hashCode();
                    int i5 = onExtraCallback + 69;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 5 / 4;
                    }
                    i = iHashCode6;
                }
                return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + i;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Normal(id=" + this.id + ", imageUrl=" + this.imageUrl + ", title=" + this.title + ", subTitle=" + this.subTitle + ", landingUrl=" + this.landingUrl + ", adClearanceText=" + this.adClearanceText + ")";
                int i2 = onExtraCallback + 53;
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
                int i3 = onWarmupCompleted + 25;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.id);
                parcel.writeString(this.imageUrl);
                parcel.writeString(this.title);
                parcel.writeString(this.subTitle);
                parcel.writeString(this.landingUrl);
                parcel.writeString(this.adClearanceText);
                int i5 = onExtraCallback + 27;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
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

                public final KSerializer<Normal> serializer() {
                    NativeAdsDto$Creative$Normal$$serializer nativeAdsDto$Creative$Normal$$serializer;
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 31;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        nativeAdsDto$Creative$Normal$$serializer = NativeAdsDto$Creative$Normal$$serializer.INSTANCE;
                        int i3 = 31 / 0;
                    } else {
                        nativeAdsDto$Creative$Normal$$serializer = NativeAdsDto$Creative$Normal$$serializer.INSTANCE;
                    }
                    int i4 = onNavigationEvent + 13;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return nativeAdsDto$Creative$Normal$$serializer;
                }
            }

            public /* synthetic */ Normal(int i, String str, String str2, String str3, String str4, String str5, String str6, okycx okycxVar) {
                super(i, okycxVar);
                if ((i & 1) == 0) {
                    this.id = "";
                } else {
                    this.id = str;
                }
                if ((i & 2) == 0) {
                    this.imageUrl = "";
                    int i2 = onExtraCallback + 117;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 2 % 2;
                    }
                } else {
                    this.imageUrl = str2;
                }
                if ((i & 4) == 0) {
                    int i4 = onWarmupCompleted + 83;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    this.title = "";
                    if (i5 != 0) {
                        int i6 = 13 / 0;
                    }
                } else {
                    this.title = str3;
                }
                int i7 = 2 % 2;
                if ((i & 8) == 0) {
                    int i8 = onWarmupCompleted + 71;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    this.subTitle = "";
                    if (i9 != 0) {
                        int i10 = 4 / 0;
                    }
                } else {
                    this.subTitle = str4;
                }
                int i11 = 2 % 2;
                if ((i & 16) == 0) {
                    int i12 = onExtraCallback + 35;
                    onWarmupCompleted = i12 % 128;
                    int i13 = i12 % 2;
                    this.landingUrl = "";
                    if (i13 == 0) {
                        throw null;
                    }
                } else {
                    this.landingUrl = str5;
                }
                if ((i & 32) == 0) {
                    this.adClearanceText = null;
                } else {
                    this.adClearanceText = str6;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Normal(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                this.id = str;
                this.imageUrl = str2;
                this.title = str3;
                this.subTitle = str4;
                this.landingUrl = str5;
                this.adClearanceText = str6;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void onNavigationEvent(Normal normal, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(normal.IAuthTabCallback(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 0, normal.IAuthTabCallback());
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                    int i2 = onExtraCallback + 61;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    if (!Intrinsics.areEqual(normal.imageUrl, "")) {
                        vylVar.onExtraCallback(serialDescriptor, 1, normal.imageUrl);
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                    int i4 = onWarmupCompleted + 19;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        Intrinsics.areEqual(normal.asInterface(), "");
                        throw null;
                    }
                    if (!Intrinsics.areEqual(normal.asInterface(), "")) {
                        vylVar.onExtraCallback(serialDescriptor, 2, normal.asInterface());
                    }
                }
                if (!(true ^ vylVar.onWarmupCompleted(serialDescriptor, 3)) || !Intrinsics.areEqual(normal.IAuthTabCallbackStub(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 3, normal.IAuthTabCallbackStub());
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
                    int i5 = onExtraCallback + 49;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    if (!Intrinsics.areEqual(normal.onWarmupCompleted(), "")) {
                        vylVar.onExtraCallback(serialDescriptor, 4, normal.onWarmupCompleted());
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 5) || normal.adClearanceText != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, normal.adClearanceText);
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Normal(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str7;
                String str8;
                String str9;
                if ((i & 1) != 0) {
                    int i2 = onExtraCallback + 55;
                    int i3 = i2 % 128;
                    onWarmupCompleted = i3;
                    int i4 = i2 % 2;
                    int i5 = i3 + 27;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                    str = "";
                }
                if ((i & 2) != 0) {
                    int i8 = onExtraCallback;
                    int i9 = i8 + 115;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = i8 + 11;
                    onWarmupCompleted = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 2 % 2;
                    }
                    str7 = "";
                } else {
                    str7 = str2;
                }
                if ((i & 4) != 0) {
                    int i13 = onExtraCallback + 103;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                    str8 = "";
                } else {
                    str8 = str3;
                }
                Object obj = null;
                if ((i & 8) != 0) {
                    int i15 = onExtraCallback + 85;
                    onWarmupCompleted = i15 % 128;
                    if (i15 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i16 = 2 % 2;
                    str9 = "";
                } else {
                    str9 = str4;
                }
                this(str, str7, str8, str9, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : str6);
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 27;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                String str = this.id;
                int i5 = i2 + 65;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final String asBinder() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 89;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                String str = this.imageUrl;
                int i5 = i2 + 75;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String asInterface() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 63;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.title;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 67;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                String str = this.subTitle;
                int i5 = i2 + 111;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 27;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                String str = this.landingUrl;
                int i5 = i2 + 111;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final String IAuthTabCallbackDefault() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 19;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                String str = this.adClearanceText;
                int i5 = i3 + 69;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }
        }

        @nc(IAuthTabCallback = "styleId")
        @liq
        public static final class Feed extends Creative {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Feed> CREATOR = new IAuthTabCallback();
            public static final Companion Companion;
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            private final String adClearanceText;
            private final String brandLogoUrl;
            private final String brandName;
            private final String ctaBackgroundColor;
            private final String ctaText;
            private final String ctaTextColor;
            private final String id;
            private final String landingUrl;
            private final String mainImageAlt;
            private final String mainImageUrl;
            private final String subTitle;
            private final String title;

            public static final class IAuthTabCallback implements Parcelable.Creator<Feed> {
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Feed[] IAuthTabCallback(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 105;
                    int i4 = i3 % 128;
                    onExtraCallback = i4;
                    int i5 = i3 % 2;
                    Feed[] feedArr = new Feed[i];
                    int i6 = i4 + 71;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    return feedArr;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Feed createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 97;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        onExtraCallback(parcel);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Feed feedOnExtraCallback = onExtraCallback(parcel);
                    int i3 = onExtraCallbackWithResult + 17;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return feedOnExtraCallback;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Feed[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 113;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    Feed[] feedArrIAuthTabCallback = IAuthTabCallback(i);
                    int i5 = onExtraCallbackWithResult + 41;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 3 / 0;
                    }
                    return feedArrIAuthTabCallback;
                }

                public final Feed onExtraCallback(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    Feed feed = new Feed(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    int i2 = onExtraCallback + 9;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 94 / 0;
                    }
                    return feed;
                }
            }

            static {
                DefaultConstructorMarker defaultConstructorMarker = null;
                Companion = new Companion(defaultConstructorMarker);
                int i = IAuthTabCallback + 59;
                onWarmupCompleted = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                defaultConstructorMarker.hashCode();
                throw null;
            }

            public Feed() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
                int i7 = ~i5;
                int i8 = (~(i7 | i)) | i4;
                int i9 = ~i;
                int i10 = ~i4;
                int i11 = (~(i9 | i10)) | i5;
                int i12 = (~(i4 | i9 | i5)) | (~(i7 | i9 | i10)) | (~(i10 | i | i5));
                int i13 = i + i5 + i6 + ((-104759182) * i2) + ((-453318476) * i3);
                int i14 = i13 * i13;
                int i15 = (i * 1504131295) + 1805123584 + (1504131295 * i5) + (179255518 * i8) + ((-358511036) * i11) + ((-179255518) * i12) + (1324875776 * i6) + (711983104 * i2) + (1180696576 * i3) + (1022754816 * i14);
                int i16 = ((i * (-1431886989)) - 1507491630) + (i5 * (-1431886989)) + (i8 * (-122)) + (i11 * 244) + (i12 * 122) + (i6 * (-1431886867)) + (i2 * 722567050) + (i3 * (-1618605404)) + (i14 * 297664512);
                return i15 + ((i16 * i16) * (-277217280)) != 1 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 75;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2 == 0 ? 1 : 0;
                int i5 = i2 + 121;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return i4;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onExtraCallbackWithResult + 9;
                    onNavigationEvent = i2 % 128;
                    return i2 % 2 != 0;
                }
                if (!(obj instanceof Feed)) {
                    return false;
                }
                Feed feed = (Feed) obj;
                if (!Intrinsics.areEqual(this.id, feed.id)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.brandName, feed.brandName)) {
                    int i3 = onNavigationEvent + 11;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 99 / 0;
                    }
                    return false;
                }
                if (!Intrinsics.areEqual(this.brandLogoUrl, feed.brandLogoUrl)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.title, feed.title)) {
                    int i5 = onNavigationEvent + 27;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.subTitle, feed.subTitle)) {
                    int i7 = onNavigationEvent + 125;
                    onExtraCallbackWithResult = i7 % 128;
                    return i7 % 2 != 0;
                }
                if (!Intrinsics.areEqual(this.mainImageUrl, feed.mainImageUrl)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.mainImageAlt, feed.mainImageAlt)) {
                    int i8 = onExtraCallbackWithResult + 37;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 48 / 0;
                    }
                    return false;
                }
                if (!Intrinsics.areEqual(this.ctaText, feed.ctaText)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.ctaTextColor, feed.ctaTextColor)) {
                    int i10 = onExtraCallbackWithResult + 71;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.ctaBackgroundColor, feed.ctaBackgroundColor)) {
                    return Intrinsics.areEqual(this.landingUrl, feed.landingUrl) && Intrinsics.areEqual(this.adClearanceText, feed.adClearanceText);
                }
                int i12 = onNavigationEvent + 5;
                onExtraCallbackWithResult = i12 % 128;
                if (i12 % 2 == 0) {
                    return false;
                }
                throw null;
            }

            public int hashCode() {
                int iHashCode;
                int iHashCode2;
                int i = 2 % 2;
                int iHashCode3 = this.id.hashCode();
                int iHashCode4 = this.brandName.hashCode();
                int iHashCode5 = this.brandLogoUrl.hashCode();
                int iHashCode6 = this.title.hashCode();
                int iHashCode7 = this.subTitle.hashCode();
                int iHashCode8 = this.mainImageUrl.hashCode();
                int iHashCode9 = this.mainImageAlt.hashCode();
                int iHashCode10 = this.ctaText.hashCode();
                String str = this.ctaTextColor;
                if (str == null) {
                    iHashCode = 0;
                } else {
                    iHashCode = str.hashCode();
                    int i2 = onNavigationEvent + 73;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                }
                String str2 = this.ctaBackgroundColor;
                if (str2 == null) {
                    int i4 = onExtraCallbackWithResult + 123;
                    onNavigationEvent = i4 % 128;
                    iHashCode2 = i4 % 2 == 0 ? 1 : 0;
                } else {
                    iHashCode2 = str2.hashCode();
                }
                int iHashCode11 = this.landingUrl.hashCode();
                String str3 = this.adClearanceText;
                return (((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode11) * 31) + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Feed(id=" + this.id + ", brandName=" + this.brandName + ", brandLogoUrl=" + this.brandLogoUrl + ", title=" + this.title + ", subTitle=" + this.subTitle + ", mainImageUrl=" + this.mainImageUrl + ", mainImageAlt=" + this.mainImageAlt + ", ctaText=" + this.ctaText + ", ctaTextColor=" + this.ctaTextColor + ", ctaBackgroundColor=" + this.ctaBackgroundColor + ", landingUrl=" + this.landingUrl + ", adClearanceText=" + this.adClearanceText + ")";
                int i2 = onExtraCallbackWithResult + 123;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 59;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.id);
                parcel.writeString(this.brandName);
                parcel.writeString(this.brandLogoUrl);
                parcel.writeString(this.title);
                parcel.writeString(this.subTitle);
                parcel.writeString(this.mainImageUrl);
                parcel.writeString(this.mainImageAlt);
                parcel.writeString(this.ctaText);
                parcel.writeString(this.ctaTextColor);
                parcel.writeString(this.ctaBackgroundColor);
                parcel.writeString(this.landingUrl);
                parcel.writeString(this.adClearanceText);
                int i5 = onNavigationEvent + 13;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }

            public static final class Companion {
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Feed> serializer() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 49;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    NativeAdsDto$Creative$Feed$$serializer nativeAdsDto$Creative$Feed$$serializer = NativeAdsDto$Creative$Feed$$serializer.INSTANCE;
                    int i4 = onNavigationEvent + 107;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 76 / 0;
                    }
                    return nativeAdsDto$Creative$Feed$$serializer;
                }
            }

            public /* synthetic */ Feed(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, okycx okycxVar) {
                super(i, okycxVar);
                if ((i & 1) == 0) {
                    this.id = "";
                } else {
                    this.id = str;
                    int i2 = onNavigationEvent + 69;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                }
                if ((i & 2) == 0) {
                    this.brandName = "";
                } else {
                    this.brandName = str2;
                }
                if ((i & 4) == 0) {
                    this.brandLogoUrl = "";
                } else {
                    this.brandLogoUrl = str3;
                }
                if ((i & 8) == 0) {
                    this.title = "";
                    int i5 = 2 % 2;
                } else {
                    this.title = str4;
                }
                if ((i & 16) == 0) {
                    this.subTitle = "";
                } else {
                    this.subTitle = str5;
                }
                if ((i & 32) == 0) {
                    this.mainImageUrl = "";
                } else {
                    this.mainImageUrl = str6;
                }
                if ((i & 64) == 0) {
                    int i6 = onExtraCallbackWithResult + 53;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    this.mainImageAlt = "";
                } else {
                    this.mainImageAlt = str7;
                    int i8 = onNavigationEvent + 125;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = 2 % 2;
                }
                if ((i & 128) == 0) {
                    this.ctaText = "";
                    int i11 = 2 % 2;
                } else {
                    this.ctaText = str8;
                }
                if ((i & 256) == 0) {
                    this.ctaTextColor = null;
                    int i12 = onNavigationEvent + 69;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                    int i14 = 2 % 2;
                } else {
                    this.ctaTextColor = str9;
                }
                if ((i & 512) == 0) {
                    this.ctaBackgroundColor = null;
                } else {
                    this.ctaBackgroundColor = str10;
                }
                if ((i & 1024) == 0) {
                    this.landingUrl = "";
                } else {
                    this.landingUrl = str11;
                }
                if ((i & 2048) == 0) {
                    this.adClearanceText = null;
                } else {
                    this.adClearanceText = str12;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Feed(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @Nullable String str9, @Nullable String str10, @NotNull String str11, @Nullable String str12) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str8, "");
                Intrinsics.checkNotNullParameter(str11, "");
                this.id = str;
                this.brandName = str2;
                this.brandLogoUrl = str3;
                this.title = str4;
                this.subTitle = str5;
                this.mainImageUrl = str6;
                this.mainImageAlt = str7;
                this.ctaText = str8;
                this.ctaTextColor = str9;
                this.ctaBackgroundColor = str10;
                this.landingUrl = str11;
                this.adClearanceText = str12;
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void onExtraCallback(Feed feed, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(feed.IAuthTabCallback(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 0, feed.IAuthTabCallback());
                }
                if (!(!vylVar.onWarmupCompleted(serialDescriptor, 1)) || !Intrinsics.areEqual(feed.brandName, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 1, feed.brandName);
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(feed.brandLogoUrl, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 2, feed.brandLogoUrl);
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(feed.asInterface(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 3, feed.asInterface());
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(feed.IAuthTabCallbackStub(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 4, feed.IAuthTabCallbackStub());
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
                    int i2 = onExtraCallbackWithResult + 61;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    if (!Intrinsics.areEqual(feed.mainImageUrl, "")) {
                        vylVar.onExtraCallback(serialDescriptor, 5, feed.mainImageUrl);
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 6) || !Intrinsics.areEqual(feed.mainImageAlt, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 6, feed.mainImageAlt);
                }
                if (!(!vylVar.onWarmupCompleted(serialDescriptor, 7))) {
                    vylVar.onExtraCallback(serialDescriptor, 7, feed.ctaText);
                } else {
                    int i4 = onExtraCallbackWithResult + 89;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    if (!Intrinsics.areEqual(feed.ctaText, "")) {
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 8)) {
                    int i6 = onExtraCallbackWithResult + 57;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    if (feed.ctaTextColor != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, feed.ctaTextColor);
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 9) || feed.ctaBackgroundColor != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, feed.ctaBackgroundColor);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 10)) {
                    int i8 = onExtraCallbackWithResult + 67;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    if (!Intrinsics.areEqual(feed.onWarmupCompleted(), "")) {
                        vylVar.onExtraCallback(serialDescriptor, 10, feed.onWarmupCompleted());
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 11)) {
                    int i10 = onExtraCallbackWithResult + 63;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    if (feed.adClearanceText == null) {
                        return;
                    }
                }
                vylVar.onExtraCallbackWithResult(serialDescriptor, 11, getWriggleLayout.onNavigationEvent, feed.adClearanceText);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Feed(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str13;
                String str14;
                String str15;
                String str16;
                String str17;
                String str18;
                String str19 = (i & 1) != 0 ? "" : str;
                if ((i & 2) != 0) {
                    int i2 = onExtraCallbackWithResult + 15;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 59 / 0;
                    }
                    str13 = "";
                } else {
                    str13 = str2;
                }
                if ((i & 4) != 0) {
                    int i4 = onExtraCallbackWithResult + 93;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 2 % 2;
                    str14 = "";
                } else {
                    str14 = str3;
                }
                String str20 = (i & 8) != 0 ? "" : str4;
                String str21 = (i & 16) != 0 ? "" : str5;
                if ((i & 32) != 0) {
                    int i7 = 2 % 2;
                    str15 = "";
                } else {
                    str15 = str6;
                }
                if ((i & 64) != 0) {
                    int i8 = onExtraCallbackWithResult + 109;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = 2 % 2;
                    str16 = "";
                } else {
                    str16 = str7;
                }
                String str22 = (i & 128) != 0 ? "" : str8;
                String str23 = null;
                if ((i & 256) != 0) {
                    int i11 = onNavigationEvent + 89;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    str17 = null;
                } else {
                    str17 = str9;
                }
                if ((i & 512) != 0) {
                    int i13 = onNavigationEvent + 45;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = 2 % 2;
                    str18 = null;
                } else {
                    str18 = str10;
                }
                String str24 = (i & 1024) == 0 ? str11 : "";
                if ((i & 2048) != 0) {
                    int i16 = onExtraCallbackWithResult + 77;
                    onNavigationEvent = i16 % 128;
                    int i17 = i16 % 2;
                } else {
                    str23 = str12;
                }
                this(str19, str13, str14, str20, str21, str15, str16, str22, str17, str18, str24, str23);
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 19;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                String str = this.id;
                int i5 = i2 + 45;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final String IAuthTabCallbackDefault() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 61;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                String str = this.brandName;
                if (i3 == 0) {
                    int i4 = 41 / 0;
                }
                return str;
            }

            public final String asBinder() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 9;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                String str = this.brandLogoUrl;
                int i5 = i2 + 65;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String asInterface() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 85;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                String str = this.title;
                int i5 = i2 + 85;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 71;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                String str = this.subTitle;
                int i5 = i3 + 95;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final String getInterfaceDescriptor() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 27;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                String str = this.mainImageUrl;
                int i5 = i3 + 43;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            public final String access000() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 113;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                String str = this.mainImageAlt;
                if (i3 == 0) {
                    int i4 = 6 / 0;
                }
                return str;
            }

            private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
                Feed feed = (Feed) objArr[0];
                int i = 2 % 2;
                int i2 = onNavigationEvent + 125;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                String str = feed.ctaText;
                if (i3 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final String IAuthTabCallback_Parcel() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 49;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                String str = this.ctaTextColor;
                int i5 = i2 + 25;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
                Feed feed = (Feed) objArr[0];
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 85;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                Object obj = null;
                String str = feed.ctaBackgroundColor;
                if (i4 == 0) {
                    throw null;
                }
                int i5 = i3 + 23;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                obj.hashCode();
                throw null;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 23;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                String str = this.landingUrl;
                int i5 = i3 + 69;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 57 / 0;
                }
                return str;
            }

            public final String onTransact() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 7;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                String str = this.adClearanceText;
                int i5 = i2 + 31;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final String IAuthTabCallbackStubProxy() {
                int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
                int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
                return (String) IAuthTabCallback(545562487, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), iIAuthTabCallback, -545562487, new Object[]{this}, iIAuthTabCallback2);
            }

            public final String access100() {
                int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
                int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
                return (String) IAuthTabCallback(790435775, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), iIAuthTabCallback, -790435774, new Object[]{this}, iIAuthTabCallback2);
            }
        }

        @nc(IAuthTabCallback = "styleId")
        @liq
        public static final class FullBanner extends Creative {
            public static final int $stable = 0;
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            private final String brandLogoUrl;
            private final String ctaText;
            private final String id;
            private final String imageAlt;
            private final String imageUrl;
            private final String landingUrl;
            private final String subTitle;
            private final String title;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<FullBanner> CREATOR = new onNavigationEvent();

            public static final class onNavigationEvent implements Parcelable.Creator<FullBanner> {
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final FullBanner[] IAuthTabCallback(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 57;
                    onNavigationEvent = i3 % 128;
                    FullBanner[] fullBannerArr = new FullBanner[i];
                    if (i3 % 2 == 0) {
                        return fullBannerArr;
                    }
                    throw null;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ FullBanner createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 65;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    FullBanner fullBannerOnExtraCallback = onExtraCallback(parcel);
                    int i4 = onNavigationEvent + 1;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return fullBannerOnExtraCallback;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ FullBanner[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 3;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 != 0) {
                        IAuthTabCallback(i);
                        throw null;
                    }
                    FullBanner[] fullBannerArrIAuthTabCallback = IAuthTabCallback(i);
                    int i4 = onNavigationEvent + 33;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return fullBannerArrIAuthTabCallback;
                }

                public final FullBanner onExtraCallback(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    FullBanner fullBanner = new FullBanner(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    int i2 = onNavigationEvent + 89;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return fullBanner;
                }
            }

            static {
                int i = IAuthTabCallback + 87;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            public FullBanner() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 111;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 45;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 17;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                Object obj2 = null;
                if (i2 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                if (this == obj) {
                    int i4 = i3 + 111;
                    int i5 = i4 % 128;
                    onExtraCallbackWithResult = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 15;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    return true;
                }
                if (!(obj instanceof FullBanner)) {
                    return false;
                }
                FullBanner fullBanner = (FullBanner) obj;
                if ((!Intrinsics.areEqual(this.id, fullBanner.id)) || !Intrinsics.areEqual(this.imageUrl, fullBanner.imageUrl) || !Intrinsics.areEqual(this.imageAlt, fullBanner.imageAlt) || !Intrinsics.areEqual(this.title, fullBanner.title)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.subTitle, fullBanner.subTitle)) {
                    int i9 = onNavigationEvent + 71;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 != 0) {
                        return false;
                    }
                    throw null;
                }
                if (!Intrinsics.areEqual(this.ctaText, fullBanner.ctaText) || !Intrinsics.areEqual(this.brandLogoUrl, fullBanner.brandLogoUrl)) {
                    return false;
                }
                if (!(!Intrinsics.areEqual(this.landingUrl, fullBanner.landingUrl))) {
                    return true;
                }
                int i10 = onExtraCallbackWithResult + 115;
                onNavigationEvent = i10 % 128;
                return i10 % 2 != 0;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 47;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = (((((((((((((this.id.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.imageAlt.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subTitle.hashCode()) * 31) + this.ctaText.hashCode()) * 31) + this.brandLogoUrl.hashCode()) * 31) + this.landingUrl.hashCode();
                int i4 = onExtraCallbackWithResult + 115;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return iHashCode;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "FullBanner(id=" + this.id + ", imageUrl=" + this.imageUrl + ", imageAlt=" + this.imageAlt + ", title=" + this.title + ", subTitle=" + this.subTitle + ", ctaText=" + this.ctaText + ", brandLogoUrl=" + this.brandLogoUrl + ", landingUrl=" + this.landingUrl + ")";
                int i2 = onExtraCallbackWithResult + 107;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 40 / 0;
                }
                return str;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 43;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.id);
                parcel.writeString(this.imageUrl);
                parcel.writeString(this.imageAlt);
                parcel.writeString(this.title);
                parcel.writeString(this.subTitle);
                parcel.writeString(this.ctaText);
                parcel.writeString(this.brandLogoUrl);
                parcel.writeString(this.landingUrl);
                int i5 = onNavigationEvent + 113;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }

            public static final class Companion {
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<FullBanner> serializer() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 69;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    NativeAdsDto$Creative$FullBanner$$serializer nativeAdsDto$Creative$FullBanner$$serializer = NativeAdsDto$Creative$FullBanner$$serializer.INSTANCE;
                    int i4 = onNavigationEvent + 23;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        return nativeAdsDto$Creative$FullBanner$$serializer;
                    }
                    throw null;
                }
            }

            public /* synthetic */ FullBanner(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, okycx okycxVar) {
                super(i, okycxVar);
                if ((i & 1) == 0) {
                    this.id = "";
                } else {
                    this.id = str;
                }
                if ((i & 2) == 0) {
                    int i2 = onNavigationEvent + 17;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    this.imageUrl = "";
                } else {
                    this.imageUrl = str2;
                }
                if ((i & 4) == 0) {
                    this.imageAlt = "";
                    int i4 = onExtraCallbackWithResult + 63;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 2 % 2;
                } else {
                    this.imageAlt = str3;
                }
                if ((i & 8) == 0) {
                    this.title = "";
                } else {
                    this.title = str4;
                    int i7 = 2 % 2;
                }
                if ((i & 16) == 0) {
                    int i8 = onExtraCallbackWithResult + 101;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    this.subTitle = "";
                } else {
                    this.subTitle = str5;
                }
                int i10 = 2 % 2;
                if ((i & 32) == 0) {
                    int i11 = onNavigationEvent + 101;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    this.ctaText = "";
                    if (i12 == 0) {
                        int i13 = 41 / 0;
                    }
                } else {
                    this.ctaText = str6;
                }
                if ((i & 64) == 0) {
                    this.brandLogoUrl = "";
                } else {
                    this.brandLogoUrl = str7;
                }
                if ((i & 128) != 0) {
                    this.landingUrl = str8;
                    return;
                }
                int i14 = onExtraCallbackWithResult + 69;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                this.landingUrl = "";
                if (i15 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FullBanner(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str8, "");
                this.id = str;
                this.imageUrl = str2;
                this.imageAlt = str3;
                this.title = str4;
                this.subTitle = str5;
                this.ctaText = str6;
                this.brandLogoUrl = str7;
                this.landingUrl = str8;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void onExtraCallbackWithResult(FullBanner fullBanner, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                Object obj = null;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                    int i2 = onExtraCallbackWithResult + 111;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        Intrinsics.areEqual(fullBanner.IAuthTabCallback(), "");
                        obj.hashCode();
                        throw null;
                    }
                    if (!Intrinsics.areEqual(fullBanner.IAuthTabCallback(), "")) {
                        vylVar.onExtraCallback(serialDescriptor, 0, fullBanner.IAuthTabCallback());
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(fullBanner.imageUrl, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 1, fullBanner.imageUrl);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                    int i3 = onExtraCallbackWithResult + 71;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    if (!Intrinsics.areEqual(fullBanner.imageAlt, "")) {
                        vylVar.onExtraCallback(serialDescriptor, 2, fullBanner.imageAlt);
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(fullBanner.asInterface(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 3, fullBanner.asInterface());
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
                    int i5 = onNavigationEvent + 39;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        Intrinsics.areEqual(fullBanner.IAuthTabCallbackStub(), "");
                        throw null;
                    }
                    if (!Intrinsics.areEqual(fullBanner.IAuthTabCallbackStub(), "")) {
                        vylVar.onExtraCallback(serialDescriptor, 4, fullBanner.IAuthTabCallbackStub());
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
                    int i6 = onExtraCallbackWithResult + 15;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    if (!Intrinsics.areEqual(fullBanner.ctaText, "")) {
                        vylVar.onExtraCallback(serialDescriptor, 5, fullBanner.ctaText);
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
                    int i8 = onNavigationEvent + 49;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 == 0) {
                        Intrinsics.areEqual(fullBanner.brandLogoUrl, "");
                        obj.hashCode();
                        throw null;
                    }
                    if (!Intrinsics.areEqual(fullBanner.brandLogoUrl, "")) {
                        vylVar.onExtraCallback(serialDescriptor, 6, fullBanner.brandLogoUrl);
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
                    int i9 = onExtraCallbackWithResult + 21;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    if (Intrinsics.areEqual(fullBanner.onWarmupCompleted(), "")) {
                        return;
                    }
                }
                vylVar.onExtraCallback(serialDescriptor, 7, fullBanner.onWarmupCompleted());
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ FullBanner(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str9;
                String str10;
                String str11;
                String str12;
                String str13;
                String str14;
                String str15;
                String str16 = "";
                if ((i & 1) != 0) {
                    int i2 = onNavigationEvent + 53;
                    int i3 = i2 % 128;
                    onExtraCallbackWithResult = i3;
                    int i4 = i2 % 2;
                    int i5 = i3 + 37;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                    str9 = "";
                } else {
                    str9 = str;
                }
                if ((i & 2) != 0) {
                    int i8 = onNavigationEvent + 13;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    str10 = "";
                } else {
                    str10 = str2;
                }
                if ((i & 4) != 0) {
                    int i10 = onNavigationEvent + 91;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    str11 = "";
                } else {
                    str11 = str3;
                }
                if ((i & 8) != 0) {
                    int i12 = onNavigationEvent + 47;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                    str12 = "";
                } else {
                    str12 = str4;
                }
                if ((i & 16) != 0) {
                    int i14 = onNavigationEvent + 31;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    str13 = "";
                } else {
                    str13 = str5;
                }
                if ((i & 32) != 0) {
                    int i16 = 2 % 2;
                    str14 = "";
                } else {
                    str14 = str6;
                }
                if ((i & 64) != 0) {
                    int i17 = 2 % 2;
                    str15 = "";
                } else {
                    str15 = str7;
                }
                if ((i & 128) != 0) {
                    int i18 = onExtraCallbackWithResult + 111;
                    onNavigationEvent = i18 % 128;
                    int i19 = i18 % 2;
                    int i20 = 2 % 2;
                } else {
                    str16 = str8;
                }
                this(str9, str10, str11, str12, str13, str14, str15, str16);
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 25;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                String str = this.id;
                if (i3 != 0) {
                    int i4 = 24 / 0;
                }
                return str;
            }

            public final String onTransact() {
                String str;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 21;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 == 0) {
                    str = this.imageUrl;
                    int i4 = 2 / 0;
                } else {
                    str = this.imageUrl;
                }
                int i5 = i3 + 123;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final String asBinder() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 15;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                String str = this.imageAlt;
                int i5 = i3 + 57;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String asInterface() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 123;
                onExtraCallbackWithResult = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    throw null;
                }
                String str = this.title;
                int i4 = i2 + 9;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return str;
                }
                obj.hashCode();
                throw null;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 115;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                String str = this.subTitle;
                int i5 = i2 + 83;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            public final String IAuthTabCallbackDefault() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 115;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                String str = this.ctaText;
                int i4 = i2 + 1;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 63;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                String str = this.landingUrl;
                int i5 = i3 + 3;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }
        }

        @nc(IAuthTabCallback = "styleId")
        @liq
        public static final class ShortFormVideo extends Creative {
            public static final int $stable = 0;
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            private final String adClearanceText;
            private final String brandLogoUrl;
            private final String brandName;
            private final String ctaText;
            private final String id;
            private final String landingUrl;
            private final String subTitle;
            private final String thumbnailImageUrl;
            private final String title;
            private final String videoUrl;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<ShortFormVideo> CREATOR = new onNavigationEvent();

            public static final class onNavigationEvent implements Parcelable.Creator<ShortFormVideo> {
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final ShortFormVideo[] IAuthTabCallback(int i) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 117;
                    int i4 = i3 % 128;
                    onExtraCallbackWithResult = i4;
                    int i5 = i3 % 2;
                    ShortFormVideo[] shortFormVideoArr = new ShortFormVideo[i];
                    int i6 = i4 + 109;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        return shortFormVideoArr;
                    }
                    throw null;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ ShortFormVideo createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 105;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        return onExtraCallback(parcel);
                    }
                    onExtraCallback(parcel);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ ShortFormVideo[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 77;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    ShortFormVideo[] shortFormVideoArrIAuthTabCallback = IAuthTabCallback(i);
                    if (i4 == 0) {
                        int i5 = 80 / 0;
                    }
                    return shortFormVideoArrIAuthTabCallback;
                }

                public final ShortFormVideo onExtraCallback(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    ShortFormVideo shortFormVideo = new ShortFormVideo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    int i2 = onExtraCallbackWithResult + 31;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        return shortFormVideo;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            static {
                int i = onExtraCallback + 15;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            public ShortFormVideo() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 39;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 65;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShortFormVideo)) {
                    return false;
                }
                ShortFormVideo shortFormVideo = (ShortFormVideo) obj;
                if (!Intrinsics.areEqual(this.id, shortFormVideo.id)) {
                    int i2 = onWarmupCompleted + 11;
                    onExtraCallbackWithResult = i2 % 128;
                    return i2 % 2 == 0;
                }
                if (!Intrinsics.areEqual(this.brandName, shortFormVideo.brandName) || !Intrinsics.areEqual(this.brandLogoUrl, shortFormVideo.brandLogoUrl)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.thumbnailImageUrl, shortFormVideo.thumbnailImageUrl)) {
                    int i3 = onExtraCallbackWithResult + 79;
                    onWarmupCompleted = i3 % 128;
                    return i3 % 2 != 0;
                }
                if (!Intrinsics.areEqual(this.videoUrl, shortFormVideo.videoUrl)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.title, shortFormVideo.title)) {
                    int i4 = onWarmupCompleted + 105;
                    int i5 = i4 % 128;
                    onExtraCallbackWithResult = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 95;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.subTitle, shortFormVideo.subTitle) || !Intrinsics.areEqual(this.ctaText, shortFormVideo.ctaText)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.landingUrl, shortFormVideo.landingUrl)) {
                    return Intrinsics.areEqual(this.adClearanceText, shortFormVideo.adClearanceText);
                }
                int i9 = onExtraCallbackWithResult + 121;
                int i10 = i9 % 128;
                onWarmupCompleted = i10;
                int i11 = i9 % 2;
                int i12 = i10 + 113;
                onExtraCallbackWithResult = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 15 / 0;
                }
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 67;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode2 = this.id.hashCode();
                int iHashCode3 = this.brandName.hashCode();
                int iHashCode4 = this.brandLogoUrl.hashCode();
                int iHashCode5 = this.thumbnailImageUrl.hashCode();
                int iHashCode6 = this.videoUrl.hashCode();
                int iHashCode7 = this.title.hashCode();
                int iHashCode8 = this.subTitle.hashCode();
                int iHashCode9 = this.ctaText.hashCode();
                int iHashCode10 = this.landingUrl.hashCode();
                String str = this.adClearanceText;
                if (str == null) {
                    int i4 = onWarmupCompleted + 19;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = str.hashCode();
                }
                return (((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "ShortFormVideo(id=" + this.id + ", brandName=" + this.brandName + ", brandLogoUrl=" + this.brandLogoUrl + ", thumbnailImageUrl=" + this.thumbnailImageUrl + ", videoUrl=" + this.videoUrl + ", title=" + this.title + ", subTitle=" + this.subTitle + ", ctaText=" + this.ctaText + ", landingUrl=" + this.landingUrl + ", adClearanceText=" + this.adClearanceText + ")";
                int i2 = onExtraCallbackWithResult + 53;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 23;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.id);
                parcel.writeString(this.brandName);
                parcel.writeString(this.brandLogoUrl);
                parcel.writeString(this.thumbnailImageUrl);
                parcel.writeString(this.videoUrl);
                parcel.writeString(this.title);
                parcel.writeString(this.subTitle);
                parcel.writeString(this.ctaText);
                parcel.writeString(this.landingUrl);
                parcel.writeString(this.adClearanceText);
                int i5 = onWarmupCompleted + 63;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static final class Companion {
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<ShortFormVideo> serializer() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 115;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    NativeAdsDto$Creative$ShortFormVideo$$serializer nativeAdsDto$Creative$ShortFormVideo$$serializer = NativeAdsDto$Creative$ShortFormVideo$$serializer.INSTANCE;
                    int i4 = onExtraCallbackWithResult + 37;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return nativeAdsDto$Creative$ShortFormVideo$$serializer;
                    }
                    throw null;
                }
            }

            public /* synthetic */ ShortFormVideo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, okycx okycxVar) {
                super(i, okycxVar);
                if ((i & 1) == 0) {
                    this.id = "";
                } else {
                    this.id = str;
                }
                if ((i & 2) == 0) {
                    this.brandName = "";
                } else {
                    this.brandName = str2;
                    int i2 = onWarmupCompleted + 117;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                }
                if ((i & 4) == 0) {
                    this.brandLogoUrl = "";
                } else {
                    this.brandLogoUrl = str3;
                    int i5 = onWarmupCompleted + 113;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                }
                int i7 = 2 % 2;
                if ((i & 8) == 0) {
                    int i8 = onExtraCallbackWithResult + 57;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    this.thumbnailImageUrl = "";
                    if (i9 != 0) {
                        int i10 = 13 / 0;
                    }
                } else {
                    this.thumbnailImageUrl = str4;
                }
                if ((i & 16) == 0) {
                    this.videoUrl = "";
                } else {
                    this.videoUrl = str5;
                }
                if ((i & 32) == 0) {
                    int i11 = onExtraCallbackWithResult + 103;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    this.title = "";
                } else {
                    this.title = str6;
                }
                if ((i & 64) == 0) {
                    this.subTitle = "";
                } else {
                    this.subTitle = str7;
                    int i13 = 2 % 2;
                }
                if ((i & 128) == 0) {
                    this.ctaText = "";
                } else {
                    this.ctaText = str8;
                }
                if ((i & 256) == 0) {
                    int i14 = onExtraCallbackWithResult + 95;
                    onWarmupCompleted = i14 % 128;
                    int i15 = i14 % 2;
                    this.landingUrl = "";
                    if (i15 != 0) {
                        throw null;
                    }
                    int i16 = 2 % 2;
                } else {
                    this.landingUrl = str9;
                }
                if ((i & 512) == 0) {
                    this.adClearanceText = null;
                } else {
                    this.adClearanceText = str10;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShortFormVideo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @Nullable String str10) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str8, "");
                Intrinsics.checkNotNullParameter(str9, "");
                this.id = str;
                this.brandName = str2;
                this.brandLogoUrl = str3;
                this.thumbnailImageUrl = str4;
                this.videoUrl = str5;
                this.title = str6;
                this.subTitle = str7;
                this.ctaText = str8;
                this.landingUrl = str9;
                this.adClearanceText = str10;
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void onExtraCallbackWithResult(ShortFormVideo shortFormVideo, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                if (!(!vylVar.onWarmupCompleted(serialDescriptor, 0)) || !Intrinsics.areEqual(shortFormVideo.IAuthTabCallback(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 0, shortFormVideo.IAuthTabCallback());
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(shortFormVideo.brandName, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 1, shortFormVideo.brandName);
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(shortFormVideo.brandLogoUrl, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 2, shortFormVideo.brandLogoUrl);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                    int i2 = onWarmupCompleted + 39;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    if (!Intrinsics.areEqual(shortFormVideo.thumbnailImageUrl, "")) {
                        vylVar.onExtraCallback(serialDescriptor, 3, shortFormVideo.thumbnailImageUrl);
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(shortFormVideo.videoUrl, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 4, shortFormVideo.videoUrl);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
                    int i4 = onWarmupCompleted + 61;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    if (!Intrinsics.areEqual(shortFormVideo.asInterface(), "")) {
                        vylVar.onExtraCallback(serialDescriptor, 5, shortFormVideo.asInterface());
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 6) || !Intrinsics.areEqual(shortFormVideo.IAuthTabCallbackStub(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 6, shortFormVideo.IAuthTabCallbackStub());
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 7) || !Intrinsics.areEqual(shortFormVideo.ctaText, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 7, shortFormVideo.ctaText);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 8)) {
                    int i6 = onWarmupCompleted + 31;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        Intrinsics.areEqual(shortFormVideo.onWarmupCompleted(), "");
                        throw null;
                    }
                    if (!Intrinsics.areEqual(shortFormVideo.onWarmupCompleted(), "")) {
                        vylVar.onExtraCallback(serialDescriptor, 8, shortFormVideo.onWarmupCompleted());
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 9)) {
                    int i7 = onExtraCallbackWithResult + 73;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    if (shortFormVideo.adClearanceText == null) {
                        return;
                    }
                }
                vylVar.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, shortFormVideo.adClearanceText);
                int i9 = onExtraCallbackWithResult + 5;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ ShortFormVideo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str11;
                String str12;
                String str13;
                String str14;
                String str15;
                String str16;
                String str17 = null;
                String str18 = "";
                if ((i & 1) != 0) {
                    int i2 = onWarmupCompleted + 99;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    str11 = "";
                } else {
                    str11 = str;
                }
                if ((i & 2) != 0) {
                    int i3 = 2 % 2;
                    str12 = "";
                } else {
                    str12 = str2;
                }
                if ((i & 4) != 0) {
                    int i4 = onExtraCallbackWithResult + 57;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    str13 = "";
                } else {
                    str13 = str3;
                }
                if ((i & 8) != 0) {
                    int i6 = onWarmupCompleted + 125;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        str17.hashCode();
                        throw null;
                    }
                    str14 = "";
                } else {
                    str14 = str4;
                }
                if ((i & 16) != 0) {
                    int i7 = 2 % 2;
                    str15 = "";
                } else {
                    str15 = str5;
                }
                String str19 = (i & 32) != 0 ? "" : str6;
                String str20 = (i & 64) != 0 ? "" : str7;
                if ((i & 128) != 0) {
                    int i8 = onWarmupCompleted + 69;
                    int i9 = i8 % 128;
                    onExtraCallbackWithResult = i9;
                    int i10 = i8 % 2;
                    int i11 = i9 + 57;
                    onWarmupCompleted = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 2 % 2;
                    }
                    str16 = "";
                } else {
                    str16 = str8;
                }
                if ((i & 256) != 0) {
                    int i13 = onWarmupCompleted + 39;
                    onExtraCallbackWithResult = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 2 % 2;
                    }
                } else {
                    str18 = str9;
                }
                if ((i & 512) != 0) {
                    int i15 = onWarmupCompleted + 81;
                    onExtraCallbackWithResult = i15 % 128;
                    int i16 = i15 % 2;
                } else {
                    str17 = str10;
                }
                this(str11, str12, str13, str14, str15, str19, str20, str16, str18, str17);
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 39;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                String str = this.id;
                int i4 = i2 + 65;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }

            public final String IAuthTabCallbackDefault() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 19;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                String str = this.brandLogoUrl;
                int i5 = i3 + 3;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            public final String getInterfaceDescriptor() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 33;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                String str = this.thumbnailImageUrl;
                int i4 = i3 + 27;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            public final String access000() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 33;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                String str = this.videoUrl;
                int i5 = i3 + 17;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String asInterface() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 69;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.title;
                }
                throw null;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 73;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                String str = this.subTitle;
                int i5 = i2 + 93;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final String onTransact() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 13;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                String str = this.ctaText;
                int i5 = i2 + 121;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 117;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.landingUrl;
                }
                throw null;
            }

            public final String asBinder() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 113;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                String str = this.adClearanceText;
                int i5 = i2 + 1;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @nc(IAuthTabCallback = "styleId")
        @liq
        public static final class FullPage extends Creative {
            public static final int $stable = 0;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted = 1;
            private final String adClearanceText;
            private final String brandLogoUrl;
            private final String ctaText;
            private final String id;
            private final String imageAlt;
            private final String imageUrl;
            private final String landingUrl;
            private final String subTitle;
            private final String title;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<FullPage> CREATOR = new onExtraCallbackWithResult();

            public static final class onExtraCallbackWithResult implements Parcelable.Creator<FullPage> {
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final FullPage IAuthTabCallback(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    FullPage fullPage = new FullPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    int i2 = onExtraCallbackWithResult + 23;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 20 / 0;
                    }
                    return fullPage;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ FullPage createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 51;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        return IAuthTabCallback(parcel);
                    }
                    IAuthTabCallback(parcel);
                    throw null;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ FullPage[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 113;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    FullPage[] fullPageArrOnNavigationEvent = onNavigationEvent(i);
                    if (i4 == 0) {
                        int i5 = 81 / 0;
                    }
                    int i6 = onWarmupCompleted + 65;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    return fullPageArrOnNavigationEvent;
                }

                public final FullPage[] onNavigationEvent(int i) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted;
                    int i4 = i3 + 23;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    FullPage[] fullPageArr = new FullPage[i];
                    int i6 = i3 + 19;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    return fullPageArr;
                }
            }

            static {
                int i = onWarmupCompleted + 1;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            public FullPage() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 57;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 75;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FullPage)) {
                    int i2 = onExtraCallbackWithResult + 119;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                FullPage fullPage = (FullPage) obj;
                if (!Intrinsics.areEqual(this.id, fullPage.id)) {
                    int i4 = onNavigationEvent + 73;
                    onExtraCallbackWithResult = i4 % 128;
                    return i4 % 2 != 0;
                }
                if (!Intrinsics.areEqual(this.title, fullPage.title)) {
                    int i5 = onNavigationEvent + 115;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.subTitle, fullPage.subTitle) && Intrinsics.areEqual(this.imageUrl, fullPage.imageUrl) && Intrinsics.areEqual(this.imageAlt, fullPage.imageAlt) && Intrinsics.areEqual(this.ctaText, fullPage.ctaText)) {
                    if (Intrinsics.areEqual(this.brandLogoUrl, fullPage.brandLogoUrl)) {
                        if (!Intrinsics.areEqual(this.landingUrl, fullPage.landingUrl)) {
                            return false;
                        }
                        if (Intrinsics.areEqual(this.adClearanceText, fullPage.adClearanceText)) {
                            return true;
                        }
                        int i7 = onExtraCallbackWithResult + 59;
                        onNavigationEvent = i7 % 128;
                        return i7 % 2 == 0;
                    }
                    int i8 = onNavigationEvent + 37;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 != 0) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int iHashCode2 = this.id.hashCode();
                int iHashCode3 = this.title.hashCode();
                int iHashCode4 = this.subTitle.hashCode();
                int iHashCode5 = this.imageUrl.hashCode();
                int iHashCode6 = this.imageAlt.hashCode();
                int iHashCode7 = this.ctaText.hashCode();
                int iHashCode8 = this.brandLogoUrl.hashCode();
                int iHashCode9 = this.landingUrl.hashCode();
                String str = this.adClearanceText;
                if (str == null) {
                    int i2 = onNavigationEvent + 13;
                    onExtraCallbackWithResult = i2 % 128;
                    iHashCode = i2 % 2 != 0 ? 1 : 0;
                } else {
                    iHashCode = str.hashCode();
                }
                int i3 = (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode;
                int i4 = onNavigationEvent + 75;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 91 / 0;
                }
                return i3;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "FullPage(id=" + this.id + ", title=" + this.title + ", subTitle=" + this.subTitle + ", imageUrl=" + this.imageUrl + ", imageAlt=" + this.imageAlt + ", ctaText=" + this.ctaText + ", brandLogoUrl=" + this.brandLogoUrl + ", landingUrl=" + this.landingUrl + ", adClearanceText=" + this.adClearanceText + ")";
                int i2 = onNavigationEvent + 7;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 57;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.id);
                parcel.writeString(this.title);
                parcel.writeString(this.subTitle);
                parcel.writeString(this.imageUrl);
                parcel.writeString(this.imageAlt);
                parcel.writeString(this.ctaText);
                parcel.writeString(this.brandLogoUrl);
                parcel.writeString(this.landingUrl);
                parcel.writeString(this.adClearanceText);
                int i5 = onExtraCallbackWithResult + 3;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }

            public static final class Companion {
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<FullPage> serializer() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 81;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    NativeAdsDto$Creative$FullPage$$serializer nativeAdsDto$Creative$FullPage$$serializer = NativeAdsDto$Creative$FullPage$$serializer.INSTANCE;
                    int i4 = onExtraCallback + 79;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        return nativeAdsDto$Creative$FullPage$$serializer;
                    }
                    throw null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public /* synthetic */ FullPage(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, okycx okycxVar) {
                super(i, okycxVar);
                if ((i & 1) == 0) {
                    this.id = "";
                } else {
                    this.id = str;
                }
                Object obj = null;
                if ((i & 2) == 0) {
                    int i2 = onNavigationEvent + 125;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    this.title = "";
                    if (i3 != 0) {
                        throw null;
                    }
                    int i4 = 2 % 2;
                } else {
                    this.title = str2;
                }
                if ((i & 4) == 0) {
                    this.subTitle = "";
                } else {
                    this.subTitle = str3;
                }
                if ((i & 8) == 0) {
                    int i5 = onNavigationEvent + 17;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    this.imageUrl = "";
                    if (i6 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                } else {
                    this.imageUrl = str4;
                    int i7 = onNavigationEvent + 47;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = 2 % 2;
                }
                if ((i & 16) == 0) {
                    this.imageAlt = "";
                } else {
                    this.imageAlt = str5;
                }
                if ((i & 32) == 0) {
                    int i10 = onExtraCallbackWithResult + 95;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    this.ctaText = "";
                } else {
                    this.ctaText = str6;
                    int i12 = 2 % 2;
                }
                if ((i & 64) != 0) {
                    this.brandLogoUrl = str7;
                    int i13 = onExtraCallbackWithResult + 61;
                    onNavigationEvent = i13 % 128;
                    if (i13 % 2 != 0) {
                    }
                    if ((i & 128) != 0) {
                        int i14 = onNavigationEvent + 117;
                        onExtraCallbackWithResult = i14 % 128;
                        int i15 = i14 % 2;
                        this.landingUrl = "";
                    } else {
                        this.landingUrl = str8;
                    }
                    if ((i & 256) == 0) {
                        this.adClearanceText = str9;
                        return;
                    }
                    int i16 = onNavigationEvent + 17;
                    onExtraCallbackWithResult = i16 % 128;
                    int i17 = i16 % 2;
                    this.adClearanceText = null;
                    if (i17 == 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
                int i18 = onExtraCallbackWithResult + 49;
                int i19 = i18 % 128;
                onNavigationEvent = i19;
                int i20 = i18 % 2;
                this.brandLogoUrl = "";
                int i21 = i19 + 107;
                onExtraCallbackWithResult = i21 % 128;
                int i22 = i21 % 2;
                int i23 = 2 % 2;
                if ((i & 128) != 0) {
                }
                if ((i & 256) == 0) {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FullPage(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @Nullable String str9) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str8, "");
                this.id = str;
                this.title = str2;
                this.subTitle = str3;
                this.imageUrl = str4;
                this.imageAlt = str5;
                this.ctaText = str6;
                this.brandLogoUrl = str7;
                this.landingUrl = str8;
                this.adClearanceText = str9;
            }

            @JvmStatic
            public static final /* synthetic */ void IAuthTabCallback(FullPage fullPage, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(fullPage.IAuthTabCallback(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 0, fullPage.IAuthTabCallback());
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(fullPage.asInterface(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 1, fullPage.asInterface());
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(fullPage.IAuthTabCallbackStub(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 2, fullPage.IAuthTabCallbackStub());
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 3) || (!Intrinsics.areEqual(fullPage.imageUrl, ""))) {
                    vylVar.onExtraCallback(serialDescriptor, 3, fullPage.imageUrl);
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(fullPage.imageAlt, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 4, fullPage.imageAlt);
                    int i2 = onNavigationEvent + 111;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 5) || !Intrinsics.areEqual(fullPage.ctaText, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 5, fullPage.ctaText);
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 6) || !Intrinsics.areEqual(fullPage.brandLogoUrl, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 6, fullPage.brandLogoUrl);
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 7) || !Intrinsics.areEqual(fullPage.onWarmupCompleted(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 7, fullPage.onWarmupCompleted());
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 8) || fullPage.adClearanceText != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, fullPage.adClearanceText);
                }
                int i4 = onNavigationEvent + 35;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ FullPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str10;
                String str11;
                String str12 = "";
                String str13 = (i & 1) != 0 ? "" : str;
                String str14 = (i & 2) != 0 ? "" : str2;
                if ((i & 4) != 0) {
                    int i2 = 2 % 2;
                    str10 = "";
                } else {
                    str10 = str3;
                }
                String str15 = (i & 8) != 0 ? "" : str4;
                String str16 = (i & 16) != 0 ? "" : str5;
                if ((i & 32) != 0) {
                    int i3 = onExtraCallbackWithResult + 21;
                    int i4 = i3 % 128;
                    onNavigationEvent = i4;
                    int i5 = i3 % 2;
                    int i6 = i4 + 97;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = 2 % 2;
                    str11 = "";
                } else {
                    str11 = str6;
                }
                String str17 = (i & 64) != 0 ? "" : str7;
                if ((i & 128) != 0) {
                    int i9 = onNavigationEvent + 1;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 != 0) {
                        str.hashCode();
                        throw null;
                    }
                    int i10 = 2 % 2;
                } else {
                    str12 = str8;
                }
                this(str13, str14, str10, str15, str16, str11, str17, str12, (i & 256) == 0 ? str9 : null);
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 89;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                String str = this.id;
                int i4 = i3 + 109;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String asInterface() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 7;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                String str = this.title;
                int i5 = i3 + 45;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 123;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                String str = this.subTitle;
                if (i3 == 0) {
                    int i4 = 1 / 0;
                }
                return str;
            }

            public final String IAuthTabCallbackStubProxy() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 65;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                String str = this.imageUrl;
                if (i3 == 0) {
                    int i4 = 10 / 0;
                }
                return str;
            }

            public final String onTransact() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 95;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                String str = this.imageAlt;
                int i5 = i3 + 121;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final String asBinder() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 105;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                String str = this.ctaText;
                if (i3 == 0) {
                    int i4 = 45 / 0;
                }
                return str;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 103;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.landingUrl;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final String IAuthTabCallbackDefault() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 65;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.adClearanceText;
                }
                throw null;
            }
        }

        @nc(IAuthTabCallback = "styleId")
        @liq
        public static final class ThumbnailBanner extends Creative {
            public static final int $stable = 0;
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted = 1;
            private final String adClearanceText;
            private final String brandLogoUrl;
            private final String id;
            private final String landingUrl;
            private final String mainImageUrl;
            private final String subTitle;
            private final String thumbnailImageUrl;
            private final String title;
            private final String videoUrl;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<ThumbnailBanner> CREATOR = new onNavigationEvent();

            public static final class onNavigationEvent implements Parcelable.Creator<ThumbnailBanner> {
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final ThumbnailBanner[] IAuthTabCallback(int i) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 105;
                    int i4 = i3 % 128;
                    onExtraCallback = i4;
                    int i5 = i3 % 2;
                    ThumbnailBanner[] thumbnailBannerArr = new ThumbnailBanner[i];
                    int i6 = i4 + 17;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    return thumbnailBannerArr;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ ThumbnailBanner createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 53;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        onNavigationEvent(parcel);
                        throw null;
                    }
                    ThumbnailBanner thumbnailBannerOnNavigationEvent = onNavigationEvent(parcel);
                    int i3 = onWarmupCompleted + 79;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return thumbnailBannerOnNavigationEvent;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ ThumbnailBanner[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 101;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        return IAuthTabCallback(i);
                    }
                    IAuthTabCallback(i);
                    throw null;
                }

                public final ThumbnailBanner onNavigationEvent(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    ThumbnailBanner thumbnailBanner = new ThumbnailBanner(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    int i2 = onExtraCallback + 107;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        return thumbnailBanner;
                    }
                    throw null;
                }
            }

            static {
                int i = onExtraCallbackWithResult + 77;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            public ThumbnailBanner() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
            }

            private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
                String str = (String) objArr[1];
                String str2 = (String) objArr[2];
                String str3 = (String) objArr[3];
                String str4 = (String) objArr[4];
                String str5 = (String) objArr[5];
                String str6 = (String) objArr[6];
                String str7 = (String) objArr[7];
                String str8 = (String) objArr[8];
                String str9 = (String) objArr[9];
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str8, "");
                ThumbnailBanner thumbnailBanner = new ThumbnailBanner(str, str2, str3, str4, str5, str6, str7, str8, str9);
                int i2 = onExtraCallback + 9;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return thumbnailBanner;
                }
                throw null;
            }

            public static /* synthetic */ ThumbnailBanner onExtraCallback(ThumbnailBanner thumbnailBanner, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
                String str10;
                String str11;
                String str12;
                String str13;
                int i2 = 2 % 2;
                int i3 = onExtraCallback;
                int i4 = i3 + 119;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                String str14 = (i & 1) != 0 ? thumbnailBanner.id : str;
                if ((i & 2) != 0) {
                    str10 = thumbnailBanner.mainImageUrl;
                    int i6 = i3 + 5;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    str10 = str2;
                }
                String str15 = (i & 4) != 0 ? thumbnailBanner.thumbnailImageUrl : str3;
                if ((i & 8) != 0) {
                    int i8 = onWarmupCompleted + 95;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    str11 = thumbnailBanner.videoUrl;
                } else {
                    str11 = str4;
                }
                String str16 = (i & 16) != 0 ? thumbnailBanner.landingUrl : str5;
                String str17 = (i & 32) != 0 ? thumbnailBanner.title : str6;
                String str18 = (i & 64) != 0 ? thumbnailBanner.subTitle : str7;
                if ((i & 128) != 0) {
                    str12 = thumbnailBanner.brandLogoUrl;
                    int i10 = onWarmupCompleted + 59;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    str12 = str8;
                }
                if ((i & 256) != 0) {
                    int i12 = onWarmupCompleted + 119;
                    onExtraCallback = i12 % 128;
                    if (i12 % 2 != 0) {
                        str13 = thumbnailBanner.adClearanceText;
                        int i13 = 9 / 0;
                    } else {
                        str13 = thumbnailBanner.adClearanceText;
                    }
                } else {
                    str13 = str9;
                }
                return (ThumbnailBanner) onExtraCallback(480728175, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{thumbnailBanner, str14, str10, str15, str11, str16, str17, str18, str12, str13}, -480728175);
            }

            public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
                int i7 = ~i6;
                int i8 = ~i2;
                int i9 = ~(i7 | i8);
                int i10 = ~(i | i2);
                int i11 = i9 | i10;
                int i12 = i9 | (~(i6 | i2)) | i10;
                int i13 = (~(i2 | i6 | i)) | (~(i8 | (~i)));
                int i14 = i6 + i + i4 + ((-2005657349) * i3) + (1476006321 * i5);
                int i15 = i14 * i14;
                int i16 = ((583353605 * i6) - 1319501824) + (407026429 * i) + ((-176327176) * i11) + (i12 * (-2059320060)) + ((-2059320060) * i13) + ((-1652293632) * i4) + ((-798228480) * i3) + ((-1404829696) * i5) + ((-1043726336) * i15);
                int i17 = (i6 * 961754349) + 784684277 + (i * 961754277) + (i11 * (-72)) + (i12 * 36) + (i13 * 36) + (i4 * 961754313) + (i3 * (-1264871149)) + (i5 * 72538105) + (i15 * 798621696);
                return i16 + ((i17 * i17) * (-1437204480)) != 1 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 107;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onWarmupCompleted + 125;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(obj instanceof ThumbnailBanner)) {
                    int i4 = onWarmupCompleted + 49;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                ThumbnailBanner thumbnailBanner = (ThumbnailBanner) obj;
                if (!Intrinsics.areEqual(this.id, thumbnailBanner.id)) {
                    int i6 = onWarmupCompleted + 51;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.mainImageUrl, thumbnailBanner.mainImageUrl) || !Intrinsics.areEqual(this.thumbnailImageUrl, thumbnailBanner.thumbnailImageUrl) || !Intrinsics.areEqual(this.videoUrl, thumbnailBanner.videoUrl)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.landingUrl, thumbnailBanner.landingUrl)) {
                    int i8 = onExtraCallback + 59;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.title, thumbnailBanner.title)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.subTitle, thumbnailBanner.subTitle)) {
                    int i10 = onExtraCallback + 5;
                    onWarmupCompleted = i10 % 128;
                    return i10 % 2 == 0;
                }
                if (Intrinsics.areEqual(this.brandLogoUrl, thumbnailBanner.brandLogoUrl)) {
                    return Intrinsics.areEqual(this.adClearanceText, thumbnailBanner.adClearanceText);
                }
                int i11 = onExtraCallback + 85;
                onWarmupCompleted = i11 % 128;
                return i11 % 2 == 0;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 59;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.id.hashCode();
                int iHashCode2 = this.mainImageUrl.hashCode();
                String str = this.thumbnailImageUrl;
                int iHashCode3 = 0;
                int iHashCode4 = str == null ? 0 : str.hashCode();
                int iHashCode5 = this.videoUrl.hashCode();
                int iHashCode6 = this.landingUrl.hashCode();
                int iHashCode7 = this.title.hashCode();
                int iHashCode8 = this.subTitle.hashCode();
                int iHashCode9 = this.brandLogoUrl.hashCode();
                String str2 = this.adClearanceText;
                if (str2 != null) {
                    int i4 = onWarmupCompleted + 103;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int iHashCode10 = str2.hashCode();
                        int i5 = 63 / 0;
                        iHashCode3 = iHashCode10;
                    } else {
                        iHashCode3 = str2.hashCode();
                    }
                }
                return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode3;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "ThumbnailBanner(id=" + this.id + ", mainImageUrl=" + this.mainImageUrl + ", thumbnailImageUrl=" + this.thumbnailImageUrl + ", videoUrl=" + this.videoUrl + ", landingUrl=" + this.landingUrl + ", title=" + this.title + ", subTitle=" + this.subTitle + ", brandLogoUrl=" + this.brandLogoUrl + ", adClearanceText=" + this.adClearanceText + ")";
                int i2 = onExtraCallback + 43;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 14 / 0;
                }
                return str;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 43;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.id);
                parcel.writeString(this.mainImageUrl);
                parcel.writeString(this.thumbnailImageUrl);
                parcel.writeString(this.videoUrl);
                parcel.writeString(this.landingUrl);
                parcel.writeString(this.title);
                parcel.writeString(this.subTitle);
                parcel.writeString(this.brandLogoUrl);
                parcel.writeString(this.adClearanceText);
                int i5 = onWarmupCompleted + 123;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            public static final class Companion {
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<ThumbnailBanner> serializer() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 59;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    NativeAdsDto$Creative$ThumbnailBanner$$serializer nativeAdsDto$Creative$ThumbnailBanner$$serializer = NativeAdsDto$Creative$ThumbnailBanner$$serializer.INSTANCE;
                    if (i3 != 0) {
                        int i4 = 43 / 0;
                    }
                    return nativeAdsDto$Creative$ThumbnailBanner$$serializer;
                }
            }

            public /* synthetic */ ThumbnailBanner(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, okycx okycxVar) {
                super(i, okycxVar);
                if ((i & 1) == 0) {
                    this.id = "";
                    int i2 = 2 % 2;
                } else {
                    this.id = str;
                }
                if ((i & 2) == 0) {
                    this.mainImageUrl = "";
                } else {
                    this.mainImageUrl = str2;
                }
                if ((i & 4) == 0) {
                    int i3 = onExtraCallback + 25;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    this.thumbnailImageUrl = null;
                    if (i4 == 0) {
                        throw null;
                    }
                } else {
                    this.thumbnailImageUrl = str3;
                }
                if ((i & 8) == 0) {
                    this.videoUrl = "";
                } else {
                    this.videoUrl = str4;
                    int i5 = onExtraCallback + 105;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                }
                if ((i & 16) == 0) {
                    this.landingUrl = "";
                    int i8 = 2 % 2;
                } else {
                    this.landingUrl = str5;
                }
                if ((i & 32) == 0) {
                    this.title = "";
                } else {
                    this.title = str6;
                }
                if ((i & 64) == 0) {
                    this.subTitle = "";
                } else {
                    this.subTitle = str7;
                }
                if ((i & 128) == 0) {
                    int i9 = onExtraCallback + 43;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    this.brandLogoUrl = "";
                } else {
                    this.brandLogoUrl = str8;
                    int i11 = 2 % 2;
                }
                if ((i & 256) == 0) {
                    this.adClearanceText = null;
                } else {
                    this.adClearanceText = str9;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThumbnailBanner(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @Nullable String str9) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str8, "");
                this.id = str;
                this.mainImageUrl = str2;
                this.thumbnailImageUrl = str3;
                this.videoUrl = str4;
                this.landingUrl = str5;
                this.title = str6;
                this.subTitle = str7;
                this.brandLogoUrl = str8;
                this.adClearanceText = str9;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0115  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
                ThumbnailBanner thumbnailBanner = (ThumbnailBanner) objArr[0];
                vyl vylVar = (vyl) objArr[1];
                SerialDescriptor serialDescriptor = (SerialDescriptor) objArr[2];
                int i = 2 % 2;
                int i2 = onExtraCallback + 21;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                    vylVar.onExtraCallback(serialDescriptor, 0, thumbnailBanner.IAuthTabCallback());
                } else if (!Intrinsics.areEqual(thumbnailBanner.IAuthTabCallback(), "")) {
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                    int i3 = onWarmupCompleted + 65;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    if (!Intrinsics.areEqual(thumbnailBanner.mainImageUrl, "")) {
                        vylVar.onExtraCallback(serialDescriptor, 1, thumbnailBanner.mainImageUrl);
                    }
                }
                Object obj = null;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                    int i5 = onWarmupCompleted + 77;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        String str = thumbnailBanner.thumbnailImageUrl;
                        throw null;
                    }
                    if (thumbnailBanner.thumbnailImageUrl != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, thumbnailBanner.thumbnailImageUrl);
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                    int i6 = onExtraCallback + 121;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 == 0) {
                        Intrinsics.areEqual(thumbnailBanner.videoUrl, "");
                        obj.hashCode();
                        throw null;
                    }
                    if (!Intrinsics.areEqual(thumbnailBanner.videoUrl, "")) {
                        vylVar.onExtraCallback(serialDescriptor, 3, thumbnailBanner.videoUrl);
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(thumbnailBanner.onWarmupCompleted(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 4, thumbnailBanner.onWarmupCompleted());
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 5) || !Intrinsics.areEqual(thumbnailBanner.asInterface(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 5, thumbnailBanner.asInterface());
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 6) || !Intrinsics.areEqual(thumbnailBanner.IAuthTabCallbackStub(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 6, thumbnailBanner.IAuthTabCallbackStub());
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 7) || !Intrinsics.areEqual(thumbnailBanner.brandLogoUrl, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 7, thumbnailBanner.brandLogoUrl);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 8)) {
                    int i7 = onExtraCallback + 65;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    if (thumbnailBanner.adClearanceText != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, thumbnailBanner.adClearanceText);
                        int i9 = onExtraCallback + 119;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                    }
                }
                return null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ ThumbnailBanner(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str10;
                String str11;
                String str12;
                String str13;
                String str14 = (i & 1) != 0 ? "" : str;
                String str15 = null;
                if ((i & 2) != 0) {
                    int i2 = onWarmupCompleted + 15;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    str10 = "";
                } else {
                    str10 = str2;
                }
                if ((i & 4) != 0) {
                    int i3 = 2 % 2;
                    str11 = null;
                } else {
                    str11 = str3;
                }
                if ((i & 8) != 0) {
                    int i4 = 2 % 2;
                    str12 = "";
                } else {
                    str12 = str4;
                }
                String str16 = (i & 16) != 0 ? "" : str5;
                String str17 = (i & 32) != 0 ? "" : str6;
                if ((i & 64) != 0) {
                    int i5 = onWarmupCompleted + 121;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    str13 = "";
                } else {
                    str13 = str7;
                }
                String str18 = (i & 128) == 0 ? str8 : "";
                if ((i & 256) != 0) {
                    int i7 = onExtraCallback + 39;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 7 / 0;
                    }
                } else {
                    str15 = str9;
                }
                this(str14, str10, str11, str12, str16, str17, str13, str18, str15);
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 103;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.id;
                }
                throw null;
            }

            public final String onTransact() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 107;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                String str = this.mainImageUrl;
                int i5 = i3 + 51;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final String access100() {
                String str;
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 115;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    str = this.thumbnailImageUrl;
                    int i4 = 69 / 0;
                } else {
                    str = this.thumbnailImageUrl;
                }
                int i5 = i2 + 33;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final String getInterfaceDescriptor() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 51;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                String str = this.videoUrl;
                int i5 = i2 + 7;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 93;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                String str = this.landingUrl;
                if (i3 == 0) {
                    int i4 = 67 / 0;
                }
                return str;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String asInterface() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 97;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.title;
                }
                throw null;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 25;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                String str = this.subTitle;
                int i5 = i2 + 65;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final String IAuthTabCallbackDefault() {
                String str;
                int i = 2 % 2;
                int i2 = onExtraCallback + 67;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                if (i2 % 2 == 0) {
                    str = this.brandLogoUrl;
                    int i4 = 55 / 0;
                } else {
                    str = this.brandLogoUrl;
                }
                int i5 = i3 + 17;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            public final String asBinder() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 35;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                String str = this.adClearanceText;
                int i5 = i3 + 13;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @JvmStatic
            public static final /* synthetic */ void onWarmupCompleted(ThumbnailBanner thumbnailBanner, vyl vylVar, SerialDescriptor serialDescriptor) {
                int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                onExtraCallback(-1262102819, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{thumbnailBanner, vylVar, serialDescriptor}, 1262102820);
            }

            public final ThumbnailBanner onWarmupCompleted(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @Nullable String str9) {
                Object[] objArr = {this, str, str2, str3, str4, str5, str6, str7, str8, str9};
                return (ThumbnailBanner) onExtraCallback(480728175, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr, -480728175);
            }
        }

        @nc(IAuthTabCallback = "styleId")
        @liq
        public static final class ThumbnailVideo extends Creative {
            public static final int $stable = 0;
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            private final String adClearanceText;
            private final String brandLogoUrl;
            private final String id;
            private final String landingUrl;
            private final String mainImageUrl;
            private final String subTitle;
            private final String thumbnailImageUrl;
            private final String title;
            private final String videoUrl;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<ThumbnailVideo> CREATOR = new onExtraCallback();

            public static final class onExtraCallback implements Parcelable.Creator<ThumbnailVideo> {
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ ThumbnailVideo createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 43;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    ThumbnailVideo thumbnailVideoOnNavigationEvent = onNavigationEvent(parcel);
                    int i4 = onExtraCallback + 83;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return thumbnailVideoOnNavigationEvent;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ ThumbnailVideo[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 61;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        return onExtraCallbackWithResult(i);
                    }
                    onExtraCallbackWithResult(i);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final ThumbnailVideo[] onExtraCallbackWithResult(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 117;
                    int i4 = i3 % 128;
                    onNavigationEvent = i4;
                    int i5 = i3 % 2;
                    ThumbnailVideo[] thumbnailVideoArr = new ThumbnailVideo[i];
                    int i6 = i4 + 17;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return thumbnailVideoArr;
                }

                public final ThumbnailVideo onNavigationEvent(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    ThumbnailVideo thumbnailVideo = new ThumbnailVideo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    int i2 = onNavigationEvent + 35;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return thumbnailVideo;
                }
            }

            static {
                int i = IAuthTabCallback + 43;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            public ThumbnailVideo() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 65;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ThumbnailVideo)) {
                    return false;
                }
                ThumbnailVideo thumbnailVideo = (ThumbnailVideo) obj;
                if (!Intrinsics.areEqual(this.id, thumbnailVideo.id)) {
                    int i2 = onNavigationEvent + 81;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        return false;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (!Intrinsics.areEqual(this.mainImageUrl, thumbnailVideo.mainImageUrl)) {
                    int i3 = onExtraCallbackWithResult + 17;
                    onNavigationEvent = i3 % 128;
                    return i3 % 2 == 0;
                }
                if (!Intrinsics.areEqual(this.thumbnailImageUrl, thumbnailVideo.thumbnailImageUrl)) {
                    int i4 = onNavigationEvent + 47;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 83 / 0;
                    }
                    return false;
                }
                if (!Intrinsics.areEqual(this.videoUrl, thumbnailVideo.videoUrl)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.landingUrl, thumbnailVideo.landingUrl)) {
                    int i6 = onNavigationEvent + 39;
                    onExtraCallbackWithResult = i6 % 128;
                    return i6 % 2 != 0;
                }
                if (!Intrinsics.areEqual(this.title, thumbnailVideo.title) || !Intrinsics.areEqual(this.subTitle, thumbnailVideo.subTitle) || !Intrinsics.areEqual(this.brandLogoUrl, thumbnailVideo.brandLogoUrl)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.adClearanceText, thumbnailVideo.adClearanceText)) {
                    return true;
                }
                int i7 = onExtraCallbackWithResult + 49;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int iHashCode2;
                String str;
                int iHashCode3;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 73;
                onExtraCallbackWithResult = i2 % 128;
                int iHashCode4 = 0;
                if (i2 % 2 != 0) {
                    iHashCode = this.id.hashCode();
                    iHashCode2 = this.mainImageUrl.hashCode();
                    str = this.thumbnailImageUrl;
                    iHashCode3 = 1;
                    if (str != null) {
                        iHashCode4 = 1;
                        iHashCode3 = iHashCode4;
                        iHashCode4 = str.hashCode();
                    }
                } else {
                    iHashCode = this.id.hashCode();
                    iHashCode2 = this.mainImageUrl.hashCode();
                    str = this.thumbnailImageUrl;
                    if (str == null) {
                        iHashCode3 = 0;
                    } else {
                        iHashCode3 = iHashCode4;
                        iHashCode4 = str.hashCode();
                    }
                }
                int iHashCode5 = this.videoUrl.hashCode();
                int iHashCode6 = this.landingUrl.hashCode();
                int iHashCode7 = this.title.hashCode();
                int iHashCode8 = this.subTitle.hashCode();
                int iHashCode9 = this.brandLogoUrl.hashCode();
                String str2 = this.adClearanceText;
                if (str2 != null) {
                    int i3 = onNavigationEvent + 91;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        str2.hashCode();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    iHashCode3 = str2.hashCode();
                }
                int i4 = (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode3;
                int i5 = onNavigationEvent + 81;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return i4;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "ThumbnailVideo(id=" + this.id + ", mainImageUrl=" + this.mainImageUrl + ", thumbnailImageUrl=" + this.thumbnailImageUrl + ", videoUrl=" + this.videoUrl + ", landingUrl=" + this.landingUrl + ", title=" + this.title + ", subTitle=" + this.subTitle + ", brandLogoUrl=" + this.brandLogoUrl + ", adClearanceText=" + this.adClearanceText + ")";
                int i2 = onExtraCallbackWithResult + 51;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 89;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.id);
                parcel.writeString(this.mainImageUrl);
                parcel.writeString(this.thumbnailImageUrl);
                parcel.writeString(this.videoUrl);
                parcel.writeString(this.landingUrl);
                parcel.writeString(this.title);
                parcel.writeString(this.subTitle);
                parcel.writeString(this.brandLogoUrl);
                parcel.writeString(this.adClearanceText);
                int i5 = onNavigationEvent + 13;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }

            public static final class Companion {
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<ThumbnailVideo> serializer() {
                    NativeAdsDto$Creative$ThumbnailVideo$$serializer nativeAdsDto$Creative$ThumbnailVideo$$serializer;
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 31;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        nativeAdsDto$Creative$ThumbnailVideo$$serializer = NativeAdsDto$Creative$ThumbnailVideo$$serializer.INSTANCE;
                        int i3 = 43 / 0;
                    } else {
                        nativeAdsDto$Creative$ThumbnailVideo$$serializer = NativeAdsDto$Creative$ThumbnailVideo$$serializer.INSTANCE;
                    }
                    int i4 = onExtraCallback + 5;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return nativeAdsDto$Creative$ThumbnailVideo$$serializer;
                }
            }

            public /* synthetic */ ThumbnailVideo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, okycx okycxVar) {
                super(i, okycxVar);
                if ((i & 1) == 0) {
                    this.id = "";
                } else {
                    this.id = str;
                }
                if ((i & 2) == 0) {
                    this.mainImageUrl = "";
                    int i2 = onNavigationEvent + 103;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                } else {
                    this.mainImageUrl = str2;
                }
                Object obj = null;
                if ((i & 4) == 0) {
                    int i5 = onExtraCallbackWithResult + 89;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    this.thumbnailImageUrl = null;
                    if (i6 == 0) {
                        throw null;
                    }
                } else {
                    this.thumbnailImageUrl = str3;
                }
                if ((i & 8) == 0) {
                    this.videoUrl = "";
                } else {
                    this.videoUrl = str4;
                }
                if ((i & 16) == 0) {
                    int i7 = onExtraCallbackWithResult + 123;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    this.landingUrl = "";
                    if (i8 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                } else {
                    this.landingUrl = str5;
                }
                int i9 = 2 % 2;
                if ((i & 32) == 0) {
                    this.title = "";
                } else {
                    this.title = str6;
                    int i10 = 2 % 2;
                }
                if ((i & 64) == 0) {
                    this.subTitle = "";
                } else {
                    this.subTitle = str7;
                }
                if ((i & 128) == 0) {
                    this.brandLogoUrl = "";
                } else {
                    this.brandLogoUrl = str8;
                }
                if ((i & 256) != 0) {
                    this.adClearanceText = str9;
                    return;
                }
                int i11 = onExtraCallbackWithResult + 73;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                this.adClearanceText = null;
                if (i12 == 0) {
                    int i13 = 46 / 0;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThumbnailVideo(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @Nullable String str9) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str8, "");
                this.id = str;
                this.mainImageUrl = str2;
                this.thumbnailImageUrl = str3;
                this.videoUrl = str4;
                this.landingUrl = str5;
                this.title = str6;
                this.subTitle = str7;
                this.brandLogoUrl = str8;
                this.adClearanceText = str9;
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void onWarmupCompleted(ThumbnailVideo thumbnailVideo, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 123;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(thumbnailVideo.IAuthTabCallback(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 0, thumbnailVideo.IAuthTabCallback());
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(thumbnailVideo.mainImageUrl, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 1, thumbnailVideo.mainImageUrl);
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 2) || thumbnailVideo.thumbnailImageUrl != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, thumbnailVideo.thumbnailImageUrl);
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(thumbnailVideo.videoUrl, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 3, thumbnailVideo.videoUrl);
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(thumbnailVideo.onWarmupCompleted(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 4, thumbnailVideo.onWarmupCompleted());
                    int i4 = onExtraCallbackWithResult + 87;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 2 / 5;
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
                    int i6 = onExtraCallbackWithResult + 121;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    if (!Intrinsics.areEqual(thumbnailVideo.asInterface(), "")) {
                        vylVar.onExtraCallback(serialDescriptor, 5, thumbnailVideo.asInterface());
                    }
                }
                if (!(!vylVar.onWarmupCompleted(serialDescriptor, 6)) || !Intrinsics.areEqual(thumbnailVideo.IAuthTabCallbackStub(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 6, thumbnailVideo.IAuthTabCallbackStub());
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 7) || !Intrinsics.areEqual(thumbnailVideo.brandLogoUrl, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 7, thumbnailVideo.brandLogoUrl);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 8)) {
                    int i8 = onExtraCallbackWithResult + 9;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 == 0) {
                        String str = thumbnailVideo.adClearanceText;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (thumbnailVideo.adClearanceText == null) {
                        return;
                    }
                }
                vylVar.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, thumbnailVideo.adClearanceText);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ ThumbnailVideo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str10;
                String str11;
                String str12;
                String str13;
                String str14 = "";
                String str15 = (i & 1) != 0 ? "" : str;
                String str16 = (i & 2) != 0 ? "" : str2;
                if ((i & 4) != 0) {
                    int i2 = 2 % 2;
                    str10 = null;
                } else {
                    str10 = str3;
                }
                String str17 = (i & 8) != 0 ? "" : str4;
                if ((i & 16) != 0) {
                    int i3 = onNavigationEvent + 45;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        str.hashCode();
                        throw null;
                    }
                    int i4 = 2 % 2;
                    str11 = "";
                } else {
                    str11 = str5;
                }
                if ((i & 32) != 0) {
                    int i5 = onExtraCallbackWithResult + 17;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 2 % 2;
                    }
                    str12 = "";
                } else {
                    str12 = str6;
                }
                if ((i & 64) != 0) {
                    int i7 = onExtraCallbackWithResult + 31;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        str.hashCode();
                        throw null;
                    }
                    int i8 = 2 % 2;
                    str13 = "";
                } else {
                    str13 = str7;
                }
                if ((i & 128) != 0) {
                    int i9 = 2 % 2;
                } else {
                    str14 = str8;
                }
                this(str15, str16, str10, str17, str11, str12, str13, str14, (i & 256) == 0 ? str9 : null);
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 79;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                String str = this.id;
                int i5 = i2 + 29;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 79;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                String str = this.landingUrl;
                int i5 = i3 + 19;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String asInterface() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 49;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.title;
                }
                throw null;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 109;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                String str = this.subTitle;
                int i5 = i2 + 105;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final ThumbnailBanner IAuthTabCallbackDefault() {
                int i = 2 % 2;
                ThumbnailBanner thumbnailBanner = new ThumbnailBanner(IAuthTabCallback(), this.mainImageUrl, this.thumbnailImageUrl, this.videoUrl, onWarmupCompleted(), asInterface(), IAuthTabCallbackStub(), this.brandLogoUrl, this.adClearanceText);
                int i2 = onExtraCallbackWithResult + 119;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 28 / 0;
                }
                return thumbnailBanner;
            }
        }

        @nc(IAuthTabCallback = "styleId")
        @liq
        public static final class TossstreamLongFormVideo extends Creative {
            public static final int $stable = 0;
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;
            private static int onWarmupCompleted;
            private final String adClearanceText;
            private final double autoPlayDelaySec;
            private final String id;
            private final String landingUrl;
            private final String ratio;
            private final String subTitle;
            private final String thumbnailImageUrl;
            private final String title;
            private final String videoUrl;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<TossstreamLongFormVideo> CREATOR = new onWarmupCompleted();

            public static final class onWarmupCompleted implements Parcelable.Creator<TossstreamLongFormVideo> {
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final TossstreamLongFormVideo[] IAuthTabCallback(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 107;
                    int i4 = i3 % 128;
                    onWarmupCompleted = i4;
                    int i5 = i3 % 2;
                    TossstreamLongFormVideo[] tossstreamLongFormVideoArr = new TossstreamLongFormVideo[i];
                    int i6 = i4 + 59;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        return tossstreamLongFormVideoArr;
                    }
                    throw null;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ TossstreamLongFormVideo createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 75;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    TossstreamLongFormVideo tossstreamLongFormVideoOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
                    int i4 = onWarmupCompleted + 95;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return tossstreamLongFormVideoOnExtraCallbackWithResult;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ TossstreamLongFormVideo[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 125;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    TossstreamLongFormVideo[] tossstreamLongFormVideoArrIAuthTabCallback = IAuthTabCallback(i);
                    int i5 = onWarmupCompleted + 111;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return tossstreamLongFormVideoArrIAuthTabCallback;
                }

                public final TossstreamLongFormVideo onExtraCallbackWithResult(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    TossstreamLongFormVideo tossstreamLongFormVideo = new TossstreamLongFormVideo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString());
                    int i2 = onExtraCallbackWithResult + 75;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        return tossstreamLongFormVideo;
                    }
                    throw null;
                }
            }

            static {
                int i = IAuthTabCallback + 101;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            public TossstreamLongFormVideo() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, 0.0d, (String) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 67;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 55;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 39 / 0;
                }
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TossstreamLongFormVideo)) {
                    int i2 = onExtraCallback + 51;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                TossstreamLongFormVideo tossstreamLongFormVideo = (TossstreamLongFormVideo) obj;
                if (!Intrinsics.areEqual(this.id, tossstreamLongFormVideo.id)) {
                    int i4 = onExtraCallback + 117;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.title, tossstreamLongFormVideo.title)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.subTitle, tossstreamLongFormVideo.subTitle)) {
                    int i6 = onNavigationEvent + 51;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.thumbnailImageUrl, tossstreamLongFormVideo.thumbnailImageUrl) || (!Intrinsics.areEqual(this.videoUrl, tossstreamLongFormVideo.videoUrl)) || Double.compare(this.autoPlayDelaySec, tossstreamLongFormVideo.autoPlayDelaySec) != 0 || !Intrinsics.areEqual(this.landingUrl, tossstreamLongFormVideo.landingUrl)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.adClearanceText, tossstreamLongFormVideo.adClearanceText)) {
                    int i8 = onNavigationEvent + 51;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.ratio, tossstreamLongFormVideo.ratio)) {
                    return true;
                }
                int i10 = onExtraCallback + 69;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 11;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode2 = this.id.hashCode();
                int iHashCode3 = this.title.hashCode();
                int iHashCode4 = this.subTitle.hashCode();
                int iHashCode5 = this.thumbnailImageUrl.hashCode();
                int iHashCode6 = this.videoUrl.hashCode();
                int iHashCode7 = Double.hashCode(this.autoPlayDelaySec);
                int iHashCode8 = this.landingUrl.hashCode();
                String str = this.adClearanceText;
                if (str == null) {
                    int i4 = onExtraCallback + 83;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = str.hashCode();
                }
                String str2 = this.ratio;
                return (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                int i = 2 % 2;
                String str = "TossstreamLongFormVideo(id=" + this.id + ", title=" + this.title + ", subTitle=" + this.subTitle + ", thumbnailImageUrl=" + this.thumbnailImageUrl + ", videoUrl=" + this.videoUrl + ", autoPlayDelaySec=" + this.autoPlayDelaySec + ", landingUrl=" + this.landingUrl + ", adClearanceText=" + this.adClearanceText + ", ratio=" + this.ratio + ")";
                int i2 = onNavigationEvent + 77;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 21;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.id);
                parcel.writeString(this.title);
                parcel.writeString(this.subTitle);
                parcel.writeString(this.thumbnailImageUrl);
                parcel.writeString(this.videoUrl);
                parcel.writeDouble(this.autoPlayDelaySec);
                parcel.writeString(this.landingUrl);
                parcel.writeString(this.adClearanceText);
                parcel.writeString(this.ratio);
                int i5 = onNavigationEvent + 77;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }

            public static final class Companion {
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<TossstreamLongFormVideo> serializer() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 95;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    NativeAdsDto$Creative$TossstreamLongFormVideo$$serializer nativeAdsDto$Creative$TossstreamLongFormVideo$$serializer = NativeAdsDto$Creative$TossstreamLongFormVideo$$serializer.INSTANCE;
                    if (i3 == 0) {
                        return nativeAdsDto$Creative$TossstreamLongFormVideo$$serializer;
                    }
                    throw null;
                }
            }

            public /* synthetic */ TossstreamLongFormVideo(int i, String str, String str2, String str3, String str4, String str5, double d, String str6, String str7, String str8, okycx okycxVar) {
                super(i, okycxVar);
                if ((i & 1) == 0) {
                    this.id = "";
                } else {
                    this.id = str;
                    int i2 = 2 % 2;
                }
                if ((i & 2) == 0) {
                    int i3 = onNavigationEvent + 35;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    this.title = "";
                    if (i4 == 0) {
                        int i5 = 37 / 0;
                    }
                } else {
                    this.title = str2;
                }
                if ((i & 4) == 0) {
                    int i6 = onNavigationEvent + 1;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    this.subTitle = "";
                    int i8 = 2 % 2;
                } else {
                    this.subTitle = str3;
                }
                if ((i & 8) == 0) {
                    this.thumbnailImageUrl = "";
                    int i9 = 2 % 2;
                } else {
                    this.thumbnailImageUrl = str4;
                }
                if ((i & 16) == 0) {
                    this.videoUrl = "";
                    int i10 = onNavigationEvent + 91;
                    onExtraCallback = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 2 % 2;
                    }
                } else {
                    this.videoUrl = str5;
                }
                if ((i & 32) == 0) {
                    this.autoPlayDelaySec = 0.0d;
                    int i12 = 2 % 2;
                } else {
                    this.autoPlayDelaySec = d;
                }
                if ((i & 64) == 0) {
                    this.landingUrl = "";
                } else {
                    this.landingUrl = str6;
                }
                if ((i & 128) == 0) {
                    this.adClearanceText = null;
                } else {
                    this.adClearanceText = str7;
                }
                if ((i & 256) == 0) {
                    this.ratio = null;
                } else {
                    this.ratio = str8;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TossstreamLongFormVideo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, double d, @NotNull String str6, @Nullable String str7, @Nullable String str8) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                this.id = str;
                this.title = str2;
                this.subTitle = str3;
                this.thumbnailImageUrl = str4;
                this.videoUrl = str5;
                this.autoPlayDelaySec = d;
                this.landingUrl = str6;
                this.adClearanceText = str7;
                this.ratio = str8;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x00f4  */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void onNavigationEvent(TossstreamLongFormVideo tossstreamLongFormVideo, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(tossstreamLongFormVideo.IAuthTabCallback(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 0, tossstreamLongFormVideo.IAuthTabCallback());
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                    int i2 = onNavigationEvent + 81;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    if (!Intrinsics.areEqual(tossstreamLongFormVideo.asInterface(), "")) {
                        vylVar.onExtraCallback(serialDescriptor, 1, tossstreamLongFormVideo.asInterface());
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                    int i4 = onNavigationEvent + 7;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 89 / 0;
                        if (!Intrinsics.areEqual(tossstreamLongFormVideo.IAuthTabCallbackStub(), "")) {
                            vylVar.onExtraCallback(serialDescriptor, 2, tossstreamLongFormVideo.IAuthTabCallbackStub());
                        }
                    } else if (!Intrinsics.areEqual(tossstreamLongFormVideo.IAuthTabCallbackStub(), "")) {
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(tossstreamLongFormVideo.thumbnailImageUrl, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 3, tossstreamLongFormVideo.thumbnailImageUrl);
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(tossstreamLongFormVideo.videoUrl, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 4, tossstreamLongFormVideo.videoUrl);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
                    int i6 = onExtraCallback + 19;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    double d = tossstreamLongFormVideo.autoPlayDelaySec;
                    if (i7 == 0 ? Double.compare(d, 0.0d) != 0 : Double.compare(d, 0.0d) != 0) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 5, tossstreamLongFormVideo.autoPlayDelaySec);
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 6) || !Intrinsics.areEqual(tossstreamLongFormVideo.onWarmupCompleted(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 6, tossstreamLongFormVideo.onWarmupCompleted());
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
                    int i8 = onNavigationEvent + 87;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        String str = tossstreamLongFormVideo.adClearanceText;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (tossstreamLongFormVideo.adClearanceText != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, tossstreamLongFormVideo.adClearanceText);
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 8)) {
                    int i9 = onNavigationEvent + 87;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    if (tossstreamLongFormVideo.ratio == null) {
                        return;
                    }
                }
                vylVar.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, tossstreamLongFormVideo.ratio);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ TossstreamLongFormVideo(String str, String str2, String str3, String str4, String str5, double d, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str9;
                String str10;
                String str11;
                String str12;
                String str13;
                double d2;
                String str14;
                String str15 = "";
                if ((i & 1) != 0) {
                    int i2 = onExtraCallback + 13;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    str9 = "";
                } else {
                    str9 = str;
                }
                if ((i & 2) != 0) {
                    int i4 = 2 % 2;
                    str10 = "";
                } else {
                    str10 = str2;
                }
                if ((i & 4) != 0) {
                    int i5 = 2 % 2;
                    str11 = "";
                } else {
                    str11 = str3;
                }
                if ((i & 8) != 0) {
                    int i6 = 2 % 2;
                    str12 = "";
                } else {
                    str12 = str4;
                }
                if ((i & 16) != 0) {
                    int i7 = onExtraCallback + 3;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    str13 = "";
                } else {
                    str13 = str5;
                }
                if ((i & 32) != 0) {
                    int i9 = onExtraCallback;
                    int i10 = i9 + 39;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = i9 + 61;
                    onNavigationEvent = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 2 % 2;
                    }
                    d2 = 0.0d;
                } else {
                    d2 = d;
                }
                if ((i & 64) != 0) {
                    int i14 = onExtraCallback + 9;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                } else {
                    str15 = str6;
                }
                String str16 = null;
                if ((i & 128) != 0) {
                    int i16 = onNavigationEvent + 9;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    int i18 = 2 % 2;
                    str14 = null;
                } else {
                    str14 = str7;
                }
                if ((i & 256) != 0) {
                    int i19 = onExtraCallback + 9;
                    onNavigationEvent = i19 % 128;
                    if (i19 % 2 != 0) {
                        str16.hashCode();
                        throw null;
                    }
                } else {
                    str16 = str8;
                }
                this(str9, str10, str11, str12, str13, d2, str15, str14, str16);
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 51;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                String str = this.id;
                int i5 = i2 + 113;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String asInterface() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 107;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.title;
                }
                throw null;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 81;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                String str = this.subTitle;
                if (i3 != 0) {
                    int i4 = 63 / 0;
                }
                return str;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 73;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                String str = this.landingUrl;
                int i5 = i3 + 73;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                throw null;
            }
        }

        @nc(IAuthTabCallback = "styleId")
        @liq
        public static final class TossstreamShortFormVideo extends Creative {
            public static final int $stable = 0;
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            private final String adClearanceText;
            private final String brandLogoUrl;
            private final String brandName;
            private final String ctaText;
            private final String id;
            private final String landingUrl;
            private final String ratio;
            private final String subTitle;
            private final String thumbnailImageUrl;
            private final String title;
            private final String videoUrl;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<TossstreamShortFormVideo> CREATOR = new IAuthTabCallback();

            public static final class IAuthTabCallback implements Parcelable.Creator<TossstreamShortFormVideo> {
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final TossstreamShortFormVideo IAuthTabCallback(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    TossstreamShortFormVideo tossstreamShortFormVideo = new TossstreamShortFormVideo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    int i2 = onNavigationEvent + 31;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return tossstreamShortFormVideo;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ TossstreamShortFormVideo createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 29;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    TossstreamShortFormVideo tossstreamShortFormVideoIAuthTabCallback = IAuthTabCallback(parcel);
                    int i4 = onNavigationEvent + 79;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return tossstreamShortFormVideoIAuthTabCallback;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ TossstreamShortFormVideo[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 3;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    TossstreamShortFormVideo[] tossstreamShortFormVideoArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                    int i5 = onExtraCallback + 77;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return tossstreamShortFormVideoArrOnExtraCallbackWithResult;
                }

                public final TossstreamShortFormVideo[] onExtraCallbackWithResult(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 41;
                    int i4 = i3 % 128;
                    onNavigationEvent = i4;
                    int i5 = i3 % 2;
                    TossstreamShortFormVideo[] tossstreamShortFormVideoArr = new TossstreamShortFormVideo[i];
                    int i6 = i4 + 57;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 12 / 0;
                    }
                    return tossstreamShortFormVideoArr;
                }
            }

            static {
                int i = IAuthTabCallback + 95;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            public TossstreamShortFormVideo() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 33;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 123;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TossstreamShortFormVideo)) {
                    return false;
                }
                TossstreamShortFormVideo tossstreamShortFormVideo = (TossstreamShortFormVideo) obj;
                if (!Intrinsics.areEqual(this.id, tossstreamShortFormVideo.id)) {
                    int i2 = onNavigationEvent + 45;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                if ((!Intrinsics.areEqual(this.brandName, tossstreamShortFormVideo.brandName)) || !Intrinsics.areEqual(this.brandLogoUrl, tossstreamShortFormVideo.brandLogoUrl)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.thumbnailImageUrl, tossstreamShortFormVideo.thumbnailImageUrl)) {
                    int i4 = onExtraCallbackWithResult + 117;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.videoUrl, tossstreamShortFormVideo.videoUrl)) {
                    int i6 = onNavigationEvent + 43;
                    onExtraCallbackWithResult = i6 % 128;
                    return i6 % 2 != 0;
                }
                if (!Intrinsics.areEqual(this.title, tossstreamShortFormVideo.title)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.subTitle, tossstreamShortFormVideo.subTitle)) {
                    int i7 = onExtraCallbackWithResult;
                    int i8 = i7 + 33;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = i7 + 85;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.ctaText, tossstreamShortFormVideo.ctaText)) {
                    int i12 = onNavigationEvent + 103;
                    onExtraCallbackWithResult = i12 % 128;
                    return i12 % 2 != 0;
                }
                if (!Intrinsics.areEqual(this.landingUrl, tossstreamShortFormVideo.landingUrl)) {
                    int i13 = onExtraCallbackWithResult + 25;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.adClearanceText, tossstreamShortFormVideo.adClearanceText)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.ratio, tossstreamShortFormVideo.ratio)) {
                    return true;
                }
                int i15 = onNavigationEvent + 113;
                onExtraCallbackWithResult = i15 % 128;
                int i16 = i15 % 2;
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 121;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode2 = this.id.hashCode();
                int iHashCode3 = this.brandName.hashCode();
                int iHashCode4 = this.brandLogoUrl.hashCode();
                int iHashCode5 = this.thumbnailImageUrl.hashCode();
                int iHashCode6 = this.videoUrl.hashCode();
                int iHashCode7 = this.title.hashCode();
                int iHashCode8 = this.subTitle.hashCode();
                int iHashCode9 = this.ctaText.hashCode();
                int iHashCode10 = this.landingUrl.hashCode();
                String str = this.adClearanceText;
                int iHashCode11 = 0;
                if (str == null) {
                    int i4 = onExtraCallbackWithResult + 105;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = str.hashCode();
                    int i6 = onExtraCallbackWithResult + 49;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                }
                String str2 = this.ratio;
                if (str2 != null) {
                    int i8 = onExtraCallbackWithResult + 47;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    iHashCode11 = str2.hashCode();
                }
                return (((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode) * 31) + iHashCode11;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "TossstreamShortFormVideo(id=" + this.id + ", brandName=" + this.brandName + ", brandLogoUrl=" + this.brandLogoUrl + ", thumbnailImageUrl=" + this.thumbnailImageUrl + ", videoUrl=" + this.videoUrl + ", title=" + this.title + ", subTitle=" + this.subTitle + ", ctaText=" + this.ctaText + ", landingUrl=" + this.landingUrl + ", adClearanceText=" + this.adClearanceText + ", ratio=" + this.ratio + ")";
                int i2 = onNavigationEvent + 63;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.id);
                parcel.writeString(this.brandName);
                parcel.writeString(this.brandLogoUrl);
                parcel.writeString(this.thumbnailImageUrl);
                parcel.writeString(this.videoUrl);
                parcel.writeString(this.title);
                parcel.writeString(this.subTitle);
                parcel.writeString(this.ctaText);
                parcel.writeString(this.landingUrl);
                parcel.writeString(this.adClearanceText);
                parcel.writeString(this.ratio);
                int i5 = onNavigationEvent + 35;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }

            public static final class Companion {
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<TossstreamShortFormVideo> serializer() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 31;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    NativeAdsDto$Creative$TossstreamShortFormVideo$$serializer nativeAdsDto$Creative$TossstreamShortFormVideo$$serializer = NativeAdsDto$Creative$TossstreamShortFormVideo$$serializer.INSTANCE;
                    if (i3 != 0) {
                        return nativeAdsDto$Creative$TossstreamShortFormVideo$$serializer;
                    }
                    throw null;
                }
            }

            public /* synthetic */ TossstreamShortFormVideo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, okycx okycxVar) {
                super(i, okycxVar);
                if ((i & 1) == 0) {
                    this.id = "";
                } else {
                    this.id = str;
                }
                if ((i & 2) == 0) {
                    int i2 = onNavigationEvent + 23;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    this.brandName = "";
                } else {
                    this.brandName = str2;
                }
                if ((i & 4) == 0) {
                    this.brandLogoUrl = "";
                    int i4 = 2 % 2;
                } else {
                    this.brandLogoUrl = str3;
                }
                Object obj = null;
                if ((i & 8) == 0) {
                    int i5 = onExtraCallbackWithResult + 91;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    this.thumbnailImageUrl = "";
                    if (i6 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i7 = 2 % 2;
                } else {
                    this.thumbnailImageUrl = str4;
                }
                if ((i & 16) == 0) {
                    int i8 = onNavigationEvent + 89;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    this.videoUrl = "";
                    if (i9 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                } else {
                    this.videoUrl = str5;
                }
                if ((i & 32) == 0) {
                    this.title = "";
                } else {
                    this.title = str6;
                }
                if ((i & 64) == 0) {
                    this.subTitle = "";
                    int i10 = onNavigationEvent + 81;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 5 % 3;
                    } else {
                        int i12 = 2 % 2;
                    }
                } else {
                    this.subTitle = str7;
                }
                if ((i & 128) == 0) {
                    this.ctaText = "";
                } else {
                    this.ctaText = str8;
                }
                if ((i & 256) == 0) {
                    int i13 = onNavigationEvent + 105;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    this.landingUrl = "";
                    int i15 = 2 % 2;
                } else {
                    this.landingUrl = str9;
                }
                if ((i & 512) == 0) {
                    int i16 = onExtraCallbackWithResult + 113;
                    onNavigationEvent = i16 % 128;
                    int i17 = i16 % 2;
                    this.adClearanceText = null;
                } else {
                    this.adClearanceText = str10;
                }
                if ((i & 1024) == 0) {
                    this.ratio = null;
                } else {
                    this.ratio = str11;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TossstreamShortFormVideo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @Nullable String str10, @Nullable String str11) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str8, "");
                Intrinsics.checkNotNullParameter(str9, "");
                this.id = str;
                this.brandName = str2;
                this.brandLogoUrl = str3;
                this.thumbnailImageUrl = str4;
                this.videoUrl = str5;
                this.title = str6;
                this.subTitle = str7;
                this.ctaText = str8;
                this.landingUrl = str9;
                this.adClearanceText = str10;
                this.ratio = str11;
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void onExtraCallback(TossstreamShortFormVideo tossstreamShortFormVideo, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(tossstreamShortFormVideo.IAuthTabCallback(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 0, tossstreamShortFormVideo.IAuthTabCallback());
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(tossstreamShortFormVideo.brandName, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 1, tossstreamShortFormVideo.brandName);
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(tossstreamShortFormVideo.brandLogoUrl, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 2, tossstreamShortFormVideo.brandLogoUrl);
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(tossstreamShortFormVideo.thumbnailImageUrl, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 3, tossstreamShortFormVideo.thumbnailImageUrl);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
                    int i2 = onNavigationEvent + 21;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        Intrinsics.areEqual(tossstreamShortFormVideo.videoUrl, "");
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (!Intrinsics.areEqual(tossstreamShortFormVideo.videoUrl, "")) {
                        vylVar.onExtraCallback(serialDescriptor, 4, tossstreamShortFormVideo.videoUrl);
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 5) || !Intrinsics.areEqual(tossstreamShortFormVideo.asInterface(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 5, tossstreamShortFormVideo.asInterface());
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
                    int i3 = onExtraCallbackWithResult + 123;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    if (!Intrinsics.areEqual(tossstreamShortFormVideo.IAuthTabCallbackStub(), "")) {
                        vylVar.onExtraCallback(serialDescriptor, 6, tossstreamShortFormVideo.IAuthTabCallbackStub());
                    }
                }
                if (!(!vylVar.onWarmupCompleted(serialDescriptor, 7)) || !Intrinsics.areEqual(tossstreamShortFormVideo.ctaText, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 7, tossstreamShortFormVideo.ctaText);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 8)) {
                    int i5 = onExtraCallbackWithResult + 41;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    if (!Intrinsics.areEqual(tossstreamShortFormVideo.onWarmupCompleted(), "")) {
                        vylVar.onExtraCallback(serialDescriptor, 8, tossstreamShortFormVideo.onWarmupCompleted());
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 9) || tossstreamShortFormVideo.adClearanceText != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, tossstreamShortFormVideo.adClearanceText);
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 10) || tossstreamShortFormVideo.ratio != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 10, getWriggleLayout.onNavigationEvent, tossstreamShortFormVideo.ratio);
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ TossstreamShortFormVideo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str12;
                String str13;
                String str14;
                String str15;
                String str16;
                String str17 = "";
                if ((i & 1) != 0) {
                    int i2 = onNavigationEvent + 45;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    str12 = "";
                } else {
                    str12 = str;
                }
                if ((i & 2) != 0) {
                    int i4 = onExtraCallbackWithResult + 87;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    str13 = "";
                } else {
                    str13 = str2;
                }
                String str18 = (i & 4) != 0 ? "" : str3;
                String str19 = (i & 8) != 0 ? "" : str4;
                if ((i & 16) != 0) {
                    int i6 = onExtraCallbackWithResult + 117;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = 2 % 2;
                    str14 = "";
                } else {
                    str14 = str5;
                }
                if ((i & 32) != 0) {
                    int i9 = onNavigationEvent + 73;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    str15 = "";
                } else {
                    str15 = str6;
                }
                String str20 = (i & 64) != 0 ? "" : str7;
                if ((i & 128) != 0) {
                    int i11 = onNavigationEvent + 1;
                    onExtraCallbackWithResult = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 3 / 2;
                    } else {
                        int i13 = 2 % 2;
                    }
                    str16 = "";
                } else {
                    str16 = str8;
                }
                if ((i & 256) != 0) {
                    int i14 = onNavigationEvent + 79;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = 2 % 2;
                } else {
                    str17 = str9;
                }
                this(str12, str13, str18, str19, str14, str15, str20, str16, str17, (i & 512) != 0 ? null : str10, (i & 1024) == 0 ? str11 : null);
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.id;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String asInterface() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 67;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                String str = this.title;
                int i5 = i3 + 115;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 117;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                String str = this.subTitle;
                int i5 = i3 + 1;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 10 / 0;
                }
                return str;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 27;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                String str = this.landingUrl;
                int i4 = i2 + 49;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }
        }

        @nc(IAuthTabCallback = "styleId")
        @liq
        public static final class FeedVideo extends Creative {
            public static final int $stable = 0;
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            private static int onWarmupCompleted;
            private final String brandLogoUrl;
            private final String brandName;
            private final String ctaBackgroundColor;
            private final String ctaText;
            private final String ctaTextColor;
            private final String id;
            private final String landingUrl;
            private final String subTitle;
            private final String thumbnailImageUrl;
            private final String title;
            private final String videoUrl;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<FeedVideo> CREATOR = new onExtraCallback();

            public static final class onExtraCallback implements Parcelable.Creator<FeedVideo> {
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ FeedVideo createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 57;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    FeedVideo feedVideoOnNavigationEvent = onNavigationEvent(parcel);
                    int i4 = onNavigationEvent + 83;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 6 / 0;
                    }
                    return feedVideoOnNavigationEvent;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ FeedVideo[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 15;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    FeedVideo[] feedVideoArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                    int i5 = onNavigationEvent + 31;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return feedVideoArrOnExtraCallbackWithResult;
                }

                public final FeedVideo[] onExtraCallbackWithResult(int i) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 111;
                    int i4 = i3 % 128;
                    onExtraCallback = i4;
                    int i5 = i3 % 2;
                    FeedVideo[] feedVideoArr = new FeedVideo[i];
                    int i6 = i4 + 67;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return feedVideoArr;
                }

                public final FeedVideo onNavigationEvent(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    FeedVideo feedVideo = new FeedVideo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    int i2 = onExtraCallback + 9;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return feedVideo;
                }
            }

            static {
                int i = IAuthTabCallback + 67;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            public FeedVideo() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
            }

            private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
                FeedVideo feedVideo = (FeedVideo) objArr[0];
                Parcel parcel = (Parcel) objArr[1];
                ((Number) objArr[2]).intValue();
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 115;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(feedVideo.id);
                parcel.writeString(feedVideo.brandName);
                parcel.writeString(feedVideo.brandLogoUrl);
                parcel.writeString(feedVideo.title);
                parcel.writeString(feedVideo.subTitle);
                parcel.writeString(feedVideo.videoUrl);
                parcel.writeString(feedVideo.thumbnailImageUrl);
                parcel.writeString(feedVideo.ctaText);
                parcel.writeString(feedVideo.ctaTextColor);
                parcel.writeString(feedVideo.ctaBackgroundColor);
                parcel.writeString(feedVideo.landingUrl);
                int i4 = onExtraCallback + 27;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }

            public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
                int i7 = ~i5;
                int i8 = ~((~i) | i7);
                int i9 = ~i6;
                int i10 = i8 | (~(i9 | i)) | (~(i5 | i));
                int i11 = i7 | i;
                int i12 = i9 | i11;
                int i13 = i5 + i + i4 + ((-1542968645) * i3) + (1789173782 * i2);
                int i14 = i13 * i13;
                int i15 = (1553370224 * i5) + 752877568 + ((-368479342) * i) + (i10 * 1186558865) + (1921849566 * i11) + (1186558865 * i12) + ((-1555038208) * i4) + (1802502144 * i3) + (148897792 * i2) + (289275904 * i14);
                int i16 = (i5 * (-930071408)) + 1959937684 + (i * (-930070194)) + (i10 * 607) + (i11 * (-1214)) + (i12 * 607) + (i4 * (-930070801)) + (i3 * 1059663509) + (i2 * (-1428764534)) + (i14 * 484573184);
                return i15 + ((i16 * i16) * 411172864) != 1 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 79;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 105;
                onExtraCallbackWithResult = i5 % 128;
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
                    return true;
                }
                if (!(obj instanceof FeedVideo)) {
                    return false;
                }
                FeedVideo feedVideo = (FeedVideo) obj;
                if (!Intrinsics.areEqual(this.id, feedVideo.id)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.brandName, feedVideo.brandName)) {
                    int i2 = onExtraCallback + 25;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        return false;
                    }
                    throw null;
                }
                if (!Intrinsics.areEqual(this.brandLogoUrl, feedVideo.brandLogoUrl) || !Intrinsics.areEqual(this.title, feedVideo.title) || !Intrinsics.areEqual(this.subTitle, feedVideo.subTitle) || (!Intrinsics.areEqual(this.videoUrl, feedVideo.videoUrl))) {
                    return false;
                }
                if (Intrinsics.areEqual(this.thumbnailImageUrl, feedVideo.thumbnailImageUrl)) {
                    return Intrinsics.areEqual(this.ctaText, feedVideo.ctaText) && Intrinsics.areEqual(this.ctaTextColor, feedVideo.ctaTextColor) && Intrinsics.areEqual(this.ctaBackgroundColor, feedVideo.ctaBackgroundColor) && Intrinsics.areEqual(this.landingUrl, feedVideo.landingUrl);
                }
                int i3 = onExtraCallbackWithResult + 113;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 107;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.id.hashCode();
                int iHashCode2 = this.brandName.hashCode();
                int iHashCode3 = this.brandLogoUrl.hashCode();
                int iHashCode4 = this.title.hashCode();
                int iHashCode5 = this.subTitle.hashCode();
                int iHashCode6 = this.videoUrl.hashCode();
                int iHashCode7 = this.thumbnailImageUrl.hashCode();
                int iHashCode8 = this.ctaText.hashCode();
                int iHashCode9 = this.ctaTextColor.hashCode();
                String str = this.ctaBackgroundColor;
                int iHashCode10 = (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.landingUrl.hashCode();
                int i4 = onExtraCallbackWithResult + 65;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode10;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "FeedVideo(id=" + this.id + ", brandName=" + this.brandName + ", brandLogoUrl=" + this.brandLogoUrl + ", title=" + this.title + ", subTitle=" + this.subTitle + ", videoUrl=" + this.videoUrl + ", thumbnailImageUrl=" + this.thumbnailImageUrl + ", ctaText=" + this.ctaText + ", ctaTextColor=" + this.ctaTextColor + ", ctaBackgroundColor=" + this.ctaBackgroundColor + ", landingUrl=" + this.landingUrl + ")";
                int i2 = onExtraCallback + 107;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public static final class Companion {
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<FeedVideo> serializer() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 119;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    NativeAdsDto$Creative$FeedVideo$$serializer nativeAdsDto$Creative$FeedVideo$$serializer = NativeAdsDto$Creative$FeedVideo$$serializer.INSTANCE;
                    if (i3 != 0) {
                        return nativeAdsDto$Creative$FeedVideo$$serializer;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            public /* synthetic */ FeedVideo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, okycx okycxVar) {
                super(i, okycxVar);
                if ((i & 1) == 0) {
                    this.id = "";
                } else {
                    this.id = str;
                }
                if ((i & 2) == 0) {
                    int i2 = onExtraCallback + 77;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    this.brandName = "";
                    int i4 = 2 % 2;
                } else {
                    this.brandName = str2;
                }
                if ((i & 4) == 0) {
                    this.brandLogoUrl = "";
                } else {
                    this.brandLogoUrl = str3;
                }
                if ((i & 8) == 0) {
                    this.title = "";
                } else {
                    this.title = str4;
                }
                if ((i & 16) == 0) {
                    this.subTitle = "";
                } else {
                    this.subTitle = str5;
                }
                if ((i & 32) == 0) {
                    this.videoUrl = "";
                } else {
                    this.videoUrl = str6;
                    int i5 = 2 % 2;
                }
                if ((i & 64) == 0) {
                    int i6 = onExtraCallback + 33;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    this.thumbnailImageUrl = "";
                    if (i7 != 0) {
                        int i8 = 52 / 0;
                    }
                    int i9 = 2 % 2;
                } else {
                    this.thumbnailImageUrl = str7;
                }
                if ((i & 128) == 0) {
                    this.ctaText = "";
                    int i10 = 2 % 2;
                } else {
                    this.ctaText = str8;
                }
                if ((i & 256) == 0) {
                    this.ctaTextColor = "";
                } else {
                    this.ctaTextColor = str9;
                }
                if ((i & 512) == 0) {
                    this.ctaBackgroundColor = null;
                } else {
                    this.ctaBackgroundColor = str10;
                }
                if ((i & 1024) == 0) {
                    this.landingUrl = "";
                } else {
                    this.landingUrl = str11;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FeedVideo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @Nullable String str10, @NotNull String str11) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str8, "");
                Intrinsics.checkNotNullParameter(str9, "");
                Intrinsics.checkNotNullParameter(str11, "");
                this.id = str;
                this.brandName = str2;
                this.brandLogoUrl = str3;
                this.title = str4;
                this.subTitle = str5;
                this.videoUrl = str6;
                this.thumbnailImageUrl = str7;
                this.ctaText = str8;
                this.ctaTextColor = str9;
                this.ctaBackgroundColor = str10;
                this.landingUrl = str11;
            }

            /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0130  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void onNavigationEvent(FeedVideo feedVideo, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                    int i2 = onExtraCallbackWithResult + 61;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    if (!Intrinsics.areEqual(feedVideo.IAuthTabCallback(), "")) {
                        vylVar.onExtraCallback(serialDescriptor, 0, feedVideo.IAuthTabCallback());
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(feedVideo.brandName, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 1, feedVideo.brandName);
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(feedVideo.brandLogoUrl, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 2, feedVideo.brandLogoUrl);
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(feedVideo.asInterface(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 3, feedVideo.asInterface());
                    int i4 = onExtraCallback + 109;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(feedVideo.IAuthTabCallbackStub(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 4, feedVideo.IAuthTabCallbackStub());
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
                    int i6 = onExtraCallbackWithResult + 85;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 43 / 0;
                        if (!Intrinsics.areEqual(feedVideo.videoUrl, "")) {
                            vylVar.onExtraCallback(serialDescriptor, 5, feedVideo.videoUrl);
                        }
                    } else if (!Intrinsics.areEqual(feedVideo.videoUrl, "")) {
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
                    int i8 = onExtraCallback + 39;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    if (!Intrinsics.areEqual(feedVideo.thumbnailImageUrl, "")) {
                        vylVar.onExtraCallback(serialDescriptor, 6, feedVideo.thumbnailImageUrl);
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
                    int i10 = onExtraCallbackWithResult + 113;
                    onExtraCallback = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 76 / 0;
                        if (!Intrinsics.areEqual(feedVideo.ctaText, "")) {
                            vylVar.onExtraCallback(serialDescriptor, 7, feedVideo.ctaText);
                        }
                    } else if (!Intrinsics.areEqual(feedVideo.ctaText, "")) {
                    }
                }
                if (!(true ^ vylVar.onWarmupCompleted(serialDescriptor, 8)) || !Intrinsics.areEqual(feedVideo.ctaTextColor, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 8, feedVideo.ctaTextColor);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 9)) {
                    int i12 = onExtraCallbackWithResult + 103;
                    onExtraCallback = i12 % 128;
                    if (i12 % 2 == 0) {
                        String str = feedVideo.ctaBackgroundColor;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (feedVideo.ctaBackgroundColor != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, feedVideo.ctaBackgroundColor);
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 10) || !Intrinsics.areEqual(feedVideo.onWarmupCompleted(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 10, feedVideo.onWarmupCompleted());
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ FeedVideo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str12;
                String str13;
                String str14;
                String str15;
                String str16;
                if ((i & 1) != 0) {
                    int i2 = onExtraCallback + 39;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                    str12 = "";
                } else {
                    str12 = str;
                }
                String str17 = (i & 2) != 0 ? "" : str2;
                if ((i & 4) != 0) {
                    int i5 = onExtraCallbackWithResult + 95;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 2 % 2;
                    }
                    str13 = "";
                } else {
                    str13 = str3;
                }
                String str18 = (i & 8) != 0 ? "" : str4;
                String str19 = (i & 16) != 0 ? "" : str5;
                String str20 = (i & 32) != 0 ? "" : str6;
                String str21 = (i & 64) != 0 ? "" : str7;
                if ((i & 128) != 0) {
                    int i7 = onExtraCallbackWithResult + 115;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 88 / 0;
                    }
                    str14 = "";
                } else {
                    str14 = str8;
                }
                if ((i & 256) != 0) {
                    int i9 = 2 % 2;
                    str15 = "";
                } else {
                    str15 = str9;
                }
                if ((i & 512) != 0) {
                    int i10 = onExtraCallback + 15;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 2 % 2;
                    }
                    str16 = null;
                } else {
                    str16 = str10;
                }
                this(str12, str17, str13, str18, str19, str20, str21, str14, str15, str16, (i & 1024) == 0 ? str11 : "");
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 109;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                String str = this.id;
                int i5 = i3 + 75;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            public final String asBinder() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 59;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                String str = this.brandName;
                int i4 = i2 + 101;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }

            private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
                FeedVideo feedVideo = (FeedVideo) objArr[0];
                int i = 2 % 2;
                int i2 = onExtraCallback + 83;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                String str = feedVideo.brandLogoUrl;
                int i5 = i3 + 31;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String asInterface() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 5;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.title;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 75;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                String str = this.subTitle;
                int i5 = i3 + 9;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final String getInterfaceDescriptor() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 105;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                String str = this.videoUrl;
                int i5 = i3 + 69;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final String access000() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 11;
                onExtraCallback = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                String str = this.thumbnailImageUrl;
                int i4 = i2 + 71;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return str;
                }
                obj.hashCode();
                throw null;
            }

            public final String IAuthTabCallbackStubProxy() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 7;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                String str = this.ctaText;
                int i5 = i3 + 93;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 51 / 0;
                }
                return str;
            }

            public final String access100() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 69;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                String str = this.ctaTextColor;
                int i4 = i3 + 47;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }

            public final String onTransact() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 113;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                String str = this.ctaBackgroundColor;
                int i5 = i2 + 73;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 19;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.landingUrl;
                }
                int i3 = 2 / 0;
                return this.landingUrl;
            }

            public final ThumbnailBanner IAuthTabCallback_Parcel() {
                int i = 2 % 2;
                String strIAuthTabCallback = IAuthTabCallback();
                String str = this.thumbnailImageUrl;
                ThumbnailBanner thumbnailBanner = new ThumbnailBanner(strIAuthTabCallback, str, str, this.videoUrl, onWarmupCompleted(), asInterface(), IAuthTabCallbackStub(), this.brandLogoUrl, (String) null, 256, (DefaultConstructorMarker) null);
                int i2 = onExtraCallback + 101;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return thumbnailBanner;
            }

            public final String IAuthTabCallbackDefault() {
                int iOnExtraCallback = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
                int iOnExtraCallback2 = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
                return (String) onNavigationEvent(598113625, new Object[]{this}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, -598113624, iOnExtraCallback);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Object[] objArr = {this, parcel, Integer.valueOf(i)};
                int iOnExtraCallback = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
                int iOnExtraCallback2 = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
                onNavigationEvent(828573606, objArr, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, -828573606, iOnExtraCallback);
            }
        }

        @nc(IAuthTabCallback = "styleId")
        @liq
        public static final class PlayableAd extends Creative {
            public static final int $stable = 0;
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private final AppInfo app;
            private final EndCard endCard;
            private final String htmlUrl;
            private final String id;
            private final IosAppInstallInfo iosAppInstall;
            private final String landingUrl;
            private final String shareLinkBaseUrl;
            private final String subTitle;
            private final List<String> testUrl;
            private final String title;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<PlayableAd> CREATOR = new IAuthTabCallback();
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.model.NativeAdsDto$Creative$PlayableAd$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 95;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object[] objArr = new Object[0];
                    int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
                    int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
                    int iOnWarmupCompleted3 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
                    int iOnWarmupCompleted4 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
                    if (i3 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    KSerializer kSerializer = (KSerializer) NativeAdsDto.Creative.PlayableAd.onWarmupCompleted(iOnWarmupCompleted, objArr, -1401355120, iOnWarmupCompleted2, iOnWarmupCompleted4, 1401355120, iOnWarmupCompleted3);
                    int i4 = onExtraCallback + 19;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializer;
                }
            }), null, null, null, null, null};

            public static final class IAuthTabCallback implements Parcelable.Creator<PlayableAd> {
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ PlayableAd createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 63;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    PlayableAd playableAdOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
                    int i4 = onNavigationEvent + 109;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return playableAdOnExtraCallbackWithResult;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ PlayableAd[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 107;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    PlayableAd[] playableAdArrOnWarmupCompleted = onWarmupCompleted(i);
                    if (i4 != 0) {
                        int i5 = 71 / 0;
                    }
                    return playableAdArrOnWarmupCompleted;
                }

                public final PlayableAd onExtraCallbackWithResult(Parcel parcel) {
                    IosAppInstallInfo iosAppInstallInfoCreateFromParcel;
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 99;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    String string5 = parcel.readString();
                    String string6 = parcel.readString();
                    EndCard endCardCreateFromParcel = null;
                    AppInfo appInfoCreateFromParcel = parcel.readInt() == 0 ? null : AppInfo.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        int i4 = onNavigationEvent + 37;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        iosAppInstallInfoCreateFromParcel = null;
                    } else {
                        iosAppInstallInfoCreateFromParcel = IosAppInstallInfo.CREATOR.createFromParcel(parcel);
                    }
                    IosAppInstallInfo iosAppInstallInfo = iosAppInstallInfoCreateFromParcel;
                    if (parcel.readInt() == 0) {
                        int i6 = onNavigationEvent + 37;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        endCardCreateFromParcel = EndCard.CREATOR.createFromParcel(parcel);
                    }
                    return new PlayableAd(string, string2, string3, string4, arrayListCreateStringArrayList, string5, string6, appInfoCreateFromParcel, iosAppInstallInfo, endCardCreateFromParcel);
                }

                public final PlayableAd[] onWarmupCompleted(int i) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 43;
                    onNavigationEvent = i3 % 128;
                    PlayableAd[] playableAdArr = new PlayableAd[i];
                    if (i3 % 2 != 0) {
                        return playableAdArr;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            public PlayableAd() {
                this((String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (AppInfo) null, (IosAppInstallInfo) null, (EndCard) null, 1023, (DefaultConstructorMarker) null);
            }

            private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 43;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer interfaceDescriptor = getInterfaceDescriptor();
                int i4 = onExtraCallbackWithResult + 71;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return interfaceDescriptor;
            }

            private static final /* synthetic */ KSerializer getInterfaceDescriptor() {
                int i = 2 % 2;
                checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
                int i2 = IAuthTabCallback + 85;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return checkcanopenlandingpage;
            }

            public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
                int i7 = ~i2;
                int i8 = ~(i7 | i5);
                int i9 = (~(i7 | i)) | i8 | (~(i5 | i));
                int i10 = (~(i7 | (~i))) | i8;
                int i11 = (~(i | i2)) | (~((~i5) | i2));
                int i12 = i2 + i5 + i3 + (929125522 * i6) + (1849324972 * i4);
                int i13 = i12 * i12;
                int i14 = (1419820811 * i2) + 1146290176 + ((-1462591364) * i5) + (i9 * 470851707) + (470851707 * i10) + ((-470851707) * i11) + ((-1933443072) * i3) + ((-291241984) * i6) + (1012400128 * i4) + ((-1810169856) * i13);
                int i15 = ((i2 * (-2058557531)) - 518432259) + (i5 * (-2058559676)) + (i9 * (-715)) + (i10 * (-715)) + (i11 * 715) + (i3 * (-2058558961)) + (i6 * 548722830) + (i4 * 1549712660) + (i13 * (-2087387136));
                return i14 + ((i15 * i15) * (-343605248)) != 1 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 55;
                onExtraCallbackWithResult = i2 % 128;
                return i2 % 2 != 0 ? 1 : 0;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(!(obj instanceof PlayableAd))) {
                    PlayableAd playableAd = (PlayableAd) obj;
                    if ((!Intrinsics.areEqual(this.id, playableAd.id)) || !Intrinsics.areEqual(this.title, playableAd.title) || !Intrinsics.areEqual(this.subTitle, playableAd.subTitle) || !Intrinsics.areEqual(this.htmlUrl, playableAd.htmlUrl)) {
                        return false;
                    }
                    if (!Intrinsics.areEqual(this.testUrl, playableAd.testUrl)) {
                        int i2 = onExtraCallbackWithResult + 71;
                        IAuthTabCallback = i2 % 128;
                        int i3 = i2 % 2;
                        return false;
                    }
                    if (!Intrinsics.areEqual(this.shareLinkBaseUrl, playableAd.shareLinkBaseUrl)) {
                        int i4 = onExtraCallbackWithResult + 105;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        return false;
                    }
                    if (!Intrinsics.areEqual(this.landingUrl, playableAd.landingUrl) || !Intrinsics.areEqual(this.app, playableAd.app)) {
                        return false;
                    }
                    if (!Intrinsics.areEqual(this.iosAppInstall, playableAd.iosAppInstall)) {
                        int i6 = onExtraCallbackWithResult + 101;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        return false;
                    }
                    if (Intrinsics.areEqual(this.endCard, playableAd.endCard)) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int iHashCode2;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 35;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode3 = this.id.hashCode();
                int iHashCode4 = this.title.hashCode();
                int iHashCode5 = this.subTitle.hashCode();
                int iHashCode6 = this.htmlUrl.hashCode();
                int iHashCode7 = this.testUrl.hashCode();
                String str = this.shareLinkBaseUrl;
                int iHashCode8 = 1;
                int iHashCode9 = 0;
                if (str == null) {
                    int i4 = IAuthTabCallback + 73;
                    onExtraCallbackWithResult = i4 % 128;
                    iHashCode = i4 % 2 != 0 ? 1 : 0;
                } else {
                    iHashCode = str.hashCode();
                }
                int iHashCode10 = this.landingUrl.hashCode();
                AppInfo appInfo = this.app;
                if (appInfo == null) {
                    int i5 = onExtraCallbackWithResult + 47;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        iHashCode8 = 0;
                    }
                } else {
                    iHashCode8 = appInfo.hashCode();
                    int i6 = onExtraCallbackWithResult + 65;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                }
                IosAppInstallInfo iosAppInstallInfo = this.iosAppInstall;
                if (iosAppInstallInfo == null) {
                    int i8 = IAuthTabCallback + 47;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    iHashCode2 = 0;
                } else {
                    iHashCode2 = iosAppInstallInfo.hashCode();
                }
                EndCard endCard = this.endCard;
                if (endCard != null) {
                    iHashCode9 = endCard.hashCode();
                    int i10 = onExtraCallbackWithResult + 3;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                }
                return (((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode10) * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode9;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "PlayableAd(id=" + this.id + ", title=" + this.title + ", subTitle=" + this.subTitle + ", htmlUrl=" + this.htmlUrl + ", testUrl=" + this.testUrl + ", shareLinkBaseUrl=" + this.shareLinkBaseUrl + ", landingUrl=" + this.landingUrl + ", app=" + this.app + ", iosAppInstall=" + this.iosAppInstall + ", endCard=" + this.endCard + ")";
                int i2 = onExtraCallbackWithResult + 37;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.id);
                parcel.writeString(this.title);
                parcel.writeString(this.subTitle);
                parcel.writeString(this.htmlUrl);
                parcel.writeStringList(this.testUrl);
                parcel.writeString(this.shareLinkBaseUrl);
                parcel.writeString(this.landingUrl);
                AppInfo appInfo = this.app;
                if (appInfo == null) {
                    parcel.writeInt(0);
                    int i3 = IAuthTabCallback + 51;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    parcel.writeInt(1);
                    appInfo.writeToParcel(parcel, i);
                }
                IosAppInstallInfo iosAppInstallInfo = this.iosAppInstall;
                if (iosAppInstallInfo == null) {
                    int i5 = onExtraCallbackWithResult + 37;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    parcel.writeInt(0);
                    int i7 = IAuthTabCallback + 97;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    parcel.writeInt(1);
                    iosAppInstallInfo.writeToParcel(parcel, i);
                }
                EndCard endCard = this.endCard;
                if (endCard == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    endCard.writeToParcel(parcel, i);
                }
            }

            public static final class Companion {
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<PlayableAd> serializer() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 103;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    NativeAdsDto$Creative$PlayableAd$$serializer nativeAdsDto$Creative$PlayableAd$$serializer = NativeAdsDto$Creative$PlayableAd$$serializer.INSTANCE;
                    int i4 = onExtraCallback + 31;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return nativeAdsDto$Creative$PlayableAd$$serializer;
                }
            }

            static {
                int i = onNavigationEvent + 89;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            public /* synthetic */ PlayableAd(int i, String str, String str2, String str3, String str4, List list, String str5, String str6, AppInfo appInfo, IosAppInstallInfo iosAppInstallInfo, EndCard endCard, okycx okycxVar) {
                super(i, okycxVar);
                if ((i & 1) == 0) {
                    this.id = "";
                } else {
                    this.id = str;
                }
                if ((i & 2) == 0) {
                    int i2 = onExtraCallbackWithResult + 67;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    this.title = "";
                    if (i3 == 0) {
                        throw null;
                    }
                } else {
                    this.title = str2;
                }
                if ((i & 4) == 0) {
                    int i4 = IAuthTabCallback + 39;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    this.subTitle = "";
                } else {
                    this.subTitle = str3;
                }
                if ((i & 8) == 0) {
                    this.htmlUrl = "";
                } else {
                    this.htmlUrl = str4;
                    int i6 = 2 % 2;
                }
                if ((i & 16) == 0) {
                    this.testUrl = CollectionsKt.emptyList();
                    int i7 = 2 % 2;
                } else {
                    this.testUrl = list;
                }
                if ((i & 32) == 0) {
                    this.shareLinkBaseUrl = null;
                } else {
                    this.shareLinkBaseUrl = str5;
                }
                if ((i & 64) == 0) {
                    int i8 = IAuthTabCallback + 93;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    this.landingUrl = "";
                } else {
                    this.landingUrl = str6;
                    int i10 = 2 % 2;
                }
                if ((i & 128) == 0) {
                    this.app = null;
                    int i11 = onExtraCallbackWithResult + 49;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    this.app = appInfo;
                }
                int i13 = 2 % 2;
                if ((i & 256) == 0) {
                    int i14 = onExtraCallbackWithResult + 19;
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
                    this.iosAppInstall = null;
                } else {
                    this.iosAppInstall = iosAppInstallInfo;
                }
                if ((i & 512) == 0) {
                    this.endCard = null;
                } else {
                    this.endCard = endCard;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlayableAd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list, @Nullable String str5, @NotNull String str6, @Nullable AppInfo appInfo, @Nullable IosAppInstallInfo iosAppInstallInfo, @Nullable EndCard endCard) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(str6, "");
                this.id = str;
                this.title = str2;
                this.subTitle = str3;
                this.htmlUrl = str4;
                this.testUrl = list;
                this.shareLinkBaseUrl = str5;
                this.landingUrl = str6;
                this.app = appInfo;
                this.iosAppInstall = iosAppInstallInfo;
                this.endCard = endCard;
            }

            public static final /* synthetic */ Lazy[] asBinder() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 113;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return $childSerializers;
                }
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void onWarmupCompleted(PlayableAd playableAd, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(playableAd.IAuthTabCallback(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 0, playableAd.IAuthTabCallback());
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                    int i2 = IAuthTabCallback + 15;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        Intrinsics.areEqual(playableAd.asInterface(), "");
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (!Intrinsics.areEqual(playableAd.asInterface(), "")) {
                        vylVar.onExtraCallback(serialDescriptor, 1, playableAd.asInterface());
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                    int i3 = onExtraCallbackWithResult + 39;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    if (!Intrinsics.areEqual(playableAd.IAuthTabCallbackStub(), "")) {
                        vylVar.onExtraCallback(serialDescriptor, 2, playableAd.IAuthTabCallbackStub());
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(playableAd.htmlUrl, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 3, playableAd.htmlUrl);
                }
                if (!(!vylVar.onWarmupCompleted(serialDescriptor, 4)) || !Intrinsics.areEqual(playableAd.testUrl, CollectionsKt.emptyList())) {
                    vylVar.onNavigationEvent(serialDescriptor, 4, (py) lazyArr[4].getValue(), playableAd.testUrl);
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 5) || playableAd.shareLinkBaseUrl != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, playableAd.shareLinkBaseUrl);
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 6) || !Intrinsics.areEqual(playableAd.onWarmupCompleted(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 6, playableAd.onWarmupCompleted());
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
                    int i5 = IAuthTabCallback + 11;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    if (playableAd.app != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 7, AppInfo$$serializer.INSTANCE, playableAd.app);
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 8) || playableAd.iosAppInstall != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 8, IosAppInstallInfo$$serializer.INSTANCE, playableAd.iosAppInstall);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 9)) {
                    int i7 = IAuthTabCallback + 5;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    if (playableAd.endCard == null) {
                        return;
                    }
                }
                vylVar.onExtraCallbackWithResult(serialDescriptor, 9, NativeAdsDto$Creative$EndCard$$serializer.INSTANCE, playableAd.endCard);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ PlayableAd(String str, String str2, String str3, String str4, List list, String str5, String str6, AppInfo appInfo, IosAppInstallInfo iosAppInstallInfo, EndCard endCard, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str7;
                String str8;
                List listEmptyList;
                String str9;
                IosAppInstallInfo iosAppInstallInfo2;
                String str10 = "";
                if ((i & 1) != 0) {
                    int i2 = IAuthTabCallback + 73;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                    str7 = "";
                } else {
                    str7 = str;
                }
                if ((i & 2) != 0) {
                    int i5 = 2 % 2;
                    str8 = "";
                } else {
                    str8 = str2;
                }
                String str11 = (i & 4) != 0 ? "" : str3;
                String str12 = (i & 8) != 0 ? "" : str4;
                EndCard endCard2 = null;
                if ((i & 16) != 0) {
                    int i6 = IAuthTabCallback + 33;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        CollectionsKt.emptyList();
                        endCard2.hashCode();
                        throw null;
                    }
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if ((i & 32) != 0) {
                    int i7 = IAuthTabCallback;
                    int i8 = i7 + 119;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = i7 + 81;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = 2 % 2;
                    str9 = null;
                } else {
                    str9 = str5;
                }
                if ((i & 64) != 0) {
                    int i13 = onExtraCallbackWithResult + 7;
                    IAuthTabCallback = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                } else {
                    str10 = str6;
                }
                AppInfo appInfo2 = (i & 128) != 0 ? null : appInfo;
                if ((i & 256) != 0) {
                    int i14 = IAuthTabCallback + 89;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    iosAppInstallInfo2 = null;
                } else {
                    iosAppInstallInfo2 = iosAppInstallInfo;
                }
                if ((i & 512) != 0) {
                    int i16 = onExtraCallbackWithResult + 45;
                    IAuthTabCallback = i16 % 128;
                    int i17 = i16 % 2;
                } else {
                    endCard2 = endCard;
                }
                this(str7, str8, str11, str12, listEmptyList, str9, str10, appInfo2, iosAppInstallInfo2, endCard2);
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 65;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                String str = this.id;
                int i5 = i2 + 55;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 10 / 0;
                }
                return str;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String asInterface() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 49;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                String str = this.title;
                int i5 = i3 + 37;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 35;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.subTitle;
                }
                throw null;
            }

            private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
                PlayableAd playableAd = (PlayableAd) objArr[0];
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 59;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                String str = playableAd.htmlUrl;
                int i5 = i2 + 75;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final List<String> IAuthTabCallbackStubProxy() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 69;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                List<String> list = this.testUrl;
                int i4 = i2 + 91;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return list;
            }

            public final String access100() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 53;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                String str = this.shareLinkBaseUrl;
                int i5 = i3 + 113;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 117;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                String str = this.landingUrl;
                int i5 = i2 + 83;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final EndCard IAuthTabCallbackDefault() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 101;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.endCard;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ KSerializer onTransact() {
                return (KSerializer) onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[0], -1401355120, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1401355120, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            }

            public final String IAuthTabCallback_Parcel() {
                return (String) onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this}, -994883355, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 994883356, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            }
        }

        @liq
        public static final class TutorialOverlay implements Parcelable {
            public static final int $stable = 0;
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            private final Double autoCloseMs;
            private final String bottomText;
            private final String lottieUrl;
            private final String topText;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<TutorialOverlay> CREATOR = new onWarmupCompleted();

            public static final class onWarmupCompleted implements Parcelable.Creator<TutorialOverlay> {
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ TutorialOverlay createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 67;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    TutorialOverlay tutorialOverlayOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
                    int i4 = onWarmupCompleted + 69;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 8 / 0;
                    }
                    return tutorialOverlayOnExtraCallbackWithResult;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ TutorialOverlay[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 23;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    TutorialOverlay[] tutorialOverlayArrOnWarmupCompleted = onWarmupCompleted(i);
                    int i5 = onExtraCallback + 73;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 58 / 0;
                    }
                    return tutorialOverlayArrOnWarmupCompleted;
                }

                public final TutorialOverlay onExtraCallbackWithResult(Parcel parcel) {
                    Double dValueOf;
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 103;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        int i4 = onExtraCallback + 45;
                        onWarmupCompleted = i4 % 128;
                        dValueOf = null;
                        if (i4 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        dValueOf = Double.valueOf(parcel.readDouble());
                    }
                    return new TutorialOverlay(string, string2, string3, dValueOf);
                }

                public final TutorialOverlay[] onWarmupCompleted(int i) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted;
                    int i4 = i3 + 87;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    TutorialOverlay[] tutorialOverlayArr = new TutorialOverlay[i];
                    int i6 = i3 + 17;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 46 / 0;
                    }
                    return tutorialOverlayArr;
                }
            }

            static {
                int i = onWarmupCompleted + 31;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            public TutorialOverlay() {
                this((String) null, (String) null, (String) null, (Double) null, 15, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 5;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 77;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TutorialOverlay)) {
                    return false;
                }
                TutorialOverlay tutorialOverlay = (TutorialOverlay) obj;
                if (!Intrinsics.areEqual(this.topText, tutorialOverlay.topText)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.bottomText, tutorialOverlay.bottomText)) {
                    int i2 = IAuthTabCallback + 55;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.lottieUrl, tutorialOverlay.lottieUrl)) {
                    int i4 = onExtraCallback + 3;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.autoCloseMs, tutorialOverlay.autoCloseMs)) {
                    return true;
                }
                int i6 = onExtraCallback + 97;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int iHashCode2;
                int i = 2 % 2;
                String str = this.topText;
                int iHashCode3 = 0;
                if (str == null) {
                    iHashCode = 0;
                } else {
                    iHashCode = str.hashCode();
                    int i2 = onExtraCallback + 21;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                }
                String str2 = this.bottomText;
                if (str2 == null) {
                    int i4 = IAuthTabCallback + 119;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    iHashCode2 = 0;
                } else {
                    iHashCode2 = str2.hashCode();
                }
                int iHashCode4 = this.lottieUrl.hashCode();
                Double d = this.autoCloseMs;
                if (d != null) {
                    int i6 = IAuthTabCallback + 43;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    iHashCode3 = d.hashCode();
                }
                int i8 = (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode3;
                int i9 = IAuthTabCallback + 51;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                return i8;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "TutorialOverlay(topText=" + this.topText + ", bottomText=" + this.bottomText + ", lottieUrl=" + this.lottieUrl + ", autoCloseMs=" + this.autoCloseMs + ")";
                int i2 = IAuthTabCallback + 71;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 53;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.topText);
                parcel.writeString(this.bottomText);
                parcel.writeString(this.lottieUrl);
                Double d = this.autoCloseMs;
                if (d == null) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                parcel.writeDouble(d.doubleValue());
                int i5 = onExtraCallback + 117;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 65 / 0;
                }
            }

            public static final class Companion {
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<TutorialOverlay> serializer() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 119;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    NativeAdsDto$Creative$TutorialOverlay$$serializer nativeAdsDto$Creative$TutorialOverlay$$serializer = NativeAdsDto$Creative$TutorialOverlay$$serializer.INSTANCE;
                    if (i3 != 0) {
                        int i4 = 72 / 0;
                    }
                    return nativeAdsDto$Creative$TutorialOverlay$$serializer;
                }
            }

            public /* synthetic */ TutorialOverlay(int i, String str, String str2, String str3, Double d, okycx okycxVar) {
                if ((i & 1) == 0) {
                    this.topText = null;
                } else {
                    this.topText = str;
                    int i2 = 2 % 2;
                }
                if ((i & 2) == 0) {
                    this.bottomText = null;
                } else {
                    this.bottomText = str2;
                }
                if ((i & 4) == 0) {
                    int i3 = IAuthTabCallback + 91;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    this.lottieUrl = "";
                } else {
                    this.lottieUrl = str3;
                }
                int i5 = 2 % 2;
                if ((i & 8) != 0) {
                    this.autoCloseMs = d;
                    return;
                }
                this.autoCloseMs = null;
                int i6 = IAuthTabCallback + 45;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }

            public TutorialOverlay(@Nullable String str, @Nullable String str2, @NotNull String str3, @Nullable Double d) {
                Intrinsics.checkNotNullParameter(str3, "");
                this.topText = str;
                this.bottomText = str2;
                this.lottieUrl = str3;
                this.autoCloseMs = d;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void onNavigationEvent(TutorialOverlay tutorialOverlay, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 105;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                if (vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, tutorialOverlay.topText);
                } else {
                    int i4 = onExtraCallback + 61;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 50 / 0;
                        if (tutorialOverlay.topText != null) {
                        }
                    } else if (tutorialOverlay.topText != null) {
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 1) || tutorialOverlay.bottomText != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, tutorialOverlay.bottomText);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                    int i6 = IAuthTabCallback + 93;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (!Intrinsics.areEqual(tutorialOverlay.lottieUrl, "")) {
                        vylVar.onExtraCallback(serialDescriptor, 2, tutorialOverlay.lottieUrl);
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                    int i8 = onExtraCallback + 27;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    Double d = tutorialOverlay.autoCloseMs;
                    if (i9 != 0) {
                        int i10 = 26 / 0;
                        if (d == null) {
                            return;
                        }
                    } else if (d == null) {
                        return;
                    }
                }
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, setVideoListener.onWarmupCompleted, tutorialOverlay.autoCloseMs);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ TutorialOverlay(String str, String str2, String str3, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = onExtraCallback + 121;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                    str = null;
                }
                if ((i & 2) != 0) {
                    int i5 = 2 % 2;
                    str2 = null;
                }
                str3 = (i & 4) != 0 ? "" : str3;
                if ((i & 8) != 0) {
                    int i6 = IAuthTabCallback + 77;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = 2 % 2;
                    d = null;
                }
                this(str, str2, str3, d);
            }

            public final String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 101;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                String str = this.topText;
                if (i3 != 0) {
                    int i4 = 3 / 0;
                }
                return str;
            }

            public final String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 67;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                String str = this.bottomText;
                int i5 = i3 + 15;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 15 / 0;
                }
                return str;
            }

            public final String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 105;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                String str = this.lottieUrl;
                int i5 = i3 + 105;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Double onNavigationEvent() {
                Double d;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 45;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                if (i2 % 2 == 0) {
                    d = this.autoCloseMs;
                    int i4 = 12 / 0;
                } else {
                    d = this.autoCloseMs;
                }
                int i5 = i3 + 31;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return d;
            }
        }

        @liq
        public static final class EndCard implements Parcelable {
            public static final int $stable = 0;
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private final String ctaText;
            private final String imageUrl;
            private final List<EndCardContent> listContent;
            private final String subTitle;
            private final String title;
            private final Gradient titleGradient;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<EndCard> CREATOR = new onExtraCallback();
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.model.NativeAdsDto$Creative$EndCard$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 41;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerIAuthTabCallback = NativeAdsDto.Creative.EndCard.IAuthTabCallback();
                    int i4 = onWarmupCompleted + 93;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializerIAuthTabCallback;
                }
            })};

            public static final class onExtraCallback implements Parcelable.Creator<EndCard> {
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final EndCard[] IAuthTabCallback(int i) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted;
                    int i4 = i3 + 5;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    EndCard[] endCardArr = new EndCard[i];
                    int i6 = i3 + 41;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return endCardArr;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ EndCard createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 83;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        return onExtraCallback(parcel);
                    }
                    onExtraCallback(parcel);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ EndCard[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 87;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    EndCard[] endCardArrIAuthTabCallback = IAuthTabCallback(i);
                    int i5 = onWarmupCompleted + 65;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return endCardArrIAuthTabCallback;
                }

                public final EndCard onExtraCallback(Parcel parcel) {
                    Gradient gradientCreateFromParcel;
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    ArrayList arrayList = null;
                    if (parcel.readInt() == 0) {
                        int i2 = onWarmupCompleted + 13;
                        IAuthTabCallback = i2 % 128;
                        int i3 = i2 % 2;
                        gradientCreateFromParcel = null;
                    } else {
                        gradientCreateFromParcel = Gradient.CREATOR.createFromParcel(parcel);
                    }
                    Gradient gradient = gradientCreateFromParcel;
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        int i4 = onWarmupCompleted + 79;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        int i5 = parcel.readInt();
                        arrayList = new ArrayList(i5);
                        int i6 = 0;
                        while (i6 != i5) {
                            int i7 = onWarmupCompleted + 105;
                            IAuthTabCallback = i7 % 128;
                            if (i7 % 2 == 0) {
                                arrayList.add(EndCardContent.CREATOR.createFromParcel(parcel));
                                i6 += 6;
                            } else {
                                arrayList.add(EndCardContent.CREATOR.createFromParcel(parcel));
                                i6++;
                            }
                        }
                    }
                    return new EndCard(string, string2, gradient, string3, string4, arrayList);
                }
            }

            public EndCard() {
                this((String) null, (String) null, (Gradient) null, (String) null, (String) null, (List) null, 63, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
                int i7 = ~i4;
                int i8 = ~i;
                int i9 = i3 | i7 | i8;
                int i10 = ~(i | i7);
                int i11 = (~(i7 | i8)) | (~i3);
                int i12 = i3 + i4 + i5 + ((-1537480081) * i6) + ((-1176924877) * i2);
                int i13 = i12 * i12;
                int i14 = (((-324914750) * i3) - 1179058176) + ((-1443770816) * i4) + (1588055615 * i9) + (i10 * (-1588055615)) + ((-1588055615) * i11) + (1263140864 * i5) + (1226178560 * i6) + ((-1044512768) * i2) + (1201733632 * i13);
                int i15 = (i3 * 1018573086) + 1206756779 + (i4 * 1018572224) + (i9 * (-431)) + (i10 * 431) + (i11 * 431) + (i5 * 1018572655) + (i6 * (-758184159)) + (i2 * (-595421667)) + (i13 * (-1647378432));
                if (i14 + (i15 * i15 * 1518272512) != 1) {
                    return onWarmupCompleted(objArr);
                }
                EndCard endCard = (EndCard) objArr[0];
                int i16 = 2 % 2;
                int i17 = onNavigationEvent + 3;
                int i18 = i17 % 128;
                onExtraCallbackWithResult = i18;
                int i19 = i17 % 2;
                String str = endCard.ctaText;
                int i20 = i18 + 5;
                onNavigationEvent = i20 % 128;
                int i21 = i20 % 2;
                return str;
            }

            public static /* synthetic */ KSerializer IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnTransact = onTransact();
                int i4 = onNavigationEvent + 51;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnTransact;
            }

            private static final /* synthetic */ KSerializer onTransact() {
                int i = 2 % 2;
                checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(NativeAdsDto$Creative$EndCard$EndCardContent$$serializer.INSTANCE);
                int i2 = onExtraCallbackWithResult + 11;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 99 / 0;
                }
                return checkcanopenlandingpage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 17;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 71;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EndCard)) {
                    return false;
                }
                EndCard endCard = (EndCard) obj;
                if (!Intrinsics.areEqual(this.title, endCard.title)) {
                    int i4 = onExtraCallbackWithResult + 23;
                    onNavigationEvent = i4 % 128;
                    return i4 % 2 == 0;
                }
                if (!Intrinsics.areEqual(this.subTitle, endCard.subTitle)) {
                    int i5 = onNavigationEvent + 63;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.titleGradient, endCard.titleGradient)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.imageUrl, endCard.imageUrl)) {
                    return ((Intrinsics.areEqual(this.ctaText, endCard.ctaText) ^ true) || (Intrinsics.areEqual(this.listContent, endCard.listContent) ^ true)) ? false : true;
                }
                int i7 = onExtraCallbackWithResult + 107;
                int i8 = i7 % 128;
                onNavigationEvent = i8;
                boolean z = !(i7 % 2 != 0);
                int i9 = i8 + 45;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 == 0) {
                    return z;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 17;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.title.hashCode();
                String str = this.subTitle;
                int iHashCode2 = 0;
                int iHashCode3 = str == null ? 0 : str.hashCode();
                Gradient gradient = this.titleGradient;
                int iHashCode4 = gradient == null ? 0 : gradient.hashCode();
                int iHashCode5 = this.imageUrl.hashCode();
                int iHashCode6 = this.ctaText.hashCode();
                List<EndCardContent> list = this.listContent;
                if (list != null) {
                    int i4 = onExtraCallbackWithResult + 53;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        list.hashCode();
                        throw null;
                    }
                    iHashCode2 = list.hashCode();
                }
                return (((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "EndCard(title=" + this.title + ", subTitle=" + this.subTitle + ", titleGradient=" + this.titleGradient + ", imageUrl=" + this.imageUrl + ", ctaText=" + this.ctaText + ", listContent=" + this.listContent + ")";
                int i2 = onExtraCallbackWithResult + 89;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 19 / 0;
                }
                return str;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.title);
                parcel.writeString(this.subTitle);
                Gradient gradient = this.titleGradient;
                if (gradient == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    gradient.writeToParcel(parcel, i);
                }
                parcel.writeString(this.imageUrl);
                parcel.writeString(this.ctaText);
                List<EndCardContent> list = this.listContent;
                if (list == null) {
                    int i3 = onNavigationEvent + 37;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<EndCardContent> it = list.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(parcel, i);
                }
                int i5 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }

            public static final class Companion {
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<EndCard> serializer() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 45;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    NativeAdsDto$Creative$EndCard$$serializer nativeAdsDto$Creative$EndCard$$serializer = NativeAdsDto$Creative$EndCard$$serializer.INSTANCE;
                    int i4 = onExtraCallback + 77;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 27 / 0;
                    }
                    return nativeAdsDto$Creative$EndCard$$serializer;
                }
            }

            static {
                int i = onExtraCallback + 39;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            public /* synthetic */ EndCard(int i, String str, String str2, Gradient gradient, String str3, String str4, List list, okycx okycxVar) {
                if ((i & 1) == 0) {
                    this.title = "";
                } else {
                    this.title = str;
                }
                Object obj = null;
                if ((i & 2) == 0) {
                    this.subTitle = null;
                } else {
                    this.subTitle = str2;
                    int i2 = 2 % 2;
                }
                if ((i & 4) == 0) {
                    this.titleGradient = null;
                } else {
                    this.titleGradient = gradient;
                    int i3 = onExtraCallbackWithResult + 51;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 2 % 2;
                    }
                }
                if ((i & 8) == 0) {
                    int i5 = onExtraCallbackWithResult + 51;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    this.imageUrl = "";
                    if (i6 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                } else {
                    this.imageUrl = str3;
                }
                if ((i & 16) == 0) {
                    this.ctaText = "";
                } else {
                    this.ctaText = str4;
                }
                if ((i & 32) != 0) {
                    this.listContent = list;
                    return;
                }
                int i7 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                this.listContent = null;
            }

            public EndCard(@NotNull String str, @Nullable String str2, @Nullable Gradient gradient, @NotNull String str3, @NotNull String str4, @Nullable List<EndCardContent> list) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                this.title = str;
                this.subTitle = str2;
                this.titleGradient = gradient;
                this.imageUrl = str3;
                this.ctaText = str4;
                this.listContent = list;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void onExtraCallback(EndCard endCard, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                Object obj = null;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                    int i2 = onExtraCallbackWithResult + 73;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        Intrinsics.areEqual(endCard.title, "");
                        throw null;
                    }
                    if (!Intrinsics.areEqual(endCard.title, "")) {
                        vylVar.onExtraCallback(serialDescriptor, 0, endCard.title);
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                    int i3 = onExtraCallbackWithResult + 17;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    if (endCard.subTitle != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, endCard.subTitle);
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 2) || endCard.titleGradient != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 2, NativeAdsDto$Creative$EndCard$Gradient$$serializer.INSTANCE, endCard.titleGradient);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                    int i5 = onExtraCallbackWithResult + 93;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    if (!Intrinsics.areEqual(endCard.imageUrl, "")) {
                        vylVar.onExtraCallback(serialDescriptor, 3, endCard.imageUrl);
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
                    int i7 = onExtraCallbackWithResult + 113;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        Intrinsics.areEqual(endCard.ctaText, "");
                        obj.hashCode();
                        throw null;
                    }
                    if (true ^ Intrinsics.areEqual(endCard.ctaText, "")) {
                        vylVar.onExtraCallback(serialDescriptor, 4, endCard.ctaText);
                        int i8 = onNavigationEvent + 119;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
                    int i10 = onExtraCallbackWithResult + 39;
                    onNavigationEvent = i10 % 128;
                    if (i10 % 2 == 0) {
                        List<EndCardContent> list = endCard.listContent;
                        throw null;
                    }
                    if (endCard.listContent == null) {
                        return;
                    }
                }
                vylVar.onExtraCallbackWithResult(serialDescriptor, 5, (py) lazyArr[5].getValue(), endCard.listContent);
            }

            public static final /* synthetic */ Lazy[] onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 73;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                int i4 = i2 + 121;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return lazyArr;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ EndCard(String str, String str2, Gradient gradient, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str5;
                Gradient gradient2;
                String str6;
                if ((i & 1) != 0) {
                    int i2 = onExtraCallbackWithResult + 43;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    str = "";
                }
                List list2 = null;
                if ((i & 2) != 0) {
                    int i4 = onNavigationEvent + 121;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 2 % 2;
                    }
                    str5 = null;
                } else {
                    str5 = str2;
                }
                if ((i & 4) != 0) {
                    int i6 = 2 % 2;
                    gradient2 = null;
                } else {
                    gradient2 = gradient;
                }
                if ((i & 8) != 0) {
                    int i7 = onNavigationEvent + 1;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 2 % 2;
                    }
                    str6 = "";
                } else {
                    str6 = str3;
                }
                String str7 = (i & 16) == 0 ? str4 : "";
                if ((i & 32) != 0) {
                    int i9 = onNavigationEvent + 121;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    list2 = list;
                }
                this(str, str5, gradient2, str6, str7, list2);
            }

            public final String IAuthTabCallbackDefault() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 39;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                String str = this.title;
                int i5 = i2 + 59;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
                EndCard endCard = (EndCard) objArr[0];
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 69;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                String str = endCard.subTitle;
                if (i4 == 0) {
                    throw null;
                }
                int i5 = i3 + 61;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 34 / 0;
                }
                return str;
            }

            public final Gradient IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 33;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                Gradient gradient = this.titleGradient;
                int i4 = i2 + 25;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return gradient;
            }

            public final String onWarmupCompleted() {
                String str;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 33;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    str = this.imageUrl;
                    int i4 = 15 / 0;
                } else {
                    str = this.imageUrl;
                }
                int i5 = i2 + 55;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final List<EndCardContent> onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 77;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                List<EndCardContent> list = this.listContent;
                int i5 = i2 + 1;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 88 / 0;
                }
                return list;
            }

            @liq
            public static final class Gradient implements Parcelable {
                public static final int $stable = 0;
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;
                private static int onWarmupCompleted;
                private final String endColor;
                private final String startColor;
                public static final Companion Companion = new Companion(null);
                public static final Parcelable.Creator<Gradient> CREATOR = new onExtraCallbackWithResult();

                public static final class onExtraCallbackWithResult implements Parcelable.Creator<Gradient> {
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Gradient IAuthTabCallback(Parcel parcel) {
                        int i = 2 % 2;
                        Intrinsics.checkNotNullParameter(parcel, "");
                        Gradient gradient = new Gradient(parcel.readString(), parcel.readString());
                        int i2 = onNavigationEvent + 95;
                        onExtraCallback = i2 % 128;
                        if (i2 % 2 != 0) {
                            return gradient;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    @Override // android.os.Parcelable.Creator
                    public /* synthetic */ Gradient createFromParcel(Parcel parcel) {
                        int i = 2 % 2;
                        int i2 = onNavigationEvent + 83;
                        onExtraCallback = i2 % 128;
                        int i3 = i2 % 2;
                        Gradient gradientIAuthTabCallback = IAuthTabCallback(parcel);
                        int i4 = onNavigationEvent + 71;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        return gradientIAuthTabCallback;
                    }

                    @Override // android.os.Parcelable.Creator
                    public /* synthetic */ Gradient[] newArray(int i) {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallback + 41;
                        onNavigationEvent = i3 % 128;
                        int i4 = i3 % 2;
                        Gradient[] gradientArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                        int i5 = onNavigationEvent + 35;
                        onExtraCallback = i5 % 128;
                        if (i5 % 2 != 0) {
                            return gradientArrOnExtraCallbackWithResult;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    public final Gradient[] onExtraCallbackWithResult(int i) {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallback;
                        int i4 = i3 + 11;
                        onNavigationEvent = i4 % 128;
                        Gradient[] gradientArr = new Gradient[i];
                        if (i4 % 2 != 0) {
                            throw null;
                        }
                        int i5 = i3 + 43;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        return gradientArr;
                    }
                }

                static {
                    int i = onWarmupCompleted + 45;
                    onExtraCallback = i % 128;
                    int i2 = i % 2;
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public Gradient() {
                    String str = null;
                    this(str, str, 3, (DefaultConstructorMarker) str);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 53;
                    onNavigationEvent = i2 % 128;
                    return i2 % 2 != 0 ? 1 : 0;
                }

                public boolean equals(@Nullable Object obj) {
                    int i = 2 % 2;
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Gradient)) {
                        return false;
                    }
                    Gradient gradient = (Gradient) obj;
                    if (!Intrinsics.areEqual(this.startColor, gradient.startColor)) {
                        return false;
                    }
                    if (Intrinsics.areEqual(this.endColor, gradient.endColor)) {
                        int i2 = onNavigationEvent + 81;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        return true;
                    }
                    int i4 = onExtraCallbackWithResult + 53;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 77;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    int iHashCode = this.startColor.hashCode();
                    return i3 == 0 ? (iHashCode << 66) >> this.endColor.hashCode() : (iHashCode * 31) + this.endColor.hashCode();
                }

                public String toString() {
                    int i = 2 % 2;
                    String str = "Gradient(startColor=" + this.startColor + ", endColor=" + this.endColor + ")";
                    int i2 = onNavigationEvent + 43;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    return str;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel parcel, int i) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 13;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    String str = this.startColor;
                    if (i4 != 0) {
                        parcel.writeString(str);
                        parcel.writeString(this.endColor);
                    } else {
                        parcel.writeString(str);
                        parcel.writeString(this.endColor);
                        throw null;
                    }
                }

                public static final class Companion {
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<Gradient> serializer() {
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 73;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        NativeAdsDto$Creative$EndCard$Gradient$$serializer nativeAdsDto$Creative$EndCard$Gradient$$serializer = NativeAdsDto$Creative$EndCard$Gradient$$serializer.INSTANCE;
                        int i4 = onExtraCallbackWithResult + 15;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        return nativeAdsDto$Creative$EndCard$Gradient$$serializer;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public /* synthetic */ Gradient(int i, String str, String str2, okycx okycxVar) {
                    if ((i & 1) == 0) {
                        this.startColor = "";
                        int i2 = onNavigationEvent + 119;
                        onExtraCallbackWithResult = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i3 = 2 % 2;
                        }
                    } else {
                        this.startColor = str;
                        int i4 = onNavigationEvent + 59;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 != 0) {
                        }
                    }
                    if ((i & 2) == 0) {
                        this.endColor = "";
                    } else {
                        this.endColor = str2;
                    }
                }

                public Gradient(@NotNull String str, @NotNull String str2) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    this.startColor = str;
                    this.endColor = str2;
                }

                @JvmStatic
                public static final /* synthetic */ void IAuthTabCallback(Gradient gradient, vyl vylVar, SerialDescriptor serialDescriptor) {
                    int i = 2 % 2;
                    if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(gradient.startColor, "")) {
                        vylVar.onExtraCallback(serialDescriptor, 0, gradient.startColor);
                    }
                    if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                        int i2 = onNavigationEvent + 1;
                        onExtraCallbackWithResult = i2 % 128;
                        if (i2 % 2 == 0) {
                            Intrinsics.areEqual(gradient.endColor, "");
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (Intrinsics.areEqual(gradient.endColor, "")) {
                            return;
                        }
                    }
                    vylVar.onExtraCallback(serialDescriptor, 1, gradient.endColor);
                    int i3 = onExtraCallbackWithResult + 107;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public /* synthetic */ Gradient(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    if ((i & 1) != 0) {
                        int i2 = onExtraCallbackWithResult + 75;
                        onNavigationEvent = i2 % 128;
                        if (i2 % 2 != 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        str = "";
                    }
                    if ((i & 2) != 0) {
                        int i3 = onExtraCallbackWithResult + 35;
                        onNavigationEvent = i3 % 128;
                        int i4 = i3 % 2;
                        int i5 = 2 % 2;
                        str2 = "";
                    }
                    this(str, str2);
                }

                public final String onExtraCallback() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 67;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    String str = this.startColor;
                    if (i3 == 0) {
                        int i4 = 56 / 0;
                    }
                    return str;
                }

                public final String onNavigationEvent() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 99;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    String str = this.endColor;
                    if (i3 != 0) {
                        int i4 = 52 / 0;
                    }
                    return str;
                }
            }

            @liq
            public static final class EndCardContent implements Parcelable {
                public static final int $stable = 0;
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted = 1;
                private final String description;
                private final String iconImageUrl;
                public static final Companion Companion = new Companion(null);
                public static final Parcelable.Creator<EndCardContent> CREATOR = new onWarmupCompleted();

                public static final class onWarmupCompleted implements Parcelable.Creator<EndCardContent> {
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final EndCardContent IAuthTabCallback(Parcel parcel) {
                        int i = 2 % 2;
                        Intrinsics.checkNotNullParameter(parcel, "");
                        EndCardContent endCardContent = new EndCardContent(parcel.readString(), parcel.readString());
                        int i2 = onExtraCallbackWithResult + 109;
                        onExtraCallback = i2 % 128;
                        int i3 = i2 % 2;
                        return endCardContent;
                    }

                    @Override // android.os.Parcelable.Creator
                    public /* synthetic */ EndCardContent createFromParcel(Parcel parcel) {
                        int i = 2 % 2;
                        int i2 = onExtraCallback + 15;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        EndCardContent endCardContentIAuthTabCallback = IAuthTabCallback(parcel);
                        int i4 = onExtraCallback + 91;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                        return endCardContentIAuthTabCallback;
                    }

                    @Override // android.os.Parcelable.Creator
                    public /* synthetic */ EndCardContent[] newArray(int i) {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallback + 119;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                        EndCardContent[] endCardContentArrOnWarmupCompleted = onWarmupCompleted(i);
                        int i5 = onExtraCallbackWithResult + 23;
                        onExtraCallback = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 63 / 0;
                        }
                        return endCardContentArrOnWarmupCompleted;
                    }

                    public final EndCardContent[] onWarmupCompleted(int i) {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallbackWithResult;
                        int i4 = i3 + 35;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        EndCardContent[] endCardContentArr = new EndCardContent[i];
                        int i6 = i3 + 25;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        return endCardContentArr;
                    }
                }

                static {
                    int i = IAuthTabCallback + 67;
                    onExtraCallbackWithResult = i % 128;
                    int i2 = i % 2;
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public EndCardContent() {
                    String str = null;
                    this(str, str, 3, (DefaultConstructorMarker) str);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 107;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    return 0;
                }

                public boolean equals(@Nullable Object obj) {
                    int i = 2 % 2;
                    if (this == obj) {
                        int i2 = onWarmupCompleted + 63;
                        onExtraCallback = i2 % 128;
                        int i3 = i2 % 2;
                        return true;
                    }
                    if (!(!(obj instanceof EndCardContent))) {
                        EndCardContent endCardContent = (EndCardContent) obj;
                        return Intrinsics.areEqual(this.iconImageUrl, endCardContent.iconImageUrl) && Intrinsics.areEqual(this.description, endCardContent.description);
                    }
                    int i4 = onExtraCallback + 75;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }

                public int hashCode() {
                    int iHashCode;
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted;
                    int i3 = i2 + 39;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    String str = this.iconImageUrl;
                    if (str == null) {
                        int i5 = i2 + 95;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        iHashCode = 0;
                    } else {
                        iHashCode = str.hashCode();
                    }
                    return (iHashCode * 31) + this.description.hashCode();
                }

                public String toString() {
                    int i = 2 % 2;
                    String str = "EndCardContent(iconImageUrl=" + this.iconImageUrl + ", description=" + this.description + ")";
                    int i2 = onExtraCallback + 49;
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
                    int i3 = onWarmupCompleted + 17;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.writeString(this.iconImageUrl);
                    parcel.writeString(this.description);
                    if (i4 != 0) {
                        int i5 = 3 / 0;
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

                    public final KSerializer<EndCardContent> serializer() {
                        int i = 2 % 2;
                        int i2 = onNavigationEvent + 83;
                        onExtraCallback = i2 % 128;
                        if (i2 % 2 != 0) {
                            NativeAdsDto$Creative$EndCard$EndCardContent$$serializer nativeAdsDto$Creative$EndCard$EndCardContent$$serializer = NativeAdsDto$Creative$EndCard$EndCardContent$$serializer.INSTANCE;
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        NativeAdsDto$Creative$EndCard$EndCardContent$$serializer nativeAdsDto$Creative$EndCard$EndCardContent$$serializer2 = NativeAdsDto$Creative$EndCard$EndCardContent$$serializer.INSTANCE;
                        int i3 = onNavigationEvent + 37;
                        onExtraCallback = i3 % 128;
                        int i4 = i3 % 2;
                        return nativeAdsDto$Creative$EndCard$EndCardContent$$serializer2;
                    }
                }

                public /* synthetic */ EndCardContent(int i, String str, String str2, okycx okycxVar) {
                    this.iconImageUrl = (i & 1) == 0 ? null : str;
                    if ((i & 2) != 0) {
                        this.description = str2;
                        return;
                    }
                    int i2 = onWarmupCompleted + 99;
                    int i3 = i2 % 128;
                    onExtraCallback = i3;
                    int i4 = i2 % 2;
                    this.description = "";
                    int i5 = i3 + 65;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                }

                public EndCardContent(@Nullable String str, @NotNull String str2) {
                    Intrinsics.checkNotNullParameter(str2, "");
                    this.iconImageUrl = str;
                    this.description = str2;
                }

                @JvmStatic
                public static final /* synthetic */ void onExtraCallbackWithResult(EndCardContent endCardContent, vyl vylVar, SerialDescriptor serialDescriptor) {
                    int i = 2 % 2;
                    if (vylVar.onWarmupCompleted(serialDescriptor, 0) || endCardContent.iconImageUrl != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, endCardContent.iconImageUrl);
                    }
                    if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                        int i2 = onExtraCallback + 29;
                        onWarmupCompleted = i2 % 128;
                        int i3 = i2 % 2;
                        if (Intrinsics.areEqual(endCardContent.description, "")) {
                            return;
                        }
                    }
                    vylVar.onExtraCallback(serialDescriptor, 1, endCardContent.description);
                    int i4 = onExtraCallback + 79;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public /* synthetic */ EndCardContent(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    if ((i & 1) != 0) {
                        int i2 = onWarmupCompleted + 73;
                        onExtraCallback = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i3 = 58 / 0;
                        }
                        str = null;
                    }
                    if ((i & 2) != 0) {
                        int i4 = onExtraCallback + 93;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 == 0) {
                            throw null;
                        }
                        str2 = "";
                        int i5 = 2 % 2;
                    }
                    this(str, str2);
                }

                public final String onExtraCallbackWithResult() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 31;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        return this.iconImageUrl;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final String onNavigationEvent() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback;
                    int i3 = i2 + 81;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    String str = this.description;
                    int i5 = i2 + 93;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return str;
                }
            }

            public final String onExtraCallbackWithResult() {
                int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                return (String) IAuthTabCallback(iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 379248949, -379248948, new Object[]{this}, iOnNavigationEvent2, iOnNavigationEvent3);
            }

            public final String asInterface() {
                int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                return (String) IAuthTabCallback(iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1229612249, 1229612249, new Object[]{this}, iOnNavigationEvent2, iOnNavigationEvent3);
            }
        }

        @nc(IAuthTabCallback = "styleId")
        @liq
        public static final class RightBanner extends Creative {
            public static final int $stable = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            private final String adClearanceText;
            private final String id;
            private final String imageUrl;
            private final String landingUrl;
            private final String subTitle;
            private final String title;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<RightBanner> CREATOR = new IAuthTabCallback();

            public static final class IAuthTabCallback implements Parcelable.Creator<RightBanner> {
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ RightBanner createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 71;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    RightBanner rightBannerOnWarmupCompleted = onWarmupCompleted(parcel);
                    int i4 = onExtraCallback + 45;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return rightBannerOnWarmupCompleted;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ RightBanner[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 35;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    RightBanner[] rightBannerArrOnExtraCallback = onExtraCallback(i);
                    if (i4 == 0) {
                        int i5 = 98 / 0;
                    }
                    return rightBannerArrOnExtraCallback;
                }

                public final RightBanner[] onExtraCallback(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback;
                    int i4 = i3 + 71;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    RightBanner[] rightBannerArr = new RightBanner[i];
                    int i6 = i3 + 57;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        return rightBannerArr;
                    }
                    throw null;
                }

                public final RightBanner onWarmupCompleted(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    RightBanner rightBanner = new RightBanner(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    int i2 = onExtraCallback + 41;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    return rightBanner;
                }
            }

            static {
                int i = onExtraCallbackWithResult + 115;
                onWarmupCompleted = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            public RightBanner() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 53;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 111;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return 0;
                }
                throw null;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 33;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                if (this == obj) {
                    int i5 = i3 + 123;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
                if (!(obj instanceof RightBanner)) {
                    return false;
                }
                RightBanner rightBanner = (RightBanner) obj;
                if (!Intrinsics.areEqual(this.id, rightBanner.id)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.imageUrl, rightBanner.imageUrl)) {
                    int i7 = onExtraCallback + 83;
                    onNavigationEvent = i7 % 128;
                    return i7 % 2 != 0;
                }
                if (!Intrinsics.areEqual(this.title, rightBanner.title) || !Intrinsics.areEqual(this.subTitle, rightBanner.subTitle) || !Intrinsics.areEqual(this.landingUrl, rightBanner.landingUrl)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.adClearanceText, rightBanner.adClearanceText)) {
                    return true;
                }
                int i8 = onExtraCallback + 93;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int iHashCode2 = this.id.hashCode();
                int iHashCode3 = this.imageUrl.hashCode();
                int iHashCode4 = this.title.hashCode();
                int iHashCode5 = this.subTitle.hashCode();
                int iHashCode6 = this.landingUrl.hashCode();
                String str = this.adClearanceText;
                if (str == null) {
                    int i2 = onNavigationEvent + 73;
                    int i3 = i2 % 128;
                    onExtraCallback = i3;
                    int i4 = i2 % 2;
                    int i5 = i3 + 95;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = str.hashCode();
                }
                int i7 = (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode;
                int i8 = onExtraCallback + 19;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 79 / 0;
                }
                return i7;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "RightBanner(id=" + this.id + ", imageUrl=" + this.imageUrl + ", title=" + this.title + ", subTitle=" + this.subTitle + ", landingUrl=" + this.landingUrl + ", adClearanceText=" + this.adClearanceText + ")";
                int i2 = onExtraCallback + 1;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 28 / 0;
                }
                return str;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 37;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.id);
                parcel.writeString(this.imageUrl);
                parcel.writeString(this.title);
                parcel.writeString(this.subTitle);
                parcel.writeString(this.landingUrl);
                parcel.writeString(this.adClearanceText);
                int i5 = onNavigationEvent + 71;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }

            public static final class Companion {
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<RightBanner> serializer() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 35;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    NativeAdsDto$Creative$RightBanner$$serializer nativeAdsDto$Creative$RightBanner$$serializer = NativeAdsDto$Creative$RightBanner$$serializer.INSTANCE;
                    int i4 = IAuthTabCallback + 85;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return nativeAdsDto$Creative$RightBanner$$serializer;
                }
            }

            public /* synthetic */ RightBanner(int i, String str, String str2, String str3, String str4, String str5, String str6, okycx okycxVar) {
                super(i, okycxVar);
                if ((i & 1) == 0) {
                    this.id = "";
                    int i2 = 2 % 2;
                } else {
                    this.id = str;
                }
                if ((i & 2) == 0) {
                    int i3 = onNavigationEvent + 69;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    this.imageUrl = "";
                } else {
                    this.imageUrl = str2;
                    int i5 = 2 % 2;
                }
                Object obj = null;
                if ((i & 4) == 0) {
                    int i6 = onNavigationEvent + 97;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    this.title = "";
                    if (i7 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                } else {
                    this.title = str3;
                }
                if ((i & 8) == 0) {
                    int i8 = onNavigationEvent + 63;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    this.subTitle = "";
                    if (i9 == 0) {
                        int i10 = 29 / 0;
                    }
                    int i11 = 2 % 2;
                } else {
                    this.subTitle = str4;
                }
                if ((i & 16) == 0) {
                    this.landingUrl = "";
                } else {
                    this.landingUrl = str5;
                    int i12 = 2 % 2;
                }
                if ((i & 32) != 0) {
                    this.adClearanceText = str6;
                    return;
                }
                int i13 = onNavigationEvent + 117;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
                this.adClearanceText = null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RightBanner(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                this.id = str;
                this.imageUrl = str2;
                this.title = str3;
                this.subTitle = str4;
                this.landingUrl = str5;
                this.adClearanceText = str6;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void IAuthTabCallback(RightBanner rightBanner, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                if (!(!vylVar.onWarmupCompleted(serialDescriptor, 0)) || !Intrinsics.areEqual(rightBanner.IAuthTabCallback(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 0, rightBanner.IAuthTabCallback());
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                    int i2 = onNavigationEvent + 117;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        Intrinsics.areEqual(rightBanner.imageUrl, "");
                        throw null;
                    }
                    if (!Intrinsics.areEqual(rightBanner.imageUrl, "")) {
                        vylVar.onExtraCallback(serialDescriptor, 1, rightBanner.imageUrl);
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(rightBanner.asInterface(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 2, rightBanner.asInterface());
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                    int i3 = onNavigationEvent + 97;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    if (!Intrinsics.areEqual(rightBanner.IAuthTabCallbackStub(), "")) {
                        vylVar.onExtraCallback(serialDescriptor, 3, rightBanner.IAuthTabCallbackStub());
                    }
                }
                if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(rightBanner.onWarmupCompleted(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 4, rightBanner.onWarmupCompleted());
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
                    int i5 = onExtraCallback + 59;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    String str = rightBanner.adClearanceText;
                    if (i6 != 0) {
                        int i7 = 86 / 0;
                        if (str == null) {
                            return;
                        }
                    } else if (str == null) {
                        return;
                    }
                }
                vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, rightBanner.adClearanceText);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ RightBanner(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str7;
                String str8 = "";
                if ((i & 1) != 0) {
                    int i2 = onNavigationEvent + 45;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                    str = "";
                }
                if ((i & 2) != 0) {
                    int i5 = 2 % 2;
                    str7 = "";
                } else {
                    str7 = str2;
                }
                String str9 = (i & 4) != 0 ? "" : str3;
                String str10 = (i & 8) != 0 ? "" : str4;
                if ((i & 16) != 0) {
                    int i6 = onExtraCallback + 47;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 3 % 2;
                    } else {
                        int i8 = 2 % 2;
                    }
                } else {
                    str8 = str5;
                }
                if ((i & 32) != 0) {
                    int i9 = 2 % 2;
                    str6 = null;
                }
                this(str, str7, str9, str10, str8, str6);
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 31;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                String str = this.id;
                int i5 = i3 + 99;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final String asBinder() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 37;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                String str = this.imageUrl;
                int i5 = i2 + 39;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String asInterface() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 57;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                String str = this.title;
                int i5 = i2 + 65;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 3;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.subTitle;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 41;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                String str = this.landingUrl;
                int i5 = i3 + 39;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 54 / 0;
                }
                return str;
            }

            public final String IAuthTabCallbackDefault() {
                String str;
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 37;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    str = this.adClearanceText;
                    int i4 = 35 / 0;
                } else {
                    str = this.adClearanceText;
                }
                int i5 = i2 + 57;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @liq
        public static final class None extends Creative {
            public static final int $stable = 0;
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            private final String id;
            private final String landingUrl;
            private final String subTitle;
            private final String title;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<None> CREATOR = new onExtraCallback();

            public static final class onExtraCallback implements Parcelable.Creator<None> {
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final None IAuthTabCallback(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    None none = new None(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    int i2 = IAuthTabCallback + 125;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    return none;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ None createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 9;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    None noneIAuthTabCallback = IAuthTabCallback(parcel);
                    int i4 = onExtraCallbackWithResult + 37;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return noneIAuthTabCallback;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ None[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 69;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    None[] noneArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                    if (i4 != 0) {
                        int i5 = 22 / 0;
                    }
                    int i6 = onExtraCallbackWithResult + 83;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return noneArrOnExtraCallbackWithResult;
                }

                public final None[] onExtraCallbackWithResult(int i) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 29;
                    int i4 = i3 % 128;
                    onExtraCallbackWithResult = i4;
                    int i5 = i3 % 2;
                    None[] noneArr = new None[i];
                    int i6 = i4 + 89;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return noneArr;
                }
            }

            static {
                int i = onWarmupCompleted + 35;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            public None() {
                this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 33;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 125;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onExtraCallbackWithResult + 57;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(obj instanceof None)) {
                    int i4 = onExtraCallbackWithResult + 99;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                None none = (None) obj;
                if (!Intrinsics.areEqual(this.id, none.id)) {
                    int i6 = onNavigationEvent + 1;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if ((!Intrinsics.areEqual(this.title, none.title)) || !Intrinsics.areEqual(this.subTitle, none.subTitle)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.landingUrl, none.landingUrl)) {
                    return true;
                }
                int i8 = onNavigationEvent + 87;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 89;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.id.hashCode();
                return i3 == 0 ? (((((iHashCode * 63) - this.title.hashCode()) % 125) % this.subTitle.hashCode()) / 72) << this.landingUrl.hashCode() : (((((iHashCode * 31) + this.title.hashCode()) * 31) + this.subTitle.hashCode()) * 31) + this.landingUrl.hashCode();
            }

            public String toString() {
                int i = 2 % 2;
                String str = "None(id=" + this.id + ", title=" + this.title + ", subTitle=" + this.subTitle + ", landingUrl=" + this.landingUrl + ")";
                int i2 = onExtraCallbackWithResult + 81;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 69;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.id);
                parcel.writeString(this.title);
                parcel.writeString(this.subTitle);
                parcel.writeString(this.landingUrl);
                int i5 = onExtraCallbackWithResult + 35;
                onNavigationEvent = i5 % 128;
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

                public final KSerializer<None> serializer() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 65;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    NativeAdsDto$Creative$None$$serializer nativeAdsDto$Creative$None$$serializer = NativeAdsDto$Creative$None$$serializer.INSTANCE;
                    if (i3 != 0) {
                        return nativeAdsDto$Creative$None$$serializer;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public /* synthetic */ None(int i, String str, String str2, String str3, String str4, okycx okycxVar) {
                super(i, okycxVar);
                if ((i & 1) == 0) {
                    this.id = "";
                } else {
                    this.id = str;
                }
                if ((i & 2) == 0) {
                    this.title = "";
                } else {
                    this.title = str2;
                    int i2 = onExtraCallbackWithResult + 41;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 5 / 3;
                    } else {
                        int i4 = 2 % 2;
                    }
                }
                if ((i & 4) == 0) {
                    this.subTitle = "";
                    int i5 = onExtraCallbackWithResult + 79;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 5 % 4;
                    } else {
                        int i7 = 2 % 2;
                    }
                } else {
                    this.subTitle = str3;
                    int i8 = onExtraCallbackWithResult + 67;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 5 / 3;
                    }
                }
                if ((i & 8) == 0) {
                    this.landingUrl = "";
                    return;
                }
                this.landingUrl = str4;
                int i10 = onNavigationEvent + 21;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public None(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                this.id = str;
                this.title = str2;
                this.subTitle = str3;
                this.landingUrl = str4;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void onWarmupCompleted(None none, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                    int i2 = onNavigationEvent + 123;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    if (!Intrinsics.areEqual(none.IAuthTabCallback(), "")) {
                        vylVar.onExtraCallback(serialDescriptor, 0, none.IAuthTabCallback());
                        int i4 = onNavigationEvent + 51;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                    int i6 = onNavigationEvent + 119;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        Intrinsics.areEqual(none.asInterface(), "");
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (!Intrinsics.areEqual(none.asInterface(), "")) {
                        vylVar.onExtraCallback(serialDescriptor, 1, none.asInterface());
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                    int i7 = onNavigationEvent + 1;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    if (!Intrinsics.areEqual(none.IAuthTabCallbackStub(), "")) {
                        vylVar.onExtraCallback(serialDescriptor, 2, none.IAuthTabCallbackStub());
                        int i9 = onNavigationEvent + 91;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                    int i11 = onNavigationEvent + 99;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    if (Intrinsics.areEqual(none.onWarmupCompleted(), "")) {
                        return;
                    }
                }
                vylVar.onExtraCallback(serialDescriptor, 3, none.onWarmupCompleted());
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ None(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = onExtraCallbackWithResult + 13;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                    str = "";
                }
                str2 = (i & 2) != 0 ? "" : str2;
                if ((i & 4) != 0) {
                    int i5 = onExtraCallbackWithResult + 125;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 12 / 0;
                    }
                    str3 = "";
                }
                this(str, str2, str3, (i & 8) != 0 ? "" : str4);
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 13;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                String str = this.id;
                int i5 = i3 + 19;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String asInterface() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 123;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                String str = this.title;
                int i5 = i3 + 25;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 68 / 0;
                }
                return str;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String IAuthTabCallbackStub() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 71;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                String str = this.subTitle;
                if (i3 == 0) {
                    int i4 = 89 / 0;
                }
                return str;
            }

            @Override // im.toss.ads_sdk.model.NativeAdsDto.Creative
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.landingUrl;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    public final String onWarmupCompleted() throws Throwable {
        String strIntern;
        Object obj;
        int i = 2 % 2;
        AdAsset adAsset = (AdAsset) CollectionsKt.firstOrNull(this.ads);
        Object obj2 = null;
        if (adAsset != null) {
            int i2 = IAuthTabCallback + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            strIntern = adAsset.onExtraCallback();
        } else {
            strIntern = null;
        }
        if (strIntern == null) {
            strIntern = "";
        }
        if (StringsKt.isBlank(strIntern)) {
            int i4 = IAuthTabCallback + 81;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(new char[]{18627}, 19087 % KeyEvent.keyCodeFromString(""), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{18627}, KeyEvent.keyCodeFromString("") + 17807, objArr2);
                obj = objArr2[0];
            }
            strIntern = ((String) obj).intern();
        }
        int i5 = onExtraCallback + 25;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return strIntern;
        }
        obj2.hashCode();
        throw null;
    }

    public final boolean access100() throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new char[]{18624}, Drawable.resolveOpacity(0, 0) + 1759, objArr);
        boolean zAreEqual = Intrinsics.areEqual(strOnWarmupCompleted, ((String) objArr[0]).intern());
        int i4 = onExtraCallback + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zAreEqual;
    }

    public final NativeAdsDto onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        List<AdAsset> list = this.ads;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i2 = IAuthTabCallback + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add(AdAsset.onExtraCallbackWithResult((AdAsset) it.next(), null, null, str, null, null, null, null, 123, null));
        }
        NativeAdsDto nativeAdsDtoOnExtraCallbackWithResult = onExtraCallbackWithResult(this, null, null, null, null, arrayList, null, 47, null);
        int i4 = onExtraCallback + 61;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return nativeAdsDtoOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | i6;
        int i10 = ~(i4 | i2);
        int i11 = i9 | i10;
        int i12 = ~i6;
        int i13 = (~(i12 | i2)) | (~(i12 | i4)) | i10;
        int i14 = (~(i7 | i2)) | (~(i8 | i4));
        int i15 = i4 + i2 + i5 + (1040777104 * i) + ((-1861505373) * i3);
        int i16 = i15 * i15;
        int i17 = (i4 * (-1036928585)) + 527892480 + ((-1036928585) * i2) + ((-562525036) * i11) + (562525036 * i13) + ((-281262518) * i14) + ((-1318191104) * i5) + (1608515584 * i) + ((-1123418112) * i3) + ((-2114519040) * i16);
        int i18 = (i4 * 1703033811) + 1712528133 + (i2 * 1703033811) + (i11 * 1508) + (i13 * (-1508)) + (i14 * 754) + (i5 * 1703034565) + (i * (-2114876976)) + (i3 * 1880022383) + (i16 * (-720175104));
        if (i17 + (i18 * i18 * (-739180544)) == 1) {
            return onWarmupCompleted(objArr);
        }
        int i19 = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AdAsset.onNavigationEvent.onNavigationEvent);
        int i20 = onExtraCallback + 5;
        IAuthTabCallback = i20 % 128;
        int i21 = i20 % 2;
        return checkcanopenlandingpage;
    }

    private static final /* synthetic */ KSerializer getInterfaceDescriptor() {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (KSerializer) onExtraCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 517500148, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -517500148, new Object[0], iOnWarmupCompleted2, iOnWarmupCompleted);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Object[] objArr = {this, parcel, Integer.valueOf(i)};
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        onExtraCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1301866920, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1301866919, objArr, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted);
    }

    static void access000() {
        onExtraCallbackWithResult = -7557791521555952187L;
    }
}
