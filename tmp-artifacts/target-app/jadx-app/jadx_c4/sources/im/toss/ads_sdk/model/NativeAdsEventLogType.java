package im.toss.ads_sdk.model;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.kt;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class NativeAdsEventLogType {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.model.NativeAdsEventLogType$$ExternalSyntheticLambda0
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnNavigationEvent = NativeAdsEventLogType.onNavigationEvent();
            int i4 = onNavigationEvent + 53;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerOnNavigationEvent;
            }
            throw null;
        }
    });

    public /* synthetic */ NativeAdsEventLogType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private NativeAdsEventLogType() {
    }

    public /* synthetic */ NativeAdsEventLogType(int i, okycx okycxVar) {
    }

    public static final /* synthetic */ Lazy onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 57;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        int i4 = i2 + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return lazy;
    }

    public static final class IAuthTabCallbackDefault extends NativeAdsEventLogType {
        public static final IAuthTabCallbackDefault IAuthTabCallback = new IAuthTabCallbackDefault();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallbackDefault() {
            super(null);
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return "IMP_1PX";
            }
            throw null;
        }
    }

    public static final class asInterface extends NativeAdsEventLogType {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        public static final asInterface onExtraCallbackWithResult = new asInterface();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallback + 23;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private asInterface() {
            super(null);
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 113;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return "IMP_100P";
            }
            throw null;
        }
    }

    public static final class getInterfaceDescriptor extends NativeAdsEventLogType {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final getInterfaceDescriptor onExtraCallbackWithResult = new getInterfaceDescriptor();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 41;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        private getInterfaceDescriptor() {
            super(null);
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 109;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 75;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return "VIMP";
        }
    }

    public static final class access000 extends NativeAdsEventLogType {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final access000 onNavigationEvent = new access000();
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 21;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        private access000() {
            super(null);
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return "POPUPSTORE_VIMP";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent extends NativeAdsEventLogType {
        public static final onNavigationEvent IAuthTabCallback = new onNavigationEvent();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 49;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        private onNavigationEvent() {
            super(null);
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return "CLICK";
            }
            int i3 = 85 / 0;
            return "CLICK";
        }
    }

    public static final class onExtraCallback extends NativeAdsEventLogType {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final String onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 117;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i4 = i2 + 123;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallback, ((onExtraCallback) obj).onExtraCallback)) {
                return true;
            }
            int i6 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onExtraCallback.hashCode();
            if (i3 == 0) {
                int i4 = 89 / 0;
            }
            return iHashCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallback = str;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "CLICK_" + this.onExtraCallback;
            int i2 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    public static final class asBinder extends NativeAdsEventLogType {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final asBinder onWarmupCompleted = new asBinder();

        static {
            int i = onExtraCallback + 95;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private asBinder() {
            super(null);
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 17;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return "LIKE";
        }
    }

    public static final class IAuthTabCallback_Parcel extends NativeAdsEventLogType {
        private static int IAuthTabCallback = 0;
        public static final IAuthTabCallback_Parcel onExtraCallback = new IAuthTabCallback_Parcel();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 75;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 / 0;
            }
        }

        private IAuthTabCallback_Parcel() {
            super(null);
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return "UNLIKE";
            }
            int i3 = 96 / 0;
            return "UNLIKE";
        }
    }

    public static final class onWarmupCompleted extends NativeAdsEventLogType {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        public static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 119;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 49 / 0;
            }
        }

        private onWarmupCompleted() {
            super(null);
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return "BACK";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult extends NativeAdsEventLogType {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 67;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        private onExtraCallbackWithResult() {
            super(null);
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 31;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 111;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return "CLOSE";
        }
    }

    public static final class ICustomTabsCallback extends NativeAdsEventLogType {
        public static final ICustomTabsCallback IAuthTabCallback = new ICustomTabsCallback();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onNavigationEvent + 95;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private ICustomTabsCallback() {
            super(null);
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 1;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return "VIEW_START";
        }
    }

    public static final class access100 extends NativeAdsEventLogType {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final access100 onExtraCallbackWithResult = new access100();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 55;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        private access100() {
            super(null);
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                int i4 = 92 / 0;
            }
            int i5 = i3 + 57;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return "VIEW";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallbackStubProxy extends NativeAdsEventLogType {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final IAuthTabCallbackStubProxy onWarmupCompleted = new IAuthTabCallbackStubProxy();

        static {
            int i = onNavigationEvent + 23;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallbackStubProxy() {
            super(null);
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return "VIEW_COMPLETE";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class writeTypedObject extends NativeAdsEventLogType {
        private static int IAuthTabCallback = 0;
        public static final writeTypedObject onExtraCallback = new writeTypedObject();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallbackWithResult + 43;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private writeTypedObject() {
            super(null);
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 49;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 33;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return "VIEW_MUTE";
        }
    }

    public static final class onPostMessage extends NativeAdsEventLogType {
        public static final onPostMessage IAuthTabCallback = new onPostMessage();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 15;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        private onPostMessage() {
            super(null);
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 121;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 57;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return "VIEW_UNMUTE";
        }
    }

    public static final class readTypedObject extends NativeAdsEventLogType {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final readTypedObject onWarmupCompleted = new readTypedObject();

        static {
            int i = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private readTypedObject() {
            super(null);
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 97;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return "VIEW_SKIP";
        }
    }

    public static final class extraCallback extends NativeAdsEventLogType {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final long onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 19;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof extraCallback)) {
                int i5 = i4 + 103;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (this.onNavigationEvent == ((extraCallback) obj).onNavigationEvent) {
                int i7 = i2 + 95;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return true;
            }
            int i9 = i4 + 109;
            onWarmupCompleted = i9 % 128;
            boolean z = i9 % 2 != 0;
            int i10 = i4 + 9;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            return z;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Long.hashCode(this.onNavigationEvent);
            int i4 = onExtraCallback + 65;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public extraCallback(long j) {
            super(null);
            this.onNavigationEvent = j;
        }

        public final long IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 57;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            long j = this.onNavigationEvent;
            int i5 = i2 + 111;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return j;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "VIEW_" + this.onNavigationEvent + "P";
            int i2 = onExtraCallback + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    public static final class extraCallbackWithResult extends NativeAdsEventLogType {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private final long onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 69;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof extraCallbackWithResult)) {
                int i4 = onExtraCallback + 111;
                IAuthTabCallback = i4 % 128;
                return i4 % 2 != 0;
            }
            if (this.onNavigationEvent != ((extraCallbackWithResult) obj).onNavigationEvent) {
                int i5 = onExtraCallback;
                int i6 = i5 + 11;
                IAuthTabCallback = i6 % 128;
                z = i6 % 2 != 0;
                int i7 = i5 + 77;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 70 / 0;
                }
            }
            return z;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Long.hashCode(this.onNavigationEvent);
                obj.hashCode();
                throw null;
            }
            int iHashCode = Long.hashCode(this.onNavigationEvent);
            int i3 = onExtraCallback + 61;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public extraCallbackWithResult(long j) {
            super(null);
            this.onNavigationEvent = j;
        }

        public final long onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            long j = this.onNavigationEvent;
            int i5 = i3 + 97;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return j;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "VIEW_" + this.onNavigationEvent + "S";
            int i2 = IAuthTabCallback + 15;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallback extends NativeAdsEventLogType {
        private static int IAuthTabCallback = 1;
        public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                int i2 = 23 / 0;
            }
        }

        private IAuthTabCallback() {
            super(null);
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 21;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return "EARNED_REWARD";
        }
    }

    public static final class onTransact extends NativeAdsEventLogType {
        public static final onTransact IAuthTabCallback = new onTransact();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 33;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                int i2 = 39 / 0;
            }
        }

        private onTransact() {
            super(null);
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 125;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 80 / 0;
            }
            int i5 = i2 + 37;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return "PLAYABLE_FIRST_INTERACTION";
        }
    }

    public static final class IAuthTabCallbackStub extends NativeAdsEventLogType {
        private static int IAuthTabCallback;
        private static int IAuthTabCallbackStub;
        private static short[] asBinder;
        private static int onExtraCallback;
        private static byte[] onExtraCallbackWithResult;
        public static final IAuthTabCallbackStub onNavigationEvent;
        private static int onWarmupCompleted;
        private static final byte[] $$a = {34, -56, 26, -92};
        private static final int $$b = 200;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onTransact = 0;
        private static int asInterface = 1;
        private static int IAuthTabCallbackDefault = 0;

        private static String $$c(byte b, int i, short s) {
            int i2 = b * 4;
            byte[] bArr = $$a;
            int i3 = 115 - (i * 4);
            int i4 = 4 - (s * 4);
            byte[] bArr2 = new byte[i2 + 1];
            int i5 = -1;
            if (bArr == null) {
                i4++;
                i3 = (-i3) + i4;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i3;
                if (i6 == i2) {
                    return new String(bArr2, 0);
                }
                i4++;
                i3 = (-bArr[i4]) + i3;
                i5 = i6;
            }
        }

        static {
            IAuthTabCallbackStub = 1;
            onExtraCallback();
            onNavigationEvent = new IAuthTabCallbackStub();
            int i = IAuthTabCallbackDefault + 57;
            IAuthTabCallbackStub = i % 128;
            int i2 = i % 2;
        }

        private IAuthTabCallbackStub() {
            super(null);
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 101;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a((short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) - 96), 1996558811 + (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1313828736 + (ViewConfiguration.getFadingEdgeLength() >> 16), (-45) - TextUtils.getOffsetBefore("", 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i4 = onTransact + 45;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return strIntern;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            long j;
            int i4;
            boolean z;
            int length;
            byte[] bArr;
            int i5 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0, 0) + 43424), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42, 22439 - View.combineMeasuredStates(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                boolean z2 = iIntValue == -1;
                if (z2) {
                    byte[] bArr2 = onExtraCallbackWithResult;
                    if (bArr2 != null) {
                        int i6 = $11 + 41;
                        $10 = i6 % 128;
                        if (i6 % 2 != 0) {
                            length = bArr2.length;
                            bArr = new byte[length];
                        } else {
                            length = bArr2.length;
                            bArr = new byte[length];
                        }
                        for (int i7 = 0; i7 < length; i7++) {
                            int i8 = $11 + 41;
                            $10 = i8 % 128;
                            int i9 = i8 % 2;
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr2[i7])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (Process.myPid() >> 22)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 55, (ViewConfiguration.getScrollBarSize() >> 8) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr2 = bArr;
                    }
                    if (bArr2 != null) {
                        byte[] bArr3 = onExtraCallbackWithResult;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 43424), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 41, 22439 - View.getDefaultSize(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                        int i10 = $10 + 77;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (asBinder[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    }
                } else {
                    j = -4629411779493505016L;
                }
                if (iIntValue > 0) {
                    int i12 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j));
                    if (z2) {
                        int i13 = $10 + 75;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i12 + i4;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), Color.blue(0) + 86, View.resolveSize(0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onExtraCallbackWithResult;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i15 = 0;
                        while (i15 < length2) {
                            int i16 = $11 + 111;
                            $10 = i16 % 128;
                            if (i16 % 2 != 0) {
                                bArr5[i15] = (byte) (bArr4[i15] ^ (-4629411779493505016L));
                            } else {
                                bArr5[i15] = (byte) (bArr4[i15] ^ (-4629411779493505016L));
                                i15++;
                            }
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i17 = $10 + 121;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i19 = $10 + 15;
                        $11 = i19 % 128;
                        int i20 = i19 % 2;
                        if (z) {
                            byte[] bArr6 = onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r4] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = asBinder;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r4] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        static void onExtraCallback() {
            IAuthTabCallback = 750335533;
            onExtraCallback = -1538795484;
            onWarmupCompleted = 368527581;
            onExtraCallbackWithResult = new byte[]{-45, 95, -96, -87, -85, 85, 81};
        }
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) NativeAdsEventLogType.onWarmupCompleted().getValue();
            int i4 = onWarmupCompleted + 25;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final KSerializer<NativeAdsEventLogType> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<NativeAdsEventLogType> kSerializerOnNavigationEvent = onNavigationEvent();
            int i4 = onNavigationEvent + 111;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final List<NativeAdsEventLogType> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            List<NativeAdsEventLogType> listListOf = CollectionsKt.listOf(new NativeAdsEventLogType[]{writeTypedObject.onExtraCallback, onPostMessage.IAuthTabCallback, asBinder.onWarmupCompleted, IAuthTabCallback_Parcel.onExtraCallback});
            int i4 = onNavigationEvent + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return listListOf;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
        
            if (r9.length() > 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
        
            if (r9.length() > 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
        
            return new im.toss.ads_sdk.model.NativeAdsEventLogType.onExtraCallback(r9);
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final NativeAdsEventLogType onWarmupCompleted(@NotNull String str) {
            Long longOrNull;
            Long longOrNull2;
            String strSubstring;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            String string = StringsKt.trim(str).toString();
            if (string.length() == 0) {
                return IAuthTabCallbackStub.onNavigationEvent;
            }
            String upperCase = string.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            Object obj = null;
            if (StringsKt.startsWith$default(upperCase, "CLICK_", false, 2, (Object) null)) {
                int i2 = onWarmupCompleted + 93;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                if (string.length() > 6) {
                    int i4 = onWarmupCompleted + 61;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        strSubstring = string.substring(64);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    } else {
                        strSubstring = string.substring(6);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    }
                }
            }
            MatchResult matchResultOnNavigationEvent = new Regex("^VIEW_(\\d+)P$").onNavigationEvent(upperCase);
            if (matchResultOnNavigationEvent != null && (longOrNull2 = StringsKt.toLongOrNull((String) matchResultOnNavigationEvent.getGroupValues().get(1))) != null) {
                return new extraCallback(longOrNull2.longValue());
            }
            MatchResult matchResultOnNavigationEvent2 = new Regex("^VIEW_(\\d+)S$").onNavigationEvent(upperCase);
            if (matchResultOnNavigationEvent2 != null) {
                int i5 = onNavigationEvent + 49;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0 ? (longOrNull = StringsKt.toLongOrNull((String) matchResultOnNavigationEvent2.getGroupValues().get(1))) != null : (longOrNull = StringsKt.toLongOrNull((String) matchResultOnNavigationEvent2.getGroupValues().get(0))) != null) {
                    return new extraCallbackWithResult(longOrNull.longValue());
                }
            }
            switch (upperCase.hashCode()) {
                case -2003416685:
                    if (upperCase.equals("VIEW_COMPLETE")) {
                        return IAuthTabCallbackStubProxy.onWarmupCompleted;
                    }
                    break;
                case -1787118160:
                    if (upperCase.equals("UNLIKE")) {
                        return IAuthTabCallback_Parcel.onExtraCallback;
                    }
                    break;
                case -1765328046:
                    if (upperCase.equals("PLAYABLE_FIRST_INTERACTION")) {
                        int i6 = onNavigationEvent + 69;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 != 0) {
                            return onTransact.IAuthTabCallback;
                        }
                        onTransact ontransact = onTransact.IAuthTabCallback;
                        obj.hashCode();
                        throw null;
                    }
                    break;
                case -1650501914:
                    if (upperCase.equals("IMP_1PX")) {
                        int i7 = onWarmupCompleted + 89;
                        onNavigationEvent = i7 % 128;
                        if (i7 % 2 == 0) {
                            return IAuthTabCallbackDefault.IAuthTabCallback;
                        }
                        IAuthTabCallbackDefault iAuthTabCallbackDefault = IAuthTabCallbackDefault.IAuthTabCallback;
                        obj.hashCode();
                        throw null;
                    }
                    break;
                case -1140230688:
                    if (!(!upperCase.equals("POPUPSTORE_VIMP"))) {
                        return access000.onNavigationEvent;
                    }
                    break;
                case -118222296:
                    if (upperCase.equals("VIEW_START")) {
                        int i8 = onNavigationEvent + 109;
                        onWarmupCompleted = i8 % 128;
                        if (i8 % 2 != 0) {
                            return ICustomTabsCallback.IAuthTabCallback;
                        }
                        ICustomTabsCallback iCustomTabsCallback = ICustomTabsCallback.IAuthTabCallback;
                        throw null;
                    }
                    break;
                case 2030823:
                    if (upperCase.equals("BACK")) {
                        int i9 = onNavigationEvent + 113;
                        onWarmupCompleted = i9 % 128;
                        if (i9 % 2 != 0) {
                            return onWarmupCompleted.onExtraCallbackWithResult;
                        }
                        onWarmupCompleted onwarmupcompleted = onWarmupCompleted.onExtraCallbackWithResult;
                        throw null;
                    }
                    break;
                case 2336663:
                    if (upperCase.equals("LIKE")) {
                        return asBinder.onWarmupCompleted;
                    }
                    break;
                case 2634405:
                    if (!(!upperCase.equals("VIEW"))) {
                        return access100.onExtraCallbackWithResult;
                    }
                    break;
                case 2634646:
                    if (upperCase.equals("VIMP")) {
                        return getInterfaceDescriptor.onExtraCallbackWithResult;
                    }
                    break;
                case 64212328:
                    if (upperCase.equals("CLICK")) {
                        int i10 = onWarmupCompleted + 75;
                        onNavigationEvent = i10 % 128;
                        int i11 = i10 % 2;
                        return onNavigationEvent.IAuthTabCallback;
                    }
                    break;
                case 64218584:
                    if (upperCase.equals("CLOSE")) {
                        int i12 = onWarmupCompleted + 7;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % 2;
                        return onExtraCallbackWithResult.onExtraCallbackWithResult;
                    }
                    break;
                case 374016306:
                    if (upperCase.equals("IMP_100P")) {
                        return asInterface.onExtraCallbackWithResult;
                    }
                    break;
                case 480349687:
                    if (upperCase.equals("EARNED_REWARD")) {
                        int i14 = onNavigationEvent + 13;
                        onWarmupCompleted = i14 % 128;
                        int i15 = i14 % 2;
                        return IAuthTabCallback.onExtraCallback;
                    }
                    break;
                case 682153740:
                    if (upperCase.equals("VIEW_UNMUTE")) {
                        return onPostMessage.IAuthTabCallback;
                    }
                    break;
                case 1242935155:
                    if (upperCase.equals("VIEW_MUTE")) {
                        return writeTypedObject.onExtraCallback;
                    }
                    break;
                case 1243103961:
                    if (upperCase.equals("VIEW_SKIP")) {
                        return readTypedObject.onWarmupCompleted;
                    }
                    break;
            }
            return IAuthTabCallbackStub.onNavigationEvent;
        }
    }

    static {
        int i = IAuthTabCallback + 93;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 49 / 0;
        }
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        kt ktVar = new kt("im.toss.ads_sdk.model.NativeAdsEventLogType", Reflection.getOrCreateKotlinClass(NativeAdsEventLogType.class), new KClass[0], new KSerializer[0], new Annotation[0]);
        int i2 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return ktVar;
        }
        throw null;
    }
}
