package viva.republica.toss.main.more.notification;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.SetDetectableSize;
import o.setLatitude;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.notification.RecentNotificationSettingLogUtilKt$;
import viva.republica.toss.network.model.notification.group.RecentMessagesDto;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RecentNotificationSettingLogUtilKt {
    public static /* synthetic */ void onExtraCallback(SetDetectableSize setDetectableSize, List list, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        onNavigationEvent(setDetectableSize, list, num);
    }

    public static final void onNavigationEvent(@NotNull SetDetectableSize setDetectableSize, @NotNull List<RecentMessagesDto> list, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Intrinsics.checkNotNullParameter(list, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (num != null) {
            list = CollectionsKt.take(list, num.intValue());
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (Object obj : list) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            RecentMessagesDto recentMessagesDto = (RecentMessagesDto) obj;
            linkedHashMap.put(String.valueOf(i), String.valueOf(recentMessagesDto.IAuthTabCallbackStub()));
            linkedHashMap2.put(String.valueOf(i), recentMessagesDto.onNavigationEvent());
            if (!recentMessagesDto.onTransact()) {
                linkedHashMap3.put(String.valueOf(i), "on");
                i3++;
            } else {
                linkedHashMap3.put(String.valueOf(i), "off");
                i2++;
            }
            i++;
        }
        setDetectableSize.onExtraCallback("push_cnt", Integer.valueOf(list.size()));
        if (num != null) {
            setDetectableSize.onExtraCallback("template_list", linkedHashMap);
            setDetectableSize.onExtraCallback("message_list", linkedHashMap2);
            setDetectableSize.onExtraCallback("on_off_list", linkedHashMap3);
        }
        setDetectableSize.onExtraCallback("on_cnt", Integer.valueOf(i3));
        setDetectableSize.onExtraCallback("off_cnt", Integer.valueOf(i2));
    }

    public static final void IAuthTabCallback(@NotNull SetDetectableSize setDetectableSize, @NotNull List<RecentMessagesDto> list) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Intrinsics.checkNotNullParameter(list, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (Object obj : list) {
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            RecentMessagesDto recentMessagesDto = (RecentMessagesDto) obj;
            linkedHashMap.put(String.valueOf(i3), String.valueOf(recentMessagesDto.IAuthTabCallbackStub()));
            linkedHashMap2.put(String.valueOf(i3), recentMessagesDto.onNavigationEvent());
            if (!recentMessagesDto.onTransact()) {
                linkedHashMap3.put(String.valueOf(i3), "on");
                i++;
            } else {
                linkedHashMap3.put(String.valueOf(i3), "off");
                i2++;
            }
            i3++;
        }
        setDetectableSize.onExtraCallback("push_cnt", Integer.valueOf(list.size()));
        setDetectableSize.onExtraCallback("template_list", linkedHashMap);
        setDetectableSize.onExtraCallback("message_list", linkedHashMap2);
        setDetectableSize.onExtraCallback("on_off_list", linkedHashMap3);
        setDetectableSize.onExtraCallback("on_cnt", Integer.valueOf(i));
        setDetectableSize.onExtraCallback("off_cnt", Integer.valueOf(i2));
    }

    public static final void onExtraCallbackWithResult(@NotNull SetDetectableSize setDetectableSize, @NotNull List<setLatitude.IAuthTabCallback> list) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Intrinsics.checkNotNullParameter(list, "");
        setDetectableSize.onExtraCallback("list", CollectionsKt.joinToString$default(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new RecentNotificationSettingLogUtilKt$.ExternalSyntheticLambda0(), 30, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence onWarmupCompleted(setLatitude.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        return iAuthTabCallback.onNavigationEvent();
    }
}
