package o;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.core.webkit.TossBridgeWebView;
import im.toss.define.TossAffiliate;
import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.TimeoutCompanionNONE1;
import o.surfaceCreated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class surfaceCreated {
    private static String IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 0;
    private static int access100 = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private boolean IAuthTabCallbackStub;
    private boolean onExtraCallbackWithResult;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final AppSetIdAndScope1 onWarmupCompleted = ea10.onExtraCallbackWithResult("WebViewStateTracker");
    private final List<onWarmupCompleted> asInterface = new ArrayList();
    private final IdGeneratorExternalSyntheticLambda1 onExtraCallback = IdGeneratorExternalSyntheticLambda1.Companion.onExtraCallback("HH:mm:ss.SSS");
    private onExtraCallback onNavigationEvent = new onExtraCallback();

    public static final /* synthetic */ class IAuthTabCallbackDefault {
        private static int IAuthTabCallback = 0;
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[IAuthTabCallback.values().length];
            try {
                iArr[IAuthTabCallback.LOAD_URL.ordinal()] = 1;
                int i = IAuthTabCallback + 27;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IAuthTabCallback.RECOVERY_STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
            int[] iArr2 = new int[onNavigationEvent.values().length];
            try {
                iArr2[onNavigationEvent.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[onNavigationEvent.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[onNavigationEvent.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            onExtraCallback = iArr2;
            int i4 = onWarmupCompleted + 27;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = (~(i7 | i6)) | i5;
        int i9 = ~i5;
        int i10 = ~(i7 | i9);
        int i11 = ~i6;
        int i12 = i10 | (~(i9 | i11));
        int i13 = (~(i6 | i9)) | (~(i7 | i11));
        int i14 = i2 + i5 + i4 + (417615942 * i3) + (566850886 * i);
        int i15 = i14 * i14;
        int i16 = ((-370608051) * i2) + 147849216 + ((-2147356519) * i5) + (i8 * 1776748468) + (i12 * 1776748468) + (1776748468 * i13) + (1406140416 * i4) + ((-354418688) * i3) + ((-85983232) * i) + ((-608960512) * i15);
        int i17 = (i2 * (-1357469509)) + 140661806 + (i5 * (-1357469617)) + (i8 * 108) + (i12 * 108) + (i13 * 108) + (i4 * (-1357469401)) + (i3 * 1137340586) + (i * 304092074) + (i15 * 1282146304);
        int i18 = i16 + (i17 * i17 * 1158414336);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    public static final /* synthetic */ AppSetIdAndScope1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = onWarmupCompleted;
        int i5 = i3 + 81;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return appSetIdAndScope1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(surfaceCreated surfacecreated, String str) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        surfacecreated.onExtraCallbackWithResult(str);
        int i4 = access100 + 83;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
    }

    public final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 15;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackStub = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 1;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        public static final IAuthTabCallback LOAD_URL = new IAuthTabCallback("LOAD_URL", 0);
        public static final IAuthTabCallback PAGE_START = new IAuthTabCallback("PAGE_START", 1);
        public static final IAuthTabCallback PAGE_FINISH = new IAuthTabCallback("PAGE_FINISH", 2);
        public static final IAuthTabCallback HTTP_ERROR = new IAuthTabCallback("HTTP_ERROR", 3);
        public static final IAuthTabCallback LOAD_ERROR = new IAuthTabCallback("LOAD_ERROR", 4);
        public static final IAuthTabCallback SSL_ERROR = new IAuthTabCallback("SSL_ERROR", 5);
        public static final IAuthTabCallback RENDER_PROCESS_GONE = new IAuthTabCallback("RENDER_PROCESS_GONE", 6);
        public static final IAuthTabCallback RECOVERY_STARTED = new IAuthTabCallback("RECOVERY_STARTED", 7);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 3;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {LOAD_URL, PAGE_START, PAGE_FINISH, HTTP_ERROR, LOAD_ERROR, SSL_ERROR, RENDER_PROCESS_GONE, RECOVERY_STARTED};
            int i5 = i2 + 53;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i5 = i3 + 25;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            int i4 = IAuthTabCallback + 57;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 3;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iAuthTabCallbackArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onExtraCallback + 35;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                int i2 = 74 / 0;
            }
        }
    }

    public final class onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private deserializeUriNullableCollection onWarmupCompleted;

        public static /* synthetic */ Long IAuthTabCallback(Throwable th) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                return (Long) onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted3, -1334588378, new Object[]{th}, 1334588379, iOnWarmupCompleted2, iOnWarmupCompleted);
            }
            int iOnWarmupCompleted4 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted5 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted6 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int i3 = 73 / 0;
            return (Long) onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted6, -1334588378, new Object[]{th}, 1334588379, iOnWarmupCompleted5, iOnWarmupCompleted4);
        }

        public static /* synthetic */ Unit onExtraCallback(surfaceCreated surfacecreated, String str, Long l) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onWarmupCompleted(surfacecreated, str, l);
                throw null;
            }
            Unit unitOnWarmupCompleted = onWarmupCompleted(surfacecreated, str, l);
            int i3 = IAuthTabCallback + 105;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return unitOnWarmupCompleted;
        }

        public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(function1, obj);
            int i4 = onNavigationEvent + 79;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public static /* synthetic */ Long onWarmupCompleted(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int iOnWarmupCompleted4 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted5 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted6 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            Long l = (Long) onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted6, -1685249114, new Object[]{function1, obj}, 1685249114, iOnWarmupCompleted5, iOnWarmupCompleted4);
            int i3 = onNavigationEvent + 105;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 15 / 0;
            }
            return l;
        }

        public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = ~i4;
            int i8 = ~i6;
            int i9 = i3 | i7 | i8;
            int i10 = (~(i7 | i6)) | (~(i8 | i3));
            int i11 = (~(i6 | i3)) | (~(i7 | (~i3) | i8));
            int i12 = i3 + i4 + i5 + ((-160716491) * i2) + (1883135422 * i);
            int i13 = i12 * i12;
            int i14 = (((-1835184368) * i3) - 666828800) + ((-962678542) * i4) + ((-1711230735) * i9) + (i10 * 1711230735) + (1711230735 * i11) + (748552192 * i5) + ((-1967783936) * i2) + ((-2092695552) * i) + ((-870252544) * i13);
            int i15 = (i3 * 1975847376) + 750996803 + (i4 * 1975845642) + (i9 * (-867)) + (i10 * 867) + (i11 * 867) + (i5 * 1975846509) + (i2 * (-526956143)) + (i * 972447206) + (i13 * (-1341325312));
            return i14 + ((i15 * i15) * 1929838592) != 1 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
        }

        public onExtraCallback() {
        }

        public final void onNavigationEvent(long j, @NotNull final String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            surfaceCreated.onExtraCallbackWithResult();
            deserializeUriNullableCollection deserializeurinullablecollection = this.onWarmupCompleted;
            if (deserializeurinullablecollection != null) {
                int i2 = onNavigationEvent + 39;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    deserializeurinullablecollection.dispose();
                    int i3 = 59 / 0;
                } else {
                    deserializeurinullablecollection.dispose();
                }
            }
            getByteBuffer getbytebufferOnWarmupCompleted = getByteBuffer.onWarmupCompleted(j, TimeUnit.SECONDS);
            final surfaceCreated surfacecreated = surfaceCreated.this;
            final Function1 function1 = new Function1() { // from class: im.toss.core.webkit.WebViewStateTracker$FlushTimerTask$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 37;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    surfaceCreated surfacecreated2 = surfacecreated;
                    if (i6 == 0) {
                        return surfaceCreated.onExtraCallback.onExtraCallback(surfacecreated2, str, (Long) obj);
                    }
                    surfaceCreated.onExtraCallback.onExtraCallback(surfacecreated2, str, (Long) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            };
            getByteBuffer getbytebufferOnExtraCallback = getbytebufferOnWarmupCompleted.onExtraCallback(new deserializeFloat() { // from class: im.toss.core.webkit.WebViewStateTracker$FlushTimerTask$$ExternalSyntheticLambda1
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final void accept(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 93;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    surfaceCreated.onExtraCallback.onExtraCallback(function1, obj);
                    int i7 = onNavigationEvent + 73;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        return;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
            final Function1 function12 = new Function1() { // from class: im.toss.core.webkit.WebViewStateTracker$FlushTimerTask$$ExternalSyntheticLambda2
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 59;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    Long lIAuthTabCallback = surfaceCreated.onExtraCallback.IAuthTabCallback((Throwable) obj);
                    int i7 = onNavigationEvent + 61;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 79 / 0;
                    }
                    return lIAuthTabCallback;
                }
            };
            this.onWarmupCompleted = getbytebufferOnExtraCallback.asBinder(new deserializeIntNullableCollection() { // from class: im.toss.core.webkit.WebViewStateTracker$FlushTimerTask$$ExternalSyntheticLambda3
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object apply(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 83;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    Function1 function13 = function12;
                    if (i6 != 0) {
                        return surfaceCreated.onExtraCallback.onWarmupCompleted(function13, obj);
                    }
                    surfaceCreated.onExtraCallback.onWarmupCompleted(function13, obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }).extraCallbackWithResult();
        }

        private static final void onNavigationEvent(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(obj);
            if (i3 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        private static final Unit onWarmupCompleted(surfaceCreated surfacecreated, String str, Long l) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            surfaceCreated.onExtraCallbackWithResult();
            surfaceCreated.onNavigationEvent(surfacecreated, str);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 61;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            Function1 function1 = (Function1) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(obj, "");
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(obj, "");
            Long l = (Long) function1.invoke(obj);
            int i3 = onNavigationEvent + 111;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 / 0;
            }
            return l;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            Throwable th = (Throwable) objArr[0];
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(th, "");
                return -1L;
            }
            Intrinsics.checkNotNullParameter(th, "");
            Long.valueOf(-1L);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onExtraCallbackWithResult() {
            int i = 2 % 2;
            deserializeUriNullableCollection deserializeurinullablecollection = this.onWarmupCompleted;
            if (deserializeurinullablecollection != null) {
                int i2 = IAuthTabCallback + 59;
                onNavigationEvent = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    deserializeurinullablecollection.isDisposed();
                    obj.hashCode();
                    throw null;
                }
                if (!deserializeurinullablecollection.isDisposed()) {
                    surfaceCreated.onExtraCallbackWithResult();
                    deserializeUriNullableCollection deserializeurinullablecollection2 = this.onWarmupCompleted;
                    if (deserializeurinullablecollection2 != null) {
                        deserializeurinullablecollection2.dispose();
                    }
                    this.onWarmupCompleted = null;
                }
            }
            int i3 = IAuthTabCallback + 75;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }

        private static final Long onNavigationEvent(Throwable th) {
            int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            return (Long) onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted3, -1334588378, new Object[]{th}, 1334588379, iOnWarmupCompleted2, iOnWarmupCompleted);
        }

        private static final Long IAuthTabCallback(Function1 function1, Object obj) {
            int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            return (Long) onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted3, -1685249114, new Object[]{function1, obj}, 1685249114, iOnWarmupCompleted2, iOnWarmupCompleted);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TossBridgeWebView tossBridgeWebView;
        WebView webView = (WebView) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(webView, "");
            Class.forName("im.toss.core.webkit.TossCoreWebView").isInstance(webView);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(webView, "");
        if (Class.forName("im.toss.core.webkit.TossCoreWebView").isInstance(webView)) {
            tossBridgeWebView = (TossBridgeWebView) webView;
        } else {
            int i3 = IAuthTabCallbackDefault + 99;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            tossBridgeWebView = null;
        }
        if (tossBridgeWebView == null) {
            return null;
        }
        return (String) TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{tossBridgeWebView}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -157751857, 157751867, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    public final void IAuthTabCallback(@NotNull WebView webView, @NotNull String str) {
        int i = 2 % 2;
        int i2 = access100 + 113;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        IAuthTabCallback(this, (String) onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1324526505, iOnWarmupCompleted3, iOnWarmupCompleted2, -1324526504, iOnWarmupCompleted, new Object[]{this, webView}), IAuthTabCallback.LOAD_URL, str, null, false, 24, null);
        int i4 = access100 + 85;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallbackWithResult(@NotNull WebView webView, @NotNull String str) {
        int i = 2 % 2;
        int i2 = access100 + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        IAuthTabCallback(this, (String) onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1324526505, iOnWarmupCompleted3, iOnWarmupCompleted2, -1324526504, iOnWarmupCompleted, new Object[]{this, webView}), IAuthTabCallback.PAGE_START, str, null, false, 24, null);
        int i4 = IAuthTabCallbackDefault + 79;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        surfaceCreated surfacecreated = (surfaceCreated) objArr[0];
        WebView webView = (WebView) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        IAuthTabCallback(surfacecreated, (String) onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1324526505, iOnWarmupCompleted3, iOnWarmupCompleted2, -1324526504, iOnWarmupCompleted, new Object[]{surfacecreated, webView}), IAuthTabCallback.PAGE_FINISH, str, null, false, 24, null);
        IAuthTabCallback = str;
        int i4 = access100 + 117;
        IAuthTabCallbackDefault = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@NotNull WebView webView, @NotNull Uri uri, @NotNull WebResourceError webResourceError) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(webResourceError, "");
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        onExtraCallbackWithResult((String) onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1324526505, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, -1324526504, iOnWarmupCompleted, new Object[]{this, webView}), IAuthTabCallback.LOAD_ERROR, uri, "errorCode=" + webResourceError.getErrorCode() + ", errorDesc=" + ((Object) webResourceError.getDescription()));
        int i2 = IAuthTabCallbackDefault + 23;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void onNavigationEvent(@NotNull WebView webView, @NotNull Uri uri, @NotNull WebResourceResponse webResourceResponse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(webResourceResponse, "");
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        onExtraCallbackWithResult((String) onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1324526505, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, -1324526504, iOnWarmupCompleted, new Object[]{this, webView}), IAuthTabCallback.HTTP_ERROR, uri, "statusCode=" + webResourceResponse.getStatusCode() + ", reasonPhrase=" + webResourceResponse.getReasonPhrase());
        int i2 = access100 + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void onWarmupCompleted(@NotNull WebView webView, @NotNull SslError sslError) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(sslError, "");
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        String str = (String) onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1324526505, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, -1324526504, iOnWarmupCompleted, new Object[]{this, webView});
        IAuthTabCallback iAuthTabCallback = IAuthTabCallback.SSL_ERROR;
        Uri uri = Uri.parse(sslError.getUrl());
        Intrinsics.checkNotNullExpressionValue(uri, "");
        onExtraCallbackWithResult(str, iAuthTabCallback, uri, "error=" + sslError);
        int i2 = IAuthTabCallbackDefault + 121;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void qG_(@NotNull WebView webView, @Nullable RenderProcessGoneDetail renderProcessGoneDetail) {
        int i = 2 % 2;
        int i2 = access100 + 47;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        String str = (String) onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1324526505, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, -1324526504, iOnWarmupCompleted, new Object[]{this, webView});
        IAuthTabCallback iAuthTabCallback = IAuthTabCallback.RENDER_PROCESS_GONE;
        Uri uri = Uri.EMPTY;
        Intrinsics.checkNotNullExpressionValue(uri, "");
        Boolean boolValueOf = null;
        if (renderProcessGoneDetail != null) {
            int i4 = access100 + 113;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                Boolean.valueOf(renderProcessGoneDetail.didCrash());
                throw null;
            }
            boolValueOf = Boolean.valueOf(renderProcessGoneDetail.didCrash());
        }
        onExtraCallbackWithResult(str, iAuthTabCallback, uri, "didCrash=" + boolValueOf);
    }

    public final void onWarmupCompleted(@NotNull WebView webView) {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        IAuthTabCallback(true);
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        String str2 = (String) onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1324526505, iOnWarmupCompleted3, iOnWarmupCompleted2, -1324526504, iOnWarmupCompleted, new Object[]{this, webView});
        IAuthTabCallback iAuthTabCallback = IAuthTabCallback.RECOVERY_STARTED;
        String url = webView.getUrl();
        if (url == null) {
            int i4 = IAuthTabCallbackDefault + 23;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            str = "";
        } else {
            str = url;
        }
        onNavigationEvent(str2, iAuthTabCallback, str, (String) null, false);
        int i5 = access100 + 115;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult("onWebViewDestroy");
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 9;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void onExtraCallback(surfaceCreated surfacecreated, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 83;
        access100 = i3 % 128;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            z = true;
        }
        surfacecreated.IAuthTabCallback(z);
        int i4 = access100 + 35;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallback(boolean z) {
        synchronized (this) {
            if (z) {
                onExtraCallbackWithResult("resetStates");
                this.onExtraCallbackWithResult = false;
                this.asInterface.clear();
                this.onNavigationEvent.onExtraCallbackWithResult();
            } else {
                this.onExtraCallbackWithResult = false;
                this.asInterface.clear();
                this.onNavigationEvent.onExtraCallbackWithResult();
            }
        }
    }

    private final void onExtraCallbackWithResult(String str, IAuthTabCallback iAuthTabCallback, Uri uri, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 45;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -594968045, iOnWarmupCompleted3, iOnWarmupCompleted2, 594968047, iOnWarmupCompleted, new Object[]{this, str, iAuthTabCallback, uri, str2, false});
        } else {
            int iOnWarmupCompleted4 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted5 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted6 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -594968045, iOnWarmupCompleted6, iOnWarmupCompleted5, 594968047, iOnWarmupCompleted4, new Object[]{this, str, iAuthTabCallback, uri, str2, true});
        }
        int i3 = IAuthTabCallbackDefault + 101;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 34 / 0;
        }
    }

    static /* synthetic */ void IAuthTabCallback(surfaceCreated surfacecreated, String str, IAuthTabCallback iAuthTabCallback, String str2, String str3, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 63;
        access100 = i4 % 128;
        if (i4 % 2 != 0 ? (i & 8) != 0 : (i & 10) != 0) {
            int i5 = i3 + 89;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            str3 = null;
        }
        String str4 = str3;
        if ((i & 16) != 0) {
            int i7 = i3 + 71;
            access100 = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        surfacecreated.onNavigationEvent(str, iAuthTabCallback, str2, str4, z);
    }

    private final void onNavigationEvent(String str, IAuthTabCallback iAuthTabCallback, String str2, String str3, boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this, str, iAuthTabCallback, Uri.parse(str2), str3, Boolean.valueOf(z)};
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -594968045, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, 594968047, iOnWarmupCompleted, objArr);
        int i4 = access100 + 51;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        surfaceCreated surfacecreated = (surfaceCreated) objArr[0];
        String str = (String) objArr[1];
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[2];
        Uri uri = (Uri) objArr[3];
        String str2 = (String) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        synchronized (surfacecreated) {
            if (!surfacecreated.IAuthTabCallbackStub) {
                return null;
            }
            if (surfacecreated.onExtraCallbackWithResult) {
                return null;
            }
            if (surfacecreated.asInterface.size() >= 10) {
                surfacecreated.asInterface.size();
                return null;
            }
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(str, new Date(), iAuthTabCallback, uri, str2, zBooleanValue);
            onWarmupCompleted onwarmupcompleted2 = (onWarmupCompleted) CollectionsKt.lastOrNull(surfacecreated.asInterface);
            if (onwarmupcompleted2 != null && Intrinsics.areEqual(onwarmupcompleted2.onExtraCallbackWithResult(), onwarmupcompleted.onExtraCallbackWithResult()) && onwarmupcompleted2.onNavigationEvent() == onwarmupcompleted.onNavigationEvent() && Intrinsics.areEqual(onwarmupcompleted2.onWarmupCompleted(), onwarmupcompleted.onWarmupCompleted())) {
                return null;
            }
            int i = IAuthTabCallbackDefault.onExtraCallbackWithResult[iAuthTabCallback.ordinal()];
            if (i == 1) {
                surfacecreated.onNavigationEvent.onNavigationEvent(30L, "loadUrlTimer");
            } else if (i == 2) {
                surfacecreated.onNavigationEvent.onNavigationEvent(30L, "recoveryTimer");
            }
            new Object[]{iAuthTabCallback, uri, str2};
            surfacecreated.asInterface.add(onwarmupcompleted);
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final onNavigationEvent DEBUG = new onNavigationEvent("DEBUG", 0);
        public static final onNavigationEvent WARN = new onNavigationEvent("WARN", 1);
        public static final onNavigationEvent ERROR = new onNavigationEvent("ERROR", 2);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 27;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent[] onnavigationeventArr = {DEBUG, WARN, ERROR};
            int i5 = i2 + 43;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            if (i3 != 0) {
                int i4 = 63 / 0;
            }
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            if (i3 == 0) {
                int i4 = 94 / 0;
            }
            int i5 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 26 / 0;
            }
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i4 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return onnavigationeventArr;
            }
            throw null;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onNavigationEvent + 107;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        int i;
        onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        String str3 = (String) objArr[4];
        String str4 = (String) objArr[5];
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 23;
        access100 = i3 % 128;
        if (i3 % 2 != 0 ? (i = IAuthTabCallbackDefault.onExtraCallback[onnavigationevent.ordinal()]) == 1 : (i = IAuthTabCallbackDefault.onExtraCallback[onnavigationevent.ordinal()]) == 1) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "WebViewState", str, access8100.onNavigationEvent(getWrite.IAuthTabCallback("_webview_id", str4)), str2, false, str3, 16, (Object) null);
            return null;
        }
        int i4 = IAuthTabCallbackDefault + 51;
        int i5 = i4 % 128;
        access100 = i5;
        int i6 = i4 % 2;
        if (i == 2) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "WebViewState", str, access8100.onNavigationEvent(getWrite.IAuthTabCallback("_webview_id", str4)), str2, false, str3, 16, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            return null;
        }
        int i7 = i5 + 49;
        IAuthTabCallbackDefault = i7 % 128;
        int i8 = i7 % 2;
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "WebViewState", str, null, access8100.onNavigationEvent(getWrite.IAuthTabCallback("_webview_id", str4)), str2, str3, false, 68, null);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac A[Catch: all -> 0x02a2, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0009, B:12:0x000f, B:16:0x0019, B:19:0x0023, B:30:0x0048, B:31:0x0055, B:33:0x005b, B:35:0x006a, B:36:0x006e, B:39:0x0075, B:40:0x0079, B:42:0x007f, B:46:0x008e, B:47:0x00a6, B:49:0x00ac, B:51:0x00b2, B:52:0x00b5, B:54:0x00c7, B:56:0x00ce, B:58:0x00d4, B:61:0x00e2, B:64:0x012e, B:69:0x01a5, B:65:0x0168, B:68:0x0174, B:70:0x01ad, B:73:0x01c0, B:76:0x01c8, B:78:0x01d3, B:81:0x01db, B:83:0x01f4, B:85:0x01fc, B:87:0x022a, B:89:0x0236, B:91:0x023e, B:99:0x028f, B:92:0x025a, B:94:0x0260, B:96:0x026c, B:98:0x0274, B:80:0x01d9, B:74:0x01c3, B:75:0x01c6, B:22:0x002d, B:23:0x0031, B:25:0x0037), top: B:105:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c6 A[Catch: all -> 0x02a2, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0009, B:12:0x000f, B:16:0x0019, B:19:0x0023, B:30:0x0048, B:31:0x0055, B:33:0x005b, B:35:0x006a, B:36:0x006e, B:39:0x0075, B:40:0x0079, B:42:0x007f, B:46:0x008e, B:47:0x00a6, B:49:0x00ac, B:51:0x00b2, B:52:0x00b5, B:54:0x00c7, B:56:0x00ce, B:58:0x00d4, B:61:0x00e2, B:64:0x012e, B:69:0x01a5, B:65:0x0168, B:68:0x0174, B:70:0x01ad, B:73:0x01c0, B:76:0x01c8, B:78:0x01d3, B:81:0x01db, B:83:0x01f4, B:85:0x01fc, B:87:0x022a, B:89:0x0236, B:91:0x023e, B:99:0x028f, B:92:0x025a, B:94:0x0260, B:96:0x026c, B:98:0x0274, B:80:0x01d9, B:74:0x01c3, B:75:0x01c6, B:22:0x002d, B:23:0x0031, B:25:0x0037), top: B:105:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d9 A[Catch: all -> 0x02a2, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0009, B:12:0x000f, B:16:0x0019, B:19:0x0023, B:30:0x0048, B:31:0x0055, B:33:0x005b, B:35:0x006a, B:36:0x006e, B:39:0x0075, B:40:0x0079, B:42:0x007f, B:46:0x008e, B:47:0x00a6, B:49:0x00ac, B:51:0x00b2, B:52:0x00b5, B:54:0x00c7, B:56:0x00ce, B:58:0x00d4, B:61:0x00e2, B:64:0x012e, B:69:0x01a5, B:65:0x0168, B:68:0x0174, B:70:0x01ad, B:73:0x01c0, B:76:0x01c8, B:78:0x01d3, B:81:0x01db, B:83:0x01f4, B:85:0x01fc, B:87:0x022a, B:89:0x0236, B:91:0x023e, B:99:0x028f, B:92:0x025a, B:94:0x0260, B:96:0x026c, B:98:0x0274, B:80:0x01d9, B:74:0x01c3, B:75:0x01c6, B:22:0x002d, B:23:0x0031, B:25:0x0037), top: B:105:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f4 A[Catch: all -> 0x02a2, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0009, B:12:0x000f, B:16:0x0019, B:19:0x0023, B:30:0x0048, B:31:0x0055, B:33:0x005b, B:35:0x006a, B:36:0x006e, B:39:0x0075, B:40:0x0079, B:42:0x007f, B:46:0x008e, B:47:0x00a6, B:49:0x00ac, B:51:0x00b2, B:52:0x00b5, B:54:0x00c7, B:56:0x00ce, B:58:0x00d4, B:61:0x00e2, B:64:0x012e, B:69:0x01a5, B:65:0x0168, B:68:0x0174, B:70:0x01ad, B:73:0x01c0, B:76:0x01c8, B:78:0x01d3, B:81:0x01db, B:83:0x01f4, B:85:0x01fc, B:87:0x022a, B:89:0x0236, B:91:0x023e, B:99:0x028f, B:92:0x025a, B:94:0x0260, B:96:0x026c, B:98:0x0274, B:80:0x01d9, B:74:0x01c3, B:75:0x01c6, B:22:0x002d, B:23:0x0031, B:25:0x0037), top: B:105:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022a A[Catch: all -> 0x02a2, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0009, B:12:0x000f, B:16:0x0019, B:19:0x0023, B:30:0x0048, B:31:0x0055, B:33:0x005b, B:35:0x006a, B:36:0x006e, B:39:0x0075, B:40:0x0079, B:42:0x007f, B:46:0x008e, B:47:0x00a6, B:49:0x00ac, B:51:0x00b2, B:52:0x00b5, B:54:0x00c7, B:56:0x00ce, B:58:0x00d4, B:61:0x00e2, B:64:0x012e, B:69:0x01a5, B:65:0x0168, B:68:0x0174, B:70:0x01ad, B:73:0x01c0, B:76:0x01c8, B:78:0x01d3, B:81:0x01db, B:83:0x01f4, B:85:0x01fc, B:87:0x022a, B:89:0x0236, B:91:0x023e, B:99:0x028f, B:92:0x025a, B:94:0x0260, B:96:0x026c, B:98:0x0274, B:80:0x01d9, B:74:0x01c3, B:75:0x01c6, B:22:0x002d, B:23:0x0031, B:25:0x0037), top: B:105:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025a A[Catch: all -> 0x02a2, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0009, B:12:0x000f, B:16:0x0019, B:19:0x0023, B:30:0x0048, B:31:0x0055, B:33:0x005b, B:35:0x006a, B:36:0x006e, B:39:0x0075, B:40:0x0079, B:42:0x007f, B:46:0x008e, B:47:0x00a6, B:49:0x00ac, B:51:0x00b2, B:52:0x00b5, B:54:0x00c7, B:56:0x00ce, B:58:0x00d4, B:61:0x00e2, B:64:0x012e, B:69:0x01a5, B:65:0x0168, B:68:0x0174, B:70:0x01ad, B:73:0x01c0, B:76:0x01c8, B:78:0x01d3, B:81:0x01db, B:83:0x01f4, B:85:0x01fc, B:87:0x022a, B:89:0x0236, B:91:0x023e, B:99:0x028f, B:92:0x025a, B:94:0x0260, B:96:0x026c, B:98:0x0274, B:80:0x01d9, B:74:0x01c3, B:75:0x01c6, B:22:0x002d, B:23:0x0031, B:25:0x0037), top: B:105:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(String str) {
        boolean z;
        boolean z2;
        onNavigationEvent onnavigationevent;
        onWarmupCompleted onwarmupcompleted;
        Uri uri;
        String string;
        synchronized (this) {
            if (this.IAuthTabCallbackStub) {
                if (this.onExtraCallbackWithResult) {
                    return;
                }
                if (this.asInterface.isEmpty()) {
                    return;
                }
                List<onWarmupCompleted> list = this.asInterface;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((onWarmupCompleted) it.next()).asBinder()) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    List<onWarmupCompleted> list2 = this.asInterface;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list2) {
                        if (((onWarmupCompleted) obj).onNavigationEvent() != IAuthTabCallback.PAGE_FINISH) {
                            break;
                        } else {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (((onWarmupCompleted) it2.next()).asBinder()) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    List<onWarmupCompleted> list3 = this.asInterface;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    int i = 0;
                    onWarmupCompleted onwarmupcompleted2 = null;
                    for (Object obj2 : list3) {
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        onWarmupCompleted onwarmupcompleted3 = (onWarmupCompleted) obj2;
                        String str2 = this.onExtraCallback.format(onwarmupcompleted3.IAuthTabCallback());
                        if (Intrinsics.areEqual(onwarmupcompleted3.onWarmupCompleted(), onwarmupcompleted2 != null ? onwarmupcompleted2.onWarmupCompleted() : null) || Intrinsics.areEqual(onwarmupcompleted3.onWarmupCompleted(), Uri.EMPTY)) {
                            IAuthTabCallback iAuthTabCallbackOnNavigationEvent = onwarmupcompleted3.onNavigationEvent();
                            String strOnExtraCallback = onwarmupcompleted3.onExtraCallback();
                            if (strOnExtraCallback == null) {
                                strOnExtraCallback = "";
                            }
                            string = StringsKt.trimEnd("[" + i + "] " + str2 + " " + iAuthTabCallbackOnNavigationEvent + " " + strOnExtraCallback).toString();
                        } else {
                            IAuthTabCallback iAuthTabCallbackOnNavigationEvent2 = onwarmupcompleted3.onNavigationEvent();
                            String str3 = (String) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1334309726, nSetPosition.onExtraCallbackWithResult(), -1334309720, new Object[]{onwarmupcompleted3.onWarmupCompleted().toString(), 300, null, 2, null});
                            String strOnExtraCallback2 = onwarmupcompleted3.onExtraCallback();
                            if (strOnExtraCallback2 == null) {
                                strOnExtraCallback2 = "";
                            }
                            string = StringsKt.trimEnd("[" + i + "] " + str2 + " " + iAuthTabCallbackOnNavigationEvent2 + " " + str3 + " " + strOnExtraCallback2).toString();
                        }
                        arrayList2.add(string);
                        i++;
                        onwarmupcompleted2 = onwarmupcompleted3;
                    }
                    String strJoinToString$default = CollectionsKt.joinToString$default(arrayList2, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                    if (!z) {
                        onnavigationevent = z2 ? onNavigationEvent.ERROR : onNavigationEvent.WARN;
                    } else {
                        onnavigationevent = onNavigationEvent.DEBUG;
                    }
                    onwarmupcompleted = (onWarmupCompleted) CollectionsKt.firstOrNull(this.asInterface);
                    if (onwarmupcompleted != null || (uriOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted()) == null) {
                        Uri uriOnWarmupCompleted = Uri.EMPTY;
                    }
                    uri = uriOnWarmupCompleted;
                    Uri uriBuild = uri.buildUpon().clearQuery().build();
                    onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 835909307, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -835909307, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{this, onnavigationevent, strJoinToString$default, String.valueOf(uriBuild), TossAffiliate.CORE.getLowerCaseName(), onwarmupcompleted == null ? onwarmupcompleted.onExtraCallbackWithResult() : null});
                    Intrinsics.checkNotNull(uri);
                    if (!filterCreatePageParams.onWarmupCompleted(uri)) {
                        onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 835909307, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -835909307, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{this, onnavigationevent, strJoinToString$default, String.valueOf(uriBuild), TossAffiliate.BANK.getLowerCaseName(), onwarmupcompleted != null ? onwarmupcompleted.onExtraCallbackWithResult() : null});
                    } else if (filterCreatePageParams.IAuthTabCallbackStub(uri)) {
                        onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 835909307, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -835909307, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{this, onnavigationevent, strJoinToString$default, String.valueOf(uriBuild), TossAffiliate.SECURITIES.getLowerCaseName(), onwarmupcompleted != null ? onwarmupcompleted.onExtraCallbackWithResult() : null});
                    }
                    onExtraCallbackWithResult(this.asInterface);
                    this.asInterface.clear();
                    this.onNavigationEvent.onExtraCallbackWithResult();
                    this.onExtraCallbackWithResult = true;
                    return;
                }
                z2 = false;
                List<onWarmupCompleted> list32 = this.asInterface;
                ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list32, 10));
                int i2 = 0;
                onWarmupCompleted onwarmupcompleted22 = null;
                while (r3.hasNext()) {
                }
                String strJoinToString$default2 = CollectionsKt.joinToString$default(arrayList22, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                if (!z) {
                }
                onwarmupcompleted = (onWarmupCompleted) CollectionsKt.firstOrNull(this.asInterface);
                if (onwarmupcompleted != null) {
                    Uri uriOnWarmupCompleted2 = Uri.EMPTY;
                    uri = uriOnWarmupCompleted2;
                    Uri uriBuild2 = uri.buildUpon().clearQuery().build();
                    if (onwarmupcompleted == null) {
                    }
                    onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 835909307, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -835909307, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{this, onnavigationevent, strJoinToString$default2, String.valueOf(uriBuild2), TossAffiliate.CORE.getLowerCaseName(), onwarmupcompleted == null ? onwarmupcompleted.onExtraCallbackWithResult() : null});
                    Intrinsics.checkNotNull(uri);
                    if (!filterCreatePageParams.onWarmupCompleted(uri)) {
                    }
                    onExtraCallbackWithResult(this.asInterface);
                    this.asInterface.clear();
                    this.onNavigationEvent.onExtraCallbackWithResult();
                    this.onExtraCallbackWithResult = true;
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(List<onWarmupCompleted> list) throws Throwable {
        Object obj;
        String str;
        String str2;
        String str3;
        int i = 2 % 2;
        if (list.size() != 1) {
            int i2 = access100 + 113;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            setPreviewSize.IAuthTabCallback.onExtraCallback(false);
            return;
        }
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) CollectionsKt.first(list);
        if (onwarmupcompleted.onNavigationEvent() != IAuthTabCallback.LOAD_URL) {
            setPreviewSize.IAuthTabCallback.onExtraCallback(false);
            int i4 = access100 + 33;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        if (System.currentTimeMillis() - onwarmupcompleted.IAuthTabCallback().getTime() > 3000) {
            int i6 = access100 + 81;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 != 0) {
                onTextViewSizeChanged.onExtraCallbackWithResult.IAuthTabCallback();
                l.hashCode();
                throw null;
            }
            if (onTextViewSizeChanged.onExtraCallbackWithResult.IAuthTabCallback()) {
                setPreviewSize.IAuthTabCallback.onExtraCallback(true);
                PackageInfo packageInfoIAuthTabCallback = Cookies_set.onNavigationEvent.IAuthTabCallback(RememberLottieCompositionKtloadFontsFromAssets2.Companion.onExtraCallback());
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                String str4 = this.onExtraCallback.format(onwarmupcompleted.IAuthTabCallback());
                IAuthTabCallback iAuthTabCallbackOnNavigationEvent = onwarmupcompleted.onNavigationEvent();
                String str5 = (String) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1334309726, nSetPosition.onExtraCallbackWithResult(), -1334309720, new Object[]{onwarmupcompleted.onWarmupCompleted().toString(), 300, null, 2, null});
                String strOnExtraCallback = onwarmupcompleted.onExtraCallback();
                if (strOnExtraCallback == null) {
                    strOnExtraCallback = "";
                }
                String string = StringsKt.trimEnd(str4 + " " + iAuthTabCallbackOnNavigationEvent + " " + str5 + " " + strOnExtraCallback).toString();
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("lastFinishedUrl", IAuthTabCallback);
                String str6 = IAuthTabCallback;
                if (str6 != null) {
                    try {
                        Result.Companion companion = kotlin.Result.Companion;
                        obj = kotlin.Result.constructor-impl(Uri.parse(str6).buildUpon().clearQuery().build().toString());
                    } catch (Throwable th) {
                        Result.Companion companion2 = kotlin.Result.Companion;
                        obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                    }
                    if (kotlin.Result.onExtraCallback(obj)) {
                        obj = null;
                    }
                    str = (String) obj;
                } else {
                    str = null;
                }
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("lastFinishedUrlWithoutQueries", str);
                if (packageInfoIAuthTabCallback != null) {
                    int i7 = IAuthTabCallbackDefault + 69;
                    access100 = i7 % 128;
                    int i8 = i7 % 2;
                    str2 = packageInfoIAuthTabCallback.packageName;
                } else {
                    str2 = null;
                }
                Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("webViewPackage", str2);
                if (packageInfoIAuthTabCallback != null) {
                    int i9 = access100 + 77;
                    IAuthTabCallbackDefault = i9 % 128;
                    int i10 = i9 % 2;
                    str3 = packageInfoIAuthTabCallback.versionName;
                } else {
                    str3 = null;
                }
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "WebViewMayBeFrozen", string, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("webViewVersion", str3), getWrite.IAuthTabCallback("webViewVersionCode", packageInfoIAuthTabCallback != null ? Long.valueOf(Cookies_getFromResponse.onNavigationEvent(packageInfoIAuthTabCallback)) : null)}), (String) null, false, (String) null, 56, (Object) null);
            }
        }
        int i11 = access100 + 19;
        IAuthTabCallbackDefault = i11 % 128;
        int i12 = i11 % 2;
    }

    static final class onWarmupCompleted {
        private static int IAuthTabCallbackStub = 0;
        private static int asBinder = 1;
        private final IAuthTabCallback IAuthTabCallback;
        private final String IAuthTabCallbackDefault;
        private final boolean onExtraCallback;
        private final Uri onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final Date onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i2 = IAuthTabCallbackStub + 65;
                asBinder = i2 % 128;
                return i2 % 2 == 0;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, onwarmupcompleted.IAuthTabCallbackDefault)) {
                int i3 = asBinder + 33;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted) || this.IAuthTabCallback != onwarmupcompleted.IAuthTabCallback || !Intrinsics.areEqual(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent)) {
                return false;
            }
            if (this.onExtraCallback == onwarmupcompleted.onExtraCallback) {
                return true;
            }
            int i5 = IAuthTabCallbackStub + 11;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            String str;
            int iHashCode;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 53;
            asBinder = i2 % 128;
            int i3 = 0;
            if (i2 % 2 == 0) {
                str = this.IAuthTabCallbackDefault;
                iHashCode = 1;
                if (str != null) {
                    i3 = 1;
                    int iHashCode2 = str.hashCode();
                    int i4 = IAuthTabCallbackStub + 101;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                    iHashCode = i3;
                    i3 = iHashCode2;
                }
            } else {
                str = this.IAuthTabCallbackDefault;
                if (str == null) {
                    iHashCode = 0;
                } else {
                    int iHashCode22 = str.hashCode();
                    int i42 = IAuthTabCallbackStub + 101;
                    asBinder = i42 % 128;
                    int i52 = i42 % 2;
                    iHashCode = i3;
                    i3 = iHashCode22;
                }
            }
            int iHashCode3 = this.onWarmupCompleted.hashCode();
            int iHashCode4 = this.IAuthTabCallback.hashCode();
            int iHashCode5 = this.onExtraCallbackWithResult.hashCode();
            String str2 = this.onNavigationEvent;
            if (str2 != null) {
                iHashCode = str2.hashCode();
            }
            return (((((((((i3 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + Boolean.hashCode(this.onExtraCallback);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "WebViewState(webViewId=" + this.IAuthTabCallbackDefault + ", date=" + this.onWarmupCompleted + ", state=" + this.IAuthTabCallback + ", uri=" + this.onExtraCallbackWithResult + ", extra=" + this.onNavigationEvent + ", isErrorState=" + this.onExtraCallback + ")";
            int i2 = asBinder + 29;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onWarmupCompleted(@Nullable String str, @NotNull Date date, @NotNull IAuthTabCallback iAuthTabCallback, @NotNull Uri uri, @Nullable String str2, boolean z) {
            Intrinsics.checkNotNullParameter(date, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(uri, "");
            this.IAuthTabCallbackDefault = str;
            this.onWarmupCompleted = date;
            this.IAuthTabCallback = iAuthTabCallback;
            this.onExtraCallbackWithResult = uri;
            this.onNavigationEvent = str2;
            this.onExtraCallback = z;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asBinder + 51;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            String str = this.IAuthTabCallbackDefault;
            if (i3 != 0) {
                int i4 = 48 / 0;
            }
            return str;
        }

        public final Date IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 81;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            Date date = this.onWarmupCompleted;
            int i5 = i2 + 53;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 48 / 0;
            }
            return date;
        }

        public final IAuthTabCallback onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 85;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback iAuthTabCallback = this.IAuthTabCallback;
            int i5 = i2 + 25;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }

        public final Uri onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder + 59;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            Uri uri = this.onExtraCallbackWithResult;
            int i5 = i3 + 1;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                return uri;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 49;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onNavigationEvent;
            int i5 = i2 + 45;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 84 / 0;
            }
            return str;
        }

        public final boolean asBinder() {
            int i = 2 % 2;
            int i2 = asBinder + 89;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            boolean z = this.onExtraCallback;
            int i5 = i3 + 93;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    static {
        int i = onTransact + 17;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private final void onExtraCallback(String str, IAuthTabCallback iAuthTabCallback, Uri uri, String str2, boolean z) {
        Object[] objArr = {this, str, iAuthTabCallback, uri, str2, Boolean.valueOf(z)};
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -594968045, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, 594968047, iOnWarmupCompleted, objArr);
    }

    private final void onNavigationEvent(onNavigationEvent onnavigationevent, String str, String str2, String str3, String str4) {
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 835909307, iOnWarmupCompleted3, iOnWarmupCompleted2, -835909307, iOnWarmupCompleted, new Object[]{this, onnavigationevent, str, str2, str3, str4});
    }

    public final String IAuthTabCallback(@NotNull WebView webView) {
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        return (String) onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1324526505, iOnWarmupCompleted3, iOnWarmupCompleted2, -1324526504, iOnWarmupCompleted, new Object[]{this, webView});
    }

    public final void onNavigationEvent(@NotNull WebView webView, @NotNull String str) {
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        onWarmupCompleted(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 647608958, iOnWarmupCompleted3, iOnWarmupCompleted2, -647608955, iOnWarmupCompleted, new Object[]{this, webView, str});
    }
}
