package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import ua.naiksoftware.stomp.dto.StompCommand;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class AudienceNetworkRemoteServiceApiMessageHandler implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AudienceNetworkRemoteServiceApiMessageHandler[] $VALUES;
    public static final Parcelable.Creator<AudienceNetworkRemoteServiceApiMessageHandler> CREATOR;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final AudienceNetworkRemoteServiceApiMessageHandler SUBSCRIBE = new AudienceNetworkRemoteServiceApiMessageHandler(StompCommand.SUBSCRIBE, 0);
    public static final AudienceNetworkRemoteServiceApiMessageHandler SUPPORT_VENDOR = new AudienceNetworkRemoteServiceApiMessageHandler("SUPPORT_VENDOR", 1);
    public static final AudienceNetworkRemoteServiceApiMessageHandler NOT_SUPPORT_VENDOR = new AudienceNetworkRemoteServiceApiMessageHandler("NOT_SUPPORT_VENDOR", 2);
    public static final AudienceNetworkRemoteServiceApiMessageHandler CARD_NOT_REGISTERED = new AudienceNetworkRemoteServiceApiMessageHandler("CARD_NOT_REGISTERED", 3);

    private static final /* synthetic */ AudienceNetworkRemoteServiceApiMessageHandler[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 33;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        AudienceNetworkRemoteServiceApiMessageHandler[] audienceNetworkRemoteServiceApiMessageHandlerArr = {SUBSCRIBE, SUPPORT_VENDOR, NOT_SUPPORT_VENDOR, CARD_NOT_REGISTERED};
        int i5 = i2 + 53;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return audienceNetworkRemoteServiceApiMessageHandlerArr;
    }

    public static EnumEntries<AudienceNetworkRemoteServiceApiMessageHandler> getEntries() {
        EnumEntries<AudienceNetworkRemoteServiceApiMessageHandler> enumEntries;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 57;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            enumEntries = $ENTRIES;
            int i4 = 31 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i2 + 117;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return enumEntries;
    }

    public static AudienceNetworkRemoteServiceApiMessageHandler valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AudienceNetworkRemoteServiceApiMessageHandler audienceNetworkRemoteServiceApiMessageHandler = (AudienceNetworkRemoteServiceApiMessageHandler) Enum.valueOf(AudienceNetworkRemoteServiceApiMessageHandler.class, str);
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        int i5 = onExtraCallback + 65;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return audienceNetworkRemoteServiceApiMessageHandler;
    }

    public static AudienceNetworkRemoteServiceApiMessageHandler[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AudienceNetworkRemoteServiceApiMessageHandler[] audienceNetworkRemoteServiceApiMessageHandlerArr = (AudienceNetworkRemoteServiceApiMessageHandler[]) $VALUES.clone();
        int i4 = onNavigationEvent + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return audienceNetworkRemoteServiceApiMessageHandlerArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 51;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 125;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 45;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        String strName = name();
        if (i4 != 0) {
            parcel.writeString(strName);
        } else {
            parcel.writeString(strName);
            throw null;
        }
    }

    private AudienceNetworkRemoteServiceApiMessageHandler(String str, int i) {
    }

    static {
        AudienceNetworkRemoteServiceApiMessageHandler[] audienceNetworkRemoteServiceApiMessageHandlerArr$values = $values();
        $VALUES = audienceNetworkRemoteServiceApiMessageHandlerArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(audienceNetworkRemoteServiceApiMessageHandlerArr$values);
        CREATOR = new Parcelable.Creator<AudienceNetworkRemoteServiceApiMessageHandler>() { // from class: o.AudienceNetworkRemoteServiceApiMessageHandler.onWarmupCompleted
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final AudienceNetworkRemoteServiceApiMessageHandler IAuthTabCallback(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 19;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
                AudienceNetworkRemoteServiceApiMessageHandler audienceNetworkRemoteServiceApiMessageHandlerValueOf = AudienceNetworkRemoteServiceApiMessageHandler.valueOf(parcel.readString());
                int i4 = onWarmupCompleted + 105;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return audienceNetworkRemoteServiceApiMessageHandlerValueOf;
            }

            public final AudienceNetworkRemoteServiceApiMessageHandler[] IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted;
                int i4 = i3 + 75;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                AudienceNetworkRemoteServiceApiMessageHandler[] audienceNetworkRemoteServiceApiMessageHandlerArr = new AudienceNetworkRemoteServiceApiMessageHandler[i];
                int i6 = i3 + 105;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    return audienceNetworkRemoteServiceApiMessageHandlerArr;
                }
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ AudienceNetworkRemoteServiceApiMessageHandler createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 119;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                AudienceNetworkRemoteServiceApiMessageHandler audienceNetworkRemoteServiceApiMessageHandlerIAuthTabCallback = IAuthTabCallback(parcel);
                int i4 = onWarmupCompleted + 95;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 42 / 0;
                }
                return audienceNetworkRemoteServiceApiMessageHandlerIAuthTabCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ AudienceNetworkRemoteServiceApiMessageHandler[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 11;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                AudienceNetworkRemoteServiceApiMessageHandler[] audienceNetworkRemoteServiceApiMessageHandlerArrIAuthTabCallback = IAuthTabCallback(i);
                int i5 = onExtraCallback + 107;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return audienceNetworkRemoteServiceApiMessageHandlerArrIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        int i = IAuthTabCallback + 117;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
