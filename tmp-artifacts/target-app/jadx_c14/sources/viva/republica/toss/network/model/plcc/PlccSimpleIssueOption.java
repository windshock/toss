package viva.republica.toss.network.model.plcc;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.plcc.PlccSimpleIssueOption$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PlccSimpleIssueOption {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String id;
    private final String title;

    static {
        int i = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof PlccSimpleIssueOption)) {
            return false;
        }
        PlccSimpleIssueOption plccSimpleIssueOption = (PlccSimpleIssueOption) obj;
        if (!Intrinsics.areEqual(this.id, plccSimpleIssueOption.id) || !Intrinsics.areEqual(this.title, plccSimpleIssueOption.title)) {
            return false;
        }
        int i4 = onNavigationEvent + 103;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.id.hashCode() * 31) + this.title.hashCode();
        int i4 = onNavigationEvent + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccSimpleIssueOption(id=" + this.id + ", title=" + this.title + ")";
        int i2 = onNavigationEvent + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PlccSimpleIssueOption> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            PlccSimpleIssueOption$.serializer serializerVar = PlccSimpleIssueOption$.serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 79 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ PlccSimpleIssueOption(int i, String str, String str2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onNavigationEvent + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, PlccSimpleIssueOption$.serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallback + 81;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 5;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.id = str;
        this.title = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(PlccSimpleIssueOption plccSimpleIssueOption, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, plccSimpleIssueOption.id);
        vylVar.onExtraCallback(serialDescriptor, 1, plccSimpleIssueOption.title);
        int i4 = IAuthTabCallback + 117;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 99;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 69;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 98 / 0;
        }
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 15;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
