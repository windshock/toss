package o;

import android.content.Context;
import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.crosscert.android.core.Cert;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.genSignatureValueWithDigest;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.dataprovider.scraping.ScrapingWrapper$JointCerts$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class genSignatureValueWithDigest {
    public static final genSignatureValueWithDigest onNavigationEvent = new genSignatureValueWithDigest();
    private static final Lazy onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.dataprovider.scraping.ScrapingWrapper$$ExternalSyntheticLambda0
        public final Object invoke() {
            return genSignatureValueWithDigest.onExtraCallbackWithResult();
        }
    });
    public static final int onExtraCallbackWithResult = 8;

    private genSignatureValueWithDigest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MapConverter onExtraCallback() {
        Object value = onExtraCallback.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (MapConverter) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MapConverter onExtraCallbackWithResult() {
        return clearTid.onNavigationEvent(Executors.newSingleThreadExecutor());
    }

    public static final class onExtraCallbackWithResult {
        public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

        private onExtraCallbackWithResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List onNavigationEvent() {
            return onWarmupCompleted.onWarmupCompleted();
        }

        public final writeRaw<List<RSASSAPSSparams>> IAuthTabCallback() {
            writeRaw<List<RSASSAPSSparams>> writerawOnWarmupCompleted = writeRaw.onNavigationEvent(new Callable() { // from class: viva.republica.toss.dataprovider.scraping.ScrapingWrapper$JointCerts$$ExternalSyntheticLambda2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return genSignatureValueWithDigest.onExtraCallbackWithResult.onNavigationEvent();
                }
            }).onNavigationEvent(genSignatureValueWithDigest.onNavigationEvent.onExtraCallback()).onWarmupCompleted(3L, TimeUnit.SECONDS).onWarmupCompleted(CollectionsKt.emptyList());
            Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
            return writerawOnWarmupCompleted;
        }

        private final List<RSASSAPSSparams> onWarmupCompleted() throws Throwable {
            try {
                Object[] objArr = {UserChoiceBillingListener.onExtraCallback.onExtraCallback()};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1286211244);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (28960 - Color.red(0)), 48 - View.MeasureSpec.getSize(0), KeyEvent.normalizeMetaState(0) + 22744, 2112550972, false, (String) null, new Class[]{Context.class});
                }
                Object[] objArr2 = {((Constructor) objOnExtraCallback).newInstance(objArr), false, 1, null};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-566256406);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (28960 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 48, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22744, -276864390, false, "onExtraCallbackWithResult", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (ExpandableListView.getPackedPositionGroup(0L) + 28960), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 48, 22744 - ExpandableListView.getPackedPositionGroup(0L)), Boolean.TYPE, Integer.TYPE, Object.class});
                }
                Iterable iterable = (Iterable) ((Method) objOnExtraCallback2).invoke(null, objArr2);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(getBagId.onExtraCallbackWithResult((Cert) it.next()));
                }
                return arrayList;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ writeRaw onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, boolean z, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            return onextracallbackwithresult.onExtraCallback(z, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List onWarmupCompleted(Function1 function1, Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (List) function1.invoke(obj);
        }

        public final writeRaw<List<RSASSAPSSparams>> onExtraCallback(boolean z, @Nullable Function1<? super RSASSAPSSparams, Boolean> function1) {
            writeRaw<List<RSASSAPSSparams>> writerawOnWarmupCompleted = IAuthTabCallback().onWarmupCompleted(new ScrapingWrapper$JointCerts$.ExternalSyntheticLambda1(new ScrapingWrapper$JointCerts$.ExternalSyntheticLambda0(function1, z)));
            Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
            return writerawOnWarmupCompleted;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List onNavigationEvent(Function1 function1, boolean z, List list) {
            Intrinsics.checkNotNullParameter(list, "");
            if (function1 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((Boolean) function1.invoke((RSASSAPSSparams) obj)).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                list = arrayList;
            }
            if (!z) {
                return list;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (SafeBag.onExtraCallbackWithResult.onExtraCallbackWithResult((RSASSAPSSparams) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }
    }
}
