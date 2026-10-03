package viva.republica.toss.network.model.cardsales.recommend;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.okycx;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardRecommendCardImage implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final onNavigationEvent type;
    private final String url;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CardRecommendCardImage> CREATOR = new IAuthTabCallback();
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return CardRecommendCardImage.onWarmupCompleted();
            }
            CardRecommendCardImage.onWarmupCompleted();
            throw null;
        }
    }), null};

    public static final class IAuthTabCallback implements Parcelable.Creator<CardRecommendCardImage> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ CardRecommendCardImage createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(parcel);
            }
            onExtraCallbackWithResult(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ CardRecommendCardImage[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 77;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return onNavigationEvent(i);
            }
            onNavigationEvent(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final CardRecommendCardImage onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            CardRecommendCardImage cardRecommendCardImage = new CardRecommendCardImage(onNavigationEvent.valueOf(parcel.readString()), parcel.readString());
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return cardRecommendCardImage;
        }

        public final CardRecommendCardImage[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 19;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            CardRecommendCardImage[] cardRecommendCardImageArr = new CardRecommendCardImage[i];
            int i6 = i4 + 83;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 56 / 0;
            }
            return cardRecommendCardImageArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CardRecommendCardImage() {
        this((onNavigationEvent) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.ImageType", onNavigationEvent.values());
        }
        updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.ImageType", onNavigationEvent.values());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        KSerializer kSerializerIAuthTabCallbackStub;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
            int i3 = 65 / 0;
        } else {
            kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
        }
        int i4 = onNavigationEvent + 1;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return kSerializerIAuthTabCallbackStub;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 97;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 109;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardRecommendCardImage)) {
            int i2 = onWarmupCompleted + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        CardRecommendCardImage cardRecommendCardImage = (CardRecommendCardImage) obj;
        if (this.type == cardRecommendCardImage.type) {
            return Intrinsics.areEqual(this.url, cardRecommendCardImage.url);
        }
        int i4 = onWarmupCompleted + 41;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.type.hashCode() >>> 102) / this.url.hashCode() : (this.type.hashCode() * 31) + this.url.hashCode();
        int i3 = onWarmupCompleted + 83;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardRecommendCardImage(type=" + this.type + ", url=" + this.url + ")";
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 77;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        onNavigationEvent onnavigationevent = this.type;
        if (i4 != 0) {
            parcel.writeString(onnavigationevent.name());
            parcel.writeString(this.url);
        } else {
            parcel.writeString(onnavigationevent.name());
            parcel.writeString(this.url);
            int i5 = 60 / 0;
        }
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CardRecommendCardImage> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            CardRecommendCardImage$.serializer serializerVar = CardRecommendCardImage$.serializer.INSTANCE;
            int i4 = onExtraCallback + 107;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        int i = IAuthTabCallback + 115;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ CardRecommendCardImage(int i, onNavigationEvent onnavigationevent, String str, okycx okycxVar) {
        if ((i & 1) == 0) {
            onnavigationevent = onNavigationEvent.LOGO_FILL;
            int i2 = 2 % 2;
        }
        this.type = onnavigationevent;
        if ((i & 2) != 0) {
            this.url = str;
            int i3 = onWarmupCompleted + 97;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = onWarmupCompleted;
        int i6 = i5 + 19;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        this.url = "";
        if (i7 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i8 = i5 + 53;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
    }

    public CardRecommendCardImage(@NotNull onNavigationEvent onnavigationevent, @NotNull String str) {
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.type = onnavigationevent;
        this.url = str;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 33;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onNavigationEvent
            int r1 = r1 + 65
            int r2 = r1 % 128
            viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onWarmupCompleted = r2
            int r1 = r1 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.$childSerializers
            r2 = 0
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L24
            int r3 = viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onNavigationEvent
            int r3 = r3 + 43
            int r4 = r3 % 128
            viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onWarmupCompleted = r4
            int r3 = r3 % r0
            viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage$onNavigationEvent r3 = r5.type
            viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage$onNavigationEvent r4 = viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onNavigationEvent.LOGO_FILL
            if (r3 == r4) goto L31
        L24:
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage$onNavigationEvent r3 = r5.type
            r6.onNavigationEvent(r7, r2, r1, r3)
        L31:
            r1 = 1
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            if (r2 != 0) goto L4c
            int r2 = viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onWarmupCompleted
            int r2 = r2 + 71
            int r3 = r2 % 128
            viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onNavigationEvent = r3
            int r2 = r2 % r0
            java.lang.String r0 = r5.url
            java.lang.String r2 = ""
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 == 0) goto L4c
            goto L51
        L4c:
            java.lang.String r5 = r5.url
            r6.onExtraCallback(r7, r1, r5)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onWarmupCompleted(viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CardRecommendCardImage(onNavigationEvent onnavigationevent, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 29;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                onnavigationevent = onNavigationEvent.LOGO_FILL;
                int i3 = 2 % 2;
            } else {
                onNavigationEvent onnavigationevent2 = onNavigationEvent.LOGO_FILL;
                throw null;
            }
        }
        if ((i & 2) != 0) {
            str = "";
            int i4 = onWarmupCompleted + 15;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this(onnavigationevent, str);
    }

    public final onNavigationEvent onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 53;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent onnavigationevent = this.type;
        int i5 = i2 + 125;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return onnavigationevent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.url;
        int i5 = i2 + 83;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 41 / 0;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r1 = viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onWarmupCompleted + 3;
        viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r5.type == viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onNavigationEvent.HORIZONTAL) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r5.type == viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onNavigationEvent.HORIZONTAL) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r1 = viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onWarmupCompleted + 9;
        viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean IAuthTabCallback() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onNavigationEvent
            int r1 = r1 + 45
            int r2 = r1 % 128
            viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onWarmupCompleted = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L19
            viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage$onNavigationEvent r1 = r5.type
            viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage$onNavigationEvent r3 = viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onNavigationEvent.HORIZONTAL
            r4 = 8
            int r4 = r4 / r2
            if (r1 != r3) goto L2a
            goto L1f
        L19:
            viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage$onNavigationEvent r1 = r5.type
            viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage$onNavigationEvent r3 = viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onNavigationEvent.HORIZONTAL
            if (r1 != r3) goto L2a
        L1f:
            int r1 = viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onWarmupCompleted
            int r1 = r1 + 9
            int r2 = r1 % 128
            viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onNavigationEvent = r2
            int r1 = r1 % r0
            r0 = 1
            return r0
        L2a:
            int r1 = viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onWarmupCompleted
            int r1 = r1 + 3
            int r3 = r1 % 128
            viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.onNavigationEvent = r3
            int r1 = r1 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage.IAuthTabCallback():boolean");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        public static final onNavigationEvent HORIZONTAL = new onNavigationEvent("HORIZONTAL", 0);
        public static final onNavigationEvent VERTICAL = new onNavigationEvent("VERTICAL", 1);
        public static final onNavigationEvent LOGO = new onNavigationEvent("LOGO", 2);
        public static final onNavigationEvent LOGO_FILL = new onNavigationEvent("LOGO_FILL", 3);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = HORIZONTAL;
            if (i3 != 0) {
                return new onNavigationEvent[]{onnavigationevent, VERTICAL, LOGO, LOGO_FILL};
            }
            onNavigationEvent onnavigationevent2 = VERTICAL;
            onNavigationEvent onnavigationevent3 = LOGO;
            onNavigationEvent onnavigationevent4 = LOGO_FILL;
            onNavigationEvent[] onnavigationeventArr = new onNavigationEvent[5];
            onnavigationeventArr[1] = onnavigationevent;
            onnavigationeventArr[1] = onnavigationevent2;
            onnavigationeventArr[3] = onnavigationevent3;
            onnavigationeventArr[4] = onnavigationevent4;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i4 = i3 + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            if (i3 != 0) {
                throw null;
            }
            int i4 = IAuthTabCallback + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i4 = IAuthTabCallback + 23;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onExtraCallbackWithResult + 91;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }
}
