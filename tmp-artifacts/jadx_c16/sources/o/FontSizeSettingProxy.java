package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.FontSizeSettingProxyOnFontSizeSettingChangeListener;
import o.ShouldLoadUrlResultPoint;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class FontSizeSettingProxy {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static final FontSizeSettingProxyOnFontSizeSettingChangeListener IAuthTabCallback(@NotNull ShouldLoadUrlResultPoint shouldLoadUrlResultPoint) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(shouldLoadUrlResultPoint, "");
        boolean zOnNavigationEvent = shouldLoadUrlResultPoint.onNavigationEvent();
        List<ShouldLoadUrlResultPoint.onWarmupCompleted> listIAuthTabCallback = shouldLoadUrlResultPoint.IAuthTabCallback();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIAuthTabCallback, 10));
        int i2 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 % 3;
        }
        for (ShouldLoadUrlResultPoint.onWarmupCompleted onwarmupcompleted : listIAuthTabCallback) {
            arrayList.add(new FontSizeSettingProxyOnFontSizeSettingChangeListener.onNavigationEvent(onwarmupcompleted.IAuthTabCallback(), onwarmupcompleted.onExtraCallbackWithResult(), onwarmupcompleted.onWarmupCompleted(), onwarmupcompleted.onNavigationEvent()));
        }
        FontSizeSettingProxyOnFontSizeSettingChangeListener fontSizeSettingProxyOnFontSizeSettingChangeListener = new FontSizeSettingProxyOnFontSizeSettingChangeListener(zOnNavigationEvent, arrayList, shouldLoadUrlResultPoint.onWarmupCompleted());
        int i4 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return fontSizeSettingProxyOnFontSizeSettingChangeListener;
    }
}
