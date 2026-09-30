package im.toss.features.home.core.local.model;

import im.toss.features.home.core.local.model.AssetOverviewLocal$Header$AttentionAmountTop$TopFloatingButton$;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal$;
import im.toss.features.home.core.local.model.dst.widget.ButtonLocal;
import im.toss.features.home.core.local.model.dst.widget.ButtonLocal$;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.removeNextStartHandler;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AssetOverviewLocal$Header$AttentionAmountTop$TopFloatingButton {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final ButtonLocal button;
    private final ImageSourceLocal icon;
    private final String id;
    private final ImpressionEventLogLocal impressionEventLog;
    private final TextContentLocal text;

    static {
        Object obj = null;
        int i = onExtraCallback + 113;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof AssetOverviewLocal$Header$AttentionAmountTop$TopFloatingButton)) {
            int i3 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        AssetOverviewLocal$Header$AttentionAmountTop$TopFloatingButton assetOverviewLocal$Header$AttentionAmountTop$TopFloatingButton = (AssetOverviewLocal$Header$AttentionAmountTop$TopFloatingButton) obj;
        if (!Intrinsics.areEqual(this.id, assetOverviewLocal$Header$AttentionAmountTop$TopFloatingButton.id) || !Intrinsics.areEqual(this.icon, assetOverviewLocal$Header$AttentionAmountTop$TopFloatingButton.icon)) {
            return false;
        }
        if (Intrinsics.areEqual(this.text, assetOverviewLocal$Header$AttentionAmountTop$TopFloatingButton.text)) {
            return Intrinsics.areEqual(this.button, assetOverviewLocal$Header$AttentionAmountTop$TopFloatingButton.button) && Intrinsics.areEqual(this.impressionEventLog, assetOverviewLocal$Header$AttentionAmountTop$TopFloatingButton.impressionEventLog);
        }
        int i5 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int iHashCode3 = 0;
        if (str == null) {
            int i5 = i3 + 111;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        ImageSourceLocal imageSourceLocal = this.icon;
        int iHashCode4 = imageSourceLocal == null ? 0 : imageSourceLocal.hashCode();
        TextContentLocal textContentLocal = this.text;
        int iHashCode5 = 1;
        if (textContentLocal == null) {
            int i7 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i7 % 128;
            iHashCode2 = i7 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = textContentLocal.hashCode();
        }
        ButtonLocal buttonLocal = this.button;
        if (buttonLocal == null) {
            int i8 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                iHashCode5 = 0;
            }
        } else {
            iHashCode5 = buttonLocal.hashCode();
        }
        ImpressionEventLogLocal impressionEventLogLocal = this.impressionEventLog;
        if (impressionEventLogLocal != null) {
            int i9 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            iHashCode3 = impressionEventLogLocal.hashCode();
            int i11 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
        }
        return (((((((iHashCode * 31) + iHashCode4) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TopFloatingButton(id=" + this.id + ", icon=" + this.icon + ", text=" + this.text + ", button=" + this.button + ", impressionEventLog=" + this.impressionEventLog + ")";
        int i2 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ AssetOverviewLocal$Header$AttentionAmountTop$TopFloatingButton(int i, String str, ImageSourceLocal imageSourceLocal, TextContentLocal textContentLocal, ButtonLocal buttonLocal, ImpressionEventLogLocal impressionEventLogLocal, okycx okycxVar) {
        if (31 != (i & 31)) {
            int i2 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 31, AssetOverviewLocal$Header$AttentionAmountTop$TopFloatingButton$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.id = str;
        this.icon = imageSourceLocal;
        this.text = textContentLocal;
        this.button = buttonLocal;
        this.impressionEventLog = impressionEventLogLocal;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(AssetOverviewLocal$Header$AttentionAmountTop$TopFloatingButton assetOverviewLocal$Header$AttentionAmountTop$TopFloatingButton, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, assetOverviewLocal$Header$AttentionAmountTop$TopFloatingButton.id);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, removeNextStartHandler.onWarmupCompleted, assetOverviewLocal$Header$AttentionAmountTop$TopFloatingButton.icon);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, TextContentLocal$.serializer.INSTANCE, assetOverviewLocal$Header$AttentionAmountTop$TopFloatingButton.text);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, ButtonLocal$.serializer.INSTANCE, assetOverviewLocal$Header$AttentionAmountTop$TopFloatingButton.button);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, ImpressionEventLogLocal$.serializer.INSTANCE, assetOverviewLocal$Header$AttentionAmountTop$TopFloatingButton.impressionEventLog);
        int i4 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
