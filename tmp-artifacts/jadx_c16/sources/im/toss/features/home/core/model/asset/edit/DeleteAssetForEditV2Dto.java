package im.toss.features.home.core.model.asset.edit;

import im.toss.features.home.core.model.asset.edit.DeleteAssetForEditV2Dto$CompleteAction$None$;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.ServerSideCallbackHolder;
import o.TombstoneProtosMemoryMappingBuilder;
import o.getWriggleLayout;
import o.htf1;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class DeleteAssetForEditV2Dto {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final CompleteAction completeAction;
    private final boolean isSuccess;

    static {
        int i = onExtraCallback + 27;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 45 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeleteAssetForEditV2Dto() {
        CompleteAction completeAction = null;
        this(false, completeAction, 3, (DefaultConstructorMarker) completeAction);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 101;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(!(obj instanceof DeleteAssetForEditV2Dto))) {
            if (this.isSuccess != ((DeleteAssetForEditV2Dto) obj).isSuccess) {
                int i3 = onNavigationEvent + 109;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.completeAction, r6.completeAction))) {
                int i5 = onNavigationEvent + 51;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (Boolean.hashCode(this.isSuccess) << 102) >>> this.completeAction.hashCode() : (Boolean.hashCode(this.isSuccess) * 31) + this.completeAction.hashCode();
        int i3 = IAuthTabCallback + 13;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DeleteAssetForEditV2Dto(isSuccess=" + this.isSuccess + ", completeAction=" + this.completeAction + ")";
        int i2 = IAuthTabCallback + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 65 / 0;
        }
        return str;
    }

    public /* synthetic */ DeleteAssetForEditV2Dto(int i, boolean z, CompleteAction completeAction, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i2 = IAuthTabCallback + 29;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            z = false;
        }
        this.isSuccess = z;
        Object obj = null;
        if ((i & 2) != 0) {
            this.completeAction = completeAction;
            int i4 = onNavigationEvent + 109;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i5 = IAuthTabCallback + 17;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            this.completeAction = CompleteAction.None.INSTANCE;
            int i6 = onNavigationEvent + 39;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 68 / 0;
                return;
            }
            return;
        }
        this.completeAction = CompleteAction.None.INSTANCE;
        throw null;
    }

    public DeleteAssetForEditV2Dto(boolean z, @NotNull CompleteAction completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "");
        this.isSuccess = z;
        this.completeAction = completeAction;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(DeleteAssetForEditV2Dto deleteAssetForEditV2Dto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onNavigationEvent + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (deleteAssetForEditV2Dto.isSuccess) {
                vylVar.onNavigationEvent(serialDescriptor, 0, deleteAssetForEditV2Dto.isSuccess);
                int i4 = onNavigationEvent + 67;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 % 2;
                }
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1) && Intrinsics.areEqual(deleteAssetForEditV2Dto.completeAction, CompleteAction.None.INSTANCE)) {
            return;
        }
        vylVar.onNavigationEvent(serialDescriptor, 1, ServerSideCallbackHolder.IAuthTabCallback, deleteAssetForEditV2Dto.completeAction);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeleteAssetForEditV2Dto(boolean z, CompleteAction completeAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 3;
            IAuthTabCallback = i2 % 128;
            z = i2 % 2 != 0;
        }
        if ((i & 2) != 0) {
            int i3 = onNavigationEvent + 53;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                completeAction = CompleteAction.None.INSTANCE;
                int i4 = 2 % 2;
            } else {
                CompleteAction.None none = CompleteAction.None.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        this(z, completeAction);
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isSuccess;
        int i5 = i2 + 99;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
        return z;
    }

    public final CompleteAction onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        CompleteAction completeAction = this.completeAction;
        int i4 = i3 + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return completeAction;
        }
        throw null;
    }

    @liq(onNavigationEvent = ServerSideCallbackHolder.class)
    public static abstract class CompleteAction {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 35;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ CompleteAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CompleteAction() {
        }

        @liq
        public static final class None extends CompleteAction {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            public static final None INSTANCE = new None();
            private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new DeleteAssetForEditV2Dto$CompleteAction$None$.ExternalSyntheticLambda0());

            public static /* synthetic */ KSerializer onNavigationEvent() {
                KSerializer kSerializerIAuthTabCallback;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 85;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    kSerializerIAuthTabCallback = IAuthTabCallback();
                    int i3 = 37 / 0;
                } else {
                    kSerializerIAuthTabCallback = IAuthTabCallback();
                }
                int i4 = IAuthTabCallback + 63;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 92 / 0;
                }
                return kSerializerIAuthTabCallback;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 75;
                int i4 = i3 % 128;
                IAuthTabCallback = i4;
                Object obj2 = null;
                if (i3 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                if (this == obj) {
                    int i5 = i4 + 101;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        return true;
                    }
                    throw null;
                }
                if (obj instanceof None) {
                    return true;
                }
                int i6 = i2 + 111;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 89;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 15;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 37 / 0;
                }
                return 674197765;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 113;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 59;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return "None";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            static {
                int i = onNavigationEvent + 13;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private None() {
                super(null);
            }

            private static final /* synthetic */ KSerializer IAuthTabCallback() {
                int i = 2 % 2;
                htf1 htf1Var = new htf1("im.toss.features.home.core.model.asset.edit.DeleteAssetForEditV2Dto.CompleteAction.None", INSTANCE, new Annotation[0]);
                int i2 = IAuthTabCallback + 15;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return htf1Var;
            }

            private final /* synthetic */ KSerializer onExtraCallback() {
                KSerializer kSerializer;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 71;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    kSerializer = (KSerializer) $cachedSerializer$delegate.getValue();
                    int i3 = 33 / 0;
                } else {
                    kSerializer = (KSerializer) $cachedSerializer$delegate.getValue();
                }
                int i4 = onExtraCallback + 87;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final KSerializer<None> serializer() {
                KSerializer<None> kSerializerOnExtraCallback;
                int i = 2 % 2;
                int i2 = onExtraCallback + 39;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    kSerializerOnExtraCallback = onExtraCallback();
                    int i3 = 15 / 0;
                } else {
                    kSerializerOnExtraCallback = onExtraCallback();
                }
                int i4 = IAuthTabCallback + 55;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnExtraCallback;
                }
                throw null;
            }
        }

        @liq
        public static final class Alert extends CompleteAction {
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            private final String description;
            private final String title;

            static {
                int i = IAuthTabCallback + 75;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Alert() {
                String str = null;
                this(str, str, 3, (DefaultConstructorMarker) str);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 27;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                if (this == obj) {
                    int i4 = i3 + 111;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
                if (!(obj instanceof Alert)) {
                    return false;
                }
                Alert alert = (Alert) obj;
                if (!Intrinsics.areEqual(this.title, alert.title)) {
                    int i6 = onExtraCallbackWithResult + 121;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.description, alert.description)) {
                    return true;
                }
                int i8 = onNavigationEvent + 81;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 97;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode2 = this.title.hashCode();
                String str = this.description;
                if (str == null) {
                    int i4 = onNavigationEvent + 53;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = str.hashCode();
                }
                int i6 = (iHashCode2 * 31) + iHashCode;
                int i7 = onNavigationEvent + 107;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    return i6;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Alert(title=" + this.title + ", description=" + this.description + ")";
                int i2 = onNavigationEvent + 113;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public /* synthetic */ Alert(int i, String str, String str2, okycx okycxVar) {
                super(null);
                if ((i & 1) == 0) {
                    int i2 = 2 % 2;
                    str = "";
                }
                this.title = str;
                if ((i & 2) == 0) {
                    int i3 = onNavigationEvent + 11;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    this.description = null;
                    return;
                }
                this.description = str2;
                int i5 = onExtraCallbackWithResult + 7;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 8 / 0;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Alert(@NotNull String str, @Nullable String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.title = str;
                this.description = str2;
            }

            @JvmStatic
            public static final /* synthetic */ void onWarmupCompleted(Alert alert, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 45;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(alert.title, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 0, alert.title);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                    int i4 = onExtraCallbackWithResult + 3;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        String str = alert.description;
                        throw null;
                    }
                    if (alert.description == null) {
                        return;
                    }
                }
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, alert.description);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Alert(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                Object obj = null;
                if ((i & 1) != 0) {
                    int i2 = onNavigationEvent + 111;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    int i3 = 2 % 2;
                    str = "";
                }
                if ((i & 2) != 0) {
                    int i4 = onExtraCallbackWithResult + 83;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    str2 = null;
                }
                this(str, str2);
            }

            public final String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 123;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                String str = this.title;
                int i5 = i2 + 117;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final String onExtraCallback() {
                String str;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 87;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    str = this.description;
                    int i4 = 44 / 0;
                } else {
                    str = this.description;
                }
                int i5 = i2 + 105;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }
        }

        @liq
        public static final class MydataDelete extends CompleteAction {
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            private final String assetId;
            private final String orgCode;
            private final String scope;

            static {
                int i = onExtraCallback + 91;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            public MydataDelete() {
                this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 95;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MydataDelete)) {
                    return false;
                }
                MydataDelete mydataDelete = (MydataDelete) obj;
                if (!Intrinsics.areEqual(this.assetId, mydataDelete.assetId)) {
                    int i3 = IAuthTabCallback + 31;
                    onNavigationEvent = i3 % 128;
                    return i3 % 2 == 0;
                }
                if (Intrinsics.areEqual(this.orgCode, mydataDelete.orgCode)) {
                    return Intrinsics.areEqual(this.scope, mydataDelete.scope);
                }
                int i4 = IAuthTabCallback + 63;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 41;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode2 = this.assetId.hashCode();
                int iHashCode3 = this.orgCode.hashCode();
                String str = this.scope;
                if (str == null) {
                    int i4 = IAuthTabCallback + 5;
                    onNavigationEvent = i4 % 128;
                    iHashCode = i4 % 2 == 0 ? 1 : 0;
                } else {
                    iHashCode = str.hashCode();
                }
                return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "MydataDelete(assetId=" + this.assetId + ", orgCode=" + this.orgCode + ", scope=" + this.scope + ")";
                int i2 = IAuthTabCallback + 17;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public /* synthetic */ MydataDelete(int i, String str, String str2, String str3, okycx okycxVar) {
                super(null);
                if ((i & 1) == 0) {
                    this.assetId = "";
                    int i2 = IAuthTabCallback + 17;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                } else {
                    this.assetId = str;
                }
                if ((i & 2) == 0) {
                    this.orgCode = "";
                    int i5 = 2 % 2;
                } else {
                    this.orgCode = str2;
                }
                if ((i & 4) != 0) {
                    this.scope = str3;
                    return;
                }
                int i6 = onNavigationEvent + 35;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                this.scope = null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MydataDelete(@NotNull String str, @NotNull String str2, @Nullable String str3) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.assetId = str;
                this.orgCode = str2;
                this.scope = str3;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void onExtraCallback(MydataDelete mydataDelete, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                if (!(!vylVar.onWarmupCompleted(serialDescriptor, 0)) || !Intrinsics.areEqual(mydataDelete.assetId, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 0, mydataDelete.assetId);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                    int i2 = IAuthTabCallback + 91;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    if (!Intrinsics.areEqual(mydataDelete.orgCode, "")) {
                        vylVar.onExtraCallback(serialDescriptor, 1, mydataDelete.orgCode);
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                    int i4 = IAuthTabCallback + 17;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    if (mydataDelete.scope == null) {
                        return;
                    }
                }
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, mydataDelete.scope);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ MydataDelete(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = 2 % 2;
                    str = "";
                }
                if ((i & 2) != 0) {
                    int i3 = onNavigationEvent + 111;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 4 % 4;
                    } else {
                        int i5 = 2 % 2;
                    }
                    str2 = "";
                }
                if ((i & 4) != 0) {
                    int i6 = IAuthTabCallback + 21;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = 2 % 2;
                    str3 = null;
                }
                this(str, str2, str3);
            }

            public final String onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 53;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                String str = this.assetId;
                int i5 = i2 + 115;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 83;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.orgCode;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 19;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                String str = this.scope;
                int i5 = i2 + 85;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                throw null;
            }
        }
    }
}
