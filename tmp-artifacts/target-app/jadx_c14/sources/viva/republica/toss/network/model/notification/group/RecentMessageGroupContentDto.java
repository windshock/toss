package viva.republica.toss.network.model.notification.group;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.htf31;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.notification.group.RecentMessageGroupContentDto$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RecentMessageGroupContentDto {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<RecentMessageGroupDto> contents;
    private final RecentMessageGroupDto hiddenContents;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.notification.group.RecentMessageGroupContentDto$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            KSerializer kSerializerOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                kSerializerOnExtraCallbackWithResult = RecentMessageGroupContentDto.onExtraCallbackWithResult();
                int i3 = 71 / 0;
            } else {
                kSerializerOnExtraCallbackWithResult = RecentMessageGroupContentDto.onExtraCallbackWithResult();
            }
            int i4 = onWarmupCompleted + 99;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 0;
            }
            return kSerializerOnExtraCallbackWithResult;
        }
    }), null};

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        KSerializer kSerializerOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerOnNavigationEvent = onNavigationEvent();
            int i3 = 14 / 0;
        } else {
            kSerializerOnNavigationEvent = onNavigationEvent();
        }
        int i4 = IAuthTabCallback + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnNavigationEvent;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(RecentMessageGroupDto$$serializer.INSTANCE);
        int i2 = IAuthTabCallback + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 9 / 0;
        }
        return checkcanopenlandingpage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecentMessageGroupContentDto onNavigationEvent(RecentMessageGroupContentDto recentMessageGroupContentDto, List list, RecentMessageGroupDto recentMessageGroupDto, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = IAuthTabCallback + 117;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                List<RecentMessageGroupDto> list2 = recentMessageGroupContentDto.contents;
                throw null;
            }
            list = recentMessageGroupContentDto.contents;
        }
        if ((i & 2) != 0) {
            recentMessageGroupDto = recentMessageGroupContentDto.hiddenContents;
        }
        RecentMessageGroupContentDto recentMessageGroupContentDtoOnExtraCallback = recentMessageGroupContentDto.onExtraCallback(list, recentMessageGroupDto);
        int i4 = IAuthTabCallback + 5;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return recentMessageGroupContentDtoOnExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentMessageGroupContentDto)) {
            return false;
        }
        RecentMessageGroupContentDto recentMessageGroupContentDto = (RecentMessageGroupContentDto) obj;
        if (!Intrinsics.areEqual(this.contents, recentMessageGroupContentDto.contents)) {
            return false;
        }
        if (Intrinsics.areEqual(this.hiddenContents, recentMessageGroupContentDto.hiddenContents)) {
            return true;
        }
        int i4 = IAuthTabCallback + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.contents.hashCode();
        RecentMessageGroupDto recentMessageGroupDto = this.hiddenContents;
        if (recentMessageGroupDto == null) {
            int i4 = IAuthTabCallback + 51;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = recentMessageGroupDto.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final RecentMessageGroupContentDto onExtraCallback(@NotNull List<RecentMessageGroupDto> list, @Nullable RecentMessageGroupDto recentMessageGroupDto) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        RecentMessageGroupContentDto recentMessageGroupContentDto = new RecentMessageGroupContentDto(list, recentMessageGroupDto);
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return recentMessageGroupContentDto;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RecentMessageGroupContentDto(contents=" + this.contents + ", hiddenContents=" + this.hiddenContents + ")";
        int i2 = onExtraCallback + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RecentMessageGroupContentDto> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            RecentMessageGroupContentDto$.serializer serializerVar = RecentMessageGroupContentDto$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 109;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 88 / 0;
        }
    }

    public /* synthetic */ RecentMessageGroupContentDto(int i, List list, RecentMessageGroupDto recentMessageGroupDto, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallback + 79;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                htf31.onExtraCallbackWithResult(i, 0, RecentMessageGroupContentDto$.serializer.INSTANCE.getDescriptor());
            } else {
                htf31.onExtraCallbackWithResult(i, 1, RecentMessageGroupContentDto$.serializer.INSTANCE.getDescriptor());
            }
        }
        this.contents = list;
        if ((i & 2) == 0) {
            this.hiddenContents = null;
            int i3 = onExtraCallback + 101;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.hiddenContents = recentMessageGroupDto;
        int i5 = onExtraCallback + 101;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 93 / 0;
        }
    }

    public RecentMessageGroupContentDto(@NotNull List<RecentMessageGroupDto> list, @Nullable RecentMessageGroupDto recentMessageGroupDto) {
        Intrinsics.checkNotNullParameter(list, "");
        this.contents = list;
        this.hiddenContents = recentMessageGroupDto;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return $childSerializers;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.notification.group.RecentMessageGroupContentDto r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.notification.group.RecentMessageGroupContentDto.IAuthTabCallback
            int r1 = r1 + 43
            int r2 = r1 % 128
            viva.republica.toss.network.model.notification.group.RecentMessageGroupContentDto.onExtraCallback = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L26
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.notification.group.RecentMessageGroupContentDto.$childSerializers
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.notification.group.RecentMessageGroupDto> r4 = r5.contents
            r6.onNavigationEvent(r7, r3, r1, r4)
            boolean r1 = r6.onWarmupCompleted(r7, r2)
            if (r1 != 0) goto L3f
            goto L3b
        L26:
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.notification.group.RecentMessageGroupContentDto.$childSerializers
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.notification.group.RecentMessageGroupDto> r4 = r5.contents
            r6.onNavigationEvent(r7, r2, r1, r4)
            boolean r1 = r6.onWarmupCompleted(r7, r3)
            if (r1 == r3) goto L3f
        L3b:
            viva.republica.toss.network.model.notification.group.RecentMessageGroupDto r1 = r5.hiddenContents
            if (r1 == 0) goto L4f
        L3f:
            viva.republica.toss.network.model.notification.group.RecentMessageGroupDto$$serializer r1 = viva.republica.toss.network.model.notification.group.RecentMessageGroupDto$$serializer.INSTANCE
            viva.republica.toss.network.model.notification.group.RecentMessageGroupDto r5 = r5.hiddenContents
            r6.onExtraCallbackWithResult(r7, r3, r1, r5)
            int r5 = viva.republica.toss.network.model.notification.group.RecentMessageGroupContentDto.onExtraCallback
            int r5 = r5 + 57
            int r6 = r5 % 128
            viva.republica.toss.network.model.notification.group.RecentMessageGroupContentDto.IAuthTabCallback = r6
            int r5 = r5 % r0
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.notification.group.RecentMessageGroupContentDto.onWarmupCompleted(viva.republica.toss.network.model.notification.group.RecentMessageGroupContentDto, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RecentMessageGroupContentDto(List list, RecentMessageGroupDto recentMessageGroupDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 73;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 79;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            recentMessageGroupDto = null;
        }
        this(list, recentMessageGroupDto);
    }

    public final List<RecentMessageGroupDto> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.contents;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
