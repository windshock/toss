package im.toss.securities.widget.data.model.watchlists;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.securities.widget.data.model.watchlists.ItemType;
import im.toss.securities.widget.data.model.watchlists.WidgetWatchlists;
import im.toss.securities.widget.data.model.watchlists.WidgetWatchlists$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.oty1;
import o.py;
import o.r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class WidgetWatchlists {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final List<WatchList> watchLists;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.data.model.watchlists.WidgetWatchlists$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnNavigationEvent = WidgetWatchlists.onNavigationEvent();
            int i4 = IAuthTabCallback + 55;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnNavigationEvent;
        }
    })};

    /* JADX WARN: Illegal instructions before constructor call */
    public WidgetWatchlists() {
        List list = null;
        this(list, 1, (DefaultConstructorMarker) list);
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted();
            throw null;
        }
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i3 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerOnWarmupCompleted;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(WidgetWatchlists$WatchList$$serializer.INSTANCE);
        int i2 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof WidgetWatchlists)) {
            int i4 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.watchLists, ((WidgetWatchlists) obj).watchLists)) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        List<WatchList> list = this.watchLists;
        if (list == null) {
            int i5 = i3 + 69;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }
        int iHashCode = list.hashCode();
        int i7 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WidgetWatchlists(watchLists=" + this.watchLists + ")";
        int i2 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WidgetWatchlists> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            WidgetWatchlists$.serializer serializerVar = WidgetWatchlists$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 97;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ WidgetWatchlists(int i, List list, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.watchLists = null;
            int i2 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.watchLists = list;
        int i4 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public WidgetWatchlists(@Nullable List<WatchList> list) {
        this.watchLists = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[PHI: r1
      0x0024: PHI (r1v6 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001e, B:10:0x0022, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
      0x0020: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(WidgetWatchlists widgetWatchlists, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                if (widgetWatchlists.watchLists != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[0].getValue(), widgetWatchlists.watchLists);
                }
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        int i3 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WidgetWatchlists(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 89;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 73;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            list = null;
        }
        this(list);
    }

    @liq
    public static final class WatchList {
        private static final Lazy<KSerializer<Object>>[] $childSerializers;
        public static final Companion Companion;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final long id;
        private final List<Item> items;
        private final String name;
        private final r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg type;

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnTransact = onTransact();
            int i4 = IAuthTabCallback + 35;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnTransact;
        }

        private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(WidgetWatchlists$WatchList$Item$$serializer.INSTANCE);
            int i2 = IAuthTabCallback + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return checkcanopenlandingpage;
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            int i4 = IAuthTabCallback + 95;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 88 / 0;
            }
            return kSerializerIAuthTabCallbackDefault;
        }

        public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i6;
            int i8 = (~(i7 | i)) | i5;
            int i9 = ~i5;
            int i10 = ~(i7 | i9);
            int i11 = ~i;
            int i12 = i10 | (~(i9 | i11));
            int i13 = (~(i | i9)) | (~(i7 | i11));
            int i14 = i6 + i5 + i3 + (417615942 * i4) + (566850886 * i2);
            int i15 = i14 * i14;
            int i16 = ((-370608051) * i6) + 147849216 + ((-2147356519) * i5) + (i8 * 1776748468) + (i12 * 1776748468) + (1776748468 * i13) + (1406140416 * i3) + ((-354418688) * i4) + ((-85983232) * i2) + ((-608960512) * i15);
            int i17 = (i6 * (-1357469509)) + 140661806 + (i5 * (-1357469617)) + (i8 * 108) + (i12 * 108) + (i13 * 108) + (i3 * (-1357469401)) + (i4 * 1137340586) + (i2 * 304092074) + (i15 * 1282146304);
            return i16 + ((i17 * i17) * 1158414336) != 1 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
        }

        private static final /* synthetic */ KSerializer onTransact() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.securities.widget.common.log.Type", r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.values());
            int i4 = onWarmupCompleted + 43;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerOnExtraCallbackWithResult;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
        
            if ((r8 instanceof im.toss.securities.widget.data.model.watchlists.WidgetWatchlists.WatchList) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        
            r1 = r1 + 45;
            im.toss.securities.widget.data.model.watchlists.WidgetWatchlists.WatchList.onWarmupCompleted = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        
            r8 = (im.toss.securities.widget.data.model.watchlists.WidgetWatchlists.WatchList) r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        
            if (r7.id == r8.id) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r7.items, r8.items) != false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r7.name, r8.name) != false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
        
            r8 = im.toss.securities.widget.data.model.watchlists.WidgetWatchlists.WatchList.onWarmupCompleted + 103;
            im.toss.securities.widget.data.model.watchlists.WidgetWatchlists.WatchList.IAuthTabCallback = r8 % 128;
            r8 = r8 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
        
            if (r7.type == r8.type) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
        
            r8 = im.toss.securities.widget.data.model.watchlists.WidgetWatchlists.WatchList.IAuthTabCallback + 33;
            im.toss.securities.widget.data.model.watchlists.WidgetWatchlists.WatchList.onWarmupCompleted = r8 % 128;
            r8 = r8 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        
            if (r7 == r8) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        
            if (r7 == r8) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 49;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 / 0;
            }
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = Long.hashCode(this.id);
            List<Item> list = this.items;
            if (list == null) {
                int i2 = IAuthTabCallback + 49;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 53;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = list.hashCode();
            }
            return (((((iHashCode2 * 31) + iHashCode) * 31) + this.name.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "WatchList(id=" + this.id + ", items=" + this.items + ", name=" + this.name + ", type=" + this.type + ")";
            int i2 = onWarmupCompleted + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<WatchList> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 41;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                WidgetWatchlists$WatchList$$serializer widgetWatchlists$WatchList$$serializer = WidgetWatchlists$WatchList$$serializer.INSTANCE;
                if (i3 != 0) {
                    return widgetWatchlists$WatchList$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.data.model.watchlists.WidgetWatchlists$WatchList$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 117;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        return WidgetWatchlists.WatchList.onExtraCallback();
                    }
                    int i3 = 2 / 0;
                    return WidgetWatchlists.WatchList.onExtraCallback();
                }
            }), null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.securities.widget.data.model.watchlists.WidgetWatchlists$WatchList$$ExternalSyntheticLambda1
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 79;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerIAuthTabCallback = WidgetWatchlists.WatchList.IAuthTabCallback();
                    int i4 = onWarmupCompleted + 111;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        return kSerializerIAuthTabCallback;
                    }
                    throw null;
                }
            })};
            int i = onExtraCallbackWithResult + 73;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public /* synthetic */ WatchList(int i, long j, List list, String str, r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg, okycx okycxVar) {
            SerialDescriptor descriptor;
            int i2 = 13;
            if (13 != (i & 13)) {
                int i3 = IAuthTabCallback + 79;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    descriptor = WidgetWatchlists$WatchList$$serializer.INSTANCE.getDescriptor();
                    i2 = 109;
                } else {
                    descriptor = WidgetWatchlists$WatchList$$serializer.INSTANCE.getDescriptor();
                }
                htf31.onExtraCallbackWithResult(i, i2, descriptor);
            }
            this.id = j;
            if ((i & 2) == 0) {
                this.items = null;
                int i4 = IAuthTabCallback + 107;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 4 / 3;
                }
                this.name = str;
                this.type = r8lambdabrizzqzhaizmdvstl2yymmz7zsg;
            }
            this.items = list;
            int i6 = IAuthTabCallback + 113;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            this.name = str;
            this.type = r8lambdabrizzqzhaizmdvstl2yymmz7zsg;
        }

        public WatchList(long j, @Nullable List<Item> list, @NotNull String str, @NotNull r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(r8lambdabrizzqzhaizmdvstl2yymmz7zsg, "");
            this.id = j;
            this.items = list;
            this.name = str;
            this.type = r8lambdabrizzqzhaizmdvstl2yymmz7zsg;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[PHI: r1
          0x0030: PHI (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x002a, B:10:0x002e, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[PHI: r1
          0x002c: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x002a, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onNavigationEvent(WatchList watchList, vyl vylVar, SerialDescriptor serialDescriptor) {
            Lazy<KSerializer<Object>>[] lazyArr;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                lazyArr = $childSerializers;
                vylVar.onExtraCallback(serialDescriptor, 0, watchList.id);
                if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                    if (watchList.items != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr[1].getValue(), watchList.items);
                        int i3 = onWarmupCompleted + 117;
                        IAuthTabCallback = i3 % 128;
                        int i4 = i3 % 2;
                    }
                }
            } else {
                lazyArr = $childSerializers;
                vylVar.onExtraCallback(serialDescriptor, 0, watchList.id);
                if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                }
            }
            vylVar.onExtraCallback(serialDescriptor, 2, watchList.name);
            vylVar.onNavigationEvent(serialDescriptor, 3, (py) lazyArr[3].getValue(), watchList.type);
        }

        public static final /* synthetic */ Lazy[] onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 25;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i2 + 101;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return lazyArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ WatchList(long j, List list, String str, r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = IAuthTabCallback;
                int i3 = i2 + 5;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 83;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                list = null;
            }
            this(j, list, str, r8lambdabrizzqzhaizmdvstl2yymmz7zsg);
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            WatchList watchList = (WatchList) objArr[0];
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 13;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            long j = watchList.id;
            int i5 = i2 + 97;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return Long.valueOf(j);
        }

        public final List<Item> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            List<Item> list = this.items;
            int i5 = i3 + 13;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            WatchList watchList = (WatchList) objArr[0];
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = watchList.name;
            if (i4 == 0) {
                int i5 = 34 / 0;
            }
            int i6 = i3 + 99;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 79 / 0;
            }
            return str;
        }

        @liq
        public static final class Item {
            public static final Companion Companion = new Companion(null);
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            private final String assetType;
            private final Long id;
            private final String itemType;
            private final String productCode;
            private final String productName;

            static {
                int i = onWarmupCompleted + 81;
                IAuthTabCallback = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onNavigationEvent + 83;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(obj instanceof Item)) {
                    int i4 = onExtraCallback + 11;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        return false;
                    }
                    throw null;
                }
                Item item = (Item) obj;
                if (!Intrinsics.areEqual(this.itemType, item.itemType)) {
                    int i5 = onNavigationEvent + 33;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        return false;
                    }
                    throw null;
                }
                if (!Intrinsics.areEqual(this.assetType, item.assetType)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.id, item.id)) {
                    int i6 = onNavigationEvent + 39;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.productCode, item.productCode)) {
                    return Intrinsics.areEqual(this.productName, item.productName);
                }
                int i8 = onNavigationEvent + 87;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 27;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                String str = this.itemType;
                int iHashCode2 = str == null ? 0 : str.hashCode();
                String str2 = this.assetType;
                int iHashCode3 = str2 == null ? 0 : str2.hashCode();
                Long l = this.id;
                if (l == null) {
                    int i4 = onExtraCallback + 3;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = l.hashCode();
                }
                int iHashCode4 = this.productCode.hashCode();
                String str3 = this.productName;
                return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Item(itemType=" + this.itemType + ", assetType=" + this.assetType + ", id=" + this.id + ", productCode=" + this.productCode + ", productName=" + this.productName + ")";
                int i2 = onNavigationEvent + 105;
                onExtraCallback = i2 % 128;
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

                public final KSerializer<Item> serializer() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 85;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    WidgetWatchlists$WatchList$Item$$serializer widgetWatchlists$WatchList$Item$$serializer = WidgetWatchlists$WatchList$Item$$serializer.INSTANCE;
                    int i4 = onExtraCallbackWithResult + 101;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return widgetWatchlists$WatchList$Item$$serializer;
                }
            }

            public /* synthetic */ Item(int i, String str, String str2, Long l, String str3, String str4, okycx okycxVar) {
                if (8 != (i & 8)) {
                    htf31.onExtraCallbackWithResult(i, 8, WidgetWatchlists$WatchList$Item$$serializer.INSTANCE.getDescriptor());
                }
                Object obj = null;
                if ((i & 1) == 0) {
                    this.itemType = null;
                } else {
                    this.itemType = str;
                }
                if ((i & 2) == 0) {
                    int i2 = onExtraCallback + 97;
                    int i3 = i2 % 128;
                    onNavigationEvent = i3;
                    int i4 = i2 % 2;
                    this.assetType = null;
                    int i5 = i3 + 55;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 2 % 2;
                    }
                } else {
                    this.assetType = str2;
                }
                if ((i & 4) == 0) {
                    this.id = null;
                } else {
                    this.id = l;
                }
                int i7 = 2 % 2;
                this.productCode = str3;
                if ((i & 16) != 0) {
                    this.productName = str4;
                    return;
                }
                this.productName = null;
                int i8 = onExtraCallback + 121;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            public Item(@Nullable String str, @Nullable String str2, @Nullable Long l, @NotNull String str3, @Nullable String str4) {
                Intrinsics.checkNotNullParameter(str3, "");
                this.itemType = str;
                this.assetType = str2;
                this.id = l;
                this.productCode = str3;
                this.productName = str4;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void onExtraCallbackWithResult(Item item, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 95;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                    int i4 = onNavigationEvent + 43;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        String str = item.itemType;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (item.itemType != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, item.itemType);
                    }
                }
                if (!(!vylVar.onWarmupCompleted(serialDescriptor, 1))) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, item.assetType);
                } else {
                    int i5 = onExtraCallback + 13;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    if (item.assetType != null) {
                    }
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                    int i7 = onExtraCallback + 43;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    if (item.id != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, item.id);
                    }
                }
                vylVar.onExtraCallback(serialDescriptor, 3, item.productCode);
                if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
                    int i9 = onNavigationEvent + 29;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    String str2 = item.productName;
                    if (i10 != 0) {
                        int i11 = 52 / 0;
                        if (str2 == null) {
                            return;
                        }
                    } else if (str2 == null) {
                        return;
                    }
                }
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, item.productName);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Item(String str, String str2, Long l, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                String str5;
                Long l2;
                String str6;
                String str7 = (i & 1) != 0 ? null : str;
                if ((i & 2) != 0) {
                    int i2 = onExtraCallback + 61;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                    str5 = null;
                } else {
                    str5 = str2;
                }
                if ((i & 4) != 0) {
                    int i5 = onExtraCallback + 123;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                    int i6 = 2 % 2;
                    l2 = null;
                } else {
                    l2 = l;
                }
                if ((i & 16) != 0) {
                    int i7 = 2 % 2;
                    str6 = null;
                } else {
                    str6 = str4;
                }
                this(str7, str5, l2, str3, str6);
            }

            public final String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 31;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                String str = this.productCode;
                int i5 = i3 + 95;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 80 / 0;
                }
                return str;
            }

            public final String onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 39;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                String str = this.productName;
                int i5 = i2 + 31;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 50 / 0;
                }
                return str;
            }

            public final ItemType onWarmupCompleted() {
                int i = 2 % 2;
                ItemType.Companion companion = ItemType.Companion;
                String str = this.assetType;
                if (str == null) {
                    int i2 = onNavigationEvent + 19;
                    int i3 = i2 % 128;
                    onExtraCallback = i3;
                    int i4 = i2 % 2;
                    str = this.itemType;
                    int i5 = i3 + 41;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                }
                return companion.onNavigationEvent(str);
            }
        }

        public final r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg = this.type;
            int i5 = i3 + 1;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 31 / 0;
            }
            return r8lambdabrizzqzhaizmdvstl2yymmz7zsg;
        }

        public final long onWarmupCompleted() {
            return ((Long) onNavigationEvent(C40Encoder.onExtraCallback(), new Object[]{this}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 437005217, -437005217)).longValue();
        }

        public final String IAuthTabCallbackStub() {
            return (String) onNavigationEvent(C40Encoder.onExtraCallback(), new Object[]{this}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 1922337420, -1922337419);
        }
    }

    public final List<WatchList> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        List<WatchList> list = this.watchLists;
        int i5 = i2 + 99;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return list;
    }
}
