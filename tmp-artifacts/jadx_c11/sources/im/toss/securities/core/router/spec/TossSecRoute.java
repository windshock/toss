package im.toss.securities.core.router.spec;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.securities.core.router.spec.TossSecRoute;
import im.toss.tosssecurities.core.base.StockStatus;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.InternalCameraPresenceListener;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.access8100;
import o.delimiterOffset;
import o.getCaptureIds;
import o.getMaxResolution;
import o.getWriggleLayout;
import o.getWrite;
import o.htf1;
import o.htf31;
import o.kt;
import o.liq;
import o.nc;
import o.okycx;
import o.oty1;
import o.setPrivacyPolicyUri;
import o.shouldShowTermsAndPrivacyPolicyAlertInGdpr;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface TossSecRoute {
    public static final Companion Companion = Companion.IAuthTabCallback;

    @liq
    public static final class Loading implements TossSecRoute {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final Loading INSTANCE = new Loading();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.core.router.spec.TossSecRoute$Loading$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 117;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnWarmupCompleted = TossSecRoute.Loading.onWarmupCompleted();
                int i4 = onExtraCallbackWithResult + 93;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnWarmupCompleted;
                }
                throw null;
            }
        });

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallback = onExtraCallback();
            int i4 = onWarmupCompleted + 111;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallback;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 69;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 109;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(!(obj instanceof Loading))) {
                return true;
            }
            int i7 = i2 + 89;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 97;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 83;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return 1194194039;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 113;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return "Loading";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        private Loading() {
        }

        private static final /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            htf1 htf1Var = new htf1("im.toss.securities.core.router.spec.TossSecRoute.Loading", INSTANCE, new Annotation[0]);
            int i2 = onNavigationEvent + 3;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return htf1Var;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) $cachedSerializer$delegate.getValue();
            int i4 = onWarmupCompleted + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializer;
        }

        public final KSerializer<Loading> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<Loading> kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onNavigationEvent + 17;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerOnExtraCallbackWithResult;
            }
            throw null;
        }
    }

    @liq
    public static final class Main implements TossSecRoute {
        public static final int $stable = 0;
        public static final String PARAM_RESTORE_TARGET_TAB = "restoreTargetTab";
        public static final String PARAM_SCROLL_TO_SECTION = "scrollToSection";
        public static final String PARAM_TAB = "tab";
        public static final String PARAM_WATCHLIST_ID = "watchlistId";
        public static final String PATH = "/";
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String restoreTargetTab;
        private final String scrollToSection;
        private final String tab;
        private final Long watchlistId;
        public static final Companion Companion = new Companion(null);
        private static final getCaptureIds<Main, Object> Saver = getMaxResolution.IAuthTabCallback(new Function2() { // from class: im.toss.securities.core.router.spec.TossSecRoute$Main$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 83;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Map mapOnNavigationEvent = TossSecRoute.Main.onNavigationEvent((InternalCameraPresenceListener) obj, (TossSecRoute.Main) obj2);
                if (i3 == 0) {
                    int i4 = 20 / 0;
                }
                int i5 = onExtraCallback + 51;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 79 / 0;
                }
                return mapOnNavigationEvent;
            }
        }, new Function1() { // from class: im.toss.securities.core.router.spec.TossSecRoute$Main$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 103;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                TossSecRoute.Main mainOnExtraCallback = TossSecRoute.Main.onExtraCallback((Map) obj);
                int i4 = onWarmupCompleted + 79;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return mainOnExtraCallback;
            }
        });

        public Main() {
            this((String) null, (String) null, (String) null, (Long) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Main onExtraCallback(Map map) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Main mainOnExtraCallbackWithResult = onExtraCallbackWithResult(map);
            if (i3 == 0) {
                int i4 = 18 / 0;
            }
            return mainOnExtraCallbackWithResult;
        }

        public static /* synthetic */ Map onNavigationEvent(InternalCameraPresenceListener internalCameraPresenceListener, Main main) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Map mapOnWarmupCompleted = onWarmupCompleted(internalCameraPresenceListener, main);
            if (i3 != 0) {
                int i4 = 69 / 0;
            }
            return mapOnWarmupCompleted;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof im.toss.securities.core.router.spec.TossSecRoute.Main) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r2 = r2 + 105;
            im.toss.securities.core.router.spec.TossSecRoute.Main.onExtraCallbackWithResult = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            r6 = (im.toss.securities.core.router.spec.TossSecRoute.Main) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.tab, r6.tab) != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.restoreTargetTab, r6.restoreTargetTab) != false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
        
            r6 = im.toss.securities.core.router.spec.TossSecRoute.Main.onNavigationEvent + 113;
            im.toss.securities.core.router.spec.TossSecRoute.Main.onExtraCallbackWithResult = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.scrollToSection, r6.scrollToSection) != false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        
            r6 = im.toss.securities.core.router.spec.TossSecRoute.Main.onNavigationEvent + 55;
            im.toss.securities.core.router.spec.TossSecRoute.Main.onExtraCallbackWithResult = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.watchlistId, r6.watchlistId) != false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                int i4 = 94 / 0;
            }
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            String str = this.tab;
            int iHashCode3 = 0;
            if (str == null) {
                int i2 = onNavigationEvent + 49;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
                int i4 = onExtraCallbackWithResult + 107;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            String str2 = this.restoreTargetTab;
            if (str2 == null) {
                int i6 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str2.hashCode();
            }
            String str3 = this.scrollToSection;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            Long l = this.watchlistId;
            if (l != null) {
                int i8 = onNavigationEvent + 47;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                iHashCode3 = l.hashCode();
            }
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode3;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Main(tab=" + this.tab + ", restoreTargetTab=" + this.restoreTargetTab + ", scrollToSection=" + this.scrollToSection + ", watchlistId=" + this.watchlistId + ")";
            int i2 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Main(int i, String str, String str2, String str3, Long l, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.tab = null;
            } else {
                this.tab = str;
            }
            int i2 = 2 % 2;
            if ((i & 2) == 0) {
                int i3 = onExtraCallbackWithResult + 39;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                this.restoreTargetTab = null;
            } else {
                this.restoreTargetTab = str2;
            }
            if ((i & 4) == 0) {
                this.scrollToSection = null;
                int i5 = onNavigationEvent + 33;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                }
                if ((i & 8) != 0) {
                    this.watchlistId = null;
                    return;
                } else {
                    this.watchlistId = l;
                    return;
                }
            }
            this.scrollToSection = str3;
            int i6 = 2 % 2;
            if ((i & 8) != 0) {
            }
        }

        public Main(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l) {
            this.tab = str;
            this.restoreTargetTab = str2;
            this.scrollToSection = str3;
            this.watchlistId = l;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallback(Main main, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, main.tab);
            } else if (main.tab != null) {
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i3 = onExtraCallbackWithResult + 93;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                if (main.restoreTargetTab != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, main.restoreTargetTab);
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                int i5 = onExtraCallbackWithResult + 109;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    String str = main.scrollToSection;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (main.scrollToSection != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, main.scrollToSection);
                }
            }
            if ((!vylVar.onWarmupCompleted(serialDescriptor, 3)) && main.watchlistId == null) {
                return;
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, oty1.onExtraCallback, main.watchlistId);
            int i6 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 % 5;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Main(String str, String str2, String str3, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = 2 % 2;
                str = null;
            }
            if ((i & 2) != 0) {
                int i3 = onExtraCallbackWithResult + 63;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                str2 = null;
            }
            if ((i & 4) != 0) {
                int i5 = onNavigationEvent + 29;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 72 / 0;
                }
                str3 = null;
            }
            if ((i & 8) != 0) {
                int i7 = onExtraCallbackWithResult + 39;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
                l = null;
            }
            this(str, str2, str3, l);
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 39;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.tab;
            int i5 = i2 + 5;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.restoreTargetTab;
            int i4 = i3 + 105;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.scrollToSection;
            }
            throw null;
        }

        public final Long onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.watchlistId;
            }
            throw null;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Main> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 3;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                TossSecRoute$Main$$serializer tossSecRoute$Main$$serializer = TossSecRoute$Main$$serializer.INSTANCE;
                if (i3 == 0) {
                    int i4 = 38 / 0;
                }
                return tossSecRoute$Main$$serializer;
            }
        }

        static {
            int i = onWarmupCompleted + 27;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 93 / 0;
            }
        }

        private static final Map onWarmupCompleted(InternalCameraPresenceListener internalCameraPresenceListener, Main main) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(internalCameraPresenceListener, "");
            Intrinsics.checkNotNullParameter(main, "");
            Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("tab", main.tab), getWrite.IAuthTabCallback(PARAM_RESTORE_TARGET_TAB, main.restoreTargetTab), getWrite.IAuthTabCallback(PARAM_SCROLL_TO_SECTION, main.scrollToSection), getWrite.IAuthTabCallback(PARAM_WATCHLIST_ID, main.watchlistId)});
            int i4 = onExtraCallbackWithResult + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return mapOnWarmupCompleted;
        }

        private static final Main onExtraCallbackWithResult(Map map) {
            String str;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i2 % 128;
            Long l = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(map, "");
                boolean z = map.get("tab") instanceof String;
                throw null;
            }
            Intrinsics.checkNotNullParameter(map, "");
            Object obj = map.get("tab");
            String str2 = obj instanceof String ? (String) obj : null;
            Object obj2 = map.get(PARAM_RESTORE_TARGET_TAB);
            if (obj2 instanceof String) {
                int i3 = onExtraCallbackWithResult + 7;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    l.hashCode();
                    throw null;
                }
                str = (String) obj2;
            } else {
                str = null;
            }
            Object obj3 = map.get(PARAM_SCROLL_TO_SECTION);
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = map.get(PARAM_WATCHLIST_ID);
            if (obj4 instanceof Long) {
                int i4 = onNavigationEvent + 43;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                l = (Long) obj4;
            }
            return new Main(str2, str, str3, l);
        }
    }

    @liq
    public static final class Web implements TossSecRoute {
        public static final int $stable = 0;
        public static final Companion Companion;
        public static final String PATH = "/web";
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final String host;
        private final String id;
        private final Uri uri;
        private final String url;

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = onExtraCallback + 119;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof im.toss.securities.core.router.spec.TossSecRoute.Web) == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r6 = (im.toss.securities.core.router.spec.TossSecRoute.Web) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.url, r6.url) != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        
            r6 = im.toss.securities.core.router.spec.TossSecRoute.Web.onExtraCallbackWithResult + 21;
            im.toss.securities.core.router.spec.TossSecRoute.Web.onNavigationEvent = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.id, r6.id) != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        
            r2 = r2 + 93;
            im.toss.securities.core.router.spec.TossSecRoute.Web.onNavigationEvent = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        
            if ((r2 % 2) == 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                int i4 = 38 / 0;
            }
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.url.hashCode();
            String str = this.id;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
                int i2 = onExtraCallbackWithResult + 35;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
            }
            int i4 = (iHashCode2 * 31) + iHashCode;
            int i5 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Web(url=" + this.url + ", id=" + this.id + ")";
            int i2 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Web(int i, String str, String str2, okycx okycxVar) {
            if (1 != (i & 1)) {
                int i2 = onNavigationEvent + 115;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 1, TossSecRoute$Web$$serializer.INSTANCE.getDescriptor());
            }
            this.url = str;
            if ((i & 2) == 0) {
                this.id = null;
            } else {
                this.id = str2;
            }
            int i4 = 2 % 2;
            Uri uri = Uri.parse(str);
            this.uri = uri;
            this.host = uri.getHost();
            int i5 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }

        public Web(@NotNull String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
            this.id = str2;
            Uri uri = Uri.parse(str);
            this.uri = uri;
            this.host = uri.getHost();
        }

        @JvmStatic
        public static final /* synthetic */ void onWarmupCompleted(Web web, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            vylVar.onExtraCallback(serialDescriptor, 0, web.url);
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || web.id != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, web.id);
            }
            int i4 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Web(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = onExtraCallbackWithResult + 65;
                onNavigationEvent = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i3 = 2 % 2;
                str2 = null;
            }
            this(str, str2);
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.url;
            int i5 = i3 + 21;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String str = this.id;
            if (i3 != 0) {
                int i4 = 7 / 0;
            }
            return str;
        }

        public static final class Companion {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Web> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 115;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                TossSecRoute$Web$$serializer tossSecRoute$Web$$serializer = TossSecRoute$Web$$serializer.INSTANCE;
                if (i3 == 0) {
                    return tossSecRoute$Web$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;

        @nc(IAuthTabCallback = "dividend")
        public static final onExtraCallbackWithResult Dividend;

        @nc(IAuthTabCallback = "etfDividendChart")
        public static final onExtraCallbackWithResult EtfDividendChart;

        @nc(IAuthTabCallback = "etfRealtimeChart")
        public static final onExtraCallbackWithResult EtfRealtimeChart;
        private static int IAuthTabCallback = 1;

        @nc(IAuthTabCallback = "mostActive")
        public static final onExtraCallbackWithResult MostActive;

        @nc(IAuthTabCallback = "optionVolume")
        public static final onExtraCallbackWithResult OptionVolume;

        @nc(IAuthTabCallback = "popularCommunity")
        public static final onExtraCallbackWithResult PopularCommunity;

        @nc(IAuthTabCallback = "realtimeChart")
        public static final onExtraCallbackWithResult RealtimeChart;

        @nc(IAuthTabCallback = "realtimeChartTop3")
        public static final onExtraCallbackWithResult RealtimeChartTop3;

        @nc(IAuthTabCallback = "recentStock")
        public static final onExtraCallbackWithResult RecentStock;

        @nc(IAuthTabCallback = "retainStock")
        public static final onExtraCallbackWithResult RetainStock;

        @nc(IAuthTabCallback = "screener")
        public static final onExtraCallbackWithResult Screener;

        @nc(IAuthTabCallback = "unknown")
        public static final onExtraCallbackWithResult Unknown;

        @nc(IAuthTabCallback = "watchlist")
        public static final onExtraCallbackWithResult Watchlist;

        @nc(IAuthTabCallback = "watchlistRecommend")
        public static final onExtraCallbackWithResult WatchlistRecommend;
        private static long onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String logName;

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 37;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {RetainStock, Watchlist, MostActive, RealtimeChart, Screener, Dividend, RecentStock, EtfRealtimeChart, EtfDividendChart, OptionVolume, RealtimeChartTop3, WatchlistRecommend, PopularCommunity, Unknown};
            int i5 = i2 + 65;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return onextracallbackwithresultArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            EnumEntries<onExtraCallbackWithResult> enumEntries;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 23;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                enumEntries = $ENTRIES;
                int i4 = 29 / 0;
            } else {
                enumEntries = $ENTRIES;
            }
            int i5 = i2 + 55;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            int i4 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresultArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x0236  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0237  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            Object obj;
            Throwable cause;
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (true) {
                obj = null;
                if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                    break;
                }
                int i3 = $10 + 79;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24, 19627 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() / (onExtraCallback * 5407414049857832247L);
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 59 - View.MeasureSpec.getSize(0), TextUtils.getOffsetBefore("", 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                } else {
                    int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 24 - KeyEvent.keyCodeFromString(""), KeyEvent.getDeadChar(0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 59 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i6 = $10 + 9;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i8 = $10 + 37;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    try {
                        Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 60 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 6383 - View.resolveSize(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback5).invoke(null, objArr6);
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr7 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), View.MeasureSpec.getSize(0) + 59, 6382 - TextUtils.indexOf((CharSequence) "", '0'), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
            objArr[0] = new String(cArr2);
        }

        private onExtraCallbackWithResult(String str, int i, String str2) {
            this.logName = str2;
        }

        public final String getLogName() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 117;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.logName;
            int i5 = i2 + 71;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 27 / 0;
            }
            return str;
        }

        static {
            onExtraCallback();
            RetainStock = new onExtraCallbackWithResult("RetainStock", 0, "retainStock");
            Watchlist = new onExtraCallbackWithResult("Watchlist", 1, "watchlist");
            MostActive = new onExtraCallbackWithResult("MostActive", 2, "mostActive");
            RealtimeChart = new onExtraCallbackWithResult("RealtimeChart", 3, "realtimeChart");
            Screener = new onExtraCallbackWithResult("Screener", 4, "screener");
            Dividend = new onExtraCallbackWithResult("Dividend", 5, "dividend");
            RecentStock = new onExtraCallbackWithResult("RecentStock", 6, "recentStock");
            EtfRealtimeChart = new onExtraCallbackWithResult("EtfRealtimeChart", 7, "etfRealtimeChart");
            EtfDividendChart = new onExtraCallbackWithResult("EtfDividendChart", 8, "etfDividendChart");
            OptionVolume = new onExtraCallbackWithResult("OptionVolume", 9, "optionVolume");
            RealtimeChartTop3 = new onExtraCallbackWithResult("RealtimeChartTop3", 10, "realtimeChartTop3");
            WatchlistRecommend = new onExtraCallbackWithResult("WatchlistRecommend", 11, "watchlistRecommend");
            PopularCommunity = new onExtraCallbackWithResult("PopularCommunity", 12, "popularCommunity");
            Object[] objArr = new Object[1];
            a(new char[]{427, 10813, 22191, 33559, 44933, 55400, 1278}, (ViewConfiguration.getTapTimeout() >> 16) + 11149, objArr);
            Unknown = new onExtraCallbackWithResult("Unknown", 13, ((String) objArr[0]).intern());
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = IAuthTabCallback + 95;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        static void onExtraCallback() {
            onExtraCallback = 4936064043622237417L;
        }
    }

    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final onWarmupCompleted IAuthTabCallback;
        private static int IAuthTabCallbackStub = 1;
        private static int onExtraCallback = 1;
        private static long onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        public static final /* synthetic */ class IAuthTabCallback {
            private static int IAuthTabCallback = 1;
            public static final /* synthetic */ int[] onExtraCallback;
            private static int onExtraCallbackWithResult;
            public static final /* synthetic */ int[] onNavigationEvent;

            static {
                int[] iArr = new int[onExtraCallbackWithResult.values().length];
                try {
                    iArr[onExtraCallbackWithResult.Watchlist.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[onExtraCallbackWithResult.RetainStock.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                onNavigationEvent = iArr;
                int[] iArr2 = new int[delimiterOffset.values().length];
                try {
                    iArr2[delimiterOffset.OPTION.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[delimiterOffset.BOND.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[delimiterOffset.CURRENCY.ordinal()] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[delimiterOffset.INDEX.ordinal()] = 4;
                    int i = 2 % 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[delimiterOffset.COMMODITY.ordinal()] = 5;
                    int i2 = onExtraCallbackWithResult + 117;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[delimiterOffset.TREASURY.ordinal()] = 6;
                    int i5 = onExtraCallbackWithResult + 59;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[delimiterOffset.CRYPTO.ordinal()] = 7;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[delimiterOffset.STOCK.ordinal()] = 8;
                } catch (NoSuchFieldError unused10) {
                }
                onExtraCallback = iArr2;
                int i8 = onExtraCallbackWithResult + 91;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
            }
        }

        static {
            onExtraCallback();
            IAuthTabCallback = new onWarmupCompleted();
            int i = onWarmupCompleted + 39;
            IAuthTabCallbackStub = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ String IAuthTabCallback(delimiterOffset delimiteroffset, onExtraCallbackWithResult onextracallbackwithresult, String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String strOnNavigationEvent = onNavigationEvent(delimiteroffset, onextracallbackwithresult, str);
            if (i3 != 0) {
                int i4 = 45 / 0;
            }
            int i5 = onExtraCallback + 89;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return strOnNavigationEvent;
        }

        public static /* synthetic */ String onExtraCallback(Boolean bool, String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String strOnWarmupCompleted = onWarmupCompleted(bool, str);
            int i4 = onExtraCallback + 25;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 87 / 0;
            }
            return strOnWarmupCompleted;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
            String str = (String) objArr[0];
            String str2 = (String) objArr[1];
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String strIAuthTabCallback = IAuthTabCallback(str, str2);
            if (i3 != 0) {
                int i4 = 39 / 0;
            }
            return strIAuthTabCallback;
        }

        public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i2;
            int i8 = i7 | i6;
            int i9 = (~i8) | (~(i7 | i4));
            int i10 = (~((~i4) | i7 | (~i6))) | (~(i2 | i6));
            int i11 = i2 + i6 + i + ((-540997959) * i5) + (162607451 * i3);
            int i12 = i11 * i11;
            int i13 = ((-612843245) * i2) + 1723858944 + (1667710703 * i6) + (i9 * (-1007206674)) + (1007206674 * i8) + ((-1007206674) * i10) + ((-1620049920) * i) + ((-672137216) * i5) + (483393536 * i3) + (377683968 * i12);
            int i14 = (i2 * 228155117) + 240245784 + (i6 * 228155665) + (i9 * 274) + (i8 * (-274)) + (i10 * 274) + (i * 228155391) + (i5 * (-329950905)) + (i3 * (-2026639707)) + (i12 * 159186944);
            return i13 + ((i14 * i14) * (-1451425792)) != 1 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $11 + 61;
                $10 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23, (ViewConfiguration.getWindowTouchSlop() >> 8) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() & (onExtraCallbackWithResult ^ 5407414049857832247L);
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 59 - TextUtils.getOffsetAfter("", 0), 6383 - (KeyEvent.getMaxKeyCode() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 24 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 19627 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 59 - (ViewConfiguration.getFadingEdgeLength() >> 16), ExpandableListView.getPackedPositionType(0L) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i6 = $10 + 121;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 59 - ExpandableListView.getPackedPositionGroup(0L), 6383 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                int i8 = $11 + 57;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            }
            objArr[0] = new String(cArr2);
        }

        private onWarmupCompleted() {
        }

        public static /* synthetic */ TossSecRoute onNavigationEvent(onWarmupCompleted onwarmupcompleted, String str, onExtraCallbackWithResult onextracallbackwithresult, StockStatus stockStatus, Boolean bool, delimiterOffset delimiteroffset, String str2, int i, Object obj) {
            onExtraCallbackWithResult onextracallbackwithresult2;
            Boolean bool2;
            delimiterOffset delimiteroffset2;
            int i2 = 2 % 2;
            String str3 = null;
            if ((i & 2) != 0) {
                int i3 = onNavigationEvent + 49;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                onextracallbackwithresult2 = null;
            } else {
                onextracallbackwithresult2 = onextracallbackwithresult;
            }
            StockStatus stockStatus2 = (i & 4) != 0 ? null : stockStatus;
            if ((i & 8) != 0) {
                int i4 = onNavigationEvent + 75;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 15 / 0;
                }
                bool2 = null;
            } else {
                bool2 = bool;
            }
            if ((i & 16) != 0) {
                int i6 = onNavigationEvent + 21;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                delimiteroffset2 = null;
            } else {
                delimiteroffset2 = delimiteroffset;
            }
            if ((i & 32) != 0) {
                int i8 = onNavigationEvent + 71;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
            } else {
                str3 = str2;
            }
            return (TossSecRoute) onNavigationEvent(new Object[]{onwarmupcompleted, str, onextracallbackwithresult2, stockStatus2, bool2, delimiteroffset2, str3}, OverseasRrnInputTextField.IAuthTabCallback(), 1543187475, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1543187474);
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[0];
            String str = (String) objArr[1];
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[2];
            StockStatus stockStatus = (StockStatus) objArr[3];
            Boolean bool = (Boolean) objArr[4];
            delimiterOffset delimiteroffset = (delimiterOffset) objArr[5];
            String str2 = (String) objArr[6];
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                onwarmupcompleted.onWarmupCompleted(str, stockStatus, bool, onextracallbackwithresult, null, null, delimiteroffset, str2);
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            TossSecRoute tossSecRouteOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted(str, stockStatus, bool, onextracallbackwithresult, null, null, delimiteroffset, str2);
            int i3 = onNavigationEvent + 77;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return tossSecRouteOnWarmupCompleted;
            }
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ TossSecRoute onWarmupCompleted(onWarmupCompleted onwarmupcompleted, String str, String str2, String str3, onExtraCallbackWithResult onextracallbackwithresult, delimiterOffset delimiteroffset, String str4, int i, Object obj) throws NoWhenBranchMatchedException {
            String str5;
            int i2 = 2 % 2;
            Object obj2 = null;
            delimiterOffset delimiteroffset2 = (i & 16) != 0 ? null : delimiteroffset;
            if ((i & 32) != 0) {
                int i3 = onNavigationEvent + 65;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                str5 = null;
            } else {
                str5 = str4;
            }
            TossSecRoute tossSecRouteOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted(str, str2, str3, onextracallbackwithresult, delimiteroffset2, str5);
            int i4 = onExtraCallback + 83;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return tossSecRouteOnWarmupCompleted;
        }

        public final TossSecRoute onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull onExtraCallbackWithResult onextracallbackwithresult, @Nullable delimiterOffset delimiteroffset, @Nullable String str4) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                onWarmupCompleted(str, null, null, onextracallbackwithresult, str2, str3, delimiteroffset, str4);
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            TossSecRoute tossSecRouteOnWarmupCompleted = onWarmupCompleted(str, null, null, onextracallbackwithresult, str2, str3, delimiteroffset, str4);
            int i3 = onNavigationEvent + 125;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return tossSecRouteOnWarmupCompleted;
            }
            obj.hashCode();
            throw null;
        }

        private static final String onNavigationEvent(delimiterOffset delimiteroffset, onExtraCallbackWithResult onextracallbackwithresult, String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallback = i2 % 128;
            String str2 = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                delimiterOffset delimiteroffset2 = delimiterOffset.BOND;
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            boolean z = delimiteroffset == delimiterOffset.BOND;
            int i3 = onextracallbackwithresult == null ? -1 : IAuthTabCallback.onNavigationEvent[onextracallbackwithresult.ordinal()];
            if (i3 != 1) {
                int i4 = onExtraCallback + 39;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0 ? i3 == 2 : i3 == 5) {
                    str2 = "home_my_detail";
                }
            } else {
                str2 = "home_watchlist_detail";
            }
            return (!z || str2 == null) ? str : setPrivacyPolicyUri.onExtraCallbackWithResult(str, "from", str2);
        }

        private static final String onWarmupCompleted(Boolean bool, String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.areEqual(bool, Boolean.TRUE);
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            if (!Intrinsics.areEqual(bool, Boolean.TRUE)) {
                return str;
            }
            int i3 = onNavigationEvent + 5;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return setPrivacyPolicyUri.onExtraCallbackWithResult(str, "canSell", "true");
        }

        private static final String IAuthTabCallback(String str, String str2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str2, "");
            if (str != null) {
                int i4 = onNavigationEvent + 107;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                String string = StringsKt.trim(str).toString();
                if (string != null) {
                    if (string.length() <= 0) {
                        int i6 = onExtraCallback + 81;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        string = null;
                    }
                    if (string != null) {
                        Object[] objArr = new Object[1];
                        a(new char[]{7119, 24807, 60837, 27208, 63242}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31542, objArr);
                        String strOnExtraCallbackWithResult = setPrivacyPolicyUri.onExtraCallbackWithResult(str2, ((String) objArr[0]).intern(), string);
                        if (strOnExtraCallbackWithResult != null) {
                            int i8 = onExtraCallback + 103;
                            onNavigationEvent = i8 % 128;
                            int i9 = i8 % 2;
                            return strOnExtraCallbackWithResult;
                        }
                    }
                }
            }
            return str2;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        private final TossSecRoute onWarmupCompleted(String str, StockStatus stockStatus, final Boolean bool, final onExtraCallbackWithResult onextracallbackwithresult, String str2, String str3, final delimiterOffset delimiteroffset, final String str4) throws NoWhenBranchMatchedException {
            int i = 2;
            int i2 = 2 % 2;
            if (delimiteroffset == null) {
                int i3 = onExtraCallback + 15;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                delimiteroffset = delimiterOffset.Companion.onExtraCallbackWithResult(str);
            }
            Function1 function1 = new Function1() { // from class: im.toss.securities.core.router.spec.TossSecRoute$Builder$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj) {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 103;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        TossSecRoute.onWarmupCompleted.IAuthTabCallback(delimiteroffset, onextracallbackwithresult, (String) obj);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    String strIAuthTabCallback = TossSecRoute.onWarmupCompleted.IAuthTabCallback(delimiteroffset, onextracallbackwithresult, (String) obj);
                    int i7 = onNavigationEvent + 73;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return strIAuthTabCallback;
                }
            };
            Function1 function12 = new Function1() { // from class: im.toss.securities.core.router.spec.TossSecRoute$Builder$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj) {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 45;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    String strOnExtraCallback = TossSecRoute.onWarmupCompleted.onExtraCallback(bool, (String) obj);
                    int i8 = onExtraCallback + 63;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return strOnExtraCallback;
                }
            };
            Function1 function13 = new Function1() { // from class: im.toss.securities.core.router.spec.TossSecRoute$Builder$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj) {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 23;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    Object[] objArr = {str4, (String) obj};
                    int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                    String str5 = (String) TossSecRoute.onWarmupCompleted.onNavigationEvent(objArr, OverseasRrnInputTextField.IAuthTabCallback(), 691644910, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), -691644910);
                    int i8 = onExtraCallbackWithResult + 103;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        return str5;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            };
            String str5 = null;
            switch (IAuthTabCallback.onExtraCallback[delimiteroffset.ordinal()]) {
                case 1:
                    return new Web((String) function13.invoke(function1.invoke(shouldShowTermsAndPrivacyPolicyAlertInGdpr.onExtraCallbackWithResult.onTransact(str))), str5, i, (DefaultConstructorMarker) str5);
                case 2:
                    return new Web((String) function13.invoke(function1.invoke(shouldShowTermsAndPrivacyPolicyAlertInGdpr.onExtraCallbackWithResult.IAuthTabCallbackDefault(str))), str5, i, (DefaultConstructorMarker) str5);
                case 3:
                    Web web = new Web((String) function13.invoke(shouldShowTermsAndPrivacyPolicyAlertInGdpr.onExtraCallbackWithResult.readTypedObject()), str5, i, (DefaultConstructorMarker) str5);
                    int i5 = onNavigationEvent + 57;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 29 / 0;
                    }
                    return web;
                case 4:
                case 5:
                case 6:
                case 7:
                    return new Web((String) function13.invoke(shouldShowTermsAndPrivacyPolicyAlertInGdpr.onExtraCallback(shouldShowTermsAndPrivacyPolicyAlertInGdpr.onExtraCallbackWithResult, str, null, 2, null)), str5, i, (DefaultConstructorMarker) str5);
                case 8:
                    return new Web((String) function13.invoke(function12.invoke(function1.invoke(onExtraCallbackWithResult(str, stockStatus, str2, str3)))), str5, i, (DefaultConstructorMarker) str5);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        private final String onExtraCallbackWithResult(String str, StockStatus stockStatus, String str2, String str3) {
            String value;
            int i = 2 % 2;
            Uri.Builder builderBuildUpon = Uri.parse("/stocks/" + str).buildUpon();
            if (stockStatus == null || (value = stockStatus.getValue()) == null) {
                value = "";
            }
            builderBuildUpon.appendQueryParameter("stockStatus", value);
            if (str2 != null) {
                int i2 = onNavigationEvent + 83;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                builderBuildUpon.appendQueryParameter("tab", str2);
            }
            if (str3 != null) {
                int i4 = onNavigationEvent + 83;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    builderBuildUpon.appendQueryParameter("sort-type", str3);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                builderBuildUpon.appendQueryParameter("sort-type", str3);
            }
            String string = builderBuildUpon.build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        public static /* synthetic */ String onWarmupCompleted(String str, String str2) {
            int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
            return (String) onNavigationEvent(new Object[]{str, str2}, OverseasRrnInputTextField.IAuthTabCallback(), 691644910, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), -691644910);
        }

        public final TossSecRoute onExtraCallback(@NotNull String str, @Nullable onExtraCallbackWithResult onextracallbackwithresult, @Nullable StockStatus stockStatus, @Nullable Boolean bool, @Nullable delimiterOffset delimiteroffset, @Nullable String str2) {
            int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
            return (TossSecRoute) onNavigationEvent(new Object[]{this, str, onextracallbackwithresult, stockStatus, bool, delimiteroffset, str2}, OverseasRrnInputTextField.IAuthTabCallback(), 1543187475, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), -1543187474);
        }

        static void onExtraCallback() {
            onExtraCallbackWithResult = -7753554429110870388L;
        }
    }

    @liq
    public static final class EarningCallHome implements TossSecRoute {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        public static final EarningCallHome INSTANCE = new EarningCallHome();
        private static final String PATH = "/earning-call/home";
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.core.router.spec.TossSecRoute$EarningCallHome$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                KSerializer kSerializerOnWarmupCompleted;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 105;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    kSerializerOnWarmupCompleted = TossSecRoute.EarningCallHome.onWarmupCompleted();
                    int i3 = 24 / 0;
                } else {
                    kSerializerOnWarmupCompleted = TossSecRoute.EarningCallHome.onWarmupCompleted();
                }
                int i4 = onWarmupCompleted + 17;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnWarmupCompleted;
            }
        });

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
            int i4 = onExtraCallback + 89;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerIAuthTabCallback;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Object obj2 = null;
            if (this == obj) {
                int i5 = i3 + 101;
                int i6 = i5 % 128;
                onNavigationEvent = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 9;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            if (obj instanceof EarningCallHome) {
                int i9 = i3 + 85;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 != 0) {
                    return true;
                }
                obj2.hashCode();
                throw null;
            }
            int i10 = i3 + 37;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i3 + 43;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 39 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 77;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return 1037528002;
            }
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 121;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 11 / 0;
            }
            return "EarningCallHome";
        }

        private EarningCallHome() {
        }

        private static final /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            htf1 htf1Var = new htf1("im.toss.securities.core.router.spec.TossSecRoute.EarningCallHome", INSTANCE, new Annotation[0]);
            int i2 = onNavigationEvent + 97;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return htf1Var;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) $cachedSerializer$delegate.getValue();
            int i4 = onExtraCallback + 59;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 56 / 0;
            }
            return kSerializer;
        }

        public final KSerializer<EarningCallHome> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<EarningCallHome> kSerializerOnNavigationEvent = onNavigationEvent();
            if (i3 == 0) {
                int i4 = 21 / 0;
            }
            return kSerializerOnNavigationEvent;
        }

        static {
            int i = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                int i2 = 15 / 0;
            }
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 95;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = PATH;
            int i5 = i2 + 13;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @liq
    public static final class EarningCallHomeDetailV2 implements TossSecRoute {
        public static final int $stable = 0;
        public static final Companion Companion;
        public static final String PARAM_SUB_TAB = "PARAM_SUB_TAB";
        public static final String PARAM_TAB = "PARAM_TAB";
        private static final getCaptureIds<EarningCallHomeDetailV2, Object> Saver = getMaxResolution.IAuthTabCallback(new Function2() { // from class: im.toss.securities.core.router.spec.TossSecRoute$EarningCallHomeDetailV2$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 25;
                IAuthTabCallback = i2 % 128;
                InternalCameraPresenceListener internalCameraPresenceListener = (InternalCameraPresenceListener) obj;
                TossSecRoute.EarningCallHomeDetailV2 earningCallHomeDetailV2 = (TossSecRoute.EarningCallHomeDetailV2) obj2;
                if (i2 % 2 != 0) {
                    return TossSecRoute.EarningCallHomeDetailV2.IAuthTabCallback(internalCameraPresenceListener, earningCallHomeDetailV2);
                }
                TossSecRoute.EarningCallHomeDetailV2.IAuthTabCallback(internalCameraPresenceListener, earningCallHomeDetailV2);
                throw null;
            }
        }, new Function1() { // from class: im.toss.securities.core.router.spec.TossSecRoute$EarningCallHomeDetailV2$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 17;
                onExtraCallback = i2 % 128;
                Map map = (Map) obj;
                if (i2 % 2 == 0) {
                    return TossSecRoute.EarningCallHomeDetailV2.onExtraCallbackWithResult(map);
                }
                TossSecRoute.EarningCallHomeDetailV2.onExtraCallbackWithResult(map);
                throw null;
            }
        });
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String subTab;
        private final String tab;

        public static /* synthetic */ Map IAuthTabCallback(InternalCameraPresenceListener internalCameraPresenceListener, EarningCallHomeDetailV2 earningCallHomeDetailV2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallback(internalCameraPresenceListener, earningCallHomeDetailV2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Map mapOnExtraCallback = onExtraCallback(internalCameraPresenceListener, earningCallHomeDetailV2);
            int i3 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 75 / 0;
            }
            return mapOnExtraCallback;
        }

        public static /* synthetic */ EarningCallHomeDetailV2 onExtraCallbackWithResult(Map map) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            EarningCallHomeDetailV2 earningCallHomeDetailV2IAuthTabCallback = IAuthTabCallback(map);
            int i4 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 58 / 0;
            }
            return earningCallHomeDetailV2IAuthTabCallback;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EarningCallHomeDetailV2)) {
                return false;
            }
            EarningCallHomeDetailV2 earningCallHomeDetailV2 = (EarningCallHomeDetailV2) obj;
            if (Intrinsics.areEqual(this.tab, earningCallHomeDetailV2.tab)) {
                return Intrinsics.areEqual(this.subTab, earningCallHomeDetailV2.subTab);
            }
            int i4 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i;
            int i2 = 2 % 2;
            int iHashCode = this.tab.hashCode();
            String str = this.subTab;
            if (str == null) {
                int i3 = onExtraCallbackWithResult + 105;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                i = 0;
            } else {
                int iHashCode2 = str.hashCode();
                int i5 = onWarmupCompleted + 83;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                i = iHashCode2;
            }
            return (iHashCode * 31) + i;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "EarningCallHomeDetailV2(tab=" + this.tab + ", subTab=" + this.subTab + ")";
            int i2 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ EarningCallHomeDetailV2(int i, String str, String str2, okycx okycxVar) {
            SerialDescriptor descriptor;
            int i2 = 1;
            if (1 != (i & 1)) {
                int i3 = onWarmupCompleted + 29;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    descriptor = TossSecRoute$EarningCallHomeDetailV2$$serializer.INSTANCE.getDescriptor();
                    i2 = 0;
                } else {
                    descriptor = TossSecRoute$EarningCallHomeDetailV2$$serializer.INSTANCE.getDescriptor();
                }
                htf31.onExtraCallbackWithResult(i, i2, descriptor);
            }
            this.tab = str;
            if ((i & 2) == 0) {
                this.subTab = null;
                int i4 = onWarmupCompleted + 77;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            this.subTab = str2;
            int i6 = onExtraCallbackWithResult + 3;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }

        public EarningCallHomeDetailV2(@NotNull String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.tab = str;
            this.subTab = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(EarningCallHomeDetailV2 earningCallHomeDetailV2, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                vylVar.onExtraCallback(serialDescriptor, 1, earningCallHomeDetailV2.tab);
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                    if (earningCallHomeDetailV2.subTab != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, earningCallHomeDetailV2.subTab);
                    }
                }
            } else {
                vylVar.onExtraCallback(serialDescriptor, 0, earningCallHomeDetailV2.tab);
                if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                }
            }
            int i3 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.tab;
            int i5 = i3 + 35;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.subTab;
            int i4 = i3 + 59;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<EarningCallHomeDetailV2> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 121;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    TossSecRoute$EarningCallHomeDetailV2$$serializer tossSecRoute$EarningCallHomeDetailV2$$serializer = TossSecRoute$EarningCallHomeDetailV2$$serializer.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                TossSecRoute$EarningCallHomeDetailV2$$serializer tossSecRoute$EarningCallHomeDetailV2$$serializer2 = TossSecRoute$EarningCallHomeDetailV2$$serializer.INSTANCE;
                int i3 = onExtraCallback + 51;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return tossSecRoute$EarningCallHomeDetailV2$$serializer2;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = onNavigationEvent + 27;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        private static final Map onExtraCallback(InternalCameraPresenceListener internalCameraPresenceListener, EarningCallHomeDetailV2 earningCallHomeDetailV2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(internalCameraPresenceListener, "");
                Intrinsics.checkNotNullParameter(earningCallHomeDetailV2, "");
                return access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(PARAM_TAB, earningCallHomeDetailV2.tab), getWrite.IAuthTabCallback(PARAM_SUB_TAB, earningCallHomeDetailV2.subTab)});
            }
            Intrinsics.checkNotNullParameter(internalCameraPresenceListener, "");
            Intrinsics.checkNotNullParameter(earningCallHomeDetailV2, "");
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(PARAM_TAB, earningCallHomeDetailV2.tab);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(PARAM_SUB_TAB, earningCallHomeDetailV2.subTab);
            Pair[] pairArr = new Pair[3];
            pairArr[0] = pairIAuthTabCallback;
            pairArr[1] = pairIAuthTabCallback2;
            return access8100.onWarmupCompleted(pairArr);
        }

        private static final EarningCallHomeDetailV2 IAuthTabCallback(Map map) {
            String str;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(map, "");
            Object obj = map.get(PARAM_TAB);
            String str2 = null;
            if (obj instanceof String) {
                int i2 = onWarmupCompleted + 89;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                str = (String) obj;
            } else {
                str = null;
            }
            String str3 = str != null ? str : "";
            Object obj2 = map.get(PARAM_SUB_TAB);
            if (obj2 instanceof String) {
                int i4 = onWarmupCompleted + 45;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                str2 = (String) obj2;
            }
            return new EarningCallHomeDetailV2(str3, str2);
        }
    }

    public static abstract class onNavigationEvent implements TossSecRoute {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public abstract String onNavigationEvent();

        public final boolean IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (onNavigationEvent() == null) {
                return false;
            }
            int i3 = onNavigationEvent + 71;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
    }

    @liq
    public static final class EarningCallDetail extends onNavigationEvent {
        public static final int $stable = 0;
        public static final Companion Companion;
        private static int IAuthTabCallback = 0;
        public static final String PARAM_BEFORE_ENTRY_ID = "beforeEntryId";
        public static final String PARAM_EVENT_ID = "eventId";
        public static final String PARAM_HIDE_PAST_TAB = "hidePastTab";
        public static final String PARAM_PRODUCT_CODE = "productCode";
        public static final String PARAM_TAB = "tab";
        public static final String PATH = "/earning-call";
        private static final List<String> WEB_PATHS = CollectionsKt.listOf(new String[]{"/earning-call/native-player", "/earning-call/bridge", "/earning-call/player"});
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String beforeEntryId;
        private final String eventId;
        private final boolean hidePastTab;
        private final String productCode;
        private final String tab;

        public EarningCallDetail() {
            this((String) null, (String) null, (String) null, false, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EarningCallDetail)) {
                int i5 = i3 + 85;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            EarningCallDetail earningCallDetail = (EarningCallDetail) obj;
            if (!Intrinsics.areEqual(this.eventId, earningCallDetail.eventId) || (!Intrinsics.areEqual(this.productCode, earningCallDetail.productCode))) {
                return false;
            }
            if (!Intrinsics.areEqual(this.beforeEntryId, earningCallDetail.beforeEntryId)) {
                int i7 = IAuthTabCallback + 11;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (this.hidePastTab != earningCallDetail.hidePastTab) {
                int i9 = IAuthTabCallback + 121;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.tab, earningCallDetail.tab)) {
                int i11 = onExtraCallbackWithResult + 107;
                IAuthTabCallback = i11 % 128;
                return i11 % 2 != 0;
            }
            int i12 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
          0x001c: PHI (r1v15 java.lang.String) = (r1v4 java.lang.String), (r1v17 java.lang.String) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
          0x001c: PHI (r3v8 int) = (r3v0 int), (r3v9 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
          0x001a: PHI (r3v1 int) = (r3v0 int), (r3v9 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int hashCode() {
            String str;
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                str = this.eventId;
                iHashCode = 1;
                iHashCode2 = str == null ? 0 : str.hashCode();
            } else {
                str = this.eventId;
                iHashCode = 0;
                if (str == null) {
                }
            }
            String str2 = this.productCode;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.beforeEntryId;
            int iHashCode4 = str3 != null ? str3.hashCode() : 0;
            int iHashCode5 = Boolean.hashCode(this.hidePastTab);
            String str4 = this.tab;
            if (str4 != null) {
                int i3 = onExtraCallbackWithResult + 3;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                iHashCode = str4.hashCode();
            }
            return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "EarningCallDetail(eventId=" + this.eventId + ", productCode=" + this.productCode + ", beforeEntryId=" + this.beforeEntryId + ", hidePastTab=" + this.hidePastTab + ", tab=" + this.tab + ")";
            int i2 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ EarningCallDetail(int i, String str, String str2, String str3, boolean z, String str4, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.eventId = null;
                int i2 = onExtraCallbackWithResult + 99;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 4 / 4;
                } else {
                    int i4 = 2 % 2;
                }
            } else {
                this.eventId = str;
                int i5 = onExtraCallbackWithResult + 101;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                }
            }
            if ((i & 2) == 0) {
                this.productCode = null;
            } else {
                this.productCode = str2;
            }
            if ((i & 4) == 0) {
                this.beforeEntryId = null;
            } else {
                this.beforeEntryId = str3;
            }
            if ((i & 8) == 0) {
                this.hidePastTab = false;
                int i6 = onExtraCallbackWithResult + 23;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 % 2;
                }
                if ((i & 16) == 0) {
                    this.tab = str4;
                    return;
                }
                int i8 = IAuthTabCallback + 27;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                this.tab = null;
                return;
            }
            this.hidePastTab = z;
            int i10 = 2 % 2;
            if ((i & 16) == 0) {
            }
        }

        public EarningCallDetail(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, @Nullable String str4) {
            this.eventId = str;
            this.productCode = str2;
            this.beforeEntryId = str3;
            this.hidePastTab = z;
            this.tab = str4;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void IAuthTabCallback(EarningCallDetail earningCallDetail, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, earningCallDetail.eventId);
            } else if (earningCallDetail.eventId != null) {
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || earningCallDetail.productCode != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, earningCallDetail.productCode);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                int i3 = IAuthTabCallback + 69;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (earningCallDetail.onNavigationEvent() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, earningCallDetail.onNavigationEvent());
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 3) || earningCallDetail.hidePastTab) {
                vylVar.onNavigationEvent(serialDescriptor, 3, earningCallDetail.hidePastTab);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 4) || earningCallDetail.tab != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, earningCallDetail.tab);
                int i5 = onExtraCallbackWithResult + 27;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 % 4;
                }
            }
            int i7 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ List onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            List<String> list = WEB_PATHS;
            int i5 = i3 + 125;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return list;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ EarningCallDetail(String str, String str2, String str3, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str5;
            String str6 = (i & 1) != 0 ? null : str;
            if ((i & 2) != 0) {
                int i2 = IAuthTabCallback + 69;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
                str5 = null;
            } else {
                str5 = str2;
            }
            String str7 = (i & 4) != 0 ? null : str3;
            if ((i & 8) != 0) {
                int i4 = onExtraCallbackWithResult + 55;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                z = false;
            }
            this(str6, str5, str7, z, (i & 16) != 0 ? null : str4);
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.eventId;
            int i5 = i3 + 89;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = this.productCode;
            if (i3 != 0) {
                int i4 = 31 / 0;
            }
            return str;
        }

        @Override // im.toss.securities.core.router.spec.TossSecRoute.onNavigationEvent
        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.beforeEntryId;
            int i5 = i3 + 15;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final boolean onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            boolean z = this.hidePastTab;
            int i5 = i3 + 19;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 0;
            }
            return z;
        }

        public final String onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.tab;
            int i5 = i3 + 71;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<EarningCallDetail> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 31;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                TossSecRoute$EarningCallDetail$$serializer tossSecRoute$EarningCallDetail$$serializer = TossSecRoute$EarningCallDetail$$serializer.INSTANCE;
                if (i3 == 0) {
                    return tossSecRoute$EarningCallDetail$$serializer;
                }
                throw null;
            }

            public final List<String> onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 49;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                List<String> listOnExtraCallbackWithResult = EarningCallDetail.onExtraCallbackWithResult();
                int i4 = onNavigationEvent + 69;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return listOnExtraCallbackWithResult;
            }

            public final boolean onExtraCallback(@NotNull String str) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                String strTrimEnd = StringsKt.trimEnd(str, new char[]{'/'});
                List<String> listOnExtraCallbackWithResult = onExtraCallbackWithResult();
                if ((listOnExtraCallbackWithResult instanceof Collection) && listOnExtraCallbackWithResult.isEmpty()) {
                    int i2 = onNavigationEvent + 11;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                for (String str2 : listOnExtraCallbackWithResult) {
                    if (StringsKt.startsWith$default(strTrimEnd, str2 + Main.PATH, false, 2, (Object) null)) {
                        String strRemovePrefix = StringsKt.removePrefix(strTrimEnd, str2 + Main.PATH);
                        if (strRemovePrefix.length() > 0) {
                            int i4 = IAuthTabCallback + 89;
                            onNavigationEvent = i4 % 128;
                            if (i4 % 2 != 0) {
                                if (!StringsKt.contains$default(strRemovePrefix, Main.PATH, true, 2, (Object) null)) {
                                    return true;
                                }
                            } else if (!StringsKt.contains$default(strRemovePrefix, Main.PATH, false, 2, (Object) null)) {
                                return true;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return false;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = onWarmupCompleted + 111;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }
    }

    @liq
    public static final class OptionPracticeIntroVideo implements TossSecRoute {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 1;
        public static final String PARAM_BEFORE_ENTRY_ID = "beforeEntryId";
        public static final String PARAM_ENTRY_ID = "entryId";
        public static final String PARAM_FROM_NOTIFICATION = "fromNotification";
        public static final String PARAM_START_IN_PIP = "startInPip";
        public static final String PATH = "/option-practice/intro-video";
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String beforeEntryId;
        private final String entryId;
        private final String fromNotification;
        private final String startInPip;

        static {
            int i = onNavigationEvent + 95;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public OptionPracticeIntroVideo() {
            this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OptionPracticeIntroVideo)) {
                return false;
            }
            OptionPracticeIntroVideo optionPracticeIntroVideo = (OptionPracticeIntroVideo) obj;
            if (!Intrinsics.areEqual(this.entryId, optionPracticeIntroVideo.entryId)) {
                int i3 = IAuthTabCallback + 119;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.beforeEntryId, optionPracticeIntroVideo.beforeEntryId)) {
                return false;
            }
            if (Intrinsics.areEqual(this.startInPip, optionPracticeIntroVideo.startInPip)) {
                return Intrinsics.areEqual(this.fromNotification, optionPracticeIntroVideo.fromNotification);
            }
            int i5 = onExtraCallback + 103;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            String str = this.entryId;
            if (str == null) {
                int i2 = IAuthTabCallback + 51;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.beforeEntryId;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.startInPip;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.fromNotification;
            if (str4 != null) {
                int i4 = IAuthTabCallback + 59;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    str4.hashCode();
                    throw null;
                }
                iHashCode2 = str4.hashCode();
            } else {
                iHashCode2 = 0;
            }
            int i5 = (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
            int i6 = IAuthTabCallback + 73;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 53 / 0;
            }
            return i5;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OptionPracticeIntroVideo(entryId=" + this.entryId + ", beforeEntryId=" + this.beforeEntryId + ", startInPip=" + this.startInPip + ", fromNotification=" + this.fromNotification + ")";
            int i2 = IAuthTabCallback + 79;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 53 / 0;
            }
            return str;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ OptionPracticeIntroVideo(int i, String str, String str2, String str3, String str4, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.entryId = null;
                int i2 = IAuthTabCallback + 37;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 / 4;
                }
                if ((i & 2) != 0) {
                    this.beforeEntryId = null;
                } else {
                    this.beforeEntryId = str2;
                }
                int i4 = 2 % 2;
                if ((i & 4) != 0) {
                    this.startInPip = null;
                } else {
                    this.startInPip = str3;
                }
                if ((i & 8) == 0) {
                    this.fromNotification = str4;
                    return;
                }
                this.fromNotification = null;
                int i5 = IAuthTabCallback + 39;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 42 / 0;
                    return;
                }
                return;
            }
            this.entryId = str;
            int i7 = 2 % 2;
            if ((i & 2) != 0) {
            }
            int i42 = 2 % 2;
            if ((i & 4) != 0) {
            }
            if ((i & 8) == 0) {
            }
        }

        public OptionPracticeIntroVideo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.entryId = str;
            this.beforeEntryId = str2;
            this.startInPip = str3;
            this.fromNotification = str4;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallback(OptionPracticeIntroVideo optionPracticeIntroVideo, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i2 = IAuthTabCallback + 31;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    String str = optionPracticeIntroVideo.entryId;
                    throw null;
                }
                if (optionPracticeIntroVideo.entryId != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, optionPracticeIntroVideo.entryId);
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i3 = IAuthTabCallback + 51;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    String str2 = optionPracticeIntroVideo.beforeEntryId;
                    throw null;
                }
                if (optionPracticeIntroVideo.beforeEntryId != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, optionPracticeIntroVideo.beforeEntryId);
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                int i4 = onExtraCallback + 21;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                if (optionPracticeIntroVideo.startInPip != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, optionPracticeIntroVideo.startInPip);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 3) || optionPracticeIntroVideo.fromNotification != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, optionPracticeIntroVideo.fromNotification);
            }
            int i6 = onExtraCallback + 101;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ OptionPracticeIntroVideo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallback + 71;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
                str = null;
            }
            str2 = (i & 2) != 0 ? null : str2;
            if ((i & 4) != 0) {
                int i4 = IAuthTabCallback + 115;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                str3 = null;
            }
            if ((i & 8) != 0) {
                int i6 = 2 % 2;
                str4 = null;
            }
            this(str, str2, str3, str4);
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 125;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.entryId;
            int i5 = i2 + 63;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.beforeEntryId;
            int i5 = i3 + 105;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnNavigationEvent = onNavigationEvent(this.startInPip);
            int i4 = onExtraCallback + 15;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return zOnNavigationEvent;
        }

        public final boolean onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnNavigationEvent = onNavigationEvent(this.fromNotification);
            int i4 = onExtraCallback + 113;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return zOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final boolean onNavigationEvent(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 3;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            if (str == null) {
                int i6 = i2 + 47;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 97 / 0;
                }
                return false;
            }
            int i8 = i4 + 15;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            boolean zAreEqual = Intrinsics.areEqual(StringsKt.toBooleanStrictOrNull(str), Boolean.TRUE);
            if (i9 != 0) {
                int i10 = 23 / 0;
            }
            return zAreEqual;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OptionPracticeIntroVideo> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 115;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    TossSecRoute$OptionPracticeIntroVideo$$serializer tossSecRoute$OptionPracticeIntroVideo$$serializer = TossSecRoute$OptionPracticeIntroVideo$$serializer.INSTANCE;
                    throw null;
                }
                TossSecRoute$OptionPracticeIntroVideo$$serializer tossSecRoute$OptionPracticeIntroVideo$$serializer2 = TossSecRoute$OptionPracticeIntroVideo$$serializer.INSTANCE;
                int i3 = onExtraCallback + 43;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return tossSecRoute$OptionPracticeIntroVideo$$serializer2;
            }
        }
    }

    @liq
    public static final class EarningCallDetailWatchPointsReference implements TossSecRoute {
        public static final int $stable = 0;
        public static final Companion Companion;
        private static int IAuthTabCallback = 0;
        public static final String PARAM_EVENT_ID = "eventId";
        public static final String PARAM_UUID = "uuid";
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String eventId;
        private final String uuid;

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = IAuthTabCallback + 91;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EarningCallDetailWatchPointsReference)) {
                int i2 = onExtraCallbackWithResult + 105;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            EarningCallDetailWatchPointsReference earningCallDetailWatchPointsReference = (EarningCallDetailWatchPointsReference) obj;
            if (!Intrinsics.areEqual(this.uuid, earningCallDetailWatchPointsReference.uuid)) {
                int i4 = onExtraCallbackWithResult + 107;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.eventId, earningCallDetailWatchPointsReference.eventId))) {
                return true;
            }
            int i6 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.uuid.hashCode() * 31) + this.eventId.hashCode();
            int i4 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "EarningCallDetailWatchPointsReference(uuid=" + this.uuid + ", eventId=" + this.eventId + ")";
            int i2 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public /* synthetic */ EarningCallDetailWatchPointsReference(int i, String str, String str2, okycx okycxVar) {
            SerialDescriptor descriptor;
            int i2 = 3;
            if (3 != (i & 3)) {
                int i3 = onWarmupCompleted + 1;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    descriptor = TossSecRoute$EarningCallDetailWatchPointsReference$$serializer.INSTANCE.getDescriptor();
                    i2 = 4;
                } else {
                    descriptor = TossSecRoute$EarningCallDetailWatchPointsReference$$serializer.INSTANCE.getDescriptor();
                }
                htf31.onExtraCallbackWithResult(i, i2, descriptor);
                int i4 = onWarmupCompleted + 65;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            }
            this.uuid = str;
            this.eventId = str2;
        }

        public EarningCallDetailWatchPointsReference(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.uuid = str;
            this.eventId = str2;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallbackWithResult(EarningCallDetailWatchPointsReference earningCallDetailWatchPointsReference, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            vylVar.onExtraCallback(serialDescriptor, 0, earningCallDetailWatchPointsReference.uuid);
            vylVar.onExtraCallback(serialDescriptor, 1, earningCallDetailWatchPointsReference.eventId);
            int i4 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 43 / 0;
            }
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return this.uuid;
            }
            throw null;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.eventId;
            int i5 = i3 + 117;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<EarningCallDetailWatchPointsReference> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 85;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    TossSecRoute$EarningCallDetailWatchPointsReference$$serializer tossSecRoute$EarningCallDetailWatchPointsReference$$serializer = TossSecRoute$EarningCallDetailWatchPointsReference$$serializer.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                TossSecRoute$EarningCallDetailWatchPointsReference$$serializer tossSecRoute$EarningCallDetailWatchPointsReference$$serializer2 = TossSecRoute$EarningCallDetailWatchPointsReference$$serializer.INSTANCE;
                int i3 = onWarmupCompleted + 3;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return tossSecRoute$EarningCallDetailWatchPointsReference$$serializer2;
            }
        }
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onTransact = 1;
        private static int onWarmupCompleted;
        static final /* synthetic */ Companion IAuthTabCallback = new Companion();
        private static final Lazy<List<String>> onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.core.router.spec.TossSecRoute$Companion$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 65;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                List listOnExtraCallbackWithResult = TossSecRoute.Companion.onExtraCallbackWithResult();
                if (i3 == 0) {
                    int i4 = 58 / 0;
                }
                return listOnExtraCallbackWithResult;
            }
        });

        public static /* synthetic */ List onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallback();
            }
            onExtraCallback();
            throw null;
        }

        private Companion() {
        }

        public final KSerializer<TossSecRoute> serializer() {
            int i = 2 % 2;
            kt ktVar = new kt("im.toss.securities.core.router.spec.TossSecRoute", Reflection.getOrCreateKotlinClass(TossSecRoute.class), new KClass[]{Reflection.getOrCreateKotlinClass(EarningCallDetailWatchPointsReference.class), Reflection.getOrCreateKotlinClass(EarningCallHome.class), Reflection.getOrCreateKotlinClass(EarningCallHomeDetailV2.class), Reflection.getOrCreateKotlinClass(Loading.class), Reflection.getOrCreateKotlinClass(Main.class), Reflection.getOrCreateKotlinClass(OptionPracticeIntroVideo.class), Reflection.getOrCreateKotlinClass(Web.class)}, new KSerializer[]{TossSecRoute$EarningCallDetailWatchPointsReference$$serializer.INSTANCE, new htf1("im.toss.securities.core.router.spec.TossSecRoute.EarningCallHome", EarningCallHome.INSTANCE, new Annotation[0]), TossSecRoute$EarningCallHomeDetailV2$$serializer.INSTANCE, new htf1("im.toss.securities.core.router.spec.TossSecRoute.Loading", Loading.INSTANCE, new Annotation[0]), TossSecRoute$Main$$serializer.INSTANCE, TossSecRoute$OptionPracticeIntroVideo$$serializer.INSTANCE, TossSecRoute$Web$$serializer.INSTANCE}, new Annotation[0]);
            int i2 = onExtraCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return ktVar;
            }
            throw null;
        }

        static {
            int i = onTransact + 123;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        private final List<String> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            List<String> list = (List) onNavigationEvent.getValue();
            int i4 = onExtraCallbackWithResult + 31;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return list;
            }
            throw null;
        }

        private static final List onExtraCallback() {
            List listListOf;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                String[] strArr = new String[4];
                strArr[1] = Main.PATH;
                strArr[1] = OptionPracticeIntroVideo.PATH;
                strArr[5] = EarningCallDetail.PATH;
                listListOf = CollectionsKt.listOf(strArr);
            } else {
                listListOf = CollectionsKt.listOf(new String[]{Main.PATH, OptionPracticeIntroVideo.PATH, EarningCallDetail.PATH});
            }
            List listPlus = CollectionsKt.plus(listListOf, EarningCallDetail.Companion.onExtraCallbackWithResult());
            int i3 = onExtraCallback + 43;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return listPlus;
        }

        public final boolean onExtraCallbackWithResult(@NotNull String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            String strRemoveSuffix = StringsKt.removeSuffix(StringsKt.removePrefix(str, Main.PATH), Main.PATH);
            boolean zContains = onWarmupCompleted().contains(Main.PATH + strRemoveSuffix);
            int i2 = onExtraCallbackWithResult + 95;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return zContains;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
