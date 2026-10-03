package viva.republica.toss.network.model.notification.block;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.notification.block.BlockNotificationPage$;
import viva.republica.toss.network.model.notification.group.RecentMessagesDto;
import viva.republica.toss.network.model.notification.group.RecentMessagesDto$$serializer;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BlockNotificationPage {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final List<RecentMessagesDto> content;
    private final String nextCursor;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.notification.block.BlockNotificationPage$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            KSerializer kSerializerOnExtraCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializerOnExtraCallback = BlockNotificationPage.onExtraCallback();
                int i3 = 4 / 0;
            } else {
                kSerializerOnExtraCallback = BlockNotificationPage.onExtraCallback();
            }
            int i4 = onNavigationEvent + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallback;
        }
    }), null};

    /* JADX WARN: Multi-variable type inference failed */
    public BlockNotificationPage() {
        this((List) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(RecentMessagesDto$$serializer.INSTANCE);
        int i2 = onNavigationEvent + 41;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
        }
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 57;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 13;
            onNavigationEvent = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!(obj instanceof BlockNotificationPage)) {
            return false;
        }
        BlockNotificationPage blockNotificationPage = (BlockNotificationPage) obj;
        return Intrinsics.areEqual(this.content, blockNotificationPage.content) && Intrinsics.areEqual(this.nextCursor, blockNotificationPage.nextCursor);
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.content.hashCode();
        String str = this.nextCursor;
        int iHashCode2 = (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        int i4 = onNavigationEvent + 75;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BlockNotificationPage(content=" + this.content + ", nextCursor=" + this.nextCursor + ")";
        int i2 = onNavigationEvent + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BlockNotificationPage> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            BlockNotificationPage$.serializer serializerVar = BlockNotificationPage$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 125;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        int i = onExtraCallback + 117;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 33 / 0;
        }
    }

    public /* synthetic */ BlockNotificationPage(int i, List list, String str, okycx okycxVar) {
        this.content = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
        Object obj = null;
        if ((i & 2) != 0) {
            this.nextCursor = str;
            int i2 = IAuthTabCallback + 79;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.nextCursor = null;
        int i3 = IAuthTabCallback + 19;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public BlockNotificationPage(@NotNull List<RecentMessagesDto> list, @Nullable String str) {
        Intrinsics.checkNotNullParameter(list, "");
        this.content = list;
        this.nextCursor = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(BlockNotificationPage blockNotificationPage, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(blockNotificationPage.content, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), blockNotificationPage.content);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = IAuthTabCallback + 75;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                String str = blockNotificationPage.nextCursor;
                throw null;
            }
            if (blockNotificationPage.nextCursor == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, blockNotificationPage.nextCursor);
        int i5 = IAuthTabCallback + 9;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 99;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BlockNotificationPage(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
            int i4 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = IAuthTabCallback;
            int i6 = i5 + 19;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 101;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 2;
            }
            str = null;
        }
        this(list, str);
    }

    public final List<RecentMessagesDto> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.content;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.nextCursor;
        int i5 = i2 + 9;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
