package o;

import im.toss.splittarget.spec.R;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class EventServiceImplExternalSyntheticLambda0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EventServiceImplExternalSyntheticLambda0[] $VALUES;
    public static final onExtraCallback Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String id;
    private final int labelResId;
    public static final EventServiceImplExternalSyntheticLambda0 CLIPBOARD = new EventServiceImplExternalSyntheticLambda0("CLIPBOARD", 0, "계좌복사", R.string.split_target_spec_notification_channel_clipboard);
    public static final EventServiceImplExternalSyntheticLambda0 SILENT = new EventServiceImplExternalSyntheticLambda0("SILENT", 1, "무음 알림", R.string.split_target_spec_notification_channel_slient);
    public static final EventServiceImplExternalSyntheticLambda0 GENERAL = new EventServiceImplExternalSyntheticLambda0("GENERAL", 2, "일반 알림", R.string.split_target_spec_notification_channel_general);
    public static final EventServiceImplExternalSyntheticLambda0 IMPORTANT = new EventServiceImplExternalSyntheticLambda0("IMPORTANT", 3, "중요 알림", R.string.split_target_spec_notification_channel_important);
    public static final EventServiceImplExternalSyntheticLambda0 PEDOMETER = new EventServiceImplExternalSyntheticLambda0("PEDOMETER", 4, "pedometer", R.string.split_target_spec_notification_channel_pedometer);
    public static final EventServiceImplExternalSyntheticLambda0 BLE_AIRDROP = new EventServiceImplExternalSyntheticLambda0("BLE_AIRDROP", 5, "BLE_AIRDROP_NOTI_ID", R.string.split_target_spec_notification_channel_airdrop);
    public static final EventServiceImplExternalSyntheticLambda0 CURRENCY = new EventServiceImplExternalSyntheticLambda0("CURRENCY", 6, "환율 알림", R.string.split_target_spec_notification_channel_currency);
    public static final EventServiceImplExternalSyntheticLambda0 MOBILITY = new EventServiceImplExternalSyntheticLambda0("MOBILITY", 7, "mobility", R.string.split_target_spec_notification_channel_mobility);
    public static final EventServiceImplExternalSyntheticLambda0 MOBILE_TMONEY = new EventServiceImplExternalSyntheticLambda0("MOBILE_TMONEY", 8, "tmoney", R.string.split_target_spec_notification_channel_mobile_tmoney);
    public static final EventServiceImplExternalSyntheticLambda0 OFFLINE_OVERSEAS_TOSS_PAY = new EventServiceImplExternalSyntheticLambda0("OFFLINE_OVERSEAS_TOSS_PAY", 9, "offline_overseas_payment", R.string.split_target_spec_notification_channel_offline_overseas_pay);
    public static final EventServiceImplExternalSyntheticLambda0 POINT_BACK = new EventServiceImplExternalSyntheticLambda0("POINT_BACK", 10, "point_back", R.string.split_target_spec_notification_channel_point_back);
    public static final EventServiceImplExternalSyntheticLambda0 MEDIA_PLAYBACK = new EventServiceImplExternalSyntheticLambda0("MEDIA_PLAYBACK", 11, "media_playback", R.string.split_target_spec_notification_channel_media_playback);

    private static final /* synthetic */ EventServiceImplExternalSyntheticLambda0[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        EventServiceImplExternalSyntheticLambda0[] eventServiceImplExternalSyntheticLambda0Arr = {CLIPBOARD, SILENT, GENERAL, IMPORTANT, PEDOMETER, BLE_AIRDROP, CURRENCY, MOBILITY, MOBILE_TMONEY, OFFLINE_OVERSEAS_TOSS_PAY, POINT_BACK, MEDIA_PLAYBACK};
        int i5 = i2 + 43;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return eventServiceImplExternalSyntheticLambda0Arr;
    }

    public static EnumEntries<EventServiceImplExternalSyntheticLambda0> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EventServiceImplExternalSyntheticLambda0 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        EventServiceImplExternalSyntheticLambda0 eventServiceImplExternalSyntheticLambda0 = (EventServiceImplExternalSyntheticLambda0) Enum.valueOf(EventServiceImplExternalSyntheticLambda0.class, str);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return eventServiceImplExternalSyntheticLambda0;
        }
        obj.hashCode();
        throw null;
    }

    public static EventServiceImplExternalSyntheticLambda0[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        EventServiceImplExternalSyntheticLambda0[] eventServiceImplExternalSyntheticLambda0Arr = $VALUES;
        if (i3 != 0) {
            return (EventServiceImplExternalSyntheticLambda0[]) eventServiceImplExternalSyntheticLambda0Arr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private EventServiceImplExternalSyntheticLambda0(String str, int i, String str2, int i2) {
        this.id = str2;
        this.labelResId = i2;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 51;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.id;
        int i4 = i2 + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return str;
    }

    public final int getLabelResId() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 63;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.labelResId;
        int i6 = i2 + 109;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        EventServiceImplExternalSyntheticLambda0[] eventServiceImplExternalSyntheticLambda0Arr$values = $values();
        $VALUES = eventServiceImplExternalSyntheticLambda0Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(eventServiceImplExternalSyntheticLambda0Arr$values);
        Companion = new onExtraCallback(null);
        int i = IAuthTabCallback + 25;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final EventServiceImplExternalSyntheticLambda0 IAuthTabCallback(@Nullable String str) {
            EventServiceImplExternalSyntheticLambda0 eventServiceImplExternalSyntheticLambda0;
            int i = 2 % 2;
            if (Intrinsics.areEqual(str, maybeTrackAppOpenEvent.DEPRECATED_SILENT.getId())) {
                return EventServiceImplExternalSyntheticLambda0.SILENT;
            }
            EventServiceImplExternalSyntheticLambda0[] eventServiceImplExternalSyntheticLambda0ArrValues = EventServiceImplExternalSyntheticLambda0.values();
            int length = eventServiceImplExternalSyntheticLambda0ArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    eventServiceImplExternalSyntheticLambda0 = null;
                    break;
                }
                eventServiceImplExternalSyntheticLambda0 = eventServiceImplExternalSyntheticLambda0ArrValues[i2];
                if (Intrinsics.areEqual(eventServiceImplExternalSyntheticLambda0.getId(), str)) {
                    int i3 = IAuthTabCallback;
                    int i4 = i3 + 47;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    int i5 = i3 + 7;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    i2++;
                }
            }
            if (eventServiceImplExternalSyntheticLambda0 == null) {
                int i7 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                return EventServiceImplExternalSyntheticLambda0.GENERAL;
            }
            int i9 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                return eventServiceImplExternalSyntheticLambda0;
            }
            throw null;
        }
    }
}
