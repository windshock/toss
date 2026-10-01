package o;

import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.webkit.URLUtil;
import com.google.gson.JsonParseException;
import im.toss.deeplink.QueryParameterParser;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.JsonReaderErrorInfo;
import o.getReactQueueConfiguration;
import o.processTransparent;
import o.trackEventSynchronously;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class processTransparent {
    private static final Set<String> IAuthTabCallback = new LinkedHashSet();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ JsonReaderErrorInfo onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(function1, obj);
        }
        onExtraCallbackWithResult(function1, obj);
        throw null;
    }

    public static /* synthetic */ getReactQueueConfiguration onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
            return (getReactQueueConfiguration) onExtraCallbackWithResult(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{th}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, 1469458113, -1469458112);
        }
        int iOnExtraCallbackWithResult4 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i4) | i5);
        int i8 = (~((~i5) | (~i6))) | i7;
        int i9 = i5 | i6;
        int i10 = i5 + i6 + i2 + ((-39394691) * i3) + ((-2104995841) * i);
        int i11 = i10 * i10;
        int i12 = (i5 * (-1880913482)) + 198443008 + ((-1880913482) * i6) + ((-1126725195) * i7) + (i8 * 1126725195) + (1126725195 * i9) + ((-754188288) * i2) + ((-1529085952) * i3) + ((-319553536) * i) + ((-289079296) * i11);
        int i13 = ((i5 * 1773844906) - 1404835566) + (i6 * 1773844906) + (i7 * (-613)) + (i8 * 613) + (i9 * 613) + (i2 * 1773845519) + (i3 * 1055723859) + (i * 1996616689) + (i11 * (-1450508288));
        return i12 + ((i13 * i13) * (-778371072)) != 1 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Uri uri, trackEventSynchronously trackeventsynchronously) throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(uri, trackeventsynchronously);
        int i4 = onExtraCallback + 107;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ JsonReaderErrorInfo onExtraCallbackWithResult(String str, Uri uri, getReactQueueConfiguration getreactqueueconfiguration) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        JsonReaderErrorInfo jsonReaderErrorInfoOnNavigationEvent = onNavigationEvent(str, uri, getreactqueueconfiguration);
        int i4 = onExtraCallback + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return jsonReaderErrorInfoOnNavigationEvent;
    }

    static {
        int i = onExtraCallbackWithResult + 19;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult<Upstream, Downstream> implements deserializeUri {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public onExtraCallbackWithResult(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.IAuthTabCallback = mapConverter2;
        }

        public final deserializeIp<getReactQueueConfiguration> apply(writeRaw<BaseApiResponse<getReactQueueConfiguration>> writeraw) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(writeraw, "");
            final AnonymousClass1 anonymousClass1 = new Function1<BaseApiResponse<getReactQueueConfiguration>, deserializeIp<? extends getReactQueueConfiguration>>() { // from class: o.processTransparent.onExtraCallbackWithResult.1
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;
                private static int onWarmupCompleted;

                static {
                    int i2 = onWarmupCompleted + 31;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                }

                public /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InstantiationException {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 39;
                    onNavigationEvent = i3 % 128;
                    BaseApiResponse<getReactQueueConfiguration> baseApiResponse = (BaseApiResponse) obj;
                    if (i3 % 2 != 0) {
                        onWarmupCompleted(baseApiResponse);
                        throw null;
                    }
                    deserializeIp<? extends getReactQueueConfiguration> deserializeipOnWarmupCompleted = onWarmupCompleted(baseApiResponse);
                    int i4 = onNavigationEvent + 77;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return deserializeipOnWarmupCompleted;
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
                
                    if (r12 != null) goto L16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:11:0x006e, code lost:
                
                    r12 = o.processTransparent.onExtraCallbackWithResult.AnonymousClass1.IAuthTabCallback + 13;
                    o.processTransparent.onExtraCallbackWithResult.AnonymousClass1.onNavigationEvent = r12 % 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0077, code lost:
                
                    if ((r12 % 2) != 0) goto L14;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0079, code lost:
                
                    r12 = o.getReactQueueConfiguration.class.newInstance();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
                
                    o.getReactQueueConfiguration.class.newInstance();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0085, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x008a, code lost:
                
                    return o.writeRaw.onExtraCallback(r12);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
                
                    r1 = r12.extraCallbackWithResult();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
                
                    if (r1 != null) goto L25;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
                
                    r1 = o.processTransparent.onExtraCallbackWithResult.AnonymousClass1.onNavigationEvent + 51;
                    o.processTransparent.onExtraCallbackWithResult.AnonymousClass1.IAuthTabCallback = r1 % 128;
                    r1 = r1 % 2;
                    r0 = im.toss.network.throwable.TossApiCallException.ApiError.Companion;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
                
                    if (r1 == 0) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x009e, code lost:
                
                    r1 = r0.onExtraCallbackWithResult(r12);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
                
                    r0.onExtraCallbackWithResult(r12);
                    r3.hashCode();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x00ae, code lost:
                
                    return o.writeRaw.onExtraCallbackWithResult(r1);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x003c, code lost:
                
                    if (((java.lang.Boolean) im.toss.network.model.BaseApiResponse.onExtraCallbackWithResult(new java.lang.Object[]{r12}, r5, 812271550, im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), r10)).booleanValue() != false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:8:0x0066, code lost:
                
                    if (((java.lang.Boolean) im.toss.network.model.BaseApiResponse.onExtraCallbackWithResult(new java.lang.Object[]{r12}, r5, 812271550, im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), r10)).booleanValue() != false) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:9:0x0068, code lost:
                
                    r12 = r12.onTransact();
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final deserializeIp<? extends getReactQueueConfiguration> onWarmupCompleted(BaseApiResponse<getReactQueueConfiguration> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 101;
                    onNavigationEvent = i3 % 128;
                    Object obj = null;
                    if (i3 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(baseApiResponse, "");
                        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                        int i4 = 95 / 0;
                    } else {
                        Intrinsics.checkNotNullParameter(baseApiResponse, "");
                        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                        int iIAuthTabCallback4 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    }
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass1) { // from class: o.UtilsKtExternalSyntheticLambda17$onExtraCallbackWithResult
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;
                private final /* synthetic */ Function1 onWarmupCompleted;

                {
                    Intrinsics.checkNotNullParameter(anonymousClass1, "");
                    this.onWarmupCompleted = anonymousClass1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 17;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Object objInvoke = this.onWarmupCompleted.invoke(obj);
                    int i5 = onExtraCallback + 57;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 10 / 0;
                    }
                    return objInvoke;
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallbackWithResult;
            if (mapConverter != null) {
                int i2 = onWarmupCompleted + 13;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter), "");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.IAuthTabCallback;
            if (mapConverter2 != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            int i3 = onNavigationEvent + 93;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return writerawOnExtraCallbackWithResult;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getReactQueueConfiguration getreactqueueconfiguration;
        TossApiCallException.HttpError httpError = (Throwable) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(httpError, "");
        if ((httpError instanceof JsonParseException) || (httpError instanceof TossApiCallException.ApiError)) {
            getreactqueueconfiguration = new getReactQueueConfiguration(true);
        } else if (!(httpError instanceof TossApiCallException.HttpError)) {
            getreactqueueconfiguration = new getReactQueueConfiguration(false);
            int i2 = onExtraCallback + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = onExtraCallback + 97;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int iIAuthTabCallbackDefault = httpError.IAuthTabCallbackDefault();
            getreactqueueconfiguration = (400 > iIAuthTabCallbackDefault || iIAuthTabCallbackDefault >= 504) ? new getReactQueueConfiguration(false) : new getReactQueueConfiguration(true);
        }
        getreactqueueconfiguration.onNavigationEvent(true);
        return getreactqueueconfiguration;
    }

    private static final JsonReaderErrorInfo onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        JsonReaderErrorInfo jsonReaderErrorInfo = (JsonReaderErrorInfo) function1.invoke(obj);
        int i3 = onExtraCallback + 77;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 97 / 0;
        }
        return jsonReaderErrorInfo;
    }

    public static final wasLastName onExtraCallbackWithResult(@NotNull final Uri uri) {
        final String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        if (uri.getPort() == -1) {
            str = uri.getScheme() + "://" + uri.getHost();
            int i2 = onWarmupCompleted + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        } else {
            str = uri.getScheme() + "://" + uri.getHost() + ":" + uri.getPort();
        }
        Object obj = null;
        if (zzaj.onNavigationEvent().AudioAttributesImplBaseParcelizer() && filterCreatePageParams.onNavigationEvent(uri)) {
            wasLastName waslastnameOnNavigationEvent = wasLastName.onNavigationEvent(new SecurityException("Cannot verify this url : TossCore BugBounty Mode Enabled."));
            Intrinsics.checkNotNullExpressionValue(waslastnameOnNavigationEvent, "");
            int i4 = onExtraCallback + 37;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return waslastnameOnNavigationEvent;
            }
            obj.hashCode();
            throw null;
        }
        if (enableModuleArgumentNSNullConversionIOS.asInterface.IAuthTabCallbackDefault(str)) {
            wasLastName waslastnameIAuthTabCallback = wasLastName.IAuthTabCallback();
            Intrinsics.checkNotNullExpressionValue(waslastnameIAuthTabCallback, "");
            return waslastnameIAuthTabCallback;
        }
        if (URLUtil.isNetworkUrl(str) && filterCreatePageParams.onTransact(uri)) {
            wasLastName waslastnameIAuthTabCallback2 = wasLastName.IAuthTabCallback();
            Intrinsics.checkNotNullExpressionValue(waslastnameIAuthTabCallback2, "");
            return waslastnameIAuthTabCallback2;
        }
        if (Intrinsics.areEqual(uri.toString(), "about:blank")) {
            int i5 = onExtraCallback + 49;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                wasLastName waslastnameIAuthTabCallback3 = wasLastName.IAuthTabCallback();
                Intrinsics.checkNotNullExpressionValue(waslastnameIAuthTabCallback3, "");
                return waslastnameIAuthTabCallback3;
            }
            Intrinsics.checkNotNullExpressionValue(wasLastName.IAuthTabCallback(), "");
            obj.hashCode();
            throw null;
        }
        if (IAuthTabCallback.contains(str)) {
            wasLastName waslastnameIAuthTabCallback4 = wasLastName.IAuthTabCallback();
            Intrinsics.checkNotNullExpressionValue(waslastnameIAuthTabCallback4, "");
            return waslastnameIAuthTabCallback4;
        }
        shouldAutoplay shouldautoplayNewSessionWithExtras = AdSettingsIntegrationErrorMode.onNavigationEvent.newSessionWithExtras();
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        writeRaw writerawIAuthTabCallback = shouldautoplayNewSessionWithExtras.IAuthTabCallback(new getRuntimeScheduler(string, false, 2, (DefaultConstructorMarker) null));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new onExtraCallbackWithResult(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
        writeRaw writerawAsInterface = writerawIAuthTabCallback2.asInterface(new deserializeIntNullableCollection() { // from class: im.toss.extensions.UrisKt$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object apply(Object obj2) {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 83;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                getReactQueueConfiguration getreactqueueconfigurationOnExtraCallback = processTransparent.onExtraCallback((Throwable) obj2);
                int i9 = onNavigationEvent + 101;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 88 / 0;
                }
                return getreactqueueconfigurationOnExtraCallback;
            }
        });
        final Function1 function1 = new Function1() { // from class: im.toss.extensions.UrisKt$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj2) {
                int i6 = 2 % 2;
                int i7 = onExtraCallbackWithResult + 71;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                JsonReaderErrorInfo jsonReaderErrorInfoOnExtraCallbackWithResult = processTransparent.onExtraCallbackWithResult(str, uri, (getReactQueueConfiguration) obj2);
                int i9 = onWarmupCompleted + 63;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 == 0) {
                    return jsonReaderErrorInfoOnExtraCallbackWithResult;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        };
        wasLastName waslastnameOnNavigationEvent2 = writerawAsInterface.onNavigationEvent(new deserializeIntNullableCollection() { // from class: im.toss.extensions.UrisKt$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object apply(Object obj2) {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 61;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    processTransparent.onExtraCallback(function1, obj2);
                    throw null;
                }
                JsonReaderErrorInfo jsonReaderErrorInfoOnExtraCallback = processTransparent.onExtraCallback(function1, obj2);
                int i8 = IAuthTabCallback + 29;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return jsonReaderErrorInfoOnExtraCallback;
            }
        });
        Intrinsics.checkNotNullExpressionValue(waslastnameOnNavigationEvent2, "");
        int i6 = onExtraCallback + 103;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return waslastnameOnNavigationEvent2;
    }

    private static final Unit onExtraCallback(Uri uri, trackEventSynchronously trackeventsynchronously) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(trackeventsynchronously, "");
        trackeventsynchronously.onExtraCallbackWithResult(EventServiceImplExternalSyntheticLambda0.IMPORTANT);
        trackeventsynchronously.onExtraCallbackWithResult("(DEBUG) 검증되지 않은 URL 입니다.");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "라이브에서 해당 URL이 오픈되어야 한다면").append('\n');
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "#deeplink-allowlist-request");
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) " 채널에 요청해주세요.").append('\n');
        spannableStringBuilder.append((CharSequence) ("• URL: " + uri));
        trackEventSynchronously.onExtraCallbackWithResult(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1173521210, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1173521212, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), new Object[]{trackeventsynchronously, new SpannedString(spannableStringBuilder)}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final JsonReaderErrorInfo onNavigationEvent(String str, final Uri uri, getReactQueueConfiguration getreactqueueconfiguration) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getreactqueueconfiguration, "");
        if (getreactqueueconfiguration.onWarmupCompleted()) {
            if (!getreactqueueconfiguration.onNavigationEvent()) {
                IAuthTabCallback.add(str);
                int i2 = onExtraCallback + 5;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
            }
            return wasLastName.IAuthTabCallback();
        }
        if (!zzaj.onNavigationEvent().onActivityLayout() && !zzaj.onNavigationEvent().RemoteActionCompatParcelizer()) {
            wasLastName waslastnameOnNavigationEvent = wasLastName.onNavigationEvent(new SecurityException());
            int i4 = onWarmupCompleted + 41;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return waslastnameOnNavigationEvent;
        }
        trackCheckout.IAuthTabCallback(trackCheckout.Companion.onNavigationEvent(), "NOT_VERIFIED_URL", 0, new Function1() { // from class: im.toss.extensions.UrisKt$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) throws IOException {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 27;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                Unit unitOnExtraCallbackWithResult = processTransparent.onExtraCallbackWithResult(uri, (trackEventSynchronously) obj);
                int i9 = onWarmupCompleted + 93;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, 2, (Object) null);
        wasLastName waslastnameIAuthTabCallback = wasLastName.IAuthTabCallback();
        int i6 = onWarmupCompleted + 5;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return waslastnameIAuthTabCallback;
    }

    public static final String onWarmupCompleted(@NotNull Uri uri, @NotNull Uri uri2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(uri2, "");
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
        Set<String> set = queryParameterNames;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        int i2 = onExtraCallback + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 % 5;
        }
        for (String str : set) {
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter == null) {
                int i4 = onWarmupCompleted + 85;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                queryParameter = "";
            }
            arrayList.add(new Pair(str, queryParameter));
            int i5 = onExtraCallback + 113;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        String strOnNavigationEvent = filterCreatePageParams.onNavigationEvent(uri2, (Pair<String, String>[]) Arrays.copyOf(pairArr, pairArr.length));
        int i7 = onWarmupCompleted + 53;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return strOnNavigationEvent;
    }

    public static final Bundle IAuthTabCallback(@NotNull Uri uri) throws EOFException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        Bundle bundle = new Bundle();
        QueryParameterParser queryParameterParser = QueryParameterParser.parse(string);
        Set<String> setQueryParameterNames = queryParameterParser.queryParameterNames();
        Intrinsics.checkNotNullExpressionValue(setQueryParameterNames, "");
        for (String str : setQueryParameterNames) {
            List<String> listQueryParameterValues = queryParameterParser.queryParameterValues(str);
            Intrinsics.checkNotNullExpressionValue(listQueryParameterValues, "");
            Iterator<T> it = listQueryParameterValues.iterator();
            int i2 = onExtraCallback + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            while (it.hasNext()) {
                int i4 = onWarmupCompleted + 29;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    bundle.putString(str, (String) it.next());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                bundle.putString(str, (String) it.next());
            }
        }
        return bundle;
    }

    public static final String onExtraCallback(@NotNull Uri uri) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        String str = uri.getScheme() + "://" + uri.getHost() + uri.getPath();
        int i2 = onWarmupCompleted + 113;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Uri uri = (Uri) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(uri, "");
            Intrinsics.checkNotNullExpressionValue(uri.buildUpon().clearQuery().build(), "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(uri, "");
        Uri uriBuild = uri.buildUpon().clearQuery().build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "");
        int i3 = onWarmupCompleted + 51;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return uriBuild;
    }

    public static final boolean onWarmupCompleted(@Nullable Uri uri) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (uri == null || Intrinsics.areEqual(uri, Uri.EMPTY)) {
            return true;
        }
        int i3 = onWarmupCompleted + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    private static final getReactQueueConfiguration IAuthTabCallback(Throwable th) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (getReactQueueConfiguration) onExtraCallbackWithResult(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{th}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, 1469458113, -1469458112);
    }

    public static final Uri onNavigationEvent(@NotNull Uri uri) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Uri) onExtraCallbackWithResult(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{uri}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, 742938224, -742938224);
    }
}
